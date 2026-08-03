package com.unity3d.services;

/* compiled from: UnityAdsSDK.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnityAdsSDK$load$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.banners.UnityBannerSize $bannerSize;
    final /* synthetic */ kotlin.Lazy<android.content.Context> $context$delegate;
    final /* synthetic */ com.unity3d.ads.IUnityAdsLoadListener $listener;
    final /* synthetic */ com.unity3d.ads.UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope $loadScope;
    final /* synthetic */ java.lang.String $placementId;
    int label;
    final /* synthetic */ com.unity3d.services.UnityAdsSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnityAdsSDK$load$1(com.unity3d.services.UnityAdsSDK unityAdsSDK, java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize unityBannerSize, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.Lazy<? extends android.content.Context> lazy, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK$load$1> continuation) {
        super(2, continuation);
        this.this$0 = unityAdsSDK;
        this.$placementId = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$listener = iUnityAdsLoadListener;
        this.$bannerSize = unityBannerSize;
        this.$loadScope = coroutineScope;
        this.$context$delegate = lazy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.UnityAdsSDK$load$1(this.this$0, this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.UnityAdsSDK$load$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context load$lambda$6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase = (com.unity3d.ads.core.domain.LegacyLoadUseCase) this.this$0.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.LegacyLoadUseCase.class));
            load$lambda$6 = com.unity3d.services.UnityAdsSDK.load$lambda$6(this.$context$delegate);
            this.label = 1;
            if (legacyLoadUseCase.invoke(load$lambda$6, this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$loadScope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
