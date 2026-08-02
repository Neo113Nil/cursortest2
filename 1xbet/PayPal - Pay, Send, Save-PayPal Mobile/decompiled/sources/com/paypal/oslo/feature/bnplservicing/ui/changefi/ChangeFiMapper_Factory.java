package com.paypal.oslo.feature.bnplservicing.ui.changefi;

/* loaded from: classes11.dex */
public final class ChangeFiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider> getHighResolutionOutputSizeshNQ4ISI;

    private ChangeFiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider> provider2) {
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper newInstance(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.ui.changefi.content.ChangeFiContentProvider changeFiContentProvider) {
        return new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper(bnplServFormatter, changeFiContentProvider);
    }
}
