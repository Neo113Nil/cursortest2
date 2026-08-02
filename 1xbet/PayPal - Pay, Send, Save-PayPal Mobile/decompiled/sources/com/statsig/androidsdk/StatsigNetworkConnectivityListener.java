package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/net/NetworkInfo;", "activeNetworkInfo", "Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener$Companion$NetType;", "getLegacyNetType", "(Landroid/net/NetworkInfo;)Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener$Companion$NetType;", "", "", "getLogEventNetworkMetadata", "()Ljava/util/Map;", "Landroid/net/NetworkCapabilities;", "netCaps", "getNetType", "(Landroid/net/NetworkCapabilities;)Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener$Companion$NetType;", "", "isNetworkAvailable", "()Z", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatsigNetworkConnectivityListener {
    public static final java.lang.String NETWORK_METADATA_HAS_INTERNET = "hasInternet";
    public static final java.lang.String NETWORK_METADATA_NET_TYPE = "netType";
    public static final java.lang.String TAG = "statsig::NetListener";
    private final android.net.ConnectivityManager connectivityManager;

    public StatsigNetworkConnectivityListener(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.connectivityManager = (android.net.ConnectivityManager) systemService;
    }

    public final boolean isNetworkAvailable() {
        android.net.NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getLogEventNetworkMetadata() {
        android.net.NetworkCapabilities networkCapabilities;
        com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType netType = com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.NONE;
        boolean z = false;
        try {
            android.net.Network activeNetwork = this.connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = this.connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                    z = true;
                }
                netType = getNetType(networkCapabilities);
            }
        } catch (android.os.RemoteException e) {
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String lowerCase = netType.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        linkedHashMap.put(NETWORK_METADATA_NET_TYPE, lowerCase);
        linkedHashMap.put(NETWORK_METADATA_HAS_INTERNET, java.lang.String.valueOf(z));
        return linkedHashMap;
    }

    private final com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType getNetType(android.net.NetworkCapabilities netCaps) {
        com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType netType = com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.NONE;
        if (netCaps.hasTransport(1)) {
            return com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.WIFI;
        }
        if (netCaps.hasTransport(0)) {
            return com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.CELL;
        }
        if (netCaps.hasTransport(3)) {
            return com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.ETHERNET;
        }
        if (netCaps.hasTransport(8)) {
            return com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.USB;
        }
        if (netCaps.hasTransport(2)) {
            return com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.BLUETOOTH;
        }
        if (netCaps.hasTransport(10)) {
            return com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.SATELLITE;
        }
        return netCaps.hasTransport(4) ? com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.VPN : netType;
    }

    private final com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType getLegacyNetType(android.net.NetworkInfo activeNetworkInfo) {
        java.lang.Integer valueOf = activeNetworkInfo != null ? java.lang.Integer.valueOf(activeNetworkInfo.getType()) : null;
        return (valueOf == null || valueOf.intValue() != 1) ? ((valueOf == null || valueOf.intValue() != 0) && (valueOf == null || valueOf.intValue() != 4) && ((valueOf == null || valueOf.intValue() != 5) && ((valueOf == null || valueOf.intValue() != 2) && (valueOf == null || valueOf.intValue() != 3)))) ? (valueOf == null || valueOf.intValue() != 9) ? (valueOf == null || valueOf.intValue() != 7) ? (valueOf == null || valueOf.intValue() != 17) ? com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.NONE : com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.VPN : com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.BLUETOOTH : com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.ETHERNET : com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.CELL : com.statsig.androidsdk.StatsigNetworkConnectivityListener.Companion.NetType.WIFI;
    }
}
