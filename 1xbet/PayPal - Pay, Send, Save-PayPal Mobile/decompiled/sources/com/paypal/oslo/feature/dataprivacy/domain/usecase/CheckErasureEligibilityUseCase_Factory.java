package com.paypal.oslo.feature.dataprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class CheckErasureEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;

    private CheckErasureEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.CheckErasureEligibilityUseCase(userStore, featureGate);
    }
}
