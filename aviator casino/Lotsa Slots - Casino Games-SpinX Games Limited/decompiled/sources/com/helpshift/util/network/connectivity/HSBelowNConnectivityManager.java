package com.helpshift.util.network.connectivity;

/* loaded from: classes5.dex */
class HSBelowNConnectivityManager extends android.content.BroadcastReceiver implements com.helpshift.util.network.connectivity.HSAndroidConnectivityManager {
    private static final java.lang.String TAG = "BelowNConnectvtManager";
    private final android.content.Context context;
    private com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback networkListener;

    HSBelowNConnectivityManager(android.content.Context context) {
        this.context = context;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || intent.getExtras() == null || this.networkListener == null) {
            return;
        }
        int i = com.helpshift.util.network.connectivity.HSBelowNConnectivityManager.AnonymousClass1.$SwitchMap$com$helpshift$util$network$connectivity$HSConnectivityStatus[getConnectivityStatus().ordinal()];
        if (i == 1) {
            this.networkListener.onNetworkAvailable();
        } else {
            if (i != 2) {
                return;
            }
            this.networkListener.onNetworkUnavailable();
        }
    }

    /* renamed from: com.helpshift.util.network.connectivity.HSBelowNConnectivityManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$helpshift$util$network$connectivity$HSConnectivityStatus;

        static {
            int[] iArr = new int[com.helpshift.util.network.connectivity.HSConnectivityStatus.values().length];
            $SwitchMap$com$helpshift$util$network$connectivity$HSConnectivityStatus = iArr;
            try {
                iArr[com.helpshift.util.network.connectivity.HSConnectivityStatus.CONNECTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$helpshift$util$network$connectivity$HSConnectivityStatus[com.helpshift.util.network.connectivity.HSConnectivityStatus.NOT_CONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.helpshift.util.network.connectivity.HSAndroidConnectivityManager
    public void startListeningConnectivityChange(com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback hSNetworkConnectivityCallback) {
        this.networkListener = hSNetworkConnectivityCallback;
        try {
            this.context.registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Exception while registering network receiver", e);
        }
    }

    @Override // com.helpshift.util.network.connectivity.HSAndroidConnectivityManager
    public void stopListeningConnectivityChange() {
        try {
            this.context.unregisterReceiver(this);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Exception while unregistering network receiver", e);
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
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return com.helpshift.util.network.connectivity.HSConnectivityStatus.CONNECTED;
        }
        return com.helpshift.util.network.connectivity.HSConnectivityStatus.NOT_CONNECTED;
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
