package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetProvisionedCardOverviewUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ProvisionedCardOverviewRequest;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/ProvisionedCardOverviewRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/ProvisionedCardOverviewRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ProvisionedCardOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/ProvisionedCardOverviewRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetProvisionedCardOverviewUseCase extends com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetProvisionedCardOverviewUseCase(com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository provisionedCardOverviewRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionedCardOverviewRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = provisionedCardOverviewRepository;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest provisionedCardOverviewRequest, kotlin.coroutines.Continuation continuation) {
        return invoke2(provisionedCardOverviewRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest provisionedCardOverviewRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase$invoke$1 getProvisionedCardOverviewUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase getProvisionedCardOverviewUseCase;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase$invoke$1) {
            getProvisionedCardOverviewUseCase$invoke$1 = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase$invoke$1) continuation;
            if ((getProvisionedCardOverviewUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getProvisionedCardOverviewUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getProvisionedCardOverviewUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getProvisionedCardOverviewUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository provisionedCardOverviewRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    getProvisionedCardOverviewUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(provisionedCardOverviewRequest);
                    getProvisionedCardOverviewUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    getProvisionedCardOverviewUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = provisionedCardOverviewRepository.fetchProvisionedCardOverview(provisionedCardOverviewRequest, getProvisionedCardOverviewUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getProvisionedCardOverviewUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getProvisionedCardOverviewUseCase = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase) getProvisionedCardOverviewUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getProvisionedCardOverviewUseCase.toUseCaseResult((arrow.core.Ior) obj);
            }
        }
        getProvisionedCardOverviewUseCase$invoke$1 = new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getProvisionedCardOverviewUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getProvisionedCardOverviewUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return getProvisionedCardOverviewUseCase.toUseCaseResult((arrow.core.Ior) obj2);
    }
}
