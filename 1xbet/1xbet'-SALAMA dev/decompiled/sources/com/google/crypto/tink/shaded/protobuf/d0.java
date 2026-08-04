package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f11764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f11765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f11766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
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
    public static void B(g0 g0Var, Object obj, Object obj2) {
        g0Var.getClass();
        AbstractC0842w abstractC0842w = (AbstractC0842w) obj;
        f0 f0Var = abstractC0842w.unknownFields;
        f0 f0Var2 = ((AbstractC0842w) obj2).unknownFields;
        f0 f0Var3 = f0.f11769f;
        if (!f0Var3.equals(f0Var2)) {
            if (f0Var3.equals(f0Var)) {
                int i7 = f0Var.f11770a + f0Var2.f11770a;
                int[] iArrCopyOf = Arrays.copyOf(f0Var.f11771b, i7);
                System.arraycopy(f0Var2.f11771b, 0, iArrCopyOf, f0Var.f11770a, f0Var2.f11770a);
                Object[] objArrCopyOf = Arrays.copyOf(f0Var.f11772c, i7);
                System.arraycopy(f0Var2.f11772c, 0, objArrCopyOf, f0Var.f11770a, f0Var2.f11770a);
                f0Var = new f0(i7, iArrCopyOf, objArrCopyOf, true);
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
        abstractC0842w.unknownFields = f0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                boolean zBooleanValue = ((Boolean) list.get(i8)).booleanValue();
                c0832l.L0(i7, 0);
                c0832l.E0(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c0832l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = C0832l.f11798k;
            i9++;
        }
        c0832l.M0(i9);
        for (int i11 = 0; i11 < list.size(); i11++) {
            c0832l.E0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void E(int i7, List list, L l7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            AbstractC0829i abstractC0829i = (AbstractC0829i) list.get(i8);
            C0832l c0832l = (C0832l) l7.f11722a;
            c0832l.L0(i7, 2);
            c0832l.M0(abstractC0829i.size());
            C0828h c0828h = (C0828h) abstractC0829i;
            c0832l.F0(c0828h.f11777d, c0828h.A(), c0828h.size());
        }
    }

    public static void F(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                double dDoubleValue = ((Double) list.get(i8)).doubleValue();
                c0832l.getClass();
                c0832l.I0(i7, Double.doubleToRawLongBits(dDoubleValue));
                i8++;
            }
            return;
        }
        c0832l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = C0832l.f11798k;
            i9 += 8;
        }
        c0832l.M0(i9);
        while (i8 < list.size()) {
            c0832l.J0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void G(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                c0832l.L0(i7, 0);
                c0832l.K0(iIntValue);
            }
            return;
        }
        c0832l.L0(i7, 2);
        int iR0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iR0 += C0832l.r0(((Integer) list.get(i9)).intValue());
        }
        c0832l.M0(iR0);
        for (int i10 = 0; i10 < list.size(); i10++) {
            c0832l.K0(((Integer) list.get(i10)).intValue());
        }
    }

    public static void H(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0832l.G0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0832l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0832l.f11798k;
            i9 += 4;
        }
        c0832l.M0(i9);
        while (i8 < list.size()) {
            c0832l.H0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void I(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0832l.I0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0832l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0832l.f11798k;
            i9 += 8;
        }
        c0832l.M0(i9);
        while (i8 < list.size()) {
            c0832l.J0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void J(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                float fFloatValue = ((Float) list.get(i8)).floatValue();
                c0832l.getClass();
                c0832l.G0(i7, Float.floatToRawIntBits(fFloatValue));
                i8++;
            }
            return;
        }
        c0832l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = C0832l.f11798k;
            i9 += 4;
        }
        c0832l.M0(i9);
        while (i8 < list.size()) {
            c0832l.H0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
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
        C0832l c0832l = (C0832l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                c0832l.L0(i7, 0);
                c0832l.K0(iIntValue);
            }
            return;
        }
        c0832l.L0(i7, 2);
        int iR0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iR0 += C0832l.r0(((Integer) list.get(i9)).intValue());
        }
        c0832l.M0(iR0);
        for (int i10 = 0; i10 < list.size(); i10++) {
            c0832l.K0(((Integer) list.get(i10)).intValue());
        }
    }

    public static void M(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0832l.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0832l.L0(i7, 2);
        int iD0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iD0 += C0832l.D0(((Long) list.get(i9)).longValue());
        }
        c0832l.M0(iD0);
        while (i8 < list.size()) {
            c0832l.O0(((Long) list.get(i8)).longValue());
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
        C0832l c0832l = (C0832l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0832l.G0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0832l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0832l.f11798k;
            i9 += 4;
        }
        c0832l.M0(i9);
        while (i8 < list.size()) {
            c0832l.H0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void P(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0832l.I0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0832l.L0(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0832l.f11798k;
            i9 += 8;
        }
        c0832l.M0(i9);
        while (i8 < list.size()) {
            c0832l.J0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void Q(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                c0832l.L0(i7, 0);
                c0832l.M0((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        c0832l.L0(i7, 2);
        int iB0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int iIntValue2 = ((Integer) list.get(i9)).intValue();
            iB0 += C0832l.B0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0832l.M0(iB0);
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            c0832l.M0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void R(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                long jLongValue = ((Long) list.get(i8)).longValue();
                c0832l.N0(i7, (jLongValue >> 63) ^ (jLongValue << 1));
                i8++;
            }
            return;
        }
        c0832l.L0(i7, 2);
        int iD0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            long jLongValue2 = ((Long) list.get(i9)).longValue();
            iD0 += C0832l.D0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0832l.M0(iD0);
        while (i8 < list.size()) {
            long jLongValue3 = ((Long) list.get(i8)).longValue();
            c0832l.O0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i8++;
        }
    }

    public static void S(int i7, List list, L l7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l7.getClass();
        boolean z4 = list instanceof F;
        C0832l c0832l = (C0832l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                String str = (String) list.get(i8);
                c0832l.L0(i7, 2);
                int i9 = c0832l.j;
                try {
                    int iB0 = C0832l.B0(str.length() * 3);
                    int iB1 = C0832l.B0(str.length());
                    byte[] bArr = c0832l.f11801h;
                    int i10 = c0832l.f11802i;
                    if (iB1 == iB0) {
                        int i11 = i9 + iB1;
                        c0832l.j = i11;
                        int iX = r0.f11823a.x(str, bArr, i11, i10 - i11);
                        c0832l.j = i9;
                        c0832l.M0((iX - i9) - iB1);
                        c0832l.j = iX;
                    } else {
                        c0832l.M0(r0.b(str));
                        int i12 = c0832l.j;
                        c0832l.j = r0.f11823a.x(str, bArr, i12, i10 - i12);
                    }
                } catch (q0 e7) {
                    c0832l.j = i9;
                    C0832l.f11798k.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
                    byte[] bytes = str.getBytes(A.f11702a);
                    try {
                        c0832l.M0(bytes.length);
                        c0832l.F0(bytes, 0, bytes.length);
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
            Object objD = f7.d(i13);
            if (objD instanceof String) {
                String str2 = (String) objD;
                c0832l.L0(i7, 2);
                int i14 = c0832l.j;
                try {
                    int iB2 = C0832l.B0(str2.length() * 3);
                    int iB3 = C0832l.B0(str2.length());
                    byte[] bArr2 = c0832l.f11801h;
                    int i15 = c0832l.f11802i;
                    if (iB3 == iB2) {
                        int i16 = i14 + iB3;
                        c0832l.j = i16;
                        int iX2 = r0.f11823a.x(str2, bArr2, i16, i15 - i16);
                        c0832l.j = i14;
                        c0832l.M0((iX2 - i14) - iB3);
                        c0832l.j = iX2;
                    } else {
                        c0832l.M0(r0.b(str2));
                        int i17 = c0832l.j;
                        c0832l.j = r0.f11823a.x(str2, bArr2, i17, i15 - i17);
                    }
                } catch (q0 e10) {
                    c0832l.j = i14;
                    C0832l.f11798k.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
                    byte[] bytes2 = str2.getBytes(A.f11702a);
                    try {
                        c0832l.M0(bytes2.length);
                        c0832l.F0(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e11) {
                        throw new Z4.b(e11);
                    }
                } catch (IndexOutOfBoundsException e12) {
                    throw new Z4.b(e12);
                }
            } else {
                AbstractC0829i abstractC0829i = (AbstractC0829i) objD;
                c0832l.L0(i7, 2);
                c0832l.M0(abstractC0829i.size());
                C0828h c0828h = (C0828h) abstractC0829i;
                c0832l.F0(c0828h.f11777d, c0828h.A(), c0828h.size());
            }
        }
    }

    public static void T(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        if (!z4) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                c0832l.L0(i7, 0);
                c0832l.M0(iIntValue);
            }
            return;
        }
        c0832l.L0(i7, 2);
        int iB0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iB0 += C0832l.B0(((Integer) list.get(i9)).intValue());
        }
        c0832l.M0(iB0);
        for (int i10 = 0; i10 < list.size(); i10++) {
            c0832l.M0(((Integer) list.get(i10)).intValue());
        }
    }

    public static void U(int i7, List list, L l7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0832l c0832l = (C0832l) l7.f11722a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0832l.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0832l.L0(i7, 2);
        int iD0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iD0 += C0832l.D0(((Long) list.get(i9)).longValue());
        }
        c0832l.M0(iD0);
        while (i8 < list.size()) {
            c0832l.O0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0832l.h0(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ0 = C0832l.z0(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iZ0 += C0832l.j0((AbstractC0829i) list.get(i8));
        }
        return iZ0;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0832l.z0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0843x) {
            AbstractC0843x abstractC0843x = (AbstractC0843x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0843x.y(0);
            throw null;
        }
        int iR0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iR0 += C0832l.r0(((Integer) list.get(i7)).intValue());
        }
        return iR0;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0832l.m0(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0832l.n0(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP0 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iP0 += C0832l.p0(i7, (AbstractC0821a) list.get(i8), c0Var);
        }
        return iP0;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0832l.z0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0843x) {
            AbstractC0843x abstractC0843x = (AbstractC0843x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0843x.y(0);
            throw null;
        }
        int iR0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iR0 += C0832l.r0(((Integer) list.get(i7)).intValue());
        }
        return iR0;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0832l.z0(i7) * list.size()) + n(list);
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
        int iD0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iD0 += C0832l.D0(((Long) list.get(i7)).longValue());
        }
        return iD0;
    }

    public static int o(int i7, Object obj, c0 c0Var) {
        int iZ0 = C0832l.z0(i7);
        int iB = ((AbstractC0821a) obj).b(c0Var);
        return C0832l.B0(iB) + iB + iZ0;
    }

    public static int p(int i7, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ0 = C0832l.z0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int iB = ((AbstractC0821a) list.get(i8)).b(c0Var);
            iZ0 += C0832l.B0(iB) + iB;
        }
        return iZ0;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0832l.z0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0843x) {
            AbstractC0843x abstractC0843x = (AbstractC0843x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0843x.y(0);
            throw null;
        }
        int iB0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            int iIntValue = ((Integer) list.get(i7)).intValue();
            iB0 += C0832l.B0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iB0;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0832l.z0(i7) * size) + t(list);
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
        int iD0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long jLongValue = ((Long) list.get(i7)).longValue();
            iD0 += C0832l.D0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iD0;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int iZ0 = C0832l.z0(i7) * size;
        if (list instanceof F) {
            F f7 = (F) list;
            while (i8 < size) {
                Object objD = f7.d(i8);
                iZ0 = (objD instanceof AbstractC0829i ? C0832l.j0((AbstractC0829i) objD) : C0832l.y0((String) objD)) + iZ0;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                iZ0 = (obj instanceof AbstractC0829i ? C0832l.j0((AbstractC0829i) obj) : C0832l.y0((String) obj)) + iZ0;
                i8++;
            }
        }
        return iZ0;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0832l.z0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0843x) {
            AbstractC0843x abstractC0843x = (AbstractC0843x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0843x.y(0);
            throw null;
        }
        int iB0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iB0 += C0832l.B0(((Integer) list.get(i7)).intValue());
        }
        return iB0;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0832l.z0(i7) * size) + y(list);
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
        int iD0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iD0 += C0832l.D0(((Long) list.get(i7)).longValue());
        }
        return iD0;
    }

    public static Object z(Object obj, int i7, List list, Object obj2, g0 g0Var) {
        return obj2;
    }
}
