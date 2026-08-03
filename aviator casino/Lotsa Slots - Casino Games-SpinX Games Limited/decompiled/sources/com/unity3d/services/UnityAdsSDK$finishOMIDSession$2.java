package com.unity3d.services;

/* compiled from: UnityAdsSDK.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$2", f = "UnityAdsSDK.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnityAdsSDK$finishOMIDSession$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.GetAdObject> $getAdObject$delegate;
    final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.om.OmFinishSession> $omFinishSession$delegate;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope $omidScope;
    final /* synthetic */ java.lang.String $opportunityId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnityAdsSDK$finishOMIDSession$2(java.lang.String str, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.Lazy<? extends com.unity3d.ads.core.domain.GetAdObject> lazy, kotlin.Lazy<? extends com.unity3d.ads.core.domain.om.OmFinishSession> lazy2, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK$finishOMIDSession$2> continuation) {
        super(2, continuation);
        this.$opportunityId = str;
        this.$omidScope = coroutineScope;
        this.$getAdObject$delegate = lazy;
        this.$omFinishSession$delegate = lazy2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.UnityAdsSDK$finishOMIDSession$2(this.$opportunityId, this.$omidScope, this.$getAdObject$delegate, this.$omFinishSession$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.UnityAdsSDK$finishOMIDSession$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.domain.GetAdObject finishOMIDSession$lambda$20;
        com.unity3d.ads.core.domain.om.OmFinishSession finishOMIDSession$lambda$21;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            finishOMIDSession$lambda$20 = com.unity3d.services.UnityAdsSDK.finishOMIDSession$lambda$20(this.$getAdObject$delegate);
            com.unity3d.ads.core.data.model.AdObject invoke = finishOMIDSession$lambda$20.invoke(this.$opportunityId);
            if (invoke != null) {
                finishOMIDSession$lambda$21 = com.unity3d.services.UnityAdsSDK.finishOMIDSession$lambda$21(this.$omFinishSession$delegate);
                this.label = 1;
                if (finishOMIDSession$lambda$21.invoke(invoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$omidScope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
