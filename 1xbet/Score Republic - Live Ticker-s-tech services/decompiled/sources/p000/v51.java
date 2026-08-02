package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v51 {

    /* JADX INFO: renamed from: a */
    public static final Class f8095a;

    /* JADX INFO: renamed from: b */
    public static final pf1 f8096b;

    /* JADX INFO: renamed from: c */
    public static final pf1 f8097c;

    static {
        Class<?> cls;
        Class<?> cls2;
        pf1 pf1Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f8095a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                pf1Var = (pf1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f8096b = pf1Var;
        f8097c = new pf1();
    }

    /* JADX INFO: renamed from: a */
    public static int m5077a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3031a = 0;
        for (int i = 0; i < size; i++) {
            iM3031a += AbstractC0397ki.m3031a(((Integer) list.get(i)).intValue());
        }
        return iM3031a;
    }

    /* JADX INFO: renamed from: b */
    public static int m5078b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0397ki.m3033c(i) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m5079c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0397ki.m3033c(i) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m5080d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3031a = 0;
        for (int i = 0; i < size; i++) {
            iM3031a += AbstractC0397ki.m3031a(((Integer) list.get(i)).intValue());
        }
        return iM3031a;
    }

    /* JADX INFO: renamed from: e */
    public static int m5081e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3035e = 0;
        for (int i = 0; i < size; i++) {
            iM3035e += AbstractC0397ki.m3035e(((Long) list.get(i)).longValue());
        }
        return iM3035e;
    }

    /* JADX INFO: renamed from: f */
    public static int m5082f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3034d = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iM3034d += AbstractC0397ki.m3034d((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iM3034d;
    }

    /* JADX INFO: renamed from: g */
    public static int m5083g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3035e = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM3035e += AbstractC0397ki.m3035e((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iM3035e;
    }

    /* JADX INFO: renamed from: h */
    public static int m5084h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3034d = 0;
        for (int i = 0; i < size; i++) {
            iM3034d += AbstractC0397ki.m3034d(((Integer) list.get(i)).intValue());
        }
        return iM3034d;
    }

    /* JADX INFO: renamed from: i */
    public static int m5085i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3035e = 0;
        for (int i = 0; i < size; i++) {
            iM3035e += AbstractC0397ki.m3035e(((Long) list.get(i)).longValue());
        }
        return iM3035e;
    }

    /* JADX INFO: renamed from: j */
    public static Object m5086j(Object obj, int i, List list, C0630qt c0630qt, Object obj2, pf1 pf1Var) {
        if (c0630qt == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!c0630qt.m4138a(iIntValue)) {
                    if (obj2 == null) {
                        pf1Var.getClass();
                        obj2 = pf1.m3902a(obj);
                    }
                    pf1Var.getClass();
                    ((nf1) obj2).m3535c(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (c0630qt.m4138a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    pf1Var.getClass();
                    obj2 = pf1.m3902a(obj);
                }
                pf1Var.getClass();
                ((nf1) obj2).m3535c(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
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
    public static void m5087k(pf1 pf1Var, Object obj, Object obj2) {
        pf1Var.getClass();
        s70 s70Var = (s70) obj;
        nf1 nf1Var = s70Var.unknownFields;
        nf1 nf1Var2 = ((s70) obj2).unknownFields;
        nf1 nf1Var3 = nf1.f5398f;
        if (!nf1Var3.equals(nf1Var2)) {
            if (nf1Var3.equals(nf1Var)) {
                int i = nf1Var.f5399a + nf1Var2.f5399a;
                int[] iArrCopyOf = Arrays.copyOf(nf1Var.f5400b, i);
                System.arraycopy(nf1Var2.f5400b, 0, iArrCopyOf, nf1Var.f5399a, nf1Var2.f5399a);
                Object[] objArrCopyOf = Arrays.copyOf(nf1Var.f5401c, i);
                System.arraycopy(nf1Var2.f5401c, 0, objArrCopyOf, nf1Var.f5399a, nf1Var2.f5399a);
                nf1Var = new nf1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                nf1Var.getClass();
                if (!nf1Var2.equals(nf1Var3)) {
                    if (!nf1Var.f5403e) {
                        dd0.m1164i();
                        return;
                    }
                    int i2 = nf1Var.f5399a + nf1Var2.f5399a;
                    nf1Var.m3533a(i2);
                    System.arraycopy(nf1Var2.f5400b, 0, nf1Var.f5400b, nf1Var.f5399a, nf1Var2.f5399a);
                    System.arraycopy(nf1Var2.f5401c, 0, nf1Var.f5401c, nf1Var.f5399a, nf1Var2.f5399a);
                    nf1Var.f5399a = i2;
                }
            }
        }
        s70Var.unknownFields = nf1Var;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m5088l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static void m5089m(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2060h(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = AbstractC0397ki.f4383b;
            i3++;
        }
        abstractC0397ki.mo2077y(i3);
        while (i2 < list.size()) {
            abstractC0397ki.mo2059g(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m5090n(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                abstractC0397ki.getClass();
                abstractC0397ki.mo2066n(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = AbstractC0397ki.f4383b;
            i3 += 8;
        }
        abstractC0397ki.mo2077y(i3);
        while (i2 < list.size()) {
            abstractC0397ki.mo2067o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m5091o(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2068p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int iM3031a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3031a += AbstractC0397ki.m3031a(((Integer) list.get(i3)).intValue());
        }
        abstractC0397ki.mo2077y(iM3031a);
        while (i2 < list.size()) {
            abstractC0397ki.mo2069q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m5092p(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2064l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = AbstractC0397ki.f4383b;
            i3 += 4;
        }
        abstractC0397ki.mo2077y(i3);
        while (i2 < list.size()) {
            abstractC0397ki.mo2065m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m5093q(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2066n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = AbstractC0397ki.f4383b;
            i3 += 8;
        }
        abstractC0397ki.mo2077y(i3);
        while (i2 < list.size()) {
            abstractC0397ki.mo2067o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m5094r(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                abstractC0397ki.getClass();
                abstractC0397ki.mo2064l(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = AbstractC0397ki.f4383b;
            i3 += 4;
        }
        abstractC0397ki.mo2077y(i3);
        while (i2 < list.size()) {
            abstractC0397ki.mo2065m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m5095s(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2068p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int iM3031a = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3031a += AbstractC0397ki.m3031a(((Integer) list.get(i3)).intValue());
        }
        abstractC0397ki.mo2077y(iM3031a);
        while (i2 < list.size()) {
            abstractC0397ki.mo2069q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m5096t(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2078z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int iM3035e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3035e += AbstractC0397ki.m3035e(((Long) list.get(i3)).longValue());
        }
        abstractC0397ki.mo2077y(iM3035e);
        while (i2 < list.size()) {
            abstractC0397ki.mo2056A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m5097u(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2064l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = AbstractC0397ki.f4383b;
            i3 += 4;
        }
        abstractC0397ki.mo2077y(i3);
        while (i2 < list.size()) {
            abstractC0397ki.mo2065m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m5098v(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2066n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = AbstractC0397ki.f4383b;
            i3 += 8;
        }
        abstractC0397ki.mo2077y(i3);
        while (i2 < list.size()) {
            abstractC0397ki.mo2067o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m5099w(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                abstractC0397ki.mo2076x(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int iM3034d = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iM3034d += AbstractC0397ki.m3034d((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        abstractC0397ki.mo2077y(iM3034d);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            abstractC0397ki.mo2077y((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m5100x(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                abstractC0397ki.mo2078z(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int iM3035e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM3035e += AbstractC0397ki.m3035e((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        abstractC0397ki.mo2077y(iM3035e);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            abstractC0397ki.mo2056A((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m5101y(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2076x(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int iM3034d = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3034d += AbstractC0397ki.m3034d(((Integer) list.get(i3)).intValue());
        }
        abstractC0397ki.mo2077y(iM3034d);
        while (i2 < list.size()) {
            abstractC0397ki.mo2077y(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m5102z(int i, List list, b90 b90Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC0397ki abstractC0397ki = (AbstractC0397ki) b90Var.f793k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC0397ki.mo2078z(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abstractC0397ki.mo2075w(i, 2);
        int iM3035e = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM3035e += AbstractC0397ki.m3035e(((Long) list.get(i3)).longValue());
        }
        abstractC0397ki.mo2077y(iM3035e);
        while (i2 < list.size()) {
            abstractC0397ki.mo2056A(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
