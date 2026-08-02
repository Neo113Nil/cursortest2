package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class PayPalAddCardUseCase$addCard$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase getInputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase.access$addCard(r1, r13, r3, r5, r6, r7, r8, r10, r9) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r13.send(r1, r9) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r13.send(r1, r9) == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState payPalPrepareAddCardState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2$emit$1 payPalAddCardUseCase$addCard$2$emit$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2$emit$1) {
            payPalAddCardUseCase$addCard$2$emit$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2$emit$1) continuation;
            if ((payPalAddCardUseCase$addCard$2$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                payPalAddCardUseCase$addCard$2$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2$emit$1 payPalAddCardUseCase$addCard$2$emit$12 = payPalAddCardUseCase$addCard$2$emit$1;
                java.lang.Object obj = payPalAddCardUseCase$addCard$2$emit$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalAddCardUseCase$addCard$2$emit$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (payPalPrepareAddCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess) {
                        kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> producerScope = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState access$toPaypalAddCardState = com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase.access$toPaypalAddCardState(this.getInputFormats, payPalPrepareAddCardState);
                        payPalAddCardUseCase$addCard$2$emit$12.getHighSpeedVideoFpsRangesFor = payPalPrepareAddCardState;
                        payPalAddCardUseCase$addCard$2$emit$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    } else {
                        kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> producerScope2 = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState access$toPaypalAddCardState2 = com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase.access$toPaypalAddCardState(this.getInputFormats, payPalPrepareAddCardState);
                        payPalAddCardUseCase$addCard$2$emit$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalPrepareAddCardState);
                        payPalAddCardUseCase$addCard$2$emit$12.getHighResolutionOutputSizeshNQ4ISI = 3;
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
                payPalPrepareAddCardState = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState) payPalAddCardUseCase$addCard$2$emit$12.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase = this.getInputFormats;
                kotlinx.coroutines.channels.ProducerScope<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> producerScope3 = this.getHighSpeedVideoSizes;
                java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess prepareAddCardSuccess = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardState.Success.PrepareAddCardSuccess) payPalPrepareAddCardState;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = prepareAddCardSuccess.getDeviceWalletServiceCardId();
                byte[] encryptedCardInfo = prepareAddCardSuccess.getEncryptedCardInfo();
                com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = this.getHighSpeedVideoFpsRangesFor;
                payPalAddCardUseCase$addCard$2$emit$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalPrepareAddCardState);
                payPalAddCardUseCase$addCard$2$emit$12.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        payPalAddCardUseCase$addCard$2$emit$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2$emit$1(this, continuation);
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2$emit$1 payPalAddCardUseCase$addCard$2$emit$122 = payPalAddCardUseCase$addCard$2$emit$1;
        java.lang.Object obj2 = payPalAddCardUseCase$addCard$2$emit$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalAddCardUseCase$addCard$2$emit$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    PayPalAddCardUseCase$addCard$2(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> producerScope, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault setAsDefault, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo) {
        this.getHighSpeedVideoSizes = producerScope;
        this.getInputFormats = payPalAddCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = setAsDefault;
        this.Camera2StreamConfigurationMap = cardArtCollection;
        this.getHighSpeedVideoFpsRangesFor = cardInfo;
    }
}
