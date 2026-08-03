package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfuf extends com.google.android.gms.internal.ads.zzcco {
    private com.google.android.gms.internal.ads.zzcci zza;
    private com.google.android.gms.internal.ads.zzfsp zzb;
    private java.lang.String zzc;

    zzfuf(com.google.android.gms.internal.ads.zzcci zzcciVar, com.google.android.gms.internal.ads.zzfsp zzfspVar, java.lang.String str) {
        this.zza = zzcciVar;
        this.zzb = zzfspVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze() {
        com.google.android.gms.internal.ads.zzfsp zzfspVar = this.zzb;
        com.google.android.gms.internal.ads.zzcci zzcciVar = this.zza;
        if (zzcciVar == null || zzfspVar == null) {
            return;
        }
        zzfspVar.zza(zzcciVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(int i) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfsp zzfspVar = this.zzb;
        if (this.zza == null || zzfspVar == null) {
            return;
        }
        java.lang.String adError = zzeVar.zzb().toString();
        java.lang.String str = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(adError).length() + 51 + java.lang.String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(adError);
        sb.append(", adUnitId: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((com.google.android.gms.internal.ads.zzfto) zzfspVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
