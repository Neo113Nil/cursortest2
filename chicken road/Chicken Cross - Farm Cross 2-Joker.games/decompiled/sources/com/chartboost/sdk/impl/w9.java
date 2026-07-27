package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w9 implements v9 {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f5055a = new Function2() { // from class: com.chartboost.sdk.impl.w9$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return w9.a(w9.this, (y9) obj, (ViewGroup) obj2);
        }
    };
    public final Function1 b = new Function1() { // from class: com.chartboost.sdk.impl.w9$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return w9.a((y9) obj);
        }
    };
    public final Function1 c = new Function1() { // from class: com.chartboost.sdk.impl.w9$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return w9.c((y9) obj);
        }
    };
    public final Function1 d = new Function1() { // from class: com.chartboost.sdk.impl.w9$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return w9.b((y9) obj);
        }
    };
    public final Function2 e = new Function2() { // from class: com.chartboost.sdk.impl.w9$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return w9.a((y9) obj, (ViewGroup) obj2);
        }
    };

    public static final u9 b(y9 impressionDependency) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        return new u9(impressionDependency.b(), impressionDependency.a(), impressionDependency.g(), impressionDependency.c());
    }

    public static final z9 c(y9 impressionDependency) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        return new z9(impressionDependency.b(), impressionDependency.n(), impressionDependency.a(), impressionDependency.c(), impressionDependency.j(), impressionDependency.d(), impressionDependency.h(), impressionDependency.p(), impressionDependency.i());
    }

    @Override // com.chartboost.sdk.impl.v9
    public Function2 a() {
        return this.f5055a;
    }

    public static final w2 a(w9 w9Var, y9 impressionDependency, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        return new w2(impressionDependency, (s9) w9Var.b.invoke(impressionDependency), (aa) w9Var.c.invoke(impressionDependency), (t9) w9Var.d.invoke(impressionDependency), (ka) w9Var.e.invoke(impressionDependency, viewGroup));
    }

    public static final q9 a(y9 impressionDependency) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        return new q9(impressionDependency.b(), impressionDependency.q(), impressionDependency.m(), impressionDependency.e(), impressionDependency.f(), impressionDependency.o(), impressionDependency.k(), impressionDependency.p(), impressionDependency.c(), null, 512, null);
    }

    public static final ia a(y9 impressionDependency, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        return new ia(impressionDependency.d(), impressionDependency.r(), impressionDependency.h(), viewGroup, impressionDependency.c(), impressionDependency.j(), impressionDependency.k());
    }
}
