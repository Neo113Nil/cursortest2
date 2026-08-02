package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyv implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzc zzb;

    zzbyv(com.google.android.libraries.places.internal.zzbzc zzbzcVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza = zzbmgVar;
        java.util.Objects.requireNonNull(zzbzcVar);
        this.zzb = zzbzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzY().zza(this.zza);
    }
}
