package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\\\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/UpdateMoneyboxTransferScheduleUseCase;", "", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "savingsRepository", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;)V", "", "moneyboxId", "scheduleId", "startDate", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "frequency", "financialInstrumentId", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;", "amount", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/UpdateMoneyboxTransferScheduleResult;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UpdateMoneyboxTransferScheduleUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.repository.SavingsRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UpdateMoneyboxTransferScheduleUseCase(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsRepository, "");
        this.getHighSpeedVideoSizes = savingsRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str4, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult>> continuation) {
        return this.getHighSpeedVideoSizes.updateMoneyboxTransferSchedule(str, str2, str3, frequencyType, str4, money, continuation);
    }
}
