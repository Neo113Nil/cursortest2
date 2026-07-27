package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaix implements zzagh {
    private zzagk zzb;
    private zzaji zzc;
    private zzagi zzd;
    private zzahp zze;
    private zzamp zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzeu zza = new zzeu(16);
    private long zzk = -1;
    private int zzg = 0;

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        return zzaiz.zza(zzagiVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzb = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        if (j != 0) {
            if (this.zzg == 3) {
                zzamp zzampVar = this.zzf;
                zzampVar.getClass();
                zzampVar.zze(j, j2);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    private final void zzh() {
        zzagk zzagkVar = this.zzb;
        zzagkVar.getClass();
        zzagkVar.zzv();
        this.zzb.zzw(new zzahj(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    zzeu zzeuVar = this.zza;
                    if (!zzagiVar.zzb(zzeuVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzeuVar.zzh(0);
                    this.zzi = zzeuVar.zzz();
                    this.zzh = zzeuVar.zzB();
                }
                long j = this.zzi;
                if (j == 1) {
                    zzeu zzeuVar2 = this.zza;
                    zzagiVar.zzc(zzeuVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    j = zzeuVar2.zzJ();
                    this.zzi = j;
                }
                if (this.zzh == 1836086884) {
                    long zzn = zzagiVar.zzn();
                    this.zzk = zzn;
                    long j2 = this.zzj;
                    zzaji zzajiVar = new zzaji(0L, zzn - j2, -9223372036854775807L, zzn, j - j2);
                    this.zzc = zzajiVar;
                    zzagk zzagkVar = this.zzb;
                    zzagkVar.getClass();
                    zzaht zzs = zzagkVar.zzs(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/heic");
                    zztVar.zzl(new zzap(-9223372036854775807L, zzajiVar));
                    zzs.zzA(zztVar.zzQ());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i == 1) {
                zzagiVar.zzf((int) (this.zzi - this.zzj));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzagiVar != this.zzd) {
                        this.zzd = zzagiVar;
                        this.zze = new zzahp(zzagiVar, this.zzk);
                    }
                    zzamp zzampVar = this.zzf;
                    zzampVar.getClass();
                    int zzd = zzampVar.zzd(this.zze, zzahhVar);
                    if (zzd == 1) {
                        zzahhVar.zza += this.zzk;
                    }
                    return zzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzamp(zzanx.zza, 8);
                }
                zzahp zzahpVar = new zzahp(zzagiVar, this.zzk);
                this.zze = zzahpVar;
                if (this.zzf.zza(zzahpVar)) {
                    zzamp zzampVar2 = this.zzf;
                    long j3 = this.zzk;
                    zzagk zzagkVar2 = this.zzb;
                    zzagkVar2.getClass();
                    zzampVar2.zzc(new zzahr(j3, zzagkVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }
}
