package com.paypal.oslo.core.telemetry.analytics.context.global;

/* loaded from: classes10.dex */
public final class VeniceContextProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> getHighResolutionOutputSizeshNQ4ISI;

    private VeniceContextProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.AppIdentity> provider) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider newInstance(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.VeniceContextProvider(appIdentity);
    }
}
