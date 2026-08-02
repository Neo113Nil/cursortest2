package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/di/InAppCheckoutViewModelScopedRepositoryModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/AuthorizeBillingAgreementRepositoryImpl;", "apiRepository", "Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockAuthorizeBillingAgreementRepositoryImpl;", "mockRepository", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthorizeBillingAgreementRepository;", "provideAuthorizeBillingAgreementRepository", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;Lcom/paypal/oslo/feature/inappcheckout/data/repository/AuthorizeBillingAgreementRepositoryImpl;Lcom/paypal/oslo/feature/inappcheckout/data/repository/mock/MockAuthorizeBillingAgreementRepositoryImpl;)Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthorizeBillingAgreementRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class InAppCheckoutViewModelScopedRepositoryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutViewModelScopedRepositoryModule INSTANCE = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutViewModelScopedRepositoryModule();

    private InAppCheckoutViewModelScopedRepositoryModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository provideAuthorizeBillingAgreementRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.AuthorizeBillingAgreementRepositoryImpl apiRepository, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthorizeBillingAgreementRepositoryImpl mockRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockRepository, "");
        if (featureGateManager.isMockAPIEnabled()) {
            return mockRepository;
        }
        return apiRepository;
    }
}
