package p155w1;

import android.app.ActivityManager;
import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class T0 {
    public static T0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static long f17542k = System.nanoTime();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f17546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S0 f17547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17551i;

    public static synchronized T0 a() {
        try {
            if (j == null) {
                T0 t7 = new T0();
                t7.f17548f = false;
                t7.f17549g = false;
                t7.f17550h = false;
                t7.f17551i = false;
                t7.f17546d = new HashMap();
                j = t7;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final void b(Context context, String str, String str2, String str3) {
        this.f17549g = true;
        long jNanoTime = (long) ((System.nanoTime() - this.f17543a) / 1000000.0d);
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = (runtime.totalMemory() - runtime.freeMemory()) - this.f17544b;
        if (jFreeMemory < 0) {
            jFreeMemory = 0;
        }
        ActivityManager.MemoryInfo memoryInfoA = AbstractC0997i0.a(context);
        long j3 = (memoryInfoA.totalMem - memoryInfoA.availMem) - this.f17545c;
        long j7 = j3 >= 0 ? j3 : 0L;
        HashMap map = this.f17546d;
        map.put(str, Long.toString(jNanoTime));
        map.put(str2, Long.toString(jFreeMemory));
        map.put(str3, Long.toString(j7));
    }

    public final synchronized void c() {
        if (this.f17546d.isEmpty()) {
            return;
        }
        Objects.toString(this.f17546d);
        r.i().j("Flurry.ColdStartTime", 6, this.f17546d);
        this.f17546d.clear();
    }
}
