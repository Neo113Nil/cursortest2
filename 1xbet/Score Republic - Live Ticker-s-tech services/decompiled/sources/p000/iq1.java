package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iq1 {

    /* JADX INFO: renamed from: a */
    public static final wa0 f3637a;

    static {
        int i = fo1.f2465a;
        f3637a = new wa0(9);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2670a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    /* JADX INFO: renamed from: b */
    public static void m2671b(Object obj, Object obj2) {
        zo1 zo1Var = (zo1) obj;
        oq1 oq1Var = zo1Var.zzc;
        oq1 oq1Var2 = ((zo1) obj2).zzc;
        oq1 oq1Var3 = oq1.f5843f;
        if (!oq1Var3.equals(oq1Var2)) {
            if (oq1Var3.equals(oq1Var)) {
                int i = oq1Var.f5844a + oq1Var2.f5844a;
                int[] iArrCopyOf = Arrays.copyOf(oq1Var.f5845b, i);
                System.arraycopy(oq1Var2.f5845b, 0, iArrCopyOf, oq1Var.f5844a, oq1Var2.f5844a);
                Object[] objArrCopyOf = Arrays.copyOf(oq1Var.f5846c, i);
                System.arraycopy(oq1Var2.f5846c, 0, objArrCopyOf, oq1Var.f5844a, oq1Var2.f5844a);
                oq1Var = new oq1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                oq1Var.getClass();
                if (!oq1Var2.equals(oq1Var3)) {
                    if (!oq1Var.f5848e) {
                        dd0.m1164i();
                        return;
                    }
                    int i2 = oq1Var.f5844a + oq1Var2.f5844a;
                    oq1Var.m3752e(i2);
                    System.arraycopy(oq1Var2.f5845b, 0, oq1Var.f5845b, oq1Var.f5844a, oq1Var2.f5844a);
                    System.arraycopy(oq1Var2.f5846c, 0, oq1Var.f5846c, oq1Var.f5844a, oq1Var2.f5844a);
                    oq1Var.f5844a = i2;
                }
            }
        }
        zo1Var.zzc = oq1Var;
    }

    /* JADX INFO: renamed from: c */
    public static Object m2672c(Object obj, int i, kp1 kp1Var, yn1 yn1Var, Object obj2, wa0 wa0Var) {
        if (yn1Var == null) {
            return obj2;
        }
        if (kp1Var == null) {
            Iterator it = kp1Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!yn1Var.m5816a(iIntValue)) {
                    if (obj2 == null) {
                        wa0Var.getClass();
                        obj2 = wa0.m5306u(obj);
                    }
                    wa0Var.getClass();
                    ((oq1) obj2).m3751d(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = kp1Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) kp1Var.get(i3);
            int iIntValue2 = num.intValue();
            if (yn1Var.m5816a(iIntValue2)) {
                if (i3 != i2) {
                    kp1Var.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    wa0Var.getClass();
                    obj2 = wa0.m5306u(obj);
                }
                wa0Var.getClass();
                ((oq1) obj2).m3751d(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            kp1Var.subList(i2, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: d */
    public static void m2673d(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ro1Var.mo3561i(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        ro1Var.mo3570r(i3);
        while (i2 < list.size()) {
            ro1Var.mo3573u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2674e(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ro1Var.mo3559g(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        ro1Var.mo3570r(i3);
        while (i2 < list.size()) {
            ro1Var.mo3571s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2675f(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof pp1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ro1Var.mo3560h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int iM4392b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM4392b += ro1.m4392b(((Long) list.get(i3)).longValue());
            }
            ro1Var.mo3570r(iM4392b);
            while (i2 < list.size()) {
                ro1Var.mo3572t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pp1 pp1Var = (pp1) list;
        if (!z) {
            while (i2 < pp1Var.f6232l) {
                ro1Var.mo3560h(i, pp1Var.m3972c(i2));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int iM4392b2 = 0;
        for (int i4 = 0; i4 < pp1Var.f6232l; i4++) {
            iM4392b2 += ro1.m4392b(pp1Var.m3972c(i4));
        }
        ro1Var.mo3570r(iM4392b2);
        while (i2 < pp1Var.f6232l) {
            ro1Var.mo3572t(pp1Var.m3972c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2676g(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof pp1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ro1Var.mo3560h(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int iM4392b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM4392b += ro1.m4392b(((Long) list.get(i3)).longValue());
            }
            ro1Var.mo3570r(iM4392b);
            while (i2 < list.size()) {
                ro1Var.mo3572t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pp1 pp1Var = (pp1) list;
        if (!z) {
            while (i2 < pp1Var.f6232l) {
                ro1Var.mo3560h(i, pp1Var.m3972c(i2));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int iM4392b2 = 0;
        for (int i4 = 0; i4 < pp1Var.f6232l; i4++) {
            iM4392b2 += ro1.m4392b(pp1Var.m3972c(i4));
        }
        ro1Var.mo3570r(iM4392b2);
        while (i2 < pp1Var.f6232l) {
            ro1Var.mo3572t(pp1Var.m3972c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m2677h(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof pp1)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    ro1Var.mo3560h(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int iM4392b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM4392b += ro1.m4392b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            ro1Var.mo3570r(iM4392b);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                ro1Var.mo3572t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        pp1 pp1Var = (pp1) list;
        if (!z) {
            while (i2 < pp1Var.f6232l) {
                long jM3972c = pp1Var.m3972c(i2);
                ro1Var.mo3560h(i, (jM3972c >> 63) ^ (jM3972c + jM3972c));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int iM4392b2 = 0;
        for (int i4 = 0; i4 < pp1Var.f6232l; i4++) {
            long jM3972c2 = pp1Var.m3972c(i4);
            iM4392b2 += ro1.m4392b((jM3972c2 >> 63) ^ (jM3972c2 + jM3972c2));
        }
        ro1Var.mo3570r(iM4392b2);
        while (i2 < pp1Var.f6232l) {
            long jM3972c3 = pp1Var.m3972c(i2);
            ro1Var.mo3572t((jM3972c3 >> 63) ^ (jM3972c3 + jM3972c3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m2678i(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof pp1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ro1Var.mo3561i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            ro1Var.mo3570r(i3);
            while (i2 < list.size()) {
                ro1Var.mo3573u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pp1 pp1Var = (pp1) list;
        if (!z) {
            while (i2 < pp1Var.f6232l) {
                ro1Var.mo3561i(i, pp1Var.m3972c(i2));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pp1Var.f6232l; i6++) {
            pp1Var.m3972c(i6);
            i5 += 8;
        }
        ro1Var.mo3570r(i5);
        while (i2 < pp1Var.f6232l) {
            ro1Var.mo3573u(pp1Var.m3972c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m2679j(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof pp1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ro1Var.mo3561i(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            ro1Var.mo3570r(i3);
            while (i2 < list.size()) {
                ro1Var.mo3573u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        pp1 pp1Var = (pp1) list;
        if (!z) {
            while (i2 < pp1Var.f6232l) {
                ro1Var.mo3561i(i, pp1Var.m3972c(i2));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < pp1Var.f6232l; i6++) {
            pp1Var.m3972c(i6);
            i5 += 8;
        }
        ro1Var.mo3570r(i5);
        while (i2 < pp1Var.f6232l) {
            ro1Var.mo3573u(pp1Var.m3972c(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m2680k(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof ap1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ro1Var.mo3557e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int iM4392b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM4392b += ro1.m4392b(((Integer) list.get(i3)).intValue());
            }
            ro1Var.mo3570r(iM4392b);
            while (i2 < list.size()) {
                ro1Var.mo3569q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ap1 ap1Var = (ap1) list;
        if (!z) {
            while (i2 < ap1Var.f591l) {
                ro1Var.mo3557e(i, ap1Var.m457d(i2));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int iM4392b2 = 0;
        for (int i4 = 0; i4 < ap1Var.f591l; i4++) {
            iM4392b2 += ro1.m4392b(ap1Var.m457d(i4));
        }
        ro1Var.mo3570r(iM4392b2);
        while (i2 < ap1Var.f591l) {
            ro1Var.mo3569q(ap1Var.m457d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m2681l(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof ap1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ro1Var.mo3558f(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int iM4391a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM4391a += ro1.m4391a(((Integer) list.get(i3)).intValue());
            }
            ro1Var.mo3570r(iM4391a);
            while (i2 < list.size()) {
                ro1Var.mo3570r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ap1 ap1Var = (ap1) list;
        if (!z) {
            while (i2 < ap1Var.f591l) {
                ro1Var.mo3558f(i, ap1Var.m457d(i2));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int iM4391a2 = 0;
        for (int i4 = 0; i4 < ap1Var.f591l; i4++) {
            iM4391a2 += ro1.m4391a(ap1Var.m457d(i4));
        }
        ro1Var.mo3570r(iM4391a2);
        while (i2 < ap1Var.f591l) {
            ro1Var.mo3570r(ap1Var.m457d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m2682m(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof ap1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    ro1Var.mo3558f(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int iM4391a = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM4391a += ro1.m4391a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            ro1Var.mo3570r(iM4391a);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                ro1Var.mo3570r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        ap1 ap1Var = (ap1) list;
        if (!z) {
            while (i2 < ap1Var.f591l) {
                int iM457d = ap1Var.m457d(i2);
                ro1Var.mo3558f(i, (iM457d >> 31) ^ (iM457d + iM457d));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int iM4391a2 = 0;
        for (int i4 = 0; i4 < ap1Var.f591l; i4++) {
            int iM457d2 = ap1Var.m457d(i4);
            iM4391a2 += ro1.m4391a((iM457d2 >> 31) ^ (iM457d2 + iM457d2));
        }
        ro1Var.mo3570r(iM4391a2);
        while (i2 < ap1Var.f591l) {
            int iM457d3 = ap1Var.m457d(i2);
            ro1Var.mo3570r((iM457d3 >> 31) ^ (iM457d3 + iM457d3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m2683n(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof ap1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ro1Var.mo3559g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ro1Var.mo3570r(i3);
            while (i2 < list.size()) {
                ro1Var.mo3571s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ap1 ap1Var = (ap1) list;
        if (!z) {
            while (i2 < ap1Var.f591l) {
                ro1Var.mo3559g(i, ap1Var.m457d(i2));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ap1Var.f591l; i6++) {
            ap1Var.m457d(i6);
            i5 += 4;
        }
        ro1Var.mo3570r(i5);
        while (i2 < ap1Var.f591l) {
            ro1Var.mo3571s(ap1Var.m457d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2684o(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof ap1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ro1Var.mo3559g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ro1Var.mo3570r(i3);
            while (i2 < list.size()) {
                ro1Var.mo3571s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ap1 ap1Var = (ap1) list;
        if (!z) {
            while (i2 < ap1Var.f591l) {
                ro1Var.mo3559g(i, ap1Var.m457d(i2));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ap1Var.f591l; i6++) {
            ap1Var.m457d(i6);
            i5 += 4;
        }
        ro1Var.mo3570r(i5);
        while (i2 < ap1Var.f591l) {
            ro1Var.mo3571s(ap1Var.m457d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m2685p(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!(list instanceof ap1)) {
            if (!z) {
                while (i2 < list.size()) {
                    ro1Var.mo3557e(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ro1Var.mo3556d(i, 2);
            int iM4392b = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM4392b += ro1.m4392b(((Integer) list.get(i3)).intValue());
            }
            ro1Var.mo3570r(iM4392b);
            while (i2 < list.size()) {
                ro1Var.mo3569q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ap1 ap1Var = (ap1) list;
        if (!z) {
            while (i2 < ap1Var.f591l) {
                ro1Var.mo3557e(i, ap1Var.m457d(i2));
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int iM4392b2 = 0;
        for (int i4 = 0; i4 < ap1Var.f591l; i4++) {
            iM4392b2 += ro1.m4392b(ap1Var.m457d(i4));
        }
        ro1Var.mo3570r(iM4392b2);
        while (i2 < ap1Var.f591l) {
            ro1Var.mo3569q(ap1Var.m457d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m2686q(int i, List list, jg0 jg0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ro1 ro1Var = (ro1) jg0Var.f3922k;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ro1Var.mo3562j(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        ro1Var.mo3556d(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        ro1Var.mo3570r(i3);
        while (i2 < list.size()) {
            ro1Var.mo3568p(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m2687r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pp1)) {
            int iM4392b = 0;
            while (i < size) {
                iM4392b += ro1.m4392b(((Long) list.get(i)).longValue());
                i++;
            }
            return iM4392b;
        }
        pp1 pp1Var = (pp1) list;
        int iM4392b2 = 0;
        while (i < size) {
            iM4392b2 += ro1.m4392b(pp1Var.m3972c(i));
            i++;
        }
        return iM4392b2;
    }

    /* JADX INFO: renamed from: s */
    public static int m2688s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pp1)) {
            int iM4392b = 0;
            while (i < size) {
                iM4392b += ro1.m4392b(((Long) list.get(i)).longValue());
                i++;
            }
            return iM4392b;
        }
        pp1 pp1Var = (pp1) list;
        int iM4392b2 = 0;
        while (i < size) {
            iM4392b2 += ro1.m4392b(pp1Var.m3972c(i));
            i++;
        }
        return iM4392b2;
    }

    /* JADX INFO: renamed from: t */
    public static int m2689t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof pp1)) {
            int iM4392b = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM4392b += ro1.m4392b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM4392b;
        }
        pp1 pp1Var = (pp1) list;
        int iM4392b2 = 0;
        while (i < size) {
            long jM3972c = pp1Var.m3972c(i);
            iM4392b2 += ro1.m4392b((jM3972c >> 63) ^ (jM3972c + jM3972c));
            i++;
        }
        return iM4392b2;
    }

    /* JADX INFO: renamed from: u */
    public static int m2690u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ap1)) {
            int iM4392b = 0;
            while (i < size) {
                iM4392b += ro1.m4392b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM4392b;
        }
        ap1 ap1Var = (ap1) list;
        int iM4392b2 = 0;
        while (i < size) {
            iM4392b2 += ro1.m4392b(ap1Var.m457d(i));
            i++;
        }
        return iM4392b2;
    }

    /* JADX INFO: renamed from: v */
    public static int m2691v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ap1)) {
            int iM4392b = 0;
            while (i < size) {
                iM4392b += ro1.m4392b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM4392b;
        }
        ap1 ap1Var = (ap1) list;
        int iM4392b2 = 0;
        while (i < size) {
            iM4392b2 += ro1.m4392b(ap1Var.m457d(i));
            i++;
        }
        return iM4392b2;
    }

    /* JADX INFO: renamed from: w */
    public static int m2692w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ap1)) {
            int iM4391a = 0;
            while (i < size) {
                iM4391a += ro1.m4391a(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM4391a;
        }
        ap1 ap1Var = (ap1) list;
        int iM4391a2 = 0;
        while (i < size) {
            iM4391a2 += ro1.m4391a(ap1Var.m457d(i));
            i++;
        }
        return iM4391a2;
    }

    /* JADX INFO: renamed from: x */
    public static int m2693x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ap1)) {
            int iM4391a = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM4391a += ro1.m4391a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM4391a;
        }
        ap1 ap1Var = (ap1) list;
        int iM4391a2 = 0;
        while (i < size) {
            int iM457d = ap1Var.m457d(i);
            iM4391a2 += ro1.m4391a((iM457d >> 31) ^ (iM457d + iM457d));
            i++;
        }
        return iM4391a2;
    }

    /* JADX INFO: renamed from: y */
    public static int m2694y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ro1.m4391a(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: z */
    public static int m2695z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ro1.m4391a(i << 3) + 8) * size;
    }
}
