package com.paypal.oslo.core.pushnotification.domain.notification;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderer;", "", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Larrow/core/Either;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationRenderError;", "", "show", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationData;)Larrow/core/Either;", "", "notificationId", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/String;)V", "cancelAll", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface NotificationRenderer {
    void cancel(java.lang.String notificationId);

    void cancelAll();

    arrow.core.Either<com.paypal.oslo.core.pushnotification.domain.notification.NotificationRenderError, kotlin.Unit> show(com.paypal.oslo.core.pushnotification.domain.notification.NotificationData data);
}
