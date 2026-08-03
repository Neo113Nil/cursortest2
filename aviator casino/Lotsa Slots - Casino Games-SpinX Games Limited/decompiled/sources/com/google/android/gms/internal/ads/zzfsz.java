package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfsz extends com.google.android.gms.ads.internal.client.zzbj {
    private com.google.android.gms.ads.internal.client.zzbu zza;
    private com.google.android.gms.internal.ads.zzfsp zzb;
    private java.lang.String zzc;

    zzfsz(com.google.android.gms.ads.internal.client.zzbu zzbuVar, com.google.android.gms.internal.ads.zzfsp zzfspVar, java.lang.String str) {
        this.zza = zzbuVar;
        this.zzb = zzfspVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        com.google.android.gms.internal.ads.zzfsp zzfspVar = this.zzb;
        com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zza;
        if (zzbuVar == null || zzfspVar == null) {
            return;
        }
        zzfspVar.zza(zzbuVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfsp zzfspVar = this.zzb;
        if (this.zza == null || zzfspVar == null) {
            return;
        }
        java.lang.String obj = zzeVar.zzb().toString();
        java.lang.String str = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 57 + java.lang.String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(obj);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((com.google.android.gms.internal.ads.zzfto) zzfspVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
