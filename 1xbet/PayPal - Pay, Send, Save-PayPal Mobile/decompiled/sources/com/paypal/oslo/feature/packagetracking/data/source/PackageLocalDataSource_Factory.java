package com.paypal.oslo.feature.packagetracking.data.source;

/* loaded from: classes13.dex */
public final class PackageLocalDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.data.source.PackageLocalDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.data.source.PackageLocalDataSource get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.packagetracking.data.source.PackageLocalDataSource_Factory create() {
        return com.paypal.oslo.feature.packagetracking.data.source.PackageLocalDataSource_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.packagetracking.data.source.PackageLocalDataSource newInstance() {
        return new com.paypal.oslo.feature.packagetracking.data.source.PackageLocalDataSource();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.packagetracking.data.source.PackageLocalDataSource_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.packagetracking.data.source.PackageLocalDataSource_Factory();

        private InstanceHolder() {
        }
    }
}
