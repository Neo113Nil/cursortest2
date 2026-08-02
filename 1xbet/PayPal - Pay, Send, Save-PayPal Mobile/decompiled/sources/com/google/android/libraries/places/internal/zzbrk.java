package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrk implements java.lang.Runnable {
    final /* synthetic */ java.io.InputStream zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zzb;

    zzbrk(com.google.android.libraries.places.internal.zzbrt zzbrtVar, java.io.InputStream inputStream) {
        this.zza = inputStream;
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zzb = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzt(this.zza);
    }
}
