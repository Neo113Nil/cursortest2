package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$1", f = "ThalesDigitizeCardUseCase.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesDigitizeCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Running ThalesDigitizeCardUseCase with T&C session", null, null, 6, null);
            com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardEnrollmentService().digitizeCard(this.getHighSpeedVideoSizes, null, com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.access$createMGDigitizationListener(this.getHighResolutionOutputSizeshNQ4ISI, producerScope.getChannel()));
            this.getHighSpeedVideoFpsRangesFor = 1;
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
        return ((com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$1 thalesDigitizeCardUseCase$invoke$1 = new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        thalesDigitizeCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = obj;
        return thalesDigitizeCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesDigitizeCardUseCase$invoke$1(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession termsAndConditionSession, com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = termsAndConditionSession;
        this.getHighResolutionOutputSizeshNQ4ISI = thalesDigitizeCardUseCase;
    }
}
