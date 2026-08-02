package com.paypal.oslo.app.profileerror;

/* loaded from: classes10.dex */
public final class ProfileErrorViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.app.profileerror.ProfileErrorViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> getHighSpeedVideoFpsRangesFor;

    private ProfileErrorViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.profileerror.ProfileErrorViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.profileerror.ProfileErrorViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider2, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider3) {
        return new com.paypal.oslo.app.profileerror.ProfileErrorViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.app.profileerror.ProfileErrorViewModel newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.app.profileerror.ProfileErrorViewModel(userStore, identitySession, appNavigator);
    }
}
