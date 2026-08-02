package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class to0 implements s51 {

    /* JADX INFO: renamed from: n */
    public static final int[] f7541n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f7542o = gg1.m2044i();

    /* JADX INFO: renamed from: a */
    public final int[] f7543a;

    /* JADX INFO: renamed from: b */
    public final Object[] f7544b;

    /* JADX INFO: renamed from: c */
    public final int f7545c;

    /* JADX INFO: renamed from: d */
    public final int f7546d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0379k0 f7547e;

    /* JADX INFO: renamed from: f */
    public final boolean f7548f;

    /* JADX INFO: renamed from: g */
    public final int[] f7549g;

    /* JADX INFO: renamed from: h */
    public final int f7550h;

    /* JADX INFO: renamed from: i */
    public final int f7551i;

    /* JADX INFO: renamed from: j */
    public final as0 f7552j;

    /* JADX INFO: renamed from: k */
    public final pi0 f7553k;

    /* JADX INFO: renamed from: l */
    public final qf1 f7554l;

    /* JADX INFO: renamed from: m */
    public final cm0 f7555m;

    public to0(int[] iArr, Object[] objArr, int i, int i2, AbstractC0379k0 abstractC0379k0, int[] iArr2, int i3, int i4, as0 as0Var, pi0 pi0Var, qf1 qf1Var, C0820vy c0820vy, cm0 cm0Var) {
        this.f7543a = iArr;
        this.f7544b = objArr;
        this.f7545c = i;
        this.f7546d = i2;
        this.f7548f = abstractC0379k0 instanceof t70;
        this.f7549g = iArr2;
        this.f7550h = i3;
        this.f7551i = i4;
        this.f7552j = as0Var;
        this.f7553k = pi0Var;
        this.f7554l = qf1Var;
        this.f7547e = abstractC0379k0;
        this.f7555m = cm0Var;
    }

    /* JADX INFO: renamed from: F */
    public static Field m4794F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX INFO: renamed from: K */
    public static int m4795K(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m4796p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t70) {
            return ((t70) obj).m4755g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x037e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0398  */
    /* JADX INFO: renamed from: w */
    public static to0 m4797w(zz0 zz0Var, as0 as0Var, pi0 pi0Var, qf1 qf1Var, C0820vy c0820vy, cm0 cm0Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int i22;
        int i23;
        Field fieldM4794F;
        char cCharAt9;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldM4794F2;
        int i27;
        Object obj2;
        Field fieldM4794F3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        String str = zz0Var.f9990b;
        int length = str.length();
        int i32 = 55296;
        if (str.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i35 = iCharAt2 & 8191;
            int i36 = 13;
            while (true) {
                i31 = i34 + 1;
                cCharAt13 = str.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i31;
            }
            iCharAt2 = i35 | (cCharAt13 << i36);
            i34 = i31;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = f7541n;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt3 = str.charAt(i34);
            if (iCharAt3 >= 55296) {
                int i38 = iCharAt3 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    cCharAt8 = str.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                iCharAt3 = i38 | (cCharAt8 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int iCharAt4 = str.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt7 = str.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt4 = i41 | (cCharAt7 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt5 = str.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt6 = str.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt5 = i44 | (cCharAt6 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int iCharAt6 = str.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt5 = str.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt6 = i47 | (cCharAt5 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            iCharAt = str.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt4 = str.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt = i50 | (cCharAt4 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt7 = str.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt3 = str.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt7 = i53 | (cCharAt3 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt8 = str.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt2 = str.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt8 = i56 | (cCharAt2 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int iCharAt9 = str.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    cCharAt = str.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                iCharAt9 = i59 | (cCharAt << i60);
                i58 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = (iCharAt3 * 2) + iCharAt4;
            int i62 = iCharAt7;
            i2 = iCharAt5;
            i3 = i62;
            i4 = iCharAt3;
            i34 = i58;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = i61;
            i7 = iCharAt9;
        }
        Unsafe unsafe = f7542o;
        Object[] objArr = zz0Var.f9991c;
        Class<?> cls = zz0Var.f9989a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i63 = i7 + i3;
        int i64 = i63;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int iCharAt10 = str.charAt(i34);
            if (iCharAt10 >= i32) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                    length = i16;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i17 = i30;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt11 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i73 = iCharAt11 & 8191;
                int i74 = 13;
                while (true) {
                    i29 = i72 + 1;
                    cCharAt11 = str.charAt(i72);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i72 = i29;
                    c = 55296;
                }
                iCharAt11 = i73 | (cCharAt11 << i74);
                i72 = i29;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int[] iArr4 = iArr3;
            if (i75 >= 51) {
                int i77 = i72 + 1;
                int iCharAt12 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = 13;
                    while (true) {
                        i28 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i79;
                        i79 += 13;
                        i77 = i28;
                        c2 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i79);
                    i77 = i28;
                }
                int i80 = i75 - 51;
                int i81 = i77;
                if (i80 == 9 || i80 == 17) {
                    i25 = i6 + 1;
                    objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i80 == 12 && (AbstractC0024an.m278a(zz0Var.m6045a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i25 = i6 + 1;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                    }
                    i26 = iCharAt12 * 2;
                    obj = objArr3[i26];
                    if (obj instanceof Field) {
                        fieldM4794F2 = (Field) obj;
                    } else {
                        fieldM4794F2 = m4794F(cls, (String) obj);
                        objArr3[i26] = fieldM4794F2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM4794F2);
                    i27 = i26 + 1;
                    obj2 = objArr3[i27];
                    if (obj2 instanceof Field) {
                        fieldM4794F3 = (Field) obj2;
                    } else {
                        fieldM4794F3 = m4794F(cls, (String) obj2);
                        objArr3[i27] = fieldM4794F3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM4794F3);
                    int i82 = i4;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    i23 = iObjectFieldOffset3;
                    i18 = i82;
                    i22 = i6;
                    i20 = i81;
                    i21 = 0;
                    cls = cls;
                }
                i6 = i25;
                i26 = iCharAt12 * 2;
                obj = objArr3[i26];
                if (obj instanceof Field) {
                    fieldM4794F2 = (Field) obj;
                } else {
                    fieldM4794F2 = m4794F(cls, (String) obj);
                    objArr3[i26] = fieldM4794F2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM4794F2);
                i27 = i26 + 1;
                obj2 = objArr3[i27];
                if (obj2 instanceof Field) {
                    fieldM4794F3 = (Field) obj2;
                } else {
                    fieldM4794F3 = m4794F(cls, (String) obj2);
                    objArr3[i27] = fieldM4794F3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldM4794F3);
                int i83 = i4;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                i23 = iObjectFieldOffset5;
                i18 = i83;
                i22 = i6;
                i20 = i81;
                i21 = 0;
                cls = cls;
            } else {
                int i84 = i6 + 1;
                Field fieldM4794F4 = m4794F(cls, (String) objArr3[i6]);
                if (i75 == 9 || i75 == 17) {
                    i18 = i4;
                    objArr2[((i67 / 3) * 2) + 1] = fieldM4794F4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i18 = i4;
                        i24 = i6 + 2;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i18 = i4;
                        if (zz0Var.m6045a() == 1 || (iCharAt11 & 2048) != 0) {
                            i24 = i6 + 2;
                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4794F4);
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            int i85 = i72 + 1;
                            int iCharAt13 = str.charAt(i72);
                            if (iCharAt13 >= 55296) {
                                int i86 = iCharAt13 & 8191;
                                int i87 = 13;
                                while (true) {
                                    i20 = i85 + 1;
                                    cCharAt9 = str.charAt(i85);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i86 |= (cCharAt9 & 8191) << i87;
                                    i87 += 13;
                                    i85 = i20;
                                }
                                iCharAt13 = i86 | (cCharAt9 << i87);
                            } else {
                                i20 = i85;
                            }
                            int i88 = (iCharAt13 / 32) + (i18 * 2);
                            Object obj3 = objArr3[i88];
                            if (obj3 instanceof Field) {
                                fieldM4794F = (Field) obj3;
                            } else {
                                fieldM4794F = m4794F(cls, (String) obj3);
                                objArr3[i88] = fieldM4794F;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4794F);
                            i21 = iCharAt13 % 32;
                        }
                        if (i75 >= 18 || i75 > 49) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            iArr[i64] = iObjectFieldOffset;
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                            i64++;
                        }
                    } else {
                        if (i75 == 50) {
                            int i89 = i65 + 1;
                            iArr[i65] = i67;
                            int i90 = (i67 / 3) * 2;
                            int i91 = i6 + 2;
                            objArr2[i90] = objArr3[i84];
                            if ((iCharAt11 & 2048) != 0) {
                                i19 = i6 + 3;
                                objArr2[i90 + 1] = objArr3[i91];
                                i18 = i4;
                                i65 = i89;
                            } else {
                                i19 = i91;
                                i65 = i89;
                                i18 = i4;
                            }
                        } else {
                            i18 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4794F4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i72;
                            i21 = 0;
                        }
                        if (i75 >= 18) {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        } else {
                            i22 = i19;
                            i23 = iObjectFieldOffset;
                        }
                    }
                    i19 = i24;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4794F4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i72;
                        i21 = 0;
                    }
                    if (i75 >= 18) {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    } else {
                        i22 = i19;
                        i23 = iObjectFieldOffset;
                    }
                }
                i19 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4794F4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i72;
                    i21 = 0;
                }
                if (i75 >= 18) {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                } else {
                    i22 = i19;
                    i23 = iObjectFieldOffset;
                }
            }
            int i92 = i67 + 1;
            iArr4[i67] = i76;
            int i93 = i67 + 2;
            String str2 = str;
            iArr4[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i23;
            i67 += 3;
            iArr4[i93] = (i21 << 20) | iObjectFieldOffset2;
            cls = cls;
            objArr = objArr3;
            str = str2;
            length = i16;
            i4 = i18;
            i34 = i20;
            i32 = 55296;
            i6 = i22;
            iArr3 = iArr4;
        }
        return new to0(iArr3, objArr2, i2, i5, zz0Var.f9989a, iArr, i7, i63, as0Var, pi0Var, qf1Var, c0820vy, cm0Var);
    }

    /* JADX INFO: renamed from: x */
    public static long m4798x(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: y */
    public static int m4799y(Object obj, long j) {
        return ((Integer) gg1.f2728c.m1420h(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: z */
    public static long m4800z(Object obj, long j) {
        return ((Long) gg1.f2728c.m1420h(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: A */
    public final int m4801A(int i) {
        if (i < this.f7545c || i > this.f7546d) {
            return -1;
        }
        int[] iArr = this.f7543a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
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

    /* JADX INFO: renamed from: B */
    public final void m4802B(Object obj, long j, C0212fi c0212fi, s51 s51Var, C0746ty c0746ty) throws gf0 {
        int iMo696u;
        this.f7553k.getClass();
        ee0 ee0VarM3920a = pi0.m3920a(obj, j);
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) c0212fi.f2412e;
        int i = c0212fi.f2409b;
        if ((i & 7) != 3) {
            throw if0.m2597b();
        }
        do {
            t70 t70VarMo4478d = s51Var.mo4478d();
            c0212fi.m1827d(t70VarMo4478d, s51Var, c0746ty);
            s51Var.mo4476b(t70VarMo4478d);
            ((hy0) ee0VarM3920a).add(t70VarMo4478d);
            if (abstractC0175ei.mo678c() || c0212fi.f2411d != 0) {
                return;
            } else {
                iMo696u = abstractC0175ei.mo696u();
            }
        } while (iMo696u == i);
        c0212fi.f2411d = iMo696u;
    }

    /* JADX INFO: renamed from: C */
    public final void m4803C(Object obj, int i, C0212fi c0212fi, s51 s51Var, C0746ty c0746ty) throws if0 {
        int iMo696u;
        this.f7553k.getClass();
        ee0 ee0VarM3920a = pi0.m3920a(obj, i & 1048575);
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) c0212fi.f2412e;
        int i2 = c0212fi.f2409b;
        if ((i2 & 7) != 2) {
            throw if0.m2597b();
        }
        do {
            t70 t70VarMo4478d = s51Var.mo4478d();
            c0212fi.m1831f(t70VarMo4478d, s51Var, c0746ty);
            s51Var.mo4476b(t70VarMo4478d);
            ((hy0) ee0VarM3920a).add(t70VarMo4478d);
            if (abstractC0175ei.mo678c() || c0212fi.f2411d != 0) {
                return;
            } else {
                iMo696u = abstractC0175ei.mo696u();
            }
        } while (iMo696u == i2);
        c0212fi.f2411d = iMo696u;
    }

    /* JADX INFO: renamed from: D */
    public final void m4804D(int i, C0212fi c0212fi, Object obj) throws gf0, ff0 {
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) c0212fi.f2412e;
        if ((536870912 & i) != 0) {
            c0212fi.m1813S(2);
            gg1.m2050o(i & 1048575, obj, abstractC0175ei.mo695t());
        } else if (!this.f7548f) {
            gg1.m2050o(i & 1048575, obj, c0212fi.m1839j());
        } else {
            c0212fi.m1813S(2);
            gg1.m2050o(i & 1048575, obj, abstractC0175ei.mo694s());
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m4805E(int i, C0212fi c0212fi, Object obj) throws gf0, ff0 {
        boolean z = (536870912 & i) != 0;
        pi0 pi0Var = this.f7553k;
        if (z) {
            pi0Var.getClass();
            c0212fi.m1805K(pi0.m3920a(obj, i & 1048575), true);
        } else {
            pi0Var.getClass();
            c0212fi.m1805K(pi0.m3920a(obj, i & 1048575), false);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4806G(int i, Object obj) {
        int i2 = this.f7543a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        gg1.m2048m(obj, j, (1 << (i2 >>> 20)) | gg1.f2728c.m1418f(obj, j));
    }

    /* JADX INFO: renamed from: H */
    public final void m4807H(Object obj, int i, int i2) {
        gg1.m2048m(obj, this.f7543a[i2 + 2] & 1048575, i);
    }

    /* JADX INFO: renamed from: I */
    public final void m4808I(Object obj, int i, AbstractC0379k0 abstractC0379k0) {
        f7542o.putObject(obj, m4810L(i) & 1048575, abstractC0379k0);
        m4806G(i, obj);
    }

    /* JADX INFO: renamed from: J */
    public final void m4809J(Object obj, int i, int i2, AbstractC0379k0 abstractC0379k0) {
        f7542o.putObject(obj, m4810L(i2) & 1048575, abstractC0379k0);
        m4807H(obj, i, i2);
    }

    /* JADX INFO: renamed from: L */
    public final int m4810L(int i) {
        return this.f7543a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: M */
    public final void m4811M(Object obj, nu1 nu1Var) throws IOException {
        int i;
        int i2;
        boolean z;
        to0 to0Var = this;
        int[] iArr = to0Var.f7543a;
        int length = iArr.length;
        Unsafe unsafe = f7542o;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iM4810L = to0Var.m4810L(i5);
            int i7 = iArr[i5];
            int iM4795K = m4795K(iM4810L);
            if (iM4795K <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = iM4810L & i3;
            switch (iM4795K) {
                case 0:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        double dMo206d = gg1.f2728c.mo206d(obj, j);
                        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
                        c0360ji.getClass();
                        c0360ji.m2895t(i7, Double.doubleToRawLongBits(dMo206d));
                    }
                    break;
                case 1:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        float fMo207e = gg1.f2728c.mo207e(obj, j);
                        C0360ji c0360ji2 = (C0360ji) nu1Var.f5551k;
                        c0360ji2.getClass();
                        c0360ji2.m2893r(i7, Float.floatToRawIntBits(fMo207e));
                    }
                    to0Var = this;
                    break;
                case 2:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2879E(i7, unsafe.getLong(obj, j));
                    }
                    to0Var = this;
                    break;
                case 3:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2879E(i7, unsafe.getLong(obj, j));
                    }
                    to0Var = this;
                    break;
                case 4:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2897v(i7, unsafe.getInt(obj, j));
                    }
                    to0Var = this;
                    break;
                case 5:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2895t(i7, unsafe.getLong(obj, j));
                    }
                    to0Var = this;
                    break;
                case 6:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2893r(i7, unsafe.getInt(obj, j));
                    }
                    to0Var = this;
                    break;
                case 7:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2890o(i7, gg1.f2728c.mo205c(obj, j));
                    }
                    to0Var = this;
                    break;
                case 8:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C0360ji) nu1Var.f5551k).m2901z((String) object, i7);
                        } else {
                            ((C0360ji) nu1Var.f5551k).m2891p(i7, (C0799vd) object);
                        }
                    }
                    to0Var = this;
                    break;
                case 9:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2900y(i7, (AbstractC0379k0) unsafe.getObject(obj, j), to0Var.m4815m(i5));
                    }
                    break;
                case 10:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2891p(i7, (C0799vd) unsafe.getObject(obj, j));
                    }
                    to0Var = this;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2877C(i7, unsafe.getInt(obj, j));
                    }
                    to0Var = this;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2897v(i7, unsafe.getInt(obj, j));
                    }
                    to0Var = this;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2893r(i7, unsafe.getInt(obj, j));
                    }
                    to0Var = this;
                    break;
                case 14:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        ((C0360ji) nu1Var.f5551k).m2895t(i7, unsafe.getLong(obj, j));
                    }
                    to0Var = this;
                    break;
                case 15:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((C0360ji) nu1Var.f5551k).m2877C(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    to0Var = this;
                    break;
                case 16:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((C0360ji) nu1Var.f5551k).m2879E(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    to0Var = this;
                    break;
                case 17:
                    if (to0Var.m4817o(obj, i5, i4, i6, i)) {
                        nu1Var.m3594r(i7, unsafe.getObject(obj, j), to0Var.m4815m(i5));
                    }
                    break;
                case 18:
                    i4 = i4;
                    w51.m5270n(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 19:
                    i4 = i4;
                    w51.m5274r(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 20:
                    i4 = i4;
                    w51.m5276t(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 21:
                    i4 = i4;
                    w51.m5282z(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 22:
                    i4 = i4;
                    w51.m5275s(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 23:
                    i4 = i4;
                    w51.m5273q(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 24:
                    i4 = i4;
                    w51.m5272p(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 25:
                    i4 = i4;
                    w51.m5269m(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 26:
                    i2 = i4;
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = w51.f8434a;
                    if (list != null && !list.isEmpty()) {
                        nu1Var.getClass();
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            ((C0360ji) nu1Var.f5551k).m2901z((String) list.get(i12), i11);
                        }
                    }
                    i4 = i2;
                    break;
                case 27:
                    i2 = i4;
                    int i13 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    s51 s51VarM4815m = to0Var.m4815m(i5);
                    Class cls2 = w51.f8434a;
                    if (list2 != null && !list2.isEmpty()) {
                        nu1Var.getClass();
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            ((C0360ji) nu1Var.f5551k).m2900y(i13, (AbstractC0379k0) list2.get(i14), s51VarM4815m);
                        }
                    }
                    i4 = i2;
                    break;
                case 28:
                    i2 = i4;
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = w51.f8434a;
                    if (list3 != null && !list3.isEmpty()) {
                        nu1Var.getClass();
                        for (int i16 = 0; i16 < list3.size(); i16++) {
                            ((C0360ji) nu1Var.f5551k).m2891p(i15, (C0799vd) list3.get(i16));
                        }
                    }
                    i4 = i2;
                    break;
                case 29:
                    z = false;
                    w51.m5281y(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 30:
                    z = false;
                    w51.m5271o(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 31:
                    z = false;
                    w51.m5277u(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 32:
                    z = false;
                    w51.m5278v(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 33:
                    z = false;
                    w51.m5279w(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 34:
                    z = false;
                    w51.m5280x(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, false);
                    i4 = i4;
                    break;
                case 35:
                    i2 = i4;
                    w51.m5270n(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 36:
                    i2 = i4;
                    w51.m5274r(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 37:
                    i2 = i4;
                    w51.m5276t(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 38:
                    i2 = i4;
                    w51.m5282z(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 39:
                    i2 = i4;
                    w51.m5275s(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 40:
                    i2 = i4;
                    w51.m5273q(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 41:
                    i2 = i4;
                    w51.m5272p(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 42:
                    i2 = i4;
                    w51.m5269m(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 43:
                    i2 = i4;
                    w51.m5281y(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 44:
                    i2 = i4;
                    w51.m5271o(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 45:
                    i2 = i4;
                    w51.m5277u(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 46:
                    i2 = i4;
                    w51.m5278v(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 47:
                    i2 = i4;
                    w51.m5279w(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 48:
                    i2 = i4;
                    w51.m5280x(iArr[i5], (List) unsafe.getObject(obj, j), nu1Var, true);
                    i4 = i2;
                    break;
                case 49:
                    i2 = i4;
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    s51 s51VarM4815m2 = to0Var.m4815m(i5);
                    Class cls4 = w51.f8434a;
                    if (list4 != null && !list4.isEmpty()) {
                        nu1Var.getClass();
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            nu1Var.m3594r(i17, list4.get(i18), s51VarM4815m2);
                        }
                    }
                    i4 = i2;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i19 = 2;
                        Object obj2 = to0Var.f7544b[(i5 / 3) * 2];
                        to0Var.f7555m.getClass();
                        qd0 qd0Var = ((yl0) obj2).f9388a;
                        C0360ji c0360ji3 = (C0360ji) nu1Var.f5551k;
                        c0360ji3.getClass();
                        for (Map.Entry entry : ((am0) object2).entrySet()) {
                            c0360ji3.m2876B(i7, i19);
                            c0360ji3.m2878D(yl0.m5812a(qd0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0969zz.m6043b(c0360ji3, (kk1) qd0Var.f6471k, 1, key);
                            i19 = 2;
                            C0969zz.m6043b(c0360ji3, (kk1) qd0Var.f6472l, 2, value);
                            i4 = i4;
                        }
                    }
                    i2 = i4;
                    i4 = i2;
                    break;
                case 51:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        double dDoubleValue = ((Double) gg1.f2728c.m1420h(obj, j)).doubleValue();
                        C0360ji c0360ji4 = (C0360ji) nu1Var.f5551k;
                        c0360ji4.getClass();
                        c0360ji4.m2895t(i7, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        float fFloatValue = ((Float) gg1.f2728c.m1420h(obj, j)).floatValue();
                        C0360ji c0360ji5 = (C0360ji) nu1Var.f5551k;
                        c0360ji5.getClass();
                        c0360ji5.m2893r(i7, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2879E(i7, m4800z(obj, j));
                    }
                    break;
                case 54:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2879E(i7, m4800z(obj, j));
                    }
                    break;
                case 55:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2897v(i7, m4799y(obj, j));
                    }
                    break;
                case 56:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2895t(i7, m4800z(obj, j));
                    }
                    break;
                case 57:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2893r(i7, m4799y(obj, j));
                    }
                    break;
                case 58:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2890o(i7, ((Boolean) gg1.f2728c.m1420h(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((C0360ji) nu1Var.f5551k).m2901z((String) object3, i7);
                        } else {
                            ((C0360ji) nu1Var.f5551k).m2891p(i7, (C0799vd) object3);
                        }
                    }
                    break;
                case 60:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2900y(i7, (AbstractC0379k0) unsafe.getObject(obj, j), to0Var.m4815m(i5));
                    }
                    break;
                case 61:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2891p(i7, (C0799vd) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2877C(i7, m4799y(obj, j));
                    }
                    break;
                case 63:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2897v(i7, m4799y(obj, j));
                    }
                    break;
                case 64:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2893r(i7, m4799y(obj, j));
                    }
                    break;
                case 65:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        ((C0360ji) nu1Var.f5551k).m2895t(i7, m4800z(obj, j));
                    }
                    break;
                case 66:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        int iM4799y = m4799y(obj, j);
                        ((C0360ji) nu1Var.f5551k).m2877C(i7, (iM4799y >> 31) ^ (iM4799y << 1));
                    }
                    break;
                case 67:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        long jM4800z = m4800z(obj, j);
                        ((C0360ji) nu1Var.f5551k).m2879E(i7, (jM4800z << 1) ^ (jM4800z >> 63));
                    }
                    break;
                case 68:
                    if (to0Var.m4818q(obj, i7, i5)) {
                        nu1Var.m3594r(i7, unsafe.getObject(obj, j), to0Var.m4815m(i5));
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        to0Var.f7554l.getClass();
        ((t70) obj).unknownFields.m3690d(nu1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // p000.s51
    /* JADX INFO: renamed from: a */
    public final void mo4475a(Object obj, Object obj2) {
        Object obj3;
        if (!m4796p(obj)) {
            dd0.m1167m(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f7543a;
            if (i >= iArr.length) {
                w51.m5267k(this.f7554l, obj, obj2);
                return;
            }
            int iM4810L = m4810L(i);
            long j = 1048575 & iM4810L;
            int i2 = iArr[i];
            switch (m4795K(iM4810L)) {
                case 0:
                    if (!m4816n(i, obj2)) {
                        obj3 = obj;
                    } else {
                        eg1 eg1Var = gg1.f2728c;
                        obj3 = obj;
                        eg1Var.mo210l(obj3, j, eg1Var.mo206d(obj2, j));
                        m4806G(i, obj3);
                    }
                    break;
                case 1:
                    if (m4816n(i, obj2)) {
                        eg1 eg1Var2 = gg1.f2728c;
                        eg1Var2.mo211m(obj, j, eg1Var2.mo207e(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m4816n(i, obj2)) {
                        gg1.m2049n(obj, j, gg1.f2728c.m1419g(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m4816n(i, obj2)) {
                        gg1.m2049n(obj, j, gg1.f2728c.m1419g(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m4816n(i, obj2)) {
                        gg1.m2048m(obj, j, gg1.f2728c.m1418f(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m4816n(i, obj2)) {
                        gg1.m2049n(obj, j, gg1.f2728c.m1419g(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m4816n(i, obj2)) {
                        gg1.m2048m(obj, j, gg1.f2728c.m1418f(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m4816n(i, obj2)) {
                        eg1 eg1Var3 = gg1.f2728c;
                        eg1Var3.mo208j(obj, j, eg1Var3.mo205c(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m4816n(i, obj2)) {
                        gg1.m2050o(j, obj, gg1.f2728c.m1420h(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m4820s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m4816n(i, obj2)) {
                        gg1.m2050o(j, obj, gg1.f2728c.m1420h(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (m4816n(i, obj2)) {
                        gg1.m2048m(obj, j, gg1.f2728c.m1418f(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (m4816n(i, obj2)) {
                        gg1.m2048m(obj, j, gg1.f2728c.m1418f(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (m4816n(i, obj2)) {
                        gg1.m2048m(obj, j, gg1.f2728c.m1418f(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m4816n(i, obj2)) {
                        gg1.m2049n(obj, j, gg1.f2728c.m1419g(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m4816n(i, obj2)) {
                        gg1.m2048m(obj, j, gg1.f2728c.m1418f(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m4816n(i, obj2)) {
                        gg1.m2049n(obj, j, gg1.f2728c.m1419g(obj2, j));
                        m4806G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m4820s(i, obj, obj2);
                    obj3 = obj;
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
                    this.f7553k.getClass();
                    eg1 eg1Var4 = gg1.f2728c;
                    ee0 ee0VarM2352d = (ee0) eg1Var4.m1420h(obj, j);
                    ee0 ee0Var = (ee0) eg1Var4.m1420h(obj2, j);
                    int i3 = ((hy0) ee0VarM2352d).f3361l;
                    int i4 = ((hy0) ee0Var).f3361l;
                    if (i3 > 0 && i4 > 0) {
                        if (!((hy0) ee0VarM2352d).f3359j) {
                            ee0VarM2352d = ((hy0) ee0VarM2352d).m2352d(i4 + i3);
                        }
                        ((hy0) ee0VarM2352d).addAll(ee0Var);
                    }
                    if (i3 > 0) {
                        ee0Var = ee0VarM2352d;
                    }
                    gg1.m2050o(j, obj, ee0Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = w51.f8434a;
                    eg1 eg1Var5 = gg1.f2728c;
                    Object objM1420h = eg1Var5.m1420h(obj, j);
                    Object objM1420h2 = eg1Var5.m1420h(obj2, j);
                    this.f7555m.getClass();
                    gg1.m2050o(j, obj, cm0.m974a(objM1420h, objM1420h2));
                    obj3 = obj;
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
                    if (m4818q(obj2, i2, i)) {
                        gg1.m2050o(j, obj, gg1.f2728c.m1420h(obj2, j));
                        m4807H(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m4821t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m4818q(obj2, i2, i)) {
                        gg1.m2050o(j, obj, gg1.f2728c.m1420h(obj2, j));
                        m4807H(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m4821t(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // p000.s51
    /* JADX INFO: renamed from: b */
    public final void mo4476b(Object obj) {
        if (m4796p(obj)) {
            if (obj instanceof t70) {
                t70 t70Var = (t70) obj;
                t70Var.m4758k(Integer.MAX_VALUE);
                t70Var.memoizedHashCode = 0;
                t70Var.m4756h();
            }
            int[] iArr = this.f7543a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM4810L = m4810L(i);
                long j = 1048575 & iM4810L;
                int iM4795K = m4795K(iM4810L);
                if (iM4795K != 9) {
                    if (iM4795K != 60 && iM4795K != 68) {
                        switch (iM4795K) {
                            case 17:
                                if (m4816n(i, obj)) {
                                    m4815m(i).mo4476b(f7542o.getObject(obj, j));
                                }
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
                                this.f7553k.getClass();
                                hy0 hy0Var = (hy0) ((ee0) gg1.f2728c.m1420h(obj, j));
                                if (hy0Var.f3359j) {
                                    hy0Var.f3359j = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f7542o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f7555m.getClass();
                                    ((am0) object).f248j = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m4818q(obj, iArr[i], i)) {
                        m4815m(i).mo4476b(f7542o.getObject(obj, j));
                    }
                } else if (m4816n(i, obj)) {
                    m4815m(i).mo4476b(f7542o.getObject(obj, j));
                }
            }
            this.f7554l.getClass();
            of1 of1Var = ((t70) obj).unknownFields;
            if (of1Var.f5722e) {
                of1Var.f5722e = false;
            }
        }
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: c */
    public final boolean mo4477c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f7550h) {
            int i6 = this.f7549g[i5];
            int[] iArr = this.f7543a;
            int i7 = iArr[i6];
            int iM4810L = m4810L(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f7542o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iM4810L) == 0 || m4817o(obj, i6, i, i2, i10)) {
                int iM4795K = m4795K(iM4810L);
                if (iM4795K == 9 || iM4795K == 17) {
                    if (m4817o(obj, i6, i, i2, i10)) {
                        if (!m4815m(i6).mo4477c(gg1.f2728c.m1420h(obj, iM4810L & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iM4795K != 27) {
                        if (iM4795K == 60 || iM4795K == 68) {
                            if (m4818q(obj, i7, i6)) {
                                if (!m4815m(i6).mo4477c(gg1.f2728c.m1420h(obj, iM4810L & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iM4795K != 49) {
                            if (iM4795K != 50) {
                                continue;
                            } else {
                                Object objM1420h = gg1.f2728c.m1420h(obj, iM4810L & 1048575);
                                this.f7555m.getClass();
                                am0 am0Var = (am0) objM1420h;
                                if (am0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((kk1) ((yl0) this.f7544b[(i6 / 3) * 2]).f9388a.f6472l).f4408j != mk1.f5069r) {
                                        continue;
                                    } else {
                                        s51 s51VarM1907a = null;
                                        for (Object obj2 : am0Var.values()) {
                                            if (s51VarM1907a == null) {
                                                s51VarM1907a = fy0.f2536c.m1907a(obj2.getClass());
                                            }
                                            if (!s51VarM1907a.mo4477c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) gg1.f2728c.m1420h(obj, iM4810L & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        s51 s51VarM4815m = m4815m(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (s51VarM4815m.mo4477c(list.get(i12))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: d */
    public final t70 mo4478d() {
        this.f7552j.getClass();
        return ((t70) this.f7547e).m4757i();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.s51
    /* JADX INFO: renamed from: e */
    public final int mo4479e(t70 t70Var) {
        int i;
        int iM2032b;
        int i2;
        int[] iArr = this.f7543a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM4810L = m4810L(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM4810L;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m4795K(iM4810L)) {
                case 0:
                    i = i3 * 53;
                    iM2032b = ge0.m2032b(Double.doubleToLongBits(gg1.f2728c.mo206d(t70Var, j)));
                    i3 = iM2032b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM2032b = Float.floatToIntBits(gg1.f2728c.mo207e(t70Var, j));
                    i3 = iM2032b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM2032b = ge0.m2032b(gg1.f2728c.m1419g(t70Var, j));
                    i3 = iM2032b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM2032b = ge0.m2032b(gg1.f2728c.m1419g(t70Var, j));
                    i3 = iM2032b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iM2032b = gg1.f2728c.m1418f(t70Var, j);
                    i3 = iM2032b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iM2032b = ge0.m2032b(gg1.f2728c.m1419g(t70Var, j));
                    i3 = iM2032b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iM2032b = gg1.f2728c.m1418f(t70Var, j);
                    i3 = iM2032b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zMo205c = gg1.f2728c.mo205c(t70Var, j);
                    Charset charset = ge0.f2710a;
                    if (zMo205c) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iM2032b = ((String) gg1.f2728c.m1420h(t70Var, j)).hashCode();
                    i3 = iM2032b + i;
                    break;
                case 9:
                    Object objM1420h = gg1.f2728c.m1420h(t70Var, j);
                    if (objM1420h != null) {
                        iHashCode = objM1420h.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM2032b = gg1.f2728c.m1420h(t70Var, j).hashCode();
                    i3 = iM2032b + i;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    i = i3 * 53;
                    iM2032b = gg1.f2728c.m1418f(t70Var, j);
                    i3 = iM2032b + i;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    i = i3 * 53;
                    iM2032b = gg1.f2728c.m1418f(t70Var, j);
                    i3 = iM2032b + i;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    i = i3 * 53;
                    iM2032b = gg1.f2728c.m1418f(t70Var, j);
                    i3 = iM2032b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM2032b = ge0.m2032b(gg1.f2728c.m1419g(t70Var, j));
                    i3 = iM2032b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM2032b = gg1.f2728c.m1418f(t70Var, j);
                    i3 = iM2032b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM2032b = ge0.m2032b(gg1.f2728c.m1419g(t70Var, j));
                    i3 = iM2032b + i;
                    break;
                case 17:
                    Object objM1420h2 = gg1.f2728c.m1420h(t70Var, j);
                    if (objM1420h2 != null) {
                        iHashCode = objM1420h2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
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
                    i = i3 * 53;
                    iM2032b = gg1.f2728c.m1420h(t70Var, j).hashCode();
                    i3 = iM2032b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM2032b = gg1.f2728c.m1420h(t70Var, j).hashCode();
                    i3 = iM2032b + i;
                    break;
                case 51:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = ge0.m2032b(Double.doubleToLongBits(((Double) gg1.f2728c.m1420h(t70Var, j)).doubleValue()));
                        i3 = iM2032b + i;
                    }
                    break;
                case 52:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = Float.floatToIntBits(((Float) gg1.f2728c.m1420h(t70Var, j)).floatValue());
                        i3 = iM2032b + i;
                    }
                    break;
                case 53:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = ge0.m2032b(m4800z(t70Var, j));
                        i3 = iM2032b + i;
                    }
                    break;
                case 54:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = ge0.m2032b(m4800z(t70Var, j));
                        i3 = iM2032b + i;
                    }
                    break;
                case 55:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = m4799y(t70Var, j);
                        i3 = iM2032b + i;
                    }
                    break;
                case 56:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = ge0.m2032b(m4800z(t70Var, j));
                        i3 = iM2032b + i;
                    }
                    break;
                case 57:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = m4799y(t70Var, j);
                        i3 = iM2032b + i;
                    }
                    break;
                case 58:
                    if (m4818q(t70Var, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) gg1.f2728c.m1420h(t70Var, j)).booleanValue();
                        Charset charset2 = ge0.f2710a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = ((String) gg1.f2728c.m1420h(t70Var, j)).hashCode();
                        i3 = iM2032b + i;
                    }
                    break;
                case 60:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = gg1.f2728c.m1420h(t70Var, j).hashCode();
                        i3 = iM2032b + i;
                    }
                    break;
                case 61:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = gg1.f2728c.m1420h(t70Var, j).hashCode();
                        i3 = iM2032b + i;
                    }
                    break;
                case 62:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = m4799y(t70Var, j);
                        i3 = iM2032b + i;
                    }
                    break;
                case 63:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = m4799y(t70Var, j);
                        i3 = iM2032b + i;
                    }
                    break;
                case 64:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = m4799y(t70Var, j);
                        i3 = iM2032b + i;
                    }
                    break;
                case 65:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = ge0.m2032b(m4800z(t70Var, j));
                        i3 = iM2032b + i;
                    }
                    break;
                case 66:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = m4799y(t70Var, j);
                        i3 = iM2032b + i;
                    }
                    break;
                case 67:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = ge0.m2032b(m4800z(t70Var, j));
                        i3 = iM2032b + i;
                    }
                    break;
                case 68:
                    if (m4818q(t70Var, i5, i4)) {
                        i = i3 * 53;
                        iM2032b = gg1.f2728c.m1420h(t70Var, j).hashCode();
                        i3 = iM2032b + i;
                    }
                    break;
            }
        }
        this.f7554l.getClass();
        return t70Var.unknownFields.hashCode() + (i3 * 53);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19221. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p000.s51
    /* JADX INFO: renamed from: f */
    public final void mo4480f(java.lang.Object r19, p000.C0212fi r20, p000.C0746ty r21) {
        /*
            Method dump skipped, instruction units count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.to0.mo4480f(java.lang.Object, fi, ty):void");
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: g */
    public final void mo4481g(Object obj, nu1 nu1Var) throws IOException {
        nu1Var.getClass();
        m4811M(obj, nu1Var);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x038c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    @Override // p000.s51
    /* JADX INFO: renamed from: h */
    public final int mo4482h(t70 t70Var) {
        int i;
        int iM2872h;
        int iM2872h2;
        int iM2872h3;
        int iM2874j;
        int iM2872h4;
        int iM2874j2;
        int iM2872h5;
        int iM2872h6;
        int iM2870f;
        int iM2872h7;
        int iMo2975a;
        int iM5259c;
        int iM2872h8;
        int size;
        int iM5265i;
        int iM2872h9;
        int iM2872h10;
        int size2;
        int iM2872h11;
        int iM2873i;
        int iM2874j3;
        int iMo2975a2;
        int iM2872h12;
        int iM2873i2;
        to0 to0Var = this;
        t70 t70Var2 = t70Var;
        Unsafe unsafe = f7542o;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int iM2870f2 = 0;
        while (true) {
            int[] iArr = to0Var.f7543a;
            if (i3 >= iArr.length) {
                to0Var.f7554l.getClass();
                return t70Var2.unknownFields.m3688b() + iM2870f2;
            }
            int iM4810L = to0Var.m4810L(i3);
            int iM4795K = m4795K(iM4810L);
            int i5 = iArr[i3];
            int i6 = iArr[i3 + 2];
            int i7 = i6 & 1048575;
            if (iM4795K <= 17) {
                if (i7 != i2) {
                    i4 = i7 == 1048575 ? 0 : unsafe.getInt(t70Var2, i7);
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            long j = iM4810L & 1048575;
            if (iM4795K >= b00.f661k.f665j) {
                int i8 = b00.f662l.f665j;
            }
            switch (iM4795K) {
                case 0:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        iM2872h = C0360ji.m2872h(i5);
                        iM5259c = iM2872h + 8;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 1:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        iM2872h2 = C0360ji.m2872h(i5);
                        iM2872h6 = iM2872h2 + 4;
                        iM2870f2 += iM2872h6;
                    }
                    to0Var = this;
                    t70Var2 = t70Var;
                    break;
                case 2:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        long j2 = unsafe.getLong(t70Var2, j);
                        iM2872h3 = C0360ji.m2872h(i5);
                        iM2874j = C0360ji.m2874j(j2);
                        iM2870f2 += iM2874j + iM2872h3;
                    }
                    to0Var = this;
                    break;
                case 3:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        long j3 = unsafe.getLong(t70Var2, j);
                        iM2872h3 = C0360ji.m2872h(i5);
                        iM2874j = C0360ji.m2874j(j3);
                        iM2870f2 += iM2874j + iM2872h3;
                    }
                    to0Var = this;
                    break;
                case 4:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        int i9 = unsafe.getInt(t70Var2, j);
                        iM2872h4 = C0360ji.m2872h(i5);
                        iM2874j2 = C0360ji.m2874j(i9);
                        iM2870f = iM2874j2 + iM2872h4;
                        iM2870f2 += iM2870f;
                    }
                    to0Var = this;
                    break;
                case 5:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        iM2872h5 = C0360ji.m2872h(i5);
                        iM2872h6 = iM2872h5 + 8;
                        iM2870f2 += iM2872h6;
                    }
                    to0Var = this;
                    t70Var2 = t70Var;
                    break;
                case 6:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        iM2872h2 = C0360ji.m2872h(i5);
                        iM2872h6 = iM2872h2 + 4;
                        iM2870f2 += iM2872h6;
                    }
                    to0Var = this;
                    t70Var2 = t70Var;
                    break;
                case 7:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        iM2872h6 = C0360ji.m2872h(i5) + 1;
                        iM2870f2 += iM2872h6;
                    }
                    to0Var = this;
                    t70Var2 = t70Var;
                    break;
                case 8:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        Object object = unsafe.getObject(t70Var2, j);
                        iM2870f2 = (object instanceof C0799vd ? C0360ji.m2870f(i5, (C0799vd) object) : C0360ji.m2871g((String) object) + C0360ji.m2872h(i5)) + iM2870f2;
                    }
                    to0Var = this;
                    break;
                case 9:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        Object object2 = unsafe.getObject(t70Var2, j);
                        s51 s51VarM4815m = to0Var.m4815m(i3);
                        Class cls = w51.f8434a;
                        int iM2872h13 = C0360ji.m2872h(i5);
                        int iMo2975a3 = ((AbstractC0379k0) object2).mo2975a(s51VarM4815m);
                        iM2870f2 += C0360ji.m2873i(iMo2975a3) + iMo2975a3 + iM2872h13;
                    }
                    break;
                case 10:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        iM2870f = C0360ji.m2870f(i5, (C0799vd) unsafe.getObject(t70Var2, j));
                        iM2870f2 += iM2870f;
                    }
                    to0Var = this;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        int i10 = unsafe.getInt(t70Var2, j);
                        iM2872h4 = C0360ji.m2872h(i5);
                        iM2874j2 = C0360ji.m2873i(i10);
                        iM2870f = iM2874j2 + iM2872h4;
                        iM2870f2 += iM2870f;
                    }
                    to0Var = this;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        int i11 = unsafe.getInt(t70Var2, j);
                        iM2872h4 = C0360ji.m2872h(i5);
                        iM2874j2 = C0360ji.m2874j(i11);
                        iM2870f = iM2874j2 + iM2872h4;
                        iM2870f2 += iM2870f;
                    }
                    to0Var = this;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        iM2872h2 = C0360ji.m2872h(i5);
                        iM2872h6 = iM2872h2 + 4;
                        iM2870f2 += iM2872h6;
                    }
                    to0Var = this;
                    t70Var2 = t70Var;
                    break;
                case 14:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        iM2872h5 = C0360ji.m2872h(i5);
                        iM2872h6 = iM2872h5 + 8;
                        iM2870f2 += iM2872h6;
                    }
                    to0Var = this;
                    t70Var2 = t70Var;
                    break;
                case 15:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        int i12 = unsafe.getInt(t70Var2, j);
                        iM2872h4 = C0360ji.m2872h(i5);
                        iM2874j2 = C0360ji.m2873i((i12 >> 31) ^ (i12 << 1));
                        iM2870f = iM2874j2 + iM2872h4;
                        iM2870f2 += iM2870f;
                    }
                    to0Var = this;
                    break;
                case 16:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        long j4 = unsafe.getLong(t70Var2, j);
                        iM2872h3 = C0360ji.m2872h(i5);
                        iM2874j = C0360ji.m2874j((j4 << 1) ^ (j4 >> 63));
                        iM2870f2 += iM2874j + iM2872h3;
                    }
                    to0Var = this;
                    break;
                case 17:
                    if (to0Var.m4817o(t70Var2, i3, i2, i4, i)) {
                        AbstractC0379k0 abstractC0379k0 = (AbstractC0379k0) unsafe.getObject(t70Var2, j);
                        s51 s51VarM4815m2 = to0Var.m4815m(i3);
                        iM2872h7 = C0360ji.m2872h(i5) * 2;
                        iMo2975a = abstractC0379k0.mo2975a(s51VarM4815m2);
                        iM5259c = iMo2975a + iM2872h7;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 18:
                    iM5259c = w51.m5259c(i5, (List) unsafe.getObject(t70Var2, j));
                    iM2870f2 += iM5259c;
                    break;
                case 19:
                    iM5259c = w51.m5258b(i5, (List) unsafe.getObject(t70Var2, j));
                    iM2870f2 += iM5259c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(t70Var2, j);
                    Class cls2 = w51.f8434a;
                    if (list.size() == 0) {
                        iM2872h8 = 0;
                    } else {
                        iM2872h8 = (C0360ji.m2872h(i5) * list.size()) + w51.m5261e(list);
                    }
                    iM2870f2 += iM2872h8;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(t70Var2, j);
                    Class cls3 = w51.f8434a;
                    size = list2.size();
                    if (size == 0) {
                        iM2872h8 = 0;
                    } else {
                        iM5265i = w51.m5265i(list2);
                        iM2872h9 = C0360ji.m2872h(i5);
                        iM2872h8 = (iM2872h9 * size) + iM5265i;
                    }
                    iM2870f2 += iM2872h8;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(t70Var2, j);
                    Class cls4 = w51.f8434a;
                    size = list3.size();
                    if (size == 0) {
                        iM2872h8 = 0;
                    } else {
                        iM5265i = w51.m5260d(list3);
                        iM2872h9 = C0360ji.m2872h(i5);
                        iM2872h8 = (iM2872h9 * size) + iM5265i;
                    }
                    iM2870f2 += iM2872h8;
                    break;
                case 23:
                    iM5259c = w51.m5259c(i5, (List) unsafe.getObject(t70Var2, j));
                    iM2870f2 += iM5259c;
                    break;
                case 24:
                    iM5259c = w51.m5258b(i5, (List) unsafe.getObject(t70Var2, j));
                    iM2870f2 += iM5259c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(t70Var2, j);
                    Class cls5 = w51.f8434a;
                    int size3 = list4.size();
                    iM2870f2 += size3 == 0 ? 0 : (C0360ji.m2872h(i5) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(t70Var2, j);
                    Class cls6 = w51.f8434a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM2872h8 = 0;
                    } else {
                        iM2872h8 = C0360ji.m2872h(i5) * size4;
                        for (int i13 = 0; i13 < size4; i13++) {
                            Object obj = list5.get(i13);
                            if (obj instanceof C0799vd) {
                                int size5 = ((C0799vd) obj).size();
                                iM2872h8 = C0360ji.m2873i(size5) + size5 + iM2872h8;
                            } else {
                                iM2872h8 = C0360ji.m2871g((String) obj) + iM2872h8;
                            }
                        }
                    }
                    iM2870f2 += iM2872h8;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(t70Var2, j);
                    s51 s51VarM4815m3 = to0Var.m4815m(i3);
                    Class cls7 = w51.f8434a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iM2872h10 = 0;
                    } else {
                        iM2872h10 = C0360ji.m2872h(i5) * size6;
                        for (int i14 = 0; i14 < size6; i14++) {
                            int iMo2975a4 = ((AbstractC0379k0) list6.get(i14)).mo2975a(s51VarM4815m3);
                            iM2872h10 += C0360ji.m2873i(iMo2975a4) + iMo2975a4;
                        }
                    }
                    iM2870f2 += iM2872h10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(t70Var2, j);
                    Class cls8 = w51.f8434a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iM2872h8 = 0;
                    } else {
                        iM2872h8 = C0360ji.m2872h(i5) * size7;
                        for (int i15 = 0; i15 < list7.size(); i15++) {
                            int size8 = ((C0799vd) list7.get(i15)).size();
                            iM2872h8 += C0360ji.m2873i(size8) + size8;
                        }
                    }
                    iM2870f2 += iM2872h8;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(t70Var2, j);
                    Class cls9 = w51.f8434a;
                    size = list8.size();
                    if (size == 0) {
                        iM2872h8 = 0;
                    } else {
                        iM5265i = w51.m5264h(list8);
                        iM2872h9 = C0360ji.m2872h(i5);
                        iM2872h8 = (iM2872h9 * size) + iM5265i;
                    }
                    iM2870f2 += iM2872h8;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(t70Var2, j);
                    Class cls10 = w51.f8434a;
                    size = list9.size();
                    if (size == 0) {
                        iM2872h8 = 0;
                    } else {
                        iM5265i = w51.m5257a(list9);
                        iM2872h9 = C0360ji.m2872h(i5);
                        iM2872h8 = (iM2872h9 * size) + iM5265i;
                    }
                    iM2870f2 += iM2872h8;
                    break;
                case 31:
                    iM5259c = w51.m5258b(i5, (List) unsafe.getObject(t70Var2, j));
                    iM2870f2 += iM5259c;
                    break;
                case 32:
                    iM5259c = w51.m5259c(i5, (List) unsafe.getObject(t70Var2, j));
                    iM2870f2 += iM5259c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(t70Var2, j);
                    Class cls11 = w51.f8434a;
                    size = list10.size();
                    if (size == 0) {
                        iM2872h8 = 0;
                    } else {
                        iM5265i = w51.m5262f(list10);
                        iM2872h9 = C0360ji.m2872h(i5);
                        iM2872h8 = (iM2872h9 * size) + iM5265i;
                    }
                    iM2870f2 += iM2872h8;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(t70Var2, j);
                    Class cls12 = w51.f8434a;
                    size = list11.size();
                    if (size == 0) {
                        iM2872h8 = 0;
                    } else {
                        iM5265i = w51.m5263g(list11);
                        iM2872h9 = C0360ji.m2872h(i5);
                        iM2872h8 = (iM2872h9 * size) + iM5265i;
                    }
                    iM2870f2 += iM2872h8;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(t70Var2, j);
                    Class cls13 = w51.f8434a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(t70Var2, j);
                    Class cls14 = w51.f8434a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 37:
                    size2 = w51.m5261e((List) unsafe.getObject(t70Var2, j));
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 38:
                    size2 = w51.m5265i((List) unsafe.getObject(t70Var2, j));
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 39:
                    size2 = w51.m5260d((List) unsafe.getObject(t70Var2, j));
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(t70Var2, j);
                    Class cls15 = w51.f8434a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(t70Var2, j);
                    Class cls16 = w51.f8434a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(t70Var2, j);
                    Class cls17 = w51.f8434a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 43:
                    size2 = w51.m5264h((List) unsafe.getObject(t70Var2, j));
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 44:
                    size2 = w51.m5257a((List) unsafe.getObject(t70Var2, j));
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(t70Var2, j);
                    Class cls18 = w51.f8434a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(t70Var2, j);
                    Class cls19 = w51.f8434a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 47:
                    size2 = w51.m5262f((List) unsafe.getObject(t70Var2, j));
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 48:
                    size2 = w51.m5263g((List) unsafe.getObject(t70Var2, j));
                    if (size2 > 0) {
                        iM2872h11 = C0360ji.m2872h(i5);
                        iM2873i = C0360ji.m2873i(size2);
                        iM2874j3 = iM2873i + iM2872h11;
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(t70Var2, j);
                    s51 s51VarM4815m4 = to0Var.m4815m(i3);
                    Class cls20 = w51.f8434a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iMo2975a2 = 0;
                    } else {
                        iMo2975a2 = 0;
                        for (int i16 = 0; i16 < size9; i16++) {
                            iMo2975a2 += ((AbstractC0379k0) list19.get(i16)).mo2975a(s51VarM4815m4) + (C0360ji.m2872h(i5) * 2);
                        }
                    }
                    iM2870f2 += iMo2975a2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(t70Var2, j);
                    Object obj2 = to0Var.f7544b[(i3 / 3) * 2];
                    to0Var.f7555m.getClass();
                    am0 am0Var = (am0) object3;
                    yl0 yl0Var = (yl0) obj2;
                    if (am0Var.isEmpty()) {
                        iM2872h10 = 0;
                    } else {
                        iM2872h10 = 0;
                        for (Map.Entry entry : am0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            yl0Var.getClass();
                            int iM2872h14 = C0360ji.m2872h(i5);
                            int iM5812a = yl0.m5812a(yl0Var.f9388a, key, value);
                            iM2872h10 += C0360ji.m2873i(iM5812a) + iM5812a + iM2872h14;
                        }
                    }
                    iM2870f2 += iM2872h10;
                    break;
                case 51:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        iM2872h = C0360ji.m2872h(i5);
                        iM5259c = iM2872h + 8;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 52:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        iM2872h12 = C0360ji.m2872h(i5);
                        iM5259c = iM2872h12 + 4;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 53:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        long jM4800z = m4800z(t70Var2, j);
                        size2 = C0360ji.m2872h(i5);
                        iM2874j3 = C0360ji.m2874j(jM4800z);
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 54:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        long jM4800z2 = m4800z(t70Var2, j);
                        size2 = C0360ji.m2872h(i5);
                        iM2874j3 = C0360ji.m2874j(jM4800z2);
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 55:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        int iM4799y = m4799y(t70Var2, j);
                        iM2872h7 = C0360ji.m2872h(i5);
                        iMo2975a = C0360ji.m2874j(iM4799y);
                        iM5259c = iMo2975a + iM2872h7;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 56:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        iM2872h = C0360ji.m2872h(i5);
                        iM5259c = iM2872h + 8;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 57:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        iM2872h12 = C0360ji.m2872h(i5);
                        iM5259c = iM2872h12 + 4;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 58:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        iM5259c = C0360ji.m2872h(i5) + 1;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 59:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        Object object4 = unsafe.getObject(t70Var2, j);
                        iM2870f2 = (object4 instanceof C0799vd ? C0360ji.m2870f(i5, (C0799vd) object4) : C0360ji.m2871g((String) object4) + C0360ji.m2872h(i5)) + iM2870f2;
                    }
                    break;
                case 60:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        Object object5 = unsafe.getObject(t70Var2, j);
                        s51 s51VarM4815m5 = to0Var.m4815m(i3);
                        Class cls21 = w51.f8434a;
                        int iM2872h15 = C0360ji.m2872h(i5);
                        int iMo2975a5 = ((AbstractC0379k0) object5).mo2975a(s51VarM4815m5);
                        iM2873i2 = C0360ji.m2873i(iMo2975a5) + iMo2975a5 + iM2872h15;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 61:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        iM5259c = C0360ji.m2870f(i5, (C0799vd) unsafe.getObject(t70Var2, j));
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 62:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        int iM4799y2 = m4799y(t70Var2, j);
                        iM2872h7 = C0360ji.m2872h(i5);
                        iMo2975a = C0360ji.m2873i(iM4799y2);
                        iM5259c = iMo2975a + iM2872h7;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 63:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        int iM4799y3 = m4799y(t70Var2, j);
                        iM2872h7 = C0360ji.m2872h(i5);
                        iMo2975a = C0360ji.m2874j(iM4799y3);
                        iM5259c = iMo2975a + iM2872h7;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 64:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        iM2872h12 = C0360ji.m2872h(i5);
                        iM5259c = iM2872h12 + 4;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 65:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        iM2872h = C0360ji.m2872h(i5);
                        iM5259c = iM2872h + 8;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 66:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        int iM4799y4 = m4799y(t70Var2, j);
                        iM2872h7 = C0360ji.m2872h(i5);
                        iMo2975a = C0360ji.m2873i((iM4799y4 >> 31) ^ (iM4799y4 << 1));
                        iM5259c = iMo2975a + iM2872h7;
                        iM2870f2 += iM5259c;
                    }
                    break;
                case 67:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        long jM4800z3 = m4800z(t70Var2, j);
                        size2 = C0360ji.m2872h(i5);
                        iM2874j3 = C0360ji.m2874j((jM4800z3 << 1) ^ (jM4800z3 >> 63));
                        iM2873i2 = iM2874j3 + size2;
                        iM2870f2 += iM2873i2;
                    }
                    break;
                case 68:
                    if (to0Var.m4818q(t70Var2, i5, i3)) {
                        iM5259c = ((AbstractC0379k0) unsafe.getObject(t70Var2, j)).mo2975a(to0Var.m4815m(i3)) + (C0360ji.m2872h(i5) * 2);
                        iM2870f2 += iM5259c;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // p000.s51
    /* JADX INFO: renamed from: i */
    public final boolean mo4483i(t70 t70Var, t70 t70Var2) {
        int[] iArr = this.f7543a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM5268l = true;
            if (i < length) {
                int iM4810L = m4810L(i);
                long j = iM4810L & 1048575;
                switch (m4795K(iM4810L)) {
                    case 0:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var = gg1.f2728c;
                            if (Double.doubleToLongBits(eg1Var.mo206d(t70Var, j)) != Double.doubleToLongBits(eg1Var.mo206d(t70Var2, j))) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var2 = gg1.f2728c;
                            if (Float.floatToIntBits(eg1Var2.mo207e(t70Var, j)) != Float.floatToIntBits(eg1Var2.mo207e(t70Var2, j))) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var3 = gg1.f2728c;
                            if (eg1Var3.m1419g(t70Var, j) != eg1Var3.m1419g(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var4 = gg1.f2728c;
                            if (eg1Var4.m1419g(t70Var, j) != eg1Var4.m1419g(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var5 = gg1.f2728c;
                            if (eg1Var5.m1418f(t70Var, j) != eg1Var5.m1418f(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var6 = gg1.f2728c;
                            if (eg1Var6.m1419g(t70Var, j) != eg1Var6.m1419g(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var7 = gg1.f2728c;
                            if (eg1Var7.m1418f(t70Var, j) != eg1Var7.m1418f(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var8 = gg1.f2728c;
                            if (eg1Var8.mo205c(t70Var, j) != eg1Var8.mo205c(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var9 = gg1.f2728c;
                            if (!w51.m5268l(eg1Var9.m1420h(t70Var, j), eg1Var9.m1420h(t70Var2, j))) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var10 = gg1.f2728c;
                            if (!w51.m5268l(eg1Var10.m1420h(t70Var, j), eg1Var10.m1420h(t70Var2, j))) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var11 = gg1.f2728c;
                            if (!w51.m5268l(eg1Var11.m1420h(t70Var, j), eg1Var11.m1420h(t70Var2, j))) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var12 = gg1.f2728c;
                            if (eg1Var12.m1418f(t70Var, j) != eg1Var12.m1418f(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var13 = gg1.f2728c;
                            if (eg1Var13.m1418f(t70Var, j) != eg1Var13.m1418f(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var14 = gg1.f2728c;
                            if (eg1Var14.m1418f(t70Var, j) != eg1Var14.m1418f(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var15 = gg1.f2728c;
                            if (eg1Var15.m1419g(t70Var, j) != eg1Var15.m1419g(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var16 = gg1.f2728c;
                            if (eg1Var16.m1418f(t70Var, j) != eg1Var16.m1418f(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var17 = gg1.f2728c;
                            if (eg1Var17.m1419g(t70Var, j) != eg1Var17.m1419g(t70Var2, j)) {
                                zM5268l = false;
                            }
                        }
                        break;
                    case 17:
                        if (!m4812j(t70Var, t70Var2, i)) {
                            zM5268l = false;
                        } else {
                            eg1 eg1Var18 = gg1.f2728c;
                            if (!w51.m5268l(eg1Var18.m1420h(t70Var, j), eg1Var18.m1420h(t70Var2, j))) {
                                zM5268l = false;
                            }
                        }
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
                        eg1 eg1Var19 = gg1.f2728c;
                        zM5268l = w51.m5268l(eg1Var19.m1420h(t70Var, j), eg1Var19.m1420h(t70Var2, j));
                        break;
                    case 50:
                        eg1 eg1Var20 = gg1.f2728c;
                        zM5268l = w51.m5268l(eg1Var20.m1420h(t70Var, j), eg1Var20.m1420h(t70Var2, j));
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
                        long j2 = iArr[i + 2] & 1048575;
                        eg1 eg1Var21 = gg1.f2728c;
                        if (eg1Var21.m1418f(t70Var, j2) != eg1Var21.m1418f(t70Var2, j2) || !w51.m5268l(eg1Var21.m1420h(t70Var, j), eg1Var21.m1420h(t70Var2, j))) {
                            zM5268l = false;
                        }
                        break;
                }
                if (zM5268l) {
                    i += 3;
                }
            } else {
                this.f7554l.getClass();
                if (t70Var.unknownFields.equals(t70Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4812j(t70 t70Var, t70 t70Var2, int i) {
        return m4816n(i, t70Var) == m4816n(i, t70Var2);
    }

    /* JADX INFO: renamed from: k */
    public final void m4813k(int i, Object obj, Object obj2) {
        int i2 = this.f7543a[i];
        if (gg1.f2728c.m1420h(obj, m4810L(i) & 1048575) == null) {
            return;
        }
        m4814l(i);
    }

    /* JADX INFO: renamed from: l */
    public final void m4814l(int i) {
        if (this.f7544b[((i / 3) * 2) + 1] == null) {
            return;
        }
        dd0.m1158c();
    }

    /* JADX INFO: renamed from: m */
    public final s51 m4815m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f7544b;
        s51 s51Var = (s51) objArr[i2];
        if (s51Var != null) {
            return s51Var;
        }
        s51 s51VarM1907a = fy0.f2536c.m1907a((Class) objArr[i2 + 1]);
        objArr[i2] = s51VarM1907a;
        return s51VarM1907a;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4816n(int i, Object obj) {
        int i2 = this.f7543a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iM4810L = m4810L(i);
            long j2 = iM4810L & 1048575;
            switch (m4795K(iM4810L)) {
                case 0:
                    if (Double.doubleToRawLongBits(gg1.f2728c.mo206d(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(gg1.f2728c.mo207e(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (gg1.f2728c.m1419g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (gg1.f2728c.m1419g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (gg1.f2728c.m1418f(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (gg1.f2728c.m1419g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (gg1.f2728c.m1418f(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return gg1.f2728c.mo205c(obj, j2);
                case 8:
                    Object objM1420h = gg1.f2728c.m1420h(obj, j2);
                    if (objM1420h instanceof String) {
                        return !((String) objM1420h).isEmpty();
                    }
                    if (objM1420h instanceof C0799vd) {
                        return !C0799vd.f8177l.equals(objM1420h);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (gg1.f2728c.m1420h(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0799vd.f8177l.equals(gg1.f2728c.m1420h(obj, j2));
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (gg1.f2728c.m1418f(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (gg1.f2728c.m1418f(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (gg1.f2728c.m1418f(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (gg1.f2728c.m1419g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (gg1.f2728c.m1418f(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (gg1.f2728c.m1419g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (gg1.f2728c.m1420h(obj, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & gg1.f2728c.m1418f(obj, j)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4817o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m4816n(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4818q(Object obj, int i, int i2) {
        return gg1.f2728c.m1418f(obj, (long) (this.f7543a[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: r */
    public final void m4819r(Object obj, int i, Object obj2, C0746ty c0746ty, C0212fi c0212fi) throws gf0, ff0 {
        long jM4810L = m4810L(i) & 1048575;
        Object objM1420h = gg1.f2728c.m1420h(obj, jM4810L);
        cm0 cm0Var = this.f7555m;
        if (objM1420h == null) {
            cm0Var.getClass();
            objM1420h = am0.f247k.m277b();
            gg1.m2050o(jM4810L, obj, objM1420h);
        } else {
            cm0Var.getClass();
            if (!((am0) objM1420h).f248j) {
                am0 am0VarM277b = am0.f247k.m277b();
                cm0.m974a(am0VarM277b, objM1420h);
                gg1.m2050o(jM4810L, obj, am0VarM277b);
                objM1420h = am0VarM277b;
            }
        }
        cm0Var.getClass();
        am0 am0Var = (am0) objM1420h;
        qd0 qd0Var = ((yl0) obj2).f9388a;
        c0212fi.m1813S(2);
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) c0212fi.f2412e;
        int iMo680e = abstractC0175ei.mo680e(abstractC0175ei.mo697v());
        Object obj3 = qd0Var.f6473m;
        Object objM1853r = "";
        Object objM1853r2 = obj3;
        while (true) {
            try {
                int iM1823b = c0212fi.m1823b();
                if (iM1823b == Integer.MAX_VALUE || abstractC0175ei.mo678c()) {
                    break;
                }
                if (iM1823b == 1) {
                    objM1853r = c0212fi.m1853r((kk1) qd0Var.f6471k, null, null);
                } else if (iM1823b != 2) {
                    try {
                        if (!c0212fi.m1814T()) {
                            throw new if0("Unable to parse map entry.");
                        }
                    } catch (gf0 unused) {
                        if (!c0212fi.m1814T()) {
                            throw new if0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM1853r2 = c0212fi.m1853r((kk1) qd0Var.f6472l, obj3.getClass(), c0746ty);
                }
            } catch (Throwable th) {
                abstractC0175ei.mo679d(iMo680e);
                throw th;
            }
        }
        am0Var.put(objM1853r, objM1853r2);
        abstractC0175ei.mo679d(iMo680e);
    }

    /* JADX INFO: renamed from: s */
    public final void m4820s(int i, Object obj, Object obj2) {
        if (m4816n(i, obj2)) {
            long jM4810L = m4810L(i) & 1048575;
            Unsafe unsafe = f7542o;
            Object object = unsafe.getObject(obj2, jM4810L);
            if (object == null) {
                dd0.m1160e(this.f7543a[i], obj2);
                return;
            }
            s51 s51VarM4815m = m4815m(i);
            if (!m4816n(i, obj)) {
                if (m4796p(object)) {
                    t70 t70VarMo4478d = s51VarM4815m.mo4478d();
                    s51VarM4815m.mo4475a(t70VarMo4478d, object);
                    unsafe.putObject(obj, jM4810L, t70VarMo4478d);
                } else {
                    unsafe.putObject(obj, jM4810L, object);
                }
                m4806G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM4810L);
            if (!m4796p(object2)) {
                t70 t70VarMo4478d2 = s51VarM4815m.mo4478d();
                s51VarM4815m.mo4475a(t70VarMo4478d2, object2);
                unsafe.putObject(obj, jM4810L, t70VarMo4478d2);
                object2 = t70VarMo4478d2;
            }
            s51VarM4815m.mo4475a(object2, object);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m4821t(int i, Object obj, Object obj2) {
        int[] iArr = this.f7543a;
        int i2 = iArr[i];
        if (m4818q(obj2, i2, i)) {
            long jM4810L = m4810L(i) & 1048575;
            Unsafe unsafe = f7542o;
            Object object = unsafe.getObject(obj2, jM4810L);
            if (object == null) {
                dd0.m1160e(iArr[i], obj2);
                return;
            }
            s51 s51VarM4815m = m4815m(i);
            if (!m4818q(obj, i2, i)) {
                if (m4796p(object)) {
                    t70 t70VarMo4478d = s51VarM4815m.mo4478d();
                    s51VarM4815m.mo4475a(t70VarMo4478d, object);
                    unsafe.putObject(obj, jM4810L, t70VarMo4478d);
                } else {
                    unsafe.putObject(obj, jM4810L, object);
                }
                m4807H(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM4810L);
            if (!m4796p(object2)) {
                t70 t70VarMo4478d2 = s51VarM4815m.mo4478d();
                s51VarM4815m.mo4475a(t70VarMo4478d2, object2);
                unsafe.putObject(obj, jM4810L, t70VarMo4478d2);
                object2 = t70VarMo4478d2;
            }
            s51VarM4815m.mo4475a(object2, object);
        }
    }

    /* JADX INFO: renamed from: u */
    public final Object m4822u(int i, Object obj) {
        s51 s51VarM4815m = m4815m(i);
        long jM4810L = m4810L(i) & 1048575;
        if (!m4816n(i, obj)) {
            return s51VarM4815m.mo4478d();
        }
        Object object = f7542o.getObject(obj, jM4810L);
        if (m4796p(object)) {
            return object;
        }
        t70 t70VarMo4478d = s51VarM4815m.mo4478d();
        if (object != null) {
            s51VarM4815m.mo4475a(t70VarMo4478d, object);
        }
        return t70VarMo4478d;
    }

    /* JADX INFO: renamed from: v */
    public final Object m4823v(Object obj, int i, int i2) {
        s51 s51VarM4815m = m4815m(i2);
        if (!m4818q(obj, i, i2)) {
            return s51VarM4815m.mo4478d();
        }
        Object object = f7542o.getObject(obj, m4810L(i2) & 1048575);
        if (m4796p(object)) {
            return object;
        }
        t70 t70VarMo4478d = s51VarM4815m.mo4478d();
        if (object != null) {
            s51VarM4815m.mo4475a(t70VarMo4478d, object);
        }
        return t70VarMo4478d;
    }
}
