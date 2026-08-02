package com.adobe.marketing.mobile;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.MobileCoreInitializer$setApplication$1", f = "MobileCoreInitializer.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class MobileCoreInitializer$setApplication$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.adobe.marketing.mobile.MobileCoreInitializer Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutex = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = mutex;
            this.getHighSpeedVideoFpsRanges = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            try {
                new com.adobe.marketing.mobile.internal.migration.V4Migrator().migrate();
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Migration from V4 SDK failed with error - ");
                sb.append(e.getLocalizedMessage());
                com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.MobileCoreInitializer.LOG_TAG, sb.toString(), new java.lang.Object[0]);
            }
            try {
                com.adobe.marketing.mobile.internal.migration.V5LegacyCleaner.INSTANCE.cleanup();
            } catch (java.lang.Exception e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to clean the V5 legacy data due to an error - ");
                sb2.append(e2.getLocalizedMessage());
                com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.MobileCoreInitializer.LOG_TAG, sb2.toString(), new java.lang.Object[0]);
            }
            com.adobe.marketing.mobile.internal.eventhub.EventHub.INSTANCE.getShared().initializeEventHistory();
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
        return ((com.adobe.marketing.mobile.MobileCoreInitializer$setApplication$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.MobileCoreInitializer$setApplication$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileCoreInitializer$setApplication$1(com.adobe.marketing.mobile.MobileCoreInitializer mobileCoreInitializer, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.MobileCoreInitializer$setApplication$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = mobileCoreInitializer;
    }
}
