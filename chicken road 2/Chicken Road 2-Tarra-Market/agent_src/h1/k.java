package h1;

import g1.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1247a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1248b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1249c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1250d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1251e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1252f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f1253g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f1254h;

    static {
        String str;
        int i2 = w.f1181a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1247a = str;
        f1248b = g1.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = w.f1181a;
        if (i3 < 2) {
            i3 = 2;
        }
        f1249c = g1.a.k("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f1250d = g1.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f1251e = TimeUnit.SECONDS.toNanos(g1.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1252f = f.f1241a;
        f1253g = new i(0);
        f1254h = new i(1);
    }
}
