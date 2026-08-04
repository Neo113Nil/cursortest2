package androidx.datastore.preferences.protobuf;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.ads.zzbbd;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class L implements U {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f9117n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f9118o = h0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f9120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0656a f9123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f9125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9127i;
    public final N j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A f9128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f9129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final H f9130m;

    public L(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0656a abstractC0656a, int[] iArr2, int i9, int i10, N n2, A a2, c0 c0Var, C0669n c0669n, H h6) {
        this.f9119a = iArr;
        this.f9120b = objArr;
        this.f9121c = i7;
        this.f9122d = i8;
        this.f9124f = abstractC0656a instanceof AbstractC0675u;
        this.f9125g = iArr2;
        this.f9126h = i9;
        this.f9127i = i10;
        this.j = n2;
        this.f9128k = a2;
        this.f9129l = c0Var;
        this.f9123e = abstractC0656a;
        this.f9130m = h6;
    }

    public static long A(long j, Object obj) {
        return ((Long) h0.f9196c.h(j, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
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

    public static int L(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0675u) {
            return ((AbstractC0675u) obj).i();
        }
        return true;
    }

    public static L x(T t7, N n2, A a2, c0 c0Var, C0669n c0669n, H h6) {
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
        Field fieldG;
        int i27;
        char cCharAt9;
        int i28;
        int i29;
        Field fieldG2;
        Field fieldG3;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        int i33;
        char cCharAt13;
        String strC = t7.c();
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
            iArr = f9117n;
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
        Unsafe unsafe = f9118o;
        Object[] objArrB = t7.b();
        Class<?> cls = t7.a().getClass();
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
                } else if (p136t.e.b(t7.d(), 1) || (iCharAt11 & 2048) != 0) {
                    i29 = 2;
                    objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i10];
                    i10++;
                } else {
                    i29 = 2;
                }
                int i84 = iCharAt12 * i29;
                Object obj = objArrB[i84];
                if (obj instanceof Field) {
                    fieldG2 = (Field) obj;
                } else {
                    fieldG2 = G(cls, (String) obj);
                    objArrB[i84] = fieldG2;
                }
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldG2);
                int i85 = i84 + 1;
                Object obj2 = objArrB[i85];
                if (obj2 instanceof Field) {
                    fieldG3 = (Field) obj2;
                } else {
                    fieldG3 = G(cls, (String) obj2);
                    objArrB[i85] = fieldG3;
                }
                iCharAt10 = iCharAt10;
                iArr2 = iArr2;
                iArr = iArr;
                i36 = i83;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG3);
                i26 = 0;
            } else {
                i9 = i9;
                int i86 = i10 + 1;
                Field fieldG4 = G(cls, (String) objArrB[i10]);
                if (i77 == 9 || i77 == 17) {
                    iCharAt10 = iCharAt10;
                    iArr2 = iArr2;
                    objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = fieldG4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        iCharAt10 = iCharAt10;
                        i28 = i10 + 2;
                        objArr[AbstractC0486a1.d(i67, 3, 2, 1)] = objArrB[i86];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        iCharAt10 = iCharAt10;
                        if (t7.d() == 1 || (iCharAt11 & 2048) != 0) {
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
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldG4);
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
                        fieldG = (Field) obj3;
                    } else {
                        fieldG = G(cls, (String) obj3);
                        objArrB[i92] = fieldG;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG);
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
        return new L(iArr2, objArr, i9, i12, t7.a(), iArr, i11, i64, n2, a2, c0Var, c0669n, h6);
    }

    public static long y(int i7) {
        return i7 & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) h0.f9196c.h(j, obj)).intValue();
    }

    public final int B(int i7) {
        if (i7 < this.f9121c || i7 > this.f9122d) {
            return -1;
        }
        int[] iArr = this.f9119a;
        int length = (iArr.length / 3) - 1;
        int i8 = 0;
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

    public final void C(Object obj, long j, C0665j c0665j, U u4, C0668m c0668m) throws C0678x {
        int iC;
        this.f9128k.getClass();
        InterfaceC0676v interfaceC0676vB = A.b(j, obj);
        int i7 = c0665j.f9210b;
        if ((i7 & 7) != 3) {
            throw C0679y.b();
        }
        do {
            AbstractC0675u abstractC0675uD = u4.d();
            c0665j.c(abstractC0675uD, u4, c0668m);
            u4.b(abstractC0675uD);
            ((S) interfaceC0676vB).add(abstractC0675uD);
            L3.e eVar = (L3.e) c0665j.f9213e;
            if (eVar.g() || c0665j.f9212d != 0) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == i7);
        c0665j.f9212d = iC;
    }

    public final void D(Object obj, int i7, C0665j c0665j, U u4, C0668m c0668m) throws C0679y {
        int iC;
        this.f9128k.getClass();
        InterfaceC0676v interfaceC0676vB = A.b(i7 & 1048575, obj);
        int i8 = c0665j.f9210b;
        if ((i8 & 7) != 2) {
            throw C0679y.b();
        }
        do {
            AbstractC0675u abstractC0675uD = u4.d();
            c0665j.f(abstractC0675uD, u4, c0668m);
            u4.b(abstractC0675uD);
            ((S) interfaceC0676vB).add(abstractC0675uD);
            L3.e eVar = (L3.e) c0665j.f9213e;
            if (eVar.g() || c0665j.f9212d != 0) {
                return;
            } else {
                iC = eVar.C();
            }
        } while (iC == i8);
        c0665j.f9212d = iC;
    }

    public final void E(int i7, C0665j c0665j, Object obj) throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L, C0678x {
        if ((536870912 & i7) != 0) {
            c0665j.W(2);
            h0.o(obj, i7 & 1048575, ((L3.e) c0665j.f9213e).B());
        } else if (!this.f9124f) {
            h0.o(obj, i7 & 1048575, c0665j.m());
        } else {
            c0665j.W(2);
            h0.o(obj, i7 & 1048575, ((L3.e) c0665j.f9213e).A());
        }
    }

    public final void F(int i7, C0665j c0665j, Object obj) throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L, C0678x {
        boolean z4 = (536870912 & i7) != 0;
        A a2 = this.f9128k;
        if (z4) {
            a2.getClass();
            c0665j.P(A.b(i7 & 1048575, obj), true);
        } else {
            a2.getClass();
            c0665j.P(A.b(i7 & 1048575, obj), false);
        }
    }

    public final void H(int i7, Object obj) {
        int i8 = this.f9119a[i7 + 2];
        long j = 1048575 & i8;
        if (j == 1048575) {
            return;
        }
        h0.m(j, obj, (1 << (i8 >>> 20)) | h0.f9196c.f(j, obj));
    }

    public final void I(int i7, int i8, Object obj) {
        h0.m(this.f9119a[i8 + 2] & 1048575, obj, i7);
    }

    public final void J(Object obj, int i7, AbstractC0656a abstractC0656a) {
        f9118o.putObject(obj, M(i7) & 1048575, abstractC0656a);
        H(i7, obj);
    }

    public final void K(Object obj, int i7, int i8, AbstractC0656a abstractC0656a) {
        f9118o.putObject(obj, M(i8) & 1048575, abstractC0656a);
        I(i7, i8, obj);
    }

    public final int M(int i7) {
        return this.f9119a[i7 + 1];
    }

    public final void N(Object obj, D d7) throws Z4.b {
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.f9119a;
        int length = iArr.length;
        Unsafe unsafe = f9118o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            int iM = M(i14);
            int i15 = iArr[i14];
            int iL = L(iM);
            if (iL <= 17) {
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
            long j = iM & i11;
            switch (iL) {
                case 0:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.c(i15, h0.f9196c.d(j, obj));
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 1:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.g(h0.f9196c.e(j, obj), i15);
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.j(i15, unsafe.getLong(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.q(i15, unsafe.getLong(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.i(i15, unsafe.getInt(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.f(i15, unsafe.getLong(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.e(i15, unsafe.getInt(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.a(i15, h0.f9196c.c(j, obj));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C0666k) d7.f9107a).c1(i15, (String) object);
                        } else {
                            d7.b(i15, (C0662g) object);
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.k(i15, unsafe.getObject(obj, j), m(i14));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.b(i15, (C0662g) unsafe.getObject(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.p(i15, unsafe.getInt(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.d(i15, unsafe.getInt(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.l(i15, unsafe.getInt(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.m(i15, unsafe.getLong(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.n(i15, unsafe.getInt(obj, j));
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
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.o(i15, unsafe.getLong(obj, j));
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
                    if (o(obj, i14, i7, i8, i9)) {
                        d7.h(i15, unsafe.getObject(obj, j), m(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i10;
                    i13 = i8;
                    i11 = 1048575;
                    break;
                case 18:
                    V.E(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 19:
                    V.I(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 20:
                    V.L(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    V.T(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 22:
                    V.K(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 23:
                    V.H(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 24:
                    V.G(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 25:
                    V.C(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 26:
                    V.R(iArr[i14], (List) unsafe.getObject(obj, j), d7);
                    break;
                case 27:
                    V.M(iArr[i14], (List) unsafe.getObject(obj, j), d7, m(i14));
                    break;
                case 28:
                    V.D(iArr[i14], (List) unsafe.getObject(obj, j), d7);
                    break;
                case 29:
                    V.S(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 30:
                    V.F(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 31:
                    V.N(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 32:
                    V.O(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 33:
                    V.P(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 34:
                    V.Q(iArr[i14], (List) unsafe.getObject(obj, j), d7, false);
                    break;
                case 35:
                    V.E(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 36:
                    V.I(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 37:
                    V.L(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 38:
                    V.T(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 39:
                    V.K(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 40:
                    V.H(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 41:
                    V.G(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 42:
                    V.C(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 43:
                    V.S(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 44:
                    V.F(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 45:
                    V.N(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 46:
                    V.O(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 47:
                    V.P(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 48:
                    V.Q(iArr[i14], (List) unsafe.getObject(obj, j), d7, true);
                    break;
                case 49:
                    V.J(iArr[i14], (List) unsafe.getObject(obj, j), d7, m(i14));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i18 = 2;
                        Object obj2 = this.f9120b[(i14 / 3) * 2];
                        this.f9130m.getClass();
                        E e7 = ((F) obj2).f9111a;
                        C0666k c0666k = (C0666k) d7.f9107a;
                        c0666k.getClass();
                        for (Map.Entry entry : ((G) object2).entrySet()) {
                            c0666k.e1(i15, i18);
                            c0666k.g1(F.a(e7, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0671p.b(c0666k, e7.f9108a, 1, key);
                            C0671p.b(c0666k, e7.f9109b, 2, value);
                            i18 = 2;
                        }
                    }
                    break;
                case 51:
                    if (q(i15, i14, obj)) {
                        d7.c(i15, ((Double) h0.f9196c.h(j, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (q(i15, i14, obj)) {
                        d7.g(((Float) h0.f9196c.h(j, obj)).floatValue(), i15);
                    }
                    break;
                case 53:
                    if (q(i15, i14, obj)) {
                        d7.j(i15, A(j, obj));
                    }
                    break;
                case 54:
                    if (q(i15, i14, obj)) {
                        d7.q(i15, A(j, obj));
                    }
                    break;
                case 55:
                    if (q(i15, i14, obj)) {
                        d7.i(i15, z(j, obj));
                    }
                    break;
                case 56:
                    if (q(i15, i14, obj)) {
                        d7.f(i15, A(j, obj));
                    }
                    break;
                case 57:
                    if (q(i15, i14, obj)) {
                        d7.e(i15, z(j, obj));
                    }
                    break;
                case 58:
                    if (q(i15, i14, obj)) {
                        d7.a(i15, ((Boolean) h0.f9196c.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (q(i15, i14, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((C0666k) d7.f9107a).c1(i15, (String) object3);
                        } else {
                            d7.b(i15, (C0662g) object3);
                        }
                    }
                    break;
                case 60:
                    if (q(i15, i14, obj)) {
                        d7.k(i15, unsafe.getObject(obj, j), m(i14));
                    }
                    break;
                case 61:
                    if (q(i15, i14, obj)) {
                        d7.b(i15, (C0662g) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (q(i15, i14, obj)) {
                        d7.p(i15, z(j, obj));
                    }
                    break;
                case 63:
                    if (q(i15, i14, obj)) {
                        d7.d(i15, z(j, obj));
                    }
                    break;
                case 64:
                    if (q(i15, i14, obj)) {
                        d7.l(i15, z(j, obj));
                    }
                    break;
                case 65:
                    if (q(i15, i14, obj)) {
                        d7.m(i15, A(j, obj));
                    }
                    break;
                case 66:
                    if (q(i15, i14, obj)) {
                        d7.n(i15, z(j, obj));
                    }
                    break;
                case 67:
                    if (q(i15, i14, obj)) {
                        d7.o(i15, A(j, obj));
                    }
                    break;
                case 68:
                    if (q(i15, i14, obj)) {
                        d7.h(i15, unsafe.getObject(obj, j), m(i14));
                    }
                    break;
            }
            i10 = i7;
            i14 += 3;
            i12 = i10;
            i13 = i8;
            i11 = 1048575;
        }
        this.f9129l.getClass();
        ((AbstractC0675u) obj).unknownFields.d(d7);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void a(Object obj, Object obj2) {
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f9119a;
            if (i7 >= iArr.length) {
                V.A(this.f9129l, obj, obj2);
                return;
            }
            int iM = M(i7);
            long j = 1048575 & iM;
            int i8 = iArr[i7];
            switch (L(iM)) {
                case 0:
                    if (n(i7, obj2)) {
                        g0 g0Var = h0.f9196c;
                        g0Var.l(obj, j, g0Var.d(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 1:
                    if (n(i7, obj2)) {
                        g0 g0Var2 = h0.f9196c;
                        g0Var2.m(obj, j, g0Var2.e(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 2:
                    if (n(i7, obj2)) {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 3:
                    if (n(i7, obj2)) {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 4:
                    if (n(i7, obj2)) {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 5:
                    if (n(i7, obj2)) {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 6:
                    if (n(i7, obj2)) {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 7:
                    if (n(i7, obj2)) {
                        g0 g0Var3 = h0.f9196c;
                        g0Var3.j(obj, j, g0Var3.c(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 8:
                    if (n(i7, obj2)) {
                        h0.o(obj, j, h0.f9196c.h(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 9:
                    t(i7, obj, obj2);
                    break;
                case 10:
                    if (n(i7, obj2)) {
                        h0.o(obj, j, h0.f9196c.h(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 11:
                    if (n(i7, obj2)) {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 12:
                    if (n(i7, obj2)) {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 13:
                    if (n(i7, obj2)) {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 14:
                    if (n(i7, obj2)) {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 15:
                    if (n(i7, obj2)) {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 16:
                    if (n(i7, obj2)) {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                    }
                    break;
                case 17:
                    t(i7, obj, obj2);
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
                    this.f9128k.getClass();
                    g0 g0Var4 = h0.f9196c;
                    InterfaceC0676v interfaceC0676vT = (InterfaceC0676v) g0Var4.h(j, obj);
                    InterfaceC0676v interfaceC0676v = (InterfaceC0676v) g0Var4.h(j, obj2);
                    S s7 = (S) interfaceC0676vT;
                    int i9 = s7.f9141c;
                    int i10 = ((S) interfaceC0676v).f9141c;
                    if (i9 > 0 && i10 > 0) {
                        if (!((AbstractC0657b) interfaceC0676vT).f9165a) {
                            interfaceC0676vT = s7.t(i10 + i9);
                        }
                        ((AbstractC0657b) interfaceC0676vT).addAll(interfaceC0676v);
                    }
                    if (i9 > 0) {
                        interfaceC0676v = interfaceC0676vT;
                    }
                    h0.o(obj, j, interfaceC0676v);
                    break;
                case 50:
                    Class cls = V.f9146a;
                    g0 g0Var5 = h0.f9196c;
                    Object objH = g0Var5.h(j, obj);
                    Object objH2 = g0Var5.h(j, obj2);
                    this.f9130m.getClass();
                    h0.o(obj, j, H.b(objH, objH2));
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
                    if (q(i8, i7, obj2)) {
                        h0.o(obj, j, h0.f9196c.h(j, obj2));
                        I(i8, i7, obj);
                    }
                    break;
                case 60:
                    u(i7, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i8, i7, obj2)) {
                        h0.o(obj, j, h0.f9196c.h(j, obj2));
                        I(i8, i7, obj);
                    }
                    break;
                case 68:
                    u(i7, obj, obj2);
                    break;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.U
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0675u) {
                AbstractC0675u abstractC0675u = (AbstractC0675u) obj;
                abstractC0675u.d();
                abstractC0675u.c();
                abstractC0675u.j();
            }
            int[] iArr = this.f9119a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int iM = M(i7);
                long j = 1048575 & iM;
                int iL = L(iM);
                if (iL != 9) {
                    if (iL != 60 && iL != 68) {
                        switch (iL) {
                            case 17:
                                if (n(i7, obj)) {
                                    m(i7).b(f9118o.getObject(obj, j));
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
                                this.f9128k.getClass();
                                A.a(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f9118o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f9130m.getClass();
                                    H.c(object);
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i7], i7, obj)) {
                        m(i7).b(f9118o.getObject(obj, j));
                    }
                } else if (n(i7, obj)) {
                    m(i7).b(f9118o.getObject(obj, j));
                }
            }
            this.f9129l.getClass();
            c0.b(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105 A[LOOP:2: B:55:0x00f4->B:60:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x012b A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean c(Object obj) {
        int i7;
        int i8;
        List list;
        U uM;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f9126h) {
            int i13 = this.f9125g[i12];
            int[] iArr = this.f9119a;
            int i14 = iArr[i13];
            int iM = M(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f9118o.getInt(obj, i16);
                }
                i8 = i11;
                i7 = i16;
            } else {
                i7 = i10;
                i8 = i11;
            }
            if ((268435456 & iM) != 0 && !o(obj, i13, i7, i8, i17)) {
                return false;
            }
            int iL = L(iM);
            if (iL == 9 || iL == 17) {
                if (o(obj, i13, i7, i8, i17)) {
                    if (!m(i13).c(h0.f9196c.h(iM & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iL == 27) {
                list = (List) h0.f9196c.h(iM & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    uM = m(i13);
                    for (i9 = 0; i9 < list.size(); i9++) {
                        if (!uM.c(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iL == 60 || iL == 68) {
                if (q(i14, i13, obj)) {
                    if (!m(i13).c(h0.f9196c.h(iM & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iL == 49) {
                list = (List) h0.f9196c.h(iM & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    uM = m(i13);
                    while (i9 < list.size()) {
                        if (!uM.c(list.get(i9))) {
                            return false;
                        }
                    }
                }
            } else if (iL != 50) {
                continue;
            } else {
                Object objH = h0.f9196c.h(iM & 1048575, obj);
                this.f9130m.getClass();
                G g3 = (G) objH;
                if (g3.isEmpty()) {
                    continue;
                } else {
                    if (((F) this.f9120b[(i13 / 3) * 2]).f9111a.f9109b.f9234a != q0.MESSAGE) {
                        continue;
                    } else {
                        U uA = null;
                        for (Object obj2 : g3.values()) {
                            if (uA == null) {
                                uA = Q.f9136c.a(obj2.getClass());
                            }
                            if (!uA.c(obj2)) {
                                return false;
                            }
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

    @Override // androidx.datastore.preferences.protobuf.U
    public final AbstractC0675u d() {
        this.j.getClass();
        return ((AbstractC0675u) this.f9123e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void e(Object obj, D d7) throws Z4.b {
        d7.getClass();
        N(obj, d7);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int f(AbstractC0675u abstractC0675u) {
        int i7;
        int i8;
        int i9;
        int iW0;
        int iV0;
        int i10;
        int iK0;
        int iM0;
        Unsafe unsafe = f9118o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f9119a;
            if (i14 >= iArr.length) {
                this.f9129l.getClass();
                return abstractC0675u.unknownFields.b() + i15;
            }
            int iM = M(i14);
            int iL = L(iM);
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i11;
            if (iL <= 17) {
                if (i18 != i12) {
                    i13 = i18 == i11 ? 0 : unsafe.getInt(abstractC0675u, i18);
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
            long j = iM & i11;
            if (iL >= EnumC0672q.f9236b.a()) {
                EnumC0672q.f9237c.a();
            }
            switch (iL) {
                case 0:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.w0(i16);
                        i15 += iW0;
                    }
                    break;
                case 1:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.A0(i16);
                        i15 += iW0;
                    }
                    break;
                case 2:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.D0(i16, unsafe.getLong(abstractC0675u, j));
                        i15 += iW0;
                    }
                    break;
                case 3:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.N0(i16, unsafe.getLong(abstractC0675u, j));
                        i15 += iW0;
                    }
                    break;
                case 4:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.C0(i16, unsafe.getInt(abstractC0675u, j));
                        i15 += iW0;
                    }
                    break;
                case 5:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.z0(i16);
                        i15 += iW0;
                    }
                    break;
                case 6:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.y0(i16);
                        i15 += iW0;
                    }
                    break;
                case 7:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.u0(i16);
                        i15 += iW0;
                    }
                    break;
                case 8:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        Object object = unsafe.getObject(abstractC0675u, j);
                        iV0 = object instanceof C0662g ? C0666k.v0(i16, (C0662g) object) : C0666k.I0(i16, (String) object);
                        i15 = iV0 + i15;
                    }
                    break;
                case 9:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = V.o(i16, unsafe.getObject(abstractC0675u, j), m(i14));
                        i15 += iW0;
                    }
                    break;
                case 10:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.v0(i16, (C0662g) unsafe.getObject(abstractC0675u, j));
                        i15 += iW0;
                    }
                    break;
                case 11:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.L0(i16, unsafe.getInt(abstractC0675u, j));
                        i15 += iW0;
                    }
                    break;
                case 12:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.x0(i16, unsafe.getInt(abstractC0675u, j));
                        i15 += iW0;
                    }
                    break;
                case 13:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.E0(i16);
                        i15 += iW0;
                    }
                    break;
                case 14:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.F0(i16);
                        i15 += iW0;
                    }
                    break;
                case 15:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.G0(i16, unsafe.getInt(abstractC0675u, j));
                        i15 += iW0;
                    }
                    break;
                case 16:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.H0(i16, unsafe.getLong(abstractC0675u, j));
                        i15 += iW0;
                    }
                    break;
                case 17:
                    if (o(abstractC0675u, i14, i7, i8, i9)) {
                        iW0 = C0666k.B0(i16, (AbstractC0656a) unsafe.getObject(abstractC0675u, j), m(i14));
                        i15 += iW0;
                    }
                    break;
                case 18:
                    iW0 = V.h(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 19:
                    iW0 = V.f(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 20:
                    iW0 = V.m(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    iW0 = V.x(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 22:
                    iW0 = V.k(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 23:
                    iW0 = V.h(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 24:
                    iW0 = V.f(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 25:
                    iW0 = V.a(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 26:
                    iW0 = V.u(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 27:
                    iW0 = V.p(i16, (List) unsafe.getObject(abstractC0675u, j), m(i14));
                    i15 += iW0;
                    break;
                case 28:
                    iW0 = V.c(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 29:
                    iW0 = V.v(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 30:
                    iW0 = V.d(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 31:
                    iW0 = V.f(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 32:
                    iW0 = V.h(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 33:
                    iW0 = V.q(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 34:
                    iW0 = V.s(i16, (List) unsafe.getObject(abstractC0675u, j));
                    i15 += iW0;
                    break;
                case 35:
                    i10 = V.i((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 36:
                    i10 = V.g((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 37:
                    i10 = V.n((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 38:
                    i10 = V.y((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 39:
                    i10 = V.l((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 40:
                    i10 = V.i((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 41:
                    i10 = V.g((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 42:
                    i10 = V.b((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 43:
                    i10 = V.w((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 44:
                    i10 = V.e((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 45:
                    i10 = V.g((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 46:
                    i10 = V.i((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 47:
                    i10 = V.r((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 48:
                    i10 = V.t((List) unsafe.getObject(abstractC0675u, j));
                    if (i10 > 0) {
                        iK0 = C0666k.K0(i16);
                        iM0 = C0666k.M0(i10);
                        i15 += iM0 + iK0 + i10;
                    }
                    break;
                case 49:
                    iW0 = V.j(i16, (List) unsafe.getObject(abstractC0675u, j), m(i14));
                    i15 += iW0;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0675u, j);
                    Object obj = this.f9120b[(i14 / 3) * 2];
                    this.f9130m.getClass();
                    iW0 = H.a(i16, object2, obj);
                    i15 += iW0;
                    break;
                case 51:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.w0(i16);
                        i15 += iW0;
                    }
                    break;
                case 52:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.A0(i16);
                        i15 += iW0;
                    }
                    break;
                case 53:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.D0(i16, A(j, abstractC0675u));
                        i15 += iW0;
                    }
                    break;
                case 54:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.N0(i16, A(j, abstractC0675u));
                        i15 += iW0;
                    }
                    break;
                case 55:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.C0(i16, z(j, abstractC0675u));
                        i15 += iW0;
                    }
                    break;
                case 56:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.z0(i16);
                        i15 += iW0;
                    }
                    break;
                case 57:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.y0(i16);
                        i15 += iW0;
                    }
                    break;
                case 58:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.u0(i16);
                        i15 += iW0;
                    }
                    break;
                case 59:
                    if (q(i16, i14, abstractC0675u)) {
                        Object object3 = unsafe.getObject(abstractC0675u, j);
                        iV0 = object3 instanceof C0662g ? C0666k.v0(i16, (C0662g) object3) : C0666k.I0(i16, (String) object3);
                        i15 = iV0 + i15;
                    }
                    break;
                case 60:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = V.o(i16, unsafe.getObject(abstractC0675u, j), m(i14));
                        i15 += iW0;
                    }
                    break;
                case 61:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.v0(i16, (C0662g) unsafe.getObject(abstractC0675u, j));
                        i15 += iW0;
                    }
                    break;
                case 62:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.L0(i16, z(j, abstractC0675u));
                        i15 += iW0;
                    }
                    break;
                case 63:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.x0(i16, z(j, abstractC0675u));
                        i15 += iW0;
                    }
                    break;
                case 64:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.E0(i16);
                        i15 += iW0;
                    }
                    break;
                case 65:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.F0(i16);
                        i15 += iW0;
                    }
                    break;
                case 66:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.G0(i16, z(j, abstractC0675u));
                        i15 += iW0;
                    }
                    break;
                case 67:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.H0(i16, A(j, abstractC0675u));
                        i15 += iW0;
                    }
                    break;
                case 68:
                    if (q(i16, i14, abstractC0675u)) {
                        iW0 = C0666k.B0(i16, (AbstractC0656a) unsafe.getObject(abstractC0675u, j), m(i14));
                        i15 += iW0;
                    }
                    break;
            }
            i14 += 3;
            i12 = i7;
            i13 = i8;
            i11 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.U
    public final int g(AbstractC0675u abstractC0675u) {
        int i7;
        int iB;
        int i8;
        int[] iArr = this.f9119a;
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iM = M(i10);
            int i11 = iArr[i10];
            long j = 1048575 & iM;
            int i12 = 1237;
            int iHashCode = 37;
            switch (L(iM)) {
                case 0:
                    i7 = i9 * 53;
                    iB = AbstractC0677w.b(Double.doubleToLongBits(h0.f9196c.d(j, abstractC0675u)));
                    i9 = iB + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    iB = Float.floatToIntBits(h0.f9196c.e(j, abstractC0675u));
                    i9 = iB + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    iB = AbstractC0677w.b(h0.f9196c.g(j, abstractC0675u));
                    i9 = iB + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    iB = AbstractC0677w.b(h0.f9196c.g(j, abstractC0675u));
                    i9 = iB + i7;
                    break;
                case 4:
                    i7 = i9 * 53;
                    iB = h0.f9196c.f(j, abstractC0675u);
                    i9 = iB + i7;
                    break;
                case 5:
                    i7 = i9 * 53;
                    iB = AbstractC0677w.b(h0.f9196c.g(j, abstractC0675u));
                    i9 = iB + i7;
                    break;
                case 6:
                    i7 = i9 * 53;
                    iB = h0.f9196c.f(j, abstractC0675u);
                    i9 = iB + i7;
                    break;
                case 7:
                    i8 = i9 * 53;
                    boolean zC = h0.f9196c.c(j, abstractC0675u);
                    Charset charset = AbstractC0677w.f9255a;
                    if (zC) {
                        i12 = 1231;
                    }
                    i9 = i12 + i8;
                    break;
                case 8:
                    i7 = i9 * 53;
                    iB = ((String) h0.f9196c.h(j, abstractC0675u)).hashCode();
                    i9 = iB + i7;
                    break;
                case 9:
                    Object objH = h0.f9196c.h(j, abstractC0675u);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 10:
                    i7 = i9 * 53;
                    iB = h0.f9196c.h(j, abstractC0675u).hashCode();
                    i9 = iB + i7;
                    break;
                case 11:
                    i7 = i9 * 53;
                    iB = h0.f9196c.f(j, abstractC0675u);
                    i9 = iB + i7;
                    break;
                case 12:
                    i7 = i9 * 53;
                    iB = h0.f9196c.f(j, abstractC0675u);
                    i9 = iB + i7;
                    break;
                case 13:
                    i7 = i9 * 53;
                    iB = h0.f9196c.f(j, abstractC0675u);
                    i9 = iB + i7;
                    break;
                case 14:
                    i7 = i9 * 53;
                    iB = AbstractC0677w.b(h0.f9196c.g(j, abstractC0675u));
                    i9 = iB + i7;
                    break;
                case 15:
                    i7 = i9 * 53;
                    iB = h0.f9196c.f(j, abstractC0675u);
                    i9 = iB + i7;
                    break;
                case 16:
                    i7 = i9 * 53;
                    iB = AbstractC0677w.b(h0.f9196c.g(j, abstractC0675u));
                    i9 = iB + i7;
                    break;
                case 17:
                    Object objH2 = h0.f9196c.h(j, abstractC0675u);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
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
                    iB = h0.f9196c.h(j, abstractC0675u).hashCode();
                    i9 = iB + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    iB = h0.f9196c.h(j, abstractC0675u).hashCode();
                    i9 = iB + i7;
                    break;
                case 51:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = AbstractC0677w.b(Double.doubleToLongBits(((Double) h0.f9196c.h(j, abstractC0675u)).doubleValue()));
                        i9 = iB + i7;
                    }
                    break;
                case 52:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = Float.floatToIntBits(((Float) h0.f9196c.h(j, abstractC0675u)).floatValue());
                        i9 = iB + i7;
                    }
                    break;
                case 53:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = AbstractC0677w.b(A(j, abstractC0675u));
                        i9 = iB + i7;
                    }
                    break;
                case 54:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = AbstractC0677w.b(A(j, abstractC0675u));
                        i9 = iB + i7;
                    }
                    break;
                case 55:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = z(j, abstractC0675u);
                        i9 = iB + i7;
                    }
                    break;
                case 56:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = AbstractC0677w.b(A(j, abstractC0675u));
                        i9 = iB + i7;
                    }
                    break;
                case 57:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = z(j, abstractC0675u);
                        i9 = iB + i7;
                    }
                    break;
                case 58:
                    if (q(i11, i10, abstractC0675u)) {
                        i8 = i9 * 53;
                        boolean zBooleanValue = ((Boolean) h0.f9196c.h(j, abstractC0675u)).booleanValue();
                        Charset charset2 = AbstractC0677w.f9255a;
                        if (zBooleanValue) {
                            i12 = 1231;
                        }
                        i9 = i12 + i8;
                    }
                    break;
                case 59:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = ((String) h0.f9196c.h(j, abstractC0675u)).hashCode();
                        i9 = iB + i7;
                    }
                    break;
                case 60:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = h0.f9196c.h(j, abstractC0675u).hashCode();
                        i9 = iB + i7;
                    }
                    break;
                case 61:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = h0.f9196c.h(j, abstractC0675u).hashCode();
                        i9 = iB + i7;
                    }
                    break;
                case 62:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = z(j, abstractC0675u);
                        i9 = iB + i7;
                    }
                    break;
                case 63:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = z(j, abstractC0675u);
                        i9 = iB + i7;
                    }
                    break;
                case 64:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = z(j, abstractC0675u);
                        i9 = iB + i7;
                    }
                    break;
                case 65:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = AbstractC0677w.b(A(j, abstractC0675u));
                        i9 = iB + i7;
                    }
                    break;
                case 66:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = z(j, abstractC0675u);
                        i9 = iB + i7;
                    }
                    break;
                case 67:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = AbstractC0677w.b(A(j, abstractC0675u));
                        i9 = iB + i7;
                    }
                    break;
                case 68:
                    if (q(i11, i10, abstractC0675u)) {
                        i7 = i9 * 53;
                        iB = h0.f9196c.h(j, abstractC0675u).hashCode();
                        i9 = iB + i7;
                    }
                    break;
            }
        }
        this.f9129l.getClass();
        return abstractC0675u.unknownFields.hashCode() + (i9 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean h(AbstractC0675u abstractC0675u, Object obj) {
        int[] iArr = this.f9119a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean zB = true;
            if (i7 >= length) {
                this.f9129l.getClass();
                return abstractC0675u.unknownFields.equals(((AbstractC0675u) obj).unknownFields);
            }
            int iM = M(i7);
            long j = iM & 1048575;
            switch (L(iM)) {
                case 0:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var = h0.f9196c;
                        if (Double.doubleToLongBits(g0Var.d(j, abstractC0675u)) != Double.doubleToLongBits(g0Var.d(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 1:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var2 = h0.f9196c;
                        if (Float.floatToIntBits(g0Var2.e(j, abstractC0675u)) != Float.floatToIntBits(g0Var2.e(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 2:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var3 = h0.f9196c;
                        if (g0Var3.g(j, abstractC0675u) != g0Var3.g(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 3:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var4 = h0.f9196c;
                        if (g0Var4.g(j, abstractC0675u) != g0Var4.g(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 4:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var5 = h0.f9196c;
                        if (g0Var5.f(j, abstractC0675u) != g0Var5.f(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 5:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var6 = h0.f9196c;
                        if (g0Var6.g(j, abstractC0675u) != g0Var6.g(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 6:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var7 = h0.f9196c;
                        if (g0Var7.f(j, abstractC0675u) != g0Var7.f(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 7:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var8 = h0.f9196c;
                        if (g0Var8.c(j, abstractC0675u) != g0Var8.c(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 8:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var9 = h0.f9196c;
                        if (!V.B(g0Var9.h(j, abstractC0675u), g0Var9.h(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 9:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var10 = h0.f9196c;
                        if (!V.B(g0Var10.h(j, abstractC0675u), g0Var10.h(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 10:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var11 = h0.f9196c;
                        if (!V.B(g0Var11.h(j, abstractC0675u), g0Var11.h(j, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 11:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var12 = h0.f9196c;
                        if (g0Var12.f(j, abstractC0675u) != g0Var12.f(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 12:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var13 = h0.f9196c;
                        if (g0Var13.f(j, abstractC0675u) != g0Var13.f(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 13:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var14 = h0.f9196c;
                        if (g0Var14.f(j, abstractC0675u) != g0Var14.f(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 14:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var15 = h0.f9196c;
                        if (g0Var15.g(j, abstractC0675u) != g0Var15.g(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 15:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var16 = h0.f9196c;
                        if (g0Var16.f(j, abstractC0675u) != g0Var16.f(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 16:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var17 = h0.f9196c;
                        if (g0Var17.g(j, abstractC0675u) != g0Var17.g(j, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 17:
                    if (!j(abstractC0675u, obj, i7)) {
                        zB = false;
                    } else {
                        g0 g0Var18 = h0.f9196c;
                        if (!V.B(g0Var18.h(j, abstractC0675u), g0Var18.h(j, obj))) {
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
                    g0 g0Var19 = h0.f9196c;
                    zB = V.B(g0Var19.h(j, abstractC0675u), g0Var19.h(j, obj));
                    break;
                case 50:
                    g0 g0Var20 = h0.f9196c;
                    zB = V.B(g0Var20.h(j, abstractC0675u), g0Var20.h(j, obj));
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
                    g0 g0Var21 = h0.f9196c;
                    if (g0Var21.f(j3, abstractC0675u) != g0Var21.f(j3, obj) || !V.B(g0Var21.h(j, abstractC0675u), g0Var21.h(j, obj))) {
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

    @Override // androidx.datastore.preferences.protobuf.U
    public final void i(Object obj, C0665j c0665j, C0668m c0668m) throws Throwable {
        c0668m.getClass();
        if (p(obj)) {
            r(this.f9129l, obj, c0665j, c0668m);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    public final boolean j(AbstractC0675u abstractC0675u, Object obj, int i7) {
        return n(i7, abstractC0675u) == n(i7, obj);
    }

    public final void k(int i7, Object obj, Object obj2) {
        int i8 = this.f9119a[i7];
        if (h0.f9196c.h(M(i7) & 1048575, obj) == null) {
            return;
        }
        l(i7);
    }

    public final void l(int i7) {
        if (this.f9120b[AbstractC0486a1.d(i7, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final U m(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f9120b;
        U u4 = (U) objArr[i8];
        if (u4 != null) {
            return u4;
        }
        U uA = Q.f9136c.a((Class) objArr[i8 + 1]);
        objArr[i8] = uA;
        return uA;
    }

    public final boolean n(int i7, Object obj) {
        int i8 = this.f9119a[i7 + 2];
        long j = i8 & 1048575;
        if (j != 1048575) {
            return ((1 << (i8 >>> 20)) & h0.f9196c.f(j, obj)) != 0;
        }
        int iM = M(i7);
        long j3 = iM & 1048575;
        switch (L(iM)) {
            case 0:
                return Double.doubleToRawLongBits(h0.f9196c.d(j3, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(h0.f9196c.e(j3, obj)) != 0;
            case 2:
                return h0.f9196c.g(j3, obj) != 0;
            case 3:
                return h0.f9196c.g(j3, obj) != 0;
            case 4:
                return h0.f9196c.f(j3, obj) != 0;
            case 5:
                return h0.f9196c.g(j3, obj) != 0;
            case 6:
                return h0.f9196c.f(j3, obj) != 0;
            case 7:
                return h0.f9196c.c(j3, obj);
            case 8:
                Object objH = h0.f9196c.h(j3, obj);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof C0662g) {
                    return !C0662g.f9182c.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return h0.f9196c.h(j3, obj) != null;
            case 10:
                return !C0662g.f9182c.equals(h0.f9196c.h(j3, obj));
            case 11:
                return h0.f9196c.f(j3, obj) != 0;
            case 12:
                return h0.f9196c.f(j3, obj) != 0;
            case 13:
                return h0.f9196c.f(j3, obj) != 0;
            case 14:
                return h0.f9196c.g(j3, obj) != 0;
            case 15:
                return h0.f9196c.f(j3, obj) != 0;
            case 16:
                return h0.f9196c.g(j3, obj) != 0;
            case 17:
                return h0.f9196c.h(j3, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return n(i7, obj);
        }
        return (i9 & i10) != 0;
    }

    public final boolean q(int i7, int i8, Object obj) {
        return h0.f9196c.f((long) (this.f9119a[i8 + 2] & 1048575), obj) == i7;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x064b A[Catch: all -> 0x025f, TryCatch #4 {all -> 0x025f, blocks: (B:122:0x0646, B:124:0x064b, B:125:0x0650, B:69:0x025a, B:72:0x0262, B:73:0x0275, B:74:0x0288, B:75:0x029b, B:76:0x02ae, B:77:0x02c7, B:78:0x02da, B:79:0x02ed, B:80:0x0300, B:81:0x0313, B:82:0x0326, B:83:0x0339, B:84:0x034c, B:85:0x035f, B:86:0x0372, B:87:0x0385, B:88:0x0398, B:89:0x03ab, B:90:0x03be, B:91:0x03d7, B:92:0x03ea, B:93:0x03fd, B:94:0x0411, B:95:0x0419, B:96:0x042c, B:97:0x043f, B:98:0x0452, B:99:0x0465, B:100:0x0478, B:101:0x048b, B:102:0x049e, B:103:0x04b1, B:104:0x04ca, B:105:0x04e0, B:106:0x04f6, B:107:0x050d, B:108:0x0524, B:109:0x053d, B:110:0x0553, B:111:0x0566, B:112:0x057f, B:113:0x058a, B:114:0x05a2, B:115:0x05b9, B:116:0x05d0, B:117:0x05e6, B:118:0x05fc, B:119:0x0611, B:120:0x0629), top: B:150:0x0646 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x065a A[LOOP:2: B:128:0x0658->B:129:0x065a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0664  */
    /* JADX WARN: Code duplicated, block: B:159:0x0656 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    public final void r(c0 c0Var, Object obj, C0665j c0665j, C0668m c0668m) throws Throwable {
        int i7;
        int i8;
        int[] iArr = this.f9125g;
        int i9 = this.f9127i;
        int i10 = this.f9126h;
        b0 b0VarA = null;
        while (true) {
            try {
                int iA = c0665j.a();
                int iB = B(iA);
                if (iB >= 0) {
                    int iM = M(iB);
                    try {
                        int iL = L(iM);
                        L3.e eVar = (L3.e) c0665j.f9213e;
                        A a2 = this.f9128k;
                        switch (iL) {
                            case 0:
                                i7 = i10;
                                long jY = y(iM);
                                c0665j.W(1);
                                h0.f9196c.l(obj, jY, eVar.p());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 1:
                                i7 = i10;
                                long jY2 = y(iM);
                                c0665j.W(5);
                                h0.f9196c.m(obj, jY2, eVar.t());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 2:
                                i7 = i10;
                                long jY3 = y(iM);
                                c0665j.W(0);
                                h0.n(obj, jY3, eVar.v());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 3:
                                i7 = i10;
                                long jY4 = y(iM);
                                c0665j.W(0);
                                h0.n(obj, jY4, eVar.E());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 4:
                                i7 = i10;
                                long jY5 = y(iM);
                                c0665j.W(0);
                                h0.m(jY5, obj, eVar.u());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 5:
                                i7 = i10;
                                long jY6 = y(iM);
                                c0665j.W(1);
                                h0.n(obj, jY6, eVar.s());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 6:
                                i7 = i10;
                                long jY7 = y(iM);
                                c0665j.W(5);
                                h0.m(jY7, obj, eVar.r());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 7:
                                i7 = i10;
                                long jY8 = y(iM);
                                c0665j.W(0);
                                h0.f9196c.j(obj, jY8, eVar.m());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 8:
                                i7 = i10;
                                E(iM, c0665j, obj);
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 9:
                                i7 = i10;
                                AbstractC0656a abstractC0656a = (AbstractC0656a) v(iB, obj);
                                U uM = m(iB);
                                c0665j.W(2);
                                c0665j.f(abstractC0656a, uM, c0668m);
                                J(obj, iB, abstractC0656a);
                                i10 = i7;
                                break;
                            case 10:
                                i7 = i10;
                                h0.o(obj, y(iM), c0665j.m());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 11:
                                i7 = i10;
                                long jY9 = y(iM);
                                c0665j.W(0);
                                h0.m(jY9, obj, eVar.D());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 12:
                                i7 = i10;
                                c0665j.W(0);
                                int iQ = eVar.q();
                                l(iB);
                                h0.m(y(iM), obj, iQ);
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 13:
                                i7 = i10;
                                long jY10 = y(iM);
                                c0665j.W(5);
                                h0.m(jY10, obj, eVar.w());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 14:
                                i7 = i10;
                                long jY11 = y(iM);
                                c0665j.W(1);
                                h0.n(obj, jY11, eVar.x());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 15:
                                i7 = i10;
                                long jY12 = y(iM);
                                c0665j.W(0);
                                h0.m(jY12, obj, eVar.y());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 16:
                                i7 = i10;
                                long jY13 = y(iM);
                                c0665j.W(0);
                                h0.n(obj, jY13, eVar.z());
                                H(iB, obj);
                                i10 = i7;
                                break;
                            case 17:
                                i7 = i10;
                                AbstractC0656a abstractC0656a2 = (AbstractC0656a) v(iB, obj);
                                U uM2 = m(iB);
                                c0665j.W(3);
                                c0665j.c(abstractC0656a2, uM2, c0668m);
                                J(obj, iB, abstractC0656a2);
                                i10 = i7;
                                break;
                            case 18:
                                i7 = i10;
                                long jY14 = y(iM);
                                a2.getClass();
                                c0665j.r(A.b(jY14, obj));
                                i10 = i7;
                                break;
                            case 19:
                                i7 = i10;
                                long jY15 = y(iM);
                                a2.getClass();
                                c0665j.B(A.b(jY15, obj));
                                i10 = i7;
                                break;
                            case 20:
                                i7 = i10;
                                long jY16 = y(iM);
                                a2.getClass();
                                c0665j.F(A.b(jY16, obj));
                                i10 = i7;
                                break;
                            case zzbbd.zzt.zzm /* 21 */:
                                i7 = i10;
                                long jY17 = y(iM);
                                a2.getClass();
                                c0665j.T(A.b(jY17, obj));
                                i10 = i7;
                                break;
                            case 22:
                                i7 = i10;
                                long jY18 = y(iM);
                                a2.getClass();
                                c0665j.D(A.b(jY18, obj));
                                i10 = i7;
                                break;
                            case 23:
                                i7 = i10;
                                long jY19 = y(iM);
                                a2.getClass();
                                c0665j.z(A.b(jY19, obj));
                                i10 = i7;
                                break;
                            case 24:
                                i7 = i10;
                                long jY20 = y(iM);
                                a2.getClass();
                                c0665j.x(A.b(jY20, obj));
                                i10 = i7;
                                break;
                            case 25:
                                i7 = i10;
                                long jY21 = y(iM);
                                a2.getClass();
                                c0665j.k(A.b(jY21, obj));
                                i10 = i7;
                                break;
                            case 26:
                                i7 = i10;
                                F(iM, c0665j, obj);
                                i10 = i7;
                                break;
                            case 27:
                                i7 = i10;
                                D(obj, iM, c0665j, m(iB), c0668m);
                                i10 = i7;
                                break;
                            case 28:
                                i7 = i10;
                                long jY22 = y(iM);
                                a2.getClass();
                                c0665j.p(A.b(jY22, obj));
                                i10 = i7;
                                break;
                            case 29:
                                i7 = i10;
                                long jY23 = y(iM);
                                a2.getClass();
                                c0665j.R(A.b(jY23, obj));
                                i10 = i7;
                                break;
                            case 30:
                                i7 = i10;
                                long jY24 = y(iM);
                                a2.getClass();
                                InterfaceC0676v interfaceC0676vB = A.b(jY24, obj);
                                c0665j.t(interfaceC0676vB);
                                l(iB);
                                V.z(obj, iA, interfaceC0676vB, b0VarA, c0Var);
                                i10 = i7;
                                break;
                            case 31:
                                i7 = i10;
                                long jY25 = y(iM);
                                a2.getClass();
                                c0665j.H(A.b(jY25, obj));
                                i10 = i7;
                                break;
                            case 32:
                                i7 = i10;
                                long jY26 = y(iM);
                                a2.getClass();
                                c0665j.J(A.b(jY26, obj));
                                i10 = i7;
                                break;
                            case 33:
                                i7 = i10;
                                long jY27 = y(iM);
                                a2.getClass();
                                c0665j.L(A.b(jY27, obj));
                                i10 = i7;
                                break;
                            case 34:
                                i7 = i10;
                                long jY28 = y(iM);
                                a2.getClass();
                                c0665j.N(A.b(jY28, obj));
                                i10 = i7;
                                break;
                            case 35:
                                i7 = i10;
                                long jY29 = y(iM);
                                a2.getClass();
                                c0665j.r(A.b(jY29, obj));
                                i10 = i7;
                                break;
                            case 36:
                                i7 = i10;
                                long jY30 = y(iM);
                                a2.getClass();
                                c0665j.B(A.b(jY30, obj));
                                i10 = i7;
                                break;
                            case 37:
                                i7 = i10;
                                long jY31 = y(iM);
                                a2.getClass();
                                c0665j.F(A.b(jY31, obj));
                                i10 = i7;
                                break;
                            case 38:
                                i7 = i10;
                                long jY32 = y(iM);
                                a2.getClass();
                                c0665j.T(A.b(jY32, obj));
                                i10 = i7;
                                break;
                            case 39:
                                i7 = i10;
                                long jY33 = y(iM);
                                a2.getClass();
                                c0665j.D(A.b(jY33, obj));
                                i10 = i7;
                                break;
                            case 40:
                                i7 = i10;
                                long jY34 = y(iM);
                                a2.getClass();
                                c0665j.z(A.b(jY34, obj));
                                i10 = i7;
                                break;
                            case 41:
                                i7 = i10;
                                long jY35 = y(iM);
                                a2.getClass();
                                c0665j.x(A.b(jY35, obj));
                                i10 = i7;
                                break;
                            case 42:
                                i7 = i10;
                                long jY36 = y(iM);
                                a2.getClass();
                                c0665j.k(A.b(jY36, obj));
                                i10 = i7;
                                break;
                            case 43:
                                i7 = i10;
                                long jY37 = y(iM);
                                a2.getClass();
                                c0665j.R(A.b(jY37, obj));
                                i10 = i7;
                                break;
                            case 44:
                                i7 = i10;
                                long jY38 = y(iM);
                                a2.getClass();
                                InterfaceC0676v interfaceC0676vB2 = A.b(jY38, obj);
                                c0665j.t(interfaceC0676vB2);
                                l(iB);
                                V.z(obj, iA, interfaceC0676vB2, b0VarA, c0Var);
                                i10 = i7;
                                break;
                            case 45:
                                i7 = i10;
                                long jY39 = y(iM);
                                a2.getClass();
                                c0665j.H(A.b(jY39, obj));
                                i10 = i7;
                                break;
                            case 46:
                                i7 = i10;
                                long jY40 = y(iM);
                                a2.getClass();
                                c0665j.J(A.b(jY40, obj));
                                i10 = i7;
                                break;
                            case 47:
                                i7 = i10;
                                long jY41 = y(iM);
                                a2.getClass();
                                c0665j.L(A.b(jY41, obj));
                                i10 = i7;
                                break;
                            case 48:
                                i7 = i10;
                                long jY42 = y(iM);
                                a2.getClass();
                                c0665j.N(A.b(jY42, obj));
                                i10 = i7;
                                break;
                            case 49:
                                i7 = i10;
                                try {
                                    C(obj, y(iM), c0665j, m(iB), c0668m);
                                    break;
                                } catch (C0678x unused) {
                                    try {
                                        c0Var.getClass();
                                        if (b0VarA == null) {
                                            b0VarA = c0.a(obj);
                                        }
                                        if (!c0.c(0, c0665j, b0VarA)) {
                                            for (i8 = i7; i8 < i9; i8++) {
                                                k(iArr[i8], obj, b0VarA);
                                            }
                                            if (b0VarA != null) {
                                                ((AbstractC0675u) obj).unknownFields = b0VarA;
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        for (int i11 = i7; i11 < i9; i11++) {
                                            k(iArr[i11], obj, b0VarA);
                                        }
                                        if (b0VarA != null) {
                                            c0Var.getClass();
                                            ((AbstractC0675u) obj).unknownFields = b0VarA;
                                        }
                                        throw th;
                                    }
                                }
                                i10 = i7;
                                break;
                            case 50:
                                try {
                                    try {
                                        s(obj, iB, this.f9120b[(iB / 3) * 2], c0668m, c0665j);
                                        i7 = i10;
                                    } catch (C0678x unused2) {
                                        i7 = i10;
                                        c0Var.getClass();
                                        if (b0VarA == null) {
                                            b0VarA = c0.a(obj);
                                        }
                                        if (!c0.c(0, c0665j, b0VarA)) {
                                            while (i8 < i9) {
                                                k(iArr[i8], obj, b0VarA);
                                            }
                                            if (b0VarA != null) {
                                                ((AbstractC0675u) obj).unknownFields = b0VarA;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } catch (C0678x unused3) {
                                }
                                i10 = i7;
                                break;
                            case 51:
                                long jY43 = y(iM);
                                c0665j.W(1);
                                h0.o(obj, jY43, Double.valueOf(eVar.p()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 52:
                                long jY44 = y(iM);
                                c0665j.W(5);
                                h0.o(obj, jY44, Float.valueOf(eVar.t()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 53:
                                long jY45 = y(iM);
                                c0665j.W(0);
                                h0.o(obj, jY45, Long.valueOf(eVar.v()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 54:
                                long jY46 = y(iM);
                                c0665j.W(0);
                                h0.o(obj, jY46, Long.valueOf(eVar.E()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 55:
                                long jY47 = y(iM);
                                c0665j.W(0);
                                h0.o(obj, jY47, Integer.valueOf(eVar.u()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 56:
                                long jY48 = y(iM);
                                c0665j.W(1);
                                h0.o(obj, jY48, Long.valueOf(eVar.s()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 57:
                                long jY49 = y(iM);
                                c0665j.W(5);
                                h0.o(obj, jY49, Integer.valueOf(eVar.r()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 58:
                                long jY50 = y(iM);
                                c0665j.W(0);
                                h0.o(obj, jY50, Boolean.valueOf(eVar.m()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 59:
                                E(iM, c0665j, obj);
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 60:
                                AbstractC0656a abstractC0656a3 = (AbstractC0656a) w(iA, iB, obj);
                                U uM3 = m(iB);
                                c0665j.W(2);
                                c0665j.f(abstractC0656a3, uM3, c0668m);
                                K(obj, iA, iB, abstractC0656a3);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 61:
                                h0.o(obj, y(iM), c0665j.m());
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 62:
                                long jY51 = y(iM);
                                c0665j.W(0);
                                h0.o(obj, jY51, Integer.valueOf(eVar.D()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 63:
                                c0665j.W(0);
                                int iQ2 = eVar.q();
                                l(iB);
                                h0.o(obj, y(iM), Integer.valueOf(iQ2));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 64:
                                long jY52 = y(iM);
                                c0665j.W(5);
                                h0.o(obj, jY52, Integer.valueOf(eVar.w()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 65:
                                long jY53 = y(iM);
                                c0665j.W(1);
                                h0.o(obj, jY53, Long.valueOf(eVar.x()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 66:
                                long jY54 = y(iM);
                                c0665j.W(0);
                                h0.o(obj, jY54, Integer.valueOf(eVar.y()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 67:
                                long jY55 = y(iM);
                                c0665j.W(0);
                                h0.o(obj, jY55, Long.valueOf(eVar.z()));
                                I(iA, iB, obj);
                                i7 = i10;
                                i10 = i7;
                                break;
                            case 68:
                                AbstractC0656a abstractC0656a4 = (AbstractC0656a) w(iA, iB, obj);
                                U uM4 = m(iB);
                                c0665j.W(3);
                                c0665j.c(abstractC0656a4, uM4, c0668m);
                                K(obj, iA, iB, abstractC0656a4);
                                i7 = i10;
                                i10 = i7;
                                break;
                            default:
                                if (b0VarA == null) {
                                    c0Var.getClass();
                                    b0VarA = c0.a(obj);
                                }
                                c0Var.getClass();
                                if (!c0.c(0, c0665j, b0VarA)) {
                                    while (i10 < i9) {
                                        k(iArr[i10], obj, b0VarA);
                                        i10++;
                                    }
                                    if (b0VarA != null) {
                                        ((AbstractC0675u) obj).unknownFields = b0VarA;
                                        return;
                                    }
                                    return;
                                }
                                i7 = i10;
                                i10 = i7;
                                break;
                        }
                    } catch (C0678x unused4) {
                        i7 = i10;
                    }
                } else {
                    if (iA == Integer.MAX_VALUE) {
                        while (i10 < i9) {
                            k(iArr[i10], obj, b0VarA);
                            i10++;
                        }
                        if (b0VarA != null) {
                            c0Var.getClass();
                            ((AbstractC0675u) obj).unknownFields = b0VarA;
                            return;
                        }
                        return;
                    }
                    c0Var.getClass();
                    if (b0VarA == null) {
                        b0VarA = c0.a(obj);
                    }
                    if (!c0.c(0, c0665j, b0VarA)) {
                        while (i10 < i9) {
                            k(iArr[i10], obj, b0VarA);
                            i10++;
                        }
                        if (b0VarA != null) {
                            ((AbstractC0675u) obj).unknownFields = b0VarA;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i7 = i10;
            }
        }
    }

    public final void s(Object obj, int i7, Object obj2, C0668m c0668m, C0665j c0665j) throws com.google.crypto.tink.shaded.protobuf.B, com.google.protobuf.L, C0678x {
        long jM = M(i7) & 1048575;
        Object objH = h0.f9196c.h(jM, obj);
        H h6 = this.f9130m;
        if (objH == null) {
            h6.getClass();
            objH = G.f9112b.b();
            h0.o(obj, jM, objH);
        } else {
            h6.getClass();
            if (!((G) objH).f9113a) {
                G gB = G.f9112b.b();
                H.b(gB, objH);
                h0.o(obj, jM, gB);
                objH = gB;
            }
        }
        h6.getClass();
        G g3 = (G) objH;
        E e7 = ((F) obj2).f9111a;
        c0665j.W(2);
        L3.e eVar = (L3.e) c0665j.f9213e;
        int iL = eVar.l(eVar.D());
        Object objV = "";
        p022d0.i iVar = e7.f9110c;
        Object objV2 = iVar;
        while (true) {
            try {
                int iA = c0665j.a();
                if (iA == Integer.MAX_VALUE || eVar.g()) {
                    break;
                }
                if (iA == 1) {
                    objV = c0665j.v(e7.f9108a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!c0665j.X()) {
                            throw new C0679y("Unable to parse map entry.");
                        }
                    } catch (C0678x unused) {
                        if (!c0665j.X()) {
                            throw new C0679y("Unable to parse map entry.");
                        }
                    }
                } else {
                    objV2 = c0665j.v(e7.f9109b, iVar.getClass(), c0668m);
                }
            } catch (Throwable th) {
                eVar.j(iL);
                throw th;
            }
        }
        g3.put(objV, objV2);
        eVar.j(iL);
    }

    public final void t(int i7, Object obj, Object obj2) {
        if (n(i7, obj2)) {
            long jM = M(i7) & 1048575;
            Unsafe unsafe = f9118o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f9119a[i7] + " is present but null: " + obj2);
            }
            U uM = m(i7);
            if (!n(i7, obj)) {
                if (p(object)) {
                    AbstractC0675u abstractC0675uD = uM.d();
                    uM.a(abstractC0675uD, object);
                    unsafe.putObject(obj, jM, abstractC0675uD);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                H(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0675u abstractC0675uD2 = uM.d();
                uM.a(abstractC0675uD2, object2);
                unsafe.putObject(obj, jM, abstractC0675uD2);
                object2 = abstractC0675uD2;
            }
            uM.a(object2, object);
        }
    }

    public final void u(int i7, Object obj, Object obj2) {
        int[] iArr = this.f9119a;
        int i8 = iArr[i7];
        if (q(i8, i7, obj2)) {
            long jM = M(i7) & 1048575;
            Unsafe unsafe = f9118o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            U uM = m(i7);
            if (!q(i8, i7, obj)) {
                if (p(object)) {
                    AbstractC0675u abstractC0675uD = uM.d();
                    uM.a(abstractC0675uD, object);
                    unsafe.putObject(obj, jM, abstractC0675uD);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                I(i8, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0675u abstractC0675uD2 = uM.d();
                uM.a(abstractC0675uD2, object2);
                unsafe.putObject(obj, jM, abstractC0675uD2);
                object2 = abstractC0675uD2;
            }
            uM.a(object2, object);
        }
    }

    public final Object v(int i7, Object obj) {
        U uM = m(i7);
        long jM = M(i7) & 1048575;
        if (!n(i7, obj)) {
            return uM.d();
        }
        Object object = f9118o.getObject(obj, jM);
        if (p(object)) {
            return object;
        }
        AbstractC0675u abstractC0675uD = uM.d();
        if (object != null) {
            uM.a(abstractC0675uD, object);
        }
        return abstractC0675uD;
    }

    public final Object w(int i7, int i8, Object obj) {
        U uM = m(i8);
        if (!q(i7, i8, obj)) {
            return uM.d();
        }
        Object object = f9118o.getObject(obj, M(i8) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0675u abstractC0675uD = uM.d();
        if (object != null) {
            uM.a(abstractC0675uD, object);
        }
        return abstractC0675uD;
    }
}
