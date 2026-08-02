package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzboe implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpm zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zzc;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbof zzd;

    zzboe(com.google.android.libraries.places.internal.zzbof zzbofVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza = zzbnpVar;
        this.zzb = zzbpmVar;
        this.zzc = zzbmgVar;
        java.util.Objects.requireNonNull(zzbofVar);
        this.zzd = zzbofVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzk(this.zza, this.zzb, this.zzc);
    }
}
