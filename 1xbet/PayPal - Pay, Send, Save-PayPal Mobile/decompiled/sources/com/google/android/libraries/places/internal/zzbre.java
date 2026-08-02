package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbre implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbjj zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zzb;

    zzbre(com.google.android.libraries.places.internal.zzbrt zzbrtVar, com.google.android.libraries.places.internal.zzbjj zzbjjVar) {
        this.zza = zzbjjVar;
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zzb = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzv(this.zza);
    }
}
