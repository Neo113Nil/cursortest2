package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4402a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f4403b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f4404c;

    static {
        Class<?> cls;
        Class<?> cls2;
        S s2 = S.f4392c;
        d0 d0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4402a = cls;
        try {
            S s4 = S.f4392c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                d0Var = (d0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f4403b = d0Var;
        f4404c = new d0();
    }

    public static void A(d0 d0Var, Object obj, Object obj2) {
        d0Var.getClass();
        AbstractC0226v abstractC0226v = (AbstractC0226v) obj;
        c0 c0Var = abstractC0226v.unknownFields;
        c0 c0Var2 = ((AbstractC0226v) obj2).unknownFields;
        c0 c0Var3 = c0.f4422f;
        if (!c0Var3.equals(c0Var2)) {
            if (c0Var3.equals(c0Var)) {
                int i2 = c0Var.f4423a + c0Var2.f4423a;
                int[] copyOf = Arrays.copyOf(c0Var.f4424b, i2);
                System.arraycopy(c0Var2.f4424b, 0, copyOf, c0Var.f4423a, c0Var2.f4423a);
                Object[] copyOf2 = Arrays.copyOf(c0Var.f4425c, i2);
                System.arraycopy(c0Var2.f4425c, 0, copyOf2, c0Var.f4423a, c0Var2.f4423a);
                c0Var = new c0(i2, copyOf, copyOf2, true);
            } else {
                c0Var.getClass();
                if (!c0Var2.equals(c0Var3)) {
                    if (!c0Var.f4427e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = c0Var.f4423a + c0Var2.f4423a;
                    c0Var.a(i3);
                    System.arraycopy(c0Var2.f4424b, 0, c0Var.f4424b, c0Var.f4423a, c0Var2.f4423a);
                    System.arraycopy(c0Var2.f4425c, 0, c0Var.f4425c, c0Var.f4423a, c0Var2.f4423a);
                    c0Var.f4423a = i3;
                }
            }
        }
        abstractC0226v.unknownFields = c0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.i0(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            Logger logger = C0217l.f4467h;
            i6++;
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.g0(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static void D(int i2, List list, E e3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C0217l) e3.f4362a).j0(i2, (C0212g) list.get(i3));
        }
    }

    public static void E(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                double doubleValue = ((Double) list.get(i3)).doubleValue();
                c0217l.getClass();
                c0217l.n0(i2, Double.doubleToRawLongBits(doubleValue));
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            Logger logger = C0217l.f4467h;
            i6 += 8;
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.o0(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void F(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.p0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0217l.d0(((Integer) list.get(i7)).intValue());
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.q0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void G(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.l0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0217l.f4467h;
            i6 += 4;
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.m0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void H(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.n0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0217l.f4467h;
            i6 += 8;
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.o0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void I(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                float floatValue = ((Float) list.get(i3)).floatValue();
                c0217l.getClass();
                c0217l.l0(i2, Float.floatToRawIntBits(floatValue));
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            Logger logger = C0217l.f4467h;
            i6 += 4;
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.m0(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void J(int i2, List list, E e3, V v4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            e3.h(i2, list.get(i3), v4);
        }
    }

    public static void K(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.p0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0217l.d0(((Integer) list.get(i7)).intValue());
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.q0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void L(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.w0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0217l.d0(((Long) list.get(i7)).longValue());
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.x0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void M(int i2, List list, E e3, V v4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            e3.k(i2, list.get(i3), v4);
        }
    }

    public static void N(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.l0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            Logger logger = C0217l.f4467h;
            i6 += 4;
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.m0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void O(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.n0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            Logger logger = C0217l.f4467h;
            i6 += 8;
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.o0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void P(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                int intValue = ((Integer) list.get(i3)).intValue();
                c0217l.u0(i2, (intValue >> 31) ^ (intValue << 1));
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue2 = ((Integer) list.get(i7)).intValue();
            i6 += C0217l.b0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            int intValue3 = ((Integer) list.get(i3)).intValue();
            c0217l.v0((intValue3 >> 31) ^ (intValue3 << 1));
            i3++;
        }
    }

    public static void Q(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                long longValue = ((Long) list.get(i3)).longValue();
                c0217l.w0(i2, (longValue >> 63) ^ (longValue << 1));
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((Long) list.get(i7)).longValue();
            i6 += C0217l.d0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            long longValue3 = ((Long) list.get(i3)).longValue();
            c0217l.x0((longValue3 >> 63) ^ (longValue3 << 1));
            i3++;
        }
    }

    public static void R(int i2, List list, E e3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e3.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C0217l) e3.f4362a).r0(i2, (String) list.get(i3));
        }
    }

    public static void S(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.u0(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0217l.b0(((Integer) list.get(i7)).intValue());
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.v0(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void T(int i2, List list, E e3, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0217l c0217l = (C0217l) e3.f4362a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                c0217l.w0(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0217l.t0(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C0217l.d0(((Long) list.get(i7)).longValue());
        }
        c0217l.v0(i6);
        while (i3 < list.size()) {
            c0217l.x0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static int a(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0217l.J(i2) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Z2 = C0217l.Z(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size2 = ((C0212g) list.get(i3)).size();
            Z2 += C0217l.b0(size2) + size2;
        }
        return Z2;
    }

    public static int d(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0217l.Z(i2) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0217l.d0(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int f(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0217l.N(i2) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0217l.O(i2) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i2, List list, V v4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i3 += C0217l.Q(i2, (AbstractC0206a) list.get(i6), v4);
        }
        return i3;
    }

    public static int k(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0217l.Z(i2) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0217l.d0(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int m(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0217l.Z(i2) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0217l.d0(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static int o(int i2, Object obj, V v4) {
        int Z2 = C0217l.Z(i2);
        int a6 = ((AbstractC0206a) obj).a(v4);
        return C0217l.b0(a6) + a6 + Z2;
    }

    public static int p(int i2, List list, V v4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Z2 = C0217l.Z(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            int a6 = ((AbstractC0206a) list.get(i3)).a(v4);
            Z2 += C0217l.b0(a6) + a6;
        }
        return Z2;
    }

    public static int q(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0217l.Z(i2) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((Integer) list.get(i3)).intValue();
            i2 += C0217l.b0((intValue >> 31) ^ (intValue << 1));
        }
        return i2;
    }

    public static int s(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0217l.Z(i2) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long longValue = ((Long) list.get(i3)).longValue();
            i2 += C0217l.d0((longValue >> 63) ^ (longValue << 1));
        }
        return i2;
    }

    public static int u(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Z2 = C0217l.Z(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C0212g) {
                int size2 = ((C0212g) obj).size();
                Z2 = C0217l.b0(size2) + size2 + Z2;
            } else {
                Z2 = C0217l.Y((String) obj) + Z2;
            }
        }
        return Z2;
    }

    public static int v(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0217l.Z(i2) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0217l.b0(((Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int x(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0217l.Z(i2) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0217l.d0(((Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static Object z(Object obj, int i2, InterfaceC0227w interfaceC0227w, Object obj2, d0 d0Var) {
        return obj2;
    }
}
