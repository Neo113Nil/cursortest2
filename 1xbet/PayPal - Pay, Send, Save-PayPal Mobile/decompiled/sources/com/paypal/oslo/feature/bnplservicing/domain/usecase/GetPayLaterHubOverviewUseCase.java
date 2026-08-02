package com.paypal.oslo.feature.bnplservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/GetPayLaterHubOverviewUseCase;", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/input/PayLaterHubInput;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/input/PayLaterHubInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetPayLaterHubOverviewUseCase extends com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase<com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetPayLaterHubOverviewUseCase(com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository payLaterHubRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubRepository, "");
        this.getHighSpeedVideoSizes = payLaterHubRepository;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput payLaterHubInput, kotlin.coroutines.Continuation continuation) {
        return invoke2(payLaterHubInput, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput payLaterHubInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase$invoke$1 getPayLaterHubOverviewUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase getPayLaterHubOverviewUseCase;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase$invoke$1) {
            getPayLaterHubOverviewUseCase$invoke$1 = (com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase$invoke$1) continuation;
            if ((getPayLaterHubOverviewUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                getPayLaterHubOverviewUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = getPayLaterHubOverviewUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPayLaterHubOverviewUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository payLaterHubRepository = this.getHighSpeedVideoSizes;
                    getPayLaterHubOverviewUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payLaterHubInput);
                    getPayLaterHubOverviewUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = this;
                    getPayLaterHubOverviewUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = payLaterHubRepository.getOverview(payLaterHubInput, getPayLaterHubOverviewUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getPayLaterHubOverviewUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getPayLaterHubOverviewUseCase = (com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase) getPayLaterHubOverviewUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getPayLaterHubOverviewUseCase.toUseCaseResult((arrow.core.Ior) obj, true);
            }
        }
        getPayLaterHubOverviewUseCase$invoke$1 = new com.paypal.oslo.feature.bnplservicing.domain.usecase.GetPayLaterHubOverviewUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getPayLaterHubOverviewUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPayLaterHubOverviewUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return getPayLaterHubOverviewUseCase.toUseCaseResult((arrow.core.Ior) obj2, true);
    }
}
