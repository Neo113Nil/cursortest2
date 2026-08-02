package com.paypal.oslo.feature.identity.changepassword.domain.usecase;

/* loaded from: classes12.dex */
public final class ChangePasswordUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.changepassword.domain.repository.ChangePasswordRepository> Camera2StreamConfigurationMap;

    private ChangePasswordUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.changepassword.domain.repository.ChangePasswordRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.changepassword.domain.repository.ChangePasswordRepository> provider) {
        return new com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase newInstance(com.paypal.oslo.feature.identity.changepassword.domain.repository.ChangePasswordRepository changePasswordRepository) {
        return new com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase(changePasswordRepository);
    }
}
