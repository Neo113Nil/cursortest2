package K6;

import I6.w;
import java.util.concurrent.TimeUnit;
import p023d1.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f4167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f4170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f4171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f4172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f4173h;

    static {
        String property;
        int i7 = w.f3761a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f4166a = property;
        f4167b = I6.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i8 = w.f3761a;
        if (i8 < 2) {
            i8 = 2;
        }
        f4168c = I6.a.k("kotlinx.coroutines.scheduler.core.pool.size", i8, 1, 0, 8);
        f4169d = I6.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f4170e = TimeUnit.SECONDS.toNanos(I6.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f4171f = f.f4161a;
        f4172g = new n(0);
        f4173h = new n(1);
    }
}
