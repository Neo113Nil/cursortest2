package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C0216k;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class E1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0328e1 f5043a;

    static {
        A1 a12 = A1.f5019c;
        f5043a = new C0328e1(1);
    }

    public static void A(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0366r1.f5242a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                z02.i0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += Z0.V(((Long) list.get(i7)).longValue());
        }
        z02.h0(i6);
        while (i3 < list.size()) {
            z02.j0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void B(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0366r1.getClass();
        boolean z5 = list instanceof C0337h1;
        int i3 = 0;
        Z0 z02 = (Z0) c0366r1.f5242a;
        if (!z5) {
            if (!z) {
                while (i3 < list.size()) {
                    z02.Y(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            z02.f0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            z02.h0(i6);
            while (i3 < list.size()) {
                z02.Z(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0337h1 c0337h1 = (C0337h1) list;
        if (!z) {
            while (i3 < c0337h1.f5195c) {
                z02.Y(i2, c0337h1.e(i3));
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0337h1.f5195c; i9++) {
            c0337h1.e(i9);
            i8 += 4;
        }
        z02.h0(i8);
        while (i3 < c0337h1.f5195c) {
            z02.Z(c0337h1.e(i3));
            i3++;
        }
    }

    public static void C(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0366r1.f5242a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                z02.a0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        z02.h0(i6);
        while (i3 < list.size()) {
            z02.b0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void a(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0366r1.getClass();
        boolean z5 = list instanceof C0337h1;
        int i3 = 0;
        Z0 z02 = (Z0) c0366r1.f5242a;
        if (!z5) {
            if (!z) {
                while (i3 < list.size()) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    z02.g0(i2, (intValue >> 31) ^ (intValue + intValue));
                    i3++;
                }
                return;
            }
            z02.f0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                int intValue2 = ((Integer) list.get(i7)).intValue();
                i6 += Z0.n0((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            z02.h0(i6);
            while (i3 < list.size()) {
                int intValue3 = ((Integer) list.get(i3)).intValue();
                z02.h0((intValue3 >> 31) ^ (intValue3 + intValue3));
                i3++;
            }
            return;
        }
        C0337h1 c0337h1 = (C0337h1) list;
        if (!z) {
            while (i3 < c0337h1.f5195c) {
                int e3 = c0337h1.e(i3);
                z02.g0(i2, (e3 >> 31) ^ (e3 + e3));
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0337h1.f5195c; i9++) {
            int e6 = c0337h1.e(i9);
            i8 += Z0.n0((e6 >> 31) ^ (e6 + e6));
        }
        z02.h0(i8);
        while (i3 < c0337h1.f5195c) {
            int e7 = c0337h1.e(i3);
            z02.h0((e7 >> 31) ^ (e7 + e7));
            i3++;
        }
    }

    public static void b(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0366r1.f5242a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                long longValue = ((Long) list.get(i3)).longValue();
                z02.i0(i2, (longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((Long) list.get(i7)).longValue();
            i6 += Z0.V((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        z02.h0(i6);
        while (i3 < list.size()) {
            long longValue3 = ((Long) list.get(i3)).longValue();
            z02.j0((longValue3 >> 63) ^ (longValue3 + longValue3));
            i3++;
        }
    }

    public static void c(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0366r1.getClass();
        boolean z5 = list instanceof C0337h1;
        int i3 = 0;
        Z0 z02 = (Z0) c0366r1.f5242a;
        if (!z5) {
            if (!z) {
                while (i3 < list.size()) {
                    z02.g0(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            z02.f0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += Z0.n0(((Integer) list.get(i7)).intValue());
            }
            z02.h0(i6);
            while (i3 < list.size()) {
                z02.h0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0337h1 c0337h1 = (C0337h1) list;
        if (!z) {
            while (i3 < c0337h1.f5195c) {
                z02.g0(i2, c0337h1.e(i3));
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0337h1.f5195c; i9++) {
            i8 += Z0.n0(c0337h1.e(i9));
        }
        z02.h0(i8);
        while (i3 < c0337h1.f5195c) {
            z02.h0(c0337h1.e(i3));
            i3++;
        }
    }

    public static void d(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0366r1.f5242a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                z02.i0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += Z0.V(((Long) list.get(i7)).longValue());
        }
        z02.h0(i6);
        while (i3 < list.size()) {
            z02.j0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0337h1) {
            C0337h1 c0337h1 = (C0337h1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += Z0.V(c0337h1.e(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += Z0.V(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int g(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Z0.n0(i2 << 3) + 4) * size;
    }

    public static int h(List list) {
        return list.size() * 4;
    }

    public static int i(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Z0.n0(i2 << 3) + 8) * size;
    }

    public static int j(List list) {
        return list.size() * 8;
    }

    public static int k(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0337h1) {
            C0337h1 c0337h1 = (C0337h1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += Z0.V(c0337h1.e(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += Z0.V(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += Z0.V(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static int m(int i2, Object obj, D1 d12) {
        return Z0.l0((S0) obj, d12) + Z0.n0(i2 << 3);
    }

    public static int n(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0337h1) {
            C0337h1 c0337h1 = (C0337h1) list;
            i2 = 0;
            while (i3 < size) {
                int e3 = c0337h1.e(i3);
                i2 += Z0.n0((e3 >> 31) ^ (e3 + e3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i2 += Z0.n0((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
        }
        return i2;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long longValue = ((Long) list.get(i3)).longValue();
            i2 += Z0.V((longValue >> 63) ^ (longValue + longValue));
        }
        return i2;
    }

    public static int p(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0337h1) {
            C0337h1 c0337h1 = (C0337h1) list;
            i2 = 0;
            while (i3 < size) {
                i2 += Z0.n0(c0337h1.e(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += Z0.n0(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += Z0.V(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static Object r(int i2, int i3, Object obj, Object obj2) {
        Object obj3 = obj2;
        if (obj2 == null) {
            AbstractC0334g1 abstractC0334g1 = (AbstractC0334g1) obj;
            H1 h12 = abstractC0334g1.zzc;
            obj3 = h12;
            if (h12 == H1.f5055f) {
                H1 b6 = H1.b();
                abstractC0334g1.zzc = b6;
                obj3 = b6;
            }
        }
        ((H1) obj3).c(i2 << 3, Long.valueOf(i3));
        return obj3;
    }

    public static void s(Object obj, Object obj2) {
        AbstractC0334g1 abstractC0334g1 = (AbstractC0334g1) obj;
        H1 h12 = abstractC0334g1.zzc;
        H1 h13 = ((AbstractC0334g1) obj2).zzc;
        H1 h14 = H1.f5055f;
        if (!h14.equals(h13)) {
            if (h14.equals(h12)) {
                int i2 = h12.f5056a + h13.f5056a;
                int[] copyOf = Arrays.copyOf(h12.f5057b, i2);
                System.arraycopy(h13.f5057b, 0, copyOf, h12.f5056a, h13.f5056a);
                Object[] copyOf2 = Arrays.copyOf(h12.f5058c, i2);
                System.arraycopy(h13.f5058c, 0, copyOf2, h12.f5056a, h13.f5056a);
                h12 = new H1(i2, copyOf, copyOf2, true);
            } else {
                h12.getClass();
                if (!h13.equals(h14)) {
                    if (!h12.f5060e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = h12.f5056a + h13.f5056a;
                    h12.e(i3);
                    System.arraycopy(h13.f5057b, 0, h12.f5057b, h12.f5056a, h13.f5056a);
                    System.arraycopy(h13.f5058c, 0, h12.f5058c, h12.f5056a, h13.f5056a);
                    h12.f5056a = i3;
                }
            }
        }
        abstractC0334g1.zzc = h12;
    }

    public static void t(int i2, List list, C0366r1 c0366r1, boolean z) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0366r1.f5242a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i3)).booleanValue();
                z02.h0(i2 << 3);
                int i6 = z02.f5152e;
                try {
                    int i7 = i6 + 1;
                    try {
                        z02.f5150c[i6] = booleanValue;
                        z02.f5152e = i7;
                        i3++;
                    } catch (IndexOutOfBoundsException e3) {
                        indexOutOfBoundsException = e3;
                        i6 = i7;
                        throw new C0216k(i6, z02.f5151d, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    indexOutOfBoundsException = e6;
                }
            }
            return;
        }
        z02.f0(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Boolean) list.get(i9)).getClass();
            i8++;
        }
        z02.h0(i8);
        while (i3 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i3)).booleanValue();
            int i10 = z02.f5152e;
            try {
                int i11 = i10 + 1;
                try {
                    z02.f5150c[i10] = booleanValue2;
                    z02.f5152e = i11;
                    i3++;
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException2 = e7;
                    i10 = i11;
                    throw new C0216k(i10, z02.f5151d, 1, indexOutOfBoundsException2);
                }
            } catch (IndexOutOfBoundsException e8) {
                indexOutOfBoundsException2 = e8;
            }
        }
    }

    public static void u(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0366r1.f5242a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                z02.a0(i2, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        z02.h0(i6);
        while (i3 < list.size()) {
            z02.b0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void v(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0366r1.getClass();
        boolean z5 = list instanceof C0337h1;
        int i3 = 0;
        Z0 z02 = (Z0) c0366r1.f5242a;
        if (!z5) {
            if (!z) {
                while (i3 < list.size()) {
                    z02.c0(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            z02.f0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += Z0.V(((Integer) list.get(i7)).intValue());
            }
            z02.h0(i6);
            while (i3 < list.size()) {
                z02.d0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0337h1 c0337h1 = (C0337h1) list;
        if (!z) {
            while (i3 < c0337h1.f5195c) {
                z02.c0(i2, c0337h1.e(i3));
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0337h1.f5195c; i9++) {
            i8 += Z0.V(c0337h1.e(i9));
        }
        z02.h0(i8);
        while (i3 < c0337h1.f5195c) {
            z02.d0(c0337h1.e(i3));
            i3++;
        }
    }

    public static void w(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0366r1.getClass();
        boolean z5 = list instanceof C0337h1;
        int i3 = 0;
        Z0 z02 = (Z0) c0366r1.f5242a;
        if (!z5) {
            if (!z) {
                while (i3 < list.size()) {
                    z02.Y(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            z02.f0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            z02.h0(i6);
            while (i3 < list.size()) {
                z02.Z(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0337h1 c0337h1 = (C0337h1) list;
        if (!z) {
            while (i3 < c0337h1.f5195c) {
                z02.Y(i2, c0337h1.e(i3));
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0337h1.f5195c; i9++) {
            c0337h1.e(i9);
            i8 += 4;
        }
        z02.h0(i8);
        while (i3 < c0337h1.f5195c) {
            z02.Z(c0337h1.e(i3));
            i3++;
        }
    }

    public static void x(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0366r1.f5242a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                z02.a0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        z02.h0(i6);
        while (i3 < list.size()) {
            z02.b0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void y(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Z0 z02 = (Z0) c0366r1.f5242a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                z02.Y(i2, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        z02.h0(i6);
        while (i3 < list.size()) {
            z02.Z(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void z(int i2, List list, C0366r1 c0366r1, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0366r1.getClass();
        boolean z5 = list instanceof C0337h1;
        int i3 = 0;
        Z0 z02 = (Z0) c0366r1.f5242a;
        if (!z5) {
            if (!z) {
                while (i3 < list.size()) {
                    z02.c0(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            z02.f0(i2, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += Z0.V(((Integer) list.get(i7)).intValue());
            }
            z02.h0(i6);
            while (i3 < list.size()) {
                z02.d0(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        C0337h1 c0337h1 = (C0337h1) list;
        if (!z) {
            while (i3 < c0337h1.f5195c) {
                z02.c0(i2, c0337h1.e(i3));
                i3++;
            }
            return;
        }
        z02.f0(i2, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0337h1.f5195c; i9++) {
            i8 += Z0.V(c0337h1.e(i9));
        }
        z02.h0(i8);
        while (i3 < c0337h1.f5195c) {
            z02.d0(c0337h1.e(i3));
            i3++;
        }
    }
}
