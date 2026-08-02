package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase;", "", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "savingsRepository", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;)V", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/TransferMoneyboxRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult;", "invoke", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/TransferMoneyboxRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "getHighSpeedVideoFpsRangesFor", "TransferResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransferMoneyboxUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.repository.SavingsRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public TransferMoneyboxUseCase(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsRepository, "");
        this.getHighSpeedVideoFpsRangesFor = savingsRepository;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult;", "", "<init>", "()V", "OneTime", "Scheduled", "Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult$OneTime;", "Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult$Scheduled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class TransferResult {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult$OneTime;", "Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;)Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult$OneTime;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OneTime extends com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OneTime(com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult moneyboxTransferResult) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxTransferResult, "");
                this.result = moneyboxTransferResult;
            }

            public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult getResult() {
                return this.result;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult moneyboxTransferResult = this.result;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OneTime(result=");
                sb.append(moneyboxTransferResult);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.OneTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.OneTime) other).result);
            }

            public final com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.OneTime copy(com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.OneTime(result);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult getResult() {
                return this.result;
            }

            public static /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.OneTime copy$default(com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.OneTime oneTime, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult moneyboxTransferResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    moneyboxTransferResult = oneTime.result;
                }
                return oneTime.copy(moneyboxTransferResult);
            }
        }

        private TransferResult() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult$Scheduled;", "Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferScheduleResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferScheduleResult;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferScheduleResult;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferScheduleResult;)Lcom/paypal/oslo/feature/savings/domain/usecase/TransferMoneyboxUseCase$TransferResult$Scheduled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferScheduleResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Scheduled extends com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Scheduled(com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult moneyboxTransferScheduleResult) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxTransferScheduleResult, "");
                this.result = moneyboxTransferScheduleResult;
            }

            public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult getResult() {
                return this.result;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult moneyboxTransferScheduleResult = this.result;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Scheduled(result=");
                sb.append(moneyboxTransferScheduleResult);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.Scheduled) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.Scheduled) other).result);
            }

            public final com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.Scheduled copy(com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.Scheduled(result);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult getResult() {
                return this.result;
            }

            public static /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.Scheduled copy$default(com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.Scheduled scheduled, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult moneyboxTransferScheduleResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    moneyboxTransferScheduleResult = scheduled.result;
                }
                return scheduled.copy(moneyboxTransferScheduleResult);
            }
        }

        public /* synthetic */ TransferResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r10 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        if (r10 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest transferMoneyboxRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult>> continuation) {
        com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase$invoke$1 transferMoneyboxUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase$invoke$1) {
            transferMoneyboxUseCase$invoke$1 = (com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase$invoke$1) continuation;
            if ((transferMoneyboxUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                transferMoneyboxUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase$invoke$1 transferMoneyboxUseCase$invoke$12 = transferMoneyboxUseCase$invoke$1;
                java.lang.Object obj = transferMoneyboxUseCase$invoke$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transferMoneyboxUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either either = (arrow.core.Either) obj;
                        if (either instanceof arrow.core.Either.Right) {
                            return new arrow.core.Either.Right(new com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.OneTime((com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult) ((arrow.core.Either.Right) either).getValue()));
                        }
                        if (either instanceof arrow.core.Either.Left) {
                            return either;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either either2 = (arrow.core.Either) obj;
                    if (either2 instanceof arrow.core.Either.Right) {
                        return new arrow.core.Either.Right(new com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.Scheduled((com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult) ((arrow.core.Either.Right) either2).getValue()));
                    }
                    if (either2 instanceof arrow.core.Either.Left) {
                        return either2;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (transferMoneyboxRequest.getFrequency() == com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME) {
                    com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String fromFiID = transferMoneyboxRequest.getFromFiID();
                    com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType transferType = transferMoneyboxRequest.getTransferType();
                    java.lang.String toFiID = transferMoneyboxRequest.getToFiID();
                    com.paypal.oslo.feature.savings.domain.model.transfers.Money amount = transferMoneyboxRequest.getAmount();
                    java.lang.String description = transferMoneyboxRequest.getDescription();
                    transferMoneyboxUseCase$invoke$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transferMoneyboxRequest);
                    transferMoneyboxUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = savingsRepository.transferMoneybox(fromFiID, transferType, toFiID, amount, description, transferMoneyboxUseCase$invoke$12);
                } else {
                    if (transferMoneyboxRequest.getStartDate() == null) {
                        throw new java.lang.IllegalArgumentException("startDate is required for scheduled transfers".toString());
                    }
                    com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository2 = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String toFiID2 = transferMoneyboxRequest.getToFiID();
                    java.lang.String fromFiID2 = transferMoneyboxRequest.getFromFiID();
                    com.paypal.oslo.feature.savings.domain.model.transfers.Money amount2 = transferMoneyboxRequest.getAmount();
                    com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency = transferMoneyboxRequest.getFrequency();
                    java.lang.String startDate = transferMoneyboxRequest.getStartDate();
                    transferMoneyboxUseCase$invoke$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transferMoneyboxRequest);
                    transferMoneyboxUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = 2;
                    obj = savingsRepository2.transferMoneyboxSchedule(toFiID2, fromFiID2, amount2, frequency, startDate, transferMoneyboxUseCase$invoke$12);
                }
                return coroutine_suspended;
            }
        }
        transferMoneyboxUseCase$invoke$1 = new com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase$invoke$1 transferMoneyboxUseCase$invoke$122 = transferMoneyboxUseCase$invoke$1;
        java.lang.Object obj2 = transferMoneyboxUseCase$invoke$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transferMoneyboxUseCase$invoke$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
        }
    }
}
