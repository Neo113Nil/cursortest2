package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class of implements mf {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f4943a;

    public of(final m1 androidComponent, final wh trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f4943a = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.of$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return of.a(m1.this, trackerComponent);
            }
        });
    }

    @Override // com.chartboost.sdk.impl.mf
    public uf a() {
        return (uf) this.f4943a.getValue();
    }

    public static final vf a(m1 m1Var, wh whVar) {
        return new vf(new n9(m1Var.getContext()), whVar.a());
    }
}
