package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzeeq {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcpz zzc;
    private final zzefg zzd;
    private final zzfhv zze;
    private final zzgbw zzf = zzgbw.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzeer zzh;
    private zzfar zzi;

    public zzeeq(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcpz zzcpzVar, zzefg zzefgVar, zzfhv zzfhvVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcpzVar;
        this.zzd = zzefgVar;
        this.zze = zzfhvVar;
    }

    private final synchronized I3.b zzd(zzfaf zzfafVar) {
        Iterator it = zzfafVar.zza.iterator();
        while (it.hasNext()) {
            zzebr zza = this.zzc.zza(zzfafVar.zzb, (String) it.next());
            if (zza != null && zza.zzb(this.zzi, zzfafVar)) {
                return zzgbc.zzo(zza.zza(this.zzi, zzfafVar), zzfafVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgbc.zzg(new zzdus(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzfaf zzfafVar) {
        I3.b zzd = zzd(zzfafVar);
        this.zzd.zzf(this.zzi, zzfafVar, zzd, this.zze);
        zzgbc.zzr(zzd, new zzeep(this, zzfafVar), this.zza);
    }

    public final synchronized I3.b zzb(zzfar zzfarVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (zzfarVar.zzb.zza.isEmpty()) {
                    this.zzf.zzd(new zzefk(3, zzefn.zzc(zzfarVar)));
                } else {
                    this.zzi = zzfarVar;
                    this.zzh = new zzeer(zzfarVar, this.zzd, this.zzf);
                    this.zzd.zzk(zzfarVar.zzb.zza);
                    zzfaf zza = this.zzh.zza();
                    while (zza != null) {
                        zze(zza);
                        zza = this.zzh.zza();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzf;
    }
}
