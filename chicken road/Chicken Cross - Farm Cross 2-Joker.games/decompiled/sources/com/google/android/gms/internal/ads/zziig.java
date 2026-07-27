package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
abstract class zziig {
    final Unsafe zza;

    zziig(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract boolean zza(Object obj, long j);

    public abstract void zzb(Object obj, long j, boolean z);

    public abstract float zzc(Object obj, long j);

    public abstract void zzd(Object obj, long j, float f);

    public abstract double zze(Object obj, long j);

    public abstract void zzf(Object obj, long j, double d);
}
