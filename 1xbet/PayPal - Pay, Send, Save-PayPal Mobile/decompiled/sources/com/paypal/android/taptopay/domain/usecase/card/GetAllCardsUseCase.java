package com.paypal.android.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/card/GetAllCardsUseCase;", "", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/android/taptopay/domain/usecase/card/GetCardArtUseCase;", "getCardArtUseCase", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;Lcom/paypal/android/taptopay/domain/usecase/card/GetCardArtUseCase;)V", "", "getCardArt", "waitForRefresh", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/android/taptopay/domain/model/card/GetAllCardsError;", "invoke", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/taptopay/domain/usecase/card/GetCardArtUseCase;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetAllCardsUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository Camera2StreamConfigurationMap;
    private final com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetAllCardsUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardArtUseCase, "");
        this.Camera2StreamConfigurationMap = cardRepository;
        this.getHighSpeedVideoFpsRanges = getCardArtUseCase;
    }

    public /* synthetic */ GetAllCardsUseCase(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? new com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase(cardRepository) : getCardArtUseCase);
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, boolean z, boolean z2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return getAllCardsUseCase.invoke(z, z2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d6 -> B:11:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(boolean z, boolean z2, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>, com.paypal.android.taptopay.domain.model.card.GetAllCardsError>> continuation) {
        com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1 getAllCardsUseCase$invoke$1;
        int i;
        boolean z3;
        com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase;
        com.paypal.android.taptopay.domain.Result result;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase2;
        if (continuation instanceof com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1) {
            getAllCardsUseCase$invoke$1 = (com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1) continuation;
            if ((getAllCardsUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                getAllCardsUseCase$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = getAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAllCardsUseCase$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.domain.logging.LoggerKt.getLog(), "Running GetAllCardsUseCase use case", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("getCardArt", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, 4, null);
                    com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository = this.Camera2StreamConfigurationMap;
                    getAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = this;
                    z3 = z;
                    getAllCardsUseCase$invoke$1.getOutputMinFrameDuration = z3;
                    getAllCardsUseCase$invoke$1.getOutputFormats = 1;
                    obj = cardRepository.getAllCards(z2, getAllCardsUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        getAllCardsUseCase = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    z3 = getAllCardsUseCase$invoke$1.getOutputMinFrameDuration;
                    getAllCardsUseCase = (com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase) getAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (java.util.Collection) getAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) getAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    it = (java.util.Iterator) getAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
                    java.util.Collection collection = (java.util.Collection) getAllCardsUseCase$invoke$1.getHighSpeedVideoSizes;
                    getAllCardsUseCase2 = (com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase) getAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase3 = getAllCardsUseCase2;
                    com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard2 = digitizedCard;
                    com.paypal.android.taptopay.domain.Result result2 = (com.paypal.android.taptopay.domain.Result) obj;
                    if (result2 instanceof com.paypal.android.taptopay.domain.Result.Success) {
                        digitizedCard2 = com.paypal.android.taptopay.domain.model.card.DigitizedCard.copy$default(digitizedCard2, null, null, null, null, false, null, (byte[]) ((com.paypal.android.taptopay.domain.Result.Success) result2).getResult(), 63, null);
                    }
                    arrayList.add(digitizedCard2);
                    getAllCardsUseCase2 = getAllCardsUseCase3;
                    arrayList = collection;
                    if (it.hasNext()) {
                        digitizedCard = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) it.next();
                        com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase = getAllCardsUseCase2.getHighSpeedVideoFpsRanges;
                        java.lang.String cardId = digitizedCard.getCardId();
                        getAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = getAllCardsUseCase2;
                        getAllCardsUseCase$invoke$1.getHighSpeedVideoSizes = arrayList;
                        getAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap = it;
                        getAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = digitizedCard;
                        getAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = arrayList;
                        getAllCardsUseCase$invoke$1.getOutputFormats = 2;
                        obj = getCardArtUseCase.invoke(cardId, getAllCardsUseCase$invoke$1);
                        if (obj != coroutine_suspended) {
                            collection = arrayList;
                            com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase32 = getAllCardsUseCase2;
                            com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard22 = digitizedCard;
                            com.paypal.android.taptopay.domain.Result result22 = (com.paypal.android.taptopay.domain.Result) obj;
                            if (result22 instanceof com.paypal.android.taptopay.domain.Result.Success) {
                            }
                            arrayList.add(digitizedCard22);
                            getAllCardsUseCase2 = getAllCardsUseCase32;
                            arrayList = collection;
                            if (it.hasNext()) {
                                return new com.paypal.android.taptopay.domain.Result.Success((java.util.List) arrayList);
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                result = (com.paypal.android.taptopay.domain.Result) obj;
                if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success) && z3) {
                    java.lang.Iterable iterable = (java.lang.Iterable) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult();
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    it = iterable.iterator();
                    getAllCardsUseCase2 = getAllCardsUseCase;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        getAllCardsUseCase$invoke$1 = new com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAllCardsUseCase$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        result = (com.paypal.android.taptopay.domain.Result) obj2;
        return !(result instanceof com.paypal.android.taptopay.domain.Result.Success) ? result : result;
    }
}
