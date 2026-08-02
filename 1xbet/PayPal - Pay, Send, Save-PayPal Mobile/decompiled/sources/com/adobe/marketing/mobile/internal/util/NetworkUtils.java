package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/ConnectivityManager;", "connectivityManager", "", "isInternetAvailable", "(Landroid/net/ConnectivityManager;)Z"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkUtils {
    public static final boolean isInternetAvailable(android.net.ConnectivityManager connectivityManager) {
        android.net.NetworkCapabilities networkCapabilities;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityManager, "");
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(12);
    }
}
