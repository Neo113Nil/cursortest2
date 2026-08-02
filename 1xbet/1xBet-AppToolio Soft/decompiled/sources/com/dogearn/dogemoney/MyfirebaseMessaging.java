package com.dogearn.dogemoney;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import com.google.android.gms.common.util.CrashUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/* loaded from: classes.dex */
public class MyfirebaseMessaging extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, CrashUtils.ErrorDialogData.SUPPRESSED);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("FCM NOTIFICATION");
        builder.setContentText(remoteMessage.getNotification().getBody());
        builder.setAutoCancel(true);
        builder.setSmallIcon(R.drawable.logo);
        builder.setContentIntent(activity);
        ((NotificationManager) getSystemService("notification")).notify(0, builder.build());
    }
}
