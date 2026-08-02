package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.persistence.HybridLinkStateStore$storeLinkState$2", f = "HybridLinkStateStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.x1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0681x1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.N2 f6620a;
    public final /* synthetic */ com.plaid.internal.C0690y1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0681x1(com.plaid.internal.N2 n2, com.plaid.internal.C0690y1 c0690y1, kotlin.coroutines.Continuation<? super com.plaid.internal.C0681x1> continuation) {
        super(2, continuation);
        this.f6620a = n2;
        this.b = c0690y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0681x1(this.f6620a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.C0681x1(this.f6620a, this.b, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
        com.plaid.internal.C0452a6.a.a("Store LinkState: ".concat(java.lang.String.valueOf(this.f6620a)), true);
        this.b.d = this.f6620a;
        com.plaid.internal.C0690y1.b(this.b, this.f6620a);
        return kotlin.Unit.INSTANCE;
    }
}
