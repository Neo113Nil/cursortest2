package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbfa<T> implements com.google.android.libraries.places.internal.zzbfl<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.libraries.places.internal.zzbgf.zzq();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.libraries.places.internal.zzbex zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final com.google.android.libraries.places.internal.zzbfy zzm;
    private final com.google.android.libraries.places.internal.zzbdc zzn;

    private static boolean zzA(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzB(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.libraries.places.internal.zzbdq) {
            return ((com.google.android.libraries.places.internal.zzbdq) obj).zzbp();
        }
        return true;
    }

    private static void zzC(java.lang.Object obj) {
        if (!zzB(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
    }

    private static double zzD(java.lang.Object obj, long j) {
        return ((java.lang.Double) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j)).doubleValue();
    }

    private static float zzE(java.lang.Object obj, long j) {
        return ((java.lang.Float) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j)).floatValue();
    }

    private static int zzF(java.lang.Object obj, long j) {
        return ((java.lang.Integer) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j)).intValue();
    }

    private static long zzG(java.lang.Object obj, long j) {
        return ((java.lang.Long) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j)).longValue();
    }

    private static boolean zzH(java.lang.Object obj, long j) {
        return ((java.lang.Boolean) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j)).booleanValue();
    }

    private final boolean zzI(java.lang.Object obj, java.lang.Object obj2, int i) {
        return zzK(obj, i) == zzK(obj2, i);
    }

    private final boolean zzJ(java.lang.Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzK(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzK(java.lang.Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (com.google.android.libraries.places.internal.zzbgf.zzd(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzx = zzx(i);
        long j2 = zzx & 1048575;
        switch (zzz(zzx)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.libraries.places.internal.zzbgf.zzl(obj, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.libraries.places.internal.zzbgf.zzj(obj, j2)) != 0;
            case 2:
                return com.google.android.libraries.places.internal.zzbgf.zzf(obj, j2) != 0;
            case 3:
                return com.google.android.libraries.places.internal.zzbgf.zzf(obj, j2) != 0;
            case 4:
                return com.google.android.libraries.places.internal.zzbgf.zzd(obj, j2) != 0;
            case 5:
                return com.google.android.libraries.places.internal.zzbgf.zzf(obj, j2) != 0;
            case 6:
                return com.google.android.libraries.places.internal.zzbgf.zzd(obj, j2) != 0;
            case 7:
                return com.google.android.libraries.places.internal.zzbgf.zzh(obj, j2);
            case 8:
                java.lang.Object zzn = com.google.android.libraries.places.internal.zzbgf.zzn(obj, j2);
                if (zzn instanceof java.lang.String) {
                    return !((java.lang.String) zzn).isEmpty();
                }
                if (zzn instanceof com.google.android.libraries.places.internal.zzbcl) {
                    return !com.google.android.libraries.places.internal.zzbcl.zza.equals(zzn);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.libraries.places.internal.zzbgf.zzn(obj, j2) != null;
            case 10:
                return !com.google.android.libraries.places.internal.zzbcl.zza.equals(com.google.android.libraries.places.internal.zzbgf.zzn(obj, j2));
            case 11:
                return com.google.android.libraries.places.internal.zzbgf.zzd(obj, j2) != 0;
            case 12:
                return com.google.android.libraries.places.internal.zzbgf.zzd(obj, j2) != 0;
            case 13:
                return com.google.android.libraries.places.internal.zzbgf.zzd(obj, j2) != 0;
            case 14:
                return com.google.android.libraries.places.internal.zzbgf.zzf(obj, j2) != 0;
            case 15:
                return com.google.android.libraries.places.internal.zzbgf.zzd(obj, j2) != 0;
            case 16:
                return com.google.android.libraries.places.internal.zzbgf.zzf(obj, j2) != 0;
            case 17:
                return com.google.android.libraries.places.internal.zzbgf.zzn(obj, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final void zzL(java.lang.Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        com.google.android.libraries.places.internal.zzbgf.zze(obj, j, (1 << (zzy >>> 20)) | com.google.android.libraries.places.internal.zzbgf.zzd(obj, j));
    }

    private final boolean zzM(java.lang.Object obj, int i, int i2) {
        return com.google.android.libraries.places.internal.zzbgf.zzd(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private final void zzN(java.lang.Object obj, int i, int i2) {
        com.google.android.libraries.places.internal.zzbgf.zze(obj, zzy(i2) & 1048575, i);
    }

    private static final void zzO(int i, java.lang.Object obj, com.google.android.libraries.places.internal.zzbgl zzbglVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzbglVar.zzm(i, (java.lang.String) obj);
        } else {
            zzbglVar.zzn(i, (com.google.android.libraries.places.internal.zzbcl) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.libraries.places.internal.zzbfa zzj(java.lang.Class cls, com.google.android.libraries.places.internal.zzbeu zzbeuVar, com.google.android.libraries.places.internal.zzbfd zzbfdVar, com.google.android.libraries.places.internal.zzbek zzbekVar, com.google.android.libraries.places.internal.zzbfy zzbfyVar, com.google.android.libraries.places.internal.zzbdc zzbdcVar, com.google.android.libraries.places.internal.zzbes zzbesVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
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
        com.google.android.libraries.places.internal.zzbfj zzbfjVar;
        int i18;
        int objectFieldOffset;
        java.lang.String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        java.lang.reflect.Field zzk;
        int i25;
        char charAt11;
        int i26;
        java.lang.Object obj;
        java.lang.reflect.Field zzk2;
        java.lang.Object obj2;
        java.lang.reflect.Field zzk3;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        int i29;
        char charAt14;
        int i30;
        char charAt15;
        if (!(zzbeuVar instanceof com.google.android.libraries.places.internal.zzbfj)) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbfj zzbfjVar2 = (com.google.android.libraries.places.internal.zzbfj) zzbeuVar;
        java.lang.String zzd = zzbfjVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (zzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i33 = charAt16 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt15 = zzd.charAt(i32);
                if (charAt15 < 55296) {
                    break;
                }
                i33 |= (charAt15 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt16 = i33 | (charAt15 << i34);
            i32 = i30;
        }
        if (charAt16 == 0) {
            i6 = 0;
            charAt = 0;
            charAt2 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
            iArr = zza;
            i2 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt17 = zzd.charAt(i32);
            if (charAt17 >= 55296) {
                int i36 = charAt17 & 8191;
                int i37 = 13;
                while (true) {
                    i14 = i35 + 1;
                    charAt10 = zzd.charAt(i35);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i36 |= (charAt10 & 8191) << i37;
                    i37 += 13;
                    i35 = i14;
                }
                charAt17 = i36 | (charAt10 << i37);
                i35 = i14;
            }
            int i38 = i35 + 1;
            int charAt18 = zzd.charAt(i35);
            if (charAt18 >= 55296) {
                int i39 = charAt18 & 8191;
                int i40 = 13;
                while (true) {
                    i13 = i38 + 1;
                    charAt9 = zzd.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i13;
                }
                charAt18 = i39 | (charAt9 << i40);
                i38 = i13;
            }
            int i41 = i38 + 1;
            int charAt19 = zzd.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i12 = i41 + 1;
                    charAt8 = zzd.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i12;
                }
                charAt19 = i42 | (charAt8 << i43);
                i41 = i12;
            }
            int i44 = i41 + 1;
            int charAt20 = zzd.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i11 = i44 + 1;
                    charAt7 = zzd.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i11;
                }
                charAt20 = i45 | (charAt7 << i46);
                i44 = i11;
            }
            int i47 = i44 + 1;
            charAt = zzd.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i10 = i47 + 1;
                    charAt6 = zzd.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i10;
                }
                charAt = i48 | (charAt6 << i49);
                i47 = i10;
            }
            int i50 = i47 + 1;
            charAt2 = zzd.charAt(i47);
            if (charAt2 >= 55296) {
                int i51 = charAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i9 = i50 + 1;
                    charAt5 = zzd.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i9;
                }
                charAt2 = i51 | (charAt5 << i52);
                i50 = i9;
            }
            int i53 = i50 + 1;
            int charAt21 = zzd.charAt(i50);
            if (charAt21 >= 55296) {
                int i54 = charAt21 & 8191;
                int i55 = 13;
                while (true) {
                    i8 = i53 + 1;
                    charAt4 = zzd.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i8;
                }
                charAt21 = i54 | (charAt4 << i55);
                i53 = i8;
            }
            int i56 = i53 + 1;
            int charAt22 = zzd.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i7 = i56 + 1;
                    charAt3 = zzd.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i7;
                }
                charAt22 = i57 | (charAt3 << i58);
                i56 = i7;
            }
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            int i59 = charAt17 + charAt17 + charAt18;
            i2 = charAt17;
            i3 = charAt22;
            i32 = i56;
            i4 = charAt20;
            i5 = charAt19;
            i6 = i59;
            iArr = iArr2;
        }
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object[] zze = zzbfjVar2.zze();
        java.lang.Class<?> cls2 = zzbfjVar2.zzb().getClass();
        int i60 = i3 + charAt2;
        int[] iArr3 = new int[charAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[charAt + charAt];
        int i61 = i3;
        int i62 = i60;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int charAt23 = zzd.charAt(i32);
            if (charAt23 >= c) {
                int i66 = charAt23 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    charAt14 = zzd.charAt(i67);
                    if (charAt14 < c) {
                        break;
                    }
                    i66 |= (charAt14 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                charAt23 = i66 | (charAt14 << i68);
                i15 = i29;
            } else {
                i15 = i65;
            }
            int i69 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt13 = zzd.charAt(i71);
                    if (charAt13 < c) {
                        break;
                    }
                    i70 |= (charAt13 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                }
                charAt24 = i70 | (charAt13 << i72);
                i16 = i28;
            } else {
                i16 = i69;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            int i73 = charAt24 & 255;
            int i74 = length;
            int i75 = charAt24 & 2048;
            int i76 = i4;
            int i77 = i5;
            if (i73 >= 51) {
                int i78 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i79 = charAt25 & 8191;
                    int i80 = 13;
                    while (true) {
                        i27 = i78 + 1;
                        charAt12 = zzd.charAt(i78);
                        if (charAt12 < c2) {
                            break;
                        }
                        i79 |= (charAt12 & 8191) << i80;
                        i80 += 13;
                        i78 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i79 | (charAt12 << i80);
                    i78 = i27;
                }
                int i81 = i73 - 51;
                int i82 = i78;
                if (i81 == 9 || i81 == 17) {
                    i26 = i6 + 1;
                    int i83 = i63 / 3;
                    objArr[i83 + i83 + 1] = zze[i6];
                } else {
                    if (i81 == 12) {
                        if (zzbfjVar2.zzc() == 1 || i75 != 0) {
                            i26 = i6 + 1;
                            int i84 = i63 / 3;
                            objArr[i84 + i84 + 1] = zze[i6];
                        } else {
                            i75 = 0;
                        }
                    }
                    int i85 = charAt25 + charAt25;
                    obj = zze[i85];
                    if (obj instanceof java.lang.reflect.Field) {
                        zzk2 = zzk(cls2, (java.lang.String) obj);
                        zze[i85] = zzk2;
                    } else {
                        zzk2 = (java.lang.reflect.Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzk2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    int i87 = i75;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        zzk3 = zzk(cls2, (java.lang.String) obj2);
                        zze[i86] = zzk3;
                    } else {
                        zzk3 = (java.lang.reflect.Field) obj2;
                    }
                    i23 = (int) unsafe.objectFieldOffset(zzk3);
                    str = zzd;
                    i22 = objectFieldOffset2;
                    i24 = i87;
                    i21 = 0;
                    zzbfjVar = zzbfjVar2;
                    i18 = i73;
                    i17 = charAt23;
                    i32 = i82;
                }
                i6 = i26;
                int i852 = charAt25 + charAt25;
                obj = zze[i852];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzk2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                int i872 = i75;
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                i23 = (int) unsafe.objectFieldOffset(zzk3);
                str = zzd;
                i22 = objectFieldOffset22;
                i24 = i872;
                i21 = 0;
                zzbfjVar = zzbfjVar2;
                i18 = i73;
                i17 = charAt23;
                i32 = i82;
            } else {
                int i88 = i6 + 1;
                java.lang.reflect.Field zzk4 = zzk(cls2, (java.lang.String) zze[i6]);
                i17 = charAt23;
                if (i73 == 9 || i73 == 17) {
                    zzbfjVar = zzbfjVar2;
                    int i89 = i63 / 3;
                    objArr[i89 + i89 + 1] = zzk4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        zzbfjVar = zzbfjVar2;
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        zzbfjVar = zzbfjVar2;
                        if (zzbfjVar2.zzc() != 1 && i75 == 0) {
                            i18 = i73;
                            i75 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzk4);
                            if ((charAt24 & 4096) != 0 || i18 > 17) {
                                str = zzd;
                                i19 = i75;
                                i20 = 1048575;
                                i21 = 0;
                            } else {
                                int i90 = i16 + 1;
                                int charAt26 = zzd.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i91 = charAt26 & 8191;
                                    int i92 = 13;
                                    while (true) {
                                        i25 = i90 + 1;
                                        charAt11 = zzd.charAt(i90);
                                        if (charAt11 < 55296) {
                                            break;
                                        }
                                        i91 |= (charAt11 & 8191) << i92;
                                        i92 += 13;
                                        i90 = i25;
                                    }
                                    charAt26 = i91 | (charAt11 << i92);
                                    i90 = i25;
                                }
                                int i93 = i2 + i2 + (charAt26 / 32);
                                java.lang.Object obj3 = zze[i93];
                                str = zzd;
                                if (obj3 instanceof java.lang.reflect.Field) {
                                    zzk = (java.lang.reflect.Field) obj3;
                                } else {
                                    zzk = zzk(cls2, (java.lang.String) obj3);
                                    zze[i93] = zzk;
                                }
                                i19 = i75;
                                i20 = (int) unsafe.objectFieldOffset(zzk);
                                i21 = charAt26 % 32;
                                i16 = i90;
                            }
                            if (i18 >= 18 && i18 <= 49) {
                                iArr[i62] = objectFieldOffset;
                                i62++;
                            }
                            i6 = i88;
                            i22 = objectFieldOffset;
                            i32 = i16;
                            i23 = i20;
                            i24 = i19;
                        }
                    } else if (i73 == 50) {
                        int i94 = i6 + 2;
                        int i95 = i61 + 1;
                        iArr[i61] = i63;
                        int i96 = i63 / 3;
                        int i97 = i96 + i96;
                        objArr[i97] = zze[i88];
                        if (i75 != 0) {
                            objArr[i97 + 1] = zze[i94];
                            i88 = i6 + 3;
                            i61 = i95;
                        } else {
                            i88 = i94;
                            i61 = i95;
                            i75 = 0;
                        }
                        zzbfjVar = zzbfjVar2;
                    } else {
                        zzbfjVar = zzbfjVar2;
                    }
                    int i98 = i63 / 3;
                    objArr[i98 + i98 + 1] = zze[i88];
                    i18 = i73;
                    i88 = i6 + 2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzk4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = zzd;
                    i19 = i75;
                    i20 = 1048575;
                    i21 = 0;
                    if (i18 >= 18) {
                        iArr[i62] = objectFieldOffset;
                        i62++;
                    }
                    i6 = i88;
                    i22 = objectFieldOffset;
                    i32 = i16;
                    i23 = i20;
                    i24 = i19;
                }
                i18 = i73;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzk4);
                if ((charAt24 & 4096) != 0) {
                }
                str = zzd;
                i19 = i75;
                i20 = 1048575;
                i21 = 0;
                if (i18 >= 18) {
                }
                i6 = i88;
                i22 = objectFieldOffset;
                i32 = i16;
                i23 = i20;
                i24 = i19;
            }
            iArr3[i63] = i17;
            iArr3[i63 + 1] = (i18 << 20) | (i24 != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | i22;
            iArr3[i63 + 2] = (i21 << 20) | i23;
            i63 += 3;
            length = i74;
            i4 = i76;
            zzbfjVar2 = zzbfjVar;
            zzd = str;
            i5 = i77;
            c = 55296;
        }
        return new com.google.android.libraries.places.internal.zzbfa(iArr3, objArr, i5, i4, zzbfjVar2.zzb(), false, iArr, i3, i60, zzbfdVar, zzbekVar, zzbfyVar, zzbdcVar, zzbesVar);
    }

    private static java.lang.reflect.Field zzk(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name2 = cls.getName();
            java.lang.String arrays = java.util.Arrays.toString(declaredFields);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 11 + java.lang.String.valueOf(name2).length() + 29 + java.lang.String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name2);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new java.lang.RuntimeException(sb.toString(), e);
        }
    }

    private final void zzl(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (zzK(obj2, i)) {
            int zzx = zzx(i);
            sun.misc.Unsafe unsafe = zzb;
            long j = zzx & 1048575;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                java.lang.String obj3 = obj2.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            com.google.android.libraries.places.internal.zzbfl zzn = zzn(i);
            if (!zzK(obj, i)) {
                if (zzB(object)) {
                    java.lang.Object zza2 = zzn.zza();
                    zzn.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzL(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                java.lang.Object zza3 = zzn.zza();
                zzn.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzn.zzd(object2, object);
        }
    }

    private final void zzm(java.lang.Object obj, java.lang.Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int zzx = zzx(i);
            sun.misc.Unsafe unsafe = zzb;
            long j = zzx & 1048575;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                java.lang.String obj3 = obj2.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            com.google.android.libraries.places.internal.zzbfl zzn = zzn(i);
            if (!zzM(obj, i2, i)) {
                if (zzB(object)) {
                    java.lang.Object zza2 = zzn.zza();
                    zzn.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzN(obj, i2, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                java.lang.Object zza3 = zzn.zza();
                zzn.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzn.zzd(object2, object);
        }
    }

    private final com.google.android.libraries.places.internal.zzbfl zzn(int i) {
        java.lang.Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        com.google.android.libraries.places.internal.zzbfl zzbflVar = (com.google.android.libraries.places.internal.zzbfl) objArr[i3];
        if (zzbflVar != null) {
            return zzbflVar;
        }
        com.google.android.libraries.places.internal.zzbfl zzb2 = com.google.android.libraries.places.internal.zzbfh.zza().zzb((java.lang.Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final java.lang.Object zzo(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final com.google.android.libraries.places.internal.zzbdw zzp(int i) {
        int i2 = i / 3;
        return (com.google.android.libraries.places.internal.zzbdw) this.zzd[i2 + i2 + 1];
    }

    private final java.lang.Object zzq(java.lang.Object obj, int i) {
        com.google.android.libraries.places.internal.zzbfl zzn = zzn(i);
        int zzx = zzx(i);
        if (!zzK(obj, i)) {
            return zzn.zza();
        }
        java.lang.Object object = zzb.getObject(obj, 1048575 & zzx);
        if (zzB(object)) {
            return object;
        }
        java.lang.Object zza2 = zzn.zza();
        if (object != null) {
            zzn.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzr(java.lang.Object obj, int i, java.lang.Object obj2) {
        zzb.putObject(obj, zzx(i) & 1048575, obj2);
        zzL(obj, i);
    }

    private final java.lang.Object zzs(java.lang.Object obj, int i, int i2) {
        com.google.android.libraries.places.internal.zzbfl zzn = zzn(i2);
        if (!zzM(obj, i, i2)) {
            return zzn.zza();
        }
        java.lang.Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        if (zzB(object)) {
            return object;
        }
        java.lang.Object zza2 = zzn.zza();
        if (object != null) {
            zzn.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzt(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final java.lang.Object zzu(java.lang.Object obj, int i, java.lang.Object obj2, com.google.android.libraries.places.internal.zzbfy zzbfyVar, java.lang.Object obj3) {
        int i2 = this.zzc[i];
        java.lang.Object zzn = com.google.android.libraries.places.internal.zzbgf.zzn(obj, zzx(i) & 1048575);
        if (zzn == null || zzp(i) == null) {
            return obj2;
        }
        throw null;
    }

    private static boolean zzv(java.lang.Object obj, int i, com.google.android.libraries.places.internal.zzbfl zzbflVar) {
        return zzbflVar.zzi(com.google.android.libraries.places.internal.zzbgf.zzn(obj, i & 1048575));
    }

    private final void zzw(java.lang.Object obj, int i, com.google.android.libraries.places.internal.zzbfk zzbfkVar) throws java.io.IOException {
        long j = i & 1048575;
        if (zzA(i)) {
            com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, zzbfkVar.zzn());
        } else if (this.zzi) {
            com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, zzbfkVar.zzm());
        } else {
            com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, zzbfkVar.zzs());
        }
    }

    private final int zzx(int i) {
        return this.zzc[i + 1];
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private static int zzz(int i) {
        return (i >>> 20) & 255;
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final java.lang.Object zza() {
        return ((com.google.android.libraries.places.internal.zzbdq) this.zzg).zzbs();
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final boolean zzb(java.lang.Object obj, java.lang.Object obj2) {
        boolean zzC;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzx = zzx(i);
            long j = zzx & 1048575;
            switch (zzz(zzx)) {
                case 0:
                    if (zzI(obj, obj2, i) && java.lang.Double.doubleToLongBits(com.google.android.libraries.places.internal.zzbgf.zzl(obj, j)) == java.lang.Double.doubleToLongBits(com.google.android.libraries.places.internal.zzbgf.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzI(obj, obj2, i) && java.lang.Float.floatToIntBits(com.google.android.libraries.places.internal.zzbgf.zzj(obj, j)) == java.lang.Float.floatToIntBits(com.google.android.libraries.places.internal.zzbgf.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzf(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzf(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzd(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzf(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzd(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzh(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbfn.zzC(com.google.android.libraries.places.internal.zzbgf.zzn(obj, j), com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbfn.zzC(com.google.android.libraries.places.internal.zzbgf.zzn(obj, j), com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbfn.zzC(com.google.android.libraries.places.internal.zzbgf.zzn(obj, j), com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzd(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzd(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzd(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzf(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzd(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbgf.zzf(obj, j) == com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzI(obj, obj2, i) && com.google.android.libraries.places.internal.zzbfn.zzC(com.google.android.libraries.places.internal.zzbgf.zzn(obj, j), com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j))) {
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
                    zzC = com.google.android.libraries.places.internal.zzbfn.zzC(com.google.android.libraries.places.internal.zzbgf.zzn(obj, j), com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j));
                    break;
                case 50:
                    zzC = com.google.android.libraries.places.internal.zzbfn.zzC(com.google.android.libraries.places.internal.zzbgf.zzn(obj, j), com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j));
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
                    long zzy = zzy(i) & 1048575;
                    if (com.google.android.libraries.places.internal.zzbgf.zzd(obj, zzy) == com.google.android.libraries.places.internal.zzbgf.zzd(obj2, zzy) && com.google.android.libraries.places.internal.zzbfn.zzC(com.google.android.libraries.places.internal.zzbgf.zzn(obj, j), com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzC) {
                return false;
            }
        }
        if (!((com.google.android.libraries.places.internal.zzbdq) obj).zzc.equals(((com.google.android.libraries.places.internal.zzbdq) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.equals(((com.google.android.libraries.places.internal.zzbdn) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final int zzc(java.lang.Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((com.google.android.libraries.places.internal.zzbdq) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzx = zzx(i3);
            int zzz = zzz(zzx);
            int i5 = iArr[i3];
            long j = zzx & 1048575;
            int i6 = 37;
            switch (zzz) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = java.lang.Double.doubleToLongBits(com.google.android.libraries.places.internal.zzbgf.zzl(obj, j));
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = java.lang.Float.floatToIntBits(com.google.android.libraries.places.internal.zzbgf.zzj(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = com.google.android.libraries.places.internal.zzbgf.zzf(obj, j);
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = com.google.android.libraries.places.internal.zzbgf.zzf(obj, j);
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = com.google.android.libraries.places.internal.zzbgf.zzf(obj, j);
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbeb.zza(com.google.android.libraries.places.internal.zzbgf.zzh(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((java.lang.String) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    java.lang.Object zzn = com.google.android.libraries.places.internal.zzbgf.zzn(obj, j);
                    if (zzn != null) {
                        i6 = zzn.hashCode();
                    }
                    i4 = i2 + i6;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = com.google.android.libraries.places.internal.zzbgf.zzf(obj, j);
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = com.google.android.libraries.places.internal.zzbgf.zzf(obj, j);
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    java.lang.Object zzn2 = com.google.android.libraries.places.internal.zzbgf.zzn(obj, j);
                    if (zzn2 != null) {
                        i6 = zzn2.hashCode();
                    }
                    i4 = i2 + i6;
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
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = java.lang.Double.doubleToLongBits(zzD(obj, j));
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = java.lang.Float.floatToIntBits(zzE(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzG(obj, j);
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzG(obj, j);
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzF(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzG(obj, j);
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzF(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = com.google.android.libraries.places.internal.zzbeb.zza(zzH(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((java.lang.String) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzF(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzF(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzF(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzG(obj, j);
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzF(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzG(obj, j);
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzM(obj, i5, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = com.google.android.libraries.places.internal.zzbgf.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final void zzd(java.lang.Object obj, java.lang.Object obj2) {
        zzC(obj);
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                com.google.android.libraries.places.internal.zzbfn.zzE(this.zzm, obj, obj2);
                if (this.zzh) {
                    com.google.android.libraries.places.internal.zzbfn.zzD(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzx = zzx(i);
            int zzz = zzz(zzx);
            int i2 = iArr[i];
            long j = zzx & 1048575;
            switch (zzz) {
                case 0:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzm(obj, j, com.google.android.libraries.places.internal.zzbgf.zzl(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 1:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzk(obj, j, com.google.android.libraries.places.internal.zzbgf.zzj(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 2:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, j, com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 3:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, j, com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 4:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zze(obj, j, com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 5:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, j, com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 6:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zze(obj, j, com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 7:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzi(obj, j, com.google.android.libraries.places.internal.zzbgf.zzh(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 8:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 9:
                    zzl(obj, obj2, i);
                    break;
                case 10:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 11:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zze(obj, j, com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 12:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zze(obj, j, com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 13:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zze(obj, j, com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 14:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, j, com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 15:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zze(obj, j, com.google.android.libraries.places.internal.zzbgf.zzd(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 16:
                    if (!zzK(obj2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, j, com.google.android.libraries.places.internal.zzbgf.zzf(obj2, j));
                        zzL(obj, i);
                        break;
                    }
                case 17:
                    zzl(obj, obj2, i);
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
                    com.google.android.libraries.places.internal.zzbea zzbeaVar = (com.google.android.libraries.places.internal.zzbea) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j);
                    com.google.android.libraries.places.internal.zzbea zzbeaVar2 = (com.google.android.libraries.places.internal.zzbea) com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j);
                    int size = zzbeaVar.size();
                    int size2 = zzbeaVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzbeaVar.zza()) {
                            zzbeaVar = zzbeaVar.zzg(size2 + size);
                        }
                        zzbeaVar.addAll(zzbeaVar2);
                    }
                    if (size > 0) {
                        zzbeaVar2 = zzbeaVar;
                    }
                    com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, zzbeaVar2);
                    break;
                case 50:
                    com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, com.google.android.libraries.places.internal.zzbes.zza(com.google.android.libraries.places.internal.zzbgf.zzn(obj, j), com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j)));
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
                    if (!zzM(obj2, i2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    }
                case 60:
                    zzm(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzM(obj2, i2, i)) {
                        break;
                    } else {
                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, j, com.google.android.libraries.places.internal.zzbgf.zzn(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    }
                case 68:
                    zzm(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v134, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v278, types: [int] */
    /* JADX WARN: Type inference failed for: r0v286, types: [int] */
    /* JADX WARN: Type inference failed for: r0v292 */
    /* JADX WARN: Type inference failed for: r0v293 */
    /* JADX WARN: Type inference failed for: r0v294 */
    /* JADX WARN: Type inference failed for: r0v295 */
    /* JADX WARN: Type inference failed for: r0v296 */
    /* JADX WARN: Type inference failed for: r0v297 */
    /* JADX WARN: Type inference failed for: r0v298 */
    /* JADX WARN: Type inference failed for: r0v299 */
    /* JADX WARN: Type inference failed for: r0v300 */
    /* JADX WARN: Type inference failed for: r0v301 */
    /* JADX WARN: Type inference failed for: r0v302 */
    /* JADX WARN: Type inference failed for: r0v303 */
    /* JADX WARN: Type inference failed for: r0v304 */
    /* JADX WARN: Type inference failed for: r0v305 */
    /* JADX WARN: Type inference failed for: r0v306 */
    /* JADX WARN: Type inference failed for: r0v307 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v28, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37, types: [int] */
    /* JADX WARN: Type inference failed for: r1v42, types: [int] */
    /* JADX WARN: Type inference failed for: r1v57, types: [int] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v92, types: [int] */
    /* JADX WARN: Type inference failed for: r1v95, types: [int] */
    /* JADX WARN: Type inference failed for: r2v118 */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v120 */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v47, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v57, types: [int] */
    /* JADX WARN: Type inference failed for: r2v61, types: [int] */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [int] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v43, types: [int] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.libraries.places.internal.zzbfl
    public final int zze(java.lang.Object obj) {
        boolean z;
        int i;
        ?? r5;
        int zzy;
        int zzy2;
        int zzy3;
        int zzz;
        int zzy4;
        ?? zzy5;
        int zzy6;
        int i2;
        int i3;
        ?? zzo;
        int size;
        int zzp;
        int zzy7;
        int zzA;
        int zzA2;
        ?? r3;
        int zzbn;
        int zzy8;
        ?? r0;
        int i4;
        int i5;
        int zzx;
        int zzy9;
        int zzy10;
        int zzy11;
        int zzy12;
        int i6;
        int i7;
        sun.misc.Unsafe unsafe = zzb;
        boolean z2 = false;
        int i8 = 1048575;
        boolean z3 = false;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i9 >= iArr.length) {
                int zzi = i10 + ((com.google.android.libraries.places.internal.zzbdq) obj).zzc.zzi();
                if (!this.zzh) {
                    return zzi;
                }
                com.google.android.libraries.places.internal.zzbfs zzbfsVar = ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.zza;
                int zzc = zzbfsVar.zzc();
                int i12 = 0;
                for (int i13 = 0; i13 < zzc; i13++) {
                    java.util.Map.Entry zzd = zzbfsVar.zzd(i13);
                    i12 += com.google.android.libraries.places.internal.zzbdg.zzj((com.google.android.libraries.places.internal.zzbdf) ((com.google.android.libraries.places.internal.zzbfp) zzd).zza(), zzd.getValue());
                }
                for (java.util.Map.Entry entry : zzbfsVar.zze()) {
                    i12 += com.google.android.libraries.places.internal.zzbdg.zzj((com.google.android.libraries.places.internal.zzbdf) entry.getKey(), entry.getValue());
                }
                return zzi + i12;
            }
            int zzx2 = zzx(i9);
            int zzz2 = zzz(zzx2);
            int i14 = iArr[i9];
            int i15 = iArr[i9 + 2];
            int i16 = i15 & i8;
            boolean z4 = z3;
            if (zzz2 <= 17) {
                if (i16 != i11) {
                    i11 = i16;
                    z4 = i16 == i8 ? z2 : unsafe.getInt(obj, i16);
                }
                z = z4;
                i = i11;
                r5 = 1 << (i15 >>> 20);
            } else {
                z = z3;
                i = i11;
                r5 = z2;
            }
            if (zzz2 >= com.google.android.libraries.places.internal.zzbdh.DOUBLE_LIST_PACKED.zza()) {
                com.google.android.libraries.places.internal.zzbdh.SINT64_LIST_PACKED.zza();
            }
            long j = zzx2 & i8;
            switch (zzz2) {
                case 0:
                    if (zzJ(obj, i9, i, z, r5)) {
                        zzy = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        r0 = zzy + 8;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 1:
                    if (zzJ(obj, i9, i, z, r5)) {
                        zzy2 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy5 = zzy2 + 4;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 2:
                    if (zzJ(obj, i9, i, z, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzz = com.google.android.libraries.places.internal.zzbcu.zzz(j2);
                        zzy5 = zzy3 + zzz;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 3:
                    if (zzJ(obj, i9, i, z, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzz = com.google.android.libraries.places.internal.zzbcu.zzz(j3);
                        zzy5 = zzy3 + zzz;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 4:
                    if (zzJ(obj, i9, i, z, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzz = com.google.android.libraries.places.internal.zzbcu.zzz(j4);
                        zzy5 = zzy3 + zzz;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 5:
                    if (zzJ(obj, i9, i, z, r5)) {
                        zzy4 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy5 = zzy4 + 8;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 6:
                    if (zzJ(obj, i9, i, z, r5)) {
                        zzy2 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy5 = zzy2 + 4;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 7:
                    if (zzJ(obj, i9, i, z, r5)) {
                        zzy5 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3) + 1;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 8:
                    if (zzJ(obj, i9, i, z, r5)) {
                        int i17 = i14 << 3;
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof com.google.android.libraries.places.internal.zzbcl) {
                            int zzy13 = com.google.android.libraries.places.internal.zzbcu.zzy(i17);
                            int zzc2 = ((com.google.android.libraries.places.internal.zzbcl) object).zzc();
                            zzy6 = com.google.android.libraries.places.internal.zzbcu.zzy(zzc2);
                            i2 = zzy13;
                            i3 = zzc2;
                            zzy5 = i2 + zzy6 + i3;
                            i10 += zzy5;
                            i9 += 3;
                            z3 = z;
                            i11 = i;
                            z2 = false;
                            i8 = 1048575;
                        } else {
                            zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i17);
                            zzz = com.google.android.libraries.places.internal.zzbcu.zzA((java.lang.String) object);
                            zzy5 = zzy3 + zzz;
                            i10 += zzy5;
                            i9 += 3;
                            z3 = z;
                            i11 = i;
                            z2 = false;
                            i8 = 1048575;
                        }
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 9:
                    if (zzJ(obj, i9, i, z, r5)) {
                        r0 = com.google.android.libraries.places.internal.zzbfn.zzz(i14, unsafe.getObject(obj, j), zzn(i9));
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 10:
                    if (zzJ(obj, i9, i, z, r5)) {
                        com.google.android.libraries.places.internal.zzbcl zzbclVar = (com.google.android.libraries.places.internal.zzbcl) unsafe.getObject(obj, j);
                        i2 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        i3 = zzbclVar.zzc();
                        zzy6 = com.google.android.libraries.places.internal.zzbcu.zzy(i3);
                        zzy5 = i2 + zzy6 + i3;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 11:
                    if (zzJ(obj, i9, i, z, r5)) {
                        int i18 = unsafe.getInt(obj, j);
                        zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzz = com.google.android.libraries.places.internal.zzbcu.zzy(i18);
                        zzy5 = zzy3 + zzz;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 12:
                    if (zzJ(obj, i9, i, z, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzz = com.google.android.libraries.places.internal.zzbcu.zzz(j5);
                        zzy5 = zzy3 + zzz;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 13:
                    if (zzJ(obj, i9, i, z, r5)) {
                        zzy2 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy5 = zzy2 + 4;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 14:
                    if (zzJ(obj, i9, i, z, r5)) {
                        zzy4 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy5 = zzy4 + 8;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 15:
                    if (zzJ(obj, i9, i, z, r5)) {
                        int i19 = unsafe.getInt(obj, j);
                        zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzz = com.google.android.libraries.places.internal.zzbcu.zzy((i19 + i19) ^ (i19 >> 31));
                        zzy5 = zzy3 + zzz;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 16:
                    if (zzJ(obj, i9, i, z, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzz = com.google.android.libraries.places.internal.zzbcu.zzz((j6 + j6) ^ (j6 >> 63));
                        zzy5 = zzy3 + zzz;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 17:
                    if (zzJ(obj, i9, i, z, r5)) {
                        r0 = com.google.android.libraries.places.internal.zzbfn.zzA(i14, (com.google.android.libraries.places.internal.zzbex) unsafe.getObject(obj, j), zzn(i9));
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 18:
                    r0 = com.google.android.libraries.places.internal.zzbfn.zzy(i14, (java.util.List) unsafe.getObject(obj, j), z2);
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 19:
                    r0 = com.google.android.libraries.places.internal.zzbfn.zzw(i14, (java.util.List) unsafe.getObject(obj, j), z2);
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 20:
                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                    if (list.size() != 0) {
                        zzo = com.google.android.libraries.places.internal.zzbfn.zzo(list) + (list.size() * com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3));
                        i10 += zzo;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                    zzo = z2;
                    i10 += zzo;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 21:
                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                    size = list2.size();
                    if (size != 0) {
                        zzp = com.google.android.libraries.places.internal.zzbfn.zzp(list2);
                        zzy7 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        int i20 = size * zzy7;
                        i4 = zzp;
                        i5 = i20;
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                    r0 = z2;
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 22:
                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                    size = list3.size();
                    if (size != 0) {
                        zzp = com.google.android.libraries.places.internal.zzbfn.zzs(list3);
                        zzy7 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        int i202 = size * zzy7;
                        i4 = zzp;
                        i5 = i202;
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                    r0 = z2;
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 23:
                    r0 = com.google.android.libraries.places.internal.zzbfn.zzy(i14, (java.util.List) unsafe.getObject(obj, j), z2);
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 24:
                    r0 = com.google.android.libraries.places.internal.zzbfn.zzw(i14, (java.util.List) unsafe.getObject(obj, j), z2);
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 25:
                    int size2 = ((java.util.List) unsafe.getObject(obj, j)).size();
                    if (size2 != 0) {
                        r0 = size2 * (com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3) + 1);
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                    r0 = z2;
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 26:
                    ?? r02 = (java.util.List) unsafe.getObject(obj, j);
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzy14 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3) * size3;
                        if (r02 instanceof com.google.android.libraries.places.internal.zzbej) {
                            com.google.android.libraries.places.internal.zzbej zzbejVar = (com.google.android.libraries.places.internal.zzbej) r02;
                            zzo = zzy14;
                            for (?? r32 = z2; r32 < size3; r32++) {
                                java.lang.Object zzc3 = zzbejVar.zzc();
                                if (zzc3 instanceof com.google.android.libraries.places.internal.zzbcl) {
                                    int zzc4 = ((com.google.android.libraries.places.internal.zzbcl) zzc3).zzc();
                                    zzA2 = zzo + com.google.android.libraries.places.internal.zzbcu.zzy(zzc4) + zzc4;
                                } else {
                                    zzA2 = zzo + com.google.android.libraries.places.internal.zzbcu.zzA((java.lang.String) zzc3);
                                }
                                zzo = zzA2;
                            }
                        } else {
                            zzo = zzy14;
                            for (?? r33 = z2; r33 < size3; r33++) {
                                java.lang.Object obj2 = r02.get(r33);
                                if (obj2 instanceof com.google.android.libraries.places.internal.zzbcl) {
                                    int zzc5 = ((com.google.android.libraries.places.internal.zzbcl) obj2).zzc();
                                    zzA = zzo + com.google.android.libraries.places.internal.zzbcu.zzy(zzc5) + zzc5;
                                } else {
                                    zzA = zzo + com.google.android.libraries.places.internal.zzbcu.zzA((java.lang.String) obj2);
                                }
                                zzo = zzA;
                            }
                        }
                        i10 += zzo;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                    zzo = z2;
                    i10 += zzo;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 27:
                    ?? r03 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.libraries.places.internal.zzbfl zzn = zzn(i9);
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z2;
                    } else {
                        r3 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3) * size4;
                        for (?? r4 = z2; r4 < size4; r4++) {
                            java.lang.Object obj3 = r03.get(r4);
                            if (obj3 instanceof com.google.android.libraries.places.internal.zzbei) {
                                zzbn = ((com.google.android.libraries.places.internal.zzbei) obj3).zzb();
                                zzy8 = com.google.android.libraries.places.internal.zzbcu.zzy(zzbn);
                            } else {
                                zzbn = ((com.google.android.libraries.places.internal.zzbby) obj3).zzbn(zzn);
                                zzy8 = com.google.android.libraries.places.internal.zzbcu.zzy(zzbn);
                            }
                            r3 = (r3 == true ? 1 : 0) + zzy8 + zzbn;
                        }
                    }
                    i10 += r3;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 28:
                    ?? r04 = (java.util.List) unsafe.getObject(obj, j);
                    int size5 = r04.size();
                    if (size5 == 0) {
                        zzy5 = z2;
                    } else {
                        zzy5 = size5 * com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        for (?? r2 = z2; r2 < r04.size(); r2++) {
                            int zzc6 = ((com.google.android.libraries.places.internal.zzbcl) r04.get(r2)).zzc();
                            zzy5 += com.google.android.libraries.places.internal.zzbcu.zzy(zzc6) + zzc6;
                        }
                    }
                    i10 += zzy5;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 29:
                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                    size = list4.size();
                    if (size != 0) {
                        zzp = com.google.android.libraries.places.internal.zzbfn.zzt(list4);
                        zzy7 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        int i2022 = size * zzy7;
                        i4 = zzp;
                        i5 = i2022;
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                    r0 = z2;
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 30:
                    java.util.List list5 = (java.util.List) unsafe.getObject(obj, j);
                    size = list5.size();
                    if (size != 0) {
                        zzp = com.google.android.libraries.places.internal.zzbfn.zzr(list5);
                        zzy7 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        int i20222 = size * zzy7;
                        i4 = zzp;
                        i5 = i20222;
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                    r0 = z2;
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 31:
                    r0 = com.google.android.libraries.places.internal.zzbfn.zzw(i14, (java.util.List) unsafe.getObject(obj, j), z2);
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 32:
                    r0 = com.google.android.libraries.places.internal.zzbfn.zzy(i14, (java.util.List) unsafe.getObject(obj, j), z2);
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 33:
                    java.util.List list6 = (java.util.List) unsafe.getObject(obj, j);
                    size = list6.size();
                    if (size != 0) {
                        zzp = com.google.android.libraries.places.internal.zzbfn.zzu(list6);
                        zzy7 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        int i202222 = size * zzy7;
                        i4 = zzp;
                        i5 = i202222;
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                    r0 = z2;
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 34:
                    java.util.List list7 = (java.util.List) unsafe.getObject(obj, j);
                    size = list7.size();
                    if (size != 0) {
                        zzp = com.google.android.libraries.places.internal.zzbfn.zzq(list7);
                        zzy7 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        int i2022222 = size * zzy7;
                        i4 = zzp;
                        i5 = i2022222;
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                    r0 = z2;
                    i10 += r0;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 35:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzx((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 36:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzv((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 37:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzo((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 38:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzp((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 39:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzs((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 40:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzx((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 41:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzv((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 42:
                    zzx = ((java.util.List) unsafe.getObject(obj, j)).size();
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 43:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzt((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 44:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzr((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 45:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzv((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 46:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzx((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 47:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzu((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 48:
                    zzx = com.google.android.libraries.places.internal.zzbfn.zzq((java.util.List) unsafe.getObject(obj, j));
                    if (zzx > 0) {
                        zzy9 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        zzy10 = com.google.android.libraries.places.internal.zzbcu.zzy(zzx);
                        zzy5 = zzy9 + zzy10 + zzx;
                        i10 += zzy5;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 49:
                    java.util.List list8 = (java.util.List) unsafe.getObject(obj, j);
                    com.google.android.libraries.places.internal.zzbfl zzn2 = zzn(i9);
                    int size6 = list8.size();
                    r3 = z2;
                    if (size6 != 0) {
                        int i21 = r3;
                        r3 = r3;
                        while (i21 < size6) {
                            int zzA3 = r3 + com.google.android.libraries.places.internal.zzbfn.zzA(i14, (com.google.android.libraries.places.internal.zzbex) list8.get(i21), zzn2);
                            i21++;
                            r3 = zzA3;
                        }
                    }
                    i10 += r3;
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 50:
                    com.google.android.libraries.places.internal.zzber zzberVar = (com.google.android.libraries.places.internal.zzber) unsafe.getObject(obj, j);
                    if (zzberVar.isEmpty()) {
                        continue;
                    } else {
                        java.util.Iterator it = zzberVar.entrySet().iterator();
                        if (it.hasNext()) {
                            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
                case 51:
                    if (zzM(obj, i14, i9)) {
                        zzy = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        r0 = zzy + 8;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 52:
                    if (zzM(obj, i14, i9)) {
                        zzy11 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        r0 = zzy11 + 4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 53:
                    if (zzM(obj, i14, i9)) {
                        long zzG = zzG(obj, j);
                        i4 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        i5 = com.google.android.libraries.places.internal.zzbcu.zzz(zzG);
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 54:
                    if (zzM(obj, i14, i9)) {
                        long zzG2 = zzG(obj, j);
                        i4 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        i5 = com.google.android.libraries.places.internal.zzbcu.zzz(zzG2);
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 55:
                    if (zzM(obj, i14, i9)) {
                        long zzF = zzF(obj, j);
                        i4 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        i5 = com.google.android.libraries.places.internal.zzbcu.zzz(zzF);
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 56:
                    if (zzM(obj, i14, i9)) {
                        zzy = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        r0 = zzy + 8;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 57:
                    if (zzM(obj, i14, i9)) {
                        zzy11 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        r0 = zzy11 + 4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 58:
                    if (zzM(obj, i14, i9)) {
                        r0 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3) + 1;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 59:
                    if (zzM(obj, i14, i9)) {
                        int i22 = i14 << 3;
                        java.lang.Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof com.google.android.libraries.places.internal.zzbcl) {
                            int zzy15 = com.google.android.libraries.places.internal.zzbcu.zzy(i22);
                            int zzc7 = ((com.google.android.libraries.places.internal.zzbcl) object2).zzc();
                            zzy12 = com.google.android.libraries.places.internal.zzbcu.zzy(zzc7);
                            i6 = zzy15;
                            i7 = zzc7;
                            r0 = i6 + zzy12 + i7;
                            i10 += r0;
                            i9 += 3;
                            z3 = z;
                            i11 = i;
                            z2 = false;
                            i8 = 1048575;
                        } else {
                            i4 = com.google.android.libraries.places.internal.zzbcu.zzy(i22);
                            i5 = com.google.android.libraries.places.internal.zzbcu.zzA((java.lang.String) object2);
                            r0 = i5 + i4;
                            i10 += r0;
                            i9 += 3;
                            z3 = z;
                            i11 = i;
                            z2 = false;
                            i8 = 1048575;
                        }
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 60:
                    if (zzM(obj, i14, i9)) {
                        r0 = com.google.android.libraries.places.internal.zzbfn.zzz(i14, unsafe.getObject(obj, j), zzn(i9));
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 61:
                    if (zzM(obj, i14, i9)) {
                        com.google.android.libraries.places.internal.zzbcl zzbclVar2 = (com.google.android.libraries.places.internal.zzbcl) unsafe.getObject(obj, j);
                        i6 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        i7 = zzbclVar2.zzc();
                        zzy12 = com.google.android.libraries.places.internal.zzbcu.zzy(i7);
                        r0 = i6 + zzy12 + i7;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 62:
                    if (zzM(obj, i14, i9)) {
                        int zzF2 = zzF(obj, j);
                        i4 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        i5 = com.google.android.libraries.places.internal.zzbcu.zzy(zzF2);
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 63:
                    if (zzM(obj, i14, i9)) {
                        long zzF3 = zzF(obj, j);
                        i4 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        i5 = com.google.android.libraries.places.internal.zzbcu.zzz(zzF3);
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 64:
                    if (zzM(obj, i14, i9)) {
                        zzy11 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        r0 = zzy11 + 4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 65:
                    if (zzM(obj, i14, i9)) {
                        zzy = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        r0 = zzy + 8;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 66:
                    if (zzM(obj, i14, i9)) {
                        int zzF4 = zzF(obj, j);
                        i4 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        i5 = com.google.android.libraries.places.internal.zzbcu.zzy((zzF4 + zzF4) ^ (zzF4 >> 31));
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 67:
                    if (zzM(obj, i14, i9)) {
                        long zzG3 = zzG(obj, j);
                        i4 = com.google.android.libraries.places.internal.zzbcu.zzy(i14 << 3);
                        i5 = com.google.android.libraries.places.internal.zzbcu.zzz((zzG3 + zzG3) ^ (zzG3 >> 63));
                        r0 = i5 + i4;
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                case 68:
                    if (zzM(obj, i14, i9)) {
                        r0 = com.google.android.libraries.places.internal.zzbfn.zzA(i14, (com.google.android.libraries.places.internal.zzbex) unsafe.getObject(obj, j), zzn(i9));
                        i10 += r0;
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    } else {
                        i9 += 3;
                        z3 = z;
                        i11 = i;
                        z2 = false;
                        i8 = 1048575;
                    }
                default:
                    i9 += 3;
                    z3 = z;
                    i11 = i;
                    z2 = false;
                    i8 = 1048575;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.libraries.places.internal.zzbfl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(java.lang.Object obj, com.google.android.libraries.places.internal.zzbgl zzbglVar) throws java.io.IOException {
        java.util.Map.Entry entry;
        java.util.Iterator it;
        int[] iArr;
        int i;
        int i2;
        java.util.Map.Entry entry2;
        int i3;
        int i4;
        java.util.Iterator it2;
        int[] iArr2;
        java.util.Map.Entry entry3;
        boolean z;
        if (this.zzh) {
            com.google.android.libraries.places.internal.zzbdg zzbdgVar = ((com.google.android.libraries.places.internal.zzbdn) obj).zzb;
            if (!zzbdgVar.zza.isEmpty()) {
                java.util.Iterator zzd = zzbdgVar.zzd();
                entry = (java.util.Map.Entry) zzd.next();
                it = zzd;
                iArr = this.zzc;
                sun.misc.Unsafe unsafe = zzb;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzx = zzx(i);
                    int zzz = zzz(zzx);
                    int i8 = iArr[i];
                    if (zzz <= 17) {
                        int i9 = iArr[i + 2];
                        int i10 = i9 & i5;
                        if (i10 != i6) {
                            i7 = i10 == i5 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        }
                        int i11 = 1 << (i9 >>> 20);
                        entry2 = entry;
                        i3 = i7;
                        i4 = i11;
                        i2 = i6;
                    } else {
                        i2 = i6;
                        entry2 = entry;
                        i3 = i7;
                        i4 = 0;
                    }
                    while (entry2 != null) {
                        com.google.android.libraries.places.internal.zzbdc zzbdcVar = this.zzn;
                        if (i8 >= 525004180) {
                            zzbdcVar.zzc(zzbglVar, entry2);
                            entry2 = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                        } else {
                            long j = zzx & 1048575;
                            switch (zzz) {
                                case 0:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzf(i8, com.google.android.libraries.places.internal.zzbgf.zzl(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 1:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zze(i8, com.google.android.libraries.places.internal.zzbgf.zzj(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 2:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzc(i8, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 3:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzh(i8, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 4:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzi(i8, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 5:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzj(i8, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 6:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzk(i8, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 7:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzl(i8, com.google.android.libraries.places.internal.zzbgf.zzh(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 8:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzO(i8, unsafe.getObject(obj, j), zzbglVar);
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 9:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzr(i8, unsafe.getObject(obj, j), zzn(i));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 10:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzn(i8, (com.google.android.libraries.places.internal.zzbcl) unsafe.getObject(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 11:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzo(i8, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 12:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzg(i8, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 13:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzb(i8, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 14:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzd(i8, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 15:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzp(i8, unsafe.getInt(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 16:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzq(i8, unsafe.getLong(obj, j));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 17:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    if (zzJ(obj, i, i2, i3, i4)) {
                                        zzbglVar.zzs(i8, unsafe.getObject(obj, j), zzn(i));
                                    }
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 18:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zza(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 19:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzb(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 20:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzc(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 21:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzd(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 22:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzh(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 23:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzf(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 24:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzk(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 25:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzn(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 26:
                                    int i12 = iArr[i];
                                    java.util.List list = (java.util.List) unsafe.getObject(obj, j);
                                    if (list != null && !list.isEmpty()) {
                                        zzbglVar.zzF(i12, list);
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                    break;
                                case 27:
                                    int i13 = iArr[i];
                                    java.util.List list2 = (java.util.List) unsafe.getObject(obj, j);
                                    com.google.android.libraries.places.internal.zzbfl zzn = zzn(i);
                                    if (list2 != null && !list2.isEmpty()) {
                                        for (int i14 = 0; i14 < list2.size(); i14++) {
                                            ((com.google.android.libraries.places.internal.zzbcv) zzbglVar).zzr(i13, list2.get(i14), zzn);
                                        }
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                    break;
                                case 28:
                                    int i15 = iArr[i];
                                    java.util.List list3 = (java.util.List) unsafe.getObject(obj, j);
                                    if (list3 != null && !list3.isEmpty()) {
                                        zzbglVar.zzG(i15, list3);
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                    break;
                                case 29:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzi(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 30:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzm(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 31:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzl(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 32:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzg(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 33:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zzj(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 34:
                                    z = false;
                                    com.google.android.libraries.places.internal.zzbfn.zze(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, false);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 35:
                                    com.google.android.libraries.places.internal.zzbfn.zza(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 36:
                                    com.google.android.libraries.places.internal.zzbfn.zzb(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 37:
                                    com.google.android.libraries.places.internal.zzbfn.zzc(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 38:
                                    com.google.android.libraries.places.internal.zzbfn.zzd(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 39:
                                    com.google.android.libraries.places.internal.zzbfn.zzh(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 40:
                                    com.google.android.libraries.places.internal.zzbfn.zzf(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 41:
                                    com.google.android.libraries.places.internal.zzbfn.zzk(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 42:
                                    com.google.android.libraries.places.internal.zzbfn.zzn(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 43:
                                    com.google.android.libraries.places.internal.zzbfn.zzi(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 44:
                                    com.google.android.libraries.places.internal.zzbfn.zzm(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 45:
                                    com.google.android.libraries.places.internal.zzbfn.zzl(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 46:
                                    com.google.android.libraries.places.internal.zzbfn.zzg(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 47:
                                    com.google.android.libraries.places.internal.zzbfn.zzj(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 48:
                                    com.google.android.libraries.places.internal.zzbfn.zze(iArr[i], (java.util.List) unsafe.getObject(obj, j), zzbglVar, true);
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 49:
                                    int i16 = iArr[i];
                                    java.util.List list4 = (java.util.List) unsafe.getObject(obj, j);
                                    com.google.android.libraries.places.internal.zzbfl zzn2 = zzn(i);
                                    if (list4 != null && !list4.isEmpty()) {
                                        for (int i17 = 0; i17 < list4.size(); i17++) {
                                            ((com.google.android.libraries.places.internal.zzbcv) zzbglVar).zzs(i16, list4.get(i17), zzn2);
                                        }
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                    break;
                                case 50:
                                    if (unsafe.getObject(obj, j) != null) {
                                        throw null;
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 51:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzf(i8, zzD(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 52:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zze(i8, zzE(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 53:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzc(i8, zzG(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 54:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzh(i8, zzG(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 55:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzi(i8, zzF(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 56:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzj(i8, zzG(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 57:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzk(i8, zzF(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 58:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzl(i8, zzH(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 59:
                                    if (zzM(obj, i8, i)) {
                                        zzO(i8, unsafe.getObject(obj, j), zzbglVar);
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 60:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzr(i8, unsafe.getObject(obj, j), zzn(i));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 61:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzn(i8, (com.google.android.libraries.places.internal.zzbcl) unsafe.getObject(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 62:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzo(i8, zzF(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 63:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzg(i8, zzF(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 64:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzb(i8, zzF(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 65:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzd(i8, zzG(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 66:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzp(i8, zzF(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 67:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzq(i8, zzG(obj, j));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                case 68:
                                    if (zzM(obj, i8, i)) {
                                        zzbglVar.zzs(i8, unsafe.getObject(obj, j), zzn(i));
                                    }
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                                default:
                                    it2 = it;
                                    iArr2 = iArr;
                                    entry3 = entry2;
                                    i += 3;
                                    i6 = i2;
                                    i7 = i3;
                                    it = it2;
                                    iArr = iArr2;
                                    i5 = 1048575;
                                    entry = entry3;
                            }
                        }
                    }
                    long j2 = zzx & 1048575;
                    switch (zzz) {
                    }
                }
                java.util.Iterator it3 = it;
                while (entry != null) {
                    this.zzn.zzc(zzbglVar, entry);
                    entry = it3.hasNext() ? (java.util.Map.Entry) it3.next() : null;
                }
                ((com.google.android.libraries.places.internal.zzbdq) obj).zzc.zzg(zzbglVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        sun.misc.Unsafe unsafe2 = zzb;
        int i52 = 1048575;
        int i62 = 1048575;
        int i72 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        java.util.Iterator it32 = it;
        while (entry != null) {
        }
        ((com.google.android.libraries.places.internal.zzbdq) obj).zzc.zzg(zzbglVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final void zzh(java.lang.Object obj) {
        if (zzB(obj)) {
            if (obj instanceof com.google.android.libraries.places.internal.zzbdq) {
                com.google.android.libraries.places.internal.zzbdq zzbdqVar = (com.google.android.libraries.places.internal.zzbdq) obj;
                zzbdqVar.zzbw(Integer.MAX_VALUE);
                zzbdqVar.zza = 0;
                zzbdqVar.zzbq();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzx = zzx(i);
                int zzz = zzz(zzx);
                long j = zzx & 1048575;
                if (zzz != 9) {
                    if (zzz != 60 && zzz != 68) {
                        switch (zzz) {
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
                                ((com.google.android.libraries.places.internal.zzbea) com.google.android.libraries.places.internal.zzbgf.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = zzb;
                                java.lang.Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((com.google.android.libraries.places.internal.zzber) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzn(i).zzh(zzb.getObject(obj, j));
                    }
                }
                if (zzK(obj, i)) {
                    zzn(i).zzh(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zzb(obj);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfl
    public final boolean zzi(java.lang.Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzx = zzx(i6);
            int i8 = iArr2[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzx) != 0 && !zzJ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzz = zzz(zzx);
            if (zzz != 9 && zzz != 17) {
                if (zzz != 27) {
                    if (zzz == 60 || zzz == 68) {
                        if (zzM(obj, i7, i6) && !zzv(obj, zzx, zzn(i6))) {
                            return false;
                        }
                    } else if (zzz != 49) {
                        if (zzz == 50 && !((com.google.android.libraries.places.internal.zzber) com.google.android.libraries.places.internal.zzbgf.zzn(obj, zzx & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                java.util.List list = (java.util.List) com.google.android.libraries.places.internal.zzbgf.zzn(obj, zzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    com.google.android.libraries.places.internal.zzbfl zzn = zzn(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzn.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i10) && !zzv(obj, zzx, zzn(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || ((com.google.android.libraries.places.internal.zzbdn) obj).zzb.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x066d A[Catch: all -> 0x01d5, TRY_ENTER, TryCatch #1 {all -> 0x01d5, blocks: (B:257:0x01b7, B:38:0x064c, B:56:0x066d, B:57:0x0672), top: B:256:0x01b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0678 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x069e A[LOOP:4: B:73:0x069a->B:75:0x069e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x06b2  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // com.google.android.libraries.places.internal.zzbfl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(java.lang.Object obj, com.google.android.libraries.places.internal.zzbfk zzbfkVar, com.google.android.libraries.places.internal.zzbdb zzbdbVar) throws java.io.IOException {
        java.lang.Object obj2;
        int i;
        int i2;
        int i3;
        java.lang.Object zzo;
        int ordinal;
        java.lang.Object zze;
        java.lang.Object obj3;
        zzC(obj);
        com.google.android.libraries.places.internal.zzbfy zzbfyVar = this.zzm;
        com.google.android.libraries.places.internal.zzbdc zzbdcVar = this.zzn;
        ?? r12 = 0;
        java.lang.Object obj4 = null;
        com.google.android.libraries.places.internal.zzbdg zzbdgVar = null;
        while (true) {
            try {
                int zzb2 = zzbfkVar.zzb();
                int i4 = 1;
                if (zzb2 >= this.zze && zzb2 <= this.zzf) {
                    int[] iArr = this.zzc;
                    int length = (iArr.length / 3) - 1;
                    int i5 = 0;
                    while (i5 <= length) {
                        int i6 = (length + i5) >>> i4;
                        i2 = i6 * 3;
                        int i7 = iArr[i2];
                        if (zzb2 == i7) {
                            i3 = i2;
                            if (i3 < 0) {
                                int zzx = zzx(i3);
                                try {
                                } catch (com.google.android.libraries.places.internal.zzbec unused) {
                                    obj2 = obj4;
                                }
                                switch (zzz(zzx)) {
                                    case 0:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zzm(obj, zzx & 1048575, zzbfkVar.zze());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 1:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zzk(obj, zzx & 1048575, zzbfkVar.zzf());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 2:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, zzx & 1048575, zzbfkVar.zzh());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 3:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, zzx & 1048575, zzbfkVar.zzg());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 4:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zze(obj, zzx & 1048575, zzbfkVar.zzi());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 5:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, zzx & 1048575, zzbfkVar.zzj());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 6:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zze(obj, zzx & 1048575, zzbfkVar.zzk());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 7:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zzi(obj, zzx & 1048575, zzbfkVar.zzl());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 8:
                                        obj3 = obj4;
                                        zzw(obj, zzx, zzbfkVar);
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 9:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbex zzbexVar = (com.google.android.libraries.places.internal.zzbex) zzq(obj, i3);
                                        zzbfkVar.zzq(zzbexVar, zzn(i3), zzbdbVar);
                                        zzr(obj, i3, zzbexVar);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 10:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, zzbfkVar.zzs());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 11:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zze(obj, zzx & 1048575, zzbfkVar.zzt());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 12:
                                        obj3 = obj4;
                                        int zzu = zzbfkVar.zzu();
                                        com.google.android.libraries.places.internal.zzbdw zzp = zzp(i3);
                                        if (zzp != null && !zzp.zza(zzu)) {
                                            obj4 = com.google.android.libraries.places.internal.zzbfn.zzG(obj, zzb2, zzu, obj3, zzbfyVar);
                                            r12 = 0;
                                        }
                                        com.google.android.libraries.places.internal.zzbgf.zze(obj, zzx & 1048575, zzu);
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                        break;
                                    case 13:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zze(obj, zzx & 1048575, zzbfkVar.zzv());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 14:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, zzx & 1048575, zzbfkVar.zzw());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 15:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zze(obj, zzx & 1048575, zzbfkVar.zzx());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 16:
                                        obj3 = obj4;
                                        com.google.android.libraries.places.internal.zzbgf.zzg(obj, zzx & 1048575, zzbfkVar.zzy());
                                        zzL(obj, i3);
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 17:
                                        com.google.android.libraries.places.internal.zzbex zzbexVar2 = (com.google.android.libraries.places.internal.zzbex) zzq(obj, i3);
                                        zzbfkVar.zzr(zzbexVar2, zzn(i3), zzbdbVar);
                                        zzr(obj, i3, zzbexVar2);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 18:
                                        zzbfkVar.zzz(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 19:
                                        zzbfkVar.zzA(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 20:
                                        zzbfkVar.zzC(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 21:
                                        zzbfkVar.zzB(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 22:
                                        zzbfkVar.zzD(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 23:
                                        zzbfkVar.zzE(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 24:
                                        zzbfkVar.zzF(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 25:
                                        zzbfkVar.zzG(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 26:
                                        if (zzA(zzx)) {
                                            ((com.google.android.libraries.places.internal.zzbcp) zzbfkVar).zzH(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575), true);
                                        } else {
                                            ((com.google.android.libraries.places.internal.zzbcp) zzbfkVar).zzH(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575), false);
                                        }
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 27:
                                        zzbfkVar.zzI(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575), zzn(i3), zzbdbVar);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 28:
                                        zzbfkVar.zzK(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 29:
                                        zzbfkVar.zzL(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 30:
                                        java.util.List zza2 = com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575);
                                        zzbfkVar.zzM(zza2);
                                        obj4 = com.google.android.libraries.places.internal.zzbfn.zzF(obj, zzb2, zza2, zzp(i3), obj4, zzbfyVar);
                                    case 31:
                                        zzbfkVar.zzN(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 32:
                                        zzbfkVar.zzO(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 33:
                                        zzbfkVar.zzP(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 34:
                                        zzbfkVar.zzQ(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 35:
                                        zzbfkVar.zzz(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 36:
                                        zzbfkVar.zzA(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 37:
                                        zzbfkVar.zzC(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 38:
                                        zzbfkVar.zzB(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 39:
                                        zzbfkVar.zzD(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 40:
                                        zzbfkVar.zzE(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 41:
                                        zzbfkVar.zzF(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 42:
                                        zzbfkVar.zzG(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 43:
                                        zzbfkVar.zzL(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 44:
                                        java.util.List zza3 = com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575);
                                        zzbfkVar.zzM(zza3);
                                        obj4 = com.google.android.libraries.places.internal.zzbfn.zzF(obj, zzb2, zza3, zzp(i3), obj4, zzbfyVar);
                                    case 45:
                                        zzbfkVar.zzN(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 46:
                                        zzbfkVar.zzO(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 47:
                                        zzbfkVar.zzP(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 48:
                                        zzbfkVar.zzQ(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575));
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 49:
                                        zzbfkVar.zzJ(com.google.android.libraries.places.internal.zzbek.zza(obj, zzx & 1048575), zzn(i3), zzbdbVar);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 50:
                                        java.lang.Object zzo2 = zzo(i3);
                                        long zzx2 = zzx(i3) & 1048575;
                                        java.lang.Object zzn = com.google.android.libraries.places.internal.zzbgf.zzn(obj, zzx2);
                                        if (zzn == null) {
                                            zzn = com.google.android.libraries.places.internal.zzber.zza().zzc();
                                            com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx2, zzn);
                                        } else if (!((com.google.android.libraries.places.internal.zzber) zzn).zze()) {
                                            java.lang.Object zzc = com.google.android.libraries.places.internal.zzber.zza().zzc();
                                            com.google.android.libraries.places.internal.zzbes.zza(zzc, zzn);
                                            com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx2, zzc);
                                            zzn = zzc;
                                        }
                                        throw r12;
                                        break;
                                    case 51:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Double.valueOf(zzbfkVar.zze()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 52:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Float.valueOf(zzbfkVar.zzf()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 53:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Long.valueOf(zzbfkVar.zzh()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 54:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Long.valueOf(zzbfkVar.zzg()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 55:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Integer.valueOf(zzbfkVar.zzi()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 56:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Long.valueOf(zzbfkVar.zzj()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 57:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Integer.valueOf(zzbfkVar.zzk()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 58:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Boolean.valueOf(zzbfkVar.zzl()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 59:
                                        zzw(obj, zzx, zzbfkVar);
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 60:
                                        com.google.android.libraries.places.internal.zzbex zzbexVar3 = (com.google.android.libraries.places.internal.zzbex) zzs(obj, zzb2, i3);
                                        zzbfkVar.zzq(zzbexVar3, zzn(i3), zzbdbVar);
                                        zzt(obj, zzb2, i3, zzbexVar3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 61:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, zzbfkVar.zzs());
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 62:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Integer.valueOf(zzbfkVar.zzt()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 63:
                                        int zzu2 = zzbfkVar.zzu();
                                        com.google.android.libraries.places.internal.zzbdw zzp2 = zzp(i3);
                                        if (zzp2 != null && !zzp2.zza(zzu2)) {
                                            obj4 = com.google.android.libraries.places.internal.zzbfn.zzG(obj, zzb2, zzu2, obj4, zzbfyVar);
                                        }
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Integer.valueOf(zzu2));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                        break;
                                    case 64:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Integer.valueOf(zzbfkVar.zzv()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 65:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Long.valueOf(zzbfkVar.zzw()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 66:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Integer.valueOf(zzbfkVar.zzx()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 67:
                                        com.google.android.libraries.places.internal.zzbgf.zzo(obj, zzx & 1048575, java.lang.Long.valueOf(zzbfkVar.zzy()));
                                        zzN(obj, zzb2, i3);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    case 68:
                                        com.google.android.libraries.places.internal.zzbex zzbexVar4 = (com.google.android.libraries.places.internal.zzbex) zzs(obj, zzb2, i3);
                                        zzbfkVar.zzr(zzbexVar4, zzn(i3), zzbdbVar);
                                        zzt(obj, zzb2, i3, zzbexVar4);
                                        obj3 = obj4;
                                        obj4 = obj3;
                                        r12 = 0;
                                    default:
                                        obj2 = obj4;
                                        if (obj2 == null) {
                                            try {
                                                obj4 = zzbfyVar.zzh(obj);
                                            } catch (com.google.android.libraries.places.internal.zzbec unused2) {
                                                obj4 = obj2;
                                                if (obj4 == null) {
                                                }
                                                if (!zzbfyVar.zzk(obj4, zzbfkVar, 0)) {
                                                }
                                                r12 = 0;
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                obj4 = obj2;
                                                while (i < this.zzl) {
                                                }
                                                if (obj4 != null) {
                                                }
                                                throw th;
                                            }
                                        } else {
                                            obj4 = obj2;
                                        }
                                        try {
                                            if (!zzbfyVar.zzk(obj4, zzbfkVar, 0)) {
                                                for (int i8 = this.zzk; i8 < this.zzl; i8++) {
                                                    zzu(obj, this.zzj[i8], obj4, zzbfyVar, obj);
                                                }
                                            }
                                        } catch (com.google.android.libraries.places.internal.zzbec unused3) {
                                            if (obj4 == null) {
                                                obj4 = zzbfyVar.zzh(obj);
                                            }
                                            if (!zzbfyVar.zzk(obj4, zzbfkVar, 0)) {
                                                for (int i9 = this.zzk; i9 < this.zzl; i9++) {
                                                    zzu(obj, this.zzj[i9], obj4, zzbfyVar, obj);
                                                }
                                                if (obj4 == null) {
                                                }
                                            }
                                            r12 = 0;
                                        }
                                        r12 = 0;
                                        break;
                                }
                            } else if (zzb2 == Integer.MAX_VALUE) {
                                for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                                    zzu(obj, this.zzj[i10], obj4, zzbfyVar, obj);
                                }
                            } else {
                                com.google.android.libraries.places.internal.zzbdp zzb3 = !this.zzh ? r12 : zzbdbVar.zzb(this.zzg, zzb2);
                                if (zzb3 != null) {
                                    if (zzbdgVar == null) {
                                        zzbdgVar = zzbdcVar.zza(obj);
                                    }
                                    com.google.android.libraries.places.internal.zzbdp zzbdpVar = zzb3;
                                    com.google.android.libraries.places.internal.zzbdo zzbdoVar = zzb3.zzb;
                                    com.google.android.libraries.places.internal.zzbgj zzbgjVar = com.google.android.libraries.places.internal.zzbgj.ENUM;
                                    com.google.android.libraries.places.internal.zzbgj zzbgjVar2 = zzbdoVar.zzb;
                                    if (zzbgjVar2 == zzbgjVar) {
                                        zzbfkVar.zzi();
                                        throw r12;
                                    }
                                    switch (zzbgjVar2) {
                                        case DOUBLE:
                                            zzo = java.lang.Double.valueOf(zzbfkVar.zze());
                                            ordinal = zzbgjVar2.ordinal();
                                            if ((ordinal != 9 || ordinal == 10) && (zze = zzbdgVar.zze(zzbdoVar)) != null) {
                                                zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            }
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case FLOAT:
                                            zzo = java.lang.Float.valueOf(zzbfkVar.zzf());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                                break;
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case INT64:
                                            zzo = java.lang.Long.valueOf(zzbfkVar.zzh());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case UINT64:
                                            zzo = java.lang.Long.valueOf(zzbfkVar.zzg());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case INT32:
                                            zzo = java.lang.Integer.valueOf(zzbfkVar.zzi());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case FIXED64:
                                            zzo = java.lang.Long.valueOf(zzbfkVar.zzj());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case FIXED32:
                                            zzo = java.lang.Integer.valueOf(zzbfkVar.zzk());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case BOOL:
                                            zzo = java.lang.Boolean.valueOf(zzbfkVar.zzl());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case STRING:
                                            zzo = zzbfkVar.zzm();
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case GROUP:
                                            java.lang.Object zze2 = zzbdgVar.zze(zzbdoVar);
                                            if (zze2 instanceof com.google.android.libraries.places.internal.zzbdq) {
                                                com.google.android.libraries.places.internal.zzbfl zzb4 = com.google.android.libraries.places.internal.zzbfh.zza().zzb(zze2.getClass());
                                                if (!((com.google.android.libraries.places.internal.zzbdq) zze2).zzbp()) {
                                                    java.lang.Object zza4 = zzb4.zza();
                                                    zzb4.zzd(zza4, zze2);
                                                    zzbdgVar.zzf(zzbdoVar, zza4);
                                                    zze2 = zza4;
                                                }
                                                zzbfkVar.zzr(zze2, zzb4, zzbdbVar);
                                                break;
                                            } else {
                                                zzo = zzbfkVar.zzp(zzb3.zza.getClass(), zzbdbVar);
                                                ordinal = zzbgjVar2.ordinal();
                                                if (ordinal != 9) {
                                                }
                                                zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                                zzbdgVar.zzf(zzbdoVar, zzo);
                                                break;
                                            }
                                            break;
                                        case MESSAGE:
                                            java.lang.Object zze3 = zzbdgVar.zze(zzbdoVar);
                                            if (zze3 instanceof com.google.android.libraries.places.internal.zzbdq) {
                                                com.google.android.libraries.places.internal.zzbfl zzb5 = com.google.android.libraries.places.internal.zzbfh.zza().zzb(zze3.getClass());
                                                if (!((com.google.android.libraries.places.internal.zzbdq) zze3).zzbp()) {
                                                    java.lang.Object zza5 = zzb5.zza();
                                                    zzb5.zzd(zza5, zze3);
                                                    zzbdgVar.zzf(zzbdoVar, zza5);
                                                    zze3 = zza5;
                                                }
                                                zzbfkVar.zzq(zze3, zzb5, zzbdbVar);
                                                break;
                                            } else {
                                                zzo = zzbfkVar.zzo(zzb3.zza.getClass(), zzbdbVar);
                                                ordinal = zzbgjVar2.ordinal();
                                                if (ordinal != 9) {
                                                }
                                                zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                                zzbdgVar.zzf(zzbdoVar, zzo);
                                                break;
                                            }
                                            break;
                                        case BYTES:
                                            zzo = zzbfkVar.zzs();
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case UINT32:
                                            zzo = java.lang.Integer.valueOf(zzbfkVar.zzt());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case ENUM:
                                            throw new java.lang.IllegalStateException("Shouldn't reach here.");
                                        case SFIXED32:
                                            zzo = java.lang.Integer.valueOf(zzbfkVar.zzv());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case SFIXED64:
                                            zzo = java.lang.Long.valueOf(zzbfkVar.zzw());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case SINT32:
                                            zzo = java.lang.Integer.valueOf(zzbfkVar.zzx());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        case SINT64:
                                            zzo = java.lang.Long.valueOf(zzbfkVar.zzy());
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                        default:
                                            zzo = r12;
                                            ordinal = zzbgjVar2.ordinal();
                                            if (ordinal != 9) {
                                            }
                                            zzo = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ().zzw((com.google.android.libraries.places.internal.zzbex) zzo).zzF();
                                            zzbdgVar.zzf(zzbdoVar, zzo);
                                            break;
                                    }
                                } else {
                                    if (obj4 == null) {
                                        obj4 = zzbfyVar.zzh(obj);
                                    }
                                    try {
                                        if (!zzbfyVar.zzk(obj4, zzbfkVar, 0)) {
                                            for (int i11 = this.zzk; i11 < this.zzl; i11++) {
                                                zzu(obj, this.zzj[i11], obj4, zzbfyVar, obj);
                                            }
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        for (i = this.zzk; i < this.zzl; i++) {
                                            zzu(obj, this.zzj[i], obj4, zzbfyVar, obj);
                                        }
                                        if (obj4 != null) {
                                            zzbfyVar.zzi(obj, obj4);
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            if (zzb2 < i7) {
                                length = i6 - 1;
                            } else {
                                i5 = i6 + 1;
                            }
                            i4 = 1;
                        }
                    }
                }
                i2 = -1;
                i3 = i2;
                if (i3 < 0) {
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                obj2 = obj4;
            }
        }
        if (obj4 == null) {
            zzbfyVar.zzi(obj, obj4);
        }
    }

    private zzbfa(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.libraries.places.internal.zzbex zzbexVar, boolean z, int[] iArr2, int i3, int i4, com.google.android.libraries.places.internal.zzbfd zzbfdVar, com.google.android.libraries.places.internal.zzbek zzbekVar, com.google.android.libraries.places.internal.zzbfy zzbfyVar, com.google.android.libraries.places.internal.zzbdc zzbdcVar, com.google.android.libraries.places.internal.zzbes zzbesVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzbexVar instanceof com.google.android.libraries.places.internal.zzbdq;
        boolean z2 = false;
        if (zzbdcVar != null && (zzbexVar instanceof com.google.android.libraries.places.internal.zzbdn)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzbfyVar;
        this.zzn = zzbdcVar;
        this.zzg = zzbexVar;
    }
}
