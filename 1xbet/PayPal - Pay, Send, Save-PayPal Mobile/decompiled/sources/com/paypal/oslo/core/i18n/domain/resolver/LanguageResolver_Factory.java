package com.paypal.oslo.core.i18n.domain.resolver;

/* loaded from: classes10.dex */
public final class LanguageResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LanguageOverrideStrategy> getHighSpeedVideoSizes;

    private LanguageResolver_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LanguageOverrideStrategy> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LanguageOverrideStrategy> provider) {
        return new com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver newInstance(com.paypal.oslo.core.i18n.domain.interfaces.LanguageOverrideStrategy languageOverrideStrategy) {
        return new com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver(languageOverrideStrategy);
    }
}
