package com.chartboost.sdk.impl;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zh implements wh {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f5104a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public zh(final Lazy androidComponent, final Lazy applicationComponent, final Lazy privacyApi) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        this.f5104a = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.a(Lazy.this, this, applicationComponent);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.a(Lazy.this);
            }
        });
        this.c = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.a(Lazy.this, this);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.f();
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.b(Lazy.this, this);
            }
        });
    }

    public static final ag b(Lazy lazy) {
        return ((q1) lazy.getValue()).n();
    }

    public static final fi c(Lazy lazy) {
        return ((com.chartboost.sdk.internal.Model.a) ((q1) lazy.getValue()).b().get()).i();
    }

    public static final ei f() {
        return new ei(null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.wh
    public i7 a() {
        return (i7) this.f5104a.getValue();
    }

    public ji d() {
        return (ji) this.c.getValue();
    }

    public li e() {
        return (li) this.e.getValue();
    }

    public static final com.chartboost.sdk.tracking.d a(Lazy lazy, final zh zhVar, final Lazy lazy2) {
        return new com.chartboost.sdk.tracking.d(LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.c(Lazy.this);
            }
        }), LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.a(zh.this);
            }
        }), LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.b(Lazy.this);
            }
        }), lazy, LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.b(zh.this);
            }
        }), LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.zh$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zh.c(zh.this);
            }
        }));
    }

    public static final li b(zh zhVar) {
        return zhVar.e();
    }

    public static final ji c(zh zhVar) {
        return zhVar.d();
    }

    public com.chartboost.sdk.tracking.c b() {
        return (com.chartboost.sdk.tracking.c) this.b.getValue();
    }

    public ei c() {
        return (ei) this.d.getValue();
    }

    public static final li b(Lazy lazy, zh zhVar) {
        return new li(((q1) lazy.getValue()).e(), zhVar.d(), null, zhVar.a(), ((q1) lazy.getValue()).h().d(), 4, null);
    }

    public static final com.chartboost.sdk.tracking.c a(zh zhVar) {
        return zhVar.b();
    }

    public static final com.chartboost.sdk.tracking.c a(Lazy lazy) {
        fi i = ((com.chartboost.sdk.internal.Model.a) ((q1) lazy.getValue()).b().get()).i();
        return new com.chartboost.sdk.tracking.c(i.c(), i.g());
    }

    public static final ji a(Lazy lazy, zh zhVar) {
        return new ji(((m1) lazy.getValue()).f(), zhVar.c(), null, 4, null);
    }
}
