package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "Lcom/gemalto/mfs/mwsdk/dcm/DigitalizedCardStatus;", "Lcom/paypal/android/taptopay/domain/model/card/GetCardError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ExtensionsKt$getThalesCardStatus$2", f = "Extensions.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ExtensionsKt$getThalesCardStatus$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus, com.paypal.android.taptopay.domain.model.card.GetCardError>>, java.lang.Object> {
    final /* synthetic */ com.gemalto.mfs.mwsdk.dcm.DigitalizedCard Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;

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
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = digitalizedCard;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        com.paypal.android.taptopay.data.thales.card.ExtensionsKt$getThalesCardStatus$2 extensionsKt$getThalesCardStatus$2 = this;
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(extensionsKt$getThalesCardStatus$2));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        digitalizedCard.getCardState(new com.paypal.android.taptopay.data.thales.ThalesAsyncHandlerWrapper(new kotlin.jvm.functions.Function1<com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus>, kotlin.Unit>() { // from class: com.paypal.android.taptopay.data.thales.card.ExtensionsKt$getThalesCardStatus$2$1$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> asyncResult) {
                getHighSpeedVideoFpsRanges(asyncResult);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus> asyncResult) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncResult, "");
                if (asyncResult.isSuccessful()) {
                    kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<? extends com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation = safeContinuation2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(asyncResult.getResult())));
                } else {
                    kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<? extends com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation2 = safeContinuation2;
                    java.lang.String errorMessage = asyncResult.getErrorMessage();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorMessage, "");
                    com.paypal.android.taptopay.domain.Result.Failure failure = new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.GetCardError.DefaultError(errorMessage, asyncResult.getCausingException()));
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m23436constructorimpl(failure));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(extensionsKt$getThalesCardStatus$2);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends com.gemalto.mfs.mwsdk.dcm.DigitalizedCardStatus, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ExtensionsKt$getThalesCardStatus$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ExtensionsKt$getThalesCardStatus$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExtensionsKt$getThalesCardStatus$2(com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ExtensionsKt$getThalesCardStatus$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = digitalizedCard;
    }
}
