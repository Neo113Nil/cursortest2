package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzftm {
    private final java.lang.Object zza;
    private final long zzb;
    private final com.google.android.gms.common.util.Clock zzc;
    private final long zzd;
    private final double zze;
    private final int zzf;

    public zzftm(java.lang.Object obj, com.google.android.gms.common.util.Clock clock, double d, int i) {
        if (clock == null) {
            throw new java.lang.IllegalArgumentException("Clock cannot be null.");
        }
        this.zza = obj;
        this.zzc = clock;
        this.zzb = clock.currentTimeMillis();
        this.zzd = java.lang.Math.min(java.lang.Math.max(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaa)).longValue() * 1000, 10000L), 21600000L);
        this.zze = d;
        this.zzf = i;
    }

    public final java.lang.Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzc.currentTimeMillis() >= this.zzb + this.zzd;
    }

    public final long zzc() {
        return this.zzd - (this.zzc.currentTimeMillis() - this.zzb);
    }

    public final long zzd() {
        return this.zzb;
    }

    public final double zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzf;
    }
}
