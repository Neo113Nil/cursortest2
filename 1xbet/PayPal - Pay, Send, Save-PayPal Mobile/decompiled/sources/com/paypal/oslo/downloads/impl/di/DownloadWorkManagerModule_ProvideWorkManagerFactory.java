package com.paypal.oslo.downloads.impl.di;

/* loaded from: classes5.dex */
public final class DownloadWorkManagerModule_ProvideWorkManagerFactory implements dagger.internal.Factory<androidx.work.WorkManager> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private DownloadWorkManagerModule_ProvideWorkManagerFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.work.WorkManager get() {
        return provideWorkManager(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.downloads.impl.di.DownloadWorkManagerModule_ProvideWorkManagerFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.downloads.impl.di.DownloadWorkManagerModule_ProvideWorkManagerFactory(provider);
    }

    public static androidx.work.WorkManager provideWorkManager(android.content.Context context) {
        return (androidx.work.WorkManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.downloads.impl.di.DownloadWorkManagerModule.INSTANCE.provideWorkManager(context));
    }
}
