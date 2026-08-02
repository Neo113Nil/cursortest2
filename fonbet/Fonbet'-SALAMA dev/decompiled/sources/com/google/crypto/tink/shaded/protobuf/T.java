package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;
import a.AbstractC0603a;
import androidx.datastore.preferences.protobuf.C0686j;
import com.google.android.gms.internal.ads.zzbbd;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class T implements c0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f11728o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f11729p = o0.m();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f11730a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f11731b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11732c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11733d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0865a f11734e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11735f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11736g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f11737h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11738i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final V f11739k;

    /* renamed from: l, reason: collision with root package name */
    public final I f11740l;

    /* renamed from: m, reason: collision with root package name */
    public final g0 f11741m;

    /* renamed from: n, reason: collision with root package name */
    public final N f11742n;

    public T(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0865a abstractC0865a, boolean z4, int[] iArr2, int i9, int i10, V v6, I i11, g0 g0Var, C0880p c0880p, N n2) {
        this.f11730a = iArr;
        this.f11731b = objArr;
        this.f11732c = i7;
        this.f11733d = i8;
        this.f11735f = abstractC0865a instanceof AbstractC0886w;
        this.f11736g = z4;
        this.f11737h = iArr2;
        this.f11738i = i9;
        this.j = i10;
        this.f11739k = v6;
        this.f11740l = i11;
        this.f11741m = g0Var;
        this.f11734e = abstractC0865a;
        this.f11742n = n2;
    }

    public static T C(b0 b0Var, V v6, I i7, g0 g0Var, C0880p c0880p, N n2) {
        if (b0Var instanceof b0) {
            return D(b0Var, v6, i7, g0Var, c0880p, n2);
        }
        b0Var.getClass();
        throw new ClassCastException();
    }

    public static T D(b0 b0Var, V v6, I i7, g0 g0Var, C0880p c0880p, N n2) {
        int i8;
        int charAt;
        int charAt2;
        int charAt3;
        int i9;
        int i10;
        int i11;
        int[] iArr;
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
        int i23;
        int i24;
        int i25;
        int[] iArr2;
        boolean z4;
        int i26;
        int i27;
        int i28;
        int i29;
        Field Q6;
        int i30;
        char charAt12;
        int i31;
        int i32;
        int i33;
        Field Q7;
        Field Q8;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        int i36;
        char charAt15;
        int i37;
        char charAt16;
        int i38 = 0;
        boolean z7 = b0Var.d() == 2;
        String c3 = b0Var.c();
        int length = c3.length();
        if (c3.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i8 = i39 + 1;
                if (c3.charAt(i39) < 55296) {
                    break;
                }
                i39 = i8;
            }
        } else {
            i8 = 1;
        }
        int i40 = i8 + 1;
        int charAt17 = c3.charAt(i8);
        if (charAt17 >= 55296) {
            int i41 = charAt17 & 8191;
            int i42 = 13;
            while (true) {
                i37 = i40 + 1;
                charAt16 = c3.charAt(i40);
                if (charAt16 < 55296) {
                    break;
                }
                i41 |= (charAt16 & 8191) << i42;
                i42 += 13;
                i40 = i37;
            }
            charAt17 = i41 | (charAt16 << i42);
            i40 = i37;
        }
        if (charAt17 == 0) {
            i11 = 0;
            charAt = 0;
            charAt2 = 0;
            i9 = 0;
            charAt3 = 0;
            iArr = f11728o;
            i10 = 0;
        } else {
            int i43 = i40 + 1;
            int charAt18 = c3.charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i19 = i43 + 1;
                    charAt11 = c3.charAt(i43);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i44 |= (charAt11 & 8191) << i45;
                    i45 += 13;
                    i43 = i19;
                }
                charAt18 = i44 | (charAt11 << i45);
                i43 = i19;
            }
            int i46 = i43 + 1;
            int charAt19 = c3.charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i18 = i46 + 1;
                    charAt10 = c3.charAt(i46);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i47 |= (charAt10 & 8191) << i48;
                    i48 += 13;
                    i46 = i18;
                }
                charAt19 = i47 | (charAt10 << i48);
                i46 = i18;
            }
            int i49 = i46 + 1;
            int charAt20 = c3.charAt(i46);
            if (charAt20 >= 55296) {
                int i50 = charAt20 & 8191;
                int i51 = 13;
                while (true) {
                    i17 = i49 + 1;
                    charAt9 = c3.charAt(i49);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i50 |= (charAt9 & 8191) << i51;
                    i51 += 13;
                    i49 = i17;
                }
                charAt20 = i50 | (charAt9 << i51);
                i49 = i17;
            }
            int i52 = i49 + 1;
            charAt = c3.charAt(i49);
            if (charAt >= 55296) {
                int i53 = charAt & 8191;
                int i54 = 13;
                while (true) {
                    i16 = i52 + 1;
                    charAt8 = c3.charAt(i52);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i53 |= (charAt8 & 8191) << i54;
                    i54 += 13;
                    i52 = i16;
                }
                charAt = i53 | (charAt8 << i54);
                i52 = i16;
            }
            int i55 = i52 + 1;
            int charAt21 = c3.charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i15 = i55 + 1;
                    charAt7 = c3.charAt(i55);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i56 |= (charAt7 & 8191) << i57;
                    i57 += 13;
                    i55 = i15;
                }
                charAt21 = i56 | (charAt7 << i57);
                i55 = i15;
            }
            int i58 = i55 + 1;
            charAt2 = c3.charAt(i55);
            if (charAt2 >= 55296) {
                int i59 = charAt2 & 8191;
                int i60 = 13;
                while (true) {
                    i14 = i58 + 1;
                    charAt6 = c3.charAt(i58);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i59 |= (charAt6 & 8191) << i60;
                    i60 += 13;
                    i58 = i14;
                }
                charAt2 = i59 | (charAt6 << i60);
                i58 = i14;
            }
            int i61 = i58 + 1;
            int charAt22 = c3.charAt(i58);
            if (charAt22 >= 55296) {
                int i62 = charAt22 & 8191;
                int i63 = 13;
                while (true) {
                    i13 = i61 + 1;
                    charAt5 = c3.charAt(i61);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i62 |= (charAt5 & 8191) << i63;
                    i63 += 13;
                    i61 = i13;
                }
                charAt22 = i62 | (charAt5 << i63);
                i61 = i13;
            }
            int i64 = i61 + 1;
            charAt3 = c3.charAt(i61);
            if (charAt3 >= 55296) {
                int i65 = charAt3 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i12 = i66 + 1;
                    charAt4 = c3.charAt(i66);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i65 |= (charAt4 & 8191) << i67;
                    i67 += 13;
                    i66 = i12;
                }
                charAt3 = i65 | (charAt4 << i67);
                i64 = i12;
            }
            int[] iArr3 = new int[charAt3 + charAt2 + charAt22];
            i9 = (charAt18 * 2) + charAt19;
            i10 = charAt20;
            i11 = charAt21;
            iArr = iArr3;
            i38 = charAt18;
            i40 = i64;
        }
        Unsafe unsafe = f11729p;
        Object[] b7 = b0Var.b();
        Class<?> cls = b0Var.a().getClass();
        int[] iArr4 = new int[i11 * 3];
        Object[] objArr = new Object[i11 * 2];
        int i68 = charAt2 + charAt3;
        int i69 = i68;
        int i70 = charAt3;
        int i71 = 0;
        int i72 = 0;
        while (i40 < length) {
            int i73 = i40 + 1;
            int charAt23 = c3.charAt(i40);
            int i74 = length;
            if (charAt23 >= 55296) {
                int i75 = charAt23 & 8191;
                int i76 = i73;
                int i77 = 13;
                while (true) {
                    i36 = i76 + 1;
                    charAt15 = c3.charAt(i76);
                    i20 = i68;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i75 |= (charAt15 & 8191) << i77;
                    i77 += 13;
                    i76 = i36;
                    i68 = i20;
                }
                charAt23 = i75 | (charAt15 << i77);
                i21 = i36;
            } else {
                i20 = i68;
                i21 = i73;
            }
            int i78 = i21 + 1;
            int charAt24 = c3.charAt(i21);
            if (charAt24 >= 55296) {
                int i79 = charAt24 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i35 = i80 + 1;
                    charAt14 = c3.charAt(i80);
                    i22 = charAt3;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i79 |= (charAt14 & 8191) << i81;
                    i81 += 13;
                    i80 = i35;
                    charAt3 = i22;
                }
                charAt24 = i79 | (charAt14 << i81);
                i23 = i35;
            } else {
                i22 = charAt3;
                i23 = i78;
            }
            int i82 = charAt24 & 255;
            int i83 = charAt;
            if ((charAt24 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            if (i82 >= 51) {
                int i84 = i23 + 1;
                int charAt25 = c3.charAt(i23);
                char c4 = 55296;
                if (charAt25 >= 55296) {
                    int i85 = 13;
                    int i86 = charAt25 & 8191;
                    int i87 = i84;
                    while (true) {
                        i34 = i87 + 1;
                        charAt13 = c3.charAt(i87);
                        if (charAt13 < c4) {
                            break;
                        }
                        i86 |= (charAt13 & 8191) << i85;
                        i85 += 13;
                        i87 = i34;
                        c4 = 55296;
                    }
                    charAt25 = i86 | (charAt13 << i85);
                    i32 = i34;
                } else {
                    i32 = i84;
                }
                int i88 = i32;
                int i89 = i82 - 51;
                i25 = i10;
                if (i89 == 9 || i89 == 17) {
                    i24 = charAt23;
                    i33 = 2;
                    objArr[AbstractC0486a1.d(i71, 3, 2, 1)] = b7[i9];
                    i9++;
                } else if (i89 != 12 || z7) {
                    i24 = charAt23;
                    i33 = 2;
                } else {
                    i24 = charAt23;
                    i33 = 2;
                    objArr[AbstractC0486a1.d(i71, 3, 2, 1)] = b7[i9];
                    i9++;
                }
                int i90 = charAt25 * i33;
                Object obj = b7[i90];
                if (obj instanceof Field) {
                    Q7 = (Field) obj;
                } else {
                    Q7 = Q(cls, (String) obj);
                    b7[i90] = Q7;
                }
                int[] iArr5 = iArr4;
                int objectFieldOffset = (int) unsafe.objectFieldOffset(Q7);
                int i91 = i90 + 1;
                Object obj2 = b7[i91];
                if (obj2 instanceof Field) {
                    Q8 = (Field) obj2;
                } else {
                    Q8 = Q(cls, (String) obj2);
                    b7[i91] = Q8;
                }
                iArr2 = iArr5;
                z4 = z7;
                i26 = i82;
                i23 = i88;
                i27 = (int) unsafe.objectFieldOffset(Q8);
                i29 = objectFieldOffset;
                i28 = 0;
            } else {
                i24 = charAt23;
                i25 = i10;
                int[] iArr6 = iArr4;
                int i92 = i9 + 1;
                Field Q9 = Q(cls, (String) b7[i9]);
                if (i82 == 9 || i82 == 17) {
                    iArr2 = iArr6;
                    z4 = z7;
                    objArr[AbstractC0486a1.d(i71, 3, 2, 1)] = Q9.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        iArr2 = iArr6;
                        z4 = z7;
                        i31 = i9 + 2;
                        objArr[AbstractC0486a1.d(i71, 3, 2, 1)] = b7[i92];
                    } else {
                        if (i82 == 12 || i82 == 30 || i82 == 44) {
                            if (!z7) {
                                iArr2 = iArr6;
                                z4 = z7;
                                i31 = i9 + 2;
                                objArr[AbstractC0486a1.d(i71, 3, 2, 1)] = b7[i92];
                            }
                        } else if (i82 == 50) {
                            int i93 = i70 + 1;
                            iArr[i70] = i71;
                            int i94 = (i71 / 3) * 2;
                            int i95 = i9 + 2;
                            objArr[i94] = b7[i92];
                            if ((charAt24 & 2048) != 0) {
                                i92 = i9 + 3;
                                objArr[i94 + 1] = b7[i95];
                                iArr2 = iArr6;
                                z4 = z7;
                                i70 = i93;
                            } else {
                                iArr2 = iArr6;
                                i70 = i93;
                                i92 = i95;
                                z4 = z7;
                            }
                        }
                        iArr2 = iArr6;
                        z4 = z7;
                    }
                    i92 = i31;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(Q9);
                if ((charAt24 & 4096) != 4096 || i82 > 17) {
                    i26 = i82;
                    i27 = 1048575;
                    i28 = 0;
                } else {
                    int i96 = i23 + 1;
                    int charAt26 = c3.charAt(i23);
                    if (charAt26 >= 55296) {
                        int i97 = charAt26 & 8191;
                        int i98 = 13;
                        while (true) {
                            i30 = i96 + 1;
                            charAt12 = c3.charAt(i96);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i97 |= (charAt12 & 8191) << i98;
                            i98 += 13;
                            i96 = i30;
                        }
                        charAt26 = i97 | (charAt12 << i98);
                        i23 = i30;
                    } else {
                        i23 = i96;
                    }
                    int i99 = (charAt26 / 32) + (i38 * 2);
                    Object obj3 = b7[i99];
                    if (obj3 instanceof Field) {
                        Q6 = (Field) obj3;
                    } else {
                        Q6 = Q(cls, (String) obj3);
                        b7[i99] = Q6;
                    }
                    i26 = i82;
                    i27 = (int) unsafe.objectFieldOffset(Q6);
                    i28 = charAt26 % 32;
                }
                if (i26 >= 18 && i26 <= 49) {
                    iArr[i69] = objectFieldOffset2;
                    i69++;
                }
                i9 = i92;
                i29 = objectFieldOffset2;
            }
            int i100 = i71 + 1;
            iArr2[i71] = i24;
            int i101 = i71 + 2;
            String str = c3;
            iArr2[i100] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i26 << 20) | i29;
            i71 += 3;
            iArr2[i101] = (i28 << 20) | i27;
            i40 = i23;
            iArr4 = iArr2;
            charAt = i83;
            length = i74;
            c3 = str;
            i68 = i20;
            charAt3 = i22;
            z7 = z4;
            i10 = i25;
        }
        return new T(iArr4, objArr, i10, charAt, b0Var.a(), z7, iArr, charAt3, i68, v6, i7, g0Var, c0880p, n2);
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
            StringBuilder k7 = e1.k.k("Field ", str, " for ");
            k7.append(cls.getName());
            k7.append(" not found. Known fields are ");
            k7.append(Arrays.toString(declaredFields));
            throw new RuntimeException(k7.toString());
        }
    }

    public static int W(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void Z(int i7, Object obj, L l7) {
        if (!(obj instanceof String)) {
            l7.b(i7, (AbstractC0873i) obj);
            return;
        }
        String str = (String) obj;
        C0876l c0876l = (C0876l) l7.f11722a;
        c0876l.L0(i7, 2);
        int i8 = c0876l.j;
        try {
            int B02 = C0876l.B0(str.length() * 3);
            int B03 = C0876l.B0(str.length());
            byte[] bArr = c0876l.f11801h;
            int i9 = c0876l.f11802i;
            if (B03 == B02) {
                int i10 = i8 + B03;
                c0876l.j = i10;
                int x4 = r0.f11823a.x(str, bArr, i10, i9 - i10);
                c0876l.j = i8;
                c0876l.M0((x4 - i8) - B03);
                c0876l.j = x4;
            } else {
                c0876l.M0(r0.b(str));
                int i11 = c0876l.j;
                c0876l.j = r0.f11823a.x(str, bArr, i11, i9 - i11);
            }
        } catch (q0 e7) {
            c0876l.j = i8;
            C0876l.f11798k.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(A.f11702a);
            try {
                c0876l.M0(bytes.length);
                c0876l.F0(bytes, 0, bytes.length);
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
        if (obj instanceof AbstractC0886w) {
            return ((AbstractC0886w) obj).p();
        }
        return true;
    }

    public static List v(AbstractC0886w abstractC0886w, long j) {
        return (List) o0.f11810c.i(j, abstractC0886w);
    }

    public final Object A(int i7, Object obj) {
        c0 p5 = p(i7);
        long X6 = X(i7) & 1048575;
        if (!s(i7, obj)) {
            return p5.d();
        }
        Object object = f11729p.getObject(obj, X6);
        if (t(object)) {
            return object;
        }
        Object d7 = p5.d();
        if (object != null) {
            p5.a(d7, object);
        }
        return d7;
    }

    public final Object B(int i7, int i8, Object obj) {
        c0 p5 = p(i8);
        if (!u(i7, i8, obj)) {
            return p5.d();
        }
        Object object = f11729p.getObject(obj, X(i8) & 1048575);
        if (t(object)) {
            return object;
        }
        Object d7 = p5.d();
        if (object != null) {
            p5.a(d7, object);
        }
        return d7;
    }

    public final void H(long j, Object obj, int i7) {
        Unsafe unsafe = f11729p;
        Object o7 = o(i7);
        Object object = unsafe.getObject(obj, j);
        this.f11742n.getClass();
        if (N.c(object)) {
            M e7 = N.e();
            N.d(e7, object);
            unsafe.putObject(obj, j, e7);
        }
        N.a(o7);
        throw null;
    }

    public final int I(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, C0868d c0868d) {
        Unsafe unsafe = f11729p;
        long j3 = this.f11730a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(AbstractC0603a.l(i7, bArr)));
                    int i15 = i7 + 8;
                    unsafe.putInt(obj, j3, i10);
                    return i15;
                }
                break;
            case 52:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(AbstractC0603a.r(i7, bArr)));
                    int i16 = i7 + 4;
                    unsafe.putInt(obj, j3, i10);
                    return i16;
                }
                break;
            case 53:
            case 54:
                if (i11 == 0) {
                    int O7 = AbstractC0603a.O(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Long.valueOf(c0868d.f11762b));
                    unsafe.putInt(obj, j3, i10);
                    return O7;
                }
                break;
            case 55:
            case 62:
                if (i11 == 0) {
                    int M7 = AbstractC0603a.M(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Integer.valueOf(c0868d.f11761a));
                    unsafe.putInt(obj, j3, i10);
                    return M7;
                }
                break;
            case 56:
            case 65:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC0603a.p(i7, bArr)));
                    int i17 = i7 + 8;
                    unsafe.putInt(obj, j3, i10);
                    return i17;
                }
                break;
            case 57:
            case 64:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC0603a.n(i7, bArr)));
                    int i18 = i7 + 4;
                    unsafe.putInt(obj, j3, i10);
                    return i18;
                }
                break;
            case 58:
                if (i11 == 0) {
                    int O8 = AbstractC0603a.O(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Boolean.valueOf(c0868d.f11762b != 0));
                    unsafe.putInt(obj, j3, i10);
                    return O8;
                }
                break;
            case 59:
                if (i11 == 2) {
                    int M8 = AbstractC0603a.M(bArr, i7, c0868d);
                    int i19 = c0868d.f11761a;
                    if (i19 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i12 & 536870912) != 0 && !r0.e(bArr, M8, M8 + i19)) {
                            throw C.b();
                        }
                        unsafe.putObject(obj, j, new String(bArr, M8, i19, A.f11702a));
                        M8 += i19;
                    }
                    unsafe.putInt(obj, j3, i10);
                    return M8;
                }
                break;
            case 60:
                if (i11 == 2) {
                    Object B7 = B(i10, i14, obj);
                    int d02 = AbstractC0603a.d0(B7, p(i14), bArr, i7, i8, c0868d);
                    V(obj, i10, i14, B7);
                    return d02;
                }
                break;
            case 61:
                if (i11 == 2) {
                    int j7 = AbstractC0603a.j(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, c0868d.f11763c);
                    unsafe.putInt(obj, j3, i10);
                    return j7;
                }
                break;
            case 63:
                if (i11 == 0) {
                    int M9 = AbstractC0603a.M(bArr, i7, c0868d);
                    int i20 = c0868d.f11761a;
                    n(i14);
                    unsafe.putObject(obj, j, Integer.valueOf(i20));
                    unsafe.putInt(obj, j3, i10);
                    return M9;
                }
                break;
            case 66:
                if (i11 == 0) {
                    int M10 = AbstractC0603a.M(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Integer.valueOf(L3.e.d(c0868d.f11761a)));
                    unsafe.putInt(obj, j3, i10);
                    return M10;
                }
                break;
            case 67:
                if (i11 == 0) {
                    int O9 = AbstractC0603a.O(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Long.valueOf(L3.e.e(c0868d.f11762b)));
                    unsafe.putInt(obj, j3, i10);
                    return O9;
                }
                break;
            case 68:
                if (i11 == 3) {
                    Object B8 = B(i10, i14, obj);
                    int c0 = AbstractC0603a.c0(B8, p(i14), bArr, i7, i8, (i9 & (-8)) | 4, c0868d);
                    V(obj, i10, i14, B8);
                    return c0;
                }
                break;
        }
        return i7;
    }

    public final int J(Object obj, byte[] bArr, int i7, int i8, int i9, C0868d c0868d) {
        Unsafe unsafe;
        int i10;
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
        int O7;
        int i29;
        int i30;
        T t7 = this;
        byte[] bArr2 = bArr;
        int i31 = i8;
        int i32 = i9;
        C0868d c0868d2 = c0868d;
        l(obj);
        Unsafe unsafe2 = f11729p;
        int i33 = i7;
        int i34 = -1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 1048575;
        while (true) {
            if (i33 < i31) {
                int i39 = i33 + 1;
                byte b7 = bArr2[i33];
                if (b7 < 0) {
                    i12 = AbstractC0603a.L(b7, bArr2, i39, c0868d2);
                    i11 = c0868d2.f11761a;
                } else {
                    i11 = b7;
                    i12 = i39;
                }
                int i40 = i11 >>> 3;
                int i41 = i11 & 7;
                int i42 = t7.f11733d;
                int i43 = i12;
                int i44 = t7.f11732c;
                int i45 = i11;
                if (i40 > i34) {
                    i15 = (i40 < i44 || i40 > i42) ? -1 : t7.T(i40, i35 / 3);
                    i16 = -1;
                    i13 = 0;
                } else {
                    if (i40 < i44 || i40 > i42) {
                        i13 = 0;
                        i14 = -1;
                    } else {
                        i13 = 0;
                        i14 = t7.T(i40, 0);
                    }
                    i15 = i14;
                    i16 = -1;
                }
                if (i15 == i16) {
                    i17 = i38;
                    i18 = i40;
                    i19 = i13;
                    unsafe = unsafe2;
                    i10 = i32;
                    i20 = i43;
                    i21 = i45;
                    i22 = i37;
                } else {
                    int[] iArr = t7.f11730a;
                    int i46 = iArr[i15 + 1];
                    int W6 = W(i46);
                    long j = i46 & 1048575;
                    if (W6 <= 17) {
                        int i47 = iArr[i15 + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        if (i49 != i38) {
                            if (i38 != 1048575) {
                                unsafe2.putInt(obj, i38, i37);
                            }
                            i24 = i49;
                            i23 = unsafe2.getInt(obj, i49);
                        } else {
                            i23 = i37;
                            i24 = i38;
                        }
                        switch (W6) {
                            case 0:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 1) {
                                    o0.r(obj, j, AbstractC0603a.l(i25, bArr2));
                                    i33 = i25 + 8;
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 1:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 5) {
                                    o0.s(obj, j, AbstractC0603a.r(i25, bArr2));
                                    i33 = i25 + 4;
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 2:
                            case 3:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    O7 = AbstractC0603a.O(bArr2, i25, c0868d2);
                                    unsafe2.putLong(obj, j, c0868d2.f11762b);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i33 = O7;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 4:
                            case 11:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    i33 = AbstractC0603a.M(bArr2, i25, c0868d2);
                                    unsafe2.putInt(obj, j, c0868d2.f11761a);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 5:
                            case 14:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 1) {
                                    unsafe2.putLong(obj, j, AbstractC0603a.p(i29, bArr2));
                                    i33 = i29 + 8;
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 6:
                            case 13:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 5) {
                                    unsafe2.putInt(obj, j, AbstractC0603a.n(i29, bArr2));
                                    i33 = i29 + 4;
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 7:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    int O8 = AbstractC0603a.O(bArr2, i29, c0868d2);
                                    o0.n(obj, j, c0868d2.f11762b != 0);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i33 = O8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 8:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 2) {
                                    i33 = (i46 & 536870912) == 0 ? AbstractC0603a.G(bArr2, i29, c0868d2) : AbstractC0603a.J(bArr2, i29, c0868d2);
                                    unsafe2.putObject(obj, j, c0868d2.f11763c);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 9:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 2) {
                                    Object A7 = t7.A(i28, obj);
                                    i33 = AbstractC0603a.d0(A7, t7.p(i28), bArr, i29, i8, c0868d);
                                    t7.U(i28, obj, A7);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 10:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 2) {
                                    i33 = AbstractC0603a.j(bArr2, i29, c0868d2);
                                    unsafe2.putObject(obj, j, c0868d2.f11763c);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 12:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    i33 = AbstractC0603a.M(bArr2, i29, c0868d2);
                                    int i50 = c0868d2.f11761a;
                                    t7.n(i28);
                                    unsafe2.putInt(obj, j, i50);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 15:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    i33 = AbstractC0603a.M(bArr2, i29, c0868d2);
                                    unsafe2.putInt(obj, j, L3.e.d(c0868d2.f11761a));
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 16:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    O7 = AbstractC0603a.O(bArr2, i29, c0868d2);
                                    unsafe2.putLong(obj, j, L3.e.e(c0868d2.f11762b));
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i33 = O7;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 17:
                                if (i41 == 3) {
                                    Object A8 = t7.A(i15, obj);
                                    i27 = i24;
                                    i26 = i45;
                                    i28 = i15;
                                    i18 = i40;
                                    i33 = AbstractC0603a.c0(A8, t7.p(i15), bArr, i43, i8, (i40 << 3) | 4, c0868d);
                                    t7.U(i28, obj, A8);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    i32 = i9;
                                    break;
                                } else {
                                    i18 = i40;
                                    i29 = i43;
                                    i26 = i45;
                                    i27 = i24;
                                    i28 = i15;
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            default:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                i20 = i25;
                                unsafe = unsafe2;
                                i19 = i28;
                                i21 = i26;
                                i17 = i27;
                                i10 = i9;
                                i22 = i23;
                                break;
                        }
                    } else {
                        i18 = i40;
                        int i51 = i15;
                        if (W6 != 27) {
                            i22 = i37;
                            i17 = i38;
                            if (W6 <= 49) {
                                unsafe = unsafe2;
                                i19 = i51;
                                i33 = L(obj, bArr, i43, i8, i45, i41, i51, i46, W6, j, c0868d);
                                if (i33 != i43) {
                                    t7 = this;
                                    bArr2 = bArr;
                                    i31 = i8;
                                    i32 = i9;
                                    c0868d2 = c0868d;
                                    i34 = i18;
                                    i36 = i45;
                                    i37 = i22;
                                    i38 = i17;
                                    unsafe2 = unsafe;
                                    i35 = i19;
                                } else {
                                    i10 = i9;
                                    i20 = i33;
                                }
                            } else {
                                i30 = i43;
                                unsafe = unsafe2;
                                i19 = i51;
                                if (W6 != 50) {
                                    i33 = I(obj, bArr, i30, i8, i45, i18, i41, i46, W6, j, i19, c0868d);
                                    if (i33 != i30) {
                                        t7 = this;
                                        bArr2 = bArr;
                                        i31 = i8;
                                        i32 = i9;
                                        c0868d2 = c0868d;
                                        i35 = i19;
                                        i34 = i18;
                                        i36 = i45;
                                        i37 = i22;
                                        i38 = i17;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i9;
                                        i20 = i33;
                                        i19 = i19;
                                    }
                                } else if (i41 == 2) {
                                    H(j, obj, i19);
                                    throw null;
                                }
                            }
                            i21 = i45;
                        } else if (i41 == 2) {
                            AbstractC0866b abstractC0866b = (AbstractC0866b) ((InterfaceC0889z) unsafe2.getObject(obj, j));
                            boolean m7 = abstractC0866b.m();
                            InterfaceC0889z interfaceC0889z = abstractC0866b;
                            if (!m7) {
                                int size = abstractC0866b.size();
                                InterfaceC0889z a2 = abstractC0866b.a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj, j, a2);
                                interfaceC0889z = a2;
                            }
                            i33 = AbstractC0603a.u(t7.p(i51), i45, bArr, i43, i8, interfaceC0889z, c0868d);
                            i31 = i8;
                            i35 = i51;
                            i34 = i18;
                            i36 = i45;
                            i37 = i37;
                            i38 = i38;
                            i32 = i9;
                        } else {
                            i22 = i37;
                            i17 = i38;
                            i30 = i43;
                            unsafe = unsafe2;
                            i19 = i51;
                        }
                        i10 = i9;
                        i20 = i30;
                        i21 = i45;
                    }
                }
                if (i21 != i10 || i10 == 0) {
                    AbstractC0886w abstractC0886w = (AbstractC0886w) obj;
                    f0 f0Var = abstractC0886w.unknownFields;
                    if (f0Var == f0.f11769f) {
                        f0Var = f0.c();
                        abstractC0886w.unknownFields = f0Var;
                    }
                    i33 = AbstractC0603a.K(i21, bArr, i20, i8, f0Var, c0868d);
                    t7 = this;
                    bArr2 = bArr;
                    i31 = i8;
                    c0868d2 = c0868d;
                    i32 = i10;
                    i36 = i21;
                    i34 = i18;
                    i37 = i22;
                    i38 = i17;
                    unsafe2 = unsafe;
                    i35 = i19;
                } else {
                    i33 = i20;
                    i36 = i21;
                    i37 = i22;
                    i38 = i17;
                }
            } else {
                unsafe = unsafe2;
                i10 = i32;
            }
        }
        if (i38 != 1048575) {
            unsafe.putInt(obj, i38, i37);
        }
        for (int i52 = this.f11738i; i52 < this.j; i52++) {
            m(this.f11737h[i52], obj, null);
        }
        if (i10 == 0) {
            if (i33 != i8) {
                throw C.f();
            }
        } else if (i33 > i8 || i36 != i10) {
            throw C.f();
        }
        return i33;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x009c. Please report as an issue. */
    public final void K(Object obj, byte[] bArr, int i7, int i8, C0868d c0868d) {
        int i9;
        int i10;
        int T6;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int i19;
        int O7;
        int i20;
        T t7 = this;
        byte[] bArr2 = bArr;
        int i21 = i8;
        C0868d c0868d2 = c0868d;
        l(obj);
        Unsafe unsafe2 = f11729p;
        int i22 = 0;
        int i23 = i7;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        int i27 = 1048575;
        while (i23 < i21) {
            int i28 = i23 + 1;
            byte b7 = bArr2[i23];
            if (b7 < 0) {
                i10 = AbstractC0603a.L(b7, bArr2, i28, c0868d2);
                i9 = c0868d2.f11761a;
            } else {
                i9 = b7;
                i10 = i28;
            }
            int i29 = i9 >>> 3;
            int i30 = i9 & 7;
            int i31 = t7.f11733d;
            int i32 = t7.f11732c;
            if (i29 > i26) {
                int i33 = i24 / 3;
                if (i29 >= i32 && i29 <= i31) {
                    T6 = t7.T(i29, i33);
                }
                T6 = -1;
            } else {
                if (i29 >= i32 && i29 <= i31) {
                    T6 = t7.T(i29, i22);
                }
                T6 = -1;
            }
            int i34 = T6;
            if (i34 == -1) {
                i11 = i29;
                i12 = i10;
                i13 = i25;
                i14 = i22;
                i15 = i14;
                unsafe = unsafe2;
            } else {
                int[] iArr = t7.f11730a;
                int i35 = iArr[i34 + 1];
                int W6 = W(i35);
                i11 = i29;
                int i36 = i10;
                long j = i35 & 1048575;
                if (W6 <= 17) {
                    int i37 = iArr[i34 + 2];
                    int i38 = 1 << (i37 >>> 20);
                    int i39 = i37 & 1048575;
                    if (i39 != i27) {
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj, i27, i25);
                        }
                        if (i39 != 1048575) {
                            i25 = unsafe2.getInt(obj, i39);
                        }
                        i18 = i39;
                    } else {
                        i18 = i27;
                    }
                    int i40 = i25;
                    switch (W6) {
                        case 0:
                            i19 = i36;
                            if (i30 != 1) {
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                o0.r(obj, j, AbstractC0603a.l(i19, bArr2));
                                i23 = i19 + 8;
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 1:
                            i19 = i36;
                            if (i30 != 5) {
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                o0.s(obj, j, AbstractC0603a.r(i19, bArr2));
                                i23 = i19 + 4;
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 2:
                        case 3:
                            i19 = i36;
                            if (i30 != 0) {
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                O7 = AbstractC0603a.O(bArr2, i19, c0868d2);
                                unsafe2.putLong(obj, j, c0868d2.f11762b);
                                i25 = i40 | i38;
                                i27 = i18;
                                i24 = i34;
                                i23 = O7;
                                i26 = i11;
                                i22 = 0;
                                i21 = i8;
                                break;
                            }
                        case 4:
                        case 11:
                            i19 = i36;
                            if (i30 != 0) {
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                i23 = AbstractC0603a.M(bArr2, i19, c0868d2);
                                unsafe2.putInt(obj, j, c0868d2.f11761a);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 5:
                        case 14:
                            i20 = i36;
                            if (i30 != 1) {
                                i19 = i20;
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                i19 = i20;
                                unsafe2.putLong(obj, j, AbstractC0603a.p(i20, bArr2));
                                i23 = i19 + 8;
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 6:
                        case 13:
                            i20 = i36;
                            if (i30 != 5) {
                                i19 = i20;
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                unsafe2.putInt(obj, j, AbstractC0603a.n(i20, bArr2));
                                i23 = i20 + 4;
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 7:
                            i20 = i36;
                            if (i30 != 0) {
                                i19 = i20;
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                i23 = AbstractC0603a.O(bArr2, i20, c0868d2);
                                o0.n(obj, j, c0868d2.f11762b != 0);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 8:
                            i20 = i36;
                            if (i30 != 2) {
                                i19 = i20;
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                i23 = (536870912 & i35) == 0 ? AbstractC0603a.G(bArr2, i20, c0868d2) : AbstractC0603a.J(bArr2, i20, c0868d2);
                                unsafe2.putObject(obj, j, c0868d2.f11763c);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 9:
                            i20 = i36;
                            if (i30 != 2) {
                                i19 = i20;
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                Object A7 = t7.A(i34, obj);
                                i23 = AbstractC0603a.d0(A7, t7.p(i34), bArr, i20, i8, c0868d);
                                t7.U(i34, obj, A7);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 10:
                            i20 = i36;
                            if (i30 != 2) {
                                i19 = i20;
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                i23 = AbstractC0603a.j(bArr2, i20, c0868d2);
                                unsafe2.putObject(obj, j, c0868d2.f11763c);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 12:
                            i20 = i36;
                            if (i30 != 0) {
                                i19 = i20;
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                i23 = AbstractC0603a.M(bArr2, i20, c0868d2);
                                unsafe2.putInt(obj, j, c0868d2.f11761a);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 15:
                            i20 = i36;
                            if (i30 != 0) {
                                i19 = i20;
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                i23 = AbstractC0603a.M(bArr2, i20, c0868d2);
                                unsafe2.putInt(obj, j, L3.e.d(c0868d2.f11761a));
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i11;
                                i22 = 0;
                                break;
                            }
                        case 16:
                            if (i30 != 0) {
                                i19 = i36;
                                i13 = i40;
                                i27 = i18;
                                i15 = i34;
                                unsafe = unsafe2;
                                i12 = i19;
                                i14 = 0;
                                break;
                            } else {
                                O7 = AbstractC0603a.O(bArr2, i36, c0868d2);
                                unsafe2.putLong(obj, j, L3.e.e(c0868d2.f11762b));
                                i25 = i40 | i38;
                                i27 = i18;
                                i24 = i34;
                                i23 = O7;
                                i26 = i11;
                                i22 = 0;
                                i21 = i8;
                                break;
                            }
                        default:
                            i19 = i36;
                            i13 = i40;
                            i27 = i18;
                            i15 = i34;
                            unsafe = unsafe2;
                            i12 = i19;
                            i14 = 0;
                            break;
                    }
                } else {
                    if (W6 != 27) {
                        int i41 = i27;
                        int i42 = i25;
                        if (W6 <= 49) {
                            i16 = i41;
                            i13 = i42;
                            i15 = i34;
                            i14 = 0;
                            unsafe = unsafe2;
                            i23 = L(obj, bArr, i36, i8, i9, i30, i34, i35, W6, j, c0868d);
                            if (i23 != i36) {
                                t7 = this;
                                bArr2 = bArr;
                                i21 = i8;
                                c0868d2 = c0868d;
                                i22 = 0;
                                i26 = i11;
                                i27 = i16;
                                i25 = i13;
                                i24 = i15;
                            } else {
                                i12 = i23;
                            }
                        } else {
                            i16 = i41;
                            i13 = i42;
                            i17 = i36;
                            i15 = i34;
                            unsafe = unsafe2;
                            i14 = 0;
                            if (W6 != 50) {
                                i23 = I(obj, bArr, i17, i8, i9, i11, i30, i35, W6, j, i15, c0868d);
                                if (i23 != i17) {
                                    t7 = this;
                                    bArr2 = bArr;
                                    i21 = i8;
                                    c0868d2 = c0868d;
                                    i22 = 0;
                                    i26 = i11;
                                    i24 = i15;
                                    i27 = i16;
                                    i25 = i13;
                                } else {
                                    i12 = i23;
                                    i15 = i15;
                                }
                            } else if (i30 == 2) {
                                H(j, obj, i15);
                                throw null;
                            }
                        }
                        i27 = i16;
                    } else if (i30 == 2) {
                        AbstractC0866b abstractC0866b = (AbstractC0866b) ((InterfaceC0889z) unsafe2.getObject(obj, j));
                        boolean m7 = abstractC0866b.m();
                        InterfaceC0889z interfaceC0889z = abstractC0866b;
                        if (!m7) {
                            int size = abstractC0866b.size();
                            InterfaceC0889z a2 = abstractC0866b.a(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj, j, a2);
                            interfaceC0889z = a2;
                        }
                        i23 = AbstractC0603a.u(t7.p(i34), i9, bArr, i36, i8, interfaceC0889z, c0868d);
                        i25 = i25;
                        i24 = i34;
                        i27 = i27;
                        i26 = i11;
                        i22 = 0;
                        i21 = i8;
                    } else {
                        i13 = i25;
                        i17 = i36;
                        i15 = i34;
                        unsafe = unsafe2;
                        i16 = i27;
                        i14 = 0;
                    }
                    i12 = i17;
                    i27 = i16;
                }
                unsafe2 = unsafe;
            }
            AbstractC0886w abstractC0886w = (AbstractC0886w) obj;
            f0 f0Var = abstractC0886w.unknownFields;
            if (f0Var == f0.f11769f) {
                f0Var = f0.c();
                abstractC0886w.unknownFields = f0Var;
            }
            i23 = AbstractC0603a.K(i9, bArr, i12, i8, f0Var, c0868d);
            t7 = this;
            bArr2 = bArr;
            i21 = i8;
            c0868d2 = c0868d;
            i22 = i14;
            i26 = i11;
            i25 = i13;
            i24 = i15;
            unsafe2 = unsafe;
        }
        int i43 = i25;
        int i44 = i27;
        Unsafe unsafe3 = unsafe2;
        if (i44 != 1048575) {
            unsafe3.putInt(obj, i44, i43);
        }
        if (i23 != i8) {
            throw C.f();
        }
    }

    public final int L(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, long j, int i12, long j3, C0868d c0868d) {
        int N7;
        Unsafe unsafe = f11729p;
        AbstractC0866b abstractC0866b = (AbstractC0866b) ((InterfaceC0889z) unsafe.getObject(obj, j3));
        boolean m7 = abstractC0866b.m();
        InterfaceC0889z interfaceC0889z = abstractC0866b;
        if (!m7) {
            int size = abstractC0866b.size();
            InterfaceC0889z a2 = abstractC0866b.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j3, a2);
            interfaceC0889z = a2;
        }
        switch (i12) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return AbstractC0603a.w(bArr, i7, interfaceC0889z, c0868d);
                }
                if (i10 == 1) {
                    return AbstractC0603a.m(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return AbstractC0603a.z(bArr, i7, interfaceC0889z, c0868d);
                }
                if (i10 == 5) {
                    return AbstractC0603a.s(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i10 == 2) {
                    return AbstractC0603a.D(bArr, i7, interfaceC0889z, c0868d);
                }
                if (i10 == 0) {
                    return AbstractC0603a.P(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return AbstractC0603a.C(bArr, i7, interfaceC0889z, c0868d);
                }
                if (i10 == 0) {
                    return AbstractC0603a.N(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return AbstractC0603a.y(bArr, i7, interfaceC0889z, c0868d);
                }
                if (i10 == 1) {
                    return AbstractC0603a.q(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return AbstractC0603a.x(bArr, i7, interfaceC0889z, c0868d);
                }
                if (i10 == 5) {
                    return AbstractC0603a.o(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return AbstractC0603a.v(bArr, i7, interfaceC0889z, c0868d);
                }
                if (i10 == 0) {
                    return AbstractC0603a.i(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 26:
                if (i10 == 2) {
                    return (j & 536870912) == 0 ? AbstractC0603a.H(i9, bArr, i7, i8, interfaceC0889z, c0868d) : AbstractC0603a.I(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return AbstractC0603a.u(p(i11), i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return AbstractC0603a.k(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    N7 = AbstractC0603a.C(bArr, i7, interfaceC0889z, c0868d);
                } else if (i10 == 0) {
                    N7 = AbstractC0603a.N(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                n(i11);
                Class cls = d0.f11764a;
                return N7;
            case 33:
            case 47:
                if (i10 == 2) {
                    return AbstractC0603a.A(bArr, i7, interfaceC0889z, c0868d);
                }
                if (i10 == 0) {
                    return AbstractC0603a.E(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return AbstractC0603a.B(bArr, i7, interfaceC0889z, c0868d);
                }
                if (i10 == 0) {
                    return AbstractC0603a.F(i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return AbstractC0603a.t(p(i11), i9, bArr, i7, i8, interfaceC0889z, c0868d);
                }
                break;
        }
        return i7;
    }

    public final void M(Object obj, long j, C0686j c0686j, c0 c0Var, C0879o c0879o) {
        int C3;
        List c3 = this.f11740l.c(j, obj);
        int i7 = c0686j.f9210b;
        if ((i7 & 7) != 3) {
            throw C.c();
        }
        do {
            Object d7 = c0Var.d();
            c0686j.d(d7, c0Var, c0879o);
            c0Var.b(d7);
            c3.add(d7);
            L3.e eVar = (L3.e) c0686j.f9213e;
            if (eVar.g() || c0686j.f9212d != 0) {
                return;
            } else {
                C3 = eVar.C();
            }
        } while (C3 == i7);
        c0686j.f9212d = C3;
    }

    public final void N(Object obj, int i7, C0686j c0686j, c0 c0Var, C0879o c0879o) {
        int C3;
        List c3 = this.f11740l.c(i7 & 1048575, obj);
        int i8 = c0686j.f9210b;
        if ((i8 & 7) != 2) {
            throw C.c();
        }
        do {
            Object d7 = c0Var.d();
            c0686j.g(d7, c0Var, c0879o);
            c0Var.b(d7);
            c3.add(d7);
            L3.e eVar = (L3.e) c0686j.f9213e;
            if (eVar.g() || c0686j.f9212d != 0) {
                return;
            } else {
                C3 = eVar.C();
            }
        } while (C3 == i8);
        c0686j.f9212d = C3;
    }

    public final void O(int i7, C0686j c0686j, Object obj) {
        if ((536870912 & i7) != 0) {
            c0686j.W(2);
            o0.v(obj, i7 & 1048575, ((L3.e) c0686j.f9213e).B());
        } else if (!this.f11735f) {
            o0.v(obj, i7 & 1048575, c0686j.n());
        } else {
            c0686j.W(2);
            o0.v(obj, i7 & 1048575, ((L3.e) c0686j.f9213e).A());
        }
    }

    public final void P(int i7, C0686j c0686j, Object obj) {
        boolean z4 = (536870912 & i7) != 0;
        I i8 = this.f11740l;
        if (z4) {
            c0686j.Q(i8.c(i7 & 1048575, obj), true);
        } else {
            c0686j.Q(i8.c(i7 & 1048575, obj), false);
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
    public final void Y(Object obj, L l7) {
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
            int X6 = X(i10);
            int i12 = iArr[i10];
            int W6 = W(X6);
            if (W6 <= 17) {
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
            long j = X6 & i8;
            switch (W6) {
                case 0:
                    if ((i11 & i15) != 0) {
                        l7.c(i12, o0.f11810c.e(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 1:
                    if ((i11 & i15) != 0) {
                        l7.g(o0.f11810c.f(j, obj), i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 2:
                    if ((i11 & i15) != 0) {
                        l7.j(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 3:
                    if ((i11 & i15) != 0) {
                        l7.q(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 4:
                    if ((i11 & i15) != 0) {
                        l7.i(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 5:
                    if ((i11 & i15) != 0) {
                        l7.f(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 6:
                    if ((i11 & i15) != 0) {
                        l7.e(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 7:
                    if ((i11 & i15) != 0) {
                        l7.a(i12, o0.f11810c.c(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 8:
                    if ((i11 & i15) != 0) {
                        Z(i12, unsafe.getObject(obj, j), l7);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 9:
                    if ((i11 & i15) != 0) {
                        l7.k(i12, unsafe.getObject(obj, j), p(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 10:
                    if ((i11 & i15) != 0) {
                        l7.b(i12, (AbstractC0873i) unsafe.getObject(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 11:
                    if ((i11 & i15) != 0) {
                        l7.p(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 12:
                    if ((i11 & i15) != 0) {
                        l7.d(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 13:
                    if ((i11 & i15) != 0) {
                        l7.l(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 14:
                    if ((i11 & i15) != 0) {
                        l7.m(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 15:
                    if ((i11 & i15) != 0) {
                        l7.n(i12, unsafe.getInt(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 16:
                    if ((i11 & i15) != 0) {
                        l7.o(i12, unsafe.getLong(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 17:
                    if ((i11 & i15) != 0) {
                        l7.h(i12, unsafe.getObject(obj, j), p(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 18:
                    d0.F(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 19:
                    d0.J(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 20:
                    d0.M(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case zzbbd.zzt.zzm /* 21 */:
                    d0.U(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 22:
                    d0.L(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 23:
                    d0.I(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 24:
                    d0.H(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 25:
                    d0.D(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 26:
                    d0.S(iArr[i10], (List) unsafe.getObject(obj, j), l7);
                    i10 += 3;
                    i8 = 1048575;
                case 27:
                    d0.N(iArr[i10], (List) unsafe.getObject(obj, j), l7, p(i10));
                    i10 += 3;
                    i8 = 1048575;
                case 28:
                    d0.E(iArr[i10], (List) unsafe.getObject(obj, j), l7);
                    i10 += 3;
                    i8 = 1048575;
                case 29:
                    z4 = false;
                    d0.T(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 30:
                    z4 = false;
                    d0.G(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 31:
                    z4 = false;
                    d0.O(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 32:
                    z4 = false;
                    d0.P(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 33:
                    z4 = false;
                    d0.Q(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 34:
                    z4 = false;
                    d0.R(iArr[i10], (List) unsafe.getObject(obj, j), l7, false);
                    i10 += 3;
                    i8 = 1048575;
                case 35:
                    d0.F(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 36:
                    d0.J(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 37:
                    d0.M(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 38:
                    d0.U(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 39:
                    d0.L(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 40:
                    d0.I(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 41:
                    d0.H(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 42:
                    d0.D(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 43:
                    d0.T(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 44:
                    d0.G(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 45:
                    d0.O(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 46:
                    d0.P(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 47:
                    d0.Q(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 48:
                    d0.R(iArr[i10], (List) unsafe.getObject(obj, j), l7, true);
                    i10 += 3;
                    i8 = 1048575;
                case 49:
                    d0.K(iArr[i10], (List) unsafe.getObject(obj, j), l7, p(i10));
                    i10 += 3;
                    i8 = 1048575;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object o7 = o(i10);
                        this.f11742n.getClass();
                        AbstractC0486a1.n(o7);
                        throw null;
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 51:
                    if (u(i12, i10, obj)) {
                        l7.c(i12, ((Double) o0.f11810c.i(j, obj)).doubleValue());
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 52:
                    if (u(i12, i10, obj)) {
                        l7.g(((Float) o0.f11810c.i(j, obj)).floatValue(), i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 53:
                    if (u(i12, i10, obj)) {
                        l7.j(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 54:
                    if (u(i12, i10, obj)) {
                        l7.q(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 55:
                    if (u(i12, i10, obj)) {
                        l7.i(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 56:
                    if (u(i12, i10, obj)) {
                        l7.f(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 57:
                    if (u(i12, i10, obj)) {
                        l7.e(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 58:
                    if (u(i12, i10, obj)) {
                        l7.a(i12, ((Boolean) o0.f11810c.i(j, obj)).booleanValue());
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 59:
                    if (u(i12, i10, obj)) {
                        Z(i12, unsafe.getObject(obj, j), l7);
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 60:
                    if (u(i12, i10, obj)) {
                        l7.k(i12, unsafe.getObject(obj, j), p(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 61:
                    if (u(i12, i10, obj)) {
                        l7.b(i12, (AbstractC0873i) unsafe.getObject(obj, j));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 62:
                    if (u(i12, i10, obj)) {
                        l7.p(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 63:
                    if (u(i12, i10, obj)) {
                        l7.d(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 64:
                    if (u(i12, i10, obj)) {
                        l7.l(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 65:
                    if (u(i12, i10, obj)) {
                        l7.m(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 66:
                    if (u(i12, i10, obj)) {
                        l7.n(i12, F(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 67:
                    if (u(i12, i10, obj)) {
                        l7.o(i12, G(j, obj));
                    }
                    i10 += 3;
                    i8 = 1048575;
                case 68:
                    if (u(i12, i10, obj)) {
                        l7.h(i12, unsafe.getObject(obj, j), p(i10));
                    }
                    i10 += 3;
                    i8 = 1048575;
                default:
                    i10 += 3;
                    i8 = 1048575;
            }
        }
        this.f11741m.getClass();
        ((AbstractC0886w) obj).unknownFields.e(l7);
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
            int X6 = X(i7);
            long j = 1048575 & X6;
            int i8 = iArr[i7];
            switch (W(X6)) {
                case 0:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.r(obj, j, o0.f11810c.e(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 1:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.s(obj, j, o0.f11810c.f(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 2:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 3:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 4:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 5:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 6:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 7:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.n(obj, j, o0.f11810c.c(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 8:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.v(obj, j, o0.f11810c.i(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 9:
                    y(i7, obj, obj2);
                    break;
                case 10:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.v(obj, j, o0.f11810c.i(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 11:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 12:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 13:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 14:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 15:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.t(j, obj, o0.f11810c.g(j, obj2));
                        R(i7, obj);
                        break;
                    }
                case 16:
                    if (!s(i7, obj2)) {
                        break;
                    } else {
                        o0.u(obj, j, o0.f11810c.h(j, obj2));
                        R(i7, obj);
                        break;
                    }
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
                    Object i9 = n0Var.i(j, obj);
                    Object i10 = n0Var.i(j, obj2);
                    this.f11742n.getClass();
                    o0.v(obj, j, N.d(i9, i10));
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
                    if (!u(i8, i7, obj2)) {
                        break;
                    } else {
                        o0.v(obj, j, o0.f11810c.i(j, obj2));
                        S(i8, i7, obj);
                        break;
                    }
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
                    if (!u(i8, i7, obj2)) {
                        break;
                    } else {
                        o0.v(obj, j, o0.f11810c.i(j, obj2));
                        S(i8, i7, obj);
                        break;
                    }
                case 68:
                    z(i7, obj, obj2);
                    break;
            }
            i7 += 3;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void b(Object obj) {
        if (t(obj)) {
            if (obj instanceof AbstractC0886w) {
                AbstractC0886w abstractC0886w = (AbstractC0886w) obj;
                abstractC0886w.i();
                abstractC0886w.h();
                abstractC0886w.q();
            }
            int length = this.f11730a.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int X6 = X(i7);
                long j = 1048575 & X6;
                int W6 = W(X6);
                if (W6 != 9) {
                    switch (W6) {
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
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (s(i7, obj)) {
                    p(i7).b(f11729p.getObject(obj, j));
                }
            }
            this.f11741m.getClass();
            g0.b(obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final boolean c(Object obj) {
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            boolean z4 = true;
            if (i8 >= this.f11738i) {
                return true;
            }
            int i10 = this.f11737h[i8];
            int[] iArr = this.f11730a;
            int i11 = iArr[i10];
            int X6 = X(i10);
            int i12 = iArr[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i7) {
                if (i13 != 1048575) {
                    i9 = f11729p.getInt(obj, i13);
                }
                i7 = i13;
            }
            if ((268435456 & X6) != 0) {
                if (!(i7 == 1048575 ? s(i10, obj) : (i9 & i14) != 0)) {
                    return false;
                }
            }
            int W6 = W(X6);
            if (W6 == 9 || W6 == 17) {
                if (i7 == 1048575) {
                    z4 = s(i10, obj);
                } else if ((i14 & i9) == 0) {
                    z4 = false;
                }
                if (z4) {
                    if (!p(i10).c(o0.f11810c.i(X6 & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                if (W6 != 27) {
                    if (W6 == 60 || W6 == 68) {
                        if (u(i11, i10, obj)) {
                            if (!p(i10).c(o0.f11810c.i(X6 & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (W6 != 49) {
                        if (W6 != 50) {
                            continue;
                        } else {
                            Object i15 = o0.f11810c.i(X6 & 1048575, obj);
                            this.f11742n.getClass();
                            if (!((M) i15).isEmpty()) {
                                AbstractC0486a1.n(o(i10));
                                throw null;
                            }
                        }
                    }
                }
                List list = (List) o0.f11810c.i(X6 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    c0 p5 = p(i10);
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        if (!p5.c(list.get(i16))) {
                            return false;
                        }
                    }
                }
            }
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final Object d() {
        this.f11739k.getClass();
        return ((AbstractC0886w) this.f11734e).s();
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
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(AbstractC0886w abstractC0886w) {
        int i7;
        int b7;
        int i8;
        int[] iArr = this.f11730a;
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int X6 = X(i10);
            int i11 = iArr[i10];
            long j = 1048575 & X6;
            int i12 = 1237;
            int i13 = 37;
            switch (W(X6)) {
                case 0:
                    i7 = i9 * 53;
                    b7 = A.b(Double.doubleToLongBits(o0.f11810c.e(j, abstractC0886w)));
                    i9 = b7 + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    b7 = Float.floatToIntBits(o0.f11810c.f(j, abstractC0886w));
                    i9 = b7 + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    b7 = A.b(o0.f11810c.h(j, abstractC0886w));
                    i9 = b7 + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    b7 = A.b(o0.f11810c.h(j, abstractC0886w));
                    i9 = b7 + i7;
                    break;
                case 4:
                    i7 = i9 * 53;
                    b7 = o0.f11810c.g(j, abstractC0886w);
                    i9 = b7 + i7;
                    break;
                case 5:
                    i7 = i9 * 53;
                    b7 = A.b(o0.f11810c.h(j, abstractC0886w));
                    i9 = b7 + i7;
                    break;
                case 6:
                    i7 = i9 * 53;
                    b7 = o0.f11810c.g(j, abstractC0886w);
                    i9 = b7 + i7;
                    break;
                case 7:
                    i8 = i9 * 53;
                    boolean c3 = o0.f11810c.c(j, abstractC0886w);
                    Charset charset = A.f11702a;
                    break;
                case 8:
                    i7 = i9 * 53;
                    b7 = ((String) o0.f11810c.i(j, abstractC0886w)).hashCode();
                    i9 = b7 + i7;
                    break;
                case 9:
                    Object i14 = o0.f11810c.i(j, abstractC0886w);
                    if (i14 != null) {
                        i13 = i14.hashCode();
                    }
                    i9 = (i9 * 53) + i13;
                    break;
                case 10:
                    i7 = i9 * 53;
                    b7 = o0.f11810c.i(j, abstractC0886w).hashCode();
                    i9 = b7 + i7;
                    break;
                case 11:
                    i7 = i9 * 53;
                    b7 = o0.f11810c.g(j, abstractC0886w);
                    i9 = b7 + i7;
                    break;
                case 12:
                    i7 = i9 * 53;
                    b7 = o0.f11810c.g(j, abstractC0886w);
                    i9 = b7 + i7;
                    break;
                case 13:
                    i7 = i9 * 53;
                    b7 = o0.f11810c.g(j, abstractC0886w);
                    i9 = b7 + i7;
                    break;
                case 14:
                    i7 = i9 * 53;
                    b7 = A.b(o0.f11810c.h(j, abstractC0886w));
                    i9 = b7 + i7;
                    break;
                case 15:
                    i7 = i9 * 53;
                    b7 = o0.f11810c.g(j, abstractC0886w);
                    i9 = b7 + i7;
                    break;
                case 16:
                    i7 = i9 * 53;
                    b7 = A.b(o0.f11810c.h(j, abstractC0886w));
                    i9 = b7 + i7;
                    break;
                case 17:
                    Object i15 = o0.f11810c.i(j, abstractC0886w);
                    if (i15 != null) {
                        i13 = i15.hashCode();
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
                    b7 = o0.f11810c.i(j, abstractC0886w).hashCode();
                    i9 = b7 + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    b7 = o0.f11810c.i(j, abstractC0886w).hashCode();
                    i9 = b7 + i7;
                    break;
                case 51:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = A.b(Double.doubleToLongBits(((Double) o0.f11810c.i(j, abstractC0886w)).doubleValue()));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = Float.floatToIntBits(((Float) o0.f11810c.i(j, abstractC0886w)).floatValue());
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = A.b(G(j, abstractC0886w));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = A.b(G(j, abstractC0886w));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = F(j, abstractC0886w);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = A.b(G(j, abstractC0886w));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = F(j, abstractC0886w);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i11, i10, abstractC0886w)) {
                        i8 = i9 * 53;
                        boolean booleanValue = ((Boolean) o0.f11810c.i(j, abstractC0886w)).booleanValue();
                        Charset charset2 = A.f11702a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = ((String) o0.f11810c.i(j, abstractC0886w)).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = o0.f11810c.i(j, abstractC0886w).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = o0.f11810c.i(j, abstractC0886w).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = F(j, abstractC0886w);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = F(j, abstractC0886w);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = F(j, abstractC0886w);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = A.b(G(j, abstractC0886w));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = F(j, abstractC0886w);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = A.b(G(j, abstractC0886w));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(i11, i10, abstractC0886w)) {
                        i7 = i9 * 53;
                        b7 = o0.f11810c.i(j, abstractC0886w).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f11741m.getClass();
        return abstractC0886w.unknownFields.hashCode() + (i9 * 53);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final int f(AbstractC0886w abstractC0886w) {
        return this.f11736g ? r(abstractC0886w) : q(abstractC0886w);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void g(Object obj, byte[] bArr, int i7, int i8, C0868d c0868d) {
        if (this.f11736g) {
            K(obj, bArr, i7, i8, c0868d);
        } else {
            J(obj, bArr, i7, i8, 0, c0868d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.d0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.d0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.d0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.d0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.d0.C(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(AbstractC0886w abstractC0886w, Object obj) {
        int[] iArr = this.f11730a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean z4 = true;
            if (i7 >= length) {
                this.f11741m.getClass();
                return abstractC0886w.unknownFields.equals(((AbstractC0886w) obj).unknownFields);
            }
            int X6 = X(i7);
            long j = X6 & 1048575;
            switch (W(X6)) {
                case 0:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 1:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var2 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 2:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var3 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 3:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var4 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 4:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var5 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 5:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var6 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 6:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var7 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 7:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var8 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 8:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var9 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 9:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var10 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 10:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var11 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 11:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var12 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 12:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var13 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 13:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var14 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 14:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var15 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 15:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var16 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 16:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var17 = o0.f11810c;
                        break;
                    }
                    z4 = false;
                    break;
                case 17:
                    if (k(abstractC0886w, obj, i7)) {
                        n0 n0Var18 = o0.f11810c;
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
                    n0 n0Var19 = o0.f11810c;
                    z4 = d0.C(n0Var19.i(j, abstractC0886w), n0Var19.i(j, obj));
                    break;
                case 50:
                    n0 n0Var20 = o0.f11810c;
                    z4 = d0.C(n0Var20.i(j, abstractC0886w), n0Var20.i(j, obj));
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
                    if (n0Var21.g(j3, abstractC0886w) == n0Var21.g(j3, obj)) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void i(Object obj, L l7) {
        l7.getClass();
        if (!this.f11736g) {
            Y(obj, l7);
            return;
        }
        int[] iArr = this.f11730a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int X6 = X(i7);
            int i8 = iArr[i7];
            switch (W(X6)) {
                case 0:
                    if (s(i7, obj)) {
                        l7.c(i8, o0.f11810c.e(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(i7, obj)) {
                        l7.g(o0.f11810c.f(X6 & 1048575, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(i7, obj)) {
                        l7.j(i8, o0.f11810c.h(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(i7, obj)) {
                        l7.q(i8, o0.f11810c.h(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(i7, obj)) {
                        l7.i(i8, o0.f11810c.g(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(i7, obj)) {
                        l7.f(i8, o0.f11810c.h(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(i7, obj)) {
                        l7.e(i8, o0.f11810c.g(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(i7, obj)) {
                        l7.a(i8, o0.f11810c.c(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (s(i7, obj)) {
                        Z(i8, o0.f11810c.i(X6 & 1048575, obj), l7);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (s(i7, obj)) {
                        l7.k(i8, o0.f11810c.i(X6 & 1048575, obj), p(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (s(i7, obj)) {
                        l7.b(i8, (AbstractC0873i) o0.f11810c.i(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(i7, obj)) {
                        l7.p(i8, o0.f11810c.g(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(i7, obj)) {
                        l7.d(i8, o0.f11810c.g(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(i7, obj)) {
                        l7.l(i8, o0.f11810c.g(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(i7, obj)) {
                        l7.m(i8, o0.f11810c.h(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(i7, obj)) {
                        l7.n(i8, o0.f11810c.g(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(i7, obj)) {
                        l7.o(i8, o0.f11810c.h(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (s(i7, obj)) {
                        l7.h(i8, o0.f11810c.i(X6 & 1048575, obj), p(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    d0.F(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 19:
                    d0.J(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 20:
                    d0.M(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    d0.U(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 22:
                    d0.L(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 23:
                    d0.I(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 24:
                    d0.H(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 25:
                    d0.D(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 26:
                    d0.S(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7);
                    break;
                case 27:
                    d0.N(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, p(i7));
                    break;
                case 28:
                    d0.E(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7);
                    break;
                case 29:
                    d0.T(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 30:
                    d0.G(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 31:
                    d0.O(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 32:
                    d0.P(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 33:
                    d0.Q(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 34:
                    d0.R(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, false);
                    break;
                case 35:
                    d0.F(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 36:
                    d0.J(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 37:
                    d0.M(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 38:
                    d0.U(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 39:
                    d0.L(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 40:
                    d0.I(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 41:
                    d0.H(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 42:
                    d0.D(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 43:
                    d0.T(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 44:
                    d0.G(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 45:
                    d0.O(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 46:
                    d0.P(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 47:
                    d0.Q(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 48:
                    d0.R(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, true);
                    break;
                case 49:
                    d0.K(iArr[i7], (List) o0.f11810c.i(X6 & 1048575, obj), l7, p(i7));
                    break;
                case 50:
                    if (o0.f11810c.i(X6 & 1048575, obj) != null) {
                        Object o7 = o(i7);
                        this.f11742n.getClass();
                        AbstractC0486a1.n(o7);
                        throw null;
                    }
                    break;
                case 51:
                    if (u(i8, i7, obj)) {
                        l7.c(i8, ((Double) o0.f11810c.i(X6 & 1048575, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i8, i7, obj)) {
                        l7.g(((Float) o0.f11810c.i(X6 & 1048575, obj)).floatValue(), i8);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i8, i7, obj)) {
                        l7.j(i8, G(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i8, i7, obj)) {
                        l7.q(i8, G(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(i8, i7, obj)) {
                        l7.i(i8, F(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i8, i7, obj)) {
                        l7.f(i8, G(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(i8, i7, obj)) {
                        l7.e(i8, F(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i8, i7, obj)) {
                        l7.a(i8, ((Boolean) o0.f11810c.i(X6 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i8, i7, obj)) {
                        Z(i8, o0.f11810c.i(X6 & 1048575, obj), l7);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(i8, i7, obj)) {
                        l7.k(i8, o0.f11810c.i(X6 & 1048575, obj), p(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i8, i7, obj)) {
                        l7.b(i8, (AbstractC0873i) o0.f11810c.i(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i8, i7, obj)) {
                        l7.p(i8, F(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(i8, i7, obj)) {
                        l7.d(i8, F(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i8, i7, obj)) {
                        l7.l(i8, F(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i8, i7, obj)) {
                        l7.m(i8, G(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i8, i7, obj)) {
                        l7.n(i8, F(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i8, i7, obj)) {
                        l7.o(i8, G(X6 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(i8, i7, obj)) {
                        l7.h(i8, o0.f11810c.i(X6 & 1048575, obj), p(i7));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f11741m.getClass();
        ((AbstractC0886w) obj).unknownFields.e(l7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c0
    public final void j(Object obj, C0686j c0686j, C0879o c0879o) {
        c0879o.getClass();
        l(obj);
        w(this.f11741m, obj, c0686j, c0879o);
    }

    public final boolean k(AbstractC0886w abstractC0886w, Object obj, int i7) {
        return s(i7, abstractC0886w) == s(i7, obj);
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
        c0 a2 = Z.f11748c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a2;
        return a2;
    }

    public final int q(AbstractC0886w abstractC0886w) {
        int i7;
        int k02;
        int i02;
        Unsafe unsafe = f11729p;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = this.f11730a;
            if (i8 >= iArr.length) {
                this.f11741m.getClass();
                return abstractC0886w.unknownFields.b() + i9;
            }
            int X6 = X(i8);
            int i12 = iArr[i8];
            int W6 = W(X6);
            if (W6 <= 17) {
                int i13 = iArr[i8 + 2];
                int i14 = i13 & 1048575;
                i7 = 1 << (i13 >>> 20);
                if (i14 != i11) {
                    i10 = unsafe.getInt(abstractC0886w, i14);
                    i11 = i14;
                }
            } else {
                i7 = 0;
            }
            long j = X6 & 1048575;
            switch (W6) {
                case 0:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.k0(i12);
                        i9 += k02;
                        break;
                    }
                case 1:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.o0(i12);
                        i9 += k02;
                        break;
                    }
                case 2:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.s0(i12, unsafe.getLong(abstractC0886w, j));
                        i9 += k02;
                        break;
                    }
                case 3:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.C0(i12, unsafe.getLong(abstractC0886w, j));
                        i9 += k02;
                        break;
                    }
                case 4:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.q0(i12, unsafe.getInt(abstractC0886w, j));
                        i9 += k02;
                        break;
                    }
                case 5:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.n0(i12);
                        i9 += k02;
                        break;
                    }
                case 6:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.m0(i12);
                        i9 += k02;
                        break;
                    }
                case 7:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.h0(i12);
                        i9 += k02;
                        break;
                    }
                case 8:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0886w, j);
                        i02 = object instanceof AbstractC0873i ? C0876l.i0(i12, (AbstractC0873i) object) : C0876l.x0(i12, (String) object);
                        i9 = i02 + i9;
                        break;
                    }
                case 9:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = d0.o(i12, unsafe.getObject(abstractC0886w, j), p(i8));
                        i9 += k02;
                        break;
                    }
                case 10:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.i0(i12, (AbstractC0873i) unsafe.getObject(abstractC0886w, j));
                        i9 += k02;
                        break;
                    }
                case 11:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.A0(i12, unsafe.getInt(abstractC0886w, j));
                        i9 += k02;
                        break;
                    }
                case 12:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.l0(i12, unsafe.getInt(abstractC0886w, j));
                        i9 += k02;
                        break;
                    }
                case 13:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.t0(i12);
                        i9 += k02;
                        break;
                    }
                case 14:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.u0(i12);
                        i9 += k02;
                        break;
                    }
                case 15:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.v0(i12, unsafe.getInt(abstractC0886w, j));
                        i9 += k02;
                        break;
                    }
                case 16:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.w0(i12, unsafe.getLong(abstractC0886w, j));
                        i9 += k02;
                        break;
                    }
                case 17:
                    if ((i7 & i10) == 0) {
                        break;
                    } else {
                        k02 = C0876l.p0(i12, (AbstractC0865a) unsafe.getObject(abstractC0886w, j), p(i8));
                        i9 += k02;
                        break;
                    }
                case 18:
                    k02 = d0.h(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 19:
                    k02 = d0.f(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 20:
                    k02 = d0.m(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    k02 = d0.x(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 22:
                    k02 = d0.k(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 23:
                    k02 = d0.h(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 24:
                    k02 = d0.f(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 25:
                    k02 = d0.a(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 26:
                    k02 = d0.u(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 27:
                    k02 = d0.p(i12, (List) unsafe.getObject(abstractC0886w, j), p(i8));
                    i9 += k02;
                    break;
                case 28:
                    k02 = d0.c(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 29:
                    k02 = d0.v(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 30:
                    k02 = d0.d(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 31:
                    k02 = d0.f(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 32:
                    k02 = d0.h(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 33:
                    k02 = d0.q(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 34:
                    k02 = d0.s(i12, (List) unsafe.getObject(abstractC0886w, j));
                    i9 += k02;
                    break;
                case 35:
                    int i15 = d0.i((List) unsafe.getObject(abstractC0886w, j));
                    if (i15 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(i15, C0876l.z0(i12), i15, i9);
                        break;
                    }
                case 36:
                    int g3 = d0.g((List) unsafe.getObject(abstractC0886w, j));
                    if (g3 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(g3, C0876l.z0(i12), g3, i9);
                        break;
                    }
                case 37:
                    int n2 = d0.n((List) unsafe.getObject(abstractC0886w, j));
                    if (n2 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(n2, C0876l.z0(i12), n2, i9);
                        break;
                    }
                case 38:
                    int y4 = d0.y((List) unsafe.getObject(abstractC0886w, j));
                    if (y4 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(y4, C0876l.z0(i12), y4, i9);
                        break;
                    }
                case 39:
                    int l7 = d0.l((List) unsafe.getObject(abstractC0886w, j));
                    if (l7 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(l7, C0876l.z0(i12), l7, i9);
                        break;
                    }
                case 40:
                    int i16 = d0.i((List) unsafe.getObject(abstractC0886w, j));
                    if (i16 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(i16, C0876l.z0(i12), i16, i9);
                        break;
                    }
                case 41:
                    int g7 = d0.g((List) unsafe.getObject(abstractC0886w, j));
                    if (g7 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(g7, C0876l.z0(i12), g7, i9);
                        break;
                    }
                case 42:
                    int b7 = d0.b((List) unsafe.getObject(abstractC0886w, j));
                    if (b7 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(b7, C0876l.z0(i12), b7, i9);
                        break;
                    }
                case 43:
                    int w7 = d0.w((List) unsafe.getObject(abstractC0886w, j));
                    if (w7 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(w7, C0876l.z0(i12), w7, i9);
                        break;
                    }
                case 44:
                    int e7 = d0.e((List) unsafe.getObject(abstractC0886w, j));
                    if (e7 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(e7, C0876l.z0(i12), e7, i9);
                        break;
                    }
                case 45:
                    int g8 = d0.g((List) unsafe.getObject(abstractC0886w, j));
                    if (g8 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(g8, C0876l.z0(i12), g8, i9);
                        break;
                    }
                case 46:
                    int i17 = d0.i((List) unsafe.getObject(abstractC0886w, j));
                    if (i17 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(i17, C0876l.z0(i12), i17, i9);
                        break;
                    }
                case 47:
                    int r7 = d0.r((List) unsafe.getObject(abstractC0886w, j));
                    if (r7 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(r7, C0876l.z0(i12), r7, i9);
                        break;
                    }
                case 48:
                    int t7 = d0.t((List) unsafe.getObject(abstractC0886w, j));
                    if (t7 <= 0) {
                        break;
                    } else {
                        i9 = AbstractC0486a1.t(t7, C0876l.z0(i12), t7, i9);
                        break;
                    }
                case 49:
                    k02 = d0.j(i12, (List) unsafe.getObject(abstractC0886w, j), p(i8));
                    i9 += k02;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0886w, j);
                    Object o7 = o(i8);
                    this.f11742n.getClass();
                    N.b(object2, o7);
                    break;
                case 51:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.k0(i12);
                        i9 += k02;
                        break;
                    }
                case 52:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.o0(i12);
                        i9 += k02;
                        break;
                    }
                case 53:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.s0(i12, G(j, abstractC0886w));
                        i9 += k02;
                        break;
                    }
                case 54:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.C0(i12, G(j, abstractC0886w));
                        i9 += k02;
                        break;
                    }
                case 55:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.q0(i12, F(j, abstractC0886w));
                        i9 += k02;
                        break;
                    }
                case 56:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.n0(i12);
                        i9 += k02;
                        break;
                    }
                case 57:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.m0(i12);
                        i9 += k02;
                        break;
                    }
                case 58:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.h0(i12);
                        i9 += k02;
                        break;
                    }
                case 59:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0886w, j);
                        i02 = object3 instanceof AbstractC0873i ? C0876l.i0(i12, (AbstractC0873i) object3) : C0876l.x0(i12, (String) object3);
                        i9 = i02 + i9;
                        break;
                    }
                case 60:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = d0.o(i12, unsafe.getObject(abstractC0886w, j), p(i8));
                        i9 += k02;
                        break;
                    }
                case 61:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.i0(i12, (AbstractC0873i) unsafe.getObject(abstractC0886w, j));
                        i9 += k02;
                        break;
                    }
                case 62:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.A0(i12, F(j, abstractC0886w));
                        i9 += k02;
                        break;
                    }
                case 63:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.l0(i12, F(j, abstractC0886w));
                        i9 += k02;
                        break;
                    }
                case 64:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.t0(i12);
                        i9 += k02;
                        break;
                    }
                case 65:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.u0(i12);
                        i9 += k02;
                        break;
                    }
                case 66:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.v0(i12, F(j, abstractC0886w));
                        i9 += k02;
                        break;
                    }
                case 67:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.w0(i12, G(j, abstractC0886w));
                        i9 += k02;
                        break;
                    }
                case 68:
                    if (!u(i12, i8, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.p0(i12, (AbstractC0865a) unsafe.getObject(abstractC0886w, j), p(i8));
                        i9 += k02;
                        break;
                    }
            }
            i8 += 3;
        }
    }

    public final int r(AbstractC0886w abstractC0886w) {
        int k02;
        Unsafe unsafe = f11729p;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f11730a;
            if (i7 >= iArr.length) {
                this.f11741m.getClass();
                return abstractC0886w.unknownFields.b() + i8;
            }
            int X6 = X(i7);
            int W6 = W(X6);
            int i9 = iArr[i7];
            long j = X6 & 1048575;
            if (W6 >= r.f11818b.a() && W6 <= r.f11819c.a()) {
                int i10 = iArr[i7 + 2];
            }
            switch (W6) {
                case 0:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.k0(i9);
                        break;
                    }
                case 1:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.o0(i9);
                        break;
                    }
                case 2:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.s0(i9, o0.k(abstractC0886w, j));
                        break;
                    }
                case 3:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.C0(i9, o0.k(abstractC0886w, j));
                        break;
                    }
                case 4:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.q0(i9, o0.j(abstractC0886w, j));
                        break;
                    }
                case 5:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.n0(i9);
                        break;
                    }
                case 6:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.m0(i9);
                        break;
                    }
                case 7:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.h0(i9);
                        break;
                    }
                case 8:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        Object l7 = o0.l(abstractC0886w, j);
                        if (!(l7 instanceof AbstractC0873i)) {
                            k02 = C0876l.x0(i9, (String) l7);
                            break;
                        } else {
                            k02 = C0876l.i0(i9, (AbstractC0873i) l7);
                            break;
                        }
                    }
                case 9:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = d0.o(i9, o0.l(abstractC0886w, j), p(i7));
                        break;
                    }
                case 10:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.i0(i9, (AbstractC0873i) o0.l(abstractC0886w, j));
                        break;
                    }
                case 11:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.A0(i9, o0.j(abstractC0886w, j));
                        break;
                    }
                case 12:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.l0(i9, o0.j(abstractC0886w, j));
                        break;
                    }
                case 13:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.t0(i9);
                        break;
                    }
                case 14:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.u0(i9);
                        break;
                    }
                case 15:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.v0(i9, o0.j(abstractC0886w, j));
                        break;
                    }
                case 16:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.w0(i9, o0.k(abstractC0886w, j));
                        break;
                    }
                case 17:
                    if (!s(i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.p0(i9, (AbstractC0865a) o0.l(abstractC0886w, j), p(i7));
                        break;
                    }
                case 18:
                    k02 = d0.h(i9, v(abstractC0886w, j));
                    break;
                case 19:
                    k02 = d0.f(i9, v(abstractC0886w, j));
                    break;
                case 20:
                    k02 = d0.m(i9, v(abstractC0886w, j));
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    k02 = d0.x(i9, v(abstractC0886w, j));
                    break;
                case 22:
                    k02 = d0.k(i9, v(abstractC0886w, j));
                    break;
                case 23:
                    k02 = d0.h(i9, v(abstractC0886w, j));
                    break;
                case 24:
                    k02 = d0.f(i9, v(abstractC0886w, j));
                    break;
                case 25:
                    k02 = d0.a(i9, v(abstractC0886w, j));
                    break;
                case 26:
                    k02 = d0.u(i9, v(abstractC0886w, j));
                    break;
                case 27:
                    k02 = d0.p(i9, v(abstractC0886w, j), p(i7));
                    break;
                case 28:
                    k02 = d0.c(i9, v(abstractC0886w, j));
                    break;
                case 29:
                    k02 = d0.v(i9, v(abstractC0886w, j));
                    break;
                case 30:
                    k02 = d0.d(i9, v(abstractC0886w, j));
                    break;
                case 31:
                    k02 = d0.f(i9, v(abstractC0886w, j));
                    break;
                case 32:
                    k02 = d0.h(i9, v(abstractC0886w, j));
                    break;
                case 33:
                    k02 = d0.q(i9, v(abstractC0886w, j));
                    break;
                case 34:
                    k02 = d0.s(i9, v(abstractC0886w, j));
                    break;
                case 35:
                    int i11 = d0.i((List) unsafe.getObject(abstractC0886w, j));
                    if (i11 > 0) {
                        i8 = AbstractC0486a1.t(i11, C0876l.z0(i9), i11, i8);
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    int g3 = d0.g((List) unsafe.getObject(abstractC0886w, j));
                    if (g3 > 0) {
                        i8 = AbstractC0486a1.t(g3, C0876l.z0(i9), g3, i8);
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    int n2 = d0.n((List) unsafe.getObject(abstractC0886w, j));
                    if (n2 > 0) {
                        i8 = AbstractC0486a1.t(n2, C0876l.z0(i9), n2, i8);
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    int y4 = d0.y((List) unsafe.getObject(abstractC0886w, j));
                    if (y4 > 0) {
                        i8 = AbstractC0486a1.t(y4, C0876l.z0(i9), y4, i8);
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    int l8 = d0.l((List) unsafe.getObject(abstractC0886w, j));
                    if (l8 > 0) {
                        i8 = AbstractC0486a1.t(l8, C0876l.z0(i9), l8, i8);
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    int i12 = d0.i((List) unsafe.getObject(abstractC0886w, j));
                    if (i12 > 0) {
                        i8 = AbstractC0486a1.t(i12, C0876l.z0(i9), i12, i8);
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    int g7 = d0.g((List) unsafe.getObject(abstractC0886w, j));
                    if (g7 > 0) {
                        i8 = AbstractC0486a1.t(g7, C0876l.z0(i9), g7, i8);
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int b7 = d0.b((List) unsafe.getObject(abstractC0886w, j));
                    if (b7 > 0) {
                        i8 = AbstractC0486a1.t(b7, C0876l.z0(i9), b7, i8);
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    int w7 = d0.w((List) unsafe.getObject(abstractC0886w, j));
                    if (w7 > 0) {
                        i8 = AbstractC0486a1.t(w7, C0876l.z0(i9), w7, i8);
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    int e7 = d0.e((List) unsafe.getObject(abstractC0886w, j));
                    if (e7 > 0) {
                        i8 = AbstractC0486a1.t(e7, C0876l.z0(i9), e7, i8);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    int g8 = d0.g((List) unsafe.getObject(abstractC0886w, j));
                    if (g8 > 0) {
                        i8 = AbstractC0486a1.t(g8, C0876l.z0(i9), g8, i8);
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    int i13 = d0.i((List) unsafe.getObject(abstractC0886w, j));
                    if (i13 > 0) {
                        i8 = AbstractC0486a1.t(i13, C0876l.z0(i9), i13, i8);
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    int r7 = d0.r((List) unsafe.getObject(abstractC0886w, j));
                    if (r7 > 0) {
                        i8 = AbstractC0486a1.t(r7, C0876l.z0(i9), r7, i8);
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    int t7 = d0.t((List) unsafe.getObject(abstractC0886w, j));
                    if (t7 > 0) {
                        i8 = AbstractC0486a1.t(t7, C0876l.z0(i9), t7, i8);
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    k02 = d0.j(i9, v(abstractC0886w, j), p(i7));
                    break;
                case 50:
                    Object l9 = o0.l(abstractC0886w, j);
                    Object o7 = o(i7);
                    this.f11742n.getClass();
                    N.b(l9, o7);
                    continue;
                case 51:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.k0(i9);
                        break;
                    }
                case 52:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.o0(i9);
                        break;
                    }
                case 53:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.s0(i9, G(j, abstractC0886w));
                        break;
                    }
                case 54:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.C0(i9, G(j, abstractC0886w));
                        break;
                    }
                case 55:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.q0(i9, F(j, abstractC0886w));
                        break;
                    }
                case 56:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.n0(i9);
                        break;
                    }
                case 57:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.m0(i9);
                        break;
                    }
                case 58:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.h0(i9);
                        break;
                    }
                case 59:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        Object l10 = o0.l(abstractC0886w, j);
                        if (!(l10 instanceof AbstractC0873i)) {
                            k02 = C0876l.x0(i9, (String) l10);
                            break;
                        } else {
                            k02 = C0876l.i0(i9, (AbstractC0873i) l10);
                            break;
                        }
                    }
                case 60:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = d0.o(i9, o0.l(abstractC0886w, j), p(i7));
                        break;
                    }
                case 61:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.i0(i9, (AbstractC0873i) o0.l(abstractC0886w, j));
                        break;
                    }
                case 62:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.A0(i9, F(j, abstractC0886w));
                        break;
                    }
                case 63:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.l0(i9, F(j, abstractC0886w));
                        break;
                    }
                case 64:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.t0(i9);
                        break;
                    }
                case 65:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.u0(i9);
                        break;
                    }
                case 66:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.v0(i9, F(j, abstractC0886w));
                        break;
                    }
                case 67:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.w0(i9, G(j, abstractC0886w));
                        break;
                    }
                case 68:
                    if (!u(i9, i7, abstractC0886w)) {
                        break;
                    } else {
                        k02 = C0876l.p0(i9, (AbstractC0865a) o0.l(abstractC0886w, j), p(i7));
                        break;
                    }
            }
            i8 = k02 + i8;
            i7 += 3;
        }
    }

    public final boolean s(int i7, Object obj) {
        int i8 = this.f11730a[i7 + 2];
        long j = i8 & 1048575;
        if (j != 1048575) {
            return ((1 << (i8 >>> 20)) & o0.f11810c.g(j, obj)) != 0;
        }
        int X6 = X(i7);
        long j3 = X6 & 1048575;
        switch (W(X6)) {
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
                Object i9 = o0.f11810c.i(j3, obj);
                if (i9 instanceof String) {
                    return !((String) i9).isEmpty();
                }
                if (i9 instanceof AbstractC0873i) {
                    return !AbstractC0873i.f11779b.equals(i9);
                }
                throw new IllegalArgumentException();
            case 9:
                return o0.f11810c.i(j3, obj) != null;
            case 10:
                return !AbstractC0873i.f11779b.equals(o0.f11810c.i(j3, obj));
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x05dd A[Catch: all -> 0x0023, TryCatch #2 {all -> 0x0023, blocks: (B:3:0x0011, B:5:0x001a, B:7:0x001e, B:237:0x0043, B:239:0x0048, B:240:0x004c, B:10:0x0065, B:12:0x0069, B:184:0x0079, B:185:0x0085, B:198:0x00a0, B:200:0x00b7, B:202:0x00ce, B:204:0x00e5, B:206:0x00fc, B:208:0x0113, B:210:0x012d, B:212:0x0145, B:214:0x0155, B:216:0x016b, B:218:0x0173, B:220:0x018b, B:222:0x01a3, B:224:0x01bb, B:226:0x01d3, B:228:0x01eb, B:230:0x0203, B:232:0x021b, B:16:0x0233, B:18:0x023c, B:21:0x05d8, B:23:0x05dd, B:24:0x05e2, B:129:0x0458, B:132:0x046d, B:135:0x0483, B:138:0x0499, B:141:0x04af, B:144:0x04c5, B:147:0x04de, B:150:0x04f4, B:153:0x0506, B:156:0x051e, B:159:0x0528, B:162:0x053e, B:165:0x0554, B:168:0x056a, B:171:0x0580, B:174:0x0596, B:177:0x05ac, B:180:0x05c2), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x05e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(g0 g0Var, Object obj, C0686j c0686j, C0879o c0879o) {
        f0 f0Var;
        int[] iArr = this.f11737h;
        int i7 = this.j;
        int i8 = this.f11738i;
        f0 f0Var2 = null;
        while (true) {
            try {
                int a2 = c0686j.a();
                int T6 = (a2 < this.f11732c || a2 > this.f11733d) ? -1 : T(a2, 0);
                if (T6 >= 0) {
                    int X6 = X(T6);
                    try {
                        int W6 = W(X6);
                        L3.e eVar = (L3.e) c0686j.f9213e;
                        I i9 = this.f11740l;
                        switch (W6) {
                            case 0:
                                long E7 = E(X6);
                                c0686j.W(1);
                                o0.r(obj, E7, eVar.p());
                                R(T6, obj);
                                break;
                            case 1:
                                long E8 = E(X6);
                                c0686j.W(5);
                                o0.s(obj, E8, eVar.t());
                                R(T6, obj);
                                break;
                            case 2:
                                long E9 = E(X6);
                                c0686j.W(0);
                                o0.u(obj, E9, eVar.v());
                                R(T6, obj);
                                break;
                            case 3:
                                long E10 = E(X6);
                                c0686j.W(0);
                                o0.u(obj, E10, eVar.E());
                                R(T6, obj);
                                break;
                            case 4:
                                long E11 = E(X6);
                                c0686j.W(0);
                                o0.t(E11, obj, eVar.u());
                                R(T6, obj);
                                break;
                            case 5:
                                long E12 = E(X6);
                                c0686j.W(1);
                                o0.u(obj, E12, eVar.s());
                                R(T6, obj);
                                break;
                            case 6:
                                long E13 = E(X6);
                                c0686j.W(5);
                                o0.t(E13, obj, eVar.r());
                                R(T6, obj);
                                break;
                            case 7:
                                long E14 = E(X6);
                                c0686j.W(0);
                                o0.n(obj, E14, eVar.m());
                                R(T6, obj);
                                break;
                            case 8:
                                O(X6, c0686j, obj);
                                R(T6, obj);
                                break;
                            case 9:
                                Object obj2 = (AbstractC0865a) A(T6, obj);
                                c0 p5 = p(T6);
                                c0686j.W(2);
                                c0686j.g(obj2, p5, c0879o);
                                U(T6, obj, obj2);
                                break;
                            case 10:
                                o0.v(obj, E(X6), c0686j.n());
                                R(T6, obj);
                                break;
                            case 11:
                                long E15 = E(X6);
                                c0686j.W(0);
                                o0.t(E15, obj, eVar.D());
                                R(T6, obj);
                                break;
                            case 12:
                                c0686j.W(0);
                                int q7 = eVar.q();
                                n(T6);
                                o0.t(E(X6), obj, q7);
                                R(T6, obj);
                                break;
                            case 13:
                                long E16 = E(X6);
                                c0686j.W(5);
                                o0.t(E16, obj, eVar.w());
                                R(T6, obj);
                                break;
                            case 14:
                                long E17 = E(X6);
                                c0686j.W(1);
                                o0.u(obj, E17, eVar.x());
                                R(T6, obj);
                                break;
                            case 15:
                                long E18 = E(X6);
                                c0686j.W(0);
                                o0.t(E18, obj, eVar.y());
                                R(T6, obj);
                                break;
                            case 16:
                                long E19 = E(X6);
                                c0686j.W(0);
                                o0.u(obj, E19, eVar.z());
                                R(T6, obj);
                                break;
                            case 17:
                                try {
                                    Object obj3 = (AbstractC0865a) A(T6, obj);
                                    c0 p7 = p(T6);
                                    c0686j.W(3);
                                    c0686j.d(obj3, p7, c0879o);
                                    U(T6, obj, obj3);
                                } catch (B unused) {
                                    g0Var.getClass();
                                    if (f0Var2 == null) {
                                        f0Var2 = g0.a(obj);
                                    }
                                    if (g0.c(f0Var2, c0686j)) {
                                        while (i8 < i7) {
                                            m(iArr[i8], obj, f0Var2);
                                            i8++;
                                        }
                                        if (f0Var2 != null) {
                                            ((AbstractC0886w) obj).unknownFields = f0Var2;
                                            return;
                                        }
                                        return;
                                    }
                                }
                            case 18:
                                f0Var = f0Var2;
                                c0686j.s(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 19:
                                f0Var = f0Var2;
                                c0686j.C(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 20:
                                f0Var = f0Var2;
                                c0686j.G(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case zzbbd.zzt.zzm /* 21 */:
                                f0Var = f0Var2;
                                c0686j.U(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 22:
                                f0Var = f0Var2;
                                c0686j.E(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 23:
                                f0Var = f0Var2;
                                c0686j.A(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 24:
                                f0Var = f0Var2;
                                c0686j.y(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 25:
                                f0Var = f0Var2;
                                c0686j.l(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 26:
                                f0Var = f0Var2;
                                P(X6, c0686j, obj);
                                f0Var2 = f0Var;
                                break;
                            case 27:
                                f0Var = f0Var2;
                                N(obj, X6, c0686j, p(T6), c0879o);
                                f0Var2 = f0Var;
                                break;
                            case 28:
                                f0Var = f0Var2;
                                c0686j.q(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 29:
                                f0Var = f0Var2;
                                c0686j.S(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 30:
                                f0Var = f0Var2;
                                List c3 = i9.c(E(X6), obj);
                                c0686j.u(c3);
                                n(T6);
                                d0.z(obj, a2, c3, f0Var, g0Var);
                                f0Var2 = f0Var;
                                break;
                            case 31:
                                f0Var = f0Var2;
                                c0686j.I(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 32:
                                f0Var = f0Var2;
                                c0686j.K(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 33:
                                f0Var = f0Var2;
                                c0686j.M(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 34:
                                f0Var = f0Var2;
                                c0686j.O(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 35:
                                f0Var = f0Var2;
                                c0686j.s(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 36:
                                f0Var = f0Var2;
                                c0686j.C(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 37:
                                f0Var = f0Var2;
                                c0686j.G(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 38:
                                f0Var = f0Var2;
                                c0686j.U(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 39:
                                f0Var = f0Var2;
                                c0686j.E(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 40:
                                f0Var = f0Var2;
                                c0686j.A(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 41:
                                f0Var = f0Var2;
                                c0686j.y(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 42:
                                f0Var = f0Var2;
                                c0686j.l(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 43:
                                f0Var = f0Var2;
                                c0686j.S(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 44:
                                f0Var = f0Var2;
                                List c4 = i9.c(E(X6), obj);
                                c0686j.u(c4);
                                n(T6);
                                d0.z(obj, a2, c4, f0Var, g0Var);
                                f0Var2 = f0Var;
                                break;
                            case 45:
                                f0Var = f0Var2;
                                c0686j.I(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 46:
                                f0Var = f0Var2;
                                c0686j.K(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 47:
                                f0Var = f0Var2;
                                c0686j.M(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 48:
                                f0Var = f0Var2;
                                c0686j.O(i9.c(E(X6), obj));
                                f0Var2 = f0Var;
                                break;
                            case 49:
                                try {
                                    f0Var = f0Var2;
                                } catch (B unused2) {
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    M(obj, E(X6), c0686j, p(T6), c0879o);
                                    f0Var2 = f0Var;
                                    break;
                                } catch (B unused3) {
                                    f0Var2 = f0Var;
                                    g0Var.getClass();
                                    if (f0Var2 == null) {
                                    }
                                    if (g0.c(f0Var2, c0686j)) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    f0Var2 = f0Var;
                                    while (i8 < i7) {
                                        m(iArr[i8], obj, f0Var2);
                                        i8++;
                                    }
                                    if (f0Var2 != null) {
                                        g0Var.getClass();
                                        ((AbstractC0886w) obj).unknownFields = f0Var2;
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                x(T6, obj, o(T6));
                                throw null;
                                break;
                            case 51:
                                long E20 = E(X6);
                                c0686j.W(1);
                                o0.v(obj, E20, Double.valueOf(eVar.p()));
                                S(a2, T6, obj);
                                break;
                            case 52:
                                long E21 = E(X6);
                                c0686j.W(5);
                                o0.v(obj, E21, Float.valueOf(eVar.t()));
                                S(a2, T6, obj);
                                break;
                            case 53:
                                long E22 = E(X6);
                                c0686j.W(0);
                                o0.v(obj, E22, Long.valueOf(eVar.v()));
                                S(a2, T6, obj);
                                break;
                            case 54:
                                long E23 = E(X6);
                                c0686j.W(0);
                                o0.v(obj, E23, Long.valueOf(eVar.E()));
                                S(a2, T6, obj);
                                break;
                            case 55:
                                long E24 = E(X6);
                                c0686j.W(0);
                                o0.v(obj, E24, Integer.valueOf(eVar.u()));
                                S(a2, T6, obj);
                                break;
                            case 56:
                                long E25 = E(X6);
                                c0686j.W(1);
                                o0.v(obj, E25, Long.valueOf(eVar.s()));
                                S(a2, T6, obj);
                                break;
                            case 57:
                                long E26 = E(X6);
                                c0686j.W(5);
                                o0.v(obj, E26, Integer.valueOf(eVar.r()));
                                S(a2, T6, obj);
                                break;
                            case 58:
                                long E27 = E(X6);
                                c0686j.W(0);
                                o0.v(obj, E27, Boolean.valueOf(eVar.m()));
                                S(a2, T6, obj);
                                break;
                            case 59:
                                O(X6, c0686j, obj);
                                S(a2, T6, obj);
                                break;
                            case 60:
                                Object obj4 = (AbstractC0865a) B(a2, T6, obj);
                                c0 p8 = p(T6);
                                c0686j.W(2);
                                c0686j.g(obj4, p8, c0879o);
                                V(obj, a2, T6, obj4);
                                break;
                            case 61:
                                o0.v(obj, E(X6), c0686j.n());
                                S(a2, T6, obj);
                                break;
                            case 62:
                                long E28 = E(X6);
                                c0686j.W(0);
                                o0.v(obj, E28, Integer.valueOf(eVar.D()));
                                S(a2, T6, obj);
                                break;
                            case 63:
                                c0686j.W(0);
                                int q8 = eVar.q();
                                n(T6);
                                o0.v(obj, E(X6), Integer.valueOf(q8));
                                S(a2, T6, obj);
                                break;
                            case 64:
                                long E29 = E(X6);
                                c0686j.W(5);
                                o0.v(obj, E29, Integer.valueOf(eVar.w()));
                                S(a2, T6, obj);
                                break;
                            case 65:
                                long E30 = E(X6);
                                c0686j.W(1);
                                o0.v(obj, E30, Long.valueOf(eVar.x()));
                                S(a2, T6, obj);
                                break;
                            case 66:
                                long E31 = E(X6);
                                c0686j.W(0);
                                o0.v(obj, E31, Integer.valueOf(eVar.y()));
                                S(a2, T6, obj);
                                break;
                            case 67:
                                long E32 = E(X6);
                                c0686j.W(0);
                                o0.v(obj, E32, Long.valueOf(eVar.z()));
                                S(a2, T6, obj);
                                break;
                            case 68:
                                Object obj5 = (AbstractC0865a) B(a2, T6, obj);
                                c0 p9 = p(T6);
                                c0686j.W(3);
                                c0686j.d(obj5, p9, c0879o);
                                V(obj, a2, T6, obj5);
                                break;
                            default:
                                if (f0Var2 == null) {
                                    g0Var.getClass();
                                    f0Var2 = g0.a(obj);
                                }
                                g0Var.getClass();
                                if (!g0.c(f0Var2, c0686j)) {
                                    while (i8 < i7) {
                                        m(iArr[i8], obj, f0Var2);
                                        i8++;
                                    }
                                    if (f0Var2 != null) {
                                        ((AbstractC0886w) obj).unknownFields = f0Var2;
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (B unused4) {
                    }
                } else {
                    if (a2 == Integer.MAX_VALUE) {
                        while (i8 < i7) {
                            m(iArr[i8], obj, f0Var2);
                            i8++;
                        }
                        if (f0Var2 != null) {
                            g0Var.getClass();
                            ((AbstractC0886w) obj).unknownFields = f0Var2;
                            return;
                        }
                        return;
                    }
                    g0Var.getClass();
                    if (f0Var2 == null) {
                        f0Var2 = g0.a(obj);
                    }
                    if (!g0.c(f0Var2, c0686j)) {
                        while (i8 < i7) {
                            m(iArr[i8], obj, f0Var2);
                            i8++;
                        }
                        if (f0Var2 != null) {
                            ((AbstractC0886w) obj).unknownFields = f0Var2;
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
        long X6 = X(i7) & 1048575;
        Object i8 = o0.f11810c.i(X6, obj);
        N n2 = this.f11742n;
        if (i8 != null) {
            n2.getClass();
            if (N.c(i8)) {
                M c3 = M.f11723b.c();
                N.d(c3, i8);
                o0.v(obj, X6, c3);
                i8 = c3;
            }
        } else {
            n2.getClass();
            i8 = M.f11723b.c();
            o0.v(obj, X6, i8);
        }
        n2.getClass();
        AbstractC0486a1.n(obj2);
        throw null;
    }

    public final void y(int i7, Object obj, Object obj2) {
        if (s(i7, obj2)) {
            long X6 = X(i7) & 1048575;
            Unsafe unsafe = f11729p;
            Object object = unsafe.getObject(obj2, X6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f11730a[i7] + " is present but null: " + obj2);
            }
            c0 p5 = p(i7);
            if (!s(i7, obj)) {
                if (t(object)) {
                    Object d7 = p5.d();
                    p5.a(d7, object);
                    unsafe.putObject(obj, X6, d7);
                } else {
                    unsafe.putObject(obj, X6, object);
                }
                R(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, X6);
            if (!t(object2)) {
                Object d8 = p5.d();
                p5.a(d8, object2);
                unsafe.putObject(obj, X6, d8);
                object2 = d8;
            }
            p5.a(object2, object);
        }
    }

    public final void z(int i7, Object obj, Object obj2) {
        int[] iArr = this.f11730a;
        int i8 = iArr[i7];
        if (u(i8, i7, obj2)) {
            long X6 = X(i7) & 1048575;
            Unsafe unsafe = f11729p;
            Object object = unsafe.getObject(obj2, X6);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            c0 p5 = p(i7);
            if (!u(i8, i7, obj)) {
                if (t(object)) {
                    Object d7 = p5.d();
                    p5.a(d7, object);
                    unsafe.putObject(obj, X6, d7);
                } else {
                    unsafe.putObject(obj, X6, object);
                }
                S(i8, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, X6);
            if (!t(object2)) {
                Object d8 = p5.d();
                p5.a(d8, object2);
                unsafe.putObject(obj, X6, d8);
                object2 = d8;
            }
            p5.a(object2, object);
        }
    }
}
