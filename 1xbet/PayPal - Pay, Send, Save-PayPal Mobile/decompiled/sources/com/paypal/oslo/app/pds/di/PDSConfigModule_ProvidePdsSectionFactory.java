package com.paypal.oslo.app.pds.di;

/* loaded from: classes4.dex */
public final class PDSConfigModule_ProvidePdsSectionFactory implements dagger.internal.Factory<com.paypal.oslo.core.companion.domain.ConfigSection> {
    private final dagger.internal.Provider<com.paypal.oslo.app.pds.PdsConfigSectionResolver> Camera2StreamConfigurationMap;

    private PDSConfigModule_ProvidePdsSectionFactory(dagger.internal.Provider<com.paypal.oslo.app.pds.PdsConfigSectionResolver> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.companion.domain.ConfigSection get() {
        return providePdsSection(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.app.pds.di.PDSConfigModule_ProvidePdsSectionFactory create(dagger.internal.Provider<com.paypal.oslo.app.pds.PdsConfigSectionResolver> provider) {
        return new com.paypal.oslo.app.pds.di.PDSConfigModule_ProvidePdsSectionFactory(provider);
    }

    public static com.paypal.oslo.core.companion.domain.ConfigSection providePdsSection(com.paypal.oslo.app.pds.PdsConfigSectionResolver pdsConfigSectionResolver) {
        return (com.paypal.oslo.core.companion.domain.ConfigSection) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.pds.di.PDSConfigModule.INSTANCE.providePdsSection(pdsConfigSectionResolver));
    }
}
