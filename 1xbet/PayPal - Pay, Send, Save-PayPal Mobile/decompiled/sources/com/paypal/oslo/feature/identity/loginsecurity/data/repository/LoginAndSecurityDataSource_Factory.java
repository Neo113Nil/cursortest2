package com.paypal.oslo.feature.identity.loginsecurity.data.repository;

/* loaded from: classes12.dex */
public final class LoginAndSecurityDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.loginsecurity.data.repository.LoginAndSecurityDataSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.loginsecurity.data.repository.LoginAndSecurityDataSource get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.identity.loginsecurity.data.repository.LoginAndSecurityDataSource_Factory create() {
        return com.paypal.oslo.feature.identity.loginsecurity.data.repository.LoginAndSecurityDataSource_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.feature.identity.loginsecurity.data.repository.LoginAndSecurityDataSource newInstance() {
        return new com.paypal.oslo.feature.identity.loginsecurity.data.repository.LoginAndSecurityDataSource();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.loginsecurity.data.repository.LoginAndSecurityDataSource_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.loginsecurity.data.repository.LoginAndSecurityDataSource_Factory();

        private InstanceHolder() {
        }
    }
}
