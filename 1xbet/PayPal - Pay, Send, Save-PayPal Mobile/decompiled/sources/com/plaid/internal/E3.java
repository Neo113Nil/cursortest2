package com.plaid.internal;

/* loaded from: classes3.dex */
public final class E3 implements androidx.lifecycle.ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.H1 f5779a;

    public E3(com.plaid.internal.H1 h1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h1, "");
        this.f5779a = h1;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        if (cls.isAssignableFrom(com.plaid.internal.D3.class)) {
            return new com.plaid.internal.D3(this.f5779a);
        }
        throw new com.plaid.internal.B2("Unsupported ViewModel");
    }
}
