package p000;

import android.app.Application;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b42 {

    /* JADX INFO: renamed from: a */
    public final e22 f710a;

    public b42(e22 e22Var) {
        this.f710a = e22Var;
    }

    /* JADX INFO: renamed from: b */
    public static C0305i m590b(v92 v92Var) {
        k22 k22Var = new k22();
        k22Var.f4269q = v92Var;
        jg0 jg0Var = new jg0(28, k22Var);
        EnumC0113ct enumC0113ct = EnumC0113ct.f1449j;
        v92Var.m5125a(enumC0113ct, jg0Var);
        return k70.m2990a(k22Var, C0642r4.class, z32.f9597b, enumC0113ct);
    }

    /* JADX INFO: renamed from: a */
    public final C0305i m591a(a81 a81Var) {
        String string;
        e22 e22Var = this.f710a;
        String simpleName = h22.class.getSimpleName();
        Looper looper = e22Var.f2663g;
        p80.m3864i(looper, "Looper must not be null");
        p90 p90Var = new p90();
        p90Var.f6027j = new ja0(looper);
        p80.m3860e(simpleName);
        p90Var.f6028k = new bj0(a81Var, simpleName);
        if (d71.f1569c == null) {
            d71.f1569c = Application.getProcessName();
        }
        String str = d71.f1569c;
        if (str == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = str.length() + 1;
            int iIdentityHashCode = System.identityHashCode(h22.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(str);
            sb.append("|");
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        oq0 oq0Var = new oq0((Object) e22Var, string, (Object) p90Var, 12);
        dx1 dx1Var = dx1.f1875n;
        C0415l c0415l = new C0415l();
        c0415l.f4616d = p90Var;
        c0415l.f4614b = oq0Var;
        c0415l.f4615c = dx1Var;
        c0415l.f4617e = new C0451lz[]{AbstractC0477mo.f5108e};
        c0415l.f4613a = false;
        bj0 bj0Var = (bj0) ((p90) c0415l.f4616d).f6028k;
        p80.m3864i(bj0Var, "Key must not be null");
        p90 p90Var2 = (p90) c0415l.f4616d;
        C0809vn c0809vn = new C0809vn(c0415l, p90Var2, (C0451lz[]) c0415l.f4617e, c0415l.f4613a);
        jg0 jg0Var = new jg0(c0415l, bj0Var);
        p80.m3864i((bj0) p90Var2.f6028k, "Listener has already been released.");
        l90 l90Var = e22Var.f2666j;
        l90Var.getClass();
        qc1 qc1Var = new qc1();
        kl1 kl1Var = new kl1(new rl1(new ll1(c0809vn, jg0Var), qc1Var), l90Var.f4730i.get(), e22Var);
        bm1 bm1Var = l90Var.f4734m;
        bm1Var.sendMessage(bm1Var.obtainMessage(8, kl1Var));
        return m590b(qc1Var.f6465a);
    }
}
