package com.paypal.oslo.downloads.impl.di;

/* loaded from: classes5.dex */
public final class DownloadDatabaseModule_ProvideDownloadDatabaseFactory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.data.db.DownloadDatabase> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private DownloadDatabaseModule_ProvideDownloadDatabaseFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.data.db.DownloadDatabase get() {
        return provideDownloadDatabase(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.downloads.impl.di.DownloadDatabaseModule_ProvideDownloadDatabaseFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.downloads.impl.di.DownloadDatabaseModule_ProvideDownloadDatabaseFactory(provider);
    }

    public static com.paypal.oslo.downloads.impl.data.db.DownloadDatabase provideDownloadDatabase(android.content.Context context) {
        return (com.paypal.oslo.downloads.impl.data.db.DownloadDatabase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.downloads.impl.di.DownloadDatabaseModule.INSTANCE.provideDownloadDatabase(context));
    }
}
