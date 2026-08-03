package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfsw {
    private final long zza;
    private final long zzb;
    private final com.google.android.gms.common.util.Clock zzf;
    private long zzg;
    private long zzd = 5;
    private long zze = 0;
    private final java.util.Random zzh = new java.util.Random();
    private long zzc = 0;

    public zzfsw(long j, double d, long j2, double d2, com.google.android.gms.common.util.Clock clock) {
        this.zza = j;
        this.zzb = j2;
        this.zzf = clock;
        zza();
    }

    public final synchronized void zza() {
        this.zzg = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final synchronized long zzb() {
        double d;
        double d2;
        long j;
        d = this.zzg;
        d2 = 0.2d * d;
        j = (long) (d + d2);
        return ((long) (d - d2)) + ((long) (this.zzh.nextDouble() * ((j - r0) + 1)));
    }

    public final synchronized void zzc() {
        this.zze = this.zzf.currentTimeMillis() + zzb();
        double d = this.zzg;
        this.zzg = java.lang.Math.min((long) (d + d), this.zzb);
        this.zzc++;
    }

    public final synchronized boolean zzd() {
        return this.zzf.currentTimeMillis() < this.zze;
    }

    public final synchronized boolean zze() {
        if (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzI)).intValue() < 0) {
            return false;
        }
        if (this.zzc > java.lang.Math.max(this.zzd, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(r0)).intValue())) {
            if (this.zzg >= this.zzb) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void zzf(int i) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0);
        this.zzd = i;
    }
}
