package io.sentry.android.replay;

import C6.o;
import Y4.D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.internal.ads.zzbbd;
import f6.InterfaceC1109b;
import g6.AbstractC1159h;
import g6.AbstractC1160i;
import g6.AbstractC1165n;
import g6.C1167p;
import io.sentry.DateUtils;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ReplayRecording;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.video.MuxerConfig;
import io.sentry.android.replay.video.SimpleVideoEncoder;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.FileUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import p3.f;
import p6.AbstractC1539a;
import p6.c;
import t6.e;
import t6.h;
import t6.p;
import z6.g;
import z6.i;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ReplayCache implements Closeable {
    public static final String ONGOING_SEGMENT = ".ongoing_segment";
    public static final String SEGMENT_KEY_BIT_RATE = "config.bit-rate";
    public static final String SEGMENT_KEY_FRAME_RATE = "config.frame-rate";
    public static final String SEGMENT_KEY_HEIGHT = "config.height";
    public static final String SEGMENT_KEY_ID = "segment.id";
    public static final String SEGMENT_KEY_REPLAY_ID = "replay.id";
    public static final String SEGMENT_KEY_REPLAY_RECORDING = "replay.recording";
    public static final String SEGMENT_KEY_REPLAY_SCREEN_AT_START = "replay.screen-at-start";
    public static final String SEGMENT_KEY_REPLAY_TYPE = "replay.type";
    public static final String SEGMENT_KEY_TIMESTAMP = "segment.timestamp";
    public static final String SEGMENT_KEY_WIDTH = "config.width";
    private SimpleVideoEncoder encoder;
    private final AutoClosableReentrantLock encoderLock;
    private final List<ReplayFrame> frames;
    private final AtomicBoolean isClosed;
    private final AutoClosableReentrantLock lock;
    private final LinkedHashMap<String, String> ongoingSegment;
    private final InterfaceC1109b ongoingSegmentFile$delegate;
    private final SentryOptions options;
    private final InterfaceC1109b replayCacheDir$delegate;
    private final SentryId replayId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean fromDisk$lambda$3(ReplayCache replayCache, File file, String str) {
            h.e(replayCache, "$cache");
            h.d(str, "name");
            if (str.endsWith(".jpg")) {
                File file2 = new File(file, str);
                String name = file2.getName();
                h.d(name, "getName(...)");
                int r02 = (6 & 2) != 0 ? o.r0(name) : 0;
                h.e(name, "<this>");
                h.e(".", "string");
                int lastIndexOf = name.lastIndexOf(".", r02);
                if (lastIndexOf != -1) {
                    name = name.substring(0, lastIndexOf);
                    h.d(name, "substring(...)");
                }
                Long F02 = o.F0(name);
                if (F02 != null) {
                    ReplayCache.addFrame$default(replayCache, file2, F02.longValue(), null, 4, null);
                }
            }
            return false;
        }

        public static /* synthetic */ LastSegmentData fromDisk$sentry_android_replay_release$default(Companion companion, SentryOptions sentryOptions, SentryId sentryId, Function1 function1, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                function1 = null;
            }
            return companion.fromDisk$sentry_android_replay_release(sentryOptions, sentryId, function1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:78:0x020b, code lost:
        
            if (r7 != null) goto L94;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final LastSegmentData fromDisk$sentry_android_replay_release(SentryOptions sentryOptions, SentryId sentryId, Function1 function1) {
            Date date;
            SentryReplayEvent.ReplayType replayType;
            final ReplayCache replayCache;
            String str = "";
            h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
            h.e(sentryId, "replayId");
            File makeReplayCacheDir = makeReplayCacheDir(sentryOptions, sentryId);
            File file = new File(makeReplayCacheDir, ReplayCache.ONGOING_SEGMENT);
            Iterable iterable = null;
            if (!file.exists()) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "No ongoing segment found for replay: %s", sentryId);
                FileUtils.deleteRecursively(makeReplayCacheDir);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), C6.a.f1581a), 8192);
            try {
                Iterator it = new B6.a(new B6.e(bufferedReader, 3)).iterator();
                while (it.hasNext()) {
                    List A02 = o.A0((String) it.next(), new String[]{"="});
                    linkedHashMap.put((String) A02.get(0), (String) A02.get(1));
                }
                AbstractC1539a.e(bufferedReader, null);
                String str2 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_HEIGHT);
                Integer E02 = str2 != null ? o.E0(str2) : null;
                String str3 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_WIDTH);
                Integer E03 = str3 != null ? o.E0(str3) : null;
                String str4 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_FRAME_RATE);
                Integer E04 = str4 != null ? o.E0(str4) : null;
                String str5 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_BIT_RATE);
                Integer E05 = str5 != null ? o.E0(str5) : null;
                String str6 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_ID);
                Integer E06 = str6 != null ? o.E0(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_TIMESTAMP);
                    if (str7 == null) {
                        str7 = "";
                    }
                    date = DateUtils.getDateTime(str7);
                } catch (Throwable unused) {
                    date = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_TYPE);
                    if (str8 != null) {
                        str = str8;
                    }
                    replayType = SentryReplayEvent.ReplayType.valueOf(str);
                } catch (Throwable unused2) {
                    replayType = null;
                }
                if (E02 == null || E03 == null || E04 == null || E05 == null || E06 == null || E06.intValue() == -1 || date == null || replayType == null) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", sentryId);
                    FileUtils.deleteRecursively(makeReplayCacheDir);
                    return null;
                }
                ScreenshotRecorderConfig screenshotRecorderConfig = new ScreenshotRecorderConfig(E03.intValue(), E02.intValue(), 1.0f, 1.0f, E04.intValue(), E05.intValue());
                if (function1 == null || (replayCache = (ReplayCache) function1.invoke(sentryId)) == null) {
                    replayCache = new ReplayCache(sentryOptions, sentryId);
                }
                File replayCacheDir$sentry_android_replay_release = replayCache.getReplayCacheDir$sentry_android_replay_release();
                if (replayCacheDir$sentry_android_replay_release != null) {
                    replayCacheDir$sentry_android_replay_release.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.a
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file2, String str9) {
                            boolean fromDisk$lambda$3;
                            fromDisk$lambda$3 = ReplayCache.Companion.fromDisk$lambda$3(ReplayCache.this, file2, str9);
                            return fromDisk$lambda$3;
                        }
                    });
                }
                if (replayCache.getFrames$sentry_android_replay_release().isEmpty()) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "No frames found for replay: %s, deleting the replay", sentryId);
                    FileUtils.deleteRecursively(makeReplayCacheDir);
                    return null;
                }
                List<ReplayFrame> frames$sentry_android_replay_release = replayCache.getFrames$sentry_android_replay_release();
                if (frames$sentry_android_replay_release.size() > 1) {
                    Comparator comparator = new Comparator() { // from class: io.sentry.android.replay.ReplayCache$Companion$fromDisk$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t7, T t8) {
                            return f.t(Long.valueOf(((ReplayFrame) t7).getTimestamp()), Long.valueOf(((ReplayFrame) t8).getTimestamp()));
                        }
                    };
                    if (frames$sentry_android_replay_release.size() > 1) {
                        Collections.sort(frames$sentry_android_replay_release, comparator);
                    }
                }
                SentryReplayEvent.ReplayType replayType2 = SentryReplayEvent.ReplayType.SESSION;
                int intValue = replayType == replayType2 ? E06.intValue() : 0;
                if (replayType != replayType2) {
                    date = DateUtils.getDateTime(((ReplayFrame) AbstractC1159h.Q0(replayCache.getFrames$sentry_android_replay_release())).getTimestamp());
                    h.d(date, "{\n          // in buffer…st().timestamp)\n        }");
                }
                Date date2 = date;
                List<ReplayFrame> frames$sentry_android_replay_release2 = replayCache.getFrames$sentry_android_replay_release();
                h.e(frames$sentry_android_replay_release2, "<this>");
                if (frames$sentry_android_replay_release2.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                long timestamp = (frames$sentry_android_replay_release2.get(AbstractC1160i.L0(frames$sentry_android_replay_release2)).getTimestamp() - date2.getTime()) + (zzbbd.zzq.zzf / E04.intValue());
                String str9 = (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_RECORDING);
                if (str9 != null) {
                    ReplayRecording replayRecording = (ReplayRecording) sentryOptions.getSerializer().deserialize(new StringReader(str9), ReplayRecording.class);
                    if ((replayRecording != null ? replayRecording.getPayload() : null) != null) {
                        List<? extends RRWebEvent> payload = replayRecording.getPayload();
                        h.b(payload);
                        iterable = new LinkedList(payload);
                    }
                }
                iterable = C1167p.f13302a;
                return new LastSegmentData(screenshotRecorderConfig, replayCache, date2, intValue, timestamp, replayType, (String) linkedHashMap.get(ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START), AbstractC1159h.V0(new Comparator() { // from class: io.sentry.android.replay.ReplayCache$Companion$fromDisk$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t7, T t8) {
                        return f.t(Long.valueOf(((RRWebEvent) t7).getTimestamp()), Long.valueOf(((RRWebEvent) t8).getTimestamp()));
                    }
                }, iterable));
            } finally {
            }
        }

        public final File makeReplayCacheDir(SentryOptions sentryOptions, SentryId sentryId) {
            h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
            h.e(sentryId, "replayId");
            String cacheDirPath = sentryOptions.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                sentryOptions.getLogger().log(SentryLevel.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = sentryOptions.getCacheDirPath();
            h.b(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + sentryId);
            file.mkdirs();
            return file;
        }

        private Companion() {
        }
    }

    public ReplayCache(SentryOptions sentryOptions, SentryId sentryId) {
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(sentryId, "replayId");
        this.options = sentryOptions;
        this.replayId = sentryId;
        this.isClosed = new AtomicBoolean(false);
        this.encoderLock = new AutoClosableReentrantLock();
        this.lock = new AutoClosableReentrantLock();
        this.replayCacheDir$delegate = D.C(new ReplayCache$replayCacheDir$2(this));
        this.frames = new ArrayList();
        this.ongoingSegment = new LinkedHashMap<>();
        this.ongoingSegmentFile$delegate = D.C(new ReplayCache$ongoingSegmentFile$2(this));
    }

    public static /* synthetic */ void addFrame$default(ReplayCache replayCache, File file, long j, String str, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame(file, j, str);
    }

    public static /* synthetic */ void addFrame$sentry_android_replay_release$default(ReplayCache replayCache, Bitmap bitmap, long j, String str, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame$sentry_android_replay_release(bitmap, j, str);
    }

    public static /* synthetic */ GeneratedVideo createVideoOf$default(ReplayCache replayCache, long j, long j3, int i7, int i8, int i9, int i10, int i11, File file, int i12, Object obj) {
        File file2;
        if ((i12 & 128) != 0) {
            file2 = new File(replayCache.getReplayCacheDir$sentry_android_replay_release(), i7 + ".mp4");
        } else {
            file2 = file;
        }
        return replayCache.createVideoOf(j, j3, i7, i8, i9, i10, i11, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean encode(ReplayFrame replayFrame) {
        if (replayFrame == null) {
            return false;
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(replayFrame.getScreenshot().getAbsolutePath());
            ISentryLifecycleToken acquire = this.encoderLock.acquire();
            try {
                SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    h.d(decodeFile, "bitmap");
                    simpleVideoEncoder.encode(decodeFile);
                }
                q6.a.a(acquire, null);
                decodeFile.recycle();
                return true;
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
            return false;
        }
    }

    public final void addFrame(File file, long j, String str) {
        h.e(file, "screenshot");
        this.frames.add(new ReplayFrame(file, j, str));
    }

    public final void addFrame$sentry_android_replay_release(Bitmap bitmap, long j, String str) {
        h.e(bitmap, "bitmap");
        if (getReplayCacheDir$sentry_android_replay_release() == null || bitmap.isRecycled()) {
            return;
        }
        File replayCacheDir$sentry_android_replay_release = getReplayCacheDir$sentry_android_replay_release();
        if (replayCacheDir$sentry_android_replay_release != null) {
            replayCacheDir$sentry_android_replay_release.mkdirs();
        }
        File file = new File(getReplayCacheDir$sentry_android_replay_release(), j + ".jpg");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.options.getSessionReplay().getQuality().screenshotQuality, fileOutputStream);
            fileOutputStream.flush();
            AbstractC1539a.e(fileOutputStream, null);
            addFrame(file, j, str);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1539a.e(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken acquire = this.encoderLock.acquire();
        try {
            SimpleVideoEncoder simpleVideoEncoder = this.encoder;
            if (simpleVideoEncoder != null) {
                simpleVideoEncoder.release();
            }
            this.encoder = null;
            q6.a.a(acquire, null);
            this.isClosed.set(true);
        } finally {
        }
    }

    public final GeneratedVideo createVideoOf(long j, long j3, int i7, int i8, int i9, int i10, int i11, File file) {
        ISentryLifecycleToken iSentryLifecycleToken;
        int i12;
        h.e(file, "videoFile");
        if (file.exists() && file.length() > 0) {
            file.delete();
        }
        if (this.frames.isEmpty()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
            return null;
        }
        ISentryLifecycleToken acquire = this.encoderLock.acquire();
        try {
            iSentryLifecycleToken = acquire;
            try {
                SimpleVideoEncoder simpleVideoEncoder = new SimpleVideoEncoder(this.options, new MuxerConfig(file, i9, i8, i10, i11, null, 32, null), null, 4, null);
                simpleVideoEncoder.start();
                q6.a.a(iSentryLifecycleToken, null);
                this.encoder = simpleVideoEncoder;
                long j7 = zzbbd.zzq.zzf / i10;
                ReplayFrame replayFrame = (ReplayFrame) AbstractC1159h.Q0(this.frames);
                long j8 = j3 + j;
                i iVar = j8 <= Long.MIN_VALUE ? i.f18549d : new i(j3, j8 - 1);
                h.e(iVar, "<this>");
                boolean z4 = j7 > 0;
                Long valueOf = Long.valueOf(j7);
                if (!z4) {
                    throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
                }
                long j9 = iVar.f18544c > 0 ? j7 : -j7;
                long j10 = iVar.f18542a;
                long j11 = new g(j10, iVar.f18543b, j9).f18543b;
                if ((j9 > 0 && j10 <= j11) || (j9 < 0 && j11 <= j10)) {
                    i12 = 0;
                    while (true) {
                        Iterator<ReplayFrame> it = this.frames.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ReplayFrame next = it.next();
                            long j12 = j10 + j7;
                            long timestamp = next.getTimestamp();
                            if (j10 <= timestamp && timestamp <= j12) {
                                replayFrame = next;
                                break;
                            }
                            if (next.getTimestamp() > j12) {
                                break;
                            }
                        }
                        if (encode(replayFrame)) {
                            i12++;
                        } else if (replayFrame != null) {
                            deleteFile(replayFrame.getScreenshot());
                            this.frames.remove(replayFrame);
                            replayFrame = null;
                        }
                        if (j10 == j11) {
                            break;
                        }
                        j10 += j9;
                    }
                } else {
                    i12 = 0;
                }
                if (i12 == 0) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                    deleteFile(file);
                    return null;
                }
                ISentryLifecycleToken acquire2 = this.encoderLock.acquire();
                try {
                    SimpleVideoEncoder simpleVideoEncoder2 = this.encoder;
                    if (simpleVideoEncoder2 != null) {
                        simpleVideoEncoder2.release();
                    }
                    SimpleVideoEncoder simpleVideoEncoder3 = this.encoder;
                    long duration = simpleVideoEncoder3 != null ? simpleVideoEncoder3.getDuration() : 0L;
                    this.encoder = null;
                    q6.a.a(acquire2, null);
                    rotate$sentry_android_replay_release(j8);
                    return new GeneratedVideo(file, i12, duration);
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    throw th2;
                } catch (Throwable th3) {
                    q6.a.a(iSentryLifecycleToken, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            iSentryLifecycleToken = acquire;
        }
    }

    public final List<ReplayFrame> getFrames$sentry_android_replay_release() {
        return this.frames;
    }

    public final File getOngoingSegmentFile$sentry_android_replay_release() {
        return (File) this.ongoingSegmentFile$delegate.getValue();
    }

    public final File getReplayCacheDir$sentry_android_replay_release() {
        return (File) this.replayCacheDir$delegate.getValue();
    }

    public final void persistSegmentValues$sentry_android_replay_release(String str, String str2) {
        File ongoingSegmentFile$sentry_android_replay_release;
        File ongoingSegmentFile$sentry_android_replay_release2;
        h.e(str, "key");
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (this.isClosed.get()) {
                q6.a.a(acquire, null);
                return;
            }
            File ongoingSegmentFile$sentry_android_replay_release3 = getOngoingSegmentFile$sentry_android_replay_release();
            if ((ongoingSegmentFile$sentry_android_replay_release3 == null || !ongoingSegmentFile$sentry_android_replay_release3.exists()) && (ongoingSegmentFile$sentry_android_replay_release = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                ongoingSegmentFile$sentry_android_replay_release.createNewFile();
            }
            if (this.ongoingSegment.isEmpty() && (ongoingSegmentFile$sentry_android_replay_release2 = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(ongoingSegmentFile$sentry_android_replay_release2), C6.a.f1581a), 8192);
                try {
                    B6.a aVar = new B6.a(new B6.e(bufferedReader, 3));
                    LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                    Iterator it = aVar.iterator();
                    while (it.hasNext()) {
                        List A02 = o.A0((String) it.next(), new String[]{"="});
                        linkedHashMap.put((String) A02.get(0), (String) A02.get(1));
                    }
                    AbstractC1539a.e(bufferedReader, null);
                } finally {
                }
            }
            if (str2 == null) {
                this.ongoingSegment.remove(str);
            } else {
                this.ongoingSegment.put(str, str2);
            }
            File ongoingSegmentFile$sentry_android_replay_release4 = getOngoingSegmentFile$sentry_android_replay_release();
            if (ongoingSegmentFile$sentry_android_replay_release4 != null) {
                Set<Map.Entry<String, String>> entrySet = this.ongoingSegment.entrySet();
                h.d(entrySet, "ongoingSegment.entries");
                String T02 = AbstractC1159h.T0(entrySet, "\n", null, null, ReplayCache$persistSegmentValues$1$2.INSTANCE, 30);
                Charset charset = C6.a.f1581a;
                h.e(T02, "text");
                h.e(charset, "charset");
                FileOutputStream fileOutputStream = new FileOutputStream(ongoingSegmentFile$sentry_android_replay_release4);
                try {
                    c.n(fileOutputStream, T02, charset);
                    AbstractC1539a.e(fileOutputStream, null);
                } finally {
                }
            }
            q6.a.a(acquire, null);
        } finally {
        }
    }

    public final String rotate$sentry_android_replay_release(long j) {
        p pVar = new p();
        AbstractC1165n.P0(this.frames, new ReplayCache$rotate$1(j, this, pVar));
        return (String) pVar.f16472a;
    }
}
