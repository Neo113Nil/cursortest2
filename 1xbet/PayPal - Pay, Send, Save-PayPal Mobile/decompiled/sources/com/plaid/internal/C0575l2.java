package com.plaid.internal;

/* renamed from: com.plaid.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0575l2 implements androidx.lifecycle.ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.InterfaceC0449a3 f6472a;

    public C0575l2(com.plaid.internal.InterfaceC0449a3 interfaceC0449a3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0449a3, "");
        this.f6472a = interfaceC0449a3;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return new com.plaid.internal.C0557j2(this.f6472a);
    }
}
