package com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0010\u001a\u00020\u00028CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/data/repository/RewardsLandingRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/repository/RewardsLandingRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/utils/RewardsLandingFeatureGates$Manager;", "rewardsLandingConfigManager", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/utils/RewardsLandingFeatureGates$Manager;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/RewardsLandingData;", "getRewardsLandingData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/utils/RewardsLandingFeatureGates$Manager;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsLandingRepositoryImpl extends com.paypal.oslo.feature.shoppingrewards.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Manager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public RewardsLandingRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Manager manager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        this.getHighSpeedVideoSizes = lazy;
        this.getHighSpeedVideoFpsRanges = manager;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository create;
                create = com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryFactory.INSTANCE.create(r0.getHighSpeedVideoFpsRanges, com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryImpl.this.getHighSpeedVideoSizes);
                return create;
            }
        });
    }

    @Override // com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository
    public final java.lang.Object getRewardsLandingData(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.RewardsLandingData>>> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).getRewardsLandingData(continuation);
    }
}
