package com.paypal.oslo.feature.verificationcapture.data.datasource;

/* loaded from: classes15.dex */
public final class DaonSdkWrapperImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonSdkWrapperImpl_Factory();

        private InstanceHolder() {
        }
    }
}
