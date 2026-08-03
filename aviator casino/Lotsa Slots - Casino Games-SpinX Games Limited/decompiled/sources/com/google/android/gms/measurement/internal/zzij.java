package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzij implements java.util.concurrent.Callable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzd;

    zzij(com.google.android.gms.measurement.internal.zzjc zzjcVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzd = zzjcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzd;
        zzjcVar.zzL().zzY();
        return zzjcVar.zzL().zzj().zzo(this.zza, this.zzb, this.zzc);
    }
}
