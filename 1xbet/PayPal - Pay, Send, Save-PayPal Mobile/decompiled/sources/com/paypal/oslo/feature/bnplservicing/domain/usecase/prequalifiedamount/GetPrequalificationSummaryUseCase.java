package com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/prequalifiedamount/GetPrequalificationSummaryUseCase;", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/BaseUseCase;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PrequalificationSummaryRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PrequalificationSummaryRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PrequalificationSummaryRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetPrequalificationSummaryUseCase extends com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase<java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier>> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetPrequalificationSummaryUseCase(com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository prequalificationSummaryRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prequalificationSummaryRepository, "");
        this.getHighSpeedVideoFpsRangesFor = prequalificationSummaryRepository;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list, kotlin.coroutines.Continuation continuation) {
        return invoke2(list, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase$invoke$1 getPrequalificationSummaryUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase getPrequalificationSummaryUseCase;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase$invoke$1) {
            getPrequalificationSummaryUseCase$invoke$1 = (com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase$invoke$1) continuation;
            if ((getPrequalificationSummaryUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getPrequalificationSummaryUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = getPrequalificationSummaryUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getPrequalificationSummaryUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository prequalificationSummaryRepository = this.getHighSpeedVideoFpsRangesFor;
                    getPrequalificationSummaryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    getPrequalificationSummaryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = this;
                    getPrequalificationSummaryUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = prequalificationSummaryRepository.getPrequalificationSummary(list, getPrequalificationSummaryUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getPrequalificationSummaryUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getPrequalificationSummaryUseCase = (com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase) getPrequalificationSummaryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getPrequalificationSummaryUseCase.toUseCaseResult((arrow.core.Ior) obj, true);
            }
        }
        getPrequalificationSummaryUseCase$invoke$1 = new com.paypal.oslo.feature.bnplservicing.domain.usecase.prequalifiedamount.GetPrequalificationSummaryUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getPrequalificationSummaryUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getPrequalificationSummaryUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return getPrequalificationSummaryUseCase.toUseCaseResult((arrow.core.Ior) obj2, true);
    }
}
