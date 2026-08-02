package com.paypal.oslo.core.pushnotification.domain;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationHandler;", "", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "handle", "(Lcom/google/firebase/messaging/RemoteMessage;)Z", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "onNewToken", "(Ljava/lang/String;)V", "name", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PushNotificationHandler {
    boolean handle(com.google.firebase.messaging.RemoteMessage message);

    java.lang.String name();

    void onNewToken(java.lang.String token);
}
