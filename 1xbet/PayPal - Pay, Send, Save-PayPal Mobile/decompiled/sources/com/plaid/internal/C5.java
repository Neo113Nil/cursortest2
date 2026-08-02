package com.plaid.internal;

/* loaded from: classes16.dex */
public final class C5 implements dagger.internal.Factory<com.plaid.internal.H5> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f5763a;

    public C5(com.plaid.internal.C0623q5 c0623q5, dagger.internal.Factory factory) {
        this.f5763a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f5763a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        com.plaid.internal.H5.a aVar = com.plaid.internal.H5.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        com.plaid.internal.H5 h5 = com.plaid.internal.H5.c;
        if (h5 == null) {
            synchronized (aVar) {
                h5 = com.plaid.internal.H5.c;
                if (h5 == null) {
                    android.content.Context applicationContext = application.getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                    h5 = new com.plaid.internal.H5(applicationContext);
                    com.plaid.internal.H5.c = h5;
                }
            }
        }
        return (com.plaid.internal.H5) dagger.internal.Preconditions.checkNotNullFromProvides(h5);
    }
}
