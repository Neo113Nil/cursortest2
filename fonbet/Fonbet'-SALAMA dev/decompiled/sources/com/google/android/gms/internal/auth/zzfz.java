package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
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
            String arrays = Arrays.toString(declaredFields);
            StringBuilder l7 = k.l("Field ", str, " for ", name, " not found. Known fields are ");
            l7.append(arrays);
            throw new RuntimeException(l7.toString());
        }
    }

    private final void zzB(Object obj, Object obj2, int i7) {
        long zzv = zzv(i7) & 1048575;
        if (zzG(obj2, i7)) {
            Object zzf = zzhi.zzf(obj, zzv);
            Object zzf2 = zzhi.zzf(obj2, zzv);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, zzv, zzez.zzg(zzf, zzf2));
                zzD(obj, i7);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, zzv, zzf2);
                zzD(obj, i7);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i7) {
        int zzv = zzv(i7);
        int i8 = this.zzc[i7];
        long j = zzv & 1048575;
        if (zzJ(obj2, i8, i7)) {
            Object zzf = zzJ(obj, i8, i7) ? zzhi.zzf(obj, j) : null;
            Object zzf2 = zzhi.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, j, zzez.zzg(zzf, zzf2));
                zzE(obj, i8, i7);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, j, zzf2);
                zzE(obj, i8, i7);
            }
        }
    }

    private final void zzD(Object obj, int i7) {
        int zzs = zzs(i7);
        long j = 1048575 & zzs;
        if (j == 1048575) {
            return;
        }
        zzhi.zzn(obj, j, (1 << (zzs >>> 20)) | zzhi.zzc(obj, j));
    }

    private final void zzE(Object obj, int i7, int i8) {
        zzhi.zzn(obj, zzs(i8) & 1048575, i7);
    }

    private final boolean zzF(Object obj, Object obj2, int i7) {
        return zzG(obj, i7) == zzG(obj2, i7);
    }

    private final boolean zzG(Object obj, int i7) {
        int zzs = zzs(i7);
        long j = zzs & 1048575;
        if (j != 1048575) {
            return (zzhi.zzc(obj, j) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i7);
        long j3 = zzv & 1048575;
        switch (zzu(zzv)) {
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
                Object zzf = zzhi.zzf(obj, j3);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzee) {
                    return !zzee.zzb.equals(zzf);
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
        return i8 == 1048575 ? zzG(obj, i7) : (i9 & i10) != 0;
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
        zzgz zzc = zzgz.zzc();
        zzeuVar.zzc = zzc;
        return zzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i7;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char charAt4;
        int i13;
        char charAt5;
        int i14;
        char charAt6;
        int i15;
        char charAt7;
        int i16;
        char charAt8;
        int i17;
        char charAt9;
        int i18;
        char charAt10;
        int i19;
        char charAt11;
        int i20;
        int i21;
        int i22;
        int[] iArr2;
        int i23;
        int i24;
        int i25;
        int objectFieldOffset;
        int i26;
        Object[] objArr;
        int i27;
        int i28;
        int i29;
        Field zzA;
        char charAt12;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field zzA2;
        Object obj2;
        Field zzA3;
        int i33;
        char charAt13;
        int i34;
        char charAt14;
        int i35;
        char charAt15;
        int i36;
        char charAt16;
        boolean z4 = zzggVar.zzc() == 2;
        String zzd = zzggVar.zzd();
        int length = zzd.length();
        char c3 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i7 = i37 + 1;
                if (zzd.charAt(i37) < 55296) {
                    break;
                }
                i37 = i7;
            }
        } else {
            i7 = 1;
        }
        int i38 = i7 + 1;
        int charAt17 = zzd.charAt(i7);
        if (charAt17 >= 55296) {
            int i39 = charAt17 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                charAt16 = zzd.charAt(i38);
                if (charAt16 < 55296) {
                    break;
                }
                i39 |= (charAt16 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            charAt17 = i39 | (charAt16 << i40);
            i38 = i36;
        }
        if (charAt17 == 0) {
            charAt = 0;
            i11 = 0;
            charAt2 = 0;
            i10 = 0;
            charAt3 = 0;
            i8 = 0;
            iArr = zza;
            i9 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt18 = zzd.charAt(i38);
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i19 = i41 + 1;
                    charAt11 = zzd.charAt(i41);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i42 |= (charAt11 & 8191) << i43;
                    i43 += 13;
                    i41 = i19;
                }
                charAt18 = i42 | (charAt11 << i43);
                i41 = i19;
            }
            int i44 = i41 + 1;
            int charAt19 = zzd.charAt(i41);
            if (charAt19 >= 55296) {
                int i45 = charAt19 & 8191;
                int i46 = 13;
                while (true) {
                    i18 = i44 + 1;
                    charAt10 = zzd.charAt(i44);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i45 |= (charAt10 & 8191) << i46;
                    i46 += 13;
                    i44 = i18;
                }
                charAt19 = i45 | (charAt10 << i46);
                i44 = i18;
            }
            int i47 = i44 + 1;
            charAt = zzd.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i17 = i47 + 1;
                    charAt9 = zzd.charAt(i47);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i48 |= (charAt9 & 8191) << i49;
                    i49 += 13;
                    i47 = i17;
                }
                charAt = i48 | (charAt9 << i49);
                i47 = i17;
            }
            int i50 = i47 + 1;
            int charAt20 = zzd.charAt(i47);
            if (charAt20 >= 55296) {
                int i51 = charAt20 & 8191;
                int i52 = 13;
                while (true) {
                    i16 = i50 + 1;
                    charAt8 = zzd.charAt(i50);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i51 |= (charAt8 & 8191) << i52;
                    i52 += 13;
                    i50 = i16;
                }
                charAt20 = i51 | (charAt8 << i52);
                i50 = i16;
            }
            int i53 = i50 + 1;
            charAt2 = zzd.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i15 = i53 + 1;
                    charAt7 = zzd.charAt(i53);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i54 |= (charAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i15;
                }
                charAt2 = i54 | (charAt7 << i55);
                i53 = i15;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i14 = i56 + 1;
                    charAt6 = zzd.charAt(i56);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i14;
                }
                charAt21 = i57 | (charAt6 << i58);
                i56 = i14;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i13 = i59 + 1;
                    charAt5 = zzd.charAt(i59);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i60 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i13;
                }
                charAt22 = i60 | (charAt5 << i61);
                i59 = i13;
            }
            int i62 = i59 + 1;
            charAt3 = zzd.charAt(i59);
            if (charAt3 >= 55296) {
                int i63 = charAt3 & 8191;
                int i64 = 13;
                while (true) {
                    i12 = i62 + 1;
                    charAt4 = zzd.charAt(i62);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i63 |= (charAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i12;
                }
                charAt3 = i63 | (charAt4 << i64);
                i62 = i12;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i8 = charAt18 + charAt18 + charAt19;
            i9 = charAt18;
            i38 = i62;
            int i65 = charAt21;
            i10 = charAt20;
            i11 = i65;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i66 = charAt3 + i11;
        int i67 = charAt3;
        int i68 = i66;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int charAt23 = zzd.charAt(i38);
            if (charAt23 >= c3) {
                int i72 = charAt23 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    charAt15 = zzd.charAt(i73);
                    if (charAt15 < c3) {
                        break;
                    }
                    i72 |= (charAt15 & 8191) << i74;
                    i74 += 13;
                    i73 = i35;
                }
                charAt23 = i72 | (charAt15 << i74);
                i20 = i35;
            } else {
                i20 = i71;
            }
            int i75 = i20 + 1;
            int charAt24 = zzd.charAt(i20);
            if (charAt24 >= c3) {
                int i76 = charAt24 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    charAt14 = zzd.charAt(i77);
                    i21 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i76 |= (charAt14 & 8191) << i78;
                    i78 += 13;
                    i77 = i34;
                    length = i21;
                }
                charAt24 = i76 | (charAt14 << i78);
                i22 = i34;
            } else {
                i21 = length;
                i22 = i75;
            }
            int i79 = charAt24 & 255;
            int i80 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            if (i79 >= 51) {
                int i81 = i22 + 1;
                int charAt25 = zzd.charAt(i22);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i33 = i83 + 1;
                        charAt13 = zzd.charAt(i83);
                        i24 = i10;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i82 |= (charAt13 & 8191) << i84;
                        i84 += 13;
                        i83 = i33;
                        i10 = i24;
                    }
                    charAt25 = i82 | (charAt13 << i84);
                    i31 = i33;
                } else {
                    i24 = i10;
                    i31 = i81;
                }
                int i85 = i79 - 51;
                int i86 = i31;
                if (i85 == 9 || i85 == 17) {
                    int i87 = i69 / 3;
                    i32 = i8 + 1;
                    objArr2[i87 + i87 + 1] = zze[i8];
                } else {
                    if (i85 == 12 && !z4) {
                        int i88 = i69 / 3;
                        i32 = i8 + 1;
                        objArr2[i88 + i88 + 1] = zze[i8];
                    }
                    int i89 = charAt25 + charAt25;
                    obj = zze[i89];
                    if (obj instanceof Field) {
                        zzA2 = zzA(cls, (String) obj);
                        zze[i89] = zzA2;
                    } else {
                        zzA2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i23 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzA2);
                    int i90 = i89 + 1;
                    obj2 = zze[i90];
                    if (obj2 instanceof Field) {
                        zzA3 = zzA(cls, (String) obj2);
                        zze[i90] = zzA3;
                    } else {
                        zzA3 = (Field) obj2;
                    }
                    objArr = objArr2;
                    i27 = i8;
                    i28 = i86;
                    i26 = (int) unsafe.objectFieldOffset(zzA3);
                    objectFieldOffset = objectFieldOffset2;
                    i29 = 0;
                }
                i8 = i32;
                int i892 = charAt25 + charAt25;
                obj = zze[i892];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i23 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzA2);
                int i902 = i892 + 1;
                obj2 = zze[i902];
                if (obj2 instanceof Field) {
                }
                objArr = objArr2;
                i27 = i8;
                i28 = i86;
                i26 = (int) unsafe.objectFieldOffset(zzA3);
                objectFieldOffset = objectFieldOffset22;
                i29 = 0;
            } else {
                iArr2 = iArr3;
                i23 = charAt;
                i24 = i10;
                int i91 = i8 + 1;
                Field zzA4 = zzA(cls, (String) zze[i8]);
                if (i79 == 9 || i79 == 17) {
                    int i92 = i69 / 3;
                    objArr2[i92 + i92 + 1] = zzA4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        int i93 = i69 / 3;
                        i30 = i8 + 2;
                        objArr2[i93 + i93 + 1] = zze[i91];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        if (!z4) {
                            int i94 = i69 / 3;
                            i30 = i8 + 2;
                            objArr2[i94 + i94 + 1] = zze[i91];
                        }
                    } else if (i79 == 50) {
                        int i95 = i67 + 1;
                        iArr[i67] = i69;
                        int i96 = i69 / 3;
                        int i97 = i96 + i96;
                        int i98 = i8 + 2;
                        objArr2[i97] = zze[i91];
                        if ((charAt24 & 2048) != 0) {
                            i91 = i8 + 3;
                            objArr2[i97 + 1] = zze[i98];
                            i67 = i95;
                        } else {
                            i67 = i95;
                            i25 = i98;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                            i26 = 1048575;
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i79 > 17) {
                                i27 = i25;
                                i28 = i22;
                                i29 = 0;
                            } else {
                                int i99 = i22 + 1;
                                int charAt26 = zzd.charAt(i22);
                                if (charAt26 >= 55296) {
                                    int i100 = charAt26 & 8191;
                                    int i101 = 13;
                                    while (true) {
                                        i28 = i99 + 1;
                                        charAt12 = zzd.charAt(i99);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i100 |= (charAt12 & 8191) << i101;
                                        i101 += 13;
                                        i99 = i28;
                                    }
                                    charAt26 = i100 | (charAt12 << i101);
                                } else {
                                    i28 = i99;
                                }
                                int i102 = (charAt26 / 32) + i9 + i9;
                                Object obj3 = zze[i102];
                                if (obj3 instanceof Field) {
                                    zzA = (Field) obj3;
                                } else {
                                    zzA = zzA(cls, (String) obj3);
                                    zze[i102] = zzA;
                                }
                                i27 = i25;
                                i29 = charAt26 % 32;
                                i26 = (int) unsafe.objectFieldOffset(zzA);
                            }
                            if (i79 >= 18 && i79 <= 49) {
                                iArr[i68] = objectFieldOffset;
                                i68++;
                            }
                        }
                    }
                    i25 = i30;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                    i26 = 1048575;
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    i27 = i25;
                    i28 = i22;
                    i29 = 0;
                    if (i79 >= 18) {
                        iArr[i68] = objectFieldOffset;
                        i68++;
                    }
                }
                i25 = i91;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                i26 = 1048575;
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                i27 = i25;
                i28 = i22;
                i29 = 0;
                if (i79 >= 18) {
                }
            }
            int i103 = i69 + 1;
            iArr2[i69] = charAt23;
            int i104 = i69 + 2;
            iArr2[i103] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i79 << 20) | objectFieldOffset;
            i69 += 3;
            iArr2[i104] = (i29 << 20) | i26;
            charAt = i23;
            charAt3 = i80;
            i38 = i28;
            length = i21;
            objArr2 = objArr;
            i8 = i27;
            iArr3 = iArr2;
            i10 = i24;
            c3 = 55296;
        }
        return new zzfz(iArr3, objArr2, charAt, i10, zzggVar.zza(), z4, false, iArr, charAt3, i66, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzhi.zzf(obj, j)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i7, int i8, int i9, long j, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i9);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfq) object).zze()) {
            zzfq zzb2 = zzfq.zza().zzb();
            zzfr.zza(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        long j3 = this.zzc[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i7))));
                    unsafe.putInt(obj, j3, i10);
                    return i7 + 8;
                }
                break;
            case 52:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i7))));
                    unsafe.putInt(obj, j3, i10);
                    return i7 + 4;
                }
                break;
            case 53:
            case 54:
                if (i11 == 0) {
                    int zzm = zzdt.zzm(bArr, i7, zzdsVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzdsVar.zzb));
                    unsafe.putInt(obj, j3, i10);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i11 == 0) {
                    int zzj = zzdt.zzj(bArr, i7, zzdsVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzdsVar.zza));
                    unsafe.putInt(obj, j3, i10);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i7)));
                    unsafe.putInt(obj, j3, i10);
                    return i7 + 8;
                }
                break;
            case 57:
            case 64:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i7)));
                    unsafe.putInt(obj, j3, i10);
                    return i7 + 4;
                }
                break;
            case 58:
                if (i11 == 0) {
                    int zzm2 = zzdt.zzm(bArr, i7, zzdsVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzdsVar.zzb != 0));
                    unsafe.putInt(obj, j3, i10);
                    return zzm2;
                }
                break;
            case 59:
                if (i11 == 2) {
                    int zzj2 = zzdt.zzj(bArr, i7, zzdsVar);
                    int i15 = zzdsVar.zza;
                    if (i15 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i12 & 536870912) != 0 && !zzhm.zzd(bArr, zzj2, zzj2 + i15)) {
                            throw zzfa.zzb();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i15, zzez.zzb));
                        zzj2 += i15;
                    }
                    unsafe.putInt(obj, j3, i10);
                    return zzj2;
                }
                break;
            case 60:
                if (i11 == 2) {
                    int zzd = zzdt.zzd(zzy(i14), bArr, i7, i8, zzdsVar);
                    Object object = unsafe.getInt(obj, j3) == i10 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j3, i10);
                    return zzd;
                }
                break;
            case 61:
                if (i11 == 2) {
                    int zza2 = zzdt.zza(bArr, i7, zzdsVar);
                    unsafe.putObject(obj, j, zzdsVar.zzc);
                    unsafe.putInt(obj, j3, i10);
                    return zza2;
                }
                break;
            case 63:
                if (i11 == 0) {
                    int zzj3 = zzdt.zzj(bArr, i7, zzdsVar);
                    int i16 = zzdsVar.zza;
                    zzex zzx = zzx(i14);
                    if (zzx == null || zzx.zza()) {
                        unsafe.putObject(obj, j, Integer.valueOf(i16));
                        unsafe.putInt(obj, j3, i10);
                    } else {
                        zzc(obj).zzf(i9, Long.valueOf(i16));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i11 == 0) {
                    int zzj4 = zzdt.zzj(bArr, i7, zzdsVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                    unsafe.putInt(obj, j3, i10);
                    return zzj4;
                }
                break;
            case 67:
                if (i11 == 0) {
                    int zzm3 = zzdt.zzm(bArr, i7, zzdsVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                    unsafe.putInt(obj, j3, i10);
                    return zzm3;
                }
                break;
            case 68:
                if (i11 == 3) {
                    int zzc = zzdt.zzc(zzy(i14), bArr, i7, i8, (i9 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j3) == i10 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object2, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j3, i10);
                    return zzc;
                }
                break;
        }
        return i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i7, int i8, zzds zzdsVar) {
        byte b7;
        int i9;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        int zzm;
        int zzd;
        int i17;
        int i18;
        int i19;
        zzfz<T> zzfzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i20 = i8;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i21 = 1048575;
        int i22 = -1;
        int i23 = i7;
        int i24 = -1;
        int i25 = 1048575;
        int i26 = 0;
        int i27 = 0;
        while (i23 < i20) {
            int i28 = i23 + 1;
            byte b8 = bArr2[i23];
            if (b8 < 0) {
                i9 = zzdt.zzk(b8, bArr2, i28, zzdsVar2);
                b7 = zzdsVar2.zza;
            } else {
                b7 = b8;
                i9 = i28;
            }
            int i29 = b7 >>> 3;
            int i30 = b7 & 7;
            int zzr = i29 > i24 ? zzfzVar.zzr(i29, i26 / 3) : zzfzVar.zzq(i29);
            if (zzr == i22) {
                i10 = i9;
                i11 = i29;
                i12 = i22;
                unsafe = unsafe2;
                i13 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i31 = iArr[zzr + 1];
                int zzu = zzu(i31);
                long j = i31 & i21;
                if (zzu <= 17) {
                    int i32 = iArr[zzr + 2];
                    int i33 = 1 << (i32 >>> 20);
                    int i34 = i32 & 1048575;
                    if (i34 != i25) {
                        if (i25 != 1048575) {
                            unsafe2.putInt(obj2, i25, i27);
                        }
                        if (i34 != 1048575) {
                            i27 = unsafe2.getInt(obj2, i34);
                        }
                        i25 = i34;
                    }
                    switch (zzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i15 = i9;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 1) {
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzhi.zzl(obj2, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i15)));
                                i23 = i15 + 8;
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i15 = i9;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 5) {
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzhi.zzm(obj2, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i15)));
                                i23 = i15 + 4;
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i15 = i9;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzm = zzdt.zzm(bArr2, i15, zzdsVar2);
                                unsafe2.putLong(obj, j, zzdsVar2.zzb);
                                i27 |= i33;
                                i23 = zzm;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i15 = i9;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                i23 = zzdt.zzj(bArr2, i15, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzdsVar2.zza);
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 1) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                i15 = i9;
                                unsafe2.putLong(obj, j, zzdt.zzn(bArr2, i9));
                                i23 = i15 + 8;
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 5) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, zzdt.zzb(bArr2, i9));
                                i23 = i9 + 4;
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                i23 = zzdt.zzm(bArr2, i9, zzdsVar2);
                                zzhi.zzk(obj2, j, zzdsVar2.zzb != 0);
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 2) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                i23 = (536870912 & i31) == 0 ? zzdt.zzg(bArr2, i9, zzdsVar2) : zzdt.zzh(bArr2, i9, zzdsVar2);
                                unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                i27 |= i33;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 9:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 2) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzd(zzfzVar.zzy(i14), bArr2, i9, i20, zzdsVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i27 |= i33;
                                i23 = zzd;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 10:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 2) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzd = zzdt.zza(bArr2, i9, zzdsVar2);
                                unsafe2.putObject(obj2, j, zzdsVar2.zzc);
                                i27 |= i33;
                                i23 = zzd;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 12:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzj(bArr2, i9, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzdsVar2.zza);
                                i27 |= i33;
                                i23 = zzd;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i16 = 1048575;
                            i11 = i29;
                            if (i30 != 0) {
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzd = zzdt.zzj(bArr2, i9, zzdsVar2);
                                unsafe2.putInt(obj2, j, zzei.zzb(zzdsVar2.zza));
                                i27 |= i33;
                                i23 = zzd;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        case 16:
                            if (i30 != 0) {
                                i11 = i29;
                                i14 = zzr;
                                i15 = i9;
                                i10 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                i12 = -1;
                                break;
                            } else {
                                zzdsVar2 = zzdsVar;
                                zzm = zzdt.zzm(bArr2, i9, zzdsVar2);
                                i14 = zzr;
                                i11 = i29;
                                i16 = 1048575;
                                unsafe2.putLong(obj, j, zzei.zzc(zzdsVar2.zzb));
                                i27 |= i33;
                                i23 = zzm;
                                i26 = i14;
                                i24 = i11;
                                i21 = i16;
                                i22 = -1;
                                break;
                            }
                        default:
                            i11 = i29;
                            i14 = zzr;
                            i15 = i9;
                            i10 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            i12 = -1;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i14 = zzr;
                    int i35 = i9;
                    i16 = 1048575;
                    i11 = i29;
                    if (zzu == 27) {
                        if (i30 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj2, j);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzeyVar);
                            }
                            i23 = zzdt.zze(zzfzVar.zzy(i14), b7, bArr, i35, i8, zzeyVar, zzdsVar);
                            i27 = i27;
                            i26 = i14;
                            i24 = i11;
                            i21 = i16;
                            i22 = -1;
                        } else {
                            i17 = i35;
                            i18 = i27;
                            i19 = i25;
                            unsafe = unsafe2;
                            i13 = i14;
                            i12 = -1;
                        }
                    } else if (zzu <= 49) {
                        i18 = i27;
                        i19 = i25;
                        i12 = -1;
                        unsafe = unsafe2;
                        i13 = i14;
                        i23 = zzp(obj, bArr, i35, i8, b7, i11, i30, i14, i31, zzu, j, zzdsVar);
                        if (i23 != i35) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i20 = i8;
                            zzdsVar2 = zzdsVar;
                            i25 = i19;
                            i22 = i12;
                            i24 = i11;
                            i27 = i18;
                            i26 = i13;
                            unsafe2 = unsafe;
                            i21 = 1048575;
                            zzfzVar = this;
                        } else {
                            i10 = i23;
                            i25 = i19;
                            i27 = i18;
                        }
                    } else {
                        i17 = i35;
                        i18 = i27;
                        i19 = i25;
                        unsafe = unsafe2;
                        i13 = i14;
                        i12 = -1;
                        if (zzu != 50) {
                            i23 = zzn(obj, bArr, i17, i8, b7, i11, i30, i31, zzu, j, i13, zzdsVar);
                            if (i23 != i17) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i20 = i8;
                                zzdsVar2 = zzdsVar;
                                i25 = i19;
                                i22 = i12;
                                i24 = i11;
                                i27 = i18;
                                i26 = i13;
                                unsafe2 = unsafe;
                                i21 = 1048575;
                                zzfzVar = this;
                            } else {
                                i10 = i23;
                                i25 = i19;
                                i27 = i18;
                            }
                        } else if (i30 == 2) {
                            i23 = zzm(obj, bArr, i17, i8, i13, j, zzdsVar);
                            if (i23 != i17) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i20 = i8;
                                zzdsVar2 = zzdsVar;
                                i25 = i19;
                                i22 = i12;
                                i24 = i11;
                                i27 = i18;
                                i26 = i13;
                                unsafe2 = unsafe;
                                i21 = 1048575;
                                zzfzVar = this;
                            } else {
                                i10 = i23;
                                i25 = i19;
                                i27 = i18;
                            }
                        }
                    }
                    i10 = i17;
                    i25 = i19;
                    i27 = i18;
                }
            }
            i23 = zzdt.zzi(b7, bArr, i10, i8, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i20 = i8;
            zzdsVar2 = zzdsVar;
            i22 = i12;
            i24 = i11;
            i26 = i13;
            unsafe2 = unsafe;
            i21 = 1048575;
        }
        int i36 = i27;
        int i37 = i25;
        Unsafe unsafe3 = unsafe2;
        if (i37 != i21) {
            unsafe3.putInt(obj, i37, i36);
        }
        if (i23 == i8) {
            return i23;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, long j, int i13, long j3, zzds zzdsVar) {
        int i14;
        int i15;
        int i16;
        int i17;
        int zzj;
        int i18 = i7;
        Unsafe unsafe = zzb;
        zzey zzeyVar = (zzey) unsafe.getObject(obj, j3);
        if (!zzeyVar.zzc()) {
            int size = zzeyVar.size();
            zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j3, zzeyVar);
        }
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int zzj2 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i19 = zzdsVar.zza + zzj2;
                    while (zzj2 < i19) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i19) {
                        return zzj2;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i7)));
                    while (true) {
                        i14 = i18 + 8;
                        if (i14 < i8) {
                            i18 = zzdt.zzj(bArr, i14, zzdsVar);
                            if (i9 == zzdsVar.zza) {
                                zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i18)));
                            }
                        }
                    }
                    return i14;
                }
                return i18;
            case 19:
            case 36:
                if (i11 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int zzj3 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i20 = zzdsVar.zza + zzj3;
                    while (zzj3 < i20) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i20) {
                        return zzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i7)));
                    while (true) {
                        i15 = i18 + 4;
                        if (i15 < i8) {
                            i18 = zzdt.zzj(bArr, i15, zzdsVar);
                            if (i9 == zzdsVar.zza) {
                                zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i18)));
                            }
                        }
                    }
                    return i15;
                }
                return i18;
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i11 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int zzj4 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i21 = zzdsVar.zza + zzj4;
                    while (zzj4 < i21) {
                        zzj4 = zzdt.zzm(bArr, zzj4, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (zzj4 == i21) {
                        return zzj4;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int zzm = zzdt.zzm(bArr, i18, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (zzm < i8) {
                        int zzj5 = zzdt.zzj(bArr, zzm, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return zzm;
                        }
                        zzm = zzdt.zzm(bArr, zzj5, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return zzm;
                }
                return i18;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return zzdt.zzf(bArr, i18, zzeyVar, zzdsVar);
                }
                if (i11 == 0) {
                    return zzdt.zzl(i9, bArr, i7, i8, zzeyVar, zzdsVar);
                }
                return i18;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int zzj6 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i22 = zzdsVar.zza + zzj6;
                    while (zzj6 < i22) {
                        zzflVar3.zze(zzdt.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i22) {
                        return zzj6;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i7));
                    while (true) {
                        i16 = i18 + 8;
                        if (i16 < i8) {
                            i18 = zzdt.zzj(bArr, i16, zzdsVar);
                            if (i9 == zzdsVar.zza) {
                                zzflVar4.zze(zzdt.zzn(bArr, i18));
                            }
                        }
                    }
                    return i16;
                }
                return i18;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int zzj7 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i23 = zzdsVar.zza + zzj7;
                    while (zzj7 < i23) {
                        zzevVar.zze(zzdt.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i23) {
                        return zzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i7));
                    while (true) {
                        i17 = i18 + 4;
                        if (i17 < i8) {
                            i18 = zzdt.zzj(bArr, i17, zzdsVar);
                            if (i9 == zzdsVar.zza) {
                                zzevVar2.zze(zzdt.zzb(bArr, i18));
                            }
                        }
                    }
                    return i17;
                }
                return i18;
            case 25:
            case 42:
                if (i11 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    zzj = zzdt.zzj(bArr, i18, zzdsVar);
                    int i24 = zzdsVar.zza + zzj;
                    while (zzj < i24) {
                        zzj = zzdt.zzm(bArr, zzj, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (zzj != i24) {
                        throw zzfa.zzf();
                    }
                    return zzj;
                }
                if (i11 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int zzm2 = zzdt.zzm(bArr, i18, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (zzm2 < i8) {
                        int zzj8 = zzdt.zzj(bArr, zzm2, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzdt.zzm(bArr, zzj8, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i18;
            case 26:
                if (i11 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj9 = zzdt.zzj(bArr, i18, zzdsVar);
                        int i25 = zzdsVar.zza;
                        if (i25 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i25 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, zzj9, i25, zzez.zzb));
                            zzj9 += i25;
                        }
                        while (zzj9 < i8) {
                            int zzj10 = zzdt.zzj(bArr, zzj9, zzdsVar);
                            if (i9 != zzdsVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzdt.zzj(bArr, zzj10, zzdsVar);
                            int i26 = zzdsVar.zza;
                            if (i26 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i26 == 0) {
                                zzeyVar.add("");
                            } else {
                                zzeyVar.add(new String(bArr, zzj9, i26, zzez.zzb));
                                zzj9 += i26;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i27 = zzdsVar.zza;
                    if (i27 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i27 == 0) {
                        zzeyVar.add("");
                    } else {
                        int i28 = zzj11 + i27;
                        if (!zzhm.zzd(bArr, zzj11, i28)) {
                            throw zzfa.zzb();
                        }
                        zzeyVar.add(new String(bArr, zzj11, i27, zzez.zzb));
                        zzj11 = i28;
                    }
                    while (zzj11 < i8) {
                        int zzj12 = zzdt.zzj(bArr, zzj11, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzdt.zzj(bArr, zzj12, zzdsVar);
                        int i29 = zzdsVar.zza;
                        if (i29 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i29 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i30 = zzj11 + i29;
                            if (!zzhm.zzd(bArr, zzj11, i30)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, zzj11, i29, zzez.zzb));
                            zzj11 = i30;
                        }
                    }
                    return zzj11;
                }
                return i18;
            case 27:
                if (i11 == 2) {
                    return zzdt.zze(zzy(i12), i9, bArr, i7, i8, zzeyVar, zzdsVar);
                }
                return i18;
            case 28:
                if (i11 == 2) {
                    int zzj13 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i31 = zzdsVar.zza;
                    if (i31 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i31 > bArr.length - zzj13) {
                        throw zzfa.zzf();
                    }
                    if (i31 == 0) {
                        zzeyVar.add(zzee.zzb);
                    } else {
                        zzeyVar.add(zzee.zzk(bArr, zzj13, i31));
                        zzj13 += i31;
                    }
                    while (zzj13 < i8) {
                        int zzj14 = zzdt.zzj(bArr, zzj13, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzdt.zzj(bArr, zzj14, zzdsVar);
                        int i32 = zzdsVar.zza;
                        if (i32 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i32 > bArr.length - zzj13) {
                            throw zzfa.zzf();
                        }
                        if (i32 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, zzj13, i32));
                            zzj13 += i32;
                        }
                    }
                    return zzj13;
                }
                return i18;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        zzj = zzdt.zzl(i9, bArr, i7, i8, zzeyVar, zzdsVar);
                    }
                    return i18;
                }
                zzj = zzdt.zzf(bArr, i18, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object zzd = zzgj.zzd(i10, zzeyVar, zzx(i12), zzgzVar, this.zzm);
                if (zzd != null) {
                    zzeuVar.zzc = (zzgz) zzd;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i11 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int zzj15 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i33 = zzdsVar.zza + zzj15;
                    while (zzj15 < i33) {
                        zzj15 = zzdt.zzj(bArr, zzj15, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (zzj15 == i33) {
                        return zzj15;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int zzj16 = zzdt.zzj(bArr, i18, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (zzj16 < i8) {
                        int zzj17 = zzdt.zzj(bArr, zzj16, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzdt.zzj(bArr, zzj17, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return zzj16;
                }
                return i18;
            case 34:
            case 48:
                if (i11 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int zzj18 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i34 = zzdsVar.zza + zzj18;
                    while (zzj18 < i34) {
                        zzj18 = zzdt.zzm(bArr, zzj18, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (zzj18 == i34) {
                        return zzj18;
                    }
                    throw zzfa.zzf();
                }
                if (i11 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int zzm3 = zzdt.zzm(bArr, i18, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (zzm3 < i8) {
                        int zzj19 = zzdt.zzj(bArr, zzm3, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzdt.zzm(bArr, zzj19, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return zzm3;
                }
                return i18;
            default:
                if (i11 == 3) {
                    zzgh zzy = zzy(i12);
                    int i35 = (i9 & (-8)) | 4;
                    int zzc = zzdt.zzc(zzy, bArr, i7, i8, i35, zzdsVar);
                    zzeyVar.add(zzdsVar.zzc);
                    while (zzc < i8) {
                        int zzj20 = zzdt.zzj(bArr, zzc, zzdsVar);
                        if (i9 != zzdsVar.zza) {
                            return zzc;
                        }
                        zzc = zzdt.zzc(zzy, bArr, zzj20, i8, i35, zzdsVar);
                        zzeyVar.add(zzdsVar.zzc);
                    }
                    return zzc;
                }
                return i18;
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
        zzgh zzb2 = zzge.zza().zzb((Class) this.zzd[i9 + 1]);
        this.zzd[i9] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i7) {
        int i8 = i7 / 3;
        return this.zzd[i8 + i8];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i7;
        int zzc;
        int i8;
        int zzc2;
        int length = this.zzc.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzv = zzv(i10);
            int i11 = this.zzc[i10];
            long j = 1048575 & zzv;
            int i12 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i7 = i9 * 53;
                    zzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j)));
                    i9 = zzc + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    zzc = Float.floatToIntBits(zzhi.zzb(obj, j));
                    i9 = zzc + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 4:
                    i8 = i9 * 53;
                    zzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 5:
                    i7 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 6:
                    i8 = i9 * 53;
                    zzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 7:
                    i7 = i9 * 53;
                    zzc = zzez.zza(zzhi.zzt(obj, j));
                    i9 = zzc + i7;
                    break;
                case 8:
                    i7 = i9 * 53;
                    zzc = ((String) zzhi.zzf(obj, j)).hashCode();
                    i9 = zzc + i7;
                    break;
                case 9:
                    Object zzf = zzhi.zzf(obj, j);
                    if (zzf != null) {
                        i12 = zzf.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 10:
                    i7 = i9 * 53;
                    zzc = zzhi.zzf(obj, j).hashCode();
                    i9 = zzc + i7;
                    break;
                case 11:
                    i8 = i9 * 53;
                    zzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 12:
                    i8 = i9 * 53;
                    zzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 13:
                    i8 = i9 * 53;
                    zzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 14:
                    i7 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 15:
                    i8 = i9 * 53;
                    zzc2 = zzhi.zzc(obj, j);
                    i9 = i8 + zzc2;
                    break;
                case 16:
                    i7 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j));
                    i9 = zzc + i7;
                    break;
                case 17:
                    Object zzf2 = zzhi.zzf(obj, j);
                    if (zzf2 != null) {
                        i12 = zzf2.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
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
                    zzc = zzhi.zzf(obj, j).hashCode();
                    i9 = zzc + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    zzc = zzhi.zzf(obj, j).hashCode();
                    i9 = zzc + i7;
                    break;
                case 51:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j)).doubleValue()));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j)).floatValue());
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzl(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzl(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzez.zza(((Boolean) zzhi.zzf(obj, j)).booleanValue());
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = ((String) zzhi.zzf(obj, j)).hashCode();
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzhi.zzf(obj, j).hashCode();
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzhi.zzf(obj, j).hashCode();
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzl(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzl(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzl(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc2 = zzl(obj, j);
                        i9 = i8 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j));
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(obj, i11, i10)) {
                        i7 = i9 * 53;
                        zzc = zzhi.zzf(obj, j).hashCode();
                        i9 = zzc + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.zzm.zza(obj).hashCode() + (i9 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03b8, code lost:
    
        if (r0 != r19) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03ba, code lost:
    
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r9 = r37;
        r2 = r17;
        r3 = r18;
        r1 = r20;
        r5 = r22;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03d4, code lost:
    
        r7 = r36;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03fa, code lost:
    
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x041d, code lost:
    
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(Object obj, byte[] bArr, int i7, int i8, int i9, zzds zzdsVar) {
        Unsafe unsafe;
        int i10;
        Object obj2;
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
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i29 = i8;
        int i30 = i9;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i31 = i7;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = -1;
        int i36 = 1048575;
        while (true) {
            if (i31 < i29) {
                int i37 = i31 + 1;
                byte b7 = bArr2[i31];
                if (b7 < 0) {
                    int zzk = zzdt.zzk(b7, bArr2, i37, zzdsVar2);
                    i11 = zzdsVar2.zza;
                    i37 = zzk;
                } else {
                    i11 = b7;
                }
                int i38 = i11 >>> 3;
                int i39 = i11 & 7;
                int zzr = i38 > i35 ? zzfzVar.zzr(i38, i33 / 3) : zzfzVar.zzq(i38);
                if (zzr == -1) {
                    i12 = i38;
                    i13 = i11;
                    i14 = i34;
                    unsafe = unsafe2;
                    i10 = i30;
                    i15 = 0;
                    i16 = i37;
                } else {
                    int[] iArr = zzfzVar.zzc;
                    int i40 = iArr[zzr + 1];
                    int zzu = zzu(i40);
                    int i41 = i37;
                    long j = i40 & 1048575;
                    int i42 = i11;
                    if (zzu <= 17) {
                        int i43 = iArr[zzr + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        if (i45 != i36) {
                            i19 = zzr;
                            if (i36 != 1048575) {
                                unsafe2.putInt(obj3, i36, i34);
                            }
                            i17 = i45;
                            i20 = unsafe2.getInt(obj3, i45);
                        } else {
                            i19 = zzr;
                            i17 = i36;
                            i20 = i34;
                        }
                        switch (zzu) {
                            case 0:
                                i23 = i19;
                                i22 = i41;
                                bArr2 = bArr;
                                i12 = i38;
                                if (i39 == 1) {
                                    zzhi.zzl(obj3, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i22)));
                                    i31 = i22 + 8;
                                    i34 = i20 | i44;
                                    i30 = i9;
                                    i33 = i23;
                                    i35 = i12;
                                    i32 = i42;
                                    i36 = i17;
                                    i29 = i8;
                                    break;
                                } else {
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 1:
                                i23 = i19;
                                i22 = i41;
                                bArr2 = bArr;
                                i12 = i38;
                                if (i39 == 5) {
                                    zzhi.zzm(obj3, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i22)));
                                    i31 = i22 + 4;
                                    i34 = i20 | i44;
                                    i30 = i9;
                                    i33 = i23;
                                    i35 = i12;
                                    i32 = i42;
                                    i36 = i17;
                                    i29 = i8;
                                    break;
                                } else {
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 2:
                            case 3:
                                i23 = i19;
                                i22 = i41;
                                bArr2 = bArr;
                                i12 = i38;
                                if (i39 == 0) {
                                    int zzm = zzdt.zzm(bArr2, i22, zzdsVar2);
                                    unsafe2.putLong(obj, j, zzdsVar2.zzb);
                                    i34 = i20 | i44;
                                    i30 = i9;
                                    i31 = zzm;
                                    i33 = i23;
                                    i35 = i12;
                                    i32 = i42;
                                    i36 = i17;
                                    i29 = i8;
                                    break;
                                } else {
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 4:
                            case 11:
                                i23 = i19;
                                i22 = i41;
                                bArr2 = bArr;
                                i12 = i38;
                                if (i39 == 0) {
                                    i31 = zzdt.zzj(bArr2, i22, zzdsVar2);
                                    unsafe2.putInt(obj3, j, zzdsVar2.zza);
                                    i34 = i20 | i44;
                                    i30 = i9;
                                    i33 = i23;
                                    i35 = i12;
                                    i32 = i42;
                                    i36 = i17;
                                    i29 = i8;
                                    break;
                                } else {
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 5:
                            case 14:
                                i22 = i41;
                                i24 = i42;
                                bArr2 = bArr;
                                int i46 = i19;
                                i12 = i38;
                                i25 = i46;
                                if (i39 == 1) {
                                    i42 = i24;
                                    i23 = i25;
                                    unsafe2.putLong(obj, j, zzdt.zzn(bArr2, i22));
                                    i31 = i22 + 8;
                                    i34 = i20 | i44;
                                    i30 = i9;
                                    i33 = i23;
                                    i35 = i12;
                                    i32 = i42;
                                    i36 = i17;
                                    i29 = i8;
                                    break;
                                } else {
                                    i42 = i24;
                                    i23 = i25;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 6:
                            case 13:
                                i26 = i8;
                                i22 = i41;
                                i24 = i42;
                                bArr2 = bArr;
                                int i47 = i19;
                                i12 = i38;
                                i25 = i47;
                                if (i39 == 5) {
                                    unsafe2.putInt(obj3, j, zzdt.zzb(bArr2, i22));
                                    i27 = i22 + 4;
                                    int i48 = i20 | i44;
                                    i30 = i9;
                                    i33 = i25;
                                    i31 = i27;
                                    i32 = i24;
                                    i36 = i17;
                                    i29 = i26;
                                    i34 = i48;
                                    i35 = i12;
                                    break;
                                } else {
                                    i42 = i24;
                                    i23 = i25;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 7:
                                i26 = i8;
                                i22 = i41;
                                i24 = i42;
                                bArr2 = bArr;
                                int i49 = i19;
                                i12 = i38;
                                i25 = i49;
                                if (i39 == 0) {
                                    i27 = zzdt.zzm(bArr2, i22, zzdsVar2);
                                    zzhi.zzk(obj3, j, zzdsVar2.zzb != 0);
                                    int i482 = i20 | i44;
                                    i30 = i9;
                                    i33 = i25;
                                    i31 = i27;
                                    i32 = i24;
                                    i36 = i17;
                                    i29 = i26;
                                    i34 = i482;
                                    i35 = i12;
                                    break;
                                } else {
                                    i42 = i24;
                                    i23 = i25;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 8:
                                i26 = i8;
                                i22 = i41;
                                i24 = i42;
                                bArr2 = bArr;
                                int i50 = i19;
                                i12 = i38;
                                i25 = i50;
                                if (i39 == 2) {
                                    i27 = (536870912 & i40) == 0 ? zzdt.zzg(bArr2, i22, zzdsVar2) : zzdt.zzh(bArr2, i22, zzdsVar2);
                                    unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    int i4822 = i20 | i44;
                                    i30 = i9;
                                    i33 = i25;
                                    i31 = i27;
                                    i32 = i24;
                                    i36 = i17;
                                    i29 = i26;
                                    i34 = i4822;
                                    i35 = i12;
                                    break;
                                } else {
                                    i42 = i24;
                                    i23 = i25;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 9:
                                i21 = i19;
                                i22 = i41;
                                i28 = i42;
                                bArr2 = bArr;
                                i12 = i38;
                                if (i39 == 2) {
                                    i31 = zzdt.zzd(zzfzVar.zzy(i21), bArr2, i22, i8, zzdsVar2);
                                    if ((i20 & i44) == 0) {
                                        unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzez.zzg(unsafe2.getObject(obj3, j), zzdsVar2.zzc));
                                    }
                                    int i51 = i20 | i44;
                                    i30 = i9;
                                    i33 = i21;
                                    i35 = i12;
                                    i36 = i17;
                                    i34 = i51;
                                    i32 = i28;
                                    i29 = i8;
                                    break;
                                } else {
                                    i42 = i28;
                                    i23 = i21;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 10:
                                i21 = i19;
                                i22 = i41;
                                i28 = i42;
                                bArr2 = bArr;
                                i12 = i38;
                                if (i39 == 2) {
                                    i31 = zzdt.zza(bArr2, i22, zzdsVar2);
                                    unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    i34 = i20 | i44;
                                    i30 = i9;
                                    i33 = i21;
                                    i32 = i28;
                                    i35 = i12;
                                    i36 = i17;
                                    i29 = i8;
                                    break;
                                } else {
                                    i42 = i28;
                                    i23 = i21;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 12:
                                i21 = i19;
                                i22 = i41;
                                i28 = i42;
                                bArr2 = bArr;
                                i12 = i38;
                                if (i39 != 0) {
                                    i42 = i28;
                                    i23 = i21;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                } else {
                                    i31 = zzdt.zzj(bArr2, i22, zzdsVar2);
                                    int i52 = zzdsVar2.zza;
                                    zzex zzx = zzfzVar.zzx(i21);
                                    if (zzx == null || zzx.zza()) {
                                        unsafe2.putInt(obj3, j, i52);
                                        i34 = i20 | i44;
                                        i30 = i9;
                                        i33 = i21;
                                        i32 = i28;
                                        i35 = i12;
                                        i36 = i17;
                                        i29 = i8;
                                        break;
                                    } else {
                                        zzc(obj).zzf(i28, Long.valueOf(i52));
                                        i30 = i9;
                                        i34 = i20;
                                        i33 = i21;
                                        i32 = i28;
                                        i35 = i12;
                                        i36 = i17;
                                        i29 = i8;
                                    }
                                }
                                break;
                            case 15:
                                i21 = i19;
                                i22 = i41;
                                i28 = i42;
                                bArr2 = bArr;
                                i12 = i38;
                                if (i39 == 0) {
                                    i31 = zzdt.zzj(bArr2, i22, zzdsVar2);
                                    unsafe2.putInt(obj3, j, zzei.zzb(zzdsVar2.zza));
                                    i34 = i20 | i44;
                                    i30 = i9;
                                    i33 = i21;
                                    i32 = i28;
                                    i35 = i12;
                                    i36 = i17;
                                    i29 = i8;
                                    break;
                                } else {
                                    i42 = i28;
                                    i23 = i21;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            case 16:
                                i21 = i19;
                                i22 = i41;
                                i12 = i38;
                                if (i39 == 0) {
                                    bArr2 = bArr;
                                    int zzm2 = zzdt.zzm(bArr2, i22, zzdsVar2);
                                    i28 = i42;
                                    unsafe2.putLong(obj, j, zzei.zzc(zzdsVar2.zzb));
                                    i34 = i20 | i44;
                                    i30 = i9;
                                    i33 = i21;
                                    i31 = zzm2;
                                    i32 = i28;
                                    i35 = i12;
                                    i36 = i17;
                                    i29 = i8;
                                    break;
                                } else {
                                    i42 = i42;
                                    i23 = i21;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                            default:
                                if (i39 == 3) {
                                    int i53 = i19;
                                    i31 = zzdt.zzc(zzfzVar.zzy(i53), bArr, i41, i8, (i38 << 3) | 4, zzdsVar);
                                    if ((i20 & i44) == 0) {
                                        unsafe2.putObject(obj3, j, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzez.zzg(unsafe2.getObject(obj3, j), zzdsVar2.zzc));
                                    }
                                    i34 = i20 | i44;
                                    bArr2 = bArr;
                                    i29 = i8;
                                    i30 = i9;
                                    i33 = i53;
                                    i32 = i42;
                                    i35 = i38;
                                    i36 = i17;
                                    break;
                                } else {
                                    i21 = i19;
                                    i22 = i41;
                                    i12 = i38;
                                    i23 = i21;
                                    i10 = i9;
                                    i14 = i20;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i15 = i23;
                                    i13 = i42;
                                    i36 = i17;
                                    break;
                                }
                        }
                    } else {
                        i12 = i38;
                        bArr2 = bArr;
                        if (zzu != 27) {
                            i14 = i34;
                            i17 = i36;
                            if (zzu <= 49) {
                                unsafe = unsafe2;
                                i15 = zzr;
                                i31 = zzp(obj, bArr, i41, i8, i42, i12, i39, zzr, i40, zzu, j, zzdsVar);
                            } else {
                                i18 = i41;
                                unsafe = unsafe2;
                                i15 = zzr;
                                if (zzu != 50) {
                                    i31 = zzn(obj, bArr, i18, i8, i42, i12, i39, i40, zzu, j, i15, zzdsVar);
                                } else if (i39 == 2) {
                                    i31 = zzm(obj, bArr, i18, i8, i15, j, zzdsVar);
                                }
                            }
                        } else if (i39 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj3, j);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j, zzeyVar);
                            }
                            i32 = i42;
                            i17 = i36;
                            i31 = zzdt.zze(zzfzVar.zzy(zzr), i32, bArr, i41, i8, zzeyVar, zzdsVar);
                            i30 = i9;
                            i33 = zzr;
                            i35 = i12;
                            i34 = i34;
                            i36 = i17;
                            i29 = i8;
                        } else {
                            i14 = i34;
                            i17 = i36;
                            i18 = i41;
                            unsafe = unsafe2;
                            i15 = zzr;
                        }
                        i10 = i9;
                        i16 = i18;
                        i13 = i42;
                        i36 = i17;
                    }
                }
                if (i13 != i10 || i10 == 0) {
                    i31 = zzdt.zzi(i13, bArr, i16, i8, zzc(obj), zzdsVar);
                    zzfzVar = this;
                    obj3 = obj;
                    bArr2 = bArr;
                    i29 = i8;
                    zzdsVar2 = zzdsVar;
                    i30 = i10;
                    i32 = i13;
                    i35 = i12;
                    i33 = i15;
                    i34 = i14;
                    unsafe2 = unsafe;
                } else {
                    i31 = i16;
                    i32 = i13;
                    i34 = i14;
                }
            } else {
                unsafe = unsafe2;
                i10 = i30;
            }
        }
        if (i36 != 1048575) {
            long j3 = i36;
            obj2 = obj;
            unsafe.putInt(obj2, j3, i34);
        } else {
            obj2 = obj;
        }
        for (int i54 = this.zzj; i54 < this.zzk; i54++) {
            int i55 = this.zzi[i54];
            int i56 = this.zzc[i55];
            Object zzf = zzhi.zzf(obj2, zzv(i55) & 1048575);
            if (zzf != null && zzx(i55) != null) {
                throw null;
            }
        }
        if (i10 == 0) {
            if (i31 != i8) {
                throw zzfa.zzd();
            }
        } else if (i31 > i8 || i32 != i10) {
            throw zzfa.zzd();
        }
        return i31;
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
            long zzv = zzv(this.zzi[i8]) & 1048575;
            Object zzf = zzhi.zzf(obj, zzv);
            if (zzf != null) {
                ((zzfq) zzf).zzc();
                zzhi.zzp(obj, zzv, zzf);
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
            int zzv = zzv(i7);
            long j = 1048575 & zzv;
            int i8 = this.zzc[i7];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(obj2, i7)) {
                        zzhi.zzl(obj, j, zzhi.zza(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i7)) {
                        zzhi.zzm(obj, j, zzhi.zzb(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(obj2, i7)) {
                        zzhi.zzk(obj, j, zzhi.zzt(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i7)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i7);
                    break;
                case 10:
                    if (zzG(obj2, i7)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i7)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i7)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i7);
                        break;
                    } else {
                        break;
                    }
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
                        break;
                    } else {
                        break;
                    }
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
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i7);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i7, int i8, zzds zzdsVar) {
        if (this.zzh) {
            zzo(obj, bArr, i7, i8, zzdsVar);
        } else {
            zzb(obj, bArr, i7, i8, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzh;
        int length = this.zzc.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int zzv = zzv(i7);
            long j = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(obj, obj2, i7) && Double.doubleToLongBits(zzhi.zza(obj, j)) == Double.doubleToLongBits(zzhi.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzF(obj, obj2, i7) && Float.floatToIntBits(zzhi.zzb(obj, j)) == Float.floatToIntBits(zzhi.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzF(obj, obj2, i7) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzF(obj, obj2, i7) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzF(obj, obj2, i7) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzF(obj, obj2, i7) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzF(obj, obj2, i7) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzF(obj, obj2, i7) && zzhi.zzt(obj, j) == zzhi.zzt(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzF(obj, obj2, i7) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzF(obj, obj2, i7) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzF(obj, obj2, i7) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzF(obj, obj2, i7) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzF(obj, obj2, i7) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzF(obj, obj2, i7) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzF(obj, obj2, i7) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzF(obj, obj2, i7) && zzhi.zzc(obj, j) == zzhi.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzF(obj, obj2, i7) && zzhi.zzd(obj, j) == zzhi.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzF(obj, obj2, i7) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
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
                    zzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                    break;
                case 50:
                    zzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
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
                    long zzs = zzs(i7) & 1048575;
                    if (zzhi.zzc(obj, zzs) == zzhi.zzc(obj2, zzs) && zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.zzj) {
            int i12 = this.zzi[i11];
            int i13 = this.zzc[i12];
            int zzv = zzv(i12);
            int i14 = this.zzc[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = zzb.getInt(obj, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & zzv) != 0 && !zzH(obj, i12, i7, i8, i16)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(obj, i13, i12) && !zzI(obj, zzv, zzy(i12))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfq) zzhi.zzf(obj, zzv & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhi.zzf(obj, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzy = zzy(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!zzy.zzi(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (zzH(obj, i12, i7, i8, i16) && !zzI(obj, zzv, zzy(i12))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return true;
    }
}
