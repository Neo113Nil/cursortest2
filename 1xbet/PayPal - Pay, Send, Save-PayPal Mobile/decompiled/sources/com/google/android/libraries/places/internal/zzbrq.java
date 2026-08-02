package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrs zzb;

    zzbrq(com.google.android.libraries.places.internal.zzbrs zzbrsVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza = zzbmgVar;
        java.util.Objects.requireNonNull(zzbrsVar);
        this.zzb = zzbrsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf().zza(this.zza);
    }
}
