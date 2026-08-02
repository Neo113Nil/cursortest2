package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0080B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/notifier/CardAddedNotifier;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardUseCase;", "getCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardMetaDataUseCase;", "getCardMetaDataUseCase", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardSynchronizer;", "cardSynchronizer", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardMetaDataUseCase;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardSynchronizer;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;", "cardIdGroup", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/SynchronizeCardError;", "", "invoke$taptopay_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardIdGroup;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardMetaDataUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/CardSynchronizer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardAddedNotifier {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CardAddedNotifier(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase getCardMetaDataUseCase, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer cardSynchronizer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardMetaDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardSynchronizer, "");
        this.getHighSpeedVideoFpsRangesFor = getCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getCardMetaDataUseCase;
        this.getHighSpeedVideoSizes = cardSynchronizer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01aa, code lost:
    
        if (r1 == r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0096, code lost:
    
        if (r1 != r9) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke$taptopay_prodRelease(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier$invoke$1 cardAddedNotifier$invoke$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup2;
        arrow.core.Either either;
        arrow.core.Either right;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        int i2;
        int i3;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup3;
        arrow.core.Either either2;
        arrow.core.Either.Right right2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier$invoke$1) {
            cardAddedNotifier$invoke$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier$invoke$1) continuation;
            if ((cardAddedNotifier$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                cardAddedNotifier$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = cardAddedNotifier$invoke$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardAddedNotifier$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String id = cardIdGroup.getDigitizedCardId().getId();
                    cardIdGroup2 = cardIdGroup;
                    cardAddedNotifier$invoke$1.getHighSpeedVideoSizes = cardIdGroup2;
                    cardAddedNotifier$invoke$1.getInputFormats = 1;
                    obj = com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase.invoke$default(getCardUseCase, id, false, cardAddedNotifier$invoke$1, 2, null);
                } else if (i == 1) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) cardAddedNotifier$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    cardIdGroup2 = cardIdGroup4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = cardAddedNotifier$invoke$1.Camera2StreamConfigurationMap;
                        int i5 = cardAddedNotifier$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i6 = cardAddedNotifier$invoke$1.getHighSpeedVideoFpsRanges;
                        int i7 = cardAddedNotifier$invoke$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    i2 = cardAddedNotifier$invoke$1.getHighSpeedVideoFpsRanges;
                    i3 = cardAddedNotifier$invoke$1.getHighSpeedVideoFpsRangesFor;
                    digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) cardAddedNotifier$invoke$1.getOutputFormats;
                    right = (arrow.core.Either) cardAddedNotifier$invoke$1.getOutputMinFrameDuration;
                    cardIdGroup3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) cardAddedNotifier$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    either2 = (arrow.core.Either) obj;
                    if (!(either2 instanceof arrow.core.Either.Left)) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.GetCardMetaDataError getCardMetaDataError = (com.paypal.oslo.feature.taptopay.domain.model.card.GetCardMetaDataError) ((arrow.core.Either.Left) either2).getValue();
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to fetch card metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", getCardMetaDataError.toString())), null, 4, null);
                        right2 = new arrow.core.Either.Left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError.DefaultError("Failed to fetch card metadata: ".concat(java.lang.String.valueOf(getCardMetaDataError))));
                    } else {
                        if (!(either2 instanceof arrow.core.Either.Right)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        right2 = new arrow.core.Either.Right(((arrow.core.Either.Right) either2).getValue());
                    }
                    if (right2 instanceof arrow.core.Either.Right) {
                        if (right2 instanceof arrow.core.Either.Left) {
                            return right2;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata cardMetadata = (com.paypal.oslo.feature.taptopay.domain.model.card.CardMetadata) ((arrow.core.Either.Right) right2).getValue();
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer cardSynchronizer = this.getHighSpeedVideoSizes;
                    java.lang.String id2 = cardIdGroup3.getDeviceWalletServiceCardId().getId();
                    cardAddedNotifier$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup3);
                    cardAddedNotifier$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                    cardAddedNotifier$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard);
                    cardAddedNotifier$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right2);
                    cardAddedNotifier$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardMetadata);
                    cardAddedNotifier$invoke$1.getHighSpeedVideoFpsRangesFor = i3;
                    cardAddedNotifier$invoke$1.getHighSpeedVideoFpsRanges = i2;
                    cardAddedNotifier$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    cardAddedNotifier$invoke$1.Camera2StreamConfigurationMap = 0;
                    cardAddedNotifier$invoke$1.getInputFormats = 3;
                    obj = cardSynchronizer.invoke(id2, digitizedCard, cardMetadata, cardAddedNotifier$invoke$1);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError getCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to get card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", getCardError.toString())), null, 4, null);
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.SynchronizeCardError.DefaultError("Failed to get card: ".concat(java.lang.String.valueOf(getCardError))));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (right instanceof arrow.core.Either.Right) {
                    if (right instanceof arrow.core.Either.Left) {
                        return right;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) ((arrow.core.Either.Right) right).getValue();
                com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardMetaDataUseCase getCardMetaDataUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String id3 = cardIdGroup2.getDigitizedCardId().getId();
                cardAddedNotifier$invoke$1.getHighSpeedVideoSizes = cardIdGroup2;
                cardAddedNotifier$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                cardAddedNotifier$invoke$1.getOutputFormats = digitizedCard;
                cardAddedNotifier$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                cardAddedNotifier$invoke$1.getHighSpeedVideoFpsRanges = 0;
                cardAddedNotifier$invoke$1.getInputFormats = 2;
                obj = getCardMetaDataUseCase.invoke(id3, cardAddedNotifier$invoke$1);
                if (obj != coroutine_suspended) {
                    i2 = 0;
                    i3 = 0;
                    cardIdGroup3 = cardIdGroup2;
                    either2 = (arrow.core.Either) obj;
                    if (!(either2 instanceof arrow.core.Either.Left)) {
                    }
                    if (right2 instanceof arrow.core.Either.Right) {
                    }
                }
                return coroutine_suspended;
            }
        }
        cardAddedNotifier$invoke$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.notifier.CardAddedNotifier$invoke$1(this, continuation);
        java.lang.Object obj2 = cardAddedNotifier$invoke$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardAddedNotifier$invoke$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (right instanceof arrow.core.Either.Right) {
        }
    }
}
