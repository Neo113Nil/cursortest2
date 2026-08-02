package Jh;

import Qj0.C3887g;
import Qj0.C3903x;
import Qj0.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.MetricType;
import ve.EnumC10311b;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final C3887g f14753k = new C3887g("SCREEN_CREATE_TIME");

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final C3887g f14754l = new C3887g("merge_SCREEN_CREATE_TIME");

    /* renamed from: m, reason: collision with root package name */
    private static final long f14755m;

    /* renamed from: n, reason: collision with root package name */
    private static double f14756n;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ay.b f14757a;

    /* renamed from: b, reason: collision with root package name */
    private long f14758b;

    /* renamed from: c, reason: collision with root package name */
    private double f14759c;

    /* renamed from: d, reason: collision with root package name */
    private long f14760d;

    /* renamed from: e, reason: collision with root package name */
    private double f14761e;

    /* renamed from: f, reason: collision with root package name */
    private long f14762f;

    /* renamed from: g, reason: collision with root package name */
    private double f14763g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14764h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14765i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14766j;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f14755m = kotlin.time.c.i(EnumC10311b.NANOSECONDS);
    }

    public a(@NotNull Ay.b includeComposerCreationTimeInTotalTimeProvider) {
        Intrinsics.checkNotNullParameter(includeComposerCreationTimeInTotalTimeProvider, "includeComposerCreationTimeInTotalTimeProvider");
        this.f14757a = includeComposerCreationTimeInTotalTimeProvider;
        long j11 = f14755m;
        this.f14758b = j11;
        this.f14759c = -1.0d;
        this.f14760d = j11;
        this.f14761e = -1.0d;
        this.f14762f = j11;
        this.f14763g = -1.0d;
    }

    public final synchronized void c() {
        this.f14762f = f14755m;
        this.f14763g = -1.0d;
    }

    public final synchronized void d() {
        this.f14762f = f14755m;
        this.f14763g = -1.0d;
    }

    public final synchronized void e(long j11) {
        if (this.f14766j && !this.f14764h) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            this.f14761e = kotlin.time.b.m(kotlin.time.b.l(kotlin.time.c.h(j11, EnumC10311b.NANOSECONDS), kotlin.time.b.q(this.f14760d)), EnumC10311b.MILLISECONDS);
            this.f14764h = true;
        }
    }

    public final synchronized void f(long j11) {
        if (this.f14766j) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            this.f14760d = kotlin.time.c.h(j11, EnumC10311b.NANOSECONDS);
        }
    }

    public final synchronized void g(long j11) {
        if (this.f14766j && !this.f14765i) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            this.f14762f = kotlin.time.c.h(j11, EnumC10311b.NANOSECONDS);
            this.f14765i = true;
        }
    }

    public final synchronized void h(long j11) {
        if (this.f14766j && !kotlin.time.b.g(this.f14762f, f14755m)) {
            this.f14763g = kotlin.time.b.m(kotlin.time.b.l(kotlin.time.c.h(j11, EnumC10311b.NANOSECONDS), kotlin.time.b.q(this.f14762f)), EnumC10311b.MILLISECONDS);
        }
    }

    public final synchronized void i(long j11) {
        boolean booleanValue = this.f14757a.getValue().booleanValue();
        this.f14766j = booleanValue;
        if (booleanValue) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            this.f14758b = kotlin.time.c.h(j11, EnumC10311b.NANOSECONDS);
        }
    }

    public final synchronized void j(long j11) {
        if (this.f14766j) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            this.f14759c = kotlin.time.b.m(kotlin.time.b.l(kotlin.time.c.h(j11, EnumC10311b.NANOSECONDS), kotlin.time.b.q(this.f14758b)), EnumC10311b.MILLISECONDS);
        }
    }

    public final synchronized void k() {
        double d11 = this.f14763g;
        if (d11 > -1.0d && this.f14759c > -1.0d && this.f14761e > -1.0d) {
            f14756n = this.f14759c + d11 + this.f14761e + f14756n;
            this.f14759c = -1.0d;
            this.f14761e = -1.0d;
            d();
        }
    }

    public final synchronized void l(@NotNull U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        if (this.f14766j) {
            double d11 = this.f14763g;
            if (!(d11 > -1.0d && this.f14759c > -1.0d && this.f14761e > -1.0d)) {
                C3887g c3887g = f14753k;
                U.p(trace, c3887g, (long) f14756n, false, 4);
                if (f14756n != 0.0d) {
                    trace.c(new C3903x(MetricType.TOTAL_TIME_END, c3887g, false));
                    f14756n = 0.0d;
                }
                return;
            }
            double d12 = f14756n;
            double d13 = this.f14759c + d11 + this.f14761e + d12;
            C3887g c3887g2 = f14754l;
            U.p(trace, c3887g2, (long) d12, false, 4);
            trace.c(new C3903x(MetricType.REDIRECT_TIME, c3887g2, true));
            C3887g c3887g3 = f14753k;
            U.p(trace, c3887g3, (long) d13, false, 4);
            trace.c(new C3903x(MetricType.TOTAL_TIME_END, c3887g3, false));
            this.f14759c = -1.0d;
            this.f14761e = -1.0d;
            f14756n = 0.0d;
            d();
        }
    }
}
