package com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/repository/ShoppingIABRepositoryFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/featureflags/ShoppingConfig$Manager;", "shoppingConfigManager", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;", "create", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/featureflags/ShoppingConfig$Manager;Ldagger/Lazy;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ShoppingIABRepositoryFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryFactory INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryFactory();

    private ShoppingIABRepositoryFactory() {
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository create(com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfig.Manager shoppingConfigManager, dagger.Lazy<com.apollographql.apollo.ApolloClient> apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shoppingConfigManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        boolean isShoppingIabMockEnabled = shoppingConfigManager.isShoppingIabMockEnabled();
        if (isShoppingIabMockEnabled) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Using Shopping IAB Repository", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("repositoryType", "mock"), kotlin.TuplesKt.to("isShoppingIabMockEnabled", java.lang.Boolean.valueOf(isShoppingIabMockEnabled))), null, 4, null);
            return new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MockShoppingIABRepository();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "Using Shopping IAB Repository", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("repositoryType", "real"), kotlin.TuplesKt.to("isShoppingIabMockEnabled", java.lang.Boolean.valueOf(isShoppingIabMockEnabled))), null, 4, null);
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.RealShoppingIABRepository(apolloClient);
    }
}
