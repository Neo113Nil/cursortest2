package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfqc implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfqg zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzb;
    final /* synthetic */ boolean zzc;

    zzfqc(com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar, boolean z) {
        this.zza = zzfqgVar;
        this.zzb = zzfpwVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
        if (zzfpwVar.zzb()) {
            com.google.android.gms.internal.ads.zzfqg zzfqgVar = this.zza;
            zzfpwVar.zzj(th);
            zzfpwVar.zzd(false);
            zzfqgVar.zza(zzfpwVar);
            if (this.zzc) {
                zzfqgVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
        zzfpwVar.zzd(true);
        com.google.android.gms.internal.ads.zzfqg zzfqgVar = this.zza;
        zzfqgVar.zza(zzfpwVar);
        if (this.zzc) {
            zzfqgVar.zzh();
        }
    }
}
