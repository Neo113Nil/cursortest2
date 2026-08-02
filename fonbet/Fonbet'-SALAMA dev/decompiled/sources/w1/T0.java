package w1;

import android.app.ActivityManager;
import android.content.Context;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class T0 {
    public static T0 j;

    /* renamed from: k, reason: collision with root package name */
    public static long f17536k = System.nanoTime();

    /* renamed from: a, reason: collision with root package name */
    public long f17537a;

    /* renamed from: b, reason: collision with root package name */
    public long f17538b;

    /* renamed from: c, reason: collision with root package name */
    public long f17539c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f17540d;

    /* renamed from: e, reason: collision with root package name */
    public S0 f17541e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17542f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17543g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17544h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17545i;

    public static synchronized T0 a() {
        T0 t02;
        synchronized (T0.class) {
            try {
                if (j == null) {
                    T0 t03 = new T0();
                    t03.f17542f = false;
                    t03.f17543g = false;
                    t03.f17544h = false;
                    t03.f17545i = false;
                    t03.f17540d = new HashMap();
                    j = t03;
                }
                t02 = j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t02;
    }

    public final void b(Context context, String str, String str2, String str3) {
        this.f17543g = true;
        long nanoTime = (long) ((System.nanoTime() - this.f17537a) / 1000000.0d);
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) - this.f17538b;
        if (freeMemory < 0) {
            freeMemory = 0;
        }
        ActivityManager.MemoryInfo a2 = AbstractC1706i0.a(context);
        long j3 = (a2.totalMem - a2.availMem) - this.f17539c;
        long j7 = j3 >= 0 ? j3 : 0L;
        HashMap hashMap = this.f17540d;
        hashMap.put(str, Long.toString(nanoTime));
        hashMap.put(str2, Long.toString(freeMemory));
        hashMap.put(str3, Long.toString(j7));
    }

    public final synchronized void c() {
        if (this.f17540d.isEmpty()) {
            return;
        }
        Objects.toString(this.f17540d);
        r.i().j("Flurry.ColdStartTime", 6, this.f17540d);
        this.f17540d.clear();
    }
}
