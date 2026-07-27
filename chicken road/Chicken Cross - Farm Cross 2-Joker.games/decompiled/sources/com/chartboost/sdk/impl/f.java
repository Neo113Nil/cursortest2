package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f4762a;
    public final Lazy b;

    public f(m1 androidComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        this.f4762a = androidComponent;
        this.b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.a(f.this);
            }
        });
    }

    public e a() {
        return (e) this.b.getValue();
    }

    public static final e a(f fVar) {
        return new e(fVar.f4762a.i());
    }
}
