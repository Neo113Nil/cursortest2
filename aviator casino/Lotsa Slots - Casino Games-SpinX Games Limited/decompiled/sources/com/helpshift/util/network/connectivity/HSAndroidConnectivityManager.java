package com.helpshift.util.network.connectivity;

/* loaded from: classes5.dex */
public interface HSAndroidConnectivityManager {
    com.helpshift.util.network.connectivity.HSConnectivityStatus getConnectivityStatus();

    void startListeningConnectivityChange(com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback hSNetworkConnectivityCallback);

    void stopListeningConnectivityChange();
}
