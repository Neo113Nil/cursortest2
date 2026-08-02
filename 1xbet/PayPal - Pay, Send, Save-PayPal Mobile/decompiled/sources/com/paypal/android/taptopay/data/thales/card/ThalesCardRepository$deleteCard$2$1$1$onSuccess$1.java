package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2$1$1$onSuccess$1", f = "ThalesCardRepository.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class ThalesCardRepository$deleteCard$2$1$1$onSuccess$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.DeleteCardError>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository = this.getHighSpeedVideoFpsRanges;
                com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type = com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.DELETED;
                java.lang.String str = this.getHighSpeedVideoSizes;
                kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                this.Camera2StreamConfigurationMap = 1;
                highSpeedVideoFpsRanges = thalesCardRepository.getHighSpeedVideoFpsRanges(type, str, kotlin.time.DurationKt.toDuration(1, kotlin.time.DurationUnit.MINUTES), this);
                if (highSpeedVideoFpsRanges == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.DeleteCardError>> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Success(kotlin.Unit.INSTANCE)));
        } catch (kotlinx.coroutines.TimeoutCancellationException e) {
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Delete operation timed out", e);
            kotlin.coroutines.Continuation<com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.DeleteCardError>> continuation2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            continuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.paypal.android.taptopay.domain.Result.Failure(new com.paypal.android.taptopay.domain.model.card.DeleteCardError.DefaultError("Did not get a card state change for DELETED", null, 2, null))));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2$1$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2$1$1$onSuccess$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ThalesCardRepository$deleteCard$2$1$1$onSuccess$1(com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.DeleteCardError>> continuation, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$deleteCard$2$1$1$onSuccess$1> continuation2) {
        super(2, continuation2);
        this.getHighSpeedVideoFpsRanges = thalesCardRepository;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = continuation;
    }
}
