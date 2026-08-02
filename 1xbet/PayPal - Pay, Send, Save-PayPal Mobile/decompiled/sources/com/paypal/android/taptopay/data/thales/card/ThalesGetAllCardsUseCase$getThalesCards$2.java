package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "", "Lcom/paypal/android/taptopay/domain/model/card/GetAllCardsError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$getThalesCards$2", f = "ThalesGetAllCardsUseCase.kt", i = {}, l = {54, 68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesGetAllCardsUseCase$getThalesCards$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.lang.String[], com.paypal.android.taptopay.domain.model.card.GetAllCardsError>>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r6 == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$getThalesCards$2 thalesGetAllCardsUseCase$getThalesCards$2 = this;
            kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(thalesGetAllCardsUseCase$getThalesCards$2));
            final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
            com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getAllCards(new com.paypal.android.taptopay.data.thales.ThalesAsyncHandlerWrapper(new kotlin.jvm.functions.Function1<com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String[]>, kotlin.Unit>() { // from class: com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$getThalesCards$2$result$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String[]> asyncResult) {
                    getHighResolutionOutputSizeshNQ4ISI(asyncResult);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String[]> asyncResult) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncResult, "");
                    kotlin.coroutines.Continuation<com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.String[]>> continuation = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(asyncResult));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            }));
            java.lang.Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(thalesGetAllCardsUseCase$getThalesCards$2);
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
            return (com.paypal.android.taptopay.domain.Result) obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult asyncResult = (com.gemalto.mfs.mwsdk.utils.async.AsyncResult) obj;
        if (asyncResult.isSuccessful()) {
            return new com.paypal.android.taptopay.domain.Result.Success(asyncResult.getResult());
        }
        if (asyncResult.getErrorCode() == 1015) {
            highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges) {
                com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase thalesGetAllCardsUseCase = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = 2;
                obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$getThalesCards$2(thalesGetAllCardsUseCase, null), this);
            }
        }
        java.lang.String errorMessage = asyncResult.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "";
        }
        return new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.GetAllCardsError.DefaultError(errorMessage, asyncResult.getCausingException()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.lang.String[], com.paypal.android.taptopay.domain.model.card.GetAllCardsError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$getThalesCards$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$getThalesCards$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesGetAllCardsUseCase$getThalesCards$2(com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase thalesGetAllCardsUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$getThalesCards$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = thalesGetAllCardsUseCase;
    }
}
