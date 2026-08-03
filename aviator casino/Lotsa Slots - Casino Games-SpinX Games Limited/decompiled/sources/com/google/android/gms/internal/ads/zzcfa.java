package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcfa extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfd zza;

    zzcfa(com.google.android.gms.internal.ads.zzcfd zzcfdVar) {
        java.util.Objects.requireNonNull(zzcfdVar);
        this.zza = zzcfdVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        this.zza.zzC().set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        this.zza.zzC().set(false);
    }
}
