package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/api/GetCardApiImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardApi;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardUseCase;", "payPalGetCardUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;", "id", "", "getCardArt", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/GetCardError;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/PayPalDigitizedCard;", "invoke", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetCardApiImpl implements com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardApi {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetCardApiImpl(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase payPalGetCardUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardUseCase, "");
        this.getHighSpeedVideoFpsRanges = payPalGetCardUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId cardId, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.api.domain.model.card.GetCardError, com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl$invoke$1 getCardApiImpl$invoke$1;
        int i;
        arrow.core.Either.Right right;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.GetCardError.DefaultError defaultError;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl$invoke$1) {
            getCardApiImpl$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl$invoke$1) continuation;
            if ((getCardApiImpl$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getCardApiImpl$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getCardApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCardApiImpl$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase payPalGetCardUseCase = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId internal2 = com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toInternal(cardId);
                    getCardApiImpl$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                    getCardApiImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = z;
                    getCardApiImpl$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = payPalGetCardUseCase.invoke(internal2, z, getCardApiImpl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = getCardApiImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                right = (arrow.core.Either) obj;
                if (!(right instanceof arrow.core.Either.Right)) {
                    right = new arrow.core.Either.Right(com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiPayPalDigitizedCard((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) ((arrow.core.Either.Right) right).getValue()));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (right instanceof arrow.core.Either.Left) {
                    if (right instanceof arrow.core.Either.Right) {
                        return new arrow.core.Either.Right(((arrow.core.Either.Right) right).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError payPalGetCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError) ((arrow.core.Either.Left) right).getValue();
                if (payPalGetCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.CardNotFound) {
                    defaultError = com.paypal.oslo.feature.taptopay.api.domain.model.card.GetCardError.CardNotFound.INSTANCE;
                } else {
                    if (!(payPalGetCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetCardError.DefaultError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultError = com.paypal.oslo.feature.taptopay.api.domain.model.card.GetCardError.DefaultError.INSTANCE;
                }
                return new arrow.core.Either.Left(defaultError);
            }
        }
        getCardApiImpl$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.api.GetCardApiImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = getCardApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCardApiImpl$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj2;
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        if (right instanceof arrow.core.Either.Left) {
        }
    }
}
