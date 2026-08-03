package com.unity3d.services;

/* compiled from: UnityAdsSDK.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnityAdsSDK$getToken$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken> $getAsyncHeaderBiddingToken$delegate;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope $getTokenScope;
    final /* synthetic */ com.unity3d.ads.IUnityAdsTokenListener $listener;
    final /* synthetic */ com.unity3d.ads.TokenConfiguration $tokenConfiguration;
    final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.TokenNumberProvider> $tokenNumberProvider$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnityAdsSDK$getToken$2(com.unity3d.ads.TokenConfiguration tokenConfiguration, com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken> lazy, kotlin.Lazy<? extends com.unity3d.ads.core.domain.TokenNumberProvider> lazy2, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK$getToken$2> continuation) {
        super(2, continuation);
        this.$tokenConfiguration = tokenConfiguration;
        this.$listener = iUnityAdsTokenListener;
        this.$getTokenScope = coroutineScope;
        this.$getAsyncHeaderBiddingToken$delegate = lazy;
        this.$tokenNumberProvider$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.UnityAdsSDK$getToken$2(this.$tokenConfiguration, this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, this.$tokenNumberProvider$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.UnityAdsSDK$getToken$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken token$lambda$9;
        com.unity3d.ads.core.domain.TokenNumberProvider token$lambda$8;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            token$lambda$9 = com.unity3d.services.UnityAdsSDK.getToken$lambda$9(this.$getAsyncHeaderBiddingToken$delegate);
            token$lambda$8 = com.unity3d.services.UnityAdsSDK.getToken$lambda$8(this.$tokenNumberProvider$delegate);
            this.label = 1;
            if (token$lambda$9.invoke(token$lambda$8.invoke(), this.$tokenConfiguration, this.$listener, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$getTokenScope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
