package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f9146a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f9147b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f9148c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Q q7 = Q.f9136c;
        c0 c0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f9146a = cls;
        try {
            Q q8 = Q.f9136c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c0Var = (c0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f9147b = c0Var;
        f9148c = new c0();
    }

    public static void A(c0 c0Var, Object obj, Object obj2) {
        c0Var.getClass();
        AbstractC0696u abstractC0696u = (AbstractC0696u) obj;
        b0 b0Var = abstractC0696u.unknownFields;
        b0 b0Var2 = ((AbstractC0696u) obj2).unknownFields;
        b0 b0Var3 = b0.f9166f;
        if (!b0Var3.equals(b0Var2)) {
            if (b0Var3.equals(b0Var)) {
                int i7 = b0Var.f9167a + b0Var2.f9167a;
                int[] copyOf = Arrays.copyOf(b0Var.f9168b, i7);
                System.arraycopy(b0Var2.f9168b, 0, copyOf, b0Var.f9167a, b0Var2.f9167a);
                Object[] copyOf2 = Arrays.copyOf(b0Var.f9169c, i7);
                System.arraycopy(b0Var2.f9169c, 0, copyOf2, b0Var.f9167a, b0Var2.f9167a);
                b0Var = new b0(i7, copyOf, copyOf2, true);
            } else {
                b0Var.getClass();
                if (!b0Var2.equals(b0Var3)) {
                    if (!b0Var.f9171e) {
                        throw new UnsupportedOperationException();
                    }
                    int i8 = b0Var.f9167a + b0Var2.f9167a;
                    b0Var.a(i8);
                    System.arraycopy(b0Var2.f9168b, 0, b0Var.f9168b, b0Var.f9167a, b0Var2.f9167a);
                    System.arraycopy(b0Var2.f9169c, 0, b0Var.f9169c, b0Var.f9167a, b0Var2.f9167a);
                    b0Var.f9167a = i8;
                }
            }
        }
        abstractC0696u.unknownFields = b0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.T0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = C0687k.f9214r;
            i9++;
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.R0(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    public static void D(int i7, List list, D d7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((C0687k) d7.f9107a).U0(i7, (C0683g) list.get(i8));
        }
    }

    public static void E(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                c0687k.getClass();
                c0687k.Y0(i7, Double.doubleToRawLongBits(doubleValue));
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = C0687k.f9214r;
            i9 += 8;
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.Z0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void F(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.a1(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0687k.O0(((Integer) list.get(i10)).intValue());
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.b1(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void G(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.W0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0687k.f9214r;
            i9 += 4;
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.X0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void H(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.Y0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0687k.f9214r;
            i9 += 8;
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.Z0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void I(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                c0687k.getClass();
                c0687k.W0(i7, Float.floatToRawIntBits(floatValue));
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = C0687k.f9214r;
            i9 += 4;
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.X0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    public static void J(int i7, List list, D d7, U u4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            d7.h(i7, list.get(i8), u4);
        }
    }

    public static void K(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.a1(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0687k.O0(((Integer) list.get(i10)).intValue());
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.b1(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void L(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.h1(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0687k.O0(((Long) list.get(i10)).longValue());
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.i1(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void M(int i7, List list, D d7, U u4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            d7.k(i7, list.get(i8), u4);
        }
    }

    public static void N(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.W0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0687k.f9214r;
            i9 += 4;
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.X0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void O(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.Y0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0687k.f9214r;
            i9 += 8;
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.Z0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void P(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                int intValue = ((Integer) list.get(i8)).intValue();
                c0687k.f1(i7, (intValue >> 31) ^ (intValue << 1));
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            i9 += C0687k.M0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            int intValue3 = ((Integer) list.get(i8)).intValue();
            c0687k.g1((intValue3 >> 31) ^ (intValue3 << 1));
            i8++;
        }
    }

    public static void Q(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                long longValue = ((Long) list.get(i8)).longValue();
                c0687k.h1(i7, (longValue >> 63) ^ (longValue << 1));
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long longValue2 = ((Long) list.get(i10)).longValue();
            i9 += C0687k.O0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            long longValue3 = ((Long) list.get(i8)).longValue();
            c0687k.i1((longValue3 >> 63) ^ (longValue3 << 1));
            i8++;
        }
    }

    public static void R(int i7, List list, D d7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((C0687k) d7.f9107a).c1(i7, (String) list.get(i8));
        }
    }

    public static void S(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.f1(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0687k.M0(((Integer) list.get(i10)).intValue());
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.g1(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void T(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0687k c0687k = (C0687k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0687k.h1(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0687k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += C0687k.O0(((Long) list.get(i10)).longValue());
        }
        c0687k.g1(i9);
        while (i8 < list.size()) {
            c0687k.i1(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0687k.u0(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K02 = C0687k.K0(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int size2 = ((C0683g) list.get(i8)).size();
            K02 += C0687k.M0(size2) + size2;
        }
        return K02;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0687k.K0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0687k.O0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0687k.y0(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0687k.z0(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, U u4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0687k.B0(i7, (AbstractC0677a) list.get(i9), u4);
        }
        return i8;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0687k.K0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0687k.O0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0687k.K0(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0687k.O0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, U u4) {
        int K02 = C0687k.K0(i7);
        int a2 = ((AbstractC0677a) obj).a(u4);
        return C0687k.M0(a2) + a2 + K02;
    }

    public static int p(int i7, List list, U u4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K02 = C0687k.K0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int a2 = ((AbstractC0677a) list.get(i8)).a(u4);
            K02 += C0687k.M0(a2) + a2;
        }
        return K02;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0687k.K0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = ((Integer) list.get(i8)).intValue();
            i7 += C0687k.M0((intValue >> 31) ^ (intValue << 1));
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0687k.K0(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i7 += C0687k.O0((longValue >> 63) ^ (longValue << 1));
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int K02 = C0687k.K0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj instanceof C0683g) {
                int size2 = ((C0683g) obj).size();
                K02 = C0687k.M0(size2) + size2 + K02;
            } else {
                K02 = C0687k.J0((String) obj) + K02;
            }
        }
        return K02;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0687k.K0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0687k.M0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0687k.K0(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0687k.O0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static Object z(Object obj, int i7, InterfaceC0697v interfaceC0697v, Object obj2, c0 c0Var) {
        return obj2;
    }
}
