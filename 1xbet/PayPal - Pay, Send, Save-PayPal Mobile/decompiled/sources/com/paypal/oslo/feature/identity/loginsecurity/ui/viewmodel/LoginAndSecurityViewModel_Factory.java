package com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel;

/* loaded from: classes12.dex */
public final class LoginAndSecurityViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase> getHighSpeedVideoFpsRanges;

    private LoginAndSecurityViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase> provider) {
        return new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel newInstance(com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase getLoginAndSecurityFeaturesUseCase) {
        return new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel(getLoginAndSecurityFeaturesUseCase);
    }
}
