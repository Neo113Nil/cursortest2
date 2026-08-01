package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tk implements rk {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f5020a;
    public final Lazy b;

    public tk(final m1 androidComponent, final q1 applicationComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        this.f5020a = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.tk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tk.a(m1.this, applicationComponent);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.tk$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tk.c();
            }
        });
    }

    public static final oc c() {
        return new oc();
    }

    @Override // com.chartboost.sdk.impl.rk
    public sk a() {
        return (sk) this.f5020a.getValue();
    }

    @Override // com.chartboost.sdk.impl.rk
    public xk b() {
        return (xk) this.b.getValue();
    }

    public static final lc a(m1 m1Var, q1 q1Var) {
        return new lc(m1Var.getContext(), m1Var.c(), m1Var.h(), q1Var.b());
    }
}
