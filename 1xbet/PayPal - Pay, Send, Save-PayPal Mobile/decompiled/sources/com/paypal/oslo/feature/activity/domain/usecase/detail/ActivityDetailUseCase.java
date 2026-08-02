package com.paypal.oslo.feature.activity.domain.usecase.detail;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/detail/ActivityDetailUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/repository/detail/IActivityTransactionDetailRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/repository/detail/IActivityTransactionDetailRepository;)V", "Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;", "transaction", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "invoke", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/activity/domain/repository/detail/IActivityTransactionDetailRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ActivityDetailUseCase(com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository iActivityTransactionDetailRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityTransactionDetailRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = iActivityTransactionDetailRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase$invoke$1 activityDetailUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase$invoke$1) {
            activityDetailUseCase$invoke$1 = (com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase$invoke$1) continuation;
            if ((activityDetailUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                activityDetailUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = activityDetailUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityDetailUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.activity.domain.repository.detail.IActivityTransactionDetailRepository iActivityTransactionDetailRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    activityDetailUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityTransactionDto);
                    activityDetailUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = iActivityTransactionDetailRepository.fetchActivityDetailResult(activityTransactionDto, activityDetailUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult activityTransactionDetailResult = (com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult) ((arrow.core.Either.Right) either).getValue();
                    activityTransactionDetailResult.transformActivityDetailData$activity_prodRelease();
                    return new arrow.core.Ior.Right(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(activityTransactionDetailResult));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toDomainErrorUIModel((com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Either.Left) either).getValue()), 1, null));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        activityDetailUseCase$invoke$1 = new com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = activityDetailUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityDetailUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
