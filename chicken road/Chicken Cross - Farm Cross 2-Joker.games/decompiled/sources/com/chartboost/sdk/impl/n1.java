package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4885a;
    public final Application b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;

    public n1(Context context, Application app) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(app, "app");
        this.f4885a = context;
        this.b = app;
        this.c = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.f(n1.this);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.h(n1.this);
            }
        });
        this.e = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.l();
            }
        });
        this.f = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.p();
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.m();
            }
        });
        this.h = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.e(n1.this);
            }
        });
        this.i = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.g(n1.this);
            }
        });
        this.j = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.i(n1.this);
            }
        });
        this.k = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.d(n1.this);
            }
        });
        this.l = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.c(n1.this);
            }
        });
        this.m = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.b(n1.this);
            }
        });
        this.n = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.n1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.a(n1.this);
            }
        });
    }

    public static final j6 b(n1 n1Var) {
        return new j6(n1Var.getContext(), n1Var.k());
    }

    public static final dg e(n1 n1Var) {
        Resources resources = n1Var.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return new dg(resources);
    }

    public static final SharedPreferences f(n1 n1Var) {
        return n1Var.getContext().getSharedPreferences("cbPrefs", 0);
    }

    public static final SharedPreferences h(n1 n1Var) {
        return n1Var.getContext().getSharedPreferences("cbPrefsTracking", 0);
    }

    public static final l1 l() {
        return l1.b();
    }

    public static final f2 m() {
        return new f2();
    }

    public static final pi p() {
        return new pi(null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.m1
    public f2 a() {
        return (f2) this.g.getValue();
    }

    @Override // com.chartboost.sdk.impl.m1
    public wg c() {
        return (wg) this.i.getValue();
    }

    @Override // com.chartboost.sdk.impl.m1
    public l1 d() {
        Object value = this.e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l1) value;
    }

    @Override // com.chartboost.sdk.impl.m1
    public SharedPreferences g() {
        Object value = this.c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // com.chartboost.sdk.impl.m1
    public Context getContext() {
        return this.f4885a;
    }

    @Override // com.chartboost.sdk.impl.m1
    public oi i() {
        return (oi) this.f.getValue();
    }

    @Override // com.chartboost.sdk.impl.m1
    public Application j() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.m1
    public q6 k() {
        return (q6) this.l.getValue();
    }

    public DisplayMetrics n() {
        Object value = this.k.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DisplayMetrics) value;
    }

    public WindowManager o() {
        return (WindowManager) this.j.getValue();
    }

    public static final ContentResolver a(n1 n1Var) {
        return n1Var.getContext().getContentResolver();
    }

    public static final q6 c(n1 n1Var) {
        return new q6(n1Var.o(), n1Var.n(), null, null, 12, null);
    }

    public static final DisplayMetrics d(n1 n1Var) {
        return n1Var.getContext().getResources().getDisplayMetrics();
    }

    public static final wg g(n1 n1Var) {
        return new wg(n1Var.g());
    }

    public static final WindowManager i(n1 n1Var) {
        Object systemService = n1Var.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    @Override // com.chartboost.sdk.impl.m1
    public ContentResolver b() {
        Object value = this.n.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ContentResolver) value;
    }

    @Override // com.chartboost.sdk.impl.m1
    public j6 e() {
        return (j6) this.m.getValue();
    }

    @Override // com.chartboost.sdk.impl.m1
    public SharedPreferences f() {
        Object value = this.d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    @Override // com.chartboost.sdk.impl.m1
    public dg h() {
        return (dg) this.h.getValue();
    }
}
