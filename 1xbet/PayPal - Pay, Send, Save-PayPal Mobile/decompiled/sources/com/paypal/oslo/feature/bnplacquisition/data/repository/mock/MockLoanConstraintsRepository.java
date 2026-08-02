package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/mock/MockLoanConstraintsRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/LoanConstraintsRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/LoanConstraintsRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanConstraints;", "getLoanConstraints", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/LoanConstraintsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockLoanConstraintsRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockLoanConstraintsRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getLoanConstraints(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockLoanConstraintsRepository$getLoanConstraints$1 mockLoanConstraintsRepository$getLoanConstraints$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockLoanConstraintsRepository$getLoanConstraints$1) {
            mockLoanConstraintsRepository$getLoanConstraints$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockLoanConstraintsRepository$getLoanConstraints$1) continuation;
            if ((mockLoanConstraintsRepository$getLoanConstraints$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockLoanConstraintsRepository$getLoanConstraints$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockLoanConstraintsRepository$getLoanConstraints$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockLoanConstraintsRepository$getLoanConstraints$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockLoanConstraintsRepository$getLoanConstraints$1.Camera2StreamConfigurationMap = loanConstraintsRequest;
                    mockLoanConstraintsRepository$getLoanConstraints$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, mockLoanConstraintsRepository$getLoanConstraints$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    loanConstraintsRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest) mockLoanConstraintsRepository$getLoanConstraints$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints(new com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "5000.00"), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "200.00")), !loanConstraintsRequest.getIncludePrequalSummary() ? new com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "5000.00")) : null));
            }
        }
        mockLoanConstraintsRepository$getLoanConstraints$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockLoanConstraintsRepository$getLoanConstraints$1(this, continuation);
        java.lang.Object obj2 = mockLoanConstraintsRepository$getLoanConstraints$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockLoanConstraintsRepository$getLoanConstraints$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints(new com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "5000.00"), new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "200.00")), !loanConstraintsRequest.getIncludePrequalSummary() ? new com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower(new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "5000.00")) : null));
    }
}
