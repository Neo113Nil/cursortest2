package com.plaid.internal;

/* loaded from: classes16.dex */
public final class S1 implements dagger.internal.Factory<com.plaid.internal.InterfaceC0686x6> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0549i3 f5916a;

    public S1(com.plaid.internal.I1 i1, com.plaid.internal.C0549i3 c0549i3) {
        this.f5916a = c0549i3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.C0630r4 c0630r4 = (com.plaid.internal.C0630r4) this.f5916a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0630r4, "");
        return (com.plaid.internal.InterfaceC0686x6) dagger.internal.Preconditions.checkNotNullFromProvides(c0630r4);
    }
}
