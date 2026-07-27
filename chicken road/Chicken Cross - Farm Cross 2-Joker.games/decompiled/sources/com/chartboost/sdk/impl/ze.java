package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.chartboost.sdk.internal.Model.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ze implements ye {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f5102a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public ze(final m1 androidComponent, final wh trackerComponent) {
        Intrinsics.checkNotNullParameter(androidComponent, "androidComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        this.f5102a = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.ze$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ze.a(m1.this, trackerComponent, this);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.ze$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ze.b(m1.this);
            }
        });
        this.c = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.ze$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ze.a(m1.this);
            }
        });
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.ze$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ze.a(ze.this);
            }
        });
    }

    public static final ih b(m1 m1Var) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(m1Var.getContext());
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        return new ih(defaultSharedPreferences);
    }

    @Override // com.chartboost.sdk.impl.ye
    public ve a() {
        return (ve) this.f5102a.getValue();
    }

    public String c() {
        return (String) this.d.getValue();
    }

    public ih d() {
        return (ih) this.b.getValue();
    }

    public static final ve a(m1 m1Var, wh whVar, ze zeVar) {
        SharedPreferences g = m1Var.g();
        i7 a2 = whVar.a();
        af afVar = new af(g, a2);
        ve veVar = new ve(new gf(afVar, a2), new o8(afVar), new lf(afVar), new p8(), new q8(afVar), zeVar.d(), zeVar.b(), zeVar.c());
        veVar.a(new a.b());
        return veVar;
    }

    public n8 b() {
        return (n8) this.c.getValue();
    }

    public static final n8 a(m1 m1Var) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(m1Var.getContext());
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        return new n8(defaultSharedPreferences);
    }

    public static final String a(ze zeVar) {
        return zeVar.b().a();
    }
}
