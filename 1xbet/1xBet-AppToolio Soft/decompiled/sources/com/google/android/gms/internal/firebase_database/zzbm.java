package com.google.android.gms.internal.firebase_database;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzbm {
    private final ScheduledExecutorService zzbc;
    private final zzhz zzbs;
    private final long zzgb;
    private final long zzgc;
    private final double zzgd;
    private final double zzge;
    private final Random zzgf;
    private ScheduledFuture<?> zzgg;
    private long zzgh;
    private boolean zzgi;

    private zzbm(ScheduledExecutorService scheduledExecutorService, zzhz zzhzVar, long j, long j2, double d, double d2) {
        this.zzgf = new Random();
        this.zzgi = true;
        this.zzbc = scheduledExecutorService;
        this.zzbs = zzhzVar;
        this.zzgb = j;
        this.zzgc = j2;
        this.zzge = d;
        this.zzgd = d2;
    }

    /* synthetic */ zzbm(ScheduledExecutorService scheduledExecutorService, zzhz zzhzVar, long j, long j2, double d, double d2, zzbn zzbnVar) {
        this(scheduledExecutorService, zzhzVar, j, j2, d, d2);
    }

    static /* synthetic */ ScheduledFuture zza(zzbm zzbmVar, ScheduledFuture scheduledFuture) {
        zzbmVar.zzgg = null;
        return null;
    }

    public final void cancel() {
        if (this.zzgg != null) {
            this.zzbs.zza("Cancelling existing retry attempt", null, new Object[0]);
            this.zzgg.cancel(false);
            this.zzgg = null;
        } else {
            this.zzbs.zza("No existing retry attempt to cancel", null, new Object[0]);
        }
        this.zzgh = 0L;
    }

    public final void zzax() {
        this.zzgi = true;
        this.zzgh = 0L;
    }

    public final void zzay() {
        this.zzgh = this.zzgc;
    }

    public final void zzb(Runnable runnable) {
        long min;
        zzbn zzbnVar = new zzbn(this, runnable);
        if (this.zzgg != null) {
            this.zzbs.zza("Cancelling previous scheduled retry", null, new Object[0]);
            this.zzgg.cancel(false);
            this.zzgg = null;
        }
        long j = 0;
        if (!this.zzgi) {
            long j2 = this.zzgh;
            if (j2 == 0) {
                min = this.zzgb;
            } else {
                double d = j2;
                double d2 = this.zzge;
                Double.isNaN(d);
                min = Math.min((long) (d * d2), this.zzgc);
            }
            this.zzgh = min;
            double d3 = this.zzgd;
            long j3 = this.zzgh;
            double d4 = j3;
            Double.isNaN(d4);
            double d5 = j3;
            Double.isNaN(d5);
            j = (long) (((1.0d - d3) * d4) + (d3 * d5 * this.zzgf.nextDouble()));
        }
        this.zzgi = false;
        this.zzbs.zza("Scheduling retry in %dms", null, Long.valueOf(j));
        this.zzgg = this.zzbc.schedule(zzbnVar, j, TimeUnit.MILLISECONDS);
    }
}
