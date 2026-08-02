package com.paypal.oslo.downloads.impl.di;

/* loaded from: classes5.dex */
public final class DownloadDatabaseModule_ProvideDownloadDaoFactory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.data.dao.DownloadDao> {
    private final dagger.internal.Provider<com.paypal.oslo.downloads.impl.data.db.DownloadDatabase> getHighSpeedVideoSizes;

    private DownloadDatabaseModule_ProvideDownloadDaoFactory(dagger.internal.Provider<com.paypal.oslo.downloads.impl.data.db.DownloadDatabase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.data.dao.DownloadDao get() {
        return provideDownloadDao(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.downloads.impl.di.DownloadDatabaseModule_ProvideDownloadDaoFactory create(dagger.internal.Provider<com.paypal.oslo.downloads.impl.data.db.DownloadDatabase> provider) {
        return new com.paypal.oslo.downloads.impl.di.DownloadDatabaseModule_ProvideDownloadDaoFactory(provider);
    }

    public static com.paypal.oslo.downloads.impl.data.dao.DownloadDao provideDownloadDao(com.paypal.oslo.downloads.impl.data.db.DownloadDatabase downloadDatabase) {
        return (com.paypal.oslo.downloads.impl.data.dao.DownloadDao) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.downloads.impl.di.DownloadDatabaseModule.INSTANCE.provideDownloadDao(downloadDatabase));
    }
}
