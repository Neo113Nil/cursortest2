package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzgh<T> implements com.google.android.gms.internal.play_games_inputmapping.zzgp<T> {
    private static final int[] zza = new int[0];
    private static final sun.misc.Unsafe zzb = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzq();
    private final int[] zzc;
    private final java.lang.Object[] zzd;
    private final com.google.android.gms.internal.play_games_inputmapping.zzge zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final com.google.android.gms.internal.play_games_inputmapping.zzfs zzk;
    private final com.google.android.gms.internal.play_games_inputmapping.zzhd zzl;
    private final com.google.android.gms.internal.play_games_inputmapping.zzes zzm;
    private final com.google.android.gms.internal.play_games_inputmapping.zzgj zzn;
    private final com.google.android.gms.internal.play_games_inputmapping.zzfz zzo;

    private zzgh(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.play_games_inputmapping.zzge zzgeVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, com.google.android.gms.internal.play_games_inputmapping.zzgj zzgjVar, com.google.android.gms.internal.play_games_inputmapping.zzfs zzfsVar, com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar, com.google.android.gms.internal.play_games_inputmapping.zzes zzesVar, com.google.android.gms.internal.play_games_inputmapping.zzfz zzfzVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzg = z;
        boolean z3 = false;
        if (zzesVar != null && zzesVar.zza(zzgeVar)) {
            z3 = true;
        }
        this.zzf = z3;
        this.zzh = iArr2;
        this.zzi = i3;
        this.zzj = i4;
        this.zzn = zzgjVar;
        this.zzk = zzfsVar;
        this.zzl = zzhdVar;
        this.zzm = zzesVar;
        this.zze = zzgeVar;
        this.zzo = zzfzVar;
    }

    private static boolean zzA(java.lang.Object obj, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j)).booleanValue();
    }

    private final boolean zzB(java.lang.Object obj, java.lang.Object obj2, int i) {
        return zzD(obj, i) == zzD(obj2, i);
    }

    private final boolean zzC(java.lang.Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzD(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzD(java.lang.Object obj, int i) {
        int zzu = zzu(i);
        long j = zzu & 1048575;
        if (j != 1048575) {
            return (com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j) & (1 << (zzu >>> 20))) != 0;
        }
        int zzt = zzt(i);
        long j2 = zzt & 1048575;
        switch (zzv(zzt)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzl(obj, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzj(obj, j2)) != 0;
            case 2:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j2) != 0;
            case 3:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j2) != 0;
            case 4:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j2) != 0;
            case 5:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j2) != 0;
            case 6:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j2) != 0;
            case 7:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzh(obj, j2);
            case 8:
                java.lang.Object zzn = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j2);
                if (zzn instanceof java.lang.String) {
                    return !((java.lang.String) zzn).isEmpty();
                }
                if (zzn instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) {
                    return !com.google.android.gms.internal.play_games_inputmapping.zzek.zzb.equals(zzn);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j2) != null;
            case 10:
                return !com.google.android.gms.internal.play_games_inputmapping.zzek.zzb.equals(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j2));
            case 11:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j2) != 0;
            case 12:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j2) != 0;
            case 13:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j2) != 0;
            case 14:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j2) != 0;
            case 15:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j2) != 0;
            case 16:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j2) != 0;
            case 17:
                return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    private final void zzE(java.lang.Object obj, int i) {
        int zzu = zzu(i);
        long j = 1048575 & zzu;
        if (j == 1048575) {
            return;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhn.zze(obj, j, (1 << (zzu >>> 20)) | com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j));
    }

    private final boolean zzF(java.lang.Object obj, int i, int i2) {
        return com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, (long) (zzu(i2) & 1048575)) == i;
    }

    private final void zzG(java.lang.Object obj, int i, int i2) {
        com.google.android.gms.internal.play_games_inputmapping.zzhn.zze(obj, zzu(i2) & 1048575, i);
    }

    private static final void zzH(int i, java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zzhuVar.zzm(i, (java.lang.String) obj);
        } else {
            zzhuVar.zzn(i, (com.google.android.gms.internal.play_games_inputmapping.zzek) obj);
        }
    }

    static com.google.android.gms.internal.play_games_inputmapping.zzgh zzh(java.lang.Class cls, com.google.android.gms.internal.play_games_inputmapping.zzgb zzgbVar, com.google.android.gms.internal.play_games_inputmapping.zzgj zzgjVar, com.google.android.gms.internal.play_games_inputmapping.zzfs zzfsVar, com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar, com.google.android.gms.internal.play_games_inputmapping.zzes zzesVar, com.google.android.gms.internal.play_games_inputmapping.zzfz zzfzVar) {
        if (zzgbVar instanceof com.google.android.gms.internal.play_games_inputmapping.zzgo) {
            return zzi((com.google.android.gms.internal.play_games_inputmapping.zzgo) zzgbVar, zzgjVar, zzfsVar, zzhdVar, zzesVar, zzfzVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.google.android.gms.internal.play_games_inputmapping.zzgh zzi(com.google.android.gms.internal.play_games_inputmapping.zzgo zzgoVar, com.google.android.gms.internal.play_games_inputmapping.zzgj zzgjVar, com.google.android.gms.internal.play_games_inputmapping.zzfs zzfsVar, com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar, com.google.android.gms.internal.play_games_inputmapping.zzes zzesVar, com.google.android.gms.internal.play_games_inputmapping.zzfz zzfzVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        int i20;
        java.lang.Object[] objArr;
        java.lang.String str;
        int i21;
        int i22;
        int i23;
        java.lang.reflect.Field zzj;
        char charAt12;
        int i24;
        int i25;
        int i26;
        java.lang.Object obj;
        java.lang.reflect.Field zzj2;
        java.lang.Object obj2;
        java.lang.reflect.Field zzj3;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        int i30;
        char charAt16;
        boolean z = zzgoVar.zzc() == 2;
        java.lang.String zzd = zzgoVar.zzd();
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
        int charAt17 = zzd.charAt(i);
        if (charAt17 >= 55296) {
            int i33 = charAt17 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt16 = zzd.charAt(i32);
                if (charAt16 < 55296) {
                    break;
                }
                i33 |= (charAt16 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt17 = i33 | (charAt16 << i34);
            i32 = i30;
        }
        if (charAt17 == 0) {
            iArr = zza;
            i3 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt18 = zzd.charAt(i32);
            if (charAt18 >= 55296) {
                int i36 = charAt18 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    charAt11 = zzd.charAt(i35);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i36 |= (charAt11 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                charAt18 = i36 | (charAt11 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int charAt19 = zzd.charAt(i35);
            if (charAt19 >= 55296) {
                int i39 = charAt19 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    charAt10 = zzd.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                charAt19 = i39 | (charAt10 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            charAt = zzd.charAt(i38);
            if (charAt >= 55296) {
                int i42 = charAt & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                charAt = i42 | (charAt9 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            int charAt20 = zzd.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                charAt20 = i45 | (charAt8 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            charAt2 = zzd.charAt(i44);
            if (charAt2 >= 55296) {
                int i48 = charAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                charAt2 = i48 | (charAt7 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int charAt21 = zzd.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                charAt21 = i51 | (charAt6 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int charAt22 = zzd.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                charAt22 = i54 | (charAt5 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            charAt3 = zzd.charAt(i53);
            if (charAt3 >= 55296) {
                int i57 = charAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                charAt3 = i57 | (charAt4 << i58);
                i56 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i32 = i56;
            int i59 = charAt21;
            i4 = charAt20;
            i5 = i59;
        }
        sun.misc.Unsafe unsafe = zzb;
        java.lang.Object[] zze = zzgoVar.zze();
        java.lang.Class<?> cls = zzgoVar.zzb().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        java.lang.Object[] objArr2 = new java.lang.Object[charAt2 + charAt2];
        int i60 = charAt3 + i5;
        int i61 = charAt3;
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
                    charAt15 = zzd.charAt(i67);
                    if (charAt15 < c) {
                        break;
                    }
                    i66 |= (charAt15 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                charAt23 = i66 | (charAt15 << i68);
                i14 = i29;
            } else {
                i14 = i65;
            }
            int i69 = i14 + 1;
            int charAt24 = zzd.charAt(i14);
            if (charAt24 >= c) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt14 = zzd.charAt(i71);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i15;
                }
                charAt24 = i70 | (charAt14 << i72);
                i16 = i28;
            } else {
                i15 = length;
                i16 = i69;
            }
            int i73 = charAt24 & 255;
            int i74 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i73 >= 51) {
                int i75 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i27 = i77 + 1;
                        charAt13 = zzd.charAt(i77);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i78;
                        i78 += 13;
                        i77 = i27;
                        i4 = i18;
                    }
                    charAt25 = i76 | (charAt13 << i78);
                    i25 = i27;
                } else {
                    i18 = i4;
                    i25 = i75;
                }
                int i79 = i73 - 51;
                int i80 = i25;
                if (i79 == 9 || i79 == 17) {
                    int i81 = i63 / 3;
                    i26 = i2 + 1;
                    objArr2[i81 + i81 + 1] = zze[i2];
                } else {
                    if (i79 == 12 && !z) {
                        int i82 = i63 / 3;
                        i26 = i2 + 1;
                        objArr2[i82 + i82 + 1] = zze[i2];
                    }
                    int i83 = charAt25 + charAt25;
                    obj = zze[i83];
                    if (obj instanceof java.lang.reflect.Field) {
                        zzj2 = zzj(cls, (java.lang.String) obj);
                        zze[i83] = zzj2;
                    } else {
                        zzj2 = (java.lang.reflect.Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzj2);
                    int i84 = i83 + 1;
                    obj2 = zze[i84];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        zzj3 = zzj(cls, (java.lang.String) obj2);
                        zze[i84] = zzj3;
                    } else {
                        zzj3 = (java.lang.reflect.Field) obj2;
                    }
                    str = zzd;
                    i21 = i3;
                    objArr = objArr2;
                    i19 = i2;
                    i22 = i80;
                    i20 = (int) unsafe.objectFieldOffset(zzj3);
                    objectFieldOffset = objectFieldOffset2;
                    i23 = 0;
                }
                i2 = i26;
                int i832 = charAt25 + charAt25;
                obj = zze[i832];
                if (obj instanceof java.lang.reflect.Field) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzj2);
                int i842 = i832 + 1;
                obj2 = zze[i842];
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                str = zzd;
                i21 = i3;
                objArr = objArr2;
                i19 = i2;
                i22 = i80;
                i20 = (int) unsafe.objectFieldOffset(zzj3);
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i85 = i2 + 1;
                java.lang.reflect.Field zzj4 = zzj(cls, (java.lang.String) zze[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i86 = i63 / 3;
                    objArr2[i86 + i86 + 1] = zzj4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i87 = i63 / 3;
                        i24 = i2 + 2;
                        objArr2[i87 + i87 + 1] = zze[i85];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i88 = i63 / 3;
                            i24 = i2 + 2;
                            objArr2[i88 + i88 + 1] = zze[i85];
                        }
                    } else if (i73 == 50) {
                        int i89 = i61 + 1;
                        iArr[i61] = i63;
                        int i90 = i63 / 3;
                        int i91 = i90 + i90;
                        int i92 = i2 + 2;
                        objArr2[i91] = zze[i85];
                        if ((charAt24 & 2048) != 0) {
                            i85 = i2 + 3;
                            objArr2[i91 + 1] = zze[i92];
                            i61 = i89;
                        } else {
                            i61 = i89;
                            i19 = i92;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzj4);
                            i20 = 1048575;
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i73 > 17) {
                                str = zzd;
                                i21 = i3;
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
                                        charAt12 = zzd.charAt(i93);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i94 |= (charAt12 & 8191) << i95;
                                        i95 += 13;
                                        i93 = i22;
                                    }
                                    charAt26 = i94 | (charAt12 << i95);
                                } else {
                                    i22 = i93;
                                }
                                int i96 = i3 + i3 + (charAt26 / 32);
                                java.lang.Object obj3 = zze[i96];
                                str = zzd;
                                if (obj3 instanceof java.lang.reflect.Field) {
                                    zzj = (java.lang.reflect.Field) obj3;
                                } else {
                                    zzj = zzj(cls, (java.lang.String) obj3);
                                    zze[i96] = zzj;
                                }
                                i21 = i3;
                                i23 = charAt26 % 32;
                                i20 = (int) unsafe.objectFieldOffset(zzj);
                            }
                            if (i73 >= 18 && i73 <= 49) {
                                iArr[i62] = objectFieldOffset;
                                i62++;
                            }
                        }
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzj4);
                    i20 = 1048575;
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    i21 = i3;
                    i22 = i16;
                    i23 = 0;
                    if (i73 >= 18) {
                        iArr[i62] = objectFieldOffset;
                        i62++;
                    }
                }
                i19 = i85;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzj4);
                i20 = 1048575;
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                i21 = i3;
                i22 = i16;
                i23 = 0;
                if (i73 >= 18) {
                }
            }
            int i97 = i63 + 1;
            iArr2[i63] = charAt23;
            int i98 = i63 + 2;
            iArr2[i97] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | objectFieldOffset;
            i63 += 3;
            iArr2[i98] = (i23 << 20) | i20;
            i3 = i21;
            i2 = i19;
            charAt = i17;
            charAt3 = i74;
            i32 = i22;
            length = i15;
            objArr2 = objArr;
            zzd = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new com.google.android.gms.internal.play_games_inputmapping.zzgh(iArr3, objArr2, charAt, i4, zzgoVar.zzb(), z, false, iArr, charAt3, i60, zzgjVar, zzfsVar, zzhdVar, zzesVar, zzfzVar, null);
    }

    private static java.lang.reflect.Field zzj(java.lang.Class cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.String name = cls.getName();
            java.lang.String arrays = java.util.Arrays.toString(declaredFields);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 11 + java.lang.String.valueOf(name).length() + 29 + java.lang.String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    private final void zzk(java.lang.Object obj, java.lang.Object obj2, int i) {
        long zzt = zzt(i) & 1048575;
        if (zzD(obj2, i)) {
            java.lang.Object zzn = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt);
            java.lang.Object zzn2 = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, zzt);
            if (zzn != null && zzn2 != null) {
                com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, zzt, com.google.android.gms.internal.play_games_inputmapping.zzfi.zzi(zzn, zzn2));
                zzE(obj, i);
            } else if (zzn2 != null) {
                com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, zzt, zzn2);
                zzE(obj, i);
            }
        }
    }

    private final void zzl(java.lang.Object obj, java.lang.Object obj2, int i) {
        int zzt = zzt(i);
        int i2 = this.zzc[i];
        long j = zzt & 1048575;
        if (zzF(obj2, i2, i)) {
            java.lang.Object zzn = zzF(obj, i2, i) ? com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j) : null;
            java.lang.Object zzn2 = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j);
            if (zzn != null && zzn2 != null) {
                com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzfi.zzi(zzn, zzn2));
                zzG(obj, i2, i);
            } else if (zzn2 != null) {
                com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, zzn2);
                zzG(obj, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzm(java.lang.Object obj) {
        int i;
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzv;
        int zzw5;
        int zzw6;
        int zzc;
        int zzw7;
        int i2;
        int zzN;
        int zzJ;
        int zzu;
        int zzw8;
        int i3;
        int zzw9;
        int zzw10;
        int zzw11;
        int zzx2;
        int zzw12;
        int zzc2;
        int zzw13;
        int i4;
        sun.misc.Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i6 < this.zzc.length) {
            int zzt = zzt(i6);
            int[] iArr = this.zzc;
            int i10 = iArr[i6];
            int zzv2 = zzv(zzt);
            if (zzv2 <= 17) {
                int i11 = iArr[i6 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i9) {
                    i8 = unsafe.getInt(obj, i12);
                    i9 = i12;
                }
            } else {
                i = 0;
            }
            long j = zzt & i5;
            switch (zzv2) {
                case 0:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzw5 = zzw + 8;
                        i7 += zzw5;
                        break;
                    }
                case 1:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzw2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzw5 = zzw2 + 4;
                        i7 += zzw5;
                        break;
                    }
                case 2:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzw3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzx = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(j2);
                        i7 += zzw3 + zzx;
                        break;
                    }
                case 3:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzw3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzx = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(j3);
                        i7 += zzw3 + zzx;
                        break;
                    }
                case 4:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(i13);
                        i2 = zzw4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 5:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzw5 = zzw + 8;
                        i7 += zzw5;
                        break;
                    }
                case 6:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzw2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzw5 = zzw2 + 4;
                        i7 += zzw5;
                        break;
                    }
                case 7:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3) + 1;
                        i7 += zzw5;
                        break;
                    }
                case 8:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        java.lang.Object object = unsafe.getObject(obj, j);
                        if (object instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) {
                            zzw6 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                            zzc = ((com.google.android.gms.internal.play_games_inputmapping.zzek) object).zzc();
                            zzw7 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzc);
                            i2 = zzw6 + zzw7 + zzc;
                            i7 += i2;
                            break;
                        } else {
                            zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                            zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzy((java.lang.String) object);
                            i2 = zzw4 + zzv;
                            i7 += i2;
                        }
                    }
                case 9:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzO(i10, unsafe.getObject(obj, j), zzq(i6));
                        i7 += zzw5;
                        break;
                    }
                case 10:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar = (com.google.android.gms.internal.play_games_inputmapping.zzek) unsafe.getObject(obj, j);
                        zzw6 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzc = zzekVar.zzc();
                        zzw7 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzc);
                        i2 = zzw6 + zzw7 + zzc;
                        i7 += i2;
                        break;
                    }
                case 11:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i14);
                        i2 = zzw4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 12:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(i15);
                        i2 = zzw4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 13:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzw2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzw5 = zzw2 + 4;
                        i7 += zzw5;
                        break;
                    }
                case 14:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzw5 = zzw + 8;
                        i7 += zzw5;
                        break;
                    }
                case 15:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw((i16 >> 31) ^ (i16 + i16));
                        i2 = zzw4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 16:
                    if ((i & i8) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i7 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3) + com.google.android.gms.internal.play_games_inputmapping.zzep.zzx((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzE(i10, (com.google.android.gms.internal.play_games_inputmapping.zzge) unsafe.getObject(obj, j), zzq(i6));
                        i7 += zzw5;
                        break;
                    }
                case 18:
                    zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzK(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzw5;
                    break;
                case 19:
                    zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzI(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzw5;
                    break;
                case 20:
                    zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzu(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzw5;
                    break;
                case 21:
                    zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzw(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzw5;
                    break;
                case 22:
                    zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzC(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzw5;
                    break;
                case 23:
                    zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzK(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzw5;
                    break;
                case 24:
                    zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzI(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzw5;
                    break;
                case 25:
                    zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzM(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzw5;
                    break;
                case 26:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzN(i10, (java.util.List) unsafe.getObject(obj, j));
                    i7 += zzN;
                    break;
                case 27:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzP(i10, (java.util.List) unsafe.getObject(obj, j), zzq(i6));
                    i7 += zzN;
                    break;
                case 28:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzQ(i10, (java.util.List) unsafe.getObject(obj, j));
                    i7 += zzN;
                    break;
                case 29:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzE(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzN;
                    break;
                case 30:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzA(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzN;
                    break;
                case 31:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzI(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzN;
                    break;
                case 32:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzK(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzN;
                    break;
                case 33:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzG(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzN;
                    break;
                case 34:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzy(i10, (java.util.List) unsafe.getObject(obj, j), false);
                    i7 += zzN;
                    break;
                case 35:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzJ((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 36:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzH((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 37:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzt((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 38:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzv((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 39:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzB((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 40:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzJ((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 41:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzH((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 42:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzL((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 43:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzD((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 44:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzz((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 45:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzH((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 46:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzJ((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 47:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzF((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 48:
                    zzJ = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzx((java.util.List) unsafe.getObject(obj, j));
                    if (zzJ > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i10);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzJ);
                        i3 = zzu + zzw8;
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 49:
                    zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzR(i10, (java.util.List) unsafe.getObject(obj, j), zzq(i6));
                    i7 += zzN;
                    break;
                case 50:
                    com.google.android.gms.internal.play_games_inputmapping.zzfz.zza(i10, unsafe.getObject(obj, j), zzr(i6));
                    break;
                case 51:
                    if (zzF(obj, i10, i6)) {
                        zzw9 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzN = zzw9 + 8;
                        i7 += zzN;
                    }
                    break;
                case 52:
                    if (zzF(obj, i10, i6)) {
                        zzw10 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzN = zzw10 + 4;
                        i7 += zzN;
                    }
                    break;
                case 53:
                    if (zzF(obj, i10, i6)) {
                        long zzz = zzz(obj, j);
                        zzw11 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzx2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(zzz);
                        i7 += zzw11 + zzx2;
                    }
                    break;
                case 54:
                    if (zzF(obj, i10, i6)) {
                        long zzz2 = zzz(obj, j);
                        zzw11 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzx2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(zzz2);
                        i7 += zzw11 + zzx2;
                    }
                    break;
                case 55:
                    if (zzF(obj, i10, i6)) {
                        int zzy = zzy(obj, j);
                        i3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzJ = com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(zzy);
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 56:
                    if (zzF(obj, i10, i6)) {
                        zzw9 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzN = zzw9 + 8;
                        i7 += zzN;
                    }
                    break;
                case 57:
                    if (zzF(obj, i10, i6)) {
                        zzw10 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzN = zzw10 + 4;
                        i7 += zzN;
                    }
                    break;
                case 58:
                    if (zzF(obj, i10, i6)) {
                        zzN = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3) + 1;
                        i7 += zzN;
                    }
                    break;
                case 59:
                    if (zzF(obj, i10, i6)) {
                        java.lang.Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) {
                            zzw12 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                            zzc2 = ((com.google.android.gms.internal.play_games_inputmapping.zzek) object2).zzc();
                            zzw13 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzc2);
                            i4 = zzw12 + zzw13 + zzc2;
                            i7 += i4;
                        } else {
                            i3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                            zzJ = com.google.android.gms.internal.play_games_inputmapping.zzep.zzy((java.lang.String) object2);
                            i4 = i3 + zzJ;
                            i7 += i4;
                        }
                    }
                    break;
                case 60:
                    if (zzF(obj, i10, i6)) {
                        zzN = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzO(i10, unsafe.getObject(obj, j), zzq(i6));
                        i7 += zzN;
                    }
                    break;
                case 61:
                    if (zzF(obj, i10, i6)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar2 = (com.google.android.gms.internal.play_games_inputmapping.zzek) unsafe.getObject(obj, j);
                        zzw12 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzc2 = zzekVar2.zzc();
                        zzw13 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzc2);
                        i4 = zzw12 + zzw13 + zzc2;
                        i7 += i4;
                    }
                    break;
                case 62:
                    if (zzF(obj, i10, i6)) {
                        int zzy2 = zzy(obj, j);
                        i3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzJ = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzy2);
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 63:
                    if (zzF(obj, i10, i6)) {
                        int zzy3 = zzy(obj, j);
                        i3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzJ = com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(zzy3);
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 64:
                    if (zzF(obj, i10, i6)) {
                        zzw10 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzN = zzw10 + 4;
                        i7 += zzN;
                    }
                    break;
                case 65:
                    if (zzF(obj, i10, i6)) {
                        zzw9 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzN = zzw9 + 8;
                        i7 += zzN;
                    }
                    break;
                case 66:
                    if (zzF(obj, i10, i6)) {
                        int zzy4 = zzy(obj, j);
                        i3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3);
                        zzJ = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw((zzy4 >> 31) ^ (zzy4 + zzy4));
                        i4 = i3 + zzJ;
                        i7 += i4;
                    }
                    break;
                case 67:
                    if (zzF(obj, i10, i6)) {
                        long zzz3 = zzz(obj, j);
                        i7 += com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i10 << 3) + com.google.android.gms.internal.play_games_inputmapping.zzep.zzx((zzz3 >> 63) ^ (zzz3 + zzz3));
                    }
                    break;
                case 68:
                    if (zzF(obj, i10, i6)) {
                        zzN = com.google.android.gms.internal.play_games_inputmapping.zzep.zzE(i10, (com.google.android.gms.internal.play_games_inputmapping.zzge) unsafe.getObject(obj, j), zzq(i6));
                        i7 += zzN;
                    }
                    break;
            }
            i6 += 3;
            i5 = 1048575;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar = this.zzl;
        int zzg = i7 + zzhdVar.zzg(zzhdVar.zzb(obj));
        if (!this.zzf) {
            return zzg;
        }
        this.zzm.zzb(obj);
        throw null;
    }

    private final int zzn(java.lang.Object obj) {
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzv;
        int zzw5;
        int zzw6;
        int zzc;
        int zzw7;
        int zzO;
        int zzu;
        int zzw8;
        int i;
        sun.misc.Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzt = zzt(i3);
            int zzv2 = zzv(zzt);
            int i4 = this.zzc[i3];
            long j = zzt & 1048575;
            if (zzv2 >= com.google.android.gms.internal.play_games_inputmapping.zzex.DOUBLE_LIST_PACKED.zza() && zzv2 <= com.google.android.gms.internal.play_games_inputmapping.zzex.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzv2) {
                case 0:
                    if (zzD(obj, i3)) {
                        zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw + 8;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzD(obj, i3)) {
                        zzw2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw2 + 4;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzD(obj, i3)) {
                        long zzf = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j);
                        zzw3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzx = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(zzf);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzD(obj, i3)) {
                        long zzf2 = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j);
                        zzw3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzx = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(zzf2);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzD(obj, i3)) {
                        int zzd = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(zzd);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzD(obj, i3)) {
                        zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw + 8;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzD(obj, i3)) {
                        zzw2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw2 + 4;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzD(obj, i3)) {
                        zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw5 + 1;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzD(obj, i3)) {
                        break;
                    } else {
                        java.lang.Object zzn = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
                        if (zzn instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) {
                            zzw6 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                            zzc = ((com.google.android.gms.internal.play_games_inputmapping.zzek) zzn).zzc();
                            zzw7 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzc);
                            i = zzw6 + zzw7 + zzc;
                            i2 += i;
                            break;
                        } else {
                            zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                            zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzy((java.lang.String) zzn);
                            i = zzw4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzD(obj, i3)) {
                        zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzO(i4, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), zzq(i3));
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzD(obj, i3)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar = (com.google.android.gms.internal.play_games_inputmapping.zzek) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
                        zzw6 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzc = zzekVar.zzc();
                        zzw7 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzc);
                        i = zzw6 + zzw7 + zzc;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzD(obj, i3)) {
                        int zzd2 = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzd2);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzD(obj, i3)) {
                        int zzd3 = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(zzd3);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzD(obj, i3)) {
                        zzw2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw2 + 4;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzD(obj, i3)) {
                        zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw + 8;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzD(obj, i3)) {
                        int zzd4 = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw((zzd4 >> 31) ^ (zzd4 + zzd4));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzD(obj, i3)) {
                        long zzf3 = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx((zzf3 >> 63) ^ (zzf3 + zzf3));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzD(obj, i3)) {
                        zzO = com.google.android.gms.internal.play_games_inputmapping.zzep.zzE(i4, (com.google.android.gms.internal.play_games_inputmapping.zzge) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), zzq(i3));
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzK(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 19:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzI(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 20:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzu(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 21:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzw(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 22:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzC(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 23:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzK(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 24:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzI(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 25:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzM(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 26:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzN(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j));
                    i2 += zzO;
                    break;
                case 27:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzP(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), zzq(i3));
                    i2 += zzO;
                    break;
                case 28:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzQ(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j));
                    i2 += zzO;
                    break;
                case 29:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzE(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 30:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzA(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 31:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzI(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 32:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzK(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 33:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzG(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 34:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzy(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), false);
                    i2 += zzO;
                    break;
                case 35:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzJ((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzH((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzt((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzv((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzB((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzJ((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzH((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzL((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzD((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzz((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzH((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzJ((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzF((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzx((java.util.List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzu = com.google.android.gms.internal.play_games_inputmapping.zzep.zzu(i4);
                        zzw8 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzv);
                        zzw4 = zzu + zzw8;
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzR(i4, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), zzq(i3));
                    i2 += zzO;
                    break;
                case 50:
                    com.google.android.gms.internal.play_games_inputmapping.zzfz.zza(i4, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), zzr(i3));
                    break;
                case 51:
                    if (zzF(obj, i4, i3)) {
                        zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw + 8;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzF(obj, i4, i3)) {
                        zzw2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw2 + 4;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzF(obj, i4, i3)) {
                        long zzz = zzz(obj, j);
                        zzw3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzx = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(zzz);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzF(obj, i4, i3)) {
                        long zzz2 = zzz(obj, j);
                        zzw3 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzx = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx(zzz2);
                        i2 += zzw3 + zzx;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzF(obj, i4, i3)) {
                        int zzy = zzy(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(zzy);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzF(obj, i4, i3)) {
                        zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw + 8;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzF(obj, i4, i3)) {
                        zzw2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw2 + 4;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzF(obj, i4, i3)) {
                        zzw5 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw5 + 1;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzF(obj, i4, i3)) {
                        break;
                    } else {
                        java.lang.Object zzn2 = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
                        if (zzn2 instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) {
                            zzw6 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                            zzc = ((com.google.android.gms.internal.play_games_inputmapping.zzek) zzn2).zzc();
                            zzw7 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzc);
                            i = zzw6 + zzw7 + zzc;
                            i2 += i;
                            break;
                        } else {
                            zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                            zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzy((java.lang.String) zzn2);
                            i = zzw4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzF(obj, i4, i3)) {
                        zzO = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzO(i4, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), zzq(i3));
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzF(obj, i4, i3)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzek zzekVar2 = (com.google.android.gms.internal.play_games_inputmapping.zzek) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
                        zzw6 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzc = zzekVar2.zzc();
                        zzw7 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzc);
                        i = zzw6 + zzw7 + zzc;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzF(obj, i4, i3)) {
                        int zzy2 = zzy(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(zzy2);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzF(obj, i4, i3)) {
                        int zzy3 = zzy(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzv(zzy3);
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzF(obj, i4, i3)) {
                        zzw2 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw2 + 4;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzF(obj, i4, i3)) {
                        zzw = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzO = zzw + 8;
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzF(obj, i4, i3)) {
                        int zzy4 = zzy(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw((zzy4 >> 31) ^ (zzy4 + zzy4));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzF(obj, i4, i3)) {
                        long zzz3 = zzz(obj, j);
                        zzw4 = com.google.android.gms.internal.play_games_inputmapping.zzep.zzw(i4 << 3);
                        zzv = com.google.android.gms.internal.play_games_inputmapping.zzep.zzx((zzz3 >> 63) ^ (zzz3 + zzz3));
                        i = zzw4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzF(obj, i4, i3)) {
                        zzO = com.google.android.gms.internal.play_games_inputmapping.zzep.zzE(i4, (com.google.android.gms.internal.play_games_inputmapping.zzge) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), zzq(i3));
                        i2 += zzO;
                        break;
                    } else {
                        break;
                    }
            }
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar = this.zzl;
        return i2 + zzhdVar.zzg(zzhdVar.zzb(obj));
    }

    private final void zzo(java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar) throws java.io.IOException {
        int i;
        if (this.zzf) {
            this.zzm.zzb(obj);
            throw null;
        }
        int length = this.zzc.length;
        sun.misc.Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int zzt = zzt(i3);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int zzv = zzv(zzt);
            if (zzv <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzt & i2;
            switch (zzv) {
                case 0:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        zzhuVar.zzf(i6, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzl(obj, j));
                        continue;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        zzhuVar.zze(i6, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzj(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzc(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzh(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzj(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzl(i6, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzh(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i4 & i) != 0) {
                        zzH(i6, unsafe.getObject(obj, j), zzhuVar);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzr(i6, unsafe.getObject(obj, j), zzq(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzn(i6, (com.google.android.gms.internal.play_games_inputmapping.zzek) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzo(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzg(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzb(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzd(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzp(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzq(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        zzhuVar.zzs(i6, unsafe.getObject(obj, j), zzq(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzb(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                case 19:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzc(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                case 20:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzd(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                case 21:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zze(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                case 22:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzi(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                case 23:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzg(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                case 24:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzl(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                case 25:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzo(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    continue;
                case 26:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzp(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar);
                    break;
                case 27:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzr(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, zzq(i3));
                    break;
                case 28:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzq(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar);
                    break;
                case 29:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzj(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    break;
                case 30:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzn(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    break;
                case 31:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzm(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    break;
                case 32:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzh(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    break;
                case 33:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzk(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    break;
                case 34:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzf(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, false);
                    break;
                case 35:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzb(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 36:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzc(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 37:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzd(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 38:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zze(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 39:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzi(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 40:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzg(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 41:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzl(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 42:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzo(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 43:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzj(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 44:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzn(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 45:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzm(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 46:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzh(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 47:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzk(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 48:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzf(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, true);
                    break;
                case 49:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzs(this.zzc[i3], (java.util.List) unsafe.getObject(obj, j), zzhuVar, zzq(i3));
                    break;
                case 50:
                    zzp(zzhuVar, i6, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzf(i6, zzw(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zze(i6, zzx(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzc(i6, zzz(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzh(i6, zzz(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzi(i6, zzy(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzj(i6, zzz(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzk(i6, zzy(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzl(i6, zzA(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (zzF(obj, i6, i3)) {
                        zzH(i6, unsafe.getObject(obj, j), zzhuVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzr(i6, unsafe.getObject(obj, j), zzq(i3));
                        break;
                    }
                    break;
                case 61:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzn(i6, (com.google.android.gms.internal.play_games_inputmapping.zzek) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzo(i6, zzy(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzg(i6, zzy(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzb(i6, zzy(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzd(i6, zzz(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzp(i6, zzy(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzq(i6, zzz(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (zzF(obj, i6, i3)) {
                        zzhuVar.zzs(i6, unsafe.getObject(obj, j), zzq(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar = this.zzl;
        zzhdVar.zzd(zzhdVar.zzb(obj), zzhuVar);
    }

    private final void zzp(com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final com.google.android.gms.internal.play_games_inputmapping.zzgp zzq(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar = (com.google.android.gms.internal.play_games_inputmapping.zzgp) this.zzd[i3];
        if (zzgpVar != null) {
            return zzgpVar;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzgp zzb2 = com.google.android.gms.internal.play_games_inputmapping.zzgm.zza().zzb((java.lang.Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final java.lang.Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static boolean zzs(java.lang.Object obj, int i, com.google.android.gms.internal.play_games_inputmapping.zzgp zzgpVar) {
        return zzgpVar.zzg(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, i & 1048575));
    }

    private final int zzt(int i) {
        return this.zzc[i + 1];
    }

    private final int zzu(int i) {
        return this.zzc[i + 2];
    }

    private static int zzv(int i) {
        return (i >>> 20) & 255;
    }

    private static double zzw(java.lang.Object obj, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j)).doubleValue();
    }

    private static float zzx(java.lang.Object obj, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j)).floatValue();
    }

    private static int zzy(java.lang.Object obj, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j)).intValue();
    }

    private static long zzz(java.lang.Object obj, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j)).longValue();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final boolean zza(java.lang.Object obj, java.lang.Object obj2) {
        boolean zzV;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzt = zzt(i);
            long j = zzt & 1048575;
            switch (zzv(zzt)) {
                case 0:
                    if (zzB(obj, obj2, i) && java.lang.Double.doubleToLongBits(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzl(obj, j)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzB(obj, obj2, i) && java.lang.Float.floatToIntBits(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzj(obj, j)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzh(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzgr.zzV(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzgr.zzV(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzgr.zzV(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzB(obj, obj2, i) && com.google.android.gms.internal.play_games_inputmapping.zzgr.zzV(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j))) {
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
                    zzV = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzV(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j));
                    break;
                case 50:
                    zzV = com.google.android.gms.internal.play_games_inputmapping.zzgr.zzV(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j));
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
                    long zzu = zzu(i) & 1048575;
                    if (com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, zzu) == com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, zzu) && com.google.android.gms.internal.play_games_inputmapping.zzgr.zzV(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j), com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzV) {
                return false;
            }
        }
        if (!this.zzl.zzb(obj).equals(this.zzl.zzb(obj2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzm.zzb(obj);
        this.zzm.zzb(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final int zzb(java.lang.Object obj) {
        int i;
        int zze;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzt = zzt(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzt;
            int i5 = 37;
            switch (zzv(zzt)) {
                case 0:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(java.lang.Double.doubleToLongBits(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzl(obj, j)));
                    i2 = i + zze;
                    break;
                case 1:
                    i = i2 * 53;
                    zze = java.lang.Float.floatToIntBits(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzj(obj, j));
                    i2 = i + zze;
                    break;
                case 2:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j));
                    i2 = i + zze;
                    break;
                case 3:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j));
                    i2 = i + zze;
                    break;
                case 4:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                    i2 = i + zze;
                    break;
                case 5:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j));
                    i2 = i + zze;
                    break;
                case 6:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                    i2 = i + zze;
                    break;
                case 7:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zzf(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzh(obj, j));
                    i2 = i + zze;
                    break;
                case 8:
                    i = i2 * 53;
                    zze = ((java.lang.String) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j)).hashCode();
                    i2 = i + zze;
                    break;
                case 9:
                    java.lang.Object zzn = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
                    if (zzn != null) {
                        i5 = zzn.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j).hashCode();
                    i2 = i + zze;
                    break;
                case 11:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                    i2 = i + zze;
                    break;
                case 12:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                    i2 = i + zze;
                    break;
                case 13:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                    i2 = i + zze;
                    break;
                case 14:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j));
                    i2 = i + zze;
                    break;
                case 15:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, j);
                    i2 = i + zze;
                    break;
                case 16:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, j));
                    i2 = i + zze;
                    break;
                case 17:
                    java.lang.Object zzn2 = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
                    if (zzn2 != null) {
                        i5 = zzn2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j).hashCode();
                    i2 = i + zze;
                    break;
                case 50:
                    i = i2 * 53;
                    zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j).hashCode();
                    i2 = i + zze;
                    break;
                case 51:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(java.lang.Double.doubleToLongBits(zzw(obj, j)));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = java.lang.Float.floatToIntBits(zzx(obj, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(zzz(obj, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(zzz(obj, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = zzy(obj, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(zzz(obj, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = zzy(obj, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zzf(zzA(obj, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = ((java.lang.String) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j)).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = zzy(obj, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = zzy(obj, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = zzy(obj, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(zzz(obj, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = zzy(obj, j);
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzfi.zze(zzz(obj, j));
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzF(obj, i4, i3)) {
                        i = i2 * 53;
                        zze = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j).hashCode();
                        i2 = i + zze;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzl.zzb(obj).hashCode();
        if (!this.zzf) {
            return hashCode;
        }
        this.zzm.zzb(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final int zzd(java.lang.Object obj) {
        return this.zzg ? zzn(obj) : zzm(obj);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final void zze(java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzhu zzhuVar) throws java.io.IOException {
        if (!this.zzg) {
            zzo(obj, zzhuVar);
            return;
        }
        if (this.zzf) {
            this.zzm.zzb(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzt = zzt(i);
            int i2 = this.zzc[i];
            switch (zzv(zzt)) {
                case 0:
                    if (zzD(obj, i)) {
                        zzhuVar.zzf(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzl(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzD(obj, i)) {
                        zzhuVar.zze(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzj(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzD(obj, i)) {
                        zzhuVar.zzc(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzD(obj, i)) {
                        zzhuVar.zzh(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzD(obj, i)) {
                        zzhuVar.zzi(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzD(obj, i)) {
                        zzhuVar.zzj(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzD(obj, i)) {
                        zzhuVar.zzk(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzD(obj, i)) {
                        zzhuVar.zzl(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzh(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzD(obj, i)) {
                        zzH(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzD(obj, i)) {
                        zzhuVar.zzr(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzq(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzD(obj, i)) {
                        zzhuVar.zzn(i2, (com.google.android.gms.internal.play_games_inputmapping.zzek) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzD(obj, i)) {
                        zzhuVar.zzo(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzD(obj, i)) {
                        zzhuVar.zzg(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzD(obj, i)) {
                        zzhuVar.zzb(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzD(obj, i)) {
                        zzhuVar.zzd(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzD(obj, i)) {
                        zzhuVar.zzp(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzD(obj, i)) {
                        zzhuVar.zzq(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzD(obj, i)) {
                        zzhuVar.zzs(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzq(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzb(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 19:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzc(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 20:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzd(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 21:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zze(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 22:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzi(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 23:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzg(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 24:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzl(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 25:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzo(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 26:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzp(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar);
                    break;
                case 27:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzr(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, zzq(i));
                    break;
                case 28:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzq(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar);
                    break;
                case 29:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzj(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 30:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzn(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 31:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzm(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 32:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzh(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 33:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzk(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 34:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzf(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, false);
                    break;
                case 35:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzb(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 36:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzc(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 37:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzd(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 38:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zze(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 39:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzi(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 40:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzg(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 41:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzl(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 42:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzo(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 43:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzj(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 44:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzn(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 45:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzm(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 46:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzh(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 47:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzk(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 48:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzf(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, true);
                    break;
                case 49:
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzs(i2, (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar, zzq(i));
                    break;
                case 50:
                    zzp(zzhuVar, i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), i);
                    break;
                case 51:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzf(i2, zzw(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zze(i2, zzx(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzc(i2, zzz(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzh(i2, zzz(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzi(i2, zzy(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzj(i2, zzz(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzk(i2, zzy(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzl(i2, zzA(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzF(obj, i2, i)) {
                        zzH(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzhuVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzr(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzq(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzn(i2, (com.google.android.gms.internal.play_games_inputmapping.zzek) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzo(i2, zzy(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzg(i2, zzy(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzb(i2, zzy(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzd(i2, zzz(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzp(i2, zzy(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzq(i2, zzz(obj, zzt & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzF(obj, i2, i)) {
                        zzhuVar.zzs(i2, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575), zzq(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhd zzhdVar = this.zzl;
        zzhdVar.zzd(zzhdVar.zzb(obj), zzhuVar);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final void zzf(java.lang.Object obj) {
        int i;
        int i2 = this.zzi;
        while (true) {
            i = this.zzj;
            if (i2 >= i) {
                break;
            }
            long zzt = zzt(this.zzh[i2]) & 1048575;
            java.lang.Object zzn = com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt);
            if (zzn != null) {
                ((com.google.android.gms.internal.play_games_inputmapping.zzfy) zzn).zzc();
                com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, zzt, zzn);
            }
            i2++;
        }
        int length = this.zzh.length;
        while (i < length) {
            this.zzk.zza(obj, this.zzh[i]);
            i++;
        }
        this.zzl.zzc(obj);
        if (this.zzf) {
            this.zzm.zzc(obj);
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final boolean zzg(java.lang.Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzi) {
            int i6 = this.zzh[i5];
            int i7 = this.zzc[i6];
            int zzt = zzt(i6);
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
            if ((268435456 & zzt) != 0 && !zzC(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzv = zzv(zzt);
            if (zzv != 9 && zzv != 17) {
                if (zzv != 27) {
                    if (zzv == 60 || zzv == 68) {
                        if (zzF(obj, i7, i6) && !zzs(obj, zzt, zzq(i6))) {
                            return false;
                        }
                    } else if (zzv != 49) {
                        if (zzv == 50 && !((com.google.android.gms.internal.play_games_inputmapping.zzfy) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                java.util.List list = (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, zzt & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    com.google.android.gms.internal.play_games_inputmapping.zzgp zzq = zzq(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzq.zzg(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzC(obj, i6, i, i2, i10) && !zzs(obj, zzt, zzq(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzm.zzb(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgp
    public final void zzc(java.lang.Object obj, java.lang.Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzt = zzt(i);
            long j = 1048575 & zzt;
            int i2 = this.zzc[i];
            switch (zzv(zzt)) {
                case 0:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzm(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzl(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzk(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzj(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzg(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzg(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zze(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzg(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zze(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzi(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzh(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzk(obj, obj2, i);
                    break;
                case 10:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zze(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zze(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zze(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzg(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zze(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzd(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzD(obj2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzg(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzf(obj2, j));
                        zzE(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzk(obj, obj2, i);
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
                    com.google.android.gms.internal.play_games_inputmapping.zzgr.zzY(this.zzo, obj, obj2, j);
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
                    if (zzF(obj2, i2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j));
                        zzG(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzl(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzF(obj2, i2, i)) {
                        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j));
                        zzG(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzl(obj, obj2, i);
                    break;
            }
        }
        com.google.android.gms.internal.play_games_inputmapping.zzgr.zzX(this.zzl, obj, obj2);
        if (this.zzf) {
            com.google.android.gms.internal.play_games_inputmapping.zzgr.zzW(this.zzm, obj, obj2);
        }
    }
}
