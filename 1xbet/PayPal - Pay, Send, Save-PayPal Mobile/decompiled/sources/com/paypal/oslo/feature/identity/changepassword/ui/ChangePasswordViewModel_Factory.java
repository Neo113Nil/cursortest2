package com.paypal.oslo.feature.identity.changepassword.ui;

/* loaded from: classes12.dex */
public final class ChangePasswordViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase> Camera2StreamConfigurationMap;

    private ChangePasswordViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase> provider) {
        return new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel newInstance(com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase changePasswordUseCase) {
        return new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel(changePasswordUseCase);
    }
}
