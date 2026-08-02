package com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase;

/* loaded from: classes12.dex */
public final class ValidateConnectUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.partnerlinking.domain.repository.ValidateConnectRepository> getHighSpeedVideoFpsRangesFor;

    private ValidateConnectUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.partnerlinking.domain.repository.ValidateConnectRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.partnerlinking.domain.repository.ValidateConnectRepository> provider) {
        return new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase newInstance(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.repository.ValidateConnectRepository validateConnectRepository) {
        return new com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase(validateConnectRepository);
    }
}
