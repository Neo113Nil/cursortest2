package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetPaymentFundingInstrumentsUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/BaseUseCase;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/PaymentFundingInstrumentsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/PaymentFundingInstrumentsRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/PaymentFundingInstrumentsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetPaymentFundingInstrumentsUseCase extends com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase<java.lang.String> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetPaymentFundingInstrumentsUseCase(com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository paymentFundingInstrumentsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentFundingInstrumentsRepository, "");
        this.getHighSpeedVideoSizes = paymentFundingInstrumentsRepository;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        return invoke2(str, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase$invoke$1 getPaymentFundingInstrumentsUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase getPaymentFundingInstrumentsUseCase;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase$invoke$1) {
            getPaymentFundingInstrumentsUseCase$invoke$1 = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase$invoke$1) continuation;
            if ((getPaymentFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getPaymentFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getPaymentFundingInstrumentsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPaymentFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository paymentFundingInstrumentsRepository = this.getHighSpeedVideoSizes;
                    getPaymentFundingInstrumentsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getPaymentFundingInstrumentsUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    getPaymentFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = paymentFundingInstrumentsRepository.getPaymentFundingInstruments(str, getPaymentFundingInstrumentsUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getPaymentFundingInstrumentsUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getPaymentFundingInstrumentsUseCase = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase) getPaymentFundingInstrumentsUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getPaymentFundingInstrumentsUseCase.toUseCaseResult((arrow.core.Ior) obj);
            }
        }
        getPaymentFundingInstrumentsUseCase$invoke$1 = new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getPaymentFundingInstrumentsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPaymentFundingInstrumentsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return getPaymentFundingInstrumentsUseCase.toUseCaseResult((arrow.core.Ior) obj2);
    }
}
