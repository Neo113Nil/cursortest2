package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class N implements androidx.datastore.preferences.protobuf.W {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2239n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final sun.misc.Unsafe f2240o = androidx.datastore.preferences.protobuf.j0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2241a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f2242b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2243c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2244d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.AbstractC0065a f2245e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2246f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2247g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2248h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2249i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.P f2250j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.C f2251k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.e0 f2252l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.J f2253m;

    public N(int[] iArr, java.lang.Object[] objArr, int i2, int i3, androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a, int[] iArr2, int i4, int i5, androidx.datastore.preferences.protobuf.P p2, androidx.datastore.preferences.protobuf.C c2, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C0080p c0080p, androidx.datastore.preferences.protobuf.J j2) {
        this.f2241a = iArr;
        this.f2242b = objArr;
        this.f2243c = i2;
        this.f2244d = i3;
        this.f2246f = abstractC0065a instanceof androidx.datastore.preferences.protobuf.AbstractC0086w;
        this.f2247g = iArr2;
        this.f2248h = i4;
        this.f2249i = i5;
        this.f2250j = p2;
        this.f2251k = c2;
        this.f2252l = e0Var;
        this.f2245e = abstractC0065a;
        this.f2253m = j2;
    }

    public static long A(long j2, java.lang.Object obj) {
        return ((java.lang.Long) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj)).longValue();
    }

    public static java.lang.reflect.Field G(java.lang.String str, java.lang.Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new java.lang.RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + java.util.Arrays.toString(declaredFields));
        }
    }

    public static int L(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static boolean p(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC0086w) {
            return ((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.datastore.preferences.protobuf.N x(androidx.datastore.preferences.protobuf.V v2, androidx.datastore.preferences.protobuf.P p2, androidx.datastore.preferences.protobuf.C c2, androidx.datastore.preferences.protobuf.e0 e0Var, androidx.datastore.preferences.protobuf.C0080p c0080p, androidx.datastore.preferences.protobuf.J j2) {
        int i2;
        int charAt;
        int charAt2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt3;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        char charAt9;
        int i15;
        char charAt10;
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
        java.lang.reflect.Field G;
        int i28;
        char charAt11;
        int i29;
        int i30;
        java.lang.Object obj;
        java.lang.reflect.Field G2;
        java.lang.Object obj2;
        java.lang.reflect.Field G3;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        int i34;
        char charAt15;
        java.lang.String c3 = v2.c();
        int length = c3.length();
        char c4 = 55296;
        if (c3.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i2 = i35 + 1;
                if (c3.charAt(i35) < 55296) {
                    break;
                }
                i35 = i2;
            }
        } else {
            i2 = 1;
        }
        int i36 = i2 + 1;
        int charAt16 = c3.charAt(i2);
        if (charAt16 >= 55296) {
            int i37 = charAt16 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                charAt15 = c3.charAt(i36);
                if (charAt15 < 55296) {
                    break;
                }
                i37 |= (charAt15 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            charAt16 = i37 | (charAt15 << i38);
            i36 = i34;
        }
        if (charAt16 == 0) {
            i5 = 0;
            charAt = 0;
            charAt2 = 0;
            i4 = 0;
            i7 = 0;
            i6 = 0;
            iArr = f2239n;
            i3 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt17 = c3.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i15 = i39 + 1;
                    charAt10 = c3.charAt(i39);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i40 |= (charAt10 & 8191) << i41;
                    i41 += 13;
                    i39 = i15;
                }
                charAt17 = i40 | (charAt10 << i41);
                i39 = i15;
            }
            int i42 = i39 + 1;
            int charAt18 = c3.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i14 = i42 + 1;
                    charAt9 = c3.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i14;
                }
                charAt18 = i43 | (charAt9 << i44);
                i42 = i14;
            }
            int i45 = i42 + 1;
            int charAt19 = c3.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i13 = i45 + 1;
                    charAt8 = c3.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i13;
                }
                charAt19 = i46 | (charAt8 << i47);
                i45 = i13;
            }
            int i48 = i45 + 1;
            int charAt20 = c3.charAt(i45);
            if (charAt20 >= 55296) {
                int i49 = charAt20 & 8191;
                int i50 = 13;
                while (true) {
                    i12 = i48 + 1;
                    charAt7 = c3.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i12;
                }
                charAt20 = i49 | (charAt7 << i50);
                i48 = i12;
            }
            int i51 = i48 + 1;
            charAt = c3.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i11 = i51 + 1;
                    charAt6 = c3.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i11;
                }
                charAt = i52 | (charAt6 << i53);
                i51 = i11;
            }
            int i54 = i51 + 1;
            charAt2 = c3.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i10 = i54 + 1;
                    charAt5 = c3.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i10;
                }
                charAt2 = i55 | (charAt5 << i56);
                i54 = i10;
            }
            int i57 = i54 + 1;
            int charAt21 = c3.charAt(i54);
            if (charAt21 >= 55296) {
                int i58 = charAt21 & 8191;
                int i59 = 13;
                while (true) {
                    i9 = i57 + 1;
                    charAt4 = c3.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i9;
                }
                charAt21 = i58 | (charAt4 << i59);
                i57 = i9;
            }
            int i60 = i57 + 1;
            int charAt22 = c3.charAt(i57);
            if (charAt22 >= 55296) {
                int i61 = charAt22 & 8191;
                int i62 = 13;
                while (true) {
                    i8 = i60 + 1;
                    charAt3 = c3.charAt(i60);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i61 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i8;
                }
                charAt22 = i61 | (charAt3 << i62);
                i60 = i8;
            }
            int i63 = (charAt17 * 2) + charAt18;
            i3 = charAt17;
            i36 = i60;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i4 = charAt19;
            i5 = i63;
            i6 = charAt22;
            i7 = charAt20;
        }
        sun.misc.Unsafe unsafe = f2240o;
        java.lang.Object[] b2 = v2.b();
        java.lang.Class<?> cls = v2.a().getClass();
        int[] iArr2 = new int[charAt * 3];
        java.lang.Object[] objArr = new java.lang.Object[charAt * 2];
        int i64 = i6 + charAt2;
        int i65 = i6;
        int i66 = i64;
        int i67 = 0;
        int i68 = 0;
        while (i36 < length) {
            int i69 = i36 + 1;
            int charAt23 = c3.charAt(i36);
            if (charAt23 >= c4) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i33 = i71 + 1;
                    charAt14 = c3.charAt(i71);
                    if (charAt14 < c4) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i33;
                }
                charAt23 = i70 | (charAt14 << i72);
                i16 = i33;
            } else {
                i16 = i69;
            }
            int i73 = i16 + 1;
            int charAt24 = c3.charAt(i16);
            if (charAt24 >= c4) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i32 = i75 + 1;
                    charAt13 = c3.charAt(i75);
                    i17 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i74 |= (charAt13 & 8191) << i76;
                    i76 += 13;
                    i75 = i32;
                    length = i17;
                }
                charAt24 = i74 | (charAt13 << i76);
                i18 = i32;
            } else {
                i17 = length;
                i18 = i73;
            }
            int i77 = charAt24 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
            int i78 = i6;
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            if (i77 >= 51) {
                int i79 = i18 + 1;
                int charAt25 = c3.charAt(i18);
                i19 = i67;
                char c5 = 55296;
                if (charAt25 >= 55296) {
                    int i80 = charAt25 & 8191;
                    int i81 = 13;
                    while (true) {
                        i31 = i79 + 1;
                        charAt12 = c3.charAt(i79);
                        if (charAt12 < c5) {
                            break;
                        }
                        i80 |= (charAt12 & 8191) << i81;
                        i81 += 13;
                        i79 = i31;
                        c5 = 55296;
                    }
                    charAt25 = i80 | (charAt12 << i81);
                    i79 = i31;
                }
                int i82 = i77 - 51;
                int i83 = i79;
                if (i82 == 9 || i82 == 17) {
                    i30 = i5 + 1;
                    objArr[((i68 / 3) * 2) + 1] = b2[i5];
                } else {
                    if (i82 == 12 && (H.j.a(v2.d(), 1) || (charAt24 & 2048) != 0)) {
                        i30 = i5 + 1;
                        objArr[((i68 / 3) * 2) + 1] = b2[i5];
                    }
                    int i84 = charAt25 * 2;
                    obj = b2[i84];
                    if (obj instanceof java.lang.reflect.Field) {
                        G2 = G((java.lang.String) obj, cls);
                        b2[i84] = G2;
                    } else {
                        G2 = (java.lang.reflect.Field) obj;
                    }
                    int i85 = i4;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(G2);
                    int i86 = i84 + 1;
                    obj2 = b2[i86];
                    int i87 = i5;
                    if (obj2 instanceof java.lang.reflect.Field) {
                        G3 = G((java.lang.String) obj2, cls);
                        b2[i86] = G3;
                    } else {
                        G3 = (java.lang.reflect.Field) obj2;
                    }
                    i27 = (int) unsafe.objectFieldOffset(G3);
                    i26 = objectFieldOffset;
                    i24 = i83;
                    i25 = 0;
                    i20 = i7;
                    i21 = i85;
                    i22 = i87;
                }
                i5 = i30;
                int i842 = charAt25 * 2;
                obj = b2[i842];
                if (obj instanceof java.lang.reflect.Field) {
                }
                int i852 = i4;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(G2);
                int i862 = i842 + 1;
                obj2 = b2[i862];
                int i872 = i5;
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                i27 = (int) unsafe.objectFieldOffset(G3);
                i26 = objectFieldOffset2;
                i24 = i83;
                i25 = 0;
                i20 = i7;
                i21 = i852;
                i22 = i872;
            } else {
                i19 = i67;
                int i88 = i4;
                int i89 = i5 + 1;
                java.lang.reflect.Field G4 = G((java.lang.String) b2[i5], cls);
                i20 = i7;
                if (i77 == 9 || i77 == 17) {
                    i21 = i88;
                    objArr[((i68 / 3) * 2) + 1] = G4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        i21 = i88;
                        i29 = i5 + 2;
                        objArr[((i68 / 3) * 2) + 1] = b2[i89];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        i21 = i88;
                        if (v2.d() == 1 || (charAt24 & 2048) != 0) {
                            i29 = i5 + 2;
                            objArr[((i68 / 3) * 2) + 1] = b2[i89];
                        }
                    } else {
                        if (i77 == 50) {
                            int i90 = i65 + 1;
                            iArr[i65] = i68;
                            int i91 = (i68 / 3) * 2;
                            int i92 = i5 + 2;
                            objArr[i91] = b2[i89];
                            if ((charAt24 & 2048) != 0) {
                                i89 = i5 + 3;
                                objArr[i91 + 1] = b2[i92];
                                i65 = i90;
                            } else {
                                i65 = i90;
                                i89 = i92;
                            }
                        }
                        i21 = i88;
                    }
                    i89 = i29;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(G4);
                if ((charAt24 & io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE) == 0 || i77 > 17) {
                    i22 = i89;
                    i23 = 1048575;
                    i24 = i18;
                    i25 = 0;
                } else {
                    int i93 = i18 + 1;
                    int charAt26 = c3.charAt(i18);
                    if (charAt26 >= 55296) {
                        int i94 = charAt26 & 8191;
                        int i95 = 13;
                        while (true) {
                            i28 = i93 + 1;
                            charAt11 = c3.charAt(i93);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i94 |= (charAt11 & 8191) << i95;
                            i95 += 13;
                            i93 = i28;
                        }
                        charAt26 = i94 | (charAt11 << i95);
                        i93 = i28;
                    }
                    int i96 = (charAt26 / 32) + (i3 * 2);
                    java.lang.Object obj3 = b2[i96];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        G = (java.lang.reflect.Field) obj3;
                    } else {
                        G = G((java.lang.String) obj3, cls);
                        b2[i96] = G;
                    }
                    i22 = i89;
                    i24 = i93;
                    i23 = (int) unsafe.objectFieldOffset(G);
                    i25 = charAt26 % 32;
                }
                if (i77 >= 18 && i77 <= 49) {
                    iArr[i66] = objectFieldOffset3;
                    i66++;
                }
                int i97 = i23;
                i26 = objectFieldOffset3;
                i27 = i97;
            }
            int i98 = i68 + 1;
            iArr2[i68] = charAt23;
            int i99 = i68 + 2;
            java.lang.String str = c3;
            iArr2[i98] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | i26;
            i68 += 3;
            iArr2[i99] = (i25 << 20) | i27;
            i5 = i22;
            i6 = i78;
            i36 = i24;
            i67 = i19;
            length = i17;
            i4 = i21;
            c3 = str;
            i7 = i20;
            c4 = 55296;
        }
        return new androidx.datastore.preferences.protobuf.N(iArr2, objArr, i4, i7, v2.a(), iArr, i6, i64, p2, c2, e0Var, c0080p, j2);
    }

    public static long y(int i2) {
        return i2 & 1048575;
    }

    public static int z(long j2, java.lang.Object obj) {
        return ((java.lang.Integer) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj)).intValue();
    }

    public final int B(int i2) {
        if (i2 < this.f2243c || i2 > this.f2244d) {
            return -1;
        }
        int[] iArr = this.f2241a;
        int length = (iArr.length / 3) - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final void C(java.lang.Object obj, long j2, androidx.datastore.preferences.protobuf.C0075k c0075k, androidx.datastore.preferences.protobuf.W w2, androidx.datastore.preferences.protobuf.C0079o c0079o) {
        int u2;
        this.f2251k.getClass();
        androidx.datastore.preferences.protobuf.InterfaceC0087x b2 = androidx.datastore.preferences.protobuf.C.b(j2, obj);
        int i2 = c0075k.f2331b;
        if ((i2 & 7) != 3) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            androidx.datastore.preferences.protobuf.AbstractC0086w g2 = w2.g();
            c0075k.b(g2, w2, c0079o);
            w2.h(g2);
            ((androidx.datastore.preferences.protobuf.U) b2).add(g2);
            androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = c0075k.f2330a;
            if (abstractC0074j.c() || c0075k.f2333d != 0) {
                return;
            } else {
                u2 = abstractC0074j.u();
            }
        } while (u2 == i2);
        c0075k.f2333d = u2;
    }

    public final void D(java.lang.Object obj, int i2, androidx.datastore.preferences.protobuf.C0075k c0075k, androidx.datastore.preferences.protobuf.W w2, androidx.datastore.preferences.protobuf.C0079o c0079o) {
        int u2;
        this.f2251k.getClass();
        androidx.datastore.preferences.protobuf.InterfaceC0087x b2 = androidx.datastore.preferences.protobuf.C.b(i2 & 1048575, obj);
        int i3 = c0075k.f2331b;
        if ((i3 & 7) != 2) {
            throw androidx.datastore.preferences.protobuf.A.b();
        }
        do {
            androidx.datastore.preferences.protobuf.AbstractC0086w g2 = w2.g();
            c0075k.c(g2, w2, c0079o);
            w2.h(g2);
            ((androidx.datastore.preferences.protobuf.U) b2).add(g2);
            androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = c0075k.f2330a;
            if (abstractC0074j.c() || c0075k.f2333d != 0) {
                return;
            } else {
                u2 = abstractC0074j.u();
            }
        } while (u2 == i3);
        c0075k.f2333d = u2;
    }

    public final void E(int i2, androidx.datastore.preferences.protobuf.C0075k c0075k, java.lang.Object obj) {
        if ((536870912 & i2) != 0) {
            c0075k.w(2);
            androidx.datastore.preferences.protobuf.j0.o(obj, i2 & 1048575, c0075k.f2330a.t());
        } else if (!this.f2246f) {
            androidx.datastore.preferences.protobuf.j0.o(obj, i2 & 1048575, c0075k.e());
        } else {
            c0075k.w(2);
            androidx.datastore.preferences.protobuf.j0.o(obj, i2 & 1048575, c0075k.f2330a.s());
        }
    }

    public final void F(int i2, androidx.datastore.preferences.protobuf.C0075k c0075k, java.lang.Object obj) {
        boolean z2 = (536870912 & i2) != 0;
        androidx.datastore.preferences.protobuf.C c2 = this.f2251k;
        if (z2) {
            c2.getClass();
            c0075k.s(androidx.datastore.preferences.protobuf.C.b(i2 & 1048575, obj), true);
        } else {
            c2.getClass();
            c0075k.s(androidx.datastore.preferences.protobuf.C.b(i2 & 1048575, obj), false);
        }
    }

    public final void H(int i2, java.lang.Object obj) {
        int i3 = this.f2241a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        androidx.datastore.preferences.protobuf.j0.m(obj, j2, (1 << (i3 >>> 20)) | androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, obj));
    }

    public final void I(int i2, int i3, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.j0.m(obj, this.f2241a[i3 + 2] & 1048575, i2);
    }

    public final void J(java.lang.Object obj, int i2, androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a) {
        f2240o.putObject(obj, M(i2) & 1048575, abstractC0065a);
        H(i2, obj);
    }

    public final void K(java.lang.Object obj, int i2, int i3, androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a) {
        f2240o.putObject(obj, M(i3) & 1048575, abstractC0065a);
        I(i2, i3, obj);
    }

    public final int M(int i2) {
        return this.f2241a[i2 + 1];
    }

    public final void N(java.lang.Object obj, androidx.datastore.preferences.protobuf.F f2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f2241a;
        int length = iArr.length;
        sun.misc.Unsafe unsafe = f2240o;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i9 < length) {
            int M2 = M(i9);
            int i10 = iArr[i9];
            int L2 = L(M2);
            if (L2 <= 17) {
                int i11 = iArr[i9 + 2];
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i8 = i12 == i6 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i2 = i7;
                i3 = i8;
                i4 = 1 << (i11 >>> 20);
            } else {
                i2 = i7;
                i3 = i8;
                i4 = 0;
            }
            long j2 = M2 & i6;
            switch (L2) {
                case 0:
                    i5 = i2;
                    if (!o(obj, i9, i5, i3, i4)) {
                        break;
                    } else {
                        f2.c(i10, androidx.datastore.preferences.protobuf.j0.f2325b.d(j2, obj));
                        continue;
                    }
                case 1:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.g(i10, androidx.datastore.preferences.protobuf.j0.f2325b.e(j2, obj));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.j(i10, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.q(i10, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.i(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.f(i10, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.e(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.a(i10, androidx.datastore.preferences.protobuf.j0.f2325b.c(j2, obj));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        java.lang.Object object = unsafe.getObject(obj, j2);
                        if (object instanceof java.lang.String) {
                            ((androidx.datastore.preferences.protobuf.C0077m) f2.f2229a).r0(i10, (java.lang.String) object);
                            break;
                        } else {
                            f2.b(i10, (androidx.datastore.preferences.protobuf.C0071g) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.k(i10, unsafe.getObject(obj, j2), m(i9));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.b(i10, (androidx.datastore.preferences.protobuf.C0071g) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.p(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.d(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.l(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.m(i10, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.n(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.o(i10, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i5 = i2;
                    if (o(obj, i9, i2, i3, i4)) {
                        f2.h(i10, unsafe.getObject(obj, j2), m(i9));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    androidx.datastore.preferences.protobuf.X.E(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                    androidx.datastore.preferences.protobuf.X.I(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                    androidx.datastore.preferences.protobuf.X.L(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                    androidx.datastore.preferences.protobuf.X.T(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 22:
                    androidx.datastore.preferences.protobuf.X.K(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 23:
                    androidx.datastore.preferences.protobuf.X.H(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 24:
                    androidx.datastore.preferences.protobuf.X.G(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                    androidx.datastore.preferences.protobuf.X.C(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    androidx.datastore.preferences.protobuf.X.R(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                    androidx.datastore.preferences.protobuf.X.M(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, m(i9));
                    break;
                case 28:
                    androidx.datastore.preferences.protobuf.X.D(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5796I /* 29 */:
                    androidx.datastore.preferences.protobuf.X.S(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 30:
                    androidx.datastore.preferences.protobuf.X.F(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 31:
                    androidx.datastore.preferences.protobuf.X.N(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 32:
                    androidx.datastore.preferences.protobuf.X.O(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 33:
                    androidx.datastore.preferences.protobuf.X.P(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 34:
                    androidx.datastore.preferences.protobuf.X.Q(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5797J /* 35 */:
                    androidx.datastore.preferences.protobuf.X.E(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 36:
                    androidx.datastore.preferences.protobuf.X.I(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 37:
                    androidx.datastore.preferences.protobuf.X.L(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5798K /* 38 */:
                    androidx.datastore.preferences.protobuf.X.T(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 39:
                    androidx.datastore.preferences.protobuf.X.K(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                    androidx.datastore.preferences.protobuf.X.H(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 41:
                    androidx.datastore.preferences.protobuf.X.G(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    androidx.datastore.preferences.protobuf.X.C(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 43:
                    androidx.datastore.preferences.protobuf.X.S(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 44:
                    androidx.datastore.preferences.protobuf.X.F(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 45:
                    androidx.datastore.preferences.protobuf.X.N(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 46:
                    androidx.datastore.preferences.protobuf.X.O(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 47:
                    androidx.datastore.preferences.protobuf.X.P(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 48:
                    androidx.datastore.preferences.protobuf.X.Q(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 49:
                    androidx.datastore.preferences.protobuf.X.J(iArr[i9], (java.util.List) unsafe.getObject(obj, j2), f2, m(i9));
                    break;
                case 50:
                    java.lang.Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        int i13 = 2;
                        java.lang.Object obj2 = this.f2242b[(i9 / 3) * 2];
                        this.f2253m.getClass();
                        androidx.datastore.preferences.protobuf.G g2 = ((androidx.datastore.preferences.protobuf.H) obj2).f2233a;
                        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
                        c0077m.getClass();
                        for (java.util.Map.Entry entry : ((androidx.datastore.preferences.protobuf.I) object2).entrySet()) {
                            c0077m.t0(i10, i13);
                            c0077m.v0(androidx.datastore.preferences.protobuf.H.a(g2, entry.getKey(), entry.getValue()));
                            java.lang.Object key = entry.getKey();
                            java.lang.Object value = entry.getValue();
                            androidx.datastore.preferences.protobuf.r.b(c0077m, g2.f2230a, 1, key);
                            androidx.datastore.preferences.protobuf.r.b(c0077m, g2.f2231b, 2, value);
                            i13 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (q(i10, i9, obj)) {
                        f2.c(i10, ((java.lang.Double) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(i10, i9, obj)) {
                        f2.g(i10, ((java.lang.Float) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (q(i10, i9, obj)) {
                        f2.j(i10, A(j2, obj));
                        break;
                    }
                    break;
                case 54:
                    if (q(i10, i9, obj)) {
                        f2.q(i10, A(j2, obj));
                        break;
                    }
                    break;
                case 55:
                    if (q(i10, i9, obj)) {
                        f2.i(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 56:
                    if (q(i10, i9, obj)) {
                        f2.f(i10, A(j2, obj));
                        break;
                    }
                    break;
                case 57:
                    if (q(i10, i9, obj)) {
                        f2.e(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 58:
                    if (q(i10, i9, obj)) {
                        f2.a(i10, ((java.lang.Boolean) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(i10, i9, obj)) {
                        java.lang.Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof java.lang.String) {
                            ((androidx.datastore.preferences.protobuf.C0077m) f2.f2229a).r0(i10, (java.lang.String) object3);
                            break;
                        } else {
                            f2.b(i10, (androidx.datastore.preferences.protobuf.C0071g) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (q(i10, i9, obj)) {
                        f2.k(i10, unsafe.getObject(obj, j2), m(i9));
                        break;
                    }
                    break;
                case 61:
                    if (q(i10, i9, obj)) {
                        f2.b(i10, (androidx.datastore.preferences.protobuf.C0071g) unsafe.getObject(obj, j2));
                        break;
                    }
                    break;
                case 62:
                    if (q(i10, i9, obj)) {
                        f2.p(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 63:
                    if (q(i10, i9, obj)) {
                        f2.d(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 64:
                    if (q(i10, i9, obj)) {
                        f2.l(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 65:
                    if (q(i10, i9, obj)) {
                        f2.m(i10, A(j2, obj));
                        break;
                    }
                    break;
                case 66:
                    if (q(i10, i9, obj)) {
                        f2.n(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 67:
                    if (q(i10, i9, obj)) {
                        f2.o(i10, A(j2, obj));
                        break;
                    }
                    break;
                case 68:
                    if (q(i10, i9, obj)) {
                        f2.h(i10, unsafe.getObject(obj, j2), m(i9));
                        break;
                    }
                    break;
            }
            i5 = i2;
            i9 += 3;
            i7 = i5;
            i8 = i3;
            i6 = 1048575;
        }
        this.f2252l.getClass();
        ((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).unknownFields.d(f2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean a(java.lang.Object obj) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f2248h) {
            int i7 = this.f2247g[i6];
            int[] iArr = this.f2241a;
            int i8 = iArr[i7];
            int M2 = M(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f2240o.getInt(obj, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if ((268435456 & M2) != 0 && !o(obj, i7, i2, i3, i11)) {
                return false;
            }
            int L2 = L(M2);
            if (L2 != 9 && L2 != 17) {
                if (L2 != 27) {
                    if (L2 == 60 || L2 == 68) {
                        if (q(i8, i7, obj)) {
                            if (!m(i7).a(androidx.datastore.preferences.protobuf.j0.f2325b.h(M2 & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (L2 != 49) {
                        if (L2 != 50) {
                            continue;
                        } else {
                            java.lang.Object h2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(M2 & 1048575, obj);
                            this.f2253m.getClass();
                            androidx.datastore.preferences.protobuf.I i12 = (androidx.datastore.preferences.protobuf.I) h2;
                            if (i12.isEmpty()) {
                                continue;
                            } else {
                                if (((androidx.datastore.preferences.protobuf.H) this.f2242b[(i7 / 3) * 2]).f2233a.f2231b.f2355a != androidx.datastore.preferences.protobuf.s0.MESSAGE) {
                                    continue;
                                } else {
                                    androidx.datastore.preferences.protobuf.W w2 = null;
                                    for (java.lang.Object obj2 : i12.values()) {
                                        if (w2 == null) {
                                            w2 = androidx.datastore.preferences.protobuf.T.f2259c.a(obj2.getClass());
                                        }
                                        if (!w2.a(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                java.util.List list = (java.util.List) androidx.datastore.preferences.protobuf.j0.f2325b.h(M2 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    androidx.datastore.preferences.protobuf.W m2 = m(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!m2.a(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (o(obj, i7, i2, i3, i11)) {
                if (!m(i7).a(androidx.datastore.preferences.protobuf.j0.f2325b.h(M2 & 1048575, obj))) {
                    return false;
                }
            } else {
                continue;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(java.lang.Object obj, androidx.datastore.preferences.protobuf.C0075k c0075k, androidx.datastore.preferences.protobuf.C0079o c0079o) {
        c0079o.getClass();
        if (p(obj)) {
            r(this.f2252l, obj, c0075k, c0079o);
        } else {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(java.lang.Object obj, java.lang.Object obj2) {
        if (!p(obj)) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f2241a;
            if (i2 >= iArr.length) {
                androidx.datastore.preferences.protobuf.X.A(this.f2252l, obj, obj2);
                return;
            }
            int M2 = M(i2);
            long j2 = 1048575 & M2;
            int i3 = iArr[i2];
            switch (L(M2)) {
                case 0:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.i0 i0Var = androidx.datastore.preferences.protobuf.j0.f2325b;
                        i0Var.l(obj, j2, i0Var.d(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 1:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.i0 i0Var2 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        i0Var2.m(obj, j2, i0Var2.e(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 2:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.n(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 3:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.n(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 4:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.m(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 5:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.n(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 6:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.m(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 7:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.i0 i0Var3 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        i0Var3.j(obj, j2, i0Var3.c(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 8:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.o(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 9:
                    t(i2, obj, obj2);
                    break;
                case 10:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.o(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 11:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.m(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 12:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.m(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 13:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.m(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 14:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.n(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 15:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.m(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 16:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.n(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 17:
                    t(i2, obj, obj2);
                    break;
                case 18:
                case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                case 22:
                case 23:
                case 24:
                case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                case 28:
                case io.appmetrica.analytics.impl.C0326e9.f5796I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case io.appmetrica.analytics.impl.C0326e9.f5797J /* 35 */:
                case 36:
                case 37:
                case io.appmetrica.analytics.impl.C0326e9.f5798K /* 38 */:
                case 39:
                case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                case 41:
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f2251k.getClass();
                    androidx.datastore.preferences.protobuf.i0 i0Var4 = androidx.datastore.preferences.protobuf.j0.f2325b;
                    androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x = (androidx.datastore.preferences.protobuf.InterfaceC0087x) i0Var4.h(j2, obj);
                    androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x2 = (androidx.datastore.preferences.protobuf.InterfaceC0087x) i0Var4.h(j2, obj2);
                    androidx.datastore.preferences.protobuf.U u2 = (androidx.datastore.preferences.protobuf.U) interfaceC0087x;
                    int i4 = u2.f2264c;
                    int i5 = ((androidx.datastore.preferences.protobuf.U) interfaceC0087x2).f2264c;
                    if (i4 > 0 && i5 > 0) {
                        if (!((androidx.datastore.preferences.protobuf.AbstractC0066b) interfaceC0087x).f2285a) {
                            interfaceC0087x = u2.c(i5 + i4);
                        }
                        ((androidx.datastore.preferences.protobuf.AbstractC0066b) interfaceC0087x).addAll(interfaceC0087x2);
                    }
                    if (i4 > 0) {
                        interfaceC0087x2 = interfaceC0087x;
                    }
                    androidx.datastore.preferences.protobuf.j0.o(obj, j2, interfaceC0087x2);
                    break;
                case 50:
                    java.lang.Class cls = androidx.datastore.preferences.protobuf.X.f2269a;
                    androidx.datastore.preferences.protobuf.i0 i0Var5 = androidx.datastore.preferences.protobuf.j0.f2325b;
                    java.lang.Object h2 = i0Var5.h(j2, obj);
                    java.lang.Object h3 = i0Var5.h(j2, obj2);
                    this.f2253m.getClass();
                    androidx.datastore.preferences.protobuf.j0.o(obj, j2, androidx.datastore.preferences.protobuf.J.b(h2, h3));
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
                    if (!q(i3, i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.o(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj2));
                        I(i3, i2, obj);
                        break;
                    }
                case 60:
                    u(i2, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!q(i3, i2, obj2)) {
                        break;
                    } else {
                        androidx.datastore.preferences.protobuf.j0.o(obj, j2, androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, obj2));
                        I(i3, i2, obj);
                        break;
                    }
                case 68:
                    u(i2, obj, obj2);
                    break;
            }
            i2 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(java.lang.Object obj, androidx.datastore.preferences.protobuf.F f2) {
        f2.getClass();
        N(obj, f2);
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
    public final int e(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w) {
        int i2;
        int b2;
        int i3;
        int[] iArr = this.f2241a;
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int M2 = M(i5);
            int i6 = iArr[i5];
            long j2 = 1048575 & M2;
            int i7 = 1237;
            int i8 = 37;
            switch (L(M2)) {
                case 0:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.j0.f2325b.d(j2, abstractC0086w)));
                    i4 = b2 + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    b2 = java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.j0.f2325b.e(j2, abstractC0086w));
                    i4 = b2 + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, abstractC0086w));
                    i4 = b2 + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, abstractC0086w));
                    i4 = b2 + i2;
                    break;
                case 4:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, abstractC0086w);
                    i4 = b2 + i2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, abstractC0086w));
                    i4 = b2 + i2;
                    break;
                case 6:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, abstractC0086w);
                    i4 = b2 + i2;
                    break;
                case 7:
                    i3 = i4 * 53;
                    boolean c2 = androidx.datastore.preferences.protobuf.j0.f2325b.c(j2, abstractC0086w);
                    java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
                    break;
                case 8:
                    i2 = i4 * 53;
                    b2 = ((java.lang.String) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w)).hashCode();
                    i4 = b2 + i2;
                    break;
                case 9:
                    java.lang.Object h2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w);
                    if (h2 != null) {
                        i8 = h2.hashCode();
                    }
                    i4 = (i4 * 53) + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w).hashCode();
                    i4 = b2 + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, abstractC0086w);
                    i4 = b2 + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, abstractC0086w);
                    i4 = b2 + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, abstractC0086w);
                    i4 = b2 + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, abstractC0086w));
                    i4 = b2 + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, abstractC0086w);
                    i4 = b2 + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(androidx.datastore.preferences.protobuf.j0.f2325b.g(j2, abstractC0086w));
                    i4 = b2 + i2;
                    break;
                case 17:
                    java.lang.Object h3 = androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w);
                    if (h3 != null) {
                        i8 = h3.hashCode();
                    }
                    i4 = (i4 * 53) + i8;
                    break;
                case 18:
                case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                case 22:
                case 23:
                case 24:
                case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                case 28:
                case io.appmetrica.analytics.impl.C0326e9.f5796I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case io.appmetrica.analytics.impl.C0326e9.f5797J /* 35 */:
                case 36:
                case 37:
                case io.appmetrica.analytics.impl.C0326e9.f5798K /* 38 */:
                case 39:
                case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                case 41:
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w).hashCode();
                    i4 = b2 + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    b2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w).hashCode();
                    i4 = b2 + i2;
                    break;
                case 51:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(java.lang.Double.doubleToLongBits(((java.lang.Double) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w)).doubleValue()));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = java.lang.Float.floatToIntBits(((java.lang.Float) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w)).floatValue());
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(A(j2, abstractC0086w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(A(j2, abstractC0086w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0086w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(A(j2, abstractC0086w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0086w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i6, i5, abstractC0086w)) {
                        i3 = i4 * 53;
                        boolean booleanValue = ((java.lang.Boolean) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w)).booleanValue();
                        java.nio.charset.Charset charset2 = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = ((java.lang.String) androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w)).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0086w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0086w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0086w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(A(j2, abstractC0086w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0086w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = androidx.datastore.preferences.protobuf.AbstractC0088y.b(A(j2, abstractC0086w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i6, i5, abstractC0086w)) {
                        i2 = i4 * 53;
                        b2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(j2, abstractC0086w).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f2252l.getClass();
        return abstractC0086w.unknownFields.hashCode() + (i4 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int f(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w) {
        int i2;
        int i3;
        int i4;
        int L2;
        int K2;
        int i5;
        int Z2;
        int b02;
        sun.misc.Unsafe unsafe = f2240o;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f2241a;
            if (i9 >= iArr.length) {
                this.f2252l.getClass();
                return abstractC0086w.unknownFields.b() + i10;
            }
            int M2 = M(i9);
            int L3 = L(M2);
            int i11 = iArr[i9];
            int i12 = iArr[i9 + 2];
            int i13 = i12 & i6;
            if (L3 <= 17) {
                if (i13 != i7) {
                    i8 = i13 == i6 ? 0 : unsafe.getInt(abstractC0086w, i13);
                    i7 = i13;
                }
                i2 = i7;
                i3 = i8;
                i4 = 1 << (i12 >>> 20);
            } else {
                i2 = i7;
                i3 = i8;
                i4 = 0;
            }
            long j2 = M2 & i6;
            if (L3 >= androidx.datastore.preferences.protobuf.EnumC0082s.f2357b.a()) {
                androidx.datastore.preferences.protobuf.EnumC0082s.f2358c.a();
            }
            switch (L3) {
                case 0:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.L(i11);
                        i10 += L2;
                        break;
                    }
                case 1:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.P(i11);
                        i10 += L2;
                        break;
                    }
                case 2:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.S(i11, unsafe.getLong(abstractC0086w, j2));
                        i10 += L2;
                        break;
                    }
                case 3:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.c0(i11, unsafe.getLong(abstractC0086w, j2));
                        i10 += L2;
                        break;
                    }
                case 4:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.R(i11, unsafe.getInt(abstractC0086w, j2));
                        i10 += L2;
                        break;
                    }
                case 5:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.O(i11);
                        i10 += L2;
                        break;
                    }
                case 6:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.N(i11);
                        i10 += L2;
                        break;
                    }
                case 7:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.J(i11);
                        i10 += L2;
                        break;
                    }
                case 8:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        java.lang.Object object = unsafe.getObject(abstractC0086w, j2);
                        K2 = object instanceof androidx.datastore.preferences.protobuf.C0071g ? androidx.datastore.preferences.protobuf.C0077m.K(i11, (androidx.datastore.preferences.protobuf.C0071g) object) : androidx.datastore.preferences.protobuf.C0077m.X(i11, (java.lang.String) object);
                        i10 = K2 + i10;
                        break;
                    }
                case 9:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.X.o(i11, unsafe.getObject(abstractC0086w, j2), m(i9));
                        i10 += L2;
                        break;
                    }
                case 10:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.K(i11, (androidx.datastore.preferences.protobuf.C0071g) unsafe.getObject(abstractC0086w, j2));
                        i10 += L2;
                        break;
                    }
                case 11:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.a0(i11, unsafe.getInt(abstractC0086w, j2));
                        i10 += L2;
                        break;
                    }
                case 12:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.M(i11, unsafe.getInt(abstractC0086w, j2));
                        i10 += L2;
                        break;
                    }
                case 13:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.T(i11);
                        i10 += L2;
                        break;
                    }
                case 14:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.U(i11);
                        i10 += L2;
                        break;
                    }
                case 15:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.V(i11, unsafe.getInt(abstractC0086w, j2));
                        i10 += L2;
                        break;
                    }
                case 16:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.W(i11, unsafe.getLong(abstractC0086w, j2));
                        i10 += L2;
                        break;
                    }
                case 17:
                    if (!o(abstractC0086w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.Q(i11, (androidx.datastore.preferences.protobuf.AbstractC0065a) unsafe.getObject(abstractC0086w, j2), m(i9));
                        i10 += L2;
                        break;
                    }
                case 18:
                    L2 = androidx.datastore.preferences.protobuf.X.h(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                    L2 = androidx.datastore.preferences.protobuf.X.f(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                    L2 = androidx.datastore.preferences.protobuf.X.m(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                    L2 = androidx.datastore.preferences.protobuf.X.x(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case 22:
                    L2 = androidx.datastore.preferences.protobuf.X.k(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case 23:
                    L2 = androidx.datastore.preferences.protobuf.X.h(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case 24:
                    L2 = androidx.datastore.preferences.protobuf.X.f(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                    L2 = androidx.datastore.preferences.protobuf.X.a(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                    L2 = androidx.datastore.preferences.protobuf.X.u(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                    L2 = androidx.datastore.preferences.protobuf.X.p(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2), m(i9));
                    i10 += L2;
                    break;
                case 28:
                    L2 = androidx.datastore.preferences.protobuf.X.c(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5796I /* 29 */:
                    L2 = androidx.datastore.preferences.protobuf.X.v(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case 30:
                    L2 = androidx.datastore.preferences.protobuf.X.d(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case 31:
                    L2 = androidx.datastore.preferences.protobuf.X.f(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case 32:
                    L2 = androidx.datastore.preferences.protobuf.X.h(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case 33:
                    L2 = androidx.datastore.preferences.protobuf.X.q(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case 34:
                    L2 = androidx.datastore.preferences.protobuf.X.s(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2));
                    i10 += L2;
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5797J /* 35 */:
                    i5 = androidx.datastore.preferences.protobuf.X.i((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 36:
                    i5 = androidx.datastore.preferences.protobuf.X.g((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 37:
                    i5 = androidx.datastore.preferences.protobuf.X.n((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case io.appmetrica.analytics.impl.C0326e9.f5798K /* 38 */:
                    i5 = androidx.datastore.preferences.protobuf.X.y((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 39:
                    i5 = androidx.datastore.preferences.protobuf.X.l((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                    i5 = androidx.datastore.preferences.protobuf.X.i((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 41:
                    i5 = androidx.datastore.preferences.protobuf.X.g((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                    i5 = androidx.datastore.preferences.protobuf.X.b((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 43:
                    i5 = androidx.datastore.preferences.protobuf.X.w((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 44:
                    i5 = androidx.datastore.preferences.protobuf.X.e((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 45:
                    i5 = androidx.datastore.preferences.protobuf.X.g((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 46:
                    i5 = androidx.datastore.preferences.protobuf.X.i((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 47:
                    i5 = androidx.datastore.preferences.protobuf.X.r((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 48:
                    i5 = androidx.datastore.preferences.protobuf.X.t((java.util.List) unsafe.getObject(abstractC0086w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i11);
                        b02 = androidx.datastore.preferences.protobuf.C0077m.b0(i5);
                        i10 += b02 + Z2 + i5;
                        break;
                    }
                case 49:
                    L2 = androidx.datastore.preferences.protobuf.X.j(i11, (java.util.List) unsafe.getObject(abstractC0086w, j2), m(i9));
                    i10 += L2;
                    break;
                case 50:
                    java.lang.Object object2 = unsafe.getObject(abstractC0086w, j2);
                    java.lang.Object obj = this.f2242b[(i9 / 3) * 2];
                    this.f2253m.getClass();
                    L2 = androidx.datastore.preferences.protobuf.J.a(i11, object2, obj);
                    i10 += L2;
                    break;
                case 51:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.L(i11);
                        i10 += L2;
                        break;
                    }
                case 52:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.P(i11);
                        i10 += L2;
                        break;
                    }
                case 53:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.S(i11, A(j2, abstractC0086w));
                        i10 += L2;
                        break;
                    }
                case 54:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.c0(i11, A(j2, abstractC0086w));
                        i10 += L2;
                        break;
                    }
                case 55:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.R(i11, z(j2, abstractC0086w));
                        i10 += L2;
                        break;
                    }
                case 56:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.O(i11);
                        i10 += L2;
                        break;
                    }
                case 57:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.N(i11);
                        i10 += L2;
                        break;
                    }
                case 58:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.J(i11);
                        i10 += L2;
                        break;
                    }
                case 59:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        java.lang.Object object3 = unsafe.getObject(abstractC0086w, j2);
                        K2 = object3 instanceof androidx.datastore.preferences.protobuf.C0071g ? androidx.datastore.preferences.protobuf.C0077m.K(i11, (androidx.datastore.preferences.protobuf.C0071g) object3) : androidx.datastore.preferences.protobuf.C0077m.X(i11, (java.lang.String) object3);
                        i10 = K2 + i10;
                        break;
                    }
                case 60:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.X.o(i11, unsafe.getObject(abstractC0086w, j2), m(i9));
                        i10 += L2;
                        break;
                    }
                case 61:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.K(i11, (androidx.datastore.preferences.protobuf.C0071g) unsafe.getObject(abstractC0086w, j2));
                        i10 += L2;
                        break;
                    }
                case 62:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.a0(i11, z(j2, abstractC0086w));
                        i10 += L2;
                        break;
                    }
                case 63:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.M(i11, z(j2, abstractC0086w));
                        i10 += L2;
                        break;
                    }
                case 64:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.T(i11);
                        i10 += L2;
                        break;
                    }
                case 65:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.U(i11);
                        i10 += L2;
                        break;
                    }
                case 66:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.V(i11, z(j2, abstractC0086w));
                        i10 += L2;
                        break;
                    }
                case 67:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.W(i11, A(j2, abstractC0086w));
                        i10 += L2;
                        break;
                    }
                case 68:
                    if (!q(i11, i9, abstractC0086w)) {
                        break;
                    } else {
                        L2 = androidx.datastore.preferences.protobuf.C0077m.Q(i11, (androidx.datastore.preferences.protobuf.AbstractC0065a) unsafe.getObject(abstractC0086w, j2), m(i9));
                        i10 += L2;
                        break;
                    }
            }
            i9 += 3;
            i7 = i2;
            i8 = i3;
            i6 = 1048575;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final androidx.datastore.preferences.protobuf.AbstractC0086w g() {
        this.f2250j.getClass();
        return ((androidx.datastore.preferences.protobuf.AbstractC0086w) this.f2245e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(java.lang.Object obj) {
        if (p(obj)) {
            if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC0086w) {
                androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w = (androidx.datastore.preferences.protobuf.AbstractC0086w) obj;
                abstractC0086w.d();
                abstractC0086w.c();
                abstractC0086w.j();
            }
            int[] iArr = this.f2241a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int M2 = M(i2);
                long j2 = 1048575 & M2;
                int L2 = L(M2);
                if (L2 != 9) {
                    if (L2 != 60 && L2 != 68) {
                        switch (L2) {
                            case 18:
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                            case 22:
                            case 23:
                            case 24:
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                            case 28:
                            case io.appmetrica.analytics.impl.C0326e9.f5796I /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case io.appmetrica.analytics.impl.C0326e9.f5797J /* 35 */:
                            case 36:
                            case 37:
                            case io.appmetrica.analytics.impl.C0326e9.f5798K /* 38 */:
                            case 39:
                            case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                            case 41:
                            case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f2251k.getClass();
                                androidx.datastore.preferences.protobuf.C.a(j2, obj);
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = f2240o;
                                java.lang.Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.f2253m.getClass();
                                    androidx.datastore.preferences.protobuf.J.c(object);
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i2], i2, obj)) {
                        m(i2).h(f2240o.getObject(obj, j2));
                    }
                }
                if (n(i2, obj)) {
                    m(i2).h(f2240o.getObject(obj, j2));
                }
            }
            this.f2252l.getClass();
            androidx.datastore.preferences.protobuf.e0.b(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.X.B(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w, java.lang.Object obj) {
        int[] iArr = this.f2241a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                this.f2252l.getClass();
                return abstractC0086w.unknownFields.equals(((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).unknownFields);
            }
            int M2 = M(i2);
            long j2 = M2 & 1048575;
            switch (L(M2)) {
                case 0:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 1:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var2 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 2:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var3 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 3:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var4 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 4:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var5 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 5:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var6 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 6:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var7 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 7:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var8 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 8:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var9 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 9:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var10 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 10:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var11 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 11:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var12 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 12:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var13 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 13:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var14 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 14:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var15 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 15:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var16 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 16:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var17 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 17:
                    if (j(abstractC0086w, obj, i2)) {
                        androidx.datastore.preferences.protobuf.i0 i0Var18 = androidx.datastore.preferences.protobuf.j0.f2325b;
                        break;
                    }
                    z2 = false;
                    break;
                case 18:
                case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                case 22:
                case 23:
                case 24:
                case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                case 28:
                case io.appmetrica.analytics.impl.C0326e9.f5796I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case io.appmetrica.analytics.impl.C0326e9.f5797J /* 35 */:
                case 36:
                case 37:
                case io.appmetrica.analytics.impl.C0326e9.f5798K /* 38 */:
                case 39:
                case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                case 41:
                case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    androidx.datastore.preferences.protobuf.i0 i0Var19 = androidx.datastore.preferences.protobuf.j0.f2325b;
                    z2 = androidx.datastore.preferences.protobuf.X.B(i0Var19.h(j2, abstractC0086w), i0Var19.h(j2, obj));
                    break;
                case 50:
                    androidx.datastore.preferences.protobuf.i0 i0Var20 = androidx.datastore.preferences.protobuf.j0.f2325b;
                    z2 = androidx.datastore.preferences.protobuf.X.B(i0Var20.h(j2, abstractC0086w), i0Var20.h(j2, obj));
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
                    long j3 = iArr[i2 + 2] & 1048575;
                    androidx.datastore.preferences.protobuf.i0 i0Var21 = androidx.datastore.preferences.protobuf.j0.f2325b;
                    if (i0Var21.f(j3, abstractC0086w) == i0Var21.f(j3, obj)) {
                        break;
                    }
                    z2 = false;
                    break;
            }
            if (!z2) {
                return false;
            }
            i2 += 3;
        }
    }

    public final boolean j(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w, java.lang.Object obj, int i2) {
        return n(i2, abstractC0086w) == n(i2, obj);
    }

    public final void k(int i2, java.lang.Object obj, java.lang.Object obj2) {
        int i3 = this.f2241a[i2];
        if (androidx.datastore.preferences.protobuf.j0.f2325b.h(M(i2) & 1048575, obj) == null) {
            return;
        }
        l(i2);
    }

    public final void l(int i2) {
        if (this.f2242b[((i2 / 3) * 2) + 1] != null) {
            throw new java.lang.ClassCastException();
        }
    }

    public final androidx.datastore.preferences.protobuf.W m(int i2) {
        int i3 = (i2 / 3) * 2;
        java.lang.Object[] objArr = this.f2242b;
        androidx.datastore.preferences.protobuf.W w2 = (androidx.datastore.preferences.protobuf.W) objArr[i3];
        if (w2 != null) {
            return w2;
        }
        androidx.datastore.preferences.protobuf.W a2 = androidx.datastore.preferences.protobuf.T.f2259c.a((java.lang.Class) objArr[i3 + 1]);
        objArr[i3] = a2;
        return a2;
    }

    public final boolean n(int i2, java.lang.Object obj) {
        int i3 = this.f2241a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & androidx.datastore.preferences.protobuf.j0.f2325b.f(j2, obj)) != 0;
        }
        int M2 = M(i2);
        long j3 = M2 & 1048575;
        switch (L(M2)) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(androidx.datastore.preferences.protobuf.j0.f2325b.d(j3, obj)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(androidx.datastore.preferences.protobuf.j0.f2325b.e(j3, obj)) != 0;
            case 2:
                return androidx.datastore.preferences.protobuf.j0.f2325b.g(j3, obj) != 0;
            case 3:
                return androidx.datastore.preferences.protobuf.j0.f2325b.g(j3, obj) != 0;
            case 4:
                return androidx.datastore.preferences.protobuf.j0.f2325b.f(j3, obj) != 0;
            case 5:
                return androidx.datastore.preferences.protobuf.j0.f2325b.g(j3, obj) != 0;
            case 6:
                return androidx.datastore.preferences.protobuf.j0.f2325b.f(j3, obj) != 0;
            case 7:
                return androidx.datastore.preferences.protobuf.j0.f2325b.c(j3, obj);
            case 8:
                java.lang.Object h2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(j3, obj);
                if (h2 instanceof java.lang.String) {
                    return !((java.lang.String) h2).isEmpty();
                }
                if (h2 instanceof androidx.datastore.preferences.protobuf.C0071g) {
                    return !androidx.datastore.preferences.protobuf.C0071g.f2301c.equals(h2);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return androidx.datastore.preferences.protobuf.j0.f2325b.h(j3, obj) != null;
            case 10:
                return !androidx.datastore.preferences.protobuf.C0071g.f2301c.equals(androidx.datastore.preferences.protobuf.j0.f2325b.h(j3, obj));
            case 11:
                return androidx.datastore.preferences.protobuf.j0.f2325b.f(j3, obj) != 0;
            case 12:
                return androidx.datastore.preferences.protobuf.j0.f2325b.f(j3, obj) != 0;
            case 13:
                return androidx.datastore.preferences.protobuf.j0.f2325b.f(j3, obj) != 0;
            case 14:
                return androidx.datastore.preferences.protobuf.j0.f2325b.g(j3, obj) != 0;
            case 15:
                return androidx.datastore.preferences.protobuf.j0.f2325b.f(j3, obj) != 0;
            case 16:
                return androidx.datastore.preferences.protobuf.j0.f2325b.g(j3, obj) != 0;
            case 17:
                return androidx.datastore.preferences.protobuf.j0.f2325b.h(j3, obj) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    public final boolean o(java.lang.Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? n(i2, obj) : (i4 & i5) != 0;
    }

    public final boolean q(int i2, int i3, java.lang.Object obj) {
        return androidx.datastore.preferences.protobuf.j0.f2325b.f((long) (this.f2241a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0649 A[Catch: all -> 0x025d, TryCatch #4 {all -> 0x025d, blocks: (B:54:0x0644, B:56:0x0649, B:57:0x064e, B:50:0x0258, B:78:0x0260, B:79:0x0273, B:80:0x0286, B:81:0x0299, B:82:0x02ac, B:83:0x02c5, B:84:0x02d8, B:85:0x02eb, B:86:0x02fe, B:87:0x0311, B:88:0x0324, B:89:0x0337, B:90:0x034a, B:91:0x035d, B:92:0x0370, B:93:0x0383, B:94:0x0396, B:95:0x03a9, B:96:0x03bc, B:97:0x03d5, B:98:0x03e8, B:99:0x03fb, B:100:0x040f, B:101:0x0417, B:102:0x042a, B:103:0x043d, B:104:0x0450, B:105:0x0463, B:106:0x0476, B:107:0x0489, B:108:0x049c, B:109:0x04af, B:110:0x04c8, B:111:0x04de, B:112:0x04f4, B:113:0x050b, B:114:0x0522, B:115:0x053b, B:116:0x0551, B:117:0x0564, B:118:0x057d, B:119:0x0588, B:120:0x05a0, B:121:0x05b7, B:122:0x05ce, B:123:0x05e4, B:124:0x05fa, B:125:0x060f, B:126:0x0627), top: B:53:0x0644 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0654 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(androidx.datastore.preferences.protobuf.e0 e0Var, java.lang.Object obj, androidx.datastore.preferences.protobuf.C0075k c0075k, androidx.datastore.preferences.protobuf.C0079o c0079o) {
        int i2;
        int i3;
        int L2;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j;
        androidx.datastore.preferences.protobuf.C c2;
        int i4;
        int[] iArr = this.f2247g;
        int i5 = this.f2249i;
        int i6 = this.f2248h;
        androidx.datastore.preferences.protobuf.d0 d0Var = null;
        while (true) {
            try {
                int a2 = c0075k.a();
                int B2 = B(a2);
                if (B2 >= 0) {
                    int M2 = M(B2);
                    try {
                        L2 = L(M2);
                        abstractC0074j = c0075k.f2330a;
                        c2 = this.f2251k;
                    } catch (androidx.datastore.preferences.protobuf.C0089z unused) {
                        i2 = i6;
                        i3 = 0;
                    }
                    switch (L2) {
                        case 0:
                            i2 = i6;
                            long y2 = y(M2);
                            c0075k.w(1);
                            androidx.datastore.preferences.protobuf.j0.f2325b.l(obj, y2, abstractC0074j.h());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 1:
                            i2 = i6;
                            long y3 = y(M2);
                            c0075k.w(5);
                            androidx.datastore.preferences.protobuf.j0.f2325b.m(obj, y3, abstractC0074j.l());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 2:
                            i2 = i6;
                            long y4 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.n(obj, y4, abstractC0074j.n());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 3:
                            i2 = i6;
                            long y5 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.n(obj, y5, abstractC0074j.w());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 4:
                            i2 = i6;
                            long y6 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.m(obj, y6, abstractC0074j.m());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 5:
                            i2 = i6;
                            long y7 = y(M2);
                            c0075k.w(1);
                            androidx.datastore.preferences.protobuf.j0.n(obj, y7, abstractC0074j.k());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 6:
                            i2 = i6;
                            long y8 = y(M2);
                            c0075k.w(5);
                            androidx.datastore.preferences.protobuf.j0.m(obj, y8, abstractC0074j.j());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 7:
                            i2 = i6;
                            long y9 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.f2325b.j(obj, y9, abstractC0074j.f());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 8:
                            i2 = i6;
                            E(M2, c0075k, obj);
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 9:
                            i2 = i6;
                            androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a = (androidx.datastore.preferences.protobuf.AbstractC0065a) v(B2, obj);
                            androidx.datastore.preferences.protobuf.W m2 = m(B2);
                            c0075k.w(2);
                            c0075k.c(abstractC0065a, m2, c0079o);
                            J(obj, B2, abstractC0065a);
                            i6 = i2;
                            break;
                        case 10:
                            i2 = i6;
                            androidx.datastore.preferences.protobuf.j0.o(obj, y(M2), c0075k.e());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 11:
                            i2 = i6;
                            long y10 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.m(obj, y10, abstractC0074j.v());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 12:
                            i2 = i6;
                            c0075k.w(0);
                            int i7 = abstractC0074j.i();
                            l(B2);
                            androidx.datastore.preferences.protobuf.j0.m(obj, y(M2), i7);
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 13:
                            i2 = i6;
                            long y11 = y(M2);
                            c0075k.w(5);
                            androidx.datastore.preferences.protobuf.j0.m(obj, y11, abstractC0074j.o());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 14:
                            i2 = i6;
                            long y12 = y(M2);
                            c0075k.w(1);
                            androidx.datastore.preferences.protobuf.j0.n(obj, y12, abstractC0074j.p());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 15:
                            i2 = i6;
                            long y13 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.m(obj, y13, abstractC0074j.q());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 16:
                            i2 = i6;
                            long y14 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.n(obj, y14, abstractC0074j.r());
                            H(B2, obj);
                            i6 = i2;
                            break;
                        case 17:
                            i2 = i6;
                            androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a2 = (androidx.datastore.preferences.protobuf.AbstractC0065a) v(B2, obj);
                            androidx.datastore.preferences.protobuf.W m3 = m(B2);
                            c0075k.w(3);
                            c0075k.b(abstractC0065a2, m3, c0079o);
                            J(obj, B2, abstractC0065a2);
                            i6 = i2;
                            break;
                        case 18:
                            i2 = i6;
                            long y15 = y(M2);
                            c2.getClass();
                            c0075k.g(androidx.datastore.preferences.protobuf.C.b(y15, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                            i2 = i6;
                            long y16 = y(M2);
                            c2.getClass();
                            c0075k.l(androidx.datastore.preferences.protobuf.C.b(y16, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                            i2 = i6;
                            long y17 = y(M2);
                            c2.getClass();
                            c0075k.n(androidx.datastore.preferences.protobuf.C.b(y17, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                            i2 = i6;
                            long y18 = y(M2);
                            c2.getClass();
                            c0075k.u(androidx.datastore.preferences.protobuf.C.b(y18, obj));
                            i6 = i2;
                            break;
                        case 22:
                            i2 = i6;
                            long y19 = y(M2);
                            c2.getClass();
                            c0075k.m(androidx.datastore.preferences.protobuf.C.b(y19, obj));
                            i6 = i2;
                            break;
                        case 23:
                            i2 = i6;
                            long y20 = y(M2);
                            c2.getClass();
                            c0075k.k(androidx.datastore.preferences.protobuf.C.b(y20, obj));
                            i6 = i2;
                            break;
                        case 24:
                            i2 = i6;
                            long y21 = y(M2);
                            c2.getClass();
                            c0075k.j(androidx.datastore.preferences.protobuf.C.b(y21, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                            i2 = i6;
                            long y22 = y(M2);
                            c2.getClass();
                            c0075k.d(androidx.datastore.preferences.protobuf.C.b(y22, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                            i2 = i6;
                            F(M2, c0075k, obj);
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                            i2 = i6;
                            D(obj, M2, c0075k, m(B2), c0079o);
                            i6 = i2;
                            break;
                        case 28:
                            i2 = i6;
                            long y23 = y(M2);
                            c2.getClass();
                            c0075k.f(androidx.datastore.preferences.protobuf.C.b(y23, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5796I /* 29 */:
                            i2 = i6;
                            long y24 = y(M2);
                            c2.getClass();
                            c0075k.t(androidx.datastore.preferences.protobuf.C.b(y24, obj));
                            i6 = i2;
                            break;
                        case 30:
                            i2 = i6;
                            long y25 = y(M2);
                            c2.getClass();
                            androidx.datastore.preferences.protobuf.InterfaceC0087x b2 = androidx.datastore.preferences.protobuf.C.b(y25, obj);
                            c0075k.h(b2);
                            l(B2);
                            androidx.datastore.preferences.protobuf.X.z(obj, a2, b2, d0Var, e0Var);
                            i6 = i2;
                            break;
                        case 31:
                            i2 = i6;
                            long y26 = y(M2);
                            c2.getClass();
                            c0075k.o(androidx.datastore.preferences.protobuf.C.b(y26, obj));
                            i6 = i2;
                            break;
                        case 32:
                            i2 = i6;
                            long y27 = y(M2);
                            c2.getClass();
                            c0075k.p(androidx.datastore.preferences.protobuf.C.b(y27, obj));
                            i6 = i2;
                            break;
                        case 33:
                            i2 = i6;
                            long y28 = y(M2);
                            c2.getClass();
                            c0075k.q(androidx.datastore.preferences.protobuf.C.b(y28, obj));
                            i6 = i2;
                            break;
                        case 34:
                            i2 = i6;
                            long y29 = y(M2);
                            c2.getClass();
                            c0075k.r(androidx.datastore.preferences.protobuf.C.b(y29, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5797J /* 35 */:
                            i2 = i6;
                            long y30 = y(M2);
                            c2.getClass();
                            c0075k.g(androidx.datastore.preferences.protobuf.C.b(y30, obj));
                            i6 = i2;
                            break;
                        case 36:
                            i2 = i6;
                            long y31 = y(M2);
                            c2.getClass();
                            c0075k.l(androidx.datastore.preferences.protobuf.C.b(y31, obj));
                            i6 = i2;
                            break;
                        case 37:
                            i2 = i6;
                            long y32 = y(M2);
                            c2.getClass();
                            c0075k.n(androidx.datastore.preferences.protobuf.C.b(y32, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5798K /* 38 */:
                            i2 = i6;
                            long y33 = y(M2);
                            c2.getClass();
                            c0075k.u(androidx.datastore.preferences.protobuf.C.b(y33, obj));
                            i6 = i2;
                            break;
                        case 39:
                            i2 = i6;
                            long y34 = y(M2);
                            c2.getClass();
                            c0075k.m(androidx.datastore.preferences.protobuf.C.b(y34, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5799L /* 40 */:
                            i2 = i6;
                            long y35 = y(M2);
                            c2.getClass();
                            c0075k.k(androidx.datastore.preferences.protobuf.C.b(y35, obj));
                            i6 = i2;
                            break;
                        case 41:
                            i2 = i6;
                            long y36 = y(M2);
                            c2.getClass();
                            c0075k.j(androidx.datastore.preferences.protobuf.C.b(y36, obj));
                            i6 = i2;
                            break;
                        case io.appmetrica.analytics.impl.C0326e9.f5800M /* 42 */:
                            i2 = i6;
                            long y37 = y(M2);
                            c2.getClass();
                            c0075k.d(androidx.datastore.preferences.protobuf.C.b(y37, obj));
                            i6 = i2;
                            break;
                        case 43:
                            i2 = i6;
                            long y38 = y(M2);
                            c2.getClass();
                            c0075k.t(androidx.datastore.preferences.protobuf.C.b(y38, obj));
                            i6 = i2;
                            break;
                        case 44:
                            i2 = i6;
                            long y39 = y(M2);
                            c2.getClass();
                            androidx.datastore.preferences.protobuf.InterfaceC0087x b3 = androidx.datastore.preferences.protobuf.C.b(y39, obj);
                            c0075k.h(b3);
                            l(B2);
                            androidx.datastore.preferences.protobuf.X.z(obj, a2, b3, d0Var, e0Var);
                            i6 = i2;
                            break;
                        case 45:
                            i2 = i6;
                            long y40 = y(M2);
                            c2.getClass();
                            c0075k.o(androidx.datastore.preferences.protobuf.C.b(y40, obj));
                            i6 = i2;
                            break;
                        case 46:
                            i2 = i6;
                            long y41 = y(M2);
                            c2.getClass();
                            c0075k.p(androidx.datastore.preferences.protobuf.C.b(y41, obj));
                            i6 = i2;
                            break;
                        case 47:
                            i2 = i6;
                            long y42 = y(M2);
                            c2.getClass();
                            c0075k.q(androidx.datastore.preferences.protobuf.C.b(y42, obj));
                            i6 = i2;
                            break;
                        case 48:
                            i2 = i6;
                            long y43 = y(M2);
                            c2.getClass();
                            c0075k.r(androidx.datastore.preferences.protobuf.C.b(y43, obj));
                            i6 = i2;
                            break;
                        case 49:
                            i2 = i6;
                            i3 = 0;
                            try {
                                C(obj, y(M2), c0075k, m(B2), c0079o);
                            } catch (androidx.datastore.preferences.protobuf.C0089z unused2) {
                                try {
                                    e0Var.getClass();
                                    if (d0Var == null) {
                                    }
                                    if (!androidx.datastore.preferences.protobuf.e0.c(i3, c0075k, d0Var)) {
                                    }
                                    i6 = i2;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    for (int i8 = i2; i8 < i5; i8++) {
                                        k(iArr[i8], obj, d0Var);
                                    }
                                    if (d0Var != null) {
                                        e0Var.getClass();
                                        ((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).unknownFields = d0Var;
                                    }
                                    throw th;
                                }
                            }
                            i6 = i2;
                            break;
                        case 50:
                            try {
                                java.lang.Object obj2 = this.f2242b[(B2 / 3) * 2];
                                i4 = 0;
                                try {
                                    s(obj, B2, obj2, c0079o, c0075k);
                                    i2 = i6;
                                } catch (androidx.datastore.preferences.protobuf.C0089z unused3) {
                                    i2 = i6;
                                    i3 = i4;
                                    e0Var.getClass();
                                    if (d0Var == null) {
                                        d0Var = androidx.datastore.preferences.protobuf.e0.a(obj);
                                    }
                                    if (!androidx.datastore.preferences.protobuf.e0.c(i3, c0075k, d0Var)) {
                                        for (int i9 = i2; i9 < i5; i9++) {
                                            k(iArr[i9], obj, d0Var);
                                        }
                                        if (d0Var != null) {
                                            ((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).unknownFields = d0Var;
                                            return;
                                        }
                                        return;
                                    }
                                    i6 = i2;
                                }
                            } catch (androidx.datastore.preferences.protobuf.C0089z unused4) {
                                i4 = 0;
                            }
                            i6 = i2;
                        case 51:
                            long y44 = y(M2);
                            c0075k.w(1);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y44, java.lang.Double.valueOf(abstractC0074j.h()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 52:
                            long y45 = y(M2);
                            c0075k.w(5);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y45, java.lang.Float.valueOf(abstractC0074j.l()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 53:
                            long y46 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y46, java.lang.Long.valueOf(abstractC0074j.n()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 54:
                            long y47 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y47, java.lang.Long.valueOf(abstractC0074j.w()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 55:
                            long y48 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y48, java.lang.Integer.valueOf(abstractC0074j.m()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 56:
                            long y49 = y(M2);
                            c0075k.w(1);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y49, java.lang.Long.valueOf(abstractC0074j.k()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 57:
                            long y50 = y(M2);
                            c0075k.w(5);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y50, java.lang.Integer.valueOf(abstractC0074j.j()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 58:
                            long y51 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y51, java.lang.Boolean.valueOf(abstractC0074j.f()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 59:
                            E(M2, c0075k, obj);
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 60:
                            androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a3 = (androidx.datastore.preferences.protobuf.AbstractC0065a) w(a2, B2, obj);
                            androidx.datastore.preferences.protobuf.W m4 = m(B2);
                            c0075k.w(2);
                            c0075k.c(abstractC0065a3, m4, c0079o);
                            K(obj, a2, B2, abstractC0065a3);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 61:
                            androidx.datastore.preferences.protobuf.j0.o(obj, y(M2), c0075k.e());
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 62:
                            long y52 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y52, java.lang.Integer.valueOf(abstractC0074j.v()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 63:
                            c0075k.w(0);
                            int i10 = abstractC0074j.i();
                            l(B2);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y(M2), java.lang.Integer.valueOf(i10));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 64:
                            long y53 = y(M2);
                            c0075k.w(5);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y53, java.lang.Integer.valueOf(abstractC0074j.o()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 65:
                            long y54 = y(M2);
                            c0075k.w(1);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y54, java.lang.Long.valueOf(abstractC0074j.p()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 66:
                            long y55 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y55, java.lang.Integer.valueOf(abstractC0074j.q()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 67:
                            long y56 = y(M2);
                            c0075k.w(0);
                            androidx.datastore.preferences.protobuf.j0.o(obj, y56, java.lang.Long.valueOf(abstractC0074j.r()));
                            I(a2, B2, obj);
                            i2 = i6;
                            i6 = i2;
                            break;
                        case 68:
                            androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a4 = (androidx.datastore.preferences.protobuf.AbstractC0065a) w(a2, B2, obj);
                            androidx.datastore.preferences.protobuf.W m5 = m(B2);
                            c0075k.w(3);
                            c0075k.b(abstractC0065a4, m5, c0079o);
                            K(obj, a2, B2, abstractC0065a4);
                            i2 = i6;
                            i6 = i2;
                            break;
                        default:
                            if (d0Var == null) {
                                e0Var.getClass();
                                d0Var = androidx.datastore.preferences.protobuf.e0.a(obj);
                            }
                            e0Var.getClass();
                            if (!androidx.datastore.preferences.protobuf.e0.c(0, c0075k, d0Var)) {
                                while (i6 < i5) {
                                    k(iArr[i6], obj, d0Var);
                                    i6++;
                                }
                                if (d0Var != null) {
                                    ((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).unknownFields = d0Var;
                                    return;
                                }
                                return;
                            }
                            i2 = i6;
                            i6 = i2;
                            break;
                    }
                } else {
                    if (a2 == Integer.MAX_VALUE) {
                        while (i6 < i5) {
                            k(iArr[i6], obj, d0Var);
                            i6++;
                        }
                        if (d0Var != null) {
                            e0Var.getClass();
                            ((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).unknownFields = d0Var;
                            return;
                        }
                        return;
                    }
                    e0Var.getClass();
                    if (d0Var == null) {
                        d0Var = androidx.datastore.preferences.protobuf.e0.a(obj);
                    }
                    if (!androidx.datastore.preferences.protobuf.e0.c(0, c0075k, d0Var)) {
                        while (i6 < i5) {
                            k(iArr[i6], obj, d0Var);
                            i6++;
                        }
                        if (d0Var != null) {
                            ((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).unknownFields = d0Var;
                            return;
                        }
                        return;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                i2 = i6;
            }
        }
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
    public final void s(java.lang.Object obj, int i2, java.lang.Object obj2, androidx.datastore.preferences.protobuf.C0079o c0079o, androidx.datastore.preferences.protobuf.C0075k c0075k) {
        long M2 = M(i2) & 1048575;
        java.lang.Object h2 = androidx.datastore.preferences.protobuf.j0.f2325b.h(M2, obj);
        androidx.datastore.preferences.protobuf.J j2 = this.f2253m;
        if (h2 == null) {
            j2.getClass();
            h2 = androidx.datastore.preferences.protobuf.I.f2234b.b();
            androidx.datastore.preferences.protobuf.j0.o(obj, M2, h2);
        } else {
            j2.getClass();
            if (!((androidx.datastore.preferences.protobuf.I) h2).f2235a) {
                androidx.datastore.preferences.protobuf.I b2 = androidx.datastore.preferences.protobuf.I.f2234b.b();
                androidx.datastore.preferences.protobuf.J.b(b2, h2);
                androidx.datastore.preferences.protobuf.j0.o(obj, M2, b2);
                h2 = b2;
            }
        }
        j2.getClass();
        androidx.datastore.preferences.protobuf.I i3 = (androidx.datastore.preferences.protobuf.I) h2;
        androidx.datastore.preferences.protobuf.G g2 = ((androidx.datastore.preferences.protobuf.H) obj2).f2233a;
        c0075k.w(2);
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = c0075k.f2330a;
        int e2 = abstractC0074j.e(abstractC0074j.v());
        java.lang.Object obj3 = "";
        H.k kVar = g2.f2232c;
        java.lang.Object obj4 = kVar;
        while (true) {
            try {
                int a2 = c0075k.a();
                if (a2 == Integer.MAX_VALUE || abstractC0074j.c()) {
                    break;
                }
                if (a2 == 1) {
                    obj3 = c0075k.i(g2.f2230a, null, null);
                } else if (a2 != 2) {
                    try {
                        if (!c0075k.x()) {
                            throw new androidx.datastore.preferences.protobuf.A("Unable to parse map entry.");
                        }
                    } catch (androidx.datastore.preferences.protobuf.C0089z unused) {
                        if (!c0075k.x()) {
                            throw new androidx.datastore.preferences.protobuf.A("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj4 = c0075k.i(g2.f2231b, kVar.getClass(), c0079o);
                }
            } catch (java.lang.Throwable th) {
                abstractC0074j.d(e2);
                throw th;
            }
        }
    }

    public final void t(int i2, java.lang.Object obj, java.lang.Object obj2) {
        if (n(i2, obj2)) {
            long M2 = M(i2) & 1048575;
            sun.misc.Unsafe unsafe = f2240o;
            java.lang.Object object = unsafe.getObject(obj2, M2);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + this.f2241a[i2] + " is present but null: " + obj2);
            }
            androidx.datastore.preferences.protobuf.W m2 = m(i2);
            if (!n(i2, obj)) {
                if (p(object)) {
                    androidx.datastore.preferences.protobuf.AbstractC0086w g2 = m2.g();
                    m2.c(g2, object);
                    unsafe.putObject(obj, M2, g2);
                } else {
                    unsafe.putObject(obj, M2, object);
                }
                H(i2, obj);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, M2);
            if (!p(object2)) {
                androidx.datastore.preferences.protobuf.AbstractC0086w g3 = m2.g();
                m2.c(g3, object2);
                unsafe.putObject(obj, M2, g3);
                object2 = g3;
            }
            m2.c(object2, object);
        }
    }

    public final void u(int i2, java.lang.Object obj, java.lang.Object obj2) {
        int[] iArr = this.f2241a;
        int i3 = iArr[i2];
        if (q(i3, i2, obj2)) {
            long M2 = M(i2) & 1048575;
            sun.misc.Unsafe unsafe = f2240o;
            java.lang.Object object = unsafe.getObject(obj2, M2);
            if (object == null) {
                throw new java.lang.IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
            }
            androidx.datastore.preferences.protobuf.W m2 = m(i2);
            if (!q(i3, i2, obj)) {
                if (p(object)) {
                    androidx.datastore.preferences.protobuf.AbstractC0086w g2 = m2.g();
                    m2.c(g2, object);
                    unsafe.putObject(obj, M2, g2);
                } else {
                    unsafe.putObject(obj, M2, object);
                }
                I(i3, i2, obj);
                return;
            }
            java.lang.Object object2 = unsafe.getObject(obj, M2);
            if (!p(object2)) {
                androidx.datastore.preferences.protobuf.AbstractC0086w g3 = m2.g();
                m2.c(g3, object2);
                unsafe.putObject(obj, M2, g3);
                object2 = g3;
            }
            m2.c(object2, object);
        }
    }

    public final java.lang.Object v(int i2, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.W m2 = m(i2);
        long M2 = M(i2) & 1048575;
        if (!n(i2, obj)) {
            return m2.g();
        }
        java.lang.Object object = f2240o.getObject(obj, M2);
        if (p(object)) {
            return object;
        }
        androidx.datastore.preferences.protobuf.AbstractC0086w g2 = m2.g();
        if (object != null) {
            m2.c(g2, object);
        }
        return g2;
    }

    public final java.lang.Object w(int i2, int i3, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.W m2 = m(i3);
        if (!q(i2, i3, obj)) {
            return m2.g();
        }
        java.lang.Object object = f2240o.getObject(obj, M(i3) & 1048575);
        if (p(object)) {
            return object;
        }
        androidx.datastore.preferences.protobuf.AbstractC0086w g2 = m2.g();
        if (object != null) {
            m2.c(g2, object);
        }
        return g2;
    }
}
