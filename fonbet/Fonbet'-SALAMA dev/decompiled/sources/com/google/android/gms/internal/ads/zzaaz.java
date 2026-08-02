package com.google.android.gms.internal.ads;

import java.util.Queue;

/* loaded from: classes.dex */
final class zzaaz {
    private final zzaau zza;
    private final zzaas zzb = new zzaas();
    private final zzej zzc = new zzej(10);
    private final zzej zzd = new zzej(10);
    private final zzds zze = new zzds(16);
    private long zzf = -9223372036854775807L;
    private zzcc zzg = zzcc.zza;
    private long zzh;
    private final zzzu zzi;

    public zzaaz(zzzu zzzuVar, zzaau zzaauVar) {
        this.zzi = zzzuVar;
        this.zza = zzaauVar;
    }

    private static Object zzd(zzej zzejVar) {
        zzcv.zzd(zzejVar.zza() > 0);
        while (zzejVar.zza() > 1) {
            zzejVar.zzb();
        }
        Object zzb = zzejVar.zzb();
        zzb.getClass();
        return zzb;
    }

    public final void zza() {
        this.zze.zzc();
        this.zzf = -9223372036854775807L;
        zzej zzejVar = this.zzd;
        if (zzejVar.zza() > 0) {
            Long l7 = (Long) zzd(zzejVar);
            l7.longValue();
            this.zzd.zzd(0L, l7);
        }
        zzej zzejVar2 = this.zzc;
        if (zzejVar2.zza() > 0) {
            this.zzc.zzd(0L, (zzcc) zzd(zzejVar2));
        }
    }

    public final void zzb(long j) {
        long j3 = this.zzf;
        this.zzd.zzd(j3 == -9223372036854775807L ? 0L : j3 + 1, Long.valueOf(j));
    }

    public final void zzc(long j, long j3) {
        Queue queue;
        while (true) {
            zzds zzdsVar = this.zze;
            if (zzdsVar.zzd()) {
                return;
            }
            zzej zzejVar = this.zzd;
            long zza = zzdsVar.zza();
            Long l7 = (Long) zzejVar.zzc(zza);
            if (l7 != null && l7.longValue() != this.zzh) {
                this.zzh = l7.longValue();
                this.zza.zzf();
            }
            int zza2 = this.zza.zza(zza, j, j3, this.zzh, false, this.zzb);
            if (zza2 == 0 || zza2 == 1) {
                zzds zzdsVar2 = this.zze;
                zzej zzejVar2 = this.zzc;
                long zzb = zzdsVar2.zzb();
                zzcc zzccVar = (zzcc) zzejVar2.zzc(zzb);
                if (zzccVar != null && !zzccVar.equals(zzcc.zza) && !zzccVar.equals(this.zzg)) {
                    this.zzg = zzccVar;
                    this.zzi.zza(zzccVar);
                }
                this.zzi.zzb(zza2 == 0 ? -1L : this.zzb.zzd(), zzb, this.zza.zzp());
            } else if (zza2 == 2 || zza2 == 3) {
                this.zze.zzb();
                queue = this.zzi.zza.zzd;
                ((zzabm) queue.remove()).zzb();
            } else if (zza2 != 4) {
                return;
            }
        }
    }
}
