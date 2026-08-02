package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetExperienceSessionUsecase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ExperienceSessionRequest;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/ExperienceSessionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/ExperienceSessionRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ExperienceSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onResponseData", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/ExperienceSessionRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetExperienceSessionUsecase extends com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetExperienceSessionUsecase(com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository experienceSessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceSessionRepository, "");
        this.Camera2StreamConfigurationMap = experienceSessionRepository;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest experienceSessionRequest, kotlin.coroutines.Continuation continuation) {
        return invoke2(experienceSessionRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest experienceSessionRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase$invoke$1 getExperienceSessionUsecase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase getExperienceSessionUsecase;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase$invoke$1) {
            getExperienceSessionUsecase$invoke$1 = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase$invoke$1) continuation;
            if ((getExperienceSessionUsecase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                getExperienceSessionUsecase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = getExperienceSessionUsecase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getExperienceSessionUsecase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository experienceSessionRepository = this.Camera2StreamConfigurationMap;
                    getExperienceSessionUsecase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(experienceSessionRequest);
                    getExperienceSessionUsecase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = this;
                    getExperienceSessionUsecase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = experienceSessionRepository.createExperienceSessionId(experienceSessionRequest, getExperienceSessionUsecase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getExperienceSessionUsecase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getExperienceSessionUsecase = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase) getExperienceSessionUsecase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getExperienceSessionUsecase.toUseCaseResult((arrow.core.Ior) obj);
            }
        }
        getExperienceSessionUsecase$invoke$1 = new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetExperienceSessionUsecase$invoke$1(this, continuation);
        java.lang.Object obj2 = getExperienceSessionUsecase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getExperienceSessionUsecase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return getExperienceSessionUsecase.toUseCaseResult((arrow.core.Ior) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase
    protected final <T> com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?> onResponseData(T data) {
        java.lang.String experienceSessionId;
        if ((data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.common.ExperienceSession) && ((experienceSessionId = ((com.paypal.oslo.feature.bnplacquisition.domain.model.common.ExperienceSession) data).getExperienceSessionId()) == null || experienceSessionId.length() == 0)) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.StorageError("");
        }
        return super.onResponseData(data);
    }
}
