package com.plaid.internal;

@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$maybePreloadLink$3$1", f = "PreloadLinkController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.g6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0534g6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.link.OnLoadCallback f6421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0534g6(com.plaid.link.OnLoadCallback onLoadCallback, kotlin.coroutines.Continuation<? super com.plaid.internal.C0534g6> continuation) {
        super(2, continuation);
        this.f6421a = onLoadCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.plaid.internal.C0534g6(this.f6421a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.plaid.internal.C0534g6(this.f6421a, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f6421a.onLoad();
        return kotlin.Unit.INSTANCE;
    }
}
