package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzalr implements com.google.android.gms.internal.ads.zzafy {
    private static final byte[] zza;
    private static final com.google.android.gms.internal.ads.zzv zzb;
    private long zzA;
    private long zzB;
    private com.google.android.gms.internal.ads.zzalq zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private com.google.android.gms.internal.ads.zzagb zzI;
    private com.google.android.gms.internal.ads.zzahk[] zzJ;
    private com.google.android.gms.internal.ads.zzahk[] zzK;
    private boolean zzL;
    private boolean zzM;
    private long zzN;
    private long zzO;
    private final com.google.android.gms.internal.ads.zzanj zzc;
    private final int zzd;
    private final java.util.List zze;
    private final android.util.SparseArray zzf;
    private final com.google.android.gms.internal.ads.zzet zzg;
    private final com.google.android.gms.internal.ads.zzet zzh;
    private final com.google.android.gms.internal.ads.zzet zzi;
    private final byte[] zzj;
    private final com.google.android.gms.internal.ads.zzet zzk;
    private final com.google.android.gms.internal.ads.zzajb zzl;
    private final com.google.android.gms.internal.ads.zzet zzm;
    private final java.util.ArrayDeque zzn;
    private final java.util.ArrayDeque zzo;
    private final com.google.android.gms.internal.ads.zzgz zzp;
    private final com.google.android.gms.internal.ads.zzafn zzq;
    private com.google.android.gms.internal.ads.zzgwm zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private com.google.android.gms.internal.ads.zzet zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i = com.google.android.gms.internal.ads.zzalm.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, com.google.common.base.Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zzo("application/x-emsg");
        zzb = zztVar.zzO();
    }

    @java.lang.Deprecated
    public zzalr() {
        this(com.google.android.gms.internal.ads.zzanj.zza, 32, null, null, com.google.android.gms.internal.ads.zzgwm.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x03bd, code lost:
    
        if ((com.google.android.gms.internal.ads.zzfl.zzv(r41, 1000000, r11.zzd, java.math.RoundingMode.DOWN) + com.google.android.gms.internal.ads.zzfl.zzv(r0[0], 1000000, r11.zzc, java.math.RoundingMode.DOWN)) < r11.zze) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x07cf, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07d2, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(long j) throws com.google.android.gms.internal.ads.zzat {
        com.google.android.gms.internal.ads.zzap zzapVar;
        android.util.SparseArray sparseArray;
        int i;
        com.google.android.gms.internal.ads.zzfx zzfxVar;
        byte[] bArr;
        java.util.List list;
        int i2;
        int i3;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        int i6;
        android.util.SparseArray sparseArray2;
        int i7;
        com.google.android.gms.internal.ads.zzfx zzfxVar2;
        byte[] bArr4;
        int i8;
        com.google.android.gms.internal.ads.zzfx zzfxVar3;
        java.util.List list2;
        int i9;
        com.google.android.gms.internal.ads.zzalq zzalqVar;
        com.google.android.gms.internal.ads.zzet zzetVar;
        com.google.android.gms.internal.ads.zzalk zzalkVar;
        int i10;
        long j2;
        int i11;
        com.google.android.gms.internal.ads.zzalk zzalkVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2;
        com.google.android.gms.internal.ads.zzalk zzalkVar3;
        int i17;
        int i18;
        long j3;
        com.google.android.gms.internal.ads.zzalq zzalqVar2;
        boolean z3;
        long[] jArr;
        final com.google.android.gms.internal.ads.zzalr zzalrVar = this;
        while (true) {
            java.util.ArrayDeque arrayDeque = zzalrVar.zzn;
            if (arrayDeque.isEmpty() || ((com.google.android.gms.internal.ads.zzfx) arrayDeque.peek()).zza != j) {
                break;
            }
            com.google.android.gms.internal.ads.zzfx zzfxVar4 = (com.google.android.gms.internal.ads.zzfx) arrayDeque.pop();
            int i19 = zzfxVar4.zzd;
            int i20 = 12;
            int i21 = 8;
            if (i19 == 1836019574) {
                com.google.android.gms.internal.ads.zzq zzn = zzn(zzfxVar4.zzb);
                com.google.android.gms.internal.ads.zzfx zzd = zzfxVar4.zzd(1836475768);
                zzd.getClass();
                android.util.SparseArray sparseArray3 = new android.util.SparseArray();
                java.util.List list3 = zzd.zzb;
                int size = list3.size();
                int i22 = 0;
                long j4 = -9223372036854775807L;
                while (i22 < size) {
                    com.google.android.gms.internal.ads.zzfy zzfyVar = (com.google.android.gms.internal.ads.zzfy) list3.get(i22);
                    int i23 = zzfyVar.zzd;
                    if (i23 == 1953654136) {
                        com.google.android.gms.internal.ads.zzet zzetVar2 = zzfyVar.zza;
                        zzetVar2.zzh(i20);
                        android.util.Pair create = android.util.Pair.create(java.lang.Integer.valueOf(zzetVar2.zzB()), new com.google.android.gms.internal.ads.zzalk(zzetVar2.zzB() - 1, zzetVar2.zzB(), zzetVar2.zzB(), zzetVar2.zzB()));
                        sparseArray3.put(((java.lang.Integer) create.first).intValue(), (com.google.android.gms.internal.ads.zzalk) create.second);
                    } else if (i23 == 1835362404) {
                        com.google.android.gms.internal.ads.zzet zzetVar3 = zzfyVar.zza;
                        zzetVar3.zzh(8);
                        j4 = com.google.android.gms.internal.ads.zzalj.zza(zzetVar3.zzB()) == 0 ? zzetVar3.zzz() : zzetVar3.zzJ();
                    }
                    i22++;
                    i20 = 12;
                }
                com.google.android.gms.internal.ads.zzfx zzd2 = zzfxVar4.zzd(1835365473);
                com.google.android.gms.internal.ads.zzap zze = zzd2 != null ? com.google.android.gms.internal.ads.zzalj.zze(zzd2) : null;
                com.google.android.gms.internal.ads.zzagr zzagrVar = new com.google.android.gms.internal.ads.zzagr();
                com.google.android.gms.internal.ads.zzfy zzc = zzfxVar4.zzc(1969517665);
                if (zzc != null) {
                    com.google.android.gms.internal.ads.zzap zzc2 = com.google.android.gms.internal.ads.zzalj.zzc(zzc);
                    zzagrVar.zza(zzc2);
                    zzapVar = zzc2;
                } else {
                    zzapVar = null;
                }
                com.google.android.gms.internal.ads.zzfy zzc3 = zzfxVar4.zzc(1836476516);
                zzc3.getClass();
                com.google.android.gms.internal.ads.zzap zzapVar2 = new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, com.google.android.gms.internal.ads.zzalj.zzd(zzc3.zza));
                java.util.List zzb2 = com.google.android.gms.internal.ads.zzalj.zzb(zzfxVar4, zzagrVar, j4, zzn, (zzalrVar.zzd & 16) != 0, false, new com.google.android.gms.internal.ads.zzgta(zzalrVar) { // from class: com.google.android.gms.internal.ads.zzall
                    @Override // com.google.android.gms.internal.ads.zzgta
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                        return (com.google.android.gms.internal.ads.zzami) obj;
                    }
                }, false);
                int size2 = zzb2.size();
                android.util.SparseArray sparseArray4 = zzalrVar.zzf;
                if (sparseArray4.size() == 0) {
                    java.lang.String zza2 = com.google.android.gms.internal.ads.zzalu.zza(zzb2);
                    int i24 = 0;
                    while (i24 < size2) {
                        com.google.android.gms.internal.ads.zzaml zzamlVar = (com.google.android.gms.internal.ads.zzaml) zzb2.get(i24);
                        com.google.android.gms.internal.ads.zzami zzamiVar = zzamlVar.zza;
                        com.google.android.gms.internal.ads.zzagb zzagbVar = zzalrVar.zzI;
                        int i25 = zzamiVar.zzb;
                        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(i24, i25);
                        long j5 = zzamiVar.zze;
                        zzu.zzO(j5);
                        java.util.List list4 = zzb2;
                        com.google.android.gms.internal.ads.zzv zzvVar = zzamiVar.zzg;
                        int i26 = size2;
                        com.google.android.gms.internal.ads.zzt zza3 = zzvVar.zza();
                        zza3.zzn(zza2);
                        com.google.android.gms.internal.ads.zzalt.zzb(i25, zzagrVar, zza3);
                        com.google.android.gms.internal.ads.zzalt.zza(i25, zze, zza3, zzvVar.zzl, zzapVar, zzapVar2);
                        int i27 = zzamiVar.zza;
                        sparseArray4.put(i27, new com.google.android.gms.internal.ads.zzalq(zzu, zzamlVar, zzp(sparseArray3, i27), zza3.zzO()));
                        zzalrVar.zzA = java.lang.Math.max(zzalrVar.zzA, j5);
                        i24++;
                        zzb2 = list4;
                        size2 = i26;
                        zza2 = zza2;
                        zzagrVar = zzagrVar;
                    }
                    zzalrVar.zzI.zzv();
                } else {
                    com.google.android.gms.internal.ads.zzgtj.zzi(sparseArray4.size() == size2);
                    for (int i28 = 0; i28 < size2; i28++) {
                        com.google.android.gms.internal.ads.zzaml zzamlVar2 = (com.google.android.gms.internal.ads.zzaml) zzb2.get(i28);
                        int i29 = zzamlVar2.zza.zza;
                        ((com.google.android.gms.internal.ads.zzalq) sparseArray4.get(i29)).zza(zzamlVar2, zzp(sparseArray3, i29));
                    }
                }
            } else if (i19 == 1836019558) {
                android.util.SparseArray sparseArray5 = zzalrVar.zzf;
                int i30 = zzalrVar.zzd;
                byte[] bArr5 = zzalrVar.zzj;
                java.util.List list5 = zzfxVar4.zzc;
                int size3 = list5.size();
                int i31 = 0;
                while (i31 < size3) {
                    com.google.android.gms.internal.ads.zzfx zzfxVar5 = (com.google.android.gms.internal.ads.zzfx) list5.get(i31);
                    if (zzfxVar5.zzd == 1953653094) {
                        com.google.android.gms.internal.ads.zzfy zzc4 = zzfxVar5.zzc(1952868452);
                        zzc4.getClass();
                        com.google.android.gms.internal.ads.zzet zzetVar4 = zzc4.zza;
                        zzetVar4.zzh(i21);
                        int zzB = zzetVar4.zzB();
                        int i32 = com.google.android.gms.internal.ads.zzalj.zza;
                        com.google.android.gms.internal.ads.zzalq zzalqVar3 = (com.google.android.gms.internal.ads.zzalq) sparseArray5.get(zzetVar4.zzB());
                        if (zzalqVar3 == null) {
                            zzalqVar3 = null;
                        } else {
                            if ((zzB & 1) != 0) {
                                long zzJ = zzetVar4.zzJ();
                                com.google.android.gms.internal.ads.zzamk zzamkVar = zzalqVar3.zzb;
                                zzamkVar.zzb = zzJ;
                                zzamkVar.zzc = zzJ;
                            }
                            com.google.android.gms.internal.ads.zzalk zzalkVar4 = zzalqVar3.zze;
                            zzalqVar3.zzb.zza = new com.google.android.gms.internal.ads.zzalk((zzB & 2) != 0 ? zzetVar4.zzB() - 1 : zzalkVar4.zza, (zzB & 8) != 0 ? zzetVar4.zzB() : zzalkVar4.zzb, (zzB & 16) != 0 ? zzetVar4.zzB() : zzalkVar4.zzc, (zzB & 32) != 0 ? zzetVar4.zzB() : zzalkVar4.zzd);
                        }
                        if (zzalqVar3 != null) {
                            com.google.android.gms.internal.ads.zzamk zzamkVar2 = zzalqVar3.zzb;
                            long j6 = zzamkVar2.zzp;
                            boolean z4 = zzamkVar2.zzq;
                            zzalqVar3.zzc();
                            zzalqVar3.zzl(true);
                            com.google.android.gms.internal.ads.zzfy zzc5 = zzfxVar5.zzc(1952867444);
                            if (zzc5 == null || (i30 & 2) != 0) {
                                zzamkVar2.zzp = j6;
                                zzamkVar2.zzq = z4;
                            } else {
                                com.google.android.gms.internal.ads.zzet zzetVar5 = zzc5.zza;
                                zzetVar5.zzh(8);
                                zzamkVar2.zzp = com.google.android.gms.internal.ads.zzalj.zza(zzetVar5.zzB()) == 1 ? zzetVar5.zzJ() : zzetVar5.zzz();
                                zzamkVar2.zzq = true;
                            }
                            java.util.List list6 = zzfxVar5.zzb;
                            int size4 = list6.size();
                            list = list5;
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            while (true) {
                                i4 = 1953658222;
                                if (i33 >= size4) {
                                    break;
                                }
                                int i36 = size3;
                                com.google.android.gms.internal.ads.zzfy zzfyVar2 = (com.google.android.gms.internal.ads.zzfy) list6.get(i33);
                                if (zzfyVar2.zzd == 1953658222) {
                                    com.google.android.gms.internal.ads.zzet zzetVar6 = zzfyVar2.zza;
                                    zzetVar6.zzh(12);
                                    int zzH = zzetVar6.zzH();
                                    if (zzH > 0) {
                                        i35 += zzH;
                                        i34++;
                                    }
                                }
                                i33++;
                                size3 = i36;
                            }
                            i2 = size3;
                            zzalqVar3.zzh = 0;
                            zzalqVar3.zzg = 0;
                            zzalqVar3.zzf = 0;
                            zzamkVar2.zzd = i34;
                            zzamkVar2.zze = i35;
                            if (zzamkVar2.zzg.length < i34) {
                                zzamkVar2.zzf = new long[i34];
                                zzamkVar2.zzg = new int[i34];
                            }
                            if (zzamkVar2.zzh.length < i35) {
                                int i37 = (i35 * 125) / 100;
                                zzamkVar2.zzh = new int[i37];
                                zzamkVar2.zzi = new long[i37];
                                zzamkVar2.zzj = new boolean[i37];
                                zzamkVar2.zzl = new boolean[i37];
                            }
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = 0;
                            while (i38 < size4) {
                                com.google.android.gms.internal.ads.zzfy zzfyVar3 = (com.google.android.gms.internal.ads.zzfy) list6.get(i38);
                                if (zzfyVar3.zzd == i4) {
                                    int i41 = i39 + 1;
                                    com.google.android.gms.internal.ads.zzet zzetVar7 = zzfyVar3.zza;
                                    zzetVar7.zzh(8);
                                    int zzB2 = zzetVar7.zzB();
                                    i9 = size4;
                                    com.google.android.gms.internal.ads.zzami zzamiVar2 = zzalqVar3.zzd.zza;
                                    com.google.android.gms.internal.ads.zzalk zzalkVar5 = zzamkVar2.zza;
                                    java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                                    sparseArray2 = sparseArray5;
                                    zzamkVar2.zzg[i39] = zzetVar7.zzH();
                                    long[] jArr2 = zzamkVar2.zzf;
                                    zzfxVar2 = zzfxVar4;
                                    bArr4 = bArr5;
                                    long j7 = zzamkVar2.zzb;
                                    jArr2[i39] = j7;
                                    if ((zzB2 & 1) != 0) {
                                        i8 = i31;
                                        zzfxVar3 = zzfxVar5;
                                        jArr2[i39] = j7 + zzetVar7.zzB();
                                    } else {
                                        i8 = i31;
                                        zzfxVar3 = zzfxVar5;
                                    }
                                    boolean z5 = (zzB2 & 4) != 0;
                                    int i42 = zzalkVar5.zzd;
                                    int zzB3 = z5 ? zzetVar7.zzB() : i42;
                                    int i43 = zzB2 & 256;
                                    int i44 = zzB2 & 512;
                                    int i45 = zzB2 & 1024;
                                    int i46 = zzB2 & 2048;
                                    int i47 = zzB3;
                                    long[] jArr3 = zzamiVar2.zzi;
                                    if (jArr3 != null) {
                                        list2 = list6;
                                        i6 = i38;
                                        if (jArr3.length != 1 || (jArr = zzamiVar2.zzj) == null) {
                                            i10 = i46;
                                            zzetVar = zzetVar7;
                                            zzalkVar = zzalkVar5;
                                        } else {
                                            long j8 = jArr3[0];
                                            if (j8 == 0) {
                                                i10 = i46;
                                                zzetVar = zzetVar7;
                                                zzalkVar = zzalkVar5;
                                            } else {
                                                i10 = i46;
                                                zzetVar = zzetVar7;
                                                zzalkVar = zzalkVar5;
                                            }
                                            j2 = jArr[0];
                                            int[] iArr = zzamkVar2.zzh;
                                            long[] jArr4 = zzamkVar2.zzi;
                                            boolean[] zArr = zzamkVar2.zzj;
                                            boolean z6 = (zzamiVar2.zzb == 2 || (i30 & 1) == 0) ? false : true;
                                            i11 = zzamkVar2.zzg[i39] + i40;
                                            com.google.android.gms.internal.ads.zzalq zzalqVar4 = zzalqVar3;
                                            long j9 = zzamiVar2.zzc;
                                            long j10 = zzamkVar2.zzp;
                                            while (i40 < i11) {
                                                if (i43 != 0) {
                                                    com.google.android.gms.internal.ads.zzalk zzalkVar6 = zzalkVar;
                                                    i12 = i30;
                                                    i13 = zzetVar.zzB();
                                                    zzalkVar2 = zzalkVar6;
                                                } else {
                                                    zzalkVar2 = zzalkVar;
                                                    i12 = i30;
                                                    i13 = zzalkVar2.zzb;
                                                }
                                                zzk(i13);
                                                if (i44 != 0) {
                                                    i14 = i11;
                                                    i15 = zzetVar.zzB();
                                                } else {
                                                    i14 = i11;
                                                    i15 = zzalkVar2.zzc;
                                                }
                                                zzk(i15);
                                                if (i45 != 0) {
                                                    i16 = zzetVar.zzB();
                                                } else {
                                                    if (i40 == 0) {
                                                        if (z5) {
                                                            i16 = i47;
                                                            i40 = 0;
                                                        } else {
                                                            i40 = 0;
                                                        }
                                                    }
                                                    i16 = i42;
                                                }
                                                if (i10 != 0) {
                                                    z2 = z5;
                                                    zzalkVar3 = zzalkVar2;
                                                    i17 = i43;
                                                    i18 = zzetVar.zzB();
                                                } else {
                                                    z2 = z5;
                                                    zzalkVar3 = zzalkVar2;
                                                    i17 = i43;
                                                    i18 = 0;
                                                }
                                                long zzv = com.google.android.gms.internal.ads.zzfl.zzv((i18 + j10) - j2, 1000000L, j9, java.math.RoundingMode.DOWN);
                                                jArr4[i40] = zzv;
                                                int i48 = i45;
                                                if (zzamkVar2.zzq) {
                                                    j3 = j2;
                                                    zzalqVar2 = zzalqVar4;
                                                } else {
                                                    zzalqVar2 = zzalqVar4;
                                                    j3 = j2;
                                                    jArr4[i40] = zzv + zzalqVar2.zzd.zzi;
                                                }
                                                iArr[i40] = i15;
                                                if (((i16 >> 16) & 1) == 0) {
                                                    if (!z6) {
                                                        z3 = true;
                                                    } else if (i40 == 0) {
                                                        z3 = true;
                                                        i40 = 0;
                                                    }
                                                    zArr[i40] = z3;
                                                    j10 += i13;
                                                    i40++;
                                                    zzalqVar4 = zzalqVar2;
                                                    i45 = i48;
                                                    j2 = j3;
                                                    i30 = i12;
                                                    i11 = i14;
                                                    z5 = z2;
                                                    i43 = i17;
                                                    zzalkVar = zzalkVar3;
                                                }
                                                z3 = false;
                                                zArr[i40] = z3;
                                                j10 += i13;
                                                i40++;
                                                zzalqVar4 = zzalqVar2;
                                                i45 = i48;
                                                j2 = j3;
                                                i30 = i12;
                                                i11 = i14;
                                                z5 = z2;
                                                i43 = i17;
                                                zzalkVar = zzalkVar3;
                                            }
                                            i7 = i30;
                                            zzalqVar = zzalqVar4;
                                            zzamkVar2.zzp = j10;
                                            i39 = i41;
                                            i40 = i11;
                                        }
                                    } else {
                                        i6 = i38;
                                        list2 = list6;
                                        zzetVar = zzetVar7;
                                        zzalkVar = zzalkVar5;
                                        i10 = i46;
                                    }
                                    j2 = 0;
                                    int[] iArr2 = zzamkVar2.zzh;
                                    long[] jArr42 = zzamkVar2.zzi;
                                    boolean[] zArr2 = zzamkVar2.zzj;
                                    if (zzamiVar2.zzb == 2) {
                                    }
                                    i11 = zzamkVar2.zzg[i39] + i40;
                                    com.google.android.gms.internal.ads.zzalq zzalqVar42 = zzalqVar3;
                                    long j92 = zzamiVar2.zzc;
                                    long j102 = zzamkVar2.zzp;
                                    while (i40 < i11) {
                                    }
                                    i7 = i30;
                                    zzalqVar = zzalqVar42;
                                    zzamkVar2.zzp = j102;
                                    i39 = i41;
                                    i40 = i11;
                                } else {
                                    i6 = i38;
                                    sparseArray2 = sparseArray5;
                                    i7 = i30;
                                    zzfxVar2 = zzfxVar4;
                                    bArr4 = bArr5;
                                    i8 = i31;
                                    zzfxVar3 = zzfxVar5;
                                    list2 = list6;
                                    i9 = size4;
                                    zzalqVar = zzalqVar3;
                                }
                                i38 = i6 + 1;
                                zzalqVar3 = zzalqVar;
                                size4 = i9;
                                sparseArray5 = sparseArray2;
                                zzfxVar4 = zzfxVar2;
                                bArr5 = bArr4;
                                i31 = i8;
                                zzfxVar5 = zzfxVar3;
                                list6 = list2;
                                i30 = i7;
                                i4 = 1953658222;
                            }
                            sparseArray = sparseArray5;
                            i = i30;
                            zzfxVar = zzfxVar4;
                            byte[] bArr6 = bArr5;
                            i3 = i31;
                            com.google.android.gms.internal.ads.zzfx zzfxVar6 = zzfxVar5;
                            java.util.List list7 = list6;
                            com.google.android.gms.internal.ads.zzami zzamiVar3 = zzalqVar3.zzd.zza;
                            com.google.android.gms.internal.ads.zzalk zzalkVar7 = zzamkVar2.zza;
                            zzalkVar7.getClass();
                            com.google.android.gms.internal.ads.zzamj zza4 = zzamiVar3.zza(zzalkVar7.zza);
                            com.google.android.gms.internal.ads.zzfy zzc6 = zzfxVar6.zzc(1935763834);
                            if (zzc6 != null) {
                                zza4.getClass();
                                int i49 = zza4.zzd;
                                com.google.android.gms.internal.ads.zzet zzetVar8 = zzc6.zza;
                                zzetVar8.zzh(8);
                                if ((zzetVar8.zzB() & 1) == 1) {
                                    zzetVar8.zzk(8);
                                }
                                int zzs = zzetVar8.zzs();
                                int zzH2 = zzetVar8.zzH();
                                int i50 = zzamkVar2.zze;
                                if (zzH2 > i50) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzH2).length() + 56 + java.lang.String.valueOf(i50).length());
                                    sb.append("Saiz sample count ");
                                    sb.append(zzH2);
                                    sb.append(" is greater than fragment sample count");
                                    sb.append(i50);
                                    throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
                                }
                                if (zzs == 0) {
                                    boolean[] zArr3 = zzamkVar2.zzl;
                                    i5 = 0;
                                    for (int i51 = 0; i51 < zzH2; i51++) {
                                        int zzs2 = zzetVar8.zzs();
                                        i5 += zzs2;
                                        zArr3[i51] = zzs2 > i49;
                                    }
                                    z = false;
                                } else {
                                    boolean z7 = zzs > i49;
                                    i5 = zzs * zzH2;
                                    z = false;
                                    java.util.Arrays.fill(zzamkVar2.zzl, 0, zzH2, z7);
                                }
                                java.util.Arrays.fill(zzamkVar2.zzl, zzH2, zzamkVar2.zze, z);
                                if (i5 > 0) {
                                    zzamkVar2.zza(i5);
                                }
                            }
                            com.google.android.gms.internal.ads.zzfy zzc7 = zzfxVar6.zzc(1935763823);
                            if (zzc7 != null) {
                                com.google.android.gms.internal.ads.zzet zzetVar9 = zzc7.zza;
                                zzetVar9.zzh(8);
                                int zzB4 = zzetVar9.zzB();
                                if ((zzB4 & 1) == 1) {
                                    zzetVar9.zzk(8);
                                }
                                int zzH3 = zzetVar9.zzH();
                                if (zzH3 != 1) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzH3).length() + 29);
                                    sb2.append("Unexpected saio entry count: ");
                                    sb2.append(zzH3);
                                    throw com.google.android.gms.internal.ads.zzat.zzb(sb2.toString(), null);
                                }
                                zzamkVar2.zzc += com.google.android.gms.internal.ads.zzalj.zza(zzB4) == 0 ? zzetVar9.zzz() : zzetVar9.zzJ();
                            }
                            com.google.android.gms.internal.ads.zzfy zzc8 = zzfxVar6.zzc(1936027235);
                            if (zzc8 != null) {
                                zzl(zzc8.zza, 0, zzamkVar2);
                            }
                            java.lang.String str2 = zza4 != null ? zza4.zzb : null;
                            com.google.android.gms.internal.ads.zzet zzetVar10 = null;
                            com.google.android.gms.internal.ads.zzet zzetVar11 = null;
                            int i52 = 0;
                            while (i52 < list7.size()) {
                                java.util.List list8 = list7;
                                com.google.android.gms.internal.ads.zzfy zzfyVar4 = (com.google.android.gms.internal.ads.zzfy) list8.get(i52);
                                com.google.android.gms.internal.ads.zzet zzetVar12 = zzfyVar4.zza;
                                int i53 = zzfyVar4.zzd;
                                if (i53 == 1935828848) {
                                    zzetVar12.zzh(12);
                                    if (zzetVar12.zzB() == 1936025959) {
                                        zzetVar10 = zzetVar12;
                                    }
                                } else if (i53 == 1936158820) {
                                    zzetVar12.zzh(12);
                                    if (zzetVar12.zzB() == 1936025959) {
                                        zzetVar11 = zzetVar12;
                                    }
                                }
                                i52++;
                                list7 = list8;
                            }
                            java.util.List list9 = list7;
                            if (zzetVar10 != null && zzetVar11 != null) {
                                zzetVar10.zzh(8);
                                int zza5 = com.google.android.gms.internal.ads.zzalj.zza(zzetVar10.zzB());
                                zzetVar10.zzk(4);
                                if (zza5 == 1) {
                                    zzetVar10.zzk(4);
                                }
                                if (zzetVar10.zzB() != 1) {
                                    throw com.google.android.gms.internal.ads.zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                }
                                zzetVar11.zzh(8);
                                int zza6 = com.google.android.gms.internal.ads.zzalj.zza(zzetVar11.zzB());
                                zzetVar11.zzk(4);
                                if (zza6 == 1) {
                                    if (zzetVar11.zzz() == 0) {
                                        throw com.google.android.gms.internal.ads.zzat.zzc("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (zza6 >= 2) {
                                    zzetVar11.zzk(4);
                                }
                                if (zzetVar11.zzz() != 1) {
                                    throw com.google.android.gms.internal.ads.zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                }
                                zzetVar11.zzk(1);
                                int zzs3 = zzetVar11.zzs();
                                int i54 = (zzs3 & 240) >> 4;
                                int i55 = zzs3 & 15;
                                if (zzetVar11.zzs() == 1) {
                                    int zzs4 = zzetVar11.zzs();
                                    byte[] bArr7 = new byte[16];
                                    zzetVar11.zzm(bArr7, 0, 16);
                                    if (zzs4 == 0) {
                                        int zzs5 = zzetVar11.zzs();
                                        byte[] bArr8 = new byte[zzs5];
                                        zzetVar11.zzm(bArr8, 0, zzs5);
                                        bArr3 = bArr8;
                                    } else {
                                        bArr3 = null;
                                    }
                                    zzamkVar2.zzk = true;
                                    zzamkVar2.zzm = new com.google.android.gms.internal.ads.zzamj(true, str2, zzs4, bArr7, i54, i55, bArr3);
                                }
                            }
                            int size5 = list9.size();
                            int i56 = 0;
                            while (i56 < size5) {
                                com.google.android.gms.internal.ads.zzfy zzfyVar5 = (com.google.android.gms.internal.ads.zzfy) list9.get(i56);
                                if (zzfyVar5.zzd == 1970628964) {
                                    com.google.android.gms.internal.ads.zzet zzetVar13 = zzfyVar5.zza;
                                    zzetVar13.zzh(8);
                                    bArr2 = bArr6;
                                    zzetVar13.zzm(bArr2, 0, 16);
                                    if (java.util.Arrays.equals(bArr2, zza)) {
                                        zzl(zzetVar13, 16, zzamkVar2);
                                    }
                                } else {
                                    bArr2 = bArr6;
                                }
                                i56++;
                                bArr6 = bArr2;
                            }
                            bArr = bArr6;
                            i31 = i3 + 1;
                            bArr5 = bArr;
                            list5 = list;
                            size3 = i2;
                            sparseArray5 = sparseArray;
                            zzfxVar4 = zzfxVar;
                            i30 = i;
                            i21 = 8;
                        }
                    }
                    sparseArray = sparseArray5;
                    i = i30;
                    zzfxVar = zzfxVar4;
                    bArr = bArr5;
                    list = list5;
                    i2 = size3;
                    i3 = i31;
                    i31 = i3 + 1;
                    bArr5 = bArr;
                    list5 = list;
                    size3 = i2;
                    sparseArray5 = sparseArray;
                    zzfxVar4 = zzfxVar;
                    i30 = i;
                    i21 = 8;
                }
                android.util.SparseArray sparseArray6 = sparseArray5;
                com.google.android.gms.internal.ads.zzq zzn2 = zzn(zzfxVar4.zzb);
                if (zzn2 != null) {
                    int size6 = sparseArray6.size();
                    for (int i57 = 0; i57 < size6; i57++) {
                        ((com.google.android.gms.internal.ads.zzalq) sparseArray6.valueAt(i57)).zzb(zzn2);
                    }
                }
                zzalrVar = this;
                if (zzalrVar.zzz != -9223372036854775807L) {
                    int size7 = sparseArray6.size();
                    for (int i58 = 0; i58 < size7; i58++) {
                        com.google.android.gms.internal.ads.zzalq zzalqVar5 = (com.google.android.gms.internal.ads.zzalq) sparseArray6.valueAt(i58);
                        long j11 = zzalrVar.zzz;
                        int i59 = zzalqVar5.zzf;
                        while (true) {
                            com.google.android.gms.internal.ads.zzamk zzamkVar3 = zzalqVar5.zzb;
                            if (i59 < zzamkVar3.zze && zzamkVar3.zzi[i59] <= j11) {
                                if (zzamkVar3.zzj[i59]) {
                                    zzalqVar5.zzi = i59;
                                }
                                i59++;
                            }
                        }
                    }
                    zzalrVar.zzz = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((com.google.android.gms.internal.ads.zzfx) arrayDeque.peek()).zzb(zzfxVar4);
            }
        }
    }

    private static int zzk(int i) throws com.google.android.gms.internal.ads.zzat {
        if (i >= 0) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
    }

    private static void zzl(com.google.android.gms.internal.ads.zzet zzetVar, int i, com.google.android.gms.internal.ads.zzamk zzamkVar) throws com.google.android.gms.internal.ads.zzat {
        zzetVar.zzh(i + 8);
        int zzB = zzetVar.zzB();
        int i2 = com.google.android.gms.internal.ads.zzalj.zza;
        if ((zzB & 1) != 0) {
            throw com.google.android.gms.internal.ads.zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzB & 2) != 0;
        int zzH = zzetVar.zzH();
        if (zzH == 0) {
            java.util.Arrays.fill(zzamkVar.zzl, 0, zzamkVar.zze, false);
            return;
        }
        int i3 = zzamkVar.zze;
        if (zzH != i3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzH).length() + 58 + java.lang.String.valueOf(i3).length());
            sb.append("Senc sample count ");
            sb.append(zzH);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
        }
        java.util.Arrays.fill(zzamkVar.zzl, 0, zzH, z);
        zzamkVar.zza(zzetVar.zzd());
        com.google.android.gms.internal.ads.zzet zzetVar2 = zzamkVar.zzn;
        zzetVar.zzm(zzetVar2.zzi(), 0, zzetVar2.zze());
        zzetVar2.zzh(0);
        zzamkVar.zzo = false;
    }

    private static android.util.Pair zzm(com.google.android.gms.internal.ads.zzet zzetVar, long j) throws com.google.android.gms.internal.ads.zzat {
        long zzJ;
        long zzJ2;
        zzetVar.zzh(8);
        int zza2 = com.google.android.gms.internal.ads.zzalj.zza(zzetVar.zzB());
        zzetVar.zzk(4);
        long zzz = zzetVar.zzz();
        if (zza2 == 0) {
            zzJ = zzetVar.zzz();
            zzJ2 = zzetVar.zzz();
        } else {
            zzJ = zzetVar.zzJ();
            zzJ2 = zzetVar.zzJ();
        }
        long j2 = zzJ;
        long j3 = j + zzJ2;
        long zzv = com.google.android.gms.internal.ads.zzfl.zzv(j2, 1000000L, zzz, java.math.RoundingMode.DOWN);
        zzetVar.zzk(2);
        int zzt = zzetVar.zzt();
        int[] iArr = new int[zzt];
        long[] jArr = new long[zzt];
        long[] jArr2 = new long[zzt];
        long[] jArr3 = new long[zzt];
        long j4 = j2;
        long j5 = zzv;
        int i = 0;
        while (i < zzt) {
            int zzB = zzetVar.zzB();
            if ((Integer.MIN_VALUE & zzB) != 0) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Unhandled indirect reference", null);
            }
            long zzz2 = zzetVar.zzz();
            iArr[i] = zzB & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j5;
            long j6 = j4 + zzz2;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr2;
            int i2 = zzt;
            long zzv2 = com.google.android.gms.internal.ads.zzfl.zzv(j6, 1000000L, zzz, java.math.RoundingMode.DOWN);
            jArr5[i] = zzv2 - jArr4[i];
            zzetVar.zzk(4);
            j3 += r1[i];
            i++;
            iArr = iArr;
            jArr3 = jArr4;
            jArr2 = jArr5;
            jArr = jArr;
            zzt = i2;
            j4 = j6;
            j5 = zzv2;
        }
        return android.util.Pair.create(java.lang.Long.valueOf(zzv), new com.google.android.gms.internal.ads.zzafm(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.gms.internal.ads.zzq zzn(java.util.List list) {
        int i;
        java.util.ArrayList arrayList;
        java.util.UUID[] uuidArr;
        com.google.android.gms.internal.ads.zzame zzameVar;
        java.util.UUID uuid;
        int size = list.size();
        int i2 = 0;
        java.util.ArrayList arrayList2 = null;
        while (i2 < size) {
            com.google.android.gms.internal.ads.zzfy zzfyVar = (com.google.android.gms.internal.ads.zzfy) list.get(i2);
            if (zzfyVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                byte[] zzi = zzfyVar.zza.zzi();
                com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(zzi);
                if (zzetVar.zze() >= 32) {
                    zzetVar.zzh(0);
                    int zzd = zzetVar.zzd();
                    int zzB = zzetVar.zzB();
                    if (zzB != zzd) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzB).length() + 52 + java.lang.String.valueOf(zzd).length());
                        sb.append("Advertised atom size (");
                        sb.append(zzB);
                        sb.append(") does not match buffer size: ");
                        sb.append(zzd);
                        com.google.android.gms.internal.ads.zzeg.zzc("PsshAtomUtil", sb.toString());
                    } else {
                        int zzB2 = zzetVar.zzB();
                        if (zzB2 != 1886614376) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzB2).length() + 23);
                            sb2.append("Atom type is not pssh: ");
                            sb2.append(zzB2);
                            com.google.android.gms.internal.ads.zzeg.zzc("PsshAtomUtil", sb2.toString());
                        } else {
                            int zza2 = com.google.android.gms.internal.ads.zzalj.zza(zzetVar.zzB());
                            if (zza2 > 1) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 26);
                                sb3.append("Unsupported pssh version: ");
                                sb3.append(zza2);
                                com.google.android.gms.internal.ads.zzeg.zzc("PsshAtomUtil", sb3.toString());
                            } else {
                                java.util.UUID uuid2 = new java.util.UUID(zzetVar.zzD(), zzetVar.zzD());
                                if (zza2 == 1) {
                                    int zzH = zzetVar.zzH();
                                    uuidArr = new java.util.UUID[zzH];
                                    int i3 = 0;
                                    while (i3 < zzH) {
                                        uuidArr[i3] = new java.util.UUID(zzetVar.zzD(), zzetVar.zzD());
                                        i3++;
                                        i2 = i2;
                                        arrayList2 = arrayList2;
                                    }
                                    i = i2;
                                    arrayList = arrayList2;
                                } else {
                                    i = i2;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int zzH2 = zzetVar.zzH();
                                int zzd2 = zzetVar.zzd();
                                if (zzH2 != zzd2) {
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(zzH2).length() + 49 + java.lang.String.valueOf(zzd2).length());
                                    sb4.append("Atom data size (");
                                    sb4.append(zzH2);
                                    sb4.append(") does not match the bytes left: ");
                                    sb4.append(zzd2);
                                    com.google.android.gms.internal.ads.zzeg.zzc("PsshAtomUtil", sb4.toString());
                                    zzameVar = null;
                                    uuid = zzameVar == null ? null : zzameVar.zza;
                                    if (uuid == null) {
                                        com.google.android.gms.internal.ads.zzeg.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = arrayList;
                                        arrayList2.add(new com.google.android.gms.internal.ads.zzp(uuid, null, "video/mp4", zzi));
                                        i2 = i + 1;
                                    }
                                } else {
                                    byte[] bArr = new byte[zzH2];
                                    zzetVar.zzm(bArr, 0, zzH2);
                                    zzameVar = new com.google.android.gms.internal.ads.zzame(uuid2, zza2, bArr, uuidArr);
                                    if (zzameVar == null) {
                                    }
                                    if (uuid == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
                arrayList = arrayList2;
                zzameVar = null;
                if (zzameVar == null) {
                }
                if (uuid == null) {
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzq(arrayList2);
    }

    private final void zzo(com.google.android.gms.internal.ads.zzahb zzahbVar, com.google.android.gms.internal.ads.zzagy zzagyVar) {
        this.zzI.zzw(zzahbVar);
        this.zzL = true;
        zzagyVar.zza = this.zzO;
        zzi();
    }

    private static final com.google.android.gms.internal.ads.zzalk zzp(android.util.SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (com.google.android.gms.internal.ads.zzalk) sparseArray.valueAt(0);
        }
        com.google.android.gms.internal.ads.zzalk zzalkVar = (com.google.android.gms.internal.ads.zzalk) sparseArray.get(i);
        zzalkVar.getClass();
        return zzalkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzahf zza2 = com.google.android.gms.internal.ads.zzamh.zza(zzafzVar);
        this.zzr = zza2 != null ? com.google.android.gms.internal.ads.zzgwm.zzj(zza2) : com.google.android.gms.internal.ads.zzgwm.zzi();
        return zza2 == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final /* synthetic */ java.util.List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzagbVar = new com.google.android.gms.internal.ads.zzanm(zzagbVar, this.zzc);
        }
        this.zzI = zzagbVar;
        zzi();
        com.google.android.gms.internal.ads.zzahk[] zzahkVarArr = new com.google.android.gms.internal.ads.zzahk[2];
        this.zzJ = zzahkVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzahkVarArr[0] = this.zzI.zzu(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        com.google.android.gms.internal.ads.zzahk[] zzahkVarArr2 = (com.google.android.gms.internal.ads.zzahk[]) com.google.android.gms.internal.ads.zzfl.zzb(this.zzJ, i);
        this.zzJ = zzahkVarArr2;
        for (com.google.android.gms.internal.ads.zzahk zzahkVar : zzahkVarArr2) {
            zzahkVar.zzA(zzb);
        }
        java.util.List list = this.zze;
        this.zzK = new com.google.android.gms.internal.ads.zzahk[list.size()];
        while (i4 < this.zzK.length) {
            com.google.android.gms.internal.ads.zzahk zzu = this.zzI.zzu(i3, 3);
            zzu.zzA((com.google.android.gms.internal.ads.zzv) list.get(i4));
            this.zzK[i4] = zzu;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0097, code lost:
    
        if (r0.zzs != 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0099, code lost:
    
        r0.zzD = r3.zzf();
        r2 = r3.zzd.zza.zzg.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x00ad, code lost:
    
        if (java.util.Objects.equals(r2, "video/avc") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x00b3, code lost:
    
        if ((r0.zzd & 64) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00b5, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00c7, code lost:
    
        r0.zzG = !r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00ce, code lost:
    
        if (r3.zzf >= r3.zzi) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00d0, code lost:
    
        r1.zzf(r0.zzD);
        r1 = r3.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00d9, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00dc, code lost:
    
        r2 = r3.zzb;
        r4 = r2.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00e2, code lost:
    
        if (r1 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00e4, code lost:
    
        r4.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00ed, code lost:
    
        if (r2.zzb(r3.zzf) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00ef, code lost:
    
        r4.zzk(r4.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00fc, code lost:
    
        if (r3.zzh() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00fe, code lost:
    
        r0.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0100, code lost:
    
        r0.zzs = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0102, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x010b, code lost:
    
        if (r3.zzd.zza.zzh != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x010d, code lost:
    
        r0.zzD -= 8;
        r1.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0124, code lost:
    
        if ("audio/ac4".equals(r3.zzd.zza.zzg.zzp) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0126, code lost:
    
        r0.zzE = r3.zzi(r0.zzD, 7);
        r2 = r0.zzD;
        r5 = r0.zzk;
        com.google.android.gms.internal.ads.zzafb.zzc(r2, r5);
        r3.zza.zzc(r5, 7);
        r2 = r0.zzE + 7;
        r0.zzE = r2;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x014b, code lost:
    
        r0.zzD += r2;
        r0.zzs = 4;
        r0.zzF = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0142, code lost:
    
        r4 = 0;
        r2 = r3.zzi(r0.zzD, 0);
        r0.zzE = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00c6, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00bd, code lost:
    
        if (java.util.Objects.equals(r2, "video/hevc") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00c3, code lost:
    
        if ((r0.zzd & 128) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0155, code lost:
    
        r2 = r3.zzd.zza;
        r4 = r3.zza;
        r5 = r3.zzd();
        r7 = r2.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0161, code lost:
    
        if (r7 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0163, code lost:
    
        r2 = r0.zzE;
        r7 = r0.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0167, code lost:
    
        if (r2 >= r7) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0169, code lost:
    
        r0.zzE += r4.zza(r1, r7 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0272, code lost:
    
        r1 = r3.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0278, code lost:
    
        if (r0.zzG != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x027a, code lost:
    
        r1 = r1 | androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x027d, code lost:
    
        r19 = r1;
        r1 = r3.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0283, code lost:
    
        if (r1 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0285, code lost:
    
        r22 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x028c, code lost:
    
        r4.zze(r5, r19, r0.zzD, 0, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0299, code lost:
    
        r1 = r0.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x029f, code lost:
    
        if (r1.isEmpty() != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02a1, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzalo) r1.removeFirst();
        r2 = r0.zzy;
        r4 = r1.zzc;
        r0.zzy = r2 - r4;
        r7 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02b2, code lost:
    
        if (r1.zzb == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x02b4, code lost:
    
        r7 = r7 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x02b5, code lost:
    
        r1 = r7;
        r14 = r0.zzJ;
        r15 = r14.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02ba, code lost:
    
        if (r13 >= r15) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x02bc, code lost:
    
        r14[r13].zze(r1, 1, r4, r0.zzy, null);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02d3, code lost:
    
        if (r3.zzh() != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02d5, code lost:
    
        r0.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02d8, code lost:
    
        r0.zzs = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x028a, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0175, code lost:
    
        r9 = r0.zzh;
        r12 = r9.zzi();
        r12[0] = 0;
        r12[1] = 0;
        r12[2] = 0;
        r8 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0189, code lost:
    
        if (r0.zzE >= r0.zzD) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x018b, code lost:
    
        r13 = r0.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x018d, code lost:
    
        if (r13 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0192, code lost:
    
        if (r0.zzK.length > 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0196, code lost:
    
        if (r0.zzG != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x01a7, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x01a8, code lost:
    
        r1.zzc(r12, r8, r7 + r13);
        r9.zzh(0);
        r14 = r9.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x01b5, code lost:
    
        if (r14 < 0) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x01b7, code lost:
    
        r0.zzF = r14 - r13;
        r14 = r0.zzg;
        r14.zzh(0);
        r4.zzc(r14, 4);
        r0.zzE += 4;
        r0.zzD += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x01d0, code lost:
    
        if (r0.zzK.length <= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x01d2, code lost:
    
        if (r13 <= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x01da, code lost:
    
        if (com.google.android.gms.internal.ads.zzgp.zzb(r2.zzg, r12, 4) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x01dc, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x01df, code lost:
    
        r0.zzH = r11;
        r4.zzc(r9, r13);
        r0.zzE += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x01e9, code lost:
    
        if (r13 <= 0) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x01ed, code lost:
    
        if (r0.zzG != false) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x01f6, code lost:
    
        if (com.google.android.gms.internal.ads.zzgp.zzd(r12, 4, r13, r2.zzg) == false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01f8, code lost:
    
        r0.zzG = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01de, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0202, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0198, code lost:
    
        r13 = com.google.android.gms.internal.ads.zzgp.zzc(r2.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x01a5, code lost:
    
        if ((r7 + r13) <= (r0.zzD - r0.zzE)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0205, code lost:
    
        if (r0.zzH == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0207, code lost:
    
        r11 = r0.zzi;
        r11.zza(r13);
        r1.zzc(r11.zzi(), 0, r0.zzF);
        r4.zzc(r11, r0.zzF);
        r13 = r0.zzF;
        r10 = com.google.android.gms.internal.ads.zzgp.zza(r11.zzi(), r11.zze());
        r11.zzh(0);
        r11.zzf(r10);
        r10 = r2.zzg.zzr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0234, code lost:
    
        if (r10 != (-1)) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0236, code lost:
    
        r10 = r0.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x023c, code lost:
    
        if (r10.zzb() == 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x023e, code lost:
    
        r10.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x024d, code lost:
    
        r10 = r0.zzp;
        r10.zzc(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0258, code lost:
    
        if ((r3.zzg() & 4) == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x025a, code lost:
    
        r10.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0263, code lost:
    
        r0.zzE += r13;
        r0.zzF -= r13;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0242, code lost:
    
        r14 = r0.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0248, code lost:
    
        if (r14.zzb() == r10) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x024a, code lost:
    
        r14.zza(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x025e, code lost:
    
        r13 = r4.zza(r1, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x083a, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
     */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzafz zzafzVar2;
        com.google.android.gms.internal.ads.zzagy zzagyVar2;
        com.google.android.gms.internal.ads.zzalr zzalrVar;
        long zzv;
        long zzv2;
        java.lang.String str;
        java.lang.String str2;
        long zzz;
        long j;
        com.google.android.gms.internal.ads.zzalr zzalrVar2;
        com.google.android.gms.internal.ads.zzagy zzagyVar3;
        int i;
        int i2;
        android.util.SparseArray sparseArray;
        android.util.SparseArray sparseArray2;
        int i3;
        int i4;
        long zzz2;
        com.google.android.gms.internal.ads.zzalr zzalrVar3 = this;
        com.google.android.gms.internal.ads.zzafz zzafzVar3 = zzafzVar;
        com.google.android.gms.internal.ads.zzagy zzagyVar4 = zzagyVar;
        while (true) {
            int i5 = zzalrVar3.zzs;
            int i6 = 8;
            boolean z = true;
            if (i5 == 0) {
                zzafzVar2 = zzafzVar3;
                zzagyVar2 = zzagyVar4;
                zzalrVar = zzalrVar3;
                if (zzalrVar.zzv == 0) {
                    com.google.android.gms.internal.ads.zzet zzetVar = zzalrVar.zzm;
                    if (!zzafzVar2.zzb(zzetVar.zzi(), 0, 8, true)) {
                        long j2 = zzalrVar.zzN;
                        if (j2 == -1) {
                            zzalrVar.zzp.zze();
                            return -1;
                        }
                        zzagyVar2.zza = j2;
                        zzalrVar.zzN = -1L;
                        zzalrVar.zzI.zzw(zzalrVar.zzq.zzb());
                        zzalrVar.zzM = true;
                        return 1;
                    }
                    zzalrVar.zzv = 8;
                    zzetVar.zzh(0);
                    zzalrVar.zzu = zzetVar.zzz();
                    zzalrVar.zzt = zzetVar.zzB();
                }
                long j3 = zzalrVar.zzu;
                if (j3 == 1) {
                    com.google.android.gms.internal.ads.zzet zzetVar2 = zzalrVar.zzm;
                    zzafzVar2.zzc(zzetVar2.zzi(), 8, 8);
                    zzalrVar.zzv += 8;
                    zzalrVar.zzu = zzetVar2.zzJ();
                } else if (j3 == 0) {
                    long zzo = zzafzVar.zzo();
                    if (zzo == -1) {
                        java.util.ArrayDeque arrayDeque = zzalrVar.zzn;
                        zzo = !arrayDeque.isEmpty() ? ((com.google.android.gms.internal.ads.zzfx) arrayDeque.peek()).zza : -1L;
                    }
                    if (zzo != -1) {
                        zzalrVar.zzu = (zzo - zzafzVar.zzn()) + zzalrVar.zzv;
                    }
                }
                long j4 = zzalrVar.zzu;
                int i7 = zzalrVar.zzv;
                long j5 = i7;
                if (j4 < j5) {
                    if (zzalrVar.zzt != 1718773093 || i7 != 8) {
                        break;
                    }
                    zzalrVar.zzu = j5;
                    j4 = j5;
                }
                if (zzalrVar.zzN != -1) {
                    if (zzalrVar.zzt == 1936286840) {
                        com.google.android.gms.internal.ads.zzet zzetVar3 = zzalrVar.zzk;
                        zzetVar3.zza((int) j4);
                        java.lang.System.arraycopy(zzalrVar.zzm.zzi(), 0, zzetVar3.zzi(), 0, 8);
                        zzafzVar2.zzc(zzetVar3.zzi(), 8, (int) (zzalrVar.zzu - zzalrVar.zzv));
                        zzalrVar.zzq.zza((com.google.android.gms.internal.ads.zzafm) zzm(new com.google.android.gms.internal.ads.zzfy(1936286840, zzetVar3).zza, zzafzVar.zzm()).second);
                    } else {
                        zzafzVar2.zze((int) (j4 - j5), true);
                    }
                    zzi();
                } else {
                    long zzn = zzafzVar.zzn() - j5;
                    int i8 = zzalrVar.zzt;
                    if ((i8 == 1836019558 || i8 == 1835295092) && !zzalrVar.zzL) {
                        if (zzafzVar.zzo() == -1 || zzalrVar.zzO != -1 || (zzalrVar.zzd & 512) == 0) {
                            zzalrVar.zzI.zzw(new com.google.android.gms.internal.ads.zzaha(zzalrVar.zzA, zzn));
                            zzalrVar.zzL = true;
                        } else {
                            zzalrVar.zzO = zzn;
                            zzagyVar2.zza = zzafzVar.zzo() - 16;
                            zzalrVar.zzs = 5;
                        }
                    }
                    if (zzalrVar.zzt == 1836019558) {
                        android.util.SparseArray sparseArray3 = zzalrVar.zzf;
                        int size = sparseArray3.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            com.google.android.gms.internal.ads.zzamk zzamkVar = ((com.google.android.gms.internal.ads.zzalq) sparseArray3.valueAt(i9)).zzb;
                            zzamkVar.zzc = zzn;
                            zzamkVar.zzb = zzn;
                        }
                    }
                    int i10 = zzalrVar.zzt;
                    if (i10 == 1835295092) {
                        zzalrVar.zzC = null;
                        zzalrVar.zzx = zzn + zzalrVar.zzu;
                        zzalrVar.zzs = 2;
                    } else if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227 || i10 == 1835365473) {
                        long zzn2 = zzafzVar.zzn();
                        long j6 = zzalrVar.zzu;
                        long j7 = zzn2 + j6;
                        if (j6 != zzalrVar.zzv && i10 == 1835365473) {
                            com.google.android.gms.internal.ads.zzet zzetVar4 = zzalrVar.zzk;
                            zzetVar4.zza(8);
                            zzafzVar2.zzi(zzetVar4.zzi(), 0, 8);
                            com.google.android.gms.internal.ads.zzalj.zzf(zzetVar4);
                            zzafzVar2.zzf(zzetVar4.zzg());
                            zzafzVar.zzl();
                        }
                        long j8 = j7 - 8;
                        zzalrVar.zzn.push(new com.google.android.gms.internal.ads.zzfx(zzalrVar.zzt, j8));
                        if (zzalrVar.zzu == zzalrVar.zzv) {
                            zzalrVar.zzj(j8);
                        } else {
                            zzi();
                        }
                    } else if (i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
                        if (zzalrVar.zzv != 8) {
                            throw com.google.android.gms.internal.ads.zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (zzalrVar.zzu > 2147483647L) {
                            throw com.google.android.gms.internal.ads.zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        com.google.android.gms.internal.ads.zzet zzetVar5 = new com.google.android.gms.internal.ads.zzet((int) zzalrVar.zzu);
                        java.lang.System.arraycopy(zzalrVar.zzm.zzi(), 0, zzetVar5.zzi(), 0, 8);
                        zzalrVar.zzw = zzetVar5;
                        zzalrVar.zzs = 1;
                    } else {
                        if (zzalrVar.zzu > 2147483647L) {
                            throw com.google.android.gms.internal.ads.zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        zzalrVar.zzw = null;
                        zzalrVar.zzs = 1;
                    }
                }
                if (zzalrVar.zzs == 5) {
                    return 1;
                }
            } else if (i5 != 1) {
                long j9 = Long.MAX_VALUE;
                if (i5 == 2) {
                    zzafzVar2 = zzafzVar3;
                    zzagyVar2 = zzagyVar4;
                    zzalrVar = zzalrVar3;
                    android.util.SparseArray sparseArray4 = zzalrVar.zzf;
                    int size2 = sparseArray4.size();
                    com.google.android.gms.internal.ads.zzalq zzalqVar = null;
                    for (int i11 = 0; i11 < size2; i11++) {
                        com.google.android.gms.internal.ads.zzamk zzamkVar2 = ((com.google.android.gms.internal.ads.zzalq) sparseArray4.valueAt(i11)).zzb;
                        if (zzamkVar2.zzo) {
                            long j10 = zzamkVar2.zzc;
                            if (j10 < j9) {
                                zzalqVar = (com.google.android.gms.internal.ads.zzalq) sparseArray4.valueAt(i11);
                                j9 = j10;
                            }
                        }
                    }
                    if (zzalqVar == null) {
                        zzalrVar.zzs = 3;
                    } else {
                        int zzn3 = (int) (j9 - zzafzVar.zzn());
                        if (zzn3 < 0) {
                            throw com.google.android.gms.internal.ads.zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzafzVar2.zzf(zzn3);
                        com.google.android.gms.internal.ads.zzamk zzamkVar3 = zzalqVar.zzb;
                        com.google.android.gms.internal.ads.zzet zzetVar6 = zzamkVar3.zzn;
                        zzafzVar2.zzc(zzetVar6.zzi(), 0, zzetVar6.zze());
                        zzetVar6.zzh(0);
                        zzamkVar3.zzo = false;
                    }
                } else if (i5 == 5) {
                    zzagyVar2 = zzagyVar4;
                    zzalrVar = zzalrVar3;
                    com.google.android.gms.internal.ads.zzet zzetVar7 = zzalrVar.zzk;
                    zzetVar7.zza(16);
                    zzafzVar2 = zzafzVar;
                    if (zzafzVar2.zzb(zzetVar7.zzi(), 0, 16, true)) {
                        zzetVar7.zzh(0);
                        int zzB = zzetVar7.zzB();
                        int zzB2 = zzetVar7.zzB();
                        if (zzB == 16 && zzB2 == 1835430511) {
                            zzetVar7.zzk(4);
                            long zzz3 = zzetVar7.zzz();
                            long zzo2 = zzafzVar.zzo() - zzz3;
                            if (zzz3 <= 0 || zzz3 > 2147483647L || zzo2 < 0 || zzo2 < zzalrVar.zzO) {
                                zzalrVar.zzo(new com.google.android.gms.internal.ads.zzaha(zzalrVar.zzA, zzalrVar.zzO), zzagyVar2);
                            } else {
                                zzagyVar2.zza = zzo2;
                                zzalrVar.zzs = 6;
                            }
                        } else {
                            zzalrVar.zzo(new com.google.android.gms.internal.ads.zzaha(zzalrVar.zzA, zzalrVar.zzO), zzagyVar2);
                        }
                    } else {
                        zzalrVar.zzo(new com.google.android.gms.internal.ads.zzaha(zzalrVar.zzA, zzalrVar.zzO), zzagyVar2);
                    }
                    int i12 = zzalrVar.zzs;
                    if (i12 == 6 || i12 == 0) {
                        return 1;
                    }
                } else if (i5 != 6) {
                    com.google.android.gms.internal.ads.zzalq zzalqVar2 = zzalrVar3.zzC;
                    if (zzalqVar2 != null) {
                        break;
                    }
                    android.util.SparseArray sparseArray5 = zzalrVar3.zzf;
                    int size3 = sparseArray5.size();
                    com.google.android.gms.internal.ads.zzalq zzalqVar3 = null;
                    for (int i13 = 0; i13 < size3; i13++) {
                        com.google.android.gms.internal.ads.zzalq zzalqVar4 = (com.google.android.gms.internal.ads.zzalq) sparseArray5.valueAt(i13);
                        if ((zzalqVar4.zzk() || zzalqVar4.zzf != zzalqVar4.zzd.zzb) && (!zzalqVar4.zzk() || zzalqVar4.zzh != zzalqVar4.zzb.zzd)) {
                            long zze = zzalqVar4.zze();
                            if (zze < j9) {
                                j9 = zze;
                                zzalqVar3 = zzalqVar4;
                            }
                        }
                    }
                    if (zzalqVar3 == null) {
                        int zzn4 = (int) (zzalrVar3.zzx - zzafzVar.zzn());
                        if (zzn4 < 0) {
                            throw com.google.android.gms.internal.ads.zzat.zzb("Offset to end of mdat was negative.", null);
                        }
                        zzafzVar3.zzf(zzn4);
                        zzi();
                    } else {
                        int zze2 = (int) (zzalqVar3.zze() - zzafzVar.zzn());
                        if (zze2 < 0) {
                            com.google.android.gms.internal.ads.zzeg.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zze2 = 0;
                        }
                        zzafzVar3.zzf(zze2);
                        zzalrVar3.zzC = zzalqVar3;
                        zzalqVar2 = zzalqVar3;
                    }
                } else {
                    int zzo3 = (int) (zzafzVar.zzo() - zzafzVar.zzn());
                    com.google.android.gms.internal.ads.zzet zzetVar8 = new com.google.android.gms.internal.ads.zzet(zzo3);
                    zzafzVar3.zzc(zzetVar8.zzi(), 0, zzo3);
                    zzetVar8.zzh(0);
                    zzetVar8.zzh(zzetVar8.zzB() == 1 ? 16 : 8);
                    android.util.SparseArray sparseArray6 = new android.util.SparseArray();
                    android.util.SparseArray sparseArray7 = new android.util.SparseArray();
                    while (zzetVar8.zzd() >= i6) {
                        int zzg = zzetVar8.zzg();
                        long zzz4 = zzetVar8.zzz();
                        int zzB3 = zzetVar8.zzB();
                        if (zzz4 == 1) {
                            if (zzetVar8.zzd() < i6) {
                                break;
                            }
                            zzz4 = zzetVar8.zzD();
                        } else if (zzz4 == 0) {
                            zzz4 = zzetVar8.zze() - zzg;
                        }
                        if (zzz4 < (zzz4 == 1 ? 16 : 8)) {
                            break;
                        }
                        long j11 = zzg;
                        if (zzz4 > zzetVar8.zze() - j11) {
                            break;
                        }
                        if (zzB3 == 1952871009) {
                            if (zzz4 < r12 + 16) {
                                zzetVar8.zzh((int) (j11 + zzz4));
                            } else {
                                int zza2 = com.google.android.gms.internal.ads.zzalj.zza(zzetVar8.zzB());
                                int zzB4 = zzetVar8.zzB();
                                com.google.android.gms.internal.ads.zzalq zzalqVar5 = (com.google.android.gms.internal.ads.zzalq) zzalrVar3.zzf.get(zzB4);
                                if (zzalqVar5 == null) {
                                    zzetVar8.zzh((int) (j11 + zzz4));
                                } else {
                                    long j12 = zzalqVar5.zzd.zza.zzc;
                                    int zzB5 = zzetVar8.zzB();
                                    int i14 = zzB5 >> 4;
                                    int i15 = zzB5 >> 2;
                                    int i16 = zzB5 & 3;
                                    android.util.SparseArray sparseArray8 = sparseArray6;
                                    android.util.SparseArray sparseArray9 = sparseArray7;
                                    long zzz5 = zzetVar8.zzz();
                                    int i17 = (i14 & 3) + 1;
                                    int i18 = (i15 & 3) + 1;
                                    int i19 = i16 + 1;
                                    if (((zza2 == 1 ? 16L : 8L) + i17 + i18 + i19) * zzz5 > zzetVar8.zzd()) {
                                        zzetVar8.zzh((int) (j11 + zzz4));
                                        zzalrVar3 = this;
                                        sparseArray6 = sparseArray8;
                                        sparseArray7 = sparseArray9;
                                    } else {
                                        int i20 = (int) zzz5;
                                        long[] jArr = new long[i20];
                                        long[] jArr2 = new long[i20];
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            if (zza2 == 1) {
                                                i3 = i20;
                                                zzz2 = zzetVar8.zzJ();
                                                i4 = 1;
                                            } else {
                                                i3 = i20;
                                                i4 = zza2;
                                                zzz2 = zzetVar8.zzz();
                                            }
                                            long zzJ = i4 == 1 ? zzetVar8.zzJ() : zzetVar8.zzz();
                                            zzetVar8.zzk(i17 + i18 + i19);
                                            jArr[i21] = com.google.android.gms.internal.ads.zzfl.zzv(zzz2, 1000000L, j12, java.math.RoundingMode.DOWN);
                                            jArr2[i21] = zzJ;
                                            i21++;
                                            i20 = i3;
                                        }
                                        sparseArray = sparseArray8;
                                        sparseArray.put(zzB4, jArr);
                                        sparseArray2 = sparseArray9;
                                        sparseArray2.put(zzB4, jArr2);
                                    }
                                }
                            }
                            i6 = 8;
                        } else {
                            sparseArray = sparseArray6;
                            sparseArray2 = sparseArray7;
                        }
                        zzetVar8.zzh((int) (j11 + zzz4));
                        sparseArray6 = sparseArray;
                        sparseArray7 = sparseArray2;
                        i6 = 8;
                        zzalrVar3 = this;
                    }
                    android.util.SparseArray sparseArray10 = sparseArray6;
                    android.util.SparseArray sparseArray11 = sparseArray7;
                    if (sparseArray10.size() == 0) {
                        zzalrVar2 = this;
                        zzagyVar3 = zzagyVar;
                        zzalrVar2.zzo(new com.google.android.gms.internal.ads.zzaha(zzalrVar2.zzA, zzalrVar2.zzO), zzagyVar3);
                    } else {
                        zzalrVar2 = this;
                        zzagyVar3 = zzagyVar;
                        int i22 = -1;
                        int i23 = -1;
                        for (int i24 = 0; i24 < sparseArray10.size(); i24++) {
                            int keyAt = sparseArray10.keyAt(i24);
                            com.google.android.gms.internal.ads.zzalq zzalqVar6 = (com.google.android.gms.internal.ads.zzalq) zzalrVar2.zzf.get(keyAt);
                            if (zzalqVar6 != null) {
                                int i25 = zzalqVar6.zzd.zza.zzb;
                                if (i22 != -1) {
                                    i2 = i22;
                                } else if (i25 == 2) {
                                    i22 = keyAt;
                                } else {
                                    i2 = -1;
                                }
                                if (i23 == -1) {
                                    if (i25 == 1) {
                                        i23 = keyAt;
                                    } else {
                                        i22 = i2;
                                        i23 = -1;
                                    }
                                }
                                i22 = i2;
                            }
                        }
                        if (i22 == -1) {
                            if (i23 != -1) {
                                i = i23;
                                zzalrVar2.zzo(new com.google.android.gms.internal.ads.zzalp(sparseArray10, sparseArray11, zzalrVar2.zzA, zzalrVar2.zzO, i, null), zzagyVar3);
                            } else {
                                i22 = sparseArray10.keyAt(0);
                            }
                        }
                        i = i22;
                        zzalrVar2.zzo(new com.google.android.gms.internal.ads.zzalp(sparseArray10, sparseArray11, zzalrVar2.zzA, zzalrVar2.zzO, i, null), zzagyVar3);
                    }
                    if (zzalrVar2.zzs == 0) {
                        return 1;
                    }
                    zzafzVar3 = zzafzVar;
                    zzalrVar3 = zzalrVar2;
                    zzagyVar4 = zzagyVar3;
                }
            } else {
                zzafzVar2 = zzafzVar3;
                zzagyVar2 = zzagyVar4;
                zzalrVar = zzalrVar3;
                long j13 = zzalrVar.zzu - zzalrVar.zzv;
                com.google.android.gms.internal.ads.zzet zzetVar9 = zzalrVar.zzw;
                int i26 = (int) j13;
                if (zzetVar9 != null) {
                    zzafzVar2.zzc(zzetVar9.zzi(), 8, i26);
                    com.google.android.gms.internal.ads.zzfy zzfyVar = new com.google.android.gms.internal.ads.zzfy(zzalrVar.zzt, zzetVar9);
                    java.util.ArrayDeque arrayDeque2 = zzalrVar.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i27 = zzfyVar.zzd;
                        if (i27 == 1936286840) {
                            android.util.Pair zzm = zzm(zzfyVar.zza, zzafzVar.zzn());
                            com.google.android.gms.internal.ads.zzafn zzafnVar = zzalrVar.zzq;
                            zzafnVar.zza((com.google.android.gms.internal.ads.zzafm) zzm.second);
                            zzalrVar.zzB = ((java.lang.Long) zzm.first).longValue();
                            if (!zzalrVar.zzL) {
                                zzalrVar.zzI.zzw((com.google.android.gms.internal.ads.zzahb) zzm.second);
                                zzalrVar.zzL = true;
                            } else if ((zzalrVar.zzd & 256) != 0 && !zzalrVar.zzM && zzafnVar.zzc() > 1) {
                                zzalrVar.zzN = zzafzVar.zzn();
                            }
                        } else if (i27 == 1701671783) {
                            com.google.android.gms.internal.ads.zzet zzetVar10 = zzfyVar.zza;
                            if (zzalrVar.zzJ.length != 0) {
                                zzetVar10.zzh(8);
                                int zza3 = com.google.android.gms.internal.ads.zzalj.zza(zzetVar10.zzB());
                                if (zza3 == 0) {
                                    java.lang.String zzM = zzetVar10.zzM((char) 0);
                                    zzM.getClass();
                                    java.lang.String zzM2 = zzetVar10.zzM((char) 0);
                                    zzM2.getClass();
                                    long zzz6 = zzetVar10.zzz();
                                    zzv = com.google.android.gms.internal.ads.zzfl.zzv(zzetVar10.zzz(), 1000000L, zzz6, java.math.RoundingMode.DOWN);
                                    long j14 = zzalrVar.zzB;
                                    long j15 = j14 != -9223372036854775807L ? j14 + zzv : -9223372036854775807L;
                                    zzv2 = com.google.android.gms.internal.ads.zzfl.zzv(zzetVar10.zzz(), 1000L, zzz6, java.math.RoundingMode.DOWN);
                                    str = zzM;
                                    str2 = zzM2;
                                    zzz = zzetVar10.zzz();
                                    j = j15;
                                } else if (zza3 != 1) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza3).length() + 35);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(zza3);
                                    com.google.android.gms.internal.ads.zzeg.zzc("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long zzz7 = zzetVar10.zzz();
                                    long zzv3 = com.google.android.gms.internal.ads.zzfl.zzv(zzetVar10.zzJ(), 1000000L, zzz7, java.math.RoundingMode.DOWN);
                                    long zzv4 = com.google.android.gms.internal.ads.zzfl.zzv(zzetVar10.zzz(), 1000L, zzz7, java.math.RoundingMode.DOWN);
                                    long zzz8 = zzetVar10.zzz();
                                    java.lang.String zzM3 = zzetVar10.zzM((char) 0);
                                    zzM3.getClass();
                                    java.lang.String zzM4 = zzetVar10.zzM((char) 0);
                                    zzM4.getClass();
                                    zzv2 = zzv4;
                                    zzz = zzz8;
                                    str = zzM3;
                                    str2 = zzM4;
                                    j = zzv3;
                                    zzv = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzetVar10.zzd()];
                                zzetVar10.zzm(bArr, 0, zzetVar10.zzd());
                                com.google.android.gms.internal.ads.zzet zzetVar11 = new com.google.android.gms.internal.ads.zzet(zzalrVar.zzl.zza(new com.google.android.gms.internal.ads.zzaja(str, str2, zzv2, zzz, bArr)));
                                int zzd = zzetVar11.zzd();
                                for (com.google.android.gms.internal.ads.zzahk zzahkVar : zzalrVar.zzJ) {
                                    zzetVar11.zzh(0);
                                    zzahkVar.zzc(zzetVar11, zzd);
                                }
                                if (j == -9223372036854775807L) {
                                    zzalrVar.zzo.addLast(new com.google.android.gms.internal.ads.zzalo(zzv, true, zzd));
                                    zzalrVar.zzy += zzd;
                                } else {
                                    java.util.ArrayDeque arrayDeque3 = zzalrVar.zzo;
                                    if (arrayDeque3.isEmpty()) {
                                        for (com.google.android.gms.internal.ads.zzahk zzahkVar2 : zzalrVar.zzJ) {
                                            zzahkVar2.zze(j, 1, zzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new com.google.android.gms.internal.ads.zzalo(j, false, zzd));
                                        zzalrVar.zzy += zzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((com.google.android.gms.internal.ads.zzfx) arrayDeque2.peek()).zza(zzfyVar);
                    }
                } else {
                    zzafzVar2.zzf(i26);
                }
                zzalrVar.zzj(zzafzVar.zzn());
            }
            zzalrVar3 = zzalrVar;
            zzagyVar4 = zzagyVar2;
            zzafzVar3 = zzafzVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        android.util.SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.internal.ads.zzalq) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        this.zzO = -1L;
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    final /* synthetic */ void zzh(long j, com.google.android.gms.internal.ads.zzet zzetVar) {
        com.google.android.gms.internal.ads.zzafl.zza(j, zzetVar, this.zzK);
    }

    public zzalr(com.google.android.gms.internal.ads.zzanj zzanjVar, int i, com.google.android.gms.internal.ads.zzfi zzfiVar, com.google.android.gms.internal.ads.zzami zzamiVar, java.util.List list, com.google.android.gms.internal.ads.zzahk zzahkVar) {
        this.zzc = zzanjVar;
        this.zzd = i;
        this.zze = java.util.Collections.unmodifiableList(list);
        this.zzl = new com.google.android.gms.internal.ads.zzajb();
        this.zzm = new com.google.android.gms.internal.ads.zzet(16);
        this.zzg = new com.google.android.gms.internal.ads.zzet(com.google.android.gms.internal.ads.zzgp.zza);
        this.zzh = new com.google.android.gms.internal.ads.zzet(6);
        this.zzi = new com.google.android.gms.internal.ads.zzet();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new com.google.android.gms.internal.ads.zzet(bArr);
        this.zzn = new java.util.ArrayDeque();
        this.zzo = new java.util.ArrayDeque();
        this.zzf = new android.util.SparseArray();
        this.zzr = com.google.android.gms.internal.ads.zzgwm.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = com.google.android.gms.internal.ads.zzagb.zza;
        this.zzJ = new com.google.android.gms.internal.ads.zzahk[0];
        this.zzK = new com.google.android.gms.internal.ads.zzahk[0];
        this.zzp = new com.google.android.gms.internal.ads.zzgz(new com.google.android.gms.internal.ads.zzgy() { // from class: com.google.android.gms.internal.ads.zzaln
            @Override // com.google.android.gms.internal.ads.zzgy
            public final /* synthetic */ void zza(long j, com.google.android.gms.internal.ads.zzet zzetVar) {
                com.google.android.gms.internal.ads.zzalr.this.zzh(j, zzetVar);
            }
        });
        this.zzq = new com.google.android.gms.internal.ads.zzafn();
        this.zzN = -1L;
        this.zzO = -1L;
    }
}
