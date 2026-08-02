package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/card/GetCardUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/android/taptopay/domain/usecase/card/GetCardArtUseCase;", "getCardArtUseCase", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;Lcom/paypal/android/taptopay/domain/usecase/card/GetCardArtUseCase;)V", "", "digitizedCardId", "", "getCardArt", "Lcom/paypal/android/taptopay/domain/Result;", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/android/taptopay/domain/model/card/GetCardError;", "invoke", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/domain/usecase/card/GetCardArtUseCase;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetCardUseCase {
    private final com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase Camera2StreamConfigurationMap;
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCardUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardArtUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = cardRepository;
        this.Camera2StreamConfigurationMap = getCardArtUseCase;
    }

    public /* synthetic */ GetCardUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? new com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase(cardRepository) : getCardArtUseCase);
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getCardUseCase.invoke(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation) {
        com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase$invoke$1 getCardUseCase$invoke$1;
        int i;
        com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase;
        com.paypal.android.taptopay.domain.Result result;
        com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard;
        com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard2;
        if (continuation instanceof com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase$invoke$1) {
            getCardUseCase$invoke$1 = (com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase$invoke$1) continuation;
            if ((getCardUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getCardUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = getCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Running GetCard use case", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str), kotlin.TuplesKt.to("getCardArt", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, 4, null);
                    com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository = this.getHighSpeedVideoFpsRangesFor;
                    getCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    getCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = z;
                    getCardUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = cardRepository.getCard(str, getCardUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        getCardUseCase = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard3 = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) getCardUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    digitizedCard2 = digitizedCard3;
                    com.paypal.android.taptopay.domain.Result result2 = (com.paypal.android.taptopay.domain.Result) obj;
                    digitizedCard = !(result2 instanceof com.paypal.android.taptopay.domain.Result.Success) ? com.paypal.android.taptopay.domain.model.card.DigitizedCard.copy$default(digitizedCard2, null, null, null, null, false, null, (byte[]) ((com.paypal.android.taptopay.domain.Result.Success) result2).getResult(), 63, null) : digitizedCard2;
                    return new com.paypal.android.taptopay.domain.Result.Success(digitizedCard);
                }
                z = getCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                getCardUseCase = (com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase) getCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                result = (com.paypal.android.taptopay.domain.Result) obj;
                if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                    digitizedCard = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult();
                    if (digitizedCard != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Get card use case succeeded", null, null, 6, null);
                        if (z) {
                            com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase = getCardUseCase.Camera2StreamConfigurationMap;
                            java.lang.String cardId = digitizedCard.getCardId();
                            getCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = getCardUseCase;
                            getCardUseCase$invoke$1.getHighSpeedVideoSizes = digitizedCard;
                            getCardUseCase$invoke$1.Camera2StreamConfigurationMap = 2;
                            java.lang.Object invoke = getCardArtUseCase.invoke(cardId, getCardUseCase$invoke$1);
                            if (invoke != coroutine_suspended) {
                                digitizedCard2 = digitizedCard;
                                obj = invoke;
                                com.paypal.android.taptopay.domain.Result result22 = (com.paypal.android.taptopay.domain.Result) obj;
                                if (!(result22 instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        return new com.paypal.android.taptopay.domain.Result.Success(digitizedCard);
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "GetCard use case failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", "GetCardError.CardNotFound")), null, 4, null);
                    return new com.paypal.android.taptopay.domain.Result.Failure(com.paypal.android.taptopay.domain.model.card.GetCardError.CardNotFound.INSTANCE);
                }
                if (!(result instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.taptopay.domain.Result.Failure failure = (com.paypal.android.taptopay.domain.Result.Failure) result;
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "GetCard use case failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", failure.getError().getClass().getSimpleName())), null, 4, null);
                return new com.paypal.android.taptopay.domain.Result.Failure(failure.getError());
            }
        }
        getCardUseCase$invoke$1 = new com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCardUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        result = (com.paypal.android.taptopay.domain.Result) obj2;
        if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
        }
    }
}
