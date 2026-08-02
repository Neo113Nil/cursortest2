package com.plaid.internal;

/* loaded from: classes3.dex */
public final class v8 implements androidx.lifecycle.ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.p8.a f6602a;
    public final com.plaid.internal.H1 b;

    public v8(com.plaid.internal.p8.a aVar, com.plaid.internal.H1 h1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h1, "");
        this.f6602a = aVar;
        this.b = h1;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        java.lang.Object invoke = this.f6602a.invoke(this.b);
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        return (T) invoke;
    }
}
