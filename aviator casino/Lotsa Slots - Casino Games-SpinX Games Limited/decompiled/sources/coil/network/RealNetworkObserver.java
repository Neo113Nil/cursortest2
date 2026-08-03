package coil.network;

/* compiled from: NetworkObserver.kt */
@kotlin.Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\t\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0002J\f\u0010\u000b\u001a\u00020\f*\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0013"}, d2 = {"Lcoil/network/RealNetworkObserver;", "Lcoil/network/NetworkObserver;", "connectivityManager", "Landroid/net/ConnectivityManager;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/network/NetworkObserver$Listener;", "<init>", "(Landroid/net/ConnectivityManager;Lcoil/network/NetworkObserver$Listener;)V", "networkCallback", "coil/network/RealNetworkObserver$networkCallback$1", "Lcoil/network/RealNetworkObserver$networkCallback$1;", "isOnline", "", "()Z", "shutdown", "", "onConnectivityChange", "network", "Landroid/net/Network;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RealNetworkObserver implements coil.network.NetworkObserver {
    private final android.net.ConnectivityManager connectivityManager;
    private final coil.network.NetworkObserver.Listener listener;
    private final coil.network.RealNetworkObserver$networkCallback$1 networkCallback;

    /* JADX WARN: Type inference failed for: r4v1, types: [coil.network.RealNetworkObserver$networkCallback$1] */
    public RealNetworkObserver(android.net.ConnectivityManager connectivityManager, coil.network.NetworkObserver.Listener listener) {
        this.connectivityManager = connectivityManager;
        this.listener = listener;
        ?? r4 = new android.net.ConnectivityManager.NetworkCallback() { // from class: coil.network.RealNetworkObserver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(android.net.Network network) {
                coil.network.RealNetworkObserver.this.onConnectivityChange(network, true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(android.net.Network network) {
                coil.network.RealNetworkObserver.this.onConnectivityChange(network, false);
            }
        };
        this.networkCallback = r4;
        connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().addCapability(12).build(), (android.net.ConnectivityManager.NetworkCallback) r4);
    }

    @Override // coil.network.NetworkObserver
    public boolean isOnline() {
        for (android.net.Network network : this.connectivityManager.getAllNetworks()) {
            if (isOnline(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.network.NetworkObserver
    public void shutdown() {
        this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnectivityChange(android.net.Network network, boolean isOnline) {
        android.net.Network[] allNetworks = this.connectivityManager.getAllNetworks();
        int length = allNetworks.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            android.net.Network network2 = allNetworks[i];
            if (kotlin.jvm.internal.Intrinsics.areEqual(network2, network) ? isOnline : isOnline(network2)) {
                z = true;
                break;
            }
            i++;
        }
        this.listener.onConnectivityChange(z);
    }

    private final boolean isOnline(android.net.Network network) {
        android.net.NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
