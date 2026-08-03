package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzflk implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfll zza;
    final /* synthetic */ int zzb;

    zzflk(com.google.android.gms.internal.ads.zzfll zzfllVar, int i) {
        this.zzb = i;
        java.util.Objects.requireNonNull(zzfllVar);
        this.zza = zzfllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        this.zza.zzc((java.lang.String) obj, this.zzb, null);
    }
}
