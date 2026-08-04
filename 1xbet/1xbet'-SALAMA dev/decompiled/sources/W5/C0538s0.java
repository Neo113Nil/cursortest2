package W5;

import A1.C0011c;
import C0.C0083b;
import C0.RunnableC0085d;
import U5.AbstractC0438e;
import U5.C0435b;
import U5.C0447n;
import U5.C0453u;
import U5.C0458z;
import U5.EnumC0446m;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p155w1.P2;

/* JADX INFO: renamed from: W5.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0538s0 implements U5.E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U5.F f7340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2 f7342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2 f7343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0514k f7344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f7345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final U5.C f7346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p072k1.g f7347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC0438e f7348i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final U5.p0 f7349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0530p0 f7350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile List f7351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public V f7352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D3.p f7353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public P2 f7354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public P2 f7355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Y0 f7356r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0527o0 f7359u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile C0527o0 f7360v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public U5.l0 f7362x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f7357s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0512j0 f7358t = new C0512j0(this, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile C0447n f7361w = C0447n.a(EnumC0446m.f6553d);

    public C0538s0(List list, String str, f2 f2Var, C0514k c0514k, ScheduledExecutorService scheduledExecutorService, f2 f2Var2, U5.p0 p0Var, h2 h2Var, U5.C c3, p072k1.g gVar, C0523n c0523n, U5.F f7, AbstractC0438e abstractC0438e, ArrayList arrayList) {
        p113p3.f.k(list, "addressGroups");
        p113p3.f.d("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p113p3.f.k(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f7351m = listUnmodifiableList;
        C0530p0 c0530p0 = new C0530p0();
        c0530p0.f7306a = listUnmodifiableList;
        this.f7350l = c0530p0;
        this.f7341b = str;
        this.f7342c = f2Var;
        this.f7344e = c0514k;
        this.f7345f = scheduledExecutorService;
        f2Var2.getClass();
        this.f7353o = new D3.p(0);
        this.f7349k = p0Var;
        this.f7343d = h2Var;
        this.f7346g = c3;
        this.f7347h = gVar;
        p113p3.f.k(c0523n, "channelTracer");
        p113p3.f.k(f7, "logId");
        this.f7340a = f7;
        p113p3.f.k(abstractC0438e, "channelLogger");
        this.f7348i = abstractC0438e;
        this.j = arrayList;
    }

    public static void g(C0538s0 c0538s0, EnumC0446m enumC0446m) {
        c0538s0.f7349k.f();
        c0538s0.i(C0447n.a(enumC0446m));
    }

    public static void h(C0538s0 c0538s0) {
        SocketAddress socketAddress;
        C0458z c0458z;
        U5.p0 p0Var = c0538s0.f7349k;
        p0Var.f();
        p113p3.f.q("Should have no reconnectTask scheduled", c0538s0.f7354p == null);
        C0530p0 c0530p0 = c0538s0.f7350l;
        if (c0530p0.f7307b == 0 && c0530p0.f7308c == 0) {
            D3.p pVar = c0538s0.f7353o;
            pVar.f1738b = false;
            pVar.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((C0453u) c0530p0.f7306a.get(c0530p0.f7307b)).f6592a.get(c0530p0.f7308c);
        if (socketAddress2 instanceof C0458z) {
            c0458z = (C0458z) socketAddress2;
            socketAddress = c0458z.f6597b;
        } else {
            socketAddress = socketAddress2;
            c0458z = null;
        }
        C0435b c0435b = ((C0453u) c0530p0.f7306a.get(c0530p0.f7307b)).f6593b;
        String str = (String) c0435b.f6455a.get(C0453u.f6591d);
        C0552x c0552x = new C0552x();
        c0552x.f7387a = "unknown-authority";
        c0552x.f7388b = C0435b.f6454b;
        if (str == null) {
            str = c0538s0.f7341b;
        }
        p113p3.f.k(str, "authority");
        c0552x.f7387a = str;
        c0552x.f7388b = c0435b;
        c0552x.f7389c = c0458z;
        C0535r0 c0535r0 = new C0535r0();
        c0535r0.f7321d = c0538s0.f7340a;
        C0514k c0514k = c0538s0.f7344e;
        X5.f fVar = c0514k.f7260a;
        if (fVar.f7510E) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        C0496e c0496e = fVar.f7506A;
        long j = c0496e.f7186b.get();
        X5.m mVar = new X5.m(fVar, (InetSocketAddress) socketAddress, c0552x.f7387a, c0552x.f7388b, c0552x.f7389c, new RunnableC0085d(new C0083b(c0496e, j, 6), 26));
        if (fVar.f7519z) {
            mVar.f7571G = true;
            mVar.f7572H = j;
            mVar.f7573I = fVar.f7507B;
        }
        C0527o0 c0527o0 = new C0527o0(new C0511j(c0514k, mVar, c0552x.f7387a), c0538s0.f7347h);
        c0535r0.f7321d = c0527o0.f();
        c0538s0.f7359u = c0527o0;
        c0538s0.f7357s.add(c0527o0);
        Runnable runnableB = c0527o0.b(new C0011c(c0538s0, c0527o0));
        if (runnableB != null) {
            p0Var.c(runnableB);
        }
        c0538s0.f7348i.m(2, "Started transport {0}", c0535r0.f7321d);
    }

    public static String j(U5.l0 l0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(l0Var.f6547a);
        String str = l0Var.f6548b;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        Throwable th = l0Var.f6549c;
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // U5.E
    public final U5.F f() {
        return this.f7340a;
    }

    public final void i(C0447n c0447n) {
        this.f7349k.f();
        if (this.f7361w.f6558a != c0447n.f6558a) {
            p113p3.f.q("Cannot transition out of SHUTDOWN to " + c0447n, this.f7361w.f6558a != EnumC0446m.f6554e);
            this.f7361w = c0447n;
            ((U5.M) this.f7343d.f7232b).a(c0447n);
        }
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.b("logId", this.f7340a.f6420c);
        jVarU0.a(this.f7351m, "addressGroups");
        return jVarU0.toString();
    }
}
