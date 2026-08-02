package com.google.android.recaptcha.internal;

import androidx.collection.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.protobuf.c;
import com.facebook.appevents.q;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i, int i2, zzoi zzoiVar, boolean z, int[] iArr2, int i3, int i4, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzoiVar instanceof zznd;
        boolean z2 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i) {
        zzow zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
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

    private final Object zzB(Object obj, int i, int i2) {
        zzow zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
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
            StringBuilder a = c.a("Field ", str, " for ", name, " not found. Known fields are ");
            a.append(arrays);
            throw new RuntimeException(a.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
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

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
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

    private final void zzG(Object obj, int i, zzov zzovVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzps.zzs(obj, j, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzps.zzq(obj, j, (1 << (zzr >>> 20)) | zzps.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzps.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzps.zzc(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j2)) != 0;
            case 2:
                return zzps.zzd(obj, j2) != 0;
            case 3:
                return zzps.zzd(obj, j2) != 0;
            case 4:
                return zzps.zzc(obj, j2) != 0;
            case 5:
                return zzps.zzd(obj, j2) != 0;
            case 6:
                return zzps.zzc(obj, j2) != 0;
            case 7:
                return zzps.zzw(obj, j2);
            case 8:
                Object zzf = zzps.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzle) {
                    return !zzle.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j2) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j2));
            case 11:
                return zzps.zzc(obj, j2) != 0;
            case 12:
                return zzps.zzc(obj, j2) != 0;
            case 13:
                return zzps.zzc(obj, j2) != 0;
            case 14:
                return zzps.zzd(obj, j2) != 0;
            case 15:
                return zzps.zzc(obj, j2) != 0;
            case 16:
                return zzps.zzd(obj, j2) != 0;
            case 17:
                return zzps.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzps.zzc(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzps.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzpy zzpyVar) throws IOException {
        if (obj instanceof String) {
            zzpyVar.zzG(i, (String) obj);
        } else {
            zzpyVar.zzd(i, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    public static zzol zzm(Class cls, zzof zzofVar, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        zzou zzouVar;
        int i17;
        Object[] objArr;
        int i18;
        int i19;
        int i20;
        int objectFieldOffset;
        int i21;
        int i22;
        char c;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Field zzC;
        char charAt10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Field zzC2;
        Field zzC3;
        int i34;
        char charAt11;
        int i35;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        if (!(zzofVar instanceof zzou)) {
            throw null;
        }
        zzou zzouVar2 = (zzou) zzofVar;
        String zzd = zzouVar2.zzd();
        int length = zzd.length();
        char c2 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i = i39 + 1;
                if (zzd.charAt(i39) < 55296) {
                    break;
                }
                i39 = i;
            }
        } else {
            i = 1;
        }
        int i40 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i41 = charAt15 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                charAt14 = zzd.charAt(i40);
                if (charAt14 < 55296) {
                    break;
                }
                i41 |= (charAt14 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            charAt15 = i41 | (charAt14 << i42);
            i40 = i38;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i43 = i40 + 1;
            int charAt16 = zzd.charAt(i40);
            if (charAt16 >= 55296) {
                int i44 = charAt16 & 8191;
                int i45 = 13;
                while (true) {
                    i15 = i43 + 1;
                    charAt9 = zzd.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i15;
                }
                charAt16 = i44 | (charAt9 << i45);
                i43 = i15;
            }
            int i46 = i43 + 1;
            int charAt17 = zzd.charAt(i43);
            if (charAt17 >= 55296) {
                int i47 = charAt17 & 8191;
                int i48 = 13;
                while (true) {
                    i14 = i46 + 1;
                    charAt8 = zzd.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i14;
                }
                charAt17 = i47 | (charAt8 << i48);
                i46 = i14;
            }
            int i49 = i46 + 1;
            int charAt18 = zzd.charAt(i46);
            if (charAt18 >= 55296) {
                int i50 = charAt18 & 8191;
                int i51 = 13;
                while (true) {
                    i13 = i49 + 1;
                    charAt7 = zzd.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i13;
                }
                charAt18 = i50 | (charAt7 << i51);
                i49 = i13;
            }
            int i52 = i49 + 1;
            int charAt19 = zzd.charAt(i49);
            if (charAt19 >= 55296) {
                int i53 = charAt19 & 8191;
                int i54 = 13;
                while (true) {
                    i12 = i52 + 1;
                    charAt6 = zzd.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i12;
                }
                charAt19 = i53 | (charAt6 << i54);
                i52 = i12;
            }
            int i55 = i52 + 1;
            charAt = zzd.charAt(i52);
            if (charAt >= 55296) {
                int i56 = charAt & 8191;
                int i57 = 13;
                while (true) {
                    i11 = i55 + 1;
                    charAt5 = zzd.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i11;
                }
                charAt = i56 | (charAt5 << i57);
                i55 = i11;
            }
            int i58 = i55 + 1;
            int charAt20 = zzd.charAt(i55);
            if (charAt20 >= 55296) {
                int i59 = charAt20 & 8191;
                int i60 = 13;
                while (true) {
                    i10 = i58 + 1;
                    charAt4 = zzd.charAt(i58);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i59 |= (charAt4 & 8191) << i60;
                    i60 += 13;
                    i58 = i10;
                }
                charAt20 = i59 | (charAt4 << i60);
                i58 = i10;
            }
            int i61 = i58 + 1;
            int charAt21 = zzd.charAt(i58);
            if (charAt21 >= 55296) {
                int i62 = charAt21 & 8191;
                int i63 = 13;
                while (true) {
                    i9 = i61 + 1;
                    charAt3 = zzd.charAt(i61);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i62 |= (charAt3 & 8191) << i63;
                    i63 += 13;
                    i61 = i9;
                }
                charAt21 = i62 | (charAt3 << i63);
                i61 = i9;
            }
            int i64 = i61 + 1;
            int charAt22 = zzd.charAt(i61);
            if (charAt22 >= 55296) {
                int i65 = charAt22 & 8191;
                int i66 = 13;
                while (true) {
                    i8 = i64 + 1;
                    charAt2 = zzd.charAt(i64);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i65 |= (charAt2 & 8191) << i66;
                    i66 += 13;
                    i64 = i8;
                }
                charAt22 = i65 | (charAt2 << i66);
                i64 = i8;
            }
            int i67 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i68 = charAt20;
            i2 = charAt18;
            i3 = i68;
            i4 = charAt19;
            i5 = charAt22;
            i6 = i67;
            iArr = iArr2;
            i7 = charAt16;
            i40 = i64;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzouVar2.zze();
        Class<?> cls2 = zzouVar2.zza().getClass();
        int i69 = i5 + i3;
        int i70 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[i70];
        int i71 = i5;
        int i72 = i69;
        int i73 = 0;
        int i74 = 0;
        while (i40 < length) {
            int i75 = i40 + 1;
            int charAt23 = zzd.charAt(i40);
            if (charAt23 >= c2) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i37 = i77 + 1;
                    charAt13 = zzd.charAt(i77);
                    if (charAt13 < c2) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i37;
                }
                charAt23 = i76 | (charAt13 << i78);
                i16 = i37;
            } else {
                i16 = i75;
            }
            int i79 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c2) {
                int i80 = charAt24 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i36 = i81 + 1;
                    charAt12 = zzd.charAt(i81);
                    zzouVar = zzouVar2;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i82;
                    i82 += 13;
                    i81 = i36;
                    zzouVar2 = zzouVar;
                }
                charAt24 = i80 | (charAt12 << i82);
                i17 = i36;
            } else {
                zzouVar = zzouVar2;
                i17 = i79;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            int i83 = charAt24 & 255;
            int i84 = length;
            int i85 = charAt24 & 2048;
            if (i83 >= 51) {
                int i86 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                if (charAt25 >= 55296) {
                    int i87 = charAt25 & 8191;
                    int i88 = i86;
                    int i89 = 13;
                    while (true) {
                        i34 = i88 + 1;
                        charAt11 = zzd.charAt(i88);
                        i35 = i87;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i87 = i35 | ((charAt11 & 8191) << i89);
                        i89 += 13;
                        i88 = i34;
                    }
                    charAt25 = i35 | (charAt11 << i89);
                    i32 = i34;
                } else {
                    i32 = i86;
                }
                int i90 = charAt25;
                int i91 = i83 - 51;
                int i92 = i32;
                if (i91 == 9 || i91 == 17) {
                    objArr2[q.a(i73, 3, 1)] = zze[i6];
                    i33 = i85;
                    i6++;
                } else {
                    if (i91 == 12) {
                        if (zzouVar.zzc() == 1 || i85 != 0) {
                            objArr2[q.a(i73, 3, 1)] = zze[i6];
                            i6++;
                        } else {
                            i33 = 0;
                        }
                    }
                    i33 = i85;
                }
                int i93 = i90 + i90;
                Object obj = zze[i93];
                int i94 = i33;
                if (obj instanceof Field) {
                    zzC2 = (Field) obj;
                } else {
                    zzC2 = zzC(cls2, (String) obj);
                    zze[i93] = zzC2;
                }
                Object[] objArr3 = objArr2;
                int i95 = i6;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC2);
                int i96 = i93 + 1;
                Object obj2 = zze[i96];
                if (obj2 instanceof Field) {
                    zzC3 = (Field) obj2;
                } else {
                    zzC3 = zzC(cls2, (String) obj2);
                    zze[i96] = zzC3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(zzC3);
                i19 = i7;
                i27 = i95;
                i20 = i73;
                c = 55296;
                i21 = objectFieldOffset3;
                i26 = objectFieldOffset2;
                i85 = i94;
                i18 = charAt23;
                i40 = i92;
                objArr = objArr3;
                i25 = 0;
            } else {
                Object[] objArr4 = objArr2;
                int i97 = i6 + 1;
                objArr = objArr4;
                Field zzC4 = zzC(cls2, (String) zze[i6]);
                i18 = charAt23;
                if (i83 == 9 || i83 == 17) {
                    i19 = i7;
                    objArr[q.a(i73, 3, 1)] = zzC4.getType();
                } else {
                    if (i83 == 27) {
                        i19 = i7;
                        i29 = 3;
                        i30 = 1;
                        i31 = i6 + 2;
                    } else if (i83 == 49) {
                        i31 = i6 + 2;
                        i19 = i7;
                        i29 = 3;
                        i30 = 1;
                    } else {
                        if (i83 == 12 || i83 == 30 || i83 == 44) {
                            i19 = i7;
                            if (zzouVar.zzc() == 1 || i85 != 0) {
                                i31 = i6 + 2;
                                objArr[q.a(i73, 3, 1)] = zze[i97];
                                i97 = i31;
                            } else {
                                i20 = i73;
                                i85 = 0;
                            }
                        } else if (i83 == 50) {
                            int i98 = i6 + 2;
                            int i99 = i71 + 1;
                            iArr[i71] = i73;
                            int i100 = i73 / 3;
                            int i101 = i100 + i100;
                            objArr[i101] = zze[i97];
                            if (i85 != 0) {
                                i97 = i6 + 3;
                                objArr[i101 + 1] = zze[i98];
                                i20 = i73;
                                i71 = i99;
                            } else {
                                i97 = i98;
                                i20 = i73;
                                i71 = i99;
                                i85 = 0;
                            }
                            i19 = i7;
                        } else {
                            i19 = i7;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                        i21 = 1048575;
                        if ((charAt24 & 4096) != 0 || i83 > 17) {
                            i22 = i97;
                            c = 55296;
                            i23 = i17;
                            i24 = 0;
                        } else {
                            int i102 = i17 + 1;
                            int charAt26 = zzd.charAt(i17);
                            if (charAt26 >= 55296) {
                                int i103 = charAt26 & 8191;
                                int i104 = 13;
                                while (true) {
                                    i28 = i102 + 1;
                                    charAt10 = zzd.charAt(i102);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i103 |= (charAt10 & 8191) << i104;
                                    i104 += 13;
                                    i102 = i28;
                                }
                                charAt26 = i103 | (charAt10 << i104);
                            } else {
                                i28 = i102;
                            }
                            int i105 = (charAt26 / 32) + i19 + i19;
                            Object obj3 = zze[i105];
                            if (obj3 instanceof Field) {
                                zzC = (Field) obj3;
                            } else {
                                zzC = zzC(cls2, (String) obj3);
                                zze[i105] = zzC;
                            }
                            i22 = i97;
                            i24 = charAt26 % 32;
                            i21 = (int) unsafe.objectFieldOffset(zzC);
                            i23 = i28;
                            c = 55296;
                        }
                        if (i83 >= 18 || i83 > 49) {
                            i25 = i24;
                            i26 = objectFieldOffset;
                            int i106 = i23;
                            i27 = i22;
                            i40 = i106;
                        } else {
                            int i107 = i72 + 1;
                            iArr[i72] = objectFieldOffset;
                            i25 = i24;
                            i26 = objectFieldOffset;
                            int i108 = i23;
                            i27 = i22;
                            i40 = i108;
                            i72 = i107;
                        }
                    }
                    objArr[q.a(i73, i29, i30)] = zze[i97];
                    i97 = i31;
                }
                i20 = i73;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i21 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i22 = i97;
                c = 55296;
                i23 = i17;
                i24 = 0;
                if (i83 >= 18) {
                }
                i25 = i24;
                i26 = objectFieldOffset;
                int i1062 = i23;
                i27 = i22;
                i40 = i1062;
            }
            int i109 = i20 + 1;
            iArr3[i20] = i18;
            int i110 = i20 + 2;
            iArr3[i109] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i85 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i26;
            iArr3[i110] = (i25 << 20) | i21;
            i73 = i20 + 3;
            i6 = i27;
            length = i84;
            c2 = c;
            zzouVar2 = zzouVar;
            i7 = i19;
            objArr2 = objArr;
        }
        return new zzol(iArr3, objArr2, i2, i4, zzouVar2.zza(), false, iArr, i5, i69, zzooVar, zznvVar, zzplVar, zzmpVar, zzodVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzps.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzps.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzps.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzps.zzf(obj, j)).longValue();
    }

    private final zznh zzw(int i) {
        int i2 = i / 3;
        return (zznh) this.zzd[i2 + i2 + 1];
    }

    private final zzow zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzow zzowVar = (zzow) objArr[i3];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzpl zzplVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzps.zzf(obj, zzu(i) & 1048575);
        if (zzf == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i;
        int zzA;
        int zzB;
        int zzA2;
        int zzd;
        int zzA3;
        int zzh;
        int zzA4;
        int size;
        int zzl;
        int zzA5;
        int zzd2;
        boolean z;
        int zzb2;
        int i2;
        int zzA6;
        int zzA7;
        int size2;
        int zzk;
        int zzA8;
        int size3;
        int zzi;
        int zzA9;
        int i3;
        int zze;
        int zzA10;
        int zzA11;
        int zzA12;
        int zzB2;
        zzol<T> zzolVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < zzolVar.zzc.length) {
            int zzu = zzolVar.zzu(i6);
            int zzt = zzt(zzu);
            int[] iArr = zzolVar.zzc;
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & i4;
            if (zzt <= 17) {
                if (i11 != i5) {
                    i7 = i11 == i4 ? 0 : unsafe.getInt(obj2, i11);
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = zzu & i4;
            if (zzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            long j = i12;
            switch (zzt) {
                case 0:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = h.a(i9 << 3, 8, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 1:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = h.a(i9 << 3, 4, i8);
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 2:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j2);
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 3:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j3);
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 4:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j4);
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 5:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = h.a(i9 << 3, 8, i8);
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 6:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = h.a(i9 << 3, 4, i8);
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 7:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = h.a(i9 << 3, 1, i8);
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 8:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzle) {
                            zzA2 = zzln.zzA(i13);
                            zzd = ((zzle) object).zzd();
                            zzA3 = zzln.zzA(zzd);
                            i8 += zzA3 + zzd + zzA2;
                        } else {
                            zzA = zzln.zzA(i13);
                            zzB = zzln.zzz((String) object);
                            i8 += zzB + zzA;
                        }
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 9:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        zzh = zzoy.zzh(i9, unsafe.getObject(obj2, j), zzolVar.zzx(i6));
                        i8 += zzh;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    } else {
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                case 10:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj2, j);
                        zzA2 = zzln.zzA(i9 << 3);
                        zzd = zzleVar.zzd();
                        zzA3 = zzln.zzA(zzd);
                        i8 += zzA3 + zzd + zzA2;
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 11:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = h.a(unsafe.getInt(obj2, j), zzln.zzA(i9 << 3), i8);
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 12:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j5);
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 13:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = h.a(i9 << 3, 4, i8);
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 14:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = h.a(i9 << 3, 8, i8);
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 15:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(obj2, j);
                        i8 = h.a((i14 >> 31) ^ (i14 + i14), zzln.zzA(i9 << 3), i8);
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 16:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB((j6 >> 63) ^ (j6 + j6));
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 17:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 += zzln.zzw(i9, (zzoi) unsafe.getObject(obj2, j), zzolVar.zzx(i6));
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 18:
                    zzh = zzoy.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzh;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 19:
                    zzh = zzoy.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzh;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i15 = zzoy.zza;
                    if (list.size() != 0) {
                        zzA4 = (zzln.zzA(i9 << 3) * list.size()) + zzoy.zzg(list);
                        i8 += zzA4;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i8 += zzA4;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i16 = zzoy.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzoy.zzl(list2);
                        zzA5 = zzln.zzA(i9 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i8 += zzA4;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i8 += zzA4;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i17 = zzoy.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzoy.zzf(list3);
                        zzA5 = zzln.zzA(i9 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i8 += zzA4;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzA4 = 0;
                    i8 += zzA4;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 23:
                    zzd2 = zzoy.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 24:
                    z = false;
                    zzb2 = zzoy.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzb2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzoy.zza;
                    int size4 = list4.size();
                    if (size4 != 0) {
                        zzd2 = size4 * (zzln.zzA(i9 << 3) + 1);
                        i8 += zzd2;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzd2 = 0;
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzoy.zza;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        i2 = 0;
                    } else {
                        int zzA13 = zzln.zzA(i9 << 3) * size5;
                        if (list5 instanceof zznu) {
                            zznu zznuVar = (zznu) list5;
                            i2 = zzA13;
                            for (int i20 = 0; i20 < size5; i20++) {
                                Object zzc = zznuVar.zzc();
                                if (zzc instanceof zzle) {
                                    int zzd3 = ((zzle) zzc).zzd();
                                    i2 = h.a(zzd3, zzd3, i2);
                                } else {
                                    i2 = zzln.zzz((String) zzc) + i2;
                                }
                            }
                        } else {
                            i2 = zzA13;
                            for (int i21 = 0; i21 < size5; i21++) {
                                Object obj3 = list5.get(i21);
                                if (obj3 instanceof zzle) {
                                    int zzd4 = ((zzle) obj3).zzd();
                                    i2 = h.a(zzd4, zzd4, i2);
                                } else {
                                    i2 = zzln.zzz((String) obj3) + i2;
                                }
                            }
                        }
                    }
                    i8 += i2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzow zzx = zzolVar.zzx(i6);
                    int i22 = zzoy.zza;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        zzA6 = 0;
                    } else {
                        zzA6 = zzln.zzA(i9 << 3) * size6;
                        for (int i23 = 0; i23 < size6; i23++) {
                            Object obj4 = list6.get(i23);
                            if (obj4 instanceof zznt) {
                                int zza2 = ((zznt) obj4).zza();
                                zzA6 = h.a(zza2, zza2, zzA6);
                            } else {
                                zzA6 = zzln.zzy((zzoi) obj4, zzx) + zzA6;
                            }
                        }
                    }
                    i8 += zzA6;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i24 = zzoy.zza;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        zzA7 = 0;
                    } else {
                        zzA7 = zzln.zzA(i9 << 3) * size7;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int zzd5 = ((zzle) list7.get(i25)).zzd();
                            zzA7 = h.a(zzd5, zzd5, zzA7);
                        }
                    }
                    i8 += zzA7;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzoy.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        zzk = zzoy.zzk(list8);
                        zzA8 = zzln.zzA(i9 << 3);
                        zzd2 = zzk + (zzA8 * size2);
                        i8 += zzd2;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzd2 = 0;
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzoy.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        zzk = zzoy.zza(list9);
                        zzA8 = zzln.zzA(i9 << 3);
                        zzd2 = zzk + (zzA8 * size2);
                        i8 += zzd2;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    zzd2 = 0;
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 31:
                    zzd2 = zzoy.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzd2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 32:
                    z = false;
                    zzb2 = zzoy.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzb2;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzoy.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        zzi = zzoy.zzi(list10);
                        zzA9 = zzln.zzA(i9 << 3);
                        i3 = (zzA9 * size3) + zzi;
                        i8 += i3;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i3 = 0;
                    i8 += i3;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzoy.zza;
                    size3 = list11.size();
                    if (size3 != 0) {
                        zzi = zzoy.zzj(list11);
                        zzA9 = zzln.zzA(i9 << 3);
                        i3 = (zzA9 * size3) + zzi;
                        i8 += i3;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i3 = 0;
                    i8 += i3;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 35:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 36:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 37:
                    zze = zzoy.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 38:
                    zze = zzoy.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 39:
                    zze = zzoy.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 40:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 41:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzoy.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 43:
                    zze = zzoy.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 44:
                    zze = zzoy.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 45:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 46:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 47:
                    zze = zzoy.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 48:
                    zze = zzoy.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzow zzx2 = zzolVar.zzx(i6);
                    int i31 = zzoy.zza;
                    int size8 = list13.size();
                    if (size8 != 0) {
                        int i32 = 0;
                        for (int i33 = 0; i33 < size8; i33++) {
                            i32 += zzln.zzw(i9, (zzoi) list13.get(i33), zzx2);
                        }
                        i3 = i32;
                        i8 += i3;
                        i6 += 3;
                        obj2 = obj;
                        i4 = 1048575;
                    }
                    i3 = 0;
                    i8 += i3;
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj2, j);
                    if (!zzocVar.isEmpty()) {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = h.a(i9 << 3, 8, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 52:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = h.a(i9 << 3, 4, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 53:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        long zzv = zzv(obj2, j);
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB(zzv);
                        i8 += zzB2 + zzA12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 54:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        long zzv2 = zzv(obj2, j);
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB(zzv2);
                        i8 += zzB2 + zzA12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 55:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        long zzp = zzp(obj2, j);
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB(zzp);
                        i8 += zzB2 + zzA12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 56:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = h.a(i9 << 3, 8, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 57:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = h.a(i9 << 3, 4, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 58:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = h.a(i9 << 3, 1, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 59:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        int i34 = i9 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzle) {
                            zze = zzln.zzA(i34);
                            zzA10 = ((zzle) object2).zzd();
                            zzA11 = zzln.zzA(zzA10);
                            i8 += zzA11 + zzA10 + zze;
                        } else {
                            zzA12 = zzln.zzA(i34);
                            zzB2 = zzln.zzz((String) object2);
                            i8 += zzB2 + zzA12;
                        }
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 60:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        zzd2 = zzoy.zzh(i9, unsafe.getObject(obj2, j), zzolVar.zzx(i6));
                        i8 += zzd2;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 61:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj2, j);
                        zze = zzln.zzA(i9 << 3);
                        zzA10 = zzleVar2.zzd();
                        zzA11 = zzln.zzA(zzA10);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 62:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = h.a(zzp(obj2, j), zzln.zzA(i9 << 3), i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 63:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        long zzp2 = zzp(obj2, j);
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB(zzp2);
                        i8 += zzB2 + zzA12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 64:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = h.a(i9 << 3, 4, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 65:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = h.a(i9 << 3, 8, i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 66:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        int zzp3 = zzp(obj2, j);
                        i8 = h.a((zzp3 >> 31) ^ (zzp3 + zzp3), zzln.zzA(i9 << 3), i8);
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 67:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        long zzv3 = zzv(obj2, j);
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        i8 += zzB2 + zzA12;
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                case 68:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 += zzln.zzw(i9, (zzoi) unsafe.getObject(obj2, j), zzolVar.zzx(i6));
                    }
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
                default:
                    i6 += 3;
                    obj2 = obj;
                    i4 = 1048575;
            }
        }
        int i35 = 0;
        int zza3 = ((zznd) obj).zzc.zza() + i8;
        if (!zzolVar.zzh) {
            return zza3;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int zzc2 = zzmtVar.zza.zzc();
        for (int i36 = 0; i36 < zzc2; i36++) {
            Map.Entry zzg = zzmtVar.zza.zzg(i36);
            i35 += zzmt.zza((zzms) ((zzpa) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
            i35 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i35;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int zzc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzt) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j));
                    byte[] bArr = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr2 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr3 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 4:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr4 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 6:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzps.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 12:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 13:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr5 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 15:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr6 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzps.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i4 = i3 + i8;
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i2 = i4 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zznd) obj).zzc.hashCode() + (i4 * 53);
        return this.zzh ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zzc(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.recaptcha.internal.zzkt r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i2;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                ((zznk) zzps.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzps.zzo(obj, j, zzps.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzps.zzp(obj, j, zzps.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzps.zzm(obj, j, zzps.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zznk zznkVar = (zznk) zzps.zzf(obj, j);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j, zznkVar2);
                    break;
                case 50:
                    int i4 = zzoy.zza;
                    zzps.zzs(obj, j, zzod.zzb(zzps.zzf(obj, j), zzps.zzf(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:286:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x072b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0750 A[LOOP:3: B:52:0x074c->B:54:0x0750, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x071d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) throws IOException {
        Object obj2;
        Object obj3;
        zzol<T> zzolVar;
        Throwable th;
        int i;
        zzpl zzplVar;
        Object obj4;
        Object obj5;
        Object valueOf;
        int ordinal;
        Object zze;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar2 = this.zzm;
        Object obj6 = null;
        zzmt zzmtVar = null;
        while (true) {
            try {
                int zzc = zzovVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    obj5 = obj;
                    zzplVar = zzplVar2;
                    zzolVar = this;
                    obj4 = obj6;
                    try {
                        int zzu = zzu(zzq);
                        try {
                        } catch (zznm unused) {
                            obj2 = obj5;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzo(obj2, zzu & 1048575, zzovVar.zza());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 1:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzp(obj2, zzu & 1048575, zzovVar.zzb());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 2:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzl());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 3:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzo());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 4:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzg());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 5:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzk());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 6:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzf());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 7:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzm(obj2, zzu & 1048575, zzovVar.zzN());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 8:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzG(obj2, zzu, zzovVar);
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 9:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzoi zzoiVar = (zzoi) zzA(obj2, zzq);
                                zzovVar.zzu(zzoiVar, zzx(zzq), zzmoVar);
                                zzJ(obj2, zzq, zzoiVar);
                                obj6 = obj3;
                                obj = obj2;
                            case 10:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzs(obj2, zzu & 1048575, zzovVar.zzp());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 11:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzj());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 12:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                int zze2 = zzovVar.zze();
                                zznh zzw = zzw(zzq);
                                if (zzw != null && !zzw.zza(zze2)) {
                                    obj6 = zzoy.zzo(obj2, zzc, zze2, obj3, zzplVar2);
                                    obj = obj2;
                                }
                                zzps.zzq(obj2, zzu & 1048575, zze2);
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzh());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 14:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzm());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 15:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzq(obj2, zzu & 1048575, zzovVar.zzi());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 16:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzps.zzr(obj2, zzu & 1048575, zzovVar.zzn());
                                zzH(obj2, zzq);
                                obj6 = obj3;
                                obj = obj2;
                            case 17:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzoi zzoiVar2 = (zzoi) zzA(obj2, zzq);
                                zzovVar.zzt(zzoiVar2, zzx(zzq), zzmoVar);
                                zzJ(obj2, zzq, zzoiVar2);
                                obj6 = obj3;
                                obj = obj2;
                            case 18:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzx(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 19:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzB(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 20:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzE(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 21:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzM(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 22:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzD(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 23:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzA(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 24:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzz(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 25:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzv(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 26:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                if (zzM(zzu)) {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj2, zzu & 1048575), true);
                                } else {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj2, zzu & 1048575), false);
                                }
                                obj6 = obj3;
                                obj = obj2;
                            case 27:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzF(zznv.zza(obj2, zzu & 1048575), zzx(zzq), zzmoVar);
                                obj6 = obj3;
                                obj = obj2;
                            case 28:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzw(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 29:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzL(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 30:
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                try {
                                    List zza2 = zznv.zza(obj5, zzu & 1048575);
                                    zzovVar.zzy(zza2);
                                    obj6 = zzoy.zzn(obj5, zzc, zza2, zzw(zzq), obj3, zzplVar2);
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar2;
                                } catch (zznm unused2) {
                                    obj2 = obj5;
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                    }
                                    if (!zzplVar2.zzk(obj6, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj5;
                                    th = th;
                                    obj6 = obj3;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 31:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzG(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 32:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzH(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 33:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzI(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 34:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzJ(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 35:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzx(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 36:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzB(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 37:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzE(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 38:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzM(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 39:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzD(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 40:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzA(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 41:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzz(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 42:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                zzovVar.zzv(zznv.zza(obj2, zzu & 1048575));
                                obj6 = obj3;
                                obj = obj2;
                            case 43:
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                try {
                                    zzovVar.zzL(zznv.zza(obj2, zzu & 1048575));
                                    obj6 = obj3;
                                } catch (zznm unused3) {
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                        try {
                                            obj6 = zzplVar2.zza(obj2);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            i = zzolVar.zzk;
                                            while (i < zzolVar.zzl) {
                                                zzolVar.zzy(obj2, zzolVar.zzj[i], obj6, zzplVar2, obj2);
                                                i++;
                                                zzolVar = this;
                                            }
                                            if (obj6 == null) {
                                                throw th;
                                            }
                                            zzplVar2.zzj(obj2, obj6);
                                            throw th;
                                        }
                                    }
                                    if (!zzplVar2.zzk(obj6, zzovVar, 0)) {
                                        for (int i2 = zzolVar.zzk; i2 < zzolVar.zzl; i2++) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i2], obj6, zzplVar2, obj2);
                                        }
                                        if (obj6 == null) {
                                        }
                                    }
                                    obj = obj2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    th = th;
                                    obj6 = obj3;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 44:
                                List zza3 = zznv.zza(obj5, zzu & 1048575);
                                zzovVar.zzy(zza3);
                                try {
                                    obj6 = zzoy.zzn(obj5, zzc, zza3, zzw(zzq), obj4, zzplVar);
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                } catch (zznm unused4) {
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    obj6 = obj3;
                                    if (obj6 == null) {
                                    }
                                    if (!zzplVar2.zzk(obj6, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj5;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    th = th;
                                    obj6 = obj3;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzovVar.zzG(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 46:
                                zzovVar.zzH(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 47:
                                zzovVar.zzI(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 48:
                                zzovVar.zzJ(zznv.zza(obj5, zzu & 1048575));
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                zzovVar.zzC(zznv.zza(obj5, zzu & 1048575), zzx(zzq), zzmoVar);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 50:
                                Object zzz = zzz(zzq);
                                long zzu2 = zzu(zzq) & 1048575;
                                Object zzf = zzps.zzf(obj5, zzu2);
                                if (zzf == null) {
                                    zzf = zzoc.zza().zzb();
                                    zzps.zzs(obj5, zzu2, zzf);
                                } else if (zzod.zza(zzf)) {
                                    Object zzb2 = zzoc.zza().zzb();
                                    zzod.zzb(zzb2, zzf);
                                    zzps.zzs(obj5, zzu2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                zzps.zzs(obj5, zzu & 1048575, Double.valueOf(zzovVar.zza()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 52:
                                zzps.zzs(obj5, zzu & 1048575, Float.valueOf(zzovVar.zzb()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 53:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzl()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 54:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzo()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 55:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 56:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzk()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 57:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 58:
                                zzps.zzs(obj5, zzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 59:
                                zzG(obj5, zzu, zzovVar);
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 60:
                                zzoi zzoiVar3 = (zzoi) zzB(obj5, zzc, zzq);
                                zzovVar.zzu(zzoiVar3, zzx(zzq), zzmoVar);
                                zzK(obj5, zzc, zzq, zzoiVar3);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 61:
                                zzps.zzs(obj5, zzu & 1048575, zzovVar.zzp());
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 62:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 63:
                                int zze3 = zzovVar.zze();
                                zznh zzw2 = zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze3)) {
                                    obj6 = zzoy.zzo(obj5, zzc, zze3, obj4, zzplVar);
                                    obj = obj5;
                                    break;
                                }
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zze3));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                                break;
                            case 64:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 65:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzm()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 66:
                                zzps.zzs(obj5, zzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 67:
                                zzps.zzs(obj5, zzu & 1048575, Long.valueOf(zzovVar.zzn()));
                                zzI(obj5, zzc, zzq);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            case 68:
                                zzoi zzoiVar4 = (zzoi) zzB(obj5, zzc, zzq);
                                zzovVar.zzt(zzoiVar4, zzx(zzq), zzmoVar);
                                zzK(obj5, zzc, zzq, zzoiVar4);
                                obj2 = obj5;
                                obj3 = obj4;
                                zzplVar2 = zzplVar;
                                obj6 = obj3;
                                obj = obj2;
                            default:
                                if (obj4 == null) {
                                    try {
                                        obj6 = zzplVar.zza(obj5);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        th = th;
                                        obj2 = obj5;
                                        obj3 = obj4;
                                        zzplVar2 = zzplVar;
                                        obj6 = obj3;
                                        i = zzolVar.zzk;
                                        while (i < zzolVar.zzl) {
                                        }
                                        if (obj6 == null) {
                                        }
                                    }
                                } else {
                                    obj6 = obj4;
                                }
                                try {
                                    if (!zzplVar.zzk(obj6, zzovVar, 0)) {
                                        for (int i3 = zzolVar.zzk; i3 < zzolVar.zzl; i3++) {
                                            zzpl zzplVar3 = zzplVar;
                                            Object obj7 = obj5;
                                            zzolVar.zzy(obj7, zzolVar.zzj[i3], obj6, zzplVar3, obj5);
                                            obj5 = obj7;
                                            zzplVar = zzplVar3;
                                        }
                                        break;
                                    }
                                    obj = obj5;
                                    break;
                                } catch (zznm unused5) {
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                    if (obj6 == null) {
                                    }
                                    if (!zzplVar2.zzk(obj6, zzovVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    th = th;
                                    obj2 = obj5;
                                    zzplVar2 = zzplVar;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        obj2 = obj5;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    int i4 = this.zzk;
                    while (i4 < this.zzl) {
                        zzy(obj, this.zzj[i4], obj6, zzplVar2, obj);
                        i4++;
                        zzplVar2 = zzplVar2;
                    }
                    obj2 = obj;
                    zzplVar2 = zzplVar2;
                } else {
                    zzplVar = zzplVar2;
                    obj4 = obj6;
                    try {
                        zznc zza4 = !this.zzh ? null : zzmoVar.zza(this.zzg, zzc);
                        if (zza4 != null) {
                            if (zzmtVar == null) {
                                try {
                                    zzmtVar = ((zzna) obj).zzi();
                                } catch (Throwable th9) {
                                    th = th9;
                                    obj2 = obj;
                                    zzolVar = this;
                                    obj3 = obj4;
                                    zzplVar2 = zzplVar;
                                    obj6 = obj3;
                                    i = zzolVar.zzk;
                                    while (i < zzolVar.zzl) {
                                    }
                                    if (obj6 == null) {
                                    }
                                }
                            }
                            zznb zznbVar = zza4.zza;
                            zzpw zzpwVar = zzpw.zzn;
                            zzpw zzpwVar2 = zznbVar.zzb;
                            if (zzpwVar2 == zzpwVar) {
                                zzovVar.zzg();
                                throw null;
                            }
                            switch (zzpwVar2.ordinal()) {
                                case 0:
                                    valueOf = Double.valueOf(zzovVar.zza());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if ((ordinal != 9 || ordinal == 10) && (zze = zzmtVar.zze(zza4.zza)) != null) {
                                        byte[] bArr = zznl.zzb;
                                        valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    }
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 1:
                                    valueOf = Float.valueOf(zzovVar.zzb());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                        break;
                                    }
                                    byte[] bArr2 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 2:
                                    valueOf = Long.valueOf(zzovVar.zzl());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 3:
                                    valueOf = Long.valueOf(zzovVar.zzo());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 4:
                                    valueOf = Integer.valueOf(zzovVar.zzg());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 5:
                                    valueOf = Long.valueOf(zzovVar.zzk());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 6:
                                    valueOf = Integer.valueOf(zzovVar.zzf());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 7:
                                    valueOf = Boolean.valueOf(zzovVar.zzN());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 8:
                                    valueOf = zzovVar.zzr();
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 9:
                                    Object zze4 = zzmtVar.zze(zza4.zza);
                                    if (!(zze4 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzb3 = zzos.zza().zzb(zze4.getClass());
                                    if (!((zznd) zze4).zzL()) {
                                        Object zze5 = zzb3.zze();
                                        zzb3.zzg(zze5, zze4);
                                        zzmtVar.zzi(zza4.zza, zze5);
                                        zze4 = zze5;
                                    }
                                    zzovVar.zzt(zze4, zzb3, zzmoVar);
                                    obj6 = obj4;
                                    break;
                                case 10:
                                    Object zze6 = zzmtVar.zze(zza4.zza);
                                    if (!(zze6 instanceof zznd)) {
                                        throw null;
                                    }
                                    zzow zzb4 = zzos.zza().zzb(zze6.getClass());
                                    if (!((zznd) zze6).zzL()) {
                                        Object zze7 = zzb4.zze();
                                        zzb4.zzg(zze7, zze6);
                                        zzmtVar.zzi(zza4.zza, zze7);
                                        zze6 = zze7;
                                    }
                                    zzovVar.zzu(zze6, zzb4, zzmoVar);
                                    obj6 = obj4;
                                    break;
                                case 11:
                                    valueOf = zzovVar.zzp();
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 12:
                                    valueOf = Integer.valueOf(zzovVar.zzj());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    valueOf = Integer.valueOf(zzovVar.zzh());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 15:
                                    valueOf = Long.valueOf(zzovVar.zzm());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 16:
                                    valueOf = Integer.valueOf(zzovVar.zzi());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                case 17:
                                    valueOf = Long.valueOf(zzovVar.zzn());
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                                default:
                                    valueOf = null;
                                    ordinal = zza4.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza4.zza, valueOf);
                                    obj6 = obj4;
                                    break;
                            }
                        } else {
                            obj6 = obj4 == null ? zzplVar.zza(obj) : obj4;
                            try {
                                if (zzplVar.zzk(obj6, zzovVar, 0)) {
                                    obj5 = obj;
                                    obj = obj5;
                                } else {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zzpl zzplVar4 = zzplVar;
                                        Object obj8 = obj;
                                        zzy(obj8, this.zzj[i5], obj6, zzplVar4, obj);
                                        zzplVar = zzplVar4;
                                        i5++;
                                        obj = obj8;
                                    }
                                    obj5 = obj;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                obj5 = obj;
                                zzolVar = this;
                                th = th;
                                obj2 = obj5;
                                zzplVar2 = zzplVar;
                                i = zzolVar.zzk;
                                while (i < zzolVar.zzl) {
                                }
                                if (obj6 == null) {
                                }
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj5 = obj;
                        zzolVar = this;
                        th = th;
                        obj2 = obj5;
                        obj3 = obj4;
                        zzplVar2 = zzplVar;
                        obj6 = obj3;
                        i = zzolVar.zzk;
                        while (i < zzolVar.zzl) {
                        }
                        if (obj6 == null) {
                        }
                    }
                }
                zzplVar2 = zzplVar;
            } catch (Throwable th12) {
                th = th12;
                obj2 = obj;
                obj3 = obj6;
                zzolVar = this;
            }
        }
        obj2 = obj5;
        zzplVar2 = zzplVar;
        if (obj6 == null) {
            zzplVar2.zzj(obj2, obj6);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkt zzktVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzpy zzpyVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        int i4;
        int i5;
        zzol<T> zzolVar = this;
        if (zzolVar.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            if (!zzmtVar.zza.isEmpty()) {
                Iterator zzf = zzmtVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zzolVar.zzc;
                Unsafe unsafe = zzb;
                i = 0;
                int i6 = 1048575;
                int i7 = 0;
                while (i < iArr.length) {
                    int zzu = zzolVar.zzu(i);
                    int[] iArr2 = zzolVar.zzc;
                    int zzt = zzt(zzu);
                    int i8 = iArr2[i];
                    if (zzt <= 17) {
                        int i9 = iArr2[i + 2];
                        int i10 = i9 & 1048575;
                        if (i10 != i6) {
                            i2 = 1;
                            i7 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        } else {
                            i2 = 1;
                        }
                        entry2 = entry;
                        i3 = i6;
                        i4 = i7;
                        i5 = i2 << (i9 >>> 20);
                    } else {
                        i2 = 1;
                        entry2 = entry;
                        i3 = i6;
                        i4 = i7;
                        i5 = 0;
                    }
                    while (entry2 != null && ((zznb) entry2.getKey()).zza <= i8) {
                        zzolVar.zzn.zzb(zzpyVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzu & 1048575;
                    switch (zzt) {
                        case 0:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzf(i8, zzps.zza(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 1:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzo(i8, zzps.zzb(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 2:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzt(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 3:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzK(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 4:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzr(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 5:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzm(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 6:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzk(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 7:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzb(i8, zzps.zzw(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 8:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzT(i8, unsafe.getObject(obj, j), zzpyVar);
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 9:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzv(i8, unsafe.getObject(obj, j), zzolVar.zzx(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 10:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzd(i8, (zzle) unsafe.getObject(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 11:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzI(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 12:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzi(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 13:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzx(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 14:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzz(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 15:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzB(i8, unsafe.getInt(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 16:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzD(i8, unsafe.getLong(obj, j));
                            }
                            zzolVar = this;
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 17:
                            if (zzolVar.zzO(obj, i, i3, i4, i5)) {
                                zzpyVar.zzq(i8, unsafe.getObject(obj, j), zzolVar.zzx(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 18:
                            zzoy.zzs(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 19:
                            zzoy.zzw(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 20:
                            zzoy.zzy(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 21:
                            zzoy.zzE(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 22:
                            zzoy.zzx(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 23:
                            zzoy.zzv(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 24:
                            zzoy.zzu(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 25:
                            zzoy.zzr(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 26:
                            int i11 = zzolVar.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zzoy.zza;
                            if (list != null && !list.isEmpty()) {
                                zzpyVar.zzH(i11, list);
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 27:
                            int i13 = zzolVar.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzow zzx = zzolVar.zzx(i);
                            int i14 = zzoy.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzlo) zzpyVar).zzv(i13, list2.get(i15), zzx);
                                }
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 28:
                            int i16 = zzolVar.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zzoy.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzpyVar.zze(i16, list3);
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 29:
                            zzoy.zzD(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 30:
                            zzoy.zzt(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 31:
                            zzoy.zzz(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 32:
                            zzoy.zzA(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 33:
                            zzoy.zzB(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 34:
                            zzoy.zzC(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, false);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 35:
                            zzoy.zzs(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 36:
                            zzoy.zzw(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 37:
                            zzoy.zzy(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 38:
                            zzoy.zzE(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 39:
                            zzoy.zzx(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 40:
                            zzoy.zzv(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 41:
                            zzoy.zzu(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 42:
                            zzoy.zzr(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 43:
                            zzoy.zzD(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 44:
                            zzoy.zzt(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 45:
                            zzoy.zzz(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 46:
                            zzoy.zzA(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 47:
                            zzoy.zzB(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 48:
                            zzoy.zzC(zzolVar.zzc[i], (List) unsafe.getObject(obj, j), zzpyVar, i2);
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            int i18 = zzolVar.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzow zzx2 = zzolVar.zzx(i);
                            int i19 = zzoy.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzlo) zzpyVar).zzq(i18, list4.get(i20), zzx2);
                                }
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzf(i8, zzn(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 52:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzo(i8, zzo(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 53:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzt(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 54:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzK(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 55:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzr(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 56:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzm(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 57:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzk(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 58:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzb(i8, zzS(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 59:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzT(i8, unsafe.getObject(obj, j), zzpyVar);
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 60:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzv(i8, unsafe.getObject(obj, j), zzolVar.zzx(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 61:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzd(i8, (zzle) unsafe.getObject(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 62:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzI(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 63:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzi(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 64:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzx(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 65:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzz(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 66:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzB(i8, zzp(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 67:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzD(i8, zzv(obj, j));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        case 68:
                            if (zzolVar.zzR(obj, i8, i)) {
                                zzpyVar.zzq(i8, unsafe.getObject(obj, j), zzolVar.zzx(i));
                            }
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                        default:
                            i += 3;
                            i7 = i4;
                            i6 = i3;
                            entry = entry2;
                    }
                }
                while (entry != null) {
                    zzolVar.zzn.zzb(zzpyVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zznd) obj).zzc.zzl(zzpyVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzolVar.zzc;
        Unsafe unsafe2 = zzb;
        i = 0;
        int i62 = 1048575;
        int i72 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zznd) obj).zzc.zzl(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzps.zza(obj, j)) == Double.doubleToLongBits(zzps.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzps.zzb(obj, j)) == Float.floatToIntBits(zzps.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzps.zzw(obj, j) == zzps.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case 50:
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
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
                    long zzr = zzr(i) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            Object obj2 = obj;
            if ((268435456 & zzu) != 0 && !zzO(obj2, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj2, i7, i6) && !zzP(obj2, zzu, zzx(i6))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzoc) zzps.zzf(obj2, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzps.zzf(obj2, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj2, i6, i, i2, i10) && !zzP(obj2, zzu, zzx(i6))) {
                return false;
            }
            i3++;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
