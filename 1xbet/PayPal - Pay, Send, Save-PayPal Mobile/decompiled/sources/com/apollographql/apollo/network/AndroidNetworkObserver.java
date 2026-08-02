package com.apollographql.apollo.network;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018"}, d2 = {"Lcom/apollographql/apollo/network/AndroidNetworkObserver;", "Lcom/apollographql/apollo/network/NetworkObserver;", "Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Landroid/net/ConnectivityManager;)V", "Lcom/apollographql/apollo/network/NetworkObserver$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "(Lcom/apollographql/apollo/network/NetworkObserver$Listener;)V", "close", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/net/ConnectivityManager;", "getHighSpeedVideoFpsRanges", "Ljava/lang/ref/WeakReference;", "Camera2StreamConfigurationMap", "Ljava/lang/ref/WeakReference;", "", "", "getHighSpeedVideoSizes", "Ljava/util/Set;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidNetworkObserver implements com.apollographql.apollo.network.NetworkObserver {
    private java.lang.ref.WeakReference<com.apollographql.apollo.network.NetworkObserver.Listener> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.net.ConnectivityManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.net.ConnectivityManager.NetworkCallback getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Set<java.lang.Long> getHighSpeedVideoSizes;

    public AndroidNetworkObserver(android.net.ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityManager, "");
        this.getHighSpeedVideoFpsRanges = connectivityManager;
        this.getHighSpeedVideoSizes = new java.util.LinkedHashSet();
        this.getHighResolutionOutputSizeshNQ4ISI = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.apollographql.apollo.network.AndroidNetworkObserver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(android.net.Network network) {
                java.util.Set set;
                java.util.Set set2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                set = com.apollographql.apollo.network.AndroidNetworkObserver.this.getHighSpeedVideoSizes;
                set.add(java.lang.Long.valueOf(network.getNetworkHandle()));
                com.apollographql.apollo.network.AndroidNetworkObserver androidNetworkObserver = com.apollographql.apollo.network.AndroidNetworkObserver.this;
                set2 = androidNetworkObserver.getHighSpeedVideoSizes;
                com.apollographql.apollo.network.AndroidNetworkObserver.access$onConnectivityChange(androidNetworkObserver, !set2.isEmpty());
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(android.net.Network network) {
                java.util.Set set;
                java.util.Set set2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                set = com.apollographql.apollo.network.AndroidNetworkObserver.this.getHighSpeedVideoSizes;
                set.remove(java.lang.Long.valueOf(network.getNetworkHandle()));
                com.apollographql.apollo.network.AndroidNetworkObserver androidNetworkObserver = com.apollographql.apollo.network.AndroidNetworkObserver.this;
                set2 = androidNetworkObserver.getHighSpeedVideoSizes;
                com.apollographql.apollo.network.AndroidNetworkObserver.access$onConnectivityChange(androidNetworkObserver, !set2.isEmpty());
            }
        };
    }

    @Override // com.apollographql.apollo.network.NetworkObserver
    public final void setListener(com.apollographql.apollo.network.NetworkObserver.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        if (this.Camera2StreamConfigurationMap != null) {
            throw new java.lang.IllegalStateException("There can be only one listener".toString());
        }
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addCapability(12).build();
        this.Camera2StreamConfigurationMap = new java.lang.ref.WeakReference<>(listener);
        this.getHighSpeedVideoFpsRanges.registerNetworkCallback(build, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges.unregisterNetworkCallback(this.getHighResolutionOutputSizeshNQ4ISI);
        this.Camera2StreamConfigurationMap = null;
    }

    public static final /* synthetic */ void access$onConnectivityChange(com.apollographql.apollo.network.AndroidNetworkObserver androidNetworkObserver, boolean z) {
        java.lang.ref.WeakReference<com.apollographql.apollo.network.NetworkObserver.Listener> weakReference = androidNetworkObserver.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(weakReference);
        com.apollographql.apollo.network.NetworkObserver.Listener listener = weakReference.get();
        if (listener == null) {
            androidNetworkObserver.close();
        } else {
            listener.networkChanged(z);
        }
    }
}
