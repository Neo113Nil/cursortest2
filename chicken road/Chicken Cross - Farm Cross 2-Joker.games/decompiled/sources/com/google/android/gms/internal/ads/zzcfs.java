package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcfs extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcfv zza;

    zzcfs(zzcfv zzcfvVar) {
        Objects.requireNonNull(zzcfvVar);
        this.zza = zzcfvVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzD().set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzD().set(false);
    }
}
