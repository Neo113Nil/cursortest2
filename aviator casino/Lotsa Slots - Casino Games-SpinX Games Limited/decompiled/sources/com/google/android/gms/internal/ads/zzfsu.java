package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfsu extends com.google.android.gms.internal.ads.zzbgl {
    private com.google.android.gms.internal.ads.zzfsp zza;
    private java.lang.String zzb;

    zzfsu(com.google.android.gms.internal.ads.zzfsp zzfspVar, java.lang.String str) {
        this.zza = zzfspVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzb(com.google.android.gms.internal.ads.zzbgj zzbgjVar) {
        com.google.android.gms.internal.ads.zzfsp zzfspVar = this.zza;
        if (zzfspVar == null) {
            return;
        }
        zzfspVar.zza(zzbgjVar);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzc(int i) {
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.internal.ads.zzfsp zzfspVar = this.zza;
        if (zzfspVar == null) {
            return;
        }
        java.lang.String obj = zzeVar.zzb().toString();
        java.lang.String str = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 60 + java.lang.String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(obj);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((com.google.android.gms.internal.ads.zzfto) zzfspVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
    }
}
