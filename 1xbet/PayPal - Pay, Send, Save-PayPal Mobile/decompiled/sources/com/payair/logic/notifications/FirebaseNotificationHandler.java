package com.payair.logic.notifications;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/payair/logic/notifications/FirebaseNotificationHandler;", "", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "onNewToken", "(Ljava/lang/String;)V", "", "Lcom/payair/model/NetworkTokenReference;", "networkTokenReferences", "", "onNotifyTokenUpdateReceived", "(Ljava/util/Set;)Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FirebaseNotificationHandler {
    void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage);

    void onNewToken(java.lang.String token);

    boolean onNotifyTokenUpdateReceived(java.util.Set<com.payair.model.NetworkTokenReference> networkTokenReferences);
}
