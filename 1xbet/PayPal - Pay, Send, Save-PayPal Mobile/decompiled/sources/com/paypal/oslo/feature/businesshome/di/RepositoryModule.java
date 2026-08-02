package com.paypal.oslo.feature.businesshome.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/di/RepositoryModule;", "", "Lcom/paypal/oslo/feature/businesshome/data/repository/EngagementCardDismissalRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;", "bindEngagementCardDismissalRepository", "(Lcom/paypal/oslo/feature/businesshome/data/repository/EngagementCardDismissalRepositoryImpl;)Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface RepositoryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesshome.di.RepositoryModule.Companion INSTANCE = com.paypal.oslo.feature.businesshome.di.RepositoryModule.Companion.Camera2StreamConfigurationMap;

    @dagger.Binds
    com.paypal.oslo.feature.businesshome.domain.repository.EngagementCardDismissalRepository bindEngagementCardDismissalRepository(com.paypal.oslo.feature.businesshome.data.repository.EngagementCardDismissalRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/di/RepositoryModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/businesshome/data/repository/AccountSetupRepositoryImpl;", "realImpl", "Lcom/paypal/oslo/feature/businesshome/data/repository/mock/DemoAccountSetupRepository;", "demoImpl", "Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;", "provideAccountSetupRepository", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/businesshome/data/repository/AccountSetupRepositoryImpl;Lcom/paypal/oslo/feature/businesshome/data/repository/mock/DemoAccountSetupRepository;)Lcom/paypal/oslo/feature/businesshome/domain/repository/AccountSetupRepository;", "Lcom/paypal/oslo/feature/businesshome/data/repository/MerchantInsightsRepositoryImpl;", "Lcom/paypal/oslo/feature/businesshome/data/repository/mock/DemoMerchantInsightsRepository;", "Lcom/paypal/oslo/feature/businesshome/domain/repository/MerchantInsightsRepository;", "provideMerchantInsightsRepository", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/businesshome/data/repository/MerchantInsightsRepositoryImpl;Lcom/paypal/oslo/feature/businesshome/data/repository/mock/DemoMerchantInsightsRepository;)Lcom/paypal/oslo/feature/businesshome/domain/repository/MerchantInsightsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.businesshome.di.RepositoryModule.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.businesshome.di.RepositoryModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository provideAccountSetupRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl realImpl, com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository demoImpl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realImpl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demoImpl, "");
            return com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryFactory.INSTANCE.create(featureGate, realImpl, demoImpl);
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository provideMerchantInsightsRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl realImpl, com.paypal.oslo.feature.businesshome.data.repository.mock.DemoMerchantInsightsRepository demoImpl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realImpl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demoImpl, "");
            return com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryFactory.INSTANCE.create(featureGate, realImpl, demoImpl);
        }
    }
}
