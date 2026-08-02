package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/usecase/autoreload/GetBalanceIdUseCaseImpl;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetBalanceIdUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;", "balanceRepository", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;)V", "", "currencyCode", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/balance/domain/repository/balance/BalanceRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBalanceIdUseCaseImpl implements com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetBalanceIdUseCaseImpl(com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository balanceRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceRepository, "");
        this.Camera2StreamConfigurationMap = balanceRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl$invoke$1 getBalanceIdUseCaseImpl$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError genericApiError;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl$invoke$1) {
            getBalanceIdUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl$invoke$1) continuation;
            if ((getBalanceIdUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                getBalanceIdUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = getBalanceIdUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getBalanceIdUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository balanceRepository = this.Camera2StreamConfigurationMap;
                    getBalanceIdUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getBalanceIdUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = balanceRepository.fetchBalanceId(getBalanceIdUseCaseImpl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue();
                    if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                        genericApiError = com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE;
                    } else {
                        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        genericApiError = com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError.INSTANCE;
                    }
                    return new arrow.core.Either.Left(genericApiError);
                }
                if (either instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getBalanceIdUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = getBalanceIdUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getBalanceIdUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }
}
