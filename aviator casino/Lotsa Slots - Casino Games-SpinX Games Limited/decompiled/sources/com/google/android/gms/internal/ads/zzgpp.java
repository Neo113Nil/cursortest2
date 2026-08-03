package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgpp extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgpr zza;

    zzgpp(com.google.android.gms.internal.ads.zzgpr zzgprVar) {
        java.util.Objects.requireNonNull(zzgprVar);
        this.zza = zzgprVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        com.google.android.gms.internal.ads.zzgpr zzgprVar = this.zza;
        synchronized (zzgprVar) {
            zzgprVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        com.google.android.gms.internal.ads.zzgpr zzgprVar = this.zza;
        synchronized (zzgprVar) {
            zzgprVar.zzf(null);
        }
    }
}
