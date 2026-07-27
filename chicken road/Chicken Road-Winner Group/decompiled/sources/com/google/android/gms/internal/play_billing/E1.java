package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C0137l;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class E1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0184e1 f2619a;

    static {
        A1 a12 = A1.f2595c;
        f2619a = new C0184e1(6);
    }

    public static void a(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0222r1.getClass();
        boolean z4 = list instanceof C0193h1;
        int i4 = 0;
        Z0 z02 = (Z0) c0222r1.f2807a;
        if (!z4) {
            if (!z3) {
                while (i4 < list.size()) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    z02.Y(i3, (intValue >> 31) ^ (intValue + intValue));
                    i4++;
                }
                return;
            }
            z02.X(i3, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int intValue2 = ((Integer) list.get(i6)).intValue();
                i5 += Z0.d0((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            z02.Z(i5);
            while (i4 < list.size()) {
                int intValue3 = ((Integer) list.get(i4)).intValue();
                z02.Z((intValue3 >> 31) ^ (intValue3 + intValue3));
                i4++;
            }
            return;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        if (!z3) {
            while (i4 < c0193h1.f2763c) {
                int c3 = c0193h1.c(i4);
                z02.Y(i3, (c3 >> 31) ^ (c3 + c3));
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < c0193h1.f2763c; i8++) {
            int c4 = c0193h1.c(i8);
            i7 += Z0.d0((c4 >> 31) ^ (c4 + c4));
        }
        z02.Z(i7);
        while (i4 < c0193h1.f2763c) {
            int c5 = c0193h1.c(i4);
            z02.Z((c5 >> 31) ^ (c5 + c5));
            i4++;
        }
    }

    public static void b(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0222r1.f2807a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                long longValue = ((Long) list.get(i4)).longValue();
                z02.a0(i3, (longValue >> 63) ^ (longValue + longValue));
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long longValue2 = ((Long) list.get(i6)).longValue();
            i5 += Z0.N((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        z02.Z(i5);
        while (i4 < list.size()) {
            long longValue3 = ((Long) list.get(i4)).longValue();
            z02.b0((longValue3 >> 63) ^ (longValue3 + longValue3));
            i4++;
        }
    }

    public static void c(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0222r1.getClass();
        boolean z4 = list instanceof C0193h1;
        int i4 = 0;
        Z0 z02 = (Z0) c0222r1.f2807a;
        if (!z4) {
            if (!z3) {
                while (i4 < list.size()) {
                    z02.Y(i3, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            z02.X(i3, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += Z0.d0(((Integer) list.get(i6)).intValue());
            }
            z02.Z(i5);
            while (i4 < list.size()) {
                z02.Z(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        if (!z3) {
            while (i4 < c0193h1.f2763c) {
                z02.Y(i3, c0193h1.c(i4));
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < c0193h1.f2763c; i8++) {
            i7 += Z0.d0(c0193h1.c(i8));
        }
        z02.Z(i7);
        while (i4 < c0193h1.f2763c) {
            z02.Z(c0193h1.c(i4));
            i4++;
        }
    }

    public static void d(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0222r1.f2807a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                z02.a0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += Z0.N(((Long) list.get(i6)).longValue());
        }
        z02.Z(i5);
        while (i4 < list.size()) {
            z02.b0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0193h1)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += Z0.N(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i4;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += Z0.N(c0193h1.c(i3));
            i3++;
        }
        return i5;
    }

    public static int g(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Z0.d0(i3 << 3) + 4) * size;
    }

    public static int h(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Z0.d0(i3 << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0193h1)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += Z0.N(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i4;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += Z0.N(c0193h1.c(i3));
            i3++;
        }
        return i5;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += Z0.N(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static int k(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0193h1)) {
            int i4 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i4 += Z0.d0((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
            return i4;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        int i5 = 0;
        while (i3 < size) {
            int c3 = c0193h1.c(i3);
            i5 += Z0.d0((c3 >> 31) ^ (c3 + c3));
            i3++;
        }
        return i5;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i3 += Z0.N((longValue >> 63) ^ (longValue + longValue));
        }
        return i3;
    }

    public static int m(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0193h1)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += Z0.d0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i4;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += Z0.d0(c0193h1.c(i3));
            i3++;
        }
        return i5;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += Z0.N(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static Object o(int i3, int i4, Object obj, Object obj2) {
        Object obj3 = obj2;
        if (obj2 == null) {
            AbstractC0190g1 abstractC0190g1 = (AbstractC0190g1) obj;
            H1 h12 = abstractC0190g1.zzc;
            obj3 = h12;
            if (h12 == H1.f) {
                H1 b3 = H1.b();
                abstractC0190g1.zzc = b3;
                obj3 = b3;
            }
        }
        ((H1) obj3).c(i3 << 3, Long.valueOf(i4));
        return obj3;
    }

    public static void p(Object obj, Object obj2) {
        AbstractC0190g1 abstractC0190g1 = (AbstractC0190g1) obj;
        H1 h12 = abstractC0190g1.zzc;
        H1 h13 = ((AbstractC0190g1) obj2).zzc;
        H1 h14 = H1.f;
        if (!h14.equals(h13)) {
            if (h14.equals(h12)) {
                int i3 = h12.f2631a + h13.f2631a;
                int[] copyOf = Arrays.copyOf(h12.f2632b, i3);
                System.arraycopy(h13.f2632b, 0, copyOf, h12.f2631a, h13.f2631a);
                Object[] copyOf2 = Arrays.copyOf(h12.f2633c, i3);
                System.arraycopy(h13.f2633c, 0, copyOf2, h12.f2631a, h13.f2631a);
                h12 = new H1(i3, copyOf, copyOf2, true);
            } else {
                h12.getClass();
                if (!h13.equals(h14)) {
                    if (!h12.f2635e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = h12.f2631a + h13.f2631a;
                    h12.e(i4);
                    System.arraycopy(h13.f2632b, 0, h12.f2632b, h12.f2631a, h13.f2631a);
                    System.arraycopy(h13.f2633c, 0, h12.f2633c, h12.f2631a, h13.f2631a);
                    h12.f2631a = i4;
                }
            }
        }
        abstractC0190g1.zzc = h12;
    }

    public static void q(int i3, List list, C0222r1 c0222r1, boolean z3) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0222r1.f2807a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i4)).booleanValue();
                z02.Z(i3 << 3);
                int i5 = z02.f2722e;
                try {
                    int i6 = i5 + 1;
                    try {
                        z02.f2720c[i5] = booleanValue;
                        z02.f2722e = i6;
                        i4++;
                    } catch (IndexOutOfBoundsException e3) {
                        indexOutOfBoundsException = e3;
                        i5 = i6;
                        throw new C0137l(i5, z02.f2721d, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e4) {
                    indexOutOfBoundsException = e4;
                }
            }
            return;
        }
        z02.X(i3, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((Boolean) list.get(i8)).getClass();
            i7++;
        }
        z02.Z(i7);
        while (i4 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i4)).booleanValue();
            int i9 = z02.f2722e;
            try {
                int i10 = i9 + 1;
                try {
                    z02.f2720c[i9] = booleanValue2;
                    z02.f2722e = i10;
                    i4++;
                } catch (IndexOutOfBoundsException e5) {
                    indexOutOfBoundsException2 = e5;
                    i9 = i10;
                    throw new C0137l(i9, z02.f2721d, 1, indexOutOfBoundsException2);
                }
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException2 = e6;
            }
        }
    }

    public static void r(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0222r1.f2807a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                z02.S(i3, Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            i5 += 8;
        }
        z02.Z(i5);
        while (i4 < list.size()) {
            z02.T(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void s(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0222r1.getClass();
        boolean z4 = list instanceof C0193h1;
        int i4 = 0;
        Z0 z02 = (Z0) c0222r1.f2807a;
        if (!z4) {
            if (!z3) {
                while (i4 < list.size()) {
                    z02.U(i3, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            z02.X(i3, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += Z0.N(((Integer) list.get(i6)).intValue());
            }
            z02.Z(i5);
            while (i4 < list.size()) {
                z02.V(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        if (!z3) {
            while (i4 < c0193h1.f2763c) {
                z02.U(i3, c0193h1.c(i4));
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < c0193h1.f2763c; i8++) {
            i7 += Z0.N(c0193h1.c(i8));
        }
        z02.Z(i7);
        while (i4 < c0193h1.f2763c) {
            z02.V(c0193h1.c(i4));
            i4++;
        }
    }

    public static void t(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0222r1.getClass();
        boolean z4 = list instanceof C0193h1;
        int i4 = 0;
        Z0 z02 = (Z0) c0222r1.f2807a;
        if (!z4) {
            if (!z3) {
                while (i4 < list.size()) {
                    z02.Q(i3, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            z02.X(i3, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).getClass();
                i5 += 4;
            }
            z02.Z(i5);
            while (i4 < list.size()) {
                z02.R(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        if (!z3) {
            while (i4 < c0193h1.f2763c) {
                z02.Q(i3, c0193h1.c(i4));
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < c0193h1.f2763c; i8++) {
            c0193h1.c(i8);
            i7 += 4;
        }
        z02.Z(i7);
        while (i4 < c0193h1.f2763c) {
            z02.R(c0193h1.c(i4));
            i4++;
        }
    }

    public static void u(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0222r1.f2807a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                z02.S(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            i5 += 8;
        }
        z02.Z(i5);
        while (i4 < list.size()) {
            z02.T(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void v(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0222r1.f2807a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                z02.Q(i3, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            i5 += 4;
        }
        z02.Z(i5);
        while (i4 < list.size()) {
            z02.R(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void w(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0222r1.getClass();
        boolean z4 = list instanceof C0193h1;
        int i4 = 0;
        Z0 z02 = (Z0) c0222r1.f2807a;
        if (!z4) {
            if (!z3) {
                while (i4 < list.size()) {
                    z02.U(i3, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            z02.X(i3, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += Z0.N(((Integer) list.get(i6)).intValue());
            }
            z02.Z(i5);
            while (i4 < list.size()) {
                z02.V(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        if (!z3) {
            while (i4 < c0193h1.f2763c) {
                z02.U(i3, c0193h1.c(i4));
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < c0193h1.f2763c; i8++) {
            i7 += Z0.N(c0193h1.c(i8));
        }
        z02.Z(i7);
        while (i4 < c0193h1.f2763c) {
            z02.V(c0193h1.c(i4));
            i4++;
        }
    }

    public static void x(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0222r1.f2807a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                z02.a0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += Z0.N(((Long) list.get(i6)).longValue());
        }
        z02.Z(i5);
        while (i4 < list.size()) {
            z02.b0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void y(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0222r1.getClass();
        boolean z4 = list instanceof C0193h1;
        int i4 = 0;
        Z0 z02 = (Z0) c0222r1.f2807a;
        if (!z4) {
            if (!z3) {
                while (i4 < list.size()) {
                    z02.Q(i3, ((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            z02.X(i3, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).getClass();
                i5 += 4;
            }
            z02.Z(i5);
            while (i4 < list.size()) {
                z02.R(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        C0193h1 c0193h1 = (C0193h1) list;
        if (!z3) {
            while (i4 < c0193h1.f2763c) {
                z02.Q(i3, c0193h1.c(i4));
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < c0193h1.f2763c; i8++) {
            c0193h1.c(i8);
            i7 += 4;
        }
        z02.Z(i7);
        while (i4 < c0193h1.f2763c) {
            z02.R(c0193h1.c(i4));
            i4++;
        }
    }

    public static void z(int i3, List list, C0222r1 c0222r1, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0222r1.f2807a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                z02.S(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        z02.X(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            i5 += 8;
        }
        z02.Z(i5);
        while (i4 < list.size()) {
            z02.T(((Long) list.get(i4)).longValue());
            i4++;
        }
    }
}
