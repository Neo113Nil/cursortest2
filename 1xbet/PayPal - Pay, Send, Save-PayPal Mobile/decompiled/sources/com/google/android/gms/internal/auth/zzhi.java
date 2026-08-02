package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
abstract class zzhi {
    final sun.misc.Unsafe zza;

    public abstract double zza(java.lang.Object obj, long j);

    public abstract float zzb(java.lang.Object obj, long j);

    public abstract void zzc(java.lang.Object obj, long j, boolean z);

    public abstract void zzd(java.lang.Object obj, long j, double d);

    public abstract void zze(java.lang.Object obj, long j, float f);

    public abstract boolean zzf(java.lang.Object obj, long j);

    zzhi(sun.misc.Unsafe unsafe) {
        this.zza = unsafe;
    }
}
