package com.paypal.oslo.core.pushnotification.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/di/PushNotificationModule;", "", "Lcom/paypal/oslo/core/pushnotification/data/fcm/FcmTokenProviderImpl;", "fcmTokenProviderImpl", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;", "bindPushTokenProvider", "(Lcom/paypal/oslo/core/pushnotification/data/fcm/FcmTokenProviderImpl;)Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;", "Lcom/paypal/oslo/core/pushnotification/analytics/AnalyticsPushNotificationHandler;", "impl", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "bindAnalyticsPushNotificationHandler", "(Lcom/paypal/oslo/core/pushnotification/analytics/AnalyticsPushNotificationHandler;)Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "Lcom/paypal/oslo/core/pushnotification/data/click/NotificationIntentHandlerImpl;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationIntentHandler;", "bindNotificationIntentHandler", "(Lcom/paypal/oslo/core/pushnotification/data/click/NotificationIntentHandlerImpl;)Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationIntentHandler;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface PushNotificationModule {
    @dagger.Binds
    @dagger.multibindings.IntoSet
    com.paypal.oslo.core.pushnotification.domain.PushNotificationHandler bindAnalyticsPushNotificationHandler(com.paypal.oslo.core.pushnotification.analytics.AnalyticsPushNotificationHandler impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.pushnotification.domain.notification.NotificationIntentHandler bindNotificationIntentHandler(com.paypal.oslo.core.pushnotification.data.click.NotificationIntentHandlerImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider bindPushTokenProvider(com.paypal.oslo.core.pushnotification.data.fcm.FcmTokenProviderImpl fcmTokenProviderImpl);
}
