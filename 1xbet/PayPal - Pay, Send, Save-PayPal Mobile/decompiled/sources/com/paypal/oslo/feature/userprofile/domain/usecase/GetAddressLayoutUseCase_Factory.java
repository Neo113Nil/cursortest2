package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class GetAddressLayoutUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler> getHighSpeedVideoFpsRanges;

    private GetAddressLayoutUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase newInstance(com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler addressHandler) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase(addressHandler);
    }
}
