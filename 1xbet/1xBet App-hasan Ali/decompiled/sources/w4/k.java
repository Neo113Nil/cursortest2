package w4;

import java.util.concurrent.TimeUnit;
import u4.s;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20567a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f20568b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20569c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20570d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f20571e;
    public static final g f;

    static {
        String str;
        int i = s.f20115a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f20567a = str;
        f20568b = u4.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i5 = s.f20115a;
        if (i5 < 2) {
            i5 = 2;
        }
        f20569c = u4.a.j(i5, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f20570d = u4.a.j(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f20571e = TimeUnit.SECONDS.toNanos(u4.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.f20562a;
    }
}
