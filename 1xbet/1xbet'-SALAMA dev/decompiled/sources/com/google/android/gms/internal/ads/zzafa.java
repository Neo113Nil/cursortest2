package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzafa implements zzacv {
    private final byte[] zza;
    private final zzed zzb;
    private final zzadb zzc;
    private zzacy zzd;
    private zzaeb zze;
    private int zzf;
    private zzav zzg;
    private zzadg zzh;
    private int zzi;
    private int zzj;
    private zzaez zzk;
    private int zzl;
    private long zzm;

    public zzafa() {
        throw null;
    }

    private final long zza(zzed zzedVar, boolean z4) {
        boolean zZzc;
        this.zzh.getClass();
        int iZzd = zzedVar.zzd();
        while (iZzd <= zzedVar.zze() - 16) {
            zzedVar.zzL(iZzd);
            if (zzadc.zzc(zzedVar, this.zzh, this.zzj, this.zzc)) {
                zzedVar.zzL(iZzd);
                return this.zzc.zza;
            }
            iZzd++;
        }
        if (!z4) {
            zzedVar.zzL(iZzd);
            return -1L;
        }
        while (iZzd <= zzedVar.zze() - this.zzi) {
            zzedVar.zzL(iZzd);
            try {
                zZzc = zzadc.zzc(zzedVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (zzedVar.zzd() <= zzedVar.zze() && zZzc) {
                zzedVar.zzL(iZzd);
                return this.zzc.zza;
            }
            iZzd++;
        }
        zzedVar.zzL(zzedVar.zze());
        return -1L;
    }

    private final void zzg() {
        long j = this.zzm * 1000000;
        zzadg zzadgVar = this.zzh;
        int i7 = zzen.zza;
        this.zze.zzt(j / ((long) zzadgVar.zze), 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) throws zzaz {
        boolean zZzp;
        zzadu zzadtVar;
        boolean z4;
        int i7 = this.zzf;
        if (i7 == 0) {
            zzacwVar.zzj();
            long jZze = zzacwVar.zze();
            zzav zzavVarZza = zzadd.zza(zzacwVar, true);
            zzacwVar.zzk((int) (zzacwVar.zze() - jZze));
            this.zzg = zzavVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i7 == 1) {
            zzacwVar.zzh(this.zza, 0, 42);
            zzacwVar.zzj();
            this.zzf = 2;
            return 0;
        }
        if (i7 == 2) {
            zzed zzedVar = new zzed(4);
            zzacwVar.zzi(zzedVar.zzN(), 0, 4);
            if (zzedVar.zzu() != 1716281667) {
                throw zzaz.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i7 == 3) {
            zzadg zzadgVarZze = this.zzh;
            do {
                zzacwVar.zzj();
                zzec zzecVar = new zzec(new byte[4], 4);
                zzacwVar.zzh(zzecVar.zza, 0, 4);
                zZzp = zzecVar.zzp();
                int iZzd = zzecVar.zzd(7);
                int iZzd2 = zzecVar.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    zzacwVar.zzi(bArr, 0, 38);
                    zzadgVarZze = new zzadg(bArr, 4);
                } else {
                    if (zzadgVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        zzed zzedVar2 = new zzed(iZzd2);
                        zzacwVar.zzi(zzedVar2.zzN(), 0, iZzd2);
                        zzadgVarZze = zzadgVarZze.zzf(zzadd.zzb(zzedVar2));
                    } else if (iZzd == 4) {
                        zzed zzedVar3 = new zzed(iZzd2);
                        zzacwVar.zzi(zzedVar3.zzN(), 0, iZzd2);
                        zzedVar3.zzM(4);
                        zzadgVarZze = zzadgVarZze.zzg(Arrays.asList(zzaeh.zzc(zzedVar3, false, false).zza));
                    } else if (iZzd == 6) {
                        zzed zzedVar4 = new zzed(iZzd2);
                        zzacwVar.zzi(zzedVar4.zzN(), 0, iZzd2);
                        zzedVar4.zzM(4);
                        zzadgVarZze = zzadgVarZze.zze(zzfwh.zzo(zzaft.zzb(zzedVar4)));
                    } else {
                        zzacwVar.zzk(iZzd2);
                    }
                }
                int i8 = zzen.zza;
                this.zzh = zzadgVarZze;
            } while (!zZzp);
            zzadgVarZze.getClass();
            this.zzi = Math.max(zzadgVarZze.zzc, 6);
            zzz zzzVarZzc = this.zzh.zzc(this.zza, this.zzg);
            zzaeb zzaebVar = this.zze;
            zzx zzxVarZzb = zzzVarZzc.zzb();
            zzxVarZzb.zzE("audio/flac");
            zzaebVar.zzm(zzxVarZzb.zzaj());
            this.zze.zzl(this.zzh.zza());
            this.zzf = 4;
            return 0;
        }
        if (i7 == 4) {
            zzacwVar.zzj();
            zzed zzedVar5 = new zzed(2);
            zzacwVar.zzh(zzedVar5.zzN(), 0, 2);
            int iZzq = zzedVar5.zzq();
            if ((iZzq >> 2) != 16382) {
                zzacwVar.zzj();
                throw zzaz.zza("First frame does not start with sync code.", null);
            }
            zzacwVar.zzj();
            this.zzj = iZzq;
            zzacy zzacyVar = this.zzd;
            int i9 = zzen.zza;
            long jZzf = zzacwVar.zzf();
            long jZzd = zzacwVar.zzd();
            zzadg zzadgVar = this.zzh;
            zzadgVar.getClass();
            if (zzadgVar.zzk != null) {
                zzadtVar = new zzade(zzadgVar, jZzf);
            } else if (jZzd == -1 || zzadgVar.zzj <= 0) {
                zzadtVar = new zzadt(zzadgVar.zza(), 0L);
            } else {
                zzaez zzaezVar = new zzaez(zzadgVar, this.zzj, jZzf, jZzd);
                this.zzk = zzaezVar;
                zzadtVar = zzaezVar.zzb();
            }
            zzacyVar.zzP(zzadtVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzadg zzadgVar2 = this.zzh;
        zzadgVar2.getClass();
        zzaez zzaezVar2 = this.zzk;
        if (zzaezVar2 != null && zzaezVar2.zze()) {
            return zzaezVar2.zza(zzacwVar, zzadrVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzadc.zzb(zzacwVar, zzadgVar2);
            return 0;
        }
        zzed zzedVar6 = this.zzb;
        int iZze = zzedVar6.zze();
        if (iZze < 32768) {
            int iZza = zzacwVar.zza(zzedVar6.zzN(), iZze, 32768 - iZze);
            z4 = iZza == -1;
            if (!z4) {
                this.zzb.zzK(iZze + iZza);
            } else if (this.zzb.zzb() == 0) {
                zzg();
                return -1;
            }
        } else {
            z4 = false;
        }
        zzed zzedVar7 = this.zzb;
        int iZzd3 = zzedVar7.zzd();
        int i10 = this.zzl;
        int i11 = this.zzi;
        if (i10 < i11) {
            zzedVar7.zzM(Math.min(i11 - i10, zzedVar7.zzb()));
        }
        long jZza = zza(this.zzb, z4);
        zzed zzedVar8 = this.zzb;
        int iZzd4 = zzedVar8.zzd() - iZzd3;
        zzedVar8.zzL(iZzd3);
        this.zze.zzr(this.zzb, iZzd4);
        this.zzl += iZzd4;
        if (jZza != -1) {
            zzg();
            this.zzl = 0;
            this.zzm = jZza;
        }
        zzed zzedVar9 = this.zzb;
        if (zzedVar9.zzb() >= 16) {
            return 0;
        }
        int iZzb = zzedVar9.zzb();
        System.arraycopy(zzedVar9.zzN(), zzedVar9.zzd(), zzedVar9.zzN(), 0, iZzb);
        this.zzb.zzL(0);
        this.zzb.zzK(iZzb);
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
        this.zzd = zzacyVar;
        this.zze = zzacyVar.zzw(0, 1);
        zzacyVar.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzaez zzaezVar = this.zzk;
            if (zzaezVar != null) {
                zzaezVar.zzd(j3);
            }
        }
        this.zzm = j3 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        zzadd.zza(zzacwVar, false);
        zzed zzedVar = new zzed(4);
        ((zzack) zzacwVar).zzm(zzedVar.zzN(), 0, 4, false);
        return zzedVar.zzu() == 1716281667;
    }

    public zzafa(int i7) {
        this.zza = new byte[42];
        this.zzb = new zzed(new byte[32768], 0);
        this.zzc = new zzadb();
        this.zzf = 0;
    }
}
