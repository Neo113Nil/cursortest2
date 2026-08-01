package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes4.dex */
public abstract class k extends o {
    public static String f() {
        try {
            return ((TelephonyManager) o.f5960a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String g() {
        return Build.MANUFACTURER + ServerSentEventKt.SPACE + Build.MODEL;
    }

    public static int h() {
        try {
            if (o.a("android.permission.READ_PHONE_STATE")) {
                return ((TelephonyManager) o.f5960a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getDataNetworkType();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String i() {
        try {
            return o.f5960a.getPackageManager().getPackageInfo(o.f5960a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean j() {
        boolean z = (o.f5960a.getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.e("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }

    public static boolean k() {
        TelephonyManager telephonyManager = (TelephonyManager) o.f5960a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }
}
