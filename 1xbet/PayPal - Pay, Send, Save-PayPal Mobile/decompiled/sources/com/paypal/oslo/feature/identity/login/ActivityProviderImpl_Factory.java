package com.paypal.oslo.feature.identity.login;

/* loaded from: classes12.dex */
public final class ActivityProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.login.ActivityProviderImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private ActivityProviderImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.login.ActivityProviderImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.login.ActivityProviderImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.identity.login.ActivityProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.login.ActivityProviderImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.identity.login.ActivityProviderImpl(context);
    }
}
