package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzaen implements zzacv {
    private final zzed zza;
    private final zzael zzb;
    private final boolean zzc;
    private final zzajq zzd;
    private int zze;
    private zzacy zzf;
    private zzaeo zzg;
    private long zzh;
    private zzaeq[] zzi;
    private long zzj;
    private zzaeq zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaen() {
        this(1, zzajq.zza);
    }

    private final zzaeq zzg(int i7) {
        for (zzaeq zzaeqVar : this.zzi) {
            if (zzaeqVar.zzf(i7)) {
                return zzaeqVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) throws zzaz {
        boolean z4;
        long j;
        long j3 = this.zzj;
        if (j3 != -1) {
            long jZzf = zzacwVar.zzf();
            if (j3 < jZzf || j3 > 262144 + jZzf) {
                zzadrVar.zza = j3;
                z4 = true;
            } else {
                zzacwVar.zzk((int) (j3 - jZzf));
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.zzj = -1L;
        if (z4) {
            return 1;
        }
        int i7 = this.zze;
        zzaeq zzaeqVar = null;
        if (i7 == 0) {
            if (!zzi(zzacwVar)) {
                throw zzaz.zza("AVI Header List not found", null);
            }
            zzacwVar.zzk(12);
            this.zze = 1;
            return 0;
        }
        if (i7 == 1) {
            zzacwVar.zzi(this.zza.zzN(), 0, 12);
            this.zza.zzL(0);
            zzael zzaelVar = this.zzb;
            zzed zzedVar = this.zza;
            zzaelVar.zza(zzedVar);
            int i8 = zzaelVar.zza;
            if (i8 != 1414744396) {
                throw zzaz.zza("LIST expected, found: " + i8, null);
            }
            zzaelVar.zzc = zzedVar.zzi();
            zzael zzaelVar2 = this.zzb;
            int i9 = zzaelVar2.zzc;
            if (i9 == 1819436136) {
                this.zzl = zzaelVar2.zzb;
                this.zze = 2;
                return 0;
            }
            throw zzaz.zza("hdrl expected, found: " + i9, null);
        }
        if (i7 == 2) {
            int i10 = this.zzl - 4;
            zzed zzedVar2 = new zzed(i10);
            zzacwVar.zzi(zzedVar2.zzN(), 0, i10);
            zzaer zzaerVarZzc = zzaer.zzc(1819436136, zzedVar2);
            if (zzaerVarZzc.zza() != 1819436136) {
                throw zzaz.zza("Unexpected header list type " + zzaerVarZzc.zza(), null);
            }
            zzaeo zzaeoVar = (zzaeo) zzaerVarZzc.zzb(zzaeo.class);
            if (zzaeoVar == null) {
                throw zzaz.zza("AviHeader not found", null);
            }
            this.zzg = zzaeoVar;
            this.zzh = ((long) zzaeoVar.zzc) * ((long) zzaeoVar.zza);
            ArrayList arrayList = new ArrayList();
            zzfwh zzfwhVar = zzaerVarZzc.zza;
            int size = zzfwhVar.size();
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                zzaej zzaejVar = (zzaej) zzfwhVar.get(i11);
                if (zzaejVar.zza() == 1819440243) {
                    zzaer zzaerVar = (zzaer) zzaejVar;
                    int i13 = i12 + 1;
                    zzaep zzaepVar = (zzaep) zzaerVar.zzb(zzaep.class);
                    zzaes zzaesVar = (zzaes) zzaerVar.zzb(zzaes.class);
                    if (zzaepVar == null) {
                        zzdq.zzf("AviExtractor", "Missing Stream Header");
                    } else if (zzaesVar == null) {
                        zzdq.zzf("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzc = zzaepVar.zzc();
                        zzz zzzVar = zzaesVar.zza;
                        zzx zzxVarZzb = zzzVar.zzb();
                        zzxVarZzb.zzN(i12);
                        int i14 = zzaepVar.zze;
                        if (i14 != 0) {
                            zzxVarZzb.zzT(i14);
                        }
                        zzaet zzaetVar = (zzaet) zzaerVar.zzb(zzaet.class);
                        if (zzaetVar != null) {
                            zzxVarZzb.zzQ(zzaetVar.zza);
                        }
                        int iZzb = zzay.zzb(zzzVar.zzo);
                        if (iZzb == 1) {
                            zzaeb zzaebVarZzw = this.zzf.zzw(i12, iZzb);
                            zzaebVarZzw.zzm(zzxVarZzb.zzaj());
                            zzaebVarZzw.zzl(jZzc);
                            this.zzh = Math.max(this.zzh, jZzc);
                            zzaeqVar = new zzaeq(i12, zzaepVar, zzaebVarZzw);
                        } else if (iZzb == 2) {
                            iZzb = 2;
                            zzaeb zzaebVarZzw2 = this.zzf.zzw(i12, iZzb);
                            zzaebVarZzw2.zzm(zzxVarZzb.zzaj());
                            zzaebVarZzw2.zzl(jZzc);
                            this.zzh = Math.max(this.zzh, jZzc);
                            zzaeqVar = new zzaeq(i12, zzaepVar, zzaebVarZzw2);
                        } else {
                            zzaeqVar = null;
                        }
                    }
                    if (zzaeqVar != null) {
                        arrayList.add(zzaeqVar);
                    }
                    i12 = i13;
                }
                i11++;
                zzaeqVar = null;
            }
            this.zzi = (zzaeq[]) arrayList.toArray(new zzaeq[0]);
            this.zzf.zzG();
            this.zze = 3;
            return 0;
        }
        if (i7 == 3) {
            long j7 = this.zzm;
            if (j7 != -1 && zzacwVar.zzf() != j7) {
                this.zzj = j7;
                return 0;
            }
            zzacwVar.zzh(this.zza.zzN(), 0, 12);
            zzacwVar.zzj();
            this.zza.zzL(0);
            this.zzb.zza(this.zza);
            zzed zzedVar3 = this.zza;
            zzael zzaelVar3 = this.zzb;
            int iZzi = zzedVar3.zzi();
            int i15 = zzaelVar3.zza;
            if (i15 == 1179011410) {
                zzacwVar.zzk(12);
                return 0;
            }
            if (i15 != 1414744396 || iZzi != 1769369453) {
                this.zzj = zzacwVar.zzf() + ((long) this.zzb.zzb) + 8;
                return 0;
            }
            long jZzf2 = zzacwVar.zzf();
            this.zzm = jZzf2;
            long j8 = jZzf2 + ((long) this.zzb.zzb) + 8;
            this.zzn = j8;
            if (!this.zzp) {
                zzaeo zzaeoVar2 = this.zzg;
                zzaeoVar2.getClass();
                if ((zzaeoVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j8;
                    return 0;
                }
                this.zzf.zzP(new zzadt(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzacwVar.zzf() + 12;
            this.zze = 6;
            return 0;
        }
        if (i7 == 4) {
            zzacwVar.zzi(this.zza.zzN(), 0, 8);
            this.zza.zzL(0);
            zzed zzedVar4 = this.zza;
            int iZzi2 = zzedVar4.zzi();
            int iZzi3 = zzedVar4.zzi();
            if (iZzi2 == 829973609) {
                this.zze = 5;
                this.zzo = iZzi3;
            } else {
                this.zzj = zzacwVar.zzf() + ((long) iZzi3);
            }
            return 0;
        }
        if (i7 != 5) {
            if (zzacwVar.zzf() >= this.zzn) {
                return -1;
            }
            zzaeq zzaeqVar2 = this.zzk;
            if (zzaeqVar2 != null) {
                if (!zzaeqVar2.zzg(zzacwVar)) {
                    return 0;
                }
                this.zzk = null;
                return 0;
            }
            if ((zzacwVar.zzf() & 1) == 1) {
                zzacwVar.zzk(1);
            }
            zzacwVar.zzh(this.zza.zzN(), 0, 12);
            this.zza.zzL(0);
            int iZzi4 = this.zza.zzi();
            if (iZzi4 == 1414744396) {
                this.zza.zzL(8);
                zzacwVar.zzk(this.zza.zzi() != 1769369453 ? 8 : 12);
                zzacwVar.zzj();
                return 0;
            }
            int iZzi5 = this.zza.zzi();
            if (iZzi4 == 1263424842) {
                this.zzj = zzacwVar.zzf() + ((long) iZzi5) + 8;
                return 0;
            }
            zzacwVar.zzk(8);
            zzacwVar.zzj();
            zzaeq zzaeqVarZzg = zzg(iZzi4);
            if (zzaeqVarZzg == null) {
                this.zzj = zzacwVar.zzf() + ((long) iZzi5);
                return 0;
            }
            zzaeqVarZzg.zzd(iZzi5);
            this.zzk = zzaeqVarZzg;
            return 0;
        }
        zzed zzedVar5 = new zzed(this.zzo);
        zzacwVar.zzi(zzedVar5.zzN(), 0, this.zzo);
        if (zzedVar5.zzb() < 16) {
            j = 0;
        } else {
            int iZzd = zzedVar5.zzd();
            zzedVar5.zzM(8);
            long jZzi = zzedVar5.zzi();
            long j9 = this.zzm;
            j = jZzi > j9 ? 0L : 8 + j9;
            zzedVar5.zzL(iZzd);
        }
        while (zzedVar5.zzb() >= 16) {
            int iZzi6 = zzedVar5.zzi();
            int iZzi7 = zzedVar5.zzi();
            long jZzi2 = ((long) zzedVar5.zzi()) + j;
            zzedVar5.zzM(4);
            zzaeq zzaeqVarZzg2 = zzg(iZzi6);
            if (zzaeqVarZzg2 != null) {
                zzaeqVarZzg2.zzb(jZzi2, (iZzi7 & 16) == 16);
            }
        }
        for (zzaeq zzaeqVar3 : this.zzi) {
            zzaeqVar3.zzc();
        }
        this.zzp = true;
        if (this.zzi.length == 0) {
            this.zzf.zzP(new zzadt(this.zzh, 0L));
        } else {
            this.zzf.zzP(new zzaek(this, this.zzh));
        }
        this.zze = 6;
        this.zzj = this.zzm;
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
        this.zze = 0;
        if (this.zzc) {
            zzacyVar = new zzajt(zzacyVar, this.zzd);
        }
        this.zzf = zzacyVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaeq zzaeqVar : this.zzi) {
            zzaeqVar.zze(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) {
        zzacwVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzM(4);
        return this.zza.zzi() == 541677121;
    }

    public zzaen(int i7, zzajq zzajqVar) {
        this.zzd = zzajqVar;
        this.zzc = 1 == (i7 ^ 1);
        this.zza = new zzed(12);
        this.zzb = new zzael(null);
        this.zzf = new zzadp();
        this.zzi = new zzaeq[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }
}
