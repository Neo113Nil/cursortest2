package W5;

import A1.C0011c;
import C0.RunnableC0085d;
import U5.AbstractC0438e;
import U5.AbstractC0439f;
import U5.C0434a;
import U5.C0435b;
import U5.C0447n;
import U5.C0452t;
import U5.C0453u;
import U5.C0458z;
import U5.EnumC0446m;
import U5.InterfaceC0444k;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.protobuf.AbstractC0847a;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p155w1.C1017n0;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6762c;

    public /* synthetic */ E(int i7, Object obj, Object obj2) {
        this.f6760a = i7;
        this.f6761b = obj;
        this.f6762c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bc A[Catch: all -> 0x00b9, TryCatch #5 {all -> 0x00b9, blocks: (B:15:0x005e, B:35:0x00ed, B:18:0x006d, B:20:0x008d, B:22:0x0099, B:27:0x00a7, B:30:0x00bc, B:34:0x00e1, B:33:0x00cb), top: B:289:0x005e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb A[Catch: all -> 0x00b9, TryCatch #5 {all -> 0x00b9, blocks: (B:15:0x005e, B:35:0x00ed, B:18:0x006d, B:20:0x008d, B:22:0x0099, B:27:0x00a7, B:30:0x00bc, B:34:0x00e1, B:33:0x00cb), top: B:289:0x005e }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        List listSingletonList;
        U5.e0 e0Var;
        E2.g gVar;
        C0527o0 c0527o0;
        W0 w7;
        U5.l0 l0VarA;
        Object obj;
        J1 j3;
        int i7 = 2;
        C1017n0 c1017n0 = null;
        c0011c = null;
        C0011c c0011c = null;
        c1017n0 = null;
        C1017n0 c1017n1 = null;
        boolean z4 = false;
        objArr = 0;
        Object[] objArr = 0;
        int i8 = 0;
        z = false;
        boolean z7 = false;
        z = false;
        boolean z8 = false;
        z4 = false;
        boolean z9 = true;
        char c3 = 1;
        switch (this.f6760a) {
            case 0:
                ((M0) this.f6761b).f(U5.l0.f6539h.g(((StringBuilder) this.f6762c).toString()), true);
                return;
            case 1:
                AbstractC0439f abstractC0439f = ((M0) this.f6761b).f6869f;
                U5.l0 l0Var = (U5.l0) this.f6762c;
                abstractC0439f.a(l0Var.f6548b, l0Var.f6549c);
                return;
            case 2:
                ((M0) this.f6761b).f6869f.d((com.google.protobuf.C) this.f6762c);
                return;
            case 3:
                ((I) this.f6761b).f6819a.h((U5.b0) this.f6762c);
                return;
            case 4:
                ((I) this.f6761b).f6819a.i((AbstractC0847a) this.f6762c);
                return;
            case 5:
                p113p3.f.q("Channel must have been shut down", ((Q0) ((L) this.f6761b).f6852h.f12673a).f6939J.get());
                return;
            case 6:
                ((P) this.f6761b).f6903c.a((InterfaceC0444k) this.f6762c);
                return;
            case 7:
                ((P) this.f6761b).f6903c.k((C0452t) this.f6762c);
                return;
            case 8:
                ((P) this.f6761b).f6903c.l((U5.r) this.f6762c);
                return;
            case 9:
                ((P) this.f6761b).f6903c.g((p016b6.a) this.f6762c);
                return;
            case 10:
                ((P) this.f6761b).f6903c.f((U5.l0) this.f6762c);
                return;
            case 11:
                ((O) this.f6761b).f6891a.J((p096n1.e) this.f6762c);
                return;
            case 12:
                ((O) this.f6761b).f6891a.d((U5.b0) this.f6762c);
                return;
            case 13:
                AbstractC0438e abstractC0438e = (AbstractC0438e) this.f6762c;
                Logger logger = T.f7030s;
                Level level = Level.FINER;
                boolean zIsLoggable = logger.isLoggable(level);
                T t7 = (T) this.f6761b;
                if (zIsLoggable) {
                    logger.finer("Attempting DNS resolution of " + t7.f7041f);
                }
                try {
                    try {
                        C0458z c0458zA = t7.f7036a.a(InetSocketAddress.createUnresolved(t7.f7041f, t7.f7042g));
                        C0453u c0453u = c0458zA != null ? new C0453u(c0458zA) : null;
                        List listEmptyList = Collections.emptyList();
                        C0435b c0435b = C0435b.f6454b;
                        U5.p0 p0Var = t7.j;
                        if (c0453u == null) {
                            C1017n0 c1017n0Q = t7.q();
                            try {
                                U5.l0 l0Var2 = (U5.l0) c1017n0Q.f17811b;
                                if (l0Var2 != null) {
                                    abstractC0438e.o(l0Var2);
                                    gVar = new E2.g(this, ((U5.l0) c1017n0Q.f17811b) == null, i7);
                                } else {
                                    List list = (List) c1017n0Q.f17812c;
                                    if (list != null) {
                                        listEmptyList = list;
                                    }
                                    U5.e0 e0Var2 = (U5.e0) c1017n0Q.f17813d;
                                    U5.e0 e0Var3 = e0Var2 != null ? e0Var2 : null;
                                    listSingletonList = listEmptyList;
                                    e0Var = e0Var3;
                                    c1017n0 = c1017n0Q;
                                }
                                p0Var.execute(gVar);
                                return;
                            } catch (IOException e7) {
                                e = e7;
                                c1017n0 = c1017n0Q;
                                abstractC0438e.o(U5.l0.f6544n.g("Unable to resolve host " + t7.f7041f).f(e));
                                if (c1017n0 != null && ((U5.l0) c1017n0.f17811b) == null) {
                                    z8 = true;
                                }
                                t7.j.execute(new E2.g(this, z8, i7));
                                return;
                            } catch (Throwable th) {
                                th = th;
                                c1017n1 = c1017n0Q;
                                if (c1017n1 != null && ((U5.l0) c1017n1.f17811b) == null) {
                                    z4 = true;
                                }
                                t7.j.execute(new E2.g(this, z4, i7));
                                throw th;
                            }
                        }
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + c0453u);
                        }
                        listSingletonList = Collections.singletonList(c0453u);
                        e0Var = null;
                        abstractC0438e.p(new U5.f0(listSingletonList, c0435b, e0Var));
                        if (c1017n0 != null && ((U5.l0) c1017n0.f17811b) == null) {
                            z7 = true;
                        }
                        gVar = new E2.g(this, z7, i7);
                        p0Var.execute(gVar);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e8) {
                    e = e8;
                }
                break;
            case 14:
                C0530p0 c0530p0 = ((C0538s0) this.f6761b).f7350l;
                SocketAddress socketAddress = (SocketAddress) ((C0453u) c0530p0.f7306a.get(c0530p0.f7307b)).f6592a.get(c0530p0.f7308c);
                C0530p0 c0530p1 = ((C0538s0) this.f6761b).f7350l;
                c0530p1.f7306a = (List) this.f6762c;
                c0530p1.d();
                ((C0538s0) this.f6761b).f7351m = (List) this.f6762c;
                EnumC0446m enumC0446m = ((C0538s0) this.f6761b).f7361w.f6558a;
                EnumC0446m enumC0446m2 = EnumC0446m.f6551b;
                if (enumC0446m == enumC0446m2 || ((C0538s0) this.f6761b).f7361w.f6558a == EnumC0446m.f6550a) {
                    C0530p0 c0530p2 = ((C0538s0) this.f6761b).f7350l;
                    while (true) {
                        if (i8 < c0530p2.f7306a.size()) {
                            int iIndexOf = ((C0453u) c0530p2.f7306a.get(i8)).f6592a.indexOf(socketAddress);
                            if (iIndexOf == -1) {
                                i8++;
                            } else {
                                c0530p2.f7307b = i8;
                                c0530p2.f7308c = iIndexOf;
                            }
                        } else if (((C0538s0) this.f6761b).f7361w.f6558a == enumC0446m2) {
                            c0527o0 = ((C0538s0) this.f6761b).f7360v;
                            ((C0538s0) this.f6761b).f7360v = null;
                            ((C0538s0) this.f6761b).f7350l.d();
                            C0538s0.g((C0538s0) this.f6761b, EnumC0446m.f6553d);
                        } else {
                            ((C0538s0) this.f6761b).f7359u.e(U5.l0.f6544n.g("InternalSubchannel closed pending transport due to address change"));
                            C0538s0 c0538s0 = (C0538s0) this.f6761b;
                            c0538s0.f7359u = null;
                            c0538s0.f7350l.d();
                            C0538s0.h((C0538s0) this.f6761b);
                        }
                        c0527o0 = null;
                    }
                } else {
                    c0527o0 = null;
                }
                if (c0527o0 != null) {
                    C0538s0 c0538s1 = (C0538s0) this.f6761b;
                    if (c0538s1.f7355q != null) {
                        c0538s1.f7356r.e(U5.l0.f6544n.g("InternalSubchannel closed transport early due to address change"));
                        ((C0538s0) this.f6761b).f7355q.d();
                        C0538s0 c0538s2 = (C0538s0) this.f6761b;
                        c0538s2.f7355q = null;
                        c0538s2.f7356r = null;
                    }
                    C0538s0 c0538s3 = (C0538s0) this.f6761b;
                    c0538s3.f7356r = c0527o0;
                    c0538s3.f7355q = c0538s3.f7349k.e(new RunnableC0085d(this, 16), 5L, TimeUnit.SECONDS, c0538s3.f7345f);
                    return;
                }
                return;
            case 15:
                if (((C0538s0) ((C0011c) this.f6761b).f334d).f7361w.f6558a == EnumC0446m.f6554e) {
                    return;
                }
                C0527o0 c0527o1 = ((C0538s0) ((C0011c) this.f6761b).f334d).f7360v;
                C0011c c0011c2 = (C0011c) this.f6761b;
                C0527o0 c0527o2 = (C0527o0) c0011c2.f333c;
                if (c0527o1 == c0527o2) {
                    ((C0538s0) c0011c2.f334d).f7360v = null;
                    ((C0538s0) ((C0011c) this.f6761b).f334d).f7350l.d();
                    C0538s0.g((C0538s0) ((C0011c) this.f6761b).f334d, EnumC0446m.f6553d);
                    return;
                }
                C0538s0 c0538s4 = (C0538s0) c0011c2.f334d;
                if (c0538s4.f7359u == c0527o2) {
                    p113p3.f.s(c0538s4.f7361w.f6558a == EnumC0446m.f6550a, "Expected state is CONNECTING, actual state is %s", ((C0538s0) ((C0011c) this.f6761b).f334d).f7361w.f6558a);
                    C0530p0 c0530p3 = ((C0538s0) ((C0011c) this.f6761b).f334d).f7350l;
                    C0453u c0453u2 = (C0453u) c0530p3.f7306a.get(c0530p3.f7307b);
                    int i9 = c0530p3.f7308c + 1;
                    c0530p3.f7308c = i9;
                    if (i9 >= c0453u2.f6592a.size()) {
                        c0530p3.f7307b++;
                        c0530p3.f7308c = 0;
                    }
                    C0530p0 c0530p4 = ((C0538s0) ((C0011c) this.f6761b).f334d).f7350l;
                    if (c0530p4.f7307b < c0530p4.f7306a.size()) {
                        C0538s0.h((C0538s0) ((C0011c) this.f6761b).f334d);
                        return;
                    }
                    C0538s0 c0538s5 = (C0538s0) ((C0011c) this.f6761b).f334d;
                    c0538s5.f7359u = null;
                    c0538s5.f7350l.d();
                    C0538s0 c0538s6 = (C0538s0) ((C0011c) this.f6761b).f334d;
                    U5.l0 l0Var3 = (U5.l0) this.f6762c;
                    c0538s6.f7349k.f();
                    p113p3.f.d("The error status must not be OK", !l0Var3.e());
                    c0538s6.i(new C0447n(EnumC0446m.f6552c, l0Var3));
                    if (c0538s6.f7352n == null) {
                        c0538s6.f7342c.getClass();
                        c0538s6.f7352n = f2.g();
                    }
                    long jA = c0538s6.f7352n.a();
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA2 = jA - c0538s6.f7353o.a(timeUnit);
                    c0538s6.f7348i.m(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", C0538s0.j(l0Var3), Long.valueOf(jA2));
                    p113p3.f.q("previous reconnectTask is not done", c0538s6.f7354p == null);
                    c0538s6.f7354p = c0538s6.f7349k.e(new RunnableC0515k0(c0538s6, z4 ? 1 : 0), jA2, timeUnit, c0538s6.f7345f);
                    return;
                }
                return;
            case 16:
                J0 j7 = (J0) this.f6761b;
                j7.getClass();
                Logger logger2 = Q0.f6922g0;
                Level level2 = Level.WARNING;
                Q0 q1 = j7.f6829f;
                U5.F f7 = q1.f6958d;
                U5.l0 l0Var4 = (U5.l0) this.f6762c;
                logger2.log(level2, "[{0}] Failed to resolve name. status={1}", new Object[]{f7, l0Var4});
                N0 n2 = q1.f6949T;
                if (n2.f6883d.get() == Q0.f6928m0) {
                    n2.t(null);
                }
                if (q1.f6963f0 != 3) {
                    q1.f6947R.m(3, "Failed to resolve name: {0}", l0Var4);
                    q1.f6963f0 = 3;
                }
                I0 i10 = q1.f6930A;
                I0 i11 = j7.f6827d;
                if (i11 != i10) {
                    return;
                }
                ((U5.N) i11.f6822d.f17380c).c(l0Var4);
                return;
            case 17:
                J0 j8 = (J0) this.f6761b;
                Q0 q7 = j8.f6829f;
                if (q7.f6981y != j8.f6828e) {
                    return;
                }
                U5.f0 f0Var = (U5.f0) this.f6762c;
                List list2 = f0Var.f6494a;
                q7.f6947R.m(1, "Resolved address: {0}, config={1}", list2, f0Var.f6495b);
                Q0 q8 = ((J0) this.f6761b).f6829f;
                if (q8.f6963f0 != 2) {
                    q8.f6947R.m(2, "Address resolved: {0}", list2);
                    ((J0) this.f6761b).f6829f.f6963f0 = 2;
                }
                U5.f0 f0Var2 = (U5.f0) this.f6762c;
                U5.e0 e0Var4 = f0Var2.f6496c;
                P1 p5 = (P1) f0Var2.f6495b.f6455a.get(R1.f7015d);
                C0435b c0435b2 = ((U5.f0) this.f6762c).f6495b;
                C0434a c0434a = U5.D.f6416a;
                U5.D d7 = (U5.D) c0435b2.f6455a.get(c0434a);
                W0 w8 = (e0Var4 == null || (obj = e0Var4.f6493b) == null) ? null : (W0) obj;
                U5.l0 l0Var5 = e0Var4 != null ? e0Var4.f6492a : null;
                Q0 q9 = ((J0) this.f6761b).f6829f;
                if (q9.f6952W) {
                    if (w8 != null) {
                        if (d7 != null) {
                            q9.f6949T.t(d7);
                            if (w8.b() != null) {
                                ((J0) this.f6761b).f6829f.f6947R.l(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            q9.f6949T.t(w8.b());
                        }
                    } else if (l0Var5 == null) {
                        w8 = Q0.f6927l0;
                        q9.f6949T.t(null);
                    } else {
                        if (!q9.f6951V) {
                            q9.f6947R.l(2, "Fallback to error due to invalid first service config without default config");
                            ((J0) this.f6761b).o(e0Var4.f6492a);
                            if (p5 != null) {
                                boolean zE = e0Var4.f6492a.e();
                                R1 r7 = p5.f6919a;
                                if (!zE) {
                                    r7.f7017b.a(new RunnableC0085d(r7, 24));
                                    return;
                                }
                                C0508i c0508i = r7.f7017b;
                                U5.p0 p0Var2 = c0508i.f7236b;
                                p0Var2.f();
                                p0Var2.execute(new A1.K0(c0508i, 16));
                                return;
                            }
                            return;
                        }
                        w8 = q9.f6950U;
                    }
                    if (!w8.equals(((J0) this.f6761b).f6829f.f6950U)) {
                        ((J0) this.f6761b).f6829f.f6947R.m(2, "Service config changed{0}", w8 == Q0.f6927l0 ? " to empty" : "");
                        Q0 q10 = ((J0) this.f6761b).f6829f;
                        q10.f6950U = w8;
                        q10.f6959d0.f6749a = w8.f7082d;
                    }
                    try {
                        ((J0) this.f6761b).f6829f.f6951V = true;
                    } catch (RuntimeException e9) {
                        Q0.f6922g0.log(Level.WARNING, "[" + ((J0) this.f6761b).f6829f.f6958d + "] Unexpected exception from parsing service config", (Throwable) e9);
                    }
                    w7 = w8;
                    break;
                } else {
                    if (w8 != null) {
                        q9.f6947R.l(2, "Service config from name resolver discarded by channel settings");
                    }
                    ((J0) this.f6761b).f6829f.getClass();
                    w7 = Q0.f6927l0;
                    if (d7 != null) {
                        ((J0) this.f6761b).f6829f.f6947R.l(2, "Config selector from name resolver discarded by channel settings");
                    }
                    ((J0) this.f6761b).f6829f.f6949T.t(w7.b());
                }
                C0435b c0435b3 = ((U5.f0) this.f6762c).f6495b;
                J0 j9 = (J0) this.f6761b;
                if (j9.f6827d == j9.f6829f.f6930A) {
                    c0435b3.getClass();
                    P2 p7 = new P2(c0435b3);
                    if (((C0435b) p7.f17514b).f6455a.containsKey(c0434a)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(((C0435b) p7.f17514b).f6455a);
                        identityHashMap.remove(c0434a);
                        p7.f17514b = new C0435b(identityHashMap);
                    }
                    IdentityHashMap identityHashMap2 = (IdentityHashMap) p7.f17515c;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(c0434a);
                    }
                    Map map = w7.f7084f;
                    if (map != null) {
                        p7.P(U5.N.f6433b, map);
                        p7.b();
                    }
                    C0435b c0435bB = p7.b();
                    p155w1.F0 f8 = ((J0) this.f6761b).f6827d.f6822d;
                    C0435b c0435b4 = C0435b.f6454b;
                    U5.K k7 = new U5.K(list2, c0435bB, w7.f7083e);
                    f8.getClass();
                    Y1 y4 = (Y1) k7.f6432c;
                    I0 i12 = (I0) f8.f17379b;
                    if (y4 == null) {
                        try {
                            h2 h2Var = (h2) f8.f17382e;
                            String str = (String) h2Var.f7233c;
                            U5.O oB = ((U5.P) h2Var.f7232b).b(str);
                            if (oB == null) {
                                throw new C0505h("Trying to load '" + str + "' because using default policy, but it's unavailable");
                            }
                            y4 = new Y1(oB, null);
                        } catch (C0505h e10) {
                            i12.r(EnumC0446m.f6552c, new C0513j1(U5.l0.f6543m.g(e10.getMessage())));
                            ((U5.N) f8.f17380c).f();
                            f8.f17381d = null;
                            f8.f17380c = new C0502g();
                            l0VarA = U5.l0.f6536e;
                        }
                    }
                    U5.O o7 = (U5.O) f8.f17381d;
                    U5.O o8 = y4.f7095a;
                    if (o7 == null || !o8.a().equals(((U5.O) f8.f17381d).a())) {
                        i12.r(EnumC0446m.f6550a, new C0499f(0));
                        ((U5.N) f8.f17380c).f();
                        f8.f17381d = o8;
                        U5.N n7 = (U5.N) f8.f17380c;
                        f8.f17380c = o8.d(i12);
                        i12.f6823e.f6947R.m(2, "Load balancer changed from {0} to {1}", n7.getClass().getSimpleName(), ((U5.N) f8.f17380c).getClass().getSimpleName());
                    }
                    Object obj2 = y4.f7096b;
                    if (obj2 != null) {
                        i12.f6823e.f6947R.m(1, "Load-balancing config: {0}", obj2);
                    }
                    l0VarA = ((U5.N) f8.f17380c).a(new U5.K(k7.f6430a, k7.f6431b, obj2));
                    if (p5 != null) {
                        boolean zE2 = l0VarA.e();
                        R1 r8 = p5.f6919a;
                        if (!zE2) {
                            r8.f7017b.a(new RunnableC0085d(r8, 24));
                            return;
                        }
                        C0508i c0508i2 = r8.f7017b;
                        U5.p0 p0Var3 = c0508i2.f7236b;
                        p0Var3.f();
                        p0Var3.execute(new A1.K0(c0508i2, 16));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                N0 n8 = (N0) this.f6762c;
                Object obj3 = n8.f6883d.get();
                B0 b7 = Q0.f6928m0;
                M0 m7 = (M0) this.f6761b;
                if (obj3 != b7) {
                    m7.i();
                    return;
                }
                Q0 q11 = n8.f6886g;
                if (q11.f6934E == null) {
                    q11.f6934E = new LinkedHashSet();
                    q11.c0.o(q11.f6935F, true);
                }
                q11.f6934E.add(m7);
                return;
            case 19:
                ((C0532q) this.f6762c).run();
                M0 m8 = (M0) this.f6761b;
                m8.f6876n.f6886g.f6972p.execute(new F(m8, z9 ? 1 : 0));
                return;
            case 20:
                synchronized (((F0) ((E) this.f6761b).f6761b).f6785i) {
                    try {
                        E e11 = (E) this.f6761b;
                        if (((C0011c) e11.f6762c).f332b) {
                            objArr = 1;
                        } else {
                            F0 f9 = (F0) e11.f6761b;
                            f9.f6790o = f9.f6790o.a((M1) this.f6762c);
                            F0 f10 = (F0) ((E) this.f6761b).f6761b;
                            if (f10.t(f10.f6790o)) {
                                N1 n9 = ((F0) ((E) this.f6761b).f6761b).f6788m;
                                if (n9 != null) {
                                    if (n9.f6890d.get() <= n9.f6888b) {
                                        c3 = 0;
                                    }
                                    if (c3 == 0) {
                                        F0 f11 = (F0) ((E) this.f6761b).f6761b;
                                        j3 = f11.f6790o;
                                        if (j3.f6837h) {
                                            j3 = new J1(j3.f6831b, j3.f6832c, j3.f6833d, j3.f6835f, j3.f6836g, j3.f6830a, true, j3.f6834e);
                                        }
                                        f11.f6790o = j3;
                                        ((F0) ((E) this.f6761b).f6761b).f6798w = null;
                                    }
                                }
                                F0 f12 = (F0) ((E) this.f6761b).f6761b;
                                c0011c = new C0011c(f12.f6785i);
                                f12.f6798w = c0011c;
                            } else {
                                F0 f13 = (F0) ((E) this.f6761b).f6761b;
                                j3 = f13.f6790o;
                                if (j3.f6837h) {
                                    j3 = new J1(j3.f6831b, j3.f6832c, j3.f6833d, j3.f6835f, j3.f6836g, j3.f6830a, true, j3.f6834e);
                                }
                                f13.f6790o = j3;
                                ((F0) ((E) this.f6761b).f6761b).f6798w = null;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                if (objArr != 0) {
                    M1 m9 = (M1) this.f6762c;
                    m9.f6877a.e(new h2(4, (F0) ((E) this.f6761b).f6761b, m9));
                    ((M1) this.f6762c).f6877a.f(U5.l0.f6537f.g("Unneeded hedging"));
                    return;
                } else {
                    if (c0011c != null) {
                        F0 f14 = (F0) ((E) this.f6761b).f6761b;
                        c0011c.i(f14.f6780d.schedule(new E(21, f14, c0011c), f14.f6783g.f7204b, TimeUnit.NANOSECONDS));
                    }
                    ((F0) ((E) this.f6761b).f6761b).r((M1) this.f6762c);
                    return;
                }
            case zzbbd.zzt.zzm /* 21 */:
                F0 f15 = (F0) this.f6761b;
                M1 m1P = f15.p(f15.f6790o.f6834e, false);
                if (m1P == null) {
                    return;
                }
                ((F0) this.f6761b).f6778b.execute(new E(20, this, m1P));
                return;
            case 22:
                ((F0) ((h2) this.f6761b).f7233c).f6796u.d((U5.b0) this.f6762c);
                return;
            default:
                ((F0) ((h2) this.f6761b).f7233c).f6796u.J((p096n1.e) this.f6762c);
                return;
        }
    }

    public E(T t7, AbstractC0438e abstractC0438e) {
        this.f6760a = 13;
        this.f6761b = t7;
        p113p3.f.k(abstractC0438e, "savedListener");
        this.f6762c = abstractC0438e;
    }

    public E(N0 n2, M0 m7) {
        this.f6760a = 18;
        this.f6762c = n2;
        this.f6761b = m7;
    }
}
