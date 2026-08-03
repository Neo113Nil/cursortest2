package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class C4 {
    public static final com.inmobi.media.Xe a() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return com.inmobi.media.Xe.f5048a;
        }
        try {
            java.lang.Object systemService = context.getSystemService("connectivity");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return com.inmobi.media.Xe.b;
                    }
                    java.lang.Object systemService2 = context.getApplicationContext().getSystemService(com.ironsource.T3.b);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    int linkSpeed = ((android.net.wifi.WifiManager) systemService2).getConnectionInfo().getLinkSpeed();
                    return linkSpeed >= 10 ? com.inmobi.media.Xe.d : linkSpeed >= 2 ? com.inmobi.media.Xe.c : com.inmobi.media.Xe.b;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                if (androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return com.inmobi.media.Xe.f5048a;
                }
                java.lang.Object systemService3 = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                int networkType = ((android.telephony.TelephonyManager) systemService3).getNetworkType();
                return (networkType == 1 || networkType == 2 || networkType == 4 || networkType == 7 || networkType == 11 || networkType == 16) ? com.inmobi.media.Xe.b : (networkType == 18 || networkType == 20) ? com.inmobi.media.Xe.d : com.inmobi.media.Xe.c;
            }
            return com.inmobi.media.Xe.f5048a;
        } catch (java.lang.SecurityException unused) {
            return com.inmobi.media.Xe.f5048a;
        }
    }
}
