package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzif implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zze;

    zzif(com.google.android.gms.measurement.internal.zzjc zzjcVar, java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zze = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.zza;
        if (str == null) {
            com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zze;
            zzjcVar.zzL().zzas(this.zzb, null);
        } else {
            com.google.android.gms.measurement.internal.zzlt zzltVar = new com.google.android.gms.measurement.internal.zzlt(this.zzc, str, this.zzd);
            com.google.android.gms.measurement.internal.zzjc zzjcVar2 = this.zze;
            zzjcVar2.zzL().zzas(this.zzb, zzltVar);
        }
    }
}
