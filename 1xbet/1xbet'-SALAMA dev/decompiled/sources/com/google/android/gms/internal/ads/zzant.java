package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.List;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzant implements zzacv {
    private zzacy zza;
    private zzaeb zzb;
    private zzanr zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) throws zzaz {
        int i7;
        zzcv.zzb(this.zzb);
        int i8 = zzen.zza;
        int i9 = this.zzc;
        int iZzn = 4;
        if (i9 == 0) {
            zzcv.zzf(zzacwVar.zzf() == 0);
            int i10 = this.zzf;
            if (i10 != -1) {
                zzacwVar.zzk(i10);
                this.zzc = 4;
            } else {
                if (!zzanw.zzc(zzacwVar)) {
                    throw zzaz.zza("Unsupported or unrecognized wav file type.", null);
                }
                zzacwVar.zzk((int) (zzacwVar.zze() - zzacwVar.zzf()));
                this.zzc = 1;
            }
            return 0;
        }
        long jZzr = -1;
        if (i9 == 1) {
            zzed zzedVar = new zzed(8);
            zzanv zzanvVarZza = zzanv.zza(zzacwVar, zzedVar);
            if (zzanvVarZza.zza != 1685272116) {
                zzacwVar.zzj();
            } else {
                zzacwVar.zzg(8);
                zzedVar.zzL(0);
                zzacwVar.zzh(zzedVar.zzN(), 0, 8);
                jZzr = zzedVar.zzr();
                zzacwVar.zzk(((int) zzanvVarZza.zzb) + 8);
            }
            this.zzd = jZzr;
            this.zzc = 2;
            return 0;
        }
        if (i9 == 2) {
            zzanu zzanuVarZzb = zzanw.zzb(zzacwVar);
            int i11 = zzanuVarZzb.zza;
            if (i11 == 17) {
                this.zze = new zzanq(this.zza, this.zzb, zzanuVarZzb);
            } else if (i11 == 6) {
                this.zze = new zzans(this.zza, this.zzb, zzanuVarZzb, "audio/g711-alaw", -1);
            } else if (i11 == 7) {
                this.zze = new zzans(this.zza, this.zzb, zzanuVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i12 = zzanuVarZzb.zze;
                if (i11 == 1) {
                    iZzn = zzen.zzn(i12);
                    i7 = iZzn;
                } else {
                    if (i11 != 3) {
                        if (i11 == 65534) {
                            iZzn = zzen.zzn(i12);
                            i7 = iZzn;
                        }
                    } else if (i12 == 32) {
                        i7 = iZzn;
                    }
                    i7 = 0;
                }
                if (i7 == 0) {
                    throw zzaz.zzc("Unsupported WAV format type: " + i11);
                }
                this.zze = new zzans(this.zza, this.zzb, zzanuVarZzb, "audio/raw", i7);
            }
            this.zzc = 3;
            return 0;
        }
        if (i9 != 3) {
            zzcv.zzf(this.zzg != -1);
            long jZzf = this.zzg - zzacwVar.zzf();
            zzanr zzanrVar = this.zze;
            zzanrVar.getClass();
            return zzanrVar.zzc(zzacwVar, jZzf) ? -1 : 0;
        }
        Pair pairZza = zzanw.zza(zzacwVar);
        this.zzf = ((Long) pairZza.first).intValue();
        long jLongValue = ((Long) pairZza.second).longValue();
        long j = this.zzd;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        long j3 = ((long) this.zzf) + jLongValue;
        this.zzg = j3;
        long jZzd = zzacwVar.zzd();
        if (jZzd != -1 && j3 > jZzd) {
            StringBuilder sbJ = k.j("Data exceeds input length: ", ", ", j3);
            sbJ.append(jZzd);
            zzdq.zzf("WavExtractor", sbJ.toString());
            this.zzg = jZzd;
            j3 = jZzd;
        }
        zzanr zzanrVar2 = this.zze;
        zzanrVar2.getClass();
        zzanrVar2.zza(this.zzf, j3);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return zzfwh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        this.zza = zzacyVar;
        this.zzb = zzacyVar.zzw(0, 1);
        zzacyVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzc = j == 0 ? 0 : 4;
        zzanr zzanrVar = this.zze;
        if (zzanrVar != null) {
            zzanrVar.zzb(j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        return zzanw.zzc(zzacwVar);
    }
}
