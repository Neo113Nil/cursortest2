package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbrn implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;

    zzbrn(com.google.android.gms.internal.ads.zzbro zzbroVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = zzcfwVar;
        java.util.Objects.requireNonNull(zzbroVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zza.zzd(new java.lang.RuntimeException("Connection failed."));
    }
}
