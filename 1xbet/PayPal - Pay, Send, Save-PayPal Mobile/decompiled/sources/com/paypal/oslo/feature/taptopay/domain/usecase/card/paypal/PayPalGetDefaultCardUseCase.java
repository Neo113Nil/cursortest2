package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n*\u00020\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetDefaultCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetDefaultCardUseCase;", "getDefaultCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getCardIdGroupUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;", "payPalGetCardInfoUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetDefaultCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalGetDefaultCardError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/GetDefaultCardUseCase;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardInfoUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalGetDefaultCardUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PayPalGetDefaultCardUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase getDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDefaultCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardInfoUseCase, "");
        this.getHighSpeedVideoSizes = getDefaultCardUseCase;
        this.getHighSpeedVideoFpsRangesFor = payPalGetCardIdGroupUseCase;
        this.Camera2StreamConfigurationMap = payPalGetCardInfoUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r6 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0050, code lost:
    
        if (r6 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetDefaultCardError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$invoke$1 payPalGetDefaultCardUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetDefaultCardError.DefaultError defaultError;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$invoke$1) {
            payPalGetDefaultCardUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$invoke$1) continuation;
            if ((payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = payPalGetDefaultCardUseCase$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.GetDefaultCardUseCase getDefaultCardUseCase = this.getHighSpeedVideoSizes;
                    payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getDefaultCardUseCase.invoke(payPalGetDefaultCardUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i3 = payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either either2 = (arrow.core.Either) obj;
                        if (either2 != null) {
                            return either2;
                        }
                        return arrow.core.EitherKt.right(null);
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) ((arrow.core.Either.Right) either).getValue();
                    if (digitizedCard != null) {
                        payPalGetDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        payPalGetDefaultCardUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard);
                        payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = 2;
                        obj = getHighResolutionOutputSizeshNQ4ISI(digitizedCard, payPalGetDefaultCardUseCase$invoke$1);
                    }
                    return arrow.core.EitherKt.right(null);
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError getDefaultCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError) ((arrow.core.Either.Left) either).getValue();
                if (getDefaultCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError.InitCheckFailed) {
                    defaultError = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetDefaultCardError.InitCheckFailed(((com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError.InitCheckFailed) getDefaultCardError).getDebugMessage());
                } else {
                    if (!(getDefaultCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError.DefaultError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError.DefaultError defaultError2 = (com.paypal.oslo.feature.taptopay.domain.model.card.GetDefaultCardError.DefaultError) getDefaultCardError;
                    defaultError = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetDefaultCardError.DefaultError(defaultError2.getDebugMessage(), defaultError2.getThrowable());
                }
                return arrow.core.EitherKt.left(defaultError);
            }
        }
        payPalGetDefaultCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = payPalGetDefaultCardUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalGetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007f, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:32:0x0058, B:33:0x00b5, B:35:0x00b9), top: B:31:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetDefaultCardError, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$toPayPalDigitizedCard$1 payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup2;
        java.lang.Throwable th;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup3;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard3;
        int i2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup4;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard4;
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard5;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$toPayPalDigitizedCard$1) {
            payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$toPayPalDigitizedCard$1) continuation;
            if ((payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId digitizedCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(digitizedCard.getCardId());
                    payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoFpsRangesFor = digitizedCard;
                    payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = payPalGetCardIdGroupUseCase.invoke(digitizedCardId, payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i3 = payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.Camera2StreamConfigurationMap;
                            cardIdGroup4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoSizes;
                            digitizedCard4 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoFpsRangesFor;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                cardInfo = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj;
                                m23436constructorimpl = kotlin.Result.m23436constructorimpl(cardInfo);
                                digitizedCard5 = digitizedCard4;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard6 = digitizedCard4;
                                cardIdGroup2 = cardIdGroup4;
                                digitizedCard = digitizedCard6;
                                digitizedCard2 = digitizedCard;
                                th = th;
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                cardIdGroup4 = cardIdGroup2;
                                digitizedCard5 = digitizedCard2;
                                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                }
                                return arrow.core.EitherKt.right(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(cardIdGroup4.getPayPalCardId(), cardIdGroup4.getDeviceWalletServiceCardId(), digitizedCard5, null, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) m23436constructorimpl));
                            }
                            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                m23436constructorimpl = null;
                            }
                            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(cardIdGroup4.getPayPalCardId(), cardIdGroup4.getDeviceWalletServiceCardId(), digitizedCard5, null, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) m23436constructorimpl));
                        }
                        i2 = payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.Camera2StreamConfigurationMap;
                        digitizedCard3 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoFpsRanges;
                        cardIdGroup3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoSizes;
                        digitizedCard2 = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            cardInfo = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            cardIdGroup2 = cardIdGroup3;
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                            cardIdGroup4 = cardIdGroup2;
                            digitizedCard5 = digitizedCard2;
                            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                            }
                            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(cardIdGroup4.getPayPalCardId(), cardIdGroup4.getDeviceWalletServiceCardId(), digitizedCard5, null, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) m23436constructorimpl));
                        }
                        if (cardInfo == null) {
                            cardIdGroup4 = cardIdGroup3;
                            digitizedCard4 = digitizedCard2;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(cardInfo);
                            digitizedCard5 = digitizedCard4;
                            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                            }
                            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(cardIdGroup4.getPayPalCardId(), cardIdGroup4.getDeviceWalletServiceCardId(), digitizedCard5, null, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) m23436constructorimpl));
                        }
                        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId digitizedCardId2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(digitizedCard3.getCardId());
                        payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoFpsRangesFor = digitizedCard2;
                        payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoSizes = cardIdGroup3;
                        payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(digitizedCard3);
                        payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.Camera2StreamConfigurationMap = i2;
                        payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                        obj = payPalGetCardInfoUseCase.invoke(digitizedCardId2, payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1);
                        if (obj != coroutine_suspended) {
                            cardIdGroup4 = cardIdGroup3;
                            digitizedCard4 = digitizedCard2;
                            cardInfo = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(cardInfo);
                            digitizedCard5 = digitizedCard4;
                            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                            }
                            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(cardIdGroup4.getPayPalCardId(), cardIdGroup4.getDeviceWalletServiceCardId(), digitizedCard5, null, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) m23436constructorimpl));
                        }
                        return coroutine_suspended;
                    }
                    digitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard) payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                if (cardIdGroup != null) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetDefaultCardError.CardNotFound.INSTANCE);
                }
                try {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardInfoUseCase payPalGetCardInfoUseCase2 = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(cardIdGroup.getPayPalCardId().getId());
                    payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoFpsRangesFor = digitizedCard;
                    payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoSizes = cardIdGroup;
                    payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighSpeedVideoFpsRanges = digitizedCard;
                    payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.Camera2StreamConfigurationMap = 0;
                    payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    java.lang.Object invoke = payPalGetCardInfoUseCase2.invoke(payPalCardId, payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1);
                    if (invoke != coroutine_suspended) {
                        digitizedCard2 = digitizedCard;
                        cardIdGroup3 = cardIdGroup;
                        obj = invoke;
                        digitizedCard3 = digitizedCard2;
                        i2 = 0;
                        cardInfo = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) obj;
                        if (cardInfo == null) {
                        }
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th4) {
                    cardIdGroup2 = cardIdGroup;
                    th = th4;
                    digitizedCard2 = digitizedCard;
                    th = th;
                    kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    cardIdGroup4 = cardIdGroup2;
                    digitizedCard5 = digitizedCard2;
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                    }
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard(cardIdGroup4.getPayPalCardId(), cardIdGroup4.getDeviceWalletServiceCardId(), digitizedCard5, null, (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo) m23436constructorimpl));
                }
            }
        }
        payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$toPayPalDigitizedCard$1(this, continuation);
        java.lang.Object obj2 = payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalGetDefaultCardUseCase$toPayPalDigitizedCard$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj2;
        if (cardIdGroup != null) {
        }
    }
}
