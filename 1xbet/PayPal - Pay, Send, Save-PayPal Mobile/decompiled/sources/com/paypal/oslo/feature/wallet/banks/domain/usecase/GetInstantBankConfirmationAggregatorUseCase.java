package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/usecase/GetInstantBankConfirmationAggregatorUseCase;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/InstantBankConfirmationRepository;", "instantBankConfirmationRepository", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/repository/InstantBankConfirmationRepository;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "instantBankConfirmationAggregatorParams", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorResult;", "invoke", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/InstantBankConfirmationRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetInstantBankConfirmationAggregatorUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.domain.repository.InstantBankConfirmationRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetInstantBankConfirmationAggregatorUseCase(com.paypal.oslo.feature.wallet.banks.domain.repository.InstantBankConfirmationRepository instantBankConfirmationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instantBankConfirmationRepository, "");
        this.getHighSpeedVideoFpsRangesFor = instantBankConfirmationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult> continuation) {
        com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase$invoke$1 getInstantBankConfirmationAggregatorUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams2 = instantBankConfirmationAggregatorParams;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase$invoke$1) {
            getInstantBankConfirmationAggregatorUseCase$invoke$1 = (com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase$invoke$1) continuation;
            if ((getInstantBankConfirmationAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                getInstantBankConfirmationAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = getInstantBankConfirmationAggregatorUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getInstantBankConfirmationAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.wallet.banks.domain.repository.InstantBankConfirmationRepository instantBankConfirmationRepository = this.getHighSpeedVideoFpsRangesFor;
                    getInstantBankConfirmationAggregatorUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = instantBankConfirmationAggregatorParams2;
                    getInstantBankConfirmationAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = instantBankConfirmationRepository.getInstantBankConfirmationAggregator(instantBankConfirmationAggregatorParams2, getInstantBankConfirmationAggregatorUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    instantBankConfirmationAggregatorParams2 = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams) getInstantBankConfirmationAggregatorUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Instant bank confirmation aggregator API failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("params", instantBankConfirmationAggregatorParams2)), null, 4, null);
                    return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.UNKNOWN, "", "", com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.UNKNOWN, "", "", "", kotlin.collections.CollectionsKt.emptyList());
                }
                if (!(either instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult) ((arrow.core.Either.Right) either).getValue();
            }
        }
        getInstantBankConfirmationAggregatorUseCase$invoke$1 = new com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getInstantBankConfirmationAggregatorUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getInstantBankConfirmationAggregatorUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
    }
}
