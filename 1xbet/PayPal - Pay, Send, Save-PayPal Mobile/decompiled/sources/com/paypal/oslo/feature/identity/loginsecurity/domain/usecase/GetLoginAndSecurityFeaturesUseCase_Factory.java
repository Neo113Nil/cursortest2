package com.paypal.oslo.feature.identity.loginsecurity.domain.usecase;

/* loaded from: classes12.dex */
public final class GetLoginAndSecurityFeaturesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.loginsecurity.domain.repository.LoginAndSecurityRepository> getHighSpeedVideoFpsRangesFor;

    private GetLoginAndSecurityFeaturesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.loginsecurity.domain.repository.LoginAndSecurityRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.loginsecurity.domain.repository.LoginAndSecurityRepository> provider) {
        return new com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase newInstance(com.paypal.oslo.feature.identity.loginsecurity.domain.repository.LoginAndSecurityRepository loginAndSecurityRepository) {
        return new com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase(loginAndSecurityRepository);
    }
}
