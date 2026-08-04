package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
final class zzfio extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfip zza;

    public zzfio(zzfip zzfipVar) {
        this.zza = zzfipVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzr(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzr(false);
    }
}
