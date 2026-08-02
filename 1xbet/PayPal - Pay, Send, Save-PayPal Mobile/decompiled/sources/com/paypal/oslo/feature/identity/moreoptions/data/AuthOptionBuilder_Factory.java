package com.paypal.oslo.feature.identity.moreoptions.data;

/* loaded from: classes12.dex */
public final class AuthOptionBuilder_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> getHighSpeedVideoFpsRangesFor;

    private AuthOptionBuilder_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider) {
        return new com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder newInstance(com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        return new com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder(stringProvider);
    }
}
