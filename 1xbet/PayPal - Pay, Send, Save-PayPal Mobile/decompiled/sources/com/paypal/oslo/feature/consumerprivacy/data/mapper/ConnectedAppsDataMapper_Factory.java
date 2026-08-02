package com.paypal.oslo.feature.consumerprivacy.data.mapper;

/* loaded from: classes11.dex */
public final class ConnectedAppsDataMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper_Factory create() {
        return com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper newInstance() {
        return new com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper_Factory();

        private InstanceHolder() {
        }
    }
}
