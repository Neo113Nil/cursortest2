package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardArtUseCase;", "getCardArtUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardArtUseCase;)V", "", "digitizedCardId", "", "getCardArt", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetCardError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "invoke", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardArtUseCase;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetCardUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCardUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardArtUseCase, "");
        this.Camera2StreamConfigurationMap = cardRepository;
        this.getHighSpeedVideoFpsRangesFor = getCardArtUseCase;
    }

    public /* synthetic */ GetCardUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase(cardRepository) : getCardArtUseCase);
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getCardUseCase.invoke(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0130 A[Catch: all -> 0x004f, RaiseCancellationException -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0052, all -> 0x004f, blocks: (B:13:0x0049, B:15:0x012a, B:18:0x0130, B:19:0x0162, B:24:0x0151, B:25:0x015b, B:26:0x0160), top: B:12:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec A[Catch: all -> 0x0080, RaiseCancellationException -> 0x0083, TryCatch #4 {RaiseCancellationException -> 0x0083, all -> 0x0080, blocks: (B:38:0x0077, B:40:0x00e2, B:42:0x00ec, B:44:0x00fd, B:49:0x0171, B:50:0x0191, B:52:0x008f), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0171 A[Catch: all -> 0x0080, RaiseCancellationException -> 0x0083, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x0083, all -> 0x0080, blocks: (B:38:0x0077, B:40:0x00e2, B:42:0x00ec, B:44:0x00fd, B:49:0x0171, B:50:0x0191, B:52:0x008f), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase$invoke$1 getCardUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        boolean z2;
        java.lang.String str2;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.Raise raise;
        int i5;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2;
        arrow.core.Either either;
        try {
            if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase$invoke$1) {
                getCardUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase$invoke$1) continuation;
                if ((getCardUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    getCardUseCase$invoke$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = getCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = getCardUseCase$invoke$1.getOutputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running GetCard use case", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", str), kotlin.TuplesKt.to("getCardArt", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, 4, null);
                        com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository = this.Camera2StreamConfigurationMap;
                        getCardUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        getCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise;
                        getCardUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise2;
                        getCardUseCase$invoke$1.getInputFormats = defaultRaise2;
                        z2 = z;
                        getCardUseCase$invoke$1.getHighSpeedVideoSizesFor = z2;
                        getCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        getCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        getCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        getCardUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        getCardUseCase$invoke$1.getOutputFormats = 1;
                        java.lang.Object card = cardRepository.getCard(str, getCardUseCase$invoke$1);
                        if (card != coroutine_suspended) {
                            str2 = str;
                            i2 = 0;
                            i3 = 0;
                            i4 = 0;
                            raise = defaultRaise2;
                            obj = card;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = getCardUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i7 = getCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i8 = getCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i9 = getCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z3 = getCardUseCase$invoke$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard3 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) getCardUseCase$invoke$1.getInputFormats;
                        defaultRaise3 = (arrow.core.raise.DefaultRaise) getCardUseCase$invoke$1.getOutputMinFrameDuration;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            digitizedCard2 = digitizedCard3;
                            either = (arrow.core.Either) obj;
                            if (!(either instanceof arrow.core.Either.Right)) {
                                digitizedCard = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.copy$default(digitizedCard2, null, null, null, null, false, null, (byte[]) ((arrow.core.Either.Right) either).getValue(), 63, null);
                            } else {
                                if (!(either instanceof arrow.core.Either.Left)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                digitizedCard = digitizedCard2;
                            }
                            defaultRaise3.complete();
                            return new arrow.core.Either.Right(digitizedCard);
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise3.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise3.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    i2 = getCardUseCase$invoke$1.getHighSpeedVideoSizes;
                    i5 = getCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    i3 = getCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i10 = getCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    boolean z4 = getCardUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.Raise) getCardUseCase$invoke$1.getInputFormats;
                    raise = (arrow.core.raise.Raise) getCardUseCase$invoke$1.getInputSizeshNQ4ISI;
                    defaultRaise = (arrow.core.raise.DefaultRaise) getCardUseCase$invoke$1.getOutputMinFrameDuration;
                    str2 = (java.lang.String) getCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i4 = i10;
                    z2 = z4;
                    digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) defaultRaise2.bind((arrow.core.Either) obj);
                    if (digitizedCard != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "GetCard use case failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", "GetCardError.CardNotFound")), null, 4, null);
                        raise.raise(com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError.CardNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Get card use case succeeded", null, null, 6, null);
                    if (z2) {
                        com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.String cardId = digitizedCard.getCardId();
                        getCardUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        getCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise;
                        getCardUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                        getCardUseCase$invoke$1.getInputFormats = digitizedCard;
                        getCardUseCase$invoke$1.getHighSpeedVideoSizesFor = z2;
                        getCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                        getCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i3;
                        getCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = i5;
                        getCardUseCase$invoke$1.getHighSpeedVideoSizes = i2;
                        getCardUseCase$invoke$1.getOutputFormats = 2;
                        java.lang.Object invoke = getCardArtUseCase.invoke(cardId, getCardUseCase$invoke$1);
                        if (invoke != coroutine_suspended) {
                            digitizedCard2 = digitizedCard;
                            defaultRaise3 = defaultRaise;
                            obj = invoke;
                            either = (arrow.core.Either) obj;
                            if (!(either instanceof arrow.core.Either.Right)) {
                            }
                            defaultRaise3.complete();
                            return new arrow.core.Either.Right(digitizedCard);
                        }
                        return coroutine_suspended;
                    }
                    defaultRaise3 = defaultRaise;
                    defaultRaise3.complete();
                    return new arrow.core.Either.Right(digitizedCard);
                }
            }
            if (i != 0) {
            }
            digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) defaultRaise2.bind((arrow.core.Either) obj);
            if (digitizedCard != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        getCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCardUseCase$invoke$1.getOutputFormats;
    }
}
