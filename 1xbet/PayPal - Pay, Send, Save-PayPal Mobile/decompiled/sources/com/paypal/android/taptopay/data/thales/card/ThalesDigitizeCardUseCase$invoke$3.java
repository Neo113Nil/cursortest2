package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesDigitizeCardState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$3", f = "ThalesDigitizeCardUseCase.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesDigitizeCardUseCase$invoke$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.Camera2StreamConfigurationMap;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Running ThalesDigitizeCardUseCase for pending activation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", this.getHighSpeedVideoFpsRanges.getState())), null, 4, null);
            if (this.getHighSpeedVideoFpsRanges.getState() == com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState.APP2APP_NEEDED) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Triggering activate for APP2APP_NEEDED", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", this.getHighSpeedVideoFpsRanges.getState())), null, 4, null);
                this.getHighSpeedVideoFpsRanges.activate(com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.access$createMGDigitizationListener(this.getHighSpeedVideoFpsRangesFor, producerScope.getChannel()));
            } else {
                com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.access$handlePendingActivation(thalesDigitizeCardUseCase, producerScope, this.getHighSpeedVideoFpsRanges, com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase.access$createMGDigitizationListener(thalesDigitizeCardUseCase, producerScope.getChannel()));
            }
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
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
        return ((com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$3) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$3 thalesDigitizeCardUseCase$invoke$3 = new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$3(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        thalesDigitizeCardUseCase$invoke$3.Camera2StreamConfigurationMap = obj;
        return thalesDigitizeCardUseCase$invoke$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesDigitizeCardUseCase$invoke$3(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation pendingCardActivation, com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase thalesDigitizeCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$invoke$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = pendingCardActivation;
        this.getHighSpeedVideoFpsRangesFor = thalesDigitizeCardUseCase;
    }
}
