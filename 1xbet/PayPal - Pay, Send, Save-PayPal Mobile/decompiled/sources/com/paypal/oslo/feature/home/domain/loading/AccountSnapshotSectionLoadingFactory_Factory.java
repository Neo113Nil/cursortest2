package com.paypal.oslo.feature.home.domain.loading;

/* loaded from: classes12.dex */
public final class AccountSnapshotSectionLoadingFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.loading.AccountSnapshotSectionLoadingFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.loading.AccountSnapshotSectionLoadingFactory get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.home.domain.loading.AccountSnapshotSectionLoadingFactory_Factory create() {
        return com.paypal.oslo.feature.home.domain.loading.AccountSnapshotSectionLoadingFactory_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.home.domain.loading.AccountSnapshotSectionLoadingFactory newInstance() {
        return new com.paypal.oslo.feature.home.domain.loading.AccountSnapshotSectionLoadingFactory();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.domain.loading.AccountSnapshotSectionLoadingFactory_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.home.domain.loading.AccountSnapshotSectionLoadingFactory_Factory();

        private InstanceHolder() {
        }
    }
}
