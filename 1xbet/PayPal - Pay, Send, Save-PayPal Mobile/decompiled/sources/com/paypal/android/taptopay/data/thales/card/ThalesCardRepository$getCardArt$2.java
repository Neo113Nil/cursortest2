package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/card/GetCardArtError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCardArt$2", f = "ThalesCardRepository.kt", i = {}, l = {913}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesCardRepository$getCardArt$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends byte[], com.paypal.android.taptopay.domain.model.card.GetCardArtError>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = 1;
        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCardArt$2 thalesCardRepository$getCardArt$2 = this;
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(thalesCardRepository$getCardArt$2));
        final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
        if (com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getConfigurationState() != com.gemalto.mfs.mwsdk.mobilegateway.MGSDKConfigurationState.CONFIGURED) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.GetCardArtError.InitCheckFailed("Thales MG not initialized.\nWas ThalesMobileGateway.init() call successful?"))));
        } else {
            com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardArt(str).getBitmap(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType.CARD_BACKGROUND_COMBINED, new com.paypal.android.taptopay.data.thales.ThalesMGAsyncHandlerWrapper(new kotlin.jvm.functions.Function1<com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap>, kotlin.Unit>() { // from class: com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCardArt$2$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap> mGAsyncResult) {
                    getHighSpeedVideoFpsRangesFor(mGAsyncResult);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(com.gemalto.mfs.mwsdk.mobilegateway.utils.MGAsyncResult<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardBitmap> mGAsyncResult) {
                    com.paypal.android.taptopay.domain.Result.Failure failure;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mGAsyncResult, "");
                    kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<byte[], com.paypal.android.taptopay.domain.model.card.GetCardArtError>> continuation = safeContinuation2;
                    if (mGAsyncResult.isSuccessful()) {
                        failure = new com.paypal.android.taptopay.domain.Result.Success(mGAsyncResult.getResult().getResource());
                    } else {
                        java.lang.String message = mGAsyncResult.getErrorCode().getMessage();
                        if (message == null) {
                            message = "Get card art failure.";
                        }
                        failure = new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.GetCardArtError.DefaultError(message, mGAsyncResult.getErrorCode().getCausingException()));
                    }
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(failure));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            }));
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(thalesCardRepository$getCardArt$2);
        }
        return orThrow == coroutine_suspended ? coroutine_suspended : orThrow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends byte[], com.paypal.android.taptopay.domain.model.card.GetCardArtError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCardArt$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCardArt$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$getCardArt$2(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$getCardArt$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
