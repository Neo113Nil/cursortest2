package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
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
        boolean z7;
        this.zzh.getClass();
        int zzd = zzedVar.zzd();
        while (zzd <= zzedVar.zze() - 16) {
            zzedVar.zzL(zzd);
            if (zzadc.zzc(zzedVar, this.zzh, this.zzj, this.zzc)) {
                zzedVar.zzL(zzd);
                return this.zzc.zza;
            }
            zzd++;
        }
        if (!z4) {
            zzedVar.zzL(zzd);
            return -1L;
        }
        while (zzd <= zzedVar.zze() - this.zzi) {
            zzedVar.zzL(zzd);
            try {
                z7 = zzadc.zzc(zzedVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                z7 = false;
            }
            if (zzedVar.zzd() <= zzedVar.zze() && z7) {
                zzedVar.zzL(zzd);
                return this.zzc.zza;
            }
            zzd++;
        }
        zzedVar.zzL(zzedVar.zze());
        return -1L;
    }

    private final void zzg() {
        long j = this.zzm * 1000000;
        zzadg zzadgVar = this.zzh;
        int i7 = zzen.zza;
        this.zze.zzt(j / zzadgVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        boolean zzp;
        zzadu zzadtVar;
        boolean z4;
        int i7 = this.zzf;
        if (i7 == 0) {
            zzacwVar.zzj();
            long zze = zzacwVar.zze();
            zzav zza = zzadd.zza(zzacwVar, true);
            zzacwVar.zzk((int) (zzacwVar.zze() - zze));
            this.zzg = zza;
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
            zzadg zzadgVar = this.zzh;
            do {
                zzacwVar.zzj();
                zzec zzecVar = new zzec(new byte[4], 4);
                zzacwVar.zzh(zzecVar.zza, 0, 4);
                zzp = zzecVar.zzp();
                int zzd = zzecVar.zzd(7);
                int zzd2 = zzecVar.zzd(24) + 4;
                if (zzd == 0) {
                    byte[] bArr = new byte[38];
                    zzacwVar.zzi(bArr, 0, 38);
                    zzadgVar = new zzadg(bArr, 4);
                } else {
                    if (zzadgVar == null) {
                        throw new IllegalArgumentException();
                    }
                    if (zzd == 3) {
                        zzed zzedVar2 = new zzed(zzd2);
                        zzacwVar.zzi(zzedVar2.zzN(), 0, zzd2);
                        zzadgVar = zzadgVar.zzf(zzadd.zzb(zzedVar2));
                    } else if (zzd == 4) {
                        zzed zzedVar3 = new zzed(zzd2);
                        zzacwVar.zzi(zzedVar3.zzN(), 0, zzd2);
                        zzedVar3.zzM(4);
                        zzadgVar = zzadgVar.zzg(Arrays.asList(zzaeh.zzc(zzedVar3, false, false).zza));
                    } else if (zzd == 6) {
                        zzed zzedVar4 = new zzed(zzd2);
                        zzacwVar.zzi(zzedVar4.zzN(), 0, zzd2);
                        zzedVar4.zzM(4);
                        zzadgVar = zzadgVar.zze(zzfwh.zzo(zzaft.zzb(zzedVar4)));
                    } else {
                        zzacwVar.zzk(zzd2);
                    }
                }
                int i8 = zzen.zza;
                this.zzh = zzadgVar;
            } while (!zzp);
            zzadgVar.getClass();
            this.zzi = Math.max(zzadgVar.zzc, 6);
            zzz zzc = this.zzh.zzc(this.zza, this.zzg);
            zzaeb zzaebVar = this.zze;
            zzx zzb = zzc.zzb();
            zzb.zzE("audio/flac");
            zzaebVar.zzm(zzb.zzaj());
            this.zze.zzl(this.zzh.zza());
            this.zzf = 4;
            return 0;
        }
        if (i7 == 4) {
            zzacwVar.zzj();
            zzed zzedVar5 = new zzed(2);
            zzacwVar.zzh(zzedVar5.zzN(), 0, 2);
            int zzq = zzedVar5.zzq();
            if ((zzq >> 2) != 16382) {
                zzacwVar.zzj();
                throw zzaz.zza("First frame does not start with sync code.", null);
            }
            zzacwVar.zzj();
            this.zzj = zzq;
            zzacy zzacyVar = this.zzd;
            int i9 = zzen.zza;
            long zzf = zzacwVar.zzf();
            long zzd3 = zzacwVar.zzd();
            zzadg zzadgVar2 = this.zzh;
            zzadgVar2.getClass();
            if (zzadgVar2.zzk != null) {
                zzadtVar = new zzade(zzadgVar2, zzf);
            } else if (zzd3 == -1 || zzadgVar2.zzj <= 0) {
                zzadtVar = new zzadt(zzadgVar2.zza(), 0L);
            } else {
                zzaez zzaezVar = new zzaez(zzadgVar2, this.zzj, zzf, zzd3);
                this.zzk = zzaezVar;
                zzadtVar = zzaezVar.zzb();
            }
            zzacyVar.zzP(zzadtVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzadg zzadgVar3 = this.zzh;
        zzadgVar3.getClass();
        zzaez zzaezVar2 = this.zzk;
        if (zzaezVar2 != null && zzaezVar2.zze()) {
            return zzaezVar2.zza(zzacwVar, zzadrVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzadc.zzb(zzacwVar, zzadgVar3);
            return 0;
        }
        zzed zzedVar6 = this.zzb;
        int zze2 = zzedVar6.zze();
        if (zze2 < 32768) {
            int zza2 = zzacwVar.zza(zzedVar6.zzN(), zze2, 32768 - zze2);
            z4 = zza2 == -1;
            if (!z4) {
                this.zzb.zzK(zze2 + zza2);
            } else if (this.zzb.zzb() == 0) {
                zzg();
                return -1;
            }
        } else {
            z4 = false;
        }
        zzed zzedVar7 = this.zzb;
        int zzd4 = zzedVar7.zzd();
        int i10 = this.zzl;
        int i11 = this.zzi;
        if (i10 < i11) {
            zzedVar7.zzM(Math.min(i11 - i10, zzedVar7.zzb()));
        }
        long zza3 = zza(this.zzb, z4);
        zzed zzedVar8 = this.zzb;
        int zzd5 = zzedVar8.zzd() - zzd4;
        zzedVar8.zzL(zzd4);
        this.zze.zzr(this.zzb, zzd5);
        this.zzl += zzd5;
        if (zza3 != -1) {
            zzg();
            this.zzl = 0;
            this.zzm = zza3;
        }
        zzed zzedVar9 = this.zzb;
        if (zzedVar9.zzb() >= 16) {
            return 0;
        }
        int zzb2 = zzedVar9.zzb();
        System.arraycopy(zzedVar9.zzN(), zzedVar9.zzd(), zzedVar9.zzN(), 0, zzb2);
        this.zzb.zzL(0);
        this.zzb.zzK(zzb2);
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
