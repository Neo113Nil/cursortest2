package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbou implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcku zza;

    zzbou(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zza = zzckuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzckuVar.getContext(), zzckuVar.zzs().afmaVersion, str, null, zzckuVar.zzC() != null ? zzckuVar.zzC().zzax : null).zzb();
    }
}
