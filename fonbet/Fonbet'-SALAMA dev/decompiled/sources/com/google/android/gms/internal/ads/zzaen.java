package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzacv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        boolean z4;
        long j;
        long j3 = this.zzj;
        if (j3 != -1) {
            long zzf = zzacwVar.zzf();
            if (j3 < zzf || j3 > 262144 + zzf) {
                zzadrVar.zza = j3;
                z4 = true;
                this.zzj = -1L;
                if (!z4) {
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
                    zzaer zzc = zzaer.zzc(1819436136, zzedVar2);
                    if (zzc.zza() != 1819436136) {
                        throw zzaz.zza("Unexpected header list type " + zzc.zza(), null);
                    }
                    zzaeo zzaeoVar = (zzaeo) zzc.zzb(zzaeo.class);
                    if (zzaeoVar == null) {
                        throw zzaz.zza("AviHeader not found", null);
                    }
                    this.zzg = zzaeoVar;
                    this.zzh = zzaeoVar.zzc * zzaeoVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzfwh zzfwhVar = zzc.zza;
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
                                long zzc2 = zzaepVar.zzc();
                                zzz zzzVar = zzaesVar.zza;
                                zzx zzb = zzzVar.zzb();
                                zzb.zzN(i12);
                                int i14 = zzaepVar.zze;
                                if (i14 != 0) {
                                    zzb.zzT(i14);
                                }
                                zzaet zzaetVar = (zzaet) zzaerVar.zzb(zzaet.class);
                                if (zzaetVar != null) {
                                    zzb.zzQ(zzaetVar.zza);
                                }
                                int zzb2 = zzay.zzb(zzzVar.zzo);
                                if (zzb2 != 1) {
                                    if (zzb2 == 2) {
                                        zzb2 = 2;
                                    } else {
                                        zzaeqVar = null;
                                    }
                                }
                                zzaeb zzw = this.zzf.zzw(i12, zzb2);
                                zzw.zzm(zzb.zzaj());
                                zzw.zzl(zzc2);
                                this.zzh = Math.max(this.zzh, zzc2);
                                zzaeqVar = new zzaeq(i12, zzaepVar, zzw);
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
                    int zzi = zzedVar3.zzi();
                    int i15 = zzaelVar3.zza;
                    if (i15 == 1179011410) {
                        zzacwVar.zzk(12);
                        return 0;
                    }
                    if (i15 != 1414744396 || zzi != 1769369453) {
                        this.zzj = zzacwVar.zzf() + this.zzb.zzb + 8;
                        return 0;
                    }
                    long zzf2 = zzacwVar.zzf();
                    this.zzm = zzf2;
                    long j8 = zzf2 + this.zzb.zzb + 8;
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
                    int zzi2 = zzedVar4.zzi();
                    int zzi3 = zzedVar4.zzi();
                    if (zzi2 == 829973609) {
                        this.zze = 5;
                        this.zzo = zzi3;
                    } else {
                        this.zzj = zzacwVar.zzf() + zzi3;
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
                    int zzi4 = this.zza.zzi();
                    if (zzi4 == 1414744396) {
                        this.zza.zzL(8);
                        zzacwVar.zzk(this.zza.zzi() != 1769369453 ? 8 : 12);
                        zzacwVar.zzj();
                        return 0;
                    }
                    int zzi5 = this.zza.zzi();
                    if (zzi4 == 1263424842) {
                        this.zzj = zzacwVar.zzf() + zzi5 + 8;
                        return 0;
                    }
                    zzacwVar.zzk(8);
                    zzacwVar.zzj();
                    zzaeq zzg = zzg(zzi4);
                    if (zzg == null) {
                        this.zzj = zzacwVar.zzf() + zzi5;
                        return 0;
                    }
                    zzg.zzd(zzi5);
                    this.zzk = zzg;
                    return 0;
                }
                zzed zzedVar5 = new zzed(this.zzo);
                zzacwVar.zzi(zzedVar5.zzN(), 0, this.zzo);
                if (zzedVar5.zzb() < 16) {
                    j = 0;
                } else {
                    int zzd = zzedVar5.zzd();
                    zzedVar5.zzM(8);
                    long zzi6 = zzedVar5.zzi();
                    long j9 = this.zzm;
                    j = zzi6 > j9 ? 0L : 8 + j9;
                    zzedVar5.zzL(zzd);
                }
                while (zzedVar5.zzb() >= 16) {
                    int zzi7 = zzedVar5.zzi();
                    int zzi8 = zzedVar5.zzi();
                    long zzi9 = zzedVar5.zzi() + j;
                    zzedVar5.zzM(4);
                    zzaeq zzg2 = zzg(zzi7);
                    if (zzg2 != null) {
                        zzg2.zzb(zzi9, (zzi8 & 16) == 16);
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
            zzacwVar.zzk((int) (j3 - zzf));
        }
        z4 = false;
        this.zzj = -1L;
        if (!z4) {
        }
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
