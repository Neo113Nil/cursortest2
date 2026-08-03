package com.unity3d.services;

/* compiled from: UnityAdsSDK.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$fetchToken$token$1", f = "UnityAdsSDK.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnityAdsSDK$fetchToken$token$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.GetHeaderBiddingToken> $getHeaderBiddingToken$delegate;
    final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.TokenNumberProvider> $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnityAdsSDK$fetchToken$token$1(kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetHeaderBiddingToken> lazy, kotlin.Lazy<? extends com.unity3d.ads.core.domain.TokenNumberProvider> lazy2, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK$fetchToken$token$1> continuation) {
        super(2, continuation);
        this.$getHeaderBiddingToken$delegate = lazy;
        this.$tokenNumberProvider$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.UnityAdsSDK$fetchToken$token$1(this.$getHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.unity3d.services.UnityAdsSDK$fetchToken$token$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.domain.GetHeaderBiddingToken fetchToken$lambda$11;
        com.unity3d.ads.core.domain.TokenNumberProvider fetchToken$lambda$10;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fetchToken$lambda$11 = com.unity3d.services.UnityAdsSDK.fetchToken$lambda$11(this.$getHeaderBiddingToken$delegate);
            fetchToken$lambda$10 = com.unity3d.services.UnityAdsSDK.fetchToken$lambda$10(this.$tokenNumberProvider$delegate);
            this.label = 1;
            obj = com.unity3d.ads.core.domain.GetHeaderBiddingToken.DefaultImpls.invoke$default(fetchToken$lambda$11, fetchToken$lambda$10.invoke(), null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
