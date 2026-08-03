package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfpq implements com.google.android.gms.internal.ads.zzdkd, com.google.android.gms.internal.ads.zzddh, com.google.android.gms.internal.ads.zzdkh {
    private final com.google.android.gms.internal.ads.zzfqg zza;
    private final com.google.android.gms.internal.ads.zzfpw zzb;

    zzfpq(android.content.Context context, com.google.android.gms.internal.ads.zzfqg zzfqgVar) {
        this.zza = zzfqgVar;
        this.zzb = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    public final void zza() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzd.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfqg zzfqgVar = this.zza;
            com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
            zzfpwVar.zzd(true);
            zzfqgVar.zza(zzfpwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final void zzh() {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzd.zze()).booleanValue()) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzd.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzfqg zzfqgVar = this.zza;
            com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
            zzfpwVar.zzk(zzeVar.zza().toString());
            zzfpwVar.zzd(false);
            zzfqgVar.zza(zzfpwVar);
        }
    }
}
