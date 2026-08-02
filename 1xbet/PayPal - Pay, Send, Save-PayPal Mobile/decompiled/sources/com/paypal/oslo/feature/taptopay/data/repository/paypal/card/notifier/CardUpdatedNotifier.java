package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0080B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/notifier/CardUpdatedNotifier;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardMetaDataUseCase;", "getCardMetaDataUseCase", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardSynchronizer;", "cardSynchronizer", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardMetaDataUseCase;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardSynchronizer;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "card", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/SynchronizeCardError;", "", "invoke$taptopay_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardMetaDataUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardSynchronizer;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardUpdatedNotifier {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CardUpdatedNotifier(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase getCardMetaDataUseCase, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer cardSynchronizer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardMetaDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardSynchronizer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getCardMetaDataUseCase;
        this.getHighSpeedVideoFpsRangesFor = cardSynchronizer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fc, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0113, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r2 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke$taptopay_prodRelease(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier$invoke$1 cardUpdatedNotifier$invoke$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        java.lang.Object invoke;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier$invoke$1) {
            cardUpdatedNotifier$invoke$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier$invoke$1) continuation;
            if ((cardUpdatedNotifier$invoke$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                cardUpdatedNotifier$invoke$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = cardUpdatedNotifier$invoke$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardUpdatedNotifier$invoke$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    digitizedCard = payPalDigitizedCard.getDigitizedCard();
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase getCardMetaDataUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String cardId = digitizedCard.getCardId();
                    cardUpdatedNotifier$invoke$1.getHighSpeedVideoFpsRanges = payPalDigitizedCard;
                    cardUpdatedNotifier$invoke$1.getHighResolutionOutputSizeshNQ4ISI = digitizedCard;
                    cardUpdatedNotifier$invoke$1.getOutputMinFrameDuration = 1;
                    invoke = getCardMetaDataUseCase.invoke(cardId, cardUpdatedNotifier$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = cardUpdatedNotifier$invoke$1.getHighSpeedVideoSizes;
                        int i3 = cardUpdatedNotifier$invoke$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) cardUpdatedNotifier$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) cardUpdatedNotifier$invoke$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    digitizedCard = digitizedCard2;
                    payPalDigitizedCard = payPalDigitizedCard2;
                    invoke = obj;
                }
                either = (arrow.core.Either) invoke;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.GetCardMetaDataError getCardMetaDataError = (com.paypal.oslo.feature.taptopay.domain.model.card.GetCardMetaDataError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to fetch card metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", getCardMetaDataError.toString())), null, 4, null);
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError.DefaultError("Failed to fetch card metadata: ".concat(java.lang.String.valueOf(getCardMetaDataError))));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata cardMetadata = (com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata) ((arrow.core.Either.Right) right).getValue();
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer cardSynchronizer = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String id = payPalDigitizedCard.getDeviceWalletServiceCardId().getId();
                    cardUpdatedNotifier$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalDigitizedCard);
                    cardUpdatedNotifier$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard);
                    cardUpdatedNotifier$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                    cardUpdatedNotifier$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardMetadata);
                    cardUpdatedNotifier$invoke$1.Camera2StreamConfigurationMap = 0;
                    cardUpdatedNotifier$invoke$1.getHighSpeedVideoSizes = 0;
                    cardUpdatedNotifier$invoke$1.getOutputMinFrameDuration = 2;
                    obj = cardSynchronizer.invoke(id, digitizedCard, cardMetadata, cardUpdatedNotifier$invoke$1);
                } else {
                    if (right instanceof arrow.core.Either.Left) {
                        return right;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        cardUpdatedNotifier$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardUpdatedNotifier$invoke$1(this, continuation);
        java.lang.Object obj2 = cardUpdatedNotifier$invoke$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardUpdatedNotifier$invoke$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        either = (arrow.core.Either) invoke;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }
}
