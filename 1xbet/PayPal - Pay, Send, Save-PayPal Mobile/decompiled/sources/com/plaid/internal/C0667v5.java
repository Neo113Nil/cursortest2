package com.plaid.internal;

/* renamed from: com.plaid.internal.v5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0667v5 implements dagger.internal.Factory<com.plaid.internal.AbstractC0502d1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f6600a;

    public C0667v5(com.plaid.internal.C0623q5 c0623q5, dagger.internal.Factory factory) {
        this.f6600a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f6600a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        android.content.SharedPreferences sharedPreferences = application.getSharedPreferences("plaid_feature_overrides", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        android.content.SharedPreferences sharedPreferences2 = application.getSharedPreferences("plaid_features_from_server", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "");
        return (com.plaid.internal.AbstractC0502d1) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0453a7(sharedPreferences, sharedPreferences2));
    }
}
