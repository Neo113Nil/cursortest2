package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqu zzb;

    zzbqj(com.google.android.libraries.places.internal.zzbqu zzbquVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zza = zzbnpVar;
        java.util.Objects.requireNonNull(zzbquVar);
        this.zzb = zzbquVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zza;
        this.zzb.zzk().zze(zzbnpVar.zzh(), zzbnpVar.zzi());
    }
}
