package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$activateCard$1", f = "ThalesCardRepository.kt", i = {}, l = {372, 380}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesCardRepository$activateCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.card.ThalesCardRepository getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (com.paypal.android.taptopay.data.thales.card.ThalesCardRepository.access$digitizePendingCard(r11.getHighResolutionOutputSizeshNQ4ISI, r12, r1, r11) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        if (r12.send(new com.paypal.android.taptopay.domain.model.card.AddCardState.Failure.ActivationFailed("No pending activation for ".concat(java.lang.String.valueOf(r11.getHighSpeedVideoSizes)), null, 2, null), r11) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Running activate card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", this.getHighSpeedVideoSizes)), null, 4, null);
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation pendingCardActivation = com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayManager.INSTANCE.getCardEnrollmentService().getPendingCardActivation(this.getHighSpeedVideoSizes);
            if (pendingCardActivation != null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Pending activation found, starting digitization", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", this.getHighSpeedVideoSizes)), null, 4, null);
                this.Camera2StreamConfigurationMap = 1;
            } else {
                com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "No pending activation for card, ignoring request", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", this.getHighSpeedVideoSizes)), null, 4, null);
                this.Camera2StreamConfigurationMap = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.android.taptopay.domain.model.card.AddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$activateCard$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$activateCard$1 thalesCardRepository$activateCard$1 = new com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$activateCard$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        thalesCardRepository$activateCard$1.getHighSpeedVideoFpsRangesFor = obj;
        return thalesCardRepository$activateCard$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesCardRepository$activateCard$1(java.lang.String str, com.paypal.android.taptopay.data.thales.card.ThalesCardRepository thalesCardRepository, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesCardRepository$activateCard$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = thalesCardRepository;
    }
}
