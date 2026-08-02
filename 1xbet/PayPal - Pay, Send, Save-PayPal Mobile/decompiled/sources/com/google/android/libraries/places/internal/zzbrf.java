package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrf implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbjy zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zzb;

    zzbrf(com.google.android.libraries.places.internal.zzbrt zzbrtVar, com.google.android.libraries.places.internal.zzbjy zzbjyVar) {
        this.zza = zzbjyVar;
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zzb = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzd(this.zza);
    }
}
