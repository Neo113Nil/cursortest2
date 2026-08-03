package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfqd implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfqg zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzb;

    zzfqd(com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        this.zza = zzfqgVar;
        this.zzb = zzfpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
        zzfpwVar.zzj(th);
        zzfpwVar.zzd(false);
        this.zza.zza(zzfpwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(java.lang.Object obj) {
    }
}
