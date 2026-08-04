package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f9146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f9147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
    public static void A(c0 c0Var, Object obj, Object obj2) {
        c0Var.getClass();
        AbstractC0675u abstractC0675u = (AbstractC0675u) obj;
        b0 b0Var = abstractC0675u.unknownFields;
        b0 b0Var2 = ((AbstractC0675u) obj2).unknownFields;
        b0 b0Var3 = b0.f9166f;
        if (!b0Var3.equals(b0Var2)) {
            if (b0Var3.equals(b0Var)) {
                int i7 = b0Var.f9167a + b0Var2.f9167a;
                int[] iArrCopyOf = Arrays.copyOf(b0Var.f9168b, i7);
                System.arraycopy(b0Var2.f9168b, 0, iArrCopyOf, b0Var.f9167a, b0Var2.f9167a);
                Object[] objArrCopyOf = Arrays.copyOf(b0Var.f9169c, i7);
                System.arraycopy(b0Var2.f9169c, 0, objArrCopyOf, b0Var.f9167a, b0Var2.f9167a);
                b0Var = new b0(i7, iArrCopyOf, objArrCopyOf, true);
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
        abstractC0675u.unknownFields = b0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.T0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            Logger logger = C0666k.f9214r;
            i9++;
        }
        c0666k.g1(i9);
        while (i8 < list.size()) {
            c0666k.R0(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    public static void D(int i7, List list, D d7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((C0666k) d7.f9107a).U0(i7, (C0662g) list.get(i8));
        }
    }

    public static void E(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                double dDoubleValue = ((Double) list.get(i8)).doubleValue();
                c0666k.getClass();
                c0666k.Y0(i7, Double.doubleToRawLongBits(dDoubleValue));
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            Logger logger = C0666k.f9214r;
            i9 += 8;
        }
        c0666k.g1(i9);
        while (i8 < list.size()) {
            c0666k.Z0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    public static void F(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.a1(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int iO0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iO0 += C0666k.O0(((Integer) list.get(i9)).intValue());
        }
        c0666k.g1(iO0);
        while (i8 < list.size()) {
            c0666k.b1(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void G(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.W0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0666k.f9214r;
            i9 += 4;
        }
        c0666k.g1(i9);
        while (i8 < list.size()) {
            c0666k.X0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void H(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.Y0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0666k.f9214r;
            i9 += 8;
        }
        c0666k.g1(i9);
        while (i8 < list.size()) {
            c0666k.Z0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void I(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                float fFloatValue = ((Float) list.get(i8)).floatValue();
                c0666k.getClass();
                c0666k.W0(i7, Float.floatToRawIntBits(fFloatValue));
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            Logger logger = C0666k.f9214r;
            i9 += 4;
        }
        c0666k.g1(i9);
        while (i8 < list.size()) {
            c0666k.X0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
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
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.a1(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int iO0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iO0 += C0666k.O0(((Integer) list.get(i9)).intValue());
        }
        c0666k.g1(iO0);
        while (i8 < list.size()) {
            c0666k.b1(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void L(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.h1(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int iO0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iO0 += C0666k.O0(((Long) list.get(i9)).longValue());
        }
        c0666k.g1(iO0);
        while (i8 < list.size()) {
            c0666k.i1(((Long) list.get(i8)).longValue());
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
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.W0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            Logger logger = C0666k.f9214r;
            i9 += 4;
        }
        c0666k.g1(i9);
        while (i8 < list.size()) {
            c0666k.X0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void O(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.Y0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            Logger logger = C0666k.f9214r;
            i9 += 8;
        }
        c0666k.g1(i9);
        while (i8 < list.size()) {
            c0666k.Z0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static void P(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                int iIntValue = ((Integer) list.get(i8)).intValue();
                c0666k.f1(i7, (iIntValue >> 31) ^ (iIntValue << 1));
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int iM0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            int iIntValue2 = ((Integer) list.get(i9)).intValue();
            iM0 += C0666k.M0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0666k.g1(iM0);
        while (i8 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i8)).intValue();
            c0666k.g1((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i8++;
        }
    }

    public static void Q(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                long jLongValue = ((Long) list.get(i8)).longValue();
                c0666k.h1(i7, (jLongValue >> 63) ^ (jLongValue << 1));
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int iO0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            long jLongValue2 = ((Long) list.get(i9)).longValue();
            iO0 += C0666k.O0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0666k.g1(iO0);
        while (i8 < list.size()) {
            long jLongValue3 = ((Long) list.get(i8)).longValue();
            c0666k.i1((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i8++;
        }
    }

    public static void R(int i7, List list, D d7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        d7.getClass();
        for (int i8 = 0; i8 < list.size(); i8++) {
            ((C0666k) d7.f9107a).c1(i7, (String) list.get(i8));
        }
    }

    public static void S(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.f1(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int iM0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iM0 += C0666k.M0(((Integer) list.get(i9)).intValue());
        }
        c0666k.g1(iM0);
        while (i8 < list.size()) {
            c0666k.g1(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    public static void T(int i7, List list, D d7, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0666k c0666k = (C0666k) d7.f9107a;
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                c0666k.h1(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        c0666k.e1(i7, 2);
        int iO0 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iO0 += C0666k.O0(((Long) list.get(i9)).longValue());
        }
        c0666k.g1(iO0);
        while (i8 < list.size()) {
            c0666k.i1(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0666k.u0(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = C0666k.K0(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int size2 = ((C0662g) list.get(i8)).size();
            iK0 += C0666k.M0(size2) + size2;
        }
        return iK0;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0666k.K0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iO0 += C0666k.O0(((Integer) list.get(i7)).intValue());
        }
        return iO0;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0666k.y0(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0666k.z0(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, U u4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iB0 += C0666k.B0(i7, (AbstractC0656a) list.get(i8), u4);
        }
        return iB0;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0666k.K0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iO0 += C0666k.O0(((Integer) list.get(i7)).intValue());
        }
        return iO0;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0666k.K0(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iO0 += C0666k.O0(((Long) list.get(i7)).longValue());
        }
        return iO0;
    }

    public static int o(int i7, Object obj, U u4) {
        int iK0 = C0666k.K0(i7);
        int iA = ((AbstractC0656a) obj).a(u4);
        return C0666k.M0(iA) + iA + iK0;
    }

    public static int p(int i7, List list, U u4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = C0666k.K0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int iA = ((AbstractC0656a) list.get(i8)).a(u4);
            iK0 += C0666k.M0(iA) + iA;
        }
        return iK0;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0666k.K0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            int iIntValue = ((Integer) list.get(i7)).intValue();
            iM0 += C0666k.M0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM0;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0666k.K0(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long jLongValue = ((Long) list.get(i7)).longValue();
            iO0 += C0666k.O0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iO0;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK0 = C0666k.K0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj instanceof C0662g) {
                int size2 = ((C0662g) obj).size();
                iK0 = C0666k.M0(size2) + size2 + iK0;
            } else {
                iK0 = C0666k.J0((String) obj) + iK0;
            }
        }
        return iK0;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0666k.K0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iM0 += C0666k.M0(((Integer) list.get(i7)).intValue());
        }
        return iM0;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0666k.K0(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO0 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iO0 += C0666k.O0(((Long) list.get(i7)).longValue());
        }
        return iO0;
    }

    public static Object z(Object obj, int i7, InterfaceC0676v interfaceC0676v, Object obj2, c0 c0Var) {
        return obj2;
    }
}
