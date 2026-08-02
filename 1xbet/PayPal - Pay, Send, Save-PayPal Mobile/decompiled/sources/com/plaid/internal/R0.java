package com.plaid.internal;

/* loaded from: classes16.dex */
public final class R0 implements com.plaid.internal.M5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.S0 f5902a;

    public R0(com.plaid.internal.S0 s0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s0, "");
        this.f5902a = s0;
    }

    @Override // com.plaid.internal.M5
    public final void a(com.plaid.internal.AbstractC0639s4 abstractC0639s4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0639s4, "");
    }

    @Override // com.plaid.internal.M5
    public final boolean a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            this.f5902a.b(str);
            return true;
        } catch (java.lang.Exception e) {
            com.plaid.internal.C0452a6.a.a(com.plaid.internal.C0452a6.f5996a, e);
            return true;
        }
    }
}
