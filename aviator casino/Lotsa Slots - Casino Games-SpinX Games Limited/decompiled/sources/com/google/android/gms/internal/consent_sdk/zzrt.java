package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzrt<T> implements com.google.android.gms.internal.consent_sdk.zzsa<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.gms.internal.consent_sdk.zzsw.zzg();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final com.google.android.gms.internal.consent_sdk.zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final com.google.android.gms.internal.consent_sdk.zzsp zzi;
    private final com.google.android.gms.internal.consent_sdk.zzqb zzj;

    private zzrt(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.consent_sdk.zzrq zzrqVar, boolean z, int[] iArr2, int i3, int i4, com.google.android.gms.internal.consent_sdk.zzrv zzrvVar, com.google.android.gms.internal.consent_sdk.zzrc zzrcVar, com.google.android.gms.internal.consent_sdk.zzsp zzspVar, com.google.android.gms.internal.consent_sdk.zzqb zzqbVar, com.google.android.gms.internal.consent_sdk.zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z2 = false;
        if (zzqbVar != null && (zzrqVar instanceof com.google.android.gms.internal.consent_sdk.zzqk)) {
            z2 = true;
        }
        this.zzf = z2;
        this.zzg = iArr2;
        this.zzh = i3;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(java.lang.Object obj, int i, com.google.android.gms.internal.consent_sdk.zzsa zzsaVar) {
        return zzsaVar.zzh(com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, i & 1048575));
    }

    private static boolean zzB(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.consent_sdk.zzqm) {
            return ((com.google.android.gms.internal.consent_sdk.zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(java.lang.Object obj, int i, int i2) {
        return com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, (long) (zzm(i2) & 1048575)) == i;
    }

    private static boolean zzD(java.lang.Object obj, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j)).booleanValue();
    }

    private static final void zzE(int i, java.lang.Object obj, com.google.android.gms.internal.consent_sdk.zztb zztbVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zztbVar.zzF(i, (java.lang.String) obj);
        } else {
            zztbVar.zzd(i, (com.google.android.gms.internal.consent_sdk.zzpm) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.gms.internal.consent_sdk.zzrt zzi(java.lang.Class cls, com.google.android.gms.internal.consent_sdk.zzrn zzrnVar, com.google.android.gms.internal.consent_sdk.zzrv zzrvVar, com.google.android.gms.internal.consent_sdk.zzrc zzrcVar, com.google.android.gms.internal.consent_sdk.zzsp zzspVar, com.google.android.gms.internal.consent_sdk.zzqb zzqbVar, com.google.android.gms.internal.consent_sdk.zzrl zzrlVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        com.google.android.gms.internal.consent_sdk.zzrz zzrzVar;
        java.lang.String str;
        int objectFieldOffset;
        int i19;
        java.lang.Class<?> cls2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        java.lang.reflect.Field zzs;
        int i26;
        char charAt11;
        int i27;
        int i28;
        int i29;
        int i30;
        java.lang.Object obj;
        java.lang.reflect.Field zzs2;
        java.lang.Object obj2;
        java.lang.reflect.Field zzs3;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        int i34;
        char charAt15;
        if (!(zzrnVar instanceof com.google.android.gms.internal.consent_sdk.zzrz)) {
            throw null;
        }
        com.google.android.gms.internal.consent_sdk.zzrz zzrzVar2 = (com.google.android.gms.internal.consent_sdk.zzrz) zzrnVar;
        java.lang.String zzd = zzrzVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i = i35 + 1;
                if (zzd.charAt(i35) < 55296) {
                    break;
                }
                i35 = i;
            }
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i37 = charAt16 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                charAt15 = zzd.charAt(i36);
                if (charAt15 < 55296) {
                    break;
                }
                i37 |= (charAt15 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            charAt16 = i37 | (charAt15 << i38);
            i36 = i34;
        }
        if (charAt16 == 0) {
            iArr = zza;
            i6 = 0;
            i4 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            i5 = 0;
            i3 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt17 = zzd.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    charAt10 = zzd.charAt(i39);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i40 |= (charAt10 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                charAt17 = i40 | (charAt10 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int charAt18 = zzd.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    charAt9 = zzd.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                charAt18 = i43 | (charAt9 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int charAt19 = zzd.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    charAt8 = zzd.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                charAt19 = i46 | (charAt8 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            int charAt20 = zzd.charAt(i45);
            if (charAt20 >= 55296) {
                int i49 = charAt20 & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    charAt7 = zzd.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                charAt20 = i49 | (charAt7 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            charAt = zzd.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    charAt6 = zzd.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                charAt = i52 | (charAt6 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            charAt2 = zzd.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    charAt5 = zzd.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                charAt2 = i55 | (charAt5 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int charAt21 = zzd.charAt(i54);
            if (charAt21 >= 55296) {
                int i58 = charAt21 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    charAt4 = zzd.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                charAt21 = i58 | (charAt4 << i59);
                i57 = i8;
            }
            int i60 = i57 + 1;
            int charAt22 = zzd.charAt(i57);
            if (charAt22 >= 55296) {
                int i61 = charAt22 & 8191;
                int i62 = 13;
                while (true) {
                    i7 = i60 + 1;
                    charAt3 = zzd.charAt(i60);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i61 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i7;
                }
                charAt22 = i61 | (charAt3 << i62);
                i60 = i7;
            }
            int i63 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            i2 = charAt19;
            i3 = charAt22;
            i4 = i63;
            iArr = iArr2;
            i5 = charAt20;
            i6 = charAt17;
            i36 = i60;
        }
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object[] zze = zzrzVar2.zze();
        java.lang.Class<?> cls3 = zzrzVar2.zza().getClass();
        int i64 = i3 + charAt2;
        int i65 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[i65];
        int i66 = i3;
        int i67 = i64;
        int i68 = 0;
        int i69 = 0;
        while (i36 < length) {
            int i70 = i36 + 1;
            int charAt23 = zzd.charAt(i36);
            if (charAt23 >= c) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i33 = i72 + 1;
                    charAt14 = zzd.charAt(i72);
                    if (charAt14 < c) {
                        break;
                    }
                    i71 |= (charAt14 & 8191) << i73;
                    i73 += 13;
                    i72 = i33;
                }
                charAt23 = i71 | (charAt14 << i73);
                i15 = i33;
            } else {
                i15 = i70;
            }
            int i74 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i32 = i76 + 1;
                    charAt13 = zzd.charAt(i76);
                    if (charAt13 < c) {
                        break;
                    }
                    i75 |= (charAt13 & 8191) << i77;
                    i77 += 13;
                    i76 = i32;
                }
                charAt24 = i75 | (charAt13 << i77);
                i16 = i32;
            } else {
                i16 = i74;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i78 = charAt24 & 255;
            int i79 = length;
            int i80 = charAt24 & 2048;
            int i81 = i5;
            if (i78 >= 51) {
                int i82 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i83 = charAt25 & 8191;
                    int i84 = i82;
                    int i85 = 13;
                    while (true) {
                        i31 = i84 + 1;
                        charAt12 = zzd.charAt(i84);
                        i17 = i2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i83 |= (charAt12 & 8191) << i85;
                        i85 += 13;
                        i84 = i31;
                        i2 = i17;
                    }
                    charAt25 = i83 | (charAt12 << i85);
                    i29 = i31;
                } else {
                    i17 = i2;
                    i29 = i82;
                }
                int i86 = i78 - 51;
                int i87 = i29;
                if (i86 == 9 || i86 == 17) {
                    i30 = i4 + 1;
                    int i88 = i69 / 3;
                    objArr[i88 + i88 + 1] = zze[i4];
                } else {
                    if (i86 == 12) {
                        if (zzrzVar2.zzc() == 1 || i80 != 0) {
                            i30 = i4 + 1;
                            int i89 = i69 / 3;
                            objArr[i89 + i89 + 1] = zze[i4];
                        } else {
                            i80 = 0;
                        }
                    }
                    int i90 = charAt25 + charAt25;
                    obj = zze[i90];
                    if (obj instanceof java.lang.reflect.Field) {
                        zzs2 = zzs(cls3, (java.lang.String) obj);
                        zze[i90] = zzs2;
                    } else {
                        zzs2 = (java.lang.reflect.Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzs2);
                    int i91 = i90 + 1;
                    obj2 = zze[i91];
                    int i92 = i80;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        zzs3 = zzs(cls3, (java.lang.String) obj2);
                        zze[i91] = zzs3;
                    } else {
                        zzs3 = (java.lang.reflect.Field) obj2;
                    }
                    i22 = (int) unsafe.objectFieldOffset(zzs3);
                    objectFieldOffset = objectFieldOffset2;
                    i24 = i92;
                    zzrzVar = zzrzVar2;
                    cls2 = cls3;
                    i23 = i87;
                    i18 = charAt23;
                    str = zzd;
                    i21 = 0;
                }
                i4 = i30;
                int i902 = charAt25 + charAt25;
                obj = zze[i902];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzs2);
                int i912 = i902 + 1;
                obj2 = zze[i912];
                int i922 = i80;
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                i22 = (int) unsafe.objectFieldOffset(zzs3);
                objectFieldOffset = objectFieldOffset22;
                i24 = i922;
                zzrzVar = zzrzVar2;
                cls2 = cls3;
                i23 = i87;
                i18 = charAt23;
                str = zzd;
                i21 = 0;
            } else {
                i17 = i2;
                int i93 = i4 + 1;
                java.lang.reflect.Field zzs4 = zzs(cls3, (java.lang.String) zze[i4]);
                i18 = charAt23;
                if (i78 == 9 || i78 == 17) {
                    zzrzVar = zzrzVar2;
                    int i94 = i69 / 3;
                    objArr[i94 + i94 + 1] = zzs4.getType();
                } else {
                    if (i78 == 27) {
                        zzrzVar = zzrzVar2;
                        i27 = 1;
                        i28 = i4 + 2;
                    } else if (i78 == 49) {
                        i28 = i4 + 2;
                        zzrzVar = zzrzVar2;
                        i27 = 1;
                    } else {
                        if (i78 == 12 || i78 == 30 || i78 == 44) {
                            zzrzVar = zzrzVar2;
                            if (zzrzVar2.zzc() == 1 || i80 != 0) {
                                i28 = i4 + 2;
                                int i95 = i69 / 3;
                                objArr[i95 + i95 + 1] = zze[i93];
                                str = zzd;
                                i93 = i28;
                            } else {
                                str = zzd;
                                i80 = 0;
                            }
                        } else if (i78 == 50) {
                            int i96 = i4 + 2;
                            int i97 = i66 + 1;
                            iArr[i66] = i69;
                            int i98 = i69 / 3;
                            int i99 = i98 + i98;
                            objArr[i99] = zze[i93];
                            if (i80 != 0) {
                                i93 = i4 + 3;
                                objArr[i99 + 1] = zze[i96];
                                str = zzd;
                                i66 = i97;
                                zzrzVar = zzrzVar2;
                            } else {
                                i93 = i96;
                                i66 = i97;
                                i80 = 0;
                                zzrzVar = zzrzVar2;
                            }
                        } else {
                            zzrzVar = zzrzVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                        if ((charAt24 & 4096) != 0 || i78 > 17) {
                            i19 = i80;
                            cls2 = cls3;
                            i20 = i16;
                            i21 = 0;
                            i22 = 1048575;
                        } else {
                            int i100 = i16 + 1;
                            int charAt26 = str.charAt(i16);
                            if (charAt26 >= 55296) {
                                int i101 = charAt26 & 8191;
                                int i102 = 13;
                                while (true) {
                                    i26 = i100 + 1;
                                    charAt11 = str.charAt(i100);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i101 |= (charAt11 & 8191) << i102;
                                    i102 += 13;
                                    i100 = i26;
                                }
                                charAt26 = i101 | (charAt11 << i102);
                                i25 = i26;
                            } else {
                                i25 = i100;
                            }
                            int i103 = i6 + i6 + (charAt26 / 32);
                            java.lang.Object obj3 = zze[i103];
                            i19 = i80;
                            if (obj3 instanceof java.lang.reflect.Field) {
                                zzs = (java.lang.reflect.Field) obj3;
                            } else {
                                zzs = zzs(cls3, (java.lang.String) obj3);
                                zze[i103] = zzs;
                            }
                            cls2 = cls3;
                            i21 = charAt26 % 32;
                            i20 = i25;
                            i22 = (int) unsafe.objectFieldOffset(zzs);
                        }
                        if (i78 >= 18 || i78 > 49) {
                            i23 = i20;
                            i4 = i93;
                        } else {
                            iArr[i67] = objectFieldOffset;
                            i67++;
                            i4 = i93;
                            i23 = i20;
                        }
                        i24 = i19;
                    }
                    int i104 = i69 / 3;
                    objArr[i104 + i104 + i27] = zze[i93];
                    str = zzd;
                    i93 = i28;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i19 = i80;
                    cls2 = cls3;
                    i20 = i16;
                    i21 = 0;
                    i22 = 1048575;
                    if (i78 >= 18) {
                    }
                    i23 = i20;
                    i4 = i93;
                    i24 = i19;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                if ((charAt24 & 4096) != 0) {
                }
                i19 = i80;
                cls2 = cls3;
                i20 = i16;
                i21 = 0;
                i22 = 1048575;
                if (i78 >= 18) {
                }
                i23 = i20;
                i4 = i93;
                i24 = i19;
            }
            int i105 = i69 + 1;
            iArr3[i69] = i18;
            int i106 = i69 + 2;
            java.lang.Class<?> cls4 = cls2;
            iArr3[i105] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i24 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i69 += 3;
            iArr3[i106] = (i21 << 20) | i22;
            zzd = str;
            length = i79;
            i5 = i81;
            zzrzVar2 = zzrzVar;
            i2 = i17;
            c = 55296;
            i36 = i23;
            cls3 = cls4;
        }
        return new com.google.android.gms.internal.consent_sdk.zzrt(iArr3, objArr, i2, i5, zzrzVar2.zza(), false, iArr, i3, i64, zzrvVar, zzrcVar, zzspVar, zzqbVar, zzrlVar);
    }

    private static double zzj(java.lang.Object obj, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j)).doubleValue();
    }

    private static float zzk(java.lang.Object obj, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j)).floatValue();
    }

    private static int zzl(java.lang.Object obj, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j)).intValue();
    }

    private final int zzm(int i) {
        return this.zzc[i + 2];
    }

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(java.lang.Object obj, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j)).longValue();
    }

    private final com.google.android.gms.internal.consent_sdk.zzsa zzq(int i) {
        java.lang.Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        com.google.android.gms.internal.consent_sdk.zzsa zzsaVar = (com.google.android.gms.internal.consent_sdk.zzsa) objArr[i3];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        com.google.android.gms.internal.consent_sdk.zzsa zzb2 = com.google.android.gms.internal.consent_sdk.zzrx.zza().zzb((java.lang.Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final java.lang.Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static java.lang.reflect.Field zzs(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields), e);
        }
    }

    private final void zzt(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (zzy(obj2, i)) {
            int zzo = zzo(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = zzo;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.consent_sdk.zzsa zzq = zzq(i);
            if (!zzy(obj, i)) {
                if (zzB(object)) {
                    java.lang.Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzv(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                java.lang.Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzu(java.lang.Object obj, java.lang.Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzC(obj2, i2, i)) {
            int zzo = zzo(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = zzo;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.consent_sdk.zzsa zzq = zzq(i);
            if (!zzC(obj, i2, i)) {
                if (zzB(object)) {
                    java.lang.Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzw(obj, i2, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                java.lang.Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzv(java.lang.Object obj, int i) {
        int zzm = zzm(i);
        long j = 1048575 & zzm;
        if (j == 1048575) {
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzsw.zzq(obj, j, (1 << (zzm >>> 20)) | com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j));
    }

    private final void zzw(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.consent_sdk.zzsw.zzq(obj, zzm(i2) & 1048575, i);
    }

    private final boolean zzx(java.lang.Object obj, java.lang.Object obj2, int i) {
        return zzy(obj, i) == zzy(obj2, i);
    }

    private final boolean zzy(java.lang.Object obj, int i) {
        int zzm = zzm(i);
        long j = zzm & 1048575;
        if (j != 1048575) {
            return (com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j) & (1 << (zzm >>> 20))) != 0;
        }
        int zzo = zzo(i);
        long j2 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.consent_sdk.zzsw.zza(obj, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.consent_sdk.zzsw.zzb(obj, j2)) != 0;
            case 2:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j2) != 0;
            case 3:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j2) != 0;
            case 4:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j2) != 0;
            case 5:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j2) != 0;
            case 6:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j2) != 0;
            case 7:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzw(obj, j2);
            case 8:
                java.lang.Object zzf = com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j2);
                if (zzf instanceof java.lang.String) {
                    return !((java.lang.String) zzf).isEmpty();
                }
                if (zzf instanceof com.google.android.gms.internal.consent_sdk.zzpm) {
                    return !com.google.android.gms.internal.consent_sdk.zzpm.zzb.equals(zzf);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j2) != null;
            case 10:
                return !com.google.android.gms.internal.consent_sdk.zzpm.zzb.equals(com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j2));
            case 11:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j2) != 0;
            case 12:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j2) != 0;
            case 13:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j2) != 0;
            case 14:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j2) != 0;
            case 15:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j2) != 0;
            case 16:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j2) != 0;
            case 17:
                return com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final boolean zzz(java.lang.Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzy(obj, i) : (i3 & i4) != 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zza(java.lang.Object obj) {
        int i;
        int i2;
        int i3;
        int zzC;
        int zzC2;
        int zzC3;
        int zzD;
        int zzC4;
        int zzC5;
        int zzd;
        int zzC6;
        int zzi;
        int zzh;
        int size;
        int zzC7;
        int zzC8;
        int zzj;
        int zzC9;
        int zzC10;
        int zzf;
        int zzC11;
        int zzC12;
        int i4;
        sun.misc.Unsafe unsafe = zzb;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i8 >= iArr.length) {
                int zza2 = i9 + ((com.google.android.gms.internal.consent_sdk.zzqm) obj).zzc.zza();
                if (!this.zzf) {
                    return zza2;
                }
                com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb.zza;
                int zzc = zzsiVar.zzc();
                int i10 = 0;
                for (int i11 = 0; i11 < zzc; i11++) {
                    java.util.Map.Entry zzg = zzsiVar.zzg(i11);
                    i10 += com.google.android.gms.internal.consent_sdk.zzqf.zzc((com.google.android.gms.internal.consent_sdk.zzqe) ((com.google.android.gms.internal.consent_sdk.zzse) zzg).zza(), zzg.getValue());
                }
                for (java.util.Map.Entry entry : zzsiVar.zzd()) {
                    i10 += com.google.android.gms.internal.consent_sdk.zzqf.zzc((com.google.android.gms.internal.consent_sdk.zzqe) entry.getKey(), entry.getValue());
                }
                return zza2 + i10;
            }
            int zzo = zzo(i8);
            int zzn = zzn(zzo);
            int i12 = iArr[i8];
            int i13 = iArr[i8 + 2];
            int i14 = i13 & i5;
            if (zzn <= 17) {
                if (i14 != i6) {
                    i7 = i14 == i5 ? 0 : unsafe.getInt(obj, i14);
                    i6 = i14;
                }
                i = i6;
                i2 = i7;
                i3 = 1 << (i13 >>> 20);
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            int i15 = zzo & i5;
            if (zzn >= com.google.android.gms.internal.consent_sdk.zzqg.DOUBLE_LIST_PACKED.zza()) {
                com.google.android.gms.internal.consent_sdk.zzqg.SINT64_LIST_PACKED.zza();
            }
            long j = i15;
            switch (zzn) {
                case 0:
                    if (zzz(obj, i8, i, i2, i3)) {
                        zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC + 8;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzz(obj, i8, i, i2, i3)) {
                        zzC2 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC2 + 4;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzz(obj, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD(j2);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzz(obj, i8, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD(j3);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzz(obj, i8, i, i2, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD(j4);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzz(obj, i8, i, i2, i3)) {
                        zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC + 8;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzz(obj, i8, i, i2, i3)) {
                        zzC2 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC2 + 4;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzz(obj, i8, i, i2, i3)) {
                        zzC4 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC4 + 1;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzz(obj, i8, i, i2, i3)) {
                        break;
                    } else {
                        int i16 = i12 << 3;
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof com.google.android.gms.internal.consent_sdk.zzpm) {
                            zzC5 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i16);
                            zzd = ((com.google.android.gms.internal.consent_sdk.zzpm) object).zzd();
                            zzC6 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd);
                            zzi = zzC5 + zzC6 + zzd;
                            i9 += zzi;
                            break;
                        } else {
                            zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i16);
                            zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzB((java.lang.String) object);
                            zzi = zzC3 + zzD;
                            i9 += zzi;
                        }
                    }
                case 9:
                    if (zzz(obj, i8, i, i2, i3)) {
                        zzi = com.google.android.gms.internal.consent_sdk.zzsc.zzi(i12, unsafe.getObject(obj, j), zzq(i8));
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzz(obj, i8, i, i2, i3)) {
                        com.google.android.gms.internal.consent_sdk.zzpm zzpmVar = (com.google.android.gms.internal.consent_sdk.zzpm) unsafe.getObject(obj, j);
                        zzC5 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzd = zzpmVar.zzd();
                        zzC6 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd);
                        zzi = zzC5 + zzC6 + zzd;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzz(obj, i8, i, i2, i3)) {
                        int i17 = unsafe.getInt(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i17);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzz(obj, i8, i, i2, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD(j5);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzz(obj, i8, i, i2, i3)) {
                        zzC2 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC2 + 4;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzz(obj, i8, i, i2, i3)) {
                        zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC + 8;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzz(obj, i8, i, i2, i3)) {
                        int i18 = unsafe.getInt(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzC((i18 >> 31) ^ (i18 + i18));
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzz(obj, i8, i, i2, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD((j6 >> 63) ^ (j6 + j6));
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzz(obj, i8, i, i2, i3)) {
                        zzi = com.google.android.gms.internal.consent_sdk.zzsc.zza(i12, (com.google.android.gms.internal.consent_sdk.zzrq) unsafe.getObject(obj, j), zzq(i8));
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzi = com.google.android.gms.internal.consent_sdk.zzsc.zze(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzi;
                    break;
                case 19:
                    zzi = com.google.android.gms.internal.consent_sdk.zzsc.zzc(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzi;
                    break;
                case 20:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    int i19 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    if (list.size() != 0) {
                        zzh = com.google.android.gms.internal.consent_sdk.zzsc.zzh(list) + (list.size() * com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3));
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 21:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    int i20 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzsc.zzm(list2);
                        zzC7 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = size * zzC7;
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    }
                    zzi = 0;
                    i9 += zzi;
                case 22:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    int i21 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzsc.zzg(list3);
                        zzC7 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = size * zzC7;
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    }
                    zzi = 0;
                    i9 += zzi;
                case 23:
                    zzi = com.google.android.gms.internal.consent_sdk.zzsc.zze(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzi;
                    break;
                case 24:
                    zzi = com.google.android.gms.internal.consent_sdk.zzsc.zzc(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzi;
                    break;
                case 25:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    int i22 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzi = size2 * (com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3) + 1);
                        i9 += zzi;
                        break;
                    }
                    zzi = 0;
                    i9 += zzi;
                case 26:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj, j);
                    int i23 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzh = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3) * size3;
                        if (list5 instanceof com.google.android.gms.internal.consent_sdk.zzrb) {
                            com.google.android.gms.internal.consent_sdk.zzrb zzrbVar = (com.google.android.gms.internal.consent_sdk.zzrb) list5;
                            for (int i24 = 0; i24 < size3; i24++) {
                                java.lang.Object zza3 = zzrbVar.zza();
                                if (zza3 instanceof com.google.android.gms.internal.consent_sdk.zzpm) {
                                    int zzd2 = ((com.google.android.gms.internal.consent_sdk.zzpm) zza3).zzd();
                                    zzh += com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd2) + zzd2;
                                } else {
                                    zzh += com.google.android.gms.internal.consent_sdk.zzpv.zzB((java.lang.String) zza3);
                                }
                            }
                        } else {
                            for (int i25 = 0; i25 < size3; i25++) {
                                java.lang.Object obj2 = list5.get(i25);
                                if (obj2 instanceof com.google.android.gms.internal.consent_sdk.zzpm) {
                                    int zzd3 = ((com.google.android.gms.internal.consent_sdk.zzpm) obj2).zzd();
                                    zzh += com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd3) + zzd3;
                                } else {
                                    zzh += com.google.android.gms.internal.consent_sdk.zzpv.zzB((java.lang.String) obj2);
                                }
                            }
                        }
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 27:
                    java.util.List list6 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.consent_sdk.zzsa zzq = zzq(i8);
                    int i26 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzC8 = 0;
                    } else {
                        zzC8 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            java.lang.Object obj3 = list6.get(i27);
                            if (obj3 instanceof com.google.android.gms.internal.consent_sdk.zzra) {
                                zzj = ((com.google.android.gms.internal.consent_sdk.zzra) obj3).zza();
                                zzC9 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzj);
                            } else {
                                zzj = ((com.google.android.gms.internal.consent_sdk.zzpa) obj3).zzj(zzq);
                                zzC9 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzj);
                            }
                            zzC8 += zzC9 + zzj;
                        }
                    }
                    i9 += zzC8;
                    break;
                case 28:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj, j);
                    int i28 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzC10 = 0;
                    } else {
                        zzC10 = size5 * com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int zzd4 = ((com.google.android.gms.internal.consent_sdk.zzpm) list7.get(i29)).zzd();
                            zzC10 += com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd4) + zzd4;
                        }
                    }
                    i9 += zzC10;
                    break;
                case 29:
                    java.util.List list8 = (java.util.List) unsafe.getObject(obj, j);
                    int i30 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzsc.zzl(list8);
                        zzC7 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = size * zzC7;
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    }
                    zzi = 0;
                    i9 += zzi;
                case 30:
                    java.util.List list9 = (java.util.List) unsafe.getObject(obj, j);
                    int i31 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzsc.zzb(list9);
                        zzC7 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = size * zzC7;
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    }
                    zzi = 0;
                    i9 += zzi;
                case 31:
                    zzi = com.google.android.gms.internal.consent_sdk.zzsc.zzc(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzi;
                    break;
                case 32:
                    zzi = com.google.android.gms.internal.consent_sdk.zzsc.zze(i12, (java.util.List) unsafe.getObject(obj, j), z);
                    i9 += zzi;
                    break;
                case 33:
                    java.util.List list10 = (java.util.List) unsafe.getObject(obj, j);
                    int i32 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzsc.zzj(list10);
                        zzC7 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = size * zzC7;
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    }
                    zzi = 0;
                    i9 += zzi;
                case 34:
                    java.util.List list11 = (java.util.List) unsafe.getObject(obj, j);
                    int i33 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzsc.zzk(list11);
                        zzC7 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = size * zzC7;
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    }
                    zzi = 0;
                    i9 += zzi;
                case 35:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzf((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzd((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzh((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzm((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzg((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzf((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzd((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    java.util.List list12 = (java.util.List) unsafe.getObject(obj, j);
                    int i34 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    zzf = list12.size();
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzl((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzb((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzd((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzf((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzj((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzf = com.google.android.gms.internal.consent_sdk.zzsc.zzk((java.util.List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC11 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzC12 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzf);
                        zzC10 = zzC11 + zzC12 + zzf;
                        i9 += zzC10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    java.util.List list13 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.consent_sdk.zzsa zzq2 = zzq(i8);
                    int i35 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i36 = 0; i36 < size6; i36++) {
                            i4 += com.google.android.gms.internal.consent_sdk.zzsc.zza(i12, (com.google.android.gms.internal.consent_sdk.zzrq) list13.get(i36), zzq2);
                        }
                    }
                    i9 += i4;
                    break;
                case 50:
                    com.google.android.gms.internal.consent_sdk.zzrk zzrkVar = (com.google.android.gms.internal.consent_sdk.zzrk) unsafe.getObject(obj, j);
                    com.google.android.gms.internal.consent_sdk.zzrj zzrjVar = (com.google.android.gms.internal.consent_sdk.zzrj) zzr(i8);
                    if (!zzrkVar.isEmpty()) {
                        zzh = 0;
                        for (java.util.Map.Entry entry2 : zzrkVar.entrySet()) {
                            zzh += zzrjVar.zza(i12, entry2.getKey(), entry2.getValue());
                        }
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 51:
                    if (zzC(obj, i12, i8)) {
                        zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC + 8;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzC(obj, i12, i8)) {
                        zzC2 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC2 + 4;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzC(obj, i12, i8)) {
                        long zzp = zzp(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzp);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzC(obj, i12, i8)) {
                        long zzp2 = zzp(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzp2);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzC(obj, i12, i8)) {
                        long zzl = zzl(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzl);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzC(obj, i12, i8)) {
                        zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC + 8;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzC(obj, i12, i8)) {
                        zzC2 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC2 + 4;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzC(obj, i12, i8)) {
                        zzC4 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC4 + 1;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzC(obj, i12, i8)) {
                        break;
                    } else {
                        int i37 = i12 << 3;
                        java.lang.Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof com.google.android.gms.internal.consent_sdk.zzpm) {
                            zzC5 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i37);
                            zzd = ((com.google.android.gms.internal.consent_sdk.zzpm) object2).zzd();
                            zzC6 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd);
                            zzi = zzC5 + zzC6 + zzd;
                            i9 += zzi;
                            break;
                        } else {
                            zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i37);
                            zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzB((java.lang.String) object2);
                            zzi = zzC3 + zzD;
                            i9 += zzi;
                        }
                    }
                case 60:
                    if (zzC(obj, i12, i8)) {
                        zzi = com.google.android.gms.internal.consent_sdk.zzsc.zzi(i12, unsafe.getObject(obj, j), zzq(i8));
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzC(obj, i12, i8)) {
                        com.google.android.gms.internal.consent_sdk.zzpm zzpmVar2 = (com.google.android.gms.internal.consent_sdk.zzpm) unsafe.getObject(obj, j);
                        zzC5 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzd = zzpmVar2.zzd();
                        zzC6 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd);
                        zzi = zzC5 + zzC6 + zzd;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzC(obj, i12, i8)) {
                        int zzl2 = zzl(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzl2);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzC(obj, i12, i8)) {
                        long zzl3 = zzl(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD(zzl3);
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzC(obj, i12, i8)) {
                        zzC2 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC2 + 4;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzC(obj, i12, i8)) {
                        zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzi = zzC + 8;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzC(obj, i12, i8)) {
                        int zzl4 = zzl(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzC((zzl4 >> 31) ^ (zzl4 + zzl4));
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzC(obj, i12, i8)) {
                        long zzp3 = zzp(obj, j);
                        zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i12 << 3);
                        zzD = com.google.android.gms.internal.consent_sdk.zzpv.zzD((zzp3 >> 63) ^ (zzp3 + zzp3));
                        zzi = zzC3 + zzD;
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzC(obj, i12, i8)) {
                        zzi = com.google.android.gms.internal.consent_sdk.zzsc.zza(i12, (com.google.android.gms.internal.consent_sdk.zzrq) unsafe.getObject(obj, j), zzq(i8));
                        i9 += zzi;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            i6 = i;
            i7 = i2;
            z = false;
            i5 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(java.lang.Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int hashCode = (i5 * 53) + ((com.google.android.gms.internal.consent_sdk.zzqm) obj).zzc.hashCode();
                return this.zzf ? (hashCode * 53) + ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzo = zzo(i4);
            int i6 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i7 = iArr[i4];
            long j = i6;
            int i8 = 37;
            switch (zzn) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = java.lang.Double.doubleToLongBits(com.google.android.gms.internal.consent_sdk.zzsw.zza(obj, j));
                    byte[] bArr = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = java.lang.Float.floatToIntBits(com.google.android.gms.internal.consent_sdk.zzsw.zzb(obj, j));
                    i5 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j);
                    byte[] bArr2 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j);
                    byte[] bArr3 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j);
                    byte[] bArr4 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzqs.zza(com.google.android.gms.internal.consent_sdk.zzsw.zzw(obj, j));
                    i5 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((java.lang.String) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j)).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i5 * 53;
                    java.lang.Object zzf = com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i5 = i3 + i8;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j);
                    byte[] bArr5 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j);
                    i5 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j);
                    byte[] bArr6 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                    i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i5 * 53;
                    java.lang.Object zzf2 = com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i5 = i3 + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j).hashCode();
                    i5 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = java.lang.Double.doubleToLongBits(zzj(obj, j));
                        byte[] bArr7 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = java.lang.Float.floatToIntBits(zzk(obj, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzl(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzl(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = com.google.android.gms.internal.consent_sdk.zzqs.zza(zzD(obj, j));
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = ((java.lang.String) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j)).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzl(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzl(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzl(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = zzl(obj, j);
                        i5 = i2 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i = i5 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
                        i5 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!zzC(obj, i7, i4)) {
                        break;
                    } else {
                        i2 = i5 * 53;
                        floatToIntBits = com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j).hashCode();
                        i5 = i2 + floatToIntBits;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final java.lang.Object zzc() {
        return ((com.google.android.gms.internal.consent_sdk.zzqm) this.zze).zzr();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzd(java.lang.Object obj) {
        if (zzB(obj)) {
            if (obj instanceof com.google.android.gms.internal.consent_sdk.zzqm) {
                com.google.android.gms.internal.consent_sdk.zzqm zzqmVar = (com.google.android.gms.internal.consent_sdk.zzqm) obj;
                zzqmVar.zzA(Integer.MAX_VALUE);
                zzqmVar.zza = 0;
                zzqmVar.zzy();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzo = zzo(i);
                int i2 = 1048575 & zzo;
                int zzn = zzn(zzo);
                long j = i2;
                if (zzn != 9) {
                    if (zzn != 60 && zzn != 68) {
                        switch (zzn) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((com.google.android.gms.internal.consent_sdk.zzqr) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = zzb;
                                java.lang.Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((com.google.android.gms.internal.consent_sdk.zzrk) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzC(obj, iArr[i], i)) {
                        zzq(i).zzd(zzb.getObject(obj, j));
                    }
                }
                if (zzy(obj, i)) {
                    zzq(i).zzd(zzb.getObject(obj, j));
                }
            }
            this.zzi.zza(obj);
            if (this.zzf) {
                this.zzj.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(java.lang.Object obj, java.lang.Object obj2) {
        if (!zzB(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                com.google.android.gms.internal.consent_sdk.zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    com.google.android.gms.internal.consent_sdk.zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int zzo = zzo(i);
            int i2 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i3 = iArr[i];
            long j = i2;
            switch (zzn) {
                case 0:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzo(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zza(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 1:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzp(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzb(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 2:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzr(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 3:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzr(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 4:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzq(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 5:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzr(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 6:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzq(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 7:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzm(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzw(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 8:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzs(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 9:
                    zzt(obj, obj2, i);
                    break;
                case 10:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzs(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 11:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzq(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 12:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzq(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 13:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzq(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 14:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzr(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 15:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzq(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 16:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzr(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 17:
                    zzt(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    com.google.android.gms.internal.consent_sdk.zzqr zzqrVar = (com.google.android.gms.internal.consent_sdk.zzqr) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j);
                    com.google.android.gms.internal.consent_sdk.zzqr zzqrVar2 = (com.google.android.gms.internal.consent_sdk.zzqr) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j);
                    int size = zzqrVar.size();
                    int size2 = zzqrVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVar.zzc()) {
                            zzqrVar = zzqrVar.zzd(size2 + size);
                        }
                        zzqrVar.addAll(zzqrVar2);
                    }
                    if (size > 0) {
                        zzqrVar2 = zzqrVar;
                    }
                    com.google.android.gms.internal.consent_sdk.zzsw.zzs(obj, j, zzqrVar2);
                    break;
                case 50:
                    int i4 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                    com.google.android.gms.internal.consent_sdk.zzrk zzrkVar = (com.google.android.gms.internal.consent_sdk.zzrk) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j);
                    com.google.android.gms.internal.consent_sdk.zzrk zzrkVar2 = (com.google.android.gms.internal.consent_sdk.zzrk) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j);
                    if (!zzrkVar2.isEmpty()) {
                        if (!zzrkVar.zze()) {
                            zzrkVar = zzrkVar.zzb();
                        }
                        zzrkVar.zzd(zzrkVar2);
                    }
                    com.google.android.gms.internal.consent_sdk.zzsw.zzs(obj, j, zzrkVar);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzC(obj2, i3, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzs(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    }
                case 60:
                    zzu(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzC(obj2, i3, i)) {
                        break;
                    } else {
                        com.google.android.gms.internal.consent_sdk.zzsw.zzs(obj, j, com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    }
                case 68:
                    zzu(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(java.lang.Object obj, com.google.android.gms.internal.consent_sdk.zztb zztbVar) throws java.io.IOException {
        java.util.Map.Entry entry;
        int[] iArr;
        int i;
        java.util.Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        java.util.Map.Entry entry3;
        if (this.zzf) {
            com.google.android.gms.internal.consent_sdk.zzqf zzqfVar = ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb;
            if (!zzqfVar.zza.isEmpty()) {
                entry = (java.util.Map.Entry) zzqfVar.zzf().next();
                iArr = this.zzc;
                sun.misc.Unsafe unsafe = zzb;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzo = zzo(i);
                    int zzn = zzn(zzo);
                    int i8 = iArr[i];
                    if (zzn <= 17) {
                        int i9 = iArr[i + 2];
                        int i10 = i9 & i5;
                        if (i10 != i6) {
                            i7 = i10 == i5 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        }
                        i2 = i6;
                        i3 = i7;
                        i4 = 1 << (i9 >>> 20);
                    } else {
                        i2 = i6;
                        i3 = i7;
                        i4 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = zzo & i5;
                    switch (zzn) {
                        case 0:
                            entry3 = entry;
                            if (!zzz(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zztbVar.zzf(i8, com.google.android.gms.internal.consent_sdk.zzsw.zza(obj, j));
                                continue;
                            }
                        case 1:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzn(i8, com.google.android.gms.internal.consent_sdk.zzsw.zzb(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzs(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzJ(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzq(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzl(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzj(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzb(i8, com.google.android.gms.internal.consent_sdk.zzsw.zzw(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zzE(i8, unsafe.getObject(obj, j), zztbVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzv(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzd(i8, (com.google.android.gms.internal.consent_sdk.zzpm) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzH(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzh(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzx(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzz(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzB(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzD(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzp(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzr(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 19:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzv(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 20:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzx(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 21:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzD(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 22:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzw(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 23:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzu(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 24:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzt(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 25:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzq(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 26:
                            int i11 = iArr[i];
                            java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                            int i12 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                            if (list != null && !list.isEmpty()) {
                                zztbVar.zzG(i11, list);
                                break;
                            }
                            break;
                        case 27:
                            int i13 = iArr[i];
                            java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                            com.google.android.gms.internal.consent_sdk.zzsa zzq = zzq(i);
                            int i14 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((com.google.android.gms.internal.consent_sdk.zzpw) zztbVar).zzv(i13, list2.get(i15), zzq);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i16 = iArr[i];
                            java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                            int i17 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zztbVar.zze(i16, list3);
                                break;
                            }
                            break;
                        case 29:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzC(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 30:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzs(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 31:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzy(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 32:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzz(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 33:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzA(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 34:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzB(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 35:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzr(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 36:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzv(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 37:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzx(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 38:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzD(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 39:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzw(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 40:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzu(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 41:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzt(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 42:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzq(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 43:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzC(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 44:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzs(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 45:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzy(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 46:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzz(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 47:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzA(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 48:
                            com.google.android.gms.internal.consent_sdk.zzsc.zzB(iArr[i], (java.util.List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 49:
                            int i18 = iArr[i];
                            java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                            com.google.android.gms.internal.consent_sdk.zzsa zzq2 = zzq(i);
                            int i19 = com.google.android.gms.internal.consent_sdk.zzsc.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((com.google.android.gms.internal.consent_sdk.zzpw) zztbVar).zzp(i18, list4.get(i20), zzq2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            java.lang.Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zztbVar.zzu(i8, ((com.google.android.gms.internal.consent_sdk.zzrj) zzr(i)).zzc(), (com.google.android.gms.internal.consent_sdk.zzrk) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzf(i8, zzj(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzn(i8, zzk(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzs(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzJ(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzq(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzl(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzj(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzb(i8, zzD(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzC(obj, i8, i)) {
                                zzE(i8, unsafe.getObject(obj, j), zztbVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzv(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzd(i8, (com.google.android.gms.internal.consent_sdk.zzpm) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzH(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzh(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzx(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzz(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzB(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzD(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzp(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                            break;
                    }
                    entry3 = entry;
                    i += 3;
                    i6 = i2;
                    entry = entry3;
                    i7 = i3;
                    i5 = 1048575;
                }
                entry2 = entry;
                if (entry2 != null) {
                    com.google.android.gms.internal.consent_sdk.zzsq zzsqVar = ((com.google.android.gms.internal.consent_sdk.zzqm) obj).zzc;
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = this.zzc;
        sun.misc.Unsafe unsafe2 = zzb;
        int i52 = 1048575;
        int i62 = 1048575;
        int i72 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        entry2 = entry;
        if (entry2 != null) {
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(java.lang.Object obj, java.lang.Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzx(obj, obj2, i) && java.lang.Double.doubleToLongBits(com.google.android.gms.internal.consent_sdk.zzsw.zza(obj, j)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.consent_sdk.zzsw.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzx(obj, obj2, i) && java.lang.Float.floatToIntBits(com.google.android.gms.internal.consent_sdk.zzsw.zzb(obj, j)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.consent_sdk.zzsw.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzw(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsc.zzE(com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j), com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsc.zzE(com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j), com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsc.zzE(com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j), com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj, j) == com.google.android.gms.internal.consent_sdk.zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzx(obj, obj2, i) && com.google.android.gms.internal.consent_sdk.zzsc.zzE(com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j), com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzE = com.google.android.gms.internal.consent_sdk.zzsc.zzE(com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j), com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j));
                    break;
                case 50:
                    zzE = com.google.android.gms.internal.consent_sdk.zzsc.zzE(com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j), com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzm = zzm(i) & 1048575;
                    if (com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj, zzm) == com.google.android.gms.internal.consent_sdk.zzsw.zzc(obj2, zzm) && com.google.android.gms.internal.consent_sdk.zzsc.zzE(com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, j), com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((com.google.android.gms.internal.consent_sdk.zzqm) obj).zzc.equals(((com.google.android.gms.internal.consent_sdk.zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb.equals(((com.google.android.gms.internal.consent_sdk.zzqk) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzh(java.lang.Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzo = zzo(i6);
            int i8 = iArr2[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzo) != 0 && !zzz(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzC(obj, i7, i6) && !zzA(obj, zzo, zzq(i6))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn != 50) {
                            continue;
                        } else {
                            com.google.android.gms.internal.consent_sdk.zzrk zzrkVar = (com.google.android.gms.internal.consent_sdk.zzrk) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, zzo & 1048575);
                            if (!zzrkVar.isEmpty() && ((com.google.android.gms.internal.consent_sdk.zzrj) zzr(i6)).zzc().zzb.zzb() == com.google.android.gms.internal.consent_sdk.zzta.MESSAGE) {
                                com.google.android.gms.internal.consent_sdk.zzsa zzsaVar = null;
                                for (java.lang.Object obj2 : zzrkVar.values()) {
                                    if (zzsaVar == null) {
                                        zzsaVar = com.google.android.gms.internal.consent_sdk.zzrx.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzsaVar.zzh(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                java.util.List list = (java.util.List) com.google.android.gms.internal.consent_sdk.zzsw.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    com.google.android.gms.internal.consent_sdk.zzsa zzq = zzq(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzq.zzh(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzz(obj, i6, i, i2, i10) && !zzA(obj, zzo, zzq(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzf || ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb.zzj();
    }
}
