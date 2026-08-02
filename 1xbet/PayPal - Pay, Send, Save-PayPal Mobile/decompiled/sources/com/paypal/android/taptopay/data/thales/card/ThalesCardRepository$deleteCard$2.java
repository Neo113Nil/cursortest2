package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/card/DeleteCardError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2", f = "ThalesCardRepository.kt", i = {}, l = {536}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesCardRepository$deleteCard$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.domain.model.card.DeleteCardError>>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Running delete card operation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", this.getHighSpeedVideoFpsRanges)), null, 4, null);
        final java.lang.String str = this.getHighSpeedVideoFpsRanges;
        final com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = thalesCardRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2 thalesCardRepository$deleteCard$2 = this;
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(thalesCardRepository$deleteCard$2));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        if (com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getConfigurationState() != com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.CONFIGURED) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed delete operation, not initialized", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str)), null, null, 12, null);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.DeleteCardError.InitCheckFailed("Thales MG not initialized.\nWas ThalesMobileGateway.init() call successful?"))));
        } else {
            com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardLifeCycleManager().deleteCard(str, new com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener() { // from class: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2$1$1
                @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
                public final void onSuccess(java.lang.String digitalCardId) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Successfully completed delete operation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str)), null, 4, null);
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2$1$1$onSuccess$1(thalesCardRepository, str, safeContinuation2, null), 3, null);
                }

                @Override // com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener
                public final void onError(java.lang.String digitalCardId, com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError error) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitalCardId, "");
                    com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                    kotlin.Pair[] pairArr = new kotlin.Pair[5];
                    pairArr[0] = kotlin.TuplesKt.to("errorMessage", error != null ? error.getMessage() : null);
                    pairArr[1] = kotlin.TuplesKt.to("sdkCode", error != null ? error.getSDKErrorCode() : null);
                    pairArr[2] = kotlin.TuplesKt.to("statusCode", error != null ? java.lang.Integer.valueOf(error.getHTTPStatusCode()) : null);
                    pairArr[3] = kotlin.TuplesKt.to("serverCode", error != null ? java.lang.Integer.valueOf(error.getServerErrorCode()) : null);
                    pairArr[4] = kotlin.TuplesKt.to("dcID", digitalCardId);
                    com.paypal.android.logger.Logger.e$default(log, "Delete operation failed", kotlin.collections.MapsKt.mapOf(pairArr), null, error != null ? error.getCausingException() : null, 4, null);
                    kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.DeleteCardError>> continuation = safeContinuation2;
                    java.lang.String message = error != null ? error.getMessage() : null;
                    if (message == null) {
                        message = "Delete card failure.";
                    }
                    com.paypal.android.taptopay.domain.Result.Failure failure = new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.DeleteCardError.DefaultError(message, error != null ? error.getCausingException() : null));
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(failure));
                }
            });
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(thalesCardRepository$deleteCard$2);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.domain.model.card.DeleteCardError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$deleteCard$2(java.lang.String str, com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = thalesCardRepository;
    }
}
