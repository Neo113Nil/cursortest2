package W5;

import U5.C0452t;
import U5.InterfaceC0444k;
import b6.C0789a;
import io.sentry.clientreport.DiscardedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class P implements InterfaceC0540t {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f6901a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0546v f6902b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0540t f6903c;

    /* renamed from: d, reason: collision with root package name */
    public U5.l0 f6904d;

    /* renamed from: f, reason: collision with root package name */
    public O f6906f;

    /* renamed from: g, reason: collision with root package name */
    public long f6907g;

    /* renamed from: h, reason: collision with root package name */
    public long f6908h;

    /* renamed from: e, reason: collision with root package name */
    public List f6905e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f6909i = new ArrayList();

    @Override // W5.e2
    public final void a(InterfaceC0444k interfaceC0444k) {
        p3.f.q("May only be called before start", this.f6902b == null);
        this.f6909i.add(new E(6, this, interfaceC0444k));
    }

    @Override // W5.e2
    public final boolean b() {
        if (this.f6901a) {
            return this.f6903c.b();
        }
        return false;
    }

    @Override // W5.InterfaceC0540t
    public final void c(int i7) {
        p3.f.q("May only be called before start", this.f6902b == null);
        this.f6909i.add(new M(this, i7, 2));
    }

    @Override // W5.InterfaceC0540t
    public void d(R4.c cVar) {
        synchronized (this) {
            try {
                if (this.f6902b == null) {
                    return;
                }
                if (this.f6903c != null) {
                    cVar.y(Long.valueOf(this.f6908h - this.f6907g), "buffered_nanos");
                    this.f6903c.d(cVar);
                } else {
                    cVar.y(Long.valueOf(System.nanoTime() - this.f6907g), "buffered_nanos");
                    ((ArrayList) cVar.f6064b).add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W5.InterfaceC0540t
    public final void e(InterfaceC0546v interfaceC0546v) {
        U5.l0 l0Var;
        boolean z4;
        p3.f.k(interfaceC0546v, "listener");
        p3.f.q("already started", this.f6902b == null);
        synchronized (this) {
            try {
                l0Var = this.f6904d;
                z4 = this.f6901a;
                if (!z4) {
                    O o7 = new O(interfaceC0546v);
                    this.f6906f = o7;
                    interfaceC0546v = o7;
                }
                this.f6902b = interfaceC0546v;
                this.f6907g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l0Var != null) {
            interfaceC0546v.F(l0Var, EnumC0543u.f7372a, new U5.b0());
        } else if (z4) {
            p(interfaceC0546v);
        }
    }

    @Override // W5.InterfaceC0540t
    public void f(U5.l0 l0Var) {
        boolean z4 = false;
        boolean z7 = true;
        p3.f.q("May only be called after start", this.f6902b != null);
        p3.f.k(l0Var, DiscardedEvent.JsonKeys.REASON);
        synchronized (this) {
            try {
                InterfaceC0540t interfaceC0540t = this.f6903c;
                if (interfaceC0540t == null) {
                    C0504g1 c0504g1 = C0504g1.f7223a;
                    if (interfaceC0540t != null) {
                        z7 = false;
                    }
                    p3.f.s(z7, "realStream already set to %s", interfaceC0540t);
                    this.f6903c = c0504g1;
                    this.f6908h = System.nanoTime();
                    this.f6904d = l0Var;
                } else {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            n(new E(10, this, l0Var));
            return;
        }
        o();
        q(l0Var);
        this.f6902b.F(l0Var, EnumC0543u.f7372a, new U5.b0());
    }

    @Override // W5.e2
    public final void flush() {
        p3.f.q("May only be called after start", this.f6902b != null);
        if (this.f6901a) {
            this.f6903c.flush();
        } else {
            n(new N(this, 2));
        }
    }

    @Override // W5.e2
    public final void g(C0789a c0789a) {
        p3.f.q("May only be called after start", this.f6902b != null);
        if (this.f6901a) {
            this.f6903c.g(c0789a);
        } else {
            n(new E(9, this, c0789a));
        }
    }

    @Override // W5.InterfaceC0540t
    public final void h() {
        p3.f.q("May only be called after start", this.f6902b != null);
        n(new N(this, 3));
    }

    @Override // W5.e2
    public final void i(int i7) {
        p3.f.q("May only be called after start", this.f6902b != null);
        if (this.f6901a) {
            this.f6903c.i(i7);
        } else {
            n(new M(this, i7, 0));
        }
    }

    @Override // W5.InterfaceC0540t
    public final void j(int i7) {
        p3.f.q("May only be called before start", this.f6902b == null);
        this.f6909i.add(new M(this, i7, 1));
    }

    @Override // W5.InterfaceC0540t
    public final void k(C0452t c0452t) {
        p3.f.q("May only be called before start", this.f6902b == null);
        p3.f.k(c0452t, "decompressorRegistry");
        this.f6909i.add(new E(7, this, c0452t));
    }

    @Override // W5.InterfaceC0540t
    public final void l(U5.r rVar) {
        p3.f.q("May only be called before start", this.f6902b == null);
        this.f6909i.add(new E(8, this, rVar));
    }

    @Override // W5.e2
    public final void m() {
        p3.f.q("May only be called before start", this.f6902b == null);
        this.f6909i.add(new N(this, 0));
    }

    public final void n(Runnable runnable) {
        p3.f.q("May only be called after start", this.f6902b != null);
        synchronized (this) {
            try {
                if (this.f6901a) {
                    runnable.run();
                } else {
                    this.f6905e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        O o7;
        List list;
        List list2;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f6905e.isEmpty()) {
                    break;
                }
                list2 = this.f6905e;
                this.f6905e = arrayList;
            }
            if (o7 != null) {
                return;
            }
            List arrayList2 = new ArrayList();
            while (true) {
                synchronized (o7) {
                    try {
                        if (o7.f6893c.isEmpty()) {
                            o7.f6893c = null;
                            o7.f6892b = true;
                            return;
                        } else {
                            list = o7.f6893c;
                            o7.f6893c = arrayList2;
                        }
                    } finally {
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList2 = list;
            }
            list2.clear();
            arrayList = list2;
        }
        this.f6905e = null;
        this.f6901a = true;
        o7 = this.f6906f;
        if (o7 != null) {
        }
    }

    public final void p(InterfaceC0546v interfaceC0546v) {
        Iterator it = this.f6909i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f6909i = null;
        this.f6903c.e(interfaceC0546v);
    }

    public final N r(InterfaceC0540t interfaceC0540t) {
        synchronized (this) {
            try {
                if (this.f6903c != null) {
                    return null;
                }
                p3.f.k(interfaceC0540t, "stream");
                InterfaceC0540t interfaceC0540t2 = this.f6903c;
                p3.f.s(interfaceC0540t2 == null, "realStream already set to %s", interfaceC0540t2);
                this.f6903c = interfaceC0540t;
                this.f6908h = System.nanoTime();
                InterfaceC0546v interfaceC0546v = this.f6902b;
                if (interfaceC0546v == null) {
                    this.f6905e = null;
                    this.f6901a = true;
                }
                if (interfaceC0546v == null) {
                    return null;
                }
                p(interfaceC0546v);
                return new N(this, 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q(U5.l0 l0Var) {
    }
}
