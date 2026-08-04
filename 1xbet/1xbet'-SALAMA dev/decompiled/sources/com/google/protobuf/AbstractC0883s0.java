package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0883s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f12269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0 f12270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void A(C0 c0, Object obj, Object obj2) {
        c0.getClass();
        C c3 = (C) obj;
        B0 b7 = c3.unknownFields;
        B0 b8 = ((C) obj2).unknownFields;
        B0 b9 = B0.f12098f;
        if (!b9.equals(b8)) {
            if (b9.equals(b7)) {
                int i7 = b7.f12099a + b8.f12099a;
                int[] iArrCopyOf = Arrays.copyOf(b7.f12100b, i7);
                System.arraycopy(b8.f12100b, 0, iArrCopyOf, b7.f12099a, b8.f12099a);
                Object[] objArrCopyOf = Arrays.copyOf(b7.f12101c, i7);
                System.arraycopy(b8.f12101c, 0, objArrCopyOf, b7.f12099a, b8.f12099a);
                b7 = new B0(i7, iArrCopyOf, objArrCopyOf, true);
            } else {
                b7.getClass();
                if (!b8.equals(b9)) {
                    if (!b7.f12103e) {
                        throw new UnsupportedOperationException();
                    }
                    int i8 = b7.f12099a + b8.f12099a;
                    b7.a(i8);
                    System.arraycopy(b8.f12100b, 0, b7.f12100b, b7.f12099a, b8.f12099a);
                    System.arraycopy(b8.f12101c, 0, b7.f12101c, b7.f12099a, b8.f12099a);
                    b7.f12099a = i8;
                }
            }
        }
        c3.unknownFields = b7;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.w0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = AbstractC0879q.f12259d;
            i9++;
        }
        abstractC0879q.M0(i9);
        while (i8 < list.size()) {
            abstractC0879q.v0(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    public static void D(int i7, List list, X x4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((AbstractC0879q) x4.f12168a).y0(i7, (AbstractC0867k) list.get(i8));
        }
    }

    public static void E(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                double dDoubleValue = ((Double) list.get(i8)).doubleValue();
                abstractC0879q.getClass();
                abstractC0879q.C0(i7, Double.doubleToRawLongBits(dDoubleValue));
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = AbstractC0879q.f12259d;
            i9 += 8;
        }
        abstractC0879q.M0(i9);
        while (i8 < list.size()) {
            abstractC0879q.D0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void F(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.E0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int iH0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iH0 += AbstractC0879q.h0(((Integer) list.get(i9)).intValue());
        }
        abstractC0879q.M0(iH0);
        while (i8 < list.size()) {
            abstractC0879q.F0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void G(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.A0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = AbstractC0879q.f12259d;
            i9 += 4;
        }
        abstractC0879q.M0(i9);
        while (i8 < list.size()) {
            abstractC0879q.B0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void H(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.C0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = AbstractC0879q.f12259d;
            i9 += 8;
        }
        abstractC0879q.M0(i9);
        while (i8 < list.size()) {
            abstractC0879q.D0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void I(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                float fFloatValue = ((Float) list.get(i8)).floatValue();
                abstractC0879q.getClass();
                abstractC0879q.A0(i7, Float.floatToRawIntBits(fFloatValue));
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = AbstractC0879q.f12259d;
            i9 += 4;
        }
        abstractC0879q.M0(i9);
        while (i8 < list.size()) {
            abstractC0879q.B0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    public static void J(int i7, List list, X x4, InterfaceC0881r0 interfaceC0881r0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            x4.i(i7, list.get(i8), interfaceC0881r0);
        }
    }

    public static void K(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.E0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int iH0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iH0 += AbstractC0879q.h0(((Integer) list.get(i9)).intValue());
        }
        abstractC0879q.M0(iH0);
        while (i8 < list.size()) {
            abstractC0879q.F0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void L(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int iT0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iT0 += AbstractC0879q.t0(((Long) list.get(i9)).longValue());
        }
        abstractC0879q.M0(iT0);
        while (i8 < list.size()) {
            abstractC0879q.O0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void M(int i7, List list, X x4, InterfaceC0881r0 interfaceC0881r0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            x4.l(i7, list.get(i8), interfaceC0881r0);
        }
    }

    public static void N(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.A0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = AbstractC0879q.f12259d;
            i9 += 4;
        }
        abstractC0879q.M0(i9);
        while (i8 < list.size()) {
            abstractC0879q.B0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void O(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.C0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = AbstractC0879q.f12259d;
            i9 += 8;
        }
        abstractC0879q.M0(i9);
        while (i8 < list.size()) {
            abstractC0879q.D0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void P(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                abstractC0879q.L0(i7, (iIntValue >> 31) ^ (iIntValue << 1));
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int iR0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int iIntValue2 = ((Integer) list.get(i9)).intValue();
            iR0 += AbstractC0879q.r0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        abstractC0879q.M0(iR0);
        while (i8 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i8)).intValue();
            abstractC0879q.M0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i8++;
        }
    }

    public static void Q(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                long jLongValue = ((Long) list.get(i8)).longValue();
                abstractC0879q.N0(i7, (jLongValue >> 63) ^ (jLongValue << 1));
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int iT0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            long jLongValue2 = ((Long) list.get(i9)).longValue();
            iT0 += AbstractC0879q.t0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        abstractC0879q.M0(iT0);
        while (i8 < list.size()) {
            long jLongValue3 = ((Long) list.get(i8)).longValue();
            abstractC0879q.O0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i8++;
        }
    }

    public static void R(int i7, List list, X x4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        x4.getClass();
        boolean z4 = list instanceof Q;
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.I0(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        Q q7 = (Q) list;
        while (i8 < list.size()) {
            Object objD = q7.d(i8);
            if (objD instanceof String) {
                abstractC0879q.I0(i7, (String) objD);
            } else {
                abstractC0879q.y0(i7, (AbstractC0867k) objD);
            }
            i8++;
        }
    }

    public static void S(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.L0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int iR0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iR0 += AbstractC0879q.r0(((Integer) list.get(i9)).intValue());
        }
        abstractC0879q.M0(iR0);
        while (i8 < list.size()) {
            abstractC0879q.M0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void T(int i7, List list, X x4, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0879q abstractC0879q = (AbstractC0879q) x4.f12168a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                abstractC0879q.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        abstractC0879q.K0(i7, 2);
        int iT0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iT0 += AbstractC0879q.t0(((Long) list.get(i9)).longValue());
        }
        abstractC0879q.M0(iT0);
        while (i8 < list.size()) {
            abstractC0879q.O0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0879q.X(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = AbstractC0879q.p0(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iP0 += AbstractC0879q.Z((AbstractC0867k) list.get(i8));
        }
        return iP0;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0879q.p0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int iH0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g3 = (G) list;
            iH0 = 0;
            while (i7 < size) {
                g3.y(i7);
                iH0 += AbstractC0879q.h0(g3.f12108b[i7]);
                i7++;
            }
        } else {
            iH0 = 0;
            while (i7 < size) {
                iH0 += AbstractC0879q.h0(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iH0;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0879q.c0(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0879q.d0(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, InterfaceC0881r0 interfaceC0881r0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iF0 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iF0 += AbstractC0879q.f0(i7, (AbstractC0847a) list.get(i8), interfaceC0881r0);
        }
        return iF0;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0879q.p0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int iH0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g3 = (G) list;
            iH0 = 0;
            while (i7 < size) {
                g3.y(i7);
                iH0 += AbstractC0879q.h0(g3.f12108b[i7]);
                i7++;
            }
        } else {
            iH0 = 0;
            while (i7 < size) {
                iH0 += AbstractC0879q.h0(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iH0;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC0879q.p0(i7) * list.size()) + n(list);
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
        int iT0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iT0 += AbstractC0879q.t0(((Long) list.get(i7)).longValue());
        }
        return iT0;
    }

    public static int o(int i7, Object obj, InterfaceC0881r0 interfaceC0881r0) {
        int iP0 = AbstractC0879q.p0(i7);
        int iC = ((AbstractC0847a) obj).c(interfaceC0881r0);
        return AbstractC0879q.r0(iC) + iC + iP0;
    }

    public static int p(int i7, List list, InterfaceC0881r0 interfaceC0881r0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = AbstractC0879q.p0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int iC = ((AbstractC0847a) list.get(i8)).c(interfaceC0881r0);
            iP0 += AbstractC0879q.r0(iC) + iC;
        }
        return iP0;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0879q.p0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int iR0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g3 = (G) list;
            iR0 = 0;
            while (i7 < size) {
                g3.y(i7);
                int i8 = g3.f12108b[i7];
                iR0 += AbstractC0879q.r0((i8 >> 31) ^ (i8 << 1));
                i7++;
            }
        } else {
            iR0 = 0;
            while (i7 < size) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                iR0 += AbstractC0879q.r0((iIntValue >> 31) ^ (iIntValue << 1));
                i7++;
            }
        }
        return iR0;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0879q.p0(i7) * size) + t(list);
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
        int iT0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long jLongValue = ((Long) list.get(i7)).longValue();
            iT0 += AbstractC0879q.t0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iT0;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int iP0 = AbstractC0879q.p0(i7) * size;
        if (list instanceof Q) {
            Q q7 = (Q) list;
            while (i8 < size) {
                Object objD = q7.d(i8);
                iP0 = (objD instanceof AbstractC0867k ? AbstractC0879q.Z((AbstractC0867k) objD) : AbstractC0879q.o0((String) objD)) + iP0;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                iP0 = (obj instanceof AbstractC0867k ? AbstractC0879q.Z((AbstractC0867k) obj) : AbstractC0879q.o0((String) obj)) + iP0;
                i8++;
            }
        }
        return iP0;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0879q.p0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int iR0;
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g3 = (G) list;
            iR0 = 0;
            while (i7 < size) {
                g3.y(i7);
                iR0 += AbstractC0879q.r0(g3.f12108b[i7]);
                i7++;
            }
        } else {
            iR0 = 0;
            while (i7 < size) {
                iR0 += AbstractC0879q.r0(((Integer) list.get(i7)).intValue());
                i7++;
            }
        }
        return iR0;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0879q.p0(i7) * size) + y(list);
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
        int iT0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iT0 += AbstractC0879q.t0(((Long) list.get(i7)).longValue());
        }
        return iT0;
    }

    public static Object z(Object obj, int i7, List list, Object obj2, C0 c0) {
        return obj2;
    }
}
