package com.paypal.oslo.feature.qrc.domain.session.resolver;

/* loaded from: classes14.dex */
public final class QrcSessionResultResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver_Factory create() {
        return com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver newInstance() {
        return new com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver_Factory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.qrc.domain.session.resolver.QrcSessionResultResolver_Factory();

        private InstanceHolder() {
        }
    }
}
