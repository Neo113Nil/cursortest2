package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzahe implements zzacv {
    private final zzed zza;
    private final zzadn zzb;
    private final zzadj zzc;
    private final zzadl zzd;
    private final zzaeb zze;
    private zzacy zzf;
    private zzaeb zzg;
    private zzaeb zzh;
    private int zzi;
    private zzav zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzahg zzp;
    private boolean zzq;

    public zzahe() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0110  */
    /* JADX WARN: Code duplicated, block: B:60:0x011b  */
    /* JADX WARN: Code duplicated, block: B:62:0x011f  */
    private final int zzg(zzacw zzacwVar) {
        int iZzf;
        int i7;
        int iZzg;
        zzahi zzahiVarZzb;
        zzadj zzadjVar;
        long jZzf;
        long jZzd;
        long jZza;
        long j;
        int i8;
        zzahg zzahbVar;
        long j3;
        long j7;
        int i9;
        int i10;
        zzahd zzahdVarZzb;
        long jZzs;
        if (this.zzi == 0) {
            try {
                zzm(zzacwVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzp == null) {
            zzed zzedVar = new zzed(this.zzb.zzc);
            zzacwVar.zzh(zzedVar.zzN(), 0, this.zzb.zzc);
            zzadn zzadnVar = this.zzb;
            int i11 = 21;
            if ((zzadnVar.zza & 1) != 0) {
                if (zzadnVar.zze != 1) {
                    i11 = 36;
                }
            } else if (zzadnVar.zze == 1) {
                i11 = 13;
            }
            if (zzedVar.zze() >= i11 + 4) {
                zzedVar.zzL(i11);
                iZzg = zzedVar.zzg();
                if (iZzg != 1483304551) {
                    if (iZzg == 1231971951) {
                        iZzg = 1231971951;
                    } else if (zzedVar.zze() >= 40) {
                        zzedVar.zzL(36);
                        if (zzedVar.zzg() == 1447187017) {
                            iZzg = 1447187017;
                        } else {
                            iZzg = 0;
                        }
                    } else {
                        iZzg = 0;
                    }
                }
            } else if (zzedVar.zze() >= 40) {
                zzedVar.zzL(36);
                if (zzedVar.zzg() == 1447187017) {
                    iZzg = 1447187017;
                } else {
                    iZzg = 0;
                }
            } else {
                iZzg = 0;
            }
            if (iZzg == 1231971951) {
                zzahiVarZzb = zzahi.zzb(this.zzb, zzedVar);
                zzadjVar = this.zzc;
                if (!zzadjVar.zza() && (i9 = zzahiVarZzb.zzd) != -1 && (i10 = zzahiVarZzb.zze) != -1) {
                    zzadjVar.zza = i9;
                    zzadjVar.zzb = i10;
                }
                jZzf = zzacwVar.zzf();
                if (zzacwVar.zzd() != -1) {
                    j3 = zzahiVarZzb.zzc;
                    if (j3 != -1) {
                        j7 = j3 + jZzf;
                        if (zzacwVar.zzd() != j7) {
                            StringBuilder sbJ = k.j("Data size mismatch between stream (", ") and Xing frame (", zzacwVar.zzd());
                            sbJ.append(j7);
                            sbJ.append("), using Xing value.");
                            zzdq.zze("Mp3Extractor", sbJ.toString());
                        }
                    }
                }
                zzacwVar.zzk(this.zzb.zzc);
                if (iZzg == 1483304551) {
                    zzahbVar = zzahj.zzb(zzahiVarZzb, jZzf);
                } else {
                    jZzd = zzacwVar.zzd();
                    jZza = zzahiVarZzb.zza();
                    if (jZza != -9223372036854775807L) {
                        zzahbVar = null;
                    } else {
                        j = zzahiVarZzb.zzc;
                        if (j != -1) {
                            jZzd = jZzf + j;
                            i8 = zzahiVarZzb.zza.zzc;
                        } else if (jZzd != -1) {
                            j = jZzd - jZzf;
                            i8 = zzahiVarZzb.zza.zzc;
                        } else {
                            zzahbVar = null;
                        }
                        long j8 = j - ((long) i8);
                        long j9 = jZzd;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        zzahbVar = new zzahb(j9, jZzf + ((long) zzahiVarZzb.zza.zzc), zzfzk.zzb(zzen.zzu(j8, 8000000L, jZza, roundingMode)), zzfzk.zzb(zzfzf.zzb(j8, zzahiVarZzb.zzb, roundingMode)), false);
                    }
                }
            } else if (iZzg != 1447187017) {
                if (iZzg != 1483304551) {
                    zzacwVar.zzj();
                } else {
                    zzahiVarZzb = zzahi.zzb(this.zzb, zzedVar);
                    zzadjVar = this.zzc;
                    if (!zzadjVar.zza()) {
                        zzadjVar.zza = i9;
                        zzadjVar.zzb = i10;
                    }
                    jZzf = zzacwVar.zzf();
                    if (zzacwVar.zzd() != -1) {
                        j3 = zzahiVarZzb.zzc;
                        if (j3 != -1) {
                            j7 = j3 + jZzf;
                            if (zzacwVar.zzd() != j7) {
                                StringBuilder sbJ2 = k.j("Data size mismatch between stream (", ") and Xing frame (", zzacwVar.zzd());
                                sbJ2.append(j7);
                                sbJ2.append("), using Xing value.");
                                zzdq.zze("Mp3Extractor", sbJ2.toString());
                            }
                        }
                    }
                    zzacwVar.zzk(this.zzb.zzc);
                    if (iZzg == 1483304551) {
                        zzahbVar = zzahj.zzb(zzahiVarZzb, jZzf);
                    } else {
                        jZzd = zzacwVar.zzd();
                        jZza = zzahiVarZzb.zza();
                        if (jZza != -9223372036854775807L) {
                            j = zzahiVarZzb.zzc;
                            if (j != -1) {
                                jZzd = jZzf + j;
                                i8 = zzahiVarZzb.zza.zzc;
                            } else if (jZzd != -1) {
                                j = jZzd - jZzf;
                                i8 = zzahiVarZzb.zza.zzc;
                            }
                            long j10 = j - ((long) i8);
                            long j11 = jZzd;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            zzahbVar = new zzahb(j11, jZzf + ((long) zzahiVarZzb.zza.zzc), zzfzk.zzb(zzen.zzu(j10, 8000000L, jZza, roundingMode2)), zzfzk.zzb(zzfzf.zzb(j10, zzahiVarZzb.zzb, roundingMode2)), false);
                        }
                    }
                }
                zzahbVar = null;
            } else {
                zzahbVar = zzahh.zzb(zzacwVar.zzd(), zzacwVar.zzf(), this.zzb, zzedVar);
                zzacwVar.zzk(this.zzb.zzc);
            }
            zzav zzavVar = this.zzj;
            long jZzf2 = zzacwVar.zzf();
            if (zzavVar == null) {
                zzahdVarZzb = null;
                break;
            }
            int iZza = zzavVar.zza();
            int i12 = 0;
            while (true) {
                if (i12 >= iZza) {
                    zzahdVarZzb = null;
                    break;
                }
                zzau zzauVarZzb = zzavVar.zzb(i12);
                if (zzauVarZzb instanceof zzagi) {
                    zzagi zzagiVar = (zzagi) zzauVarZzb;
                    int iZza2 = zzavVar.zza();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= iZza2) {
                            jZzs = -9223372036854775807L;
                            break;
                        }
                        zzau zzauVarZzb2 = zzavVar.zzb(i13);
                        if (zzauVarZzb2 instanceof zzagk) {
                            zzagk zzagkVar = (zzagk) zzauVarZzb2;
                            if (zzagkVar.zzf.equals("TLEN")) {
                                jZzs = zzen.zzs(Long.parseLong((String) zzagkVar.zzb.get(0)));
                                break;
                            }
                        }
                        i13++;
                    }
                    zzahdVarZzb = zzahd.zzb(jZzf2, zzagiVar, jZzs);
                    break;
                }
                i12++;
            }
            if (this.zzq) {
                zzahbVar = new zzahf();
            } else {
                if (zzahdVarZzb != null) {
                    zzahbVar = zzahdVarZzb;
                } else if (zzahbVar == null) {
                    zzahbVar = null;
                }
                if (zzahbVar != null) {
                    zzahbVar.zzh();
                } else {
                    zzacwVar.zzh(this.zza.zzN(), 0, 4);
                    this.zza.zzL(0);
                    this.zzb.zza(this.zza.zzg());
                    long jZzd2 = zzacwVar.zzd();
                    long jZzf3 = zzacwVar.zzf();
                    zzadn zzadnVar2 = this.zzb;
                    zzahbVar = new zzahb(jZzd2, jZzf3, zzadnVar2.zzf, zzadnVar2.zzc, false);
                }
                this.zzg.zzl(zzahbVar.zza());
            }
            this.zzp = zzahbVar;
            this.zzf.zzP(zzahbVar);
            zzx zzxVar = new zzx();
            zzxVar.zzE("audio/mpeg");
            zzxVar.zzad(this.zzb.zzb);
            zzxVar.zzT(4096);
            zzxVar.zzB(this.zzb.zze);
            zzxVar.zzae(this.zzb.zzd);
            zzxVar.zzI(this.zzc.zza);
            zzxVar.zzJ(this.zzc.zzb);
            zzxVar.zzW(this.zzj);
            if (this.zzp.zzc() != -2147483647) {
                zzxVar.zzA(this.zzp.zzc());
            }
            this.zzh.zzm(zzxVar.zzaj());
            this.zzm = zzacwVar.zzf();
        } else {
            long j12 = this.zzm;
            if (j12 != 0) {
                long jZzf4 = zzacwVar.zzf();
                if (jZzf4 < j12) {
                    zzacwVar.zzk((int) (j12 - jZzf4));
                }
            }
        }
        int i14 = this.zzo;
        if (i14 == 0) {
            zzacwVar.zzj();
            if (zzl(zzacwVar)) {
                return -1;
            }
            this.zza.zzL(0);
            int iZzg2 = this.zza.zzg();
            if (!zzk(iZzg2, this.zzi) || zzado.zzb(iZzg2) == -1) {
                zzacwVar.zzk(1);
                this.zzi = 0;
            } else {
                this.zzb.zza(iZzg2);
                if (this.zzk == -9223372036854775807L) {
                    this.zzk = this.zzp.zze(zzacwVar.zzf());
                }
                zzadn zzadnVar3 = this.zzb;
                int i15 = zzadnVar3.zzc;
                this.zzo = i15;
                this.zzn = zzacwVar.zzf() + ((long) i15);
                if (this.zzp instanceof zzahc) {
                    zzh(this.zzl + ((long) zzadnVar3.zzg));
                    throw null;
                }
                i14 = i15;
                iZzf = this.zzh.zzf(zzacwVar, i14, true);
                if (iZzf == -1) {
                    return -1;
                }
                i7 = this.zzo - iZzf;
                this.zzo = i7;
                if (i7 <= 0) {
                    this.zzh.zzt(zzh(this.zzl), 1, this.zzb.zzc, 0, null);
                    this.zzl += (long) this.zzb.zzg;
                    this.zzo = 0;
                    return 0;
                }
            }
        } else {
            iZzf = this.zzh.zzf(zzacwVar, i14, true);
            if (iZzf == -1) {
                return -1;
            }
            i7 = this.zzo - iZzf;
            this.zzo = i7;
            if (i7 <= 0) {
                this.zzh.zzt(zzh(this.zzl), 1, this.zzb.zzc, 0, null);
                this.zzl += (long) this.zzb.zzg;
                this.zzo = 0;
                return 0;
            }
        }
        return 0;
    }

    private final long zzh(long j) {
        zzadn zzadnVar = this.zzb;
        return ((j * 1000000) / ((long) zzadnVar.zzd)) + this.zzk;
    }

    private final void zzj() {
        zzahg zzahgVar = this.zzp;
        if ((zzahgVar instanceof zzahb) && zzahgVar.zzh()) {
            long j = this.zzn;
            if (j == -1 || j == this.zzp.zzd()) {
                return;
            }
            this.zzp = ((zzahb) this.zzp).zzf(this.zzn);
            zzacy zzacyVar = this.zzf;
            zzacyVar.getClass();
            zzacyVar.zzP(this.zzp);
            this.zzg.getClass();
            this.zzp.zza();
        }
    }

    private static boolean zzk(int i7, long j) {
        return ((long) (i7 & (-128000))) == (j & (-128000));
    }

    private final boolean zzl(zzacw zzacwVar) {
        zzahg zzahgVar = this.zzp;
        if (zzahgVar != null) {
            long jZzd = zzahgVar.zzd();
            if (jZzd != -1 && zzacwVar.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !zzacwVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzacw zzacwVar, boolean z4) throws EOFException {
        int iZze;
        int i7;
        int iZzb;
        zzacwVar.zzj();
        if (zzacwVar.zzf() == 0) {
            zzav zzavVarZza = this.zzd.zza(zzacwVar, null);
            this.zzj = zzavVarZza;
            if (zzavVarZza != null) {
                this.zzc.zzb(zzavVarZza);
            }
            iZze = (int) zzacwVar.zze();
            if (!z4) {
                zzacwVar.zzk(iZze);
            }
            i7 = 0;
        } else {
            iZze = 0;
            i7 = 0;
        }
        int i8 = i7;
        int i9 = i8;
        while (true) {
            if (zzl(zzacwVar)) {
                if (i8 > 0) {
                    break;
                }
                zzj();
                throw new EOFException();
            }
            this.zza.zzL(0);
            int iZzg = this.zza.zzg();
            if ((i7 == 0 || zzk(iZzg, i7)) && (iZzb = zzado.zzb(iZzg)) != -1) {
                i8++;
                if (i8 != 1) {
                    if (i8 == 4) {
                        break;
                    }
                } else {
                    this.zzb.zza(iZzg);
                    i7 = iZzg;
                }
                zzacwVar.zzg(iZzb - 4);
            } else {
                int i10 = i9 + 1;
                if (i9 == (true != z4 ? 131072 : 32768)) {
                    if (z4) {
                        return false;
                    }
                    zzj();
                    throw new EOFException();
                }
                if (z4) {
                    zzacwVar.zzj();
                    zzacwVar.zzg(iZze + i10);
                } else {
                    zzacwVar.zzk(1);
                }
                i7 = 0;
                i9 = i10;
                i8 = 0;
            }
        }
        if (z4) {
            zzacwVar.zzk(iZze + i9);
        } else {
            zzacwVar.zzj();
        }
        this.zzi = i7;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        zzcv.zzb(this.zzg);
        int i7 = zzen.zza;
        int iZzg = zzg(zzacwVar);
        if (iZzg == -1 && (this.zzp instanceof zzahc)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                throw null;
            }
        }
        return iZzg;
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
        this.zzf = zzacyVar;
        zzaeb zzaebVarZzw = zzacyVar.zzw(0, 1);
        this.zzg = zzaebVarZzw;
        this.zzh = zzaebVarZzw;
        this.zzf.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzo = 0;
        if (this.zzp instanceof zzahc) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        return zzm(zzacwVar, true);
    }

    public zzahe(int i7) {
        this.zza = new zzed(10);
        this.zzb = new zzadn();
        this.zzc = new zzadj();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzadl();
        zzacq zzacqVar = new zzacq();
        this.zze = zzacqVar;
        this.zzh = zzacqVar;
        this.zzn = -1L;
    }
}
