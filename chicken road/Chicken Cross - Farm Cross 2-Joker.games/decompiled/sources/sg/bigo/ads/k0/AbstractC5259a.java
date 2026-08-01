package sg.bigo.ads.k0;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* renamed from: sg.bigo.ads.k0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5259a {
    public static sg.bigo.ads.U.a a(Context context) {
        String str = "";
        boolean z = true;
        if ("Amazon".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0) {
                    z = false;
                }
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        return new sg.bigo.ads.U.a(str, z);
    }
}
