package com.paypal.oslo.feature.identity.biometriclogin.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/di/BiometricLoginModule;", "", "Lcom/paypal/oslo/feature/identity/biometriclogin/data/repository/BiometricEligibilityRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;", "bindBiometricEligibilityRepository", "(Lcom/paypal/oslo/feature/identity/biometriclogin/data/repository/BiometricEligibilityRepositoryImpl;)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;", "Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapperImpl;", "Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapper;", "bindBiometricKeyWrapper", "(Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapperImpl;)Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapper;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactoryImpl;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactory;", "bindBiometricPromptFactory", "(Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactoryImpl;)Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactory;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAuthenticatorImpl;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/BiometricAuthenticator;", "bindBiometricAuthenticator", "(Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAuthenticatorImpl;)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/BiometricAuthenticator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface BiometricLoginModule {
    @dagger.Binds
    com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator bindBiometricAuthenticator(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAuthenticatorImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository bindBiometricEligibilityRepository(com.paypal.oslo.feature.identity.biometriclogin.data.repository.BiometricEligibilityRepositoryImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper bindBiometricKeyWrapper(com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapperImpl impl);

    @dagger.Binds
    com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactory bindBiometricPromptFactory(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactoryImpl impl);
}
