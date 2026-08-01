package sg.bigo.ads.I0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.webkit.WebSettings;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class g {
    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return 3;
            }
            if (type != 0) {
                return 0;
            }
            switch (activeNetworkInfo.getSubtype()) {
            }
            return 0;
        } catch (Throwable th) {
            AbstractC5496a.a("NetworkUtil", "exception on get network info:" + th.getMessage());
            return 0;
        }
    }

    public static boolean c(Context context) {
        if (context == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static String b(Context context) {
        String property;
        String str = (String) sg.bigo.ads.F0.b.a("sp_ads", "sp_user_agent", "", 3);
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = currentTimeMillis - ((Long) sg.bigo.ads.F0.b.a("sp_ads", "sp_user_agent_last_check_ts", (Object) 0L, 1)).longValue();
        if (!TextUtils.isEmpty(str) && longValue > 0 && longValue < 1 * 604800000) {
            return str;
        }
        try {
            property = WebSettings.getDefaultUserAgent(context);
        } catch (Exception unused) {
            property = System.getProperty("http.agent");
        }
        StringBuilder sb = new StringBuilder();
        int length = property.length();
        for (int i = 0; i < length; i++) {
            char charAt = property.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        sg.bigo.ads.F0.b.b("sp_ads", "sp_user_agent", sb2, 3);
        sg.bigo.ads.F0.b.b("sp_ads", "sp_user_agent_last_check_ts", Long.valueOf(currentTimeMillis), 1);
        return sb2;
    }
}
