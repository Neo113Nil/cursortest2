package com.paypal.oslo.feature.verificationcapture.data.datasource;

/* loaded from: classes15.dex */
public final class FaceTecSdkWrapperImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapperImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapperImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapperImpl_Factory create() {
        return com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapperImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapperImpl newInstance() {
        return new com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapperImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapperImpl_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.verificationcapture.data.datasource.FaceTecSdkWrapperImpl_Factory();

        private InstanceHolder() {
        }
    }
}
