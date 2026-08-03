package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
abstract class zzon {
    final sun.misc.Unsafe zza;

    zzon(sun.misc.Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(java.lang.Object obj, long j, byte b);

    public abstract boolean zzb(java.lang.Object obj, long j);

    public abstract void zzc(java.lang.Object obj, long j, boolean z);

    public abstract float zzd(java.lang.Object obj, long j);

    public abstract void zze(java.lang.Object obj, long j, float f);

    public abstract double zzf(java.lang.Object obj, long j);

    public abstract void zzg(java.lang.Object obj, long j, double d);
}
