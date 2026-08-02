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
import w1.C1726n0;
import w1.P2;

/* renamed from: W5.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0522m1 extends U5.N {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f7281o = Logger.getLogger(C0522m1.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0438e f7282f;

    /* renamed from: h, reason: collision with root package name */
    public C0530p0 f7284h;

    /* renamed from: k, reason: collision with root package name */
    public P2 f7286k;

    /* renamed from: l, reason: collision with root package name */
    public EnumC0446m f7287l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC0446m f7288m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7289n;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f7283g = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f7285i = 0;
    public boolean j = true;

    public C0522m1(AbstractC0438e abstractC0438e) {
        boolean z4 = false;
        EnumC0446m enumC0446m = EnumC0446m.f6553d;
        this.f7287l = enumC0446m;
        this.f7288m = enumC0446m;
        Logger logger = AbstractC0494d0.f7163a;
        String str = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        str = str == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : str;
        if (!P6.b.x(str) && Boolean.parseBoolean(str)) {
            z4 = true;
        }
        this.f7289n = z4;
        this.f7282f = abstractC0438e;
    }

    @Override // U5.N
    public final U5.l0 a(U5.K k7) {
        List emptyList;
        EnumC0446m enumC0446m;
        if (this.f7287l == EnumC0446m.f6554e) {
            return U5.l0.f6542l.g("Already shut down");
        }
        List list = k7.f6430a;
        boolean isEmpty = list.isEmpty();
        C0435b c0435b = k7.f6431b;
        if (isEmpty) {
            U5.l0 g3 = U5.l0.f6544n.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + c0435b);
            c(g3);
            return g3;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0453u) it.next()) == null) {
                U5.l0 g7 = U5.l0.f6544n.g("NameResolver returned address list with null endpoint. addrs=" + list + ", attrs=" + c0435b);
                c(g7);
                return g7;
            }
        }
        this.j = true;
        C0165x c0165x = AbstractC0167z.f2083b;
        C0164w c0164w = new C0164w();
        c0164w.c(list);
        E3.L d7 = c0164w.d();
        C0530p0 c0530p0 = this.f7284h;
        EnumC0446m enumC0446m2 = EnumC0446m.f6551b;
        if (c0530p0 == null) {
            C0530p0 c0530p02 = new C0530p0();
            c0530p02.f7306a = d7 != null ? d7 : Collections.emptyList();
            this.f7284h = c0530p02;
        } else if (this.f7287l == enumC0446m2) {
            SocketAddress a2 = c0530p0.a();
            C0530p0 c0530p03 = this.f7284h;
            if (d7 != null) {
                emptyList = d7;
            } else {
                c0530p03.getClass();
                emptyList = Collections.emptyList();
            }
            c0530p03.f7306a = emptyList;
            c0530p03.f7307b = 0;
            c0530p03.f7308c = 0;
            if (this.f7284h.e(a2)) {
                return U5.l0.f6536e;
            }
            C0530p0 c0530p04 = this.f7284h;
            c0530p04.f7307b = 0;
            c0530p04.f7308c = 0;
        } else {
            c0530p0.f7306a = d7 != null ? d7 : Collections.emptyList();
            c0530p0.f7307b = 0;
            c0530p0.f7308c = 0;
        }
        HashMap hashMap = this.f7283g;
        HashSet hashSet = new HashSet(hashMap.keySet());
        HashSet hashSet2 = new HashSet();
        C0165x listIterator = d7.listIterator(0);
        while (listIterator.hasNext()) {
            hashSet2.addAll(((C0453u) listIterator.next()).f6592a);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it2.next();
            if (!hashSet2.contains(socketAddress)) {
                ((C0519l1) hashMap.remove(socketAddress)).f7273a.m();
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
        HashMap hashMap = this.f7283g;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((C0519l1) it.next()).f7273a.m();
        }
        hashMap.clear();
        i(EnumC0446m.f6552c, new C0513j1(U5.J.a(l0Var)));
    }

    @Override // U5.N
    public final void e() {
        AbstractC0457y abstractC0457y;
        C0530p0 c0530p0 = this.f7284h;
        if (c0530p0 == null || !c0530p0.c() || this.f7287l == EnumC0446m.f6554e) {
            return;
        }
        SocketAddress a2 = this.f7284h.a();
        HashMap hashMap = this.f7283g;
        boolean containsKey = hashMap.containsKey(a2);
        Logger logger = f7281o;
        if (containsKey) {
            abstractC0457y = ((C0519l1) hashMap.get(a2)).f7273a;
        } else {
            C0510i1 c0510i1 = new C0510i1(this);
            android.support.v4.media.session.t E7 = C1726n0.E();
            E7.x0(AbstractC0158p.i(new C0453u(a2)));
            E7.Q(c0510i1);
            final AbstractC0457y g3 = this.f7282f.g(E7.T());
            if (g3 == null) {
                logger.warning("Was not able to create subchannel for " + a2);
                throw new IllegalStateException("Can't create subchannel");
            }
            C0519l1 c0519l1 = new C0519l1(g3, c0510i1);
            c0510i1.f7247b = c0519l1;
            hashMap.put(a2, c0519l1);
            if (g3.c().f6455a.get(U5.N.f6435d) == null) {
                c0510i1.f7246a = C0447n.a(EnumC0446m.f6551b);
            }
            g3.o(new U5.M() { // from class: W5.h1
                @Override // U5.M
                public final void a(C0447n c0447n) {
                    AbstractC0457y abstractC0457y2;
                    C0522m1 c0522m1 = C0522m1.this;
                    c0522m1.getClass();
                    EnumC0446m enumC0446m = c0447n.f6558a;
                    HashMap hashMap2 = c0522m1.f7283g;
                    AbstractC0457y abstractC0457y3 = g3;
                    C0519l1 c0519l12 = (C0519l1) hashMap2.get((SocketAddress) abstractC0457y3.a().f6592a.get(0));
                    if (c0519l12 == null || (abstractC0457y2 = c0519l12.f7273a) != abstractC0457y3 || enumC0446m == EnumC0446m.f6554e) {
                        return;
                    }
                    EnumC0446m enumC0446m2 = EnumC0446m.f6553d;
                    AbstractC0438e abstractC0438e = c0522m1.f7282f;
                    if (enumC0446m == enumC0446m2) {
                        abstractC0438e.q();
                    }
                    C0519l1.a(c0519l12, enumC0446m);
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
                    int ordinal = enumC0446m.ordinal();
                    if (ordinal == 0) {
                        c0522m1.f7287l = enumC0446m5;
                        c0522m1.i(enumC0446m5, new C0513j1(U5.J.f6425e));
                        return;
                    }
                    if (ordinal == 1) {
                        c0522m1.g();
                        for (C0519l1 c0519l13 : hashMap2.values()) {
                            if (!c0519l13.f7273a.equals(abstractC0457y2)) {
                                c0519l13.f7273a.m();
                            }
                        }
                        hashMap2.clear();
                        EnumC0446m enumC0446m6 = EnumC0446m.f6551b;
                        C0519l1.a(c0519l12, enumC0446m6);
                        hashMap2.put((SocketAddress) abstractC0457y2.a().f6592a.get(0), c0519l12);
                        c0522m1.f7284h.e((SocketAddress) abstractC0457y3.a().f6592a.get(0));
                        c0522m1.f7287l = enumC0446m6;
                        c0522m1.j(c0519l12);
                        return;
                    }
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new IllegalArgumentException("Unsupported state:" + enumC0446m);
                        }
                        C0530p0 c0530p02 = c0522m1.f7284h;
                        c0530p02.f7307b = 0;
                        c0530p02.f7308c = 0;
                        c0522m1.f7287l = enumC0446m2;
                        c0522m1.i(enumC0446m2, new C0516k1(c0522m1, c0522m1));
                        return;
                    }
                    if (c0522m1.f7284h.c() && ((C0519l1) hashMap2.get(c0522m1.f7284h.a())).f7273a == abstractC0457y3 && c0522m1.f7284h.b()) {
                        c0522m1.g();
                        c0522m1.e();
                    }
                    C0530p0 c0530p03 = c0522m1.f7284h;
                    if (c0530p03 == null || c0530p03.c()) {
                        return;
                    }
                    int size = hashMap2.size();
                    List list = c0522m1.f7284h.f7306a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = hashMap2.values().iterator();
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
            abstractC0457y = g3;
        }
        int ordinal = ((C0519l1) hashMap.get(a2)).f7274b.ordinal();
        if (ordinal == 0) {
            if (this.f7289n) {
                h();
                return;
            } else {
                abstractC0457y.l();
                return;
            }
        }
        if (ordinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (ordinal == 2) {
            this.f7284h.b();
            e();
        } else {
            if (ordinal != 3) {
                return;
            }
            abstractC0457y.l();
            C0519l1.a((C0519l1) hashMap.get(a2), EnumC0446m.f6550a);
            h();
        }
    }

    @Override // U5.N
    public final void f() {
        Level level = Level.FINE;
        HashMap hashMap = this.f7283g;
        f7281o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(hashMap.size()));
        EnumC0446m enumC0446m = EnumC0446m.f6554e;
        this.f7287l = enumC0446m;
        this.f7288m = enumC0446m;
        g();
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((C0519l1) it.next()).f7273a.m();
        }
        hashMap.clear();
    }

    public final void g() {
        P2 p22 = this.f7286k;
        if (p22 != null) {
            p22.d();
            this.f7286k = null;
        }
    }

    public final void h() {
        if (this.f7289n) {
            P2 p22 = this.f7286k;
            if (p22 != null) {
                P2.F f7 = (P2.F) p22.f17508b;
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
