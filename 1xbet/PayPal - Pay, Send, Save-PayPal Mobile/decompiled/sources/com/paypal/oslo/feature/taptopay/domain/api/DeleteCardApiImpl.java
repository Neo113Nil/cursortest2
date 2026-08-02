package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/api/DeleteCardApiImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/DeleteCardApi;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardUseCase;", "payPalDeleteCardUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;", "id", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/DeleteCardError;", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalDeleteCardUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeleteCardApiImpl implements com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DeleteCardApiImpl(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase payPalDeleteCardUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDeleteCardUseCase, "");
        this.getHighSpeedVideoSizes = payPalDeleteCardUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.api.domain.usecase.card.DeleteCardApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId cardId, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.api.domain.model.card.DeleteCardError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl$invoke$1 deleteCardApiImpl$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.DeleteCardError.DefaultError defaultError;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl$invoke$1) {
            deleteCardApiImpl$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl$invoke$1) continuation;
            if ((deleteCardApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                deleteCardApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = deleteCardApiImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deleteCardApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalDeleteCardUseCase payPalDeleteCardUseCase = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId internal2 = com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toInternal(cardId);
                    deleteCardApiImpl$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardId);
                    deleteCardApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = payPalDeleteCardUseCase.invoke(internal2, deleteCardApiImpl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Left) {
                    if (either instanceof arrow.core.Either.Right) {
                        return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError payPalDeleteCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError) ((arrow.core.Either.Left) either).getValue();
                if (payPalDeleteCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError.InitCheckFailed) {
                    defaultError = com.paypal.oslo.feature.taptopay.api.domain.model.card.DeleteCardError.InitCheckFailed.INSTANCE;
                } else if (payPalDeleteCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError.CardNotFound) {
                    defaultError = com.paypal.oslo.feature.taptopay.api.domain.model.card.DeleteCardError.CardNotFound.INSTANCE;
                } else {
                    if (!(payPalDeleteCardError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDeleteCardError.DefaultError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultError = com.paypal.oslo.feature.taptopay.api.domain.model.card.DeleteCardError.DefaultError.INSTANCE;
                }
                return new arrow.core.Either.Left(defaultError);
            }
        }
        deleteCardApiImpl$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.api.DeleteCardApiImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = deleteCardApiImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deleteCardApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Left) {
        }
    }
}
