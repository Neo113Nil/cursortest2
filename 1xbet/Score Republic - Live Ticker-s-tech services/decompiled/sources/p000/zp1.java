package p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zp1 implements hq1 {

    /* JADX INFO: renamed from: k */
    public static final int[] f9893k = new int[0];

    /* JADX INFO: renamed from: l */
    public static final Unsafe f9894l = tq1.m4836l();

    /* JADX INFO: renamed from: a */
    public final int[] f9895a;

    /* JADX INFO: renamed from: b */
    public final Object[] f9896b;

    /* JADX INFO: renamed from: c */
    public final int f9897c;

    /* JADX INFO: renamed from: d */
    public final int f9898d;

    /* JADX INFO: renamed from: e */
    public final do1 f9899e;

    /* JADX INFO: renamed from: f */
    public final boolean f9900f;

    /* JADX INFO: renamed from: g */
    public final int[] f9901g;

    /* JADX INFO: renamed from: h */
    public final int f9902h;

    /* JADX INFO: renamed from: i */
    public final int f9903i;

    /* JADX INFO: renamed from: j */
    public final wa0 f9904j;

    public zp1(int[] iArr, Object[] objArr, int i, int i2, do1 do1Var, int[] iArr2, int i3, int i4, wa0 wa0Var, x80 x80Var) {
        this.f9895a = iArr;
        this.f9896b = objArr;
        this.f9897c = i;
        this.f9898d = i2;
        this.f9900f = do1Var instanceof zo1;
        this.f9901g = iArr2;
        this.f9902h = i3;
        this.f9903i = i4;
        this.f9904j = wa0Var;
        this.f9899e = do1Var;
    }

    /* JADX INFO: renamed from: A */
    public static Field m5994A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            C0270h1.m2189e(AbstractC0024an.m285h(sb, " not found. Known fields are ", string), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m5995l(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m5996m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zo1) {
            return ((zo1) obj).m5965g();
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static void m5997n(Object obj) {
        if (m5996m(obj)) {
            return;
        }
        C0270h1.m2190f("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX INFO: renamed from: o */
    public static int m5998o(Object obj, long j) {
        return ((Integer) tq1.m4833i(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: p */
    public static long m5999p(Object obj, long j) {
        return ((Long) tq1.m4833i(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: x */
    public static final int m6000x(byte[] bArr, int i, int i2, wq1 wq1Var, Class cls, go1 go1Var) throws mp1 {
        wq1 wq1Var2 = wq1.f8639l;
        switch (wq1Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                go1Var.f2834c = Double.valueOf(Double.longBitsToDouble(a90.m107D(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                go1Var.f2834c = Float.valueOf(Float.intBitsToFloat(a90.m106C(i, bArr)));
                return i4;
            case 2:
            case 3:
                int iM104A = a90.m104A(bArr, i, go1Var);
                go1Var.f2834c = Long.valueOf(go1Var.f2833b);
                return iM104A;
            case 4:
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                int iM138w = a90.m138w(bArr, i, go1Var);
                go1Var.f2834c = Integer.valueOf(go1Var.f2832a);
                return iM138w;
            case 5:
            case 15:
                int i5 = i + 8;
                go1Var.f2834c = Long.valueOf(a90.m107D(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                go1Var.f2834c = Integer.valueOf(a90.m106C(i, bArr));
                return i6;
            case 7:
                int iM104A2 = a90.m104A(bArr, i, go1Var);
                go1Var.f2834c = Boolean.valueOf(go1Var.f2833b != 0);
                return iM104A2;
            case 8:
                return a90.m108E(bArr, i, go1Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                hq1 hq1VarM1495a = eq1.f2165c.m1495a(cls);
                zo1 zo1VarMo464a = hq1VarM1495a.mo464a();
                int iM110G = a90.m110G(zo1VarMo464a, hq1VarM1495a, bArr, i, i2, go1Var);
                hq1VarM1495a.mo472i(zo1VarMo464a);
                go1Var.f2834c = zo1VarMo464a;
                return iM110G;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return a90.m109F(bArr, i, go1Var);
            case 16:
                int iM138w2 = a90.m138w(bArr, i, go1Var);
                go1Var.f2834c = Integer.valueOf(AbstractC0860x0.m5487M(go1Var.f2832a));
                return iM138w2;
            case 17:
                int iM104A3 = a90.m104A(bArr, i, go1Var);
                go1Var.f2834c = Long.valueOf(AbstractC0860x0.m5488N(go1Var.f2833b));
                return iM104A3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:128:0x0284  */
    /* JADX WARN: Code duplicated, block: B:129:0x0287  */
    /* JADX WARN: Code duplicated, block: B:169:0x0354  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ab  */
    /* JADX INFO: renamed from: z */
    public static zp1 m6001z(gq1 gq1Var, wa0 wa0Var, x80 x80Var) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        int i17;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        int i21;
        Field fieldM5994A;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldM5994A2;
        int i28;
        Object obj2;
        Field fieldM5994A3;
        int i29;
        char cCharAt9;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        if (!(gq1Var instanceof gq1)) {
            dd0.m1158c();
            return null;
        }
        String str = gq1Var.f2850b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt2 = str.charAt(i);
        if (iCharAt2 >= 55296) {
            int i36 = iCharAt2 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                cCharAt12 = str.charAt(i35);
                if (cCharAt12 < 55296) {
                    break;
                }
                i36 |= (cCharAt12 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            iCharAt2 = i36 | (cCharAt12 << i37);
            i35 = i32;
        }
        if (iCharAt2 == 0) {
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = f9893k;
            i4 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt3 = str.charAt(i35);
            if (iCharAt3 >= 55296) {
                int i39 = iCharAt3 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    cCharAt7 = str.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                iCharAt3 = i39 | (cCharAt7 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int iCharAt4 = str.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    cCharAt6 = str.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                iCharAt4 = i42 | (cCharAt6 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int iCharAt5 = str.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    cCharAt5 = str.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                iCharAt5 = i45 | (cCharAt5 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int iCharAt6 = str.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    cCharAt4 = str.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                iCharAt6 = i48 | (cCharAt4 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            iCharAt = str.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    cCharAt3 = str.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                iCharAt = i51 | (cCharAt3 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    cCharAt2 = str.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                iCharAt7 = i54 | (cCharAt2 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            if (str.charAt(i53) >= 55296) {
                while (true) {
                    i9 = i56 + 1;
                    if (str.charAt(i56) < 55296) {
                        break;
                    }
                    i56 = i9;
                }
                i56 = i9;
            }
            int i57 = i56 + 1;
            int iCharAt8 = str.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = str.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt8 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            iArr = iArr2;
            i4 = iCharAt3;
            i35 = i57;
            i5 = iCharAt6;
            i6 = i60;
            i7 = iCharAt8;
        }
        Unsafe unsafe = f9894l;
        Object[] objArr2 = gq1Var.f2851c;
        Class<?> cls = gq1Var.f2849a.getClass();
        int i62 = i7 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i63];
        int i64 = i62;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int iCharAt9 = str.charAt(i35);
            if (iCharAt9 >= i33) {
                int i69 = iCharAt9 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    cCharAt11 = str.charAt(i70);
                    i16 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    length = i16;
                }
                iCharAt9 = i69 | (cCharAt11 << i71);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i68;
            }
            int i72 = i17 + 1;
            int iCharAt10 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (iCharAt10 >= 55296) {
                int i73 = iCharAt10 & 8191;
                int i74 = 13;
                while (true) {
                    i30 = i72 + 1;
                    cCharAt10 = str.charAt(i72);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i73 |= (cCharAt10 & 8191) << i74;
                    i74 += 13;
                    i72 = i30;
                    c = 55296;
                }
                iCharAt10 = i73 | (cCharAt10 << i74);
                i72 = i30;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i75 = iCharAt10 & 255;
            int i76 = iCharAt9;
            int i77 = iCharAt10 & 2048;
            if (i75 >= 51) {
                int i78 = i72 + 1;
                int iCharAt11 = str.charAt(i72);
                char c2 = 55296;
                if (iCharAt11 >= 55296) {
                    int i79 = iCharAt11 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        cCharAt9 = str.charAt(i80);
                        if (cCharAt9 < c2) {
                            break;
                        }
                        i79 |= (cCharAt9 & 8191) << i81;
                        i81 += 13;
                        i80 = i29;
                        c2 = 55296;
                    }
                    iCharAt11 = i79 | (cCharAt9 << i81);
                    i24 = i29;
                } else {
                    i24 = i78;
                }
                int i82 = i24;
                int i83 = i75 - 51;
                int i84 = iCharAt11;
                if (i83 == 9 || i83 == 17) {
                    i25 = i6 + 1;
                    int i85 = i67 / 3;
                    objArr3[i85 + i85 + 1] = objArr4[i6];
                } else {
                    if (i83 != 12) {
                        i26 = i77;
                    } else if (gq1Var.m2140a() == 1 || i77 != 0) {
                        i25 = i6 + 1;
                        int i86 = i67 / 3;
                        objArr3[i86 + i86 + 1] = objArr4[i6];
                    } else {
                        i26 = 0;
                    }
                    i27 = i84 + i84;
                    int i87 = i26;
                    obj = objArr4[i27];
                    if (obj instanceof Field) {
                        fieldM5994A2 = (Field) obj;
                    } else {
                        fieldM5994A2 = m5994A(cls, (String) obj);
                        objArr4[i27] = fieldM5994A2;
                        iArr[i64] = i67;
                        i64++;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM5994A2);
                    i28 = i27 + 1;
                    obj2 = objArr4[i28];
                    if (obj2 instanceof Field) {
                        fieldM5994A3 = (Field) obj2;
                    } else {
                        fieldM5994A3 = m5994A(cls, (String) obj2);
                        objArr4[i28] = fieldM5994A3;
                    }
                    i72 = i82;
                    i18 = iObjectFieldOffset3;
                    i21 = 0;
                    i19 = 55296;
                    objArr = objArr3;
                    i4 = i4;
                    cls = cls;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM5994A3);
                    i20 = i87;
                }
                i6 = i25;
                i26 = i77;
                i27 = i84 + i84;
                int i88 = i26;
                obj = objArr4[i27];
                if (obj instanceof Field) {
                    fieldM5994A2 = (Field) obj;
                } else {
                    fieldM5994A2 = m5994A(cls, (String) obj);
                    objArr4[i27] = fieldM5994A2;
                    iArr[i64] = i67;
                    i64++;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM5994A2);
                i28 = i27 + 1;
                obj2 = objArr4[i28];
                if (obj2 instanceof Field) {
                    fieldM5994A3 = (Field) obj2;
                } else {
                    fieldM5994A3 = m5994A(cls, (String) obj2);
                    objArr4[i28] = fieldM5994A3;
                }
                i72 = i82;
                i18 = iObjectFieldOffset4;
                i21 = 0;
                i19 = 55296;
                objArr = objArr3;
                i4 = i4;
                cls = cls;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM5994A3);
                i20 = i88;
            } else {
                int i89 = i6 + 1;
                Field fieldM5994A4 = m5994A(cls, (String) objArr4[i6]);
                objArr = objArr3;
                if (i75 == 9 || i75 == 17) {
                    int i90 = i67 / 3;
                    objArr[i90 + i90 + 1] = fieldM5994A4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i6 += 2;
                            i23 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i4 = i4;
                            if (gq1Var.m2140a() == 1 || i77 != 0) {
                                i6 += 2;
                                int i91 = i67 / 3;
                                objArr[i91 + i91 + 1] = objArr4[i89];
                                cls = cls;
                            } else {
                                cls = cls;
                                i6 = i89;
                                i77 = 0;
                            }
                        } else if (i75 == 50) {
                            int i92 = i6 + 2;
                            i65++;
                            iArr[i65] = i67;
                            int i93 = i67 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArr4[i89];
                            if (i77 != 0) {
                                i6 += 3;
                                objArr[i94 + 1] = objArr4[i92];
                            } else {
                                i6 = i92;
                                i77 = 0;
                            }
                            i4 = i4;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM5994A4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i75 > 17) {
                            i18 = iObjectFieldOffset;
                            i19 = 55296;
                            i20 = i77;
                            i21 = 0;
                        } else {
                            int i95 = i72 + 1;
                            int iCharAt12 = str.charAt(i72);
                            if (iCharAt12 >= 55296) {
                                int i96 = iCharAt12 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i22 = i95 + 1;
                                    cCharAt8 = str.charAt(i95);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt8 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i22;
                                }
                                iCharAt12 = i96 | (cCharAt8 << i97);
                                i95 = i22;
                            }
                            int i98 = (iCharAt12 / 32) + i4 + i4;
                            Object obj3 = objArr4[i98];
                            if (obj3 instanceof Field) {
                                fieldM5994A = (Field) obj3;
                            } else {
                                fieldM5994A = m5994A(cls, (String) obj3);
                                objArr4[i98] = fieldM5994A;
                            }
                            i18 = iObjectFieldOffset;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM5994A);
                            i21 = iCharAt12 % 32;
                            i72 = i95;
                            i20 = i77;
                            i19 = 55296;
                        }
                    } else {
                        i23 = 1;
                        i6 += 2;
                    }
                    int i99 = i67 / 3;
                    objArr[i99 + i99 + i23] = objArr4[i89];
                    cls = cls;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM5994A4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    } else {
                        i18 = iObjectFieldOffset;
                        i19 = 55296;
                        i20 = i77;
                        i21 = 0;
                    }
                }
                cls = cls;
                i6 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM5994A4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                } else {
                    i18 = iObjectFieldOffset;
                    i19 = 55296;
                    i20 = i77;
                    i21 = 0;
                }
            }
            int i100 = i67 + 1;
            iArr3[i67] = i76;
            int i101 = i67 + 2;
            iArr3[i100] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i18;
            i67 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i35 = i72;
            cls = cls;
            objArr2 = objArr4;
            i33 = i19;
            length = i16;
            objArr3 = objArr;
            i4 = i4;
            str = str;
        }
        return new zp1(iArr3, objArr3, i2, i5, gq1Var.f2849a, iArr, i7, i62, wa0Var, x80Var);
    }

    /* JADX INFO: renamed from: B */
    public final void m6002B(int i, Object obj, Object obj2) {
        if (m6016s(i, obj2)) {
            int iM6013k = m6013k(i) & 1048575;
            Unsafe unsafe = f9894l;
            long j = iM6013k;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.f9895a[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            hq1 hq1VarM6004D = m6004D(i);
            if (!m6016s(i, obj)) {
                if (m5996m(object)) {
                    zo1 zo1VarMo464a = hq1VarM6004D.mo464a();
                    hq1VarM6004D.mo467d(zo1VarMo464a, object);
                    unsafe.putObject(obj, j, zo1VarMo464a);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m6017t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m5996m(object2)) {
                zo1 zo1VarMo464a2 = hq1VarM6004D.mo464a();
                hq1VarM6004D.mo467d(zo1VarMo464a2, object2);
                unsafe.putObject(obj, j, zo1VarMo464a2);
                object2 = zo1VarMo464a2;
            }
            hq1VarM6004D.mo467d(object2, object);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m6003C(int i, Object obj, Object obj2) {
        int[] iArr = this.f9895a;
        int i2 = iArr[i];
        if (m6018u(obj2, i2, i)) {
            int iM6013k = m6013k(i) & 1048575;
            Unsafe unsafe = f9894l;
            long j = iM6013k;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            hq1 hq1VarM6004D = m6004D(i);
            if (!m6018u(obj, i2, i)) {
                if (m5996m(object)) {
                    zo1 zo1VarMo464a = hq1VarM6004D.mo464a();
                    hq1VarM6004D.mo467d(zo1VarMo464a, object);
                    unsafe.putObject(obj, j, zo1VarMo464a);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                m6019v(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m5996m(object2)) {
                zo1 zo1VarMo464a2 = hq1VarM6004D.mo464a();
                hq1VarM6004D.mo467d(zo1VarMo464a2, object2);
                unsafe.putObject(obj, j, zo1VarMo464a2);
                object2 = zo1VarMo464a2;
            }
            hq1VarM6004D.mo467d(object2, object);
        }
    }

    /* JADX INFO: renamed from: D */
    public final hq1 m6004D(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f9896b;
        hq1 hq1Var = (hq1) objArr[i3];
        if (hq1Var != null) {
            return hq1Var;
        }
        hq1 hq1VarM1495a = eq1.f2165c.m1495a((Class) objArr[i3 + 1]);
        objArr[i3] = hq1VarM1495a;
        return hq1VarM1495a;
    }

    /* JADX INFO: renamed from: E */
    public final Object m6005E(int i) {
        int i2 = i / 3;
        return this.f9896b[i2 + i2];
    }

    /* JADX INFO: renamed from: F */
    public final yn1 m6006F(int i) {
        int i2 = i / 3;
        return (yn1) this.f9896b[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: G */
    public final Object m6007G(int i, Object obj) {
        hq1 hq1VarM6004D = m6004D(i);
        int iM6013k = m6013k(i) & 1048575;
        if (!m6016s(i, obj)) {
            return hq1VarM6004D.mo464a();
        }
        Object object = f9894l.getObject(obj, iM6013k);
        if (m5996m(object)) {
            return object;
        }
        zo1 zo1VarMo464a = hq1VarM6004D.mo464a();
        if (object != null) {
            hq1VarM6004D.mo467d(zo1VarMo464a, object);
        }
        return zo1VarMo464a;
    }

    /* JADX INFO: renamed from: H */
    public final void m6008H(int i, Object obj, Object obj2) {
        f9894l.putObject(obj, m6013k(i) & 1048575, obj2);
        m6017t(i, obj);
    }

    /* JADX INFO: renamed from: I */
    public final Object m6009I(Object obj, int i, int i2) {
        hq1 hq1VarM6004D = m6004D(i2);
        if (!m6018u(obj, i, i2)) {
            return hq1VarM6004D.mo464a();
        }
        Object object = f9894l.getObject(obj, m6013k(i2) & 1048575);
        if (m5996m(object)) {
            return object;
        }
        zo1 zo1VarMo464a = hq1VarM6004D.mo464a();
        if (object != null) {
            hq1VarM6004D.mo467d(zo1VarMo464a, object);
        }
        return zo1VarMo464a;
    }

    /* JADX INFO: renamed from: J */
    public final void m6010J(int i, int i2, Object obj, Object obj2) {
        f9894l.putObject(obj, m6013k(i2) & 1048575, obj2);
        m6019v(obj, i, i2);
    }

    /* JADX INFO: renamed from: K */
    public final Object m6011K(Object obj, int i, Object obj2, wa0 wa0Var, Object obj3) {
        yn1 yn1VarM6006F;
        int i2 = this.f9895a[i];
        Object objM4833i = tq1.m4833i(obj, m6013k(i) & 1048575);
        if (objM4833i == null || (yn1VarM6006F = m6006F(i)) == null) {
            return obj2;
        }
        oq0 oq0Var = ((qp1) m6005E(i)).f6560a;
        Iterator it = ((rp1) objM4833i).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!yn1VarM6006F.m5816a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    wa0Var.getClass();
                    obj2 = wa0.m5306u(obj3);
                }
                int iM4123b = qp1.m4123b(oq0Var, entry.getKey(), entry.getValue());
                jo1 jo1Var = ko1.f4486k;
                byte[] bArr = new byte[iM4123b];
                boolean z = ro1.f6926b;
                no1 no1Var = new no1(iM4123b, bArr);
                try {
                    qp1.m4122a(no1Var, oq0Var, entry.getKey(), entry.getValue());
                    if (no1Var.m3576x() > 0) {
                        C0270h1.m2191g("Did not write as much data as expected.");
                        return null;
                    }
                    if (no1Var.m3576x() < 0) {
                        C0270h1.m2191g("Wrote more data than expected.");
                        return null;
                    }
                    jo1 jo1Var2 = new jo1(bArr);
                    wa0Var.getClass();
                    ((oq1) obj2).m3751d((i2 << 3) | 2, jo1Var2);
                    it.remove();
                } catch (IOException e) {
                    dd0.m1163h(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: L */
    public final void m6012L(int i, C0212fi c0212fi, Object obj) {
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) c0212fi.f2412e;
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            c0212fi.m1842k0(2);
            tq1.m4834j(j, obj, abstractC0860x0.mo3259a0());
        } else if (!this.f9900f) {
            tq1.m4834j(j, obj, c0212fi.m1856s0());
        } else {
            c0212fi.m1842k0(2);
            tq1.m4834j(j, obj, abstractC0860x0.mo3258Z());
        }
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: a */
    public final zo1 mo464a() {
        return ((zo1) this.f9899e).m5967i();
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: b */
    public final int mo465b(zo1 zo1Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int iHashCode = 0;
        for (int i5 = 0; i5 < this.f9895a.length; i5 += 3) {
            int iM6013k = m6013k(i5);
            int iM5995l = m5995l(iM6013k);
            if (iM5995l <= 50 || iM5995l >= 69) {
                long j = iM6013k & 1048575;
                int iHashCode2 = 37;
                switch (iM5995l) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(tq1.f7570c.mo4131y(zo1Var, j));
                        byte[] bArr = ip1.f3634a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(tq1.f7570c.mo4129v(zo1Var, j));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tq1.m4831g(zo1Var, j);
                        byte[] bArr2 = ip1.f3634a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tq1.m4831g(zo1Var, j);
                        byte[] bArr3 = ip1.f3634a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tq1.m4829e(zo1Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tq1.m4831g(zo1Var, j);
                        byte[] bArr4 = ip1.f3634a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tq1.m4829e(zo1Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zMo4127q = tq1.f7570c.mo4127q(zo1Var, j);
                        byte[] bArr5 = ip1.f3634a;
                        i3 = zMo4127q ? 1231 : 1237;
                        iHashCode = i + i3;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) tq1.m4833i(zo1Var, j)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i4 = iHashCode * 53;
                        Object objM4833i = tq1.m4833i(zo1Var, j);
                        if (objM4833i != null) {
                            iHashCode2 = objM4833i.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tq1.m4833i(zo1Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tq1.m4829e(zo1Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tq1.m4829e(zo1Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tq1.m4829e(zo1Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tq1.m4831g(zo1Var, j);
                        byte[] bArr6 = ip1.f3634a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tq1.m4829e(zo1Var, j);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = tq1.m4831g(zo1Var, j);
                        byte[] bArr7 = ip1.f3634a;
                        i3 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + i3;
                        break;
                    case 17:
                        i4 = iHashCode * 53;
                        Object objM4833i2 = tq1.m4833i(zo1Var, j);
                        if (objM4833i2 != null) {
                            iHashCode2 = objM4833i2.hashCode();
                        }
                        iHashCode = i4 + iHashCode2;
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
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tq1.m4833i(zo1Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = tq1.m4833i(zo1Var, j).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.f9903i;
        while (true) {
            int[] iArr = this.f9901g;
            if (i6 >= iArr.length) {
                return zo1Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i7 = iArr[i6];
            if (!m6018u(zo1Var, 0, i7)) {
                iHashCode = tq1.m4833i(zo1Var, m6013k(i7) & 1048575).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: c */
    public final void mo466c(Object obj, jg0 jg0Var) {
        int i;
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        Unsafe unsafe = f9894l;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f9895a;
            if (i4 >= iArr.length) {
                ((zo1) obj).zzc.m3749b(jg0Var);
                return;
            }
            int iM6013k = m6013k(i4);
            int iM5995l = m5995l(iM6013k);
            int i6 = iArr[i4];
            if (iM5995l <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iM6013k & i2;
            switch (iM5995l) {
                case 0:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3561i(i6, Double.doubleToRawLongBits(tq1.f7570c.mo4131y(obj, j)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3559g(i6, Float.floatToRawIntBits(tq1.f7570c.mo4129v(obj, j)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3560h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3560h(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3557e(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3561i(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3559g(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3562j(i6, tq1.f7570c.mo4127q(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ro1Var.mo3563k((String) object, i6);
                        } else {
                            ro1Var.mo3564l(i6, (ko1) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        jg0Var.m2858o(i6, unsafe.getObject(obj, j), m6004D(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3564l(i6, (ko1) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3558f(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3557e(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3559g(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        ro1Var.mo3561i(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        ro1Var.mo3558f(i6, (i9 >> 31) ^ (i9 + i9));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ro1Var.mo3560h(i6, (j2 >> 63) ^ (j2 + j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (m6015r(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        ro1Var.mo3556d(i6, 3);
                        m6004D(i4).mo466c((do1) object2, jg0Var);
                        ro1Var.mo3556d(i6, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    iq1.m2673d(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    iq1.m2674e(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    iq1.m2675f(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    iq1.m2676g(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    iq1.m2680k(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    iq1.m2678i(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    iq1.m2683n(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    iq1.m2686q(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i10 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    wa0 wa0Var = iq1.f3637a;
                    if (list != null && !list.isEmpty()) {
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            ro1Var.mo3563k((String) list.get(i11), i10);
                        }
                    }
                    break;
                case 27:
                    int i12 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    hq1 hq1VarM6004D = m6004D(i4);
                    wa0 wa0Var2 = iq1.f3637a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            jg0Var.m2858o(i12, list2.get(i13), hq1VarM6004D);
                        }
                    }
                    break;
                case 28:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    wa0 wa0Var3 = iq1.f3637a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            ro1Var.mo3564l(i14, (ko1) list3.get(i15));
                        }
                    }
                    break;
                case 29:
                    iq1.m2681l(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    iq1.m2685p(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    iq1.m2684o(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    iq1.m2679j(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    iq1.m2682m(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    iq1.m2677h(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    iq1.m2673d(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 36:
                    iq1.m2674e(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 37:
                    iq1.m2675f(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 38:
                    iq1.m2676g(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 39:
                    iq1.m2680k(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 40:
                    iq1.m2678i(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 41:
                    iq1.m2683n(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 42:
                    iq1.m2686q(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 43:
                    iq1.m2681l(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 44:
                    iq1.m2685p(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 45:
                    iq1.m2684o(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 46:
                    iq1.m2679j(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 47:
                    iq1.m2682m(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 48:
                    iq1.m2677h(iArr[i4], (List) unsafe.getObject(obj, j), jg0Var, true);
                    break;
                case 49:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    hq1 hq1VarM6004D2 = m6004D(i4);
                    wa0 wa0Var4 = iq1.f3637a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            do1 do1Var = (do1) list4.get(i17);
                            ro1Var.mo3556d(i16, 3);
                            hq1VarM6004D2.mo466c(do1Var, jg0Var);
                            ro1Var.mo3556d(i16, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        oq0 oq0Var = ((qp1) m6005E(i4)).f6560a;
                        for (Map.Entry entry : ((rp1) object3).entrySet()) {
                            ro1Var.mo3556d(i6, 2);
                            ro1Var.mo3570r(qp1.m4123b(oq0Var, entry.getKey(), entry.getValue()));
                            qp1.m4122a(ro1Var, oq0Var, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case 51:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3561i(i6, Double.doubleToRawLongBits(((Double) tq1.m4833i(obj, j)).doubleValue()));
                    }
                    break;
                case 52:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3559g(i6, Float.floatToRawIntBits(((Float) tq1.m4833i(obj, j)).floatValue()));
                    }
                    break;
                case 53:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3560h(i6, m5999p(obj, j));
                    }
                    break;
                case 54:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3560h(i6, m5999p(obj, j));
                    }
                    break;
                case 55:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3557e(i6, m5998o(obj, j));
                    }
                    break;
                case 56:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3561i(i6, m5999p(obj, j));
                    }
                    break;
                case 57:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3559g(i6, m5998o(obj, j));
                    }
                    break;
                case 58:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3562j(i6, ((Boolean) tq1.m4833i(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (m6018u(obj, i6, i4)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            ro1Var.mo3563k((String) object4, i6);
                        } else {
                            ro1Var.mo3564l(i6, (ko1) object4);
                        }
                    }
                    break;
                case 60:
                    if (m6018u(obj, i6, i4)) {
                        jg0Var.m2858o(i6, unsafe.getObject(obj, j), m6004D(i4));
                    }
                    break;
                case 61:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3564l(i6, (ko1) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3558f(i6, m5998o(obj, j));
                    }
                    break;
                case 63:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3557e(i6, m5998o(obj, j));
                    }
                    break;
                case 64:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3559g(i6, m5998o(obj, j));
                    }
                    break;
                case 65:
                    if (m6018u(obj, i6, i4)) {
                        ro1Var.mo3561i(i6, m5999p(obj, j));
                    }
                    break;
                case 66:
                    if (m6018u(obj, i6, i4)) {
                        int iM5998o = m5998o(obj, j);
                        ro1Var.mo3558f(i6, (iM5998o >> 31) ^ (iM5998o + iM5998o));
                    }
                    break;
                case 67:
                    if (m6018u(obj, i6, i4)) {
                        long jM5999p = m5999p(obj, j);
                        ro1Var.mo3560h(i6, (jM5999p >> 63) ^ (jM5999p + jM5999p));
                    }
                    break;
                case 68:
                    if (m6018u(obj, i6, i4)) {
                        Object object5 = unsafe.getObject(obj, j);
                        ro1Var.mo3556d(i6, 3);
                        m6004D(i4).mo466c((do1) object5, jg0Var);
                        ro1Var.mo3556d(i6, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // p000.hq1
    /* JADX INFO: renamed from: d */
    public final void mo467d(Object obj, Object obj2) {
        Object obj3;
        m5997n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f9895a;
            if (i >= iArr.length) {
                iq1.m2671b(obj, obj2);
                return;
            }
            int iM6013k = m6013k(i);
            int i2 = 1048575 & iM6013k;
            int iM5995l = m5995l(iM6013k);
            int i3 = iArr[i];
            long j = i2;
            switch (iM5995l) {
                case 0:
                    if (!m6016s(i, obj2)) {
                        obj3 = obj;
                    } else {
                        sq1 sq1Var = tq1.f7570c;
                        obj3 = obj;
                        sq1Var.mo4125A(obj3, j, sq1Var.mo4131y(obj2, j));
                        m6017t(i, obj3);
                    }
                    break;
                case 1:
                    if (m6016s(i, obj2)) {
                        sq1 sq1Var2 = tq1.f7570c;
                        sq1Var2.mo4130x(obj, j, sq1Var2.mo4129v(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m6016s(i, obj2)) {
                        tq1.m4832h(obj, j, tq1.m4831g(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m6016s(i, obj2)) {
                        tq1.m4832h(obj, j, tq1.m4831g(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m6016s(i, obj2)) {
                        tq1.m4830f(obj, j, tq1.m4829e(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m6016s(i, obj2)) {
                        tq1.m4832h(obj, j, tq1.m4831g(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m6016s(i, obj2)) {
                        tq1.m4830f(obj, j, tq1.m4829e(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m6016s(i, obj2)) {
                        sq1 sq1Var3 = tq1.f7570c;
                        sq1Var3.mo4128s(obj, j, sq1Var3.mo4127q(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m6016s(i, obj2)) {
                        tq1.m4834j(j, obj, tq1.m4833i(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    m6002B(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m6016s(i, obj2)) {
                        tq1.m4834j(j, obj, tq1.m4833i(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (m6016s(i, obj2)) {
                        tq1.m4830f(obj, j, tq1.m4829e(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (m6016s(i, obj2)) {
                        tq1.m4830f(obj, j, tq1.m4829e(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (m6016s(i, obj2)) {
                        tq1.m4830f(obj, j, tq1.m4829e(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m6016s(i, obj2)) {
                        tq1.m4832h(obj, j, tq1.m4831g(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m6016s(i, obj2)) {
                        tq1.m4830f(obj, j, tq1.m4829e(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m6016s(i, obj2)) {
                        tq1.m4832h(obj, j, tq1.m4831g(obj2, j));
                        m6017t(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    m6002B(i, obj, obj2);
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
                    kp1 kp1VarMo460m = (kp1) tq1.m4833i(obj, j);
                    kp1 kp1Var = (kp1) tq1.m4833i(obj2, j);
                    int size = kp1VarMo460m.size();
                    int size2 = kp1Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((eo1) kp1VarMo460m).f2152j) {
                            kp1VarMo460m = kp1VarMo460m.mo460m(size2 + size);
                        }
                        kp1VarMo460m.addAll(kp1Var);
                    }
                    if (size > 0) {
                        kp1Var = kp1VarMo460m;
                    }
                    tq1.m4834j(j, obj, kp1Var);
                    obj3 = obj;
                    break;
                case 50:
                    wa0 wa0Var = iq1.f3637a;
                    tq1.m4834j(j, obj, u90.m4899i(tq1.m4833i(obj, j), tq1.m4833i(obj2, j)));
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
                    if (m6018u(obj2, i3, i)) {
                        tq1.m4834j(j, obj, tq1.m4833i(obj2, j));
                        m6019v(obj, i3, i);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    m6003C(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m6018u(obj2, i3, i)) {
                        tq1.m4834j(j, obj, tq1.m4833i(obj2, j));
                        m6019v(obj, i3, i);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    m6003C(i, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:187:0x048e  */
    /* JADX WARN: Code duplicated, block: B:219:0x057e  */
    /* JADX WARN: Code duplicated, block: B:222:0x058c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3  */
    @Override // p000.hq1
    /* JADX INFO: renamed from: e */
    public final int mo468e(do1 do1Var) {
        int i;
        int iM4391a;
        int iM4392b;
        int iM4391a2;
        int iM5184b;
        int iM4391a3;
        int iMo1276c;
        int i2;
        int iM4391a4;
        int iM2695z;
        int i3;
        int iMo1276c2;
        int iM4391a5;
        int size;
        int iM2688s;
        int iM4391a6;
        int iM4391a7;
        int iM4391a8;
        int size2;
        int iM4391a9;
        int iMo1276c3;
        int iM4391a10;
        int iM4392b2;
        int iM4391a11;
        int iM5184b2;
        int iM5998o;
        int iM4391a12;
        Unsafe unsafe = f9894l;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iM2771f = 0;
        while (true) {
            int[] iArr = this.f9895a;
            if (i6 >= iArr.length) {
                return ((zo1) do1Var).zzc.m3750c() + iM2771f;
            }
            int iM6013k = m6013k(i6);
            int iM5995l = m5995l(iM6013k);
            int i8 = iArr[i6];
            int i9 = iArr[i6 + 2];
            int i10 = i9 & i4;
            if (iM5995l <= 17) {
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(do1Var, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iM6013k & i4;
            if (iM5995l >= vo1.f8232k.f8236j) {
                vo1.f8233l.getClass();
            }
            long j = i11;
            switch (iM5995l) {
                case 0:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        iM2771f = j11.m2771f(i8 << 3, 8, iM2771f);
                    }
                    break;
                case 1:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        iM2771f = j11.m2771f(i8 << 3, 4, iM2771f);
                    }
                    break;
                case 2:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(do1Var, j);
                        iM4391a = ro1.m4391a(i8 << 3);
                        iM4392b = ro1.m4392b(j2);
                        iM2695z = iM4392b + iM4391a;
                        iM2771f += iM2695z;
                    }
                    break;
                case 3:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(do1Var, j);
                        iM4391a = ro1.m4391a(i8 << 3);
                        iM4392b = ro1.m4392b(j3);
                        iM2695z = iM4392b + iM4391a;
                        iM2771f += iM2695z;
                    }
                    break;
                case 4:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        long j4 = unsafe.getInt(do1Var, j);
                        iM4391a = ro1.m4391a(i8 << 3);
                        iM4392b = ro1.m4392b(j4);
                        iM2695z = iM4392b + iM4391a;
                        iM2771f += iM2695z;
                    }
                    break;
                case 5:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        iM2771f = j11.m2771f(i8 << 3, 8, iM2771f);
                    }
                    break;
                case 6:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        iM2771f = j11.m2771f(i8 << 3, 4, iM2771f);
                    }
                    break;
                case 7:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        iM2771f = j11.m2771f(i8 << 3, 1, iM2771f);
                    }
                    break;
                case 8:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(do1Var, j);
                        if (object instanceof ko1) {
                            iM4391a2 = ro1.m4391a(i12);
                            iM5184b = ((ko1) object).mo2330c();
                        } else {
                            iM4391a2 = ro1.m4391a(i12);
                            iM5184b = vq1.m5184b((String) object);
                        }
                        iM2771f = j11.m2772g(iM5184b, iM5184b, iM4391a2, iM2771f);
                    }
                    break;
                case 9:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        Object object2 = unsafe.getObject(do1Var, j);
                        hq1 hq1VarM6004D = m6004D(i6);
                        wa0 wa0Var = iq1.f3637a;
                        iM4391a3 = ro1.m4391a(i8 << 3);
                        iMo1276c = ((do1) object2).mo1276c(hq1VarM6004D);
                        iM2771f = j11.m2772g(iMo1276c, iMo1276c, iM4391a3, iM2771f);
                    }
                    break;
                case 10:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        ko1 ko1Var = (ko1) unsafe.getObject(do1Var, j);
                        iM4391a2 = ro1.m4391a(i8 << 3);
                        iM5184b = ko1Var.mo2330c();
                        iM2771f = j11.m2772g(iM5184b, iM5184b, iM4391a2, iM2771f);
                    }
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        i2 = unsafe.getInt(do1Var, j);
                        iM4391a4 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2771f(i2, iM4391a4, iM2771f);
                    }
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        long j5 = unsafe.getInt(do1Var, j);
                        iM4391a = ro1.m4391a(i8 << 3);
                        iM4392b = ro1.m4392b(j5);
                        iM2695z = iM4392b + iM4391a;
                        iM2771f += iM2695z;
                    }
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        iM2771f = j11.m2771f(i8 << 3, 4, iM2771f);
                    }
                    break;
                case 14:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        iM2771f = j11.m2771f(i8 << 3, 8, iM2771f);
                    }
                    break;
                case 15:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        int i13 = unsafe.getInt(do1Var, j);
                        iM4391a4 = ro1.m4391a(i8 << 3);
                        i2 = (i13 >> 31) ^ (i13 + i13);
                        iM2771f = j11.m2771f(i2, iM4391a4, iM2771f);
                    }
                    break;
                case 16:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        long j6 = unsafe.getLong(do1Var, j);
                        iM4391a = ro1.m4391a(i8 << 3);
                        iM4392b = ro1.m4392b((j6 >> 63) ^ (j6 + j6));
                        iM2695z = iM4392b + iM4391a;
                        iM2771f += iM2695z;
                    }
                    break;
                case 17:
                    if (m6015r(do1Var, i6, i5, i7, i)) {
                        do1 do1Var2 = (do1) unsafe.getObject(do1Var, j);
                        hq1 hq1VarM6004D2 = m6004D(i6);
                        wa0 wa0Var2 = iq1.f3637a;
                        int iM4391a13 = ro1.m4391a(i8 << 3);
                        i3 = iM4391a13 + iM4391a13;
                        iMo1276c2 = do1Var2.mo1276c(hq1VarM6004D2);
                        iM2695z = iMo1276c2 + i3;
                        iM2771f += iM2695z;
                    }
                    break;
                case 18:
                    iM2695z = iq1.m2695z(i8, (List) unsafe.getObject(do1Var, j));
                    iM2771f += iM2695z;
                    break;
                case 19:
                    iM2695z = iq1.m2694y(i8, (List) unsafe.getObject(do1Var, j));
                    iM2771f += iM2695z;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var3 = iq1.f3637a;
                    if (list.size() == 0) {
                        iM4391a5 = 0;
                    } else {
                        iM4391a5 = (ro1.m4391a(i8 << 3) * list.size()) + iq1.m2687r(list);
                    }
                    iM2771f += iM4391a5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var4 = iq1.f3637a;
                    size = list2.size();
                    if (size == 0) {
                        iM4391a7 = 0;
                    } else {
                        iM2688s = iq1.m2688s(list2);
                        iM4391a6 = ro1.m4391a(i8 << 3);
                        iM4391a7 = (iM4391a6 * size) + iM2688s;
                    }
                    iM2771f += iM4391a7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var5 = iq1.f3637a;
                    size = list3.size();
                    if (size == 0) {
                        iM4391a7 = 0;
                    } else {
                        iM2688s = iq1.m2691v(list3);
                        iM4391a6 = ro1.m4391a(i8 << 3);
                        iM4391a7 = (iM4391a6 * size) + iM2688s;
                    }
                    iM2771f += iM4391a7;
                    break;
                case 23:
                    iM2695z = iq1.m2695z(i8, (List) unsafe.getObject(do1Var, j));
                    iM2771f += iM2695z;
                    break;
                case 24:
                    iM2695z = iq1.m2694y(i8, (List) unsafe.getObject(do1Var, j));
                    iM2771f += iM2695z;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var6 = iq1.f3637a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iM4391a5 = 0;
                    } else {
                        iM4391a5 = (ro1.m4391a(i8 << 3) + 1) * size3;
                    }
                    iM2771f += iM4391a5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var7 = iq1.f3637a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iM4391a7 = 0;
                    } else {
                        iM4391a7 = ro1.m4391a(i8 << 3) * size4;
                        for (int i14 = 0; i14 < size4; i14++) {
                            Object obj = list5.get(i14);
                            int iMo2330c = obj instanceof ko1 ? ((ko1) obj).mo2330c() : vq1.m5184b((String) obj);
                            iM4391a7 = j11.m2771f(iMo2330c, iMo2330c, iM4391a7);
                        }
                    }
                    iM2771f += iM4391a7;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(do1Var, j);
                    hq1 hq1VarM6004D3 = m6004D(i6);
                    wa0 wa0Var8 = iq1.f3637a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iM4391a8 = 0;
                    } else {
                        iM4391a8 = ro1.m4391a(i8 << 3) * size5;
                        for (int i15 = 0; i15 < size5; i15++) {
                            int iMo1276c4 = ((do1) list6.get(i15)).mo1276c(hq1VarM6004D3);
                            iM4391a8 = j11.m2771f(iMo1276c4, iMo1276c4, iM4391a8);
                        }
                    }
                    iM2771f += iM4391a8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var9 = iq1.f3637a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iM4391a7 = 0;
                    } else {
                        iM4391a7 = ro1.m4391a(i8 << 3) * size6;
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            int iMo2330c2 = ((ko1) list7.get(i16)).mo2330c();
                            iM4391a7 = j11.m2771f(iMo2330c2, iMo2330c2, iM4391a7);
                        }
                    }
                    iM2771f += iM4391a7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var10 = iq1.f3637a;
                    size = list8.size();
                    if (size == 0) {
                        iM4391a7 = 0;
                    } else {
                        iM2688s = iq1.m2692w(list8);
                        iM4391a6 = ro1.m4391a(i8 << 3);
                        iM4391a7 = (iM4391a6 * size) + iM2688s;
                    }
                    iM2771f += iM4391a7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var11 = iq1.f3637a;
                    size = list9.size();
                    if (size == 0) {
                        iM4391a7 = 0;
                    } else {
                        iM2688s = iq1.m2690u(list9);
                        iM4391a6 = ro1.m4391a(i8 << 3);
                        iM4391a7 = (iM4391a6 * size) + iM2688s;
                    }
                    iM2771f += iM4391a7;
                    break;
                case 31:
                    iM2695z = iq1.m2694y(i8, (List) unsafe.getObject(do1Var, j));
                    iM2771f += iM2695z;
                    break;
                case 32:
                    iM2695z = iq1.m2695z(i8, (List) unsafe.getObject(do1Var, j));
                    iM2771f += iM2695z;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var12 = iq1.f3637a;
                    size = list10.size();
                    if (size == 0) {
                        iM4391a7 = 0;
                    } else {
                        iM2688s = iq1.m2693x(list10);
                        iM4391a6 = ro1.m4391a(i8 << 3);
                        iM4391a7 = (iM4391a6 * size) + iM2688s;
                    }
                    iM2771f += iM4391a7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var13 = iq1.f3637a;
                    size = list11.size();
                    if (size == 0) {
                        iM4391a7 = 0;
                    } else {
                        iM2688s = iq1.m2689t(list11);
                        iM4391a6 = ro1.m4391a(i8 << 3);
                        iM4391a7 = (iM4391a6 * size) + iM2688s;
                    }
                    iM2771f += iM4391a7;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var14 = iq1.f3637a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var15 = iq1.f3637a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 37:
                    size2 = iq1.m2687r((List) unsafe.getObject(do1Var, j));
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 38:
                    size2 = iq1.m2688s((List) unsafe.getObject(do1Var, j));
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 39:
                    size2 = iq1.m2691v((List) unsafe.getObject(do1Var, j));
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var16 = iq1.f3637a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var17 = iq1.f3637a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var18 = iq1.f3637a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 43:
                    size2 = iq1.m2692w((List) unsafe.getObject(do1Var, j));
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 44:
                    size2 = iq1.m2690u((List) unsafe.getObject(do1Var, j));
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var19 = iq1.f3637a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(do1Var, j);
                    wa0 wa0Var20 = iq1.f3637a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 47:
                    size2 = iq1.m2693x((List) unsafe.getObject(do1Var, j));
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 48:
                    size2 = iq1.m2689t((List) unsafe.getObject(do1Var, j));
                    if (size2 > 0) {
                        iM4391a9 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2772g(size2, iM4391a9, size2, iM2771f);
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(do1Var, j);
                    hq1 hq1VarM6004D4 = m6004D(i6);
                    wa0 wa0Var21 = iq1.f3637a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iMo1276c3 = 0;
                    } else {
                        iMo1276c3 = 0;
                        for (int i17 = 0; i17 < size7; i17++) {
                            do1 do1Var3 = (do1) list19.get(i17);
                            int iM4391a14 = ro1.m4391a(i8 << 3);
                            iMo1276c3 += do1Var3.mo1276c(hq1VarM6004D4) + iM4391a14 + iM4391a14;
                        }
                    }
                    iM2771f += iMo1276c3;
                    break;
                case 50:
                    rp1 rp1Var = (rp1) unsafe.getObject(do1Var, j);
                    qp1 qp1Var = (qp1) m6005E(i6);
                    if (rp1Var.isEmpty()) {
                        iM4391a7 = 0;
                    } else {
                        iM4391a7 = 0;
                        for (Map.Entry entry : rp1Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            oq0 oq0Var = qp1Var.f6560a;
                            int iM4391a15 = ro1.m4391a(i8 << 3);
                            int iM4123b = qp1.m4123b(oq0Var, key, value);
                            iM4391a7 = j11.m2772g(iM4123b, iM4123b, iM4391a15, iM4391a7);
                        }
                    }
                    iM2771f += iM4391a7;
                    break;
                case 51:
                    if (m6018u(do1Var, i8, i6)) {
                        iM2771f = j11.m2771f(i8 << 3, 8, iM2771f);
                    }
                    break;
                case 52:
                    if (m6018u(do1Var, i8, i6)) {
                        iM2771f = j11.m2771f(i8 << 3, 4, iM2771f);
                    }
                    break;
                case 53:
                    if (m6018u(do1Var, i8, i6)) {
                        long jM5999p = m5999p(do1Var, j);
                        iM4391a10 = ro1.m4391a(i8 << 3);
                        iM4392b2 = ro1.m4392b(jM5999p);
                        iM2771f += iM4392b2 + iM4391a10;
                    }
                    break;
                case 54:
                    if (m6018u(do1Var, i8, i6)) {
                        long jM5999p2 = m5999p(do1Var, j);
                        iM4391a10 = ro1.m4391a(i8 << 3);
                        iM4392b2 = ro1.m4392b(jM5999p2);
                        iM2771f += iM4392b2 + iM4391a10;
                    }
                    break;
                case 55:
                    if (m6018u(do1Var, i8, i6)) {
                        long jM5998o = m5998o(do1Var, j);
                        iM4391a10 = ro1.m4391a(i8 << 3);
                        iM4392b2 = ro1.m4392b(jM5998o);
                        iM2771f += iM4392b2 + iM4391a10;
                    }
                    break;
                case 56:
                    if (m6018u(do1Var, i8, i6)) {
                        iM2771f = j11.m2771f(i8 << 3, 8, iM2771f);
                    }
                    break;
                case 57:
                    if (m6018u(do1Var, i8, i6)) {
                        iM2771f = j11.m2771f(i8 << 3, 4, iM2771f);
                    }
                    break;
                case 58:
                    if (m6018u(do1Var, i8, i6)) {
                        iM2771f = j11.m2771f(i8 << 3, 1, iM2771f);
                    }
                    break;
                case 59:
                    if (m6018u(do1Var, i8, i6)) {
                        int i18 = i8 << 3;
                        Object object3 = unsafe.getObject(do1Var, j);
                        if (object3 instanceof ko1) {
                            iM4391a11 = ro1.m4391a(i18);
                            iM5184b2 = ((ko1) object3).mo2330c();
                        } else {
                            iM4391a11 = ro1.m4391a(i18);
                            iM5184b2 = vq1.m5184b((String) object3);
                        }
                        iM2771f = j11.m2772g(iM5184b2, iM5184b2, iM4391a11, iM2771f);
                    }
                    break;
                case 60:
                    if (m6018u(do1Var, i8, i6)) {
                        Object object4 = unsafe.getObject(do1Var, j);
                        hq1 hq1VarM6004D5 = m6004D(i6);
                        wa0 wa0Var22 = iq1.f3637a;
                        iM4391a3 = ro1.m4391a(i8 << 3);
                        iMo1276c = ((do1) object4).mo1276c(hq1VarM6004D5);
                        iM2771f = j11.m2772g(iMo1276c, iMo1276c, iM4391a3, iM2771f);
                    }
                    break;
                case 61:
                    if (m6018u(do1Var, i8, i6)) {
                        ko1 ko1Var2 = (ko1) unsafe.getObject(do1Var, j);
                        iM4391a11 = ro1.m4391a(i8 << 3);
                        iM5184b2 = ko1Var2.mo2330c();
                        iM2771f = j11.m2772g(iM5184b2, iM5184b2, iM4391a11, iM2771f);
                    }
                    break;
                case 62:
                    if (m6018u(do1Var, i8, i6)) {
                        iM5998o = m5998o(do1Var, j);
                        iM4391a12 = ro1.m4391a(i8 << 3);
                        iM2771f = j11.m2771f(iM5998o, iM4391a12, iM2771f);
                    }
                    break;
                case 63:
                    if (m6018u(do1Var, i8, i6)) {
                        long jM5998o2 = m5998o(do1Var, j);
                        iM4391a10 = ro1.m4391a(i8 << 3);
                        iM4392b2 = ro1.m4392b(jM5998o2);
                        iM2771f += iM4392b2 + iM4391a10;
                    }
                    break;
                case 64:
                    if (m6018u(do1Var, i8, i6)) {
                        iM2771f = j11.m2771f(i8 << 3, 4, iM2771f);
                    }
                    break;
                case 65:
                    if (m6018u(do1Var, i8, i6)) {
                        iM2771f = j11.m2771f(i8 << 3, 8, iM2771f);
                    }
                    break;
                case 66:
                    if (m6018u(do1Var, i8, i6)) {
                        int iM5998o2 = m5998o(do1Var, j);
                        iM4391a12 = ro1.m4391a(i8 << 3);
                        iM5998o = (iM5998o2 >> 31) ^ (iM5998o2 + iM5998o2);
                        iM2771f = j11.m2771f(iM5998o, iM4391a12, iM2771f);
                    }
                    break;
                case 67:
                    if (m6018u(do1Var, i8, i6)) {
                        long jM5999p3 = m5999p(do1Var, j);
                        iM4391a10 = ro1.m4391a(i8 << 3);
                        iM4392b2 = ro1.m4392b((jM5999p3 >> 63) ^ (jM5999p3 + jM5999p3));
                        iM2771f += iM4392b2 + iM4391a10;
                    }
                    break;
                case 68:
                    if (m6018u(do1Var, i8, i6)) {
                        do1 do1Var4 = (do1) unsafe.getObject(do1Var, j);
                        hq1 hq1VarM6004D6 = m6004D(i6);
                        wa0 wa0Var23 = iq1.f3637a;
                        int iM4391a16 = ro1.m4391a(i8 << 3);
                        i3 = iM4391a16 + iM4391a16;
                        iMo1276c2 = do1Var4.mo1276c(hq1VarM6004D6);
                        iM2695z = iMo1276c2 + i3;
                        iM2771f += iM2695z;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: f */
    public final boolean mo469f(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.f9902h) {
            int i6 = this.f9901g[i3];
            int iM6013k = this.m6013k(i6);
            int[] iArr = this.f9895a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = f9894l.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            zp1 zp1Var = this;
            Object obj2 = obj;
            if ((268435456 & iM6013k) == 0 || zp1Var.m6015r(obj2, i6, i, i2, i9)) {
                int iM5995l = m5995l(iM6013k);
                if (iM5995l != 9 && iM5995l != 17) {
                    if (iM5995l != 27) {
                        if (iM5995l == 60 || iM5995l == 68) {
                            if (!zp1Var.m6018u(obj2, iArr[i6], i6) || zp1Var.m6004D(i6).mo469f(tq1.m4833i(obj2, iM6013k & 1048575))) {
                                i3++;
                                this = zp1Var;
                                obj = obj2;
                                i5 = i;
                                i4 = i2;
                            }
                        } else if (iM5995l != 49) {
                            if (iM5995l != 50) {
                                continue;
                            } else {
                                rp1 rp1Var = (rp1) tq1.m4833i(obj2, iM6013k & 1048575);
                                if (!rp1Var.isEmpty() && ((wq1) ((qp1) zp1Var.m6005E(i6)).f6560a.f5842m).f8643j == xq1.f9039r) {
                                    hq1 hq1VarM1495a = null;
                                    for (Object obj3 : rp1Var.values()) {
                                        if (hq1VarM1495a == null) {
                                            hq1VarM1495a = eq1.f2165c.m1495a(obj3.getClass());
                                        }
                                        if (!hq1VarM1495a.mo469f(obj3)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                            this = zp1Var;
                            obj = obj2;
                            i5 = i;
                            i4 = i2;
                        }
                    }
                    List list = (List) tq1.m4833i(obj2, iM6013k & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        hq1 hq1VarM6004D = zp1Var.m6004D(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (hq1VarM6004D.mo469f(list.get(i10))) {
                            }
                        }
                    }
                    i3++;
                    this = zp1Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!zp1Var.m6015r(obj2, i6, i, i2, i9) || zp1Var.m6004D(i6).mo469f(tq1.m4833i(obj2, iM6013k & 1048575))) {
                    i3++;
                    this = zp1Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:207:0x07c2 A[LOOP:3: B:206:0x07c0->B:207:0x07c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:211:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:217:0x07ef A[LOOP:1: B:216:0x07ed->B:217:0x07ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0800  */
    /* JADX WARN: Code duplicated, block: B:228:0x07ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // p000.hq1
    /* JADX INFO: renamed from: g */
    public final void mo470g(Object obj, C0212fi c0212fi, so1 so1Var) throws Throwable {
        Object obj2;
        Object objM6011K;
        Object objM6011K2;
        zp1 zp1Var;
        wa0 wa0Var;
        Object obj3;
        zp1 zp1Var2;
        Object objM5306u;
        Object obj4;
        zp1 zp1Var3 = this;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) c0212fi.f2412e;
        int[] iArr = zp1Var3.f9901g;
        int i = zp1Var3.f9903i;
        int i2 = zp1Var3.f9902h;
        so1Var.getClass();
        m5997n(obj);
        wa0 wa0Var2 = zp1Var3.f9904j;
        Object objM5306u2 = null;
        while (true) {
            try {
                int iM1854r0 = c0212fi.m1854r0();
                int iM6020w = (iM1854r0 < zp1Var3.f9897c || iM1854r0 > zp1Var3.f9898d) ? -1 : zp1Var3.m6020w(iM1854r0, 0);
                if (iM6020w >= 0) {
                    int iM6013k = zp1Var3.m6013k(iM6020w);
                    try {
                        try {
                            switch (m5995l(iM6013k)) {
                                case 0:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1 zp1Var4 = zp1Var3;
                                    int i3 = iM6013k & 1048575;
                                    try {
                                        c0212fi.m1842k0(1);
                                        zp1Var = zp1Var4;
                                        tq1.f7570c.mo4125A(obj, i3, abstractC0860x0.mo3250R());
                                        zp1Var.m6017t(iM6020w, obj);
                                        zp1Var3 = zp1Var;
                                        wa0Var2 = wa0Var;
                                        objM5306u2 = obj2;
                                    } catch (Throwable th) {
                                        th = th;
                                        wa0Var2 = wa0Var;
                                        objM5306u2 = obj2;
                                        objM6011K = objM5306u2;
                                        while (i2 < i) {
                                            objM6011K = m6011K(obj, iArr[i2], objM6011K, wa0Var2, obj);
                                            i2++;
                                        }
                                        if (objM6011K != null) {
                                            wa0Var2.getClass();
                                            ((zo1) obj).zzc = (oq1) objM6011K;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 1:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(5);
                                    tq1.f7570c.mo4130x(obj, iM6013k & 1048575, abstractC0860x0.mo3251S());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 2:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(0);
                                    tq1.m4832h(obj, iM6013k & 1048575, abstractC0860x0.mo3253U());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 3:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(0);
                                    tq1.m4832h(obj, iM6013k & 1048575, abstractC0860x0.mo3252T());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 4:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(0);
                                    tq1.m4830f(obj, iM6013k & 1048575, abstractC0860x0.mo3254V());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 5:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(1);
                                    tq1.m4832h(obj, iM6013k & 1048575, abstractC0860x0.mo3255W());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 6:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(5);
                                    tq1.m4830f(obj, iM6013k & 1048575, abstractC0860x0.mo3256X());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 7:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(0);
                                    tq1.f7570c.mo4128s(obj, iM6013k & 1048575, abstractC0860x0.mo3257Y());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 8:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    zp1Var2.m6012L(iM6013k, c0212fi, obj);
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 9:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    do1 do1Var = (do1) zp1Var2.m6007G(iM6020w, obj);
                                    hq1 hq1VarM6004D = zp1Var2.m6004D(iM6020w);
                                    c0212fi.m1842k0(2);
                                    c0212fi.m1844l0(do1Var, hq1VarM6004D, so1Var);
                                    zp1Var2.m6008H(iM6020w, obj, do1Var);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 10:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    tq1.m4834j(iM6013k & 1048575, obj, c0212fi.m1856s0());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(0);
                                    tq1.m4830f(obj, iM6013k & 1048575, abstractC0860x0.mo3262d0());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(0);
                                    int iMo3263e0 = abstractC0860x0.mo3263e0();
                                    yn1 yn1VarM6006F = zp1Var2.m6006F(iM6020w);
                                    if (yn1VarM6006F != null && !yn1VarM6006F.m5816a(iMo3263e0)) {
                                        wa0 wa0Var3 = iq1.f3637a;
                                        if (obj2 == null) {
                                            wa0Var.getClass();
                                            objM5306u = wa0.m5306u(obj);
                                        } else {
                                            objM5306u = obj2;
                                        }
                                        wa0Var.getClass();
                                        ((oq1) objM5306u).m3751d(iM1854r0 << 3, Long.valueOf(iMo3263e0));
                                        zp1Var3 = zp1Var2;
                                        objM5306u2 = objM5306u;
                                        wa0Var2 = wa0Var;
                                    }
                                    tq1.m4830f(obj, iM6013k & 1048575, iMo3263e0);
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(5);
                                    tq1.m4830f(obj, iM6013k & 1048575, abstractC0860x0.mo3264f0());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 14:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(1);
                                    tq1.m4832h(obj, iM6013k & 1048575, abstractC0860x0.mo3265g0());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 15:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(0);
                                    tq1.m4830f(obj, iM6013k & 1048575, abstractC0860x0.mo3266h0());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 16:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    c0212fi.m1842k0(0);
                                    tq1.m4832h(obj, iM6013k & 1048575, abstractC0860x0.mo3267i0());
                                    zp1Var2.m6017t(iM6020w, obj);
                                    zp1Var = zp1Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 17:
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var2 = zp1Var3;
                                    obj3 = obj;
                                    try {
                                        do1 do1Var2 = (do1) zp1Var2.m6007G(iM6020w, obj3);
                                        hq1 hq1VarM6004D2 = zp1Var2.m6004D(iM6020w);
                                        c0212fi.m1842k0(3);
                                        c0212fi.m1846m0(do1Var2, hq1VarM6004D2, so1Var);
                                        zp1Var2.m6008H(iM6020w, obj3, do1Var2);
                                        zp1Var = zp1Var2;
                                        zp1Var3 = zp1Var;
                                        wa0Var2 = wa0Var;
                                        objM5306u2 = obj2;
                                    } catch (lp1 unused) {
                                        zp1Var = zp1Var2;
                                        objM5306u2 = obj2;
                                        if (objM5306u2 == null) {
                                            try {
                                                wa0Var.getClass();
                                                objM5306u2 = wa0.m5306u(obj3);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                wa0Var2 = wa0Var;
                                                objM6011K = objM5306u2;
                                                while (i2 < i) {
                                                    objM6011K = m6011K(obj, iArr[i2], objM6011K, wa0Var2, obj);
                                                    i2++;
                                                }
                                                if (objM6011K != null) {
                                                    wa0Var2.getClass();
                                                    ((zo1) obj).zzc = (oq1) objM6011K;
                                                }
                                                throw th;
                                            }
                                        }
                                        wa0Var.getClass();
                                        if (!wa0.m5307w(0, c0212fi, objM5306u2)) {
                                            objM6011K2 = objM5306u2;
                                            while (i2 < i) {
                                                objM6011K2 = zp1Var.m6011K(obj3, iArr[i2], objM6011K2, wa0Var, obj);
                                                i2++;
                                                zp1Var = this;
                                                obj3 = obj;
                                            }
                                            wa0Var2 = wa0Var;
                                            if (objM6011K2 != null) {
                                                wa0Var2.getClass();
                                                ((zo1) obj).zzc = (oq1) objM6011K2;
                                            }
                                        }
                                        zp1Var3 = this;
                                        wa0Var2 = wa0Var;
                                    }
                                    break;
                                case 18:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1858t0(aa0.m152r(obj, iM6013k & 1048575));
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 19:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1860u0(aa0.m152r(obj, iM6013k & 1048575));
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 20:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1815U(aa0.m152r(obj, iM6013k & 1048575));
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 21:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1862v0(aa0.m152r(obj, iM6013k & 1048575));
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 22:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1816V(aa0.m152r(obj, iM6013k & 1048575));
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 23:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1817W(aa0.m152r(obj, iM6013k & 1048575));
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 24:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1818X(aa0.m152r(obj, iM6013k & 1048575));
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 25:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1819Y(aa0.m152r(obj, iM6013k & 1048575));
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 26:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    if ((536870912 & iM6013k) != 0) {
                                        c0212fi.m1820Z(aa0.m152r(obj, iM6013k & 1048575), true);
                                    } else {
                                        c0212fi.m1820Z(aa0.m152r(obj, iM6013k & 1048575), false);
                                    }
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 27:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1822a0(aa0.m152r(obj, iM6013k & 1048575), zp1Var.m6004D(iM6020w), so1Var);
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 28:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    c0212fi.m1826c0(aa0.m152r(obj, iM6013k & 1048575));
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 29:
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    obj3 = obj;
                                    try {
                                        try {
                                            c0212fi.m1828d0(aa0.m152r(obj3, iM6013k & 1048575));
                                            zp1Var3 = zp1Var;
                                            wa0Var2 = wa0Var;
                                            objM5306u2 = obj2;
                                        } catch (lp1 unused2) {
                                            objM5306u2 = obj2;
                                            if (objM5306u2 == null) {
                                                wa0Var.getClass();
                                                objM5306u2 = wa0.m5306u(obj3);
                                            }
                                            wa0Var.getClass();
                                            if (!wa0.m5307w(0, c0212fi, objM5306u2)) {
                                                objM6011K2 = objM5306u2;
                                                while (i2 < i) {
                                                    objM6011K2 = zp1Var.m6011K(obj3, iArr[i2], objM6011K2, wa0Var, obj);
                                                    i2++;
                                                    zp1Var = this;
                                                    obj3 = obj;
                                                }
                                                wa0Var2 = wa0Var;
                                                if (objM6011K2 != null) {
                                                    wa0Var2.getClass();
                                                    ((zo1) obj).zzc = (oq1) objM6011K2;
                                                }
                                            }
                                            zp1Var3 = this;
                                            wa0Var2 = wa0Var;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        wa0Var2 = wa0Var;
                                        objM5306u2 = obj2;
                                        objM6011K = objM5306u2;
                                        while (i2 < i) {
                                            objM6011K = m6011K(obj, iArr[i2], objM6011K, wa0Var2, obj);
                                            i2++;
                                        }
                                        if (objM6011K != null) {
                                            wa0Var2.getClass();
                                            ((zo1) obj).zzc = (oq1) objM6011K;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 30:
                                    zp1Var = zp1Var3;
                                    wa0Var = wa0Var2;
                                    obj3 = obj;
                                    Object obj5 = objM5306u2;
                                    try {
                                        kp1 kp1VarM152r = aa0.m152r(obj3, iM6013k & 1048575);
                                        c0212fi.m1830e0(kp1VarM152r);
                                        try {
                                            objM5306u2 = iq1.m2672c(obj3, iM1854r0, kp1VarM152r, zp1Var.m6006F(iM6020w), obj5, wa0Var);
                                            wa0Var = wa0Var;
                                            zp1Var3 = zp1Var;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj5;
                                            wa0Var = wa0Var;
                                            wa0Var2 = wa0Var;
                                            objM5306u2 = obj2;
                                            objM6011K = objM5306u2;
                                            while (i2 < i) {
                                                objM6011K = m6011K(obj, iArr[i2], objM6011K, wa0Var2, obj);
                                                i2++;
                                            }
                                            if (objM6011K != null) {
                                                wa0Var2.getClass();
                                                ((zo1) obj).zzc = (oq1) objM6011K;
                                            }
                                            throw th;
                                        }
                                    } catch (lp1 unused3) {
                                        obj2 = obj5;
                                        objM5306u2 = obj2;
                                        if (objM5306u2 == null) {
                                            wa0Var.getClass();
                                            objM5306u2 = wa0.m5306u(obj3);
                                        }
                                        wa0Var.getClass();
                                        if (!wa0.m5307w(0, c0212fi, objM5306u2)) {
                                            objM6011K2 = objM5306u2;
                                            while (i2 < i) {
                                                objM6011K2 = zp1Var.m6011K(obj3, iArr[i2], objM6011K2, wa0Var, obj);
                                                i2++;
                                                zp1Var = this;
                                                obj3 = obj;
                                            }
                                            wa0Var2 = wa0Var;
                                            if (objM6011K2 != null) {
                                                wa0Var2.getClass();
                                                ((zo1) obj).zzc = (oq1) objM6011K2;
                                            }
                                        }
                                        zp1Var3 = this;
                                        break;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj2 = obj5;
                                    }
                                    wa0Var2 = wa0Var;
                                    break;
                                case 31:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1832f0(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 32:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1834g0(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 33:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1836h0(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 34:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1838i0(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 35:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1858t0(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 36:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1860u0(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 37:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1815U(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 38:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1862v0(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 39:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1816V(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 40:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1817W(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 41:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1818X(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 42:
                                    zp1Var = zp1Var3;
                                    c0212fi.m1819Y(aa0.m152r(obj, iM6013k & 1048575));
                                    obj2 = objM5306u2;
                                    wa0Var = wa0Var2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 43:
                                    zp1Var = zp1Var3;
                                    obj3 = obj;
                                    try {
                                        c0212fi.m1828d0(aa0.m152r(obj3, iM6013k & 1048575));
                                        obj2 = objM5306u2;
                                        wa0Var = wa0Var2;
                                        zp1Var3 = zp1Var;
                                        wa0Var2 = wa0Var;
                                        objM5306u2 = obj2;
                                    } catch (lp1 unused4) {
                                        obj2 = objM5306u2;
                                        wa0Var = wa0Var2;
                                        objM5306u2 = obj2;
                                        if (objM5306u2 == null) {
                                            wa0Var.getClass();
                                            objM5306u2 = wa0.m5306u(obj3);
                                        }
                                        wa0Var.getClass();
                                        if (!wa0.m5307w(0, c0212fi, objM5306u2)) {
                                            objM6011K2 = objM5306u2;
                                            while (i2 < i) {
                                                objM6011K2 = zp1Var.m6011K(obj3, iArr[i2], objM6011K2, wa0Var, obj);
                                                i2++;
                                                zp1Var = this;
                                                obj3 = obj;
                                            }
                                            wa0Var2 = wa0Var;
                                            if (objM6011K2 != null) {
                                                wa0Var2.getClass();
                                                ((zo1) obj).zzc = (oq1) objM6011K2;
                                            }
                                        }
                                        zp1Var3 = this;
                                        wa0Var2 = wa0Var;
                                    }
                                    break;
                                case 44:
                                    wa0Var = wa0Var2;
                                    try {
                                        kp1 kp1VarM152r2 = aa0.m152r(obj, iM6013k & 1048575);
                                        c0212fi.m1830e0(kp1VarM152r2);
                                        yn1 yn1VarM6006F2 = zp1Var3.m6006F(iM6020w);
                                        zp1Var = zp1Var3;
                                        obj3 = obj;
                                        Object obj6 = objM5306u2;
                                        try {
                                            try {
                                                objM5306u2 = iq1.m2672c(obj3, iM1854r0, kp1VarM152r2, yn1VarM6006F2, obj6, wa0Var);
                                                wa0Var2 = wa0Var;
                                                zp1Var3 = zp1Var;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                objM5306u2 = obj6;
                                                wa0Var2 = wa0Var;
                                                obj2 = objM5306u2;
                                                objM5306u2 = obj2;
                                                objM6011K = objM5306u2;
                                                while (i2 < i) {
                                                    objM6011K = m6011K(obj, iArr[i2], objM6011K, wa0Var2, obj);
                                                    i2++;
                                                }
                                                if (objM6011K != null) {
                                                    wa0Var2.getClass();
                                                    ((zo1) obj).zzc = (oq1) objM6011K;
                                                }
                                                throw th;
                                            }
                                        } catch (lp1 unused5) {
                                            obj2 = obj6;
                                            wa0Var = wa0Var;
                                            objM5306u2 = obj2;
                                            if (objM5306u2 == null) {
                                                wa0Var.getClass();
                                                objM5306u2 = wa0.m5306u(obj3);
                                            }
                                            wa0Var.getClass();
                                            if (!wa0.m5307w(0, c0212fi, objM5306u2)) {
                                                objM6011K2 = objM5306u2;
                                                while (i2 < i) {
                                                    objM6011K2 = zp1Var.m6011K(obj3, iArr[i2], objM6011K2, wa0Var, obj);
                                                    i2++;
                                                    zp1Var = this;
                                                    obj3 = obj;
                                                }
                                                wa0Var2 = wa0Var;
                                                if (objM6011K2 != null) {
                                                    wa0Var2.getClass();
                                                    ((zo1) obj).zzc = (oq1) objM6011K2;
                                                }
                                            }
                                            zp1Var3 = this;
                                            wa0Var2 = wa0Var;
                                            break;
                                        }
                                    } catch (lp1 unused6) {
                                        zp1Var = zp1Var3;
                                        obj3 = obj;
                                        obj2 = objM5306u2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        wa0Var2 = wa0Var;
                                    }
                                    break;
                                case 45:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1832f0(aa0.m152r(obj4, iM6013k & 1048575));
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 46:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1834g0(aa0.m152r(obj4, iM6013k & 1048575));
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 47:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1836h0(aa0.m152r(obj4, iM6013k & 1048575));
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 48:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1838i0(aa0.m152r(obj4, iM6013k & 1048575));
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 49:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1824b0(aa0.m152r(obj4, iM6013k & 1048575), zp1Var3.m6004D(iM6020w), so1Var);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 50:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    Object objM6005E = zp1Var3.m6005E(iM6020w);
                                    long jM6013k = zp1Var3.m6013k(iM6020w) & 1048575;
                                    Object objM4833i = tq1.m4833i(obj4, jM6013k);
                                    if (objM4833i == null) {
                                        objM4833i = rp1.f6937k.m4394a();
                                        tq1.m4834j(jM6013k, obj4, objM4833i);
                                    } else if (!((rp1) objM4833i).f6938j) {
                                        Object objM4394a = rp1.f6937k.m4394a();
                                        u90.m4899i(objM4394a, objM4833i);
                                        tq1.m4834j(jM6013k, obj4, objM4394a);
                                        objM4833i = objM4394a;
                                    }
                                    c0212fi.m1840j0((rp1) objM4833i, ((qp1) objM6005E).m4124c(), so1Var);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 51:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(1);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Double.valueOf(abstractC0860x0.mo3250R()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 52:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(5);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Float.valueOf(abstractC0860x0.mo3251S()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 53:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(0);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Long.valueOf(abstractC0860x0.mo3253U()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 54:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(0);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Long.valueOf(abstractC0860x0.mo3252T()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 55:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(0);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Integer.valueOf(abstractC0860x0.mo3254V()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 56:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(1);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Long.valueOf(abstractC0860x0.mo3255W()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 57:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(5);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Integer.valueOf(abstractC0860x0.mo3256X()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 58:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(0);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Boolean.valueOf(abstractC0860x0.mo3257Y()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 59:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    zp1Var3.m6012L(iM6013k, c0212fi, obj4);
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 60:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    do1 do1Var3 = (do1) zp1Var3.m6009I(obj4, iM1854r0, iM6020w);
                                    hq1 hq1VarM6004D3 = zp1Var3.m6004D(iM6020w);
                                    c0212fi.m1842k0(2);
                                    c0212fi.m1844l0(do1Var3, hq1VarM6004D3, so1Var);
                                    zp1Var3.m6010J(iM1854r0, iM6020w, obj4, do1Var3);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 61:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    tq1.m4834j(iM6013k & 1048575, obj4, c0212fi.m1856s0());
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 62:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(0);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Integer.valueOf(abstractC0860x0.mo3262d0()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 63:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(0);
                                    int iMo3263e1 = abstractC0860x0.mo3263e0();
                                    yn1 yn1VarM6006F3 = zp1Var3.m6006F(iM6020w);
                                    if (yn1VarM6006F3 != null && !yn1VarM6006F3.m5816a(iMo3263e1)) {
                                        wa0 wa0Var4 = iq1.f3637a;
                                        if (objM5306u2 == null) {
                                            wa0Var.getClass();
                                            objM5306u = wa0.m5306u(obj4);
                                        } else {
                                            objM5306u = objM5306u2;
                                        }
                                        wa0Var.getClass();
                                        ((oq1) objM5306u).m3751d(iM1854r0 << 3, Long.valueOf(iMo3263e1));
                                        objM5306u2 = objM5306u;
                                        wa0Var2 = wa0Var;
                                    }
                                    tq1.m4834j(iM6013k & 1048575, obj4, Integer.valueOf(iMo3263e1));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 64:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(5);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Integer.valueOf(abstractC0860x0.mo3264f0()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 65:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(1);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Long.valueOf(abstractC0860x0.mo3265g0()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 66:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(0);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Integer.valueOf(abstractC0860x0.mo3266h0()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 67:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    c0212fi.m1842k0(0);
                                    tq1.m4834j(iM6013k & 1048575, obj4, Long.valueOf(abstractC0860x0.mo3267i0()));
                                    zp1Var3.m6019v(obj4, iM1854r0, iM6020w);
                                    zp1Var = zp1Var3;
                                    obj2 = objM5306u2;
                                    zp1Var3 = zp1Var;
                                    wa0Var2 = wa0Var;
                                    objM5306u2 = obj2;
                                    break;
                                case 68:
                                    wa0Var = wa0Var2;
                                    obj4 = obj;
                                    try {
                                        do1 do1Var4 = (do1) zp1Var3.m6009I(obj4, iM1854r0, iM6020w);
                                        hq1 hq1VarM6004D4 = zp1Var3.m6004D(iM6020w);
                                        c0212fi.m1842k0(3);
                                        c0212fi.m1846m0(do1Var4, hq1VarM6004D4, so1Var);
                                        zp1Var3.m6010J(iM1854r0, iM6020w, obj4, do1Var4);
                                        zp1Var = zp1Var3;
                                        obj2 = objM5306u2;
                                        zp1Var3 = zp1Var;
                                        wa0Var2 = wa0Var;
                                        objM5306u2 = obj2;
                                    } catch (lp1 unused7) {
                                        zp1Var = zp1Var3;
                                        obj2 = objM5306u2;
                                        obj3 = obj4;
                                        objM5306u2 = obj2;
                                        if (objM5306u2 == null) {
                                            wa0Var.getClass();
                                            objM5306u2 = wa0.m5306u(obj3);
                                        }
                                        wa0Var.getClass();
                                        if (!wa0.m5307w(0, c0212fi, objM5306u2)) {
                                            objM6011K2 = objM5306u2;
                                            while (i2 < i) {
                                                objM6011K2 = zp1Var.m6011K(obj3, iArr[i2], objM6011K2, wa0Var, obj);
                                                i2++;
                                                zp1Var = this;
                                                obj3 = obj;
                                            }
                                            wa0Var2 = wa0Var;
                                            if (objM6011K2 != null) {
                                                wa0Var2.getClass();
                                                ((zo1) obj).zzc = (oq1) objM6011K2;
                                            }
                                        }
                                        zp1Var3 = this;
                                        wa0Var2 = wa0Var;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = objM5306u2;
                                        wa0Var2 = wa0Var;
                                        objM5306u2 = obj2;
                                        objM6011K = objM5306u2;
                                        while (i2 < i) {
                                            objM6011K = m6011K(obj, iArr[i2], objM6011K, wa0Var2, obj);
                                            i2++;
                                        }
                                        if (objM6011K != null) {
                                            wa0Var2.getClass();
                                            ((zo1) obj).zzc = (oq1) objM6011K;
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (objM5306u2 == null) {
                                        wa0Var2.getClass();
                                        objM5306u2 = wa0.m5306u(obj);
                                    }
                                    try {
                                        wa0Var2.getClass();
                                        if (wa0.m5307w(0, c0212fi, objM5306u2)) {
                                            wa0Var = wa0Var2;
                                            wa0Var2 = wa0Var;
                                        } else {
                                            objM6011K2 = objM5306u2;
                                            while (i2 < i) {
                                                objM6011K2 = zp1Var3.m6011K(obj, iArr[i2], objM6011K2, wa0Var2, obj);
                                                i2++;
                                                wa0Var2 = wa0Var2;
                                            }
                                            wa0Var = wa0Var2;
                                            wa0Var2 = wa0Var;
                                        }
                                    } catch (lp1 unused8) {
                                        wa0Var = wa0Var2;
                                        zp1Var = zp1Var3;
                                        obj3 = obj;
                                        if (objM5306u2 == null) {
                                            wa0Var.getClass();
                                            objM5306u2 = wa0.m5306u(obj3);
                                        }
                                        wa0Var.getClass();
                                        if (!wa0.m5307w(0, c0212fi, objM5306u2)) {
                                            objM6011K2 = objM5306u2;
                                            while (i2 < i) {
                                                objM6011K2 = zp1Var.m6011K(obj3, iArr[i2], objM6011K2, wa0Var, obj);
                                                i2++;
                                                zp1Var = this;
                                                obj3 = obj;
                                            }
                                            wa0Var2 = wa0Var;
                                            if (objM6011K2 != null) {
                                                wa0Var2.getClass();
                                                ((zo1) obj).zzc = (oq1) objM6011K2;
                                            }
                                        }
                                        zp1Var3 = this;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        wa0Var = wa0Var2;
                                        wa0Var2 = wa0Var;
                                        objM6011K = objM5306u2;
                                        while (i2 < i) {
                                            objM6011K = m6011K(obj, iArr[i2], objM6011K, wa0Var2, obj);
                                            i2++;
                                        }
                                        if (objM6011K != null) {
                                            wa0Var2.getClass();
                                            ((zo1) obj).zzc = (oq1) objM6011K;
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj2 = objM5306u2;
                        }
                    } catch (lp1 unused9) {
                        zp1Var = zp1Var3;
                        obj2 = objM5306u2;
                        wa0Var = wa0Var2;
                        obj3 = obj;
                    }
                } else if (iM1854r0 == Integer.MAX_VALUE) {
                    objM6011K2 = objM5306u2;
                    while (i2 < i) {
                        objM6011K2 = zp1Var3.m6011K(obj, iArr[i2], objM6011K2, wa0Var2, obj);
                        i2++;
                        zp1Var3 = this;
                    }
                } else {
                    if (objM5306u2 == null) {
                        wa0Var2.getClass();
                        objM5306u2 = wa0.m5306u(obj);
                    }
                    try {
                        wa0Var2.getClass();
                        if (wa0.m5307w(0, c0212fi, objM5306u2)) {
                            zp1Var3 = this;
                        } else {
                            objM6011K2 = objM5306u2;
                            while (i2 < i) {
                                objM6011K2 = m6011K(obj, iArr[i2], objM6011K2, wa0Var2, obj);
                                i2++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        objM6011K = objM5306u2;
                        while (i2 < i) {
                            objM6011K = m6011K(obj, iArr[i2], objM6011K, wa0Var2, obj);
                            i2++;
                        }
                        if (objM6011K != null) {
                            wa0Var2.getClass();
                            ((zo1) obj).zzc = (oq1) objM6011K;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        if (objM6011K2 != null) {
            wa0Var2.getClass();
            ((zo1) obj).zzc = (oq1) objM6011K2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d1 A[SYNTHETIC] */
    @Override // p000.hq1
    /* JADX INFO: renamed from: h */
    public final boolean mo471h(zo1 zo1Var, zo1 zo1Var2) {
        boolean zM2670a;
        int i = 0;
        while (true) {
            int[] iArr = this.f9895a;
            if (i < iArr.length) {
                int iM6013k = m6013k(i);
                int iM5995l = m5995l(iM6013k);
                if (iM5995l <= 50 || iM5995l >= 69) {
                    long j = iM6013k & 1048575;
                    switch (iM5995l) {
                        case 0:
                            if (m6014q(zo1Var, zo1Var2, i)) {
                                sq1 sq1Var = tq1.f7570c;
                                if (Double.doubleToLongBits(sq1Var.mo4131y(zo1Var, j)) != Double.doubleToLongBits(sq1Var.mo4131y(zo1Var2, j))) {
                                }
                            }
                            break;
                        case 1:
                            if (m6014q(zo1Var, zo1Var2, i)) {
                                sq1 sq1Var2 = tq1.f7570c;
                                if (Float.floatToIntBits(sq1Var2.mo4129v(zo1Var, j)) != Float.floatToIntBits(sq1Var2.mo4129v(zo1Var2, j))) {
                                }
                            }
                            break;
                        case 2:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4831g(zo1Var, j) != tq1.m4831g(zo1Var2, j)) {
                            }
                            break;
                        case 3:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4831g(zo1Var, j) != tq1.m4831g(zo1Var2, j)) {
                            }
                            break;
                        case 4:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4829e(zo1Var, j) != tq1.m4829e(zo1Var2, j)) {
                            }
                            break;
                        case 5:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4831g(zo1Var, j) != tq1.m4831g(zo1Var2, j)) {
                            }
                            break;
                        case 6:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4829e(zo1Var, j) != tq1.m4829e(zo1Var2, j)) {
                            }
                            break;
                        case 7:
                            if (m6014q(zo1Var, zo1Var2, i)) {
                                sq1 sq1Var3 = tq1.f7570c;
                                if (sq1Var3.mo4127q(zo1Var, j) != sq1Var3.mo4127q(zo1Var2, j)) {
                                }
                            }
                            break;
                        case 8:
                            if (!m6014q(zo1Var, zo1Var2, i) || !iq1.m2670a(tq1.m4833i(zo1Var, j), tq1.m4833i(zo1Var2, j))) {
                            }
                            break;
                        case 9:
                            if (!m6014q(zo1Var, zo1Var2, i) || !iq1.m2670a(tq1.m4833i(zo1Var, j), tq1.m4833i(zo1Var2, j))) {
                            }
                            break;
                        case 10:
                            if (!m6014q(zo1Var, zo1Var2, i) || !iq1.m2670a(tq1.m4833i(zo1Var, j), tq1.m4833i(zo1Var2, j))) {
                            }
                            break;
                        case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4829e(zo1Var, j) != tq1.m4829e(zo1Var2, j)) {
                            }
                            break;
                        case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4829e(zo1Var, j) != tq1.m4829e(zo1Var2, j)) {
                            }
                            break;
                        case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4829e(zo1Var, j) != tq1.m4829e(zo1Var2, j)) {
                            }
                            break;
                        case 14:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4831g(zo1Var, j) != tq1.m4831g(zo1Var2, j)) {
                            }
                            break;
                        case 15:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4829e(zo1Var, j) != tq1.m4829e(zo1Var2, j)) {
                            }
                            break;
                        case 16:
                            if (!m6014q(zo1Var, zo1Var2, i) || tq1.m4831g(zo1Var, j) != tq1.m4831g(zo1Var2, j)) {
                            }
                            break;
                        case 17:
                            if (!m6014q(zo1Var, zo1Var2, i) || !iq1.m2670a(tq1.m4833i(zo1Var, j), tq1.m4833i(zo1Var2, j))) {
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
                            zM2670a = iq1.m2670a(tq1.m4833i(zo1Var, j), tq1.m4833i(zo1Var2, j));
                            if (zM2670a) {
                            }
                            break;
                        case 50:
                            zM2670a = iq1.m2670a(tq1.m4833i(zo1Var, j), tq1.m4833i(zo1Var2, j));
                            if (zM2670a) {
                            }
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
                            if (tq1.m4829e(zo1Var, j2) == tq1.m4829e(zo1Var2, j2) && iq1.m2670a(tq1.m4833i(zo1Var, j), tq1.m4833i(zo1Var2, j))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i2 = this.f9903i;
                while (true) {
                    int[] iArr2 = this.f9901g;
                    if (i2 < iArr2.length) {
                        int i3 = iArr2[i2];
                        long j3 = iArr[i3 + 2] & 1048575;
                        if (tq1.m4829e(zo1Var, j3) != tq1.m4829e(zo1Var2, j3)) {
                            return false;
                        }
                        if (!m6018u(zo1Var, 0, i3)) {
                            long jM6013k = m6013k(i3) & 1048575;
                            if (!iq1.m2670a(tq1.m4833i(zo1Var, jM6013k), tq1.m4833i(zo1Var2, jM6013k))) {
                            }
                        }
                        i2++;
                    } else if (zo1Var.zzc.equals(zo1Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // p000.hq1
    /* JADX INFO: renamed from: i */
    public final void mo472i(Object obj) {
        if (!m5996m(obj)) {
            return;
        }
        if (obj instanceof zo1) {
            zo1 zo1Var = (zo1) obj;
            zo1Var.m5970l();
            zo1Var.zza = 0;
            zo1Var.m5966h();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f9895a;
            if (i >= iArr.length) {
                this.f9904j.getClass();
                oq1 oq1Var = ((zo1) obj).zzc;
                if (oq1Var.f5848e) {
                    oq1Var.f5848e = false;
                    return;
                }
                return;
            }
            int iM6013k = m6013k(i);
            int i2 = 1048575 & iM6013k;
            int iM5995l = m5995l(iM6013k);
            long j = i2;
            if (iM5995l != 9) {
                if (iM5995l != 60 && iM5995l != 68) {
                    switch (iM5995l) {
                        case 17:
                            if (m6016s(i, obj)) {
                                m6004D(i).mo472i(f9894l.getObject(obj, j));
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
                            eo1 eo1Var = (eo1) ((kp1) tq1.m4833i(obj, j));
                            if (eo1Var.f2152j) {
                                eo1Var.f2152j = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = f9894l;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((rp1) object).f6938j = false;
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (m6018u(obj, iArr[i], i)) {
                    m6004D(i).mo472i(f9894l.getObject(obj, j));
                }
            } else if (m6016s(i, obj)) {
                m6004D(i).mo472i(f9894l.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: j */
    public final void mo473j(Object obj, byte[] bArr, int i, int i2, go1 go1Var) {
        m6021y(obj, bArr, i, i2, 0, go1Var);
    }

    /* JADX INFO: renamed from: k */
    public final int m6013k(int i) {
        return this.f9895a[i + 1];
    }

    /* JADX INFO: renamed from: q */
    public final boolean m6014q(zo1 zo1Var, zo1 zo1Var2, int i) {
        return m6016s(i, zo1Var) == m6016s(i, zo1Var2);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m6015r(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m6016s(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m6016s(int i, Object obj) {
        int i2 = this.f9895a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iM6013k = m6013k(i);
            long j2 = iM6013k & 1048575;
            switch (m5995l(iM6013k)) {
                case 0:
                    if (Double.doubleToRawLongBits(tq1.f7570c.mo4131y(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(tq1.f7570c.mo4129v(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (tq1.m4831g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (tq1.m4831g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (tq1.m4829e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (tq1.m4831g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (tq1.m4829e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return tq1.f7570c.mo4127q(obj, j2);
                case 8:
                    Object objM4833i = tq1.m4833i(obj, j2);
                    if (objM4833i instanceof String) {
                        if (((String) objM4833i).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objM4833i instanceof ko1)) {
                            throw new IllegalArgumentException();
                        }
                        if (ko1.f4486k.equals(objM4833i)) {
                            return false;
                        }
                    }
                case 9:
                    if (tq1.m4833i(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (ko1.f4486k.equals(tq1.m4833i(obj, j2))) {
                        return false;
                    }
                    break;
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                    if (tq1.m4829e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                    if (tq1.m4829e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    if (tq1.m4829e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (tq1.m4831g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (tq1.m4829e(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (tq1.m4831g(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (tq1.m4833i(obj, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & tq1.m4829e(obj, j)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m6017t(int i, Object obj) {
        int i2 = this.f9895a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        tq1.m4830f(obj, j, (1 << (i2 >>> 20)) | tq1.m4829e(obj, j));
    }

    /* JADX INFO: renamed from: u */
    public final boolean m6018u(Object obj, int i, int i2) {
        return tq1.m4829e(obj, (long) (this.f9895a[i2 + 2] & 1048575)) == i;
    }

    /* JADX INFO: renamed from: v */
    public final void m6019v(Object obj, int i, int i2) {
        tq1.m4830f(obj, this.f9895a[i2 + 2] & 1048575, i);
    }

    /* JADX INFO: renamed from: w */
    public final int m6020w(int i, int i2) {
        int[] iArr = this.f9895a;
        int length = (iArr.length / 3) - 1;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36441. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: y */
    public final int m6021y(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, p000.go1 r41) {
        /*
            Method dump skipped, instruction units count: 3644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zp1.m6021y(java.lang.Object, byte[], int, int, int, go1):int");
    }
}
