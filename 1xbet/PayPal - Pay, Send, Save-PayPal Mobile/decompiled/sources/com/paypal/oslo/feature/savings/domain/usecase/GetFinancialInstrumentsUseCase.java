package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/GetFinancialInstrumentsUseCase;", "", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsBalanceUseCase;", "getSavingsBalanceUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetDepositOptionsUseCase;", "getDepositOptionsUseCase", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsBalanceUseCase;Lcom/paypal/oslo/feature/savings/domain/usecase/GetDepositOptionsUseCase;)V", "Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsInput;", "input", "", "canFetchAllFis", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "invoke", "(Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsInput;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsBalanceUseCase;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetDepositOptionsUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetFinancialInstrumentsUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.GetSavingsBalanceUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetFinancialInstrumentsUseCase(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsBalanceUseCase getSavingsBalanceUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase getDepositOptionsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSavingsBalanceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getDepositOptionsUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = getSavingsBalanceUseCase;
        this.getHighSpeedVideoFpsRanges = getDepositOptionsUseCase;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase getFinancialInstrumentsUseCase, com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput depositOptionsInput, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return getFinancialInstrumentsUseCase.invoke(depositOptionsInput, z, continuation);
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput depositOptionsInput, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO>>> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2(depositOptionsInput, z, this, null), continuation);
    }
}
