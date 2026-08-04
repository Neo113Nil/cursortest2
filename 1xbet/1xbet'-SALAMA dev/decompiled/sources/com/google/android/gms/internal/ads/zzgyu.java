package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p031e1.k;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzgyu<T> implements zzgzk<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhad.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgyr zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzgzw zzm;
    private final zzgwr zzn;

    private zzgyu(int[] iArr, Object[] objArr, int i7, int i8, zzgyr zzgyrVar, boolean z4, int[] iArr2, int i9, int i10, zzgyx zzgyxVar, zzgye zzgyeVar, zzgzw zzgzwVar, zzgwr zzgwrVar, zzgym zzgymVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = zzgyrVar instanceof zzgxg;
        boolean z7 = false;
        if (zzgwrVar != null && (zzgyrVar instanceof zzgxc)) {
            z7 = true;
        }
        this.zzh = z7;
        this.zzj = iArr2;
        this.zzk = i9;
        this.zzl = i10;
        this.zzm = zzgzwVar;
        this.zzn = zzgwrVar;
        this.zzg = zzgyrVar;
    }

    private final Object zzA(Object obj, int i7) {
        zzgzk zzgzkVarZzx = zzx(i7);
        int iZzu = zzu(i7) & 1048575;
        if (!zzN(obj, i7)) {
            return zzgzkVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzgzkVarZzx.zze();
        if (object != null) {
            zzgzkVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i7, int i8) {
        zzgzk zzgzkVarZzx = zzx(i8);
        if (!zzR(obj, i7, i8)) {
            return zzgzkVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i8) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzgzkVarZzx.zze();
        if (object != null) {
            zzgzkVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i7) {
        if (zzN(obj2, i7)) {
            int iZzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzgzk zzgzkVarZzx = zzx(i7);
            if (!zzN(obj, i7)) {
                if (zzQ(object)) {
                    Object objZze = zzgzkVarZzx.zze();
                    zzgzkVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzgzkVarZzx.zze();
                zzgzkVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgzkVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i7) {
        int i8 = this.zzc[i7];
        if (zzR(obj2, i8, i7)) {
            int iZzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzgzk zzgzkVarZzx = zzx(i7);
            if (!zzR(obj, i8, i7)) {
                if (zzQ(object)) {
                    Object objZze = zzgzkVarZzx.zze();
                    zzgzkVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzgzkVarZzx.zze();
                zzgzkVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgzkVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i7, zzgze zzgzeVar) {
        long j = i7 & 1048575;
        if (zzM(i7)) {
            zzhad.zzv(obj, j, zzgzeVar.zzs());
        } else if (this.zzi) {
            zzhad.zzv(obj, j, zzgzeVar.zzr());
        } else {
            zzhad.zzv(obj, j, zzgzeVar.zzp());
        }
    }

    private final void zzH(Object obj, int i7) {
        int iZzr = zzr(i7);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzhad.zzt(obj, j, (1 << (iZzr >>> 20)) | zzhad.zzd(obj, j));
    }

    private final void zzI(Object obj, int i7, int i8) {
        zzhad.zzt(obj, zzr(i8) & 1048575, i7);
    }

    private final void zzJ(Object obj, int i7, Object obj2) {
        zzb.putObject(obj, zzu(i7) & 1048575, obj2);
        zzH(obj, i7);
    }

    private final void zzK(Object obj, int i7, int i8, Object obj2) {
        zzb.putObject(obj, zzu(i8) & 1048575, obj2);
        zzI(obj, i7, i8);
    }

    private final boolean zzL(Object obj, Object obj2, int i7) {
        return zzN(obj, i7) == zzN(obj2, i7);
    }

    private static boolean zzM(int i7) {
        return (i7 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i7) {
        int iZzr = zzr(i7);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzhad.zzd(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i7);
        long j3 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhad.zzb(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhad.zzc(obj, j3)) != 0;
            case 2:
                return zzhad.zzf(obj, j3) != 0;
            case 3:
                return zzhad.zzf(obj, j3) != 0;
            case 4:
                return zzhad.zzd(obj, j3) != 0;
            case 5:
                return zzhad.zzf(obj, j3) != 0;
            case 6:
                return zzhad.zzd(obj, j3) != 0;
            case 7:
                return zzhad.zzz(obj, j3);
            case 8:
                Object objZzh = zzhad.zzh(obj, j3);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzgvy) {
                    return !zzgvy.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhad.zzh(obj, j3) != null;
            case 10:
                return !zzgvy.zzb.equals(zzhad.zzh(obj, j3));
            case 11:
                return zzhad.zzd(obj, j3) != 0;
            case 12:
                return zzhad.zzd(obj, j3) != 0;
            case 13:
                return zzhad.zzd(obj, j3) != 0;
            case 14:
                return zzhad.zzf(obj, j3) != 0;
            case 15:
                return zzhad.zzd(obj, j3) != 0;
            case 16:
                return zzhad.zzf(obj, j3) != 0;
            case 17:
                return zzhad.zzh(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return zzN(obj, i7);
        }
        return (i9 & i10) != 0;
    }

    private static boolean zzP(Object obj, int i7, zzgzk zzgzkVar) {
        return zzgzkVar.zzl(zzhad.zzh(obj, i7 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgxg) {
            return ((zzgxg) obj).zzcd();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i7, int i8) {
        return zzhad.zzd(obj, (long) (zzr(i8) & 1048575)) == i7;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhad.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i7, Object obj, zzhal zzhalVar) {
        if (obj instanceof String) {
            zzhalVar.zzG(i7, (String) obj);
        } else {
            zzhalVar.zzd(i7, (zzgvy) obj);
        }
    }

    public static zzgzx zzd(Object obj) {
        zzgxg zzgxgVar = (zzgxg) obj;
        zzgzx zzgzxVar = zzgxgVar.zzt;
        if (zzgzxVar != zzgzx.zzc()) {
            return zzgzxVar;
        }
        zzgzx zzgzxVarZzf = zzgzx.zzf();
        zzgxgVar.zzt = zzgzxVarZzf;
        return zzgzxVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:129:0x0280  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    /* JADX WARN: Code duplicated, block: B:170:0x0349  */
    /* JADX WARN: Code duplicated, block: B:185:0x0395  */
    /* JADX WARN: Code duplicated, block: B:188:0x039d  */
    public static zzgyu zzm(Class cls, zzgyo zzgyoVar, zzgyx zzgyxVar, zzgye zzgyeVar, zzgzw zzgzwVar, zzgwr zzgwrVar, zzgym zzgymVar) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        int i15;
        char cCharAt3;
        int i16;
        char cCharAt4;
        int i17;
        char cCharAt5;
        int i18;
        char cCharAt6;
        int i19;
        char cCharAt7;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        int i24;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i25;
        int i26;
        int i27;
        Field fieldZzC;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldZzC2;
        int i34;
        Object obj2;
        Field fieldZzC3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        if (!(zzgyoVar instanceof zzgzd)) {
            throw null;
        }
        zzgzd zzgzdVar = (zzgzd) zzgyoVar;
        String strZzd = zzgzdVar.zzd();
        int length = strZzd.length();
        char c3 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i7 = i39 + 1;
                if (strZzd.charAt(i39) < 55296) {
                    break;
                }
                i39 = i7;
            }
        } else {
            i7 = 1;
        }
        int i40 = i7 + 1;
        int iCharAt3 = strZzd.charAt(i7);
        if (iCharAt3 >= 55296) {
            int i41 = iCharAt3 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                cCharAt13 = strZzd.charAt(i40);
                if (cCharAt13 < 55296) {
                    break;
                }
                i41 |= (cCharAt13 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            iCharAt3 = i41 | (cCharAt13 << i42);
            i40 = i38;
        }
        if (iCharAt3 == 0) {
            i10 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i8 = 0;
            i11 = 0;
            i9 = 0;
            iArr = zza;
            i12 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt4 = strZzd.charAt(i40);
            if (iCharAt4 >= 55296) {
                int i44 = iCharAt4 & 8191;
                int i45 = 13;
                while (true) {
                    i20 = i43 + 1;
                    cCharAt8 = strZzd.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i20;
                }
                iCharAt4 = i44 | (cCharAt8 << i45);
                i43 = i20;
            }
            int i46 = i43 + 1;
            int iCharAt5 = strZzd.charAt(i43);
            if (iCharAt5 >= 55296) {
                int i47 = iCharAt5 & 8191;
                int i48 = 13;
                while (true) {
                    i19 = i46 + 1;
                    cCharAt7 = strZzd.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i19;
                }
                iCharAt5 = i47 | (cCharAt7 << i48);
                i46 = i19;
            }
            int i49 = i46 + 1;
            int iCharAt6 = strZzd.charAt(i46);
            if (iCharAt6 >= 55296) {
                int i50 = iCharAt6 & 8191;
                int i51 = 13;
                while (true) {
                    i18 = i49 + 1;
                    cCharAt6 = strZzd.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i18;
                }
                iCharAt6 = i50 | (cCharAt6 << i51);
                i49 = i18;
            }
            int i52 = i49 + 1;
            int iCharAt7 = strZzd.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i17 = i52 + 1;
                    cCharAt5 = strZzd.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i17;
                }
                iCharAt7 = i53 | (cCharAt5 << i54);
                i52 = i17;
            }
            int i55 = i52 + 1;
            iCharAt = strZzd.charAt(i52);
            if (iCharAt >= 55296) {
                int i56 = iCharAt & 8191;
                int i57 = 13;
                while (true) {
                    i16 = i55 + 1;
                    cCharAt4 = strZzd.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i16;
                }
                iCharAt = i56 | (cCharAt4 << i57);
                i55 = i16;
            }
            int i58 = i55 + 1;
            iCharAt2 = strZzd.charAt(i55);
            if (iCharAt2 >= 55296) {
                int i59 = iCharAt2 & 8191;
                int i60 = 13;
                while (true) {
                    i15 = i58 + 1;
                    cCharAt3 = strZzd.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i15;
                }
                iCharAt2 = i59 | (cCharAt3 << i60);
                i58 = i15;
            }
            int i61 = i58 + 1;
            int iCharAt8 = strZzd.charAt(i58);
            if (iCharAt8 >= 55296) {
                int i62 = iCharAt8 & 8191;
                int i63 = 13;
                while (true) {
                    i14 = i61 + 1;
                    cCharAt2 = strZzd.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i14;
                }
                iCharAt8 = i62 | (cCharAt2 << i63);
                i61 = i14;
            }
            int i64 = i61 + 1;
            int iCharAt9 = strZzd.charAt(i61);
            if (iCharAt9 >= 55296) {
                int i65 = iCharAt9 & 8191;
                int i66 = 13;
                while (true) {
                    i13 = i64 + 1;
                    cCharAt = strZzd.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i64 = i13;
                }
                iCharAt9 = i65 | (cCharAt << i66);
                i64 = i13;
            }
            int i67 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i8 = iCharAt6;
            i9 = iCharAt9;
            i10 = i67;
            iArr = iArr2;
            i11 = iCharAt7;
            i12 = iCharAt4;
            i40 = i64;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzgzdVar.zze();
        Class<?> cls2 = zzgzdVar.zza().getClass();
        int i68 = i9 + iCharAt2;
        int i69 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = i9;
        int i71 = i68;
        int i72 = 0;
        int i73 = 0;
        while (i40 < length) {
            int i74 = i40 + 1;
            int iCharAt10 = strZzd.charAt(i40);
            if (iCharAt10 >= c3) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i37 = i76 + 1;
                    cCharAt12 = strZzd.charAt(i76);
                    if (cCharAt12 < c3) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i37;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i21 = i37;
            } else {
                i21 = i74;
            }
            int i78 = i21 + 1;
            int iCharAt11 = strZzd.charAt(i21);
            if (iCharAt11 >= c3) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i36 = i80 + 1;
                    cCharAt11 = strZzd.charAt(i80);
                    if (cCharAt11 < c3) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i36;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i22 = i36;
            } else {
                i22 = i78;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int i82 = iCharAt11 & 255;
            int i83 = length;
            int i84 = iCharAt11 & 2048;
            int i85 = i11;
            if (i82 >= 51) {
                int i86 = i22 + 1;
                int iCharAt12 = strZzd.charAt(i22);
                if (iCharAt12 >= 55296) {
                    int i87 = iCharAt12 & 8191;
                    int i88 = i86;
                    int i89 = 13;
                    while (true) {
                        i35 = i88 + 1;
                        cCharAt10 = strZzd.charAt(i88);
                        i23 = i8;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i87 |= (cCharAt10 & 8191) << i89;
                        i89 += 13;
                        i88 = i35;
                        i8 = i23;
                    }
                    iCharAt12 = i87 | (cCharAt10 << i89);
                    i31 = i35;
                } else {
                    i23 = i8;
                    i31 = i86;
                }
                int i90 = i82 - 51;
                int i91 = i31;
                if (i90 == 9 || i90 == 17) {
                    i32 = i10 + 1;
                    int i92 = i73 / 3;
                    objArr[i92 + i92 + 1] = objArrZze[i10];
                } else {
                    if (i90 == 12) {
                        if (zzgzdVar.zzc() == 1 || i84 != 0) {
                            i32 = i10 + 1;
                            int i93 = i73 / 3;
                            objArr[i93 + i93 + 1] = objArrZze[i10];
                        } else {
                            i84 = 0;
                        }
                    }
                    i33 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i33];
                    if (obj instanceof Field) {
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i33] = fieldZzC2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i34 = i33 + 1;
                    obj2 = objArrZze[i34];
                    int i94 = i84;
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i34] = fieldZzC3;
                    }
                    i24 = i10;
                    i25 = i91;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                    i26 = 0;
                    strZzd = strZzd;
                    zzgzdVar = zzgzdVar;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i27 = i94;
                }
                i10 = i32;
                i33 = iCharAt12 + iCharAt12;
                obj = objArrZze[i33];
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i33] = fieldZzC2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzC2);
                i34 = i33 + 1;
                obj2 = objArrZze[i34];
                int i95 = i84;
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i34] = fieldZzC3;
                }
                i24 = i10;
                i25 = i91;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                i26 = 0;
                strZzd = strZzd;
                zzgzdVar = zzgzdVar;
                iObjectFieldOffset = iObjectFieldOffset4;
                i27 = i95;
            } else {
                i23 = i8;
                i24 = i10 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i10]);
                if (i82 == 9 || i82 == 17) {
                    int i96 = i73 / 3;
                    objArr[i96 + i96 + 1] = fieldZzC4.getType();
                } else {
                    if (i82 != 27) {
                        if (i82 == 49) {
                            i30 = i10 + 2;
                            i29 = 1;
                        } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                            zzgzdVar = zzgzdVar;
                            if (zzgzdVar.zzc() == 1 || i84 != 0) {
                                i30 = i10 + 2;
                                int i97 = i73 / 3;
                                objArr[i97 + i97 + 1] = objArrZze[i24];
                                i24 = i30;
                            } else {
                                i84 = 0;
                            }
                        } else if (i82 == 50) {
                            int i98 = i10 + 2;
                            int i99 = i70 + 1;
                            iArr[i70] = i73;
                            int i100 = i73 / 3;
                            int i101 = i100 + i100;
                            objArr[i101] = objArrZze[i24];
                            if (i84 != 0) {
                                i24 = i10 + 3;
                                objArr[i101 + 1] = objArrZze[i98];
                                i70 = i99;
                                zzgzdVar = zzgzdVar;
                            } else {
                                i24 = i98;
                                i70 = i99;
                                i84 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            i25 = i22;
                            i26 = 0;
                        } else {
                            int i102 = i22 + 1;
                            int iCharAt13 = strZzd.charAt(i22);
                            if (iCharAt13 >= 55296) {
                                int i103 = iCharAt13 & 8191;
                                int i104 = 13;
                                while (true) {
                                    i28 = i102 + 1;
                                    cCharAt9 = strZzd.charAt(i102);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i103 |= (cCharAt9 & 8191) << i104;
                                    i104 += 13;
                                    i102 = i28;
                                }
                                iCharAt13 = i103 | (cCharAt9 << i104);
                                i102 = i28;
                            }
                            int i105 = (iCharAt13 / 32) + i12 + i12;
                            Object obj3 = objArrZze[i105];
                            if (obj3 instanceof Field) {
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i105] = fieldZzC;
                            }
                            i25 = i102;
                            i26 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                        }
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i71] = iObjectFieldOffset;
                            i71++;
                        }
                        i27 = i84;
                    } else {
                        i29 = 1;
                        i30 = i10 + 2;
                    }
                    int i106 = i73 / 3;
                    objArr[i106 + i106 + i29] = objArrZze[i24];
                    i24 = i30;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i25 = i22;
                        i26 = 0;
                    } else {
                        i25 = i22;
                        i26 = 0;
                    }
                    if (i82 >= 18) {
                        iArr[i71] = iObjectFieldOffset;
                        i71++;
                    }
                    i27 = i84;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i25 = i22;
                    i26 = 0;
                } else {
                    i25 = i22;
                    i26 = 0;
                }
                if (i82 >= 18) {
                    iArr[i71] = iObjectFieldOffset;
                    i71++;
                }
                i27 = i84;
            }
            int i107 = i73 + 1;
            iArr3[i73] = iCharAt10;
            int i108 = i73 + 2;
            Class<?> cls3 = cls2;
            iArr3[i107] = iObjectFieldOffset | (i27 != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i82 << 20);
            i73 += 3;
            iArr3[i108] = (i26 << 20) | iObjectFieldOffset2;
            strZzd = strZzd;
            i10 = i24;
            i40 = i25;
            length = i83;
            i11 = i85;
            cls2 = cls3;
            zzgzdVar = zzgzdVar;
            i8 = i23;
            c3 = 55296;
        }
        return new zzgyu(iArr3, objArr, i8, i11, zzgzdVar.zza(), false, iArr, i9, i68, zzgyxVar, zzgyeVar, zzgzwVar, zzgwrVar, zzgymVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhad.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhad.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhad.zzh(obj, j)).intValue();
    }

    private final int zzq(int i7) {
        if (i7 < this.zze || i7 > this.zzf) {
            return -1;
        }
        return zzs(i7, 0);
    }

    private final int zzr(int i7) {
        return this.zzc[i7 + 2];
    }

    private final int zzs(int i7, int i8) {
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

    private static int zzt(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int zzu(int i7) {
        return this.zzc[i7 + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzhad.zzh(obj, j)).longValue();
    }

    private final zzgxm zzw(int i7) {
        int i8 = i7 / 3;
        return (zzgxm) this.zzd[i8 + i8 + 1];
    }

    private final zzgzk zzx(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzgzk zzgzkVar = (zzgzk) objArr[i9];
        if (zzgzkVar != null) {
            return zzgzkVar;
        }
        zzgzk zzgzkVarZzb = zzgzb.zza().zzb((Class) objArr[i9 + 1]);
        this.zzd[i9] = zzgzkVarZzb;
        return zzgzkVarZzb;
    }

    private final Object zzy(Object obj, int i7, Object obj2, zzgzw zzgzwVar, Object obj3) {
        int i8 = this.zzc[i7];
        Object objZzh = zzhad.zzh(obj, zzu(i7) & 1048575);
        if (objZzh == null || zzw(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.ads.zzgzk
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyu.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final int zzb(Object obj) {
        int i7;
        long jDoubleToLongBits;
        int i8;
        int iFloatToIntBits;
        int iZzd;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int iZzu = zzu(i11);
            int[] iArr = this.zzc;
            int i12 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i13 = iArr[i11];
            long j = i12;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i7 = i10 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhad.zzb(obj, j));
                    byte[] bArr = zzgxt.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzd;
                    break;
                case 1:
                    i8 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhad.zzc(obj, j));
                    i10 = iFloatToIntBits + i8;
                    break;
                case 2:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr2 = zzgxt.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzd;
                    break;
                case 3:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr3 = zzgxt.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzd;
                    break;
                case 4:
                    i7 = i10 * 53;
                    iZzd = zzhad.zzd(obj, j);
                    i10 = i7 + iZzd;
                    break;
                case 5:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr4 = zzgxt.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzd;
                    break;
                case 6:
                    i7 = i10 * 53;
                    iZzd = zzhad.zzd(obj, j);
                    i10 = i7 + iZzd;
                    break;
                case 7:
                    i8 = i10 * 53;
                    iFloatToIntBits = zzgxt.zza(zzhad.zzz(obj, j));
                    i10 = iFloatToIntBits + i8;
                    break;
                case 8:
                    i8 = i10 * 53;
                    iFloatToIntBits = ((String) zzhad.zzh(obj, j)).hashCode();
                    i10 = iFloatToIntBits + i8;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object objZzh = zzhad.zzh(obj, j);
                    if (objZzh != null) {
                        iHashCode = objZzh.hashCode();
                    }
                    i10 = i9 + iHashCode;
                    break;
                case 10:
                    i8 = i10 * 53;
                    iFloatToIntBits = zzhad.zzh(obj, j).hashCode();
                    i10 = iFloatToIntBits + i8;
                    break;
                case 11:
                    i7 = i10 * 53;
                    iZzd = zzhad.zzd(obj, j);
                    i10 = i7 + iZzd;
                    break;
                case 12:
                    i7 = i10 * 53;
                    iZzd = zzhad.zzd(obj, j);
                    i10 = i7 + iZzd;
                    break;
                case 13:
                    i7 = i10 * 53;
                    iZzd = zzhad.zzd(obj, j);
                    i10 = i7 + iZzd;
                    break;
                case 14:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr5 = zzgxt.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzd;
                    break;
                case 15:
                    i7 = i10 * 53;
                    iZzd = zzhad.zzd(obj, j);
                    i10 = i7 + iZzd;
                    break;
                case 16:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr6 = zzgxt.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzd;
                    break;
                case 17:
                    i9 = i10 * 53;
                    Object objZzh2 = zzhad.zzh(obj, j);
                    if (objZzh2 != null) {
                        iHashCode = objZzh2.hashCode();
                    }
                    i10 = i9 + iHashCode;
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
                    i8 = i10 * 53;
                    iFloatToIntBits = zzhad.zzh(obj, j).hashCode();
                    i10 = iFloatToIntBits + i8;
                    break;
                case 50:
                    i8 = i10 * 53;
                    iFloatToIntBits = zzhad.zzh(obj, j).hashCode();
                    i10 = iFloatToIntBits + i8;
                    break;
                case 51:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzgxt.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzd;
                    }
                    break;
                case 52:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
                case 53:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzgxt.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzd;
                    }
                    break;
                case 54:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzgxt.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzd;
                    }
                    break;
                case 55:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzd = zzp(obj, j);
                        i10 = i7 + iZzd;
                    }
                    break;
                case 56:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzgxt.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzd;
                    }
                    break;
                case 57:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzd = zzp(obj, j);
                        i10 = i7 + iZzd;
                    }
                    break;
                case 58:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = zzgxt.zza(zzS(obj, j));
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
                case 59:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = ((String) zzhad.zzh(obj, j)).hashCode();
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
                case 60:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = zzhad.zzh(obj, j).hashCode();
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
                case 61:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = zzhad.zzh(obj, j).hashCode();
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
                case 62:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzd = zzp(obj, j);
                        i10 = i7 + iZzd;
                    }
                    break;
                case 63:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzd = zzp(obj, j);
                        i10 = i7 + iZzd;
                    }
                    break;
                case 64:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzd = zzp(obj, j);
                        i10 = i7 + iZzd;
                    }
                    break;
                case 65:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzgxt.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzd;
                    }
                    break;
                case 66:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzd = zzp(obj, j);
                        i10 = i7 + iZzd;
                    }
                    break;
                case 67:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzgxt.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzd;
                    }
                    break;
                case 68:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = zzhad.zzh(obj, j).hashCode();
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zzgxg) obj).zzt.hashCode() + (i10 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzgxc) obj).zza.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:403:0x09a4 A[PHI: r6 r7 r8 r10 r11 r12 r14 r19
      0x09a4: PHI (r6v30 com.google.android.gms.internal.ads.zzgvm) = 
      (r6v12 com.google.android.gms.internal.ads.zzgvm)
      (r6v14 com.google.android.gms.internal.ads.zzgvm)
      (r6v15 com.google.android.gms.internal.ads.zzgvm)
      (r6v17 com.google.android.gms.internal.ads.zzgvm)
      (r6v23 com.google.android.gms.internal.ads.zzgvm)
      (r12v31 com.google.android.gms.internal.ads.zzgvm)
      (r6v35 com.google.android.gms.internal.ads.zzgvm)
     binds: [B:397:0x097b, B:377:0x090b, B:357:0x08a4, B:340:0x083e, B:270:0x06ff, B:166:0x0511, B:149:0x04b0] A[DONT_GENERATE, DONT_INLINE]
      0x09a4: PHI (r7v33 int) = (r7v12 int), (r7v14 int), (r7v15 int), (r7v17 int), (r7v23 int), (r7v30 int), (r7v39 int) binds: [B:397:0x097b, B:377:0x090b, B:357:0x08a4, B:340:0x083e, B:270:0x06ff, B:166:0x0511, B:149:0x04b0] A[DONT_GENERATE, DONT_INLINE]
      0x09a4: PHI (r8v142 sun.misc.Unsafe) = 
      (r8v87 sun.misc.Unsafe)
      (r8v89 sun.misc.Unsafe)
      (r8v90 sun.misc.Unsafe)
      (r8v92 sun.misc.Unsafe)
      (r8v119 sun.misc.Unsafe)
      (r8v141 sun.misc.Unsafe)
      (r8v146 sun.misc.Unsafe)
     binds: [B:397:0x097b, B:377:0x090b, B:357:0x08a4, B:340:0x083e, B:270:0x06ff, B:166:0x0511, B:149:0x04b0] A[DONT_GENERATE, DONT_INLINE]
      0x09a4: PHI (r10v79 int) = (r10v56 int), (r10v58 int), (r10v59 int), (r10v61 int), (r10v71 int), (r10v78 int), (r10v84 int) binds: [B:397:0x097b, B:377:0x090b, B:357:0x08a4, B:340:0x083e, B:270:0x06ff, B:166:0x0511, B:149:0x04b0] A[DONT_GENERATE, DONT_INLINE]
      0x09a4: PHI (r11v94 int) = (r11v64 int), (r11v66 int), (r11v67 int), (r11v69 int), (r11v77 int), (r11v91 int), (r11v102 int) binds: [B:397:0x097b, B:377:0x090b, B:357:0x08a4, B:340:0x083e, B:270:0x06ff, B:166:0x0511, B:149:0x04b0] A[DONT_GENERATE, DONT_INLINE]
      0x09a4: PHI (r12v67 int) = (r12v49 int), (r12v51 int), (r12v52 int), (r12v54 int), (r12v57 int), (r12v66 int), (r12v70 int) binds: [B:397:0x097b, B:377:0x090b, B:357:0x08a4, B:340:0x083e, B:270:0x06ff, B:166:0x0511, B:149:0x04b0] A[DONT_GENERATE, DONT_INLINE]
      0x09a4: PHI (r14v56 boolean) = 
      (r14v40 boolean)
      (r14v42 boolean)
      (r14v43 boolean)
      (r14v45 boolean)
      (r14v49 boolean)
      (r14v55 boolean)
      (r14v60 boolean)
     binds: [B:397:0x097b, B:377:0x090b, B:357:0x08a4, B:340:0x083e, B:270:0x06ff, B:166:0x0511, B:149:0x04b0] A[DONT_GENERATE, DONT_INLINE]
      0x09a4: PHI (r19v74 int) = (r19v53 int), (r19v55 int), (r19v56 int), (r19v60 int), (r19v66 int), (r8v57 int), (r19v79 int) binds: [B:397:0x097b, B:377:0x090b, B:357:0x08a4, B:340:0x083e, B:270:0x06ff, B:166:0x0511, B:149:0x04b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:492:0x0cd4 A[PHI: r0 r2 r8 r10 r19 r22 r35
      0x0cd4: PHI (r0v100 int) = (r0v71 int), (r0v72 int), (r0v78 int), (r0v83 int), (r0v91 int), (r0v97 int), (r0v101 int) binds: [B:490:0x0cbd, B:487:0x0c97, B:466:0x0bcf, B:450:0x0b7c, B:431:0x0ac0, B:425:0x0a84, B:420:0x0a3e] A[DONT_GENERATE, DONT_INLINE]
      0x0cd4: PHI (r2v80 com.google.android.gms.internal.ads.zzgvm) = 
      (r2v63 com.google.android.gms.internal.ads.zzgvm)
      (r2v64 com.google.android.gms.internal.ads.zzgvm)
      (r2v70 com.google.android.gms.internal.ads.zzgvm)
      (r2v73 com.google.android.gms.internal.ads.zzgvm)
      (r2v76 com.google.android.gms.internal.ads.zzgvm)
      (r2v78 com.google.android.gms.internal.ads.zzgvm)
      (r2v81 com.google.android.gms.internal.ads.zzgvm)
     binds: [B:490:0x0cbd, B:487:0x0c97, B:466:0x0bcf, B:450:0x0b7c, B:431:0x0ac0, B:425:0x0a84, B:420:0x0a3e] A[DONT_GENERATE, DONT_INLINE]
      0x0cd4: PHI (r8v85 int) = (r8v60 int), (r8v61 int), (r8v67 int), (r8v70 int), (r8v74 int), (r8v79 int), (r8v86 int) binds: [B:490:0x0cbd, B:487:0x0c97, B:466:0x0bcf, B:450:0x0b7c, B:431:0x0ac0, B:425:0x0a84, B:420:0x0a3e] A[DONT_GENERATE, DONT_INLINE]
      0x0cd4: PHI (r10v54 int) = (r10v21 int), (r10v22 int), (r10v28 int), (r10v33 int), (r10v43 int), (r10v49 int), (r10v55 int) binds: [B:490:0x0cbd, B:487:0x0c97, B:466:0x0bcf, B:450:0x0b7c, B:431:0x0ac0, B:425:0x0a84, B:420:0x0a3e] A[DONT_GENERATE, DONT_INLINE]
      0x0cd4: PHI (r19v51 int) = (r19v30 int), (r19v31 int), (r19v37 int), (r19v40 int), (r19v44 int), (r19v48 int), (r19v52 int) binds: [B:490:0x0cbd, B:487:0x0c97, B:466:0x0bcf, B:450:0x0b7c, B:431:0x0ac0, B:425:0x0a84, B:420:0x0a3e] A[DONT_GENERATE, DONT_INLINE]
      0x0cd4: PHI (r22v24 int) = (r22v6 int), (r22v7 int), (r22v13 int), (r22v16 int), (r22v18 int), (r22v21 int), (r22v25 int) binds: [B:490:0x0cbd, B:487:0x0c97, B:466:0x0bcf, B:450:0x0b7c, B:431:0x0ac0, B:425:0x0a84, B:420:0x0a3e] A[DONT_GENERATE, DONT_INLINE]
      0x0cd4: PHI (r35v37 sun.misc.Unsafe) = 
      (r35v15 sun.misc.Unsafe)
      (r35v16 sun.misc.Unsafe)
      (r35v22 sun.misc.Unsafe)
      (r35v25 sun.misc.Unsafe)
      (r35v29 sun.misc.Unsafe)
      (r35v34 sun.misc.Unsafe)
      (r35v38 sun.misc.Unsafe)
     binds: [B:490:0x0cbd, B:487:0x0c97, B:466:0x0bcf, B:450:0x0b7c, B:431:0x0ac0, B:425:0x0a84, B:420:0x0a3e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:494:0x0cd7  */
    /* JADX WARN: Code duplicated, block: B:496:0x0cec  */
    /* JADX WARN: Code duplicated, block: B:510:0x0d30  */
    /* JADX WARN: Code duplicated, block: B:571:0x09a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x09c1 A[SYNTHETIC] */
    public final int zzc(Object obj, byte[] bArr, int i7, int i8, int i9, zzgvm zzgvmVar) {
        int i10;
        Unsafe unsafe;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iZzg;
        int i19;
        zzgvm zzgvmVar2;
        int i20;
        int i21;
        boolean z4;
        int iZzh;
        int i22;
        boolean z7;
        int i23;
        int iZzh2;
        Unsafe unsafe2;
        boolean z8;
        boolean z9;
        int i24;
        zzgvm zzgvmVar3;
        Unsafe unsafe3;
        int i25;
        int i26;
        int i27;
        int i28;
        int iZzk;
        int i29;
        int i30;
        zzgvm zzgvmVar4;
        int i31;
        int iZza;
        int i32;
        int i33;
        boolean z10;
        Unsafe unsafe4;
        int i34;
        int i35;
        int iZzh3;
        Unsafe unsafe5;
        int i36;
        int i37;
        int i38;
        int iZzf;
        int iZzh4;
        int iZzk2;
        Object obj2;
        int i39;
        int iZzj;
        zzgyu<T> zzgyuVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        i8 = i8;
        i9 = i9;
        zzgvm zzgvmVar5 = zzgvmVar;
        int i40 = 3;
        zzD(obj);
        Unsafe unsafe6 = zzb;
        int i41 = -1;
        int iZzl = i7;
        int i42 = -1;
        int iZzs = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 1048575;
        while (true) {
            if (iZzl < i8) {
                int iZzi = iZzl + 1;
                int i46 = bArr2[iZzl];
                if (i46 < 0) {
                    iZzi = zzgvn.zzi(i46, bArr2, iZzi, zzgvmVar5);
                    i46 = zzgvmVar5.zza;
                }
                int i47 = i46 >>> 3;
                iZzs = i47 > i42 ? (i47 < zzgyuVar.zze || i47 > zzgyuVar.zzf) ? i41 : zzgyuVar.zzs(i47, iZzs / i40) : zzgyuVar.zzq(i47);
                if (iZzs == i41) {
                    i13 = i40;
                    i9 = i9;
                    i14 = i46;
                    i15 = i47;
                    i16 = i41;
                    unsafe = unsafe6;
                    i17 = 0;
                } else {
                    int i48 = i46 & 7;
                    int[] iArr = zzgyuVar.zzc;
                    int i49 = iArr[iZzs + 1];
                    int iZzt = zzt(i49);
                    long j = i49 & 1048575;
                    int i50 = i46;
                    if (iZzt <= 17) {
                        int i51 = iArr[iZzs + 2];
                        int i52 = 1 << (i51 >>> 20);
                        int i53 = 1048575;
                        int i54 = i51 & 1048575;
                        if (i54 != i45) {
                            if (i45 != 1048575) {
                                unsafe6.putInt(obj3, i45, i43);
                                i53 = 1048575;
                            }
                            i19 = i54 == i53 ? 0 : unsafe6.getInt(obj3, i54);
                            i45 = i54;
                        } else {
                            i19 = i43;
                            i45 = i45;
                        }
                        switch (iZzt) {
                            case 0:
                                zzgvmVar2 = zzgvmVar;
                                i20 = i47;
                                z4 = true;
                                i16 = -1;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 1) {
                                    iZzh = iZzi + 8;
                                    i19 |= i52;
                                    zzhad.zzr(obj3, j, Double.longBitsToDouble(zzgvn.zzn(bArr2, iZzi)));
                                    z8 = z4;
                                    zzgvmVar5 = zzgvmVar2;
                                    i44 = i21;
                                    i42 = i20;
                                    i41 = i16;
                                    iZzl = iZzh;
                                    i45 = i45;
                                    i43 = i19;
                                    i40 = 3;
                                } else {
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 1:
                                zzgvmVar2 = zzgvmVar;
                                i20 = i47;
                                z4 = true;
                                i16 = -1;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 5) {
                                    iZzh = iZzi + 4;
                                    i19 |= i52;
                                    zzhad.zzs(obj3, j, Float.intBitsToFloat(zzgvn.zzb(bArr2, iZzi)));
                                    z8 = z4;
                                    zzgvmVar5 = zzgvmVar2;
                                    i44 = i21;
                                    i42 = i20;
                                    i41 = i16;
                                    iZzl = iZzh;
                                    i45 = i45;
                                    i43 = i19;
                                    i40 = 3;
                                } else {
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 2:
                            case 3:
                                zzgvmVar2 = zzgvmVar;
                                i20 = i47;
                                i16 = -1;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 0) {
                                    i22 = i19 | i52;
                                    int iZzk3 = zzgvn.zzk(bArr2, iZzi, zzgvmVar2);
                                    unsafe6.putLong(obj, j, zzgvmVar2.zzb);
                                    i8 = i8;
                                    zzgvmVar5 = zzgvmVar2;
                                    i44 = i21 == true ? 1 : 0;
                                    iZzl = iZzk3;
                                    i41 = -1;
                                    i40 = 3;
                                    i43 = i22;
                                    i42 = i20;
                                } else {
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 4:
                            case 11:
                                zzgvmVar2 = zzgvmVar;
                                i20 = i47;
                                z7 = true;
                                i16 = -1;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 0) {
                                    i23 = i19 | i52;
                                    iZzh2 = zzgvn.zzh(bArr2, iZzi, zzgvmVar2);
                                    unsafe6.putInt(obj3, j, zzgvmVar2.zza);
                                    zzgvmVar5 = zzgvmVar2;
                                    z9 = z7;
                                    i44 = i21;
                                    i42 = i20;
                                    i41 = i16;
                                    iZzl = iZzh2;
                                    i40 = 3;
                                    i43 = i23;
                                    i45 = i45;
                                } else {
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 5:
                            case 14:
                                zzgvmVar2 = zzgvmVar;
                                i20 = i47;
                                i16 = -1;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 1) {
                                    int i55 = i52 | i19;
                                    unsafe6.putLong(obj, j, zzgvn.zzn(bArr2, iZzi));
                                    i8 = i8;
                                    i9 = i9;
                                    zzgvmVar5 = zzgvmVar2;
                                    iZzl = iZzi + 8;
                                    i44 = i21 == true ? 1 : 0;
                                    i45 = i45;
                                    i42 = i20;
                                    i40 = 3;
                                    i43 = i55;
                                    i41 = -1;
                                } else {
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 6:
                            case 13:
                                zzgvmVar2 = zzgvmVar;
                                i20 = i47;
                                z4 = true;
                                i16 = -1;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 5) {
                                    iZzh = iZzi + 4;
                                    i19 |= i52;
                                    unsafe6.putInt(obj3, j, zzgvn.zzb(bArr2, iZzi));
                                    z8 = z4;
                                    zzgvmVar5 = zzgvmVar2;
                                    i44 = i21;
                                    i42 = i20;
                                    i41 = i16;
                                    iZzl = iZzh;
                                    i45 = i45;
                                    i43 = i19;
                                    i40 = 3;
                                } else {
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 7:
                                zzgvmVar2 = zzgvmVar;
                                i20 = i47;
                                z7 = true;
                                i16 = -1;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 0) {
                                    i23 = i19 | i52;
                                    iZzh2 = zzgvn.zzk(bArr2, iZzi, zzgvmVar2);
                                    zzhad.zzp(obj3, j, zzgvmVar2.zzb != 0);
                                    zzgvmVar5 = zzgvmVar2;
                                    z9 = z7;
                                    i44 = i21;
                                    i42 = i20;
                                    i41 = i16;
                                    iZzl = iZzh2;
                                    i40 = 3;
                                    i43 = i23;
                                    i45 = i45;
                                } else {
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 8:
                                zzgvmVar2 = zzgvmVar;
                                z4 = true;
                                i16 = -1;
                                i20 = i47;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 2) {
                                    if (zzM(i49)) {
                                        iZzh = zzgvn.zzh(bArr2, iZzi, zzgvmVar2);
                                        int i56 = zzgvmVar2.zza;
                                        if (i56 < 0) {
                                            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i19 |= i52;
                                        if (i56 == 0) {
                                            zzgvmVar2.zzc = "";
                                        } else {
                                            zzgvmVar2.zzc = zzhai.zzh(bArr2, iZzh, i56);
                                            iZzh += i56;
                                        }
                                    } else {
                                        int i57 = i19 | i52;
                                        int iZzh5 = zzgvn.zzh(bArr2, iZzi, zzgvmVar2);
                                        int i58 = zzgvmVar2.zza;
                                        if (i58 < 0) {
                                            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i58 == 0) {
                                            zzgvmVar2.zzc = "";
                                        } else {
                                            zzgvmVar2.zzc = new String(bArr2, iZzh5, i58, zzgxt.zza);
                                            iZzh5 += i58;
                                        }
                                        int i59 = iZzh5;
                                        i19 = i57;
                                        iZzh = i59;
                                    }
                                    unsafe6.putObject(obj3, j, zzgvmVar2.zzc);
                                    z8 = z4;
                                    zzgvmVar5 = zzgvmVar2;
                                    i44 = i21;
                                    i42 = i20;
                                    i41 = i16;
                                    iZzl = iZzh;
                                    i45 = i45;
                                    i43 = i19;
                                    i40 = 3;
                                } else {
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 9:
                                zzgvmVar2 = zzgvmVar;
                                unsafe2 = unsafe6;
                                i16 = -1;
                                i20 = i47;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 2) {
                                    i22 = i19 | i52;
                                    Object objZzA = zzgyuVar.zzA(obj3, iZzs);
                                    unsafe6 = unsafe2;
                                    i8 = i8;
                                    int iZzm = zzgvn.zzm(objZzA, zzgyuVar.zzx(iZzs), bArr, iZzi, i8, zzgvmVar);
                                    zzgyuVar.zzJ(obj3, iZzs, objZzA);
                                    zzgvmVar5 = zzgvmVar2;
                                    i44 = i21 == true ? 1 : 0;
                                    i41 = -1;
                                    i40 = 3;
                                    iZzl = iZzm;
                                    i43 = i22;
                                    i42 = i20;
                                } else {
                                    unsafe6 = unsafe2;
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 10:
                                zzgvmVar2 = zzgvmVar;
                                unsafe2 = unsafe6;
                                i16 = -1;
                                i20 = i47;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 2) {
                                    int i60 = i19 | i52;
                                    bArr2 = bArr;
                                    int iZza2 = zzgvn.zza(bArr2, iZzi, zzgvmVar2);
                                    unsafe2.putObject(obj3, j, zzgvmVar2.zzc);
                                    i8 = i8;
                                    i9 = i9;
                                    unsafe6 = unsafe2;
                                    zzgvmVar5 = zzgvmVar2;
                                    i44 = i21 == true ? 1 : 0;
                                    i45 = i45;
                                    i42 = i20;
                                    i41 = -1;
                                    i43 = i60;
                                    iZzl = iZza2;
                                    i40 = 3;
                                } else {
                                    bArr2 = bArr;
                                    unsafe6 = unsafe2;
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 12:
                                zzgvmVar2 = zzgvmVar;
                                unsafe2 = unsafe6;
                                z8 = true;
                                i16 = -1;
                                i20 = i47;
                                i21 = i50 == true ? 1 : 0;
                                if (i48 == 0) {
                                    iZzh = zzgvn.zzh(bArr2, iZzi, zzgvmVar2);
                                    int i61 = zzgvmVar2.zza;
                                    zzgxm zzgxmVarZzw = zzgyuVar.zzw(iZzs);
                                    if ((i49 & Integer.MIN_VALUE) == 0 || zzgxmVarZzw == null || zzgxmVarZzw.zza(i61)) {
                                        i19 |= i52;
                                        unsafe2.putInt(obj3, j, i61);
                                    } else {
                                        zzd(obj).zzj(i21 == true ? 1 : 0, Long.valueOf(i61));
                                    }
                                    bArr2 = bArr;
                                    unsafe6 = unsafe2;
                                    zzgvmVar5 = zzgvmVar2;
                                    i44 = i21;
                                    i42 = i20;
                                    i41 = i16;
                                    iZzl = iZzh;
                                    i45 = i45;
                                    i43 = i19;
                                    i40 = 3;
                                } else {
                                    bArr2 = bArr;
                                    unsafe6 = unsafe2;
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 15:
                                zzgvmVar2 = zzgvmVar;
                                z9 = true;
                                i16 = -1;
                                i21 = i50 == true ? 1 : 0;
                                Unsafe unsafe7 = unsafe6;
                                i20 = i47;
                                if (i48 == 0) {
                                    i23 = i19 | i52;
                                    iZzh2 = zzgvn.zzh(bArr2, iZzi, zzgvmVar2);
                                    unsafe7.putInt(obj3, j, zzgwe.zzD(zzgvmVar2.zza));
                                    zzgvmVar5 = zzgvmVar2;
                                    unsafe6 = unsafe7;
                                    i44 = i21;
                                    i42 = i20;
                                    i41 = i16;
                                    iZzl = iZzh2;
                                    i40 = 3;
                                    i43 = i23;
                                    i45 = i45;
                                } else {
                                    unsafe6 = unsafe7;
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            case 16:
                                i16 = -1;
                                i21 = i50 == true ? 1 : 0;
                                Unsafe unsafe8 = unsafe6;
                                if (i48 == 0) {
                                    int i62 = i19 | i52;
                                    int iZzk4 = zzgvn.zzk(bArr2, iZzi, zzgvmVar);
                                    unsafe8.putLong(obj, j, zzgwe.zzF(zzgvmVar.zzb));
                                    unsafe6 = unsafe8;
                                    i8 = i8;
                                    i9 = i9;
                                    zzgvmVar5 = zzgvmVar;
                                    i44 = i21 == true ? 1 : 0;
                                    i42 = i47;
                                    i41 = -1;
                                    i40 = 3;
                                    i43 = i62;
                                    iZzl = iZzk4;
                                    i45 = i45;
                                } else {
                                    i20 = i47;
                                    unsafe6 = unsafe8;
                                    zzgvmVar2 = zzgvmVar;
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                            default:
                                if (i48 == 3) {
                                    int i63 = i19 | i52;
                                    Object objZzA2 = zzgyuVar.zzA(obj3, iZzs);
                                    iZzl = zzgvn.zzl(objZzA2, zzgyuVar.zzx(iZzs), bArr, iZzi, i8, (i47 << 3) | 4, zzgvmVar);
                                    zzgyuVar.zzJ(obj3, iZzs, objZzA2);
                                    unsafe6 = unsafe6;
                                    i40 = 3;
                                    i42 = i47;
                                    i44 = i50 == true ? 1 : 0;
                                    iZzs = iZzs;
                                    i45 = i45;
                                    i41 = -1;
                                    i8 = i8;
                                    i9 = i9;
                                    zzgvmVar5 = zzgvmVar;
                                    i43 = i63;
                                } else {
                                    i16 = -1;
                                    zzgvmVar2 = zzgvmVar;
                                    i20 = i47;
                                    i21 = i50 == true ? 1 : 0;
                                    zzgvmVar5 = zzgvmVar2;
                                    i14 = i21;
                                    unsafe = unsafe6;
                                    i45 = i45;
                                    i43 = i19;
                                    i17 = iZzs;
                                    i15 = i20;
                                    i13 = 3;
                                }
                                break;
                        }
                    } else {
                        int i64 = i47;
                        i16 = -1;
                        if (iZzt != 27) {
                            i24 = i45;
                            Unsafe unsafe9 = unsafe6;
                            int i65 = i64;
                            zzgvm zzgvmVar6 = zzgvmVar;
                            if (iZzt <= 49) {
                                long j3 = i49;
                                Unsafe unsafe10 = zzb;
                                zzgxs zzgxsVar = (zzgxs) unsafe10.getObject(obj3, j);
                                if (!zzgxsVar.zzc()) {
                                    int size = zzgxsVar.size();
                                    zzgxs zzgxsVarZzf = zzgxsVar.zzf(size + size);
                                    unsafe10.putObject(obj3, j, zzgxsVarZzf);
                                    zzgxsVar = zzgxsVarZzf;
                                }
                                switch (iZzt) {
                                    case 18:
                                    case 35:
                                        i32 = iZzi;
                                        i65 = i65;
                                        i33 = i50 == true ? 1 : 0;
                                        zzgvmVar6 = zzgvmVar6;
                                        i17 = iZzs;
                                        z10 = true;
                                        unsafe4 = unsafe9;
                                        i34 = i8;
                                        if (i48 == 2) {
                                            zzgwn zzgwnVar = (zzgwn) zzgxsVar;
                                            iZzh3 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                            int i66 = zzgvmVar6.zza;
                                            int i67 = iZzh3 + i66;
                                            if (i67 > bArr2.length) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgwnVar.zzi((i66 / 8) + zzgwnVar.size());
                                            while (iZzh3 < i67) {
                                                zzgwnVar.zzh(Double.longBitsToDouble(zzgvn.zzn(bArr2, iZzh3)));
                                                iZzh3 += 8;
                                            }
                                            if (iZzh3 != i67) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else if (i48 == 1) {
                                            i35 = i32 + 8;
                                            zzgwn zzgwnVar2 = (zzgwn) zzgxsVar;
                                            zzgwnVar2.zzh(Double.longBitsToDouble(zzgvn.zzn(bArr2, i32)));
                                            while (i35 < i34) {
                                                int iZzh6 = zzgvn.zzh(bArr2, i35, zzgvmVar6);
                                                if (i33 == zzgvmVar6.zza) {
                                                    zzgwnVar2.zzh(Double.longBitsToDouble(zzgvn.zzn(bArr2, iZzh6)));
                                                    i35 = iZzh6 + 8;
                                                } else {
                                                    iZzh3 = i35;
                                                }
                                            }
                                            iZzh3 = i35;
                                        } else {
                                            iZzh3 = i32;
                                        }
                                        if (iZzh3 != i32) {
                                            obj3 = obj;
                                            i9 = i9;
                                            zzgvmVar5 = zzgvmVar6;
                                            i8 = i34;
                                            i44 = i33;
                                            iZzs = i17;
                                            i42 = i65;
                                            i41 = -1;
                                            i45 = i24;
                                            i40 = 3;
                                            zzgyuVar = this;
                                            Unsafe unsafe11 = unsafe4;
                                            iZzl = iZzh3;
                                            unsafe6 = unsafe11;
                                        } else {
                                            obj3 = obj;
                                            i9 = i9;
                                            iZzi = iZzh3;
                                            zzgvmVar5 = zzgvmVar6;
                                            unsafe = unsafe4;
                                            i14 = i33;
                                            i15 = i65;
                                            i45 = i24;
                                            i13 = 3;
                                            zzgyuVar = this;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        i32 = iZzi;
                                        i65 = i65;
                                        i33 = i50 == true ? 1 : 0;
                                        zzgvmVar6 = zzgvmVar6;
                                        i17 = iZzs;
                                        z10 = true;
                                        unsafe4 = unsafe9;
                                        i34 = i8;
                                        if (i48 == 2) {
                                            zzgwx zzgwxVar = (zzgwx) zzgxsVar;
                                            iZzh3 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                            int i68 = zzgvmVar6.zza;
                                            int i69 = iZzh3 + i68;
                                            if (i69 > bArr2.length) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgwxVar.zzi((i68 / 4) + zzgwxVar.size());
                                            while (iZzh3 < i69) {
                                                zzgwxVar.zzh(Float.intBitsToFloat(zzgvn.zzb(bArr2, iZzh3)));
                                                iZzh3 += 4;
                                            }
                                            if (iZzh3 != i69) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else if (i48 == 5) {
                                            i35 = i32 + 4;
                                            zzgwx zzgwxVar2 = (zzgwx) zzgxsVar;
                                            zzgwxVar2.zzh(Float.intBitsToFloat(zzgvn.zzb(bArr2, i32)));
                                            while (i35 < i34) {
                                                int iZzh7 = zzgvn.zzh(bArr2, i35, zzgvmVar6);
                                                if (i33 == zzgvmVar6.zza) {
                                                    zzgwxVar2.zzh(Float.intBitsToFloat(zzgvn.zzb(bArr2, iZzh7)));
                                                    i35 = iZzh7 + 4;
                                                } else {
                                                    iZzh3 = i35;
                                                }
                                            }
                                            iZzh3 = i35;
                                        } else {
                                            iZzh3 = i32;
                                        }
                                        if (iZzh3 != i32) {
                                            obj3 = obj;
                                            i9 = i9;
                                            zzgvmVar5 = zzgvmVar6;
                                            i8 = i34;
                                            i44 = i33;
                                            iZzs = i17;
                                            i42 = i65;
                                            i41 = -1;
                                            i45 = i24;
                                            i40 = 3;
                                            zzgyuVar = this;
                                            Unsafe unsafe12 = unsafe4;
                                            iZzl = iZzh3;
                                            unsafe6 = unsafe12;
                                        } else {
                                            obj3 = obj;
                                            i9 = i9;
                                            iZzi = iZzh3;
                                            zzgvmVar5 = zzgvmVar6;
                                            unsafe = unsafe4;
                                            i14 = i33;
                                            i15 = i65;
                                            i45 = i24;
                                            i13 = 3;
                                            zzgyuVar = this;
                                        }
                                        break;
                                    case 20:
                                    case zzbbd.zzt.zzm /* 21 */:
                                    case 37:
                                    case 38:
                                        i32 = iZzi;
                                        int i70 = i65;
                                        i33 = i50 == true ? 1 : 0;
                                        zzgvmVar6 = zzgvmVar6;
                                        i17 = iZzs;
                                        z10 = true;
                                        unsafe4 = unsafe9;
                                        i34 = i8;
                                        if (i48 == 2) {
                                            zzgyg zzgygVar = (zzgyg) zzgxsVar;
                                            iZzh3 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                            int i71 = zzgvmVar6.zza + iZzh3;
                                            while (iZzh3 < i71) {
                                                iZzh3 = zzgvn.zzk(bArr2, iZzh3, zzgvmVar6);
                                                zzgygVar.zzg(zzgvmVar6.zzb);
                                                i70 = i70;
                                            }
                                            i65 = i70;
                                            if (iZzh3 != i71) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            i65 = i70;
                                            if (i48 == 0) {
                                                zzgyg zzgygVar2 = (zzgyg) zzgxsVar;
                                                iZzh3 = zzgvn.zzk(bArr2, i32, zzgvmVar6);
                                                zzgygVar2.zzg(zzgvmVar6.zzb);
                                                while (iZzh3 < i34) {
                                                    int iZzh8 = zzgvn.zzh(bArr2, iZzh3, zzgvmVar6);
                                                    if (i33 == zzgvmVar6.zza) {
                                                        iZzh3 = zzgvn.zzk(bArr2, iZzh8, zzgvmVar6);
                                                        zzgygVar2.zzg(zzgvmVar6.zzb);
                                                    }
                                                }
                                            } else {
                                                iZzh3 = i32;
                                            }
                                        }
                                        if (iZzh3 != i32) {
                                            obj3 = obj;
                                            i9 = i9;
                                            zzgvmVar5 = zzgvmVar6;
                                            i8 = i34;
                                            i44 = i33;
                                            iZzs = i17;
                                            i42 = i65;
                                            i41 = -1;
                                            i45 = i24;
                                            i40 = 3;
                                            zzgyuVar = this;
                                            Unsafe unsafe13 = unsafe4;
                                            iZzl = iZzh3;
                                            unsafe6 = unsafe13;
                                        } else {
                                            obj3 = obj;
                                            i9 = i9;
                                            iZzi = iZzh3;
                                            zzgvmVar5 = zzgvmVar6;
                                            unsafe = unsafe4;
                                            i14 = i33;
                                            i15 = i65;
                                            i45 = i24;
                                            i13 = 3;
                                            zzgyuVar = this;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe5 = unsafe9;
                                        i32 = iZzi;
                                        i65 = i65;
                                        i36 = i50 == true ? 1 : 0;
                                        zzgvmVar6 = zzgvmVar6;
                                        i37 = iZzs;
                                        z10 = true;
                                        i38 = i8;
                                        if (i48 == 2) {
                                            iZzf = zzgvn.zzf(bArr2, i32, zzgxsVar, zzgvmVar6);
                                            i17 = i37;
                                            iZzh3 = iZzf;
                                            unsafe4 = unsafe5;
                                            i34 = i38;
                                            i33 = i36;
                                        } else if (i48 == 0) {
                                            i17 = i37;
                                            unsafe4 = unsafe5;
                                            i34 = i38;
                                            i33 = i36 == true ? 1 : 0;
                                            iZzh3 = zzgvn.zzj(i36 == true ? 1 : 0, bArr, i32, i8, zzgxsVar, zzgvmVar);
                                        } else {
                                            i17 = i37;
                                            unsafe4 = unsafe5;
                                            i34 = i38;
                                            i33 = i36;
                                            iZzh3 = i32;
                                        }
                                        if (iZzh3 != i32) {
                                            obj3 = obj;
                                            i9 = i9;
                                            zzgvmVar5 = zzgvmVar6;
                                            i8 = i34;
                                            i44 = i33;
                                            iZzs = i17;
                                            i42 = i65;
                                            i41 = -1;
                                            i45 = i24;
                                            i40 = 3;
                                            zzgyuVar = this;
                                            Unsafe unsafe14 = unsafe4;
                                            iZzl = iZzh3;
                                            unsafe6 = unsafe14;
                                        } else {
                                            obj3 = obj;
                                            i9 = i9;
                                            iZzi = iZzh3;
                                            zzgvmVar5 = zzgvmVar6;
                                            unsafe = unsafe4;
                                            i14 = i33;
                                            i15 = i65;
                                            i45 = i24;
                                            i13 = 3;
                                            zzgyuVar = this;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        unsafe5 = unsafe9;
                                        i32 = iZzi;
                                        i65 = i65;
                                        i36 = i50 == true ? 1 : 0;
                                        zzgvmVar6 = zzgvmVar6;
                                        i37 = iZzs;
                                        i38 = i8;
                                        if (i48 != 2) {
                                            z10 = true;
                                            if (i48 == 1) {
                                                iZzf = i32 + 8;
                                                zzgyg zzgygVar3 = (zzgyg) zzgxsVar;
                                                zzgygVar3.zzg(zzgvn.zzn(bArr2, i32));
                                                while (iZzf < i38) {
                                                    int iZzh9 = zzgvn.zzh(bArr2, iZzf, zzgvmVar6);
                                                    if (i36 != zzgvmVar6.zza) {
                                                        i17 = i37;
                                                        iZzh3 = iZzf;
                                                        unsafe4 = unsafe5;
                                                        i34 = i38;
                                                        i33 = i36;
                                                        if (iZzh3 != i32) {
                                                            obj3 = obj;
                                                            i9 = i9;
                                                            zzgvmVar5 = zzgvmVar6;
                                                            i8 = i34;
                                                            i44 = i33;
                                                            iZzs = i17;
                                                            i42 = i65;
                                                            i41 = -1;
                                                            i45 = i24;
                                                            i40 = 3;
                                                            zzgyuVar = this;
                                                            Unsafe unsafe15 = unsafe4;
                                                            iZzl = iZzh3;
                                                            unsafe6 = unsafe15;
                                                        } else {
                                                            obj3 = obj;
                                                            i9 = i9;
                                                            iZzi = iZzh3;
                                                            zzgvmVar5 = zzgvmVar6;
                                                            unsafe = unsafe4;
                                                            i14 = i33;
                                                            i15 = i65;
                                                            i45 = i24;
                                                            i13 = 3;
                                                            zzgyuVar = this;
                                                        }
                                                    } else {
                                                        zzgygVar3.zzg(zzgvn.zzn(bArr2, iZzh9));
                                                        iZzf = iZzh9 + 8;
                                                    }
                                                    break;
                                                }
                                                i17 = i37;
                                                iZzh3 = iZzf;
                                                unsafe4 = unsafe5;
                                                i34 = i38;
                                                i33 = i36;
                                                if (iZzh3 != i32) {
                                                    obj3 = obj;
                                                    i9 = i9;
                                                    zzgvmVar5 = zzgvmVar6;
                                                    i8 = i34;
                                                    i44 = i33;
                                                    iZzs = i17;
                                                    i42 = i65;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    i40 = 3;
                                                    zzgyuVar = this;
                                                    Unsafe unsafe16 = unsafe4;
                                                    iZzl = iZzh3;
                                                    unsafe6 = unsafe16;
                                                } else {
                                                    obj3 = obj;
                                                    i9 = i9;
                                                    iZzi = iZzh3;
                                                    zzgvmVar5 = zzgvmVar6;
                                                    unsafe = unsafe4;
                                                    i14 = i33;
                                                    i15 = i65;
                                                    i45 = i24;
                                                    i13 = 3;
                                                    zzgyuVar = this;
                                                }
                                            }
                                            i17 = i37;
                                            unsafe4 = unsafe5;
                                            i34 = i38;
                                            i33 = i36;
                                            iZzh3 = i32;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe17 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe17;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                            break;
                                        } else {
                                            zzgyg zzgygVar4 = (zzgyg) zzgxsVar;
                                            iZzh4 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                            int i72 = zzgvmVar6.zza;
                                            int i73 = iZzh4 + i72;
                                            if (i73 > bArr2.length) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgygVar4.zzi((i72 / 8) + zzgygVar4.size());
                                            while (iZzh4 < i73) {
                                                zzgygVar4.zzg(zzgvn.zzn(bArr2, iZzh4));
                                                iZzh4 += 8;
                                            }
                                            if (iZzh4 != i73) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i17 = i37;
                                            i34 = i38;
                                            i33 = i36;
                                            iZzh3 = iZzh4;
                                            z10 = true;
                                            unsafe4 = unsafe5;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe18 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe18;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe5 = unsafe9;
                                        i32 = iZzi;
                                        i65 = i65;
                                        i36 = i50 == true ? 1 : 0;
                                        zzgvmVar6 = zzgvmVar6;
                                        i37 = iZzs;
                                        i38 = i8;
                                        if (i48 != 2) {
                                            if (i48 == 5) {
                                                iZzk2 = i32 + 4;
                                                zzgxh zzgxhVar = (zzgxh) zzgxsVar;
                                                zzgxhVar.zzi(zzgvn.zzb(bArr2, i32));
                                                while (iZzk2 < i38) {
                                                    int iZzh10 = zzgvn.zzh(bArr2, iZzk2, zzgvmVar6);
                                                    if (i36 != zzgvmVar6.zza) {
                                                        i17 = i37;
                                                        iZzh3 = iZzk2;
                                                        unsafe4 = unsafe5;
                                                        i34 = i38;
                                                        i33 = i36;
                                                        z10 = true;
                                                        if (iZzh3 != i32) {
                                                            obj3 = obj;
                                                            i9 = i9;
                                                            zzgvmVar5 = zzgvmVar6;
                                                            i8 = i34;
                                                            i44 = i33;
                                                            iZzs = i17;
                                                            i42 = i65;
                                                            i41 = -1;
                                                            i45 = i24;
                                                            i40 = 3;
                                                            zzgyuVar = this;
                                                            Unsafe unsafe19 = unsafe4;
                                                            iZzl = iZzh3;
                                                            unsafe6 = unsafe19;
                                                        } else {
                                                            obj3 = obj;
                                                            i9 = i9;
                                                            iZzi = iZzh3;
                                                            zzgvmVar5 = zzgvmVar6;
                                                            unsafe = unsafe4;
                                                            i14 = i33;
                                                            i15 = i65;
                                                            i45 = i24;
                                                            i13 = 3;
                                                            zzgyuVar = this;
                                                        }
                                                    } else {
                                                        zzgxhVar.zzi(zzgvn.zzb(bArr2, iZzh10));
                                                        iZzk2 = iZzh10 + 4;
                                                    }
                                                    break;
                                                }
                                                i17 = i37;
                                                iZzh3 = iZzk2;
                                                unsafe4 = unsafe5;
                                                i34 = i38;
                                                i33 = i36;
                                                z10 = true;
                                                if (iZzh3 != i32) {
                                                    obj3 = obj;
                                                    i9 = i9;
                                                    zzgvmVar5 = zzgvmVar6;
                                                    i8 = i34;
                                                    i44 = i33;
                                                    iZzs = i17;
                                                    i42 = i65;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    i40 = 3;
                                                    zzgyuVar = this;
                                                    Unsafe unsafe110 = unsafe4;
                                                    iZzl = iZzh3;
                                                    unsafe6 = unsafe110;
                                                } else {
                                                    obj3 = obj;
                                                    i9 = i9;
                                                    iZzi = iZzh3;
                                                    zzgvmVar5 = zzgvmVar6;
                                                    unsafe = unsafe4;
                                                    i14 = i33;
                                                    i15 = i65;
                                                    i45 = i24;
                                                    i13 = 3;
                                                    zzgyuVar = this;
                                                }
                                            }
                                            i17 = i37;
                                            unsafe4 = unsafe5;
                                            i34 = i38;
                                            i33 = i36;
                                            z10 = true;
                                            iZzh3 = i32;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe111 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe111;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                            break;
                                        } else {
                                            zzgxh zzgxhVar2 = (zzgxh) zzgxsVar;
                                            iZzh4 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                            int i74 = zzgvmVar6.zza;
                                            int i75 = iZzh4 + i74;
                                            if (i75 > bArr2.length) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgxhVar2.zzj((i74 / 4) + zzgxhVar2.size());
                                            while (iZzh4 < i75) {
                                                zzgxhVar2.zzi(zzgvn.zzb(bArr2, iZzh4));
                                                iZzh4 += 4;
                                            }
                                            if (iZzh4 != i75) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i17 = i37;
                                            i34 = i38;
                                            i33 = i36;
                                            iZzh3 = iZzh4;
                                            z10 = true;
                                            unsafe4 = unsafe5;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe112 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe112;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe5 = unsafe9;
                                        i32 = iZzi;
                                        i65 = i65;
                                        i36 = i50 == true ? 1 : 0;
                                        zzgvmVar6 = zzgvmVar6;
                                        i37 = iZzs;
                                        i38 = i8;
                                        if (i48 != 2) {
                                            if (i48 == 0) {
                                                zzgvo zzgvoVar = (zzgvo) zzgxsVar;
                                                iZzk2 = zzgvn.zzk(bArr2, i32, zzgvmVar6);
                                                zzgvoVar.zzg(zzgvmVar6.zzb != 0);
                                                while (iZzk2 < i38) {
                                                    int iZzh11 = zzgvn.zzh(bArr2, iZzk2, zzgvmVar6);
                                                    if (i36 != zzgvmVar6.zza) {
                                                        i17 = i37;
                                                        iZzh3 = iZzk2;
                                                        unsafe4 = unsafe5;
                                                        i34 = i38;
                                                        i33 = i36;
                                                        z10 = true;
                                                        if (iZzh3 != i32) {
                                                            obj3 = obj;
                                                            i9 = i9;
                                                            zzgvmVar5 = zzgvmVar6;
                                                            i8 = i34;
                                                            i44 = i33;
                                                            iZzs = i17;
                                                            i42 = i65;
                                                            i41 = -1;
                                                            i45 = i24;
                                                            i40 = 3;
                                                            zzgyuVar = this;
                                                            Unsafe unsafe113 = unsafe4;
                                                            iZzl = iZzh3;
                                                            unsafe6 = unsafe113;
                                                        } else {
                                                            obj3 = obj;
                                                            i9 = i9;
                                                            iZzi = iZzh3;
                                                            zzgvmVar5 = zzgvmVar6;
                                                            unsafe = unsafe4;
                                                            i14 = i33;
                                                            i15 = i65;
                                                            i45 = i24;
                                                            i13 = 3;
                                                            zzgyuVar = this;
                                                        }
                                                    } else {
                                                        iZzk2 = zzgvn.zzk(bArr2, iZzh11, zzgvmVar6);
                                                        zzgvoVar.zzg(zzgvmVar6.zzb != 0);
                                                    }
                                                    break;
                                                }
                                                i17 = i37;
                                                iZzh3 = iZzk2;
                                                unsafe4 = unsafe5;
                                                i34 = i38;
                                                i33 = i36;
                                                z10 = true;
                                                if (iZzh3 != i32) {
                                                    obj3 = obj;
                                                    i9 = i9;
                                                    zzgvmVar5 = zzgvmVar6;
                                                    i8 = i34;
                                                    i44 = i33;
                                                    iZzs = i17;
                                                    i42 = i65;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    i40 = 3;
                                                    zzgyuVar = this;
                                                    Unsafe unsafe114 = unsafe4;
                                                    iZzl = iZzh3;
                                                    unsafe6 = unsafe114;
                                                } else {
                                                    obj3 = obj;
                                                    i9 = i9;
                                                    iZzi = iZzh3;
                                                    zzgvmVar5 = zzgvmVar6;
                                                    unsafe = unsafe4;
                                                    i14 = i33;
                                                    i15 = i65;
                                                    i45 = i24;
                                                    i13 = 3;
                                                    zzgyuVar = this;
                                                }
                                            }
                                            i17 = i37;
                                            unsafe4 = unsafe5;
                                            i34 = i38;
                                            i33 = i36;
                                            z10 = true;
                                            iZzh3 = i32;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe115 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe115;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                            break;
                                        } else {
                                            zzgvo zzgvoVar2 = (zzgvo) zzgxsVar;
                                            iZzh4 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                            int i76 = zzgvmVar6.zza + iZzh4;
                                            while (iZzh4 < i76) {
                                                iZzh4 = zzgvn.zzk(bArr2, iZzh4, zzgvmVar6);
                                                zzgvoVar2.zzg(zzgvmVar6.zzb != 0);
                                            }
                                            if (iZzh4 != i76) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i17 = i37;
                                            i34 = i38;
                                            i33 = i36;
                                            iZzh3 = iZzh4;
                                            z10 = true;
                                            unsafe4 = unsafe5;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe116 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe116;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        }
                                        break;
                                    case 26:
                                        unsafe5 = unsafe9;
                                        i32 = iZzi;
                                        i65 = i65;
                                        i36 = i50 == true ? 1 : 0;
                                        zzgvmVar6 = zzgvmVar6;
                                        i37 = iZzs;
                                        i38 = i8;
                                        if (i48 == 2) {
                                            if ((j3 & 536870912) == 0) {
                                                iZzh4 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                                int i77 = zzgvmVar6.zza;
                                                if (i77 < 0) {
                                                    throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i77 == 0) {
                                                    obj2 = "";
                                                    zzgxsVar.add(obj2);
                                                } else {
                                                    obj2 = "";
                                                    zzgxsVar.add(new String(bArr2, iZzh4, i77, zzgxt.zza));
                                                    iZzh4 += i77;
                                                }
                                                while (iZzh4 < i38) {
                                                    int iZzh12 = zzgvn.zzh(bArr2, iZzh4, zzgvmVar6);
                                                    if (i36 == zzgvmVar6.zza) {
                                                        iZzh4 = zzgvn.zzh(bArr2, iZzh12, zzgvmVar6);
                                                        int i78 = zzgvmVar6.zza;
                                                        if (i78 < 0) {
                                                            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i78 == 0) {
                                                            zzgxsVar.add(obj2);
                                                        } else {
                                                            zzgxsVar.add(new String(bArr2, iZzh4, i78, zzgxt.zza));
                                                            iZzh4 += i78;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzh4 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                                int i79 = zzgvmVar6.zza;
                                                if (i79 < 0) {
                                                    throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i79 == 0) {
                                                    zzgxsVar.add("");
                                                } else {
                                                    int i80 = iZzh4 + i79;
                                                    if (!zzhai.zzi(bArr2, iZzh4, i80)) {
                                                        throw new zzgxv("Protocol message had invalid UTF-8.");
                                                    }
                                                    zzgxsVar.add(new String(bArr2, iZzh4, i79, zzgxt.zza));
                                                    iZzh4 = i80;
                                                }
                                                while (iZzh4 < i38) {
                                                    int iZzh13 = zzgvn.zzh(bArr2, iZzh4, zzgvmVar6);
                                                    if (i36 == zzgvmVar6.zza) {
                                                        iZzh4 = zzgvn.zzh(bArr2, iZzh13, zzgvmVar6);
                                                        int i81 = zzgvmVar6.zza;
                                                        if (i81 < 0) {
                                                            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i81 == 0) {
                                                            zzgxsVar.add("");
                                                        } else {
                                                            int i82 = iZzh4 + i81;
                                                            if (!zzhai.zzi(bArr2, iZzh4, i82)) {
                                                                throw new zzgxv("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzgxsVar.add(new String(bArr2, iZzh4, i81, zzgxt.zza));
                                                            iZzh4 = i82;
                                                        }
                                                    }
                                                }
                                            }
                                            i17 = i37;
                                            i34 = i38;
                                            i33 = i36;
                                            iZzh3 = iZzh4;
                                            z10 = true;
                                            unsafe4 = unsafe5;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe117 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe117;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        }
                                        i17 = i37;
                                        unsafe4 = unsafe5;
                                        i34 = i38;
                                        i33 = i36;
                                        z10 = true;
                                        iZzh3 = i32;
                                        if (iZzh3 != i32) {
                                            obj3 = obj;
                                            i9 = i9;
                                            zzgvmVar5 = zzgvmVar6;
                                            i8 = i34;
                                            i44 = i33;
                                            iZzs = i17;
                                            i42 = i65;
                                            i41 = -1;
                                            i45 = i24;
                                            i40 = 3;
                                            zzgyuVar = this;
                                            Unsafe unsafe118 = unsafe4;
                                            iZzl = iZzh3;
                                            unsafe6 = unsafe118;
                                        } else {
                                            obj3 = obj;
                                            i9 = i9;
                                            iZzi = iZzh3;
                                            zzgvmVar5 = zzgvmVar6;
                                            unsafe = unsafe4;
                                            i14 = i33;
                                            i15 = i65;
                                            i45 = i24;
                                            i13 = 3;
                                            zzgyuVar = this;
                                        }
                                        break;
                                    case 27:
                                        i39 = i8;
                                        i32 = iZzi;
                                        if (i48 == 2) {
                                            zzgzk zzgzkVarZzx = zzgyuVar.zzx(iZzs);
                                            i36 = i50 == true ? 1 : 0;
                                            unsafe5 = unsafe9;
                                            i38 = i39;
                                            zzgvmVar6 = zzgvmVar6;
                                            i65 = i65;
                                            i37 = iZzs;
                                            iZzh4 = zzgvn.zze(zzgzkVarZzx, i50 == true ? 1 : 0, bArr, i32, i8, zzgxsVar, zzgvmVar);
                                            i17 = i37;
                                            i34 = i38;
                                            i33 = i36;
                                            iZzh3 = iZzh4;
                                            z10 = true;
                                            unsafe4 = unsafe5;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe119 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe119;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        } else {
                                            i17 = iZzs;
                                            z10 = true;
                                            unsafe4 = unsafe9;
                                            int i83 = i39;
                                            i33 = i50 == true ? 1 : 0;
                                            i34 = i83;
                                            iZzh3 = i32;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe1110 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe1110;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        }
                                        break;
                                    case 28:
                                        i39 = i8;
                                        i32 = iZzi;
                                        if (i48 == 2) {
                                            iZzh3 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                            int i84 = zzgvmVar6.zza;
                                            if (i84 < 0) {
                                                throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i84 > bArr2.length - iZzh3) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i84 == 0) {
                                                zzgxsVar.add(zzgvy.zzb);
                                            } else {
                                                zzgxsVar.add(zzgvy.zzv(bArr2, iZzh3, i84));
                                                iZzh3 += i84;
                                            }
                                            while (iZzh3 < i39) {
                                                int iZzh14 = zzgvn.zzh(bArr2, iZzh3, zzgvmVar6);
                                                if (i50 != zzgvmVar6.zza) {
                                                    zzgvmVar6 = zzgvmVar6;
                                                    i17 = iZzs;
                                                    z10 = true;
                                                    unsafe4 = unsafe9;
                                                    int i85 = i39;
                                                    i33 = i50 == true ? 1 : 0;
                                                    i34 = i85;
                                                    if (iZzh3 != i32) {
                                                        obj3 = obj;
                                                        i9 = i9;
                                                        zzgvmVar5 = zzgvmVar6;
                                                        i8 = i34;
                                                        i44 = i33;
                                                        iZzs = i17;
                                                        i42 = i65;
                                                        i41 = -1;
                                                        i45 = i24;
                                                        i40 = 3;
                                                        zzgyuVar = this;
                                                        Unsafe unsafe1111 = unsafe4;
                                                        iZzl = iZzh3;
                                                        unsafe6 = unsafe1111;
                                                    } else {
                                                        obj3 = obj;
                                                        i9 = i9;
                                                        iZzi = iZzh3;
                                                        zzgvmVar5 = zzgvmVar6;
                                                        unsafe = unsafe4;
                                                        i14 = i33;
                                                        i15 = i65;
                                                        i45 = i24;
                                                        i13 = 3;
                                                        zzgyuVar = this;
                                                    }
                                                    break;
                                                } else {
                                                    iZzh3 = zzgvn.zzh(bArr2, iZzh14, zzgvmVar6);
                                                    int i86 = zzgvmVar6.zza;
                                                    if (i86 < 0) {
                                                        throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i86 > bArr2.length - iZzh3) {
                                                        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i86 == 0) {
                                                        zzgxsVar.add(zzgvy.zzb);
                                                    } else {
                                                        zzgxsVar.add(zzgvy.zzv(bArr2, iZzh3, i86));
                                                        iZzh3 += i86;
                                                    }
                                                }
                                            }
                                            zzgvmVar6 = zzgvmVar6;
                                            i17 = iZzs;
                                            z10 = true;
                                            unsafe4 = unsafe9;
                                            int i87 = i39;
                                            i33 = i50 == true ? 1 : 0;
                                            i34 = i87;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe1112 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe1112;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        }
                                        i17 = iZzs;
                                        z10 = true;
                                        unsafe4 = unsafe9;
                                        int i88 = i39;
                                        i33 = i50 == true ? 1 : 0;
                                        i34 = i88;
                                        iZzh3 = i32;
                                        if (iZzh3 != i32) {
                                            obj3 = obj;
                                            i9 = i9;
                                            zzgvmVar5 = zzgvmVar6;
                                            i8 = i34;
                                            i44 = i33;
                                            iZzs = i17;
                                            i42 = i65;
                                            i41 = -1;
                                            i45 = i24;
                                            i40 = 3;
                                            zzgyuVar = this;
                                            Unsafe unsafe1113 = unsafe4;
                                            iZzl = iZzh3;
                                            unsafe6 = unsafe1113;
                                        } else {
                                            obj3 = obj;
                                            i9 = i9;
                                            iZzi = iZzh3;
                                            zzgvmVar5 = zzgvmVar6;
                                            unsafe = unsafe4;
                                            i14 = i33;
                                            i15 = i65;
                                            i45 = i24;
                                            i13 = 3;
                                            zzgyuVar = this;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i39 = i8;
                                        i32 = iZzi;
                                        if (i48 != 2) {
                                            if (i48 == 0) {
                                                iZzj = zzgvn.zzj(i50 == true ? 1 : 0, bArr, i32, i8, zzgxsVar, zzgvmVar);
                                            }
                                            i17 = iZzs;
                                            z10 = true;
                                            unsafe4 = unsafe9;
                                            int i89 = i39;
                                            i33 = i50 == true ? 1 : 0;
                                            i34 = i89;
                                            iZzh3 = i32;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe1114 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe1114;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        } else {
                                            iZzj = zzgvn.zzf(bArr2, i32, zzgxsVar, zzgvmVar6);
                                        }
                                        int i90 = iZzj;
                                        zzgzm.zzn(obj, i65, zzgxsVar, zzgyuVar.zzw(iZzs), null, zzgyuVar.zzm);
                                        iZzh3 = i90;
                                        zzgvmVar6 = zzgvmVar6;
                                        i17 = iZzs;
                                        z10 = true;
                                        unsafe4 = unsafe9;
                                        int i810 = i39;
                                        i33 = i50 == true ? 1 : 0;
                                        i34 = i810;
                                        if (iZzh3 != i32) {
                                            obj3 = obj;
                                            i9 = i9;
                                            zzgvmVar5 = zzgvmVar6;
                                            i8 = i34;
                                            i44 = i33;
                                            iZzs = i17;
                                            i42 = i65;
                                            i41 = -1;
                                            i45 = i24;
                                            i40 = 3;
                                            zzgyuVar = this;
                                            Unsafe unsafe1115 = unsafe4;
                                            iZzl = iZzh3;
                                            unsafe6 = unsafe1115;
                                        } else {
                                            obj3 = obj;
                                            i9 = i9;
                                            iZzi = iZzh3;
                                            zzgvmVar5 = zzgvmVar6;
                                            unsafe = unsafe4;
                                            i14 = i33;
                                            i15 = i65;
                                            i45 = i24;
                                            i13 = 3;
                                            zzgyuVar = this;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i39 = i8;
                                        i32 = iZzi;
                                        if (i48 != 2) {
                                            if (i48 == 0) {
                                                zzgxh zzgxhVar3 = (zzgxh) zzgxsVar;
                                                iZzh3 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                                zzgxhVar3.zzi(zzgwe.zzD(zzgvmVar6.zza));
                                                while (iZzh3 < i39) {
                                                    int iZzh15 = zzgvn.zzh(bArr2, iZzh3, zzgvmVar6);
                                                    if (i50 == zzgvmVar6.zza) {
                                                        iZzh3 = zzgvn.zzh(bArr2, iZzh15, zzgvmVar6);
                                                        zzgxhVar3.zzi(zzgwe.zzD(zzgvmVar6.zza));
                                                    }
                                                }
                                            }
                                            i17 = iZzs;
                                            z10 = true;
                                            unsafe4 = unsafe9;
                                            int i811 = i39;
                                            i33 = i50 == true ? 1 : 0;
                                            i34 = i811;
                                            iZzh3 = i32;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe1116 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe1116;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        } else {
                                            zzgxh zzgxhVar4 = (zzgxh) zzgxsVar;
                                            iZzh3 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                            int i91 = zzgvmVar6.zza + iZzh3;
                                            while (iZzh3 < i91) {
                                                iZzh3 = zzgvn.zzh(bArr2, iZzh3, zzgvmVar6);
                                                zzgxhVar4.zzi(zzgwe.zzD(zzgvmVar6.zza));
                                            }
                                            if (iZzh3 != i91) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzgvmVar6 = zzgvmVar6;
                                        i17 = iZzs;
                                        z10 = true;
                                        unsafe4 = unsafe9;
                                        int i812 = i39;
                                        i33 = i50 == true ? 1 : 0;
                                        i34 = i812;
                                        if (iZzh3 != i32) {
                                            obj3 = obj;
                                            i9 = i9;
                                            zzgvmVar5 = zzgvmVar6;
                                            i8 = i34;
                                            i44 = i33;
                                            iZzs = i17;
                                            i42 = i65;
                                            i41 = -1;
                                            i45 = i24;
                                            i40 = 3;
                                            zzgyuVar = this;
                                            Unsafe unsafe1117 = unsafe4;
                                            iZzl = iZzh3;
                                            unsafe6 = unsafe1117;
                                        } else {
                                            obj3 = obj;
                                            i9 = i9;
                                            iZzi = iZzh3;
                                            zzgvmVar5 = zzgvmVar6;
                                            unsafe = unsafe4;
                                            i14 = i33;
                                            i15 = i65;
                                            i45 = i24;
                                            i13 = 3;
                                            zzgyuVar = this;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i39 = i8;
                                        i32 = iZzi;
                                        if (i48 != 2) {
                                            if (i48 == 0) {
                                                zzgyg zzgygVar5 = (zzgyg) zzgxsVar;
                                                iZzh3 = zzgvn.zzk(bArr2, i32, zzgvmVar6);
                                                zzgygVar5.zzg(zzgwe.zzF(zzgvmVar6.zzb));
                                                while (iZzh3 < i39) {
                                                    int iZzh16 = zzgvn.zzh(bArr2, iZzh3, zzgvmVar6);
                                                    if (i50 == zzgvmVar6.zza) {
                                                        iZzh3 = zzgvn.zzk(bArr2, iZzh16, zzgvmVar6);
                                                        zzgygVar5.zzg(zzgwe.zzF(zzgvmVar6.zzb));
                                                    }
                                                }
                                            }
                                            i17 = iZzs;
                                            z10 = true;
                                            unsafe4 = unsafe9;
                                            int i813 = i39;
                                            i33 = i50 == true ? 1 : 0;
                                            i34 = i813;
                                            iZzh3 = i32;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe1118 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe1118;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        } else {
                                            zzgyg zzgygVar6 = (zzgyg) zzgxsVar;
                                            iZzh3 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                            int i92 = zzgvmVar6.zza + iZzh3;
                                            while (iZzh3 < i92) {
                                                iZzh3 = zzgvn.zzk(bArr2, iZzh3, zzgvmVar6);
                                                zzgygVar6.zzg(zzgwe.zzF(zzgvmVar6.zzb));
                                            }
                                            if (iZzh3 != i92) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        zzgvmVar6 = zzgvmVar6;
                                        i17 = iZzs;
                                        z10 = true;
                                        unsafe4 = unsafe9;
                                        int i814 = i39;
                                        i33 = i50 == true ? 1 : 0;
                                        i34 = i814;
                                        if (iZzh3 != i32) {
                                            obj3 = obj;
                                            i9 = i9;
                                            zzgvmVar5 = zzgvmVar6;
                                            i8 = i34;
                                            i44 = i33;
                                            iZzs = i17;
                                            i42 = i65;
                                            i41 = -1;
                                            i45 = i24;
                                            i40 = 3;
                                            zzgyuVar = this;
                                            Unsafe unsafe1119 = unsafe4;
                                            iZzl = iZzh3;
                                            unsafe6 = unsafe1119;
                                        } else {
                                            obj3 = obj;
                                            i9 = i9;
                                            iZzi = iZzh3;
                                            zzgvmVar5 = zzgvmVar6;
                                            unsafe = unsafe4;
                                            i14 = i33;
                                            i15 = i65;
                                            i45 = i24;
                                            i13 = 3;
                                            zzgyuVar = this;
                                        }
                                        break;
                                    default:
                                        if (i48 == 3) {
                                            int i93 = ((i50 == true ? 1 : 0) & (-8)) | 4;
                                            zzgzk zzgzkVarZzx2 = zzgyuVar.zzx(iZzs);
                                            i32 = iZzi;
                                            iZzh3 = zzgvn.zzc(zzgzkVarZzx2, bArr, iZzi, i8, i93, zzgvmVar);
                                            zzgxsVar.add(zzgvmVar6.zzc);
                                            for (int i94 = i8; iZzh3 < i94; i94 = i94) {
                                                int iZzh17 = zzgvn.zzh(bArr2, iZzh3, zzgvmVar6);
                                                if (i50 != zzgvmVar6.zza) {
                                                    i39 = i94;
                                                    zzgvmVar6 = zzgvmVar6;
                                                    i17 = iZzs;
                                                    z10 = true;
                                                    unsafe4 = unsafe9;
                                                    int i815 = i39;
                                                    i33 = i50 == true ? 1 : 0;
                                                    i34 = i815;
                                                    if (iZzh3 != i32) {
                                                        obj3 = obj;
                                                        i9 = i9;
                                                        zzgvmVar5 = zzgvmVar6;
                                                        i8 = i34;
                                                        i44 = i33;
                                                        iZzs = i17;
                                                        i42 = i65;
                                                        i41 = -1;
                                                        i45 = i24;
                                                        i40 = 3;
                                                        zzgyuVar = this;
                                                        Unsafe unsafe11110 = unsafe4;
                                                        iZzl = iZzh3;
                                                        unsafe6 = unsafe11110;
                                                    } else {
                                                        obj3 = obj;
                                                        i9 = i9;
                                                        iZzi = iZzh3;
                                                        zzgvmVar5 = zzgvmVar6;
                                                        unsafe = unsafe4;
                                                        i14 = i33;
                                                        i15 = i65;
                                                        i45 = i24;
                                                        i13 = 3;
                                                        zzgyuVar = this;
                                                    }
                                                } else {
                                                    iZzh3 = zzgvn.zzc(zzgzkVarZzx2, bArr, iZzh17, i8, i93, zzgvmVar);
                                                    zzgxsVar.add(zzgvmVar6.zzc);
                                                }
                                                break;
                                            }
                                            i39 = i94;
                                            zzgvmVar6 = zzgvmVar6;
                                            i17 = iZzs;
                                            z10 = true;
                                            unsafe4 = unsafe9;
                                            int i816 = i39;
                                            i33 = i50 == true ? 1 : 0;
                                            i34 = i816;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe11111 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe11111;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        } else {
                                            i32 = iZzi;
                                            i65 = i65;
                                            i33 = i50 == true ? 1 : 0;
                                            zzgvmVar6 = zzgvmVar6;
                                            i17 = iZzs;
                                            z10 = true;
                                            unsafe4 = unsafe9;
                                            i34 = i8;
                                            iZzh3 = i32;
                                            if (iZzh3 != i32) {
                                                obj3 = obj;
                                                i9 = i9;
                                                zzgvmVar5 = zzgvmVar6;
                                                i8 = i34;
                                                i44 = i33;
                                                iZzs = i17;
                                                i42 = i65;
                                                i41 = -1;
                                                i45 = i24;
                                                i40 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe11112 = unsafe4;
                                                iZzl = iZzh3;
                                                unsafe6 = unsafe11112;
                                            } else {
                                                obj3 = obj;
                                                i9 = i9;
                                                iZzi = iZzh3;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe4;
                                                i14 = i33;
                                                i15 = i65;
                                                i45 = i24;
                                                i13 = 3;
                                                zzgyuVar = this;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                int i95 = iZzi;
                                i64 = i65;
                                i26 = i50 == true ? 1 : 0;
                                i17 = iZzs;
                                unsafe3 = unsafe9;
                                if (iZzt != 50) {
                                    zzgyuVar = this;
                                    obj3 = obj;
                                    Unsafe unsafe20 = zzb;
                                    long j7 = iArr[i17 + 2] & 1048575;
                                    switch (iZzt) {
                                        case 51:
                                            i27 = i95;
                                            i14 = i26 == true ? 1 : 0;
                                            i28 = i17;
                                            zzgvmVar5 = zzgvmVar6;
                                            i15 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 1) {
                                                iZzk = i27 + 8;
                                                unsafe20.putObject(obj3, j, Double.valueOf(Double.longBitsToDouble(zzgvn.zzn(bArr2, i27))));
                                                unsafe20.putInt(obj3, j7, i15);
                                            } else {
                                                iZzk = i27;
                                            }
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 52:
                                            i27 = i95;
                                            i14 = i26 == true ? 1 : 0;
                                            i28 = i17;
                                            zzgvmVar5 = zzgvmVar6;
                                            i15 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 5) {
                                                iZzk = i27 + 4;
                                                unsafe20.putObject(obj3, j, Float.valueOf(Float.intBitsToFloat(zzgvn.zzb(bArr2, i27))));
                                                unsafe20.putInt(obj3, j7, i15);
                                            } else {
                                                iZzk = i27;
                                            }
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i27 = i95;
                                            i14 = i26 == true ? 1 : 0;
                                            i28 = i17;
                                            zzgvmVar5 = zzgvmVar6;
                                            i29 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 0) {
                                                iZzk = zzgvn.zzk(bArr2, i27, zzgvmVar5);
                                                unsafe20.putObject(obj3, j, Long.valueOf(zzgvmVar5.zzb));
                                                i15 = i29;
                                                unsafe20.putInt(obj3, j7, i15);
                                            } else {
                                                i15 = i29;
                                                iZzk = i27;
                                            }
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i27 = i95;
                                            i14 = i26 == true ? 1 : 0;
                                            i28 = i17;
                                            zzgvmVar5 = zzgvmVar6;
                                            i29 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 0) {
                                                iZzk = zzgvn.zzh(bArr2, i27, zzgvmVar5);
                                                unsafe20.putObject(obj3, j, Integer.valueOf(zzgvmVar5.zza));
                                                unsafe20.putInt(obj3, j7, i29);
                                                i15 = i29;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            i15 = i29;
                                            iZzk = i27;
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i27 = i95;
                                            i14 = i26 == true ? 1 : 0;
                                            i28 = i17;
                                            zzgvmVar5 = zzgvmVar6;
                                            i29 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 1) {
                                                iZzk = i27 + 8;
                                                unsafe20.putObject(obj3, j, Long.valueOf(zzgvn.zzn(bArr2, i27)));
                                                unsafe20.putInt(obj3, j7, i29);
                                                i15 = i29;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            i15 = i29;
                                            iZzk = i27;
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i27 = i95;
                                            i14 = i26 == true ? 1 : 0;
                                            i28 = i17;
                                            zzgvmVar5 = zzgvmVar6;
                                            i29 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 5) {
                                                iZzk = i27 + 4;
                                                unsafe20.putObject(obj3, j, Integer.valueOf(zzgvn.zzb(bArr2, i27)));
                                                unsafe20.putInt(obj3, j7, i29);
                                                i15 = i29;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            i15 = i29;
                                            iZzk = i27;
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 58:
                                            i27 = i95;
                                            i14 = i26 == true ? 1 : 0;
                                            i28 = i17;
                                            zzgvmVar5 = zzgvmVar6;
                                            i29 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 0) {
                                                iZzk = zzgvn.zzk(bArr2, i27, zzgvmVar5);
                                                unsafe20.putObject(obj3, j, Boolean.valueOf(zzgvmVar5.zzb != 0));
                                                unsafe20.putInt(obj3, j7, i29);
                                                i15 = i29;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            i15 = i29;
                                            iZzk = i27;
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 59:
                                            i27 = i95;
                                            i14 = i26 == true ? 1 : 0;
                                            i28 = i17;
                                            zzgvmVar5 = zzgvmVar6;
                                            i29 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 2) {
                                                int iZzh18 = zzgvn.zzh(bArr2, i27, zzgvmVar5);
                                                int i96 = zzgvmVar5.zza;
                                                if (i96 == 0) {
                                                    unsafe20.putObject(obj3, j, "");
                                                } else {
                                                    int i97 = iZzh18 + i96;
                                                    if ((i49 & 536870912) != 0 && !zzhai.zzi(bArr2, iZzh18, i97)) {
                                                        throw new zzgxv("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe20.putObject(obj3, j, new String(bArr2, iZzh18, i96, zzgxt.zza));
                                                    iZzh18 = i97;
                                                }
                                                unsafe20.putInt(obj3, j7, i29);
                                                iZzk = iZzh18;
                                                i15 = i29;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            i15 = i29;
                                            iZzk = i27;
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 60:
                                            i27 = i95;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 2) {
                                                Object objZzB = zzgyuVar.zzB(obj3, i64, i17);
                                                int iZzm2 = zzgvn.zzm(objZzB, zzgyuVar.zzx(i17), bArr, i27, i8, zzgvmVar);
                                                zzgyuVar.zzK(obj3, i64, i17, objZzB);
                                                zzgvmVar5 = zzgvmVar;
                                                iZzk = iZzm2;
                                                i14 = i26 == true ? 1 : 0;
                                                i15 = i64;
                                                i28 = i17;
                                            } else {
                                                i28 = i17;
                                                i14 = i26 == true ? 1 : 0;
                                                i15 = i64;
                                                zzgvmVar5 = zzgvmVar;
                                                iZzk = i27;
                                            }
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 61:
                                            i27 = i95;
                                            i30 = i17;
                                            zzgvmVar4 = zzgvmVar6;
                                            i31 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 2) {
                                                iZza = zzgvn.zza(bArr2, i27, zzgvmVar4);
                                                unsafe20.putObject(obj3, j, zzgvmVar4.zzc);
                                                unsafe20.putInt(obj3, j7, i31);
                                                i28 = i30;
                                                i15 = i31;
                                                iZzk = iZza;
                                                zzgvmVar5 = zzgvmVar4;
                                                i14 = i26 == true ? 1 : 0;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            i28 = i30;
                                            i15 = i31;
                                            zzgvmVar5 = zzgvmVar4;
                                            i14 = i26 == true ? 1 : 0;
                                            iZzk = i27;
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 63:
                                            i27 = i95;
                                            i30 = i17;
                                            zzgvmVar4 = zzgvmVar6;
                                            i31 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 0) {
                                                iZza = zzgvn.zzh(bArr2, i27, zzgvmVar4);
                                                int i98 = zzgvmVar4.zza;
                                                zzgxm zzgxmVarZzw2 = zzgyuVar.zzw(i30);
                                                if (zzgxmVarZzw2 == null || zzgxmVarZzw2.zza(i98)) {
                                                    unsafe20.putObject(obj3, j, Integer.valueOf(i98));
                                                    unsafe20.putInt(obj3, j7, i31);
                                                } else {
                                                    zzd(obj).zzj(i26 == true ? 1 : 0, Long.valueOf(i98));
                                                }
                                                i28 = i30;
                                                i15 = i31;
                                                iZzk = iZza;
                                                zzgvmVar5 = zzgvmVar4;
                                                i14 = i26 == true ? 1 : 0;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            i28 = i30;
                                            i15 = i31;
                                            zzgvmVar5 = zzgvmVar4;
                                            i14 = i26 == true ? 1 : 0;
                                            iZzk = i27;
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 66:
                                            i27 = i95;
                                            i30 = i17;
                                            zzgvmVar4 = zzgvmVar6;
                                            i31 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            if (i48 == 0) {
                                                iZza = zzgvn.zzh(bArr2, i27, zzgvmVar4);
                                                unsafe20.putObject(obj3, j, Integer.valueOf(zzgwe.zzD(zzgvmVar4.zza)));
                                                unsafe20.putInt(obj3, j7, i31);
                                                i28 = i30;
                                                i15 = i31;
                                                iZzk = iZza;
                                                zzgvmVar5 = zzgvmVar4;
                                                i14 = i26 == true ? 1 : 0;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            i28 = i30;
                                            i15 = i31;
                                            zzgvmVar5 = zzgvmVar4;
                                            i14 = i26 == true ? 1 : 0;
                                            iZzk = i27;
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                        case 67:
                                            i30 = i17;
                                            zzgvmVar4 = zzgvmVar6;
                                            i31 = i64;
                                            i13 = 3;
                                            if (i48 == 0) {
                                                i27 = i95;
                                                iZza = zzgvn.zzk(bArr2, i27, zzgvmVar4);
                                                unsafe = unsafe3;
                                                unsafe20.putObject(obj3, j, Long.valueOf(zzgwe.zzF(zzgvmVar4.zzb)));
                                                unsafe20.putInt(obj3, j7, i31);
                                                i28 = i30;
                                                i15 = i31;
                                                iZzk = iZza;
                                                zzgvmVar5 = zzgvmVar4;
                                                i14 = i26 == true ? 1 : 0;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            } else {
                                                i27 = i95;
                                                unsafe = unsafe3;
                                                i28 = i30;
                                                i15 = i31;
                                                zzgvmVar5 = zzgvmVar4;
                                                i14 = i26 == true ? 1 : 0;
                                                iZzk = i27;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i48 == 3) {
                                                int i99 = ((i26 == true ? 1 : 0) & (-8)) | 4;
                                                Object objZzB2 = zzgyuVar.zzB(obj3, i64, i17);
                                                zzgvmVar4 = zzgvmVar6;
                                                i13 = 3;
                                                int iZzl2 = zzgvn.zzl(objZzB2, zzgyuVar.zzx(i17), bArr, i95, i8, i99, zzgvmVar);
                                                zzgyuVar.zzK(obj3, i64, i17, objZzB2);
                                                i28 = i17;
                                                i15 = i64;
                                                iZzk = iZzl2;
                                                i27 = i95;
                                                unsafe = unsafe3;
                                                zzgvmVar5 = zzgvmVar4;
                                                i14 = i26 == true ? 1 : 0;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            } else {
                                                i13 = 3;
                                                i27 = i95;
                                                i14 = i26 == true ? 1 : 0;
                                                i15 = i64;
                                                i28 = i17;
                                                zzgvmVar5 = zzgvmVar6;
                                                unsafe = unsafe3;
                                                iZzk = i27;
                                                if (iZzk != i27) {
                                                    unsafe6 = unsafe;
                                                    i9 = i9;
                                                    i44 = i14 == true ? 1 : 0;
                                                    iZzl = iZzk;
                                                    i42 = i15;
                                                    i40 = i13;
                                                    i41 = -1;
                                                    i45 = i24;
                                                    iZzs = i28;
                                                } else {
                                                    i9 = i9;
                                                    iZzi = iZzk;
                                                    i45 = i24;
                                                    i17 = i28;
                                                }
                                            }
                                            break;
                                        default:
                                            i27 = i95;
                                            i14 = i26 == true ? 1 : 0;
                                            i28 = i17;
                                            zzgvmVar5 = zzgvmVar6;
                                            i15 = i64;
                                            unsafe = unsafe3;
                                            i13 = 3;
                                            iZzk = i27;
                                            if (iZzk != i27) {
                                                unsafe6 = unsafe;
                                                i9 = i9;
                                                i44 = i14 == true ? 1 : 0;
                                                iZzl = iZzk;
                                                i42 = i15;
                                                i40 = i13;
                                                i41 = -1;
                                                i45 = i24;
                                                iZzs = i28;
                                            } else {
                                                i9 = i9;
                                                iZzi = iZzk;
                                                i45 = i24;
                                                i17 = i28;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i48 == 2) {
                                        Unsafe unsafe21 = zzb;
                                        Object objZzz = zzz(i17);
                                        Object object = unsafe21.getObject(obj, j);
                                        if (zzgym.zza(object)) {
                                            zzgyl zzgylVarZzb = zzgyl.zza().zzb();
                                            zzgym.zzb(zzgylVarZzb, object);
                                            unsafe21.putObject(obj, j, zzgylVarZzb);
                                        }
                                        throw null;
                                    }
                                    zzgvmVar3 = zzgvmVar6;
                                    i25 = i95;
                                    zzgyuVar = this;
                                    obj3 = obj;
                                }
                            }
                        } else if (i48 == 2) {
                            zzgxs zzgxsVarZzf2 = (zzgxs) unsafe6.getObject(obj3, j);
                            if (!zzgxsVarZzf2.zzc()) {
                                int size2 = zzgxsVarZzf2.size();
                                zzgxsVarZzf2 = zzgxsVarZzf2.zzf(size2 == 0 ? 10 : size2 + size2);
                                unsafe6.putObject(obj3, j, zzgxsVarZzf2);
                            }
                            iZzl = zzgvn.zze(zzgyuVar.zzx(iZzs), i50 == true ? 1 : 0, bArr, iZzi, i8, zzgxsVarZzf2, zzgvmVar);
                            iZzs = iZzs;
                            unsafe6 = unsafe6;
                            i44 = i50 == true ? 1 : 0;
                            i42 = i64;
                            i41 = -1;
                            i45 = i45;
                            i8 = i8;
                            i9 = i9;
                            zzgvmVar5 = zzgvmVar;
                            i40 = 3;
                        } else {
                            i24 = i45;
                            zzgvmVar3 = zzgvmVar;
                            unsafe3 = unsafe6;
                            i25 = iZzi;
                            i26 = i50 == true ? 1 : 0;
                            i17 = iZzs;
                        }
                        iZzi = i25;
                        i14 = i26;
                        unsafe = unsafe3;
                        zzgvmVar5 = zzgvmVar3;
                        i15 = i64;
                        i45 = i24;
                        i13 = 3;
                    }
                }
                if (i14 != i9 || i9 == 0) {
                    if (zzgyuVar.zzh) {
                        zzgwq zzgwqVar = zzgvmVar5.zzd;
                        int i100 = zzgwq.zzb;
                        int i101 = zzgzb.zza;
                        if (zzgwqVar == zzgwq.zza) {
                            i18 = i14;
                            iZzg = zzgvn.zzg(i18 == true ? 1 : 0, bArr, iZzi, i8, zzd(obj), zzgvmVar);
                        } else {
                            if (zzgwqVar.zzc(zzgyuVar.zzg, i15) != null) {
                                throw null;
                            }
                            i18 = i14;
                            iZzg = zzgvn.zzg(i14, bArr, iZzi, i8, zzd(obj), zzgvmVar);
                        }
                    } else {
                        i18 = i14;
                        iZzg = zzgvn.zzg(i18 == true ? 1 : 0, bArr, iZzi, i8, zzd(obj), zzgvmVar);
                    }
                    unsafe6 = unsafe;
                    zzgvmVar5 = zzgvmVar;
                    i44 = i18;
                    i9 = i9;
                    i42 = i15;
                    iZzs = i17;
                    i40 = i13;
                    i41 = i16;
                    iZzl = iZzg;
                } else {
                    i10 = i8;
                    i12 = i14;
                    iZzl = iZzi;
                    i11 = i43;
                }
            } else {
                i10 = i8;
                i9 = i9;
                unsafe = unsafe6;
                i11 = i43;
                i12 = i44;
            }
        }
        if (i45 != 1048575) {
            unsafe.putInt(obj3, i45, i11);
        }
        for (int i102 = zzgyuVar.zzk; i102 < zzgyuVar.zzl; i102++) {
            zzy(obj, zzgyuVar.zzj[i102], null, zzgyuVar.zzm, obj);
        }
        if (i9 == 0) {
            if (iZzl != i10) {
                throw new zzgxv("Failed to parse the message.");
            }
        } else if (iZzl > i10 || i12 != i9) {
            throw new zzgxv("Failed to parse the message.");
        }
        return iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final Object zze() {
        return ((zzgxg) this.zzg).zzbj();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgxg) {
                zzgxg zzgxgVar = (zzgxg) obj;
                zzgxgVar.zzbT();
                zzgxgVar.zzbS();
                zzgxgVar.zzbV();
            }
            int[] iArr = this.zzc;
            for (int i7 = 0; i7 < iArr.length; i7 += 3) {
                int iZzu = zzu(i7);
                int i8 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i8;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i7)) {
                                    zzx(i7).zzf(zzb.getObject(obj, j));
                                }
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
                                ((zzgxs) zzhad.zzh(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzgyl) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i7], i7)) {
                        zzx(i7).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i7)) {
                    zzx(i7).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzu = zzu(i7);
            int i8 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i9 = iArr[i7];
            long j = i8;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i7)) {
                        zzhad.zzr(obj, j, zzhad.zzb(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i7)) {
                        zzhad.zzs(obj, j, zzhad.zzc(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i7)) {
                        zzhad.zzp(obj, j, zzhad.zzz(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i7)) {
                        zzhad.zzv(obj, j, zzhad.zzh(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i7);
                    break;
                case 10:
                    if (zzN(obj2, i7)) {
                        zzhad.zzv(obj, j, zzhad.zzh(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i7);
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
                    zzgxs zzgxsVarZzf = (zzgxs) zzhad.zzh(obj, j);
                    zzgxs zzgxsVar = (zzgxs) zzhad.zzh(obj2, j);
                    int size = zzgxsVarZzf.size();
                    int size2 = zzgxsVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgxsVarZzf.zzc()) {
                            zzgxsVarZzf = zzgxsVarZzf.zzf(size2 + size);
                        }
                        zzgxsVarZzf.addAll(zzgxsVar);
                    }
                    if (size > 0) {
                        zzgxsVar = zzgxsVarZzf;
                    }
                    zzhad.zzv(obj, j, zzgxsVar);
                    break;
                case 50:
                    int i10 = zzgzm.zza;
                    zzhad.zzv(obj, j, zzgym.zzb(zzhad.zzh(obj, j), zzhad.zzh(obj2, j)));
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
                    if (zzR(obj2, i9, i7)) {
                        zzhad.zzv(obj, j, zzhad.zzh(obj2, j));
                        zzI(obj, i9, i7);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i9, i7)) {
                        zzhad.zzv(obj, j, zzhad.zzh(obj2, j));
                        zzI(obj, i9, i7);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i7);
                    break;
            }
        }
        zzgzm.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzgzm.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x050e  */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzh(Object obj, zzgze zzgzeVar, zzgwq zzgwqVar) {
        zzgwqVar.getClass();
        zzD(obj);
        zzgzw zzgzwVar = this.zzm;
        Object objZza = null;
        while (true) {
            try {
                int iZzc = zzgzeVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    int iZzu = zzu(iZzq);
                    try {
                        switch (zzt(iZzu)) {
                            case 0:
                                zzhad.zzr(obj, iZzu & 1048575, zzgzeVar.zza());
                                zzH(obj, iZzq);
                                break;
                            case 1:
                                zzhad.zzs(obj, iZzu & 1048575, zzgzeVar.zzb());
                                zzH(obj, iZzq);
                                break;
                            case 2:
                                zzhad.zzu(obj, iZzu & 1048575, zzgzeVar.zzl());
                                zzH(obj, iZzq);
                                break;
                            case 3:
                                zzhad.zzu(obj, iZzu & 1048575, zzgzeVar.zzo());
                                zzH(obj, iZzq);
                                break;
                            case 4:
                                zzhad.zzt(obj, iZzu & 1048575, zzgzeVar.zzg());
                                zzH(obj, iZzq);
                                break;
                            case 5:
                                zzhad.zzu(obj, iZzu & 1048575, zzgzeVar.zzk());
                                zzH(obj, iZzq);
                                break;
                            case 6:
                                zzhad.zzt(obj, iZzu & 1048575, zzgzeVar.zzf());
                                zzH(obj, iZzq);
                                break;
                            case 7:
                                zzhad.zzp(obj, iZzu & 1048575, zzgzeVar.zzN());
                                zzH(obj, iZzq);
                                break;
                            case 8:
                                zzG(obj, iZzu, zzgzeVar);
                                zzH(obj, iZzq);
                                break;
                            case 9:
                                zzgyr zzgyrVar = (zzgyr) zzA(obj, iZzq);
                                zzgzeVar.zzu(zzgyrVar, zzx(iZzq), zzgwqVar);
                                zzJ(obj, iZzq, zzgyrVar);
                                break;
                            case 10:
                                zzhad.zzv(obj, iZzu & 1048575, zzgzeVar.zzp());
                                zzH(obj, iZzq);
                                break;
                            case 11:
                                zzhad.zzt(obj, iZzu & 1048575, zzgzeVar.zzj());
                                zzH(obj, iZzq);
                                break;
                            case 12:
                                int iZze = zzgzeVar.zze();
                                zzgxm zzgxmVarZzw = zzw(iZzq);
                                if (zzgxmVarZzw == null || zzgxmVarZzw.zza(iZze)) {
                                    zzhad.zzt(obj, iZzu & 1048575, iZze);
                                    zzH(obj, iZzq);
                                } else {
                                    objZza = zzgzm.zzo(obj, iZzc, iZze, objZza, zzgzwVar);
                                }
                                break;
                            case 13:
                                zzhad.zzt(obj, iZzu & 1048575, zzgzeVar.zzh());
                                zzH(obj, iZzq);
                                break;
                            case 14:
                                zzhad.zzu(obj, iZzu & 1048575, zzgzeVar.zzm());
                                zzH(obj, iZzq);
                                break;
                            case 15:
                                zzhad.zzt(obj, iZzu & 1048575, zzgzeVar.zzi());
                                zzH(obj, iZzq);
                                break;
                            case 16:
                                zzhad.zzu(obj, iZzu & 1048575, zzgzeVar.zzn());
                                zzH(obj, iZzq);
                                break;
                            case 17:
                                zzgyr zzgyrVar2 = (zzgyr) zzA(obj, iZzq);
                                zzgzeVar.zzt(zzgyrVar2, zzx(iZzq), zzgwqVar);
                                zzJ(obj, iZzq, zzgyrVar2);
                                break;
                            case 18:
                                zzgzeVar.zzx(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 19:
                                zzgzeVar.zzB(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 20:
                                zzgzeVar.zzE(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case zzbbd.zzt.zzm /* 21 */:
                                zzgzeVar.zzM(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 22:
                                zzgzeVar.zzD(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 23:
                                zzgzeVar.zzA(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 24:
                                zzgzeVar.zzz(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 25:
                                zzgzeVar.zzv(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 26:
                                if (zzM(iZzu)) {
                                    ((zzgwf) zzgzeVar).zzK(zzgye.zza(obj, iZzu & 1048575), true);
                                } else {
                                    ((zzgwf) zzgzeVar).zzK(zzgye.zza(obj, iZzu & 1048575), false);
                                }
                                break;
                            case 27:
                                zzgzeVar.zzF(zzgye.zza(obj, iZzu & 1048575), zzx(iZzq), zzgwqVar);
                                break;
                            case 28:
                                zzgzeVar.zzw(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 29:
                                zzgzeVar.zzL(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 30:
                                List listZza = zzgye.zza(obj, iZzu & 1048575);
                                zzgzeVar.zzy(listZza);
                                objZza = zzgzm.zzn(obj, iZzc, listZza, zzw(iZzq), objZza, zzgzwVar);
                                break;
                            case 31:
                                zzgzeVar.zzG(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 32:
                                zzgzeVar.zzH(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 33:
                                zzgzeVar.zzI(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 34:
                                zzgzeVar.zzJ(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 35:
                                zzgzeVar.zzx(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 36:
                                zzgzeVar.zzB(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 37:
                                zzgzeVar.zzE(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 38:
                                zzgzeVar.zzM(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 39:
                                zzgzeVar.zzD(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 40:
                                zzgzeVar.zzA(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 41:
                                zzgzeVar.zzz(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 42:
                                zzgzeVar.zzv(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 43:
                                zzgzeVar.zzL(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 44:
                                List listZza2 = zzgye.zza(obj, iZzu & 1048575);
                                zzgzeVar.zzy(listZza2);
                                objZza = zzgzm.zzn(obj, iZzc, listZza2, zzw(iZzq), objZza, zzgzwVar);
                                break;
                            case 45:
                                zzgzeVar.zzG(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 46:
                                zzgzeVar.zzH(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 47:
                                zzgzeVar.zzI(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 48:
                                zzgzeVar.zzJ(zzgye.zza(obj, iZzu & 1048575));
                                break;
                            case 49:
                                zzgzeVar.zzC(zzgye.zza(obj, iZzu & 1048575), zzx(iZzq), zzgwqVar);
                                break;
                            case 50:
                                Object objZzz = zzz(iZzq);
                                long jZzu = zzu(iZzq) & 1048575;
                                Object objZzh = zzhad.zzh(obj, jZzu);
                                if (objZzh == null) {
                                    objZzh = zzgyl.zza().zzb();
                                    zzhad.zzv(obj, jZzu, objZzh);
                                } else if (zzgym.zza(objZzh)) {
                                    Object objZzb = zzgyl.zza().zzb();
                                    zzgym.zzb(objZzb, objZzh);
                                    zzhad.zzv(obj, jZzu, objZzb);
                                    objZzh = objZzb;
                                }
                                throw null;
                            case 51:
                                zzhad.zzv(obj, iZzu & 1048575, Double.valueOf(zzgzeVar.zza()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 52:
                                zzhad.zzv(obj, iZzu & 1048575, Float.valueOf(zzgzeVar.zzb()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 53:
                                zzhad.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzeVar.zzl()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 54:
                                zzhad.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzeVar.zzo()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 55:
                                zzhad.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzeVar.zzg()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 56:
                                zzhad.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzeVar.zzk()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 57:
                                zzhad.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzeVar.zzf()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 58:
                                zzhad.zzv(obj, iZzu & 1048575, Boolean.valueOf(zzgzeVar.zzN()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 59:
                                zzG(obj, iZzu, zzgzeVar);
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 60:
                                zzgyr zzgyrVar3 = (zzgyr) zzB(obj, iZzc, iZzq);
                                zzgzeVar.zzu(zzgyrVar3, zzx(iZzq), zzgwqVar);
                                zzK(obj, iZzc, iZzq, zzgyrVar3);
                                break;
                            case 61:
                                zzhad.zzv(obj, iZzu & 1048575, zzgzeVar.zzp());
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 62:
                                zzhad.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzeVar.zzj()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 63:
                                int iZze2 = zzgzeVar.zze();
                                zzgxm zzgxmVarZzw2 = zzw(iZzq);
                                if (zzgxmVarZzw2 == null || zzgxmVarZzw2.zza(iZze2)) {
                                    zzhad.zzv(obj, iZzu & 1048575, Integer.valueOf(iZze2));
                                    zzI(obj, iZzc, iZzq);
                                } else {
                                    objZza = zzgzm.zzo(obj, iZzc, iZze2, objZza, zzgzwVar);
                                }
                                break;
                            case 64:
                                zzhad.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzeVar.zzh()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 65:
                                zzhad.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzeVar.zzm()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 66:
                                zzhad.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzeVar.zzi()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 67:
                                zzhad.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzeVar.zzn()));
                                zzI(obj, iZzc, iZzq);
                                break;
                            case 68:
                                zzgyr zzgyrVar4 = (zzgyr) zzB(obj, iZzc, iZzq);
                                zzgzeVar.zzt(zzgyrVar4, zzx(iZzq), zzgwqVar);
                                zzK(obj, iZzc, iZzq, zzgyrVar4);
                                break;
                            default:
                                if (objZza == null) {
                                    objZza = zzgzwVar.zza(obj);
                                }
                                if (!zzgzwVar.zzk(objZza, zzgzeVar, 0)) {
                                    for (int i7 = this.zzk; i7 < this.zzl; i7++) {
                                        zzy(obj, this.zzj[i7], objZza, zzgzwVar, obj);
                                    }
                                }
                                break;
                        }
                    } catch (zzgxu unused) {
                        if (objZza == null) {
                            objZza = zzgzwVar.zza(obj);
                        }
                        if (!zzgzwVar.zzk(objZza, zzgzeVar, 0)) {
                            for (int i8 = this.zzk; i8 < this.zzl; i8++) {
                                zzy(obj, this.zzj[i8], objZza, zzgzwVar, obj);
                            }
                            if (objZza != null) {
                                zzgzwVar.zzj(obj, objZza);
                            }
                        }
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    for (int i9 = this.zzk; i9 < this.zzl; i9++) {
                        zzy(obj, this.zzj[i9], objZza, zzgzwVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzgwqVar.zzc(this.zzg, iZzc)) != null) {
                        throw null;
                    }
                    if (objZza == null) {
                        objZza = zzgzwVar.zza(obj);
                    }
                    if (!zzgzwVar.zzk(objZza, zzgzeVar, 0)) {
                        for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                            zzy(obj, this.zzj[i10], objZza, zzgzwVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i11 = this.zzk; i11 < this.zzl; i11++) {
                    zzy(obj, this.zzj[i11], objZza, zzgzwVar, obj);
                }
                if (objZza != null) {
                    zzgzwVar.zzj(obj, objZza);
                }
                throw th;
            }
        }
        if (objZza != null) {
            zzgzwVar.zzj(obj, objZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzgvm zzgvmVar) {
        zzc(obj, bArr, i7, i8, 0, zzgvmVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzj(Object obj, zzhal zzhalVar) {
        Map.Entry entry;
        Iterator it;
        int i7;
        Map.Entry entry2;
        int i8;
        boolean z4;
        boolean z7;
        if (this.zzh) {
            zzgwv zzgwvVar = ((zzgxc) obj).zza;
            if (zzgwvVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzgwvVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < iArr.length) {
            int iZzu = zzu(i11);
            int[] iArr2 = this.zzc;
            int iZzt = zzt(iZzu);
            int i12 = iArr2[i11];
            if (iZzt <= 17) {
                int i13 = iArr2[i11 + 2];
                int i14 = i13 & 1048575;
                if (i14 != i9) {
                    i10 = i14 == 1048575 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                } else {
                    entry = entry;
                }
                i8 = 1 << (i13 >>> 20);
                i7 = i10;
                entry2 = entry;
            } else {
                i7 = i10;
                entry2 = entry;
                i8 = 0;
            }
            int i15 = i9;
            while (entry2 != null && ((zzgxd) entry2.getKey()).zza <= i12) {
                this.zzn.zzb(zzhalVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzf(i12, zzhad.zzb(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 1:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzo(i12, zzhad.zzc(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 2:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzt(i12, unsafe.getLong(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 3:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzK(i12, unsafe.getLong(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 4:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzr(i12, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 5:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzm(i12, unsafe.getLong(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 6:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzk(i12, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 7:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzb(i12, zzhad.zzz(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 8:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzT(i12, unsafe.getObject(obj, j), zzhalVar);
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 9:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzv(i12, unsafe.getObject(obj, j), zzx(i11));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 10:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzd(i12, (zzgvy) unsafe.getObject(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 11:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzI(i12, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 12:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzi(i12, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 13:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzx(i12, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 14:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzz(i12, unsafe.getLong(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 15:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzB(i12, unsafe.getInt(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 16:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzD(i12, unsafe.getLong(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 17:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i11, i15, i7, i8)) {
                        zzhalVar.zzq(i12, unsafe.getObject(obj, j), zzx(i11));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 18:
                    z4 = false;
                    zzgzm.zzt(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 19:
                    z4 = false;
                    zzgzm.zzx(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 20:
                    z4 = false;
                    zzgzm.zzA(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    z4 = false;
                    zzgzm.zzI(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 22:
                    z4 = false;
                    zzgzm.zzz(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 23:
                    z4 = false;
                    zzgzm.zzw(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 24:
                    z4 = false;
                    zzgzm.zzv(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 25:
                    z4 = false;
                    zzgzm.zzr(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 26:
                    zzgzm.zzG(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 27:
                    zzgzm.zzB(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, zzx(i11));
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 28:
                    zzgzm.zzs(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 29:
                    z7 = false;
                    zzgzm.zzH(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 30:
                    z7 = false;
                    zzgzm.zzu(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 31:
                    z7 = false;
                    zzgzm.zzC(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 32:
                    z7 = false;
                    zzgzm.zzD(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 33:
                    z7 = false;
                    zzgzm.zzE(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 34:
                    z7 = false;
                    zzgzm.zzF(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, false);
                    it = it;
                    iArr = iArr;
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 35:
                    zzgzm.zzt(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 36:
                    zzgzm.zzx(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 37:
                    zzgzm.zzA(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 38:
                    zzgzm.zzI(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 39:
                    zzgzm.zzz(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 40:
                    zzgzm.zzw(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 41:
                    zzgzm.zzv(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 42:
                    zzgzm.zzr(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 43:
                    zzgzm.zzH(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 44:
                    zzgzm.zzu(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 45:
                    zzgzm.zzC(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 46:
                    zzgzm.zzD(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 47:
                    zzgzm.zzE(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 48:
                    zzgzm.zzF(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, true);
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 49:
                    zzgzm.zzy(this.zzc[i11], (List) unsafe.getObject(obj, j), zzhalVar, zzx(i11));
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 51:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzf(i12, zzn(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 52:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzo(i12, zzo(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 53:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzt(i12, zzv(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 54:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzK(i12, zzv(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 55:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzr(i12, zzp(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 56:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzm(i12, zzv(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 57:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzk(i12, zzp(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 58:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzb(i12, zzS(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 59:
                    if (zzR(obj, i12, i11)) {
                        zzT(i12, unsafe.getObject(obj, j), zzhalVar);
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 60:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzv(i12, unsafe.getObject(obj, j), zzx(i11));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 61:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzd(i12, (zzgvy) unsafe.getObject(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 62:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzI(i12, zzp(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 63:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzi(i12, zzp(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 64:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzx(i12, zzp(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 65:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzz(i12, zzv(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 66:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzB(i12, zzp(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 67:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzD(i12, zzv(obj, j));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                case 68:
                    if (zzR(obj, i12, i11)) {
                        zzhalVar.zzq(i12, unsafe.getObject(obj, j), zzx(i11));
                    }
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
                default:
                    i11 += 3;
                    i9 = i15;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i10 = i7;
                    break;
            }
        }
        Iterator it2 = it;
        while (entry != null) {
            this.zzn.zzb(zzhalVar, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        ((zzgxg) obj).zzt.zzl(zzhalVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzJ;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzu = zzu(i7);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i7) || Double.doubleToLongBits(zzhad.zzb(obj, j)) != Double.doubleToLongBits(zzhad.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i7) || Float.floatToIntBits(zzhad.zzc(obj, j)) != Float.floatToIntBits(zzhad.zzc(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i7) || zzhad.zzf(obj, j) != zzhad.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i7) || zzhad.zzf(obj, j) != zzhad.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i7) || zzhad.zzd(obj, j) != zzhad.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i7) || zzhad.zzf(obj, j) != zzhad.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i7) || zzhad.zzd(obj, j) != zzhad.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i7) || zzhad.zzz(obj, j) != zzhad.zzz(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i7) || !zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i7) || !zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i7) || !zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i7) || zzhad.zzd(obj, j) != zzhad.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i7) || zzhad.zzd(obj, j) != zzhad.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i7) || zzhad.zzd(obj, j) != zzhad.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i7) || zzhad.zzf(obj, j) != zzhad.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i7) || zzhad.zzd(obj, j) != zzhad.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i7) || zzhad.zzf(obj, j) != zzhad.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i7) || !zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
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
                    zZzJ = zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j));
                    break;
                case 50:
                    zZzJ = zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j));
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
                    long jZzr = zzr(i7) & 1048575;
                    if (zzhad.zzd(obj, jZzr) != zzhad.zzd(obj2, jZzr) || !zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzJ) {
                return false;
            }
        }
        if (!((zzgxg) obj).zzt.equals(((zzgxg) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzgxc) obj).zza.equals(((zzgxc) obj2).zza);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzk
    public final boolean zzl(Object obj) {
        int i7;
        int i8;
        List list;
        zzgzk zzgzkVarZzx;
        int i9;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i13 = iArr[i11];
            int i14 = iArr2[i13];
            int iZzu = zzu(i13);
            int i15 = this.zzc[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = zzb.getInt(obj, i16);
                }
                i8 = i10;
                i7 = i16;
            } else {
                i7 = i12;
                i8 = i10;
            }
            if ((268435456 & iZzu) != 0 && !zzO(obj, i13, i7, i8, i17)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj, i13, i7, i8, i17) && !zzP(obj, iZzu, zzx(i13))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzhad.zzh(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgzkVarZzx = zzx(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!zzgzkVarZzx.zzl(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i14, i13) && !zzP(obj, iZzu, zzx(i13))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzhad.zzh(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzgzkVarZzx = zzx(i13);
                    while (i9 < list.size()) {
                        if (!zzgzkVarZzx.zzl(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzgyl) zzhad.zzh(obj, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i11++;
            i12 = i7;
            i10 = i8;
        }
        return !this.zzh || ((zzgxc) obj).zza.zzi();
    }
}
