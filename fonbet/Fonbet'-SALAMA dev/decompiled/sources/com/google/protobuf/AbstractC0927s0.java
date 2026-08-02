package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0927s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f12269a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0 f12270b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0 f12271c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C0 c0 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f12269a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c0 = (C0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f12270b = c0;
        f12271c = new C0();
    }

    public static void A(C0 c0, Object obj, Object obj2) {
        c0.getClass();
        C c3 = (C) obj;
        B0 b02 = c3.unknownFields;
        B0 b03 = ((C) obj2).unknownFields;
        B0 b04 = B0.f12098f;
        if (!b04.equals(b03)) {
            if (b04.equals(b02)) {
                int i7 = b02.f12099a + b03.f12099a;
                int[] copyOf = Arrays.copyOf(b02.f12100b, i7);
                System.arraycopy(b03.f12100b, 0, copyOf, b02.f12099a, b03.f12099a);
                Object[] copyOf2 = Arrays.copyOf(b02.f12101c, i7);
                System.arraycopy(b03.f12101c, 0, copyOf2, b02.f12099a, b03.f12099a);
                b02 = new B0(i7, copyOf, copyOf2, true);
            } else {
                b02.getClass();
                if (!b03.equals(b04)) {
                    if (!b02.f12103e) {
                        throw new UnsupportedOperationException();
                    }
                    int i8 = b02.f12099a + b03.f12099a;
                    b02.a(i8);
                    System.arraycopy(b03.f12100b, 0, b02.f12100b, b02.f12099a, b03.f12099a);
                    System.arraycopy(b03.f12101c, 0, b02.f12101c, b02.f12099a, b03.f12099a);
                    b02.f12099a = i8;
                }
            }
        }
        c3.unknownFields = b02;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.w0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = AbstractC0923q.f12259d;
            i9++;
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.v0(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    public static void D(int i7, List list, X x4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((AbstractC0923q) x4.f12168a).y0(i7, (AbstractC0911k) list.get(i8));
        }
    }

    public static void E(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                abstractC0923q.getClass();
                abstractC0923q.C0(i7, Double.doubleToRawLongBits(doubleValue));
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = AbstractC0923q.f12259d;
            i9 += 8;
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.D0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void F(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.E0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0923q.h0(((Integer) list.get(i10)).intValue());
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.F0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void G(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.A0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = AbstractC0923q.f12259d;
            i9 += 4;
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.B0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void H(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.C0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = AbstractC0923q.f12259d;
            i9 += 8;
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.D0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void I(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                abstractC0923q.getClass();
                abstractC0923q.A0(i7, Float.floatToRawIntBits(floatValue));
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = AbstractC0923q.f12259d;
            i9 += 4;
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.B0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    public static void J(int i7, List list, X x4, InterfaceC0925r0 interfaceC0925r0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            x4.i(i7, list.get(i8), interfaceC0925r0);
        }
    }

    public static void K(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.E0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0923q.h0(((Integer) list.get(i10)).intValue());
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.F0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void L(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0923q.t0(((Long) list.get(i10)).longValue());
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.O0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void M(int i7, List list, X x4, InterfaceC0925r0 interfaceC0925r0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            x4.l(i7, list.get(i8), interfaceC0925r0);
        }
    }

    public static void N(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.A0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = AbstractC0923q.f12259d;
            i9 += 4;
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.B0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void O(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.C0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = AbstractC0923q.f12259d;
            i9 += 8;
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.D0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void P(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                int intValue = ((Integer) list.get(i8)).intValue();
                abstractC0923q.L0(i7, (intValue >> 31) ^ (intValue << 1));
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            i9 += AbstractC0923q.r0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            int intValue3 = ((Integer) list.get(i8)).intValue();
            abstractC0923q.M0((intValue3 >> 31) ^ (intValue3 << 1));
            i8++;
        }
    }

    public static void Q(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                long longValue = ((Long) list.get(i8)).longValue();
                abstractC0923q.N0(i7, (longValue >> 63) ^ (longValue << 1));
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long longValue2 = ((Long) list.get(i10)).longValue();
            i9 += AbstractC0923q.t0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            long longValue3 = ((Long) list.get(i8)).longValue();
            abstractC0923q.O0((longValue3 >> 63) ^ (longValue3 << 1));
            i8++;
        }
    }

    public static void R(int i7, List list, X x4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4.getClass();
        boolean z4 = list instanceof Q;
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.I0(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        Q q7 = (Q) list;
        while (i8 < list.size()) {
            Object d7 = q7.d(i8);
            if (d7 instanceof String) {
                abstractC0923q.I0(i7, (String) d7);
            } else {
                abstractC0923q.y0(i7, (AbstractC0911k) d7);
            }
            i8++;
        }
    }

    public static void S(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.L0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0923q.r0(((Integer) list.get(i10)).intValue());
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.M0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void T(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0923q abstractC0923q = (AbstractC0923q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0923q.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        abstractC0923q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += AbstractC0923q.t0(((Long) list.get(i10)).longValue());
        }
        abstractC0923q.M0(i9);
        while (i8 < list.size()) {
            abstractC0923q.O0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0923q.X(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p02 = AbstractC0923q.p0(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            p02 += AbstractC0923q.Z((AbstractC0911k) list.get(i8));
        }
        return p02;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0923q.p0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g3 = (G) list;
            i7 = 0;
            while (i8 < size) {
                g3.y(i8);
                i7 += AbstractC0923q.h0(g3.f12108b[i8]);
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC0923q.h0(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0923q.c0(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0923q.d0(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, InterfaceC0925r0 interfaceC0925r0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += AbstractC0923q.f0(i7, (AbstractC0891a) list.get(i9), interfaceC0925r0);
        }
        return i8;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0923q.p0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g3 = (G) list;
            i7 = 0;
            while (i8 < size) {
                g3.y(i8);
                i7 += AbstractC0923q.h0(g3.f12108b[i8]);
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC0923q.h0(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC0923q.p0(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof V) {
            V v6 = (V) list;
            if (size <= 0) {
                return 0;
            }
            v6.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0923q.t0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, InterfaceC0925r0 interfaceC0925r0) {
        int p02 = AbstractC0923q.p0(i7);
        int c3 = ((AbstractC0891a) obj).c(interfaceC0925r0);
        return AbstractC0923q.r0(c3) + c3 + p02;
    }

    public static int p(int i7, List list, InterfaceC0925r0 interfaceC0925r0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p02 = AbstractC0923q.p0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int c3 = ((AbstractC0891a) list.get(i8)).c(interfaceC0925r0);
            p02 += AbstractC0923q.r0(c3) + c3;
        }
        return p02;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0923q.p0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g3 = (G) list;
            i7 = 0;
            while (i8 < size) {
                g3.y(i8);
                int i9 = g3.f12108b[i8];
                i7 += AbstractC0923q.r0((i9 >> 31) ^ (i9 << 1));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                int intValue = ((Integer) list.get(i8)).intValue();
                i7 += AbstractC0923q.r0((intValue >> 31) ^ (intValue << 1));
                i8++;
            }
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0923q.p0(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof V) {
            V v6 = (V) list;
            if (size <= 0) {
                return 0;
            }
            v6.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i7 += AbstractC0923q.t0((longValue >> 63) ^ (longValue << 1));
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int p02 = AbstractC0923q.p0(i7) * size;
        if (list instanceof Q) {
            Q q7 = (Q) list;
            while (i8 < size) {
                Object d7 = q7.d(i8);
                p02 = (d7 instanceof AbstractC0911k ? AbstractC0923q.Z((AbstractC0911k) d7) : AbstractC0923q.o0((String) d7)) + p02;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                p02 = (obj instanceof AbstractC0911k ? AbstractC0923q.Z((AbstractC0911k) obj) : AbstractC0923q.o0((String) obj)) + p02;
                i8++;
            }
        }
        return p02;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0923q.p0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g3 = (G) list;
            i7 = 0;
            while (i8 < size) {
                g3.y(i8);
                i7 += AbstractC0923q.r0(g3.f12108b[i8]);
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC0923q.r0(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0923q.p0(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof V) {
            V v6 = (V) list;
            if (size <= 0) {
                return 0;
            }
            v6.y(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0923q.t0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static Object z(Object obj, int i7, List list, Object obj2, C0 c0) {
        return obj2;
    }
}
