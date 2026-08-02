package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class DeletePhoneViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase> getHighSpeedVideoSizes;

    private DeletePhoneViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel newInstance(com.paypal.oslo.feature.userprofile.domain.usecase.DeletePhoneUseCase deletePhoneUseCase) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.DeletePhoneViewModel(deletePhoneUseCase);
    }
}
