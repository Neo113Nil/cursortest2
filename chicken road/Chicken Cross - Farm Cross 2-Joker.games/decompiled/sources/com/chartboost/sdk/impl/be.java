package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class be implements xd {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f4693a;
    public final Lazy b;
    public final Lazy c;

    public be(final m1 androidComponent, final q1 applicationComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f4693a = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.be$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return be.a(m1.this, applicationComponent);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.be$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return be.d();
            }
        });
        this.c = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.be$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return be.a(be.this);
            }
        });
    }

    public static final ce d() {
        return new ce();
    }

    @Override // com.chartboost.sdk.impl.xd
    public ae a() {
        return (ae) this.f4693a.getValue();
    }

    @Override // com.chartboost.sdk.impl.xd
    public yd b() {
        return (yd) this.c.getValue();
    }

    public ce c() {
        return (ce) this.b.getValue();
    }

    public static final ae a(m1 m1Var, q1 q1Var) {
        return new ae(m1Var.getContext(), m1Var.c(), m1Var.h(), q1Var.b(), null, 16, null);
    }

    public static final yd a(be beVar) {
        return new yd(beVar.a(), beVar.c());
    }
}
