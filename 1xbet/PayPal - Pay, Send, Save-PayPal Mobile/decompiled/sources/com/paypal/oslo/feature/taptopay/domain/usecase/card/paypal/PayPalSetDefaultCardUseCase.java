package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetDefaultCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetDefaultCardUseCase;", "setDefaultCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getCardIdGroupUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetDefaultCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "id", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalSetDefaultCardError;", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/SetDefaultCardUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalSetDefaultCardUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayPalSetDefaultCardUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setDefaultCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupUseCase, "");
        this.getHighSpeedVideoFpsRanges = setDefaultCardUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalGetCardIdGroupUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        if (r2 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase$invoke$1 payPalSetDefaultCardUseCase$invoke$1;
        int i;
        java.lang.String id;
        java.lang.Object invoke;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        java.lang.String str;
        arrow.core.Either either;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.DefaultError defaultError;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase$invoke$1) {
            payPalSetDefaultCardUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase$invoke$1) continuation;
            if ((payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = payPalSetDefaultCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (cardId instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId) {
                        id = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId) cardId).getId();
                    } else if (cardId instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) {
                        id = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) cardId).getId();
                    } else {
                        if (!(cardId instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        id = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) cardId).getId();
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Setting default card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card_id", id)), null, 4, null);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    payPalSetDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                    payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes = id;
                    payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    invoke = payPalGetCardIdGroupUseCase.invoke(cardId, payPalSetDefaultCardUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (java.lang.String) payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = (arrow.core.Either) obj;
                        if (!(either instanceof arrow.core.Either.Right)) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Default card set successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card_id", str)), null, 4, null);
                            return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                        }
                        if (either instanceof arrow.core.Either.Left) {
                            com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError setDefaultCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError) ((arrow.core.Either.Left) either).getValue();
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to set default card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card_id", str), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(setDefaultCardError.getClass()).getSimpleName())), null, 4, null);
                            if (setDefaultCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.InitCheckFailed) {
                                defaultError = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.InitCheckFailed(((com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.InitCheckFailed) setDefaultCardError).getDebugMessage());
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(setDefaultCardError, com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.CardNotFound.INSTANCE)) {
                                defaultError = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.CardNotFound.INSTANCE;
                            } else {
                                if (!(setDefaultCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.DefaultError)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.DefaultError defaultError2 = (com.paypal.oslo.feature.taptopay.domain.model.card.SetDefaultCardError.DefaultError) setDefaultCardError;
                                defaultError = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.DefaultError(defaultError2.getDebugMessage(), defaultError2.getThrowable());
                            }
                            return arrow.core.EitherKt.left(defaultError);
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.String str2 = (java.lang.String) payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) payPalSetDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    id = str2;
                    cardId = cardId2;
                    invoke = obj;
                }
                cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) invoke;
                if (cardIdGroup != null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card ID group not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card_id", id)), null, 4, null);
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError.CardNotFound.INSTANCE);
                }
                com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase = this.getHighSpeedVideoFpsRanges;
                java.lang.String id2 = cardIdGroup.getDigitizedCardId().getId();
                payPalSetDefaultCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoSizes = id;
                payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup);
                payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 2;
                java.lang.Object invoke2 = setDefaultCardUseCase.invoke(id2, payPalSetDefaultCardUseCase$invoke$1);
                if (invoke2 != coroutine_suspended) {
                    java.lang.String str3 = id;
                    obj = invoke2;
                    str = str3;
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Right)) {
                    }
                }
                return coroutine_suspended;
            }
        }
        payPalSetDefaultCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = payPalSetDefaultCardUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalSetDefaultCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) invoke;
        if (cardIdGroup != null) {
        }
    }
}
