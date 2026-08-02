package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$2", f = "ThalesDigitizeCardUseCase.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesDigitizeCardUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.android.taptopay.data.thales.card.CardDataSource cardDataSource;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Running ThalesDigitizeCardUseCase when enrollment in progress", null, null, 6, null);
            com.gemalto.mfs.mwsdk.provisioning.sdkconfig.EnrollingBusinessService enrollingBusinessService = com.gemalto.mfs.mwsdk.provisioning.ProvisioningServiceManager.getEnrollingBusinessService();
            java.lang.String language = java.util.Locale.getDefault().getLanguage();
            cardDataSource = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            coroutineDispatcher = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            enrollingBusinessService.continueEnrollment(language, new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.EnrollingServiceListener(producerScope, null, cardDataSource, coroutineDispatcher));
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose$default(producerScope, null, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$2) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$2 thalesDigitizeCardUseCase$invoke$2 = new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$2(this.getHighSpeedVideoFpsRanges, continuation);
        thalesDigitizeCardUseCase$invoke$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return thalesDigitizeCardUseCase$invoke$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesDigitizeCardUseCase$invoke$2(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = thalesDigitizeCardUseCase;
    }
}
