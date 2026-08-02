package com.plaid.internal;

/* renamed from: com.plaid.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0587m5 implements com.plaid.internal.Y {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f6494a;
    public final kotlin.Lazy b;

    public C0587m5(android.app.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        this.f6494a = application;
        this.b = kotlin.LazyKt.lazy(new com.plaid.internal.C0578l5(this));
    }

    public final void a(com.plaid.internal.EnumC0560j5 enumC0560j5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumC0560j5, "");
        ((android.content.SharedPreferences) this.b.getValue()).edit().putString("plaid_environment", enumC0560j5.getJson()).apply();
    }

    public final com.plaid.internal.EnumC0560j5 b() {
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) this.b.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        java.lang.String a2 = com.plaid.internal.C0463b7.a(sharedPreferences, com.plaid.internal.EnumC0560j5.SANDBOX.getJson());
        try {
            com.plaid.internal.EnumC0560j5.a aVar = com.plaid.internal.EnumC0560j5.Companion;
            return com.plaid.internal.EnumC0560j5.a.a(a2);
        } catch (java.lang.Exception e) {
            com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "Unknown value was stored in shared prefs: ".concat(java.lang.String.valueOf(a2)), new java.lang.Object[]{e});
            return com.plaid.internal.EnumC0560j5.SANDBOX;
        }
    }

    @Override // com.plaid.internal.Y
    public final java.lang.String a() {
        return b().name();
    }
}
