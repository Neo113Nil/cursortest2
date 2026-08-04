package I2;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbea;

/* JADX INFO: loaded from: classes.dex */
public abstract class J extends J2.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3546b = 0;

    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z4 = true;
            for (String str2 : J2.j.f3826a.zzd(str)) {
                if (z4) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z4 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return J2.j.j(2) && ((Boolean) zzbea.zza.zze()).booleanValue();
    }
}
