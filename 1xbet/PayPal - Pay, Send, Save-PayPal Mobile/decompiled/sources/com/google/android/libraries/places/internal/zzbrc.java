package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrc implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zzb;

    zzbrc(com.google.android.libraries.places.internal.zzbrt zzbrtVar, int i) {
        this.zza = i;
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zzb = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzs(this.zza);
    }
}
