package com.unity3d.services;

/* compiled from: UnityAdsSDK.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnityAdsSDK$show$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listener;
    final /* synthetic */ java.lang.String $placementId;
    final /* synthetic */ com.unity3d.ads.core.domain.LegacyShowUseCase $showBoldSDK;
    final /* synthetic */ com.unity3d.ads.UnityAdsShowOptions $showOptions;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope $showScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$show$1(com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase, java.lang.String str, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners listeners, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK$show$1> continuation) {
        super(2, continuation);
        this.$showBoldSDK = legacyShowUseCase;
        this.$placementId = str;
        this.$showOptions = unityAdsShowOptions;
        this.$listener = listeners;
        this.$showScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.UnityAdsSDK$show$1(this.$showBoldSDK, this.$placementId, this.$showOptions, this.$listener, this.$showScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.UnityAdsSDK$show$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$showBoldSDK.invoke(this.$placementId, this.$showOptions, this.$listener, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$showScope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
