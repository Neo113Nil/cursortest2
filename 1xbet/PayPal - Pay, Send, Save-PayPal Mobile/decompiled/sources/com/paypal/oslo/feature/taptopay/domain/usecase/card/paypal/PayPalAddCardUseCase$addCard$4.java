package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class PayPalAddCardUseCase$addCard$4<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d6, code lost:
    
        if (r14.send(r2, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r14.invoke(r2, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r14.invoke(r8, r2, r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState addCardState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$4$emit$1 payPalAddCardUseCase$addCard$4$emit$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase payPalOnDigitizationCompletedUseCase;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalUploadTermsAndConditionUseCase payPalUploadTermsAndConditionUseCase;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$4$emit$1) {
            payPalAddCardUseCase$addCard$4$emit$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$4$emit$1) continuation;
            if ((payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = payPalAddCardUseCase$addCard$4$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (addCardState instanceof com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "AddCardState DigitizationCompleted", null, null, 6, null);
                        payPalOnDigitizationCompletedUseCase = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(((com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState.Success.DigitizationCompleted) addCardState).getDigitizedCardId()), new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(this.getHighSpeedVideoSizes), this.getHighResolutionOutputSizeshNQ4ISI);
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = this.getHighSpeedVideoFpsRangesFor;
                        payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRanges = addCardState;
                        payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Emitting PayPal add card state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.toPayPalAddCardState(addCardState).getClass()).getSimpleName())), null, 4, null);
                    kotlinx.coroutines.channels.SendChannel<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> sendChannel = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState payPalAddCardState = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.toPayPalAddCardState(addCardState);
                    payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addCardState);
                    payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRangesFor = 3;
                } else if (i == 1) {
                    addCardState = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    payPalUploadTermsAndConditionUseCase = this.getOutputFormats.getOutputMinFrameDuration;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = this.getHighResolutionOutputSizeshNQ4ISI;
                    payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRanges = addCardState;
                    payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRangesFor = 2;
                } else if (i == 2) {
                    addCardState = (com.paypal.oslo.feature.taptopay.domain.model.card.AddCardState) payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Emitting PayPal add card state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.toPayPalAddCardState(addCardState).getClass()).getSimpleName())), null, 4, null);
                    kotlinx.coroutines.channels.SendChannel<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> sendChannel2 = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState payPalAddCardState2 = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardStateKt.toPayPalAddCardState(addCardState);
                    payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addCardState);
                    payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRangesFor = 3;
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        payPalAddCardUseCase$addCard$4$emit$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$4$emit$1(this, continuation);
        java.lang.Object obj2 = payPalAddCardUseCase$addCard$4$emit$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalAddCardUseCase$addCard$4$emit$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    PayPalAddCardUseCase$addCard$4(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase payPalAddCardUseCase, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, kotlinx.coroutines.channels.SendChannel<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalAddCardState> sendChannel) {
        this.getOutputFormats = payPalAddCardUseCase;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = deviceWalletServiceCardId;
        this.Camera2StreamConfigurationMap = cardInfo;
        this.getHighSpeedVideoFpsRangesFor = cardArtCollection;
        this.getHighSpeedVideoFpsRanges = sendChannel;
    }
}
