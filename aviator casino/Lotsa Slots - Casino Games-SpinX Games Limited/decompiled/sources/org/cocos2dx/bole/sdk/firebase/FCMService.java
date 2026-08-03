package org.cocos2dx.bole.sdk.firebase;

/* loaded from: classes6.dex */
public class FCMService extends com.google.firebase.messaging.FirebaseMessagingService {
    static java.lang.String TAG = "FirebaseSDK";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(java.lang.String str) {
        android.util.Log.d(TAG, "Refreshed token: " + str);
        org.cocos2dx.bole.sdk.firebase.FirebaseSDK.Instance().setFCMToken(str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        android.util.Log.d(TAG, "From: " + remoteMessage.getFrom());
        java.lang.String str = remoteMessage.getData().get("origin");
        if (str != null && str.equals("helpshift")) {
            com.helpshift.Helpshift.handlePush(remoteMessage.getData());
            return;
        }
        if (remoteMessage.getData().size() > 0) {
            new org.cocos2dx.bole.sdk.firebase.NotificationSender(this).send(remoteMessage.getData());
        }
        if (remoteMessage.getNotification() != null) {
            android.util.Log.d(TAG, "onMessageReceived:" + remoteMessage.getNotification());
        }
    }
}
