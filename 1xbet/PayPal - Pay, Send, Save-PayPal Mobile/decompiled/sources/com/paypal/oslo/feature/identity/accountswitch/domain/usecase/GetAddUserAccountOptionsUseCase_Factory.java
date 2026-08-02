package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

/* loaded from: classes12.dex */
public final class GetAddUserAccountOptionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private GetAddUserAccountOptionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GetAddUserAccountOptionsUseCase(featureGate);
    }
}
