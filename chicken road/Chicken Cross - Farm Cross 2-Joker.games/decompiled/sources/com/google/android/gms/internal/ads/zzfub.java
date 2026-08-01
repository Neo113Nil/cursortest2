package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfub extends com.google.android.gms.ads.internal.client.zzbj {
    private com.google.android.gms.ads.internal.client.zzbu zza;
    private zzftr zzb;
    private String zzc;

    zzfub(com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzftr zzftrVar, String str) {
        this.zza = zzbuVar;
        this.zzb = zzftrVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zza() {
        zzftr zzftrVar = this.zzb;
        com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zza;
        if (zzbuVar == null || zzftrVar == null) {
            return;
        }
        zzftrVar.zza(zzbuVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzftr zzftrVar = this.zzb;
        if (this.zza == null || zzftrVar == null) {
            return;
        }
        String obj = zzeVar.zzb().toString();
        String str = this.zzc;
        StringBuilder sb = new StringBuilder(obj.length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(obj);
        sb.append(" for ad unit: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((zzfuq) zzftrVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
