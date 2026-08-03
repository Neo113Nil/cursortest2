package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzlu<T> implements com.google.android.gms.internal.drive.zzmf<T> {
    private static final int[] zzub = new int[0];
    private static final sun.misc.Unsafe zzuc = com.google.android.gms.internal.drive.zznd.zzff();
    private final int[] zzud;
    private final java.lang.Object[] zzue;
    private final int zzuf;
    private final int zzug;
    private final com.google.android.gms.internal.drive.zzlq zzuh;
    private final boolean zzui;
    private final boolean zzuj;
    private final boolean zzuk;
    private final boolean zzul;
    private final int[] zzum;
    private final int zzun;
    private final int zzuo;
    private final com.google.android.gms.internal.drive.zzly zzup;
    private final com.google.android.gms.internal.drive.zzla zzuq;
    private final com.google.android.gms.internal.drive.zzmx<?, ?> zzur;
    private final com.google.android.gms.internal.drive.zzjy<?> zzus;
    private final com.google.android.gms.internal.drive.zzll zzut;

    private zzlu(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.google.android.gms.internal.drive.zzlq zzlqVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, com.google.android.gms.internal.drive.zzly zzlyVar, com.google.android.gms.internal.drive.zzla zzlaVar, com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar, com.google.android.gms.internal.drive.zzjy<?> zzjyVar, com.google.android.gms.internal.drive.zzll zzllVar) {
        this.zzud = iArr;
        this.zzue = objArr;
        this.zzuf = i;
        this.zzug = i2;
        this.zzuj = zzlqVar instanceof com.google.android.gms.internal.drive.zzkk;
        this.zzuk = z;
        this.zzui = zzjyVar != null && zzjyVar.zze(zzlqVar);
        this.zzul = false;
        this.zzum = iArr2;
        this.zzun = i3;
        this.zzuo = i4;
        this.zzup = zzlyVar;
        this.zzuq = zzlaVar;
        this.zzur = zzmxVar;
        this.zzus = zzjyVar;
        this.zzuh = zzlqVar;
        this.zzut = zzllVar;
    }

    static <T> com.google.android.gms.internal.drive.zzlu<T> zza(java.lang.Class<T> cls, com.google.android.gms.internal.drive.zzlo zzloVar, com.google.android.gms.internal.drive.zzly zzlyVar, com.google.android.gms.internal.drive.zzla zzlaVar, com.google.android.gms.internal.drive.zzmx<?, ?> zzmxVar, com.google.android.gms.internal.drive.zzjy<?> zzjyVar, com.google.android.gms.internal.drive.zzll zzllVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
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
        boolean z;
        int i17;
        com.google.android.gms.internal.drive.zzme zzmeVar;
        int objectFieldOffset;
        int i18;
        int i19;
        java.lang.Class<?> cls2;
        java.lang.String str;
        int i20;
        int i21;
        java.lang.reflect.Field zza;
        int i22;
        char charAt11;
        int i23;
        java.lang.reflect.Field zza2;
        java.lang.reflect.Field zza3;
        int i24;
        char charAt12;
        int i25;
        char charAt13;
        int i26;
        char charAt14;
        int i27;
        char charAt15;
        char charAt16;
        if (zzloVar instanceof com.google.android.gms.internal.drive.zzme) {
            com.google.android.gms.internal.drive.zzme zzmeVar2 = (com.google.android.gms.internal.drive.zzme) zzloVar;
            int i28 = 0;
            boolean z2 = zzmeVar2.zzec() == com.google.android.gms.internal.drive.zzkk.zze.zzsg;
            java.lang.String zzek = zzmeVar2.zzek();
            int length = zzek.length();
            int charAt17 = zzek.charAt(0);
            if (charAt17 >= 55296) {
                int i29 = charAt17 & 8191;
                int i30 = 1;
                int i31 = 13;
                while (true) {
                    i = i30 + 1;
                    charAt16 = zzek.charAt(i30);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i29 |= (charAt16 & 8191) << i31;
                    i31 += 13;
                    i30 = i;
                }
                charAt17 = i29 | (charAt16 << i31);
            } else {
                i = 1;
            }
            int i32 = i + 1;
            int charAt18 = zzek.charAt(i);
            if (charAt18 >= 55296) {
                int i33 = charAt18 & 8191;
                int i34 = 13;
                while (true) {
                    i27 = i32 + 1;
                    charAt15 = zzek.charAt(i32);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i33 |= (charAt15 & 8191) << i34;
                    i34 += 13;
                    i32 = i27;
                }
                charAt18 = i33 | (charAt15 << i34);
                i32 = i27;
            }
            if (charAt18 == 0) {
                iArr = zzub;
                i6 = 0;
                i3 = 0;
                charAt = 0;
                i4 = 0;
                charAt2 = 0;
                i5 = 0;
            } else {
                int i35 = i32 + 1;
                int charAt19 = zzek.charAt(i32);
                if (charAt19 >= 55296) {
                    int i36 = charAt19 & 8191;
                    int i37 = 13;
                    while (true) {
                        i14 = i35 + 1;
                        charAt10 = zzek.charAt(i35);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i36 |= (charAt10 & 8191) << i37;
                        i37 += 13;
                        i35 = i14;
                    }
                    charAt19 = i36 | (charAt10 << i37);
                    i35 = i14;
                }
                int i38 = i35 + 1;
                int charAt20 = zzek.charAt(i35);
                if (charAt20 >= 55296) {
                    int i39 = charAt20 & 8191;
                    int i40 = 13;
                    while (true) {
                        i13 = i38 + 1;
                        charAt9 = zzek.charAt(i38);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i39 |= (charAt9 & 8191) << i40;
                        i40 += 13;
                        i38 = i13;
                    }
                    charAt20 = i39 | (charAt9 << i40);
                    i38 = i13;
                }
                int i41 = i38 + 1;
                charAt = zzek.charAt(i38);
                if (charAt >= 55296) {
                    int i42 = charAt & 8191;
                    int i43 = 13;
                    while (true) {
                        i12 = i41 + 1;
                        charAt8 = zzek.charAt(i41);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i42 |= (charAt8 & 8191) << i43;
                        i43 += 13;
                        i41 = i12;
                    }
                    charAt = i42 | (charAt8 << i43);
                    i41 = i12;
                }
                int i44 = i41 + 1;
                int charAt21 = zzek.charAt(i41);
                if (charAt21 >= 55296) {
                    int i45 = charAt21 & 8191;
                    int i46 = 13;
                    while (true) {
                        i11 = i44 + 1;
                        charAt7 = zzek.charAt(i44);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i45 |= (charAt7 & 8191) << i46;
                        i46 += 13;
                        i44 = i11;
                    }
                    charAt21 = i45 | (charAt7 << i46);
                    i44 = i11;
                }
                int i47 = i44 + 1;
                charAt2 = zzek.charAt(i44);
                if (charAt2 >= 55296) {
                    int i48 = charAt2 & 8191;
                    int i49 = 13;
                    while (true) {
                        i10 = i47 + 1;
                        charAt6 = zzek.charAt(i47);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i48 |= (charAt6 & 8191) << i49;
                        i49 += 13;
                        i47 = i10;
                    }
                    charAt2 = i48 | (charAt6 << i49);
                    i47 = i10;
                }
                int i50 = i47 + 1;
                int charAt22 = zzek.charAt(i47);
                if (charAt22 >= 55296) {
                    int i51 = charAt22 & 8191;
                    int i52 = 13;
                    while (true) {
                        i9 = i50 + 1;
                        charAt5 = zzek.charAt(i50);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i51 |= (charAt5 & 8191) << i52;
                        i52 += 13;
                        i50 = i9;
                    }
                    charAt22 = i51 | (charAt5 << i52);
                    i50 = i9;
                }
                int i53 = i50 + 1;
                int charAt23 = zzek.charAt(i50);
                if (charAt23 >= 55296) {
                    int i54 = charAt23 & 8191;
                    int i55 = i53;
                    int i56 = 13;
                    while (true) {
                        i8 = i55 + 1;
                        charAt4 = zzek.charAt(i55);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i54 |= (charAt4 & 8191) << i56;
                        i56 += 13;
                        i55 = i8;
                    }
                    charAt23 = i54 | (charAt4 << i56);
                    i2 = i8;
                } else {
                    i2 = i53;
                }
                int i57 = i2 + 1;
                int charAt24 = zzek.charAt(i2);
                if (charAt24 >= 55296) {
                    int i58 = charAt24 & 8191;
                    int i59 = i57;
                    int i60 = 13;
                    while (true) {
                        i7 = i59 + 1;
                        charAt3 = zzek.charAt(i59);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i58 |= (charAt3 & 8191) << i60;
                        i60 += 13;
                        i59 = i7;
                    }
                    charAt24 = i58 | (charAt3 << i60);
                    i57 = i7;
                }
                int[] iArr2 = new int[charAt24 + charAt22 + charAt23];
                int i61 = (charAt19 << 1) + charAt20;
                i3 = charAt21;
                i4 = i61;
                i5 = charAt24;
                i28 = charAt19;
                i32 = i57;
                int i62 = charAt22;
                iArr = iArr2;
                i6 = i62;
            }
            sun.misc.Unsafe unsafe = zzuc;
            java.lang.Object[] zzel = zzmeVar2.zzel();
            java.lang.Class<?> cls3 = zzmeVar2.zzee().getClass();
            int i63 = i32;
            int[] iArr3 = new int[charAt2 * 3];
            java.lang.Object[] objArr = new java.lang.Object[charAt2 << 1];
            int i64 = i5 + i6;
            int i65 = i5;
            int i66 = i63;
            int i67 = i64;
            int i68 = 0;
            int i69 = 0;
            while (i66 < length) {
                int i70 = i66 + 1;
                int charAt25 = zzek.charAt(i66);
                int i71 = length;
                if (charAt25 >= 55296) {
                    int i72 = charAt25 & 8191;
                    int i73 = i70;
                    int i74 = 13;
                    while (true) {
                        i26 = i73 + 1;
                        charAt14 = zzek.charAt(i73);
                        i15 = i5;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i72 |= (charAt14 & 8191) << i74;
                        i74 += 13;
                        i73 = i26;
                        i5 = i15;
                    }
                    charAt25 = i72 | (charAt14 << i74);
                    i16 = i26;
                } else {
                    i15 = i5;
                    i16 = i70;
                }
                int i75 = i16 + 1;
                int charAt26 = zzek.charAt(i16);
                if (charAt26 >= 55296) {
                    int i76 = charAt26 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i25 = i77 + 1;
                        charAt13 = zzek.charAt(i77);
                        z = z2;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i78;
                        i78 += 13;
                        i77 = i25;
                        z2 = z;
                    }
                    charAt26 = i76 | (charAt13 << i78);
                    i17 = i25;
                } else {
                    z = z2;
                    i17 = i75;
                }
                int i79 = charAt26 & 255;
                int i80 = i3;
                if ((charAt26 & 1024) != 0) {
                    iArr[i68] = i69;
                    i68++;
                }
                int i81 = charAt;
                if (i79 >= 51) {
                    int i82 = i17 + 1;
                    int charAt27 = zzek.charAt(i17);
                    char c = 55296;
                    if (charAt27 >= 55296) {
                        int i83 = charAt27 & 8191;
                        int i84 = 13;
                        while (true) {
                            i24 = i82 + 1;
                            charAt12 = zzek.charAt(i82);
                            if (charAt12 < c) {
                                break;
                            }
                            i83 |= (charAt12 & 8191) << i84;
                            i84 += 13;
                            i82 = i24;
                            c = 55296;
                        }
                        charAt27 = i83 | (charAt12 << i84);
                        i82 = i24;
                    }
                    int i85 = i79 - 51;
                    int i86 = i82;
                    if (i85 == 9 || i85 == 17) {
                        objArr[((i69 / 3) << 1) + 1] = zzel[i4];
                        i4++;
                    } else if (i85 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i69 / 3) << 1) + 1] = zzel[i4];
                        i4++;
                    }
                    int i87 = charAt27 << 1;
                    java.lang.Object obj = zzel[i87];
                    if (obj instanceof java.lang.reflect.Field) {
                        zza2 = (java.lang.reflect.Field) obj;
                    } else {
                        zza2 = zza(cls3, (java.lang.String) obj);
                        zzel[i87] = zza2;
                    }
                    zzmeVar = zzmeVar2;
                    java.lang.String str2 = zzek;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza2);
                    int i88 = i87 + 1;
                    java.lang.Object obj2 = zzel[i88];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        zza3 = (java.lang.reflect.Field) obj2;
                    } else {
                        zza3 = zza(cls3, (java.lang.String) obj2);
                        zzel[i88] = zza3;
                    }
                    cls2 = cls3;
                    i18 = i4;
                    i17 = i86;
                    str = str2;
                    i21 = 0;
                    i20 = (int) unsafe.objectFieldOffset(zza3);
                    i19 = i28;
                } else {
                    zzmeVar = zzmeVar2;
                    java.lang.String str3 = zzek;
                    int i89 = i4 + 1;
                    java.lang.reflect.Field zza4 = zza(cls3, (java.lang.String) zzel[i4]);
                    if (i79 == 9 || i79 == 17) {
                        objArr[((i69 / 3) << 1) + 1] = zza4.getType();
                    } else {
                        if (i79 == 27 || i79 == 49) {
                            i23 = i4 + 2;
                            objArr[((i69 / 3) << 1) + 1] = zzel[i89];
                        } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                            if ((charAt17 & 1) == 1) {
                                i23 = i4 + 2;
                                objArr[((i69 / 3) << 1) + 1] = zzel[i89];
                            }
                        } else if (i79 == 50) {
                            int i90 = i65 + 1;
                            iArr[i65] = i69;
                            int i91 = (i69 / 3) << 1;
                            int i92 = i4 + 2;
                            objArr[i91] = zzel[i89];
                            if ((charAt26 & 2048) != 0) {
                                i89 = i4 + 3;
                                objArr[i91 + 1] = zzel[i92];
                                i65 = i90;
                            } else {
                                i65 = i90;
                                i89 = i92;
                            }
                        }
                        i89 = i23;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                    if ((charAt17 & 1) != 1 || i79 > 17) {
                        i18 = i89;
                        i19 = i28;
                        cls2 = cls3;
                        str = str3;
                        i20 = 0;
                        i21 = 0;
                    } else {
                        int i93 = i17 + 1;
                        str = str3;
                        int charAt28 = str.charAt(i17);
                        if (charAt28 >= 55296) {
                            int i94 = charAt28 & 8191;
                            int i95 = 13;
                            while (true) {
                                i22 = i93 + 1;
                                charAt11 = str.charAt(i93);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i94 |= (charAt11 & 8191) << i95;
                                i95 += 13;
                                i93 = i22;
                            }
                            charAt28 = i94 | (charAt11 << i95);
                            i93 = i22;
                        }
                        int i96 = (i28 << 1) + (charAt28 / 32);
                        java.lang.Object obj3 = zzel[i96];
                        i18 = i89;
                        if (obj3 instanceof java.lang.reflect.Field) {
                            zza = (java.lang.reflect.Field) obj3;
                        } else {
                            zza = zza(cls3, (java.lang.String) obj3);
                            zzel[i96] = zza;
                        }
                        i19 = i28;
                        cls2 = cls3;
                        i20 = (int) unsafe.objectFieldOffset(zza);
                        i21 = charAt28 % 32;
                        i17 = i93;
                    }
                    if (i79 >= 18 && i79 <= 49) {
                        iArr[i67] = objectFieldOffset;
                        i67++;
                    }
                }
                int i97 = i69 + 1;
                iArr3[i69] = charAt25;
                int i98 = i69 + 2;
                iArr3[i97] = objectFieldOffset | ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i79 << 20);
                i69 += 3;
                iArr3[i98] = (i21 << 20) | i20;
                i28 = i19;
                zzek = str;
                i66 = i17;
                cls3 = cls2;
                i3 = i80;
                length = i71;
                i5 = i15;
                z2 = z;
                charAt = i81;
                i4 = i18;
                zzmeVar2 = zzmeVar;
            }
            return new com.google.android.gms.internal.drive.zzlu<>(iArr3, objArr, charAt, i3, zzmeVar2.zzee(), z2, false, iArr, i5, i64, zzlyVar, zzlaVar, zzmxVar, zzjyVar, zzllVar);
        }
        ((com.google.android.gms.internal.drive.zzms) zzloVar).zzec();
        int i99 = com.google.android.gms.internal.drive.zzkk.zze.zzsg;
        throw new java.lang.NoSuchMethodError();
    }

    private static java.lang.reflect.Field zza(java.lang.Class<?> cls, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40 + java.lang.String.valueOf(name).length() + java.lang.String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final T newInstance() {
        return (T) this.zzup.newInstance(this.zzuh);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean equals(T t, T t2) {
        boolean zzd;
        int length = this.zzud.length;
        for (int i = 0; i < length; i += 3) {
            int zzas = zzas(i);
            long j = zzas & 1048575;
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    if (zzc(t, t2, i) && java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.zznd.zzn(t, j)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.zznd.zzn(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzc(t, t2, i) && java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.zznd.zzm(t, j)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.zznd.zzm(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzk(t, j) == com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzk(t, j) == com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzj(t, j) == com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzk(t, j) == com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzj(t, j) == com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzl(t, j) == com.google.android.gms.internal.drive.zznd.zzl(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzj(t, j) == com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzj(t, j) == com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzj(t, j) == com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzk(t, j) == com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzj(t, j) == com.google.android.gms.internal.drive.zznd.zzj(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zznd.zzk(t, j) == com.google.android.gms.internal.drive.zznd.zzk(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzc(t, t2, i) && com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
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
                    zzd = com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                    break;
                case 50:
                    zzd = com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j));
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
                    long zzat = zzat(i) & 1048575;
                    if (com.google.android.gms.internal.drive.zznd.zzj(t, zzat) == com.google.android.gms.internal.drive.zznd.zzj(t2, zzat) && com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(t, j), com.google.android.gms.internal.drive.zznd.zzo(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzd) {
                return false;
            }
        }
        if (!this.zzur.zzr(t).equals(this.zzur.zzr(t2))) {
            return false;
        }
        if (this.zzui) {
            return this.zzus.zzb(t).equals(this.zzus.zzb(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int hashCode(T t) {
        int i;
        int zzu;
        int length = this.zzud.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzas = zzas(i3);
            int i4 = this.zzud[i3];
            long j = 1048575 & zzas;
            int i5 = 37;
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zzkm.zzu(java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.zznd.zzn(t, j)));
                    i2 = i + zzu;
                    break;
                case 1:
                    i = i2 * 53;
                    zzu = java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.zznd.zzm(t, j));
                    i2 = i + zzu;
                    break;
                case 2:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 3:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 4:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 5:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 6:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 7:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zzkm.zze(com.google.android.gms.internal.drive.zznd.zzl(t, j));
                    i2 = i + zzu;
                    break;
                case 8:
                    i = i2 * 53;
                    zzu = ((java.lang.String) com.google.android.gms.internal.drive.zznd.zzo(t, j)).hashCode();
                    i2 = i + zzu;
                    break;
                case 9:
                    java.lang.Object zzo = com.google.android.gms.internal.drive.zznd.zzo(t, j);
                    if (zzo != null) {
                        i5 = zzo.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                    i2 = i + zzu;
                    break;
                case 11:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 12:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 13:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 14:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 15:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 16:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zzkm.zzu(com.google.android.gms.internal.drive.zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 17:
                    java.lang.Object zzo2 = com.google.android.gms.internal.drive.zznd.zzo(t, j);
                    if (zzo2 != null) {
                        i5 = zzo2.hashCode();
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
                    zzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                    i2 = i + zzu;
                    break;
                case 50:
                    i = i2 * 53;
                    zzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                    i2 = i + zzu;
                    break;
                case 51:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zzkm.zzu(java.lang.Double.doubleToLongBits(zze(t, j)));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = java.lang.Float.floatToIntBits(zzf(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zzkm.zze(zzi(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = ((java.lang.String) com.google.android.gms.internal.drive.zznd.zzo(t, j)).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = com.google.android.gms.internal.drive.zznd.zzo(t, j).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzur.zzr(t).hashCode();
        return this.zzui ? (hashCode * 53) + this.zzus.zzb(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzc(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzud.length; i += 3) {
            int zzas = zzas(i);
            long j = 1048575 & zzas;
            int i2 = this.zzud[i];
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzn(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzm(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzl(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzk(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
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
                    this.zzuq.zza(t, t2, j);
                    break;
                case 50:
                    com.google.android.gms.internal.drive.zzmh.zza(this.zzut, t, t2, j);
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
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i2, i)) {
                        com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zznd.zzo(t2, j));
                        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzuk) {
            return;
        }
        com.google.android.gms.internal.drive.zzmh.zza(this.zzur, t, t2);
        if (this.zzui) {
            com.google.android.gms.internal.drive.zzmh.zza(this.zzus, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzas = zzas(i) & 1048575;
        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i)) {
            java.lang.Object zzo = com.google.android.gms.internal.drive.zznd.zzo(t, zzas);
            java.lang.Object zzo2 = com.google.android.gms.internal.drive.zznd.zzo(t2, zzas);
            if (zzo != null && zzo2 != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, zzas, com.google.android.gms.internal.drive.zzkm.zza(zzo, zzo2));
                zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
            } else if (zzo2 != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, zzas, zzo2);
                zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzas = zzas(i);
        int i2 = this.zzud[i];
        long j = zzas & 1048575;
        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i2, i)) {
            java.lang.Object zzo = com.google.android.gms.internal.drive.zznd.zzo(t, j);
            java.lang.Object zzo2 = com.google.android.gms.internal.drive.zznd.zzo(t2, j);
            if (zzo != null && zzo2 != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, j, com.google.android.gms.internal.drive.zzkm.zza(zzo, zzo2));
                zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i2, i);
            } else if (zzo2 != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, j, zzo2);
                zzb((com.google.android.gms.internal.drive.zzlu<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final int zzn(T t) {
        int i;
        int i2;
        long j;
        int zzd;
        int zzb;
        int zzk;
        int zzv;
        int zzi;
        int zzab;
        int zzad;
        int zzb2;
        int zzi2;
        int zzab2;
        int zzad2;
        int i3 = 267386880;
        int i4 = 1;
        if (this.zzuk) {
            sun.misc.Unsafe unsafe = zzuc;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzud.length) {
                int zzas = zzas(i5);
                int i7 = (zzas & i3) >>> 20;
                int i8 = this.zzud[i5];
                long j2 = zzas & 1048575;
                int i9 = (i7 < com.google.android.gms.internal.drive.zzke.DOUBLE_LIST_PACKED.id() || i7 > com.google.android.gms.internal.drive.zzke.SINT64_LIST_PACKED.id()) ? 0 : this.zzud[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i8, 0.0d);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i8, 0.0f);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzd(i8, com.google.android.gms.internal.drive.zznd.zzk(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zze(i8, com.google.android.gms.internal.drive.zznd.zzk(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzg(i8, com.google.android.gms.internal.drive.zznd.zzj(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzg(i8, 0L);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzj(i8, 0);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i8, true);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            java.lang.Object zzo = com.google.android.gms.internal.drive.zznd.zzo(t, j2);
                            if (zzo instanceof com.google.android.gms.internal.drive.zzjc) {
                                zzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i8, (com.google.android.gms.internal.drive.zzjc) zzo);
                            } else {
                                zzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i8, (java.lang.String) zzo);
                            }
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzmh.zzc(i8, com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzap(i5));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i8, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzh(i8, com.google.android.gms.internal.drive.zznd.zzj(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzl(i8, com.google.android.gms.internal.drive.zznd.zzj(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzk(i8, 0);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzh(i8, 0L);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzi(i8, com.google.android.gms.internal.drive.zznd.zzj(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzf(i8, com.google.android.gms.internal.drive.zznd.zzk(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i8, (com.google.android.gms.internal.drive.zzlq) com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzap(i5));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzw(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 19:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzv(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 20:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzo(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 21:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzp(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 22:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzs(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 23:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzw(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 24:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzv(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 25:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzx(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 26:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzc(i8, zzd(t, j2));
                        i6 += zzb2;
                        break;
                    case 27:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzc(i8, (java.util.List<?>) zzd(t, j2), zzap(i5));
                        i6 += zzb2;
                        break;
                    case 28:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzd(i8, (java.util.List<com.google.android.gms.internal.drive.zzjc>) zzd(t, j2));
                        i6 += zzb2;
                        break;
                    case 29:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzt(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 30:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzr(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 31:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzv(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 32:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzw(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 33:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzu(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 34:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzq(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 35:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 36:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 37:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zza((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 38:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzb((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 39:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zze((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 40:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 41:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 42:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzj((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 43:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzf((java.util.List<java.lang.Integer>) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 44:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzd((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 45:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 46:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 47:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzg((java.util.List<java.lang.Integer>) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 48:
                        zzi2 = com.google.android.gms.internal.drive.zzmh.zzc((java.util.List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = com.google.android.gms.internal.drive.zzjr.zzab(i8);
                            zzad2 = com.google.android.gms.internal.drive.zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 49:
                        zzb2 = com.google.android.gms.internal.drive.zzmh.zzd(i8, zzd(t, j2), zzap(i5));
                        i6 += zzb2;
                        break;
                    case 50:
                        zzb2 = this.zzut.zzb(i8, com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzaq(i5));
                        i6 += zzb2;
                        break;
                    case 51:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i8, 0.0d);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i8, 0.0f);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzd(i8, zzh(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zze(i8, zzh(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzg(i8, zzg(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzg(i8, 0L);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzj(i8, 0);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i8, true);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            java.lang.Object zzo2 = com.google.android.gms.internal.drive.zznd.zzo(t, j2);
                            if (zzo2 instanceof com.google.android.gms.internal.drive.zzjc) {
                                zzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i8, (com.google.android.gms.internal.drive.zzjc) zzo2);
                            } else {
                                zzb2 = com.google.android.gms.internal.drive.zzjr.zzb(i8, (java.lang.String) zzo2);
                            }
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzmh.zzc(i8, com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzap(i5));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i8, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzh(i8, zzg(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzl(i8, zzg(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzk(i8, 0);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzh(i8, 0L);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzi(i8, zzg(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzf(i8, zzh(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i8, i5)) {
                            zzb2 = com.google.android.gms.internal.drive.zzjr.zzc(i8, (com.google.android.gms.internal.drive.zzlq) com.google.android.gms.internal.drive.zznd.zzo(t, j2), zzap(i5));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                }
                i5 += 3;
                i3 = 267386880;
            }
            return i6 + zza(this.zzur, t);
        }
        sun.misc.Unsafe unsafe2 = zzuc;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.zzud.length) {
            int zzas2 = zzas(i11);
            int[] iArr = this.zzud;
            int i14 = iArr[i11];
            int i15 = (zzas2 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i11 + 2];
                int i17 = i16 & 1048575;
                i2 = i4 << (i16 >>> 20);
                if (i17 != i10) {
                    i13 = unsafe2.getInt(t, i17);
                    i10 = i17;
                }
                i = i16;
            } else {
                i = (!this.zzul || i15 < com.google.android.gms.internal.drive.zzke.DOUBLE_LIST_PACKED.id() || i15 > com.google.android.gms.internal.drive.zzke.SINT64_LIST_PACKED.id()) ? 0 : this.zzud[i11 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = zzas2 & 1048575;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += com.google.android.gms.internal.drive.zzjr.zzb(i14, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += com.google.android.gms.internal.drive.zzjr.zzb(i14, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = com.google.android.gms.internal.drive.zzjr.zzd(i14, unsafe2.getLong(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = com.google.android.gms.internal.drive.zzjr.zze(i14, unsafe2.getLong(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = com.google.android.gms.internal.drive.zzjr.zzg(i14, unsafe2.getInt(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = com.google.android.gms.internal.drive.zzjr.zzg(i14, 0L);
                        i12 += zzd;
                    }
                    break;
                case 6:
                    if ((i13 & i2) != 0) {
                        i12 += com.google.android.gms.internal.drive.zzjr.zzj(i14, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i13 & i2) != 0) {
                        i12 += com.google.android.gms.internal.drive.zzjr.zzc(i14, true);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 8:
                    if ((i13 & i2) != 0) {
                        java.lang.Object object = unsafe2.getObject(t, j3);
                        if (object instanceof com.google.android.gms.internal.drive.zzjc) {
                            zzb = com.google.android.gms.internal.drive.zzjr.zzc(i14, (com.google.android.gms.internal.drive.zzjc) object);
                        } else {
                            zzb = com.google.android.gms.internal.drive.zzjr.zzb(i14, (java.lang.String) object);
                        }
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i2) != 0) {
                        zzb = com.google.android.gms.internal.drive.zzmh.zzc(i14, unsafe2.getObject(t, j3), zzap(i11));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i2) != 0) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzc(i14, (com.google.android.gms.internal.drive.zzjc) unsafe2.getObject(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i2) != 0) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzh(i14, unsafe2.getInt(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i2) != 0) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzl(i14, unsafe2.getInt(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i2) != 0) {
                        zzk = com.google.android.gms.internal.drive.zzjr.zzk(i14, 0);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i2) != 0) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzh(i14, 0L);
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i2) != 0) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzi(i14, unsafe2.getInt(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i2) != 0) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzf(i14, unsafe2.getLong(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i2) != 0) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzc(i14, (com.google.android.gms.internal.drive.zzlq) unsafe2.getObject(t, j3), zzap(i11));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 18:
                    zzb = com.google.android.gms.internal.drive.zzmh.zzw(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzb;
                    j = 0;
                    break;
                case 19:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzv(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 20:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzo(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 21:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzp(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 22:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzs(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 23:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzw(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 24:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzv(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 25:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzx(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 26:
                    zzb = com.google.android.gms.internal.drive.zzmh.zzc(i14, (java.util.List) unsafe2.getObject(t, j3));
                    i12 += zzb;
                    j = 0;
                    break;
                case 27:
                    zzb = com.google.android.gms.internal.drive.zzmh.zzc(i14, (java.util.List<?>) unsafe2.getObject(t, j3), zzap(i11));
                    i12 += zzb;
                    j = 0;
                    break;
                case 28:
                    zzb = com.google.android.gms.internal.drive.zzmh.zzd(i14, (java.util.List<com.google.android.gms.internal.drive.zzjc>) unsafe2.getObject(t, j3));
                    i12 += zzb;
                    j = 0;
                    break;
                case 29:
                    zzb = com.google.android.gms.internal.drive.zzmh.zzt(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzb;
                    j = 0;
                    break;
                case 30:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzr(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 31:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzv(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 32:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzw(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 33:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzu(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 34:
                    zzv = com.google.android.gms.internal.drive.zzmh.zzq(i14, (java.util.List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 35:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 36:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 37:
                    zzi = com.google.android.gms.internal.drive.zzmh.zza((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 38:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzb((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 39:
                    zzi = com.google.android.gms.internal.drive.zzmh.zze((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 40:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 41:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 42:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzj((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 43:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzf((java.util.List<java.lang.Integer>) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 44:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzd((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 45:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzh((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 46:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzi((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 47:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzg((java.util.List<java.lang.Integer>) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 48:
                    zzi = com.google.android.gms.internal.drive.zzmh.zzc((java.util.List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = com.google.android.gms.internal.drive.zzjr.zzab(i14);
                        zzad = com.google.android.gms.internal.drive.zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 49:
                    zzb = com.google.android.gms.internal.drive.zzmh.zzd(i14, (java.util.List) unsafe2.getObject(t, j3), zzap(i11));
                    i12 += zzb;
                    j = 0;
                    break;
                case 50:
                    zzb = this.zzut.zzb(i14, unsafe2.getObject(t, j3), zzaq(i11));
                    i12 += zzb;
                    j = 0;
                    break;
                case 51:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzb(i14, 0.0d);
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzk = com.google.android.gms.internal.drive.zzjr.zzb(i14, 0.0f);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzd(i14, zzh(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zze(i14, zzh(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzg(i14, zzg(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzg(i14, 0L);
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzk = com.google.android.gms.internal.drive.zzjr.zzj(i14, 0);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzk = com.google.android.gms.internal.drive.zzjr.zzc(i14, true);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        java.lang.Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof com.google.android.gms.internal.drive.zzjc) {
                            zzb = com.google.android.gms.internal.drive.zzjr.zzc(i14, (com.google.android.gms.internal.drive.zzjc) object2);
                        } else {
                            zzb = com.google.android.gms.internal.drive.zzjr.zzb(i14, (java.lang.String) object2);
                        }
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzmh.zzc(i14, unsafe2.getObject(t, j3), zzap(i11));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzc(i14, (com.google.android.gms.internal.drive.zzjc) unsafe2.getObject(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzh(i14, zzg(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzl(i14, zzg(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzk = com.google.android.gms.internal.drive.zzjr.zzk(i14, 0);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzh(i14, 0L);
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzi(i14, zzg(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzf(i14, zzh(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i14, i11)) {
                        zzb = com.google.android.gms.internal.drive.zzjr.zzc(i14, (com.google.android.gms.internal.drive.zzlq) unsafe2.getObject(t, j3), zzap(i11));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i11 += 3;
            i4 = 1;
        }
        int i18 = 0;
        int zza = i12 + zza(this.zzur, t);
        if (!this.zzui) {
            return zza;
        }
        com.google.android.gms.internal.drive.zzkb<?> zzb3 = this.zzus.zzb(t);
        for (int i19 = 0; i19 < zzb3.zzos.zzer(); i19++) {
            java.util.Map.Entry<?, java.lang.Object> zzaw = zzb3.zzos.zzaw(i19);
            i18 += com.google.android.gms.internal.drive.zzkb.zzb((com.google.android.gms.internal.drive.zzkd<?>) zzaw.getKey(), zzaw.getValue());
        }
        for (java.util.Map.Entry<?, java.lang.Object> entry : zzb3.zzos.zzes()) {
            i18 += com.google.android.gms.internal.drive.zzkb.zzb((com.google.android.gms.internal.drive.zzkd<?>) entry.getKey(), entry.getValue());
        }
        return zza + i18;
    }

    private static <UT, UB> int zza(com.google.android.gms.internal.drive.zzmx<UT, UB> zzmxVar, T t) {
        return zzmxVar.zzn(zzmxVar.zzr(t));
    }

    private static <E> java.util.List<E> zzd(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a2a  */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it;
        java.util.Map.Entry<?, ?> entry;
        int length;
        int i;
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it2;
        java.util.Map.Entry<?, ?> entry2;
        int length2;
        if (zznsVar.zzcd() == com.google.android.gms.internal.drive.zzkk.zze.zzsj) {
            zza(this.zzur, t, zznsVar);
            if (this.zzui) {
                com.google.android.gms.internal.drive.zzkb<?> zzb = this.zzus.zzb(t);
                if (!zzb.zzos.isEmpty()) {
                    it2 = zzb.descendingIterator();
                    entry2 = (java.util.Map.Entry) it2.next();
                    for (length2 = this.zzud.length - 3; length2 >= 0; length2 -= 3) {
                        int zzas = zzas(length2);
                        int i2 = this.zzud[length2];
                        while (entry2 != null && this.zzus.zza(entry2) > i2) {
                            this.zzus.zza(zznsVar, entry2);
                            entry2 = it2.hasNext() ? (java.util.Map.Entry) it2.next() : null;
                        }
                        switch ((zzas & 267386880) >>> 20) {
                            case 0:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, com.google.android.gms.internal.drive.zznd.zzn(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, com.google.android.gms.internal.drive.zznd.zzm(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzi(i2, com.google.android.gms.internal.drive.zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, com.google.android.gms.internal.drive.zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzc(i2, com.google.android.gms.internal.drive.zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzc(i2, com.google.android.gms.internal.drive.zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzf(i2, com.google.android.gms.internal.drive.zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzb(i2, com.google.android.gms.internal.drive.zznd.zzl(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zza(i2, com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zzap(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzd(i2, com.google.android.gms.internal.drive.zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzn(i2, com.google.android.gms.internal.drive.zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzm(i2, com.google.android.gms.internal.drive.zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzj(i2, com.google.android.gms.internal.drive.zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zze(i2, com.google.android.gms.internal.drive.zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzb(i2, com.google.android.gms.internal.drive.zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, length2)) {
                                    zznsVar.zzb(i2, com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zzap(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                com.google.android.gms.internal.drive.zzmh.zza(this.zzud[length2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 19:
                                com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[length2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 20:
                                com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 21:
                                com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 22:
                                com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 23:
                                com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 24:
                                com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 25:
                                com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 26:
                                com.google.android.gms.internal.drive.zzmh.zza(this.zzud[length2], (java.util.List<java.lang.String>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar);
                                break;
                            case 27:
                                com.google.android.gms.internal.drive.zzmh.zza(this.zzud[length2], (java.util.List<?>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, zzap(length2));
                                break;
                            case 28:
                                com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar);
                                break;
                            case 29:
                                com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 30:
                                com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 31:
                                com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 32:
                                com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 33:
                                com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 34:
                                com.google.android.gms.internal.drive.zzmh.zze(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 35:
                                com.google.android.gms.internal.drive.zzmh.zza(this.zzud[length2], (java.util.List<java.lang.Double>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 36:
                                com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[length2], (java.util.List<java.lang.Float>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 37:
                                com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 38:
                                com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 39:
                                com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 40:
                                com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 41:
                                com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 42:
                                com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 43:
                                com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 44:
                                com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 45:
                                com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 46:
                                com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 47:
                                com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 48:
                                com.google.android.gms.internal.drive.zzmh.zze(this.zzud[length2], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 49:
                                com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[length2], (java.util.List<?>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar, zzap(length2));
                                break;
                            case 50:
                                zza(zznsVar, i2, com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), length2);
                                break;
                            case 51:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, zze(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, zzf(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzi(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzc(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzc(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzf(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzb(i2, zzi(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zza(i2, com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zznsVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zzap(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzd(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzn(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzm(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzj(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zze(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzb(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzb(i2, com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575), zzap(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.zzus.zza(zznsVar, entry2);
                        entry2 = it2.hasNext() ? (java.util.Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
            return;
        }
        if (this.zzuk) {
            if (this.zzui) {
                com.google.android.gms.internal.drive.zzkb<?> zzb2 = this.zzus.zzb(t);
                if (!zzb2.zzos.isEmpty()) {
                    it = zzb2.iterator();
                    entry = (java.util.Map.Entry) it.next();
                    length = this.zzud.length;
                    for (i = 0; i < length; i += 3) {
                        int zzas2 = zzas(i);
                        int i3 = this.zzud[i];
                        while (entry != null && this.zzus.zza(entry) <= i3) {
                            this.zzus.zza(zznsVar, entry);
                            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                        }
                        switch ((zzas2 & 267386880) >>> 20) {
                            case 0:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzn(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzm(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzi(i3, com.google.android.gms.internal.drive.zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzc(i3, com.google.android.gms.internal.drive.zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzc(i3, com.google.android.gms.internal.drive.zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzf(i3, com.google.android.gms.internal.drive.zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzb(i3, com.google.android.gms.internal.drive.zznd.zzl(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zza(i3, com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zzap(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzd(i3, com.google.android.gms.internal.drive.zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzn(i3, com.google.android.gms.internal.drive.zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzm(i3, com.google.android.gms.internal.drive.zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzj(i3, com.google.android.gms.internal.drive.zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zze(i3, com.google.android.gms.internal.drive.zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzb(i3, com.google.android.gms.internal.drive.zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i)) {
                                    zznsVar.zzb(i3, com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zzap(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i], (java.util.List<java.lang.Double>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 19:
                                com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i], (java.util.List<java.lang.Float>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 20:
                                com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 21:
                                com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 22:
                                com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 23:
                                com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 24:
                                com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 25:
                                com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 26:
                                com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i], (java.util.List<java.lang.String>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar);
                                break;
                            case 27:
                                com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i], (java.util.List<?>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, zzap(i));
                                break;
                            case 28:
                                com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar);
                                break;
                            case 29:
                                com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 30:
                                com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 31:
                                com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 32:
                                com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 33:
                                com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 34:
                                com.google.android.gms.internal.drive.zzmh.zze(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 35:
                                com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i], (java.util.List<java.lang.Double>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 36:
                                com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i], (java.util.List<java.lang.Float>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 37:
                                com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 38:
                                com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 39:
                                com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 40:
                                com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 41:
                                com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 42:
                                com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 43:
                                com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 44:
                                com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 45:
                                com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 46:
                                com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 47:
                                com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 48:
                                com.google.android.gms.internal.drive.zzmh.zze(this.zzud[i], (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 49:
                                com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i], (java.util.List<?>) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar, zzap(i));
                                break;
                            case 50:
                                zza(zznsVar, i3, com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), i);
                                break;
                            case 51:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, zze(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, zzf(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzi(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzc(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzc(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzf(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzb(i3, zzi(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zza(i3, com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zznsVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zzap(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, (com.google.android.gms.internal.drive.zzjc) com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzd(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzn(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzm(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzj(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zze(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzb(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i3, i)) {
                                    zznsVar.zzb(i3, com.google.android.gms.internal.drive.zznd.zzo(t, zzas2 & 1048575), zzap(i));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        this.zzus.zza(zznsVar, entry);
                        entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                    }
                    zza(this.zzur, t, zznsVar);
                    return;
                }
            }
            it = null;
            entry = null;
            length = this.zzud.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            zza(this.zzur, t, zznsVar);
            return;
        }
        zzb((com.google.android.gms.internal.drive.zzlu<T>) t, zznsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(T t, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it;
        java.util.Map.Entry<?, ?> entry;
        int length;
        int i;
        int i2;
        if (this.zzui) {
            com.google.android.gms.internal.drive.zzkb<?> zzb = this.zzus.zzb(t);
            if (!zzb.zzos.isEmpty()) {
                it = zzb.iterator();
                entry = (java.util.Map.Entry) it.next();
                length = this.zzud.length;
                sun.misc.Unsafe unsafe = zzuc;
                int i3 = -1;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int zzas = zzas(i);
                    int[] iArr = this.zzud;
                    int i5 = iArr[i];
                    int i6 = (267386880 & zzas) >>> 20;
                    if (this.zzuk || i6 > 17) {
                        i2 = 0;
                    } else {
                        int i7 = iArr[i + 2];
                        int i8 = i7 & 1048575;
                        if (i8 != i3) {
                            i4 = unsafe.getInt(t, i8);
                            i3 = i8;
                        }
                        i2 = 1 << (i7 >>> 20);
                    }
                    while (entry != null && this.zzus.zza(entry) <= i5) {
                        this.zzus.zza(zznsVar, entry);
                        entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                    }
                    long j = zzas & 1048575;
                    switch (i6) {
                        case 0:
                            if ((i2 & i4) == 0) {
                                break;
                            } else {
                                zznsVar.zza(i5, com.google.android.gms.internal.drive.zznd.zzn(t, j));
                                continue;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                zznsVar.zza(i5, com.google.android.gms.internal.drive.zznd.zzm(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzi(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                zznsVar.zza(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzc(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzc(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzf(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzb(i5, com.google.android.gms.internal.drive.zznd.zzl(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                zza(i5, unsafe.getObject(t, j), zznsVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                zznsVar.zza(i5, (com.google.android.gms.internal.drive.zzjc) unsafe.getObject(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzd(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzn(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzm(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzj(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                zznsVar.zze(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzb(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 19:
                            com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 20:
                            com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 21:
                            com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 22:
                            com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 23:
                            com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 24:
                            com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 25:
                            com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 26:
                            com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i], (java.util.List<java.lang.String>) unsafe.getObject(t, j), zznsVar);
                            break;
                        case 27:
                            com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i], (java.util.List<?>) unsafe.getObject(t, j), zznsVar, zzap(i));
                            break;
                        case 28:
                            com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar);
                            break;
                        case 29:
                            com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 30:
                            com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 31:
                            com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 32:
                            com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 33:
                            com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 34:
                            com.google.android.gms.internal.drive.zzmh.zze(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 35:
                            com.google.android.gms.internal.drive.zzmh.zza(this.zzud[i], (java.util.List<java.lang.Double>) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 36:
                            com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i], (java.util.List<java.lang.Float>) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 37:
                            com.google.android.gms.internal.drive.zzmh.zzc(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 38:
                            com.google.android.gms.internal.drive.zzmh.zzd(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 39:
                            com.google.android.gms.internal.drive.zzmh.zzh(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 40:
                            com.google.android.gms.internal.drive.zzmh.zzf(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 41:
                            com.google.android.gms.internal.drive.zzmh.zzk(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 42:
                            com.google.android.gms.internal.drive.zzmh.zzn(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 43:
                            com.google.android.gms.internal.drive.zzmh.zzi(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 44:
                            com.google.android.gms.internal.drive.zzmh.zzm(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 45:
                            com.google.android.gms.internal.drive.zzmh.zzl(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 46:
                            com.google.android.gms.internal.drive.zzmh.zzg(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 47:
                            com.google.android.gms.internal.drive.zzmh.zzj(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 48:
                            com.google.android.gms.internal.drive.zzmh.zze(this.zzud[i], (java.util.List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 49:
                            com.google.android.gms.internal.drive.zzmh.zzb(this.zzud[i], (java.util.List<?>) unsafe.getObject(t, j), zznsVar, zzap(i));
                            break;
                        case 50:
                            zza(zznsVar, i5, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, zze(t, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, zzf(t, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzi(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzc(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzc(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzf(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzb(i5, zzi(t, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zza(i5, unsafe.getObject(t, j), zznsVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i));
                                break;
                            }
                            break;
                        case 61:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, (com.google.android.gms.internal.drive.zzjc) unsafe.getObject(t, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzd(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 63:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzn(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzm(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzj(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zze(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzb(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i)) {
                                zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.zzus.zza(zznsVar, entry);
                    entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                }
                zza(this.zzur, t, zznsVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzud.length;
        sun.misc.Unsafe unsafe2 = zzuc;
        int i32 = -1;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        zza(this.zzur, t, zznsVar);
    }

    private final <K, V> void zza(com.google.android.gms.internal.drive.zzns zznsVar, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj != null) {
            zznsVar.zza(i, this.zzut.zzm(zzaq(i2)), this.zzut.zzi(obj));
        }
    }

    private static <UT, UB> void zza(com.google.android.gms.internal.drive.zzmx<UT, UB> zzmxVar, T t, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        zzmxVar.zza(zzmxVar.zzr(t), zznsVar);
    }

    private static com.google.android.gms.internal.drive.zzmy zzo(java.lang.Object obj) {
        com.google.android.gms.internal.drive.zzkk zzkkVar = (com.google.android.gms.internal.drive.zzkk) obj;
        com.google.android.gms.internal.drive.zzmy zzmyVar = zzkkVar.zzrq;
        if (zzmyVar != com.google.android.gms.internal.drive.zzmy.zzfa()) {
            return zzmyVar;
        }
        com.google.android.gms.internal.drive.zzmy zzfb = com.google.android.gms.internal.drive.zzmy.zzfb();
        zzkkVar.zzrq = zzfb;
        return zzfb;
    }

    private static int zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.drive.zznm zznmVar, java.lang.Class<?> cls, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        switch (com.google.android.gms.internal.drive.zzlv.zzox[zznmVar.ordinal()]) {
            case 1:
                int zzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Boolean.valueOf(zzizVar.zznl != 0);
                return zzb;
            case 2:
                return com.google.android.gms.internal.drive.zziy.zze(bArr, i, zzizVar);
            case 3:
                zzizVar.zznm = java.lang.Double.valueOf(com.google.android.gms.internal.drive.zziy.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzizVar.zznm = java.lang.Integer.valueOf(com.google.android.gms.internal.drive.zziy.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzizVar.zznm = java.lang.Long.valueOf(com.google.android.gms.internal.drive.zziy.zzb(bArr, i));
                return i + 8;
            case 8:
                zzizVar.zznm = java.lang.Float.valueOf(com.google.android.gms.internal.drive.zziy.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Integer.valueOf(zzizVar.zznk);
                return zza;
            case 12:
            case 13:
                int zzb2 = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Long.valueOf(zzizVar.zznl);
                return zzb2;
            case 14:
                return com.google.android.gms.internal.drive.zziy.zza(com.google.android.gms.internal.drive.zzmd.zzej().zzf(cls), bArr, i, i2, zzizVar);
            case 15:
                int zza2 = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Integer.valueOf(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk));
                return zza2;
            case 16:
                int zzb3 = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = java.lang.Long.valueOf(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl));
                return zzb3;
            case 17:
                return com.google.android.gms.internal.drive.zziy.zzd(bArr, i, zzizVar);
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        int zza;
        int i8 = i;
        sun.misc.Unsafe unsafe = zzuc;
        com.google.android.gms.internal.drive.zzkp zzkpVar = (com.google.android.gms.internal.drive.zzkp) unsafe.getObject(t, j2);
        if (!zzkpVar.zzbo()) {
            int size = zzkpVar.size();
            zzkpVar = zzkpVar.zzr(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, zzkpVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzju zzjuVar = (com.google.android.gms.internal.drive.zzju) zzkpVar;
                    int zza2 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    int i9 = zzizVar.zznk + zza2;
                    while (zza2 < i9) {
                        zzjuVar.zzc(com.google.android.gms.internal.drive.zziy.zzc(bArr, zza2));
                        zza2 += 8;
                    }
                    if (zza2 == i9) {
                        return zza2;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.drive.zzju zzjuVar2 = (com.google.android.gms.internal.drive.zzju) zzkpVar;
                    zzjuVar2.zzc(com.google.android.gms.internal.drive.zziy.zzc(bArr, i));
                    while (true) {
                        int i10 = i8 + 8;
                        if (i10 >= i2) {
                            return i10;
                        }
                        i8 = com.google.android.gms.internal.drive.zziy.zza(bArr, i10, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i10;
                        }
                        zzjuVar2.zzc(com.google.android.gms.internal.drive.zziy.zzc(bArr, i8));
                    }
                }
                return i8;
            case 19:
            case 36:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzkh zzkhVar = (com.google.android.gms.internal.drive.zzkh) zzkpVar;
                    int zza3 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    int i11 = zzizVar.zznk + zza3;
                    while (zza3 < i11) {
                        zzkhVar.zzc(com.google.android.gms.internal.drive.zziy.zzd(bArr, zza3));
                        zza3 += 4;
                    }
                    if (zza3 == i11) {
                        return zza3;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.drive.zzkh zzkhVar2 = (com.google.android.gms.internal.drive.zzkh) zzkpVar;
                    zzkhVar2.zzc(com.google.android.gms.internal.drive.zziy.zzd(bArr, i));
                    while (true) {
                        int i12 = i8 + 4;
                        if (i12 >= i2) {
                            return i12;
                        }
                        i8 = com.google.android.gms.internal.drive.zziy.zza(bArr, i12, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i12;
                        }
                        zzkhVar2.zzc(com.google.android.gms.internal.drive.zziy.zzd(bArr, i8));
                    }
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzle zzleVar = (com.google.android.gms.internal.drive.zzle) zzkpVar;
                    int zza4 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    int i13 = zzizVar.zznk + zza4;
                    while (zza4 < i13) {
                        zza4 = com.google.android.gms.internal.drive.zziy.zzb(bArr, zza4, zzizVar);
                        zzleVar.zzv(zzizVar.zznl);
                    }
                    if (zza4 == i13) {
                        return zza4;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.drive.zzle zzleVar2 = (com.google.android.gms.internal.drive.zzle) zzkpVar;
                    int zzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, i8, zzizVar);
                    zzleVar2.zzv(zzizVar.zznl);
                    while (zzb < i2) {
                        int zza5 = com.google.android.gms.internal.drive.zziy.zza(bArr, zzb, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zzb;
                        }
                        zzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, zza5, zzizVar);
                        zzleVar2.zzv(zzizVar.zznl);
                    }
                    return zzb;
                }
                return i8;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return com.google.android.gms.internal.drive.zziy.zza(bArr, i8, (com.google.android.gms.internal.drive.zzkp<?>) zzkpVar, zzizVar);
                }
                if (i5 == 0) {
                    return com.google.android.gms.internal.drive.zziy.zza(i3, bArr, i, i2, (com.google.android.gms.internal.drive.zzkp<?>) zzkpVar, zzizVar);
                }
                return i8;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzle zzleVar3 = (com.google.android.gms.internal.drive.zzle) zzkpVar;
                    int zza6 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    int i14 = zzizVar.zznk + zza6;
                    while (zza6 < i14) {
                        zzleVar3.zzv(com.google.android.gms.internal.drive.zziy.zzb(bArr, zza6));
                        zza6 += 8;
                    }
                    if (zza6 == i14) {
                        return zza6;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 1) {
                    com.google.android.gms.internal.drive.zzle zzleVar4 = (com.google.android.gms.internal.drive.zzle) zzkpVar;
                    zzleVar4.zzv(com.google.android.gms.internal.drive.zziy.zzb(bArr, i));
                    while (true) {
                        int i15 = i8 + 8;
                        if (i15 >= i2) {
                            return i15;
                        }
                        i8 = com.google.android.gms.internal.drive.zziy.zza(bArr, i15, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i15;
                        }
                        zzleVar4.zzv(com.google.android.gms.internal.drive.zziy.zzb(bArr, i8));
                    }
                }
                return i8;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzkl zzklVar = (com.google.android.gms.internal.drive.zzkl) zzkpVar;
                    int zza7 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    int i16 = zzizVar.zznk + zza7;
                    while (zza7 < i16) {
                        zzklVar.zzam(com.google.android.gms.internal.drive.zziy.zza(bArr, zza7));
                        zza7 += 4;
                    }
                    if (zza7 == i16) {
                        return zza7;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 5) {
                    com.google.android.gms.internal.drive.zzkl zzklVar2 = (com.google.android.gms.internal.drive.zzkl) zzkpVar;
                    zzklVar2.zzam(com.google.android.gms.internal.drive.zziy.zza(bArr, i));
                    while (true) {
                        int i17 = i8 + 4;
                        if (i17 >= i2) {
                            return i17;
                        }
                        i8 = com.google.android.gms.internal.drive.zziy.zza(bArr, i17, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i17;
                        }
                        zzklVar2.zzam(com.google.android.gms.internal.drive.zziy.zza(bArr, i8));
                    }
                }
                return i8;
            case 25:
            case 42:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzja zzjaVar = (com.google.android.gms.internal.drive.zzja) zzkpVar;
                    zza = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    int i18 = zzizVar.zznk + zza;
                    while (zza < i18) {
                        zza = com.google.android.gms.internal.drive.zziy.zzb(bArr, zza, zzizVar);
                        zzjaVar.addBoolean(zzizVar.zznl != 0);
                    }
                    if (zza != i18) {
                        throw com.google.android.gms.internal.drive.zzkq.zzdi();
                    }
                    return zza;
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.drive.zzja zzjaVar2 = (com.google.android.gms.internal.drive.zzja) zzkpVar;
                    i8 = com.google.android.gms.internal.drive.zziy.zzb(bArr, i8, zzizVar);
                    zzjaVar2.addBoolean(zzizVar.zznl != 0);
                    while (i8 < i2) {
                        int zza8 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            i8 = com.google.android.gms.internal.drive.zziy.zzb(bArr, zza8, zzizVar);
                            zzjaVar2.addBoolean(zzizVar.zznl != 0);
                        }
                    }
                }
                return i8;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i8 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                        int i19 = zzizVar.zznk;
                        if (i19 < 0) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdj();
                        }
                        if (i19 == 0) {
                            zzkpVar.add("");
                        } else {
                            zzkpVar.add(new java.lang.String(bArr, i8, i19, com.google.android.gms.internal.drive.zzkm.UTF_8));
                            i8 += i19;
                        }
                        while (i8 < i2) {
                            int zza9 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                            if (i3 == zzizVar.zznk) {
                                i8 = com.google.android.gms.internal.drive.zziy.zza(bArr, zza9, zzizVar);
                                int i20 = zzizVar.zznk;
                                if (i20 < 0) {
                                    throw com.google.android.gms.internal.drive.zzkq.zzdj();
                                }
                                if (i20 == 0) {
                                    zzkpVar.add("");
                                } else {
                                    zzkpVar.add(new java.lang.String(bArr, i8, i20, com.google.android.gms.internal.drive.zzkm.UTF_8));
                                    i8 += i20;
                                }
                            }
                        }
                    } else {
                        i8 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                        int i21 = zzizVar.zznk;
                        if (i21 < 0) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdj();
                        }
                        if (i21 == 0) {
                            zzkpVar.add("");
                        } else {
                            int i22 = i8 + i21;
                            if (!com.google.android.gms.internal.drive.zznf.zze(bArr, i8, i22)) {
                                throw com.google.android.gms.internal.drive.zzkq.zzdn();
                            }
                            zzkpVar.add(new java.lang.String(bArr, i8, i21, com.google.android.gms.internal.drive.zzkm.UTF_8));
                            i8 = i22;
                        }
                        while (i8 < i2) {
                            int zza10 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                            if (i3 == zzizVar.zznk) {
                                i8 = com.google.android.gms.internal.drive.zziy.zza(bArr, zza10, zzizVar);
                                int i23 = zzizVar.zznk;
                                if (i23 < 0) {
                                    throw com.google.android.gms.internal.drive.zzkq.zzdj();
                                }
                                if (i23 == 0) {
                                    zzkpVar.add("");
                                } else {
                                    int i24 = i8 + i23;
                                    if (!com.google.android.gms.internal.drive.zznf.zze(bArr, i8, i24)) {
                                        throw com.google.android.gms.internal.drive.zzkq.zzdn();
                                    }
                                    zzkpVar.add(new java.lang.String(bArr, i8, i23, com.google.android.gms.internal.drive.zzkm.UTF_8));
                                    i8 = i24;
                                }
                            }
                        }
                    }
                }
                return i8;
            case 27:
                if (i5 == 2) {
                    return com.google.android.gms.internal.drive.zziy.zza(zzap(i6), i3, bArr, i, i2, zzkpVar, zzizVar);
                }
                return i8;
            case 28:
                if (i5 == 2) {
                    int zza11 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    int i25 = zzizVar.zznk;
                    if (i25 < 0) {
                        throw com.google.android.gms.internal.drive.zzkq.zzdj();
                    }
                    if (i25 > bArr.length - zza11) {
                        throw com.google.android.gms.internal.drive.zzkq.zzdi();
                    }
                    if (i25 == 0) {
                        zzkpVar.add(com.google.android.gms.internal.drive.zzjc.zznq);
                    } else {
                        zzkpVar.add(com.google.android.gms.internal.drive.zzjc.zzb(bArr, zza11, i25));
                        zza11 += i25;
                    }
                    while (zza11 < i2) {
                        int zza12 = com.google.android.gms.internal.drive.zziy.zza(bArr, zza11, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zza11;
                        }
                        zza11 = com.google.android.gms.internal.drive.zziy.zza(bArr, zza12, zzizVar);
                        int i26 = zzizVar.zznk;
                        if (i26 < 0) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdj();
                        }
                        if (i26 > bArr.length - zza11) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdi();
                        }
                        if (i26 == 0) {
                            zzkpVar.add(com.google.android.gms.internal.drive.zzjc.zznq);
                        } else {
                            zzkpVar.add(com.google.android.gms.internal.drive.zzjc.zzb(bArr, zza11, i26));
                            zza11 += i26;
                        }
                    }
                    return zza11;
                }
                return i8;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zza = com.google.android.gms.internal.drive.zziy.zza(i3, bArr, i, i2, (com.google.android.gms.internal.drive.zzkp<?>) zzkpVar, zzizVar);
                    }
                    return i8;
                }
                zza = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, (com.google.android.gms.internal.drive.zzkp<?>) zzkpVar, zzizVar);
                com.google.android.gms.internal.drive.zzkk zzkkVar = (com.google.android.gms.internal.drive.zzkk) t;
                com.google.android.gms.internal.drive.zzmy zzmyVar = zzkkVar.zzrq;
                if (zzmyVar == com.google.android.gms.internal.drive.zzmy.zzfa()) {
                    zzmyVar = null;
                }
                com.google.android.gms.internal.drive.zzmy zzmyVar2 = (com.google.android.gms.internal.drive.zzmy) com.google.android.gms.internal.drive.zzmh.zza(i4, zzkpVar, zzar(i6), zzmyVar, this.zzur);
                if (zzmyVar2 != null) {
                    zzkkVar.zzrq = zzmyVar2;
                }
                return zza;
            case 33:
            case 47:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzkl zzklVar3 = (com.google.android.gms.internal.drive.zzkl) zzkpVar;
                    int zza13 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    int i27 = zzizVar.zznk + zza13;
                    while (zza13 < i27) {
                        zza13 = com.google.android.gms.internal.drive.zziy.zza(bArr, zza13, zzizVar);
                        zzklVar3.zzam(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk));
                    }
                    if (zza13 == i27) {
                        return zza13;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.drive.zzkl zzklVar4 = (com.google.android.gms.internal.drive.zzkl) zzkpVar;
                    int zza14 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    zzklVar4.zzam(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk));
                    while (zza14 < i2) {
                        int zza15 = com.google.android.gms.internal.drive.zziy.zza(bArr, zza14, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zza14;
                        }
                        zza14 = com.google.android.gms.internal.drive.zziy.zza(bArr, zza15, zzizVar);
                        zzklVar4.zzam(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk));
                    }
                    return zza14;
                }
                return i8;
            case 34:
            case 48:
                if (i5 == 2) {
                    com.google.android.gms.internal.drive.zzle zzleVar5 = (com.google.android.gms.internal.drive.zzle) zzkpVar;
                    int zza16 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                    int i28 = zzizVar.zznk + zza16;
                    while (zza16 < i28) {
                        zza16 = com.google.android.gms.internal.drive.zziy.zzb(bArr, zza16, zzizVar);
                        zzleVar5.zzv(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl));
                    }
                    if (zza16 == i28) {
                        return zza16;
                    }
                    throw com.google.android.gms.internal.drive.zzkq.zzdi();
                }
                if (i5 == 0) {
                    com.google.android.gms.internal.drive.zzle zzleVar6 = (com.google.android.gms.internal.drive.zzle) zzkpVar;
                    int zzb2 = com.google.android.gms.internal.drive.zziy.zzb(bArr, i8, zzizVar);
                    zzleVar6.zzv(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl));
                    while (zzb2 < i2) {
                        int zza17 = com.google.android.gms.internal.drive.zziy.zza(bArr, zzb2, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zzb2;
                        }
                        zzb2 = com.google.android.gms.internal.drive.zziy.zzb(bArr, zza17, zzizVar);
                        zzleVar6.zzv(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl));
                    }
                    return zzb2;
                }
                return i8;
            case 49:
                if (i5 == 3) {
                    com.google.android.gms.internal.drive.zzmf zzap = zzap(i6);
                    int i29 = (i3 & (-8)) | 4;
                    i8 = com.google.android.gms.internal.drive.zziy.zza(zzap, bArr, i, i2, i29, zzizVar);
                    zzkpVar.add(zzizVar.zznm);
                    while (i8 < i2) {
                        int zza18 = com.google.android.gms.internal.drive.zziy.zza(bArr, i8, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            i8 = com.google.android.gms.internal.drive.zziy.zza(zzap, bArr, zza18, i2, i29, zzizVar);
                            zzkpVar.add(zzizVar.zznm);
                        }
                    }
                }
                return i8;
            default:
                return i8;
        }
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe = zzuc;
        java.lang.Object zzaq = zzaq(i3);
        java.lang.Object object = unsafe.getObject(t, j);
        if (this.zzut.zzj(object)) {
            java.lang.Object zzl = this.zzut.zzl(zzaq);
            this.zzut.zzb(zzl, object);
            unsafe.putObject(t, j, zzl);
            object = zzl;
        }
        com.google.android.gms.internal.drive.zzlj<?, ?> zzm = this.zzut.zzm(zzaq);
        java.util.Map<?, ?> zzh = this.zzut.zzh(object);
        int zza = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
        int i4 = zzizVar.zznk;
        if (i4 < 0 || i4 > i2 - zza) {
            throw com.google.android.gms.internal.drive.zzkq.zzdi();
        }
        int i5 = i4 + zza;
        K k = zzm.zztv;
        V v = zzm.zztx;
        while (zza < i5) {
            int i6 = zza + 1;
            int i7 = bArr[zza];
            if (i7 < 0) {
                i6 = com.google.android.gms.internal.drive.zziy.zza(i7, bArr, i6, zzizVar);
                i7 = zzizVar.zznk;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzm.zztu.zzfk()) {
                    zza = zza(bArr, i8, i2, zzm.zztu, (java.lang.Class<?>) null, zzizVar);
                    k = (K) zzizVar.zznm;
                } else {
                    zza = com.google.android.gms.internal.drive.zziy.zza(i7, bArr, i8, i2, zzizVar);
                }
            } else {
                if (i9 == 2 && i10 == zzm.zztw.zzfk()) {
                    zza = zza(bArr, i8, i2, zzm.zztw, zzm.zztx.getClass(), zzizVar);
                    v = zzizVar.zznm;
                }
                zza = com.google.android.gms.internal.drive.zziy.zza(i7, bArr, i8, i2, zzizVar);
            }
        }
        if (zza != i5) {
            throw com.google.android.gms.internal.drive.zzkq.zzdm();
        }
        zzh.put(k, v);
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        int zzb;
        sun.misc.Unsafe unsafe = zzuc;
        long j2 = this.zzud[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, java.lang.Double.valueOf(com.google.android.gms.internal.drive.zziy.zzc(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, java.lang.Float.valueOf(com.google.android.gms.internal.drive.zziy.zzd(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(t, j, java.lang.Long.valueOf(zzizVar.zznl));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(zzizVar.zznk));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.drive.zziy.zzb(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.drive.zziy.zza(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(t, j, java.lang.Boolean.valueOf(zzizVar.zznl != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                    int i9 = zzizVar.zznk;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !com.google.android.gms.internal.drive.zznf.zze(bArr, zza, zza + i9)) {
                            throw com.google.android.gms.internal.drive.zzkq.zzdn();
                        }
                        unsafe.putObject(t, j, new java.lang.String(bArr, zza, i9, com.google.android.gms.internal.drive.zzkm.UTF_8));
                        zza += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = com.google.android.gms.internal.drive.zziy.zza(zzap(i8), bArr, i, i2, zzizVar);
                    java.lang.Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzizVar.zznm);
                    } else {
                        unsafe.putObject(t, j, com.google.android.gms.internal.drive.zzkm.zza(object, zzizVar.zznm));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = com.google.android.gms.internal.drive.zziy.zze(bArr, i, zzizVar);
                    unsafe.putObject(t, j, zzizVar.zznm);
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                    int i10 = zzizVar.zznk;
                    com.google.android.gms.internal.drive.zzko zzar = zzar(i8);
                    if (zzar == null || zzar.zzan(i10)) {
                        unsafe.putObject(t, j, java.lang.Integer.valueOf(i10));
                        zzb = zza3;
                        unsafe.putInt(t, j2, i4);
                        return zzb;
                    }
                    zzo(t).zzb(i3, java.lang.Long.valueOf(i10));
                    return zza3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = com.google.android.gms.internal.drive.zziy.zza(bArr, i, zzizVar);
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(com.google.android.gms.internal.drive.zzjo.zzw(zzizVar.zznk)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = com.google.android.gms.internal.drive.zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(t, j, java.lang.Long.valueOf(com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = com.google.android.gms.internal.drive.zziy.zza(zzap(i8), bArr, i, i2, (i3 & (-8)) | 4, zzizVar);
                    java.lang.Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzizVar.zznm);
                    } else {
                        unsafe.putObject(t, j, com.google.android.gms.internal.drive.zzkm.zza(object2, zzizVar.zznm));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    private final com.google.android.gms.internal.drive.zzmf zzap(int i) {
        int i2 = (i / 3) << 1;
        com.google.android.gms.internal.drive.zzmf zzmfVar = (com.google.android.gms.internal.drive.zzmf) this.zzue[i2];
        if (zzmfVar != null) {
            return zzmfVar;
        }
        com.google.android.gms.internal.drive.zzmf<T> zzf = com.google.android.gms.internal.drive.zzmd.zzej().zzf((java.lang.Class) this.zzue[i2 + 1]);
        this.zzue[i2] = zzf;
        return zzf;
    }

    private final java.lang.Object zzaq(int i) {
        return this.zzue[(i / 3) << 1];
    }

    private final com.google.android.gms.internal.drive.zzko zzar(int i) {
        return (com.google.android.gms.internal.drive.zzko) this.zzue[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    final int zza(T t, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        sun.misc.Unsafe unsafe;
        int i4;
        java.lang.Object obj;
        com.google.android.gms.internal.drive.zzlu<T> zzluVar;
        int i5;
        int i6;
        int i7;
        int i8;
        com.google.android.gms.internal.drive.zzko zzar;
        int i9;
        int i10;
        int zzau;
        int i11;
        int i12;
        int i13;
        java.lang.Object obj2;
        int i14;
        com.google.android.gms.internal.drive.zziz zzizVar2;
        int i15;
        int i16;
        int i17;
        com.google.android.gms.internal.drive.zziz zzizVar3;
        int i18;
        com.google.android.gms.internal.drive.zziz zzizVar4;
        int i19;
        int i20;
        com.google.android.gms.internal.drive.zziz zzizVar5;
        int i21;
        int i22;
        int i23;
        com.google.android.gms.internal.drive.zzlu<T> zzluVar2 = this;
        java.lang.Object obj3 = t;
        byte[] bArr2 = bArr;
        int i24 = i2;
        int i25 = i3;
        com.google.android.gms.internal.drive.zziz zzizVar6 = zzizVar;
        sun.misc.Unsafe unsafe2 = zzuc;
        int i26 = i;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = -1;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b = bArr2[i26];
                if (b < 0) {
                    i10 = com.google.android.gms.internal.drive.zziy.zza(b, bArr2, i32, zzizVar6);
                    i9 = zzizVar6.zznk;
                } else {
                    i9 = b;
                    i10 = i32;
                }
                int i33 = i9 >>> 3;
                int i34 = i9 & 7;
                if (i33 > i27) {
                    zzau = zzluVar2.zzp(i33, i28 / 3);
                } else {
                    zzau = zzluVar2.zzau(i33);
                }
                int i35 = zzau;
                if (i35 == -1) {
                    i11 = i33;
                    i12 = i10;
                    i6 = i9;
                    unsafe = unsafe2;
                    i4 = i25;
                    i13 = 0;
                } else {
                    int[] iArr = zzluVar2.zzud;
                    int i36 = iArr[i35 + 1];
                    int i37 = (i36 & 267386880) >>> 20;
                    int i38 = i9;
                    long j = i36 & 1048575;
                    if (i37 <= 17) {
                        int i39 = iArr[i35 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i31) {
                            if (i31 != -1) {
                                unsafe2.putInt(obj3, i31, i30);
                            }
                            i30 = unsafe2.getInt(obj3, i41);
                            i31 = i41;
                        }
                        switch (i37) {
                            case 0:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                i19 = i10;
                                if (i34 != 1) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    com.google.android.gms.internal.drive.zznd.zza(obj3, j, com.google.android.gms.internal.drive.zziy.zzc(bArr2, i19));
                                    i26 = i19 + 8;
                                    i30 |= i40;
                                    i31 = i18;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 1:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                i19 = i10;
                                if (i34 != 5) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    com.google.android.gms.internal.drive.zznd.zza(obj3, j, com.google.android.gms.internal.drive.zziy.zzd(bArr2, i19));
                                    i26 = i19 + 4;
                                    i30 |= i40;
                                    i31 = i18;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 2:
                            case 3:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                i19 = i10;
                                if (i34 != 0) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    int zzb = com.google.android.gms.internal.drive.zziy.zzb(bArr2, i19, zzizVar);
                                    unsafe2.putLong(t, j, zzizVar.zznl);
                                    i30 |= i40;
                                    i26 = zzb;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar;
                                    i31 = i18;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 4:
                            case 11:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                i19 = i10;
                                if (i34 != 0) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = com.google.android.gms.internal.drive.zziy.zza(bArr2, i19, zzizVar4);
                                    unsafe2.putInt(obj3, j, zzizVar4.zznk);
                                    i30 |= i40;
                                    i31 = i18;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 5:
                            case 14:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 1) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i18 = i31;
                                    i19 = i10;
                                    unsafe2.putLong(t, j, com.google.android.gms.internal.drive.zziy.zzb(bArr2, i10));
                                    i26 = i19 + 8;
                                    i30 |= i40;
                                    i31 = i18;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 6:
                            case 13:
                                i20 = i2;
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                if (i34 != 5) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j, com.google.android.gms.internal.drive.zziy.zza(bArr2, i10));
                                    i26 = i10 + 4;
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 7:
                                i20 = i2;
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    int zzb2 = com.google.android.gms.internal.drive.zziy.zzb(bArr2, i10, zzizVar5);
                                    com.google.android.gms.internal.drive.zznd.zza(obj3, j, zzizVar5.zznl != 0);
                                    i30 |= i40;
                                    i26 = zzb2;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 8:
                                i20 = i2;
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                if (i34 != 2) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    if ((i36 & 536870912) == 0) {
                                        i26 = com.google.android.gms.internal.drive.zziy.zzc(bArr2, i10, zzizVar5);
                                    } else {
                                        i26 = com.google.android.gms.internal.drive.zziy.zzd(bArr2, i10, zzizVar5);
                                    }
                                    unsafe2.putObject(obj3, j, zzizVar5.zznm);
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 9:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                if (i34 != 2) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i20 = i2;
                                    i26 = com.google.android.gms.internal.drive.zziy.zza(zzluVar2.zzap(i15), bArr2, i10, i20, zzizVar5);
                                    if ((i30 & i40) == 0) {
                                        unsafe2.putObject(obj3, j, zzizVar5.zznm);
                                    } else {
                                        unsafe2.putObject(obj3, j, com.google.android.gms.internal.drive.zzkm.zza(unsafe2.getObject(obj3, j), zzizVar5.zznm));
                                    }
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 10:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 2) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = com.google.android.gms.internal.drive.zziy.zze(bArr2, i10, zzizVar4);
                                    unsafe2.putObject(obj3, j, zzizVar4.zznm);
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 12:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = com.google.android.gms.internal.drive.zziy.zza(bArr2, i10, zzizVar4);
                                    int i42 = zzizVar4.zznk;
                                    com.google.android.gms.internal.drive.zzko zzar2 = zzluVar2.zzar(i15);
                                    if (zzar2 == null || zzar2.zzan(i42)) {
                                        unsafe2.putInt(obj3, j, i42);
                                        i30 |= i40;
                                        i29 = i17;
                                        i28 = i15;
                                        i27 = i16;
                                        zzizVar6 = zzizVar4;
                                        i24 = i2;
                                        i25 = i3;
                                    } else {
                                        zzo(t).zzb(i17, java.lang.Long.valueOf(i42));
                                        i29 = i17;
                                        i28 = i15;
                                        i27 = i16;
                                        zzizVar6 = zzizVar4;
                                        i24 = i2;
                                        i25 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = com.google.android.gms.internal.drive.zziy.zza(bArr2, i10, zzizVar4);
                                    unsafe2.putInt(obj3, j, com.google.android.gms.internal.drive.zzjo.zzw(zzizVar4.zznk));
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 16:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    int zzb3 = com.google.android.gms.internal.drive.zziy.zzb(bArr2, i10, zzizVar);
                                    zzizVar4 = zzizVar;
                                    unsafe2.putLong(t, j, com.google.android.gms.internal.drive.zzjo.zzk(zzizVar.zznl));
                                    i30 |= i40;
                                    i26 = zzb3;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 17:
                                if (i34 != 3) {
                                    i15 = i35;
                                    i16 = i33;
                                    i17 = i38;
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = com.google.android.gms.internal.drive.zziy.zza(zzluVar2.zzap(i35), bArr, i10, i2, (i33 << 3) | 4, zzizVar);
                                    if ((i30 & i40) == 0) {
                                        zzizVar3 = zzizVar;
                                        unsafe2.putObject(obj3, j, zzizVar3.zznm);
                                    } else {
                                        zzizVar3 = zzizVar;
                                        unsafe2.putObject(obj3, j, com.google.android.gms.internal.drive.zzkm.zza(unsafe2.getObject(obj3, j), zzizVar3.zznm));
                                    }
                                    i30 |= i40;
                                    bArr2 = bArr;
                                    i24 = i2;
                                    i29 = i38;
                                    i28 = i35;
                                    i27 = i33;
                                    i25 = i3;
                                    zzizVar6 = zzizVar3;
                                }
                            default:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                i19 = i10;
                                i12 = i19;
                                i13 = i15;
                                unsafe = unsafe2;
                                i31 = i18;
                                i6 = i17;
                                i11 = i16;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i43 = i31;
                        int i44 = i10;
                        bArr2 = bArr;
                        com.google.android.gms.internal.drive.zziz zzizVar7 = zzizVar6;
                        if (i37 != 27) {
                            i21 = i30;
                            if (i37 <= 49) {
                                i11 = i33;
                                i23 = i38;
                                i13 = i35;
                                unsafe = unsafe2;
                                i26 = zza((com.google.android.gms.internal.drive.zzlu<T>) t, bArr, i44, i2, i38, i11, i34, i35, i36, i37, j, zzizVar);
                                if (i26 == i44) {
                                    i4 = i3;
                                    i12 = i26;
                                } else {
                                    zzluVar2 = this;
                                    obj3 = t;
                                    bArr2 = bArr;
                                    i27 = i11;
                                    i24 = i2;
                                    i25 = i3;
                                    zzizVar6 = zzizVar;
                                    i31 = i43;
                                    i28 = i13;
                                    i30 = i21;
                                    i29 = i23;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i11 = i33;
                                i22 = i44;
                                i23 = i38;
                                i13 = i35;
                                unsafe = unsafe2;
                                if (i37 != 50) {
                                    i26 = zza((com.google.android.gms.internal.drive.zzlu<T>) t, bArr, i22, i2, i23, i11, i34, i36, i37, j, i13, zzizVar);
                                    if (i26 != i22) {
                                        zzluVar2 = this;
                                        obj3 = t;
                                        i24 = i2;
                                        i25 = i3;
                                        i29 = i23;
                                        i27 = i11;
                                        i31 = i43;
                                        i28 = i13;
                                        i30 = i21;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        zzizVar6 = zzizVar;
                                    }
                                } else if (i34 == 2) {
                                    i26 = zza((com.google.android.gms.internal.drive.zzlu<T>) t, bArr, i22, i2, i13, j, zzizVar);
                                    if (i26 != i22) {
                                        zzluVar2 = this;
                                        obj3 = t;
                                        bArr2 = bArr;
                                        i27 = i11;
                                        i24 = i2;
                                        i25 = i3;
                                        zzizVar6 = zzizVar;
                                        i31 = i43;
                                        i28 = i13;
                                        i30 = i21;
                                        i29 = i23;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i12 = i22;
                                }
                                i4 = i3;
                                i12 = i26;
                            }
                        } else if (i34 == 2) {
                            com.google.android.gms.internal.drive.zzkp zzkpVar = (com.google.android.gms.internal.drive.zzkp) unsafe2.getObject(obj3, j);
                            if (!zzkpVar.zzbo()) {
                                int size = zzkpVar.size();
                                zzkpVar = zzkpVar.zzr(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj3, j, zzkpVar);
                            }
                            i26 = com.google.android.gms.internal.drive.zziy.zza(zzluVar2.zzap(i35), i38, bArr, i44, i2, zzkpVar, zzizVar);
                            i25 = i3;
                            i27 = i33;
                            i29 = i38;
                            i28 = i35;
                            zzizVar6 = zzizVar7;
                            i31 = i43;
                            i30 = i30;
                            i24 = i2;
                        } else {
                            i21 = i30;
                            i11 = i33;
                            i22 = i44;
                            i23 = i38;
                            i13 = i35;
                            unsafe = unsafe2;
                            i4 = i3;
                            i12 = i22;
                        }
                        i31 = i43;
                        i30 = i21;
                        i6 = i23;
                    }
                }
                if (i6 != i4 || i4 == 0) {
                    if (this.zzui) {
                        zzizVar2 = zzizVar;
                        if (zzizVar2.zznn != com.google.android.gms.internal.drive.zzjx.zzci()) {
                            int i45 = i11;
                            if (zzizVar2.zznn.zza(this.zzuh, i45) == null) {
                                i26 = com.google.android.gms.internal.drive.zziy.zza(i6, bArr, i12, i2, zzo(t), zzizVar);
                                obj3 = t;
                                i24 = i2;
                                i29 = i6;
                                zzluVar2 = this;
                                zzizVar6 = zzizVar2;
                                i27 = i45;
                                i28 = i13;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i25 = i4;
                            } else {
                                com.google.android.gms.internal.drive.zzkk.zzc zzcVar = (com.google.android.gms.internal.drive.zzkk.zzc) t;
                                zzcVar.zzdg();
                                com.google.android.gms.internal.drive.zzkb<java.lang.Object> zzkbVar = zzcVar.zzrw;
                                throw new java.lang.NoSuchMethodError();
                            }
                        } else {
                            obj2 = t;
                            i14 = i11;
                        }
                    } else {
                        obj2 = t;
                        i14 = i11;
                        zzizVar2 = zzizVar;
                    }
                    i26 = com.google.android.gms.internal.drive.zziy.zza(i6, bArr, i12, i2, zzo(t), zzizVar);
                    i29 = i6;
                    zzluVar2 = this;
                    zzizVar6 = zzizVar2;
                    i27 = i14;
                    obj3 = obj2;
                    i28 = i13;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i24 = i2;
                    i25 = i4;
                } else {
                    zzluVar = this;
                    obj = t;
                    i7 = i31;
                    i8 = -1;
                    i5 = i12;
                }
            } else {
                int i46 = i31;
                unsafe = unsafe2;
                i4 = i25;
                obj = obj3;
                zzluVar = zzluVar2;
                i5 = i26;
                i6 = i29;
                i7 = i46;
                i8 = -1;
            }
        }
        if (i7 != i8) {
            unsafe.putInt(obj, i7, i30);
        }
        java.lang.Object obj4 = null;
        for (int i47 = zzluVar.zzun; i47 < zzluVar.zzuo; i47++) {
            int i48 = zzluVar.zzum[i47];
            com.google.android.gms.internal.drive.zzmx zzmxVar = zzluVar.zzur;
            int i49 = zzluVar.zzud[i48];
            java.lang.Object zzo = com.google.android.gms.internal.drive.zznd.zzo(obj, zzluVar.zzas(i48) & 1048575);
            if (zzo != null && (zzar = zzluVar.zzar(i48)) != null) {
                obj4 = zza(i48, i49, zzluVar.zzut.zzh(zzo), zzar, (com.google.android.gms.internal.drive.zzko) obj4, (com.google.android.gms.internal.drive.zzmx<UT, com.google.android.gms.internal.drive.zzko>) zzmxVar);
            }
            obj4 = (com.google.android.gms.internal.drive.zzmy) obj4;
        }
        if (obj4 != null) {
            zzluVar.zzur.zzf(obj, obj4);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw com.google.android.gms.internal.drive.zzkq.zzdm();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw com.google.android.gms.internal.drive.zzkq.zzdm();
        }
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020f, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022e, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e2, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0230, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0061. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, com.google.android.gms.internal.drive.zziz zzizVar) throws java.io.IOException {
        byte b;
        int i3;
        int zzau;
        int i4;
        int i5;
        int i6;
        sun.misc.Unsafe unsafe;
        int i7;
        int i8;
        int zzb;
        com.google.android.gms.internal.drive.zzlu<T> zzluVar = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i2;
        com.google.android.gms.internal.drive.zziz zzizVar2 = zzizVar;
        if (zzluVar.zzuk) {
            sun.misc.Unsafe unsafe2 = zzuc;
            int i10 = -1;
            int i11 = i;
            int i12 = -1;
            int i13 = 0;
            while (i11 < i9) {
                int i14 = i11 + 1;
                byte b2 = bArr2[i11];
                if (b2 < 0) {
                    i3 = com.google.android.gms.internal.drive.zziy.zza(b2, bArr2, i14, zzizVar2);
                    b = zzizVar2.zznk;
                } else {
                    b = b2;
                    i3 = i14;
                }
                int i15 = b >>> 3;
                int i16 = b & 7;
                if (i15 > i12) {
                    zzau = zzluVar.zzp(i15, i13 / 3);
                } else {
                    zzau = zzluVar.zzau(i15);
                }
                int i17 = zzau;
                if (i17 == i10) {
                    i5 = i15;
                    i7 = i3;
                    unsafe = unsafe2;
                    i4 = 0;
                } else {
                    int i18 = zzluVar.zzud[i17 + 1];
                    int i19 = (267386880 & i18) >>> 20;
                    long j = 1048575 & i18;
                    if (i19 <= 17) {
                        switch (i19) {
                            case 0:
                                i8 = i17;
                                if (i16 == 1) {
                                    com.google.android.gms.internal.drive.zznd.zza(t2, j, com.google.android.gms.internal.drive.zziy.zzc(bArr2, i3));
                                    i11 = i3 + 8;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 1:
                                i8 = i17;
                                if (i16 == 5) {
                                    com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t2, j, com.google.android.gms.internal.drive.zziy.zzd(bArr2, i3));
                                    i11 = i3 + 4;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 2:
                            case 3:
                                i8 = i17;
                                if (i16 == 0) {
                                    zzb = com.google.android.gms.internal.drive.zziy.zzb(bArr2, i3, zzizVar2);
                                    unsafe2.putLong(t, j, zzizVar2.zznl);
                                    i11 = zzb;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 4:
                            case 11:
                                i8 = i17;
                                if (i16 == 0) {
                                    i11 = com.google.android.gms.internal.drive.zziy.zza(bArr2, i3, zzizVar2);
                                    unsafe2.putInt(t2, j, zzizVar2.zznk);
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 5:
                            case 14:
                                if (i16 == 1) {
                                    i8 = i17;
                                    unsafe2.putLong(t, j, com.google.android.gms.internal.drive.zziy.zzb(bArr2, i3));
                                    i11 = i3 + 8;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 6:
                            case 13:
                                if (i16 == 5) {
                                    unsafe2.putInt(t2, j, com.google.android.gms.internal.drive.zziy.zza(bArr2, i3));
                                    i11 = i3 + 4;
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 7:
                                if (i16 == 0) {
                                    int zzb2 = com.google.android.gms.internal.drive.zziy.zzb(bArr2, i3, zzizVar2);
                                    com.google.android.gms.internal.drive.zznd.zza(t2, j, zzizVar2.zznl != 0);
                                    i11 = zzb2;
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 8:
                                if (i16 == 2) {
                                    if ((536870912 & i18) == 0) {
                                        i11 = com.google.android.gms.internal.drive.zziy.zzc(bArr2, i3, zzizVar2);
                                    } else {
                                        i11 = com.google.android.gms.internal.drive.zziy.zzd(bArr2, i3, zzizVar2);
                                    }
                                    unsafe2.putObject(t2, j, zzizVar2.zznm);
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 9:
                                if (i16 == 2) {
                                    i11 = com.google.android.gms.internal.drive.zziy.zza(zzluVar.zzap(i17), bArr2, i3, i9, zzizVar2);
                                    java.lang.Object object = unsafe2.getObject(t2, j);
                                    if (object == null) {
                                        unsafe2.putObject(t2, j, zzizVar2.zznm);
                                    } else {
                                        unsafe2.putObject(t2, j, com.google.android.gms.internal.drive.zzkm.zza(object, zzizVar2.zznm));
                                    }
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 10:
                                if (i16 == 2) {
                                    i11 = com.google.android.gms.internal.drive.zziy.zze(bArr2, i3, zzizVar2);
                                    unsafe2.putObject(t2, j, zzizVar2.zznm);
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 12:
                                i8 = i17;
                                if (i16 == 0) {
                                    i11 = com.google.android.gms.internal.drive.zziy.zza(bArr2, i3, zzizVar2);
                                    unsafe2.putInt(t2, j, zzizVar2.zznk);
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 15:
                                i8 = i17;
                                if (i16 == 0) {
                                    i11 = com.google.android.gms.internal.drive.zziy.zza(bArr2, i3, zzizVar2);
                                    unsafe2.putInt(t2, j, com.google.android.gms.internal.drive.zzjo.zzw(zzizVar2.zznk));
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 16:
                                if (i16 == 0) {
                                    zzb = com.google.android.gms.internal.drive.zziy.zzb(bArr2, i3, zzizVar2);
                                    i8 = i17;
                                    unsafe2.putLong(t, j, com.google.android.gms.internal.drive.zzjo.zzk(zzizVar2.zznl));
                                    i11 = zzb;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            default:
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                        }
                        i10 = -1;
                    } else if (i19 == 27) {
                        if (i16 == 2) {
                            com.google.android.gms.internal.drive.zzkp zzkpVar = (com.google.android.gms.internal.drive.zzkp) unsafe2.getObject(t2, j);
                            if (!zzkpVar.zzbo()) {
                                int size = zzkpVar.size();
                                zzkpVar = zzkpVar.zzr(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t2, j, zzkpVar);
                            }
                            i11 = com.google.android.gms.internal.drive.zziy.zza(zzluVar.zzap(i17), b, bArr, i3, i2, zzkpVar, zzizVar);
                            i12 = i15;
                            i13 = i17;
                            i10 = -1;
                        }
                        i4 = i17;
                        i5 = i15;
                        i6 = i3;
                        unsafe = unsafe2;
                    } else {
                        i4 = i17;
                        if (i19 <= 49) {
                            i5 = i15;
                            int i20 = i3;
                            unsafe = unsafe2;
                            i11 = zza((com.google.android.gms.internal.drive.zzlu<T>) t, bArr, i3, i2, b, i15, i16, i4, i18, i19, j, zzizVar);
                        } else {
                            i5 = i15;
                            i6 = i3;
                            unsafe = unsafe2;
                            if (i19 == 50) {
                                if (i16 == 2) {
                                    i11 = zza((com.google.android.gms.internal.drive.zzlu<T>) t, bArr, i6, i2, i4, j, zzizVar);
                                }
                                i7 = i6;
                            } else {
                                i11 = zza((com.google.android.gms.internal.drive.zzlu<T>) t, bArr, i6, i2, b, i5, i16, i18, i19, j, i4, zzizVar);
                            }
                        }
                        zzluVar = this;
                        t2 = t;
                        bArr2 = bArr;
                        i9 = i2;
                        zzizVar2 = zzizVar;
                        unsafe2 = unsafe;
                        i13 = i4;
                        i12 = i5;
                        i10 = -1;
                    }
                    i7 = i6;
                }
                i11 = com.google.android.gms.internal.drive.zziy.zza(b, bArr, i7, i2, zzo(t), zzizVar);
                zzluVar = this;
                t2 = t;
                bArr2 = bArr;
                i9 = i2;
                zzizVar2 = zzizVar;
                unsafe2 = unsafe;
                i13 = i4;
                i12 = i5;
                i10 = -1;
            }
            if (i11 != i9) {
                throw com.google.android.gms.internal.drive.zzkq.zzdm();
            }
            return;
        }
        zza((com.google.android.gms.internal.drive.zzlu<T>) t, bArr, i, i2, 0, zzizVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzd(T t) {
        int i;
        int i2 = this.zzun;
        while (true) {
            i = this.zzuo;
            if (i2 >= i) {
                break;
            }
            long zzas = zzas(this.zzum[i2]) & 1048575;
            java.lang.Object zzo = com.google.android.gms.internal.drive.zznd.zzo(t, zzas);
            if (zzo != null) {
                com.google.android.gms.internal.drive.zznd.zza(t, zzas, this.zzut.zzk(zzo));
            }
            i2++;
        }
        int length = this.zzum.length;
        while (i < length) {
            this.zzuq.zza(t, this.zzum[i]);
            i++;
        }
        this.zzur.zzd(t);
        if (this.zzui) {
            this.zzus.zzd(t);
        }
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, java.util.Map<K, V> map, com.google.android.gms.internal.drive.zzko zzkoVar, UB ub, com.google.android.gms.internal.drive.zzmx<UT, UB> zzmxVar) {
        com.google.android.gms.internal.drive.zzlj<?, ?> zzm = this.zzut.zzm(zzaq(i));
        java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (!zzkoVar.zzan(((java.lang.Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmxVar.zzez();
                }
                com.google.android.gms.internal.drive.zzjk zzu = com.google.android.gms.internal.drive.zzjc.zzu(com.google.android.gms.internal.drive.zzli.zza(zzm, next.getKey(), next.getValue()));
                try {
                    com.google.android.gms.internal.drive.zzli.zza(zzu.zzby(), zzm, next.getKey(), next.getValue());
                    zzmxVar.zza((com.google.android.gms.internal.drive.zzmx<UT, UB>) ub, i2, zzu.zzbx());
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.drive.zzmf] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.drive.zzmf] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean zzp(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzun; i4++) {
            int i5 = this.zzum[i4];
            int i6 = this.zzud[i5];
            int zzas = zzas(i5);
            if (this.zzuk) {
                i = 0;
            } else {
                int i7 = this.zzud[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i3 = zzuc.getInt(t, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & zzas) != 0 && !zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i3, i)) {
                return false;
            }
            int i9 = (267386880 & zzas) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i5, i3, i) && !zza(t, zzas, zzap(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza((com.google.android.gms.internal.drive.zzlu<T>) t, i6, i5) && !zza(t, zzas, zzap(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            java.util.Map<?, ?> zzi = this.zzut.zzi(com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575));
                            if (zzi.isEmpty()) {
                                continue;
                            } else if (this.zzut.zzm(zzaq(i5)).zztw.zzfj() == com.google.android.gms.internal.drive.zznr.MESSAGE) {
                                ?? r5 = 0;
                                for (java.lang.Object obj : zzi.values()) {
                                    r5 = r5;
                                    if (r5 == 0) {
                                        r5 = com.google.android.gms.internal.drive.zzmd.zzej().zzf(obj.getClass());
                                    }
                                    if (!r5.zzp(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                java.util.List list = (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(t, zzas & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zzap = zzap(i5);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zzap.zzp(list.get(i10))) {
                            return false;
                        }
                    }
                }
            }
        }
        return !this.zzui || this.zzus.zzb(t).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(java.lang.Object obj, int i, com.google.android.gms.internal.drive.zzmf zzmfVar) {
        return zzmfVar.zzp(com.google.android.gms.internal.drive.zznd.zzo(obj, i & 1048575));
    }

    private static void zza(int i, java.lang.Object obj, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            zznsVar.zza(i, (java.lang.String) obj);
        } else {
            zznsVar.zza(i, (com.google.android.gms.internal.drive.zzjc) obj);
        }
    }

    private final int zzas(int i) {
        return this.zzud[i + 1];
    }

    private final int zzat(int i) {
        return this.zzud[i + 2];
    }

    private static <T> double zze(T t, long j) {
        return ((java.lang.Double) com.google.android.gms.internal.drive.zznd.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((java.lang.Float) com.google.android.gms.internal.drive.zznd.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((java.lang.Integer) com.google.android.gms.internal.drive.zznd.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((java.lang.Long) com.google.android.gms.internal.drive.zznd.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((java.lang.Boolean) com.google.android.gms.internal.drive.zznd.zzo(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((com.google.android.gms.internal.drive.zzlu<T>) t, i) == zza((com.google.android.gms.internal.drive.zzlu<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzuk) {
            return zza((com.google.android.gms.internal.drive.zzlu<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzuk) {
            int zzas = zzas(i);
            long j = zzas & 1048575;
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    return com.google.android.gms.internal.drive.zznd.zzn(t, j) != 0.0d;
                case 1:
                    return com.google.android.gms.internal.drive.zznd.zzm(t, j) != 0.0f;
                case 2:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 3:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 4:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 5:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 6:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 7:
                    return com.google.android.gms.internal.drive.zznd.zzl(t, j);
                case 8:
                    java.lang.Object zzo = com.google.android.gms.internal.drive.zznd.zzo(t, j);
                    if (zzo instanceof java.lang.String) {
                        return !((java.lang.String) zzo).isEmpty();
                    }
                    if (zzo instanceof com.google.android.gms.internal.drive.zzjc) {
                        return !com.google.android.gms.internal.drive.zzjc.zznq.equals(zzo);
                    }
                    throw new java.lang.IllegalArgumentException();
                case 9:
                    return com.google.android.gms.internal.drive.zznd.zzo(t, j) != null;
                case 10:
                    return !com.google.android.gms.internal.drive.zzjc.zznq.equals(com.google.android.gms.internal.drive.zznd.zzo(t, j));
                case 11:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 12:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 13:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 14:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 15:
                    return com.google.android.gms.internal.drive.zznd.zzj(t, j) != 0;
                case 16:
                    return com.google.android.gms.internal.drive.zznd.zzk(t, j) != 0;
                case 17:
                    return com.google.android.gms.internal.drive.zznd.zzo(t, j) != null;
                default:
                    throw new java.lang.IllegalArgumentException();
            }
        }
        int zzat = zzat(i);
        return (com.google.android.gms.internal.drive.zznd.zzj(t, (long) (zzat & 1048575)) & (1 << (zzat >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzuk) {
            return;
        }
        int zzat = zzat(i);
        long j = zzat & 1048575;
        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, j, com.google.android.gms.internal.drive.zznd.zzj(t, j) | (1 << (zzat >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return com.google.android.gms.internal.drive.zznd.zzj(t, (long) (zzat(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        com.google.android.gms.internal.drive.zznd.zza((java.lang.Object) t, zzat(i2) & 1048575, i);
    }

    private final int zzau(int i) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, 0);
    }

    private final int zzp(int i, int i2) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, i2);
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzud.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzud[i4];
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
}
