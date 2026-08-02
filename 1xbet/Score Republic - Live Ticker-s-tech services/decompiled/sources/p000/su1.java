package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class su1 {

    /* JADX INFO: renamed from: a */
    public final f71 f7213a;

    /* JADX INFO: renamed from: b */
    public f71 f7214b;

    /* JADX INFO: renamed from: c */
    public final oq0 f7215c;

    /* JADX INFO: renamed from: d */
    public final a81 f7216d;

    public su1() {
        f71 f71Var = new f71(15);
        this.f7213a = f71Var;
        this.f7214b = ((f71) f71Var.f2335l).m1650C();
        this.f7215c = new oq0(7);
        this.f7216d = new a81(27);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: mm1

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ su1 f5100k;

            {
                this.f5100k = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i2 = i;
                su1 su1Var = this.f5100k;
                switch (i2) {
                    case 0:
                        return new y12(su1Var.f7215c);
                    default:
                        return new y12(su1Var.f7216d);
                }
            }
        };
        C0884xo c0884xo = (C0884xo) f71Var.f2337n;
        c0884xo.f9009a.put("internal.registerCallback", callable);
        final int i2 = 0;
        c0884xo.f9009a.put("internal.eventLogger", new Callable(this) { // from class: mm1

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ su1 f5100k;

            {
                this.f5100k = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i3 = i2;
                su1 su1Var = this.f5100k;
                switch (i3) {
                    case 0:
                        return new y12(su1Var.f7215c);
                    default:
                        return new y12(su1Var.f7216d);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4595a(pm1 pm1Var) throws pv1 {
        oq0 oq0Var = this.f7215c;
        try {
            oq0Var.f5840k = pm1Var;
            oq0Var.f5841l = pm1Var.clone();
            ((ArrayList) oq0Var.f5842m).clear();
            ((f71) this.f7213a.f2336m).m1652E("runtime.counter", new gr1(Double.valueOf(0.0d)));
            this.f7216d.m98v(this.f7214b.m1650C(), oq0Var);
            return (((pm1) oq0Var.f5841l).equals((pm1) oq0Var.f5840k) && ((ArrayList) oq0Var.f5842m).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new pv1(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4596b(a12 a12Var) throws pv1 {
        bs1 bs1Var;
        try {
            f71 f71Var = this.f7213a;
            this.f7214b = ((f71) f71Var.f2335l).m1650C();
            if (f71Var.m1678y(this.f7214b, (c12[]) a12Var.m15t().toArray(new c12[0])) instanceof nq1) {
                throw new IllegalStateException("Program loading failed");
            }
            for (w02 w02Var : a12Var.m16u().m5021t()) {
                List listM5229u = w02Var.m5229u();
                String strM5228t = w02Var.m5228t();
                Iterator it = listM5229u.iterator();
                while (it.hasNext()) {
                    ht1 ht1VarM1678y = f71Var.m1678y(this.f7214b, (c12) it.next());
                    if (!(ht1VarM1678y instanceof ct1)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    f71 f71Var2 = this.f7214b;
                    if (f71Var2.m1651D(strM5228t)) {
                        ht1 ht1VarM1654G = f71Var2.m1654G(strM5228t);
                        if (!(ht1VarM1654G instanceof bs1)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strM5228t)));
                        }
                        bs1Var = (bs1) ht1VarM1654G;
                    } else {
                        bs1Var = null;
                    }
                    if (bs1Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strM5228t)));
                    }
                    bs1Var.mo749a(this.f7214b, Collections.singletonList(ht1VarM1678y));
                }
            }
        } catch (Throwable th) {
            throw new pv1(th);
        }
    }
}
