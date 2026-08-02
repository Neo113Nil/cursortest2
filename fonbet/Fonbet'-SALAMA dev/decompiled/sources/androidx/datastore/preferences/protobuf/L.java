package androidx.datastore.preferences.protobuf;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.ads.zzbbd;
import d0.C0947i;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class L implements U {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f9117n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f9118o = h0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f9119a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9120b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9121c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9122d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0677a f9123e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9124f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f9125g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9126h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9127i;
    public final N j;

    /* renamed from: k, reason: collision with root package name */
    public final A f9128k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f9129l;

    /* renamed from: m, reason: collision with root package name */
    public final H f9130m;

    public L(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0677a abstractC0677a, int[] iArr2, int i9, int i10, N n2, A a2, c0 c0Var, C0690n c0690n, H h6) {
        this.f9119a = iArr;
        this.f9120b = objArr;
        this.f9121c = i7;
        this.f9122d = i8;
        this.f9124f = abstractC0677a instanceof AbstractC0696u;
        this.f9125g = iArr2;
        this.f9126h = i9;
        this.f9127i = i10;
        this.j = n2;
        this.f9128k = a2;
        this.f9129l = c0Var;
        this.f9123e = abstractC0677a;
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
            StringBuilder k7 = e1.k.k("Field ", str, " for ");
            k7.append(cls.getName());
            k7.append(" not found. Known fields are ");
            k7.append(Arrays.toString(declaredFields));
            throw new RuntimeException(k7.toString());
        }
    }

    public static int L(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0696u) {
            return ((AbstractC0696u) obj).i();
        }
        return true;
    }

    public static L x(T t7, N n2, A a2, c0 c0Var, C0690n c0690n, H h6) {
        int i7;
        int charAt;
        int charAt2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char charAt3;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr2;
        int[] iArr3;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field G2;
        int i33;
        char charAt11;
        int i34;
        int i35;
        Field G7;
        Field G8;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        int i39;
        char charAt15;
        String c3 = t7.c();
        int length = c3.length();
        int i40 = 55296;
        if (c3.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i7 = i41 + 1;
                if (c3.charAt(i41) < 55296) {
                    break;
                }
                i41 = i7;
            }
        } else {
            i7 = 1;
        }
        int i42 = i7 + 1;
        int charAt16 = c3.charAt(i7);
        if (charAt16 >= 55296) {
            int i43 = charAt16 & 8191;
            int i44 = 13;
            while (true) {
                i39 = i42 + 1;
                charAt15 = c3.charAt(i42);
                if (charAt15 < 55296) {
                    break;
                }
                i43 |= (charAt15 & 8191) << i44;
                i44 += 13;
                i42 = i39;
            }
            charAt16 = i43 | (charAt15 << i44);
            i42 = i39;
        }
        if (charAt16 == 0) {
            i10 = 0;
            charAt = 0;
            charAt2 = 0;
            i9 = 0;
            i12 = 0;
            i11 = 0;
            iArr = f9117n;
            i8 = 0;
        } else {
            int i45 = i42 + 1;
            int charAt17 = c3.charAt(i42);
            if (charAt17 >= 55296) {
                int i46 = charAt17 & 8191;
                int i47 = 13;
                while (true) {
                    i20 = i45 + 1;
                    charAt10 = c3.charAt(i45);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i46 |= (charAt10 & 8191) << i47;
                    i47 += 13;
                    i45 = i20;
                }
                charAt17 = i46 | (charAt10 << i47);
                i45 = i20;
            }
            int i48 = i45 + 1;
            int charAt18 = c3.charAt(i45);
            if (charAt18 >= 55296) {
                int i49 = charAt18 & 8191;
                int i50 = 13;
                while (true) {
                    i19 = i48 + 1;
                    charAt9 = c3.charAt(i48);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i49 |= (charAt9 & 8191) << i50;
                    i50 += 13;
                    i48 = i19;
                }
                charAt18 = i49 | (charAt9 << i50);
                i48 = i19;
            }
            int i51 = i48 + 1;
            int charAt19 = c3.charAt(i48);
            if (charAt19 >= 55296) {
                int i52 = charAt19 & 8191;
                int i53 = 13;
                while (true) {
                    i18 = i51 + 1;
                    charAt8 = c3.charAt(i51);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i52 |= (charAt8 & 8191) << i53;
                    i53 += 13;
                    i51 = i18;
                }
                charAt19 = i52 | (charAt8 << i53);
                i51 = i18;
            }
            int i54 = i51 + 1;
            int charAt20 = c3.charAt(i51);
            if (charAt20 >= 55296) {
                int i55 = charAt20 & 8191;
                int i56 = 13;
                while (true) {
                    i17 = i54 + 1;
                    charAt7 = c3.charAt(i54);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i55 |= (charAt7 & 8191) << i56;
                    i56 += 13;
                    i54 = i17;
                }
                charAt20 = i55 | (charAt7 << i56);
                i54 = i17;
            }
            int i57 = i54 + 1;
            charAt = c3.charAt(i54);
            if (charAt >= 55296) {
                int i58 = charAt & 8191;
                int i59 = 13;
                while (true) {
                    i16 = i57 + 1;
                    charAt6 = c3.charAt(i57);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i58 |= (charAt6 & 8191) << i59;
                    i59 += 13;
                    i57 = i16;
                }
                charAt = i58 | (charAt6 << i59);
                i57 = i16;
            }
            int i60 = i57 + 1;
            charAt2 = c3.charAt(i57);
            if (charAt2 >= 55296) {
                int i61 = charAt2 & 8191;
                int i62 = 13;
                while (true) {
                    i15 = i60 + 1;
                    charAt5 = c3.charAt(i60);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i61 |= (charAt5 & 8191) << i62;
                    i62 += 13;
                    i60 = i15;
                }
                charAt2 = i61 | (charAt5 << i62);
                i60 = i15;
            }
            int i63 = i60 + 1;
            int charAt21 = c3.charAt(i60);
            if (charAt21 >= 55296) {
                int i64 = charAt21 & 8191;
                int i65 = 13;
                while (true) {
                    i14 = i63 + 1;
                    charAt4 = c3.charAt(i63);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i64 |= (charAt4 & 8191) << i65;
                    i65 += 13;
                    i63 = i14;
                }
                charAt21 = i64 | (charAt4 << i65);
                i63 = i14;
            }
            int i66 = i63 + 1;
            int charAt22 = c3.charAt(i63);
            if (charAt22 >= 55296) {
                int i67 = charAt22 & 8191;
                int i68 = 13;
                while (true) {
                    i13 = i66 + 1;
                    charAt3 = c3.charAt(i66);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i67 |= (charAt3 & 8191) << i68;
                    i68 += 13;
                    i66 = i13;
                }
                charAt22 = i67 | (charAt3 << i68);
                i66 = i13;
            }
            int i69 = (charAt17 * 2) + charAt18;
            i8 = charAt17;
            i42 = i66;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i9 = charAt19;
            i10 = i69;
            i11 = charAt22;
            i12 = charAt20;
        }
        Unsafe unsafe = f9118o;
        Object[] b7 = t7.b();
        Class<?> cls = t7.a().getClass();
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i70 = i11 + charAt2;
        int i71 = i11;
        int i72 = i70;
        int i73 = 0;
        int i74 = 0;
        while (i42 < length) {
            int i75 = i42 + 1;
            int charAt23 = c3.charAt(i42);
            if (charAt23 >= i40) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i38 = i77 + 1;
                    charAt14 = c3.charAt(i77);
                    i21 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i76 |= (charAt14 & 8191) << i78;
                    i78 += 13;
                    i77 = i38;
                    length = i21;
                }
                charAt23 = i76 | (charAt14 << i78);
                i22 = i38;
            } else {
                i21 = length;
                i22 = i75;
            }
            int i79 = i22 + 1;
            int charAt24 = c3.charAt(i22);
            if (charAt24 >= 55296) {
                int i80 = charAt24 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i37 = i81 + 1;
                    charAt13 = c3.charAt(i81);
                    i23 = i11;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i80 |= (charAt13 & 8191) << i82;
                    i82 += 13;
                    i81 = i37;
                    i11 = i23;
                }
                charAt24 = i80 | (charAt13 << i82);
                i24 = i37;
            } else {
                i23 = i11;
                i24 = i79;
            }
            int i83 = charAt24 & 255;
            int i84 = i12;
            if ((charAt24 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            if (i83 >= 51) {
                int i85 = i24 + 1;
                int charAt25 = c3.charAt(i24);
                i25 = i74;
                char c4 = 55296;
                if (charAt25 >= 55296) {
                    int i86 = charAt25 & 8191;
                    int i87 = 13;
                    while (true) {
                        i36 = i85 + 1;
                        charAt12 = c3.charAt(i85);
                        if (charAt12 < c4) {
                            break;
                        }
                        i86 |= (charAt12 & 8191) << i87;
                        i87 += 13;
                        i85 = i36;
                        c4 = 55296;
                    }
                    charAt25 = i86 | (charAt12 << i87);
                    i85 = i36;
                }
                int i88 = i83 - 51;
                int i89 = i85;
                if (i88 == 9 || i88 == 17) {
                    i26 = i9;
                    i35 = 2;
                    objArr[AbstractC0486a1.d(i73, 3, 2, 1)] = b7[i10];
                    i10++;
                } else if (i88 != 12) {
                    i26 = i9;
                    i35 = 2;
                } else if (t.e.b(t7.d(), 1) || (charAt24 & 2048) != 0) {
                    i26 = i9;
                    i35 = 2;
                    objArr[AbstractC0486a1.d(i73, 3, 2, 1)] = b7[i10];
                    i10++;
                } else {
                    i26 = i9;
                    i35 = 2;
                }
                int i90 = charAt25 * i35;
                Object obj = b7[i90];
                if (obj instanceof Field) {
                    G7 = (Field) obj;
                } else {
                    G7 = G(cls, (String) obj);
                    b7[i90] = G7;
                }
                i32 = (int) unsafe.objectFieldOffset(G7);
                int i91 = i90 + 1;
                Object obj2 = b7[i91];
                if (obj2 instanceof Field) {
                    G8 = (Field) obj2;
                } else {
                    G8 = G(cls, (String) obj2);
                    b7[i91] = G8;
                }
                i27 = charAt23;
                iArr2 = iArr4;
                iArr3 = iArr;
                i42 = i89;
                i31 = (int) unsafe.objectFieldOffset(G8);
                i30 = 0;
            } else {
                i25 = i74;
                i26 = i9;
                int i92 = i10 + 1;
                Field G9 = G(cls, (String) b7[i10]);
                if (i83 == 9 || i83 == 17) {
                    i27 = charAt23;
                    iArr2 = iArr4;
                    objArr[AbstractC0486a1.d(i73, 3, 2, 1)] = G9.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i27 = charAt23;
                        iArr2 = iArr4;
                        i34 = i10 + 2;
                        objArr[AbstractC0486a1.d(i73, 3, 2, 1)] = b7[i92];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i27 = charAt23;
                        if (t7.d() == 1 || (charAt24 & 2048) != 0) {
                            iArr2 = iArr4;
                            i34 = i10 + 2;
                            objArr[AbstractC0486a1.d(i73, 3, 2, 1)] = b7[i92];
                        } else {
                            iArr2 = iArr4;
                        }
                    } else if (i83 == 50) {
                        int i93 = i71 + 1;
                        iArr[i71] = i73;
                        int i94 = (i73 / 3) * 2;
                        int i95 = i10 + 2;
                        objArr[i94] = b7[i92];
                        if ((charAt24 & 2048) != 0) {
                            i92 = i10 + 3;
                            objArr[i94 + 1] = b7[i95];
                            i27 = charAt23;
                            iArr2 = iArr4;
                            i71 = i93;
                        } else {
                            iArr2 = iArr4;
                            i71 = i93;
                            i92 = i95;
                            i27 = charAt23;
                        }
                    } else {
                        i27 = charAt23;
                        iArr2 = iArr4;
                    }
                    i92 = i34;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(G9);
                if ((charAt24 & 4096) == 0 || i83 > 17) {
                    iArr3 = iArr;
                    i28 = 1048575;
                    i29 = i24;
                    i30 = 0;
                } else {
                    i29 = i24 + 1;
                    int charAt26 = c3.charAt(i24);
                    if (charAt26 >= 55296) {
                        int i96 = charAt26 & 8191;
                        int i97 = 13;
                        while (true) {
                            i33 = i29 + 1;
                            charAt11 = c3.charAt(i29);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i96 |= (charAt11 & 8191) << i97;
                            i97 += 13;
                            i29 = i33;
                        }
                        charAt26 = i96 | (charAt11 << i97);
                        i29 = i33;
                    }
                    int i98 = (charAt26 / 32) + (i8 * 2);
                    Object obj3 = b7[i98];
                    if (obj3 instanceof Field) {
                        G2 = (Field) obj3;
                    } else {
                        G2 = G(cls, (String) obj3);
                        b7[i98] = G2;
                    }
                    iArr3 = iArr;
                    i28 = (int) unsafe.objectFieldOffset(G2);
                    i30 = charAt26 % 32;
                }
                if (i83 >= 18 && i83 <= 49) {
                    iArr3[i72] = objectFieldOffset;
                    i72++;
                }
                i31 = i28;
                i42 = i29;
                i10 = i92;
                i32 = objectFieldOffset;
            }
            int i99 = i73 + 1;
            iArr2[i73] = i27;
            int i100 = i73 + 2;
            String str = c3;
            iArr2[i99] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | i32;
            i73 += 3;
            iArr2[i100] = (i30 << 20) | i31;
            iArr4 = iArr2;
            i12 = i84;
            iArr = iArr3;
            i74 = i25;
            length = i21;
            i11 = i23;
            c3 = str;
            i9 = i26;
            i40 = 55296;
        }
        return new L(iArr4, objArr, i9, i12, t7.a(), iArr, i11, i70, n2, a2, c0Var, c0690n, h6);
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

    public final void C(Object obj, long j, C0686j c0686j, U u4, C0689m c0689m) {
        int C3;
        this.f9128k.getClass();
        InterfaceC0697v b7 = A.b(j, obj);
        int i7 = c0686j.f9210b;
        if ((i7 & 7) != 3) {
            throw C0700y.b();
        }
        do {
            AbstractC0696u d7 = u4.d();
            c0686j.c(d7, u4, c0689m);
            u4.b(d7);
            ((S) b7).add(d7);
            L3.e eVar = (L3.e) c0686j.f9213e;
            if (eVar.g() || c0686j.f9212d != 0) {
                return;
            } else {
                C3 = eVar.C();
            }
        } while (C3 == i7);
        c0686j.f9212d = C3;
    }

    public final void D(Object obj, int i7, C0686j c0686j, U u4, C0689m c0689m) {
        int C3;
        this.f9128k.getClass();
        InterfaceC0697v b7 = A.b(i7 & 1048575, obj);
        int i8 = c0686j.f9210b;
        if ((i8 & 7) != 2) {
            throw C0700y.b();
        }
        do {
            AbstractC0696u d7 = u4.d();
            c0686j.f(d7, u4, c0689m);
            u4.b(d7);
            ((S) b7).add(d7);
            L3.e eVar = (L3.e) c0686j.f9213e;
            if (eVar.g() || c0686j.f9212d != 0) {
                return;
            } else {
                C3 = eVar.C();
            }
        } while (C3 == i8);
        c0686j.f9212d = C3;
    }

    public final void E(int i7, C0686j c0686j, Object obj) {
        if ((536870912 & i7) != 0) {
            c0686j.W(2);
            h0.o(obj, i7 & 1048575, ((L3.e) c0686j.f9213e).B());
        } else if (!this.f9124f) {
            h0.o(obj, i7 & 1048575, c0686j.m());
        } else {
            c0686j.W(2);
            h0.o(obj, i7 & 1048575, ((L3.e) c0686j.f9213e).A());
        }
    }

    public final void F(int i7, C0686j c0686j, Object obj) {
        boolean z4 = (536870912 & i7) != 0;
        A a2 = this.f9128k;
        if (z4) {
            a2.getClass();
            c0686j.P(A.b(i7 & 1048575, obj), true);
        } else {
            a2.getClass();
            c0686j.P(A.b(i7 & 1048575, obj), false);
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

    public final void J(Object obj, int i7, AbstractC0677a abstractC0677a) {
        f9118o.putObject(obj, M(i7) & 1048575, abstractC0677a);
        H(i7, obj);
    }

    public final void K(Object obj, int i7, int i8, AbstractC0677a abstractC0677a) {
        f9118o.putObject(obj, M(i8) & 1048575, abstractC0677a);
        I(i7, i8, obj);
    }

    public final int M(int i7) {
        return this.f9119a[i7 + 1];
    }

    public final void N(Object obj, D d7) {
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
            int M7 = M(i14);
            int i15 = iArr[i14];
            int L7 = L(M7);
            if (L7 <= 17) {
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
            long j = M7 & i11;
            switch (L7) {
                case 0:
                    i10 = i7;
                    if (!o(obj, i14, i10, i8, i9)) {
                        break;
                    } else {
                        d7.c(i15, h0.f9196c.d(j, obj));
                        continue;
                    }
                case 1:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.g(h0.f9196c.e(j, obj), i15);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.j(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.q(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.i(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.f(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.e(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.a(i15, h0.f9196c.c(j, obj));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C0687k) d7.f9107a).c1(i15, (String) object);
                            break;
                        } else {
                            d7.b(i15, (C0683g) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.k(i15, unsafe.getObject(obj, j), m(i14));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.b(i15, (C0683g) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.p(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.d(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.l(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.m(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.n(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i10 = i7;
                    if (o(obj, i14, i10, i8, i9)) {
                        d7.o(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i10 = i7;
                    if (o(obj, i14, i7, i8, i9)) {
                        d7.h(i15, unsafe.getObject(obj, j), m(i14));
                        break;
                    } else {
                        continue;
                    }
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
                        C0687k c0687k = (C0687k) d7.f9107a;
                        c0687k.getClass();
                        for (Map.Entry entry : ((G) object2).entrySet()) {
                            c0687k.e1(i15, i18);
                            c0687k.g1(F.a(e7, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0692p.b(c0687k, e7.f9108a, 1, key);
                            C0692p.b(c0687k, e7.f9109b, 2, value);
                            i18 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (q(i15, i14, obj)) {
                        d7.c(i15, ((Double) h0.f9196c.h(j, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(i15, i14, obj)) {
                        d7.g(((Float) h0.f9196c.h(j, obj)).floatValue(), i15);
                        break;
                    }
                    break;
                case 53:
                    if (q(i15, i14, obj)) {
                        d7.j(i15, A(j, obj));
                        break;
                    }
                    break;
                case 54:
                    if (q(i15, i14, obj)) {
                        d7.q(i15, A(j, obj));
                        break;
                    }
                    break;
                case 55:
                    if (q(i15, i14, obj)) {
                        d7.i(i15, z(j, obj));
                        break;
                    }
                    break;
                case 56:
                    if (q(i15, i14, obj)) {
                        d7.f(i15, A(j, obj));
                        break;
                    }
                    break;
                case 57:
                    if (q(i15, i14, obj)) {
                        d7.e(i15, z(j, obj));
                        break;
                    }
                    break;
                case 58:
                    if (q(i15, i14, obj)) {
                        d7.a(i15, ((Boolean) h0.f9196c.h(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(i15, i14, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((C0687k) d7.f9107a).c1(i15, (String) object3);
                            break;
                        } else {
                            d7.b(i15, (C0683g) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (q(i15, i14, obj)) {
                        d7.k(i15, unsafe.getObject(obj, j), m(i14));
                        break;
                    }
                    break;
                case 61:
                    if (q(i15, i14, obj)) {
                        d7.b(i15, (C0683g) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (q(i15, i14, obj)) {
                        d7.p(i15, z(j, obj));
                        break;
                    }
                    break;
                case 63:
                    if (q(i15, i14, obj)) {
                        d7.d(i15, z(j, obj));
                        break;
                    }
                    break;
                case 64:
                    if (q(i15, i14, obj)) {
                        d7.l(i15, z(j, obj));
                        break;
                    }
                    break;
                case 65:
                    if (q(i15, i14, obj)) {
                        d7.m(i15, A(j, obj));
                        break;
                    }
                    break;
                case 66:
                    if (q(i15, i14, obj)) {
                        d7.n(i15, z(j, obj));
                        break;
                    }
                    break;
                case 67:
                    if (q(i15, i14, obj)) {
                        d7.o(i15, A(j, obj));
                        break;
                    }
                    break;
                case 68:
                    if (q(i15, i14, obj)) {
                        d7.h(i15, unsafe.getObject(obj, j), m(i14));
                        break;
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
        ((AbstractC0696u) obj).unknownFields.d(d7);
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
            int M7 = M(i7);
            long j = 1048575 & M7;
            int i8 = iArr[i7];
            switch (L(M7)) {
                case 0:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        g0 g0Var = h0.f9196c;
                        g0Var.l(obj, j, g0Var.d(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 1:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        g0 g0Var2 = h0.f9196c;
                        g0Var2.m(obj, j, g0Var2.e(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 2:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 3:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 4:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 5:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 6:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 7:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        g0 g0Var3 = h0.f9196c;
                        g0Var3.j(obj, j, g0Var3.c(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 8:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.o(obj, j, h0.f9196c.h(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 9:
                    t(i7, obj, obj2);
                    break;
                case 10:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.o(obj, j, h0.f9196c.h(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 11:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 12:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 13:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 14:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 15:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.m(j, obj, h0.f9196c.f(j, obj2));
                        H(i7, obj);
                        break;
                    }
                case 16:
                    if (!n(i7, obj2)) {
                        break;
                    } else {
                        h0.n(obj, j, h0.f9196c.g(j, obj2));
                        H(i7, obj);
                        break;
                    }
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
                    InterfaceC0697v interfaceC0697v = (InterfaceC0697v) g0Var4.h(j, obj);
                    InterfaceC0697v interfaceC0697v2 = (InterfaceC0697v) g0Var4.h(j, obj2);
                    S s7 = (S) interfaceC0697v;
                    int i9 = s7.f9141c;
                    int i10 = ((S) interfaceC0697v2).f9141c;
                    if (i9 > 0 && i10 > 0) {
                        if (!((AbstractC0678b) interfaceC0697v).f9165a) {
                            interfaceC0697v = s7.t(i10 + i9);
                        }
                        ((AbstractC0678b) interfaceC0697v).addAll(interfaceC0697v2);
                    }
                    if (i9 > 0) {
                        interfaceC0697v2 = interfaceC0697v;
                    }
                    h0.o(obj, j, interfaceC0697v2);
                    break;
                case 50:
                    Class cls = V.f9146a;
                    g0 g0Var5 = h0.f9196c;
                    Object h6 = g0Var5.h(j, obj);
                    Object h7 = g0Var5.h(j, obj2);
                    this.f9130m.getClass();
                    h0.o(obj, j, H.b(h6, h7));
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
                    if (!q(i8, i7, obj2)) {
                        break;
                    } else {
                        h0.o(obj, j, h0.f9196c.h(j, obj2));
                        I(i8, i7, obj);
                        break;
                    }
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
                    if (!q(i8, i7, obj2)) {
                        break;
                    } else {
                        h0.o(obj, j, h0.f9196c.h(j, obj2));
                        I(i8, i7, obj);
                        break;
                    }
                case 68:
                    u(i7, obj, obj2);
                    break;
            }
            i7 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0696u) {
                AbstractC0696u abstractC0696u = (AbstractC0696u) obj;
                abstractC0696u.d();
                abstractC0696u.c();
                abstractC0696u.j();
            }
            int[] iArr = this.f9119a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int M7 = M(i7);
                long j = 1048575 & M7;
                int L7 = L(M7);
                if (L7 != 9) {
                    if (L7 != 60 && L7 != 68) {
                        switch (L7) {
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
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i7], i7, obj)) {
                        m(i7).b(f9118o.getObject(obj, j));
                    }
                }
                if (n(i7, obj)) {
                    m(i7).b(f9118o.getObject(obj, j));
                }
            }
            this.f9129l.getClass();
            c0.b(obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f9126h) {
            int i12 = this.f9125g[i11];
            int[] iArr = this.f9119a;
            int i13 = iArr[i12];
            int M7 = M(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = f9118o.getInt(obj, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & M7) != 0 && !o(obj, i12, i7, i8, i16)) {
                return false;
            }
            int L7 = L(M7);
            if (L7 != 9 && L7 != 17) {
                if (L7 != 27) {
                    if (L7 == 60 || L7 == 68) {
                        if (q(i13, i12, obj)) {
                            if (!m(i12).c(h0.f9196c.h(M7 & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (L7 != 49) {
                        if (L7 != 50) {
                            continue;
                        } else {
                            Object h6 = h0.f9196c.h(M7 & 1048575, obj);
                            this.f9130m.getClass();
                            G g3 = (G) h6;
                            if (g3.isEmpty()) {
                                continue;
                            } else {
                                if (((F) this.f9120b[(i12 / 3) * 2]).f9111a.f9109b.f9234a != q0.MESSAGE) {
                                    continue;
                                } else {
                                    U u4 = null;
                                    for (Object obj2 : g3.values()) {
                                        if (u4 == null) {
                                            u4 = Q.f9136c.a(obj2.getClass());
                                        }
                                        if (!u4.c(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) h0.f9196c.h(M7 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    U m7 = m(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!m7.c(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (o(obj, i12, i7, i8, i16)) {
                if (!m(i12).c(h0.f9196c.h(M7 & 1048575, obj))) {
                    return false;
                }
            } else {
                continue;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final AbstractC0696u d() {
        this.j.getClass();
        return ((AbstractC0696u) this.f9123e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void e(Object obj, D d7) {
        d7.getClass();
        N(obj, d7);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int f(AbstractC0696u abstractC0696u) {
        int i7;
        int i8;
        int i9;
        int w02;
        int v02;
        int i10;
        int K02;
        int M02;
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
                return abstractC0696u.unknownFields.b() + i15;
            }
            int M7 = M(i14);
            int L7 = L(M7);
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i11;
            if (L7 <= 17) {
                if (i18 != i12) {
                    i13 = i18 == i11 ? 0 : unsafe.getInt(abstractC0696u, i18);
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
            long j = M7 & i11;
            if (L7 >= EnumC0693q.f9236b.a()) {
                EnumC0693q.f9237c.a();
            }
            switch (L7) {
                case 0:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.w0(i16);
                        i15 += w02;
                        break;
                    }
                case 1:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.A0(i16);
                        i15 += w02;
                        break;
                    }
                case 2:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.D0(i16, unsafe.getLong(abstractC0696u, j));
                        i15 += w02;
                        break;
                    }
                case 3:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.N0(i16, unsafe.getLong(abstractC0696u, j));
                        i15 += w02;
                        break;
                    }
                case 4:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.C0(i16, unsafe.getInt(abstractC0696u, j));
                        i15 += w02;
                        break;
                    }
                case 5:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.z0(i16);
                        i15 += w02;
                        break;
                    }
                case 6:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.y0(i16);
                        i15 += w02;
                        break;
                    }
                case 7:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.u0(i16);
                        i15 += w02;
                        break;
                    }
                case 8:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0696u, j);
                        v02 = object instanceof C0683g ? C0687k.v0(i16, (C0683g) object) : C0687k.I0(i16, (String) object);
                        i15 = v02 + i15;
                        break;
                    }
                case 9:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = V.o(i16, unsafe.getObject(abstractC0696u, j), m(i14));
                        i15 += w02;
                        break;
                    }
                case 10:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.v0(i16, (C0683g) unsafe.getObject(abstractC0696u, j));
                        i15 += w02;
                        break;
                    }
                case 11:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.L0(i16, unsafe.getInt(abstractC0696u, j));
                        i15 += w02;
                        break;
                    }
                case 12:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.x0(i16, unsafe.getInt(abstractC0696u, j));
                        i15 += w02;
                        break;
                    }
                case 13:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.E0(i16);
                        i15 += w02;
                        break;
                    }
                case 14:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.F0(i16);
                        i15 += w02;
                        break;
                    }
                case 15:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.G0(i16, unsafe.getInt(abstractC0696u, j));
                        i15 += w02;
                        break;
                    }
                case 16:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.H0(i16, unsafe.getLong(abstractC0696u, j));
                        i15 += w02;
                        break;
                    }
                case 17:
                    if (!o(abstractC0696u, i14, i7, i8, i9)) {
                        break;
                    } else {
                        w02 = C0687k.B0(i16, (AbstractC0677a) unsafe.getObject(abstractC0696u, j), m(i14));
                        i15 += w02;
                        break;
                    }
                case 18:
                    w02 = V.h(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 19:
                    w02 = V.f(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 20:
                    w02 = V.m(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    w02 = V.x(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 22:
                    w02 = V.k(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 23:
                    w02 = V.h(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 24:
                    w02 = V.f(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 25:
                    w02 = V.a(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 26:
                    w02 = V.u(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 27:
                    w02 = V.p(i16, (List) unsafe.getObject(abstractC0696u, j), m(i14));
                    i15 += w02;
                    break;
                case 28:
                    w02 = V.c(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 29:
                    w02 = V.v(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 30:
                    w02 = V.d(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 31:
                    w02 = V.f(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 32:
                    w02 = V.h(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 33:
                    w02 = V.q(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 34:
                    w02 = V.s(i16, (List) unsafe.getObject(abstractC0696u, j));
                    i15 += w02;
                    break;
                case 35:
                    i10 = V.i((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 36:
                    i10 = V.g((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 37:
                    i10 = V.n((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 38:
                    i10 = V.y((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 39:
                    i10 = V.l((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 40:
                    i10 = V.i((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 41:
                    i10 = V.g((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 42:
                    i10 = V.b((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 43:
                    i10 = V.w((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 44:
                    i10 = V.e((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 45:
                    i10 = V.g((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 46:
                    i10 = V.i((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 47:
                    i10 = V.r((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 48:
                    i10 = V.t((List) unsafe.getObject(abstractC0696u, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        K02 = C0687k.K0(i16);
                        M02 = C0687k.M0(i10);
                        i15 += M02 + K02 + i10;
                        break;
                    }
                case 49:
                    w02 = V.j(i16, (List) unsafe.getObject(abstractC0696u, j), m(i14));
                    i15 += w02;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0696u, j);
                    Object obj = this.f9120b[(i14 / 3) * 2];
                    this.f9130m.getClass();
                    w02 = H.a(i16, object2, obj);
                    i15 += w02;
                    break;
                case 51:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.w0(i16);
                        i15 += w02;
                        break;
                    }
                case 52:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.A0(i16);
                        i15 += w02;
                        break;
                    }
                case 53:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.D0(i16, A(j, abstractC0696u));
                        i15 += w02;
                        break;
                    }
                case 54:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.N0(i16, A(j, abstractC0696u));
                        i15 += w02;
                        break;
                    }
                case 55:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.C0(i16, z(j, abstractC0696u));
                        i15 += w02;
                        break;
                    }
                case 56:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.z0(i16);
                        i15 += w02;
                        break;
                    }
                case 57:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.y0(i16);
                        i15 += w02;
                        break;
                    }
                case 58:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.u0(i16);
                        i15 += w02;
                        break;
                    }
                case 59:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0696u, j);
                        v02 = object3 instanceof C0683g ? C0687k.v0(i16, (C0683g) object3) : C0687k.I0(i16, (String) object3);
                        i15 = v02 + i15;
                        break;
                    }
                case 60:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = V.o(i16, unsafe.getObject(abstractC0696u, j), m(i14));
                        i15 += w02;
                        break;
                    }
                case 61:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.v0(i16, (C0683g) unsafe.getObject(abstractC0696u, j));
                        i15 += w02;
                        break;
                    }
                case 62:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.L0(i16, z(j, abstractC0696u));
                        i15 += w02;
                        break;
                    }
                case 63:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.x0(i16, z(j, abstractC0696u));
                        i15 += w02;
                        break;
                    }
                case 64:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.E0(i16);
                        i15 += w02;
                        break;
                    }
                case 65:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.F0(i16);
                        i15 += w02;
                        break;
                    }
                case 66:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.G0(i16, z(j, abstractC0696u));
                        i15 += w02;
                        break;
                    }
                case 67:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.H0(i16, A(j, abstractC0696u));
                        i15 += w02;
                        break;
                    }
                case 68:
                    if (!q(i16, i14, abstractC0696u)) {
                        break;
                    } else {
                        w02 = C0687k.B0(i16, (AbstractC0677a) unsafe.getObject(abstractC0696u, j), m(i14));
                        i15 += w02;
                        break;
                    }
            }
            i14 += 3;
            i12 = i7;
            i13 = i8;
            i11 = 1048575;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(AbstractC0696u abstractC0696u) {
        int i7;
        int b7;
        int i8;
        int[] iArr = this.f9119a;
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int M7 = M(i10);
            int i11 = iArr[i10];
            long j = 1048575 & M7;
            int i12 = 1237;
            int i13 = 37;
            switch (L(M7)) {
                case 0:
                    i7 = i9 * 53;
                    b7 = AbstractC0698w.b(Double.doubleToLongBits(h0.f9196c.d(j, abstractC0696u)));
                    i9 = b7 + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    b7 = Float.floatToIntBits(h0.f9196c.e(j, abstractC0696u));
                    i9 = b7 + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    b7 = AbstractC0698w.b(h0.f9196c.g(j, abstractC0696u));
                    i9 = b7 + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    b7 = AbstractC0698w.b(h0.f9196c.g(j, abstractC0696u));
                    i9 = b7 + i7;
                    break;
                case 4:
                    i7 = i9 * 53;
                    b7 = h0.f9196c.f(j, abstractC0696u);
                    i9 = b7 + i7;
                    break;
                case 5:
                    i7 = i9 * 53;
                    b7 = AbstractC0698w.b(h0.f9196c.g(j, abstractC0696u));
                    i9 = b7 + i7;
                    break;
                case 6:
                    i7 = i9 * 53;
                    b7 = h0.f9196c.f(j, abstractC0696u);
                    i9 = b7 + i7;
                    break;
                case 7:
                    i8 = i9 * 53;
                    boolean c3 = h0.f9196c.c(j, abstractC0696u);
                    Charset charset = AbstractC0698w.f9255a;
                    break;
                case 8:
                    i7 = i9 * 53;
                    b7 = ((String) h0.f9196c.h(j, abstractC0696u)).hashCode();
                    i9 = b7 + i7;
                    break;
                case 9:
                    Object h6 = h0.f9196c.h(j, abstractC0696u);
                    if (h6 != null) {
                        i13 = h6.hashCode();
                    }
                    i9 = (i9 * 53) + i13;
                    break;
                case 10:
                    i7 = i9 * 53;
                    b7 = h0.f9196c.h(j, abstractC0696u).hashCode();
                    i9 = b7 + i7;
                    break;
                case 11:
                    i7 = i9 * 53;
                    b7 = h0.f9196c.f(j, abstractC0696u);
                    i9 = b7 + i7;
                    break;
                case 12:
                    i7 = i9 * 53;
                    b7 = h0.f9196c.f(j, abstractC0696u);
                    i9 = b7 + i7;
                    break;
                case 13:
                    i7 = i9 * 53;
                    b7 = h0.f9196c.f(j, abstractC0696u);
                    i9 = b7 + i7;
                    break;
                case 14:
                    i7 = i9 * 53;
                    b7 = AbstractC0698w.b(h0.f9196c.g(j, abstractC0696u));
                    i9 = b7 + i7;
                    break;
                case 15:
                    i7 = i9 * 53;
                    b7 = h0.f9196c.f(j, abstractC0696u);
                    i9 = b7 + i7;
                    break;
                case 16:
                    i7 = i9 * 53;
                    b7 = AbstractC0698w.b(h0.f9196c.g(j, abstractC0696u));
                    i9 = b7 + i7;
                    break;
                case 17:
                    Object h7 = h0.f9196c.h(j, abstractC0696u);
                    if (h7 != null) {
                        i13 = h7.hashCode();
                    }
                    i9 = (i9 * 53) + i13;
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
                    b7 = h0.f9196c.h(j, abstractC0696u).hashCode();
                    i9 = b7 + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    b7 = h0.f9196c.h(j, abstractC0696u).hashCode();
                    i9 = b7 + i7;
                    break;
                case 51:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = AbstractC0698w.b(Double.doubleToLongBits(((Double) h0.f9196c.h(j, abstractC0696u)).doubleValue()));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = Float.floatToIntBits(((Float) h0.f9196c.h(j, abstractC0696u)).floatValue());
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = AbstractC0698w.b(A(j, abstractC0696u));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = AbstractC0698w.b(A(j, abstractC0696u));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = z(j, abstractC0696u);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = AbstractC0698w.b(A(j, abstractC0696u));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = z(j, abstractC0696u);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i11, i10, abstractC0696u)) {
                        i8 = i9 * 53;
                        boolean booleanValue = ((Boolean) h0.f9196c.h(j, abstractC0696u)).booleanValue();
                        Charset charset2 = AbstractC0698w.f9255a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = ((String) h0.f9196c.h(j, abstractC0696u)).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = h0.f9196c.h(j, abstractC0696u).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = h0.f9196c.h(j, abstractC0696u).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = z(j, abstractC0696u);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = z(j, abstractC0696u);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = z(j, abstractC0696u);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = AbstractC0698w.b(A(j, abstractC0696u));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = z(j, abstractC0696u);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = AbstractC0698w.b(A(j, abstractC0696u));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i11, i10, abstractC0696u)) {
                        i7 = i9 * 53;
                        b7 = h0.f9196c.h(j, abstractC0696u).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f9129l.getClass();
        return abstractC0696u.unknownFields.hashCode() + (i9 * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.V.B(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(AbstractC0696u abstractC0696u, Object obj) {
        int[] iArr = this.f9119a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean z4 = true;
            if (i7 >= length) {
                this.f9129l.getClass();
                return abstractC0696u.unknownFields.equals(((AbstractC0696u) obj).unknownFields);
            }
            int M7 = M(i7);
            long j = M7 & 1048575;
            switch (L(M7)) {
                case 0:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 1:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var2 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 2:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var3 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 3:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var4 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 4:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var5 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 5:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var6 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 6:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var7 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 7:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var8 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 8:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var9 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 9:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var10 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 10:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var11 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 11:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var12 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 12:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var13 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 13:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var14 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 14:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var15 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 15:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var16 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 16:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var17 = h0.f9196c;
                        break;
                    }
                    z4 = false;
                    break;
                case 17:
                    if (j(abstractC0696u, obj, i7)) {
                        g0 g0Var18 = h0.f9196c;
                        break;
                    }
                    z4 = false;
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
                    z4 = V.B(g0Var19.h(j, abstractC0696u), g0Var19.h(j, obj));
                    break;
                case 50:
                    g0 g0Var20 = h0.f9196c;
                    z4 = V.B(g0Var20.h(j, abstractC0696u), g0Var20.h(j, obj));
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
                    if (g0Var21.f(j3, abstractC0696u) == g0Var21.f(j3, obj)) {
                        break;
                    }
                    z4 = false;
                    break;
            }
            if (!z4) {
                return false;
            }
            i7 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void i(Object obj, C0686j c0686j, C0689m c0689m) {
        c0689m.getClass();
        if (p(obj)) {
            r(this.f9129l, obj, c0686j, c0689m);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    public final boolean j(AbstractC0696u abstractC0696u, Object obj, int i7) {
        return n(i7, abstractC0696u) == n(i7, obj);
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
        U a2 = Q.f9136c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a2;
        return a2;
    }

    public final boolean n(int i7, Object obj) {
        int i8 = this.f9119a[i7 + 2];
        long j = i8 & 1048575;
        if (j != 1048575) {
            return ((1 << (i8 >>> 20)) & h0.f9196c.f(j, obj)) != 0;
        }
        int M7 = M(i7);
        long j3 = M7 & 1048575;
        switch (L(M7)) {
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
                Object h6 = h0.f9196c.h(j3, obj);
                if (h6 instanceof String) {
                    return !((String) h6).isEmpty();
                }
                if (h6 instanceof C0683g) {
                    return !C0683g.f9182c.equals(h6);
                }
                throw new IllegalArgumentException();
            case 9:
                return h0.f9196c.h(j3, obj) != null;
            case 10:
                return !C0683g.f9182c.equals(h0.f9196c.h(j3, obj));
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
        return i8 == 1048575 ? n(i7, obj) : (i9 & i10) != 0;
    }

    public final boolean q(int i7, int i8, Object obj) {
        return h0.f9196c.f((long) (this.f9119a[i8 + 2] & 1048575), obj) == i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x064b A[Catch: all -> 0x025f, TryCatch #4 {all -> 0x025f, blocks: (B:54:0x0646, B:56:0x064b, B:57:0x0650, B:50:0x025a, B:78:0x0262, B:79:0x0275, B:80:0x0288, B:81:0x029b, B:82:0x02ae, B:83:0x02c7, B:84:0x02da, B:85:0x02ed, B:86:0x0300, B:87:0x0313, B:88:0x0326, B:89:0x0339, B:90:0x034c, B:91:0x035f, B:92:0x0372, B:93:0x0385, B:94:0x0398, B:95:0x03ab, B:96:0x03be, B:97:0x03d7, B:98:0x03ea, B:99:0x03fd, B:100:0x0411, B:101:0x0419, B:102:0x042c, B:103:0x043f, B:104:0x0452, B:105:0x0465, B:106:0x0478, B:107:0x048b, B:108:0x049e, B:109:0x04b1, B:110:0x04ca, B:111:0x04e0, B:112:0x04f6, B:113:0x050d, B:114:0x0524, B:115:0x053d, B:116:0x0553, B:117:0x0566, B:118:0x057f, B:119:0x058a, B:120:0x05a2, B:121:0x05b9, B:122:0x05d0, B:123:0x05e6, B:124:0x05fc, B:125:0x0611, B:126:0x0629), top: B:53:0x0646 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0656 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(c0 c0Var, Object obj, C0686j c0686j, C0689m c0689m) {
        int i7;
        int i8;
        int L7;
        L3.e eVar;
        A a2;
        int i9;
        Object obj2;
        int[] iArr = this.f9125g;
        int i10 = this.f9127i;
        int i11 = this.f9126h;
        b0 b0Var = null;
        while (true) {
            try {
                int a4 = c0686j.a();
                int B7 = B(a4);
                if (B7 >= 0) {
                    int M7 = M(B7);
                    try {
                        L7 = L(M7);
                        eVar = (L3.e) c0686j.f9213e;
                        a2 = this.f9128k;
                    } catch (C0699x unused) {
                        i7 = i11;
                        i8 = 0;
                    }
                    switch (L7) {
                        case 0:
                            i7 = i11;
                            long y4 = y(M7);
                            c0686j.W(1);
                            h0.f9196c.l(obj, y4, eVar.p());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 1:
                            i7 = i11;
                            long y5 = y(M7);
                            c0686j.W(5);
                            h0.f9196c.m(obj, y5, eVar.t());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 2:
                            i7 = i11;
                            long y7 = y(M7);
                            c0686j.W(0);
                            h0.n(obj, y7, eVar.v());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 3:
                            i7 = i11;
                            long y8 = y(M7);
                            c0686j.W(0);
                            h0.n(obj, y8, eVar.E());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 4:
                            i7 = i11;
                            long y9 = y(M7);
                            c0686j.W(0);
                            h0.m(y9, obj, eVar.u());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 5:
                            i7 = i11;
                            long y10 = y(M7);
                            c0686j.W(1);
                            h0.n(obj, y10, eVar.s());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 6:
                            i7 = i11;
                            long y11 = y(M7);
                            c0686j.W(5);
                            h0.m(y11, obj, eVar.r());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 7:
                            i7 = i11;
                            long y12 = y(M7);
                            c0686j.W(0);
                            h0.f9196c.j(obj, y12, eVar.m());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 8:
                            i7 = i11;
                            E(M7, c0686j, obj);
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 9:
                            i7 = i11;
                            AbstractC0677a abstractC0677a = (AbstractC0677a) v(B7, obj);
                            U m7 = m(B7);
                            c0686j.W(2);
                            c0686j.f(abstractC0677a, m7, c0689m);
                            J(obj, B7, abstractC0677a);
                            i11 = i7;
                            break;
                        case 10:
                            i7 = i11;
                            h0.o(obj, y(M7), c0686j.m());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 11:
                            i7 = i11;
                            long y13 = y(M7);
                            c0686j.W(0);
                            h0.m(y13, obj, eVar.D());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 12:
                            i7 = i11;
                            c0686j.W(0);
                            int q7 = eVar.q();
                            l(B7);
                            h0.m(y(M7), obj, q7);
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 13:
                            i7 = i11;
                            long y14 = y(M7);
                            c0686j.W(5);
                            h0.m(y14, obj, eVar.w());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 14:
                            i7 = i11;
                            long y15 = y(M7);
                            c0686j.W(1);
                            h0.n(obj, y15, eVar.x());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 15:
                            i7 = i11;
                            long y16 = y(M7);
                            c0686j.W(0);
                            h0.m(y16, obj, eVar.y());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 16:
                            i7 = i11;
                            long y17 = y(M7);
                            c0686j.W(0);
                            h0.n(obj, y17, eVar.z());
                            H(B7, obj);
                            i11 = i7;
                            break;
                        case 17:
                            i7 = i11;
                            AbstractC0677a abstractC0677a2 = (AbstractC0677a) v(B7, obj);
                            U m8 = m(B7);
                            c0686j.W(3);
                            c0686j.c(abstractC0677a2, m8, c0689m);
                            J(obj, B7, abstractC0677a2);
                            i11 = i7;
                            break;
                        case 18:
                            i7 = i11;
                            long y18 = y(M7);
                            a2.getClass();
                            c0686j.r(A.b(y18, obj));
                            i11 = i7;
                            break;
                        case 19:
                            i7 = i11;
                            long y19 = y(M7);
                            a2.getClass();
                            c0686j.B(A.b(y19, obj));
                            i11 = i7;
                            break;
                        case 20:
                            i7 = i11;
                            long y20 = y(M7);
                            a2.getClass();
                            c0686j.F(A.b(y20, obj));
                            i11 = i7;
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            i7 = i11;
                            long y21 = y(M7);
                            a2.getClass();
                            c0686j.T(A.b(y21, obj));
                            i11 = i7;
                            break;
                        case 22:
                            i7 = i11;
                            long y22 = y(M7);
                            a2.getClass();
                            c0686j.D(A.b(y22, obj));
                            i11 = i7;
                            break;
                        case 23:
                            i7 = i11;
                            long y23 = y(M7);
                            a2.getClass();
                            c0686j.z(A.b(y23, obj));
                            i11 = i7;
                            break;
                        case 24:
                            i7 = i11;
                            long y24 = y(M7);
                            a2.getClass();
                            c0686j.x(A.b(y24, obj));
                            i11 = i7;
                            break;
                        case 25:
                            i7 = i11;
                            long y25 = y(M7);
                            a2.getClass();
                            c0686j.k(A.b(y25, obj));
                            i11 = i7;
                            break;
                        case 26:
                            i7 = i11;
                            F(M7, c0686j, obj);
                            i11 = i7;
                            break;
                        case 27:
                            i7 = i11;
                            D(obj, M7, c0686j, m(B7), c0689m);
                            i11 = i7;
                            break;
                        case 28:
                            i7 = i11;
                            long y26 = y(M7);
                            a2.getClass();
                            c0686j.p(A.b(y26, obj));
                            i11 = i7;
                            break;
                        case 29:
                            i7 = i11;
                            long y27 = y(M7);
                            a2.getClass();
                            c0686j.R(A.b(y27, obj));
                            i11 = i7;
                            break;
                        case 30:
                            i7 = i11;
                            long y28 = y(M7);
                            a2.getClass();
                            InterfaceC0697v b7 = A.b(y28, obj);
                            c0686j.t(b7);
                            l(B7);
                            V.z(obj, a4, b7, b0Var, c0Var);
                            i11 = i7;
                            break;
                        case 31:
                            i7 = i11;
                            long y29 = y(M7);
                            a2.getClass();
                            c0686j.H(A.b(y29, obj));
                            i11 = i7;
                            break;
                        case 32:
                            i7 = i11;
                            long y30 = y(M7);
                            a2.getClass();
                            c0686j.J(A.b(y30, obj));
                            i11 = i7;
                            break;
                        case 33:
                            i7 = i11;
                            long y31 = y(M7);
                            a2.getClass();
                            c0686j.L(A.b(y31, obj));
                            i11 = i7;
                            break;
                        case 34:
                            i7 = i11;
                            long y32 = y(M7);
                            a2.getClass();
                            c0686j.N(A.b(y32, obj));
                            i11 = i7;
                            break;
                        case 35:
                            i7 = i11;
                            long y33 = y(M7);
                            a2.getClass();
                            c0686j.r(A.b(y33, obj));
                            i11 = i7;
                            break;
                        case 36:
                            i7 = i11;
                            long y34 = y(M7);
                            a2.getClass();
                            c0686j.B(A.b(y34, obj));
                            i11 = i7;
                            break;
                        case 37:
                            i7 = i11;
                            long y35 = y(M7);
                            a2.getClass();
                            c0686j.F(A.b(y35, obj));
                            i11 = i7;
                            break;
                        case 38:
                            i7 = i11;
                            long y36 = y(M7);
                            a2.getClass();
                            c0686j.T(A.b(y36, obj));
                            i11 = i7;
                            break;
                        case 39:
                            i7 = i11;
                            long y37 = y(M7);
                            a2.getClass();
                            c0686j.D(A.b(y37, obj));
                            i11 = i7;
                            break;
                        case 40:
                            i7 = i11;
                            long y38 = y(M7);
                            a2.getClass();
                            c0686j.z(A.b(y38, obj));
                            i11 = i7;
                            break;
                        case 41:
                            i7 = i11;
                            long y39 = y(M7);
                            a2.getClass();
                            c0686j.x(A.b(y39, obj));
                            i11 = i7;
                            break;
                        case 42:
                            i7 = i11;
                            long y40 = y(M7);
                            a2.getClass();
                            c0686j.k(A.b(y40, obj));
                            i11 = i7;
                            break;
                        case 43:
                            i7 = i11;
                            long y41 = y(M7);
                            a2.getClass();
                            c0686j.R(A.b(y41, obj));
                            i11 = i7;
                            break;
                        case 44:
                            i7 = i11;
                            long y42 = y(M7);
                            a2.getClass();
                            InterfaceC0697v b8 = A.b(y42, obj);
                            c0686j.t(b8);
                            l(B7);
                            V.z(obj, a4, b8, b0Var, c0Var);
                            i11 = i7;
                            break;
                        case 45:
                            i7 = i11;
                            long y43 = y(M7);
                            a2.getClass();
                            c0686j.H(A.b(y43, obj));
                            i11 = i7;
                            break;
                        case 46:
                            i7 = i11;
                            long y44 = y(M7);
                            a2.getClass();
                            c0686j.J(A.b(y44, obj));
                            i11 = i7;
                            break;
                        case 47:
                            i7 = i11;
                            long y45 = y(M7);
                            a2.getClass();
                            c0686j.L(A.b(y45, obj));
                            i11 = i7;
                            break;
                        case 48:
                            i7 = i11;
                            long y46 = y(M7);
                            a2.getClass();
                            c0686j.N(A.b(y46, obj));
                            i11 = i7;
                            break;
                        case 49:
                            i7 = i11;
                            i8 = 0;
                            try {
                                C(obj, y(M7), c0686j, m(B7), c0689m);
                            } catch (C0699x unused2) {
                                try {
                                    c0Var.getClass();
                                    if (b0Var == null) {
                                        b0Var = c0.a(obj);
                                    }
                                    if (!c0.c(i8, c0686j, b0Var)) {
                                        for (int i12 = i7; i12 < i10; i12++) {
                                            k(iArr[i12], obj, b0Var);
                                        }
                                        if (b0Var != null) {
                                            ((AbstractC0696u) obj).unknownFields = b0Var;
                                            return;
                                        }
                                        return;
                                    }
                                    i11 = i7;
                                } catch (Throwable th) {
                                    th = th;
                                    for (int i13 = i7; i13 < i10; i13++) {
                                        k(iArr[i13], obj, b0Var);
                                    }
                                    if (b0Var != null) {
                                        c0Var.getClass();
                                        ((AbstractC0696u) obj).unknownFields = b0Var;
                                    }
                                    throw th;
                                }
                            }
                            i11 = i7;
                        case 50:
                            try {
                                obj2 = this.f9120b[(B7 / 3) * 2];
                                i9 = 0;
                            } catch (C0699x unused3) {
                                i9 = 0;
                            }
                            try {
                                s(obj, B7, obj2, c0689m, c0686j);
                                i7 = i11;
                            } catch (C0699x unused4) {
                                i7 = i11;
                                i8 = i9;
                                c0Var.getClass();
                                if (b0Var == null) {
                                }
                                if (!c0.c(i8, c0686j, b0Var)) {
                                }
                                i11 = i7;
                            }
                            i11 = i7;
                            break;
                        case 51:
                            long y47 = y(M7);
                            c0686j.W(1);
                            h0.o(obj, y47, Double.valueOf(eVar.p()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 52:
                            long y48 = y(M7);
                            c0686j.W(5);
                            h0.o(obj, y48, Float.valueOf(eVar.t()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 53:
                            long y49 = y(M7);
                            c0686j.W(0);
                            h0.o(obj, y49, Long.valueOf(eVar.v()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 54:
                            long y50 = y(M7);
                            c0686j.W(0);
                            h0.o(obj, y50, Long.valueOf(eVar.E()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 55:
                            long y51 = y(M7);
                            c0686j.W(0);
                            h0.o(obj, y51, Integer.valueOf(eVar.u()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 56:
                            long y52 = y(M7);
                            c0686j.W(1);
                            h0.o(obj, y52, Long.valueOf(eVar.s()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 57:
                            long y53 = y(M7);
                            c0686j.W(5);
                            h0.o(obj, y53, Integer.valueOf(eVar.r()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 58:
                            long y54 = y(M7);
                            c0686j.W(0);
                            h0.o(obj, y54, Boolean.valueOf(eVar.m()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 59:
                            E(M7, c0686j, obj);
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 60:
                            AbstractC0677a abstractC0677a3 = (AbstractC0677a) w(a4, B7, obj);
                            U m9 = m(B7);
                            c0686j.W(2);
                            c0686j.f(abstractC0677a3, m9, c0689m);
                            K(obj, a4, B7, abstractC0677a3);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 61:
                            h0.o(obj, y(M7), c0686j.m());
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 62:
                            long y55 = y(M7);
                            c0686j.W(0);
                            h0.o(obj, y55, Integer.valueOf(eVar.D()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 63:
                            c0686j.W(0);
                            int q8 = eVar.q();
                            l(B7);
                            h0.o(obj, y(M7), Integer.valueOf(q8));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 64:
                            long y56 = y(M7);
                            c0686j.W(5);
                            h0.o(obj, y56, Integer.valueOf(eVar.w()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 65:
                            long y57 = y(M7);
                            c0686j.W(1);
                            h0.o(obj, y57, Long.valueOf(eVar.x()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 66:
                            long y58 = y(M7);
                            c0686j.W(0);
                            h0.o(obj, y58, Integer.valueOf(eVar.y()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 67:
                            long y59 = y(M7);
                            c0686j.W(0);
                            h0.o(obj, y59, Long.valueOf(eVar.z()));
                            I(a4, B7, obj);
                            i7 = i11;
                            i11 = i7;
                            break;
                        case 68:
                            AbstractC0677a abstractC0677a4 = (AbstractC0677a) w(a4, B7, obj);
                            U m10 = m(B7);
                            c0686j.W(3);
                            c0686j.c(abstractC0677a4, m10, c0689m);
                            K(obj, a4, B7, abstractC0677a4);
                            i7 = i11;
                            i11 = i7;
                            break;
                        default:
                            if (b0Var == null) {
                                c0Var.getClass();
                                b0Var = c0.a(obj);
                            }
                            c0Var.getClass();
                            if (!c0.c(0, c0686j, b0Var)) {
                                while (i11 < i10) {
                                    k(iArr[i11], obj, b0Var);
                                    i11++;
                                }
                                if (b0Var != null) {
                                    ((AbstractC0696u) obj).unknownFields = b0Var;
                                    return;
                                }
                                return;
                            }
                            i7 = i11;
                            i11 = i7;
                            break;
                    }
                } else {
                    if (a4 == Integer.MAX_VALUE) {
                        while (i11 < i10) {
                            k(iArr[i11], obj, b0Var);
                            i11++;
                        }
                        if (b0Var != null) {
                            c0Var.getClass();
                            ((AbstractC0696u) obj).unknownFields = b0Var;
                            return;
                        }
                        return;
                    }
                    c0Var.getClass();
                    if (b0Var == null) {
                        b0Var = c0.a(obj);
                    }
                    if (!c0.c(0, c0686j, b0Var)) {
                        while (i11 < i10) {
                            k(iArr[i11], obj, b0Var);
                            i11++;
                        }
                        if (b0Var != null) {
                            ((AbstractC0696u) obj).unknownFields = b0Var;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i7 = i11;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Object obj, int i7, Object obj2, C0689m c0689m, C0686j c0686j) {
        long M7 = M(i7) & 1048575;
        Object h6 = h0.f9196c.h(M7, obj);
        H h7 = this.f9130m;
        if (h6 == null) {
            h7.getClass();
            h6 = G.f9112b.b();
            h0.o(obj, M7, h6);
        } else {
            h7.getClass();
            if (!((G) h6).f9113a) {
                G b7 = G.f9112b.b();
                H.b(b7, h6);
                h0.o(obj, M7, b7);
                h6 = b7;
            }
        }
        h7.getClass();
        G g3 = (G) h6;
        E e7 = ((F) obj2).f9111a;
        c0686j.W(2);
        L3.e eVar = (L3.e) c0686j.f9213e;
        int l7 = eVar.l(eVar.D());
        Object obj3 = "";
        C0947i c0947i = e7.f9110c;
        Object obj4 = c0947i;
        while (true) {
            try {
                int a2 = c0686j.a();
                if (a2 == Integer.MAX_VALUE || eVar.g()) {
                    break;
                }
                if (a2 == 1) {
                    obj3 = c0686j.v(e7.f9108a, null, null);
                } else if (a2 != 2) {
                    try {
                        if (!c0686j.X()) {
                            throw new C0700y("Unable to parse map entry.");
                        }
                    } catch (C0699x unused) {
                        if (!c0686j.X()) {
                            throw new C0700y("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj4 = c0686j.v(e7.f9109b, c0947i.getClass(), c0689m);
                }
            } catch (Throwable th) {
                eVar.j(l7);
                throw th;
            }
        }
    }

    public final void t(int i7, Object obj, Object obj2) {
        if (n(i7, obj2)) {
            long M7 = M(i7) & 1048575;
            Unsafe unsafe = f9118o;
            Object object = unsafe.getObject(obj2, M7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f9119a[i7] + " is present but null: " + obj2);
            }
            U m7 = m(i7);
            if (!n(i7, obj)) {
                if (p(object)) {
                    AbstractC0696u d7 = m7.d();
                    m7.a(d7, object);
                    unsafe.putObject(obj, M7, d7);
                } else {
                    unsafe.putObject(obj, M7, object);
                }
                H(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M7);
            if (!p(object2)) {
                AbstractC0696u d8 = m7.d();
                m7.a(d8, object2);
                unsafe.putObject(obj, M7, d8);
                object2 = d8;
            }
            m7.a(object2, object);
        }
    }

    public final void u(int i7, Object obj, Object obj2) {
        int[] iArr = this.f9119a;
        int i8 = iArr[i7];
        if (q(i8, i7, obj2)) {
            long M7 = M(i7) & 1048575;
            Unsafe unsafe = f9118o;
            Object object = unsafe.getObject(obj2, M7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            U m7 = m(i7);
            if (!q(i8, i7, obj)) {
                if (p(object)) {
                    AbstractC0696u d7 = m7.d();
                    m7.a(d7, object);
                    unsafe.putObject(obj, M7, d7);
                } else {
                    unsafe.putObject(obj, M7, object);
                }
                I(i8, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M7);
            if (!p(object2)) {
                AbstractC0696u d8 = m7.d();
                m7.a(d8, object2);
                unsafe.putObject(obj, M7, d8);
                object2 = d8;
            }
            m7.a(object2, object);
        }
    }

    public final Object v(int i7, Object obj) {
        U m7 = m(i7);
        long M7 = M(i7) & 1048575;
        if (!n(i7, obj)) {
            return m7.d();
        }
        Object object = f9118o.getObject(obj, M7);
        if (p(object)) {
            return object;
        }
        AbstractC0696u d7 = m7.d();
        if (object != null) {
            m7.a(d7, object);
        }
        return d7;
    }

    public final Object w(int i7, int i8, Object obj) {
        U m7 = m(i8);
        if (!q(i7, i8, obj)) {
            return m7.d();
        }
        Object object = f9118o.getObject(obj, M(i8) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0696u d7 = m7.d();
        if (object != null) {
            m7.a(d7, object);
        }
        return d7;
    }
}
