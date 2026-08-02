package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetDefaultCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "cardRepository", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardArtUseCase;", "getCardArtUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardArtUseCase;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/GetDefaultCardError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/repository/card/CardRepository;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardArtUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetDefaultCardUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetDefaultCardUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        this.Camera2StreamConfigurationMap = cardRepository;
        this.getHighSpeedVideoFpsRangesFor = getCardArtUseCase;
    }

    public /* synthetic */ GetDefaultCardUseCase(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cardRepository, (i & 2) != 0 ? null : getCardArtUseCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6 A[Catch: all -> 0x0049, RaiseCancellationException -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x004c, all -> 0x0049, blocks: (B:13:0x0043, B:15:0x00e0, B:18:0x00e6, B:19:0x0159, B:24:0x0118, B:25:0x0138, B:26:0x013d), top: B:12:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142 A[Catch: all -> 0x006f, RaiseCancellationException -> 0x0072, TryCatch #3 {RaiseCancellationException -> 0x0072, all -> 0x006f, blocks: (B:38:0x006b, B:39:0x00af, B:41:0x00b9, B:43:0x00bd, B:47:0x013e, B:49:0x0142, B:50:0x0148, B:54:0x007e), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1 getDefaultCardUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        int i2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        int i3;
        int i4;
        int i5;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2;
        arrow.core.Either either;
        try {
            if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1) {
                getDefaultCardUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1) continuation;
                if ((getDefaultCardUseCase$invoke$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    getDefaultCardUseCase$invoke$1.getInputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = getDefaultCardUseCase$invoke$1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = getDefaultCardUseCase$invoke$1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i2 = 0;
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise2 = defaultRaise;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Running get default card use case", null, null, 6, null);
                        com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository = this.Camera2StreamConfigurationMap;
                        getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise;
                        getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        getDefaultCardUseCase$invoke$1.getInputFormats = defaultRaise2;
                        getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        getDefaultCardUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        getDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        getDefaultCardUseCase$invoke$1.getInputSizeshNQ4ISI = 1;
                        obj = cardRepository.getDefaultCard(getDefaultCardUseCase$invoke$1);
                        if (obj != coroutine_suspended) {
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                            raise = defaultRaise2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = getDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i7 = getDefaultCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i8 = getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i9 = getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard3 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) getDefaultCardUseCase$invoke$1.getInputFormats;
                        defaultRaise3 = (arrow.core.raise.DefaultRaise) getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            digitizedCard2 = digitizedCard3;
                            either = (arrow.core.Either) obj;
                            if (!(either instanceof arrow.core.Either.Right)) {
                                byte[] bArr = (byte[]) ((arrow.core.Either.Right) either).getValue();
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Get default card use case completed with card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", digitizedCard2.getCardId())), null, 4, null);
                                digitizedCard = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.copy$default(digitizedCard2, null, null, null, null, false, null, bArr, 63, null);
                            } else if (either instanceof arrow.core.Either.Left) {
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Get default card use case completed but found no card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", digitizedCard2.getCardId())), null, 4, null);
                                digitizedCard = digitizedCard2;
                            } else {
                                throw new kotlin.NoWhenBranchMatchedException();
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
                    i2 = getDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    i3 = getDefaultCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                    i4 = getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    i5 = getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes;
                    defaultRaise2 = (arrow.core.raise.Raise) getDefaultCardUseCase$invoke$1.getInputFormats;
                    raise = (arrow.core.raise.Raise) getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    defaultRaise = (arrow.core.raise.DefaultRaise) getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) defaultRaise2.bind((arrow.core.Either) obj);
                    if (digitizedCard == null && (getCardArtUseCase = this.getHighSpeedVideoFpsRangesFor) != null) {
                        java.lang.String cardId = digitizedCard.getCardId();
                        getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = defaultRaise;
                        getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                        getDefaultCardUseCase$invoke$1.getInputFormats = digitizedCard;
                        getDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes = i5;
                        getDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = i4;
                        getDefaultCardUseCase$invoke$1.Camera2StreamConfigurationMap = i3;
                        getDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                        getDefaultCardUseCase$invoke$1.getInputSizeshNQ4ISI = 2;
                        java.lang.Object invoke = getCardArtUseCase.invoke(cardId, getDefaultCardUseCase$invoke$1);
                        if (invoke != coroutine_suspended) {
                            digitizedCard2 = digitizedCard;
                            obj = invoke;
                            defaultRaise3 = defaultRaise;
                            either = (arrow.core.Either) obj;
                            if (!(either instanceof arrow.core.Either.Right)) {
                            }
                            defaultRaise3.complete();
                            return new arrow.core.Either.Right(digitizedCard);
                        }
                        return coroutine_suspended;
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Get default card use case completed without fetching card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", digitizedCard == null ? digitizedCard.getCardId() : null)), null, 4, null);
                    defaultRaise3 = defaultRaise;
                    defaultRaise3.complete();
                    return new arrow.core.Either.Right(digitizedCard);
                }
            }
            if (i != 0) {
            }
            digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) defaultRaise2.bind((arrow.core.Either) obj);
            if (digitizedCard == null) {
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Get default card use case completed without fetching card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitizedCardId", digitizedCard == null ? digitizedCard.getCardId() : null)), null, 4, null);
            defaultRaise3 = defaultRaise;
            defaultRaise3.complete();
            return new arrow.core.Either.Right(digitizedCard);
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        getDefaultCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getDefaultCardUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getDefaultCardUseCase$invoke$1.getInputSizeshNQ4ISI;
    }
}
