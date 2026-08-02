package com.paypal.oslo.feature.shoppingrewards.shopping.common.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/di/ShoppingDataModule;", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/repository/ShoppingIABRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;", "bindShoppingIABRepository", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/repository/ShoppingIABRepositoryImpl;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/ShoppingIABRepository;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/featureflags/ShoppingConfigManagerImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/featureflags/ShoppingConfig$Manager;", "bindShoppingConfigManager", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/featureflags/ShoppingConfigManagerImpl;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/featureflags/ShoppingConfig$Manager;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/repository/MerchantVisitHistoryRepositoryImpl;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;", "bindMerchantVisitHistoryRepository", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/data/repository/MerchantVisitHistoryRepositoryImpl;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public interface ShoppingDataModule {
    @dagger.Binds
    com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository bindMerchantVisitHistoryRepository(com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.MerchantVisitHistoryRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfig.Manager bindShoppingConfigManager(com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfigManagerImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository bindShoppingIABRepository(com.paypal.oslo.feature.shoppingrewards.shopping.common.data.repository.ShoppingIABRepositoryImpl impl);
}
