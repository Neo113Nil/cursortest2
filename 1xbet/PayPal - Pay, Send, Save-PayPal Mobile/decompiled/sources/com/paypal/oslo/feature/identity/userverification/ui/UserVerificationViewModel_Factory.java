package com.paypal.oslo.feature.identity.userverification.ui;

/* loaded from: classes13.dex */
public final class UserVerificationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.swg.GoogleTokenChecker> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> getOutputMinFrameDurationlomOqCM;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getOutputSizes;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase> getOutputStallDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.observer.SignupPassiveLoginTokenObserver> getOutputStallDurationlomOqCM;

    private UserVerificationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.swg.GoogleTokenChecker> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.observer.SignupPassiveLoginTokenObserver> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil> provider8, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase> provider11, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase> provider12, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider13, dagger.internal.Provider<androidx.view.SavedStateHandle> provider14, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider15) {
        this.getOutputMinFrameDurationlomOqCM = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getInputFormats = provider3;
        this.getOutputStallDurationlomOqCM = provider4;
        this.getOutputSizes = provider5;
        this.getOutputFormats = provider6;
        this.getHighSpeedVideoSizesFor = provider7;
        this.getHighSpeedVideoSizes = provider8;
        this.getInputSizeshNQ4ISI = provider9;
        this.getHighSpeedVideoFpsRanges = provider10;
        this.getOutputStallDuration = provider11;
        this.getOutputMinFrameDuration = provider12;
        this.getHighSpeedVideoFpsRangesFor = provider13;
        this.getOutputSizeshNQ4ISI = provider14;
        this.getHighResolutionOutputSizeshNQ4ISI = provider15;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel get() {
        return newInstance(this.getOutputMinFrameDurationlomOqCM.get(), this.Camera2StreamConfigurationMap.get(), this.getInputFormats.get(), this.getOutputStallDurationlomOqCM.get(), this.getOutputSizes.get(), this.getOutputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), this.getInputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputStallDuration.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.swg.GoogleTokenChecker> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.domain.observer.SignupPassiveLoginTokenObserver> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil> provider8, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider10, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase> provider11, dagger.internal.Provider<com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase> provider12, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider13, dagger.internal.Provider<androidx.view.SavedStateHandle> provider14, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider15) {
        return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    public static com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel newInstance(com.paypal.oslo.feature.identity.userverification.domain.usecase.VerifyCredentialUseCase verifyCredentialUseCase, com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase fetchGoogleSignUpDetailsUseCase, com.paypal.oslo.feature.onboarding.api.swg.GoogleTokenChecker googleTokenChecker, com.paypal.oslo.feature.identity.login.domain.observer.SignupPassiveLoginTokenObserver signupPassiveLoginTokenObserver, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase, com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase savePasskeyCredentialsUseCase, com.paypal.oslo.feature.identity.userverification.ui.util.FormatCredentialUtil formatCredentialUtil, com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveVerifiedCredentialUseCase saveVerifiedCredentialUseCase, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.SaveLoginTypeUseCase saveLoginTypeUseCase, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, androidx.view.SavedStateHandle savedStateHandle, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel(verifyCredentialUseCase, fetchGoogleSignUpDetailsUseCase, googleTokenChecker, signupPassiveLoginTokenObserver, identityTokenStorage, passkeyLoginUseCase, savePasskeyCredentialsUseCase, formatCredentialUtil, phoneNumberParseUseCase, getCountriesListUseCase, saveVerifiedCredentialUseCase, saveLoginTypeUseCase, featureGate, savedStateHandle, coroutineDispatcher);
    }
}
