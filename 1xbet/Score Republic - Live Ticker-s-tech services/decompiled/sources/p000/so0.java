package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class so0 implements r51 {

    /* JADX INFO: renamed from: n */
    public static final int[] f7161n = new int[0];

    /* JADX INFO: renamed from: o */
    public static final Unsafe f7162o = fg1.m1784j();

    /* JADX INFO: renamed from: a */
    public final int[] f7163a;

    /* JADX INFO: renamed from: b */
    public final Object[] f7164b;

    /* JADX INFO: renamed from: c */
    public final int f7165c;

    /* JADX INFO: renamed from: d */
    public final int f7166d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0342j0 f7167e;

    /* JADX INFO: renamed from: f */
    public final boolean f7168f;

    /* JADX INFO: renamed from: g */
    public final int[] f7169g;

    /* JADX INFO: renamed from: h */
    public final int f7170h;

    /* JADX INFO: renamed from: i */
    public final int f7171i;

    /* JADX INFO: renamed from: j */
    public final zr0 f7172j;

    /* JADX INFO: renamed from: k */
    public final oi0 f7173k;

    /* JADX INFO: renamed from: l */
    public final pf1 f7174l;

    /* JADX INFO: renamed from: m */
    public final bm0 f7175m;

    public so0(int[] iArr, Object[] objArr, int i, int i2, AbstractC0342j0 abstractC0342j0, int[] iArr2, int i3, int i4, zr0 zr0Var, oi0 oi0Var, pf1 pf1Var, C0783uy c0783uy, bm0 bm0Var) {
        this.f7163a = iArr;
        this.f7164b = objArr;
        this.f7165c = i;
        this.f7166d = i2;
        this.f7168f = abstractC0342j0 instanceof s70;
        this.f7169g = iArr2;
        this.f7170h = i3;
        this.f7171i = i4;
        this.f7172j = zr0Var;
        this.f7173k = oi0Var;
        this.f7174l = pf1Var;
        this.f7167e = abstractC0342j0;
        this.f7175m = bm0Var;
    }

    /* JADX INFO: renamed from: A */
    public static int m4542A(Object obj, long j) {
        return ((Integer) fg1.f2399c.m1207i(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: B */
    public static long m4543B(Object obj, long j) {
        return ((Long) fg1.f2399c.m1207i(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: G */
    public static Field m4544G(Class cls, String str) {
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

    /* JADX INFO: renamed from: L */
    public static int m4545L(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m4546q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof s70) {
            return ((s70) obj).m4495i();
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static so0 m4547x(yz0 yz0Var, zr0 zr0Var, oi0 oi0Var, pf1 pf1Var, C0783uy c0783uy, bm0 bm0Var) {
        if (yz0Var instanceof yz0) {
            return m4548y(yz0Var, zr0Var, oi0Var, pf1Var, c0783uy, bm0Var);
        }
        dd0.m1158c();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:162:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x037e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:183:0x0398  */
    /* JADX INFO: renamed from: y */
    public static so0 m4548y(yz0 yz0Var, zr0 zr0Var, oi0 oi0Var, pf1 pf1Var, C0783uy c0783uy, bm0 bm0Var) {
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
        Field fieldM4544G;
        char cCharAt9;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldM4544G2;
        int i27;
        Object obj2;
        Field fieldM4544G3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        String str = yz0Var.f9551b;
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
            iArr = f7161n;
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
        Unsafe unsafe = f7162o;
        Object[] objArr = yz0Var.f9552c;
        Class<?> cls = yz0Var.f9550a.getClass();
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
                    if (i80 == 12 && (AbstractC0024an.m278a(yz0Var.m5856a(), 1) || (iCharAt11 & 2048) != 0)) {
                        i25 = i6 + 1;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i6];
                    }
                    i26 = iCharAt12 * 2;
                    obj = objArr3[i26];
                    if (obj instanceof Field) {
                        fieldM4544G2 = (Field) obj;
                    } else {
                        fieldM4544G2 = m4544G(cls, (String) obj);
                        objArr3[i26] = fieldM4544G2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM4544G2);
                    i27 = i26 + 1;
                    obj2 = objArr3[i27];
                    if (obj2 instanceof Field) {
                        fieldM4544G3 = (Field) obj2;
                    } else {
                        fieldM4544G3 = m4544G(cls, (String) obj2);
                        objArr3[i27] = fieldM4544G3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM4544G3);
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
                    fieldM4544G2 = (Field) obj;
                } else {
                    fieldM4544G2 = m4544G(cls, (String) obj);
                    objArr3[i26] = fieldM4544G2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldM4544G2);
                i27 = i26 + 1;
                obj2 = objArr3[i27];
                if (obj2 instanceof Field) {
                    fieldM4544G3 = (Field) obj2;
                } else {
                    fieldM4544G3 = m4544G(cls, (String) obj2);
                    objArr3[i27] = fieldM4544G3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldM4544G3);
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
                Field fieldM4544G4 = m4544G(cls, (String) objArr3[i6]);
                if (i75 == 9 || i75 == 17) {
                    i18 = i4;
                    objArr2[((i67 / 3) * 2) + 1] = fieldM4544G4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i18 = i4;
                        i24 = i6 + 2;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i18 = i4;
                        if (yz0Var.m5856a() == 1 || (iCharAt11 & 2048) != 0) {
                            i24 = i6 + 2;
                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i84];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4544G4);
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
                                fieldM4544G = (Field) obj3;
                            } else {
                                fieldM4544G = m4544G(cls, (String) obj3);
                                objArr3[i88] = fieldM4544G;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM4544G);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4544G4);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4544G4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM4544G4);
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
        return new so0(iArr3, objArr2, i2, i5, yz0Var.f9550a, iArr, i7, i63, zr0Var, oi0Var, pf1Var, c0783uy, bm0Var);
    }

    /* JADX INFO: renamed from: z */
    public static long m4549z(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: C */
    public final void m4550C(Object obj, long j, C0212fi c0212fi, r51 r51Var, C0709sy c0709sy) throws ff0 {
        int iMo243y;
        List listMo3394c = this.f7173k.mo3394c(obj, j);
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) c0212fi.f2412e;
        int i = c0212fi.f2409b;
        if ((i & 7) != 3) {
            throw hf0.m2259b();
        }
        do {
            s70 s70VarMo4251d = r51Var.mo4251d();
            c0212fi.m1825c(s70VarMo4251d, r51Var, c0709sy);
            r51Var.mo4249b(s70VarMo4251d);
            listMo3394c.add(s70VarMo4251d);
            if (abstractC0860x0.mo218c() || c0212fi.f2411d != 0) {
                return;
            } else {
                iMo243y = abstractC0860x0.mo243y();
            }
        } while (iMo243y == i);
        c0212fi.f2411d = iMo243y;
    }

    /* JADX INFO: renamed from: D */
    public final void m4551D(Object obj, int i, C0212fi c0212fi, r51 r51Var, C0709sy c0709sy) throws hf0 {
        int iMo243y;
        List listMo3394c = this.f7173k.mo3394c(obj, i & 1048575);
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) c0212fi.f2412e;
        int i2 = c0212fi.f2409b;
        if ((i2 & 7) != 2) {
            throw hf0.m2259b();
        }
        do {
            s70 s70VarMo4251d = r51Var.mo4251d();
            c0212fi.m1829e(s70VarMo4251d, r51Var, c0709sy);
            r51Var.mo4249b(s70VarMo4251d);
            listMo3394c.add(s70VarMo4251d);
            if (abstractC0860x0.mo218c() || c0212fi.f2411d != 0) {
                return;
            } else {
                iMo243y = abstractC0860x0.mo243y();
            }
        } while (iMo243y == i2);
        c0212fi.f2411d = iMo243y;
    }

    /* JADX INFO: renamed from: E */
    public final void m4552E(int i, C0212fi c0212fi, Object obj) throws gf0, ff0 {
        if ((536870912 & i) != 0) {
            c0212fi.m1813S(2);
            fg1.m1790p(i & 1048575, obj, ((AbstractC0860x0) c0212fi.f2412e).mo242x());
        } else if (!this.f7168f) {
            fg1.m1790p(i & 1048575, obj, c0212fi.m1837i());
        } else {
            c0212fi.m1813S(2);
            fg1.m1790p(i & 1048575, obj, ((AbstractC0860x0) c0212fi.f2412e).mo241w());
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m4553F(int i, C0212fi c0212fi, Object obj) throws gf0, ff0 {
        boolean z = (536870912 & i) != 0;
        oi0 oi0Var = this.f7173k;
        if (z) {
            c0212fi.m1806L(oi0Var.mo3394c(obj, i & 1048575), true);
        } else {
            c0212fi.m1806L(oi0Var.mo3394c(obj, i & 1048575), false);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m4554H(int i, Object obj) {
        int i2 = this.f7163a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        fg1.m1788n(obj, j, (1 << (i2 >>> 20)) | fg1.f2399c.m1205g(obj, j));
    }

    /* JADX INFO: renamed from: I */
    public final void m4555I(Object obj, int i, int i2) {
        fg1.m1788n(obj, this.f7163a[i2 + 2] & 1048575, i);
    }

    /* JADX INFO: renamed from: J */
    public final void m4556J(Object obj, int i, AbstractC0342j0 abstractC0342j0) {
        f7162o.putObject(obj, m4558M(i) & 1048575, abstractC0342j0);
        m4554H(i, obj);
    }

    /* JADX INFO: renamed from: K */
    public final void m4557K(Object obj, int i, int i2, AbstractC0342j0 abstractC0342j0) {
        f7162o.putObject(obj, m4558M(i2) & 1048575, abstractC0342j0);
        m4555I(obj, i, i2);
    }

    /* JADX INFO: renamed from: M */
    public final int m4558M(int i) {
        return this.f7163a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: N */
    public final void m4559N(Object obj, b90 b90Var) {
        int i;
        int i2;
        boolean z;
        so0 so0Var = this;
        int[] iArr = so0Var.f7163a;
        int length = iArr.length;
        Unsafe unsafe = f7162o;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iM4558M = so0Var.m4558M(i5);
            int i7 = iArr[i5];
            int iM4545L = m4545L(iM4558M);
            if (iM4545L <= 17) {
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
            long j = iM4558M & i3;
            switch (iM4545L) {
                case 0:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        double dMo652e = fg1.f2399c.mo652e(obj, j);
                        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
                        abstractC0397ki.getClass();
                        abstractC0397ki.mo2066n(i7, Double.doubleToRawLongBits(dMo652e));
                    }
                    break;
                case 1:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        float fMo653f = fg1.f2399c.mo653f(obj, j);
                        AbstractC0397ki abstractC0397ki2 = (AbstractC0397ki) b90Var.f793k;
                        abstractC0397ki2.getClass();
                        abstractC0397ki2.mo2064l(i7, Float.floatToRawIntBits(fMo653f));
                    }
                    so0Var = this;
                    break;
                case 2:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2078z(i7, unsafe.getLong(obj, j));
                    }
                    so0Var = this;
                    break;
                case 3:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2078z(i7, unsafe.getLong(obj, j));
                    }
                    so0Var = this;
                    break;
                case 4:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2068p(i7, unsafe.getInt(obj, j));
                    }
                    so0Var = this;
                    break;
                case 5:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2066n(i7, unsafe.getLong(obj, j));
                    }
                    so0Var = this;
                    break;
                case 6:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2064l(i7, unsafe.getInt(obj, j));
                    }
                    so0Var = this;
                    break;
                case 7:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2060h(i7, fg1.f2399c.mo650c(obj, j));
                    }
                    so0Var = this;
                    break;
                case 8:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((AbstractC0397ki) b90Var.f793k).mo2073u((String) object, i7);
                        } else {
                            ((AbstractC0397ki) b90Var.f793k).mo2062j(i7, (C0762ud) object);
                        }
                    }
                    so0Var = this;
                    break;
                case 9:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2071s(i7, (AbstractC0342j0) unsafe.getObject(obj, j), so0Var.m4564n(i5));
                    }
                    break;
                case 10:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2062j(i7, (C0762ud) unsafe.getObject(obj, j));
                    }
                    so0Var = this;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2076x(i7, unsafe.getInt(obj, j));
                    }
                    so0Var = this;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2068p(i7, unsafe.getInt(obj, j));
                    }
                    so0Var = this;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2064l(i7, unsafe.getInt(obj, j));
                    }
                    so0Var = this;
                    break;
                case 14:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2066n(i7, unsafe.getLong(obj, j));
                    }
                    so0Var = this;
                    break;
                case 15:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((AbstractC0397ki) b90Var.f793k).mo2076x(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    so0Var = this;
                    break;
                case 16:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((AbstractC0397ki) b90Var.f793k).mo2078z(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    so0Var = this;
                    break;
                case 17:
                    if (so0Var.m4566p(obj, i5, i4, i6, i)) {
                        b90Var.m626x(i7, unsafe.getObject(obj, j), so0Var.m4564n(i5));
                    }
                    break;
                case 18:
                    i4 = i4;
                    v51.m5090n(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 19:
                    i4 = i4;
                    v51.m5094r(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 20:
                    i4 = i4;
                    v51.m5096t(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 21:
                    i4 = i4;
                    v51.m5102z(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 22:
                    i4 = i4;
                    v51.m5095s(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 23:
                    i4 = i4;
                    v51.m5093q(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 24:
                    i4 = i4;
                    v51.m5092p(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 25:
                    i4 = i4;
                    v51.m5089m(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 26:
                    i2 = i4;
                    int i11 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = v51.f8095a;
                    if (list != null && !list.isEmpty()) {
                        AbstractC0397ki abstractC0397ki3 = (AbstractC0397ki) b90Var.f793k;
                        if (list instanceof jh0) {
                            jh0 jh0Var = (jh0) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object objMo2639n = jh0Var.mo2639n(i12);
                                if (objMo2639n instanceof String) {
                                    abstractC0397ki3.mo2073u((String) objMo2639n, i11);
                                } else {
                                    abstractC0397ki3.mo2062j(i11, (C0762ud) objMo2639n);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                abstractC0397ki3.mo2073u((String) list.get(i13), i11);
                            }
                        }
                    }
                    i4 = i2;
                    break;
                case 27:
                    i2 = i4;
                    int i14 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    r51 r51VarM4564n = so0Var.m4564n(i5);
                    Class cls2 = v51.f8095a;
                    if (list2 != null && !list2.isEmpty()) {
                        b90Var.getClass();
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((AbstractC0397ki) b90Var.f793k).mo2071s(i14, (AbstractC0342j0) list2.get(i15), r51VarM4564n);
                        }
                    }
                    i4 = i2;
                    break;
                case 28:
                    i2 = i4;
                    int i16 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = v51.f8095a;
                    if (list3 != null && !list3.isEmpty()) {
                        b90Var.getClass();
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            ((AbstractC0397ki) b90Var.f793k).mo2062j(i16, (C0762ud) list3.get(i17));
                        }
                    }
                    i4 = i2;
                    break;
                case 29:
                    z = false;
                    v51.m5101y(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 30:
                    z = false;
                    v51.m5091o(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 31:
                    z = false;
                    v51.m5097u(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 32:
                    z = false;
                    v51.m5098v(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 33:
                    z = false;
                    v51.m5099w(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 34:
                    z = false;
                    v51.m5100x(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, false);
                    i4 = i4;
                    break;
                case 35:
                    i2 = i4;
                    v51.m5090n(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 36:
                    i2 = i4;
                    v51.m5094r(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 37:
                    i2 = i4;
                    v51.m5096t(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 38:
                    i2 = i4;
                    v51.m5102z(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 39:
                    i2 = i4;
                    v51.m5095s(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 40:
                    i2 = i4;
                    v51.m5093q(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 41:
                    i2 = i4;
                    v51.m5092p(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 42:
                    i2 = i4;
                    v51.m5089m(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 43:
                    i2 = i4;
                    v51.m5101y(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 44:
                    i2 = i4;
                    v51.m5091o(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 45:
                    i2 = i4;
                    v51.m5097u(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 46:
                    i2 = i4;
                    v51.m5098v(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 47:
                    i2 = i4;
                    v51.m5099w(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 48:
                    i2 = i4;
                    v51.m5100x(iArr[i5], (List) unsafe.getObject(obj, j), b90Var, true);
                    i4 = i2;
                    break;
                case 49:
                    i2 = i4;
                    int i18 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    r51 r51VarM4564n2 = so0Var.m4564n(i5);
                    Class cls4 = v51.f8095a;
                    if (list4 != null && !list4.isEmpty()) {
                        b90Var.getClass();
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            b90Var.m626x(i18, list4.get(i19), r51VarM4564n2);
                        }
                    }
                    i4 = i2;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object objM4563m = so0Var.m4563m(i5);
                        so0Var.f7175m.getClass();
                        qd0 qd0Var = ((xl0) objM4563m).f8990a;
                        AbstractC0397ki abstractC0397ki4 = (AbstractC0397ki) b90Var.f793k;
                        abstractC0397ki4.getClass();
                        for (Map.Entry entry : ((zl0) object2).entrySet()) {
                            abstractC0397ki4.mo2075w(i7, 2);
                            abstractC0397ki4.mo2077y(xl0.m5669a(qd0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0932yz.m5854b(abstractC0397ki4, (jk1) qd0Var.f6471k, 1, key);
                            C0932yz.m5854b(abstractC0397ki4, (jk1) qd0Var.f6472l, 2, value);
                            i4 = i4;
                        }
                    }
                    i2 = i4;
                    i4 = i2;
                    break;
                case 51:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        double dDoubleValue = ((Double) fg1.f2399c.m1207i(obj, j)).doubleValue();
                        AbstractC0397ki abstractC0397ki5 = (AbstractC0397ki) b90Var.f793k;
                        abstractC0397ki5.getClass();
                        abstractC0397ki5.mo2066n(i7, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        float fFloatValue = ((Float) fg1.f2399c.m1207i(obj, j)).floatValue();
                        AbstractC0397ki abstractC0397ki6 = (AbstractC0397ki) b90Var.f793k;
                        abstractC0397ki6.getClass();
                        abstractC0397ki6.mo2064l(i7, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2078z(i7, m4543B(obj, j));
                    }
                    break;
                case 54:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2078z(i7, m4543B(obj, j));
                    }
                    break;
                case 55:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2068p(i7, m4542A(obj, j));
                    }
                    break;
                case 56:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2066n(i7, m4543B(obj, j));
                    }
                    break;
                case 57:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2064l(i7, m4542A(obj, j));
                    }
                    break;
                case 58:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2060h(i7, ((Boolean) fg1.f2399c.m1207i(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((AbstractC0397ki) b90Var.f793k).mo2073u((String) object3, i7);
                        } else {
                            ((AbstractC0397ki) b90Var.f793k).mo2062j(i7, (C0762ud) object3);
                        }
                    }
                    break;
                case 60:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2071s(i7, (AbstractC0342j0) unsafe.getObject(obj, j), so0Var.m4564n(i5));
                    }
                    break;
                case 61:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2062j(i7, (C0762ud) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2076x(i7, m4542A(obj, j));
                    }
                    break;
                case 63:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2068p(i7, m4542A(obj, j));
                    }
                    break;
                case 64:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2064l(i7, m4542A(obj, j));
                    }
                    break;
                case 65:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        ((AbstractC0397ki) b90Var.f793k).mo2066n(i7, m4543B(obj, j));
                    }
                    break;
                case 66:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        int iM4542A = m4542A(obj, j);
                        ((AbstractC0397ki) b90Var.f793k).mo2076x(i7, (iM4542A >> 31) ^ (iM4542A << 1));
                    }
                    break;
                case 67:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        long jM4543B = m4543B(obj, j);
                        ((AbstractC0397ki) b90Var.f793k).mo2078z(i7, (jM4543B << 1) ^ (jM4543B >> 63));
                    }
                    break;
                case 68:
                    if (so0Var.m4567r(obj, i7, i5)) {
                        b90Var.m626x(i7, unsafe.getObject(obj, j), so0Var.m4564n(i5));
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        so0Var.f7174l.getClass();
        ((s70) obj).unknownFields.m3536d(b90Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // p000.r51
    /* JADX INFO: renamed from: a */
    public final void mo4248a(Object obj, Object obj2) {
        Object obj3;
        if (!m4546q(obj)) {
            dd0.m1167m(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f7163a;
            if (i >= iArr.length) {
                v51.m5087k(this.f7174l, obj, obj2);
                return;
            }
            int iM4558M = m4558M(i);
            long j = 1048575 & iM4558M;
            int i2 = iArr[i];
            switch (m4545L(iM4558M)) {
                case 0:
                    if (!m4565o(i, obj2)) {
                        obj3 = obj;
                    } else {
                        dg1 dg1Var = fg1.f2399c;
                        obj3 = obj;
                        dg1Var.mo656m(obj3, j, dg1Var.mo652e(obj2, j));
                        m4554H(i, obj3);
                    }
                    break;
                case 1:
                    if (m4565o(i, obj2)) {
                        dg1 dg1Var2 = fg1.f2399c;
                        dg1Var2.mo657n(obj, j, dg1Var2.mo653f(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m4565o(i, obj2)) {
                        fg1.m1789o(obj, j, fg1.f2399c.m1206h(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m4565o(i, obj2)) {
                        fg1.m1789o(obj, j, fg1.f2399c.m1206h(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m4565o(i, obj2)) {
                        fg1.m1788n(obj, j, fg1.f2399c.m1205g(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m4565o(i, obj2)) {
                        fg1.m1789o(obj, j, fg1.f2399c.m1206h(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m4565o(i, obj2)) {
                        fg1.m1788n(obj, j, fg1.f2399c.m1205g(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m4565o(i, obj2)) {
                        dg1 dg1Var3 = fg1.f2399c;
                        dg1Var3.mo654k(obj, j, dg1Var3.mo650c(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m4565o(i, obj2)) {
                        fg1.m1790p(j, obj, fg1.f2399c.m1207i(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m4569t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m4565o(i, obj2)) {
                        fg1.m1790p(j, obj, fg1.f2399c.m1207i(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (m4565o(i, obj2)) {
                        fg1.m1788n(obj, j, fg1.f2399c.m1205g(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (m4565o(i, obj2)) {
                        fg1.m1788n(obj, j, fg1.f2399c.m1205g(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (m4565o(i, obj2)) {
                        fg1.m1788n(obj, j, fg1.f2399c.m1205g(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m4565o(i, obj2)) {
                        fg1.m1789o(obj, j, fg1.f2399c.m1206h(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m4565o(i, obj2)) {
                        fg1.m1788n(obj, j, fg1.f2399c.m1205g(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m4565o(i, obj2)) {
                        fg1.m1789o(obj, j, fg1.f2399c.m1206h(obj2, j));
                        m4554H(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m4569t(i, obj, obj2);
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
                    this.f7173k.mo3393b(j, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = v51.f8095a;
                    dg1 dg1Var4 = fg1.f2399c;
                    Object objM1207i = dg1Var4.m1207i(obj, j);
                    Object objM1207i2 = dg1Var4.m1207i(obj2, j);
                    this.f7175m.getClass();
                    fg1.m1790p(j, obj, bm0.m724a(objM1207i, objM1207i2));
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
                    if (m4567r(obj2, i2, i)) {
                        fg1.m1790p(j, obj, fg1.f2399c.m1207i(obj2, j));
                        m4555I(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m4570u(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m4567r(obj2, i2, i)) {
                        fg1.m1790p(j, obj, fg1.f2399c.m1207i(obj2, j));
                        m4555I(obj, i2, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m4570u(i, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[SYNTHETIC] */
    @Override // p000.r51
    /* JADX INFO: renamed from: b */
    public final void mo4249b(Object obj) {
        if (m4546q(obj)) {
            if (obj instanceof s70) {
                s70 s70Var = (s70) obj;
                s70Var.m4498m(Integer.MAX_VALUE);
                s70Var.memoizedHashCode = 0;
                s70Var.m4496j();
            }
            int[] iArr = this.f7163a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM4558M = m4558M(i);
                long j = 1048575 & iM4558M;
                int iM4545L = m4545L(iM4558M);
                if (iM4545L != 9) {
                    if (iM4545L != 60 && iM4545L != 68) {
                        switch (iM4545L) {
                            case 17:
                                if (m4565o(i, obj)) {
                                    m4564n(i).mo4249b(f7162o.getObject(obj, j));
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
                                this.f7173k.mo3392a(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = f7162o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f7175m.getClass();
                                    ((zl0) object).f9860j = false;
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (m4567r(obj, iArr[i], i)) {
                        m4564n(i).mo4249b(f7162o.getObject(obj, j));
                    }
                } else if (m4565o(i, obj)) {
                    m4564n(i).mo4249b(f7162o.getObject(obj, j));
                }
            }
            this.f7174l.getClass();
            nf1 nf1Var = ((s70) obj).unknownFields;
            if (nf1Var.f5403e) {
                nf1Var.f5403e = false;
            }
        }
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: c */
    public final boolean mo4250c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f7170h) {
            int i6 = this.f7169g[i5];
            int[] iArr = this.f7163a;
            int i7 = iArr[i6];
            int iM4558M = m4558M(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f7162o.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                int i11 = i4;
                i = i3;
                i2 = i11;
            }
            if ((268435456 & iM4558M) == 0 || m4566p(obj, i6, i, i2, i10)) {
                int iM4545L = m4545L(iM4558M);
                if (iM4545L == 9 || iM4545L == 17) {
                    if (m4566p(obj, i6, i, i2, i10)) {
                        if (!m4564n(i6).mo4250c(fg1.f2399c.m1207i(obj, iM4558M & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                } else {
                    if (iM4545L != 27) {
                        if (iM4545L == 60 || iM4545L == 68) {
                            if (m4567r(obj, i7, i6)) {
                                if (!m4564n(i6).mo4250c(fg1.f2399c.m1207i(obj, iM4558M & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        } else if (iM4545L != 49) {
                            if (iM4545L != 50) {
                                continue;
                            } else {
                                Object objM1207i = fg1.f2399c.m1207i(obj, iM4558M & 1048575);
                                this.f7175m.getClass();
                                zl0 zl0Var = (zl0) objM1207i;
                                if (!zl0Var.isEmpty() && ((jk1) ((xl0) m4563m(i6)).f8990a.f6472l).f3957j == lk1.f4827r) {
                                    r51 r51VarM1525a = null;
                                    for (Object obj2 : zl0Var.values()) {
                                        if (r51VarM1525a == null) {
                                            r51VarM1525a = ey0.f2207c.m1525a(obj2.getClass());
                                        }
                                        if (!r51VarM1525a.mo4250c(obj2)) {
                                        }
                                    }
                                }
                            }
                            i5++;
                            i3 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) fg1.f2399c.m1207i(obj, iM4558M & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        r51 r51VarM4564n = m4564n(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (r51VarM4564n.mo4250c(list.get(i12))) {
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

    @Override // p000.r51
    /* JADX INFO: renamed from: d */
    public final s70 mo4251d() {
        this.f7172j.getClass();
        return ((s70) this.f7167e).m4497k();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.r51
    /* JADX INFO: renamed from: e */
    public final int mo4252e(s70 s70Var) {
        int i;
        int iM1773b;
        int i2;
        int[] iArr = this.f7163a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM4558M = m4558M(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM4558M;
            int i6 = 1237;
            int iHashCode = 37;
            switch (m4545L(iM4558M)) {
                case 0:
                    i = i3 * 53;
                    iM1773b = fe0.m1773b(Double.doubleToLongBits(fg1.f2399c.mo652e(s70Var, j)));
                    i3 = iM1773b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM1773b = Float.floatToIntBits(fg1.f2399c.mo653f(s70Var, j));
                    i3 = iM1773b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM1773b = fe0.m1773b(fg1.f2399c.m1206h(s70Var, j));
                    i3 = iM1773b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM1773b = fe0.m1773b(fg1.f2399c.m1206h(s70Var, j));
                    i3 = iM1773b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iM1773b = fg1.f2399c.m1205g(s70Var, j);
                    i3 = iM1773b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iM1773b = fe0.m1773b(fg1.f2399c.m1206h(s70Var, j));
                    i3 = iM1773b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iM1773b = fg1.f2399c.m1205g(s70Var, j);
                    i3 = iM1773b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zMo650c = fg1.f2399c.mo650c(s70Var, j);
                    Charset charset = fe0.f2381a;
                    if (zMo650c) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iM1773b = ((String) fg1.f2399c.m1207i(s70Var, j)).hashCode();
                    i3 = iM1773b + i;
                    break;
                case 9:
                    Object objM1207i = fg1.f2399c.m1207i(s70Var, j);
                    if (objM1207i != null) {
                        iHashCode = objM1207i.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM1773b = fg1.f2399c.m1207i(s70Var, j).hashCode();
                    i3 = iM1773b + i;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    i = i3 * 53;
                    iM1773b = fg1.f2399c.m1205g(s70Var, j);
                    i3 = iM1773b + i;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    i = i3 * 53;
                    iM1773b = fg1.f2399c.m1205g(s70Var, j);
                    i3 = iM1773b + i;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    i = i3 * 53;
                    iM1773b = fg1.f2399c.m1205g(s70Var, j);
                    i3 = iM1773b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iM1773b = fe0.m1773b(fg1.f2399c.m1206h(s70Var, j));
                    i3 = iM1773b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iM1773b = fg1.f2399c.m1205g(s70Var, j);
                    i3 = iM1773b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iM1773b = fe0.m1773b(fg1.f2399c.m1206h(s70Var, j));
                    i3 = iM1773b + i;
                    break;
                case 17:
                    Object objM1207i2 = fg1.f2399c.m1207i(s70Var, j);
                    if (objM1207i2 != null) {
                        iHashCode = objM1207i2.hashCode();
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
                    iM1773b = fg1.f2399c.m1207i(s70Var, j).hashCode();
                    i3 = iM1773b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM1773b = fg1.f2399c.m1207i(s70Var, j).hashCode();
                    i3 = iM1773b + i;
                    break;
                case 51:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = fe0.m1773b(Double.doubleToLongBits(((Double) fg1.f2399c.m1207i(s70Var, j)).doubleValue()));
                        i3 = iM1773b + i;
                    }
                    break;
                case 52:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = Float.floatToIntBits(((Float) fg1.f2399c.m1207i(s70Var, j)).floatValue());
                        i3 = iM1773b + i;
                    }
                    break;
                case 53:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = fe0.m1773b(m4543B(s70Var, j));
                        i3 = iM1773b + i;
                    }
                    break;
                case 54:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = fe0.m1773b(m4543B(s70Var, j));
                        i3 = iM1773b + i;
                    }
                    break;
                case 55:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = m4542A(s70Var, j);
                        i3 = iM1773b + i;
                    }
                    break;
                case 56:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = fe0.m1773b(m4543B(s70Var, j));
                        i3 = iM1773b + i;
                    }
                    break;
                case 57:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = m4542A(s70Var, j);
                        i3 = iM1773b + i;
                    }
                    break;
                case 58:
                    if (m4567r(s70Var, i5, i4)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) fg1.f2399c.m1207i(s70Var, j)).booleanValue();
                        Charset charset2 = fe0.f2381a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = ((String) fg1.f2399c.m1207i(s70Var, j)).hashCode();
                        i3 = iM1773b + i;
                    }
                    break;
                case 60:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = fg1.f2399c.m1207i(s70Var, j).hashCode();
                        i3 = iM1773b + i;
                    }
                    break;
                case 61:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = fg1.f2399c.m1207i(s70Var, j).hashCode();
                        i3 = iM1773b + i;
                    }
                    break;
                case 62:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = m4542A(s70Var, j);
                        i3 = iM1773b + i;
                    }
                    break;
                case 63:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = m4542A(s70Var, j);
                        i3 = iM1773b + i;
                    }
                    break;
                case 64:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = m4542A(s70Var, j);
                        i3 = iM1773b + i;
                    }
                    break;
                case 65:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = fe0.m1773b(m4543B(s70Var, j));
                        i3 = iM1773b + i;
                    }
                    break;
                case 66:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = m4542A(s70Var, j);
                        i3 = iM1773b + i;
                    }
                    break;
                case 67:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = fe0.m1773b(m4543B(s70Var, j));
                        i3 = iM1773b + i;
                    }
                    break;
                case 68:
                    if (m4567r(s70Var, i5, i4)) {
                        i = i3 * 53;
                        iM1773b = fg1.f2399c.m1207i(s70Var, j).hashCode();
                        i3 = iM1773b + i;
                    }
                    break;
            }
        }
        this.f7174l.getClass();
        return s70Var.unknownFields.hashCode() + (i3 * 53);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p000.r51
    /* JADX INFO: renamed from: f */
    public final void mo4253f(java.lang.Object r20, p000.C0212fi r21, p000.C0709sy r22) {
        /*
            Method dump skipped, instruction units count: 2394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.so0.mo4253f(java.lang.Object, fi, sy):void");
    }

    /* JADX WARN: Code duplicated, block: B:144:0x035b  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d5  */
    @Override // p000.r51
    /* JADX INFO: renamed from: g */
    public final int mo4254g(s70 s70Var) {
        int i;
        int iM3033c;
        int iM3033c2;
        int iM3033c3;
        int iM3035e;
        int iM3033c4;
        int iM3031a;
        int iM3033c5;
        int iM3033c6;
        int iM3032b;
        int iM3033c7;
        int iMo2754a;
        int iM3033c8;
        int iMo2754a2;
        int iM5079c;
        int iM3033c9;
        int size;
        int iM5085i;
        int iM3033c10;
        int iM3033c11;
        int size2;
        int iM3033c12;
        int iMo2754a3;
        int iM3033c13;
        int iM3033c14;
        int iM3035e2;
        int iM3032b2;
        so0 so0Var = this;
        s70 s70Var2 = s70Var;
        Unsafe unsafe = f7162o;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int iM279b = 0;
        while (true) {
            int[] iArr = so0Var.f7163a;
            if (i3 >= iArr.length) {
                so0Var.f7174l.getClass();
                return s70Var2.unknownFields.m3534b() + iM279b;
            }
            int iM4558M = so0Var.m4558M(i3);
            int iM4545L = m4545L(iM4558M);
            int i5 = iArr[i3];
            int i6 = iArr[i3 + 2];
            int i7 = i6 & 1048575;
            if (iM4545L <= 17) {
                if (i7 != i2) {
                    i4 = i7 == 1048575 ? 0 : unsafe.getInt(s70Var2, i7);
                    i2 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            long j = iM4558M & 1048575;
            if (iM4545L >= a00.f1k.f5j) {
                int i8 = a00.f2l.f5j;
            }
            switch (iM4545L) {
                case 0:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        iM3033c = AbstractC0397ki.m3033c(i5);
                        iM5079c = iM3033c + 8;
                        iM279b += iM5079c;
                    }
                    break;
                case 1:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        iM3033c2 = AbstractC0397ki.m3033c(i5);
                        iM3033c6 = iM3033c2 + 4;
                        iM279b += iM3033c6;
                    }
                    so0Var = this;
                    s70Var2 = s70Var;
                    break;
                case 2:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        long j2 = unsafe.getLong(s70Var2, j);
                        iM3033c3 = AbstractC0397ki.m3033c(i5);
                        iM3035e = AbstractC0397ki.m3035e(j2);
                        iM279b += iM3035e + iM3033c3;
                    }
                    so0Var = this;
                    break;
                case 3:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        long j3 = unsafe.getLong(s70Var2, j);
                        iM3033c3 = AbstractC0397ki.m3033c(i5);
                        iM3035e = AbstractC0397ki.m3035e(j3);
                        iM279b += iM3035e + iM3033c3;
                    }
                    so0Var = this;
                    break;
                case 4:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        int i9 = unsafe.getInt(s70Var2, j);
                        iM3033c4 = AbstractC0397ki.m3033c(i5);
                        iM3031a = AbstractC0397ki.m3031a(i9);
                        iM279b += iM3031a + iM3033c4;
                    }
                    so0Var = this;
                    break;
                case 5:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        iM3033c5 = AbstractC0397ki.m3033c(i5);
                        iM3033c6 = iM3033c5 + 8;
                        iM279b += iM3033c6;
                    }
                    so0Var = this;
                    s70Var2 = s70Var;
                    break;
                case 6:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        iM3033c2 = AbstractC0397ki.m3033c(i5);
                        iM3033c6 = iM3033c2 + 4;
                        iM279b += iM3033c6;
                    }
                    so0Var = this;
                    s70Var2 = s70Var;
                    break;
                case 7:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        iM3033c6 = AbstractC0397ki.m3033c(i5) + 1;
                        iM279b += iM3033c6;
                    }
                    so0Var = this;
                    s70Var2 = s70Var;
                    break;
                case 8:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        Object object = unsafe.getObject(s70Var2, j);
                        if (object instanceof C0762ud) {
                            int iM3033c15 = AbstractC0397ki.m3033c(i5);
                            int size3 = ((C0762ud) object).size();
                            iM3032b = AbstractC0024an.m279b(size3, size3, iM3033c15, iM279b);
                        } else {
                            iM3032b = AbstractC0397ki.m3032b((String) object) + AbstractC0397ki.m3033c(i5) + iM279b;
                        }
                        iM279b = iM3032b;
                    }
                    so0Var = this;
                    break;
                case 9:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        Object object2 = unsafe.getObject(s70Var2, j);
                        r51 r51VarM4564n = so0Var.m4564n(i3);
                        Class cls = v51.f8095a;
                        iM3033c7 = AbstractC0397ki.m3033c(i5);
                        iMo2754a = ((AbstractC0342j0) object2).mo2754a(r51VarM4564n);
                        iM279b = AbstractC0024an.m279b(iMo2754a, iMo2754a, iM3033c7, iM279b);
                    }
                    break;
                case 10:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        C0762ud c0762ud = (C0762ud) unsafe.getObject(s70Var2, j);
                        int iM3033c16 = AbstractC0397ki.m3033c(i5);
                        int size4 = c0762ud.size();
                        iM279b = AbstractC0024an.m279b(size4, size4, iM3033c16, iM279b);
                    }
                    so0Var = this;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        int i10 = unsafe.getInt(s70Var2, j);
                        iM3033c4 = AbstractC0397ki.m3033c(i5);
                        iM3031a = AbstractC0397ki.m3034d(i10);
                        iM279b += iM3031a + iM3033c4;
                    }
                    so0Var = this;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        int i11 = unsafe.getInt(s70Var2, j);
                        iM3033c4 = AbstractC0397ki.m3033c(i5);
                        iM3031a = AbstractC0397ki.m3031a(i11);
                        iM279b += iM3031a + iM3033c4;
                    }
                    so0Var = this;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        iM3033c2 = AbstractC0397ki.m3033c(i5);
                        iM3033c6 = iM3033c2 + 4;
                        iM279b += iM3033c6;
                    }
                    so0Var = this;
                    s70Var2 = s70Var;
                    break;
                case 14:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        iM3033c5 = AbstractC0397ki.m3033c(i5);
                        iM3033c6 = iM3033c5 + 8;
                        iM279b += iM3033c6;
                    }
                    so0Var = this;
                    s70Var2 = s70Var;
                    break;
                case 15:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        int i12 = unsafe.getInt(s70Var2, j);
                        iM3033c4 = AbstractC0397ki.m3033c(i5);
                        iM3031a = AbstractC0397ki.m3034d((i12 >> 31) ^ (i12 << 1));
                        iM279b += iM3031a + iM3033c4;
                    }
                    so0Var = this;
                    break;
                case 16:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        long j4 = unsafe.getLong(s70Var2, j);
                        iM3033c3 = AbstractC0397ki.m3033c(i5);
                        iM3035e = AbstractC0397ki.m3035e((j4 << 1) ^ (j4 >> 63));
                        iM279b += iM3035e + iM3033c3;
                    }
                    so0Var = this;
                    break;
                case 17:
                    if (so0Var.m4566p(s70Var2, i3, i2, i4, i)) {
                        AbstractC0342j0 abstractC0342j0 = (AbstractC0342j0) unsafe.getObject(s70Var2, j);
                        r51 r51VarM4564n2 = so0Var.m4564n(i3);
                        iM3033c8 = AbstractC0397ki.m3033c(i5) * 2;
                        iMo2754a2 = abstractC0342j0.mo2754a(r51VarM4564n2);
                        iM5079c = iMo2754a2 + iM3033c8;
                        iM279b += iM5079c;
                    }
                    break;
                case 18:
                    iM5079c = v51.m5079c(i5, (List) unsafe.getObject(s70Var2, j));
                    iM279b += iM5079c;
                    break;
                case 19:
                    iM5079c = v51.m5078b(i5, (List) unsafe.getObject(s70Var2, j));
                    iM279b += iM5079c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(s70Var2, j);
                    Class cls2 = v51.f8095a;
                    if (list.size() == 0) {
                        iM3033c9 = 0;
                    } else {
                        iM3033c9 = (AbstractC0397ki.m3033c(i5) * list.size()) + v51.m5081e(list);
                    }
                    iM279b += iM3033c9;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(s70Var2, j);
                    Class cls3 = v51.f8095a;
                    size = list2.size();
                    if (size == 0) {
                        iM3033c9 = 0;
                    } else {
                        iM5085i = v51.m5085i(list2);
                        iM3033c10 = AbstractC0397ki.m3033c(i5);
                        iM3033c9 = (iM3033c10 * size) + iM5085i;
                    }
                    iM279b += iM3033c9;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(s70Var2, j);
                    Class cls4 = v51.f8095a;
                    size = list3.size();
                    if (size == 0) {
                        iM3033c9 = 0;
                    } else {
                        iM5085i = v51.m5080d(list3);
                        iM3033c10 = AbstractC0397ki.m3033c(i5);
                        iM3033c9 = (iM3033c10 * size) + iM5085i;
                    }
                    iM279b += iM3033c9;
                    break;
                case 23:
                    iM5079c = v51.m5079c(i5, (List) unsafe.getObject(s70Var2, j));
                    iM279b += iM5079c;
                    break;
                case 24:
                    iM5079c = v51.m5078b(i5, (List) unsafe.getObject(s70Var2, j));
                    iM279b += iM5079c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(s70Var2, j);
                    Class cls5 = v51.f8095a;
                    int size5 = list4.size();
                    iM279b += size5 == 0 ? 0 : (AbstractC0397ki.m3033c(i5) + 1) * size5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(s70Var2, j);
                    Class cls6 = v51.f8095a;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        iM3033c9 = 0;
                    } else {
                        iM3033c9 = AbstractC0397ki.m3033c(i5) * size6;
                        if (list5 instanceof jh0) {
                            jh0 jh0Var = (jh0) list5;
                            for (int i13 = 0; i13 < size6; i13++) {
                                Object objMo2639n = jh0Var.mo2639n(i13);
                                if (objMo2639n instanceof C0762ud) {
                                    int size7 = ((C0762ud) objMo2639n).size();
                                    iM3033c9 = AbstractC0397ki.m3034d(size7) + size7 + iM3033c9;
                                } else {
                                    iM3033c9 = AbstractC0397ki.m3032b((String) objMo2639n) + iM3033c9;
                                }
                            }
                        } else {
                            for (int i14 = 0; i14 < size6; i14++) {
                                Object obj = list5.get(i14);
                                if (obj instanceof C0762ud) {
                                    int size8 = ((C0762ud) obj).size();
                                    iM3033c9 = AbstractC0397ki.m3034d(size8) + size8 + iM3033c9;
                                } else {
                                    iM3033c9 = AbstractC0397ki.m3032b((String) obj) + iM3033c9;
                                }
                            }
                        }
                    }
                    iM279b += iM3033c9;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(s70Var2, j);
                    r51 r51VarM4564n3 = so0Var.m4564n(i3);
                    Class cls7 = v51.f8095a;
                    int size9 = list6.size();
                    if (size9 == 0) {
                        iM3033c11 = 0;
                    } else {
                        iM3033c11 = AbstractC0397ki.m3033c(i5) * size9;
                        for (int i15 = 0; i15 < size9; i15++) {
                            int iMo2754a4 = ((AbstractC0342j0) list6.get(i15)).mo2754a(r51VarM4564n3);
                            iM3033c11 += AbstractC0397ki.m3034d(iMo2754a4) + iMo2754a4;
                        }
                    }
                    iM279b += iM3033c11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(s70Var2, j);
                    Class cls8 = v51.f8095a;
                    int size10 = list7.size();
                    if (size10 == 0) {
                        iM3033c9 = 0;
                    } else {
                        iM3033c9 = AbstractC0397ki.m3033c(i5) * size10;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int size11 = ((C0762ud) list7.get(i16)).size();
                            iM3033c9 += AbstractC0397ki.m3034d(size11) + size11;
                        }
                    }
                    iM279b += iM3033c9;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(s70Var2, j);
                    Class cls9 = v51.f8095a;
                    size = list8.size();
                    if (size == 0) {
                        iM3033c9 = 0;
                    } else {
                        iM5085i = v51.m5084h(list8);
                        iM3033c10 = AbstractC0397ki.m3033c(i5);
                        iM3033c9 = (iM3033c10 * size) + iM5085i;
                    }
                    iM279b += iM3033c9;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(s70Var2, j);
                    Class cls10 = v51.f8095a;
                    size = list9.size();
                    if (size == 0) {
                        iM3033c9 = 0;
                    } else {
                        iM5085i = v51.m5077a(list9);
                        iM3033c10 = AbstractC0397ki.m3033c(i5);
                        iM3033c9 = (iM3033c10 * size) + iM5085i;
                    }
                    iM279b += iM3033c9;
                    break;
                case 31:
                    iM5079c = v51.m5078b(i5, (List) unsafe.getObject(s70Var2, j));
                    iM279b += iM5079c;
                    break;
                case 32:
                    iM5079c = v51.m5079c(i5, (List) unsafe.getObject(s70Var2, j));
                    iM279b += iM5079c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(s70Var2, j);
                    Class cls11 = v51.f8095a;
                    size = list10.size();
                    if (size == 0) {
                        iM3033c9 = 0;
                    } else {
                        iM5085i = v51.m5082f(list10);
                        iM3033c10 = AbstractC0397ki.m3033c(i5);
                        iM3033c9 = (iM3033c10 * size) + iM5085i;
                    }
                    iM279b += iM3033c9;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(s70Var2, j);
                    Class cls12 = v51.f8095a;
                    size = list11.size();
                    if (size == 0) {
                        iM3033c9 = 0;
                    } else {
                        iM5085i = v51.m5083g(list11);
                        iM3033c10 = AbstractC0397ki.m3033c(i5);
                        iM3033c9 = (iM3033c10 * size) + iM5085i;
                    }
                    iM279b += iM3033c9;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(s70Var2, j);
                    Class cls13 = v51.f8095a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(s70Var2, j);
                    Class cls14 = v51.f8095a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 37:
                    size2 = v51.m5081e((List) unsafe.getObject(s70Var2, j));
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 38:
                    size2 = v51.m5085i((List) unsafe.getObject(s70Var2, j));
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 39:
                    size2 = v51.m5080d((List) unsafe.getObject(s70Var2, j));
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(s70Var2, j);
                    Class cls15 = v51.f8095a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(s70Var2, j);
                    Class cls16 = v51.f8095a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(s70Var2, j);
                    Class cls17 = v51.f8095a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 43:
                    size2 = v51.m5084h((List) unsafe.getObject(s70Var2, j));
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 44:
                    size2 = v51.m5077a((List) unsafe.getObject(s70Var2, j));
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(s70Var2, j);
                    Class cls18 = v51.f8095a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(s70Var2, j);
                    Class cls19 = v51.f8095a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 47:
                    size2 = v51.m5082f((List) unsafe.getObject(s70Var2, j));
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 48:
                    size2 = v51.m5083g((List) unsafe.getObject(s70Var2, j));
                    if (size2 > 0) {
                        iM3033c12 = AbstractC0397ki.m3033c(i5);
                        iM279b = AbstractC0024an.m279b(size2, iM3033c12, size2, iM279b);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(s70Var2, j);
                    r51 r51VarM4564n4 = so0Var.m4564n(i3);
                    Class cls20 = v51.f8095a;
                    int size12 = list19.size();
                    if (size12 == 0) {
                        iMo2754a3 = 0;
                    } else {
                        iMo2754a3 = 0;
                        for (int i17 = 0; i17 < size12; i17++) {
                            iMo2754a3 += ((AbstractC0342j0) list19.get(i17)).mo2754a(r51VarM4564n4) + (AbstractC0397ki.m3033c(i5) * 2);
                        }
                    }
                    iM279b += iMo2754a3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(s70Var2, j);
                    Object objM4563m = so0Var.m4563m(i3);
                    so0Var.f7175m.getClass();
                    zl0 zl0Var = (zl0) object3;
                    xl0 xl0Var = (xl0) objM4563m;
                    if (zl0Var.isEmpty()) {
                        iM3033c11 = 0;
                    } else {
                        iM3033c11 = 0;
                        for (Map.Entry entry : zl0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            xl0Var.getClass();
                            int iM3033c17 = AbstractC0397ki.m3033c(i5);
                            int iM5669a = xl0.m5669a(xl0Var.f8990a, key, value);
                            iM3033c11 = AbstractC0024an.m279b(iM5669a, iM5669a, iM3033c17, iM3033c11);
                        }
                    }
                    iM279b += iM3033c11;
                    break;
                case 51:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        iM3033c = AbstractC0397ki.m3033c(i5);
                        iM5079c = iM3033c + 8;
                        iM279b += iM5079c;
                    }
                    break;
                case 52:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        iM3033c13 = AbstractC0397ki.m3033c(i5);
                        iM5079c = iM3033c13 + 4;
                        iM279b += iM5079c;
                    }
                    break;
                case 53:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        long jM4543B = m4543B(s70Var2, j);
                        iM3033c14 = AbstractC0397ki.m3033c(i5);
                        iM3035e2 = AbstractC0397ki.m3035e(jM4543B);
                        iM279b += iM3035e2 + iM3033c14;
                    }
                    break;
                case 54:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        long jM4543B2 = m4543B(s70Var2, j);
                        iM3033c14 = AbstractC0397ki.m3033c(i5);
                        iM3035e2 = AbstractC0397ki.m3035e(jM4543B2);
                        iM279b += iM3035e2 + iM3033c14;
                    }
                    break;
                case 55:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        int iM4542A = m4542A(s70Var2, j);
                        iM3033c8 = AbstractC0397ki.m3033c(i5);
                        iMo2754a2 = AbstractC0397ki.m3031a(iM4542A);
                        iM5079c = iMo2754a2 + iM3033c8;
                        iM279b += iM5079c;
                    }
                    break;
                case 56:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        iM3033c = AbstractC0397ki.m3033c(i5);
                        iM5079c = iM3033c + 8;
                        iM279b += iM5079c;
                    }
                    break;
                case 57:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        iM3033c13 = AbstractC0397ki.m3033c(i5);
                        iM5079c = iM3033c13 + 4;
                        iM279b += iM5079c;
                    }
                    break;
                case 58:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        iM5079c = AbstractC0397ki.m3033c(i5) + 1;
                        iM279b += iM5079c;
                    }
                    break;
                case 59:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        Object object4 = unsafe.getObject(s70Var2, j);
                        if (object4 instanceof C0762ud) {
                            int iM3033c18 = AbstractC0397ki.m3033c(i5);
                            int size13 = ((C0762ud) object4).size();
                            iM3032b2 = AbstractC0024an.m279b(size13, size13, iM3033c18, iM279b);
                        } else {
                            iM3032b2 = AbstractC0397ki.m3032b((String) object4) + AbstractC0397ki.m3033c(i5) + iM279b;
                        }
                        iM279b = iM3032b2;
                    }
                    break;
                case 60:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        Object object5 = unsafe.getObject(s70Var2, j);
                        r51 r51VarM4564n5 = so0Var.m4564n(i3);
                        Class cls21 = v51.f8095a;
                        int iM3033c19 = AbstractC0397ki.m3033c(i5);
                        int iMo2754a5 = ((AbstractC0342j0) object5).mo2754a(r51VarM4564n5);
                        iM279b = AbstractC0024an.m279b(iMo2754a5, iMo2754a5, iM3033c19, iM279b);
                    }
                    break;
                case 61:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        C0762ud c0762ud2 = (C0762ud) unsafe.getObject(s70Var2, j);
                        iM3033c7 = AbstractC0397ki.m3033c(i5);
                        iMo2754a = c0762ud2.size();
                        iM279b = AbstractC0024an.m279b(iMo2754a, iMo2754a, iM3033c7, iM279b);
                    }
                    break;
                case 62:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        int iM4542A2 = m4542A(s70Var2, j);
                        iM3033c8 = AbstractC0397ki.m3033c(i5);
                        iMo2754a2 = AbstractC0397ki.m3034d(iM4542A2);
                        iM5079c = iMo2754a2 + iM3033c8;
                        iM279b += iM5079c;
                    }
                    break;
                case 63:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        int iM4542A3 = m4542A(s70Var2, j);
                        iM3033c8 = AbstractC0397ki.m3033c(i5);
                        iMo2754a2 = AbstractC0397ki.m3031a(iM4542A3);
                        iM5079c = iMo2754a2 + iM3033c8;
                        iM279b += iM5079c;
                    }
                    break;
                case 64:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        iM3033c13 = AbstractC0397ki.m3033c(i5);
                        iM5079c = iM3033c13 + 4;
                        iM279b += iM5079c;
                    }
                    break;
                case 65:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        iM3033c = AbstractC0397ki.m3033c(i5);
                        iM5079c = iM3033c + 8;
                        iM279b += iM5079c;
                    }
                    break;
                case 66:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        int iM4542A4 = m4542A(s70Var2, j);
                        iM3033c8 = AbstractC0397ki.m3033c(i5);
                        iMo2754a2 = AbstractC0397ki.m3034d((iM4542A4 >> 31) ^ (iM4542A4 << 1));
                        iM5079c = iMo2754a2 + iM3033c8;
                        iM279b += iM5079c;
                    }
                    break;
                case 67:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        long jM4543B3 = m4543B(s70Var2, j);
                        iM3033c14 = AbstractC0397ki.m3033c(i5);
                        iM3035e2 = AbstractC0397ki.m3035e((jM4543B3 << 1) ^ (jM4543B3 >> 63));
                        iM279b += iM3035e2 + iM3033c14;
                    }
                    break;
                case 68:
                    if (so0Var.m4567r(s70Var2, i5, i3)) {
                        iM5079c = ((AbstractC0342j0) unsafe.getObject(s70Var2, j)).mo2754a(so0Var.m4564n(i3)) + (AbstractC0397ki.m3033c(i5) * 2);
                        iM279b += iM5079c;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: h */
    public final void mo4255h(Object obj, b90 b90Var) {
        b90Var.getClass();
        m4559N(obj, b90Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // p000.r51
    /* JADX INFO: renamed from: i */
    public final boolean mo4256i(s70 s70Var, s70 s70Var2) {
        int[] iArr = this.f7163a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM5088l = true;
            if (i < length) {
                int iM4558M = m4558M(i);
                long j = iM4558M & 1048575;
                switch (m4545L(iM4558M)) {
                    case 0:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var = fg1.f2399c;
                            if (Double.doubleToLongBits(dg1Var.mo652e(s70Var, j)) != Double.doubleToLongBits(dg1Var.mo652e(s70Var2, j))) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 1:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var2 = fg1.f2399c;
                            if (Float.floatToIntBits(dg1Var2.mo653f(s70Var, j)) != Float.floatToIntBits(dg1Var2.mo653f(s70Var2, j))) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 2:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var3 = fg1.f2399c;
                            if (dg1Var3.m1206h(s70Var, j) != dg1Var3.m1206h(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 3:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var4 = fg1.f2399c;
                            if (dg1Var4.m1206h(s70Var, j) != dg1Var4.m1206h(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 4:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var5 = fg1.f2399c;
                            if (dg1Var5.m1205g(s70Var, j) != dg1Var5.m1205g(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 5:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var6 = fg1.f2399c;
                            if (dg1Var6.m1206h(s70Var, j) != dg1Var6.m1206h(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 6:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var7 = fg1.f2399c;
                            if (dg1Var7.m1205g(s70Var, j) != dg1Var7.m1205g(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 7:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var8 = fg1.f2399c;
                            if (dg1Var8.mo650c(s70Var, j) != dg1Var8.mo650c(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 8:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var9 = fg1.f2399c;
                            if (!v51.m5088l(dg1Var9.m1207i(s70Var, j), dg1Var9.m1207i(s70Var2, j))) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 9:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var10 = fg1.f2399c;
                            if (!v51.m5088l(dg1Var10.m1207i(s70Var, j), dg1Var10.m1207i(s70Var2, j))) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 10:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var11 = fg1.f2399c;
                            if (!v51.m5088l(dg1Var11.m1207i(s70Var, j), dg1Var11.m1207i(s70Var2, j))) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var12 = fg1.f2399c;
                            if (dg1Var12.m1205g(s70Var, j) != dg1Var12.m1205g(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var13 = fg1.f2399c;
                            if (dg1Var13.m1205g(s70Var, j) != dg1Var13.m1205g(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var14 = fg1.f2399c;
                            if (dg1Var14.m1205g(s70Var, j) != dg1Var14.m1205g(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 14:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var15 = fg1.f2399c;
                            if (dg1Var15.m1206h(s70Var, j) != dg1Var15.m1206h(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 15:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var16 = fg1.f2399c;
                            if (dg1Var16.m1205g(s70Var, j) != dg1Var16.m1205g(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 16:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var17 = fg1.f2399c;
                            if (dg1Var17.m1206h(s70Var, j) != dg1Var17.m1206h(s70Var2, j)) {
                                zM5088l = false;
                            }
                        }
                        break;
                    case 17:
                        if (!m4560j(s70Var, s70Var2, i)) {
                            zM5088l = false;
                        } else {
                            dg1 dg1Var18 = fg1.f2399c;
                            if (!v51.m5088l(dg1Var18.m1207i(s70Var, j), dg1Var18.m1207i(s70Var2, j))) {
                                zM5088l = false;
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
                        dg1 dg1Var19 = fg1.f2399c;
                        zM5088l = v51.m5088l(dg1Var19.m1207i(s70Var, j), dg1Var19.m1207i(s70Var2, j));
                        break;
                    case 50:
                        dg1 dg1Var20 = fg1.f2399c;
                        zM5088l = v51.m5088l(dg1Var20.m1207i(s70Var, j), dg1Var20.m1207i(s70Var2, j));
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
                        dg1 dg1Var21 = fg1.f2399c;
                        if (dg1Var21.m1205g(s70Var, j2) != dg1Var21.m1205g(s70Var2, j2) || !v51.m5088l(dg1Var21.m1207i(s70Var, j), dg1Var21.m1207i(s70Var2, j))) {
                            zM5088l = false;
                        }
                        break;
                }
                if (zM5088l) {
                    i += 3;
                }
            } else {
                this.f7174l.getClass();
                if (s70Var.unknownFields.equals(s70Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4560j(s70 s70Var, s70 s70Var2, int i) {
        return m4565o(i, s70Var) == m4565o(i, s70Var2);
    }

    /* JADX INFO: renamed from: k */
    public final Object m4561k(Object obj, int i, Object obj2, pf1 pf1Var, Object obj3) {
        C0630qt c0630qtM4562l;
        int i2 = this.f7163a[i];
        Object objM1207i = fg1.f2399c.m1207i(obj, m4558M(i) & 1048575);
        if (objM1207i == null || (c0630qtM4562l = m4562l(i)) == null) {
            return obj2;
        }
        this.f7175m.getClass();
        qd0 qd0Var = ((xl0) m4563m(i)).f8990a;
        Iterator it = ((zl0) objM1207i).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!c0630qtM4562l.m4138a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    pf1Var.getClass();
                    obj2 = pf1.m3902a(obj3);
                }
                int iM5669a = xl0.m5669a(qd0Var, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[iM5669a];
                C0250gi c0250gi = new C0250gi(bArr, 0, iM5669a);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C0932yz.m5854b(c0250gi, (jk1) qd0Var.f6471k, 1, key);
                    C0932yz.m5854b(c0250gi, (jk1) qd0Var.f6472l, 2, value);
                    if (c0250gi.m2057B() != 0) {
                        C0270h1.m2191g("Did not write as much data as expected.");
                        return null;
                    }
                    C0762ud c0762ud = new C0762ud(bArr);
                    pf1Var.getClass();
                    ((nf1) obj2).m3535c((i2 << 3) | 2, c0762ud);
                    it.remove();
                } catch (IOException e) {
                    dd0.m1163h(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: l */
    public final C0630qt m4562l(int i) {
        return (C0630qt) this.f7164b[((i / 3) * 2) + 1];
    }

    /* JADX INFO: renamed from: m */
    public final Object m4563m(int i) {
        return this.f7164b[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: n */
    public final r51 m4564n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f7164b;
        r51 r51Var = (r51) objArr[i2];
        if (r51Var != null) {
            return r51Var;
        }
        r51 r51VarM1525a = ey0.f2207c.m1525a((Class) objArr[i2 + 1]);
        objArr[i2] = r51VarM1525a;
        return r51VarM1525a;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4565o(int i, Object obj) {
        int i2 = this.f7163a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iM4558M = m4558M(i);
            long j2 = iM4558M & 1048575;
            switch (m4545L(iM4558M)) {
                case 0:
                    if (Double.doubleToRawLongBits(fg1.f2399c.mo652e(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(fg1.f2399c.mo653f(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (fg1.f2399c.m1206h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (fg1.f2399c.m1206h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (fg1.f2399c.m1205g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (fg1.f2399c.m1206h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (fg1.f2399c.m1205g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return fg1.f2399c.mo650c(obj, j2);
                case 8:
                    Object objM1207i = fg1.f2399c.m1207i(obj, j2);
                    if (objM1207i instanceof String) {
                        return !((String) objM1207i).isEmpty();
                    }
                    if (objM1207i instanceof C0762ud) {
                        return !C0762ud.f7797l.equals(objM1207i);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (fg1.f2399c.m1207i(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0762ud.f7797l.equals(fg1.f2399c.m1207i(obj, j2));
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (fg1.f2399c.m1205g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (fg1.f2399c.m1205g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (fg1.f2399c.m1205g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (fg1.f2399c.m1206h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (fg1.f2399c.m1205g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (fg1.f2399c.m1206h(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (fg1.f2399c.m1207i(obj, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & fg1.f2399c.m1205g(obj, j)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4566p(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m4565o(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m4567r(Object obj, int i, int i2) {
        return fg1.f2399c.m1205g(obj, (long) (this.f7163a[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: s */
    public final void m4568s(Object obj, int i, Object obj2, C0709sy c0709sy, C0212fi c0212fi) throws gf0, ff0 {
        long jM4558M = m4558M(i) & 1048575;
        Object objM1207i = fg1.f2399c.m1207i(obj, jM4558M);
        bm0 bm0Var = this.f7175m;
        if (objM1207i == null) {
            bm0Var.getClass();
            objM1207i = zl0.f9859k.m5938c();
            fg1.m1790p(jM4558M, obj, objM1207i);
        } else {
            bm0Var.getClass();
            if (!((zl0) objM1207i).f9860j) {
                zl0 zl0VarM5938c = zl0.f9859k.m5938c();
                bm0.m724a(zl0VarM5938c, objM1207i);
                fg1.m1790p(jM4558M, obj, zl0VarM5938c);
                objM1207i = zl0VarM5938c;
            }
        }
        bm0Var.getClass();
        zl0 zl0Var = (zl0) objM1207i;
        qd0 qd0Var = ((xl0) obj2).f8990a;
        c0212fi.m1813S(2);
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) c0212fi.f2412e;
        int iMo220f = abstractC0860x0.mo220f(abstractC0860x0.mo244z());
        Object obj3 = qd0Var.f6473m;
        Object objM1852q = "";
        Object objM1852q2 = obj3;
        while (true) {
            try {
                int iM1823b = c0212fi.m1823b();
                if (iM1823b == Integer.MAX_VALUE || abstractC0860x0.mo218c()) {
                    break;
                }
                if (iM1823b == 1) {
                    objM1852q = c0212fi.m1852q((jk1) qd0Var.f6471k, null, null);
                } else if (iM1823b != 2) {
                    try {
                        if (!c0212fi.m1814T()) {
                            throw new hf0("Unable to parse map entry.");
                        }
                    } catch (ff0 unused) {
                        if (!c0212fi.m1814T()) {
                            throw new hf0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM1852q2 = c0212fi.m1852q((jk1) qd0Var.f6472l, obj3.getClass(), c0709sy);
                }
            } catch (Throwable th) {
                abstractC0860x0.mo219e(iMo220f);
                throw th;
            }
        }
        zl0Var.put(objM1852q, objM1852q2);
        abstractC0860x0.mo219e(iMo220f);
    }

    /* JADX INFO: renamed from: t */
    public final void m4569t(int i, Object obj, Object obj2) {
        if (m4565o(i, obj2)) {
            long jM4558M = m4558M(i) & 1048575;
            Unsafe unsafe = f7162o;
            Object object = unsafe.getObject(obj2, jM4558M);
            if (object == null) {
                dd0.m1160e(this.f7163a[i], obj2);
                return;
            }
            r51 r51VarM4564n = m4564n(i);
            if (!m4565o(i, obj)) {
                if (m4546q(object)) {
                    s70 s70VarMo4251d = r51VarM4564n.mo4251d();
                    r51VarM4564n.mo4248a(s70VarMo4251d, object);
                    unsafe.putObject(obj, jM4558M, s70VarMo4251d);
                } else {
                    unsafe.putObject(obj, jM4558M, object);
                }
                m4554H(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM4558M);
            if (!m4546q(object2)) {
                s70 s70VarMo4251d2 = r51VarM4564n.mo4251d();
                r51VarM4564n.mo4248a(s70VarMo4251d2, object2);
                unsafe.putObject(obj, jM4558M, s70VarMo4251d2);
                object2 = s70VarMo4251d2;
            }
            r51VarM4564n.mo4248a(object2, object);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m4570u(int i, Object obj, Object obj2) {
        int[] iArr = this.f7163a;
        int i2 = iArr[i];
        if (m4567r(obj2, i2, i)) {
            long jM4558M = m4558M(i) & 1048575;
            Unsafe unsafe = f7162o;
            Object object = unsafe.getObject(obj2, jM4558M);
            if (object == null) {
                dd0.m1160e(iArr[i], obj2);
                return;
            }
            r51 r51VarM4564n = m4564n(i);
            if (!m4567r(obj, i2, i)) {
                if (m4546q(object)) {
                    s70 s70VarMo4251d = r51VarM4564n.mo4251d();
                    r51VarM4564n.mo4248a(s70VarMo4251d, object);
                    unsafe.putObject(obj, jM4558M, s70VarMo4251d);
                } else {
                    unsafe.putObject(obj, jM4558M, object);
                }
                m4555I(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM4558M);
            if (!m4546q(object2)) {
                s70 s70VarMo4251d2 = r51VarM4564n.mo4251d();
                r51VarM4564n.mo4248a(s70VarMo4251d2, object2);
                unsafe.putObject(obj, jM4558M, s70VarMo4251d2);
                object2 = s70VarMo4251d2;
            }
            r51VarM4564n.mo4248a(object2, object);
        }
    }

    /* JADX INFO: renamed from: v */
    public final Object m4571v(int i, Object obj) {
        r51 r51VarM4564n = m4564n(i);
        long jM4558M = m4558M(i) & 1048575;
        if (!m4565o(i, obj)) {
            return r51VarM4564n.mo4251d();
        }
        Object object = f7162o.getObject(obj, jM4558M);
        if (m4546q(object)) {
            return object;
        }
        s70 s70VarMo4251d = r51VarM4564n.mo4251d();
        if (object != null) {
            r51VarM4564n.mo4248a(s70VarMo4251d, object);
        }
        return s70VarMo4251d;
    }

    /* JADX INFO: renamed from: w */
    public final Object m4572w(Object obj, int i, int i2) {
        r51 r51VarM4564n = m4564n(i2);
        if (!m4567r(obj, i, i2)) {
            return r51VarM4564n.mo4251d();
        }
        Object object = f7162o.getObject(obj, m4558M(i2) & 1048575);
        if (m4546q(object)) {
            return object;
        }
        s70 s70VarMo4251d = r51VarM4564n.mo4251d();
        if (object != null) {
            r51VarM4564n.mo4248a(s70VarMo4251d, object);
        }
        return s70VarMo4251d;
    }
}
