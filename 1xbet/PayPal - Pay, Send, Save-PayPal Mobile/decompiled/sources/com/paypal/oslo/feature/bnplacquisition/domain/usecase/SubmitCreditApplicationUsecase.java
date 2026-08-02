package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/SubmitCreditApplicationUsecase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SubmitCreditApplicationRequest;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/SubmitCreditApplicationRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/SubmitCreditApplicationRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SubmitCreditApplicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onResponseData", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/SubmitCreditApplicationRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SubmitCreditApplicationUsecase extends com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SubmitCreditApplicationUsecase(com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository submitCreditApplicationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitCreditApplicationRepository, "");
        this.getHighSpeedVideoSizes = submitCreditApplicationRepository;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest submitCreditApplicationRequest, kotlin.coroutines.Continuation continuation) {
        return invoke2(submitCreditApplicationRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest submitCreditApplicationRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase$invoke$1 submitCreditApplicationUsecase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase submitCreditApplicationUsecase;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase$invoke$1) {
            submitCreditApplicationUsecase$invoke$1 = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase$invoke$1) continuation;
            if ((submitCreditApplicationUsecase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                submitCreditApplicationUsecase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = submitCreditApplicationUsecase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = submitCreditApplicationUsecase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository submitCreditApplicationRepository = this.getHighSpeedVideoSizes;
                    submitCreditApplicationUsecase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(submitCreditApplicationRequest);
                    submitCreditApplicationUsecase$invoke$1.getHighSpeedVideoSizes = this;
                    submitCreditApplicationUsecase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = submitCreditApplicationRepository.submitCreditApplication(submitCreditApplicationRequest, submitCreditApplicationUsecase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    submitCreditApplicationUsecase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    submitCreditApplicationUsecase = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase) submitCreditApplicationUsecase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return submitCreditApplicationUsecase.toUseCaseResult((arrow.core.Ior) obj);
            }
        }
        submitCreditApplicationUsecase$invoke$1 = new com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase$invoke$1(this, continuation);
        java.lang.Object obj2 = submitCreditApplicationUsecase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = submitCreditApplicationUsecase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return submitCreditApplicationUsecase.toUseCaseResult((arrow.core.Ior) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase
    protected final <T> com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?> onResponseData(T data) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData missingData;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails submitVirtualCardApplicationDetails = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails ? (com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails) data : null;
        if (submitVirtualCardApplicationDetails != null) {
            if (submitVirtualCardApplicationDetails.getDecline() != null) {
                missingData = new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline("", submitVirtualCardApplicationDetails.getDecline().getReason().name());
            } else {
                missingData = submitVirtualCardApplicationDetails.getSuccess() == null ? new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData("") : super.onResponseData(data);
            }
            if (missingData != null) {
                return missingData;
            }
        }
        return super.onResponseData(data);
    }
}
