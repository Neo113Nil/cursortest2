package io.sentry.android.core.internal.threaddump;

import io.sentry.SentryLevel;
import io.sentry.SentryLockReason;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class ThreadDumpParser {
    private final boolean isBackground;
    private final SentryOptions options;
    private final SentryStackTraceFactory stackTraceFactory;
    private static final Pattern BEGIN_MANAGED_THREAD_RE = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    private static final Pattern BEGIN_UNMANAGED_NATIVE_THREAD_RE = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    private static final Pattern NATIVE_RE = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    private static final Pattern JAVA_RE = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    private static final Pattern JNI_RE = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    private static final Pattern LOCKED_RE = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern SLEEPING_ON_RE = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_ON_RE = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_TO_LOCK_RE = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    private static final Pattern WAITING_TO_LOCK_HELD_RE = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    private static final Pattern WAITING_TO_LOCK_UNKNOWN_RE = Pattern.compile(" *- waiting to lock an unknown object");
    private static final Pattern BLANK_RE = Pattern.compile("\\s+");
    private final Map<String, DebugImage> debugImages = new HashMap();
    private final List<SentryThread> threads = new ArrayList();

    public ThreadDumpParser(SentryOptions sentryOptions, boolean z4) {
        this.options = sentryOptions;
        this.isBackground = z4;
        this.stackTraceFactory = new SentryStackTraceFactory(sentryOptions);
    }

    private static String buildIdToDebugId(String str) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(new BigInteger("10" + str, 16).toByteArray());
            wrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(wrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(wrap.getShort()), Short.valueOf(wrap.getShort()), Short.valueOf(wrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(wrap.getShort()), Integer.valueOf(wrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    private void combineThreadLocks(SentryThread sentryThread, SentryLockReason sentryLockReason) {
        Map<String, SentryLockReason> heldLocks = sentryThread.getHeldLocks();
        if (heldLocks == null) {
            heldLocks = new HashMap<>();
        }
        SentryLockReason sentryLockReason2 = heldLocks.get(sentryLockReason.getAddress());
        if (sentryLockReason2 != null) {
            sentryLockReason2.setType(Math.max(sentryLockReason2.getType(), sentryLockReason.getType()));
        } else {
            heldLocks.put(sentryLockReason.getAddress(), new SentryLockReason(sentryLockReason));
        }
        sentryThread.setHeldLocks(heldLocks);
    }

    private Integer getInteger(Matcher matcher, int i7, Integer num) {
        String group = matcher.group(i7);
        return (group == null || group.length() == 0) ? num : Integer.valueOf(Integer.parseInt(group));
    }

    private Long getLong(Matcher matcher, int i7, Long l7) {
        String group = matcher.group(i7);
        return (group == null || group.length() == 0) ? l7 : Long.valueOf(Long.parseLong(group));
    }

    private Integer getUInteger(Matcher matcher, int i7, Integer num) {
        String group = matcher.group(i7);
        if (group == null || group.length() == 0) {
            return num;
        }
        int parseInt = Integer.parseInt(group);
        return parseInt >= 0 ? Integer.valueOf(parseInt) : num;
    }

    private boolean matches(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c9, code lost:
    
        r12 = new io.sentry.protocol.SentryStackFrame();
        r12.setPackage(r3.group(3));
        r12.setFunction(r3.group(6));
        r12.setLineno(getInteger(r3, 7, null));
        r12.setInstructionAddr("0x" + r3.group(2));
        r12.setPlatform(io.sentry.protocol.SentryStackFrame.JsonKeys.NATIVE);
        r4 = r3.group(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0108, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010e, code lost:
    
        if (r13 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        if (r18.debugImages.containsKey(r13) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0118, code lost:
    
        r14 = new io.sentry.protocol.DebugImage();
        r14.setDebugId(r13);
        r14.setType("elf");
        r14.setCodeFile(r3.group(4));
        r14.setCodeId(r4);
        r18.debugImages.put(r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0135, code lost:
    
        r12.setAddrMode("rel:".concat(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010a, code lost:
    
        r13 = buildIdToDebugId(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SentryStackTrace parseStacktrace(Lines lines, SentryThread sentryThread) {
        Matcher matcher;
        Matcher matcher2;
        SentryStackFrame sentryStackFrame;
        ArrayList arrayList = new ArrayList();
        Matcher matcher3 = NATIVE_RE.matcher("");
        Matcher matcher4 = JAVA_RE.matcher("");
        Matcher matcher5 = JNI_RE.matcher("");
        Matcher matcher6 = LOCKED_RE.matcher("");
        Matcher matcher7 = WAITING_ON_RE.matcher("");
        Matcher matcher8 = SLEEPING_ON_RE.matcher("");
        Matcher matcher9 = WAITING_TO_LOCK_HELD_RE.matcher("");
        Matcher matcher10 = WAITING_TO_LOCK_RE.matcher("");
        Matcher matcher11 = WAITING_TO_LOCK_UNKNOWN_RE.matcher("");
        Matcher matcher12 = BLANK_RE.matcher("");
        loop0: while (true) {
            SentryStackFrame sentryStackFrame2 = null;
            while (true) {
                if (!lines.hasNext()) {
                    break loop0;
                }
                Line next = lines.next();
                if (next == null) {
                    this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                    break loop0;
                }
                String str = next.text;
                matcher = matcher12;
                if (matches(matcher4, str)) {
                    sentryStackFrame2 = new SentryStackFrame();
                    matcher2 = matcher11;
                    String str2 = matcher4.group(1) + "." + matcher4.group(2);
                    sentryStackFrame2.setModule(str2);
                    sentryStackFrame2.setFunction(matcher4.group(3));
                    sentryStackFrame2.setFilename(matcher4.group(4));
                    sentryStackFrame2.setLineno(getUInteger(matcher4, 5, null));
                    sentryStackFrame2.setInApp(this.stackTraceFactory.isInApp(str2));
                    arrayList.add(sentryStackFrame2);
                } else {
                    matcher2 = matcher11;
                    if (matches(matcher3, str)) {
                        break;
                    }
                    if (matches(matcher5, str)) {
                        sentryStackFrame2 = new SentryStackFrame();
                        String str3 = matcher5.group(1) + "." + matcher5.group(2);
                        sentryStackFrame2.setModule(str3);
                        sentryStackFrame2.setFunction(matcher5.group(3));
                        sentryStackFrame2.setInApp(this.stackTraceFactory.isInApp(str3));
                        sentryStackFrame2.setNative(Boolean.TRUE);
                        arrayList.add(sentryStackFrame2);
                    } else if (matches(matcher6, str)) {
                        if (sentryStackFrame2 != null) {
                            SentryLockReason sentryLockReason = new SentryLockReason();
                            sentryLockReason.setType(1);
                            sentryLockReason.setAddress(matcher6.group(1));
                            sentryLockReason.setPackageName(matcher6.group(2));
                            sentryLockReason.setClassName(matcher6.group(3));
                            sentryStackFrame2.setLock(sentryLockReason);
                            combineThreadLocks(sentryThread, sentryLockReason);
                        }
                    } else if (matches(matcher7, str)) {
                        if (sentryStackFrame2 != null) {
                            SentryLockReason sentryLockReason2 = new SentryLockReason();
                            sentryLockReason2.setType(2);
                            sentryLockReason2.setAddress(matcher7.group(1));
                            sentryLockReason2.setPackageName(matcher7.group(2));
                            sentryLockReason2.setClassName(matcher7.group(3));
                            sentryStackFrame2.setLock(sentryLockReason2);
                            combineThreadLocks(sentryThread, sentryLockReason2);
                        }
                    } else if (!matches(matcher8, str)) {
                        if (!matches(matcher9, str)) {
                            if (!matches(matcher10, str)) {
                                matcher11 = matcher2;
                                if (!matches(matcher11, str)) {
                                    if (str.length() == 0) {
                                        break loop0;
                                    }
                                    matcher12 = matcher;
                                    if (matches(matcher12, str)) {
                                        break loop0;
                                    }
                                } else {
                                    if (sentryStackFrame2 != null) {
                                        SentryLockReason sentryLockReason3 = new SentryLockReason();
                                        sentryLockReason3.setType(8);
                                        sentryStackFrame2.setLock(sentryLockReason3);
                                        combineThreadLocks(sentryThread, sentryLockReason3);
                                    }
                                    matcher12 = matcher;
                                }
                            } else if (sentryStackFrame2 != null) {
                                SentryLockReason sentryLockReason4 = new SentryLockReason();
                                sentryLockReason4.setType(8);
                                sentryLockReason4.setAddress(matcher10.group(1));
                                sentryLockReason4.setPackageName(matcher10.group(2));
                                sentryLockReason4.setClassName(matcher10.group(3));
                                sentryStackFrame2.setLock(sentryLockReason4);
                                combineThreadLocks(sentryThread, sentryLockReason4);
                            }
                        } else if (sentryStackFrame2 != null) {
                            SentryLockReason sentryLockReason5 = new SentryLockReason();
                            sentryLockReason5.setType(8);
                            sentryLockReason5.setAddress(matcher9.group(1));
                            sentryLockReason5.setPackageName(matcher9.group(2));
                            sentryLockReason5.setClassName(matcher9.group(3));
                            sentryLockReason5.setThreadId(getLong(matcher9, 4, null));
                            sentryStackFrame2.setLock(sentryLockReason5);
                            combineThreadLocks(sentryThread, sentryLockReason5);
                        }
                        matcher11 = matcher2;
                        matcher12 = matcher;
                    } else if (sentryStackFrame2 != null) {
                        SentryLockReason sentryLockReason6 = new SentryLockReason();
                        sentryLockReason6.setType(4);
                        sentryLockReason6.setAddress(matcher8.group(1));
                        sentryLockReason6.setPackageName(matcher8.group(2));
                        sentryLockReason6.setClassName(matcher8.group(3));
                        sentryStackFrame2.setLock(sentryLockReason6);
                        combineThreadLocks(sentryThread, sentryLockReason6);
                    }
                }
                matcher11 = matcher2;
                matcher12 = matcher;
            }
            arrayList.add(sentryStackFrame);
            matcher11 = matcher2;
            matcher12 = matcher;
        }
        Collections.reverse(arrayList);
        SentryStackTrace sentryStackTrace = new SentryStackTrace(arrayList);
        sentryStackTrace.setSnapshot(Boolean.TRUE);
        return sentryStackTrace;
    }

    private SentryThread parseThread(Lines lines) {
        SentryThread sentryThread = new SentryThread();
        Matcher matcher = BEGIN_MANAGED_THREAD_RE.matcher("");
        Matcher matcher2 = BEGIN_UNMANAGED_NATIVE_THREAD_RE.matcher("");
        if (!lines.hasNext()) {
            return null;
        }
        Line next = lines.next();
        boolean z4 = false;
        if (next == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (matches(matcher, next.text)) {
            Long l7 = getLong(matcher, 4, null);
            if (l7 == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            sentryThread.setId(l7);
            sentryThread.setName(matcher.group(1));
            String group = matcher.group(5);
            if (group != null) {
                if (group.contains(" ")) {
                    sentryThread.setState(group.substring(0, group.indexOf(32)));
                } else {
                    sentryThread.setState(group);
                }
            }
        } else if (matches(matcher2, next.text)) {
            Long l8 = getLong(matcher2, 3, null);
            if (l8 == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            sentryThread.setId(l8);
            sentryThread.setName(matcher2.group(1));
        }
        String name = sentryThread.getName();
        if (name != null) {
            boolean equals = name.equals(SentryThread.JsonKeys.MAIN);
            sentryThread.setMain(Boolean.valueOf(equals));
            sentryThread.setCrashed(Boolean.valueOf(equals));
            if (equals && !this.isBackground) {
                z4 = true;
            }
            sentryThread.setCurrent(Boolean.valueOf(z4));
        }
        sentryThread.setStacktrace(parseStacktrace(lines, sentryThread));
        return sentryThread;
    }

    public List<DebugImage> getDebugImages() {
        return new ArrayList(this.debugImages.values());
    }

    public List<SentryThread> getThreads() {
        return this.threads;
    }

    public void parse(Lines lines) {
        Matcher matcher = BEGIN_MANAGED_THREAD_RE.matcher("");
        Matcher matcher2 = BEGIN_UNMANAGED_NATIVE_THREAD_RE.matcher("");
        while (lines.hasNext()) {
            Line next = lines.next();
            if (next == null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str = next.text;
            if (matches(matcher, str) || matches(matcher2, str)) {
                lines.rewind();
                SentryThread parseThread = parseThread(lines);
                if (parseThread != null) {
                    this.threads.add(parseThread);
                }
            }
        }
    }
}
