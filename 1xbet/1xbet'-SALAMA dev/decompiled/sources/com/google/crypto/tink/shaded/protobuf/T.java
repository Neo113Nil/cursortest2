package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import androidx.datastore.preferences.protobuf.C0665j;
import androidx.datastore.preferences.protobuf.C0678x;
import com.google.android.gms.internal.ads.zzbbd;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class T implements c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f11728o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f11729p = o0.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f11730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f11731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0821a f11734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f11737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11738i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V f11739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final I f11740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g0 f11741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N f11742n;

    public T(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0821a abstractC0821a, boolean z4, int[] iArr2, int i9, int i10, V v6, I i11, g0 g0Var, C0836p c0836p, N n2) {
        this.f11730a = iArr;
        this.f11731b = objArr;
        this.f11732c = i7;
        this.f11733d = i8;
        this.f11735f = abstractC0821a instanceof AbstractC0842w;
        this.f11736g = z4;
        this.f11737h = iArr2;
        this.f11738i = i9;
        this.j = i10;
        this.f11739k = v6;
        this.f11740l = i11;
        this.f11741m = g0Var;
        this.f11734e = abstractC0821a;
        this.f11742n = n2;
    }

    public static T C(b0 b0Var, V v6, I i7, g0 g0Var, C0836p c0836p, N n2) {
        if (b0Var instanceof b0) {
            return D(b0Var, v6, i7, g0Var, c0836p, n2);
        }
        b0Var.getClass();
        throw new ClassCastException();
    }

    public static T D(b0 b0Var, V v6, I i7, g0 g0Var, C0836p c0836p, N n2) {
        int i8;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        char cCharAt;
        int i13;
        char cCharAt2;
        int i14;
        char cCharAt3;
        int i15;
        char cCharAt4;
        int i16;
        char cCharAt5;
        int i17;
        char cCharAt6;
        int i18;
        char cCharAt7;
        int i19;
        char cCharAt8;
        int i20;
        int i21;
        int i22;
        int i23;
        int[] iArr2;
        int iObjectFieldOffset;
        int i24;
        int i25;
        Field fieldQ;
        int i26;
        char cCharAt9;
        int i27;
        int i28;
        int i29;
        Field fieldQ2;
        Field fieldQ3;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        int i33;
        char cCharAt13;
        int i34 = 0;
        boolean z4 = b0Var.d() == 2;
        String strC = b0Var.c();
        int length = strC.length();
        if (strC.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i8 = i35 + 1;
                if (strC.charAt(i35) < 55296) {
                    break;
                }
                i35 = i8;
            }
        } else {
            i8 = 1;
        }
        int i36 = i8 + 1;
        int iCharAt4 = strC.charAt(i8);
        if (iCharAt4 >= 55296) {
            int i37 = iCharAt4 & 8191;
            int i38 = 13;
            while (true) {
                i33 = i36 + 1;
                cCharAt13 = strC.charAt(i36);
                if (cCharAt13 < 55296) {
                    break;
                }
                i37 |= (cCharAt13 & 8191) << i38;
                i38 += 13;
                i36 = i33;
            }
            iCharAt4 = i37 | (cCharAt13 << i38);
            i36 = i33;
        }
        if (iCharAt4 == 0) {
            i11 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i9 = 0;
            iCharAt3 = 0;
            iArr = f11728o;
            i10 = 0;
        } else {
            int i39 = i36 + 1;
            int iCharAt5 = strC.charAt(i36);
            if (iCharAt5 >= 55296) {
                int i40 = iCharAt5 & 8191;
                int i41 = 13;
                while (true) {
                    i19 = i39 + 1;
                    cCharAt8 = strC.charAt(i39);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i19;
                }
                iCharAt5 = i40 | (cCharAt8 << i41);
                i39 = i19;
            }
            int i42 = i39 + 1;
            int iCharAt6 = strC.charAt(i39);
            if (iCharAt6 >= 55296) {
                int i43 = iCharAt6 & 8191;
                int i44 = 13;
                while (true) {
                    i18 = i42 + 1;
                    cCharAt7 = strC.charAt(i42);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i18;
                }
                iCharAt6 = i43 | (cCharAt7 << i44);
                i42 = i18;
            }
            int i45 = i42 + 1;
            int iCharAt7 = strC.charAt(i42);
            if (iCharAt7 >= 55296) {
                int i46 = iCharAt7 & 8191;
                int i47 = 13;
                while (true) {
                    i17 = i45 + 1;
                    cCharAt6 = strC.charAt(i45);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i17;
                }
                iCharAt7 = i46 | (cCharAt6 << i47);
                i45 = i17;
            }
            int i48 = i45 + 1;
            iCharAt = strC.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i16 = i48 + 1;
                    cCharAt5 = strC.charAt(i48);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i16;
                }
                iCharAt = i49 | (cCharAt5 << i50);
                i48 = i16;
            }
            int i51 = i48 + 1;
            int iCharAt8 = strC.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i15 = i51 + 1;
                    cCharAt4 = strC.charAt(i51);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i15;
                }
                iCharAt8 = i52 | (cCharAt4 << i53);
                i51 = i15;
            }
            int i54 = i51 + 1;
            iCharAt2 = strC.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i14 = i54 + 1;
                    cCharAt3 = strC.charAt(i54);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i14;
                }
                iCharAt2 = i55 | (cCharAt3 << i56);
                i54 = i14;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strC.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i13 = i57 + 1;
                    cCharAt2 = strC.charAt(i57);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i13;
                }
                iCharAt9 = i58 | (cCharAt2 << i59);
                i57 = i13;
            }
            int i60 = i57 + 1;
            iCharAt3 = strC.charAt(i57);
            if (iCharAt3 >= 55296) {
                int i61 = iCharAt3 & 8191;
                int i62 = i60;
                int i63 = 13;
                while (true) {
                    i12 = i62 + 1;
                    cCharAt = strC.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i61 |= (cCharAt & 8191) << i63;
                    i63 += 13;
                    i62 = i12;
                }
                iCharAt3 = i61 | (cCharAt << i63);
                i60 = i12;
            }
            int[] iArr3 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i9 = (iCharAt5 * 2) + iCharAt6;
            i10 = iCharAt7;
            i11 = iCharAt8;
            iArr = iArr3;
            i34 = iCharAt5;
            i36 = i60;
        }
        Unsafe unsafe = f11729p;
        Object[] objArrB = b0Var.b();
        Class<?> cls = b0Var.a().getClass();
        int[] iArr4 = new int[i11 * 3];
        Object[] objArr = new Object[i11 * 2];
        int i64 = iCharAt2 + iCharAt3;
        int i65 = i64;
        int i66 = iCharAt3;
        int i67 = 0;
        int i68 = 0;
        while (i36 < length) {
            int i69 = i36 + 1;
            int iCharAt10 = strC.charAt(i36);
            int i70 = length;
            if (iCharAt10 >= 55296) {
                int i71 = iCharAt10 & 8191;
                int i72 = i69;
                int i73 = 13;
                while (true) {
                    i32 = i72 + 1;
                    cCharAt12 = strC.charAt(i72);
                    i20 = i64;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i32;
                    i64 = i20;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i21 = i32;
            } else {
                i20 = i64;
                i21 = i69;
            }
            int i74 = i21 + 1;
            int iCharAt11 = strC.charAt(i21);
            if (iCharAt11 >= 55296) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i31 = i76 + 1;
                    cCharAt11 = strC.charAt(i76);
                    i22 = iCharAt3;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i76 = i31;
                    iCharAt3 = i22;
                }
                iCharAt11 = i75 | (cCharAt11 << i77);
                i23 = i31;
            } else {
                i22 = iCharAt3;
                i23 = i74;
            }
            int i78 = iCharAt11 & 255;
            int i79 = iCharAt;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i67;
                i68++;
            }
            if (i78 >= 51) {
                int i80 = i23 + 1;
                int iCharAt12 = strC.charAt(i23);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i81 = 13;
                    int i82 = iCharAt12 & 8191;
                    int i83 = i80;
                    while (true) {
                        i30 = i83 + 1;
                        cCharAt10 = strC.charAt(i83);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i83 = i30;
                        c3 = 55296;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i81);
                    i28 = i30;
                } else {
                    i28 = i80;
                }
                int i84 = i28;
                int i85 = i78 - 51;
                if (i85 == 9 || i85 == 17) {
                    i29 = 2;
                    objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i9];
                    i9++;
                } else if (i85 != 12 || z4) {
                    i29 = 2;
                } else {
                    i29 = 2;
                    objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i9];
                    i9++;
                }
                int i86 = iCharAt12 * i29;
                Object obj = objArrB[i86];
                if (obj instanceof Field) {
                    fieldQ2 = (Field) obj;
                } else {
                    fieldQ2 = Q(cls, (String) obj);
                    objArrB[i86] = fieldQ2;
                }
                int[] iArr5 = iArr4;
                int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldQ2);
                int i87 = i86 + 1;
                Object obj2 = objArrB[i87];
                if (obj2 instanceof Field) {
                    fieldQ3 = (Field) obj2;
                } else {
                    fieldQ3 = Q(cls, (String) obj2);
                    objArrB[i87] = fieldQ3;
                }
                iArr2 = iArr5;
                z4 = z4;
                i78 = i78;
                i23 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldQ3);
                i25 = iObjectFieldOffset2;
                i24 = 0;
            } else {
                iCharAt10 = iCharAt10;
                iArr2 = iArr4;
                int i88 = i9 + 1;
                Field fieldQ4 = Q(cls, (String) objArrB[i9]);
                if (i78 == 9 || i78 == 17) {
                    iArr2 = iArr2;
                    z4 = z4;
                    objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = fieldQ4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i27 = i9 + 2;
                        objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i88];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (!z4) {
                            i27 = i9 + 2;
                            objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i88];
                        }
                    } else if (i78 == 50) {
                        int i89 = i66 + 1;
                        iArr[i66] = i67;
                        int i90 = (i67 / 3) * 2;
                        int i91 = i9 + 2;
                        objArr[i90] = objArrB[i88];
                        if ((iCharAt11 & 2048) != 0) {
                            i88 = i9 + 3;
                            objArr[i90 + 1] = objArrB[i91];
                            i66 = i89;
                        } else {
                            iArr2 = iArr2;
                            i66 = i89;
                            i88 = i91;
                            z4 = z4;
                        }
                    }
                    i88 = i27;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldQ4);
                if ((iCharAt11 & 4096) != 4096 || i78 > 17) {
                    iObjectFieldOffset = 1048575;
                    i24 = 0;
                } else {
                    int i92 = i23 + 1;
                    int iCharAt13 = strC.charAt(i23);
                    if (iCharAt13 >= 55296) {
                        int i93 = iCharAt13 & 8191;
                        int i94 = 13;
                        while (true) {
                            i26 = i92 + 1;
                            cCharAt9 = strC.charAt(i92);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i93 |= (cCharAt9 & 8191) << i94;
                            i94 += 13;
                            i92 = i26;
                        }
                        iCharAt13 = i93 | (cCharAt9 << i94);
                        i23 = i26;
                    } else {
                        i23 = i92;
                    }
                    int i95 = (iCharAt13 / 32) + (i34 * 2);
                    Object obj3 = objArrB[i95];
                    if (obj3 instanceof Field) {
                        fieldQ = (Field) obj3;
                    } else {
                        fieldQ = Q(cls, (String) obj3);
                        objArrB[i95] = fieldQ;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldQ);
                    i24 = iCharAt13 % 32;
                }
                if (i78 >= 18 && i78 <= 49) {
                    iArr[i65] = iObjectFieldOffset3;
                    i65++;
                }
                i9 = i88;
                i25 = iObjectFieldOffset3;
            }
            int i96 = i67 + 1;
            iArr2[i67] = iCharAt10;
            int i97 = i67 + 2;
            String str = strC;
            iArr2[i96] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i78 << 20) | i25;
            i67 += 3;
            iArr2[i97] = (i24 << 20) | iObjectFieldOffset;
            i36 = i23;
            iArr4 = iArr2;
            iCharAt = i79;
            length = i70;
            strC = str;
            i64 = i20;
            iCharAt3 = i22;
            z4 = z4;
            i10 = i10;
        }
        return new T(iArr4, objArr, i10, iCharAt, b0Var.a(), z4, iArr, iCharAt3, i64, v6, i7, g0Var, c0836p, n2);
    }

    public static long E(int i7) {
        return i7 & 1048575;
    }

    public static int F(long j, Object obj) {
        return ((Integer) o0.f11810c.i(j, obj)).intValue();
    }

    public static long G(long j, Object obj) {
        return ((Long) o0.f11810c.i(j, obj)).longValue();
    }

    public static Field Q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbK = p031e1.k.k("Field ", str, " for ");
            sbK.append(cls.getName());
            sbK.append(" not found. Known fields are ");
            sbK.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbK.toString());
        }
    }

    public static int W(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void Z(int i7, Object obj, L l7) throws Z4.b {
        if (!(obj instanceof String)) {
            l7.b(i7, (AbstractC0829i) obj);
            return;
        }
        String str = (String) obj;
        C0832l c0832l = (C0832l) l7.f11722a;
        c0832l.L0(i7, 2);
        int i8 = c0832l.j;
        try {
            int iB0 = C0832l.B0(str.length() * 3);
            int iB1 = C0832l.B0(str.length());
            byte[] bArr = c0832l.f11801h;
            int i9 = c0832l.f11802i;
            if (iB1 == iB0) {
                int i10 = i8 + iB1;
                c0832l.j = i10;
                int iX = r0.f11823a.x(str, bArr, i10, i9 - i10);
                c0832l.j = i8;
                c0832l.M0((iX - i8) - iB1);
                c0832l.j = iX;
            } else {
                c0832l.M0(r0.b(str));
                int i11 = c0832l.j;
                c0832l.j = r0.f11823a.x(str, bArr, i11, i9 - i11);
            }
        } catch (q0 e7) {
            c0832l.j = i8;
            C0832l.f11798k.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(A.f11702a);
            try {
                c0832l.M0(bytes.length);
                c0832l.F0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e8) {
                throw new Z4.b(e8);
            }
        } catch (IndexOutOfBoundsException e9) {
            throw new Z4.b(e9);
        }
    }

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0842w) {
            return ((AbstractC0842w) obj).p();
        }
        return true;
    }

    public static List v(AbstractC0842w abstractC0842w, long j) {
        return (List) o0.f11810c.i(j, abstractC0842w);
    }

    public final Object A(int i7, Object obj) {
        c0 c0VarP = p(i7);
        long jX = X(i7) & 1048575;
        if (!s(i7, obj)) {
            return c0VarP.d();
        }
        Object object = f11729p.getObject(obj, jX);
        if (t(object)) {
            return object;
        }
        Object objD = c0VarP.d();
        if (object != null) {
            c0VarP.a(objD, object);
        }
        return objD;
    }

    public final Object B(int i7, int i8, Object obj) {
        c0 c0VarP = p(i8);
        if (!u(i7, i8, obj)) {
            return c0VarP.d();
        }
        Object object = f11729p.getObject(obj, X(i8) & 1048575);
        if (t(object)) {
            return object;
        }
        Object objD = c0VarP.d();
        if (object != null) {
            c0VarP.a(objD, object);
        }
        return objD;
    }

    public final void H(long j, Object obj, int i7) {
        Unsafe unsafe = f11729p;
        Object objO = o(i7);
        Object object = unsafe.getObject(obj, j);
        this.f11742n.getClass();
        if (N.c(object)) {
            M mE = N.e();
            N.d(mE, object);
            unsafe.putObject(obj, j, mE);
        }
        N.a(objO);
        throw null;
    }

    public final int I(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, C0824d c0824d) throws C {
        Unsafe unsafe = f11729p;
        long j3 = this.f11730a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j, Double.valueOf(p003a.a.l(i7, bArr)));
                int i15 = i7 + 8;
                unsafe.putInt(obj, j3, i10);
                return i15;
            case 52:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j, Float.valueOf(p003a.a.r(i7, bArr)));
                int i16 = i7 + 4;
                unsafe.putInt(obj, j3, i10);
                return i16;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i7;
                }
                int iO = p003a.a.O(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Long.valueOf(c0824d.f11762b));
                unsafe.putInt(obj, j3, i10);
                return iO;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i7;
                }
                int iM = p003a.a.M(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Integer.valueOf(c0824d.f11761a));
                unsafe.putInt(obj, j3, i10);
                return iM;
            case 56:
            case 65:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j, Long.valueOf(p003a.a.p(i7, bArr)));
                int i17 = i7 + 8;
                unsafe.putInt(obj, j3, i10);
                return i17;
            case 57:
            case 64:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j, Integer.valueOf(p003a.a.n(i7, bArr)));
                int i18 = i7 + 4;
                unsafe.putInt(obj, j3, i10);
                return i18;
            case 58:
                if (i11 != 0) {
                    return i7;
                }
                int iO2 = p003a.a.O(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Boolean.valueOf(c0824d.f11762b != 0));
                unsafe.putInt(obj, j3, i10);
                return iO2;
            case 59:
                if (i11 != 2) {
                    return i7;
                }
                int iM2 = p003a.a.M(bArr, i7, c0824d);
                int i19 = c0824d.f11761a;
                if (i19 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i12 & 536870912) != 0 && !r0.e(bArr, iM2, iM2 + i19)) {
                        throw C.b();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iM2, i19, A.f11702a));
                    iM2 += i19;
                }
                unsafe.putInt(obj, j3, i10);
                return iM2;
            case 60:
                if (i11 != 2) {
                    return i7;
                }
                Object objB = B(i10, i14, obj);
                int iD0 = p003a.a.d0(objB, p(i14), bArr, i7, i8, c0824d);
                V(obj, i10, i14, objB);
                return iD0;
            case 61:
                if (i11 != 2) {
                    return i7;
                }
                int iJ = p003a.a.j(bArr, i7, c0824d);
                unsafe.putObject(obj, j, c0824d.f11763c);
                unsafe.putInt(obj, j3, i10);
                return iJ;
            case 63:
                if (i11 != 0) {
                    return i7;
                }
                int iM3 = p003a.a.M(bArr, i7, c0824d);
                int i20 = c0824d.f11761a;
                n(i14);
                unsafe.putObject(obj, j, Integer.valueOf(i20));
                unsafe.putInt(obj, j3, i10);
                return iM3;
            case 66:
                if (i11 != 0) {
                    return i7;
                }
                int iM4 = p003a.a.M(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Integer.valueOf(L3.e.d(c0824d.f11761a)));
                unsafe.putInt(obj, j3, i10);
                return iM4;
            case 67:
                if (i11 != 0) {
                    return i7;
                }
                int iO3 = p003a.a.O(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Long.valueOf(L3.e.e(c0824d.f11762b)));
                unsafe.putInt(obj, j3, i10);
                return iO3;
            case 68:
                if (i11 != 3) {
                    return i7;
                }
                Object objB2 = B(i10, i14, obj);
                int iC0 = p003a.a.c0(objB2, p(i14), bArr, i7, i8, (i9 & (-8)) | 4, c0824d);
                V(obj, i10, i14, objB2);
                return iC0;
            default:
                return i7;
        }
    }

    public final int J(Object obj, byte[] bArr, int i7, int i8, int i9, C0824d c0824d) {
        Unsafe unsafe;
        int i10;
        int iL;
        int i11;
        int iT;
        int iT2;
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
        int iO;
        int i25;
        int i26;
        this = this;
        bArr = bArr;
        i8 = i8;
        int i27 = i9;
        c0824d = c0824d;
        l(obj);
        Unsafe unsafe2 = f11729p;
        int iK = i7;
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 1048575;
        while (true) {
            if (iK < i8) {
                int i33 = iK + 1;
                byte b7 = bArr[iK];
                if (b7 < 0) {
                    iL = p003a.a.L(b7, bArr, i33, c0824d);
                    i10 = c0824d.f11761a;
                } else {
                    i10 = b7;
                    iL = i33;
                }
                int i34 = i10 >>> 3;
                int i35 = i10 & 7;
                int i36 = this.f11733d;
                int i37 = iL;
                int i38 = this.f11732c;
                int i39 = i10;
                if (i34 > i28) {
                    iT2 = (i34 < i38 || i34 > i36) ? -1 : this.T(i34, i29 / 3);
                    i12 = -1;
                    i11 = 0;
                } else {
                    if (i34 < i38 || i34 > i36) {
                        i11 = 0;
                        iT = -1;
                    } else {
                        i11 = 0;
                        iT = this.T(i34, 0);
                    }
                    iT2 = iT;
                    i12 = -1;
                }
                if (iT2 == i12) {
                    i13 = i32;
                    i14 = i34;
                    i15 = i11;
                    unsafe = unsafe2;
                    i9 = i27;
                    i16 = i37;
                    i17 = i39;
                    i18 = i31;
                } else {
                    int[] iArr = this.f11730a;
                    int i40 = iArr[iT2 + 1];
                    int iW = W(i40);
                    long j = i40 & 1048575;
                    if (iW <= 17) {
                        int i41 = iArr[iT2 + 2];
                        int i42 = 1 << (i41 >>> 20);
                        int i43 = i41 & 1048575;
                        if (i43 != i32) {
                            if (i32 != 1048575) {
                                unsafe2.putInt(obj, i32, i31);
                            }
                            i20 = i43;
                            i19 = unsafe2.getInt(obj, i43);
                        } else {
                            i19 = i31;
                            i20 = i32;
                        }
                        switch (iW) {
                            case 0:
                                i14 = i34;
                                i21 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 1) {
                                    o0.r(obj, j, p003a.a.l(i21, bArr));
                                    iK = i21 + 8;
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 1:
                                i14 = i34;
                                i21 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 5) {
                                    o0.s(obj, j, p003a.a.r(i21, bArr));
                                    iK = i21 + 4;
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 2:
                            case 3:
                                i14 = i34;
                                i21 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 0) {
                                    iO = p003a.a.O(bArr, i21, c0824d);
                                    unsafe2.putLong(obj, j, c0824d.f11762b);
                                    i31 = i19 | i42;
                                    iK = iO;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 4:
                            case 11:
                                i14 = i34;
                                i21 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 0) {
                                    iK = p003a.a.M(bArr, i21, c0824d);
                                    unsafe2.putInt(obj, j, c0824d.f11761a);
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 5:
                            case 14:
                                i14 = i34;
                                i25 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 1) {
                                    unsafe2.putLong(obj, j, p003a.a.p(i25, bArr));
                                    iK = i25 + 8;
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 6:
                            case 13:
                                i14 = i34;
                                i25 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 5) {
                                    unsafe2.putInt(obj, j, p003a.a.n(i25, bArr));
                                    iK = i25 + 4;
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 7:
                                i14 = i34;
                                i25 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 0) {
                                    int iO2 = p003a.a.O(bArr, i25, c0824d);
                                    o0.n(obj, j, c0824d.f11762b != 0);
                                    i31 = i19 | i42;
                                    iK = iO2;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 8:
                                i14 = i34;
                                i25 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 2) {
                                    iK = (i40 & 536870912) == 0 ? p003a.a.G(bArr, i25, c0824d) : p003a.a.J(bArr, i25, c0824d);
                                    unsafe2.putObject(obj, j, c0824d.f11763c);
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 9:
                                i14 = i34;
                                i25 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 2) {
                                    Object objA = this.A(i24, obj);
                                    iK = p003a.a.d0(objA, this.p(i24), bArr, i25, i8, c0824d);
                                    this.U(i24, obj, objA);
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 10:
                                i14 = i34;
                                i25 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 2) {
                                    iK = p003a.a.j(bArr, i25, c0824d);
                                    unsafe2.putObject(obj, j, c0824d.f11763c);
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 12:
                                i14 = i34;
                                i25 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 0) {
                                    iK = p003a.a.M(bArr, i25, c0824d);
                                    int i44 = c0824d.f11761a;
                                    this.n(i24);
                                    unsafe2.putInt(obj, j, i44);
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 15:
                                i14 = i34;
                                i25 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 0) {
                                    iK = p003a.a.M(bArr, i25, c0824d);
                                    unsafe2.putInt(obj, j, L3.e.d(c0824d.f11761a));
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 16:
                                i14 = i34;
                                i25 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                if (i35 == 0) {
                                    iO = p003a.a.O(bArr, i25, c0824d);
                                    unsafe2.putLong(obj, j, L3.e.e(c0824d.f11762b));
                                    i31 = i19 | i42;
                                    iK = iO;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            case 17:
                                if (i35 == 3) {
                                    Object objA2 = this.A(iT2, obj);
                                    i23 = i20;
                                    i22 = i39;
                                    i24 = iT2;
                                    i14 = i34;
                                    iK = p003a.a.c0(objA2, this.p(iT2), bArr, i37, i8, (i34 << 3) | 4, c0824d);
                                    this.U(i24, obj, objA2);
                                    i31 = i19 | i42;
                                    i29 = i24;
                                    i28 = i14;
                                    i30 = i22;
                                    i32 = i23;
                                    i27 = i9;
                                } else {
                                    i14 = i34;
                                    i25 = i37;
                                    i22 = i39;
                                    i23 = i20;
                                    i24 = iT2;
                                    i21 = i25;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i15 = i24;
                                    i17 = i22;
                                    i13 = i23;
                                    i9 = i9;
                                    i18 = i19;
                                }
                                break;
                            default:
                                i14 = i34;
                                i21 = i37;
                                i22 = i39;
                                i23 = i20;
                                i24 = iT2;
                                i16 = i21;
                                unsafe = unsafe2;
                                i15 = i24;
                                i17 = i22;
                                i13 = i23;
                                i9 = i9;
                                i18 = i19;
                                break;
                        }
                    } else {
                        i14 = i34;
                        int i45 = iT2;
                        if (iW != 27) {
                            i18 = i31;
                            i13 = i32;
                            if (iW <= 49) {
                                unsafe = unsafe2;
                                i15 = i45;
                                iK = L(obj, bArr, i37, i8, i39, i35, i45, i40, iW, j, c0824d);
                                if (iK != i37) {
                                    i27 = i9;
                                    i28 = i14;
                                    i30 = i39;
                                } else {
                                    i16 = iK;
                                }
                                i31 = i18;
                                i32 = i13;
                                unsafe2 = unsafe;
                                i29 = i15;
                            } else {
                                i26 = i37;
                                unsafe = unsafe2;
                                i15 = i45;
                                if (iW != 50) {
                                    iK = I(obj, bArr, i26, i8, i39, i14, i35, i40, iW, j, i15, c0824d);
                                    if (iK != i26) {
                                        this = this;
                                        bArr = bArr;
                                        i8 = i8;
                                        i27 = i9;
                                        c0824d = c0824d;
                                        i29 = i15;
                                        i28 = i14;
                                        i30 = i39;
                                        i31 = i18;
                                        i32 = i13;
                                        unsafe2 = unsafe;
                                    } else {
                                        i16 = iK;
                                        i15 = i15;
                                    }
                                } else if (i35 == 2) {
                                    H(j, obj, i15);
                                    throw null;
                                }
                            }
                            i17 = i39;
                        } else if (i35 == 2) {
                            AbstractC0822b abstractC0822b = (AbstractC0822b) ((InterfaceC0845z) unsafe2.getObject(obj, j));
                            boolean zM = abstractC0822b.m();
                            AbstractC0822b abstractC0822b2 = abstractC0822b;
                            if (!zM) {
                                int size = abstractC0822b.size();
                                InterfaceC0845z interfaceC0845zA = abstractC0822b.a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj, j, interfaceC0845zA);
                                abstractC0822b2 = interfaceC0845zA;
                            }
                            iK = p003a.a.u(this.p(i45), i39, bArr, i37, i8, abstractC0822b2, c0824d);
                            i8 = i8;
                            i29 = i45;
                            i28 = i14;
                            i30 = i39;
                            i31 = i31;
                            i32 = i32;
                            i27 = i9;
                        } else {
                            i18 = i31;
                            i13 = i32;
                            i26 = i37;
                            unsafe = unsafe2;
                            i15 = i45;
                        }
                        i16 = i26;
                        i17 = i39;
                    }
                }
                if (i17 != i9 || i9 == 0) {
                    AbstractC0842w abstractC0842w = (AbstractC0842w) obj;
                    f0 f0VarC = abstractC0842w.unknownFields;
                    if (f0VarC == f0.f11769f) {
                        f0VarC = f0.c();
                        abstractC0842w.unknownFields = f0VarC;
                    }
                    iK = p003a.a.K(i17, bArr, i16, i8, f0VarC, c0824d);
                    i27 = i9;
                    i30 = i17;
                    i28 = i14;
                    i31 = i18;
                    i32 = i13;
                    unsafe2 = unsafe;
                    i29 = i15;
                } else {
                    iK = i16;
                    i30 = i17;
                    i31 = i18;
                    i32 = i13;
                }
            } else {
                unsafe = unsafe2;
                i9 = i27;
            }
        }
        if (i32 != 1048575) {
            unsafe.putInt(obj, i32, i31);
        }
        for (int i46 = this.f11738i; i46 < this.j; i46++) {
            m(this.f11737h[i46], obj, null);
        }
        if (i9 == 0) {
            if (iK != i8) {
                throw C.f();
            }
        } else if (iK > i8 || i30 != i9) {
            throw C.f();
        }
        return iK;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x009c. Please report as an issue. */
    public final void K(Object obj, byte[] bArr, int i7, int i8, C0824d c0824d) throws C {
        int i9;
        int iL;
        int iT;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Unsafe unsafe;
        int i15;
        int i16;
        int i17;
        int i18;
        int iO;
        int i19;
        this = this;
        bArr = bArr;
        i8 = i8;
        c0824d = c0824d;
        l(obj);
        Unsafe unsafe2 = f11729p;
        int i20 = 0;
        int iK = i7;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = 1048575;
        while (iK < i8) {
            int i25 = iK + 1;
            byte b7 = bArr[iK];
            if (b7 < 0) {
                iL = p003a.a.L(b7, bArr, i25, c0824d);
                i9 = c0824d.f11761a;
            } else {
                i9 = b7;
                iL = i25;
            }
            int i26 = i9 >>> 3;
            int i27 = i9 & 7;
            int i28 = this.f11733d;
            int i29 = this.f11732c;
            if (i26 > i23) {
                int i30 = i21 / 3;
                if (i26 < i29 || i26 > i28) {
                    iT = -1;
                } else {
                    iT = this.T(i26, i30);
                }
            } else if (i26 < i29 || i26 > i28) {
                iT = -1;
            } else {
                iT = this.T(i26, i20);
            }
            i21 = iT;
            if (i21 == -1) {
                i10 = i26;
                i11 = iL;
                i12 = i22;
                i13 = i20;
                i14 = i13;
                unsafe = unsafe2;
            } else {
                int[] iArr = this.f11730a;
                int i31 = iArr[i21 + 1];
                int iW = W(i31);
                i10 = i26;
                int i32 = iL;
                long j = i31 & 1048575;
                if (iW <= 17) {
                    int i33 = iArr[i21 + 2];
                    int i34 = 1 << (i33 >>> 20);
                    int i35 = i33 & 1048575;
                    if (i35 != i24) {
                        if (i24 != 1048575) {
                            unsafe2.putInt(obj, i24, i22);
                        }
                        if (i35 != 1048575) {
                            i22 = unsafe2.getInt(obj, i35);
                        }
                        i17 = i35;
                    } else {
                        i17 = i24;
                    }
                    int i36 = i22;
                    switch (iW) {
                        case 0:
                            i18 = i32;
                            if (i27 != 1) {
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                o0.r(obj, j, p003a.a.l(i18, bArr));
                                iK = i18 + 8;
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 1:
                            i18 = i32;
                            if (i27 != 5) {
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                o0.s(obj, j, p003a.a.r(i18, bArr));
                                iK = i18 + 4;
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 2:
                        case 3:
                            i18 = i32;
                            if (i27 != 0) {
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                iO = p003a.a.O(bArr, i18, c0824d);
                                unsafe2.putLong(obj, j, c0824d.f11762b);
                                i22 = i36 | i34;
                                i24 = i17;
                                iK = iO;
                                i23 = i10;
                                i20 = 0;
                                i8 = i8;
                            }
                            break;
                        case 4:
                        case 11:
                            i18 = i32;
                            if (i27 != 0) {
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                iK = p003a.a.M(bArr, i18, c0824d);
                                unsafe2.putInt(obj, j, c0824d.f11761a);
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 5:
                        case 14:
                            i19 = i32;
                            if (i27 != 1) {
                                i18 = i19;
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                i18 = i19;
                                unsafe2.putLong(obj, j, p003a.a.p(i19, bArr));
                                iK = i18 + 8;
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 6:
                        case 13:
                            i19 = i32;
                            if (i27 != 5) {
                                i18 = i19;
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                unsafe2.putInt(obj, j, p003a.a.n(i19, bArr));
                                iK = i19 + 4;
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 7:
                            i19 = i32;
                            if (i27 != 0) {
                                i18 = i19;
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                iK = p003a.a.O(bArr, i19, c0824d);
                                o0.n(obj, j, c0824d.f11762b != 0);
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 8:
                            i19 = i32;
                            if (i27 != 2) {
                                i18 = i19;
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                iK = (536870912 & i31) == 0 ? p003a.a.G(bArr, i19, c0824d) : p003a.a.J(bArr, i19, c0824d);
                                unsafe2.putObject(obj, j, c0824d.f11763c);
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 9:
                            i19 = i32;
                            if (i27 != 2) {
                                i18 = i19;
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                Object objA = this.A(i21, obj);
                                iK = p003a.a.d0(objA, this.p(i21), bArr, i19, i8, c0824d);
                                this.U(i21, obj, objA);
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 10:
                            i19 = i32;
                            if (i27 != 2) {
                                i18 = i19;
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                iK = p003a.a.j(bArr, i19, c0824d);
                                unsafe2.putObject(obj, j, c0824d.f11763c);
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 12:
                            i19 = i32;
                            if (i27 != 0) {
                                i18 = i19;
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                iK = p003a.a.M(bArr, i19, c0824d);
                                unsafe2.putInt(obj, j, c0824d.f11761a);
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 15:
                            i19 = i32;
                            if (i27 != 0) {
                                i18 = i19;
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                iK = p003a.a.M(bArr, i19, c0824d);
                                unsafe2.putInt(obj, j, L3.e.d(c0824d.f11761a));
                                i22 = i36 | i34;
                                i8 = i8;
                                i24 = i17;
                                i21 = i21;
                                i23 = i10;
                                i20 = 0;
                            }
                            break;
                        case 16:
                            if (i27 != 0) {
                                i18 = i32;
                                i12 = i36;
                                i24 = i17;
                                i14 = i21;
                                unsafe = unsafe2;
                                i11 = i18;
                                i13 = 0;
                            } else {
                                iO = p003a.a.O(bArr, i32, c0824d);
                                unsafe2.putLong(obj, j, L3.e.e(c0824d.f11762b));
                                i22 = i36 | i34;
                                i24 = i17;
                                iK = iO;
                                i23 = i10;
                                i20 = 0;
                                i8 = i8;
                            }
                            break;
                        default:
                            i18 = i32;
                            i12 = i36;
                            i24 = i17;
                            i14 = i21;
                            unsafe = unsafe2;
                            i11 = i18;
                            i13 = 0;
                            break;
                    }
                } else {
                    if (iW != 27) {
                        int i37 = i24;
                        int i38 = i22;
                        if (iW <= 49) {
                            i15 = i37;
                            i12 = i38;
                            i14 = i21;
                            i13 = 0;
                            unsafe = unsafe2;
                            iK = L(obj, bArr, i32, i8, i9, i27, i21, i31, iW, j, c0824d);
                            if (iK != i32) {
                                i20 = 0;
                                i23 = i10;
                                i24 = i15;
                            } else {
                                i11 = iK;
                            }
                            i22 = i12;
                            i21 = i14;
                            unsafe2 = unsafe;
                        } else {
                            i15 = i37;
                            i12 = i38;
                            i16 = i32;
                            i14 = i21;
                            unsafe = unsafe2;
                            i13 = 0;
                            if (iW != 50) {
                                iK = I(obj, bArr, i16, i8, i9, i10, i27, i31, iW, j, i14, c0824d);
                                if (iK != i16) {
                                    this = this;
                                    bArr = bArr;
                                    i8 = i8;
                                    c0824d = c0824d;
                                    i20 = 0;
                                    i23 = i10;
                                    i21 = i14;
                                    i24 = i15;
                                    i22 = i12;
                                } else {
                                    i11 = iK;
                                    i14 = i14;
                                }
                            } else if (i27 == 2) {
                                H(j, obj, i14);
                                throw null;
                            }
                            unsafe2 = unsafe;
                        }
                        i24 = i15;
                    } else if (i27 == 2) {
                        AbstractC0822b abstractC0822b = (AbstractC0822b) ((InterfaceC0845z) unsafe2.getObject(obj, j));
                        boolean zM = abstractC0822b.m();
                        AbstractC0822b abstractC0822b2 = abstractC0822b;
                        if (!zM) {
                            int size = abstractC0822b.size();
                            InterfaceC0845z interfaceC0845zA = abstractC0822b.a(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj, j, interfaceC0845zA);
                            abstractC0822b2 = interfaceC0845zA;
                        }
                        iK = p003a.a.u(this.p(i21), i9, bArr, i32, i8, abstractC0822b2, c0824d);
                        i22 = i22;
                        i24 = i24;
                        i23 = i10;
                        i20 = 0;
                        i8 = i8;
                    } else {
                        i12 = i22;
                        i16 = i32;
                        i14 = i21;
                        unsafe = unsafe2;
                        i15 = i24;
                        i13 = 0;
                    }
                    i11 = i16;
                    i24 = i15;
                }
            }
            AbstractC0842w abstractC0842w = (AbstractC0842w) obj;
            f0 f0VarC = abstractC0842w.unknownFields;
            if (f0VarC == f0.f11769f) {
                f0VarC = f0.c();
                abstractC0842w.unknownFields = f0VarC;
            }
            iK = p003a.a.K(i9, bArr, i11, i8, f0VarC, c0824d);
            i20 = i13;
            i23 = i10;
            i22 = i12;
            i21 = i14;
            unsafe2 = unsafe;
        }
        int i39 = i22;
        int i40 = i24;
        Unsafe unsafe3 = unsafe2;
        if (i40 != 1048575) {
            unsafe3.putInt(obj, i40, i39);
        }
        if (iK != i8) {
            throw C.f();
        }
    }

    public final int L(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, long j, int i12, long j3, C0824d c0824d) throws C {
        int iN;
        Unsafe unsafe = f11729p;
        AbstractC0822b abstractC0822b = (AbstractC0822b) ((InterfaceC0845z) unsafe.getObject(obj, j3));
        boolean zM = abstractC0822b.m();
        AbstractC0822b abstractC0822b2 = abstractC0822b;
        if (!zM) {
            int size = abstractC0822b.size();
            InterfaceC0845z interfaceC0845zA = abstractC0822b.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j3, interfaceC0845zA);
            abstractC0822b2 = interfaceC0845zA;
        }
        switch (i12) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return p003a.a.w(bArr, i7, abstractC0822b2, c0824d);
                }
                return i10 == 1 ? p003a.a.m(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 19:
            case 36:
                if (i10 == 2) {
                    return p003a.a.z(bArr, i7, abstractC0822b2, c0824d);
                }
                return i10 == 5 ? p003a.a.s(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i10 == 2) {
                    return p003a.a.D(bArr, i7, abstractC0822b2, c0824d);
                }
                return i10 == 0 ? p003a.a.P(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return p003a.a.C(bArr, i7, abstractC0822b2, c0824d);
                }
                return i10 == 0 ? p003a.a.N(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return p003a.a.y(bArr, i7, abstractC0822b2, c0824d);
                }
                return i10 == 1 ? p003a.a.q(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return p003a.a.x(bArr, i7, abstractC0822b2, c0824d);
                }
                return i10 == 5 ? p003a.a.o(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 25:
            case 42:
                if (i10 == 2) {
                    return p003a.a.v(bArr, i7, abstractC0822b2, c0824d);
                }
                return i10 == 0 ? p003a.a.i(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 26:
                if (i10 == 2) {
                    return (j & 536870912) == 0 ? p003a.a.H(i9, bArr, i7, i8, abstractC0822b2, c0824d) : p003a.a.I(i9, bArr, i7, i8, abstractC0822b2, c0824d);
                }
                return i7;
            case 27:
                return i10 == 2 ? p003a.a.u(p(i11), i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 28:
                return i10 == 2 ? p003a.a.k(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 30:
            case 44:
                if (i10 == 2) {
                    iN = p003a.a.C(bArr, i7, abstractC0822b2, c0824d);
                } else {
                    if (i10 != 0) {
                        return i7;
                    }
                    iN = p003a.a.N(i9, bArr, i7, i8, abstractC0822b2, c0824d);
                }
                n(i11);
                Class cls = d0.f11764a;
                return iN;
            case 33:
            case 47:
                if (i10 == 2) {
                    return p003a.a.A(bArr, i7, abstractC0822b2, c0824d);
                }
                return i10 == 0 ? p003a.a.E(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 34:
            case 48:
                if (i10 == 2) {
                    return p003a.a.B(bArr, i7, abstractC0822b2, c0824d);
                }
                return i10 == 0 ? p003a.a.F(i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            case 49:
                return i10 == 3 ? p003a.a.t(p(i11), i9, bArr, i7, i8, abstractC0822b2, c0824d) : i7;
            default:
                return i7;
        }
    }

    public final void M(Object obj, long j, C0665j c0665j, c0 c0Var, C0835o c0835o) throws B {
        int iC;
        List listC = this.f11740l.c(j, obj);
        int i7 = c0665j.f9210b;
        if ((i7 & 7) != 3) {
            throw C.c();
        }
        do {
            Object objD = c0Var.d();
            c0665j.d(objD, c0Var, c0835o);
            c0Var.b(objD);
            listC.add(objD);
            L3.e eVar = (L3.e) c0665j.f9213e;
            if (eVar.g() || c0665j.f9212d != 0) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == i7);
        c0665j.f9212d = iC;
    }

    public final void N(Object obj, int i7, C0665j c0665j, c0 c0Var, C0835o c0835o) throws C {
        int iC;
        List listC = this.f11740l.c(i7 & 1048575, obj);
        int i8 = c0665j.f9210b;
        if ((i8 & 7) != 2) {
            throw C.c();
        }
        do {
            Object objD = c0Var.d();
            c0665j.g(objD, c0Var, c0835o);
            c0Var.b(objD);
            listC.add(objD);
            L3.e eVar = (L3.e) c0665j.f9213e;
            if (eVar.g() || c0665j.f9212d != 0) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == i8);
        c0665j.f9212d = iC;
    }

    public final void O(int i7, C0665j c0665j, Object obj) throws B, com.google.protobuf.L, C0678x {
        if ((536870912 & i7) != 0) {
            c0665j.W(2);
            o0.v(obj, i7 & 1048575, ((L3.e) c0665j.f9213e).B());
        } else if (!this.f11735f) {
            o0.v(obj, i7 & 1048575, c0665j.n());
        } else {
            c0665j.W(2);
            o0.v(obj, i7 & 1048575, ((L3.e) c0665j.f9213e).A());
        }
    }

    public final void P(int i7, C0665j c0665j, Object obj) throws B, com.google.protobuf.L, C0678x {
        boolean z4 = (536870912 & i7) != 0;
        I i8 = this.f11740l;
        if (z4) {
            c0665j.Q(i8.c(i7 & 1048575, obj), true);
        } else {
            c0665j.Q(i8.c(i7 & 1048575, obj), false);
        }
    }

    public final void R(int i7, Object obj) {
        int i8 = this.f11730a[i7 + 2];
        long j = 1048575 & i8;
        if (j == 1048575) {
            return;
        }
        o0.t(j, obj, (1 << (i8 >>> 20)) | o0.f11810c.g(j, obj));
    }

    public final void S(int i7, int i8, Object obj) {
        o0.t(this.f11730a[i8 + 2] & 1048575, obj, i7);
    }

    public final int T(int i7, int i8) {
        int[] iArr = this.f11730a;
        int length = (iArr.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = iArr[i10];
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

    public final void U(int i7, Object obj, Object obj2) {
        f11729p.putObject(obj, X(i7) & 1048575, obj2);
        R(i7, obj);
    }

    public final void V(Object obj, int i7, int i8, Object obj2) {
        f11729p.putObject(obj, X(i8) & 1048575, obj2);
        S(i7, i8, obj);
    }

    public final int X(int i7) {
        return this.f11730a[i7 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Y(Object obj, L l7) throws Z4.b {
        int i7;
        boolean z4;
        int[] iArr = this.f11730a;
        int length = iArr.length;
        Unsafe unsafe = f11729p;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int iX = X(i10);
            int i12 = iArr[i10];
            int iW = W(iX);
            if (iW <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i11 = unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            int i15 = i7;
            long j = iX & i8;
            switch (iW) {
                case 0:
                    if ((i11 & i15) != 0) {
                        l7.c(i12, o0.f11810c.e(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 1:
                    if ((i11 & i15) != 0) {
                        l7.g(o0.f11810c.f(j, obj), i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 2:
                    if ((i11 & i15) != 0) {
                        l7.j(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 3:
                    if ((i11 & i15) != 0) {
                        l7.q(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 4:
                    if ((i11 & i15) != 0) {
                        l7.i(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 5:
                    if ((i11 & i15) != 0) {
                        l7.f(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 6:
                    if ((i11 & i15) != 0) {
                        l7.e(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 7:
                    if ((i11 & i15) != 0) {
                        l7.a(i12, o0.f11810c.c(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 8:
                    if ((i11 & i15) != 0) {
                        Z(i12, unsafe.getObject(obj, j), l7);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 9:
                    if ((i11 & i15) != 0) {
                        l7.k(i12, unsafe.getObject(obj, j), p(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 10:
                    if ((i11 & i15) != 0) {
                        l7.b(i12, (AbstractC0829i) unsafe.getObject(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 11:
                    if ((i11 & i15) != 0) {
                        l7.p(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 12:
                    if ((i11 & i15) != 0) {
                        l7.d(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 13:
                    if ((i11 & i15) != 0) {
                        l7.l(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 14:
                    if ((i11 & i15) != 0) {
                        l7.m(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 15:
                    if ((i11 & i15) != 0) {
                        l7.n(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 16:
                    if ((i11 & i15) != 0) {
                        l7.o(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 17:
                    if ((i11 & i15) != 0) {
                        l7.h(i12, unsafe.getObject(obj, j), p(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 18:
                    d0.F(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 19:
                    d0.J(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 20:
                    d0.M(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    d0.U(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 22:
                    d0.L(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 23:
                    d0.I(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 24:
                    d0.H(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 25:
                    d0.D(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 26:
                    d0.S(iArr[i10], (List) unsafe.getObject(obj, j), l7);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 27:
                    d0.N(iArr[i10], (List) unsafe.getObject(obj, j), l7, p(i10));
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 28:
                    d0.E(iArr[i10], (List) unsafe.getObject(obj, j), l7);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 29:
                    z4 = false;
                    d0.T(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 30:
                    z4 = false;
                    d0.G(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 31:
                    z4 = false;
                    d0.O(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 32:
                    z4 = false;
                    d0.P(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 33:
                    z4 = false;
                    d0.Q(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 34:
                    z4 = false;
                    d0.R(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 35:
                    d0.F(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 36:
                    d0.J(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 37:
                    d0.M(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 38:
                    d0.U(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 39:
                    d0.L(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 40:
                    d0.I(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 41:
                    d0.H(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 42:
                    d0.D(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 43:
                    d0.T(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 44:
                    d0.G(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 45:
                    d0.O(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 46:
                    d0.P(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 47:
                    d0.Q(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 48:
                    d0.R(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 49:
                    d0.K(iArr[i10], (List) unsafe.getObject(obj, j), l7, p(i10));
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object objO = o(i10);
                        this.f11742n.getClass();
                        AbstractC0486a1.n(objO);
                        throw null;
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 51:
                    if (u(i12, i10, obj)) {
                        l7.c(i12, ((Double) o0.f11810c.i(j, obj)).doubleValue());
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 52:
                    if (u(i12, i10, obj)) {
                        l7.g(((Float) o0.f11810c.i(j, obj)).floatValue(), i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 53:
                    if (u(i12, i10, obj)) {
                        l7.j(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 54:
                    if (u(i12, i10, obj)) {
                        l7.q(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 55:
                    if (u(i12, i10, obj)) {
                        l7.i(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 56:
                    if (u(i12, i10, obj)) {
                        l7.f(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 57:
                    if (u(i12, i10, obj)) {
                        l7.e(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 58:
                    if (u(i12, i10, obj)) {
                        l7.a(i12, ((Boolean) o0.f11810c.i(j, obj)).booleanValue());
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 59:
                    if (u(i12, i10, obj)) {
                        Z(i12, unsafe.getObject(obj, j), l7);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 60:
                    if (u(i12, i10, obj)) {
                        l7.k(i12, unsafe.getObject(obj, j), p(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 61:
                    if (u(i12, i10, obj)) {
                        l7.b(i12, (AbstractC0829i) unsafe.getObject(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 62:
                    if (u(i12, i10, obj)) {
                        l7.p(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 63:
                    if (u(i12, i10, obj)) {
                        l7.d(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 64:
                    if (u(i12, i10, obj)) {
                        l7.l(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 65:
                    if (u(i12, i10, obj)) {
                        l7.m(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 66:
                    if (u(i12, i10, obj)) {
                        l7.n(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 67:
                    if (u(i12, i10, obj)) {
                        l7.o(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                case 68:
                    if (u(i12, i10, obj)) {
                        l7.h(i12, unsafe.getObject(obj, j), p(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                    break;
                default:
                    i10 += 3;
                    i8 = 1048575;
                    break;
            }
        }
        this.f11741m.getClass();
        ((AbstractC0842w) obj).unknownFields.e(l7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f11730a;
            if (i7 >= iArr.length) {
                d0.B(this.f11741m, obj, obj2);
                return;
            }
            int iX = X(i7);
            long j = 1048575 & iX;
            int i8 = iArr[i7];
            switch (W(iX)) {
                case 0:
                    if (s(i7, obj2)) {
                        o0.r(obj, j, o0.f11810c.e(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 1:
                    if (s(i7, obj2)) {
                        o0.s(obj, j, o0.f11810c.f(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 2:
                    if (s(i7, obj2)) {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 3:
                    if (s(i7, obj2)) {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 4:
                    if (s(i7, obj2)) {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 5:
                    if (s(i7, obj2)) {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 6:
                    if (s(i7, obj2)) {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 7:
                    if (s(i7, obj2)) {
                        o0.n(obj, j, o0.f11810c.c(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 8:
                    if (s(i7, obj2)) {
                        o0.v(obj, j, o0.f11810c.i(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 9:
                    y(i7, obj, obj2);
                    break;
                case 10:
                    if (s(i7, obj2)) {
                        o0.v(obj, j, o0.f11810c.i(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 11:
                    if (s(i7, obj2)) {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 12:
                    if (s(i7, obj2)) {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 13:
                    if (s(i7, obj2)) {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 14:
                    if (s(i7, obj2)) {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 15:
                    if (s(i7, obj2)) {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 16:
                    if (s(i7, obj2)) {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                    }
                    break;
                case 17:
                    y(i7, obj, obj2);
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
                    this.f11740l.b(obj, j, obj2);
                    break;
                case 50:
                    Class cls = d0.f11764a;
                    n0 n0Var = o0.f11810c;
                    Object objI = n0Var.i(j, obj);
                    Object objI2 = n0Var.i(j, obj2);
                    this.f11742n.getClass();
                    o0.v(obj, j, N.d(objI, objI2));
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
                    if (u(i8, i7, obj2)) {
                        o0.v(obj, j, o0.f11810c.i(j, obj2));
                        S(i8, i7, obj);
                    }
                    break;
                case 60:
                    z(i7, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(i8, i7, obj2)) {
                        o0.v(obj, j, o0.f11810c.i(j, obj2));
                        S(i8, i7, obj);
                    }
                    break;
                case 68:
                    z(i7, obj, obj2);
                    break;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void b(Object obj) {
        if (t(obj)) {
            if (obj instanceof AbstractC0842w) {
                AbstractC0842w abstractC0842w = (AbstractC0842w) obj;
                abstractC0842w.i();
                abstractC0842w.h();
                abstractC0842w.q();
            }
            int length = this.f11730a.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iX = X(i7);
                long j = 1048575 & iX;
                int iW = W(iX);
                if (iW != 9) {
                    switch (iW) {
                        case 17:
                            if (s(i7, obj)) {
                                p(i7).b(f11729p.getObject(obj, j));
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
                            this.f11740l.a(j, obj);
                            break;
                        case 50:
                            Unsafe unsafe = f11729p;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                this.f11742n.getClass();
                                N.f(object);
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (s(i7, obj)) {
                    p(i7).b(f11729p.getObject(obj, j));
                }
            }
            this.f11741m.getClass();
            g0.b(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9 A[LOOP:1: B:49:0x00b8->B:54:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final boolean c(Object obj) {
        List list;
        c0 c0VarP;
        int i7;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            boolean zS = true;
            if (i9 >= this.f11738i) {
                return true;
            }
            int i11 = this.f11737h[i9];
            int[] iArr = this.f11730a;
            int i12 = iArr[i11];
            int iX = X(i11);
            int i13 = iArr[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i8) {
                if (i14 != 1048575) {
                    i10 = f11729p.getInt(obj, i14);
                }
                i8 = i14;
            }
            if ((268435456 & iX) != 0) {
                if (!(i8 == 1048575 ? s(i11, obj) : (i10 & i15) != 0)) {
                    return false;
                }
            }
            int iW = W(iX);
            if (iW == 9 || iW == 17) {
                if (i8 == 1048575) {
                    zS = s(i11, obj);
                } else if ((i15 & i10) == 0) {
                    zS = false;
                }
                if (zS) {
                    if (!p(i11).c(o0.f11810c.i(iX & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iW == 27) {
                list = (List) o0.f11810c.i(iX & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    c0VarP = p(i11);
                    for (i7 = 0; i7 < list.size(); i7++) {
                        if (!c0VarP.c(list.get(i7))) {
                            return false;
                        }
                    }
                }
            } else if (iW == 60 || iW == 68) {
                if (u(i12, i11, obj)) {
                    if (!p(i11).c(o0.f11810c.i(iX & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iW == 49) {
                list = (List) o0.f11810c.i(iX & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    c0VarP = p(i11);
                    while (i7 < list.size()) {
                        if (!c0VarP.c(list.get(i7))) {
                            return false;
                        }
                    }
                }
            } else if (iW != 50) {
                continue;
            } else {
                Object objI = o0.f11810c.i(iX & 1048575, obj);
                this.f11742n.getClass();
                if (!((M) objI).isEmpty()) {
                    AbstractC0486a1.n(o(i11));
                    throw null;
                }
            }
            i9++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final Object d() {
        this.f11739k.getClass();
        return ((AbstractC0842w) this.f11734e).s();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int e(AbstractC0842w abstractC0842w) {
        int i7;
        int iB;
        int i8;
        int[] iArr = this.f11730a;
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iX = X(i10);
            int i11 = iArr[i10];
            long j = 1048575 & iX;
            int i12 = 1237;
            int iHashCode = 37;
            switch (W(iX)) {
                case 0:
                    i7 = i9 * 53;
                    iB = A.b(Double.doubleToLongBits(o0.f11810c.e(j, abstractC0842w)));
                    i9 = iB + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    iB = Float.floatToIntBits(o0.f11810c.f(j, abstractC0842w));
                    i9 = iB + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    iB = A.b(o0.f11810c.h(j, abstractC0842w));
                    i9 = iB + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    iB = A.b(o0.f11810c.h(j, abstractC0842w));
                    i9 = iB + i7;
                    break;
                case 4:
                    i7 = i9 * 53;
                    iB = o0.f11810c.g(j, abstractC0842w);
                    i9 = iB + i7;
                    break;
                case 5:
                    i7 = i9 * 53;
                    iB = A.b(o0.f11810c.h(j, abstractC0842w));
                    i9 = iB + i7;
                    break;
                case 6:
                    i7 = i9 * 53;
                    iB = o0.f11810c.g(j, abstractC0842w);
                    i9 = iB + i7;
                    break;
                case 7:
                    i8 = i9 * 53;
                    boolean zC = o0.f11810c.c(j, abstractC0842w);
                    Charset charset = A.f11702a;
                    if (zC) {
                        i12 = 1231;
                    }
                    i9 = i12 + i8;
                    break;
                case 8:
                    i7 = i9 * 53;
                    iB = ((String) o0.f11810c.i(j, abstractC0842w)).hashCode();
                    i9 = iB + i7;
                    break;
                case 9:
                    Object objI = o0.f11810c.i(j, abstractC0842w);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i9 * 53;
                    iB = o0.f11810c.i(j, abstractC0842w).hashCode();
                    i9 = iB + i7;
                    break;
                case 11:
                    i7 = i9 * 53;
                    iB = o0.f11810c.g(j, abstractC0842w);
                    i9 = iB + i7;
                    break;
                case 12:
                    i7 = i9 * 53;
                    iB = o0.f11810c.g(j, abstractC0842w);
                    i9 = iB + i7;
                    break;
                case 13:
                    i7 = i9 * 53;
                    iB = o0.f11810c.g(j, abstractC0842w);
                    i9 = iB + i7;
                    break;
                case 14:
                    i7 = i9 * 53;
                    iB = A.b(o0.f11810c.h(j, abstractC0842w));
                    i9 = iB + i7;
                    break;
                case 15:
                    i7 = i9 * 53;
                    iB = o0.f11810c.g(j, abstractC0842w);
                    i9 = iB + i7;
                    break;
                case 16:
                    i7 = i9 * 53;
                    iB = A.b(o0.f11810c.h(j, abstractC0842w));
                    i9 = iB + i7;
                    break;
                case 17:
                    Object objI2 = o0.f11810c.i(j, abstractC0842w);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
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
                    iB = o0.f11810c.i(j, abstractC0842w).hashCode();
                    i9 = iB + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    iB = o0.f11810c.i(j, abstractC0842w).hashCode();
                    i9 = iB + i7;
                    break;
                case 51:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = A.b(Double.doubleToLongBits(((Double) o0.f11810c.i(j, abstractC0842w)).doubleValue()));
                        i9 = iB + i7;
                    }
                    break;
                case 52:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = Float.floatToIntBits(((Float) o0.f11810c.i(j, abstractC0842w)).floatValue());
                        i9 = iB + i7;
                    }
                    break;
                case 53:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = A.b(G(j, abstractC0842w));
                        i9 = iB + i7;
                    }
                    break;
                case 54:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = A.b(G(j, abstractC0842w));
                        i9 = iB + i7;
                    }
                    break;
                case 55:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = F(j, abstractC0842w);
                        i9 = iB + i7;
                    }
                    break;
                case 56:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = A.b(G(j, abstractC0842w));
                        i9 = iB + i7;
                    }
                    break;
                case 57:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = F(j, abstractC0842w);
                        i9 = iB + i7;
                    }
                    break;
                case 58:
                    if (u(i11, i10, abstractC0842w)) {
                        i8 = i9 * 53;
                        boolean zBooleanValue = ((Boolean) o0.f11810c.i(j, abstractC0842w)).booleanValue();
                        Charset charset2 = A.f11702a;
                        if (zBooleanValue) {
                            i12 = 1231;
                        }
                        i9 = i12 + i8;
                    }
                    break;
                case 59:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = ((String) o0.f11810c.i(j, abstractC0842w)).hashCode();
                        i9 = iB + i7;
                    }
                    break;
                case 60:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = o0.f11810c.i(j, abstractC0842w).hashCode();
                        i9 = iB + i7;
                    }
                    break;
                case 61:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = o0.f11810c.i(j, abstractC0842w).hashCode();
                        i9 = iB + i7;
                    }
                    break;
                case 62:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = F(j, abstractC0842w);
                        i9 = iB + i7;
                    }
                    break;
                case 63:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = F(j, abstractC0842w);
                        i9 = iB + i7;
                    }
                    break;
                case 64:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = F(j, abstractC0842w);
                        i9 = iB + i7;
                    }
                    break;
                case 65:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = A.b(G(j, abstractC0842w));
                        i9 = iB + i7;
                    }
                    break;
                case 66:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = F(j, abstractC0842w);
                        i9 = iB + i7;
                    }
                    break;
                case 67:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = A.b(G(j, abstractC0842w));
                        i9 = iB + i7;
                    }
                    break;
                case 68:
                    if (u(i11, i10, abstractC0842w)) {
                        i7 = i9 * 53;
                        iB = o0.f11810c.i(j, abstractC0842w).hashCode();
                        i9 = iB + i7;
                    }
                    break;
            }
        }
        this.f11741m.getClass();
        return abstractC0842w.unknownFields.hashCode() + (i9 * 53);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int f(AbstractC0842w abstractC0842w) {
        return this.f11736g ? r(abstractC0842w) : q(abstractC0842w);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void g(Object obj, byte[] bArr, int i7, int i8, C0824d c0824d) throws C {
        if (this.f11736g) {
            K(obj, bArr, i7, i8, c0824d);
        } else {
            J(obj, bArr, i7, i8, 0, c0824d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final boolean h(AbstractC0842w abstractC0842w, Object obj) {
        int[] iArr = this.f11730a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean zC = true;
            if (i7 >= length) {
                this.f11741m.getClass();
                return abstractC0842w.unknownFields.equals(((AbstractC0842w) obj).unknownFields);
            }
            int iX = X(i7);
            long j = iX & 1048575;
            switch (W(iX)) {
                case 0:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var = o0.f11810c;
                        if (Double.doubleToLongBits(n0Var.e(j, abstractC0842w)) != Double.doubleToLongBits(n0Var.e(j, obj))) {
                            zC = false;
                        }
                    }
                    break;
                case 1:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var2 = o0.f11810c;
                        if (Float.floatToIntBits(n0Var2.f(j, abstractC0842w)) != Float.floatToIntBits(n0Var2.f(j, obj))) {
                            zC = false;
                        }
                    }
                    break;
                case 2:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var3 = o0.f11810c;
                        if (n0Var3.h(j, abstractC0842w) != n0Var3.h(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 3:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var4 = o0.f11810c;
                        if (n0Var4.h(j, abstractC0842w) != n0Var4.h(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 4:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var5 = o0.f11810c;
                        if (n0Var5.g(j, abstractC0842w) != n0Var5.g(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 5:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var6 = o0.f11810c;
                        if (n0Var6.h(j, abstractC0842w) != n0Var6.h(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 6:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var7 = o0.f11810c;
                        if (n0Var7.g(j, abstractC0842w) != n0Var7.g(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 7:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var8 = o0.f11810c;
                        if (n0Var8.c(j, abstractC0842w) != n0Var8.c(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 8:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var9 = o0.f11810c;
                        if (!d0.C(n0Var9.i(j, abstractC0842w), n0Var9.i(j, obj))) {
                            zC = false;
                        }
                    }
                    break;
                case 9:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var10 = o0.f11810c;
                        if (!d0.C(n0Var10.i(j, abstractC0842w), n0Var10.i(j, obj))) {
                            zC = false;
                        }
                    }
                    break;
                case 10:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var11 = o0.f11810c;
                        if (!d0.C(n0Var11.i(j, abstractC0842w), n0Var11.i(j, obj))) {
                            zC = false;
                        }
                    }
                    break;
                case 11:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var12 = o0.f11810c;
                        if (n0Var12.g(j, abstractC0842w) != n0Var12.g(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 12:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var13 = o0.f11810c;
                        if (n0Var13.g(j, abstractC0842w) != n0Var13.g(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 13:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var14 = o0.f11810c;
                        if (n0Var14.g(j, abstractC0842w) != n0Var14.g(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 14:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var15 = o0.f11810c;
                        if (n0Var15.h(j, abstractC0842w) != n0Var15.h(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 15:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var16 = o0.f11810c;
                        if (n0Var16.g(j, abstractC0842w) != n0Var16.g(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 16:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var17 = o0.f11810c;
                        if (n0Var17.h(j, abstractC0842w) != n0Var17.h(j, obj)) {
                            zC = false;
                        }
                    }
                    break;
                case 17:
                    if (!k(abstractC0842w, obj, i7)) {
                        zC = false;
                    } else {
                        n0 n0Var18 = o0.f11810c;
                        if (!d0.C(n0Var18.i(j, abstractC0842w), n0Var18.i(j, obj))) {
                            zC = false;
                        }
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
                    n0 n0Var19 = o0.f11810c;
                    zC = d0.C(n0Var19.i(j, abstractC0842w), n0Var19.i(j, obj));
                    break;
                case 50:
                    n0 n0Var20 = o0.f11810c;
                    zC = d0.C(n0Var20.i(j, abstractC0842w), n0Var20.i(j, obj));
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
                    long j3 = iArr[i7 + 2] & 1048575;
                    n0 n0Var21 = o0.f11810c;
                    if (n0Var21.g(j3, abstractC0842w) != n0Var21.g(j3, obj) || !d0.C(n0Var21.i(j, abstractC0842w), n0Var21.i(j, obj))) {
                        zC = false;
                    }
                    break;
            }
            if (!zC) {
                return false;
            }
            i7 += 3;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void i(Object obj, L l7) throws Z4.b {
        l7.getClass();
        if (!this.f11736g) {
            Y(obj, l7);
            return;
        }
        int[] iArr = this.f11730a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iX = X(i7);
            int i8 = iArr[i7];
            switch (W(iX)) {
                case 0:
                    if (s(i7, obj)) {
                        l7.c(i8, o0.f11810c.e(iX & 1048575, obj));
                    }
                    break;
                case 1:
                    if (s(i7, obj)) {
                        l7.g(o0.f11810c.f(iX & 1048575, obj), i8);
                    }
                    break;
                case 2:
                    if (s(i7, obj)) {
                        l7.j(i8, o0.f11810c.h(iX & 1048575, obj));
                    }
                    break;
                case 3:
                    if (s(i7, obj)) {
                        l7.q(i8, o0.f11810c.h(iX & 1048575, obj));
                    }
                    break;
                case 4:
                    if (s(i7, obj)) {
                        l7.i(i8, o0.f11810c.g(iX & 1048575, obj));
                    }
                    break;
                case 5:
                    if (s(i7, obj)) {
                        l7.f(i8, o0.f11810c.h(iX & 1048575, obj));
                    }
                    break;
                case 6:
                    if (s(i7, obj)) {
                        l7.e(i8, o0.f11810c.g(iX & 1048575, obj));
                    }
                    break;
                case 7:
                    if (s(i7, obj)) {
                        l7.a(i8, o0.f11810c.c(iX & 1048575, obj));
                    }
                    break;
                case 8:
                    if (s(i7, obj)) {
                        Z(i8, o0.f11810c.i(iX & 1048575, obj), l7);
                    }
                    break;
                case 9:
                    if (s(i7, obj)) {
                        l7.k(i8, o0.f11810c.i(iX & 1048575, obj), p(i7));
                    }
                    break;
                case 10:
                    if (s(i7, obj)) {
                        l7.b(i8, (AbstractC0829i) o0.f11810c.i(iX & 1048575, obj));
                    }
                    break;
                case 11:
                    if (s(i7, obj)) {
                        l7.p(i8, o0.f11810c.g(iX & 1048575, obj));
                    }
                    break;
                case 12:
                    if (s(i7, obj)) {
                        l7.d(i8, o0.f11810c.g(iX & 1048575, obj));
                    }
                    break;
                case 13:
                    if (s(i7, obj)) {
                        l7.l(i8, o0.f11810c.g(iX & 1048575, obj));
                    }
                    break;
                case 14:
                    if (s(i7, obj)) {
                        l7.m(i8, o0.f11810c.h(iX & 1048575, obj));
                    }
                    break;
                case 15:
                    if (s(i7, obj)) {
                        l7.n(i8, o0.f11810c.g(iX & 1048575, obj));
                    }
                    break;
                case 16:
                    if (s(i7, obj)) {
                        l7.o(i8, o0.f11810c.h(iX & 1048575, obj));
                    }
                    break;
                case 17:
                    if (s(i7, obj)) {
                        l7.h(i8, o0.f11810c.i(iX & 1048575, obj), p(i7));
                    }
                    break;
                case 18:
                    d0.F(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 19:
                    d0.J(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 20:
                    d0.M(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    d0.U(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 22:
                    d0.L(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 23:
                    d0.I(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 24:
                    d0.H(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 25:
                    d0.D(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 26:
                    d0.S(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7);
                    break;
                case 27:
                    d0.N(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, p(i7));
                    break;
                case 28:
                    d0.E(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7);
                    break;
                case 29:
                    d0.T(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 30:
                    d0.G(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 31:
                    d0.O(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 32:
                    d0.P(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 33:
                    d0.Q(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 34:
                    d0.R(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, false);
                    break;
                case 35:
                    d0.F(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 36:
                    d0.J(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 37:
                    d0.M(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 38:
                    d0.U(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 39:
                    d0.L(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 40:
                    d0.I(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 41:
                    d0.H(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 42:
                    d0.D(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 43:
                    d0.T(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 44:
                    d0.G(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 45:
                    d0.O(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 46:
                    d0.P(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 47:
                    d0.Q(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 48:
                    d0.R(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, true);
                    break;
                case 49:
                    d0.K(iArr[i7], (List) o0.f11810c.i(iX & 1048575, obj), l7, p(i7));
                    break;
                case 50:
                    if (o0.f11810c.i(iX & 1048575, obj) != null) {
                        Object objO = o(i7);
                        this.f11742n.getClass();
                        AbstractC0486a1.n(objO);
                        throw null;
                    }
                    break;
                    break;
                case 51:
                    if (u(i8, i7, obj)) {
                        l7.c(i8, ((Double) o0.f11810c.i(iX & 1048575, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (u(i8, i7, obj)) {
                        l7.g(((Float) o0.f11810c.i(iX & 1048575, obj)).floatValue(), i8);
                    }
                    break;
                case 53:
                    if (u(i8, i7, obj)) {
                        l7.j(i8, G(iX & 1048575, obj));
                    }
                    break;
                case 54:
                    if (u(i8, i7, obj)) {
                        l7.q(i8, G(iX & 1048575, obj));
                    }
                    break;
                case 55:
                    if (u(i8, i7, obj)) {
                        l7.i(i8, F(iX & 1048575, obj));
                    }
                    break;
                case 56:
                    if (u(i8, i7, obj)) {
                        l7.f(i8, G(iX & 1048575, obj));
                    }
                    break;
                case 57:
                    if (u(i8, i7, obj)) {
                        l7.e(i8, F(iX & 1048575, obj));
                    }
                    break;
                case 58:
                    if (u(i8, i7, obj)) {
                        l7.a(i8, ((Boolean) o0.f11810c.i(iX & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (u(i8, i7, obj)) {
                        Z(i8, o0.f11810c.i(iX & 1048575, obj), l7);
                    }
                    break;
                case 60:
                    if (u(i8, i7, obj)) {
                        l7.k(i8, o0.f11810c.i(iX & 1048575, obj), p(i7));
                    }
                    break;
                case 61:
                    if (u(i8, i7, obj)) {
                        l7.b(i8, (AbstractC0829i) o0.f11810c.i(iX & 1048575, obj));
                    }
                    break;
                case 62:
                    if (u(i8, i7, obj)) {
                        l7.p(i8, F(iX & 1048575, obj));
                    }
                    break;
                case 63:
                    if (u(i8, i7, obj)) {
                        l7.d(i8, F(iX & 1048575, obj));
                    }
                    break;
                case 64:
                    if (u(i8, i7, obj)) {
                        l7.l(i8, F(iX & 1048575, obj));
                    }
                    break;
                case 65:
                    if (u(i8, i7, obj)) {
                        l7.m(i8, G(iX & 1048575, obj));
                    }
                    break;
                case 66:
                    if (u(i8, i7, obj)) {
                        l7.n(i8, F(iX & 1048575, obj));
                    }
                    break;
                case 67:
                    if (u(i8, i7, obj)) {
                        l7.o(i8, G(iX & 1048575, obj));
                    }
                    break;
                case 68:
                    if (u(i8, i7, obj)) {
                        l7.h(i8, o0.f11810c.i(iX & 1048575, obj), p(i7));
                    }
                    break;
            }
        }
        this.f11741m.getClass();
        ((AbstractC0842w) obj).unknownFields.e(l7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void j(Object obj, C0665j c0665j, C0835o c0835o) throws Throwable {
        c0835o.getClass();
        l(obj);
        w(this.f11741m, obj, c0665j, c0835o);
    }

    public final boolean k(AbstractC0842w abstractC0842w, Object obj, int i7) {
        return s(i7, abstractC0842w) == s(i7, obj);
    }

    public final void m(int i7, Object obj, Object obj2) {
        int i8 = this.f11730a[i7];
        if (o0.f11810c.i(X(i7) & 1048575, obj) == null) {
            return;
        }
        n(i7);
    }

    public final void n(int i7) {
        if (this.f11731b[AbstractC0486a1.d(i7, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final Object o(int i7) {
        return this.f11731b[(i7 / 3) * 2];
    }

    public final c0 p(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f11731b;
        c0 c0Var = (c0) objArr[i8];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarA = Z.f11748c.a((Class) objArr[i8 + 1]);
        objArr[i8] = c0VarA;
        return c0VarA;
    }

    public final int q(AbstractC0842w abstractC0842w) {
        int i7;
        int iK0;
        int iI0;
        Unsafe unsafe = f11729p;
        int i8 = 0;
        int iT = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (true) {
            int[] iArr = this.f11730a;
            if (i8 >= iArr.length) {
                this.f11741m.getClass();
                return abstractC0842w.unknownFields.b() + iT;
            }
            int iX = X(i8);
            int i11 = iArr[i8];
            int iW = W(iX);
            if (iW <= 17) {
                int i12 = iArr[i8 + 2];
                int i13 = i12 & 1048575;
                i7 = 1 << (i12 >>> 20);
                if (i13 != i10) {
                    i9 = unsafe.getInt(abstractC0842w, i13);
                    i10 = i13;
                }
            } else {
                i7 = 0;
            }
            long j = iX & 1048575;
            switch (iW) {
                case 0:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.k0(i11);
                        iT += iK0;
                    }
                    break;
                case 1:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.o0(i11);
                        iT += iK0;
                    }
                    break;
                case 2:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.s0(i11, unsafe.getLong(abstractC0842w, j));
                        iT += iK0;
                    }
                    break;
                case 3:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.C0(i11, unsafe.getLong(abstractC0842w, j));
                        iT += iK0;
                    }
                    break;
                case 4:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.q0(i11, unsafe.getInt(abstractC0842w, j));
                        iT += iK0;
                    }
                    break;
                case 5:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.n0(i11);
                        iT += iK0;
                    }
                    break;
                case 6:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.m0(i11);
                        iT += iK0;
                    }
                    break;
                case 7:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.h0(i11);
                        iT += iK0;
                    }
                    break;
                case 8:
                    if ((i7 & i9) != 0) {
                        Object object = unsafe.getObject(abstractC0842w, j);
                        iI0 = object instanceof AbstractC0829i ? C0832l.i0(i11, (AbstractC0829i) object) : C0832l.x0(i11, (String) object);
                        iT = iI0 + iT;
                    }
                    break;
                case 9:
                    if ((i7 & i9) != 0) {
                        iK0 = d0.o(i11, unsafe.getObject(abstractC0842w, j), p(i8));
                        iT += iK0;
                    }
                    break;
                case 10:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.i0(i11, (AbstractC0829i) unsafe.getObject(abstractC0842w, j));
                        iT += iK0;
                    }
                    break;
                case 11:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.A0(i11, unsafe.getInt(abstractC0842w, j));
                        iT += iK0;
                    }
                    break;
                case 12:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.l0(i11, unsafe.getInt(abstractC0842w, j));
                        iT += iK0;
                    }
                    break;
                case 13:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.t0(i11);
                        iT += iK0;
                    }
                    break;
                case 14:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.u0(i11);
                        iT += iK0;
                    }
                    break;
                case 15:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.v0(i11, unsafe.getInt(abstractC0842w, j));
                        iT += iK0;
                    }
                    break;
                case 16:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.w0(i11, unsafe.getLong(abstractC0842w, j));
                        iT += iK0;
                    }
                    break;
                case 17:
                    if ((i7 & i9) != 0) {
                        iK0 = C0832l.p0(i11, (AbstractC0821a) unsafe.getObject(abstractC0842w, j), p(i8));
                        iT += iK0;
                    }
                    break;
                case 18:
                    iK0 = d0.h(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 19:
                    iK0 = d0.f(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 20:
                    iK0 = d0.m(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    iK0 = d0.x(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 22:
                    iK0 = d0.k(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 23:
                    iK0 = d0.h(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 24:
                    iK0 = d0.f(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 25:
                    iK0 = d0.a(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 26:
                    iK0 = d0.u(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 27:
                    iK0 = d0.p(i11, (List) unsafe.getObject(abstractC0842w, j), p(i8));
                    iT += iK0;
                    break;
                case 28:
                    iK0 = d0.c(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 29:
                    iK0 = d0.v(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 30:
                    iK0 = d0.d(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 31:
                    iK0 = d0.f(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 32:
                    iK0 = d0.h(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 33:
                    iK0 = d0.q(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 34:
                    iK0 = d0.s(i11, (List) unsafe.getObject(abstractC0842w, j));
                    iT += iK0;
                    break;
                case 35:
                    int i14 = d0.i((List) unsafe.getObject(abstractC0842w, j));
                    if (i14 > 0) {
                        iT = AbstractC0486a1.t(i14, C0832l.z0(i11), i14, iT);
                    }
                    break;
                case 36:
                    int iG = d0.g((List) unsafe.getObject(abstractC0842w, j));
                    if (iG > 0) {
                        iT = AbstractC0486a1.t(iG, C0832l.z0(i11), iG, iT);
                    }
                    break;
                case 37:
                    int iN = d0.n((List) unsafe.getObject(abstractC0842w, j));
                    if (iN > 0) {
                        iT = AbstractC0486a1.t(iN, C0832l.z0(i11), iN, iT);
                    }
                    break;
                case 38:
                    int iY = d0.y((List) unsafe.getObject(abstractC0842w, j));
                    if (iY > 0) {
                        iT = AbstractC0486a1.t(iY, C0832l.z0(i11), iY, iT);
                    }
                    break;
                case 39:
                    int iL = d0.l((List) unsafe.getObject(abstractC0842w, j));
                    if (iL > 0) {
                        iT = AbstractC0486a1.t(iL, C0832l.z0(i11), iL, iT);
                    }
                    break;
                case 40:
                    int i15 = d0.i((List) unsafe.getObject(abstractC0842w, j));
                    if (i15 > 0) {
                        iT = AbstractC0486a1.t(i15, C0832l.z0(i11), i15, iT);
                    }
                    break;
                case 41:
                    int iG2 = d0.g((List) unsafe.getObject(abstractC0842w, j));
                    if (iG2 > 0) {
                        iT = AbstractC0486a1.t(iG2, C0832l.z0(i11), iG2, iT);
                    }
                    break;
                case 42:
                    int iB = d0.b((List) unsafe.getObject(abstractC0842w, j));
                    if (iB > 0) {
                        iT = AbstractC0486a1.t(iB, C0832l.z0(i11), iB, iT);
                    }
                    break;
                case 43:
                    int iW2 = d0.w((List) unsafe.getObject(abstractC0842w, j));
                    if (iW2 > 0) {
                        iT = AbstractC0486a1.t(iW2, C0832l.z0(i11), iW2, iT);
                    }
                    break;
                case 44:
                    int iE = d0.e((List) unsafe.getObject(abstractC0842w, j));
                    if (iE > 0) {
                        iT = AbstractC0486a1.t(iE, C0832l.z0(i11), iE, iT);
                    }
                    break;
                case 45:
                    int iG3 = d0.g((List) unsafe.getObject(abstractC0842w, j));
                    if (iG3 > 0) {
                        iT = AbstractC0486a1.t(iG3, C0832l.z0(i11), iG3, iT);
                    }
                    break;
                case 46:
                    int i16 = d0.i((List) unsafe.getObject(abstractC0842w, j));
                    if (i16 > 0) {
                        iT = AbstractC0486a1.t(i16, C0832l.z0(i11), i16, iT);
                    }
                    break;
                case 47:
                    int iR = d0.r((List) unsafe.getObject(abstractC0842w, j));
                    if (iR > 0) {
                        iT = AbstractC0486a1.t(iR, C0832l.z0(i11), iR, iT);
                    }
                    break;
                case 48:
                    int iT2 = d0.t((List) unsafe.getObject(abstractC0842w, j));
                    if (iT2 > 0) {
                        iT = AbstractC0486a1.t(iT2, C0832l.z0(i11), iT2, iT);
                    }
                    break;
                case 49:
                    iK0 = d0.j(i11, (List) unsafe.getObject(abstractC0842w, j), p(i8));
                    iT += iK0;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0842w, j);
                    Object objO = o(i8);
                    this.f11742n.getClass();
                    N.b(object2, objO);
                    break;
                case 51:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.k0(i11);
                        iT += iK0;
                    }
                    break;
                case 52:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.o0(i11);
                        iT += iK0;
                    }
                    break;
                case 53:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.s0(i11, G(j, abstractC0842w));
                        iT += iK0;
                    }
                    break;
                case 54:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.C0(i11, G(j, abstractC0842w));
                        iT += iK0;
                    }
                    break;
                case 55:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.q0(i11, F(j, abstractC0842w));
                        iT += iK0;
                    }
                    break;
                case 56:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.n0(i11);
                        iT += iK0;
                    }
                    break;
                case 57:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.m0(i11);
                        iT += iK0;
                    }
                    break;
                case 58:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.h0(i11);
                        iT += iK0;
                    }
                    break;
                case 59:
                    if (u(i11, i8, abstractC0842w)) {
                        Object object3 = unsafe.getObject(abstractC0842w, j);
                        iI0 = object3 instanceof AbstractC0829i ? C0832l.i0(i11, (AbstractC0829i) object3) : C0832l.x0(i11, (String) object3);
                        iT = iI0 + iT;
                    }
                    break;
                case 60:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = d0.o(i11, unsafe.getObject(abstractC0842w, j), p(i8));
                        iT += iK0;
                    }
                    break;
                case 61:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.i0(i11, (AbstractC0829i) unsafe.getObject(abstractC0842w, j));
                        iT += iK0;
                    }
                    break;
                case 62:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.A0(i11, F(j, abstractC0842w));
                        iT += iK0;
                    }
                    break;
                case 63:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.l0(i11, F(j, abstractC0842w));
                        iT += iK0;
                    }
                    break;
                case 64:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.t0(i11);
                        iT += iK0;
                    }
                    break;
                case 65:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.u0(i11);
                        iT += iK0;
                    }
                    break;
                case 66:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.v0(i11, F(j, abstractC0842w));
                        iT += iK0;
                    }
                    break;
                case 67:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.w0(i11, G(j, abstractC0842w));
                        iT += iK0;
                    }
                    break;
                case 68:
                    if (u(i11, i8, abstractC0842w)) {
                        iK0 = C0832l.p0(i11, (AbstractC0821a) unsafe.getObject(abstractC0842w, j), p(i8));
                        iT += iK0;
                    }
                    break;
            }
            i8 += 3;
        }
    }

    public final int r(AbstractC0842w abstractC0842w) {
        int iK0;
        Unsafe unsafe = f11729p;
        int i7 = 0;
        int iT = 0;
        while (true) {
            int[] iArr = this.f11730a;
            if (i7 >= iArr.length) {
                this.f11741m.getClass();
                return abstractC0842w.unknownFields.b() + iT;
            }
            int iX = X(i7);
            int iW = W(iX);
            int i8 = iArr[i7];
            long j = iX & 1048575;
            if (iW >= r.f11818b.a() && iW <= r.f11819c.a()) {
                int i9 = iArr[i7 + 2];
            }
            switch (iW) {
                case 0:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.k0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 1:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.o0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 2:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.s0(i8, o0.k(abstractC0842w, j));
                        break;
                    }
                    i7 += 3;
                    break;
                case 3:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.C0(i8, o0.k(abstractC0842w, j));
                        break;
                    }
                    i7 += 3;
                    break;
                case 4:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.q0(i8, o0.j(abstractC0842w, j));
                        break;
                    }
                    i7 += 3;
                    break;
                case 5:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.n0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 6:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.m0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 7:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.h0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 8:
                    if (s(i7, abstractC0842w)) {
                        Object objL = o0.l(abstractC0842w, j);
                        iK0 = !(objL instanceof AbstractC0829i) ? C0832l.x0(i8, (String) objL) : C0832l.i0(i8, (AbstractC0829i) objL);
                        break;
                    }
                    i7 += 3;
                    break;
                case 9:
                    if (s(i7, abstractC0842w)) {
                        iK0 = d0.o(i8, o0.l(abstractC0842w, j), p(i7));
                        break;
                    }
                    i7 += 3;
                    break;
                case 10:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.i0(i8, (AbstractC0829i) o0.l(abstractC0842w, j));
                        break;
                    }
                    i7 += 3;
                    break;
                case 11:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.A0(i8, o0.j(abstractC0842w, j));
                        break;
                    }
                    i7 += 3;
                    break;
                case 12:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.l0(i8, o0.j(abstractC0842w, j));
                        break;
                    }
                    i7 += 3;
                    break;
                case 13:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.t0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 14:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.u0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 15:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.v0(i8, o0.j(abstractC0842w, j));
                        break;
                    }
                    i7 += 3;
                    break;
                case 16:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.w0(i8, o0.k(abstractC0842w, j));
                        break;
                    }
                    i7 += 3;
                    break;
                case 17:
                    if (s(i7, abstractC0842w)) {
                        iK0 = C0832l.p0(i8, (AbstractC0821a) o0.l(abstractC0842w, j), p(i7));
                        break;
                    }
                    i7 += 3;
                    break;
                case 18:
                    iK0 = d0.h(i8, v(abstractC0842w, j));
                    break;
                case 19:
                    iK0 = d0.f(i8, v(abstractC0842w, j));
                    break;
                case 20:
                    iK0 = d0.m(i8, v(abstractC0842w, j));
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    iK0 = d0.x(i8, v(abstractC0842w, j));
                    break;
                case 22:
                    iK0 = d0.k(i8, v(abstractC0842w, j));
                    break;
                case 23:
                    iK0 = d0.h(i8, v(abstractC0842w, j));
                    break;
                case 24:
                    iK0 = d0.f(i8, v(abstractC0842w, j));
                    break;
                case 25:
                    iK0 = d0.a(i8, v(abstractC0842w, j));
                    break;
                case 26:
                    iK0 = d0.u(i8, v(abstractC0842w, j));
                    break;
                case 27:
                    iK0 = d0.p(i8, v(abstractC0842w, j), p(i7));
                    break;
                case 28:
                    iK0 = d0.c(i8, v(abstractC0842w, j));
                    break;
                case 29:
                    iK0 = d0.v(i8, v(abstractC0842w, j));
                    break;
                case 30:
                    iK0 = d0.d(i8, v(abstractC0842w, j));
                    break;
                case 31:
                    iK0 = d0.f(i8, v(abstractC0842w, j));
                    break;
                case 32:
                    iK0 = d0.h(i8, v(abstractC0842w, j));
                    break;
                case 33:
                    iK0 = d0.q(i8, v(abstractC0842w, j));
                    break;
                case 34:
                    iK0 = d0.s(i8, v(abstractC0842w, j));
                    break;
                case 35:
                    int i10 = d0.i((List) unsafe.getObject(abstractC0842w, j));
                    if (i10 > 0) {
                        iT = AbstractC0486a1.t(i10, C0832l.z0(i8), i10, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 36:
                    int iG = d0.g((List) unsafe.getObject(abstractC0842w, j));
                    if (iG > 0) {
                        iT = AbstractC0486a1.t(iG, C0832l.z0(i8), iG, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 37:
                    int iN = d0.n((List) unsafe.getObject(abstractC0842w, j));
                    if (iN > 0) {
                        iT = AbstractC0486a1.t(iN, C0832l.z0(i8), iN, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 38:
                    int iY = d0.y((List) unsafe.getObject(abstractC0842w, j));
                    if (iY > 0) {
                        iT = AbstractC0486a1.t(iY, C0832l.z0(i8), iY, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 39:
                    int iL = d0.l((List) unsafe.getObject(abstractC0842w, j));
                    if (iL > 0) {
                        iT = AbstractC0486a1.t(iL, C0832l.z0(i8), iL, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 40:
                    int i11 = d0.i((List) unsafe.getObject(abstractC0842w, j));
                    if (i11 > 0) {
                        iT = AbstractC0486a1.t(i11, C0832l.z0(i8), i11, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 41:
                    int iG2 = d0.g((List) unsafe.getObject(abstractC0842w, j));
                    if (iG2 > 0) {
                        iT = AbstractC0486a1.t(iG2, C0832l.z0(i8), iG2, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 42:
                    int iB = d0.b((List) unsafe.getObject(abstractC0842w, j));
                    if (iB > 0) {
                        iT = AbstractC0486a1.t(iB, C0832l.z0(i8), iB, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 43:
                    int iW2 = d0.w((List) unsafe.getObject(abstractC0842w, j));
                    if (iW2 > 0) {
                        iT = AbstractC0486a1.t(iW2, C0832l.z0(i8), iW2, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 44:
                    int iE = d0.e((List) unsafe.getObject(abstractC0842w, j));
                    if (iE > 0) {
                        iT = AbstractC0486a1.t(iE, C0832l.z0(i8), iE, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 45:
                    int iG3 = d0.g((List) unsafe.getObject(abstractC0842w, j));
                    if (iG3 > 0) {
                        iT = AbstractC0486a1.t(iG3, C0832l.z0(i8), iG3, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 46:
                    int i12 = d0.i((List) unsafe.getObject(abstractC0842w, j));
                    if (i12 > 0) {
                        iT = AbstractC0486a1.t(i12, C0832l.z0(i8), i12, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 47:
                    int iR = d0.r((List) unsafe.getObject(abstractC0842w, j));
                    if (iR > 0) {
                        iT = AbstractC0486a1.t(iR, C0832l.z0(i8), iR, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 48:
                    int iT2 = d0.t((List) unsafe.getObject(abstractC0842w, j));
                    if (iT2 > 0) {
                        iT = AbstractC0486a1.t(iT2, C0832l.z0(i8), iT2, iT);
                    } else {
                        continue;
                    }
                    i7 += 3;
                    break;
                case 49:
                    iK0 = d0.j(i8, v(abstractC0842w, j), p(i7));
                    break;
                case 50:
                    Object objL2 = o0.l(abstractC0842w, j);
                    Object objO = o(i7);
                    this.f11742n.getClass();
                    N.b(objL2, objO);
                    continue;
                    i7 += 3;
                    break;
                case 51:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.k0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 52:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.o0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 53:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.s0(i8, G(j, abstractC0842w));
                        break;
                    }
                    i7 += 3;
                    break;
                case 54:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.C0(i8, G(j, abstractC0842w));
                        break;
                    }
                    i7 += 3;
                    break;
                case 55:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.q0(i8, F(j, abstractC0842w));
                        break;
                    }
                    i7 += 3;
                    break;
                case 56:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.n0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 57:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.m0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 58:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.h0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 59:
                    if (u(i8, i7, abstractC0842w)) {
                        Object objL3 = o0.l(abstractC0842w, j);
                        iK0 = !(objL3 instanceof AbstractC0829i) ? C0832l.x0(i8, (String) objL3) : C0832l.i0(i8, (AbstractC0829i) objL3);
                        break;
                    }
                    i7 += 3;
                    break;
                case 60:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = d0.o(i8, o0.l(abstractC0842w, j), p(i7));
                        break;
                    }
                    i7 += 3;
                    break;
                case 61:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.i0(i8, (AbstractC0829i) o0.l(abstractC0842w, j));
                        break;
                    }
                    i7 += 3;
                    break;
                case 62:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.A0(i8, F(j, abstractC0842w));
                        break;
                    }
                    i7 += 3;
                    break;
                case 63:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.l0(i8, F(j, abstractC0842w));
                        break;
                    }
                    i7 += 3;
                    break;
                case 64:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.t0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 65:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.u0(i8);
                        break;
                    }
                    i7 += 3;
                    break;
                case 66:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.v0(i8, F(j, abstractC0842w));
                        break;
                    }
                    i7 += 3;
                    break;
                case 67:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.w0(i8, G(j, abstractC0842w));
                        break;
                    }
                    i7 += 3;
                    break;
                case 68:
                    if (u(i8, i7, abstractC0842w)) {
                        iK0 = C0832l.p0(i8, (AbstractC0821a) o0.l(abstractC0842w, j), p(i7));
                        break;
                    }
                    i7 += 3;
                    break;
                default:
                    continue;
                    i7 += 3;
                    break;
            }
            iT = iK0 + iT;
            i7 += 3;
        }
    }

    public final boolean s(int i7, Object obj) {
        int i8 = this.f11730a[i7 + 2];
        long j = i8 & 1048575;
        if (j != 1048575) {
            return ((1 << (i8 >>> 20)) & o0.f11810c.g(j, obj)) != 0;
        }
        int iX = X(i7);
        long j3 = iX & 1048575;
        switch (W(iX)) {
            case 0:
                return Double.doubleToRawLongBits(o0.f11810c.e(j3, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(o0.f11810c.f(j3, obj)) != 0;
            case 2:
                return o0.f11810c.h(j3, obj) != 0;
            case 3:
                return o0.f11810c.h(j3, obj) != 0;
            case 4:
                return o0.f11810c.g(j3, obj) != 0;
            case 5:
                return o0.f11810c.h(j3, obj) != 0;
            case 6:
                return o0.f11810c.g(j3, obj) != 0;
            case 7:
                return o0.f11810c.c(j3, obj);
            case 8:
                Object objI = o0.f11810c.i(j3, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof AbstractC0829i) {
                    return !AbstractC0829i.f11779b.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return o0.f11810c.i(j3, obj) != null;
            case 10:
                return !AbstractC0829i.f11779b.equals(o0.f11810c.i(j3, obj));
            case 11:
                return o0.f11810c.g(j3, obj) != 0;
            case 12:
                return o0.f11810c.g(j3, obj) != 0;
            case 13:
                return o0.f11810c.g(j3, obj) != 0;
            case 14:
                return o0.f11810c.h(j3, obj) != 0;
            case 15:
                return o0.f11810c.g(j3, obj) != 0;
            case 16:
                return o0.f11810c.h(j3, obj) != 0;
            case 17:
                return o0.f11810c.i(j3, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean u(int i7, int i8, Object obj) {
        return o0.f11810c.g((long) (this.f11730a[i8 + 2] & 1048575), obj) == i7;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x05dd A[Catch: all -> 0x0023, TryCatch #2 {all -> 0x0023, blocks: (B:3:0x0011, B:5:0x001a, B:7:0x001e, B:20:0x0043, B:22:0x0048, B:23:0x004c, B:31:0x0065, B:32:0x0069, B:36:0x0079, B:38:0x0085, B:45:0x00a0, B:47:0x00b7, B:48:0x00ce, B:49:0x00e5, B:50:0x00fc, B:51:0x0113, B:52:0x012d, B:53:0x0145, B:54:0x0155, B:55:0x016b, B:56:0x0173, B:57:0x018b, B:58:0x01a3, B:59:0x01bb, B:60:0x01d3, B:61:0x01eb, B:62:0x0203, B:63:0x021b, B:64:0x0233, B:66:0x023c, B:130:0x05d8, B:132:0x05dd, B:133:0x05e2, B:111:0x0458, B:112:0x046d, B:113:0x0483, B:114:0x0499, B:115:0x04af, B:116:0x04c5, B:117:0x04de, B:118:0x04f4, B:119:0x0506, B:120:0x051e, B:121:0x0528, B:122:0x053e, B:123:0x0554, B:124:0x056a, B:125:0x0580, B:126:0x0596, B:127:0x05ac, B:128:0x05c2), top: B:148:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x05ea A[LOOP:1: B:135:0x05e8->B:136:0x05ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:212:0x05e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:? A[RETURN, SYNTHETIC] */
    public final void w(g0 g0Var, Object obj, C0665j c0665j, C0835o c0835o) throws Throwable {
        f0 f0Var;
        int[] iArr = this.f11737h;
        int i7 = this.j;
        int i8 = this.f11738i;
        f0 f0VarA = null;
        while (true) {
            try {
                int iA = c0665j.a();
                int iT = (iA < this.f11732c || iA > this.f11733d) ? -1 : T(iA, 0);
                if (iT >= 0) {
                    int iX = X(iT);
                    try {
                        int iW = W(iX);
                        L3.e eVar = (L3.e) c0665j.f9213e;
                        I i9 = this.f11740l;
                        switch (iW) {
                            case 0:
                                long jE = E(iX);
                                c0665j.W(1);
                                o0.r(obj, jE, eVar.p());
                                R(iT, obj);
                                break;
                            case 1:
                                long jE2 = E(iX);
                                c0665j.W(5);
                                o0.s(obj, jE2, eVar.t());
                                R(iT, obj);
                                break;
                            case 2:
                                long jE3 = E(iX);
                                c0665j.W(0);
                                o0.u(obj, jE3, eVar.v());
                                R(iT, obj);
                                break;
                            case 3:
                                long jE4 = E(iX);
                                c0665j.W(0);
                                o0.u(obj, jE4, eVar.E());
                                R(iT, obj);
                                break;
                            case 4:
                                long jE5 = E(iX);
                                c0665j.W(0);
                                o0.t(jE5, obj, eVar.u());
                                R(iT, obj);
                                break;
                            case 5:
                                long jE6 = E(iX);
                                c0665j.W(1);
                                o0.u(obj, jE6, eVar.s());
                                R(iT, obj);
                                break;
                            case 6:
                                long jE7 = E(iX);
                                c0665j.W(5);
                                o0.t(jE7, obj, eVar.r());
                                R(iT, obj);
                                break;
                            case 7:
                                long jE8 = E(iX);
                                c0665j.W(0);
                                o0.n(obj, jE8, eVar.m());
                                R(iT, obj);
                                break;
                            case 8:
                                O(iX, c0665j, obj);
                                R(iT, obj);
                                break;
                            case 9:
                                Object obj2 = (AbstractC0821a) A(iT, obj);
                                c0 c0VarP = p(iT);
                                c0665j.W(2);
                                c0665j.g(obj2, c0VarP, c0835o);
                                U(iT, obj, obj2);
                                break;
                            case 10:
                                o0.v(obj, E(iX), c0665j.n());
                                R(iT, obj);
                                break;
                            case 11:
                                long jE9 = E(iX);
                                c0665j.W(0);
                                o0.t(jE9, obj, eVar.D());
                                R(iT, obj);
                                break;
                            case 12:
                                c0665j.W(0);
                                int iQ = eVar.q();
                                n(iT);
                                o0.t(E(iX), obj, iQ);
                                R(iT, obj);
                                break;
                            case 13:
                                long jE10 = E(iX);
                                c0665j.W(5);
                                o0.t(jE10, obj, eVar.w());
                                R(iT, obj);
                                break;
                            case 14:
                                long jE11 = E(iX);
                                c0665j.W(1);
                                o0.u(obj, jE11, eVar.x());
                                R(iT, obj);
                                break;
                            case 15:
                                long jE12 = E(iX);
                                c0665j.W(0);
                                o0.t(jE12, obj, eVar.y());
                                R(iT, obj);
                                break;
                            case 16:
                                long jE13 = E(iX);
                                c0665j.W(0);
                                o0.u(obj, jE13, eVar.z());
                                R(iT, obj);
                                break;
                            case 17:
                                try {
                                    Object obj3 = (AbstractC0821a) A(iT, obj);
                                    c0 c0VarP2 = p(iT);
                                    c0665j.W(3);
                                    c0665j.d(obj3, c0VarP2, c0835o);
                                    U(iT, obj, obj3);
                                } catch (B unused) {
                                    g0Var.getClass();
                                    if (f0VarA == null) {
                                        f0VarA = g0.a(obj);
                                    }
                                    if (!g0.c(f0VarA, c0665j)) {
                                        while (i8 < i7) {
                                            m(iArr[i8], obj, f0VarA);
                                            i8++;
                                        }
                                        if (f0VarA != null) {
                                            ((AbstractC0842w) obj).unknownFields = f0VarA;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                break;
                            case 18:
                                f0Var = f0VarA;
                                c0665j.s(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 19:
                                f0Var = f0VarA;
                                c0665j.C(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 20:
                                f0Var = f0VarA;
                                c0665j.G(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case zzbbd.zzt.zzm /* 21 */:
                                f0Var = f0VarA;
                                c0665j.U(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 22:
                                f0Var = f0VarA;
                                c0665j.E(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 23:
                                f0Var = f0VarA;
                                c0665j.A(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 24:
                                f0Var = f0VarA;
                                c0665j.y(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 25:
                                f0Var = f0VarA;
                                c0665j.l(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 26:
                                f0Var = f0VarA;
                                P(iX, c0665j, obj);
                                f0VarA = f0Var;
                                break;
                            case 27:
                                f0Var = f0VarA;
                                N(obj, iX, c0665j, p(iT), c0835o);
                                f0VarA = f0Var;
                                break;
                            case 28:
                                f0Var = f0VarA;
                                c0665j.q(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 29:
                                f0Var = f0VarA;
                                c0665j.S(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 30:
                                f0Var = f0VarA;
                                List listC = i9.c(E(iX), obj);
                                c0665j.u(listC);
                                n(iT);
                                d0.z(obj, iA, listC, f0Var, g0Var);
                                f0VarA = f0Var;
                                break;
                            case 31:
                                f0Var = f0VarA;
                                c0665j.I(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 32:
                                f0Var = f0VarA;
                                c0665j.K(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 33:
                                f0Var = f0VarA;
                                c0665j.M(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 34:
                                f0Var = f0VarA;
                                c0665j.O(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 35:
                                f0Var = f0VarA;
                                c0665j.s(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 36:
                                f0Var = f0VarA;
                                c0665j.C(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 37:
                                f0Var = f0VarA;
                                c0665j.G(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 38:
                                f0Var = f0VarA;
                                c0665j.U(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 39:
                                f0Var = f0VarA;
                                c0665j.E(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 40:
                                f0Var = f0VarA;
                                c0665j.A(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 41:
                                f0Var = f0VarA;
                                c0665j.y(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 42:
                                f0Var = f0VarA;
                                c0665j.l(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 43:
                                f0Var = f0VarA;
                                c0665j.S(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 44:
                                f0Var = f0VarA;
                                List listC2 = i9.c(E(iX), obj);
                                c0665j.u(listC2);
                                n(iT);
                                d0.z(obj, iA, listC2, f0Var, g0Var);
                                f0VarA = f0Var;
                                break;
                            case 45:
                                f0Var = f0VarA;
                                c0665j.I(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 46:
                                f0Var = f0VarA;
                                c0665j.K(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 47:
                                f0Var = f0VarA;
                                c0665j.M(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 48:
                                f0Var = f0VarA;
                                c0665j.O(i9.c(E(iX), obj));
                                f0VarA = f0Var;
                                break;
                            case 49:
                                try {
                                    f0Var = f0VarA;
                                    try {
                                        M(obj, E(iX), c0665j, p(iT), c0835o);
                                        f0VarA = f0Var;
                                    } catch (B unused2) {
                                        f0VarA = f0Var;
                                        g0Var.getClass();
                                        if (f0VarA == null) {
                                            f0VarA = g0.a(obj);
                                        }
                                        if (!g0.c(f0VarA, c0665j)) {
                                            while (i8 < i7) {
                                                m(iArr[i8], obj, f0VarA);
                                                i8++;
                                            }
                                            if (f0VarA != null) {
                                                ((AbstractC0842w) obj).unknownFields = f0VarA;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        f0VarA = f0Var;
                                        while (i8 < i7) {
                                            m(iArr[i8], obj, f0VarA);
                                            i8++;
                                        }
                                        if (f0VarA != null) {
                                            g0Var.getClass();
                                            ((AbstractC0842w) obj).unknownFields = f0VarA;
                                        }
                                        throw th;
                                    }
                                    break;
                                } catch (B unused3) {
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                break;
                            case 50:
                                x(iT, obj, o(iT));
                                throw null;
                            case 51:
                                long jE14 = E(iX);
                                c0665j.W(1);
                                o0.v(obj, jE14, Double.valueOf(eVar.p()));
                                S(iA, iT, obj);
                                break;
                            case 52:
                                long jE15 = E(iX);
                                c0665j.W(5);
                                o0.v(obj, jE15, Float.valueOf(eVar.t()));
                                S(iA, iT, obj);
                                break;
                            case 53:
                                long jE16 = E(iX);
                                c0665j.W(0);
                                o0.v(obj, jE16, Long.valueOf(eVar.v()));
                                S(iA, iT, obj);
                                break;
                            case 54:
                                long jE17 = E(iX);
                                c0665j.W(0);
                                o0.v(obj, jE17, Long.valueOf(eVar.E()));
                                S(iA, iT, obj);
                                break;
                            case 55:
                                long jE18 = E(iX);
                                c0665j.W(0);
                                o0.v(obj, jE18, Integer.valueOf(eVar.u()));
                                S(iA, iT, obj);
                                break;
                            case 56:
                                long jE19 = E(iX);
                                c0665j.W(1);
                                o0.v(obj, jE19, Long.valueOf(eVar.s()));
                                S(iA, iT, obj);
                                break;
                            case 57:
                                long jE20 = E(iX);
                                c0665j.W(5);
                                o0.v(obj, jE20, Integer.valueOf(eVar.r()));
                                S(iA, iT, obj);
                                break;
                            case 58:
                                long jE21 = E(iX);
                                c0665j.W(0);
                                o0.v(obj, jE21, Boolean.valueOf(eVar.m()));
                                S(iA, iT, obj);
                                break;
                            case 59:
                                O(iX, c0665j, obj);
                                S(iA, iT, obj);
                                break;
                            case 60:
                                Object obj4 = (AbstractC0821a) B(iA, iT, obj);
                                c0 c0VarP3 = p(iT);
                                c0665j.W(2);
                                c0665j.g(obj4, c0VarP3, c0835o);
                                V(obj, iA, iT, obj4);
                                break;
                            case 61:
                                o0.v(obj, E(iX), c0665j.n());
                                S(iA, iT, obj);
                                break;
                            case 62:
                                long jE22 = E(iX);
                                c0665j.W(0);
                                o0.v(obj, jE22, Integer.valueOf(eVar.D()));
                                S(iA, iT, obj);
                                break;
                            case 63:
                                c0665j.W(0);
                                int iQ2 = eVar.q();
                                n(iT);
                                o0.v(obj, E(iX), Integer.valueOf(iQ2));
                                S(iA, iT, obj);
                                break;
                            case 64:
                                long jE23 = E(iX);
                                c0665j.W(5);
                                o0.v(obj, jE23, Integer.valueOf(eVar.w()));
                                S(iA, iT, obj);
                                break;
                            case 65:
                                long jE24 = E(iX);
                                c0665j.W(1);
                                o0.v(obj, jE24, Long.valueOf(eVar.x()));
                                S(iA, iT, obj);
                                break;
                            case 66:
                                long jE25 = E(iX);
                                c0665j.W(0);
                                o0.v(obj, jE25, Integer.valueOf(eVar.y()));
                                S(iA, iT, obj);
                                break;
                            case 67:
                                long jE26 = E(iX);
                                c0665j.W(0);
                                o0.v(obj, jE26, Long.valueOf(eVar.z()));
                                S(iA, iT, obj);
                                break;
                            case 68:
                                Object obj5 = (AbstractC0821a) B(iA, iT, obj);
                                c0 c0VarP4 = p(iT);
                                c0665j.W(3);
                                c0665j.d(obj5, c0VarP4, c0835o);
                                V(obj, iA, iT, obj5);
                                break;
                            default:
                                if (f0VarA == null) {
                                    g0Var.getClass();
                                    f0VarA = g0.a(obj);
                                }
                                g0Var.getClass();
                                if (!g0.c(f0VarA, c0665j)) {
                                    while (i8 < i7) {
                                        m(iArr[i8], obj, f0VarA);
                                        i8++;
                                    }
                                    if (f0VarA != null) {
                                        ((AbstractC0842w) obj).unknownFields = f0VarA;
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (B unused4) {
                    }
                } else {
                    if (iA == Integer.MAX_VALUE) {
                        while (i8 < i7) {
                            m(iArr[i8], obj, f0VarA);
                            i8++;
                        }
                        if (f0VarA != null) {
                            g0Var.getClass();
                            ((AbstractC0842w) obj).unknownFields = f0VarA;
                            return;
                        }
                        return;
                    }
                    g0Var.getClass();
                    if (f0VarA == null) {
                        f0VarA = g0.a(obj);
                    }
                    if (!g0.c(f0VarA, c0665j)) {
                        while (i8 < i7) {
                            m(iArr[i8], obj, f0VarA);
                            i8++;
                        }
                        if (f0VarA != null) {
                            ((AbstractC0842w) obj).unknownFields = f0VarA;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void x(int i7, Object obj, Object obj2) {
        long jX = X(i7) & 1048575;
        Object objI = o0.f11810c.i(jX, obj);
        N n2 = this.f11742n;
        if (objI != null) {
            n2.getClass();
            if (N.c(objI)) {
                M mC = M.f11723b.c();
                N.d(mC, objI);
                o0.v(obj, jX, mC);
                objI = mC;
            }
        } else {
            n2.getClass();
            objI = M.f11723b.c();
            o0.v(obj, jX, objI);
        }
        n2.getClass();
        AbstractC0486a1.n(obj2);
        throw null;
    }

    public final void y(int i7, Object obj, Object obj2) {
        if (s(i7, obj2)) {
            long jX = X(i7) & 1048575;
            Unsafe unsafe = f11729p;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f11730a[i7] + " is present but null: " + obj2);
            }
            c0 c0VarP = p(i7);
            if (!s(i7, obj)) {
                if (t(object)) {
                    Object objD = c0VarP.d();
                    c0VarP.a(objD, object);
                    unsafe.putObject(obj, jX, objD);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                R(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!t(object2)) {
                Object objD2 = c0VarP.d();
                c0VarP.a(objD2, object2);
                unsafe.putObject(obj, jX, objD2);
                object2 = objD2;
            }
            c0VarP.a(object2, object);
        }
    }

    public final void z(int i7, Object obj, Object obj2) {
        int[] iArr = this.f11730a;
        int i8 = iArr[i7];
        if (u(i8, i7, obj2)) {
            long jX = X(i7) & 1048575;
            Unsafe unsafe = f11729p;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            c0 c0VarP = p(i7);
            if (!u(i8, i7, obj)) {
                if (t(object)) {
                    Object objD = c0VarP.d();
                    c0VarP.a(objD, object);
                    unsafe.putObject(obj, jX, objD);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                S(i8, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!t(object2)) {
                Object objD2 = c0VarP.d();
                c0VarP.a(objD2, object2);
                unsafe.putObject(obj, jX, objD2);
                object2 = objD2;
            }
            c0VarP.a(object2, object);
        }
    }
}
