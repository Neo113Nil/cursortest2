package com.plaid.internal;

/* loaded from: classes16.dex */
public final class K1 implements dagger.internal.Factory<com.plaid.internal.C0551i5> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f5824a;

    public K1(com.plaid.internal.I1 i1, dagger.internal.Factory factory) {
        this.f5824a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f5824a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        java.io.File cacheDir = application.getCacheDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "");
        return (com.plaid.internal.C0551i5) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0551i5(cacheDir, "plaid-sdk/images"));
    }
}
