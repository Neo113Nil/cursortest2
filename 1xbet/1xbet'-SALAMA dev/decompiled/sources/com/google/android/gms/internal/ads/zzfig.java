package com.google.android.gms.internal.ads;

import F2.C0254t;
import com.google.android.gms.common.internal.D;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class zzfig {
    private final long zza;
    private final long zzb;
    private long zze;
    private long zzd = 5;
    private final Random zzf = new Random();
    private long zzc = 0;

    public zzfig(long j, double d7, long j3, double d8) {
        this.zza = j;
        this.zzb = j3;
        zzc();
    }

    public final long zza() {
        double d7 = this.zze;
        double d8 = 0.2d * d7;
        long j = (long) (d7 + d8);
        long j3 = (long) (d7 - d8);
        return j3 + ((long) (this.zzf.nextDouble() * ((j - j3) + 1)));
    }

    public final void zzb() {
        double d7 = this.zze;
        this.zze = Math.min((long) (d7 + d7), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final synchronized void zzd(int i7) {
        D.b(i7 > 0);
        this.zzd = i7;
    }

    public final boolean zze() {
        return this.zzc > Math.max(this.zzd, (long) ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzB)).intValue()) && this.zze >= this.zzb;
    }
}
