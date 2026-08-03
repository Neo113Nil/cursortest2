package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbhk implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbhl zzb;

    zzbhk(com.google.android.gms.internal.ads.zzbhl zzbhlVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = zzcfwVar;
        java.util.Objects.requireNonNull(zzbhlVar);
        this.zzb = zzbhlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new java.lang.RuntimeException("Connection failed."));
        }
    }
}
