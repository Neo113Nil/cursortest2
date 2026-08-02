package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/DeleteCardUseCase;", "deleteCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;", "getCardIdGroupUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/DeleteCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "id", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDeleteCardError;", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/DeleteCardUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalDeleteCardUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PayPalDeleteCardUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase deleteCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupUseCase, "");
        this.Camera2StreamConfigurationMap = deleteCardUseCase;
        this.getHighSpeedVideoFpsRanges = payPalGetCardIdGroupUseCase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0117 A[Catch: all -> 0x01d5, RaiseCancellationException -> 0x01df, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x01df, all -> 0x01d5, blocks: (B:12:0x0049, B:13:0x0111, B:16:0x0117, B:18:0x0123, B:19:0x014d, B:20:0x016d, B:22:0x0173, B:23:0x019c, B:26:0x0131, B:28:0x0135, B:29:0x013b, B:31:0x013f, B:32:0x0155, B:33:0x015a, B:36:0x015f, B:37:0x01b8, B:38:0x01bd, B:45:0x00cd, B:47:0x00d1, B:52:0x01be, B:53:0x01d3, B:62:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0173 A[Catch: all -> 0x01d5, RaiseCancellationException -> 0x01df, TryCatch #4 {RaiseCancellationException -> 0x01df, all -> 0x01d5, blocks: (B:12:0x0049, B:13:0x0111, B:16:0x0117, B:18:0x0123, B:19:0x014d, B:20:0x016d, B:22:0x0173, B:23:0x019c, B:26:0x0131, B:28:0x0135, B:29:0x013b, B:31:0x013f, B:32:0x0155, B:33:0x015a, B:36:0x015f, B:37:0x01b8, B:38:0x01bd, B:45:0x00cd, B:47:0x00d1, B:52:0x01be, B:53:0x01d3, B:62:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[Catch: all -> 0x01d5, RaiseCancellationException -> 0x01df, TryCatch #4 {RaiseCancellationException -> 0x01df, all -> 0x01d5, blocks: (B:12:0x0049, B:13:0x0111, B:16:0x0117, B:18:0x0123, B:19:0x014d, B:20:0x016d, B:22:0x0173, B:23:0x019c, B:26:0x0131, B:28:0x0135, B:29:0x013b, B:31:0x013f, B:32:0x0155, B:33:0x015a, B:36:0x015f, B:37:0x01b8, B:38:0x01bd, B:45:0x00cd, B:47:0x00d1, B:52:0x01be, B:53:0x01d3, B:62:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01be A[Catch: all -> 0x01d5, RaiseCancellationException -> 0x01df, TryCatch #4 {RaiseCancellationException -> 0x01df, all -> 0x01d5, blocks: (B:12:0x0049, B:13:0x0111, B:16:0x0117, B:18:0x0123, B:19:0x014d, B:20:0x016d, B:22:0x0173, B:23:0x019c, B:26:0x0131, B:28:0x0135, B:29:0x013b, B:31:0x013f, B:32:0x0155, B:33:0x015a, B:36:0x015f, B:37:0x01b8, B:38:0x01bd, B:45:0x00cd, B:47:0x00d1, B:52:0x01be, B:53:0x01d3, B:62:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [arrow.core.raise.Raise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase$invoke$1 payPalDeleteCardUseCase$invoke$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId2;
        int i;
        int i2;
        int i3;
        int i4;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup cardIdGroup;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError.DefaultError defaultError;
        try {
            if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase$invoke$1) {
                payPalDeleteCardUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase$invoke$1) continuation;
                if ((payPalDeleteCardUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    payPalDeleteCardUseCase$invoke$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = payPalDeleteCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = payPalDeleteCardUseCase$invoke$1.getOutputFormats;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                        defaultRaise3 = defaultRaise2;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Deleting PayPal card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("card_id_type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(cardId.getClass()).getSimpleName())), null, 4, null);
                        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupUseCase payPalGetCardIdGroupUseCase = this.getHighSpeedVideoFpsRanges;
                        payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                        payPalDeleteCardUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise2;
                        payPalDeleteCardUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise3;
                        payPalDeleteCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        payPalDeleteCardUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        payPalDeleteCardUseCase$invoke$1.getOutputFormats = 1;
                        cardId2 = cardId;
                        java.lang.Object invoke = payPalGetCardIdGroupUseCase.invoke(cardId2, payPalDeleteCardUseCase$invoke$1);
                        if (invoke != coroutine_suspended) {
                            i = 0;
                            i2 = 0;
                            i3 = 0;
                            obj = invoke;
                            i4 = 0;
                        }
                        return coroutine_suspended;
                    }
                    if (r4 != 1) {
                        if (r4 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i6 = payPalDeleteCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i7 = payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i8 = payPalDeleteCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        raise = (arrow.core.raise.Raise) payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoSizesFor;
                        defaultRaise2 = (arrow.core.raise.DefaultRaise) payPalDeleteCardUseCase$invoke$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        either = (arrow.core.Either) obj;
                        if (either instanceof arrow.core.Either.Left) {
                            if (!(either instanceof arrow.core.Either.Right)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                        } else {
                            com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError deleteCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError) ((arrow.core.Either.Left) either).getValue();
                            if (deleteCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError.InitCheckFailed) {
                                defaultError = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError.InitCheckFailed(((com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError.InitCheckFailed) deleteCardError).getDebugMessage());
                            } else if (deleteCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError.CardNotFound) {
                                defaultError = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError.CardNotFound.INSTANCE;
                            } else {
                                if (!(deleteCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError.DefaultError)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                defaultError = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError.DefaultError(((com.paypal.oslo.feature.taptopay.domain.model.card.DeleteCardError.DefaultError) deleteCardError).getDebugMessage(), null, 2, null);
                            }
                            right = new arrow.core.Either.Left(defaultError);
                        }
                        if (right.isLeft()) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to delete digitized card", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError) ((arrow.core.Either.Left) right).getValue()).getClass()).getSimpleName())), null, 4, null);
                        }
                        raise.bind(right);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Digitized card successfully deleted", null, null, 6, null);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(unit);
                    }
                    int i9 = payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i10 = payPalDeleteCardUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i11 = payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i12 = payPalDeleteCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    ?? r9 = (arrow.core.raise.Raise) payPalDeleteCardUseCase$invoke$1.getOutputMinFrameDuration;
                    defaultRaise = (arrow.core.raise.DefaultRaise) payPalDeleteCardUseCase$invoke$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId cardId3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId) payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i4 = i9;
                        defaultRaise2 = defaultRaise;
                        i2 = i11;
                        defaultRaise3 = r9;
                        i = i10;
                        cardId2 = cardId3;
                        i3 = i12;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                    cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
                    if (cardIdGroup != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card not found, failing use case", null, null, 6, null);
                        defaultRaise3.raise(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError.CardNotFound.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card found, triggering delete digitized card use case", null, null, 6, null);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.DeleteCardUseCase deleteCardUseCase = this.Camera2StreamConfigurationMap;
                    java.lang.String id = cardIdGroup.getDigitizedCardId().getId();
                    payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId2);
                    payPalDeleteCardUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise2;
                    payPalDeleteCardUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                    payPalDeleteCardUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardIdGroup);
                    payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoSizesFor = defaultRaise3;
                    payPalDeleteCardUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                    payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                    payPalDeleteCardUseCase$invoke$1.Camera2StreamConfigurationMap = i;
                    payPalDeleteCardUseCase$invoke$1.getHighSpeedVideoSizes = i4;
                    payPalDeleteCardUseCase$invoke$1.getOutputFormats = 2;
                    obj = deleteCardUseCase.invoke(id, payPalDeleteCardUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    raise = defaultRaise3;
                    either = (arrow.core.Either) obj;
                    if (either instanceof arrow.core.Either.Left) {
                    }
                    if (right.isLeft()) {
                    }
                    raise.bind(right);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Digitized card successfully deleted", null, null, 6, null);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    defaultRaise2.complete();
                    return new arrow.core.Either.Right(unit2);
                }
            }
            if (r4 != 0) {
            }
            cardIdGroup = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) obj;
            if (cardIdGroup != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = r4;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = r4;
        }
        payPalDeleteCardUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = payPalDeleteCardUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = payPalDeleteCardUseCase$invoke$1.getOutputFormats;
    }
}
