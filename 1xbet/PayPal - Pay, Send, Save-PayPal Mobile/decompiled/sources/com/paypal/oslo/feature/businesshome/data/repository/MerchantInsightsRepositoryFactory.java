package com.paypal.oslo.feature.businesshome.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/data/repository/MerchantInsightsRepositoryFactory;", "", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/businesshome/data/repository/MerchantInsightsRepositoryImpl;", "realImpl", "Lcom/paypal/oslo/feature/businesshome/data/repository/mock/DemoMerchantInsightsRepository;", "demoImpl", "Lcom/paypal/oslo/feature/businesshome/domain/repository/MerchantInsightsRepository;", "create", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/businesshome/data/repository/MerchantInsightsRepositoryImpl;Lcom/paypal/oslo/feature/businesshome/data/repository/mock/DemoMerchantInsightsRepository;)Lcom/paypal/oslo/feature/businesshome/domain/repository/MerchantInsightsRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MerchantInsightsRepositoryFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryFactory INSTANCE = new com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryFactory();

    private MerchantInsightsRepositoryFactory() {
    }

    public final com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository create(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl realImpl, com.paypal.oslo.feature.businesshome.data.repository.mock.DemoMerchantInsightsRepository demoImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demoImpl, "");
        if (featureGate.checkGate(com.paypal.oslo.feature.businesshome.featureflags.BusinessHomeConfig.INSTANCE.getMockApiEnabled$business_home_prodRelease())) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesshome.LoggerKt.log, "**** Using Mock Merchant Insights Repository ****", null, null, 6, null);
            return demoImpl;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.businesshome.LoggerKt.log, "Using Real Merchant Insights Repository", null, null, 6, null);
        return realImpl;
    }
}
