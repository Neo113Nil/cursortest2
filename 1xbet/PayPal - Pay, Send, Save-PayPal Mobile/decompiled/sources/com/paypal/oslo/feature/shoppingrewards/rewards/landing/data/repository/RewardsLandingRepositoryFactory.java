package com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/data/repository/RewardsLandingRepositoryFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/utils/RewardsLandingFeatureGates$Manager;", "rewardsLandingConfigManager", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/repository/RewardsLandingRepository;", "create", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/utils/RewardsLandingFeatureGates$Manager;Ldagger/Lazy;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/repository/RewardsLandingRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsLandingRepositoryFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryFactory INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RewardsLandingRepositoryFactory();

    private RewardsLandingRepositoryFactory() {
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository create(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.utils.RewardsLandingFeatureGates.Manager rewardsLandingConfigManager, dagger.Lazy<com.apollographql.apollo.ApolloClient> apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsLandingConfigManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        if (rewardsLandingConfigManager.isRewardsLandingMockEnabled()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "**** Using Mock Rewards Landing Repository ****", null, null, 6, null);
            return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.mock.MockRewardsLandingRepository();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Using Real Rewards Landing Repository", null, null, 6, null);
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.data.repository.RealRewardsLandingRepository(apolloClient);
    }
}
