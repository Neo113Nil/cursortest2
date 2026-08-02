package com.paypal.oslo.feature.dataprivacy.data.util;

/* loaded from: classes12.dex */
public final class FileSaverImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.data.util.FileSaverImpl> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private FileSaverImpl_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.data.util.FileSaverImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.data.util.FileSaverImpl_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.dataprivacy.data.util.FileSaverImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.data.util.FileSaverImpl newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.dataprivacy.data.util.FileSaverImpl(context);
    }
}
