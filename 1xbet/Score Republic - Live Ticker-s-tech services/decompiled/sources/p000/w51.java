package p000;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w51 {

    /* JADX INFO: renamed from: a */
    public static final Class f8434a;

    /* JADX INFO: renamed from: b */
    public static final qf1 f8435b;

    /* JADX INFO: renamed from: c */
    public static final qf1 f8436c;

    static {
        Class<?> cls;
        Class<?> cls2;
        fy0 fy0Var = fy0.f2536c;
        qf1 qf1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8434a = cls;
        try {
            fy0 fy0Var2 = fy0.f2536c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                qf1Var = (qf1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f8435b = qf1Var;
        f8436c = new qf1();
    }

    /* JADX INFO: renamed from: a */
    public static int m5257a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2874j = 0;
        for (int i = 0; i < size; i++) {
            iM2874j += C0360ji.m2874j(((Integer) list.get(i)).intValue());
        }
        return iM2874j;
    }

    /* JADX INFO: renamed from: b */
    public static int m5258b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0360ji.m2872h(i) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m5259c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0360ji.m2872h(i) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m5260d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2874j = 0;
        for (int i = 0; i < size; i++) {
            iM2874j += C0360ji.m2874j(((Integer) list.get(i)).intValue());
        }
        return iM2874j;
    }

    /* JADX INFO: renamed from: e */
    public static int m5261e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2874j = 0;
        for (int i = 0; i < size; i++) {
            iM2874j += C0360ji.m2874j(((Long) list.get(i)).longValue());
        }
        return iM2874j;
    }

    /* JADX INFO: renamed from: f */
    public static int m5262f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2873i = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iM2873i += C0360ji.m2873i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM2873i;
    }

    /* JADX INFO: renamed from: g */
    public static int m5263g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2874j = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM2874j += C0360ji.m2874j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM2874j;
    }

    /* JADX INFO: renamed from: h */
    public static int m5264h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2873i = 0;
        for (int i = 0; i < size; i++) {
            iM2873i += C0360ji.m2873i(((Integer) list.get(i)).intValue());
        }
        return iM2873i;
    }

    /* JADX INFO: renamed from: i */
    public static int m5265i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM2874j = 0;
        for (int i = 0; i < size; i++) {
            iM2874j += C0360ji.m2874j(((Long) list.get(i)).longValue());
        }
        return iM2874j;
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
    /* JADX INFO: renamed from: k */
    public static void m5267k(qf1 qf1Var, Object obj, Object obj2) {
        qf1Var.getClass();
        t70 t70Var = (t70) obj;
        of1 of1Var = t70Var.unknownFields;
        of1 of1Var2 = ((t70) obj2).unknownFields;
        of1 of1Var3 = of1.f5717f;
        if (!of1Var3.equals(of1Var2)) {
            if (of1Var3.equals(of1Var)) {
                int i = of1Var.f5718a + of1Var2.f5718a;
                int[] iArrCopyOf = Arrays.copyOf(of1Var.f5719b, i);
                System.arraycopy(of1Var2.f5719b, 0, iArrCopyOf, of1Var.f5718a, of1Var2.f5718a);
                Object[] objArrCopyOf = Arrays.copyOf(of1Var.f5720c, i);
                System.arraycopy(of1Var2.f5720c, 0, objArrCopyOf, of1Var.f5718a, of1Var2.f5718a);
                of1Var = new of1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                of1Var.getClass();
                if (!of1Var2.equals(of1Var3)) {
                    if (!of1Var.f5722e) {
                        dd0.m1164i();
                        return;
                    }
                    int i2 = of1Var.f5718a + of1Var2.f5718a;
                    of1Var.m3687a(i2);
                    System.arraycopy(of1Var2.f5719b, 0, of1Var.f5719b, of1Var.f5718a, of1Var2.f5718a);
                    System.arraycopy(of1Var2.f5720c, 0, of1Var.f5720c, of1Var.f5718a, of1Var2.f5718a);
                    of1Var.f5718a = i2;
                }
            }
        }
        t70Var.unknownFields = of1Var;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m5268l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m5269m(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2890o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C0360ji.f3932f;
            i3++;
        }
        c0360ji.m2878D(i3);
        while (i2 < list.size()) {
            c0360ji.m2888m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m5270n(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c0360ji.getClass();
                c0360ji.m2895t(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C0360ji.f3932f;
            i3 += 8;
        }
        c0360ji.m2878D(i3);
        while (i2 < list.size()) {
            c0360ji.m2896u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m5271o(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2897v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int iM2874j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM2874j += C0360ji.m2874j(((Integer) list.get(i3)).intValue());
        }
        c0360ji.m2878D(iM2874j);
        while (i2 < list.size()) {
            c0360ji.m2898w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m5272p(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2893r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0360ji.f3932f;
            i3 += 4;
        }
        c0360ji.m2878D(i3);
        while (i2 < list.size()) {
            c0360ji.m2894s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m5273q(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2895t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0360ji.f3932f;
            i3 += 8;
        }
        c0360ji.m2878D(i3);
        while (i2 < list.size()) {
            c0360ji.m2896u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m5274r(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c0360ji.getClass();
                c0360ji.m2893r(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C0360ji.f3932f;
            i3 += 4;
        }
        c0360ji.m2878D(i3);
        while (i2 < list.size()) {
            c0360ji.m2894s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m5275s(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2897v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int iM2874j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM2874j += C0360ji.m2874j(((Integer) list.get(i3)).intValue());
        }
        c0360ji.m2878D(iM2874j);
        while (i2 < list.size()) {
            c0360ji.m2898w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m5276t(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2879E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int iM2874j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM2874j += C0360ji.m2874j(((Long) list.get(i3)).longValue());
        }
        c0360ji.m2878D(iM2874j);
        while (i2 < list.size()) {
            c0360ji.m2880F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5277u(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2893r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C0360ji.f3932f;
            i3 += 4;
        }
        c0360ji.m2878D(i3);
        while (i2 < list.size()) {
            c0360ji.m2894s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m5278v(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2895t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C0360ji.f3932f;
            i3 += 8;
        }
        c0360ji.m2878D(i3);
        while (i2 < list.size()) {
            c0360ji.m2896u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m5279w(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c0360ji.m2877C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int iM2873i = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM2873i += C0360ji.m2873i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0360ji.m2878D(iM2873i);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c0360ji.m2878D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m5280x(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c0360ji.m2879E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int iM2874j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM2874j += C0360ji.m2874j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0360ji.m2878D(iM2874j);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c0360ji.m2880F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m5281y(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2877C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int iM2873i = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM2873i += C0360ji.m2873i(((Integer) list.get(i3)).intValue());
        }
        c0360ji.m2878D(iM2873i);
        while (i2 < list.size()) {
            c0360ji.m2878D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m5282z(int i, List list, nu1 nu1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0360ji c0360ji = (C0360ji) nu1Var.f5551k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c0360ji.m2879E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0360ji.m2876B(i, 2);
        int iM2874j = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM2874j += C0360ji.m2874j(((Long) list.get(i3)).longValue());
        }
        c0360ji.m2878D(iM2874j);
        while (i2 < list.size()) {
            c0360ji.m2880F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static Object m5266j(Object obj, int i, ee0 ee0Var, Object obj2, qf1 qf1Var) {
        return obj2;
    }
}
