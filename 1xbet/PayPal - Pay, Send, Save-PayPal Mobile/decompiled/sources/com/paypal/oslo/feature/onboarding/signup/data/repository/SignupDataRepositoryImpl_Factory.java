package com.paypal.oslo.feature.onboarding.signup.data.repository;

/* loaded from: classes13.dex */
public final class SignupDataRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.repository.SignupDataRepositoryImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.repository.SignupDataRepositoryImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupDataRepositoryImpl_Factory create() {
        return com.paypal.oslo.feature.onboarding.signup.data.repository.SignupDataRepositoryImpl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.SignupDataRepositoryImpl newInstance() {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupDataRepositoryImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.onboarding.signup.data.repository.SignupDataRepositoryImpl_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.onboarding.signup.data.repository.SignupDataRepositoryImpl_Factory();

        private InstanceHolder() {
        }
    }
}
