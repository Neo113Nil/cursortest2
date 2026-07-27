package com.startapp.sdk.adsbase.crashreport;

import android.os.Looper;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class ThreadsState implements Serializable {
    private static final long serialVersionUID = -4777916407910409315L;

    /* renamed from: a, reason: collision with root package name */
    public final transient String f3201a;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f3202b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f3203c;

    /* renamed from: d, reason: collision with root package name */
    public final transient HashSet f3204d;
    private final long delay;
    private final String handlerDescription;
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j3, StackTraceElement stackTraceElement) {
            this.skipBeforeAmount = j3;
            this.stackTraceElement = stackTraceElement;
        }

        public final long a() {
            return this.skipBeforeAmount;
        }

        public final StackTraceElement b() {
            return this.stackTraceElement;
        }
    }

    public ThreadsState(zh zhVar) {
        this.f3201a = zhVar.f4806a;
        this.f3202b = zhVar.f4810e;
        this.f3203c = zhVar.f;
        this.delay = zhVar.f4809d;
        this.handlerDescription = zhVar.f4807b;
        this.f3204d = zhVar.f4808c;
        Thread thread = Looper.getMainLooper().getThread();
        String str = thread.getName() + " (state = " + thread.getState() + ")";
        int i3 = 0;
        TreeMap treeMap = new TreeMap(new MainThreadComparator(i3));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (value != null && value.length > 0) {
                ShrunkStackTraceElement[] b3 = b(value);
                if (b3 != null && b3.length > 0) {
                    Thread.State state = key.getState();
                    if (key == thread) {
                        if (a(value)) {
                            return;
                        }
                        treeMap.put(str, b3);
                        i3 = 1;
                    } else if (!this.f3203c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(key.getName() + " (state = " + key.getState() + ")", b3);
                    }
                } else if (key == thread) {
                    return;
                }
            } else if (key == thread) {
                return;
            }
        }
        if (i3 == 0) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] b4 = b(stackTrace);
            if (b4 == null || b4.length <= 0 || a(stackTrace)) {
                return;
            } else {
                treeMap.put(str, b4);
            }
        }
        this.threadsStackTraces = treeMap;
    }

    public final long a() {
        return this.delay;
    }

    public final String b() {
        return this.handlerDescription;
    }

    public final Map c() {
        return this.threadsStackTraces;
    }

    public static class MainThreadComparator implements Comparator<String>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final transient String f3205a;

        private MainThreadComparator() {
            this.f3205a = Looper.getMainLooper().getThread().getName();
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3.startsWith(this.f3205a)) {
                return -1;
            }
            if (str4.startsWith(this.f3205a)) {
                return 1;
            }
            return str3.compareTo(str4);
        }

        public /* synthetic */ MainThreadComparator(int i3) {
            this();
        }
    }

    public final boolean a(StackTraceElement[] stackTraceElementArr) {
        if (this.f3204d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (className != null && methodName != null) {
                if (this.f3204d.contains(className + '.' + methodName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ShrunkStackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        String className;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        StackTraceElement stackTraceElement = null;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i3];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z5 = i3 < 3;
                String str = this.f3201a;
                boolean z6 = str == null || className.startsWith(str);
                if (z6) {
                    z3 = true;
                }
                if (!this.f3202b || z6 || z5 || z4) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j3, stackTraceElement));
                        j3 = 0;
                        stackTraceElement = null;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0L, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j3++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z4 = z6;
            }
            i3++;
        }
        if (stackTraceElement != null) {
            arrayList.add(new ShrunkStackTraceElement(j3 + 1, null));
        }
        if (z3) {
            return (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]);
        }
        return null;
    }
}
