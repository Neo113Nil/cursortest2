package W5;

import C0.RunnableC0085d;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.C0435b;
import U5.C0447n;
import U5.C0453u;
import U5.EnumC0446m;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p155w1.C1017n0;
import p155w1.P2;

/* JADX INFO: renamed from: W5.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0522m1 extends U5.N {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f7281o = Logger.getLogger(C0522m1.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0438e f7282f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0530p0 f7284h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public P2 f7286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC0446m f7287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public EnumC0446m f7288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7289n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f7283g = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7285i = 0;
    public boolean j = true;

    public C0522m1(AbstractC0438e abstractC0438e) {
        boolean z4 = false;
        EnumC0446m enumC0446m = EnumC0446m.f6553d;
        this.f7287l = enumC0446m;
        this.f7288m = enumC0446m;
        Logger logger = AbstractC0494d0.f7163a;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!P6.b.x(property) && Boolean.parseBoolean(property)) {
            z4 = true;
        }
        this.f7289n = z4;
        this.f7282f = abstractC0438e;
    }

    @Override // U5.N
    public final U5.l0 a(U5.K k7) {
        List listEmptyList;
        EnumC0446m enumC0446m;
        if (this.f7287l == EnumC0446m.f6554e) {
            return U5.l0.f6542l.g("Already shut down");
        }
        List list = k7.f6430a;
        boolean zIsEmpty = list.isEmpty();
        C0435b c0435b = k7.f6431b;
        if (zIsEmpty) {
            U5.l0 l0VarG = U5.l0.f6544n.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + c0435b);
            c(l0VarG);
            return l0VarG;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0453u) it.next()) == null) {
                U5.l0 l0VarG2 = U5.l0.f6544n.g("NameResolver returned address list with null endpoint. addrs=" + list + ", attrs=" + c0435b);
                c(l0VarG2);
                return l0VarG2;
            }
        }
        this.j = true;
        C0165x c0165x = AbstractC0167z.f2083b;
        C0164w c0164w = new C0164w();
        c0164w.c(list);
        E3.L lD = c0164w.d();
        C0530p0 c0530p0 = this.f7284h;
        EnumC0446m enumC0446m2 = EnumC0446m.f6551b;
        if (c0530p0 == null) {
            C0530p0 c0530p1 = new C0530p0();
            c0530p1.f7306a = lD != null ? lD : Collections.emptyList();
            this.f7284h = c0530p1;
        } else if (this.f7287l == enumC0446m2) {
            SocketAddress socketAddressA = c0530p0.a();
            C0530p0 c0530p2 = this.f7284h;
            if (lD != null) {
                listEmptyList = lD;
            } else {
                c0530p2.getClass();
                listEmptyList = Collections.emptyList();
            }
            c0530p2.f7306a = listEmptyList;
            c0530p2.f7307b = 0;
            c0530p2.f7308c = 0;
            if (this.f7284h.e(socketAddressA)) {
                return U5.l0.f6536e;
            }
            C0530p0 c0530p3 = this.f7284h;
            c0530p3.f7307b = 0;
            c0530p3.f7308c = 0;
        } else {
            c0530p0.f7306a = lD != null ? lD : Collections.emptyList();
            c0530p0.f7307b = 0;
            c0530p0.f7308c = 0;
        }
        HashMap map = this.f7283g;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        C0165x c0165xListIterator = lD.listIterator(0);
        while (c0165xListIterator.hasNext()) {
            hashSet2.addAll(((C0453u) c0165xListIterator.next()).f6592a);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((C0519l1) map.remove(socketAddress)).f7273a.m();
            }
        }
        int size = hashSet.size();
        EnumC0446m enumC0446m3 = EnumC0446m.f6550a;
        if (size == 0 || (enumC0446m = this.f7287l) == enumC0446m3 || enumC0446m == enumC0446m2) {
            this.f7287l = enumC0446m3;
            i(enumC0446m3, new C0513j1(U5.J.f6425e));
            g();
            e();
        } else {
            EnumC0446m enumC0446m4 = EnumC0446m.f6553d;
            if (enumC0446m == enumC0446m4) {
                i(enumC0446m4, new C0516k1(this, this));
            } else if (enumC0446m == EnumC0446m.f6552c) {
                g();
                e();
            }
        }
        return U5.l0.f6536e;
    }

    @Override // U5.N
    public final void c(U5.l0 l0Var) {
        HashMap map = this.f7283g;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C0519l1) it.next()).f7273a.m();
        }
        map.clear();
        i(EnumC0446m.f6552c, new C0513j1(U5.J.a(l0Var)));
    }

    @Override // U5.N
    public final void e() {
        AbstractC0457y abstractC0457y;
        C0530p0 c0530p0 = this.f7284h;
        if (c0530p0 == null || !c0530p0.c() || this.f7287l == EnumC0446m.f6554e) {
            return;
        }
        SocketAddress socketAddressA = this.f7284h.a();
        HashMap map = this.f7283g;
        boolean zContainsKey = map.containsKey(socketAddressA);
        Logger logger = f7281o;
        if (zContainsKey) {
            abstractC0457y = ((C0519l1) map.get(socketAddressA)).f7273a;
        } else {
            C0510i1 c0510i1 = new C0510i1(this);
            android.support.v4.media.session.t tVarE = C1017n0.E();
            tVarE.x0(AbstractC0158p.i(new C0453u(socketAddressA)));
            tVarE.Q(c0510i1);
            final AbstractC0457y abstractC0457yG = this.f7282f.g(tVarE.T());
            if (abstractC0457yG == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressA);
                throw new IllegalStateException("Can't create subchannel");
            }
            C0519l1 c0519l1 = new C0519l1(abstractC0457yG, c0510i1);
            c0510i1.f7247b = c0519l1;
            map.put(socketAddressA, c0519l1);
            if (abstractC0457yG.c().f6455a.get(U5.N.f6435d) == null) {
                c0510i1.f7246a = C0447n.a(EnumC0446m.f6551b);
            }
            abstractC0457yG.o(new U5.M() { // from class: W5.h1
                @Override // U5.M
                public final void a(C0447n c0447n) {
                    AbstractC0457y abstractC0457y2;
                    C0522m1 c0522m1 = this.f7228a;
                    c0522m1.getClass();
                    EnumC0446m enumC0446m = c0447n.f6558a;
                    HashMap map2 = c0522m1.f7283g;
                    AbstractC0457y abstractC0457y3 = abstractC0457yG;
                    C0519l1 c0519l2 = (C0519l1) map2.get((SocketAddress) abstractC0457y3.a().f6592a.get(0));
                    if (c0519l2 == null || (abstractC0457y2 = c0519l2.f7273a) != abstractC0457y3 || enumC0446m == EnumC0446m.f6554e) {
                        return;
                    }
                    EnumC0446m enumC0446m2 = EnumC0446m.f6553d;
                    AbstractC0438e abstractC0438e = c0522m1.f7282f;
                    if (enumC0446m == enumC0446m2) {
                        abstractC0438e.q();
                    }
                    C0519l1.a(c0519l2, enumC0446m);
                    EnumC0446m enumC0446m3 = c0522m1.f7287l;
                    EnumC0446m enumC0446m4 = EnumC0446m.f6552c;
                    EnumC0446m enumC0446m5 = EnumC0446m.f6550a;
                    if (enumC0446m3 == enumC0446m4 || c0522m1.f7288m == enumC0446m4) {
                        if (enumC0446m == enumC0446m5) {
                            return;
                        }
                        if (enumC0446m == enumC0446m2) {
                            c0522m1.e();
                            return;
                        }
                    }
                    int iOrdinal = enumC0446m.ordinal();
                    if (iOrdinal == 0) {
                        c0522m1.f7287l = enumC0446m5;
                        c0522m1.i(enumC0446m5, new C0513j1(U5.J.f6425e));
                        return;
                    }
                    if (iOrdinal == 1) {
                        c0522m1.g();
                        for (C0519l1 c0519l3 : map2.values()) {
                            if (!c0519l3.f7273a.equals(abstractC0457y2)) {
                                c0519l3.f7273a.m();
                            }
                        }
                        map2.clear();
                        EnumC0446m enumC0446m6 = EnumC0446m.f6551b;
                        C0519l1.a(c0519l2, enumC0446m6);
                        map2.put((SocketAddress) abstractC0457y2.a().f6592a.get(0), c0519l2);
                        c0522m1.f7284h.e((SocketAddress) abstractC0457y3.a().f6592a.get(0));
                        c0522m1.f7287l = enumC0446m6;
                        c0522m1.j(c0519l2);
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new IllegalArgumentException("Unsupported state:" + enumC0446m);
                        }
                        C0530p0 c0530p1 = c0522m1.f7284h;
                        c0530p1.f7307b = 0;
                        c0530p1.f7308c = 0;
                        c0522m1.f7287l = enumC0446m2;
                        c0522m1.i(enumC0446m2, new C0516k1(c0522m1, c0522m1));
                        return;
                    }
                    if (c0522m1.f7284h.c() && ((C0519l1) map2.get(c0522m1.f7284h.a())).f7273a == abstractC0457y3 && c0522m1.f7284h.b()) {
                        c0522m1.g();
                        c0522m1.e();
                    }
                    C0530p0 c0530p2 = c0522m1.f7284h;
                    if (c0530p2 == null || c0530p2.c()) {
                        return;
                    }
                    int size = map2.size();
                    List list = c0522m1.f7284h.f7306a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((C0519l1) it.next()).f7276d) {
                            return;
                        }
                    }
                    c0522m1.f7287l = enumC0446m4;
                    c0522m1.i(enumC0446m4, new C0513j1(U5.J.a(c0447n.f6559b)));
                    int i7 = c0522m1.f7285i + 1;
                    c0522m1.f7285i = i7;
                    List list2 = c0522m1.f7284h.f7306a;
                    if (i7 >= (list2 != null ? list2.size() : 0) || c0522m1.j) {
                        c0522m1.j = false;
                        c0522m1.f7285i = 0;
                        abstractC0438e.q();
                    }
                }
            });
            abstractC0457y = abstractC0457yG;
        }
        int iOrdinal = ((C0519l1) map.get(socketAddressA)).f7274b.ordinal();
        if (iOrdinal == 0) {
            if (this.f7289n) {
                h();
                return;
            } else {
                abstractC0457y.l();
                return;
            }
        }
        if (iOrdinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.f7284h.b();
            e();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            abstractC0457y.l();
            C0519l1.a((C0519l1) map.get(socketAddressA), EnumC0446m.f6550a);
            h();
        }
    }

    @Override // U5.N
    public final void f() {
        Level level = Level.FINE;
        HashMap map = this.f7283g;
        f7281o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        EnumC0446m enumC0446m = EnumC0446m.f6554e;
        this.f7287l = enumC0446m;
        this.f7288m = enumC0446m;
        g();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C0519l1) it.next()).f7273a.m();
        }
        map.clear();
    }

    public final void g() {
        P2 p5 = this.f7286k;
        if (p5 != null) {
            p5.d();
            this.f7286k = null;
        }
    }

    public final void h() {
        if (this.f7289n) {
            P2 p5 = this.f7286k;
            if (p5 != null) {
                P2.F f7 = (P2.F) p5.f17514b;
                if (!f7.f5421c && !f7.f5420b) {
                    return;
                }
            }
            AbstractC0438e abstractC0438e = this.f7282f;
            this.f7286k = abstractC0438e.j().e(new RunnableC0085d(this, 20), 250L, TimeUnit.MILLISECONDS, abstractC0438e.i());
        }
    }

    public final void i(EnumC0446m enumC0446m, U5.L l7) {
        if (enumC0446m == this.f7288m && (enumC0446m == EnumC0446m.f6553d || enumC0446m == EnumC0446m.f6550a)) {
            return;
        }
        this.f7288m = enumC0446m;
        this.f7282f.r(enumC0446m, l7);
    }

    public final void j(C0519l1 c0519l1) {
        EnumC0446m enumC0446m = c0519l1.f7274b;
        EnumC0446m enumC0446m2 = EnumC0446m.f6551b;
        if (enumC0446m != enumC0446m2) {
            return;
        }
        C0447n c0447n = c0519l1.f7275c.f7246a;
        EnumC0446m enumC0446m3 = c0447n.f6558a;
        if (enumC0446m3 == enumC0446m2) {
            i(enumC0446m2, new D0(U5.J.b(c0519l1.f7273a, null)));
            return;
        }
        EnumC0446m enumC0446m4 = EnumC0446m.f6552c;
        if (enumC0446m3 == enumC0446m4) {
            i(enumC0446m4, new C0513j1(U5.J.a(c0447n.f6559b)));
        } else if (this.f7288m != enumC0446m4) {
            i(enumC0446m3, new C0513j1(U5.J.f6425e));
        }
    }
}
