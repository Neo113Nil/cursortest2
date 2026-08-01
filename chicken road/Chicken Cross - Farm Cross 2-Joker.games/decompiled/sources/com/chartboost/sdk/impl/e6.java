package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e6 implements d6 {

    /* renamed from: a, reason: collision with root package name */
    public final qg f4747a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;

    public e6(qg startupManager) {
        Intrinsics.checkNotNullParameter(startupManager, "startupManager");
        this.f4747a = startupManager;
        this.b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.a(e6.this);
            }
        });
        this.c = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.b(e6.this);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.d(e6.this);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.e();
            }
        });
        this.f = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.c(e6.this);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.l();
            }
        });
        this.h = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.g(e6.this);
            }
        });
        this.i = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.f(e6.this);
            }
        });
        this.j = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.e(e6.this);
            }
        });
        this.k = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.k(e6.this);
            }
        });
    }

    public static final be c(e6 e6Var) {
        return new be(e6Var.a(), e6Var.b());
    }

    public static final ze d(e6 e6Var) {
        return new ze(e6Var.a(), e6Var.c());
    }

    public static final p7 e() {
        return new p7();
    }

    public static final ve j(e6 e6Var) {
        return e6Var.i().a();
    }

    public static final w9 l() {
        return new w9();
    }

    @Override // com.chartboost.sdk.impl.d6
    public m1 a() {
        return (m1) this.b.getValue();
    }

    @Override // com.chartboost.sdk.impl.d6
    public q1 b() {
        return (q1) this.c.getValue();
    }

    public o7 f() {
        return (o7) this.e.getValue();
    }

    public v9 g() {
        return (v9) this.g.getValue();
    }

    public xd h() {
        return (xd) this.f.getValue();
    }

    public ye i() {
        return (ye) this.d.getValue();
    }

    public lg k() {
        return (lg) this.i.getValue();
    }

    public static final n1 a(e6 e6Var) {
        Context applicationContext = e6Var.f4747a.a().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new n1(applicationContext, e6Var.f4747a.a());
    }

    public static final s1 b(e6 e6Var) {
        return new s1(e6Var.a(), e6Var.f(), e6Var.i(), null, e6Var.c(), 8, null);
    }

    public static final of e(e6 e6Var) {
        return new of(e6Var.a(), e6Var.c());
    }

    public static final pg f(e6 e6Var) {
        return new pg(e6Var.a(), e6Var.f(), e6Var.b(), e6Var.h(), e6Var.c());
    }

    public static final zh g(final e6 e6Var) {
        return new zh(LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.h(e6.this);
            }
        }), LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.i(e6.this);
            }
        }), LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.e6$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e6.j(e6.this);
            }
        }));
    }

    public static final m1 h(e6 e6Var) {
        return e6Var.a();
    }

    public static final q1 i(e6 e6Var) {
        return e6Var.b();
    }

    public static final tk k(e6 e6Var) {
        return new tk(e6Var.a(), e6Var.b());
    }

    @Override // com.chartboost.sdk.impl.d6
    public rk d() {
        return (rk) this.k.getValue();
    }

    public mf j() {
        return (mf) this.j.getValue();
    }

    @Override // com.chartboost.sdk.impl.d6
    public wh c() {
        return (wh) this.h.getValue();
    }

    public /* synthetic */ e6(qg qgVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? d4.b : qgVar);
    }
}
