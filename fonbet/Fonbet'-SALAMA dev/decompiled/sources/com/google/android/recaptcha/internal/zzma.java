package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
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
        zzmk zzx = zzx(i7);
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
        zzmk zzx = zzx(i8);
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
            zzmk zzx = zzx(i7);
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
            zzmk zzx = zzx(i7);
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
        int zzr = zzr(i7);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzni.zzq(obj, j, (1 << (zzr >>> 20)) | zzni.zzc(obj, j));
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
        int zzr = zzr(i7);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzni.zzc(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i7);
        long j3 = zzu & 1048575;
        switch (zzt(zzu)) {
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
                Object zzf = zzni.zzf(obj, j3);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zziv) {
                    return !zziv.zzb.equals(zzf);
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
        return i8 == 1048575 ? zzN(obj, i7) : (i9 & i10) != 0;
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
        zznc zzf = zznc.zzf();
        zzksVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzma zzm(Class cls, zzlu zzluVar, zzmd zzmdVar, zzlk zzlkVar, zznb zznbVar, zzke zzkeVar, zzls zzlsVar) {
        int i7;
        int charAt;
        int charAt2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
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
        zzmi zzmiVar;
        int i25;
        String str;
        int i26;
        int i27;
        int i28;
        int i29;
        Field zzC;
        char charAt11;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i34;
        char charAt12;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        int i37;
        char charAt15;
        if (!(zzluVar instanceof zzmi)) {
            throw null;
        }
        zzmi zzmiVar2 = (zzmi) zzluVar;
        String zzd = zzmiVar2.zzd();
        int length = zzd.length();
        char c3 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i7 = i38 + 1;
                if (zzd.charAt(i38) < 55296) {
                    break;
                }
                i38 = i7;
            }
        } else {
            i7 = 1;
        }
        int i39 = i7 + 1;
        int charAt16 = zzd.charAt(i7);
        if (charAt16 >= 55296) {
            int i40 = charAt16 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                charAt15 = zzd.charAt(i39);
                if (charAt15 < 55296) {
                    break;
                }
                i40 |= (charAt15 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            charAt16 = i40 | (charAt15 << i41);
            i39 = i37;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i9 = 0;
            i12 = 0;
            i8 = 0;
            i10 = 0;
            iArr = zza;
            i11 = 0;
        } else {
            int i42 = i39 + 1;
            int charAt17 = zzd.charAt(i39);
            if (charAt17 >= 55296) {
                int i43 = charAt17 & 8191;
                int i44 = 13;
                while (true) {
                    i20 = i42 + 1;
                    charAt10 = zzd.charAt(i42);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i43 |= (charAt10 & 8191) << i44;
                    i44 += 13;
                    i42 = i20;
                }
                charAt17 = i43 | (charAt10 << i44);
                i42 = i20;
            }
            int i45 = i42 + 1;
            int charAt18 = zzd.charAt(i42);
            if (charAt18 >= 55296) {
                int i46 = charAt18 & 8191;
                int i47 = 13;
                while (true) {
                    i19 = i45 + 1;
                    charAt9 = zzd.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i19;
                }
                charAt18 = i46 | (charAt9 << i47);
                i45 = i19;
            }
            int i48 = i45 + 1;
            int charAt19 = zzd.charAt(i45);
            if (charAt19 >= 55296) {
                int i49 = charAt19 & 8191;
                int i50 = 13;
                while (true) {
                    i18 = i48 + 1;
                    charAt8 = zzd.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i18;
                }
                charAt19 = i49 | (charAt8 << i50);
                i48 = i18;
            }
            int i51 = i48 + 1;
            int charAt20 = zzd.charAt(i48);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i17 = i51 + 1;
                    charAt7 = zzd.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i17;
                }
                charAt20 = i52 | (charAt7 << i53);
                i51 = i17;
            }
            int i54 = i51 + 1;
            charAt = zzd.charAt(i51);
            if (charAt >= 55296) {
                int i55 = charAt & 8191;
                int i56 = 13;
                while (true) {
                    i16 = i54 + 1;
                    charAt6 = zzd.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i16;
                }
                charAt = i55 | (charAt6 << i56);
                i54 = i16;
            }
            int i57 = i54 + 1;
            charAt2 = zzd.charAt(i54);
            if (charAt2 >= 55296) {
                int i58 = charAt2 & 8191;
                int i59 = 13;
                while (true) {
                    i15 = i57 + 1;
                    charAt5 = zzd.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i15;
                }
                charAt2 = i58 | (charAt5 << i59);
                i57 = i15;
            }
            int i60 = i57 + 1;
            int charAt21 = zzd.charAt(i57);
            if (charAt21 >= 55296) {
                int i61 = charAt21 & 8191;
                int i62 = 13;
                while (true) {
                    i14 = i60 + 1;
                    charAt4 = zzd.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i14;
                }
                charAt21 = i61 | (charAt4 << i62);
                i60 = i14;
            }
            int i63 = i60 + 1;
            int charAt22 = zzd.charAt(i60);
            if (charAt22 >= 55296) {
                int i64 = charAt22 & 8191;
                int i65 = 13;
                while (true) {
                    i13 = i63 + 1;
                    charAt3 = zzd.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i13;
                }
                charAt22 = i64 | (charAt3 << i65);
                i63 = i13;
            }
            i8 = charAt17 + charAt17 + charAt18;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i9 = charAt19;
            i10 = charAt22;
            i11 = charAt17;
            i12 = charAt20;
            i39 = i63;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzmiVar2.zze();
        Class<?> cls2 = zzmiVar2.zza().getClass();
        int i66 = i10 + charAt2;
        int i67 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[i67];
        int i68 = 0;
        int i69 = 0;
        int i70 = i10;
        int i71 = i66;
        while (i39 < length) {
            int i72 = i39 + 1;
            int charAt23 = zzd.charAt(i39);
            if (charAt23 >= c3) {
                int i73 = charAt23 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i36 = i74 + 1;
                    charAt14 = zzd.charAt(i74);
                    if (charAt14 < c3) {
                        break;
                    }
                    i73 |= (charAt14 & 8191) << i75;
                    i75 += 13;
                    i74 = i36;
                }
                charAt23 = i73 | (charAt14 << i75);
                i21 = i36;
            } else {
                i21 = i72;
            }
            int i76 = i21 + 1;
            int charAt24 = zzd.charAt(i21);
            if (charAt24 >= c3) {
                int i77 = charAt24 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i35 = i78 + 1;
                    charAt13 = zzd.charAt(i78);
                    if (charAt13 < c3) {
                        break;
                    }
                    i77 |= (charAt13 & 8191) << i79;
                    i79 += 13;
                    i78 = i35;
                }
                charAt24 = i77 | (charAt13 << i79);
                i22 = i35;
            } else {
                i22 = i76;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i80 = charAt24 & 255;
            int i81 = charAt24 & 2048;
            int i82 = length;
            if (i80 >= 51) {
                int i83 = i22 + 1;
                int charAt25 = zzd.charAt(i22);
                char c4 = 55296;
                if (charAt25 >= 55296) {
                    int i84 = 13;
                    int i85 = charAt25 & 8191;
                    int i86 = i83;
                    while (true) {
                        i34 = i86 + 1;
                        charAt12 = zzd.charAt(i86);
                        if (charAt12 < c4) {
                            break;
                        }
                        i85 |= (charAt12 & 8191) << i84;
                        i84 += 13;
                        i86 = i34;
                        c4 = 55296;
                    }
                    charAt25 = i85 | (charAt12 << i84);
                    i32 = i34;
                } else {
                    i32 = i83;
                }
                int i87 = i32;
                int i88 = i80 - 51;
                i24 = i12;
                if (i88 == 9 || i88 == 17) {
                    i33 = i8 + 1;
                    int i89 = i69 / 3;
                    objArr[i89 + i89 + 1] = zze[i8];
                } else {
                    if (i88 == 12) {
                        if (zzmiVar2.zzc() == 1 || i81 != 0) {
                            i33 = i8 + 1;
                            int i90 = i69 / 3;
                            objArr[i90 + i90 + 1] = zze[i8];
                        } else {
                            i81 = 0;
                        }
                    }
                    int i91 = charAt25 + charAt25;
                    obj = zze[i91];
                    if (obj instanceof Field) {
                        zzC2 = zzC(cls2, (String) obj);
                        zze[i91] = zzC2;
                    } else {
                        zzC2 = (Field) obj;
                    }
                    i23 = i9;
                    i29 = (int) unsafe.objectFieldOffset(zzC2);
                    int i92 = i91 + 1;
                    obj2 = zze[i92];
                    if (obj2 instanceof Field) {
                        zzC3 = zzC(cls2, (String) obj2);
                        zze[i92] = zzC3;
                    } else {
                        zzC3 = (Field) obj2;
                    }
                    zzmiVar = zzmiVar2;
                    str = zzd;
                    i28 = i8;
                    i26 = i87;
                    i25 = (int) unsafe.objectFieldOffset(zzC3);
                    i27 = 0;
                }
                i8 = i33;
                int i912 = charAt25 + charAt25;
                obj = zze[i912];
                if (obj instanceof Field) {
                }
                i23 = i9;
                i29 = (int) unsafe.objectFieldOffset(zzC2);
                int i922 = i912 + 1;
                obj2 = zze[i922];
                if (obj2 instanceof Field) {
                }
                zzmiVar = zzmiVar2;
                str = zzd;
                i28 = i8;
                i26 = i87;
                i25 = (int) unsafe.objectFieldOffset(zzC3);
                i27 = 0;
            } else {
                i23 = i9;
                i24 = i12;
                int i93 = i8 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i8]);
                if (i80 == 9 || i80 == 17) {
                    zzmiVar = zzmiVar2;
                    int i94 = i69 / 3;
                    objArr[i94 + i94 + 1] = zzC4.getType();
                } else {
                    if (i80 == 27) {
                        zzmiVar = zzmiVar2;
                        i30 = 1;
                        i31 = i8 + 2;
                    } else if (i80 == 49) {
                        i31 = i8 + 2;
                        zzmiVar = zzmiVar2;
                        i30 = 1;
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        zzmiVar = zzmiVar2;
                        if (zzmiVar2.zzc() == 1 || i81 != 0) {
                            i31 = i8 + 2;
                            int i95 = i69 / 3;
                            objArr[i95 + i95 + 1] = zze[i93];
                            i93 = i31;
                        } else {
                            i81 = 0;
                        }
                    } else {
                        if (i80 == 50) {
                            int i96 = i8 + 2;
                            int i97 = i70 + 1;
                            iArr[i70] = i69;
                            int i98 = i69 / 3;
                            int i99 = i98 + i98;
                            objArr[i99] = zze[i93];
                            if (i81 != 0) {
                                i93 = i8 + 3;
                                objArr[i99 + 1] = zze[i96];
                                i70 = i97;
                            } else {
                                i93 = i96;
                                i70 = i97;
                                i81 = 0;
                            }
                        }
                        zzmiVar = zzmiVar2;
                    }
                    int i100 = i69 / 3;
                    objArr[i100 + i100 + i30] = zze[i93];
                    i93 = i31;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i25 = 1048575;
                if ((charAt24 & 4096) == 0 || i80 > 17) {
                    str = zzd;
                    i26 = i22;
                    i27 = 0;
                } else {
                    int i101 = i22 + 1;
                    int charAt26 = zzd.charAt(i22);
                    if (charAt26 >= 55296) {
                        int i102 = charAt26 & 8191;
                        int i103 = 13;
                        while (true) {
                            i26 = i101 + 1;
                            charAt11 = zzd.charAt(i101);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i102 |= (charAt11 & 8191) << i103;
                            i103 += 13;
                            i101 = i26;
                        }
                        charAt26 = i102 | (charAt11 << i103);
                    } else {
                        i26 = i101;
                    }
                    int i104 = (charAt26 / 32) + i11 + i11;
                    Object obj3 = zze[i104];
                    if (obj3 instanceof Field) {
                        zzC = (Field) obj3;
                    } else {
                        zzC = zzC(cls2, (String) obj3);
                        zze[i104] = zzC;
                    }
                    str = zzd;
                    i27 = charAt26 % 32;
                    i25 = (int) unsafe.objectFieldOffset(zzC);
                }
                if (i80 >= 18 && i80 <= 49) {
                    iArr[i71] = objectFieldOffset;
                    i71++;
                }
                i28 = i93;
                i29 = objectFieldOffset;
            }
            int i105 = i69 + 1;
            iArr2[i69] = charAt23;
            int i106 = i69 + 2;
            iArr2[i105] = i29 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i81 != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20);
            i69 += 3;
            iArr2[i106] = (i27 << 20) | i25;
            i8 = i28;
            i39 = i26;
            length = i82;
            zzmiVar2 = zzmiVar;
            zzd = str;
            i12 = i24;
            i9 = i23;
            c3 = 55296;
        }
        zzmi zzmiVar3 = zzmiVar2;
        return new zzma(iArr2, objArr, i9, i12, zzmiVar3.zza(), zzmiVar3.zzc(), false, iArr, i10, i66, zzmdVar, zzlkVar, zznbVar, zzkeVar, zzlsVar);
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
        zzmk zzb2 = zzmg.zza().zzb((Class) objArr[i9 + 1]);
        this.zzd[i9] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i7, Object obj2, zznb zznbVar, Object obj3) {
        int i8 = this.zzc[i7];
        Object zzf = zzni.zzf(obj, zzu(i7) & 1048575);
        if (zzf == null || zzw(i7) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r2v41 ??), method size: 2188
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zza(java.lang.Object):int");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zzb(Object obj) {
        int i7;
        long doubleToLongBits;
        int i8;
        int floatToIntBits;
        int zzc;
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
                    doubleToLongBits = Double.doubleToLongBits(zzni.zza(obj, j));
                    byte[] bArr = zzla.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 1:
                    i8 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(zzni.zzb(obj, j));
                    i10 = floatToIntBits + i8;
                    break;
                case 2:
                    i7 = i10 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr2 = zzla.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 3:
                    i7 = i10 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr3 = zzla.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 4:
                    i7 = i10 * 53;
                    zzc = zzni.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 5:
                    i7 = i10 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr4 = zzla.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 6:
                    i7 = i10 * 53;
                    zzc = zzni.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 7:
                    i8 = i10 * 53;
                    floatToIntBits = zzla.zza(zzni.zzw(obj, j));
                    i10 = floatToIntBits + i8;
                    break;
                case 8:
                    i8 = i10 * 53;
                    floatToIntBits = ((String) zzni.zzf(obj, j)).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object zzf = zzni.zzf(obj, j);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i10 = i9 + i14;
                    break;
                case 10:
                    i8 = i10 * 53;
                    floatToIntBits = zzni.zzf(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 11:
                    i7 = i10 * 53;
                    zzc = zzni.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 12:
                    i7 = i10 * 53;
                    zzc = zzni.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 13:
                    i7 = i10 * 53;
                    zzc = zzni.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 14:
                    i7 = i10 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr5 = zzla.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 15:
                    i7 = i10 * 53;
                    zzc = zzni.zzc(obj, j);
                    i10 = i7 + zzc;
                    break;
                case 16:
                    i7 = i10 * 53;
                    doubleToLongBits = zzni.zzd(obj, j);
                    byte[] bArr6 = zzla.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i7 + zzc;
                    break;
                case 17:
                    i9 = i10 * 53;
                    Object zzf2 = zzni.zzf(obj, j);
                    if (zzf2 != null) {
                        i14 = zzf2.hashCode();
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
                    floatToIntBits = zzni.zzf(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 50:
                    i8 = i10 * 53;
                    floatToIntBits = zzni.zzf(obj, j).hashCode();
                    i10 = floatToIntBits + i8;
                    break;
                case 51:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzla.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
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
                        byte[] bArr8 = zzla.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzla.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzla.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzla.zza(zzS(obj, j));
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = ((String) zzni.zzf(obj, j)).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzni.zzf(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzni.zzf(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzla.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        zzc = zzp(obj, j);
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i11)) {
                        i7 = i10 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzla.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i7 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = zzni.zzf(obj, j).hashCode();
                        i10 = floatToIntBits + i8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzm.zzd(obj).hashCode() + (i10 * 53);
        return this.zzh ? (hashCode * 53) + this.zzn.zzb(obj).zza.hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d3c, code lost:
    
        if (r11 == 1048575) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0d3e, code lost:
    
        r31.putInt(r7, r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d44, code lost:
    
        r11 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0d49, code lost:
    
        if (r11 >= r6.zzl) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d4b, code lost:
    
        zzy(r35, r6.zzj[r11], null, r6.zzm, r35);
        r11 = r11 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0d5d, code lost:
    
        if (r9 != 0) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d61, code lost:
    
        if (r8 != r38) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d68, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d6f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d6b, code lost:
    
        if (r8 > r38) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d6d, code lost:
    
        if (r13 != r9) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d74, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzg();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x091d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0935 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0bf1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0c06 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i7, int i8, int i9, zzik zzikVar) {
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
        int i18;
        int i19;
        int zzh;
        zzkd zzkdVar;
        int i20;
        Object obj2;
        int i21;
        int i22;
        zzik zzikVar3;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int zzi;
        Unsafe unsafe2;
        int i29;
        int i30;
        zzik zzikVar4;
        int i31;
        int i32;
        int i33;
        int i34;
        long j;
        int i35;
        int i36;
        int i37;
        int i38;
        zzik zzikVar5;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        zzik zzikVar6;
        int i47;
        int zzf;
        int zzi2;
        Object obj3;
        int i48;
        char c3;
        int zzk;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int zza2;
        zzma<T> zzmaVar = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i56 = i8;
        int i57 = i9;
        zzik zzikVar7 = zzikVar;
        int i58 = 3;
        int i59 = 1;
        zzD(obj);
        Unsafe unsafe3 = zzb;
        int i60 = -1;
        int i61 = i7;
        int i62 = -1;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 1048575;
        while (true) {
            if (i61 < i56) {
                int i67 = i61 + 1;
                int i68 = bArr2[i61];
                if (i68 < 0) {
                    i67 = zzil.zzj(i68, bArr2, i67, zzikVar7);
                    i68 = zzikVar7.zza;
                }
                int i69 = i68 >>> 3;
                i63 = i69 > i62 ? (i69 < zzmaVar.zze || i69 > zzmaVar.zzf) ? i60 : zzmaVar.zzs(i69, i63 / i58) : zzmaVar.zzq(i69);
                Object obj5 = null;
                if (i63 == i60) {
                    i10 = i59;
                    i14 = i58;
                    i11 = i57;
                    i15 = i60;
                    unsafe = unsafe3;
                    i13 = i68;
                    i16 = 0;
                    int i70 = i67;
                    zzikVar2 = zzikVar7;
                    i17 = i69;
                    i18 = i70;
                } else {
                    int i71 = i68 & 7;
                    int[] iArr = zzmaVar.zzc;
                    int i72 = iArr[i63 + 1];
                    int zzt = zzt(i72);
                    long j3 = i72 & 1048575;
                    int i73 = i68;
                    if (zzt <= 17) {
                        int i74 = iArr[i63 + 2];
                        int i75 = 1 << (i74 >>> 20);
                        int i76 = 1048575;
                        int i77 = i74 & 1048575;
                        if (i77 != i66) {
                            if (i66 != 1048575) {
                                unsafe3.putInt(obj4, i66, i64);
                                i76 = 1048575;
                            }
                            i21 = i77 == i76 ? 0 : unsafe3.getInt(obj4, i77);
                            i22 = i77;
                        } else {
                            i21 = i64;
                            i22 = i66;
                        }
                        switch (zzt) {
                            case 0:
                                zzikVar3 = zzikVar;
                                i23 = i69;
                                i24 = 1;
                                i15 = -1;
                                i25 = i73;
                                if (i71 != 1) {
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    i26 = i67 + 8;
                                    i21 |= i75;
                                    zzni.zzo(obj4, j3, Double.longBitsToDouble(zzil.zzp(bArr2, i67)));
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    i65 = i25;
                                    i62 = i23;
                                    i60 = i15;
                                    i61 = i26;
                                    i59 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    i58 = 3;
                                }
                            case 1:
                                zzikVar3 = zzikVar;
                                i23 = i69;
                                i24 = 1;
                                i15 = -1;
                                i25 = i73;
                                if (i71 != 5) {
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    i26 = i67 + 4;
                                    i21 |= i75;
                                    zzni.zzp(obj4, j3, Float.intBitsToFloat(zzil.zzb(bArr2, i67)));
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    i65 = i25;
                                    i62 = i23;
                                    i60 = i15;
                                    i61 = i26;
                                    i59 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    i58 = 3;
                                }
                            case 2:
                            case 3:
                                zzikVar3 = zzikVar;
                                i23 = i69;
                                i24 = 1;
                                i15 = -1;
                                i25 = i73;
                                if (i71 != 0) {
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    i27 = i21 | i75;
                                    int zzl = zzil.zzl(bArr2, i67, zzikVar3);
                                    unsafe3.putLong(obj, j3, zzikVar3.zzb);
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    i59 = 1;
                                    i65 = i25;
                                    i61 = zzl;
                                    i66 = i22;
                                    i60 = -1;
                                    i58 = 3;
                                    i64 = i27;
                                    i62 = i23;
                                }
                            case 4:
                            case 11:
                                zzikVar3 = zzikVar;
                                i23 = i69;
                                i24 = 1;
                                i15 = -1;
                                i25 = i73;
                                if (i71 != 0) {
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    i28 = i21 | i75;
                                    zzi = zzil.zzi(bArr2, i67, zzikVar3);
                                    unsafe3.putInt(obj4, j3, zzikVar3.zza);
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    i65 = i25;
                                    i62 = i23;
                                    i60 = i15;
                                    i61 = zzi;
                                    i58 = 3;
                                    i29 = i22;
                                    i64 = i28;
                                    i59 = i24;
                                    i66 = i29;
                                }
                            case 5:
                            case 14:
                                zzikVar3 = zzikVar;
                                i23 = i69;
                                i24 = 1;
                                i15 = -1;
                                i25 = i73;
                                if (i71 != 1) {
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    int i78 = i75 | i21;
                                    unsafe3.putLong(obj, j3, zzil.zzp(bArr2, i67));
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    i61 = i67 + 8;
                                    i59 = 1;
                                    i65 = i25;
                                    i66 = i22;
                                    i62 = i23;
                                    i58 = 3;
                                    i64 = i78;
                                    i60 = -1;
                                }
                            case 6:
                            case 13:
                                zzikVar3 = zzikVar;
                                i23 = i69;
                                i24 = 1;
                                i15 = -1;
                                i25 = i73;
                                if (i71 != 5) {
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    i26 = i67 + 4;
                                    i21 |= i75;
                                    unsafe3.putInt(obj4, j3, zzil.zzb(bArr2, i67));
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    i65 = i25;
                                    i62 = i23;
                                    i60 = i15;
                                    i61 = i26;
                                    i59 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    i58 = 3;
                                }
                            case 7:
                                zzikVar3 = zzikVar;
                                i23 = i69;
                                i24 = 1;
                                i15 = -1;
                                i25 = i73;
                                if (i71 != 0) {
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    i28 = i21 | i75;
                                    zzi = zzil.zzl(bArr2, i67, zzikVar3);
                                    zzni.zzm(obj4, j3, zzikVar3.zzb != 0);
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    i65 = i25;
                                    i62 = i23;
                                    i60 = i15;
                                    i61 = zzi;
                                    i58 = 3;
                                    i29 = i22;
                                    i64 = i28;
                                    i59 = i24;
                                    i66 = i29;
                                }
                            case 8:
                                zzikVar3 = zzikVar;
                                i24 = 1;
                                i15 = -1;
                                i23 = i69;
                                i25 = i73;
                                if (i71 != 2) {
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    if (zzM(i72)) {
                                        i26 = zzil.zzi(bArr2, i67, zzikVar3);
                                        int i79 = zzikVar3.zza;
                                        if (i79 < 0) {
                                            throw zzlc.zzf();
                                        }
                                        i21 |= i75;
                                        if (i79 == 0) {
                                            zzikVar3.zzc = "";
                                        } else {
                                            zzikVar3.zzc = zznl.zzd(bArr2, i26, i79);
                                            i26 += i79;
                                        }
                                    } else {
                                        i21 |= i75;
                                        i26 = zzil.zzg(bArr2, i67, zzikVar3);
                                    }
                                    unsafe3.putObject(obj4, j3, zzikVar3.zzc);
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    i65 = i25;
                                    i62 = i23;
                                    i60 = i15;
                                    i61 = i26;
                                    i59 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    i58 = 3;
                                }
                            case 9:
                                zzikVar3 = zzikVar;
                                unsafe2 = unsafe3;
                                i24 = 1;
                                i15 = -1;
                                i23 = i69;
                                i25 = i73;
                                if (i71 != 2) {
                                    unsafe3 = unsafe2;
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    i27 = i21 | i75;
                                    Object zzA = zzmaVar.zzA(obj4, i63);
                                    unsafe3 = unsafe2;
                                    i56 = i8;
                                    int zzn = zzil.zzn(zzA, zzmaVar.zzx(i63), bArr, i67, i56, zzikVar);
                                    zzmaVar.zzJ(obj4, i63, zzA);
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    i65 = i25;
                                    i60 = -1;
                                    i58 = 3;
                                    i61 = zzn;
                                    i59 = 1;
                                    i66 = i22;
                                    i64 = i27;
                                    i62 = i23;
                                }
                            case 10:
                                zzikVar3 = zzikVar;
                                unsafe2 = unsafe3;
                                i24 = 1;
                                i15 = -1;
                                i23 = i69;
                                i25 = i73;
                                if (i71 != 2) {
                                    bArr2 = bArr;
                                    unsafe3 = unsafe2;
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    int i80 = i21 | i75;
                                    bArr2 = bArr;
                                    int zza3 = zzil.zza(bArr2, i67, zzikVar3);
                                    unsafe2.putObject(obj4, j3, zzikVar3.zzc);
                                    i56 = i8;
                                    i57 = i9;
                                    unsafe3 = unsafe2;
                                    zzikVar7 = zzikVar3;
                                    i59 = 1;
                                    i65 = i25;
                                    i66 = i22;
                                    i62 = i23;
                                    i60 = -1;
                                    i64 = i80;
                                    i61 = zza3;
                                    i58 = 3;
                                }
                            case 12:
                                zzikVar3 = zzikVar;
                                unsafe2 = unsafe3;
                                i24 = 1;
                                i15 = -1;
                                i23 = i69;
                                i25 = i73;
                                if (i71 != 0) {
                                    bArr2 = bArr;
                                    unsafe3 = unsafe2;
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    i26 = zzil.zzi(bArr2, i67, zzikVar3);
                                    int i81 = zzikVar3.zza;
                                    zzkw zzw = zzmaVar.zzw(i63);
                                    if ((i72 & Integer.MIN_VALUE) == 0 || zzw == null || zzw.zza(i81)) {
                                        i21 |= i75;
                                        unsafe2.putInt(obj4, j3, i81);
                                    } else {
                                        zzd(obj).zzj(i25, Long.valueOf(i81));
                                    }
                                    bArr2 = bArr;
                                    i56 = i8;
                                    i57 = i9;
                                    unsafe3 = unsafe2;
                                    zzikVar7 = zzikVar3;
                                    i65 = i25;
                                    i62 = i23;
                                    i60 = i15;
                                    i61 = i26;
                                    i59 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    i58 = 3;
                                }
                            case 15:
                                zzikVar3 = zzikVar;
                                i24 = 1;
                                i15 = -1;
                                i25 = i73;
                                Unsafe unsafe4 = unsafe3;
                                i23 = i69;
                                if (i71 != 0) {
                                    unsafe3 = unsafe4;
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    i28 = i21 | i75;
                                    zzi = zzil.zzi(bArr2, i67, zzikVar3);
                                    unsafe4.putInt(obj4, j3, zzjb.zzF(zzikVar3.zza));
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar3;
                                    unsafe3 = unsafe4;
                                    i65 = i25;
                                    i62 = i23;
                                    i60 = i15;
                                    i61 = zzi;
                                    i58 = 3;
                                    i29 = i22;
                                    i64 = i28;
                                    i59 = i24;
                                    i66 = i29;
                                }
                            case 16:
                                i15 = -1;
                                i25 = i73;
                                Unsafe unsafe5 = unsafe3;
                                if (i71 != 0) {
                                    i23 = i69;
                                    unsafe3 = unsafe5;
                                    zzikVar3 = zzikVar;
                                    i24 = 1;
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    int i82 = i21 | i75;
                                    int zzl2 = zzil.zzl(bArr2, i67, zzikVar);
                                    unsafe5.putLong(obj, j3, zzjb.zzG(zzikVar.zzb));
                                    unsafe3 = unsafe5;
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar;
                                    i65 = i25;
                                    i59 = 1;
                                    i62 = i69;
                                    i60 = -1;
                                    i58 = 3;
                                    i29 = i22;
                                    i64 = i82;
                                    i61 = zzl2;
                                    i66 = i29;
                                }
                            default:
                                if (i71 != 3) {
                                    i15 = -1;
                                    zzikVar3 = zzikVar;
                                    i23 = i69;
                                    i24 = 1;
                                    i25 = i73;
                                    i11 = i9;
                                    i13 = i25;
                                    unsafe = unsafe3;
                                    i17 = i23;
                                    i14 = 3;
                                    i18 = i67;
                                    zzikVar2 = zzikVar3;
                                    i16 = i63;
                                    i10 = i24;
                                    i66 = i22;
                                    i64 = i21;
                                    break;
                                } else {
                                    int i83 = i21 | i75;
                                    Object zzA2 = zzmaVar.zzA(obj4, i63);
                                    i61 = zzil.zzm(zzA2, zzmaVar.zzx(i63), bArr, i67, i8, (i69 << 3) | 4, zzikVar);
                                    zzmaVar.zzJ(obj4, i63, zzA2);
                                    unsafe3 = unsafe3;
                                    i58 = 3;
                                    i62 = i69;
                                    i65 = i73;
                                    i63 = i63;
                                    i66 = i22;
                                    i60 = -1;
                                    i56 = i8;
                                    i57 = i9;
                                    zzikVar7 = zzikVar;
                                    i64 = i83;
                                    i59 = 1;
                                }
                        }
                    } else {
                        zzik zzikVar8 = zzikVar7;
                        i15 = -1;
                        if (zzt != 27) {
                            i30 = i66;
                            Unsafe unsafe6 = unsafe3;
                            if (zzt <= 49) {
                                long j7 = i72;
                                Unsafe unsafe7 = zzb;
                                zzkz zzkzVar = (zzkz) unsafe7.getObject(obj4, j3);
                                if (zzkzVar.zzc()) {
                                    j = j7;
                                } else {
                                    int size = zzkzVar.size();
                                    j = j7;
                                    zzkzVar = zzkzVar.zzd(size != 0 ? size + size : 10);
                                    unsafe7.putObject(obj4, j3, zzkzVar);
                                }
                                zzkz zzkzVar2 = zzkzVar;
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        unsafe = unsafe6;
                                        i35 = i67;
                                        i36 = i63;
                                        i37 = i69;
                                        i38 = i73;
                                        zzikVar5 = zzikVar8;
                                        i39 = 3;
                                        i40 = 1;
                                        i41 = i8;
                                        if (i71 == 2) {
                                            zzjx zzjxVar = (zzjx) zzkzVar2;
                                            i42 = zzil.zzi(bArr2, i35, zzikVar5);
                                            int i84 = zzikVar5.zza + i42;
                                            while (i42 < i84) {
                                                zzjxVar.zzf(Double.longBitsToDouble(zzil.zzp(bArr2, i42)));
                                                i42 += 8;
                                            }
                                            if (i42 != i84) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i71 == 1) {
                                                i42 = i35 + 8;
                                                zzjx zzjxVar2 = (zzjx) zzkzVar2;
                                                zzjxVar2.zzf(Double.longBitsToDouble(zzil.zzp(bArr2, i35)));
                                                while (i42 < i41) {
                                                    int zzi3 = zzil.zzi(bArr2, i42, zzikVar5);
                                                    if (i38 == zzikVar5.zza) {
                                                        zzjxVar2.zzf(Double.longBitsToDouble(zzil.zzp(bArr2, zzi3)));
                                                        i42 = zzi3 + 8;
                                                    }
                                                }
                                            }
                                            i42 = i35;
                                        }
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                            obj4 = obj;
                                            i11 = i9;
                                            i16 = i36;
                                            i17 = i37;
                                            zzikVar2 = zzikVar5;
                                            i14 = i39;
                                            i10 = i40;
                                            i13 = i38;
                                            i66 = i30;
                                            i18 = i42;
                                            break;
                                        } else {
                                            obj4 = obj;
                                            i57 = i9;
                                            i62 = i37;
                                            i56 = i41;
                                            i58 = i39;
                                            i65 = i38;
                                            i60 = -1;
                                            i66 = i30;
                                            unsafe3 = unsafe;
                                            i61 = i42;
                                            i59 = i40;
                                            zzik zzikVar9 = zzikVar5;
                                            i63 = i36;
                                            zzikVar7 = zzikVar9;
                                        }
                                    case 19:
                                    case 36:
                                        unsafe = unsafe6;
                                        i35 = i67;
                                        i36 = i63;
                                        i37 = i69;
                                        i38 = i73;
                                        zzikVar5 = zzikVar8;
                                        i39 = 3;
                                        i40 = 1;
                                        i41 = i8;
                                        if (i71 == 2) {
                                            zzkk zzkkVar = (zzkk) zzkzVar2;
                                            i42 = zzil.zzi(bArr2, i35, zzikVar5);
                                            int i85 = zzikVar5.zza + i42;
                                            while (i42 < i85) {
                                                zzkkVar.zzf(Float.intBitsToFloat(zzil.zzb(bArr2, i42)));
                                                i42 += 4;
                                            }
                                            if (i42 != i85) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i71 == 5) {
                                                i42 = i35 + 4;
                                                zzkk zzkkVar2 = (zzkk) zzkzVar2;
                                                zzkkVar2.zzf(Float.intBitsToFloat(zzil.zzb(bArr2, i35)));
                                                while (i42 < i41) {
                                                    int zzi4 = zzil.zzi(bArr2, i42, zzikVar5);
                                                    if (i38 == zzikVar5.zza) {
                                                        zzkkVar2.zzf(Float.intBitsToFloat(zzil.zzb(bArr2, zzi4)));
                                                        i42 = zzi4 + 4;
                                                    }
                                                }
                                            }
                                            i42 = i35;
                                        }
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    case 20:
                                    case zzbbd.zzt.zzm /* 21 */:
                                    case 37:
                                    case 38:
                                        unsafe = unsafe6;
                                        i35 = i67;
                                        i36 = i63;
                                        i37 = i69;
                                        i38 = i73;
                                        zzikVar5 = zzikVar8;
                                        i39 = 3;
                                        i40 = 1;
                                        i41 = i8;
                                        if (i71 == 2) {
                                            zzlm zzlmVar = (zzlm) zzkzVar2;
                                            i42 = zzil.zzi(bArr2, i35, zzikVar5);
                                            int i86 = zzikVar5.zza + i42;
                                            while (i42 < i86) {
                                                i42 = zzil.zzl(bArr2, i42, zzikVar5);
                                                zzlmVar.zzg(zzikVar5.zzb);
                                            }
                                            if (i42 != i86) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i71 == 0) {
                                                zzlm zzlmVar2 = (zzlm) zzkzVar2;
                                                i42 = zzil.zzl(bArr2, i35, zzikVar5);
                                                zzlmVar2.zzg(zzikVar5.zzb);
                                                while (i42 < i41) {
                                                    int zzi5 = zzil.zzi(bArr2, i42, zzikVar5);
                                                    if (i38 == zzikVar5.zza) {
                                                        i42 = zzil.zzl(bArr2, zzi5, zzikVar5);
                                                        zzlmVar2.zzg(zzikVar5.zzb);
                                                    }
                                                }
                                            }
                                            i42 = i35;
                                        }
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe = unsafe6;
                                        i43 = i8;
                                        i35 = i67;
                                        i44 = i63;
                                        i45 = i69;
                                        i46 = i73;
                                        zzikVar6 = zzikVar8;
                                        i47 = 3;
                                        i40 = 1;
                                        if (i71 == 2) {
                                            zzf = zzil.zzf(bArr2, i35, zzkzVar2, zzikVar6);
                                            i39 = i47;
                                            zzikVar5 = zzikVar6;
                                            i38 = i46;
                                            i37 = i45;
                                            i36 = i44;
                                            i42 = zzf;
                                            i41 = i43;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        } else {
                                            if (i71 == 0) {
                                                i39 = 3;
                                                i41 = i43;
                                                zzikVar5 = zzikVar6;
                                                i38 = i46;
                                                i42 = zzil.zzk(i46, bArr, i35, i8, zzkzVar2, zzikVar);
                                                i37 = i45;
                                                i36 = i44;
                                                zzmaVar = this;
                                                if (i42 != i35) {
                                                }
                                            }
                                            i39 = i47;
                                            i41 = i43;
                                            zzikVar5 = zzikVar6;
                                            i38 = i46;
                                            i37 = i45;
                                            i36 = i44;
                                            i42 = i35;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        unsafe = unsafe6;
                                        i43 = i8;
                                        i35 = i67;
                                        i44 = i63;
                                        i45 = i69;
                                        i46 = i73;
                                        zzikVar6 = zzikVar8;
                                        i47 = 3;
                                        if (i71 == 2) {
                                            zzlm zzlmVar3 = (zzlm) zzkzVar2;
                                            zzi2 = zzil.zzi(bArr2, i35, zzikVar6);
                                            int i87 = zzikVar6.zza + zzi2;
                                            while (zzi2 < i87) {
                                                zzlmVar3.zzg(zzil.zzp(bArr2, zzi2));
                                                zzi2 += 8;
                                            }
                                            if (zzi2 != i87) {
                                                throw zzlc.zzi();
                                            }
                                            i39 = i47;
                                            zzikVar5 = zzikVar6;
                                            i38 = i46;
                                            i37 = i45;
                                            i36 = i44;
                                            i42 = zzi2;
                                            i40 = 1;
                                            i41 = i43;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        } else {
                                            i40 = 1;
                                            if (i71 == 1) {
                                                zzf = i35 + 8;
                                                zzlm zzlmVar4 = (zzlm) zzkzVar2;
                                                zzlmVar4.zzg(zzil.zzp(bArr2, i35));
                                                while (zzf < i43) {
                                                    int zzi6 = zzil.zzi(bArr2, zzf, zzikVar6);
                                                    if (i46 == zzikVar6.zza) {
                                                        zzlmVar4.zzg(zzil.zzp(bArr2, zzi6));
                                                        zzf = zzi6 + 8;
                                                    } else {
                                                        i39 = i47;
                                                        zzikVar5 = zzikVar6;
                                                        i38 = i46;
                                                        i37 = i45;
                                                        i36 = i44;
                                                        i42 = zzf;
                                                        i41 = i43;
                                                        zzmaVar = this;
                                                        if (i42 != i35) {
                                                        }
                                                    }
                                                }
                                                i39 = i47;
                                                zzikVar5 = zzikVar6;
                                                i38 = i46;
                                                i37 = i45;
                                                i36 = i44;
                                                i42 = zzf;
                                                i41 = i43;
                                                zzmaVar = this;
                                                if (i42 != i35) {
                                                }
                                            }
                                            i39 = i47;
                                            i41 = i43;
                                            zzikVar5 = zzikVar6;
                                            i38 = i46;
                                            i37 = i45;
                                            i36 = i44;
                                            i42 = i35;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe = unsafe6;
                                        i43 = i8;
                                        i35 = i67;
                                        i44 = i63;
                                        i45 = i69;
                                        i46 = i73;
                                        zzikVar6 = zzikVar8;
                                        i47 = 3;
                                        if (i71 == 2) {
                                            zzkt zzktVar = (zzkt) zzkzVar2;
                                            zzi2 = zzil.zzi(bArr2, i35, zzikVar6);
                                            int i88 = zzikVar6.zza + zzi2;
                                            while (zzi2 < i88) {
                                                zzktVar.zzh(zzil.zzb(bArr2, zzi2));
                                                zzi2 += 4;
                                            }
                                            if (zzi2 != i88) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i71 == 5) {
                                                zzi2 = i35 + 4;
                                                zzkt zzktVar2 = (zzkt) zzkzVar2;
                                                zzktVar2.zzh(zzil.zzb(bArr2, i35));
                                                while (zzi2 < i43) {
                                                    int zzi7 = zzil.zzi(bArr2, zzi2, zzikVar6);
                                                    if (i46 == zzikVar6.zza) {
                                                        zzktVar2.zzh(zzil.zzb(bArr2, zzi7));
                                                        zzi2 = zzi7 + 4;
                                                    }
                                                }
                                            }
                                            i39 = i47;
                                            i41 = i43;
                                            zzikVar5 = zzikVar6;
                                            i38 = i46;
                                            i37 = i45;
                                            i36 = i44;
                                            i40 = 1;
                                            i42 = i35;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        i39 = i47;
                                        zzikVar5 = zzikVar6;
                                        i38 = i46;
                                        i37 = i45;
                                        i36 = i44;
                                        i42 = zzi2;
                                        i40 = 1;
                                        i41 = i43;
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe = unsafe6;
                                        i43 = i8;
                                        i35 = i67;
                                        i44 = i63;
                                        i45 = i69;
                                        i46 = i73;
                                        zzikVar6 = zzikVar8;
                                        i47 = 3;
                                        if (i71 == 2) {
                                            zzim zzimVar = (zzim) zzkzVar2;
                                            zzi2 = zzil.zzi(bArr2, i35, zzikVar6);
                                            int i89 = zzikVar6.zza + zzi2;
                                            while (zzi2 < i89) {
                                                zzi2 = zzil.zzl(bArr2, zzi2, zzikVar6);
                                                zzimVar.zze(zzikVar6.zzb != 0);
                                            }
                                            if (zzi2 != i89) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i71 == 0) {
                                                zzim zzimVar2 = (zzim) zzkzVar2;
                                                zzi2 = zzil.zzl(bArr2, i35, zzikVar6);
                                                zzimVar2.zze(zzikVar6.zzb != 0);
                                                while (zzi2 < i43) {
                                                    int zzi8 = zzil.zzi(bArr2, zzi2, zzikVar6);
                                                    if (i46 == zzikVar6.zza) {
                                                        zzi2 = zzil.zzl(bArr2, zzi8, zzikVar6);
                                                        zzimVar2.zze(zzikVar6.zzb != 0);
                                                    }
                                                }
                                            }
                                            i39 = i47;
                                            i41 = i43;
                                            zzikVar5 = zzikVar6;
                                            i38 = i46;
                                            i37 = i45;
                                            i36 = i44;
                                            i40 = 1;
                                            i42 = i35;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        i39 = i47;
                                        zzikVar5 = zzikVar6;
                                        i38 = i46;
                                        i37 = i45;
                                        i36 = i44;
                                        i42 = zzi2;
                                        i40 = 1;
                                        i41 = i43;
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    case 26:
                                        unsafe = unsafe6;
                                        i43 = i8;
                                        i35 = i67;
                                        i44 = i63;
                                        i45 = i69;
                                        i46 = i73;
                                        zzikVar6 = zzikVar8;
                                        i47 = 3;
                                        if (i71 == 2) {
                                            if ((j & 536870912) == 0) {
                                                zzi2 = zzil.zzi(bArr2, i35, zzikVar6);
                                                int i90 = zzikVar6.zza;
                                                if (i90 < 0) {
                                                    throw zzlc.zzf();
                                                }
                                                if (i90 == 0) {
                                                    obj3 = "";
                                                    zzkzVar2.add(obj3);
                                                } else {
                                                    obj3 = "";
                                                    zzkzVar2.add(new String(bArr2, zzi2, i90, zzla.zza));
                                                    zzi2 += i90;
                                                }
                                                while (zzi2 < i43) {
                                                    int zzi9 = zzil.zzi(bArr2, zzi2, zzikVar6);
                                                    if (i46 == zzikVar6.zza) {
                                                        zzi2 = zzil.zzi(bArr2, zzi9, zzikVar6);
                                                        int i91 = zzikVar6.zza;
                                                        if (i91 < 0) {
                                                            throw zzlc.zzf();
                                                        }
                                                        if (i91 == 0) {
                                                            zzkzVar2.add(obj3);
                                                        } else {
                                                            zzkzVar2.add(new String(bArr2, zzi2, i91, zzla.zza));
                                                            zzi2 += i91;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzi2 = zzil.zzi(bArr2, i35, zzikVar6);
                                                int i92 = zzikVar6.zza;
                                                if (i92 < 0) {
                                                    throw zzlc.zzf();
                                                }
                                                if (i92 == 0) {
                                                    zzkzVar2.add("");
                                                } else {
                                                    int i93 = zzi2 + i92;
                                                    if (!zznl.zze(bArr2, zzi2, i93)) {
                                                        throw zzlc.zzd();
                                                    }
                                                    zzkzVar2.add(new String(bArr2, zzi2, i92, zzla.zza));
                                                    zzi2 = i93;
                                                }
                                                while (zzi2 < i43) {
                                                    int zzi10 = zzil.zzi(bArr2, zzi2, zzikVar6);
                                                    if (i46 == zzikVar6.zza) {
                                                        zzi2 = zzil.zzi(bArr2, zzi10, zzikVar6);
                                                        int i94 = zzikVar6.zza;
                                                        if (i94 < 0) {
                                                            throw zzlc.zzf();
                                                        }
                                                        if (i94 == 0) {
                                                            zzkzVar2.add("");
                                                        } else {
                                                            int i95 = zzi2 + i94;
                                                            if (!zznl.zze(bArr2, zzi2, i95)) {
                                                                throw zzlc.zzd();
                                                            }
                                                            zzkzVar2.add(new String(bArr2, zzi2, i94, zzla.zza));
                                                            zzi2 = i95;
                                                        }
                                                    }
                                                }
                                            }
                                            i39 = i47;
                                            zzikVar5 = zzikVar6;
                                            i38 = i46;
                                            i37 = i45;
                                            i36 = i44;
                                            i42 = zzi2;
                                            i40 = 1;
                                            i41 = i43;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        i39 = i47;
                                        i41 = i43;
                                        zzikVar5 = zzikVar6;
                                        i38 = i46;
                                        i37 = i45;
                                        i36 = i44;
                                        i40 = 1;
                                        i42 = i35;
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    case 27:
                                        unsafe = unsafe6;
                                        i48 = i8;
                                        i35 = i67;
                                        c3 = 2;
                                        if (i71 == 2) {
                                            i44 = i63;
                                            i45 = i69;
                                            i46 = i73;
                                            zzikVar6 = zzikVar8;
                                            i43 = i48;
                                            i47 = 3;
                                            zzi2 = zzil.zze(zzmaVar.zzx(i63), i73, bArr, i35, i8, zzkzVar2, zzikVar);
                                            i39 = i47;
                                            zzikVar5 = zzikVar6;
                                            i38 = i46;
                                            i37 = i45;
                                            i36 = i44;
                                            i42 = zzi2;
                                            i40 = 1;
                                            i41 = i43;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        i36 = i63;
                                        i37 = i69;
                                        zzikVar5 = zzikVar8;
                                        i41 = i48;
                                        i40 = 1;
                                        i38 = i73;
                                        i39 = 3;
                                        i42 = i35;
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    case 28:
                                        unsafe = unsafe6;
                                        i48 = i8;
                                        i35 = i67;
                                        c3 = 2;
                                        if (i71 == 2) {
                                            i42 = zzil.zzi(bArr2, i35, zzikVar8);
                                            int i96 = zzikVar8.zza;
                                            if (i96 < 0) {
                                                throw zzlc.zzf();
                                            }
                                            if (i96 > bArr2.length - i42) {
                                                throw zzlc.zzi();
                                            }
                                            if (i96 == 0) {
                                                zzkzVar2.add(zziv.zzb);
                                            } else {
                                                zzkzVar2.add(zziv.zzk(bArr2, i42, i96));
                                                i42 += i96;
                                            }
                                            while (i42 < i48) {
                                                int zzi11 = zzil.zzi(bArr2, i42, zzikVar8);
                                                if (i73 == zzikVar8.zza) {
                                                    i42 = zzil.zzi(bArr2, zzi11, zzikVar8);
                                                    int i97 = zzikVar8.zza;
                                                    if (i97 < 0) {
                                                        throw zzlc.zzf();
                                                    }
                                                    if (i97 > bArr2.length - i42) {
                                                        throw zzlc.zzi();
                                                    }
                                                    if (i97 == 0) {
                                                        zzkzVar2.add(zziv.zzb);
                                                    } else {
                                                        zzkzVar2.add(zziv.zzk(bArr2, i42, i97));
                                                        i42 += i97;
                                                    }
                                                } else {
                                                    i36 = i63;
                                                    i37 = i69;
                                                    zzikVar5 = zzikVar8;
                                                    i41 = i48;
                                                    i40 = 1;
                                                    i38 = i73;
                                                    i39 = 3;
                                                    zzmaVar = this;
                                                    if (i42 != i35) {
                                                    }
                                                }
                                            }
                                            i36 = i63;
                                            i37 = i69;
                                            zzikVar5 = zzikVar8;
                                            i41 = i48;
                                            i40 = 1;
                                            i38 = i73;
                                            i39 = 3;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        i36 = i63;
                                        i37 = i69;
                                        zzikVar5 = zzikVar8;
                                        i41 = i48;
                                        i40 = 1;
                                        i38 = i73;
                                        i39 = 3;
                                        i42 = i35;
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        unsafe = unsafe6;
                                        i48 = i8;
                                        i35 = i67;
                                        if (i71 == 2) {
                                            zzk = zzil.zzf(bArr2, i35, zzkzVar2, zzikVar8);
                                        } else {
                                            if (i71 == 0) {
                                                zzk = zzil.zzk(i73, bArr, i35, i8, zzkzVar2, zzikVar);
                                            }
                                            i36 = i63;
                                            i37 = i69;
                                            zzikVar5 = zzikVar8;
                                            i41 = i48;
                                            i40 = 1;
                                            i38 = i73;
                                            i39 = 3;
                                            i42 = i35;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        int i98 = zzk;
                                        zzmm.zzo(obj, i69, zzkzVar2, zzmaVar.zzw(i63), null, zzmaVar.zzm);
                                        i36 = i63;
                                        i42 = i98;
                                        i37 = i69;
                                        zzikVar5 = zzikVar8;
                                        i41 = i48;
                                        i40 = 1;
                                        i38 = i73;
                                        i39 = 3;
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        unsafe = unsafe6;
                                        i48 = i8;
                                        i35 = i67;
                                        if (i71 == 2) {
                                            zzkt zzktVar3 = (zzkt) zzkzVar2;
                                            i42 = zzil.zzi(bArr2, i35, zzikVar8);
                                            int i99 = zzikVar8.zza + i42;
                                            while (i42 < i99) {
                                                i42 = zzil.zzi(bArr2, i42, zzikVar8);
                                                zzktVar3.zzh(zzjb.zzF(zzikVar8.zza));
                                            }
                                            if (i42 != i99) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i71 == 0) {
                                                zzkt zzktVar4 = (zzkt) zzkzVar2;
                                                i42 = zzil.zzi(bArr2, i35, zzikVar8);
                                                zzktVar4.zzh(zzjb.zzF(zzikVar8.zza));
                                                while (i42 < i48) {
                                                    int zzi12 = zzil.zzi(bArr2, i42, zzikVar8);
                                                    if (i73 == zzikVar8.zza) {
                                                        i42 = zzil.zzi(bArr2, zzi12, zzikVar8);
                                                        zzktVar4.zzh(zzjb.zzF(zzikVar8.zza));
                                                    }
                                                }
                                            }
                                            i36 = i63;
                                            i37 = i69;
                                            zzikVar5 = zzikVar8;
                                            i41 = i48;
                                            i40 = 1;
                                            i38 = i73;
                                            i39 = 3;
                                            i42 = i35;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        i36 = i63;
                                        i37 = i69;
                                        zzikVar5 = zzikVar8;
                                        i41 = i48;
                                        i40 = 1;
                                        i38 = i73;
                                        i39 = 3;
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        unsafe = unsafe6;
                                        i48 = i8;
                                        i35 = i67;
                                        if (i71 == 2) {
                                            zzlm zzlmVar5 = (zzlm) zzkzVar2;
                                            i42 = zzil.zzi(bArr2, i35, zzikVar8);
                                            int i100 = zzikVar8.zza + i42;
                                            while (i42 < i100) {
                                                i42 = zzil.zzl(bArr2, i42, zzikVar8);
                                                zzlmVar5.zzg(zzjb.zzG(zzikVar8.zzb));
                                            }
                                            if (i42 != i100) {
                                                throw zzlc.zzi();
                                            }
                                        } else {
                                            if (i71 == 0) {
                                                zzlm zzlmVar6 = (zzlm) zzkzVar2;
                                                i42 = zzil.zzl(bArr2, i35, zzikVar8);
                                                zzlmVar6.zzg(zzjb.zzG(zzikVar8.zzb));
                                                while (i42 < i48) {
                                                    int zzi13 = zzil.zzi(bArr2, i42, zzikVar8);
                                                    if (i73 == zzikVar8.zza) {
                                                        i42 = zzil.zzl(bArr2, zzi13, zzikVar8);
                                                        zzlmVar6.zzg(zzjb.zzG(zzikVar8.zzb));
                                                    }
                                                }
                                            }
                                            i36 = i63;
                                            i37 = i69;
                                            zzikVar5 = zzikVar8;
                                            i41 = i48;
                                            i40 = 1;
                                            i38 = i73;
                                            i39 = 3;
                                            i42 = i35;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        i36 = i63;
                                        i37 = i69;
                                        zzikVar5 = zzikVar8;
                                        i41 = i48;
                                        i40 = 1;
                                        i38 = i73;
                                        i39 = 3;
                                        zzmaVar = this;
                                        if (i42 != i35) {
                                        }
                                        break;
                                    default:
                                        if (i71 == 3) {
                                            int i101 = (i73 & (-8)) | 4;
                                            zzmk zzx = zzmaVar.zzx(i63);
                                            i35 = i67;
                                            unsafe = unsafe6;
                                            i42 = zzil.zzc(zzx, bArr, i67, i8, i101, zzikVar);
                                            zzkzVar2.add(zzikVar8.zzc);
                                            for (int i102 = i8; i42 < i102; i102 = i102) {
                                                int zzi14 = zzil.zzi(bArr2, i42, zzikVar8);
                                                if (i73 == zzikVar8.zza) {
                                                    i42 = zzil.zzc(zzx, bArr, zzi14, i8, i101, zzikVar);
                                                    zzkzVar2.add(zzikVar8.zzc);
                                                } else {
                                                    i48 = i102;
                                                    i36 = i63;
                                                    i37 = i69;
                                                    zzikVar5 = zzikVar8;
                                                    i41 = i48;
                                                    i40 = 1;
                                                    i38 = i73;
                                                    i39 = 3;
                                                    zzmaVar = this;
                                                    if (i42 != i35) {
                                                    }
                                                }
                                            }
                                            i48 = i102;
                                            i36 = i63;
                                            i37 = i69;
                                            zzikVar5 = zzikVar8;
                                            i41 = i48;
                                            i40 = 1;
                                            i38 = i73;
                                            i39 = 3;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        } else {
                                            unsafe = unsafe6;
                                            i35 = i67;
                                            i36 = i63;
                                            i37 = i69;
                                            zzikVar5 = zzikVar8;
                                            i40 = 1;
                                            i41 = i8;
                                            i38 = i73;
                                            i39 = 3;
                                            i42 = i35;
                                            zzmaVar = this;
                                            if (i42 != i35) {
                                            }
                                        }
                                        break;
                                }
                            } else {
                                unsafe = unsafe6;
                                int i103 = i67;
                                i31 = i63;
                                i34 = i69;
                                i32 = i73;
                                i33 = 3;
                                zzikVar4 = zzikVar8;
                                if (zzt != 50) {
                                    zzmaVar = this;
                                    obj4 = obj;
                                    Unsafe unsafe8 = zzb;
                                    long j8 = iArr[i31 + 2] & 1048575;
                                    switch (zzt) {
                                        case 51:
                                            i49 = i31;
                                            i17 = i34;
                                            i50 = i103;
                                            i51 = i32;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i71 == 1) {
                                                i52 = i50 + 8;
                                                unsafe8.putObject(obj4, j3, Double.valueOf(Double.longBitsToDouble(zzil.zzp(bArr2, i50))));
                                                unsafe8.putInt(obj4, j8, i17);
                                                i61 = i52;
                                                if (i61 == i50) {
                                                    i11 = i9;
                                                    i18 = i61;
                                                    i13 = i51;
                                                    i66 = i30;
                                                    i16 = i49;
                                                    break;
                                                } else {
                                                    i56 = i8;
                                                    i57 = i9;
                                                    i62 = i17;
                                                    zzikVar7 = zzikVar2;
                                                    i59 = i10;
                                                    i65 = i51;
                                                    i58 = i14;
                                                    i60 = -1;
                                                    i66 = i30;
                                                    unsafe3 = unsafe;
                                                    i63 = i49;
                                                }
                                            }
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                        case 52:
                                            i49 = i31;
                                            i17 = i34;
                                            i50 = i103;
                                            i51 = i32;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i71 == 5) {
                                                i52 = i50 + 4;
                                                unsafe8.putObject(obj4, j3, Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr2, i50))));
                                                unsafe8.putInt(obj4, j8, i17);
                                                i61 = i52;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i49 = i31;
                                            i17 = i34;
                                            i50 = i103;
                                            i53 = i32;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i71 == 0) {
                                                i52 = zzil.zzl(bArr2, i50, zzikVar2);
                                                i51 = i53;
                                                unsafe8.putObject(obj4, j3, Long.valueOf(zzikVar2.zzb));
                                                unsafe8.putInt(obj4, j8, i17);
                                                i61 = i52;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i51 = i53;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i49 = i31;
                                            i17 = i34;
                                            i50 = i103;
                                            i53 = i32;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i71 == 0) {
                                                i52 = zzil.zzi(bArr2, i50, zzikVar2);
                                                unsafe8.putObject(obj4, j3, Integer.valueOf(zzikVar2.zza));
                                                unsafe8.putInt(obj4, j8, i17);
                                                i51 = i53;
                                                i61 = i52;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i51 = i53;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i49 = i31;
                                            i17 = i34;
                                            i50 = i103;
                                            i53 = i32;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i71 == 1) {
                                                i52 = i50 + 8;
                                                unsafe8.putObject(obj4, j3, Long.valueOf(zzil.zzp(bArr2, i50)));
                                                unsafe8.putInt(obj4, j8, i17);
                                                i51 = i53;
                                                i61 = i52;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i51 = i53;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i49 = i31;
                                            i17 = i34;
                                            i50 = i103;
                                            i54 = i32;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i71 == 5) {
                                                i52 = i50 + 4;
                                                unsafe8.putObject(obj4, j3, Integer.valueOf(zzil.zzb(bArr2, i50)));
                                                unsafe8.putInt(obj4, j8, i17);
                                                i51 = i54;
                                                i10 = 1;
                                                i61 = i52;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i51 = i54;
                                            i10 = 1;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 58:
                                            i49 = i31;
                                            i17 = i34;
                                            i50 = i103;
                                            i54 = i32;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i71 == 0) {
                                                i52 = zzil.zzl(bArr2, i50, zzikVar2);
                                                unsafe8.putObject(obj4, j3, Boolean.valueOf(zzikVar2.zzb != 0));
                                                unsafe8.putInt(obj4, j8, i17);
                                                i51 = i54;
                                                i10 = 1;
                                                i61 = i52;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i51 = i54;
                                            i10 = 1;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 59:
                                            i49 = i31;
                                            i17 = i34;
                                            i50 = i103;
                                            i54 = i32;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            if (i71 == 2) {
                                                int zzi15 = zzil.zzi(bArr2, i50, zzikVar2);
                                                int i104 = zzikVar2.zza;
                                                if (i104 == 0) {
                                                    unsafe8.putObject(obj4, j3, "");
                                                } else {
                                                    int i105 = zzi15 + i104;
                                                    if ((i72 & 536870912) != 0 && !zznl.zze(bArr2, zzi15, i105)) {
                                                        throw zzlc.zzd();
                                                    }
                                                    unsafe8.putObject(obj4, j3, new String(bArr2, zzi15, i104, zzla.zza));
                                                    zzi15 = i105;
                                                }
                                                unsafe8.putInt(obj4, j8, i17);
                                                i51 = i54;
                                                i61 = zzi15;
                                                i10 = 1;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i51 = i54;
                                            i10 = 1;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 60:
                                            i50 = i103;
                                            i55 = i32;
                                            i14 = 3;
                                            if (i71 == 2) {
                                                Object zzB = zzmaVar.zzB(obj4, i34, i31);
                                                int zzn2 = zzil.zzn(zzB, zzmaVar.zzx(i31), bArr, i50, i8, zzikVar);
                                                zzmaVar.zzK(obj4, i34, i31, zzB);
                                                zzikVar2 = zzikVar4;
                                                i49 = i31;
                                                i17 = i34;
                                                i51 = i55;
                                                i61 = zzn2;
                                                i50 = i50;
                                                i10 = 1;
                                                if (i61 == i50) {
                                                }
                                            } else {
                                                i49 = i31;
                                                i17 = i34;
                                                i51 = i55;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                i61 = i50;
                                                if (i61 == i50) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            i50 = i103;
                                            i55 = i32;
                                            i14 = 3;
                                            if (i71 == 2) {
                                                zza2 = zzil.zza(bArr2, i50, zzikVar4);
                                                unsafe8.putObject(obj4, j3, zzikVar4.zzc);
                                                unsafe8.putInt(obj4, j8, i34);
                                                i49 = i31;
                                                i17 = i34;
                                                i51 = i55;
                                                i61 = zza2;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i49 = i31;
                                            i17 = i34;
                                            i51 = i55;
                                            i10 = 1;
                                            zzikVar2 = zzikVar4;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 63:
                                            i50 = i103;
                                            i55 = i32;
                                            i14 = 3;
                                            if (i71 == 0) {
                                                zza2 = zzil.zzi(bArr2, i50, zzikVar4);
                                                int i106 = zzikVar4.zza;
                                                zzkw zzw2 = zzmaVar.zzw(i31);
                                                if (zzw2 == null || zzw2.zza(i106)) {
                                                    unsafe8.putObject(obj4, j3, Integer.valueOf(i106));
                                                    unsafe8.putInt(obj4, j8, i34);
                                                } else {
                                                    zzd(obj).zzj(i55, Long.valueOf(i106));
                                                }
                                                i49 = i31;
                                                i17 = i34;
                                                i51 = i55;
                                                i61 = zza2;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i49 = i31;
                                            i17 = i34;
                                            i51 = i55;
                                            i10 = 1;
                                            zzikVar2 = zzikVar4;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 66:
                                            i50 = i103;
                                            i55 = i32;
                                            i14 = 3;
                                            if (i71 == 0) {
                                                zza2 = zzil.zzi(bArr2, i50, zzikVar4);
                                                unsafe8.putObject(obj4, j3, Integer.valueOf(zzjb.zzF(zzikVar4.zza)));
                                                unsafe8.putInt(obj4, j8, i34);
                                                i49 = i31;
                                                i17 = i34;
                                                i51 = i55;
                                                i61 = zza2;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i49 = i31;
                                            i17 = i34;
                                            i51 = i55;
                                            i10 = 1;
                                            zzikVar2 = zzikVar4;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 67:
                                            i50 = i103;
                                            i55 = i32;
                                            i14 = 3;
                                            if (i71 == 0) {
                                                zza2 = zzil.zzl(bArr2, i50, zzikVar4);
                                                unsafe8.putObject(obj4, j3, Long.valueOf(zzjb.zzG(zzikVar4.zzb)));
                                                unsafe8.putInt(obj4, j8, i34);
                                                i49 = i31;
                                                i17 = i34;
                                                i51 = i55;
                                                i61 = zza2;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (i61 == i50) {
                                                }
                                            }
                                            i49 = i31;
                                            i17 = i34;
                                            i51 = i55;
                                            i10 = 1;
                                            zzikVar2 = zzikVar4;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                        case 68:
                                            if (i71 == 3) {
                                                Object zzB2 = zzmaVar.zzB(obj4, i34, i31);
                                                i14 = 3;
                                                i50 = i103;
                                                i61 = zzil.zzm(zzB2, zzmaVar.zzx(i31), bArr, i103, i8, (i32 & (-8)) | 4, zzikVar);
                                                zzmaVar.zzK(obj4, i34, i31, zzB2);
                                                i49 = i31;
                                                i17 = i34;
                                                i51 = i32;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                if (i61 == i50) {
                                                }
                                            } else {
                                                i14 = 3;
                                                i49 = i31;
                                                i17 = i34;
                                                i50 = i103;
                                                i51 = i32;
                                                i10 = 1;
                                                zzikVar2 = zzikVar4;
                                                i61 = i50;
                                                if (i61 == i50) {
                                                }
                                            }
                                            break;
                                        default:
                                            i49 = i31;
                                            i17 = i34;
                                            i50 = i103;
                                            i51 = i32;
                                            i10 = 1;
                                            i14 = 3;
                                            zzikVar2 = zzikVar4;
                                            i61 = i50;
                                            if (i61 == i50) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i71 == 2) {
                                        Unsafe unsafe9 = zzb;
                                        Object zzz = zzz(i31);
                                        Object object = unsafe9.getObject(obj, j3);
                                        if (zzls.zza(object)) {
                                            zzlr zzb2 = zzlr.zza().zzb();
                                            zzls.zzb(zzb2, object);
                                            unsafe9.putObject(obj, j3, zzb2);
                                        }
                                        throw null;
                                    }
                                    i18 = i103;
                                    zzmaVar = this;
                                    obj4 = obj;
                                }
                            }
                        } else if (i71 == 2) {
                            zzkz zzkzVar3 = (zzkz) unsafe3.getObject(obj4, j3);
                            if (!zzkzVar3.zzc()) {
                                int size2 = zzkzVar3.size();
                                zzkzVar3 = zzkzVar3.zzd(size2 != 0 ? size2 + size2 : 10);
                                unsafe3.putObject(obj4, j3, zzkzVar3);
                            }
                            i61 = zzil.zze(zzmaVar.zzx(i63), i73, bArr, i67, i8, zzkzVar3, zzikVar);
                            i63 = i63;
                            unsafe3 = unsafe3;
                            i65 = i73;
                            i62 = i69;
                            i60 = -1;
                            i66 = i66;
                            i59 = 1;
                            i56 = i8;
                            i57 = i9;
                            zzikVar7 = zzikVar8;
                            i58 = 3;
                        } else {
                            i30 = i66;
                            unsafe = unsafe3;
                            zzikVar4 = zzikVar8;
                            i31 = i63;
                            i32 = i73;
                            i33 = 3;
                            i18 = i67;
                            i34 = i69;
                        }
                        i11 = i9;
                        i16 = i31;
                        i17 = i34;
                        i14 = i33;
                        i66 = i30;
                        i13 = i32;
                        i10 = 1;
                        zzikVar2 = zzikVar4;
                    }
                }
                if (i13 != i11 || i11 == 0) {
                    if (zzmaVar.zzh && (zzkdVar = zzikVar2.zzd) != zzkd.zza) {
                        zzkq zza4 = zzkdVar.zza(zzmaVar.zzg, i17);
                        if (zza4 != null) {
                            i19 = i17;
                            zzik zzikVar10 = zzikVar2;
                            zzko zzkoVar = (zzko) obj4;
                            zzkoVar.zzi();
                            zzki zzkiVar = zzkoVar.zzb;
                            zznm zznmVar = zza4.zza.zzb;
                            if (zznmVar == zznm.zzn) {
                                zzil.zzi(bArr2, i18, zzikVar10);
                                throw null;
                            }
                            switch (zznmVar.ordinal()) {
                                case 0:
                                    i20 = i18 + 8;
                                    obj5 = Double.valueOf(Double.longBitsToDouble(zzil.zzp(bArr2, i18)));
                                    i18 = i20;
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 1:
                                    i20 = i18 + 4;
                                    obj5 = Float.valueOf(Float.intBitsToFloat(zzil.zzb(bArr2, i18)));
                                    i18 = i20;
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 2:
                                case 3:
                                    i18 = zzil.zzl(bArr2, i18, zzikVar10);
                                    obj5 = Long.valueOf(zzikVar10.zzb);
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 4:
                                case 12:
                                    i18 = zzil.zzi(bArr2, i18, zzikVar10);
                                    obj5 = Integer.valueOf(zzikVar10.zza);
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 5:
                                case 15:
                                    i20 = i18 + 8;
                                    obj5 = Long.valueOf(zzil.zzp(bArr2, i18));
                                    i18 = i20;
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 6:
                                case 14:
                                    i20 = i18 + 4;
                                    obj5 = Integer.valueOf(zzil.zzb(bArr2, i18));
                                    i18 = i20;
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 7:
                                    i18 = zzil.zzl(bArr2, i18, zzikVar10);
                                    obj5 = Boolean.valueOf(zzikVar10.zzb != 0 ? i10 : 0);
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 8:
                                    i18 = zzil.zzg(bArr2, i18, zzikVar10);
                                    obj2 = zzikVar10.zzc;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 9:
                                    int i107 = zzmg.zza;
                                    throw null;
                                case 10:
                                    int i108 = zzmg.zza;
                                    throw null;
                                case 11:
                                    i18 = zzil.zza(bArr2, i18, zzikVar10);
                                    obj2 = zzikVar10.zzc;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 16:
                                    i18 = zzil.zzi(bArr2, i18, zzikVar10);
                                    obj5 = Integer.valueOf(zzjb.zzF(zzikVar10.zza));
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                case 17:
                                    i18 = zzil.zzl(bArr2, i18, zzikVar10);
                                    obj5 = Long.valueOf(zzjb.zzG(zzikVar10.zzb));
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                                default:
                                    obj2 = obj5;
                                    zzkiVar.zzi(zza4.zza, obj2);
                                    zzh = i18;
                                    break;
                            }
                        } else {
                            i19 = i17;
                            zzh = zzil.zzh(i13, bArr, i18, i8, zzd(obj), zzikVar);
                        }
                    } else {
                        i19 = i17;
                        zzh = zzil.zzh(i13, bArr, i18, i8, zzd(obj), zzikVar);
                    }
                    i56 = i8;
                    zzikVar7 = zzikVar;
                    i57 = i11;
                    i65 = i13;
                    i58 = i14;
                    i60 = i15;
                    i62 = i19;
                    unsafe3 = unsafe;
                    int i109 = i16;
                    i61 = zzh;
                    i59 = i10;
                    i63 = i109;
                } else {
                    i61 = i18;
                    i12 = i64;
                }
            } else {
                i10 = i59;
                i11 = i57;
                unsafe = unsafe3;
                i12 = i64;
                i13 = i65;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final Object zze() {
        return ((zzks) this.zzg).zzt();
    }

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
                                ((zzkz) zzni.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzlr) object).zzc();
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
            int zzu = zzu(i7);
            int i8 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i9 = iArr[i7];
            long j = i8;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i7)) {
                        zzni.zzo(obj, j, zzni.zza(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i7)) {
                        zzni.zzp(obj, j, zzni.zzb(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i7)) {
                        zzni.zzm(obj, j, zzni.zzw(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i7)) {
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
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
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i7)) {
                        zzni.zzq(obj, j, zzni.zzc(obj2, j));
                        zzH(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i7)) {
                        zzni.zzr(obj, j, zzni.zzd(obj2, j));
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
                    zzkz zzkzVar = (zzkz) zzni.zzf(obj, j);
                    zzkz zzkzVar2 = (zzkz) zzni.zzf(obj2, j);
                    int size = zzkzVar.size();
                    int size2 = zzkzVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzkzVar.zzc()) {
                            zzkzVar = zzkzVar.zzd(size2 + size);
                        }
                        zzkzVar.addAll(zzkzVar2);
                    }
                    if (size > 0) {
                        zzkzVar2 = zzkzVar;
                    }
                    zzni.zzs(obj, j, zzkzVar2);
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
                        zzni.zzs(obj, j, zzni.zzf(obj2, j));
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
        zzmm.zzr(this.zzm, obj, obj2);
        if (this.zzh) {
            zzmm.zzq(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05de A[Catch: all -> 0x00fc, TryCatch #8 {all -> 0x00fc, blocks: (B:16:0x00da, B:36:0x05d9, B:38:0x05de, B:39:0x05e3, B:101:0x02d3, B:104:0x02dc, B:105:0x02ea, B:106:0x02f8, B:107:0x0306, B:108:0x0314, B:109:0x0322, B:110:0x0330, B:111:0x033e, B:112:0x034c, B:113:0x035b, B:114:0x036a, B:115:0x0379, B:116:0x0388, B:117:0x0397, B:118:0x03b1, B:119:0x03c0, B:120:0x03cf, B:121:0x03e2, B:123:0x03eb, B:124:0x03fb, B:125:0x040b, B:126:0x041a, B:127:0x0429, B:128:0x0438, B:129:0x0447, B:130:0x0456, B:131:0x0465, B:132:0x0474, B:133:0x0483, B:134:0x0498, B:135:0x04aa, B:136:0x04bc, B:137:0x04ce, B:138:0x04e0, B:140:0x04ed, B:143:0x04f4, B:144:0x04fa, B:145:0x0505, B:146:0x0517, B:147:0x0529, B:148:0x053e, B:149:0x0549, B:150:0x055b, B:151:0x056d, B:152:0x057f, B:153:0x0591, B:154:0x05a3, B:155:0x05b5, B:156:0x05c7), top: B:15:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x05e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x060e A[LOOP:3: B:50:0x060a->B:52:0x060e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0622  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzmj zzmjVar, zzkd zzkdVar) {
        zznb zznbVar;
        Object obj2;
        int i7;
        Object obj3;
        zzkd zzkdVar2;
        zzke zzkeVar;
        Object obj4 = obj;
        zzkd zzkdVar3 = zzkdVar;
        zzkdVar.getClass();
        zzD(obj);
        zznb zznbVar2 = this.zzm;
        zzke zzkeVar2 = this.zzn;
        zzki zzkiVar = null;
        Object obj5 = null;
        while (true) {
            try {
                int zzc = zzmjVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    obj3 = obj5;
                    zznbVar = zznbVar2;
                    obj2 = obj4;
                    try {
                        int zzu = zzu(zzq);
                        try {
                        } catch (zzlb unused) {
                            obj5 = obj3;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzo(obj2, zzu & 1048575, zzmjVar.zza());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 1:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzp(obj2, zzu & 1048575, zzmjVar.zzb());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 2:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzl());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 3:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzo());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 4:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzg());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 5:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzk());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 6:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzf());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 7:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzm(obj2, zzu & 1048575, zzmjVar.zzN());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 8:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzG(obj2, zzu, zzmjVar);
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 9:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzlx zzlxVar = (zzlx) zzA(obj2, zzq);
                                zzmjVar.zzu(zzlxVar, zzx(zzq), zzkdVar2);
                                zzJ(obj2, zzq, zzlxVar);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 10:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzs(obj2, zzu & 1048575, zzmjVar.zzp());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 11:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzj());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 12:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                int zze = zzmjVar.zze();
                                zzkw zzw = zzw(zzq);
                                if (zzw != null && !zzw.zza(zze)) {
                                    obj5 = zzmm.zzp(obj2, zzc, zze, obj5, zznbVar);
                                    obj4 = obj2;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                }
                                zzni.zzq(obj2, zzu & 1048575, zze);
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                                break;
                            case 13:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzh());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 14:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzm());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 15:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzq(obj2, zzu & 1048575, zzmjVar.zzi());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 16:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzni.zzr(obj2, zzu & 1048575, zzmjVar.zzn());
                                zzH(obj2, zzq);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 17:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzlx zzlxVar2 = (zzlx) zzA(obj2, zzq);
                                zzmjVar.zzt(zzlxVar2, zzx(zzq), zzkdVar2);
                                zzJ(obj2, zzq, zzlxVar2);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 18:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzx(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 19:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzB(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 20:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzE(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case zzbbd.zzt.zzm /* 21 */:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzM(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 22:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzD(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 23:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzA(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 24:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzz(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 25:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzv(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 26:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                if (zzM(zzu)) {
                                    ((zzjc) zzmjVar).zzK(zzlk.zza(obj2, zzu & 1048575), true);
                                } else {
                                    ((zzjc) zzmjVar).zzK(zzlk.zza(obj2, zzu & 1048575), false);
                                }
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 27:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzF(zzlk.zza(obj2, zzu & 1048575), zzx(zzq), zzkdVar2);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 28:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzw(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 29:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzL(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 30:
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                List zza2 = zzlk.zza(obj2, zzu & 1048575);
                                zzmjVar.zzy(zza2);
                                obj5 = zzmm.zzo(obj, zzc, zza2, zzw(zzq), obj3, zznbVar);
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 31:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzG(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 32:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzH(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 33:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzI(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 34:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzJ(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 35:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzx(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 36:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzB(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 37:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzE(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 38:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzM(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 39:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzD(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 40:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzA(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 41:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzz(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 42:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzv(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 43:
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                zzmjVar.zzL(zzlk.zza(obj2, zzu & 1048575));
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 44:
                                List zza3 = zzlk.zza(obj2, zzu & 1048575);
                                zzmjVar.zzy(zza3);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                try {
                                    obj5 = zzmm.zzo(obj, zzc, zza3, zzw(zzq), obj5, zznbVar);
                                } catch (zzlb unused2) {
                                    zznbVar.zzs(zzmjVar);
                                    if (obj5 == null) {
                                        obj5 = zznbVar.zzc(obj2);
                                    }
                                    if (!zznbVar.zzr(obj5, zzmjVar)) {
                                        for (int i8 = this.zzk; i8 < this.zzl; i8++) {
                                            zzy(obj, this.zzj[i8], obj5, zznbVar, obj);
                                        }
                                        if (obj5 == null) {
                                        }
                                    }
                                    obj4 = obj2;
                                    zzkeVar2 = zzkeVar;
                                    zzkdVar3 = zzkdVar2;
                                    zznbVar2 = zznbVar;
                                }
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                                break;
                            case 45:
                                zzmjVar.zzG(zzlk.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 46:
                                zzmjVar.zzH(zzlk.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 47:
                                zzmjVar.zzI(zzlk.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 48:
                                zzmjVar.zzJ(zzlk.zza(obj2, zzu & 1048575));
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 49:
                                zzmjVar.zzC(zzlk.zza(obj2, zzu & 1048575), zzx(zzq), zzkdVar3);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 50:
                                Object zzz = zzz(zzq);
                                long zzu2 = zzu(zzq) & 1048575;
                                Object zzf = zzni.zzf(obj2, zzu2);
                                if (zzf == null) {
                                    zzf = zzlr.zza().zzb();
                                    zzni.zzs(obj2, zzu2, zzf);
                                } else if (zzls.zza(zzf)) {
                                    Object zzb2 = zzlr.zza().zzb();
                                    zzls.zzb(zzb2, zzf);
                                    zzni.zzs(obj2, zzu2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzni.zzs(obj2, zzu & 1048575, Double.valueOf(zzmjVar.zza()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 52:
                                zzni.zzs(obj2, zzu & 1048575, Float.valueOf(zzmjVar.zzb()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 53:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzl()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 54:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzo()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 55:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzg()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 56:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzk()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 57:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzf()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 58:
                                zzni.zzs(obj2, zzu & 1048575, Boolean.valueOf(zzmjVar.zzN()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 59:
                                zzG(obj2, zzu, zzmjVar);
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 60:
                                zzlx zzlxVar3 = (zzlx) zzB(obj2, zzc, zzq);
                                zzmjVar.zzu(zzlxVar3, zzx(zzq), zzkdVar3);
                                zzK(obj2, zzc, zzq, zzlxVar3);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 61:
                                zzni.zzs(obj2, zzu & 1048575, zzmjVar.zzp());
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 62:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzj()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 63:
                                int zze2 = zzmjVar.zze();
                                zzkw zzw2 = zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze2)) {
                                    obj5 = zzmm.zzp(obj2, zzc, zze2, obj3, zznbVar);
                                    obj4 = obj2;
                                    zznbVar2 = zznbVar;
                                }
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zze2));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                                break;
                            case 64:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzh()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 65:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzm()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 66:
                                zzni.zzs(obj2, zzu & 1048575, Integer.valueOf(zzmjVar.zzi()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 67:
                                zzni.zzs(obj2, zzu & 1048575, Long.valueOf(zzmjVar.zzn()));
                                zzI(obj2, zzc, zzq);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            case 68:
                                zzlx zzlxVar4 = (zzlx) zzB(obj2, zzc, zzq);
                                zzmjVar.zzt(zzlxVar4, zzx(zzq), zzkdVar3);
                                zzK(obj2, zzc, zzq, zzlxVar4);
                                obj5 = obj3;
                                zzkeVar = zzkeVar2;
                                zzkdVar2 = zzkdVar3;
                                obj4 = obj2;
                                zzkeVar2 = zzkeVar;
                                zzkdVar3 = zzkdVar2;
                                zznbVar2 = zznbVar;
                            default:
                                obj5 = obj3 == null ? zznbVar.zzc(obj2) : obj3;
                                try {
                                    try {
                                        if (!zznbVar.zzr(obj5, zzmjVar)) {
                                            for (int i9 = this.zzk; i9 < this.zzl; i9++) {
                                                zzy(obj, this.zzj[i9], obj5, zznbVar, obj);
                                            }
                                            break;
                                        }
                                        obj4 = obj2;
                                    } catch (zzlb unused3) {
                                        zzkeVar = zzkeVar2;
                                        zzkdVar2 = zzkdVar3;
                                        zznbVar.zzs(zzmjVar);
                                        if (obj5 == null) {
                                        }
                                        if (!zznbVar.zzr(obj5, zzmjVar)) {
                                        }
                                        obj4 = obj2;
                                        zzkeVar2 = zzkeVar;
                                        zzkdVar3 = zzkdVar2;
                                        zznbVar2 = zznbVar;
                                    }
                                    zznbVar2 = zznbVar;
                                } catch (Throwable th) {
                                    th = th;
                                    while (i7 < this.zzl) {
                                    }
                                    if (obj5 != null) {
                                    }
                                    throw th;
                                }
                                break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj5 = obj3;
                        while (i7 < this.zzl) {
                        }
                        if (obj5 != null) {
                        }
                        throw th;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i10 = this.zzk; i10 < this.zzl; i10++) {
                        zzy(obj, this.zzj[i10], obj5, zznbVar2, obj);
                    }
                    zznbVar = zznbVar2;
                    obj2 = obj4;
                } else {
                    try {
                        Object zzd = !this.zzh ? null : zzkeVar2.zzd(zzkdVar3, this.zzg, zzc);
                        if (zzd != null) {
                            zzki zzc2 = zzkiVar == null ? zzkeVar2.zzc(obj4) : zzkiVar;
                            obj3 = obj5;
                            zznb zznbVar3 = zznbVar2;
                            Object obj6 = obj4;
                            try {
                                zzkeVar2.zze(obj, zzmjVar, zzd, zzkdVar, zzc2, obj3, zznbVar3);
                                zzkiVar = zzc2;
                                obj4 = obj6;
                                zznbVar2 = zznbVar3;
                                obj5 = obj3;
                            } catch (Throwable th3) {
                                th = th3;
                                obj2 = obj6;
                                zznbVar = zznbVar3;
                                obj5 = obj3;
                                while (i7 < this.zzl) {
                                }
                                if (obj5 != null) {
                                }
                                throw th;
                            }
                        } else {
                            Object obj7 = obj5;
                            zznb zznbVar4 = zznbVar2;
                            Object obj8 = obj4;
                            zznbVar4.zzs(zzmjVar);
                            obj5 = obj7 == null ? zznbVar4.zzc(obj8) : obj7;
                            try {
                                if (zznbVar4.zzr(obj5, zzmjVar)) {
                                    obj4 = obj8;
                                    zznbVar2 = zznbVar4;
                                } else {
                                    int i11 = this.zzk;
                                    while (i11 < this.zzl) {
                                        zznb zznbVar5 = zznbVar4;
                                        zzy(obj, this.zzj[i11], obj5, zznbVar5, obj);
                                        i11++;
                                        obj8 = obj8;
                                        zznbVar4 = zznbVar5;
                                    }
                                    obj2 = obj8;
                                    zznbVar = zznbVar4;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = obj8;
                                zznbVar = zznbVar4;
                                for (i7 = this.zzk; i7 < this.zzl; i7++) {
                                    zzy(obj, this.zzj[i7], obj5, zznbVar, obj);
                                }
                                if (obj5 != null) {
                                    zznbVar.zzn(obj2, obj5);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zznbVar = zznbVar2;
                        obj2 = obj4;
                        while (i7 < this.zzl) {
                        }
                        if (obj5 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        if (obj5 == null) {
            zznbVar.zzn(obj2, obj5);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzi(Object obj, byte[] bArr, int i7, int i8, zzik zzikVar) {
        zzc(obj, bArr, i7, i8, 0, zzikVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzno zznoVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        Map.Entry entry2;
        int i10;
        int i11;
        Iterator it2;
        int[] iArr2;
        Map.Entry entry3;
        int i12;
        boolean z4;
        boolean z7;
        boolean z8;
        if (this.zzh) {
            zzki zzb2 = this.zzn.zzb(obj);
            if (!zzb2.zza.isEmpty()) {
                Iterator zzf = zzb2.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i13 = 1048575;
                int i14 = 1048575;
                int i15 = 0;
                i7 = 0;
                while (i7 < iArr.length) {
                    int zzu = zzu(i7);
                    int[] iArr3 = this.zzc;
                    int zzt = zzt(zzu);
                    int i16 = iArr3[i7];
                    if (zzt <= 17) {
                        int i17 = iArr3[i7 + 2];
                        int i18 = i17 & i13;
                        if (i18 != i14) {
                            if (i18 == i13) {
                                i8 = zzt;
                                i15 = 0;
                            } else {
                                i8 = zzt;
                                i15 = unsafe.getInt(obj, i18);
                            }
                            i14 = i18;
                        } else {
                            i8 = zzt;
                        }
                        i9 = i14;
                        entry2 = entry;
                        i10 = i15;
                        i11 = 1 << (i17 >>> 20);
                    } else {
                        i8 = zzt;
                        i9 = i14;
                        entry2 = entry;
                        i10 = i15;
                        i11 = 0;
                    }
                    while (entry2 != null && this.zzn.zza(entry2) <= i16) {
                        this.zzn.zzi(zznoVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzu & 1048575;
                    switch (i8) {
                        case 0:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzf(i16, zzni.zza(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 1:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzo(i16, zzni.zzb(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 2:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzt(i16, unsafe.getLong(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 3:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzK(i16, unsafe.getLong(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 4:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzr(i16, unsafe.getInt(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 5:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzm(i16, unsafe.getLong(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 6:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzk(i16, unsafe.getInt(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 7:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzb(i16, zzni.zzw(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 8:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zzT(i16, unsafe.getObject(obj, j), zznoVar);
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 9:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzv(i16, unsafe.getObject(obj, j), zzx(i12));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 10:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzd(i16, (zziv) unsafe.getObject(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 11:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzI(i16, unsafe.getInt(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 12:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzi(i16, unsafe.getInt(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 13:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzx(i16, unsafe.getInt(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 14:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzz(i16, unsafe.getLong(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 15:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzB(i16, unsafe.getInt(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 16:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i12, i9, i10, i11)) {
                                zznoVar.zzD(i16, unsafe.getLong(obj, j));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 17:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            if (zzO(obj, i7, i9, i10, i11)) {
                                zznoVar.zzq(i16, unsafe.getObject(obj, j), zzx(i12));
                            }
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 18:
                            z4 = false;
                            zzmm.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 19:
                            z4 = false;
                            zzmm.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 20:
                            z4 = false;
                            zzmm.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case zzbbd.zzt.zzm /* 21 */:
                            z4 = false;
                            zzmm.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 22:
                            z4 = false;
                            zzmm.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 23:
                            z4 = false;
                            zzmm.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 24:
                            z4 = false;
                            zzmm.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 25:
                            z4 = false;
                            zzmm.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 26:
                            int i19 = this.zzc[i7];
                            List list = (List) unsafe.getObject(obj, j);
                            int i20 = zzmm.zza;
                            if (list != null && !list.isEmpty()) {
                                zznoVar.zzH(i19, list);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            break;
                        case 27:
                            int i21 = this.zzc[i7];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzmk zzx = zzx(i7);
                            int i22 = zzmm.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i23 = 0; i23 < list2.size(); i23++) {
                                    ((zzjh) zznoVar).zzv(i21, list2.get(i23), zzx);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            break;
                        case 28:
                            int i24 = this.zzc[i7];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i25 = zzmm.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zznoVar.zze(i24, list3);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            break;
                        case 29:
                            z7 = false;
                            zzmm.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 30:
                            z7 = false;
                            zzmm.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 31:
                            z7 = false;
                            zzmm.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 32:
                            z7 = false;
                            zzmm.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 33:
                            z7 = false;
                            zzmm.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 34:
                            z7 = false;
                            zzmm.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 35:
                            z8 = true;
                            zzmm.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 36:
                            z8 = true;
                            zzmm.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 37:
                            z8 = true;
                            zzmm.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 38:
                            z8 = true;
                            zzmm.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 39:
                            z8 = true;
                            zzmm.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 40:
                            z8 = true;
                            zzmm.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 41:
                            z8 = true;
                            zzmm.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 42:
                            z8 = true;
                            zzmm.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 43:
                            z8 = true;
                            zzmm.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 44:
                            z8 = true;
                            zzmm.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 45:
                            z8 = true;
                            zzmm.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 46:
                            z8 = true;
                            zzmm.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 47:
                            z8 = true;
                            zzmm.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 48:
                            z8 = true;
                            zzmm.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zznoVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 49:
                            int i26 = this.zzc[i7];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzmk zzx2 = zzx(i7);
                            int i27 = zzmm.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i28 = 0; i28 < list4.size(); i28++) {
                                    ((zzjh) zznoVar).zzq(i26, list4.get(i28), zzx2);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 51:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzf(i16, zzn(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 52:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzo(i16, zzo(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 53:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzt(i16, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 54:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzK(i16, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 55:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzr(i16, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 56:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzm(i16, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 57:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzk(i16, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 58:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzb(i16, zzS(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 59:
                            if (zzR(obj, i16, i7)) {
                                zzT(i16, unsafe.getObject(obj, j), zznoVar);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 60:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzv(i16, unsafe.getObject(obj, j), zzx(i7));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 61:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzd(i16, (zziv) unsafe.getObject(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 62:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzI(i16, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 63:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzi(i16, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 64:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzx(i16, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 65:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzz(i16, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 66:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzB(i16, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 67:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzD(i16, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        case 68:
                            if (zzR(obj, i16, i7)) {
                                zznoVar.zzq(i16, unsafe.getObject(obj, j), zzx(i7));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                        default:
                            it2 = it;
                            iArr2 = iArr;
                            entry3 = entry2;
                            i12 = i7;
                            i7 = i12 + 3;
                            i14 = i9;
                            i15 = i10;
                            i13 = 1048575;
                            it = it2;
                            iArr = iArr2;
                            entry = entry3;
                    }
                }
                Iterator it3 = it;
                while (entry != null) {
                    this.zzn.zzi(zznoVar, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                zznb zznbVar = this.zzm;
                zznbVar.zzq(zznbVar.zzd(obj), zznoVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i132 = 1048575;
        int i142 = 1048575;
        int i152 = 0;
        i7 = 0;
        while (i7 < iArr.length) {
        }
        Iterator it32 = it;
        while (entry != null) {
        }
        zznb zznbVar2 = this.zzm;
        zznbVar2.zzq(zznbVar2.zzd(obj), zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzH;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzu = zzu(i7);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i7) && Double.doubleToLongBits(zzni.zza(obj, j)) == Double.doubleToLongBits(zzni.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i7) && Float.floatToIntBits(zzni.zzb(obj, j)) == Float.floatToIntBits(zzni.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i7) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i7) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i7) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i7) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i7) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i7) && zzni.zzw(obj, j) == zzni.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i7) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i7) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i7) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i7) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i7) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i7) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i7) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i7) && zzni.zzc(obj, j) == zzni.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i7) && zzni.zzd(obj, j) == zzni.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i7) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
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
                    zzH = zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j));
                    break;
                case 50:
                    zzH = zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j));
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
                    if (zzni.zzc(obj, zzr) == zzni.zzc(obj2, zzr) && zzmm.zzH(zzni.zzf(obj, j), zzni.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
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

    @Override // com.google.android.recaptcha.internal.zzmk
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
                        if (zzt == 50 && !((zzlr) zzni.zzf(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzni.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmk zzx = zzx(i12);
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
        return !this.zzh || this.zzn.zzb(obj).zzk();
    }
}
