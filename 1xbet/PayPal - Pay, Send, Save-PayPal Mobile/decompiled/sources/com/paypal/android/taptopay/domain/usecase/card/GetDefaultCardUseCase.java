package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r*\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/card/GetDefaultCardUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/android/taptopay/domain/usecase/card/GetCardArtUseCase;", "getCardArtUseCase", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;Lcom/paypal/android/taptopay/domain/usecase/card/GetCardArtUseCase;)V", "Lcom/paypal/android/taptopay/domain/Result;", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/android/taptopay/domain/model/card/GetDefaultCardError;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/android/taptopay/domain/Result;)Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/android/taptopay/domain/usecase/card/GetCardArtUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetDefaultCardUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetDefaultCardUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.getHighSpeedVideoFpsRangesFor = cardRepository;
        this.getHighSpeedVideoFpsRanges = getCardArtUseCase;
    }

    public /* synthetic */ GetDefaultCardUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? null : getCardArtUseCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetDefaultCardError>> continuation) {
        com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1 getDefaultCardUseCase$invoke$1;
        int i;
        com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase getDefaultCardUseCase;
        com.paypal.android.taptopay.domain.Result result;
        com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard;
        com.paypal.android.taptopay.domain.Result result2;
        com.paypal.android.taptopay.domain.Result result3;
        if (continuation instanceof com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1) {
            getDefaultCardUseCase$invoke$1 = (com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1) continuation;
            if ((getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Running get default cards use case", null, null, 6, null);
                    com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository = this.getHighSpeedVideoFpsRangesFor;
                    getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = cardRepository.getDefaultCard(getDefaultCardUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        getDefaultCardUseCase = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard2 = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) getDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    result2 = (com.paypal.android.taptopay.domain.Result) getDefaultCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    digitizedCard = digitizedCard2;
                    result3 = (com.paypal.android.taptopay.domain.Result) obj;
                    if (!(result3 instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Get default cards use case completed with card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", getHighSpeedVideoFpsRangesFor(result2))), null, 4, null);
                        digitizedCard = com.paypal.android.taptopay.domain.model.card.DigitizedCard.copy$default(digitizedCard, null, null, null, null, false, null, (byte[]) ((com.paypal.android.taptopay.domain.Result.Success) result3).getResult(), 63, null);
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Get default cards use case completed but found no card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", getHighSpeedVideoFpsRangesFor(result2))), null, 4, null);
                    }
                    return new com.paypal.android.taptopay.domain.Result.Success(digitizedCard);
                }
                getDefaultCardUseCase = (com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase) getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                result = (com.paypal.android.taptopay.domain.Result) obj;
                if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success) && getDefaultCardUseCase.getHighSpeedVideoFpsRanges != null) {
                    com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard3 = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult();
                    if (digitizedCard3 == null) {
                        digitizedCard = null;
                        return new com.paypal.android.taptopay.domain.Result.Success(digitizedCard);
                    }
                    com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase = getDefaultCardUseCase.getHighSpeedVideoFpsRanges;
                    java.lang.String cardId = digitizedCard3.getCardId();
                    getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes = getDefaultCardUseCase;
                    getDefaultCardUseCase$invoke$1.Camera2StreamConfigurationMap = result;
                    getDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = digitizedCard3;
                    getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = 2;
                    java.lang.Object invoke = getCardArtUseCase.invoke(cardId, getDefaultCardUseCase$invoke$1);
                    if (invoke != coroutine_suspended) {
                        result2 = result;
                        obj = invoke;
                        digitizedCard = digitizedCard3;
                        result3 = (com.paypal.android.taptopay.domain.Result) obj;
                        if (!(result3 instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                        }
                        return new com.paypal.android.taptopay.domain.Result.Success(digitizedCard);
                    }
                    return coroutine_suspended;
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Get default cards use case completed without fetching card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", getHighSpeedVideoFpsRangesFor(result))), null, 4, null);
                return result;
            }
        }
        getDefaultCardUseCase$invoke$1 = new com.paypal.android.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        result = (com.paypal.android.taptopay.domain.Result) obj2;
        if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Get default cards use case completed without fetching card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", getHighSpeedVideoFpsRangesFor(result))), null, 4, null);
        return result;
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor(com.paypal.android.taptopay.domain.Result<com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetDefaultCardError> result) {
        if (result instanceof com.paypal.android.taptopay.domain.Result.Failure) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.android.taptopay.domain.Result.Failure) result).getError().getClass().getSimpleName()));
        }
        if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult();
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", digitizedCard != null ? digitizedCard.getCardId() : null));
    }
}
