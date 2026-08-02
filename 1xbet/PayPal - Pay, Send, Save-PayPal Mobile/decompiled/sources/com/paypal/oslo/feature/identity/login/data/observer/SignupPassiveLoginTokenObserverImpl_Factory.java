package com.paypal.oslo.feature.identity.login.data.observer;

/* loaded from: classes12.dex */
public final class SignupPassiveLoginTokenObserverImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider> getHighSpeedVideoSizes;

    private SignupPassiveLoginTokenObserverImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.storage.IdentityTokenStorage> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider> provider3) {
        return new com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl newInstance(com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter signupPassiveLoginTokenEmitter, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.login.ElapsedRealtimeProvider elapsedRealtimeProvider) {
        return new com.paypal.oslo.feature.identity.login.data.observer.SignupPassiveLoginTokenObserverImpl(signupPassiveLoginTokenEmitter, identityTokenStorage, elapsedRealtimeProvider);
    }
}
