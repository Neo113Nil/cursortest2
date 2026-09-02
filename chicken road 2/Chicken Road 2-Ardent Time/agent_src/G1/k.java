package G1;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f586a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f587b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f588c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f589d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f590e;

    /* renamed from: f, reason: collision with root package name */
    public static final G1.f f591f;

    /* renamed from: g, reason: collision with root package name */
    public static final G1.i f592g;

    /* renamed from: h, reason: collision with root package name */
    public static final G1.i f593h;

    static {
        java.lang.String str;
        int i2 = E1.w.f305a;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f586a = str;
        f587b = E1.AbstractC0000a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = E1.w.f305a;
        if (i3 < 2) {
            i3 = 2;
        }
        f588c = E1.AbstractC0000a.k("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f589d = E1.AbstractC0000a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f590e = java.util.concurrent.TimeUnit.SECONDS.toNanos(E1.AbstractC0000a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f591f = G1.f.f580a;
        f592g = new G1.i(0);
        f593h = new G1.i(1);
    }
}
