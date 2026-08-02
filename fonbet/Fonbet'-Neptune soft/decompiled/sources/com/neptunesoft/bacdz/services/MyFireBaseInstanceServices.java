package com.neptunesoft.bacdz.services;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticApiModelOutline0;
import com.neptunesoft.bacdz.R;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes4.dex */
public class MyFireBaseInstanceServices extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        if (remoteMessage.getData().isEmpty()) {
            showNotification(((RemoteMessage.Notification) Objects.requireNonNull(remoteMessage.getNotification())).getTitle(), remoteMessage.getNotification().getBody());
        } else {
            showNotification(remoteMessage.getData());
        }
    }

    private void showNotification(Map<String, String> data) {
        String str = data.get("title");
        String str2 = data.get("body");
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel m = HomeActivity$$ExternalSyntheticApiModelOutline0.m("com.neptunesoft.bacdz.services", "Notification", 3);
            m.setDescription("Code sphere");
            m.enableLights(true);
            notificationManager.createNotificationChannel(m);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "com.neptunesoft.bacdz.services");
        builder.setAutoCancel(true).setWhen(System.currentTimeMillis()).setSmallIcon(R.drawable.ic_notification).setContentTitle(str).setContentText(str2).setContentInfo("info");
        notificationManager.notify(new Random().nextInt(), builder.build());
    }

    private void showNotification(String title, String body) {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel m = HomeActivity$$ExternalSyntheticApiModelOutline0.m("com.neptunesoft.bacdz.services", "Notification", 3);
            m.setDescription("Code sphere");
            m.enableLights(true);
            notificationManager.createNotificationChannel(m);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "com.neptunesoft.bacdz.services");
        builder.setAutoCancel(true).setWhen(System.currentTimeMillis()).setSmallIcon(R.drawable.ic_notification).setContentTitle(title).setContentText(body).setContentInfo("info");
        notificationManager.notify(new Random().nextInt(), builder.build());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.d("TOKENFIREBASE", s);
    }
}
