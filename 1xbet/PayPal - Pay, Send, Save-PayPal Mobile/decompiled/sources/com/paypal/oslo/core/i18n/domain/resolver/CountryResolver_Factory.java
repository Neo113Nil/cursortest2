package com.paypal.oslo.core.i18n.domain.resolver;

/* loaded from: classes10.dex */
public final class CountryResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.resolver.CountryResolver> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.resolver.CountryResolver get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.resolver.CountryResolver_Factory create() {
        return com.paypal.oslo.core.i18n.domain.resolver.CountryResolver_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.i18n.domain.resolver.CountryResolver newInstance() {
        return new com.paypal.oslo.core.i18n.domain.resolver.CountryResolver();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.resolver.CountryResolver_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.i18n.domain.resolver.CountryResolver_Factory();

        private InstanceHolder() {
        }
    }
}
