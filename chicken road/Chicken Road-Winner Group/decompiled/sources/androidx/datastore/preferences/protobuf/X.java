package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2200a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f2201b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f2202c;

    static {
        Class<?> cls;
        Class<?> cls2;
        T t3 = T.f2190c;
        e0 e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2200a = cls;
        try {
            T t4 = T.f2190c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e0Var = (e0) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f2201b = e0Var;
        f2202c = new e0();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0138m.s0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int b(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0138m.q0(i3) + 4) * size;
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0138m.q0(i3) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0138m.s0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0138m.s0(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i3 += C0138m.r0((intValue >> 31) ^ (intValue << 1));
        }
        return i3;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i3 += C0138m.s0((longValue >> 63) ^ (longValue << 1));
        }
        return i3;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0138m.r0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0138m.s0(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static void k(e0 e0Var, Object obj, Object obj2) {
        e0Var.getClass();
        AbstractC0147w abstractC0147w = (AbstractC0147w) obj;
        d0 d0Var = abstractC0147w.unknownFields;
        d0 d0Var2 = ((AbstractC0147w) obj2).unknownFields;
        d0 d0Var3 = d0.f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i3 = d0Var.f2223a + d0Var2.f2223a;
                int[] copyOf = Arrays.copyOf(d0Var.f2224b, i3);
                System.arraycopy(d0Var2.f2224b, 0, copyOf, d0Var.f2223a, d0Var2.f2223a);
                Object[] copyOf2 = Arrays.copyOf(d0Var.f2225c, i3);
                System.arraycopy(d0Var2.f2225c, 0, copyOf2, d0Var.f2223a, d0Var2.f2223a);
                d0Var = new d0(i3, copyOf, copyOf2, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f2227e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = d0Var.f2223a + d0Var2.f2223a;
                    d0Var.a(i4);
                    System.arraycopy(d0Var2.f2224b, 0, d0Var.f2224b, d0Var.f2223a, d0Var2.f2223a);
                    System.arraycopy(d0Var2.f2225c, 0, d0Var.f2225c, d0Var.f2223a, d0Var2.f2223a);
                    d0Var.f2223a = i4;
                }
            }
        }
        abstractC0147w.unknownFields = d0Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.x0(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            Logger logger = C0138m.f2262g;
            i5++;
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.v0(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static void n(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                double doubleValue = ((Double) list.get(i4)).doubleValue();
                c0138m.getClass();
                c0138m.C0(i3, Double.doubleToRawLongBits(doubleValue));
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            Logger logger = C0138m.f2262g;
            i5 += 8;
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.D0(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void o(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.E0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0138m.s0(((Integer) list.get(i6)).intValue());
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.F0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void p(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.A0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0138m.f2262g;
            i5 += 4;
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.B0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void q(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.C0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0138m.f2262g;
            i5 += 8;
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.D0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void r(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                float floatValue = ((Float) list.get(i4)).floatValue();
                c0138m.getClass();
                c0138m.A0(i3, Float.floatToRawIntBits(floatValue));
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            Logger logger = C0138m.f2262g;
            i5 += 4;
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.B0(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void s(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.E0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0138m.s0(((Integer) list.get(i6)).intValue());
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.F0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void t(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.M0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0138m.s0(((Long) list.get(i6)).longValue());
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.N0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void u(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.A0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0138m.f2262g;
            i5 += 4;
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.B0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void v(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.C0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0138m.f2262g;
            i5 += 8;
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.D0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void w(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                int intValue = ((Integer) list.get(i4)).intValue();
                c0138m.K0(i3, (intValue >> 31) ^ (intValue << 1));
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue2 = ((Integer) list.get(i6)).intValue();
            i5 += C0138m.r0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            int intValue3 = ((Integer) list.get(i4)).intValue();
            c0138m.L0((intValue3 >> 31) ^ (intValue3 << 1));
            i4++;
        }
    }

    public static void x(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                long longValue = ((Long) list.get(i4)).longValue();
                c0138m.M0(i3, (longValue >> 63) ^ (longValue << 1));
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            long longValue2 = ((Long) list.get(i6)).longValue();
            i5 += C0138m.s0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            long longValue3 = ((Long) list.get(i4)).longValue();
            c0138m.N0((longValue3 >> 63) ^ (longValue3 << 1));
            i4++;
        }
    }

    public static void y(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.K0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0138m.r0(((Integer) list.get(i6)).intValue());
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.L0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void z(int i3, List list, F f, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0138m c0138m = (C0138m) f.f2161a;
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                c0138m.M0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        c0138m.J0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += C0138m.s0(((Long) list.get(i6)).longValue());
        }
        c0138m.L0(i5);
        while (i4 < list.size()) {
            c0138m.N0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static Object j(Object obj, int i3, InterfaceC0148x interfaceC0148x, Object obj2, e0 e0Var) {
        return obj2;
    }
}
