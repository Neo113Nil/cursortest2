package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f4850a;
    public final q1 b;
    public final c0 c;
    public final mf d;
    public final xd e;
    public final Mediation f;
    public final v9 g;
    public final wh h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;

    public l0(m1 androidComponent, q1 applicationComponent, c0 adType, mf renderComponent, xd openMeasurementComponent, Mediation mediation, v9 impressionComponent, wh trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(renderComponent, "renderComponent");
        Intrinsics.checkNotNullParameter(openMeasurementComponent, "openMeasurementComponent");
        Intrinsics.checkNotNullParameter(impressionComponent, "impressionComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f4850a = androidComponent;
        this.b = applicationComponent;
        this.c = adType;
        this.d = renderComponent;
        this.e = openMeasurementComponent;
        this.f = mediation;
        this.g = impressionComponent;
        this.h = trackerComponent;
        this.i = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.b(l0.this);
            }
        });
        this.j = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.c(l0.this);
            }
        });
        this.k = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.u();
            }
        });
        this.l = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.k(l0.this);
            }
        });
        this.m = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.i(l0.this);
            }
        });
        this.n = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.h(l0.this);
            }
        });
        this.o = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.g(l0.this);
            }
        });
        this.p = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.s();
            }
        });
        this.q = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.d(l0.this);
            }
        });
        this.r = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.l(l0.this);
            }
        });
        this.s = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.a(l0.this);
            }
        });
        this.t = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.e(l0.this);
            }
        });
        this.u = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.j(l0.this);
            }
        });
        this.v = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.t();
            }
        });
        this.w = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.l0$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l0.f(l0.this);
            }
        });
    }

    public static final b2 b(l0 l0Var) {
        return new b2(l0Var.b.p(), l0Var.b.u(), l0Var.b.w(), l0Var.c, l0Var.f);
    }

    public static final j3 c(l0 l0Var) {
        return new j3(l0Var.h.a());
    }

    public static final p9 d(l0 l0Var) {
        return new p9(l0Var.b.q(), l0Var.b.p(), l0Var.q(), l0Var.b.v(), l0Var.c, l0Var.b.e(), l0Var.b.n(), l0Var.f, l0Var.e.a(), l0Var.m(), l0Var.i(), l0Var.g.a(), l0Var.h.a(), l0Var.b.r(), l0Var.b.h());
    }

    public static final ee g(l0 l0Var) {
        return new ee(l0Var.f4850a.a());
    }

    public static final le h(l0 l0Var) {
        return new le(l0Var.c, l0Var.b.p(), l0Var.j(), null, null, l0Var.h.a(), 24, null);
    }

    public static final bg i(l0 l0Var) {
        return new bg(l0Var.f4850a.getContext(), l0Var.b.k(), l0Var.b.g(), l0Var.b.b(), l0Var.f4850a.g(), l0Var.b.u(), l0Var.b.m(), l0Var.b.h(), l0Var.b.a(), l0Var.f, l0Var.b.j());
    }

    public static final yi k(l0 l0Var) {
        return new yi(l0Var.p(), null, null, null, null, 30, null);
    }

    public static final ig s() {
        return new ig();
    }

    public static final vi t() {
        return new vi();
    }

    public static final xi u() {
        return new xi(null, null, 3, null);
    }

    public final w a() {
        return new x(this.c, this.b.q(), l(), this.b.e(), new m0(this.f4850a.a()), j(), this.e.a(), this.h.a(), this.b.r(), null, 512, null);
    }

    public final a2 e() {
        return (a2) this.i.getValue();
    }

    public final j3 f() {
        return (j3) this.j.getValue();
    }

    public final ee j() {
        return (ee) this.o.getValue();
    }

    public final ag l() {
        return (ag) this.m.getValue();
    }

    public final ig m() {
        return (ig) this.p.getValue();
    }

    public final oh n() {
        return (oh) this.u.getValue();
    }

    public final vi o() {
        return (vi) this.v.getValue();
    }

    public final xi p() {
        return (xi) this.k.getValue();
    }

    public final yi q() {
        return (yi) this.l.getValue();
    }

    public final ja r() {
        return (ja) this.r.getValue();
    }

    public static final id e(l0 l0Var) {
        return new id(l0Var.f4850a.i(), l0Var.o());
    }

    public static final yd f(l0 l0Var) {
        return l0Var.e.b();
    }

    public static final oh j(l0 l0Var) {
        return new oh(l0Var.h.a());
    }

    public static final ja l(l0 l0Var) {
        return new ja(l0Var.f4850a.getContext(), l0Var.f4850a.i(), l0Var.b.q(), l0Var.f(), l0Var.b.w(), l0Var.f, l0Var.b.e(), l0Var.i(), l0Var.h.a());
    }

    public o0 c() {
        return new o0(this.c, this.b.g(), this.b.q(), this.b.w(), g(), d(), i(), r(), this.d.a(), h(), n(), this.f, null, this.h.a(), this.b.r(), q(), 4096, null);
    }

    public final p9 g() {
        return (p9) this.q.getValue();
    }

    public final le k() {
        return (le) this.n.getValue();
    }

    public final id h() {
        return (id) this.t.getValue();
    }

    public g0 b() {
        return new g0(this.c, this.b.q(), this.b.g(), this.b.w(), e(), a(), k(), this.f, this.h.a(), this.b.b());
    }

    public static final s0 a(l0 l0Var) {
        return new s0(l0Var.b.e(), l0Var.b.n(), l0Var.h.a(), l0Var.b.h());
    }

    public final yd i() {
        return (yd) this.w.getValue();
    }

    public final s0 d() {
        return (s0) this.s.getValue();
    }
}
