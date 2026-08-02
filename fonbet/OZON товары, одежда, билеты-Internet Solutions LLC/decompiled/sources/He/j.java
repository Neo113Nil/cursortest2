package He;

import De.B;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f10887a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f10888b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10889c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10890d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f10891e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static e f10892f;

    static {
        String c11 = B.c("kotlinx.coroutines.scheduler.default.name");
        if (c11 == null) {
            c11 = "DefaultDispatcher";
        }
        f10887a = c11;
        f10888b = B.b(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int a11 = B.a();
        if (a11 < 2) {
            a11 = 2;
        }
        f10889c = B.d(a11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f10890d = B.d(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f10891e = TimeUnit.SECONDS.toNanos(B.b(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f10892f = e.f10882a;
    }
}
