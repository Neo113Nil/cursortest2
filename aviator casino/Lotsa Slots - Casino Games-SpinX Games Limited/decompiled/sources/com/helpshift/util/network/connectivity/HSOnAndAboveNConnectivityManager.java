package com.helpshift.util.network.connectivity;

/* loaded from: classes5.dex */
class HSOnAndAboveNConnectivityManager extends android.net.ConnectivityManager.NetworkCallback implements com.helpshift.util.network.connectivity.HSAndroidConnectivityManager {
    private static final java.lang.String TAG = "AboveNConnectvtManager";
    private final android.content.Context context;
    private com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback networkListener;

    HSOnAndAboveNConnectivityManager(android.content.Context context) {
        this.context = context;
    }

    @Override // com.helpshift.util.network.connectivity.HSAndroidConnectivityManager
    public void startListeningConnectivityChange(com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback hSNetworkConnectivityCallback) {
        this.networkListener = hSNetworkConnectivityCallback;
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Exception while registering network callback", e);
            }
        }
        if (getConnectivityStatus() == com.helpshift.util.network.connectivity.HSConnectivityStatus.NOT_CONNECTED) {
            hSNetworkConnectivityCallback.onNetworkUnavailable();
        }
    }

    @Override // com.helpshift.util.network.connectivity.HSAndroidConnectivityManager
    public void stopListeningConnectivityChange() {
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this);
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Exception while unregistering network callback", e);
            }
        }
        this.networkListener = null;
    }

    @Override // com.helpshift.util.network.connectivity.HSAndroidConnectivityManager
    public com.helpshift.util.network.connectivity.HSConnectivityStatus getConnectivityStatus() {
        com.helpshift.util.network.connectivity.HSConnectivityStatus hSConnectivityStatus = com.helpshift.util.network.connectivity.HSConnectivityStatus.UNKNOWN;
        android.net.ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return hSConnectivityStatus;
        }
        if (connectivityManager.getActiveNetwork() != null) {
            return com.helpshift.util.network.connectivity.HSConnectivityStatus.CONNECTED;
        }
        return com.helpshift.util.network.connectivity.HSConnectivityStatus.NOT_CONNECTED;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback hSNetworkConnectivityCallback = this.networkListener;
        if (hSNetworkConnectivityCallback != null) {
            hSNetworkConnectivityCallback.onNetworkAvailable();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback hSNetworkConnectivityCallback = this.networkListener;
        if (hSNetworkConnectivityCallback != null) {
            hSNetworkConnectivityCallback.onNetworkUnavailable();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback hSNetworkConnectivityCallback = this.networkListener;
        if (hSNetworkConnectivityCallback != null) {
            hSNetworkConnectivityCallback.onNetworkUnavailable();
        }
    }

    private android.net.ConnectivityManager getConnectivityManager() {
        try {
            return (android.net.ConnectivityManager) this.context.getSystemService("connectivity");
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Exception while getting connectivity manager", e);
            return null;
        }
    }
}
