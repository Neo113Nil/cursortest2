package com.helpshift.util.network.connectivity;

/* loaded from: classes5.dex */
public class HSAndroidConnectivityManagerProvider {
    public com.helpshift.util.network.connectivity.HSAndroidConnectivityManager getOSConnectivityManager(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return new com.helpshift.util.network.connectivity.HSOnAndAboveNConnectivityManager(context);
        }
        return new com.helpshift.util.network.connectivity.HSBelowNConnectivityManager(context);
    }
}
