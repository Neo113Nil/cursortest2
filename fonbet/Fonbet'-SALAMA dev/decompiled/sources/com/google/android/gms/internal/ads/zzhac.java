package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class zzhac {
    final Unsafe zza;

    public zzhac(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j);

    public abstract double zzb(Object obj, long j);

    public abstract float zzc(Object obj, long j);

    public abstract void zzd(long j, byte[] bArr, long j3, long j7);

    public abstract void zze(Object obj, long j, boolean z4);

    public abstract void zzf(Object obj, long j, byte b7);

    public abstract void zzg(Object obj, long j, double d7);

    public abstract void zzh(Object obj, long j, float f7);

    public abstract boolean zzi(Object obj, long j);
}
