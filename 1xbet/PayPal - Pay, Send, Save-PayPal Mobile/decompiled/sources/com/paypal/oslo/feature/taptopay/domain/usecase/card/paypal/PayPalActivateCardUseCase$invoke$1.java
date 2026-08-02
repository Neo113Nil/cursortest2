package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalAddCardState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase$invoke$1", f = "PayPalActivateCardUseCase.kt", i = {0, 1, 1, 1, 1, 2}, l = {50, 52, 55}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "it", "digitizedCardId", "$i$a$-let-PayPalActivateCardUseCase$invoke$1$1", "$this$channelFlow"}, nl = {51, 55, 56}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalActivateCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (r2.collect(r3, r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r0.send(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState.Failure.CardNotFound.INSTANCE, r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r8 != r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase activateCardUseCase;
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            payPalGetCardIdGroupUseCase = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
            this.getInputSizeshNQ4ISI = producerScope;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = payPalGetCardIdGroupUseCase.invoke(this.getHighSpeedVideoSizes, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                } else if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
        if (cardIdGroup != null) {
            com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase payPalActivateCardUseCase = this.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId digitizedCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(cardIdGroup.getDigitizedCardId().getId());
            activateCardUseCase = payPalActivateCardUseCase.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow invoke$default = com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase.invoke$default(activateCardUseCase, digitizedCardId.getId(), null, 2, null);
            kotlinx.coroutines.flow.FlowCollector flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase$invoke$1$1$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object send = producerScope.send(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.toPayPalAddCardState((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) obj2), continuation);
                    return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                }
            };
            this.getInputSizeshNQ4ISI = producerScope;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCardId);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        } else {
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase$invoke$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase$invoke$1 payPalActivateCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase$invoke$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, continuation);
        payPalActivateCardUseCase$invoke$1.getInputSizeshNQ4ISI = obj;
        return payPalActivateCardUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalActivateCardUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase payPalActivateCardUseCase, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalActivateCardUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = payPalActivateCardUseCase;
        this.getHighSpeedVideoSizes = cardId;
    }
}
