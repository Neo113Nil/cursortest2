package W5;

import U5.AbstractC0442i;
import U5.C0437d;
import U5.C0450q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements Y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f6847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U5.p0 f6848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public J f6849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public J f6850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public J f6851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p033e3.h f6852h;
    public U5.l0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public U5.L f6854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6855l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U5.F f6845a = U5.F.a(L.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6846b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
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
                            InterfaceC0549w interfaceC0549wF = AbstractC0494d0.f(l8.a(c0539s1), Boolean.TRUE.equals(c0437d.f6479f));
                            if (interfaceC0549wF != null) {
                                w7 = interfaceC0549wF.a(c0539s1.f7365c, c0539s1.f7364b, c0539s1.f7363a, abstractC0442iArr);
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
            this.f6848d.a();
            return w7;
        } catch (Throwable th) {
            this.f6848d.a();
            throw th;
        }
    }

    @Override // W5.Y0
    public final Runnable b(X0 x1) {
        p033e3.h hVar = (p033e3.h) x1;
        this.f6852h = hVar;
        this.f6849e = new J(hVar, 0);
        this.f6850f = new J(hVar, 1);
        this.f6851g = new J(hVar, 2);
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
                N nR = k7.r(new W(l0Var, EnumC0543u.f7373b, k7.f6839l));
                if (nR != null) {
                    nR.run();
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
                ArrayList<K> arrayList = new ArrayList(this.f6853i);
                ArrayList arrayList2 = new ArrayList();
                for (K k7 : arrayList) {
                    U5.J jA = l7.a(k7.j);
                    C0437d c0437d = k7.j.f7363a;
                    InterfaceC0549w interfaceC0549wF = AbstractC0494d0.f(jA, Boolean.TRUE.equals(c0437d.f6479f));
                    if (interfaceC0549wF != null) {
                        Executor executor = this.f6847c;
                        Executor executor2 = c0437d.f6475b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        C0450q c0450q = k7.f6838k;
                        C0450q c0450qA = c0450q.a();
                        try {
                            C0539s1 c0539s1 = k7.j;
                            InterfaceC0540t interfaceC0540tA = interfaceC0549wF.a(c0539s1.f7365c, c0539s1.f7364b, c0539s1.f7363a, k7.f6839l);
                            c0450q.c(c0450qA);
                            N nR = k7.r(interfaceC0540tA);
                            if (nR != null) {
                                executor.execute(nR);
                            }
                            arrayList2.add(k7);
                        } catch (Throwable th) {
                            c0450q.c(c0450qA);
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
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
