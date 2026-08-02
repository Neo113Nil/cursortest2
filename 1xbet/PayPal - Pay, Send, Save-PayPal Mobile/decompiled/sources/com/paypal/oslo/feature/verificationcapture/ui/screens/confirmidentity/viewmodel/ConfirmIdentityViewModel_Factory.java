package com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel;

/* loaded from: classes15.dex */
public final class ConfirmIdentityViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer> getHighSpeedVideoSizes;

    private ConfirmIdentityViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer> provider) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel newInstance(com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.reducer.ConfirmIdentityReducer confirmIdentityReducer) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.confirmidentity.viewmodel.ConfirmIdentityViewModel(confirmIdentityReducer);
    }
}
