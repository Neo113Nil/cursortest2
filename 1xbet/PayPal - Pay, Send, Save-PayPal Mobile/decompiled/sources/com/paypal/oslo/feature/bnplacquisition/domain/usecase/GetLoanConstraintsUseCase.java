package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetLoanConstraintsUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/LoanConstraintsRequest;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/LoanConstraintsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/LoanConstraintsRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/LoanConstraintsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/LoanConstraintsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetLoanConstraintsUseCase extends com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetLoanConstraintsUseCase(com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository loanConstraintsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loanConstraintsRepository, "");
        this.getHighSpeedVideoSizes = loanConstraintsRepository;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest, kotlin.coroutines.Continuation continuation) {
        return invoke2(loanConstraintsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase$invoke$1 getLoanConstraintsUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase getLoanConstraintsUseCase;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase$invoke$1) {
            getLoanConstraintsUseCase$invoke$1 = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase$invoke$1) continuation;
            if ((getLoanConstraintsUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getLoanConstraintsUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getLoanConstraintsUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getLoanConstraintsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository loanConstraintsRepository = this.getHighSpeedVideoSizes;
                    getLoanConstraintsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanConstraintsRequest);
                    getLoanConstraintsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    getLoanConstraintsUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = loanConstraintsRepository.getLoanConstraints(loanConstraintsRequest, getLoanConstraintsUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getLoanConstraintsUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getLoanConstraintsUseCase = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase) getLoanConstraintsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getLoanConstraintsUseCase.toUseCaseResult((arrow.core.Ior) obj);
            }
        }
        getLoanConstraintsUseCase$invoke$1 = new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getLoanConstraintsUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getLoanConstraintsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return getLoanConstraintsUseCase.toUseCaseResult((arrow.core.Ior) obj2);
    }
}
