package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class k extends com.fyber.inneractive.sdk.util.o {
    public static java.lang.String i() {
        try {
            return ((android.telephony.TelephonyManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE)).getNetworkCountryIso();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String j() {
        return android.os.Build.MANUFACTURER + io.ktor.sse.ServerSentEventKt.SPACE + android.os.Build.MODEL;
    }

    public static int k() {
        try {
            if (!com.fyber.inneractive.sdk.util.o.a("android.permission.READ_PHONE_STATE")) {
                return 0;
            }
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            return android.os.Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public static java.lang.String l() {
        try {
            return com.fyber.inneractive.sdk.util.o.f4302a.getPackageManager().getPackageInfo(com.fyber.inneractive.sdk.util.o.f4302a.getPackageName(), 0).versionName;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static boolean m() {
        boolean z = (com.fyber.inneractive.sdk.util.o.f4302a.getResources().getConfiguration().screenLayout & 15) == 4;
        com.fyber.inneractive.sdk.util.IAlog.e("This device has a tablet resolution? %s", java.lang.Boolean.valueOf(z));
        return z;
    }

    public static boolean n() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }
}
