package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.tC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1599tC {

    /* renamed from: a, reason: collision with root package name */
    public static final C1543s1 f15642a;

    static {
        C1285mC c1285mC = C1285mC.f14484c;
        f15642a = new C1543s1(6);
    }

    public static void a(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof C0794bC;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    eb.G0(i, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += EB.q0(((Long) list.get(i7)).longValue());
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                eb.H0(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        C0794bC c0794bC = (C0794bC) list;
        if (!z3) {
            while (i5 < c0794bC.f12779m) {
                eb.G0(i, c0794bC.d(i5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0794bC.f12779m; i9++) {
            i8 += EB.q0(c0794bC.d(i9));
        }
        eb.F0(i8);
        while (i5 < c0794bC.f12779m) {
            eb.H0(c0794bC.d(i5));
            i5++;
        }
    }

    public static void b(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof NB;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    eb.v0(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                eb.w0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        NB nb = (NB) list;
        if (!z3) {
            while (i5 < nb.f10783m) {
                eb.v0(i, nb.d(i5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < nb.f10783m; i9++) {
            nb.d(i9);
            i8 += 4;
        }
        eb.F0(i8);
        while (i5 < nb.f10783m) {
            eb.w0(nb.d(i5));
            i5++;
        }
    }

    public static void c(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof C0794bC;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    eb.x0(i, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                eb.y0(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        C0794bC c0794bC = (C0794bC) list;
        if (!z3) {
            while (i5 < c0794bC.f12779m) {
                eb.x0(i, c0794bC.d(i5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0794bC.f12779m; i9++) {
            c0794bC.d(i9);
            i8 += 8;
        }
        eb.F0(i8);
        while (i5 < c0794bC.f12779m) {
            eb.y0(c0794bC.d(i5));
            i5++;
        }
    }

    public static void d(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof NB;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    int intValue = ((Integer) list.get(i5)).intValue();
                    eb.E0(i, (intValue >> 31) ^ (intValue + intValue));
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                int intValue2 = ((Integer) list.get(i7)).intValue();
                i6 += EB.p0((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                eb.F0((intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
            return;
        }
        NB nb = (NB) list;
        if (!z3) {
            while (i5 < nb.f10783m) {
                int d5 = nb.d(i5);
                eb.E0(i, (d5 >> 31) ^ (d5 + d5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < nb.f10783m; i9++) {
            int d6 = nb.d(i9);
            i8 += EB.p0((d6 >> 31) ^ (d6 + d6));
        }
        eb.F0(i8);
        while (i5 < nb.f10783m) {
            int d7 = nb.d(i5);
            eb.F0((d7 >> 31) ^ (d7 + d7));
            i5++;
        }
    }

    public static void e(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof C0794bC;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    long longValue = ((Long) list.get(i5)).longValue();
                    eb.G0(i, (longValue >> 63) ^ (longValue + longValue));
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                long longValue2 = ((Long) list.get(i7)).longValue();
                i6 += EB.q0((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                eb.H0((longValue3 >> 63) ^ (longValue3 + longValue3));
                i5++;
            }
            return;
        }
        C0794bC c0794bC = (C0794bC) list;
        if (!z3) {
            while (i5 < c0794bC.f12779m) {
                long d5 = c0794bC.d(i5);
                eb.G0(i, (d5 >> 63) ^ (d5 + d5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0794bC.f12779m; i9++) {
            long d6 = c0794bC.d(i9);
            i8 += EB.q0((d6 >> 63) ^ (d6 + d6));
        }
        eb.F0(i8);
        while (i5 < c0794bC.f12779m) {
            long d7 = c0794bC.d(i5);
            eb.H0((d7 >> 63) ^ (d7 + d7));
            i5++;
        }
    }

    public static void f(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof NB;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    eb.E0(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += EB.p0(((Integer) list.get(i7)).intValue());
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                eb.F0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        NB nb = (NB) list;
        if (!z3) {
            while (i5 < nb.f10783m) {
                eb.E0(i, nb.d(i5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < nb.f10783m; i9++) {
            i8 += EB.p0(nb.d(i9));
        }
        eb.F0(i8);
        while (i5 < nb.f10783m) {
            eb.F0(nb.d(i5));
            i5++;
        }
    }

    public static void g(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof C0794bC;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    eb.G0(i, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += EB.q0(((Long) list.get(i7)).longValue());
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                eb.H0(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        C0794bC c0794bC = (C0794bC) list;
        if (!z3) {
            while (i5 < c0794bC.f12779m) {
                eb.G0(i, c0794bC.d(i5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0794bC.f12779m; i9++) {
            i8 += EB.q0(c0794bC.d(i9));
        }
        eb.F0(i8);
        while (i5 < c0794bC.f12779m) {
            eb.H0(c0794bC.d(i5));
            i5++;
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NB)) {
            int i5 = 0;
            while (i < size) {
                i5 += EB.q0(((Integer) list.get(i)).intValue());
                i++;
            }
            return i5;
        }
        NB nb = (NB) list;
        int i6 = 0;
        while (i < size) {
            i6 += EB.q0(nb.d(i));
            i++;
        }
        return i6;
    }

    public static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (EB.p0(i << 3) + 4) * size;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (EB.p0(i << 3) + 8) * size;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NB)) {
            int i5 = 0;
            while (i < size) {
                i5 += EB.q0(((Integer) list.get(i)).intValue());
                i++;
            }
            return i5;
        }
        NB nb = (NB) list;
        int i6 = 0;
        while (i < size) {
            i6 += EB.q0(nb.d(i));
            i++;
        }
        return i6;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0794bC)) {
            int i5 = 0;
            while (i < size) {
                i5 += EB.q0(((Long) list.get(i)).longValue());
                i++;
            }
            return i5;
        }
        C0794bC c0794bC = (C0794bC) list;
        int i6 = 0;
        while (i < size) {
            i6 += EB.q0(c0794bC.d(i));
            i++;
        }
        return i6;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NB)) {
            int i5 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i5 += EB.p0((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i5;
        }
        NB nb = (NB) list;
        int i6 = 0;
        while (i < size) {
            int d5 = nb.d(i);
            i6 += EB.p0((d5 >> 31) ^ (d5 + d5));
            i++;
        }
        return i6;
    }

    public static int o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0794bC)) {
            int i5 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i5 += EB.q0((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i5;
        }
        C0794bC c0794bC = (C0794bC) list;
        int i6 = 0;
        while (i < size) {
            long d5 = c0794bC.d(i);
            i6 += EB.q0((d5 >> 63) ^ (d5 + d5));
            i++;
        }
        return i6;
    }

    public static int p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof NB)) {
            int i5 = 0;
            while (i < size) {
                i5 += EB.p0(((Integer) list.get(i)).intValue());
                i++;
            }
            return i5;
        }
        NB nb = (NB) list;
        int i6 = 0;
        while (i < size) {
            i6 += EB.p0(nb.d(i));
            i++;
        }
        return i6;
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0794bC)) {
            int i5 = 0;
            while (i < size) {
                i5 += EB.q0(((Long) list.get(i)).longValue());
                i++;
            }
            return i5;
        }
        C0794bC c0794bC = (C0794bC) list;
        int i6 = 0;
        while (i < size) {
            i6 += EB.q0(c0794bC.d(i));
            i++;
        }
        return i6;
    }

    public static Object r(Object obj, int i, UB ub, PB pb, Object obj2, C1543s1 c1543s1) {
        if (pb == null) {
            return obj2;
        }
        if (!AbstractC2107A.A(ub)) {
            Iterator it = ub.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!pb.a(intValue)) {
                    if (obj2 == null) {
                        c1543s1.getClass();
                        obj2 = C1543s1.q(obj);
                    }
                    c1543s1.getClass();
                    ((C1779xC) obj2).c(i << 3, Long.valueOf(intValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = ub.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Integer num = (Integer) ub.get(i6);
            int intValue2 = num.intValue();
            if (pb.a(intValue2)) {
                if (i6 != i5) {
                    ub.set(i5, num);
                }
                i5++;
            } else {
                if (obj2 == null) {
                    c1543s1.getClass();
                    obj2 = C1543s1.q(obj);
                }
                c1543s1.getClass();
                ((C1779xC) obj2).c(i << 3, Long.valueOf(intValue2));
            }
        }
        if (i5 != size) {
            ub.subList(i5, size).clear();
        }
        return obj2;
    }

    public static void s(Object obj, Object obj2) {
        MB mb = (MB) obj;
        C1779xC c1779xC = mb.zzt;
        C1779xC c1779xC2 = ((MB) obj2).zzt;
        C1779xC c1779xC3 = C1779xC.f;
        if (!c1779xC3.equals(c1779xC2)) {
            if (c1779xC3.equals(c1779xC)) {
                int i = c1779xC.f16272a + c1779xC2.f16272a;
                int[] copyOf = Arrays.copyOf(c1779xC.f16273b, i);
                System.arraycopy(c1779xC2.f16273b, 0, copyOf, c1779xC.f16272a, c1779xC2.f16272a);
                Object[] copyOf2 = Arrays.copyOf(c1779xC.f16274c, i);
                System.arraycopy(c1779xC2.f16274c, 0, copyOf2, c1779xC.f16272a, c1779xC2.f16272a);
                c1779xC = new C1779xC(i, copyOf, copyOf2, true);
            } else {
                c1779xC.getClass();
                if (!c1779xC2.equals(c1779xC3)) {
                    if (!c1779xC.f16276e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = c1779xC.f16272a + c1779xC2.f16272a;
                    c1779xC.e(i5);
                    System.arraycopy(c1779xC2.f16273b, 0, c1779xC.f16273b, c1779xC.f16272a, c1779xC2.f16272a);
                    System.arraycopy(c1779xC2.f16274c, 0, c1779xC.f16274c, c1779xC.f16272a, c1779xC2.f16272a);
                    c1779xC.f16272a = i5;
                }
            }
        }
        mb.zzt = c1779xC;
    }

    public static void t(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        EB eb = (EB) ps.f11130k;
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                eb.t0(i, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        eb.F0(i6);
        while (i5 < list.size()) {
            eb.s0(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void u(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        EB eb = (EB) ps.f11130k;
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                eb.x0(i, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        eb.F0(i6);
        while (i5 < list.size()) {
            eb.y0(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void v(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof NB;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    eb.z0(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += EB.q0(((Integer) list.get(i7)).intValue());
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                eb.A0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        NB nb = (NB) list;
        if (!z3) {
            while (i5 < nb.f10783m) {
                eb.z0(i, nb.d(i5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < nb.f10783m; i9++) {
            i8 += EB.q0(nb.d(i9));
        }
        eb.F0(i8);
        while (i5 < nb.f10783m) {
            eb.A0(nb.d(i5));
            i5++;
        }
    }

    public static void w(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof NB;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    eb.v0(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                eb.w0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        NB nb = (NB) list;
        if (!z3) {
            while (i5 < nb.f10783m) {
                eb.v0(i, nb.d(i5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < nb.f10783m; i9++) {
            nb.d(i9);
            i8 += 4;
        }
        eb.F0(i8);
        while (i5 < nb.f10783m) {
            eb.w0(nb.d(i5));
            i5++;
        }
    }

    public static void x(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof C0794bC;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    eb.x0(i, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                eb.y0(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        C0794bC c0794bC = (C0794bC) list;
        if (!z3) {
            while (i5 < c0794bC.f12779m) {
                eb.x0(i, c0794bC.d(i5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0794bC.f12779m; i9++) {
            c0794bC.d(i9);
            i8 += 8;
        }
        eb.F0(i8);
        while (i5 < c0794bC.f12779m) {
            eb.y0(c0794bC.d(i5));
            i5++;
        }
    }

    public static void y(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        EB eb = (EB) ps.f11130k;
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                eb.v0(i, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        eb.F0(i6);
        while (i5 < list.size()) {
            eb.w0(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void z(int i, List list, Ps ps, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ps.getClass();
        boolean z5 = list instanceof NB;
        int i5 = 0;
        EB eb = (EB) ps.f11130k;
        if (!z5) {
            if (!z3) {
                while (i5 < list.size()) {
                    eb.z0(i, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            eb.D0(i, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += EB.q0(((Integer) list.get(i7)).intValue());
            }
            eb.F0(i6);
            while (i5 < list.size()) {
                eb.A0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        NB nb = (NB) list;
        if (!z3) {
            while (i5 < nb.f10783m) {
                eb.z0(i, nb.d(i5));
                i5++;
            }
            return;
        }
        eb.D0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < nb.f10783m; i9++) {
            i8 += EB.q0(nb.d(i9));
        }
        eb.F0(i8);
        while (i5 < nb.f10783m) {
            eb.A0(nb.d(i5));
            i5++;
        }
    }
}
