package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class AllPhonesViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.GetPhonesUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private AllPhonesViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.GetPhonesUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.GetPhonesUseCase> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel newInstance(com.paypal.oslo.feature.userprofile.domain.usecase.GetPhonesUseCase getPhonesUseCase) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel(getPhonesUseCase);
    }
}
