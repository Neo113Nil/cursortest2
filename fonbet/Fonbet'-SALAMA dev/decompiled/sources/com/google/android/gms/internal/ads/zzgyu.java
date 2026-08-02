package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
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
        zzgzk zzx = zzx(i7);
        int zzu = zzu(i7) & 1048575;
        if (!zzN(obj, i7)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i7, int i8) {
        zzgzk zzx = zzx(i8);
        if (!zzR(obj, i7, i8)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i8) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
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
            String arrays = Arrays.toString(declaredFields);
            StringBuilder l7 = k.l("Field ", str, " for ", name, " not found. Known fields are ");
            l7.append(arrays);
            throw new RuntimeException(l7.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i7) {
        if (zzN(obj2, i7)) {
            int zzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzgzk zzx = zzx(i7);
            if (!zzN(obj, i7)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i7) {
        int i8 = this.zzc[i7];
        if (zzR(obj2, i8, i7)) {
            int zzu = zzu(i7) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i7] + " is present but null: " + obj2.toString());
            }
            zzgzk zzx = zzx(i7);
            if (!zzR(obj, i8, i7)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
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
        int zzr = zzr(i7);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzhad.zzt(obj, j, (1 << (zzr >>> 20)) | zzhad.zzd(obj, j));
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
        int zzr = zzr(i7);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzhad.zzd(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i7);
        long j3 = zzu & 1048575;
        switch (zzt(zzu)) {
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
                Object zzh = zzhad.zzh(obj, j3);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                }
                if (zzh instanceof zzgvy) {
                    return !zzgvy.zzb.equals(zzh);
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
        return i8 == 1048575 ? zzN(obj, i7) : (i9 & i10) != 0;
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
        zzgzx zzf = zzgzx.zzf();
        zzgxgVar.zzt = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgyu zzm(Class cls, zzgyo zzgyoVar, zzgyx zzgyxVar, zzgye zzgyeVar, zzgzw zzgzwVar, zzgwr zzgwrVar, zzgym zzgymVar) {
        int i7;
        int charAt;
        int charAt2;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        char charAt3;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        zzgzd zzgzdVar;
        String str;
        int objectFieldOffset;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Field zzC;
        int i31;
        char charAt11;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        int i39;
        char charAt15;
        if (!(zzgyoVar instanceof zzgzd)) {
            throw null;
        }
        zzgzd zzgzdVar2 = (zzgzd) zzgyoVar;
        String zzd = zzgzdVar2.zzd();
        int length = zzd.length();
        char c3 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i7 = i40 + 1;
                if (zzd.charAt(i40) < 55296) {
                    break;
                }
                i40 = i7;
            }
        } else {
            i7 = 1;
        }
        int i41 = i7 + 1;
        int charAt16 = zzd.charAt(i7);
        if (charAt16 >= 55296) {
            int i42 = charAt16 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                charAt15 = zzd.charAt(i41);
                if (charAt15 < 55296) {
                    break;
                }
                i42 |= (charAt15 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            charAt16 = i42 | (charAt15 << i43);
            i41 = i39;
        }
        if (charAt16 == 0) {
            i10 = 0;
            charAt = 0;
            charAt2 = 0;
            i8 = 0;
            i11 = 0;
            i9 = 0;
            iArr = zza;
            i12 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt17 = zzd.charAt(i41);
            if (charAt17 >= 55296) {
                int i45 = charAt17 & 8191;
                int i46 = 13;
                while (true) {
                    i20 = i44 + 1;
                    charAt10 = zzd.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i20;
                }
                charAt17 = i45 | (charAt10 << i46);
                i44 = i20;
            }
            int i47 = i44 + 1;
            int charAt18 = zzd.charAt(i44);
            if (charAt18 >= 55296) {
                int i48 = charAt18 & 8191;
                int i49 = 13;
                while (true) {
                    i19 = i47 + 1;
                    charAt9 = zzd.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i19;
                }
                charAt18 = i48 | (charAt9 << i49);
                i47 = i19;
            }
            int i50 = i47 + 1;
            int charAt19 = zzd.charAt(i47);
            if (charAt19 >= 55296) {
                int i51 = charAt19 & 8191;
                int i52 = 13;
                while (true) {
                    i18 = i50 + 1;
                    charAt8 = zzd.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i18;
                }
                charAt19 = i51 | (charAt8 << i52);
                i50 = i18;
            }
            int i53 = i50 + 1;
            int charAt20 = zzd.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i17 = i53 + 1;
                    charAt7 = zzd.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i17;
                }
                charAt20 = i54 | (charAt7 << i55);
                i53 = i17;
            }
            int i56 = i53 + 1;
            charAt = zzd.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i16 = i56 + 1;
                    charAt6 = zzd.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i16;
                }
                charAt = i57 | (charAt6 << i58);
                i56 = i16;
            }
            int i59 = i56 + 1;
            charAt2 = zzd.charAt(i56);
            if (charAt2 >= 55296) {
                int i60 = charAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i15 = i59 + 1;
                    charAt5 = zzd.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i15;
                }
                charAt2 = i60 | (charAt5 << i61);
                i59 = i15;
            }
            int i62 = i59 + 1;
            int charAt21 = zzd.charAt(i59);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i14 = i62 + 1;
                    charAt4 = zzd.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i14;
                }
                charAt21 = i63 | (charAt4 << i64);
                i62 = i14;
            }
            int i65 = i62 + 1;
            int charAt22 = zzd.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = 13;
                while (true) {
                    i13 = i65 + 1;
                    charAt3 = zzd.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i66 |= (charAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i13;
                }
                charAt22 = i66 | (charAt3 << i67);
                i65 = i13;
            }
            int i68 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            i8 = charAt19;
            i9 = charAt22;
            i10 = i68;
            iArr = iArr2;
            i11 = charAt20;
            i12 = charAt17;
            i41 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzgzdVar2.zze();
        Class<?> cls2 = zzgzdVar2.zza().getClass();
        int i69 = i9 + charAt2;
        int i70 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i70];
        int i71 = i9;
        int i72 = i69;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int charAt23 = zzd.charAt(i41);
            if (charAt23 >= c3) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i38 = i77 + 1;
                    charAt14 = zzd.charAt(i77);
                    if (charAt14 < c3) {
                        break;
                    }
                    i76 |= (charAt14 & 8191) << i78;
                    i78 += 13;
                    i77 = i38;
                }
                charAt23 = i76 | (charAt14 << i78);
                i21 = i38;
            } else {
                i21 = i75;
            }
            int i79 = i21 + 1;
            int charAt24 = zzd.charAt(i21);
            if (charAt24 >= c3) {
                int i80 = charAt24 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i37 = i81 + 1;
                    charAt13 = zzd.charAt(i81);
                    if (charAt13 < c3) {
                        break;
                    }
                    i80 |= (charAt13 & 8191) << i82;
                    i82 += 13;
                    i81 = i37;
                }
                charAt24 = i80 | (charAt13 << i82);
                i22 = i37;
            } else {
                i22 = i79;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            int i83 = charAt24 & 255;
            int i84 = length;
            int i85 = charAt24 & 2048;
            int i86 = i11;
            if (i83 >= 51) {
                int i87 = i22 + 1;
                int charAt25 = zzd.charAt(i22);
                if (charAt25 >= 55296) {
                    int i88 = charAt25 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i36 = i89 + 1;
                        charAt12 = zzd.charAt(i89);
                        i23 = i8;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i88 |= (charAt12 & 8191) << i90;
                        i90 += 13;
                        i89 = i36;
                        i8 = i23;
                    }
                    charAt25 = i88 | (charAt12 << i90);
                    i34 = i36;
                } else {
                    i23 = i8;
                    i34 = i87;
                }
                int i91 = i83 - 51;
                int i92 = i34;
                if (i91 == 9 || i91 == 17) {
                    i35 = i10 + 1;
                    int i93 = i74 / 3;
                    objArr[i93 + i93 + 1] = zze[i10];
                } else {
                    if (i91 == 12) {
                        if (zzgzdVar2.zzc() == 1 || i85 != 0) {
                            i35 = i10 + 1;
                            int i94 = i74 / 3;
                            objArr[i94 + i94 + 1] = zze[i10];
                        } else {
                            i85 = 0;
                        }
                    }
                    int i95 = charAt25 + charAt25;
                    obj = zze[i95];
                    if (obj instanceof Field) {
                        zzC2 = zzC(cls2, (String) obj);
                        zze[i95] = zzC2;
                    } else {
                        zzC2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC2);
                    int i96 = i95 + 1;
                    obj2 = zze[i96];
                    int i97 = i85;
                    if (obj2 instanceof Field) {
                        zzC3 = zzC(cls2, (String) obj2);
                        zze[i96] = zzC3;
                    } else {
                        zzC3 = (Field) obj2;
                    }
                    i24 = i10;
                    i28 = i92;
                    i25 = charAt23;
                    i26 = (int) unsafe.objectFieldOffset(zzC3);
                    i29 = 0;
                    str = zzd;
                    zzgzdVar = zzgzdVar2;
                    objectFieldOffset = objectFieldOffset2;
                    i30 = i97;
                }
                i10 = i35;
                int i952 = charAt25 + charAt25;
                obj = zze[i952];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzC2);
                int i962 = i952 + 1;
                obj2 = zze[i962];
                int i972 = i85;
                if (obj2 instanceof Field) {
                }
                i24 = i10;
                i28 = i92;
                i25 = charAt23;
                i26 = (int) unsafe.objectFieldOffset(zzC3);
                i29 = 0;
                str = zzd;
                zzgzdVar = zzgzdVar2;
                objectFieldOffset = objectFieldOffset22;
                i30 = i972;
            } else {
                i23 = i8;
                i24 = i10 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i10]);
                i25 = charAt23;
                if (i83 == 9 || i83 == 17) {
                    zzgzdVar = zzgzdVar2;
                    int i98 = i74 / 3;
                    objArr[i98 + i98 + 1] = zzC4.getType();
                } else {
                    if (i83 == 27) {
                        zzgzdVar = zzgzdVar2;
                        i32 = 1;
                        i33 = i10 + 2;
                    } else if (i83 == 49) {
                        i33 = i10 + 2;
                        zzgzdVar = zzgzdVar2;
                        i32 = 1;
                    } else {
                        if (i83 == 12 || i83 == 30 || i83 == 44) {
                            zzgzdVar = zzgzdVar2;
                            if (zzgzdVar2.zzc() == 1 || i85 != 0) {
                                i33 = i10 + 2;
                                int i99 = i74 / 3;
                                objArr[i99 + i99 + 1] = zze[i24];
                                str = zzd;
                                i24 = i33;
                            } else {
                                str = zzd;
                                i85 = 0;
                            }
                        } else if (i83 == 50) {
                            int i100 = i10 + 2;
                            int i101 = i71 + 1;
                            iArr[i71] = i74;
                            int i102 = i74 / 3;
                            int i103 = i102 + i102;
                            objArr[i103] = zze[i24];
                            if (i85 != 0) {
                                i24 = i10 + 3;
                                objArr[i103 + 1] = zze[i100];
                                str = zzd;
                                i71 = i101;
                                zzgzdVar = zzgzdVar2;
                            } else {
                                i24 = i100;
                                i71 = i101;
                                i85 = 0;
                                zzgzdVar = zzgzdVar2;
                            }
                        } else {
                            zzgzdVar = zzgzdVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                        i26 = 1048575;
                        if ((charAt24 & 4096) != 0 || i83 > 17) {
                            i27 = i85;
                            i28 = i22;
                            i29 = 0;
                        } else {
                            int i104 = i22 + 1;
                            int charAt26 = str.charAt(i22);
                            if (charAt26 >= 55296) {
                                int i105 = charAt26 & 8191;
                                int i106 = 13;
                                while (true) {
                                    i31 = i104 + 1;
                                    charAt11 = str.charAt(i104);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i105 |= (charAt11 & 8191) << i106;
                                    i106 += 13;
                                    i104 = i31;
                                }
                                charAt26 = i105 | (charAt11 << i106);
                                i104 = i31;
                            }
                            int i107 = (charAt26 / 32) + i12 + i12;
                            Object obj3 = zze[i107];
                            if (obj3 instanceof Field) {
                                zzC = (Field) obj3;
                            } else {
                                zzC = zzC(cls2, (String) obj3);
                                zze[i107] = zzC;
                            }
                            i28 = i104;
                            i27 = i85;
                            i29 = charAt26 % 32;
                            i26 = (int) unsafe.objectFieldOffset(zzC);
                        }
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i72] = objectFieldOffset;
                            i72++;
                        }
                        i30 = i27;
                    }
                    int i108 = i74 / 3;
                    objArr[i108 + i108 + i32] = zze[i24];
                    str = zzd;
                    i24 = i33;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                    i26 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i27 = i85;
                    i28 = i22;
                    i29 = 0;
                    if (i83 >= 18) {
                        iArr[i72] = objectFieldOffset;
                        i72++;
                    }
                    i30 = i27;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i26 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i27 = i85;
                i28 = i22;
                i29 = 0;
                if (i83 >= 18) {
                }
                i30 = i27;
            }
            int i109 = i74 + 1;
            iArr3[i74] = i25;
            int i110 = i74 + 2;
            Class<?> cls3 = cls2;
            iArr3[i109] = objectFieldOffset | (i30 != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i83 << 20);
            i74 += 3;
            iArr3[i110] = (i29 << 20) | i26;
            zzd = str;
            i10 = i24;
            i41 = i28;
            length = i84;
            i11 = i86;
            cls2 = cls3;
            zzgzdVar2 = zzgzdVar;
            i8 = i23;
            c3 = 55296;
        }
        return new zzgyu(iArr3, objArr, i8, i11, zzgzdVar2.zza(), false, iArr, i9, i69, zzgyxVar, zzgyeVar, zzgzwVar, zzgwrVar, zzgymVar);
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
        zzgzk zzb2 = zzgzb.zza().zzb((Class) objArr[i9 + 1]);
        this.zzd[i9] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i7, Object obj2, zzgzw zzgzwVar, Object obj3) {
        int i8 = this.zzc[i7];
        Object zzh = zzhad.zzh(obj, zzu(i7) & 1048575);
        if (zzh == null || zzw(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r2v46 ??), method size: 2190
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzgzk
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyu.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final int zzb(Object obj) {
        int i7;
        long doubleToLongBits;
        int i8;
        int floatToIntBits;
        int zzd;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzu = zzu(i11);
            int[] iArr = this.zzc;
            int i12 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i13 = iArr[i11];
            long j = i12;
            int i14 = 37;
            switch (zzt) {
                case 0:
                    i7 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhad.zzb(obj, j));
                    byte[] bArr = zzgxt.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzd;
                    break;
                case 1:
                    i8 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhad.zzc(obj, j));
                    i10 = floatToIntBits + i8;
                    break;
                case 2:
                    i7 = i10 * 53;
                    doubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr2 = zzgxt.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzd;
                    break;
                case 3:
                    i7 = i10 * 53;
                    doubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr3 = zzgxt.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzd;
                    break;
                case 4:
                    i7 = i10 * 53;
                    zzd = zzhad.zzd(obj, j);
                    i10 = i7 + zzd;
                    break;
                case 5:
                    i7 = i10 * 53;
                    doubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr4 = zzgxt.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzd;
                    break;
                case 6:
                    i7 = i10 * 53;
                    zzd = zzhad.zzd(obj, j);
                    i10 = i7 + zzd;
                    break;
                case 7:
                    i8 = i10 * 53;
                    floatToIntBits = zzgxt.zza(zzhad.zzz(obj, j));
                    i10 = floatToIntBits + i8;
                    break;
                case 8:
                    i8 = i10 * 53;
                    floatToIntBits = ((String) zzhad.zzh(obj, j)).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object zzh = zzhad.zzh(obj, j);
                    if (zzh != null) {
                        i14 = zzh.hashCode();
                    }
                    i10 = i9 + i14;
                    break;
                case 10:
                    i8 = i10 * 53;
                    floatToIntBits = zzhad.zzh(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 11:
                    i7 = i10 * 53;
                    zzd = zzhad.zzd(obj, j);
                    i10 = i7 + zzd;
                    break;
                case 12:
                    i7 = i10 * 53;
                    zzd = zzhad.zzd(obj, j);
                    i10 = i7 + zzd;
                    break;
                case 13:
                    i7 = i10 * 53;
                    zzd = zzhad.zzd(obj, j);
                    i10 = i7 + zzd;
                    break;
                case 14:
                    i7 = i10 * 53;
                    doubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr5 = zzgxt.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzd;
                    break;
                case 15:
                    i7 = i10 * 53;
                    zzd = zzhad.zzd(obj, j);
                    i10 = i7 + zzd;
                    break;
                case 16:
                    i7 = i10 * 53;
                    doubleToLongBits = zzhad.zzf(obj, j);
                    byte[] bArr6 = zzgxt.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzd;
                    break;
                case 17:
                    i9 = i10 * 53;
                    Object zzh2 = zzhad.zzh(obj, j);
                    if (zzh2 != null) {
                        i14 = zzh2.hashCode();
                    }
                    i10 = i9 + i14;
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
                    floatToIntBits = zzhad.zzh(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 50:
                    i8 = i10 * 53;
                    floatToIntBits = zzhad.zzh(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 51:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzgxt.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzgxt.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzgxt.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzd = zzp(obj, j);
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzgxt.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzd = zzp(obj, j);
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzgxt.zza(zzS(obj, j));
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = ((String) zzhad.zzh(obj, j)).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzhad.zzh(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzhad.zzh(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzd = zzp(obj, j);
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzd = zzp(obj, j);
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzd = zzp(obj, j);
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzgxt.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzd = zzp(obj, j);
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzgxt.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzhad.zzh(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zzgxg) obj).zzt.hashCode() + (i10 * 53);
        return this.zzh ? (hashCode * 53) + ((zzgxc) obj).zza.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0d5f, code lost:
    
        if (r11 == 1048575) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d61, code lost:
    
        r35.putInt(r7, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d67, code lost:
    
        r11 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0d6c, code lost:
    
        if (r11 >= r6.zzl) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d6e, code lost:
    
        zzy(r33, r6.zzj[r11], null, r6.zzm, r33);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d83, code lost:
    
        if (r9 != 0) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d85, code lost:
    
        if (r8 != r13) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d8d, code lost:
    
        throw new com.google.android.gms.internal.ads.zzgxv("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d92, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0d8e, code lost:
    
        if (r8 > r13) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d90, code lost:
    
        if (r10 != r9) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0d98, code lost:
    
        throw new com.google.android.gms.internal.ads.zzgxv("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x09a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x09c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i7, int i8, int i9, zzgvm zzgvmVar) {
        int i10;
        int i11;
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int zzg;
        int i21;
        int i22;
        zzgvm zzgvmVar2;
        int i23;
        int i24;
        boolean z4;
        int i25;
        int i26;
        boolean z7;
        int i27;
        int zzh;
        Unsafe unsafe2;
        int i28;
        int i29;
        zzgvm zzgvmVar3;
        Unsafe unsafe3;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        zzgvm zzgvmVar4;
        int i37;
        int zza2;
        long j;
        int i38;
        int i39;
        int i40;
        zzgvm zzgvmVar5;
        boolean z8;
        Unsafe unsafe4;
        int i41;
        int i42;
        int zzh2;
        Unsafe unsafe5;
        int i43;
        int i44;
        int i45;
        int zzf;
        int zzh3;
        int i46;
        Object obj2;
        int i47;
        int zzj;
        zzgyu<T> zzgyuVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i48 = i8;
        int i49 = i9;
        zzgvm zzgvmVar6 = zzgvmVar;
        int i50 = 3;
        zzD(obj);
        Unsafe unsafe6 = zzb;
        int i51 = -1;
        int i52 = i7;
        int i53 = -1;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 1048575;
        while (true) {
            if (i52 < i48) {
                int i58 = i52 + 1;
                int i59 = bArr2[i52];
                if (i59 < 0) {
                    i58 = zzgvn.zzi(i59, bArr2, i58, zzgvmVar6);
                    i59 = zzgvmVar6.zza;
                }
                int i60 = i59 >>> 3;
                i54 = i60 > i53 ? (i60 < zzgyuVar.zze || i60 > zzgyuVar.zzf) ? i51 : zzgyuVar.zzs(i60, i54 / i50) : zzgyuVar.zzq(i60);
                if (i54 == i51) {
                    i14 = i50;
                    i11 = i49;
                    i15 = i59;
                    i16 = i60;
                    i17 = i51;
                    unsafe = unsafe6;
                    i18 = 0;
                } else {
                    int i61 = i59 & 7;
                    int[] iArr = zzgyuVar.zzc;
                    int i62 = iArr[i54 + 1];
                    int zzt = zzt(i62);
                    long j3 = i62 & 1048575;
                    int i63 = i59;
                    if (zzt <= 17) {
                        int i64 = iArr[i54 + 2];
                        int i65 = 1 << (i64 >>> 20);
                        int i66 = 1048575;
                        int i67 = i64 & 1048575;
                        if (i67 != i57) {
                            if (i57 != 1048575) {
                                unsafe6.putInt(obj3, i57, i55);
                                i66 = 1048575;
                            }
                            i21 = i67 == i66 ? 0 : unsafe6.getInt(obj3, i67);
                            i22 = i67;
                        } else {
                            i21 = i55;
                            i22 = i57;
                        }
                        switch (zzt) {
                            case 0:
                                zzgvmVar2 = zzgvmVar;
                                i23 = i60;
                                z4 = true;
                                i17 = -1;
                                i24 = i63;
                                if (i61 == 1) {
                                    i25 = i58 + 8;
                                    i21 |= i65;
                                    zzhad.zzr(obj3, j3, Double.longBitsToDouble(zzgvn.zzn(bArr2, i58)));
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i53 = i23;
                                    i51 = i17;
                                    i52 = i25;
                                    i57 = i22;
                                    i55 = i21;
                                    i50 = 3;
                                    break;
                                } else {
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 1:
                                zzgvmVar2 = zzgvmVar;
                                i23 = i60;
                                z4 = true;
                                i17 = -1;
                                i24 = i63;
                                if (i61 == 5) {
                                    i25 = i58 + 4;
                                    i21 |= i65;
                                    zzhad.zzs(obj3, j3, Float.intBitsToFloat(zzgvn.zzb(bArr2, i58)));
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i53 = i23;
                                    i51 = i17;
                                    i52 = i25;
                                    i57 = i22;
                                    i55 = i21;
                                    i50 = 3;
                                    break;
                                } else {
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 2:
                            case 3:
                                zzgvmVar2 = zzgvmVar;
                                i23 = i60;
                                i17 = -1;
                                i24 = i63;
                                if (i61 == 0) {
                                    i26 = i21 | i65;
                                    int zzk = zzgvn.zzk(bArr2, i58, zzgvmVar2);
                                    unsafe6.putLong(obj, j3, zzgvmVar2.zzb);
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i52 = zzk;
                                    i57 = i22;
                                    i51 = -1;
                                    i50 = 3;
                                    i55 = i26;
                                    i53 = i23;
                                    break;
                                } else {
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 4:
                            case 11:
                                zzgvmVar2 = zzgvmVar;
                                i23 = i60;
                                z7 = true;
                                i17 = -1;
                                i24 = i63;
                                if (i61 == 0) {
                                    i27 = i21 | i65;
                                    zzh = zzgvn.zzh(bArr2, i58, zzgvmVar2);
                                    unsafe6.putInt(obj3, j3, zzgvmVar2.zza);
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i53 = i23;
                                    i51 = i17;
                                    i52 = zzh;
                                    i50 = 3;
                                    i28 = i22;
                                    i55 = i27;
                                    i57 = i28;
                                    break;
                                } else {
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 5:
                            case 14:
                                zzgvmVar2 = zzgvmVar;
                                i23 = i60;
                                i17 = -1;
                                i24 = i63;
                                if (i61 == 1) {
                                    int i68 = i65 | i21;
                                    unsafe6.putLong(obj, j3, zzgvn.zzn(bArr2, i58));
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i52 = i58 + 8;
                                    i56 = i24;
                                    i57 = i22;
                                    i53 = i23;
                                    i50 = 3;
                                    i55 = i68;
                                    i51 = -1;
                                    break;
                                } else {
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 6:
                            case 13:
                                zzgvmVar2 = zzgvmVar;
                                i23 = i60;
                                z4 = true;
                                i17 = -1;
                                i24 = i63;
                                if (i61 == 5) {
                                    i25 = i58 + 4;
                                    i21 |= i65;
                                    unsafe6.putInt(obj3, j3, zzgvn.zzb(bArr2, i58));
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i53 = i23;
                                    i51 = i17;
                                    i52 = i25;
                                    i57 = i22;
                                    i55 = i21;
                                    i50 = 3;
                                    break;
                                } else {
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 7:
                                zzgvmVar2 = zzgvmVar;
                                i23 = i60;
                                z7 = true;
                                i17 = -1;
                                i24 = i63;
                                if (i61 == 0) {
                                    i27 = i21 | i65;
                                    zzh = zzgvn.zzk(bArr2, i58, zzgvmVar2);
                                    zzhad.zzp(obj3, j3, zzgvmVar2.zzb != 0);
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i53 = i23;
                                    i51 = i17;
                                    i52 = zzh;
                                    i50 = 3;
                                    i28 = i22;
                                    i55 = i27;
                                    i57 = i28;
                                    break;
                                } else {
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 8:
                                zzgvmVar2 = zzgvmVar;
                                z4 = true;
                                i17 = -1;
                                i23 = i60;
                                i24 = i63;
                                if (i61 == 2) {
                                    if (zzM(i62)) {
                                        i25 = zzgvn.zzh(bArr2, i58, zzgvmVar2);
                                        int i69 = zzgvmVar2.zza;
                                        if (i69 < 0) {
                                            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i21 |= i65;
                                        if (i69 == 0) {
                                            zzgvmVar2.zzc = "";
                                        } else {
                                            zzgvmVar2.zzc = zzhai.zzh(bArr2, i25, i69);
                                            i25 += i69;
                                        }
                                    } else {
                                        int i70 = i21 | i65;
                                        int zzh4 = zzgvn.zzh(bArr2, i58, zzgvmVar2);
                                        int i71 = zzgvmVar2.zza;
                                        if (i71 < 0) {
                                            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i71 == 0) {
                                            zzgvmVar2.zzc = "";
                                        } else {
                                            zzgvmVar2.zzc = new String(bArr2, zzh4, i71, zzgxt.zza);
                                            zzh4 += i71;
                                        }
                                        int i72 = zzh4;
                                        i21 = i70;
                                        i25 = i72;
                                    }
                                    unsafe6.putObject(obj3, j3, zzgvmVar2.zzc);
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i53 = i23;
                                    i51 = i17;
                                    i52 = i25;
                                    i57 = i22;
                                    i55 = i21;
                                    i50 = 3;
                                    break;
                                } else {
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 9:
                                zzgvmVar2 = zzgvmVar;
                                unsafe2 = unsafe6;
                                i17 = -1;
                                i23 = i60;
                                i24 = i63;
                                if (i61 == 2) {
                                    i26 = i21 | i65;
                                    Object zzA = zzgyuVar.zzA(obj3, i54);
                                    unsafe6 = unsafe2;
                                    i48 = i8;
                                    int zzm = zzgvn.zzm(zzA, zzgyuVar.zzx(i54), bArr, i58, i48, zzgvmVar);
                                    zzgyuVar.zzJ(obj3, i54, zzA);
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i51 = -1;
                                    i50 = 3;
                                    i52 = zzm;
                                    i57 = i22;
                                    i55 = i26;
                                    i53 = i23;
                                    break;
                                } else {
                                    unsafe6 = unsafe2;
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 10:
                                zzgvmVar2 = zzgvmVar;
                                unsafe2 = unsafe6;
                                i17 = -1;
                                i23 = i60;
                                i24 = i63;
                                if (i61 == 2) {
                                    int i73 = i21 | i65;
                                    bArr2 = bArr;
                                    int zza3 = zzgvn.zza(bArr2, i58, zzgvmVar2);
                                    unsafe2.putObject(obj3, j3, zzgvmVar2.zzc);
                                    i48 = i8;
                                    i49 = i9;
                                    unsafe6 = unsafe2;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i57 = i22;
                                    i53 = i23;
                                    i51 = -1;
                                    i55 = i73;
                                    i52 = zza3;
                                    i50 = 3;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    unsafe6 = unsafe2;
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 12:
                                zzgvmVar2 = zzgvmVar;
                                unsafe2 = unsafe6;
                                z4 = true;
                                i17 = -1;
                                i23 = i60;
                                i24 = i63;
                                if (i61 == 0) {
                                    i25 = zzgvn.zzh(bArr2, i58, zzgvmVar2);
                                    int i74 = zzgvmVar2.zza;
                                    zzgxm zzw = zzgyuVar.zzw(i54);
                                    if ((i62 & Integer.MIN_VALUE) == 0 || zzw == null || zzw.zza(i74)) {
                                        i21 |= i65;
                                        unsafe2.putInt(obj3, j3, i74);
                                    } else {
                                        zzd(obj).zzj(i24, Long.valueOf(i74));
                                    }
                                    bArr2 = bArr;
                                    i48 = i8;
                                    i49 = i9;
                                    unsafe6 = unsafe2;
                                    zzgvmVar6 = zzgvmVar2;
                                    i56 = i24;
                                    i53 = i23;
                                    i51 = i17;
                                    i52 = i25;
                                    i57 = i22;
                                    i55 = i21;
                                    i50 = 3;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    unsafe6 = unsafe2;
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 15:
                                zzgvmVar2 = zzgvmVar;
                                z7 = true;
                                i17 = -1;
                                i24 = i63;
                                Unsafe unsafe7 = unsafe6;
                                i23 = i60;
                                if (i61 == 0) {
                                    i27 = i21 | i65;
                                    zzh = zzgvn.zzh(bArr2, i58, zzgvmVar2);
                                    unsafe7.putInt(obj3, j3, zzgwe.zzD(zzgvmVar2.zza));
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    unsafe6 = unsafe7;
                                    i56 = i24;
                                    i53 = i23;
                                    i51 = i17;
                                    i52 = zzh;
                                    i50 = 3;
                                    i28 = i22;
                                    i55 = i27;
                                    i57 = i28;
                                    break;
                                } else {
                                    unsafe6 = unsafe7;
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            case 16:
                                i17 = -1;
                                i24 = i63;
                                Unsafe unsafe8 = unsafe6;
                                if (i61 == 0) {
                                    int i75 = i21 | i65;
                                    int zzk2 = zzgvn.zzk(bArr2, i58, zzgvmVar);
                                    unsafe8.putLong(obj, j3, zzgwe.zzF(zzgvmVar.zzb));
                                    unsafe6 = unsafe8;
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar;
                                    i56 = i24;
                                    i53 = i60;
                                    i51 = -1;
                                    i50 = 3;
                                    i28 = i22;
                                    i55 = i75;
                                    i52 = zzk2;
                                    i57 = i28;
                                    break;
                                } else {
                                    i23 = i60;
                                    unsafe6 = unsafe8;
                                    zzgvmVar2 = zzgvmVar;
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                            default:
                                if (i61 == 3) {
                                    int i76 = i21 | i65;
                                    Object zzA2 = zzgyuVar.zzA(obj3, i54);
                                    i52 = zzgvn.zzl(zzA2, zzgyuVar.zzx(i54), bArr, i58, i8, (i60 << 3) | 4, zzgvmVar);
                                    zzgyuVar.zzJ(obj3, i54, zzA2);
                                    unsafe6 = unsafe6;
                                    i50 = 3;
                                    i53 = i60;
                                    i56 = i63;
                                    i54 = i54;
                                    i57 = i22;
                                    i51 = -1;
                                    i48 = i8;
                                    i49 = i9;
                                    zzgvmVar6 = zzgvmVar;
                                    i55 = i76;
                                    break;
                                } else {
                                    i17 = -1;
                                    zzgvmVar2 = zzgvmVar;
                                    i23 = i60;
                                    i24 = i63;
                                    i11 = i9;
                                    zzgvmVar6 = zzgvmVar2;
                                    i15 = i24;
                                    unsafe = unsafe6;
                                    i57 = i22;
                                    i55 = i21;
                                    i18 = i54;
                                    i16 = i23;
                                    i14 = 3;
                                    break;
                                }
                        }
                    } else {
                        int i77 = i60;
                        i17 = -1;
                        if (zzt != 27) {
                            i29 = i57;
                            Unsafe unsafe9 = unsafe6;
                            if (zzt <= 49) {
                                long j7 = i62;
                                Unsafe unsafe10 = zzb;
                                zzgxs zzgxsVar = (zzgxs) unsafe10.getObject(obj3, j3);
                                if (zzgxsVar.zzc()) {
                                    j = j7;
                                } else {
                                    int size = zzgxsVar.size();
                                    j = j7;
                                    zzgxs zzf2 = zzgxsVar.zzf(size + size);
                                    unsafe10.putObject(obj3, j3, zzf2);
                                    zzgxsVar = zzf2;
                                }
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        i38 = i58;
                                        i39 = i77;
                                        i40 = i63;
                                        zzgvmVar5 = zzgvmVar;
                                        i18 = i54;
                                        z8 = true;
                                        unsafe4 = unsafe9;
                                        i41 = i8;
                                        if (i61 == 2) {
                                            zzgwn zzgwnVar = (zzgwn) zzgxsVar;
                                            zzh2 = zzgvn.zzh(bArr2, i38, zzgvmVar5);
                                            int i78 = zzgvmVar5.zza;
                                            int i79 = zzh2 + i78;
                                            if (i79 > bArr2.length) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgwnVar.zzi((i78 / 8) + zzgwnVar.size());
                                            while (zzh2 < i79) {
                                                zzgwnVar.zzh(Double.longBitsToDouble(zzgvn.zzn(bArr2, zzh2)));
                                                zzh2 += 8;
                                            }
                                            if (zzh2 != i79) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (zzh2 == i38) {
                                                obj3 = obj;
                                                i49 = i9;
                                                zzgvmVar6 = zzgvmVar5;
                                                i48 = i41;
                                                i56 = i40;
                                                i54 = i18;
                                                i53 = i39;
                                                i51 = -1;
                                                i57 = i29;
                                                i50 = 3;
                                                zzgyuVar = this;
                                                Unsafe unsafe11 = unsafe4;
                                                i52 = zzh2;
                                                unsafe6 = unsafe11;
                                                break;
                                            } else {
                                                obj3 = obj;
                                                i11 = i9;
                                                i58 = zzh2;
                                                zzgvmVar6 = zzgvmVar5;
                                                unsafe = unsafe4;
                                                i15 = i40;
                                                i16 = i39;
                                                i57 = i29;
                                                i14 = 3;
                                                zzgyuVar = this;
                                                break;
                                            }
                                        } else {
                                            if (i61 == 1) {
                                                i42 = i38 + 8;
                                                zzgwn zzgwnVar2 = (zzgwn) zzgxsVar;
                                                zzgwnVar2.zzh(Double.longBitsToDouble(zzgvn.zzn(bArr2, i38)));
                                                while (i42 < i41) {
                                                    int zzh5 = zzgvn.zzh(bArr2, i42, zzgvmVar5);
                                                    if (i40 == zzgvmVar5.zza) {
                                                        zzgwnVar2.zzh(Double.longBitsToDouble(zzgvn.zzn(bArr2, zzh5)));
                                                        i42 = zzh5 + 8;
                                                    } else {
                                                        zzh2 = i42;
                                                        if (zzh2 == i38) {
                                                        }
                                                    }
                                                }
                                                zzh2 = i42;
                                                if (zzh2 == i38) {
                                                }
                                            }
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        i38 = i58;
                                        i39 = i77;
                                        i40 = i63;
                                        zzgvmVar5 = zzgvmVar;
                                        i18 = i54;
                                        z8 = true;
                                        unsafe4 = unsafe9;
                                        i41 = i8;
                                        if (i61 == 2) {
                                            zzgwx zzgwxVar = (zzgwx) zzgxsVar;
                                            zzh2 = zzgvn.zzh(bArr2, i38, zzgvmVar5);
                                            int i80 = zzgvmVar5.zza;
                                            int i81 = zzh2 + i80;
                                            if (i81 > bArr2.length) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgwxVar.zzi((i80 / 4) + zzgwxVar.size());
                                            while (zzh2 < i81) {
                                                zzgwxVar.zzh(Float.intBitsToFloat(zzgvn.zzb(bArr2, zzh2)));
                                                zzh2 += 4;
                                            }
                                            if (zzh2 != i81) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (zzh2 == i38) {
                                            }
                                        } else {
                                            if (i61 == 5) {
                                                i42 = i38 + 4;
                                                zzgwx zzgwxVar2 = (zzgwx) zzgxsVar;
                                                zzgwxVar2.zzh(Float.intBitsToFloat(zzgvn.zzb(bArr2, i38)));
                                                while (i42 < i41) {
                                                    int zzh6 = zzgvn.zzh(bArr2, i42, zzgvmVar5);
                                                    if (i40 == zzgvmVar5.zza) {
                                                        zzgwxVar2.zzh(Float.intBitsToFloat(zzgvn.zzb(bArr2, zzh6)));
                                                        i42 = zzh6 + 4;
                                                    } else {
                                                        zzh2 = i42;
                                                        if (zzh2 == i38) {
                                                        }
                                                    }
                                                }
                                                zzh2 = i42;
                                                if (zzh2 == i38) {
                                                }
                                            }
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case zzbbd.zzt.zzm /* 21 */:
                                    case 37:
                                    case 38:
                                        i38 = i58;
                                        int i82 = i77;
                                        i40 = i63;
                                        zzgvmVar5 = zzgvmVar;
                                        i18 = i54;
                                        z8 = true;
                                        unsafe4 = unsafe9;
                                        i41 = i8;
                                        if (i61 == 2) {
                                            zzgyg zzgygVar = (zzgyg) zzgxsVar;
                                            zzh2 = zzgvn.zzh(bArr2, i38, zzgvmVar5);
                                            int i83 = zzgvmVar5.zza + zzh2;
                                            while (zzh2 < i83) {
                                                zzh2 = zzgvn.zzk(bArr2, zzh2, zzgvmVar5);
                                                zzgygVar.zzg(zzgvmVar5.zzb);
                                                i82 = i82;
                                            }
                                            i39 = i82;
                                            if (zzh2 != i83) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            i39 = i82;
                                            if (i61 == 0) {
                                                zzgyg zzgygVar2 = (zzgyg) zzgxsVar;
                                                zzh2 = zzgvn.zzk(bArr2, i38, zzgvmVar5);
                                                zzgygVar2.zzg(zzgvmVar5.zzb);
                                                while (zzh2 < i41) {
                                                    int zzh7 = zzgvn.zzh(bArr2, zzh2, zzgvmVar5);
                                                    if (i40 == zzgvmVar5.zza) {
                                                        zzh2 = zzgvn.zzk(bArr2, zzh7, zzgvmVar5);
                                                        zzgygVar2.zzg(zzgvmVar5.zzb);
                                                    }
                                                }
                                            }
                                            zzh2 = i38;
                                        }
                                        if (zzh2 == i38) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe5 = unsafe9;
                                        i38 = i58;
                                        i39 = i77;
                                        i43 = i63;
                                        zzgvmVar5 = zzgvmVar;
                                        i44 = i54;
                                        z8 = true;
                                        i45 = i8;
                                        if (i61 == 2) {
                                            zzf = zzgvn.zzf(bArr2, i38, zzgxsVar, zzgvmVar5);
                                            i18 = i44;
                                            zzh2 = zzf;
                                            unsafe4 = unsafe5;
                                            i41 = i45;
                                            i40 = i43;
                                            if (zzh2 == i38) {
                                            }
                                        } else {
                                            if (i61 == 0) {
                                                i18 = i44;
                                                unsafe4 = unsafe5;
                                                i41 = i45;
                                                i40 = i43;
                                                zzh2 = zzgvn.zzj(i43, bArr, i38, i8, zzgxsVar, zzgvmVar);
                                                if (zzh2 == i38) {
                                                }
                                            }
                                            i18 = i44;
                                            unsafe4 = unsafe5;
                                            i41 = i45;
                                            i40 = i43;
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        unsafe5 = unsafe9;
                                        i38 = i58;
                                        i39 = i77;
                                        i43 = i63;
                                        zzgvmVar5 = zzgvmVar;
                                        i44 = i54;
                                        i45 = i8;
                                        if (i61 == 2) {
                                            zzgyg zzgygVar3 = (zzgyg) zzgxsVar;
                                            zzh3 = zzgvn.zzh(bArr2, i38, zzgvmVar5);
                                            int i84 = zzgvmVar5.zza;
                                            int i85 = zzh3 + i84;
                                            if (i85 > bArr2.length) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgygVar3.zzi((i84 / 8) + zzgygVar3.size());
                                            while (zzh3 < i85) {
                                                zzgygVar3.zzg(zzgvn.zzn(bArr2, zzh3));
                                                zzh3 += 8;
                                            }
                                            if (zzh3 != i85) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i18 = i44;
                                            i41 = i45;
                                            i40 = i43;
                                            zzh2 = zzh3;
                                            z8 = true;
                                            unsafe4 = unsafe5;
                                            if (zzh2 == i38) {
                                            }
                                        } else {
                                            z8 = true;
                                            if (i61 == 1) {
                                                zzf = i38 + 8;
                                                zzgyg zzgygVar4 = (zzgyg) zzgxsVar;
                                                zzgygVar4.zzg(zzgvn.zzn(bArr2, i38));
                                                while (zzf < i45) {
                                                    int zzh8 = zzgvn.zzh(bArr2, zzf, zzgvmVar5);
                                                    if (i43 == zzgvmVar5.zza) {
                                                        zzgygVar4.zzg(zzgvn.zzn(bArr2, zzh8));
                                                        zzf = zzh8 + 8;
                                                    } else {
                                                        i18 = i44;
                                                        zzh2 = zzf;
                                                        unsafe4 = unsafe5;
                                                        i41 = i45;
                                                        i40 = i43;
                                                        if (zzh2 == i38) {
                                                        }
                                                    }
                                                }
                                                i18 = i44;
                                                zzh2 = zzf;
                                                unsafe4 = unsafe5;
                                                i41 = i45;
                                                i40 = i43;
                                                if (zzh2 == i38) {
                                                }
                                            }
                                            i18 = i44;
                                            unsafe4 = unsafe5;
                                            i41 = i45;
                                            i40 = i43;
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe5 = unsafe9;
                                        i38 = i58;
                                        i39 = i77;
                                        i43 = i63;
                                        zzgvmVar5 = zzgvmVar;
                                        i44 = i54;
                                        i45 = i8;
                                        if (i61 == 2) {
                                            zzgxh zzgxhVar = (zzgxh) zzgxsVar;
                                            zzh3 = zzgvn.zzh(bArr2, i38, zzgvmVar5);
                                            int i86 = zzgvmVar5.zza;
                                            int i87 = zzh3 + i86;
                                            if (i87 > bArr2.length) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgxhVar.zzj((i86 / 4) + zzgxhVar.size());
                                            while (zzh3 < i87) {
                                                zzgxhVar.zzi(zzgvn.zzb(bArr2, zzh3));
                                                zzh3 += 4;
                                            }
                                            if (zzh3 != i87) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i18 = i44;
                                            i41 = i45;
                                            i40 = i43;
                                            zzh2 = zzh3;
                                            z8 = true;
                                            unsafe4 = unsafe5;
                                            if (zzh2 == i38) {
                                            }
                                        } else {
                                            if (i61 == 5) {
                                                i46 = i38 + 4;
                                                zzgxh zzgxhVar2 = (zzgxh) zzgxsVar;
                                                zzgxhVar2.zzi(zzgvn.zzb(bArr2, i38));
                                                while (i46 < i45) {
                                                    int zzh9 = zzgvn.zzh(bArr2, i46, zzgvmVar5);
                                                    if (i43 == zzgvmVar5.zza) {
                                                        zzgxhVar2.zzi(zzgvn.zzb(bArr2, zzh9));
                                                        i46 = zzh9 + 4;
                                                    } else {
                                                        i18 = i44;
                                                        zzh2 = i46;
                                                        unsafe4 = unsafe5;
                                                        i41 = i45;
                                                        i40 = i43;
                                                        z8 = true;
                                                        if (zzh2 == i38) {
                                                        }
                                                    }
                                                }
                                                i18 = i44;
                                                zzh2 = i46;
                                                unsafe4 = unsafe5;
                                                i41 = i45;
                                                i40 = i43;
                                                z8 = true;
                                                if (zzh2 == i38) {
                                                }
                                            }
                                            i18 = i44;
                                            unsafe4 = unsafe5;
                                            i41 = i45;
                                            i40 = i43;
                                            z8 = true;
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe5 = unsafe9;
                                        i38 = i58;
                                        i39 = i77;
                                        i43 = i63;
                                        zzgvmVar5 = zzgvmVar;
                                        i44 = i54;
                                        i45 = i8;
                                        if (i61 == 2) {
                                            zzgvo zzgvoVar = (zzgvo) zzgxsVar;
                                            zzh3 = zzgvn.zzh(bArr2, i38, zzgvmVar5);
                                            int i88 = zzgvmVar5.zza + zzh3;
                                            while (zzh3 < i88) {
                                                zzh3 = zzgvn.zzk(bArr2, zzh3, zzgvmVar5);
                                                zzgvoVar.zzg(zzgvmVar5.zzb != 0);
                                            }
                                            if (zzh3 != i88) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i18 = i44;
                                            i41 = i45;
                                            i40 = i43;
                                            zzh2 = zzh3;
                                            z8 = true;
                                            unsafe4 = unsafe5;
                                            if (zzh2 == i38) {
                                            }
                                        } else {
                                            if (i61 == 0) {
                                                zzgvo zzgvoVar2 = (zzgvo) zzgxsVar;
                                                i46 = zzgvn.zzk(bArr2, i38, zzgvmVar5);
                                                zzgvoVar2.zzg(zzgvmVar5.zzb != 0);
                                                while (i46 < i45) {
                                                    int zzh10 = zzgvn.zzh(bArr2, i46, zzgvmVar5);
                                                    if (i43 == zzgvmVar5.zza) {
                                                        i46 = zzgvn.zzk(bArr2, zzh10, zzgvmVar5);
                                                        zzgvoVar2.zzg(zzgvmVar5.zzb != 0);
                                                    } else {
                                                        i18 = i44;
                                                        zzh2 = i46;
                                                        unsafe4 = unsafe5;
                                                        i41 = i45;
                                                        i40 = i43;
                                                        z8 = true;
                                                        if (zzh2 == i38) {
                                                        }
                                                    }
                                                }
                                                i18 = i44;
                                                zzh2 = i46;
                                                unsafe4 = unsafe5;
                                                i41 = i45;
                                                i40 = i43;
                                                z8 = true;
                                                if (zzh2 == i38) {
                                                }
                                            }
                                            i18 = i44;
                                            unsafe4 = unsafe5;
                                            i41 = i45;
                                            i40 = i43;
                                            z8 = true;
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        unsafe5 = unsafe9;
                                        i38 = i58;
                                        i39 = i77;
                                        i43 = i63;
                                        zzgvmVar5 = zzgvmVar;
                                        i44 = i54;
                                        i45 = i8;
                                        if (i61 == 2) {
                                            if ((j & 536870912) == 0) {
                                                zzh3 = zzgvn.zzh(bArr2, i38, zzgvmVar5);
                                                int i89 = zzgvmVar5.zza;
                                                if (i89 < 0) {
                                                    throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i89 == 0) {
                                                    obj2 = "";
                                                    zzgxsVar.add(obj2);
                                                } else {
                                                    obj2 = "";
                                                    zzgxsVar.add(new String(bArr2, zzh3, i89, zzgxt.zza));
                                                    zzh3 += i89;
                                                }
                                                while (zzh3 < i45) {
                                                    int zzh11 = zzgvn.zzh(bArr2, zzh3, zzgvmVar5);
                                                    if (i43 == zzgvmVar5.zza) {
                                                        zzh3 = zzgvn.zzh(bArr2, zzh11, zzgvmVar5);
                                                        int i90 = zzgvmVar5.zza;
                                                        if (i90 < 0) {
                                                            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i90 == 0) {
                                                            zzgxsVar.add(obj2);
                                                        } else {
                                                            zzgxsVar.add(new String(bArr2, zzh3, i90, zzgxt.zza));
                                                            zzh3 += i90;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzh3 = zzgvn.zzh(bArr2, i38, zzgvmVar5);
                                                int i91 = zzgvmVar5.zza;
                                                if (i91 < 0) {
                                                    throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i91 == 0) {
                                                    zzgxsVar.add("");
                                                } else {
                                                    int i92 = zzh3 + i91;
                                                    if (!zzhai.zzi(bArr2, zzh3, i92)) {
                                                        throw new zzgxv("Protocol message had invalid UTF-8.");
                                                    }
                                                    zzgxsVar.add(new String(bArr2, zzh3, i91, zzgxt.zza));
                                                    zzh3 = i92;
                                                }
                                                while (zzh3 < i45) {
                                                    int zzh12 = zzgvn.zzh(bArr2, zzh3, zzgvmVar5);
                                                    if (i43 == zzgvmVar5.zza) {
                                                        zzh3 = zzgvn.zzh(bArr2, zzh12, zzgvmVar5);
                                                        int i93 = zzgvmVar5.zza;
                                                        if (i93 < 0) {
                                                            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i93 == 0) {
                                                            zzgxsVar.add("");
                                                        } else {
                                                            int i94 = zzh3 + i93;
                                                            if (!zzhai.zzi(bArr2, zzh3, i94)) {
                                                                throw new zzgxv("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzgxsVar.add(new String(bArr2, zzh3, i93, zzgxt.zza));
                                                            zzh3 = i94;
                                                        }
                                                    }
                                                }
                                            }
                                            i18 = i44;
                                            i41 = i45;
                                            i40 = i43;
                                            zzh2 = zzh3;
                                            z8 = true;
                                            unsafe4 = unsafe5;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        i18 = i44;
                                        unsafe4 = unsafe5;
                                        i41 = i45;
                                        i40 = i43;
                                        z8 = true;
                                        zzh2 = i38;
                                        if (zzh2 == i38) {
                                        }
                                        break;
                                    case 27:
                                        i47 = i8;
                                        i38 = i58;
                                        if (i61 == 2) {
                                            zzgzk zzx = zzgyuVar.zzx(i54);
                                            i43 = i63;
                                            unsafe5 = unsafe9;
                                            i45 = i47;
                                            zzgvmVar5 = zzgvmVar;
                                            i39 = i77;
                                            i44 = i54;
                                            zzh3 = zzgvn.zze(zzx, i63, bArr, i38, i8, zzgxsVar, zzgvmVar);
                                            i18 = i44;
                                            i41 = i45;
                                            i40 = i43;
                                            zzh2 = zzh3;
                                            z8 = true;
                                            unsafe4 = unsafe5;
                                            if (zzh2 == i38) {
                                            }
                                        } else {
                                            zzgvmVar5 = zzgvmVar;
                                            i39 = i77;
                                            i18 = i54;
                                            z8 = true;
                                            unsafe4 = unsafe9;
                                            int i95 = i47;
                                            i40 = i63;
                                            i41 = i95;
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        i47 = i8;
                                        i38 = i58;
                                        if (i61 == 2) {
                                            zzh2 = zzgvn.zzh(bArr2, i38, zzgvmVar);
                                            int i96 = zzgvmVar.zza;
                                            if (i96 < 0) {
                                                throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i96 > bArr2.length - zzh2) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i96 == 0) {
                                                zzgxsVar.add(zzgvy.zzb);
                                            } else {
                                                zzgxsVar.add(zzgvy.zzv(bArr2, zzh2, i96));
                                                zzh2 += i96;
                                            }
                                            while (zzh2 < i47) {
                                                int zzh13 = zzgvn.zzh(bArr2, zzh2, zzgvmVar);
                                                if (i63 == zzgvmVar.zza) {
                                                    zzh2 = zzgvn.zzh(bArr2, zzh13, zzgvmVar);
                                                    int i97 = zzgvmVar.zza;
                                                    if (i97 < 0) {
                                                        throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i97 > bArr2.length - zzh2) {
                                                        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i97 == 0) {
                                                        zzgxsVar.add(zzgvy.zzb);
                                                    } else {
                                                        zzgxsVar.add(zzgvy.zzv(bArr2, zzh2, i97));
                                                        zzh2 += i97;
                                                    }
                                                } else {
                                                    i39 = i77;
                                                    zzgvmVar5 = zzgvmVar;
                                                    i18 = i54;
                                                    z8 = true;
                                                    unsafe4 = unsafe9;
                                                    int i98 = i47;
                                                    i40 = i63;
                                                    i41 = i98;
                                                    if (zzh2 == i38) {
                                                    }
                                                }
                                            }
                                            i39 = i77;
                                            zzgvmVar5 = zzgvmVar;
                                            i18 = i54;
                                            z8 = true;
                                            unsafe4 = unsafe9;
                                            int i982 = i47;
                                            i40 = i63;
                                            i41 = i982;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        i39 = i77;
                                        zzgvmVar5 = zzgvmVar;
                                        i18 = i54;
                                        z8 = true;
                                        unsafe4 = unsafe9;
                                        int i952 = i47;
                                        i40 = i63;
                                        i41 = i952;
                                        zzh2 = i38;
                                        if (zzh2 == i38) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i47 = i8;
                                        i38 = i58;
                                        if (i61 == 2) {
                                            zzj = zzgvn.zzf(bArr2, i38, zzgxsVar, zzgvmVar);
                                        } else {
                                            if (i61 == 0) {
                                                zzj = zzgvn.zzj(i63, bArr, i38, i8, zzgxsVar, zzgvmVar);
                                            }
                                            i39 = i77;
                                            zzgvmVar5 = zzgvmVar;
                                            i18 = i54;
                                            z8 = true;
                                            unsafe4 = unsafe9;
                                            int i9522 = i47;
                                            i40 = i63;
                                            i41 = i9522;
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        int i99 = zzj;
                                        zzgzm.zzn(obj, i77, zzgxsVar, zzgyuVar.zzw(i54), null, zzgyuVar.zzm);
                                        i39 = i77;
                                        zzh2 = i99;
                                        zzgvmVar5 = zzgvmVar;
                                        i18 = i54;
                                        z8 = true;
                                        unsafe4 = unsafe9;
                                        int i9822 = i47;
                                        i40 = i63;
                                        i41 = i9822;
                                        if (zzh2 == i38) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i47 = i8;
                                        i38 = i58;
                                        if (i61 == 2) {
                                            zzgxh zzgxhVar3 = (zzgxh) zzgxsVar;
                                            zzh2 = zzgvn.zzh(bArr2, i38, zzgvmVar);
                                            int i100 = zzgvmVar.zza + zzh2;
                                            while (zzh2 < i100) {
                                                zzh2 = zzgvn.zzh(bArr2, zzh2, zzgvmVar);
                                                zzgxhVar3.zzi(zzgwe.zzD(zzgvmVar.zza));
                                            }
                                            if (zzh2 != i100) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i61 == 0) {
                                                zzgxh zzgxhVar4 = (zzgxh) zzgxsVar;
                                                zzh2 = zzgvn.zzh(bArr2, i38, zzgvmVar);
                                                zzgxhVar4.zzi(zzgwe.zzD(zzgvmVar.zza));
                                                while (zzh2 < i47) {
                                                    int zzh14 = zzgvn.zzh(bArr2, zzh2, zzgvmVar);
                                                    if (i63 == zzgvmVar.zza) {
                                                        zzh2 = zzgvn.zzh(bArr2, zzh14, zzgvmVar);
                                                        zzgxhVar4.zzi(zzgwe.zzD(zzgvmVar.zza));
                                                    }
                                                }
                                            }
                                            i39 = i77;
                                            zzgvmVar5 = zzgvmVar;
                                            i18 = i54;
                                            z8 = true;
                                            unsafe4 = unsafe9;
                                            int i95222 = i47;
                                            i40 = i63;
                                            i41 = i95222;
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        i39 = i77;
                                        zzgvmVar5 = zzgvmVar;
                                        i18 = i54;
                                        z8 = true;
                                        unsafe4 = unsafe9;
                                        int i98222 = i47;
                                        i40 = i63;
                                        i41 = i98222;
                                        if (zzh2 == i38) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i47 = i8;
                                        i38 = i58;
                                        if (i61 == 2) {
                                            zzgyg zzgygVar5 = (zzgyg) zzgxsVar;
                                            zzh2 = zzgvn.zzh(bArr2, i38, zzgvmVar);
                                            int i101 = zzgvmVar.zza + zzh2;
                                            while (zzh2 < i101) {
                                                zzh2 = zzgvn.zzk(bArr2, zzh2, zzgvmVar);
                                                zzgygVar5.zzg(zzgwe.zzF(zzgvmVar.zzb));
                                            }
                                            if (zzh2 != i101) {
                                                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            if (i61 == 0) {
                                                zzgyg zzgygVar6 = (zzgyg) zzgxsVar;
                                                zzh2 = zzgvn.zzk(bArr2, i38, zzgvmVar);
                                                zzgygVar6.zzg(zzgwe.zzF(zzgvmVar.zzb));
                                                while (zzh2 < i47) {
                                                    int zzh15 = zzgvn.zzh(bArr2, zzh2, zzgvmVar);
                                                    if (i63 == zzgvmVar.zza) {
                                                        zzh2 = zzgvn.zzk(bArr2, zzh15, zzgvmVar);
                                                        zzgygVar6.zzg(zzgwe.zzF(zzgvmVar.zzb));
                                                    }
                                                }
                                            }
                                            i39 = i77;
                                            zzgvmVar5 = zzgvmVar;
                                            i18 = i54;
                                            z8 = true;
                                            unsafe4 = unsafe9;
                                            int i952222 = i47;
                                            i40 = i63;
                                            i41 = i952222;
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        i39 = i77;
                                        zzgvmVar5 = zzgvmVar;
                                        i18 = i54;
                                        z8 = true;
                                        unsafe4 = unsafe9;
                                        int i982222 = i47;
                                        i40 = i63;
                                        i41 = i982222;
                                        if (zzh2 == i38) {
                                        }
                                        break;
                                    default:
                                        if (i61 == 3) {
                                            int i102 = (i63 & (-8)) | 4;
                                            zzgzk zzx2 = zzgyuVar.zzx(i54);
                                            i38 = i58;
                                            zzh2 = zzgvn.zzc(zzx2, bArr, i58, i8, i102, zzgvmVar);
                                            zzgxsVar.add(zzgvmVar.zzc);
                                            for (int i103 = i8; zzh2 < i103; i103 = i103) {
                                                int zzh16 = zzgvn.zzh(bArr2, zzh2, zzgvmVar);
                                                if (i63 == zzgvmVar.zza) {
                                                    zzh2 = zzgvn.zzc(zzx2, bArr, zzh16, i8, i102, zzgvmVar);
                                                    zzgxsVar.add(zzgvmVar.zzc);
                                                } else {
                                                    i47 = i103;
                                                    i39 = i77;
                                                    zzgvmVar5 = zzgvmVar;
                                                    i18 = i54;
                                                    z8 = true;
                                                    unsafe4 = unsafe9;
                                                    int i9822222 = i47;
                                                    i40 = i63;
                                                    i41 = i9822222;
                                                    if (zzh2 == i38) {
                                                    }
                                                }
                                            }
                                            i47 = i103;
                                            i39 = i77;
                                            zzgvmVar5 = zzgvmVar;
                                            i18 = i54;
                                            z8 = true;
                                            unsafe4 = unsafe9;
                                            int i98222222 = i47;
                                            i40 = i63;
                                            i41 = i98222222;
                                            if (zzh2 == i38) {
                                            }
                                        } else {
                                            i38 = i58;
                                            i39 = i77;
                                            i40 = i63;
                                            zzgvmVar5 = zzgvmVar;
                                            i18 = i54;
                                            z8 = true;
                                            unsafe4 = unsafe9;
                                            i41 = i8;
                                            zzh2 = i38;
                                            if (zzh2 == i38) {
                                            }
                                        }
                                        break;
                                }
                            } else {
                                int i104 = i58;
                                i77 = i77;
                                i31 = i63;
                                i18 = i54;
                                unsafe3 = unsafe9;
                                if (zzt != 50) {
                                    zzgyuVar = this;
                                    obj3 = obj;
                                    Unsafe unsafe12 = zzb;
                                    long j8 = iArr[i18 + 2] & 1048575;
                                    switch (zzt) {
                                        case 51:
                                            i32 = i104;
                                            i15 = i31;
                                            i33 = i18;
                                            zzgvmVar6 = zzgvmVar;
                                            i16 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 1) {
                                                i34 = i32 + 8;
                                                unsafe12.putObject(obj3, j3, Double.valueOf(Double.longBitsToDouble(zzgvn.zzn(bArr2, i32))));
                                                unsafe12.putInt(obj3, j8, i16);
                                                if (i34 != i32) {
                                                    unsafe6 = unsafe;
                                                    i48 = i8;
                                                    i49 = i9;
                                                    i56 = i15;
                                                    i52 = i34;
                                                    i53 = i16;
                                                    i50 = i14;
                                                    i51 = -1;
                                                    i57 = i29;
                                                    i54 = i33;
                                                    break;
                                                } else {
                                                    i11 = i9;
                                                    i58 = i34;
                                                    i57 = i29;
                                                    i18 = i33;
                                                    break;
                                                }
                                            }
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        case 52:
                                            i32 = i104;
                                            i15 = i31;
                                            i33 = i18;
                                            zzgvmVar6 = zzgvmVar;
                                            i16 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 5) {
                                                i34 = i32 + 4;
                                                unsafe12.putObject(obj3, j3, Float.valueOf(Float.intBitsToFloat(zzgvn.zzb(bArr2, i32))));
                                                unsafe12.putInt(obj3, j8, i16);
                                                if (i34 != i32) {
                                                }
                                            }
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i32 = i104;
                                            i15 = i31;
                                            i33 = i18;
                                            zzgvmVar6 = zzgvmVar;
                                            i35 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 0) {
                                                i34 = zzgvn.zzk(bArr2, i32, zzgvmVar6);
                                                unsafe12.putObject(obj3, j3, Long.valueOf(zzgvmVar6.zzb));
                                                i16 = i35;
                                                unsafe12.putInt(obj3, j8, i16);
                                                if (i34 != i32) {
                                                }
                                            }
                                            i16 = i35;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i32 = i104;
                                            i15 = i31;
                                            i33 = i18;
                                            zzgvmVar6 = zzgvmVar;
                                            i35 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 0) {
                                                i34 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                                unsafe12.putObject(obj3, j3, Integer.valueOf(zzgvmVar6.zza));
                                                unsafe12.putInt(obj3, j8, i35);
                                                i16 = i35;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i16 = i35;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i32 = i104;
                                            i15 = i31;
                                            i33 = i18;
                                            zzgvmVar6 = zzgvmVar;
                                            i35 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 1) {
                                                i34 = i32 + 8;
                                                unsafe12.putObject(obj3, j3, Long.valueOf(zzgvn.zzn(bArr2, i32)));
                                                unsafe12.putInt(obj3, j8, i35);
                                                i16 = i35;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i16 = i35;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i32 = i104;
                                            i15 = i31;
                                            i33 = i18;
                                            zzgvmVar6 = zzgvmVar;
                                            i35 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 5) {
                                                i34 = i32 + 4;
                                                unsafe12.putObject(obj3, j3, Integer.valueOf(zzgvn.zzb(bArr2, i32)));
                                                unsafe12.putInt(obj3, j8, i35);
                                                i16 = i35;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i16 = i35;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 58:
                                            i32 = i104;
                                            i15 = i31;
                                            i33 = i18;
                                            zzgvmVar6 = zzgvmVar;
                                            i35 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 0) {
                                                i34 = zzgvn.zzk(bArr2, i32, zzgvmVar6);
                                                unsafe12.putObject(obj3, j3, Boolean.valueOf(zzgvmVar6.zzb != 0));
                                                unsafe12.putInt(obj3, j8, i35);
                                                i16 = i35;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i16 = i35;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 59:
                                            i32 = i104;
                                            i15 = i31;
                                            i33 = i18;
                                            zzgvmVar6 = zzgvmVar;
                                            i35 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 2) {
                                                int zzh17 = zzgvn.zzh(bArr2, i32, zzgvmVar6);
                                                int i105 = zzgvmVar6.zza;
                                                if (i105 == 0) {
                                                    unsafe12.putObject(obj3, j3, "");
                                                } else {
                                                    int i106 = zzh17 + i105;
                                                    if ((i62 & 536870912) != 0 && !zzhai.zzi(bArr2, zzh17, i106)) {
                                                        throw new zzgxv("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe12.putObject(obj3, j3, new String(bArr2, zzh17, i105, zzgxt.zza));
                                                    zzh17 = i106;
                                                }
                                                unsafe12.putInt(obj3, j8, i35);
                                                i34 = zzh17;
                                                i16 = i35;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i16 = i35;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 60:
                                            i32 = i104;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 2) {
                                                Object zzB = zzgyuVar.zzB(obj3, i77, i18);
                                                int zzm2 = zzgvn.zzm(zzB, zzgyuVar.zzx(i18), bArr, i32, i8, zzgvmVar);
                                                zzgyuVar.zzK(obj3, i77, i18, zzB);
                                                zzgvmVar6 = zzgvmVar;
                                                i34 = zzm2;
                                                i15 = i31;
                                                i16 = i77;
                                                i33 = i18;
                                                if (i34 != i32) {
                                                }
                                            } else {
                                                i33 = i18;
                                                i15 = i31;
                                                i16 = i77;
                                                zzgvmVar6 = zzgvmVar;
                                                i34 = i32;
                                                if (i34 != i32) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            i32 = i104;
                                            i36 = i18;
                                            zzgvmVar4 = zzgvmVar;
                                            i37 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 2) {
                                                zza2 = zzgvn.zza(bArr2, i32, zzgvmVar4);
                                                unsafe12.putObject(obj3, j3, zzgvmVar4.zzc);
                                                unsafe12.putInt(obj3, j8, i37);
                                                i33 = i36;
                                                i16 = i37;
                                                i34 = zza2;
                                                zzgvmVar6 = zzgvmVar4;
                                                i15 = i31;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i33 = i36;
                                            i16 = i37;
                                            zzgvmVar6 = zzgvmVar4;
                                            i15 = i31;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 63:
                                            i32 = i104;
                                            i36 = i18;
                                            zzgvmVar4 = zzgvmVar;
                                            i37 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 0) {
                                                zza2 = zzgvn.zzh(bArr2, i32, zzgvmVar4);
                                                int i107 = zzgvmVar4.zza;
                                                zzgxm zzw2 = zzgyuVar.zzw(i36);
                                                if (zzw2 == null || zzw2.zza(i107)) {
                                                    unsafe12.putObject(obj3, j3, Integer.valueOf(i107));
                                                    unsafe12.putInt(obj3, j8, i37);
                                                } else {
                                                    zzd(obj).zzj(i31, Long.valueOf(i107));
                                                }
                                                i33 = i36;
                                                i16 = i37;
                                                i34 = zza2;
                                                zzgvmVar6 = zzgvmVar4;
                                                i15 = i31;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i33 = i36;
                                            i16 = i37;
                                            zzgvmVar6 = zzgvmVar4;
                                            i15 = i31;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 66:
                                            i32 = i104;
                                            i36 = i18;
                                            zzgvmVar4 = zzgvmVar;
                                            i37 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            if (i61 == 0) {
                                                zza2 = zzgvn.zzh(bArr2, i32, zzgvmVar4);
                                                unsafe12.putObject(obj3, j3, Integer.valueOf(zzgwe.zzD(zzgvmVar4.zza)));
                                                unsafe12.putInt(obj3, j8, i37);
                                                i33 = i36;
                                                i16 = i37;
                                                i34 = zza2;
                                                zzgvmVar6 = zzgvmVar4;
                                                i15 = i31;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i33 = i36;
                                            i16 = i37;
                                            zzgvmVar6 = zzgvmVar4;
                                            i15 = i31;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                        case 67:
                                            i36 = i18;
                                            zzgvmVar4 = zzgvmVar;
                                            i37 = i77;
                                            i14 = 3;
                                            if (i61 == 0) {
                                                i32 = i104;
                                                zza2 = zzgvn.zzk(bArr2, i32, zzgvmVar4);
                                                unsafe = unsafe3;
                                                unsafe12.putObject(obj3, j3, Long.valueOf(zzgwe.zzF(zzgvmVar4.zzb)));
                                                unsafe12.putInt(obj3, j8, i37);
                                                i33 = i36;
                                                i16 = i37;
                                                i34 = zza2;
                                                zzgvmVar6 = zzgvmVar4;
                                                i15 = i31;
                                                if (i34 != i32) {
                                                }
                                            } else {
                                                i32 = i104;
                                                unsafe = unsafe3;
                                                i33 = i36;
                                                i16 = i37;
                                                zzgvmVar6 = zzgvmVar4;
                                                i15 = i31;
                                                i34 = i32;
                                                if (i34 != i32) {
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i61 == 3) {
                                                Object zzB2 = zzgyuVar.zzB(obj3, i77, i18);
                                                zzgvmVar4 = zzgvmVar;
                                                i14 = 3;
                                                int zzl = zzgvn.zzl(zzB2, zzgyuVar.zzx(i18), bArr, i104, i8, (i31 & (-8)) | 4, zzgvmVar);
                                                zzgyuVar.zzK(obj3, i77, i18, zzB2);
                                                i33 = i18;
                                                i16 = i77;
                                                i34 = zzl;
                                                i32 = i104;
                                                unsafe = unsafe3;
                                                zzgvmVar6 = zzgvmVar4;
                                                i15 = i31;
                                                if (i34 != i32) {
                                                }
                                            } else {
                                                i14 = 3;
                                                i32 = i104;
                                                i15 = i31;
                                                i16 = i77;
                                                i33 = i18;
                                                zzgvmVar6 = zzgvmVar;
                                                unsafe = unsafe3;
                                                i34 = i32;
                                                if (i34 != i32) {
                                                }
                                            }
                                            break;
                                        default:
                                            i32 = i104;
                                            i15 = i31;
                                            i33 = i18;
                                            zzgvmVar6 = zzgvmVar;
                                            i16 = i77;
                                            unsafe = unsafe3;
                                            i14 = 3;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i61 == 2) {
                                        Unsafe unsafe13 = zzb;
                                        Object zzz = zzz(i18);
                                        Object object = unsafe13.getObject(obj, j3);
                                        if (zzgym.zza(object)) {
                                            zzgyl zzb2 = zzgyl.zza().zzb();
                                            zzgym.zzb(zzb2, object);
                                            unsafe13.putObject(obj, j3, zzb2);
                                        }
                                        throw null;
                                    }
                                    zzgvmVar3 = zzgvmVar;
                                    i30 = i104;
                                    zzgyuVar = this;
                                    obj3 = obj;
                                }
                            }
                        } else if (i61 == 2) {
                            zzgxs zzgxsVar2 = (zzgxs) unsafe6.getObject(obj3, j3);
                            if (!zzgxsVar2.zzc()) {
                                int size2 = zzgxsVar2.size();
                                zzgxsVar2 = zzgxsVar2.zzf(size2 == 0 ? 10 : size2 + size2);
                                unsafe6.putObject(obj3, j3, zzgxsVar2);
                            }
                            i52 = zzgvn.zze(zzgyuVar.zzx(i54), i63, bArr, i58, i8, zzgxsVar2, zzgvmVar);
                            i54 = i54;
                            unsafe6 = unsafe6;
                            i56 = i63;
                            i53 = i77;
                            i51 = -1;
                            i57 = i57;
                            i48 = i8;
                            i49 = i9;
                            zzgvmVar6 = zzgvmVar;
                            i50 = 3;
                        } else {
                            i29 = i57;
                            zzgvmVar3 = zzgvmVar;
                            unsafe3 = unsafe6;
                            i30 = i58;
                            i31 = i63;
                            i18 = i54;
                        }
                        i11 = i9;
                        i58 = i30;
                        i15 = i31;
                        unsafe = unsafe3;
                        zzgvmVar6 = zzgvmVar3;
                        i16 = i77;
                        i57 = i29;
                        i14 = 3;
                    }
                }
                if (i15 != i11 || i11 == 0) {
                    if (zzgyuVar.zzh) {
                        zzgwq zzgwqVar = zzgvmVar6.zzd;
                        int i108 = zzgwq.zzb;
                        int i109 = zzgzb.zza;
                        if (zzgwqVar != zzgwq.zza) {
                            if (zzgwqVar.zzc(zzgyuVar.zzg, i16) != null) {
                                throw null;
                            }
                            i20 = i15;
                            i19 = i8;
                            zzg = zzgvn.zzg(i15, bArr, i58, i8, zzd(obj), zzgvmVar);
                            unsafe6 = unsafe;
                            zzgvmVar6 = zzgvmVar;
                            i56 = i20;
                            i49 = i11;
                            i53 = i16;
                            i54 = i18;
                            i48 = i19;
                            i50 = i14;
                            i51 = i17;
                            i52 = zzg;
                        }
                    }
                    i19 = i8;
                    i20 = i15;
                    zzg = zzgvn.zzg(i20, bArr, i58, i8, zzd(obj), zzgvmVar);
                    unsafe6 = unsafe;
                    zzgvmVar6 = zzgvmVar;
                    i56 = i20;
                    i49 = i11;
                    i53 = i16;
                    i54 = i18;
                    i48 = i19;
                    i50 = i14;
                    i51 = i17;
                    i52 = zzg;
                } else {
                    i10 = i8;
                    i13 = i15;
                    i52 = i58;
                    i12 = i55;
                }
            } else {
                i10 = i48;
                i11 = i49;
                unsafe = unsafe6;
                i12 = i55;
                i13 = i56;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final Object zze() {
        return ((zzgxg) this.zzg).zzbj();
    }

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
                int zzu = zzu(i7);
                int i8 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i8;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i7], i7)) {
                        zzx(i7).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i7)) {
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
            int zzu = zzu(i7);
            int i8 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i9 = iArr[i7];
            long j = i8;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i7)) {
                        zzhad.zzr(obj, j, zzhad.zzb(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i7)) {
                        zzhad.zzs(obj, j, zzhad.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i7)) {
                        zzhad.zzp(obj, j, zzhad.zzz(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i7)) {
                        zzhad.zzv(obj, j, zzhad.zzh(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i7);
                    break;
                case 10:
                    if (zzN(obj2, i7)) {
                        zzhad.zzv(obj, j, zzhad.zzh(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i7)) {
                        zzhad.zzt(obj, j, zzhad.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i7)) {
                        zzhad.zzu(obj, j, zzhad.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
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
                    zzgxs zzgxsVar = (zzgxs) zzhad.zzh(obj, j);
                    zzgxs zzgxsVar2 = (zzgxs) zzhad.zzh(obj2, j);
                    int size = zzgxsVar.size();
                    int size2 = zzgxsVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgxsVar.zzc()) {
                            zzgxsVar = zzgxsVar.zzf(size2 + size);
                        }
                        zzgxsVar.addAll(zzgxsVar2);
                    }
                    if (size > 0) {
                        zzgxsVar2 = zzgxsVar;
                    }
                    zzhad.zzv(obj, j, zzgxsVar2);
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
                        break;
                    } else {
                        break;
                    }
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
                        break;
                    } else {
                        break;
                    }
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

    /* JADX WARN: Removed duplicated region for block: B:314:0x0518 A[LOOP:5: B:312:0x0514->B:314:0x0518, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0529  */
    @Override // com.google.android.gms.internal.ads.zzgzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzgze zzgzeVar, zzgwq zzgwqVar) {
        int i7;
        zzgwqVar.getClass();
        zzD(obj);
        zzgzw zzgzwVar = this.zzm;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzgzeVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    int zzu = zzu(zzq);
                    try {
                    } catch (zzgxu unused) {
                        if (obj2 == null) {
                            obj2 = zzgzwVar.zza(obj);
                        }
                        if (!zzgzwVar.zzk(obj2, zzgzeVar, 0)) {
                            for (int i8 = this.zzk; i8 < this.zzl; i8++) {
                                zzy(obj, this.zzj[i8], obj2, zzgzwVar, obj);
                            }
                        }
                    }
                    switch (zzt(zzu)) {
                        case 0:
                            zzhad.zzr(obj, zzu & 1048575, zzgzeVar.zza());
                            zzH(obj, zzq);
                        case 1:
                            zzhad.zzs(obj, zzu & 1048575, zzgzeVar.zzb());
                            zzH(obj, zzq);
                        case 2:
                            zzhad.zzu(obj, zzu & 1048575, zzgzeVar.zzl());
                            zzH(obj, zzq);
                        case 3:
                            zzhad.zzu(obj, zzu & 1048575, zzgzeVar.zzo());
                            zzH(obj, zzq);
                        case 4:
                            zzhad.zzt(obj, zzu & 1048575, zzgzeVar.zzg());
                            zzH(obj, zzq);
                        case 5:
                            zzhad.zzu(obj, zzu & 1048575, zzgzeVar.zzk());
                            zzH(obj, zzq);
                        case 6:
                            zzhad.zzt(obj, zzu & 1048575, zzgzeVar.zzf());
                            zzH(obj, zzq);
                        case 7:
                            zzhad.zzp(obj, zzu & 1048575, zzgzeVar.zzN());
                            zzH(obj, zzq);
                        case 8:
                            zzG(obj, zzu, zzgzeVar);
                            zzH(obj, zzq);
                        case 9:
                            zzgyr zzgyrVar = (zzgyr) zzA(obj, zzq);
                            zzgzeVar.zzu(zzgyrVar, zzx(zzq), zzgwqVar);
                            zzJ(obj, zzq, zzgyrVar);
                        case 10:
                            zzhad.zzv(obj, zzu & 1048575, zzgzeVar.zzp());
                            zzH(obj, zzq);
                        case 11:
                            zzhad.zzt(obj, zzu & 1048575, zzgzeVar.zzj());
                            zzH(obj, zzq);
                        case 12:
                            int zze = zzgzeVar.zze();
                            zzgxm zzw = zzw(zzq);
                            if (zzw != null && !zzw.zza(zze)) {
                                obj2 = zzgzm.zzo(obj, zzc, zze, obj2, zzgzwVar);
                            }
                            zzhad.zzt(obj, zzu & 1048575, zze);
                            zzH(obj, zzq);
                            break;
                        case 13:
                            zzhad.zzt(obj, zzu & 1048575, zzgzeVar.zzh());
                            zzH(obj, zzq);
                        case 14:
                            zzhad.zzu(obj, zzu & 1048575, zzgzeVar.zzm());
                            zzH(obj, zzq);
                        case 15:
                            zzhad.zzt(obj, zzu & 1048575, zzgzeVar.zzi());
                            zzH(obj, zzq);
                        case 16:
                            zzhad.zzu(obj, zzu & 1048575, zzgzeVar.zzn());
                            zzH(obj, zzq);
                        case 17:
                            zzgyr zzgyrVar2 = (zzgyr) zzA(obj, zzq);
                            zzgzeVar.zzt(zzgyrVar2, zzx(zzq), zzgwqVar);
                            zzJ(obj, zzq, zzgyrVar2);
                        case 18:
                            zzgzeVar.zzx(zzgye.zza(obj, zzu & 1048575));
                        case 19:
                            zzgzeVar.zzB(zzgye.zza(obj, zzu & 1048575));
                        case 20:
                            zzgzeVar.zzE(zzgye.zza(obj, zzu & 1048575));
                        case zzbbd.zzt.zzm /* 21 */:
                            zzgzeVar.zzM(zzgye.zza(obj, zzu & 1048575));
                        case 22:
                            zzgzeVar.zzD(zzgye.zza(obj, zzu & 1048575));
                        case 23:
                            zzgzeVar.zzA(zzgye.zza(obj, zzu & 1048575));
                        case 24:
                            zzgzeVar.zzz(zzgye.zza(obj, zzu & 1048575));
                        case 25:
                            zzgzeVar.zzv(zzgye.zza(obj, zzu & 1048575));
                        case 26:
                            if (zzM(zzu)) {
                                ((zzgwf) zzgzeVar).zzK(zzgye.zza(obj, zzu & 1048575), true);
                            } else {
                                ((zzgwf) zzgzeVar).zzK(zzgye.zza(obj, zzu & 1048575), false);
                            }
                        case 27:
                            zzgzeVar.zzF(zzgye.zza(obj, zzu & 1048575), zzx(zzq), zzgwqVar);
                        case 28:
                            zzgzeVar.zzw(zzgye.zza(obj, zzu & 1048575));
                        case 29:
                            zzgzeVar.zzL(zzgye.zza(obj, zzu & 1048575));
                        case 30:
                            List zza2 = zzgye.zza(obj, zzu & 1048575);
                            zzgzeVar.zzy(zza2);
                            obj2 = zzgzm.zzn(obj, zzc, zza2, zzw(zzq), obj2, zzgzwVar);
                        case 31:
                            zzgzeVar.zzG(zzgye.zza(obj, zzu & 1048575));
                        case 32:
                            zzgzeVar.zzH(zzgye.zza(obj, zzu & 1048575));
                        case 33:
                            zzgzeVar.zzI(zzgye.zza(obj, zzu & 1048575));
                        case 34:
                            zzgzeVar.zzJ(zzgye.zza(obj, zzu & 1048575));
                        case 35:
                            zzgzeVar.zzx(zzgye.zza(obj, zzu & 1048575));
                        case 36:
                            zzgzeVar.zzB(zzgye.zza(obj, zzu & 1048575));
                        case 37:
                            zzgzeVar.zzE(zzgye.zza(obj, zzu & 1048575));
                        case 38:
                            zzgzeVar.zzM(zzgye.zza(obj, zzu & 1048575));
                        case 39:
                            zzgzeVar.zzD(zzgye.zza(obj, zzu & 1048575));
                        case 40:
                            zzgzeVar.zzA(zzgye.zza(obj, zzu & 1048575));
                        case 41:
                            zzgzeVar.zzz(zzgye.zza(obj, zzu & 1048575));
                        case 42:
                            zzgzeVar.zzv(zzgye.zza(obj, zzu & 1048575));
                        case 43:
                            zzgzeVar.zzL(zzgye.zza(obj, zzu & 1048575));
                        case 44:
                            List zza3 = zzgye.zza(obj, zzu & 1048575);
                            zzgzeVar.zzy(zza3);
                            obj2 = zzgzm.zzn(obj, zzc, zza3, zzw(zzq), obj2, zzgzwVar);
                        case 45:
                            zzgzeVar.zzG(zzgye.zza(obj, zzu & 1048575));
                        case 46:
                            zzgzeVar.zzH(zzgye.zza(obj, zzu & 1048575));
                        case 47:
                            zzgzeVar.zzI(zzgye.zza(obj, zzu & 1048575));
                        case 48:
                            zzgzeVar.zzJ(zzgye.zza(obj, zzu & 1048575));
                        case 49:
                            zzgzeVar.zzC(zzgye.zza(obj, zzu & 1048575), zzx(zzq), zzgwqVar);
                        case 50:
                            Object zzz = zzz(zzq);
                            long zzu2 = zzu(zzq) & 1048575;
                            Object zzh = zzhad.zzh(obj, zzu2);
                            if (zzh == null) {
                                zzh = zzgyl.zza().zzb();
                                zzhad.zzv(obj, zzu2, zzh);
                            } else if (zzgym.zza(zzh)) {
                                Object zzb2 = zzgyl.zza().zzb();
                                zzgym.zzb(zzb2, zzh);
                                zzhad.zzv(obj, zzu2, zzb2);
                                zzh = zzb2;
                            }
                            throw null;
                            break;
                        case 51:
                            zzhad.zzv(obj, zzu & 1048575, Double.valueOf(zzgzeVar.zza()));
                            zzI(obj, zzc, zzq);
                        case 52:
                            zzhad.zzv(obj, zzu & 1048575, Float.valueOf(zzgzeVar.zzb()));
                            zzI(obj, zzc, zzq);
                        case 53:
                            zzhad.zzv(obj, zzu & 1048575, Long.valueOf(zzgzeVar.zzl()));
                            zzI(obj, zzc, zzq);
                        case 54:
                            zzhad.zzv(obj, zzu & 1048575, Long.valueOf(zzgzeVar.zzo()));
                            zzI(obj, zzc, zzq);
                        case 55:
                            zzhad.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzeVar.zzg()));
                            zzI(obj, zzc, zzq);
                        case 56:
                            zzhad.zzv(obj, zzu & 1048575, Long.valueOf(zzgzeVar.zzk()));
                            zzI(obj, zzc, zzq);
                        case 57:
                            zzhad.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzeVar.zzf()));
                            zzI(obj, zzc, zzq);
                        case 58:
                            zzhad.zzv(obj, zzu & 1048575, Boolean.valueOf(zzgzeVar.zzN()));
                            zzI(obj, zzc, zzq);
                        case 59:
                            zzG(obj, zzu, zzgzeVar);
                            zzI(obj, zzc, zzq);
                        case 60:
                            zzgyr zzgyrVar3 = (zzgyr) zzB(obj, zzc, zzq);
                            zzgzeVar.zzu(zzgyrVar3, zzx(zzq), zzgwqVar);
                            zzK(obj, zzc, zzq, zzgyrVar3);
                        case 61:
                            zzhad.zzv(obj, zzu & 1048575, zzgzeVar.zzp());
                            zzI(obj, zzc, zzq);
                        case 62:
                            zzhad.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzeVar.zzj()));
                            zzI(obj, zzc, zzq);
                        case 63:
                            int zze2 = zzgzeVar.zze();
                            zzgxm zzw2 = zzw(zzq);
                            if (zzw2 != null && !zzw2.zza(zze2)) {
                                obj2 = zzgzm.zzo(obj, zzc, zze2, obj2, zzgzwVar);
                            }
                            zzhad.zzv(obj, zzu & 1048575, Integer.valueOf(zze2));
                            zzI(obj, zzc, zzq);
                            break;
                        case 64:
                            zzhad.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzeVar.zzh()));
                            zzI(obj, zzc, zzq);
                        case 65:
                            zzhad.zzv(obj, zzu & 1048575, Long.valueOf(zzgzeVar.zzm()));
                            zzI(obj, zzc, zzq);
                        case 66:
                            zzhad.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzeVar.zzi()));
                            zzI(obj, zzc, zzq);
                        case 67:
                            zzhad.zzv(obj, zzu & 1048575, Long.valueOf(zzgzeVar.zzn()));
                            zzI(obj, zzc, zzq);
                        case 68:
                            zzgyr zzgyrVar4 = (zzgyr) zzB(obj, zzc, zzq);
                            zzgzeVar.zzt(zzgyrVar4, zzx(zzq), zzgwqVar);
                            zzK(obj, zzc, zzq, zzgyrVar4);
                        default:
                            if (obj2 == null) {
                                obj2 = zzgzwVar.zza(obj);
                            }
                            if (!zzgzwVar.zzk(obj2, zzgzeVar, 0)) {
                                for (int i9 = this.zzk; i9 < this.zzl; i9++) {
                                    zzy(obj, this.zzj[i9], obj2, zzgzwVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                        zzy(obj, this.zzj[i10], obj2, zzgzwVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzgwqVar.zzc(this.zzg, zzc)) != null) {
                        throw null;
                    }
                    if (obj2 == null) {
                        obj2 = zzgzwVar.zza(obj);
                    }
                    if (!zzgzwVar.zzk(obj2, zzgzeVar, 0)) {
                        for (int i11 = this.zzk; i11 < this.zzl; i11++) {
                            zzy(obj, this.zzj[i11], obj2, zzgzwVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                while (i7 < this.zzl) {
                }
                if (obj2 != null) {
                }
                throw th;
            }
            for (i7 = this.zzk; i7 < this.zzl; i7++) {
                zzy(obj, this.zzj[i7], obj2, zzgzwVar, obj);
            }
            if (obj2 != null) {
                zzgzwVar.zzj(obj, obj2);
            }
            throw th;
        }
        if (obj2 != null) {
            zzgzwVar.zzj(obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzgvm zzgvmVar) {
        zzc(obj, bArr, i7, i8, 0, zzgvmVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:231:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzgzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzhal zzhalVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i7;
        int i8;
        Map.Entry entry2;
        int i9;
        Iterator it2;
        int[] iArr2;
        boolean z4;
        boolean z7;
        Map.Entry entry3;
        if (this.zzh) {
            zzgwv zzgwvVar = ((zzgxc) obj).zza;
            if (!zzgwvVar.zza.isEmpty()) {
                Iterator zzf = zzgwvVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i10 = 1048575;
                int i11 = 0;
                i7 = 0;
                while (i7 < iArr.length) {
                    int zzu = zzu(i7);
                    int[] iArr3 = this.zzc;
                    int zzt = zzt(zzu);
                    int i12 = iArr3[i7];
                    if (zzt <= 17) {
                        int i13 = iArr3[i7 + 2];
                        int i14 = i13 & 1048575;
                        if (i14 != i10) {
                            if (i14 == 1048575) {
                                entry3 = entry;
                                i11 = 0;
                            } else {
                                entry3 = entry;
                                i11 = unsafe.getInt(obj, i14);
                            }
                            i10 = i14;
                        } else {
                            entry3 = entry;
                        }
                        i9 = 1 << (i13 >>> 20);
                        i8 = i11;
                        entry2 = entry3;
                    } else {
                        i8 = i11;
                        entry2 = entry;
                        i9 = 0;
                    }
                    int i15 = i10;
                    while (entry2 != null && ((zzgxd) entry2.getKey()).zza <= i12) {
                        this.zzn.zzb(zzhalVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzu & 1048575;
                    switch (zzt) {
                        case 0:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzf(i12, zzhad.zzb(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 1:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzo(i12, zzhad.zzc(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 2:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzt(i12, unsafe.getLong(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 3:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzK(i12, unsafe.getLong(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 4:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzr(i12, unsafe.getInt(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 5:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzm(i12, unsafe.getLong(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 6:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzk(i12, unsafe.getInt(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 7:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzb(i12, zzhad.zzz(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 8:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzT(i12, unsafe.getObject(obj, j), zzhalVar);
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 9:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzv(i12, unsafe.getObject(obj, j), zzx(i7));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 10:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzd(i12, (zzgvy) unsafe.getObject(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 11:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzI(i12, unsafe.getInt(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 12:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzi(i12, unsafe.getInt(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 13:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzx(i12, unsafe.getInt(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 14:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzz(i12, unsafe.getLong(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 15:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzB(i12, unsafe.getInt(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 16:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzD(i12, unsafe.getLong(obj, j));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 17:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i7, i15, i8, i9)) {
                                zzhalVar.zzq(i12, unsafe.getObject(obj, j), zzx(i7));
                            }
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 18:
                            z4 = false;
                            zzgzm.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 19:
                            z4 = false;
                            zzgzm.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 20:
                            z4 = false;
                            zzgzm.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case zzbbd.zzt.zzm /* 21 */:
                            z4 = false;
                            zzgzm.zzI(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 22:
                            z4 = false;
                            zzgzm.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 23:
                            z4 = false;
                            zzgzm.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 24:
                            z4 = false;
                            zzgzm.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 25:
                            z4 = false;
                            zzgzm.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 26:
                            zzgzm.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 27:
                            zzgzm.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, zzx(i7));
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 28:
                            zzgzm.zzs(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 29:
                            z7 = false;
                            zzgzm.zzH(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 30:
                            z7 = false;
                            zzgzm.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 31:
                            z7 = false;
                            zzgzm.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 32:
                            z7 = false;
                            zzgzm.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 33:
                            z7 = false;
                            zzgzm.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 34:
                            z7 = false;
                            zzgzm.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 35:
                            zzgzm.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 36:
                            zzgzm.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 37:
                            zzgzm.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 38:
                            zzgzm.zzI(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 39:
                            zzgzm.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 40:
                            zzgzm.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 41:
                            zzgzm.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 42:
                            zzgzm.zzr(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 43:
                            zzgzm.zzH(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 44:
                            zzgzm.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 45:
                            zzgzm.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 46:
                            zzgzm.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 47:
                            zzgzm.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 48:
                            zzgzm.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 49:
                            zzgzm.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzhalVar, zzx(i7));
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 51:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzf(i12, zzn(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 52:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzo(i12, zzo(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 53:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzt(i12, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 54:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzK(i12, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 55:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzr(i12, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 56:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzm(i12, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 57:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzk(i12, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 58:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzb(i12, zzS(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 59:
                            if (zzR(obj, i12, i7)) {
                                zzT(i12, unsafe.getObject(obj, j), zzhalVar);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 60:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzv(i12, unsafe.getObject(obj, j), zzx(i7));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 61:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzd(i12, (zzgvy) unsafe.getObject(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 62:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzI(i12, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 63:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzi(i12, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 64:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzx(i12, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 65:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzz(i12, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 66:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzB(i12, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 67:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzD(i12, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        case 68:
                            if (zzR(obj, i12, i7)) {
                                zzhalVar.zzq(i12, unsafe.getObject(obj, j), zzx(i7));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                        default:
                            it2 = it;
                            iArr2 = iArr;
                            i7 += 3;
                            i10 = i15;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i11 = i8;
                    }
                }
                Iterator it3 = it;
                while (entry != null) {
                    this.zzn.zzb(zzhalVar, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                ((zzgxg) obj).zzt.zzl(zzhalVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i102 = 1048575;
        int i112 = 0;
        i7 = 0;
        while (i7 < iArr.length) {
        }
        Iterator it32 = it;
        while (entry != null) {
        }
        ((zzgxg) obj).zzt.zzl(zzhalVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzJ;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzu = zzu(i7);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i7) && Double.doubleToLongBits(zzhad.zzb(obj, j)) == Double.doubleToLongBits(zzhad.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i7) && Float.floatToIntBits(zzhad.zzc(obj, j)) == Float.floatToIntBits(zzhad.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i7) && zzhad.zzf(obj, j) == zzhad.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i7) && zzhad.zzf(obj, j) == zzhad.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i7) && zzhad.zzd(obj, j) == zzhad.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i7) && zzhad.zzf(obj, j) == zzhad.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i7) && zzhad.zzd(obj, j) == zzhad.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i7) && zzhad.zzz(obj, j) == zzhad.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i7) && zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i7) && zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i7) && zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i7) && zzhad.zzd(obj, j) == zzhad.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i7) && zzhad.zzd(obj, j) == zzhad.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i7) && zzhad.zzd(obj, j) == zzhad.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i7) && zzhad.zzf(obj, j) == zzhad.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i7) && zzhad.zzd(obj, j) == zzhad.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i7) && zzhad.zzf(obj, j) == zzhad.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i7) && zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
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
                    zzJ = zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j));
                    break;
                case 50:
                    zzJ = zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j));
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
                    long zzr = zzr(i7) & 1048575;
                    if (zzhad.zzd(obj, zzr) == zzhad.zzd(obj2, zzr) && zzgzm.zzJ(zzhad.zzh(obj, j), zzhad.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzJ) {
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

    @Override // com.google.android.gms.internal.ads.zzgzk
    public final boolean zzl(Object obj) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i12 = iArr[i10];
            int i13 = iArr2[i12];
            int zzu = zzu(i12);
            int i14 = this.zzc[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i11) {
                if (i15 != 1048575) {
                    i9 = zzb.getInt(obj, i15);
                }
                i8 = i9;
                i7 = i15;
            } else {
                i7 = i11;
                i8 = i9;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i12, i7, i8, i16)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i13, i12) && !zzP(obj, zzu, zzx(i12))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzgyl) zzhad.zzh(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhad.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgzk zzx = zzx(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzx.zzl(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i12, i7, i8, i16) && !zzP(obj, zzu, zzx(i12))) {
                return false;
            }
            i10++;
            i11 = i7;
            i9 = i8;
        }
        return !this.zzh || ((zzgxc) obj).zza.zzi();
    }
}
