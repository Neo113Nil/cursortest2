package com.google.protobuf;

import W5.AbstractC0486a1;
import androidx.datastore.preferences.protobuf.C0665j;
import androidx.datastore.preferences.protobuf.C0678x;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.crypto.tink.shaded.protobuf.C0824d;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0858f0 implements InterfaceC0881r0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f12185n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f12186o = K0.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f12188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0847a f12191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f12193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12195i;
    public final C0862h0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final U f12196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0 f12197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0850b0 f12198m;

    public C0858f0(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0847a abstractC0847a, int[] iArr2, int i9, int i10, C0862h0 c0862h0, U u4, C0 c0, C0886u c0886u, C0850b0 c0850b0) {
        this.f12187a = iArr;
        this.f12188b = objArr;
        this.f12189c = i7;
        this.f12190d = i8;
        this.f12192f = abstractC0847a instanceof C;
        this.f12193g = iArr2;
        this.f12194h = i9;
        this.f12195i = i10;
        this.j = c0862h0;
        this.f12196k = u4;
        this.f12197l = c0;
        this.f12191e = abstractC0847a;
        this.f12198m = c0850b0;
    }

    public static C0858f0 A(C0876o0 c0876o0, C0862h0 c0862h0, U u4, C0 c0, C0886u c0886u, C0850b0 c0850b0) {
        if (c0876o0 instanceof C0876o0) {
            return B(c0876o0, c0862h0, u4, c0, c0886u, c0850b0);
        }
        c0876o0.getClass();
        throw new ClassCastException();
    }

    public static C0858f0 B(C0876o0 c0876o0, C0862h0 c0862h0, U u4, C0 c0, C0886u c0886u, C0850b0 c0850b0) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        int i15;
        char cCharAt3;
        int i16;
        char cCharAt4;
        int i17;
        char cCharAt5;
        int i18;
        char cCharAt6;
        int i19;
        char cCharAt7;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        int i24;
        int iObjectFieldOffset;
        int i25;
        int i26;
        int iObjectFieldOffset2;
        int iObjectFieldOffset3;
        Field fieldN;
        int i27;
        char cCharAt9;
        int i28;
        int i29;
        Field fieldN2;
        Field fieldN3;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        int i33;
        char cCharAt13;
        String strC = c0876o0.c();
        int length = strC.length();
        int i34 = 55296;
        if (strC.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i7 = i35 + 1;
                if (strC.charAt(i35) < 55296) {
                    break;
                }
                i35 = i7;
            }
        } else {
            i7 = 1;
        }
        int i36 = i7 + 1;
        int iCharAt3 = strC.charAt(i7);
        if (iCharAt3 >= 55296) {
            int i37 = iCharAt3 & 8191;
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
            iCharAt3 = i37 | (cCharAt13 << i38);
            i36 = i33;
        }
        if (iCharAt3 == 0) {
            i10 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i9 = 0;
            i12 = 0;
            i11 = 0;
            iArr = f12185n;
            i8 = 0;
        } else {
            int i39 = i36 + 1;
            int iCharAt4 = strC.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i20 = i39 + 1;
                    cCharAt8 = strC.charAt(i39);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i20;
                }
                iCharAt4 = i40 | (cCharAt8 << i41);
                i39 = i20;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strC.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i19 = i42 + 1;
                    cCharAt7 = strC.charAt(i42);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i19;
                }
                iCharAt5 = i43 | (cCharAt7 << i44);
                i42 = i19;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strC.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i18 = i45 + 1;
                    cCharAt6 = strC.charAt(i45);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i18;
                }
                iCharAt6 = i46 | (cCharAt6 << i47);
                i45 = i18;
            }
            int i48 = i45 + 1;
            int iCharAt7 = strC.charAt(i45);
            if (iCharAt7 >= 55296) {
                int i49 = iCharAt7 & 8191;
                int i50 = 13;
                while (true) {
                    i17 = i48 + 1;
                    cCharAt5 = strC.charAt(i48);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i17;
                }
                iCharAt7 = i49 | (cCharAt5 << i50);
                i48 = i17;
            }
            int i51 = i48 + 1;
            iCharAt = strC.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i16 = i51 + 1;
                    cCharAt4 = strC.charAt(i51);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i16;
                }
                iCharAt = i52 | (cCharAt4 << i53);
                i51 = i16;
            }
            int i54 = i51 + 1;
            iCharAt2 = strC.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i15 = i54 + 1;
                    cCharAt3 = strC.charAt(i54);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i15;
                }
                iCharAt2 = i55 | (cCharAt3 << i56);
                i54 = i15;
            }
            int i57 = i54 + 1;
            int iCharAt8 = strC.charAt(i54);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i14 = i57 + 1;
                    cCharAt2 = strC.charAt(i57);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i14;
                }
                iCharAt8 = i58 | (cCharAt2 << i59);
                i57 = i14;
            }
            int i60 = i57 + 1;
            int iCharAt9 = strC.charAt(i57);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = 13;
                while (true) {
                    i13 = i60 + 1;
                    cCharAt = strC.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i61 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i60 = i13;
                }
                iCharAt9 = i61 | (cCharAt << i62);
                i60 = i13;
            }
            int i63 = (iCharAt4 * 2) + iCharAt5;
            i8 = iCharAt4;
            i36 = i60;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i9 = iCharAt6;
            i10 = i63;
            i11 = iCharAt9;
            i12 = iCharAt7;
        }
        Unsafe unsafe = f12186o;
        Object[] objArrB = c0876o0.b();
        Class<?> cls = c0876o0.a().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i64 = i11 + iCharAt2;
        int i65 = i11;
        int i66 = i64;
        int i67 = 0;
        int i68 = 0;
        while (i36 < length) {
            int i69 = i36 + 1;
            int iCharAt10 = strC.charAt(i36);
            if (iCharAt10 >= i34) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    cCharAt12 = strC.charAt(i71);
                    i21 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                    length = i21;
                }
                iCharAt10 = i70 | (cCharAt12 << i72);
                i22 = i32;
            } else {
                i21 = length;
                i22 = i69;
            }
            int i73 = i22 + 1;
            int iCharAt11 = strC.charAt(i22);
            if (iCharAt11 >= 55296) {
                int i74 = iCharAt11 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i31 = i75 + 1;
                    cCharAt11 = strC.charAt(i75);
                    i23 = i11;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i75 = i31;
                    i11 = i23;
                }
                iCharAt11 = i74 | (cCharAt11 << i76);
                i24 = i31;
            } else {
                i23 = i11;
                i24 = i73;
            }
            int i77 = iCharAt11 & 255;
            int i78 = i12;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i67;
                i68++;
            }
            if (i77 >= 51) {
                int i79 = i24 + 1;
                int iCharAt12 = strC.charAt(i24);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i80 = iCharAt12 & 8191;
                    int i81 = 13;
                    while (true) {
                        i30 = i79 + 1;
                        cCharAt10 = strC.charAt(i79);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i80 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i79 = i30;
                        c3 = 55296;
                    }
                    iCharAt12 = i80 | (cCharAt10 << i81);
                    i79 = i30;
                }
                int i82 = i77 - 51;
                int i83 = i79;
                if (i82 == 9 || i82 == 17) {
                    i29 = 2;
                    objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i10];
                    i10++;
                } else if (i82 != 12) {
                    i29 = 2;
                } else if (p136t.e.b(c0876o0.d(), 1) || (iCharAt11 & 2048) != 0) {
                    i29 = 2;
                    objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i10];
                    i10++;
                } else {
                    i29 = 2;
                }
                int i84 = iCharAt12 * i29;
                Object obj = objArrB[i84];
                if (obj instanceof Field) {
                    fieldN2 = (Field) obj;
                } else {
                    fieldN2 = N(cls, (String) obj);
                    objArrB[i84] = fieldN2;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldN2);
                int i85 = i84 + 1;
                Object obj2 = objArrB[i85];
                if (obj2 instanceof Field) {
                    fieldN3 = (Field) obj2;
                } else {
                    fieldN3 = N(cls, (String) obj2);
                    objArrB[i85] = fieldN3;
                }
                iCharAt10 = iCharAt10;
                iArr2 = iArr2;
                iArr = iArr;
                i36 = i83;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN3);
                i26 = 0;
            } else {
                i9 = i9;
                int i86 = i10 + 1;
                Field fieldN4 = N(cls, (String) objArrB[i10]);
                if (i77 == 9 || i77 == 17) {
                    iCharAt10 = iCharAt10;
                    iArr2 = iArr2;
                    objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = fieldN4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        iCharAt10 = iCharAt10;
                        i28 = i10 + 2;
                        objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i86];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        iCharAt10 = iCharAt10;
                        if (c0876o0.d() == 1 || (iCharAt11 & 2048) != 0) {
                            i28 = i10 + 2;
                            objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i86];
                        } else {
                            iArr2 = iArr2;
                        }
                    } else if (i77 == 50) {
                        int i87 = i65 + 1;
                        iArr[i65] = i67;
                        int i88 = (i67 / 3) * 2;
                        int i89 = i10 + 2;
                        objArr[i88] = objArrB[i86];
                        if ((iCharAt11 & 2048) != 0) {
                            i86 = i10 + 3;
                            objArr[i88 + 1] = objArrB[i89];
                            i65 = i87;
                        } else {
                            i65 = i87;
                            i86 = i89;
                        }
                    }
                    i86 = i28;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldN4);
                if ((iCharAt11 & 4096) == 0 || i77 > 17) {
                    iObjectFieldOffset = 1048575;
                    i25 = i24;
                    i26 = 0;
                } else {
                    i25 = i24 + 1;
                    int iCharAt13 = strC.charAt(i24);
                    if (iCharAt13 >= 55296) {
                        int i90 = iCharAt13 & 8191;
                        int i91 = 13;
                        while (true) {
                            i27 = i25 + 1;
                            cCharAt9 = strC.charAt(i25);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i90 |= (cCharAt9 & 8191) << i91;
                            i91 += 13;
                            i25 = i27;
                        }
                        iCharAt13 = i90 | (cCharAt9 << i91);
                        i25 = i27;
                    }
                    int i92 = (iCharAt13 / 32) + (i8 * 2);
                    Object obj3 = objArrB[i92];
                    if (obj3 instanceof Field) {
                        fieldN = (Field) obj3;
                    } else {
                        fieldN = N(cls, (String) obj3);
                        objArrB[i92] = fieldN;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN);
                    i26 = iCharAt13 % 32;
                }
                if (i77 >= 18 && i77 <= 49) {
                    iArr[i66] = iObjectFieldOffset4;
                    i66++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset;
                i36 = i25;
                i10 = i86;
                iObjectFieldOffset3 = iObjectFieldOffset4;
            }
            int i93 = i67 + 1;
            iArr2[i67] = iCharAt10;
            int i94 = i67 + 2;
            String str = strC;
            iArr2[i93] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | iObjectFieldOffset3;
            i67 += 3;
            iArr2[i94] = (i26 << 20) | iObjectFieldOffset2;
            iArr2 = iArr2;
            i12 = i78;
            iArr = iArr;
            i68 = i68;
            length = i21;
            i11 = i23;
            strC = str;
            i9 = i9;
            i34 = 55296;
        }
        return new C0858f0(iArr2, objArr, i9, i12, c0876o0.a(), iArr, i11, i64, c0862h0, u4, c0, c0886u, c0850b0);
    }

    public static long C(int i7) {
        return i7 & 1048575;
    }

    public static int D(long j, Object obj) {
        return ((Integer) K0.f12117c.k(j, obj)).intValue();
    }

    public static long E(long j, Object obj) {
        return ((Long) K0.f12117c.k(j, obj)).longValue();
    }

    public static Field N(Class cls, String str) {
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

    public static int T(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int m(byte[] bArr, int i7, int i8, S0 s7, Class cls, C0824d c0824d) throws M {
        switch (s7.ordinal()) {
            case 0:
                c0824d.f11763c = Double.valueOf(w0.h(i7, bArr));
                return i7 + 8;
            case 1:
                c0824d.f11763c = Float.valueOf(w0.n(i7, bArr));
                return i7 + 4;
            case 2:
            case 3:
                int iN = w0.N(bArr, i7, c0824d);
                c0824d.f11763c = Long.valueOf(c0824d.f11762b);
                return iN;
            case 4:
            case 12:
            case 13:
                int iL = w0.L(bArr, i7, c0824d);
                c0824d.f11763c = Integer.valueOf(c0824d.f11761a);
                return iL;
            case 5:
            case 15:
                c0824d.f11763c = Long.valueOf(w0.l(i7, bArr));
                return i7 + 8;
            case 6:
            case 14:
                c0824d.f11763c = Integer.valueOf(w0.j(i7, bArr));
                return i7 + 4;
            case 7:
                int iN2 = w0.N(bArr, i7, c0824d);
                c0824d.f11763c = Boolean.valueOf(c0824d.f11762b != 0);
                return iN2;
            case 8:
                return w0.F(bArr, i7, c0824d);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                InterfaceC0881r0 interfaceC0881r0A = C0872m0.f12232c.a(cls);
                C cD = interfaceC0881r0A.d();
                int iT = w0.T(cD, interfaceC0881r0A, bArr, i7, i8, c0824d);
                interfaceC0881r0A.b(cD);
                c0824d.f11763c = cD;
                return iT;
            case 11:
                return w0.f(bArr, i7, c0824d);
            case 16:
                int iL2 = w0.L(bArr, i7, c0824d);
                c0824d.f11763c = Integer.valueOf(H6.b.b(c0824d.f11761a));
                return iL2;
            case 17:
                int iN3 = w0.N(bArr, i7, c0824d);
                c0824d.f11763c = Long.valueOf(H6.b.d(c0824d.f11762b));
                return iN3;
        }
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C) {
            return ((C) obj).n();
        }
        return true;
    }

    public final int F(Object obj, byte[] bArr, int i7, int i8, int i9, long j, C0824d c0824d) throws M {
        Unsafe unsafe = f12186o;
        Object objP = p(i9);
        Object object = unsafe.getObject(obj, j);
        this.f12198m.getClass();
        if (C0850b0.d(object)) {
            C0848a0 c0848a0F = C0850b0.f();
            C0850b0.e(c0848a0F, object);
            unsafe.putObject(obj, j, c0848a0F);
            object = c0848a0F;
        }
        Y yA = C0850b0.a(objP);
        C0848a0 c0848a0B = C0850b0.b(object);
        int iL = w0.L(bArr, i7, c0824d);
        int i10 = c0824d.f11761a;
        if (i10 < 0 || i10 > i8 - iL) {
            throw M.h();
        }
        int i11 = iL + i10;
        Object obj2 = yA.f12171c;
        Object obj3 = "";
        Object obj4 = obj2;
        while (iL < i11) {
            int iK = iL + 1;
            int i12 = bArr[iL];
            if (i12 < 0) {
                iK = w0.K(i12, bArr, iK, c0824d);
                i12 = c0824d.f11761a;
            }
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i13 != 1) {
                if (i13 == 2) {
                    S0 s7 = yA.f12170b;
                    if (i14 == s7.f12153b) {
                        iL = m(bArr, iK, i8, s7, obj2.getClass(), c0824d);
                        obj4 = c0824d.f11763c;
                    }
                }
                iL = w0.V(i12, bArr, iK, i8, c0824d);
            } else {
                O0 o7 = yA.f12169a;
                if (i14 == o7.f12153b) {
                    iL = m(bArr, iK, i8, o7, null, c0824d);
                    obj3 = c0824d.f11763c;
                } else {
                    iL = w0.V(i12, bArr, iK, i8, c0824d);
                }
            }
        }
        if (iL != i11) {
            throw M.g();
        }
        c0848a0B.put(obj3, obj4);
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x030a A[PHI: r0 r14 r17 r26 r27
      0x030a: PHI (r0v29 int) = (r0v25 int), (r0v27 int), (r0v32 int) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r14v11 int) = (r14v9 int), (r14v9 int), (r14v13 int) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r17v5 int) = (r17v3 int), (r17v3 int), (r17v6 int) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r26v7 sun.misc.Unsafe) = (r26v5 sun.misc.Unsafe), (r26v5 sun.misc.Unsafe), (r26v8 sun.misc.Unsafe) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x030a: PHI (r27v5 int) = (r27v3 int), (r27v3 int), (r27v6 int) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x0323 A[PHI: r0 r14 r17 r26 r27
      0x0323: PHI (r0v28 int) = (r0v25 int), (r0v27 int), (r0v32 int) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r14v10 int) = (r14v9 int), (r14v9 int), (r14v13 int) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r17v4 int) = (r17v3 int), (r17v3 int), (r17v6 int) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r26v6 sun.misc.Unsafe) = (r26v5 sun.misc.Unsafe), (r26v5 sun.misc.Unsafe), (r26v8 sun.misc.Unsafe) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]
      0x0323: PHI (r27v4 int) = (r27v3 int), (r27v3 int), (r27v6 int) binds: [B:125:0x0375, B:121:0x0355, B:112:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x00b8. Please report as an issue. */
    public final int G(Object obj, byte[] bArr, int i7, int i8, int i9, C0824d c0824d) {
        Unsafe unsafe;
        int i10;
        Object obj2;
        int i11;
        int iK;
        int i12;
        int iQ;
        int iQ2;
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
        int iN;
        int i24;
        int i25;
        C0858f0 c0858f0 = this;
        Object obj3 = obj;
        bArr = bArr;
        i8 = i8;
        i9 = i9;
        c0824d = c0824d;
        l(obj);
        Unsafe unsafe2 = f12186o;
        int iG = i7;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 1048575;
        while (true) {
            if (iG < i8) {
                int i31 = iG + 1;
                byte b7 = bArr[iG];
                if (b7 < 0) {
                    iK = w0.K(b7, bArr, i31, c0824d);
                    i11 = c0824d.f11761a;
                } else {
                    i11 = b7;
                    iK = i31;
                }
                i26 = i11 >>> 3;
                int i32 = i11 & 7;
                int i33 = c0858f0.f12190d;
                int i34 = iK;
                int i35 = c0858f0.f12189c;
                int i36 = i11;
                if (i26 > i26) {
                    iQ2 = (i26 < i35 || i26 > i33) ? -1 : c0858f0.Q(i26, i27 / 3);
                    i13 = -1;
                    i12 = 0;
                } else {
                    if (i26 < i35 || i26 > i33) {
                        i12 = 0;
                        iQ = -1;
                    } else {
                        i12 = 0;
                        iQ = c0858f0.Q(i26, 0);
                    }
                    iQ2 = iQ;
                    i13 = -1;
                }
                if (iQ2 == i13) {
                    i14 = i34;
                    i15 = i29;
                    i16 = i30;
                    i17 = i12;
                    unsafe = unsafe2;
                    i18 = i26;
                    i10 = i9;
                    i19 = i36;
                } else {
                    int[] iArr = c0858f0.f12187a;
                    int i37 = iArr[iQ2 + 1];
                    int iT = T(i37);
                    long j = i37 & 1048575;
                    if (iT <= 17) {
                        int i38 = iArr[iQ2 + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        if (i40 != i30) {
                            if (i30 != 1048575) {
                                unsafe2.putInt(obj3, i30, i29);
                                i25 = i40;
                            } else {
                                i25 = i40;
                            }
                            i16 = i25;
                            i15 = i25 == 1048575 ? 0 : unsafe2.getInt(obj3, i25);
                        } else {
                            i15 = i29;
                            i16 = i30;
                        }
                        switch (iT) {
                            case 0:
                                i21 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 1) {
                                    K0.o(obj3, j, w0.h(i21, bArr));
                                    iG = i21 + 8;
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 1:
                                i21 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 5) {
                                    K0.p(obj3, j, w0.n(i21, bArr));
                                    iG = i21 + 4;
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 2:
                            case 3:
                                i21 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 0) {
                                    iN = w0.N(bArr, i21, c0824d);
                                    unsafe2.putLong(obj, j, c0824d.f11762b);
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    iG = iN;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 4:
                            case 11:
                                i21 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 0) {
                                    iG = w0.L(bArr, i21, c0824d);
                                    unsafe2.putInt(obj3, j, c0824d.f11761a);
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 5:
                            case 14:
                                i24 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 1) {
                                    i21 = i24;
                                    unsafe2.putLong(obj, j, w0.l(i24, bArr));
                                    iG = i21 + 8;
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 6:
                            case 13:
                                i24 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj3, j, w0.j(i24, bArr));
                                    iG = i24 + 4;
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 7:
                                i24 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 0) {
                                    iG = w0.N(bArr, i24, c0824d);
                                    K0.k(obj3, j, c0824d.f11762b != 0);
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 8:
                                i24 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 2) {
                                    iG = (i37 & 536870912) != 0 ? w0.F(bArr, i24, c0824d) : w0.C(bArr, i24, c0824d);
                                    unsafe2.putObject(obj3, j, c0824d.f11763c);
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 9:
                                i24 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 2) {
                                    Object objY = c0858f0.y(i22, obj3);
                                    iG = w0.T(objY, c0858f0.q(i22), bArr, i24, i8, c0824d);
                                    c0858f0.R(i22, obj3, objY);
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 10:
                                i24 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 2) {
                                    iG = w0.f(bArr, i24, c0824d);
                                    unsafe2.putObject(obj3, j, c0824d.f11763c);
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 12:
                                i24 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 0) {
                                    iG = w0.L(bArr, i24, c0824d);
                                    int i41 = c0824d.f11761a;
                                    c0858f0.o(i22);
                                    unsafe2.putInt(obj3, j, i41);
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 15:
                                i24 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 0) {
                                    iG = w0.L(bArr, i24, c0824d);
                                    unsafe2.putInt(obj3, j, H6.b.b(c0824d.f11761a));
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 16:
                                i24 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                if (i32 == 0) {
                                    iN = w0.N(bArr, i24, c0824d);
                                    unsafe2.putLong(obj, j, H6.b.d(c0824d.f11762b));
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    iG = iN;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            case 17:
                                if (i32 == 3) {
                                    Object objY2 = c0858f0.y(iQ2, obj3);
                                    i22 = iQ2;
                                    i23 = i36;
                                    iG = w0.S(objY2, c0858f0.q(iQ2), bArr, i34, i8, (i26 << 3) | 4, c0824d);
                                    c0858f0.R(i22, obj3, objY2);
                                    i29 = i15 | i39;
                                    i28 = i23;
                                    i27 = i22;
                                    i30 = i16;
                                    i8 = i8;
                                } else {
                                    i24 = i34;
                                    i22 = iQ2;
                                    i23 = i36;
                                    i21 = i24;
                                    i19 = i23;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i18 = i26;
                                    i17 = i22;
                                    i14 = i21;
                                }
                                break;
                            default:
                                i21 = i34;
                                i22 = iQ2;
                                i23 = i36;
                                i19 = i23;
                                i10 = i9;
                                unsafe = unsafe2;
                                i18 = i26;
                                i17 = i22;
                                i14 = i21;
                                break;
                        }
                    } else {
                        int i42 = iQ2;
                        if (iT != 27) {
                            i15 = i29;
                            i16 = i30;
                            if (iT <= 49) {
                                unsafe = unsafe2;
                                i18 = i26;
                                i10 = i9;
                                i17 = i42;
                                iG = I(obj, bArr, i34, i8, i36, i32, i42, i37, iT, j, c0824d);
                                if (iG != i34) {
                                    obj3 = obj;
                                    i28 = i36;
                                } else {
                                    i19 = i36;
                                    i14 = iG;
                                }
                                i9 = i10;
                                i29 = i15;
                                i26 = i18;
                                i30 = i16;
                                unsafe2 = unsafe;
                                i27 = i17;
                                c0858f0 = this;
                            } else {
                                i10 = i9;
                                unsafe = unsafe2;
                                i18 = i26;
                                i17 = i42;
                                i20 = i34;
                                if (iT != 50) {
                                    iG = H(obj, bArr, i20, i8, i36, i18, i32, i37, iT, j, i17, c0824d);
                                    if (iG != i20) {
                                        obj3 = obj;
                                        i28 = i36;
                                    } else {
                                        i19 = i36;
                                        i14 = iG;
                                    }
                                    i9 = i10;
                                    i29 = i15;
                                    i26 = i18;
                                    i30 = i16;
                                    unsafe2 = unsafe;
                                    i27 = i17;
                                    c0858f0 = this;
                                } else if (i32 == 2) {
                                    iG = F(obj, bArr, i20, i8, i17, j, c0824d);
                                    if (iG != i20) {
                                        obj3 = obj;
                                        i28 = i36;
                                    } else {
                                        i19 = i36;
                                        i14 = iG;
                                    }
                                    i9 = i10;
                                    i29 = i15;
                                    i26 = i18;
                                    i30 = i16;
                                    unsafe2 = unsafe;
                                    i27 = i17;
                                    c0858f0 = this;
                                }
                            }
                        } else if (i32 == 2) {
                            AbstractC0849b abstractC0849b = (AbstractC0849b) ((J) unsafe2.getObject(obj3, j));
                            boolean zM = abstractC0849b.m();
                            AbstractC0849b abstractC0849b2 = abstractC0849b;
                            if (!zM) {
                                int size = abstractC0849b.size();
                                J jA = abstractC0849b.a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, j, jA);
                                abstractC0849b2 = jA;
                            }
                            i16 = i30;
                            iG = w0.q(c0858f0.q(i42), i36, bArr, i34, i8, abstractC0849b2, c0824d);
                            i28 = i36;
                            i9 = i9;
                            i27 = i42;
                            i29 = i29;
                            i30 = i16;
                            i8 = i8;
                        } else {
                            i15 = i29;
                            i16 = i30;
                            i10 = i9;
                            unsafe = unsafe2;
                            i18 = i26;
                            i17 = i42;
                            i20 = i34;
                        }
                        i19 = i36;
                        i14 = i20;
                    }
                }
                if (i19 != i10 || i10 == 0) {
                    C c3 = (C) obj;
                    B0 b0C = c3.unknownFields;
                    if (b0C == B0.f12098f) {
                        b0C = B0.c();
                        c3.unknownFields = b0C;
                    }
                    iG = w0.G(i19, bArr, i14, i8, b0C, c0824d);
                    i28 = i19;
                    obj3 = obj;
                    i9 = i10;
                    i29 = i15;
                    i26 = i18;
                    i30 = i16;
                    unsafe2 = unsafe;
                    i27 = i17;
                    c0858f0 = this;
                } else {
                    obj2 = obj;
                    iG = i14;
                    i28 = i19;
                    i29 = i15;
                    i30 = i16;
                }
            } else {
                unsafe = unsafe2;
                i10 = i9;
                obj2 = obj3;
            }
        }
        if (i30 != 1048575) {
            unsafe.putInt(obj2, i30, i29);
        }
        for (int i43 = this.f12194h; i43 < this.f12195i; i43++) {
            n(this.f12193g[i43], obj2, null);
        }
        if (i10 == 0) {
            if (iG != i8) {
                throw M.g();
            }
        } else if (iG > i8 || i28 != i10) {
            throw M.g();
        }
        return iG;
    }

    public final int H(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, C0824d c0824d) throws M {
        Unsafe unsafe = f12186o;
        long j3 = this.f12187a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j, Double.valueOf(w0.h(i7, bArr)));
                int i15 = i7 + 8;
                unsafe.putInt(obj, j3, i10);
                return i15;
            case 52:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j, Float.valueOf(w0.n(i7, bArr)));
                int i16 = i7 + 4;
                unsafe.putInt(obj, j3, i10);
                return i16;
            case 53:
            case 54:
                if (i11 != 0) {
                    return i7;
                }
                int iN = w0.N(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Long.valueOf(c0824d.f11762b));
                unsafe.putInt(obj, j3, i10);
                return iN;
            case 55:
            case 62:
                if (i11 != 0) {
                    return i7;
                }
                int iL = w0.L(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Integer.valueOf(c0824d.f11761a));
                unsafe.putInt(obj, j3, i10);
                return iL;
            case 56:
            case 65:
                if (i11 != 1) {
                    return i7;
                }
                unsafe.putObject(obj, j, Long.valueOf(w0.l(i7, bArr)));
                int i17 = i7 + 8;
                unsafe.putInt(obj, j3, i10);
                return i17;
            case 57:
            case 64:
                if (i11 != 5) {
                    return i7;
                }
                unsafe.putObject(obj, j, Integer.valueOf(w0.j(i7, bArr)));
                int i18 = i7 + 4;
                unsafe.putInt(obj, j3, i10);
                return i18;
            case 58:
                if (i11 != 0) {
                    return i7;
                }
                int iN2 = w0.N(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Boolean.valueOf(c0824d.f11762b != 0));
                unsafe.putInt(obj, j3, i10);
                return iN2;
            case 59:
                if (i11 != 2) {
                    return i7;
                }
                int iL2 = w0.L(bArr, i7, c0824d);
                int i19 = c0824d.f11761a;
                if (i19 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i12 & 536870912) != 0 && !N0.f(bArr, iL2, iL2 + i19)) {
                        throw M.c();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iL2, i19, K.f12112a));
                    iL2 += i19;
                }
                unsafe.putInt(obj, j3, i10);
                return iL2;
            case 60:
                if (i11 != 2) {
                    return i7;
                }
                Object objZ = z(i10, i14, obj);
                int iT = w0.T(objZ, q(i14), bArr, i7, i8, c0824d);
                S(obj, i10, i14, objZ);
                return iT;
            case 61:
                if (i11 != 2) {
                    return i7;
                }
                int iF = w0.f(bArr, i7, c0824d);
                unsafe.putObject(obj, j, c0824d.f11763c);
                unsafe.putInt(obj, j3, i10);
                return iF;
            case 63:
                if (i11 != 0) {
                    return i7;
                }
                int iL3 = w0.L(bArr, i7, c0824d);
                int i20 = c0824d.f11761a;
                o(i14);
                unsafe.putObject(obj, j, Integer.valueOf(i20));
                unsafe.putInt(obj, j3, i10);
                return iL3;
            case 66:
                if (i11 != 0) {
                    return i7;
                }
                int iL4 = w0.L(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Integer.valueOf(H6.b.b(c0824d.f11761a)));
                unsafe.putInt(obj, j3, i10);
                return iL4;
            case 67:
                if (i11 != 0) {
                    return i7;
                }
                int iN3 = w0.N(bArr, i7, c0824d);
                unsafe.putObject(obj, j, Long.valueOf(H6.b.d(c0824d.f11762b)));
                unsafe.putInt(obj, j3, i10);
                return iN3;
            case 68:
                if (i11 != 3) {
                    return i7;
                }
                Object objZ2 = z(i10, i14, obj);
                int iS = w0.S(objZ2, q(i14), bArr, i7, i8, (i9 & (-8)) | 4, c0824d);
                S(obj, i10, i14, objZ2);
                return iS;
            default:
                return i7;
        }
    }

    public final int I(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, long j, int i12, long j3, C0824d c0824d) throws M {
        int iM;
        Unsafe unsafe = f12186o;
        AbstractC0849b abstractC0849b = (AbstractC0849b) ((J) unsafe.getObject(obj, j3));
        boolean zM = abstractC0849b.m();
        AbstractC0849b abstractC0849b2 = abstractC0849b;
        if (!zM) {
            int size = abstractC0849b.size();
            J jA = abstractC0849b.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j3, jA);
            abstractC0849b2 = jA;
        }
        switch (i12) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return w0.s(bArr, i7, abstractC0849b2, c0824d);
                }
                return i10 == 1 ? w0.i(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 19:
            case 36:
                if (i10 == 2) {
                    return w0.v(bArr, i7, abstractC0849b2, c0824d);
                }
                return i10 == 5 ? w0.o(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i10 == 2) {
                    return w0.z(bArr, i7, abstractC0849b2, c0824d);
                }
                return i10 == 0 ? w0.O(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return w0.y(bArr, i7, abstractC0849b2, c0824d);
                }
                return i10 == 0 ? w0.M(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return w0.u(bArr, i7, abstractC0849b2, c0824d);
                }
                return i10 == 1 ? w0.m(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return w0.t(bArr, i7, abstractC0849b2, c0824d);
                }
                return i10 == 5 ? w0.k(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 25:
            case 42:
                if (i10 == 2) {
                    return w0.r(bArr, i7, abstractC0849b2, c0824d);
                }
                return i10 == 0 ? w0.e(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 26:
                if (i10 == 2) {
                    return (j & 536870912) == 0 ? w0.D(i9, bArr, i7, i8, abstractC0849b2, c0824d) : w0.E(i9, bArr, i7, i8, abstractC0849b2, c0824d);
                }
                return i7;
            case 27:
                return i10 == 2 ? w0.q(q(i11), i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 28:
                return i10 == 2 ? w0.g(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 30:
            case 44:
                if (i10 == 2) {
                    iM = w0.y(bArr, i7, abstractC0849b2, c0824d);
                } else {
                    if (i10 != 0) {
                        return i7;
                    }
                    iM = w0.M(i9, bArr, i7, i8, abstractC0849b2, c0824d);
                }
                o(i11);
                Class cls = AbstractC0883s0.f12269a;
                return iM;
            case 33:
            case 47:
                if (i10 == 2) {
                    return w0.w(bArr, i7, abstractC0849b2, c0824d);
                }
                return i10 == 0 ? w0.A(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 34:
            case 48:
                if (i10 == 2) {
                    return w0.x(bArr, i7, abstractC0849b2, c0824d);
                }
                return i10 == 0 ? w0.B(i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            case 49:
                return i10 == 3 ? w0.p(q(i11), i9, bArr, i7, i8, abstractC0849b2, c0824d) : i7;
            default:
                return i7;
        }
    }

    public final void J(Object obj, long j, C0665j c0665j, InterfaceC0881r0 interfaceC0881r0, C0884t c0884t) throws L {
        int iA;
        List listC = this.f12196k.c(j, obj);
        int i7 = c0665j.f9210b;
        if ((i7 & 7) != 3) {
            throw M.d();
        }
        do {
            C cD = interfaceC0881r0.d();
            c0665j.e(cD, interfaceC0881r0, c0884t);
            interfaceC0881r0.b(cD);
            listC.add(cD);
            H6.b bVar = (H6.b) c0665j.f9213e;
            if (bVar.f() || c0665j.f9212d != 0) {
                return;
            } else {
                iA = bVar.A();
            }
        } while (iA == i7);
        c0665j.f9212d = iA;
    }

    public final void K(Object obj, int i7, C0665j c0665j, InterfaceC0881r0 interfaceC0881r0, C0884t c0884t) throws M {
        int iA;
        List listC = this.f12196k.c(i7 & 1048575, obj);
        int i8 = c0665j.f9210b;
        if ((i8 & 7) != 2) {
            throw M.d();
        }
        do {
            C cD = interfaceC0881r0.d();
            c0665j.h(cD, interfaceC0881r0, c0884t);
            interfaceC0881r0.b(cD);
            listC.add(cD);
            H6.b bVar = (H6.b) c0665j.f9213e;
            if (bVar.f() || c0665j.f9212d != 0) {
                return;
            } else {
                iA = bVar.A();
            }
        } while (iA == i8);
        c0665j.f9212d = iA;
    }

    public final void L(int i7, C0665j c0665j, Object obj) throws com.google.crypto.tink.shaded.protobuf.B, L, C0678x {
        if ((536870912 & i7) != 0) {
            c0665j.W(2);
            K0.s(obj, i7 & 1048575, ((H6.b) c0665j.f9213e).z());
        } else if (!this.f12192f) {
            K0.s(obj, i7 & 1048575, c0665j.o());
        } else {
            c0665j.W(2);
            K0.s(obj, i7 & 1048575, ((H6.b) c0665j.f9213e).y());
        }
    }

    public final void M(int i7, C0665j c0665j, Object obj) throws com.google.crypto.tink.shaded.protobuf.B, L, C0678x {
        boolean z4 = (536870912 & i7) != 0;
        U u4 = this.f12196k;
        if (z4) {
            c0665j.Q(u4.c(i7 & 1048575, obj), true);
        } else {
            c0665j.Q(u4.c(i7 & 1048575, obj), false);
        }
    }

    public final void O(int i7, Object obj) {
        int i8 = this.f12187a[i7 + 2];
        long j = 1048575 & i8;
        if (j == 1048575) {
            return;
        }
        K0.q(j, obj, (1 << (i8 >>> 20)) | K0.f12117c.i(j, obj));
    }

    public final void P(int i7, int i8, Object obj) {
        K0.q(this.f12187a[i8 + 2] & 1048575, obj, i7);
    }

    public final int Q(int i7, int i8) {
        int[] iArr = this.f12187a;
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

    public final void R(int i7, Object obj, Object obj2) {
        f12186o.putObject(obj, U(i7) & 1048575, obj2);
        O(i7, obj);
    }

    public final void S(Object obj, int i7, int i8, Object obj2) {
        f12186o.putObject(obj, U(i8) & 1048575, obj2);
        P(i7, i8, obj);
    }

    public final int U(int i7) {
        return this.f12187a[i7 + 1];
    }

    public final void V(Object obj, X x4) {
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.f12187a;
        int length = iArr.length;
        Unsafe unsafe = f12186o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            int iU = U(i14);
            int i15 = iArr[i14];
            int iT = T(iU);
            if (iT <= 17) {
                int i16 = iArr[i14 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i7 = i12;
                i8 = i13;
                i9 = 1 << (i16 >>> 20);
            } else {
                i7 = i12;
                i8 = i13;
                i9 = 0;
            }
            long j = iU & i11;
            switch (iT) {
                case 0:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.d(i15, K0.f12117c.g(j, obj));
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 1:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.h(K0.f12117c.h(j, obj), i15);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 2:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.k(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 3:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.r(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 4:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.j(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 5:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.g(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 6:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.f(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 7:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.b(i15, K0.f12117c.d(j, obj));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 8:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((AbstractC0879q) x4.f12168a).I0(i15, (String) object);
                        } else {
                            x4.c(i15, (AbstractC0867k) object);
                        }
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 9:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.l(i15, unsafe.getObject(obj, j), q(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 10:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.c(i15, (AbstractC0867k) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 11:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.q(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 12:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.e(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 13:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.m(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 14:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.n(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 15:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.o(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 16:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.p(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 17:
                    i10 = i7;
                    if (s(obj, i14, i7, i8, i9)) {
                        x4.i(i15, unsafe.getObject(obj, j), q(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 18:
                    AbstractC0883s0.E(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 19:
                    AbstractC0883s0.I(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 20:
                    AbstractC0883s0.L(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    AbstractC0883s0.T(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 22:
                    AbstractC0883s0.K(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 23:
                    AbstractC0883s0.H(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 24:
                    AbstractC0883s0.G(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 25:
                    AbstractC0883s0.C(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 26:
                    AbstractC0883s0.R(iArr[i14], (List) unsafe.getObject(obj, j), x4);
                    break;
                case 27:
                    AbstractC0883s0.M(iArr[i14], (List) unsafe.getObject(obj, j), x4, q(i14));
                    break;
                case 28:
                    AbstractC0883s0.D(iArr[i14], (List) unsafe.getObject(obj, j), x4);
                    break;
                case 29:
                    AbstractC0883s0.S(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 30:
                    AbstractC0883s0.F(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 31:
                    AbstractC0883s0.N(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 32:
                    AbstractC0883s0.O(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 33:
                    AbstractC0883s0.P(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 34:
                    AbstractC0883s0.Q(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 35:
                    AbstractC0883s0.E(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 36:
                    AbstractC0883s0.I(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 37:
                    AbstractC0883s0.L(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 38:
                    AbstractC0883s0.T(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 39:
                    AbstractC0883s0.K(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 40:
                    AbstractC0883s0.H(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 41:
                    AbstractC0883s0.G(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 42:
                    AbstractC0883s0.C(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 43:
                    AbstractC0883s0.S(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 44:
                    AbstractC0883s0.F(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 45:
                    AbstractC0883s0.N(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 46:
                    AbstractC0883s0.O(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 47:
                    AbstractC0883s0.P(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 48:
                    AbstractC0883s0.Q(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 49:
                    AbstractC0883s0.J(iArr[i14], (List) unsafe.getObject(obj, j), x4, q(i14));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object objP = p(i14);
                        this.f12198m.getClass();
                        Y y4 = ((Z) objP).f12172a;
                        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
                        abstractC0879q.getClass();
                        for (Map.Entry entry : ((C0848a0) object2).entrySet()) {
                            abstractC0879q.K0(i15, 2);
                            abstractC0879q.M0(Z.a(y4, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0888w.b(abstractC0879q, y4.f12169a, 1, key);
                            C0888w.b(abstractC0879q, y4.f12170b, 2, value);
                        }
                    }
                    break;
                case 51:
                    if (u(i15, i14, obj)) {
                        x4.d(i15, ((Double) K0.f12117c.k(j, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (u(i15, i14, obj)) {
                        x4.h(((Float) K0.f12117c.k(j, obj)).floatValue(), i15);
                    }
                    break;
                case 53:
                    if (u(i15, i14, obj)) {
                        x4.k(i15, E(j, obj));
                    }
                    break;
                case 54:
                    if (u(i15, i14, obj)) {
                        x4.r(i15, E(j, obj));
                    }
                    break;
                case 55:
                    if (u(i15, i14, obj)) {
                        x4.j(i15, D(j, obj));
                    }
                    break;
                case 56:
                    if (u(i15, i14, obj)) {
                        x4.g(i15, E(j, obj));
                    }
                    break;
                case 57:
                    if (u(i15, i14, obj)) {
                        x4.f(i15, D(j, obj));
                    }
                    break;
                case 58:
                    if (u(i15, i14, obj)) {
                        x4.b(i15, ((Boolean) K0.f12117c.k(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (u(i15, i14, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((AbstractC0879q) x4.f12168a).I0(i15, (String) object3);
                        } else {
                            x4.c(i15, (AbstractC0867k) object3);
                        }
                    }
                    break;
                case 60:
                    if (u(i15, i14, obj)) {
                        x4.l(i15, unsafe.getObject(obj, j), q(i14));
                    }
                    break;
                case 61:
                    if (u(i15, i14, obj)) {
                        x4.c(i15, (AbstractC0867k) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (u(i15, i14, obj)) {
                        x4.q(i15, D(j, obj));
                    }
                    break;
                case 63:
                    if (u(i15, i14, obj)) {
                        x4.e(i15, D(j, obj));
                    }
                    break;
                case 64:
                    if (u(i15, i14, obj)) {
                        x4.m(i15, D(j, obj));
                    }
                    break;
                case 65:
                    if (u(i15, i14, obj)) {
                        x4.n(i15, E(j, obj));
                    }
                    break;
                case 66:
                    if (u(i15, i14, obj)) {
                        x4.o(i15, D(j, obj));
                    }
                    break;
                case 67:
                    if (u(i15, i14, obj)) {
                        x4.p(i15, E(j, obj));
                    }
                    break;
                case 68:
                    if (u(i15, i14, obj)) {
                        x4.i(i15, unsafe.getObject(obj, j), q(i14));
                    }
                    break;
            }
            i10 = i7;
            i14 += 3;
            i12 = i10;
            i13 = i8;
            i11 = 1048575;
        }
        this.f12197l.getClass();
        ((C) obj).unknownFields.e(x4);
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f12187a;
            if (i7 >= iArr.length) {
                AbstractC0883s0.A(this.f12197l, obj, obj2);
                return;
            }
            int iU = U(i7);
            long j = 1048575 & iU;
            int i8 = iArr[i7];
            switch (T(iU)) {
                case 0:
                    if (r(i7, obj2)) {
                        K0.o(obj, j, K0.f12117c.g(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 1:
                    if (r(i7, obj2)) {
                        K0.p(obj, j, K0.f12117c.h(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 2:
                    if (r(i7, obj2)) {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 3:
                    if (r(i7, obj2)) {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 4:
                    if (r(i7, obj2)) {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 5:
                    if (r(i7, obj2)) {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 6:
                    if (r(i7, obj2)) {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 7:
                    if (r(i7, obj2)) {
                        K0.k(obj, j, K0.f12117c.d(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 8:
                    if (r(i7, obj2)) {
                        K0.s(obj, j, K0.f12117c.k(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 9:
                    w(i7, obj, obj2);
                    break;
                case 10:
                    if (r(i7, obj2)) {
                        K0.s(obj, j, K0.f12117c.k(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 11:
                    if (r(i7, obj2)) {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 12:
                    if (r(i7, obj2)) {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 13:
                    if (r(i7, obj2)) {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 14:
                    if (r(i7, obj2)) {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 15:
                    if (r(i7, obj2)) {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 16:
                    if (r(i7, obj2)) {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                    }
                    break;
                case 17:
                    w(i7, obj, obj2);
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
                    this.f12196k.b(obj, j, obj2);
                    break;
                case 50:
                    Class cls = AbstractC0883s0.f12269a;
                    J0 j3 = K0.f12117c;
                    Object objK = j3.k(j, obj);
                    Object objK2 = j3.k(j, obj2);
                    this.f12198m.getClass();
                    K0.s(obj, j, C0850b0.e(objK, objK2));
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
                        K0.s(obj, j, K0.f12117c.k(j, obj2));
                        P(i8, i7, obj);
                    }
                    break;
                case 60:
                    x(i7, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(i8, i7, obj2)) {
                        K0.s(obj, j, K0.f12117c.k(j, obj2));
                        P(i8, i7, obj);
                    }
                    break;
                case 68:
                    x(i7, obj, obj2);
                    break;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x007d A[SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC0881r0
    public final void b(Object obj) {
        if (t(obj)) {
            if (obj instanceof C) {
                C c3 = (C) obj;
                c3.h();
                c3.g();
                c3.o();
            }
            int[] iArr = this.f12187a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iU = U(i7);
                long j = 1048575 & iU;
                int iT = T(iU);
                if (iT != 9) {
                    if (iT != 60 && iT != 68) {
                        switch (iT) {
                            case 17:
                                if (r(i7, obj)) {
                                    q(i7).b(f12186o.getObject(obj, j));
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
                                this.f12196k.a(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f12186o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f12198m.getClass();
                                    C0850b0.g(object);
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (u(iArr[i7], i7, obj)) {
                        q(i7).b(f12186o.getObject(obj, j));
                    }
                } else if (r(i7, obj)) {
                    q(i7).b(f12186o.getObject(obj, j));
                }
            }
            this.f12197l.getClass();
            C0.b(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101 A[LOOP:2: B:55:0x00f0->B:60:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0127 A[SYNTHETIC] */
    @Override // com.google.protobuf.InterfaceC0881r0
    public final boolean c(Object obj) {
        int i7;
        int i8;
        List list;
        InterfaceC0881r0 interfaceC0881r0Q;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f12194h) {
            int i13 = this.f12193g[i12];
            int[] iArr = this.f12187a;
            int i14 = iArr[i13];
            int iU = U(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f12186o.getInt(obj, i16);
                }
                i8 = i11;
                i7 = i16;
            } else {
                i7 = i10;
                i8 = i11;
            }
            if ((268435456 & iU) != 0 && !s(obj, i13, i7, i8, i17)) {
                return false;
            }
            int iT = T(iU);
            if (iT == 9 || iT == 17) {
                if (s(obj, i13, i7, i8, i17)) {
                    if (!q(i13).c(K0.f12117c.k(iU & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iT == 27) {
                list = (List) K0.f12117c.k(iU & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC0881r0Q = q(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!interfaceC0881r0Q.c(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iT == 60 || iT == 68) {
                if (u(i14, i13, obj)) {
                    if (!q(i13).c(K0.f12117c.k(iU & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iT == 49) {
                list = (List) K0.f12117c.k(iU & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC0881r0Q = q(i13);
                    while (i9 < list.size()) {
                        if (!interfaceC0881r0Q.c(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iT != 50) {
                continue;
            } else {
                Object objK = K0.f12117c.k(iU & 1048575, obj);
                this.f12198m.getClass();
                C0848a0 c0848a0 = (C0848a0) objK;
                if (!c0848a0.isEmpty() && ((Z) p(i13)).f12172a.f12170b.f12152a == T0.MESSAGE) {
                    InterfaceC0881r0 interfaceC0881r0A = null;
                    for (Object obj2 : c0848a0.values()) {
                        if (interfaceC0881r0A == null) {
                            interfaceC0881r0A = C0872m0.f12232c.a(obj2.getClass());
                        }
                        if (!interfaceC0881r0A.c(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i12++;
            i10 = i7;
            i11 = i8;
        }
        return true;
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final C d() {
        this.j.getClass();
        return ((C) this.f12191e).q();
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final void e(Object obj, X x4) {
        x4.getClass();
        V(obj, x4);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.InterfaceC0881r0
    public final int f(C c3) {
        int i7;
        int iB;
        int i8;
        int[] iArr = this.f12187a;
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iU = U(i10);
            int i11 = iArr[i10];
            long j = 1048575 & iU;
            int i12 = 1237;
            int iHashCode = 37;
            switch (T(iU)) {
                case 0:
                    i7 = i9 * 53;
                    iB = K.b(Double.doubleToLongBits(K0.f12117c.g(j, c3)));
                    i9 = iB + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    iB = Float.floatToIntBits(K0.f12117c.h(j, c3));
                    i9 = iB + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    iB = K.b(K0.f12117c.j(j, c3));
                    i9 = iB + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    iB = K.b(K0.f12117c.j(j, c3));
                    i9 = iB + i7;
                    break;
                case 4:
                    i7 = i9 * 53;
                    iB = K0.f12117c.i(j, c3);
                    i9 = iB + i7;
                    break;
                case 5:
                    i7 = i9 * 53;
                    iB = K.b(K0.f12117c.j(j, c3));
                    i9 = iB + i7;
                    break;
                case 6:
                    i7 = i9 * 53;
                    iB = K0.f12117c.i(j, c3);
                    i9 = iB + i7;
                    break;
                case 7:
                    i8 = i9 * 53;
                    boolean zD = K0.f12117c.d(j, c3);
                    Charset charset = K.f12112a;
                    if (zD) {
                        i12 = 1231;
                    }
                    i9 = i12 + i8;
                    break;
                case 8:
                    i7 = i9 * 53;
                    iB = ((String) K0.f12117c.k(j, c3)).hashCode();
                    i9 = iB + i7;
                    break;
                case 9:
                    Object objK = K0.f12117c.k(j, c3);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i9 * 53;
                    iB = K0.f12117c.k(j, c3).hashCode();
                    i9 = iB + i7;
                    break;
                case 11:
                    i7 = i9 * 53;
                    iB = K0.f12117c.i(j, c3);
                    i9 = iB + i7;
                    break;
                case 12:
                    i7 = i9 * 53;
                    iB = K0.f12117c.i(j, c3);
                    i9 = iB + i7;
                    break;
                case 13:
                    i7 = i9 * 53;
                    iB = K0.f12117c.i(j, c3);
                    i9 = iB + i7;
                    break;
                case 14:
                    i7 = i9 * 53;
                    iB = K.b(K0.f12117c.j(j, c3));
                    i9 = iB + i7;
                    break;
                case 15:
                    i7 = i9 * 53;
                    iB = K0.f12117c.i(j, c3);
                    i9 = iB + i7;
                    break;
                case 16:
                    i7 = i9 * 53;
                    iB = K.b(K0.f12117c.j(j, c3));
                    i9 = iB + i7;
                    break;
                case 17:
                    Object objK2 = K0.f12117c.k(j, c3);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
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
                    iB = K0.f12117c.k(j, c3).hashCode();
                    i9 = iB + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    iB = K0.f12117c.k(j, c3).hashCode();
                    i9 = iB + i7;
                    break;
                case 51:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = K.b(Double.doubleToLongBits(((Double) K0.f12117c.k(j, c3)).doubleValue()));
                        i9 = iB + i7;
                    }
                    break;
                case 52:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = Float.floatToIntBits(((Float) K0.f12117c.k(j, c3)).floatValue());
                        i9 = iB + i7;
                    }
                    break;
                case 53:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = K.b(E(j, c3));
                        i9 = iB + i7;
                    }
                    break;
                case 54:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = K.b(E(j, c3));
                        i9 = iB + i7;
                    }
                    break;
                case 55:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = D(j, c3);
                        i9 = iB + i7;
                    }
                    break;
                case 56:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = K.b(E(j, c3));
                        i9 = iB + i7;
                    }
                    break;
                case 57:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = D(j, c3);
                        i9 = iB + i7;
                    }
                    break;
                case 58:
                    if (u(i11, i10, c3)) {
                        i8 = i9 * 53;
                        boolean zBooleanValue = ((Boolean) K0.f12117c.k(j, c3)).booleanValue();
                        Charset charset2 = K.f12112a;
                        if (zBooleanValue) {
                            i12 = 1231;
                        }
                        i9 = i12 + i8;
                    }
                    break;
                case 59:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = ((String) K0.f12117c.k(j, c3)).hashCode();
                        i9 = iB + i7;
                    }
                    break;
                case 60:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = K0.f12117c.k(j, c3).hashCode();
                        i9 = iB + i7;
                    }
                    break;
                case 61:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = K0.f12117c.k(j, c3).hashCode();
                        i9 = iB + i7;
                    }
                    break;
                case 62:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = D(j, c3);
                        i9 = iB + i7;
                    }
                    break;
                case 63:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = D(j, c3);
                        i9 = iB + i7;
                    }
                    break;
                case 64:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = D(j, c3);
                        i9 = iB + i7;
                    }
                    break;
                case 65:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = K.b(E(j, c3));
                        i9 = iB + i7;
                    }
                    break;
                case 66:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = D(j, c3);
                        i9 = iB + i7;
                    }
                    break;
                case 67:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = K.b(E(j, c3));
                        i9 = iB + i7;
                    }
                    break;
                case 68:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        iB = K0.f12117c.k(j, c3).hashCode();
                        i9 = iB + i7;
                    }
                    break;
            }
        }
        this.f12197l.getClass();
        return c3.unknownFields.hashCode() + (i9 * 53);
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final void g(Object obj, C0665j c0665j, C0884t c0884t) {
        c0884t.getClass();
        l(obj);
        C0 c0 = this.f12197l;
        int[] iArr = this.f12193g;
        int i7 = this.f12195i;
        int i8 = this.f12194h;
        B0 b0A = null;
        while (true) {
            try {
                int iA = c0665j.a();
                int iQ = (iA < this.f12189c || iA > this.f12190d) ? -1 : Q(iA, 0);
                if (iQ >= 0) {
                    int iU = U(iQ);
                    try {
                        int iT = T(iU);
                        H6.b bVar = (H6.b) c0665j.f9213e;
                        U u4 = this.f12196k;
                        switch (iT) {
                            case 0:
                                long jC = C(iU);
                                c0665j.W(1);
                                K0.o(obj, jC, bVar.l());
                                O(iQ, obj);
                                continue;
                            case 1:
                                long jC2 = C(iU);
                                c0665j.W(5);
                                K0.p(obj, jC2, bVar.p());
                                O(iQ, obj);
                                continue;
                            case 2:
                                long jC3 = C(iU);
                                c0665j.W(0);
                                K0.r(obj, jC3, bVar.s());
                                O(iQ, obj);
                                continue;
                            case 3:
                                long jC4 = C(iU);
                                c0665j.W(0);
                                K0.r(obj, jC4, bVar.C());
                                O(iQ, obj);
                                continue;
                            case 4:
                                long jC5 = C(iU);
                                c0665j.W(0);
                                K0.q(jC5, obj, bVar.q());
                                O(iQ, obj);
                                continue;
                            case 5:
                                long jC6 = C(iU);
                                c0665j.W(1);
                                K0.r(obj, jC6, bVar.o());
                                O(iQ, obj);
                                continue;
                            case 6:
                                long jC7 = C(iU);
                                c0665j.W(5);
                                K0.q(jC7, obj, bVar.n());
                                O(iQ, obj);
                                continue;
                            case 7:
                                long jC8 = C(iU);
                                c0665j.W(0);
                                K0.k(obj, jC8, bVar.j());
                                O(iQ, obj);
                                continue;
                            case 8:
                                L(iU, c0665j, obj);
                                O(iQ, obj);
                                continue;
                            case 9:
                                Object obj2 = (AbstractC0847a) y(iQ, obj);
                                InterfaceC0881r0 interfaceC0881r0Q = q(iQ);
                                c0665j.W(2);
                                c0665j.h(obj2, interfaceC0881r0Q, c0884t);
                                R(iQ, obj, obj2);
                                continue;
                            case 10:
                                K0.s(obj, C(iU), c0665j.o());
                                O(iQ, obj);
                                continue;
                            case 11:
                                long jC9 = C(iU);
                                c0665j.W(0);
                                K0.q(jC9, obj, bVar.B());
                                O(iQ, obj);
                                continue;
                            case 12:
                                c0665j.W(0);
                                int iM = bVar.m();
                                o(iQ);
                                K0.q(C(iU), obj, iM);
                                O(iQ, obj);
                                continue;
                            case 13:
                                long jC10 = C(iU);
                                c0665j.W(5);
                                K0.q(jC10, obj, bVar.u());
                                O(iQ, obj);
                                continue;
                            case 14:
                                long jC11 = C(iU);
                                c0665j.W(1);
                                K0.r(obj, jC11, bVar.v());
                                O(iQ, obj);
                                continue;
                            case 15:
                                long jC12 = C(iU);
                                c0665j.W(0);
                                K0.q(jC12, obj, bVar.w());
                                O(iQ, obj);
                                continue;
                            case 16:
                                long jC13 = C(iU);
                                c0665j.W(0);
                                K0.r(obj, jC13, bVar.x());
                                O(iQ, obj);
                                continue;
                            case 17:
                                Object obj3 = (AbstractC0847a) y(iQ, obj);
                                InterfaceC0881r0 interfaceC0881r0Q2 = q(iQ);
                                c0665j.W(3);
                                c0665j.e(obj3, interfaceC0881r0Q2, c0884t);
                                R(iQ, obj, obj3);
                                continue;
                            case 18:
                                c0665j.s(u4.c(C(iU), obj));
                                continue;
                            case 19:
                                c0665j.C(u4.c(C(iU), obj));
                                continue;
                            case 20:
                                c0665j.G(u4.c(C(iU), obj));
                                continue;
                            case zzbbd.zzt.zzm /* 21 */:
                                c0665j.U(u4.c(C(iU), obj));
                                continue;
                            case 22:
                                c0665j.E(u4.c(C(iU), obj));
                                continue;
                            case 23:
                                c0665j.A(u4.c(C(iU), obj));
                                continue;
                            case 24:
                                c0665j.y(u4.c(C(iU), obj));
                                continue;
                            case 25:
                                c0665j.l(u4.c(C(iU), obj));
                                continue;
                            case 26:
                                M(iU, c0665j, obj);
                                continue;
                            case 27:
                                K(obj, iU, c0665j, q(iQ), c0884t);
                                continue;
                            case 28:
                                c0665j.q(u4.c(C(iU), obj));
                                continue;
                            case 29:
                                c0665j.S(u4.c(C(iU), obj));
                                continue;
                            case 30:
                                List listC = u4.c(C(iU), obj);
                                c0665j.u(listC);
                                o(iQ);
                                AbstractC0883s0.z(obj, iA, listC, b0A, c0);
                                continue;
                            case 31:
                                c0665j.I(u4.c(C(iU), obj));
                                continue;
                            case 32:
                                c0665j.K(u4.c(C(iU), obj));
                                continue;
                            case 33:
                                c0665j.M(u4.c(C(iU), obj));
                                continue;
                            case 34:
                                c0665j.O(u4.c(C(iU), obj));
                                continue;
                            case 35:
                                c0665j.s(u4.c(C(iU), obj));
                                continue;
                            case 36:
                                c0665j.C(u4.c(C(iU), obj));
                                continue;
                            case 37:
                                c0665j.G(u4.c(C(iU), obj));
                                continue;
                            case 38:
                                c0665j.U(u4.c(C(iU), obj));
                                continue;
                            case 39:
                                c0665j.E(u4.c(C(iU), obj));
                                continue;
                            case 40:
                                c0665j.A(u4.c(C(iU), obj));
                                continue;
                            case 41:
                                c0665j.y(u4.c(C(iU), obj));
                                continue;
                            case 42:
                                c0665j.l(u4.c(C(iU), obj));
                                continue;
                            case 43:
                                c0665j.S(u4.c(C(iU), obj));
                                continue;
                            case 44:
                                List listC2 = u4.c(C(iU), obj);
                                c0665j.u(listC2);
                                o(iQ);
                                AbstractC0883s0.z(obj, iA, listC2, b0A, c0);
                                continue;
                            case 45:
                                c0665j.I(u4.c(C(iU), obj));
                                continue;
                            case 46:
                                c0665j.K(u4.c(C(iU), obj));
                                continue;
                            case 47:
                                c0665j.M(u4.c(C(iU), obj));
                                continue;
                            case 48:
                                c0665j.O(u4.c(C(iU), obj));
                                continue;
                            case 49:
                                J(obj, C(iU), c0665j, q(iQ), c0884t);
                                continue;
                            case 50:
                                v(obj, iQ, p(iQ), c0884t, c0665j);
                                continue;
                            case 51:
                                long jC14 = C(iU);
                                c0665j.W(1);
                                K0.s(obj, jC14, Double.valueOf(bVar.l()));
                                P(iA, iQ, obj);
                                continue;
                            case 52:
                                long jC15 = C(iU);
                                c0665j.W(5);
                                K0.s(obj, jC15, Float.valueOf(bVar.p()));
                                P(iA, iQ, obj);
                                continue;
                            case 53:
                                long jC16 = C(iU);
                                c0665j.W(0);
                                K0.s(obj, jC16, Long.valueOf(bVar.s()));
                                P(iA, iQ, obj);
                                continue;
                            case 54:
                                long jC17 = C(iU);
                                c0665j.W(0);
                                K0.s(obj, jC17, Long.valueOf(bVar.C()));
                                P(iA, iQ, obj);
                                continue;
                            case 55:
                                long jC18 = C(iU);
                                c0665j.W(0);
                                K0.s(obj, jC18, Integer.valueOf(bVar.q()));
                                P(iA, iQ, obj);
                                continue;
                            case 56:
                                long jC19 = C(iU);
                                c0665j.W(1);
                                K0.s(obj, jC19, Long.valueOf(bVar.o()));
                                P(iA, iQ, obj);
                                continue;
                            case 57:
                                long jC20 = C(iU);
                                c0665j.W(5);
                                K0.s(obj, jC20, Integer.valueOf(bVar.n()));
                                P(iA, iQ, obj);
                                continue;
                            case 58:
                                long jC21 = C(iU);
                                c0665j.W(0);
                                K0.s(obj, jC21, Boolean.valueOf(bVar.j()));
                                P(iA, iQ, obj);
                                continue;
                            case 59:
                                L(iU, c0665j, obj);
                                P(iA, iQ, obj);
                                continue;
                            case 60:
                                Object obj4 = (AbstractC0847a) z(iA, iQ, obj);
                                InterfaceC0881r0 interfaceC0881r0Q3 = q(iQ);
                                c0665j.W(2);
                                c0665j.h(obj4, interfaceC0881r0Q3, c0884t);
                                S(obj, iA, iQ, obj4);
                                continue;
                            case 61:
                                K0.s(obj, C(iU), c0665j.o());
                                P(iA, iQ, obj);
                                continue;
                            case 62:
                                long jC22 = C(iU);
                                c0665j.W(0);
                                K0.s(obj, jC22, Integer.valueOf(bVar.B()));
                                P(iA, iQ, obj);
                                continue;
                            case 63:
                                c0665j.W(0);
                                int iM2 = bVar.m();
                                o(iQ);
                                K0.s(obj, C(iU), Integer.valueOf(iM2));
                                P(iA, iQ, obj);
                                continue;
                            case 64:
                                long jC23 = C(iU);
                                c0665j.W(5);
                                K0.s(obj, jC23, Integer.valueOf(bVar.u()));
                                P(iA, iQ, obj);
                                continue;
                            case 65:
                                long jC24 = C(iU);
                                c0665j.W(1);
                                K0.s(obj, jC24, Long.valueOf(bVar.v()));
                                P(iA, iQ, obj);
                                continue;
                            case 66:
                                long jC25 = C(iU);
                                c0665j.W(0);
                                K0.s(obj, jC25, Integer.valueOf(bVar.w()));
                                P(iA, iQ, obj);
                                continue;
                            case 67:
                                long jC26 = C(iU);
                                c0665j.W(0);
                                K0.s(obj, jC26, Long.valueOf(bVar.x()));
                                P(iA, iQ, obj);
                                continue;
                            case 68:
                                Object obj5 = (AbstractC0847a) z(iA, iQ, obj);
                                InterfaceC0881r0 interfaceC0881r0Q4 = q(iQ);
                                c0665j.W(3);
                                c0665j.e(obj5, interfaceC0881r0Q4, c0884t);
                                S(obj, iA, iQ, obj5);
                                continue;
                            default:
                                if (b0A == null) {
                                    c0.getClass();
                                    b0A = C0.a(obj);
                                }
                                c0.getClass();
                                if (!C0.c(b0A, c0665j)) {
                                    while (i8 < i7) {
                                        n(iArr[i8], obj, b0A);
                                        i8++;
                                    }
                                    if (b0A == null) {
                                        return;
                                    }
                                }
                                break;
                        }
                    } catch (L unused) {
                        c0.getClass();
                        if (b0A == null) {
                            b0A = C0.a(obj);
                        }
                        if (!C0.c(b0A, c0665j)) {
                            while (i8 < i7) {
                                n(iArr[i8], obj, b0A);
                                i8++;
                            }
                            if (b0A == null) {
                                return;
                            }
                            ((C) obj).unknownFields = b0A;
                        }
                    }
                } else if (iA == Integer.MAX_VALUE) {
                    while (i8 < i7) {
                        n(iArr[i8], obj, b0A);
                        i8++;
                    }
                    if (b0A == null) {
                        return;
                    } else {
                        c0.getClass();
                    }
                } else {
                    c0.getClass();
                    if (b0A == null) {
                        b0A = C0.a(obj);
                    }
                    if (!C0.c(b0A, c0665j)) {
                        while (i8 < i7) {
                            n(iArr[i8], obj, b0A);
                            i8++;
                        }
                        if (b0A == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i8 < i7) {
                    n(iArr[i8], obj, b0A);
                    i8++;
                }
                if (b0A != null) {
                    c0.getClass();
                    ((C) obj).unknownFields = b0A;
                }
                throw th;
            }
        }
        ((C) obj).unknownFields = b0A;
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final int h(C c3) {
        int i7;
        int i8;
        int i9;
        int iA0;
        int iY;
        int i10;
        int iP0;
        int iR0;
        Unsafe unsafe = f12186o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f12187a;
            if (i14 >= iArr.length) {
                this.f12197l.getClass();
                return c3.unknownFields.b() + i15;
            }
            int iU = U(i14);
            int iT = T(iU);
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i11;
            if (iT <= 17) {
                if (i18 != i12) {
                    i13 = i18 == i11 ? 0 : unsafe.getInt(c3, i18);
                    i12 = i18;
                }
                i7 = i12;
                i8 = i13;
                i9 = 1 << (i17 >>> 20);
            } else {
                i7 = i12;
                i8 = i13;
                i9 = 0;
            }
            long j = iU & i11;
            if (iT >= EnumC0889x.f12288b.a()) {
                EnumC0889x.f12289c.a();
            }
            switch (iT) {
                case 0:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.a0(i16);
                        i15 += iA0;
                    }
                    break;
                case 1:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.e0(i16);
                        i15 += iA0;
                    }
                    break;
                case 2:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.i0(i16, unsafe.getLong(c3, j));
                        i15 += iA0;
                    }
                    break;
                case 3:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.s0(i16, unsafe.getLong(c3, j));
                        i15 += iA0;
                    }
                    break;
                case 4:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.g0(i16, unsafe.getInt(c3, j));
                        i15 += iA0;
                    }
                    break;
                case 5:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.d0(i16);
                        i15 += iA0;
                    }
                    break;
                case 6:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.c0(i16);
                        i15 += iA0;
                    }
                    break;
                case 7:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.X(i16);
                        i15 += iA0;
                    }
                    break;
                case 8:
                    if (s(c3, i14, i7, i8, i9)) {
                        Object object = unsafe.getObject(c3, j);
                        iY = object instanceof AbstractC0867k ? AbstractC0879q.Y(i16, (AbstractC0867k) object) : AbstractC0879q.n0(i16, (String) object);
                        i15 = iY + i15;
                    }
                    break;
                case 9:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0883s0.o(i16, unsafe.getObject(c3, j), q(i14));
                        i15 += iA0;
                    }
                    break;
                case 10:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.Y(i16, (AbstractC0867k) unsafe.getObject(c3, j));
                        i15 += iA0;
                    }
                    break;
                case 11:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.q0(i16, unsafe.getInt(c3, j));
                        i15 += iA0;
                    }
                    break;
                case 12:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.b0(i16, unsafe.getInt(c3, j));
                        i15 += iA0;
                    }
                    break;
                case 13:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.j0(i16);
                        i15 += iA0;
                    }
                    break;
                case 14:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.k0(i16);
                        i15 += iA0;
                    }
                    break;
                case 15:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.l0(i16, unsafe.getInt(c3, j));
                        i15 += iA0;
                    }
                    break;
                case 16:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.m0(i16, unsafe.getLong(c3, j));
                        i15 += iA0;
                    }
                    break;
                case 17:
                    if (s(c3, i14, i7, i8, i9)) {
                        iA0 = AbstractC0879q.f0(i16, (AbstractC0847a) unsafe.getObject(c3, j), q(i14));
                        i15 += iA0;
                    }
                    break;
                case 18:
                    iA0 = AbstractC0883s0.h(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 19:
                    iA0 = AbstractC0883s0.f(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 20:
                    iA0 = AbstractC0883s0.m(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    iA0 = AbstractC0883s0.x(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 22:
                    iA0 = AbstractC0883s0.k(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 23:
                    iA0 = AbstractC0883s0.h(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 24:
                    iA0 = AbstractC0883s0.f(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 25:
                    iA0 = AbstractC0883s0.a(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 26:
                    iA0 = AbstractC0883s0.u(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 27:
                    iA0 = AbstractC0883s0.p(i16, (List) unsafe.getObject(c3, j), q(i14));
                    i15 += iA0;
                    break;
                case 28:
                    iA0 = AbstractC0883s0.c(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 29:
                    iA0 = AbstractC0883s0.v(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 30:
                    iA0 = AbstractC0883s0.d(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 31:
                    iA0 = AbstractC0883s0.f(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 32:
                    iA0 = AbstractC0883s0.h(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 33:
                    iA0 = AbstractC0883s0.q(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 34:
                    iA0 = AbstractC0883s0.s(i16, (List) unsafe.getObject(c3, j));
                    i15 += iA0;
                    break;
                case 35:
                    i10 = AbstractC0883s0.i((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 36:
                    i10 = AbstractC0883s0.g((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 37:
                    i10 = AbstractC0883s0.n((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 38:
                    i10 = AbstractC0883s0.y((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 39:
                    i10 = AbstractC0883s0.l((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 40:
                    i10 = AbstractC0883s0.i((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 41:
                    i10 = AbstractC0883s0.g((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 42:
                    i10 = AbstractC0883s0.b((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 43:
                    i10 = AbstractC0883s0.w((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 44:
                    i10 = AbstractC0883s0.e((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 45:
                    i10 = AbstractC0883s0.g((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 46:
                    i10 = AbstractC0883s0.i((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 47:
                    i10 = AbstractC0883s0.r((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 48:
                    i10 = AbstractC0883s0.t((List) unsafe.getObject(c3, j));
                    if (i10 > 0) {
                        iP0 = AbstractC0879q.p0(i16);
                        iR0 = AbstractC0879q.r0(i10);
                        i15 += iR0 + iP0 + i10;
                    }
                    break;
                case 49:
                    iA0 = AbstractC0883s0.j(i16, (List) unsafe.getObject(c3, j), q(i14));
                    i15 += iA0;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(c3, j);
                    Object objP = p(i14);
                    this.f12198m.getClass();
                    iA0 = C0850b0.c(i16, object2, objP);
                    i15 += iA0;
                    break;
                case 51:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.a0(i16);
                        i15 += iA0;
                    }
                    break;
                case 52:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.e0(i16);
                        i15 += iA0;
                    }
                    break;
                case 53:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.i0(i16, E(j, c3));
                        i15 += iA0;
                    }
                    break;
                case 54:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.s0(i16, E(j, c3));
                        i15 += iA0;
                    }
                    break;
                case 55:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.g0(i16, D(j, c3));
                        i15 += iA0;
                    }
                    break;
                case 56:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.d0(i16);
                        i15 += iA0;
                    }
                    break;
                case 57:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.c0(i16);
                        i15 += iA0;
                    }
                    break;
                case 58:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.X(i16);
                        i15 += iA0;
                    }
                    break;
                case 59:
                    if (u(i16, i14, c3)) {
                        Object object3 = unsafe.getObject(c3, j);
                        iY = object3 instanceof AbstractC0867k ? AbstractC0879q.Y(i16, (AbstractC0867k) object3) : AbstractC0879q.n0(i16, (String) object3);
                        i15 = iY + i15;
                    }
                    break;
                case 60:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0883s0.o(i16, unsafe.getObject(c3, j), q(i14));
                        i15 += iA0;
                    }
                    break;
                case 61:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.Y(i16, (AbstractC0867k) unsafe.getObject(c3, j));
                        i15 += iA0;
                    }
                    break;
                case 62:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.q0(i16, D(j, c3));
                        i15 += iA0;
                    }
                    break;
                case 63:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.b0(i16, D(j, c3));
                        i15 += iA0;
                    }
                    break;
                case 64:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.j0(i16);
                        i15 += iA0;
                    }
                    break;
                case 65:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.k0(i16);
                        i15 += iA0;
                    }
                    break;
                case 66:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.l0(i16, D(j, c3));
                        i15 += iA0;
                    }
                    break;
                case 67:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.m0(i16, E(j, c3));
                        i15 += iA0;
                    }
                    break;
                case 68:
                    if (u(i16, i14, c3)) {
                        iA0 = AbstractC0879q.f0(i16, (AbstractC0847a) unsafe.getObject(c3, j), q(i14));
                        i15 += iA0;
                    }
                    break;
            }
            i14 += 3;
            i12 = i7;
            i13 = i8;
            i11 = 1048575;
        }
    }

    @Override // com.google.protobuf.InterfaceC0881r0
    public final void i(Object obj, byte[] bArr, int i7, int i8, C0824d c0824d) {
        G(obj, bArr, i7, i8, 0, c0824d);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.protobuf.InterfaceC0881r0
    public final boolean j(C c3, Object obj) {
        int[] iArr = this.f12187a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean zB = true;
            if (i7 >= length) {
                this.f12197l.getClass();
                return c3.unknownFields.equals(((C) obj).unknownFields);
            }
            int iU = U(i7);
            long j = iU & 1048575;
            switch (T(iU)) {
                case 0:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j3 = K0.f12117c;
                        if (Double.doubleToLongBits(j3.g(j, c3)) != Double.doubleToLongBits(j3.g(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 1:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j7 = K0.f12117c;
                        if (Float.floatToIntBits(j7.h(j, c3)) != Float.floatToIntBits(j7.h(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 2:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j8 = K0.f12117c;
                        if (j8.j(j, c3) != j8.j(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 3:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j9 = K0.f12117c;
                        if (j9.j(j, c3) != j9.j(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 4:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j10 = K0.f12117c;
                        if (j10.i(j, c3) != j10.i(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 5:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j11 = K0.f12117c;
                        if (j11.j(j, c3) != j11.j(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 6:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j12 = K0.f12117c;
                        if (j12.i(j, c3) != j12.i(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 7:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j13 = K0.f12117c;
                        if (j13.d(j, c3) != j13.d(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 8:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j14 = K0.f12117c;
                        if (!AbstractC0883s0.B(j14.k(j, c3), j14.k(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 9:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j15 = K0.f12117c;
                        if (!AbstractC0883s0.B(j15.k(j, c3), j15.k(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 10:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j16 = K0.f12117c;
                        if (!AbstractC0883s0.B(j16.k(j, c3), j16.k(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 11:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j17 = K0.f12117c;
                        if (j17.i(j, c3) != j17.i(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 12:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j18 = K0.f12117c;
                        if (j18.i(j, c3) != j18.i(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 13:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j19 = K0.f12117c;
                        if (j19.i(j, c3) != j19.i(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 14:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j20 = K0.f12117c;
                        if (j20.j(j, c3) != j20.j(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 15:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j21 = K0.f12117c;
                        if (j21.i(j, c3) != j21.i(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 16:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j22 = K0.f12117c;
                        if (j22.j(j, c3) != j22.j(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 17:
                    if (!k(c3, obj, i7)) {
                        zB = false;
                    } else {
                        J0 j23 = K0.f12117c;
                        if (!AbstractC0883s0.B(j23.k(j, c3), j23.k(j, obj))) {
                            zB = false;
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
                    J0 j24 = K0.f12117c;
                    zB = AbstractC0883s0.B(j24.k(j, c3), j24.k(j, obj));
                    break;
                case 50:
                    J0 j25 = K0.f12117c;
                    zB = AbstractC0883s0.B(j25.k(j, c3), j25.k(j, obj));
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
                    long j26 = iArr[i7 + 2] & 1048575;
                    J0 j27 = K0.f12117c;
                    if (j27.i(j26, c3) != j27.i(j26, obj) || !AbstractC0883s0.B(j27.k(j, c3), j27.k(j, obj))) {
                        zB = false;
                    }
                    break;
            }
            if (!zB) {
                return false;
            }
            i7 += 3;
        }
    }

    public final boolean k(C c3, Object obj, int i7) {
        return r(i7, c3) == r(i7, obj);
    }

    public final void n(int i7, Object obj, Object obj2) {
        int i8 = this.f12187a[i7];
        if (K0.f12117c.k(U(i7) & 1048575, obj) == null) {
            return;
        }
        o(i7);
    }

    public final void o(int i7) {
        if (this.f12188b[AbstractC0486a1.d(i7, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final Object p(int i7) {
        return this.f12188b[(i7 / 3) * 2];
    }

    public final InterfaceC0881r0 q(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f12188b;
        InterfaceC0881r0 interfaceC0881r0 = (InterfaceC0881r0) objArr[i8];
        if (interfaceC0881r0 != null) {
            return interfaceC0881r0;
        }
        InterfaceC0881r0 interfaceC0881r0A = C0872m0.f12232c.a((Class) objArr[i8 + 1]);
        objArr[i8] = interfaceC0881r0A;
        return interfaceC0881r0A;
    }

    public final boolean r(int i7, Object obj) {
        int i8 = this.f12187a[i7 + 2];
        long j = i8 & 1048575;
        if (j != 1048575) {
            return ((1 << (i8 >>> 20)) & K0.f12117c.i(j, obj)) != 0;
        }
        int iU = U(i7);
        long j3 = iU & 1048575;
        switch (T(iU)) {
            case 0:
                return Double.doubleToRawLongBits(K0.f12117c.g(j3, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(K0.f12117c.h(j3, obj)) != 0;
            case 2:
                return K0.f12117c.j(j3, obj) != 0;
            case 3:
                return K0.f12117c.j(j3, obj) != 0;
            case 4:
                return K0.f12117c.i(j3, obj) != 0;
            case 5:
                return K0.f12117c.j(j3, obj) != 0;
            case 6:
                return K0.f12117c.i(j3, obj) != 0;
            case 7:
                return K0.f12117c.d(j3, obj);
            case 8:
                Object objK = K0.f12117c.k(j3, obj);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof AbstractC0867k) {
                    return !AbstractC0867k.f12212b.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return K0.f12117c.k(j3, obj) != null;
            case 10:
                return !AbstractC0867k.f12212b.equals(K0.f12117c.k(j3, obj));
            case 11:
                return K0.f12117c.i(j3, obj) != 0;
            case 12:
                return K0.f12117c.i(j3, obj) != 0;
            case 13:
                return K0.f12117c.i(j3, obj) != 0;
            case 14:
                return K0.f12117c.j(j3, obj) != 0;
            case 15:
                return K0.f12117c.i(j3, obj) != 0;
            case 16:
                return K0.f12117c.j(j3, obj) != 0;
            case 17:
                return K0.f12117c.k(j3, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return r(i7, obj);
        }
        return (i9 & i10) != 0;
    }

    public final boolean u(int i7, int i8, Object obj) {
        return K0.f12117c.i((long) (this.f12187a[i8 + 2] & 1048575), obj) == i7;
    }

    public final void v(Object obj, int i7, Object obj2, C0884t c0884t, C0665j c0665j) throws com.google.crypto.tink.shaded.protobuf.B, L, C0678x {
        long jU = U(i7) & 1048575;
        Object objK = K0.f12117c.k(jU, obj);
        C0850b0 c0850b0 = this.f12198m;
        if (objK == null) {
            c0850b0.getClass();
            objK = C0848a0.f12174b.c();
            K0.s(obj, jU, objK);
        } else {
            c0850b0.getClass();
            if (C0850b0.d(objK)) {
                C0848a0 c0848a0C = C0848a0.f12174b.c();
                C0850b0.e(c0848a0C, objK);
                K0.s(obj, jU, c0848a0C);
                objK = c0848a0C;
            }
        }
        c0850b0.getClass();
        C0848a0 c0848a0 = (C0848a0) objK;
        Y y4 = ((Z) obj2).f12172a;
        c0665j.W(2);
        H6.b bVar = (H6.b) c0665j.f9213e;
        int i8 = bVar.i(bVar.B());
        Object objW = "";
        Object obj3 = y4.f12171c;
        Object objW2 = obj3;
        while (true) {
            try {
                int iA = c0665j.a();
                if (iA == Integer.MAX_VALUE || bVar.f()) {
                    break;
                }
                if (iA == 1) {
                    objW = c0665j.w(y4.f12169a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!c0665j.X()) {
                            throw new M("Unable to parse map entry.");
                        }
                    } catch (L unused) {
                        if (!c0665j.X()) {
                            throw new M("Unable to parse map entry.");
                        }
                    }
                } else {
                    objW2 = c0665j.w(y4.f12170b, obj3.getClass(), c0884t);
                }
            } catch (Throwable th) {
                bVar.h(i8);
                throw th;
            }
        }
        c0848a0.put(objW, objW2);
        bVar.h(i8);
    }

    public final void w(int i7, Object obj, Object obj2) {
        if (r(i7, obj2)) {
            long jU = U(i7) & 1048575;
            Unsafe unsafe = f12186o;
            Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f12187a[i7] + " is present but null: " + obj2);
            }
            InterfaceC0881r0 interfaceC0881r0Q = q(i7);
            if (!r(i7, obj)) {
                if (t(object)) {
                    C cD = interfaceC0881r0Q.d();
                    interfaceC0881r0Q.a(cD, object);
                    unsafe.putObject(obj, jU, cD);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                O(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jU);
            if (!t(object2)) {
                C cD2 = interfaceC0881r0Q.d();
                interfaceC0881r0Q.a(cD2, object2);
                unsafe.putObject(obj, jU, cD2);
                object2 = cD2;
            }
            interfaceC0881r0Q.a(object2, object);
        }
    }

    public final void x(int i7, Object obj, Object obj2) {
        int[] iArr = this.f12187a;
        int i8 = iArr[i7];
        if (u(i8, i7, obj2)) {
            long jU = U(i7) & 1048575;
            Unsafe unsafe = f12186o;
            Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            InterfaceC0881r0 interfaceC0881r0Q = q(i7);
            if (!u(i8, i7, obj)) {
                if (t(object)) {
                    C cD = interfaceC0881r0Q.d();
                    interfaceC0881r0Q.a(cD, object);
                    unsafe.putObject(obj, jU, cD);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                P(i8, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jU);
            if (!t(object2)) {
                C cD2 = interfaceC0881r0Q.d();
                interfaceC0881r0Q.a(cD2, object2);
                unsafe.putObject(obj, jU, cD2);
                object2 = cD2;
            }
            interfaceC0881r0Q.a(object2, object);
        }
    }

    public final Object y(int i7, Object obj) {
        InterfaceC0881r0 interfaceC0881r0Q = q(i7);
        long jU = U(i7) & 1048575;
        if (!r(i7, obj)) {
            return interfaceC0881r0Q.d();
        }
        Object object = f12186o.getObject(obj, jU);
        if (t(object)) {
            return object;
        }
        C cD = interfaceC0881r0Q.d();
        if (object != null) {
            interfaceC0881r0Q.a(cD, object);
        }
        return cD;
    }

    public final Object z(int i7, int i8, Object obj) {
        InterfaceC0881r0 interfaceC0881r0Q = q(i8);
        if (!u(i7, i8, obj)) {
            return interfaceC0881r0Q.d();
        }
        Object object = f12186o.getObject(obj, U(i8) & 1048575);
        if (t(object)) {
            return object;
        }
        C cD = interfaceC0881r0Q.d();
        if (object != null) {
            interfaceC0881r0Q.a(cD, object);
        }
        return cD;
    }
}
