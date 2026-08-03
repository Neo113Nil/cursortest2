package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbau extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbav zza;

    zzbau(com.google.android.gms.internal.ads.zzbav zzbavVar) {
        java.util.Objects.requireNonNull(zzbavVar);
        this.zza = zzbavVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        synchronized (com.google.android.gms.internal.ads.zzbav.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        synchronized (com.google.android.gms.internal.ads.zzbav.class) {
            this.zza.zzd(null);
        }
    }
}
