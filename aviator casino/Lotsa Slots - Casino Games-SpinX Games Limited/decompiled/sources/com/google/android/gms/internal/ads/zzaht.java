package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaht implements com.google.android.gms.internal.ads.zzafy {
    private final com.google.android.gms.internal.ads.zzet zza;
    private final com.google.android.gms.internal.ads.zzahs zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.ads.zzanj zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzagb zzf;
    private com.google.android.gms.internal.ads.zzahu zzg;
    private long zzh;
    private com.google.android.gms.internal.ads.zzahw[] zzi;
    private long zzj;
    private com.google.android.gms.internal.ads.zzahw zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @java.lang.Deprecated
    public zzaht() {
        this(1, com.google.android.gms.internal.ads.zzanj.zza);
    }

    private final com.google.android.gms.internal.ads.zzahw zzi(int i) {
        for (com.google.android.gms.internal.ads.zzahw zzahwVar : this.zzi) {
            if (zzahwVar.zzc(i)) {
                return zzahwVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        zzafzVar.zzi(zzetVar.zzi(), 0, 12);
        zzetVar.zzh(0);
        if (zzetVar.zzC() != 1179011410) {
            return false;
        }
        zzetVar.zzk(4);
        return zzetVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zze = 0;
        if (this.zzc) {
            zzagbVar = new com.google.android.gms.internal.ads.zzanm(zzagbVar, this.zzd);
        }
        this.zzf = zzagbVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        for (com.google.android.gms.internal.ads.zzahw zzahwVar : this.zzi) {
            zzahwVar.zzf(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzahw[] zzh() {
        return this.zzi;
    }

    public zzaht(int i, com.google.android.gms.internal.ads.zzanj zzanjVar) {
        this.zzd = zzanjVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new com.google.android.gms.internal.ads.zzet(12);
        this.zzb = new com.google.android.gms.internal.ads.zzahs(null);
        this.zzf = new com.google.android.gms.internal.ads.zzagx();
        this.zzi = new com.google.android.gms.internal.ads.zzahw[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        boolean z;
        int i;
        long j;
        long j2 = this.zzj;
        int i2 = 0;
        if (j2 != -1) {
            long zzn = zzafzVar.zzn();
            if (j2 < zzn || j2 > android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE + zzn) {
                zzagyVar.zza = j2;
                z = true;
                this.zzj = -1L;
                if (!z) {
                    return 1;
                }
                int i3 = this.zze;
                com.google.android.gms.internal.ads.zzahw zzahwVar = null;
                if (i3 == 0) {
                    if (!zza(zzafzVar)) {
                        throw com.google.android.gms.internal.ads.zzat.zzb("AVI Header List not found", null);
                    }
                    zzafzVar.zzf(12);
                    this.zze = 1;
                    return 0;
                }
                if (i3 == 1) {
                    com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
                    zzafzVar.zzc(zzetVar.zzi(), 0, 12);
                    zzetVar.zzh(0);
                    com.google.android.gms.internal.ads.zzahs zzahsVar = this.zzb;
                    zzahsVar.zza(zzetVar);
                    int i4 = zzahsVar.zza;
                    if (i4 != 1414744396) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 22);
                        sb.append("LIST expected, found: ");
                        sb.append(i4);
                        throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
                    }
                    int zzC = zzetVar.zzC();
                    if (zzC == 1819436136) {
                        this.zzl = zzahsVar.zzb;
                        this.zze = 2;
                        return 0;
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzC).length() + 22);
                    sb2.append("hdrl expected, found: ");
                    sb2.append(zzC);
                    throw com.google.android.gms.internal.ads.zzat.zzb(sb2.toString(), null);
                }
                if (i3 == 2) {
                    int i5 = this.zzl - 4;
                    com.google.android.gms.internal.ads.zzet zzetVar2 = new com.google.android.gms.internal.ads.zzet(i5);
                    zzafzVar.zzc(zzetVar2.zzi(), 0, i5);
                    com.google.android.gms.internal.ads.zzahx zzb = com.google.android.gms.internal.ads.zzahx.zzb(1819436136, zzetVar2);
                    if (zzb.zza() != 1819436136) {
                        int zza = zzb.zza();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 28);
                        sb3.append("Unexpected header list type ");
                        sb3.append(zza);
                        throw com.google.android.gms.internal.ads.zzat.zzb(sb3.toString(), null);
                    }
                    com.google.android.gms.internal.ads.zzahu zzahuVar = (com.google.android.gms.internal.ads.zzahu) zzb.zzc(com.google.android.gms.internal.ads.zzahu.class);
                    if (zzahuVar == null) {
                        throw com.google.android.gms.internal.ads.zzat.zzb("AviHeader not found", null);
                    }
                    this.zzg = zzahuVar;
                    this.zzh = zzahuVar.zzc * zzahuVar.zza;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.google.android.gms.internal.ads.zzgwm zzgwmVar = zzb.zza;
                    int size = zzgwmVar.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size) {
                        com.google.android.gms.internal.ads.zzahq zzahqVar = (com.google.android.gms.internal.ads.zzahq) zzgwmVar.get(i6);
                        if (zzahqVar.zza() == 1819440243) {
                            com.google.android.gms.internal.ads.zzahx zzahxVar = (com.google.android.gms.internal.ads.zzahx) zzahqVar;
                            int i8 = i7 + 1;
                            com.google.android.gms.internal.ads.zzahv zzahvVar = (com.google.android.gms.internal.ads.zzahv) zzahxVar.zzc(com.google.android.gms.internal.ads.zzahv.class);
                            com.google.android.gms.internal.ads.zzahy zzahyVar = (com.google.android.gms.internal.ads.zzahy) zzahxVar.zzc(com.google.android.gms.internal.ads.zzahy.class);
                            if (zzahvVar == null) {
                                com.google.android.gms.internal.ads.zzeg.zzc("AviExtractor", "Missing Stream Header");
                            } else if (zzahyVar == null) {
                                com.google.android.gms.internal.ads.zzeg.zzc("AviExtractor", "Missing Stream Format");
                            } else {
                                i = i6;
                                long zzd = zzahvVar.zzd();
                                com.google.android.gms.internal.ads.zzv zzvVar = zzahyVar.zza;
                                com.google.android.gms.internal.ads.zzt zza2 = zzvVar.zza();
                                zza2.zzb(i7);
                                int i9 = zzahvVar.zze;
                                if (i9 != 0) {
                                    zza2.zzp(i9);
                                }
                                com.google.android.gms.internal.ads.zzahz zzahzVar = (com.google.android.gms.internal.ads.zzahz) zzahxVar.zzc(com.google.android.gms.internal.ads.zzahz.class);
                                if (zzahzVar != null) {
                                    zza2.zzc(zzahzVar.zza);
                                }
                                int zzf = com.google.android.gms.internal.ads.zzas.zzf(zzvVar.zzp);
                                if (zzf != 1) {
                                    if (zzf == 2) {
                                        zzf = 2;
                                    } else {
                                        zzahwVar = null;
                                        if (zzahwVar != null) {
                                            arrayList.add(zzahwVar);
                                        }
                                        i7 = i8;
                                    }
                                }
                                com.google.android.gms.internal.ads.zzahk zzu = this.zzf.zzu(i7, zzf);
                                zzu.zzA(zza2.zzO());
                                zzu.zzO(zzd);
                                this.zzh = java.lang.Math.max(this.zzh, zzd);
                                zzahwVar = new com.google.android.gms.internal.ads.zzahw(i7, zzahvVar, zzu);
                                if (zzahwVar != null) {
                                }
                                i7 = i8;
                            }
                            i = i6;
                            if (zzahwVar != null) {
                            }
                            i7 = i8;
                        } else {
                            i = i6;
                        }
                        i6 = i + 1;
                        i2 = 0;
                        zzahwVar = null;
                    }
                    this.zzi = (com.google.android.gms.internal.ads.zzahw[]) arrayList.toArray(new com.google.android.gms.internal.ads.zzahw[i2]);
                    this.zzf.zzv();
                    this.zze = 3;
                    return i2;
                }
                if (i3 == 3) {
                    long j3 = this.zzm;
                    if (j3 != -1 && zzafzVar.zzn() != j3) {
                        this.zzj = j3;
                        return 0;
                    }
                    com.google.android.gms.internal.ads.zzet zzetVar3 = this.zza;
                    zzafzVar.zzi(zzetVar3.zzi(), 0, 12);
                    zzafzVar.zzl();
                    zzetVar3.zzh(0);
                    com.google.android.gms.internal.ads.zzahs zzahsVar2 = this.zzb;
                    zzahsVar2.zza(zzetVar3);
                    int zzC2 = zzetVar3.zzC();
                    int i10 = zzahsVar2.zza;
                    if (i10 == 1179011410) {
                        zzafzVar.zzf(12);
                        return 0;
                    }
                    if (i10 != 1414744396 || zzC2 != 1769369453) {
                        this.zzj = zzafzVar.zzn() + zzahsVar2.zzb + 8;
                        return 0;
                    }
                    long zzn2 = zzafzVar.zzn();
                    this.zzm = zzn2;
                    long j4 = zzn2 + zzahsVar2.zzb + 8;
                    this.zzn = j4;
                    if (!this.zzp) {
                        com.google.android.gms.internal.ads.zzahu zzahuVar2 = this.zzg;
                        zzahuVar2.getClass();
                        if ((zzahuVar2.zzb & 16) == 16) {
                            this.zze = 4;
                            this.zzj = j4;
                            return 0;
                        }
                        this.zzf.zzw(new com.google.android.gms.internal.ads.zzaha(this.zzh, 0L));
                        this.zzp = true;
                    }
                    this.zzj = zzafzVar.zzn() + 12;
                    this.zze = 6;
                    return 0;
                }
                if (i3 == 4) {
                    com.google.android.gms.internal.ads.zzet zzetVar4 = this.zza;
                    zzafzVar.zzc(zzetVar4.zzi(), 0, 8);
                    zzetVar4.zzh(0);
                    int zzC3 = zzetVar4.zzC();
                    int zzC4 = zzetVar4.zzC();
                    if (zzC3 == 829973609) {
                        this.zze = 5;
                        this.zzo = zzC4;
                    } else {
                        this.zzj = zzafzVar.zzn() + zzC4;
                    }
                    return 0;
                }
                if (i3 == 5) {
                    com.google.android.gms.internal.ads.zzet zzetVar5 = new com.google.android.gms.internal.ads.zzet(this.zzo);
                    zzafzVar.zzc(zzetVar5.zzi(), 0, this.zzo);
                    if (zzetVar5.zzd() < 16) {
                        j = 0;
                    } else {
                        int zzg = zzetVar5.zzg();
                        zzetVar5.zzk(8);
                        long zzC5 = zzetVar5.zzC();
                        long j5 = this.zzm;
                        j = zzC5 > j5 ? 0L : j5 + 8;
                        zzetVar5.zzh(zzg);
                    }
                    while (zzetVar5.zzd() >= 16) {
                        int zzC6 = zzetVar5.zzC();
                        int zzC7 = zzetVar5.zzC();
                        long zzC8 = zzetVar5.zzC() + j;
                        zzetVar5.zzk(4);
                        com.google.android.gms.internal.ads.zzahw zzi = zzi(zzC6);
                        if (zzi != null) {
                            zzi.zza(zzC8, (zzC7 & 16) == 16);
                        }
                    }
                    for (com.google.android.gms.internal.ads.zzahw zzahwVar2 : this.zzi) {
                        zzahwVar2.zzb();
                    }
                    this.zzp = true;
                    if (this.zzi.length == 0) {
                        this.zzf.zzw(new com.google.android.gms.internal.ads.zzaha(this.zzh, 0L));
                    } else {
                        this.zzf.zzw(new com.google.android.gms.internal.ads.zzahr(this, this.zzh));
                    }
                    this.zze = 6;
                    this.zzj = this.zzm;
                    return 0;
                }
                if (zzafzVar.zzn() >= this.zzn) {
                    return -1;
                }
                com.google.android.gms.internal.ads.zzahw zzahwVar3 = this.zzk;
                if (zzahwVar3 != null) {
                    if (!zzahwVar3.zze(zzafzVar)) {
                        return 0;
                    }
                    this.zzk = null;
                    return 0;
                }
                if ((zzafzVar.zzn() & 1) == 1) {
                    zzafzVar.zzf(1);
                }
                com.google.android.gms.internal.ads.zzet zzetVar6 = this.zza;
                zzafzVar.zzi(zzetVar6.zzi(), 0, 12);
                zzetVar6.zzh(0);
                int zzC9 = zzetVar6.zzC();
                if (zzC9 == 1414744396) {
                    zzetVar6.zzh(8);
                    zzafzVar.zzf(zzetVar6.zzC() != 1769369453 ? 8 : 12);
                    zzafzVar.zzl();
                    return 0;
                }
                int zzC10 = zzetVar6.zzC();
                if (zzC9 == 1263424842) {
                    this.zzj = zzafzVar.zzn() + zzC10 + 8;
                    return 0;
                }
                zzafzVar.zzf(8);
                zzafzVar.zzl();
                com.google.android.gms.internal.ads.zzahw zzi2 = zzi(zzC9);
                if (zzi2 == null) {
                    this.zzj = zzafzVar.zzn() + zzC10;
                    return 0;
                }
                zzi2.zzd(zzC10);
                this.zzk = zzi2;
                return 0;
            }
            zzafzVar.zzf((int) (j2 - zzn));
        }
        z = false;
        this.zzj = -1L;
        if (!z) {
        }
    }
}
