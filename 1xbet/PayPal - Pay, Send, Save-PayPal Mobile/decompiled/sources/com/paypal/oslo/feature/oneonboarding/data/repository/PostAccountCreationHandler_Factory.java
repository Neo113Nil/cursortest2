package com.paypal.oslo.feature.oneonboarding.data.repository;

/* loaded from: classes13.dex */
public final class PostAccountCreationHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter> getHighSpeedVideoSizes;

    private PostAccountCreationHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityManagement> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3) {
        return new com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler newInstance(com.paypal.oslo.feature.onboarding.api.signup.domain.emitter.SignupPassiveLoginTokenEmitter signupPassiveLoginTokenEmitter, com.paypal.oslo.feature.identity.api.IdentityManagement identityManagement, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler(signupPassiveLoginTokenEmitter, identityManagement, coroutineScope);
    }
}
