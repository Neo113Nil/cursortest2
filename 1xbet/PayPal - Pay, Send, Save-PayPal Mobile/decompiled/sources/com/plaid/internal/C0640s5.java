package com.plaid.internal;

/* renamed from: com.plaid.internal.s5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0640s5 implements dagger.internal.Factory<com.plaid.internal.C0471c5> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f6567a;
    public final javax.inject.Provider<com.plaid.internal.E5> b;
    public final javax.inject.Provider<com.plaid.internal.C0587m5> c;

    public C0640s5(com.plaid.internal.C0623q5 c0623q5, dagger.internal.Factory factory, javax.inject.Provider provider, javax.inject.Provider provider2) {
        this.f6567a = factory;
        this.b = provider;
        this.c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f6567a.get();
        com.plaid.internal.E5 e5 = this.b.get();
        com.plaid.internal.C0587m5 c0587m5 = this.c.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0587m5, "");
        return (com.plaid.internal.C0471c5) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0471c5(application, com.plaid.internal.core.crashreporting.internal.models.SentryProject.LinkSdk.INSTANCE, com.plaid.link.Plaid.getVERSION_NAME(), com.plaid.internal.Z.a.f5983a, e5, c0587m5, new com.plaid.internal.M2(application)));
    }
}
