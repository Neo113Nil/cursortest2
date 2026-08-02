package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/ResolveDefaultCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "getAllCardsUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "Lcom/paypal/oslo/feature/taptopay/domain/model/card/SetAsDefault;", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResolveDefaultCardUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ResolveDefaultCardUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetAllCardsUseCase, "");
        this.Camera2StreamConfigurationMap = payPalGetAllCardsUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.ResolveDefaultCardUseCase$invoke$1 resolveDefaultCardUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.ResolveDefaultCardUseCase$invoke$1) {
            resolveDefaultCardUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.ResolveDefaultCardUseCase$invoke$1) continuation;
            if ((resolveDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                resolveDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.taptopay.domain.usecase.card.ResolveDefaultCardUseCase$invoke$1 resolveDefaultCardUseCase$invoke$12 = resolveDefaultCardUseCase$invoke$1;
                java.lang.Object obj = resolveDefaultCardUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = resolveDefaultCardUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (cardType == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayLaterToGo card - using IF_FIRST_CARD", null, null, 6, null);
                        return com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.IF_FIRST_CARD;
                    }
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase = this.Camera2StreamConfigurationMap;
                    resolveDefaultCardUseCase$invoke$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardType);
                    resolveDefaultCardUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase.invoke$default(payPalGetAllCardsUseCase, false, false, resolveDefaultCardUseCase$invoke$12, 3, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                    if (list.size() == 1) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) kotlin.collections.CollectionsKt.first(list)).getCardInfo();
                        if ((cardInfo != null ? cardInfo.getType() : null) == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Only PayLaterToGo exists - setting new card as default", null, null, 6, null);
                            return com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.YES;
                        }
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Other cards exist - using IF_FIRST_CARD", null, null, 6, null);
                    return com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.IF_FIRST_CARD;
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to get cards for default resolution", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((arrow.core.Either.Left) either).getValue())), null, 4, null);
                return com.paypal.oslo.feature.taptopay.domain.model.card.SetAsDefault.IF_FIRST_CARD;
            }
        }
        resolveDefaultCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.ResolveDefaultCardUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.taptopay.domain.usecase.card.ResolveDefaultCardUseCase$invoke$1 resolveDefaultCardUseCase$invoke$122 = resolveDefaultCardUseCase$invoke$1;
        java.lang.Object obj2 = resolveDefaultCardUseCase$invoke$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = resolveDefaultCardUseCase$invoke$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
