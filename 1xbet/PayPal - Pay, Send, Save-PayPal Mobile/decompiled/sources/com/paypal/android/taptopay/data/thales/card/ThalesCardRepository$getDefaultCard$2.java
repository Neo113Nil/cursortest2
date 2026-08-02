package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/android/taptopay/domain/model/card/GetDefaultCardError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getDefaultCard$2", f = "ThalesCardRepository.kt", i = {}, l = {789, 825}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesCardRepository$getDefaultCard$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetDefaultCardError>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r11 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Running getDefaultCard", null, null, 6, null);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getDefaultCard$2 thalesCardRepository$getDefaultCard$2 = this;
            kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(thalesCardRepository$getDefaultCard$2));
            final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
            com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDefault(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, new com.paypal.android.taptopay.data.thales.ThalesAsyncHandlerWrapper(new kotlin.jvm.functions.Function1<com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String>, kotlin.Unit>() { // from class: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getDefaultCard$2$result$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> asyncResult) {
                    getHighSpeedVideoSizes(asyncResult);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String> asyncResult) {
                    com.paypal.android.taptopay.domain.Result.Failure failure;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncResult, "");
                    kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<java.lang.String, com.paypal.android.taptopay.domain.model.card.GetDefaultCardError>> continuation = safeContinuation2;
                    if (asyncResult.isSuccessful()) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Successfully fetched default card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", asyncResult.getResult())), null, 4, null);
                        failure = new com.paypal.android.taptopay.domain.Result.Success(asyncResult.getResult());
                    } else {
                        com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
                        kotlin.Pair[] pairArr = new kotlin.Pair[5];
                        pairArr[0] = kotlin.TuplesKt.to("errorMessage", asyncResult.getErrorMessage());
                        pairArr[1] = kotlin.TuplesKt.to("isSuccessful", java.lang.Boolean.valueOf(asyncResult.isSuccessful()));
                        pairArr[2] = kotlin.TuplesKt.to("errorCode", java.lang.Integer.valueOf(asyncResult.getErrorCode()));
                        java.lang.Throwable causingException = asyncResult.getCausingException();
                        pairArr[3] = kotlin.TuplesKt.to("causeMessage", causingException != null ? causingException.getMessage() : null);
                        pairArr[4] = kotlin.TuplesKt.to("result", asyncResult.getResult());
                        com.paypal.android.logger.Logger.w$default(log, "Failed to fetch default card", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        java.lang.String errorMessage = asyncResult.getErrorMessage();
                        if (errorMessage == null) {
                            errorMessage = "Get default card failure.";
                        }
                        failure = new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.GetDefaultCardError.DefaultError(errorMessage, asyncResult.getCausingException()));
                    }
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(failure));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            }));
            java.lang.Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(thalesCardRepository$getDefaultCard$2);
            }
            if (orThrow != coroutine_suspended) {
                obj = orThrow;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return new com.paypal.android.taptopay.domain.Result.Success(obj);
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.taptopay.domain.Result result = (com.paypal.android.taptopay.domain.Result) obj;
        if (result instanceof com.paypal.android.taptopay.domain.Result.Failure) {
            return new com.paypal.android.taptopay.domain.Result.Failure(((com.paypal.android.taptopay.domain.Result.Failure) result).getError());
        }
        if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        obj = com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.access$getThalesGetDigitizedCardUseCase(this.getHighSpeedVideoSizes).invoke((java.lang.String) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult(), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetDefaultCardError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getDefaultCard$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getDefaultCard$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$getDefaultCard$2(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getDefaultCard$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = thalesCardRepository;
    }
}
