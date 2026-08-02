package com.plaid.internal;

/* loaded from: classes16.dex */
public final class M7 implements com.plaid.internal.B6, com.plaid.internal.B8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.T3 f5846a;

    public M7(com.plaid.internal.T3 t3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        this.f5846a = t3;
    }

    @Override // com.plaid.internal.B6
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.SuspendLambda suspendLambda) {
        java.lang.Object a2 = this.f5846a.a("webview_fallback_id_state", suspendLambda);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    @Override // com.plaid.internal.B6
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        return this.f5846a.a("webview_fallback_id_state", "webview_fallback_id", continuationImpl);
    }

    @Override // com.plaid.internal.B8
    public final java.lang.Object a(java.lang.String str, com.plaid.internal.C0637s2 c0637s2) {
        java.lang.Object a2 = this.f5846a.a("webview_fallback_id_state", "webview_fallback_id", str, c0637s2);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
