package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086B¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardUseCase;", "getCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/DeleteCardUseCase;", "deleteCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;", "payPalGetCardArtUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "payPalGetCardIdGroupUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;", "payPalGetCardInfoUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/DeleteCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "id", "", "getCardArt", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalGetCardError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetCardUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/DeleteCardUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardArtUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalGetCardUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayPalGetCardUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase deleteCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardArtUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardInfoUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = getCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = deleteCardUseCase;
        this.getHighSpeedVideoFpsRanges = payPalGetCardArtUseCase;
        this.getHighSpeedVideoSizes = payPalGetCardIdGroupUseCase;
        this.Camera2StreamConfigurationMap = payPalGetCardInfoUseCase;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase payPalGetCardUseCase, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return payPalGetCardUseCase.invoke(cardId, z, continuation);
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x013f: MOVE (r16 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:118:0x013f */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0144: MOVE (r16 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:116:0x0144 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7 A[Catch: all -> 0x013e, RaiseCancellationException -> 0x0143, TRY_ENTER, TryCatch #7 {RaiseCancellationException -> 0x0143, all -> 0x013e, blocks: (B:54:0x00e8, B:56:0x01f1, B:59:0x01f7, B:61:0x0207, B:62:0x0226, B:63:0x0247, B:65:0x0258, B:71:0x020e, B:73:0x0212, B:74:0x022e, B:75:0x0233, B:78:0x023a, B:79:0x0342, B:80:0x0347, B:87:0x0135, B:89:0x0177, B:93:0x017f, B:99:0x01be), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0258 A[Catch: all -> 0x013e, RaiseCancellationException -> 0x0143, TRY_LEAVE, TryCatch #7 {RaiseCancellationException -> 0x0143, all -> 0x013e, blocks: (B:54:0x00e8, B:56:0x01f1, B:59:0x01f7, B:61:0x0207, B:62:0x0226, B:63:0x0247, B:65:0x0258, B:71:0x020e, B:73:0x0212, B:74:0x022e, B:75:0x0233, B:78:0x023a, B:79:0x0342, B:80:0x0347, B:87:0x0135, B:89:0x0177, B:93:0x017f, B:99:0x01be), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01be A[Catch: all -> 0x013e, RaiseCancellationException -> 0x0143, TRY_ENTER, TryCatch #7 {RaiseCancellationException -> 0x0143, all -> 0x013e, blocks: (B:54:0x00e8, B:56:0x01f1, B:59:0x01f7, B:61:0x0207, B:62:0x0226, B:63:0x0247, B:65:0x0258, B:71:0x020e, B:73:0x0212, B:74:0x022e, B:75:0x0233, B:78:0x023a, B:79:0x0342, B:80:0x0347, B:87:0x0135, B:89:0x0177, B:93:0x017f, B:99:0x01be), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$invoke$1 payPalGetCardUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        boolean z2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId2;
        arrow.core.raise.DefaultRaise defaultRaise5;
        arrow.core.raise.Raise raise;
        int i2;
        int i3;
        int i4;
        int i5;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        java.lang.Object invoke;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup2;
        int i6;
        arrow.core.raise.Raise raise2;
        int i7;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId3;
        java.lang.String str;
        boolean z3;
        arrow.core.raise.Raise raise3;
        arrow.core.Either either;
        java.lang.Object obj;
        arrow.core.Either right;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection;
        java.lang.Object obj2;
        java.lang.String str2;
        int i8;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup3;
        boolean z4;
        int i9;
        arrow.core.raise.Raise raise4;
        int i10;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
        arrow.core.raise.DefaultRaise defaultRaise6;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2;
        int i11;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId4;
        java.lang.Object highSpeedVideoSizes;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId5;
        java.lang.Object obj3;
        arrow.core.raise.DefaultRaise defaultRaise7;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup4;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.DefaultError defaultError;
        java.lang.Object obj4;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId3;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection2;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard3;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId2;
        arrow.core.raise.DefaultRaise defaultRaise8;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$invoke$1) {
                    payPalGetCardUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$invoke$1) continuation;
                    if ((payPalGetCardUseCase$invoke$1.toString & Integer.MIN_VALUE) != 0) {
                        payPalGetCardUseCase$invoke$1.toString -= 2147483648;
                        java.lang.Object obj5 = payPalGetCardUseCase$invoke$1.getValidOutputFormatsForInputhNQ4ISI;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = payPalGetCardUseCase$invoke$1.toString;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj5);
                            defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                            try {
                                arrow.core.raise.DefaultRaise defaultRaise9 = defaultRaise4;
                                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase = this.getHighSpeedVideoSizes;
                                payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI = cardId;
                                payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise4;
                                payPalGetCardUseCase$invoke$1.getInputFormats = defaultRaise9;
                                z2 = z;
                                payPalGetCardUseCase$invoke$1.unwrapAs = z2;
                                payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                                payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                payPalGetCardUseCase$invoke$1.toString = 1;
                                java.lang.Object invoke2 = payPalGetCardIdGroupUseCase.invoke(cardId, payPalGetCardUseCase$invoke$1);
                                if (invoke2 != coroutine_suspended) {
                                    cardId2 = cardId;
                                    defaultRaise5 = defaultRaise4;
                                    raise = defaultRaise9;
                                    obj5 = invoke2;
                                    i2 = 0;
                                    i3 = 0;
                                    i4 = 0;
                                    i5 = 0;
                                }
                                return coroutine_suspended;
                            } catch (arrow.core.raise.RaiseCancellationException e) {
                                e = e;
                                defaultRaise4.complete();
                                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise4));
                            } catch (java.lang.Throwable th) {
                                th = th;
                                defaultRaise2 = defaultRaise4;
                                defaultRaise2.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                            }
                        }
                        if (i == 1) {
                            i2 = payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                            i3 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            i4 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes;
                            int i12 = payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                            z2 = payPalGetCardUseCase$invoke$1.unwrapAs;
                            arrow.core.raise.Raise raise5 = (arrow.core.raise.Raise) payPalGetCardUseCase$invoke$1.getInputFormats;
                            defaultRaise5 = (arrow.core.raise.DefaultRaise) payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration;
                            cardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            i5 = i12;
                            raise = raise5;
                        } else {
                            if (i == 2) {
                                int i13 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i14 = payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i15 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                int i16 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes;
                                int i17 = payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                                boolean z5 = payPalGetCardUseCase$invoke$1.unwrapAs;
                                raise3 = (arrow.core.raise.Raise) payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                kotlin.ResultKt.throwOnFailure(obj5);
                                raise = raise3;
                                raise.raise(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.CardNotFound.INSTANCE);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    int i18 = payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                    int i19 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                    int i20 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes;
                                    int i21 = payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                                    boolean z6 = payPalGetCardUseCase$invoke$1.unwrapAs;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) payPalGetCardUseCase$invoke$1.getOutputStallDurationlomOqCM;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard4 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalGetCardUseCase$invoke$1.getOutputStallDuration;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) payPalGetCardUseCase$invoke$1.getOutputSizes;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) payPalGetCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                                    defaultRaise8 = (arrow.core.raise.DefaultRaise) payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration;
                                    kotlin.ResultKt.throwOnFailure(obj5);
                                    cardArtCollection2 = cardArtCollection3;
                                    digitizedCard3 = digitizedCard4;
                                    deviceWalletServiceCardId3 = deviceWalletServiceCardId4;
                                    payPalCardId2 = payPalCardId3;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(payPalCardId2, deviceWalletServiceCardId3, digitizedCard3, cardArtCollection2, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj5);
                                    defaultRaise8.complete();
                                    return new arrow.core.Either.Right(payPalDigitizedCard);
                                }
                                int i22 = payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                i3 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                                int i23 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes;
                                int i24 = payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                                z3 = payPalGetCardUseCase$invoke$1.unwrapAs;
                                digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalGetCardUseCase$invoke$1.getOutputStallDuration;
                                deviceWalletServiceCardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) payPalGetCardUseCase$invoke$1.getOutputSizes;
                                payPalCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) payPalGetCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup5 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalGetCardUseCase$invoke$1.getOutputSizeshNQ4ISI;
                                digitizedCard2 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalGetCardUseCase$invoke$1.getOutputFormats;
                                str = (java.lang.String) payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizesFor;
                                raise2 = (arrow.core.raise.Raise) payPalGetCardUseCase$invoke$1.getInputFormats;
                                defaultRaise2 = (arrow.core.raise.DefaultRaise) payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration;
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId6 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj5);
                                    defaultRaise7 = defaultRaise2;
                                    cardId5 = cardId6;
                                    obj3 = coroutine_suspended;
                                    cardIdGroup4 = cardIdGroup5;
                                    i5 = i24;
                                    i6 = i23;
                                    highSpeedVideoSizes = obj5;
                                    i7 = i22;
                                } catch (arrow.core.raise.RaiseCancellationException e2) {
                                    e = e2;
                                    defaultRaise4 = defaultRaise2;
                                    defaultRaise4.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise4));
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    defaultRaise2.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                                try {
                                    cardArtCollection = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) highSpeedVideoSizes;
                                    obj2 = obj3;
                                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId7 = cardId5;
                                    i11 = i7;
                                    cardId4 = cardId7;
                                    int i25 = i5;
                                    cardIdGroup3 = cardIdGroup4;
                                    defaultRaise6 = defaultRaise7;
                                    str2 = str;
                                    i8 = i25;
                                    arrow.core.raise.Raise raise6 = raise2;
                                    i10 = i3;
                                    deviceWalletServiceCardId = deviceWalletServiceCardId2;
                                    z4 = z3;
                                    i9 = i6;
                                    raise4 = raise6;
                                    try {
                                        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase = this.Camera2StreamConfigurationMap;
                                        payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId4);
                                        payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise6;
                                        payPalGetCardUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise4);
                                        payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                        payPalGetCardUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard2);
                                        payPalGetCardUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup3);
                                        payPalGetCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = payPalCardId;
                                        payPalGetCardUseCase$invoke$1.getOutputSizes = deviceWalletServiceCardId;
                                        payPalGetCardUseCase$invoke$1.getOutputStallDuration = digitizedCard;
                                        payPalGetCardUseCase$invoke$1.getOutputStallDurationlomOqCM = cardArtCollection;
                                        payPalGetCardUseCase$invoke$1.unwrapAs = z4;
                                        payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap = i8;
                                        payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes = i9;
                                        payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = i10;
                                        payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i11;
                                        payPalGetCardUseCase$invoke$1.toString = 5;
                                        obj5 = payPalGetCardInfoUseCase.invoke(cardId4, payPalGetCardUseCase$invoke$1);
                                        obj4 = obj2;
                                        if (obj5 == obj4) {
                                            return obj4;
                                        }
                                        deviceWalletServiceCardId3 = deviceWalletServiceCardId;
                                        cardArtCollection2 = cardArtCollection;
                                        digitizedCard3 = digitizedCard;
                                        payPalCardId2 = payPalCardId;
                                        defaultRaise8 = defaultRaise6;
                                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(payPalCardId2, deviceWalletServiceCardId3, digitizedCard3, cardArtCollection2, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj5);
                                        defaultRaise8.complete();
                                        return new arrow.core.Either.Right(payPalDigitizedCard2);
                                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                                        e = e3;
                                        defaultRaise2 = defaultRaise6;
                                        defaultRaise4 = defaultRaise2;
                                        defaultRaise4.complete();
                                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise4));
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        defaultRaise2 = defaultRaise6;
                                        defaultRaise2.complete();
                                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                    }
                                } catch (arrow.core.raise.RaiseCancellationException e4) {
                                    e = e4;
                                    defaultRaise2 = defaultRaise7;
                                    defaultRaise4 = defaultRaise2;
                                    defaultRaise4.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise4));
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    defaultRaise2 = defaultRaise7;
                                    defaultRaise2.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            }
                            int i26 = payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                            i3 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                            int i27 = payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes;
                            int i28 = payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                            z3 = payPalGetCardUseCase$invoke$1.unwrapAs;
                            raise = (arrow.core.raise.Raise) payPalGetCardUseCase$invoke$1.getOutputSizeshNQ4ISI;
                            cardIdGroup2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalGetCardUseCase$invoke$1.getOutputFormats;
                            java.lang.String str3 = (java.lang.String) payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizesFor;
                            arrow.core.raise.Raise raise7 = (arrow.core.raise.Raise) payPalGetCardUseCase$invoke$1.getInputFormats;
                            defaultRaise5 = (arrow.core.raise.DefaultRaise) payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration;
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId8 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            invoke = obj5;
                            i7 = i26;
                            cardId3 = cardId8;
                            str = str3;
                            i6 = i27;
                            raise2 = raise7;
                            i5 = i28;
                            either = (arrow.core.Either) invoke;
                            if (either instanceof arrow.core.Either.Left) {
                                obj = coroutine_suspended;
                                if (!(either instanceof arrow.core.Either.Right)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                            } else {
                                com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError getCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError) ((arrow.core.Either.Left) either).getValue();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(getCardError, com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError.CardNotFound.INSTANCE)) {
                                    defaultError = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.CardNotFound.INSTANCE;
                                    obj = coroutine_suspended;
                                } else {
                                    if (!(getCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError.DefaultError)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError.DefaultError defaultError2 = (com.paypal.oslo.feature.taptopay.domain.model.card.GetCardError.DefaultError) getCardError;
                                    obj = coroutine_suspended;
                                    defaultError = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.DefaultError(defaultError2.getDebugMessage(), defaultError2.getThrowable());
                                }
                                right = new arrow.core.Either.Left(defaultError);
                            }
                            digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) raise.bind(right);
                            payPalCardId = cardIdGroup2.getPayPalCardId();
                            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId5 = cardIdGroup2.getDeviceWalletServiceCardId();
                            if (!z3) {
                                payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI = cardId3;
                                payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise5;
                                payPalGetCardUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise2);
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                payPalGetCardUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard);
                                payPalGetCardUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup2);
                                payPalGetCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = payPalCardId;
                                payPalGetCardUseCase$invoke$1.getOutputSizes = deviceWalletServiceCardId5;
                                payPalGetCardUseCase$invoke$1.getOutputStallDuration = digitizedCard;
                                payPalGetCardUseCase$invoke$1.unwrapAs = z3;
                                payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap = i5;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes = i6;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                                payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i7;
                                payPalGetCardUseCase$invoke$1.toString = 4;
                                highSpeedVideoSizes = getHighSpeedVideoSizes(str, payPalGetCardUseCase$invoke$1);
                                cardId5 = cardId3;
                                obj3 = obj;
                                if (highSpeedVideoSizes == obj3) {
                                    return obj3;
                                }
                                defaultRaise7 = defaultRaise5;
                                digitizedCard2 = digitizedCard;
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup6 = cardIdGroup2;
                                deviceWalletServiceCardId2 = deviceWalletServiceCardId5;
                                cardIdGroup4 = cardIdGroup6;
                                cardArtCollection = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) highSpeedVideoSizes;
                                obj2 = obj3;
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId72 = cardId5;
                                i11 = i7;
                                cardId4 = cardId72;
                                int i252 = i5;
                                cardIdGroup3 = cardIdGroup4;
                                defaultRaise6 = defaultRaise7;
                                str2 = str;
                                i8 = i252;
                                arrow.core.raise.Raise raise62 = raise2;
                                i10 = i3;
                                deviceWalletServiceCardId = deviceWalletServiceCardId2;
                                z4 = z3;
                                i9 = i6;
                                raise4 = raise62;
                                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase2 = this.Camera2StreamConfigurationMap;
                                payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId4);
                                payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise6;
                                payPalGetCardUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise4);
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                payPalGetCardUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard2);
                                payPalGetCardUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup3);
                                payPalGetCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = payPalCardId;
                                payPalGetCardUseCase$invoke$1.getOutputSizes = deviceWalletServiceCardId;
                                payPalGetCardUseCase$invoke$1.getOutputStallDuration = digitizedCard;
                                payPalGetCardUseCase$invoke$1.getOutputStallDurationlomOqCM = cardArtCollection;
                                payPalGetCardUseCase$invoke$1.unwrapAs = z4;
                                payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap = i8;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes = i9;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = i10;
                                payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i11;
                                payPalGetCardUseCase$invoke$1.toString = 5;
                                obj5 = payPalGetCardInfoUseCase2.invoke(cardId4, payPalGetCardUseCase$invoke$1);
                                obj4 = obj2;
                                if (obj5 == obj4) {
                                }
                            } else {
                                cardArtCollection = null;
                                obj2 = obj;
                                str2 = str;
                                i8 = i5;
                                cardIdGroup3 = cardIdGroup2;
                                z4 = z3;
                                i9 = i6;
                                raise4 = raise2;
                                i10 = i3;
                                deviceWalletServiceCardId = deviceWalletServiceCardId5;
                                defaultRaise6 = defaultRaise5;
                                digitizedCard2 = digitizedCard;
                                i11 = i7;
                                cardId4 = cardId3;
                                com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase22 = this.Camera2StreamConfigurationMap;
                                payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId4);
                                payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise6;
                                payPalGetCardUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise4);
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                payPalGetCardUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard2);
                                payPalGetCardUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup3);
                                payPalGetCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = payPalCardId;
                                payPalGetCardUseCase$invoke$1.getOutputSizes = deviceWalletServiceCardId;
                                payPalGetCardUseCase$invoke$1.getOutputStallDuration = digitizedCard;
                                payPalGetCardUseCase$invoke$1.getOutputStallDurationlomOqCM = cardArtCollection;
                                payPalGetCardUseCase$invoke$1.unwrapAs = z4;
                                payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap = i8;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes = i9;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = i10;
                                payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i11;
                                payPalGetCardUseCase$invoke$1.toString = 5;
                                obj5 = payPalGetCardInfoUseCase22.invoke(cardId4, payPalGetCardUseCase$invoke$1);
                                obj4 = obj2;
                                if (obj5 == obj4) {
                                }
                            }
                        }
                        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj5;
                        if (cardIdGroup != null) {
                            if (cardId2 instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId) {
                                com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase deleteCardUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.String id = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId) cardId2).getId();
                                payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId2);
                                payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise5;
                                payPalGetCardUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizesFor = raise;
                                payPalGetCardUseCase$invoke$1.unwrapAs = z2;
                                payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap = i5;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes = i4;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                                payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                                payPalGetCardUseCase$invoke$1.toString = 2;
                                if (deleteCardUseCase.invoke(id, payPalGetCardUseCase$invoke$1) != coroutine_suspended) {
                                    raise3 = raise;
                                    raise = raise3;
                                    raise.raise(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.CardNotFound.INSTANCE);
                                    throw new kotlin.KotlinNothingValueException();
                                }
                            } else {
                                raise.raise(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.CardNotFound.INSTANCE);
                                throw new kotlin.KotlinNothingValueException();
                            }
                        } else {
                            java.lang.String id2 = cardIdGroup.getDigitizedCardId().getId();
                            com.paypal.oslo.feature.taptopay.domain.usecase.card.GetCardUseCase getCardUseCase = this.getHighSpeedVideoFpsRangesFor;
                            payPalGetCardUseCase$invoke$1.getInputSizeshNQ4ISI = cardId2;
                            payPalGetCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise5;
                            payPalGetCardUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(raise);
                            payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizesFor = id2;
                            payPalGetCardUseCase$invoke$1.getOutputFormats = cardIdGroup;
                            payPalGetCardUseCase$invoke$1.getOutputSizeshNQ4ISI = raise;
                            payPalGetCardUseCase$invoke$1.unwrapAs = z2;
                            payPalGetCardUseCase$invoke$1.Camera2StreamConfigurationMap = i5;
                            payPalGetCardUseCase$invoke$1.getHighSpeedVideoSizes = i4;
                            payPalGetCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                            payPalGetCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                            payPalGetCardUseCase$invoke$1.toString = 3;
                            invoke = getCardUseCase.invoke(id2, z2, payPalGetCardUseCase$invoke$1);
                            if (invoke != coroutine_suspended) {
                                cardIdGroup2 = cardIdGroup;
                                i6 = i4;
                                raise2 = raise;
                                i7 = i2;
                                cardId3 = cardId2;
                                str = id2;
                                z3 = z2;
                                either = (arrow.core.Either) invoke;
                                if (either instanceof arrow.core.Either.Left) {
                                }
                                digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) raise.bind(right);
                                payPalCardId = cardIdGroup2.getPayPalCardId();
                                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId52 = cardIdGroup2.getDeviceWalletServiceCardId();
                                if (!z3) {
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                if (i != 0) {
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj5;
                if (cardIdGroup != null) {
                }
                return coroutine_suspended;
            } catch (arrow.core.raise.RaiseCancellationException e5) {
                e = e5;
                defaultRaise4 = 4;
            } catch (java.lang.Throwable th5) {
                th = th5;
                defaultRaise2 = 4;
            }
        } catch (arrow.core.raise.RaiseCancellationException e6) {
            e = e6;
            defaultRaise2 = defaultRaise3;
        } catch (java.lang.Throwable th6) {
            th = th6;
            defaultRaise2 = defaultRaise;
        }
        payPalGetCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj52 = payPalGetCardUseCase$invoke$1.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalGetCardUseCase$invoke$1.toString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$getPayPalCardArt$1 payPalGetCardUseCase$getPayPalCardArt$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$getPayPalCardArt$1) {
            payPalGetCardUseCase$getPayPalCardArt$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$getPayPalCardArt$1) continuation;
            if ((payPalGetCardUseCase$getPayPalCardArt$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                payPalGetCardUseCase$getPayPalCardArt$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = payPalGetCardUseCase$getPayPalCardArt$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalGetCardUseCase$getPayPalCardArt$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardArtUseCase payPalGetCardArtUseCase = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId digitizedCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(str);
                    payPalGetCardUseCase$getPayPalCardArt$1.Camera2StreamConfigurationMap = str;
                    payPalGetCardUseCase$getPayPalCardArt$1.getHighSpeedVideoSizes = 1;
                    obj = payPalGetCardArtUseCase.invoke(digitizedCardId, payPalGetCardUseCase$getPayPalCardArt$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) payPalGetCardUseCase$getPayPalCardArt$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError payPalGetCardArtError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError) ((arrow.core.Either.Left) either).getValue();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(payPalGetCardArtError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError.CardArtNotFound.INSTANCE)) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card art not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitized_card_id", str)), null, 4, null);
                        return null;
                    }
                    if (!(payPalGetCardArtError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError.DefaultError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to get PayPal card art", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(payPalGetCardArtError.getClass()).getSimpleName()), kotlin.TuplesKt.to("digitized_card_id", str)), null, ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardArtError.DefaultError) payPalGetCardArtError).getThrowable(), 4, null);
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        payPalGetCardUseCase$getPayPalCardArt$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$getPayPalCardArt$1(this, continuation);
        java.lang.Object obj2 = payPalGetCardUseCase$getPayPalCardArt$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalGetCardUseCase$getPayPalCardArt$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
