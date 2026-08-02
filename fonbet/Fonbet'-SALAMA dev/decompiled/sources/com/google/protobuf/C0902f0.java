package com.google.protobuf;

import W5.AbstractC0486a1;
import androidx.datastore.preferences.protobuf.C0686j;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.crypto.tink.shaded.protobuf.C0868d;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0902f0 implements InterfaceC0925r0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f12185n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f12186o = K0.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f12187a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f12188b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12189c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12190d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0891a f12191e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12192f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f12193g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12194h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12195i;
    public final C0906h0 j;

    /* renamed from: k, reason: collision with root package name */
    public final U f12196k;

    /* renamed from: l, reason: collision with root package name */
    public final C0 f12197l;

    /* renamed from: m, reason: collision with root package name */
    public final C0894b0 f12198m;

    public C0902f0(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0891a abstractC0891a, int[] iArr2, int i9, int i10, C0906h0 c0906h0, U u4, C0 c0, C0930u c0930u, C0894b0 c0894b0) {
        this.f12187a = iArr;
        this.f12188b = objArr;
        this.f12189c = i7;
        this.f12190d = i8;
        this.f12192f = abstractC0891a instanceof C;
        this.f12193g = iArr2;
        this.f12194h = i9;
        this.f12195i = i10;
        this.j = c0906h0;
        this.f12196k = u4;
        this.f12197l = c0;
        this.f12191e = abstractC0891a;
        this.f12198m = c0894b0;
    }

    public static C0902f0 A(C0920o0 c0920o0, C0906h0 c0906h0, U u4, C0 c0, C0930u c0930u, C0894b0 c0894b0) {
        if (c0920o0 instanceof C0920o0) {
            return B(c0920o0, c0906h0, u4, c0, c0930u, c0894b0);
        }
        c0920o0.getClass();
        throw new ClassCastException();
    }

    public static C0902f0 B(C0920o0 c0920o0, C0906h0 c0906h0, U u4, C0 c0, C0930u c0930u, C0894b0 c0894b0) {
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
        Field N7;
        int i33;
        char charAt11;
        int i34;
        int i35;
        Field N8;
        Field N9;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        int i39;
        char charAt15;
        String c3 = c0920o0.c();
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
            iArr = f12185n;
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
        Unsafe unsafe = f12186o;
        Object[] b7 = c0920o0.b();
        Class<?> cls = c0920o0.a().getClass();
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
                } else if (t.e.b(c0920o0.d(), 1) || (charAt24 & 2048) != 0) {
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
                    N8 = (Field) obj;
                } else {
                    N8 = N(cls, (String) obj);
                    b7[i90] = N8;
                }
                i32 = (int) unsafe.objectFieldOffset(N8);
                int i91 = i90 + 1;
                Object obj2 = b7[i91];
                if (obj2 instanceof Field) {
                    N9 = (Field) obj2;
                } else {
                    N9 = N(cls, (String) obj2);
                    b7[i91] = N9;
                }
                i27 = charAt23;
                iArr2 = iArr4;
                iArr3 = iArr;
                i42 = i89;
                i31 = (int) unsafe.objectFieldOffset(N9);
                i30 = 0;
            } else {
                i25 = i74;
                i26 = i9;
                int i92 = i10 + 1;
                Field N10 = N(cls, (String) b7[i10]);
                if (i83 == 9 || i83 == 17) {
                    i27 = charAt23;
                    iArr2 = iArr4;
                    objArr[AbstractC0486a1.d(i73, 3, 2, 1)] = N10.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i27 = charAt23;
                        iArr2 = iArr4;
                        i34 = i10 + 2;
                        objArr[AbstractC0486a1.d(i73, 3, 2, 1)] = b7[i92];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i27 = charAt23;
                        if (c0920o0.d() == 1 || (charAt24 & 2048) != 0) {
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
                int objectFieldOffset = (int) unsafe.objectFieldOffset(N10);
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
                        N7 = (Field) obj3;
                    } else {
                        N7 = N(cls, (String) obj3);
                        b7[i98] = N7;
                    }
                    iArr3 = iArr;
                    i28 = (int) unsafe.objectFieldOffset(N7);
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
        return new C0902f0(iArr4, objArr, i9, i12, c0920o0.a(), iArr, i11, i70, c0906h0, u4, c0, c0930u, c0894b0);
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
            StringBuilder k7 = e1.k.k("Field ", str, " for ");
            k7.append(cls.getName());
            k7.append(" not found. Known fields are ");
            k7.append(Arrays.toString(declaredFields));
            throw new RuntimeException(k7.toString());
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

    public static int m(byte[] bArr, int i7, int i8, S0 s02, Class cls, C0868d c0868d) {
        switch (s02.ordinal()) {
            case 0:
                c0868d.f11763c = Double.valueOf(w0.h(i7, bArr));
                return i7 + 8;
            case 1:
                c0868d.f11763c = Float.valueOf(w0.n(i7, bArr));
                return i7 + 4;
            case 2:
            case 3:
                int N7 = w0.N(bArr, i7, c0868d);
                c0868d.f11763c = Long.valueOf(c0868d.f11762b);
                return N7;
            case 4:
            case 12:
            case 13:
                int L7 = w0.L(bArr, i7, c0868d);
                c0868d.f11763c = Integer.valueOf(c0868d.f11761a);
                return L7;
            case 5:
            case 15:
                c0868d.f11763c = Long.valueOf(w0.l(i7, bArr));
                return i7 + 8;
            case 6:
            case 14:
                c0868d.f11763c = Integer.valueOf(w0.j(i7, bArr));
                return i7 + 4;
            case 7:
                int N8 = w0.N(bArr, i7, c0868d);
                c0868d.f11763c = Boolean.valueOf(c0868d.f11762b != 0);
                return N8;
            case 8:
                return w0.F(bArr, i7, c0868d);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                InterfaceC0925r0 a2 = C0916m0.f12232c.a(cls);
                C d7 = a2.d();
                int T6 = w0.T(d7, a2, bArr, i7, i8, c0868d);
                a2.b(d7);
                c0868d.f11763c = d7;
                return T6;
            case 11:
                return w0.f(bArr, i7, c0868d);
            case 16:
                int L8 = w0.L(bArr, i7, c0868d);
                c0868d.f11763c = Integer.valueOf(H6.b.b(c0868d.f11761a));
                return L8;
            case 17:
                int N9 = w0.N(bArr, i7, c0868d);
                c0868d.f11763c = Long.valueOf(H6.b.d(c0868d.f11762b));
                return N9;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public final int F(Object obj, byte[] bArr, int i7, int i8, int i9, long j, C0868d c0868d) {
        Unsafe unsafe = f12186o;
        Object p5 = p(i9);
        Object object = unsafe.getObject(obj, j);
        this.f12198m.getClass();
        if (C0894b0.d(object)) {
            C0892a0 f7 = C0894b0.f();
            C0894b0.e(f7, object);
            unsafe.putObject(obj, j, f7);
            object = f7;
        }
        Y a2 = C0894b0.a(p5);
        C0892a0 b7 = C0894b0.b(object);
        int L7 = w0.L(bArr, i7, c0868d);
        int i10 = c0868d.f11761a;
        if (i10 < 0 || i10 > i8 - L7) {
            throw M.h();
        }
        int i11 = L7 + i10;
        Object obj2 = a2.f12171c;
        Object obj3 = "";
        Object obj4 = obj2;
        while (L7 < i11) {
            int i12 = L7 + 1;
            byte b8 = bArr[L7];
            if (b8 < 0) {
                i12 = w0.K(b8, bArr, i12, c0868d);
                b8 = c0868d.f11761a;
            }
            int i13 = b8 >>> 3;
            int i14 = b8 & 7;
            if (i13 != 1) {
                if (i13 == 2) {
                    S0 s02 = a2.f12170b;
                    if (i14 == s02.f12153b) {
                        L7 = m(bArr, i12, i8, s02, obj2.getClass(), c0868d);
                        obj4 = c0868d.f11763c;
                    }
                }
                L7 = w0.V(b8, bArr, i12, i8, c0868d);
            } else {
                O0 o02 = a2.f12169a;
                if (i14 == o02.f12153b) {
                    L7 = m(bArr, i12, i8, o02, null, c0868d);
                    obj3 = c0868d.f11763c;
                } else {
                    L7 = w0.V(b8, bArr, i12, i8, c0868d);
                }
            }
        }
        if (L7 != i11) {
            throw M.g();
        }
        b7.put(obj3, obj4);
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0308, code lost:
    
        if (r0 != r33) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x030a, code lost:
    
        r15 = r31;
        r13 = r32;
        r3 = r19;
        r11 = r34;
        r10 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0323, code lost:
    
        r6 = r19;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0355, code lost:
    
        if (r0 != r15) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0375, code lost:
    
        if (r0 != r15) goto L113;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00b8. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int G(Object obj, byte[] bArr, int i7, int i8, int i9, C0868d c0868d) {
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
        int N7;
        int i27;
        int i28;
        C0902f0 c0902f0 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i29 = i8;
        int i30 = i9;
        C0868d c0868d2 = c0868d;
        l(obj);
        Unsafe unsafe2 = f12186o;
        int i31 = i7;
        int i32 = -1;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 1048575;
        while (true) {
            if (i31 < i29) {
                int i37 = i31 + 1;
                byte b7 = bArr2[i31];
                if (b7 < 0) {
                    i12 = w0.K(b7, bArr2, i37, c0868d2);
                    i11 = c0868d2.f11761a;
                } else {
                    i11 = b7;
                    i12 = i37;
                }
                int i38 = i11 >>> 3;
                int i39 = i11 & 7;
                int i40 = c0902f0.f12190d;
                int i41 = i12;
                int i42 = c0902f0.f12189c;
                int i43 = i11;
                if (i38 > i32) {
                    i15 = (i38 < i42 || i38 > i40) ? -1 : c0902f0.Q(i38, i33 / 3);
                    i16 = -1;
                    i13 = 0;
                } else {
                    if (i38 < i42 || i38 > i40) {
                        i13 = 0;
                        i14 = -1;
                    } else {
                        i13 = 0;
                        i14 = c0902f0.Q(i38, 0);
                    }
                    i15 = i14;
                    i16 = -1;
                }
                if (i15 == i16) {
                    i17 = i41;
                    i18 = i35;
                    i19 = i36;
                    i20 = i13;
                    unsafe = unsafe2;
                    i21 = i38;
                    i10 = i30;
                    i22 = i43;
                } else {
                    int[] iArr = c0902f0.f12187a;
                    int i44 = iArr[i15 + 1];
                    int T6 = T(i44);
                    long j = i44 & 1048575;
                    if (T6 <= 17) {
                        int i45 = iArr[i15 + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i36) {
                            if (i36 != 1048575) {
                                unsafe2.putInt(obj3, i36, i35);
                                i28 = i47;
                            } else {
                                i28 = i47;
                            }
                            i19 = i28;
                            i18 = i28 == 1048575 ? 0 : unsafe2.getInt(obj3, i28);
                        } else {
                            i18 = i35;
                            i19 = i36;
                        }
                        switch (T6) {
                            case 0:
                                i24 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 1) {
                                    K0.o(obj3, j, w0.h(i24, bArr2));
                                    i31 = i24 + 8;
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 1:
                                i24 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 5) {
                                    K0.p(obj3, j, w0.n(i24, bArr2));
                                    i31 = i24 + 4;
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 2:
                            case 3:
                                i24 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 0) {
                                    N7 = w0.N(bArr2, i24, c0868d2);
                                    unsafe2.putLong(obj, j, c0868d2.f11762b);
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i31 = N7;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 4:
                            case 11:
                                i24 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 0) {
                                    i31 = w0.L(bArr2, i24, c0868d2);
                                    unsafe2.putInt(obj3, j, c0868d2.f11761a);
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 5:
                            case 14:
                                i27 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 1) {
                                    i24 = i27;
                                    unsafe2.putLong(obj, j, w0.l(i27, bArr2));
                                    i31 = i24 + 8;
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 6:
                            case 13:
                                i27 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 5) {
                                    unsafe2.putInt(obj3, j, w0.j(i27, bArr2));
                                    i31 = i27 + 4;
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 7:
                                i27 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 0) {
                                    i31 = w0.N(bArr2, i27, c0868d2);
                                    K0.k(obj3, j, c0868d2.f11762b != 0);
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 8:
                                i27 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 2) {
                                    i31 = (i44 & 536870912) != 0 ? w0.F(bArr2, i27, c0868d2) : w0.C(bArr2, i27, c0868d2);
                                    unsafe2.putObject(obj3, j, c0868d2.f11763c);
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 9:
                                i27 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 2) {
                                    Object y4 = c0902f0.y(i25, obj3);
                                    i31 = w0.T(y4, c0902f0.q(i25), bArr, i27, i8, c0868d);
                                    c0902f0.R(i25, obj3, y4);
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 10:
                                i27 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 2) {
                                    i31 = w0.f(bArr2, i27, c0868d2);
                                    unsafe2.putObject(obj3, j, c0868d2.f11763c);
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 12:
                                i27 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 0) {
                                    i31 = w0.L(bArr2, i27, c0868d2);
                                    int i48 = c0868d2.f11761a;
                                    c0902f0.o(i25);
                                    unsafe2.putInt(obj3, j, i48);
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 15:
                                i27 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 0) {
                                    i31 = w0.L(bArr2, i27, c0868d2);
                                    unsafe2.putInt(obj3, j, H6.b.b(c0868d2.f11761a));
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 16:
                                i27 = i41;
                                i25 = i15;
                                i26 = i43;
                                if (i39 == 0) {
                                    N7 = w0.N(bArr2, i27, c0868d2);
                                    unsafe2.putLong(obj, j, H6.b.d(c0868d2.f11762b));
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i31 = N7;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            case 17:
                                if (i39 == 3) {
                                    Object y5 = c0902f0.y(i15, obj3);
                                    i25 = i15;
                                    i26 = i43;
                                    i31 = w0.S(y5, c0902f0.q(i15), bArr, i41, i8, (i38 << 3) | 4, c0868d);
                                    c0902f0.R(i25, obj3, y5);
                                    i35 = i18 | i46;
                                    i34 = i26;
                                    i30 = i9;
                                    i32 = i38;
                                    i33 = i25;
                                    i36 = i19;
                                    i29 = i8;
                                    break;
                                } else {
                                    i27 = i41;
                                    i25 = i15;
                                    i26 = i43;
                                    i24 = i27;
                                    i22 = i26;
                                    i10 = i9;
                                    unsafe = unsafe2;
                                    i21 = i38;
                                    i20 = i25;
                                    i17 = i24;
                                    break;
                                }
                            default:
                                i24 = i41;
                                i25 = i15;
                                i26 = i43;
                                i22 = i26;
                                i10 = i9;
                                unsafe = unsafe2;
                                i21 = i38;
                                i20 = i25;
                                i17 = i24;
                                break;
                        }
                    } else {
                        int i49 = i15;
                        if (T6 != 27) {
                            i18 = i35;
                            i19 = i36;
                            if (T6 <= 49) {
                                unsafe = unsafe2;
                                i21 = i38;
                                i10 = i9;
                                i20 = i49;
                                i31 = I(obj, bArr, i41, i8, i43, i39, i49, i44, T6, j, c0868d);
                            } else {
                                i10 = i9;
                                unsafe = unsafe2;
                                i21 = i38;
                                i20 = i49;
                                i23 = i41;
                                if (T6 != 50) {
                                    i31 = H(obj, bArr, i23, i8, i43, i21, i39, i44, T6, j, i20, c0868d);
                                } else if (i39 == 2) {
                                    i31 = F(obj, bArr, i23, i8, i20, j, c0868d);
                                }
                            }
                        } else if (i39 == 2) {
                            AbstractC0893b abstractC0893b = (AbstractC0893b) ((J) unsafe2.getObject(obj3, j));
                            boolean m7 = abstractC0893b.m();
                            J j3 = abstractC0893b;
                            if (!m7) {
                                int size = abstractC0893b.size();
                                J a2 = abstractC0893b.a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj3, j, a2);
                                j3 = a2;
                            }
                            i19 = i36;
                            i31 = w0.q(c0902f0.q(i49), i43, bArr, i41, i8, j3, c0868d);
                            i34 = i43;
                            i30 = i9;
                            i32 = i38;
                            i33 = i49;
                            i35 = i35;
                            i36 = i19;
                            i29 = i8;
                        } else {
                            i18 = i35;
                            i19 = i36;
                            i10 = i9;
                            unsafe = unsafe2;
                            i21 = i38;
                            i20 = i49;
                            i23 = i41;
                        }
                        i22 = i43;
                        i17 = i23;
                    }
                }
                if (i22 != i10 || i10 == 0) {
                    C c3 = (C) obj;
                    B0 b02 = c3.unknownFields;
                    if (b02 == B0.f12098f) {
                        b02 = B0.c();
                        c3.unknownFields = b02;
                    }
                    i31 = w0.G(i22, bArr, i17, i8, b02, c0868d);
                    bArr2 = bArr;
                    i29 = i8;
                    c0868d2 = c0868d;
                    i34 = i22;
                    obj3 = obj;
                    i30 = i10;
                    i35 = i18;
                    i32 = i21;
                    i36 = i19;
                    unsafe2 = unsafe;
                    i33 = i20;
                    c0902f0 = this;
                } else {
                    obj2 = obj;
                    i31 = i17;
                    i34 = i22;
                    i35 = i18;
                    i36 = i19;
                }
            } else {
                unsafe = unsafe2;
                i10 = i30;
                obj2 = obj3;
            }
        }
        if (i36 != 1048575) {
            unsafe.putInt(obj2, i36, i35);
        }
        for (int i50 = this.f12194h; i50 < this.f12195i; i50++) {
            n(this.f12193g[i50], obj2, null);
        }
        if (i10 == 0) {
            if (i31 != i8) {
                throw M.g();
            }
        } else if (i31 > i8 || i34 != i10) {
            throw M.g();
        }
        return i31;
    }

    public final int H(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, C0868d c0868d) {
        Unsafe unsafe = f12186o;
        long j3 = this.f12187a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(w0.h(i7, bArr)));
                    int i15 = i7 + 8;
                    unsafe.putInt(obj, j3, i10);
                    return i15;
                }
                break;
            case 52:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(w0.n(i7, bArr)));
                    int i16 = i7 + 4;
                    unsafe.putInt(obj, j3, i10);
                    return i16;
                }
                break;
            case 53:
            case 54:
                if (i11 == 0) {
                    int N7 = w0.N(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Long.valueOf(c0868d.f11762b));
                    unsafe.putInt(obj, j3, i10);
                    return N7;
                }
                break;
            case 55:
            case 62:
                if (i11 == 0) {
                    int L7 = w0.L(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Integer.valueOf(c0868d.f11761a));
                    unsafe.putInt(obj, j3, i10);
                    return L7;
                }
                break;
            case 56:
            case 65:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(w0.l(i7, bArr)));
                    int i17 = i7 + 8;
                    unsafe.putInt(obj, j3, i10);
                    return i17;
                }
                break;
            case 57:
            case 64:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(w0.j(i7, bArr)));
                    int i18 = i7 + 4;
                    unsafe.putInt(obj, j3, i10);
                    return i18;
                }
                break;
            case 58:
                if (i11 == 0) {
                    int N8 = w0.N(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Boolean.valueOf(c0868d.f11762b != 0));
                    unsafe.putInt(obj, j3, i10);
                    return N8;
                }
                break;
            case 59:
                if (i11 == 2) {
                    int L8 = w0.L(bArr, i7, c0868d);
                    int i19 = c0868d.f11761a;
                    if (i19 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i12 & 536870912) != 0 && !N0.f(bArr, L8, L8 + i19)) {
                            throw M.c();
                        }
                        unsafe.putObject(obj, j, new String(bArr, L8, i19, K.f12112a));
                        L8 += i19;
                    }
                    unsafe.putInt(obj, j3, i10);
                    return L8;
                }
                break;
            case 60:
                if (i11 == 2) {
                    Object z4 = z(i10, i14, obj);
                    int T6 = w0.T(z4, q(i14), bArr, i7, i8, c0868d);
                    S(obj, i10, i14, z4);
                    return T6;
                }
                break;
            case 61:
                if (i11 == 2) {
                    int f7 = w0.f(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, c0868d.f11763c);
                    unsafe.putInt(obj, j3, i10);
                    return f7;
                }
                break;
            case 63:
                if (i11 == 0) {
                    int L9 = w0.L(bArr, i7, c0868d);
                    int i20 = c0868d.f11761a;
                    o(i14);
                    unsafe.putObject(obj, j, Integer.valueOf(i20));
                    unsafe.putInt(obj, j3, i10);
                    return L9;
                }
                break;
            case 66:
                if (i11 == 0) {
                    int L10 = w0.L(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Integer.valueOf(H6.b.b(c0868d.f11761a)));
                    unsafe.putInt(obj, j3, i10);
                    return L10;
                }
                break;
            case 67:
                if (i11 == 0) {
                    int N9 = w0.N(bArr, i7, c0868d);
                    unsafe.putObject(obj, j, Long.valueOf(H6.b.d(c0868d.f11762b)));
                    unsafe.putInt(obj, j3, i10);
                    return N9;
                }
                break;
            case 68:
                if (i11 == 3) {
                    Object z7 = z(i10, i14, obj);
                    int S6 = w0.S(z7, q(i14), bArr, i7, i8, (i9 & (-8)) | 4, c0868d);
                    S(obj, i10, i14, z7);
                    return S6;
                }
                break;
        }
        return i7;
    }

    public final int I(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, long j, int i12, long j3, C0868d c0868d) {
        int M7;
        Unsafe unsafe = f12186o;
        AbstractC0893b abstractC0893b = (AbstractC0893b) ((J) unsafe.getObject(obj, j3));
        boolean m7 = abstractC0893b.m();
        J j7 = abstractC0893b;
        if (!m7) {
            int size = abstractC0893b.size();
            J a2 = abstractC0893b.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j3, a2);
            j7 = a2;
        }
        switch (i12) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return w0.s(bArr, i7, j7, c0868d);
                }
                if (i10 == 1) {
                    return w0.i(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return w0.v(bArr, i7, j7, c0868d);
                }
                if (i10 == 5) {
                    return w0.o(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 20:
            case zzbbd.zzt.zzm /* 21 */:
            case 37:
            case 38:
                if (i10 == 2) {
                    return w0.z(bArr, i7, j7, c0868d);
                }
                if (i10 == 0) {
                    return w0.O(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return w0.y(bArr, i7, j7, c0868d);
                }
                if (i10 == 0) {
                    return w0.M(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return w0.u(bArr, i7, j7, c0868d);
                }
                if (i10 == 1) {
                    return w0.m(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return w0.t(bArr, i7, j7, c0868d);
                }
                if (i10 == 5) {
                    return w0.k(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return w0.r(bArr, i7, j7, c0868d);
                }
                if (i10 == 0) {
                    return w0.e(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 26:
                if (i10 == 2) {
                    return (j & 536870912) == 0 ? w0.D(i9, bArr, i7, i8, j7, c0868d) : w0.E(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return w0.q(q(i11), i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return w0.g(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    M7 = w0.y(bArr, i7, j7, c0868d);
                } else if (i10 == 0) {
                    M7 = w0.M(i9, bArr, i7, i8, j7, c0868d);
                }
                o(i11);
                Class cls = AbstractC0927s0.f12269a;
                return M7;
            case 33:
            case 47:
                if (i10 == 2) {
                    return w0.w(bArr, i7, j7, c0868d);
                }
                if (i10 == 0) {
                    return w0.A(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return w0.x(bArr, i7, j7, c0868d);
                }
                if (i10 == 0) {
                    return w0.B(i9, bArr, i7, i8, j7, c0868d);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return w0.p(q(i11), i9, bArr, i7, i8, j7, c0868d);
                }
                break;
        }
        return i7;
    }

    public final void J(Object obj, long j, C0686j c0686j, InterfaceC0925r0 interfaceC0925r0, C0928t c0928t) {
        int A7;
        List c3 = this.f12196k.c(j, obj);
        int i7 = c0686j.f9210b;
        if ((i7 & 7) != 3) {
            throw M.d();
        }
        do {
            C d7 = interfaceC0925r0.d();
            c0686j.e(d7, interfaceC0925r0, c0928t);
            interfaceC0925r0.b(d7);
            c3.add(d7);
            H6.b bVar = (H6.b) c0686j.f9213e;
            if (bVar.f() || c0686j.f9212d != 0) {
                return;
            } else {
                A7 = bVar.A();
            }
        } while (A7 == i7);
        c0686j.f9212d = A7;
    }

    public final void K(Object obj, int i7, C0686j c0686j, InterfaceC0925r0 interfaceC0925r0, C0928t c0928t) {
        int A7;
        List c3 = this.f12196k.c(i7 & 1048575, obj);
        int i8 = c0686j.f9210b;
        if ((i8 & 7) != 2) {
            throw M.d();
        }
        do {
            C d7 = interfaceC0925r0.d();
            c0686j.h(d7, interfaceC0925r0, c0928t);
            interfaceC0925r0.b(d7);
            c3.add(d7);
            H6.b bVar = (H6.b) c0686j.f9213e;
            if (bVar.f() || c0686j.f9212d != 0) {
                return;
            } else {
                A7 = bVar.A();
            }
        } while (A7 == i8);
        c0686j.f9212d = A7;
    }

    public final void L(int i7, C0686j c0686j, Object obj) {
        if ((536870912 & i7) != 0) {
            c0686j.W(2);
            K0.s(obj, i7 & 1048575, ((H6.b) c0686j.f9213e).z());
        } else if (!this.f12192f) {
            K0.s(obj, i7 & 1048575, c0686j.o());
        } else {
            c0686j.W(2);
            K0.s(obj, i7 & 1048575, ((H6.b) c0686j.f9213e).y());
        }
    }

    public final void M(int i7, C0686j c0686j, Object obj) {
        boolean z4 = (536870912 & i7) != 0;
        U u4 = this.f12196k;
        if (z4) {
            c0686j.Q(u4.c(i7 & 1048575, obj), true);
        } else {
            c0686j.Q(u4.c(i7 & 1048575, obj), false);
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
            int U4 = U(i14);
            int i15 = iArr[i14];
            int T6 = T(U4);
            if (T6 <= 17) {
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
            long j = U4 & i11;
            switch (T6) {
                case 0:
                    i10 = i7;
                    if (!s(obj, i14, i10, i8, i9)) {
                        break;
                    } else {
                        x4.d(i15, K0.f12117c.g(j, obj));
                        continue;
                    }
                case 1:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.h(K0.f12117c.h(j, obj), i15);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.k(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.r(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.j(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.g(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.f(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.b(i15, K0.f12117c.d(j, obj));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((AbstractC0923q) x4.f12168a).I0(i15, (String) object);
                            break;
                        } else {
                            x4.c(i15, (AbstractC0911k) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.l(i15, unsafe.getObject(obj, j), q(i14));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.c(i15, (AbstractC0911k) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.q(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.e(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.m(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.n(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.o(i15, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i10 = i7;
                    if (s(obj, i14, i10, i8, i9)) {
                        x4.p(i15, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i10 = i7;
                    if (s(obj, i14, i7, i8, i9)) {
                        x4.i(i15, unsafe.getObject(obj, j), q(i14));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    AbstractC0927s0.E(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 19:
                    AbstractC0927s0.I(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 20:
                    AbstractC0927s0.L(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    AbstractC0927s0.T(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 22:
                    AbstractC0927s0.K(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 23:
                    AbstractC0927s0.H(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 24:
                    AbstractC0927s0.G(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 25:
                    AbstractC0927s0.C(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 26:
                    AbstractC0927s0.R(iArr[i14], (List) unsafe.getObject(obj, j), x4);
                    break;
                case 27:
                    AbstractC0927s0.M(iArr[i14], (List) unsafe.getObject(obj, j), x4, q(i14));
                    break;
                case 28:
                    AbstractC0927s0.D(iArr[i14], (List) unsafe.getObject(obj, j), x4);
                    break;
                case 29:
                    AbstractC0927s0.S(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 30:
                    AbstractC0927s0.F(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 31:
                    AbstractC0927s0.N(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 32:
                    AbstractC0927s0.O(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 33:
                    AbstractC0927s0.P(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 34:
                    AbstractC0927s0.Q(iArr[i14], (List) unsafe.getObject(obj, j), x4, false);
                    break;
                case 35:
                    AbstractC0927s0.E(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 36:
                    AbstractC0927s0.I(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 37:
                    AbstractC0927s0.L(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 38:
                    AbstractC0927s0.T(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 39:
                    AbstractC0927s0.K(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 40:
                    AbstractC0927s0.H(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 41:
                    AbstractC0927s0.G(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 42:
                    AbstractC0927s0.C(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 43:
                    AbstractC0927s0.S(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 44:
                    AbstractC0927s0.F(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 45:
                    AbstractC0927s0.N(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 46:
                    AbstractC0927s0.O(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 47:
                    AbstractC0927s0.P(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 48:
                    AbstractC0927s0.Q(iArr[i14], (List) unsafe.getObject(obj, j), x4, true);
                    break;
                case 49:
                    AbstractC0927s0.J(iArr[i14], (List) unsafe.getObject(obj, j), x4, q(i14));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object p5 = p(i14);
                        this.f12198m.getClass();
                        Y y4 = ((Z) p5).f12172a;
                        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
                        abstractC0923q.getClass();
                        for (Map.Entry entry : ((C0892a0) object2).entrySet()) {
                            abstractC0923q.K0(i15, 2);
                            abstractC0923q.M0(Z.a(y4, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0932w.b(abstractC0923q, y4.f12169a, 1, key);
                            C0932w.b(abstractC0923q, y4.f12170b, 2, value);
                        }
                        break;
                    }
                    break;
                case 51:
                    if (u(i15, i14, obj)) {
                        x4.d(i15, ((Double) K0.f12117c.k(j, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (u(i15, i14, obj)) {
                        x4.h(((Float) K0.f12117c.k(j, obj)).floatValue(), i15);
                        break;
                    }
                    break;
                case 53:
                    if (u(i15, i14, obj)) {
                        x4.k(i15, E(j, obj));
                        break;
                    }
                    break;
                case 54:
                    if (u(i15, i14, obj)) {
                        x4.r(i15, E(j, obj));
                        break;
                    }
                    break;
                case 55:
                    if (u(i15, i14, obj)) {
                        x4.j(i15, D(j, obj));
                        break;
                    }
                    break;
                case 56:
                    if (u(i15, i14, obj)) {
                        x4.g(i15, E(j, obj));
                        break;
                    }
                    break;
                case 57:
                    if (u(i15, i14, obj)) {
                        x4.f(i15, D(j, obj));
                        break;
                    }
                    break;
                case 58:
                    if (u(i15, i14, obj)) {
                        x4.b(i15, ((Boolean) K0.f12117c.k(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (u(i15, i14, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((AbstractC0923q) x4.f12168a).I0(i15, (String) object3);
                            break;
                        } else {
                            x4.c(i15, (AbstractC0911k) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (u(i15, i14, obj)) {
                        x4.l(i15, unsafe.getObject(obj, j), q(i14));
                        break;
                    }
                    break;
                case 61:
                    if (u(i15, i14, obj)) {
                        x4.c(i15, (AbstractC0911k) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (u(i15, i14, obj)) {
                        x4.q(i15, D(j, obj));
                        break;
                    }
                    break;
                case 63:
                    if (u(i15, i14, obj)) {
                        x4.e(i15, D(j, obj));
                        break;
                    }
                    break;
                case 64:
                    if (u(i15, i14, obj)) {
                        x4.m(i15, D(j, obj));
                        break;
                    }
                    break;
                case 65:
                    if (u(i15, i14, obj)) {
                        x4.n(i15, E(j, obj));
                        break;
                    }
                    break;
                case 66:
                    if (u(i15, i14, obj)) {
                        x4.o(i15, D(j, obj));
                        break;
                    }
                    break;
                case 67:
                    if (u(i15, i14, obj)) {
                        x4.p(i15, E(j, obj));
                        break;
                    }
                    break;
                case 68:
                    if (u(i15, i14, obj)) {
                        x4.i(i15, unsafe.getObject(obj, j), q(i14));
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
        this.f12197l.getClass();
        ((C) obj).unknownFields.e(x4);
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f12187a;
            if (i7 >= iArr.length) {
                AbstractC0927s0.A(this.f12197l, obj, obj2);
                return;
            }
            int U4 = U(i7);
            long j = 1048575 & U4;
            int i8 = iArr[i7];
            switch (T(U4)) {
                case 0:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.o(obj, j, K0.f12117c.g(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 1:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.p(obj, j, K0.f12117c.h(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 2:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 3:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 4:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 5:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 6:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 7:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.k(obj, j, K0.f12117c.d(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 8:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.s(obj, j, K0.f12117c.k(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 9:
                    w(i7, obj, obj2);
                    break;
                case 10:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.s(obj, j, K0.f12117c.k(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 11:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 12:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 13:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 14:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 15:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.q(j, obj, K0.f12117c.i(j, obj2));
                        O(i7, obj);
                        break;
                    }
                case 16:
                    if (!r(i7, obj2)) {
                        break;
                    } else {
                        K0.r(obj, j, K0.f12117c.j(j, obj2));
                        O(i7, obj);
                        break;
                    }
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
                    Class cls = AbstractC0927s0.f12269a;
                    J0 j02 = K0.f12117c;
                    Object k7 = j02.k(j, obj);
                    Object k8 = j02.k(j, obj2);
                    this.f12198m.getClass();
                    K0.s(obj, j, C0894b0.e(k7, k8));
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
                        K0.s(obj, j, K0.f12117c.k(j, obj2));
                        P(i8, i7, obj);
                        break;
                    }
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
                    if (!u(i8, i7, obj2)) {
                        break;
                    } else {
                        K0.s(obj, j, K0.f12117c.k(j, obj2));
                        P(i8, i7, obj);
                        break;
                    }
                case 68:
                    x(i7, obj, obj2);
                    break;
            }
            i7 += 3;
        }
    }

    @Override // com.google.protobuf.InterfaceC0925r0
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
                int U4 = U(i7);
                long j = 1048575 & U4;
                int T6 = T(U4);
                if (T6 != 9) {
                    if (T6 != 60 && T6 != 68) {
                        switch (T6) {
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
                                    C0894b0.g(object);
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (u(iArr[i7], i7, obj)) {
                        q(i7).b(f12186o.getObject(obj, j));
                    }
                }
                if (r(i7, obj)) {
                    q(i7).b(f12186o.getObject(obj, j));
                }
            }
            this.f12197l.getClass();
            C0.b(obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final boolean c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f12194h) {
            int i12 = this.f12193g[i11];
            int[] iArr = this.f12187a;
            int i13 = iArr[i12];
            int U4 = U(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = f12186o.getInt(obj, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & U4) != 0 && !s(obj, i12, i7, i8, i16)) {
                return false;
            }
            int T6 = T(U4);
            if (T6 != 9 && T6 != 17) {
                if (T6 != 27) {
                    if (T6 == 60 || T6 == 68) {
                        if (u(i13, i12, obj)) {
                            if (!q(i12).c(K0.f12117c.k(U4 & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (T6 != 49) {
                        if (T6 != 50) {
                            continue;
                        } else {
                            Object k7 = K0.f12117c.k(U4 & 1048575, obj);
                            this.f12198m.getClass();
                            C0892a0 c0892a0 = (C0892a0) k7;
                            if (!c0892a0.isEmpty() && ((Z) p(i12)).f12172a.f12170b.f12152a == T0.MESSAGE) {
                                InterfaceC0925r0 interfaceC0925r0 = null;
                                for (Object obj2 : c0892a0.values()) {
                                    if (interfaceC0925r0 == null) {
                                        interfaceC0925r0 = C0916m0.f12232c.a(obj2.getClass());
                                    }
                                    if (!interfaceC0925r0.c(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) K0.f12117c.k(U4 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC0925r0 q7 = q(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!q7.c(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (s(obj, i12, i7, i8, i16)) {
                if (!q(i12).c(K0.f12117c.k(U4 & 1048575, obj))) {
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

    @Override // com.google.protobuf.InterfaceC0925r0
    public final C d() {
        this.j.getClass();
        return ((C) this.f12191e).q();
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final void e(Object obj, X x4) {
        x4.getClass();
        V(obj, x4);
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
    @Override // com.google.protobuf.InterfaceC0925r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(C c3) {
        int i7;
        int b7;
        int i8;
        int[] iArr = this.f12187a;
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int U4 = U(i10);
            int i11 = iArr[i10];
            long j = 1048575 & U4;
            int i12 = 1237;
            int i13 = 37;
            switch (T(U4)) {
                case 0:
                    i7 = i9 * 53;
                    b7 = K.b(Double.doubleToLongBits(K0.f12117c.g(j, c3)));
                    i9 = b7 + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    b7 = Float.floatToIntBits(K0.f12117c.h(j, c3));
                    i9 = b7 + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    b7 = K.b(K0.f12117c.j(j, c3));
                    i9 = b7 + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    b7 = K.b(K0.f12117c.j(j, c3));
                    i9 = b7 + i7;
                    break;
                case 4:
                    i7 = i9 * 53;
                    b7 = K0.f12117c.i(j, c3);
                    i9 = b7 + i7;
                    break;
                case 5:
                    i7 = i9 * 53;
                    b7 = K.b(K0.f12117c.j(j, c3));
                    i9 = b7 + i7;
                    break;
                case 6:
                    i7 = i9 * 53;
                    b7 = K0.f12117c.i(j, c3);
                    i9 = b7 + i7;
                    break;
                case 7:
                    i8 = i9 * 53;
                    boolean d7 = K0.f12117c.d(j, c3);
                    Charset charset = K.f12112a;
                    break;
                case 8:
                    i7 = i9 * 53;
                    b7 = ((String) K0.f12117c.k(j, c3)).hashCode();
                    i9 = b7 + i7;
                    break;
                case 9:
                    Object k7 = K0.f12117c.k(j, c3);
                    if (k7 != null) {
                        i13 = k7.hashCode();
                    }
                    i9 = (i9 * 53) + i13;
                    break;
                case 10:
                    i7 = i9 * 53;
                    b7 = K0.f12117c.k(j, c3).hashCode();
                    i9 = b7 + i7;
                    break;
                case 11:
                    i7 = i9 * 53;
                    b7 = K0.f12117c.i(j, c3);
                    i9 = b7 + i7;
                    break;
                case 12:
                    i7 = i9 * 53;
                    b7 = K0.f12117c.i(j, c3);
                    i9 = b7 + i7;
                    break;
                case 13:
                    i7 = i9 * 53;
                    b7 = K0.f12117c.i(j, c3);
                    i9 = b7 + i7;
                    break;
                case 14:
                    i7 = i9 * 53;
                    b7 = K.b(K0.f12117c.j(j, c3));
                    i9 = b7 + i7;
                    break;
                case 15:
                    i7 = i9 * 53;
                    b7 = K0.f12117c.i(j, c3);
                    i9 = b7 + i7;
                    break;
                case 16:
                    i7 = i9 * 53;
                    b7 = K.b(K0.f12117c.j(j, c3));
                    i9 = b7 + i7;
                    break;
                case 17:
                    Object k8 = K0.f12117c.k(j, c3);
                    if (k8 != null) {
                        i13 = k8.hashCode();
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
                    b7 = K0.f12117c.k(j, c3).hashCode();
                    i9 = b7 + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    b7 = K0.f12117c.k(j, c3).hashCode();
                    i9 = b7 + i7;
                    break;
                case 51:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = K.b(Double.doubleToLongBits(((Double) K0.f12117c.k(j, c3)).doubleValue()));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = Float.floatToIntBits(((Float) K0.f12117c.k(j, c3)).floatValue());
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = K.b(E(j, c3));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = K.b(E(j, c3));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = D(j, c3);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = K.b(E(j, c3));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = D(j, c3);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i11, i10, c3)) {
                        i8 = i9 * 53;
                        boolean booleanValue = ((Boolean) K0.f12117c.k(j, c3)).booleanValue();
                        Charset charset2 = K.f12112a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = ((String) K0.f12117c.k(j, c3)).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = K0.f12117c.k(j, c3).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = K0.f12117c.k(j, c3).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = D(j, c3);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = D(j, c3);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = D(j, c3);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = K.b(E(j, c3));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = D(j, c3);
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = K.b(E(j, c3));
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (u(i11, i10, c3)) {
                        i7 = i9 * 53;
                        b7 = K0.f12117c.k(j, c3).hashCode();
                        i9 = b7 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f12197l.getClass();
        return c3.unknownFields.hashCode() + (i9 * 53);
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final void g(Object obj, C0686j c0686j, C0928t c0928t) {
        int T6;
        H6.b bVar;
        U u4;
        c0928t.getClass();
        l(obj);
        C0 c0 = this.f12197l;
        int[] iArr = this.f12193g;
        int i7 = this.f12195i;
        int i8 = this.f12194h;
        B0 b02 = null;
        while (true) {
            try {
                int a2 = c0686j.a();
                int Q6 = (a2 < this.f12189c || a2 > this.f12190d) ? -1 : Q(a2, 0);
                if (Q6 >= 0) {
                    int U4 = U(Q6);
                    try {
                        T6 = T(U4);
                        bVar = (H6.b) c0686j.f9213e;
                        u4 = this.f12196k;
                    } catch (L unused) {
                        c0.getClass();
                        if (b02 == null) {
                            b02 = C0.a(obj);
                        }
                        if (!C0.c(b02, c0686j)) {
                            while (i8 < i7) {
                                n(iArr[i8], obj, b02);
                                i8++;
                            }
                            if (b02 == null) {
                                return;
                            }
                            ((C) obj).unknownFields = b02;
                            return;
                        }
                    }
                    switch (T6) {
                        case 0:
                            long C3 = C(U4);
                            c0686j.W(1);
                            K0.o(obj, C3, bVar.l());
                            O(Q6, obj);
                            continue;
                        case 1:
                            long C7 = C(U4);
                            c0686j.W(5);
                            K0.p(obj, C7, bVar.p());
                            O(Q6, obj);
                            continue;
                        case 2:
                            long C8 = C(U4);
                            c0686j.W(0);
                            K0.r(obj, C8, bVar.s());
                            O(Q6, obj);
                            continue;
                        case 3:
                            long C9 = C(U4);
                            c0686j.W(0);
                            K0.r(obj, C9, bVar.C());
                            O(Q6, obj);
                            continue;
                        case 4:
                            long C10 = C(U4);
                            c0686j.W(0);
                            K0.q(C10, obj, bVar.q());
                            O(Q6, obj);
                            continue;
                        case 5:
                            long C11 = C(U4);
                            c0686j.W(1);
                            K0.r(obj, C11, bVar.o());
                            O(Q6, obj);
                            continue;
                        case 6:
                            long C12 = C(U4);
                            c0686j.W(5);
                            K0.q(C12, obj, bVar.n());
                            O(Q6, obj);
                            continue;
                        case 7:
                            long C13 = C(U4);
                            c0686j.W(0);
                            K0.k(obj, C13, bVar.j());
                            O(Q6, obj);
                            continue;
                        case 8:
                            L(U4, c0686j, obj);
                            O(Q6, obj);
                            continue;
                        case 9:
                            Object obj2 = (AbstractC0891a) y(Q6, obj);
                            InterfaceC0925r0 q7 = q(Q6);
                            c0686j.W(2);
                            c0686j.h(obj2, q7, c0928t);
                            R(Q6, obj, obj2);
                            continue;
                        case 10:
                            K0.s(obj, C(U4), c0686j.o());
                            O(Q6, obj);
                            continue;
                        case 11:
                            long C14 = C(U4);
                            c0686j.W(0);
                            K0.q(C14, obj, bVar.B());
                            O(Q6, obj);
                            continue;
                        case 12:
                            c0686j.W(0);
                            int m7 = bVar.m();
                            o(Q6);
                            K0.q(C(U4), obj, m7);
                            O(Q6, obj);
                            continue;
                        case 13:
                            long C15 = C(U4);
                            c0686j.W(5);
                            K0.q(C15, obj, bVar.u());
                            O(Q6, obj);
                            continue;
                        case 14:
                            long C16 = C(U4);
                            c0686j.W(1);
                            K0.r(obj, C16, bVar.v());
                            O(Q6, obj);
                            continue;
                        case 15:
                            long C17 = C(U4);
                            c0686j.W(0);
                            K0.q(C17, obj, bVar.w());
                            O(Q6, obj);
                            continue;
                        case 16:
                            long C18 = C(U4);
                            c0686j.W(0);
                            K0.r(obj, C18, bVar.x());
                            O(Q6, obj);
                            continue;
                        case 17:
                            Object obj3 = (AbstractC0891a) y(Q6, obj);
                            InterfaceC0925r0 q8 = q(Q6);
                            c0686j.W(3);
                            c0686j.e(obj3, q8, c0928t);
                            R(Q6, obj, obj3);
                            continue;
                        case 18:
                            c0686j.s(u4.c(C(U4), obj));
                            continue;
                        case 19:
                            c0686j.C(u4.c(C(U4), obj));
                            continue;
                        case 20:
                            c0686j.G(u4.c(C(U4), obj));
                            continue;
                        case zzbbd.zzt.zzm /* 21 */:
                            c0686j.U(u4.c(C(U4), obj));
                            continue;
                        case 22:
                            c0686j.E(u4.c(C(U4), obj));
                            continue;
                        case 23:
                            c0686j.A(u4.c(C(U4), obj));
                            continue;
                        case 24:
                            c0686j.y(u4.c(C(U4), obj));
                            continue;
                        case 25:
                            c0686j.l(u4.c(C(U4), obj));
                            continue;
                        case 26:
                            M(U4, c0686j, obj);
                            continue;
                        case 27:
                            K(obj, U4, c0686j, q(Q6), c0928t);
                            continue;
                        case 28:
                            c0686j.q(u4.c(C(U4), obj));
                            continue;
                        case 29:
                            c0686j.S(u4.c(C(U4), obj));
                            continue;
                        case 30:
                            List c3 = u4.c(C(U4), obj);
                            c0686j.u(c3);
                            o(Q6);
                            AbstractC0927s0.z(obj, a2, c3, b02, c0);
                            continue;
                        case 31:
                            c0686j.I(u4.c(C(U4), obj));
                            continue;
                        case 32:
                            c0686j.K(u4.c(C(U4), obj));
                            continue;
                        case 33:
                            c0686j.M(u4.c(C(U4), obj));
                            continue;
                        case 34:
                            c0686j.O(u4.c(C(U4), obj));
                            continue;
                        case 35:
                            c0686j.s(u4.c(C(U4), obj));
                            continue;
                        case 36:
                            c0686j.C(u4.c(C(U4), obj));
                            continue;
                        case 37:
                            c0686j.G(u4.c(C(U4), obj));
                            continue;
                        case 38:
                            c0686j.U(u4.c(C(U4), obj));
                            continue;
                        case 39:
                            c0686j.E(u4.c(C(U4), obj));
                            continue;
                        case 40:
                            c0686j.A(u4.c(C(U4), obj));
                            continue;
                        case 41:
                            c0686j.y(u4.c(C(U4), obj));
                            continue;
                        case 42:
                            c0686j.l(u4.c(C(U4), obj));
                            continue;
                        case 43:
                            c0686j.S(u4.c(C(U4), obj));
                            continue;
                        case 44:
                            List c4 = u4.c(C(U4), obj);
                            c0686j.u(c4);
                            o(Q6);
                            AbstractC0927s0.z(obj, a2, c4, b02, c0);
                            continue;
                        case 45:
                            c0686j.I(u4.c(C(U4), obj));
                            continue;
                        case 46:
                            c0686j.K(u4.c(C(U4), obj));
                            continue;
                        case 47:
                            c0686j.M(u4.c(C(U4), obj));
                            continue;
                        case 48:
                            c0686j.O(u4.c(C(U4), obj));
                            continue;
                        case 49:
                            J(obj, C(U4), c0686j, q(Q6), c0928t);
                            continue;
                        case 50:
                            v(obj, Q6, p(Q6), c0928t, c0686j);
                            continue;
                        case 51:
                            long C19 = C(U4);
                            c0686j.W(1);
                            K0.s(obj, C19, Double.valueOf(bVar.l()));
                            P(a2, Q6, obj);
                            continue;
                        case 52:
                            long C20 = C(U4);
                            c0686j.W(5);
                            K0.s(obj, C20, Float.valueOf(bVar.p()));
                            P(a2, Q6, obj);
                            continue;
                        case 53:
                            long C21 = C(U4);
                            c0686j.W(0);
                            K0.s(obj, C21, Long.valueOf(bVar.s()));
                            P(a2, Q6, obj);
                            continue;
                        case 54:
                            long C22 = C(U4);
                            c0686j.W(0);
                            K0.s(obj, C22, Long.valueOf(bVar.C()));
                            P(a2, Q6, obj);
                            continue;
                        case 55:
                            long C23 = C(U4);
                            c0686j.W(0);
                            K0.s(obj, C23, Integer.valueOf(bVar.q()));
                            P(a2, Q6, obj);
                            continue;
                        case 56:
                            long C24 = C(U4);
                            c0686j.W(1);
                            K0.s(obj, C24, Long.valueOf(bVar.o()));
                            P(a2, Q6, obj);
                            continue;
                        case 57:
                            long C25 = C(U4);
                            c0686j.W(5);
                            K0.s(obj, C25, Integer.valueOf(bVar.n()));
                            P(a2, Q6, obj);
                            continue;
                        case 58:
                            long C26 = C(U4);
                            c0686j.W(0);
                            K0.s(obj, C26, Boolean.valueOf(bVar.j()));
                            P(a2, Q6, obj);
                            continue;
                        case 59:
                            L(U4, c0686j, obj);
                            P(a2, Q6, obj);
                            continue;
                        case 60:
                            Object obj4 = (AbstractC0891a) z(a2, Q6, obj);
                            InterfaceC0925r0 q9 = q(Q6);
                            c0686j.W(2);
                            c0686j.h(obj4, q9, c0928t);
                            S(obj, a2, Q6, obj4);
                            continue;
                        case 61:
                            K0.s(obj, C(U4), c0686j.o());
                            P(a2, Q6, obj);
                            continue;
                        case 62:
                            long C27 = C(U4);
                            c0686j.W(0);
                            K0.s(obj, C27, Integer.valueOf(bVar.B()));
                            P(a2, Q6, obj);
                            continue;
                        case 63:
                            c0686j.W(0);
                            int m8 = bVar.m();
                            o(Q6);
                            K0.s(obj, C(U4), Integer.valueOf(m8));
                            P(a2, Q6, obj);
                            continue;
                        case 64:
                            long C28 = C(U4);
                            c0686j.W(5);
                            K0.s(obj, C28, Integer.valueOf(bVar.u()));
                            P(a2, Q6, obj);
                            continue;
                        case 65:
                            long C29 = C(U4);
                            c0686j.W(1);
                            K0.s(obj, C29, Long.valueOf(bVar.v()));
                            P(a2, Q6, obj);
                            continue;
                        case 66:
                            long C30 = C(U4);
                            c0686j.W(0);
                            K0.s(obj, C30, Integer.valueOf(bVar.w()));
                            P(a2, Q6, obj);
                            continue;
                        case 67:
                            long C31 = C(U4);
                            c0686j.W(0);
                            K0.s(obj, C31, Long.valueOf(bVar.x()));
                            P(a2, Q6, obj);
                            continue;
                        case 68:
                            Object obj5 = (AbstractC0891a) z(a2, Q6, obj);
                            InterfaceC0925r0 q10 = q(Q6);
                            c0686j.W(3);
                            c0686j.e(obj5, q10, c0928t);
                            S(obj, a2, Q6, obj5);
                            continue;
                        default:
                            if (b02 == null) {
                                c0.getClass();
                                b02 = C0.a(obj);
                            }
                            c0.getClass();
                            if (!C0.c(b02, c0686j)) {
                                while (i8 < i7) {
                                    n(iArr[i8], obj, b02);
                                    i8++;
                                }
                                if (b02 == null) {
                                    return;
                                }
                            }
                            break;
                    }
                } else if (a2 == Integer.MAX_VALUE) {
                    while (i8 < i7) {
                        n(iArr[i8], obj, b02);
                        i8++;
                    }
                    if (b02 == null) {
                        return;
                    } else {
                        c0.getClass();
                    }
                } else {
                    c0.getClass();
                    if (b02 == null) {
                        b02 = C0.a(obj);
                    }
                    if (!C0.c(b02, c0686j)) {
                        while (i8 < i7) {
                            n(iArr[i8], obj, b02);
                            i8++;
                        }
                        if (b02 == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i8 < i7) {
                    n(iArr[i8], obj, b02);
                    i8++;
                }
                if (b02 != null) {
                    c0.getClass();
                    ((C) obj).unknownFields = b02;
                }
                throw th;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final int h(C c3) {
        int i7;
        int i8;
        int i9;
        int a02;
        int Y6;
        int i10;
        int p02;
        int r02;
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
            int U4 = U(i14);
            int T6 = T(U4);
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i11;
            if (T6 <= 17) {
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
            long j = U4 & i11;
            if (T6 >= EnumC0933x.f12288b.a()) {
                EnumC0933x.f12289c.a();
            }
            switch (T6) {
                case 0:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.a0(i16);
                        i15 += a02;
                        break;
                    }
                case 1:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.e0(i16);
                        i15 += a02;
                        break;
                    }
                case 2:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.i0(i16, unsafe.getLong(c3, j));
                        i15 += a02;
                        break;
                    }
                case 3:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.s0(i16, unsafe.getLong(c3, j));
                        i15 += a02;
                        break;
                    }
                case 4:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.g0(i16, unsafe.getInt(c3, j));
                        i15 += a02;
                        break;
                    }
                case 5:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.d0(i16);
                        i15 += a02;
                        break;
                    }
                case 6:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.c0(i16);
                        i15 += a02;
                        break;
                    }
                case 7:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.X(i16);
                        i15 += a02;
                        break;
                    }
                case 8:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(c3, j);
                        Y6 = object instanceof AbstractC0911k ? AbstractC0923q.Y(i16, (AbstractC0911k) object) : AbstractC0923q.n0(i16, (String) object);
                        i15 = Y6 + i15;
                        break;
                    }
                case 9:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0927s0.o(i16, unsafe.getObject(c3, j), q(i14));
                        i15 += a02;
                        break;
                    }
                case 10:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.Y(i16, (AbstractC0911k) unsafe.getObject(c3, j));
                        i15 += a02;
                        break;
                    }
                case 11:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.q0(i16, unsafe.getInt(c3, j));
                        i15 += a02;
                        break;
                    }
                case 12:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.b0(i16, unsafe.getInt(c3, j));
                        i15 += a02;
                        break;
                    }
                case 13:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.j0(i16);
                        i15 += a02;
                        break;
                    }
                case 14:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.k0(i16);
                        i15 += a02;
                        break;
                    }
                case 15:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.l0(i16, unsafe.getInt(c3, j));
                        i15 += a02;
                        break;
                    }
                case 16:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.m0(i16, unsafe.getLong(c3, j));
                        i15 += a02;
                        break;
                    }
                case 17:
                    if (!s(c3, i14, i7, i8, i9)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.f0(i16, (AbstractC0891a) unsafe.getObject(c3, j), q(i14));
                        i15 += a02;
                        break;
                    }
                case 18:
                    a02 = AbstractC0927s0.h(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 19:
                    a02 = AbstractC0927s0.f(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 20:
                    a02 = AbstractC0927s0.m(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    a02 = AbstractC0927s0.x(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 22:
                    a02 = AbstractC0927s0.k(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 23:
                    a02 = AbstractC0927s0.h(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 24:
                    a02 = AbstractC0927s0.f(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 25:
                    a02 = AbstractC0927s0.a(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 26:
                    a02 = AbstractC0927s0.u(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 27:
                    a02 = AbstractC0927s0.p(i16, (List) unsafe.getObject(c3, j), q(i14));
                    i15 += a02;
                    break;
                case 28:
                    a02 = AbstractC0927s0.c(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 29:
                    a02 = AbstractC0927s0.v(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 30:
                    a02 = AbstractC0927s0.d(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 31:
                    a02 = AbstractC0927s0.f(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 32:
                    a02 = AbstractC0927s0.h(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 33:
                    a02 = AbstractC0927s0.q(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 34:
                    a02 = AbstractC0927s0.s(i16, (List) unsafe.getObject(c3, j));
                    i15 += a02;
                    break;
                case 35:
                    i10 = AbstractC0927s0.i((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 36:
                    i10 = AbstractC0927s0.g((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 37:
                    i10 = AbstractC0927s0.n((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 38:
                    i10 = AbstractC0927s0.y((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 39:
                    i10 = AbstractC0927s0.l((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 40:
                    i10 = AbstractC0927s0.i((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 41:
                    i10 = AbstractC0927s0.g((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 42:
                    i10 = AbstractC0927s0.b((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 43:
                    i10 = AbstractC0927s0.w((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 44:
                    i10 = AbstractC0927s0.e((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 45:
                    i10 = AbstractC0927s0.g((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 46:
                    i10 = AbstractC0927s0.i((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 47:
                    i10 = AbstractC0927s0.r((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 48:
                    i10 = AbstractC0927s0.t((List) unsafe.getObject(c3, j));
                    if (i10 <= 0) {
                        break;
                    } else {
                        p02 = AbstractC0923q.p0(i16);
                        r02 = AbstractC0923q.r0(i10);
                        i15 += r02 + p02 + i10;
                        break;
                    }
                case 49:
                    a02 = AbstractC0927s0.j(i16, (List) unsafe.getObject(c3, j), q(i14));
                    i15 += a02;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(c3, j);
                    Object p5 = p(i14);
                    this.f12198m.getClass();
                    a02 = C0894b0.c(i16, object2, p5);
                    i15 += a02;
                    break;
                case 51:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.a0(i16);
                        i15 += a02;
                        break;
                    }
                case 52:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.e0(i16);
                        i15 += a02;
                        break;
                    }
                case 53:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.i0(i16, E(j, c3));
                        i15 += a02;
                        break;
                    }
                case 54:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.s0(i16, E(j, c3));
                        i15 += a02;
                        break;
                    }
                case 55:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.g0(i16, D(j, c3));
                        i15 += a02;
                        break;
                    }
                case 56:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.d0(i16);
                        i15 += a02;
                        break;
                    }
                case 57:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.c0(i16);
                        i15 += a02;
                        break;
                    }
                case 58:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.X(i16);
                        i15 += a02;
                        break;
                    }
                case 59:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(c3, j);
                        Y6 = object3 instanceof AbstractC0911k ? AbstractC0923q.Y(i16, (AbstractC0911k) object3) : AbstractC0923q.n0(i16, (String) object3);
                        i15 = Y6 + i15;
                        break;
                    }
                case 60:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0927s0.o(i16, unsafe.getObject(c3, j), q(i14));
                        i15 += a02;
                        break;
                    }
                case 61:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.Y(i16, (AbstractC0911k) unsafe.getObject(c3, j));
                        i15 += a02;
                        break;
                    }
                case 62:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.q0(i16, D(j, c3));
                        i15 += a02;
                        break;
                    }
                case 63:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.b0(i16, D(j, c3));
                        i15 += a02;
                        break;
                    }
                case 64:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.j0(i16);
                        i15 += a02;
                        break;
                    }
                case 65:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.k0(i16);
                        i15 += a02;
                        break;
                    }
                case 66:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.l0(i16, D(j, c3));
                        i15 += a02;
                        break;
                    }
                case 67:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.m0(i16, E(j, c3));
                        i15 += a02;
                        break;
                    }
                case 68:
                    if (!u(i16, i14, c3)) {
                        break;
                    } else {
                        a02 = AbstractC0923q.f0(i16, (AbstractC0891a) unsafe.getObject(c3, j), q(i14));
                        i15 += a02;
                        break;
                    }
            }
            i14 += 3;
            i12 = i7;
            i13 = i8;
            i11 = 1048575;
        }
    }

    @Override // com.google.protobuf.InterfaceC0925r0
    public final void i(Object obj, byte[] bArr, int i7, int i8, C0868d c0868d) {
        G(obj, bArr, i7, i8, 0, c0868d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.protobuf.AbstractC0927s0.B(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.protobuf.AbstractC0927s0.B(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.protobuf.AbstractC0927s0.B(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.protobuf.AbstractC0927s0.B(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.d(r7, r12) == r5.d(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.h(r7, r12)) == java.lang.Float.floatToIntBits(r5.h(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.g(r7, r12)) == java.lang.Double.doubleToLongBits(r5.g(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.protobuf.AbstractC0927s0.B(r9.k(r7, r12), r9.k(r7, r13)) != false) goto L105;
     */
    @Override // com.google.protobuf.InterfaceC0925r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(C c3, Object obj) {
        int[] iArr = this.f12187a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean z4 = true;
            if (i7 >= length) {
                this.f12197l.getClass();
                return c3.unknownFields.equals(((C) obj).unknownFields);
            }
            int U4 = U(i7);
            long j = U4 & 1048575;
            switch (T(U4)) {
                case 0:
                    if (k(c3, obj, i7)) {
                        J0 j02 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 1:
                    if (k(c3, obj, i7)) {
                        J0 j03 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 2:
                    if (k(c3, obj, i7)) {
                        J0 j04 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 3:
                    if (k(c3, obj, i7)) {
                        J0 j05 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 4:
                    if (k(c3, obj, i7)) {
                        J0 j06 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 5:
                    if (k(c3, obj, i7)) {
                        J0 j07 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 6:
                    if (k(c3, obj, i7)) {
                        J0 j08 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 7:
                    if (k(c3, obj, i7)) {
                        J0 j09 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 8:
                    if (k(c3, obj, i7)) {
                        J0 j010 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 9:
                    if (k(c3, obj, i7)) {
                        J0 j011 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 10:
                    if (k(c3, obj, i7)) {
                        J0 j012 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 11:
                    if (k(c3, obj, i7)) {
                        J0 j013 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 12:
                    if (k(c3, obj, i7)) {
                        J0 j014 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 13:
                    if (k(c3, obj, i7)) {
                        J0 j015 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 14:
                    if (k(c3, obj, i7)) {
                        J0 j016 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 15:
                    if (k(c3, obj, i7)) {
                        J0 j017 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 16:
                    if (k(c3, obj, i7)) {
                        J0 j018 = K0.f12117c;
                        break;
                    }
                    z4 = false;
                    break;
                case 17:
                    if (k(c3, obj, i7)) {
                        J0 j019 = K0.f12117c;
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
                    J0 j020 = K0.f12117c;
                    z4 = AbstractC0927s0.B(j020.k(j, c3), j020.k(j, obj));
                    break;
                case 50:
                    J0 j021 = K0.f12117c;
                    z4 = AbstractC0927s0.B(j021.k(j, c3), j021.k(j, obj));
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
                    J0 j022 = K0.f12117c;
                    if (j022.i(j3, c3) == j022.i(j3, obj)) {
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

    public final InterfaceC0925r0 q(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f12188b;
        InterfaceC0925r0 interfaceC0925r0 = (InterfaceC0925r0) objArr[i8];
        if (interfaceC0925r0 != null) {
            return interfaceC0925r0;
        }
        InterfaceC0925r0 a2 = C0916m0.f12232c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a2;
        return a2;
    }

    public final boolean r(int i7, Object obj) {
        int i8 = this.f12187a[i7 + 2];
        long j = i8 & 1048575;
        if (j != 1048575) {
            return ((1 << (i8 >>> 20)) & K0.f12117c.i(j, obj)) != 0;
        }
        int U4 = U(i7);
        long j3 = U4 & 1048575;
        switch (T(U4)) {
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
                Object k7 = K0.f12117c.k(j3, obj);
                if (k7 instanceof String) {
                    return !((String) k7).isEmpty();
                }
                if (k7 instanceof AbstractC0911k) {
                    return !AbstractC0911k.f12212b.equals(k7);
                }
                throw new IllegalArgumentException();
            case 9:
                return K0.f12117c.k(j3, obj) != null;
            case 10:
                return !AbstractC0911k.f12212b.equals(K0.f12117c.k(j3, obj));
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
        return i8 == 1048575 ? r(i7, obj) : (i9 & i10) != 0;
    }

    public final boolean u(int i7, int i8, Object obj) {
        return K0.f12117c.i((long) (this.f12187a[i8 + 2] & 1048575), obj) == i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        r0.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(Object obj, int i7, Object obj2, C0928t c0928t, C0686j c0686j) {
        long U4 = U(i7) & 1048575;
        Object k7 = K0.f12117c.k(U4, obj);
        C0894b0 c0894b0 = this.f12198m;
        if (k7 == null) {
            c0894b0.getClass();
            k7 = C0892a0.f12174b.c();
            K0.s(obj, U4, k7);
        } else {
            c0894b0.getClass();
            if (C0894b0.d(k7)) {
                C0892a0 c3 = C0892a0.f12174b.c();
                C0894b0.e(c3, k7);
                K0.s(obj, U4, c3);
                k7 = c3;
            }
        }
        c0894b0.getClass();
        C0892a0 c0892a0 = (C0892a0) k7;
        Y y4 = ((Z) obj2).f12172a;
        c0686j.W(2);
        H6.b bVar = (H6.b) c0686j.f9213e;
        int i8 = bVar.i(bVar.B());
        Object obj3 = "";
        Object obj4 = y4.f12171c;
        Object obj5 = obj4;
        while (true) {
            try {
                int a2 = c0686j.a();
                if (a2 == Integer.MAX_VALUE || bVar.f()) {
                    break;
                }
                if (a2 == 1) {
                    obj3 = c0686j.w(y4.f12169a, null, null);
                } else if (a2 != 2) {
                    try {
                        if (!c0686j.X()) {
                            throw new M("Unable to parse map entry.");
                        }
                    } catch (L unused) {
                        if (!c0686j.X()) {
                            throw new M("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = c0686j.w(y4.f12170b, obj4.getClass(), c0928t);
                }
            } catch (Throwable th) {
                bVar.h(i8);
                throw th;
            }
        }
    }

    public final void w(int i7, Object obj, Object obj2) {
        if (r(i7, obj2)) {
            long U4 = U(i7) & 1048575;
            Unsafe unsafe = f12186o;
            Object object = unsafe.getObject(obj2, U4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f12187a[i7] + " is present but null: " + obj2);
            }
            InterfaceC0925r0 q7 = q(i7);
            if (!r(i7, obj)) {
                if (t(object)) {
                    C d7 = q7.d();
                    q7.a(d7, object);
                    unsafe.putObject(obj, U4, d7);
                } else {
                    unsafe.putObject(obj, U4, object);
                }
                O(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, U4);
            if (!t(object2)) {
                C d8 = q7.d();
                q7.a(d8, object2);
                unsafe.putObject(obj, U4, d8);
                object2 = d8;
            }
            q7.a(object2, object);
        }
    }

    public final void x(int i7, Object obj, Object obj2) {
        int[] iArr = this.f12187a;
        int i8 = iArr[i7];
        if (u(i8, i7, obj2)) {
            long U4 = U(i7) & 1048575;
            Unsafe unsafe = f12186o;
            Object object = unsafe.getObject(obj2, U4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            InterfaceC0925r0 q7 = q(i7);
            if (!u(i8, i7, obj)) {
                if (t(object)) {
                    C d7 = q7.d();
                    q7.a(d7, object);
                    unsafe.putObject(obj, U4, d7);
                } else {
                    unsafe.putObject(obj, U4, object);
                }
                P(i8, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, U4);
            if (!t(object2)) {
                C d8 = q7.d();
                q7.a(d8, object2);
                unsafe.putObject(obj, U4, d8);
                object2 = d8;
            }
            q7.a(object2, object);
        }
    }

    public final Object y(int i7, Object obj) {
        InterfaceC0925r0 q7 = q(i7);
        long U4 = U(i7) & 1048575;
        if (!r(i7, obj)) {
            return q7.d();
        }
        Object object = f12186o.getObject(obj, U4);
        if (t(object)) {
            return object;
        }
        C d7 = q7.d();
        if (object != null) {
            q7.a(d7, object);
        }
        return d7;
    }

    public final Object z(int i7, int i8, Object obj) {
        InterfaceC0925r0 q7 = q(i8);
        if (!u(i7, i8, obj)) {
            return q7.d();
        }
        Object object = f12186o.getObject(obj, U(i8) & 1048575);
        if (t(object)) {
            return object;
        }
        C d7 = q7.d();
        if (object != null) {
            q7.a(d7, object);
        }
        return d7;
    }
}
