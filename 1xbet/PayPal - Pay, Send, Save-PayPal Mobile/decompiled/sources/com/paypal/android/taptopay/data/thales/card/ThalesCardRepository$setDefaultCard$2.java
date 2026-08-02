package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/card/SetDefaultCardError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2", f = "ThalesCardRepository.kt", i = {0}, l = {838}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes10.dex */
final class ThalesCardRepository$setDefaultCard$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SetDefaultCardError>>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard;
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
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Running setDefaultCard", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", this.Camera2StreamConfigurationMap)), null, 4, null);
        final java.lang.String str = this.Camera2StreamConfigurationMap;
        final com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
        this.getOutputFormats = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = thalesCardRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2 thalesCardRepository$setDefaultCard$2 = this;
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(thalesCardRepository$setDefaultCard$2));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        try {
            try {
                digitalizedCard = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalizedCard(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getTokenizedCardId(str));
            } catch (java.lang.Throwable th) {
                com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Set default failed to get digitalized card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", th.getMessage())), null, 4, null);
                digitalizedCard = null;
            }
            if ((digitalizedCard != null ? digitalizedCard.setDefault(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, new com.paypal.android.taptopay.data.thales.ThalesAsyncHandlerWrapper(new kotlin.jvm.functions.Function1<com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void>, kotlin.Unit>() { // from class: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> asyncResult) {
                    getHighResolutionOutputSizeshNQ4ISI(asyncResult);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> asyncResult) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncResult, "");
                    if (asyncResult.isSuccessful()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Successfully set default card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str)), null, 4, null);
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2$1$1.AnonymousClass1(thalesCardRepository, safeContinuation2, null), 3, null);
                        return;
                    }
                    com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    pairArr[0] = kotlin.TuplesKt.to("errorMessage", asyncResult.getErrorMessage());
                    pairArr[1] = kotlin.TuplesKt.to("errorCode", java.lang.Integer.valueOf(asyncResult.getErrorCode()));
                    java.lang.Throwable causingException = asyncResult.getCausingException();
                    pairArr[2] = kotlin.TuplesKt.to("causeMessage", causingException != null ? causingException.getMessage() : null);
                    com.paypal.android.logger.Logger.w$default(log, "Set default card failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SetDefaultCardError>> continuation = safeContinuation2;
                    java.lang.String errorMessage = asyncResult.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = "Set default card failure.";
                    }
                    com.paypal.android.taptopay.domain.Result.Failure failure = new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.SetDefaultCardError.DefaultError(errorMessage, asyncResult.getCausingException()));
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(failure));
                }

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2$1$1$1", f = "ThalesCardRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2$1$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SetDefaultCardError>> getHighSpeedVideoFpsRanges;
                    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource;
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            cardDataSource = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                            cardDataSource.rehydrate$tap_to_pay_data_thales_release();
                            kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SetDefaultCardError>> continuation = this.getHighSpeedVideoFpsRanges;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            continuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE)));
                            return kotlin.Unit.INSTANCE;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SetDefaultCardError>> continuation, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2$1$1.AnonymousClass1> continuation2) {
                        super(2, continuation2);
                        this.getHighSpeedVideoSizes = thalesCardRepository;
                        this.getHighSpeedVideoFpsRanges = continuation;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            })) : null) == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Set default failed due to null digitalized card", null, null, 6, null);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(com.paypal.android.taptopay.domain.model.card.SetDefaultCardError.CardNotFound.INSTANCE)));
            }
        } catch (java.lang.Throwable th2) {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Set default failed to get tokenized card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", th2.getMessage())), null, 4, null);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(com.paypal.android.taptopay.domain.model.card.SetDefaultCardError.CardNotFound.INSTANCE)));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(thalesCardRepository$setDefaultCard$2);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SetDefaultCardError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2 thalesCardRepository$setDefaultCard$2 = new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        thalesCardRepository$setDefaultCard$2.getOutputFormats = obj;
        return thalesCardRepository$setDefaultCard$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$setDefaultCard$2(java.lang.String str, com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$setDefaultCard$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = thalesCardRepository;
    }
}
