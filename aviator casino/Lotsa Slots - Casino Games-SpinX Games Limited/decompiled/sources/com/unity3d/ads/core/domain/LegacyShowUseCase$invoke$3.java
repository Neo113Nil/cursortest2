package com.unity3d.ads.core.domain;

/* compiled from: LegacyShowUseCase.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", i = {}, l = {com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class LegacyShowUseCase$invoke$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $reportShowError;
    /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LegacyShowUseCase$invoke$3(kotlin.jvm.functions.Function6<? super java.lang.String, ? super com.unity3d.ads.UnityAds.UnityAdsShowError, ? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function6, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3> continuation) {
        super(3, continuation);
        this.$reportShowError = function6;
        this.$isBanner = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3(this.$reportShowError, this.$isBanner, continuation);
        legacyShowUseCase$invoke$3.L$0 = th;
        return legacyShowUseCase$invoke$3.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Throwable th = (java.lang.Throwable) this.L$0;
            kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function6 = this.$reportShowError;
            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
            java.lang.String shortenedStackTrace$default = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
            this.label = 1;
            if (function6.invoke("uncaught_exception", unityAdsShowError, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!this.$isBanner) {
            com.unity3d.ads.core.domain.LegacyShowUseCase.Companion companion = com.unity3d.ads.core.domain.LegacyShowUseCase.INSTANCE;
            com.unity3d.ads.core.domain.LegacyShowUseCase.isFullscreenAdShowing = false;
        }
        return kotlin.Unit.INSTANCE;
    }
}
