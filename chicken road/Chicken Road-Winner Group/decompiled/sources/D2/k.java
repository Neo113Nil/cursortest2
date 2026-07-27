package D2;

import B2.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f319a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f320b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f321c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f322d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f323e;
    public static final f f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f324g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f325h;

    static {
        String str;
        int i3 = w.f185a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f319a = str;
        f320b = B2.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = w.f185a;
        if (i4 < 2) {
            i4 = 2;
        }
        f321c = B2.a.j(i4, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f322d = B2.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f323e = TimeUnit.SECONDS.toNanos(B2.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = f.f313a;
        f324g = new i(0);
        f325h = new i(1);
    }
}
