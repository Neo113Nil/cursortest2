package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class PayPalAddCardUseCase$invoke$1$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint getInputFormats;
    final /* synthetic */ java.lang.String getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase.access$addCard(r1, r14, r3, r4, r5, r6, r7, r8, r9, r10, r11) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r14.invoke(r3, r11) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r14.send(r1, r11) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1$emit$1 payPalAddCardUseCase$invoke$1$1$1$emit$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardIdGroupUseCase payPalDeleteCardIdGroupUseCase;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1$emit$1) {
            payPalAddCardUseCase$invoke$1$1$1$emit$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1$emit$1) continuation;
            if ((payPalAddCardUseCase$invoke$1$1$1$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                payPalAddCardUseCase$invoke$1$1$1$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1$emit$1 payPalAddCardUseCase$invoke$1$1$1$emit$12 = payPalAddCardUseCase$invoke$1$1$1$emit$1;
                java.lang.Object obj = payPalAddCardUseCase$invoke$1$1$1$emit$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalAddCardUseCase$invoke$1$1$1$emit$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Failure.ContinueAddCardError) {
                        payPalDeleteCardIdGroupUseCase = this.getHighSpeedVideoSizesFor.getInputFormats;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(this.getOutputFormats);
                        payPalAddCardUseCase$invoke$1$1$1$emit$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addCardState);
                        payPalAddCardUseCase$invoke$1$1$1$emit$12.getHighSpeedVideoFpsRanges = 1;
                    } else {
                        kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> producerScope = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState payPalAddCardState = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.toPayPalAddCardState(addCardState);
                        payPalAddCardUseCase$invoke$1$1$1$emit$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addCardState);
                        payPalAddCardUseCase$invoke$1$1$1$emit$12.getHighSpeedVideoFpsRanges = 3;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                addCardState = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) payPalAddCardUseCase$invoke$1$1$1$emit$12.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase = this.getHighSpeedVideoSizesFor;
                kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> producerScope2 = this.Camera2StreamConfigurationMap;
                java.lang.String str = this.getOutputFormats;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType = this.getHighSpeedVideoSizes;
                java.lang.String str2 = this.getInputSizeshNQ4ISI;
                java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint = this.getInputFormats;
                com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault = this.getOutputMinFrameDuration;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = this.getHighSpeedVideoFpsRangesFor;
                payPalAddCardUseCase$invoke$1$1$1$emit$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addCardState);
                payPalAddCardUseCase$invoke$1$1$1$emit$12.getHighSpeedVideoFpsRanges = 2;
            }
        }
        payPalAddCardUseCase$invoke$1$1$1$emit$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1$emit$1(this, continuation);
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1$emit$1 payPalAddCardUseCase$invoke$1$1$1$emit$122 = payPalAddCardUseCase$invoke$1$1$1$emit$1;
        java.lang.Object obj2 = payPalAddCardUseCase$invoke$1$1$1$emit$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalAddCardUseCase$invoke$1$1$1$emit$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    PayPalAddCardUseCase$invoke$1$1$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase, java.lang.String str, kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> producerScope, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo) {
        this.getHighSpeedVideoSizesFor = payPalAddCardUseCase;
        this.getOutputFormats = str;
        this.Camera2StreamConfigurationMap = producerScope;
        this.getHighSpeedVideoSizes = cardType;
        this.getInputSizeshNQ4ISI = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
        this.getInputFormats = flowEntryPoint;
        this.getOutputMinFrameDuration = setAsDefault;
        this.getHighSpeedVideoFpsRanges = cardArtCollection;
        this.getHighSpeedVideoFpsRangesFor = cardInfo;
    }
}
