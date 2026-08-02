package com.paypal.oslo.core.i18n.data.cache;

/* loaded from: classes10.dex */
public final class LocaleResolverCacheImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.cache.LocaleResolverCacheImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.cache.LocaleResolverCacheImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.data.cache.LocaleResolverCacheImpl_Factory create() {
        return com.paypal.oslo.core.i18n.data.cache.LocaleResolverCacheImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.i18n.data.cache.LocaleResolverCacheImpl newInstance() {
        return new com.paypal.oslo.core.i18n.data.cache.LocaleResolverCacheImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.data.cache.LocaleResolverCacheImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.i18n.data.cache.LocaleResolverCacheImpl_Factory();

        private InstanceHolder() {
        }
    }
}
