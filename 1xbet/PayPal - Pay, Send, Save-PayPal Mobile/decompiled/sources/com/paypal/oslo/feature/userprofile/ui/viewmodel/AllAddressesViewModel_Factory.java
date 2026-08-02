package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class AllAddressesViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase> getHighSpeedVideoSizes;

    private AllAddressesViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel newInstance(com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressesUseCase getAddressesUseCase) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel(getAddressesUseCase);
    }
}
