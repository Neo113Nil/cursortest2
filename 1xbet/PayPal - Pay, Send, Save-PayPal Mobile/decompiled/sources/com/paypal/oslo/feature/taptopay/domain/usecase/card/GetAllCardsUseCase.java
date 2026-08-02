package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetAllCardsUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardArtUseCase;", "getCardArtUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardArtUseCase;)V", "", "getCardArt", "waitForRefresh", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetAllCardsError;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "invoke", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardArtUseCase;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetAllCardsUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetAllCardsUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardArtUseCase, "");
        this.Camera2StreamConfigurationMap = cardRepository;
        this.getHighSpeedVideoSizes = getCardArtUseCase;
    }

    public /* synthetic */ GetAllCardsUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase(cardRepository) : getCardArtUseCase);
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase, boolean z, boolean z2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return getAllCardsUseCase.invoke(z, z2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x017a -> B:11:0x0187). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(boolean z, boolean z2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetAllCardsError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1 getAllCardsUseCase$invoke$1;
        int i;
        boolean z3;
        arrow.core.Either either;
        java.lang.Object value;
        java.util.ArrayList arrayList;
        java.util.List list;
        java.lang.Object obj;
        java.util.Iterator it;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        arrow.core.Either either2;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1 getAllCardsUseCase$invoke$12;
        java.lang.Object obj2;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase = this;
        boolean z5 = z2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1) {
            getAllCardsUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1) continuation;
            if ((getAllCardsUseCase$invoke$1.coroutineBoundary & Integer.MIN_VALUE) != 0) {
                getAllCardsUseCase$invoke$1.coroutineBoundary -= 2147483648;
                java.lang.Object obj3 = getAllCardsUseCase$invoke$1.CoroutineDebuggingKt;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAllCardsUseCase$invoke$1.coroutineBoundary;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running GetAllCardsUseCase use case", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("getCardArt", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, 4, null);
                    com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository = getAllCardsUseCase.Camera2StreamConfigurationMap;
                    z3 = z;
                    getAllCardsUseCase$invoke$1.unwrapAs = z3;
                    getAllCardsUseCase$invoke$1.isOutputSupportedForhNQ4ISI = z5;
                    getAllCardsUseCase$invoke$1.coroutineBoundary = 1;
                    obj3 = cardRepository.getAllCards(z5, getAllCardsUseCase$invoke$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    z5 = getAllCardsUseCase$invoke$1.isOutputSupportedForhNQ4ISI;
                    z3 = getAllCardsUseCase$invoke$1.unwrapAs;
                    kotlin.ResultKt.throwOnFailure(obj3);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = getAllCardsUseCase$invoke$1.getInputSizeshNQ4ISI;
                    int i9 = getAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    int i10 = getAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i11 = getAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i12 = getAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i13 = getAllCardsUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i14 = getAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    boolean z6 = getAllCardsUseCase$invoke$1.isOutputSupportedForhNQ4ISI;
                    boolean z7 = getAllCardsUseCase$invoke$1.unwrapAs;
                    java.util.Collection collection = (java.util.Collection) getAllCardsUseCase$invoke$1.getOutputFormats;
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) getAllCardsUseCase$invoke$1.toString;
                    java.lang.Object obj4 = getAllCardsUseCase$invoke$1.getValidOutputFormatsForInputhNQ4ISI;
                    java.util.Iterator it2 = (java.util.Iterator) getAllCardsUseCase$invoke$1.isOutputSupportedFor;
                    ?? r8 = (java.util.Collection) getAllCardsUseCase$invoke$1.getOutputStallDuration;
                    java.lang.Object obj5 = (java.lang.Iterable) getAllCardsUseCase$invoke$1.getOutputStallDurationlomOqCM;
                    ?? r1 = (java.lang.Iterable) getAllCardsUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                    java.util.List list2 = (java.util.List) getAllCardsUseCase$invoke$1.getOutputSizes;
                    java.lang.Object obj6 = getAllCardsUseCase$invoke$1.getOutputSizeshNQ4ISI;
                    arrow.core.Either either3 = (arrow.core.Either) getAllCardsUseCase$invoke$1.getInputFormats;
                    either2 = (arrow.core.Either) getAllCardsUseCase$invoke$1.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    int i15 = i12;
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2 = digitizedCard;
                    getAllCardsUseCase$invoke$12 = getAllCardsUseCase$invoke$1;
                    int i16 = i13;
                    obj2 = obj5;
                    arrayList2 = r8;
                    list = r1;
                    int i17 = i14;
                    it = it2;
                    value = obj6;
                    i7 = i10;
                    z3 = z7;
                    java.lang.Object obj7 = coroutine_suspended;
                    z4 = z6;
                    i2 = i11;
                    arrayList = list2;
                    i6 = i9;
                    arrow.core.Either either4 = (arrow.core.Either) obj3;
                    int i18 = i15;
                    if (either4 instanceof arrow.core.Either.Right) {
                        digitizedCard2 = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.copy$default(digitizedCard2, null, null, null, null, false, null, (byte[]) ((arrow.core.Either.Right) either4).getValue(), 63, null);
                    } else {
                        if (!(either4 instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    collection.add(digitizedCard2);
                    getAllCardsUseCase = this;
                    i4 = i16;
                    i5 = i17;
                    either = either3;
                    obj = obj7;
                    i3 = i18;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i19 = i2;
                        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard3 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) next;
                        int i20 = i3;
                        com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase = getAllCardsUseCase.getHighSpeedVideoSizes;
                        java.lang.String cardId = digitizedCard3.getCardId();
                        getAllCardsUseCase$invoke$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                        getAllCardsUseCase$invoke$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        getAllCardsUseCase$invoke$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                        getAllCardsUseCase$invoke$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList);
                        getAllCardsUseCase$invoke$12.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        getAllCardsUseCase$invoke$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        getAllCardsUseCase$invoke$12.getOutputStallDuration = arrayList2;
                        getAllCardsUseCase$invoke$12.isOutputSupportedFor = it;
                        getAllCardsUseCase$invoke$12.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        getAllCardsUseCase$invoke$12.toString = digitizedCard3;
                        getAllCardsUseCase$invoke$12.getOutputFormats = arrayList2;
                        getAllCardsUseCase$invoke$12.unwrapAs = z3;
                        getAllCardsUseCase$invoke$12.isOutputSupportedForhNQ4ISI = z4;
                        getAllCardsUseCase$invoke$12.getHighSpeedVideoFpsRanges = i5;
                        getAllCardsUseCase$invoke$12.getHighSpeedVideoSizes = i4;
                        getAllCardsUseCase$invoke$12.Camera2StreamConfigurationMap = i20;
                        getAllCardsUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = i19;
                        getAllCardsUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = i7;
                        getAllCardsUseCase$invoke$12.getHighSpeedVideoSizesFor = i6;
                        getAllCardsUseCase$invoke$12.getInputSizeshNQ4ISI = 0;
                        getAllCardsUseCase$invoke$12.coroutineBoundary = 2;
                        java.lang.Object invoke = getCardArtUseCase.invoke(cardId, getAllCardsUseCase$invoke$12);
                        obj7 = obj;
                        if (invoke == obj7) {
                            return obj7;
                        }
                        either3 = either;
                        digitizedCard2 = digitizedCard3;
                        i17 = i5;
                        i2 = i19;
                        obj3 = invoke;
                        i16 = i4;
                        i15 = i20;
                        collection = arrayList2;
                        arrow.core.Either either42 = (arrow.core.Either) obj3;
                        int i182 = i15;
                        if (either42 instanceof arrow.core.Either.Right) {
                        }
                        collection.add(digitizedCard2);
                        getAllCardsUseCase = this;
                        i4 = i16;
                        i5 = i17;
                        either = either3;
                        obj = obj7;
                        i3 = i182;
                        if (it.hasNext()) {
                            arrayList = arrayList2;
                            return new arrow.core.Either.Right(arrayList);
                        }
                    }
                }
                either = (arrow.core.Either) obj3;
                if (!(either instanceof arrow.core.Either.Right)) {
                    value = ((arrow.core.Either.Right) either).getValue();
                    arrayList = (java.util.List) value;
                    if (z3) {
                        list = arrayList;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        obj = coroutine_suspended;
                        it = list.iterator();
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        i7 = 0;
                        z4 = z5;
                        either2 = either;
                        arrayList2 = arrayList3;
                        getAllCardsUseCase$invoke$12 = getAllCardsUseCase$invoke$1;
                        obj2 = list;
                        if (it.hasNext()) {
                        }
                    }
                    return new arrow.core.Either.Right(arrayList);
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getAllCardsUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase$invoke$1(getAllCardsUseCase, continuation);
        java.lang.Object obj32 = getAllCardsUseCase$invoke$1.CoroutineDebuggingKt;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAllCardsUseCase$invoke$1.coroutineBoundary;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj32;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
