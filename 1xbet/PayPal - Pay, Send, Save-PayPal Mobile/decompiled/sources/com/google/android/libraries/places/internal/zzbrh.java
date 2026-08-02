package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrh implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zzb;

    zzbrh(com.google.android.libraries.places.internal.zzbrt zzbrtVar, int i) {
        this.zza = i;
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zzb = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzb(this.zza);
    }
}
