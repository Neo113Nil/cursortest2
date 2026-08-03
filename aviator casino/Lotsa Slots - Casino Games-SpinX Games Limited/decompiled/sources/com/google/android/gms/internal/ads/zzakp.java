package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzakp implements com.google.android.gms.internal.ads.zzafy {
    public static final /* synthetic */ int zza = 0;
    private final com.google.android.gms.internal.ads.zzet zzb;
    private final com.google.android.gms.internal.ads.zzagv zzc;
    private final com.google.android.gms.internal.ads.zzagr zzd;
    private final com.google.android.gms.internal.ads.zzagt zze;
    private final com.google.android.gms.internal.ads.zzahk zzf;
    private com.google.android.gms.internal.ads.zzagb zzg;
    private com.google.android.gms.internal.ads.zzahk zzh;
    private com.google.android.gms.internal.ads.zzahk zzi;
    private int zzj;
    private com.google.android.gms.internal.ads.zzap zzk;
    private com.google.android.gms.internal.ads.zzap zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private com.google.android.gms.internal.ads.zzakt zzr;
    private boolean zzs;

    static {
        int i = com.google.android.gms.internal.ads.zzakn.zza;
    }

    public zzakp() {
        throw null;
    }

    public zzakp(int i) {
        this.zzb = new com.google.android.gms.internal.ads.zzet(10);
        this.zzc = new com.google.android.gms.internal.ads.zzagv();
        this.zzd = new com.google.android.gms.internal.ads.zzagr();
        this.zzm = -9223372036854775807L;
        this.zze = new com.google.android.gms.internal.ads.zzagt();
        com.google.android.gms.internal.ads.zzafv zzafvVar = new com.google.android.gms.internal.ads.zzafv();
        this.zzf = zzafvVar;
        this.zzi = zzafvVar;
        this.zzp = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0127  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzi(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        int i;
        com.google.android.gms.internal.ads.zzagr zzagrVar;
        int i2;
        com.google.android.gms.internal.ads.zzakt zzakkVar;
        int i3;
        int i4;
        com.google.android.gms.internal.ads.zzap zzapVar;
        long zzn;
        com.google.android.gms.internal.ads.zzajr zzajrVar;
        com.google.android.gms.internal.ads.zzakm zze;
        com.google.android.gms.internal.ads.zzakt zzaktVar;
        com.google.android.gms.internal.ads.zzap zzapVar2;
        if (this.zzj == 0) {
            try {
                zzk(zzafzVar, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.zzr == null) {
            com.google.android.gms.internal.ads.zzagv zzagvVar = this.zzc;
            com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(zzagvVar.zzc);
            zzafzVar.zzi(zzetVar.zzi(), 0, zzagvVar.zzc);
            int i5 = 21;
            if ((zzagvVar.zza & 1) != 0) {
                if (zzagvVar.zze != 1) {
                    i5 = 36;
                }
            } else if (zzagvVar.zze == 1) {
                i5 = 13;
            }
            if (zzetVar.zze() >= i5 + 4) {
                zzetVar.zzh(i5);
                i = zzetVar.zzB();
                if (i != 1483304551) {
                    if (i == 1231971951) {
                        i = 1231971951;
                    }
                }
                if (i != 1231971951) {
                    if (i == 1447187017) {
                        zzakkVar = com.google.android.gms.internal.ads.zzaku.zze(zzafzVar.zzo(), zzafzVar.zzn(), zzagvVar, zzetVar);
                        zzafzVar.zzf(zzagvVar.zzc);
                        zzapVar = this.zzk;
                        zzn = zzafzVar.zzn();
                        if (zzapVar == null) {
                            com.google.android.gms.internal.ads.zzajt zzajtVar = (com.google.android.gms.internal.ads.zzajt) zzapVar.zzc(com.google.android.gms.internal.ads.zzajt.class, com.google.android.gms.internal.ads.zzako.zza);
                            zze = com.google.android.gms.internal.ads.zzakm.zze(zzn, zzajrVar, zzajtVar != null ? -9223372036854775807L : com.google.android.gms.internal.ads.zzfl.zzs(java.lang.Long.parseLong((java.lang.String) zzajtVar.zzb.get(0))));
                            if (this.zzs) {
                            }
                            this.zzr = zzaktVar;
                            this.zzg.zzw(zzaktVar);
                            zzapVar2 = this.zzk;
                            if (zzapVar2 == null) {
                            }
                            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                            zztVar.zzn("audio/mpeg");
                            zztVar.zzo(zzagvVar.zzb);
                            zztVar.zzp(4096);
                            zztVar.zzG(zzagvVar.zze);
                            zztVar.zzH(zzagvVar.zzd);
                            com.google.android.gms.internal.ads.zzagr zzagrVar2 = this.zzd;
                            zztVar.zzJ(zzagrVar2.zza);
                            zztVar.zzK(zzagrVar2.zzb);
                            zztVar.zzl(zzapVar2);
                            if (this.zzr.zzh() != -2147483647) {
                            }
                            this.zzi.zzA(zztVar.zzO());
                            this.zzo = zzafzVar.zzn();
                        }
                        zze = null;
                        if (this.zzs) {
                        }
                        this.zzr = zzaktVar;
                        this.zzg.zzw(zzaktVar);
                        zzapVar2 = this.zzk;
                        if (zzapVar2 == null) {
                        }
                        com.google.android.gms.internal.ads.zzt zztVar2 = new com.google.android.gms.internal.ads.zzt();
                        zztVar2.zzn("audio/mpeg");
                        zztVar2.zzo(zzagvVar.zzb);
                        zztVar2.zzp(4096);
                        zztVar2.zzG(zzagvVar.zze);
                        zztVar2.zzH(zzagvVar.zzd);
                        com.google.android.gms.internal.ads.zzagr zzagrVar22 = this.zzd;
                        zztVar2.zzJ(zzagrVar22.zza);
                        zztVar2.zzK(zzagrVar22.zzb);
                        zztVar2.zzl(zzapVar2);
                        if (this.zzr.zzh() != -2147483647) {
                        }
                        this.zzi.zzA(zztVar2.zzO());
                        this.zzo = zzafzVar.zzn();
                    } else if (i != 1483304551) {
                        zzafzVar.zzl();
                        zzakkVar = null;
                        zzapVar = this.zzk;
                        zzn = zzafzVar.zzn();
                        if (zzapVar == null || (zzajrVar = (com.google.android.gms.internal.ads.zzajr) zzapVar.zzc(com.google.android.gms.internal.ads.zzajr.class, com.google.android.gms.internal.ads.zzgtn.zza())) == null) {
                            zze = null;
                        } else {
                            com.google.android.gms.internal.ads.zzajt zzajtVar2 = (com.google.android.gms.internal.ads.zzajt) zzapVar.zzc(com.google.android.gms.internal.ads.zzajt.class, com.google.android.gms.internal.ads.zzako.zza);
                            zze = com.google.android.gms.internal.ads.zzakm.zze(zzn, zzajrVar, zzajtVar2 != null ? -9223372036854775807L : com.google.android.gms.internal.ads.zzfl.zzs(java.lang.Long.parseLong((java.lang.String) zzajtVar2.zzb.get(0))));
                        }
                        if (this.zzs) {
                            if (zze != null) {
                                zzakkVar = zze;
                            } else if (zzakkVar == null) {
                                zzakkVar = null;
                            }
                            if (zzakkVar == null) {
                                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzb;
                                zzafzVar.zzi(zzetVar2.zzi(), 0, 4);
                                zzetVar2.zzh(0);
                                zzagvVar.zza(zzetVar2.zzB());
                                zzaktVar = new com.google.android.gms.internal.ads.zzakk(zzafzVar.zzo(), zzafzVar.zzn(), zzagvVar, false);
                            } else {
                                zzaktVar = zzakkVar;
                            }
                            this.zzh.zzO(zzaktVar.zza());
                        } else {
                            zzaktVar = new com.google.android.gms.internal.ads.zzaks();
                        }
                        this.zzr = zzaktVar;
                        this.zzg.zzw(zzaktVar);
                        zzapVar2 = this.zzk;
                        if (zzapVar2 == null) {
                            com.google.android.gms.internal.ads.zzap zzapVar3 = this.zzl;
                            if (zzapVar3 != null) {
                                zzapVar2 = zzapVar2.zzf(zzapVar3);
                            }
                        } else {
                            zzapVar2 = this.zzl;
                        }
                        com.google.android.gms.internal.ads.zzt zztVar22 = new com.google.android.gms.internal.ads.zzt();
                        zztVar22.zzn("audio/mpeg");
                        zztVar22.zzo(zzagvVar.zzb);
                        zztVar22.zzp(4096);
                        zztVar22.zzG(zzagvVar.zze);
                        zztVar22.zzH(zzagvVar.zzd);
                        com.google.android.gms.internal.ads.zzagr zzagrVar222 = this.zzd;
                        zztVar22.zzJ(zzagrVar222.zza);
                        zztVar22.zzK(zzagrVar222.zzb);
                        zztVar22.zzl(zzapVar2);
                        if (this.zzr.zzh() != -2147483647) {
                            zztVar22.zzi(this.zzr.zzh());
                        }
                        this.zzi.zzA(zztVar22.zzO());
                        this.zzo = zzafzVar.zzn();
                    }
                }
                com.google.android.gms.internal.ads.zzakv zza2 = com.google.android.gms.internal.ads.zzakv.zza(zzagvVar, zzetVar);
                zzagrVar = this.zzd;
                if (!zzagrVar.zzb() && (i3 = zza2.zze) != -1 && (i4 = zza2.zzf) != -1) {
                    zzagrVar.zza = i3;
                    zzagrVar.zzb = i4;
                }
                com.google.android.gms.internal.ads.zzakr zzakrVar = zza2.zzd;
                this.zzl = zzakrVar != null ? new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, zzakrVar) : null;
                long zzn2 = zzafzVar.zzn();
                if (zzafzVar.zzo() != -1) {
                    long j = zza2.zzc;
                    if (j != -1) {
                        long j2 = j + zzn2;
                        if (zzafzVar.zzo() != j2) {
                            long zzo = zzafzVar.zzo();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzo).length() + 53 + java.lang.String.valueOf(j2).length() + 20);
                            sb.append("Data size mismatch between stream (");
                            sb.append(zzo);
                            sb.append(") and Xing frame (");
                            sb.append(j2);
                            sb.append("), using Xing value.");
                            com.google.android.gms.internal.ads.zzeg.zzb("Mp3Extractor", sb.toString());
                        }
                    }
                }
                zzafzVar.zzf(zzagvVar.zzc);
                if (i == 1483304551) {
                    zzakkVar = com.google.android.gms.internal.ads.zzakw.zze(zza2, zzn2);
                } else {
                    long zzo2 = zzafzVar.zzo();
                    long zzb = zza2.zzb();
                    if (zzb != -9223372036854775807L) {
                        long j3 = zza2.zzc;
                        if (j3 != -1) {
                            zzo2 = zzn2 + j3;
                            i2 = zza2.zza.zzc;
                        } else if (zzo2 != -1) {
                            j3 = zzo2 - zzn2;
                            i2 = zza2.zza.zzc;
                        }
                        long j4 = j3 - i2;
                        zzakkVar = new com.google.android.gms.internal.ads.zzakk(zzo2, zzn2 + zza2.zza.zzc, com.google.android.gms.internal.ads.zzhah.zza(com.google.android.gms.internal.ads.zzfl.zzv(j4, 8000000L, zzb, java.math.RoundingMode.HALF_UP)), com.google.android.gms.internal.ads.zzhah.zza(com.google.android.gms.internal.ads.zzhab.zza(j4, zza2.zzb, java.math.RoundingMode.HALF_UP)), false);
                    }
                    zzakkVar = null;
                }
                zzapVar = this.zzk;
                zzn = zzafzVar.zzn();
                if (zzapVar == null) {
                }
                zze = null;
                if (this.zzs) {
                }
                this.zzr = zzaktVar;
                this.zzg.zzw(zzaktVar);
                zzapVar2 = this.zzk;
                if (zzapVar2 == null) {
                }
                com.google.android.gms.internal.ads.zzt zztVar222 = new com.google.android.gms.internal.ads.zzt();
                zztVar222.zzn("audio/mpeg");
                zztVar222.zzo(zzagvVar.zzb);
                zztVar222.zzp(4096);
                zztVar222.zzG(zzagvVar.zze);
                zztVar222.zzH(zzagvVar.zzd);
                com.google.android.gms.internal.ads.zzagr zzagrVar2222 = this.zzd;
                zztVar222.zzJ(zzagrVar2222.zza);
                zztVar222.zzK(zzagrVar2222.zzb);
                zztVar222.zzl(zzapVar2);
                if (this.zzr.zzh() != -2147483647) {
                }
                this.zzi.zzA(zztVar222.zzO());
                this.zzo = zzafzVar.zzn();
            }
            if (zzetVar.zze() >= 40) {
                zzetVar.zzh(36);
                if (zzetVar.zzB() == 1447187017) {
                    i = 1447187017;
                    if (i != 1231971951) {
                    }
                    com.google.android.gms.internal.ads.zzakv zza22 = com.google.android.gms.internal.ads.zzakv.zza(zzagvVar, zzetVar);
                    zzagrVar = this.zzd;
                    if (!zzagrVar.zzb()) {
                        zzagrVar.zza = i3;
                        zzagrVar.zzb = i4;
                    }
                    com.google.android.gms.internal.ads.zzakr zzakrVar2 = zza22.zzd;
                    this.zzl = zzakrVar2 != null ? new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, zzakrVar2) : null;
                    long zzn22 = zzafzVar.zzn();
                    if (zzafzVar.zzo() != -1) {
                    }
                    zzafzVar.zzf(zzagvVar.zzc);
                    if (i == 1483304551) {
                    }
                    zzapVar = this.zzk;
                    zzn = zzafzVar.zzn();
                    if (zzapVar == null) {
                    }
                    zze = null;
                    if (this.zzs) {
                    }
                    this.zzr = zzaktVar;
                    this.zzg.zzw(zzaktVar);
                    zzapVar2 = this.zzk;
                    if (zzapVar2 == null) {
                    }
                    com.google.android.gms.internal.ads.zzt zztVar2222 = new com.google.android.gms.internal.ads.zzt();
                    zztVar2222.zzn("audio/mpeg");
                    zztVar2222.zzo(zzagvVar.zzb);
                    zztVar2222.zzp(4096);
                    zztVar2222.zzG(zzagvVar.zze);
                    zztVar2222.zzH(zzagvVar.zzd);
                    com.google.android.gms.internal.ads.zzagr zzagrVar22222 = this.zzd;
                    zztVar2222.zzJ(zzagrVar22222.zza);
                    zztVar2222.zzK(zzagrVar22222.zzb);
                    zztVar2222.zzl(zzapVar2);
                    if (this.zzr.zzh() != -2147483647) {
                    }
                    this.zzi.zzA(zztVar2222.zzO());
                    this.zzo = zzafzVar.zzn();
                }
            }
            i = 0;
            if (i != 1231971951) {
            }
            com.google.android.gms.internal.ads.zzakv zza222 = com.google.android.gms.internal.ads.zzakv.zza(zzagvVar, zzetVar);
            zzagrVar = this.zzd;
            if (!zzagrVar.zzb()) {
            }
            com.google.android.gms.internal.ads.zzakr zzakrVar22 = zza222.zzd;
            this.zzl = zzakrVar22 != null ? new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, zzakrVar22) : null;
            long zzn222 = zzafzVar.zzn();
            if (zzafzVar.zzo() != -1) {
            }
            zzafzVar.zzf(zzagvVar.zzc);
            if (i == 1483304551) {
            }
            zzapVar = this.zzk;
            zzn = zzafzVar.zzn();
            if (zzapVar == null) {
            }
            zze = null;
            if (this.zzs) {
            }
            this.zzr = zzaktVar;
            this.zzg.zzw(zzaktVar);
            zzapVar2 = this.zzk;
            if (zzapVar2 == null) {
            }
            com.google.android.gms.internal.ads.zzt zztVar22222 = new com.google.android.gms.internal.ads.zzt();
            zztVar22222.zzn("audio/mpeg");
            zztVar22222.zzo(zzagvVar.zzb);
            zztVar22222.zzp(4096);
            zztVar22222.zzG(zzagvVar.zze);
            zztVar22222.zzH(zzagvVar.zzd);
            com.google.android.gms.internal.ads.zzagr zzagrVar222222 = this.zzd;
            zztVar22222.zzJ(zzagrVar222222.zza);
            zztVar22222.zzK(zzagrVar222222.zzb);
            zztVar22222.zzl(zzapVar2);
            if (this.zzr.zzh() != -2147483647) {
            }
            this.zzi.zzA(zztVar22222.zzO());
            this.zzo = zzafzVar.zzn();
        } else {
            long j5 = this.zzo;
            if (j5 != 0) {
                long zzn3 = zzafzVar.zzn();
                if (zzn3 < j5) {
                    zzafzVar.zzf((int) (j5 - zzn3));
                }
            }
        }
        int i6 = this.zzq;
        if (i6 == 0) {
            zzafzVar.zzl();
            if (!zzl(zzafzVar)) {
                com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzb;
                zzetVar3.zzh(0);
                int zzB = zzetVar3.zzB();
                if (!zzn(zzB, this.zzj) || com.google.android.gms.internal.ads.zzagw.zza(zzB) == -1) {
                    zzafzVar.zzf(1);
                    this.zzj = 0;
                    return 0;
                }
                com.google.android.gms.internal.ads.zzagv zzagvVar2 = this.zzc;
                zzagvVar2.zza(zzB);
                if (this.zzm == -9223372036854775807L) {
                    this.zzm = this.zzr.zzf(zzafzVar.zzn());
                }
                i6 = zzagvVar2.zzc;
                this.zzq = i6;
                this.zzp = zzafzVar.zzn() + i6;
                com.google.android.gms.internal.ads.zzakt zzaktVar2 = this.zzr;
                if (zzaktVar2 instanceof com.google.android.gms.internal.ads.zzakl) {
                    zzj(this.zzn + zzagvVar2.zzg);
                    throw null;
                }
            }
            return -1;
        }
        int zza3 = this.zzi.zza(zzafzVar, i6, true);
        if (zza3 != -1) {
            int i7 = this.zzq - zza3;
            this.zzq = i7;
            if (i7 <= 0) {
                this.zzi.zze(zzj(this.zzn), 1, this.zzc.zzc, 0, null);
                this.zzn += r1.zzg;
                this.zzq = 0;
                return 0;
            }
            return 0;
        }
        return -1;
    }

    private final long zzj(long j) {
        return this.zzm + ((j * 1000000) / this.zzc.zzd);
    }

    private final boolean zzk(com.google.android.gms.internal.ads.zzafz zzafzVar, boolean z) throws java.io.IOException {
        int i;
        int i2;
        int zza2;
        zzafzVar.zzl();
        if (zzafzVar.zzn() == 0) {
            com.google.android.gms.internal.ads.zzap zza3 = this.zze.zza(zzafzVar, null, 131072);
            this.zzk = zza3;
            if (zza3 != null) {
                this.zzd.zza(zza3);
            }
            i2 = (int) zzafzVar.zzm();
            if (!z) {
                zzafzVar.zzf(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!zzl(zzafzVar)) {
                com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
                zzetVar.zzh(0);
                int zzB = zzetVar.zzB();
                if ((i == 0 || zzn(zzB, i)) && (zza2 = com.google.android.gms.internal.ads.zzagw.zza(zzB)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(zzB);
                        i = zzB;
                    }
                    zzafzVar.zzk(zza2 - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        zzm();
                        throw new java.io.EOFException();
                    }
                    if (z) {
                        zzafzVar.zzl();
                        zzafzVar.zzk(i2 + i5);
                    } else {
                        zzafzVar.zzf(1);
                    }
                    i4 = i5;
                    i = 0;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                zzm();
                throw new java.io.EOFException();
            }
        }
        if (z) {
            zzafzVar.zzf(i2 + i4);
        } else {
            zzafzVar.zzl();
        }
        this.zzj = i;
        return true;
    }

    private final boolean zzl(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzakt zzaktVar = this.zzr;
        if (zzaktVar != null) {
            long zzg = zzaktVar.zzg();
            if (zzg != -1 && zzafzVar.zzm() > zzg - 4) {
                return true;
            }
        }
        try {
            return !zzafzVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (java.io.EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        com.google.android.gms.internal.ads.zzakt zzaktVar = this.zzr;
        if ((zzaktVar instanceof com.google.android.gms.internal.ads.zzakk) && zzaktVar.zzb()) {
            long j = this.zzp;
            if (j == -1 || j == this.zzr.zzg()) {
                return;
            }
            this.zzr = ((com.google.android.gms.internal.ads.zzakk) this.zzr).zzi(this.zzp);
            com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzg;
            zzagbVar.getClass();
            zzagbVar.zzw(this.zzr);
            this.zzh.getClass();
            this.zzr.zza();
        }
    }

    private static boolean zzn(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        return zzk(zzafzVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zzg = zzagbVar;
        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(0, 1);
        this.zzh = zzu;
        this.zzi = zzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        this.zzh.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int zzi = zzi(zzafzVar);
        if (zzi == -1 && (this.zzr instanceof com.google.android.gms.internal.ads.zzakl)) {
            if (this.zzr.zza() != zzj(this.zzn)) {
                throw null;
            }
        }
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        this.zzj = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzq = 0;
        this.zzp = -1L;
        com.google.android.gms.internal.ads.zzakt zzaktVar = this.zzr;
        if (zzaktVar instanceof com.google.android.gms.internal.ads.zzakl) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    public final void zzh() {
        this.zzs = true;
    }
}
