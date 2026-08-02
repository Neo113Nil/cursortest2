package com.plaid.internal;

/* loaded from: classes16.dex */
public final class O1 implements dagger.internal.Factory<com.plaid.internal.C0632r6> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f5868a;
    public final com.plaid.internal.W1 b;

    public O1(com.plaid.internal.I1 i1, dagger.internal.Factory factory, com.plaid.internal.W1 w1) {
        this.f5868a = factory;
        this.b = w1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f5868a.get();
        com.plaid.internal.InterfaceC0535g7 interfaceC0535g7 = (com.plaid.internal.InterfaceC0535g7) this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0535g7, "");
        return (com.plaid.internal.C0632r6) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0632r6(application.getApplicationContext(), interfaceC0535g7));
    }
}
