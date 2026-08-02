package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetRepaymentDetailsUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/RepaymentRequest;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/UpdateApplicationRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/UpdateApplicationRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/RepaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onResponseData", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/UpdateApplicationRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetRepaymentDetailsUseCase extends com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetRepaymentDetailsUseCase(com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository updateApplicationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateApplicationRepository, "");
        this.getHighSpeedVideoFpsRangesFor = updateApplicationRepository;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest repaymentRequest, kotlin.coroutines.Continuation continuation) {
        return invoke2(repaymentRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.RepaymentRequest repaymentRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase$invoke$1 getRepaymentDetailsUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase getRepaymentDetailsUseCase;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase$invoke$1) {
            getRepaymentDetailsUseCase$invoke$1 = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase$invoke$1) continuation;
            if ((getRepaymentDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getRepaymentDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getRepaymentDetailsUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getRepaymentDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository updateApplicationRepository = this.getHighSpeedVideoFpsRangesFor;
                    getRepaymentDetailsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(repaymentRequest);
                    getRepaymentDetailsUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    getRepaymentDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = updateApplicationRepository.updateApplicationAndFetchRepayments(repaymentRequest, getRepaymentDetailsUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getRepaymentDetailsUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getRepaymentDetailsUseCase = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase) getRepaymentDetailsUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getRepaymentDetailsUseCase.toUseCaseResult((arrow.core.Ior) obj);
            }
        }
        getRepaymentDetailsUseCase$invoke$1 = new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getRepaymentDetailsUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getRepaymentDetailsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return getRepaymentDetailsUseCase.toUseCaseResult((arrow.core.Ior) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase
    protected final <T> com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?> onResponseData(T data) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData missingData;
        com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments repayments = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments ? (com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments) data : null;
        if (repayments != null) {
            if (repayments.getDecline() != null) {
                missingData = new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline("", repayments.getDecline().getReason().name());
            } else {
                missingData = repayments.getSuccess() == null ? new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData("") : super.onResponseData(data);
            }
            if (missingData != null) {
                return missingData;
            }
        }
        return super.onResponseData(data);
    }
}
