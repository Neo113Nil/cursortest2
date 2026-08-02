package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 implements le0 {

    /* JADX INFO: renamed from: a */
    public final me0 f8911a;

    /* JADX INFO: renamed from: b */
    public final String f8912b;

    /* JADX INFO: renamed from: c */
    public final o31 f8913c;

    /* JADX INFO: renamed from: d */
    public final f50 f8914d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0729th f8915e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f8916f;

    /* JADX INFO: renamed from: g */
    public final je0 f8917g;

    /* JADX INFO: renamed from: h */
    public final f71 f8918h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0875xf f8919i;

    /* JADX INFO: renamed from: j */
    public final List f8920j;

    /* JADX INFO: renamed from: k */
    public final gc1 f8921k;

    /* JADX INFO: renamed from: l */
    public final ue0 f8922l;

    /* JADX INFO: renamed from: m */
    public volatile List f8923m;

    /* JADX INFO: renamed from: n */
    public C0598py f8924n;

    /* JADX INFO: renamed from: o */
    public final na1 f8925o;

    /* JADX INFO: renamed from: p */
    public a81 f8926p;

    /* JADX INFO: renamed from: q */
    public a81 f8927q;

    /* JADX INFO: renamed from: r */
    public ul0 f8928r;

    /* JADX INFO: renamed from: u */
    public te0 f8931u;

    /* JADX INFO: renamed from: v */
    public volatile te0 f8932v;

    /* JADX INFO: renamed from: x */
    public ja1 f8934x;

    /* JADX INFO: renamed from: s */
    public final ArrayList f8929s = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final qe0 f8930t = new qe0(this, 0);

    /* JADX INFO: renamed from: w */
    public volatile C0511nl f8933w = C0511nl.m3549a(EnumC0474ml.f5074m);

    public xe0(List list, String str, o31 o31Var, C0015ae c0015ae, ScheduledExecutorService scheduledExecutorService, nb1 nb1Var, gc1 gc1Var, f50 f50Var, je0 je0Var, f71 f71Var, C0137dg c0137dg, me0 me0Var, AbstractC0875xf abstractC0875xf, ArrayList arrayList) {
        a90.m127k(list, "addressGroups");
        a90.m122f("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a90.m127k(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f8923m = listUnmodifiableList;
        ue0 ue0Var = new ue0();
        ue0Var.f7802a = listUnmodifiableList;
        this.f8922l = ue0Var;
        this.f8912b = str;
        this.f8913c = o31Var;
        this.f8915e = c0015ae;
        this.f8916f = scheduledExecutorService;
        this.f8925o = (na1) nb1Var.get();
        this.f8921k = gc1Var;
        this.f8914d = f50Var;
        this.f8917g = je0Var;
        this.f8918h = f71Var;
        a90.m127k(c0137dg, "channelTracer");
        a90.m127k(me0Var, "logId");
        this.f8911a = me0Var;
        a90.m127k(abstractC0875xf, "channelLogger");
        this.f8919i = abstractC0875xf;
        this.f8920j = arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static void m5630e(xe0 xe0Var, EnumC0474ml enumC0474ml) {
        xe0Var.f8921k.m2028d();
        xe0Var.m5633g(C0511nl.m3549a(enumC0474ml));
    }

    /* JADX INFO: renamed from: f */
    public static void m5631f(xe0 xe0Var) {
        SocketAddress socketAddress;
        rb0 rb0Var;
        ue0 ue0Var = xe0Var.f8922l;
        gc1 gc1Var = xe0Var.f8921k;
        gc1Var.m2028d();
        a90.m132p("Should have no reconnectTask scheduled", xe0Var.f8926p == null);
        if (ue0Var.f7803b == 0 && ue0Var.f7804c == 0) {
            na1 na1Var = xe0Var.f8925o;
            na1Var.f5351b = false;
            na1Var.m3510b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((C0190ex) ue0Var.f7802a.get(ue0Var.f7803b)).f2195a.get(ue0Var.f7804c);
        if (socketAddress2 instanceof rb0) {
            rb0Var = (rb0) socketAddress2;
            socketAddress = rb0Var.f6796k;
        } else {
            socketAddress = socketAddress2;
            rb0Var = null;
        }
        C0831w8 c0831w8 = ((C0190ex) ue0Var.f7802a.get(ue0Var.f7803b)).f2196b;
        String str = (String) c0831w8.f8455a.get(C0190ex.f2194d);
        C0692sh c0692sh = new C0692sh();
        c0692sh.f7116a = "unknown-authority";
        c0692sh.f7117b = C0831w8.f8454b;
        if (str == null) {
            str = xe0Var.f8912b;
        }
        a90.m127k(str, "authority");
        c0692sh.f7116a = str;
        c0692sh.f7117b = c0831w8;
        c0692sh.f7118c = rb0Var;
        we0 we0Var = new we0();
        we0Var.f8523i = xe0Var.f8911a;
        te0 te0Var = new te0(xe0Var.f8915e.mo179n(socketAddress, c0692sh, we0Var), xe0Var.f8918h);
        we0Var.f8523i = te0Var.mo1526c();
        xe0Var.f8931u = te0Var;
        xe0Var.f8929s.add(te0Var);
        Runnable runnableMo3772b = te0Var.mo3772b(new m81(xe0Var, te0Var));
        if (runnableMo3772b != null) {
            gc1Var.m2026b(runnableMo3772b);
        }
        xe0Var.f8919i.mo5320h(2, "Started transport {0}", we0Var.f8523i);
    }

    /* JADX INFO: renamed from: h */
    public static String m5632h(ja1 ja1Var) {
        StringBuilder sb = new StringBuilder();
        ia1 ia1Var = ja1Var.f3886a;
        Throwable th = ja1Var.f3888c;
        sb.append(ia1Var);
        String str = ja1Var.f3887b;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // p000.le0
    /* JADX INFO: renamed from: c */
    public final me0 mo1526c() {
        return this.f8911a;
    }

    /* JADX INFO: renamed from: g */
    public final void m5633g(C0511nl c0511nl) {
        this.f8921k.m2028d();
        if (this.f8933w.f5453a != c0511nl.f5453a) {
            a90.m132p("Cannot transition out of SHUTDOWN to " + c0511nl, this.f8933w.f5453a != EnumC0474ml.f5075n);
            this.f8933w = c0511nl;
            ((lj0) this.f8914d.f2313k).mo3228a(c0511nl);
        }
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5173d("logId", this.f8911a.f5031c);
        c0809vnM5362k.m5172c(this.f8923m, "addressGroups");
        return c0809vnM5362k.toString();
    }
}
