package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalOnDigitizationCompletedUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalAddCardIdMappingInDbUseCase;", "payPalAddCardIdMappingInDbUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetCardArtUseCase;", "payPalSetCardArtUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalAddCardIdMappingInDbUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetCardArtUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "idGroup", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;", "cardInfo", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "cardArtCollection", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalAddCardIdMappingInDbUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetCardArtUseCase;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalOnDigitizationCompletedUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetCardArtUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardIdMappingInDbUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PayPalOnDigitizationCompletedUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardIdMappingInDbUseCase payPalAddCardIdMappingInDbUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetCardArtUseCase payPalSetCardArtUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalAddCardIdMappingInDbUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalSetCardArtUseCase, "");
        this.getHighSpeedVideoSizes = payPalAddCardIdMappingInDbUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalSetCardArtUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0113, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        if (r3 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r3.invoke(r1, r2, r4) == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase$invoke$1 payPalOnDigitizationCompletedUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup2 = cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo2 = cardInfo;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase$invoke$1) {
            payPalOnDigitizationCompletedUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase$invoke$1) continuation;
            if ((payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = payPalOnDigitizationCompletedUseCase$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Invoking PayPalOnDigitizationCompletedUseCase", null, null, 6, null);
                    if (cardInfo2 != null) {
                        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardIdMappingInDbUseCase payPalAddCardIdMappingInDbUseCase = this.getHighSpeedVideoSizes;
                        payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = cardIdGroup2;
                        payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardInfo);
                        cardArtCollection2 = cardArtCollection;
                        payPalOnDigitizationCompletedUseCase$invoke$1.Camera2StreamConfigurationMap = cardArtCollection2;
                        payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardInfo);
                        payPalOnDigitizationCompletedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoSizesFor = 1;
                    } else {
                        cardArtCollection2 = cardArtCollection;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "cardInfo is null", null, null, 6, null);
                    }
                } else if (i == 1) {
                    int i2 = payPalOnDigitizationCompletedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) payPalOnDigitizationCompletedUseCase$invoke$1.Camera2StreamConfigurationMap;
                    cardInfo2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    cardArtCollection2 = cardArtCollection3;
                    cardIdGroup2 = cardIdGroup3;
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = payPalOnDigitizationCompletedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    cardIdGroup2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either either = (arrow.core.Either) obj;
                    if (either.isLeft()) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetCardArtError payPalSetCardArtError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetCardArtError) ((arrow.core.Either.Left) either).getValue();
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to set card art during post-digitization", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("debug_message", payPalSetCardArtError.getDebugMessage()), kotlin.TuplesKt.to("paypal_card_id", cardIdGroup2.getPayPalCardId().getId())), null, payPalSetCardArtError.getThrowable(), 4, null);
                    }
                }
                if (cardArtCollection2 != null) {
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetCardArtUseCase payPalSetCardArtUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId = cardIdGroup2.getPayPalCardId();
                    payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = cardIdGroup2;
                    payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardInfo2);
                    payPalOnDigitizationCompletedUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardArtCollection2);
                    payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardArtCollection2);
                    payPalOnDigitizationCompletedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoSizesFor = 2;
                    obj = payPalSetCardArtUseCase.invoke(payPalCardId, cardArtCollection2, payPalOnDigitizationCompletedUseCase$invoke$1);
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "cardArtCollection is null", null, null, 6, null);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return kotlin.Unit.INSTANCE;
            }
        }
        payPalOnDigitizationCompletedUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalOnDigitizationCompletedUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = payPalOnDigitizationCompletedUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalOnDigitizationCompletedUseCase$invoke$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        if (cardArtCollection2 != null) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "cardArtCollection is null", null, null, 6, null);
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        return kotlin.Unit.INSTANCE;
    }
}
