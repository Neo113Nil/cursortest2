package com.paypal.oslo.app.pds;

/* loaded from: classes10.dex */
public final class PdsConfigSectionResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.app.pds.PdsConfigSectionResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.app.pds.PdsHighlightSetter> getHighResolutionOutputSizeshNQ4ISI;

    private PdsConfigSectionResolver_Factory(dagger.internal.Provider<com.paypal.oslo.app.pds.PdsHighlightSetter> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.pds.PdsConfigSectionResolver get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.pds.PdsConfigSectionResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.app.pds.PdsHighlightSetter> provider) {
        return new com.paypal.oslo.app.pds.PdsConfigSectionResolver_Factory(provider);
    }

    public static com.paypal.oslo.app.pds.PdsConfigSectionResolver newInstance(com.paypal.oslo.app.pds.PdsHighlightSetter pdsHighlightSetter) {
        return new com.paypal.oslo.app.pds.PdsConfigSectionResolver(pdsHighlightSetter);
    }
}
