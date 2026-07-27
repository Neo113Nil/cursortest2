package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfty {
    private final long zza;
    private final long zzb;
    private final Clock zzf;
    private final zzfuf zzg;
    private long zzh;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzi = new Random();
    private long zzc = 0;

    public zzfty(long j, double d, long j2, double d2, Clock clock, zzfuf zzfufVar) {
        this.zza = j;
        this.zzb = j2;
        this.zzg = zzfufVar;
        this.zzf = clock;
        zza();
    }

    public final synchronized void zza() {
        this.zzh = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final synchronized long zzb() {
        double d;
        double d2;
        long j;
        d = this.zzh;
        d2 = 0.2d * d;
        j = (long) (d + d2);
        return ((long) (d - d2)) + ((long) (this.zzi.nextDouble() * ((j - r0) + 1)));
    }

    public final synchronized void zzc() {
        long zzb = zzb();
        Clock clock = this.zzf;
        this.zze = clock.currentTimeMillis() + zzb;
        double d = this.zzh;
        long j = this.zzb;
        this.zzh = Math.min((long) (d + d), j);
        this.zzc++;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzM)).booleanValue()) {
            this.zzg.zzt(clock.currentTimeMillis(), this.zzc, this.zzh, this.zzd, j);
        }
    }

    public final synchronized boolean zzd() {
        return this.zzf.currentTimeMillis() < this.zze;
    }

    public final synchronized boolean zze() {
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzN)).intValue() < 0) {
            return false;
        }
        if (this.zzc > Math.max(this.zzd, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(r0)).intValue())) {
            if (this.zzh >= this.zzb) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void zzf(int i) {
        Preconditions.checkArgument(i > 0);
        this.zzd = i;
    }
}
