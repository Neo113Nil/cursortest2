package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
final class zzbyn extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbyq zza;

    public zzbyn(zzbyq zzbyqVar) {
        this.zza = zzbyqVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzo.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzo.set(false);
    }
}
