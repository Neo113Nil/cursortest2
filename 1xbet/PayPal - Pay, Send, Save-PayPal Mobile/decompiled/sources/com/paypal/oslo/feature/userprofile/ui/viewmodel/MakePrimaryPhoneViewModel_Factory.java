package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class MakePrimaryPhoneViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryPhoneUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private MakePrimaryPhoneViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryPhoneUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryPhoneUseCase> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel newInstance(com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryPhoneUseCase makePrimaryPhoneUseCase) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel(makePrimaryPhoneUseCase);
    }
}
