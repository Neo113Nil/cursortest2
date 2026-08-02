package com.paypal.oslo.feature.merchantbanking.domain.usecase;

/* loaded from: classes13.dex */
public final class GetMerchantArnFeatureFlagUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.remoteconfig.MerchantBankingFeatureGate> getHighSpeedVideoSizes;

    private GetMerchantArnFeatureFlagUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.remoteconfig.MerchantBankingFeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.merchantbanking.domain.remoteconfig.MerchantBankingFeatureGate> provider) {
        return new com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase newInstance(com.paypal.oslo.feature.merchantbanking.domain.remoteconfig.MerchantBankingFeatureGate merchantBankingFeatureGate) {
        return new com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase(merchantBankingFeatureGate);
    }
}
