package com.paypal.oslo.feature.notificationcenter.data.mapper;

/* loaded from: classes13.dex */
public final class NotificationMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper_Factory create() {
        return com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper newInstance() {
        return new com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.notificationcenter.data.mapper.NotificationMapper_Factory();

        private InstanceHolder() {
        }
    }
}
