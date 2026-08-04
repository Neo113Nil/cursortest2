package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.ads.zzbbd;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p031e1.k;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i7, int i8, zzfw zzfwVar, boolean z4, boolean z7, int[] iArr2, int i9, int i10, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzh = z4;
        this.zzi = iArr2;
        this.zzj = i9;
        this.zzk = i10;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbL = k.l("Field ", str, " for ", name, " not found. Known fields are ");
            sbL.append(string);
            throw new RuntimeException(sbL.toString());
        }
    }

    private final void zzB(Object obj, Object obj2, int i7) {
        long jZzv = zzv(i7) & 1048575;
        if (zzG(obj2, i7)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
                zzD(obj, i7);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, jZzv, objZzf2);
                zzD(obj, i7);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i7) {
        int iZzv = zzv(i7);
        int i8 = this.zzc[i7];
        long j = iZzv & 1048575;
        if (zzJ(obj2, i8, i7)) {
            Object objZzf = zzJ(obj, i8, i7) ? zzhi.zzf(obj, j) : null;
            Object objZzf2 = zzhi.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, j, zzez.zzg(objZzf, objZzf2));
                zzE(obj, i8, i7);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, j, objZzf2);
                zzE(obj, i8, i7);
            }
        }
    }

    private final void zzD(Object obj, int i7) {
        int iZzs = zzs(i7);
        long j = 1048575 & iZzs;
        if (j == 1048575) {
            return;
        }
        zzhi.zzn(obj, j, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j));
    }

    private final void zzE(Object obj, int i7, int i8) {
        zzhi.zzn(obj, zzs(i8) & 1048575, i7);
    }

    private final boolean zzF(Object obj, Object obj2, int i7) {
        return zzG(obj, i7) == zzG(obj2, i7);
    }

    private final boolean zzG(Object obj, int i7) {
        int iZzs = zzs(i7);
        long j = iZzs & 1048575;
        if (j != 1048575) {
            return (zzhi.zzc(obj, j) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i7);
        long j3 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j3)) != 0;
            case 2:
                return zzhi.zzd(obj, j3) != 0;
            case 3:
                return zzhi.zzd(obj, j3) != 0;
            case 4:
                return zzhi.zzc(obj, j3) != 0;
            case 5:
                return zzhi.zzd(obj, j3) != 0;
            case 6:
                return zzhi.zzc(obj, j3) != 0;
            case 7:
                return zzhi.zzt(obj, j3);
            case 8:
                Object objZzf = zzhi.zzf(obj, j3);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j3) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j3));
            case 11:
                return zzhi.zzc(obj, j3) != 0;
            case 12:
                return zzhi.zzc(obj, j3) != 0;
            case 13:
                return zzhi.zzc(obj, j3) != 0;
            case 14:
                return zzhi.zzd(obj, j3) != 0;
            case 15:
                return zzhi.zzc(obj, j3) != 0;
            case 16:
                return zzhi.zzd(obj, j3) != 0;
            case 17:
                return zzhi.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzG(obj, i7);
        }
        return (i9 & i10) != 0;
    }

    private static boolean zzI(Object obj, int i7, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i7 & 1048575));
    }

    private final boolean zzJ(Object obj, int i7, int i8) {
        return zzhi.zzc(obj, (long) (zzs(i8) & 1048575)) == i7;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:130:0x027f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0332  */
    /* JADX WARN: Code duplicated, block: B:180:0x0381  */
    /* JADX WARN: Code duplicated, block: B:183:0x038a  */
    public static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char cCharAt;
        int i13;
        char cCharAt2;
        int i14;
        char cCharAt3;
        int i15;
        char cCharAt4;
        int i16;
        char cCharAt5;
        int i17;
        char cCharAt6;
        int i18;
        char cCharAt7;
        int i19;
        char cCharAt8;
        int i20;
        int i21;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Object[] objArr;
        int i26;
        int i27;
        Field fieldZzA;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldZzA2;
        int i32;
        Object obj2;
        Field fieldZzA3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        boolean z4 = zzggVar.zzc() == 2;
        String strZzd = zzggVar.zzd();
        int length = strZzd.length();
        char c3 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i7 = i37 + 1;
                if (strZzd.charAt(i37) < 55296) {
                    break;
                }
                i37 = i7;
            }
        } else {
            i7 = 1;
        }
        int i38 = i7 + 1;
        int iCharAt4 = strZzd.charAt(i7);
        if (iCharAt4 >= 55296) {
            int i39 = iCharAt4 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = strZzd.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt4 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt4 == 0) {
            iCharAt = 0;
            i11 = 0;
            iCharAt2 = 0;
            i10 = 0;
            iCharAt3 = 0;
            i8 = 0;
            iArr = zza;
            i9 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt5 = strZzd.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i19 = i41 + 1;
                    cCharAt8 = strZzd.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i19;
                }
                iCharAt5 = i42 | (cCharAt8 << i43);
                i41 = i19;
            }
            int i44 = i41 + 1;
            int iCharAt6 = strZzd.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i18 = i44 + 1;
                    cCharAt7 = strZzd.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i18;
                }
                iCharAt6 = i45 | (cCharAt7 << i46);
                i44 = i18;
            }
            int i47 = i44 + 1;
            iCharAt = strZzd.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i17 = i47 + 1;
                    cCharAt6 = strZzd.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i17;
                }
                iCharAt = i48 | (cCharAt6 << i49);
                i47 = i17;
            }
            int i50 = i47 + 1;
            int iCharAt7 = strZzd.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i16 = i50 + 1;
                    cCharAt5 = strZzd.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i16;
                }
                iCharAt7 = i51 | (cCharAt5 << i52);
                i50 = i16;
            }
            int i53 = i50 + 1;
            iCharAt2 = strZzd.charAt(i50);
            if (iCharAt2 >= 55296) {
                int i54 = iCharAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i15 = i53 + 1;
                    cCharAt4 = strZzd.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i15;
                }
                iCharAt2 = i54 | (cCharAt4 << i55);
                i53 = i15;
            }
            int i56 = i53 + 1;
            int iCharAt8 = strZzd.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i14 = i56 + 1;
                    cCharAt3 = strZzd.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i14;
                }
                iCharAt8 = i57 | (cCharAt3 << i58);
                i56 = i14;
            }
            int i59 = i56 + 1;
            int iCharAt9 = strZzd.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i13 = i59 + 1;
                    cCharAt2 = strZzd.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i13;
                }
                iCharAt9 = i60 | (cCharAt2 << i61);
                i59 = i13;
            }
            int i62 = i59 + 1;
            iCharAt3 = strZzd.charAt(i59);
            if (iCharAt3 >= 55296) {
                int i63 = iCharAt3 & 8191;
                int i64 = 13;
                while (true) {
                    i12 = i62 + 1;
                    cCharAt = strZzd.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i12;
                }
                iCharAt3 = i63 | (cCharAt << i64);
                i62 = i12;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i8 = iCharAt5 + iCharAt5 + iCharAt6;
            i9 = iCharAt5;
            i38 = i62;
            int i65 = iCharAt8;
            i10 = iCharAt7;
            i11 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 + iCharAt2];
        int i66 = iCharAt3 + i11;
        int i67 = iCharAt3;
        int i68 = i66;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int iCharAt10 = strZzd.charAt(i38);
            if (iCharAt10 >= c3) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    cCharAt12 = strZzd.charAt(i73);
                    if (cCharAt12 < c3) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i35;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i20 = i35;
            } else {
                i20 = i71;
            }
            int i75 = i20 + 1;
            int iCharAt11 = strZzd.charAt(i20);
            if (iCharAt11 >= c3) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    cCharAt11 = strZzd.charAt(i77);
                    i21 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i34;
                    length = i21;
                }
                iCharAt11 = i76 | (cCharAt11 << i78);
                i22 = i34;
            } else {
                i21 = length;
                i22 = i75;
            }
            int i79 = iCharAt11 & 255;
            int i80 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            if (i79 >= 51) {
                int i81 = i22 + 1;
                int iCharAt12 = strZzd.charAt(i22);
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i33 = i83 + 1;
                        cCharAt10 = strZzd.charAt(i83);
                        i24 = i10;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i83 = i33;
                        i10 = i24;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i84);
                    i29 = i33;
                } else {
                    i24 = i10;
                    i29 = i81;
                }
                int i85 = i79 - 51;
                int i86 = i29;
                if (i85 == 9 || i85 == 17) {
                    int i87 = i69 / 3;
                    i30 = i8 + 1;
                    objArr2[i87 + i87 + 1] = objArrZze[i8];
                } else {
                    if (i85 == 12 && !z4) {
                        int i88 = i69 / 3;
                        i30 = i8 + 1;
                        objArr2[i88 + i88 + 1] = objArrZze[i8];
                    }
                    i31 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i31];
                    if (obj instanceof Field) {
                        fieldZzA2 = (Field) obj;
                    } else {
                        fieldZzA2 = zzA(cls, (String) obj);
                        objArrZze[i31] = fieldZzA2;
                    }
                    iArr2 = iArr3;
                    i23 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzA2);
                    i32 = i31 + 1;
                    obj2 = objArrZze[i32];
                    if (obj2 instanceof Field) {
                        fieldZzA3 = (Field) obj2;
                    } else {
                        fieldZzA3 = zzA(cls, (String) obj2);
                        objArrZze[i32] = fieldZzA3;
                    }
                    objArr = objArr2;
                    i25 = i8;
                    i26 = i86;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i27 = 0;
                }
                i8 = i30;
                i31 = iCharAt12 + iCharAt12;
                obj = objArrZze[i31];
                if (obj instanceof Field) {
                    fieldZzA2 = (Field) obj;
                } else {
                    fieldZzA2 = zzA(cls, (String) obj);
                    objArrZze[i31] = fieldZzA2;
                }
                iArr2 = iArr3;
                i23 = iCharAt;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzA2);
                i32 = i31 + 1;
                obj2 = objArrZze[i32];
                if (obj2 instanceof Field) {
                    fieldZzA3 = (Field) obj2;
                } else {
                    fieldZzA3 = zzA(cls, (String) obj2);
                    objArrZze[i32] = fieldZzA3;
                }
                objArr = objArr2;
                i25 = i8;
                i26 = i86;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i27 = 0;
            } else {
                iArr2 = iArr3;
                i23 = iCharAt;
                i24 = i10;
                int i89 = i8 + 1;
                Field fieldZzA4 = zzA(cls, (String) objArrZze[i8]);
                if (i79 == 9 || i79 == 17) {
                    int i90 = i69 / 3;
                    objArr2[i90 + i90 + 1] = fieldZzA4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        int i91 = i69 / 3;
                        i28 = i8 + 2;
                        objArr2[i91 + i91 + 1] = objArrZze[i89];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        if (!z4) {
                            int i92 = i69 / 3;
                            i28 = i8 + 2;
                            objArr2[i92 + i92 + 1] = objArrZze[i89];
                        }
                    } else if (i79 == 50) {
                        int i93 = i67 + 1;
                        iArr[i67] = i69;
                        int i94 = i69 / 3;
                        int i95 = i94 + i94;
                        int i96 = i8 + 2;
                        objArr2[i95] = objArrZze[i89];
                        if ((iCharAt11 & 2048) != 0) {
                            i89 = i8 + 3;
                            objArr2[i95 + 1] = objArrZze[i96];
                            i67 = i93;
                        } else {
                            i67 = i93;
                            i25 = i96;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                        iObjectFieldOffset2 = 1048575;
                        objArr = objArr2;
                        if ((iCharAt11 & 4096) == 4096 || i79 > 17) {
                            i26 = i22;
                            i27 = 0;
                        } else {
                            int i97 = i22 + 1;
                            int iCharAt13 = strZzd.charAt(i22);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i26 = i97 + 1;
                                    cCharAt9 = strZzd.charAt(i97);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i26;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                            } else {
                                i26 = i97;
                            }
                            int i100 = (iCharAt13 / 32) + i9 + i9;
                            Object obj3 = objArrZze[i100];
                            if (obj3 instanceof Field) {
                                fieldZzA = (Field) obj3;
                            } else {
                                fieldZzA = zzA(cls, (String) obj3);
                                objArrZze[i100] = fieldZzA;
                            }
                            i27 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA);
                        }
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i68] = iObjectFieldOffset;
                            i68++;
                        }
                    }
                    i25 = i28;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                    iObjectFieldOffset2 = 1048575;
                    objArr = objArr2;
                    if ((iCharAt11 & 4096) == 4096) {
                        i26 = i22;
                        i27 = 0;
                    } else {
                        i26 = i22;
                        i27 = 0;
                    }
                    if (i79 >= 18) {
                        iArr[i68] = iObjectFieldOffset;
                        i68++;
                    }
                }
                i25 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                iObjectFieldOffset2 = 1048575;
                objArr = objArr2;
                if ((iCharAt11 & 4096) == 4096) {
                    i26 = i22;
                    i27 = 0;
                } else {
                    i26 = i22;
                    i27 = 0;
                }
                if (i79 >= 18) {
                    iArr[i68] = iObjectFieldOffset;
                    i68++;
                }
            }
            int i101 = i69 + 1;
            iArr2[i69] = iCharAt10;
            int i102 = i69 + 2;
            iArr2[i101] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i79 << 20) | iObjectFieldOffset;
            i69 += 3;
            iArr2[i102] = (i27 << 20) | iObjectFieldOffset2;
            iCharAt = i23;
            iCharAt3 = i80;
            i38 = i26;
            length = i21;
            objArr2 = objArr;
            i8 = i25;
            iArr3 = iArr2;
            i10 = i24;
            c3 = 55296;
        }
        return new zzfz(iArr3, objArr2, iCharAt, i10, zzggVar.zza(), z4, false, iArr, iCharAt3, i66, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzhi.zzf(obj, j)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i7, int i8, int i9, long j, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i9);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, zzds zzdsVar) throws zzfa {
        Unsafe unsafe = zzb;
        long j3 = this.zzc[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i7))));
                unsafe.putInt(obj, j3, i10);
                return i7 + 8;
            case 52:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i7))));
                unsafe.putInt(obj, j3, i10);
                return i7 + 4;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i7;
                }
                int iZzm = zzdt.zzm(bArr, i7, zzdsVar);
                unsafe.putObject(obj, j, Long.valueOf(zzdsVar.zzb));
                unsafe.putInt(obj, j3, i10);
                return iZzm;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i7;
                }
                int iZzj = zzdt.zzj(bArr, i7, zzdsVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzdsVar.zza));
                unsafe.putInt(obj, j3, i10);
                return iZzj;
            case 56:
            case 65:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i7)));
                unsafe.putInt(obj, j3, i10);
                return i7 + 8;
            case 57:
            case 64:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i7)));
                unsafe.putInt(obj, j3, i10);
                return i7 + 4;
            case 58:
                if (i11 != 0) {
                    return i7;
                }
                int iZzm2 = zzdt.zzm(bArr, i7, zzdsVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzdsVar.zzb != 0));
                unsafe.putInt(obj, j3, i10);
                return iZzm2;
            case 59:
                if (i11 != 2) {
                    return i7;
                }
                int iZzj2 = zzdt.zzj(bArr, i7, zzdsVar);
                int i15 = zzdsVar.zza;
                if (i15 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i12 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i15)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i15, zzez.zzb));
                    iZzj2 += i15;
                }
                unsafe.putInt(obj, j3, i10);
                return iZzj2;
            case 60:
                if (i11 != 2) {
                    return i7;
                }
                int iZzd = zzdt.zzd(zzy(i14), bArr, i7, i8, zzdsVar);
                Object object = unsafe.getInt(obj, j3) == i10 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zzdsVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                }
                unsafe.putInt(obj, j3, i10);
                return iZzd;
            case 61:
                if (i11 != 2) {
                    return i7;
                }
                int iZza = zzdt.zza(bArr, i7, zzdsVar);
                unsafe.putObject(obj, j, zzdsVar.zzc);
                unsafe.putInt(obj, j3, i10);
                return iZza;
            case 63:
                if (i11 != 0) {
                    return i7;
                }
                int iZzj3 = zzdt.zzj(bArr, i7, zzdsVar);
                int i16 = zzdsVar.zza;
                zzex zzexVarZzx = zzx(i14);
                if (zzexVarZzx == null || zzexVarZzx.zza()) {
                    unsafe.putObject(obj, j, Integer.valueOf(i16));
                    unsafe.putInt(obj, j3, i10);
                } else {
                    zzc(obj).zzf(i9, Long.valueOf(i16));
                }
                return iZzj3;
            case 66:
                if (i11 != 0) {
                    return i7;
                }
                int iZzj4 = zzdt.zzj(bArr, i7, zzdsVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                unsafe.putInt(obj, j3, i10);
                return iZzj4;
            case 67:
                if (i11 != 0) {
                    return i7;
                }
                int iZzm3 = zzdt.zzm(bArr, i7, zzdsVar);
                unsafe.putObject(obj, j, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                unsafe.putInt(obj, j3, i10);
                return iZzm3;
            case 68:
                if (i11 != 3) {
                    return i7;
                }
                int iZzc = zzdt.zzc(zzy(i14), bArr, i7, i8, (i9 & (-8)) | 4, zzdsVar);
                Object object2 = unsafe.getInt(obj, j3) == i10 ? unsafe.getObject(obj, j) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j, zzdsVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzez.zzg(object2, zzdsVar.zzc));
                }
                unsafe.putInt(obj, j3, i10);
                return iZzc;
            default:
                return i7;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0081. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i7, int i8, zzds zzdsVar) throws zzfa {
        int i9;
        int iZzk;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzm;
        int iZzd;
        int i17;
        int i18;
        int i19;
        zzfz<T> zzfzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i20 = i8;
        zzdsVar = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i21 = 1048575;
        int i22 = -1;
        int iZzi = i7;
        int i23 = -1;
        int i24 = 1048575;
        int i25 = 0;
        int i26 = 0;
        while (iZzi < i20) {
            int i27 = iZzi + 1;
            byte b7 = bArr2[iZzi];
            if (b7 < 0) {
                iZzk = zzdt.zzk(b7, bArr2, i27, zzdsVar);
                i9 = zzdsVar.zza;
            } else {
                i9 = b7;
                iZzk = i27;
            }
            int i28 = i9 >>> 3;
            int i29 = i9 & 7;
            int iZzr = i28 > i23 ? zzfzVar.zzr(i28, i25 / 3) : zzfzVar.zzq(i28);
            if (iZzr == i22) {
                i10 = iZzk;
                i11 = i28;
                i12 = i22;
                unsafe = unsafe2;
                i13 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i30 = iArr[iZzr + 1];
                int iZzu = zzu(i30);
                long j = i30 & i21;
                if (iZzu <= 17) {
                    int i31 = iArr[iZzr + 2];
                    int i32 = 1 << (i31 >>> 20);
                    i14 = 1048575;
                    int i33 = i31 & 1048575;
                    if (i33 != i24) {
                        if (i24 != 1048575) {
                            unsafe2.putInt(obj2, i24, i26);
                        }
                        if (i33 != 1048575) {
                            i26 = unsafe2.getInt(obj2, i33);
                        }
                        i24 = i33;
                    }
                    switch (iZzu) {
                        case 0:
                            i15 = iZzr;
                            i16 = iZzk;
                            i11 = i28;
                            if (i29 != 1) {
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                zzhi.zzl(obj2, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i16)));
                                iZzi = i16 + 8;
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 1:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i16 = iZzk;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 5) {
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                zzhi.zzm(obj2, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i16)));
                                iZzi = i16 + 4;
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i16 = iZzk;
                            i11 = i28;
                            if (i29 != 0) {
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i16, zzdsVar);
                                unsafe2.putLong(obj, j, zzdsVar.zzb);
                                i26 |= i32;
                                iZzi = iZzm;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i16 = iZzk;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 0) {
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzi = zzdt.zzj(bArr2, i16, zzdsVar);
                                unsafe2.putInt(obj2, j, zzdsVar.zza);
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i15 = iZzr;
                            i11 = i28;
                            if (i29 != 1) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                i16 = iZzk;
                                unsafe2.putLong(obj, j, zzdt.zzn(bArr2, iZzk));
                                iZzi = i16 + 8;
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 5) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                unsafe2.putInt(obj2, j, zzdt.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 7:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 0) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzi = zzdt.zzm(bArr2, iZzk, zzdsVar);
                                zzhi.zzk(obj2, j, zzdsVar.zzb != 0);
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 8:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 2) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzi = (536870912 & i30) == 0 ? zzdt.zzg(bArr2, iZzk, zzdsVar) : zzdt.zzh(bArr2, iZzk, zzdsVar);
                                unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                i26 |= i32;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 9:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 2) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzd = zzdt.zzd(zzfzVar.zzy(i15), bArr2, iZzk, i20, zzdsVar);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzez.zzg(object, zzdsVar.zzc));
                                }
                                i26 |= i32;
                                iZzi = iZzd;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 10:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 2) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzd = zzdt.zza(bArr2, iZzk, zzdsVar);
                                unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                i26 |= i32;
                                iZzi = iZzd;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 12:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 0) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar);
                                unsafe2.putInt(obj2, j, zzdsVar.zza);
                                i26 |= i32;
                                iZzi = iZzd;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 15:
                            zzdsVar = zzdsVar;
                            i15 = iZzr;
                            i14 = 1048575;
                            i11 = i28;
                            if (i29 != 0) {
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                iZzd = zzdt.zzj(bArr2, iZzk, zzdsVar);
                                unsafe2.putInt(obj2, j, zzei.zzb(zzdsVar.zza));
                                i26 |= i32;
                                iZzi = iZzd;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        case 16:
                            if (i29 != 0) {
                                i11 = i28;
                                i15 = iZzr;
                                i16 = iZzk;
                                i10 = i16;
                                unsafe = unsafe2;
                                i13 = i15;
                                i12 = -1;
                            } else {
                                zzdsVar = zzdsVar;
                                iZzm = zzdt.zzm(bArr2, iZzk, zzdsVar);
                                i15 = iZzr;
                                i11 = i28;
                                unsafe2.putLong(obj, j, zzei.zzc(zzdsVar.zzb));
                                i26 |= i32;
                                iZzi = iZzm;
                                i25 = i15;
                                i23 = i11;
                                i21 = i14;
                                i22 = -1;
                            }
                            break;
                        default:
                            i11 = i28;
                            i15 = iZzr;
                            i16 = iZzk;
                            i10 = i16;
                            unsafe = unsafe2;
                            i13 = i15;
                            i12 = -1;
                            break;
                    }
                } else {
                    zzdsVar = zzdsVar;
                    i15 = iZzr;
                    int i34 = iZzk;
                    i14 = 1048575;
                    i11 = i28;
                    if (iZzu == 27) {
                        if (i29 == 2) {
                            zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj2, j);
                            if (!zzeyVarZzd.zzc()) {
                                int size = zzeyVarZzd.size();
                                zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzeyVarZzd);
                            }
                            iZzi = zzdt.zze(zzfzVar.zzy(i15), i9, bArr, i34, i8, zzeyVarZzd, zzdsVar);
                            i26 = i26;
                            i25 = i15;
                            i23 = i11;
                            i21 = i14;
                            i22 = -1;
                        } else {
                            i17 = i34;
                            i18 = i26;
                            i19 = i24;
                            unsafe = unsafe2;
                            i13 = i15;
                            i12 = -1;
                        }
                    } else if (iZzu <= 49) {
                        i18 = i26;
                        i19 = i24;
                        i12 = -1;
                        unsafe = unsafe2;
                        i13 = i15;
                        iZzi = zzp(obj, bArr, i34, i8, i9, i11, i29, i15, i30, iZzu, j, zzdsVar);
                        if (iZzi != i34) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i20 = i8;
                            zzdsVar = zzdsVar;
                            i24 = i19;
                            i22 = i12;
                            i23 = i11;
                            i26 = i18;
                            i25 = i13;
                            unsafe2 = unsafe;
                            i21 = 1048575;
                            zzfzVar = this;
                        } else {
                            i10 = iZzi;
                            i24 = i19;
                            i26 = i18;
                        }
                    } else {
                        i17 = i34;
                        i18 = i26;
                        i19 = i24;
                        unsafe = unsafe2;
                        i13 = i15;
                        i12 = -1;
                        if (iZzu != 50) {
                            iZzi = zzn(obj, bArr, i17, i8, i9, i11, i29, i30, iZzu, j, i13, zzdsVar);
                            if (iZzi != i17) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i20 = i8;
                                zzdsVar = zzdsVar;
                                i24 = i19;
                                i22 = i12;
                                i23 = i11;
                                i26 = i18;
                                i25 = i13;
                                unsafe2 = unsafe;
                                i21 = 1048575;
                                zzfzVar = this;
                            } else {
                                i10 = iZzi;
                                i24 = i19;
                                i26 = i18;
                            }
                        } else if (i29 == 2) {
                            iZzi = zzm(obj, bArr, i17, i8, i13, j, zzdsVar);
                            if (iZzi != i17) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i20 = i8;
                                zzdsVar = zzdsVar;
                                i24 = i19;
                                i22 = i12;
                                i23 = i11;
                                i26 = i18;
                                i25 = i13;
                                unsafe2 = unsafe;
                                i21 = 1048575;
                                zzfzVar = this;
                            } else {
                                i10 = iZzi;
                                i24 = i19;
                                i26 = i18;
                            }
                        }
                    }
                    i10 = i17;
                    i24 = i19;
                    i26 = i18;
                }
            }
            iZzi = zzdt.zzi(i9, bArr, i10, i8, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i20 = i8;
            zzdsVar = zzdsVar;
            i22 = i12;
            i23 = i11;
            i25 = i13;
            unsafe2 = unsafe;
            i21 = 1048575;
        }
        int i35 = i26;
        int i36 = i24;
        Unsafe unsafe3 = unsafe2;
        if (i36 != i21) {
            unsafe3.putInt(obj, i36, i35);
        }
        if (iZzi == i8) {
            return iZzi;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, long j, int i13, long j3, zzds zzdsVar) throws zzfa {
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzj;
        int iZzj2 = i7;
        Unsafe unsafe = zzb;
        zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j3);
        if (!zzeyVarZzd.zzc()) {
            int size = zzeyVarZzd.size();
            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j3, zzeyVarZzd);
        }
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    zzej zzejVar = (zzej) zzeyVarZzd;
                    int iZzj3 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i18 = zzdsVar.zza + iZzj3;
                    while (iZzj3 < i18) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i18) {
                        return iZzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVarZzd;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i7)));
                    while (true) {
                        i14 = iZzj2 + 8;
                        if (i14 < i8) {
                            iZzj2 = zzdt.zzj(bArr, i14, zzdsVar);
                            if (i9 == zzdsVar.zza) {
                                zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                            }
                        }
                    }
                    return i14;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i11 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVarZzd;
                    int iZzj4 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i19 = zzdsVar.zza + iZzj4;
                    while (iZzj4 < i19) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i19) {
                        return iZzj4;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVarZzd;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i7)));
                    while (true) {
                        i15 = iZzj2 + 4;
                        if (i15 < i8) {
                            iZzj2 = zzdt.zzj(bArr, i15, zzdsVar);
                            if (i9 == zzdsVar.zza) {
                                zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj2)));
                            }
                        }
                    }
                    return i15;
                }
                return iZzj2;
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i11 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVarZzd;
                    int iZzj5 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i20 = zzdsVar.zza + iZzj5;
                    while (iZzj5 < i20) {
                        iZzj5 = zzdt.zzm(bArr, iZzj5, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (iZzj5 == i20) {
                        return iZzj5;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVarZzd;
                    int iZzm = zzdt.zzm(bArr, iZzj2, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (iZzm < i8) {
                        int iZzj6 = zzdt.zzj(bArr, iZzm, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzdt.zzm(bArr, iZzj6, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return zzdt.zzf(bArr, iZzj2, zzeyVarZzd, zzdsVar);
                }
                if (i11 == 0) {
                    return zzdt.zzl(i9, bArr, i7, i8, zzeyVarZzd, zzdsVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVarZzd;
                    int iZzj7 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i21 = zzdsVar.zza + iZzj7;
                    while (iZzj7 < i21) {
                        zzflVar3.zze(zzdt.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i21) {
                        return iZzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVarZzd;
                    zzflVar4.zze(zzdt.zzn(bArr, i7));
                    while (true) {
                        i16 = iZzj2 + 8;
                        if (i16 < i8) {
                            iZzj2 = zzdt.zzj(bArr, i16, zzdsVar);
                            if (i9 == zzdsVar.zza) {
                                zzflVar4.zze(zzdt.zzn(bArr, iZzj2));
                            }
                        }
                    }
                    return i16;
                }
                return iZzj2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    zzev zzevVar = (zzev) zzeyVarZzd;
                    int iZzj8 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i22 = zzdsVar.zza + iZzj8;
                    while (iZzj8 < i22) {
                        zzevVar.zze(zzdt.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i22) {
                        return iZzj8;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVarZzd;
                    zzevVar2.zze(zzdt.zzb(bArr, i7));
                    while (true) {
                        i17 = iZzj2 + 4;
                        if (i17 < i8) {
                            iZzj2 = zzdt.zzj(bArr, i17, zzdsVar);
                            if (i9 == zzdsVar.zza) {
                                zzevVar2.zze(zzdt.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i17;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i11 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVarZzd;
                    iZzj = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i23 = zzdsVar.zza + iZzj;
                    while (iZzj < i23) {
                        iZzj = zzdt.zzm(bArr, iZzj, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (iZzj != i23) {
                        throw zzfa.zzf();
                    }
                    return iZzj;
                }
                if (i11 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVarZzd;
                    int iZzm2 = zzdt.zzm(bArr, iZzj2, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (iZzm2 < i8) {
                        int iZzj9 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzdt.zzm(bArr, iZzj9, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i11 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj10 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                        int i24 = zzdsVar.zza;
                        if (i24 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i24 == 0) {
                            zzeyVarZzd.add("");
                        } else {
                            zzeyVarZzd.add(new String(bArr, iZzj10, i24, zzez.zzb));
                            iZzj10 += i24;
                        }
                        while (iZzj10 < i8) {
                            int iZzj11 = zzdt.zzj(bArr, iZzj10, zzdsVar);
                            if (i9 != zzdsVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzdt.zzj(bArr, iZzj11, zzdsVar);
                            int i25 = zzdsVar.zza;
                            if (i25 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i25 == 0) {
                                zzeyVarZzd.add("");
                            } else {
                                zzeyVarZzd.add(new String(bArr, iZzj10, i25, zzez.zzb));
                                iZzj10 += i25;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i26 = zzdsVar.zza;
                    if (i26 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i26 == 0) {
                        zzeyVarZzd.add("");
                    } else {
                        int i27 = iZzj12 + i26;
                        if (!zzhm.zzd(bArr, iZzj12, i27)) {
                            throw zzfa.zzb();
                        }
                        zzeyVarZzd.add(new String(bArr, iZzj12, i26, zzez.zzb));
                        iZzj12 = i27;
                    }
                    while (iZzj12 < i8) {
                        int iZzj13 = zzdt.zzj(bArr, iZzj12, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzdt.zzj(bArr, iZzj13, zzdsVar);
                        int i28 = zzdsVar.zza;
                        if (i28 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i28 == 0) {
                            zzeyVarZzd.add("");
                        } else {
                            int i29 = iZzj12 + i28;
                            if (!zzhm.zzd(bArr, iZzj12, i29)) {
                                throw zzfa.zzb();
                            }
                            zzeyVarZzd.add(new String(bArr, iZzj12, i28, zzez.zzb));
                            iZzj12 = i29;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 27:
                if (i11 == 2) {
                    return zzdt.zze(zzy(i12), i9, bArr, i7, i8, zzeyVarZzd, zzdsVar);
                }
                return iZzj2;
            case 28:
                if (i11 == 2) {
                    int iZzj14 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i30 = zzdsVar.zza;
                    if (i30 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i30 > bArr.length - iZzj14) {
                        throw zzfa.zzf();
                    }
                    if (i30 == 0) {
                        zzeyVarZzd.add(zzee.zzb);
                    } else {
                        zzeyVarZzd.add(zzee.zzk(bArr, iZzj14, i30));
                        iZzj14 += i30;
                    }
                    while (iZzj14 < i8) {
                        int iZzj15 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                        int i31 = zzdsVar.zza;
                        if (i31 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i31 > bArr.length - iZzj14) {
                            throw zzfa.zzf();
                        }
                        if (i31 == 0) {
                            zzeyVarZzd.add(zzee.zzb);
                        } else {
                            zzeyVarZzd.add(zzee.zzk(bArr, iZzj14, i31));
                            iZzj14 += i31;
                        }
                    }
                    return iZzj14;
                }
                return iZzj2;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        iZzj = zzdt.zzl(i9, bArr, i7, i8, zzeyVarZzd, zzdsVar);
                    }
                    return iZzj2;
                }
                iZzj = zzdt.zzf(bArr, iZzj2, zzeyVarZzd, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object objZzd = zzgj.zzd(i10, zzeyVarZzd, zzx(i12), zzgzVar, this.zzm);
                if (objZzd != null) {
                    zzeuVar.zzc = (zzgz) objZzd;
                    return iZzj;
                }
                return iZzj;
            case 33:
            case 47:
                if (i11 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVarZzd;
                    int iZzj16 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i32 = zzdsVar.zza + iZzj16;
                    while (iZzj16 < i32) {
                        iZzj16 = zzdt.zzj(bArr, iZzj16, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (iZzj16 == i32) {
                        return iZzj16;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVarZzd;
                    int iZzj17 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (iZzj17 < i8) {
                        int iZzj18 = zzdt.zzj(bArr, iZzj17, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return iZzj17;
                }
                return iZzj2;
            case 34:
            case 48:
                if (i11 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVarZzd;
                    int iZzj19 = zzdt.zzj(bArr, iZzj2, zzdsVar);
                    int i33 = zzdsVar.zza + iZzj19;
                    while (iZzj19 < i33) {
                        iZzj19 = zzdt.zzm(bArr, iZzj19, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (iZzj19 == i33) {
                        return iZzj19;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVarZzd;
                    int iZzm3 = zzdt.zzm(bArr, iZzj2, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (iZzm3 < i8) {
                        int iZzj20 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzdt.zzm(bArr, iZzj20, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i11 == 3) {
                    zzgh zzghVarZzy = zzy(i12);
                    int i34 = (i9 & (-8)) | 4;
                    int iZzc = zzdt.zzc(zzghVarZzy, bArr, i7, i8, i34, zzdsVar);
                    zzeyVarZzd.add(zzdsVar.zzc);
                    while (iZzc < i8) {
                        int iZzj21 = zzdt.zzj(bArr, iZzc, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzdt.zzc(zzghVarZzy, bArr, iZzj21, i8, i34, zzdsVar);
                        zzeyVarZzd.add(zzdsVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    private final int zzq(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzt(i7, 0);
    }

    private final int zzr(int i7, int i8) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzt(i7, i8);
    }

    private final int zzs(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzt(int i7, int i8) {
        int length = (this.zzc.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.zzc[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzv(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzw(Object obj, long j) {
        return ((Long) zzhi.zzf(obj, j)).longValue();
    }

    private final zzex zzx(int i7) {
        int i8 = i7 / 3;
        return (zzex) this.zzd[i8 + i8 + 1];
    }

    private final zzgh zzy(int i7) {
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzgh zzghVar = (zzgh) this.zzd[i9];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i9 + 1]);
        this.zzd[i9] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i7;
        int iZzc;
        int i8;
        int iZzc2;
        int length = this.zzc.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzv = zzv(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & iZzv;
            int iHashCode = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i7 = i9 * 53;
                    iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j)));
                    i9 = iZzc + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    iZzc = Float.floatToIntBits(zzhi.zzb(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 4:
                    i8 = i9 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 5:
                    i7 = i9 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 6:
                    i8 = i9 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 7:
                    i7 = i9 * 53;
                    iZzc = zzez.zza(zzhi.zzt(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 8:
                    i7 = i9 * 53;
                    iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                    i9 = iZzc + i7;
                    break;
                case 9:
                    Object objZzf = zzhi.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i9 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i9 = iZzc + i7;
                    break;
                case 11:
                    i8 = i9 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 12:
                    i8 = i9 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 13:
                    i8 = i9 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 14:
                    i7 = i9 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 15:
                    i8 = i9 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + iZzc2;
                    break;
                case 16:
                    i7 = i9 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = iZzc + i7;
                    break;
                case 17:
                    Object objZzf2 = zzhi.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
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
                    i7 = i9 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i9 = iZzc + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i9 = iZzc + i7;
                    break;
                case 51:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j)).doubleValue()));
                        i9 = iZzc + i7;
                    }
                    break;
                case 52:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j)).floatValue());
                        i9 = iZzc + i7;
                    }
                    break;
                case 53:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 54:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 55:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzl(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 56:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 57:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzl(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 58:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j)).booleanValue());
                        i9 = iZzc + i7;
                    }
                    break;
                case 59:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                        i9 = iZzc + i7;
                    }
                    break;
                case 60:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i9 = iZzc + i7;
                    }
                    break;
                case 61:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i9 = iZzc + i7;
                    }
                    break;
                case 62:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzl(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 63:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzl(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 64:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzl(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 65:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 66:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        iZzc2 = zzl(obj, j);
                        i9 = i8 + iZzc2;
                    }
                    break;
                case 67:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i9 = iZzc + i7;
                    }
                    break;
                case 68:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i9 = iZzc + i7;
                    }
                    break;
            }
        }
        return this.zzm.zza(obj).hashCode() + (i9 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x03ba A[PHI: r0 r18 r28
      0x03ba: PHI (r0v24 int) = (r0v19 int), (r0v22 int), (r0v26 int) binds: [B:135:0x041d, B:131:0x03fa, B:122:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x03ba: PHI (r18v5 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:135:0x041d, B:131:0x03fa, B:122:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x03ba: PHI (r28v7 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:135:0x041d, B:131:0x03fa, B:122:0x03b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:125:0x03d4 A[PHI: r0 r18 r28
      0x03d4: PHI (r0v23 int) = (r0v19 int), (r0v22 int), (r0v26 int) binds: [B:135:0x041d, B:131:0x03fa, B:122:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r18v4 int) = (r18v3 int), (r18v3 int), (r18v6 int) binds: [B:135:0x041d, B:131:0x03fa, B:122:0x03b8] A[DONT_GENERATE, DONT_INLINE]
      0x03d4: PHI (r28v6 sun.misc.Unsafe) = (r28v5 sun.misc.Unsafe), (r28v5 sun.misc.Unsafe), (r28v8 sun.misc.Unsafe) binds: [B:135:0x041d, B:131:0x03fa, B:122:0x03b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x008f. Please report as an issue. */
    public final int zzb(Object obj, byte[] bArr, int i7, int i8, int i9, zzds zzdsVar) throws zzfa {
        Unsafe unsafe;
        Object obj2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iZzm;
        int i24;
        this = this;
        obj = obj;
        bArr = bArr;
        i8 = i8;
        i9 = i9;
        zzdsVar = zzdsVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i7;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        int i29 = 1048575;
        while (true) {
            if (iZzi < i8) {
                int i30 = iZzi + 1;
                byte b7 = bArr[iZzi];
                if (b7 < 0) {
                    int iZzk = zzdt.zzk(b7, bArr, i30, zzdsVar);
                    i10 = zzdsVar.zza;
                    i30 = iZzk;
                } else {
                    i10 = b7;
                }
                int i31 = i10 >>> 3;
                int i32 = i10 & 7;
                int iZzr = i31 > i28 ? this.zzr(i31, i26 / 3) : this.zzq(i31);
                if (iZzr == -1) {
                    i11 = i31;
                    i12 = i10;
                    i13 = i27;
                    unsafe = unsafe2;
                    i9 = i9;
                    i14 = 0;
                    i15 = i30;
                } else {
                    int[] iArr = this.zzc;
                    int i33 = iArr[iZzr + 1];
                    int iZzu = zzu(i33);
                    int i34 = i30;
                    long j = i33 & 1048575;
                    int i35 = i10;
                    if (iZzu <= 17) {
                        int i36 = iArr[iZzr + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i29) {
                            if (i29 != 1048575) {
                                unsafe2.putInt(obj, i29, i27);
                            }
                            i16 = i38;
                            i18 = unsafe2.getInt(obj, i38);
                        } else {
                            i16 = i29;
                            i18 = i27;
                        }
                        switch (iZzu) {
                            case 0:
                                i21 = iZzr;
                                i20 = i34;
                                bArr = bArr;
                                i11 = i31;
                                if (i32 == 1) {
                                    zzhi.zzl(obj, j, Double.longBitsToDouble(zzdt.zzn(bArr, i20)));
                                    iZzi = i20 + 8;
                                    i27 = i18 | i37;
                                    i26 = i21;
                                    i28 = i11;
                                    i25 = i35;
                                    i29 = i16;
                                    i8 = i8;
                                } else {
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 1:
                                i21 = iZzr;
                                i20 = i34;
                                bArr = bArr;
                                i11 = i31;
                                if (i32 == 5) {
                                    zzhi.zzm(obj, j, Float.intBitsToFloat(zzdt.zzb(bArr, i20)));
                                    iZzi = i20 + 4;
                                    i27 = i18 | i37;
                                    i26 = i21;
                                    i28 = i11;
                                    i25 = i35;
                                    i29 = i16;
                                    i8 = i8;
                                } else {
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 2:
                            case 3:
                                i21 = iZzr;
                                i20 = i34;
                                bArr = bArr;
                                i11 = i31;
                                if (i32 == 0) {
                                    int iZzm2 = zzdt.zzm(bArr, i20, zzdsVar);
                                    unsafe2.putLong(obj, j, zzdsVar.zzb);
                                    i27 = i18 | i37;
                                    iZzi = iZzm2;
                                    i26 = i21;
                                    i28 = i11;
                                    i25 = i35;
                                    i29 = i16;
                                    i8 = i8;
                                } else {
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 4:
                            case 11:
                                i21 = iZzr;
                                i20 = i34;
                                bArr = bArr;
                                i11 = i31;
                                if (i32 == 0) {
                                    iZzi = zzdt.zzj(bArr, i20, zzdsVar);
                                    unsafe2.putInt(obj, j, zzdsVar.zza);
                                    i27 = i18 | i37;
                                    i26 = i21;
                                    i28 = i11;
                                    i25 = i35;
                                    i29 = i16;
                                    i8 = i8;
                                } else {
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 5:
                            case 14:
                                i20 = i34;
                                i22 = i35;
                                bArr = bArr;
                                i11 = i31;
                                i23 = iZzr;
                                if (i32 == 1) {
                                    i35 = i22;
                                    i21 = i23;
                                    unsafe2.putLong(obj, j, zzdt.zzn(bArr, i20));
                                    iZzi = i20 + 8;
                                    i27 = i18 | i37;
                                    i26 = i21;
                                    i28 = i11;
                                    i25 = i35;
                                    i29 = i16;
                                    i8 = i8;
                                } else {
                                    i35 = i22;
                                    i21 = i23;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 6:
                            case 13:
                                i20 = i34;
                                i22 = i35;
                                bArr = bArr;
                                i11 = i31;
                                i23 = iZzr;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj, j, zzdt.zzb(bArr, i20));
                                    iZzm = i20 + 4;
                                    int i39 = i18 | i37;
                                    i9 = i9;
                                    i26 = i23;
                                    iZzi = iZzm;
                                    i25 = i22;
                                    i29 = i16;
                                    i8 = i8;
                                    i27 = i39;
                                    i28 = i11;
                                } else {
                                    i35 = i22;
                                    i21 = i23;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 7:
                                i20 = i34;
                                i22 = i35;
                                bArr = bArr;
                                i11 = i31;
                                i23 = iZzr;
                                if (i32 == 0) {
                                    iZzm = zzdt.zzm(bArr, i20, zzdsVar);
                                    zzhi.zzk(obj, j, zzdsVar.zzb != 0);
                                    int i310 = i18 | i37;
                                    i9 = i9;
                                    i26 = i23;
                                    iZzi = iZzm;
                                    i25 = i22;
                                    i29 = i16;
                                    i8 = i8;
                                    i27 = i310;
                                    i28 = i11;
                                } else {
                                    i35 = i22;
                                    i21 = i23;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 8:
                                i20 = i34;
                                i22 = i35;
                                bArr = bArr;
                                i11 = i31;
                                i23 = iZzr;
                                if (i32 == 2) {
                                    iZzm = (536870912 & i33) == 0 ? zzdt.zzg(bArr, i20, zzdsVar) : zzdt.zzh(bArr, i20, zzdsVar);
                                    unsafe2.putObject(obj, j, zzdsVar.zzc);
                                    int i311 = i18 | i37;
                                    i9 = i9;
                                    i26 = i23;
                                    iZzi = iZzm;
                                    i25 = i22;
                                    i29 = i16;
                                    i8 = i8;
                                    i27 = i311;
                                    i28 = i11;
                                } else {
                                    i35 = i22;
                                    i21 = i23;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 9:
                                i19 = iZzr;
                                i20 = i34;
                                i24 = i35;
                                bArr = bArr;
                                i11 = i31;
                                if (i32 == 2) {
                                    iZzi = zzdt.zzd(this.zzy(i19), bArr, i20, i8, zzdsVar);
                                    if ((i18 & i37) == 0) {
                                        unsafe2.putObject(obj, j, zzdsVar.zzc);
                                    } else {
                                        unsafe2.putObject(obj, j, zzez.zzg(unsafe2.getObject(obj, j), zzdsVar.zzc));
                                    }
                                    int i40 = i18 | i37;
                                    i9 = i9;
                                    i26 = i19;
                                    i28 = i11;
                                    i29 = i16;
                                    i27 = i40;
                                    i25 = i24;
                                    i8 = i8;
                                } else {
                                    i35 = i24;
                                    i21 = i19;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 10:
                                i19 = iZzr;
                                i20 = i34;
                                i24 = i35;
                                bArr = bArr;
                                i11 = i31;
                                if (i32 == 2) {
                                    iZzi = zzdt.zza(bArr, i20, zzdsVar);
                                    unsafe2.putObject(obj, j, zzdsVar.zzc);
                                    i27 = i18 | i37;
                                    i26 = i19;
                                    i25 = i24;
                                    i28 = i11;
                                    i29 = i16;
                                    i8 = i8;
                                } else {
                                    i35 = i24;
                                    i21 = i19;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 12:
                                i19 = iZzr;
                                i20 = i34;
                                i24 = i35;
                                bArr = bArr;
                                i11 = i31;
                                if (i32 == 0) {
                                    iZzi = zzdt.zzj(bArr, i20, zzdsVar);
                                    int i41 = zzdsVar.zza;
                                    zzex zzexVarZzx = this.zzx(i19);
                                    if (zzexVarZzx == null || zzexVarZzx.zza()) {
                                        unsafe2.putInt(obj, j, i41);
                                        i27 = i18 | i37;
                                    } else {
                                        zzc(obj).zzf(i24, Long.valueOf(i41));
                                        i27 = i18;
                                    }
                                    i26 = i19;
                                    i25 = i24;
                                    i28 = i11;
                                    i29 = i16;
                                    i8 = i8;
                                } else {
                                    i35 = i24;
                                    i21 = i19;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 15:
                                i19 = iZzr;
                                i20 = i34;
                                i24 = i35;
                                bArr = bArr;
                                i11 = i31;
                                if (i32 == 0) {
                                    iZzi = zzdt.zzj(bArr, i20, zzdsVar);
                                    unsafe2.putInt(obj, j, zzei.zzb(zzdsVar.zza));
                                    i27 = i18 | i37;
                                    i26 = i19;
                                    i25 = i24;
                                    i28 = i11;
                                    i29 = i16;
                                    i8 = i8;
                                } else {
                                    i35 = i24;
                                    i21 = i19;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            case 16:
                                i19 = iZzr;
                                i20 = i34;
                                i11 = i31;
                                if (i32 == 0) {
                                    bArr = bArr;
                                    int iZzm3 = zzdt.zzm(bArr, i20, zzdsVar);
                                    i24 = i35;
                                    unsafe2.putLong(obj, j, zzei.zzc(zzdsVar.zzb));
                                    i27 = i18 | i37;
                                    i9 = i9;
                                    i26 = i19;
                                    iZzi = iZzm3;
                                    i25 = i24;
                                    i28 = i11;
                                    i29 = i16;
                                    i8 = i8;
                                } else {
                                    i35 = i35;
                                    i21 = i19;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                            default:
                                if (i32 == 3) {
                                    iZzi = zzdt.zzc(this.zzy(iZzr), bArr, i34, i8, (i31 << 3) | 4, zzdsVar);
                                    if ((i18 & i37) == 0) {
                                        unsafe2.putObject(obj, j, zzdsVar.zzc);
                                    } else {
                                        unsafe2.putObject(obj, j, zzez.zzg(unsafe2.getObject(obj, j), zzdsVar.zzc));
                                    }
                                    i27 = i18 | i37;
                                    bArr = bArr;
                                    i8 = i8;
                                    i9 = i9;
                                    i26 = iZzr;
                                    i25 = i35;
                                    i28 = i31;
                                    i29 = i16;
                                } else {
                                    i19 = iZzr;
                                    i20 = i34;
                                    i11 = i31;
                                    i21 = i19;
                                    i13 = i18;
                                    unsafe = unsafe2;
                                    i15 = i20;
                                    i14 = i21;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                break;
                        }
                    } else {
                        i11 = i31;
                        bArr = bArr;
                        if (iZzu != 27) {
                            i13 = i27;
                            i16 = i29;
                            if (iZzu <= 49) {
                                unsafe = unsafe2;
                                i14 = iZzr;
                                iZzi = zzp(obj, bArr, i34, i8, i35, i11, i32, iZzr, i33, iZzu, j, zzdsVar);
                                if (iZzi != i34) {
                                    i9 = i9;
                                    i28 = i11;
                                    i26 = i14;
                                    i25 = i35;
                                    i27 = i13;
                                    i29 = i16;
                                } else {
                                    i15 = iZzi;
                                    i12 = i35;
                                    i29 = i16;
                                }
                                unsafe2 = unsafe;
                            } else {
                                i17 = i34;
                                unsafe = unsafe2;
                                i14 = iZzr;
                                if (iZzu == 50) {
                                    if (i32 == 2) {
                                        iZzi = zzm(obj, bArr, i17, i8, i14, j, zzdsVar);
                                        if (iZzi != i17) {
                                            i9 = i9;
                                            i28 = i11;
                                            i26 = i14;
                                            i25 = i35;
                                            i27 = i13;
                                            i29 = i16;
                                        } else {
                                            i15 = iZzi;
                                        }
                                        unsafe2 = unsafe;
                                    }
                                    i12 = i35;
                                    i29 = i16;
                                } else {
                                    iZzi = zzn(obj, bArr, i17, i8, i35, i11, i32, i33, iZzu, j, i14, zzdsVar);
                                    if (iZzi != i17) {
                                        i9 = i9;
                                        i28 = i11;
                                        i26 = i14;
                                        i25 = i35;
                                        i27 = i13;
                                        i29 = i16;
                                    } else {
                                        i15 = iZzi;
                                        i12 = i35;
                                        i29 = i16;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i32 == 2) {
                            zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj, j);
                            if (!zzeyVarZzd.zzc()) {
                                int size = zzeyVarZzd.size();
                                zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj, j, zzeyVarZzd);
                            }
                            i25 = i35;
                            i16 = i29;
                            iZzi = zzdt.zze(this.zzy(iZzr), i25, bArr, i34, i8, zzeyVarZzd, zzdsVar);
                            i9 = i9;
                            i26 = iZzr;
                            i28 = i11;
                            i27 = i27;
                            i29 = i16;
                            i8 = i8;
                        } else {
                            i13 = i27;
                            i16 = i29;
                            i17 = i34;
                            unsafe = unsafe2;
                            i14 = iZzr;
                        }
                        i15 = i17;
                        i12 = i35;
                        i29 = i16;
                    }
                }
                if (i12 != i9 || i9 == 0) {
                    iZzi = zzdt.zzi(i12, bArr, i15, i8, zzc(obj), zzdsVar);
                    i9 = i9;
                    i25 = i12;
                    i28 = i11;
                    i26 = i14;
                    i27 = i13;
                    unsafe2 = unsafe;
                } else {
                    iZzi = i15;
                    i25 = i12;
                    i27 = i13;
                }
            } else {
                unsafe = unsafe2;
                i9 = i9;
            }
        }
        if (i29 != 1048575) {
            long j3 = i29;
            obj2 = obj;
            unsafe.putInt(obj2, j3, i27);
        } else {
            obj2 = obj;
        }
        for (int i42 = this.zzj; i42 < this.zzk; i42++) {
            int i43 = this.zzi[i42];
            int i44 = this.zzc[i43];
            Object objZzf = zzhi.zzf(obj2, zzv(i43) & 1048575);
            if (objZzf != null && zzx(i43) != null) {
                throw null;
            }
        }
        if (i9 == 0) {
            if (iZzi != i8) {
                throw zzfa.zzd();
            }
        } else if (iZzi > i8 || i25 != i9) {
            throw zzfa.zzd();
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i7;
        int i8 = this.zzj;
        while (true) {
            i7 = this.zzk;
            if (i8 >= i7) {
                break;
            }
            long jZzv = zzv(this.zzi[i8]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i8++;
        }
        int length = this.zzi.length;
        while (i7 < length) {
            this.zzl.zza(obj, this.zzi[i7]);
            i7++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzv = zzv(i7);
            long j = 1048575 & iZzv;
            int i8 = this.zzc[i7];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i7)) {
                        zzhi.zzl(obj, j, zzhi.zza(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 1:
                    if (zzG(obj2, i7)) {
                        zzhi.zzm(obj, j, zzhi.zzb(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 2:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 3:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 4:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 5:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 6:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 7:
                    if (zzG(obj2, i7)) {
                        zzhi.zzk(obj, j, zzhi.zzt(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 8:
                    if (zzG(obj2, i7)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i7);
                    break;
                case 10:
                    if (zzG(obj2, i7)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 11:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 12:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 13:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 14:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 15:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 16:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i7);
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j);
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
                    if (zzJ(obj2, i8, i7)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i8, i7);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i8, i7)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i8, i7);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i7);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i7, int i8, zzds zzdsVar) throws zzfa {
        if (this.zzh) {
            zzo(obj, bArr, i7, i8, zzdsVar);
        } else {
            zzb(obj, bArr, i7, i8, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzh;
        int length = this.zzc.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iZzv = zzv(i7);
            long j = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i7) || Double.doubleToLongBits(zzhi.zza(obj, j)) != Double.doubleToLongBits(zzhi.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i7) || Float.floatToIntBits(zzhi.zzb(obj, j)) != Float.floatToIntBits(zzhi.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i7) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i7) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i7) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i7) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i7) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i7) || zzhi.zzt(obj, j) != zzhi.zzt(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i7) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzF(obj, obj2, i7) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzF(obj, obj2, i7) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i7) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzF(obj, obj2, i7) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i7) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i7) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i7) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i7) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i7) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case zzbbd.zzt.zzm /* 21 */:
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
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                    break;
                case 50:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
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
                    long jZzs = zzs(i7) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i7;
        int i8;
        List list;
        zzgh zzghVarZzy;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.zzj) {
            int i13 = this.zzi[i12];
            int i14 = this.zzc[i13];
            int iZzv = zzv(i13);
            int i15 = this.zzc[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = zzb.getInt(obj, i16);
                }
                i8 = i11;
                i7 = i16;
            } else {
                i7 = i10;
                i8 = i11;
            }
            if ((268435456 & iZzv) != 0 && !zzH(obj, i13, i7, i8, i17)) {
                return false;
            }
            int iZzu = zzu(iZzv);
            if (iZzu == 9 || iZzu == 17) {
                if (zzH(obj, i13, i7, i8, i17) && !zzI(obj, iZzv, zzy(i13))) {
                    return false;
                }
            } else if (iZzu == 27) {
                list = (List) zzhi.zzf(obj, iZzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzghVarZzy = zzy(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!zzghVarZzy.zzi(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iZzu == 60 || iZzu == 68) {
                if (zzJ(obj, i14, i13) && !zzI(obj, iZzv, zzy(i13))) {
                    return false;
                }
            } else if (iZzu == 49) {
                list = (List) zzhi.zzf(obj, iZzv & 1048575);
                if (list.isEmpty()) {
                    zzghVarZzy = zzy(i13);
                    while (i9 < list.size()) {
                        if (!zzghVarZzy.zzi(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzu == 50 && !((zzfq) zzhi.zzf(obj, iZzv & 1048575)).isEmpty()) {
                throw null;
            }
            i12++;
            i10 = i7;
            i11 = i8;
        }
        return true;
    }
}
