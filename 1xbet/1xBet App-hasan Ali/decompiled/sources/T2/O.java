package T2;

import A0.X;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.F7;

/* loaded from: classes.dex */
public class O extends M {
    @Override // Q1.j
    public final Intent k(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // Q1.j
    public final int m(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        L l5 = P2.o.f4767B.f4771c;
        if (!L.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 1;
        }
        isDataEnabled = telephonyManager.isDataEnabled();
        return isDataEnabled ? 2 : 1;
    }

    @Override // Q1.j
    public final void n(Context context) {
        N.j();
        NotificationChannel c5 = X.c(((Integer) Q2.r.f5053d.f5056c.a(F7.d8)).intValue());
        c5.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(c5);
    }

    @Override // Q1.j
    public final boolean o(Context context) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        return importance == 0;
    }
}
