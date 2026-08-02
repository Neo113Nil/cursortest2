package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0253  */
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
        java.lang.Class<?> cls2;
        java.lang.String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        java.lang.reflect.Field zzv;
        char charAt11;
        int i24;
        int i25;
        java.lang.Object obj;
        java.lang.reflect.Field zzv2;
        java.lang.Object obj2;
        java.lang.reflect.Field zzv3;
        int i26;
        char charAt12;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        if (!(zzfuVar instanceof com.google.android.gms.internal.auth.zzgh)) {
            throw null;
        }
        com.google.android.gms.internal.auth.zzgh zzghVar = (com.google.android.gms.internal.auth.zzgh) zzfuVar;
        java.lang.String zzd = zzghVar.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (zzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i32 = charAt16 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt15 = zzd.charAt(i31);
                if (charAt15 < 55296) {
                    break;
                }
                i32 |= (charAt15 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            charAt16 = i32 | (charAt15 << i33);
            i31 = i29;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = zza;
            i5 = 0;
        } else {
            int i34 = i31 + 1;
            int charAt17 = zzd.charAt(i31);
            if (charAt17 >= 55296) {
                int i35 = charAt17 & 8191;
                int i36 = 13;
                while (true) {
                    i14 = i34 + 1;
                    charAt10 = zzd.charAt(i34);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i35 |= (charAt10 & 8191) << i36;
                    i36 += 13;
                    i34 = i14;
                }
                charAt17 = i35 | (charAt10 << i36);
                i34 = i14;
            }
            int i37 = i34 + 1;
            int charAt18 = zzd.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    charAt9 = zzd.charAt(i37);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i38 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i37 = i13;
                }
                charAt18 = i38 | (charAt9 << i39);
                i37 = i13;
            }
            int i40 = i37 + 1;
            int charAt19 = zzd.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    charAt8 = zzd.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i41 |= (charAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i12;
                }
                charAt19 = i41 | (charAt8 << i42);
                i40 = i12;
            }
            int i43 = i40 + 1;
            int charAt20 = zzd.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    charAt7 = zzd.charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i11;
                }
                charAt20 = i44 | (charAt7 << i45);
                i43 = i11;
            }
            int i46 = i43 + 1;
            charAt = zzd.charAt(i43);
            if (charAt >= 55296) {
                int i47 = charAt & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    charAt6 = zzd.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i10;
                }
                charAt = i47 | (charAt6 << i48);
                i46 = i10;
            }
            int i49 = i46 + 1;
            charAt2 = zzd.charAt(i46);
            if (charAt2 >= 55296) {
                int i50 = charAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    charAt5 = zzd.charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i50 |= (charAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i9;
                }
                charAt2 = i50 | (charAt5 << i51);
                i49 = i9;
            }
            int i52 = i49 + 1;
            int charAt21 = zzd.charAt(i49);
            if (charAt21 >= 55296) {
                int i53 = charAt21 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    charAt4 = zzd.charAt(i52);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i53 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i8;
                }
                charAt21 = i53 | (charAt4 << i54);
                i52 = i8;
            }
            int i55 = i52 + 1;
            int charAt22 = zzd.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt3 = zzd.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                charAt22 = i56 | (charAt3 << i57);
                i55 = i7;
            }
            i2 = charAt17 + charAt17 + charAt18;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i3 = charAt19;
            i4 = charAt22;
            i5 = charAt17;
            i6 = charAt20;
            i31 = i55;
        }
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object[] zze = zzghVar.zze();
        java.lang.Class<?> cls3 = zzghVar.zza().getClass();
        int i58 = i4 + charAt2;
        int[] iArr2 = new int[charAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[charAt + charAt];
        int i59 = 0;
        int i60 = 0;
        int i61 = i4;
        int i62 = i58;
        while (i31 < length) {
            int i63 = i31 + 1;
            int charAt23 = zzd.charAt(i31);
            if (charAt23 >= c) {
                int i64 = charAt23 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i28 = i65 + 1;
                    charAt14 = zzd.charAt(i65);
                    if (charAt14 < c) {
                        break;
                    }
                    i64 |= (charAt14 & 8191) << i66;
                    i66 += 13;
                    i65 = i28;
                }
                charAt23 = i64 | (charAt14 << i66);
                i15 = i28;
            } else {
                i15 = i63;
            }
            int i67 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i68 = charAt24 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i27 = i69 + 1;
                    charAt13 = zzd.charAt(i69);
                    if (charAt13 < c) {
                        break;
                    }
                    i68 |= (charAt13 & 8191) << i70;
                    i70 += 13;
                    i69 = i27;
                }
                charAt24 = i68 | (charAt13 << i70);
                i16 = i27;
            } else {
                i16 = i67;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i60] = i59;
                i60++;
            }
            int i71 = charAt24 & 255;
            int i72 = length;
            if (i71 >= 51) {
                int i73 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i74 = charAt25 & 8191;
                    int i75 = 13;
                    while (true) {
                        i26 = i73 + 1;
                        charAt12 = zzd.charAt(i73);
                        if (charAt12 < c2) {
                            break;
                        }
                        i74 |= (charAt12 & 8191) << i75;
                        i75 += 13;
                        i73 = i26;
                        c2 = 55296;
                    }
                    charAt25 = i74 | (charAt12 << i75);
                    i73 = i26;
                }
                int i76 = i71 - 51;
                int i77 = i73;
                if (i76 == 9 || i76 == 17) {
                    int i78 = i59 / 3;
                    i25 = i2 + 1;
                    objArr[i78 + i78 + 1] = zze[i2];
                } else {
                    if (i76 == 12 && (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0)) {
                        int i79 = i59 / 3;
                        i25 = i2 + 1;
                        objArr[i79 + i79 + 1] = zze[i2];
                    }
                    int i80 = charAt25 + charAt25;
                    obj = zze[i80];
                    if (obj instanceof java.lang.reflect.Field) {
                        zzv2 = zzv(cls3, (java.lang.String) obj);
                        zze[i80] = zzv2;
                    } else {
                        zzv2 = (java.lang.reflect.Field) obj;
                    }
                    int i81 = i3;
                    i17 = i6;
                    i23 = (int) unsafe.objectFieldOffset(zzv2);
                    int i82 = i80 + 1;
                    obj2 = zze[i82];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        zzv3 = zzv(cls3, (java.lang.String) obj2);
                        zze[i82] = zzv3;
                    } else {
                        zzv3 = (java.lang.reflect.Field) obj2;
                    }
                    str = zzd;
                    i18 = i81;
                    i19 = (int) unsafe.objectFieldOffset(zzv3);
                    cls2 = cls3;
                    i22 = i2;
                    i20 = i77;
                    i21 = 0;
                }
                i2 = i25;
                int i802 = charAt25 + charAt25;
                obj = zze[i802];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int i812 = i3;
                i17 = i6;
                i23 = (int) unsafe.objectFieldOffset(zzv2);
                int i822 = i802 + 1;
                obj2 = zze[i822];
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                str = zzd;
                i18 = i812;
                i19 = (int) unsafe.objectFieldOffset(zzv3);
                cls2 = cls3;
                i22 = i2;
                i20 = i77;
                i21 = 0;
            } else {
                int i83 = i3;
                i17 = i6;
                int i84 = i2 + 1;
                java.lang.reflect.Field zzv4 = zzv(cls3, (java.lang.String) zze[i2]);
                if (i71 == 9 || i71 == 17) {
                    i18 = i83;
                    int i85 = i59 / 3;
                    objArr[i85 + i85 + 1] = zzv4.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        i18 = i83;
                        int i86 = i59 / 3;
                        i24 = i2 + 2;
                        objArr[i86 + i86 + 1] = zze[i84];
                    } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                        i18 = i83;
                        if (zzghVar.zzc() == 1 || (charAt24 & 2048) != 0) {
                            int i87 = i59 / 3;
                            i24 = i2 + 2;
                            objArr[i87 + i87 + 1] = zze[i84];
                        }
                    } else {
                        if (i71 == 50) {
                            iArr[i61] = i59;
                            int i88 = i59 / 3;
                            int i89 = i2 + 2;
                            int i90 = i88 + i88;
                            objArr[i90] = zze[i84];
                            if ((charAt24 & 2048) != 0) {
                                objArr[i90 + 1] = zze[i89];
                                i89 = i2 + 3;
                            }
                            i61++;
                            i84 = i89;
                        }
                        i18 = i83;
                    }
                    i84 = i24;
                }
                cls2 = cls3;
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzv4);
                if ((charAt24 & 4096) == 0 || i71 > 17) {
                    str = zzd;
                    i19 = 1048575;
                    i20 = i16;
                    i21 = 0;
                } else {
                    int i91 = i16 + 1;
                    int charAt26 = zzd.charAt(i16);
                    if (charAt26 >= 55296) {
                        int i92 = charAt26 & 8191;
                        int i93 = 13;
                        while (true) {
                            i20 = i91 + 1;
                            charAt11 = zzd.charAt(i91);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i92 |= (charAt11 & 8191) << i93;
                            i93 += 13;
                            i91 = i20;
                        }
                        charAt26 = i92 | (charAt11 << i93);
                    } else {
                        i20 = i91;
                    }
                    int i94 = i5 + i5 + (charAt26 / 32);
                    java.lang.Object obj3 = zze[i94];
                    str = zzd;
                    if (obj3 instanceof java.lang.reflect.Field) {
                        zzv = (java.lang.reflect.Field) obj3;
                    } else {
                        zzv = zzv(cls2, (java.lang.String) obj3);
                        zze[i94] = zzv;
                    }
                    i19 = (int) unsafe.objectFieldOffset(zzv);
                    i21 = charAt26 % 32;
                }
                if (i71 >= 18 && i71 <= 49) {
                    iArr[i62] = objectFieldOffset;
                    i62++;
                }
                i22 = i84;
                i23 = objectFieldOffset;
            }
            iArr2[i59] = charAt23;
            iArr2[i59 + 1] = i23 | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i71 << 20);
            iArr2[i59 + 2] = i19 | (i21 << 20);
            i59 += 3;
            cls3 = cls2;
            i2 = i22;
            i31 = i20;
            i3 = i18;
            zzd = str;
            length = i72;
            i6 = i17;
            c = 55296;
        }
        return new com.google.android.gms.internal.auth.zzga(iArr2, objArr, i3, i6, zzghVar.zza(), zzghVar.zzc(), false, iArr, i4, i58, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
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
        int zzo = zzo(i);
        if (!zzE(obj, i)) {
            return zzr.zzd();
        }
        java.lang.Object object = zzb.getObject(obj, 1048575 & zzo);
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
            int zzo = zzo(i);
            sun.misc.Unsafe unsafe = zzb;
            long j = zzo & 1048575;
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
            int zzo = zzo(i);
            sun.misc.Unsafe unsafe = zzb;
            long j = zzo & 1048575;
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
        int floatToIntBits;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzo = zzo(i3);
            int i4 = this.zzc[i3];
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = java.lang.Double.doubleToLongBits(com.google.android.gms.internal.auth.zzhj.zza(obj, j));
                    byte[] bArr = com.google.android.gms.internal.auth.zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = java.lang.Float.floatToIntBits(com.google.android.gms.internal.auth.zzhj.zzb(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr2 = com.google.android.gms.internal.auth.zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr3 = com.google.android.gms.internal.auth.zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr4 = com.google.android.gms.internal.auth.zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzfa.zza(com.google.android.gms.internal.auth.zzhj.zzt(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((java.lang.String) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    java.lang.Object zzf = com.google.android.gms.internal.auth.zzhj.zzf(obj, j);
                    if (zzf != null) {
                        floatToIntBits = zzf.hashCode();
                        i = i2 * 53;
                        i2 = i + floatToIntBits;
                        break;
                    }
                    floatToIntBits = 37;
                    i = i2 * 53;
                    i2 = i + floatToIntBits;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr5 = com.google.android.gms.internal.auth.zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzc(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = com.google.android.gms.internal.auth.zzhj.zzd(obj, j);
                    byte[] bArr6 = com.google.android.gms.internal.auth.zzfa.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    java.lang.Object zzf2 = com.google.android.gms.internal.auth.zzhj.zzf(obj, j);
                    if (zzf2 != null) {
                        floatToIntBits = zzf2.hashCode();
                        i = i2 * 53;
                        i2 = i + floatToIntBits;
                        break;
                    }
                    floatToIntBits = 37;
                    i = i2 * 53;
                    i2 = i + floatToIntBits;
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
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 51:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = java.lang.Double.doubleToLongBits(((java.lang.Double) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).doubleValue());
                        byte[] bArr7 = com.google.android.gms.internal.auth.zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = java.lang.Float.floatToIntBits(((java.lang.Float) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).floatValue());
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = com.google.android.gms.internal.auth.zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = com.google.android.gms.internal.auth.zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = com.google.android.gms.internal.auth.zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = com.google.android.gms.internal.auth.zzfa.zza(((java.lang.Boolean) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).booleanValue());
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((java.lang.String) com.google.android.gms.internal.auth.zzhj.zzf(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = com.google.android.gms.internal.auth.zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = zzk(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = com.google.android.gms.internal.auth.zzfa.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = com.google.android.gms.internal.auth.zzhj.zzf(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i2 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d51, code lost:
    
        if (r6 == 1048575) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0d53, code lost:
    
        r0.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d57, code lost:
    
        r3 = r37.zzi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d5d, code lost:
    
        if (r3 >= r37.zzj) goto L675;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d5f, code lost:
    
        r5 = r37.zzh[r3];
        r6 = r37.zzc[r5];
        r6 = com.google.android.gms.internal.auth.zzhj.zzf(r7, zzo(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d71, code lost:
    
        if (r6 != null) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d78, code lost:
    
        if (zzq(r5) != null) goto L674;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d7d, code lost:
    
        r6 = (com.google.android.gms.internal.auth.zzfr) r6;
        r1 = (com.google.android.gms.internal.auth.zzfq) zzs(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0d85, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0d7a, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0d86, code lost:
    
        if (r9 != 0) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0d88, code lost:
    
        if (r1 != r10) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0d8f, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0d94, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0d90, code lost:
    
        if (r1 > r10) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0d92, code lost:
    
        if (r4 != r9) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0d99, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzd();
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0cf4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0d0b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0a2f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0a3b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzb(java.lang.Object obj, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        int zzm;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        sun.misc.Unsafe unsafe2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        sun.misc.Unsafe unsafe3;
        int i22;
        java.lang.Object obj2;
        com.google.android.gms.internal.auth.zzez zzezVar;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        sun.misc.Unsafe unsafe4;
        int zzf;
        int i34;
        int i35;
        int i36;
        java.lang.Object obj3;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int zzj;
        int i47;
        int i48;
        int i49;
        int zzh;
        int i50;
        int i51;
        com.google.android.gms.internal.auth.zzdt zzdtVar2;
        int zzk;
        int i52;
        int zzk2;
        int i53;
        com.google.android.gms.internal.auth.zzdt zzdtVar3;
        int zza2;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        sun.misc.Unsafe unsafe5;
        int i63;
        int i64;
        com.google.android.gms.internal.auth.zzdt zzdtVar4;
        int i65;
        int i66;
        int zzk3;
        int i67;
        int i68;
        sun.misc.Unsafe unsafe6;
        int i69;
        com.google.android.gms.internal.auth.zzga<T> zzgaVar = this;
        java.lang.Object obj4 = obj;
        int i70 = i2;
        int i71 = i3;
        com.google.android.gms.internal.auth.zzdt zzdtVar5 = zzdtVar;
        zzw(obj);
        sun.misc.Unsafe unsafe7 = zzb;
        int i72 = 0;
        int i73 = i;
        int i74 = 0;
        int i75 = 0;
        int i76 = 0;
        int i77 = -1;
        int i78 = 1048575;
        while (true) {
            if (i73 < i70) {
                int i79 = i73 + 1;
                int i80 = bArr[i73];
                if (i80 < 0) {
                    i7 = com.google.android.gms.internal.auth.zzdu.zzi(i80, bArr, i79, zzdtVar5);
                    i6 = zzdtVar5.zza;
                } else {
                    i6 = i80;
                    i7 = i79;
                }
                int i81 = i6 >>> 3;
                if (i81 > i77) {
                    int i82 = i74 / 3;
                    if (i81 >= zzgaVar.zze && i81 <= zzgaVar.zzf) {
                        zzm = zzgaVar.zzm(i81, i82);
                        i9 = zzm;
                        i8 = -1;
                    }
                    i8 = -1;
                    i9 = -1;
                } else {
                    if (i81 >= zzgaVar.zze && i81 <= zzgaVar.zzf) {
                        zzm = zzgaVar.zzm(i81, i72);
                        i9 = zzm;
                        i8 = -1;
                    }
                    i8 = -1;
                    i9 = -1;
                }
                if (i9 != i8) {
                    int i83 = i6 & 7;
                    int[] iArr = zzgaVar.zzc;
                    int i84 = iArr[i9 + 1];
                    int i85 = i6;
                    int zzn = zzn(i84);
                    long j = i84 & 1048575;
                    if (zzn > 17) {
                        int i86 = i9;
                        int i87 = i76;
                        int i88 = i85;
                        i14 = 0;
                        int i89 = i78;
                        i16 = i2;
                        if (zzn != 27) {
                            if (zzn > 49) {
                                unsafe2 = unsafe7;
                                i12 = i89;
                                i11 = i87;
                                i19 = i7;
                                i20 = i86;
                                i13 = i81;
                                if (zzn != 50) {
                                    sun.misc.Unsafe unsafe8 = zzb;
                                    long j2 = iArr[i20 + 2] & 1048575;
                                    switch (zzn) {
                                        case 51:
                                            i15 = i20;
                                            i50 = i19;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar5;
                                            obj4 = obj;
                                            i16 = i2;
                                            if (i83 == 1) {
                                                unsafe8.putObject(obj4, j, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i50))));
                                                i73 = i50 + 8;
                                                unsafe8.putInt(obj4, j2, i13);
                                                if (i73 != i50) {
                                                    i4 = i3;
                                                    i10 = i73;
                                                    i17 = i51;
                                                    break;
                                                } else {
                                                    i54 = i12;
                                                    zzgaVar = this;
                                                    i71 = i3;
                                                    i77 = i13;
                                                    zzdtVar5 = zzdtVar2;
                                                    i70 = i16;
                                                    i76 = i11;
                                                    i72 = i14;
                                                    i75 = i51;
                                                    i74 = i15;
                                                    unsafe7 = unsafe2;
                                                    i78 = i54;
                                                }
                                            }
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                        case 52:
                                            i15 = i20;
                                            i50 = i19;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar5;
                                            obj4 = obj;
                                            i16 = i2;
                                            if (i83 == 5) {
                                                unsafe8.putObject(obj4, j, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i50))));
                                                i73 = i50 + 4;
                                                unsafe8.putInt(obj4, j2, i13);
                                                if (i73 != i50) {
                                                }
                                            }
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i15 = i20;
                                            i50 = i19;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar5;
                                            obj4 = obj;
                                            i16 = i2;
                                            if (i83 == 0) {
                                                zzk = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i50, zzdtVar2);
                                                unsafe8.putObject(obj4, j, java.lang.Long.valueOf(zzdtVar2.zzb));
                                                unsafe8.putInt(obj4, j2, i13);
                                                i73 = zzk;
                                                if (i73 != i50) {
                                                }
                                            }
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i15 = i20;
                                            i50 = i19;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar5;
                                            obj4 = obj;
                                            i16 = i2;
                                            if (i83 == 0) {
                                                zzk = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i50, zzdtVar2);
                                                unsafe8.putObject(obj4, j, java.lang.Integer.valueOf(zzdtVar2.zza));
                                                unsafe8.putInt(obj4, j2, i13);
                                                i73 = zzk;
                                                if (i73 != i50) {
                                                }
                                            }
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i15 = i20;
                                            i50 = i19;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar5;
                                            obj4 = obj;
                                            i16 = i2;
                                            if (i83 == 1) {
                                                unsafe8.putObject(obj4, j, java.lang.Long.valueOf(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i50)));
                                                i73 = i50 + 8;
                                                unsafe8.putInt(obj4, j2, i13);
                                                if (i73 != i50) {
                                                }
                                            }
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i15 = i20;
                                            i50 = i19;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar5;
                                            obj4 = obj;
                                            i16 = i2;
                                            if (i83 == 5) {
                                                unsafe8.putObject(obj4, j, java.lang.Integer.valueOf(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i50)));
                                                i73 = i50 + 4;
                                                unsafe8.putInt(obj4, j2, i13);
                                                if (i73 != i50) {
                                                }
                                            }
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 58:
                                            i15 = i20;
                                            i52 = i19;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar5;
                                            obj4 = obj;
                                            i16 = i2;
                                            if (i83 == 0) {
                                                zzk2 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i52, zzdtVar2);
                                                i50 = i52;
                                                unsafe8.putObject(obj4, j, java.lang.Boolean.valueOf(zzdtVar2.zzb != 0));
                                                unsafe8.putInt(obj4, j2, i13);
                                                i73 = zzk2;
                                                if (i73 != i50) {
                                                }
                                            }
                                            i50 = i52;
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 59:
                                            i15 = i20;
                                            i52 = i19;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar5;
                                            obj4 = obj;
                                            i16 = i2;
                                            if (i83 == 2) {
                                                zzk2 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i52, zzdtVar2);
                                                int i90 = zzdtVar2.zza;
                                                if (i90 == 0) {
                                                    unsafe8.putObject(obj4, j, "");
                                                } else {
                                                    if ((i84 & 536870912) != 0 && !com.google.android.gms.internal.auth.zzhn.zzc(bArr, zzk2, zzk2 + i90)) {
                                                        throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                    }
                                                    unsafe8.putObject(obj4, j, new java.lang.String(bArr, zzk2, i90, com.google.android.gms.internal.auth.zzfa.zzb));
                                                    zzk2 += i90;
                                                }
                                                unsafe8.putInt(obj4, j2, i13);
                                                i50 = i52;
                                                i73 = zzk2;
                                                if (i73 != i50) {
                                                }
                                            }
                                            i50 = i52;
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 60:
                                            obj4 = obj;
                                            i53 = i19;
                                            zzdtVar3 = zzdtVar5;
                                            if (i83 == 2) {
                                                java.lang.Object zzu = zzgaVar.zzu(obj4, i13, i20);
                                                i51 = i88;
                                                i73 = com.google.android.gms.internal.auth.zzdu.zzm(zzu, zzgaVar.zzr(i20), bArr, i53, i2, zzdtVar);
                                                zzgaVar.zzC(obj4, i13, i20, zzu);
                                                i15 = i20;
                                                i13 = i13;
                                                zzdtVar2 = zzdtVar3;
                                                i16 = i2;
                                                i50 = i53;
                                                if (i73 != i50) {
                                                }
                                            } else {
                                                i51 = i88;
                                                i15 = i20;
                                                zzdtVar2 = zzdtVar3;
                                                i50 = i53;
                                                i16 = i2;
                                                i73 = i50;
                                                if (i73 != i50) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            zzdtVar3 = zzdtVar5;
                                            obj4 = obj;
                                            i53 = i19;
                                            if (i83 == 2) {
                                                zza2 = com.google.android.gms.internal.auth.zzdu.zza(bArr, i53, zzdtVar3);
                                                unsafe8.putObject(obj4, j, zzdtVar3.zzc);
                                                unsafe8.putInt(obj4, j2, i13);
                                                i15 = i20;
                                                i73 = zza2;
                                                i51 = i88;
                                                zzdtVar2 = zzdtVar3;
                                                i50 = i53;
                                                i16 = i2;
                                                if (i73 != i50) {
                                                }
                                            }
                                            i15 = i20;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar3;
                                            i50 = i53;
                                            i16 = i2;
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 63:
                                            zzdtVar3 = zzdtVar5;
                                            obj4 = obj;
                                            i53 = i19;
                                            if (i83 == 0) {
                                                zza2 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i53, zzdtVar3);
                                                int i91 = zzdtVar3.zza;
                                                com.google.android.gms.internal.auth.zzey zzq = zzgaVar.zzq(i20);
                                                if (zzq == null || zzq.zza()) {
                                                    unsafe8.putObject(obj4, j, java.lang.Integer.valueOf(i91));
                                                    unsafe8.putInt(obj4, j2, i13);
                                                } else {
                                                    zzc(obj).zzh(i88, java.lang.Long.valueOf(i91));
                                                }
                                                i15 = i20;
                                                i73 = zza2;
                                                i51 = i88;
                                                zzdtVar2 = zzdtVar3;
                                                i50 = i53;
                                                i16 = i2;
                                                if (i73 != i50) {
                                                }
                                            }
                                            i15 = i20;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar3;
                                            i50 = i53;
                                            i16 = i2;
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 66:
                                            zzdtVar3 = zzdtVar5;
                                            obj4 = obj;
                                            i53 = i19;
                                            if (i83 == 0) {
                                                zza2 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i53, zzdtVar3);
                                                unsafe8.putObject(obj4, j, java.lang.Integer.valueOf(com.google.android.gms.internal.auth.zzej.zzb(zzdtVar3.zza)));
                                                unsafe8.putInt(obj4, j2, i13);
                                                i15 = i20;
                                                i73 = zza2;
                                                i51 = i88;
                                                zzdtVar2 = zzdtVar3;
                                                i50 = i53;
                                                i16 = i2;
                                                if (i73 != i50) {
                                                }
                                            }
                                            i15 = i20;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar3;
                                            i50 = i53;
                                            i16 = i2;
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 67:
                                            zzdtVar3 = zzdtVar5;
                                            obj4 = obj;
                                            i53 = i19;
                                            if (i83 == 0) {
                                                zza2 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i53, zzdtVar3);
                                                unsafe8.putObject(obj4, j, java.lang.Long.valueOf(com.google.android.gms.internal.auth.zzej.zzc(zzdtVar3.zzb)));
                                                unsafe8.putInt(obj4, j2, i13);
                                                i15 = i20;
                                                i73 = zza2;
                                                i51 = i88;
                                                zzdtVar2 = zzdtVar3;
                                                i50 = i53;
                                                i16 = i2;
                                                if (i73 != i50) {
                                                }
                                            }
                                            i15 = i20;
                                            i51 = i88;
                                            zzdtVar2 = zzdtVar3;
                                            i50 = i53;
                                            i16 = i2;
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                        case 68:
                                            if (i83 == 3) {
                                                obj4 = obj;
                                                java.lang.Object zzu2 = zzgaVar.zzu(obj4, i13, i20);
                                                i53 = i19;
                                                zzdtVar3 = zzdtVar5;
                                                int zzl = com.google.android.gms.internal.auth.zzdu.zzl(zzu2, zzgaVar.zzr(i20), bArr, i19, i2, (i88 & (-8)) | 4, zzdtVar);
                                                zzgaVar.zzC(obj4, i13, i20, zzu2);
                                                zza2 = zzl;
                                                i15 = i20;
                                                i73 = zza2;
                                                i51 = i88;
                                                zzdtVar2 = zzdtVar3;
                                                i50 = i53;
                                                i16 = i2;
                                                if (i73 != i50) {
                                                }
                                            }
                                            break;
                                        default:
                                            obj4 = obj;
                                            i16 = i2;
                                            i15 = i20;
                                            i51 = i88;
                                            i50 = i19;
                                            zzdtVar2 = zzdtVar5;
                                            i73 = i50;
                                            if (i73 != i50) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i83 == 2) {
                                        sun.misc.Unsafe unsafe9 = zzb;
                                        java.lang.Object zzs = zzgaVar.zzs(i20);
                                        java.lang.Object object = unsafe9.getObject(obj, j);
                                        if (!((com.google.android.gms.internal.auth.zzfr) object).zze()) {
                                            com.google.android.gms.internal.auth.zzfr zzb2 = com.google.android.gms.internal.auth.zzfr.zza().zzb();
                                            com.google.android.gms.internal.auth.zzfs.zza(zzb2, object);
                                            unsafe9.putObject(obj, j, zzb2);
                                        }
                                        throw null;
                                    }
                                    i18 = i88;
                                    obj4 = obj;
                                    i22 = i20;
                                    i75 = i18;
                                    i73 = i19;
                                    i76 = i11;
                                    i4 = i3;
                                    i10 = i73;
                                    i15 = i22;
                                    i17 = i75;
                                    i11 = i76;
                                }
                            } else {
                                long j3 = i84;
                                sun.misc.Unsafe unsafe10 = zzb;
                                sun.misc.Unsafe unsafe11 = unsafe7;
                                com.google.android.gms.internal.auth.zzez zzezVar2 = (com.google.android.gms.internal.auth.zzez) unsafe10.getObject(obj4, j);
                                if (zzezVar2.zzc()) {
                                    obj2 = "";
                                    zzezVar = zzezVar2;
                                } else {
                                    int size = zzezVar2.size();
                                    obj2 = "";
                                    com.google.android.gms.internal.auth.zzez zzd = zzezVar2.zzd(size != 0 ? size + size : 10);
                                    unsafe10.putObject(obj4, j, zzd);
                                    zzezVar = zzd;
                                }
                                switch (zzn) {
                                    case 18:
                                    case 35:
                                        i23 = i7;
                                        i70 = i16;
                                        i21 = i81;
                                        i24 = i86;
                                        i25 = i88;
                                        i26 = i89;
                                        i27 = i87;
                                        unsafe3 = unsafe11;
                                        if (i83 != 2) {
                                            if (i83 == 1) {
                                                com.google.android.gms.internal.auth.zzek zzekVar = (com.google.android.gms.internal.auth.zzek) zzezVar;
                                                zzekVar.zze(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i23)));
                                                i28 = i23 + 8;
                                                while (i28 < i70) {
                                                    int zzh2 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i28, zzdtVar5);
                                                    if (i25 == zzdtVar5.zza) {
                                                        zzekVar.zze(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, zzh2)));
                                                        i28 = zzh2 + 8;
                                                    }
                                                }
                                            }
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                                obj4 = obj;
                                                i22 = i74;
                                                i12 = i31;
                                                unsafe2 = unsafe3;
                                                i13 = i21;
                                                i16 = i70;
                                                i4 = i3;
                                                i10 = i73;
                                                i15 = i22;
                                                i17 = i75;
                                                i11 = i76;
                                                break;
                                            } else {
                                                i78 = i26;
                                                obj4 = obj;
                                                i71 = i3;
                                                unsafe7 = unsafe3;
                                                i77 = i21;
                                                i72 = i14;
                                            }
                                        } else {
                                            com.google.android.gms.internal.auth.zzek zzekVar2 = (com.google.android.gms.internal.auth.zzek) zzezVar;
                                            i28 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i23, zzdtVar5);
                                            int i92 = zzdtVar5.zza + i28;
                                            while (i28 < i92) {
                                                zzekVar2.zze(java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i28)));
                                                i28 += 8;
                                            }
                                            if (i28 != i92) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzf();
                                            }
                                        }
                                        i29 = i28;
                                        i75 = i25;
                                        i74 = i24;
                                        i30 = i23;
                                        i76 = i27;
                                        i31 = i26;
                                        i23 = i30;
                                        i73 = i29;
                                        if (i73 != i23) {
                                        }
                                    case 19:
                                    case 36:
                                        i23 = i7;
                                        i70 = i16;
                                        i21 = i81;
                                        i24 = i86;
                                        i25 = i88;
                                        i26 = i89;
                                        i27 = i87;
                                        unsafe3 = unsafe11;
                                        if (i83 == 2) {
                                            com.google.android.gms.internal.auth.zzer zzerVar = (com.google.android.gms.internal.auth.zzer) zzezVar;
                                            i28 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i23, zzdtVar5);
                                            int i93 = zzdtVar5.zza + i28;
                                            while (i28 < i93) {
                                                zzerVar.zze(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i28)));
                                                i28 += 4;
                                            }
                                            if (i28 != i93) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzf();
                                            }
                                        } else {
                                            if (i83 == 5) {
                                                com.google.android.gms.internal.auth.zzer zzerVar2 = (com.google.android.gms.internal.auth.zzer) zzezVar;
                                                zzerVar2.zze(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i23)));
                                                i28 = i23 + 4;
                                                while (i28 < i70) {
                                                    int zzh3 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i28, zzdtVar5);
                                                    if (i25 == zzdtVar5.zza) {
                                                        zzerVar2.zze(java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, zzh3)));
                                                        i28 = zzh3 + 4;
                                                    }
                                                }
                                            }
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        i29 = i28;
                                        i75 = i25;
                                        i74 = i24;
                                        i30 = i23;
                                        i76 = i27;
                                        i31 = i26;
                                        i23 = i30;
                                        i73 = i29;
                                        if (i73 != i23) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i23 = i7;
                                        i70 = i16;
                                        i21 = i81;
                                        i24 = i86;
                                        i25 = i88;
                                        i26 = i89;
                                        i27 = i87;
                                        unsafe3 = unsafe11;
                                        if (i83 == 2) {
                                            com.google.android.gms.internal.auth.zzfm zzfmVar = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                            i28 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i23, zzdtVar5);
                                            int i94 = zzdtVar5.zza + i28;
                                            while (i28 < i94) {
                                                i28 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i28, zzdtVar5);
                                                zzfmVar.zze(zzdtVar5.zzb);
                                            }
                                            if (i28 != i94) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzf();
                                            }
                                        } else {
                                            if (i83 == 0) {
                                                com.google.android.gms.internal.auth.zzfm zzfmVar2 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                                i28 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i23, zzdtVar5);
                                                zzfmVar2.zze(zzdtVar5.zzb);
                                                while (i28 < i70) {
                                                    int zzh4 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i28, zzdtVar5);
                                                    if (i25 == zzdtVar5.zza) {
                                                        i28 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzh4, zzdtVar5);
                                                        zzfmVar2.zze(zzdtVar5.zzb);
                                                    }
                                                }
                                            }
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        i29 = i28;
                                        i75 = i25;
                                        i74 = i24;
                                        i30 = i23;
                                        i76 = i27;
                                        i31 = i26;
                                        i23 = i30;
                                        i73 = i29;
                                        if (i73 != i23) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i32 = i81;
                                        i33 = i86;
                                        i25 = i88;
                                        i26 = i89;
                                        i27 = i87;
                                        unsafe4 = unsafe11;
                                        if (i83 == 2) {
                                            zzf = com.google.android.gms.internal.auth.zzdu.zzf(bArr, i7, zzezVar, zzdtVar5);
                                            i23 = i7;
                                            i34 = zzf;
                                            i35 = i26;
                                            i29 = i34;
                                            unsafe3 = unsafe4;
                                            i74 = i33;
                                            i70 = i16;
                                            i30 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            i26 = i35;
                                            i21 = i32;
                                            i75 = i25;
                                            i23 = i30;
                                            i73 = i29;
                                            if (i73 != i23) {
                                            }
                                        } else {
                                            if (i83 == 0) {
                                                i23 = i7;
                                                unsafe3 = unsafe4;
                                                i21 = i32;
                                                i24 = i33;
                                                i70 = i16;
                                                i28 = com.google.android.gms.internal.auth.zzdu.zzj(i25, bArr, i23, i2, zzezVar, zzdtVar);
                                                i29 = i28;
                                                i75 = i25;
                                                i74 = i24;
                                                i30 = i23;
                                                i76 = i27;
                                                i31 = i26;
                                                i23 = i30;
                                                i73 = i29;
                                                if (i73 != i23) {
                                                }
                                            }
                                            i23 = i7;
                                            unsafe3 = unsafe4;
                                            i21 = i32;
                                            i24 = i33;
                                            i70 = i16;
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i32 = i81;
                                        i33 = i86;
                                        i25 = i88;
                                        i26 = i89;
                                        i27 = i87;
                                        unsafe4 = unsafe11;
                                        if (i83 == 2) {
                                            com.google.android.gms.internal.auth.zzfm zzfmVar3 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                            zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                            int i95 = zzdtVar5.zza + zzf;
                                            while (zzf < i95) {
                                                zzfmVar3.zze(com.google.android.gms.internal.auth.zzdu.zzn(bArr, zzf));
                                                zzf += 8;
                                            }
                                            if (zzf != i95) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzf();
                                            }
                                        } else {
                                            if (i83 == 1) {
                                                com.google.android.gms.internal.auth.zzfm zzfmVar4 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                                zzfmVar4.zze(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i7));
                                                zzf = i7 + 8;
                                                while (zzf < i16) {
                                                    int zzh5 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzf, zzdtVar5);
                                                    if (i25 == zzdtVar5.zza) {
                                                        zzfmVar4.zze(com.google.android.gms.internal.auth.zzdu.zzn(bArr, zzh5));
                                                        zzf = zzh5 + 8;
                                                    }
                                                }
                                            }
                                            i23 = i7;
                                            unsafe3 = unsafe4;
                                            i21 = i32;
                                            i24 = i33;
                                            i70 = i16;
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        i23 = i7;
                                        i34 = zzf;
                                        i35 = i26;
                                        i29 = i34;
                                        unsafe3 = unsafe4;
                                        i74 = i33;
                                        i70 = i16;
                                        i30 = i23;
                                        i76 = i27;
                                        i31 = i26;
                                        i26 = i35;
                                        i21 = i32;
                                        i75 = i25;
                                        i23 = i30;
                                        i73 = i29;
                                        if (i73 != i23) {
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i32 = i81;
                                        i33 = i86;
                                        i25 = i88;
                                        i26 = i89;
                                        i27 = i87;
                                        unsafe4 = unsafe11;
                                        if (i83 == 2) {
                                            com.google.android.gms.internal.auth.zzew zzewVar = (com.google.android.gms.internal.auth.zzew) zzezVar;
                                            zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                            int i96 = zzdtVar5.zza + zzf;
                                            while (zzf < i96) {
                                                zzewVar.zze(com.google.android.gms.internal.auth.zzdu.zzb(bArr, zzf));
                                                zzf += 4;
                                            }
                                            if (zzf != i96) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzf();
                                            }
                                        } else {
                                            if (i83 == 5) {
                                                com.google.android.gms.internal.auth.zzew zzewVar2 = (com.google.android.gms.internal.auth.zzew) zzezVar;
                                                zzewVar2.zze(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i7));
                                                zzf = i7 + 4;
                                                while (zzf < i16) {
                                                    int zzh6 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzf, zzdtVar5);
                                                    if (i25 == zzdtVar5.zza) {
                                                        zzewVar2.zze(com.google.android.gms.internal.auth.zzdu.zzb(bArr, zzh6));
                                                        zzf = zzh6 + 4;
                                                    }
                                                }
                                            }
                                            i23 = i7;
                                            unsafe3 = unsafe4;
                                            i21 = i32;
                                            i24 = i33;
                                            i70 = i16;
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        i23 = i7;
                                        i34 = zzf;
                                        i35 = i26;
                                        i29 = i34;
                                        unsafe3 = unsafe4;
                                        i74 = i33;
                                        i70 = i16;
                                        i30 = i23;
                                        i76 = i27;
                                        i31 = i26;
                                        i26 = i35;
                                        i21 = i32;
                                        i75 = i25;
                                        i23 = i30;
                                        i73 = i29;
                                        if (i73 != i23) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i32 = i81;
                                        i33 = i86;
                                        i25 = i88;
                                        i26 = i89;
                                        i27 = i87;
                                        unsafe4 = unsafe11;
                                        if (i83 == 2) {
                                            com.google.android.gms.internal.auth.zzdv zzdvVar = (com.google.android.gms.internal.auth.zzdv) zzezVar;
                                            zzf = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                            int i97 = zzdtVar5.zza + zzf;
                                            while (zzf < i97) {
                                                zzf = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzf, zzdtVar5);
                                                zzdvVar.zze(zzdtVar5.zzb != 0);
                                            }
                                            if (zzf != i97) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzf();
                                            }
                                        } else {
                                            if (i83 == 0) {
                                                com.google.android.gms.internal.auth.zzdv zzdvVar2 = (com.google.android.gms.internal.auth.zzdv) zzezVar;
                                                zzf = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i7, zzdtVar5);
                                                zzdvVar2.zze(zzdtVar5.zzb != 0);
                                                while (zzf < i16) {
                                                    int zzh7 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzf, zzdtVar5);
                                                    if (i25 == zzdtVar5.zza) {
                                                        zzf = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzh7, zzdtVar5);
                                                        zzdvVar2.zze(zzdtVar5.zzb != 0);
                                                    }
                                                }
                                            }
                                            i23 = i7;
                                            unsafe3 = unsafe4;
                                            i21 = i32;
                                            i24 = i33;
                                            i70 = i16;
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        i23 = i7;
                                        i34 = zzf;
                                        i35 = i26;
                                        i29 = i34;
                                        unsafe3 = unsafe4;
                                        i74 = i33;
                                        i70 = i16;
                                        i30 = i23;
                                        i76 = i27;
                                        i31 = i26;
                                        i26 = i35;
                                        i21 = i32;
                                        i75 = i25;
                                        i23 = i30;
                                        i73 = i29;
                                        if (i73 != i23) {
                                        }
                                        break;
                                    case 26:
                                        i32 = i81;
                                        i33 = i86;
                                        i25 = i88;
                                        i26 = i89;
                                        i27 = i87;
                                        unsafe4 = unsafe11;
                                        if (i83 == 2) {
                                            if ((j3 & com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_DISK_SPACE) == 0) {
                                                int zzh8 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                                int i98 = zzdtVar5.zza;
                                                if (i98 < 0) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                }
                                                if (i98 == 0) {
                                                    obj3 = obj2;
                                                    zzezVar.add(obj3);
                                                    i37 = i25;
                                                    i35 = i26;
                                                } else {
                                                    obj3 = obj2;
                                                    zzezVar.add(new java.lang.String(bArr, zzh8, i98, com.google.android.gms.internal.auth.zzfa.zzb));
                                                    i35 = i26;
                                                    i37 = i25;
                                                    zzh8 += i98;
                                                }
                                                while (true) {
                                                    int i99 = zzh8;
                                                    i38 = i7;
                                                    i34 = i99;
                                                    while (i34 < i16) {
                                                        int zzh9 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i34, zzdtVar5);
                                                        if (i37 == zzdtVar5.zza) {
                                                            i34 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh9, zzdtVar5);
                                                            int i100 = zzdtVar5.zza;
                                                            if (i100 < 0) {
                                                                throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                            }
                                                            if (i100 == 0) {
                                                                zzezVar.add(obj3);
                                                            } else {
                                                                zzezVar.add(new java.lang.String(bArr, i34, i100, com.google.android.gms.internal.auth.zzfa.zzb));
                                                                i7 = i38;
                                                                zzh8 = i34 + i100;
                                                            }
                                                        }
                                                    }
                                                }
                                                i23 = i38;
                                                i29 = i34;
                                                unsafe3 = unsafe4;
                                                i74 = i33;
                                                i70 = i16;
                                                i30 = i23;
                                                i76 = i27;
                                                i31 = i26;
                                                i26 = i35;
                                                i21 = i32;
                                                i75 = i25;
                                                i23 = i30;
                                                i73 = i29;
                                                if (i73 != i23) {
                                                }
                                            } else {
                                                java.lang.Object obj5 = obj2;
                                                int zzh10 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                                int i101 = zzdtVar5.zza;
                                                if (i101 < 0) {
                                                    throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                }
                                                if (i101 == 0) {
                                                    zzezVar.add(obj5);
                                                    i36 = zzh10;
                                                } else {
                                                    i36 = zzh10 + i101;
                                                    if (!com.google.android.gms.internal.auth.zzhn.zzc(bArr, zzh10, i36)) {
                                                        throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                    }
                                                    zzezVar.add(new java.lang.String(bArr, zzh10, i101, com.google.android.gms.internal.auth.zzfa.zzb));
                                                }
                                                while (i36 < i16) {
                                                    int zzh11 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i36, zzdtVar5);
                                                    if (i25 == zzdtVar5.zza) {
                                                        i36 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh11, zzdtVar5);
                                                        int i102 = zzdtVar5.zza;
                                                        if (i102 < 0) {
                                                            throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                        }
                                                        if (i102 == 0) {
                                                            zzezVar.add(obj5);
                                                        } else {
                                                            int i103 = i36 + i102;
                                                            if (!com.google.android.gms.internal.auth.zzhn.zzc(bArr, i36, i103)) {
                                                                throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                            }
                                                            zzezVar.add(new java.lang.String(bArr, i36, i102, com.google.android.gms.internal.auth.zzfa.zzb));
                                                            i36 = i103;
                                                        }
                                                    } else {
                                                        i23 = i7;
                                                        i34 = i36;
                                                        i35 = i26;
                                                        i29 = i34;
                                                        unsafe3 = unsafe4;
                                                        i74 = i33;
                                                        i70 = i16;
                                                        i30 = i23;
                                                        i76 = i27;
                                                        i31 = i26;
                                                        i26 = i35;
                                                        i21 = i32;
                                                        i75 = i25;
                                                        i23 = i30;
                                                        i73 = i29;
                                                        if (i73 != i23) {
                                                        }
                                                    }
                                                }
                                                i23 = i7;
                                                i34 = i36;
                                                i35 = i26;
                                                i29 = i34;
                                                unsafe3 = unsafe4;
                                                i74 = i33;
                                                i70 = i16;
                                                i30 = i23;
                                                i76 = i27;
                                                i31 = i26;
                                                i26 = i35;
                                                i21 = i32;
                                                i75 = i25;
                                                i23 = i30;
                                                i73 = i29;
                                                if (i73 != i23) {
                                                }
                                            }
                                        }
                                        i23 = i7;
                                        unsafe3 = unsafe4;
                                        i21 = i32;
                                        i24 = i33;
                                        i70 = i16;
                                        i75 = i25;
                                        i74 = i24;
                                        i73 = i23;
                                        i76 = i27;
                                        i31 = i26;
                                        if (i73 != i23) {
                                        }
                                        break;
                                    case 27:
                                        i23 = i7;
                                        i39 = i86;
                                        i26 = i89;
                                        i27 = i87;
                                        if (i83 == 2) {
                                            i30 = i23;
                                            int zze = com.google.android.gms.internal.auth.zzdu.zze(zzgaVar.zzr(i39), i88, bArr, i23, i2, zzezVar, zzdtVar);
                                            zzdtVar5 = zzdtVar5;
                                            i21 = i81;
                                            i70 = i16;
                                            i75 = i88;
                                            i29 = zze;
                                            i31 = i26;
                                            unsafe3 = unsafe11;
                                            i74 = i39;
                                            i76 = i27;
                                            i23 = i30;
                                            i73 = i29;
                                            if (i73 != i23) {
                                            }
                                        } else {
                                            i25 = i88;
                                            i70 = i16;
                                            unsafe3 = unsafe11;
                                            i24 = i39;
                                            i21 = i81;
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        i23 = i7;
                                        i39 = i86;
                                        i26 = i89;
                                        i27 = i87;
                                        if (i83 == 2) {
                                            i34 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i23, zzdtVar5);
                                            int i104 = zzdtVar5.zza;
                                            if (i104 < 0) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzc();
                                            }
                                            if (i104 > bArr.length - i34) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzf();
                                            }
                                            if (i104 == 0) {
                                                zzezVar.add(com.google.android.gms.internal.auth.zzef.zzb);
                                                i40 = i39;
                                                i41 = i27;
                                                i42 = i26;
                                                i43 = i88;
                                            } else {
                                                zzezVar.add(com.google.android.gms.internal.auth.zzef.zzk(bArr, i34, i104));
                                                i40 = i39;
                                                i41 = i27;
                                                i42 = i26;
                                                i43 = i88;
                                                i34 += i104;
                                            }
                                            while (i34 < i16) {
                                                int zzh12 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i34, zzdtVar5);
                                                if (i43 == zzdtVar5.zza) {
                                                    i34 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh12, zzdtVar5);
                                                    int i105 = zzdtVar5.zza;
                                                    if (i105 < 0) {
                                                        throw com.google.android.gms.internal.auth.zzfb.zzc();
                                                    }
                                                    if (i105 > bArr.length - i34) {
                                                        throw com.google.android.gms.internal.auth.zzfb.zzf();
                                                    }
                                                    if (i105 == 0) {
                                                        zzezVar.add(com.google.android.gms.internal.auth.zzef.zzb);
                                                    } else {
                                                        zzezVar.add(com.google.android.gms.internal.auth.zzef.zzk(bArr, i34, i105));
                                                        i34 += i105;
                                                    }
                                                } else {
                                                    i27 = i41;
                                                    i32 = i81;
                                                    i35 = i26;
                                                    i25 = i88;
                                                    i33 = i40;
                                                    i26 = i42;
                                                    i16 = i16;
                                                    unsafe4 = unsafe11;
                                                    i29 = i34;
                                                    unsafe3 = unsafe4;
                                                    i74 = i33;
                                                    i70 = i16;
                                                    i30 = i23;
                                                    i76 = i27;
                                                    i31 = i26;
                                                    i26 = i35;
                                                    i21 = i32;
                                                    i75 = i25;
                                                    i23 = i30;
                                                    i73 = i29;
                                                    if (i73 != i23) {
                                                    }
                                                }
                                            }
                                            i27 = i41;
                                            i32 = i81;
                                            i35 = i26;
                                            i25 = i88;
                                            i33 = i40;
                                            i26 = i42;
                                            i16 = i16;
                                            unsafe4 = unsafe11;
                                            i29 = i34;
                                            unsafe3 = unsafe4;
                                            i74 = i33;
                                            i70 = i16;
                                            i30 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            i26 = i35;
                                            i21 = i32;
                                            i75 = i25;
                                            i23 = i30;
                                            i73 = i29;
                                            if (i73 != i23) {
                                            }
                                        } else {
                                            i70 = i16;
                                            i25 = i88;
                                            unsafe3 = unsafe11;
                                            i24 = i39;
                                            i21 = i81;
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        int i106 = i88;
                                        if (i83 == 2) {
                                            zzj = com.google.android.gms.internal.auth.zzdu.zzf(bArr, i7, zzezVar, zzdtVar5);
                                            i23 = i7;
                                            i46 = i16;
                                            i44 = i86;
                                            i26 = i89;
                                            i45 = i87;
                                        } else if (i83 == 0) {
                                            i23 = i7;
                                            i44 = i86;
                                            i45 = i87;
                                            i46 = i16;
                                            i26 = i89;
                                            zzj = com.google.android.gms.internal.auth.zzdu.zzj(i106, bArr, i23, i2, zzezVar, zzdtVar);
                                        } else {
                                            i39 = i86;
                                            i26 = i89;
                                            i27 = i87;
                                            i23 = i7;
                                            i25 = i106;
                                            unsafe3 = unsafe11;
                                            i70 = i16;
                                            i24 = i39;
                                            i21 = i81;
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        com.google.android.gms.internal.auth.zzey zzq2 = zzgaVar.zzq(i44);
                                        com.google.android.gms.internal.auth.zzgz zzgzVar = zzgaVar.zzl;
                                        int i107 = com.google.android.gms.internal.auth.zzgk.zza;
                                        if (zzq2 == null) {
                                            i47 = zzj;
                                            i48 = i106;
                                        } else if (zzezVar instanceof java.util.RandomAccess) {
                                            int size2 = zzezVar.size();
                                            i47 = zzj;
                                            java.lang.Object obj6 = null;
                                            int i108 = 0;
                                            int i109 = 0;
                                            while (i108 < size2) {
                                                int i110 = i106;
                                                int intValue = ((java.lang.Integer) zzezVar.get(i108)).intValue();
                                                if (zzq2.zza()) {
                                                    if (i108 != i109) {
                                                        zzezVar.set(i109, java.lang.Integer.valueOf(intValue));
                                                    }
                                                    i109++;
                                                } else {
                                                    obj6 = com.google.android.gms.internal.auth.zzgk.zzc(obj4, i81, intValue, obj6, zzgzVar);
                                                }
                                                i108++;
                                                i106 = i110;
                                            }
                                            i48 = i106;
                                            if (i109 != size2) {
                                                zzezVar.subList(i109, size2).clear();
                                            }
                                        } else {
                                            i47 = zzj;
                                            i48 = i106;
                                            java.util.Iterator it = zzezVar.iterator();
                                            java.lang.Object obj7 = null;
                                            while (it.hasNext()) {
                                                int intValue2 = ((java.lang.Integer) it.next()).intValue();
                                                if (!zzq2.zza()) {
                                                    obj7 = com.google.android.gms.internal.auth.zzgk.zzc(obj4, i81, intValue2, obj7, zzgzVar);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        i73 = i47;
                                        i70 = i46;
                                        i74 = i44;
                                        i21 = i81;
                                        i76 = i45;
                                        i31 = i26;
                                        i75 = i48;
                                        unsafe3 = unsafe11;
                                        if (i73 != i23) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i49 = i88;
                                        if (i83 == 2) {
                                            com.google.android.gms.internal.auth.zzew zzewVar3 = (com.google.android.gms.internal.auth.zzew) zzezVar;
                                            zzh = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                            int i111 = zzdtVar5.zza + zzh;
                                            while (zzh < i111) {
                                                zzh = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh, zzdtVar5);
                                                zzewVar3.zze(com.google.android.gms.internal.auth.zzej.zzb(zzdtVar5.zza));
                                            }
                                            if (zzh != i111) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzf();
                                            }
                                        } else {
                                            if (i83 == 0) {
                                                com.google.android.gms.internal.auth.zzew zzewVar4 = (com.google.android.gms.internal.auth.zzew) zzezVar;
                                                zzh = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                                zzewVar4.zze(com.google.android.gms.internal.auth.zzej.zzb(zzdtVar5.zza));
                                                while (zzh < i16) {
                                                    int zzh13 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh, zzdtVar5);
                                                    if (i49 == zzdtVar5.zza) {
                                                        zzh = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh13, zzdtVar5);
                                                        zzewVar4.zze(com.google.android.gms.internal.auth.zzej.zzb(zzdtVar5.zza));
                                                    }
                                                }
                                            }
                                            i23 = i7;
                                            i21 = i81;
                                            i25 = i49;
                                            i24 = i86;
                                            i26 = i89;
                                            i27 = i87;
                                            unsafe3 = unsafe11;
                                            i70 = i16;
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        i23 = i7;
                                        i73 = zzh;
                                        i21 = i81;
                                        i75 = i49;
                                        i74 = i86;
                                        i26 = i89;
                                        i76 = i87;
                                        unsafe3 = unsafe11;
                                        i70 = i16;
                                        i31 = i26;
                                        if (i73 != i23) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i83 == 2) {
                                            com.google.android.gms.internal.auth.zzfm zzfmVar5 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                            zzh = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                            int i112 = zzdtVar5.zza + zzh;
                                            while (zzh < i112) {
                                                zzh = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzh, zzdtVar5);
                                                zzfmVar5.zze(com.google.android.gms.internal.auth.zzej.zzc(zzdtVar5.zzb));
                                            }
                                            if (zzh != i112) {
                                                throw com.google.android.gms.internal.auth.zzfb.zzf();
                                            }
                                        } else if (i83 == 0) {
                                            com.google.android.gms.internal.auth.zzfm zzfmVar6 = (com.google.android.gms.internal.auth.zzfm) zzezVar;
                                            zzh = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i7, zzdtVar5);
                                            zzfmVar6.zze(com.google.android.gms.internal.auth.zzej.zzc(zzdtVar5.zzb));
                                            while (zzh < i16) {
                                                int zzh14 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, zzh, zzdtVar5);
                                                i49 = i88;
                                                if (i49 == zzdtVar5.zza) {
                                                    zzh = com.google.android.gms.internal.auth.zzdu.zzk(bArr, zzh14, zzdtVar5);
                                                    zzfmVar6.zze(com.google.android.gms.internal.auth.zzej.zzc(zzdtVar5.zzb));
                                                    i88 = i49;
                                                } else {
                                                    i23 = i7;
                                                    i73 = zzh;
                                                    i21 = i81;
                                                    i75 = i49;
                                                    i74 = i86;
                                                    i26 = i89;
                                                    i76 = i87;
                                                    unsafe3 = unsafe11;
                                                    i70 = i16;
                                                    i31 = i26;
                                                    if (i73 != i23) {
                                                    }
                                                }
                                            }
                                        } else {
                                            i49 = i88;
                                            i23 = i7;
                                            i21 = i81;
                                            i25 = i49;
                                            i24 = i86;
                                            i26 = i89;
                                            i27 = i87;
                                            unsafe3 = unsafe11;
                                            i70 = i16;
                                            i75 = i25;
                                            i74 = i24;
                                            i73 = i23;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        i49 = i88;
                                        i23 = i7;
                                        i73 = zzh;
                                        i21 = i81;
                                        i75 = i49;
                                        i74 = i86;
                                        i26 = i89;
                                        i76 = i87;
                                        unsafe3 = unsafe11;
                                        i70 = i16;
                                        i31 = i26;
                                        if (i73 != i23) {
                                        }
                                        break;
                                    default:
                                        i23 = i7;
                                        i70 = i16;
                                        i21 = i81;
                                        i24 = i86;
                                        i25 = i88;
                                        i26 = i89;
                                        i27 = i87;
                                        unsafe3 = unsafe11;
                                        if (i83 == 3) {
                                            com.google.android.gms.internal.auth.zzgi zzr = zzgaVar.zzr(i24);
                                            int i113 = (i25 & (-8)) | 4;
                                            i73 = com.google.android.gms.internal.auth.zzdu.zzc(zzr, bArr, i23, i2, i113, zzdtVar);
                                            zzezVar.add(zzdtVar5.zzc);
                                            while (i73 < i70) {
                                                int zzh15 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i73, zzdtVar5);
                                                if (i25 == zzdtVar5.zza) {
                                                    i73 = com.google.android.gms.internal.auth.zzdu.zzc(zzr, bArr, zzh15, i2, i113, zzdtVar);
                                                    zzezVar.add(zzdtVar5.zzc);
                                                } else {
                                                    i75 = i25;
                                                    i74 = i24;
                                                    i76 = i27;
                                                    i31 = i26;
                                                    if (i73 != i23) {
                                                    }
                                                }
                                            }
                                            i75 = i25;
                                            i74 = i24;
                                            i76 = i27;
                                            i31 = i26;
                                            if (i73 != i23) {
                                            }
                                        }
                                        i75 = i25;
                                        i74 = i24;
                                        i73 = i23;
                                        i76 = i27;
                                        i31 = i26;
                                        if (i73 != i23) {
                                        }
                                        break;
                                }
                            }
                        } else if (i83 == 2) {
                            com.google.android.gms.internal.auth.zzez zzezVar3 = (com.google.android.gms.internal.auth.zzez) unsafe7.getObject(obj4, j);
                            if (!zzezVar3.zzc()) {
                                int size3 = zzezVar3.size();
                                zzezVar3 = zzezVar3.zzd(size3 != 0 ? size3 + size3 : 10);
                                unsafe7.putObject(obj4, j, zzezVar3);
                            }
                            i73 = com.google.android.gms.internal.auth.zzdu.zze(zzgaVar.zzr(i86), i88, bArr, i7, i2, zzezVar3, zzdtVar);
                            i21 = i81;
                            unsafe3 = unsafe7;
                            zzdtVar5 = zzdtVar5;
                            i74 = i86;
                            i70 = i16;
                            i75 = i88;
                            i78 = i89;
                            i76 = i87;
                            obj4 = obj;
                            i71 = i3;
                            unsafe7 = unsafe3;
                            i77 = i21;
                            i72 = i14;
                        } else {
                            i13 = i81;
                            unsafe2 = unsafe7;
                            i18 = i88;
                            i12 = i89;
                            i11 = i87;
                            i19 = i7;
                            i20 = i86;
                            i22 = i20;
                            i75 = i18;
                            i73 = i19;
                            i76 = i11;
                            i4 = i3;
                            i10 = i73;
                            i15 = i22;
                            i17 = i75;
                            i11 = i76;
                        }
                    } else {
                        int i114 = iArr[i9 + 2];
                        int i115 = 1 << (i114 >>> 20);
                        int i116 = 1048575;
                        int i117 = i114 & 1048575;
                        if (i117 != i78) {
                            if (i78 != 1048575) {
                                unsafe7.putInt(obj4, i78, i76);
                                i116 = 1048575;
                            }
                            i55 = i117 == i116 ? 0 : unsafe7.getInt(obj4, i117);
                            i54 = i117;
                        } else {
                            i55 = i76;
                            i54 = i78;
                        }
                        switch (zzn) {
                            case 0:
                                i56 = i9;
                                i57 = i85;
                                i58 = 0;
                                if (i83 != 1) {
                                    i16 = i2;
                                    i14 = i58;
                                    i66 = i57;
                                    i9 = i56;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    com.google.android.gms.internal.auth.zzhj.zzl(obj4, j, java.lang.Double.longBitsToDouble(com.google.android.gms.internal.auth.zzdu.zzn(bArr, i7)));
                                    i59 = i7 + 8;
                                    i60 = i55 | i115;
                                    i61 = i2;
                                    i14 = i58;
                                    i62 = i57;
                                    i74 = i56;
                                    unsafe5 = unsafe7;
                                    i63 = i81;
                                    i64 = i59;
                                    zzdtVar4 = zzdtVar5;
                                    zzdtVar5 = zzdtVar4;
                                    i21 = i63;
                                    i70 = i61;
                                    i73 = i64;
                                    i75 = i62;
                                    i78 = i54;
                                    unsafe3 = unsafe5;
                                    i76 = i60;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                            case 1:
                                i56 = i9;
                                i57 = i85;
                                i58 = 0;
                                if (i83 != 5) {
                                    i16 = i2;
                                    i14 = i58;
                                    i66 = i57;
                                    i9 = i56;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    com.google.android.gms.internal.auth.zzhj.zzm(obj4, j, java.lang.Float.intBitsToFloat(com.google.android.gms.internal.auth.zzdu.zzb(bArr, i7)));
                                    i59 = i7 + 4;
                                    i60 = i55 | i115;
                                    i61 = i2;
                                    i14 = i58;
                                    i62 = i57;
                                    i74 = i56;
                                    unsafe5 = unsafe7;
                                    i63 = i81;
                                    i64 = i59;
                                    zzdtVar4 = zzdtVar5;
                                    zzdtVar5 = zzdtVar4;
                                    i21 = i63;
                                    i70 = i61;
                                    i73 = i64;
                                    i75 = i62;
                                    i78 = i54;
                                    unsafe3 = unsafe5;
                                    i76 = i60;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                            case 2:
                            case 3:
                                i56 = i9;
                                i57 = i85;
                                i58 = 0;
                                if (i83 != 0) {
                                    i16 = i2;
                                    i14 = i58;
                                    i66 = i57;
                                    i9 = i56;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    int zzk4 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i7, zzdtVar5);
                                    unsafe7.putLong(obj, j, zzdtVar5.zzb);
                                    i70 = i2;
                                    i76 = i55 | i115;
                                    i14 = 0;
                                    i75 = i57;
                                    i74 = i56;
                                    unsafe3 = unsafe7;
                                    i73 = zzk4;
                                    i21 = i81;
                                    i78 = i54;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                            case 4:
                            case 11:
                                i56 = i9;
                                i57 = i85;
                                i58 = 0;
                                if (i83 != 0) {
                                    i16 = i2;
                                    i14 = i58;
                                    i66 = i57;
                                    i9 = i56;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    i73 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                    unsafe7.putInt(obj4, j, zzdtVar5.zza);
                                    i70 = i2;
                                    i76 = i55 | i115;
                                    i14 = i58;
                                    i75 = i57;
                                    i74 = i56;
                                    unsafe3 = unsafe7;
                                    i21 = i81;
                                    i78 = i54;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                            case 5:
                            case 14:
                                int i118 = i7;
                                i56 = i9;
                                i57 = i85;
                                i58 = 0;
                                if (i83 != 1) {
                                    i7 = i118;
                                    i16 = i2;
                                    i14 = i58;
                                    i66 = i57;
                                    i9 = i56;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    unsafe7.putLong(obj, j, com.google.android.gms.internal.auth.zzdu.zzn(bArr, i118));
                                    i73 = i118 + 8;
                                    i70 = i2;
                                    i76 = i55 | i115;
                                    i14 = i58;
                                    i75 = i57;
                                    i74 = i56;
                                    unsafe3 = unsafe7;
                                    i21 = i81;
                                    i78 = i54;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                            case 6:
                            case 13:
                                i65 = i7;
                                i56 = i9;
                                i57 = i85;
                                i58 = 0;
                                if (i83 != 5) {
                                    i16 = i2;
                                    i7 = i65;
                                    i14 = i58;
                                    i66 = i57;
                                    i9 = i56;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    unsafe7.putInt(obj4, j, com.google.android.gms.internal.auth.zzdu.zzb(bArr, i65));
                                    i73 = i65 + 4;
                                    i70 = i2;
                                    i76 = i55 | i115;
                                    i14 = i58;
                                    i75 = i57;
                                    i74 = i56;
                                    unsafe3 = unsafe7;
                                    i21 = i81;
                                    i78 = i54;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                            case 7:
                                i65 = i7;
                                i56 = i9;
                                i57 = i85;
                                i58 = 0;
                                if (i83 != 0) {
                                    i16 = i2;
                                    i7 = i65;
                                    i14 = i58;
                                    i66 = i57;
                                    i9 = i56;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    i73 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i65, zzdtVar5);
                                    com.google.android.gms.internal.auth.zzhj.zzk(obj4, j, zzdtVar5.zzb != 0);
                                    i70 = i2;
                                    i76 = i55 | i115;
                                    i14 = i58;
                                    i75 = i57;
                                    i74 = i56;
                                    unsafe3 = unsafe7;
                                    i21 = i81;
                                    i78 = i54;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                            case 8:
                                i65 = i7;
                                i56 = i9;
                                i57 = i85;
                                if (i83 != 2) {
                                    i58 = 0;
                                    i16 = i2;
                                    i7 = i65;
                                    i14 = i58;
                                    i66 = i57;
                                    i9 = i56;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    if ((i84 & 536870912) != 0) {
                                        i73 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i65, zzdtVar5);
                                        int i119 = zzdtVar5.zza;
                                        if (i119 < 0) {
                                            throw com.google.android.gms.internal.auth.zzfb.zzc();
                                        }
                                        if (i119 == 0) {
                                            zzdtVar5.zzc = "";
                                            i58 = 0;
                                        } else {
                                            int i120 = com.google.android.gms.internal.auth.zzhn.zza;
                                            int length = bArr.length;
                                            if ((((length - i73) - i119) | i73 | i119) < 0) {
                                                throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i73), java.lang.Integer.valueOf(i119)));
                                            }
                                            int i121 = i73 + i119;
                                            char[] cArr = new char[i119];
                                            int i122 = 0;
                                            while (i73 < i121) {
                                                byte b = bArr[i73];
                                                if (com.google.android.gms.internal.auth.zzhk.zzd(b)) {
                                                    i73++;
                                                    cArr[i122] = (char) b;
                                                    i122++;
                                                } else {
                                                    while (i73 < i121) {
                                                        int i123 = i73 + 1;
                                                        byte b2 = bArr[i73];
                                                        if (com.google.android.gms.internal.auth.zzhk.zzd(b2)) {
                                                            cArr[i122] = (char) b2;
                                                            i122++;
                                                            i73 = i123;
                                                            while (i73 < i121) {
                                                                byte b3 = bArr[i73];
                                                                if (com.google.android.gms.internal.auth.zzhk.zzd(b3)) {
                                                                    i73++;
                                                                    cArr[i122] = (char) b3;
                                                                    i122++;
                                                                }
                                                            }
                                                        } else {
                                                            if (b2 < -32) {
                                                                if (i123 >= i121) {
                                                                    throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                                }
                                                                com.google.android.gms.internal.auth.zzhk.zzc(b2, bArr[i123], cArr, i122);
                                                                i73 += 2;
                                                            } else if (b2 < -16) {
                                                                if (i123 >= i121 - 1) {
                                                                    throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                                }
                                                                com.google.android.gms.internal.auth.zzhk.zzb(b2, bArr[i123], bArr[i73 + 2], cArr, i122);
                                                                i73 += 3;
                                                            } else {
                                                                if (i123 >= i121 - 2) {
                                                                    throw com.google.android.gms.internal.auth.zzfb.zzb();
                                                                }
                                                                com.google.android.gms.internal.auth.zzhk.zza(b2, bArr[i123], bArr[i73 + 2], bArr[i73 + 3], cArr, i122);
                                                                i122 += 2;
                                                                i73 += 4;
                                                            }
                                                            i122++;
                                                        }
                                                    }
                                                    i58 = 0;
                                                    zzdtVar5.zzc = new java.lang.String(cArr, 0, i122);
                                                    i73 = i121;
                                                }
                                            }
                                            while (i73 < i121) {
                                            }
                                            i58 = 0;
                                            zzdtVar5.zzc = new java.lang.String(cArr, 0, i122);
                                            i73 = i121;
                                        }
                                    } else {
                                        i58 = 0;
                                        i73 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i65, zzdtVar5);
                                        int i124 = zzdtVar5.zza;
                                        if (i124 < 0) {
                                            throw com.google.android.gms.internal.auth.zzfb.zzc();
                                        }
                                        if (i124 == 0) {
                                            zzdtVar5.zzc = "";
                                        } else {
                                            zzdtVar5.zzc = new java.lang.String(bArr, i73, i124, com.google.android.gms.internal.auth.zzfa.zzb);
                                            i73 += i124;
                                        }
                                    }
                                    unsafe7.putObject(obj4, j, zzdtVar5.zzc);
                                    i70 = i2;
                                    i76 = i55 | i115;
                                    i14 = i58;
                                    i75 = i57;
                                    i74 = i56;
                                    unsafe3 = unsafe7;
                                    i21 = i81;
                                    i78 = i54;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                                break;
                            case 9:
                                i67 = i9;
                                i68 = i85;
                                if (i83 != 2) {
                                    i16 = i2;
                                    i7 = i7;
                                    i66 = i68;
                                    i9 = i67;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i14 = 0;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    java.lang.Object zzt = zzgaVar.zzt(obj4, i67);
                                    i73 = com.google.android.gms.internal.auth.zzdu.zzm(zzt, zzgaVar.zzr(i67), bArr, i7, i2, zzdtVar);
                                    zzgaVar.zzB(obj4, i67, zzt);
                                    i16 = i2;
                                    i11 = i55 | i115;
                                    i15 = i67;
                                    unsafe2 = unsafe7;
                                    zzdtVar2 = zzdtVar5;
                                    i13 = i81;
                                    i14 = 0;
                                    i51 = i68;
                                    zzgaVar = this;
                                    i71 = i3;
                                    i77 = i13;
                                    zzdtVar5 = zzdtVar2;
                                    i70 = i16;
                                    i76 = i11;
                                    i72 = i14;
                                    i75 = i51;
                                    i74 = i15;
                                    unsafe7 = unsafe2;
                                    i78 = i54;
                                }
                            case 10:
                                i67 = i9;
                                i68 = i85;
                                if (i83 != 2) {
                                    i16 = i2;
                                    i7 = i7;
                                    i66 = i68;
                                    i9 = i67;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i14 = 0;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    zzk3 = com.google.android.gms.internal.auth.zzdu.zza(bArr, i7, zzdtVar5);
                                    unsafe7.putObject(obj4, j, zzdtVar5.zzc);
                                    i16 = i2;
                                    i11 = i55 | i115;
                                    i73 = zzk3;
                                    i15 = i67;
                                    unsafe2 = unsafe7;
                                    zzdtVar2 = zzdtVar5;
                                    i13 = i81;
                                    i14 = 0;
                                    i51 = i68;
                                    zzgaVar = this;
                                    i71 = i3;
                                    i77 = i13;
                                    zzdtVar5 = zzdtVar2;
                                    i70 = i16;
                                    i76 = i11;
                                    i72 = i14;
                                    i75 = i51;
                                    i74 = i15;
                                    unsafe7 = unsafe2;
                                    i78 = i54;
                                }
                            case 12:
                                i67 = i9;
                                i68 = i85;
                                if (i83 != 0) {
                                    i16 = i2;
                                    i7 = i7;
                                    i66 = i68;
                                    i9 = i67;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i14 = 0;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    zzk3 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                    int i125 = zzdtVar5.zza;
                                    com.google.android.gms.internal.auth.zzey zzq3 = zzgaVar.zzq(i67);
                                    if ((i84 & Integer.MIN_VALUE) == 0 || zzq3 == null || zzq3.zza()) {
                                        unsafe7.putInt(obj4, j, i125);
                                        i16 = i2;
                                        i11 = i55 | i115;
                                        i73 = zzk3;
                                        i15 = i67;
                                        unsafe2 = unsafe7;
                                        zzdtVar2 = zzdtVar5;
                                        i13 = i81;
                                        i14 = 0;
                                        i51 = i68;
                                        zzgaVar = this;
                                        i71 = i3;
                                        i77 = i13;
                                        zzdtVar5 = zzdtVar2;
                                        i70 = i16;
                                        i76 = i11;
                                        i72 = i14;
                                        i75 = i51;
                                        i74 = i15;
                                        unsafe7 = unsafe2;
                                        i78 = i54;
                                    } else {
                                        zzc(obj).zzh(i68, java.lang.Long.valueOf(i125));
                                        i70 = i2;
                                        i73 = zzk3;
                                        i75 = i68;
                                        i74 = i67;
                                        unsafe3 = unsafe7;
                                        i21 = i81;
                                        i76 = i55;
                                        i78 = i54;
                                        i14 = 0;
                                        obj4 = obj;
                                        i71 = i3;
                                        unsafe7 = unsafe3;
                                        i77 = i21;
                                        i72 = i14;
                                    }
                                }
                                break;
                            case 15:
                                i67 = i9;
                                i68 = i85;
                                if (i83 != 0) {
                                    i16 = i2;
                                    i7 = i7;
                                    i66 = i68;
                                    i9 = i67;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i14 = 0;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    i73 = com.google.android.gms.internal.auth.zzdu.zzh(bArr, i7, zzdtVar5);
                                    unsafe7.putInt(obj4, j, com.google.android.gms.internal.auth.zzej.zzb(zzdtVar5.zza));
                                    i16 = i2;
                                    i11 = i55 | i115;
                                    i15 = i67;
                                    unsafe2 = unsafe7;
                                    zzdtVar2 = zzdtVar5;
                                    i13 = i81;
                                    i14 = 0;
                                    i51 = i68;
                                    zzgaVar = this;
                                    i71 = i3;
                                    i77 = i13;
                                    zzdtVar5 = zzdtVar2;
                                    i70 = i16;
                                    i76 = i11;
                                    i72 = i14;
                                    i75 = i51;
                                    i74 = i15;
                                    unsafe7 = unsafe2;
                                    i78 = i54;
                                }
                            case 16:
                                if (i83 != 0) {
                                    i16 = i2;
                                    i66 = i85;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i14 = 0;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    zzk3 = com.google.android.gms.internal.auth.zzdu.zzk(bArr, i7, zzdtVar5);
                                    i67 = i9;
                                    i68 = i85;
                                    unsafe7.putLong(obj, j, com.google.android.gms.internal.auth.zzej.zzc(zzdtVar5.zzb));
                                    i55 |= i115;
                                    i70 = i2;
                                    i73 = zzk3;
                                    i75 = i68;
                                    i74 = i67;
                                    unsafe3 = unsafe7;
                                    i21 = i81;
                                    i76 = i55;
                                    i78 = i54;
                                    i14 = 0;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                            default:
                                i56 = i9;
                                i57 = i85;
                                i58 = 0;
                                if (i83 != 3) {
                                    i16 = i2;
                                    i14 = i58;
                                    i66 = i57;
                                    i9 = i56;
                                    unsafe6 = unsafe7;
                                    i69 = i81;
                                    i4 = i3;
                                    i10 = i7;
                                    unsafe2 = unsafe6;
                                    i17 = i66;
                                    i11 = i55;
                                    i12 = i54;
                                    i15 = i9;
                                    i13 = i69;
                                    break;
                                } else {
                                    java.lang.Object zzt2 = zzgaVar.zzt(obj4, i56);
                                    i63 = i81;
                                    i14 = 0;
                                    i74 = i56;
                                    unsafe5 = unsafe7;
                                    int i126 = i7;
                                    zzdtVar4 = zzdtVar5;
                                    i61 = i2;
                                    i62 = i57;
                                    i64 = com.google.android.gms.internal.auth.zzdu.zzl(zzt2, zzgaVar.zzr(i56), bArr, i126, i2, (i81 << 3) | 4, zzdtVar);
                                    zzgaVar.zzB(obj4, i74, zzt2);
                                    i60 = i55 | i115;
                                    zzdtVar5 = zzdtVar4;
                                    i21 = i63;
                                    i70 = i61;
                                    i73 = i64;
                                    i75 = i62;
                                    i78 = i54;
                                    unsafe3 = unsafe5;
                                    i76 = i60;
                                    obj4 = obj;
                                    i71 = i3;
                                    unsafe7 = unsafe3;
                                    i77 = i21;
                                    i72 = i14;
                                }
                        }
                    }
                } else {
                    i10 = i7;
                    i11 = i76;
                    i12 = i78;
                    i13 = i81;
                    i14 = i72;
                    i15 = i14;
                    unsafe2 = unsafe7;
                    i4 = i71;
                    i16 = i70;
                    i17 = i6;
                }
                if (i17 != i4 || i4 == 0) {
                    i73 = com.google.android.gms.internal.auth.zzdu.zzg(i17, bArr, i10, i2, zzc(obj), zzdtVar);
                    zzdtVar5 = zzdtVar;
                    i75 = i17;
                    i71 = i4;
                    i70 = i16;
                    i77 = i13;
                    i76 = i11;
                    i72 = i14;
                    i78 = i12;
                    i74 = i15;
                    unsafe7 = unsafe2;
                    zzgaVar = this;
                } else {
                    i73 = i10;
                    i5 = i16;
                    i75 = i17;
                    i76 = i11;
                    i78 = i12;
                    unsafe = unsafe2;
                }
            } else {
                unsafe = unsafe7;
                i4 = i71;
                i5 = i70;
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
                int zzn = zzn(zzo);
                long j = zzo & 1048575;
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
            long j = zzo & 1048575;
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
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzi) {
            int i6 = this.zzh[i4];
            int i7 = this.zzc[i6];
            int zzo = zzo(i6);
            int i8 = this.zzc[i6 + 2];
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
            i4++;
            i5 = i;
            i3 = i2;
        }
        return true;
    }

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
}
