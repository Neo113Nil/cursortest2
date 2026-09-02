package s0;

import F.E;
import java.util.concurrent.TimeUnit;
import r0.AbstractC0088a;
import r0.x;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1236a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1237b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1238c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1239d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1240e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1241f;

    /* renamed from: g, reason: collision with root package name */
    public static final E f1242g;

    /* renamed from: h, reason: collision with root package name */
    public static final E f1243h;

    static {
        String str;
        int i2 = x.f1199a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1236a = str;
        f1237b = AbstractC0088a.h("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = x.f1199a;
        if (i3 < 2) {
            i3 = 2;
        }
        f1238c = AbstractC0088a.i("kotlinx.coroutines.scheduler.core.pool.size", i3, 8);
        f1239d = AbstractC0088a.i("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f1240e = TimeUnit.SECONDS.toNanos(AbstractC0088a.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1241f = f.f1231a;
        f1242g = new E(0);
        f1243h = new E(1);
    }
}
