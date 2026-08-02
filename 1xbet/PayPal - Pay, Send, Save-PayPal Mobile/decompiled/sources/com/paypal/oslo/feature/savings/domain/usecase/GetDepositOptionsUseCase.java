package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/GetDepositOptionsUseCase;", "", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "savingsRepository", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;)V", "Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsData;", "invoke", "(Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetDepositOptionsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.repository.SavingsRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetDepositOptionsUseCase(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsRepository, "");
        this.getHighSpeedVideoFpsRanges = savingsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput depositOptionsInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.DepositOptionsData>> continuation) {
        com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase$invoke$1 getDepositOptionsUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase$invoke$1) {
            getDepositOptionsUseCase$invoke$1 = (com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase$invoke$1) continuation;
            if ((getDepositOptionsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                getDepositOptionsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = getDepositOptionsUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getDepositOptionsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository = this.getHighSpeedVideoFpsRanges;
                    getDepositOptionsUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsInput);
                    getDepositOptionsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = savingsRepository.getDepositOptions(depositOptionsInput, getDepositOptionsUseCase$invoke$1);
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
                if (either instanceof arrow.core.Either.Right) {
                    if (either instanceof arrow.core.Either.Left) {
                        return arrow.core.EitherKt.left((com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.util.List<com.paypal.oslo.feature.savings.domain.model.DepositOption> options = ((com.paypal.oslo.feature.savings.domain.model.DepositOptionsData) ((arrow.core.Either.Right) either).getValue()).getOptions();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.paypal.oslo.feature.savings.domain.model.DepositOption depositOption : options) {
                    com.paypal.oslo.feature.savings.domain.model.DepositFundingSource depositFundingSource = (com.paypal.oslo.feature.savings.domain.model.DepositFundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) depositOption.getFundingSources());
                    com.paypal.oslo.feature.savings.domain.model.DepositOption copy$default = depositFundingSource != null ? com.paypal.oslo.feature.savings.domain.model.DepositOption.copy$default(depositOption, null, false, kotlin.collections.CollectionsKt.listOf(depositFundingSource), null, null, null, 59, null) : null;
                    if (copy$default != null) {
                        arrayList.add(copy$default);
                    }
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.feature.savings.domain.model.DepositOptionsData(arrayList));
            }
        }
        getDepositOptionsUseCase$invoke$1 = new com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getDepositOptionsUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getDepositOptionsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Right) {
        }
    }
}
