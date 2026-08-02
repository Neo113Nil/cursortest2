package I2;

import A1.AbstractC0013d;
import F2.C0254t;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbby;

/* loaded from: classes.dex */
public class S extends Q {
    @Override // I2.AbstractC0293a
    public final Intent a(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // I2.AbstractC0293a
    public final zzbbd.zzq b(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        P p5 = E2.o.f1952C.f1957c;
        if (!P.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return zzbbd.zzq.ENUM_FALSE;
        }
        isDataEnabled = telephonyManager.isDataEnabled();
        return isDataEnabled ? zzbbd.zzq.ENUM_TRUE : zzbbd.zzq.ENUM_FALSE;
    }

    @Override // I2.AbstractC0293a
    public final void c(Context context) {
        AbstractC0013d.D();
        NotificationChannel c3 = AbstractC0013d.c(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zziy)).intValue());
        c3.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(c3);
    }

    @Override // I2.AbstractC0293a
    public final boolean d(Context context) {
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
