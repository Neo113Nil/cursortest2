package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f11764a;

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f11765b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f11766c;

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f11767d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f11764a = cls;
        f11765b = A(false);
        f11766c = A(true);
        f11767d = new g0();
    }

    public static g0 A(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (g0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(g0 g0Var, Object obj, Object obj2) {
        g0Var.getClass();
        AbstractC0886w abstractC0886w = (AbstractC0886w) obj;
        f0 f0Var = abstractC0886w.unknownFields;
        f0 f0Var2 = ((AbstractC0886w) obj2).unknownFields;
        f0 f0Var3 = f0.f11769f;
        if (!f0Var3.equals(f0Var2)) {
            if (f0Var3.equals(f0Var)) {
                int i7 = f0Var.f11770a + f0Var2.f11770a;
                int[] copyOf = Arrays.copyOf(f0Var.f11771b, i7);
                System.arraycopy(f0Var2.f11771b, 0, copyOf, f0Var.f11770a, f0Var2.f11770a);
                Object[] copyOf2 = Arrays.copyOf(f0Var.f11772c, i7);
                System.arraycopy(f0Var2.f11772c, 0, copyOf2, f0Var.f11770a, f0Var2.f11770a);
                f0Var = new f0(i7, copyOf, copyOf2, true);
            } else {
                f0Var.getClass();
                if (!f0Var2.equals(f0Var3)) {
                    if (!f0Var.f11774e) {
                        throw new UnsupportedOperationException();
                    }
                    int i8 = f0Var.f11770a + f0Var2.f11770a;
                    f0Var.a(i8);
                    System.arraycopy(f0Var2.f11771b, 0, f0Var.f11771b, f0Var.f11770a, f0Var2.f11770a);
                    System.arraycopy(f0Var2.f11772c, 0, f0Var.f11772c, f0Var.f11770a, f0Var2.f11770a);
                    f0Var.f11770a = i8;
                }
            }
        }
        abstractC0886w.unknownFields = f0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                boolean booleanValue = ((Boolean) list.get(i8)).booleanValue();
                c0876l.L0(i7, 0);
                c0876l.E0(booleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = C0876l.f11798k;
            i9++;
        }
        c0876l.M0(i9);
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0876l.E0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void E(int i7, List list, L l7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            AbstractC0873i abstractC0873i = (AbstractC0873i) list.get(i8);
            C0876l c0876l = (C0876l) l7.f11722a;
            c0876l.L0(i7, 2);
            c0876l.M0(abstractC0873i.size());
            C0872h c0872h = (C0872h) abstractC0873i;
            c0876l.F0(c0872h.f11777d, c0872h.A(), c0872h.size());
        }
    }

    public static void F(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                c0876l.getClass();
                c0876l.I0(i7, Double.doubleToRawLongBits(doubleValue));
                i8++;
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = C0876l.f11798k;
            i9 += 8;
        }
        c0876l.M0(i9);
        while (i8 < list.size()) {
            c0876l.J0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void G(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue = ((Integer) list.get(i8)).intValue();
                c0876l.L0(i7, 0);
                c0876l.K0(intValue);
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0876l.r0(((Integer) list.get(i10)).intValue());
        }
        c0876l.M0(i9);
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0876l.K0(((Integer) list.get(i11)).intValue());
        }
    }

    public static void H(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0876l.G0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0876l.f11798k;
            i9 += 4;
        }
        c0876l.M0(i9);
        while (i8 < list.size()) {
            c0876l.H0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void I(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0876l.I0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0876l.f11798k;
            i9 += 8;
        }
        c0876l.M0(i9);
        while (i8 < list.size()) {
            c0876l.J0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void J(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                c0876l.getClass();
                c0876l.G0(i7, Float.floatToRawIntBits(floatValue));
                i8++;
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = C0876l.f11798k;
            i9 += 4;
        }
        c0876l.M0(i9);
        while (i8 < list.size()) {
            c0876l.H0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    public static void K(int i7, List list, L l7, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            l7.h(i7, list.get(i8), c0Var);
        }
    }

    public static void L(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue = ((Integer) list.get(i8)).intValue();
                c0876l.L0(i7, 0);
                c0876l.K0(intValue);
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0876l.r0(((Integer) list.get(i10)).intValue());
        }
        c0876l.M0(i9);
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0876l.K0(((Integer) list.get(i11)).intValue());
        }
    }

    public static void M(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0876l.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0876l.D0(((Long) list.get(i10)).longValue());
        }
        c0876l.M0(i9);
        while (i8 < list.size()) {
            c0876l.O0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void N(int i7, List list, L l7, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            l7.k(i7, list.get(i8), c0Var);
        }
    }

    public static void O(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0876l.G0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0876l.f11798k;
            i9 += 4;
        }
        c0876l.M0(i9);
        while (i8 < list.size()) {
            c0876l.H0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void P(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0876l.I0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0876l.f11798k;
            i9 += 8;
        }
        c0876l.M0(i9);
        while (i8 < list.size()) {
            c0876l.J0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void Q(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue = ((Integer) list.get(i8)).intValue();
                c0876l.L0(i7, 0);
                c0876l.M0((intValue >> 31) ^ (intValue << 1));
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            i9 += C0876l.B0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0876l.M0(i9);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue3 = ((Integer) list.get(i11)).intValue();
            c0876l.M0((intValue3 >> 31) ^ (intValue3 << 1));
        }
    }

    public static void R(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                long longValue = ((Long) list.get(i8)).longValue();
                c0876l.N0(i7, (longValue >> 63) ^ (longValue << 1));
                i8++;
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long longValue2 = ((Long) list.get(i10)).longValue();
            i9 += C0876l.D0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0876l.M0(i9);
        while (i8 < list.size()) {
            long longValue3 = ((Long) list.get(i8)).longValue();
            c0876l.O0((longValue3 >> 63) ^ (longValue3 << 1));
            i8++;
        }
    }

    public static void S(int i7, List list, L l7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l7.getClass();
        boolean z4 = list instanceof F;
        C0876l c0876l = (C0876l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                String str = (String) list.get(i8);
                c0876l.L0(i7, 2);
                int i9 = c0876l.j;
                try {
                    int B02 = C0876l.B0(str.length() * 3);
                    int B03 = C0876l.B0(str.length());
                    byte[] bArr = c0876l.f11801h;
                    int i10 = c0876l.f11802i;
                    if (B03 == B02) {
                        int i11 = i9 + B03;
                        c0876l.j = i11;
                        int x4 = r0.f11823a.x(str, bArr, i11, i10 - i11);
                        c0876l.j = i9;
                        c0876l.M0((x4 - i9) - B03);
                        c0876l.j = x4;
                    } else {
                        c0876l.M0(r0.b(str));
                        int i12 = c0876l.j;
                        c0876l.j = r0.f11823a.x(str, bArr, i12, i10 - i12);
                    }
                } catch (q0 e7) {
                    c0876l.j = i9;
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
            return;
        }
        F f7 = (F) list;
        for (int i13 = 0; i13 < list.size(); i13++) {
            Object d7 = f7.d(i13);
            if (d7 instanceof String) {
                String str2 = (String) d7;
                c0876l.L0(i7, 2);
                int i14 = c0876l.j;
                try {
                    int B04 = C0876l.B0(str2.length() * 3);
                    int B05 = C0876l.B0(str2.length());
                    byte[] bArr2 = c0876l.f11801h;
                    int i15 = c0876l.f11802i;
                    if (B05 == B04) {
                        int i16 = i14 + B05;
                        c0876l.j = i16;
                        int x7 = r0.f11823a.x(str2, bArr2, i16, i15 - i16);
                        c0876l.j = i14;
                        c0876l.M0((x7 - i14) - B05);
                        c0876l.j = x7;
                    } else {
                        c0876l.M0(r0.b(str2));
                        int i17 = c0876l.j;
                        c0876l.j = r0.f11823a.x(str2, bArr2, i17, i15 - i17);
                    }
                } catch (q0 e10) {
                    c0876l.j = i14;
                    C0876l.f11798k.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
                    byte[] bytes2 = str2.getBytes(A.f11702a);
                    try {
                        c0876l.M0(bytes2.length);
                        c0876l.F0(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e11) {
                        throw new Z4.b(e11);
                    }
                } catch (IndexOutOfBoundsException e12) {
                    throw new Z4.b(e12);
                }
            } else {
                AbstractC0873i abstractC0873i = (AbstractC0873i) d7;
                c0876l.L0(i7, 2);
                c0876l.M0(abstractC0873i.size());
                C0872h c0872h = (C0872h) abstractC0873i;
                c0876l.F0(c0872h.f11777d, c0872h.A(), c0872h.size());
            }
        }
    }

    public static void T(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue = ((Integer) list.get(i8)).intValue();
                c0876l.L0(i7, 0);
                c0876l.M0(intValue);
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0876l.B0(((Integer) list.get(i10)).intValue());
        }
        c0876l.M0(i9);
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0876l.M0(((Integer) list.get(i11)).intValue());
        }
    }

    public static void U(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0876l c0876l = (C0876l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0876l.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0876l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0876l.D0(((Long) list.get(i10)).longValue());
        }
        c0876l.M0(i9);
        while (i8 < list.size()) {
            c0876l.O0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0876l.h0(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int z02 = C0876l.z0(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            z02 += C0876l.j0((AbstractC0873i) list.get(i8));
        }
        return z02;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0876l.z0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0887x) {
            AbstractC0887x abstractC0887x = (AbstractC0887x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0887x.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0876l.r0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0876l.m0(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0876l.n0(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0876l.p0(i7, (AbstractC0865a) list.get(i9), c0Var);
        }
        return i8;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0876l.z0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0887x) {
            AbstractC0887x abstractC0887x = (AbstractC0887x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0887x.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0876l.r0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0876l.z0(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            J j = (J) list;
            if (size <= 0) {
                return 0;
            }
            j.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0876l.D0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, c0 c0Var) {
        int z02 = C0876l.z0(i7);
        int b7 = ((AbstractC0865a) obj).b(c0Var);
        return C0876l.B0(b7) + b7 + z02;
    }

    public static int p(int i7, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int z02 = C0876l.z0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int b7 = ((AbstractC0865a) list.get(i8)).b(c0Var);
            z02 += C0876l.B0(b7) + b7;
        }
        return z02;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0876l.z0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0887x) {
            AbstractC0887x abstractC0887x = (AbstractC0887x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0887x.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = ((Integer) list.get(i8)).intValue();
            i7 += C0876l.B0((intValue >> 31) ^ (intValue << 1));
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0876l.z0(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            J j = (J) list;
            if (size <= 0) {
                return 0;
            }
            j.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i7 += C0876l.D0((longValue >> 63) ^ (longValue << 1));
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int z02 = C0876l.z0(i7) * size;
        if (list instanceof F) {
            F f7 = (F) list;
            while (i8 < size) {
                Object d7 = f7.d(i8);
                z02 = (d7 instanceof AbstractC0873i ? C0876l.j0((AbstractC0873i) d7) : C0876l.y0((String) d7)) + z02;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                z02 = (obj instanceof AbstractC0873i ? C0876l.j0((AbstractC0873i) obj) : C0876l.y0((String) obj)) + z02;
                i8++;
            }
        }
        return z02;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0876l.z0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0887x) {
            AbstractC0887x abstractC0887x = (AbstractC0887x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0887x.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0876l.B0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0876l.z0(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            J j = (J) list;
            if (size <= 0) {
                return 0;
            }
            j.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0876l.D0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static Object z(Object obj, int i7, List list, Object obj2, g0 g0Var) {
        return obj2;
    }
}
