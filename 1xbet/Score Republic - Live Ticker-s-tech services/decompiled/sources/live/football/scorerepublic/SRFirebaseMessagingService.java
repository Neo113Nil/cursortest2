package live.football.scorerepublic;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import p000.an0;
import p000.f50;
import p000.ns0;
import p000.z01;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class SRFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: c */
    public final void mo1017c(z01 z01Var) {
        Bundle bundle = z01Var.f9561j;
        Log.d("SRFirebaseMessagingService", "From: " + bundle.getString("from"));
        if (z01Var.f9562k == null && an0.m300u(bundle)) {
            z01Var.f9562k = new f50(new an0(bundle));
        }
        f50 f50Var = z01Var.f9562k;
        if (f50Var != null) {
            String str = (String) f50Var.f2314l;
            String str2 = (String) f50Var.f2313k;
            Log.d("SRFirebaseMessagingService", "Message Notification: " + str2 + " / " + str);
            if (str != null) {
                Intent intent = new Intent(this, (Class<?>) MainActivity.class);
                intent.addFlags(67108864);
                PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
                String string = getString(R.string.default_notification_channel_id);
                string.getClass();
                Uri defaultUri = RingtoneManager.getDefaultUri(2);
                ns0 ns0Var = new ns0(this, string);
                Notification notification = ns0Var.f5528s;
                notification.icon = 2131165305;
                ns0Var.f5514e = ns0.m3584b(str2);
                ns0Var.f5515f = ns0.m3584b(str);
                ns0Var.m3586c(true);
                notification.sound = defaultUri;
                notification.audioStreamType = -1;
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                ns0Var.f5516g = activity;
                Object systemService = getSystemService("notification");
                systemService.getClass();
                NotificationManager notificationManager = (NotificationManager) systemService;
                notificationManager.createNotificationChannel(new NotificationChannel(string, getString(R.string.default_notification_channel_name), 3));
                notificationManager.notify(0, ns0Var.m3585a());
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: d */
    public final void mo1018d(String str) {
        str.getClass();
        Log.d("SRFirebaseMessagingService", "Refreshed token: ".concat(str));
        Log.d("SRFirebaseMessagingService", "sendRegistrationTokenToServer(" + str + ")");
    }
}
