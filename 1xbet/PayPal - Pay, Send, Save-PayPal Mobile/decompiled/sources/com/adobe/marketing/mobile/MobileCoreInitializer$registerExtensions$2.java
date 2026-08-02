package com.adobe.marketing.mobile;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.MobileCoreInitializer$registerExtensions$2", f = "MobileCoreInitializer.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class MobileCoreInitializer$registerExtensions$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.Set<java.lang.Class<? extends com.adobe.marketing.mobile.Extension>> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.adobe.marketing.mobile.AdobeCallback<?> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.adobe.marketing.mobile.MobileCoreInitializer getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        java.util.Set<java.lang.Class<? extends com.adobe.marketing.mobile.Extension>> set;
        kotlinx.coroutines.sync.Mutex mutex2;
        final com.adobe.marketing.mobile.AdobeCallback<?> adobeCallback;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutex = this.getOutputMinFrameDuration.getInputSizeshNQ4ISI;
            set = this.Camera2StreamConfigurationMap;
            com.adobe.marketing.mobile.AdobeCallback<?> adobeCallback2 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = mutex;
            this.getHighSpeedVideoSizes = set;
            this.getHighSpeedVideoFpsRanges = adobeCallback2;
            this.getHighSpeedVideoSizesFor = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            adobeCallback = adobeCallback2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adobeCallback = (com.adobe.marketing.mobile.AdobeCallback) this.getHighSpeedVideoFpsRanges;
            set = (java.util.Set) this.getHighSpeedVideoSizes;
            mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().registerExtensions(set, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.adobe.marketing.mobile.MobileCoreInitializer$registerExtensions$2$1$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI() {
                    com.adobe.marketing.mobile.AdobeCallback<?> adobeCallback3 = adobeCallback;
                    if (adobeCallback3 != null) {
                        adobeCallback3.call(null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            mutex2.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.MobileCoreInitializer$registerExtensions$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.MobileCoreInitializer$registerExtensions$2(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileCoreInitializer$registerExtensions$2(com.adobe.marketing.mobile.MobileCoreInitializer mobileCoreInitializer, java.util.Set<java.lang.Class<? extends com.adobe.marketing.mobile.Extension>> set, com.adobe.marketing.mobile.AdobeCallback<?> adobeCallback, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.MobileCoreInitializer$registerExtensions$2> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = mobileCoreInitializer;
        this.Camera2StreamConfigurationMap = set;
        this.getHighSpeedVideoFpsRangesFor = adobeCallback;
    }
}
