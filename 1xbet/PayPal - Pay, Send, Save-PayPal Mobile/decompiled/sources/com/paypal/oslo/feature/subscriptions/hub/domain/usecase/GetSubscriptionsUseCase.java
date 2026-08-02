package com.paypal.oslo.feature.subscriptions.hub.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/domain/usecase/GetSubscriptionsUseCase;", "", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/repository/SubscriptionsHubRepository;", "repository", "Lcom/paypal/oslo/feature/subscriptions/shared/config/SubscriptionsFeatureManager;", "featureManager", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/hub/domain/repository/SubscriptionsHubRepository;Lcom/paypal/oslo/feature/subscriptions/shared/config/SubscriptionsFeatureManager;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/usecase/SubscriptionsWithAvailability;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/repository/SubscriptionsHubRepository;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/subscriptions/shared/config/SubscriptionsFeatureManager;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetSubscriptionsUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsHubRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetSubscriptionsUseCase(com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsHubRepository subscriptionsHubRepository, com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager subscriptionsFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsHubRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsFeatureManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = subscriptionsHubRepository;
        this.getHighSpeedVideoSizes = subscriptionsFeatureManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability>> continuation) {
        com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase$invoke$1 getSubscriptionsUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase$invoke$1) {
            getSubscriptionsUseCase$invoke$1 = (com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase$invoke$1) continuation;
            if ((getSubscriptionsUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getSubscriptionsUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getSubscriptionsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getSubscriptionsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsHubRepository subscriptionsHubRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    getSubscriptionsUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = subscriptionsHubRepository.getSubscriptions(getSubscriptionsUseCase$invoke$1);
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
                    com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives subscriptionsWithIncentives = (com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives) ((arrow.core.Either.Right) either).getValue();
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.subscriptions.hub.domain.usecase.SubscriptionsWithAvailability(subscriptionsWithIncentives.getSubscriptions(), subscriptionsWithIncentives.getIncentivesCount() > 0 && this.getHighSpeedVideoSizes.isLinkSubscriptionsEnabled()));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getSubscriptionsUseCase$invoke$1 = new com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getSubscriptionsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getSubscriptionsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
