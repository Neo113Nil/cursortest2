package p000;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o80 {

    /* JADX INFO: renamed from: j */
    public static final C0059be f5662j = new C0059be("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED", 0);

    /* JADX INFO: renamed from: k */
    public static final g72 f5663k = new g72("NO_OWNER", 3);

    /* JADX INFO: renamed from: l */
    public static final tb2 f5664l;

    /* JADX INFO: renamed from: m */
    public static final ub2 f5665m;

    static {
        int i = 1;
        f5664l = new tb2(i);
        f5665m = new ub2(i);
    }

    /* JADX INFO: renamed from: C */
    public static String m3640C(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = "".concat(str);
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    /* JADX INFO: renamed from: D */
    public static vb2 m3641D(Set set) {
        vb2 vb2Var = new vb2();
        vb2Var.f8172d = f5665m;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            db2 db2Var = (db2) it.next();
            p80.m3874s(db2Var, "key");
            boolean z = db2Var.f1615c;
            HashMap map = vb2Var.f8170b;
            HashMap map2 = vb2Var.f8169a;
            if (!z) {
                map.remove(db2Var);
                map2.put(db2Var, vb2.f8167e);
            } else {
                if (!z) {
                    C0270h1.m2190f("key must be repeating");
                    return null;
                }
                map2.remove(db2Var);
                map.put(db2Var, vb2.f8168f);
            }
        }
        return vb2Var;
    }

    /* JADX INFO: renamed from: E */
    public static void m3642E(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* JADX INFO: renamed from: F */
    public static int m3643F(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0063->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0080 -> B:25:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0083 -> B:25:0x0063). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    public static final Object m3644e(List list, C0070bp c0070bp, AbstractC0882xm abstractC0882xm) throws Throwable {
        C0699so c0699so;
        List list2;
        k01 k01Var;
        Iterator it;
        Throwable th;
        h60 h60Var;
        if (abstractC0882xm instanceof C0699so) {
            c0699so = (C0699so) abstractC0882xm;
            int i = c0699so.f7160p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0699so.f7160p = i - Integer.MIN_VALUE;
            } else {
                c0699so = new C0699so(abstractC0882xm);
            }
        } else {
            c0699so = new C0699so(abstractC0882xm);
        }
        Object obj = c0699so.f7159o;
        int i2 = c0699so.f7160p;
        Object obj2 = EnumC0513nn.f5459j;
        if (i2 != 0) {
            if (i2 == 1) {
                list2 = (List) c0699so.f7157m;
                wo1.m5395v(obj);
            } else {
                if (i2 != 2) {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = c0699so.f7158n;
                k01Var = (k01) c0699so.f7157m;
                try {
                    wo1.m5395v(obj);
                } catch (Throwable th2) {
                    Object obj3 = k01Var.f4243j;
                    if (obj3 == null) {
                        k01Var.f4243j = th2;
                    } else {
                        vt1.m5190a((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                h60Var = (h60) it.next();
                c0699so.f7157m = k01Var;
                c0699so.f7158n = it;
                c0699so.f7160p = 2;
                if (h60Var.mo170i(c0699so) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) k01Var.f4243j;
            if (th == null) {
                return kf1.f4365a;
            }
            throw th;
        }
        wo1.m5395v(obj);
        ArrayList arrayList = new ArrayList();
        C0773uo c0773uo = new C0773uo(list, arrayList, null);
        c0699so.f7157m = arrayList;
        c0699so.f7160p = 1;
        if (c0070bp.m734a(c0773uo, c0699so) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        k01Var = new k01();
        it = list2.iterator();
        while (it.hasNext()) {
            h60Var = (h60) it.next();
            c0699so.f7157m = k01Var;
            c0699so.f7158n = it;
            c0699so.f7160p = 2;
            if (h60Var.mo170i(c0699so) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) k01Var.f4243j;
        if (th == null) {
            return kf1.f4365a;
        }
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public static void m3645f(String str, boolean z) {
        if (z) {
            return;
        }
        C0270h1.m2190f(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m3646g(Object obj) {
        m3647h(obj, "Argument must not be null");
    }

    /* JADX INFO: renamed from: h */
    public static void m3647h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h(str);
    }

    /* JADX INFO: renamed from: j */
    public static void m3648j(String str, String str2, Object obj) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m3649k(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final C0136df m3650l(InterfaceC0808vm interfaceC0808vm) {
        if (!(interfaceC0808vm instanceof C0704st)) {
            return new C0136df(1, interfaceC0808vm);
        }
        C0136df c0136dfM4590m = ((C0704st) interfaceC0808vm).m4590m();
        if (c0136dfM4590m != null) {
            if (!c0136dfM4590m.m1177D()) {
                c0136dfM4590m = null;
            }
            if (c0136dfM4590m != null) {
                return c0136dfM4590m;
            }
        }
        return new C0136df(2, interfaceC0808vm);
    }

    /* JADX INFO: renamed from: s */
    public static String m3651s(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public abstract View mo24t(int i);

    /* JADX INFO: renamed from: u */
    public abstract boolean mo25u();

    /* JADX INFO: renamed from: i */
    public void mo1310i() {
    }

    /* JADX INFO: renamed from: m */
    public void mo1311m() {
    }

    /* JADX INFO: renamed from: v */
    public void mo1317v() {
    }

    /* JADX INFO: renamed from: A */
    public void mo1308A(ja1 ja1Var) {
    }

    /* JADX INFO: renamed from: n */
    public void mo1312n(int i) {
    }

    /* JADX INFO: renamed from: p */
    public void mo1314p(np0 np0Var) {
    }

    /* JADX INFO: renamed from: q */
    public void mo1315q(long j) {
    }

    /* JADX INFO: renamed from: r */
    public void mo1316r(long j) {
    }

    /* JADX INFO: renamed from: w */
    public void mo1318w(int i) {
    }

    /* JADX INFO: renamed from: y */
    public void mo1320y(long j) {
    }

    /* JADX INFO: renamed from: z */
    public void mo586z(long j) {
    }

    /* JADX INFO: renamed from: B */
    public void mo1309B(C0831w8 c0831w8, np0 np0Var) {
    }

    /* JADX INFO: renamed from: o */
    public void mo1313o(int i, long j) {
    }

    /* JADX INFO: renamed from: x */
    public void mo1319x(int i, long j, long j2) {
    }
}
