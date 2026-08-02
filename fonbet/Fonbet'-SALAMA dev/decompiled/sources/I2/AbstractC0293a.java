package I2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbbd;

/* renamed from: I2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0293a {
    public Intent a(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public zzbbd.zzq b(Context context, TelephonyManager telephonyManager) {
        return zzbbd.zzq.ENUM_UNKNOWN;
    }

    public boolean d(Context context) {
        return false;
    }

    public int e(AudioManager audioManager) {
        return 0;
    }

    public int g(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void c(Context context) {
    }

    public void f(Activity activity) {
    }
}
