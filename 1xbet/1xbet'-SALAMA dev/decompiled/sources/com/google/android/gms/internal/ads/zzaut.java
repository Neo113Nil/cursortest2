package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
final class zzaut extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzauu zza;

    public zzaut(zzauu zzauuVar) {
        this.zza = zzauuVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzauu.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzauu.class) {
            this.zza.zza = null;
        }
    }
}
