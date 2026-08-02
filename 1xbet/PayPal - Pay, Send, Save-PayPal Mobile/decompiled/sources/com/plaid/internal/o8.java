package com.plaid.internal;

/* loaded from: classes16.dex */
public final class o8 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.plaid.internal.r8> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.p8<com.plaid.internal.u8> f6522a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(com.plaid.internal.p8<com.plaid.internal.u8> p8Var) {
        super(0);
        this.f6522a = p8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.plaid.internal.r8 invoke() {
        com.plaid.internal.r8 r8Var;
        android.os.Bundle arguments = this.f6522a.getArguments();
        if (arguments == null || (r8Var = (com.plaid.internal.r8) arguments.getParcelable("workflow_pane_id")) == null) {
            throw new java.lang.RuntimeException("Needs pane id");
        }
        return r8Var;
    }
}
