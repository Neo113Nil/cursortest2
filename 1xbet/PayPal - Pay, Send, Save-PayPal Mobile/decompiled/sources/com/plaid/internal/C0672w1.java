package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$getCurrentLinkState$2", f = "HybridLinkStateStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.w1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0672w1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.N2>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.C0690y1 f6605a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0672w1(com.plaid.internal.C0690y1 c0690y1, kotlin.coroutines.Continuation<? super com.plaid.internal.C0672w1> continuation) {
        super(2, continuation);
        this.f6605a = c0690y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0672w1(this.f6605a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.plaid.internal.N2> continuation) {
        return new com.plaid.internal.C0672w1(this.f6605a, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.plaid.internal.N2 n2;
        com.plaid.internal.N2 n22;
        com.plaid.internal.N2 n23;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        n2 = this.f6605a.d;
        if (n2 == null) {
            com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
            com.plaid.internal.C0452a6.a.a("Initializing statestore", true);
            com.plaid.internal.C0690y1 c0690y1 = this.f6605a;
            c0690y1.d = com.plaid.internal.C0690y1.b(c0690y1);
        }
        com.plaid.internal.C0452a6.a aVar2 = com.plaid.internal.C0452a6.f5996a;
        n22 = this.f6605a.d;
        com.plaid.internal.C0452a6.a.a("Get current LinkState: ".concat(java.lang.String.valueOf(n22)), true);
        n23 = this.f6605a.d;
        kotlin.jvm.internal.Intrinsics.checkNotNull(n23);
        return n23;
    }
}
