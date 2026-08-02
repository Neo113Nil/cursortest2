package com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/usecase/GetLinkedBusinessesUseCase;", "", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/repository/BusinessesHubRepository;", "repository", "Lcom/paypal/oslo/feature/subscriptions/shared/config/SubscriptionsFeatureManager;", "featureManager", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/repository/BusinessesHubRepository;Lcom/paypal/oslo/feature/subscriptions/shared/config/SubscriptionsFeatureManager;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/usecase/BusinessesWithAvailability;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/repository/BusinessesHubRepository;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/subscriptions/shared/config/SubscriptionsFeatureManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetLinkedBusinessesUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetLinkedBusinessesUseCase(com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository businessesHubRepository, com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager subscriptionsFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessesHubRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsFeatureManager, "");
        this.getHighSpeedVideoFpsRanges = businessesHubRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = subscriptionsFeatureManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability>> continuation) {
        com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase$invoke$1 getLinkedBusinessesUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase$invoke$1) {
            getLinkedBusinessesUseCase$invoke$1 = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase$invoke$1) continuation;
            if ((getLinkedBusinessesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getLinkedBusinessesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getLinkedBusinessesUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getLinkedBusinessesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository businessesHubRepository = this.getHighSpeedVideoFpsRanges;
                    getLinkedBusinessesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = businessesHubRepository.getLinkedBusinesses(getLinkedBusinessesUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives businessesWithIncentives = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives) ((arrow.core.Either.Right) either).getValue();
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.BusinessesWithAvailability(businessesWithIncentives.getBusinesses(), businessesWithIncentives.getIncentivesCount() > 0 && this.getHighResolutionOutputSizeshNQ4ISI.isLinkBusinessesEnabled()));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getLinkedBusinessesUseCase$invoke$1 = new com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getLinkedBusinessesUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getLinkedBusinessesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
