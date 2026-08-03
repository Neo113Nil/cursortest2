package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzir implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbg zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzc;

    zzir(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzbg zzbgVar, java.lang.String str) {
        this.zza = zzbgVar;
        this.zzb = str;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzc;
        zzjcVar.zzL().zzY();
        zzjcVar.zzL().zzD(this.zza, this.zzb);
    }
}
