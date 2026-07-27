package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pg implements lg {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f4961a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public pg(final m1 androidComponent, final o7 executorComponent, final q1 applicationComponent, final xd openMeasurementComponent, final wh trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(executorComponent, "executorComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(openMeasurementComponent, "openMeasurementComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f4961a = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.pg$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pg.a(m1.this, executorComponent, this, applicationComponent);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.pg$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pg.a(pg.this, applicationComponent, trackerComponent);
            }
        });
        this.c = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.pg$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pg.a(m1.this, applicationComponent, this, openMeasurementComponent, executorComponent);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.pg$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pg.b(q1.this, trackerComponent);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.pg$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pg.a(q1.this, trackerComponent);
            }
        });
        this.f = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.pg$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pg.a(m1.this);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.pg$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pg.a(m1.this, applicationComponent, openMeasurementComponent);
            }
        });
    }

    @Override // com.chartboost.sdk.impl.lg
    public x3 a() {
        return (x3) this.f4961a.getValue();
    }

    @Override // com.chartboost.sdk.impl.lg
    public k1 b() {
        return (k1) this.b.getValue();
    }

    @Override // com.chartboost.sdk.impl.lg
    public ng c() {
        return (ng) this.c.getValue();
    }

    public final qa d() {
        return (qa) this.e.getValue();
    }

    public final ra e() {
        return (ra) this.d.getValue();
    }

    public final ef f() {
        return (ef) this.f.getValue();
    }

    public k2 g() {
        return (k2) this.g.getValue();
    }

    public static final x3 a(m1 m1Var, o7 o7Var, pg pgVar, q1 q1Var) {
        return new x3(m1Var.getContext(), o7Var.b(), pgVar.c(), pgVar.g(), q1Var.k());
    }

    public static final ra b(q1 q1Var, wh whVar) {
        return new ra(q1Var.e(), q1Var.n(), whVar.a(), q1Var.r());
    }

    public static final k1 a(pg pgVar, q1 q1Var, wh whVar) {
        return new k1(pgVar.c(), q1Var.e(), q1Var.n(), whVar.a(), q1Var.h());
    }

    public static final ng a(m1 m1Var, final q1 q1Var, pg pgVar, xd xdVar, o7 o7Var) {
        return new ng(m1Var.getContext(), m1Var.g(), m1Var.i(), q1Var.a(), q1Var.b(), q1Var.s(), q1Var.p(), q1Var.h(), q1Var.l(), LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.pg$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pg.a(q1.this);
            }
        }), pgVar.e(), pgVar.d(), q1Var.g(), pgVar.f(), q1Var.k(), xdVar.a(), q1Var.t(), q1Var.e(), o7Var.b());
    }

    public static final lk a(q1 q1Var) {
        return q1Var.w();
    }

    public static final qa a(q1 q1Var, wh whVar) {
        return new qa(q1Var.e(), q1Var.n(), whVar.a(), q1Var.r());
    }

    public static final ef a(m1 m1Var) {
        return new ef(m1Var.getContext(), m1Var.i());
    }

    public static final k2 a(m1 m1Var, q1 q1Var, xd xdVar) {
        return new k2(m1Var.getContext(), m1Var.a(), q1Var.k(), q1Var.b(), xdVar.a(), q1Var.a(), q1Var.h());
    }
}
