package com.paypal.oslo.downloads.impl.engine;

/* loaded from: classes10.dex */
public final class DownloadProgressTrackerFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory get() {
        return newInstance();
    }

    public static com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory_Factory create() {
        return com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory newInstance() {
        return new com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.downloads.impl.engine.DownloadProgressTrackerFactory_Factory();

        private InstanceHolder() {
        }
    }
}
