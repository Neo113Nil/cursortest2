package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C0137l;
import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.impl.C0644l9;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237w1 implements D1 {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f2839j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f2840k = M1.h();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2841a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2842b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2843c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2844d;

    /* renamed from: e, reason: collision with root package name */
    public final S0 f2845e;
    public final int[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2846g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2847h;

    /* renamed from: i, reason: collision with root package name */
    public final C0184e1 f2848i;

    public C0237w1(int[] iArr, Object[] objArr, int i3, int i4, S0 s02, int[] iArr2, int i5, int i6, C0184e1 c0184e1, C0184e1 c0184e12) {
        this.f2841a = iArr;
        this.f2842b = objArr;
        this.f2843c = i3;
        this.f2844d = i4;
        this.f = iArr2;
        this.f2846g = i5;
        this.f2847h = i6;
        this.f2848i = c0184e1;
        this.f2845e = s02;
    }

    public static Field E(String str, Class cls) {
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

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0190g1) {
            return ((AbstractC0190g1) obj).c();
        }
        return true;
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
    public static C0237w1 u(C1 c12, C0184e1 c0184e1, C0184e1 c0184e12) {
        int i3;
        int charAt;
        int i4;
        int[] iArr;
        int i5;
        int i6;
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
        Object[] objArr;
        int i21;
        int i22;
        int i23;
        int objectFieldOffset;
        int i24;
        String str;
        char c3;
        int i25;
        int i26;
        int i27;
        int i28;
        Field E3;
        int i29;
        char charAt10;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field E4;
        Object obj2;
        Field E5;
        int i36;
        char charAt11;
        int i37;
        int i38;
        char charAt12;
        int i39;
        char charAt13;
        int i40;
        char charAt14;
        if (!(c12 instanceof C1)) {
            c12.getClass();
            throw new ClassCastException();
        }
        String str2 = c12.f2610b;
        int length = str2.length();
        char c4 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i3 = i41 + 1;
                if (str2.charAt(i41) < 55296) {
                    break;
                }
                i41 = i3;
            }
        } else {
            i3 = 1;
        }
        int i42 = i3 + 1;
        int charAt15 = str2.charAt(i3);
        if (charAt15 >= 55296) {
            int i43 = charAt15 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                charAt14 = str2.charAt(i42);
                if (charAt14 < 55296) {
                    break;
                }
                i43 |= (charAt14 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            charAt15 = i43 | (charAt14 << i44);
            i42 = i40;
        }
        if (charAt15 == 0) {
            i6 = 0;
            i8 = 0;
            charAt = 0;
            i5 = 0;
            i7 = 0;
            i9 = 0;
            iArr = f2839j;
            i4 = 0;
        } else {
            int i45 = i42 + 1;
            int charAt16 = str2.charAt(i42);
            if (charAt16 >= 55296) {
                int i46 = charAt16 & 8191;
                int i47 = 13;
                while (true) {
                    i17 = i45 + 1;
                    charAt9 = str2.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i17;
                }
                charAt16 = i46 | (charAt9 << i47);
                i45 = i17;
            }
            int i48 = i45 + 1;
            int charAt17 = str2.charAt(i45);
            if (charAt17 >= 55296) {
                int i49 = charAt17 & 8191;
                int i50 = 13;
                while (true) {
                    i16 = i48 + 1;
                    charAt8 = str2.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i16;
                }
                charAt17 = i49 | (charAt8 << i50);
                i48 = i16;
            }
            int i51 = i48 + 1;
            int charAt18 = str2.charAt(i48);
            if (charAt18 >= 55296) {
                int i52 = charAt18 & 8191;
                int i53 = 13;
                while (true) {
                    i15 = i51 + 1;
                    charAt7 = str2.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i15;
                }
                charAt18 = i52 | (charAt7 << i53);
                i51 = i15;
            }
            int i54 = i51 + 1;
            int charAt19 = str2.charAt(i51);
            if (charAt19 >= 55296) {
                int i55 = charAt19 & 8191;
                int i56 = 13;
                while (true) {
                    i14 = i54 + 1;
                    charAt6 = str2.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i14;
                }
                charAt19 = i55 | (charAt6 << i56);
                i54 = i14;
            }
            int i57 = i54 + 1;
            charAt = str2.charAt(i54);
            if (charAt >= 55296) {
                int i58 = charAt & 8191;
                int i59 = 13;
                while (true) {
                    i13 = i57 + 1;
                    charAt5 = str2.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i13;
                }
                charAt = i58 | (charAt5 << i59);
                i57 = i13;
            }
            int i60 = i57 + 1;
            int charAt20 = str2.charAt(i57);
            if (charAt20 >= 55296) {
                int i61 = charAt20 & 8191;
                int i62 = 13;
                while (true) {
                    i12 = i60 + 1;
                    charAt4 = str2.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i12;
                }
                charAt20 = i61 | (charAt4 << i62);
                i60 = i12;
            }
            int i63 = i60 + 1;
            int charAt21 = str2.charAt(i60);
            if (charAt21 >= 55296) {
                int i64 = charAt21 & 8191;
                int i65 = 13;
                while (true) {
                    i11 = i63 + 1;
                    charAt3 = str2.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i11;
                }
                charAt21 = i64 | (charAt3 << i65);
                i63 = i11;
            }
            int i66 = i63 + 1;
            int charAt22 = str2.charAt(i63);
            if (charAt22 >= 55296) {
                int i67 = charAt22 & 8191;
                int i68 = 13;
                while (true) {
                    i10 = i66 + 1;
                    charAt2 = str2.charAt(i66);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i67 |= (charAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i10;
                }
                charAt22 = i67 | (charAt2 << i68);
                i66 = i10;
            }
            int i69 = charAt16 + charAt16 + charAt17;
            i4 = charAt16;
            i42 = i66;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i70 = charAt20;
            i5 = charAt18;
            i6 = i70;
            i7 = charAt19;
            i8 = i69;
            i9 = charAt22;
        }
        Unsafe unsafe = f2840k;
        Class<?> cls = c12.f2609a.getClass();
        int i71 = i9 + i6;
        int i72 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr2 = new Object[i72];
        int i73 = i71;
        int i74 = i9;
        int i75 = 0;
        int i76 = 0;
        while (i42 < length) {
            int i77 = i42 + 1;
            int charAt23 = str2.charAt(i42);
            if (charAt23 >= c4) {
                int i78 = charAt23 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i39 = i79 + 1;
                    charAt13 = str2.charAt(i79);
                    if (charAt13 < c4) {
                        break;
                    }
                    i78 |= (charAt13 & 8191) << i80;
                    i80 += 13;
                    i79 = i39;
                }
                charAt23 = i78 | (charAt13 << i80);
                i18 = i39;
            } else {
                i18 = i77;
            }
            int i81 = i18 + 1;
            int charAt24 = str2.charAt(i18);
            if (charAt24 >= c4) {
                int i82 = charAt24 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i38 = i83 + 1;
                    charAt12 = str2.charAt(i83);
                    i19 = length;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i82 |= (charAt12 & 8191) << i84;
                    i84 += 13;
                    i83 = i38;
                    length = i19;
                }
                charAt24 = i82 | (charAt12 << i84);
                i20 = i38;
            } else {
                i19 = length;
                i20 = i81;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i86 = charAt23;
            int i87 = charAt24 & 2048;
            Object[] objArr3 = c12.f2611c;
            if (i85 >= 51) {
                int i88 = i20 + 1;
                int charAt25 = str2.charAt(i20);
                if (charAt25 >= 55296) {
                    int i89 = charAt25 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i36 = i90 + 1;
                        charAt11 = str2.charAt(i90);
                        i37 = i89;
                        if (charAt11 < 55296) {
                            break;
                        }
                        i89 = i37 | ((charAt11 & 8191) << i91);
                        i91 += 13;
                        i90 = i36;
                    }
                    charAt25 = i37 | (charAt11 << i91);
                    i33 = i36;
                } else {
                    i33 = i88;
                }
                int i92 = charAt25;
                int i93 = i85 - 51;
                int i94 = i33;
                if (i93 == 9 || i93 == 17) {
                    i34 = i8 + 1;
                    int i95 = i76 / 3;
                    objArr2[i95 + i95 + 1] = objArr3[i8];
                } else {
                    if (i93 == 12) {
                        if (c12.a() == 1 || i87 != 0) {
                            i34 = i8 + 1;
                            int i96 = i76 / 3;
                            objArr2[i96 + i96 + 1] = objArr3[i8];
                        } else {
                            i35 = 0;
                            int i97 = i92 + i92;
                            obj = objArr3[i97];
                            int i98 = i35;
                            if (obj instanceof Field) {
                                E4 = (Field) obj;
                            } else {
                                E4 = E((String) obj, cls);
                                objArr3[i97] = E4;
                            }
                            int i99 = i4;
                            objArr = objArr2;
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(E4);
                            int i100 = i97 + 1;
                            obj2 = objArr3[i100];
                            if (obj2 instanceof Field) {
                                E5 = (Field) obj2;
                            } else {
                                E5 = E((String) obj2, cls);
                                objArr3[i100] = E5;
                            }
                            int objectFieldOffset3 = (int) unsafe.objectFieldOffset(E5);
                            i21 = i99;
                            i23 = i98;
                            str = str2;
                            i22 = i8;
                            i25 = i94;
                            i27 = 0;
                            c3 = 55296;
                            i24 = objectFieldOffset3;
                            i28 = objectFieldOffset2;
                        }
                    }
                    i35 = i87;
                    int i972 = i92 + i92;
                    obj = objArr3[i972];
                    int i982 = i35;
                    if (obj instanceof Field) {
                    }
                    int i992 = i4;
                    objArr = objArr2;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(E4);
                    int i1002 = i972 + 1;
                    obj2 = objArr3[i1002];
                    if (obj2 instanceof Field) {
                    }
                    int objectFieldOffset32 = (int) unsafe.objectFieldOffset(E5);
                    i21 = i992;
                    i23 = i982;
                    str = str2;
                    i22 = i8;
                    i25 = i94;
                    i27 = 0;
                    c3 = 55296;
                    i24 = objectFieldOffset32;
                    i28 = objectFieldOffset22;
                }
                i8 = i34;
                i35 = i87;
                int i9722 = i92 + i92;
                obj = objArr3[i9722];
                int i9822 = i35;
                if (obj instanceof Field) {
                }
                int i9922 = i4;
                objArr = objArr2;
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(E4);
                int i10022 = i9722 + 1;
                obj2 = objArr3[i10022];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset322 = (int) unsafe.objectFieldOffset(E5);
                i21 = i9922;
                i23 = i9822;
                str = str2;
                i22 = i8;
                i25 = i94;
                i27 = 0;
                c3 = 55296;
                i24 = objectFieldOffset322;
                i28 = objectFieldOffset222;
            } else {
                int i101 = i4;
                objArr = objArr2;
                int i102 = i8 + 1;
                Field E6 = E((String) objArr3[i8], cls);
                i21 = i101;
                if (i85 == 9 || i85 == 17) {
                    i22 = i102;
                    int i103 = i76 / 3;
                    objArr[i103 + i103 + 1] = E6.getType();
                } else {
                    if (i85 == 27) {
                        i30 = i102;
                        i31 = 1;
                        i32 = i8 + 2;
                    } else if (i85 == 49) {
                        i32 = i8 + 2;
                        i30 = i102;
                        i31 = 1;
                    } else {
                        if (i85 == 12 || i85 == 30 || i85 == 44) {
                            i22 = i102;
                            if (c12.a() == 1 || i87 != 0) {
                                i32 = i8 + 2;
                                int i104 = i76 / 3;
                                objArr[i104 + i104 + 1] = objArr3[i22];
                                i22 = i32;
                            }
                        } else if (i85 == 50) {
                            int i105 = i8 + 2;
                            int i106 = i74 + 1;
                            iArr[i74] = i76;
                            int i107 = i76 / 3;
                            int i108 = i107 + i107;
                            objArr[i108] = objArr3[i102];
                            if (i87 != 0) {
                                objArr[i108 + 1] = objArr3[i105];
                                i23 = i87;
                                i74 = i106;
                                i22 = i8 + 3;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(E6);
                                i24 = 1048575;
                                if ((charAt24 & 4096) != 0 || i85 > 17) {
                                    str = str2;
                                    c3 = 55296;
                                    i25 = i20;
                                    i26 = 0;
                                } else {
                                    i25 = i20 + 1;
                                    int charAt26 = str2.charAt(i20);
                                    if (charAt26 >= 55296) {
                                        int i109 = charAt26 & 8191;
                                        int i110 = 13;
                                        while (true) {
                                            i29 = i25 + 1;
                                            charAt10 = str2.charAt(i25);
                                            if (charAt10 < 55296) {
                                                break;
                                            }
                                            i109 |= (charAt10 & 8191) << i110;
                                            i110 += 13;
                                            i25 = i29;
                                        }
                                        charAt26 = i109 | (charAt10 << i110);
                                        i25 = i29;
                                    }
                                    int i111 = (charAt26 / 32) + i21 + i21;
                                    Object obj3 = objArr3[i111];
                                    str = str2;
                                    if (obj3 instanceof Field) {
                                        E3 = (Field) obj3;
                                    } else {
                                        E3 = E((String) obj3, cls);
                                        objArr3[i111] = E3;
                                    }
                                    i26 = charAt26 % 32;
                                    i24 = (int) unsafe.objectFieldOffset(E3);
                                    c3 = 55296;
                                }
                                if (i85 >= 18 && i85 <= 49) {
                                    iArr[i73] = objectFieldOffset;
                                    i73++;
                                }
                                i27 = i26;
                                i28 = objectFieldOffset;
                            } else {
                                i74 = i106;
                                i22 = i105;
                            }
                        } else {
                            i22 = i102;
                        }
                        i23 = 0;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(E6);
                        i24 = 1048575;
                        if ((charAt24 & 4096) != 0) {
                        }
                        str = str2;
                        c3 = 55296;
                        i25 = i20;
                        i26 = 0;
                        if (i85 >= 18) {
                            iArr[i73] = objectFieldOffset;
                            i73++;
                        }
                        i27 = i26;
                        i28 = objectFieldOffset;
                    }
                    int i112 = i76 / 3;
                    objArr[i112 + i112 + i31] = objArr3[i30];
                    i22 = i32;
                }
                i23 = i87;
                objectFieldOffset = (int) unsafe.objectFieldOffset(E6);
                i24 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                c3 = 55296;
                i25 = i20;
                i26 = 0;
                if (i85 >= 18) {
                }
                i27 = i26;
                i28 = objectFieldOffset;
            }
            int i113 = i76 + 1;
            iArr2[i76] = i86;
            int i114 = i76 + 2;
            int i115 = i27;
            iArr2[i113] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i23 != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | i28;
            i76 += 3;
            iArr2[i114] = (i115 << 20) | i24;
            i42 = i25;
            c4 = c3;
            length = i19;
            i4 = i21;
            i8 = i22;
            str2 = str;
            objArr2 = objArr;
        }
        return new C0237w1(iArr2, objArr2, i5, i7, c12.f2609a, iArr, i9, i71, c0184e1, c0184e12);
    }

    public static int v(long j3, Object obj) {
        return ((Integer) M1.g(j3, obj)).intValue();
    }

    public static int x(int i3) {
        return (i3 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long z(long j3, Object obj) {
        return ((Long) M1.g(j3, obj)).longValue();
    }

    public final InterfaceC0196i1 A(int i3) {
        int i4 = i3 / 3;
        return (InterfaceC0196i1) this.f2842b[i4 + i4 + 1];
    }

    public final D1 B(int i3) {
        int i4 = i3 / 3;
        int i5 = i4 + i4;
        Object[] objArr = this.f2842b;
        D1 d12 = (D1) objArr[i5];
        if (d12 != null) {
            return d12;
        }
        D1 a3 = A1.f2595c.a((Class) objArr[i5 + 1]);
        objArr[i5] = a3;
        return a3;
    }

    public final Object C(int i3, Object obj) {
        D1 B3 = B(i3);
        int y = y(i3) & 1048575;
        if (!p(i3, obj)) {
            return B3.g();
        }
        Object object = f2840k.getObject(obj, y);
        if (r(object)) {
            return object;
        }
        AbstractC0190g1 g3 = B3.g();
        if (object != null) {
            B3.d(g3, object);
        }
        return g3;
    }

    public final Object D(int i3, int i4, Object obj) {
        D1 B3 = B(i4);
        if (!s(i3, i4, obj)) {
            return B3.g();
        }
        Object object = f2840k.getObject(obj, y(i4) & 1048575);
        if (r(object)) {
            return object;
        }
        AbstractC0190g1 g3 = B3.g();
        if (object != null) {
            B3.d(g3, object);
        }
        return g3;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof AbstractC0190g1) {
            AbstractC0190g1 abstractC0190g1 = (AbstractC0190g1) obj;
            abstractC0190g1.l();
            abstractC0190g1.zza = 0;
            abstractC0190g1.j();
        }
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2841a;
            if (i3 >= iArr.length) {
                this.f2848i.getClass();
                H1 h12 = ((AbstractC0190g1) obj).zzc;
                if (h12.f2635e) {
                    h12.f2635e = false;
                    return;
                }
                return;
            }
            int y = y(i3);
            int i4 = 1048575 & y;
            int x3 = x(y);
            long j3 = i4;
            if (x3 != 9) {
                if (x3 != 60 && x3 != 68) {
                    switch (x3) {
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
                            T0 t02 = (T0) ((InterfaceC0202k1) M1.g(j3, obj));
                            if (!t02.f2681a) {
                                break;
                            } else {
                                t02.f2681a = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f2840k;
                            Object object = unsafe.getObject(obj, j3);
                            if (object == null) {
                                break;
                            } else {
                                ((C0225s1) object).f2816a = false;
                                unsafe.putObject(obj, j3, object);
                                break;
                            }
                    }
                } else if (s(iArr[i3], i3, obj)) {
                    B(i3).a(f2840k.getObject(obj, j3));
                }
                i3 += 3;
            }
            if (p(i3, obj)) {
                B(i3).a(f2840k.getObject(obj, j3));
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void b(Object obj, byte[] bArr, int i3, int i4, V0 v0) {
        t(obj, bArr, i3, i4, 0, v0);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final int c(AbstractC0190g1 abstractC0190g1) {
        int i3;
        int d02;
        int N2;
        int i4;
        int i5;
        int a3;
        int d03;
        int size;
        int n3;
        int d04;
        int d05;
        int d06;
        int i6;
        int d07;
        int N3;
        C0237w1 c0237w1 = this;
        AbstractC0190g1 abstractC0190g12 = abstractC0190g1;
        Unsafe unsafe = f2840k;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = c0237w1.f2841a;
            if (i9 >= iArr.length) {
                return abstractC0190g12.zzc.a() + i11;
            }
            int y = c0237w1.y(i9);
            int x3 = x(y);
            int i12 = iArr[i9];
            int i13 = iArr[i9 + 2];
            int i14 = i13 & i7;
            if (x3 <= 17) {
                if (i14 != i8) {
                    i10 = i14 == i7 ? 0 : unsafe.getInt(abstractC0190g12, i14);
                    i8 = i14;
                }
                i3 = 1 << (i13 >>> 20);
            } else {
                i3 = 0;
            }
            int i15 = y & i7;
            if (x3 >= EnumC0178c1.f2731b.f2735a) {
                EnumC0178c1.f2732c.getClass();
            }
            long j3 = i15;
            switch (x3) {
                case 0:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        i11 = B0.c.e(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 1:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        i11 = B0.c.e(i12 << 3, 4, i11);
                    }
                    abstractC0190g12 = abstractC0190g1;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 2:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        long j4 = unsafe.getLong(abstractC0190g12, j3);
                        d02 = Z0.d0(i12 << 3);
                        N2 = Z0.N(j4);
                        i4 = N2 + d02;
                        i11 += i4;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 3:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        long j5 = unsafe.getLong(abstractC0190g12, j3);
                        d02 = Z0.d0(i12 << 3);
                        N2 = Z0.N(j5);
                        i4 = N2 + d02;
                        i11 += i4;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 4:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        long j6 = unsafe.getInt(abstractC0190g12, j3);
                        d02 = Z0.d0(i12 << 3);
                        N2 = Z0.N(j6);
                        i4 = N2 + d02;
                        i11 += i4;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 5:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        i11 = B0.c.e(i12 << 3, 8, i11);
                    }
                    abstractC0190g12 = abstractC0190g1;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 6:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        i11 = B0.c.e(i12 << 3, 4, i11);
                    }
                    abstractC0190g12 = abstractC0190g1;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 7:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        i11 = B0.c.e(i12 << 3, 1, i11);
                    }
                    abstractC0190g12 = abstractC0190g1;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 8:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        int i16 = i12 << 3;
                        Object object = unsafe.getObject(abstractC0190g12, j3);
                        if (object instanceof Y0) {
                            int d08 = Z0.d0(i16);
                            int d3 = ((Y0) object).d();
                            i11 = B0.c.f(d3, d3, d08, i11);
                        } else {
                            d02 = Z0.d0(i16);
                            N2 = Z0.c0((String) object);
                            i4 = N2 + d02;
                            i11 += i4;
                        }
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 9:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        Object object2 = unsafe.getObject(abstractC0190g12, j3);
                        D1 B3 = c0237w1.B(i9);
                        C0184e1 c0184e1 = E1.f2619a;
                        int d09 = Z0.d0(i12 << 3);
                        int a4 = ((S0) object2).a(B3);
                        i11 = B0.c.f(a4, a4, d09, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 10:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        Y0 y02 = (Y0) unsafe.getObject(abstractC0190g12, j3);
                        int d010 = Z0.d0(i12 << 3);
                        int d4 = y02.d();
                        i11 = B0.c.f(d4, d4, d010, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 11:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        i11 = B0.c.e(unsafe.getInt(abstractC0190g12, j3), Z0.d0(i12 << 3), i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 12:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        long j7 = unsafe.getInt(abstractC0190g12, j3);
                        d02 = Z0.d0(i12 << 3);
                        N2 = Z0.N(j7);
                        i4 = N2 + d02;
                        i11 += i4;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 13:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        i11 = B0.c.e(i12 << 3, 4, i11);
                    }
                    abstractC0190g12 = abstractC0190g1;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 14:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        i11 = B0.c.e(i12 << 3, 8, i11);
                    }
                    abstractC0190g12 = abstractC0190g1;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 15:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        int i17 = unsafe.getInt(abstractC0190g12, j3);
                        i11 = B0.c.e((i17 >> 31) ^ (i17 + i17), Z0.d0(i12 << 3), i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 16:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        long j8 = unsafe.getLong(abstractC0190g12, j3);
                        d02 = Z0.d0(i12 << 3);
                        N2 = Z0.N((j8 >> 63) ^ (j8 + j8));
                        i4 = N2 + d02;
                        i11 += i4;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 17:
                    if (c0237w1.q(abstractC0190g12, i9, i8, i10, i3)) {
                        S0 s02 = (S0) unsafe.getObject(abstractC0190g12, j3);
                        D1 B4 = c0237w1.B(i9);
                        int d011 = Z0.d0(i12 << 3);
                        i5 = d011 + d011;
                        a3 = s02.a(B4);
                        i4 = a3 + i5;
                        i11 += i4;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 18:
                    i4 = E1.h(i12, (List) unsafe.getObject(abstractC0190g12, j3));
                    i11 += i4;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7759C /* 19 */:
                    i4 = E1.g(i12, (List) unsafe.getObject(abstractC0190g12, j3));
                    i11 += i4;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7760D /* 20 */:
                    List list = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e12 = E1.f2619a;
                    if (list.size() != 0) {
                        d03 = (Z0.d0(i12 << 3) * list.size()) + E1.j(list);
                        i11 += d03;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d03 = 0;
                    i11 += d03;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7761E /* 21 */:
                    List list2 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e13 = E1.f2619a;
                    size = list2.size();
                    if (size != 0) {
                        n3 = E1.n(list2);
                        d04 = Z0.d0(i12 << 3);
                        d05 = (d04 * size) + n3;
                        i11 += d05;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d05 = 0;
                    i11 += d05;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e14 = E1.f2619a;
                    size = list3.size();
                    if (size != 0) {
                        n3 = E1.i(list3);
                        d04 = Z0.d0(i12 << 3);
                        d05 = (d04 * size) + n3;
                        i11 += d05;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d05 = 0;
                    i11 += d05;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 23:
                    i4 = E1.h(i12, (List) unsafe.getObject(abstractC0190g12, j3));
                    i11 += i4;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 24:
                    i4 = E1.g(i12, (List) unsafe.getObject(abstractC0190g12, j3));
                    i11 += i4;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7762F /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e15 = E1.f2619a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        d03 = (Z0.d0(i12 << 3) + 1) * size2;
                        i11 += d03;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d03 = 0;
                    i11 += d03;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7763G /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e16 = E1.f2619a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        d05 = Z0.d0(i12 << 3) * size3;
                        for (int i18 = 0; i18 < size3; i18++) {
                            Object obj = list5.get(i18);
                            if (obj instanceof Y0) {
                                int d5 = ((Y0) obj).d();
                                d05 = B0.c.e(d5, d5, d05);
                            } else {
                                d05 = Z0.c0((String) obj) + d05;
                            }
                        }
                        i11 += d05;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d05 = 0;
                    i11 += d05;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7764H /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC0190g12, j3);
                    D1 B5 = c0237w1.B(i9);
                    C0184e1 c0184e17 = E1.f2619a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        d06 = 0;
                    } else {
                        d06 = Z0.d0(i12 << 3) * size4;
                        for (int i19 = 0; i19 < size4; i19++) {
                            int a5 = ((S0) list6.get(i19)).a(B5);
                            d06 = B0.c.e(a5, a5, d06);
                        }
                    }
                    i11 += d06;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e18 = E1.f2619a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        d05 = Z0.d0(i12 << 3) * size5;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int d6 = ((Y0) list7.get(i20)).d();
                            d05 = B0.c.e(d6, d6, d05);
                        }
                        i11 += d05;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d05 = 0;
                    i11 += d05;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7765I /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e19 = E1.f2619a;
                    size = list8.size();
                    if (size != 0) {
                        n3 = E1.m(list8);
                        d04 = Z0.d0(i12 << 3);
                        d05 = (d04 * size) + n3;
                        i11 += d05;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d05 = 0;
                    i11 += d05;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e110 = E1.f2619a;
                    size = list9.size();
                    if (size != 0) {
                        n3 = E1.f(list9);
                        d04 = Z0.d0(i12 << 3);
                        d05 = (d04 * size) + n3;
                        i11 += d05;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d05 = 0;
                    i11 += d05;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 31:
                    i4 = E1.g(i12, (List) unsafe.getObject(abstractC0190g12, j3));
                    i11 += i4;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 32:
                    i4 = E1.h(i12, (List) unsafe.getObject(abstractC0190g12, j3));
                    i11 += i4;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e111 = E1.f2619a;
                    size = list10.size();
                    if (size != 0) {
                        n3 = E1.k(list10);
                        d04 = Z0.d0(i12 << 3);
                        d05 = (d04 * size) + n3;
                        i11 += d05;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d05 = 0;
                    i11 += d05;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e112 = E1.f2619a;
                    size = list11.size();
                    if (size != 0) {
                        n3 = E1.l(list11);
                        d04 = Z0.d0(i12 << 3);
                        d05 = (d04 * size) + n3;
                        i11 += d05;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                    d05 = 0;
                    i11 += d05;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7766J /* 35 */:
                    List list12 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e113 = E1.f2619a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i11 = B0.c.f(size6, Z0.d0(i12 << 3), size6, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e114 = E1.f2619a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i11 = B0.c.f(size7, Z0.d0(i12 << 3), size7, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 37:
                    int j9 = E1.j((List) unsafe.getObject(abstractC0190g12, j3));
                    if (j9 > 0) {
                        i11 = B0.c.f(j9, Z0.d0(i12 << 3), j9, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7767K /* 38 */:
                    int n4 = E1.n((List) unsafe.getObject(abstractC0190g12, j3));
                    if (n4 > 0) {
                        i11 = B0.c.f(n4, Z0.d0(i12 << 3), n4, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 39:
                    int i21 = E1.i((List) unsafe.getObject(abstractC0190g12, j3));
                    if (i21 > 0) {
                        i11 = B0.c.f(i21, Z0.d0(i12 << 3), i21, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.L /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e115 = E1.f2619a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i11 = B0.c.f(size8, Z0.d0(i12 << 3), size8, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e116 = E1.f2619a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i11 = B0.c.f(size9, Z0.d0(i12 << 3), size9, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7768M /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e117 = E1.f2619a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i11 = B0.c.f(size10, Z0.d0(i12 << 3), size10, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 43:
                    int m3 = E1.m((List) unsafe.getObject(abstractC0190g12, j3));
                    if (m3 > 0) {
                        i11 = B0.c.f(m3, Z0.d0(i12 << 3), m3, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 44:
                    int f = E1.f((List) unsafe.getObject(abstractC0190g12, j3));
                    if (f > 0) {
                        i11 = B0.c.f(f, Z0.d0(i12 << 3), f, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e118 = E1.f2619a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i11 = B0.c.f(size11, Z0.d0(i12 << 3), size11, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0190g12, j3);
                    C0184e1 c0184e119 = E1.f2619a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i11 = B0.c.f(size12, Z0.d0(i12 << 3), size12, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 47:
                    int k3 = E1.k((List) unsafe.getObject(abstractC0190g12, j3));
                    if (k3 > 0) {
                        i11 = B0.c.f(k3, Z0.d0(i12 << 3), k3, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 48:
                    int l3 = E1.l((List) unsafe.getObject(abstractC0190g12, j3));
                    if (l3 > 0) {
                        i11 = B0.c.f(l3, Z0.d0(i12 << 3), l3, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0190g12, j3);
                    D1 B6 = c0237w1.B(i9);
                    C0184e1 c0184e120 = E1.f2619a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i22 = 0; i22 < size13; i22++) {
                            S0 s03 = (S0) list19.get(i22);
                            int d012 = Z0.d0(i12 << 3);
                            i6 += s03.a(B6) + d012 + d012;
                        }
                    }
                    i11 += i6;
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0190g12, j3);
                    int i23 = i9 / 3;
                    C0225s1 c0225s1 = (C0225s1) object3;
                    if (c0237w1.f2842b[i23 + i23] != null) {
                        throw new ClassCastException();
                    }
                    if (c0225s1.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c0225s1.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 51:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        i11 = B0.c.e(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 52:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        i11 = B0.c.e(i12 << 3, 4, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 53:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        long z3 = z(j3, abstractC0190g12);
                        d07 = Z0.d0(i12 << 3);
                        N3 = Z0.N(z3);
                        i11 += N3 + d07;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 54:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        long z4 = z(j3, abstractC0190g12);
                        d07 = Z0.d0(i12 << 3);
                        N3 = Z0.N(z4);
                        i11 += N3 + d07;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 55:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        long v3 = v(j3, abstractC0190g12);
                        d07 = Z0.d0(i12 << 3);
                        N3 = Z0.N(v3);
                        i11 += N3 + d07;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 56:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        i11 = B0.c.e(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 57:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        i11 = B0.c.e(i12 << 3, 4, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 58:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        i11 = B0.c.e(i12 << 3, 1, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 59:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        int i24 = i12 << 3;
                        Object object4 = unsafe.getObject(abstractC0190g12, j3);
                        if (object4 instanceof Y0) {
                            int d013 = Z0.d0(i24);
                            int d7 = ((Y0) object4).d();
                            i11 = B0.c.f(d7, d7, d013, i11);
                        } else {
                            d07 = Z0.d0(i24);
                            N3 = Z0.c0((String) object4);
                            i11 += N3 + d07;
                        }
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 60:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        Object object5 = unsafe.getObject(abstractC0190g12, j3);
                        D1 B7 = c0237w1.B(i9);
                        C0184e1 c0184e121 = E1.f2619a;
                        int d014 = Z0.d0(i12 << 3);
                        int a6 = ((S0) object5).a(B7);
                        i11 = B0.c.f(a6, a6, d014, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 61:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        Y0 y03 = (Y0) unsafe.getObject(abstractC0190g12, j3);
                        int d015 = Z0.d0(i12 << 3);
                        int d8 = y03.d();
                        i11 = B0.c.f(d8, d8, d015, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 62:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        i11 = B0.c.e(v(j3, abstractC0190g12), Z0.d0(i12 << 3), i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 63:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        long v4 = v(j3, abstractC0190g12);
                        d07 = Z0.d0(i12 << 3);
                        N3 = Z0.N(v4);
                        i11 += N3 + d07;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        i11 = B0.c.e(i12 << 3, 4, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 65:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        i11 = B0.c.e(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 66:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        int v5 = v(j3, abstractC0190g12);
                        i11 = B0.c.e((v5 >> 31) ^ (v5 + v5), Z0.d0(i12 << 3), i11);
                    }
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
                case 67:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        long z5 = z(j3, abstractC0190g12);
                        d07 = Z0.d0(i12 << 3);
                        N3 = Z0.N((z5 >> 63) ^ (z5 + z5));
                        i11 += N3 + d07;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                case 68:
                    if (c0237w1.s(i12, i9, abstractC0190g12)) {
                        S0 s04 = (S0) unsafe.getObject(abstractC0190g12, j3);
                        D1 B8 = c0237w1.B(i9);
                        int d016 = Z0.d0(i12 << 3);
                        i5 = d016 + d016;
                        a3 = s04.a(B8);
                        i4 = a3 + i5;
                        i11 += i4;
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    } else {
                        i9 += 3;
                        i7 = 1048575;
                        c0237w1 = this;
                    }
                default:
                    i9 += 3;
                    i7 = 1048575;
                    c0237w1 = this;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.D1
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2841a;
            if (i3 >= iArr.length) {
                E1.p(obj, obj2);
                return;
            }
            int y = y(i3);
            int i4 = y & 1048575;
            int x3 = x(y);
            int i5 = iArr[i3];
            long j3 = i4;
            switch (x3) {
                case 0:
                    if (p(i3, obj2)) {
                        L1 l12 = M1.f2658c;
                        obj3 = obj;
                        l12.e(obj3, j3, l12.a(j3, obj2));
                        l(i3, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (p(i3, obj2)) {
                        L1 l13 = M1.f2658c;
                        l13.f(obj, j3, l13.b(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i3, obj2)) {
                        M1.j(obj, j3, M1.e(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i3, obj2)) {
                        M1.j(obj, j3, M1.e(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i3, obj2)) {
                        M1.i(obj, j3, M1.d(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i3, obj2)) {
                        M1.j(obj, j3, M1.e(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i3, obj2)) {
                        M1.i(obj, j3, M1.d(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i3, obj2)) {
                        L1 l14 = M1.f2658c;
                        l14.c(obj, j3, l14.g(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i3, obj2)) {
                        M1.k(j3, obj, M1.g(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    j(obj, i3, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i3, obj2)) {
                        M1.k(j3, obj, M1.g(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i3, obj2)) {
                        M1.i(obj, j3, M1.d(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i3, obj2)) {
                        M1.i(obj, j3, M1.d(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i3, obj2)) {
                        M1.i(obj, j3, M1.d(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i3, obj2)) {
                        M1.j(obj, j3, M1.e(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i3, obj2)) {
                        M1.i(obj, j3, M1.d(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i3, obj2)) {
                        M1.j(obj, j3, M1.e(j3, obj2));
                        l(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    j(obj, i3, obj2);
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
                    InterfaceC0202k1 interfaceC0202k1 = (InterfaceC0202k1) M1.g(j3, obj);
                    InterfaceC0202k1 interfaceC0202k12 = (InterfaceC0202k1) M1.g(j3, obj2);
                    int size = interfaceC0202k1.size();
                    int size2 = interfaceC0202k12.size();
                    if (size > 0 && size2 > 0) {
                        if (!((T0) interfaceC0202k1).f2681a) {
                            interfaceC0202k1 = interfaceC0202k1.a(size2 + size);
                        }
                        interfaceC0202k1.addAll(interfaceC0202k12);
                    }
                    if (size > 0) {
                        interfaceC0202k12 = interfaceC0202k1;
                    }
                    M1.k(j3, obj, interfaceC0202k12);
                    obj3 = obj;
                    break;
                case 50:
                    C0184e1 c0184e1 = E1.f2619a;
                    M1.k(j3, obj, C0184e1.c(M1.g(j3, obj), M1.g(j3, obj2)));
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
                    if (s(i5, i3, obj2)) {
                        M1.k(j3, obj, M1.g(j3, obj2));
                        M1.i(obj, iArr[i3 + 2] & 1048575, i5);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    k(obj, i3, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (s(i5, i3, obj2)) {
                        M1.k(j3, obj, M1.g(j3, obj2));
                        M1.i(obj, iArr[i3 + 2] & 1048575, i5);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(obj, i3, obj2);
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
    @Override // com.google.android.gms.internal.play_billing.D1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(AbstractC0190g1 abstractC0190g1) {
        int i3;
        long doubleToLongBits;
        int i4;
        int floatToIntBits;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f2841a;
            if (i7 >= iArr.length) {
                return abstractC0190g1.zzc.hashCode() + (i8 * 53);
            }
            int y = y(i7);
            int i9 = 1048575 & y;
            int x3 = x(y);
            int i10 = iArr[i7];
            long j3 = i9;
            int i11 = 1237;
            int i12 = 37;
            switch (x3) {
                case 0:
                    i3 = i8 * 53;
                    doubleToLongBits = Double.doubleToLongBits(M1.f2658c.a(j3, abstractC0190g1));
                    Charset charset = AbstractC0205l1.f2772a;
                    i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i4 = i8 * 53;
                    floatToIntBits = Float.floatToIntBits(M1.f2658c.b(j3, abstractC0190g1));
                    i8 = floatToIntBits + i4;
                    break;
                case 2:
                    i3 = i8 * 53;
                    doubleToLongBits = M1.e(j3, abstractC0190g1);
                    Charset charset2 = AbstractC0205l1.f2772a;
                    i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i3 = i8 * 53;
                    doubleToLongBits = M1.e(j3, abstractC0190g1);
                    Charset charset3 = AbstractC0205l1.f2772a;
                    i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i4 = i8 * 53;
                    floatToIntBits = M1.d(j3, abstractC0190g1);
                    i8 = floatToIntBits + i4;
                    break;
                case 5:
                    i3 = i8 * 53;
                    doubleToLongBits = M1.e(j3, abstractC0190g1);
                    Charset charset4 = AbstractC0205l1.f2772a;
                    i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i4 = i8 * 53;
                    floatToIntBits = M1.d(j3, abstractC0190g1);
                    i8 = floatToIntBits + i4;
                    break;
                case 7:
                    i5 = i8 * 53;
                    boolean g3 = M1.f2658c.g(j3, abstractC0190g1);
                    Charset charset5 = AbstractC0205l1.f2772a;
                    break;
                case 8:
                    i4 = i8 * 53;
                    floatToIntBits = ((String) M1.g(j3, abstractC0190g1)).hashCode();
                    i8 = floatToIntBits + i4;
                    break;
                case 9:
                    i6 = i8 * 53;
                    Object g4 = M1.g(j3, abstractC0190g1);
                    if (g4 != null) {
                        i12 = g4.hashCode();
                    }
                    i8 = i6 + i12;
                    break;
                case 10:
                    i4 = i8 * 53;
                    floatToIntBits = M1.g(j3, abstractC0190g1).hashCode();
                    i8 = floatToIntBits + i4;
                    break;
                case 11:
                    i4 = i8 * 53;
                    floatToIntBits = M1.d(j3, abstractC0190g1);
                    i8 = floatToIntBits + i4;
                    break;
                case 12:
                    i4 = i8 * 53;
                    floatToIntBits = M1.d(j3, abstractC0190g1);
                    i8 = floatToIntBits + i4;
                    break;
                case 13:
                    i4 = i8 * 53;
                    floatToIntBits = M1.d(j3, abstractC0190g1);
                    i8 = floatToIntBits + i4;
                    break;
                case 14:
                    i3 = i8 * 53;
                    doubleToLongBits = M1.e(j3, abstractC0190g1);
                    Charset charset6 = AbstractC0205l1.f2772a;
                    i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i4 = i8 * 53;
                    floatToIntBits = M1.d(j3, abstractC0190g1);
                    i8 = floatToIntBits + i4;
                    break;
                case 16:
                    i3 = i8 * 53;
                    doubleToLongBits = M1.e(j3, abstractC0190g1);
                    Charset charset7 = AbstractC0205l1.f2772a;
                    i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i6 = i8 * 53;
                    Object g5 = M1.g(j3, abstractC0190g1);
                    if (g5 != null) {
                        i12 = g5.hashCode();
                    }
                    i8 = i6 + i12;
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
                    i4 = i8 * 53;
                    floatToIntBits = M1.g(j3, abstractC0190g1).hashCode();
                    i8 = floatToIntBits + i4;
                    break;
                case 50:
                    i4 = i8 * 53;
                    floatToIntBits = M1.g(j3, abstractC0190g1).hashCode();
                    i8 = floatToIntBits + i4;
                    break;
                case 51:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i3 = i8 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) M1.g(j3, abstractC0190g1)).doubleValue());
                        Charset charset8 = AbstractC0205l1.f2772a;
                        i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) M1.g(j3, abstractC0190g1)).floatValue());
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case 53:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i3 = i8 * 53;
                        doubleToLongBits = z(j3, abstractC0190g1);
                        Charset charset9 = AbstractC0205l1.f2772a;
                        i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i3 = i8 * 53;
                        doubleToLongBits = z(j3, abstractC0190g1);
                        Charset charset10 = AbstractC0205l1.f2772a;
                        i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = v(j3, abstractC0190g1);
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case 56:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i3 = i8 * 53;
                        doubleToLongBits = z(j3, abstractC0190g1);
                        Charset charset11 = AbstractC0205l1.f2772a;
                        i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = v(j3, abstractC0190g1);
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case 58:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i5 = i8 * 53;
                        boolean booleanValue = ((Boolean) M1.g(j3, abstractC0190g1)).booleanValue();
                        Charset charset12 = AbstractC0205l1.f2772a;
                        break;
                    }
                case 59:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = ((String) M1.g(j3, abstractC0190g1)).hashCode();
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case 60:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = M1.g(j3, abstractC0190g1).hashCode();
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case 61:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = M1.g(j3, abstractC0190g1).hashCode();
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case 62:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = v(j3, abstractC0190g1);
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case 63:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = v(j3, abstractC0190g1);
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = v(j3, abstractC0190g1);
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case 65:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i3 = i8 * 53;
                        doubleToLongBits = z(j3, abstractC0190g1);
                        Charset charset13 = AbstractC0205l1.f2772a;
                        i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = v(j3, abstractC0190g1);
                        i8 = floatToIntBits + i4;
                        break;
                    }
                case 67:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i3 = i8 * 53;
                        doubleToLongBits = z(j3, abstractC0190g1);
                        Charset charset14 = AbstractC0205l1.f2772a;
                        i8 = i3 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!s(i10, i7, abstractC0190g1)) {
                        break;
                    } else {
                        i4 = i8 * 53;
                        floatToIntBits = M1.g(j3, abstractC0190g1).hashCode();
                        i8 = floatToIntBits + i4;
                        break;
                    }
            }
            i7 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean f(AbstractC0190g1 abstractC0190g1, AbstractC0190g1 abstractC0190g12) {
        boolean e3;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2841a;
            if (i3 < iArr.length) {
                int y = y(i3);
                long j3 = y & 1048575;
                switch (x(y)) {
                    case 0:
                        if (!o(abstractC0190g1, abstractC0190g12, i3)) {
                            break;
                        } else {
                            L1 l12 = M1.f2658c;
                            if (Double.doubleToLongBits(l12.a(j3, abstractC0190g1)) != Double.doubleToLongBits(l12.a(j3, abstractC0190g12))) {
                                break;
                            } else {
                                continue;
                                i3 += 3;
                            }
                        }
                    case 1:
                        if (!o(abstractC0190g1, abstractC0190g12, i3)) {
                            break;
                        } else {
                            L1 l13 = M1.f2658c;
                            if (Float.floatToIntBits(l13.b(j3, abstractC0190g1)) != Float.floatToIntBits(l13.b(j3, abstractC0190g12))) {
                                break;
                            } else {
                                continue;
                                i3 += 3;
                            }
                        }
                    case 2:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.e(j3, abstractC0190g1) == M1.e(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 3:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.e(j3, abstractC0190g1) == M1.e(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 4:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.d(j3, abstractC0190g1) == M1.d(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 5:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.e(j3, abstractC0190g1) == M1.e(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 6:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.d(j3, abstractC0190g1) == M1.d(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 7:
                        if (!o(abstractC0190g1, abstractC0190g12, i3)) {
                            break;
                        } else {
                            L1 l14 = M1.f2658c;
                            if (l14.g(j3, abstractC0190g1) != l14.g(j3, abstractC0190g12)) {
                                break;
                            } else {
                                continue;
                                i3 += 3;
                            }
                        }
                    case 8:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && E1.e(M1.g(j3, abstractC0190g1), M1.g(j3, abstractC0190g12))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 9:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && E1.e(M1.g(j3, abstractC0190g1), M1.g(j3, abstractC0190g12))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 10:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && E1.e(M1.g(j3, abstractC0190g1), M1.g(j3, abstractC0190g12))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 11:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.d(j3, abstractC0190g1) == M1.d(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 12:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.d(j3, abstractC0190g1) == M1.d(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 13:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.d(j3, abstractC0190g1) == M1.d(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 14:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.e(j3, abstractC0190g1) == M1.e(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 15:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.d(j3, abstractC0190g1) == M1.d(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 16:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && M1.e(j3, abstractC0190g1) == M1.e(j3, abstractC0190g12)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 17:
                        if (o(abstractC0190g1, abstractC0190g12, i3) && E1.e(M1.g(j3, abstractC0190g1), M1.g(j3, abstractC0190g12))) {
                            continue;
                            i3 += 3;
                        }
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
                        e3 = E1.e(M1.g(j3, abstractC0190g1), M1.g(j3, abstractC0190g12));
                        break;
                    case 50:
                        e3 = E1.e(M1.g(j3, abstractC0190g1), M1.g(j3, abstractC0190g12));
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
                        if (M1.d(j4, abstractC0190g1) == M1.d(j4, abstractC0190g12) && E1.e(M1.g(j3, abstractC0190g1), M1.g(j3, abstractC0190g12))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    default:
                        i3 += 3;
                }
                if (e3) {
                    i3 += 3;
                }
            } else if (abstractC0190g1.zzc.equals(abstractC0190g12.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final AbstractC0190g1 g() {
        return (AbstractC0190g1) ((AbstractC0190g1) this.f2845e).d(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.D1
    public final void h(Object obj, C0222r1 c0222r1) {
        int i3;
        boolean z3;
        C0237w1 c0237w1 = this;
        Unsafe unsafe = f2840k;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = c0237w1.f2841a;
            if (i6 >= iArr.length) {
                ((AbstractC0190g1) obj).zzc.d(c0222r1);
                return;
            }
            int y = c0237w1.y(i6);
            int x3 = x(y);
            int i8 = iArr[i6];
            if (x3 <= 17) {
                int i9 = iArr[i6 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i3 = 1 << (i9 >>> 20);
            } else {
                i3 = 0;
            }
            long j3 = y & i4;
            switch (x3) {
                case 0:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).S(i8, Double.doubleToRawLongBits(M1.f2658c.a(j3, obj)));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 1:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).Q(i8, Float.floatToRawIntBits(M1.f2658c.b(j3, obj)));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 2:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).a0(i8, unsafe.getLong(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 3:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).a0(i8, unsafe.getLong(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 4:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).U(i8, unsafe.getInt(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 5:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).S(i8, unsafe.getLong(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 6:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).Q(i8, unsafe.getInt(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 7:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        byte g3 = M1.f2658c.g(j3, obj);
                        Z0 z02 = (Z0) c0222r1.f2807a;
                        z02.Z(i8 << 3);
                        int i11 = z02.f2722e;
                        try {
                            int i12 = i11 + 1;
                            try {
                                z02.f2720c[i11] = g3;
                                z02.f2722e = i12;
                            } catch (IndexOutOfBoundsException e3) {
                                e = e3;
                                i11 = i12;
                                throw new C0137l(i11, z02.f2721d, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 8:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((Z0) c0222r1.f2807a).W(i8, (String) object);
                        } else {
                            ((Z0) c0222r1.f2807a).P(i8, (Y0) object);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 9:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        c0222r1.d(i8, unsafe.getObject(obj, j3), c0237w1.B(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 10:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).P(i8, (Y0) unsafe.getObject(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 11:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).Y(i8, unsafe.getInt(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 12:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).U(i8, unsafe.getInt(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 13:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).Q(i8, unsafe.getInt(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 14:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        ((Z0) c0222r1.f2807a).S(i8, unsafe.getLong(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 15:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        int i13 = unsafe.getInt(obj, j3);
                        ((Z0) c0222r1.f2807a).Y(i8, (i13 >> 31) ^ (i13 + i13));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 16:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        long j4 = unsafe.getLong(obj, j3);
                        ((Z0) c0222r1.f2807a).a0(i8, (j4 + j4) ^ (j4 >> 63));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 17:
                    if (c0237w1.q(obj, i6, i5, i7, i3)) {
                        c0222r1.c(i8, unsafe.getObject(obj, j3), c0237w1.B(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 18:
                    E1.r(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7759C /* 19 */:
                    E1.v(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7760D /* 20 */:
                    E1.x(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7761E /* 21 */:
                    E1.d(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 22:
                    E1.w(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 23:
                    E1.u(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 24:
                    E1.t(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7762F /* 25 */:
                    E1.q(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7763G /* 26 */:
                    int i14 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j3);
                    C0184e1 c0184e1 = E1.f2619a;
                    if (list != null && !list.isEmpty()) {
                        c0222r1.getClass();
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            ((Z0) c0222r1.f2807a).W(i14, (String) list.get(i15));
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                    break;
                case C0644l9.f7764H /* 27 */:
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    D1 B3 = c0237w1.B(i6);
                    C0184e1 c0184e12 = E1.f2619a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            c0222r1.d(i16, list2.get(i17), B3);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                    break;
                case 28:
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    C0184e1 c0184e13 = E1.f2619a;
                    if (list3 != null && !list3.isEmpty()) {
                        c0222r1.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((Z0) c0222r1.f2807a).P(i18, (Y0) list3.get(i19));
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                    break;
                case C0644l9.f7765I /* 29 */:
                    z3 = false;
                    E1.c(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 30:
                    z3 = false;
                    E1.s(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 31:
                    z3 = false;
                    E1.y(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 32:
                    z3 = false;
                    E1.z(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 33:
                    z3 = false;
                    E1.a(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 34:
                    z3 = false;
                    E1.b(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, false);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7766J /* 35 */:
                    E1.r(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 36:
                    E1.v(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 37:
                    E1.x(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7767K /* 38 */:
                    E1.d(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 39:
                    E1.w(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case C0644l9.L /* 40 */:
                    E1.u(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 41:
                    E1.t(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case C0644l9.f7768M /* 42 */:
                    E1.q(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 43:
                    E1.c(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 44:
                    E1.s(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 45:
                    E1.y(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 46:
                    E1.z(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 47:
                    E1.a(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 48:
                    E1.b(iArr[i6], (List) unsafe.getObject(obj, j3), c0222r1, true);
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 49:
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    D1 B4 = c0237w1.B(i6);
                    C0184e1 c0184e14 = E1.f2619a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            c0222r1.c(i20, list4.get(i21), B4);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j3) != null) {
                        int i22 = i6 / 3;
                        c0237w1.f2842b[i22 + i22].getClass();
                        throw new ClassCastException();
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 51:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).S(i8, Double.doubleToRawLongBits(((Double) M1.g(j3, obj)).doubleValue()));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 52:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).Q(i8, Float.floatToRawIntBits(((Float) M1.g(j3, obj)).floatValue()));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 53:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).a0(i8, z(j3, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 54:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).a0(i8, z(j3, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 55:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).U(i8, v(j3, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 56:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).S(i8, z(j3, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 57:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).Q(i8, v(j3, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 58:
                    if (c0237w1.s(i8, i6, obj)) {
                        byte booleanValue = ((Boolean) M1.g(j3, obj)).booleanValue();
                        Z0 z03 = (Z0) c0222r1.f2807a;
                        z03.Z(i8 << 3);
                        int i23 = z03.f2722e;
                        try {
                            int i24 = i23 + 1;
                            try {
                                z03.f2720c[i23] = booleanValue;
                                z03.f2722e = i24;
                            } catch (IndexOutOfBoundsException e5) {
                                e = e5;
                                i23 = i24;
                                throw new C0137l(i23, z03.f2721d, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e6) {
                            e = e6;
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 59:
                    if (c0237w1.s(i8, i6, obj)) {
                        Object object2 = unsafe.getObject(obj, j3);
                        if (object2 instanceof String) {
                            ((Z0) c0222r1.f2807a).W(i8, (String) object2);
                        } else {
                            ((Z0) c0222r1.f2807a).P(i8, (Y0) object2);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 60:
                    if (c0237w1.s(i8, i6, obj)) {
                        c0222r1.d(i8, unsafe.getObject(obj, j3), c0237w1.B(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 61:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).P(i8, (Y0) unsafe.getObject(obj, j3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 62:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).Y(i8, v(j3, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 63:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).U(i8, v(j3, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).Q(i8, v(j3, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 65:
                    if (c0237w1.s(i8, i6, obj)) {
                        ((Z0) c0222r1.f2807a).S(i8, z(j3, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 66:
                    if (c0237w1.s(i8, i6, obj)) {
                        int v3 = v(j3, obj);
                        ((Z0) c0222r1.f2807a).Y(i8, (v3 >> 31) ^ (v3 + v3));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 67:
                    if (c0237w1.s(i8, i6, obj)) {
                        long z4 = z(j3, obj);
                        ((Z0) c0222r1.f2807a).a0(i8, (z4 + z4) ^ (z4 >> 63));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                case 68:
                    if (c0237w1.s(i8, i6, obj)) {
                        c0222r1.c(i8, unsafe.getObject(obj, j3), c0237w1.B(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
                default:
                    i6 += 3;
                    i4 = 1048575;
                    c0237w1 = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean i(Object obj) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i7 < this.f2846g) {
            int i9 = this.f[i7];
            int[] iArr = this.f2841a;
            int i10 = iArr[i9];
            int y = y(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i8) {
                if (i12 != 1048575) {
                    i6 = f2840k.getInt(obj, i12);
                }
                i4 = i9;
                i5 = i6;
                i3 = i12;
            } else {
                int i14 = i6;
                i3 = i8;
                i4 = i9;
                i5 = i14;
            }
            if ((268435456 & y) == 0 || q(obj, i4, i3, i5, i13)) {
                int x3 = x(y);
                if (x3 == 9 || x3 == 17) {
                    if (q(obj, i4, i3, i5, i13) && !B(i4).i(M1.g(y & 1048575, obj))) {
                    }
                    i7++;
                    i8 = i3;
                    i6 = i5;
                } else {
                    if (x3 != 27) {
                        if (x3 == 60 || x3 == 68) {
                            if (s(i10, i4, obj) && !B(i4).i(M1.g(y & 1048575, obj))) {
                            }
                        } else if (x3 != 49) {
                            if (x3 == 50 && !((C0225s1) M1.g(y & 1048575, obj)).isEmpty()) {
                                int i15 = i4 / 3;
                                this.f2842b[i15 + i15].getClass();
                                throw new ClassCastException();
                            }
                        }
                        i7++;
                        i8 = i3;
                        i6 = i5;
                    }
                    List list = (List) M1.g(y & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        D1 B3 = B(i4);
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            if (B3.i(list.get(i16))) {
                            }
                        }
                    }
                    i7++;
                    i8 = i3;
                    i6 = i5;
                }
            }
            return false;
        }
        return true;
    }

    public final void j(Object obj, int i3, Object obj2) {
        if (p(i3, obj2)) {
            int y = y(i3) & 1048575;
            Unsafe unsafe = f2840k;
            long j3 = y;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f2841a[i3] + " is present but null: " + obj2.toString());
            }
            D1 B3 = B(i3);
            if (!p(i3, obj)) {
                if (r(object)) {
                    AbstractC0190g1 g3 = B3.g();
                    B3.d(g3, object);
                    unsafe.putObject(obj, j3, g3);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                l(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!r(object2)) {
                AbstractC0190g1 g4 = B3.g();
                B3.d(g4, object2);
                unsafe.putObject(obj, j3, g4);
                object2 = g4;
            }
            B3.d(object2, object);
        }
    }

    public final void k(Object obj, int i3, Object obj2) {
        int[] iArr = this.f2841a;
        int i4 = iArr[i3];
        if (s(i4, i3, obj2)) {
            int y = y(i3) & 1048575;
            Unsafe unsafe = f2840k;
            long j3 = y;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2.toString());
            }
            D1 B3 = B(i3);
            if (!s(i4, i3, obj)) {
                if (r(object)) {
                    AbstractC0190g1 g3 = B3.g();
                    B3.d(g3, object);
                    unsafe.putObject(obj, j3, g3);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                M1.i(obj, iArr[i3 + 2] & 1048575, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!r(object2)) {
                AbstractC0190g1 g4 = B3.g();
                B3.d(g4, object2);
                unsafe.putObject(obj, j3, g4);
                object2 = g4;
            }
            B3.d(object2, object);
        }
    }

    public final void l(int i3, Object obj) {
        int i4 = this.f2841a[i3 + 2];
        long j3 = 1048575 & i4;
        if (j3 == 1048575) {
            return;
        }
        M1.i(obj, j3, (1 << (i4 >>> 20)) | M1.d(j3, obj));
    }

    public final void m(Object obj, int i3, Object obj2) {
        f2840k.putObject(obj, y(i3) & 1048575, obj2);
        l(i3, obj);
    }

    public final void n(int i3, int i4, Object obj, Object obj2) {
        f2840k.putObject(obj, y(i4) & 1048575, obj2);
        M1.i(obj, this.f2841a[i4 + 2] & 1048575, i3);
    }

    public final boolean o(AbstractC0190g1 abstractC0190g1, AbstractC0190g1 abstractC0190g12, int i3) {
        return p(i3, abstractC0190g1) == p(i3, abstractC0190g12);
    }

    public final boolean p(int i3, Object obj) {
        int i4 = this.f2841a[i3 + 2];
        long j3 = i4 & 1048575;
        if (j3 == 1048575) {
            int y = y(i3);
            long j4 = y & 1048575;
            switch (x(y)) {
                case 0:
                    if (Double.doubleToRawLongBits(M1.f2658c.a(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(M1.f2658c.b(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (M1.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (M1.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (M1.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (M1.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (M1.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return M1.f2658c.g(j4, obj);
                case 8:
                    Object g3 = M1.g(j4, obj);
                    if (g3 instanceof String) {
                        if (((String) g3).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(g3 instanceof Y0)) {
                            throw new IllegalArgumentException();
                        }
                        if (Y0.f2714c.equals(g3)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (M1.g(j4, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (Y0.f2714c.equals(M1.g(j4, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (M1.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (M1.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (M1.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (M1.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (M1.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (M1.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (M1.g(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i4 >>> 20)) & M1.d(j3, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i3, int i4, int i5, int i6) {
        return i4 == 1048575 ? p(i3, obj) : (i5 & i6) != 0;
    }

    public final boolean s(int i3, int i4, Object obj) {
        return M1.d((long) (this.f2841a[i4 + 2] & 1048575), obj) == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0f33, code lost:
    
        if (r11 == r0) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0f35, code lost:
    
        r41.putInt(r14, r11, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0f3b, code lost:
    
        r0 = r38.f2846g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0f41, code lost:
    
        if (r0 >= r38.f2847h) goto L768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0f43, code lost:
    
        r2 = r38.f[r0];
        r3 = r35[r2];
        r3 = com.google.android.gms.internal.play_billing.M1.g(y(r2) & 1048575, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0f57, code lost:
    
        if (r3 != null) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0f63, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0f60, code lost:
    
        if (A(r2) != null) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0f66, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.C0225s1) r3;
        r2 = r2 / 3;
        r33[r2 + r2].getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0f77, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0f7a, code lost:
    
        if (r10 != 0) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0f7c, code lost:
    
        if (r8 != r5) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f84, code lost:
    
        throw new com.google.android.gms.internal.play_billing.C0211n1("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0f89, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x03bb, code lost:
    
        throw new com.google.android.gms.internal.play_billing.C0211n1("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0f85, code lost:
    
        if (r8 > r5) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0f87, code lost:
    
        if (r1 != r10) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x034f, code lost:
    
        throw new com.google.android.gms.internal.play_billing.C0211n1("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0f8f, code lost:
    
        throw new com.google.android.gms.internal.play_billing.C0211n1("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x02f4, code lost:
    
        throw new com.google.android.gms.internal.play_billing.C0211n1("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:764:0x04ae, code lost:
    
        r3 = r10;
        r16 = r12;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x04db, code lost:
    
        r11 = r41;
        r5 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0527, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0ba8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0bc1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0ecb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0ee2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(Object obj, byte[] bArr, int i3, int i4, int i5, V0 v0) {
        int i6;
        Unsafe unsafe;
        Object[] objArr;
        int[] iArr;
        Object obj2;
        int i7;
        int i8;
        int w3;
        byte[] bArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        V0 v02;
        boolean z3;
        byte[] bArr3;
        Unsafe unsafe2;
        Object obj3;
        Object obj4;
        V0 v03;
        Unsafe unsafe3;
        byte[] bArr4;
        int i18;
        int i19;
        int i20;
        byte[] bArr5;
        V0 v04;
        int i21;
        int i22;
        int i23;
        Unsafe unsafe4;
        int i24;
        byte[] bArr6;
        H1 h12;
        byte[] bArr7;
        Unsafe unsafe5;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr8;
        int i29;
        int i30;
        byte[] bArr9;
        int i31;
        int i32;
        int G3;
        Unsafe unsafe6;
        byte[] bArr10;
        Unsafe unsafe7;
        int i33;
        int i34;
        int I3;
        int i35;
        InterfaceC0202k1 interfaceC0202k1;
        int i36;
        int i37;
        byte[] bArr11;
        Unsafe unsafe8;
        int i38;
        int G4;
        int i39;
        C0225s1 c0225s1;
        int i40;
        int i41;
        int i42;
        int i43;
        int J2;
        int G5;
        int i44;
        H1 h13;
        int i45;
        int i46;
        H1 h14;
        int i47;
        int i48;
        int G6;
        C0237w1 c0237w1 = this;
        Object obj5 = obj;
        byte[] bArr12 = bArr;
        int i49 = i4;
        V0 v05 = v0;
        if (!r(obj5)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj5)));
        }
        Unsafe unsafe9 = f2840k;
        int i50 = i3;
        int i51 = -1;
        int i52 = 1048575;
        int i53 = 0;
        int i54 = 0;
        int i55 = 10;
        int i56 = 1;
        int i57 = 0;
        while (true) {
            int i58 = 2;
            while (true) {
                int[] iArr2 = c0237w1.f2841a;
                Object[] objArr2 = c0237w1.f2842b;
                if (i50 < i49) {
                    int i59 = i50 + 1;
                    int i60 = bArr12[i50];
                    if (i60 < 0) {
                        i59 = AbstractC0181d1.H(i60, bArr12, i59, v05);
                        i60 = v05.f2688a;
                    }
                    i57 = i60;
                    int i61 = i57 >>> 3;
                    int i62 = c0237w1.f2844d;
                    int i63 = c0237w1.f2843c;
                    if (i61 > i51) {
                        w3 = (i61 < i63 || i61 > i62) ? -1 : c0237w1.w(i61, i54 / 3);
                    } else {
                        w3 = (i61 < i63 || i61 > i62) ? -1 : c0237w1.w(i61, 0);
                    }
                    H1 h15 = H1.f;
                    if (w3 == -1) {
                        i6 = i5;
                        unsafe = unsafe9;
                        bArr2 = bArr12;
                        i9 = i59;
                        objArr = objArr2;
                        iArr = iArr2;
                        i10 = i53;
                        i7 = i57;
                        i11 = 1048575;
                        i54 = 0;
                        obj2 = obj5;
                        i12 = i61;
                    } else {
                        int i64 = i57 & 7;
                        int i65 = iArr2[w3 + 1];
                        int x3 = x(i65);
                        int i66 = i59;
                        long j3 = i65 & 1048575;
                        i13 = i61;
                        objArr = objArr2;
                        if (x3 <= 17) {
                            int i67 = iArr2[w3 + 2];
                            int i68 = i56 << (i67 >>> 20);
                            int i69 = i67 & 1048575;
                            iArr = iArr2;
                            if (i69 != i52) {
                                if (i52 != 1048575) {
                                    unsafe9.putInt(obj5, i52, i53);
                                }
                                i52 = i69;
                                i53 = i69 == 1048575 ? 0 : unsafe9.getInt(obj5, i69);
                            }
                            switch (x3) {
                                case 0:
                                    bArr3 = bArr;
                                    i14 = i66;
                                    v02 = v0;
                                    unsafe2 = unsafe9;
                                    i16 = i52;
                                    i17 = i53;
                                    z3 = false;
                                    if (i64 == i56) {
                                        i50 = i14 + 8;
                                        i53 = i17 | i68;
                                        M1.f2658c.e(obj5, j3, Double.longBitsToDouble(AbstractC0181d1.M(i14, bArr3)));
                                        i52 = i16;
                                        i49 = i4;
                                        obj5 = obj5;
                                        break;
                                    }
                                    obj3 = obj5;
                                    i52 = i16;
                                    i9 = i14;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    i54 = w3;
                                    v05 = v02;
                                    i10 = i17;
                                    i12 = i13;
                                    i11 = 1048575;
                                    i6 = i5;
                                    obj2 = obj3;
                                    i7 = i57;
                                    break;
                                case 1:
                                    bArr3 = bArr;
                                    i14 = i66;
                                    v02 = v0;
                                    unsafe2 = unsafe9;
                                    i16 = i52;
                                    i17 = i53;
                                    z3 = false;
                                    if (i64 == 5) {
                                        i50 = i14 + 4;
                                        i53 = i17 | i68;
                                        M1.f2658c.f(obj5, j3, Float.intBitsToFloat(AbstractC0181d1.n(i14, bArr3)));
                                        i52 = i16;
                                        i49 = i4;
                                        break;
                                    }
                                    obj3 = obj5;
                                    i52 = i16;
                                    i9 = i14;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    i54 = w3;
                                    v05 = v02;
                                    i10 = i17;
                                    i12 = i13;
                                    i11 = 1048575;
                                    i6 = i5;
                                    obj2 = obj3;
                                    i7 = i57;
                                    break;
                                case 2:
                                case 3:
                                    bArr3 = bArr;
                                    i14 = i66;
                                    v02 = v0;
                                    i16 = i52;
                                    i17 = i53;
                                    z3 = false;
                                    if (i64 == 0) {
                                        i53 = i17 | i68;
                                        i50 = AbstractC0181d1.J(bArr3, i14, v02);
                                        unsafe9.putLong(obj5, j3, v02.f2689b);
                                        break;
                                    }
                                    unsafe2 = unsafe9;
                                    obj3 = obj5;
                                    i52 = i16;
                                    i9 = i14;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    i54 = w3;
                                    v05 = v02;
                                    i10 = i17;
                                    i12 = i13;
                                    i11 = 1048575;
                                    i6 = i5;
                                    obj2 = obj3;
                                    i7 = i57;
                                    break;
                                case 4:
                                case 11:
                                    bArr3 = bArr;
                                    i14 = i66;
                                    v02 = v0;
                                    i16 = i52;
                                    i17 = i53;
                                    z3 = false;
                                    if (i64 == 0) {
                                        i53 = i17 | i68;
                                        i50 = AbstractC0181d1.G(bArr3, i14, v02);
                                        unsafe9.putInt(obj5, j3, v02.f2688a);
                                        break;
                                    }
                                    unsafe2 = unsafe9;
                                    obj3 = obj5;
                                    i52 = i16;
                                    i9 = i14;
                                    unsafe = unsafe2;
                                    bArr2 = bArr3;
                                    i54 = w3;
                                    v05 = v02;
                                    i10 = i17;
                                    i12 = i13;
                                    i11 = 1048575;
                                    i6 = i5;
                                    obj2 = obj3;
                                    i7 = i57;
                                    break;
                                case 5:
                                case 14:
                                    i14 = i66;
                                    Unsafe unsafe10 = unsafe9;
                                    i16 = i52;
                                    i17 = i53;
                                    z3 = false;
                                    obj4 = obj5;
                                    if (i64 != i56) {
                                        bArr3 = bArr;
                                        unsafe9 = unsafe10;
                                        v02 = v0;
                                        unsafe2 = unsafe9;
                                        obj3 = obj4;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        i50 = i14 + 8;
                                        bArr3 = bArr;
                                        unsafe9 = unsafe10;
                                        obj5 = obj4;
                                        v02 = v0;
                                        unsafe9.putLong(obj5, j3, AbstractC0181d1.M(i14, bArr));
                                        i52 = i16;
                                        i49 = i4;
                                        i53 = i17 | i68;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    i14 = i66;
                                    v03 = v0;
                                    unsafe3 = unsafe9;
                                    i16 = i52;
                                    i17 = i53;
                                    z3 = false;
                                    bArr4 = bArr;
                                    obj4 = obj5;
                                    if (i64 != 5) {
                                        v02 = v03;
                                        unsafe2 = unsafe3;
                                        bArr3 = bArr4;
                                        obj3 = obj4;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        i50 = i14 + 4;
                                        i18 = i17 | i68;
                                        unsafe3.putInt(obj4, j3, AbstractC0181d1.n(i14, bArr4));
                                        bArr12 = bArr4;
                                        i53 = i18;
                                        v05 = v03;
                                        unsafe9 = unsafe3;
                                        obj5 = obj4;
                                        i54 = w3;
                                        i51 = i13;
                                        i58 = 2;
                                        i52 = i16;
                                        i49 = i4;
                                    }
                                case 7:
                                    i14 = i66;
                                    v03 = v0;
                                    unsafe3 = unsafe9;
                                    i16 = i52;
                                    i17 = i53;
                                    z3 = false;
                                    bArr4 = bArr;
                                    obj4 = obj5;
                                    if (i64 != 0) {
                                        v02 = v03;
                                        unsafe2 = unsafe3;
                                        bArr3 = bArr4;
                                        obj3 = obj4;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        i18 = i17 | i68;
                                        i50 = AbstractC0181d1.J(bArr4, i14, v03);
                                        M1.f2658c.c(obj4, j3, v03.f2689b != 0 ? i56 : 0);
                                        bArr12 = bArr4;
                                        i53 = i18;
                                        v05 = v03;
                                        unsafe9 = unsafe3;
                                        obj5 = obj4;
                                        i54 = w3;
                                        i51 = i13;
                                        i58 = 2;
                                        i52 = i16;
                                        i49 = i4;
                                    }
                                case 8:
                                    i14 = i66;
                                    v03 = v0;
                                    unsafe3 = unsafe9;
                                    i16 = i52;
                                    i17 = i53;
                                    bArr4 = bArr;
                                    obj4 = obj5;
                                    if (i64 != i58) {
                                        z3 = false;
                                        v02 = v03;
                                        unsafe2 = unsafe3;
                                        bArr3 = bArr4;
                                        obj3 = obj4;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        if ((i65 & 536870912) != 0) {
                                            int i70 = i17 | i68;
                                            int G7 = AbstractC0181d1.G(bArr4, i14, v03);
                                            int i71 = v03.f2688a;
                                            if (i71 < 0) {
                                                throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i71 == 0) {
                                                v03.f2690c = "";
                                                i20 = i70;
                                            } else {
                                                int i72 = O1.f2665a;
                                                int length = bArr4.length;
                                                if ((((length - G7) - i71) | G7 | i71) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(G7), Integer.valueOf(i71)));
                                                }
                                                int i73 = G7 + i71;
                                                char[] cArr = new char[i71];
                                                int i74 = 0;
                                                while (G7 < i73) {
                                                    byte b3 = bArr4[G7];
                                                    if (b3 >= 0) {
                                                        G7++;
                                                        cArr[i74] = (char) b3;
                                                        i74++;
                                                    } else {
                                                        while (G7 < i73) {
                                                            int i75 = G7 + 1;
                                                            byte b4 = bArr4[G7];
                                                            if (b4 >= 0) {
                                                                cArr[i74] = (char) b4;
                                                                i74++;
                                                                G7 = i75;
                                                                while (G7 < i73) {
                                                                    byte b5 = bArr4[G7];
                                                                    if (b5 >= 0) {
                                                                        G7++;
                                                                        cArr[i74] = (char) b5;
                                                                        i74++;
                                                                    }
                                                                }
                                                            } else {
                                                                int i76 = i70;
                                                                if (b4 < -32) {
                                                                    if (i75 >= i73) {
                                                                        throw new C0211n1("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    int i77 = i74 + 1;
                                                                    G7 += 2;
                                                                    byte b6 = bArr4[i75];
                                                                    if (b4 >= -62 && !AbstractC0181d1.y(b6)) {
                                                                        cArr[i74] = (char) (((b4 & 31) << 6) | (b6 & 63));
                                                                        i70 = i76;
                                                                        i74 = i77;
                                                                    }
                                                                } else if (b4 < -16) {
                                                                    if (i75 >= i73 - 1) {
                                                                        throw new C0211n1("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    int i78 = i74 + 1;
                                                                    int i79 = G7 + 2;
                                                                    byte b7 = bArr4[i75];
                                                                    int i80 = G7 + 3;
                                                                    byte b8 = bArr4[i79];
                                                                    if (!AbstractC0181d1.y(b7)) {
                                                                        if (b4 == -32) {
                                                                            if (b7 < -96) {
                                                                                break;
                                                                            } else {
                                                                                b4 = -32;
                                                                            }
                                                                        }
                                                                        if (b4 == -19) {
                                                                            if (b7 >= -96) {
                                                                                break;
                                                                            } else {
                                                                                b4 = -19;
                                                                            }
                                                                        }
                                                                        if (AbstractC0181d1.y(b8)) {
                                                                            break;
                                                                        } else {
                                                                            cArr[i74] = (char) (((b4 & 15) << 12) | ((b7 & 63) << 6) | (b8 & 63));
                                                                            i70 = i76;
                                                                            i74 = i78;
                                                                            G7 = i80;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    if (i75 >= i73 - 2) {
                                                                        throw new C0211n1("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    byte b9 = bArr4[i75];
                                                                    int i81 = G7 + 3;
                                                                    byte b10 = bArr4[G7 + 2];
                                                                    G7 += 4;
                                                                    byte b11 = bArr4[i81];
                                                                    if (AbstractC0181d1.y(b9)) {
                                                                        break;
                                                                    } else {
                                                                        if ((((b9 + 112) + (b4 << 28)) >> 30) == 0 && !AbstractC0181d1.y(b10) && !AbstractC0181d1.y(b11)) {
                                                                            int i82 = ((b10 & 63) << 6) | ((b9 & 63) << 12) | ((b4 & 7) << 18) | (b11 & 63);
                                                                            cArr[i74] = (char) ((i82 >>> 10) + 55232);
                                                                            cArr[i74 + 1] = (char) ((i82 & 1023) + 56320);
                                                                            i74 += 2;
                                                                            i70 = i76;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i20 = i70;
                                                        v03.f2690c = new String(cArr, 0, i74);
                                                        G7 = i73;
                                                    }
                                                }
                                                while (G7 < i73) {
                                                }
                                                i20 = i70;
                                                v03.f2690c = new String(cArr, 0, i74);
                                                G7 = i73;
                                            }
                                            i50 = G7;
                                            i19 = i20;
                                        } else {
                                            int G8 = AbstractC0181d1.G(bArr4, i14, v03);
                                            int i83 = v03.f2688a;
                                            if (i83 < 0) {
                                                throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            i19 = i17 | i68;
                                            if (i83 == 0) {
                                                v03.f2690c = "";
                                            } else {
                                                v03.f2690c = new String(bArr4, G8, i83, AbstractC0205l1.f2772a);
                                                G8 += i83;
                                            }
                                            i50 = G8;
                                        }
                                        unsafe3.putObject(obj4, j3, v03.f2690c);
                                        bArr12 = bArr4;
                                        i53 = i19;
                                        v05 = v03;
                                        unsafe9 = unsafe3;
                                        obj5 = obj4;
                                        i54 = w3;
                                        i51 = i13;
                                        i58 = 2;
                                        i52 = i16;
                                        i49 = i4;
                                    }
                                    break;
                                case 9:
                                    i14 = i66;
                                    i16 = i52;
                                    int i84 = i58;
                                    Object obj6 = obj5;
                                    int i85 = i53;
                                    if (i64 != i84) {
                                        bArr3 = bArr;
                                        unsafe2 = unsafe9;
                                        i17 = i85;
                                        v02 = v0;
                                        obj3 = obj6;
                                        i57 = i57;
                                        z3 = false;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        i53 = i85 | i68;
                                        Unsafe unsafe11 = unsafe9;
                                        Object C2 = c0237w1.C(w3, obj6);
                                        v05 = v0;
                                        int L = AbstractC0181d1.L(C2, c0237w1.B(w3), bArr, i14, i4, v05);
                                        c0237w1.m(obj6, w3, C2);
                                        bArr12 = bArr;
                                        i58 = i84;
                                        unsafe9 = unsafe11;
                                        i54 = w3;
                                        i57 = i57;
                                        i51 = i13;
                                        i49 = i4;
                                        i50 = L;
                                        obj5 = obj6;
                                        i52 = i16;
                                    }
                                case 10:
                                    bArr5 = bArr;
                                    i14 = i66;
                                    v04 = v0;
                                    i16 = i52;
                                    i21 = i57;
                                    int i86 = i58;
                                    obj4 = obj5;
                                    i22 = i53;
                                    if (i64 != i86) {
                                        i17 = i22;
                                        v02 = v04;
                                        i57 = i21;
                                        z3 = false;
                                        bArr3 = bArr5;
                                        unsafe2 = unsafe9;
                                        obj3 = obj4;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        int c3 = AbstractC0181d1.c(bArr5, i14, v04);
                                        unsafe9.putObject(obj4, j3, v04.f2690c);
                                        i49 = i4;
                                        i53 = i22 | i68;
                                        i58 = i86;
                                        v05 = v04;
                                        obj5 = obj4;
                                        i54 = w3;
                                        i57 = i21;
                                        i51 = i13;
                                        i52 = i16;
                                        i50 = c3;
                                        bArr12 = bArr5;
                                    }
                                case 12:
                                    bArr5 = bArr;
                                    i14 = i66;
                                    v04 = v0;
                                    i16 = i52;
                                    i21 = i57;
                                    obj4 = obj5;
                                    i22 = i53;
                                    if (i64 != 0) {
                                        i17 = i22;
                                        v02 = v04;
                                        i57 = i21;
                                        z3 = false;
                                        bArr3 = bArr5;
                                        unsafe2 = unsafe9;
                                        obj3 = obj4;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        i50 = AbstractC0181d1.G(bArr5, i14, v04);
                                        int i87 = v04.f2688a;
                                        InterfaceC0196i1 A3 = c0237w1.A(w3);
                                        if ((i65 & Integer.MIN_VALUE) == 0 || A3 == null || A3.a(i87)) {
                                            i22 |= i68;
                                            unsafe9.putInt(obj4, j3, i87);
                                        } else {
                                            AbstractC0190g1 abstractC0190g1 = (AbstractC0190g1) obj4;
                                            H1 h16 = abstractC0190g1.zzc;
                                            if (h16 == h15) {
                                                h16 = H1.b();
                                                abstractC0190g1.zzc = h16;
                                            }
                                            h16.c(i21, Long.valueOf(i87));
                                        }
                                        i49 = i4;
                                        i53 = i22;
                                        bArr12 = bArr5;
                                        v05 = v04;
                                        obj5 = obj4;
                                        i54 = w3;
                                        i57 = i21;
                                        i51 = i13;
                                        i52 = i16;
                                    }
                                case 15:
                                    bArr5 = bArr;
                                    i14 = i66;
                                    i16 = i52;
                                    obj4 = obj5;
                                    if (i64 != 0) {
                                        i57 = i57;
                                        i13 = i13;
                                        i17 = i53;
                                        z3 = false;
                                        v02 = v0;
                                        bArr3 = bArr5;
                                        unsafe2 = unsafe9;
                                        obj3 = obj4;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        i53 |= i68;
                                        i50 = AbstractC0181d1.G(bArr5, i14, v0);
                                        int i88 = v0.f2688a;
                                        unsafe9.putInt(obj4, j3, (i88 >>> 1) ^ (-(i88 & 1)));
                                        i49 = i4;
                                        bArr12 = bArr5;
                                        v05 = v0;
                                        obj5 = obj4;
                                        i54 = w3;
                                        i57 = i57;
                                        i51 = i13;
                                        i52 = i16;
                                    }
                                case 16:
                                    i14 = i66;
                                    i15 = i13;
                                    if (i64 != 0) {
                                        i16 = i52;
                                        i57 = i57;
                                        i13 = i15;
                                        i17 = i53;
                                        v02 = v0;
                                        z3 = false;
                                        bArr3 = bArr;
                                        unsafe2 = unsafe9;
                                        obj3 = obj5;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        i53 |= i68;
                                        i50 = AbstractC0181d1.J(bArr, i14, v0);
                                        long j4 = v0.f2689b;
                                        unsafe9.putLong(obj5, j3, (j4 >>> i56) ^ (-(j4 & 1)));
                                        i52 = i52;
                                        i49 = i4;
                                        bArr12 = bArr;
                                        v05 = v0;
                                        i54 = w3;
                                        i57 = i57;
                                        i51 = i15;
                                    }
                                default:
                                    if (i64 != 3) {
                                        bArr3 = bArr;
                                        i14 = i66;
                                        v02 = v0;
                                        unsafe2 = unsafe9;
                                        obj3 = obj5;
                                        i16 = i52;
                                        i17 = i53;
                                        z3 = false;
                                        i52 = i16;
                                        i9 = i14;
                                        unsafe = unsafe2;
                                        bArr2 = bArr3;
                                        i54 = w3;
                                        v05 = v02;
                                        i10 = i17;
                                        i12 = i13;
                                        i11 = 1048575;
                                        i6 = i5;
                                        obj2 = obj3;
                                        i7 = i57;
                                        break;
                                    } else {
                                        i53 |= i68;
                                        Object C3 = c0237w1.C(w3, obj5);
                                        i15 = i13;
                                        i50 = AbstractC0181d1.K(C3, c0237w1.B(w3), bArr, i66, i4, (i13 << 3) | 4, v0);
                                        c0237w1.m(obj5, w3, C3);
                                        i49 = i4;
                                        v05 = v0;
                                        bArr12 = bArr;
                                        i54 = w3;
                                        i51 = i15;
                                    }
                            }
                        } else {
                            Object obj7 = obj5;
                            Unsafe unsafe12 = unsafe9;
                            int i89 = i52;
                            iArr = iArr2;
                            if (x3 != 27) {
                                obj2 = obj7;
                                if (x3 > 49) {
                                    unsafe4 = unsafe12;
                                    i23 = i66;
                                    i10 = i53;
                                    i24 = i57;
                                    i12 = i13;
                                    bArr6 = bArr;
                                    v05 = v0;
                                    h12 = h15;
                                    if (x3 != 50) {
                                        Unsafe unsafe13 = f2840k;
                                        i11 = 1048575;
                                        long j5 = iArr[w3 + 2] & 1048575;
                                        switch (x3) {
                                            case 51:
                                                bArr2 = bArr;
                                                i40 = i24;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i23;
                                                unsafe = unsafe4;
                                                if (i64 == 1) {
                                                    i43 = i42 + 8;
                                                    unsafe13.putObject(obj2, j3, Double.valueOf(Double.longBitsToDouble(AbstractC0181d1.M(i42, bArr2))));
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i50 = i43;
                                                    if (i50 != i42) {
                                                        i6 = i5;
                                                        i9 = i50;
                                                        i7 = i40;
                                                        i54 = i41;
                                                        i52 = i89;
                                                        break;
                                                    } else {
                                                        c0237w1 = this;
                                                        unsafe9 = unsafe;
                                                        bArr12 = bArr2;
                                                        obj5 = obj2;
                                                        i51 = i12;
                                                        i54 = i41;
                                                        i52 = i89;
                                                        i53 = i10;
                                                        i56 = 1;
                                                        i58 = 2;
                                                        i49 = i4;
                                                        i57 = i40;
                                                        break;
                                                    }
                                                }
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                            case 52:
                                                bArr2 = bArr;
                                                i40 = i24;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i23;
                                                unsafe = unsafe4;
                                                if (i64 == 5) {
                                                    i43 = i42 + 4;
                                                    unsafe13.putObject(obj2, j3, Float.valueOf(Float.intBitsToFloat(AbstractC0181d1.n(i42, bArr2))));
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i50 = i43;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                bArr2 = bArr;
                                                i40 = i24;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i23;
                                                unsafe = unsafe4;
                                                if (i64 == 0) {
                                                    J2 = AbstractC0181d1.J(bArr2, i42, v05);
                                                    unsafe13.putObject(obj2, j3, Long.valueOf(v05.f2689b));
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i50 = J2;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                bArr2 = bArr;
                                                i40 = i24;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i23;
                                                unsafe = unsafe4;
                                                if (i64 == 0) {
                                                    J2 = AbstractC0181d1.G(bArr2, i42, v05);
                                                    unsafe13.putObject(obj2, j3, Integer.valueOf(v05.f2688a));
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i50 = J2;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                bArr2 = bArr;
                                                i40 = i24;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i23;
                                                unsafe = unsafe4;
                                                if (i64 == 1) {
                                                    i43 = i42 + 8;
                                                    unsafe13.putObject(obj2, j3, Long.valueOf(AbstractC0181d1.M(i42, bArr2)));
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i50 = i43;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 57:
                                            case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                                                bArr2 = bArr;
                                                i40 = i24;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i23;
                                                unsafe = unsafe4;
                                                if (i64 == 5) {
                                                    i43 = i42 + 4;
                                                    unsafe13.putObject(obj2, j3, Integer.valueOf(AbstractC0181d1.n(i42, bArr2)));
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i50 = i43;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 58:
                                                bArr2 = bArr;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i23;
                                                unsafe = unsafe4;
                                                if (i64 == 0) {
                                                    J2 = AbstractC0181d1.J(bArr2, i42, v05);
                                                    i40 = i24;
                                                    unsafe13.putObject(obj2, j3, Boolean.valueOf(v05.f2689b != 0));
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i50 = J2;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i40 = i24;
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 59:
                                                bArr2 = bArr;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i23;
                                                unsafe = unsafe4;
                                                if (i64 == 2) {
                                                    G5 = AbstractC0181d1.G(bArr2, i42, v05);
                                                    int i90 = v05.f2688a;
                                                    if (i90 == 0) {
                                                        unsafe13.putObject(obj2, j3, "");
                                                    } else {
                                                        int i91 = G5 + i90;
                                                        if ((i65 & 536870912) != 0 && !O1.d(bArr2, G5, i91)) {
                                                            throw new C0211n1("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe13.putObject(obj2, j3, new String(bArr2, G5, i90, AbstractC0205l1.f2772a));
                                                        G5 = i91;
                                                    }
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i40 = i24;
                                                    i50 = G5;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i40 = i24;
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 60:
                                                bArr2 = bArr;
                                                i44 = i23;
                                                unsafe = unsafe4;
                                                h13 = h12;
                                                if (i64 == 2) {
                                                    Object D3 = D(i12, w3, obj2);
                                                    int L2 = AbstractC0181d1.L(D3, B(w3), bArr2, i44, i4, v05);
                                                    bArr2 = bArr2;
                                                    n(i12, w3, obj2, D3);
                                                    i41 = w3;
                                                    h15 = h13;
                                                    i42 = i44;
                                                    i40 = i24;
                                                    i50 = L2;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i41 = w3;
                                                h15 = h13;
                                                i42 = i44;
                                                i40 = i24;
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 61:
                                                bArr2 = bArr;
                                                i44 = i23;
                                                unsafe = unsafe4;
                                                h13 = h12;
                                                if (i64 == 2) {
                                                    G5 = AbstractC0181d1.c(bArr2, i44, v05);
                                                    unsafe13.putObject(obj2, j3, v05.f2690c);
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i41 = w3;
                                                    h15 = h13;
                                                    i42 = i44;
                                                    i40 = i24;
                                                    i50 = G5;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i41 = w3;
                                                h15 = h13;
                                                i42 = i44;
                                                i40 = i24;
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 63:
                                                bArr2 = bArr;
                                                i45 = i23;
                                                i46 = i24;
                                                if (i64 == 0) {
                                                    int G9 = AbstractC0181d1.G(bArr2, i45, v05);
                                                    int i92 = v05.f2688a;
                                                    InterfaceC0196i1 A4 = A(w3);
                                                    if (A4 == null || A4.a(i92)) {
                                                        h14 = h12;
                                                        i47 = i46;
                                                        i48 = G9;
                                                        unsafe13.putObject(obj2, j3, Integer.valueOf(i92));
                                                        unsafe13.putInt(obj2, j5, i12);
                                                    } else {
                                                        AbstractC0190g1 abstractC0190g12 = (AbstractC0190g1) obj2;
                                                        H1 h17 = abstractC0190g12.zzc;
                                                        h14 = h12;
                                                        if (h17 == h14) {
                                                            h17 = H1.b();
                                                            abstractC0190g12.zzc = h17;
                                                        }
                                                        h17.c(i46, Long.valueOf(i92));
                                                        i47 = i46;
                                                        i48 = G9;
                                                    }
                                                    i41 = w3;
                                                    h15 = h14;
                                                    i42 = i45;
                                                    i40 = i47;
                                                    i50 = i48;
                                                    unsafe = unsafe4;
                                                    if (i50 != i42) {
                                                    }
                                                } else {
                                                    i40 = i46;
                                                    unsafe = unsafe4;
                                                    h15 = h12;
                                                    i41 = w3;
                                                    i42 = i45;
                                                    i50 = i42;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                break;
                                            case 66:
                                                bArr2 = bArr;
                                                i45 = i23;
                                                i46 = i24;
                                                if (i64 == 0) {
                                                    G6 = AbstractC0181d1.G(bArr2, i45, v05);
                                                    int i93 = v05.f2688a;
                                                    unsafe13.putObject(obj2, j3, Integer.valueOf((i93 >>> 1) ^ (-(i93 & 1))));
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i40 = i46;
                                                    unsafe = unsafe4;
                                                    i50 = G6;
                                                    h15 = h12;
                                                    i41 = w3;
                                                    i42 = i45;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                i40 = i46;
                                                unsafe = unsafe4;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i45;
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                            case 67:
                                                bArr2 = bArr;
                                                i45 = i23;
                                                if (i64 == 0) {
                                                    G6 = AbstractC0181d1.J(bArr2, i45, v05);
                                                    i46 = i24;
                                                    long j6 = v05.f2689b;
                                                    unsafe13.putObject(obj2, j3, Long.valueOf((j6 >>> 1) ^ (-(j6 & 1))));
                                                    unsafe13.putInt(obj2, j5, i12);
                                                    i40 = i46;
                                                    unsafe = unsafe4;
                                                    i50 = G6;
                                                    h15 = h12;
                                                    i41 = w3;
                                                    i42 = i45;
                                                    if (i50 != i42) {
                                                    }
                                                } else {
                                                    unsafe = unsafe4;
                                                    i40 = i24;
                                                    h15 = h12;
                                                    i41 = w3;
                                                    i42 = i45;
                                                    i50 = i42;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (i64 == 3) {
                                                    Object D4 = D(i12, w3, obj2);
                                                    int K2 = AbstractC0181d1.K(D4, B(w3), bArr, i23, i4, (i24 & (-8)) | 4, v0);
                                                    bArr2 = bArr;
                                                    v05 = v0;
                                                    i45 = i23;
                                                    n(i12, w3, obj2, D4);
                                                    unsafe = unsafe4;
                                                    i40 = i24;
                                                    h15 = h12;
                                                    i50 = K2;
                                                    i41 = w3;
                                                    i42 = i45;
                                                    if (i50 != i42) {
                                                    }
                                                }
                                                break;
                                            default:
                                                bArr2 = bArr;
                                                i40 = i24;
                                                h15 = h12;
                                                i41 = w3;
                                                i42 = i23;
                                                unsafe = unsafe4;
                                                i50 = i42;
                                                if (i50 != i42) {
                                                }
                                                break;
                                        }
                                    } else if (i64 == 2) {
                                        Unsafe unsafe14 = f2840k;
                                        int i94 = w3 / 3;
                                        Object obj8 = objArr[i94 + i94];
                                        Object object = unsafe14.getObject(obj2, j3);
                                        if (!((C0225s1) object).f2816a) {
                                            C0225s1 c0225s12 = C0225s1.f2815b;
                                            if (c0225s12.isEmpty()) {
                                                c0225s1 = new C0225s1();
                                            } else {
                                                C0225s1 c0225s13 = new C0225s1(c0225s12);
                                                c0225s13.f2816a = true;
                                                c0225s1 = c0225s13;
                                            }
                                            C0184e1.c(c0225s1, object);
                                            unsafe14.putObject(obj2, j3, c0225s1);
                                        }
                                        obj8.getClass();
                                        throw new ClassCastException();
                                    }
                                } else {
                                    long j7 = i65;
                                    Unsafe unsafe15 = f2840k;
                                    InterfaceC0202k1 interfaceC0202k12 = (InterfaceC0202k1) unsafe15.getObject(obj2, j3);
                                    if (!((T0) interfaceC0202k12).f2681a) {
                                        int size = interfaceC0202k12.size();
                                        interfaceC0202k12 = interfaceC0202k12.a(size + size);
                                        unsafe15.putObject(obj2, j3, interfaceC0202k12);
                                    }
                                    InterfaceC0202k1 interfaceC0202k13 = interfaceC0202k12;
                                    Object obj9 = null;
                                    switch (x3) {
                                        case 18:
                                        case C0644l9.f7766J /* 35 */:
                                            bArr7 = bArr;
                                            unsafe5 = unsafe12;
                                            i25 = i66;
                                            i10 = i53;
                                            i26 = i55;
                                            i27 = i57;
                                            i12 = i13;
                                            v05 = v0;
                                            h12 = h15;
                                            if (i64 != 2) {
                                                if (i64 == 1) {
                                                    if (interfaceC0202k13 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    Double.longBitsToDouble(AbstractC0181d1.M(i25, bArr7));
                                                    throw null;
                                                }
                                                i28 = i25;
                                                if (i28 != i25) {
                                                    i6 = i5;
                                                    unsafe = unsafe5;
                                                    i9 = i28;
                                                    bArr2 = bArr7;
                                                    i7 = i27;
                                                    i54 = w3;
                                                    i55 = i26;
                                                    h15 = h12;
                                                    i52 = i89;
                                                    i11 = 1048575;
                                                    break;
                                                } else {
                                                    i49 = i4;
                                                    bArr12 = bArr7;
                                                    i57 = i27;
                                                    i54 = w3;
                                                    i55 = i26;
                                                    obj5 = obj2;
                                                    i51 = i12;
                                                    i52 = i89;
                                                    i53 = i10;
                                                    i56 = 1;
                                                    i58 = 2;
                                                    i50 = i28;
                                                    unsafe9 = unsafe5;
                                                    c0237w1 = this;
                                                    break;
                                                }
                                            } else {
                                                if (interfaceC0202k13 != null) {
                                                    throw new ClassCastException();
                                                }
                                                if (AbstractC0181d1.G(bArr7, i25, v05) + v05.f2688a > bArr7.length) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                        case C0644l9.f7759C /* 19 */:
                                        case 36:
                                            bArr7 = bArr;
                                            unsafe5 = unsafe12;
                                            i25 = i66;
                                            i10 = i53;
                                            i26 = i55;
                                            i27 = i57;
                                            i12 = i13;
                                            v05 = v0;
                                            h12 = h15;
                                            if (i64 == 2) {
                                                if (interfaceC0202k13 != null) {
                                                    throw new ClassCastException();
                                                }
                                                if (AbstractC0181d1.G(bArr7, i25, v05) + v05.f2688a > bArr7.length) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                            if (i64 == 5) {
                                                if (interfaceC0202k13 != null) {
                                                    throw new ClassCastException();
                                                }
                                                Float.intBitsToFloat(AbstractC0181d1.n(i25, bArr7));
                                                throw null;
                                            }
                                            i28 = i25;
                                            if (i28 != i25) {
                                            }
                                            break;
                                        case C0644l9.f7760D /* 20 */:
                                        case C0644l9.f7761E /* 21 */:
                                        case 37:
                                        case C0644l9.f7767K /* 38 */:
                                            bArr7 = bArr;
                                            unsafe5 = unsafe12;
                                            i25 = i66;
                                            i10 = i53;
                                            i26 = i55;
                                            i27 = i57;
                                            i12 = i13;
                                            v05 = v0;
                                            h12 = h15;
                                            if (i64 != 2) {
                                                if (i64 == 0) {
                                                    if (interfaceC0202k13 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    AbstractC0181d1.J(bArr7, i25, v05);
                                                    throw null;
                                                }
                                                i28 = i25;
                                                if (i28 != i25) {
                                                }
                                            } else {
                                                if (interfaceC0202k13 != null) {
                                                    throw new ClassCastException();
                                                }
                                                int G10 = AbstractC0181d1.G(bArr7, i25, v05);
                                                int i95 = v05.f2688a + G10;
                                                if (G10 < i95) {
                                                    AbstractC0181d1.J(bArr7, G10, v05);
                                                    throw null;
                                                }
                                                if (G10 != i95) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i28 = G10;
                                                if (i28 != i25) {
                                                }
                                            }
                                            break;
                                        case 22:
                                        case C0644l9.f7765I /* 29 */:
                                        case 39:
                                        case 43:
                                            bArr8 = bArr;
                                            unsafe5 = unsafe12;
                                            i10 = i53;
                                            i26 = i55;
                                            i29 = i57;
                                            i12 = i13;
                                            i30 = i66;
                                            h12 = h15;
                                            v05 = v0;
                                            if (i64 == 2) {
                                                i28 = AbstractC0181d1.B(bArr8, i30, interfaceC0202k13, v05);
                                                i27 = i29;
                                                bArr7 = bArr8;
                                                i25 = i30;
                                                if (i28 != i25) {
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    bArr7 = bArr8;
                                                    i25 = i30;
                                                    i27 = i29;
                                                    i28 = AbstractC0181d1.I(i29, bArr7, i25, i4, interfaceC0202k13, v05);
                                                    if (i28 != i25) {
                                                    }
                                                }
                                                i27 = i29;
                                                bArr7 = bArr8;
                                                i25 = i30;
                                                i28 = i25;
                                                if (i28 != i25) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case C0644l9.L /* 40 */:
                                        case 46:
                                            bArr8 = bArr;
                                            unsafe5 = unsafe12;
                                            i10 = i53;
                                            i26 = i55;
                                            i29 = i57;
                                            i12 = i13;
                                            i30 = i66;
                                            h12 = h15;
                                            v05 = v0;
                                            if (i64 == 2) {
                                                if (interfaceC0202k13 != null) {
                                                    throw new ClassCastException();
                                                }
                                                if (AbstractC0181d1.G(bArr8, i30, v05) + v05.f2688a > bArr8.length) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                throw null;
                                            }
                                            if (i64 == 1) {
                                                if (interfaceC0202k13 != null) {
                                                    throw new ClassCastException();
                                                }
                                                AbstractC0181d1.M(i30, bArr8);
                                                throw null;
                                            }
                                            i27 = i29;
                                            bArr7 = bArr8;
                                            i25 = i30;
                                            i28 = i25;
                                            if (i28 != i25) {
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            bArr8 = bArr;
                                            unsafe5 = unsafe12;
                                            i10 = i53;
                                            i29 = i57;
                                            i12 = i13;
                                            i30 = i66;
                                            h12 = h15;
                                            v05 = v0;
                                            if (i64 == 2) {
                                                C0193h1 c0193h1 = (C0193h1) interfaceC0202k13;
                                                int G11 = AbstractC0181d1.G(bArr8, i30, v05);
                                                int i96 = v05.f2688a;
                                                int i97 = G11 + i96;
                                                if (i97 > bArr8.length) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                int i98 = (i96 / 4) + c0193h1.f2763c;
                                                int length2 = c0193h1.f2762b.length;
                                                if (i98 <= length2) {
                                                    i26 = i55;
                                                } else if (length2 != 0) {
                                                    while (length2 < i98) {
                                                        int i99 = i55;
                                                        length2 = Math.max(((length2 * 3) / 2) + 1, i99);
                                                        i55 = i99;
                                                    }
                                                    i26 = i55;
                                                    c0193h1.f2762b = Arrays.copyOf(c0193h1.f2762b, length2);
                                                } else {
                                                    i26 = i55;
                                                    c0193h1.f2762b = new int[Math.max(i98, i26)];
                                                }
                                                while (G11 < i97) {
                                                    c0193h1.d(AbstractC0181d1.n(G11, bArr8));
                                                    G11 += 4;
                                                }
                                                if (G11 != i97) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i27 = i29;
                                                bArr7 = bArr8;
                                                i28 = G11;
                                                i25 = i30;
                                                if (i28 != i25) {
                                                }
                                            } else {
                                                i26 = i55;
                                                if (i64 == 5) {
                                                    i28 = i30 + 4;
                                                    C0193h1 c0193h12 = (C0193h1) interfaceC0202k13;
                                                    c0193h12.d(AbstractC0181d1.n(i30, bArr8));
                                                    while (i28 < i4) {
                                                        int G12 = AbstractC0181d1.G(bArr8, i28, v05);
                                                        if (i29 == v05.f2688a) {
                                                            c0193h12.d(AbstractC0181d1.n(G12, bArr8));
                                                            i28 = G12 + 4;
                                                        } else {
                                                            i27 = i29;
                                                            bArr7 = bArr8;
                                                            i25 = i30;
                                                            if (i28 != i25) {
                                                            }
                                                        }
                                                    }
                                                    i27 = i29;
                                                    bArr7 = bArr8;
                                                    i25 = i30;
                                                    if (i28 != i25) {
                                                    }
                                                }
                                                i27 = i29;
                                                bArr7 = bArr8;
                                                i25 = i30;
                                                i28 = i25;
                                                if (i28 != i25) {
                                                }
                                            }
                                            break;
                                        case C0644l9.f7762F /* 25 */:
                                        case C0644l9.f7768M /* 42 */:
                                            bArr9 = bArr;
                                            unsafe5 = unsafe12;
                                            i10 = i53;
                                            i31 = i57;
                                            i12 = i13;
                                            i32 = i66;
                                            h12 = h15;
                                            v05 = v0;
                                            if (i64 != 2) {
                                                if (i64 == 0) {
                                                    if (interfaceC0202k13 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    AbstractC0181d1.J(bArr9, i32, v05);
                                                    throw null;
                                                }
                                                i27 = i31;
                                                bArr7 = bArr9;
                                                i25 = i32;
                                                i26 = i55;
                                                i28 = i25;
                                                if (i28 != i25) {
                                                }
                                            } else {
                                                if (interfaceC0202k13 != null) {
                                                    throw new ClassCastException();
                                                }
                                                G3 = AbstractC0181d1.G(bArr9, i32, v05);
                                                int i100 = v05.f2688a + G3;
                                                if (G3 < i100) {
                                                    AbstractC0181d1.J(bArr9, G3, v05);
                                                    throw null;
                                                }
                                                if (G3 != i100) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i27 = i31;
                                                bArr7 = bArr9;
                                                i28 = G3;
                                                i25 = i32;
                                                i26 = i55;
                                                if (i28 != i25) {
                                                }
                                            }
                                            break;
                                        case C0644l9.f7763G /* 26 */:
                                            bArr9 = bArr;
                                            i10 = i53;
                                            i31 = i57;
                                            i12 = i13;
                                            i32 = i66;
                                            h12 = h15;
                                            v05 = v0;
                                            if (i64 != 2) {
                                                unsafe5 = unsafe12;
                                                i27 = i31;
                                                bArr7 = bArr9;
                                                i25 = i32;
                                                i26 = i55;
                                                i28 = i25;
                                                if (i28 != i25) {
                                                }
                                            } else if ((j7 & 536870912) == 0) {
                                                G3 = AbstractC0181d1.G(bArr9, i32, v05);
                                                int i101 = v05.f2688a;
                                                if (i101 < 0) {
                                                    throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i101 == 0) {
                                                    interfaceC0202k13.add("");
                                                    unsafe6 = unsafe12;
                                                } else {
                                                    unsafe6 = unsafe12;
                                                    interfaceC0202k13.add(new String(bArr9, G3, i101, AbstractC0205l1.f2772a));
                                                    G3 += i101;
                                                }
                                                while (G3 < i4) {
                                                    int G13 = AbstractC0181d1.G(bArr9, G3, v05);
                                                    if (i31 == v05.f2688a) {
                                                        G3 = AbstractC0181d1.G(bArr9, G13, v05);
                                                        int i102 = v05.f2688a;
                                                        if (i102 < 0) {
                                                            throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i102 == 0) {
                                                            interfaceC0202k13.add("");
                                                        } else {
                                                            interfaceC0202k13.add(new String(bArr9, G3, i102, AbstractC0205l1.f2772a));
                                                            G3 += i102;
                                                        }
                                                    } else {
                                                        unsafe5 = unsafe6;
                                                        i27 = i31;
                                                        bArr7 = bArr9;
                                                        i28 = G3;
                                                        i25 = i32;
                                                        i26 = i55;
                                                        if (i28 != i25) {
                                                        }
                                                    }
                                                }
                                                unsafe5 = unsafe6;
                                                i27 = i31;
                                                bArr7 = bArr9;
                                                i28 = G3;
                                                i25 = i32;
                                                i26 = i55;
                                                if (i28 != i25) {
                                                }
                                            } else {
                                                i28 = AbstractC0181d1.G(bArr9, i32, v05);
                                                int i103 = v05.f2688a;
                                                if (i103 < 0) {
                                                    throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i103 == 0) {
                                                    interfaceC0202k13.add("");
                                                } else {
                                                    int i104 = i28 + i103;
                                                    if (!O1.d(bArr9, i28, i104)) {
                                                        throw new C0211n1("Protocol message had invalid UTF-8.");
                                                    }
                                                    interfaceC0202k13.add(new String(bArr9, i28, i103, AbstractC0205l1.f2772a));
                                                    i28 = i104;
                                                }
                                                while (i28 < i4) {
                                                    int G14 = AbstractC0181d1.G(bArr9, i28, v05);
                                                    if (i31 == v05.f2688a) {
                                                        i28 = AbstractC0181d1.G(bArr9, G14, v05);
                                                        int i105 = v05.f2688a;
                                                        if (i105 < 0) {
                                                            throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i105 == 0) {
                                                            interfaceC0202k13.add("");
                                                        } else {
                                                            int i106 = i28 + i105;
                                                            if (!O1.d(bArr9, i28, i106)) {
                                                                throw new C0211n1("Protocol message had invalid UTF-8.");
                                                            }
                                                            interfaceC0202k13.add(new String(bArr9, i28, i105, AbstractC0205l1.f2772a));
                                                            i28 = i106;
                                                        }
                                                    } else {
                                                        unsafe5 = unsafe12;
                                                        i27 = i31;
                                                        bArr7 = bArr9;
                                                        i25 = i32;
                                                        i26 = i55;
                                                        if (i28 != i25) {
                                                        }
                                                    }
                                                }
                                                unsafe5 = unsafe12;
                                                i27 = i31;
                                                bArr7 = bArr9;
                                                i25 = i32;
                                                i26 = i55;
                                                if (i28 != i25) {
                                                }
                                            }
                                            break;
                                        case C0644l9.f7764H /* 27 */:
                                            bArr10 = bArr;
                                            unsafe7 = unsafe12;
                                            i10 = i53;
                                            i33 = i57;
                                            i12 = i13;
                                            i34 = i66;
                                            h12 = h15;
                                            v05 = v0;
                                            if (i64 == 2) {
                                                i28 = AbstractC0181d1.w(c0237w1.B(w3), i33, bArr10, i34, i4, interfaceC0202k13, v05);
                                                i27 = i33;
                                                bArr7 = bArr10;
                                                i25 = i34;
                                                v05 = v05;
                                                unsafe5 = unsafe7;
                                                i26 = i55;
                                                if (i28 != i25) {
                                                }
                                            }
                                            i27 = i33;
                                            bArr7 = bArr10;
                                            i25 = i34;
                                            unsafe5 = unsafe7;
                                            i26 = i55;
                                            i28 = i25;
                                            if (i28 != i25) {
                                            }
                                            break;
                                        case 28:
                                            bArr10 = bArr;
                                            unsafe7 = unsafe12;
                                            i10 = i53;
                                            i33 = i57;
                                            i12 = i13;
                                            i34 = i66;
                                            h12 = h15;
                                            v05 = v0;
                                            if (i64 == 2) {
                                                int G15 = AbstractC0181d1.G(bArr10, i34, v05);
                                                int i107 = v05.f2688a;
                                                if (i107 < 0) {
                                                    throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i107 > bArr10.length - G15) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i107 == 0) {
                                                    interfaceC0202k13.add(Y0.f2714c);
                                                } else {
                                                    interfaceC0202k13.add(Y0.f(bArr10, G15, i107));
                                                    G15 += i107;
                                                }
                                                while (G15 < i4) {
                                                    int G16 = AbstractC0181d1.G(bArr10, G15, v05);
                                                    if (i33 == v05.f2688a) {
                                                        G15 = AbstractC0181d1.G(bArr10, G16, v05);
                                                        int i108 = v05.f2688a;
                                                        if (i108 < 0) {
                                                            throw new C0211n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i108 > bArr10.length - G15) {
                                                            throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i108 == 0) {
                                                            interfaceC0202k13.add(Y0.f2714c);
                                                        } else {
                                                            interfaceC0202k13.add(Y0.f(bArr10, G15, i108));
                                                            G15 += i108;
                                                        }
                                                    } else {
                                                        i27 = i33;
                                                        bArr7 = bArr10;
                                                        i28 = G15;
                                                        i25 = i34;
                                                        unsafe5 = unsafe7;
                                                        i26 = i55;
                                                        if (i28 != i25) {
                                                        }
                                                    }
                                                }
                                                i27 = i33;
                                                bArr7 = bArr10;
                                                i28 = G15;
                                                i25 = i34;
                                                unsafe5 = unsafe7;
                                                i26 = i55;
                                                if (i28 != i25) {
                                                }
                                            }
                                            i27 = i33;
                                            bArr7 = bArr10;
                                            i25 = i34;
                                            unsafe5 = unsafe7;
                                            i26 = i55;
                                            i28 = i25;
                                            if (i28 != i25) {
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            byte[] bArr13 = bArr;
                                            i27 = i57;
                                            v05 = v0;
                                            if (i64 == 2) {
                                                I3 = AbstractC0181d1.B(bArr13, i66, interfaceC0202k13, v05);
                                                interfaceC0202k1 = interfaceC0202k13;
                                                i34 = i66;
                                                i35 = i27;
                                            } else if (i64 == 0) {
                                                I3 = AbstractC0181d1.I(i27, bArr13, i66, i4, interfaceC0202k13, v05);
                                                i34 = i66;
                                                bArr13 = bArr13;
                                                i35 = i27;
                                                interfaceC0202k1 = interfaceC0202k13;
                                            } else {
                                                h12 = h15;
                                                i10 = i53;
                                                i12 = i13;
                                                bArr7 = bArr13;
                                                i25 = i66;
                                                unsafe5 = unsafe12;
                                                i26 = i55;
                                                i28 = i25;
                                                if (i28 != i25) {
                                                }
                                            }
                                            InterfaceC0196i1 A5 = c0237w1.A(w3);
                                            C0184e1 c0184e1 = E1.f2619a;
                                            if (A5 == null) {
                                                i36 = I3;
                                                h12 = h15;
                                                unsafe7 = unsafe12;
                                                i10 = i53;
                                                i12 = i13;
                                            } else if (interfaceC0202k1 != null) {
                                                int size2 = interfaceC0202k1.size();
                                                i36 = I3;
                                                unsafe7 = unsafe12;
                                                int i109 = 0;
                                                Object obj10 = null;
                                                int i110 = 0;
                                                while (i110 < size2) {
                                                    int i111 = i53;
                                                    Integer num = (Integer) interfaceC0202k1.get(i110);
                                                    H1 h18 = h15;
                                                    int intValue = num.intValue();
                                                    if (A5.a(intValue)) {
                                                        if (i110 != i109) {
                                                            interfaceC0202k1.set(i109, num);
                                                        }
                                                        i109++;
                                                        i37 = i13;
                                                    } else {
                                                        i37 = i13;
                                                        obj10 = E1.o(i37, intValue, obj2, obj10);
                                                    }
                                                    i110++;
                                                    i13 = i37;
                                                    h15 = h18;
                                                    i53 = i111;
                                                }
                                                h12 = h15;
                                                i10 = i53;
                                                i12 = i13;
                                                if (i109 != size2) {
                                                    interfaceC0202k1.subList(i109, size2).clear();
                                                }
                                            } else {
                                                i36 = I3;
                                                h12 = h15;
                                                unsafe7 = unsafe12;
                                                i10 = i53;
                                                i12 = i13;
                                                Iterator it = interfaceC0202k1.iterator();
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!A5.a(intValue2)) {
                                                        obj9 = E1.o(i12, intValue2, obj2, obj9);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i28 = i36;
                                            i27 = i35;
                                            bArr7 = bArr13;
                                            i25 = i34;
                                            unsafe5 = unsafe7;
                                            i26 = i55;
                                            if (i28 != i25) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr11 = bArr;
                                            unsafe8 = unsafe12;
                                            i38 = i66;
                                            i27 = i57;
                                            v05 = v0;
                                            if (i64 == 2) {
                                                C0193h1 c0193h13 = (C0193h1) interfaceC0202k13;
                                                G4 = AbstractC0181d1.G(bArr11, i38, v05);
                                                int i112 = v05.f2688a + G4;
                                                while (G4 < i112) {
                                                    int G17 = AbstractC0181d1.G(bArr11, G4, v05);
                                                    int i113 = v05.f2688a;
                                                    c0193h13.d((-(i113 & 1)) ^ (i113 >>> 1));
                                                    G4 = G17;
                                                }
                                                if (G4 != i112) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i28 = G4;
                                                bArr7 = bArr11;
                                                i25 = i38;
                                                h12 = h15;
                                                unsafe5 = unsafe8;
                                                i10 = i53;
                                                i26 = i55;
                                                i12 = i13;
                                                if (i28 != i25) {
                                                }
                                            } else {
                                                if (i64 == 0) {
                                                    C0193h1 c0193h14 = (C0193h1) interfaceC0202k13;
                                                    i28 = AbstractC0181d1.G(bArr11, i38, v05);
                                                    int i114 = v05.f2688a;
                                                    c0193h14.d((i114 >>> 1) ^ (-(i114 & 1)));
                                                    while (i28 < i4) {
                                                        int G18 = AbstractC0181d1.G(bArr11, i28, v05);
                                                        if (i27 == v05.f2688a) {
                                                            i28 = AbstractC0181d1.G(bArr11, G18, v05);
                                                            int i115 = v05.f2688a;
                                                            c0193h14.d((i115 >>> 1) ^ (-(i115 & 1)));
                                                        } else {
                                                            bArr7 = bArr11;
                                                            i25 = i38;
                                                            h12 = h15;
                                                            unsafe5 = unsafe8;
                                                            i10 = i53;
                                                            i26 = i55;
                                                            i12 = i13;
                                                            if (i28 != i25) {
                                                            }
                                                        }
                                                    }
                                                    bArr7 = bArr11;
                                                    i25 = i38;
                                                    h12 = h15;
                                                    unsafe5 = unsafe8;
                                                    i10 = i53;
                                                    i26 = i55;
                                                    i12 = i13;
                                                    if (i28 != i25) {
                                                    }
                                                }
                                                bArr7 = bArr11;
                                                i25 = i38;
                                                h12 = h15;
                                                unsafe5 = unsafe8;
                                                i10 = i53;
                                                i26 = i55;
                                                i12 = i13;
                                                i28 = i25;
                                                if (i28 != i25) {
                                                }
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr11 = bArr;
                                            unsafe8 = unsafe12;
                                            i38 = i66;
                                            i27 = i57;
                                            v05 = v0;
                                            if (i64 != 2) {
                                                if (i64 == 0) {
                                                    if (interfaceC0202k13 != null) {
                                                        throw new ClassCastException();
                                                    }
                                                    AbstractC0181d1.J(bArr11, i38, v05);
                                                    throw null;
                                                }
                                                bArr7 = bArr11;
                                                i25 = i38;
                                                h12 = h15;
                                                unsafe5 = unsafe8;
                                                i10 = i53;
                                                i26 = i55;
                                                i12 = i13;
                                                i28 = i25;
                                                if (i28 != i25) {
                                                }
                                            } else {
                                                if (interfaceC0202k13 != null) {
                                                    throw new ClassCastException();
                                                }
                                                G4 = AbstractC0181d1.G(bArr11, i38, v05);
                                                int i116 = v05.f2688a + G4;
                                                if (G4 < i116) {
                                                    AbstractC0181d1.J(bArr11, G4, v05);
                                                    throw null;
                                                }
                                                if (G4 != i116) {
                                                    throw new C0211n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i28 = G4;
                                                bArr7 = bArr11;
                                                i25 = i38;
                                                h12 = h15;
                                                unsafe5 = unsafe8;
                                                i10 = i53;
                                                i26 = i55;
                                                i12 = i13;
                                                if (i28 != i25) {
                                                }
                                            }
                                            break;
                                        default:
                                            if (i64 == 3) {
                                                int i117 = (i57 & (-8)) | 4;
                                                D1 B3 = c0237w1.B(w3);
                                                int i118 = i66;
                                                AbstractC0190g1 g3 = B3.g();
                                                unsafe8 = unsafe12;
                                                i27 = i57;
                                                int K3 = AbstractC0181d1.K(g3, B3, bArr, i118, i4, i117, v0);
                                                int i119 = i117;
                                                v05 = v0;
                                                B3.a(g3);
                                                v05.f2690c = g3;
                                                interfaceC0202k13.add(g3);
                                                while (true) {
                                                    i39 = i118;
                                                    if (K3 < i4) {
                                                        int G19 = AbstractC0181d1.G(bArr, K3, v05);
                                                        int i120 = i119;
                                                        if (i27 == v05.f2688a) {
                                                            AbstractC0190g1 g4 = B3.g();
                                                            V0 v06 = v05;
                                                            int K4 = AbstractC0181d1.K(g4, B3, bArr, G19, i4, i120, v06);
                                                            i119 = i120;
                                                            v05 = v06;
                                                            B3.a(g4);
                                                            v05.f2690c = g4;
                                                            interfaceC0202k13.add(g4);
                                                            K3 = K4;
                                                            i118 = i39;
                                                        }
                                                    }
                                                }
                                                bArr7 = bArr;
                                                i25 = i39;
                                                h12 = h15;
                                                i28 = K3;
                                                unsafe5 = unsafe8;
                                                i10 = i53;
                                                i26 = i55;
                                                i12 = i13;
                                                if (i28 != i25) {
                                                }
                                            } else {
                                                bArr7 = bArr;
                                                unsafe5 = unsafe12;
                                                i25 = i66;
                                                i10 = i53;
                                                i26 = i55;
                                                i27 = i57;
                                                i12 = i13;
                                                v05 = v0;
                                                h12 = h15;
                                                i28 = i25;
                                                if (i28 != i25) {
                                                }
                                            }
                                            break;
                                    }
                                }
                            } else if (i64 == 2) {
                                InterfaceC0202k1 interfaceC0202k14 = (InterfaceC0202k1) unsafe12.getObject(obj7, j3);
                                if (!((T0) interfaceC0202k14).f2681a) {
                                    int size3 = interfaceC0202k14.size();
                                    interfaceC0202k14 = interfaceC0202k14.a(size3 == 0 ? i55 : size3 + size3);
                                    unsafe12.putObject(obj7, j3, interfaceC0202k14);
                                }
                                InterfaceC0202k1 interfaceC0202k15 = interfaceC0202k14;
                                bArr12 = bArr;
                                i49 = i4;
                                i50 = AbstractC0181d1.w(c0237w1.B(w3), i57, bArr12, i66, i49, interfaceC0202k15, v0);
                                v05 = v0;
                                i57 = i57;
                                unsafe9 = unsafe12;
                                i54 = w3;
                                obj5 = obj;
                                i52 = i89;
                            } else {
                                obj2 = obj7;
                                i23 = i66;
                                v05 = v0;
                                unsafe4 = unsafe12;
                                i10 = i53;
                                i24 = i57;
                                i12 = i13;
                                bArr6 = bArr;
                                h12 = h15;
                            }
                            i6 = i5;
                            unsafe = unsafe4;
                            i9 = i23;
                            bArr2 = bArr6;
                            i7 = i24;
                            i54 = w3;
                            h15 = h12;
                            i52 = i89;
                            i11 = 1048575;
                        }
                    }
                    if (i7 != i6 || i6 == 0) {
                        AbstractC0190g1 abstractC0190g13 = (AbstractC0190g1) obj2;
                        H1 h19 = abstractC0190g13.zzc;
                        if (h19 == h15) {
                            h19 = H1.b();
                            abstractC0190g13.zzc = h19;
                        }
                        i50 = AbstractC0181d1.E(i7, bArr2, i9, i4, h19, v05);
                        i49 = i4;
                        c0237w1 = this;
                        bArr12 = bArr;
                        v05 = v0;
                        i57 = i7;
                        obj5 = obj2;
                        i51 = i12;
                        i53 = i10;
                        i56 = 1;
                        i58 = 2;
                        unsafe9 = unsafe;
                    } else {
                        i49 = i4;
                        i50 = i9;
                        i8 = i11;
                        i53 = i10;
                    }
                } else {
                    i6 = i5;
                    unsafe = unsafe9;
                    objArr = objArr2;
                    iArr = iArr2;
                    obj2 = obj5;
                    i7 = i57;
                    i8 = 1048575;
                }
            }
            i51 = i13;
            i56 = 1;
        }
    }

    public final int w(int i3, int i4) {
        int[] iArr = this.f2841a;
        int length = (iArr.length / 3) - 1;
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
        return -1;
    }

    public final int y(int i3) {
        return this.f2841a[i3 + 1];
    }
}
