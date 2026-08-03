package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class i2 implements com.fyber.inneractive.sdk.protobuf.t2 {
    public static final int[] q = new int[0];
    public static final sun.misc.Unsafe r;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4197a;
    public final java.lang.Object[] b;
    public final int c;
    public final int d;
    public final com.fyber.inneractive.sdk.protobuf.d2 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final com.fyber.inneractive.sdk.protobuf.k2 l;
    public final com.fyber.inneractive.sdk.protobuf.t1 m;
    public final com.fyber.inneractive.sdk.protobuf.o3 n;
    public final com.fyber.inneractive.sdk.protobuf.j0 o;
    public final com.fyber.inneractive.sdk.protobuf.z1 p;

    static {
        sun.misc.Unsafe unsafe;
        try {
            unsafe = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.fyber.inneractive.sdk.protobuf.s3());
        } catch (java.lang.Throwable unused) {
            unsafe = null;
        }
        r = unsafe;
    }

    public i2(int[] iArr, java.lang.Object[] objArr, int i, int i2, com.fyber.inneractive.sdk.protobuf.d2 d2Var, boolean z, int[] iArr2, int i3, int i4, com.fyber.inneractive.sdk.protobuf.k2 k2Var, com.fyber.inneractive.sdk.protobuf.t1 t1Var, com.fyber.inneractive.sdk.protobuf.o3 o3Var, com.fyber.inneractive.sdk.protobuf.j0 j0Var, com.fyber.inneractive.sdk.protobuf.z1 z1Var) {
        this.f4197a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = d2Var instanceof com.fyber.inneractive.sdk.protobuf.z0;
        this.h = z;
        this.f = j0Var != null && (d2Var instanceof com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = k2Var;
        this.m = t1Var;
        this.n = o3Var;
        this.o = j0Var;
        this.e = d2Var;
        this.p = z1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.fyber.inneractive.sdk.protobuf.i2 a(com.fyber.inneractive.sdk.protobuf.r2 r2Var, com.fyber.inneractive.sdk.protobuf.k2 k2Var, com.fyber.inneractive.sdk.protobuf.t1 t1Var, com.fyber.inneractive.sdk.protobuf.o3 o3Var, com.fyber.inneractive.sdk.protobuf.j0 j0Var, com.fyber.inneractive.sdk.protobuf.z1 z1Var) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int charAt3;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr2;
        int i18;
        int objectFieldOffset;
        int i19;
        java.lang.String str;
        int i20;
        int i21;
        int i22;
        java.lang.reflect.Field a2;
        char charAt12;
        int i23;
        int i24;
        java.lang.Object obj;
        java.lang.reflect.Field a3;
        java.lang.Object obj2;
        java.lang.reflect.Field a4;
        int i25;
        char charAt13;
        int i26;
        char charAt14;
        int i27;
        char charAt15;
        int i28;
        char charAt16;
        if (!(r2Var instanceof com.fyber.inneractive.sdk.protobuf.r2)) {
            r2Var.getClass();
            throw new java.lang.ClassCastException();
        }
        int i29 = 0;
        boolean z = ((r2Var.d & 1) == 1 ? com.fyber.inneractive.sdk.protobuf.o2.PROTO2 : com.fyber.inneractive.sdk.protobuf.o2.PROTO3) == com.fyber.inneractive.sdk.protobuf.o2.PROTO3;
        java.lang.String str2 = r2Var.b;
        int length = str2.length();
        if (str2.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (str2.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt17 = str2.charAt(i);
        if (charAt17 >= 55296) {
            int i32 = charAt17 & 8191;
            int i33 = 13;
            while (true) {
                i28 = i31 + 1;
                charAt16 = str2.charAt(i31);
                if (charAt16 < 55296) {
                    break;
                }
                i32 |= (charAt16 & 8191) << i33;
                i33 += 13;
                i31 = i28;
            }
            charAt17 = i32 | (charAt16 << i33);
            i31 = i28;
        }
        if (charAt17 == 0) {
            i2 = i31;
            iArr = q;
            charAt = 0;
            i4 = 0;
            i5 = 0;
            charAt2 = 0;
            i3 = 0;
            charAt3 = 0;
        } else {
            int i34 = i31 + 1;
            charAt = str2.charAt(i31);
            if (charAt >= 55296) {
                int i35 = charAt & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    charAt11 = str2.charAt(i34);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i35 |= (charAt11 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                charAt = i35 | (charAt11 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int charAt18 = str2.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    charAt10 = str2.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                charAt18 = i38 | (charAt10 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            int charAt19 = str2.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    charAt9 = str2.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                charAt19 = i41 | (charAt9 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int charAt20 = str2.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    charAt8 = str2.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                charAt20 = i44 | (charAt8 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            charAt2 = str2.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    charAt7 = str2.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                charAt2 = i47 | (charAt7 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int charAt21 = str2.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    charAt6 = str2.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                charAt21 = i50 | (charAt6 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int charAt22 = str2.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    charAt5 = str2.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                charAt22 = i53 | (charAt5 << i54);
                i52 = i7;
            }
            i2 = i52 + 1;
            charAt3 = str2.charAt(i52);
            if (charAt3 >= 55296) {
                int i55 = charAt3 & 8191;
                int i56 = i2;
                int i57 = 13;
                while (true) {
                    i6 = i56 + 1;
                    charAt4 = str2.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i56 = i6;
                }
                charAt3 = i55 | (charAt4 << i57);
                i2 = i6;
            }
            int[] iArr3 = new int[charAt3 + charAt21 + charAt22];
            i3 = (charAt * 2) + charAt18;
            i4 = charAt21;
            iArr = iArr3;
            i29 = charAt19;
            i5 = charAt20;
        }
        sun.misc.Unsafe unsafe = r;
        java.lang.Object[] objArr = r2Var.c;
        java.lang.Class<?> cls = r2Var.f4215a.getClass();
        int[] iArr4 = new int[charAt2 * 3];
        java.lang.Object[] objArr2 = new java.lang.Object[charAt2 * 2];
        int i58 = charAt3 + i4;
        int i59 = charAt3;
        int i60 = i2;
        int i61 = i58;
        int i62 = 0;
        int i63 = 0;
        while (i60 < length) {
            int i64 = i60 + 1;
            int charAt23 = str2.charAt(i60);
            int i65 = length;
            if (charAt23 >= 55296) {
                int i66 = charAt23 & 8191;
                int i67 = i64;
                int i68 = 13;
                while (true) {
                    i27 = i67 + 1;
                    charAt15 = str2.charAt(i67);
                    i14 = charAt3;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i66 |= (charAt15 & 8191) << i68;
                    i68 += 13;
                    i67 = i27;
                    charAt3 = i14;
                }
                charAt23 = i66 | (charAt15 << i68);
                i15 = i27;
            } else {
                i14 = charAt3;
                i15 = i64;
            }
            int i69 = i15 + 1;
            int charAt24 = str2.charAt(i15);
            if (charAt24 >= 55296) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i26 = i71 + 1;
                    charAt14 = str2.charAt(i71);
                    i16 = i5;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i26;
                    i5 = i16;
                }
                charAt24 = i70 | (charAt14 << i72);
                i17 = i26;
            } else {
                i16 = i5;
                i17 = i69;
            }
            int i73 = charAt24 & 255;
            int i74 = i29;
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i63;
                i62++;
            }
            if (i73 >= 51) {
                int i75 = i17 + 1;
                int charAt25 = str2.charAt(i17);
                char c = 55296;
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = 13;
                    while (true) {
                        i25 = i75 + 1;
                        charAt13 = str2.charAt(i75);
                        if (charAt13 < c) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i77;
                        i77 += 13;
                        i75 = i25;
                        c = 55296;
                    }
                    charAt25 = i76 | (charAt13 << i77);
                    i75 = i25;
                }
                int i78 = i73 - 51;
                int i79 = i75;
                if (i78 == 9 || i78 == 17) {
                    i24 = i3 + 1;
                    objArr2[((i63 / 3) * 2) + 1] = objArr[i3];
                } else {
                    if (i78 == 12 && !z) {
                        i24 = i3 + 1;
                        objArr2[((i63 / 3) * 2) + 1] = objArr[i3];
                    }
                    int i80 = charAt25 * 2;
                    obj = objArr[i80];
                    if (obj instanceof java.lang.reflect.Field) {
                        a3 = a((java.lang.Class) cls, (java.lang.String) obj);
                        objArr[i80] = a3;
                    } else {
                        a3 = (java.lang.reflect.Field) obj;
                    }
                    iArr2 = iArr4;
                    i18 = charAt23;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(a3);
                    int i81 = i80 + 1;
                    obj2 = objArr[i81];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        a4 = a((java.lang.Class) cls, (java.lang.String) obj2);
                        objArr[i81] = a4;
                    } else {
                        a4 = (java.lang.reflect.Field) obj2;
                    }
                    str = str2;
                    i20 = (int) unsafe.objectFieldOffset(a4);
                    i19 = i3;
                    i17 = i79;
                    i21 = 0;
                    objectFieldOffset = objectFieldOffset2;
                }
                i3 = i24;
                int i802 = charAt25 * 2;
                obj = objArr[i802];
                if (obj instanceof java.lang.reflect.Field) {
                }
                iArr2 = iArr4;
                i18 = charAt23;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(a3);
                int i812 = i802 + 1;
                obj2 = objArr[i812];
                if (obj2 instanceof java.lang.reflect.Field) {
                }
                str = str2;
                i20 = (int) unsafe.objectFieldOffset(a4);
                i19 = i3;
                i17 = i79;
                i21 = 0;
                objectFieldOffset = objectFieldOffset22;
            } else {
                iArr2 = iArr4;
                i18 = charAt23;
                int i82 = i3 + 1;
                java.lang.reflect.Field a5 = a((java.lang.Class) cls, (java.lang.String) objArr[i3]);
                if (i73 == 9 || i73 == 17) {
                    objArr2[((i63 / 3) * 2) + 1] = a5.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i23 = i3 + 2;
                        objArr2[((i63 / 3) * 2) + 1] = objArr[i82];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            i23 = i3 + 2;
                            objArr2[((i63 / 3) * 2) + 1] = objArr[i82];
                        }
                    } else if (i73 == 50) {
                        int i83 = i59 + 1;
                        iArr[i59] = i63;
                        int i84 = (i63 / 3) * 2;
                        int i85 = i3 + 2;
                        objArr2[i84] = objArr[i82];
                        if ((charAt24 & 2048) != 0) {
                            i82 = i3 + 3;
                            objArr2[i84 + 1] = objArr[i85];
                            i59 = i83;
                        } else {
                            i59 = i83;
                            i82 = i85;
                        }
                    }
                    i82 = i23;
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(a5);
                if ((charAt24 & 4096) != 4096 || i73 > 17) {
                    i19 = i82;
                    str = str2;
                    i20 = 1048575;
                    i21 = 0;
                } else {
                    int i86 = i17 + 1;
                    int charAt26 = str2.charAt(i17);
                    if (charAt26 >= 55296) {
                        int i87 = charAt26 & 8191;
                        int i88 = 13;
                        while (true) {
                            i22 = i86 + 1;
                            charAt12 = str2.charAt(i86);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i87 |= (charAt12 & 8191) << i88;
                            i88 += 13;
                            i86 = i22;
                        }
                        charAt26 = i87 | (charAt12 << i88);
                    } else {
                        i22 = i86;
                    }
                    int i89 = (charAt26 / 32) + (charAt * 2);
                    java.lang.Object obj3 = objArr[i89];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        a2 = (java.lang.reflect.Field) obj3;
                    } else {
                        a2 = a((java.lang.Class) cls, (java.lang.String) obj3);
                        objArr[i89] = a2;
                    }
                    i19 = i82;
                    str = str2;
                    i20 = (int) unsafe.objectFieldOffset(a2);
                    i21 = charAt26 % 32;
                    i17 = i22;
                }
                if (i73 >= 18 && i73 <= 49) {
                    iArr[i61] = objectFieldOffset;
                    i61++;
                }
            }
            int i90 = i63 + 1;
            iArr2[i63] = i18;
            int i91 = i63 + 2;
            iArr2[i90] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i73 << 20) | objectFieldOffset;
            i63 += 3;
            iArr2[i91] = (i21 << 20) | i20;
            iArr4 = iArr2;
            i60 = i17;
            str2 = str;
            i29 = i74;
            length = i65;
            charAt3 = i14;
            i5 = i16;
            i3 = i19;
        }
        return new com.fyber.inneractive.sdk.protobuf.i2(iArr4, objArr2, i29, i5, r2Var.f4215a, z, iArr, charAt3, i58, k2Var, t1Var, o3Var, j0Var, z1Var);
    }

    public static long d(int i) {
        return i & 1048575;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        boolean a2;
        int length = this.f4197a.length;
        for (int i = 0; i < length; i += 3) {
            int[] iArr = this.f4197a;
            int i2 = iArr[i + 1];
            long j = i2 & 1048575;
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    if (a(i, obj, obj2)) {
                        com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
                        if (java.lang.Double.doubleToLongBits(w3Var.c(obj, j)) == java.lang.Double.doubleToLongBits(w3Var.c(obj2, j))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (a(i, obj, obj2)) {
                        com.fyber.inneractive.sdk.protobuf.w3 w3Var2 = com.fyber.inneractive.sdk.protobuf.x3.c;
                        if (java.lang.Float.floatToIntBits(w3Var2.d(obj, j)) == java.lang.Float.floatToIntBits(w3Var2.d(obj2, j))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.d(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.d(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.c(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.d(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.c(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (a(i, obj, obj2)) {
                        com.fyber.inneractive.sdk.protobuf.w3 w3Var3 = com.fyber.inneractive.sdk.protobuf.x3.c;
                        if (w3Var3.a(obj, j) == w3Var3.a(obj2, j)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, j), com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, j), com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, j), com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.c(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.c(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.c(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.d(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.c(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.x3.d(obj, j) == com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (a(i, obj, obj2) && com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, j), com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j))) {
                        continue;
                    }
                    return false;
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
                    a2 = com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, j), com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j));
                    break;
                case 50:
                    a2 = com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, j), com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j));
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
                    if (com.fyber.inneractive.sdk.protobuf.x3.c(obj, j2) == com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j2) && com.fyber.inneractive.sdk.protobuf.u2.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, j), com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!a2) {
                return false;
            }
        }
        this.n.getClass();
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields;
        this.n.getClass();
        if (!n3Var.equals(((com.fyber.inneractive.sdk.protobuf.z0) obj2).unknownFields)) {
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.o.getClass();
        com.fyber.inneractive.sdk.protobuf.n0 n0Var = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions;
        this.o.getClass();
        return n0Var.equals(((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj2).extensions);
    }

    public final com.fyber.inneractive.sdk.protobuf.t2 c(int i) {
        int i2 = (i / 3) * 2;
        java.lang.Object[] objArr = this.b;
        com.fyber.inneractive.sdk.protobuf.t2 t2Var = (com.fyber.inneractive.sdk.protobuf.t2) objArr[i2];
        if (t2Var != null) {
            return t2Var;
        }
        com.fyber.inneractive.sdk.protobuf.t2 a2 = com.fyber.inneractive.sdk.protobuf.p2.c.a((java.lang.Class) objArr[i2 + 1]);
        this.b[i2] = a2;
        return a2;
    }

    public final void e(int i, java.lang.Object obj, java.lang.Object obj2) {
        int[] iArr = this.f4197a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j = i2 & 1048575;
        if (a(obj2, i3, i)) {
            java.lang.Object e = a(obj, i3, i) ? com.fyber.inneractive.sdk.protobuf.x3.e(obj, j) : null;
            java.lang.Object e2 = com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j);
            if (e != null && e2 != null) {
                com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, com.fyber.inneractive.sdk.protobuf.l1.a(e, e2));
                b(obj, i3, i);
            } else if (e2 != null) {
                com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, e2);
                b(obj, i3, i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0225, code lost:
    
        if (r3 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        if (r3 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0228, code lost:
    
        r7 = 1237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022a, code lost:
    
        r7 = r7 + r2;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(java.lang.Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int length = this.f4197a.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int[] iArr = this.f4197a;
            int i7 = iArr[i6 + 1];
            int i8 = iArr[i6];
            long j = 1048575 & i7;
            int i9 = 1231;
            int i10 = 37;
            switch ((i7 & 267386880) >>> 20) {
                case 0:
                    i = i5 * 53;
                    doubleToLongBits = java.lang.Double.doubleToLongBits(com.fyber.inneractive.sdk.protobuf.x3.c.c(obj, j));
                    java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 1:
                    i2 = i5 * 53;
                    floatToIntBits = java.lang.Float.floatToIntBits(com.fyber.inneractive.sdk.protobuf.x3.c.d(obj, j));
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 2:
                    i = i5 * 53;
                    doubleToLongBits = com.fyber.inneractive.sdk.protobuf.x3.d(obj, j);
                    java.nio.charset.Charset charset2 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 3:
                    i = i5 * 53;
                    doubleToLongBits = com.fyber.inneractive.sdk.protobuf.x3.d(obj, j);
                    java.nio.charset.Charset charset3 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 4:
                    i2 = i5 * 53;
                    floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 5:
                    i = i5 * 53;
                    doubleToLongBits = com.fyber.inneractive.sdk.protobuf.x3.d(obj, j);
                    java.nio.charset.Charset charset4 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 6:
                    i2 = i5 * 53;
                    floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 7:
                    i3 = i5 * 53;
                    boolean a2 = com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, j);
                    java.nio.charset.Charset charset5 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                    break;
                case 8:
                    i2 = i5 * 53;
                    floatToIntBits = ((java.lang.String) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 9:
                    java.lang.Object e = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                    if (e != null) {
                        i10 = e.hashCode();
                    }
                    floatToIntBits = i5 * 53;
                    i2 = i10;
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 10:
                    i2 = i5 * 53;
                    floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 11:
                    i2 = i5 * 53;
                    floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 12:
                    i2 = i5 * 53;
                    floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 13:
                    i2 = i5 * 53;
                    floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 14:
                    i = i5 * 53;
                    doubleToLongBits = com.fyber.inneractive.sdk.protobuf.x3.d(obj, j);
                    java.nio.charset.Charset charset6 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 15:
                    i2 = i5 * 53;
                    floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 16:
                    i = i5 * 53;
                    doubleToLongBits = com.fyber.inneractive.sdk.protobuf.x3.d(obj, j);
                    java.nio.charset.Charset charset7 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    i5 = i4;
                    break;
                case 17:
                    java.lang.Object e2 = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                    if (e2 != null) {
                        i10 = e2.hashCode();
                    }
                    floatToIntBits = i5 * 53;
                    i2 = i10;
                    i4 = floatToIntBits + i2;
                    i5 = i4;
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
                    i2 = i5 * 53;
                    floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 50:
                    i2 = i5 * 53;
                    floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    i5 = i4;
                    break;
                case 51:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = java.lang.Double.doubleToLongBits(((java.lang.Double) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).doubleValue());
                        java.nio.charset.Charset charset8 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = java.lang.Float.floatToIntBits(((java.lang.Float) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).floatValue());
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue();
                        java.nio.charset.Charset charset9 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue();
                        java.nio.charset.Charset charset10 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue();
                        java.nio.charset.Charset charset11 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a(obj, i8, i6)) {
                        i3 = i5 * 53;
                        boolean booleanValue = ((java.lang.Boolean) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).booleanValue();
                        java.nio.charset.Charset charset12 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((java.lang.String) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue();
                        java.nio.charset.Charset charset13 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a(obj, i8, i6)) {
                        i = i5 * 53;
                        doubleToLongBits = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue();
                        java.nio.charset.Charset charset14 = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a(obj, i8, i6)) {
                        i2 = i5 * 53;
                        floatToIntBits = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        i5 = i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.n.getClass();
        int hashCode = ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.hashCode() + (i5 * 53);
        if (!this.f) {
            return hashCode;
        }
        this.o.getClass();
        return (hashCode * 53) + ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions.f4206a.hashCode();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void c(java.lang.Object obj) {
        int i;
        int i2 = this.j;
        while (true) {
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long j = this.f4197a[this.i[i2] + 1] & 1048575;
            java.lang.Object e = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
            if (e != null) {
                this.p.getClass();
                ((com.fyber.inneractive.sdk.protobuf.y1) e).f4231a = false;
                com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, e);
            }
            i2++;
        }
        int length = this.i.length;
        while (i < length) {
            this.m.a(obj, this.i[i]);
            i++;
        }
        this.n.getClass();
        ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.e = false;
        if (this.f) {
            this.o.getClass();
            ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions.e();
        }
    }

    public final void c(int i, java.lang.Object obj, java.lang.Object obj2) {
        long j = this.f4197a[i + 1] & 1048575;
        java.lang.Object e = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
        if (e != null) {
            this.p.getClass();
            if (!((com.fyber.inneractive.sdk.protobuf.y1) e).f4231a) {
                this.p.getClass();
                com.fyber.inneractive.sdk.protobuf.y1 y1Var = com.fyber.inneractive.sdk.protobuf.y1.b;
                com.fyber.inneractive.sdk.protobuf.y1 y1Var2 = y1Var.isEmpty() ? new com.fyber.inneractive.sdk.protobuf.y1() : new com.fyber.inneractive.sdk.protobuf.y1(y1Var);
                this.p.getClass();
                com.fyber.inneractive.sdk.protobuf.z1.a(y1Var2, e);
                com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, y1Var2);
                e = y1Var2;
            }
        } else {
            this.p.getClass();
            com.fyber.inneractive.sdk.protobuf.y1 y1Var3 = com.fyber.inneractive.sdk.protobuf.y1.b;
            e = y1Var3.isEmpty() ? new com.fyber.inneractive.sdk.protobuf.y1() : new com.fyber.inneractive.sdk.protobuf.y1(y1Var3);
            com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, e);
        }
        this.p.getClass();
        this.p.getClass();
        obj2.getClass();
        throw new java.lang.ClassCastException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final int b(java.lang.Object obj) {
        int i;
        int i2;
        int a2;
        int b;
        int a3;
        int b2;
        int c;
        int b3;
        int a4;
        int b4;
        int b5;
        int a5;
        int b6;
        int a6;
        int a7;
        int b7;
        int c2;
        int b8;
        int a8;
        int b9;
        int i3 = 267386880;
        int i4 = 1048575;
        if (this.h) {
            sun.misc.Unsafe unsafe = r;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr = this.f4197a;
                if (i5 < iArr.length) {
                    int i7 = iArr[i5 + 1];
                    int i8 = (i7 & 267386880) >>> 20;
                    int i9 = iArr[i5];
                    long j = i7 & i4;
                    if (i8 >= com.fyber.inneractive.sdk.protobuf.FieldType.DOUBLE_LIST_PACKED.id() && i8 <= com.fyber.inneractive.sdk.protobuf.FieldType.SINT64_LIST_PACKED.id()) {
                        int i10 = this.f4197a[i5 + 2];
                    }
                    switch (i8) {
                        case 0:
                            if (a(i5, obj)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 8, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 1:
                            if (a(i5, obj)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 4, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 2:
                            if (a(i5, obj)) {
                                long d = com.fyber.inneractive.sdk.protobuf.x3.d(obj, j);
                                b6 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a6 = com.fyber.inneractive.sdk.protobuf.b0.a(d);
                                a7 = a6 + b6;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 3:
                            if (a(i5, obj)) {
                                a7 = com.fyber.inneractive.sdk.protobuf.b0.a(com.fyber.inneractive.sdk.protobuf.x3.d(obj, j)) + com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 4:
                            if (a(i5, obj)) {
                                int c3 = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                                b7 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                if (c3 >= 0) {
                                    c2 = com.fyber.inneractive.sdk.protobuf.b0.c(c3);
                                    a7 = c2 + b7;
                                    a5 = a7 + i6;
                                    i6 = a5;
                                    i5 += 3;
                                    i4 = 1048575;
                                }
                                c2 = 10;
                                a7 = c2 + b7;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 5:
                            if (a(i5, obj)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 8, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 6:
                            if (a(i5, obj)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 4, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 7:
                            if (a(i5, obj)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 1, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 8:
                            if (a(i5, obj)) {
                                java.lang.Object e = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                                if (e instanceof com.fyber.inneractive.sdk.protobuf.s) {
                                    b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                    a8 = com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) e);
                                } else {
                                    b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                    a8 = com.fyber.inneractive.sdk.protobuf.b0.a((java.lang.String) e);
                                }
                                a7 = a8 + b8;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 9:
                            if (a(i5, obj)) {
                                java.lang.Object e2 = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                                com.fyber.inneractive.sdk.protobuf.t2 c4 = c(i5);
                                java.lang.Class cls = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                                int b10 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                int serializedSize = ((com.fyber.inneractive.sdk.protobuf.b) ((com.fyber.inneractive.sdk.protobuf.d2) e2)).getSerializedSize(c4);
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(serializedSize, serializedSize, b10, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 10:
                            if (a(i5, obj)) {
                                com.fyber.inneractive.sdk.protobuf.s sVar = (com.fyber.inneractive.sdk.protobuf.s) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                                b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a8 = com.fyber.inneractive.sdk.protobuf.b0.a(sVar);
                                a7 = a8 + b8;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 11:
                            if (a(i5, obj)) {
                                int c5 = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                                b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a8 = com.fyber.inneractive.sdk.protobuf.b0.c(c5);
                                a7 = a8 + b8;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 12:
                            if (a(i5, obj)) {
                                int c6 = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                                b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a8 = com.fyber.inneractive.sdk.protobuf.b0.a(c6);
                                a7 = a8 + b8;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 13:
                            if (a(i5, obj)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 4, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 14:
                            if (a(i5, obj)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 8, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 15:
                            if (a(i5, obj)) {
                                int c7 = com.fyber.inneractive.sdk.protobuf.x3.c(obj, j);
                                b6 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a6 = com.fyber.inneractive.sdk.protobuf.b0.c(com.fyber.inneractive.sdk.protobuf.b0.d(c7));
                                a7 = a6 + b6;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 16:
                            if (a(i5, obj)) {
                                long d2 = com.fyber.inneractive.sdk.protobuf.x3.d(obj, j);
                                b6 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a6 = com.fyber.inneractive.sdk.protobuf.b0.a(com.fyber.inneractive.sdk.protobuf.b0.b(d2));
                                a7 = a6 + b6;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 17:
                            if (a(i5, obj)) {
                                com.fyber.inneractive.sdk.protobuf.d2 d2Var = (com.fyber.inneractive.sdk.protobuf.d2) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                                com.fyber.inneractive.sdk.protobuf.t2 c8 = c(i5);
                                b6 = com.fyber.inneractive.sdk.protobuf.b0.b(i9) * 2;
                                a6 = ((com.fyber.inneractive.sdk.protobuf.b) d2Var).getSerializedSize(c8);
                                a7 = a6 + b6;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 18:
                            a7 = com.fyber.inneractive.sdk.protobuf.u2.b(i9, (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j));
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 19:
                            a7 = com.fyber.inneractive.sdk.protobuf.u2.a(i9, (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j));
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 20:
                            java.util.List list = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Class cls2 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            if (list.size() != 0) {
                                a7 = com.fyber.inneractive.sdk.protobuf.h2.a(i9, list.size(), com.fyber.inneractive.sdk.protobuf.u2.c(list));
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a7 = 0;
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 21:
                            java.util.List list2 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Class cls3 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size = list2.size();
                            if (size != 0) {
                                a7 = com.fyber.inneractive.sdk.protobuf.h2.a(i9, size, com.fyber.inneractive.sdk.protobuf.u2.g(list2));
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a7 = 0;
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 22:
                            java.util.List list3 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Class cls4 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size2 = list3.size();
                            if (size2 != 0) {
                                a7 = com.fyber.inneractive.sdk.protobuf.h2.a(i9, size2, com.fyber.inneractive.sdk.protobuf.u2.b(list3));
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a7 = 0;
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 23:
                            a7 = com.fyber.inneractive.sdk.protobuf.u2.b(i9, (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j));
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 24:
                            a7 = com.fyber.inneractive.sdk.protobuf.u2.a(i9, (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j));
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 25:
                            java.util.List list4 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Class cls5 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size3 = list4.size();
                            i6 = (size3 == 0 ? 0 : (com.fyber.inneractive.sdk.protobuf.b0.b(i9) + 1) * size3) + i6;
                            i5 += 3;
                            i4 = 1048575;
                        case 26:
                            a7 = com.fyber.inneractive.sdk.protobuf.u2.c(i9, (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j));
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 27:
                            java.util.List list5 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            com.fyber.inneractive.sdk.protobuf.t2 c9 = c(i5);
                            java.lang.Class cls6 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size4 = list5.size();
                            if (size4 != 0) {
                                b9 = com.fyber.inneractive.sdk.protobuf.b0.b(i9) * size4;
                                for (int i11 = 0; i11 < size4; i11++) {
                                    int serializedSize2 = ((com.fyber.inneractive.sdk.protobuf.b) ((com.fyber.inneractive.sdk.protobuf.d2) list5.get(i11))).getSerializedSize(c9);
                                    b9 = com.fyber.inneractive.sdk.protobuf.b0.c(serializedSize2) + serializedSize2 + b9;
                                }
                                i6 = b9 + i6;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            b9 = 0;
                            i6 = b9 + i6;
                            i5 += 3;
                            i4 = 1048575;
                        case 28:
                            java.util.List list6 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Class cls7 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size5 = list6.size();
                            if (size5 != 0) {
                                b9 = com.fyber.inneractive.sdk.protobuf.b0.b(i9) * size5;
                                for (int i12 = 0; i12 < list6.size(); i12++) {
                                    b9 = com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) list6.get(i12)) + b9;
                                }
                                i6 = b9 + i6;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            b9 = 0;
                            i6 = b9 + i6;
                            i5 += 3;
                            i4 = 1048575;
                        case 29:
                            java.util.List list7 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Class cls8 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size6 = list7.size();
                            if (size6 != 0) {
                                a7 = com.fyber.inneractive.sdk.protobuf.h2.a(i9, size6, com.fyber.inneractive.sdk.protobuf.u2.f(list7));
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a7 = 0;
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 30:
                            java.util.List list8 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Class cls9 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size7 = list8.size();
                            if (size7 != 0) {
                                a7 = com.fyber.inneractive.sdk.protobuf.h2.a(i9, size7, com.fyber.inneractive.sdk.protobuf.u2.a(list8));
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a7 = 0;
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 31:
                            a7 = com.fyber.inneractive.sdk.protobuf.u2.a(i9, (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j));
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 32:
                            a7 = com.fyber.inneractive.sdk.protobuf.u2.b(i9, (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j));
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 33:
                            java.util.List list9 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Class cls10 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size8 = list9.size();
                            if (size8 != 0) {
                                a7 = com.fyber.inneractive.sdk.protobuf.h2.a(i9, size8, com.fyber.inneractive.sdk.protobuf.u2.d(list9));
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a7 = 0;
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 34:
                            java.util.List list10 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Class cls11 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size9 = list10.size();
                            if (size9 != 0) {
                                a7 = com.fyber.inneractive.sdk.protobuf.h2.a(i9, size9, com.fyber.inneractive.sdk.protobuf.u2.e(list10));
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            a7 = 0;
                            a5 = a7 + i6;
                            i6 = a5;
                            i5 += 3;
                            i4 = 1048575;
                        case 35:
                            java.util.List list11 = (java.util.List) unsafe.getObject(obj, j);
                            java.lang.Class cls12 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size10 = list11.size() * 8;
                            if (size10 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(size10, com.fyber.inneractive.sdk.protobuf.b0.b(i9), size10, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 36:
                            java.util.List list12 = (java.util.List) unsafe.getObject(obj, j);
                            java.lang.Class cls13 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size11 = list12.size() * 4;
                            if (size11 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(size11, com.fyber.inneractive.sdk.protobuf.b0.b(i9), size11, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 37:
                            int c10 = com.fyber.inneractive.sdk.protobuf.u2.c((java.util.List) unsafe.getObject(obj, j));
                            if (c10 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(c10, com.fyber.inneractive.sdk.protobuf.b0.b(i9), c10, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 38:
                            int g = com.fyber.inneractive.sdk.protobuf.u2.g((java.util.List) unsafe.getObject(obj, j));
                            if (g > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(g, com.fyber.inneractive.sdk.protobuf.b0.b(i9), g, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 39:
                            int b11 = com.fyber.inneractive.sdk.protobuf.u2.b((java.util.List) unsafe.getObject(obj, j));
                            if (b11 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(b11, com.fyber.inneractive.sdk.protobuf.b0.b(i9), b11, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 40:
                            java.util.List list13 = (java.util.List) unsafe.getObject(obj, j);
                            java.lang.Class cls14 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size12 = list13.size() * 8;
                            if (size12 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(size12, com.fyber.inneractive.sdk.protobuf.b0.b(i9), size12, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 41:
                            java.util.List list14 = (java.util.List) unsafe.getObject(obj, j);
                            java.lang.Class cls15 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size13 = list14.size() * 4;
                            if (size13 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(size13, com.fyber.inneractive.sdk.protobuf.b0.b(i9), size13, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 42:
                            java.util.List list15 = (java.util.List) unsafe.getObject(obj, j);
                            java.lang.Class cls16 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size14 = list15.size();
                            if (size14 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(size14, com.fyber.inneractive.sdk.protobuf.b0.b(i9), size14, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 43:
                            int f = com.fyber.inneractive.sdk.protobuf.u2.f((java.util.List) unsafe.getObject(obj, j));
                            if (f > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(f, com.fyber.inneractive.sdk.protobuf.b0.b(i9), f, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 44:
                            int a9 = com.fyber.inneractive.sdk.protobuf.u2.a((java.util.List) unsafe.getObject(obj, j));
                            if (a9 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(a9, com.fyber.inneractive.sdk.protobuf.b0.b(i9), a9, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 45:
                            java.util.List list16 = (java.util.List) unsafe.getObject(obj, j);
                            java.lang.Class cls17 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size15 = list16.size() * 4;
                            if (size15 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(size15, com.fyber.inneractive.sdk.protobuf.b0.b(i9), size15, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 46:
                            java.util.List list17 = (java.util.List) unsafe.getObject(obj, j);
                            java.lang.Class cls18 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size16 = list17.size() * 8;
                            if (size16 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(size16, com.fyber.inneractive.sdk.protobuf.b0.b(i9), size16, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 47:
                            int d3 = com.fyber.inneractive.sdk.protobuf.u2.d((java.util.List) unsafe.getObject(obj, j));
                            if (d3 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(d3, com.fyber.inneractive.sdk.protobuf.b0.b(i9), d3, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 48:
                            int e3 = com.fyber.inneractive.sdk.protobuf.u2.e((java.util.List) unsafe.getObject(obj, j));
                            if (e3 > 0) {
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(e3, com.fyber.inneractive.sdk.protobuf.b0.b(i9), e3, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 49:
                            java.util.List list18 = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            com.fyber.inneractive.sdk.protobuf.t2 c11 = c(i5);
                            java.lang.Class cls19 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size17 = list18.size();
                            if (size17 != 0) {
                                b9 = 0;
                                for (int i13 = 0; i13 < size17; i13++) {
                                    b9 = ((com.fyber.inneractive.sdk.protobuf.b) ((com.fyber.inneractive.sdk.protobuf.d2) list18.get(i13))).getSerializedSize(c11) + (com.fyber.inneractive.sdk.protobuf.b0.b(i9) * 2) + b9;
                                }
                                i6 = b9 + i6;
                                i5 += 3;
                                i4 = 1048575;
                            }
                            b9 = 0;
                            i6 = b9 + i6;
                            i5 += 3;
                            i4 = 1048575;
                        case 50:
                            com.fyber.inneractive.sdk.protobuf.z1 z1Var = this.p;
                            java.lang.Object e4 = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                            java.lang.Object b12 = b(i5);
                            z1Var.getClass();
                            com.fyber.inneractive.sdk.protobuf.y1 y1Var = (com.fyber.inneractive.sdk.protobuf.y1) e4;
                            if (b12 == null) {
                                if (y1Var.isEmpty()) {
                                    continue;
                                } else {
                                    java.util.Iterator it = y1Var.entrySet().iterator();
                                    if (it.hasNext()) {
                                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                        entry.getKey();
                                        entry.getValue();
                                        throw null;
                                    }
                                }
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                throw new java.lang.ClassCastException();
                            }
                        case 51:
                            if (a(obj, i9, i5)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 8, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 52:
                            if (a(obj, i9, i5)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 4, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 53:
                            if (a(obj, i9, i5)) {
                                long longValue = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue();
                                b6 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a6 = com.fyber.inneractive.sdk.protobuf.b0.a(longValue);
                                a7 = a6 + b6;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 54:
                            if (a(obj, i9, i5)) {
                                long longValue2 = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue();
                                b6 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a6 = com.fyber.inneractive.sdk.protobuf.b0.a(longValue2);
                                a7 = a6 + b6;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 55:
                            if (a(obj, i9, i5)) {
                                int intValue = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                                b7 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                if (intValue >= 0) {
                                    c2 = com.fyber.inneractive.sdk.protobuf.b0.c(intValue);
                                    a7 = c2 + b7;
                                    a5 = a7 + i6;
                                    i6 = a5;
                                    i5 += 3;
                                    i4 = 1048575;
                                }
                                c2 = 10;
                                a7 = c2 + b7;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 56:
                            if (a(obj, i9, i5)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 8, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 57:
                            if (a(obj, i9, i5)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 4, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 58:
                            if (a(obj, i9, i5)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 1, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 59:
                            if (a(obj, i9, i5)) {
                                java.lang.Object e5 = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                                if (e5 instanceof com.fyber.inneractive.sdk.protobuf.s) {
                                    b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                    a8 = com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) e5);
                                } else {
                                    b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                    a8 = com.fyber.inneractive.sdk.protobuf.b0.a((java.lang.String) e5);
                                }
                                a7 = a8 + b8;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 60:
                            if (a(obj, i9, i5)) {
                                java.lang.Object e6 = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                                com.fyber.inneractive.sdk.protobuf.t2 c12 = c(i5);
                                java.lang.Class cls20 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                                int b13 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                int serializedSize3 = ((com.fyber.inneractive.sdk.protobuf.b) ((com.fyber.inneractive.sdk.protobuf.d2) e6)).getSerializedSize(c12);
                                a5 = com.fyber.inneractive.sdk.protobuf.l0.a(serializedSize3, serializedSize3, b13, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 61:
                            if (a(obj, i9, i5)) {
                                com.fyber.inneractive.sdk.protobuf.s sVar2 = (com.fyber.inneractive.sdk.protobuf.s) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                                b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a8 = com.fyber.inneractive.sdk.protobuf.b0.a(sVar2);
                                a7 = a8 + b8;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 62:
                            if (a(obj, i9, i5)) {
                                int intValue2 = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                                b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a8 = com.fyber.inneractive.sdk.protobuf.b0.c(intValue2);
                                a7 = a8 + b8;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 63:
                            if (a(obj, i9, i5)) {
                                int intValue3 = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                                b8 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a8 = com.fyber.inneractive.sdk.protobuf.b0.a(intValue3);
                                a7 = a8 + b8;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 64:
                            if (a(obj, i9, i5)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 4, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 65:
                            if (a(obj, i9, i5)) {
                                a5 = com.fyber.inneractive.sdk.protobuf.g2.a(i9, 8, i6);
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 66:
                            if (a(obj, i9, i5)) {
                                int intValue4 = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue();
                                b6 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a6 = com.fyber.inneractive.sdk.protobuf.b0.c(com.fyber.inneractive.sdk.protobuf.b0.d(intValue4));
                                a7 = a6 + b6;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 67:
                            if (a(obj, i9, i5)) {
                                long longValue3 = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue();
                                b6 = com.fyber.inneractive.sdk.protobuf.b0.b(i9);
                                a6 = com.fyber.inneractive.sdk.protobuf.b0.a(com.fyber.inneractive.sdk.protobuf.b0.b(longValue3));
                                a7 = a6 + b6;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        case 68:
                            if (a(obj, i9, i5)) {
                                com.fyber.inneractive.sdk.protobuf.d2 d2Var2 = (com.fyber.inneractive.sdk.protobuf.d2) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                                com.fyber.inneractive.sdk.protobuf.t2 c13 = c(i5);
                                b6 = com.fyber.inneractive.sdk.protobuf.b0.b(i9) * 2;
                                a6 = ((com.fyber.inneractive.sdk.protobuf.b) d2Var2).getSerializedSize(c13);
                                a7 = a6 + b6;
                                a5 = a7 + i6;
                                i6 = a5;
                                i5 += 3;
                                i4 = 1048575;
                            } else {
                                i5 += 3;
                                i4 = 1048575;
                            }
                        default:
                            i5 += 3;
                            i4 = 1048575;
                    }
                } else {
                    this.n.getClass();
                    return ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.a() + i6;
                }
            }
        } else {
            sun.misc.Unsafe unsafe2 = r;
            int i14 = 0;
            int i15 = 0;
            int i16 = 1048575;
            int i17 = 0;
            while (true) {
                int[] iArr2 = this.f4197a;
                if (i14 < iArr2.length) {
                    int i18 = iArr2[i14 + 1];
                    int i19 = iArr2[i14];
                    int i20 = (i18 & i3) >>> 20;
                    if (i20 <= 17) {
                        int i21 = iArr2[i14 + 2];
                        i = 1048575;
                        int i22 = i21 & 1048575;
                        i2 = 1 << (i21 >>> 20);
                        if (i22 != i16) {
                            i17 = unsafe2.getInt(obj, i22);
                            i16 = i22;
                        }
                    } else {
                        i = 1048575;
                        i2 = 0;
                    }
                    long j2 = i18 & i;
                    switch (i20) {
                        case 0:
                            if ((i17 & i2) != 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 8, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 1:
                            if ((i17 & i2) != 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 4, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 2:
                            if ((i17 & i2) != 0) {
                                long j3 = unsafe2.getLong(obj, j2);
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a3 = com.fyber.inneractive.sdk.protobuf.b0.a(j3);
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 3:
                            if ((i17 & i2) != 0) {
                                long j4 = unsafe2.getLong(obj, j2);
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a3 = com.fyber.inneractive.sdk.protobuf.b0.a(j4);
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 4:
                            if ((i17 & i2) != 0) {
                                int i23 = unsafe2.getInt(obj, j2);
                                b2 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                if (i23 >= 0) {
                                    c = com.fyber.inneractive.sdk.protobuf.b0.c(i23);
                                    b4 = c + b2;
                                    a2 = b4 + i15;
                                    i15 = a2;
                                    i14 += 3;
                                    i3 = 267386880;
                                }
                                c = 10;
                                b4 = c + b2;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 5:
                            if ((i17 & i2) != 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 8, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 6:
                            if ((i17 & i2) != 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 4, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 7:
                            if ((i17 & i2) != 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 1, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 8:
                            if ((i17 & i2) != 0) {
                                java.lang.Object object = unsafe2.getObject(obj, j2);
                                if (object instanceof com.fyber.inneractive.sdk.protobuf.s) {
                                    b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                    a4 = com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) object);
                                } else {
                                    b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                    a4 = com.fyber.inneractive.sdk.protobuf.b0.a((java.lang.String) object);
                                }
                                b4 = a4 + b3;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 9:
                            if ((i17 & i2) != 0) {
                                java.lang.Object object2 = unsafe2.getObject(obj, j2);
                                com.fyber.inneractive.sdk.protobuf.t2 c14 = c(i14);
                                java.lang.Class cls21 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                                int b14 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                int serializedSize4 = ((com.fyber.inneractive.sdk.protobuf.b) ((com.fyber.inneractive.sdk.protobuf.d2) object2)).getSerializedSize(c14);
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(serializedSize4, serializedSize4, b14, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 10:
                            if ((i17 & i2) != 0) {
                                com.fyber.inneractive.sdk.protobuf.s sVar3 = (com.fyber.inneractive.sdk.protobuf.s) unsafe2.getObject(obj, j2);
                                b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a4 = com.fyber.inneractive.sdk.protobuf.b0.a(sVar3);
                                b4 = a4 + b3;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 11:
                            if ((i17 & i2) != 0) {
                                int i24 = unsafe2.getInt(obj, j2);
                                b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a4 = com.fyber.inneractive.sdk.protobuf.b0.c(i24);
                                b4 = a4 + b3;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 12:
                            if ((i17 & i2) != 0) {
                                int i25 = unsafe2.getInt(obj, j2);
                                b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a4 = com.fyber.inneractive.sdk.protobuf.b0.a(i25);
                                b4 = a4 + b3;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 13:
                            if ((i17 & i2) != 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 4, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 14:
                            if ((i17 & i2) != 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 8, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 15:
                            if ((i17 & i2) != 0) {
                                int i26 = unsafe2.getInt(obj, j2);
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a3 = com.fyber.inneractive.sdk.protobuf.b0.c(com.fyber.inneractive.sdk.protobuf.b0.d(i26));
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 16:
                            if ((i17 & i2) != 0) {
                                long j5 = unsafe2.getLong(obj, j2);
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a3 = com.fyber.inneractive.sdk.protobuf.b0.a(com.fyber.inneractive.sdk.protobuf.b0.b(j5));
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 17:
                            if ((i17 & i2) != 0) {
                                com.fyber.inneractive.sdk.protobuf.d2 d2Var3 = (com.fyber.inneractive.sdk.protobuf.d2) unsafe2.getObject(obj, j2);
                                com.fyber.inneractive.sdk.protobuf.t2 c15 = c(i14);
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19) * 2;
                                a3 = ((com.fyber.inneractive.sdk.protobuf.b) d2Var3).getSerializedSize(c15);
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 18:
                            b4 = com.fyber.inneractive.sdk.protobuf.u2.b(i19, (java.util.List) unsafe2.getObject(obj, j2));
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 19:
                            b4 = com.fyber.inneractive.sdk.protobuf.u2.a(i19, (java.util.List) unsafe2.getObject(obj, j2));
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 20:
                            java.util.List list19 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls22 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            if (list19.size() != 0) {
                                b4 = com.fyber.inneractive.sdk.protobuf.h2.a(i19, list19.size(), com.fyber.inneractive.sdk.protobuf.u2.c(list19));
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 21:
                            java.util.List list20 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls23 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size18 = list20.size();
                            if (size18 != 0) {
                                b4 = com.fyber.inneractive.sdk.protobuf.h2.a(i19, size18, com.fyber.inneractive.sdk.protobuf.u2.g(list20));
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 22:
                            java.util.List list21 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls24 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size19 = list21.size();
                            if (size19 != 0) {
                                b4 = com.fyber.inneractive.sdk.protobuf.h2.a(i19, size19, com.fyber.inneractive.sdk.protobuf.u2.b(list21));
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 23:
                            b4 = com.fyber.inneractive.sdk.protobuf.u2.b(i19, (java.util.List) unsafe2.getObject(obj, j2));
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 24:
                            b4 = com.fyber.inneractive.sdk.protobuf.u2.a(i19, (java.util.List) unsafe2.getObject(obj, j2));
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 25:
                            java.util.List list22 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls25 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size20 = list22.size();
                            i15 = (size20 == 0 ? 0 : (com.fyber.inneractive.sdk.protobuf.b0.b(i19) + 1) * size20) + i15;
                            i14 += 3;
                            i3 = 267386880;
                        case 26:
                            b4 = com.fyber.inneractive.sdk.protobuf.u2.c(i19, (java.util.List) unsafe2.getObject(obj, j2));
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 27:
                            java.util.List list23 = (java.util.List) unsafe2.getObject(obj, j2);
                            com.fyber.inneractive.sdk.protobuf.t2 c16 = c(i14);
                            java.lang.Class cls26 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size21 = list23.size();
                            if (size21 != 0) {
                                b5 = com.fyber.inneractive.sdk.protobuf.b0.b(i19) * size21;
                                for (int i27 = 0; i27 < size21; i27++) {
                                    int serializedSize5 = ((com.fyber.inneractive.sdk.protobuf.b) ((com.fyber.inneractive.sdk.protobuf.d2) list23.get(i27))).getSerializedSize(c16);
                                    b5 = com.fyber.inneractive.sdk.protobuf.b0.c(serializedSize5) + serializedSize5 + b5;
                                }
                                i15 = b5 + i15;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b5 = 0;
                            i15 = b5 + i15;
                            i14 += 3;
                            i3 = 267386880;
                        case 28:
                            java.util.List list24 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls27 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size22 = list24.size();
                            if (size22 != 0) {
                                b5 = com.fyber.inneractive.sdk.protobuf.b0.b(i19) * size22;
                                for (int i28 = 0; i28 < list24.size(); i28++) {
                                    b5 = com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) list24.get(i28)) + b5;
                                }
                                i15 = b5 + i15;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b5 = 0;
                            i15 = b5 + i15;
                            i14 += 3;
                            i3 = 267386880;
                        case 29:
                            java.util.List list25 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls28 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size23 = list25.size();
                            if (size23 != 0) {
                                b4 = com.fyber.inneractive.sdk.protobuf.h2.a(i19, size23, com.fyber.inneractive.sdk.protobuf.u2.f(list25));
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 30:
                            java.util.List list26 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls29 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size24 = list26.size();
                            if (size24 != 0) {
                                b4 = com.fyber.inneractive.sdk.protobuf.h2.a(i19, size24, com.fyber.inneractive.sdk.protobuf.u2.a(list26));
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 31:
                            b4 = com.fyber.inneractive.sdk.protobuf.u2.a(i19, (java.util.List) unsafe2.getObject(obj, j2));
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 32:
                            b4 = com.fyber.inneractive.sdk.protobuf.u2.b(i19, (java.util.List) unsafe2.getObject(obj, j2));
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 33:
                            java.util.List list27 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls30 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size25 = list27.size();
                            if (size25 != 0) {
                                b4 = com.fyber.inneractive.sdk.protobuf.h2.a(i19, size25, com.fyber.inneractive.sdk.protobuf.u2.d(list27));
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 34:
                            java.util.List list28 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls31 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size26 = list28.size();
                            if (size26 != 0) {
                                b4 = com.fyber.inneractive.sdk.protobuf.h2.a(i19, size26, com.fyber.inneractive.sdk.protobuf.u2.e(list28));
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b4 = 0;
                            a2 = b4 + i15;
                            i15 = a2;
                            i14 += 3;
                            i3 = 267386880;
                        case 35:
                            java.util.List list29 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls32 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size27 = list29.size() * 8;
                            if (size27 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(size27, com.fyber.inneractive.sdk.protobuf.b0.b(i19), size27, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 36:
                            java.util.List list30 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls33 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size28 = list30.size() * 4;
                            if (size28 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(size28, com.fyber.inneractive.sdk.protobuf.b0.b(i19), size28, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 37:
                            int c17 = com.fyber.inneractive.sdk.protobuf.u2.c((java.util.List) unsafe2.getObject(obj, j2));
                            if (c17 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(c17, com.fyber.inneractive.sdk.protobuf.b0.b(i19), c17, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 38:
                            int g2 = com.fyber.inneractive.sdk.protobuf.u2.g((java.util.List) unsafe2.getObject(obj, j2));
                            if (g2 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(g2, com.fyber.inneractive.sdk.protobuf.b0.b(i19), g2, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 39:
                            int b15 = com.fyber.inneractive.sdk.protobuf.u2.b((java.util.List) unsafe2.getObject(obj, j2));
                            if (b15 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(b15, com.fyber.inneractive.sdk.protobuf.b0.b(i19), b15, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 40:
                            java.util.List list31 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls34 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size29 = list31.size() * 8;
                            if (size29 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(size29, com.fyber.inneractive.sdk.protobuf.b0.b(i19), size29, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 41:
                            java.util.List list32 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls35 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size30 = list32.size() * 4;
                            if (size30 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(size30, com.fyber.inneractive.sdk.protobuf.b0.b(i19), size30, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 42:
                            java.util.List list33 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls36 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size31 = list33.size();
                            if (size31 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(size31, com.fyber.inneractive.sdk.protobuf.b0.b(i19), size31, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 43:
                            int f2 = com.fyber.inneractive.sdk.protobuf.u2.f((java.util.List) unsafe2.getObject(obj, j2));
                            if (f2 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(f2, com.fyber.inneractive.sdk.protobuf.b0.b(i19), f2, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 44:
                            int a10 = com.fyber.inneractive.sdk.protobuf.u2.a((java.util.List) unsafe2.getObject(obj, j2));
                            if (a10 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(a10, com.fyber.inneractive.sdk.protobuf.b0.b(i19), a10, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 45:
                            java.util.List list34 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls37 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size32 = list34.size() * 4;
                            if (size32 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(size32, com.fyber.inneractive.sdk.protobuf.b0.b(i19), size32, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 46:
                            java.util.List list35 = (java.util.List) unsafe2.getObject(obj, j2);
                            java.lang.Class cls38 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size33 = list35.size() * 8;
                            if (size33 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(size33, com.fyber.inneractive.sdk.protobuf.b0.b(i19), size33, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 47:
                            int d4 = com.fyber.inneractive.sdk.protobuf.u2.d((java.util.List) unsafe2.getObject(obj, j2));
                            if (d4 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(d4, com.fyber.inneractive.sdk.protobuf.b0.b(i19), d4, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 48:
                            int e7 = com.fyber.inneractive.sdk.protobuf.u2.e((java.util.List) unsafe2.getObject(obj, j2));
                            if (e7 > 0) {
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(e7, com.fyber.inneractive.sdk.protobuf.b0.b(i19), e7, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 49:
                            java.util.List list36 = (java.util.List) unsafe2.getObject(obj, j2);
                            com.fyber.inneractive.sdk.protobuf.t2 c18 = c(i14);
                            java.lang.Class cls39 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                            int size34 = list36.size();
                            if (size34 != 0) {
                                b5 = 0;
                                for (int i29 = 0; i29 < size34; i29++) {
                                    b5 = ((com.fyber.inneractive.sdk.protobuf.b) ((com.fyber.inneractive.sdk.protobuf.d2) list36.get(i29))).getSerializedSize(c18) + (com.fyber.inneractive.sdk.protobuf.b0.b(i19) * 2) + b5;
                                }
                                i15 = b5 + i15;
                                i14 += 3;
                                i3 = 267386880;
                            }
                            b5 = 0;
                            i15 = b5 + i15;
                            i14 += 3;
                            i3 = 267386880;
                        case 50:
                            com.fyber.inneractive.sdk.protobuf.z1 z1Var2 = this.p;
                            java.lang.Object object3 = unsafe2.getObject(obj, j2);
                            java.lang.Object b16 = b(i14);
                            z1Var2.getClass();
                            com.fyber.inneractive.sdk.protobuf.y1 y1Var2 = (com.fyber.inneractive.sdk.protobuf.y1) object3;
                            if (b16 == null) {
                                if (y1Var2.isEmpty()) {
                                    continue;
                                } else {
                                    java.util.Iterator it2 = y1Var2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
                                        entry2.getKey();
                                        entry2.getValue();
                                        throw null;
                                    }
                                }
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                throw new java.lang.ClassCastException();
                            }
                        case 51:
                            if (a(obj, i19, i14)) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 8, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 52:
                            if (a(obj, i19, i14)) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 4, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 53:
                            if (a(obj, i19, i14)) {
                                long longValue4 = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2)).longValue();
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a3 = com.fyber.inneractive.sdk.protobuf.b0.a(longValue4);
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 54:
                            if (a(obj, i19, i14)) {
                                long longValue5 = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2)).longValue();
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a3 = com.fyber.inneractive.sdk.protobuf.b0.a(longValue5);
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 55:
                            if (a(obj, i19, i14)) {
                                int intValue5 = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2)).intValue();
                                b2 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                if (intValue5 >= 0) {
                                    c = com.fyber.inneractive.sdk.protobuf.b0.c(intValue5);
                                    b4 = c + b2;
                                    a2 = b4 + i15;
                                    i15 = a2;
                                    i14 += 3;
                                    i3 = 267386880;
                                }
                                c = 10;
                                b4 = c + b2;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 56:
                            if (a(obj, i19, i14)) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 8, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 57:
                            if (a(obj, i19, i14)) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 4, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 58:
                            if (a(obj, i19, i14)) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 1, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 59:
                            if (a(obj, i19, i14)) {
                                java.lang.Object object4 = unsafe2.getObject(obj, j2);
                                if (object4 instanceof com.fyber.inneractive.sdk.protobuf.s) {
                                    b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                    a4 = com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) object4);
                                } else {
                                    b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                    a4 = com.fyber.inneractive.sdk.protobuf.b0.a((java.lang.String) object4);
                                }
                                b4 = a4 + b3;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 60:
                            if (a(obj, i19, i14)) {
                                java.lang.Object object5 = unsafe2.getObject(obj, j2);
                                com.fyber.inneractive.sdk.protobuf.t2 c19 = c(i14);
                                java.lang.Class cls40 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                                int b17 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                int serializedSize6 = ((com.fyber.inneractive.sdk.protobuf.b) ((com.fyber.inneractive.sdk.protobuf.d2) object5)).getSerializedSize(c19);
                                a2 = com.fyber.inneractive.sdk.protobuf.l0.a(serializedSize6, serializedSize6, b17, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 61:
                            if (a(obj, i19, i14)) {
                                com.fyber.inneractive.sdk.protobuf.s sVar4 = (com.fyber.inneractive.sdk.protobuf.s) unsafe2.getObject(obj, j2);
                                b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a4 = com.fyber.inneractive.sdk.protobuf.b0.a(sVar4);
                                b4 = a4 + b3;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 62:
                            if (a(obj, i19, i14)) {
                                int intValue6 = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2)).intValue();
                                b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a4 = com.fyber.inneractive.sdk.protobuf.b0.c(intValue6);
                                b4 = a4 + b3;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 63:
                            if (a(obj, i19, i14)) {
                                int intValue7 = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2)).intValue();
                                b3 = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a4 = com.fyber.inneractive.sdk.protobuf.b0.a(intValue7);
                                b4 = a4 + b3;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 64:
                            if (a(obj, i19, i14)) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 4, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 65:
                            if (a(obj, i19, i14)) {
                                a2 = com.fyber.inneractive.sdk.protobuf.g2.a(i19, 8, i15);
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 66:
                            if (a(obj, i19, i14)) {
                                int intValue8 = ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2)).intValue();
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a3 = com.fyber.inneractive.sdk.protobuf.b0.c(com.fyber.inneractive.sdk.protobuf.b0.d(intValue8));
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 67:
                            if (a(obj, i19, i14)) {
                                long longValue6 = ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2)).longValue();
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19);
                                a3 = com.fyber.inneractive.sdk.protobuf.b0.a(com.fyber.inneractive.sdk.protobuf.b0.b(longValue6));
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        case 68:
                            if (a(obj, i19, i14)) {
                                com.fyber.inneractive.sdk.protobuf.d2 d2Var4 = (com.fyber.inneractive.sdk.protobuf.d2) unsafe2.getObject(obj, j2);
                                com.fyber.inneractive.sdk.protobuf.t2 c20 = c(i14);
                                b = com.fyber.inneractive.sdk.protobuf.b0.b(i19) * 2;
                                a3 = ((com.fyber.inneractive.sdk.protobuf.b) d2Var4).getSerializedSize(c20);
                                b4 = a3 + b;
                                a2 = b4 + i15;
                                i15 = a2;
                                i14 += 3;
                                i3 = 267386880;
                            } else {
                                i14 += 3;
                                i3 = 267386880;
                            }
                        default:
                            i14 += 3;
                            i3 = 267386880;
                    }
                } else {
                    this.n.getClass();
                    int a11 = ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.a() + i15;
                    if (!this.f) {
                        return a11;
                    }
                    this.o.getClass();
                    return ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions.b() + a11;
                }
            }
        }
    }

    public final void d(int i, java.lang.Object obj, java.lang.Object obj2) {
        long j = this.f4197a[i + 1] & 1048575;
        if (a(i, obj2)) {
            java.lang.Object e = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
            java.lang.Object e2 = com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j);
            if (e != null && e2 != null) {
                com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, com.fyber.inneractive.sdk.protobuf.l1.a(e, e2));
                b(i, obj);
            } else if (e2 != null) {
                com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, e2);
                b(i, obj);
            }
        }
    }

    public static java.lang.reflect.Field a(java.lang.Class cls, java.lang.String str) {
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

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final java.lang.Object a() {
        com.fyber.inneractive.sdk.protobuf.k2 k2Var = this.l;
        com.fyber.inneractive.sdk.protobuf.d2 d2Var = this.e;
        k2Var.getClass();
        return ((com.fyber.inneractive.sdk.protobuf.z0) d2Var).dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f4197a;
            if (i < iArr.length) {
                int i2 = iArr[i + 1];
                long j = 1048575 & i2;
                int i3 = iArr[i];
                switch ((i2 & 267386880) >>> 20) {
                    case 0:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
                            w3Var.a(obj, j, w3Var.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 1:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.w3 w3Var2 = com.fyber.inneractive.sdk.protobuf.x3.c;
                            w3Var2.a(obj, j, w3Var2.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 2:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 3:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 4:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 5:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 6:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 7:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.w3 w3Var3 = com.fyber.inneractive.sdk.protobuf.x3.c;
                            w3Var3.a(obj, j, w3Var3.a(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 8:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 9:
                        d(i, obj, obj2);
                        break;
                    case 10:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 11:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 12:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 13:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 14:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 15:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.c(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 16:
                        if (!a(i, obj2)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, com.fyber.inneractive.sdk.protobuf.x3.d(obj2, j));
                            b(i, obj);
                            break;
                        }
                    case 17:
                        d(i, obj, obj2);
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
                        this.m.a(j, obj, obj2);
                        break;
                    case 50:
                        com.fyber.inneractive.sdk.protobuf.z1 z1Var = this.p;
                        java.lang.Class cls = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                        java.lang.Object e = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
                        java.lang.Object e2 = com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j);
                        z1Var.getClass();
                        com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, com.fyber.inneractive.sdk.protobuf.z1.a(e, e2));
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
                        if (!a(obj2, i3, i)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j));
                            b(obj, i3, i);
                            break;
                        }
                    case 60:
                        e(i, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(obj2, i3, i)) {
                            break;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j));
                            b(obj, i3, i);
                            break;
                        }
                    case 68:
                        e(i, obj, obj2);
                        break;
                }
                i += 3;
            } else {
                com.fyber.inneractive.sdk.protobuf.o3 o3Var = this.n;
                java.lang.Class cls2 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                o3Var.getClass();
                com.fyber.inneractive.sdk.protobuf.z0 z0Var = (com.fyber.inneractive.sdk.protobuf.z0) obj;
                com.fyber.inneractive.sdk.protobuf.n3 n3Var = z0Var.unknownFields;
                com.fyber.inneractive.sdk.protobuf.n3 n3Var2 = ((com.fyber.inneractive.sdk.protobuf.z0) obj2).unknownFields;
                if (!n3Var2.equals(com.fyber.inneractive.sdk.protobuf.n3.f)) {
                    n3Var = com.fyber.inneractive.sdk.protobuf.n3.a(n3Var, n3Var2);
                }
                z0Var.unknownFields = n3Var;
                if (this.f) {
                    this.o.getClass();
                    com.fyber.inneractive.sdk.protobuf.n0 n0Var = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj2).extensions;
                    if (n0Var.f4206a.isEmpty()) {
                        return;
                    }
                    ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().a(n0Var);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0b19  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.c0 c0Var) {
        java.util.Iterator it;
        java.util.Map.Entry entry;
        int length;
        int i;
        int i2;
        java.util.Map.Entry entry2;
        java.util.Iterator it2;
        int length2;
        c0Var.getClass();
        int i3 = 267386880;
        int i4 = 1048575;
        if (com.fyber.inneractive.sdk.protobuf.q4.ASCENDING == com.fyber.inneractive.sdk.protobuf.q4.DESCENDING) {
            this.n.getClass();
            ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.a(c0Var);
            if (this.f) {
                this.o.getClass();
                com.fyber.inneractive.sdk.protobuf.n0 n0Var = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions;
                if (!n0Var.f4206a.isEmpty()) {
                    if (n0Var.c) {
                        com.fyber.inneractive.sdk.protobuf.e3 e3Var = n0Var.f4206a;
                        if (e3Var.g == null) {
                            e3Var.g = new com.fyber.inneractive.sdk.protobuf.x2(e3Var);
                        }
                        it2 = new com.fyber.inneractive.sdk.protobuf.o1(new com.fyber.inneractive.sdk.protobuf.w2(e3Var.g.b));
                    } else {
                        com.fyber.inneractive.sdk.protobuf.e3 e3Var2 = n0Var.f4206a;
                        if (e3Var2.g == null) {
                            e3Var2.g = new com.fyber.inneractive.sdk.protobuf.x2(e3Var2);
                        }
                        it2 = new com.fyber.inneractive.sdk.protobuf.w2(e3Var2.g.b);
                    }
                    entry2 = (java.util.Map.Entry) it2.next();
                    for (length2 = this.f4197a.length - 3; length2 >= 0; length2 -= 3) {
                        int[] iArr = this.f4197a;
                        int i5 = iArr[length2 + 1];
                        int i6 = iArr[length2];
                        while (entry2 != null) {
                            this.o.getClass();
                            if (((com.fyber.inneractive.sdk.protobuf.w0) entry2.getKey()).b > i6) {
                                this.o.getClass();
                                com.fyber.inneractive.sdk.protobuf.j0.a(c0Var, entry2);
                                entry2 = it2.hasNext() ? (java.util.Map.Entry) it2.next() : null;
                            } else {
                                switch ((i5 & 267386880) >>> 20) {
                                    case 0:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, com.fyber.inneractive.sdk.protobuf.x3.c.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, com.fyber.inneractive.sdk.protobuf.x3.c.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.b(i6, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.b(i6, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 4:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.b(i6, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 5:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.a(i6, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 6:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.a(i6, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 7:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.a(i6, com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 8:
                                        if (a(length2, obj)) {
                                            a(i6, com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 9:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.a(i6, (com.fyber.inneractive.sdk.protobuf.d2) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 10:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.a(i6, (com.fyber.inneractive.sdk.protobuf.s) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 11:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.d(i6, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 12:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.b(i6, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 13:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.a(i6, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 14:
                                        if (a(length2, obj)) {
                                            c0Var.f4181a.a(i6, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 15:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 16:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 17:
                                        if (a(length2, obj)) {
                                            c0Var.a(i6, com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 18:
                                        com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 19:
                                        com.fyber.inneractive.sdk.protobuf.u2.f(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 20:
                                        com.fyber.inneractive.sdk.protobuf.u2.h(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 21:
                                        com.fyber.inneractive.sdk.protobuf.u2.n(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 22:
                                        com.fyber.inneractive.sdk.protobuf.u2.g(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 23:
                                        com.fyber.inneractive.sdk.protobuf.u2.e(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 24:
                                        com.fyber.inneractive.sdk.protobuf.u2.d(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 25:
                                        com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 26:
                                        com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var);
                                        break;
                                    case 27:
                                        com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, c(length2));
                                        break;
                                    case 28:
                                        com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var);
                                        break;
                                    case 29:
                                        com.fyber.inneractive.sdk.protobuf.u2.m(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 30:
                                        com.fyber.inneractive.sdk.protobuf.u2.c(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 31:
                                        com.fyber.inneractive.sdk.protobuf.u2.i(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 32:
                                        com.fyber.inneractive.sdk.protobuf.u2.j(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 33:
                                        com.fyber.inneractive.sdk.protobuf.u2.k(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 34:
                                        com.fyber.inneractive.sdk.protobuf.u2.l(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, false);
                                        break;
                                    case 35:
                                        com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 36:
                                        com.fyber.inneractive.sdk.protobuf.u2.f(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 37:
                                        com.fyber.inneractive.sdk.protobuf.u2.h(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 38:
                                        com.fyber.inneractive.sdk.protobuf.u2.n(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 39:
                                        com.fyber.inneractive.sdk.protobuf.u2.g(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 40:
                                        com.fyber.inneractive.sdk.protobuf.u2.e(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 41:
                                        com.fyber.inneractive.sdk.protobuf.u2.d(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 42:
                                        com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 43:
                                        com.fyber.inneractive.sdk.protobuf.u2.m(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 44:
                                        com.fyber.inneractive.sdk.protobuf.u2.c(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 45:
                                        com.fyber.inneractive.sdk.protobuf.u2.i(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 46:
                                        com.fyber.inneractive.sdk.protobuf.u2.j(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 47:
                                        com.fyber.inneractive.sdk.protobuf.u2.k(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 48:
                                        com.fyber.inneractive.sdk.protobuf.u2.l(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, true);
                                        break;
                                    case 49:
                                        com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[length2], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var, c(length2));
                                        break;
                                    case 50:
                                        if (com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575) != null) {
                                            com.fyber.inneractive.sdk.protobuf.z1 z1Var = this.p;
                                            java.lang.Object b = b(length2);
                                            z1Var.getClass();
                                            b.getClass();
                                            throw new java.lang.ClassCastException();
                                        }
                                        break;
                                    case 51:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, ((java.lang.Double) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).doubleValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 52:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, ((java.lang.Float) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).floatValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 53:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.b(i6, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 54:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.b(i6, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 55:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.b(i6, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 56:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.a(i6, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 57:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.a(i6, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 58:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.a(i6, ((java.lang.Boolean) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).booleanValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 59:
                                        if (a(obj, i6, length2)) {
                                            a(i6, com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c0Var);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 60:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.a(i6, (com.fyber.inneractive.sdk.protobuf.d2) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 61:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.a(i6, (com.fyber.inneractive.sdk.protobuf.s) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 62:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.d(i6, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 63:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.b(i6, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 64:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.a(i6, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 65:
                                        if (a(obj, i6, length2)) {
                                            c0Var.f4181a.a(i6, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 66:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).intValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 67:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575)).longValue());
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 68:
                                        if (a(obj, i6, length2)) {
                                            c0Var.a(i6, com.fyber.inneractive.sdk.protobuf.x3.e(obj, i5 & 1048575), c(length2));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
                        switch ((i5 & 267386880) >>> 20) {
                        }
                    }
                    while (entry2 != null) {
                        this.o.getClass();
                        com.fyber.inneractive.sdk.protobuf.j0.a(c0Var, entry2);
                        entry2 = it2.hasNext() ? (java.util.Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            entry2 = null;
            it2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
            return;
        }
        if (this.h) {
            b(obj, c0Var);
            return;
        }
        if (this.f) {
            this.o.getClass();
            com.fyber.inneractive.sdk.protobuf.n0 n0Var2 = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (!n0Var2.f4206a.isEmpty()) {
                it = n0Var2.d();
                entry = (java.util.Map.Entry) it.next();
                length = this.f4197a.length;
                sun.misc.Unsafe unsafe = r;
                i = 0;
                int i7 = 1048575;
                int i8 = 0;
                while (i < length) {
                    int[] iArr2 = this.f4197a;
                    int i9 = iArr2[i + 1];
                    int i10 = iArr2[i];
                    int i11 = (i9 & i3) >>> 20;
                    if (i11 <= 17) {
                        int i12 = iArr2[i + 2];
                        int i13 = i12 & i4;
                        if (i13 != i7) {
                            i8 = unsafe.getInt(obj, i13);
                            i7 = i13;
                        }
                        i2 = 1 << (i12 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null) {
                        this.o.getClass();
                        if (((com.fyber.inneractive.sdk.protobuf.w0) entry.getKey()).b <= i10) {
                            this.o.getClass();
                            com.fyber.inneractive.sdk.protobuf.j0.a(c0Var, entry);
                            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                        } else {
                            int i14 = length;
                            long j = i9 & i4;
                            switch (i11) {
                                case 0:
                                    if ((i8 & i2) != 0) {
                                        c0Var.a(i10, com.fyber.inneractive.sdk.protobuf.x3.c.c(obj, j));
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 1:
                                    if ((i8 & i2) != 0) {
                                        c0Var.a(i10, com.fyber.inneractive.sdk.protobuf.x3.c.d(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 2:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.b(i10, unsafe.getLong(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 3:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.b(i10, unsafe.getLong(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 4:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.b(i10, unsafe.getInt(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 5:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.a(i10, unsafe.getLong(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 6:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.a(i10, unsafe.getInt(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 7:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.a(i10, com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 8:
                                    if ((i8 & i2) != 0) {
                                        a(i10, unsafe.getObject(obj, j), c0Var);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 9:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.a(i10, (com.fyber.inneractive.sdk.protobuf.d2) unsafe.getObject(obj, j), c(i));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 10:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.a(i10, (com.fyber.inneractive.sdk.protobuf.s) unsafe.getObject(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 11:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.d(i10, unsafe.getInt(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 12:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.b(i10, unsafe.getInt(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 13:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.a(i10, unsafe.getInt(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 14:
                                    if ((i8 & i2) != 0) {
                                        c0Var.f4181a.a(i10, unsafe.getLong(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 15:
                                    if ((i8 & i2) != 0) {
                                        c0Var.a(i10, unsafe.getInt(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 16:
                                    if ((i8 & i2) != 0) {
                                        c0Var.a(i10, unsafe.getLong(obj, j));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 17:
                                    if ((i8 & i2) != 0) {
                                        c0Var.a(i10, unsafe.getObject(obj, j), c(i));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 18:
                                    com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    continue;
                                    continue;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 19:
                                    com.fyber.inneractive.sdk.protobuf.u2.f(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    continue;
                                    continue;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 20:
                                    com.fyber.inneractive.sdk.protobuf.u2.h(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    continue;
                                    continue;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 21:
                                    com.fyber.inneractive.sdk.protobuf.u2.n(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    continue;
                                    continue;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 22:
                                    com.fyber.inneractive.sdk.protobuf.u2.g(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    continue;
                                    continue;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 23:
                                    com.fyber.inneractive.sdk.protobuf.u2.e(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    continue;
                                    continue;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 24:
                                    com.fyber.inneractive.sdk.protobuf.u2.d(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    continue;
                                    continue;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 25:
                                    com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    continue;
                                    continue;
                                    i += 3;
                                    length = i14;
                                    i3 = 267386880;
                                    i4 = 1048575;
                                case 26:
                                    com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var);
                                    break;
                                case 27:
                                    com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, c(i));
                                    break;
                                case 28:
                                    com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var);
                                    break;
                                case 29:
                                    com.fyber.inneractive.sdk.protobuf.u2.m(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    break;
                                case 30:
                                    com.fyber.inneractive.sdk.protobuf.u2.c(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    break;
                                case 31:
                                    com.fyber.inneractive.sdk.protobuf.u2.i(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    break;
                                case 32:
                                    com.fyber.inneractive.sdk.protobuf.u2.j(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    break;
                                case 33:
                                    com.fyber.inneractive.sdk.protobuf.u2.k(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    break;
                                case 34:
                                    com.fyber.inneractive.sdk.protobuf.u2.l(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, false);
                                    break;
                                case 35:
                                    com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 36:
                                    com.fyber.inneractive.sdk.protobuf.u2.f(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 37:
                                    com.fyber.inneractive.sdk.protobuf.u2.h(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 38:
                                    com.fyber.inneractive.sdk.protobuf.u2.n(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 39:
                                    com.fyber.inneractive.sdk.protobuf.u2.g(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 40:
                                    com.fyber.inneractive.sdk.protobuf.u2.e(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 41:
                                    com.fyber.inneractive.sdk.protobuf.u2.d(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 42:
                                    com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 43:
                                    com.fyber.inneractive.sdk.protobuf.u2.m(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 44:
                                    com.fyber.inneractive.sdk.protobuf.u2.c(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 45:
                                    com.fyber.inneractive.sdk.protobuf.u2.i(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 46:
                                    com.fyber.inneractive.sdk.protobuf.u2.j(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 47:
                                    com.fyber.inneractive.sdk.protobuf.u2.k(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 48:
                                    com.fyber.inneractive.sdk.protobuf.u2.l(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, true);
                                    break;
                                case 49:
                                    com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[i], (java.util.List) unsafe.getObject(obj, j), c0Var, c(i));
                                    break;
                                case 50:
                                    if (unsafe.getObject(obj, j) != null) {
                                        com.fyber.inneractive.sdk.protobuf.z1 z1Var2 = this.p;
                                        java.lang.Object b2 = b(i);
                                        z1Var2.getClass();
                                        b2.getClass();
                                        throw new java.lang.ClassCastException();
                                    }
                                    break;
                                case 51:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, ((java.lang.Double) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).doubleValue());
                                        break;
                                    }
                                    break;
                                case 52:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, ((java.lang.Float) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).floatValue());
                                        break;
                                    }
                                    break;
                                case 53:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.b(i10, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue());
                                        break;
                                    }
                                    break;
                                case 54:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.b(i10, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue());
                                        break;
                                    }
                                    break;
                                case 55:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.b(i10, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue());
                                        break;
                                    }
                                    break;
                                case 56:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.a(i10, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue());
                                        break;
                                    }
                                    break;
                                case 57:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.a(i10, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue());
                                        break;
                                    }
                                    break;
                                case 58:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.a(i10, ((java.lang.Boolean) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).booleanValue());
                                        break;
                                    }
                                    break;
                                case 59:
                                    if (a(obj, i10, i)) {
                                        a(i10, unsafe.getObject(obj, j), c0Var);
                                        break;
                                    }
                                    break;
                                case 60:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.a(i10, (com.fyber.inneractive.sdk.protobuf.d2) unsafe.getObject(obj, j), c(i));
                                        break;
                                    }
                                    break;
                                case 61:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.a(i10, (com.fyber.inneractive.sdk.protobuf.s) unsafe.getObject(obj, j));
                                        break;
                                    }
                                    break;
                                case 62:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.d(i10, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue());
                                        break;
                                    }
                                    break;
                                case 63:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.b(i10, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue());
                                        break;
                                    }
                                    break;
                                case 64:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.a(i10, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue());
                                        break;
                                    }
                                    break;
                                case 65:
                                    if (a(obj, i10, i)) {
                                        c0Var.f4181a.a(i10, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue());
                                        break;
                                    }
                                    break;
                                case 66:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).intValue());
                                        break;
                                    }
                                    break;
                                case 67:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j)).longValue());
                                        break;
                                    }
                                    break;
                                case 68:
                                    if (a(obj, i10, i)) {
                                        c0Var.a(i10, unsafe.getObject(obj, j), c(i));
                                        break;
                                    }
                                    break;
                            }
                            i += 3;
                            length = i14;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    }
                    int i142 = length;
                    long j2 = i9 & i4;
                    switch (i11) {
                    }
                    i += 3;
                    length = i142;
                    i3 = 267386880;
                    i4 = 1048575;
                }
                while (entry != null) {
                    this.o.getClass();
                    com.fyber.inneractive.sdk.protobuf.j0.a(c0Var, entry);
                    entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                }
                this.n.getClass();
                ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.a(c0Var);
            }
        }
        it = null;
        entry = null;
        length = this.f4197a.length;
        sun.misc.Unsafe unsafe2 = r;
        i = 0;
        int i72 = 1048575;
        int i82 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        this.n.getClass();
        ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.a(c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.c0 c0Var) {
        java.util.Iterator it;
        java.util.Map.Entry entry;
        int length;
        int i;
        if (this.f) {
            this.o.getClass();
            com.fyber.inneractive.sdk.protobuf.n0 n0Var = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions;
            if (!n0Var.f4206a.isEmpty()) {
                it = n0Var.d();
                entry = (java.util.Map.Entry) it.next();
                length = this.f4197a.length;
                for (i = 0; i < length; i += 3) {
                    int[] iArr = this.f4197a;
                    int i2 = iArr[i + 1];
                    int i3 = iArr[i];
                    while (entry != null) {
                        this.o.getClass();
                        if (((com.fyber.inneractive.sdk.protobuf.w0) entry.getKey()).b <= i3) {
                            this.o.getClass();
                            com.fyber.inneractive.sdk.protobuf.j0.a(c0Var, entry);
                            entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                        } else {
                            switch ((267386880 & i2) >>> 20) {
                                case 0:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, com.fyber.inneractive.sdk.protobuf.x3.c.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, com.fyber.inneractive.sdk.protobuf.x3.c.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 2:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.b(i3, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 3:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.b(i3, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.b(i3, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.a(i3, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.a(i3, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 7:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.a(i3, com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 8:
                                    if (a(i, obj)) {
                                        a(i3, com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 9:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.a(i3, (com.fyber.inneractive.sdk.protobuf.d2) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.a(i3, (com.fyber.inneractive.sdk.protobuf.s) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 11:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.d(i3, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 12:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.b(i3, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 13:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.a(i3, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 14:
                                    if (a(i, obj)) {
                                        c0Var.f4181a.a(i3, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 15:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, com.fyber.inneractive.sdk.protobuf.x3.c(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 16:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, com.fyber.inneractive.sdk.protobuf.x3.d(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
                                    if (a(i, obj)) {
                                        c0Var.a(i3, com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 19:
                                    com.fyber.inneractive.sdk.protobuf.u2.f(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 20:
                                    com.fyber.inneractive.sdk.protobuf.u2.h(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 21:
                                    com.fyber.inneractive.sdk.protobuf.u2.n(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 22:
                                    com.fyber.inneractive.sdk.protobuf.u2.g(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 23:
                                    com.fyber.inneractive.sdk.protobuf.u2.e(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 24:
                                    com.fyber.inneractive.sdk.protobuf.u2.d(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 25:
                                    com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 26:
                                    com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var);
                                    break;
                                case 27:
                                    com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, c(i));
                                    break;
                                case 28:
                                    com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var);
                                    break;
                                case 29:
                                    com.fyber.inneractive.sdk.protobuf.u2.m(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 30:
                                    com.fyber.inneractive.sdk.protobuf.u2.c(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 31:
                                    com.fyber.inneractive.sdk.protobuf.u2.i(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 32:
                                    com.fyber.inneractive.sdk.protobuf.u2.j(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 33:
                                    com.fyber.inneractive.sdk.protobuf.u2.k(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 34:
                                    com.fyber.inneractive.sdk.protobuf.u2.l(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, false);
                                    break;
                                case 35:
                                    com.fyber.inneractive.sdk.protobuf.u2.b(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 36:
                                    com.fyber.inneractive.sdk.protobuf.u2.f(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 37:
                                    com.fyber.inneractive.sdk.protobuf.u2.h(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 38:
                                    com.fyber.inneractive.sdk.protobuf.u2.n(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 39:
                                    com.fyber.inneractive.sdk.protobuf.u2.g(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 40:
                                    com.fyber.inneractive.sdk.protobuf.u2.e(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 41:
                                    com.fyber.inneractive.sdk.protobuf.u2.d(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 42:
                                    com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 43:
                                    com.fyber.inneractive.sdk.protobuf.u2.m(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 44:
                                    com.fyber.inneractive.sdk.protobuf.u2.c(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 45:
                                    com.fyber.inneractive.sdk.protobuf.u2.i(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 46:
                                    com.fyber.inneractive.sdk.protobuf.u2.j(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 47:
                                    com.fyber.inneractive.sdk.protobuf.u2.k(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 48:
                                    com.fyber.inneractive.sdk.protobuf.u2.l(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, true);
                                    break;
                                case 49:
                                    com.fyber.inneractive.sdk.protobuf.u2.a(this.f4197a[i], (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var, c(i));
                                    break;
                                case 50:
                                    if (com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575) != null) {
                                        com.fyber.inneractive.sdk.protobuf.z1 z1Var = this.p;
                                        java.lang.Object b = b(i);
                                        z1Var.getClass();
                                        b.getClass();
                                        throw new java.lang.ClassCastException();
                                    }
                                    break;
                                case 51:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((java.lang.Double) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).doubleValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 52:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((java.lang.Float) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).floatValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 53:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.b(i3, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 54:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.b(i3, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 55:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.b(i3, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 56:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.a(i3, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 57:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.a(i3, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 58:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.a(i3, ((java.lang.Boolean) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).booleanValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 59:
                                    if (a(obj, i3, i)) {
                                        a(i3, com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c0Var);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 60:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.a(i3, (com.fyber.inneractive.sdk.protobuf.d2) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 61:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.a(i3, (com.fyber.inneractive.sdk.protobuf.s) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 62:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.d(i3, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 63:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.b(i3, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 64:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.a(i3, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 65:
                                    if (a(obj, i3, i)) {
                                        c0Var.f4181a.a(i3, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 66:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((java.lang.Integer) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).intValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 67:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, ((java.lang.Long) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575)).longValue());
                                        break;
                                    } else {
                                        break;
                                    }
                                case 68:
                                    if (a(obj, i3, i)) {
                                        c0Var.a(i3, com.fyber.inneractive.sdk.protobuf.x3.e(obj, i2 & 1048575), c(i));
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                    }
                    switch ((267386880 & i2) >>> 20) {
                    }
                }
                while (entry != null) {
                    this.o.getClass();
                    com.fyber.inneractive.sdk.protobuf.j0.a(c0Var, entry);
                    entry = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
                }
                this.n.getClass();
                ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.a(c0Var);
            }
        }
        it = null;
        entry = null;
        length = this.f4197a.length;
        while (i < length) {
        }
        while (entry != null) {
        }
        this.n.getClass();
        ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields.a(c0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t2
    public final void a(java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.s2 s2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        h0Var.getClass();
        a(this.n, this.o, obj, s2Var, h0Var);
    }

    public final void a(com.fyber.inneractive.sdk.protobuf.o3 o3Var, com.fyber.inneractive.sdk.protobuf.j0 j0Var, java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.s2 s2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        com.fyber.inneractive.sdk.protobuf.x0 a2;
        java.lang.Object a3;
        java.lang.Object obj2 = null;
        com.fyber.inneractive.sdk.protobuf.n0 n0Var = null;
        while (true) {
            try {
                int s = s2Var.s();
                int a4 = (s < this.c || s > this.d) ? -1 : a(s, 0);
                if (a4 < 0) {
                    if (s == Integer.MAX_VALUE) {
                        if (obj2 != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (this.f) {
                        com.fyber.inneractive.sdk.protobuf.d2 d2Var = this.e;
                        j0Var.getClass();
                        a2 = h0Var.a(s, d2Var);
                    } else {
                        a2 = null;
                    }
                    if (a2 != null) {
                        if (n0Var == null) {
                            j0Var.getClass();
                            n0Var = ((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
                        }
                        j0Var.getClass();
                        a3 = com.fyber.inneractive.sdk.protobuf.j0.a(s2Var, a2, h0Var, n0Var, obj2, o3Var);
                    } else {
                        o3Var.getClass();
                        if (obj2 == null) {
                            com.fyber.inneractive.sdk.protobuf.z0 z0Var = (com.fyber.inneractive.sdk.protobuf.z0) obj;
                            com.fyber.inneractive.sdk.protobuf.n3 n3Var = z0Var.unknownFields;
                            if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
                                n3Var = new com.fyber.inneractive.sdk.protobuf.n3();
                                z0Var.unknownFields = n3Var;
                            }
                            obj2 = n3Var;
                        }
                        if (!com.fyber.inneractive.sdk.protobuf.o3.a(obj2, s2Var)) {
                            for (int i = this.j; i < this.k; i++) {
                                obj2 = b(this.i[i], obj, obj2);
                            }
                            if (obj2 != null) {
                                com.fyber.inneractive.sdk.protobuf.o3.a(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int i2 = this.f4197a[a4 + 1];
                    switch ((267386880 & i2) >>> 20) {
                        case 0:
                            com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, d(i2), s2Var.h());
                            b(a4, obj);
                        case 1:
                            com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, d(i2), s2Var.k());
                            b(a4, obj);
                        case 2:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.o());
                            b(a4, obj);
                        case 3:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.f());
                            b(a4, obj);
                        case 4:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.d());
                            b(a4, obj);
                        case 5:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.g());
                            b(a4, obj);
                        case 6:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.q());
                            b(a4, obj);
                        case 7:
                            com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, d(i2), s2Var.r());
                            b(a4, obj);
                        case 8:
                            if ((i2 & 536870912) != 0) {
                                com.fyber.inneractive.sdk.protobuf.x3.a(i2 & 1048575, obj, s2Var.p());
                            } else if (this.g) {
                                com.fyber.inneractive.sdk.protobuf.x3.a(i2 & 1048575, obj, s2Var.n());
                            } else {
                                com.fyber.inneractive.sdk.protobuf.x3.a(i2 & 1048575, obj, s2Var.a());
                            }
                            b(a4, obj);
                        case 9:
                            if (a(a4, obj)) {
                                com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, com.fyber.inneractive.sdk.protobuf.l1.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, d(i2)), s2Var.b(c(a4), h0Var)));
                            } else {
                                com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, s2Var.b(c(a4), h0Var));
                                b(a4, obj);
                            }
                        case 10:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, s2Var.a());
                            b(a4, obj);
                        case 11:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.c());
                            b(a4, obj);
                        case 12:
                            int b = s2Var.b();
                            a(a4);
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), b);
                            b(a4, obj);
                        case 13:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.m());
                            b(a4, obj);
                        case 14:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.t());
                            b(a4, obj);
                        case 15:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.j());
                            b(a4, obj);
                        case 16:
                            com.fyber.inneractive.sdk.protobuf.x3.a(obj, d(i2), s2Var.l());
                            b(a4, obj);
                        case 17:
                            if (a(a4, obj)) {
                                com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, com.fyber.inneractive.sdk.protobuf.l1.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, d(i2)), s2Var.a(c(a4), h0Var)));
                            } else {
                                com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, s2Var.a(c(a4), h0Var));
                                b(a4, obj);
                            }
                        case 18:
                            s2Var.j(this.m.b(obj, d(i2)));
                        case 19:
                            s2Var.d(this.m.b(obj, d(i2)));
                        case 20:
                            s2Var.k(this.m.b(obj, d(i2)));
                        case 21:
                            s2Var.a(this.m.b(obj, d(i2)));
                        case 22:
                            s2Var.o(this.m.b(obj, d(i2)));
                        case 23:
                            s2Var.n(this.m.b(obj, d(i2)));
                        case 24:
                            s2Var.e(this.m.b(obj, d(i2)));
                        case 25:
                            s2Var.l(this.m.b(obj, d(i2)));
                        case 26:
                            a(obj, i2, s2Var);
                        case 27:
                            a(obj, i2, s2Var, c(a4), h0Var);
                        case 28:
                            s2Var.h(this.m.b(obj, d(i2)));
                        case 29:
                            s2Var.i(this.m.b(obj, d(i2)));
                        case 30:
                            java.util.List b2 = this.m.b(obj, d(i2));
                            s2Var.p(b2);
                            a(a4);
                            a3 = com.fyber.inneractive.sdk.protobuf.u2.a(s, b2, obj2, o3Var);
                            break;
                        case 31:
                            s2Var.f(this.m.b(obj, d(i2)));
                        case 32:
                            s2Var.m(this.m.b(obj, d(i2)));
                        case 33:
                            s2Var.c(this.m.b(obj, d(i2)));
                        case 34:
                            s2Var.g(this.m.b(obj, d(i2)));
                        case 35:
                            s2Var.j(this.m.b(obj, d(i2)));
                        case 36:
                            s2Var.d(this.m.b(obj, d(i2)));
                        case 37:
                            s2Var.k(this.m.b(obj, d(i2)));
                        case 38:
                            s2Var.a(this.m.b(obj, d(i2)));
                        case 39:
                            s2Var.o(this.m.b(obj, d(i2)));
                        case 40:
                            s2Var.n(this.m.b(obj, d(i2)));
                        case 41:
                            s2Var.e(this.m.b(obj, d(i2)));
                        case 42:
                            s2Var.l(this.m.b(obj, d(i2)));
                        case 43:
                            s2Var.i(this.m.b(obj, d(i2)));
                        case 44:
                            java.util.List b3 = this.m.b(obj, d(i2));
                            s2Var.p(b3);
                            a(a4);
                            a3 = com.fyber.inneractive.sdk.protobuf.u2.a(s, b3, obj2, o3Var);
                            break;
                        case 45:
                            s2Var.f(this.m.b(obj, d(i2)));
                        case 46:
                            s2Var.m(this.m.b(obj, d(i2)));
                        case 47:
                            s2Var.c(this.m.b(obj, d(i2)));
                        case 48:
                            s2Var.g(this.m.b(obj, d(i2)));
                        case 49:
                            a(obj, d(i2), s2Var, c(a4), h0Var);
                        case 50:
                            c(a4, obj, b(a4));
                            throw null;
                            break;
                        case 51:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Double.valueOf(s2Var.h()));
                            b(obj, s, a4);
                        case 52:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Float.valueOf(s2Var.k()));
                            b(obj, s, a4);
                        case 53:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Long.valueOf(s2Var.o()));
                            b(obj, s, a4);
                        case 54:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Long.valueOf(s2Var.f()));
                            b(obj, s, a4);
                        case 55:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Integer.valueOf(s2Var.d()));
                            b(obj, s, a4);
                        case 56:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Long.valueOf(s2Var.g()));
                            b(obj, s, a4);
                        case 57:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Integer.valueOf(s2Var.q()));
                            b(obj, s, a4);
                        case 58:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Boolean.valueOf(s2Var.r()));
                            b(obj, s, a4);
                        case 59:
                            if ((i2 & 536870912) != 0) {
                                com.fyber.inneractive.sdk.protobuf.x3.a(i2 & 1048575, obj, s2Var.p());
                            } else if (this.g) {
                                com.fyber.inneractive.sdk.protobuf.x3.a(i2 & 1048575, obj, s2Var.n());
                            } else {
                                com.fyber.inneractive.sdk.protobuf.x3.a(i2 & 1048575, obj, s2Var.a());
                            }
                            b(obj, s, a4);
                        case 60:
                            if (a(obj, s, a4)) {
                                com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, com.fyber.inneractive.sdk.protobuf.l1.a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, d(i2)), s2Var.b(c(a4), h0Var)));
                            } else {
                                com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, s2Var.b(c(a4), h0Var));
                                b(a4, obj);
                            }
                            b(obj, s, a4);
                        case 61:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, s2Var.a());
                            b(obj, s, a4);
                        case 62:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Integer.valueOf(s2Var.c()));
                            b(obj, s, a4);
                        case 63:
                            int b4 = s2Var.b();
                            a(a4);
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Integer.valueOf(b4));
                            b(obj, s, a4);
                        case 64:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Integer.valueOf(s2Var.m()));
                            b(obj, s, a4);
                        case 65:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Long.valueOf(s2Var.t()));
                            b(obj, s, a4);
                        case 66:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Integer.valueOf(s2Var.j()));
                            b(obj, s, a4);
                        case 67:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, java.lang.Long.valueOf(s2Var.l()));
                            b(obj, s, a4);
                        case 68:
                            com.fyber.inneractive.sdk.protobuf.x3.a(d(i2), obj, s2Var.a(c(a4), h0Var));
                            b(obj, s, a4);
                        default:
                            if (obj2 == null) {
                                try {
                                    o3Var.getClass();
                                    obj2 = new com.fyber.inneractive.sdk.protobuf.n3();
                                } catch (com.fyber.inneractive.sdk.protobuf.m1 unused) {
                                    o3Var.getClass();
                                    if (obj2 == null) {
                                        com.fyber.inneractive.sdk.protobuf.z0 z0Var2 = (com.fyber.inneractive.sdk.protobuf.z0) obj;
                                        com.fyber.inneractive.sdk.protobuf.n3 n3Var2 = z0Var2.unknownFields;
                                        if (n3Var2 == com.fyber.inneractive.sdk.protobuf.n3.f) {
                                            n3Var2 = new com.fyber.inneractive.sdk.protobuf.n3();
                                            z0Var2.unknownFields = n3Var2;
                                        }
                                        obj2 = n3Var2;
                                    }
                                    if (!com.fyber.inneractive.sdk.protobuf.o3.a(obj2, s2Var)) {
                                        for (int i3 = this.j; i3 < this.k; i3++) {
                                            obj2 = b(this.i[i3], obj, obj2);
                                        }
                                        if (obj2 != null) {
                                            com.fyber.inneractive.sdk.protobuf.o3.a(obj, obj2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            o3Var.getClass();
                            if (!com.fyber.inneractive.sdk.protobuf.o3.a(obj2, s2Var)) {
                                for (int i4 = this.j; i4 < this.k; i4++) {
                                    obj2 = b(this.i[i4], obj, obj2);
                                }
                                if (obj2 != null) {
                                    com.fyber.inneractive.sdk.protobuf.o3.a(obj, obj2);
                                    return;
                                }
                                return;
                            }
                    }
                }
                obj2 = a3;
            } finally {
                for (int i5 = this.j; i5 < this.k; i5++) {
                    obj2 = b(this.i[i5], obj, obj2);
                }
                if (obj2 != null) {
                    o3Var.getClass();
                    com.fyber.inneractive.sdk.protobuf.o3.a(obj, obj2);
                }
            }
        }
    }

    public final java.lang.Object b(int i) {
        return this.b[(i / 3) * 2];
    }

    public final java.lang.Object b(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = this.f4197a[i];
        if (com.fyber.inneractive.sdk.protobuf.x3.e(obj, r0[i + 1] & 1048575) == null) {
            return obj2;
        }
        a(i);
        return obj2;
    }

    public final void b(int i, java.lang.Object obj) {
        int i2 = this.f4197a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        com.fyber.inneractive.sdk.protobuf.x3.a(obj, j, (1 << (i2 >>> 20)) | com.fyber.inneractive.sdk.protobuf.x3.c(obj, j));
    }

    public final void b(java.lang.Object obj, int i, int i2) {
        com.fyber.inneractive.sdk.protobuf.x3.a(obj, this.f4197a[i2 + 2] & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int a(java.lang.Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, com.fyber.inneractive.sdk.protobuf.f fVar) {
        int d;
        int i7;
        int i8 = i;
        sun.misc.Unsafe unsafe = r;
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = (com.fyber.inneractive.sdk.protobuf.k1) unsafe.getObject(obj, j2);
        if (!((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            int size = k1Var.size();
            k1Var = k1Var.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, k1Var);
        }
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    com.fyber.inneractive.sdk.protobuf.d0 d0Var = (com.fyber.inneractive.sdk.protobuf.d0) k1Var;
                    int d2 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    int i9 = fVar.f4189a + d2;
                    while (d2 < i9) {
                        d0Var.a(java.lang.Double.longBitsToDouble(com.fyber.inneractive.sdk.protobuf.g.b(d2, bArr)));
                        d2 += 8;
                    }
                    if (d2 == i9) {
                        return d2;
                    }
                    throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 1) {
                    com.fyber.inneractive.sdk.protobuf.d0 d0Var2 = (com.fyber.inneractive.sdk.protobuf.d0) k1Var;
                    d0Var2.a(java.lang.Double.longBitsToDouble(com.fyber.inneractive.sdk.protobuf.g.b(i8, bArr)));
                    while (true) {
                        int i10 = i8 + 8;
                        if (i10 >= i2) {
                            return i10;
                        }
                        i8 = i10 + 1;
                        byte b = bArr[i10];
                        if (b >= 0) {
                            fVar.f4189a = b;
                        } else {
                            i8 = com.fyber.inneractive.sdk.protobuf.g.a(b, bArr, i8, fVar);
                        }
                        if (i3 != fVar.f4189a) {
                            return i10;
                        }
                        d0Var2.a(java.lang.Double.longBitsToDouble(com.fyber.inneractive.sdk.protobuf.g.b(i8, bArr)));
                    }
                }
                return i8;
            case 19:
            case 36:
                if (i4 == 2) {
                    com.fyber.inneractive.sdk.protobuf.q0 q0Var = (com.fyber.inneractive.sdk.protobuf.q0) k1Var;
                    int d3 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    int i11 = fVar.f4189a + d3;
                    while (d3 < i11) {
                        q0Var.a(java.lang.Float.intBitsToFloat(com.fyber.inneractive.sdk.protobuf.g.a(d3, bArr)));
                        d3 += 4;
                    }
                    if (d3 == i11) {
                        return d3;
                    }
                    throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 5) {
                    com.fyber.inneractive.sdk.protobuf.q0 q0Var2 = (com.fyber.inneractive.sdk.protobuf.q0) k1Var;
                    q0Var2.a(java.lang.Float.intBitsToFloat(com.fyber.inneractive.sdk.protobuf.g.a(i8, bArr)));
                    while (true) {
                        int i12 = i8 + 4;
                        if (i12 >= i2) {
                            return i12;
                        }
                        i8 = i12 + 1;
                        byte b2 = bArr[i12];
                        if (b2 >= 0) {
                            fVar.f4189a = b2;
                        } else {
                            i8 = com.fyber.inneractive.sdk.protobuf.g.a(b2, bArr, i8, fVar);
                        }
                        if (i3 != fVar.f4189a) {
                            return i12;
                        }
                        q0Var2.a(java.lang.Float.intBitsToFloat(com.fyber.inneractive.sdk.protobuf.g.a(i8, bArr)));
                    }
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) k1Var;
                    int d4 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    int i13 = fVar.f4189a + d4;
                    while (d4 < i13) {
                        d4 = com.fyber.inneractive.sdk.protobuf.g.e(bArr, d4, fVar);
                        u1Var.a(fVar.b);
                    }
                    if (d4 == i13) {
                        return d4;
                    }
                    throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    com.fyber.inneractive.sdk.protobuf.u1 u1Var2 = (com.fyber.inneractive.sdk.protobuf.u1) k1Var;
                    int e = com.fyber.inneractive.sdk.protobuf.g.e(bArr, i8, fVar);
                    u1Var2.a(fVar.b);
                    while (e < i2) {
                        int i14 = e + 1;
                        byte b3 = bArr[e];
                        if (b3 >= 0) {
                            fVar.f4189a = b3;
                        } else {
                            i14 = com.fyber.inneractive.sdk.protobuf.g.a(b3, bArr, i14, fVar);
                        }
                        if (i3 != fVar.f4189a) {
                            return e;
                        }
                        e = com.fyber.inneractive.sdk.protobuf.g.e(bArr, i14, fVar);
                        u1Var2.a(fVar.b);
                    }
                    return e;
                }
                return i8;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 == 2) {
                    return com.fyber.inneractive.sdk.protobuf.g.a(bArr, i8, k1Var, fVar);
                }
                if (i4 == 0) {
                    return com.fyber.inneractive.sdk.protobuf.g.c(i3, bArr, i, i2, k1Var, fVar);
                }
                return i8;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    com.fyber.inneractive.sdk.protobuf.u1 u1Var3 = (com.fyber.inneractive.sdk.protobuf.u1) k1Var;
                    int d5 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    int i15 = fVar.f4189a + d5;
                    while (d5 < i15) {
                        u1Var3.a(com.fyber.inneractive.sdk.protobuf.g.b(d5, bArr));
                        d5 += 8;
                    }
                    if (d5 == i15) {
                        return d5;
                    }
                    throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 1) {
                    com.fyber.inneractive.sdk.protobuf.u1 u1Var4 = (com.fyber.inneractive.sdk.protobuf.u1) k1Var;
                    u1Var4.a(com.fyber.inneractive.sdk.protobuf.g.b(i8, bArr));
                    while (true) {
                        int i16 = i8 + 8;
                        if (i16 >= i2) {
                            return i16;
                        }
                        i8 = i16 + 1;
                        byte b4 = bArr[i16];
                        if (b4 >= 0) {
                            fVar.f4189a = b4;
                        } else {
                            i8 = com.fyber.inneractive.sdk.protobuf.g.a(b4, bArr, i8, fVar);
                        }
                        if (i3 != fVar.f4189a) {
                            return i16;
                        }
                        u1Var4.a(com.fyber.inneractive.sdk.protobuf.g.b(i8, bArr));
                    }
                }
                return i8;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) k1Var;
                    int d6 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    int i17 = fVar.f4189a + d6;
                    while (d6 < i17) {
                        a1Var.c(com.fyber.inneractive.sdk.protobuf.g.a(d6, bArr));
                        d6 += 4;
                    }
                    if (d6 == i17) {
                        return d6;
                    }
                    throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 5) {
                    com.fyber.inneractive.sdk.protobuf.a1 a1Var2 = (com.fyber.inneractive.sdk.protobuf.a1) k1Var;
                    a1Var2.c(com.fyber.inneractive.sdk.protobuf.g.a(i8, bArr));
                    while (true) {
                        int i18 = i8 + 4;
                        if (i18 >= i2) {
                            return i18;
                        }
                        i8 = i18 + 1;
                        byte b5 = bArr[i18];
                        if (b5 >= 0) {
                            fVar.f4189a = b5;
                        } else {
                            i8 = com.fyber.inneractive.sdk.protobuf.g.a(b5, bArr, i8, fVar);
                        }
                        if (i3 != fVar.f4189a) {
                            return i18;
                        }
                        a1Var2.c(com.fyber.inneractive.sdk.protobuf.g.a(i8, bArr));
                    }
                }
                return i8;
            case 25:
            case 42:
                if (i4 == 2) {
                    com.fyber.inneractive.sdk.protobuf.j jVar = (com.fyber.inneractive.sdk.protobuf.j) k1Var;
                    d = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    int i19 = fVar.f4189a + d;
                    while (d < i19) {
                        d = com.fyber.inneractive.sdk.protobuf.g.e(bArr, d, fVar);
                        jVar.a(fVar.b != 0);
                    }
                    if (d != i19) {
                        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    return d;
                }
                if (i4 == 0) {
                    com.fyber.inneractive.sdk.protobuf.j jVar2 = (com.fyber.inneractive.sdk.protobuf.j) k1Var;
                    i8 = com.fyber.inneractive.sdk.protobuf.g.e(bArr, i8, fVar);
                    jVar2.a(fVar.b != 0);
                    while (i8 < i2) {
                        int i20 = i8 + 1;
                        byte b6 = bArr[i8];
                        if (b6 >= 0) {
                            fVar.f4189a = b6;
                        } else {
                            i20 = com.fyber.inneractive.sdk.protobuf.g.a(b6, bArr, i20, fVar);
                        }
                        if (i3 == fVar.f4189a) {
                            i8 = com.fyber.inneractive.sdk.protobuf.g.e(bArr, i20, fVar);
                            jVar2.a(fVar.b != 0);
                        }
                    }
                }
                return i8;
            case 26:
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        return com.fyber.inneractive.sdk.protobuf.g.a(i3, bArr, i, i2, k1Var, fVar);
                    }
                    return com.fyber.inneractive.sdk.protobuf.g.b(i3, bArr, i, i2, k1Var, fVar);
                }
                return i8;
            case 27:
                if (i4 == 2) {
                    com.fyber.inneractive.sdk.protobuf.t2 c = c(i5);
                    i8 = com.fyber.inneractive.sdk.protobuf.g.a(c, bArr, i8, i2, fVar);
                    k1Var.add(fVar.c);
                    while (i8 < i2) {
                        int i21 = i8 + 1;
                        byte b7 = bArr[i8];
                        if (b7 >= 0) {
                            fVar.f4189a = b7;
                        } else {
                            i21 = com.fyber.inneractive.sdk.protobuf.g.a(b7, bArr, i21, fVar);
                        }
                        if (i3 == fVar.f4189a) {
                            i8 = com.fyber.inneractive.sdk.protobuf.g.a(c, bArr, i21, i2, fVar);
                            k1Var.add(fVar.c);
                        }
                    }
                }
                return i8;
            case 28:
                if (i4 == 2) {
                    int d7 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    int i22 = fVar.f4189a;
                    if (i22 >= 0) {
                        if (i22 > bArr.length - d7) {
                            throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        if (i22 == 0) {
                            k1Var.add(com.fyber.inneractive.sdk.protobuf.s.b);
                            i7 = d7;
                        } else {
                            i7 = d7 + i22;
                            com.fyber.inneractive.sdk.protobuf.s.a(d7, i7, bArr.length);
                            k1Var.add(new com.fyber.inneractive.sdk.protobuf.q(com.fyber.inneractive.sdk.protobuf.s.c.a(bArr, d7, i22)));
                        }
                        while (i7 < i2) {
                            int i23 = i7 + 1;
                            byte b8 = bArr[i7];
                            if (b8 >= 0) {
                                fVar.f4189a = b8;
                            } else {
                                i23 = com.fyber.inneractive.sdk.protobuf.g.a(b8, bArr, i23, fVar);
                            }
                            if (i3 != fVar.f4189a) {
                                return i7;
                            }
                            int i24 = i23 + 1;
                            byte b9 = bArr[i23];
                            if (b9 >= 0) {
                                fVar.f4189a = b9;
                            } else {
                                i24 = com.fyber.inneractive.sdk.protobuf.g.a(b9, bArr, i24, fVar);
                            }
                            int i25 = fVar.f4189a;
                            if (i25 >= 0) {
                                if (i25 > bArr.length - i24) {
                                    throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                                if (i25 == 0) {
                                    k1Var.add(com.fyber.inneractive.sdk.protobuf.s.b);
                                    i7 = i24;
                                } else {
                                    i7 = i24 + i25;
                                    com.fyber.inneractive.sdk.protobuf.s.a(i24, i7, bArr.length);
                                    k1Var.add(new com.fyber.inneractive.sdk.protobuf.q(com.fyber.inneractive.sdk.protobuf.s.c.a(bArr, i24, i25)));
                                }
                            } else {
                                throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                            }
                        }
                        return i7;
                    }
                    throw new com.fyber.inneractive.sdk.protobuf.n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return i8;
            case 30:
            case 44:
                if (i4 != 2) {
                    if (i4 == 0) {
                        d = com.fyber.inneractive.sdk.protobuf.g.c(i3, bArr, i, i2, k1Var, fVar);
                    }
                    return i8;
                }
                d = com.fyber.inneractive.sdk.protobuf.g.a(bArr, i8, k1Var, fVar);
                com.fyber.inneractive.sdk.protobuf.z0 z0Var = (com.fyber.inneractive.sdk.protobuf.z0) obj;
                com.fyber.inneractive.sdk.protobuf.n3 n3Var = z0Var.unknownFields;
                if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
                    n3Var = null;
                }
                a(i5);
                java.lang.Class cls = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
                if (n3Var != null) {
                    z0Var.unknownFields = n3Var;
                }
                return d;
            case 33:
            case 47:
                if (i4 == 2) {
                    com.fyber.inneractive.sdk.protobuf.a1 a1Var3 = (com.fyber.inneractive.sdk.protobuf.a1) k1Var;
                    int d8 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    int i26 = fVar.f4189a + d8;
                    while (d8 < i26) {
                        int i27 = d8 + 1;
                        byte b10 = bArr[d8];
                        if (b10 >= 0) {
                            fVar.f4189a = b10;
                            d8 = i27;
                        } else {
                            d8 = com.fyber.inneractive.sdk.protobuf.g.a(b10, bArr, i27, fVar);
                        }
                        a1Var3.c(com.fyber.inneractive.sdk.protobuf.w.b(fVar.f4189a));
                    }
                    if (d8 == i26) {
                        return d8;
                    }
                    throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    com.fyber.inneractive.sdk.protobuf.a1 a1Var4 = (com.fyber.inneractive.sdk.protobuf.a1) k1Var;
                    int d9 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    a1Var4.c(com.fyber.inneractive.sdk.protobuf.w.b(fVar.f4189a));
                    while (d9 < i2) {
                        int i28 = d9 + 1;
                        byte b11 = bArr[d9];
                        if (b11 >= 0) {
                            fVar.f4189a = b11;
                        } else {
                            i28 = com.fyber.inneractive.sdk.protobuf.g.a(b11, bArr, i28, fVar);
                        }
                        if (i3 != fVar.f4189a) {
                            return d9;
                        }
                        d9 = i28 + 1;
                        byte b12 = bArr[i28];
                        if (b12 >= 0) {
                            fVar.f4189a = b12;
                        } else {
                            d9 = com.fyber.inneractive.sdk.protobuf.g.a(b12, bArr, d9, fVar);
                        }
                        a1Var4.c(com.fyber.inneractive.sdk.protobuf.w.b(fVar.f4189a));
                    }
                    return d9;
                }
                return i8;
            case 34:
            case 48:
                if (i4 == 2) {
                    com.fyber.inneractive.sdk.protobuf.u1 u1Var5 = (com.fyber.inneractive.sdk.protobuf.u1) k1Var;
                    int d10 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                    int i29 = fVar.f4189a + d10;
                    while (d10 < i29) {
                        d10 = com.fyber.inneractive.sdk.protobuf.g.e(bArr, d10, fVar);
                        u1Var5.a(com.fyber.inneractive.sdk.protobuf.w.a(fVar.b));
                    }
                    if (d10 == i29) {
                        return d10;
                    }
                    throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i4 == 0) {
                    com.fyber.inneractive.sdk.protobuf.u1 u1Var6 = (com.fyber.inneractive.sdk.protobuf.u1) k1Var;
                    int e2 = com.fyber.inneractive.sdk.protobuf.g.e(bArr, i8, fVar);
                    u1Var6.a(com.fyber.inneractive.sdk.protobuf.w.a(fVar.b));
                    while (e2 < i2) {
                        int i30 = e2 + 1;
                        byte b13 = bArr[e2];
                        if (b13 >= 0) {
                            fVar.f4189a = b13;
                        } else {
                            i30 = com.fyber.inneractive.sdk.protobuf.g.a(b13, bArr, i30, fVar);
                        }
                        if (i3 != fVar.f4189a) {
                            return e2;
                        }
                        e2 = com.fyber.inneractive.sdk.protobuf.g.e(bArr, i30, fVar);
                        u1Var6.a(com.fyber.inneractive.sdk.protobuf.w.a(fVar.b));
                    }
                    return e2;
                }
                return i8;
            case 49:
                if (i4 == 3) {
                    com.fyber.inneractive.sdk.protobuf.t2 c2 = c(i5);
                    int i31 = (i3 & (-8)) | 4;
                    i8 = com.fyber.inneractive.sdk.protobuf.g.a(c2, bArr, i, i2, i31, fVar);
                    k1Var.add(fVar.c);
                    while (i8 < i2) {
                        int d11 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i8, fVar);
                        if (i3 == fVar.f4189a) {
                            i8 = com.fyber.inneractive.sdk.protobuf.g.a(c2, bArr, d11, i2, i31, fVar);
                            k1Var.add(fVar.c);
                        }
                    }
                }
                return i8;
            default:
                return i8;
        }
    }

    public final int a(java.lang.Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, com.fyber.inneractive.sdk.protobuf.f fVar) {
        sun.misc.Unsafe unsafe = r;
        long j2 = this.f4197a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.fyber.inneractive.sdk.protobuf.g.b(i, bArr))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.fyber.inneractive.sdk.protobuf.g.a(i, bArr))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int e = com.fyber.inneractive.sdk.protobuf.g.e(bArr, i, fVar);
                    unsafe.putObject(obj, j, java.lang.Long.valueOf(fVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return e;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int d = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i, fVar);
                    unsafe.putObject(obj, j, java.lang.Integer.valueOf(fVar.f4189a));
                    unsafe.putInt(obj, j2, i4);
                    return d;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, java.lang.Long.valueOf(com.fyber.inneractive.sdk.protobuf.g.b(i, bArr)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, java.lang.Integer.valueOf(com.fyber.inneractive.sdk.protobuf.g.a(i, bArr)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int e2 = com.fyber.inneractive.sdk.protobuf.g.e(bArr, i, fVar);
                    unsafe.putObject(obj, j, java.lang.Boolean.valueOf(fVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return e2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int d2 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i, fVar);
                    int i13 = fVar.f4189a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0) {
                            if (!com.fyber.inneractive.sdk.protobuf.d4.f4185a.b(bArr, d2, d2 + i13)) {
                                throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
                            }
                        }
                        unsafe.putObject(obj, j, new java.lang.String(bArr, d2, i13, com.fyber.inneractive.sdk.protobuf.l1.f4203a));
                        d2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return d2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int a2 = com.fyber.inneractive.sdk.protobuf.g.a(c(i8), bArr, i, i2, fVar);
                    java.lang.Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, fVar.c);
                    } else {
                        unsafe.putObject(obj, j, com.fyber.inneractive.sdk.protobuf.l1.a(object, fVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return a2;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int a3 = com.fyber.inneractive.sdk.protobuf.g.a(bArr, i, fVar);
                    unsafe.putObject(obj, j, fVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return a3;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int d3 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i, fVar);
                    int i14 = fVar.f4189a;
                    a(i8);
                    unsafe.putObject(obj, j, java.lang.Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                    return d3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int d4 = com.fyber.inneractive.sdk.protobuf.g.d(bArr, i, fVar);
                    unsafe.putObject(obj, j, java.lang.Integer.valueOf(com.fyber.inneractive.sdk.protobuf.w.b(fVar.f4189a)));
                    unsafe.putInt(obj, j2, i4);
                    return d4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int e3 = com.fyber.inneractive.sdk.protobuf.g.e(bArr, i, fVar);
                    unsafe.putObject(obj, j, java.lang.Long.valueOf(com.fyber.inneractive.sdk.protobuf.w.a(fVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return e3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int a4 = com.fyber.inneractive.sdk.protobuf.g.a(c(i8), bArr, i, i2, (i3 & (-8)) | 4, fVar);
                    java.lang.Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, fVar.c);
                    } else {
                        unsafe.putObject(obj, j, com.fyber.inneractive.sdk.protobuf.l1.a(object2, fVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return a4;
                }
                break;
        }
        return i;
    }

    public final void a(int i) {
        if (this.b[((i / 3) * 2) + 1] != null) {
            throw new java.lang.ClassCastException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x089d, code lost:
    
        if (r5 == 1048575) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x089f, code lost:
    
        r29.putInt(r13, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x08a5, code lost:
    
        r2 = r32.j;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x08ad, code lost:
    
        if (r2 >= r32.k) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x08af, code lost:
    
        r4 = (com.fyber.inneractive.sdk.protobuf.n3) b(r32.i[r2], r13, r4);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x08bc, code lost:
    
        if (r4 == null) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x08be, code lost:
    
        r32.n.getClass();
        ((com.fyber.inneractive.sdk.protobuf.z0) r13).unknownFields = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x08ca, code lost:
    
        if (r9 != 0) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x08cc, code lost:
    
        if (r0 != r7) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x08d4, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x08d9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x08d5, code lost:
    
        if (r0 > r7) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x08d7, code lost:
    
        if (r3 != r9) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x08df, code lost:
    
        throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x04a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(java.lang.Object obj, byte[] bArr, int i, int i2, int i3, com.fyber.inneractive.sdk.protobuf.f fVar) {
        sun.misc.Unsafe unsafe;
        int i4;
        int i5;
        java.lang.Object obj2;
        int a2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        byte[] bArr2;
        java.lang.Object obj3;
        int i13;
        int i14;
        int i15;
        int i16;
        com.fyber.inneractive.sdk.protobuf.n3 n3Var;
        java.lang.Object obj4;
        com.fyber.inneractive.sdk.protobuf.w0 w0Var;
        int i17;
        int d;
        int i18;
        int i19;
        byte[] bArr3;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int c;
        int a3;
        int i32;
        int i33;
        int i34;
        int i35;
        com.fyber.inneractive.sdk.protobuf.i2 i2Var = this;
        java.lang.Object obj5 = obj;
        byte[] bArr4 = bArr;
        int i36 = i2;
        int i37 = i3;
        com.fyber.inneractive.sdk.protobuf.f fVar2 = fVar;
        sun.misc.Unsafe unsafe2 = r;
        int i38 = i;
        int i39 = -1;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 1048575;
        while (true) {
            java.lang.Object obj6 = null;
            if (i38 < i36) {
                int i44 = i38 + 1;
                int i45 = bArr4[i38];
                if (i45 < 0) {
                    i44 = com.fyber.inneractive.sdk.protobuf.g.a(i45, bArr4, i44, fVar2);
                    i45 = fVar2.f4189a;
                }
                int i46 = i45 >>> 3;
                int i47 = i45 & 7;
                if (i46 > i39) {
                    int i48 = i40 / 3;
                    if (i46 >= i2Var.c && i46 <= i2Var.d) {
                        a2 = i2Var.a(i46, i48);
                        if (a2 != -1) {
                            i6 = i45;
                            i7 = i44;
                            i8 = i42;
                            i9 = i43;
                            unsafe = unsafe2;
                            i10 = i46;
                            i11 = i37;
                            i12 = 0;
                            z = true;
                        } else {
                            int[] iArr = i2Var.f4197a;
                            int i49 = iArr[a2 + 1];
                            int i50 = (i49 & 267386880) >>> 20;
                            int i51 = i45;
                            long j = i49 & 1048575;
                            if (i50 <= 17) {
                                int i52 = iArr[a2 + 2];
                                int i53 = 1 << (i52 >>> 20);
                                int i54 = i52 & 1048575;
                                int i55 = a2;
                                if (i54 != i43) {
                                    if (i43 != 1048575) {
                                        unsafe2.putInt(obj5, i43, i42);
                                    }
                                    i19 = i54;
                                    i18 = unsafe2.getInt(obj5, i54);
                                } else {
                                    i18 = i42;
                                    i19 = i43;
                                }
                                switch (i50) {
                                    case 0:
                                        bArr3 = bArr;
                                        int i56 = i44;
                                        i20 = i51;
                                        if (i47 != 1) {
                                            i21 = i56;
                                            i22 = i55;
                                            i11 = i3;
                                            i7 = i21;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i12 = i22;
                                            i8 = i18;
                                            i9 = i19;
                                            z = true;
                                            i10 = i46;
                                            break;
                                        } else {
                                            i23 = i56;
                                            i24 = i2;
                                            i25 = i55;
                                            com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, j, java.lang.Double.longBitsToDouble(com.fyber.inneractive.sdk.protobuf.g.b(i56, bArr3)));
                                            i29 = i23 + 8;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj7 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr5 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5;
                                        }
                                    case 1:
                                        bArr3 = bArr;
                                        i26 = i2;
                                        i27 = i44;
                                        i20 = i51;
                                        i28 = i55;
                                        if (i47 == 5) {
                                            com.fyber.inneractive.sdk.protobuf.x3.c.a(obj5, j, java.lang.Float.intBitsToFloat(com.fyber.inneractive.sdk.protobuf.g.a(i27, bArr3)));
                                            i29 = i27 + 4;
                                            i24 = i26;
                                            i25 = i28;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj72 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr52 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52;
                                        }
                                        i21 = i27;
                                        i22 = i28;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 2:
                                    case 3:
                                        bArr3 = bArr;
                                        i26 = i2;
                                        i27 = i44;
                                        i20 = i51;
                                        i28 = i55;
                                        if (i47 == 0) {
                                            i29 = com.fyber.inneractive.sdk.protobuf.g.e(bArr3, i27, fVar2);
                                            i24 = i26;
                                            i25 = i28;
                                            unsafe2.putLong(obj, j, fVar2.b);
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj722 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj722;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr522 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr522;
                                        }
                                        i21 = i27;
                                        i22 = i28;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 4:
                                    case 11:
                                        bArr3 = bArr;
                                        i26 = i2;
                                        i27 = i44;
                                        i20 = i51;
                                        i28 = i55;
                                        if (i47 == 0) {
                                            int i57 = i27 + 1;
                                            byte b = bArr3[i27];
                                            if (b >= 0) {
                                                fVar2.f4189a = b;
                                                i29 = i57;
                                            } else {
                                                i29 = com.fyber.inneractive.sdk.protobuf.g.a(b, bArr3, i57, fVar2);
                                            }
                                            unsafe2.putInt(obj5, j, fVar2.f4189a);
                                            i24 = i26;
                                            i25 = i28;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj7222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr5222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222;
                                        }
                                        i21 = i27;
                                        i22 = i28;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 5:
                                    case 14:
                                        bArr3 = bArr;
                                        i30 = i2;
                                        i20 = i51;
                                        i31 = i55;
                                        if (i47 == 1) {
                                            i23 = i44;
                                            i25 = i31;
                                            i24 = i30;
                                            unsafe2.putLong(obj, j, com.fyber.inneractive.sdk.protobuf.g.b(i44, bArr3));
                                            i29 = i23 + 8;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj72222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr52222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52222;
                                        }
                                        i21 = i44;
                                        i22 = i31;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 6:
                                    case 13:
                                        bArr3 = bArr;
                                        i30 = i2;
                                        i20 = i51;
                                        i31 = i55;
                                        if (i47 == 5) {
                                            unsafe2.putInt(obj5, j, com.fyber.inneractive.sdk.protobuf.g.a(i44, bArr3));
                                            i29 = i44 + 4;
                                            i25 = i31;
                                            i24 = i30;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj722222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj722222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr522222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr522222;
                                        }
                                        i21 = i44;
                                        i22 = i31;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 7:
                                        bArr3 = bArr;
                                        i30 = i2;
                                        i20 = i51;
                                        i31 = i55;
                                        if (i47 == 0) {
                                            i29 = com.fyber.inneractive.sdk.protobuf.g.e(bArr3, i44, fVar2);
                                            com.fyber.inneractive.sdk.protobuf.x3.c.a(obj5, j, fVar2.b != 0);
                                            i25 = i31;
                                            i24 = i30;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj7222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7222222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr5222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222222;
                                        }
                                        i21 = i44;
                                        i22 = i31;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 8:
                                        bArr3 = bArr;
                                        i30 = i2;
                                        i20 = i51;
                                        i31 = i55;
                                        if (i47 == 2) {
                                            if ((i49 & 536870912) == 0) {
                                                c = com.fyber.inneractive.sdk.protobuf.g.b(bArr3, i44, fVar2);
                                            } else {
                                                c = com.fyber.inneractive.sdk.protobuf.g.c(bArr3, i44, fVar2);
                                            }
                                            i29 = c;
                                            unsafe2.putObject(obj5, j, fVar2.c);
                                            i25 = i31;
                                            i24 = i30;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj72222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72222222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr52222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52222222;
                                        }
                                        i21 = i44;
                                        i22 = i31;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 9:
                                        bArr3 = bArr;
                                        i20 = i51;
                                        i31 = i55;
                                        if (i47 == 2) {
                                            i30 = i2;
                                            a3 = com.fyber.inneractive.sdk.protobuf.g.a(i2Var.c(i31), bArr3, i44, i30, fVar2);
                                            if ((i18 & i53) == 0) {
                                                unsafe2.putObject(obj5, j, fVar2.c);
                                            } else {
                                                unsafe2.putObject(obj5, j, com.fyber.inneractive.sdk.protobuf.l1.a(unsafe2.getObject(obj5, j), fVar2.c));
                                            }
                                            i29 = a3;
                                            i25 = i31;
                                            i24 = i30;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj722222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj722222222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr522222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr522222222;
                                        }
                                        i21 = i44;
                                        i22 = i31;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 10:
                                        bArr3 = bArr;
                                        i20 = i51;
                                        i31 = i55;
                                        if (i47 == 2) {
                                            i29 = com.fyber.inneractive.sdk.protobuf.g.a(bArr3, i44, fVar2);
                                            unsafe2.putObject(obj5, j, fVar2.c);
                                            i24 = i2;
                                            i25 = i31;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj7222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7222222222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr5222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222222222;
                                        }
                                        i21 = i44;
                                        i22 = i31;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 12:
                                        bArr3 = bArr;
                                        i20 = i51;
                                        i31 = i55;
                                        if (i47 == 0) {
                                            int i58 = i44 + 1;
                                            byte b2 = bArr3[i44];
                                            if (b2 >= 0) {
                                                fVar2.f4189a = b2;
                                            } else {
                                                i58 = com.fyber.inneractive.sdk.protobuf.g.a(b2, bArr3, i58, fVar2);
                                            }
                                            i29 = i58;
                                            int i59 = fVar2.f4189a;
                                            i2Var.a(i31);
                                            unsafe2.putInt(obj5, j, i59);
                                            i24 = i2;
                                            i25 = i31;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj72222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72222222222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr52222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52222222222;
                                        }
                                        i21 = i44;
                                        i22 = i31;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 15:
                                        bArr3 = bArr;
                                        i20 = i51;
                                        i31 = i55;
                                        if (i47 == 0) {
                                            int i60 = i44 + 1;
                                            byte b3 = bArr3[i44];
                                            if (b3 >= 0) {
                                                fVar2.f4189a = b3;
                                            } else {
                                                i60 = com.fyber.inneractive.sdk.protobuf.g.a(b3, bArr3, i60, fVar2);
                                            }
                                            i29 = i60;
                                            unsafe2.putInt(obj5, j, com.fyber.inneractive.sdk.protobuf.w.b(fVar2.f4189a));
                                            i24 = i2;
                                            i25 = i31;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj722222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj722222222222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr522222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr522222222222;
                                        }
                                        i21 = i44;
                                        i22 = i31;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 16:
                                        i20 = i51;
                                        i31 = i55;
                                        bArr3 = bArr;
                                        if (i47 == 0) {
                                            i29 = com.fyber.inneractive.sdk.protobuf.g.e(bArr3, i44, fVar2);
                                            unsafe2.putLong(obj, j, com.fyber.inneractive.sdk.protobuf.w.a(fVar2.b));
                                            i25 = i31;
                                            i24 = i2;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj7222222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj7222222222222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr5222222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222222222222;
                                        }
                                        i21 = i44;
                                        i22 = i31;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                    case 17:
                                        if (i47 != 3) {
                                            i20 = i51;
                                            i21 = i44;
                                            i22 = i55;
                                            i11 = i3;
                                            i7 = i21;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i12 = i22;
                                            i8 = i18;
                                            i9 = i19;
                                            z = true;
                                            i10 = i46;
                                            break;
                                        } else {
                                            i20 = i51;
                                            a3 = com.fyber.inneractive.sdk.protobuf.g.a(i2Var.c(i55), bArr, i44, i2, (i46 << 3) | 4, fVar);
                                            if ((i18 & i53) == 0) {
                                                unsafe2.putObject(obj5, j, fVar2.c);
                                            } else {
                                                unsafe2.putObject(obj5, j, com.fyber.inneractive.sdk.protobuf.l1.a(unsafe2.getObject(obj5, j), fVar2.c));
                                            }
                                            bArr3 = bArr;
                                            i30 = i2;
                                            i31 = i55;
                                            i29 = a3;
                                            i25 = i31;
                                            i24 = i30;
                                            i42 = i18 | i53;
                                            i38 = i29;
                                            i6 = i20;
                                            unsafe = unsafe2;
                                            i15 = i24;
                                            i40 = i25;
                                            i43 = i19;
                                            i13 = i46;
                                            i14 = i3;
                                            java.lang.Object obj72222222222222 = obj5;
                                            bArr2 = bArr3;
                                            obj3 = obj72222222222222;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr52222222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr52222222222222;
                                        }
                                    default:
                                        i21 = i44;
                                        i20 = i51;
                                        i22 = i55;
                                        i11 = i3;
                                        i7 = i21;
                                        i6 = i20;
                                        unsafe = unsafe2;
                                        i12 = i22;
                                        i8 = i18;
                                        i9 = i19;
                                        z = true;
                                        i10 = i46;
                                        break;
                                }
                            } else {
                                int i61 = a2;
                                int i62 = i44;
                                if (i50 == 27) {
                                    if (i47 == 2) {
                                        com.fyber.inneractive.sdk.protobuf.k1 k1Var = (com.fyber.inneractive.sdk.protobuf.k1) unsafe2.getObject(obj5, j);
                                        if (!((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
                                            int size = k1Var.size();
                                            k1Var = k1Var.b(size == 0 ? 10 : size * 2);
                                            unsafe2.putObject(obj5, j, k1Var);
                                        }
                                        com.fyber.inneractive.sdk.protobuf.t2 c2 = i2Var.c(i61);
                                        int a4 = com.fyber.inneractive.sdk.protobuf.g.a(c2, bArr4, i62, i2, fVar2);
                                        k1Var.add(fVar2.c);
                                        while (a4 < i2) {
                                            int i63 = a4 + 1;
                                            byte b4 = bArr4[a4];
                                            if (b4 >= 0) {
                                                fVar2.f4189a = b4;
                                            } else {
                                                i63 = com.fyber.inneractive.sdk.protobuf.g.a(b4, bArr4, i63, fVar2);
                                            }
                                            if (i51 != fVar2.f4189a) {
                                                i13 = i46;
                                                i14 = i3;
                                                i6 = i51;
                                                unsafe = unsafe2;
                                                i40 = i61;
                                                i38 = a4;
                                                i15 = i2;
                                                java.lang.Object obj8 = obj5;
                                                bArr2 = bArr4;
                                                obj3 = obj8;
                                                i2Var = this;
                                                i41 = i6;
                                                i37 = i14;
                                                i39 = i13;
                                                unsafe2 = unsafe;
                                                i36 = i15;
                                                byte[] bArr522222222222222 = bArr2;
                                                obj5 = obj3;
                                                bArr4 = bArr522222222222222;
                                            } else {
                                                a4 = com.fyber.inneractive.sdk.protobuf.g.a(c2, bArr4, i63, i2, fVar2);
                                                k1Var.add(fVar2.c);
                                            }
                                        }
                                        i13 = i46;
                                        i14 = i3;
                                        i6 = i51;
                                        unsafe = unsafe2;
                                        i40 = i61;
                                        i38 = a4;
                                        i15 = i2;
                                        java.lang.Object obj82 = obj5;
                                        bArr2 = bArr4;
                                        obj3 = obj82;
                                        i2Var = this;
                                        i41 = i6;
                                        i37 = i14;
                                        i39 = i13;
                                        unsafe2 = unsafe;
                                        i36 = i15;
                                        byte[] bArr5222222222222222 = bArr2;
                                        obj5 = obj3;
                                        bArr4 = bArr5222222222222222;
                                    } else {
                                        i10 = i46;
                                        i11 = i3;
                                        i32 = i61;
                                        i33 = i51;
                                        i8 = i42;
                                        i9 = i43;
                                        unsafe = unsafe2;
                                        i34 = i62;
                                        z = true;
                                    }
                                } else if (i50 <= 49) {
                                    i33 = i51;
                                    z = true;
                                    i8 = i42;
                                    i9 = i43;
                                    i10 = i46;
                                    unsafe = unsafe2;
                                    i11 = i3;
                                    i38 = a(obj, bArr, i62, i2, i33, i47, i61, i49, i50, j, fVar);
                                    i35 = i61;
                                    if (i38 != i62) {
                                        obj5 = obj;
                                        bArr4 = bArr;
                                        i36 = i2;
                                        fVar2 = fVar;
                                        i37 = i11;
                                        i40 = i35;
                                        i41 = i33;
                                        i42 = i8;
                                        i43 = i9;
                                        i39 = i10;
                                        unsafe2 = unsafe;
                                        i2Var = this;
                                    } else {
                                        i7 = i38;
                                        i12 = i35;
                                        i6 = i33;
                                    }
                                } else {
                                    i10 = i46;
                                    i11 = i3;
                                    i32 = i61;
                                    i8 = i42;
                                    i9 = i43;
                                    unsafe = unsafe2;
                                    i34 = i62;
                                    z = true;
                                    i33 = i51;
                                    if (i50 != 50) {
                                        i35 = i32;
                                        i38 = a(obj, bArr, i34, i2, i33, i10, i47, i49, i50, j, i32, fVar);
                                        if (i38 != i34) {
                                            obj5 = obj;
                                            bArr4 = bArr;
                                            i36 = i2;
                                            fVar2 = fVar;
                                            i37 = i11;
                                            i40 = i35;
                                            i41 = i33;
                                            i42 = i8;
                                            i43 = i9;
                                            i39 = i10;
                                            unsafe2 = unsafe;
                                            i2Var = this;
                                        } else {
                                            i7 = i38;
                                            i12 = i35;
                                            i6 = i33;
                                        }
                                    } else if (i47 == 2) {
                                        sun.misc.Unsafe unsafe3 = r;
                                        java.lang.Object b5 = b(i32);
                                        java.lang.Object object = unsafe3.getObject(obj, j);
                                        this.p.getClass();
                                        if (!((com.fyber.inneractive.sdk.protobuf.y1) object).f4231a) {
                                            this.p.getClass();
                                            com.fyber.inneractive.sdk.protobuf.y1 y1Var = com.fyber.inneractive.sdk.protobuf.y1.b;
                                            com.fyber.inneractive.sdk.protobuf.y1 y1Var2 = y1Var.isEmpty() ? new com.fyber.inneractive.sdk.protobuf.y1() : new com.fyber.inneractive.sdk.protobuf.y1(y1Var);
                                            this.p.getClass();
                                            com.fyber.inneractive.sdk.protobuf.z1.a(y1Var2, object);
                                            unsafe3.putObject(obj, j, y1Var2);
                                        }
                                        this.p.getClass();
                                        b5.getClass();
                                        throw new java.lang.ClassCastException();
                                    }
                                }
                                i7 = i34;
                                i6 = i33;
                                i12 = i32;
                            }
                        }
                        if (i6 == i11 || i11 == 0) {
                            if (this.f) {
                                obj3 = obj;
                                bArr2 = bArr;
                                fVar2 = fVar;
                                i16 = i12;
                                i14 = i11;
                            } else {
                                fVar2 = fVar;
                                i14 = i11;
                                if (fVar2.d != com.fyber.inneractive.sdk.protobuf.h0.a()) {
                                    com.fyber.inneractive.sdk.protobuf.d2 d2Var = this.e;
                                    com.fyber.inneractive.sdk.protobuf.o3 o3Var = this.n;
                                    i13 = i10;
                                    com.fyber.inneractive.sdk.protobuf.x0 a5 = fVar2.d.a(i13, d2Var);
                                    if (a5 == null) {
                                        obj3 = obj;
                                        com.fyber.inneractive.sdk.protobuf.z0 z0Var = (com.fyber.inneractive.sdk.protobuf.z0) obj3;
                                        com.fyber.inneractive.sdk.protobuf.n3 n3Var2 = z0Var.unknownFields;
                                        if (n3Var2 == com.fyber.inneractive.sdk.protobuf.n3.f) {
                                            n3Var2 = new com.fyber.inneractive.sdk.protobuf.n3();
                                            z0Var.unknownFields = n3Var2;
                                        }
                                        i38 = com.fyber.inneractive.sdk.protobuf.g.a(i6, bArr, i7, i2, n3Var2, fVar);
                                        bArr2 = bArr;
                                    } else {
                                        obj3 = obj;
                                        com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj3;
                                        generatedMessageLite$ExtendableMessage.ensureExtensionsAreMutable();
                                        com.fyber.inneractive.sdk.protobuf.n0 n0Var = generatedMessageLite$ExtendableMessage.extensions;
                                        com.fyber.inneractive.sdk.protobuf.w0 w0Var2 = a5.d;
                                        if (w0Var2.d && w0Var2.e) {
                                            switch (com.fyber.inneractive.sdk.protobuf.e.f4186a[w0Var2.c.ordinal()]) {
                                                case 1:
                                                    bArr2 = bArr;
                                                    i17 = i12;
                                                    com.fyber.inneractive.sdk.protobuf.d0 d0Var = new com.fyber.inneractive.sdk.protobuf.d0();
                                                    d = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                    int i64 = fVar2.f4189a + d;
                                                    while (d < i64) {
                                                        d0Var.a(java.lang.Double.longBitsToDouble(com.fyber.inneractive.sdk.protobuf.g.b(d, bArr2)));
                                                        d += 8;
                                                    }
                                                    if (d == i64) {
                                                        n0Var.c(a5.d, d0Var);
                                                        i40 = i17;
                                                        i15 = i2;
                                                        i38 = d;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr52222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222;
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 2:
                                                    bArr2 = bArr;
                                                    i17 = i12;
                                                    com.fyber.inneractive.sdk.protobuf.q0 q0Var = new com.fyber.inneractive.sdk.protobuf.q0();
                                                    d = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                    int i65 = fVar2.f4189a + d;
                                                    while (d < i65) {
                                                        q0Var.a(java.lang.Float.intBitsToFloat(com.fyber.inneractive.sdk.protobuf.g.a(d, bArr2)));
                                                        d += 4;
                                                    }
                                                    if (d == i65) {
                                                        n0Var.c(a5.d, q0Var);
                                                        i40 = i17;
                                                        i15 = i2;
                                                        i38 = d;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr522222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222;
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 3:
                                                case 4:
                                                    bArr2 = bArr;
                                                    i17 = i12;
                                                    com.fyber.inneractive.sdk.protobuf.u1 u1Var = new com.fyber.inneractive.sdk.protobuf.u1();
                                                    d = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                    int i66 = fVar2.f4189a + d;
                                                    while (d < i66) {
                                                        d = com.fyber.inneractive.sdk.protobuf.g.e(bArr2, d, fVar2);
                                                        u1Var.a(fVar2.b);
                                                    }
                                                    if (d == i66) {
                                                        n0Var.c(a5.d, u1Var);
                                                        i40 = i17;
                                                        i15 = i2;
                                                        i38 = d;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr5222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222;
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 5:
                                                case 6:
                                                    bArr2 = bArr;
                                                    i17 = i12;
                                                    com.fyber.inneractive.sdk.protobuf.a1 a1Var = new com.fyber.inneractive.sdk.protobuf.a1();
                                                    d = com.fyber.inneractive.sdk.protobuf.g.a(bArr2, i7, a1Var, fVar2);
                                                    n0Var.c(a5.d, a1Var);
                                                    i40 = i17;
                                                    i15 = i2;
                                                    i38 = d;
                                                    i42 = i8;
                                                    i43 = i9;
                                                    i2Var = this;
                                                    i41 = i6;
                                                    i37 = i14;
                                                    i39 = i13;
                                                    unsafe2 = unsafe;
                                                    i36 = i15;
                                                    byte[] bArr52222222222222222222 = bArr2;
                                                    obj5 = obj3;
                                                    bArr4 = bArr52222222222222222222;
                                                case 7:
                                                case 8:
                                                    bArr2 = bArr;
                                                    i17 = i12;
                                                    com.fyber.inneractive.sdk.protobuf.u1 u1Var2 = new com.fyber.inneractive.sdk.protobuf.u1();
                                                    d = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                    int i67 = fVar2.f4189a + d;
                                                    while (d < i67) {
                                                        u1Var2.a(com.fyber.inneractive.sdk.protobuf.g.b(d, bArr2));
                                                        d += 8;
                                                    }
                                                    if (d == i67) {
                                                        n0Var.c(a5.d, u1Var2);
                                                        i40 = i17;
                                                        i15 = i2;
                                                        i38 = d;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr522222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222;
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 9:
                                                case 10:
                                                    bArr2 = bArr;
                                                    i17 = i12;
                                                    com.fyber.inneractive.sdk.protobuf.a1 a1Var2 = new com.fyber.inneractive.sdk.protobuf.a1();
                                                    d = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                    int i68 = fVar2.f4189a + d;
                                                    while (d < i68) {
                                                        a1Var2.c(com.fyber.inneractive.sdk.protobuf.g.a(d, bArr2));
                                                        d += 4;
                                                    }
                                                    if (d == i68) {
                                                        n0Var.c(a5.d, a1Var2);
                                                        i40 = i17;
                                                        i15 = i2;
                                                        i38 = d;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr5222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222;
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 11:
                                                    bArr2 = bArr;
                                                    i17 = i12;
                                                    com.fyber.inneractive.sdk.protobuf.j jVar = new com.fyber.inneractive.sdk.protobuf.j();
                                                    d = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                    int i69 = fVar2.f4189a + d;
                                                    while (d < i69) {
                                                        d = com.fyber.inneractive.sdk.protobuf.g.e(bArr2, d, fVar2);
                                                        jVar.a(fVar2.b != 0);
                                                    }
                                                    if (d == i69) {
                                                        n0Var.c(a5.d, jVar);
                                                        i40 = i17;
                                                        i15 = i2;
                                                        i38 = d;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr52222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222;
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 12:
                                                    bArr2 = bArr;
                                                    i17 = i12;
                                                    com.fyber.inneractive.sdk.protobuf.a1 a1Var3 = new com.fyber.inneractive.sdk.protobuf.a1();
                                                    d = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                    int i70 = fVar2.f4189a + d;
                                                    while (d < i70) {
                                                        int i71 = d + 1;
                                                        byte b6 = bArr2[d];
                                                        if (b6 >= 0) {
                                                            fVar2.f4189a = b6;
                                                            d = i71;
                                                        } else {
                                                            d = com.fyber.inneractive.sdk.protobuf.g.a(b6, bArr2, i71, fVar2);
                                                        }
                                                        a1Var3.c(com.fyber.inneractive.sdk.protobuf.w.b(fVar2.f4189a));
                                                    }
                                                    if (d == i70) {
                                                        n0Var.c(a5.d, a1Var3);
                                                        i40 = i17;
                                                        i15 = i2;
                                                        i38 = d;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr522222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222;
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 13:
                                                    bArr2 = bArr;
                                                    com.fyber.inneractive.sdk.protobuf.u1 u1Var3 = new com.fyber.inneractive.sdk.protobuf.u1();
                                                    d = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                    int i72 = fVar2.f4189a + d;
                                                    while (d < i72) {
                                                        d = com.fyber.inneractive.sdk.protobuf.g.e(bArr2, d, fVar2);
                                                        u1Var3.a(com.fyber.inneractive.sdk.protobuf.w.a(fVar2.b));
                                                        i12 = i12;
                                                    }
                                                    i17 = i12;
                                                    if (d == i72) {
                                                        n0Var.c(a5.d, u1Var3);
                                                        i40 = i17;
                                                        i15 = i2;
                                                        i38 = d;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr5222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222;
                                                    } else {
                                                        throw new com.fyber.inneractive.sdk.protobuf.n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                case 14:
                                                    com.fyber.inneractive.sdk.protobuf.a1 a1Var4 = new com.fyber.inneractive.sdk.protobuf.a1();
                                                    bArr2 = bArr;
                                                    int a6 = com.fyber.inneractive.sdk.protobuf.g.a(bArr2, i7, a1Var4, fVar2);
                                                    com.fyber.inneractive.sdk.protobuf.n3 n3Var3 = generatedMessageLite$ExtendableMessage.unknownFields;
                                                    if (n3Var3 == com.fyber.inneractive.sdk.protobuf.n3.f) {
                                                        n3Var3 = null;
                                                    }
                                                    com.fyber.inneractive.sdk.protobuf.n3 n3Var4 = (com.fyber.inneractive.sdk.protobuf.n3) com.fyber.inneractive.sdk.protobuf.u2.a(i13, a1Var4, a5.d.f4223a, n3Var3, o3Var);
                                                    if (n3Var4 != null) {
                                                        generatedMessageLite$ExtendableMessage.unknownFields = n3Var4;
                                                    }
                                                    n0Var.c(a5.d, a1Var4);
                                                    i38 = a6;
                                                    break;
                                                default:
                                                    throw new java.lang.IllegalStateException("Type cannot be packed: " + a5.d.c);
                                            }
                                        } else {
                                            bArr2 = bArr;
                                            int i73 = i12;
                                            com.fyber.inneractive.sdk.protobuf.j4 j4Var = w0Var2.c;
                                            if (j4Var == com.fyber.inneractive.sdk.protobuf.j4.ENUM) {
                                                i7 = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                if (a5.d.f4223a.a(fVar2.f4189a) == null) {
                                                    com.fyber.inneractive.sdk.protobuf.n3 n3Var5 = generatedMessageLite$ExtendableMessage.unknownFields;
                                                    if (n3Var5 == com.fyber.inneractive.sdk.protobuf.n3.f) {
                                                        n3Var5 = new com.fyber.inneractive.sdk.protobuf.n3();
                                                        generatedMessageLite$ExtendableMessage.unknownFields = n3Var5;
                                                    }
                                                    com.fyber.inneractive.sdk.protobuf.u2.a(i13, fVar2.f4189a, n3Var5, o3Var);
                                                    i15 = i2;
                                                    i38 = i7;
                                                    i42 = i8;
                                                    i43 = i9;
                                                    i40 = i73;
                                                    i2Var = this;
                                                    i41 = i6;
                                                    i37 = i14;
                                                    i39 = i13;
                                                    unsafe2 = unsafe;
                                                    i36 = i15;
                                                    byte[] bArr52222222222222222222222222 = bArr2;
                                                    obj5 = obj3;
                                                    bArr4 = bArr52222222222222222222222222;
                                                } else {
                                                    obj6 = java.lang.Integer.valueOf(fVar2.f4189a);
                                                }
                                            } else {
                                                switch (com.fyber.inneractive.sdk.protobuf.e.f4186a[j4Var.ordinal()]) {
                                                    case 1:
                                                        i15 = i2;
                                                        obj6 = java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(com.fyber.inneractive.sdk.protobuf.g.b(i7, bArr2)));
                                                        i7 += 8;
                                                        obj4 = obj6;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                            n0Var.a(w0Var, obj4);
                                                        } else {
                                                            int i74 = com.fyber.inneractive.sdk.protobuf.e.f4186a[w0Var.c.ordinal()];
                                                            if (i74 == 17 || i74 == 18) {
                                                                java.lang.Object obj9 = n0Var.f4206a.get(a5.d);
                                                                if (obj9 != null) {
                                                                    obj4 = com.fyber.inneractive.sdk.protobuf.l1.a(obj9, obj4);
                                                                }
                                                            }
                                                            n0Var.c(a5.d, obj4);
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr522222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222;
                                                        break;
                                                    case 2:
                                                        i15 = i2;
                                                        obj6 = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(com.fyber.inneractive.sdk.protobuf.g.a(i7, bArr2)));
                                                        i7 += 4;
                                                        obj4 = obj6;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr5222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222222;
                                                        break;
                                                    case 3:
                                                    case 4:
                                                        i15 = i2;
                                                        i7 = com.fyber.inneractive.sdk.protobuf.g.e(bArr2, i7, fVar2);
                                                        obj6 = java.lang.Long.valueOf(fVar2.b);
                                                        obj4 = obj6;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr52222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222222222;
                                                        break;
                                                    case 5:
                                                    case 6:
                                                        i15 = i2;
                                                        i7 = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                        obj6 = java.lang.Integer.valueOf(fVar2.f4189a);
                                                        obj4 = obj6;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr522222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222222;
                                                        break;
                                                    case 7:
                                                    case 8:
                                                        i15 = i2;
                                                        obj6 = java.lang.Long.valueOf(com.fyber.inneractive.sdk.protobuf.g.b(i7, bArr2));
                                                        i7 += 8;
                                                        obj4 = obj6;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr5222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222222222;
                                                        break;
                                                    case 9:
                                                    case 10:
                                                        i15 = i2;
                                                        obj6 = java.lang.Integer.valueOf(com.fyber.inneractive.sdk.protobuf.g.a(i7, bArr2));
                                                        i7 += 4;
                                                        obj4 = obj6;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr52222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222222222222;
                                                        break;
                                                    case 11:
                                                        i15 = i2;
                                                        i7 = com.fyber.inneractive.sdk.protobuf.g.e(bArr2, i7, fVar2);
                                                        if (fVar2.b == 0) {
                                                            z = false;
                                                        }
                                                        obj6 = java.lang.Boolean.valueOf(z);
                                                        obj4 = obj6;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr522222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222222222;
                                                        break;
                                                    case 12:
                                                        i15 = i2;
                                                        i7 = com.fyber.inneractive.sdk.protobuf.g.d(bArr2, i7, fVar2);
                                                        obj6 = java.lang.Integer.valueOf(com.fyber.inneractive.sdk.protobuf.w.b(fVar2.f4189a));
                                                        obj4 = obj6;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr5222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222222222222;
                                                        break;
                                                    case 13:
                                                        i15 = i2;
                                                        i7 = com.fyber.inneractive.sdk.protobuf.g.e(bArr2, i7, fVar2);
                                                        obj6 = java.lang.Long.valueOf(com.fyber.inneractive.sdk.protobuf.w.a(fVar2.b));
                                                        obj4 = obj6;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr52222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222222222222222;
                                                        break;
                                                    case 14:
                                                        throw new java.lang.IllegalStateException("Shouldn't reach here.");
                                                    case 15:
                                                        i15 = i2;
                                                        i7 = com.fyber.inneractive.sdk.protobuf.g.a(bArr2, i7, fVar2);
                                                        obj4 = fVar2.c;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr522222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222222222222;
                                                        break;
                                                    case 16:
                                                        i15 = i2;
                                                        i7 = com.fyber.inneractive.sdk.protobuf.g.b(bArr2, i7, fVar2);
                                                        obj4 = fVar2.c;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr5222222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr5222222222222222222222222222222222222;
                                                        break;
                                                    case 17:
                                                        i15 = i2;
                                                        i7 = com.fyber.inneractive.sdk.protobuf.g.a(com.fyber.inneractive.sdk.protobuf.p2.c.a(a5.c.getClass()), bArr, i7, i2, (i13 << 3) | 4, fVar);
                                                        obj4 = fVar2.c;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr52222222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr52222222222222222222222222222222222222;
                                                        break;
                                                    case 18:
                                                        i15 = i2;
                                                        i7 = com.fyber.inneractive.sdk.protobuf.g.a(com.fyber.inneractive.sdk.protobuf.p2.c.a(a5.c.getClass()), bArr2, i7, i15, fVar2);
                                                        obj4 = fVar2.c;
                                                        w0Var = a5.d;
                                                        if (!w0Var.d) {
                                                        }
                                                        i38 = i7;
                                                        i42 = i8;
                                                        i43 = i9;
                                                        i40 = i73;
                                                        i2Var = this;
                                                        i41 = i6;
                                                        i37 = i14;
                                                        i39 = i13;
                                                        unsafe2 = unsafe;
                                                        i36 = i15;
                                                        byte[] bArr522222222222222222222222222222222222222 = bArr2;
                                                        obj5 = obj3;
                                                        bArr4 = bArr522222222222222222222222222222222222222;
                                                        break;
                                                }
                                            }
                                            i15 = i2;
                                            obj4 = obj6;
                                            w0Var = a5.d;
                                            if (!w0Var.d) {
                                            }
                                            i38 = i7;
                                            i42 = i8;
                                            i43 = i9;
                                            i40 = i73;
                                            i2Var = this;
                                            i41 = i6;
                                            i37 = i14;
                                            i39 = i13;
                                            unsafe2 = unsafe;
                                            i36 = i15;
                                            byte[] bArr5222222222222222222222222222222222222222 = bArr2;
                                            obj5 = obj3;
                                            bArr4 = bArr5222222222222222222222222222222222222222;
                                        }
                                    }
                                    i40 = i12;
                                    i42 = i8;
                                    i43 = i9;
                                    i15 = i2;
                                    i2Var = this;
                                    i41 = i6;
                                    i37 = i14;
                                    i39 = i13;
                                    unsafe2 = unsafe;
                                    i36 = i15;
                                    byte[] bArr52222222222222222222222222222222222222222 = bArr2;
                                    obj5 = obj3;
                                    bArr4 = bArr52222222222222222222222222222222222222222;
                                } else {
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i16 = i12;
                                }
                            }
                            i13 = i10;
                            i15 = i2;
                            com.fyber.inneractive.sdk.protobuf.z0 z0Var2 = (com.fyber.inneractive.sdk.protobuf.z0) obj3;
                            n3Var = z0Var2.unknownFields;
                            if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
                                n3Var = new com.fyber.inneractive.sdk.protobuf.n3();
                                z0Var2.unknownFields = n3Var;
                            }
                            i38 = com.fyber.inneractive.sdk.protobuf.g.a(i6, bArr, i7, i2, n3Var, fVar);
                            i40 = i16;
                            i42 = i8;
                            i43 = i9;
                            i2Var = this;
                            i41 = i6;
                            i37 = i14;
                            i39 = i13;
                            unsafe2 = unsafe;
                            i36 = i15;
                            byte[] bArr522222222222222222222222222222222222222222 = bArr2;
                            obj5 = obj3;
                            bArr4 = bArr522222222222222222222222222222222222222222;
                        } else {
                            obj2 = obj;
                            i4 = i2;
                            i38 = i7;
                            i41 = i6;
                            i5 = i11;
                            i42 = i8;
                            i43 = i9;
                        }
                    }
                    a2 = -1;
                    if (a2 != -1) {
                    }
                    if (i6 == i11) {
                    }
                    if (this.f) {
                    }
                    i13 = i10;
                    i15 = i2;
                    com.fyber.inneractive.sdk.protobuf.z0 z0Var22 = (com.fyber.inneractive.sdk.protobuf.z0) obj3;
                    n3Var = z0Var22.unknownFields;
                    if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
                    }
                    i38 = com.fyber.inneractive.sdk.protobuf.g.a(i6, bArr, i7, i2, n3Var, fVar);
                    i40 = i16;
                    i42 = i8;
                    i43 = i9;
                    i2Var = this;
                    i41 = i6;
                    i37 = i14;
                    i39 = i13;
                    unsafe2 = unsafe;
                    i36 = i15;
                    byte[] bArr5222222222222222222222222222222222222222222 = bArr2;
                    obj5 = obj3;
                    bArr4 = bArr5222222222222222222222222222222222222222222;
                } else {
                    if (i46 >= i2Var.c && i46 <= i2Var.d) {
                        a2 = i2Var.a(i46, 0);
                        if (a2 != -1) {
                        }
                        if (i6 == i11) {
                        }
                        if (this.f) {
                        }
                        i13 = i10;
                        i15 = i2;
                        com.fyber.inneractive.sdk.protobuf.z0 z0Var222 = (com.fyber.inneractive.sdk.protobuf.z0) obj3;
                        n3Var = z0Var222.unknownFields;
                        if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
                        }
                        i38 = com.fyber.inneractive.sdk.protobuf.g.a(i6, bArr, i7, i2, n3Var, fVar);
                        i40 = i16;
                        i42 = i8;
                        i43 = i9;
                        i2Var = this;
                        i41 = i6;
                        i37 = i14;
                        i39 = i13;
                        unsafe2 = unsafe;
                        i36 = i15;
                        byte[] bArr52222222222222222222222222222222222222222222 = bArr2;
                        obj5 = obj3;
                        bArr4 = bArr52222222222222222222222222222222222222222222;
                    }
                    a2 = -1;
                    if (a2 != -1) {
                    }
                    if (i6 == i11) {
                    }
                    if (this.f) {
                    }
                    i13 = i10;
                    i15 = i2;
                    com.fyber.inneractive.sdk.protobuf.z0 z0Var2222 = (com.fyber.inneractive.sdk.protobuf.z0) obj3;
                    n3Var = z0Var2222.unknownFields;
                    if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
                    }
                    i38 = com.fyber.inneractive.sdk.protobuf.g.a(i6, bArr, i7, i2, n3Var, fVar);
                    i40 = i16;
                    i42 = i8;
                    i43 = i9;
                    i2Var = this;
                    i41 = i6;
                    i37 = i14;
                    i39 = i13;
                    unsafe2 = unsafe;
                    i36 = i15;
                    byte[] bArr522222222222222222222222222222222222222222222 = bArr2;
                    obj5 = obj3;
                    bArr4 = bArr522222222222222222222222222222222222222222222;
                }
            } else {
                unsafe = unsafe2;
                i4 = i36;
                i5 = i37;
                obj2 = obj5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0304, code lost:
    
        if (r0 != r20) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03ae, code lost:
    
        r2 = r0;
        r9 = r17;
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x039d, code lost:
    
        r14 = r30;
        r13 = r32;
        r11 = r34;
        r12 = r35;
        r2 = r17;
        r1 = r24;
        r5 = r27;
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x039b, code lost:
    
        if (r0 != r14) goto L150;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x009f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03bc  */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.Object obj, byte[] bArr, int i, int i2, com.fyber.inneractive.sdk.protobuf.f fVar) {
        int a2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        sun.misc.Unsafe unsafe;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int e;
        int c;
        int i15;
        com.fyber.inneractive.sdk.protobuf.n3 n3Var;
        com.fyber.inneractive.sdk.protobuf.i2 i2Var = this;
        java.lang.Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i16 = i2;
        com.fyber.inneractive.sdk.protobuf.f fVar2 = fVar;
        if (i2Var.h) {
            sun.misc.Unsafe unsafe2 = r;
            int i17 = -1;
            int i18 = 0;
            int i19 = i;
            int i20 = -1;
            int i21 = 0;
            int i22 = 0;
            int i23 = 1048575;
            while (i19 < i16) {
                int i24 = i19 + 1;
                int i25 = bArr2[i19];
                if (i25 < 0) {
                    i24 = com.fyber.inneractive.sdk.protobuf.g.a(i25, bArr2, i24, fVar2);
                    i25 = fVar2.f4189a;
                }
                int i26 = i25;
                int i27 = i26 >>> 3;
                int i28 = i26 & 7;
                if (i27 > i20) {
                    int i29 = i21 / 3;
                    if (i27 >= i2Var.c && i27 <= i2Var.d) {
                        a2 = i2Var.a(i27, i29);
                        i3 = a2;
                    }
                    i3 = -1;
                } else {
                    if (i27 >= i2Var.c && i27 <= i2Var.d) {
                        a2 = i2Var.a(i27, i18);
                        i3 = a2;
                    }
                    i3 = -1;
                }
                if (i3 == i17) {
                    i4 = i27;
                    i11 = i24;
                    i5 = i26;
                    i6 = i22;
                    unsafe = unsafe2;
                } else {
                    int[] iArr = i2Var.f4197a;
                    int i30 = iArr[i3 + 1];
                    int i31 = (i30 & 267386880) >>> 20;
                    int i32 = i24;
                    int i33 = i26;
                    long j = i30 & 1048575;
                    if (i31 <= 17) {
                        int i34 = iArr[i3 + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i23) {
                            if (i23 != 1048575) {
                                unsafe2.putInt(obj2, i23, i22);
                            }
                            if (i36 != 1048575) {
                                i22 = unsafe2.getInt(obj2, i36);
                            }
                            i12 = i36;
                        } else {
                            i12 = i23;
                        }
                        int i37 = i22;
                        switch (i31) {
                            case 0:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 1) {
                                    i14 = i13;
                                    com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, j, java.lang.Double.longBitsToDouble(com.fyber.inneractive.sdk.protobuf.g.b(i13, bArr2)));
                                    e = i14 + 8;
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 1:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 5) {
                                    com.fyber.inneractive.sdk.protobuf.x3.c.a(obj2, j, java.lang.Float.intBitsToFloat(com.fyber.inneractive.sdk.protobuf.g.a(i13, bArr2)));
                                    e = i13 + 4;
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 2:
                            case 3:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 0) {
                                    e = com.fyber.inneractive.sdk.protobuf.g.e(bArr2, i13, fVar2);
                                    unsafe2.putLong(obj, j, fVar2.b);
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 4:
                            case 11:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 0) {
                                    int i38 = i13 + 1;
                                    byte b = bArr2[i13];
                                    if (b >= 0) {
                                        fVar2.f4189a = b;
                                    } else {
                                        i38 = com.fyber.inneractive.sdk.protobuf.g.a(b, bArr2, i38, fVar2);
                                    }
                                    e = i38;
                                    unsafe2.putInt(obj2, j, fVar2.f4189a);
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 5:
                            case 14:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 1) {
                                    i14 = i13;
                                    unsafe2.putLong(obj, j, com.fyber.inneractive.sdk.protobuf.g.b(i13, bArr2));
                                    e = i14 + 8;
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 6:
                            case 13:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 5) {
                                    unsafe2.putInt(obj2, j, com.fyber.inneractive.sdk.protobuf.g.a(i13, bArr2));
                                    e = i13 + 4;
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 7:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 0) {
                                    e = com.fyber.inneractive.sdk.protobuf.g.e(bArr2, i13, fVar2);
                                    com.fyber.inneractive.sdk.protobuf.x3.c.a(obj2, j, fVar2.b != 0);
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 8:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 2) {
                                    if ((i30 & 536870912) == 0) {
                                        c = com.fyber.inneractive.sdk.protobuf.g.b(bArr2, i13, fVar2);
                                    } else {
                                        c = com.fyber.inneractive.sdk.protobuf.g.c(bArr2, i13, fVar2);
                                    }
                                    e = c;
                                    unsafe2.putObject(obj2, j, fVar2.c);
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 9:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 2) {
                                    e = com.fyber.inneractive.sdk.protobuf.g.a(i2Var.c(i18), bArr2, i13, i16, fVar2);
                                    java.lang.Object object = unsafe2.getObject(obj2, j);
                                    if (object == null) {
                                        unsafe2.putObject(obj2, j, fVar2.c);
                                    } else {
                                        unsafe2.putObject(obj2, j, com.fyber.inneractive.sdk.protobuf.l1.a(object, fVar2.c));
                                    }
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 10:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 2) {
                                    e = com.fyber.inneractive.sdk.protobuf.g.a(bArr2, i13, fVar2);
                                    unsafe2.putObject(obj2, j, fVar2.c);
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 12:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 0) {
                                    int i39 = i13 + 1;
                                    byte b2 = bArr2[i13];
                                    if (b2 >= 0) {
                                        fVar2.f4189a = b2;
                                    } else {
                                        i39 = com.fyber.inneractive.sdk.protobuf.g.a(b2, bArr2, i39, fVar2);
                                    }
                                    e = i39;
                                    unsafe2.putInt(obj2, j, fVar2.f4189a);
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 15:
                                i4 = i27;
                                i18 = i3;
                                i13 = i32;
                                if (i28 == 0) {
                                    int i40 = i13 + 1;
                                    byte b3 = bArr2[i13];
                                    if (b3 >= 0) {
                                        fVar2.f4189a = b3;
                                    } else {
                                        i40 = com.fyber.inneractive.sdk.protobuf.g.a(b3, bArr2, i40, fVar2);
                                    }
                                    e = i40;
                                    unsafe2.putInt(obj2, j, com.fyber.inneractive.sdk.protobuf.w.b(fVar2.f4189a));
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                                i15 = i13;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                            case 16:
                                if (i28 != 0) {
                                    i4 = i27;
                                    i18 = i3;
                                    i13 = i32;
                                    i15 = i13;
                                    i6 = i37;
                                    i11 = i15;
                                    i23 = i12;
                                    unsafe = unsafe2;
                                    i5 = i33;
                                    break;
                                } else {
                                    e = com.fyber.inneractive.sdk.protobuf.g.e(bArr2, i32, fVar2);
                                    i18 = i3;
                                    i4 = i27;
                                    unsafe2.putLong(obj, j, com.fyber.inneractive.sdk.protobuf.w.a(fVar2.b));
                                    i22 = i37 | i35;
                                    i19 = e;
                                    i23 = i12;
                                    i21 = i18;
                                    unsafe = unsafe2;
                                    break;
                                }
                            default:
                                i4 = i27;
                                i18 = i3;
                                i15 = i32;
                                i6 = i37;
                                i11 = i15;
                                i23 = i12;
                                unsafe = unsafe2;
                                i5 = i33;
                                break;
                        }
                        i2Var = this;
                        bArr2 = bArr;
                        i16 = i2;
                        fVar2 = fVar;
                        i20 = i4;
                        unsafe2 = unsafe;
                        i17 = -1;
                        i18 = 0;
                    } else {
                        i4 = i27;
                        int i41 = i3;
                        if (i31 != 27) {
                            i5 = i33;
                            if (i31 <= 49) {
                                i6 = i22;
                                i7 = i23;
                                unsafe = unsafe2;
                                i19 = a(obj, bArr, i32, i2, i5, i28, i41, i30, i31, j, fVar);
                                i10 = i41;
                                obj2 = obj;
                            } else {
                                i6 = i22;
                                i7 = i23;
                                i8 = i32;
                                i9 = i41;
                                unsafe = unsafe2;
                                if (i31 != 50) {
                                    i10 = i9;
                                    obj2 = obj;
                                    i19 = a(obj, bArr, i8, i2, i5, i4, i28, i30, i31, j, i10, fVar);
                                } else if (i28 == 2) {
                                    sun.misc.Unsafe unsafe3 = r;
                                    java.lang.Object b4 = b(i9);
                                    java.lang.Object object2 = unsafe3.getObject(obj, j);
                                    this.p.getClass();
                                    if (!((com.fyber.inneractive.sdk.protobuf.y1) object2).f4231a) {
                                        this.p.getClass();
                                        com.fyber.inneractive.sdk.protobuf.y1 y1Var = com.fyber.inneractive.sdk.protobuf.y1.b;
                                        com.fyber.inneractive.sdk.protobuf.y1 y1Var2 = y1Var.isEmpty() ? new com.fyber.inneractive.sdk.protobuf.y1() : new com.fyber.inneractive.sdk.protobuf.y1(y1Var);
                                        this.p.getClass();
                                        com.fyber.inneractive.sdk.protobuf.z1.a(y1Var2, object2);
                                        unsafe3.putObject(obj, j, y1Var2);
                                    }
                                    this.p.getClass();
                                    b4.getClass();
                                    throw new java.lang.ClassCastException();
                                }
                            }
                            unsafe2 = unsafe;
                            i17 = -1;
                            i18 = 0;
                        } else if (i28 == 2) {
                            com.fyber.inneractive.sdk.protobuf.k1 k1Var = (com.fyber.inneractive.sdk.protobuf.k1) unsafe2.getObject(obj2, j);
                            if (!((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
                                int size = k1Var.size();
                                k1Var = k1Var.b(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj2, j, k1Var);
                            }
                            com.fyber.inneractive.sdk.protobuf.t2 c2 = i2Var.c(i41);
                            int a3 = com.fyber.inneractive.sdk.protobuf.g.a(c2, bArr2, i32, i16, fVar2);
                            k1Var.add(fVar2.c);
                            while (a3 < i16) {
                                int i42 = a3 + 1;
                                byte b5 = bArr2[a3];
                                if (b5 >= 0) {
                                    fVar2.f4189a = b5;
                                } else {
                                    i42 = com.fyber.inneractive.sdk.protobuf.g.a(b5, bArr2, i42, fVar2);
                                }
                                int i43 = i33;
                                if (i43 != fVar2.f4189a) {
                                    i19 = a3;
                                    i21 = i41;
                                    i20 = i4;
                                    i17 = -1;
                                    i18 = 0;
                                } else {
                                    a3 = com.fyber.inneractive.sdk.protobuf.g.a(c2, bArr2, i42, i16, fVar2);
                                    k1Var.add(fVar2.c);
                                    i33 = i43;
                                }
                            }
                            i19 = a3;
                            i21 = i41;
                            i20 = i4;
                            i17 = -1;
                            i18 = 0;
                        } else {
                            i6 = i22;
                            i7 = i23;
                            i8 = i32;
                            i9 = i41;
                            unsafe = unsafe2;
                            i5 = i33;
                        }
                        i11 = i8;
                        i18 = i9;
                        i23 = i7;
                        obj2 = obj;
                        com.fyber.inneractive.sdk.protobuf.z0 z0Var = (com.fyber.inneractive.sdk.protobuf.z0) obj2;
                        n3Var = z0Var.unknownFields;
                        if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
                            n3Var = new com.fyber.inneractive.sdk.protobuf.n3();
                            z0Var.unknownFields = n3Var;
                        }
                        i19 = com.fyber.inneractive.sdk.protobuf.g.a(i5, bArr, i11, i2, n3Var, fVar);
                        i21 = i18;
                        i22 = i6;
                        i2Var = this;
                        bArr2 = bArr;
                        i16 = i2;
                        fVar2 = fVar;
                        i20 = i4;
                        unsafe2 = unsafe;
                        i17 = -1;
                        i18 = 0;
                    }
                }
                com.fyber.inneractive.sdk.protobuf.z0 z0Var2 = (com.fyber.inneractive.sdk.protobuf.z0) obj2;
                n3Var = z0Var2.unknownFields;
                if (n3Var == com.fyber.inneractive.sdk.protobuf.n3.f) {
                }
                i19 = com.fyber.inneractive.sdk.protobuf.g.a(i5, bArr, i11, i2, n3Var, fVar);
                i21 = i18;
                i22 = i6;
                i2Var = this;
                bArr2 = bArr;
                i16 = i2;
                fVar2 = fVar;
                i20 = i4;
                unsafe2 = unsafe;
                i17 = -1;
                i18 = 0;
            }
            int i44 = i22;
            sun.misc.Unsafe unsafe4 = unsafe2;
            if (i23 != 1048575) {
                unsafe4.putInt(obj2, i23, i44);
            }
            if (i19 != i2) {
                throw new com.fyber.inneractive.sdk.protobuf.n1("Failed to parse the message.");
            }
            return;
        }
        a(obj, bArr, i, i2, 0, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(java.lang.Object obj) {
        int i = 1048575;
        int i2 = 0;
        for (int i3 = 0; i3 < this.j; i3++) {
            int i4 = this.i[i3];
            int[] iArr = this.f4197a;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i) {
                if (i8 != 1048575) {
                    i2 = r.getInt(obj, i8);
                }
                i = i8;
            }
            if ((268435456 & i6) != 0) {
                if (i == 1048575) {
                    if (!a(i4, obj)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int i10 = (267386880 & i6) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (a(obj, i5, i4) && !c(i4).a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, i6 & 1048575))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 != 50) {
                            continue;
                        } else {
                            com.fyber.inneractive.sdk.protobuf.z1 z1Var = this.p;
                            java.lang.Object e = com.fyber.inneractive.sdk.protobuf.x3.e(obj, i6 & 1048575);
                            z1Var.getClass();
                            if (!((com.fyber.inneractive.sdk.protobuf.y1) e).isEmpty()) {
                                java.lang.Object b = b(i4);
                                this.p.getClass();
                                b.getClass();
                                throw new java.lang.ClassCastException();
                            }
                        }
                    }
                }
                java.util.List list = (java.util.List) com.fyber.inneractive.sdk.protobuf.x3.e(obj, i6 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    com.fyber.inneractive.sdk.protobuf.t2 c = c(i4);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!c.a(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (i == 1048575) {
                if (!a(i4, obj)) {
                    continue;
                }
                if (c(i4).a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, i6 & 1048575))) {
                    return false;
                }
            } else {
                if ((i9 & i2) == 0) {
                    continue;
                }
                if (c(i4).a(com.fyber.inneractive.sdk.protobuf.x3.e(obj, i6 & 1048575))) {
                }
            }
        }
        if (this.f) {
            this.o.getClass();
            if (!((com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage) obj).extensions.c()) {
                return false;
            }
        }
        return true;
    }

    public static void a(int i, java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.c0 c0Var) {
        if (obj instanceof java.lang.String) {
            c0Var.f4181a.a((java.lang.String) obj, i);
        } else {
            c0Var.f4181a.a(i, (com.fyber.inneractive.sdk.protobuf.s) obj);
        }
    }

    public final void a(java.lang.Object obj, int i, com.fyber.inneractive.sdk.protobuf.s2 s2Var) {
        if ((536870912 & i) != 0) {
            s2Var.b(this.m.b(obj, i & 1048575));
        } else {
            s2Var.q(this.m.b(obj, i & 1048575));
        }
    }

    public final void a(java.lang.Object obj, int i, com.fyber.inneractive.sdk.protobuf.s2 s2Var, com.fyber.inneractive.sdk.protobuf.t2 t2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        s2Var.b(this.m.b(obj, i & 1048575), t2Var, h0Var);
    }

    public final void a(java.lang.Object obj, long j, com.fyber.inneractive.sdk.protobuf.s2 s2Var, com.fyber.inneractive.sdk.protobuf.t2 t2Var, com.fyber.inneractive.sdk.protobuf.h0 h0Var) {
        s2Var.a(this.m.b(obj, j), t2Var, h0Var);
    }

    public final boolean a(int i, java.lang.Object obj) {
        int[] iArr = this.f4197a;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & com.fyber.inneractive.sdk.protobuf.x3.c(obj, j)) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return com.fyber.inneractive.sdk.protobuf.x3.c.c(obj, j2) != 0.0d;
            case 1:
                return com.fyber.inneractive.sdk.protobuf.x3.c.d(obj, j2) != 0.0f;
            case 2:
                return com.fyber.inneractive.sdk.protobuf.x3.d(obj, j2) != 0;
            case 3:
                return com.fyber.inneractive.sdk.protobuf.x3.d(obj, j2) != 0;
            case 4:
                return com.fyber.inneractive.sdk.protobuf.x3.c(obj, j2) != 0;
            case 5:
                return com.fyber.inneractive.sdk.protobuf.x3.d(obj, j2) != 0;
            case 6:
                return com.fyber.inneractive.sdk.protobuf.x3.c(obj, j2) != 0;
            case 7:
                return com.fyber.inneractive.sdk.protobuf.x3.c.a(obj, j2);
            case 8:
                java.lang.Object e = com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2);
                if (e instanceof java.lang.String) {
                    return !((java.lang.String) e).isEmpty();
                }
                if (e instanceof com.fyber.inneractive.sdk.protobuf.s) {
                    return !com.fyber.inneractive.sdk.protobuf.s.b.equals(e);
                }
                throw new java.lang.IllegalArgumentException();
            case 9:
                return com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2) != null;
            case 10:
                return !com.fyber.inneractive.sdk.protobuf.s.b.equals(com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2));
            case 11:
                return com.fyber.inneractive.sdk.protobuf.x3.c(obj, j2) != 0;
            case 12:
                return com.fyber.inneractive.sdk.protobuf.x3.c(obj, j2) != 0;
            case 13:
                return com.fyber.inneractive.sdk.protobuf.x3.c(obj, j2) != 0;
            case 14:
                return com.fyber.inneractive.sdk.protobuf.x3.d(obj, j2) != 0;
            case 15:
                return com.fyber.inneractive.sdk.protobuf.x3.c(obj, j2) != 0;
            case 16:
                return com.fyber.inneractive.sdk.protobuf.x3.d(obj, j2) != 0;
            case 17:
                return com.fyber.inneractive.sdk.protobuf.x3.e(obj, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
    }

    public final boolean a(java.lang.Object obj, int i, int i2) {
        return com.fyber.inneractive.sdk.protobuf.x3.c(obj, (long) (this.f4197a[i2 + 2] & 1048575)) == i;
    }

    public final boolean a(int i, java.lang.Object obj, java.lang.Object obj2) {
        return a(i, obj) == a(i, obj2);
    }

    public final int a(int i, int i2) {
        int length = (this.f4197a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f4197a[i4];
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
}
