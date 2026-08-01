package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfvh extends zzcdg {
    private zzcda zza;
    private zzftr zzb;
    private String zzc;

    zzfvh(zzcda zzcdaVar, zzftr zzftrVar, String str) {
        this.zza = zzcdaVar;
        this.zzb = zzftrVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zze() {
        zzftr zzftrVar = this.zzb;
        zzcda zzcdaVar = this.zza;
        if (zzcdaVar == null || zzftrVar == null) {
            return;
        }
        zzftrVar.zza(zzcdaVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzf(int i) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzftr zzftrVar = this.zzb;
        if (this.zza == null || zzftrVar == null) {
            return;
        }
        String adError = zzeVar.zzb().toString();
        String str = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(adError).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(adError);
        sb.append(", adUnitId: ");
        sb.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        ((zzfuq) zzftrVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
