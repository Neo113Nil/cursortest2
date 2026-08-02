package W5;

import U5.AbstractC0442i;
import U5.C0437d;
import U5.C0450q;
import e3.C1023h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class L implements Y0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f6847c;

    /* renamed from: d, reason: collision with root package name */
    public final U5.p0 f6848d;

    /* renamed from: e, reason: collision with root package name */
    public J f6849e;

    /* renamed from: f, reason: collision with root package name */
    public J f6850f;

    /* renamed from: g, reason: collision with root package name */
    public J f6851g;

    /* renamed from: h, reason: collision with root package name */
    public C1023h f6852h;
    public U5.l0 j;

    /* renamed from: k, reason: collision with root package name */
    public U5.L f6854k;

    /* renamed from: l, reason: collision with root package name */
    public long f6855l;

    /* renamed from: a, reason: collision with root package name */
    public final U5.F f6845a = U5.F.a(L.class, null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f6846b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public Collection f6853i = new LinkedHashSet();

    public L(Executor executor, U5.p0 p0Var) {
        this.f6847c = executor;
        this.f6848d = p0Var;
    }

    @Override // W5.InterfaceC0549w
    public final InterfaceC0540t a(H2.r rVar, U5.b0 b0Var, C0437d c0437d, AbstractC0442i[] abstractC0442iArr) {
        InterfaceC0540t w7;
        try {
            C0539s1 c0539s1 = new C0539s1(rVar, b0Var, c0437d);
            U5.L l7 = null;
            long j = -1;
            while (true) {
                synchronized (this.f6846b) {
                    U5.l0 l0Var = this.j;
                    if (l0Var == null) {
                        U5.L l8 = this.f6854k;
                        if (l8 != null) {
                            if (l7 != null && j == this.f6855l) {
                                w7 = g(c0539s1, abstractC0442iArr);
                                break;
                            }
                            j = this.f6855l;
                            InterfaceC0549w f7 = AbstractC0494d0.f(l8.a(c0539s1), Boolean.TRUE.equals(c0437d.f6479f));
                            if (f7 != null) {
                                w7 = f7.a(c0539s1.f7365c, c0539s1.f7364b, c0539s1.f7363a, abstractC0442iArr);
                                break;
                            }
                            l7 = l8;
                        } else {
                            w7 = g(c0539s1, abstractC0442iArr);
                            break;
                        }
                    } else {
                        w7 = new W(l0Var, EnumC0543u.f7372a, abstractC0442iArr);
                        break;
                    }
                }
            }
            return w7;
        } finally {
            this.f6848d.a();
        }
    }

    @Override // W5.Y0
    public final Runnable b(X0 x02) {
        C1023h c1023h = (C1023h) x02;
        this.f6852h = c1023h;
        this.f6849e = new J(c1023h, 0);
        this.f6850f = new J(c1023h, 1);
        this.f6851g = new J(c1023h, 2);
        return null;
    }

    @Override // W5.Y0
    public final void c(U5.l0 l0Var) {
        Collection<K> collection;
        J j;
        e(l0Var);
        synchronized (this.f6846b) {
            try {
                collection = this.f6853i;
                j = this.f6851g;
                this.f6851g = null;
                if (!collection.isEmpty()) {
                    this.f6853i = Collections.emptyList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j != null) {
            for (K k7 : collection) {
                N r7 = k7.r(new W(l0Var, EnumC0543u.f7373b, k7.f6839l));
                if (r7 != null) {
                    r7.run();
                }
            }
            this.f6848d.execute(j);
        }
    }

    @Override // W5.Y0
    public final void e(U5.l0 l0Var) {
        J j;
        synchronized (this.f6846b) {
            try {
                if (this.j != null) {
                    return;
                }
                this.j = l0Var;
                this.f6848d.c(new E(5, this, l0Var));
                if (!h() && (j = this.f6851g) != null) {
                    this.f6848d.c(j);
                    this.f6851g = null;
                }
                this.f6848d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U5.E
    public final U5.F f() {
        return this.f6845a;
    }

    public final K g(C0539s1 c0539s1, AbstractC0442i[] abstractC0442iArr) {
        int size;
        K k7 = new K(this, c0539s1, abstractC0442iArr);
        this.f6853i.add(k7);
        synchronized (this.f6846b) {
            size = this.f6853i.size();
        }
        if (size == 1) {
            this.f6848d.c(this.f6849e);
        }
        for (AbstractC0442i abstractC0442i : abstractC0442iArr) {
            abstractC0442i.a();
        }
        return k7;
    }

    public final boolean h() {
        boolean z4;
        synchronized (this.f6846b) {
            z4 = !this.f6853i.isEmpty();
        }
        return z4;
    }

    public final void i(U5.L l7) {
        J j;
        synchronized (this.f6846b) {
            this.f6854k = l7;
            this.f6855l++;
            if (l7 != null && h()) {
                ArrayList arrayList = new ArrayList(this.f6853i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    K k7 = (K) it.next();
                    U5.J a2 = l7.a(k7.j);
                    C0437d c0437d = k7.j.f7363a;
                    InterfaceC0549w f7 = AbstractC0494d0.f(a2, Boolean.TRUE.equals(c0437d.f6479f));
                    if (f7 != null) {
                        Executor executor = this.f6847c;
                        Executor executor2 = c0437d.f6475b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        C0450q c0450q = k7.f6838k;
                        C0450q a4 = c0450q.a();
                        try {
                            C0539s1 c0539s1 = k7.j;
                            InterfaceC0540t a7 = f7.a(c0539s1.f7365c, c0539s1.f7364b, c0539s1.f7363a, k7.f6839l);
                            c0450q.c(a4);
                            N r7 = k7.r(a7);
                            if (r7 != null) {
                                executor.execute(r7);
                            }
                            arrayList2.add(k7);
                        } catch (Throwable th) {
                            c0450q.c(a4);
                            throw th;
                        }
                    }
                }
                synchronized (this.f6846b) {
                    try {
                        if (h()) {
                            this.f6853i.removeAll(arrayList2);
                            if (this.f6853i.isEmpty()) {
                                this.f6853i = new LinkedHashSet();
                            }
                            if (!h()) {
                                this.f6848d.c(this.f6850f);
                                if (this.j != null && (j = this.f6851g) != null) {
                                    this.f6848d.c(j);
                                    this.f6851g = null;
                                }
                            }
                            this.f6848d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
