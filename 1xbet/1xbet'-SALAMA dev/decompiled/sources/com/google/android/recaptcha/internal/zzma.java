package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbd;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p031e1.k;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzma<T> implements zzmk<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzni.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlx zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zznb zzm;
    private final zzke zzn;

    private zzma(int[] iArr, Object[] objArr, int i7, int i8, zzlx zzlxVar, int i9, boolean z4, int[] iArr2, int i10, int i11, zzmd zzmdVar, zzlk zzlkVar, zznb zznbVar, zzke zzkeVar, zzls zzlsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i7;
        this.zzf = i8;
        this.zzi = zzlxVar instanceof zzks;
        boolean z7 = false;
        if (zzkeVar != null && zzkeVar.zzj(zzlxVar)) {
            z7 = true;
        }
        this.zzh = z7;
        this.zzj = iArr2;
        this.zzk = i10;
        this.zzl = i11;
        this.zzm = zznbVar;
        this.zzn = zzkeVar;
        this.zzg = zzlxVar;
    }

    private final Object zzA(Object obj, int i7) {
        zzmk zzmkVarZzx = zzx(i7);
        int iZzu = zzu(i7) & 1048575;
        if (!zzN(obj, i7)) {
            return zzmkVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzmkVarZzx.zze();
        if (object != null) {
            zzmkVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i7, int i8) {
        zzmk zzmkVarZzx = zzx(i8);
        if (!zzR(obj, i7, i8)) {
            return zzmkVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i8) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzmkVarZzx.zze();
        if (object != null) {
            zzmkVarZzx.zzg(objZze, object);
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
            zzmk zzmkVarZzx = zzx(i7);
            if (!zzN(obj, i7)) {
                if (zzQ(object)) {
                    Object objZze = zzmkVarZzx.zze();
                    zzmkVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzmkVarZzx.zze();
                zzmkVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzmkVarZzx.zzg(object2, object);
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
            zzmk zzmkVarZzx = zzx(i7);
            if (!zzR(obj, i8, i7)) {
                if (zzQ(object)) {
                    Object objZze = zzmkVarZzx.zze();
                    zzmkVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzmkVarZzx.zze();
                zzmkVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzmkVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i7, zzmj zzmjVar) {
        long j = i7 & 1048575;
        if (zzM(i7)) {
            zzni.zzs(obj, j, zzmjVar.zzs());
        } else if (this.zzi) {
            zzni.zzs(obj, j, zzmjVar.zzr());
        } else {
            zzni.zzs(obj, j, zzmjVar.zzp());
        }
    }

    private final void zzH(Object obj, int i7) {
        int iZzr = zzr(i7);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzni.zzq(obj, j, (1 << (iZzr >>> 20)) | zzni.zzc(obj, j));
    }

    private final void zzI(Object obj, int i7, int i8) {
        zzni.zzq(obj, zzr(i8) & 1048575, i7);
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
            return (zzni.zzc(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i7);
        long j3 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzni.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzni.zzb(obj, j3)) != 0;
            case 2:
                return zzni.zzd(obj, j3) != 0;
            case 3:
                return zzni.zzd(obj, j3) != 0;
            case 4:
                return zzni.zzc(obj, j3) != 0;
            case 5:
                return zzni.zzd(obj, j3) != 0;
            case 6:
                return zzni.zzc(obj, j3) != 0;
            case 7:
                return zzni.zzw(obj, j3);
            case 8:
                Object objZzf = zzni.zzf(obj, j3);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zziv) {
                    return !zziv.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzni.zzf(obj, j3) != null;
            case 10:
                return !zziv.zzb.equals(zzni.zzf(obj, j3));
            case 11:
                return zzni.zzc(obj, j3) != 0;
            case 12:
                return zzni.zzc(obj, j3) != 0;
            case 13:
                return zzni.zzc(obj, j3) != 0;
            case 14:
                return zzni.zzd(obj, j3) != 0;
            case 15:
                return zzni.zzc(obj, j3) != 0;
            case 16:
                return zzni.zzd(obj, j3) != 0;
            case 17:
                return zzni.zzf(obj, j3) != null;
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

    private static boolean zzP(Object obj, int i7, zzmk zzmkVar) {
        return zzmkVar.zzl(zzni.zzf(obj, i7 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzks) {
            return ((zzks) obj).zzI();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i7, int i8) {
        return zzni.zzc(obj, (long) (zzr(i8) & 1048575)) == i7;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzni.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i7, Object obj, zzno zznoVar) {
        if (obj instanceof String) {
            zznoVar.zzG(i7, (String) obj);
        } else {
            zznoVar.zzd(i7, (zziv) obj);
        }
    }

    public static zznc zzd(Object obj) {
        zzks zzksVar = (zzks) obj;
        zznc zzncVar = zzksVar.zzc;
        if (zzncVar != zznc.zzc()) {
            return zzncVar;
        }
        zznc zzncVarZzf = zznc.zzf();
        zzksVar.zzc = zzncVarZzf;
        return zzncVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:127:0x026b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0281  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    public static zzma zzm(Class cls, zzlu zzluVar, zzmd zzmdVar, zzlk zzlkVar, zznb zznbVar, zzke zzkeVar, zzls zzlsVar) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
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
        int iObjectFieldOffset;
        int i23;
        int i24;
        int i25;
        int iObjectFieldOffset2;
        Field fieldZzC;
        char cCharAt9;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Object obj;
        Field fieldZzC2;
        int i31;
        Object obj2;
        Field fieldZzC3;
        int i32;
        char cCharAt10;
        int i33;
        char cCharAt11;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        if (!(zzluVar instanceof zzmi)) {
            throw null;
        }
        zzmi zzmiVar = (zzmi) zzluVar;
        String strZzd = zzmiVar.zzd();
        int length = strZzd.length();
        char c3 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i7 = i36 + 1;
                if (strZzd.charAt(i36) < 55296) {
                    break;
                }
                i36 = i7;
            }
        } else {
            i7 = 1;
        }
        int i37 = i7 + 1;
        int iCharAt3 = strZzd.charAt(i7);
        if (iCharAt3 >= 55296) {
            int i38 = iCharAt3 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                cCharAt13 = strZzd.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            iCharAt3 = i38 | (cCharAt13 << i39);
            i37 = i35;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i9 = 0;
            i12 = 0;
            i8 = 0;
            i10 = 0;
            iArr = zza;
            i11 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt4 = strZzd.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i20 = i40 + 1;
                    cCharAt8 = strZzd.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i20;
                }
                iCharAt4 = i41 | (cCharAt8 << i42);
                i40 = i20;
            }
            int i43 = i40 + 1;
            int iCharAt5 = strZzd.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i19 = i43 + 1;
                    cCharAt7 = strZzd.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i19;
                }
                iCharAt5 = i44 | (cCharAt7 << i45);
                i43 = i19;
            }
            int i46 = i43 + 1;
            int iCharAt6 = strZzd.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i18 = i46 + 1;
                    cCharAt6 = strZzd.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i18;
                }
                iCharAt6 = i47 | (cCharAt6 << i48);
                i46 = i18;
            }
            int i49 = i46 + 1;
            int iCharAt7 = strZzd.charAt(i46);
            if (iCharAt7 >= 55296) {
                int i50 = iCharAt7 & 8191;
                int i51 = 13;
                while (true) {
                    i17 = i49 + 1;
                    cCharAt5 = strZzd.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i17;
                }
                iCharAt7 = i50 | (cCharAt5 << i51);
                i49 = i17;
            }
            int i52 = i49 + 1;
            iCharAt = strZzd.charAt(i49);
            if (iCharAt >= 55296) {
                int i53 = iCharAt & 8191;
                int i54 = 13;
                while (true) {
                    i16 = i52 + 1;
                    cCharAt4 = strZzd.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i16;
                }
                iCharAt = i53 | (cCharAt4 << i54);
                i52 = i16;
            }
            int i55 = i52 + 1;
            iCharAt2 = strZzd.charAt(i52);
            if (iCharAt2 >= 55296) {
                int i56 = iCharAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i15 = i55 + 1;
                    cCharAt3 = strZzd.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i15;
                }
                iCharAt2 = i56 | (cCharAt3 << i57);
                i55 = i15;
            }
            int i58 = i55 + 1;
            int iCharAt8 = strZzd.charAt(i55);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i14 = i58 + 1;
                    cCharAt2 = strZzd.charAt(i58);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i14;
                }
                iCharAt8 = i59 | (cCharAt2 << i60);
                i58 = i14;
            }
            int i61 = i58 + 1;
            int iCharAt9 = strZzd.charAt(i58);
            if (iCharAt9 >= 55296) {
                int i62 = iCharAt9 & 8191;
                int i63 = 13;
                while (true) {
                    i13 = i61 + 1;
                    cCharAt = strZzd.charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i63;
                    i63 += 13;
                    i61 = i13;
                }
                iCharAt9 = i62 | (cCharAt << i63);
                i61 = i13;
            }
            i8 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i9 = iCharAt6;
            i10 = iCharAt9;
            i11 = iCharAt4;
            i12 = iCharAt7;
            i37 = i61;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzmiVar.zze();
        Class<?> cls2 = zzmiVar.zza().getClass();
        int i64 = i10 + iCharAt2;
        int i65 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i65];
        int i66 = 0;
        int i67 = 0;
        int i68 = i10;
        int i69 = i64;
        while (i37 < length) {
            int i70 = i37 + 1;
            int iCharAt10 = strZzd.charAt(i37);
            if (iCharAt10 >= c3) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i34 = i72 + 1;
                    cCharAt12 = strZzd.charAt(i72);
                    if (cCharAt12 < c3) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i34;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i21 = i34;
            } else {
                i21 = i70;
            }
            int i74 = i21 + 1;
            int iCharAt11 = strZzd.charAt(i21);
            if (iCharAt11 >= c3) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i33 = i76 + 1;
                    cCharAt11 = strZzd.charAt(i76);
                    if (cCharAt11 < c3) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i76 = i33;
                }
                iCharAt11 = i75 | (cCharAt11 << i77);
                i22 = i33;
            } else {
                i22 = i74;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i78 = iCharAt11 & 255;
            int i79 = iCharAt11 & 2048;
            int i80 = length;
            if (i78 >= 51) {
                int i81 = i22 + 1;
                int iCharAt12 = strZzd.charAt(i22);
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = 13;
                    int i83 = iCharAt12 & 8191;
                    int i84 = i81;
                    while (true) {
                        i32 = i84 + 1;
                        cCharAt10 = strZzd.charAt(i84);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i82;
                        i82 += 13;
                        i84 = i32;
                        c4 = 55296;
                    }
                    iCharAt12 = i83 | (cCharAt10 << i82);
                    i28 = i32;
                } else {
                    i28 = i81;
                }
                int i85 = i28;
                int i86 = i78 - 51;
                if (i86 == 9 || i86 == 17) {
                    i29 = i8 + 1;
                    int i87 = i67 / 3;
                    objArr[i87 + i87 + 1] = objArrZze[i8];
                } else {
                    if (i86 == 12) {
                        if (zzmiVar.zzc() == 1 || i79 != 0) {
                            i29 = i8 + 1;
                            int i88 = i67 / 3;
                            objArr[i88 + i88 + 1] = objArrZze[i8];
                        } else {
                            i79 = 0;
                        }
                    }
                    i30 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i30];
                    if (obj instanceof Field) {
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i30] = fieldZzC2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i31 = i30 + 1;
                    obj2 = objArrZze[i31];
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i31] = fieldZzC3;
                    }
                    zzmiVar = zzmiVar;
                    strZzd = strZzd;
                    i25 = i8;
                    i23 = i85;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                    i24 = 0;
                }
                i8 = i29;
                i30 = iCharAt12 + iCharAt12;
                obj = objArrZze[i30];
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i30] = fieldZzC2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                i31 = i30 + 1;
                obj2 = objArrZze[i31];
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i31] = fieldZzC3;
                }
                zzmiVar = zzmiVar;
                strZzd = strZzd;
                i25 = i8;
                i23 = i85;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                i24 = 0;
            } else {
                int i89 = i8 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i8]);
                if (i78 == 9 || i78 == 17) {
                    zzmiVar = zzmiVar;
                    int i90 = i67 / 3;
                    objArr[i90 + i90 + 1] = fieldZzC4.getType();
                } else {
                    if (i78 == 27) {
                        i26 = 1;
                        i27 = i8 + 2;
                    } else if (i78 == 49) {
                        i27 = i8 + 2;
                        i26 = 1;
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        zzmiVar = zzmiVar;
                        if (zzmiVar.zzc() == 1 || i79 != 0) {
                            i27 = i8 + 2;
                            int i91 = i67 / 3;
                            objArr[i91 + i91 + 1] = objArrZze[i89];
                            i89 = i27;
                        } else {
                            i79 = 0;
                        }
                    } else {
                        if (i78 == 50) {
                            int i92 = i8 + 2;
                            int i93 = i68 + 1;
                            iArr[i68] = i67;
                            int i94 = i67 / 3;
                            int i95 = i94 + i94;
                            objArr[i95] = objArrZze[i89];
                            if (i79 != 0) {
                                i89 = i8 + 3;
                                objArr[i95 + 1] = objArrZze[i92];
                                i68 = i93;
                            } else {
                                i89 = i92;
                                i68 = i93;
                                i79 = 0;
                            }
                        }
                        zzmiVar = zzmiVar;
                    }
                    int i96 = i67 / 3;
                    objArr[i96 + i96 + i26] = objArrZze[i89];
                    i89 = i27;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i78 > 17) {
                    i23 = i22;
                    i24 = 0;
                } else {
                    int i97 = i22 + 1;
                    int iCharAt13 = strZzd.charAt(i22);
                    if (iCharAt13 >= 55296) {
                        int i98 = iCharAt13 & 8191;
                        int i99 = 13;
                        while (true) {
                            i23 = i97 + 1;
                            cCharAt9 = strZzd.charAt(i97);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i98 |= (cCharAt9 & 8191) << i99;
                            i99 += 13;
                            i97 = i23;
                        }
                        iCharAt13 = i98 | (cCharAt9 << i99);
                    } else {
                        i23 = i97;
                    }
                    int i100 = (iCharAt13 / 32) + i11 + i11;
                    Object obj3 = objArrZze[i100];
                    if (obj3 instanceof Field) {
                        fieldZzC = (Field) obj3;
                    } else {
                        fieldZzC = zzC(cls2, (String) obj3);
                        objArrZze[i100] = fieldZzC;
                    }
                    i24 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC);
                }
                if (i78 >= 18 && i78 <= 49) {
                    iArr[i69] = iObjectFieldOffset3;
                    i69++;
                }
                i25 = i89;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i101 = i67 + 1;
            iArr2[i67] = iCharAt10;
            int i102 = i67 + 2;
            iArr2[i101] = iObjectFieldOffset2 | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i79 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20);
            i67 += 3;
            iArr2[i102] = (i24 << 20) | iObjectFieldOffset;
            i8 = i25;
            i37 = i23;
            length = i80;
            zzmiVar = zzmiVar;
            strZzd = strZzd;
            i12 = i12;
            i9 = i9;
            c3 = 55296;
        }
        zzmi zzmiVar2 = zzmiVar;
        return new zzma(iArr2, objArr, i9, i12, zzmiVar2.zza(), zzmiVar2.zzc(), false, iArr, i10, i64, zzmdVar, zzlkVar, zznbVar, zzkeVar, zzlsVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzni.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzni.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzni.zzf(obj, j)).intValue();
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
        return ((Long) zzni.zzf(obj, j)).longValue();
    }

    private final zzkw zzw(int i7) {
        int i8 = i7 / 3;
        return (zzkw) this.zzd[i8 + i8 + 1];
    }

    private final zzmk zzx(int i7) {
        Object[] objArr = this.zzd;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        zzmk zzmkVar = (zzmk) objArr[i9];
        if (zzmkVar != null) {
            return zzmkVar;
        }
        zzmk zzmkVarZzb = zzmg.zza().zzb((Class) objArr[i9 + 1]);
        this.zzd[i9] = zzmkVarZzb;
        return zzmkVarZzb;
    }

    private final Object zzy(Object obj, int i7, Object obj2, zznb zznbVar, Object obj3) {
        int i8 = this.zzc[i7];
        Object objZzf = zzni.zzf(obj, zzu(i7) & 1048575);
        if (objZzf == null || zzw(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zza(java.lang.Object):int");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zzb(Object obj) {
        int i7;
        long jDoubleToLongBits;
        int i8;
        int iFloatToIntBits;
        int iZzc;
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
                    jDoubleToLongBits = Double.doubleToLongBits(zzni.zza(obj, j));
                    byte[] bArr = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzc;
                    break;
                case 1:
                    i8 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzni.zzb(obj, j));
                    i10 = iFloatToIntBits + i8;
                    break;
                case 2:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr2 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzc;
                    break;
                case 3:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr3 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzc;
                    break;
                case 4:
                    i7 = i10 * 53;
                    iZzc = zzni.zzc(obj, j);
                    i10 = i7 + iZzc;
                    break;
                case 5:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr4 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzc;
                    break;
                case 6:
                    i7 = i10 * 53;
                    iZzc = zzni.zzc(obj, j);
                    i10 = i7 + iZzc;
                    break;
                case 7:
                    i8 = i10 * 53;
                    iFloatToIntBits = zzla.zza(zzni.zzw(obj, j));
                    i10 = iFloatToIntBits + i8;
                    break;
                case 8:
                    i8 = i10 * 53;
                    iFloatToIntBits = ((String) zzni.zzf(obj, j)).hashCode();
                    i10 = iFloatToIntBits + i8;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object objZzf = zzni.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i10 = i9 + iHashCode;
                    break;
                case 10:
                    i8 = i10 * 53;
                    iFloatToIntBits = zzni.zzf(obj, j).hashCode();
                    i10 = iFloatToIntBits + i8;
                    break;
                case 11:
                    i7 = i10 * 53;
                    iZzc = zzni.zzc(obj, j);
                    i10 = i7 + iZzc;
                    break;
                case 12:
                    i7 = i10 * 53;
                    iZzc = zzni.zzc(obj, j);
                    i10 = i7 + iZzc;
                    break;
                case 13:
                    i7 = i10 * 53;
                    iZzc = zzni.zzc(obj, j);
                    i10 = i7 + iZzc;
                    break;
                case 14:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr5 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzc;
                    break;
                case 15:
                    i7 = i10 * 53;
                    iZzc = zzni.zzc(obj, j);
                    i10 = i7 + iZzc;
                    break;
                case 16:
                    i7 = i10 * 53;
                    jDoubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr6 = zzla.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i7 + iZzc;
                    break;
                case 17:
                    i9 = i10 * 53;
                    Object objZzf2 = zzni.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
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
                    iFloatToIntBits = zzni.zzf(obj, j).hashCode();
                    i10 = iFloatToIntBits + i8;
                    break;
                case 50:
                    i8 = i10 * 53;
                    iFloatToIntBits = zzni.zzf(obj, j).hashCode();
                    i10 = iFloatToIntBits + i8;
                    break;
                case 51:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzc;
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
                        byte[] bArr8 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzc = zzp(obj, j);
                        i10 = i7 + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzc = zzp(obj, j);
                        i10 = i7 + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = zzla.zza(zzS(obj, j));
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
                case 59:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = ((String) zzni.zzf(obj, j)).hashCode();
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
                case 60:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = zzni.zzf(obj, j).hashCode();
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
                case 61:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = zzni.zzf(obj, j).hashCode();
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
                case 62:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzc = zzp(obj, j);
                        i10 = i7 + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzc = zzp(obj, j);
                        i10 = i7 + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzc = zzp(obj, j);
                        i10 = i7 + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        iZzc = zzp(obj, j);
                        i10 = i7 + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzla.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i7 + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = zzni.zzf(obj, j).hashCode();
                        i10 = iFloatToIntBits + i8;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzm.zzd(obj).hashCode() + (i10 * 53);
        return this.zzh ? (iHashCode2 * 53) + this.zzn.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:380:0x0918 A[PHI: r2 r3 r7 r8 r10 r11 r12 r14 r31
      0x0918: PHI (r2v122 int) = (r2v83 int), (r2v84 int), (r2v85 int), (r2v90 int), (r2v97 int), (r8v53 int), (r2v128 int) binds: [B:374:0x08ef, B:359:0x0897, B:343:0x0845, B:328:0x07e5, B:267:0x06d6, B:162:0x04fd, B:145:0x0495] A[DONT_GENERATE, DONT_INLINE]
      0x0918: PHI (r3v50 int) = (r3v25 int), (r3v26 int), (r3v27 int), (r3v32 int), (r3v39 int), (r10v16 int), (r3v54 int) binds: [B:374:0x08ef, B:359:0x0897, B:343:0x0845, B:328:0x07e5, B:267:0x06d6, B:162:0x04fd, B:145:0x0495] A[DONT_GENERATE, DONT_INLINE]
      0x0918: PHI (r7v27 int) = (r7v6 int), (r7v7 int), (r7v8 int), (r7v10 int), (r7v15 int), (r7v24 int), (r7v33 int) binds: [B:374:0x08ef, B:359:0x0897, B:343:0x0845, B:328:0x07e5, B:267:0x06d6, B:162:0x04fd, B:145:0x0495] A[DONT_GENERATE, DONT_INLINE]
      0x0918: PHI (r8v106 int) = (r8v54 int), (r8v55 int), (r8v56 int), (r8v59 int), (r8v81 int), (r8v104 int), (r8v111 int) binds: [B:374:0x08ef, B:359:0x0897, B:343:0x0845, B:328:0x07e5, B:267:0x06d6, B:162:0x04fd, B:145:0x0495] A[DONT_GENERATE, DONT_INLINE]
      0x0918: PHI (r10v45 com.google.android.recaptcha.internal.zzik) = 
      (r10v17 com.google.android.recaptcha.internal.zzik)
      (r10v18 com.google.android.recaptcha.internal.zzik)
      (r10v19 com.google.android.recaptcha.internal.zzik)
      (r10v21 com.google.android.recaptcha.internal.zzik)
      (r10v34 com.google.android.recaptcha.internal.zzik)
      (r12v41 com.google.android.recaptcha.internal.zzik)
      (r10v50 com.google.android.recaptcha.internal.zzik)
     binds: [B:374:0x08ef, B:359:0x0897, B:343:0x0845, B:328:0x07e5, B:267:0x06d6, B:162:0x04fd, B:145:0x0495] A[DONT_GENERATE, DONT_INLINE]
      0x0918: PHI (r11v65 int) = (r11v48 int), (r11v49 int), (r11v50 int), (r11v52 int), (r11v54 int), (r11v64 int), (r11v70 int) binds: [B:374:0x08ef, B:359:0x0897, B:343:0x0845, B:328:0x07e5, B:267:0x06d6, B:162:0x04fd, B:145:0x0495] A[DONT_GENERATE, DONT_INLINE]
      0x0918: PHI (r12v60 int) = (r12v42 int), (r12v43 int), (r12v44 int), (r12v46 int), (r12v49 int), (r12v59 int), (r12v64 int) binds: [B:374:0x08ef, B:359:0x0897, B:343:0x0845, B:328:0x07e5, B:267:0x06d6, B:162:0x04fd, B:145:0x0495] A[DONT_GENERATE, DONT_INLINE]
      0x0918: PHI (r14v54 int) = (r14v34 int), (r14v35 int), (r14v36 int), (r14v38 int), (r14v40 int), (r14v51 int), (r14v61 int) binds: [B:374:0x08ef, B:359:0x0897, B:343:0x0845, B:328:0x07e5, B:267:0x06d6, B:162:0x04fd, B:145:0x0495] A[DONT_GENERATE, DONT_INLINE]
      0x0918: PHI (r31v28 sun.misc.Unsafe) = 
      (r31v7 sun.misc.Unsafe)
      (r31v8 sun.misc.Unsafe)
      (r31v9 sun.misc.Unsafe)
      (r31v11 sun.misc.Unsafe)
      (r31v16 sun.misc.Unsafe)
      (r31v25 sun.misc.Unsafe)
      (r31v32 sun.misc.Unsafe)
     binds: [B:374:0x08ef, B:359:0x0897, B:343:0x0845, B:328:0x07e5, B:267:0x06d6, B:162:0x04fd, B:145:0x0495] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:474:0x0bee A[PHI: r0 r2 r3 r10 r14 r19 r37
      0x0bee: PHI (r0v209 int) = (r0v176 int), (r0v177 int), (r0v180 int), (r0v187 int), (r0v210 int) binds: [B:472:0x0bd6, B:469:0x0bb2, B:461:0x0b62, B:444:0x0af5, B:398:0x09b3] A[DONT_GENERATE, DONT_INLINE]
      0x0bee: PHI (r2v157 int) = (r2v133 int), (r2v134 int), (r2v137 int), (r2v144 int), (r2v158 int) binds: [B:472:0x0bd6, B:469:0x0bb2, B:461:0x0b62, B:444:0x0af5, B:398:0x09b3] A[DONT_GENERATE, DONT_INLINE]
      0x0bee: PHI (r3v79 com.google.android.recaptcha.internal.zzik) = 
      (r3v61 com.google.android.recaptcha.internal.zzik)
      (r3v62 com.google.android.recaptcha.internal.zzik)
      (r3v65 com.google.android.recaptcha.internal.zzik)
      (r3v72 com.google.android.recaptcha.internal.zzik)
      (r3v80 com.google.android.recaptcha.internal.zzik)
     binds: [B:472:0x0bd6, B:469:0x0bb2, B:461:0x0b62, B:444:0x0af5, B:398:0x09b3] A[DONT_GENERATE, DONT_INLINE]
      0x0bee: PHI (r10v80 int) = (r10v52 int), (r10v53 int), (r10v56 int), (r10v61 int), (r10v81 int) binds: [B:472:0x0bd6, B:469:0x0bb2, B:461:0x0b62, B:444:0x0af5, B:398:0x09b3] A[DONT_GENERATE, DONT_INLINE]
      0x0bee: PHI (r14v94 int) = (r14v66 int), (r14v67 int), (r14v69 int), (r14v73 int), (r14v95 int) binds: [B:472:0x0bd6, B:469:0x0bb2, B:461:0x0b62, B:444:0x0af5, B:398:0x09b3] A[DONT_GENERATE, DONT_INLINE]
      0x0bee: PHI (r19v57 int) = (r19v31 int), (r19v32 int), (r19v35 int), (r19v42 int), (r19v58 int) binds: [B:472:0x0bd6, B:469:0x0bb2, B:461:0x0b62, B:444:0x0af5, B:398:0x09b3] A[DONT_GENERATE, DONT_INLINE]
      0x0bee: PHI (r37v29 int) = (r37v7 int), (r37v8 int), (r37v11 int), (r37v18 int), (r37v30 int) binds: [B:472:0x0bd6, B:469:0x0bb2, B:461:0x0b62, B:444:0x0af5, B:398:0x09b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:577:0x091d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x0bf1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0935 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0c06 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int zzc(Object obj, byte[] bArr, int i7, int i8, int i9, zzik zzikVar) throws zzlc {
        int i10;
        int i11;
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zzik zzikVar2;
        int i17;
        int iZzl;
        int iZzh;
        zzkd zzkdVar;
        int i18;
        Object obj2;
        int i19;
        zzik zzikVar3;
        int i20;
        int i21;
        int i22;
        int iZzg;
        int i23;
        int i24;
        int iZzi;
        Unsafe unsafe2;
        int i25;
        zzik zzikVar4;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int iZzi2;
        int i34;
        int i35;
        int i36;
        int i37;
        zzik zzikVar5;
        int i38;
        int iZzf;
        int iZzi3;
        Object[] objArr;
        int i39;
        char c3;
        int iZzk;
        int i40;
        int i41;
        int iZzl2;
        int i42;
        int i43;
        int i44;
        int iZza;
        zzma<T> zzmaVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        i8 = i8;
        i9 = i9;
        zzik zzikVar6 = zzikVar;
        int i45 = 3;
        int i46 = 1;
        zzD(obj);
        Unsafe unsafe3 = zzb;
        int i47 = -1;
        int iZzm = i7;
        int i48 = -1;
        int iZzs = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 1048575;
        while (true) {
            if (iZzm < i8) {
                int iZzj = iZzm + 1;
                int i52 = bArr2[iZzm];
                if (i52 < 0) {
                    iZzj = zzil.zzj(i52, bArr2, iZzj, zzikVar6);
                    i52 = zzikVar6.zza;
                }
                int i53 = i52 >>> 3;
                iZzs = i53 > i48 ? (i53 < zzmaVar.zze || i53 > zzmaVar.zzf) ? i47 : zzmaVar.zzs(i53, iZzs / i45) : zzmaVar.zzq(i53);
                Object objValueOf = null;
                if (iZzs == i47) {
                    i10 = i46;
                    i14 = i45;
                    i11 = i9;
                    i15 = i47;
                    unsafe = unsafe3;
                    i13 = i52;
                    i16 = 0;
                    int i54 = iZzj;
                    zzikVar2 = zzikVar6;
                    i17 = i53;
                    iZzl = i54;
                } else {
                    int i55 = i52 & 7;
                    int[] iArr = zzmaVar.zzc;
                    int i56 = iArr[iZzs + 1];
                    int iZzt = zzt(i56);
                    long j = i56 & 1048575;
                    int i57 = i52;
                    if (iZzt <= 17) {
                        int i58 = iArr[iZzs + 2];
                        int i59 = 1 << (i58 >>> 20);
                        int i60 = 1048575;
                        int i61 = i58 & 1048575;
                        if (i61 != i51) {
                            if (i51 != 1048575) {
                                unsafe3.putInt(obj3, i51, i49);
                                i60 = 1048575;
                            }
                            i19 = i61 == i60 ? 0 : unsafe3.getInt(obj3, i61);
                            i51 = i61;
                        } else {
                            i19 = i49;
                            i51 = i51;
                        }
                        switch (iZzt) {
                            case 0:
                                zzikVar3 = zzikVar;
                                i20 = i53;
                                i21 = 1;
                                i15 = -1;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 1) {
                                    iZzg = iZzj + 8;
                                    i19 |= i59;
                                    zzni.zzo(obj3, j, Double.longBitsToDouble(zzil.zzp(bArr2, iZzj)));
                                    zzikVar6 = zzikVar3;
                                    i50 = i22;
                                    i48 = i20;
                                    i47 = i15;
                                    iZzm = iZzg;
                                    i46 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                    i45 = 3;
                                } else {
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 1:
                                zzikVar3 = zzikVar;
                                i20 = i53;
                                i21 = 1;
                                i15 = -1;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 5) {
                                    iZzg = iZzj + 4;
                                    i19 |= i59;
                                    zzni.zzp(obj3, j, Float.intBitsToFloat(zzil.zzb(bArr2, iZzj)));
                                    zzikVar6 = zzikVar3;
                                    i50 = i22;
                                    i48 = i20;
                                    i47 = i15;
                                    iZzm = iZzg;
                                    i46 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                    i45 = 3;
                                } else {
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 2:
                            case 3:
                                zzikVar3 = zzikVar;
                                i20 = i53;
                                i21 = 1;
                                i15 = -1;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 0) {
                                    i23 = i19 | i59;
                                    int iZzl3 = zzil.zzl(bArr2, iZzj, zzikVar3);
                                    unsafe3.putLong(obj, j, zzikVar3.zzb);
                                    i8 = i8;
                                    zzikVar6 = zzikVar3;
                                    i46 = 1;
                                    i50 = i22 == true ? 1 : 0;
                                    iZzm = iZzl3;
                                    i47 = -1;
                                    i45 = 3;
                                    i49 = i23;
                                    i48 = i20;
                                } else {
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 4:
                            case 11:
                                zzikVar3 = zzikVar;
                                i20 = i53;
                                i21 = 1;
                                i15 = -1;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 0) {
                                    i24 = i19 | i59;
                                    iZzi = zzil.zzi(bArr2, iZzj, zzikVar3);
                                    unsafe3.putInt(obj3, j, zzikVar3.zza);
                                    zzikVar6 = zzikVar3;
                                    i50 = i22;
                                    i48 = i20;
                                    i47 = i15;
                                    iZzm = iZzi;
                                    i45 = 3;
                                    i49 = i24;
                                    i46 = i21;
                                    i51 = i51;
                                } else {
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 5:
                            case 14:
                                zzikVar3 = zzikVar;
                                i20 = i53;
                                i21 = 1;
                                i15 = -1;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 1) {
                                    int i62 = i59 | i19;
                                    unsafe3.putLong(obj, j, zzil.zzp(bArr2, iZzj));
                                    i8 = i8;
                                    i9 = i9;
                                    zzikVar6 = zzikVar3;
                                    iZzm = iZzj + 8;
                                    i46 = 1;
                                    i50 = i22 == true ? 1 : 0;
                                    i51 = i51;
                                    i48 = i20;
                                    i45 = 3;
                                    i49 = i62;
                                    i47 = -1;
                                } else {
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 6:
                            case 13:
                                zzikVar3 = zzikVar;
                                i20 = i53;
                                i21 = 1;
                                i15 = -1;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 5) {
                                    iZzg = iZzj + 4;
                                    i19 |= i59;
                                    unsafe3.putInt(obj3, j, zzil.zzb(bArr2, iZzj));
                                    zzikVar6 = zzikVar3;
                                    i50 = i22;
                                    i48 = i20;
                                    i47 = i15;
                                    iZzm = iZzg;
                                    i46 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                    i45 = 3;
                                } else {
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 7:
                                zzikVar3 = zzikVar;
                                i20 = i53;
                                i21 = 1;
                                i15 = -1;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 0) {
                                    i24 = i19 | i59;
                                    iZzi = zzil.zzl(bArr2, iZzj, zzikVar3);
                                    zzni.zzm(obj3, j, zzikVar3.zzb != 0);
                                    zzikVar6 = zzikVar3;
                                    i50 = i22;
                                    i48 = i20;
                                    i47 = i15;
                                    iZzm = iZzi;
                                    i45 = 3;
                                    i49 = i24;
                                    i46 = i21;
                                    i51 = i51;
                                } else {
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 8:
                                zzikVar3 = zzikVar;
                                i21 = 1;
                                i15 = -1;
                                i20 = i53;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 2) {
                                    if (zzM(i56)) {
                                        iZzg = zzil.zzi(bArr2, iZzj, zzikVar3);
                                        int i63 = zzikVar3.zza;
                                        if (i63 < 0) {
                                            throw zzlc.zzf();
                                        }
                                        i19 |= i59;
                                        if (i63 == 0) {
                                            zzikVar3.zzc = "";
                                        } else {
                                            zzikVar3.zzc = zznl.zzd(bArr2, iZzg, i63);
                                            iZzg += i63;
                                        }
                                    } else {
                                        i19 |= i59;
                                        iZzg = zzil.zzg(bArr2, iZzj, zzikVar3);
                                    }
                                    unsafe3.putObject(obj3, j, zzikVar3.zzc);
                                    zzikVar6 = zzikVar3;
                                    i50 = i22;
                                    i48 = i20;
                                    i47 = i15;
                                    iZzm = iZzg;
                                    i46 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                    i45 = 3;
                                } else {
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 9:
                                zzikVar3 = zzikVar;
                                unsafe2 = unsafe3;
                                i21 = 1;
                                i15 = -1;
                                i20 = i53;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 2) {
                                    i23 = i19 | i59;
                                    Object objZzA = zzmaVar.zzA(obj3, iZzs);
                                    unsafe3 = unsafe2;
                                    i8 = i8;
                                    int iZzn = zzil.zzn(objZzA, zzmaVar.zzx(iZzs), bArr, iZzj, i8, zzikVar);
                                    zzmaVar.zzJ(obj3, iZzs, objZzA);
                                    zzikVar6 = zzikVar3;
                                    i50 = i22 == true ? 1 : 0;
                                    i47 = -1;
                                    i45 = 3;
                                    iZzm = iZzn;
                                    i46 = 1;
                                    i49 = i23;
                                    i48 = i20;
                                } else {
                                    unsafe3 = unsafe2;
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 10:
                                zzikVar3 = zzikVar;
                                unsafe2 = unsafe3;
                                i21 = 1;
                                i15 = -1;
                                i20 = i53;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 2) {
                                    int i64 = i19 | i59;
                                    bArr2 = bArr;
                                    int iZza2 = zzil.zza(bArr2, iZzj, zzikVar3);
                                    unsafe2.putObject(obj3, j, zzikVar3.zzc);
                                    i8 = i8;
                                    i9 = i9;
                                    unsafe3 = unsafe2;
                                    zzikVar6 = zzikVar3;
                                    i46 = 1;
                                    i50 = i22 == true ? 1 : 0;
                                    i51 = i51;
                                    i48 = i20;
                                    i47 = -1;
                                    i49 = i64;
                                    iZzm = iZza2;
                                    i45 = 3;
                                } else {
                                    bArr2 = bArr;
                                    unsafe3 = unsafe2;
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 12:
                                zzikVar3 = zzikVar;
                                unsafe2 = unsafe3;
                                i21 = 1;
                                i15 = -1;
                                i20 = i53;
                                i22 = i57 == true ? 1 : 0;
                                if (i55 == 0) {
                                    iZzg = zzil.zzi(bArr2, iZzj, zzikVar3);
                                    int i65 = zzikVar3.zza;
                                    zzkw zzkwVarZzw = zzmaVar.zzw(iZzs);
                                    if ((i56 & Integer.MIN_VALUE) == 0 || zzkwVarZzw == null || zzkwVarZzw.zza(i65)) {
                                        i19 |= i59;
                                        unsafe2.putInt(obj3, j, i65);
                                    } else {
                                        zzd(obj).zzj(i22 == true ? 1 : 0, Long.valueOf(i65));
                                    }
                                    bArr2 = bArr;
                                    unsafe3 = unsafe2;
                                    zzikVar6 = zzikVar3;
                                    i50 = i22;
                                    i48 = i20;
                                    i47 = i15;
                                    iZzm = iZzg;
                                    i46 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                    i45 = 3;
                                } else {
                                    bArr2 = bArr;
                                    unsafe3 = unsafe2;
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 15:
                                zzikVar3 = zzikVar;
                                i21 = 1;
                                i15 = -1;
                                i22 = i57 == true ? 1 : 0;
                                Unsafe unsafe4 = unsafe3;
                                i20 = i53;
                                if (i55 == 0) {
                                    i24 = i19 | i59;
                                    iZzi = zzil.zzi(bArr2, iZzj, zzikVar3);
                                    unsafe4.putInt(obj3, j, zzjb.zzF(zzikVar3.zza));
                                    zzikVar6 = zzikVar3;
                                    unsafe3 = unsafe4;
                                    i50 = i22;
                                    i48 = i20;
                                    i47 = i15;
                                    iZzm = iZzi;
                                    i45 = 3;
                                    i49 = i24;
                                    i46 = i21;
                                    i51 = i51;
                                } else {
                                    unsafe3 = unsafe4;
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            case 16:
                                i15 = -1;
                                i22 = i57 == true ? 1 : 0;
                                Unsafe unsafe5 = unsafe3;
                                if (i55 == 0) {
                                    int i66 = i19 | i59;
                                    int iZzl4 = zzil.zzl(bArr2, iZzj, zzikVar);
                                    unsafe5.putLong(obj, j, zzjb.zzG(zzikVar.zzb));
                                    unsafe3 = unsafe5;
                                    i8 = i8;
                                    i9 = i9;
                                    zzikVar6 = zzikVar;
                                    i50 = i22 == true ? 1 : 0;
                                    i46 = 1;
                                    i48 = i53;
                                    i47 = -1;
                                    i45 = 3;
                                    i49 = i66;
                                    iZzm = iZzl4;
                                    i51 = i51;
                                } else {
                                    i20 = i53;
                                    unsafe3 = unsafe5;
                                    zzikVar3 = zzikVar;
                                    i21 = 1;
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                            default:
                                if (i55 == 3) {
                                    int i67 = i19 | i59;
                                    Object objZzA2 = zzmaVar.zzA(obj3, iZzs);
                                    iZzm = zzil.zzm(objZzA2, zzmaVar.zzx(iZzs), bArr, iZzj, i8, (i53 << 3) | 4, zzikVar);
                                    zzmaVar.zzJ(obj3, iZzs, objZzA2);
                                    unsafe3 = unsafe3;
                                    i45 = 3;
                                    i48 = i53;
                                    i50 = i57 == true ? 1 : 0;
                                    iZzs = iZzs;
                                    i51 = i51;
                                    i47 = -1;
                                    i8 = i8;
                                    i9 = i9;
                                    zzikVar6 = zzikVar;
                                    i49 = i67;
                                    i46 = 1;
                                } else {
                                    i15 = -1;
                                    zzikVar3 = zzikVar;
                                    i20 = i53;
                                    i21 = 1;
                                    i22 = i57 == true ? 1 : 0;
                                    i11 = i9;
                                    i13 = i22;
                                    unsafe = unsafe3;
                                    i17 = i20;
                                    i14 = 3;
                                    iZzl = iZzj;
                                    zzikVar2 = zzikVar3;
                                    i16 = iZzs;
                                    i10 = i21;
                                    i51 = i51;
                                    i49 = i19;
                                }
                                break;
                        }
                    } else {
                        zzik zzikVar7 = zzikVar6;
                        i15 = -1;
                        if (iZzt != 27) {
                            i25 = i51;
                            Unsafe unsafe6 = unsafe3;
                            zzik zzikVar8 = zzikVar7;
                            int i68 = iZzs;
                            int i69 = i53;
                            if (iZzt <= 49) {
                                long j3 = i56;
                                Unsafe unsafe7 = zzb;
                                zzkz zzkzVarZzd = (zzkz) unsafe7.getObject(obj3, j);
                                if (!zzkzVarZzd.zzc()) {
                                    int size = zzkzVarZzd.size();
                                    zzkzVarZzd = zzkzVarZzd.zzd(size != 0 ? size + size : 10);
                                    unsafe7.putObject(obj3, j, zzkzVarZzd);
                                }
                                zzkz zzkzVar = zzkzVarZzd;
                                switch (iZzt) {
                                    case 18:
                                    case 35:
                                        unsafe = unsafe6;
                                        i29 = iZzj;
                                        i68 = i68;
                                        i69 = i69;
                                        i30 = i57 == true ? 1 : 0;
                                        zzikVar8 = zzikVar8;
                                        i31 = 3;
                                        i32 = 1;
                                        i33 = i8;
                                        if (i55 == 2) {
                                            zzjx zzjxVar = (zzjx) zzkzVar;
                                            iZzi2 = zzil.zzi(bArr2, i29, zzikVar8);
                                            int i70 = zzikVar8.zza + iZzi2;
                                            while (iZzi2 < i70) {
                                                zzjxVar.zzf(Double.longBitsToDouble(zzil.zzp(bArr2, iZzi2)));
                                                iZzi2 += 8;
                                            }
                                            if (iZzi2 != i70) {
                                                throw zzlc.zzi();
                                            }
                                        } else if (i55 == 1) {
                                            iZzi2 = i29 + 8;
                                            zzjx zzjxVar2 = (zzjx) zzkzVar;
                                            zzjxVar2.zzf(Double.longBitsToDouble(zzil.zzp(bArr2, i29)));
                                            while (iZzi2 < i33) {
                                                int iZzi4 = zzil.zzi(bArr2, iZzi2, zzikVar8);
                                                if (i30 == zzikVar8.zza) {
                                                    zzjxVar2.zzf(Double.longBitsToDouble(zzil.zzp(bArr2, iZzi4)));
                                                    iZzi2 = iZzi4 + 8;
                                                }
                                            }
                                        } else {
                                            iZzi2 = i29;
                                        }
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar9 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar9;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        unsafe = unsafe6;
                                        i29 = iZzj;
                                        i68 = i68;
                                        i69 = i69;
                                        i30 = i57 == true ? 1 : 0;
                                        zzikVar8 = zzikVar8;
                                        i31 = 3;
                                        i32 = 1;
                                        i33 = i8;
                                        if (i55 == 2) {
                                            zzkk zzkkVar = (zzkk) zzkzVar;
                                            iZzi2 = zzil.zzi(bArr2, i29, zzikVar8);
                                            int i71 = zzikVar8.zza + iZzi2;
                                            while (iZzi2 < i71) {
                                                zzkkVar.zzf(Float.intBitsToFloat(zzil.zzb(bArr2, iZzi2)));
                                                iZzi2 += 4;
                                            }
                                            if (iZzi2 != i71) {
                                                throw zzlc.zzi();
                                            }
                                        } else if (i55 == 5) {
                                            iZzi2 = i29 + 4;
                                            zzkk zzkkVar2 = (zzkk) zzkzVar;
                                            zzkkVar2.zzf(Float.intBitsToFloat(zzil.zzb(bArr2, i29)));
                                            while (iZzi2 < i33) {
                                                int iZzi5 = zzil.zzi(bArr2, iZzi2, zzikVar8);
                                                if (i30 == zzikVar8.zza) {
                                                    zzkkVar2.zzf(Float.intBitsToFloat(zzil.zzb(bArr2, iZzi5)));
                                                    iZzi2 = iZzi5 + 4;
                                                }
                                            }
                                        } else {
                                            iZzi2 = i29;
                                        }
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar10 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar10;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 20:
                                    case zzbbd.zzt.zzm /* 21 */:
                                    case 37:
                                    case 38:
                                        unsafe = unsafe6;
                                        i29 = iZzj;
                                        i68 = i68;
                                        i69 = i69;
                                        i30 = i57 == true ? 1 : 0;
                                        zzikVar8 = zzikVar8;
                                        i31 = 3;
                                        i32 = 1;
                                        i33 = i8;
                                        if (i55 == 2) {
                                            zzlm zzlmVar = (zzlm) zzkzVar;
                                            iZzi2 = zzil.zzi(bArr2, i29, zzikVar8);
                                            int i72 = zzikVar8.zza + iZzi2;
                                            while (iZzi2 < i72) {
                                                iZzi2 = zzil.zzl(bArr2, iZzi2, zzikVar8);
                                                zzlmVar.zzg(zzikVar8.zzb);
                                            }
                                            if (iZzi2 != i72) {
                                                throw zzlc.zzi();
                                            }
                                        } else if (i55 == 0) {
                                            zzlm zzlmVar2 = (zzlm) zzkzVar;
                                            iZzi2 = zzil.zzl(bArr2, i29, zzikVar8);
                                            zzlmVar2.zzg(zzikVar8.zzb);
                                            while (iZzi2 < i33) {
                                                int iZzi6 = zzil.zzi(bArr2, iZzi2, zzikVar8);
                                                if (i30 == zzikVar8.zza) {
                                                    iZzi2 = zzil.zzl(bArr2, iZzi6, zzikVar8);
                                                    zzlmVar2.zzg(zzikVar8.zzb);
                                                }
                                            }
                                        } else {
                                            iZzi2 = i29;
                                        }
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar11 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar11;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe = unsafe6;
                                        i34 = i8;
                                        i29 = iZzj;
                                        i35 = i68;
                                        i36 = i69;
                                        i37 = i57 == true ? 1 : 0;
                                        zzikVar5 = zzikVar8;
                                        i38 = 3;
                                        i32 = 1;
                                        if (i55 == 2) {
                                            iZzf = zzil.zzf(bArr2, i29, zzkzVar, zzikVar5);
                                            i31 = i38;
                                            zzikVar8 = zzikVar5;
                                            i30 = i37;
                                            i69 = i36;
                                            i68 = i35;
                                            iZzi2 = iZzf;
                                            i33 = i34;
                                        } else if (i55 == 0) {
                                            i31 = 3;
                                            i33 = i34;
                                            zzikVar8 = zzikVar5;
                                            i30 = i37 == true ? 1 : 0;
                                            iZzi2 = zzil.zzk(i37 == true ? 1 : 0, bArr, i29, i8, zzkzVar, zzikVar);
                                            i69 = i36;
                                            i68 = i35;
                                        } else {
                                            i31 = i38;
                                            i33 = i34;
                                            zzikVar8 = zzikVar5;
                                            i30 = i37;
                                            i69 = i36;
                                            i68 = i35;
                                            iZzi2 = i29;
                                        }
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar12 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar12;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        unsafe = unsafe6;
                                        i34 = i8;
                                        i29 = iZzj;
                                        i35 = i68;
                                        i36 = i69;
                                        i37 = i57 == true ? 1 : 0;
                                        zzikVar5 = zzikVar8;
                                        i38 = 3;
                                        if (i55 != 2) {
                                            i32 = 1;
                                            if (i55 == 1) {
                                                iZzf = i29 + 8;
                                                zzlm zzlmVar3 = (zzlm) zzkzVar;
                                                zzlmVar3.zzg(zzil.zzp(bArr2, i29));
                                                while (iZzf < i34) {
                                                    int iZzi7 = zzil.zzi(bArr2, iZzf, zzikVar5);
                                                    if (i37 != zzikVar5.zza) {
                                                        i31 = i38;
                                                        zzikVar8 = zzikVar5;
                                                        i30 = i37;
                                                        i69 = i36;
                                                        i68 = i35;
                                                        iZzi2 = iZzf;
                                                        i33 = i34;
                                                        zzmaVar = this;
                                                        if (iZzi2 != i29) {
                                                            obj3 = obj;
                                                            i9 = i9;
                                                            i48 = i69;
                                                            i8 = i33;
                                                            i45 = i31;
                                                            i50 = i30;
                                                            i47 = -1;
                                                            i51 = i25;
                                                            unsafe3 = unsafe;
                                                            iZzm = iZzi2;
                                                            i46 = i32;
                                                            zzik zzikVar13 = zzikVar8;
                                                            iZzs = i68;
                                                            zzikVar6 = zzikVar13;
                                                        } else {
                                                            obj3 = obj;
                                                            i11 = i9;
                                                            i16 = i68;
                                                            i17 = i69;
                                                            zzikVar2 = zzikVar8;
                                                            i14 = i31;
                                                            i10 = i32;
                                                            i13 = i30;
                                                            i51 = i25;
                                                            iZzl = iZzi2;
                                                        }
                                                    } else {
                                                        zzlmVar3.zzg(zzil.zzp(bArr2, iZzi7));
                                                        iZzf = iZzi7 + 8;
                                                    }
                                                    break;
                                                }
                                                i31 = i38;
                                                zzikVar8 = zzikVar5;
                                                i30 = i37;
                                                i69 = i36;
                                                i68 = i35;
                                                iZzi2 = iZzf;
                                                i33 = i34;
                                                zzmaVar = this;
                                                if (iZzi2 != i29) {
                                                    obj3 = obj;
                                                    i9 = i9;
                                                    i48 = i69;
                                                    i8 = i33;
                                                    i45 = i31;
                                                    i50 = i30;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzm = iZzi2;
                                                    i46 = i32;
                                                    zzik zzikVar14 = zzikVar8;
                                                    iZzs = i68;
                                                    zzikVar6 = zzikVar14;
                                                } else {
                                                    obj3 = obj;
                                                    i11 = i9;
                                                    i16 = i68;
                                                    i17 = i69;
                                                    zzikVar2 = zzikVar8;
                                                    i14 = i31;
                                                    i10 = i32;
                                                    i13 = i30;
                                                    i51 = i25;
                                                    iZzl = iZzi2;
                                                }
                                            }
                                            i31 = i38;
                                            i33 = i34;
                                            zzikVar8 = zzikVar5;
                                            i30 = i37;
                                            i69 = i36;
                                            i68 = i35;
                                            iZzi2 = i29;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar15 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar15;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                            break;
                                        } else {
                                            zzlm zzlmVar4 = (zzlm) zzkzVar;
                                            iZzi3 = zzil.zzi(bArr2, i29, zzikVar5);
                                            int i73 = zzikVar5.zza + iZzi3;
                                            while (iZzi3 < i73) {
                                                zzlmVar4.zzg(zzil.zzp(bArr2, iZzi3));
                                                iZzi3 += 8;
                                            }
                                            if (iZzi3 != i73) {
                                                throw zzlc.zzi();
                                            }
                                            i31 = i38;
                                            zzikVar8 = zzikVar5;
                                            i30 = i37;
                                            i69 = i36;
                                            i68 = i35;
                                            iZzi2 = iZzi3;
                                            i32 = 1;
                                            i33 = i34;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar16 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar16;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe = unsafe6;
                                        i34 = i8;
                                        i29 = iZzj;
                                        i35 = i68;
                                        i36 = i69;
                                        i37 = i57 == true ? 1 : 0;
                                        zzikVar5 = zzikVar8;
                                        i38 = 3;
                                        if (i55 != 2) {
                                            if (i55 == 5) {
                                                iZzi3 = i29 + 4;
                                                zzkt zzktVar = (zzkt) zzkzVar;
                                                zzktVar.zzh(zzil.zzb(bArr2, i29));
                                                while (iZzi3 < i34) {
                                                    int iZzi8 = zzil.zzi(bArr2, iZzi3, zzikVar5);
                                                    if (i37 == zzikVar5.zza) {
                                                        zzktVar.zzh(zzil.zzb(bArr2, iZzi8));
                                                        iZzi3 = iZzi8 + 4;
                                                    }
                                                }
                                            }
                                            i31 = i38;
                                            i33 = i34;
                                            zzikVar8 = zzikVar5;
                                            i30 = i37;
                                            i69 = i36;
                                            i68 = i35;
                                            i32 = 1;
                                            iZzi2 = i29;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar17 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar17;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        } else {
                                            zzkt zzktVar2 = (zzkt) zzkzVar;
                                            iZzi3 = zzil.zzi(bArr2, i29, zzikVar5);
                                            int i74 = zzikVar5.zza + iZzi3;
                                            while (iZzi3 < i74) {
                                                zzktVar2.zzh(zzil.zzb(bArr2, iZzi3));
                                                iZzi3 += 4;
                                            }
                                            if (iZzi3 != i74) {
                                                throw zzlc.zzi();
                                            }
                                        }
                                        i31 = i38;
                                        zzikVar8 = zzikVar5;
                                        i30 = i37;
                                        i69 = i36;
                                        i68 = i35;
                                        iZzi2 = iZzi3;
                                        i32 = 1;
                                        i33 = i34;
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar18 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar18;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe = unsafe6;
                                        i34 = i8;
                                        i29 = iZzj;
                                        i35 = i68;
                                        i36 = i69;
                                        i37 = i57 == true ? 1 : 0;
                                        zzikVar5 = zzikVar8;
                                        i38 = 3;
                                        if (i55 != 2) {
                                            if (i55 == 0) {
                                                zzim zzimVar = (zzim) zzkzVar;
                                                iZzi3 = zzil.zzl(bArr2, i29, zzikVar5);
                                                zzimVar.zze(zzikVar5.zzb != 0);
                                                while (iZzi3 < i34) {
                                                    int iZzi9 = zzil.zzi(bArr2, iZzi3, zzikVar5);
                                                    if (i37 == zzikVar5.zza) {
                                                        iZzi3 = zzil.zzl(bArr2, iZzi9, zzikVar5);
                                                        zzimVar.zze(zzikVar5.zzb != 0);
                                                    }
                                                }
                                            }
                                            i31 = i38;
                                            i33 = i34;
                                            zzikVar8 = zzikVar5;
                                            i30 = i37;
                                            i69 = i36;
                                            i68 = i35;
                                            i32 = 1;
                                            iZzi2 = i29;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar19 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar19;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        } else {
                                            zzim zzimVar2 = (zzim) zzkzVar;
                                            iZzi3 = zzil.zzi(bArr2, i29, zzikVar5);
                                            int i75 = zzikVar5.zza + iZzi3;
                                            while (iZzi3 < i75) {
                                                iZzi3 = zzil.zzl(bArr2, iZzi3, zzikVar5);
                                                zzimVar2.zze(zzikVar5.zzb != 0);
                                            }
                                            if (iZzi3 != i75) {
                                                throw zzlc.zzi();
                                            }
                                        }
                                        i31 = i38;
                                        zzikVar8 = zzikVar5;
                                        i30 = i37;
                                        i69 = i36;
                                        i68 = i35;
                                        iZzi2 = iZzi3;
                                        i32 = 1;
                                        i33 = i34;
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar110 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar110;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 26:
                                        unsafe = unsafe6;
                                        i34 = i8;
                                        i29 = iZzj;
                                        i35 = i68;
                                        i36 = i69;
                                        i37 = i57 == true ? 1 : 0;
                                        zzikVar5 = zzikVar8;
                                        i38 = 3;
                                        if (i55 == 2) {
                                            if ((j3 & 536870912) == 0) {
                                                iZzi3 = zzil.zzi(bArr2, i29, zzikVar5);
                                                int i76 = zzikVar5.zza;
                                                if (i76 < 0) {
                                                    throw zzlc.zzf();
                                                }
                                                if (i76 == 0) {
                                                    objArr = "";
                                                    zzkzVar.add(objArr);
                                                } else {
                                                    objArr = "";
                                                    zzkzVar.add(new String(bArr2, iZzi3, i76, zzla.zza));
                                                    iZzi3 += i76;
                                                }
                                                while (iZzi3 < i34) {
                                                    int iZzi10 = zzil.zzi(bArr2, iZzi3, zzikVar5);
                                                    if (i37 == zzikVar5.zza) {
                                                        iZzi3 = zzil.zzi(bArr2, iZzi10, zzikVar5);
                                                        int i77 = zzikVar5.zza;
                                                        if (i77 < 0) {
                                                            throw zzlc.zzf();
                                                        }
                                                        if (i77 == 0) {
                                                            zzkzVar.add(objArr);
                                                        } else {
                                                            zzkzVar.add(new String(bArr2, iZzi3, i77, zzla.zza));
                                                            iZzi3 += i77;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzi3 = zzil.zzi(bArr2, i29, zzikVar5);
                                                int i78 = zzikVar5.zza;
                                                if (i78 < 0) {
                                                    throw zzlc.zzf();
                                                }
                                                if (i78 == 0) {
                                                    zzkzVar.add("");
                                                } else {
                                                    int i79 = iZzi3 + i78;
                                                    if (!zznl.zze(bArr2, iZzi3, i79)) {
                                                        throw zzlc.zzd();
                                                    }
                                                    zzkzVar.add(new String(bArr2, iZzi3, i78, zzla.zza));
                                                    iZzi3 = i79;
                                                }
                                                while (iZzi3 < i34) {
                                                    int iZzi11 = zzil.zzi(bArr2, iZzi3, zzikVar5);
                                                    if (i37 == zzikVar5.zza) {
                                                        iZzi3 = zzil.zzi(bArr2, iZzi11, zzikVar5);
                                                        int i80 = zzikVar5.zza;
                                                        if (i80 < 0) {
                                                            throw zzlc.zzf();
                                                        }
                                                        if (i80 == 0) {
                                                            zzkzVar.add("");
                                                        } else {
                                                            int i81 = iZzi3 + i80;
                                                            if (!zznl.zze(bArr2, iZzi3, i81)) {
                                                                throw zzlc.zzd();
                                                            }
                                                            zzkzVar.add(new String(bArr2, iZzi3, i80, zzla.zza));
                                                            iZzi3 = i81;
                                                        }
                                                    }
                                                }
                                            }
                                            i31 = i38;
                                            zzikVar8 = zzikVar5;
                                            i30 = i37;
                                            i69 = i36;
                                            i68 = i35;
                                            iZzi2 = iZzi3;
                                            i32 = 1;
                                            i33 = i34;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar111 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar111;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        }
                                        i31 = i38;
                                        i33 = i34;
                                        zzikVar8 = zzikVar5;
                                        i30 = i37;
                                        i69 = i36;
                                        i68 = i35;
                                        i32 = 1;
                                        iZzi2 = i29;
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar112 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar112;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 27:
                                        unsafe = unsafe6;
                                        i39 = i8;
                                        i29 = iZzj;
                                        c3 = 2;
                                        if (i55 == 2) {
                                            zzmk zzmkVarZzx = zzmaVar.zzx(i68);
                                            i35 = i68;
                                            i36 = i69;
                                            i37 = i57 == true ? 1 : 0;
                                            zzikVar5 = zzikVar8;
                                            i34 = i39;
                                            i38 = 3;
                                            iZzi3 = zzil.zze(zzmkVarZzx, i57 == true ? 1 : 0, bArr, i29, i8, zzkzVar, zzikVar);
                                            i31 = i38;
                                            zzikVar8 = zzikVar5;
                                            i30 = i37;
                                            i69 = i36;
                                            i68 = i35;
                                            iZzi2 = iZzi3;
                                            i32 = 1;
                                            i33 = i34;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar113 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar113;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        }
                                        i33 = i39;
                                        i32 = 1;
                                        i30 = i57 == true ? 1 : 0;
                                        i31 = 3;
                                        iZzi2 = i29;
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar114 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar114;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 28:
                                        unsafe = unsafe6;
                                        i39 = i8;
                                        i29 = iZzj;
                                        c3 = 2;
                                        if (i55 == 2) {
                                            iZzi2 = zzil.zzi(bArr2, i29, zzikVar8);
                                            int i82 = zzikVar8.zza;
                                            if (i82 < 0) {
                                                throw zzlc.zzf();
                                            }
                                            if (i82 > bArr2.length - iZzi2) {
                                                throw zzlc.zzi();
                                            }
                                            if (i82 == 0) {
                                                zzkzVar.add(zziv.zzb);
                                            } else {
                                                zzkzVar.add(zziv.zzk(bArr2, iZzi2, i82));
                                                iZzi2 += i82;
                                            }
                                            while (iZzi2 < i39) {
                                                int iZzi12 = zzil.zzi(bArr2, iZzi2, zzikVar8);
                                                if (i57 != zzikVar8.zza) {
                                                    i69 = i69;
                                                    zzikVar8 = zzikVar8;
                                                    i33 = i39;
                                                    i32 = 1;
                                                    i30 = i57 == true ? 1 : 0;
                                                    i31 = 3;
                                                    zzmaVar = this;
                                                    if (iZzi2 != i29) {
                                                        obj3 = obj;
                                                        i9 = i9;
                                                        i48 = i69;
                                                        i8 = i33;
                                                        i45 = i31;
                                                        i50 = i30;
                                                        i47 = -1;
                                                        i51 = i25;
                                                        unsafe3 = unsafe;
                                                        iZzm = iZzi2;
                                                        i46 = i32;
                                                        zzik zzikVar115 = zzikVar8;
                                                        iZzs = i68;
                                                        zzikVar6 = zzikVar115;
                                                    } else {
                                                        obj3 = obj;
                                                        i11 = i9;
                                                        i16 = i68;
                                                        i17 = i69;
                                                        zzikVar2 = zzikVar8;
                                                        i14 = i31;
                                                        i10 = i32;
                                                        i13 = i30;
                                                        i51 = i25;
                                                        iZzl = iZzi2;
                                                    }
                                                    break;
                                                } else {
                                                    iZzi2 = zzil.zzi(bArr2, iZzi12, zzikVar8);
                                                    int i83 = zzikVar8.zza;
                                                    if (i83 < 0) {
                                                        throw zzlc.zzf();
                                                    }
                                                    if (i83 > bArr2.length - iZzi2) {
                                                        throw zzlc.zzi();
                                                    }
                                                    if (i83 == 0) {
                                                        zzkzVar.add(zziv.zzb);
                                                    } else {
                                                        zzkzVar.add(zziv.zzk(bArr2, iZzi2, i83));
                                                        iZzi2 += i83;
                                                    }
                                                }
                                            }
                                            i69 = i69;
                                            zzikVar8 = zzikVar8;
                                            i33 = i39;
                                            i32 = 1;
                                            i30 = i57 == true ? 1 : 0;
                                            i31 = 3;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar116 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar116;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        }
                                        i33 = i39;
                                        i32 = 1;
                                        i30 = i57 == true ? 1 : 0;
                                        i31 = 3;
                                        iZzi2 = i29;
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar117 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar117;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        unsafe = unsafe6;
                                        i39 = i8;
                                        i29 = iZzj;
                                        if (i55 != 2) {
                                            if (i55 == 0) {
                                                iZzk = zzil.zzk(i57 == true ? 1 : 0, bArr, i29, i8, zzkzVar, zzikVar);
                                            }
                                            i33 = i39;
                                            i32 = 1;
                                            i30 = i57 == true ? 1 : 0;
                                            i31 = 3;
                                            iZzi2 = i29;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar118 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar118;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        } else {
                                            iZzk = zzil.zzf(bArr2, i29, zzkzVar, zzikVar8);
                                        }
                                        int i84 = iZzk;
                                        zzmm.zzo(obj, i69, zzkzVar, zzmaVar.zzw(i68), null, zzmaVar.zzm);
                                        iZzi2 = i84;
                                        i69 = i69;
                                        zzikVar8 = zzikVar8;
                                        i33 = i39;
                                        i32 = 1;
                                        i30 = i57 == true ? 1 : 0;
                                        i31 = 3;
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar119 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar119;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        unsafe = unsafe6;
                                        i39 = i8;
                                        i29 = iZzj;
                                        if (i55 != 2) {
                                            if (i55 == 0) {
                                                zzkt zzktVar3 = (zzkt) zzkzVar;
                                                iZzi2 = zzil.zzi(bArr2, i29, zzikVar8);
                                                zzktVar3.zzh(zzjb.zzF(zzikVar8.zza));
                                                while (iZzi2 < i39) {
                                                    int iZzi13 = zzil.zzi(bArr2, iZzi2, zzikVar8);
                                                    if (i57 == zzikVar8.zza) {
                                                        iZzi2 = zzil.zzi(bArr2, iZzi13, zzikVar8);
                                                        zzktVar3.zzh(zzjb.zzF(zzikVar8.zza));
                                                    }
                                                }
                                            }
                                            i33 = i39;
                                            i32 = 1;
                                            i30 = i57 == true ? 1 : 0;
                                            i31 = 3;
                                            iZzi2 = i29;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar1110 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar1110;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        } else {
                                            zzkt zzktVar4 = (zzkt) zzkzVar;
                                            iZzi2 = zzil.zzi(bArr2, i29, zzikVar8);
                                            int i85 = zzikVar8.zza + iZzi2;
                                            while (iZzi2 < i85) {
                                                iZzi2 = zzil.zzi(bArr2, iZzi2, zzikVar8);
                                                zzktVar4.zzh(zzjb.zzF(zzikVar8.zza));
                                            }
                                            if (iZzi2 != i85) {
                                                throw zzlc.zzi();
                                            }
                                        }
                                        i69 = i69;
                                        zzikVar8 = zzikVar8;
                                        i33 = i39;
                                        i32 = 1;
                                        i30 = i57 == true ? 1 : 0;
                                        i31 = 3;
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar1111 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar1111;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        unsafe = unsafe6;
                                        i39 = i8;
                                        i29 = iZzj;
                                        if (i55 != 2) {
                                            if (i55 == 0) {
                                                zzlm zzlmVar5 = (zzlm) zzkzVar;
                                                iZzi2 = zzil.zzl(bArr2, i29, zzikVar8);
                                                zzlmVar5.zzg(zzjb.zzG(zzikVar8.zzb));
                                                while (iZzi2 < i39) {
                                                    int iZzi14 = zzil.zzi(bArr2, iZzi2, zzikVar8);
                                                    if (i57 == zzikVar8.zza) {
                                                        iZzi2 = zzil.zzl(bArr2, iZzi14, zzikVar8);
                                                        zzlmVar5.zzg(zzjb.zzG(zzikVar8.zzb));
                                                    }
                                                }
                                            }
                                            i33 = i39;
                                            i32 = 1;
                                            i30 = i57 == true ? 1 : 0;
                                            i31 = 3;
                                            iZzi2 = i29;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar1112 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar1112;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        } else {
                                            zzlm zzlmVar6 = (zzlm) zzkzVar;
                                            iZzi2 = zzil.zzi(bArr2, i29, zzikVar8);
                                            int i86 = zzikVar8.zza + iZzi2;
                                            while (iZzi2 < i86) {
                                                iZzi2 = zzil.zzl(bArr2, iZzi2, zzikVar8);
                                                zzlmVar6.zzg(zzjb.zzG(zzikVar8.zzb));
                                            }
                                            if (iZzi2 != i86) {
                                                throw zzlc.zzi();
                                            }
                                        }
                                        i69 = i69;
                                        zzikVar8 = zzikVar8;
                                        i33 = i39;
                                        i32 = 1;
                                        i30 = i57 == true ? 1 : 0;
                                        i31 = 3;
                                        zzmaVar = this;
                                        if (iZzi2 != i29) {
                                            obj3 = obj;
                                            i9 = i9;
                                            i48 = i69;
                                            i8 = i33;
                                            i45 = i31;
                                            i50 = i30;
                                            i47 = -1;
                                            i51 = i25;
                                            unsafe3 = unsafe;
                                            iZzm = iZzi2;
                                            i46 = i32;
                                            zzik zzikVar1113 = zzikVar8;
                                            iZzs = i68;
                                            zzikVar6 = zzikVar1113;
                                        } else {
                                            obj3 = obj;
                                            i11 = i9;
                                            i16 = i68;
                                            i17 = i69;
                                            zzikVar2 = zzikVar8;
                                            i14 = i31;
                                            i10 = i32;
                                            i13 = i30;
                                            i51 = i25;
                                            iZzl = iZzi2;
                                        }
                                        break;
                                    default:
                                        if (i55 == 3) {
                                            int i87 = ((i57 == true ? 1 : 0) & (-8)) | 4;
                                            zzmk zzmkVarZzx2 = zzmaVar.zzx(i68);
                                            i29 = iZzj;
                                            unsafe = unsafe6;
                                            iZzi2 = zzil.zzc(zzmkVarZzx2, bArr, iZzj, i8, i87, zzikVar);
                                            zzkzVar.add(zzikVar8.zzc);
                                            for (int i88 = i8; iZzi2 < i88; i88 = i88) {
                                                int iZzi15 = zzil.zzi(bArr2, iZzi2, zzikVar8);
                                                if (i57 != zzikVar8.zza) {
                                                    i39 = i88;
                                                    i69 = i69;
                                                    zzikVar8 = zzikVar8;
                                                    i33 = i39;
                                                    i32 = 1;
                                                    i30 = i57 == true ? 1 : 0;
                                                    i31 = 3;
                                                    zzmaVar = this;
                                                    if (iZzi2 != i29) {
                                                        obj3 = obj;
                                                        i9 = i9;
                                                        i48 = i69;
                                                        i8 = i33;
                                                        i45 = i31;
                                                        i50 = i30;
                                                        i47 = -1;
                                                        i51 = i25;
                                                        unsafe3 = unsafe;
                                                        iZzm = iZzi2;
                                                        i46 = i32;
                                                        zzik zzikVar1114 = zzikVar8;
                                                        iZzs = i68;
                                                        zzikVar6 = zzikVar1114;
                                                    } else {
                                                        obj3 = obj;
                                                        i11 = i9;
                                                        i16 = i68;
                                                        i17 = i69;
                                                        zzikVar2 = zzikVar8;
                                                        i14 = i31;
                                                        i10 = i32;
                                                        i13 = i30;
                                                        i51 = i25;
                                                        iZzl = iZzi2;
                                                    }
                                                } else {
                                                    iZzi2 = zzil.zzc(zzmkVarZzx2, bArr, iZzi15, i8, i87, zzikVar);
                                                    zzkzVar.add(zzikVar8.zzc);
                                                }
                                                break;
                                            }
                                            i39 = i88;
                                            i69 = i69;
                                            zzikVar8 = zzikVar8;
                                            i33 = i39;
                                            i32 = 1;
                                            i30 = i57 == true ? 1 : 0;
                                            i31 = 3;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar1115 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar1115;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        } else {
                                            unsafe = unsafe6;
                                            i29 = iZzj;
                                            i68 = i68;
                                            i69 = i69;
                                            zzikVar8 = zzikVar8;
                                            i32 = 1;
                                            i33 = i8;
                                            i30 = i57 == true ? 1 : 0;
                                            i31 = 3;
                                            iZzi2 = i29;
                                            zzmaVar = this;
                                            if (iZzi2 != i29) {
                                                obj3 = obj;
                                                i9 = i9;
                                                i48 = i69;
                                                i8 = i33;
                                                i45 = i31;
                                                i50 = i30;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzm = iZzi2;
                                                i46 = i32;
                                                zzik zzikVar1116 = zzikVar8;
                                                iZzs = i68;
                                                zzikVar6 = zzikVar1116;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i16 = i68;
                                                i17 = i69;
                                                zzikVar2 = zzikVar8;
                                                i14 = i31;
                                                i10 = i32;
                                                i13 = i30;
                                                i51 = i25;
                                                iZzl = iZzi2;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                unsafe = unsafe6;
                                int i89 = iZzj;
                                i26 = i68;
                                i17 = i69;
                                i27 = i57 == true ? 1 : 0;
                                i28 = 3;
                                zzikVar4 = zzikVar8;
                                if (iZzt != 50) {
                                    zzmaVar = this;
                                    obj3 = obj;
                                    Unsafe unsafe8 = zzb;
                                    long j7 = iArr[i26 + 2] & 1048575;
                                    switch (iZzt) {
                                        case 51:
                                            i26 = i26;
                                            i17 = i17;
                                            i40 = i89;
                                            i41 = i27 == true ? 1 : 0;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i55 == 1) {
                                                iZzl2 = i40 + 8;
                                                unsafe8.putObject(obj3, j, Double.valueOf(Double.longBitsToDouble(zzil.zzp(bArr2, i40))));
                                                unsafe8.putInt(obj3, j7, i17);
                                                iZzm = iZzl2;
                                            } else {
                                                iZzm = i40;
                                            }
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 52:
                                            i26 = i26;
                                            i17 = i17;
                                            i40 = i89;
                                            i41 = i27 == true ? 1 : 0;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i55 == 5) {
                                                iZzl2 = i40 + 4;
                                                unsafe8.putObject(obj3, j, Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr2, i40))));
                                                unsafe8.putInt(obj3, j7, i17);
                                                iZzm = iZzl2;
                                            } else {
                                                iZzm = i40;
                                            }
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i26 = i26;
                                            i17 = i17;
                                            i40 = i89;
                                            i42 = i27 == true ? 1 : 0;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i55 == 0) {
                                                iZzl2 = zzil.zzl(bArr2, i40, zzikVar2);
                                                i41 = i42 == true ? 1 : 0;
                                                unsafe8.putObject(obj3, j, Long.valueOf(zzikVar2.zzb));
                                                unsafe8.putInt(obj3, j7, i17);
                                                iZzm = iZzl2;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i42;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i26 = i26;
                                            i17 = i17;
                                            i40 = i89;
                                            i42 = i27 == true ? 1 : 0;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i55 == 0) {
                                                iZzl2 = zzil.zzi(bArr2, i40, zzikVar2);
                                                unsafe8.putObject(obj3, j, Integer.valueOf(zzikVar2.zza));
                                                unsafe8.putInt(obj3, j7, i17);
                                                i41 = i42;
                                                iZzm = iZzl2;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i42;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i26 = i26;
                                            i17 = i17;
                                            i40 = i89;
                                            i42 = i27 == true ? 1 : 0;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i55 == 1) {
                                                iZzl2 = i40 + 8;
                                                unsafe8.putObject(obj3, j, Long.valueOf(zzil.zzp(bArr2, i40)));
                                                unsafe8.putInt(obj3, j7, i17);
                                                i41 = i42;
                                                iZzm = iZzl2;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i42;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i26 = i26;
                                            i17 = i17;
                                            i40 = i89;
                                            i43 = i27 == true ? 1 : 0;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i55 == 5) {
                                                iZzl2 = i40 + 4;
                                                unsafe8.putObject(obj3, j, Integer.valueOf(zzil.zzb(bArr2, i40)));
                                                unsafe8.putInt(obj3, j7, i17);
                                                i41 = i43;
                                                i10 = 1;
                                                iZzm = iZzl2;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i43;
                                            i10 = 1;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 58:
                                            i26 = i26;
                                            i17 = i17;
                                            i40 = i89;
                                            i43 = i27 == true ? 1 : 0;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i55 == 0) {
                                                iZzl2 = zzil.zzl(bArr2, i40, zzikVar2);
                                                unsafe8.putObject(obj3, j, Boolean.valueOf(zzikVar2.zzb != 0));
                                                unsafe8.putInt(obj3, j7, i17);
                                                i41 = i43;
                                                i10 = 1;
                                                iZzm = iZzl2;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i43;
                                            i10 = 1;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 59:
                                            i26 = i26;
                                            i17 = i17;
                                            i40 = i89;
                                            i43 = i27 == true ? 1 : 0;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i55 == 2) {
                                                int iZzi16 = zzil.zzi(bArr2, i40, zzikVar2);
                                                int i90 = zzikVar2.zza;
                                                if (i90 == 0) {
                                                    unsafe8.putObject(obj3, j, "");
                                                } else {
                                                    int i91 = iZzi16 + i90;
                                                    if ((i56 & 536870912) != 0 && !zznl.zze(bArr2, iZzi16, i91)) {
                                                        throw zzlc.zzd();
                                                    }
                                                    unsafe8.putObject(obj3, j, new String(bArr2, iZzi16, i90, zzla.zza));
                                                    iZzi16 = i91;
                                                }
                                                unsafe8.putInt(obj3, j7, i17);
                                                i41 = i43 == true ? 1 : 0;
                                                iZzm = iZzi16;
                                                i10 = 1;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i43;
                                            i10 = 1;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 60:
                                            i40 = i89;
                                            i44 = i27 == true ? 1 : 0;
                                            i14 = 3;
                                            if (i55 == 2) {
                                                Object objZzB = zzmaVar.zzB(obj3, i17, i26);
                                                int iZzn2 = zzil.zzn(objZzB, zzmaVar.zzx(i26), bArr, i40, i8, zzikVar);
                                                zzmaVar.zzK(obj3, i17, i26, objZzB);
                                                zzikVar2 = zzikVar4;
                                                i26 = i26;
                                                i17 = i17;
                                                i41 = i44 == true ? 1 : 0;
                                                iZzm = iZzn2;
                                                i40 = i40;
                                                i10 = 1;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            } else {
                                                i41 = i44;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                iZzm = i40;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            break;
                                        case 61:
                                            i40 = i89;
                                            i44 = i27 == true ? 1 : 0;
                                            i14 = 3;
                                            if (i55 == 2) {
                                                iZza = zzil.zza(bArr2, i40, zzikVar4);
                                                unsafe8.putObject(obj3, j, zzikVar4.zzc);
                                                unsafe8.putInt(obj3, j7, i17);
                                                i41 = i44;
                                                iZzm = iZza;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i44;
                                            i10 = 1;
                                            zzikVar2 = zzikVar4;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 63:
                                            i40 = i89;
                                            i44 = i27 == true ? 1 : 0;
                                            i14 = 3;
                                            if (i55 == 0) {
                                                iZza = zzil.zzi(bArr2, i40, zzikVar4);
                                                int i92 = zzikVar4.zza;
                                                zzkw zzkwVarZzw2 = zzmaVar.zzw(i26);
                                                if (zzkwVarZzw2 == null || zzkwVarZzw2.zza(i92)) {
                                                    unsafe8.putObject(obj3, j, Integer.valueOf(i92));
                                                    unsafe8.putInt(obj3, j7, i17);
                                                } else {
                                                    zzd(obj).zzj(i44 == true ? 1 : 0, Long.valueOf(i92));
                                                }
                                                i41 = i44;
                                                iZzm = iZza;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i44;
                                            i10 = 1;
                                            zzikVar2 = zzikVar4;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 66:
                                            i40 = i89;
                                            i44 = i27 == true ? 1 : 0;
                                            i14 = 3;
                                            if (i55 == 0) {
                                                iZza = zzil.zzi(bArr2, i40, zzikVar4);
                                                unsafe8.putObject(obj3, j, Integer.valueOf(zzjb.zzF(zzikVar4.zza)));
                                                unsafe8.putInt(obj3, j7, i17);
                                                i41 = i44;
                                                iZzm = iZza;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i44;
                                            i10 = 1;
                                            zzikVar2 = zzikVar4;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 67:
                                            i40 = i89;
                                            i44 = i27 == true ? 1 : 0;
                                            i14 = 3;
                                            if (i55 == 0) {
                                                iZza = zzil.zzl(bArr2, i40, zzikVar4);
                                                unsafe8.putObject(obj3, j, Long.valueOf(zzjb.zzG(zzikVar4.zzb)));
                                                unsafe8.putInt(obj3, j7, i17);
                                                i41 = i44;
                                                iZzm = iZza;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            i41 = i44;
                                            i10 = 1;
                                            zzikVar2 = zzikVar4;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                        case 68:
                                            if (i55 == 3) {
                                                int i93 = ((i27 == true ? 1 : 0) & (-8)) | 4;
                                                Object objZzB2 = zzmaVar.zzB(obj3, i17, i26);
                                                i14 = 3;
                                                i40 = i89;
                                                iZzm = zzil.zzm(objZzB2, zzmaVar.zzx(i26), bArr, i89, i8, i93, zzikVar);
                                                zzmaVar.zzK(obj3, i17, i26, objZzB2);
                                                i41 = i27 == true ? 1 : 0;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            } else {
                                                i14 = 3;
                                                i40 = i89;
                                                i41 = i27 == true ? 1 : 0;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                iZzm = i40;
                                                if (iZzm != i40) {
                                                    i8 = i8;
                                                    i9 = i9;
                                                    i48 = i17;
                                                    zzikVar6 = zzikVar2;
                                                    i46 = i10;
                                                    i50 = i41;
                                                    i45 = i14;
                                                    i47 = -1;
                                                    i51 = i25;
                                                    unsafe3 = unsafe;
                                                    iZzs = i26;
                                                } else {
                                                    i11 = i9;
                                                    iZzl = iZzm;
                                                    i13 = i41;
                                                    i51 = i25;
                                                    i16 = i26;
                                                }
                                            }
                                            break;
                                        default:
                                            i26 = i26;
                                            i17 = i17;
                                            i40 = i89;
                                            i41 = i27 == true ? 1 : 0;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            iZzm = i40;
                                            if (iZzm != i40) {
                                                i8 = i8;
                                                i9 = i9;
                                                i48 = i17;
                                                zzikVar6 = zzikVar2;
                                                i46 = i10;
                                                i50 = i41;
                                                i45 = i14;
                                                i47 = -1;
                                                i51 = i25;
                                                unsafe3 = unsafe;
                                                iZzs = i26;
                                            } else {
                                                i11 = i9;
                                                iZzl = iZzm;
                                                i13 = i41;
                                                i51 = i25;
                                                i16 = i26;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i55 == 2) {
                                        Unsafe unsafe9 = zzb;
                                        Object objZzz = zzz(i26);
                                        Object object = unsafe9.getObject(obj, j);
                                        if (zzls.zza(object)) {
                                            zzlr zzlrVarZzb = zzlr.zza().zzb();
                                            zzls.zzb(zzlrVarZzb, object);
                                            unsafe9.putObject(obj, j, zzlrVarZzb);
                                        }
                                        throw null;
                                    }
                                    iZzl = i89;
                                    zzmaVar = this;
                                    obj3 = obj;
                                }
                            }
                        } else if (i55 == 2) {
                            zzkz zzkzVarZzd2 = (zzkz) unsafe3.getObject(obj3, j);
                            if (!zzkzVarZzd2.zzc()) {
                                int size2 = zzkzVarZzd2.size();
                                zzkzVarZzd2 = zzkzVarZzd2.zzd(size2 != 0 ? size2 + size2 : 10);
                                unsafe3.putObject(obj3, j, zzkzVarZzd2);
                            }
                            iZzm = zzil.zze(zzmaVar.zzx(iZzs), i57 == true ? 1 : 0, bArr, iZzj, i8, zzkzVarZzd2, zzikVar);
                            iZzs = iZzs;
                            unsafe3 = unsafe3;
                            i50 = i57 == true ? 1 : 0;
                            i48 = i53;
                            i47 = -1;
                            i51 = i51;
                            i46 = 1;
                            i8 = i8;
                            i9 = i9;
                            zzikVar6 = zzikVar7;
                            i45 = 3;
                        } else {
                            i25 = i51;
                            unsafe = unsafe3;
                            zzikVar4 = zzikVar7;
                            i26 = iZzs;
                            i27 = i57 == true ? 1 : 0;
                            i28 = 3;
                            iZzl = iZzj;
                            i17 = i53;
                        }
                        i11 = i9;
                        i16 = i26;
                        i17 = i17;
                        i14 = i28;
                        i51 = i25;
                        i13 = i27;
                        i10 = 1;
                        zzikVar2 = zzikVar4;
                    }
                }
                if (i13 != i11 || i11 == 0) {
                    if (zzmaVar.zzh && (zzkdVar = zzikVar2.zzd) != zzkd.zza) {
                        zzkq zzkqVarZza = zzkdVar.zza(zzmaVar.zzg, i17);
                        if (zzkqVarZza != null) {
                            zzik zzikVar20 = zzikVar2;
                            zzko zzkoVar = (zzko) obj3;
                            zzkoVar.zzi();
                            zzki zzkiVar = zzkoVar.zzb;
                            zznm zznmVar = zzkqVarZza.zza.zzb;
                            if (zznmVar == zznm.zzn) {
                                zzil.zzi(bArr2, iZzl, zzikVar20);
                                throw null;
                            }
                            switch (zznmVar.ordinal()) {
                                case 0:
                                    i18 = iZzl + 8;
                                    objValueOf = Double.valueOf(Double.longBitsToDouble(zzil.zzp(bArr2, iZzl)));
                                    iZzl = i18;
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 1:
                                    i18 = iZzl + 4;
                                    objValueOf = Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr2, iZzl)));
                                    iZzl = i18;
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 2:
                                case 3:
                                    iZzl = zzil.zzl(bArr2, iZzl, zzikVar20);
                                    objValueOf = Long.valueOf(zzikVar20.zzb);
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 4:
                                case 12:
                                    iZzl = zzil.zzi(bArr2, iZzl, zzikVar20);
                                    objValueOf = Integer.valueOf(zzikVar20.zza);
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 5:
                                case 15:
                                    i18 = iZzl + 8;
                                    objValueOf = Long.valueOf(zzil.zzp(bArr2, iZzl));
                                    iZzl = i18;
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 6:
                                case 14:
                                    i18 = iZzl + 4;
                                    objValueOf = Integer.valueOf(zzil.zzb(bArr2, iZzl));
                                    iZzl = i18;
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 7:
                                    iZzl = zzil.zzl(bArr2, iZzl, zzikVar20);
                                    objValueOf = Boolean.valueOf(zzikVar20.zzb != 0 ? i10 : 0);
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 8:
                                    iZzl = zzil.zzg(bArr2, iZzl, zzikVar20);
                                    obj2 = zzikVar20.zzc;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 9:
                                    int i94 = zzmg.zza;
                                    throw null;
                                case 10:
                                    int i95 = zzmg.zza;
                                    throw null;
                                case 11:
                                    iZzl = zzil.zza(bArr2, iZzl, zzikVar20);
                                    obj2 = zzikVar20.zzc;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 16:
                                    iZzl = zzil.zzi(bArr2, iZzl, zzikVar20);
                                    objValueOf = Integer.valueOf(zzjb.zzF(zzikVar20.zza));
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                case 17:
                                    iZzl = zzil.zzl(bArr2, iZzl, zzikVar20);
                                    objValueOf = Long.valueOf(zzjb.zzG(zzikVar20.zzb));
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                                default:
                                    obj2 = objValueOf;
                                    zzkiVar.zzi(zzkqVarZza.zza, obj2);
                                    iZzh = iZzl;
                                    break;
                            }
                        } else {
                            iZzh = zzil.zzh((i13 == true ? 1 : 0) == true ? 1 : 0, bArr, iZzl, i8, zzd(obj), zzikVar);
                        }
                    } else {
                        iZzh = zzil.zzh((i13 == true ? 1 : 0) == true ? 1 : 0, bArr, iZzl, i8, zzd(obj), zzikVar);
                    }
                    i8 = i8;
                    zzikVar6 = zzikVar;
                    i9 = i11;
                    i50 = i13 == true ? 1 : 0;
                    i45 = i14;
                    i47 = i15;
                    i48 = i17;
                    unsafe3 = unsafe;
                    int i96 = i16;
                    iZzm = iZzh;
                    i46 = i10;
                    iZzs = i96;
                } else {
                    iZzm = iZzl;
                    i12 = i49;
                }
            } else {
                i10 = i46;
                i11 = i9;
                unsafe = unsafe3;
                i12 = i49;
                i13 = i50;
            }
        }
        if (i51 != 1048575) {
            unsafe.putInt(obj3, i51, i12);
        }
        for (int i97 = zzmaVar.zzk; i97 < zzmaVar.zzl; i97 += i10) {
            zzy(obj, zzmaVar.zzj[i97], null, zzmaVar.zzm, obj);
        }
        if (i11 == 0) {
            if (iZzm != i8) {
                throw zzlc.zzg();
            }
        } else if (iZzm > i8 || i13 != i11) {
            throw zzlc.zzg();
        }
        return iZzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final Object zze() {
        return ((zzks) this.zzg).zzt();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzks) {
                zzks zzksVar = (zzks) obj;
                zzksVar.zzG(f.API_PRIORITY_OTHER);
                zzksVar.zza = 0;
                zzksVar.zzE();
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
                                ((zzkz) zzni.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzlr) object).zzc();
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
            this.zzm.zzm(obj);
            if (this.zzh) {
                this.zzn.zzf(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
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
                        zzni.zzo(obj, j, zzni.zza(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i7)) {
                        zzni.zzp(obj, j, zzni.zzb(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i7)) {
                        zzni.zzm(obj, j, zzni.zzw(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i7)) {
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i7);
                    break;
                case 10:
                    if (zzN(obj2, i7)) {
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
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
                    zzkz zzkzVarZzd = (zzkz) zzni.zzf(obj, j);
                    zzkz zzkzVar = (zzkz) zzni.zzf(obj2, j);
                    int size = zzkzVarZzd.size();
                    int size2 = zzkzVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzkzVarZzd.zzc()) {
                            zzkzVarZzd = zzkzVarZzd.zzd(size2 + size);
                        }
                        zzkzVarZzd.addAll(zzkzVar);
                    }
                    if (size > 0) {
                        zzkzVar = zzkzVarZzd;
                    }
                    zzni.zzs(obj, j, zzkzVar);
                    break;
                case 50:
                    int i10 = zzmm.zza;
                    zzni.zzs(obj, j, zzls.zzb(zzni.zzf(obj, j), zzni.zzf(obj2, j)));
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
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
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
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
                        zzI(obj, i9, i7);
                    }
                    break;
                case 68:
                    zzF(obj, obj2, i7);
                    break;
            }
        }
        zzmm.zzr(this.zzm, obj, obj2);
        if (this.zzh) {
            zzmm.zzq(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x05de A[Catch: all -> 0x00fc, TryCatch #8 {all -> 0x00fc, blocks: (B:57:0x00da, B:164:0x05d9, B:166:0x05de, B:167:0x05e3, B:108:0x02d3, B:110:0x02dc, B:111:0x02ea, B:112:0x02f8, B:113:0x0306, B:114:0x0314, B:115:0x0322, B:116:0x0330, B:117:0x033e, B:118:0x034c, B:119:0x035b, B:120:0x036a, B:121:0x0379, B:122:0x0388, B:123:0x0397, B:124:0x03b1, B:125:0x03c0, B:126:0x03cf, B:127:0x03e2, B:129:0x03eb, B:130:0x03fb, B:131:0x040b, B:132:0x041a, B:133:0x0429, B:134:0x0438, B:135:0x0447, B:136:0x0456, B:137:0x0465, B:138:0x0474, B:139:0x0483, B:140:0x0498, B:141:0x04aa, B:142:0x04bc, B:143:0x04ce, B:144:0x04e0, B:146:0x04ed, B:149:0x04f4, B:150:0x04fa, B:151:0x0505, B:152:0x0517, B:153:0x0529, B:154:0x053e, B:155:0x0549, B:156:0x055b, B:157:0x056d, B:158:0x057f, B:159:0x0591, B:160:0x05a3, B:161:0x05b5, B:162:0x05c7), top: B:195:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:172:0x05ef A[LOOP:2: B:170:0x05eb->B:172:0x05ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x0603  */
    /* JADX WARN: Code duplicated, block: B:179:0x060e A[LOOP:3: B:177:0x060a->B:179:0x060e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x0622  */
    /* JADX WARN: Code duplicated, block: B:209:0x05e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzh(Object obj, zzmj zzmjVar, zzkd zzkdVar) throws Throwable {
        zznb zznbVar;
        int i7;
        Object obj2;
        zzkd zzkdVar2;
        zzke zzkeVar;
        int i8;
        Object obj3 = obj;
        zzkd zzkdVar3 = zzkdVar;
        zzkdVar.getClass();
        zzD(obj);
        zznb zznbVar2 = this.zzm;
        zzke zzkeVar2 = this.zzn;
        zzki zzkiVar = null;
        Object objZzc = null;
        while (true) {
            try {
                int iZzc = zzmjVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    obj2 = objZzc;
                    zznbVar = zznbVar2;
                    obj3 = obj3;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                            switch (zzt(iZzu)) {
                                case 0:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzo(obj3, iZzu & 1048575, zzmjVar.zza());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 1:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzp(obj3, iZzu & 1048575, zzmjVar.zzb());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 2:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzr(obj3, iZzu & 1048575, zzmjVar.zzl());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 3:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzr(obj3, iZzu & 1048575, zzmjVar.zzo());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 4:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzq(obj3, iZzu & 1048575, zzmjVar.zzg());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 5:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzr(obj3, iZzu & 1048575, zzmjVar.zzk());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 6:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzq(obj3, iZzu & 1048575, zzmjVar.zzf());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 7:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzm(obj3, iZzu & 1048575, zzmjVar.zzN());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 8:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzG(obj3, iZzu, zzmjVar);
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 9:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzlx zzlxVar = (zzlx) zzA(obj3, iZzq);
                                    zzmjVar.zzu(zzlxVar, zzx(iZzq), zzkdVar2);
                                    zzJ(obj3, iZzq, zzlxVar);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 10:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzs(obj3, iZzu & 1048575, zzmjVar.zzp());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 11:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzq(obj3, iZzu & 1048575, zzmjVar.zzj());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 12:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    int iZze = zzmjVar.zze();
                                    zzkw zzkwVarZzw = zzw(iZzq);
                                    if (zzkwVarZzw == null || zzkwVarZzw.zza(iZze)) {
                                        zzni.zzq(obj3, iZzu & 1048575, iZze);
                                        zzH(obj3, iZzq);
                                    } else {
                                        objZzc = zzmm.zzp(obj3, iZzc, iZze, objZzc, zznbVar);
                                    }
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 13:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzq(obj3, iZzu & 1048575, zzmjVar.zzh());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 14:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzr(obj3, iZzu & 1048575, zzmjVar.zzm());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 15:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzq(obj3, iZzu & 1048575, zzmjVar.zzi());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 16:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzni.zzr(obj3, iZzu & 1048575, zzmjVar.zzn());
                                    zzH(obj3, iZzq);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 17:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzlx zzlxVar2 = (zzlx) zzA(obj3, iZzq);
                                    zzmjVar.zzt(zzlxVar2, zzx(iZzq), zzkdVar2);
                                    zzJ(obj3, iZzq, zzlxVar2);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 18:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzx(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 19:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzB(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 20:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzE(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case zzbbd.zzt.zzm /* 21 */:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzM(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 22:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzD(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 23:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzA(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 24:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzz(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 25:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzv(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 26:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    if (zzM(iZzu)) {
                                        ((zzjc) zzmjVar).zzK(zzlk.zza(obj3, iZzu & 1048575), true);
                                    } else {
                                        ((zzjc) zzmjVar).zzK(zzlk.zza(obj3, iZzu & 1048575), false);
                                    }
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 27:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzF(zzlk.zza(obj3, iZzu & 1048575), zzx(iZzq), zzkdVar2);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 28:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzw(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 29:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzL(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 30:
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    List listZza = zzlk.zza(obj3, iZzu & 1048575);
                                    zzmjVar.zzy(listZza);
                                    objZzc = zzmm.zzo(obj, iZzc, listZza, zzw(iZzq), obj2, zznbVar);
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 31:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzG(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 32:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzH(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 33:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzI(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 34:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzJ(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 35:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzx(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 36:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzB(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 37:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzE(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 38:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzM(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 39:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzD(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 40:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzA(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 41:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzz(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 42:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzv(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 43:
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzmjVar.zzL(zzlk.zza(obj3, iZzu & 1048575));
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 44:
                                    List listZza2 = zzlk.zza(obj3, iZzu & 1048575);
                                    zzmjVar.zzy(listZza2);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    try {
                                        objZzc = zzmm.zzo(obj, iZzc, listZza2, zzw(iZzq), objZzc, zznbVar);
                                    } catch (zzlb unused) {
                                        zznbVar.zzs(zzmjVar);
                                        if (objZzc == null) {
                                            objZzc = zznbVar.zzc(obj3);
                                        }
                                        if (!zznbVar.zzr(objZzc, zzmjVar)) {
                                            for (i8 = this.zzk; i8 < this.zzl; i8++) {
                                                zzy(obj, this.zzj[i8], objZzc, zznbVar, obj);
                                            }
                                            if (objZzc != null) {
                                                zznbVar.zzn(obj3, objZzc);
                                            }
                                        }
                                    }
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 45:
                                    zzmjVar.zzG(zzlk.zza(obj3, iZzu & 1048575));
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 46:
                                    zzmjVar.zzH(zzlk.zza(obj3, iZzu & 1048575));
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 47:
                                    zzmjVar.zzI(zzlk.zza(obj3, iZzu & 1048575));
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 48:
                                    zzmjVar.zzJ(zzlk.zza(obj3, iZzu & 1048575));
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 49:
                                    zzmjVar.zzC(zzlk.zza(obj3, iZzu & 1048575), zzx(iZzq), zzkdVar3);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 50:
                                    Object objZzz = zzz(iZzq);
                                    long jZzu = zzu(iZzq) & 1048575;
                                    Object objZzf = zzni.zzf(obj3, jZzu);
                                    if (objZzf == null) {
                                        objZzf = zzlr.zza().zzb();
                                        zzni.zzs(obj3, jZzu, objZzf);
                                    } else if (zzls.zza(objZzf)) {
                                        Object objZzb = zzlr.zza().zzb();
                                        zzls.zzb(objZzb, objZzf);
                                        zzni.zzs(obj3, jZzu, objZzb);
                                        objZzf = objZzb;
                                    }
                                    throw null;
                                case 51:
                                    zzni.zzs(obj3, iZzu & 1048575, Double.valueOf(zzmjVar.zza()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 52:
                                    zzni.zzs(obj3, iZzu & 1048575, Float.valueOf(zzmjVar.zzb()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 53:
                                    zzni.zzs(obj3, iZzu & 1048575, Long.valueOf(zzmjVar.zzl()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 54:
                                    zzni.zzs(obj3, iZzu & 1048575, Long.valueOf(zzmjVar.zzo()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 55:
                                    zzni.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzmjVar.zzg()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 56:
                                    zzni.zzs(obj3, iZzu & 1048575, Long.valueOf(zzmjVar.zzk()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 57:
                                    zzni.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzmjVar.zzf()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 58:
                                    zzni.zzs(obj3, iZzu & 1048575, Boolean.valueOf(zzmjVar.zzN()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 59:
                                    zzG(obj3, iZzu, zzmjVar);
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 60:
                                    zzlx zzlxVar3 = (zzlx) zzB(obj3, iZzc, iZzq);
                                    zzmjVar.zzu(zzlxVar3, zzx(iZzq), zzkdVar3);
                                    zzK(obj3, iZzc, iZzq, zzlxVar3);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 61:
                                    zzni.zzs(obj3, iZzu & 1048575, zzmjVar.zzp());
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 62:
                                    zzni.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzmjVar.zzj()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 63:
                                    int iZze2 = zzmjVar.zze();
                                    zzkw zzkwVarZzw2 = zzw(iZzq);
                                    if (zzkwVarZzw2 != null && !zzkwVarZzw2.zza(iZze2)) {
                                        objZzc = zzmm.zzp(obj3, iZzc, iZze2, obj2, zznbVar);
                                        zznbVar2 = zznbVar;
                                    }
                                    zzni.zzs(obj3, iZzu & 1048575, Integer.valueOf(iZze2));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 64:
                                    zzni.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzmjVar.zzh()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 65:
                                    zzni.zzs(obj3, iZzu & 1048575, Long.valueOf(zzmjVar.zzm()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 66:
                                    zzni.zzs(obj3, iZzu & 1048575, Integer.valueOf(zzmjVar.zzi()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 67:
                                    zzni.zzs(obj3, iZzu & 1048575, Long.valueOf(zzmjVar.zzn()));
                                    zzI(obj3, iZzc, iZzq);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                case 68:
                                    zzlx zzlxVar4 = (zzlx) zzB(obj3, iZzc, iZzq);
                                    zzmjVar.zzt(zzlxVar4, zzx(iZzq), zzkdVar3);
                                    zzK(obj3, iZzc, iZzq, zzlxVar4);
                                    objZzc = obj2;
                                    zzkeVar = zzkeVar2;
                                    zzkdVar2 = zzkdVar3;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                    break;
                                default:
                                    objZzc = obj2 == null ? zznbVar.zzc(obj3) : obj2;
                                    try {
                                        try {
                                            if (!zznbVar.zzr(objZzc, zzmjVar)) {
                                                for (int i9 = this.zzk; i9 < this.zzl; i9++) {
                                                    zzy(obj, this.zzj[i9], objZzc, zznbVar, obj);
                                                }
                                            }
                                        } catch (zzlb unused2) {
                                            zzkeVar = zzkeVar2;
                                            zzkdVar2 = zzkdVar3;
                                            zznbVar.zzs(zzmjVar);
                                            if (objZzc == null) {
                                                objZzc = zznbVar.zzc(obj3);
                                            }
                                            if (!zznbVar.zzr(objZzc, zzmjVar)) {
                                                while (i8 < this.zzl) {
                                                    zzy(obj, this.zzj[i8], objZzc, zznbVar, obj);
                                                }
                                            }
                                            zzkeVar2 = zzkeVar;
                                            zzkdVar3 = zzkdVar2;
                                            zznbVar2 = zznbVar;
                                        }
                                        zznbVar2 = zznbVar;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    break;
                            }
                        } catch (zzlb unused3) {
                            objZzc = obj2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        objZzc = obj2;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                        zzy(obj, this.zzj[i10], objZzc, zznbVar2, obj);
                    }
                    zznbVar = zznbVar2;
                    obj3 = obj3;
                } else {
                    try {
                        Object objZzd = !this.zzh ? null : zzkeVar2.zzd(zzkdVar3, this.zzg, iZzc);
                        if (objZzd != null) {
                            zzki zzkiVarZzc = zzkiVar == null ? zzkeVar2.zzc(obj3) : zzkiVar;
                            obj2 = objZzc;
                            zznb zznbVar3 = zznbVar2;
                            Object obj4 = obj3;
                            try {
                                zzkeVar2.zze(obj, zzmjVar, objZzd, zzkdVar, zzkiVarZzc, obj2, zznbVar3);
                                zzkiVar = zzkiVarZzc;
                                obj3 = obj4;
                                zznbVar2 = zznbVar3;
                                objZzc = obj2;
                            } catch (Throwable th3) {
                                th = th3;
                                obj3 = obj4;
                                zznbVar = zznbVar3;
                                objZzc = obj2;
                                for (i7 = this.zzk; i7 < this.zzl; i7++) {
                                    zzy(obj, this.zzj[i7], objZzc, zznbVar, obj);
                                }
                                if (objZzc != null) {
                                    zznbVar.zzn(obj3, objZzc);
                                }
                                throw th;
                            }
                        } else {
                            Object obj5 = objZzc;
                            zznb zznbVar4 = zznbVar2;
                            Object obj6 = obj3;
                            zznbVar4.zzs(zzmjVar);
                            objZzc = obj5 == null ? zznbVar4.zzc(obj6) : obj5;
                            try {
                                if (zznbVar4.zzr(objZzc, zzmjVar)) {
                                    obj3 = obj6;
                                    zznbVar2 = zznbVar4;
                                } else {
                                    int i11 = this.zzk;
                                    while (i11 < this.zzl) {
                                        zznb zznbVar5 = zznbVar4;
                                        zzy(obj, this.zzj[i11], objZzc, zznbVar5, obj);
                                        i11++;
                                        obj6 = obj6;
                                        zznbVar4 = zznbVar5;
                                    }
                                    obj3 = obj6;
                                    zznbVar = zznbVar4;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj3 = obj6;
                                zznbVar = zznbVar4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zznbVar = zznbVar2;
                        obj3 = obj3;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            while (i7 < this.zzl) {
                zzy(obj, this.zzj[i7], objZzc, zznbVar, obj);
            }
            if (objZzc != null) {
                zznbVar.zzn(obj3, objZzc);
            }
            throw th;
        }
        if (objZzc != null) {
            zznbVar.zzn(obj3, objZzc);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzik zzikVar) throws zzlc {
        zzc(obj, bArr, i7, i8, 0, zzikVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzj(Object obj, zzno zznoVar) {
        Map.Entry entry;
        Iterator it;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        boolean z7;
        boolean z8;
        if (this.zzh) {
            zzki zzkiVarZzb = this.zzn.zzb(obj);
            if (zzkiVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzkiVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < iArr.length) {
            int iZzu = zzu(i14);
            int[] iArr2 = this.zzc;
            int iZzt = zzt(iZzu);
            int i15 = iArr2[i14];
            if (iZzt <= 17) {
                int i16 = iArr2[i14 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                } else {
                    iZzt = iZzt;
                }
                i7 = i12;
                i8 = i13;
                i9 = 1 << (i16 >>> 20);
            } else {
                iZzt = iZzt;
                i7 = i12;
                i8 = i13;
                i9 = 0;
            }
            while (entry != null && this.zzn.zza(entry) <= i15) {
                this.zzn.zzi(zznoVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzf(i15, zzni.zza(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 1:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzo(i15, zzni.zzb(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 2:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzt(i15, unsafe.getLong(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 3:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzK(i15, unsafe.getLong(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 4:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzr(i15, unsafe.getInt(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 5:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzm(i15, unsafe.getLong(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 6:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzk(i15, unsafe.getInt(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 7:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzb(i15, zzni.zzw(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 8:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zzT(i15, unsafe.getObject(obj, j), zznoVar);
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 9:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzv(i15, unsafe.getObject(obj, j), zzx(i10));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 10:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzd(i15, (zziv) unsafe.getObject(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 11:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzI(i15, unsafe.getInt(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 12:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzi(i15, unsafe.getInt(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 13:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzx(i15, unsafe.getInt(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 14:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzz(i15, unsafe.getLong(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 15:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzB(i15, unsafe.getInt(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 16:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i10, i7, i8, i9)) {
                        zznoVar.zzD(i15, unsafe.getLong(obj, j));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 17:
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    if (zzO(obj, i14, i7, i8, i9)) {
                        zznoVar.zzq(i15, unsafe.getObject(obj, j), zzx(i10));
                    }
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 18:
                    z4 = false;
                    zzmm.zzu(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 19:
                    z4 = false;
                    zzmm.zzy(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 20:
                    z4 = false;
                    zzmm.zzA(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    z4 = false;
                    zzmm.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 22:
                    z4 = false;
                    zzmm.zzz(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 23:
                    z4 = false;
                    zzmm.zzx(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 24:
                    z4 = false;
                    zzmm.zzw(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 25:
                    z4 = false;
                    zzmm.zzt(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 26:
                    int i18 = this.zzc[i14];
                    List list = (List) unsafe.getObject(obj, j);
                    int i19 = zzmm.zza;
                    if (list != null && !list.isEmpty()) {
                        zznoVar.zzH(i18, list);
                    }
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 27:
                    int i20 = this.zzc[i14];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzmk zzmkVarZzx = zzx(i14);
                    int i21 = zzmm.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((zzjh) zznoVar).zzv(i20, list2.get(i22), zzmkVarZzx);
                        }
                    }
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 28:
                    int i23 = this.zzc[i14];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i24 = zzmm.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zznoVar.zze(i23, list3);
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 29:
                    z7 = false;
                    zzmm.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 30:
                    z7 = false;
                    zzmm.zzv(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 31:
                    z7 = false;
                    zzmm.zzB(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 32:
                    z7 = false;
                    zzmm.zzC(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 33:
                    z7 = false;
                    zzmm.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 34:
                    z7 = false;
                    zzmm.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, false);
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 35:
                    z8 = true;
                    zzmm.zzu(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 36:
                    z8 = true;
                    zzmm.zzy(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 37:
                    z8 = true;
                    zzmm.zzA(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 38:
                    z8 = true;
                    zzmm.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 39:
                    z8 = true;
                    zzmm.zzz(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 40:
                    z8 = true;
                    zzmm.zzx(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 41:
                    z8 = true;
                    zzmm.zzw(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 42:
                    z8 = true;
                    zzmm.zzt(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 43:
                    z8 = true;
                    zzmm.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 44:
                    z8 = true;
                    zzmm.zzv(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 45:
                    z8 = true;
                    zzmm.zzB(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 46:
                    z8 = true;
                    zzmm.zzC(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 47:
                    z8 = true;
                    zzmm.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 48:
                    z8 = true;
                    zzmm.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j), zznoVar, true);
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 49:
                    int i25 = this.zzc[i14];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzmk zzmkVarZzx2 = zzx(i14);
                    int i26 = zzmm.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            ((zzjh) zznoVar).zzq(i25, list4.get(i27), zzmkVarZzx2);
                        }
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 51:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzf(i15, zzn(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 52:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzo(i15, zzo(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 53:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzt(i15, zzv(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 54:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzK(i15, zzv(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 55:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzr(i15, zzp(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 56:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzm(i15, zzv(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 57:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzk(i15, zzp(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 58:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzb(i15, zzS(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 59:
                    if (zzR(obj, i15, i14)) {
                        zzT(i15, unsafe.getObject(obj, j), zznoVar);
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 60:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzv(i15, unsafe.getObject(obj, j), zzx(i14));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 61:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzd(i15, (zziv) unsafe.getObject(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 62:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzI(i15, zzp(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 63:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzi(i15, zzp(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 64:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzx(i15, zzp(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 65:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzz(i15, zzv(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 66:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzB(i15, zzp(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 67:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzD(i15, zzv(obj, j));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                case 68:
                    if (zzR(obj, i15, i14)) {
                        zznoVar.zzq(i15, unsafe.getObject(obj, j), zzx(i14));
                    }
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
                default:
                    i10 = i14;
                    i14 = i10 + 3;
                    i12 = i7;
                    i13 = i8;
                    i11 = 1048575;
                    it = it;
                    iArr = iArr;
                    entry = entry;
                    break;
            }
        }
        Iterator it2 = it;
        while (entry != null) {
            this.zzn.zzi(zznoVar, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        zznb zznbVar = this.zzm;
        zznbVar.zzq(zznbVar.zzd(obj), zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzH;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int iZzu = zzu(i7);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i7) || Double.doubleToLongBits(zzni.zza(obj, j)) != Double.doubleToLongBits(zzni.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i7) || Float.floatToIntBits(zzni.zzb(obj, j)) != Float.floatToIntBits(zzni.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i7) || zzni.zzd(obj, j) != zzni.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i7) || zzni.zzd(obj, j) != zzni.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i7) || zzni.zzc(obj, j) != zzni.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i7) || zzni.zzd(obj, j) != zzni.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i7) || zzni.zzc(obj, j) != zzni.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i7) || zzni.zzw(obj, j) != zzni.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i7) || !zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i7) || !zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i7) || !zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i7) || zzni.zzc(obj, j) != zzni.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i7) || zzni.zzc(obj, j) != zzni.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i7) || zzni.zzc(obj, j) != zzni.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i7) || zzni.zzd(obj, j) != zzni.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i7) || zzni.zzc(obj, j) != zzni.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i7) || zzni.zzd(obj, j) != zzni.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i7) || !zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
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
                    zZzH = zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j));
                    break;
                case 50:
                    zZzH = zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j));
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
                    if (zzni.zzc(obj, jZzr) != zzni.zzc(obj2, jZzr) || !zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzH) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzl(Object obj) {
        int i7;
        int i8;
        List list;
        zzmk zzmkVarZzx;
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
                list = (List) zzni.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmkVarZzx = zzx(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!zzmkVarZzx.zzl(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i14, i13) && !zzP(obj, iZzu, zzx(i13))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzni.zzf(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzmkVarZzx = zzx(i13);
                    while (i9 < list.size()) {
                        if (!zzmkVarZzx.zzl(list.get(i9))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzlr) zzni.zzf(obj, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i11++;
            i12 = i7;
            i10 = i8;
        }
        return !this.zzh || this.zzn.zzb(obj).zzk();
    }
}
