package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzga<T> implements com.google.android.gms.internal.auth.zzgi<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.gms.internal.auth.zzhj.zzg();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final int zze;
    private final int zzf;
    private final com.google.android.gms.internal.auth.zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final com.google.android.gms.internal.auth.zzfl zzk;
    private final com.google.android.gms.internal.auth.zzgz zzl;
    private final com.google.android.gms.internal.auth.zzem zzm;
    private final com.google.android.gms.internal.auth.zzgc zzn;
    private final com.google.android.gms.internal.auth.zzfs zzo;

    private zzga(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.auth.zzfx zzfxVar, int i3, boolean z, int[] iArr2, int i4, int i5, com.google.android.gms.internal.auth.zzgc zzgcVar, com.google.android.gms.internal.auth.zzfl zzflVar, com.google.android.gms.internal.auth.zzgz zzgzVar, com.google.android.gms.internal.auth.zzem zzemVar, com.google.android.gms.internal.auth.zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzh = iArr2;
        this.zzi = i4;
        this.zzj = i5;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.auth.zzhj.zzn(obj, zzl(i2) & 1048575, i);
    }

    private final void zzB(java.lang.Object obj, int i, java.lang.Object obj2) {
        zzb.putObject(obj, zzo(i) & 1048575, obj2);
        zzz(obj, i);
    }

    private final void zzC(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        zzb.putObject(obj, zzo(i2) & 1048575, obj2);
        zzA(obj, i, i2);
    }

    private final boolean zzD(java.lang.Object obj, java.lang.Object obj2, int i) {
        return zzE(obj, i) == zzE(obj2, i);
    }

    private final boolean zzE(java.lang.Object obj, int i) {
        int zzl = zzl(i);
        long j = zzl & 1048575;
        if (j != 1048575) {
            return (com.google.android.gms.internal.auth.zzhj.zzc(obj, j) & (1 << (zzl >>> 20))) != 0;
        }
        int zzo = zzo(i);
        long j2 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.auth.zzhj.zza(obj, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.auth.zzhj.zzb(obj, j2)) != 0;
            case 2:
                return com.google.android.gms.internal.auth.zzhj.zzd(obj, j2) != 0;
            case 3:
                return com.google.android.gms.internal.auth.zzhj.zzd(obj, j2) != 0;
            case 4:
                return com.google.android.gms.internal.auth.zzhj.zzc(obj, j2) != 0;
            case 5:
                return com.google.android.gms.internal.auth.zzhj.zzd(obj, j2) != 0;
            case 6:
                return com.google.android.gms.internal.auth.zzhj.zzc(obj, j2) != 0;
            case 7:
                return com.google.android.gms.internal.auth.zzhj.zzt(obj, j2);
            case 8:
                java.lang.Object zzf = com.google.android.gms.internal.auth.zzhj.zzf(obj, j2);
                if (zzf instanceof java.lang.String) {
                    return !((java.lang.String) zzf).isEmpty();
                }
                if (zzf instanceof com.google.android.gms.internal.auth.zzef) {
                    return !com.google.android.gms.internal.auth.zzef.zzb.equals(zzf);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.auth.zzhj.zzf(obj, j2) != null;
            case 10:
                return !com.google.android.gms.internal.auth.zzef.zzb.equals(com.google.android.gms.internal.auth.zzhj.zzf(obj, j2));
            case 11:
                return com.google.android.gms.internal.auth.zzhj.zzc(obj, j2) != 0;
            case 12:
                return com.google.android.gms.internal.auth.zzhj.zzc(obj, j2) != 0;
            case 13:
                return com.google.android.gms.internal.auth.zzhj.zzc(obj, j2) != 0;
            case 14:
                return com.google.android.gms.internal.auth.zzhj.zzd(obj, j2) != 0;
            case 15:
                return com.google.android.gms.internal.auth.zzhj.zzc(obj, j2) != 0;
            case 16:
                return com.google.android.gms.internal.auth.zzhj.zzd(obj, j2) != 0;
            case 17:
                return com.google.android.gms.internal.auth.zzhj.zzf(obj, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final boolean zzF(java.lang.Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzE(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzG(java.lang.Object obj, int i, com.google.android.gms.internal.auth.zzgi zzgiVar) {
        return zzgiVar.zzi(com.google.android.gms.internal.auth.zzhj.zzf(obj, i & 1048575));
    }

    private static boolean zzH(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzev) {
            return ((com.google.android.gms.internal.auth.zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(java.lang.Object obj, int i, int i2) {
        return com.google.android.gms.internal.auth.zzhj.zzc(obj, (long) (zzl(i2) & 1048575)) == i;
    }

    static com.google.android.gms.internal.auth.zzha zzc(java.lang.Object obj) {
        com.google.android.gms.internal.auth.zzev zzevVar = (com.google.android.gms.internal.auth.zzev) obj;
        com.google.android.gms.internal.auth.zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != com.google.android.gms.internal.auth.zzha.zza()) {
            return zzhaVar;
        }
        com.google.android.gms.internal.auth.zzha zzd = com.google.android.gms.internal.auth.zzha.zzd();
        zzevVar.zzc = zzd;
        return zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.gms.internal.auth.zzga zzj(java.lang.Class cls, com.google.android.gms.internal.auth.zzfu zzfuVar, com.google.android.gms.internal.auth.zzgc zzgcVar, com.google.android.gms.internal.auth.zzfl zzflVar, com.google.android.gms.internal.auth.zzgz zzgzVar, com.google.android.gms.internal.auth.zzem zzemVar, com.google.android.gms.internal.auth.zzfs zzfsVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
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
        int i19;
        int i20;
        java.lang.String str;
        int i21;
        int i22;
        int i23;
        int i24;
        java.lang.reflect.Field zzv;
        char charAt11;
        int i25;
        int i26;
        java.lang.Object obj;
        java.lang.reflect.Field zzv2;
        java.lang.Object obj2;
        java.lang.reflect.Field zzv3;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        int i29;
        char charAt14;
        int i30;
        char charAt15;
        if (!(zzfuVar instanceof com.google.android.gms.internal.auth.zzgh)) {
            throw null;
        }
        com.google.android.gms.internal.auth.zzgh zzghVar = (com.google.android.gms.internal.auth.zzgh) zzfuVar;
        java.lang.String zzd = zzghVar.zzd();
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
            iArr = zza;
            i5 = 0;
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
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
            i2 = charAt17 + charAt17 + charAt18;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i3 = charAt19;
            i4 = charAt22;
            i5 = charAt17;
            i6 = charAt20;
            i32 = i56;
        }
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object[] zze = zzghVar.zze();
        java.lang.Class<?> cls2 = zzghVar.zza().getClass();
        int i59 = i4 + charAt2;
        int i60 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[i60];
        int i61 = i4;
        int i62 = i59;
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
                iArr[i63] = i64;
                i63++;
            }
            int i73 = charAt24 & 255;
            if (i73 >= 51) {
                int i74 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                i17 = length;
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i75 = charAt25 & 8191;
                    int i76 = 13;
                    while (true) {
                        i27 = i74 + 1;
                        charAt12 = zzd.charAt(i74);
                        if (charAt12 < c2) {
                            break;
                        }
                        i75 |= (charAt12 & 8191) << i76;
                        i76 += 13;
                        i74 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i75 | (charAt12 << i76);
                    i74 = i27;
                }
                int i77 = i73 - 51;
                int i78 = i74;
                if (i77 == 9 || i77 == 17) {
                    int i79 = i64 / 3;
                    i26 = i2 + 1;
                    objArr[i79 + i79 + 1] = zze[i2];
                } else {
                    if (i77 == 12 && (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0)) {
                        int i80 = i64 / 3;
                        i26 = i2 + 1;
                        objArr[i80 + i80 + 1] = zze[i2];
                    }
                    int i81 = charAt25 + charAt25;
                    obj = zze[i81];
                    if (obj instanceof java.lang.reflect.Field) {
                        zzv2 = zzv(cls2, (java.lang.String) obj);
                        zze[i81] = zzv2;
                    } else {
                        zzv2 = (java.lang.reflect.Field) obj;
                    }
                    int i82 = i3;
                    i18 = i6;
                    i24 = (int) unsafe.objectFieldOffset(zzv2);
                    int i83 = i81 + 1;
                    obj2 = zze[i83];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        zzv3 = zzv(cls2, (java.lang.String) obj2);
                        zze[i83] = zzv3;
                    } else {
                        zzv3 = (java.lang.reflect.Field) obj2;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(zzv3);
                    str = zzd;
                    i19 = i82;
                    i21 = i2;
                    i22 = i78;
                    i20 = objectFieldOffset;
                    i23 = 0;
                }
                i2 = i26;
                int i812 = charAt25 + charAt25;
                obj = zze[i812];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int i822 = i3;
                i18 = i6;
                i24 = (int) unsafe.objectFieldOffset(zzv2);
                int i832 = i812 + 1;
                obj2 = zze[i832];
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzv3);
                str = zzd;
                i19 = i822;
                i21 = i2;
                i22 = i78;
                i20 = objectFieldOffset2;
                i23 = 0;
            } else {
                i17 = length;
                int i84 = i3;
                i18 = i6;
                int i85 = i2 + 1;
                java.lang.reflect.Field zzv4 = zzv(cls2, (java.lang.String) zze[i2]);
                if (i73 == 9 || i73 == 17) {
                    i19 = i84;
                    int i86 = i64 / 3;
                    objArr[i86 + i86 + 1] = zzv4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i19 = i84;
                        int i87 = i64 / 3;
                        i25 = i2 + 2;
                        objArr[i87 + i87 + 1] = zze[i85];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        i19 = i84;
                        if (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0) {
                            int i88 = i64 / 3;
                            i25 = i2 + 2;
                            objArr[i88 + i88 + 1] = zze[i85];
                        }
                    } else {
                        if (i73 == 50) {
                            int i89 = i61 + 1;
                            iArr[i61] = i64;
                            int i90 = i64 / 3;
                            int i91 = i2 + 2;
                            int i92 = i90 + i90;
                            objArr[i92] = zze[i85];
                            if ((charAt24 & 2048) != 0) {
                                i85 = i2 + 3;
                                objArr[i92 + 1] = zze[i91];
                                i19 = i84;
                                i61 = i89;
                            } else {
                                i61 = i89;
                                i85 = i91;
                            }
                        }
                        i19 = i84;
                    }
                    i85 = i25;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(zzv4);
                i20 = 1048575;
                if ((charAt24 & 4096) == 0 || i73 > 17) {
                    str = zzd;
                    i21 = i85;
                    i22 = i16;
                    i23 = 0;
                } else {
                    int i93 = i16 + 1;
                    int charAt26 = zzd.charAt(i16);
                    if (charAt26 >= 55296) {
                        int i94 = charAt26 & 8191;
                        int i95 = 13;
                        while (true) {
                            i22 = i93 + 1;
                            charAt11 = zzd.charAt(i93);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i94 |= (charAt11 & 8191) << i95;
                            i95 += 13;
                            i93 = i22;
                        }
                        charAt26 = i94 | (charAt11 << i95);
                    } else {
                        i22 = i93;
                    }
                    int i96 = i5 + i5 + (charAt26 / 32);
                    java.lang.Object obj3 = zze[i96];
                    str = zzd;
                    if (obj3 instanceof java.lang.reflect.Field) {
                        zzv = (java.lang.reflect.Field) obj3;
                    } else {
                        zzv = zzv(cls2, (java.lang.String) obj3);
                        zze[i96] = zzv;
                    }
                    i21 = i85;
                    i23 = charAt26 % 32;
                    i20 = (int) unsafe.objectFieldOffset(zzv);
                }
                if (i73 >= 18 && i73 <= 49) {
                    iArr[i62] = objectFieldOffset3;
                    i62++;
                }
                i24 = objectFieldOffset3;
            }
            int i97 = i64 + 1;
            iArr2[i64] = charAt23;
            int i98 = i64 + 2;
            iArr2[i97] = i24 | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i73 << 20);
            i64 += 3;
            iArr2[i98] = (i23 << 20) | i20;
            i2 = i21;
            i32 = i22;
            length = i17;
            i3 = i19;
            zzd = str;
            i6 = i18;
            c = 55296;
        }
        return new com.google.android.gms.internal.auth.zzga(iArr2, objArr, i3, i6, zzghVar.zza(), zzghVar.zzc(), false, iArr, i4, i59, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(java.lang.Object obj, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).intValue();
    }

    private final int zzl(int i) {
        return this.zzc[i + 2];
    }

    private final int zzm(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(java.lang.Object obj, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).longValue();
    }

    private final com.google.android.gms.internal.auth.zzey zzq(int i) {
        int i2 = i / 3;
        return (com.google.android.gms.internal.auth.zzey) this.zzd[i2 + i2 + 1];
    }

    private final com.google.android.gms.internal.auth.zzgi zzr(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        com.google.android.gms.internal.auth.zzgi zzgiVar = (com.google.android.gms.internal.auth.zzgi) this.zzd[i3];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        com.google.android.gms.internal.auth.zzgi zzb2 = com.google.android.gms.internal.auth.zzgf.zza().zzb((java.lang.Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final java.lang.Object zzs(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final java.lang.Object zzt(java.lang.Object obj, int i) {
        com.google.android.gms.internal.auth.zzgi zzr = zzr(i);
        int zzo = zzo(i) & 1048575;
        if (!zzE(obj, i)) {
            return zzr.zzd();
        }
        java.lang.Object object = zzb.getObject(obj, zzo);
        if (zzH(object)) {
            return object;
        }
        java.lang.Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private final java.lang.Object zzu(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.auth.zzgi zzr = zzr(i2);
        if (!zzI(obj, i, i2)) {
            return zzr.zzd();
        }
        java.lang.Object object = zzb.getObject(obj, zzo(i2) & 1048575);
        if (zzH(object)) {
            return object;
        }
        java.lang.Object zzd = zzr.zzd();
        if (object != null) {
            zzr.zzf(zzd, object);
        }
        return zzd;
    }

    private static java.lang.reflect.Field zzv(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields));
        }
    }

    private static void zzw(java.lang.Object obj) {
        if (!zzH(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
    }

    private final void zzx(java.lang.Object obj, java.lang.Object obj2, int i) {
        if (zzE(obj2, i)) {
            int zzo = zzo(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = zzo;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.auth.zzgi zzr = zzr(i);
            if (!zzE(obj, i)) {
                if (zzH(object)) {
                    java.lang.Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzz(obj, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                java.lang.Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzy(java.lang.Object obj, java.lang.Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzI(obj2, i2, i)) {
            int zzo = zzo(i) & 1048575;
            sun.misc.Unsafe unsafe = zzb;
            long j = zzo;
            java.lang.Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            com.google.android.gms.internal.auth.zzgi zzr = zzr(i);
            if (!zzI(obj, i2, i)) {
                if (zzH(object)) {
                    java.lang.Object zzd = zzr.zzd();
                    zzr.zzf(zzd, object);
                    unsafe.putObject(obj, j, zzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzA(obj, i2, i);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                java.lang.Object zzd2 = zzr.zzd();
                zzr.zzf(zzd2, object2);
                unsafe.putObject(obj, j, zzd2);
                object2 = zzd2;
            }
            zzr.zzf(object2, object);
        }
    }

    private final void zzz(java.lang.Object obj, int i) {
        int zzl = zzl(i);
        long j = 1048575 & zzl;
        if (j == 1048575) {
            return;
        }
        com.google.android.gms.internal.auth.zzhj.zzn(obj, j, (1 << (zzl >>> 20)) | com.google.android.gms.internal.auth.zzhj.zzc(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(java.lang.Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzo = zzo(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & zzo;
            int i6 = 37;
            switch (zzn(zzo)) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = java.lang.Double.doubleToLongBits(com.google.android.gms.internal.auth.zzhj.zza(obj, j));
                    byte[] bArr = com.google.android.gms.internal.auth.zzfa.zzd;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i3 * 53;
                    floatToIntBits = java.lang.Float.floatToIntBits(com.google.android.gms.internal.auth.zzhj.zzb(obj, j));
                    i3 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr2 = com.google.android.gms.internal.auth.zzfa.zzd;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr3 = com.google.android.gms.internal.auth.zzfa.zzd;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr4 = com.google.android.gms.internal.auth.zzfa.zzd;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzfa.zza(com.google.android.gms.internal.auth.zzhj.zzt(obj, j));
                    i3 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i3 * 53;
                    floatToIntBits = ((java.lang.String) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 9:
                    java.lang.Object zzf = com.google.android.gms.internal.auth.zzhj.zzf(obj, j);
                    if (zzf != null) {
                        i6 = zzf.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr5 = com.google.android.gms.internal.auth.zzfa.zzd;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr6 = com.google.android.gms.internal.auth.zzfa.zzd;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    java.lang.Object zzf2 = com.google.android.gms.internal.auth.zzhj.zzf(obj, j);
                    if (zzf2 != null) {
                        i6 = zzf2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
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
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i3 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 51:
                    if (zzI(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = java.lang.Double.doubleToLongBits(((java.lang.Double) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).doubleValue());
                        byte[] bArr7 = com.google.android.gms.internal.auth.zzfa.zzd;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = java.lang.Float.floatToIntBits(((java.lang.Float) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).floatValue());
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = com.google.android.gms.internal.auth.zzfa.zzd;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = com.google.android.gms.internal.auth.zzfa.zzd;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzk(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = com.google.android.gms.internal.auth.zzfa.zzd;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzk(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = com.google.android.gms.internal.auth.zzfa.zza(((java.lang.Boolean) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).booleanValue());
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = ((java.lang.String) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzk(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzk(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzk(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzI(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = com.google.android.gms.internal.auth.zzfa.zzd;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzk(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = com.google.android.gms.internal.auth.zzfa.zzd;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i3 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0cd6, code lost:
    
        if (r6 == 1048575) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0cd8, code lost:
    
        r13.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0cdc, code lost:
    
        r2 = r0.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ce0, code lost:
    
        if (r2 >= r0.zzj) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0ce2, code lost:
    
        r3 = r0.zzh[r2];
        r5 = r0.zzc[r3];
        r5 = com.google.android.gms.internal.auth.zzhj.zzf(r7, r0.zzo(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0cf7, code lost:
    
        if (r5 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0cfe, code lost:
    
        if (r0.zzq(r3) != null) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d03, code lost:
    
        r5 = (com.google.android.gms.internal.auth.zzfr) r5;
        r1 = (com.google.android.gms.internal.auth.zzfq) r0.zzs(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d0b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0d00, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d0c, code lost:
    
        if (r8 != 0) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d0e, code lost:
    
        if (r1 != r9) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0d15, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d1a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0d16, code lost:
    
        if (r1 > r9) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d18, code lost:
    
        if (r4 != r8) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0d1f, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0990 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x099f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0c7d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0c93 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzb(java.lang.Object obj, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        int i4;
        int i5;
        sun.misc.Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int zzm;
        int i9;
        int i10;
        int i11;
        int i12;
        sun.misc.Unsafe unsafe2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        java.lang.Object obj2;
        com.google.android.gms.internal.auth.zzez zzezVar;
        int i22;
        int i23;
        int i24;
        sun.misc.Unsafe unsafe3;
        int i25;
        int i26;
        sun.misc.Unsafe unsafe4;
        int zzf;
        java.lang.Object obj3;
        int i27;
        int i28;
        int zzj;
        int i29;
        int i30;
        int i31;
        int zzh;
        int i32;
        int i33;
        com.google.android.gms.internal.auth.zzdt zzdtVar2;
        int i34;
        int i35;
        com.google.android.gms.internal.auth.zzdt zzdtVar3;
        int i36;
        com.google.android.gms.internal.auth.zzga<T> zzgaVar = this;
        java.lang.Object obj4 = obj;
        int i37 = i2;
        int i38 = i3;
        com.google.android.gms.internal.auth.zzdt zzdtVar4 = zzdtVar;
        zzw(obj);
        sun.misc.Unsafe unsafe5 = zzb;
        int i39 = 0;
        int i40 = i;
        int i41 = -1;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 1048575;
        while (true) {
            if (i40 < i37) {
                int i46 = i40 + 1;
                int i47 = bArr[i40];
                if (i47 < 0) {
                    i6 = com.google.android.gms.internal.auth.zzdu.zzi(i47, bArr, i46, zzdtVar4);
                    i43 = zzdtVar4.zza;
                } else {
                    i43 = i47;
                    i6 = i46;
                }
                int i48 = i43 >>> 3;
                if (i48 > i41) {
                    zzm = (i48 < zzgaVar.zze || i48 > zzgaVar.zzf) ? -1 : zzgaVar.zzm(i48, i42 / 3);
                } else if (i48 < zzgaVar.zze || i48 > zzgaVar.zzf) {
                    i7 = -1;
                    i8 = -1;
                    if (i8 != i7) {
                        i9 = i6;
                        i10 = i44;
                        i11 = i45;
                        i12 = i48;
                        unsafe2 = unsafe5;
                        i4 = i38;
                        i13 = i37;
                    } else {
                        int i49 = i43 & 7;
                        int[] iArr = zzgaVar.zzc;
                        int i50 = iArr[i8 + 1];
                        int i51 = i43;
                        int zzn = zzn(i50);
                        long j = i50 & 1048575;
                        if (zzn <= 17) {
                            int i52 = iArr[i8 + 2];
                            int i53 = 1 << (i52 >>> 20);
                            int i54 = 1048575;
                            int i55 = i52 & 1048575;
                            if (i55 != i45) {
                                if (i45 != 1048575) {
                                    unsafe5.putInt(obj4, i45, i44);
                                    i54 = 1048575;
                                }
                                i10 = i55 == i54 ? 0 : unsafe5.getInt(obj4, i55);
                                i11 = i55;
                            } else {
                                i10 = i44;
                                i11 = i45;
                            }
                            switch (zzn) {
                                case 0:
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 1) {
                                        i13 = i2;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        com.google.android.gms.internal.auth.zzhj.zzl(obj4, j, java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i6)));
                                        i40 = i6 + 8;
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 1:
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 5) {
                                        i13 = i2;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        com.google.android.gms.internal.auth.zzhj.zzm(obj4, j, java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i6)));
                                        i40 = i6 + 4;
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 2:
                                case 3:
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 0) {
                                        i13 = i2;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        int zzk = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i6, zzdtVar4);
                                        unsafe5.putLong(obj, j, zzdtVar4.zzb);
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i40 = zzk;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 4:
                                case 11:
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 0) {
                                        i13 = i2;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        i40 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                        unsafe5.putInt(obj4, j, zzdtVar4.zza);
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 5:
                                case 14:
                                    i16 = i6;
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 1) {
                                        i13 = i2;
                                        i6 = i16;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        unsafe5.putLong(obj, j, com.google.android.gms.internal.auth.zzdu.zzn(bArr, i16));
                                        i40 = i16 + 8;
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 6:
                                case 13:
                                    i16 = i6;
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 5) {
                                        i13 = i2;
                                        i6 = i16;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        unsafe5.putInt(obj4, j, com.google.android.gms.internal.auth.zzdu.zzb(bArr, i16));
                                        i40 = i16 + 4;
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 7:
                                    i16 = i6;
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 0) {
                                        i13 = i2;
                                        i6 = i16;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        i40 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i16, zzdtVar4);
                                        com.google.android.gms.internal.auth.zzhj.zzk(obj4, j, zzdtVar4.zzb != 0);
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 8:
                                    i16 = i6;
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 2) {
                                        i13 = i2;
                                        i6 = i16;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        if ((i50 & 536870912) != 0) {
                                            i40 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i16, zzdtVar4);
                                            int i56 = zzdtVar4.zza;
                                            if (i56 < 0) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzc();
                                            }
                                            if (i56 == 0) {
                                                zzdtVar4.zzc = "";
                                            } else {
                                                int i57 = com.google.android.gms.internal.auth.zzhn.zza;
                                                int length = bArr.length;
                                                if ((((length - i40) - i56) | i40 | i56) < 0) {
                                                    throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i40), java.lang.Integer.valueOf(i56)));
                                                }
                                                int i58 = i40 + i56;
                                                char[] cArr = new char[i56];
                                                int i59 = 0;
                                                while (i40 < i58) {
                                                    byte b = bArr[i40];
                                                    if (com.google.android.gms.internal.auth.zzhk.zzd(b)) {
                                                        i40++;
                                                        cArr[i59] = (char) b;
                                                        i59++;
                                                    } else {
                                                        while (i40 < i58) {
                                                            int i60 = i40 + 1;
                                                            byte b2 = bArr[i40];
                                                            if (com.google.android.gms.internal.auth.zzhk.zzd(b2)) {
                                                                cArr[i59] = (char) b2;
                                                                i59++;
                                                                i40 = i60;
                                                                while (i40 < i58) {
                                                                    byte b3 = bArr[i40];
                                                                    if (com.google.android.gms.internal.auth.zzhk.zzd(b3)) {
                                                                        i40++;
                                                                        cArr[i59] = (char) b3;
                                                                        i59++;
                                                                    }
                                                                }
                                                            } else if (b2 < -32) {
                                                                if (i60 >= i58) {
                                                                    throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                                }
                                                                i40 += 2;
                                                                com.google.android.gms.internal.auth.zzhk.zzc(b2, bArr[i60], cArr, i59);
                                                                i59++;
                                                            } else if (b2 < -16) {
                                                                if (i60 >= i58 - 1) {
                                                                    throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                                }
                                                                int i61 = i40 + 2;
                                                                i40 += 3;
                                                                com.google.android.gms.internal.auth.zzhk.zzb(b2, bArr[i60], bArr[i61], cArr, i59);
                                                                i59++;
                                                            } else {
                                                                if (i60 >= i58 - 2) {
                                                                    throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                                }
                                                                byte b4 = bArr[i60];
                                                                int i62 = i40 + 3;
                                                                byte b5 = bArr[i40 + 2];
                                                                i40 += 4;
                                                                com.google.android.gms.internal.auth.zzhk.zza(b2, b4, b5, bArr[i62], cArr, i59);
                                                                i59 += 2;
                                                            }
                                                        }
                                                        zzdtVar4.zzc = new java.lang.String(cArr, 0, i59);
                                                        i40 = i58;
                                                    }
                                                }
                                                while (i40 < i58) {
                                                }
                                                zzdtVar4.zzc = new java.lang.String(cArr, 0, i59);
                                                i40 = i58;
                                            }
                                        } else {
                                            i40 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i16, zzdtVar4);
                                            int i63 = zzdtVar4.zza;
                                            if (i63 < 0) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzc();
                                            }
                                            if (i63 == 0) {
                                                zzdtVar4.zzc = "";
                                            } else {
                                                zzdtVar4.zzc = new java.lang.String(bArr, i40, i63, com.google.android.gms.internal.auth.zzfa.zzb);
                                                i40 += i63;
                                            }
                                        }
                                        unsafe5.putObject(obj4, j, zzdtVar4.zzc);
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                    break;
                                case 9:
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 2) {
                                        i13 = i2;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        java.lang.Object zzt = zzgaVar.zzt(obj4, i14);
                                        i40 = com.google.android.gms.internal.auth.zzdu.zzm(zzt, zzgaVar.zzr(i14), bArr, i6, i2, zzdtVar);
                                        zzgaVar.zzB(obj4, i14, zzt);
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 10:
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 2) {
                                        i13 = i2;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        i40 = com.google.android.gms.internal.auth.zzdu.zza(bArr, i6, zzdtVar4);
                                        unsafe5.putObject(obj4, j, zzdtVar4.zzc);
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 12:
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 0) {
                                        i13 = i2;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        i40 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                        int i64 = zzdtVar4.zza;
                                        com.google.android.gms.internal.auth.zzey zzq = zzgaVar.zzq(i14);
                                        if ((i50 & Integer.MIN_VALUE) == 0 || zzq == null || zzq.zza()) {
                                            unsafe5.putInt(obj4, j, i64);
                                            i44 = i10 | i53;
                                            i37 = i2;
                                            i38 = i3;
                                            i43 = i15;
                                            i42 = i14;
                                            i41 = i48;
                                            i45 = i11;
                                            i39 = 0;
                                        } else {
                                            zzc(obj).zzh(i15, java.lang.Long.valueOf(i64));
                                            i37 = i2;
                                            i38 = i3;
                                            i43 = i15;
                                            i42 = i14;
                                            i41 = i48;
                                            i44 = i10;
                                            i45 = i11;
                                            i39 = 0;
                                        }
                                    }
                                case 15:
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 0) {
                                        i13 = i2;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        i40 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                        unsafe5.putInt(obj4, j, com.google.android.gms.internal.auth.zzej.zzb(zzdtVar4.zza));
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                case 16:
                                    if (i49 != 0) {
                                        i13 = i2;
                                        i17 = i51;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        int zzk2 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i6, zzdtVar4);
                                        i14 = i8;
                                        i15 = i51;
                                        unsafe5.putLong(obj, j, com.google.android.gms.internal.auth.zzej.zzc(zzdtVar4.zzb));
                                        i44 = i10 | i53;
                                        i37 = i2;
                                        i38 = i3;
                                        i40 = zzk2;
                                        i43 = i15;
                                        i42 = i14;
                                        i41 = i48;
                                        i45 = i11;
                                        i39 = 0;
                                    }
                                default:
                                    i14 = i8;
                                    i15 = i51;
                                    if (i49 != 3) {
                                        i13 = i2;
                                        i17 = i15;
                                        i8 = i14;
                                        i4 = i3;
                                        i39 = i8;
                                        unsafe2 = unsafe5;
                                        i9 = i6;
                                        i12 = i48;
                                        i43 = i17;
                                        break;
                                    } else {
                                        java.lang.Object zzt2 = zzgaVar.zzt(obj4, i14);
                                        i42 = i14;
                                        int zzl = com.google.android.gms.internal.auth.zzdu.zzl(zzt2, zzgaVar.zzr(i14), bArr, i6, i2, (i48 << 3) | 4, zzdtVar);
                                        zzgaVar.zzB(obj4, i42, zzt2);
                                        i38 = i3;
                                        zzdtVar4 = zzdtVar4;
                                        unsafe5 = unsafe5;
                                        i37 = i2;
                                        i40 = zzl;
                                        i45 = i11;
                                        i39 = 0;
                                        i44 = i10 | i53;
                                        i41 = i48;
                                        i43 = i15;
                                    }
                            }
                        } else {
                            int i65 = i8;
                            i11 = i45;
                            int i66 = i51;
                            i13 = i2;
                            int i67 = i44;
                            if (zzn != 27) {
                                if (zzn > 49) {
                                    unsafe2 = unsafe5;
                                    i10 = i67;
                                    i20 = i6;
                                    i21 = i65;
                                    i18 = i48;
                                    if (zzn != 50) {
                                        sun.misc.Unsafe unsafe6 = zzb;
                                        long j2 = iArr[i21 + 2] & 1048575;
                                        switch (zzn) {
                                            case 51:
                                                i17 = i66;
                                                i33 = i20;
                                                zzdtVar2 = zzdtVar4;
                                                i34 = i21;
                                                i12 = i18;
                                                obj4 = obj;
                                                i13 = i2;
                                                if (i49 == 1) {
                                                    unsafe6.putObject(obj4, j, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i33))));
                                                    i35 = i33 + 8;
                                                    unsafe6.putInt(obj4, j2, i12);
                                                    if (i35 != i33) {
                                                        i4 = i3;
                                                        i9 = i35;
                                                        i39 = i34;
                                                        i43 = i17;
                                                        break;
                                                    } else {
                                                        i38 = i3;
                                                        zzdtVar4 = zzdtVar2;
                                                        i37 = i13;
                                                        i42 = i34;
                                                        i43 = i17;
                                                        i44 = i10;
                                                        unsafe5 = unsafe2;
                                                        i45 = i11;
                                                        i39 = 0;
                                                        int i68 = i35;
                                                        i41 = i12;
                                                        i40 = i68;
                                                        break;
                                                    }
                                                }
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                            case 52:
                                                i17 = i66;
                                                i33 = i20;
                                                zzdtVar2 = zzdtVar4;
                                                i34 = i21;
                                                i12 = i18;
                                                obj4 = obj;
                                                i13 = i2;
                                                if (i49 == 5) {
                                                    unsafe6.putObject(obj4, j, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i33))));
                                                    i35 = i33 + 4;
                                                    unsafe6.putInt(obj4, j2, i12);
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i17 = i66;
                                                i33 = i20;
                                                zzdtVar2 = zzdtVar4;
                                                i34 = i21;
                                                i12 = i18;
                                                obj4 = obj;
                                                i13 = i2;
                                                if (i49 == 0) {
                                                    i35 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i33, zzdtVar2);
                                                    unsafe6.putObject(obj4, j, java.lang.Long.valueOf(zzdtVar2.zzb));
                                                    unsafe6.putInt(obj4, j2, i12);
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i17 = i66;
                                                i33 = i20;
                                                zzdtVar2 = zzdtVar4;
                                                i34 = i21;
                                                i12 = i18;
                                                obj4 = obj;
                                                i13 = i2;
                                                if (i49 == 0) {
                                                    i35 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i33, zzdtVar2);
                                                    unsafe6.putObject(obj4, j, java.lang.Integer.valueOf(zzdtVar2.zza));
                                                    unsafe6.putInt(obj4, j2, i12);
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i17 = i66;
                                                i33 = i20;
                                                zzdtVar2 = zzdtVar4;
                                                i34 = i21;
                                                i12 = i18;
                                                obj4 = obj;
                                                i13 = i2;
                                                if (i49 == 1) {
                                                    unsafe6.putObject(obj4, j, java.lang.Long.valueOf(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i33)));
                                                    i35 = i33 + 8;
                                                    unsafe6.putInt(obj4, j2, i12);
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i17 = i66;
                                                i33 = i20;
                                                zzdtVar2 = zzdtVar4;
                                                i34 = i21;
                                                i12 = i18;
                                                obj4 = obj;
                                                i13 = i2;
                                                if (i49 == 5) {
                                                    unsafe6.putObject(obj4, j, java.lang.Integer.valueOf(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i33)));
                                                    i35 = i33 + 4;
                                                    unsafe6.putInt(obj4, j2, i12);
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 58:
                                                i17 = i66;
                                                zzdtVar2 = zzdtVar4;
                                                i34 = i21;
                                                i12 = i18;
                                                obj4 = obj;
                                                i13 = i2;
                                                if (i49 == 0) {
                                                    i35 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i20, zzdtVar2);
                                                    i33 = i20;
                                                    unsafe6.putObject(obj4, j, java.lang.Boolean.valueOf(zzdtVar2.zzb != 0));
                                                    unsafe6.putInt(obj4, j2, i12);
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i33 = i20;
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 59:
                                                obj4 = obj;
                                                i13 = i2;
                                                i34 = i21;
                                                i12 = i18;
                                                zzdtVar2 = zzdtVar4;
                                                if (i49 == 2) {
                                                    i35 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i20, zzdtVar2);
                                                    int i69 = zzdtVar2.zza;
                                                    if (i69 == 0) {
                                                        unsafe6.putObject(obj4, j, "");
                                                    } else {
                                                        if ((i50 & 536870912) != 0 && !com.google.android.gms.internal.auth.zzhn.zzc(bArr, i35, i35 + i69)) {
                                                            throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                        }
                                                        unsafe6.putObject(obj4, j, new java.lang.String(bArr, i35, i69, com.google.android.gms.internal.auth.zzfa.zzb));
                                                        i35 += i69;
                                                    }
                                                    unsafe6.putInt(obj4, j2, i12);
                                                    i17 = i66;
                                                    unsafe2 = unsafe2;
                                                    i33 = i20;
                                                    if (i35 != i33) {
                                                    }
                                                } else {
                                                    i17 = i66;
                                                    unsafe2 = unsafe2;
                                                    i33 = i20;
                                                    i35 = i33;
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                break;
                                            case 60:
                                                obj4 = obj;
                                                if (i49 == 2) {
                                                    java.lang.Object zzu = zzgaVar.zzu(obj4, i18, i21);
                                                    int zzm2 = com.google.android.gms.internal.auth.zzdu.zzm(zzu, zzgaVar.zzr(i21), bArr, i20, i2, zzdtVar);
                                                    zzgaVar.zzC(obj4, i18, i21, zzu);
                                                    zzdtVar2 = zzdtVar;
                                                    i35 = zzm2;
                                                    i34 = i21;
                                                    i12 = i18;
                                                    i33 = i20;
                                                    i17 = i66;
                                                    i13 = i2;
                                                    if (i35 != i33) {
                                                    }
                                                } else {
                                                    i34 = i21;
                                                    i12 = i18;
                                                    i17 = i66;
                                                    i33 = i20;
                                                    i13 = i2;
                                                    zzdtVar2 = zzdtVar;
                                                    i35 = i33;
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                zzdtVar3 = zzdtVar4;
                                                obj4 = obj;
                                                i36 = i20;
                                                if (i49 == 2) {
                                                    i35 = com.google.android.gms.internal.auth.zzdu.zza(bArr, i36, zzdtVar3);
                                                    unsafe6.putObject(obj4, j, zzdtVar3.zzc);
                                                    unsafe6.putInt(obj4, j2, i18);
                                                    i34 = i21;
                                                    i12 = i18;
                                                    i17 = i66;
                                                    i33 = i36;
                                                    i13 = i2;
                                                    zzdtVar2 = zzdtVar3;
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i34 = i21;
                                                i12 = i18;
                                                i17 = i66;
                                                i33 = i36;
                                                i13 = i2;
                                                zzdtVar2 = zzdtVar3;
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 63:
                                                zzdtVar3 = zzdtVar4;
                                                obj4 = obj;
                                                i36 = i20;
                                                if (i49 == 0) {
                                                    i35 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i36, zzdtVar3);
                                                    int i70 = zzdtVar3.zza;
                                                    com.google.android.gms.internal.auth.zzey zzq2 = zzgaVar.zzq(i21);
                                                    if (zzq2 == null || zzq2.zza()) {
                                                        unsafe6.putObject(obj4, j, java.lang.Integer.valueOf(i70));
                                                        unsafe6.putInt(obj4, j2, i18);
                                                    } else {
                                                        zzc(obj).zzh(i66, java.lang.Long.valueOf(i70));
                                                    }
                                                    i34 = i21;
                                                    i12 = i18;
                                                    i17 = i66;
                                                    i33 = i36;
                                                    i13 = i2;
                                                    zzdtVar2 = zzdtVar3;
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i34 = i21;
                                                i12 = i18;
                                                i17 = i66;
                                                i33 = i36;
                                                i13 = i2;
                                                zzdtVar2 = zzdtVar3;
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 66:
                                                zzdtVar3 = zzdtVar4;
                                                obj4 = obj;
                                                i36 = i20;
                                                if (i49 == 0) {
                                                    i35 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i36, zzdtVar3);
                                                    unsafe6.putObject(obj4, j, java.lang.Integer.valueOf(com.google.android.gms.internal.auth.zzej.zzb(zzdtVar3.zza)));
                                                    unsafe6.putInt(obj4, j2, i18);
                                                    i34 = i21;
                                                    i12 = i18;
                                                    i17 = i66;
                                                    i33 = i36;
                                                    i13 = i2;
                                                    zzdtVar2 = zzdtVar3;
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i34 = i21;
                                                i12 = i18;
                                                i17 = i66;
                                                i33 = i36;
                                                i13 = i2;
                                                zzdtVar2 = zzdtVar3;
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 67:
                                                zzdtVar3 = zzdtVar4;
                                                obj4 = obj;
                                                i36 = i20;
                                                if (i49 == 0) {
                                                    i35 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i36, zzdtVar3);
                                                    unsafe6.putObject(obj4, j, java.lang.Long.valueOf(com.google.android.gms.internal.auth.zzej.zzc(zzdtVar3.zzb)));
                                                    unsafe6.putInt(obj4, j2, i18);
                                                    i34 = i21;
                                                    i12 = i18;
                                                    i17 = i66;
                                                    i33 = i36;
                                                    i13 = i2;
                                                    zzdtVar2 = zzdtVar3;
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                i34 = i21;
                                                i12 = i18;
                                                i17 = i66;
                                                i33 = i36;
                                                i13 = i2;
                                                zzdtVar2 = zzdtVar3;
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                            case 68:
                                                if (i49 == 3) {
                                                    obj4 = obj;
                                                    java.lang.Object zzu2 = zzgaVar.zzu(obj4, i18, i21);
                                                    int zzl2 = com.google.android.gms.internal.auth.zzdu.zzl(zzu2, zzgaVar.zzr(i21), bArr, i20, i2, (i66 & (-8)) | 4, zzdtVar);
                                                    zzgaVar.zzC(obj4, i18, i21, zzu2);
                                                    i34 = i21;
                                                    i12 = i18;
                                                    i17 = i66;
                                                    i35 = zzl2;
                                                    zzdtVar2 = zzdtVar4;
                                                    i33 = i20;
                                                    i13 = i2;
                                                    if (i35 != i33) {
                                                    }
                                                }
                                                break;
                                            default:
                                                obj4 = obj;
                                                i13 = i2;
                                                i34 = i21;
                                                i12 = i18;
                                                i17 = i66;
                                                i33 = i20;
                                                zzdtVar2 = zzdtVar4;
                                                i35 = i33;
                                                if (i35 != i33) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i49 == 2) {
                                            sun.misc.Unsafe unsafe7 = zzb;
                                            java.lang.Object zzs = zzgaVar.zzs(i21);
                                            java.lang.Object object = unsafe7.getObject(obj, j);
                                            if (!((com.google.android.gms.internal.auth.zzfr) object).zze()) {
                                                com.google.android.gms.internal.auth.zzfr zzb2 = com.google.android.gms.internal.auth.zzfr.zza().zzb();
                                                com.google.android.gms.internal.auth.zzfs.zza(zzb2, object);
                                                unsafe7.putObject(obj, j, zzb2);
                                            }
                                            throw null;
                                        }
                                        i19 = i66;
                                        obj4 = obj;
                                    }
                                } else {
                                    long j3 = i50;
                                    sun.misc.Unsafe unsafe8 = zzb;
                                    sun.misc.Unsafe unsafe9 = unsafe5;
                                    com.google.android.gms.internal.auth.zzez zzezVar2 = (com.google.android.gms.internal.auth.zzez) unsafe8.getObject(obj4, j);
                                    if (zzezVar2.zzc()) {
                                        obj2 = "";
                                        zzezVar = zzezVar2;
                                    } else {
                                        int size = zzezVar2.size();
                                        if (size == 0) {
                                            obj2 = "";
                                            i32 = 10;
                                        } else {
                                            obj2 = "";
                                            i32 = size + size;
                                        }
                                        com.google.android.gms.internal.auth.zzez zzd = zzezVar2.zzd(i32);
                                        unsafe8.putObject(obj4, j, zzd);
                                        zzezVar = zzd;
                                    }
                                    switch (zzn) {
                                        case 18:
                                        case 35:
                                            i22 = i6;
                                            i37 = i13;
                                            i23 = i48;
                                            i39 = i65;
                                            i24 = i66;
                                            i10 = i67;
                                            unsafe3 = unsafe9;
                                            if (i49 == 2) {
                                                com.google.android.gms.internal.auth.zzek zzekVar = (com.google.android.gms.internal.auth.zzek) zzezVar;
                                                i40 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i22, zzdtVar4);
                                                int i71 = zzdtVar4.zza + i40;
                                                while (i40 < i71) {
                                                    zzekVar.zze(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i40)));
                                                    i40 += 8;
                                                }
                                                if (i40 != i71) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                }
                                            } else {
                                                if (i49 == 1) {
                                                    com.google.android.gms.internal.auth.zzek zzekVar2 = (com.google.android.gms.internal.auth.zzek) zzezVar;
                                                    zzekVar2.zze(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i22)));
                                                    i40 = i22 + 8;
                                                    while (i40 < i37) {
                                                        int zzh2 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i40, zzdtVar4);
                                                        if (i24 == zzdtVar4.zza) {
                                                            zzekVar2.zze(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, zzh2)));
                                                            i40 = zzh2 + 8;
                                                        }
                                                    }
                                                }
                                                i40 = i22;
                                            }
                                            if (i40 == i22) {
                                                i9 = i40;
                                                i43 = i24;
                                                unsafe2 = unsafe3;
                                                i12 = i23;
                                                i13 = i37;
                                                obj4 = obj;
                                                i4 = i3;
                                                break;
                                            } else {
                                                i38 = i3;
                                                i43 = i24;
                                                unsafe5 = unsafe3;
                                                i41 = i23;
                                                i42 = i39;
                                                i44 = i10;
                                                i45 = i11;
                                                i39 = 0;
                                                obj4 = obj;
                                                break;
                                            }
                                        case 19:
                                        case 36:
                                            i22 = i6;
                                            i37 = i13;
                                            i23 = i48;
                                            i39 = i65;
                                            i24 = i66;
                                            i10 = i67;
                                            unsafe3 = unsafe9;
                                            if (i49 == 2) {
                                                com.google.android.gms.internal.auth.zzer zzerVar = (com.google.android.gms.internal.auth.zzer) zzezVar;
                                                i40 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i22, zzdtVar4);
                                                int i72 = zzdtVar4.zza + i40;
                                                while (i40 < i72) {
                                                    zzerVar.zze(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i40)));
                                                    i40 += 4;
                                                }
                                                if (i40 != i72) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                }
                                            } else {
                                                if (i49 == 5) {
                                                    com.google.android.gms.internal.auth.zzer zzerVar2 = (com.google.android.gms.internal.auth.zzer) zzezVar;
                                                    zzerVar2.zze(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i22)));
                                                    i40 = i22 + 4;
                                                    while (i40 < i37) {
                                                        int zzh3 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i40, zzdtVar4);
                                                        if (i24 == zzdtVar4.zza) {
                                                            zzerVar2.zze(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, zzh3)));
                                                            i40 = zzh3 + 4;
                                                        }
                                                    }
                                                }
                                                i40 = i22;
                                            }
                                            if (i40 == i22) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i22 = i6;
                                            i37 = i13;
                                            i23 = i48;
                                            i39 = i65;
                                            i24 = i66;
                                            i10 = i67;
                                            unsafe3 = unsafe9;
                                            if (i49 == 2) {
                                                com.google.android.gms.internal.auth.zzfm zzfmVar = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                                i40 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i22, zzdtVar4);
                                                int i73 = zzdtVar4.zza + i40;
                                                while (i40 < i73) {
                                                    i40 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i40, zzdtVar4);
                                                    zzfmVar.zze(zzdtVar4.zzb);
                                                }
                                                if (i40 != i73) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                }
                                            } else {
                                                if (i49 == 0) {
                                                    com.google.android.gms.internal.auth.zzfm zzfmVar2 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                                    i40 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i22, zzdtVar4);
                                                    zzfmVar2.zze(zzdtVar4.zzb);
                                                    while (i40 < i37) {
                                                        int zzh4 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i40, zzdtVar4);
                                                        if (i24 == zzdtVar4.zza) {
                                                            i40 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzh4, zzdtVar4);
                                                            zzfmVar2.zze(zzdtVar4.zzb);
                                                        }
                                                    }
                                                }
                                                i40 = i22;
                                            }
                                            if (i40 == i22) {
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i25 = i48;
                                            i26 = i65;
                                            i24 = i66;
                                            i10 = i67;
                                            unsafe4 = unsafe9;
                                            if (i49 == 2) {
                                                zzf = com.google.android.gms.internal.auth.zzdu.zzf(bArr, i6, zzezVar, zzdtVar4);
                                                i22 = i6;
                                                i40 = zzf;
                                                unsafe3 = unsafe4;
                                                i23 = i25;
                                                i39 = i26;
                                                i37 = i13;
                                                if (i40 == i22) {
                                                }
                                            } else {
                                                if (i49 == 0) {
                                                    i22 = i6;
                                                    unsafe3 = unsafe4;
                                                    i23 = i25;
                                                    i39 = i26;
                                                    i37 = i13;
                                                    i40 = com.google.android.gms.internal.auth.zzdu.zzj(i24, bArr, i22, i2, zzezVar, zzdtVar);
                                                    if (i40 == i22) {
                                                    }
                                                }
                                                i22 = i6;
                                                unsafe3 = unsafe4;
                                                i23 = i25;
                                                i39 = i26;
                                                i37 = i13;
                                                i40 = i22;
                                                if (i40 == i22) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i25 = i48;
                                            i26 = i65;
                                            i24 = i66;
                                            i10 = i67;
                                            unsafe4 = unsafe9;
                                            if (i49 == 2) {
                                                com.google.android.gms.internal.auth.zzfm zzfmVar3 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                                zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                                int i74 = zzdtVar4.zza + zzf;
                                                while (zzf < i74) {
                                                    zzfmVar3.zze(com.google.android.gms.internal.auth.zzdu.zzn(bArr, zzf));
                                                    zzf += 8;
                                                }
                                                if (zzf != i74) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                }
                                            } else {
                                                if (i49 == 1) {
                                                    com.google.android.gms.internal.auth.zzfm zzfmVar4 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                                    zzfmVar4.zze(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i6));
                                                    zzf = i6 + 8;
                                                    while (zzf < i13) {
                                                        int zzh5 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzf, zzdtVar4);
                                                        if (i24 == zzdtVar4.zza) {
                                                            zzfmVar4.zze(com.google.android.gms.internal.auth.zzdu.zzn(bArr, zzh5));
                                                            zzf = zzh5 + 8;
                                                        }
                                                    }
                                                }
                                                i22 = i6;
                                                unsafe3 = unsafe4;
                                                i23 = i25;
                                                i39 = i26;
                                                i37 = i13;
                                                i40 = i22;
                                                if (i40 == i22) {
                                                }
                                            }
                                            i22 = i6;
                                            i40 = zzf;
                                            unsafe3 = unsafe4;
                                            i23 = i25;
                                            i39 = i26;
                                            i37 = i13;
                                            if (i40 == i22) {
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i25 = i48;
                                            i26 = i65;
                                            i24 = i66;
                                            i10 = i67;
                                            unsafe4 = unsafe9;
                                            if (i49 == 2) {
                                                com.google.android.gms.internal.auth.zzew zzewVar = (com.google.android.gms.internal.auth.zzew) zzezVar;
                                                zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                                int i75 = zzdtVar4.zza + zzf;
                                                while (zzf < i75) {
                                                    zzewVar.zze(com.google.android.gms.internal.auth.zzdu.zzb(bArr, zzf));
                                                    zzf += 4;
                                                }
                                                if (zzf != i75) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                }
                                            } else {
                                                if (i49 == 5) {
                                                    com.google.android.gms.internal.auth.zzew zzewVar2 = (com.google.android.gms.internal.auth.zzew) zzezVar;
                                                    zzewVar2.zze(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i6));
                                                    zzf = i6 + 4;
                                                    while (zzf < i13) {
                                                        int zzh6 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzf, zzdtVar4);
                                                        if (i24 == zzdtVar4.zza) {
                                                            zzewVar2.zze(com.google.android.gms.internal.auth.zzdu.zzb(bArr, zzh6));
                                                            zzf = zzh6 + 4;
                                                        }
                                                    }
                                                }
                                                i22 = i6;
                                                unsafe3 = unsafe4;
                                                i23 = i25;
                                                i39 = i26;
                                                i37 = i13;
                                                i40 = i22;
                                                if (i40 == i22) {
                                                }
                                            }
                                            i22 = i6;
                                            i40 = zzf;
                                            unsafe3 = unsafe4;
                                            i23 = i25;
                                            i39 = i26;
                                            i37 = i13;
                                            if (i40 == i22) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i25 = i48;
                                            i26 = i65;
                                            i24 = i66;
                                            i10 = i67;
                                            unsafe4 = unsafe9;
                                            if (i49 == 2) {
                                                com.google.android.gms.internal.auth.zzdv zzdvVar = (com.google.android.gms.internal.auth.zzdv) zzezVar;
                                                zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                                int i76 = zzdtVar4.zza + zzf;
                                                while (zzf < i76) {
                                                    zzf = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzf, zzdtVar4);
                                                    zzdvVar.zze(zzdtVar4.zzb != 0);
                                                }
                                                if (zzf != i76) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                }
                                            } else {
                                                if (i49 == 0) {
                                                    com.google.android.gms.internal.auth.zzdv zzdvVar2 = (com.google.android.gms.internal.auth.zzdv) zzezVar;
                                                    zzf = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i6, zzdtVar4);
                                                    zzdvVar2.zze(zzdtVar4.zzb != 0);
                                                    while (zzf < i13) {
                                                        int zzh7 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzf, zzdtVar4);
                                                        if (i24 == zzdtVar4.zza) {
                                                            zzf = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzh7, zzdtVar4);
                                                            zzdvVar2.zze(zzdtVar4.zzb != 0);
                                                        }
                                                    }
                                                }
                                                i22 = i6;
                                                unsafe3 = unsafe4;
                                                i23 = i25;
                                                i39 = i26;
                                                i37 = i13;
                                                i40 = i22;
                                                if (i40 == i22) {
                                                }
                                            }
                                            i22 = i6;
                                            i40 = zzf;
                                            unsafe3 = unsafe4;
                                            i23 = i25;
                                            i39 = i26;
                                            i37 = i13;
                                            if (i40 == i22) {
                                            }
                                            break;
                                        case 26:
                                            i25 = i48;
                                            i26 = i65;
                                            i24 = i66;
                                            i10 = i67;
                                            unsafe4 = unsafe9;
                                            if (i49 == 2) {
                                                if ((j3 & 536870912) == 0) {
                                                    zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                                    int i77 = zzdtVar4.zza;
                                                    if (i77 < 0) {
                                                        throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                    }
                                                    if (i77 == 0) {
                                                        obj3 = obj2;
                                                        zzezVar.add(obj3);
                                                    } else {
                                                        obj3 = obj2;
                                                        zzezVar.add(new java.lang.String(bArr, zzf, i77, com.google.android.gms.internal.auth.zzfa.zzb));
                                                        zzf += i77;
                                                    }
                                                    while (zzf < i13) {
                                                        int zzh8 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzf, zzdtVar4);
                                                        if (i24 == zzdtVar4.zza) {
                                                            zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh8, zzdtVar4);
                                                            int i78 = zzdtVar4.zza;
                                                            if (i78 < 0) {
                                                                throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                            }
                                                            if (i78 == 0) {
                                                                zzezVar.add(obj3);
                                                            } else {
                                                                zzezVar.add(new java.lang.String(bArr, zzf, i78, com.google.android.gms.internal.auth.zzfa.zzb));
                                                                zzf += i78;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    java.lang.Object obj5 = obj2;
                                                    zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                                    int i79 = zzdtVar4.zza;
                                                    if (i79 < 0) {
                                                        throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                    }
                                                    if (i79 == 0) {
                                                        zzezVar.add(obj5);
                                                    } else {
                                                        int i80 = zzf + i79;
                                                        if (!com.google.android.gms.internal.auth.zzhn.zzc(bArr, zzf, i80)) {
                                                            throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                        }
                                                        zzezVar.add(new java.lang.String(bArr, zzf, i79, com.google.android.gms.internal.auth.zzfa.zzb));
                                                        zzf = i80;
                                                    }
                                                    while (zzf < i13) {
                                                        int zzh9 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzf, zzdtVar4);
                                                        if (i24 == zzdtVar4.zza) {
                                                            zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh9, zzdtVar4);
                                                            int i81 = zzdtVar4.zza;
                                                            if (i81 < 0) {
                                                                throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                            }
                                                            if (i81 == 0) {
                                                                zzezVar.add(obj5);
                                                            } else {
                                                                int i82 = zzf + i81;
                                                                if (!com.google.android.gms.internal.auth.zzhn.zzc(bArr, zzf, i82)) {
                                                                    throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                                }
                                                                zzezVar.add(new java.lang.String(bArr, zzf, i81, com.google.android.gms.internal.auth.zzfa.zzb));
                                                                zzf = i82;
                                                            }
                                                        }
                                                    }
                                                }
                                                i22 = i6;
                                                i40 = zzf;
                                                unsafe3 = unsafe4;
                                                i23 = i25;
                                                i39 = i26;
                                                i37 = i13;
                                                if (i40 == i22) {
                                                }
                                            }
                                            i22 = i6;
                                            unsafe3 = unsafe4;
                                            i23 = i25;
                                            i39 = i26;
                                            i37 = i13;
                                            i40 = i22;
                                            if (i40 == i22) {
                                            }
                                            break;
                                        case 27:
                                            i22 = i6;
                                            i10 = i67;
                                            if (i49 == 2) {
                                                zzgaVar = this;
                                                i24 = i66;
                                                zzdtVar4 = zzdtVar4;
                                                i23 = i48;
                                                i39 = i65;
                                                i37 = i13;
                                                i40 = com.google.android.gms.internal.auth.zzdu.zze(zzgaVar.zzr(i65), i66, bArr, i22, i2, zzezVar, zzdtVar);
                                                unsafe3 = unsafe9;
                                                if (i40 == i22) {
                                                }
                                            } else {
                                                zzgaVar = this;
                                                i24 = i66;
                                                i37 = i13;
                                                i23 = i48;
                                                i39 = i65;
                                                unsafe3 = unsafe9;
                                                i40 = i22;
                                                if (i40 == i22) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            i22 = i6;
                                            i27 = i13;
                                            i10 = i67;
                                            if (i49 == 2) {
                                                int zzh10 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i22, zzdtVar4);
                                                int i83 = zzdtVar4.zza;
                                                if (i83 < 0) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                }
                                                if (i83 > bArr.length - zzh10) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                }
                                                if (i83 == 0) {
                                                    zzezVar.add(com.google.android.gms.internal.auth.zzef.zzb);
                                                } else {
                                                    zzezVar.add(com.google.android.gms.internal.auth.zzef.zzk(bArr, zzh10, i83));
                                                    zzh10 += i83;
                                                }
                                                while (zzh10 < i27) {
                                                    int zzh11 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh10, zzdtVar4);
                                                    if (i66 == zzdtVar4.zza) {
                                                        zzh10 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh11, zzdtVar4);
                                                        int i84 = zzdtVar4.zza;
                                                        if (i84 < 0) {
                                                            throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                        }
                                                        if (i84 > bArr.length - zzh10) {
                                                            throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                        }
                                                        if (i84 == 0) {
                                                            zzezVar.add(com.google.android.gms.internal.auth.zzef.zzb);
                                                        } else {
                                                            zzezVar.add(com.google.android.gms.internal.auth.zzef.zzk(bArr, zzh10, i84));
                                                            zzh10 += i84;
                                                        }
                                                    } else {
                                                        i40 = zzh10;
                                                        i23 = i48;
                                                        i24 = i66;
                                                        i39 = i65;
                                                        zzgaVar = this;
                                                        i37 = i27;
                                                        unsafe3 = unsafe9;
                                                        if (i40 == i22) {
                                                        }
                                                    }
                                                }
                                                i40 = zzh10;
                                                i23 = i48;
                                                i24 = i66;
                                                i39 = i65;
                                                zzgaVar = this;
                                                i37 = i27;
                                                unsafe3 = unsafe9;
                                                if (i40 == i22) {
                                                }
                                            } else {
                                                zzgaVar = this;
                                                i23 = i48;
                                                i24 = i66;
                                                i39 = i65;
                                                i37 = i27;
                                                unsafe3 = unsafe9;
                                                i40 = i22;
                                                if (i40 == i22) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            if (i49 == 2) {
                                                zzj = com.google.android.gms.internal.auth.zzdu.zzf(bArr, i6, zzezVar, zzdtVar4);
                                                i22 = i6;
                                                i27 = i13;
                                                i28 = i65;
                                                i10 = i67;
                                            } else if (i49 == 0) {
                                                i22 = i6;
                                                i28 = i65;
                                                i10 = i67;
                                                i27 = i13;
                                                zzj = com.google.android.gms.internal.auth.zzdu.zzj(i66, bArr, i22, i2, zzezVar, zzdtVar);
                                            } else {
                                                i10 = i67;
                                                zzgaVar = this;
                                                i22 = i6;
                                                i23 = i48;
                                                i24 = i66;
                                                i39 = i65;
                                                unsafe3 = unsafe9;
                                                i37 = i13;
                                                i40 = i22;
                                                if (i40 == i22) {
                                                }
                                            }
                                            com.google.android.gms.internal.auth.zzey zzq3 = zzgaVar.zzq(i28);
                                            com.google.android.gms.internal.auth.zzgz zzgzVar = zzgaVar.zzl;
                                            int i85 = com.google.android.gms.internal.auth.zzgk.zza;
                                            if (zzq3 == null) {
                                                i29 = zzj;
                                                i30 = i28;
                                            } else if (zzezVar instanceof java.util.RandomAccess) {
                                                int size2 = zzezVar.size();
                                                i29 = zzj;
                                                java.lang.Object obj6 = null;
                                                int i86 = 0;
                                                int i87 = 0;
                                                while (i86 < size2) {
                                                    java.lang.Integer num = (java.lang.Integer) zzezVar.get(i86);
                                                    int i88 = i28;
                                                    int intValue = num.intValue();
                                                    if (zzq3.zza()) {
                                                        if (i86 != i87) {
                                                            zzezVar.set(i87, num);
                                                        }
                                                        i87++;
                                                    } else {
                                                        obj6 = com.google.android.gms.internal.auth.zzgk.zzc(obj4, i48, intValue, obj6, zzgzVar);
                                                    }
                                                    i86++;
                                                    i28 = i88;
                                                }
                                                i30 = i28;
                                                if (i87 != size2) {
                                                    zzezVar.subList(i87, size2).clear();
                                                }
                                            } else {
                                                i29 = zzj;
                                                i30 = i28;
                                                java.util.Iterator it = zzezVar.iterator();
                                                java.lang.Object obj7 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((java.lang.Integer) it.next()).intValue();
                                                    if (!zzq3.zza()) {
                                                        obj7 = com.google.android.gms.internal.auth.zzgk.zzc(obj4, i48, intValue2, obj7, zzgzVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            zzgaVar = this;
                                            i40 = i29;
                                            i23 = i48;
                                            i24 = i66;
                                            i39 = i30;
                                            i37 = i27;
                                            unsafe3 = unsafe9;
                                            if (i40 == i22) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i31 = i66;
                                            if (i49 == 2) {
                                                com.google.android.gms.internal.auth.zzew zzewVar3 = (com.google.android.gms.internal.auth.zzew) zzezVar;
                                                zzh = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                                int i89 = zzdtVar4.zza + zzh;
                                                while (zzh < i89) {
                                                    zzh = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh, zzdtVar4);
                                                    zzewVar3.zze(com.google.android.gms.internal.auth.zzej.zzb(zzdtVar4.zza));
                                                }
                                                if (zzh != i89) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                }
                                            } else if (i49 == 0) {
                                                com.google.android.gms.internal.auth.zzew zzewVar4 = (com.google.android.gms.internal.auth.zzew) zzezVar;
                                                zzh = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                                zzewVar4.zze(com.google.android.gms.internal.auth.zzej.zzb(zzdtVar4.zza));
                                                while (zzh < i13) {
                                                    int zzh12 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh, zzdtVar4);
                                                    if (i31 == zzdtVar4.zza) {
                                                        zzh = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh12, zzdtVar4);
                                                        zzewVar4.zze(com.google.android.gms.internal.auth.zzej.zzb(zzdtVar4.zza));
                                                    }
                                                }
                                            } else {
                                                i22 = i6;
                                                i23 = i48;
                                                i24 = i31;
                                                i39 = i65;
                                                i10 = i67;
                                                unsafe3 = unsafe9;
                                                i37 = i13;
                                                i40 = i22;
                                                if (i40 == i22) {
                                                }
                                            }
                                            i22 = i6;
                                            i40 = zzh;
                                            i23 = i48;
                                            i24 = i31;
                                            i39 = i65;
                                            i10 = i67;
                                            unsafe3 = unsafe9;
                                            i37 = i13;
                                            if (i40 == i22) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            if (i49 == 2) {
                                                com.google.android.gms.internal.auth.zzfm zzfmVar5 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                                int zzh13 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i6, zzdtVar4);
                                                int i90 = zzdtVar4.zza + zzh13;
                                                while (zzh13 < i90) {
                                                    zzh13 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzh13, zzdtVar4);
                                                    zzfmVar5.zze(com.google.android.gms.internal.auth.zzej.zzc(zzdtVar4.zzb));
                                                }
                                                if (zzh13 != i90) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                }
                                                i22 = i6;
                                                i40 = zzh13;
                                                i37 = i13;
                                                i23 = i48;
                                                i39 = i65;
                                                i24 = i66;
                                                i10 = i67;
                                                unsafe3 = unsafe9;
                                                if (i40 == i22) {
                                                }
                                            } else if (i49 == 0) {
                                                com.google.android.gms.internal.auth.zzfm zzfmVar6 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                                zzh = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i6, zzdtVar4);
                                                zzfmVar6.zze(com.google.android.gms.internal.auth.zzej.zzc(zzdtVar4.zzb));
                                                while (true) {
                                                    if (zzh < i13) {
                                                        int zzh14 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh, zzdtVar4);
                                                        i31 = i66;
                                                        if (i31 == zzdtVar4.zza) {
                                                            zzh = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzh14, zzdtVar4);
                                                            zzfmVar6.zze(com.google.android.gms.internal.auth.zzej.zzc(zzdtVar4.zzb));
                                                            i66 = i31;
                                                        }
                                                    } else {
                                                        i31 = i66;
                                                    }
                                                }
                                                i22 = i6;
                                                i40 = zzh;
                                                i23 = i48;
                                                i24 = i31;
                                                i39 = i65;
                                                i10 = i67;
                                                unsafe3 = unsafe9;
                                                i37 = i13;
                                                if (i40 == i22) {
                                                }
                                            } else {
                                                i22 = i6;
                                                i37 = i13;
                                                i23 = i48;
                                                i39 = i65;
                                                i24 = i66;
                                                i10 = i67;
                                                unsafe3 = unsafe9;
                                                i40 = i22;
                                                if (i40 == i22) {
                                                }
                                            }
                                            break;
                                        default:
                                            i22 = i6;
                                            i37 = i13;
                                            i23 = i48;
                                            i39 = i65;
                                            i24 = i66;
                                            i10 = i67;
                                            unsafe3 = unsafe9;
                                            if (i49 == 3) {
                                                com.google.android.gms.internal.auth.zzgi zzr = zzgaVar.zzr(i39);
                                                int i91 = (i24 & (-8)) | 4;
                                                i40 = com.google.android.gms.internal.auth.zzdu.zzc(zzr, bArr, i22, i2, i91, zzdtVar);
                                                zzezVar.add(zzdtVar4.zzc);
                                                while (i40 < i37) {
                                                    int zzh15 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i40, zzdtVar4);
                                                    if (i24 == zzdtVar4.zza) {
                                                        i40 = com.google.android.gms.internal.auth.zzdu.zzc(zzr, bArr, zzh15, i2, i91, zzdtVar);
                                                        zzezVar.add(zzdtVar4.zzc);
                                                    } else if (i40 == i22) {
                                                    }
                                                }
                                                if (i40 == i22) {
                                                }
                                            }
                                            i40 = i22;
                                            if (i40 == i22) {
                                            }
                                            break;
                                    }
                                }
                            } else if (i49 == 2) {
                                com.google.android.gms.internal.auth.zzez zzezVar3 = (com.google.android.gms.internal.auth.zzez) unsafe5.getObject(obj4, j);
                                if (!zzezVar3.zzc()) {
                                    int size3 = zzezVar3.size();
                                    zzezVar3 = zzezVar3.zzd(size3 == 0 ? 10 : size3 + size3);
                                    unsafe5.putObject(obj4, j, zzezVar3);
                                }
                                com.google.android.gms.internal.auth.zzez zzezVar4 = zzezVar3;
                                i41 = i48;
                                i40 = com.google.android.gms.internal.auth.zzdu.zze(zzgaVar.zzr(i65), i66, bArr, i6, i2, zzezVar4, zzdtVar);
                                i38 = i3;
                                unsafe5 = unsafe5;
                                zzdtVar4 = zzdtVar4;
                                i42 = i65;
                                i37 = i13;
                                i43 = i66;
                                i44 = i67;
                                i45 = i11;
                                i39 = 0;
                            } else {
                                i18 = i48;
                                unsafe2 = unsafe5;
                                i19 = i66;
                                i10 = i67;
                                i20 = i6;
                                i21 = i65;
                            }
                            i4 = i3;
                            i39 = i21;
                            i12 = i18;
                            i43 = i19;
                            i9 = i20;
                        }
                    }
                    if (i43 == i4 || i4 == 0) {
                        int i92 = i12;
                        i40 = com.google.android.gms.internal.auth.zzdu.zzg(i43, bArr, i9, i2, zzc(obj), zzdtVar);
                        i37 = i13;
                        i42 = i39;
                        i41 = i92;
                        i43 = i43;
                        unsafe5 = unsafe2;
                        i44 = i10;
                        i45 = i11;
                        i39 = 0;
                        zzdtVar4 = zzdtVar;
                        i38 = i4;
                    } else {
                        i40 = i9;
                        i5 = i13;
                        i44 = i10;
                        unsafe = unsafe2;
                        i45 = i11;
                    }
                } else {
                    zzm = zzgaVar.zzm(i48, i39);
                }
                i8 = zzm;
                i7 = -1;
                if (i8 != i7) {
                }
                if (i43 == i4) {
                }
                int i922 = i12;
                i40 = com.google.android.gms.internal.auth.zzdu.zzg(i43, bArr, i9, i2, zzc(obj), zzdtVar);
                i37 = i13;
                i42 = i39;
                i41 = i922;
                i43 = i43;
                unsafe5 = unsafe2;
                i44 = i10;
                i45 = i11;
                i39 = 0;
                zzdtVar4 = zzdtVar;
                i38 = i4;
            } else {
                i4 = i38;
                i5 = i37;
                unsafe = unsafe5;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final java.lang.Object zzd() {
        return ((com.google.android.gms.internal.auth.zzev) this.zzg).zzc();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(java.lang.Object obj) {
        if (zzH(obj)) {
            if (obj instanceof com.google.android.gms.internal.auth.zzev) {
                com.google.android.gms.internal.auth.zzev zzevVar = (com.google.android.gms.internal.auth.zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
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
                                this.zzk.zza(obj, j);
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = zzb;
                                java.lang.Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((com.google.android.gms.internal.auth.zzfr) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzI(obj, this.zzc[i], i)) {
                        zzr(i).zze(zzb.getObject(obj, j));
                    }
                }
                if (zzE(obj, i)) {
                    zzr(i).zze(zzb.getObject(obj, j));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(java.lang.Object obj, java.lang.Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            int i2 = this.zzc[i];
            long j = 1048575 & zzo;
            switch (zzn(zzo)) {
                case 0:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzl(obj, j, com.google.android.gms.internal.auth.zzhj.zza(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzm(obj, j, com.google.android.gms.internal.auth.zzhj.zzb(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzo(obj, j, com.google.android.gms.internal.auth.zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzo(obj, j, com.google.android.gms.internal.auth.zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzn(obj, j, com.google.android.gms.internal.auth.zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzo(obj, j, com.google.android.gms.internal.auth.zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzn(obj, j, com.google.android.gms.internal.auth.zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzk(obj, j, com.google.android.gms.internal.auth.zzhj.zzt(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzp(obj, j, com.google.android.gms.internal.auth.zzhj.zzf(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzx(obj, obj2, i);
                    break;
                case 10:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzp(obj, j, com.google.android.gms.internal.auth.zzhj.zzf(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzn(obj, j, com.google.android.gms.internal.auth.zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzn(obj, j, com.google.android.gms.internal.auth.zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzn(obj, j, com.google.android.gms.internal.auth.zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzo(obj, j, com.google.android.gms.internal.auth.zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzn(obj, j, com.google.android.gms.internal.auth.zzhj.zzc(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzE(obj2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzo(obj, j, com.google.android.gms.internal.auth.zzhj.zzd(obj2, j));
                        zzz(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzx(obj, obj2, i);
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
                    this.zzk.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = com.google.android.gms.internal.auth.zzgk.zza;
                    com.google.android.gms.internal.auth.zzhj.zzp(obj, j, com.google.android.gms.internal.auth.zzfs.zza(com.google.android.gms.internal.auth.zzhj.zzf(obj, j), com.google.android.gms.internal.auth.zzhj.zzf(obj2, j)));
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
                    if (zzI(obj2, i2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzp(obj, j, com.google.android.gms.internal.auth.zzhj.zzf(obj2, j));
                        zzA(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzy(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i2, i)) {
                        com.google.android.gms.internal.auth.zzhj.zzp(obj, j, com.google.android.gms.internal.auth.zzhj.zzf(obj2, j));
                        zzA(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzy(obj, obj2, i);
                    break;
            }
        }
        com.google.android.gms.internal.auth.zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        zzb(obj, bArr, i, i2, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(java.lang.Object obj, java.lang.Object obj2) {
        boolean zzf;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzD(obj, obj2, i) && java.lang.Double.doubleToLongBits(com.google.android.gms.internal.auth.zzhj.zza(obj, j)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.auth.zzhj.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzD(obj, obj2, i) && java.lang.Float.floatToIntBits(com.google.android.gms.internal.auth.zzhj.zzb(obj, j)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.auth.zzhj.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzd(obj, j) == com.google.android.gms.internal.auth.zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzd(obj, j) == com.google.android.gms.internal.auth.zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzc(obj, j) == com.google.android.gms.internal.auth.zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzd(obj, j) == com.google.android.gms.internal.auth.zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzc(obj, j) == com.google.android.gms.internal.auth.zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzt(obj, j) == com.google.android.gms.internal.auth.zzhj.zzt(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzgk.zzf(com.google.android.gms.internal.auth.zzhj.zzf(obj, j), com.google.android.gms.internal.auth.zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzgk.zzf(com.google.android.gms.internal.auth.zzhj.zzf(obj, j), com.google.android.gms.internal.auth.zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzgk.zzf(com.google.android.gms.internal.auth.zzhj.zzf(obj, j), com.google.android.gms.internal.auth.zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzc(obj, j) == com.google.android.gms.internal.auth.zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzc(obj, j) == com.google.android.gms.internal.auth.zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzc(obj, j) == com.google.android.gms.internal.auth.zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzd(obj, j) == com.google.android.gms.internal.auth.zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzc(obj, j) == com.google.android.gms.internal.auth.zzhj.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzhj.zzd(obj, j) == com.google.android.gms.internal.auth.zzhj.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzD(obj, obj2, i) && com.google.android.gms.internal.auth.zzgk.zzf(com.google.android.gms.internal.auth.zzhj.zzf(obj, j), com.google.android.gms.internal.auth.zzhj.zzf(obj2, j))) {
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
                    zzf = com.google.android.gms.internal.auth.zzgk.zzf(com.google.android.gms.internal.auth.zzhj.zzf(obj, j), com.google.android.gms.internal.auth.zzhj.zzf(obj2, j));
                    break;
                case 50:
                    zzf = com.google.android.gms.internal.auth.zzgk.zzf(com.google.android.gms.internal.auth.zzhj.zzf(obj, j), com.google.android.gms.internal.auth.zzhj.zzf(obj2, j));
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
                    long zzl = zzl(i) & 1048575;
                    if (com.google.android.gms.internal.auth.zzhj.zzc(obj, zzl) == com.google.android.gms.internal.auth.zzhj.zzc(obj2, zzl) && com.google.android.gms.internal.auth.zzgk.zzf(com.google.android.gms.internal.auth.zzhj.zzf(obj, j), com.google.android.gms.internal.auth.zzhj.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(java.lang.Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzi) {
            int i6 = this.zzh[i5];
            int i7 = this.zzc[i6];
            int zzo = zzo(i6);
            int i8 = this.zzc[i6 + 2];
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
            if ((268435456 & zzo) != 0 && !zzF(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzI(obj, i7, i6) && !zzG(obj, zzo, zzr(i6))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn == 50 && !((com.google.android.gms.internal.auth.zzfr) com.google.android.gms.internal.auth.zzhj.zzf(obj, zzo & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                java.util.List list = (java.util.List) com.google.android.gms.internal.auth.zzhj.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    com.google.android.gms.internal.auth.zzgi zzr = zzr(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzr.zzi(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzF(obj, i6, i, i2, i10) && !zzG(obj, zzo, zzr(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return true;
    }
}
