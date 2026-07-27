package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes9.dex */
final class zzrt<T> implements zzsa<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzsp zzi;
    private final zzqb zzj;

    private zzrt(int[] iArr, Object[] objArr, int i, int i2, zzrq zzrqVar, boolean z, int[] iArr2, int i3, int i4, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z2 = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z2 = true;
        }
        this.zzf = z2;
        this.zzg = iArr2;
        this.zzh = i3;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(Object obj, int i, zzsa zzsaVar) {
        return zzsaVar.zzh(zzsw.zzf(obj, i & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i, int i2) {
        return zzsw.zzc(obj, (long) (zzm(i2) & 1048575)) == i;
    }

    private static boolean zzD(Object obj, long j) {
        return ((Boolean) zzsw.zzf(obj, j)).booleanValue();
    }

    private static final void zzE(int i, Object obj, zztb zztbVar) throws IOException {
        if (obj instanceof String) {
            zztbVar.zzF(i, (String) obj);
        } else {
            zztbVar.zzd(i, (zzpm) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzrt zzi(Class cls, zzrn zzrnVar, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
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
        zzrz zzrzVar;
        String str;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzs;
        int i25;
        char charAt11;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzs2;
        Object obj2;
        Field zzs3;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        int i33;
        char charAt15;
        if (!(zzrnVar instanceof zzrz)) {
            throw null;
        }
        zzrz zzrzVar2 = (zzrz) zzrnVar;
        String zzd = zzrzVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (zzd.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i36 = charAt16 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt15 = zzd.charAt(i35);
                if (charAt15 < 55296) {
                    break;
                }
                i36 |= (charAt15 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt16 = i36 | (charAt15 << i37);
            i35 = i33;
        }
        if (charAt16 == 0) {
            i4 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            i5 = 0;
            i3 = 0;
            iArr = zza;
            i6 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt17 = zzd.charAt(i35);
            if (charAt17 >= 55296) {
                int i39 = charAt17 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    charAt10 = zzd.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                charAt17 = i39 | (charAt10 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int charAt18 = zzd.charAt(i38);
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                charAt18 = i42 | (charAt9 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int charAt19 = zzd.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                charAt19 = i45 | (charAt8 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            int charAt20 = zzd.charAt(i44);
            if (charAt20 >= 55296) {
                int i48 = charAt20 & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                charAt20 = i48 | (charAt7 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            charAt = zzd.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                charAt = i51 | (charAt6 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            charAt2 = zzd.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                charAt2 = i54 | (charAt5 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                charAt21 = i57 | (charAt4 << i58);
                i56 = i8;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i7 = i59 + 1;
                    charAt3 = zzd.charAt(i59);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i60 |= (charAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i7;
                }
                charAt22 = i60 | (charAt3 << i61);
                i59 = i7;
            }
            int i62 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            i2 = charAt19;
            i3 = charAt22;
            i4 = i62;
            iArr = iArr2;
            i5 = charAt20;
            i6 = charAt17;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzrzVar2.zze();
        Class<?> cls2 = zzrzVar2.zza().getClass();
        int i63 = i3 + charAt2;
        int i64 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = i3;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (i35 < length) {
            int i69 = i35 + 1;
            int charAt23 = zzd.charAt(i35);
            if (charAt23 >= c) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    charAt14 = zzd.charAt(i71);
                    if (charAt14 < c) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                }
                charAt23 = i70 | (charAt14 << i72);
                i15 = i32;
            } else {
                i15 = i69;
            }
            int i73 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i31 = i75 + 1;
                    charAt13 = zzd.charAt(i75);
                    if (charAt13 < c) {
                        break;
                    }
                    i74 |= (charAt13 & 8191) << i76;
                    i76 += 13;
                    i75 = i31;
                }
                charAt24 = i74 | (charAt13 << i76);
                i16 = i31;
            } else {
                i16 = i73;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = charAt24 & 255;
            int i78 = length;
            int i79 = charAt24 & 2048;
            int i80 = i5;
            if (i77 >= 51) {
                int i81 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i30 = i83 + 1;
                        charAt12 = zzd.charAt(i83);
                        i17 = i2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i82 |= (charAt12 & 8191) << i84;
                        i84 += 13;
                        i83 = i30;
                        i2 = i17;
                    }
                    charAt25 = i82 | (charAt12 << i84);
                    i28 = i30;
                } else {
                    i17 = i2;
                    i28 = i81;
                }
                int i85 = i77 - 51;
                int i86 = i28;
                if (i85 == 9 || i85 == 17) {
                    i29 = i4 + 1;
                    int i87 = i68 / 3;
                    objArr[i87 + i87 + 1] = zze[i4];
                } else {
                    if (i85 == 12) {
                        if (zzrzVar2.zzc() == 1 || i79 != 0) {
                            i29 = i4 + 1;
                            int i88 = i68 / 3;
                            objArr[i88 + i88 + 1] = zze[i4];
                        } else {
                            i79 = 0;
                        }
                    }
                    int i89 = charAt25 + charAt25;
                    obj = zze[i89];
                    if (obj instanceof Field) {
                        zzs2 = zzs(cls2, (String) obj);
                        zze[i89] = zzs2;
                    } else {
                        zzs2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzs2);
                    int i90 = i89 + 1;
                    obj2 = zze[i90];
                    int i91 = i79;
                    if (obj2 instanceof Field) {
                        zzs3 = zzs(cls2, (String) obj2);
                        zze[i90] = zzs3;
                    } else {
                        zzs3 = (Field) obj2;
                    }
                    i18 = i4;
                    i22 = i86;
                    i19 = charAt23;
                    i20 = (int) unsafe.objectFieldOffset(zzs3);
                    i23 = 0;
                    str = zzd;
                    zzrzVar = zzrzVar2;
                    objectFieldOffset = objectFieldOffset2;
                    i24 = i91;
                }
                i4 = i29;
                int i892 = charAt25 + charAt25;
                obj = zze[i892];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzs2);
                int i902 = i892 + 1;
                obj2 = zze[i902];
                int i912 = i79;
                if (obj2 instanceof Field) {
                }
                i18 = i4;
                i22 = i86;
                i19 = charAt23;
                i20 = (int) unsafe.objectFieldOffset(zzs3);
                i23 = 0;
                str = zzd;
                zzrzVar = zzrzVar2;
                objectFieldOffset = objectFieldOffset22;
                i24 = i912;
            } else {
                i17 = i2;
                i18 = i4 + 1;
                Field zzs4 = zzs(cls2, (String) zze[i4]);
                i19 = charAt23;
                if (i77 == 9 || i77 == 17) {
                    zzrzVar = zzrzVar2;
                    int i92 = i68 / 3;
                    objArr[i92 + i92 + 1] = zzs4.getType();
                } else {
                    if (i77 == 27) {
                        zzrzVar = zzrzVar2;
                        i26 = 1;
                        i27 = i4 + 2;
                    } else if (i77 == 49) {
                        i27 = i4 + 2;
                        zzrzVar = zzrzVar2;
                        i26 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            zzrzVar = zzrzVar2;
                            if (zzrzVar2.zzc() == 1 || i79 != 0) {
                                i27 = i4 + 2;
                                int i93 = i68 / 3;
                                objArr[i93 + i93 + 1] = zze[i18];
                                str = zzd;
                                i18 = i27;
                            } else {
                                str = zzd;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i94 = i4 + 2;
                            int i95 = i65 + 1;
                            iArr[i65] = i68;
                            int i96 = i68 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = zze[i18];
                            if (i79 != 0) {
                                i18 = i4 + 3;
                                objArr[i97 + 1] = zze[i94];
                                str = zzd;
                                i65 = i95;
                                zzrzVar = zzrzVar2;
                            } else {
                                i18 = i94;
                                i65 = i95;
                                i79 = 0;
                                zzrzVar = zzrzVar2;
                            }
                        } else {
                            zzrzVar = zzrzVar2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                        i20 = 1048575;
                        if ((charAt24 & 4096) != 0 || i77 > 17) {
                            i21 = i79;
                            i22 = i16;
                            i23 = 0;
                        } else {
                            int i98 = i16 + 1;
                            int charAt26 = str.charAt(i16);
                            if (charAt26 >= 55296) {
                                int i99 = charAt26 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i25 = i98 + 1;
                                    charAt11 = str.charAt(i98);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i99 |= (charAt11 & 8191) << i100;
                                    i100 += 13;
                                    i98 = i25;
                                }
                                charAt26 = i99 | (charAt11 << i100);
                                i98 = i25;
                            }
                            int i101 = i6 + i6 + (charAt26 / 32);
                            Object obj3 = zze[i101];
                            i22 = i98;
                            if (obj3 instanceof Field) {
                                zzs = (Field) obj3;
                            } else {
                                zzs = zzs(cls2, (String) obj3);
                                zze[i101] = zzs;
                            }
                            i21 = i79;
                            i23 = charAt26 % 32;
                            i20 = (int) unsafe.objectFieldOffset(zzs);
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = objectFieldOffset;
                            i66++;
                        }
                        i24 = i21;
                    }
                    int i102 = i68 / 3;
                    objArr[i102 + i102 + i26] = zze[i18];
                    str = zzd;
                    i18 = i27;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                    i20 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i21 = i79;
                    i22 = i16;
                    i23 = 0;
                    if (i77 >= 18) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i24 = i21;
                }
                str = zzd;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzs4);
                i20 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i21 = i79;
                i22 = i16;
                i23 = 0;
                if (i77 >= 18) {
                }
                i24 = i21;
            }
            int i103 = i68 + 1;
            iArr3[i68] = i19;
            int i104 = i68 + 2;
            Class<?> cls3 = cls2;
            iArr3[i103] = objectFieldOffset | (i24 != 0 ? Integer.MIN_VALUE : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i77 << 20);
            i68 += 3;
            iArr3[i104] = (i23 << 20) | i20;
            zzd = str;
            i4 = i18;
            length = i78;
            i5 = i80;
            cls2 = cls3;
            zzrzVar2 = zzrzVar;
            i35 = i22;
            i2 = i17;
            c = 55296;
        }
        return new zzrt(iArr3, objArr, i2, i5, zzrzVar2.zza(), false, iArr, i3, i63, zzrvVar, zzrcVar, zzspVar, zzqbVar, zzrlVar);
    }

    private static double zzj(Object obj, long j) {
        return ((Double) zzsw.zzf(obj, j)).doubleValue();
    }

    private static float zzk(Object obj, long j) {
        return ((Float) zzsw.zzf(obj, j)).floatValue();
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzsw.zzf(obj, j)).intValue();
    }

    private final int zzm(int i) {
        return this.zzc[i + 2];
    }

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzsw.zzf(obj, j)).longValue();
    }

    private final zzsa zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzsa zzsaVar = (zzsa) objArr[i3];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzb2 = zzrx.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzs(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private final void zzt(Object obj, Object obj2, int i) {
        if (zzy(obj2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzsa zzq = zzq(i);
            if (!zzy(obj, i)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzv(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzC(obj2, i2, i)) {
            int zzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzsa zzq = zzq(i);
            if (!zzC(obj, i2, i)) {
                if (zzB(object)) {
                    Object zzc = zzq.zzc();
                    zzq.zze(zzc, object);
                    unsafe.putObject(obj, j, zzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzw(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object zzc2 = zzq.zzc();
                zzq.zze(zzc2, object2);
                unsafe.putObject(obj, j, zzc2);
                object2 = zzc2;
            }
            zzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i) {
        int zzm = zzm(i);
        long j = 1048575 & zzm;
        if (j == 1048575) {
            return;
        }
        zzsw.zzq(obj, j, (1 << (zzm >>> 20)) | zzsw.zzc(obj, j));
    }

    private final void zzw(Object obj, int i, int i2) {
        zzsw.zzq(obj, zzm(i2) & 1048575, i);
    }

    private final boolean zzx(Object obj, Object obj2, int i) {
        return zzy(obj, i) == zzy(obj2, i);
    }

    private final boolean zzy(Object obj, int i) {
        int zzm = zzm(i);
        long j = zzm & 1048575;
        if (j != 1048575) {
            return (zzsw.zzc(obj, j) & (1 << (zzm >>> 20))) != 0;
        }
        int zzo = zzo(i);
        long j2 = zzo & 1048575;
        switch (zzn(zzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzsw.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsw.zzb(obj, j2)) != 0;
            case 2:
                return zzsw.zzd(obj, j2) != 0;
            case 3:
                return zzsw.zzd(obj, j2) != 0;
            case 4:
                return zzsw.zzc(obj, j2) != 0;
            case 5:
                return zzsw.zzd(obj, j2) != 0;
            case 6:
                return zzsw.zzc(obj, j2) != 0;
            case 7:
                return zzsw.zzw(obj, j2);
            case 8:
                Object zzf = zzsw.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzpm) {
                    return !zzpm.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzsw.zzf(obj, j2) != null;
            case 10:
                return !zzpm.zzb.equals(zzsw.zzf(obj, j2));
            case 11:
                return zzsw.zzc(obj, j2) != 0;
            case 12:
                return zzsw.zzc(obj, j2) != 0;
            case 13:
                return zzsw.zzc(obj, j2) != 0;
            case 14:
                return zzsw.zzd(obj, j2) != 0;
            case 15:
                return zzsw.zzc(obj, j2) != 0;
            case 16:
                return zzsw.zzd(obj, j2) != 0;
            case 17:
                return zzsw.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzy(obj, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v253, types: [int] */
    /* JADX WARN: Type inference failed for: r0v260, types: [int] */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v121, types: [int] */
    /* JADX WARN: Type inference failed for: r1v158 */
    /* JADX WARN: Type inference failed for: r1v161 */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v164 */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43, types: [int] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52, types: [int] */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81, types: [int] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84, types: [int] */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zza(Object obj) {
        int i;
        int i2;
        ?? r5;
        int zzC;
        int zzC2;
        int zzC3;
        int zzD;
        int zzC4;
        int zzC5;
        int zzd;
        int zzC6;
        ?? zzh;
        int size;
        int zzC7;
        int zzB;
        int zzB2;
        ?? r3;
        int zzj;
        int zzC8;
        ?? r1;
        ?? r0;
        int zzf;
        int zzC9;
        int zzC10;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i3 = 1048575;
        ?? r12 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                int zza2 = i5 + ((zzqm) obj).zzc.zza();
                if (!this.zzf) {
                    return zza2;
                }
                zzsi zzsiVar = ((zzqk) obj).zzb.zza;
                int zzc = zzsiVar.zzc();
                int i7 = 0;
                for (int i8 = 0; i8 < zzc; i8++) {
                    Map.Entry zzg = zzsiVar.zzg(i8);
                    i7 += zzqf.zzc((zzqe) ((zzse) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zzsiVar.zzd()) {
                    i7 += zzqf.zzc((zzqe) entry.getKey(), entry.getValue());
                }
                return zza2 + i7;
            }
            int zzo = zzo(i4);
            int zzn = zzn(zzo);
            int i9 = iArr[i4];
            int i10 = iArr[i4 + 2];
            int i11 = i10 & i3;
            if (zzn <= 17) {
                if (i11 != i6) {
                    r12 = i11 == i3 ? z : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = i6;
                i2 = r12;
                r5 = 1 << (i10 >>> 20);
            } else {
                i = i6;
                i2 = r12;
                r5 = z;
            }
            int i12 = zzo & i3;
            if (zzn >= zzqg.DOUBLE_LIST_PACKED.zza()) {
                zzqg.SINT64_LIST_PACKED.zza();
            }
            long j = i12;
            switch (zzn) {
                case 0:
                    if (zzz(obj, i4, i, i2, r5)) {
                        zzC = zzpv.zzC(i9 << 3);
                        r0 = zzC + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzz(obj, i4, i, i2, r5)) {
                        zzC2 = zzpv.zzC(i9 << 3);
                        r0 = zzC2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzz(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD(j2);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzz(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD(j3);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzz(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD(j4);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzz(obj, i4, i, i2, r5)) {
                        zzC = zzpv.zzC(i9 << 3);
                        r0 = zzC + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzz(obj, i4, i, i2, r5)) {
                        zzC2 = zzpv.zzC(i9 << 3);
                        r0 = zzC2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzz(obj, i4, i, i2, r5)) {
                        zzC4 = zzpv.zzC(i9 << 3);
                        r0 = zzC4 + 1;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzz(obj, i4, i, i2, r5)) {
                        break;
                    } else {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzpm) {
                            zzC5 = zzpv.zzC(i13);
                            zzd = ((zzpm) object).zzd();
                            zzC6 = zzpv.zzC(zzd);
                            r0 = zzC5 + zzC6 + zzd;
                            i5 += r0;
                            break;
                        } else {
                            zzC3 = zzpv.zzC(i13);
                            zzD = zzpv.zzB((String) object);
                            r0 = zzC3 + zzD;
                            i5 += r0;
                        }
                    }
                case 9:
                    if (zzz(obj, i4, i, i2, r5)) {
                        r0 = zzsc.zzi(i9, unsafe.getObject(obj, j), zzq(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzz(obj, i4, i, i2, r5)) {
                        zzpm zzpmVar = (zzpm) unsafe.getObject(obj, j);
                        zzC5 = zzpv.zzC(i9 << 3);
                        zzd = zzpmVar.zzd();
                        zzC6 = zzpv.zzC(zzd);
                        r0 = zzC5 + zzC6 + zzd;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzz(obj, i4, i, i2, r5)) {
                        int i14 = unsafe.getInt(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzC(i14);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzz(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD(j5);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzz(obj, i4, i, i2, r5)) {
                        zzC2 = zzpv.zzC(i9 << 3);
                        r0 = zzC2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzz(obj, i4, i, i2, r5)) {
                        zzC = zzpv.zzC(i9 << 3);
                        r0 = zzC + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzz(obj, i4, i, i2, r5)) {
                        int i15 = unsafe.getInt(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzC((i15 >> 31) ^ (i15 + i15));
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzz(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD((j6 >> 63) ^ (j6 + j6));
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzz(obj, i4, i, i2, r5)) {
                        r0 = zzsc.zza(i9, (zzrq) unsafe.getObject(obj, j), zzq(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    r0 = zzsc.zze(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 19:
                    r0 = zzsc.zzc(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i16 = zzsc.zza;
                    if (list.size() != 0) {
                        zzh = zzsc.zzh(list) + (list.size() * zzpv.zzC(i9 << 3));
                        i5 += zzh;
                        break;
                    }
                    zzh = z;
                    i5 += zzh;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i17 = zzsc.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzC3 = zzsc.zzm(list2);
                        zzC7 = zzpv.zzC(i9 << 3);
                        zzD = size * zzC7;
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i18 = zzsc.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzC3 = zzsc.zzg(list3);
                        zzC7 = zzpv.zzC(i9 << 3);
                        zzD = size * zzC7;
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 23:
                    r0 = zzsc.zze(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 24:
                    r0 = zzsc.zzc(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i19 = zzsc.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzpv.zzC(i9 << 3) + 1);
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i20 = zzsc.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        int zzC11 = zzpv.zzC(i9 << 3) * size3;
                        if (r02 instanceof zzrb) {
                            zzrb zzrbVar = (zzrb) r02;
                            zzh = zzC11;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object zza3 = zzrbVar.zza();
                                if (zza3 instanceof zzpm) {
                                    int zzd2 = ((zzpm) zza3).zzd();
                                    zzB2 = zzh + zzpv.zzC(zzd2) + zzd2;
                                } else {
                                    zzB2 = zzh + zzpv.zzB((String) zza3);
                                }
                                zzh = zzB2;
                            }
                        } else {
                            zzh = zzC11;
                            for (?? r33 = z; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zzpm) {
                                    int zzd3 = ((zzpm) obj2).zzd();
                                    zzB = zzh + zzpv.zzC(zzd3) + zzd3;
                                } else {
                                    zzB = zzh + zzpv.zzB((String) obj2);
                                }
                                zzh = zzB;
                            }
                        }
                        i5 += zzh;
                        break;
                    }
                    zzh = z;
                    i5 += zzh;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzsa zzq = zzq(i4);
                    int i21 = zzsc.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        r3 = zzpv.zzC(i9 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzra) {
                                zzj = ((zzra) obj3).zza();
                                zzC8 = zzpv.zzC(zzj);
                            } else {
                                zzj = ((zzpa) obj3).zzj(zzq);
                                zzC8 = zzpv.zzC(zzj);
                            }
                            r3 = (r3 == true ? 1 : 0) + zzC8 + zzj;
                        }
                    }
                    i5 += r3;
                    break;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i22 = zzsc.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        r1 = z;
                    } else {
                        r1 = size5 * zzpv.zzC(i9 << 3);
                        for (?? r2 = z; r2 < r04.size(); r2++) {
                            int zzd4 = ((zzpm) r04.get(r2)).zzd();
                            r1 += zzpv.zzC(zzd4) + zzd4;
                        }
                    }
                    i5 += r1;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i23 = zzsc.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzC3 = zzsc.zzl(list5);
                        zzC7 = zzpv.zzC(i9 << 3);
                        zzD = size * zzC7;
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i24 = zzsc.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzC3 = zzsc.zzb(list6);
                        zzC7 = zzpv.zzC(i9 << 3);
                        zzD = size * zzC7;
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 31:
                    r0 = zzsc.zzc(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 32:
                    r0 = zzsc.zze(i9, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i25 = zzsc.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzC3 = zzsc.zzj(list7);
                        zzC7 = zzpv.zzC(i9 << 3);
                        zzD = size * zzC7;
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i26 = zzsc.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzC3 = zzsc.zzk(list8);
                        zzC7 = zzpv.zzC(i9 << 3);
                        zzD = size * zzC7;
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    }
                    r0 = z;
                    i5 += r0;
                case 35:
                    zzf = zzsc.zzf((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzf = zzsc.zzd((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzf = zzsc.zzh((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzf = zzsc.zzm((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzf = zzsc.zzg((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzf = zzsc.zzf((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzf = zzsc.zzd((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i27 = zzsc.zza;
                    zzf = list9.size();
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzf = zzsc.zzl((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzf = zzsc.zzb((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzf = zzsc.zzd((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzf = zzsc.zzf((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzf = zzsc.zzj((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzf = zzsc.zzk((List) unsafe.getObject(obj, j));
                    if (zzf > 0) {
                        zzC9 = zzpv.zzC(i9 << 3);
                        zzC10 = zzpv.zzC(zzf);
                        r1 = zzC9 + zzC10 + zzf;
                        i5 += r1;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzsa zzq2 = zzq(i4);
                    int i28 = zzsc.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r34 = z2;
                        while (r34 < size6) {
                            int zza4 = zzsc.zza(i9, (zzrq) r05.get(r34), zzq2);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zza4;
                        }
                    }
                    i5 += r4;
                    break;
                case 50:
                    zzrk zzrkVar = (zzrk) unsafe.getObject(obj, j);
                    zzrj zzrjVar = (zzrj) zzr(i4);
                    if (!zzrkVar.isEmpty()) {
                        zzh = z;
                        for (Map.Entry entry2 : zzrkVar.entrySet()) {
                            zzh += zzrjVar.zza(i9, entry2.getKey(), entry2.getValue());
                        }
                        i5 += zzh;
                        break;
                    }
                    zzh = z;
                    i5 += zzh;
                case 51:
                    if (zzC(obj, i9, i4)) {
                        zzC = zzpv.zzC(i9 << 3);
                        r0 = zzC + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzC(obj, i9, i4)) {
                        zzC2 = zzpv.zzC(i9 << 3);
                        r0 = zzC2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzC(obj, i9, i4)) {
                        long zzp = zzp(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD(zzp);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzC(obj, i9, i4)) {
                        long zzp2 = zzp(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD(zzp2);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzC(obj, i9, i4)) {
                        long zzl = zzl(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD(zzl);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzC(obj, i9, i4)) {
                        zzC = zzpv.zzC(i9 << 3);
                        r0 = zzC + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzC(obj, i9, i4)) {
                        zzC2 = zzpv.zzC(i9 << 3);
                        r0 = zzC2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzC(obj, i9, i4)) {
                        zzC4 = zzpv.zzC(i9 << 3);
                        r0 = zzC4 + 1;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzC(obj, i9, i4)) {
                        break;
                    } else {
                        int i29 = i9 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzpm) {
                            zzC5 = zzpv.zzC(i29);
                            zzd = ((zzpm) object2).zzd();
                            zzC6 = zzpv.zzC(zzd);
                            r0 = zzC5 + zzC6 + zzd;
                            i5 += r0;
                            break;
                        } else {
                            zzC3 = zzpv.zzC(i29);
                            zzD = zzpv.zzB((String) object2);
                            r0 = zzC3 + zzD;
                            i5 += r0;
                        }
                    }
                case 60:
                    if (zzC(obj, i9, i4)) {
                        r0 = zzsc.zzi(i9, unsafe.getObject(obj, j), zzq(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzC(obj, i9, i4)) {
                        zzpm zzpmVar2 = (zzpm) unsafe.getObject(obj, j);
                        zzC5 = zzpv.zzC(i9 << 3);
                        zzd = zzpmVar2.zzd();
                        zzC6 = zzpv.zzC(zzd);
                        r0 = zzC5 + zzC6 + zzd;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzC(obj, i9, i4)) {
                        int zzl2 = zzl(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzC(zzl2);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzC(obj, i9, i4)) {
                        long zzl3 = zzl(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD(zzl3);
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzC(obj, i9, i4)) {
                        zzC2 = zzpv.zzC(i9 << 3);
                        r0 = zzC2 + 4;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzC(obj, i9, i4)) {
                        zzC = zzpv.zzC(i9 << 3);
                        r0 = zzC + 8;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzC(obj, i9, i4)) {
                        int zzl4 = zzl(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzC((zzl4 >> 31) ^ (zzl4 + zzl4));
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzC(obj, i9, i4)) {
                        long zzp3 = zzp(obj, j);
                        zzC3 = zzpv.zzC(i9 << 3);
                        zzD = zzpv.zzD((zzp3 >> 63) ^ (zzp3 + zzp3));
                        r0 = zzC3 + zzD;
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzC(obj, i9, i4)) {
                        r0 = zzsc.zza(i9, (zzrq) unsafe.getObject(obj, j), zzq(i4));
                        i5 += r0;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i6 = i;
            r12 = i2;
            z = false;
            i3 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((zzqm) obj).zzc.hashCode();
                return this.zzf ? (hashCode * 53) + ((zzqk) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzo = zzo(i3);
            int i5 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzn) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzsw.zza(obj, j));
                    byte[] bArr = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzsw.zzb(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr2 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr3 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr4 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzqs.zza(zzsw.zzw(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzsw.zzf(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzf = zzsw.zzf(obj, j);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr5 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr6 = zzqs.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzf2 = zzsw.zzf(obj, j);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
                    }
                    i4 = i2 + i7;
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
                    floatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzj(obj, j));
                        byte[] bArr7 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzk(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzqs.zza(zzD(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzsw.zzf(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzl(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzqs.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzC(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final Object zzc() {
        return ((zzqm) this.zze).zzr();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzd(Object obj) {
        if (zzB(obj)) {
            if (obj instanceof zzqm) {
                zzqm zzqmVar = (zzqm) obj;
                zzqmVar.zzA(Integer.MAX_VALUE);
                zzqmVar.zza = 0;
                zzqmVar.zzy();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
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
                                ((zzqr) zzsw.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzrk) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzC(obj, iArr[i], i)) {
                        zzq(i).zzd(zzb.getObject(obj, j));
                    }
                }
                if (zzy(obj, i)) {
                    zzq(i).zzd(zzb.getObject(obj, j));
                }
            }
            this.zzi.zza(obj);
            if (this.zzf) {
                this.zzj.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int zzo = zzo(i);
            int i2 = 1048575 & zzo;
            int zzn = zzn(zzo);
            int i3 = iArr[i];
            long j = i2;
            switch (zzn) {
                case 0:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzo(obj, j, zzsw.zza(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 1:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzp(obj, j, zzsw.zzb(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 2:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 3:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 4:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 5:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 6:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 7:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzm(obj, j, zzsw.zzw(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 8:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 9:
                    zzt(obj, obj2, i);
                    break;
                case 10:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 11:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 12:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 13:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 14:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 15:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 16:
                    if (!zzy(obj2, i)) {
                        break;
                    } else {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                        break;
                    }
                case 17:
                    zzt(obj, obj2, i);
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
                    zzqr zzqrVar = (zzqr) zzsw.zzf(obj, j);
                    zzqr zzqrVar2 = (zzqr) zzsw.zzf(obj2, j);
                    int size = zzqrVar.size();
                    int size2 = zzqrVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVar.zzc()) {
                            zzqrVar = zzqrVar.zzd(size2 + size);
                        }
                        zzqrVar.addAll(zzqrVar2);
                    }
                    if (size > 0) {
                        zzqrVar2 = zzqrVar;
                    }
                    zzsw.zzs(obj, j, zzqrVar2);
                    break;
                case 50:
                    int i4 = zzsc.zza;
                    zzrk zzrkVar = (zzrk) zzsw.zzf(obj, j);
                    zzrk zzrkVar2 = (zzrk) zzsw.zzf(obj2, j);
                    if (!zzrkVar2.isEmpty()) {
                        if (!zzrkVar.zze()) {
                            zzrkVar = zzrkVar.zzb();
                        }
                        zzrkVar.zzd(zzrkVar2);
                    }
                    zzsw.zzs(obj, j, zzrkVar);
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
                    if (!zzC(obj2, i3, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    }
                case 60:
                    zzu(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzC(obj2, i3, i)) {
                        break;
                    } else {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                        break;
                    }
                case 68:
                    zzu(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:235:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zztb zztbVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        Map.Entry entry3;
        if (this.zzf) {
            zzqf zzqfVar = ((zzqk) obj).zzb;
            if (!zzqfVar.zza.isEmpty()) {
                entry = (Map.Entry) zzqfVar.zzf().next();
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i5 = 1048575;
                int i6 = 1048575;
                int i7 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzo = zzo(i);
                    int zzn = zzn(zzo);
                    int i8 = iArr[i];
                    if (zzn <= 17) {
                        int i9 = iArr[i + 2];
                        int i10 = i9 & i5;
                        if (i10 != i6) {
                            i7 = i10 == i5 ? 0 : unsafe.getInt(obj, i10);
                            i6 = i10;
                        }
                        i2 = i6;
                        i3 = i7;
                        i4 = 1 << (i9 >>> 20);
                    } else {
                        i2 = i6;
                        i3 = i7;
                        i4 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = zzo & i5;
                    switch (zzn) {
                        case 0:
                            entry3 = entry;
                            if (!zzz(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zztbVar.zzf(i8, zzsw.zza(obj, j));
                                continue;
                            }
                        case 1:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzn(i8, zzsw.zzb(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzs(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzJ(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzq(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzl(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzj(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzb(i8, zzsw.zzw(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zzE(i8, unsafe.getObject(obj, j), zztbVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzv(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzd(i8, (zzpm) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzH(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzh(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzx(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzz(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzB(i8, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzD(i8, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            entry3 = entry;
                            if (zzz(obj, i, i2, i3, i4)) {
                                zztbVar.zzp(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzsc.zzr(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 19:
                            zzsc.zzv(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 20:
                            zzsc.zzx(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 21:
                            zzsc.zzD(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 22:
                            zzsc.zzw(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 23:
                            zzsc.zzu(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 24:
                            zzsc.zzt(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 25:
                            zzsc.zzq(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 26:
                            int i11 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i12 = zzsc.zza;
                            if (list != null && !list.isEmpty()) {
                                zztbVar.zzG(i11, list);
                                break;
                            }
                            break;
                        case 27:
                            int i13 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzsa zzq = zzq(i);
                            int i14 = zzsc.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i15 = 0; i15 < list2.size(); i15++) {
                                    ((zzpw) zztbVar).zzv(i13, list2.get(i15), zzq);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i16 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i17 = zzsc.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zztbVar.zze(i16, list3);
                                break;
                            }
                            break;
                        case 29:
                            zzsc.zzC(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 30:
                            zzsc.zzs(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 31:
                            zzsc.zzy(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 32:
                            zzsc.zzz(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 33:
                            zzsc.zzA(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 34:
                            zzsc.zzB(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, false);
                            break;
                        case 35:
                            zzsc.zzr(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 36:
                            zzsc.zzv(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 37:
                            zzsc.zzx(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 38:
                            zzsc.zzD(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 39:
                            zzsc.zzw(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 40:
                            zzsc.zzu(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 41:
                            zzsc.zzt(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 42:
                            zzsc.zzq(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 43:
                            zzsc.zzC(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 44:
                            zzsc.zzs(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 45:
                            zzsc.zzy(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 46:
                            zzsc.zzz(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 47:
                            zzsc.zzA(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 48:
                            zzsc.zzB(iArr[i], (List) unsafe.getObject(obj, j), zztbVar, true);
                            break;
                        case 49:
                            int i18 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzsa zzq2 = zzq(i);
                            int i19 = zzsc.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i20 = 0; i20 < list4.size(); i20++) {
                                    ((zzpw) zztbVar).zzp(i18, list4.get(i20), zzq2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zztbVar.zzu(i8, ((zzrj) zzr(i)).zzc(), (zzrk) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzf(i8, zzj(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzn(i8, zzk(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzs(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzJ(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzq(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzl(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzj(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzb(i8, zzD(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zzC(obj, i8, i)) {
                                zzE(i8, unsafe.getObject(obj, j), zztbVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzv(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzd(i8, (zzpm) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzH(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzh(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzx(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzz(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzB(i8, zzl(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzD(i8, zzp(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zzC(obj, i8, i)) {
                                zztbVar.zzp(i8, unsafe.getObject(obj, j), zzq(i));
                                break;
                            }
                            break;
                    }
                    entry3 = entry;
                    i += 3;
                    i6 = i2;
                    entry = entry3;
                    i7 = i3;
                    i5 = 1048575;
                }
                entry2 = entry;
                if (entry2 != null) {
                    zzsq zzsqVar = ((zzqm) obj).zzc;
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i52 = 1048575;
        int i62 = 1048575;
        int i72 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        entry2 = entry;
        if (entry2 != null) {
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(Object obj, Object obj2) {
        boolean zzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzo = zzo(i);
            long j = zzo & 1048575;
            switch (zzn(zzo)) {
                case 0:
                    if (zzx(obj, obj2, i) && Double.doubleToLongBits(zzsw.zza(obj, j)) == Double.doubleToLongBits(zzsw.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzx(obj, obj2, i) && Float.floatToIntBits(zzsw.zzb(obj, j)) == Float.floatToIntBits(zzsw.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzx(obj, obj2, i) && zzsw.zzw(obj, j) == zzsw.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzx(obj, obj2, i) && zzsw.zzc(obj, j) == zzsw.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzx(obj, obj2, i) && zzsw.zzd(obj, j) == zzsw.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzx(obj, obj2, i) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
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
                    zzE = zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j));
                    break;
                case 50:
                    zzE = zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j));
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
                    long zzm = zzm(i) & 1048575;
                    if (zzsw.zzc(obj, zzm) == zzsw.zzc(obj2, zzm) && zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzqm) obj).zzc.equals(((zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzqk) obj).zzb.equals(((zzqk) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzh(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzo = zzo(i6);
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
            if ((268435456 & zzo) != 0 && !zzz(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzn = zzn(zzo);
            if (zzn != 9 && zzn != 17) {
                if (zzn != 27) {
                    if (zzn == 60 || zzn == 68) {
                        if (zzC(obj, i7, i6) && !zzA(obj, zzo, zzq(i6))) {
                            return false;
                        }
                    } else if (zzn != 49) {
                        if (zzn != 50) {
                            continue;
                        } else {
                            zzrk zzrkVar = (zzrk) zzsw.zzf(obj, zzo & 1048575);
                            if (!zzrkVar.isEmpty() && ((zzrj) zzr(i6)).zzc().zzb.zzb() == zzta.MESSAGE) {
                                zzsa zzsaVar = null;
                                for (Object obj2 : zzrkVar.values()) {
                                    if (zzsaVar == null) {
                                        zzsaVar = zzrx.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzsaVar.zzh(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzsw.zzf(obj, zzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzsa zzq = zzq(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzq.zzh(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzz(obj, i6, i, i2, i10) && !zzA(obj, zzo, zzq(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzf || ((zzqk) obj).zzb.zzj();
    }
}
