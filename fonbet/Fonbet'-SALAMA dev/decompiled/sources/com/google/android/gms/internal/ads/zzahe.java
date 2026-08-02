package com.google.android.gms.internal.ads;

import e1.k;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzg(zzacw zzacwVar) {
        int i7;
        zzadj zzadjVar;
        int i8;
        zzahg zzahbVar;
        int i9;
        int i10;
        zzav zzavVar;
        zzahd zzahdVar;
        long j;
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
                i7 = zzedVar.zzg();
                if (i7 != 1483304551) {
                    if (i7 == 1231971951) {
                        i7 = 1231971951;
                    }
                }
                if (i7 != 1231971951) {
                    if (i7 == 1447187017) {
                        zzahbVar = zzahh.zzb(zzacwVar.zzd(), zzacwVar.zzf(), this.zzb, zzedVar);
                        zzacwVar.zzk(this.zzb.zzc);
                        zzavVar = this.zzj;
                        long zzf = zzacwVar.zzf();
                        if (zzavVar != null) {
                        }
                        zzahdVar = null;
                        if (this.zzq) {
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
                        }
                        this.zzh.zzm(zzxVar.zzaj());
                        this.zzm = zzacwVar.zzf();
                    } else if (i7 != 1483304551) {
                        zzacwVar.zzj();
                        zzahbVar = null;
                        zzavVar = this.zzj;
                        long zzf2 = zzacwVar.zzf();
                        if (zzavVar != null) {
                            int zza = zzavVar.zza();
                            for (int i12 = 0; i12 < zza; i12++) {
                                zzau zzb = zzavVar.zzb(i12);
                                if (zzb instanceof zzagi) {
                                    zzagi zzagiVar = (zzagi) zzb;
                                    int zza2 = zzavVar.zza();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= zza2) {
                                            j = -9223372036854775807L;
                                            break;
                                        }
                                        zzau zzb2 = zzavVar.zzb(i13);
                                        if (zzb2 instanceof zzagk) {
                                            zzagk zzagkVar = (zzagk) zzb2;
                                            if (zzagkVar.zzf.equals("TLEN")) {
                                                j = zzen.zzs(Long.parseLong((String) zzagkVar.zzb.get(0)));
                                                break;
                                            }
                                        }
                                        i13++;
                                    }
                                    zzahdVar = zzahd.zzb(zzf2, zzagiVar, j);
                                    if (this.zzq) {
                                        if (zzahdVar != null) {
                                            zzahbVar = zzahdVar;
                                        } else if (zzahbVar == null) {
                                            zzahbVar = null;
                                        }
                                        if (zzahbVar != null) {
                                            zzahbVar.zzh();
                                        } else {
                                            zzacwVar.zzh(this.zza.zzN(), 0, 4);
                                            this.zza.zzL(0);
                                            this.zzb.zza(this.zza.zzg());
                                            long zzd = zzacwVar.zzd();
                                            long zzf3 = zzacwVar.zzf();
                                            zzadn zzadnVar2 = this.zzb;
                                            zzahbVar = new zzahb(zzd, zzf3, zzadnVar2.zzf, zzadnVar2.zzc, false);
                                        }
                                        this.zzg.zzl(zzahbVar.zza());
                                    } else {
                                        zzahbVar = new zzahf();
                                    }
                                    this.zzp = zzahbVar;
                                    this.zzf.zzP(zzahbVar);
                                    zzx zzxVar2 = new zzx();
                                    zzxVar2.zzE("audio/mpeg");
                                    zzxVar2.zzad(this.zzb.zzb);
                                    zzxVar2.zzT(4096);
                                    zzxVar2.zzB(this.zzb.zze);
                                    zzxVar2.zzae(this.zzb.zzd);
                                    zzxVar2.zzI(this.zzc.zza);
                                    zzxVar2.zzJ(this.zzc.zzb);
                                    zzxVar2.zzW(this.zzj);
                                    if (this.zzp.zzc() != -2147483647) {
                                        zzxVar2.zzA(this.zzp.zzc());
                                    }
                                    this.zzh.zzm(zzxVar2.zzaj());
                                    this.zzm = zzacwVar.zzf();
                                }
                            }
                        }
                        zzahdVar = null;
                        if (this.zzq) {
                        }
                        this.zzp = zzahbVar;
                        this.zzf.zzP(zzahbVar);
                        zzx zzxVar22 = new zzx();
                        zzxVar22.zzE("audio/mpeg");
                        zzxVar22.zzad(this.zzb.zzb);
                        zzxVar22.zzT(4096);
                        zzxVar22.zzB(this.zzb.zze);
                        zzxVar22.zzae(this.zzb.zzd);
                        zzxVar22.zzI(this.zzc.zza);
                        zzxVar22.zzJ(this.zzc.zzb);
                        zzxVar22.zzW(this.zzj);
                        if (this.zzp.zzc() != -2147483647) {
                        }
                        this.zzh.zzm(zzxVar22.zzaj());
                        this.zzm = zzacwVar.zzf();
                    }
                }
                zzahi zzb3 = zzahi.zzb(this.zzb, zzedVar);
                zzadjVar = this.zzc;
                if (!zzadjVar.zza() && (i9 = zzb3.zzd) != -1 && (i10 = zzb3.zze) != -1) {
                    zzadjVar.zza = i9;
                    zzadjVar.zzb = i10;
                }
                long zzf4 = zzacwVar.zzf();
                if (zzacwVar.zzd() != -1) {
                    long j3 = zzb3.zzc;
                    if (j3 != -1) {
                        long j7 = j3 + zzf4;
                        if (zzacwVar.zzd() != j7) {
                            StringBuilder j8 = k.j("Data size mismatch between stream (", ") and Xing frame (", zzacwVar.zzd());
                            j8.append(j7);
                            j8.append("), using Xing value.");
                            zzdq.zze("Mp3Extractor", j8.toString());
                        }
                    }
                }
                zzacwVar.zzk(this.zzb.zzc);
                if (i7 == 1483304551) {
                    zzahbVar = zzahj.zzb(zzb3, zzf4);
                } else {
                    long zzd2 = zzacwVar.zzd();
                    long zza3 = zzb3.zza();
                    if (zza3 != -9223372036854775807L) {
                        long j9 = zzb3.zzc;
                        if (j9 != -1) {
                            zzd2 = zzf4 + j9;
                            i8 = zzb3.zza.zzc;
                        } else if (zzd2 != -1) {
                            j9 = zzd2 - zzf4;
                            i8 = zzb3.zza.zzc;
                        }
                        long j10 = j9 - i8;
                        long j11 = zzd2;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        zzahbVar = new zzahb(j11, zzf4 + zzb3.zza.zzc, zzfzk.zzb(zzen.zzu(j10, 8000000L, zza3, roundingMode)), zzfzk.zzb(zzfzf.zzb(j10, zzb3.zzb, roundingMode)), false);
                    }
                    zzahbVar = null;
                }
                zzavVar = this.zzj;
                long zzf22 = zzacwVar.zzf();
                if (zzavVar != null) {
                }
                zzahdVar = null;
                if (this.zzq) {
                }
                this.zzp = zzahbVar;
                this.zzf.zzP(zzahbVar);
                zzx zzxVar222 = new zzx();
                zzxVar222.zzE("audio/mpeg");
                zzxVar222.zzad(this.zzb.zzb);
                zzxVar222.zzT(4096);
                zzxVar222.zzB(this.zzb.zze);
                zzxVar222.zzae(this.zzb.zzd);
                zzxVar222.zzI(this.zzc.zza);
                zzxVar222.zzJ(this.zzc.zzb);
                zzxVar222.zzW(this.zzj);
                if (this.zzp.zzc() != -2147483647) {
                }
                this.zzh.zzm(zzxVar222.zzaj());
                this.zzm = zzacwVar.zzf();
            }
            if (zzedVar.zze() >= 40) {
                zzedVar.zzL(36);
                if (zzedVar.zzg() == 1447187017) {
                    i7 = 1447187017;
                    if (i7 != 1231971951) {
                    }
                    zzahi zzb32 = zzahi.zzb(this.zzb, zzedVar);
                    zzadjVar = this.zzc;
                    if (!zzadjVar.zza()) {
                        zzadjVar.zza = i9;
                        zzadjVar.zzb = i10;
                    }
                    long zzf42 = zzacwVar.zzf();
                    if (zzacwVar.zzd() != -1) {
                    }
                    zzacwVar.zzk(this.zzb.zzc);
                    if (i7 == 1483304551) {
                    }
                    zzavVar = this.zzj;
                    long zzf222 = zzacwVar.zzf();
                    if (zzavVar != null) {
                    }
                    zzahdVar = null;
                    if (this.zzq) {
                    }
                    this.zzp = zzahbVar;
                    this.zzf.zzP(zzahbVar);
                    zzx zzxVar2222 = new zzx();
                    zzxVar2222.zzE("audio/mpeg");
                    zzxVar2222.zzad(this.zzb.zzb);
                    zzxVar2222.zzT(4096);
                    zzxVar2222.zzB(this.zzb.zze);
                    zzxVar2222.zzae(this.zzb.zzd);
                    zzxVar2222.zzI(this.zzc.zza);
                    zzxVar2222.zzJ(this.zzc.zzb);
                    zzxVar2222.zzW(this.zzj);
                    if (this.zzp.zzc() != -2147483647) {
                    }
                    this.zzh.zzm(zzxVar2222.zzaj());
                    this.zzm = zzacwVar.zzf();
                }
            }
            i7 = 0;
            if (i7 != 1231971951) {
            }
            zzahi zzb322 = zzahi.zzb(this.zzb, zzedVar);
            zzadjVar = this.zzc;
            if (!zzadjVar.zza()) {
            }
            long zzf422 = zzacwVar.zzf();
            if (zzacwVar.zzd() != -1) {
            }
            zzacwVar.zzk(this.zzb.zzc);
            if (i7 == 1483304551) {
            }
            zzavVar = this.zzj;
            long zzf2222 = zzacwVar.zzf();
            if (zzavVar != null) {
            }
            zzahdVar = null;
            if (this.zzq) {
            }
            this.zzp = zzahbVar;
            this.zzf.zzP(zzahbVar);
            zzx zzxVar22222 = new zzx();
            zzxVar22222.zzE("audio/mpeg");
            zzxVar22222.zzad(this.zzb.zzb);
            zzxVar22222.zzT(4096);
            zzxVar22222.zzB(this.zzb.zze);
            zzxVar22222.zzae(this.zzb.zzd);
            zzxVar22222.zzI(this.zzc.zza);
            zzxVar22222.zzJ(this.zzc.zzb);
            zzxVar22222.zzW(this.zzj);
            if (this.zzp.zzc() != -2147483647) {
            }
            this.zzh.zzm(zzxVar22222.zzaj());
            this.zzm = zzacwVar.zzf();
        } else {
            long j12 = this.zzm;
            if (j12 != 0) {
                long zzf5 = zzacwVar.zzf();
                if (zzf5 < j12) {
                    zzacwVar.zzk((int) (j12 - zzf5));
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
            int zzg = this.zza.zzg();
            if (!zzk(zzg, this.zzi) || zzado.zzb(zzg) == -1) {
                zzacwVar.zzk(1);
                this.zzi = 0;
                return 0;
            }
            this.zzb.zza(zzg);
            if (this.zzk == -9223372036854775807L) {
                this.zzk = this.zzp.zze(zzacwVar.zzf());
            }
            int i15 = this.zzb.zzc;
            this.zzo = i15;
            this.zzn = zzacwVar.zzf() + i15;
            if (this.zzp instanceof zzahc) {
                zzh(this.zzl + r2.zzg);
                throw null;
            }
            i14 = i15;
        }
        int zzf6 = this.zzh.zzf(zzacwVar, i14, true);
        if (zzf6 == -1) {
            return -1;
        }
        int i16 = this.zzo - zzf6;
        this.zzo = i16;
        if (i16 <= 0) {
            this.zzh.zzt(zzh(this.zzl), 1, this.zzb.zzc, 0, null);
            this.zzl += this.zzb.zzg;
            this.zzo = 0;
            return 0;
        }
        return 0;
    }

    private final long zzh(long j) {
        zzadn zzadnVar = this.zzb;
        return ((j * 1000000) / zzadnVar.zzd) + this.zzk;
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
            long zzd = zzahgVar.zzd();
            if (zzd != -1 && zzacwVar.zze() > zzd - 4) {
                return true;
            }
        }
        try {
            return !zzacwVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzacw zzacwVar, boolean z4) {
        int i7;
        int i8;
        int zzb;
        zzacwVar.zzj();
        if (zzacwVar.zzf() == 0) {
            zzav zza = this.zzd.zza(zzacwVar, null);
            this.zzj = zza;
            if (zza != null) {
                this.zzc.zzb(zza);
            }
            i7 = (int) zzacwVar.zze();
            if (!z4) {
                zzacwVar.zzk(i7);
            }
            i8 = 0;
        } else {
            i7 = 0;
            i8 = 0;
        }
        int i9 = i8;
        int i10 = i9;
        while (true) {
            if (!zzl(zzacwVar)) {
                this.zza.zzL(0);
                int zzg = this.zza.zzg();
                if ((i8 == 0 || zzk(zzg, i8)) && (zzb = zzado.zzb(zzg)) != -1) {
                    i9++;
                    if (i9 != 1) {
                        if (i9 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(zzg);
                        i8 = zzg;
                    }
                    zzacwVar.zzg(zzb - 4);
                } else {
                    int i11 = i10 + 1;
                    if (i10 == (true != z4 ? 131072 : 32768)) {
                        if (z4) {
                            return false;
                        }
                        zzj();
                        throw new EOFException();
                    }
                    if (z4) {
                        zzacwVar.zzj();
                        zzacwVar.zzg(i7 + i11);
                    } else {
                        zzacwVar.zzk(1);
                    }
                    i8 = 0;
                    i10 = i11;
                    i9 = 0;
                }
            } else if (i9 <= 0) {
                zzj();
                throw new EOFException();
            }
        }
        if (z4) {
            zzacwVar.zzk(i7 + i10);
        } else {
            zzacwVar.zzj();
        }
        this.zzi = i8;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        zzcv.zzb(this.zzg);
        int i7 = zzen.zza;
        int zzg = zzg(zzacwVar);
        if (zzg == -1 && (this.zzp instanceof zzahc)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                throw null;
            }
        }
        return zzg;
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
        zzaeb zzw = zzacyVar.zzw(0, 1);
        this.zzg = zzw;
        this.zzh = zzw;
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
