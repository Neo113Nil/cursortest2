package com.adobe.marketing.mobile;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.MobileCoreInitializer$initialize$1", f = "MobileCoreInitializer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class MobileCoreInitializer$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.adobe.marketing.mobile.InitOptions Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.adobe.marketing.mobile.MobileCoreInitializer getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.LifecycleOwner lifecycleOwner;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.adobe.marketing.mobile.MobileCoreInitializer mobileCoreInitializer = this.getHighSpeedVideoSizes;
        com.adobe.marketing.mobile.LifecycleTracker lifecycleTracker = new com.adobe.marketing.mobile.LifecycleTracker(this.Camera2StreamConfigurationMap.getLifecycleAdditionalContextData());
        lifecycleOwner = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
        lifecycleOwner.getLifecycle().addObserver(lifecycleTracker);
        mobileCoreInitializer.getHighSpeedVideoFpsRanges = lifecycleTracker;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.MobileCoreInitializer$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.MobileCoreInitializer$initialize$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileCoreInitializer$initialize$1(com.adobe.marketing.mobile.MobileCoreInitializer mobileCoreInitializer, com.adobe.marketing.mobile.InitOptions initOptions, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.MobileCoreInitializer$initialize$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mobileCoreInitializer;
        this.Camera2StreamConfigurationMap = initOptions;
    }
}
