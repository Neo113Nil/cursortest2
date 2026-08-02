package p000;

import android.os.Bundle;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oa2 {

    /* JADX INFO: renamed from: a */
    public static final p90 f5684a = new p90(new C0042ay(15));

    /* JADX INFO: renamed from: b */
    public static final Object f5685b = new Object();

    /* JADX INFO: renamed from: c */
    public static boolean f5686c;

    /* JADX INFO: renamed from: d */
    public static int f5687d;

    /* JADX INFO: renamed from: a */
    public static C0356je m3654a(C0591pr c0591pr) {
        C0283he c0283he = new C0283he();
        c0283he.f3182c = new u11();
        C0356je c0356je = new C0356je(c0283he);
        c0283he.f3181b = c0356je;
        c0283he.f3180a = AbstractC0024an.class;
        try {
            c0591pr.m2609I(true, new lf0(new C0068bn(0, c0283he, c0591pr)));
            c0283he.f3180a = "Deferred.asListenableFuture";
            return c0356je;
        } catch (Exception e) {
            c0356je.f3911k.mo4867k(e);
            return c0356je;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3655b(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C0270h1.m2192h(j11.m2773h("at index ", i2));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3656c(int i) {
        if (i >= 1) {
            return;
        }
        C0270h1.m2186b(j11.m2773h("Expected positive parallelism level, but got ", i));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m3657d(t10 t10Var, AbstractC0882xm abstractC0882xm) {
        f20 f20Var;
        k01 k01Var;
        C0080c e;
        C0367jp c0367jp;
        if (abstractC0882xm instanceof f20) {
            f20Var = (f20) abstractC0882xm;
            int i = f20Var.f2272p;
            if ((i & Integer.MIN_VALUE) != 0) {
                f20Var.f2272p = i - Integer.MIN_VALUE;
            } else {
                f20Var = new f20(abstractC0882xm);
            }
        } else {
            f20Var = new f20(abstractC0882xm);
        }
        Object obj = f20Var.f2271o;
        int i2 = f20Var.f2272p;
        if (i2 == 0) {
            wo1.m5395v(obj);
            k01 k01Var2 = new k01();
            C0367jp c0367jp2 = new C0367jp(2, k01Var2);
            try {
                f20Var.f2269m = k01Var2;
                f20Var.f2270n = c0367jp2;
                f20Var.f2272p = 1;
                Object objMo622r = t10Var.mo622r(c0367jp2, f20Var);
                Object obj2 = EnumC0513nn.f5459j;
                if (objMo622r == obj2) {
                    return obj2;
                }
                k01Var = k01Var2;
            } catch (C0080c e2) {
                k01Var = k01Var2;
                e = e2;
                c0367jp = c0367jp2;
                if (e.f1054j != c0367jp) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0367jp = f20Var.f2270n;
            k01Var = f20Var.f2269m;
            try {
                wo1.m5395v(obj);
            } catch (C0080c e3) {
                e = e3;
                if (e.f1054j != c0367jp) {
                    throw e;
                }
            }
        }
        return k01Var.f4243j;
    }

    /* JADX INFO: renamed from: e */
    public static final g61 m3658e(Object obj) {
        if (obj != a90.f78a) {
            return (g61) obj;
        }
        C0270h1.m2191g("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final int m3659f(C0165e8 c0165e8, Object obj, int i) {
        int i2 = c0165e8.f1996l;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM3008a = kd0.m3008a(i2, i, c0165e8.f1994j);
            if (iM3008a < 0 || af0.m187a(obj, c0165e8.f1995k[iM3008a])) {
                return iM3008a;
            }
            int i3 = iM3008a + 1;
            while (i3 < i2 && c0165e8.f1994j[i3] == i) {
                if (af0.m187a(obj, c0165e8.f1995k[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM3008a - 1; i4 >= 0 && c0165e8.f1994j[i4] == i; i4--) {
                if (af0.m187a(obj, c0165e8.f1995k[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m3660g(Object obj) {
        return obj == a90.f78a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3661h(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: i */
    public static void m3662i(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* JADX INFO: renamed from: j */
    public static Object m3663j(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        String canonicalName2 = obj2.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder("Invalid conditional user property field type. '");
        sb.append(str);
        sb.append("' expected [");
        sb.append(canonicalName);
        sb.append("] but was [");
        C0270h1.m2191g(AbstractC0024an.m285h(sb, canonicalName2, "]"));
        return null;
    }
}
