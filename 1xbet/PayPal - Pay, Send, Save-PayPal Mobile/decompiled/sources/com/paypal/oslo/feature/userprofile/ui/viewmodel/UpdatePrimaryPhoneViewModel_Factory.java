package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class UpdatePrimaryPhoneViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;

    private UpdatePrimaryPhoneViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.UpdatePrimaryPhoneViewModel(userStore);
    }
}
