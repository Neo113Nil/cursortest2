package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrr implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpm zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zzc;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrs zzd;

    zzbrr(com.google.android.libraries.places.internal.zzbrs zzbrsVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza = zzbnpVar;
        this.zzb = zzbpmVar;
        this.zzc = zzbmgVar;
        java.util.Objects.requireNonNull(zzbrsVar);
        this.zzd = zzbrsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzf().zzc(this.zza, this.zzb, this.zzc);
    }
}
