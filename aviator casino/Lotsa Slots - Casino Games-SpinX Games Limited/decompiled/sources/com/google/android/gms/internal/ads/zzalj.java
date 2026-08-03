package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzalj {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzb = "OpusHead".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.List zzb(com.google.android.gms.internal.ads.zzfx r76, com.google.android.gms.internal.ads.zzagr r77, long r78, com.google.android.gms.internal.ads.zzq r80, boolean r81, boolean r82, com.google.android.gms.internal.ads.zzgta r83, boolean r84) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 3632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.zzb(com.google.android.gms.internal.ads.zzfx, com.google.android.gms.internal.ads.zzagr, long, com.google.android.gms.internal.ads.zzq, boolean, boolean, com.google.android.gms.internal.ads.zzgta, boolean):java.util.List");
    }

    public static com.google.android.gms.internal.ads.zzap zzc(com.google.android.gms.internal.ads.zzfy zzfyVar) {
        int zzF;
        com.google.android.gms.internal.ads.zzet zzetVar = zzfyVar.zza;
        zzetVar.zzh(8);
        com.google.android.gms.internal.ads.zzap zzapVar = new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, new com.google.android.gms.internal.ads.zzao[0]);
        while (zzetVar.zzd() >= 8) {
            int zzg = zzetVar.zzg();
            int zzB = zzetVar.zzB() + zzg;
            int zzB2 = zzetVar.zzB();
            com.google.android.gms.internal.ads.zzap zzapVar2 = null;
            if (zzB2 == 1835365473) {
                zzetVar.zzh(zzg);
                zzetVar.zzk(8);
                zzf(zzetVar);
                while (true) {
                    if (zzetVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg2 = zzetVar.zzg();
                    int zzB3 = zzetVar.zzB() + zzg2;
                    if (zzetVar.zzB() == 1768715124) {
                        zzetVar.zzh(zzg2);
                        zzetVar.zzk(8);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (zzetVar.zzg() < zzB3) {
                            com.google.android.gms.internal.ads.zzao zzc = com.google.android.gms.internal.ads.zzalt.zzc(zzetVar);
                            if (zzc != null) {
                                arrayList.add(zzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new com.google.android.gms.internal.ads.zzap(arrayList);
                        }
                    } else {
                        zzetVar.zzh(zzB3);
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == 1936553057) {
                zzetVar.zzh(zzg);
                zzetVar.zzk(12);
                while (true) {
                    if (zzetVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg3 = zzetVar.zzg();
                    int zzB4 = zzetVar.zzB();
                    if (zzetVar.zzB() != 1935766900) {
                        zzetVar.zzh(zzg3 + zzB4);
                    } else if (zzB4 >= 16) {
                        zzetVar.zzk(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzs = zzetVar.zzs();
                            int zzs2 = zzetVar.zzs();
                            if (zzs == 0) {
                                i = zzs2;
                            } else if (zzs == 1) {
                                i2 = zzs2;
                            }
                        }
                        if (i == 12) {
                            zzF = 240;
                        } else if (i == 13) {
                            zzF = 120;
                        } else {
                            if (i == 21 && zzetVar.zzd() >= 8 && zzetVar.zzg() + 8 <= zzB) {
                                int zzB5 = zzetVar.zzB();
                                int zzB6 = zzetVar.zzB();
                                if (zzB5 >= 12 && zzB6 == 1936877170) {
                                    zzF = zzetVar.zzF();
                                }
                            }
                            zzF = -2147483647;
                        }
                        if (zzF != -2147483647) {
                            zzapVar2 = new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, new com.google.android.gms.internal.ads.zzajx(zzF, i2));
                        }
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzi(zzetVar));
            } else if (zzB2 == 1667788908) {
                zzapVar = zzapVar.zzf(zzh(zzetVar));
            }
            zzetVar.zzh(zzB);
        }
        return zzapVar;
    }

    public static com.google.android.gms.internal.ads.zzgb zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        long zzD;
        long zzD2;
        zzetVar.zzh(8);
        if (zza(zzetVar.zzB()) == 0) {
            zzD = zzetVar.zzz();
            zzD2 = zzetVar.zzz();
        } else {
            zzD = zzetVar.zzD();
            zzD2 = zzetVar.zzD();
        }
        return new com.google.android.gms.internal.ads.zzgb(zzD, zzD2, zzetVar.zzz());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r8 = r12.zzB();
        r10 = r12.zzB();
        r9 = r9 - 16;
        r11 = new byte[r9];
        r12.zzm(r11, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        r9 = new com.google.android.gms.internal.ads.zzfv(r7, r11, r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        java.lang.String.valueOf(r7);
        com.google.android.gms.internal.ads.zzeg.zzc("MetadataUtil", "Failed to parse metadata entry with key: ".concat(java.lang.String.valueOf(r7)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzap zze(com.google.android.gms.internal.ads.zzfx zzfxVar) {
        com.google.android.gms.internal.ads.zzfy zzc = zzfxVar.zzc(1751411826);
        com.google.android.gms.internal.ads.zzfy zzc2 = zzfxVar.zzc(1801812339);
        com.google.android.gms.internal.ads.zzfy zzc3 = zzfxVar.zzc(1768715124);
        if (zzc != null && zzc2 != null && zzc3 != null && zzj(zzc.zza) == 1835299937) {
            com.google.android.gms.internal.ads.zzet zzetVar = zzc2.zza;
            zzetVar.zzh(12);
            int zzB = zzetVar.zzB();
            java.lang.String[] strArr = new java.lang.String[zzB];
            for (int i = 0; i < zzB; i++) {
                int zzB2 = zzetVar.zzB();
                zzetVar.zzk(4);
                strArr[i] = zzetVar.zzK(zzB2 - 8, java.nio.charset.StandardCharsets.UTF_8);
            }
            com.google.android.gms.internal.ads.zzet zzetVar2 = zzc3.zza;
            zzetVar2.zzh(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (zzetVar2.zzd() > 8) {
                int zzg = zzetVar2.zzg() + zzetVar2.zzB();
                int zzB3 = zzetVar2.zzB() - 1;
                if (zzB3 < 0 || zzB3 >= zzB) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(zzB3);
                    com.google.android.gms.internal.ads.zzeg.zzc("BoxParsers", sb.toString());
                } else {
                    java.lang.String str = strArr[zzB3];
                    while (true) {
                        int zzg2 = zzetVar2.zzg();
                        if (zzg2 >= zzg) {
                            break;
                        }
                        int zzB4 = zzetVar2.zzB();
                        if (zzetVar2.zzB() == 1684108385) {
                            break;
                        }
                        zzetVar2.zzh(zzg2 + zzB4);
                    }
                    com.google.android.gms.internal.ads.zzfv zzfvVar = null;
                    if (zzfvVar != null) {
                        arrayList.add(zzfvVar);
                    }
                }
                zzetVar2.zzh(zzg);
            }
            if (!arrayList.isEmpty()) {
                return new com.google.android.gms.internal.ads.zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzg = zzetVar.zzg();
        zzetVar.zzk(4);
        if (zzetVar.zzB() != 1751411826) {
            zzg += 4;
        }
        zzetVar.zzh(zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0444  */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzaml zzg(com.google.android.gms.internal.ads.zzami zzamiVar, com.google.android.gms.internal.ads.zzfx zzfxVar, com.google.android.gms.internal.ads.zzagr zzagrVar, boolean z) throws com.google.android.gms.internal.ads.zzat {
        com.google.android.gms.internal.ads.zzald zzalhVar;
        boolean z2;
        int i;
        com.google.android.gms.internal.ads.zzet zzetVar;
        int i2;
        int i3;
        int zzb2;
        boolean z3;
        com.google.android.gms.internal.ads.zzv zzvVar;
        int[] iArr;
        boolean z4;
        boolean z5;
        long[] jArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        long[] jArr2;
        int i9;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long j2;
        int i10;
        int i11;
        com.google.android.gms.internal.ads.zzet zzetVar2;
        int i12;
        long j3;
        long[] jArr4;
        long j4;
        java.util.ArrayList arrayList;
        int i13;
        int i14;
        com.google.android.gms.internal.ads.zzami zzamiVar2;
        int[] iArr4;
        int[] iArr5;
        int i15;
        java.util.ArrayList arrayList2;
        long[] jArr5;
        int i16;
        int[] iArr6;
        long[] jArr6;
        int[] iArr7;
        com.google.android.gms.internal.ads.zzami zzamiVar3;
        int i17;
        int i18;
        int length;
        long j5;
        com.google.android.gms.internal.ads.zzami zzamiVar4 = zzamiVar;
        com.google.android.gms.internal.ads.zzfy zzc = zzfxVar.zzc(1937011578);
        if (zzc != null) {
            zzalhVar = new com.google.android.gms.internal.ads.zzalg(zzc, zzamiVar4.zzg);
        } else {
            com.google.android.gms.internal.ads.zzfy zzc2 = zzfxVar.zzc(1937013298);
            if (zzc2 == null) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Track has no sample table size information", null);
            }
            zzalhVar = new com.google.android.gms.internal.ads.zzalh(zzc2);
        }
        int zza2 = zzalhVar.zza();
        if (zza2 == 0) {
            return new com.google.android.gms.internal.ads.zzaml(zzamiVar, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzamiVar4.zzb == 2) {
            long j6 = zzamiVar4.zzf;
            if (j6 > 0) {
                com.google.android.gms.internal.ads.zzt zza3 = zzamiVar4.zzg.zza();
                zza3.zzz(zza2 / (j6 / 1000000.0f));
                zzamiVar4 = zzamiVar4.zzb(zza3.zzO());
            }
        }
        com.google.android.gms.internal.ads.zzfy zzc3 = zzfxVar.zzc(1937007471);
        if (zzc3 == null) {
            zzc3 = zzfxVar.zzc(1668232756);
            zzc3.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        com.google.android.gms.internal.ads.zzfy zzc4 = zzfxVar.zzc(1937011555);
        zzc4.getClass();
        com.google.android.gms.internal.ads.zzet zzetVar3 = zzc4.zza;
        com.google.android.gms.internal.ads.zzfy zzc5 = zzfxVar.zzc(1937011827);
        zzc5.getClass();
        com.google.android.gms.internal.ads.zzet zzetVar4 = zzc5.zza;
        com.google.android.gms.internal.ads.zzfy zzc6 = zzfxVar.zzc(1937011571);
        com.google.android.gms.internal.ads.zzet zzetVar5 = zzc6 != null ? zzc6.zza : null;
        com.google.android.gms.internal.ads.zzfy zzc7 = zzfxVar.zzc(1668576371);
        com.google.android.gms.internal.ads.zzet zzetVar6 = zzc7 != null ? zzc7.zza : null;
        com.google.android.gms.internal.ads.zzakz zzakzVar = new com.google.android.gms.internal.ads.zzakz(zzetVar3, zzc3.zza, z2);
        zzetVar4.zzh(12);
        int zzH = zzetVar4.zzH() - 1;
        int zzH2 = zzetVar4.zzH();
        int zzH3 = zzetVar4.zzH();
        if (zzetVar6 != null) {
            zzetVar6.zzh(12);
            i = zzetVar6.zzH();
        } else {
            i = 0;
        }
        if (zzetVar5 != null) {
            zzetVar5.zzh(12);
            int zzH4 = zzetVar5.zzH();
            if (zzH4 > 0) {
                i3 = zzetVar5.zzH() - 1;
                com.google.android.gms.internal.ads.zzet zzetVar7 = zzetVar5;
                i2 = zzH4;
                zzetVar = zzetVar7;
                zzb2 = zzalhVar.zzb();
                com.google.android.gms.internal.ads.zzv zzvVar2 = zzamiVar4.zzg;
                if (zzb2 != -1) {
                    java.lang.String str = zzvVar2.zzp;
                    if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && zzH == 0) {
                        z3 = i == 0 && i2 == 0;
                        zzH = 0;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        ?? r31 = zzetVar == null ? 1 : 0;
                        if (z3) {
                            int i19 = zzakzVar.zza;
                            long[] jArr7 = new long[i19];
                            int[] iArr8 = new int[i19];
                            while (zzakzVar.zza()) {
                                int i20 = zzakzVar.zzb;
                                jArr7[i20] = zzakzVar.zzd;
                                iArr8[i20] = zzakzVar.zzc;
                            }
                            long j7 = zzH3;
                            int i21 = 8192 / zzb2;
                            int i22 = 0;
                            for (int i23 = 0; i23 < i19; i23++) {
                                int i24 = iArr8[i23];
                                java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                                i22 += ((i24 + i21) - 1) / i21;
                            }
                            long[] jArr8 = new long[i22];
                            iArr2 = new int[i22];
                            jArr3 = new long[i22];
                            iArr3 = new int[i22];
                            zzvVar = zzvVar2;
                            int i25 = i22;
                            int i26 = 0;
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            int i30 = 0;
                            while (i28 < i19) {
                                int i31 = iArr8[i28];
                                long j8 = jArr7[i28];
                                int i32 = i30;
                                int i33 = i19;
                                int i34 = i29;
                                int i35 = i32;
                                long[] jArr9 = jArr7;
                                int i36 = i31;
                                while (i36 > 0) {
                                    int min = java.lang.Math.min(i21, i36);
                                    jArr8[i35] = j8;
                                    int[] iArr9 = iArr8;
                                    int i37 = zzb2 * min;
                                    iArr2[i35] = i37;
                                    i27 += i37;
                                    i34 = java.lang.Math.max(i34, i37);
                                    jArr3[i35] = i26 * j7;
                                    iArr3[i35] = 1;
                                    j8 += iArr2[i35];
                                    i26 += min;
                                    i36 -= min;
                                    i35++;
                                    zzb2 = zzb2;
                                    i21 = i21;
                                    iArr8 = iArr9;
                                }
                                i28++;
                                jArr7 = jArr9;
                                iArr8 = iArr8;
                                int i38 = i35;
                                i29 = i34;
                                i19 = i33;
                                i30 = i38;
                            }
                            long j9 = j7 * i26;
                            j2 = i27;
                            i9 = i25;
                            j = j9;
                            jArr2 = jArr8;
                            i10 = i29;
                        } else {
                            zzvVar = zzvVar2;
                            long[] jArr10 = new long[zza2];
                            int[] iArr10 = new int[zza2];
                            long[] jArr11 = new long[zza2];
                            int[] iArr11 = new int[zza2];
                            int i39 = i;
                            int i40 = i3;
                            int i41 = 0;
                            long j10 = 0;
                            long j11 = 0;
                            long j12 = 0;
                            int i42 = 0;
                            int i43 = 0;
                            int i44 = zzH;
                            int i45 = i2;
                            int i46 = 0;
                            int i47 = 0;
                            while (true) {
                                if (i46 >= zza2) {
                                    iArr = iArr11;
                                    break;
                                }
                                long j13 = j10;
                                int i48 = i47;
                                boolean z6 = true;
                                while (true) {
                                    if (i48 != 0) {
                                        i11 = zza2;
                                        zzetVar2 = zzetVar4;
                                        i12 = i48;
                                        break;
                                    }
                                    z6 = zzakzVar.zza();
                                    if (!z6) {
                                        i11 = zza2;
                                        zzetVar2 = zzetVar4;
                                        i12 = 0;
                                        break;
                                    }
                                    com.google.android.gms.internal.ads.zzet zzetVar8 = zzetVar4;
                                    long j14 = zzakzVar.zzd;
                                    i48 = zzakzVar.zzc;
                                    j13 = j14;
                                    zzetVar4 = zzetVar8;
                                    zza2 = zza2;
                                    z6 = z6;
                                }
                                if (!z6) {
                                    com.google.android.gms.internal.ads.zzeg.zzc("BoxParsers", "Unexpected end of chunk data");
                                    jArr10 = java.util.Arrays.copyOf(jArr10, i46);
                                    iArr10 = java.util.Arrays.copyOf(iArr10, i46);
                                    jArr11 = java.util.Arrays.copyOf(jArr11, i46);
                                    zza2 = i46;
                                    i47 = i48;
                                    iArr = java.util.Arrays.copyOf(iArr11, i46);
                                    break;
                                }
                                if (zzetVar6 != null) {
                                    while (true) {
                                        if (i41 != 0) {
                                            break;
                                        }
                                        if (i39 <= 0) {
                                            i41 = 0;
                                            break;
                                        }
                                        i39--;
                                        i41 = zzetVar6.zzH();
                                        i42 = zzetVar6.zzB();
                                    }
                                    i41--;
                                }
                                int i49 = i42;
                                int zzc8 = zzalhVar.zzc();
                                com.google.android.gms.internal.ads.zzald zzaldVar = zzalhVar;
                                com.google.android.gms.internal.ads.zzakz zzakzVar2 = zzakzVar;
                                long j15 = zzc8;
                                j12 += j15;
                                int i50 = i43;
                                i43 = zzc8 > i50 ? zzc8 : i50;
                                jArr10[i46] = j13;
                                iArr10[i46] = zzc8;
                                jArr11[i46] = j11 + i49;
                                iArr11[i46] = r31;
                                int i51 = i40;
                                if (i46 == i51) {
                                    iArr11[i46] = 1;
                                    arrayList3.add(java.lang.Integer.valueOf(i46));
                                }
                                if (zzetVar != null && i46 == i51 && i45 - 1 > 0) {
                                    i51 = zzetVar.zzH() - 1;
                                }
                                i40 = i51;
                                j11 += zzH3;
                                zzH2--;
                                if (zzH2 == 0) {
                                    if (i44 > 0) {
                                        i44--;
                                        zzH2 = zzetVar2.zzH();
                                        zzH3 = zzetVar2.zzB();
                                    } else {
                                        zzH2 = 0;
                                    }
                                }
                                long j16 = j13 + j15;
                                i47 = i12 - 1;
                                i46++;
                                i42 = i49;
                                zzetVar4 = zzetVar2;
                                zza2 = i11;
                                zzalhVar = zzaldVar;
                                j10 = j16;
                                zzakzVar = zzakzVar2;
                            }
                            long j17 = j11 + i42;
                            if (zzetVar6 != null) {
                                while (i39 > 0) {
                                    if (zzetVar6.zzH() != 0) {
                                        z4 = false;
                                        break;
                                    }
                                    zzetVar6.zzB();
                                    i39--;
                                }
                            }
                            z4 = true;
                            if (i45 != 0) {
                                z5 = z4;
                                jArr = jArr10;
                                i4 = zzH2;
                                i5 = i45;
                                i6 = i44;
                                i7 = i41;
                            } else if (zzH2 != 0) {
                                z5 = z4;
                                jArr = jArr10;
                                i4 = zzH2;
                                i6 = i44;
                                i7 = i41;
                                i5 = 0;
                            } else if (i47 == 0) {
                                if (i44 != 0) {
                                    z5 = z4;
                                    jArr = jArr10;
                                    i6 = i44;
                                    i7 = i41;
                                    i5 = 0;
                                    i4 = 0;
                                } else if (i41 != 0) {
                                    z5 = z4;
                                    jArr = jArr10;
                                    i7 = i41;
                                    i5 = 0;
                                    i4 = 0;
                                    i6 = 0;
                                } else if (z4) {
                                    jArr = jArr10;
                                    i8 = zza2;
                                    j = j17;
                                    jArr2 = jArr;
                                    i9 = i8;
                                    iArr2 = iArr10;
                                    jArr3 = jArr11;
                                    iArr3 = iArr;
                                    j2 = j12;
                                    i10 = i43;
                                } else {
                                    jArr = jArr10;
                                    i5 = 0;
                                    i4 = 0;
                                    i6 = 0;
                                    i7 = 0;
                                    z5 = false;
                                }
                                i47 = 0;
                            } else {
                                z5 = z4;
                                jArr = jArr10;
                                i6 = i44;
                                i7 = i41;
                                i5 = 0;
                                i4 = 0;
                            }
                            int i52 = zzamiVar4.zza;
                            int length2 = java.lang.String.valueOf(i52).length() + 66 + java.lang.String.valueOf(i5).length() + 35 + java.lang.String.valueOf(i4).length() + 26 + java.lang.String.valueOf(i47).length() + 33 + java.lang.String.valueOf(i6).length() + 36;
                            int length3 = java.lang.String.valueOf(i7).length();
                            i8 = zza2;
                            java.lang.String str3 = true != z5 ? ", ctts invalid" : "";
                            j = j17;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(length2 + length3 + str3.length());
                            sb.append("Inconsistent stbl box for track ");
                            sb.append(i52);
                            sb.append(": remainingSynchronizationSamples ");
                            sb.append(i5);
                            sb.append(", remainingSamplesAtTimestampDelta ");
                            sb.append(i4);
                            sb.append(", remainingSamplesInChunk ");
                            sb.append(i47);
                            sb.append(", remainingTimestampDeltaChanges ");
                            sb.append(i6);
                            sb.append(", remainingSamplesAtTimestampOffset ");
                            sb.append(i7);
                            sb.append(str3);
                            com.google.android.gms.internal.ads.zzeg.zzc("BoxParsers", sb.toString());
                            jArr2 = jArr;
                            i9 = i8;
                            iArr2 = iArr10;
                            jArr3 = jArr11;
                            iArr3 = iArr;
                            j2 = j12;
                            i10 = i43;
                        }
                        j3 = zzamiVar4.zzf;
                        if (j3 > 0) {
                            long zzv = com.google.android.gms.internal.ads.zzfl.zzv(8 * j2, 1000000L, j3, java.math.RoundingMode.HALF_DOWN);
                            if (zzv > 0 && zzv < 2147483647L) {
                                com.google.android.gms.internal.ads.zzt zza4 = zzvVar.zza();
                                zza4.zzi((int) zzv);
                                zzamiVar4 = zzamiVar4.zzb(zza4.zzO());
                            }
                        }
                        long j18 = zzamiVar4.zzc;
                        long zzv2 = com.google.android.gms.internal.ads.zzfl.zzv(j, 1000000L, j18, java.math.RoundingMode.DOWN);
                        int[] zzf = com.google.android.gms.internal.ads.zzhah.zzf(arrayList3);
                        jArr4 = zzamiVar4.zzi;
                        if (jArr4 == null) {
                            com.google.android.gms.internal.ads.zzfl.zzw(jArr3, 1000000L, j18);
                            return new com.google.android.gms.internal.ads.zzaml(zzamiVar4, jArr2, iArr2, i10, jArr3, iArr3, zzf, r31, zzv2, i9);
                        }
                        int length4 = jArr4.length;
                        if (length4 == 1) {
                            if (zzamiVar4.zzb != 1 || (length = jArr3.length) < 2) {
                                j4 = j18;
                                arrayList = arrayList3;
                                i13 = i9;
                            } else {
                                long[] jArr12 = zzamiVar4.zzj;
                                jArr12.getClass();
                                long j19 = jArr12[0];
                                long j20 = jArr4[0];
                                long j21 = zzamiVar4.zzd;
                                arrayList = arrayList3;
                                i13 = i9;
                                long zzv3 = j19 + com.google.android.gms.internal.ads.zzfl.zzv(j20, j18, j21, java.math.RoundingMode.DOWN);
                                int i53 = length - 1;
                                int max = java.lang.Math.max(0, java.lang.Math.min(4, i53));
                                int max2 = java.lang.Math.max(0, java.lang.Math.min(length - 4, i53));
                                if (jArr3[0] <= j19 && j19 < jArr3[max] && jArr3[max2] < zzv3 && zzv3 <= j + 2) {
                                    long max3 = java.lang.Math.max(0L, j - zzv3);
                                    long j22 = j19 - jArr3[0];
                                    long j23 = zzamiVar4.zzg.zzI;
                                    long zzv4 = com.google.android.gms.internal.ads.zzfl.zzv(j22, j23, j18, java.math.RoundingMode.DOWN);
                                    long zzv5 = com.google.android.gms.internal.ads.zzfl.zzv(max3, j23, j18, java.math.RoundingMode.DOWN);
                                    if (zzv4 != 0) {
                                        j5 = zzv4;
                                    } else if (zzv5 != 0) {
                                        j5 = 0;
                                    }
                                    if (j5 <= 2147483647L && zzv5 <= 2147483647L) {
                                        zzagrVar.zza = (int) j5;
                                        zzagrVar.zzb = (int) zzv5;
                                        com.google.android.gms.internal.ads.zzfl.zzw(jArr3, 1000000L, j18);
                                        return new com.google.android.gms.internal.ads.zzaml(zzamiVar4, jArr2, iArr2, i10, jArr3, iArr3, zzf, r31, com.google.android.gms.internal.ads.zzfl.zzv(jArr4[0], 1000000L, j21, java.math.RoundingMode.DOWN), i13);
                                    }
                                }
                                j4 = j18;
                            }
                            i14 = 1;
                            length4 = 1;
                        } else {
                            j4 = j18;
                            arrayList = arrayList3;
                            i13 = i9;
                            i14 = 1;
                        }
                        if (length4 == i14 && jArr4[0] == 0) {
                            long[] jArr13 = zzamiVar4.zzj;
                            jArr13.getClass();
                            long j24 = jArr13[0];
                            for (int i54 = 0; i54 < jArr3.length; i54++) {
                                jArr3[i54] = com.google.android.gms.internal.ads.zzfl.zzv(jArr3[i54] - j24, 1000000L, j4, java.math.RoundingMode.DOWN);
                            }
                            return new com.google.android.gms.internal.ads.zzaml(zzamiVar4, jArr2, iArr2, i10, jArr3, iArr3, zzf, r31, com.google.android.gms.internal.ads.zzfl.zzv(j - j24, 1000000L, j4, java.math.RoundingMode.DOWN), i13);
                        }
                        long j25 = j4;
                        boolean z7 = zzamiVar4.zzb == 1;
                        long[] jArr14 = zzamiVar4.zzj;
                        int[] iArr12 = new int[length4];
                        int[] iArr13 = new int[length4];
                        jArr14.getClass();
                        long[] jArr15 = jArr14;
                        int i55 = 0;
                        int i56 = 0;
                        int i57 = 0;
                        boolean z8 = false;
                        while (i56 < jArr4.length) {
                            long j26 = jArr15[i56];
                            if (j26 != -1) {
                                int i58 = i57;
                                jArr5 = jArr2;
                                com.google.android.gms.internal.ads.zzami zzamiVar5 = zzamiVar4;
                                iArr7 = iArr2;
                                int i59 = i55;
                                i16 = i56;
                                jArr6 = jArr14;
                                iArr6 = iArr13;
                                long zzv6 = com.google.android.gms.internal.ads.zzfl.zzv(jArr4[i56], j25, zzamiVar4.zzd, java.math.RoundingMode.DOWN) + j26;
                                iArr12[i16] = com.google.android.gms.internal.ads.zzfl.zzo(jArr3, j26, true, true);
                                int zzq = com.google.android.gms.internal.ads.zzfl.zzq(jArr3, zzv6, z7, false);
                                int i60 = zzq - 1;
                                int i61 = 0;
                                while (true) {
                                    if (zzq >= jArr3.length) {
                                        zzamiVar3 = zzamiVar5;
                                        break;
                                    }
                                    if (jArr3[zzq] >= zzv6) {
                                        i61++;
                                        zzamiVar3 = zzamiVar5;
                                        if (i61 > zzamiVar3.zzg.zzr) {
                                            break;
                                        }
                                    } else {
                                        i60 = zzq;
                                        zzamiVar3 = zzamiVar5;
                                    }
                                    zzq++;
                                    zzamiVar5 = zzamiVar3;
                                }
                                iArr6[i16] = i60 + 1;
                                int i62 = iArr12[i16];
                                while (true) {
                                    i17 = iArr12[i16];
                                    if (i17 <= 0) {
                                        i18 = 1;
                                        break;
                                    }
                                    i18 = 1;
                                    if ((iArr3[i17] & 1) != 0) {
                                        break;
                                    }
                                    iArr12[i16] = i17 - 1;
                                }
                                if (i17 == 0 && (iArr3[0] & i18) == 0) {
                                    iArr12[i16] = i62;
                                    while (true) {
                                        i17 = iArr12[i16];
                                        if (i17 >= iArr6[i16] || (iArr3[i17] & i18) != 0) {
                                            break;
                                        }
                                        iArr12[i16] = i17 + 1;
                                        i18 = 1;
                                    }
                                }
                                int i63 = iArr6[i16];
                                i57 = i58 + (i63 - i17);
                                i55 = i63;
                                z8 |= i59 != i17;
                            } else {
                                jArr5 = jArr2;
                                i16 = i56;
                                iArr6 = iArr13;
                                jArr6 = jArr14;
                                iArr7 = iArr2;
                                zzamiVar3 = zzamiVar4;
                            }
                            i56 = i16 + 1;
                            zzamiVar4 = zzamiVar3;
                            iArr2 = iArr7;
                            jArr14 = jArr6;
                            jArr2 = jArr5;
                            iArr13 = iArr6;
                        }
                        long[] jArr16 = jArr2;
                        int[] iArr14 = iArr13;
                        long[] jArr17 = jArr14;
                        int[] iArr15 = iArr2;
                        com.google.android.gms.internal.ads.zzami zzamiVar6 = zzamiVar4;
                        int i64 = i57;
                        boolean z9 = z8 | (i64 != i13);
                        long[] jArr18 = z9 ? new long[i64] : jArr16;
                        int[] iArr16 = z9 ? new int[i64] : iArr15;
                        if (true == z9) {
                            i10 = 0;
                        }
                        int[] iArr17 = z9 ? new int[i64] : iArr3;
                        java.util.ArrayList arrayList4 = z9 ? new java.util.ArrayList() : arrayList;
                        long[] jArr19 = new long[i64];
                        int i65 = i10;
                        int i66 = 0;
                        boolean z10 = false;
                        int i67 = 0;
                        long j27 = 0;
                        while (i67 < jArr4.length) {
                            long j28 = jArr17[i67];
                            int i68 = iArr12[i67];
                            boolean z11 = z10;
                            int i69 = iArr14[i67];
                            java.util.ArrayList arrayList5 = arrayList4;
                            if (z9) {
                                int i70 = i69 - i68;
                                iArr4 = iArr12;
                                java.lang.System.arraycopy(jArr16, i68, jArr18, i66, i70);
                                iArr5 = iArr15;
                                java.lang.System.arraycopy(iArr5, i68, iArr16, i66, i70);
                                java.lang.System.arraycopy(iArr3, i68, iArr17, i66, i70);
                            } else {
                                iArr4 = iArr12;
                                iArr5 = iArr15;
                            }
                            boolean z12 = z11;
                            int i71 = i66;
                            int i72 = i65;
                            while (i68 < i69) {
                                long zzv7 = com.google.android.gms.internal.ads.zzfl.zzv(j27, 1000000L, zzamiVar6.zzd, java.math.RoundingMode.DOWN);
                                int i73 = i68;
                                int i74 = i69;
                                java.util.ArrayList arrayList6 = arrayList5;
                                int i75 = i72;
                                int i76 = i67;
                                long[] jArr20 = jArr3;
                                com.google.android.gms.internal.ads.zzami zzamiVar7 = zzamiVar6;
                                long zzv8 = com.google.android.gms.internal.ads.zzfl.zzv(jArr3[i68] - j28, 1000000L, j25, java.math.RoundingMode.DOWN);
                                z12 = (!(zzv8 >= 0)) | z12;
                                jArr19[i71] = zzv7 + zzv8;
                                if (z9) {
                                    i15 = i75;
                                    if (iArr16[i71] > i15) {
                                        i72 = iArr5[i73];
                                        if (z9 || r31 != 0 || (iArr17[i71] & 1) == 0) {
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList6;
                                            arrayList2.add(java.lang.Integer.valueOf(i71));
                                        }
                                        i71++;
                                        i68 = i73 + 1;
                                        arrayList5 = arrayList2;
                                        zzamiVar6 = zzamiVar7;
                                        i69 = i74;
                                        i67 = i76;
                                        jArr3 = jArr20;
                                    }
                                } else {
                                    i15 = i75;
                                }
                                i72 = i15;
                                if (z9) {
                                }
                                arrayList2 = arrayList6;
                                i71++;
                                i68 = i73 + 1;
                                arrayList5 = arrayList2;
                                zzamiVar6 = zzamiVar7;
                                i69 = i74;
                                i67 = i76;
                                jArr3 = jArr20;
                            }
                            i65 = i72;
                            int i77 = i67;
                            j27 += jArr4[i77];
                            arrayList4 = arrayList5;
                            z10 = z12;
                            jArr3 = jArr3;
                            i67 = i77 + 1;
                            iArr15 = iArr5;
                            iArr12 = iArr4;
                            i66 = i71;
                        }
                        boolean z13 = z10;
                        java.util.ArrayList arrayList7 = arrayList4;
                        com.google.android.gms.internal.ads.zzami zzamiVar8 = zzamiVar6;
                        long zzv9 = com.google.android.gms.internal.ads.zzfl.zzv(j27, 1000000L, zzamiVar8.zzd, java.math.RoundingMode.DOWN);
                        if (z13) {
                            com.google.android.gms.internal.ads.zzt zza5 = zzamiVar8.zzg.zza();
                            zza5.zzu(true);
                            zzamiVar2 = zzamiVar8.zzb(zza5.zzO());
                        } else {
                            zzamiVar2 = zzamiVar8;
                        }
                        return new com.google.android.gms.internal.ads.zzaml(zzamiVar2, jArr18, iArr16, i65, jArr19, iArr17, com.google.android.gms.internal.ads.zzhah.zzf(arrayList7), r31, zzv9, jArr18.length);
                    }
                }
                z3 = false;
                java.util.ArrayList arrayList32 = new java.util.ArrayList();
                if (zzetVar == null) {
                }
                if (z3) {
                }
                j3 = zzamiVar4.zzf;
                if (j3 > 0) {
                }
                long j182 = zzamiVar4.zzc;
                long zzv22 = com.google.android.gms.internal.ads.zzfl.zzv(j, 1000000L, j182, java.math.RoundingMode.DOWN);
                int[] zzf2 = com.google.android.gms.internal.ads.zzhah.zzf(arrayList32);
                jArr4 = zzamiVar4.zzi;
                if (jArr4 == null) {
                }
            } else {
                i2 = zzH4;
                zzetVar = null;
            }
        } else {
            zzetVar = zzetVar5;
            i2 = 0;
        }
        i3 = -1;
        zzb2 = zzalhVar.zzb();
        com.google.android.gms.internal.ads.zzv zzvVar22 = zzamiVar4.zzg;
        if (zzb2 != -1) {
        }
        z3 = false;
        java.util.ArrayList arrayList322 = new java.util.ArrayList();
        if (zzetVar == null) {
        }
        if (z3) {
        }
        j3 = zzamiVar4.zzf;
        if (j3 > 0) {
        }
        long j1822 = zzamiVar4.zzc;
        long zzv222 = com.google.android.gms.internal.ads.zzfl.zzv(j, 1000000L, j1822, java.math.RoundingMode.DOWN);
        int[] zzf22 = com.google.android.gms.internal.ads.zzhah.zzf(arrayList322);
        jArr4 = zzamiVar4.zzi;
        if (jArr4 == null) {
        }
    }

    static com.google.android.gms.internal.ads.zzap zzh(com.google.android.gms.internal.ads.zzet zzetVar) {
        try {
            zzetVar.zzk(5);
            int zzB = zzetVar.zzB();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < zzB; i++) {
                long zzD = zzetVar.zzD() / 10000;
                if (zzD < 0) {
                    zzD = -9223372036854775807L;
                }
                arrayList.add(com.google.android.gms.internal.ads.zzaiv.CC.zzb(zzD, -9223372036854775807L, zzetVar.zzK(zzetVar.zzs(), java.nio.charset.StandardCharsets.UTF_8)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new com.google.android.gms.internal.ads.zzap(arrayList);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static com.google.android.gms.internal.ads.zzap zzi(com.google.android.gms.internal.ads.zzet zzetVar) {
        short zzv = zzetVar.zzv();
        zzetVar.zzk(2);
        java.lang.String zzK = zzetVar.zzK(zzv, java.nio.charset.StandardCharsets.UTF_8);
        int max = java.lang.Math.max(zzK.lastIndexOf(43), zzK.lastIndexOf(45));
        try {
            return new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, new com.google.android.gms.internal.ads.zzga(java.lang.Float.parseFloat(zzK.substring(0, max)), java.lang.Float.parseFloat(zzK.substring(max, zzK.length() - 1))));
        } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static int zzj(com.google.android.gms.internal.ads.zzet zzetVar) {
        zzetVar.zzh(16);
        return zzetVar.zzB();
    }

    private static java.lang.String zzk(byte[] bArr, int i, int i2) {
        com.google.android.gms.internal.ads.zzgtj.zzi(bArr.length == 64);
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int zze = com.google.android.gms.internal.ads.zzhah.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            int i4 = ((zze >> 8) & 255) - 128;
            int i5 = (zze >> 16) & 255;
            int i6 = (zze & 255) - 128;
            arrayList.add(java.lang.String.format("%06x", java.lang.Integer.valueOf(java.lang.Math.max(0, java.lang.Math.min(i5 + ((i6 * 17790) / 10000), 255)) | (java.lang.Math.max(0, java.lang.Math.min(((i4 * 14075) / 10000) + i5, 255)) << 16) | (java.lang.Math.max(0, java.lang.Math.min((i5 - ((i6 * 3455) / 10000)) - ((i4 * 7169) / 10000), 255)) << 8))));
        }
        java.lang.String zzd = com.google.android.gms.internal.ads.zzgtd.zzd(arrayList, ", ");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 7 + java.lang.String.valueOf(i2).length() + 10 + zzd.length() + 1);
        sb.append("size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("\npalette: ");
        sb.append(zzd);
        sb.append("\n");
        return sb.toString();
    }

    private static com.google.android.gms.internal.ads.zzi zzl(com.google.android.gms.internal.ads.zzet zzetVar) {
        com.google.android.gms.internal.ads.zzh zzhVar = new com.google.android.gms.internal.ads.zzh();
        byte[] zzi = zzetVar.zzi();
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(zzi, zzi.length);
        zzesVar.zzf(zzetVar.zzg() * 8);
        zzesVar.zzo(1);
        int zzj = zzesVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzesVar.zzo(1);
            int zzj2 = zzesVar.zzj(8);
            for (int i2 = 0; i2 < zzj2; i2++) {
                zzesVar.zzh(6);
                boolean zzi2 = zzesVar.zzi();
                zzesVar.zzg();
                zzesVar.zzo(11);
                zzesVar.zzh(4);
                int zzj3 = zzesVar.zzj(4) + 8;
                zzhVar.zze(zzj3);
                zzhVar.zzf(zzj3);
                zzesVar.zzo(1);
                if (zzi2) {
                    int zzj4 = zzesVar.zzj(8);
                    int zzj5 = zzesVar.zzj(8);
                    zzesVar.zzo(1);
                    boolean zzi3 = zzesVar.zzi();
                    zzhVar.zza(com.google.android.gms.internal.ads.zzi.zzb(zzj4));
                    zzhVar.zzb(true != zzi3 ? 2 : 1);
                    zzhVar.zzc(com.google.android.gms.internal.ads.zzi.zzc(zzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static java.nio.ByteBuffer zzm() {
        return java.nio.ByteBuffer.allocate(25).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private static android.util.Pair zzn(com.google.android.gms.internal.ads.zzfx zzfxVar) {
        com.google.android.gms.internal.ads.zzfy zzc = zzfxVar.zzc(1701606260);
        if (zzc == null) {
            return null;
        }
        com.google.android.gms.internal.ads.zzet zzetVar = zzc.zza;
        zzetVar.zzh(8);
        int zza2 = zza(zzetVar.zzB());
        int zzH = zzetVar.zzH();
        long[] jArr = new long[zzH];
        long[] jArr2 = new long[zzH];
        for (int i = 0; i < zzH; i++) {
            jArr[i] = zza2 == 1 ? zzetVar.zzJ() : zzetVar.zzz();
            jArr2[i] = zza2 == 1 ? zzetVar.zzD() : zzetVar.zzB();
            if (zzetVar.zzv() != 1) {
                throw new java.lang.IllegalArgumentException("Unsupported media rate.");
            }
            zzetVar.zzk(2);
        }
        return android.util.Pair.create(jArr, jArr2);
    }

    private static void zzo(com.google.android.gms.internal.ads.zzet zzetVar, int i, int i2, int i3, int i4, java.lang.String str, boolean z, com.google.android.gms.internal.ads.zzq zzqVar, com.google.android.gms.internal.ads.zzalf zzalfVar, int i5) throws com.google.android.gms.internal.ads.zzat {
        int i6;
        int zzB;
        int i7;
        int i8;
        int i9;
        java.lang.String str2;
        java.lang.String str3;
        com.google.android.gms.internal.ads.zzalf zzalfVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        java.lang.String str4;
        java.lang.String str5;
        boolean z2;
        int i14;
        java.lang.String format;
        int i15 = i;
        int i16 = i2;
        int i17 = i3;
        com.google.android.gms.internal.ads.zzq zzqVar2 = zzqVar;
        com.google.android.gms.internal.ads.zzalf zzalfVar3 = zzalfVar;
        zzetVar.zzh(i16 + 16);
        if (z) {
            i6 = zzetVar.zzt();
            zzetVar.zzk(6);
        } else {
            zzetVar.zzk(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int zzt = zzetVar.zzt();
            zzetVar.zzk(6);
            int zzF = zzetVar.zzF();
            zzetVar.zzh(zzetVar.zzg() - 4);
            zzB = zzetVar.zzB();
            if (i6 == 1) {
                zzetVar.zzk(16);
            }
            i7 = zzt;
            i8 = zzF;
            i9 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzetVar.zzk(16);
            i8 = (int) java.lang.Math.round(java.lang.Double.longBitsToDouble(zzetVar.zzD()));
            i7 = zzetVar.zzH();
            zzetVar.zzk(4);
            int zzH = zzetVar.zzH();
            int zzH2 = zzetVar.zzH();
            int i18 = zzH2 & 1;
            int i19 = zzH2 & 2;
            if (i18 == 0) {
                i9 = com.google.android.gms.internal.ads.zzfl.zzB(zzH, i19 != 0 ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
            } else {
                i9 = i19 == 0 ? com.google.android.gms.internal.ads.zzfl.zzC(zzH) : -1;
            }
            if (i9 == 0) {
                i9 = -1;
            }
            zzetVar.zzk(8);
            zzB = 0;
        }
        if (i15 == 1767992678) {
            i7 = -1;
            i8 = -1;
        } else {
            if (i15 == 1935764850) {
                i8 = 8000;
            } else if (i15 == 1935767394) {
                i8 = 16000;
                i15 = 1935767394;
            }
            i7 = 1;
        }
        int zzg = zzetVar.zzg();
        if (i15 == 1701733217) {
            android.util.Pair zzr = zzr(zzetVar, i16, i17);
            if (zzr != null) {
                int intValue = ((java.lang.Integer) zzr.first).intValue();
                zzqVar2 = zzqVar2 == null ? null : zzqVar2.zzb(((com.google.android.gms.internal.ads.zzamj) zzr.second).zzb);
                zzalfVar3.zza[i5] = (com.google.android.gms.internal.ads.zzamj) zzr.second;
                i15 = intValue;
            } else {
                i15 = 1701733217;
            }
            zzetVar.zzh(zzg);
        }
        java.lang.String str6 = "audio/mhm1";
        if (i15 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i15 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i15 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i15 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i15 == 1685353320 || i15 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i15 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i15 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i15 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i15 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i15 != 1936684916) {
                if (i15 == 1953984371) {
                    str2 = "audio/raw";
                    i9 = 268435456;
                } else if (i15 == 1819304813) {
                    if (i9 != -1) {
                        str2 = "audio/raw";
                    }
                } else if (i15 == 778924082 || i15 == 778924083) {
                    str2 = "audio/mpeg";
                } else if (i15 == 1835557169) {
                    str2 = "audio/mha1";
                } else if (i15 == 1835560241) {
                    str2 = "audio/mhm1";
                } else if (i15 == 1634492771) {
                    str2 = "audio/alac";
                } else if (i15 == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (i15 == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (i15 == 1332770163) {
                    str2 = "audio/opus";
                } else if (i15 == 1716281667) {
                    str2 = "audio/flac";
                } else if (i15 == 1835823201) {
                    str2 = "audio/true-hd";
                } else if (i15 == 1767992678) {
                    str2 = "audio/iamf";
                    i15 = 1767992678;
                } else {
                    str2 = null;
                }
            }
            str2 = "audio/raw";
            i9 = 2;
        }
        int i20 = i9;
        java.lang.String str7 = null;
        java.util.List list = null;
        com.google.android.gms.internal.ads.zzala zzalaVar = null;
        com.google.android.gms.internal.ads.zzaky zzakyVar = null;
        while (zzg - i16 < i17) {
            zzetVar.zzh(zzg);
            int zzB2 = zzetVar.zzB();
            java.lang.String str8 = "childAtomSize must be positive";
            com.google.android.gms.internal.ads.zzagc.zza(zzB2 > 0, "childAtomSize must be positive");
            int zzB3 = zzetVar.zzB();
            int i21 = i8;
            if (zzB3 == 1835557187) {
                zzetVar.zzh(zzg + 8);
                zzetVar.zzk(1);
                int zzs = zzetVar.zzs();
                zzetVar.zzk(1);
                if (java.util.Objects.equals(str2, str6)) {
                    i14 = 0;
                    format = java.lang.String.format("mhm1.%02X", java.lang.Integer.valueOf(zzs));
                    str3 = str6;
                } else {
                    i14 = 0;
                    str3 = str6;
                    format = java.lang.String.format("mha1.%02X", java.lang.Integer.valueOf(zzs));
                }
                int zzt2 = zzetVar.zzt();
                byte[] bArr = new byte[zzt2];
                zzetVar.zzm(bArr, i14, zzt2);
                list = list == null ? com.google.android.gms.internal.ads.zzgwm.zzj(bArr) : com.google.android.gms.internal.ads.zzgwm.zzk(bArr, (byte[]) list.get(i14));
                i10 = zzB2;
                i11 = zzB;
                i8 = i21;
                str4 = format;
                zzalfVar2 = zzalfVar3;
            } else {
                str3 = str6;
                if (zzB3 == 1835557200) {
                    zzetVar.zzh(zzg + 8);
                    int zzs2 = zzetVar.zzs();
                    if (zzs2 > 0) {
                        byte[] bArr2 = new byte[zzs2];
                        zzetVar.zzm(bArr2, 0, zzs2);
                        list = list == null ? com.google.android.gms.internal.ads.zzgwm.zzj(bArr2) : com.google.android.gms.internal.ads.zzgwm.zzk((byte[]) list.get(0), bArr2);
                        zzalfVar2 = zzalfVar3;
                        i10 = zzB2;
                        i11 = zzB;
                        i8 = i21;
                    }
                    zzalfVar2 = zzalfVar3;
                    i10 = zzB2;
                    i11 = zzB;
                    i8 = i21;
                } else {
                    if (zzB3 == 1702061171) {
                        zzalfVar2 = zzalfVar3;
                        i10 = zzB2;
                        i11 = zzB;
                        i8 = i21;
                        i12 = zzg;
                        i13 = -1;
                    } else if (z && zzB3 == 2002876005) {
                        i12 = zzetVar.zzg();
                        if (i12 >= zzg) {
                            str5 = null;
                            z2 = true;
                        } else {
                            str5 = null;
                            z2 = false;
                        }
                        com.google.android.gms.internal.ads.zzagc.zza(z2, str5);
                        while (true) {
                            if (i12 - zzg >= zzB2) {
                                zzalfVar2 = zzalfVar3;
                                i10 = zzB2;
                                i11 = zzB;
                                i8 = i21;
                                i12 = -1;
                                break;
                            }
                            zzetVar.zzh(i12);
                            int zzB4 = zzetVar.zzB();
                            com.google.android.gms.internal.ads.zzagc.zza(zzB4 > 0, str8);
                            java.lang.String str9 = str8;
                            if (zzetVar.zzB() == 1702061171) {
                                zzalfVar2 = zzalfVar3;
                                i10 = zzB2;
                                i11 = zzB;
                                i8 = i21;
                                break;
                            }
                            i12 += zzB4;
                            str8 = str9;
                        }
                        i13 = -1;
                    } else {
                        if (zzB3 == 1651798644) {
                            zzakyVar = zzq(zzetVar, zzg);
                        } else {
                            if (zzB3 == 1684103987) {
                                zzetVar.zzh(zzg + 8);
                                zzalfVar3.zzb = com.google.android.gms.internal.ads.zzaey.zza(zzetVar, java.lang.Integer.toString(i4), str, zzqVar2);
                            } else if (zzB3 == 1684366131) {
                                zzetVar.zzh(zzg + 8);
                                zzalfVar3.zzb = com.google.android.gms.internal.ads.zzaey.zzb(zzetVar, java.lang.Integer.toString(i4), str, zzqVar2);
                            } else if (zzB3 == 1684103988) {
                                zzetVar.zzh(zzg + 8);
                                zzalfVar3.zzb = com.google.android.gms.internal.ads.zzafb.zza(zzetVar, java.lang.Integer.toString(i4), str, zzqVar2);
                            } else if (zzB3 != 1684892784) {
                                if (zzB3 == 1684305011 || zzB3 == 1969517683) {
                                    i10 = zzB2;
                                    i11 = zzB;
                                    com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                                    zztVar.zzb(i4);
                                    zztVar.zzo(str2);
                                    zztVar.zzG(i7);
                                    i8 = i21;
                                    zztVar.zzH(i8);
                                    zztVar.zzs(zzqVar2);
                                    zztVar.zze(str);
                                    zzalfVar2 = zzalfVar;
                                    zzalfVar2.zzb = zztVar.zzO();
                                } else if (zzB3 == 1682927731) {
                                    int i22 = zzB2 - 8;
                                    byte[] bArr3 = zzb;
                                    int length = bArr3.length;
                                    byte[] copyOf = java.util.Arrays.copyOf(bArr3, length + i22);
                                    zzetVar.zzh(zzg + 8);
                                    zzetVar.zzm(copyOf, length, i22);
                                    list = com.google.android.gms.internal.ads.zzgv.zza(copyOf);
                                } else if (zzB3 == 1684425825) {
                                    byte[] bArr4 = new byte[zzB2 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    zzetVar.zzh(zzg + 12);
                                    zzetVar.zzm(bArr4, 4, zzB2 - 12);
                                    list = com.google.android.gms.internal.ads.zzgwm.zzj(bArr4);
                                } else if (zzB3 == 1634492771) {
                                    int i23 = zzB2 - 12;
                                    byte[] bArr5 = new byte[i23];
                                    zzetVar.zzh(zzg + 12);
                                    zzetVar.zzm(bArr5, 0, i23);
                                    int i24 = com.google.android.gms.internal.ads.zzdq.zza;
                                    com.google.android.gms.internal.ads.zzet zzetVar2 = new com.google.android.gms.internal.ads.zzet(bArr5);
                                    zzetVar2.zzh(5);
                                    int zzs3 = zzetVar2.zzs();
                                    zzetVar2.zzh(9);
                                    int zzs4 = zzetVar2.zzs();
                                    zzetVar2.zzh(20);
                                    int[] iArr = {zzetVar2.zzH(), zzs4, zzs3};
                                    int i25 = iArr[0];
                                    int i26 = iArr[1];
                                    int zzB5 = com.google.android.gms.internal.ads.zzfl.zzB(zzs3, java.nio.ByteOrder.LITTLE_ENDIAN);
                                    if (zzB5 == 0) {
                                        zzB5 = -1;
                                    }
                                    list = com.google.android.gms.internal.ads.zzgwm.zzj(bArr5);
                                    zzalfVar2 = zzalfVar3;
                                    i10 = zzB2;
                                    i20 = zzB5;
                                    i11 = zzB;
                                    i8 = i25;
                                    str4 = str7;
                                    i7 = i26;
                                } else {
                                    if (zzB3 == 1767990114) {
                                        zzetVar.zzh(zzg + 9);
                                        int zza2 = com.google.android.gms.internal.ads.zzhah.zza(zzetVar.zzP());
                                        byte[] bArr6 = new byte[zza2];
                                        zzetVar.zzm(bArr6, 0, zza2);
                                        int i27 = com.google.android.gms.internal.ads.zzdq.zza;
                                        com.google.android.gms.internal.ads.zzet zzetVar3 = new com.google.android.gms.internal.ads.zzet(bArr6);
                                        java.lang.String str10 = null;
                                        java.lang.String str11 = null;
                                        while (zzetVar3.zzd() > 0 && (str10 == null || str11 == null)) {
                                            int zzs5 = zzetVar3.zzs();
                                            int i28 = zzs5 >> 3;
                                            int i29 = zzs5 & 2;
                                            int i30 = zzs5 & 1;
                                            int zza3 = com.google.android.gms.internal.ads.zzhah.zza(zzetVar3.zzP());
                                            int i31 = zzB;
                                            if (i28 > 4 && i28 < 24 && i29 != 0) {
                                                zzetVar3.zzQ();
                                                zzetVar3.zzQ();
                                            }
                                            if (i30 != 0) {
                                                zzetVar3.zzk(com.google.android.gms.internal.ads.zzhah.zza(zzetVar3.zzP()));
                                            }
                                            int zzg2 = zzetVar3.zzg() + zza3;
                                            int i32 = zzB2;
                                            if (i28 == 31) {
                                                zzetVar3.zzk(4);
                                                java.lang.Object[] objArr = {java.lang.Integer.valueOf(zzetVar3.zzs()), java.lang.Integer.valueOf(zzetVar3.zzs())};
                                                java.lang.String str12 = com.google.android.gms.internal.ads.zzfl.zza;
                                                str10 = java.lang.String.format(java.util.Locale.US, "iamf.%03X.%03X", objArr);
                                            } else if (i28 == 0) {
                                                zzetVar3.zzQ();
                                                java.lang.String zzK = zzetVar3.zzK(4, java.nio.charset.StandardCharsets.UTF_8);
                                                if (zzK.equals("mp4a")) {
                                                    zzetVar3.zzQ();
                                                    zzetVar3.zzk(2);
                                                    com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes();
                                                    zzesVar.zza(zzetVar3);
                                                    int zzj = zzesVar.zzj(5);
                                                    if (zzj == 31) {
                                                        zzj = zzesVar.zzj(6) + 32;
                                                    }
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(zzK.length() + 4 + java.lang.String.valueOf(zzj).length());
                                                    sb.append(zzK);
                                                    sb.append(".40.");
                                                    sb.append(zzj);
                                                    zzK = sb.toString();
                                                }
                                                str11 = zzK;
                                                zzetVar3.zzh(zzg2);
                                                zzB2 = i32;
                                                zzB = i31;
                                            }
                                            zzetVar3.zzh(zzg2);
                                            zzB2 = i32;
                                            zzB = i31;
                                        }
                                        i10 = zzB2;
                                        i11 = zzB;
                                        if (str10 == null || str11 == null) {
                                            str4 = null;
                                        } else {
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str10.length() + 1 + str11.length());
                                            sb2.append(str10);
                                            sb2.append(".");
                                            sb2.append(str11);
                                            str4 = sb2.toString();
                                        }
                                        list = com.google.android.gms.internal.ads.zzgwm.zzj(bArr6);
                                        zzalfVar2 = zzalfVar;
                                    } else {
                                        i10 = zzB2;
                                        i11 = zzB;
                                        if (zzB3 == 1885564227) {
                                            zzetVar.zzh(zzg + 12);
                                            java.nio.ByteOrder byteOrder = (zzetVar.zzs() & 1) != 0 ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN;
                                            int zzs6 = zzetVar.zzs();
                                            int zzB6 = i15 == 1768973165 ? com.google.android.gms.internal.ads.zzfl.zzB(zzs6, byteOrder) : (i15 == 1718641517 && byteOrder.equals(java.nio.ByteOrder.LITTLE_ENDIAN)) ? com.google.android.gms.internal.ads.zzfl.zzC(zzs6) : i20;
                                            if (zzB6 == 0) {
                                                zzB6 = -1;
                                            }
                                            if (zzB6 != -1) {
                                                zzalfVar2 = zzalfVar;
                                                str4 = str7;
                                                i20 = zzB6;
                                                str2 = "audio/raw";
                                            } else {
                                                zzalfVar2 = zzalfVar;
                                                str4 = str7;
                                                i20 = zzB6;
                                            }
                                        } else {
                                            zzalfVar2 = zzalfVar;
                                            i8 = i21;
                                        }
                                    }
                                    i8 = i21;
                                }
                                str4 = str7;
                            } else {
                                if (zzB <= 0) {
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zzB).length() + 49);
                                    sb3.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb3.append(zzB);
                                    throw com.google.android.gms.internal.ads.zzat.zzb(sb3.toString(), null);
                                }
                                zzalfVar2 = zzalfVar3;
                                i10 = zzB2;
                                i8 = zzB;
                                i11 = i8;
                                i7 = 2;
                            }
                            zzalfVar2 = zzalfVar3;
                            i10 = zzB2;
                            i11 = zzB;
                            i8 = i21;
                        }
                        zzalfVar2 = zzalfVar3;
                        i10 = zzB2;
                        i11 = zzB;
                        i8 = i21;
                    }
                    if (i12 != i13) {
                        zzalaVar = zzp(zzetVar, i12);
                        java.lang.String zza4 = zzalaVar.zza();
                        byte[] zzb2 = zzalaVar.zzb();
                        if (zzb2 != null) {
                            if ("audio/vorbis".equals(zza4)) {
                                int i33 = com.google.android.gms.internal.ads.zzahm.zza;
                                com.google.android.gms.internal.ads.zzet zzetVar4 = new com.google.android.gms.internal.ads.zzet(zzb2);
                                int i34 = 1;
                                zzetVar4.zzk(1);
                                int i35 = 0;
                                while (zzetVar4.zzd() > 0 && zzetVar4.zzn() == 255) {
                                    zzetVar4.zzk(i34);
                                    i35 += 255;
                                    i34 = 1;
                                }
                                int zzs7 = i35 + zzetVar4.zzs();
                                int i36 = 0;
                                while (zzetVar4.zzd() > 0 && zzetVar4.zzn() == 255) {
                                    zzetVar4.zzk(1);
                                    i36 += 255;
                                }
                                int zzs8 = i36 + zzetVar4.zzs();
                                byte[] bArr7 = new byte[zzs7];
                                int zzg3 = zzetVar4.zzg();
                                java.lang.System.arraycopy(zzb2, zzg3, bArr7, 0, zzs7);
                                int i37 = zzg3 + zzs7 + zzs8;
                                int length2 = zzb2.length - i37;
                                byte[] bArr8 = new byte[length2];
                                java.lang.System.arraycopy(zzb2, i37, bArr8, 0, length2);
                                list = com.google.android.gms.internal.ads.zzgwm.zzk(bArr7, bArr8);
                            } else {
                                if ("audio/mp4a-latm".equals(zza4)) {
                                    com.google.android.gms.internal.ads.zzaev zza5 = com.google.android.gms.internal.ads.zzaew.zza(zzb2);
                                    i8 = zza5.zza;
                                    i7 = zza5.zzb;
                                    str4 = zza5.zzc;
                                } else {
                                    str4 = str7;
                                }
                                list = com.google.android.gms.internal.ads.zzgwm.zzj(zzb2);
                                str2 = zza4;
                            }
                        }
                        str4 = str7;
                        str2 = zza4;
                    }
                    str4 = str7;
                }
                str4 = str7;
            }
            zzg += i10;
            i16 = i2;
            zzalfVar3 = zzalfVar2;
            str7 = str4;
            str6 = str3;
            zzB = i11;
            i17 = i3;
        }
        com.google.android.gms.internal.ads.zzalf zzalfVar4 = zzalfVar3;
        if (zzalfVar4.zzb != null || str2 == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzt zztVar2 = new com.google.android.gms.internal.ads.zzt();
        zztVar2.zzb(i4);
        zztVar2.zzo(str2);
        zztVar2.zzk(str7);
        zztVar2.zzG(i7);
        zztVar2.zzH(i8);
        zztVar2.zzI(i20);
        zztVar2.zzr(list);
        zztVar2.zzs(zzqVar2);
        zztVar2.zze(str);
        if (zzalaVar != null) {
            zztVar2.zzi(com.google.android.gms.internal.ads.zzhah.zzb(zzalaVar.zzc()));
            zztVar2.zzj(com.google.android.gms.internal.ads.zzhah.zzb(zzalaVar.zzd()));
        } else if (zzakyVar != null) {
            zztVar2.zzi(com.google.android.gms.internal.ads.zzhah.zzb(zzakyVar.zza()));
            zztVar2.zzj(com.google.android.gms.internal.ads.zzhah.zzb(zzakyVar.zzb()));
        }
        zzalfVar4.zzb = zztVar2.zzO();
    }

    private static com.google.android.gms.internal.ads.zzala zzp(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        zzetVar.zzh(i + 12);
        zzetVar.zzk(1);
        zzs(zzetVar);
        zzetVar.zzk(2);
        int zzs = zzetVar.zzs();
        if ((zzs & 128) != 0) {
            zzetVar.zzk(2);
        }
        if ((zzs & 64) != 0) {
            zzetVar.zzk(zzetVar.zzs());
        }
        if ((zzs & 32) != 0) {
            zzetVar.zzk(2);
        }
        zzetVar.zzk(1);
        zzs(zzetVar);
        java.lang.String zze = com.google.android.gms.internal.ads.zzas.zze(zzetVar.zzs());
        if ("audio/mpeg".equals(zze) || "audio/vnd.dts".equals(zze) || "audio/vnd.dts.hd".equals(zze)) {
            return new com.google.android.gms.internal.ads.zzala(zze, null, -1L, -1L);
        }
        zzetVar.zzk(4);
        long zzz = zzetVar.zzz();
        long zzz2 = zzetVar.zzz();
        zzetVar.zzk(1);
        int zzs2 = zzs(zzetVar);
        byte[] bArr = new byte[zzs2];
        zzetVar.zzm(bArr, 0, zzs2);
        return new com.google.android.gms.internal.ads.zzala(zze, bArr, zzz2 <= 0 ? -1L : zzz2, zzz > 0 ? zzz : -1L);
    }

    private static com.google.android.gms.internal.ads.zzaky zzq(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        zzetVar.zzh(i + 8);
        zzetVar.zzk(4);
        return new com.google.android.gms.internal.ads.zzaky(zzetVar.zzz(), zzetVar.zzz());
    }

    private static android.util.Pair zzr(com.google.android.gms.internal.ads.zzet zzetVar, int i, int i2) throws com.google.android.gms.internal.ads.zzat {
        java.lang.Integer num;
        com.google.android.gms.internal.ads.zzamj zzamjVar;
        android.util.Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzg = zzetVar.zzg();
        while (zzg - i < i2) {
            zzetVar.zzh(zzg);
            int zzB = zzetVar.zzB();
            com.google.android.gms.internal.ads.zzagc.zza(zzB > 0, "childAtomSize must be positive");
            if (zzetVar.zzB() == 1936289382) {
                int i5 = zzg + 8;
                int i6 = -1;
                int i7 = 0;
                java.lang.String str = null;
                java.lang.Integer num2 = null;
                while (i5 - zzg < zzB) {
                    zzetVar.zzh(i5);
                    int zzB2 = zzetVar.zzB();
                    int zzB3 = zzetVar.zzB();
                    if (zzB3 == 1718775137) {
                        num2 = java.lang.Integer.valueOf(zzetVar.zzB());
                    } else if (zzB3 == 1935894637) {
                        zzetVar.zzk(4);
                        str = zzetVar.zzK(4, java.nio.charset.StandardCharsets.UTF_8);
                    } else if (zzB3 == 1935894633) {
                        i6 = i5;
                        i7 = zzB2;
                    }
                    i5 += zzB2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    com.google.android.gms.internal.ads.zzagc.zza(num2 != null, "frma atom is mandatory");
                    com.google.android.gms.internal.ads.zzagc.zza(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            zzamjVar = null;
                            break;
                        }
                        zzetVar.zzh(i8);
                        int zzB4 = zzetVar.zzB();
                        if (zzetVar.zzB() == 1952804451) {
                            int zza2 = zza(zzetVar.zzB());
                            zzetVar.zzk(1);
                            if (zza2 == 0) {
                                zzetVar.zzk(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzs = zzetVar.zzs();
                                int i9 = (zzs & 240) >> 4;
                                i3 = zzs & 15;
                                i4 = i9;
                            }
                            boolean z = zzetVar.zzs() == 1;
                            int zzs2 = zzetVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzetVar.zzm(bArr2, 0, 16);
                            if (z && zzs2 == 0) {
                                int zzs3 = zzetVar.zzs();
                                byte[] bArr3 = new byte[zzs3];
                                zzetVar.zzm(bArr3, 0, zzs3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzamjVar = new com.google.android.gms.internal.ads.zzamj(z, str, zzs2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzB4;
                        }
                    }
                    com.google.android.gms.internal.ads.zzagc.zza(zzamjVar != null, "tenc atom is mandatory");
                    java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                    create = android.util.Pair.create(num, zzamjVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzg += zzB;
        }
        return null;
    }

    private static int zzs(com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzs = zzetVar.zzs();
        int i = zzs & 127;
        while ((zzs & 128) == 128) {
            zzs = zzetVar.zzs();
            i = (i << 7) | (zzs & 127);
        }
        return i;
    }
}
