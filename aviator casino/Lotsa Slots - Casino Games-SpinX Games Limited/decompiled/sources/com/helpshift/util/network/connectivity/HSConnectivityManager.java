package com.helpshift.util.network.connectivity;

/* loaded from: classes5.dex */
public class HSConnectivityManager implements com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback {
    private com.helpshift.util.network.connectivity.HSAndroidConnectivityManager hsAndroidConnectivityManager;
    private final java.util.Set<com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback> connectivityCallbacks = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
    private final com.helpshift.util.network.connectivity.HSAndroidConnectivityManagerProvider hsAndroidConnectivityManagerProvider = new com.helpshift.util.network.connectivity.HSAndroidConnectivityManagerProvider();

    public synchronized void registerNetworkConnectivityListener(android.content.Context context, com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback hSNetworkConnectivityCallback) {
        boolean isEmpty = this.connectivityCallbacks.isEmpty();
        this.connectivityCallbacks.add(hSNetworkConnectivityCallback);
        ensureConnectivityManager(context);
        if (isEmpty) {
            startListenNetworkStatus();
        } else {
            int i = com.helpshift.util.network.connectivity.HSConnectivityManager.AnonymousClass1.$SwitchMap$com$helpshift$util$network$connectivity$HSConnectivityStatus[this.hsAndroidConnectivityManager.getConnectivityStatus().ordinal()];
            if (i == 1) {
                hSNetworkConnectivityCallback.onNetworkAvailable();
            } else if (i == 2) {
                hSNetworkConnectivityCallback.onNetworkUnavailable();
            }
        }
    }

    /* renamed from: com.helpshift.util.network.connectivity.HSConnectivityManager$1, reason: invalid class name */
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

    public synchronized void unregisterNetworkConnectivityListener(com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback hSNetworkConnectivityCallback) {
        this.connectivityCallbacks.remove(hSNetworkConnectivityCallback);
        if (this.connectivityCallbacks.isEmpty()) {
            stopListenNetworkStatus();
        }
    }

    private void startListenNetworkStatus() {
        this.hsAndroidConnectivityManager.startListeningConnectivityChange(this);
    }

    private void stopListenNetworkStatus() {
        com.helpshift.util.network.connectivity.HSAndroidConnectivityManager hSAndroidConnectivityManager = this.hsAndroidConnectivityManager;
        if (hSAndroidConnectivityManager == null) {
            return;
        }
        hSAndroidConnectivityManager.stopListeningConnectivityChange();
        this.hsAndroidConnectivityManager = null;
    }

    @Override // com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback
    public void onNetworkAvailable() {
        if (this.connectivityCallbacks.isEmpty()) {
            return;
        }
        java.util.Iterator<com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback> it = this.connectivityCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onNetworkAvailable();
        }
    }

    @Override // com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback
    public void onNetworkUnavailable() {
        if (this.connectivityCallbacks.isEmpty()) {
            return;
        }
        java.util.Iterator<com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback> it = this.connectivityCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onNetworkUnavailable();
        }
    }

    private void ensureConnectivityManager(android.content.Context context) {
        if (this.hsAndroidConnectivityManager == null) {
            this.hsAndroidConnectivityManager = this.hsAndroidConnectivityManagerProvider.getOSConnectivityManager(context);
        }
    }
}
