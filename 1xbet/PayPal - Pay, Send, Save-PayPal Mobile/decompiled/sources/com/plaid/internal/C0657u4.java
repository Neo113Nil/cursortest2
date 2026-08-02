package com.plaid.internal;

/* renamed from: com.plaid.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0657u4 implements androidx.lifecycle.ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.H1 f6589a;

    public C0657u4(com.plaid.internal.H1 h1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h1, "");
        this.f6589a = h1;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        if (cls.isAssignableFrom(com.plaid.internal.C0702z4.class)) {
            return new com.plaid.internal.C0702z4(this.f6589a);
        }
        throw new com.plaid.internal.B2("Unsupported ViewModel");
    }
}
