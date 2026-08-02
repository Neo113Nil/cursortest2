package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzbge {
    final sun.misc.Unsafe zza;

    public abstract void zza(java.lang.Object obj, long j, byte b);

    public abstract boolean zzb(java.lang.Object obj, long j);

    public abstract void zzc(java.lang.Object obj, long j, boolean z);

    public abstract float zzd(java.lang.Object obj, long j);

    public abstract void zze(java.lang.Object obj, long j, float f);

    public abstract double zzf(java.lang.Object obj, long j);

    public abstract void zzg(java.lang.Object obj, long j, double d);

    zzbge(sun.misc.Unsafe unsafe) {
        this.zza = unsafe;
    }
}
