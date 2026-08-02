package com.paypal.oslo.downloads.impl.di;

/* loaded from: classes10.dex */
public final class DefaultDownloadDispatchers_Factory implements dagger.internal.Factory<com.paypal.oslo.downloads.impl.di.DefaultDownloadDispatchers> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.downloads.impl.di.DefaultDownloadDispatchers get() {
        return newInstance();
    }

    public static com.paypal.oslo.downloads.impl.di.DefaultDownloadDispatchers_Factory create() {
        return com.paypal.oslo.downloads.impl.di.DefaultDownloadDispatchers_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.downloads.impl.di.DefaultDownloadDispatchers newInstance() {
        return new com.paypal.oslo.downloads.impl.di.DefaultDownloadDispatchers();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.downloads.impl.di.DefaultDownloadDispatchers_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.downloads.impl.di.DefaultDownloadDispatchers_Factory();

        private InstanceHolder() {
        }
    }
}
