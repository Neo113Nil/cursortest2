package com.paypal.oslo.downloads.impl.storage;

/* loaded from: classes10.dex */
public final class DefaultDownloadStorageProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> getHighSpeedVideoSizes;

    private DefaultDownloadStorageProvider_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.downloads.impl.di.DownloadDispatchers> provider2) {
        return new com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider newInstance(android.content.Context context, com.paypal.oslo.downloads.impl.di.DownloadDispatchers downloadDispatchers) {
        return new com.paypal.oslo.downloads.impl.storage.DefaultDownloadStorageProvider(context, downloadDispatchers);
    }
}
