package org.cocos2dx.bole.sdk.firebase;

/* loaded from: classes6.dex */
public class NotificationReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            android.os.Bundle extras = intent.getExtras();
            if (extras != null) {
                if (extras.containsKey("pushid")) {
                    ((android.app.NotificationManager) context.getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION)).cancel(extras.getInt("pushid"));
                } else {
                    new org.cocos2dx.bole.sdk.firebase.NotificationSender(context).send(extras.getBundle(com.adjust.sdk.Constants.PUSH));
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
