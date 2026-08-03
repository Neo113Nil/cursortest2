package com.unity3d.ads.core.domain;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CommonInitAwaitingGetHeaderBiddingToken$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonInitAwaitingGetHeaderBiddingToken$invoke$2(com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = commonInitAwaitingGetHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.collections.ArraysKt.contains(new com.unity3d.ads.core.data.model.InitializationState[]{com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED, com.unity3d.ads.core.data.model.InitializationState.INITIALIZING}, com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(this.this$0.getGetInitializationState(), false, 1, null))) {
                this.this$0.didAwaitInit = true;
                this.label = 1;
                if (com.unity3d.ads.core.domain.AwaitInitialization.DefaultImpls.invoke$default(this.this$0.getAwaitInitialization(), 0L, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
