package androidx.datastore.preferences.protobuf;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.impl.C0644l9;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class N implements W {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2171n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f2172o = j0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2173a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2176d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0147w f2177e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2178g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2179h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2180i;

    /* renamed from: j, reason: collision with root package name */
    public final P f2181j;

    /* renamed from: k, reason: collision with root package name */
    public final C f2182k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f2183l;

    /* renamed from: m, reason: collision with root package name */
    public final J f2184m;

    public N(int[] iArr, Object[] objArr, int i3, int i4, AbstractC0147w abstractC0147w, int[] iArr2, int i5, int i6, P p3, C c3, e0 e0Var, C0141p c0141p, J j3) {
        this.f2173a = iArr;
        this.f2174b = objArr;
        this.f2175c = i3;
        this.f2176d = i4;
        this.f = Objects.nonNull(abstractC0147w);
        this.f2178g = iArr2;
        this.f2179h = i5;
        this.f2180i = i6;
        this.f2181j = p3;
        this.f2182k = c3;
        this.f2183l = e0Var;
        this.f2177e = abstractC0147w;
        this.f2184m = j3;
    }

    public static Field F(String str, Class cls) {
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

    public static int K(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0147w) {
            return ((AbstractC0147w) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static N w(V v3, P p3, C c3, e0 e0Var, C0141p c0141p, J j3) {
        int i3;
        int charAt;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        int i10;
        char charAt2;
        int i11;
        char charAt3;
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
        int i19;
        int i20;
        int i21;
        int[] iArr2;
        int i22;
        int objectFieldOffset;
        String str;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Field F3;
        char charAt10;
        int i29;
        int i30;
        Object obj;
        Field F4;
        Object obj2;
        Field F5;
        int i31;
        char charAt11;
        int i32;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        String str2 = v3.f2197b;
        int length = str2.length();
        char c4 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i3 = i36 + 1;
                if (str2.charAt(i36) < 55296) {
                    break;
                }
                i36 = i3;
            }
        } else {
            i3 = 1;
        }
        int i37 = i3 + 1;
        int charAt15 = str2.charAt(i3);
        if (charAt15 >= 55296) {
            int i38 = charAt15 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                charAt14 = str2.charAt(i37);
                if (charAt14 < 55296) {
                    break;
                }
                i38 |= (charAt14 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            charAt15 = i38 | (charAt14 << i39);
            i37 = i35;
        }
        if (charAt15 == 0) {
            i5 = 0;
            i8 = 0;
            charAt = 0;
            i4 = 0;
            i7 = 0;
            i9 = 0;
            iArr = f2171n;
            i6 = 0;
        } else {
            int i40 = i37 + 1;
            int charAt16 = str2.charAt(i37);
            if (charAt16 >= 55296) {
                int i41 = charAt16 & 8191;
                int i42 = 13;
                while (true) {
                    i17 = i40 + 1;
                    charAt9 = str2.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i17;
                }
                charAt16 = i41 | (charAt9 << i42);
                i40 = i17;
            }
            int i43 = i40 + 1;
            int charAt17 = str2.charAt(i40);
            if (charAt17 >= 55296) {
                int i44 = charAt17 & 8191;
                int i45 = 13;
                while (true) {
                    i16 = i43 + 1;
                    charAt8 = str2.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i16;
                }
                charAt17 = i44 | (charAt8 << i45);
                i43 = i16;
            }
            int i46 = i43 + 1;
            int charAt18 = str2.charAt(i43);
            if (charAt18 >= 55296) {
                int i47 = charAt18 & 8191;
                int i48 = 13;
                while (true) {
                    i15 = i46 + 1;
                    charAt7 = str2.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i15;
                }
                charAt18 = i47 | (charAt7 << i48);
                i46 = i15;
            }
            int i49 = i46 + 1;
            int charAt19 = str2.charAt(i46);
            if (charAt19 >= 55296) {
                int i50 = charAt19 & 8191;
                int i51 = 13;
                while (true) {
                    i14 = i49 + 1;
                    charAt6 = str2.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i14;
                }
                charAt19 = i50 | (charAt6 << i51);
                i49 = i14;
            }
            int i52 = i49 + 1;
            charAt = str2.charAt(i49);
            if (charAt >= 55296) {
                int i53 = charAt & 8191;
                int i54 = 13;
                while (true) {
                    i13 = i52 + 1;
                    charAt5 = str2.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i13;
                }
                charAt = i53 | (charAt5 << i54);
                i52 = i13;
            }
            int i55 = i52 + 1;
            int charAt20 = str2.charAt(i52);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = 13;
                while (true) {
                    i12 = i55 + 1;
                    charAt4 = str2.charAt(i55);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i12;
                }
                charAt20 = i56 | (charAt4 << i57);
                i55 = i12;
            }
            int i58 = i55 + 1;
            int charAt21 = str2.charAt(i55);
            if (charAt21 >= 55296) {
                int i59 = charAt21 & 8191;
                int i60 = 13;
                while (true) {
                    i11 = i58 + 1;
                    charAt3 = str2.charAt(i58);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i59 |= (charAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i11;
                }
                charAt21 = i59 | (charAt3 << i60);
                i58 = i11;
            }
            int i61 = i58 + 1;
            int charAt22 = str2.charAt(i58);
            if (charAt22 >= 55296) {
                int i62 = charAt22 & 8191;
                int i63 = 13;
                while (true) {
                    i10 = i61 + 1;
                    charAt2 = str2.charAt(i61);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i62 |= (charAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i10;
                }
                charAt22 = i62 | (charAt2 << i63);
                i61 = i10;
            }
            int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
            int i64 = (charAt16 * 2) + charAt17;
            int i65 = charAt20;
            i4 = charAt18;
            i5 = i65;
            i6 = charAt16;
            i37 = i61;
            iArr = iArr3;
            i7 = charAt19;
            i8 = i64;
            i9 = charAt22;
        }
        Unsafe unsafe = f2172o;
        Class<?> cls = v3.f2196a.getClass();
        int[] iArr4 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i66 = i9 + i5;
        int i67 = i66;
        int i68 = i9;
        int i69 = 0;
        int i70 = 0;
        while (i37 < length) {
            int i71 = i37 + 1;
            int charAt23 = str2.charAt(i37);
            if (charAt23 >= c4) {
                int i72 = charAt23 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i34 = i73 + 1;
                    charAt13 = str2.charAt(i73);
                    if (charAt13 < c4) {
                        break;
                    }
                    i72 |= (charAt13 & 8191) << i74;
                    i74 += 13;
                    i73 = i34;
                }
                charAt23 = i72 | (charAt13 << i74);
                i18 = i34;
            } else {
                i18 = i71;
            }
            int i75 = i18 + 1;
            int charAt24 = str2.charAt(i18);
            if (charAt24 >= c4) {
                int i76 = charAt24 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i33 = i77 + 1;
                    charAt12 = str2.charAt(i77);
                    i19 = length;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i76 |= (charAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i33;
                    length = i19;
                }
                charAt24 = i76 | (charAt12 << i78);
                i20 = i33;
            } else {
                i19 = length;
                i20 = i75;
            }
            int i79 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i80 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            Object[] objArr2 = v3.f2198c;
            if (i79 >= 51) {
                int i81 = i20 + 1;
                int charAt25 = str2.charAt(i20);
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i31 = i83 + 1;
                        charAt11 = str2.charAt(i83);
                        i32 = i82;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i82 = i32 | ((charAt11 & 8191) << i84);
                        i84 += 13;
                        i83 = i31;
                    }
                    charAt25 = i32 | (charAt11 << i84);
                    i29 = i31;
                } else {
                    i29 = i81;
                }
                int i85 = charAt25;
                int i86 = i79 - 51;
                int i87 = i29;
                if (i86 == 9 || i86 == 17) {
                    i30 = i8 + 1;
                    objArr[((i70 / 3) * 2) + 1] = objArr2[i8];
                } else {
                    if (i86 == 12 && (M.j.a(v3.a(), 1) || (charAt24 & 2048) != 0)) {
                        i30 = i8 + 1;
                        objArr[((i70 / 3) * 2) + 1] = objArr2[i8];
                    }
                    int i88 = i85 * 2;
                    obj = objArr2[i88];
                    if (obj instanceof Field) {
                        F4 = F((String) obj, cls);
                        objArr2[i88] = F4;
                    } else {
                        F4 = (Field) obj;
                    }
                    i21 = i6;
                    iArr2 = iArr4;
                    i28 = (int) unsafe.objectFieldOffset(F4);
                    int i89 = i88 + 1;
                    obj2 = objArr2[i89];
                    if (obj2 instanceof Field) {
                        F5 = F((String) obj2, cls);
                        objArr2[i89] = F5;
                    } else {
                        F5 = (Field) obj2;
                    }
                    i26 = (int) unsafe.objectFieldOffset(F5);
                    i24 = i87;
                    str = str2;
                    i27 = 0;
                }
                i8 = i30;
                int i882 = i85 * 2;
                obj = objArr2[i882];
                if (obj instanceof Field) {
                }
                i21 = i6;
                iArr2 = iArr4;
                i28 = (int) unsafe.objectFieldOffset(F4);
                int i892 = i882 + 1;
                obj2 = objArr2[i892];
                if (obj2 instanceof Field) {
                }
                i26 = (int) unsafe.objectFieldOffset(F5);
                i24 = i87;
                str = str2;
                i27 = 0;
            } else {
                i21 = i6;
                iArr2 = iArr4;
                int i90 = i8 + 1;
                Field F6 = F((String) objArr2[i8], cls);
                if (i79 == 9 || i79 == 17) {
                    i22 = i90;
                    objArr[((i70 / 3) * 2) + 1] = F6.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i8 += 2;
                        objArr[((i70 / 3) * 2) + 1] = objArr2[i90];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i22 = i90;
                        if (v3.a() == 1 || (charAt24 & 2048) != 0) {
                            i8 += 2;
                            objArr[((i70 / 3) * 2) + 1] = objArr2[i22];
                        }
                    } else if (i79 == 50) {
                        int i91 = i68 + 1;
                        iArr[i68] = i70;
                        int i92 = (i70 / 3) * 2;
                        int i93 = i8 + 2;
                        objArr[i92] = objArr2[i90];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i92 + 1] = objArr2[i93];
                            i8 += 3;
                            i68 = i91;
                        } else {
                            i68 = i91;
                            i8 = i93;
                        }
                    } else {
                        i22 = i90;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F6);
                    if ((charAt24 & 4096) != 0 || i79 > 17) {
                        str = str2;
                        i23 = 1048575;
                        i24 = i20;
                        i25 = 0;
                    } else {
                        int i94 = i20 + 1;
                        int charAt26 = str2.charAt(i20);
                        if (charAt26 >= 55296) {
                            int i95 = charAt26 & 8191;
                            int i96 = 13;
                            while (true) {
                                i24 = i94 + 1;
                                charAt10 = str2.charAt(i94);
                                if (charAt10 < 55296) {
                                    break;
                                }
                                i95 |= (charAt10 & 8191) << i96;
                                i96 += 13;
                                i94 = i24;
                            }
                            charAt26 = i95 | (charAt10 << i96);
                        } else {
                            i24 = i94;
                        }
                        int i97 = (charAt26 / 32) + (i21 * 2);
                        Object obj3 = objArr2[i97];
                        if (obj3 instanceof Field) {
                            F3 = (Field) obj3;
                        } else {
                            F3 = F((String) obj3, cls);
                            objArr2[i97] = F3;
                        }
                        str = str2;
                        int i98 = charAt26;
                        i23 = (int) unsafe.objectFieldOffset(F3);
                        i25 = i98 % 32;
                    }
                    if (i79 >= 18 || i79 > 49) {
                        i26 = i23;
                        i27 = i25;
                        i28 = objectFieldOffset;
                    } else {
                        iArr[i67] = objectFieldOffset;
                        i26 = i23;
                        i27 = i25;
                        i28 = objectFieldOffset;
                        i67++;
                    }
                }
                i8 = i22;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F6);
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                i23 = 1048575;
                i24 = i20;
                i25 = 0;
                if (i79 >= 18) {
                }
                i26 = i23;
                i27 = i25;
                i28 = objectFieldOffset;
            }
            int i99 = i70 + 1;
            iArr2[i70] = i80;
            int i100 = i70 + 2;
            int i101 = i27;
            iArr2[i99] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i79 << 20) | i28;
            i70 += 3;
            iArr2[i100] = (i101 << 20) | i26;
            str2 = str;
            length = i19;
            i37 = i24;
            i6 = i21;
            iArr4 = iArr2;
            c4 = 55296;
        }
        return new N(iArr4, objArr, i4, i7, v3.f2196a, iArr, i9, i66, p3, c3, e0Var, c0141p, j3);
    }

    public static long x(int i3) {
        return i3 & 1048575;
    }

    public static int y(long j3, Object obj) {
        return ((Integer) j0.f2253c.h(j3, obj)).intValue();
    }

    public static long z(long j3, Object obj) {
        return ((Long) j0.f2253c.h(j3, obj)).longValue();
    }

    public final int A(int i3) {
        if (i3 >= this.f2175c && i3 <= this.f2176d) {
            int[] iArr = this.f2173a;
            int length = (iArr.length / 3) - 1;
            int i4 = 0;
            while (i4 <= length) {
                int i5 = (length + i4) >>> 1;
                int i6 = i5 * 3;
                int i7 = iArr[i6];
                if (i3 == i7) {
                    return i6;
                }
                if (i3 < i7) {
                    length = i5 - 1;
                } else {
                    i4 = i5 + 1;
                }
            }
        }
        return -1;
    }

    public final void B(Object obj, long j3, C0136k c0136k, W w3, C0140o c0140o) {
        int u3;
        this.f2182k.getClass();
        InterfaceC0148x a3 = C.a(j3, obj);
        int i3 = c0136k.f2258b;
        if ((i3 & 7) != 3) {
            throw A.b();
        }
        do {
            AbstractC0147w newInstance = w3.newInstance();
            c0136k.b(newInstance, w3, c0140o);
            w3.d(newInstance);
            ((U) a3).add(newInstance);
            AbstractC0135j abstractC0135j = c0136k.f2257a;
            if (abstractC0135j.c() || c0136k.f2260d != 0) {
                return;
            } else {
                u3 = abstractC0135j.u();
            }
        } while (u3 == i3);
        c0136k.f2260d = u3;
    }

    public final void C(Object obj, int i3, C0136k c0136k, W w3, C0140o c0140o) {
        int u3;
        this.f2182k.getClass();
        InterfaceC0148x a3 = C.a(i3 & 1048575, obj);
        int i4 = c0136k.f2258b;
        if ((i4 & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0147w newInstance = w3.newInstance();
            c0136k.c(newInstance, w3, c0140o);
            w3.d(newInstance);
            ((U) a3).add(newInstance);
            AbstractC0135j abstractC0135j = c0136k.f2257a;
            if (abstractC0135j.c() || c0136k.f2260d != 0) {
                return;
            } else {
                u3 = abstractC0135j.u();
            }
        } while (u3 == i4);
        c0136k.f2260d = u3;
    }

    public final void D(int i3, C0136k c0136k, Object obj) {
        if ((536870912 & i3) != 0) {
            c0136k.w(2);
            j0.o(i3 & 1048575, obj, c0136k.f2257a.t());
        } else if (!this.f) {
            j0.o(i3 & 1048575, obj, c0136k.e());
        } else {
            c0136k.w(2);
            j0.o(i3 & 1048575, obj, c0136k.f2257a.s());
        }
    }

    public final void E(int i3, C0136k c0136k, Object obj) {
        boolean z3 = (536870912 & i3) != 0;
        C c3 = this.f2182k;
        if (z3) {
            c3.getClass();
            c0136k.s(C.a(i3 & 1048575, obj), true);
        } else {
            c3.getClass();
            c0136k.s(C.a(i3 & 1048575, obj), false);
        }
    }

    public final void G(int i3, Object obj) {
        int i4 = this.f2173a[i3 + 2];
        long j3 = 1048575 & i4;
        if (j3 == 1048575) {
            return;
        }
        j0.m(obj, j3, (1 << (i4 >>> 20)) | j0.f2253c.f(j3, obj));
    }

    public final void H(int i3, int i4, Object obj) {
        j0.m(obj, this.f2173a[i4 + 2] & 1048575, i3);
    }

    public final void I(Object obj, int i3, AbstractC0126a abstractC0126a) {
        f2172o.putObject(obj, L(i3) & 1048575, abstractC0126a);
        G(i3, obj);
    }

    public final void J(Object obj, int i3, int i4, AbstractC0126a abstractC0126a) {
        f2172o.putObject(obj, L(i4) & 1048575, abstractC0126a);
        H(i3, i4, obj);
    }

    public final int L(int i3) {
        return this.f2173a[i3 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, F f) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        N n3 = this;
        int i9 = 2;
        int[] iArr = n3.f2173a;
        int length = iArr.length;
        Unsafe unsafe = f2172o;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int L = n3.L(i12);
            int i14 = iArr[i12];
            int K2 = K(L);
            if (K2 <= 17) {
                int i15 = iArr[i12 + 2];
                i3 = 1;
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i4 = L;
                i5 = 1 << (i15 >>> 20);
            } else {
                i3 = 1;
                i4 = L;
                i5 = 0;
            }
            int i17 = i9;
            long j3 = i4 & i10;
            switch (K2) {
                case 0:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        double d3 = j0.f2253c.d(j3, obj);
                        C0138m c0138m = (C0138m) f.f2161a;
                        c0138m.getClass();
                        c0138m.C0(i14, Double.doubleToRawLongBits(d3));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        float e3 = j0.f2253c.e(j3, obj);
                        C0138m c0138m2 = (C0138m) f.f2161a;
                        c0138m2.getClass();
                        c0138m2.A0(i14, Float.floatToRawIntBits(e3));
                    }
                    n3 = this;
                    break;
                case 2:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).M0(i14, unsafe.getLong(obj, j3));
                    }
                    n3 = this;
                    break;
                case 3:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).M0(i14, unsafe.getLong(obj, j3));
                    }
                    n3 = this;
                    break;
                case 4:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).E0(i14, unsafe.getInt(obj, j3));
                    }
                    n3 = this;
                    break;
                case 5:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).C0(i14, unsafe.getLong(obj, j3));
                    }
                    n3 = this;
                    break;
                case 6:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).A0(i14, unsafe.getInt(obj, j3));
                    }
                    n3 = this;
                    break;
                case 7:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).x0(i14, j0.f2253c.c(j3, obj));
                    }
                    n3 = this;
                    break;
                case 8:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((C0138m) f.f2161a).H0(i14, (String) object);
                        } else {
                            ((C0138m) f.f2161a).y0(i14, (C0132g) object);
                        }
                    }
                    n3 = this;
                    break;
                case 9:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).G0(i14, (AbstractC0126a) unsafe.getObject(obj, j3), n3.l(i12));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).y0(i14, (C0132g) unsafe.getObject(obj, j3));
                    }
                    n3 = this;
                    break;
                case 11:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).K0(i14, unsafe.getInt(obj, j3));
                    }
                    n3 = this;
                    break;
                case 12:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).E0(i14, unsafe.getInt(obj, j3));
                    }
                    n3 = this;
                    break;
                case 13:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).A0(i14, unsafe.getInt(obj, j3));
                    }
                    n3 = this;
                    break;
                case 14:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        ((C0138m) f.f2161a).C0(i14, unsafe.getLong(obj, j3));
                    }
                    n3 = this;
                    break;
                case 15:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        int i18 = unsafe.getInt(obj, j3);
                        ((C0138m) f.f2161a).K0(i14, (i18 >> 31) ^ (i18 << 1));
                        n3 = this;
                        break;
                    }
                    n3 = this;
                case 16:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        long j4 = unsafe.getLong(obj, j3);
                        ((C0138m) f.f2161a).M0(i14, (j4 >> 63) ^ (j4 << 1));
                    }
                    n3 = this;
                    break;
                case 17:
                    if (n3.n(obj, i12, i11, i13, i5)) {
                        f.a(i14, unsafe.getObject(obj, j3), n3.l(i12));
                    }
                    break;
                case 18:
                    i6 = i11;
                    X.n(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case C0644l9.f7759C /* 19 */:
                    i6 = i11;
                    X.r(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case C0644l9.f7760D /* 20 */:
                    i6 = i11;
                    X.t(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case C0644l9.f7761E /* 21 */:
                    i6 = i11;
                    X.z(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case 22:
                    i6 = i11;
                    X.s(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case 23:
                    i6 = i11;
                    X.q(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case 24:
                    i6 = i11;
                    X.p(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case C0644l9.f7762F /* 25 */:
                    i6 = i11;
                    X.m(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case C0644l9.f7763G /* 26 */:
                    i7 = i11;
                    int i19 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = X.f2200a;
                    if (list != null && !list.isEmpty()) {
                        f.getClass();
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            ((C0138m) f.f2161a).H0(i19, (String) list.get(i20));
                        }
                    }
                    i11 = i7;
                    break;
                case C0644l9.f7764H /* 27 */:
                    i7 = i11;
                    int i21 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    W l3 = n3.l(i12);
                    Class cls2 = X.f2200a;
                    if (list2 != null && !list2.isEmpty()) {
                        f.getClass();
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((C0138m) f.f2161a).G0(i21, (AbstractC0126a) list2.get(i22), l3);
                        }
                    }
                    i11 = i7;
                    break;
                case 28:
                    i7 = i11;
                    int i23 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = X.f2200a;
                    if (list3 != null && !list3.isEmpty()) {
                        f.getClass();
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            ((C0138m) f.f2161a).y0(i23, (C0132g) list3.get(i24));
                        }
                    }
                    i11 = i7;
                    break;
                case C0644l9.f7765I /* 29 */:
                    i6 = i11;
                    X.y(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case 30:
                    i6 = i11;
                    X.o(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case 31:
                    i6 = i11;
                    X.u(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case 32:
                    i6 = i11;
                    X.v(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case 33:
                    i6 = i11;
                    X.w(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case 34:
                    i6 = i11;
                    X.x(iArr[i12], (List) unsafe.getObject(obj, j3), f, false);
                    i11 = i6;
                    break;
                case C0644l9.f7766J /* 35 */:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.n(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 36:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.r(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 37:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.t(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case C0644l9.f7767K /* 38 */:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.z(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 39:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.s(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case C0644l9.L /* 40 */:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.q(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 41:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.p(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case C0644l9.f7768M /* 42 */:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.m(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 43:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.y(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 44:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.o(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 45:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.u(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 46:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.v(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 47:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.w(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 48:
                    i8 = i11;
                    z3 = i3 == true ? 1 : 0;
                    X.x(iArr[i12], (List) unsafe.getObject(obj, j3), f, z3);
                    i11 = i8;
                    break;
                case 49:
                    i8 = i11;
                    int i25 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    W l4 = n3.l(i12);
                    Class cls4 = X.f2200a;
                    if (list4 != null && !list4.isEmpty()) {
                        f.getClass();
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            f.a(i25, list4.get(i26), l4);
                        }
                    }
                    z3 = true;
                    i11 = i8;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j3);
                    if (object2 != null) {
                        Object obj2 = n3.f2174b[(i12 / 3) * i17];
                        n3.f2184m.getClass();
                        G g3 = ((H) obj2).f2165a;
                        C0138m c0138m3 = (C0138m) f.f2161a;
                        c0138m3.getClass();
                        for (Map.Entry entry : ((I) object2).entrySet()) {
                            c0138m3.J0(i14, i17);
                            c0138m3.L0(H.a(g3, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            r.b(c0138m3, g3.f2162a, i3, key);
                            i17 = 2;
                            r.b(c0138m3, g3.f2163b, 2, value);
                            i11 = i11;
                            i3 = 1;
                        }
                    }
                    i7 = i11;
                    i11 = i7;
                    break;
                case 51:
                    if (n3.p(i14, i12, obj)) {
                        double doubleValue = ((Double) j0.f2253c.h(j3, obj)).doubleValue();
                        C0138m c0138m4 = (C0138m) f.f2161a;
                        c0138m4.getClass();
                        c0138m4.C0(i14, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case 52:
                    if (n3.p(i14, i12, obj)) {
                        float floatValue = ((Float) j0.f2253c.h(j3, obj)).floatValue();
                        C0138m c0138m5 = (C0138m) f.f2161a;
                        c0138m5.getClass();
                        c0138m5.A0(i14, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).M0(i14, z(j3, obj));
                    }
                    break;
                case 54:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).M0(i14, z(j3, obj));
                    }
                    break;
                case 55:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).E0(i14, y(j3, obj));
                    }
                    break;
                case 56:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).C0(i14, z(j3, obj));
                    }
                    break;
                case 57:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).A0(i14, y(j3, obj));
                    }
                    break;
                case 58:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).x0(i14, ((Boolean) j0.f2253c.h(j3, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (n3.p(i14, i12, obj)) {
                        Object object3 = unsafe.getObject(obj, j3);
                        if (object3 instanceof String) {
                            ((C0138m) f.f2161a).H0(i14, (String) object3);
                        } else {
                            ((C0138m) f.f2161a).y0(i14, (C0132g) object3);
                        }
                    }
                    break;
                case 60:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).G0(i14, (AbstractC0126a) unsafe.getObject(obj, j3), n3.l(i12));
                    }
                    break;
                case 61:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).y0(i14, (C0132g) unsafe.getObject(obj, j3));
                    }
                    break;
                case 62:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).K0(i14, y(j3, obj));
                    }
                    break;
                case 63:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).E0(i14, y(j3, obj));
                    }
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).A0(i14, y(j3, obj));
                    }
                    break;
                case 65:
                    if (n3.p(i14, i12, obj)) {
                        ((C0138m) f.f2161a).C0(i14, z(j3, obj));
                    }
                    break;
                case 66:
                    if (n3.p(i14, i12, obj)) {
                        int y = y(j3, obj);
                        ((C0138m) f.f2161a).K0(i14, (y >> 31) ^ (y << 1));
                    }
                    break;
                case 67:
                    if (n3.p(i14, i12, obj)) {
                        long z4 = z(j3, obj);
                        ((C0138m) f.f2161a).M0(i14, (z4 << (i3 == true ? 1L : 0L)) ^ (z4 >> 63));
                    }
                    break;
                case 68:
                    if (n3.p(i14, i12, obj)) {
                        f.a(i14, unsafe.getObject(obj, j3), n3.l(i12));
                    }
                    break;
            }
            i12 += 3;
            i9 = i17;
            i10 = 1048575;
        }
        n3.f2183l.getClass();
        ((AbstractC0147w) obj).unknownFields.d(f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2173a;
            if (i3 >= iArr.length) {
                X.k(this.f2183l, obj, obj2);
                return;
            }
            int L = L(i3);
            long j3 = 1048575 & L;
            int i4 = iArr[i3];
            switch (K(L)) {
                case 0:
                    if (m(i3, obj2)) {
                        i0 i0Var = j0.f2253c;
                        obj3 = obj;
                        i0Var.l(obj3, j3, i0Var.d(j3, obj2));
                        G(i3, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (m(i3, obj2)) {
                        i0 i0Var2 = j0.f2253c;
                        i0Var2.m(obj, j3, i0Var2.e(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(i3, obj2)) {
                        j0.n(obj, j3, j0.f2253c.g(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(i3, obj2)) {
                        j0.n(obj, j3, j0.f2253c.g(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(i3, obj2)) {
                        j0.m(obj, j3, j0.f2253c.f(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(i3, obj2)) {
                        j0.n(obj, j3, j0.f2253c.g(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(i3, obj2)) {
                        j0.m(obj, j3, j0.f2253c.f(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(i3, obj2)) {
                        i0 i0Var3 = j0.f2253c;
                        i0Var3.j(obj, j3, i0Var3.c(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(i3, obj2)) {
                        j0.o(j3, obj, j0.f2253c.h(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(obj, i3, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(i3, obj2)) {
                        j0.o(j3, obj, j0.f2253c.h(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(i3, obj2)) {
                        j0.m(obj, j3, j0.f2253c.f(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(i3, obj2)) {
                        j0.m(obj, j3, j0.f2253c.f(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(i3, obj2)) {
                        j0.m(obj, j3, j0.f2253c.f(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(i3, obj2)) {
                        j0.n(obj, j3, j0.f2253c.g(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(i3, obj2)) {
                        j0.m(obj, j3, j0.f2253c.f(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(i3, obj2)) {
                        j0.n(obj, j3, j0.f2253c.g(j3, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(obj, i3, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case C0644l9.f7759C /* 19 */:
                case C0644l9.f7760D /* 20 */:
                case C0644l9.f7761E /* 21 */:
                case 22:
                case 23:
                case 24:
                case C0644l9.f7762F /* 25 */:
                case C0644l9.f7763G /* 26 */:
                case C0644l9.f7764H /* 27 */:
                case 28:
                case C0644l9.f7765I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case C0644l9.f7766J /* 35 */:
                case 36:
                case 37:
                case C0644l9.f7767K /* 38 */:
                case 39:
                case C0644l9.L /* 40 */:
                case 41:
                case C0644l9.f7768M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f2182k.getClass();
                    i0 i0Var4 = j0.f2253c;
                    InterfaceC0148x interfaceC0148x = (InterfaceC0148x) i0Var4.h(j3, obj);
                    InterfaceC0148x interfaceC0148x2 = (InterfaceC0148x) i0Var4.h(j3, obj2);
                    U u3 = (U) interfaceC0148x;
                    int i5 = u3.f2195c;
                    int i6 = ((U) interfaceC0148x2).f2195c;
                    if (i5 > 0 && i6 > 0) {
                        if (!((AbstractC0127b) interfaceC0148x).f2215a) {
                            interfaceC0148x = u3.d(i6 + i5);
                        }
                        ((AbstractC0127b) interfaceC0148x).addAll(interfaceC0148x2);
                    }
                    if (i5 > 0) {
                        interfaceC0148x2 = interfaceC0148x;
                    }
                    j0.o(j3, obj, interfaceC0148x2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = X.f2200a;
                    i0 i0Var5 = j0.f2253c;
                    Object h3 = i0Var5.h(j3, obj);
                    Object h4 = i0Var5.h(j3, obj2);
                    this.f2184m.getClass();
                    j0.o(j3, obj, J.a(h3, h4));
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
                    if (p(i4, i3, obj2)) {
                        j0.o(j3, obj, j0.f2253c.h(j3, obj2));
                        H(i4, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(obj, i3, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (p(i4, i3, obj2)) {
                        j0.o(j3, obj, j0.f2253c.h(j3, obj2));
                        H(i4, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(obj, i3, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i3 += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, F f) {
        f.getClass();
        M(obj, f);
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
    @Override // androidx.datastore.preferences.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(AbstractC0147w abstractC0147w) {
        int i3;
        int b3;
        int i4;
        int[] iArr = this.f2173a;
        int length = iArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int L = L(i6);
            int i7 = iArr[i6];
            long j3 = 1048575 & L;
            int i8 = 1237;
            int i9 = 37;
            switch (K(L)) {
                case 0:
                    i3 = i5 * 53;
                    b3 = AbstractC0149y.b(Double.doubleToLongBits(j0.f2253c.d(j3, abstractC0147w)));
                    i5 = b3 + i3;
                    break;
                case 1:
                    i3 = i5 * 53;
                    b3 = Float.floatToIntBits(j0.f2253c.e(j3, abstractC0147w));
                    i5 = b3 + i3;
                    break;
                case 2:
                    i3 = i5 * 53;
                    b3 = AbstractC0149y.b(j0.f2253c.g(j3, abstractC0147w));
                    i5 = b3 + i3;
                    break;
                case 3:
                    i3 = i5 * 53;
                    b3 = AbstractC0149y.b(j0.f2253c.g(j3, abstractC0147w));
                    i5 = b3 + i3;
                    break;
                case 4:
                    i3 = i5 * 53;
                    b3 = j0.f2253c.f(j3, abstractC0147w);
                    i5 = b3 + i3;
                    break;
                case 5:
                    i3 = i5 * 53;
                    b3 = AbstractC0149y.b(j0.f2253c.g(j3, abstractC0147w));
                    i5 = b3 + i3;
                    break;
                case 6:
                    i3 = i5 * 53;
                    b3 = j0.f2253c.f(j3, abstractC0147w);
                    i5 = b3 + i3;
                    break;
                case 7:
                    i4 = i5 * 53;
                    boolean c3 = j0.f2253c.c(j3, abstractC0147w);
                    Charset charset = AbstractC0149y.f2300a;
                    break;
                case 8:
                    i3 = i5 * 53;
                    b3 = ((String) j0.f2253c.h(j3, abstractC0147w)).hashCode();
                    i5 = b3 + i3;
                    break;
                case 9:
                    Object h3 = j0.f2253c.h(j3, abstractC0147w);
                    if (h3 != null) {
                        i9 = h3.hashCode();
                    }
                    i5 = (i5 * 53) + i9;
                    break;
                case 10:
                    i3 = i5 * 53;
                    b3 = j0.f2253c.h(j3, abstractC0147w).hashCode();
                    i5 = b3 + i3;
                    break;
                case 11:
                    i3 = i5 * 53;
                    b3 = j0.f2253c.f(j3, abstractC0147w);
                    i5 = b3 + i3;
                    break;
                case 12:
                    i3 = i5 * 53;
                    b3 = j0.f2253c.f(j3, abstractC0147w);
                    i5 = b3 + i3;
                    break;
                case 13:
                    i3 = i5 * 53;
                    b3 = j0.f2253c.f(j3, abstractC0147w);
                    i5 = b3 + i3;
                    break;
                case 14:
                    i3 = i5 * 53;
                    b3 = AbstractC0149y.b(j0.f2253c.g(j3, abstractC0147w));
                    i5 = b3 + i3;
                    break;
                case 15:
                    i3 = i5 * 53;
                    b3 = j0.f2253c.f(j3, abstractC0147w);
                    i5 = b3 + i3;
                    break;
                case 16:
                    i3 = i5 * 53;
                    b3 = AbstractC0149y.b(j0.f2253c.g(j3, abstractC0147w));
                    i5 = b3 + i3;
                    break;
                case 17:
                    Object h4 = j0.f2253c.h(j3, abstractC0147w);
                    if (h4 != null) {
                        i9 = h4.hashCode();
                    }
                    i5 = (i5 * 53) + i9;
                    break;
                case 18:
                case C0644l9.f7759C /* 19 */:
                case C0644l9.f7760D /* 20 */:
                case C0644l9.f7761E /* 21 */:
                case 22:
                case 23:
                case 24:
                case C0644l9.f7762F /* 25 */:
                case C0644l9.f7763G /* 26 */:
                case C0644l9.f7764H /* 27 */:
                case 28:
                case C0644l9.f7765I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case C0644l9.f7766J /* 35 */:
                case 36:
                case 37:
                case C0644l9.f7767K /* 38 */:
                case 39:
                case C0644l9.L /* 40 */:
                case 41:
                case C0644l9.f7768M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i5 * 53;
                    b3 = j0.f2253c.h(j3, abstractC0147w).hashCode();
                    i5 = b3 + i3;
                    break;
                case 50:
                    i3 = i5 * 53;
                    b3 = j0.f2253c.h(j3, abstractC0147w).hashCode();
                    i5 = b3 + i3;
                    break;
                case 51:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0149y.b(Double.doubleToLongBits(((Double) j0.f2253c.h(j3, abstractC0147w)).doubleValue()));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = Float.floatToIntBits(((Float) j0.f2253c.h(j3, abstractC0147w)).floatValue());
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0149y.b(z(j3, abstractC0147w));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0149y.b(z(j3, abstractC0147w));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = y(j3, abstractC0147w);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0149y.b(z(j3, abstractC0147w));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = y(j3, abstractC0147w);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (p(i7, i6, abstractC0147w)) {
                        i4 = i5 * 53;
                        boolean booleanValue = ((Boolean) j0.f2253c.h(j3, abstractC0147w)).booleanValue();
                        Charset charset2 = AbstractC0149y.f2300a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = ((String) j0.f2253c.h(j3, abstractC0147w)).hashCode();
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = j0.f2253c.h(j3, abstractC0147w).hashCode();
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = j0.f2253c.h(j3, abstractC0147w).hashCode();
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = y(j3, abstractC0147w);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = y(j3, abstractC0147w);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = y(j3, abstractC0147w);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0149y.b(z(j3, abstractC0147w));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = y(j3, abstractC0147w);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0149y.b(z(j3, abstractC0147w));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (p(i7, i6, abstractC0147w)) {
                        i3 = i5 * 53;
                        b3 = j0.f2253c.h(j3, abstractC0147w).hashCode();
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f2183l.getClass();
        return abstractC0147w.unknownFields.hashCode() + (i5 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj) {
        if (o(obj)) {
            if (obj instanceof AbstractC0147w) {
                AbstractC0147w abstractC0147w = (AbstractC0147w) obj;
                abstractC0147w.k(Integer.MAX_VALUE);
                abstractC0147w.memoizedHashCode = 0;
                abstractC0147w.h();
            }
            int[] iArr = this.f2173a;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int L = L(i3);
                long j3 = 1048575 & L;
                int K2 = K(L);
                if (K2 != 9) {
                    if (K2 != 60 && K2 != 68) {
                        switch (K2) {
                            case 18:
                            case C0644l9.f7759C /* 19 */:
                            case C0644l9.f7760D /* 20 */:
                            case C0644l9.f7761E /* 21 */:
                            case 22:
                            case 23:
                            case 24:
                            case C0644l9.f7762F /* 25 */:
                            case C0644l9.f7763G /* 26 */:
                            case C0644l9.f7764H /* 27 */:
                            case 28:
                            case C0644l9.f7765I /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case C0644l9.f7766J /* 35 */:
                            case 36:
                            case 37:
                            case C0644l9.f7767K /* 38 */:
                            case 39:
                            case C0644l9.L /* 40 */:
                            case 41:
                            case C0644l9.f7768M /* 42 */:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f2182k.getClass();
                                AbstractC0127b abstractC0127b = (AbstractC0127b) ((InterfaceC0148x) j0.f2253c.h(j3, obj));
                                if (abstractC0127b.f2215a) {
                                    abstractC0127b.f2215a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = f2172o;
                                Object object = unsafe.getObject(obj, j3);
                                if (object != null) {
                                    this.f2184m.getClass();
                                    ((I) object).f2167a = false;
                                    unsafe.putObject(obj, j3, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (p(iArr[i3], i3, obj)) {
                        l(i3).d(f2172o.getObject(obj, j3));
                    }
                }
                if (m(i3, obj)) {
                    l(i3).d(f2172o.getObject(obj, j3));
                }
            }
            this.f2183l.getClass();
            d0 d0Var = ((AbstractC0147w) obj).unknownFields;
            if (d0Var.f2227e) {
                d0Var.f2227e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean e(Object obj) {
        int i3;
        int i4;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f2179h) {
            int i9 = this.f2178g[i8];
            int[] iArr = this.f2173a;
            int i10 = iArr[i9];
            int L = L(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f2172o.getInt(obj, i12);
                }
                i4 = i9;
                i5 = i7;
                i3 = i12;
            } else {
                int i14 = i7;
                i3 = i6;
                i4 = i9;
                i5 = i14;
            }
            if ((268435456 & L) == 0 || n(obj, i4, i3, i5, i13)) {
                int K2 = K(L);
                if (K2 == 9 || K2 == 17) {
                    if (n(obj, i4, i3, i5, i13)) {
                        if (!l(i4).e(j0.f2253c.h(L & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i8++;
                    i6 = i3;
                    i7 = i5;
                } else {
                    if (K2 != 27) {
                        if (K2 == 60 || K2 == 68) {
                            if (p(i10, i4, obj)) {
                                if (!l(i4).e(j0.f2253c.h(L & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i8++;
                            i6 = i3;
                            i7 = i5;
                        } else if (K2 != 49) {
                            if (K2 != 50) {
                                continue;
                            } else {
                                Object h3 = j0.f2253c.h(L & 1048575, obj);
                                this.f2184m.getClass();
                                I i15 = (I) h3;
                                if (i15.isEmpty()) {
                                    continue;
                                } else {
                                    if (((H) this.f2174b[(i4 / 3) * 2]).f2165a.f2163b.f2280a != s0.MESSAGE) {
                                        continue;
                                    } else {
                                        W w3 = null;
                                        for (Object obj2 : i15.values()) {
                                            if (w3 == null) {
                                                w3 = T.f2190c.a(obj2.getClass());
                                            }
                                            if (!w3.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i8++;
                            i6 = i3;
                            i7 = i5;
                        }
                    }
                    List list = (List) j0.f2253c.h(L & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        W l3 = l(i4);
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            if (l3.e(list.get(i16))) {
                            }
                        }
                    }
                    i8++;
                    i6 = i3;
                    i7 = i5;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.X.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.X.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(AbstractC0147w abstractC0147w, AbstractC0147w abstractC0147w2) {
        int[] iArr = this.f2173a;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < length) {
                int L = L(i3);
                long j3 = L & 1048575;
                switch (K(L)) {
                    case 0:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 1:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var2 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 2:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var3 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 3:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var4 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 4:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var5 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 5:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var6 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 6:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var7 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 7:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var8 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 8:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var9 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 9:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var10 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 10:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var11 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 11:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var12 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 12:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var13 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 13:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var14 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 14:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var15 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 15:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var16 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 16:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var17 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 17:
                        if (i(abstractC0147w, abstractC0147w2, i3)) {
                            i0 i0Var18 = j0.f2253c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 18:
                    case C0644l9.f7759C /* 19 */:
                    case C0644l9.f7760D /* 20 */:
                    case C0644l9.f7761E /* 21 */:
                    case 22:
                    case 23:
                    case 24:
                    case C0644l9.f7762F /* 25 */:
                    case C0644l9.f7763G /* 26 */:
                    case C0644l9.f7764H /* 27 */:
                    case 28:
                    case C0644l9.f7765I /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case C0644l9.f7766J /* 35 */:
                    case 36:
                    case 37:
                    case C0644l9.f7767K /* 38 */:
                    case 39:
                    case C0644l9.L /* 40 */:
                    case 41:
                    case C0644l9.f7768M /* 42 */:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i0 i0Var19 = j0.f2253c;
                        z3 = X.l(i0Var19.h(j3, abstractC0147w), i0Var19.h(j3, abstractC0147w2));
                        break;
                    case 50:
                        i0 i0Var20 = j0.f2253c;
                        z3 = X.l(i0Var20.h(j3, abstractC0147w), i0Var20.h(j3, abstractC0147w2));
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
                    case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j4 = iArr[i3 + 2] & 1048575;
                        i0 i0Var21 = j0.f2253c;
                        if (i0Var21.f(j4, abstractC0147w) == i0Var21.f(j4, abstractC0147w2)) {
                            break;
                        }
                        z3 = false;
                        break;
                }
                if (z3) {
                    i3 += 3;
                }
            } else {
                this.f2183l.getClass();
                if (abstractC0147w.unknownFields.equals(abstractC0147w2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void g(Object obj, C0136k c0136k, C0140o c0140o) {
        c0140o.getClass();
        if (o(obj)) {
            q(this.f2183l, obj, c0136k, c0140o);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.W
    public final int h(AbstractC0147w abstractC0147w) {
        int i3;
        int i4;
        int q02;
        int q03;
        int q04;
        int s02;
        int q05;
        int s03;
        int q06;
        int q07;
        int o02;
        int q08;
        int size;
        int i5;
        int q09;
        int q010;
        int size2;
        int q011;
        int r02;
        int i6;
        int q012;
        int q013;
        int q014;
        int s04;
        int q015;
        int s05;
        int q016;
        int r03;
        N n3 = this;
        AbstractC0147w abstractC0147w2 = abstractC0147w;
        int i7 = 1;
        Unsafe unsafe = f2172o;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = n3.f2173a;
            if (i8 >= iArr.length) {
                n3.f2183l.getClass();
                return abstractC0147w2.unknownFields.b() + i10;
            }
            int L = n3.L(i8);
            int K2 = K(L);
            int i12 = iArr[i8];
            int i13 = iArr[i8 + 2];
            int i14 = i13 & 1048575;
            if (K2 <= 17) {
                if (i14 != i11) {
                    i9 = i14 == 1048575 ? 0 : unsafe.getInt(abstractC0147w2, i14);
                    i11 = i14;
                }
                i3 = i7 << (i13 >>> 20);
            } else {
                i3 = 0;
            }
            long j3 = L & 1048575;
            if (K2 >= EnumC0143s.f2282b.f2286a) {
                int i15 = EnumC0143s.f2283c.f2286a;
            }
            switch (K2) {
                case 0:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        q02 = C0138m.q0(i12) + 8;
                        i10 += q02;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        q03 = C0138m.q0(i12);
                        q07 = q03 + 4;
                        i10 += q07;
                    }
                    n3 = this;
                    abstractC0147w2 = abstractC0147w;
                    break;
                case 2:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        long j4 = unsafe.getLong(abstractC0147w2, j3);
                        q04 = C0138m.q0(i12);
                        s02 = C0138m.s0(j4);
                        i10 += s02 + q04;
                    }
                    n3 = this;
                    break;
                case 3:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        long j5 = unsafe.getLong(abstractC0147w2, j3);
                        q04 = C0138m.q0(i12);
                        s02 = C0138m.s0(j5);
                        i10 += s02 + q04;
                    }
                    n3 = this;
                    break;
                case 4:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        int i16 = unsafe.getInt(abstractC0147w2, j3);
                        q05 = C0138m.q0(i12);
                        s03 = C0138m.s0(i16);
                        o02 = s03 + q05;
                        i10 += o02;
                    }
                    n3 = this;
                    break;
                case 5:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        q06 = C0138m.q0(i12);
                        q07 = q06 + 8;
                        i10 += q07;
                    }
                    n3 = this;
                    abstractC0147w2 = abstractC0147w;
                    break;
                case 6:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        q03 = C0138m.q0(i12);
                        q07 = q03 + 4;
                        i10 += q07;
                    }
                    n3 = this;
                    abstractC0147w2 = abstractC0147w;
                    break;
                case 7:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        q07 = C0138m.q0(i12) + 1;
                        i10 += q07;
                    }
                    n3 = this;
                    abstractC0147w2 = abstractC0147w;
                    break;
                case 8:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        Object object = unsafe.getObject(abstractC0147w2, j3);
                        i10 = (object instanceof C0132g ? C0138m.o0(i12, (C0132g) object) : C0138m.p0((String) object) + C0138m.q0(i12)) + i10;
                    }
                    n3 = this;
                    break;
                case 9:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        Object object2 = unsafe.getObject(abstractC0147w2, j3);
                        W l3 = n3.l(i8);
                        Class cls = X.f2200a;
                        int q017 = C0138m.q0(i12);
                        int a3 = ((AbstractC0126a) object2).a(l3);
                        i10 += C0138m.r0(a3) + a3 + q017;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        o02 = C0138m.o0(i12, (C0132g) unsafe.getObject(abstractC0147w2, j3));
                        i10 += o02;
                    }
                    n3 = this;
                    break;
                case 11:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        int i17 = unsafe.getInt(abstractC0147w2, j3);
                        q05 = C0138m.q0(i12);
                        s03 = C0138m.r0(i17);
                        o02 = s03 + q05;
                        i10 += o02;
                    }
                    n3 = this;
                    break;
                case 12:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        int i18 = unsafe.getInt(abstractC0147w2, j3);
                        q05 = C0138m.q0(i12);
                        s03 = C0138m.s0(i18);
                        o02 = s03 + q05;
                        i10 += o02;
                    }
                    n3 = this;
                    break;
                case 13:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        q03 = C0138m.q0(i12);
                        q07 = q03 + 4;
                        i10 += q07;
                    }
                    n3 = this;
                    abstractC0147w2 = abstractC0147w;
                    break;
                case 14:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        q06 = C0138m.q0(i12);
                        q07 = q06 + 8;
                        i10 += q07;
                    }
                    n3 = this;
                    abstractC0147w2 = abstractC0147w;
                    break;
                case 15:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        int i19 = unsafe.getInt(abstractC0147w2, j3);
                        q05 = C0138m.q0(i12);
                        s03 = C0138m.r0((i19 >> 31) ^ (i19 << 1));
                        o02 = s03 + q05;
                        i10 += o02;
                    }
                    n3 = this;
                    break;
                case 16:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        long j6 = unsafe.getLong(abstractC0147w2, j3);
                        q04 = C0138m.q0(i12);
                        s02 = C0138m.s0((j6 >> 63) ^ (j6 << i4));
                        i10 += s02 + q04;
                    }
                    n3 = this;
                    break;
                case 17:
                    i4 = i7;
                    if (n3.n(abstractC0147w2, i8, i11, i9, i3)) {
                        q02 = ((AbstractC0126a) unsafe.getObject(abstractC0147w2, j3)).a(n3.l(i8)) + (C0138m.q0(i12) * 2);
                        i10 += q02;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i4 = i7;
                    q02 = X.c(i12, (List) unsafe.getObject(abstractC0147w2, j3));
                    i10 += q02;
                    break;
                case C0644l9.f7759C /* 19 */:
                    i4 = i7;
                    q02 = X.b(i12, (List) unsafe.getObject(abstractC0147w2, j3));
                    i10 += q02;
                    break;
                case C0644l9.f7760D /* 20 */:
                    i4 = i7;
                    List list = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls2 = X.f2200a;
                    if (list.size() != 0) {
                        q08 = (C0138m.q0(i12) * list.size()) + X.e(list);
                        i10 += q08;
                        break;
                    }
                    q08 = 0;
                    i10 += q08;
                case C0644l9.f7761E /* 21 */:
                    i4 = i7;
                    List list2 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls3 = X.f2200a;
                    size = list2.size();
                    if (size != 0) {
                        i5 = X.i(list2);
                        q09 = C0138m.q0(i12);
                        q08 = (q09 * size) + i5;
                        i10 += q08;
                        break;
                    }
                    q08 = 0;
                    i10 += q08;
                case 22:
                    i4 = i7;
                    List list3 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls4 = X.f2200a;
                    size = list3.size();
                    if (size != 0) {
                        i5 = X.d(list3);
                        q09 = C0138m.q0(i12);
                        q08 = (q09 * size) + i5;
                        i10 += q08;
                        break;
                    }
                    q08 = 0;
                    i10 += q08;
                case 23:
                    i4 = i7;
                    q02 = X.c(i12, (List) unsafe.getObject(abstractC0147w2, j3));
                    i10 += q02;
                    break;
                case 24:
                    i4 = i7;
                    q02 = X.b(i12, (List) unsafe.getObject(abstractC0147w2, j3));
                    i10 += q02;
                    break;
                case C0644l9.f7762F /* 25 */:
                    i4 = i7;
                    List list4 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls5 = X.f2200a;
                    int size3 = list4.size();
                    i10 += size3 == 0 ? 0 : (C0138m.q0(i12) + 1) * size3;
                    break;
                case C0644l9.f7763G /* 26 */:
                    i4 = i7;
                    List list5 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls6 = X.f2200a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        q08 = C0138m.q0(i12) * size4;
                        for (int i20 = 0; i20 < size4; i20++) {
                            Object obj = list5.get(i20);
                            if (obj instanceof C0132g) {
                                int size5 = ((C0132g) obj).size();
                                q08 = C0138m.r0(size5) + size5 + q08;
                            } else {
                                q08 = C0138m.p0((String) obj) + q08;
                            }
                        }
                        i10 += q08;
                        break;
                    }
                    q08 = 0;
                    i10 += q08;
                case C0644l9.f7764H /* 27 */:
                    i4 = i7;
                    List list6 = (List) unsafe.getObject(abstractC0147w2, j3);
                    W l4 = n3.l(i8);
                    Class cls7 = X.f2200a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        q010 = 0;
                    } else {
                        q010 = C0138m.q0(i12) * size6;
                        for (int i21 = 0; i21 < size6; i21++) {
                            int a4 = ((AbstractC0126a) list6.get(i21)).a(l4);
                            q010 += C0138m.r0(a4) + a4;
                        }
                    }
                    i10 += q010;
                    break;
                case 28:
                    i4 = i7;
                    List list7 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls8 = X.f2200a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        q08 = C0138m.q0(i12) * size7;
                        for (int i22 = 0; i22 < list7.size(); i22++) {
                            int size8 = ((C0132g) list7.get(i22)).size();
                            q08 += C0138m.r0(size8) + size8;
                        }
                        i10 += q08;
                        break;
                    }
                    q08 = 0;
                    i10 += q08;
                case C0644l9.f7765I /* 29 */:
                    i4 = i7;
                    List list8 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls9 = X.f2200a;
                    size = list8.size();
                    if (size != 0) {
                        i5 = X.h(list8);
                        q09 = C0138m.q0(i12);
                        q08 = (q09 * size) + i5;
                        i10 += q08;
                        break;
                    }
                    q08 = 0;
                    i10 += q08;
                case 30:
                    i4 = i7;
                    List list9 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls10 = X.f2200a;
                    size = list9.size();
                    if (size != 0) {
                        i5 = X.a(list9);
                        q09 = C0138m.q0(i12);
                        q08 = (q09 * size) + i5;
                        i10 += q08;
                        break;
                    }
                    q08 = 0;
                    i10 += q08;
                case 31:
                    i4 = i7;
                    q02 = X.b(i12, (List) unsafe.getObject(abstractC0147w2, j3));
                    i10 += q02;
                    break;
                case 32:
                    i4 = i7;
                    q02 = X.c(i12, (List) unsafe.getObject(abstractC0147w2, j3));
                    i10 += q02;
                    break;
                case 33:
                    i4 = i7;
                    List list10 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls11 = X.f2200a;
                    size = list10.size();
                    if (size != 0) {
                        i5 = X.f(list10);
                        q09 = C0138m.q0(i12);
                        q08 = (q09 * size) + i5;
                        i10 += q08;
                        break;
                    }
                    q08 = 0;
                    i10 += q08;
                case 34:
                    i4 = i7;
                    List list11 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls12 = X.f2200a;
                    size = list11.size();
                    if (size != 0) {
                        i5 = X.g(list11);
                        q09 = C0138m.q0(i12);
                        q08 = (q09 * size) + i5;
                        i10 += q08;
                        break;
                    }
                    q08 = 0;
                    i10 += q08;
                case C0644l9.f7766J /* 35 */:
                    i4 = i7;
                    List list12 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls13 = X.f2200a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    i4 = i7;
                    List list13 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls14 = X.f2200a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    i4 = i7;
                    size2 = X.e((List) unsafe.getObject(abstractC0147w2, j3));
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case C0644l9.f7767K /* 38 */:
                    i4 = i7;
                    size2 = X.i((List) unsafe.getObject(abstractC0147w2, j3));
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    i4 = i7;
                    size2 = X.d((List) unsafe.getObject(abstractC0147w2, j3));
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case C0644l9.L /* 40 */:
                    i4 = i7;
                    List list14 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls15 = X.f2200a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i4 = i7;
                    List list15 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls16 = X.f2200a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case C0644l9.f7768M /* 42 */:
                    i4 = i7;
                    List list16 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls17 = X.f2200a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i4 = i7;
                    size2 = X.h((List) unsafe.getObject(abstractC0147w2, j3));
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    i4 = i7;
                    size2 = X.a((List) unsafe.getObject(abstractC0147w2, j3));
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    i4 = i7;
                    List list17 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls18 = X.f2200a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i4 = i7;
                    List list18 = (List) unsafe.getObject(abstractC0147w2, j3);
                    Class cls19 = X.f2200a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i4 = i7;
                    size2 = X.f((List) unsafe.getObject(abstractC0147w2, j3));
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    i4 = i7;
                    size2 = X.g((List) unsafe.getObject(abstractC0147w2, j3));
                    if (size2 > 0) {
                        q011 = C0138m.q0(i12);
                        r02 = C0138m.r0(size2);
                        i10 += r02 + q011 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    i4 = i7;
                    List list19 = (List) unsafe.getObject(abstractC0147w2, j3);
                    W l5 = n3.l(i8);
                    Class cls20 = X.f2200a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i23 = 0; i23 < size9; i23++) {
                            i6 += ((AbstractC0126a) list19.get(i23)).a(l5) + (C0138m.q0(i12) * 2);
                        }
                    }
                    i10 += i6;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0147w2, j3);
                    Object obj2 = n3.f2174b[(i8 / 3) * 2];
                    n3.f2184m.getClass();
                    I i24 = (I) object3;
                    H h3 = (H) obj2;
                    if (i24.isEmpty()) {
                        q010 = 0;
                    } else {
                        q010 = 0;
                        for (Map.Entry entry : i24.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            h3.getClass();
                            int q018 = C0138m.q0(i12);
                            int i25 = i7;
                            int a5 = H.a(h3.f2165a, key, value);
                            q010 += C0138m.r0(a5) + a5 + q018;
                            i7 = i25;
                        }
                    }
                    i4 = i7;
                    i10 += q010;
                    break;
                case 51:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        q012 = C0138m.q0(i12);
                        q016 = q012 + 8;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 52:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        q013 = C0138m.q0(i12);
                        q016 = q013 + 4;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 53:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        long z3 = z(j3, abstractC0147w2);
                        q014 = C0138m.q0(i12);
                        s04 = C0138m.s0(z3);
                        r03 = s04 + q014;
                        i10 += r03;
                    }
                    i4 = i7;
                    break;
                case 54:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        long z4 = z(j3, abstractC0147w2);
                        q014 = C0138m.q0(i12);
                        s04 = C0138m.s0(z4);
                        r03 = s04 + q014;
                        i10 += r03;
                    }
                    i4 = i7;
                    break;
                case 55:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        int y = y(j3, abstractC0147w2);
                        q015 = C0138m.q0(i12);
                        s05 = C0138m.s0(y);
                        q016 = s05 + q015;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 56:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        q012 = C0138m.q0(i12);
                        q016 = q012 + 8;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 57:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        q013 = C0138m.q0(i12);
                        q016 = q013 + 4;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 58:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        q016 = C0138m.q0(i12) + i7;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 59:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        Object object4 = unsafe.getObject(abstractC0147w2, j3);
                        i10 = (object4 instanceof C0132g ? C0138m.o0(i12, (C0132g) object4) : C0138m.p0((String) object4) + C0138m.q0(i12)) + i10;
                    }
                    i4 = i7;
                    break;
                case 60:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        Object object5 = unsafe.getObject(abstractC0147w2, j3);
                        W l6 = n3.l(i8);
                        Class cls21 = X.f2200a;
                        int q019 = C0138m.q0(i12);
                        int a6 = ((AbstractC0126a) object5).a(l6);
                        r03 = C0138m.r0(a6) + a6 + q019;
                        i10 += r03;
                    }
                    i4 = i7;
                    break;
                case 61:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        q016 = C0138m.o0(i12, (C0132g) unsafe.getObject(abstractC0147w2, j3));
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 62:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        int y3 = y(j3, abstractC0147w2);
                        q015 = C0138m.q0(i12);
                        s05 = C0138m.r0(y3);
                        q016 = s05 + q015;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 63:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        int y4 = y(j3, abstractC0147w2);
                        q015 = C0138m.q0(i12);
                        s05 = C0138m.s0(y4);
                        q016 = s05 + q015;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        q013 = C0138m.q0(i12);
                        q016 = q013 + 4;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 65:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        q012 = C0138m.q0(i12);
                        q016 = q012 + 8;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 66:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        int y5 = y(j3, abstractC0147w2);
                        q015 = C0138m.q0(i12);
                        s05 = C0138m.r0((y5 >> 31) ^ (y5 << 1));
                        q016 = s05 + q015;
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                case 67:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        long z5 = z(j3, abstractC0147w2);
                        q014 = C0138m.q0(i12);
                        s04 = C0138m.s0((z5 << i7) ^ (z5 >> 63));
                        r03 = s04 + q014;
                        i10 += r03;
                    }
                    i4 = i7;
                    break;
                case 68:
                    if (n3.p(i12, i8, abstractC0147w2)) {
                        q016 = ((AbstractC0126a) unsafe.getObject(abstractC0147w2, j3)).a(n3.l(i8)) + (C0138m.q0(i12) * 2);
                        i10 += q016;
                    }
                    i4 = i7;
                    break;
                default:
                    i4 = i7;
                    break;
            }
            i8 += 3;
            i7 = i4;
        }
    }

    public final boolean i(AbstractC0147w abstractC0147w, AbstractC0147w abstractC0147w2, int i3) {
        return m(i3, abstractC0147w) == m(i3, abstractC0147w2);
    }

    public final void j(Object obj, int i3, Object obj2) {
        int i4 = this.f2173a[i3];
        if (j0.f2253c.h(L(i3) & 1048575, obj) == null) {
            return;
        }
        k(i3);
    }

    public final void k(int i3) {
        if (this.f2174b[((i3 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final W l(int i3) {
        int i4 = (i3 / 3) * 2;
        Object[] objArr = this.f2174b;
        W w3 = (W) objArr[i4];
        if (w3 != null) {
            return w3;
        }
        W a3 = T.f2190c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a3;
        return a3;
    }

    public final boolean m(int i3, Object obj) {
        int i4 = this.f2173a[i3 + 2];
        long j3 = i4 & 1048575;
        if (j3 == 1048575) {
            int L = L(i3);
            long j4 = L & 1048575;
            switch (K(L)) {
                case 0:
                    if (Double.doubleToRawLongBits(j0.f2253c.d(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(j0.f2253c.e(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (j0.f2253c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (j0.f2253c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (j0.f2253c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (j0.f2253c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (j0.f2253c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return j0.f2253c.c(j4, obj);
                case 8:
                    Object h3 = j0.f2253c.h(j4, obj);
                    if (h3 instanceof String) {
                        return !((String) h3).isEmpty();
                    }
                    if (h3 instanceof C0132g) {
                        return !C0132g.f2230c.equals(h3);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (j0.f2253c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0132g.f2230c.equals(j0.f2253c.h(j4, obj));
                case 11:
                    if (j0.f2253c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (j0.f2253c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (j0.f2253c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (j0.f2253c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (j0.f2253c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (j0.f2253c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (j0.f2253c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i4 >>> 20)) & j0.f2253c.f(j3, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean n(Object obj, int i3, int i4, int i5, int i6) {
        return i4 == 1048575 ? m(i3, obj) : (i5 & i6) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0147w newInstance() {
        this.f2181j.getClass();
        return this.f2177e.i();
    }

    public final boolean p(int i3, int i4, Object obj) {
        return j0.f2253c.f((long) (this.f2173a[i4 + 2] & 1048575), obj) == i3;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void q(androidx.datastore.preferences.protobuf.e0 r19, java.lang.Object r20, androidx.datastore.preferences.protobuf.C0136k r21, androidx.datastore.preferences.protobuf.C0140o r22) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.q(androidx.datastore.preferences.protobuf.e0, java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.o):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i3, Object obj2, C0140o c0140o, C0136k c0136k) {
        long L = L(i3) & 1048575;
        Object h3 = j0.f2253c.h(L, obj);
        J j3 = this.f2184m;
        if (h3 == null) {
            j3.getClass();
            h3 = I.f2166b.b();
            j0.o(L, obj, h3);
        } else {
            j3.getClass();
            if (!((I) h3).f2167a) {
                I b3 = I.f2166b.b();
                J.a(b3, h3);
                j0.o(L, obj, b3);
                h3 = b3;
            }
        }
        j3.getClass();
        I i4 = (I) h3;
        G g3 = ((H) obj2).f2165a;
        c0136k.w(2);
        AbstractC0135j abstractC0135j = c0136k.f2257a;
        int e3 = abstractC0135j.e(abstractC0135j.v());
        Object obj3 = "";
        M.k kVar = g3.f2164c;
        Object obj4 = kVar;
        while (true) {
            try {
                int a3 = c0136k.a();
                if (a3 == Integer.MAX_VALUE || abstractC0135j.c()) {
                    break;
                }
                if (a3 == 1) {
                    obj3 = c0136k.i(g3.f2162a, null, null);
                } else if (a3 != 2) {
                    try {
                        if (!c0136k.x()) {
                            throw new A("Unable to parse map entry.");
                        }
                    } catch (C0150z unused) {
                        if (!c0136k.x()) {
                            throw new A("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj4 = c0136k.i(g3.f2163b, kVar.getClass(), c0140o);
                }
            } catch (Throwable th) {
                abstractC0135j.d(e3);
                throw th;
            }
        }
    }

    public final void s(Object obj, int i3, Object obj2) {
        if (m(i3, obj2)) {
            long L = L(i3) & 1048575;
            Unsafe unsafe = f2172o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f2173a[i3] + " is present but null: " + obj2);
            }
            W l3 = l(i3);
            if (!m(i3, obj)) {
                if (o(object)) {
                    AbstractC0147w newInstance = l3.newInstance();
                    l3.a(newInstance, object);
                    unsafe.putObject(obj, L, newInstance);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                G(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!o(object2)) {
                AbstractC0147w newInstance2 = l3.newInstance();
                l3.a(newInstance2, object2);
                unsafe.putObject(obj, L, newInstance2);
                object2 = newInstance2;
            }
            l3.a(object2, object);
        }
    }

    public final void t(Object obj, int i3, Object obj2) {
        int[] iArr = this.f2173a;
        int i4 = iArr[i3];
        if (p(i4, i3, obj2)) {
            long L = L(i3) & 1048575;
            Unsafe unsafe = f2172o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2);
            }
            W l3 = l(i3);
            if (!p(i4, i3, obj)) {
                if (o(object)) {
                    AbstractC0147w newInstance = l3.newInstance();
                    l3.a(newInstance, object);
                    unsafe.putObject(obj, L, newInstance);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                H(i4, i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!o(object2)) {
                AbstractC0147w newInstance2 = l3.newInstance();
                l3.a(newInstance2, object2);
                unsafe.putObject(obj, L, newInstance2);
                object2 = newInstance2;
            }
            l3.a(object2, object);
        }
    }

    public final Object u(int i3, Object obj) {
        W l3 = l(i3);
        long L = L(i3) & 1048575;
        if (!m(i3, obj)) {
            return l3.newInstance();
        }
        Object object = f2172o.getObject(obj, L);
        if (o(object)) {
            return object;
        }
        AbstractC0147w newInstance = l3.newInstance();
        if (object != null) {
            l3.a(newInstance, object);
        }
        return newInstance;
    }

    public final Object v(int i3, int i4, Object obj) {
        W l3 = l(i4);
        if (!p(i3, i4, obj)) {
            return l3.newInstance();
        }
        Object object = f2172o.getObject(obj, L(i4) & 1048575);
        if (o(object)) {
            return object;
        }
        AbstractC0147w newInstance = l3.newInstance();
        if (object != null) {
            l3.a(newInstance, object);
        }
        return newInstance;
    }
}
