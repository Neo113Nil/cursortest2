package com.google.android.gms.internal.ads;

import I.C0160m;
import a3.AbstractC0467k;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.AbstractC2107A;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.hC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062hC implements InterfaceC1554sC {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f13726k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f13727l = CC.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f13728a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f13729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13730c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13731d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1464qB f13732e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f13733g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13734h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final C1543s1 f13735j;

    public C1062hC(int[] iArr, Object[] objArr, int i, int i5, AbstractC1464qB abstractC1464qB, int[] iArr2, int i6, int i7, C1543s1 c1543s1, Fz fz) {
        this.f13728a = iArr;
        this.f13729b = objArr;
        this.f13730c = i;
        this.f13731d = i5;
        this.f = abstractC1464qB instanceof MB;
        this.f13733g = iArr2;
        this.f13734h = i6;
        this.i = i7;
        this.f13735j = c1543s1;
        this.f13732e = abstractC1464qB;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1062hC B(C1375oC c1375oC, C1543s1 c1543s1, Fz fz) {
        int i;
        int charAt;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char charAt2;
        int i12;
        char charAt3;
        int i13;
        char charAt4;
        int i14;
        char charAt5;
        int i15;
        char charAt6;
        int i16;
        char charAt7;
        int i17;
        char charAt8;
        int i18;
        char charAt9;
        int i19;
        int i20;
        int i21;
        Object[] objArr;
        int i22;
        int i23;
        int i24;
        int objectFieldOffset;
        int i25;
        String str;
        char c5;
        int i26;
        int i27;
        int i28;
        int i29;
        Field m5;
        int i30;
        char charAt10;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field m6;
        Object obj2;
        Field m7;
        int i37;
        char charAt11;
        int i38;
        int i39;
        char charAt12;
        int i40;
        char charAt13;
        int i41;
        char charAt14;
        if (!(c1375oC instanceof C1375oC)) {
            c1375oC.getClass();
            throw new ClassCastException();
        }
        String str2 = c1375oC.f14783b;
        int length = str2.length();
        char c6 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i = i42 + 1;
                if (str2.charAt(i42) < 55296) {
                    break;
                }
                i42 = i;
            }
        } else {
            i = 1;
        }
        int i43 = i + 1;
        int charAt15 = str2.charAt(i);
        if (charAt15 >= 55296) {
            int i44 = charAt15 & 8191;
            int i45 = 13;
            while (true) {
                i41 = i43 + 1;
                charAt14 = str2.charAt(i43);
                if (charAt14 < 55296) {
                    break;
                }
                i44 |= (charAt14 & 8191) << i45;
                i45 += 13;
                i43 = i41;
            }
            charAt15 = i44 | (charAt14 << i45);
            i43 = i41;
        }
        if (charAt15 == 0) {
            i7 = 0;
            i9 = 0;
            charAt = 0;
            i6 = 0;
            i8 = 0;
            i10 = 0;
            iArr = f13726k;
            i5 = 0;
        } else {
            int i46 = i43 + 1;
            int charAt16 = str2.charAt(i43);
            if (charAt16 >= 55296) {
                int i47 = charAt16 & 8191;
                int i48 = 13;
                while (true) {
                    i18 = i46 + 1;
                    charAt9 = str2.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i18;
                }
                charAt16 = i47 | (charAt9 << i48);
                i46 = i18;
            }
            int i49 = i46 + 1;
            int charAt17 = str2.charAt(i46);
            if (charAt17 >= 55296) {
                int i50 = charAt17 & 8191;
                int i51 = 13;
                while (true) {
                    i17 = i49 + 1;
                    charAt8 = str2.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i17;
                }
                charAt17 = i50 | (charAt8 << i51);
                i49 = i17;
            }
            int i52 = i49 + 1;
            int charAt18 = str2.charAt(i49);
            if (charAt18 >= 55296) {
                int i53 = charAt18 & 8191;
                int i54 = 13;
                while (true) {
                    i16 = i52 + 1;
                    charAt7 = str2.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i16;
                }
                charAt18 = i53 | (charAt7 << i54);
                i52 = i16;
            }
            int i55 = i52 + 1;
            int charAt19 = str2.charAt(i52);
            if (charAt19 >= 55296) {
                int i56 = charAt19 & 8191;
                int i57 = 13;
                while (true) {
                    i15 = i55 + 1;
                    charAt6 = str2.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i15;
                }
                charAt19 = i56 | (charAt6 << i57);
                i55 = i15;
            }
            int i58 = i55 + 1;
            charAt = str2.charAt(i55);
            if (charAt >= 55296) {
                int i59 = charAt & 8191;
                int i60 = 13;
                while (true) {
                    i14 = i58 + 1;
                    charAt5 = str2.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i14;
                }
                charAt = i59 | (charAt5 << i60);
                i58 = i14;
            }
            int i61 = i58 + 1;
            int charAt20 = str2.charAt(i58);
            if (charAt20 >= 55296) {
                int i62 = charAt20 & 8191;
                int i63 = 13;
                while (true) {
                    i13 = i61 + 1;
                    charAt4 = str2.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i62 |= (charAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i13;
                }
                charAt20 = i62 | (charAt4 << i63);
                i61 = i13;
            }
            int i64 = i61 + 1;
            int charAt21 = str2.charAt(i61);
            if (charAt21 >= 55296) {
                int i65 = charAt21 & 8191;
                int i66 = 13;
                while (true) {
                    i12 = i64 + 1;
                    charAt3 = str2.charAt(i64);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i65 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i64 = i12;
                }
                charAt21 = i65 | (charAt3 << i66);
                i64 = i12;
            }
            int i67 = i64 + 1;
            int charAt22 = str2.charAt(i64);
            if (charAt22 >= 55296) {
                int i68 = charAt22 & 8191;
                int i69 = 13;
                while (true) {
                    i11 = i67 + 1;
                    charAt2 = str2.charAt(i67);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i68 |= (charAt2 & 8191) << i69;
                    i69 += 13;
                    i67 = i11;
                }
                charAt22 = i68 | (charAt2 << i69);
                i67 = i11;
            }
            int i70 = charAt16 + charAt16 + charAt17;
            i5 = charAt16;
            i43 = i67;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i71 = charAt20;
            i6 = charAt18;
            i7 = i71;
            i8 = charAt19;
            i9 = i70;
            i10 = charAt22;
        }
        Unsafe unsafe = f13727l;
        Class<?> cls = c1375oC.f14782a.getClass();
        int i72 = i10 + i7;
        int i73 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr2 = new Object[i73];
        int i74 = i72;
        int i75 = i10;
        int i76 = 0;
        int i77 = 0;
        while (i43 < length) {
            int i78 = i43 + 1;
            int charAt23 = str2.charAt(i43);
            if (charAt23 >= c6) {
                int i79 = charAt23 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i40 = i80 + 1;
                    charAt13 = str2.charAt(i80);
                    if (charAt13 < c6) {
                        break;
                    }
                    i79 |= (charAt13 & 8191) << i81;
                    i81 += 13;
                    i80 = i40;
                }
                charAt23 = i79 | (charAt13 << i81);
                i19 = i40;
            } else {
                i19 = i78;
            }
            int i82 = i19 + 1;
            int charAt24 = str2.charAt(i19);
            if (charAt24 >= c6) {
                int i83 = charAt24 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i39 = i84 + 1;
                    charAt12 = str2.charAt(i84);
                    i20 = length;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i83 |= (charAt12 & 8191) << i85;
                    i85 += 13;
                    i84 = i39;
                    length = i20;
                }
                charAt24 = i83 | (charAt12 << i85);
                i21 = i39;
            } else {
                i20 = length;
                i21 = i82;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i76] = i77;
                i76++;
            }
            int i86 = charAt24 & 255;
            int i87 = charAt23;
            int i88 = charAt24 & 2048;
            Object[] objArr3 = c1375oC.f14784c;
            if (i86 >= 51) {
                int i89 = i21 + 1;
                int charAt25 = str2.charAt(i21);
                if (charAt25 >= 55296) {
                    int i90 = charAt25 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i37 = i91 + 1;
                        charAt11 = str2.charAt(i91);
                        i38 = i90;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i90 = i38 | ((charAt11 & 8191) << i92);
                        i92 += 13;
                        i91 = i37;
                    }
                    charAt25 = i38 | (charAt11 << i92);
                    i34 = i37;
                } else {
                    i34 = i89;
                }
                int i93 = charAt25;
                int i94 = i86 - 51;
                int i95 = i34;
                if (i94 == 9 || i94 == 17) {
                    i35 = i9 + 1;
                    int i96 = i77 / 3;
                    objArr2[i96 + i96 + 1] = objArr3[i9];
                } else {
                    if (i94 == 12) {
                        if (c1375oC.a() == 1 || i88 != 0) {
                            i35 = i9 + 1;
                            int i97 = i77 / 3;
                            objArr2[i97 + i97 + 1] = objArr3[i9];
                        } else {
                            i36 = 0;
                            int i98 = i93 + i93;
                            obj = objArr3[i98];
                            int i99 = i36;
                            if (obj instanceof Field) {
                                m6 = (Field) obj;
                            } else {
                                m6 = m(cls, (String) obj);
                                objArr3[i98] = m6;
                            }
                            int i100 = i5;
                            objArr = objArr2;
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m6);
                            int i101 = i98 + 1;
                            obj2 = objArr3[i101];
                            if (obj2 instanceof Field) {
                                m7 = (Field) obj2;
                            } else {
                                m7 = m(cls, (String) obj2);
                                objArr3[i101] = m7;
                            }
                            int objectFieldOffset3 = (int) unsafe.objectFieldOffset(m7);
                            i22 = i100;
                            i24 = i99;
                            str = str2;
                            i23 = i9;
                            i26 = i95;
                            i28 = 0;
                            c5 = 55296;
                            i25 = objectFieldOffset3;
                            i29 = objectFieldOffset2;
                        }
                    }
                    i36 = i88;
                    int i982 = i93 + i93;
                    obj = objArr3[i982];
                    int i992 = i36;
                    if (obj instanceof Field) {
                    }
                    int i1002 = i5;
                    objArr = objArr2;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m6);
                    int i1012 = i982 + 1;
                    obj2 = objArr3[i1012];
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset32 = (int) unsafe.objectFieldOffset(m7);
                    i22 = i1002;
                    i24 = i992;
                    str = str2;
                    i23 = i9;
                    i26 = i95;
                    i28 = 0;
                    c5 = 55296;
                    i25 = objectFieldOffset32;
                    i29 = objectFieldOffset22;
                }
                i9 = i35;
                i36 = i88;
                int i9822 = i93 + i93;
                obj = objArr3[i9822];
                int i9922 = i36;
                if (obj instanceof Field) {
                }
                int i10022 = i5;
                objArr = objArr2;
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(m6);
                int i10122 = i9822 + 1;
                obj2 = objArr3[i10122];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(m7);
                i22 = i10022;
                i24 = i9922;
                str = str2;
                i23 = i9;
                i26 = i95;
                i28 = 0;
                c5 = 55296;
                i25 = objectFieldOffset322;
                i29 = objectFieldOffset222;
            } else {
                int i102 = i5;
                objArr = objArr2;
                int i103 = i9 + 1;
                Field m8 = m(cls, (String) objArr3[i9]);
                i22 = i102;
                if (i86 == 9 || i86 == 17) {
                    i23 = i103;
                    int i104 = i77 / 3;
                    objArr[i104 + i104 + 1] = m8.getType();
                } else {
                    if (i86 == 27) {
                        i31 = i103;
                        i32 = 1;
                        i33 = i9 + 2;
                    } else if (i86 == 49) {
                        i33 = i9 + 2;
                        i31 = i103;
                        i32 = 1;
                    } else {
                        if (i86 == 12 || i86 == 30 || i86 == 44) {
                            i23 = i103;
                            if (c1375oC.a() == 1 || i88 != 0) {
                                i33 = i9 + 2;
                                int i105 = i77 / 3;
                                objArr[i105 + i105 + 1] = objArr3[i23];
                                i23 = i33;
                            }
                        } else if (i86 == 50) {
                            int i106 = i9 + 2;
                            int i107 = i75 + 1;
                            iArr[i75] = i77;
                            int i108 = i77 / 3;
                            int i109 = i108 + i108;
                            objArr[i109] = objArr3[i103];
                            if (i88 != 0) {
                                objArr[i109 + 1] = objArr3[i106];
                                i24 = i88;
                                i75 = i107;
                                i23 = i9 + 3;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(m8);
                                i25 = 1048575;
                                if ((charAt24 & 4096) != 0 || i86 > 17) {
                                    str = str2;
                                    c5 = 55296;
                                    i26 = i21;
                                    i27 = 0;
                                } else {
                                    i26 = i21 + 1;
                                    int charAt26 = str2.charAt(i21);
                                    if (charAt26 >= 55296) {
                                        int i110 = charAt26 & 8191;
                                        int i111 = 13;
                                        while (true) {
                                            i30 = i26 + 1;
                                            charAt10 = str2.charAt(i26);
                                            if (charAt10 < 55296) {
                                                break;
                                            }
                                            i110 |= (charAt10 & 8191) << i111;
                                            i111 += 13;
                                            i26 = i30;
                                        }
                                        charAt26 = i110 | (charAt10 << i111);
                                        i26 = i30;
                                    }
                                    int i112 = (charAt26 / 32) + i22 + i22;
                                    Object obj3 = objArr3[i112];
                                    str = str2;
                                    if (obj3 instanceof Field) {
                                        m5 = (Field) obj3;
                                    } else {
                                        m5 = m(cls, (String) obj3);
                                        objArr3[i112] = m5;
                                    }
                                    i27 = charAt26 % 32;
                                    i25 = (int) unsafe.objectFieldOffset(m5);
                                    c5 = 55296;
                                }
                                if (i86 >= 18 && i86 <= 49) {
                                    iArr[i74] = objectFieldOffset;
                                    i74++;
                                }
                                i28 = i27;
                                i29 = objectFieldOffset;
                            } else {
                                i75 = i107;
                                i23 = i106;
                            }
                        } else {
                            i23 = i103;
                        }
                        i24 = 0;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(m8);
                        i25 = 1048575;
                        if ((charAt24 & 4096) != 0) {
                        }
                        str = str2;
                        c5 = 55296;
                        i26 = i21;
                        i27 = 0;
                        if (i86 >= 18) {
                            iArr[i74] = objectFieldOffset;
                            i74++;
                        }
                        i28 = i27;
                        i29 = objectFieldOffset;
                    }
                    int i113 = i77 / 3;
                    objArr[i113 + i113 + i32] = objArr3[i31];
                    i23 = i33;
                }
                i24 = i88;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m8);
                i25 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                c5 = 55296;
                i26 = i21;
                i27 = 0;
                if (i86 >= 18) {
                }
                i28 = i27;
                i29 = objectFieldOffset;
            }
            int i114 = i77 + 1;
            iArr2[i77] = i87;
            int i115 = i77 + 2;
            int i116 = i28;
            iArr2[i114] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i24 != 0 ? Integer.MIN_VALUE : 0) | (i86 << 20) | i29;
            i77 += 3;
            iArr2[i115] = (i116 << 20) | i25;
            i43 = i26;
            c6 = c5;
            length = i20;
            i5 = i22;
            i9 = i23;
            str2 = str;
            objArr2 = objArr;
        }
        return new C1062hC(iArr2, objArr2, i6, i8, c1375oC.f14782a, iArr, i10, i72, c1543s1, fz);
    }

    public static int C(long j5, Object obj) {
        return ((Integer) CC.i(j5, obj)).intValue();
    }

    public static int E(int i) {
        return (i >>> 20) & 255;
    }

    public static long G(long j5, Object obj) {
        return ((Long) CC.i(j5, obj)).longValue();
    }

    public static Field m(Class cls, String str) {
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

    public static void n(Object obj) {
        if (!y(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean y(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof MB) {
            return ((MB) obj).r();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:538:0x00db, code lost:
    
        r3 = r9;
        r9 = r10;
        r6 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0cee, code lost:
    
        r1 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0138, code lost:
    
        r5 = r38;
        r3 = r9;
        r9 = r10;
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x013d, code lost:
    
        r8 = r12;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d2b, code lost:
    
        if (r1 == 1048575) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0d2d, code lost:
    
        r18.putInt(r9, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d33, code lost:
    
        r2 = r34.f13734h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x023c, code lost:
    
        r5 = r38;
        r3 = r1;
        r14 = r2;
        r1 = r9;
        r9 = r10;
        r8 = r12;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0244, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d39, code lost:
    
        if (r2 >= r34.i) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d3b, code lost:
    
        J(r34.f13733g[r2], r9, r37);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x02d5, code lost:
    
        r9 = r10;
        r8 = r12;
        r3 = r13;
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d49, code lost:
    
        if (r0 != 0) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0347, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0d4b, code lost:
    
        if (r4 != r5) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0d53, code lost:
    
        throw new com.google.android.gms.internal.ads.XB("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0d58, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0d54, code lost:
    
        if (r4 > r5) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0d56, code lost:
    
        if (r15 != r0) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0d5e, code lost:
    
        throw new com.google.android.gms.internal.ads.XB("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0cc9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0cdf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0a14 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0a26 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A(Object obj, byte[] bArr, int i, int i5, int i6, C1598tB c1598tB) {
        int i7;
        Unsafe unsafe;
        int i8;
        Object obj2;
        Object obj3;
        int i9;
        int i10;
        int i11;
        int i12;
        C1598tB c1598tB2;
        C1779xC c1779xC;
        int i13;
        byte[] bArr2;
        int i14;
        int i15;
        byte[] bArr3;
        Unsafe unsafe2;
        int i16;
        int i17;
        int i18;
        C1598tB c1598tB3;
        Object obj4;
        Object obj5;
        byte[] bArr4;
        int i19;
        C1598tB c1598tB4;
        Object obj6;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        C1598tB c1598tB5;
        C1779xC c1779xC2;
        int i20;
        int i21;
        int i22;
        byte[] bArr8;
        C1598tB c1598tB6;
        int i23;
        int e3;
        byte[] bArr9;
        int i24;
        byte[] bArr10;
        int i25;
        int i26;
        int h02;
        int i27;
        int i28;
        C1598tB c1598tB7;
        int e02;
        int i29;
        int i30;
        C1598tB c1598tB8;
        UB ub;
        int g02;
        byte[] bArr11;
        int i31;
        int i32;
        byte[] bArr12;
        int i33;
        int e03;
        int e04;
        C1062hC c1062hC = this;
        Object obj7 = obj;
        byte[] bArr13 = bArr;
        int i34 = i5;
        C1598tB c1598tB9 = c1598tB;
        n(obj7);
        Unsafe unsafe3 = f13727l;
        int i35 = i;
        int i36 = -1;
        int i37 = 0;
        int i38 = 1048575;
        int i39 = 0;
        int i40 = 0;
        while (true) {
            int i41 = 1048575;
            while (true) {
                if (i35 < i34) {
                    int i42 = i35 + 1;
                    int i43 = bArr13[i35];
                    if (i43 < 0) {
                        i42 = AbstractC0952et.f0(i43, bArr13, i42, c1598tB9);
                        i43 = c1598tB9.f15638a;
                    }
                    int i44 = i42;
                    i40 = i43;
                    obj2 = null;
                    i9 = i40 >>> 3;
                    int i45 = c1062hC.f13731d;
                    int i46 = c1062hC.f13730c;
                    if (i9 > i36) {
                        i11 = (i9 < i46 || i9 > i45) ? -1 : c1062hC.D(i9, i37 / 3);
                        i10 = 0;
                    } else if (i9 < i46 || i9 > i45) {
                        i10 = 0;
                        i11 = -1;
                    } else {
                        i10 = 0;
                        i11 = c1062hC.D(i9, 0);
                    }
                    int i47 = i11;
                    C1779xC c1779xC3 = C1779xC.f;
                    if (i47 == -1) {
                        i7 = i6;
                        unsafe = unsafe3;
                        i12 = i44;
                        c1598tB2 = c1598tB9;
                        c1779xC = c1779xC3;
                        i8 = i38;
                        i37 = i10;
                        i13 = i40;
                        bArr2 = bArr;
                        obj3 = obj7;
                        i14 = i9;
                    } else {
                        int i48 = i40 & 7;
                        int[] iArr = c1062hC.f13728a;
                        int i49 = iArr[i47 + 1];
                        int E5 = E(i49);
                        long j5 = i49 & i41;
                        if (E5 <= 17) {
                            int i50 = iArr[i47 + 2];
                            int i51 = 1 << (i50 >>> 20);
                            int i52 = i50 & i41;
                            if (i52 != i38) {
                                int i53 = i41;
                                if (i38 != i53) {
                                    unsafe3.putInt(obj7, i38, i39);
                                }
                                i15 = i52;
                                i39 = i52 == i53 ? 0 : unsafe3.getInt(obj7, i52);
                            } else {
                                i15 = i38;
                            }
                            switch (E5) {
                                case 0:
                                    bArr3 = bArr;
                                    unsafe2 = unsafe3;
                                    i16 = i39;
                                    i17 = i44;
                                    i18 = i40;
                                    c1598tB3 = c1598tB;
                                    if (i48 == 1) {
                                        i39 = i16 | i51;
                                        CC.f7973c.g1(obj7, j5, Double.longBitsToDouble(AbstractC0952et.k0(i17, bArr3)));
                                        i34 = i5;
                                        obj7 = obj7;
                                        i35 = i17 + 8;
                                        break;
                                    }
                                    obj4 = obj7;
                                    i7 = i6;
                                    i12 = i17;
                                    i8 = i15;
                                    bArr2 = bArr3;
                                    i13 = i18;
                                    i39 = i16;
                                    c1779xC = c1779xC3;
                                    unsafe = unsafe2;
                                    i37 = i47;
                                    c1598tB2 = c1598tB3;
                                    i14 = i9;
                                    obj3 = obj4;
                                    break;
                                case 1:
                                    bArr3 = bArr;
                                    unsafe2 = unsafe3;
                                    i16 = i39;
                                    i17 = i44;
                                    i18 = i40;
                                    c1598tB3 = c1598tB;
                                    if (i48 == 5) {
                                        i39 = i16 | i51;
                                        CC.f7973c.i1(obj7, j5, Float.intBitsToFloat(AbstractC0952et.z(i17, bArr3)));
                                        i34 = i5;
                                        i35 = i17 + 4;
                                        break;
                                    }
                                    obj4 = obj7;
                                    i7 = i6;
                                    i12 = i17;
                                    i8 = i15;
                                    bArr2 = bArr3;
                                    i13 = i18;
                                    i39 = i16;
                                    c1779xC = c1779xC3;
                                    unsafe = unsafe2;
                                    i37 = i47;
                                    c1598tB2 = c1598tB3;
                                    i14 = i9;
                                    obj3 = obj4;
                                    break;
                                case 2:
                                case 3:
                                    bArr3 = bArr;
                                    i16 = i39;
                                    i17 = i44;
                                    i18 = i40;
                                    c1598tB3 = c1598tB;
                                    if (i48 == 0) {
                                        i39 = i16 | i51;
                                        int h03 = AbstractC0952et.h0(bArr3, i17, c1598tB3);
                                        unsafe3.putLong(obj7, j5, c1598tB3.f15639b);
                                        i34 = i5;
                                        i35 = h03;
                                        break;
                                    }
                                    unsafe2 = unsafe3;
                                    obj4 = obj7;
                                    i7 = i6;
                                    i12 = i17;
                                    i8 = i15;
                                    bArr2 = bArr3;
                                    i13 = i18;
                                    i39 = i16;
                                    c1779xC = c1779xC3;
                                    unsafe = unsafe2;
                                    i37 = i47;
                                    c1598tB2 = c1598tB3;
                                    i14 = i9;
                                    obj3 = obj4;
                                    break;
                                case 4:
                                case 11:
                                    bArr3 = bArr;
                                    i16 = i39;
                                    i17 = i44;
                                    i18 = i40;
                                    c1598tB3 = c1598tB;
                                    if (i48 == 0) {
                                        i39 = i16 | i51;
                                        i35 = AbstractC0952et.e0(bArr3, i17, c1598tB3);
                                        unsafe3.putInt(obj7, j5, c1598tB3.f15638a);
                                        i34 = i5;
                                        break;
                                    }
                                    unsafe2 = unsafe3;
                                    obj4 = obj7;
                                    i7 = i6;
                                    i12 = i17;
                                    i8 = i15;
                                    bArr2 = bArr3;
                                    i13 = i18;
                                    i39 = i16;
                                    c1779xC = c1779xC3;
                                    unsafe = unsafe2;
                                    i37 = i47;
                                    c1598tB2 = c1598tB3;
                                    i14 = i9;
                                    obj3 = obj4;
                                    break;
                                case 5:
                                case 14:
                                    unsafe2 = unsafe3;
                                    Object obj8 = obj7;
                                    i16 = i39;
                                    i17 = i44;
                                    i18 = i40;
                                    if (i48 != 1) {
                                        c1598tB3 = c1598tB;
                                        obj7 = obj8;
                                        bArr3 = bArr;
                                        obj4 = obj7;
                                        i7 = i6;
                                        i12 = i17;
                                        i8 = i15;
                                        bArr2 = bArr3;
                                        i13 = i18;
                                        i39 = i16;
                                        c1779xC = c1779xC3;
                                        unsafe = unsafe2;
                                        i37 = i47;
                                        c1598tB2 = c1598tB3;
                                        i14 = i9;
                                        obj3 = obj4;
                                        break;
                                    } else {
                                        obj7 = obj8;
                                        c1598tB3 = c1598tB;
                                        bArr3 = bArr;
                                        unsafe3 = unsafe2;
                                        unsafe3.putLong(obj7, j5, AbstractC0952et.k0(i17, bArr));
                                        i34 = i5;
                                        i35 = i17 + 8;
                                        i39 = i16 | i51;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    c1598tB9 = c1598tB;
                                    unsafe2 = unsafe3;
                                    obj5 = obj7;
                                    i16 = i39;
                                    i17 = i44;
                                    bArr4 = bArr;
                                    i18 = i40;
                                    if (i48 != 5) {
                                        Object obj9 = obj5;
                                        bArr3 = bArr4;
                                        obj4 = obj9;
                                        c1598tB3 = c1598tB9;
                                        i7 = i6;
                                        i12 = i17;
                                        i8 = i15;
                                        bArr2 = bArr3;
                                        i13 = i18;
                                        i39 = i16;
                                        c1779xC = c1779xC3;
                                        unsafe = unsafe2;
                                        i37 = i47;
                                        c1598tB2 = c1598tB3;
                                        i14 = i9;
                                        obj3 = obj4;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj5, j5, AbstractC0952et.z(i17, bArr4));
                                        i34 = i5;
                                        i35 = i17 + 4;
                                        i39 = i16 | i51;
                                        i37 = i47;
                                        obj7 = obj5;
                                        i40 = i18;
                                        i36 = i9;
                                        i41 = 1048575;
                                        bArr13 = bArr4;
                                        unsafe3 = unsafe2;
                                        i38 = i15;
                                    }
                                case 7:
                                    c1598tB9 = c1598tB;
                                    unsafe2 = unsafe3;
                                    obj5 = obj7;
                                    i16 = i39;
                                    i17 = i44;
                                    bArr4 = bArr;
                                    i18 = i40;
                                    if (i48 == 0) {
                                        i19 = i16 | i51;
                                        i35 = AbstractC0952et.h0(bArr4, i17, c1598tB9);
                                        CC.f7973c.e1(obj5, j5, c1598tB9.f15639b != 0);
                                        break;
                                    }
                                    Object obj92 = obj5;
                                    bArr3 = bArr4;
                                    obj4 = obj92;
                                    c1598tB3 = c1598tB9;
                                    i7 = i6;
                                    i12 = i17;
                                    i8 = i15;
                                    bArr2 = bArr3;
                                    i13 = i18;
                                    i39 = i16;
                                    c1779xC = c1779xC3;
                                    unsafe = unsafe2;
                                    i37 = i47;
                                    c1598tB2 = c1598tB3;
                                    i14 = i9;
                                    obj3 = obj4;
                                    break;
                                case 8:
                                    c1598tB9 = c1598tB;
                                    unsafe2 = unsafe3;
                                    obj5 = obj7;
                                    i16 = i39;
                                    i17 = i44;
                                    bArr4 = bArr;
                                    i18 = i40;
                                    if (i48 == 2) {
                                        if ((i49 & 536870912) != 0) {
                                            int e05 = AbstractC0952et.e0(bArr4, i17, c1598tB9);
                                            int i54 = c1598tB9.f15638a;
                                            if (i54 < 0) {
                                                throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            int i55 = i16 | i51;
                                            if (i54 == 0) {
                                                c1598tB9.f15640c = "";
                                            } else {
                                                EC.f8472a.getClass();
                                                c1598tB9.f15640c = Fz.m(bArr4, e05, i54);
                                                e05 += i54;
                                            }
                                            i35 = e05;
                                            i19 = i55;
                                        } else {
                                            i19 = i16 | i51;
                                            int e06 = AbstractC0952et.e0(bArr4, i17, c1598tB9);
                                            int i56 = c1598tB9.f15638a;
                                            if (i56 < 0) {
                                                throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i56 == 0) {
                                                c1598tB9.f15640c = "";
                                            } else {
                                                c1598tB9.f15640c = new String(bArr4, e06, i56, VB.f11871a);
                                                e06 += i56;
                                            }
                                            i35 = e06;
                                        }
                                        unsafe2.putObject(obj5, j5, c1598tB9.f15640c);
                                        break;
                                    }
                                    Object obj922 = obj5;
                                    bArr3 = bArr4;
                                    obj4 = obj922;
                                    c1598tB3 = c1598tB9;
                                    i7 = i6;
                                    i12 = i17;
                                    i8 = i15;
                                    bArr2 = bArr3;
                                    i13 = i18;
                                    i39 = i16;
                                    c1779xC = c1779xC3;
                                    unsafe = unsafe2;
                                    i37 = i47;
                                    c1598tB2 = c1598tB3;
                                    i14 = i9;
                                    obj3 = obj4;
                                    break;
                                case 9:
                                    c1598tB4 = c1598tB;
                                    obj6 = obj7;
                                    i17 = i44;
                                    if (i48 != 2) {
                                        unsafe2 = unsafe3;
                                        bArr3 = bArr;
                                        obj4 = obj6;
                                        i16 = i39;
                                        i18 = i40;
                                        c1598tB3 = c1598tB4;
                                        i7 = i6;
                                        i12 = i17;
                                        i8 = i15;
                                        bArr2 = bArr3;
                                        i13 = i18;
                                        i39 = i16;
                                        c1779xC = c1779xC3;
                                        unsafe = unsafe2;
                                        i37 = i47;
                                        c1598tB2 = c1598tB3;
                                        i14 = i9;
                                        obj3 = obj4;
                                        break;
                                    } else {
                                        i39 |= i51;
                                        Unsafe unsafe4 = unsafe3;
                                        Object k5 = c1062hC.k(i47, obj6);
                                        bArr13 = bArr;
                                        i34 = i5;
                                        c1598tB9 = c1598tB4;
                                        i35 = AbstractC0952et.j0(k5, c1062hC.I(i47), bArr13, i17, i34, c1598tB9);
                                        c1062hC.t(i47, obj6, k5);
                                        unsafe3 = unsafe4;
                                        i38 = i15;
                                        break;
                                    }
                                case 10:
                                    bArr5 = bArr;
                                    c1598tB4 = c1598tB;
                                    obj6 = obj7;
                                    i17 = i44;
                                    if (i48 == 2) {
                                        i39 |= i51;
                                        i35 = AbstractC0952et.e(bArr5, i17, c1598tB4);
                                        unsafe3.putObject(obj6, j5, c1598tB4.f15640c);
                                        break;
                                    }
                                    byte[] bArr14 = bArr5;
                                    unsafe2 = unsafe3;
                                    obj4 = obj6;
                                    bArr3 = bArr14;
                                    i16 = i39;
                                    i18 = i40;
                                    c1598tB3 = c1598tB4;
                                    i7 = i6;
                                    i12 = i17;
                                    i8 = i15;
                                    bArr2 = bArr3;
                                    i13 = i18;
                                    i39 = i16;
                                    c1779xC = c1779xC3;
                                    unsafe = unsafe2;
                                    i37 = i47;
                                    c1598tB2 = c1598tB3;
                                    i14 = i9;
                                    obj3 = obj4;
                                    break;
                                case 12:
                                    bArr5 = bArr;
                                    c1598tB4 = c1598tB;
                                    obj6 = obj7;
                                    i17 = i44;
                                    if (i48 == 0) {
                                        i35 = AbstractC0952et.e0(bArr5, i17, c1598tB4);
                                        int i57 = c1598tB4.f15638a;
                                        PB H5 = c1062hC.H(i47);
                                        if ((i49 & Integer.MIN_VALUE) != 0 && H5 != null && !H5.a(i57)) {
                                            MB mb = (MB) obj6;
                                            C1779xC c1779xC4 = mb.zzt;
                                            if (c1779xC4 == c1779xC3) {
                                                c1779xC4 = C1779xC.b();
                                                mb.zzt = c1779xC4;
                                            }
                                            c1779xC4.c(i40, Long.valueOf(i57));
                                            break;
                                        } else {
                                            i39 |= i51;
                                            unsafe3.putInt(obj6, j5, i57);
                                            break;
                                        }
                                    }
                                    byte[] bArr142 = bArr5;
                                    unsafe2 = unsafe3;
                                    obj4 = obj6;
                                    bArr3 = bArr142;
                                    i16 = i39;
                                    i18 = i40;
                                    c1598tB3 = c1598tB4;
                                    i7 = i6;
                                    i12 = i17;
                                    i8 = i15;
                                    bArr2 = bArr3;
                                    i13 = i18;
                                    i39 = i16;
                                    c1779xC = c1779xC3;
                                    unsafe = unsafe2;
                                    i37 = i47;
                                    c1598tB2 = c1598tB3;
                                    i14 = i9;
                                    obj3 = obj4;
                                    break;
                                case 15:
                                    bArr5 = bArr;
                                    c1598tB4 = c1598tB;
                                    obj6 = obj7;
                                    i17 = i44;
                                    if (i48 == 0) {
                                        i39 |= i51;
                                        i35 = AbstractC0952et.e0(bArr5, i17, c1598tB4);
                                        unsafe3.putInt(obj6, j5, AbstractC1674uy.h(c1598tB4.f15638a));
                                        break;
                                    }
                                    byte[] bArr1422 = bArr5;
                                    unsafe2 = unsafe3;
                                    obj4 = obj6;
                                    bArr3 = bArr1422;
                                    i16 = i39;
                                    i18 = i40;
                                    c1598tB3 = c1598tB4;
                                    i7 = i6;
                                    i12 = i17;
                                    i8 = i15;
                                    bArr2 = bArr3;
                                    i13 = i18;
                                    i39 = i16;
                                    c1779xC = c1779xC3;
                                    unsafe = unsafe2;
                                    i37 = i47;
                                    c1598tB2 = c1598tB3;
                                    i14 = i9;
                                    obj3 = obj4;
                                    break;
                                case 16:
                                    bArr6 = bArr;
                                    c1598tB4 = c1598tB;
                                    i17 = i44;
                                    if (i48 != 0) {
                                        bArr3 = bArr6;
                                        i16 = i39;
                                        i18 = i40;
                                        unsafe2 = unsafe3;
                                        obj4 = obj7;
                                        c1598tB3 = c1598tB4;
                                        i7 = i6;
                                        i12 = i17;
                                        i8 = i15;
                                        bArr2 = bArr3;
                                        i13 = i18;
                                        i39 = i16;
                                        c1779xC = c1779xC3;
                                        unsafe = unsafe2;
                                        i37 = i47;
                                        c1598tB2 = c1598tB3;
                                        i14 = i9;
                                        obj3 = obj4;
                                        break;
                                    } else {
                                        i39 |= i51;
                                        int h04 = AbstractC0952et.h0(bArr6, i17, c1598tB4);
                                        unsafe3.putLong(obj7, j5, AbstractC1674uy.i(c1598tB4.f15639b));
                                        i34 = i5;
                                        i35 = h04;
                                        break;
                                    }
                                default:
                                    if (i48 != 3) {
                                        bArr3 = bArr;
                                        unsafe2 = unsafe3;
                                        obj4 = obj7;
                                        i16 = i39;
                                        i17 = i44;
                                        i18 = i40;
                                        c1598tB3 = c1598tB;
                                        i7 = i6;
                                        i12 = i17;
                                        i8 = i15;
                                        bArr2 = bArr3;
                                        i13 = i18;
                                        i39 = i16;
                                        c1779xC = c1779xC3;
                                        unsafe = unsafe2;
                                        i37 = i47;
                                        c1598tB2 = c1598tB3;
                                        i14 = i9;
                                        obj3 = obj4;
                                        break;
                                    } else {
                                        i39 |= i51;
                                        Object k6 = c1062hC.k(i47, obj7);
                                        i35 = AbstractC0952et.i0(k6, c1062hC.I(i47), bArr, i44, i5, (i9 << 3) | 4, c1598tB);
                                        c1598tB4 = c1598tB;
                                        bArr6 = bArr;
                                        c1062hC.t(i47, obj7, k6);
                                        i34 = i5;
                                        break;
                                    }
                            }
                        } else {
                            Unsafe unsafe5 = unsafe3;
                            Object obj10 = obj7;
                            int i58 = i39;
                            int i59 = i44;
                            if (E5 != 27) {
                                if (E5 > 49) {
                                    bArr7 = bArr;
                                    i13 = i40;
                                    i8 = i38;
                                    obj3 = obj10;
                                    i59 = i59;
                                    i14 = i9;
                                    c1779xC2 = c1779xC3;
                                    unsafe = unsafe5;
                                    c1598tB5 = c1598tB;
                                    if (E5 != 50) {
                                        Unsafe unsafe6 = f13727l;
                                        long j6 = iArr[i47 + 2] & 1048575;
                                        switch (E5) {
                                            case 51:
                                                bArr2 = bArr;
                                                i20 = i47;
                                                i21 = i59;
                                                c1598tB2 = c1598tB5;
                                                c1779xC = c1779xC2;
                                                if (i48 == 1) {
                                                    i22 = i21 + 8;
                                                    unsafe6.putObject(obj3, j5, Double.valueOf(Double.longBitsToDouble(AbstractC0952et.k0(i21, bArr2))));
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    if (i22 != i21) {
                                                        i7 = i6;
                                                        i12 = i22;
                                                        i37 = i20;
                                                        i39 = i58;
                                                        break;
                                                    } else {
                                                        c1062hC = this;
                                                        bArr13 = bArr2;
                                                        i35 = i22;
                                                        obj7 = obj3;
                                                        c1598tB9 = c1598tB2;
                                                        i36 = i14;
                                                        unsafe3 = unsafe;
                                                        i37 = i20;
                                                        i39 = i58;
                                                        i38 = i8;
                                                        i41 = 1048575;
                                                        i34 = i5;
                                                        break;
                                                    }
                                                }
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                            case 52:
                                                bArr2 = bArr;
                                                i20 = i47;
                                                i21 = i59;
                                                c1598tB2 = c1598tB5;
                                                c1779xC = c1779xC2;
                                                if (i48 == 5) {
                                                    i22 = i21 + 4;
                                                    unsafe6.putObject(obj3, j5, Float.valueOf(Float.intBitsToFloat(AbstractC0952et.z(i21, bArr2))));
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                bArr2 = bArr;
                                                i20 = i47;
                                                i21 = i59;
                                                c1598tB2 = c1598tB5;
                                                c1779xC = c1779xC2;
                                                if (i48 == 0) {
                                                    i22 = AbstractC0952et.h0(bArr2, i21, c1598tB2);
                                                    unsafe6.putObject(obj3, j5, Long.valueOf(c1598tB2.f15639b));
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                bArr2 = bArr;
                                                i20 = i47;
                                                i21 = i59;
                                                c1598tB2 = c1598tB5;
                                                c1779xC = c1779xC2;
                                                if (i48 == 0) {
                                                    i22 = AbstractC0952et.e0(bArr2, i21, c1598tB2);
                                                    unsafe6.putObject(obj3, j5, Integer.valueOf(c1598tB2.f15638a));
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                bArr2 = bArr;
                                                i20 = i47;
                                                i21 = i59;
                                                c1598tB2 = c1598tB5;
                                                c1779xC = c1779xC2;
                                                if (i48 == 1) {
                                                    i22 = i21 + 8;
                                                    unsafe6.putObject(obj3, j5, Long.valueOf(AbstractC0952et.k0(i21, bArr2)));
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                bArr2 = bArr;
                                                i20 = i47;
                                                i21 = i59;
                                                c1598tB2 = c1598tB5;
                                                c1779xC = c1779xC2;
                                                if (i48 == 5) {
                                                    i22 = i21 + 4;
                                                    unsafe6.putObject(obj3, j5, Integer.valueOf(AbstractC0952et.z(i21, bArr2)));
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 58:
                                                bArr2 = bArr;
                                                i20 = i47;
                                                i21 = i59;
                                                c1598tB2 = c1598tB5;
                                                c1779xC = c1779xC2;
                                                if (i48 == 0) {
                                                    i22 = AbstractC0952et.h0(bArr2, i21, c1598tB2);
                                                    unsafe6.putObject(obj3, j5, Boolean.valueOf(c1598tB2.f15639b != 0));
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 59:
                                                bArr2 = bArr;
                                                i20 = i47;
                                                i21 = i59;
                                                c1598tB2 = c1598tB5;
                                                c1779xC = c1779xC2;
                                                if (i48 == 2) {
                                                    int e07 = AbstractC0952et.e0(bArr2, i21, c1598tB2);
                                                    int i60 = c1598tB2.f15638a;
                                                    if (i60 == 0) {
                                                        unsafe6.putObject(obj3, j5, "");
                                                    } else {
                                                        int i61 = e07 + i60;
                                                        if ((i49 & 536870912) != 0 && !EC.d(bArr2, e07, i61)) {
                                                            throw new XB("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe6.putObject(obj3, j5, new String(bArr2, e07, i60, VB.f11871a));
                                                        e07 = i61;
                                                    }
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    i22 = e07;
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 60:
                                                c1779xC = c1779xC2;
                                                if (i48 == 2) {
                                                    Object l5 = c1062hC.l(i14, i47, obj3);
                                                    int j02 = AbstractC0952et.j0(l5, c1062hC.I(i47), bArr, i59, i5, c1598tB5);
                                                    bArr2 = bArr;
                                                    c1062hC.u(i14, i47, obj3, l5);
                                                    i22 = j02;
                                                    i21 = i59;
                                                    i20 = i47;
                                                    c1598tB2 = c1598tB;
                                                    if (i22 != i21) {
                                                    }
                                                } else {
                                                    bArr2 = bArr;
                                                    i21 = i59;
                                                    i20 = i47;
                                                    c1598tB2 = c1598tB;
                                                    i22 = i21;
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                bArr8 = bArr;
                                                c1598tB6 = c1598tB5;
                                                i23 = i59;
                                                c1779xC = c1779xC2;
                                                if (i48 == 2) {
                                                    e3 = AbstractC0952et.e(bArr8, i23, c1598tB6);
                                                    unsafe6.putObject(obj3, j5, c1598tB6.f15640c);
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    i21 = i23;
                                                    bArr2 = bArr8;
                                                    i22 = e3;
                                                    i20 = i47;
                                                    c1598tB2 = c1598tB6;
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i21 = i23;
                                                bArr2 = bArr8;
                                                i20 = i47;
                                                c1598tB2 = c1598tB6;
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 63:
                                                bArr8 = bArr;
                                                c1598tB6 = c1598tB5;
                                                i23 = i59;
                                                if (i48 == 0) {
                                                    e3 = AbstractC0952et.e0(bArr8, i23, c1598tB6);
                                                    int i62 = c1598tB6.f15638a;
                                                    PB H6 = c1062hC.H(i47);
                                                    if (H6 == null || H6.a(i62)) {
                                                        c1779xC = c1779xC2;
                                                        unsafe6.putObject(obj3, j5, Integer.valueOf(i62));
                                                        unsafe6.putInt(obj3, j6, i14);
                                                    } else {
                                                        MB mb2 = (MB) obj3;
                                                        C1779xC c1779xC5 = mb2.zzt;
                                                        c1779xC = c1779xC2;
                                                        if (c1779xC5 == c1779xC) {
                                                            c1779xC5 = C1779xC.b();
                                                            mb2.zzt = c1779xC5;
                                                        }
                                                        c1779xC5.c(i13, Long.valueOf(i62));
                                                    }
                                                    i21 = i23;
                                                    bArr2 = bArr8;
                                                    i22 = e3;
                                                    i20 = i47;
                                                    c1598tB2 = c1598tB6;
                                                    if (i22 != i21) {
                                                    }
                                                } else {
                                                    c1779xC = c1779xC2;
                                                    i21 = i23;
                                                    bArr2 = bArr8;
                                                    i20 = i47;
                                                    c1598tB2 = c1598tB6;
                                                    i22 = i21;
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                break;
                                            case 66:
                                                bArr9 = bArr;
                                                c1598tB6 = c1598tB5;
                                                i24 = i59;
                                                if (i48 == 0) {
                                                    int e08 = AbstractC0952et.e0(bArr9, i24, c1598tB6);
                                                    unsafe6.putObject(obj3, j5, Integer.valueOf(AbstractC1674uy.h(c1598tB6.f15638a)));
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    i21 = i24;
                                                    bArr2 = bArr9;
                                                    i22 = e08;
                                                    i20 = i47;
                                                    c1779xC = c1779xC2;
                                                    c1598tB2 = c1598tB6;
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i21 = i24;
                                                bArr2 = bArr9;
                                                i20 = i47;
                                                c1779xC = c1779xC2;
                                                c1598tB2 = c1598tB6;
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 67:
                                                bArr9 = bArr;
                                                c1598tB6 = c1598tB5;
                                                i24 = i59;
                                                if (i48 == 0) {
                                                    int h05 = AbstractC0952et.h0(bArr9, i24, c1598tB6);
                                                    unsafe6.putObject(obj3, j5, Long.valueOf(AbstractC1674uy.i(c1598tB6.f15639b)));
                                                    unsafe6.putInt(obj3, j6, i14);
                                                    i21 = i24;
                                                    bArr2 = bArr9;
                                                    i22 = h05;
                                                    i20 = i47;
                                                    c1779xC = c1779xC2;
                                                    c1598tB2 = c1598tB6;
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                i21 = i24;
                                                bArr2 = bArr9;
                                                i20 = i47;
                                                c1779xC = c1779xC2;
                                                c1598tB2 = c1598tB6;
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                            case 68:
                                                if (i48 == 3) {
                                                    Object l6 = c1062hC.l(i14, i47, obj3);
                                                    int i02 = AbstractC0952et.i0(l6, c1062hC.I(i47), bArr, i59, i5, (i13 & (-8)) | 4, c1598tB5);
                                                    c1598tB6 = c1598tB5;
                                                    c1062hC.u(i14, i47, obj3, l6);
                                                    i21 = i59;
                                                    bArr2 = bArr;
                                                    i20 = i47;
                                                    c1779xC = c1779xC2;
                                                    i22 = i02;
                                                    c1598tB2 = c1598tB6;
                                                    if (i22 != i21) {
                                                    }
                                                }
                                                break;
                                            default:
                                                bArr2 = bArr;
                                                i20 = i47;
                                                i21 = i59;
                                                c1598tB2 = c1598tB5;
                                                c1779xC = c1779xC2;
                                                i22 = i21;
                                                if (i22 != i21) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i48 == 2) {
                                            Unsafe unsafe7 = f13727l;
                                            Object K = c1062hC.K(i47);
                                            Object object = unsafe7.getObject(obj3, j5);
                                            if (!((C0838cC) object).f12981k) {
                                                C0838cC a5 = C0838cC.f12980l.a();
                                                Fz.j(a5, object);
                                                unsafe7.putObject(obj3, j5, a5);
                                            }
                                            throw AbstractC2107A.p(K);
                                        }
                                        i7 = i6;
                                        bArr2 = bArr7;
                                        i37 = i47;
                                        i39 = i58;
                                        i12 = i59;
                                    }
                                } else {
                                    long j7 = i49;
                                    Unsafe unsafe8 = f13727l;
                                    UB ub2 = (UB) unsafe8.getObject(obj10, j5);
                                    if (!((AbstractC1508rB) ub2).f15276k) {
                                        int size = ub2.size();
                                        ub2 = ub2.b(size + size);
                                        unsafe8.putObject(obj10, j5, ub2);
                                    }
                                    UB ub3 = ub2;
                                    switch (E5) {
                                        case 18:
                                        case 35:
                                            bArr10 = bArr;
                                            i25 = i59;
                                            i13 = i40;
                                            i8 = i38;
                                            unsafe = unsafe5;
                                            obj3 = obj10;
                                            i14 = i9;
                                            c1598tB5 = c1598tB;
                                            c1779xC2 = c1779xC3;
                                            i26 = i5;
                                            if (i48 != 2) {
                                                if (i48 == 1) {
                                                    if (ub3 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    Double.longBitsToDouble(AbstractC0952et.k0(i25, bArr10));
                                                    throw null;
                                                }
                                                i35 = i25;
                                                if (i35 != i25) {
                                                    i7 = i6;
                                                    i12 = i35;
                                                    i37 = i47;
                                                    i39 = i58;
                                                    bArr2 = bArr10;
                                                    break;
                                                } else {
                                                    bArr13 = bArr10;
                                                    i34 = i26;
                                                    obj7 = obj3;
                                                    c1598tB9 = c1598tB5;
                                                    i37 = i47;
                                                    i36 = i14;
                                                    unsafe3 = unsafe;
                                                    i39 = i58;
                                                    i38 = i8;
                                                    i41 = 1048575;
                                                    break;
                                                }
                                            } else {
                                                if (ub3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                if (AbstractC0952et.e0(bArr10, i25, c1598tB5) + c1598tB5.f15638a > bArr10.length) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                        case 19:
                                        case 36:
                                            bArr10 = bArr;
                                            i25 = i59;
                                            i13 = i40;
                                            i8 = i38;
                                            unsafe = unsafe5;
                                            obj3 = obj10;
                                            i14 = i9;
                                            c1598tB5 = c1598tB;
                                            c1779xC2 = c1779xC3;
                                            i26 = i5;
                                            if (i48 == 2) {
                                                if (ub3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                if (AbstractC0952et.e0(bArr10, i25, c1598tB5) + c1598tB5.f15638a > bArr10.length) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                            if (i48 == 5) {
                                                if (ub3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                Float.intBitsToFloat(AbstractC0952et.z(i25, bArr10));
                                                throw null;
                                            }
                                            i35 = i25;
                                            if (i35 != i25) {
                                            }
                                            break;
                                        case 20:
                                        case C1639u7.zzm /* 21 */:
                                        case 37:
                                        case 38:
                                            bArr10 = bArr;
                                            i25 = i59;
                                            i13 = i40;
                                            i8 = i38;
                                            unsafe = unsafe5;
                                            obj3 = obj10;
                                            i14 = i9;
                                            c1598tB5 = c1598tB;
                                            c1779xC2 = c1779xC3;
                                            i26 = i5;
                                            if (i48 == 2) {
                                                C0794bC c0794bC = (C0794bC) ub3;
                                                i35 = AbstractC0952et.e0(bArr10, i25, c1598tB5);
                                                int i63 = c1598tB5.f15638a + i35;
                                                while (i35 < i63) {
                                                    i35 = AbstractC0952et.h0(bArr10, i35, c1598tB5);
                                                    c0794bC.f(c1598tB5.f15639b);
                                                }
                                                if (i35 != i63) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                if (i48 == 0) {
                                                    C0794bC c0794bC2 = (C0794bC) ub3;
                                                    h02 = AbstractC0952et.h0(bArr10, i25, c1598tB5);
                                                    c0794bC2.f(c1598tB5.f15639b);
                                                    while (h02 < i26) {
                                                        int e09 = AbstractC0952et.e0(bArr10, h02, c1598tB5);
                                                        if (i13 == c1598tB5.f15638a) {
                                                            h02 = AbstractC0952et.h0(bArr10, e09, c1598tB5);
                                                            c0794bC2.f(c1598tB5.f15639b);
                                                        } else {
                                                            i35 = h02;
                                                            if (i35 != i25) {
                                                            }
                                                        }
                                                    }
                                                    i35 = h02;
                                                    if (i35 != i25) {
                                                    }
                                                }
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            bArr10 = bArr;
                                            i27 = i5;
                                            i25 = i59;
                                            i28 = i40;
                                            i8 = i38;
                                            unsafe = unsafe5;
                                            obj3 = obj10;
                                            i14 = i9;
                                            c1598tB7 = c1598tB;
                                            c1779xC2 = c1779xC3;
                                            if (i48 == 2) {
                                                h02 = AbstractC0952et.a0(bArr10, i25, ub3, c1598tB7);
                                                i26 = i27;
                                                c1598tB5 = c1598tB7;
                                                i13 = i28;
                                                i35 = h02;
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                if (i48 == 0) {
                                                    i13 = i28;
                                                    i26 = i27;
                                                    c1598tB5 = c1598tB7;
                                                    i35 = AbstractC0952et.g0(i28, bArr10, i25, i27, ub3, c1598tB7);
                                                    if (i35 != i25) {
                                                    }
                                                }
                                                i26 = i27;
                                                c1598tB5 = c1598tB7;
                                                i13 = i28;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            bArr10 = bArr;
                                            i27 = i5;
                                            i25 = i59;
                                            i28 = i40;
                                            i8 = i38;
                                            unsafe = unsafe5;
                                            obj3 = obj10;
                                            i14 = i9;
                                            c1598tB7 = c1598tB;
                                            c1779xC2 = c1779xC3;
                                            if (i48 == 2) {
                                                C0794bC c0794bC3 = (C0794bC) ub3;
                                                e02 = AbstractC0952et.e0(bArr10, i25, c1598tB7);
                                                int i64 = c1598tB7.f15638a;
                                                int i65 = e02 + i64;
                                                if (i65 > bArr10.length) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                int i66 = (i64 / 8) + c0794bC3.f12779m;
                                                int length = c0794bC3.f12778l.length;
                                                if (i66 > length) {
                                                    if (length != 0) {
                                                        while (length < i66) {
                                                            length = Math.max(((length * 3) / 2) + 1, 10);
                                                        }
                                                        c0794bC3.f12778l = Arrays.copyOf(c0794bC3.f12778l, length);
                                                    } else {
                                                        c0794bC3.f12778l = new long[Math.max(i66, 10)];
                                                    }
                                                }
                                                while (e02 < i65) {
                                                    c0794bC3.f(AbstractC0952et.k0(e02, bArr10));
                                                    e02 += 8;
                                                }
                                                if (e02 != i65) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i26 = i27;
                                                i35 = e02;
                                                c1598tB5 = c1598tB7;
                                                i13 = i28;
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                if (i48 == 1) {
                                                    h02 = i25 + 8;
                                                    C0794bC c0794bC4 = (C0794bC) ub3;
                                                    c0794bC4.f(AbstractC0952et.k0(i25, bArr10));
                                                    while (h02 < i27) {
                                                        int e010 = AbstractC0952et.e0(bArr10, h02, c1598tB7);
                                                        if (i28 == c1598tB7.f15638a) {
                                                            c0794bC4.f(AbstractC0952et.k0(e010, bArr10));
                                                            h02 = e010 + 8;
                                                        } else {
                                                            i26 = i27;
                                                            c1598tB5 = c1598tB7;
                                                            i13 = i28;
                                                            i35 = h02;
                                                            if (i35 != i25) {
                                                            }
                                                        }
                                                    }
                                                    i26 = i27;
                                                    c1598tB5 = c1598tB7;
                                                    i13 = i28;
                                                    i35 = h02;
                                                    if (i35 != i25) {
                                                    }
                                                }
                                                i26 = i27;
                                                c1598tB5 = c1598tB7;
                                                i13 = i28;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            bArr10 = bArr;
                                            i27 = i5;
                                            i25 = i59;
                                            i28 = i40;
                                            i8 = i38;
                                            unsafe = unsafe5;
                                            obj3 = obj10;
                                            i14 = i9;
                                            c1598tB7 = c1598tB;
                                            c1779xC2 = c1779xC3;
                                            if (i48 == 2) {
                                                NB nb = (NB) ub3;
                                                e02 = AbstractC0952et.e0(bArr10, i25, c1598tB7);
                                                int i67 = c1598tB7.f15638a;
                                                int i68 = e02 + i67;
                                                if (i68 > bArr10.length) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                int i69 = (i67 / 4) + nb.f10783m;
                                                int length2 = nb.f10782l.length;
                                                if (i69 > length2) {
                                                    if (length2 != 0) {
                                                        while (length2 < i69) {
                                                            length2 = Math.max(((length2 * 3) / 2) + 1, 10);
                                                        }
                                                        nb.f10782l = Arrays.copyOf(nb.f10782l, length2);
                                                    } else {
                                                        nb.f10782l = new int[Math.max(i69, 10)];
                                                    }
                                                }
                                                while (e02 < i68) {
                                                    nb.f(AbstractC0952et.z(e02, bArr10));
                                                    e02 += 4;
                                                }
                                                if (e02 != i68) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i26 = i27;
                                                i35 = e02;
                                                c1598tB5 = c1598tB7;
                                                i13 = i28;
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                if (i48 == 5) {
                                                    h02 = i25 + 4;
                                                    NB nb2 = (NB) ub3;
                                                    nb2.f(AbstractC0952et.z(i25, bArr10));
                                                    while (h02 < i27) {
                                                        int e011 = AbstractC0952et.e0(bArr10, h02, c1598tB7);
                                                        if (i28 == c1598tB7.f15638a) {
                                                            nb2.f(AbstractC0952et.z(e011, bArr10));
                                                            h02 = e011 + 4;
                                                        } else {
                                                            i26 = i27;
                                                            c1598tB5 = c1598tB7;
                                                            i13 = i28;
                                                            i35 = h02;
                                                            if (i35 != i25) {
                                                            }
                                                        }
                                                    }
                                                    i26 = i27;
                                                    c1598tB5 = c1598tB7;
                                                    i13 = i28;
                                                    i35 = h02;
                                                    if (i35 != i25) {
                                                    }
                                                }
                                                i26 = i27;
                                                c1598tB5 = c1598tB7;
                                                i13 = i28;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            bArr10 = bArr;
                                            i27 = i5;
                                            i25 = i59;
                                            i28 = i40;
                                            i8 = i38;
                                            unsafe = unsafe5;
                                            obj3 = obj10;
                                            i14 = i9;
                                            c1598tB7 = c1598tB;
                                            c1779xC2 = c1779xC3;
                                            if (i48 != 2) {
                                                if (i48 == 0) {
                                                    if (ub3 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    AbstractC0952et.h0(bArr10, i25, c1598tB7);
                                                    throw null;
                                                }
                                                i26 = i27;
                                                c1598tB5 = c1598tB7;
                                                i13 = i28;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                if (ub3 != null) {
                                                    throw new ClassCastException();
                                                }
                                                int e012 = AbstractC0952et.e0(bArr10, i25, c1598tB7);
                                                int i70 = c1598tB7.f15638a + e012;
                                                if (e012 < i70) {
                                                    AbstractC0952et.h0(bArr10, e012, c1598tB7);
                                                    throw null;
                                                }
                                                if (e012 != i70) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i26 = i27;
                                                i35 = e012;
                                                c1598tB5 = c1598tB7;
                                                i13 = i28;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        case 26:
                                            bArr10 = bArr;
                                            i27 = i5;
                                            i28 = i40;
                                            i8 = i38;
                                            unsafe = unsafe5;
                                            obj3 = obj10;
                                            i14 = i9;
                                            c1598tB7 = c1598tB;
                                            if (i48 == 2) {
                                                if ((j7 & 536870912) == 0) {
                                                    int e013 = AbstractC0952et.e0(bArr10, i59, c1598tB7);
                                                    int i71 = c1598tB7.f15638a;
                                                    if (i71 < 0) {
                                                        throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i71 == 0) {
                                                        ub3.add("");
                                                        c1779xC2 = c1779xC3;
                                                    } else {
                                                        c1779xC2 = c1779xC3;
                                                        ub3.add(new String(bArr10, e013, i71, VB.f11871a));
                                                        e013 += i71;
                                                    }
                                                    while (e013 < i27) {
                                                        int e014 = AbstractC0952et.e0(bArr10, e013, c1598tB7);
                                                        if (i28 == c1598tB7.f15638a) {
                                                            e013 = AbstractC0952et.e0(bArr10, e014, c1598tB7);
                                                            int i72 = c1598tB7.f15638a;
                                                            if (i72 < 0) {
                                                                throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i72 == 0) {
                                                                ub3.add("");
                                                            } else {
                                                                ub3.add(new String(bArr10, e013, i72, VB.f11871a));
                                                                e013 += i72;
                                                            }
                                                        } else {
                                                            i26 = i27;
                                                            c1598tB5 = c1598tB7;
                                                            i13 = i28;
                                                            i35 = e013;
                                                            i25 = i59;
                                                        }
                                                    }
                                                    i26 = i27;
                                                    c1598tB5 = c1598tB7;
                                                    i13 = i28;
                                                    i35 = e013;
                                                    i25 = i59;
                                                } else {
                                                    c1779xC2 = c1779xC3;
                                                    int e015 = AbstractC0952et.e0(bArr10, i59, c1598tB7);
                                                    int i73 = c1598tB7.f15638a;
                                                    if (i73 < 0) {
                                                        throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i73 == 0) {
                                                        ub3.add("");
                                                        i29 = i59;
                                                    } else {
                                                        int i74 = e015 + i73;
                                                        if (!EC.d(bArr10, e015, i74)) {
                                                            throw new XB("Protocol message had invalid UTF-8.");
                                                        }
                                                        i29 = i59;
                                                        ub3.add(new String(bArr10, e015, i73, VB.f11871a));
                                                        e015 = i74;
                                                    }
                                                    while (e015 < i27) {
                                                        int e016 = AbstractC0952et.e0(bArr10, e015, c1598tB7);
                                                        if (i28 == c1598tB7.f15638a) {
                                                            e015 = AbstractC0952et.e0(bArr10, e016, c1598tB7);
                                                            int i75 = c1598tB7.f15638a;
                                                            if (i75 < 0) {
                                                                throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i75 == 0) {
                                                                ub3.add("");
                                                            } else {
                                                                int i76 = e015 + i75;
                                                                if (!EC.d(bArr10, e015, i76)) {
                                                                    throw new XB("Protocol message had invalid UTF-8.");
                                                                }
                                                                ub3.add(new String(bArr10, e015, i75, VB.f11871a));
                                                                e015 = i76;
                                                            }
                                                        } else {
                                                            i26 = i27;
                                                            c1598tB5 = c1598tB7;
                                                            i13 = i28;
                                                            i35 = e015;
                                                            i25 = i29;
                                                        }
                                                    }
                                                    i26 = i27;
                                                    c1598tB5 = c1598tB7;
                                                    i13 = i28;
                                                    i35 = e015;
                                                    i25 = i29;
                                                }
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                c1779xC2 = c1779xC3;
                                                i25 = i59;
                                                i26 = i27;
                                                c1598tB5 = c1598tB7;
                                                i13 = i28;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        case 27:
                                            i8 = i38;
                                            if (i48 == 2) {
                                                i14 = i9;
                                                obj3 = obj;
                                                i13 = i40;
                                                bArr10 = bArr;
                                                i25 = i59;
                                                c1779xC2 = c1779xC3;
                                                unsafe = unsafe5;
                                                i35 = AbstractC0952et.V(c1062hC.I(i47), i40, bArr, i59, i5, ub3, c1598tB);
                                                i26 = i5;
                                                c1598tB5 = c1598tB;
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                obj3 = obj;
                                                bArr10 = bArr;
                                                i14 = i9;
                                                c1779xC2 = c1779xC3;
                                                i13 = i40;
                                                i25 = i59;
                                                i26 = i5;
                                                unsafe = unsafe5;
                                                c1598tB5 = c1598tB;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            i8 = i38;
                                            if (i48 == 2) {
                                                int e017 = AbstractC0952et.e0(bArr, i59, c1598tB);
                                                int i77 = c1598tB.f15638a;
                                                if (i77 < 0) {
                                                    throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i77 > bArr.length - e017) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i77 == 0) {
                                                    ub3.add(AbstractC1823yB.f16414l);
                                                } else {
                                                    ub3.add(AbstractC1823yB.r(bArr, e017, i77));
                                                    e017 += i77;
                                                }
                                                while (e017 < i5) {
                                                    int e018 = AbstractC0952et.e0(bArr, e017, c1598tB);
                                                    if (i40 == c1598tB.f15638a) {
                                                        e017 = AbstractC0952et.e0(bArr, e018, c1598tB);
                                                        int i78 = c1598tB.f15638a;
                                                        if (i78 < 0) {
                                                            throw new XB("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i78 > bArr.length - e017) {
                                                            throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i78 == 0) {
                                                            ub3.add(AbstractC1823yB.f16414l);
                                                        } else {
                                                            ub3.add(AbstractC1823yB.r(bArr, e017, i78));
                                                            e017 += i78;
                                                        }
                                                    } else {
                                                        i13 = i40;
                                                        i35 = e017;
                                                        i25 = i59;
                                                        unsafe = unsafe5;
                                                        bArr10 = bArr;
                                                        c1598tB5 = c1598tB;
                                                        i14 = i9;
                                                        obj3 = obj;
                                                        c1779xC2 = c1779xC3;
                                                        i26 = i5;
                                                        if (i35 != i25) {
                                                        }
                                                    }
                                                }
                                                i13 = i40;
                                                i35 = e017;
                                                i25 = i59;
                                                unsafe = unsafe5;
                                                bArr10 = bArr;
                                                c1598tB5 = c1598tB;
                                                i14 = i9;
                                                obj3 = obj;
                                                c1779xC2 = c1779xC3;
                                                i26 = i5;
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                i13 = i40;
                                                i25 = i59;
                                                unsafe = unsafe5;
                                                bArr10 = bArr;
                                                c1598tB5 = c1598tB;
                                                i14 = i9;
                                                obj3 = obj;
                                                c1779xC2 = c1779xC3;
                                                i26 = i5;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i30 = i5;
                                            c1598tB8 = c1598tB;
                                            i13 = i40;
                                            if (i48 == 2) {
                                                g02 = AbstractC0952et.a0(bArr, i59, ub3, c1598tB8);
                                                i32 = i59;
                                                i31 = i30;
                                                ub = ub3;
                                                bArr11 = bArr;
                                            } else if (i48 == 0) {
                                                ub = ub3;
                                                g02 = AbstractC0952et.g0(i13, bArr, i59, i30, ub, c1598tB8);
                                                bArr11 = bArr;
                                                i31 = i30;
                                                i32 = i59;
                                            } else {
                                                i8 = i38;
                                                obj3 = obj;
                                                bArr10 = bArr;
                                                i25 = i59;
                                                unsafe = unsafe5;
                                                i14 = i9;
                                                c1598tB5 = c1598tB8;
                                                c1779xC2 = c1779xC3;
                                                i26 = i30;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            i8 = i38;
                                            AbstractC1599tC.r(obj, i9, ub, c1062hC.H(i47), null, c1062hC.f13735j);
                                            i35 = g02;
                                            c1779xC2 = c1779xC3;
                                            i25 = i32;
                                            unsafe = unsafe5;
                                            i26 = i31;
                                            c1598tB5 = c1598tB8;
                                            obj3 = obj;
                                            i14 = i9;
                                            bArr10 = bArr11;
                                            if (i35 != i25) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr12 = bArr;
                                            i30 = i5;
                                            c1598tB8 = c1598tB;
                                            i33 = i59;
                                            i13 = i40;
                                            if (i48 == 2) {
                                                NB nb3 = (NB) ub3;
                                                e04 = AbstractC0952et.e0(bArr12, i33, c1598tB8);
                                                int i79 = c1598tB8.f15638a + e04;
                                                while (e04 < i79) {
                                                    e04 = AbstractC0952et.e0(bArr12, e04, c1598tB8);
                                                    nb3.f(AbstractC1674uy.h(c1598tB8.f15638a));
                                                }
                                                if (e04 != i79) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                int i80 = i33;
                                                i35 = e04;
                                                bArr10 = bArr12;
                                                i25 = i80;
                                                i8 = i38;
                                                unsafe = unsafe5;
                                                i14 = i9;
                                                obj3 = obj;
                                                c1598tB5 = c1598tB8;
                                                c1779xC2 = c1779xC3;
                                                i26 = i30;
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                if (i48 == 0) {
                                                    NB nb4 = (NB) ub3;
                                                    e03 = AbstractC0952et.e0(bArr12, i33, c1598tB8);
                                                    nb4.f(AbstractC1674uy.h(c1598tB8.f15638a));
                                                    while (e03 < i30) {
                                                        int e019 = AbstractC0952et.e0(bArr12, e03, c1598tB8);
                                                        if (i13 == c1598tB8.f15638a) {
                                                            e03 = AbstractC0952et.e0(bArr12, e019, c1598tB8);
                                                            nb4.f(AbstractC1674uy.h(c1598tB8.f15638a));
                                                        } else {
                                                            bArr10 = bArr12;
                                                            i25 = i33;
                                                            i8 = i38;
                                                            unsafe = unsafe5;
                                                            i14 = i9;
                                                            obj3 = obj;
                                                            i35 = e03;
                                                            c1598tB5 = c1598tB8;
                                                            c1779xC2 = c1779xC3;
                                                            i26 = i30;
                                                            if (i35 != i25) {
                                                            }
                                                        }
                                                    }
                                                    bArr10 = bArr12;
                                                    i25 = i33;
                                                    i8 = i38;
                                                    unsafe = unsafe5;
                                                    i14 = i9;
                                                    obj3 = obj;
                                                    i35 = e03;
                                                    c1598tB5 = c1598tB8;
                                                    c1779xC2 = c1779xC3;
                                                    i26 = i30;
                                                    if (i35 != i25) {
                                                    }
                                                }
                                                bArr10 = bArr12;
                                                i25 = i33;
                                                i8 = i38;
                                                unsafe = unsafe5;
                                                i14 = i9;
                                                obj3 = obj;
                                                c1598tB5 = c1598tB8;
                                                c1779xC2 = c1779xC3;
                                                i26 = i30;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr12 = bArr;
                                            i30 = i5;
                                            c1598tB8 = c1598tB;
                                            i33 = i59;
                                            i13 = i40;
                                            if (i48 == 2) {
                                                C0794bC c0794bC5 = (C0794bC) ub3;
                                                e04 = AbstractC0952et.e0(bArr12, i33, c1598tB8);
                                                int i81 = c1598tB8.f15638a + e04;
                                                while (e04 < i81) {
                                                    e04 = AbstractC0952et.h0(bArr12, e04, c1598tB8);
                                                    c0794bC5.f(AbstractC1674uy.i(c1598tB8.f15639b));
                                                }
                                                if (e04 != i81) {
                                                    throw new XB("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                int i802 = i33;
                                                i35 = e04;
                                                bArr10 = bArr12;
                                                i25 = i802;
                                                i8 = i38;
                                                unsafe = unsafe5;
                                                i14 = i9;
                                                obj3 = obj;
                                                c1598tB5 = c1598tB8;
                                                c1779xC2 = c1779xC3;
                                                i26 = i30;
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                if (i48 == 0) {
                                                    C0794bC c0794bC6 = (C0794bC) ub3;
                                                    e03 = AbstractC0952et.h0(bArr12, i33, c1598tB8);
                                                    c0794bC6.f(AbstractC1674uy.i(c1598tB8.f15639b));
                                                    while (e03 < i30) {
                                                        int e020 = AbstractC0952et.e0(bArr12, e03, c1598tB8);
                                                        if (i13 == c1598tB8.f15638a) {
                                                            e03 = AbstractC0952et.h0(bArr12, e020, c1598tB8);
                                                            c0794bC6.f(AbstractC1674uy.i(c1598tB8.f15639b));
                                                        } else {
                                                            bArr10 = bArr12;
                                                            i25 = i33;
                                                            i8 = i38;
                                                            unsafe = unsafe5;
                                                            i14 = i9;
                                                            obj3 = obj;
                                                            i35 = e03;
                                                            c1598tB5 = c1598tB8;
                                                            c1779xC2 = c1779xC3;
                                                            i26 = i30;
                                                            if (i35 != i25) {
                                                            }
                                                        }
                                                    }
                                                    bArr10 = bArr12;
                                                    i25 = i33;
                                                    i8 = i38;
                                                    unsafe = unsafe5;
                                                    i14 = i9;
                                                    obj3 = obj;
                                                    i35 = e03;
                                                    c1598tB5 = c1598tB8;
                                                    c1779xC2 = c1779xC3;
                                                    i26 = i30;
                                                    if (i35 != i25) {
                                                    }
                                                }
                                                bArr10 = bArr12;
                                                i25 = i33;
                                                i8 = i38;
                                                unsafe = unsafe5;
                                                i14 = i9;
                                                obj3 = obj;
                                                c1598tB5 = c1598tB8;
                                                c1779xC2 = c1779xC3;
                                                i26 = i30;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                        default:
                                            if (i48 == 3) {
                                                int i82 = (i40 & (-8)) | 4;
                                                InterfaceC1554sC I5 = c1062hC.I(i47);
                                                MB b3 = I5.b();
                                                i30 = i5;
                                                int i83 = i59;
                                                i13 = i40;
                                                int i03 = AbstractC0952et.i0(b3, I5, bArr, i83, i30, i82, c1598tB);
                                                int i84 = i82;
                                                c1598tB8 = c1598tB;
                                                I5.a(b3);
                                                c1598tB8.f15640c = b3;
                                                ub3.add(b3);
                                                while (true) {
                                                    if (i03 < i30) {
                                                        int i85 = i83;
                                                        int e021 = AbstractC0952et.e0(bArr, i03, c1598tB8);
                                                        if (i13 == c1598tB8.f15638a) {
                                                            int i86 = i84;
                                                            MB b5 = I5.b();
                                                            i03 = AbstractC0952et.i0(b5, I5, bArr, e021, i30, i86, c1598tB);
                                                            i84 = i86;
                                                            c1598tB8 = c1598tB;
                                                            I5.a(b5);
                                                            c1598tB8.f15640c = b5;
                                                            ub3.add(b5);
                                                            i83 = i85;
                                                        } else {
                                                            i83 = i85;
                                                        }
                                                    }
                                                }
                                                bArr10 = bArr;
                                                i25 = i83;
                                                i8 = i38;
                                                unsafe = unsafe5;
                                                i35 = i03;
                                                obj3 = obj10;
                                                i14 = i9;
                                                c1598tB5 = c1598tB8;
                                                c1779xC2 = c1779xC3;
                                                i26 = i30;
                                                if (i35 != i25) {
                                                }
                                            } else {
                                                bArr10 = bArr;
                                                i25 = i59;
                                                i13 = i40;
                                                i8 = i38;
                                                unsafe = unsafe5;
                                                obj3 = obj10;
                                                i14 = i9;
                                                c1598tB5 = c1598tB;
                                                c1779xC2 = c1779xC3;
                                                i26 = i5;
                                                i35 = i25;
                                                if (i35 != i25) {
                                                }
                                            }
                                            break;
                                    }
                                }
                                i40 = i13;
                            } else if (i48 == 2) {
                                UB ub4 = (UB) unsafe5.getObject(obj10, j5);
                                if (!((AbstractC1508rB) ub4).f15276k) {
                                    int size2 = ub4.size();
                                    ub4 = ub4.b(size2 == 0 ? 10 : size2 + size2);
                                    unsafe5.putObject(obj10, j5, ub4);
                                }
                                bArr13 = bArr;
                                i34 = i5;
                                i35 = AbstractC0952et.V(c1062hC.I(i47), i40, bArr13, i59, i34, ub4, c1598tB);
                                c1598tB9 = c1598tB;
                                i37 = i47;
                                obj7 = obj;
                                i39 = i58;
                                i36 = i9;
                                i41 = 1048575;
                                i40 = i40;
                                unsafe3 = unsafe5;
                            } else {
                                bArr7 = bArr;
                                i13 = i40;
                                i8 = i38;
                                unsafe = unsafe5;
                                obj3 = obj10;
                                i14 = i9;
                                c1598tB5 = c1598tB;
                                c1779xC2 = c1779xC3;
                                i7 = i6;
                                bArr2 = bArr7;
                                i37 = i47;
                                i39 = i58;
                                i12 = i59;
                            }
                            c1598tB2 = c1598tB5;
                            c1779xC = c1779xC2;
                        }
                    }
                    if (i13 != i7 || i7 == 0) {
                        MB mb3 = (MB) obj3;
                        C1779xC c1779xC6 = mb3.zzt;
                        if (c1779xC6 == c1779xC) {
                            c1779xC6 = C1779xC.b();
                            mb3.zzt = c1779xC6;
                        }
                        int i87 = i13;
                        i34 = i5;
                        c1062hC = this;
                        c1598tB9 = c1598tB;
                        i35 = AbstractC0952et.c0(i87, bArr2, i12, i5, c1779xC6, c1598tB2);
                        obj7 = obj3;
                        i36 = i14;
                        i38 = i8;
                        i41 = 1048575;
                        bArr13 = bArr;
                        i40 = i87;
                        unsafe3 = unsafe;
                    } else {
                        i34 = i5;
                        i35 = i12;
                        i40 = i13;
                    }
                } else {
                    i7 = i6;
                    unsafe = unsafe3;
                    i8 = i38;
                    obj2 = null;
                    obj3 = obj7;
                }
            }
            i36 = i9;
        }
    }

    public final int D(int i, int i5) {
        int[] iArr = this.f13728a;
        int length = (iArr.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
            if (i == i8) {
                return i7;
            }
            if (i < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    public final int F(int i) {
        return this.f13728a[i + 1];
    }

    public final PB H(int i) {
        int i5 = i / 3;
        return (PB) this.f13729b[i5 + i5 + 1];
    }

    public final InterfaceC1554sC I(int i) {
        int i5 = i / 3;
        int i6 = i5 + i5;
        Object[] objArr = this.f13729b;
        InterfaceC1554sC interfaceC1554sC = (InterfaceC1554sC) objArr[i6];
        if (interfaceC1554sC != null) {
            return interfaceC1554sC;
        }
        InterfaceC1554sC a5 = C1285mC.f14484c.a((Class) objArr[i6 + 1]);
        objArr[i6] = a5;
        return a5;
    }

    public final void J(int i, Object obj, Object obj2) {
        int i5 = this.f13728a[i];
        Object i6 = CC.i(F(i) & 1048575, obj);
        if (i6 == null || H(i) == null) {
            return;
        }
        K(i).getClass();
        throw new ClassCastException();
    }

    public final Object K(int i) {
        int i5 = i / 3;
        return this.f13729b[i5 + i5];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void a(Object obj) {
        if (!y(obj)) {
            return;
        }
        if (obj instanceof MB) {
            MB mb = (MB) obj;
            mb.f(Integer.MAX_VALUE);
            mb.zzq = 0;
            mb.j();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f13728a;
            if (i >= iArr.length) {
                this.f13735j.getClass();
                C1779xC c1779xC = ((MB) obj).zzt;
                if (c1779xC.f16276e) {
                    c1779xC.f16276e = false;
                    return;
                }
                return;
            }
            int F5 = F(i);
            int i5 = 1048575 & F5;
            int E5 = E(F5);
            long j5 = i5;
            if (E5 != 9) {
                if (E5 != 60 && E5 != 68) {
                    switch (E5) {
                        case 18:
                        case 19:
                        case 20:
                        case C1639u7.zzm /* 21 */:
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
                            AbstractC1508rB abstractC1508rB = (AbstractC1508rB) ((UB) CC.i(j5, obj));
                            if (!abstractC1508rB.f15276k) {
                                break;
                            } else {
                                abstractC1508rB.f15276k = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f13727l;
                            Object object = unsafe.getObject(obj, j5);
                            if (object == null) {
                                break;
                            } else {
                                ((C0838cC) object).f12981k = false;
                                unsafe.putObject(obj, j5, object);
                                break;
                            }
                    }
                } else if (z(iArr[i], i, obj)) {
                    I(i).a(f13727l.getObject(obj, j5));
                }
                i += 3;
            }
            if (w(i, obj)) {
                I(i).a(f13727l.getObject(obj, j5));
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final MB b() {
        return ((MB) this.f13732e).n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final boolean c(MB mb, MB mb2) {
        boolean h3;
        int i = 0;
        while (true) {
            int[] iArr = this.f13728a;
            if (i < iArr.length) {
                int F5 = F(i);
                long j5 = F5 & 1048575;
                switch (E(F5)) {
                    case 0:
                        if (!v(mb, mb2, i)) {
                            break;
                        } else {
                            BC bc = CC.f7973c;
                            if (Double.doubleToLongBits(bc.Z0(j5, mb)) != Double.doubleToLongBits(bc.Z0(j5, mb2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!v(mb, mb2, i)) {
                            break;
                        } else {
                            BC bc2 = CC.f7973c;
                            if (Float.floatToIntBits(bc2.a1(j5, mb)) != Float.floatToIntBits(bc2.a1(j5, mb2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (v(mb, mb2, i) && CC.g(j5, mb) == CC.g(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (v(mb, mb2, i) && CC.g(j5, mb) == CC.g(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (v(mb, mb2, i) && CC.e(j5, mb) == CC.e(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (v(mb, mb2, i) && CC.g(j5, mb) == CC.g(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (v(mb, mb2, i) && CC.e(j5, mb) == CC.e(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!v(mb, mb2, i)) {
                            break;
                        } else {
                            BC bc3 = CC.f7973c;
                            if (bc3.j1(j5, mb) != bc3.j1(j5, mb2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (v(mb, mb2, i) && AbstractC1599tC.h(CC.i(j5, mb), CC.i(j5, mb2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (v(mb, mb2, i) && AbstractC1599tC.h(CC.i(j5, mb), CC.i(j5, mb2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (v(mb, mb2, i) && AbstractC1599tC.h(CC.i(j5, mb), CC.i(j5, mb2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (v(mb, mb2, i) && CC.e(j5, mb) == CC.e(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (v(mb, mb2, i) && CC.e(j5, mb) == CC.e(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (v(mb, mb2, i) && CC.e(j5, mb) == CC.e(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (v(mb, mb2, i) && CC.g(j5, mb) == CC.g(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (v(mb, mb2, i) && CC.e(j5, mb) == CC.e(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (v(mb, mb2, i) && CC.g(j5, mb) == CC.g(j5, mb2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (v(mb, mb2, i) && AbstractC1599tC.h(CC.i(j5, mb), CC.i(j5, mb2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case C1639u7.zzm /* 21 */:
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
                        h3 = AbstractC1599tC.h(CC.i(j5, mb), CC.i(j5, mb2));
                        break;
                    case 50:
                        h3 = AbstractC1599tC.h(CC.i(j5, mb), CC.i(j5, mb2));
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
                        long j6 = iArr[i + 2] & 1048575;
                        if (CC.e(j6, mb) == CC.e(j6, mb2) && AbstractC1599tC.h(CC.i(j5, mb), CC.i(j5, mb2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (h3) {
                    i += 3;
                }
            } else if (mb.zzt.equals(mb2.zzt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void d(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f13728a;
            if (i >= iArr.length) {
                AbstractC1599tC.s(obj, obj2);
                return;
            }
            int F5 = F(i);
            int i5 = 1048575 & F5;
            int E5 = E(F5);
            int i6 = iArr[i];
            long j5 = i5;
            switch (E5) {
                case 0:
                    if (w(i, obj2)) {
                        BC bc = CC.f7973c;
                        obj3 = obj;
                        bc.g1(obj3, j5, bc.Z0(j5, obj2));
                        r(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (w(i, obj2)) {
                        BC bc2 = CC.f7973c;
                        bc2.i1(obj, j5, bc2.a1(j5, obj2));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (w(i, obj2)) {
                        CC.m(obj, j5, CC.g(j5, obj2));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (w(i, obj2)) {
                        CC.m(obj, j5, CC.g(j5, obj2));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (w(i, obj2)) {
                        CC.l(CC.e(j5, obj2), j5, obj);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (w(i, obj2)) {
                        CC.m(obj, j5, CC.g(j5, obj2));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (w(i, obj2)) {
                        CC.l(CC.e(j5, obj2), j5, obj);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (w(i, obj2)) {
                        BC bc3 = CC.f7973c;
                        bc3.e1(obj, j5, bc3.j1(j5, obj2));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (w(i, obj2)) {
                        CC.n(obj, j5, CC.i(j5, obj2));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    o(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (w(i, obj2)) {
                        CC.n(obj, j5, CC.i(j5, obj2));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (w(i, obj2)) {
                        CC.l(CC.e(j5, obj2), j5, obj);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (w(i, obj2)) {
                        CC.l(CC.e(j5, obj2), j5, obj);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (w(i, obj2)) {
                        CC.l(CC.e(j5, obj2), j5, obj);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (w(i, obj2)) {
                        CC.m(obj, j5, CC.g(j5, obj2));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (w(i, obj2)) {
                        CC.l(CC.e(j5, obj2), j5, obj);
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (w(i, obj2)) {
                        CC.m(obj, j5, CC.g(j5, obj2));
                        r(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    o(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case C1639u7.zzm /* 21 */:
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
                    UB ub = (UB) CC.i(j5, obj);
                    UB ub2 = (UB) CC.i(j5, obj2);
                    int size = ub.size();
                    int size2 = ub2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC1508rB) ub).f15276k) {
                            ub = ub.b(size2 + size);
                        }
                        ub.addAll(ub2);
                    }
                    if (size > 0) {
                        ub2 = ub;
                    }
                    CC.n(obj, j5, ub2);
                    obj3 = obj;
                    break;
                case 50:
                    C1543s1 c1543s1 = AbstractC1599tC.f15642a;
                    CC.n(obj, j5, Fz.j(CC.i(j5, obj), CC.i(j5, obj2)));
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
                    if (z(i6, i, obj2)) {
                        CC.n(obj, j5, CC.i(j5, obj2));
                        s(i6, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    p(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (z(i6, i, obj2)) {
                        CC.n(obj, j5, CC.i(j5, obj2));
                        s(i6, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    p(i, obj, obj2);
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

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(MB mb) {
        int i;
        long doubleToLongBits;
        int i5;
        int floatToIntBits;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f13728a;
            if (i8 >= iArr.length) {
                return mb.zzt.hashCode() + (i9 * 53);
            }
            int F5 = F(i8);
            int i10 = 1048575 & F5;
            int E5 = E(F5);
            int i11 = iArr[i8];
            long j5 = i10;
            int i12 = 1237;
            int i13 = 37;
            switch (E5) {
                case 0:
                    i = i9 * 53;
                    doubleToLongBits = Double.doubleToLongBits(CC.f7973c.Z0(j5, mb));
                    Charset charset = VB.f11871a;
                    i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i5 = i9 * 53;
                    floatToIntBits = Float.floatToIntBits(CC.f7973c.a1(j5, mb));
                    i9 = floatToIntBits + i5;
                    break;
                case 2:
                    i = i9 * 53;
                    doubleToLongBits = CC.g(j5, mb);
                    Charset charset2 = VB.f11871a;
                    i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i9 * 53;
                    doubleToLongBits = CC.g(j5, mb);
                    Charset charset3 = VB.f11871a;
                    i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i5 = i9 * 53;
                    floatToIntBits = CC.e(j5, mb);
                    i9 = floatToIntBits + i5;
                    break;
                case 5:
                    i = i9 * 53;
                    doubleToLongBits = CC.g(j5, mb);
                    Charset charset4 = VB.f11871a;
                    i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i5 = i9 * 53;
                    floatToIntBits = CC.e(j5, mb);
                    i9 = floatToIntBits + i5;
                    break;
                case 7:
                    i6 = i9 * 53;
                    boolean j12 = CC.f7973c.j1(j5, mb);
                    Charset charset5 = VB.f11871a;
                    break;
                case 8:
                    i5 = i9 * 53;
                    floatToIntBits = ((String) CC.i(j5, mb)).hashCode();
                    i9 = floatToIntBits + i5;
                    break;
                case 9:
                    i7 = i9 * 53;
                    Object i14 = CC.i(j5, mb);
                    if (i14 != null) {
                        i13 = i14.hashCode();
                    }
                    i9 = i7 + i13;
                    break;
                case 10:
                    i5 = i9 * 53;
                    floatToIntBits = CC.i(j5, mb).hashCode();
                    i9 = floatToIntBits + i5;
                    break;
                case 11:
                    i5 = i9 * 53;
                    floatToIntBits = CC.e(j5, mb);
                    i9 = floatToIntBits + i5;
                    break;
                case 12:
                    i5 = i9 * 53;
                    floatToIntBits = CC.e(j5, mb);
                    i9 = floatToIntBits + i5;
                    break;
                case 13:
                    i5 = i9 * 53;
                    floatToIntBits = CC.e(j5, mb);
                    i9 = floatToIntBits + i5;
                    break;
                case 14:
                    i = i9 * 53;
                    doubleToLongBits = CC.g(j5, mb);
                    Charset charset6 = VB.f11871a;
                    i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i5 = i9 * 53;
                    floatToIntBits = CC.e(j5, mb);
                    i9 = floatToIntBits + i5;
                    break;
                case 16:
                    i = i9 * 53;
                    doubleToLongBits = CC.g(j5, mb);
                    Charset charset7 = VB.f11871a;
                    i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i7 = i9 * 53;
                    Object i15 = CC.i(j5, mb);
                    if (i15 != null) {
                        i13 = i15.hashCode();
                    }
                    i9 = i7 + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case C1639u7.zzm /* 21 */:
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
                    i5 = i9 * 53;
                    floatToIntBits = CC.i(j5, mb).hashCode();
                    i9 = floatToIntBits + i5;
                    break;
                case 50:
                    i5 = i9 * 53;
                    floatToIntBits = CC.i(j5, mb).hashCode();
                    i9 = floatToIntBits + i5;
                    break;
                case 51:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i = i9 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) CC.i(j5, mb)).doubleValue());
                        Charset charset8 = VB.f11871a;
                        i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) CC.i(j5, mb)).floatValue());
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 53:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i = i9 * 53;
                        doubleToLongBits = G(j5, mb);
                        Charset charset9 = VB.f11871a;
                        i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i = i9 * 53;
                        doubleToLongBits = G(j5, mb);
                        Charset charset10 = VB.f11871a;
                        i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = C(j5, mb);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 56:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i = i9 * 53;
                        doubleToLongBits = G(j5, mb);
                        Charset charset11 = VB.f11871a;
                        i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = C(j5, mb);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 58:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        boolean booleanValue = ((Boolean) CC.i(j5, mb)).booleanValue();
                        Charset charset12 = VB.f11871a;
                        break;
                    }
                case 59:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = ((String) CC.i(j5, mb)).hashCode();
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 60:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = CC.i(j5, mb).hashCode();
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 61:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = CC.i(j5, mb).hashCode();
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 62:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = C(j5, mb);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 63:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = C(j5, mb);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 64:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = C(j5, mb);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 65:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i = i9 * 53;
                        doubleToLongBits = G(j5, mb);
                        Charset charset13 = VB.f11871a;
                        i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = C(j5, mb);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 67:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i = i9 * 53;
                        doubleToLongBits = G(j5, mb);
                        Charset charset14 = VB.f11871a;
                        i9 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!z(i11, i8, mb)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = CC.i(j5, mb).hashCode();
                        i9 = floatToIntBits + i5;
                        break;
                    }
            }
            i8 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void f(Object obj, byte[] bArr, int i, int i5, C1598tB c1598tB) {
        A(obj, bArr, i, i5, 0, c1598tB);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final boolean g(Object obj) {
        int i;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i8 < this.f13734h) {
            int i10 = this.f13733g[i8];
            int[] iArr = this.f13728a;
            int i11 = iArr[i10];
            int F5 = F(i10);
            int i12 = iArr[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i9) {
                if (i13 != 1048575) {
                    i7 = f13727l.getInt(obj, i13);
                }
                i5 = i10;
                i6 = i7;
                i = i13;
            } else {
                int i15 = i7;
                i = i9;
                i5 = i10;
                i6 = i15;
            }
            if ((268435456 & F5) == 0 || x(obj, i5, i, i6, i14)) {
                int E5 = E(F5);
                if (E5 == 9 || E5 == 17) {
                    if (x(obj, i5, i, i6, i14) && !I(i5).g(CC.i(F5 & 1048575, obj))) {
                    }
                    i8++;
                    i9 = i;
                    i7 = i6;
                } else {
                    if (E5 != 27) {
                        if (E5 == 60 || E5 == 68) {
                            if (z(i11, i5, obj) && !I(i5).g(CC.i(F5 & 1048575, obj))) {
                            }
                        } else if (E5 != 49) {
                            if (E5 == 50 && !((C0838cC) CC.i(F5 & 1048575, obj)).isEmpty()) {
                                K(i5).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i8++;
                        i9 = i;
                        i7 = i6;
                    }
                    List list = (List) CC.i(F5 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC1554sC I5 = I(i5);
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            if (I5.g(list.get(i16))) {
                            }
                        }
                    }
                    i8++;
                    i9 = i;
                    i7 = i6;
                }
            }
            return false;
        }
        return true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void h(java.lang.Object r27, I.C0160m r28, com.google.android.gms.internal.ads.GB r29) {
        /*
            Method dump skipped, instructions count: 2090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1062hC.h(java.lang.Object, I.m, com.google.android.gms.internal.ads.GB):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final int i(MB mb) {
        int i;
        int p02;
        int q02;
        int i5;
        int i6;
        int a5;
        int p03;
        int size;
        int q5;
        int p04;
        int p05;
        int p06;
        int i7;
        int p07;
        int q03;
        C1062hC c1062hC = this;
        MB mb2 = mb;
        Unsafe unsafe = f13727l;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = c1062hC.f13728a;
            if (i10 >= iArr.length) {
                return mb2.zzt.a() + i12;
            }
            int F5 = c1062hC.F(i10);
            int E5 = E(F5);
            int i13 = iArr[i10];
            int i14 = iArr[i10 + 2];
            int i15 = i14 & i8;
            if (E5 <= 17) {
                if (i15 != i9) {
                    i11 = i15 == i8 ? 0 : unsafe.getInt(mb2, i15);
                    i9 = i15;
                }
                i = 1 << (i14 >>> 20);
            } else {
                i = 0;
            }
            int i16 = F5 & i8;
            if (E5 >= IB.f9529l.f9533k) {
                IB.f9530m.getClass();
            }
            long j5 = i16;
            switch (E5) {
                case 0:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        i12 = AbstractC0467k.s(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 1:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        i12 = AbstractC0467k.s(i13 << 3, 4, i12);
                    }
                    mb2 = mb;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 2:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        long j6 = unsafe.getLong(mb2, j5);
                        p02 = EB.p0(i13 << 3);
                        q02 = EB.q0(j6);
                        i5 = q02 + p02;
                        i12 += i5;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 3:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        long j7 = unsafe.getLong(mb2, j5);
                        p02 = EB.p0(i13 << 3);
                        q02 = EB.q0(j7);
                        i5 = q02 + p02;
                        i12 += i5;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 4:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        long j8 = unsafe.getInt(mb2, j5);
                        p02 = EB.p0(i13 << 3);
                        q02 = EB.q0(j8);
                        i5 = q02 + p02;
                        i12 += i5;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 5:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        i12 = AbstractC0467k.s(i13 << 3, 8, i12);
                    }
                    mb2 = mb;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 6:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        i12 = AbstractC0467k.s(i13 << 3, 4, i12);
                    }
                    mb2 = mb;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 7:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        i12 = AbstractC0467k.s(i13 << 3, 1, i12);
                    }
                    mb2 = mb;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 8:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        int i17 = i13 << 3;
                        Object object = unsafe.getObject(mb2, j5);
                        if (object instanceof AbstractC1823yB) {
                            int p08 = EB.p0(i17);
                            int g5 = ((AbstractC1823yB) object).g();
                            i12 = AbstractC0467k.t(g5, g5, p08, i12);
                        } else {
                            p02 = EB.p0(i17);
                            q02 = EB.o0((String) object);
                            i5 = q02 + p02;
                            i12 += i5;
                        }
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 9:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        Object object2 = unsafe.getObject(mb2, j5);
                        InterfaceC1554sC I5 = c1062hC.I(i10);
                        C1543s1 c1543s1 = AbstractC1599tC.f15642a;
                        int p09 = EB.p0(i13 << 3);
                        int a6 = ((AbstractC1464qB) object2).a(I5);
                        i12 = AbstractC0467k.t(a6, a6, p09, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 10:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        AbstractC1823yB abstractC1823yB = (AbstractC1823yB) unsafe.getObject(mb2, j5);
                        int p010 = EB.p0(i13 << 3);
                        int g6 = abstractC1823yB.g();
                        i12 = AbstractC0467k.t(g6, g6, p010, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 11:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        i12 = AbstractC0467k.s(unsafe.getInt(mb2, j5), EB.p0(i13 << 3), i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 12:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        long j9 = unsafe.getInt(mb2, j5);
                        p02 = EB.p0(i13 << 3);
                        q02 = EB.q0(j9);
                        i5 = q02 + p02;
                        i12 += i5;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 13:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        i12 = AbstractC0467k.s(i13 << 3, 4, i12);
                    }
                    mb2 = mb;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 14:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        i12 = AbstractC0467k.s(i13 << 3, 8, i12);
                    }
                    mb2 = mb;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 15:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        int i18 = unsafe.getInt(mb2, j5);
                        i12 = AbstractC0467k.s((i18 >> 31) ^ (i18 + i18), EB.p0(i13 << 3), i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 16:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        long j10 = unsafe.getLong(mb2, j5);
                        p02 = EB.p0(i13 << 3);
                        q02 = EB.q0((j10 >> 63) ^ (j10 + j10));
                        i5 = q02 + p02;
                        i12 += i5;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 17:
                    if (c1062hC.x(mb2, i10, i9, i11, i)) {
                        AbstractC1464qB abstractC1464qB = (AbstractC1464qB) unsafe.getObject(mb2, j5);
                        InterfaceC1554sC I6 = c1062hC.I(i10);
                        int p011 = EB.p0(i13 << 3);
                        i6 = p011 + p011;
                        a5 = abstractC1464qB.a(I6);
                        i5 = a5 + i6;
                        i12 += i5;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 18:
                    i5 = AbstractC1599tC.k(i13, (List) unsafe.getObject(mb2, j5));
                    i12 += i5;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 19:
                    i5 = AbstractC1599tC.j(i13, (List) unsafe.getObject(mb2, j5));
                    i12 += i5;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 20:
                    List list = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s12 = AbstractC1599tC.f15642a;
                    if (list.size() != 0) {
                        p03 = (EB.p0(i13 << 3) * list.size()) + AbstractC1599tC.m(list);
                        i12 += p03;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p03 = 0;
                    i12 += p03;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case C1639u7.zzm /* 21 */:
                    List list2 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s13 = AbstractC1599tC.f15642a;
                    size = list2.size();
                    if (size != 0) {
                        q5 = AbstractC1599tC.q(list2);
                        p04 = EB.p0(i13 << 3);
                        p05 = (p04 * size) + q5;
                        i12 += p05;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p05 = 0;
                    i12 += p05;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 22:
                    List list3 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s14 = AbstractC1599tC.f15642a;
                    size = list3.size();
                    if (size != 0) {
                        q5 = AbstractC1599tC.l(list3);
                        p04 = EB.p0(i13 << 3);
                        p05 = (p04 * size) + q5;
                        i12 += p05;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p05 = 0;
                    i12 += p05;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 23:
                    i5 = AbstractC1599tC.k(i13, (List) unsafe.getObject(mb2, j5));
                    i12 += i5;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 24:
                    i5 = AbstractC1599tC.j(i13, (List) unsafe.getObject(mb2, j5));
                    i12 += i5;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 25:
                    List list4 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s15 = AbstractC1599tC.f15642a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        p03 = (EB.p0(i13 << 3) + 1) * size2;
                        i12 += p03;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p03 = 0;
                    i12 += p03;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 26:
                    List list5 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s16 = AbstractC1599tC.f15642a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        p05 = EB.p0(i13 << 3) * size3;
                        for (int i19 = 0; i19 < size3; i19++) {
                            Object obj = list5.get(i19);
                            if (obj instanceof AbstractC1823yB) {
                                int g7 = ((AbstractC1823yB) obj).g();
                                p05 = AbstractC0467k.s(g7, g7, p05);
                            } else {
                                p05 = EB.o0((String) obj) + p05;
                            }
                        }
                        i12 += p05;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p05 = 0;
                    i12 += p05;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 27:
                    List list6 = (List) unsafe.getObject(mb2, j5);
                    InterfaceC1554sC I7 = c1062hC.I(i10);
                    C1543s1 c1543s17 = AbstractC1599tC.f15642a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        p06 = 0;
                    } else {
                        p06 = EB.p0(i13 << 3) * size4;
                        for (int i20 = 0; i20 < size4; i20++) {
                            int a7 = ((AbstractC1464qB) list6.get(i20)).a(I7);
                            p06 = AbstractC0467k.s(a7, a7, p06);
                        }
                    }
                    i12 += p06;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 28:
                    List list7 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s18 = AbstractC1599tC.f15642a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        p05 = EB.p0(i13 << 3) * size5;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int g8 = ((AbstractC1823yB) list7.get(i21)).g();
                            p05 = AbstractC0467k.s(g8, g8, p05);
                        }
                        i12 += p05;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p05 = 0;
                    i12 += p05;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 29:
                    List list8 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s19 = AbstractC1599tC.f15642a;
                    size = list8.size();
                    if (size != 0) {
                        q5 = AbstractC1599tC.p(list8);
                        p04 = EB.p0(i13 << 3);
                        p05 = (p04 * size) + q5;
                        i12 += p05;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p05 = 0;
                    i12 += p05;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 30:
                    List list9 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s110 = AbstractC1599tC.f15642a;
                    size = list9.size();
                    if (size != 0) {
                        q5 = AbstractC1599tC.i(list9);
                        p04 = EB.p0(i13 << 3);
                        p05 = (p04 * size) + q5;
                        i12 += p05;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p05 = 0;
                    i12 += p05;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 31:
                    i5 = AbstractC1599tC.j(i13, (List) unsafe.getObject(mb2, j5));
                    i12 += i5;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 32:
                    i5 = AbstractC1599tC.k(i13, (List) unsafe.getObject(mb2, j5));
                    i12 += i5;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 33:
                    List list10 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s111 = AbstractC1599tC.f15642a;
                    size = list10.size();
                    if (size != 0) {
                        q5 = AbstractC1599tC.n(list10);
                        p04 = EB.p0(i13 << 3);
                        p05 = (p04 * size) + q5;
                        i12 += p05;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p05 = 0;
                    i12 += p05;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 34:
                    List list11 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s112 = AbstractC1599tC.f15642a;
                    size = list11.size();
                    if (size != 0) {
                        q5 = AbstractC1599tC.o(list11);
                        p04 = EB.p0(i13 << 3);
                        p05 = (p04 * size) + q5;
                        i12 += p05;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                    p05 = 0;
                    i12 += p05;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 35:
                    List list12 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s113 = AbstractC1599tC.f15642a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i12 = AbstractC0467k.t(size6, EB.p0(i13 << 3), size6, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 36:
                    List list13 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s114 = AbstractC1599tC.f15642a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i12 = AbstractC0467k.t(size7, EB.p0(i13 << 3), size7, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 37:
                    int m5 = AbstractC1599tC.m((List) unsafe.getObject(mb2, j5));
                    if (m5 > 0) {
                        i12 = AbstractC0467k.t(m5, EB.p0(i13 << 3), m5, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 38:
                    int q6 = AbstractC1599tC.q((List) unsafe.getObject(mb2, j5));
                    if (q6 > 0) {
                        i12 = AbstractC0467k.t(q6, EB.p0(i13 << 3), q6, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 39:
                    int l5 = AbstractC1599tC.l((List) unsafe.getObject(mb2, j5));
                    if (l5 > 0) {
                        i12 = AbstractC0467k.t(l5, EB.p0(i13 << 3), l5, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 40:
                    List list14 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s115 = AbstractC1599tC.f15642a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i12 = AbstractC0467k.t(size8, EB.p0(i13 << 3), size8, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 41:
                    List list15 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s116 = AbstractC1599tC.f15642a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i12 = AbstractC0467k.t(size9, EB.p0(i13 << 3), size9, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 42:
                    List list16 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s117 = AbstractC1599tC.f15642a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i12 = AbstractC0467k.t(size10, EB.p0(i13 << 3), size10, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 43:
                    int p5 = AbstractC1599tC.p((List) unsafe.getObject(mb2, j5));
                    if (p5 > 0) {
                        i12 = AbstractC0467k.t(p5, EB.p0(i13 << 3), p5, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 44:
                    int i22 = AbstractC1599tC.i((List) unsafe.getObject(mb2, j5));
                    if (i22 > 0) {
                        i12 = AbstractC0467k.t(i22, EB.p0(i13 << 3), i22, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 45:
                    List list17 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s118 = AbstractC1599tC.f15642a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i12 = AbstractC0467k.t(size11, EB.p0(i13 << 3), size11, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 46:
                    List list18 = (List) unsafe.getObject(mb2, j5);
                    C1543s1 c1543s119 = AbstractC1599tC.f15642a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i12 = AbstractC0467k.t(size12, EB.p0(i13 << 3), size12, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 47:
                    int n5 = AbstractC1599tC.n((List) unsafe.getObject(mb2, j5));
                    if (n5 > 0) {
                        i12 = AbstractC0467k.t(n5, EB.p0(i13 << 3), n5, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 48:
                    int o5 = AbstractC1599tC.o((List) unsafe.getObject(mb2, j5));
                    if (o5 > 0) {
                        i12 = AbstractC0467k.t(o5, EB.p0(i13 << 3), o5, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 49:
                    List list19 = (List) unsafe.getObject(mb2, j5);
                    InterfaceC1554sC I8 = c1062hC.I(i10);
                    C1543s1 c1543s120 = AbstractC1599tC.f15642a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                        for (int i23 = 0; i23 < size13; i23++) {
                            AbstractC1464qB abstractC1464qB2 = (AbstractC1464qB) list19.get(i23);
                            int p012 = EB.p0(i13 << 3);
                            i7 += abstractC1464qB2.a(I8) + p012 + p012;
                        }
                    }
                    i12 += i7;
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 50:
                    C0838cC c0838cC = (C0838cC) unsafe.getObject(mb2, j5);
                    if (c1062hC.K(i10) != null) {
                        throw new ClassCastException();
                    }
                    if (c0838cC.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c0838cC.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 51:
                    if (c1062hC.z(i13, i10, mb2)) {
                        i12 = AbstractC0467k.s(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 52:
                    if (c1062hC.z(i13, i10, mb2)) {
                        i12 = AbstractC0467k.s(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 53:
                    if (c1062hC.z(i13, i10, mb2)) {
                        long G5 = G(j5, mb2);
                        p07 = EB.p0(i13 << 3);
                        q03 = EB.q0(G5);
                        i12 += q03 + p07;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 54:
                    if (c1062hC.z(i13, i10, mb2)) {
                        long G6 = G(j5, mb2);
                        p07 = EB.p0(i13 << 3);
                        q03 = EB.q0(G6);
                        i12 += q03 + p07;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 55:
                    if (c1062hC.z(i13, i10, mb2)) {
                        long C5 = C(j5, mb2);
                        p07 = EB.p0(i13 << 3);
                        q03 = EB.q0(C5);
                        i12 += q03 + p07;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 56:
                    if (c1062hC.z(i13, i10, mb2)) {
                        i12 = AbstractC0467k.s(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 57:
                    if (c1062hC.z(i13, i10, mb2)) {
                        i12 = AbstractC0467k.s(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 58:
                    if (c1062hC.z(i13, i10, mb2)) {
                        i12 = AbstractC0467k.s(i13 << 3, 1, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 59:
                    if (c1062hC.z(i13, i10, mb2)) {
                        int i24 = i13 << 3;
                        Object object3 = unsafe.getObject(mb2, j5);
                        if (object3 instanceof AbstractC1823yB) {
                            int p013 = EB.p0(i24);
                            int g9 = ((AbstractC1823yB) object3).g();
                            i12 = AbstractC0467k.t(g9, g9, p013, i12);
                        } else {
                            p07 = EB.p0(i24);
                            q03 = EB.o0((String) object3);
                            i12 += q03 + p07;
                        }
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 60:
                    if (c1062hC.z(i13, i10, mb2)) {
                        Object object4 = unsafe.getObject(mb2, j5);
                        InterfaceC1554sC I9 = c1062hC.I(i10);
                        C1543s1 c1543s121 = AbstractC1599tC.f15642a;
                        int p014 = EB.p0(i13 << 3);
                        int a8 = ((AbstractC1464qB) object4).a(I9);
                        i12 = AbstractC0467k.t(a8, a8, p014, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 61:
                    if (c1062hC.z(i13, i10, mb2)) {
                        AbstractC1823yB abstractC1823yB2 = (AbstractC1823yB) unsafe.getObject(mb2, j5);
                        int p015 = EB.p0(i13 << 3);
                        int g10 = abstractC1823yB2.g();
                        i12 = AbstractC0467k.t(g10, g10, p015, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 62:
                    if (c1062hC.z(i13, i10, mb2)) {
                        i12 = AbstractC0467k.s(C(j5, mb2), EB.p0(i13 << 3), i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 63:
                    if (c1062hC.z(i13, i10, mb2)) {
                        long C6 = C(j5, mb2);
                        p07 = EB.p0(i13 << 3);
                        q03 = EB.q0(C6);
                        i12 += q03 + p07;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 64:
                    if (c1062hC.z(i13, i10, mb2)) {
                        i12 = AbstractC0467k.s(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 65:
                    if (c1062hC.z(i13, i10, mb2)) {
                        i12 = AbstractC0467k.s(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 66:
                    if (c1062hC.z(i13, i10, mb2)) {
                        int C7 = C(j5, mb2);
                        i12 = AbstractC0467k.s((C7 >> 31) ^ (C7 + C7), EB.p0(i13 << 3), i12);
                    }
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
                case 67:
                    if (c1062hC.z(i13, i10, mb2)) {
                        long G7 = G(j5, mb2);
                        p07 = EB.p0(i13 << 3);
                        q03 = EB.q0((G7 >> 63) ^ (G7 + G7));
                        i12 += q03 + p07;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                case 68:
                    if (c1062hC.z(i13, i10, mb2)) {
                        AbstractC1464qB abstractC1464qB3 = (AbstractC1464qB) unsafe.getObject(mb2, j5);
                        InterfaceC1554sC I10 = c1062hC.I(i10);
                        int p016 = EB.p0(i13 << 3);
                        i6 = p016 + p016;
                        a5 = abstractC1464qB3.a(I10);
                        i5 = a5 + i6;
                        i12 += i5;
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    } else {
                        i10 += 3;
                        i8 = 1048575;
                        c1062hC = this;
                    }
                default:
                    i10 += 3;
                    i8 = 1048575;
                    c1062hC = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1554sC
    public final void j(Object obj, Ps ps) {
        int i;
        C1062hC c1062hC = this;
        Unsafe unsafe = f13727l;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = c1062hC.f13728a;
            if (i6 >= iArr.length) {
                ((MB) obj).zzt.d(ps);
                return;
            }
            int F5 = c1062hC.F(i6);
            int E5 = E(F5);
            int i9 = iArr[i6];
            if (E5 <= 17) {
                int i10 = iArr[i6 + 2];
                int i11 = i10 & i5;
                if (i11 != i8) {
                    i7 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j5 = F5 & i5;
            switch (E5) {
                case 0:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).x0(i9, Double.doubleToRawLongBits(CC.f7973c.Z0(j5, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).v0(i9, Float.floatToRawIntBits(CC.f7973c.a1(j5, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).G0(i9, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).G0(i9, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).z0(i9, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).x0(i9, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).v0(i9, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).t0(i9, CC.f7973c.j1(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        Object object = unsafe.getObject(obj, j5);
                        if (object instanceof String) {
                            ((EB) ps.f11130k).C0((String) object, i9);
                            break;
                        } else {
                            ((EB) ps.f11130k).u0(i9, (AbstractC1823yB) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        Object object2 = unsafe.getObject(obj, j5);
                        InterfaceC1554sC I5 = c1062hC.I(i6);
                        ps.getClass();
                        ((EB) ps.f11130k).B0(i9, (AbstractC1464qB) object2, I5);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).u0(i9, (AbstractC1823yB) unsafe.getObject(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).E0(i9, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).z0(i9, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).v0(i9, unsafe.getInt(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ((EB) ps.f11130k).x0(i9, unsafe.getLong(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        int i12 = unsafe.getInt(obj, j5);
                        ((EB) ps.f11130k).E0(i9, (i12 >> 31) ^ (i12 + i12));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        long j6 = unsafe.getLong(obj, j5);
                        ((EB) ps.f11130k).G0(i9, (j6 + j6) ^ (j6 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (c1062hC.x(obj, i6, i8, i7, i)) {
                        ps.b(i9, unsafe.getObject(obj, j5), c1062hC.I(i6));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    AbstractC1599tC.u(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 19:
                    AbstractC1599tC.y(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 20:
                    AbstractC1599tC.a(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case C1639u7.zzm /* 21 */:
                    AbstractC1599tC.g(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 22:
                    AbstractC1599tC.z(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 23:
                    AbstractC1599tC.x(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 24:
                    AbstractC1599tC.w(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 25:
                    AbstractC1599tC.t(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j5);
                    C1543s1 c1543s1 = AbstractC1599tC.f15642a;
                    if (list != null && !list.isEmpty()) {
                        ps.getClass();
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            ((EB) ps.f11130k).C0((String) list.get(i14), i13);
                        }
                        break;
                    }
                    break;
                case 27:
                    int i15 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j5);
                    InterfaceC1554sC I6 = c1062hC.I(i6);
                    C1543s1 c1543s12 = AbstractC1599tC.f15642a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            Object obj2 = list2.get(i16);
                            ps.getClass();
                            ((EB) ps.f11130k).B0(i15, (AbstractC1464qB) obj2, I6);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i17 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j5);
                    C1543s1 c1543s13 = AbstractC1599tC.f15642a;
                    if (list3 != null && !list3.isEmpty()) {
                        ps.getClass();
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            ((EB) ps.f11130k).u0(i17, (AbstractC1823yB) list3.get(i18));
                        }
                        break;
                    }
                    break;
                case 29:
                    AbstractC1599tC.f(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 30:
                    AbstractC1599tC.v(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 31:
                    AbstractC1599tC.b(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 32:
                    AbstractC1599tC.c(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 33:
                    AbstractC1599tC.d(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 34:
                    AbstractC1599tC.e(iArr[i6], (List) unsafe.getObject(obj, j5), ps, false);
                    break;
                case 35:
                    AbstractC1599tC.u(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 36:
                    AbstractC1599tC.y(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 37:
                    AbstractC1599tC.a(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 38:
                    AbstractC1599tC.g(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 39:
                    AbstractC1599tC.z(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 40:
                    AbstractC1599tC.x(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 41:
                    AbstractC1599tC.w(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 42:
                    AbstractC1599tC.t(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 43:
                    AbstractC1599tC.f(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 44:
                    AbstractC1599tC.v(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 45:
                    AbstractC1599tC.b(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 46:
                    AbstractC1599tC.c(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 47:
                    AbstractC1599tC.d(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 48:
                    AbstractC1599tC.e(iArr[i6], (List) unsafe.getObject(obj, j5), ps, true);
                    break;
                case 49:
                    int i19 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j5);
                    InterfaceC1554sC I7 = c1062hC.I(i6);
                    C1543s1 c1543s14 = AbstractC1599tC.f15642a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            ps.b(i19, list4.get(i20), I7);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j5) != null) {
                        c1062hC.K(i6).getClass();
                        throw new ClassCastException();
                    }
                    break;
                case 51:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).x0(i9, Double.doubleToRawLongBits(((Double) CC.i(j5, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).v0(i9, Float.floatToRawIntBits(((Float) CC.i(j5, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).G0(i9, G(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).G0(i9, G(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).z0(i9, C(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).x0(i9, G(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).v0(i9, C(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).t0(i9, ((Boolean) CC.i(j5, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (c1062hC.z(i9, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j5);
                        if (object3 instanceof String) {
                            ((EB) ps.f11130k).C0((String) object3, i9);
                            break;
                        } else {
                            ((EB) ps.f11130k).u0(i9, (AbstractC1823yB) object3);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (c1062hC.z(i9, i6, obj)) {
                        Object object4 = unsafe.getObject(obj, j5);
                        InterfaceC1554sC I8 = c1062hC.I(i6);
                        ps.getClass();
                        ((EB) ps.f11130k).B0(i9, (AbstractC1464qB) object4, I8);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).u0(i9, (AbstractC1823yB) unsafe.getObject(obj, j5));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).E0(i9, C(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).z0(i9, C(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).v0(i9, C(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (c1062hC.z(i9, i6, obj)) {
                        ((EB) ps.f11130k).x0(i9, G(j5, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (c1062hC.z(i9, i6, obj)) {
                        int C5 = C(j5, obj);
                        ((EB) ps.f11130k).E0(i9, (C5 >> 31) ^ (C5 + C5));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (c1062hC.z(i9, i6, obj)) {
                        long G5 = G(j5, obj);
                        ((EB) ps.f11130k).G0(i9, (G5 + G5) ^ (G5 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (c1062hC.z(i9, i6, obj)) {
                        ps.b(i9, unsafe.getObject(obj, j5), c1062hC.I(i6));
                        break;
                    } else {
                        break;
                    }
            }
            i6 += 3;
            i5 = 1048575;
            c1062hC = this;
        }
    }

    public final Object k(int i, Object obj) {
        InterfaceC1554sC I5 = I(i);
        int F5 = F(i) & 1048575;
        if (!w(i, obj)) {
            return I5.b();
        }
        Object object = f13727l.getObject(obj, F5);
        if (y(object)) {
            return object;
        }
        MB b3 = I5.b();
        if (object != null) {
            I5.d(b3, object);
        }
        return b3;
    }

    public final Object l(int i, int i5, Object obj) {
        InterfaceC1554sC I5 = I(i5);
        if (!z(i, i5, obj)) {
            return I5.b();
        }
        Object object = f13727l.getObject(obj, F(i5) & 1048575);
        if (y(object)) {
            return object;
        }
        MB b3 = I5.b();
        if (object != null) {
            I5.d(b3, object);
        }
        return b3;
    }

    public final void o(int i, Object obj, Object obj2) {
        if (w(i, obj2)) {
            int F5 = F(i) & 1048575;
            Unsafe unsafe = f13727l;
            long j5 = F5;
            Object object = unsafe.getObject(obj2, j5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f13728a[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC1554sC I5 = I(i);
            if (!w(i, obj)) {
                if (y(object)) {
                    MB b3 = I5.b();
                    I5.d(b3, object);
                    unsafe.putObject(obj, j5, b3);
                } else {
                    unsafe.putObject(obj, j5, object);
                }
                r(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!y(object2)) {
                MB b5 = I5.b();
                I5.d(b5, object2);
                unsafe.putObject(obj, j5, b5);
                object2 = b5;
            }
            I5.d(object2, object);
        }
    }

    public final void p(int i, Object obj, Object obj2) {
        int[] iArr = this.f13728a;
        int i5 = iArr[i];
        if (z(i5, i, obj2)) {
            int F5 = F(i) & 1048575;
            Unsafe unsafe = f13727l;
            long j5 = F5;
            Object object = unsafe.getObject(obj2, j5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC1554sC I5 = I(i);
            if (!z(i5, i, obj)) {
                if (y(object)) {
                    MB b3 = I5.b();
                    I5.d(b3, object);
                    unsafe.putObject(obj, j5, b3);
                } else {
                    unsafe.putObject(obj, j5, object);
                }
                s(i5, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j5);
            if (!y(object2)) {
                MB b5 = I5.b();
                I5.d(b5, object2);
                unsafe.putObject(obj, j5, b5);
                object2 = b5;
            }
            I5.d(object2, object);
        }
    }

    public final void q(int i, C0160m c0160m, Object obj) {
        long j5 = i & 1048575;
        if ((536870912 & i) != 0) {
            c0160m.v(2);
            CC.n(obj, j5, ((AbstractC1674uy) c0160m.f2501e).F());
        } else if (this.f) {
            c0160m.v(2);
            CC.n(obj, j5, ((AbstractC1674uy) c0160m.f2501e).E());
        } else {
            c0160m.v(2);
            CC.n(obj, j5, ((AbstractC1674uy) c0160m.f2501e).D());
        }
    }

    public final void r(int i, Object obj) {
        int i5 = this.f13728a[i + 2];
        long j5 = 1048575 & i5;
        if (j5 == 1048575) {
            return;
        }
        CC.l((1 << (i5 >>> 20)) | CC.e(j5, obj), j5, obj);
    }

    public final void s(int i, int i5, Object obj) {
        CC.l(i, this.f13728a[i5 + 2] & 1048575, obj);
    }

    public final void t(int i, Object obj, Object obj2) {
        f13727l.putObject(obj, F(i) & 1048575, obj2);
        r(i, obj);
    }

    public final void u(int i, int i5, Object obj, Object obj2) {
        f13727l.putObject(obj, F(i5) & 1048575, obj2);
        s(i, i5, obj);
    }

    public final boolean v(MB mb, MB mb2, int i) {
        return w(i, mb) == w(i, mb2);
    }

    public final boolean w(int i, Object obj) {
        int i5 = this.f13728a[i + 2];
        long j5 = i5 & 1048575;
        if (j5 == 1048575) {
            int F5 = F(i);
            long j6 = F5 & 1048575;
            switch (E(F5)) {
                case 0:
                    if (Double.doubleToRawLongBits(CC.f7973c.Z0(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(CC.f7973c.a1(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (CC.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (CC.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (CC.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (CC.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (CC.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return CC.f7973c.j1(j6, obj);
                case 8:
                    Object i6 = CC.i(j6, obj);
                    if (i6 instanceof String) {
                        if (((String) i6).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(i6 instanceof AbstractC1823yB)) {
                            throw new IllegalArgumentException();
                        }
                        if (AbstractC1823yB.f16414l.equals(i6)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (CC.i(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (AbstractC1823yB.f16414l.equals(CC.i(j6, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (CC.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (CC.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (CC.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (CC.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (CC.e(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (CC.g(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (CC.i(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & CC.e(j5, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean x(Object obj, int i, int i5, int i6, int i7) {
        return i5 == 1048575 ? w(i, obj) : (i6 & i7) != 0;
    }

    public final boolean z(int i, int i5, Object obj) {
        return CC.e((long) (this.f13728a[i5 + 2] & 1048575), obj) == i;
    }
}
