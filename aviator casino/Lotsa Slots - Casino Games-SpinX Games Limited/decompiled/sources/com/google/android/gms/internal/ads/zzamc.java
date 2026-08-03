package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzamc implements com.google.android.gms.internal.ads.zzafy {
    public static final /* synthetic */ int zza = 0;
    private com.google.android.gms.internal.ads.zzagb zzA;
    private com.google.android.gms.internal.ads.zzamb[] zzB;
    private long[][] zzC;
    private int zzD;
    private final com.google.android.gms.internal.ads.zzanj zzb;
    private final int zzc;
    private final com.google.android.gms.internal.ads.zzet zzd;
    private final com.google.android.gms.internal.ads.zzet zze;
    private final com.google.android.gms.internal.ads.zzet zzf;
    private final com.google.android.gms.internal.ads.zzet zzg;
    private final java.util.ArrayDeque zzh;
    private final com.google.android.gms.internal.ads.zzamg zzi;
    private final java.util.List zzj;
    private com.google.android.gms.internal.ads.zzgwm zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private com.google.android.gms.internal.ads.zzet zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    static {
        int i = com.google.android.gms.internal.ads.zzaly.zza;
    }

    @java.lang.Deprecated
    public zzamc() {
        this(com.google.android.gms.internal.ads.zzanj.zza, 16);
    }

    static /* synthetic */ long zzh(com.google.android.gms.internal.ads.zzaml zzamlVar, long j, long j2) {
        int zzl = zzl(zzamlVar, j);
        return zzl == -1 ? j2 : java.lang.Math.min(zzamlVar.zzc[zzl], j2);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(long j) throws com.google.android.gms.internal.ads.zzat {
        java.util.ArrayList arrayList;
        com.google.android.gms.internal.ads.zzap zzapVar;
        java.util.ArrayDeque arrayDeque;
        com.google.android.gms.internal.ads.zzap zzapVar2;
        int i;
        java.util.List list;
        java.util.ArrayList arrayList2;
        java.util.ArrayDeque arrayDeque2;
        int i2;
        com.google.android.gms.internal.ads.zzahk zzahkVar;
        java.lang.String str;
        int i3;
        int i4;
        long j2;
        long j3;
        int i5;
        int i6;
        int i7;
        com.google.android.gms.internal.ads.zzagr zzagrVar;
        int i8;
        java.util.ArrayList arrayList3;
        com.google.android.gms.internal.ads.zzfv zzfvVar;
        while (true) {
            java.util.ArrayDeque arrayDeque3 = this.zzh;
            if (arrayDeque3.isEmpty() || ((com.google.android.gms.internal.ads.zzfx) arrayDeque3.peek()).zza != j) {
                break;
            }
            com.google.android.gms.internal.ads.zzfx zzfxVar = (com.google.android.gms.internal.ads.zzfx) arrayDeque3.pop();
            if (zzfxVar.zzd == 1836019574) {
                com.google.android.gms.internal.ads.zzfx zzd = zzfxVar.zzd(1835365473);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (zzd != null) {
                    zzapVar = com.google.android.gms.internal.ads.zzalj.zze(zzd);
                    if (this.zzy) {
                        zzapVar.getClass();
                        com.google.android.gms.internal.ads.zzfv zzfvVar2 = (com.google.android.gms.internal.ads.zzfv) zzapVar.zzc(com.google.android.gms.internal.ads.zzfv.class, com.google.android.gms.internal.ads.zzalw.zza);
                        if (zzfvVar2 != null && zzfvVar2.zzb[0] == 0) {
                            this.zzz = this.zzx + 16;
                        }
                        com.google.android.gms.internal.ads.zzfv zzfvVar3 = (com.google.android.gms.internal.ads.zzfv) zzapVar.zzc(com.google.android.gms.internal.ads.zzfv.class, com.google.android.gms.internal.ads.zzalx.zza);
                        zzfvVar3.getClass();
                        java.util.List zzb = zzfvVar3.zzb();
                        java.util.ArrayList arrayList5 = new java.util.ArrayList(zzb.size());
                        for (int i9 = 0; i9 < zzb.size(); i9++) {
                            int intValue = ((java.lang.Integer) zzb.get(i9)).intValue();
                            arrayList5.add(java.lang.Integer.valueOf(intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? 0 : 4 : 3 : 2 : 1));
                        }
                        arrayList = arrayList5;
                    } else {
                        if (zzapVar != null && (this.zzc & 64) != 0 && (zzfvVar = (com.google.android.gms.internal.ads.zzfv) zzapVar.zzc(com.google.android.gms.internal.ads.zzfv.class, com.google.android.gms.internal.ads.zzalv.zza)) != null) {
                            long zzJ = new com.google.android.gms.internal.ads.zzet(zzfvVar.zzb).zzJ();
                            if (zzJ > 0) {
                                this.zzx = zzJ;
                                this.zzw = true;
                                arrayDeque = arrayDeque3;
                                arrayDeque.clear();
                                if (this.zzw) {
                                    this.zzl = 2;
                                }
                            }
                        }
                        arrayList = arrayList4;
                    }
                } else {
                    arrayList = arrayList4;
                    zzapVar = null;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                int i10 = this.zzD;
                com.google.android.gms.internal.ads.zzagr zzagrVar2 = new com.google.android.gms.internal.ads.zzagr();
                com.google.android.gms.internal.ads.zzfy zzc = zzfxVar.zzc(1969517665);
                if (zzc != null) {
                    com.google.android.gms.internal.ads.zzap zzc2 = com.google.android.gms.internal.ads.zzalj.zzc(zzc);
                    zzagrVar2.zza(zzc2);
                    zzapVar2 = zzc2;
                } else {
                    zzapVar2 = null;
                }
                com.google.android.gms.internal.ads.zzao[] zzaoVarArr = new com.google.android.gms.internal.ads.zzao[1];
                com.google.android.gms.internal.ads.zzfy zzc3 = zzfxVar.zzc(1836476516);
                zzc3.getClass();
                boolean z = 1 == i10;
                zzaoVarArr[0] = com.google.android.gms.internal.ads.zzalj.zzd(zzc3.zza);
                com.google.android.gms.internal.ads.zzap zzapVar3 = new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, zzaoVarArr);
                int i11 = this.zzc;
                com.google.android.gms.internal.ads.zzagr zzagrVar3 = zzagrVar2;
                java.util.ArrayList arrayList7 = arrayList6;
                java.util.ArrayList arrayList8 = arrayList;
                java.util.List zzb2 = com.google.android.gms.internal.ads.zzalj.zzb(zzfxVar, zzagrVar2, -9223372036854775807L, null, 1 == (i11 & 1), z, com.google.android.gms.internal.ads.zzalz.zza, false);
                if (this.zzy) {
                    com.google.android.gms.internal.ads.zzgtj.zzj(arrayList8.size() == zzb2.size(), java.lang.String.format(java.util.Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", java.lang.Integer.valueOf(arrayList8.size()), java.lang.Integer.valueOf(zzb2.size())));
                }
                java.lang.String zza2 = com.google.android.gms.internal.ads.zzalu.zza(zzb2);
                int i12 = 0;
                long j4 = -9223372036854775807L;
                int i13 = -1;
                int i14 = 0;
                while (i14 < zzb2.size()) {
                    com.google.android.gms.internal.ads.zzaml zzamlVar = (com.google.android.gms.internal.ads.zzaml) zzb2.get(i14);
                    int i15 = zzamlVar.zzb;
                    if (i15 == 0) {
                        arrayDeque2 = arrayDeque3;
                        list = zzb2;
                        i = i12;
                        i8 = i13;
                        i2 = i14;
                        zzagrVar = zzagrVar3;
                        str = zza2;
                        arrayList3 = arrayList7;
                    } else {
                        com.google.android.gms.internal.ads.zzami zzamiVar = zzamlVar.zza;
                        com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzA;
                        i = i12 + 1;
                        int i16 = zzamiVar.zzb;
                        com.google.android.gms.internal.ads.zzamb zzambVar = new com.google.android.gms.internal.ads.zzamb(zzamiVar, zzamlVar, zzagbVar.zzu(i12, i16));
                        long j5 = zzamiVar.zze;
                        if (j5 == -9223372036854775807L) {
                            j5 = zzamlVar.zzi;
                        }
                        list = zzb2;
                        com.google.android.gms.internal.ads.zzahk zzahkVar2 = zzambVar.zzc;
                        zzahkVar2.zzO(j5);
                        long max = java.lang.Math.max(j4, j5);
                        com.google.android.gms.internal.ads.zzv zzvVar = zzamiVar.zzg;
                        java.lang.String str2 = zzvVar.zzp;
                        int i17 = "audio/true-hd".equals(str2) ? zzamlVar.zze * 16 : zzamlVar.zze + 30;
                        com.google.android.gms.internal.ads.zzt zza3 = zzvVar.zza();
                        zza3.zzp(i17);
                        if (i16 == 2) {
                            int i18 = zzvVar.zzf;
                            if ((i11 & 8) != 0) {
                                i18 |= i13 == -1 ? 1 : 2;
                            }
                            if (this.zzy) {
                                arrayList2 = arrayList8;
                                zza3.zzh(((java.lang.Integer) arrayList2.get(i14)).intValue());
                                i18 |= 32768;
                            } else {
                                arrayList2 = arrayList8;
                            }
                            zza3.zzg(i18);
                            i16 = 2;
                        } else {
                            arrayList2 = arrayList8;
                        }
                        if (com.google.android.gms.internal.ads.zzas.zzb(str2)) {
                            arrayList8 = arrayList2;
                            boolean z2 = zzamlVar.zzj;
                            arrayDeque2 = arrayDeque3;
                            i2 = i14;
                            int min = java.lang.Math.min(!z2 ? zzamlVar.zzh.length : i15, 20);
                            com.google.android.gms.internal.ads.zzgtj.zzi(j5 != -9223372036854775807L);
                            zzahkVar = zzahkVar2;
                            str = zza2;
                            long min2 = java.lang.Math.min(j5, 10000000L);
                            i3 = i13;
                            int i19 = -1;
                            int i20 = 0;
                            int i21 = 0;
                            while (true) {
                                if (i20 >= min) {
                                    i4 = -1;
                                    break;
                                }
                                if (z2) {
                                    i5 = min;
                                    i6 = i20;
                                } else {
                                    i5 = min;
                                    i6 = zzamlVar.zzh[i20];
                                }
                                boolean z3 = z2;
                                long j6 = zzamlVar.zzf[i6];
                                if (j6 > min2) {
                                    i4 = -1;
                                    break;
                                }
                                if (j6 >= 0 && (i7 = zzamlVar.zzd[i6]) > i21) {
                                    i19 = i6;
                                    i21 = i7;
                                }
                                i20++;
                                min = i5;
                                z2 = z3;
                            }
                            j2 = i19 == i4 ? -9223372036854775807L : zzamlVar.zzf[i19];
                            j3 = -9223372036854775807L;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            zzahkVar = zzahkVar2;
                            arrayList8 = arrayList2;
                            i3 = i13;
                            i2 = i14;
                            j3 = -9223372036854775807L;
                            str = zza2;
                            j2 = -9223372036854775807L;
                        }
                        com.google.android.gms.internal.ads.zzap zzapVar4 = j2 != j3 ? new com.google.android.gms.internal.ads.zzap(j3, new com.google.android.gms.internal.ads.zzaiz(j2)) : null;
                        zzagrVar = zzagrVar3;
                        com.google.android.gms.internal.ads.zzalt.zzb(i16, zzagrVar, zza3);
                        com.google.android.gms.internal.ads.zzap zzapVar5 = zzvVar.zzl;
                        com.google.android.gms.internal.ads.zzap[] zzapVarArr = new com.google.android.gms.internal.ads.zzap[4];
                        java.util.List list2 = this.zzj;
                        zzapVarArr[0] = list2.isEmpty() ? null : new com.google.android.gms.internal.ads.zzap(list2);
                        zzapVarArr[1] = zzapVar2;
                        zzapVarArr[2] = zzapVar3;
                        zzapVarArr[3] = zzapVar4;
                        com.google.android.gms.internal.ads.zzalt.zza(i16, zzapVar, zza3, zzapVar5, zzapVarArr);
                        zza3.zzn(str);
                        if (java.util.Objects.equals(str2, "audio/mpeg")) {
                            zzambVar.zzf = zza3.zzO();
                        } else {
                            zzahkVar.zzA(zza3.zzO());
                        }
                        if (i16 == 2) {
                            i8 = i3;
                            if (i8 == -1) {
                                i8 = arrayList7.size();
                            }
                        } else {
                            i8 = i3;
                        }
                        arrayList3 = arrayList7;
                        arrayList3.add(zzambVar);
                        j4 = max;
                    }
                    i13 = i8;
                    zzagrVar3 = zzagrVar;
                    arrayList7 = arrayList3;
                    zza2 = str;
                    i14 = i2 + 1;
                    i12 = i;
                    zzb2 = list;
                    arrayDeque3 = arrayDeque2;
                }
                arrayDeque = arrayDeque3;
                int i22 = i13;
                com.google.android.gms.internal.ads.zzamb[] zzambVarArr = (com.google.android.gms.internal.ads.zzamb[]) arrayList7.toArray(new com.google.android.gms.internal.ads.zzamb[0]);
                this.zzB = zzambVarArr;
                int length = zzambVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i23 = 0; i23 < zzambVarArr.length; i23++) {
                    jArr[i23] = new long[zzambVarArr[i23].zzb.zzb];
                    jArr2[i23] = zzambVarArr[i23].zzb.zzf[0];
                }
                long j7 = 0;
                int i24 = 0;
                while (i24 < zzambVarArr.length) {
                    long j8 = Long.MAX_VALUE;
                    int i25 = -1;
                    for (int i26 = 0; i26 < zzambVarArr.length; i26++) {
                        if (!zArr[i26]) {
                            long j9 = jArr2[i26];
                            if (j9 <= j8) {
                                i25 = i26;
                                j8 = j9;
                            }
                        }
                    }
                    int i27 = iArr[i25];
                    long[] jArr3 = jArr[i25];
                    jArr3[i27] = j7;
                    com.google.android.gms.internal.ads.zzaml zzamlVar2 = zzambVarArr[i25].zzb;
                    com.google.android.gms.internal.ads.zzamb[] zzambVarArr2 = zzambVarArr;
                    int i28 = i22;
                    j7 += zzamlVar2.zzd[i27];
                    int i29 = i27 + 1;
                    iArr[i25] = i29;
                    if (i29 < jArr3.length) {
                        jArr2[i25] = zzamlVar2.zzf[i29];
                    } else {
                        zArr[i25] = true;
                        i24++;
                    }
                    zzambVarArr = zzambVarArr2;
                    i22 = i28;
                }
                this.zzC = jArr;
                this.zzA.zzv();
                this.zzA.zzw(new com.google.android.gms.internal.ads.zzama(j4, this.zzB, i22));
                arrayDeque.clear();
                if (this.zzw) {
                }
            } else if (!arrayDeque3.isEmpty()) {
                ((com.google.android.gms.internal.ads.zzfx) arrayDeque3.peek()).zzb(zzfxVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(com.google.android.gms.internal.ads.zzaml zzamlVar, long j) {
        int zza2 = zzamlVar.zza(j);
        return zza2 == -1 ? zzamlVar.zzb(j) : zza2;
    }

    private static int zzm(int i) {
        return i != 1903435808 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzahf zzb = com.google.android.gms.internal.ads.zzamh.zzb(zzafzVar);
        this.zzk = zzb != null ? com.google.android.gms.internal.ads.zzgwm.zzj(zzb) : com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final /* synthetic */ java.util.List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        if ((this.zzc & 16) == 0) {
            zzagbVar = new com.google.android.gms.internal.ads.zzanm(zzagbVar, this.zzb);
        }
        this.zzA = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (com.google.android.gms.internal.ads.zzamb zzambVar : this.zzB) {
            com.google.android.gms.internal.ads.zzaml zzamlVar = zzambVar.zzb;
            int zza2 = zzamlVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzamlVar.zzb(j2);
            }
            zzambVar.zze = zza2;
            com.google.android.gms.internal.ads.zzahl zzahlVar = zzambVar.zzd;
            if (zzahlVar != null) {
                zzahlVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    public zzamc(com.google.android.gms.internal.ads.zzanj zzanjVar, int i) {
        this.zzb = zzanjVar;
        this.zzc = i;
        this.zzk = com.google.android.gms.internal.ads.zzgwm.zzi();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new com.google.android.gms.internal.ads.zzamg();
        this.zzj = new java.util.ArrayList();
        this.zzg = new com.google.android.gms.internal.ads.zzet(16);
        this.zzh = new java.util.ArrayDeque();
        this.zzd = new com.google.android.gms.internal.ads.zzet(com.google.android.gms.internal.ads.zzgp.zza);
        this.zze = new com.google.android.gms.internal.ads.zzet(6);
        this.zzf = new com.google.android.gms.internal.ads.zzet();
        this.zzq = -1;
        this.zzA = com.google.android.gms.internal.ads.zzagb.zza;
        this.zzB = new com.google.android.gms.internal.ads.zzamb[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0098 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        char c;
        com.google.android.gms.internal.ads.zzahk zzahkVar;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        while (true) {
            int i5 = this.zzl;
            if (i5 == 0) {
                if (this.zzo == 0) {
                    com.google.android.gms.internal.ads.zzet zzetVar = this.zzg;
                    if (!zzafzVar.zzb(zzetVar.zzi(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzo = 8;
                    zzetVar.zzh(0);
                    this.zzn = zzetVar.zzz();
                    this.zzm = zzetVar.zzB();
                }
                long j = this.zzn;
                if (j == 1) {
                    com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzg;
                    zzafzVar.zzc(zzetVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzetVar2.zzJ();
                } else if (j == 0) {
                    long zzo = zzafzVar.zzo();
                    if (zzo == -1) {
                        com.google.android.gms.internal.ads.zzfx zzfxVar = (com.google.android.gms.internal.ads.zzfx) this.zzh.peek();
                        zzo = zzfxVar != null ? zzfxVar.zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzn = (zzo - zzafzVar.zzn()) + this.zzo;
                    }
                }
                long j2 = this.zzn;
                int i6 = this.zzo;
                long j3 = i6;
                if (j2 < j3) {
                    if (this.zzm != 1718773093 || i6 != 8) {
                        break;
                    }
                    this.zzn = j3;
                    i6 = 8;
                }
                int i7 = this.zzm;
                if (i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1701082227 || i7 == 1835365473 || i7 == 1635284069) {
                    long zzn = zzafzVar.zzn();
                    long j4 = this.zzn;
                    long j5 = zzn + j4;
                    long j6 = this.zzo;
                    if (j4 != j6 && this.zzm == 1835365473) {
                        com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzf;
                        zzetVar3.zza(8);
                        zzafzVar.zzi(zzetVar3.zzi(), 0, 8);
                        com.google.android.gms.internal.ads.zzalj.zzf(zzetVar3);
                        zzafzVar.zzf(zzetVar3.zzg());
                        zzafzVar.zzl();
                    }
                    long j7 = j5 - j6;
                    this.zzh.push(new com.google.android.gms.internal.ads.zzfx(this.zzm, j7));
                    if (this.zzn == this.zzo) {
                        zzk(j7);
                    } else {
                        zzj();
                    }
                } else {
                    if (i7 == 1835296868 || i7 == 1836476516 || i7 == 1751411826 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1937011571 || i7 == 1668576371 || i7 == 1701606260 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1953196132 || i7 == 1718909296 || i7 == 1969517665 || i7 == 1801812339 || i7 == 1768715124) {
                        com.google.android.gms.internal.ads.zzgtj.zzi(i6 == 8);
                        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzn <= 2147483647L);
                        com.google.android.gms.internal.ads.zzet zzetVar4 = new com.google.android.gms.internal.ads.zzet((int) this.zzn);
                        java.lang.System.arraycopy(this.zzg.zzi(), 0, zzetVar4.zzi(), 0, 8);
                        this.zzp = zzetVar4;
                    } else {
                        this.zzp = null;
                    }
                    this.zzl = 1;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        this.zzi.zzb(zzafzVar, zzagyVar, this.zzj);
                        if (zzagyVar.zza == 0) {
                            zzj();
                        }
                        return 1;
                    }
                    long zzn2 = zzafzVar.zzn();
                    int i8 = this.zzq;
                    if (i8 == -1) {
                        long j8 = Long.MAX_VALUE;
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        int i9 = 0;
                        boolean z3 = true;
                        int i10 = -1;
                        int i11 = -1;
                        boolean z4 = true;
                        while (true) {
                            com.google.android.gms.internal.ads.zzamb[] zzambVarArr = this.zzB;
                            if (i9 >= zzambVarArr.length) {
                                break;
                            }
                            com.google.android.gms.internal.ads.zzamb zzambVar = zzambVarArr[i9];
                            int i12 = zzambVar.zze;
                            com.google.android.gms.internal.ads.zzaml zzamlVar = zzambVar.zzb;
                            if (i12 != zzamlVar.zzb) {
                                long j11 = zzamlVar.zzc[i12];
                                long[][] jArr = this.zzC;
                                jArr.getClass();
                                long j12 = jArr[i9][i12];
                                long j13 = j11 - zzn2;
                                boolean z5 = j13 < 0 || j13 >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z5) {
                                    z = z4;
                                } else {
                                    if (!z4) {
                                        z = false;
                                    }
                                    z4 = z5;
                                    i11 = i9;
                                    j9 = j12;
                                    j10 = j13;
                                    if (j12 < j8) {
                                        z3 = z5;
                                        i10 = i9;
                                        j8 = j12;
                                    }
                                }
                                if (z5 != z || j13 >= j10) {
                                    z4 = z;
                                    if (j12 < j8) {
                                    }
                                }
                                z4 = z5;
                                i11 = i9;
                                j9 = j12;
                                j10 = j13;
                                if (j12 < j8) {
                                }
                            }
                            i9++;
                        }
                        i8 = (j8 == Long.MAX_VALUE || !z3 || j9 < j8 + 10485760) ? i11 : i10;
                        this.zzq = i8;
                        if (i8 == -1) {
                            return -1;
                        }
                    }
                    com.google.android.gms.internal.ads.zzamb zzambVar2 = this.zzB[i8];
                    com.google.android.gms.internal.ads.zzahk zzahkVar2 = zzambVar2.zzc;
                    int i13 = zzambVar2.zze;
                    com.google.android.gms.internal.ads.zzaml zzamlVar2 = zzambVar2.zzb;
                    com.google.android.gms.internal.ads.zzahk zzahkVar3 = zzahkVar2;
                    long j14 = zzamlVar2.zzc[i13] + this.zzz;
                    int[] iArr = zzamlVar2.zzd;
                    int i14 = iArr[i13];
                    com.google.android.gms.internal.ads.zzahl zzahlVar = zzambVar2.zzd;
                    long j15 = (j14 - zzn2) + this.zzr;
                    if (j15 < 0 || j15 >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzagyVar.zza = j14;
                        return 1;
                    }
                    com.google.android.gms.internal.ads.zzami zzamiVar = zzambVar2.zza;
                    if (zzamiVar.zzh == 1) {
                        j15 += 8;
                        i14 -= 8;
                    }
                    int i15 = i14;
                    zzafzVar.zzf((int) j15);
                    com.google.android.gms.internal.ads.zzv zzvVar = zzamiVar.zzg;
                    java.lang.String str = zzvVar.zzp;
                    if (!java.util.Objects.equals(str, "video/avc") ? !(!java.util.Objects.equals(str, "video/hevc") ? !java.util.Objects.equals(str, "video/apv") : (this.zzc & 128) == 0) : (this.zzc & 32) == 0) {
                        c = 1;
                    } else {
                        c = 1;
                        this.zzu = true;
                    }
                    int i16 = zzamiVar.zzk;
                    if (i16 == 0) {
                        zzahkVar = zzahkVar3;
                        if ("audio/ac4".equals(str)) {
                            if (this.zzs == 0) {
                                com.google.android.gms.internal.ads.zzet zzetVar5 = this.zzf;
                                com.google.android.gms.internal.ads.zzafb.zzc(i15, zzetVar5);
                                zzahkVar.zzc(zzetVar5, 7);
                                this.zzs += 7;
                            }
                            i15 += 7;
                        } else if (zzambVar2.zzf != null && java.util.Objects.equals(str, "audio/mpeg")) {
                            com.google.android.gms.internal.ads.zzv zzvVar2 = zzambVar2.zzf;
                            com.google.android.gms.internal.ads.zzet zzetVar6 = this.zzf;
                            zzetVar6.zza(4);
                            zzafzVar.zzi(zzetVar6.zzi(), 0, 4);
                            zzafzVar.zzl();
                            com.google.android.gms.internal.ads.zzagv zzagvVar = new com.google.android.gms.internal.ads.zzagv();
                            if (zzagvVar.zza(zzetVar6.zzB()) && !java.util.Objects.equals(zzvVar2.zzp, zzagvVar.zzb)) {
                                com.google.android.gms.internal.ads.zzt zza2 = zzvVar2.zza();
                                java.lang.String str2 = zzagvVar.zzb;
                                str2.getClass();
                                zza2.zzo(str2);
                                zzvVar2 = zza2.zzO();
                            }
                            zzahkVar.zzA(zzvVar2);
                            zzambVar2.zzf = null;
                        } else if (zzahlVar != null) {
                            zzahlVar.zzb(zzafzVar);
                        }
                        while (true) {
                            int i17 = this.zzs;
                            if (i17 >= i15) {
                                break;
                            }
                            int zza3 = zzahkVar.zza(zzafzVar, i15 - i17, false);
                            this.zzr += zza3;
                            this.zzs += zza3;
                            this.zzt -= zza3;
                        }
                    } else {
                        com.google.android.gms.internal.ads.zzet zzetVar7 = this.zze;
                        byte[] zzi = zzetVar7.zzi();
                        zzi[0] = 0;
                        zzi[c] = 0;
                        zzi[2] = 0;
                        int i18 = 4 - i16;
                        i15 += i18;
                        while (this.zzs < i15) {
                            int i19 = this.zzt;
                            if (i19 == 0) {
                                if (this.zzu || com.google.android.gms.internal.ads.zzgp.zzc(zzvVar) + i16 > iArr[i13] - this.zzr) {
                                    i2 = i16;
                                    i3 = 0;
                                } else {
                                    i3 = com.google.android.gms.internal.ads.zzgp.zzc(zzvVar);
                                    i2 = i16 + i3;
                                }
                                zzafzVar.zzc(zzi, i18, i2);
                                this.zzr += i2;
                                zzetVar7.zzh(0);
                                int zzB = zzetVar7.zzB();
                                if (zzB < 0) {
                                    throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
                                }
                                this.zzt = zzB - i3;
                                com.google.android.gms.internal.ads.zzet zzetVar8 = this.zzd;
                                zzetVar8.zzh(0);
                                i = i16;
                                com.google.android.gms.internal.ads.zzahk zzahkVar4 = zzahkVar3;
                                zzahkVar4.zzc(zzetVar8, 4);
                                this.zzs += 4;
                                if (i3 > 0) {
                                    zzahkVar4.zzc(zzetVar7, i3);
                                    this.zzs += i3;
                                    if (com.google.android.gms.internal.ads.zzgp.zzd(zzi, 4, i3, zzvVar)) {
                                        this.zzu = true;
                                    }
                                }
                                zzahkVar3 = zzahkVar4;
                            } else {
                                i = i16;
                                int zza4 = zzahkVar3.zza(zzafzVar, i19, false);
                                this.zzr += zza4;
                                this.zzs += zza4;
                                this.zzt -= zza4;
                            }
                            i16 = i;
                        }
                        zzahkVar = zzahkVar3;
                    }
                    long j16 = zzamlVar2.zzf[i13];
                    int i20 = zzamlVar2.zzg[i13];
                    if (!this.zzu) {
                        i20 |= androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if (zzahlVar != null) {
                        zzahlVar.zzc(zzahkVar, j16, i20, i15, 0, null);
                        if (i13 + 1 == zzamlVar2.zzb) {
                            zzahlVar.zzd(zzahkVar, null);
                        }
                    } else {
                        zzahkVar.zze(j16, i20, i15, 0, null);
                    }
                    zzambVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    this.zzu = false;
                    return 0;
                }
                long j17 = this.zzn - this.zzo;
                long zzn3 = zzafzVar.zzn() + j17;
                com.google.android.gms.internal.ads.zzet zzetVar9 = this.zzp;
                if (zzetVar9 != null) {
                    zzafzVar.zzc(zzetVar9.zzi(), this.zzo, (int) j17);
                    if (this.zzm == 1718909296) {
                        this.zzv = true;
                        zzetVar9.zzh(8);
                        if (zzm(zzetVar9.zzB()) == 0) {
                            zzetVar9.zzk(4);
                            while (zzetVar9.zzd() > 0) {
                                if (zzm(zzetVar9.zzB()) != 0) {
                                }
                            }
                            i4 = 0;
                            this.zzD = i4;
                        }
                        i4 = 1;
                        this.zzD = i4;
                    } else {
                        java.util.ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((com.google.android.gms.internal.ads.zzfx) arrayDeque.peek()).zza(new com.google.android.gms.internal.ads.zzfy(this.zzm, zzetVar9));
                        }
                    }
                } else {
                    if (!this.zzv && this.zzm == 1835295092) {
                        this.zzD = 1;
                    }
                    if (j17 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzafzVar.zzf((int) j17);
                    } else {
                        zzagyVar.zza = zzafzVar.zzn() + j17;
                        z2 = true;
                        zzk(zzn3);
                        if (!this.zzw) {
                            this.zzy = true;
                            zzagyVar.zza = this.zzx;
                            this.zzw = false;
                        } else if (!z2) {
                            continue;
                        }
                        if (this.zzl == 2) {
                            return 1;
                        }
                    }
                }
                z2 = false;
                zzk(zzn3);
                if (!this.zzw) {
                }
                if (this.zzl == 2) {
                }
            }
        }
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
    }
}
