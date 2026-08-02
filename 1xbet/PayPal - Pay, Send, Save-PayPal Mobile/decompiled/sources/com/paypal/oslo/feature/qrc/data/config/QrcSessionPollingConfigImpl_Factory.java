package com.paypal.oslo.feature.qrc.data.config;

/* loaded from: classes13.dex */
public final class QrcSessionPollingConfigImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.data.config.QrcSessionPollingConfigImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.data.config.QrcSessionPollingConfigImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.data.config.QrcSessionPollingConfigImpl_Factory create() {
        return com.paypal.oslo.feature.qrc.data.config.QrcSessionPollingConfigImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.qrc.data.config.QrcSessionPollingConfigImpl newInstance() {
        return new com.paypal.oslo.feature.qrc.data.config.QrcSessionPollingConfigImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.data.config.QrcSessionPollingConfigImpl_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.qrc.data.config.QrcSessionPollingConfigImpl_Factory();

        private InstanceHolder() {
        }
    }
}
