package com.paypal.oslo.feature.onboarding.signup.phone.data.repository;

/* loaded from: classes13.dex */
public final class SmsRetrieverRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private SmsRetrieverRepositoryImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl(context);
    }
}
