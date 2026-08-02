package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0924yr implements InterfaceC0507nh {

    /* JADX INFO: renamed from: j */
    public volatile boolean f9437j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0581ph f9438k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0507nh f9439l;

    /* JADX INFO: renamed from: m */
    public ja1 f9440m;

    /* JADX INFO: renamed from: o */
    public C0112cs f9442o;

    /* JADX INFO: renamed from: p */
    public long f9443p;

    /* JADX INFO: renamed from: q */
    public long f9444q;

    /* JADX INFO: renamed from: s */
    public final yv0 f9446s;

    /* JADX INFO: renamed from: u */
    public final o80[] f9448u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0961zr f9449v;

    /* JADX INFO: renamed from: n */
    public List f9441n = new ArrayList();

    /* JADX INFO: renamed from: r */
    public ArrayList f9445r = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final C0697sm f9447t = C0697sm.m4537b();

    public C0924yr(C0961zr c0961zr, yv0 yv0Var, o80[] o80VarArr) {
        this.f9449v = c0961zr;
        this.f9446s = yv0Var;
        this.f9448u = o80VarArr;
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: C */
    public final void mo1600C() {
        a90.m132p("May only be called before start", this.f9438k == null);
        this.f9445r.add(new RunnableC0036as(this, 1));
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: D */
    public final void mo1601D() {
        a90.m132p("May only be called after start", this.f9438k != null);
        m5830a(new RunnableC0036as(this, 4));
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: G */
    public final void mo1604G(ja1 ja1Var) {
        boolean z = true;
        a90.m132p("May only be called after start", this.f9438k != null);
        a90.m127k(ja1Var, "reason");
        synchronized (this) {
            try {
                InterfaceC0507nh interfaceC0507nh = this.f9439l;
                if (interfaceC0507nh == null) {
                    nc1 nc1Var = nc1.f5375n;
                    if (interfaceC0507nh != null) {
                        z = false;
                    }
                    a90.m131o(interfaceC0507nh, "realStream already set to %s", z);
                    this.f9439l = nc1Var;
                    this.f9444q = System.nanoTime();
                    this.f9440m = ja1Var;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m5830a(new RunnableC0529o2(12, this, ja1Var));
        } else {
            m5831b();
            for (o80 o80Var : this.f9448u) {
                o80Var.mo1308A(ja1Var);
            }
            this.f9438k.mo1035g(ja1Var, EnumC0544oh.f5731j, new np0());
        }
        synchronized (this.f9449v.f9913b) {
            try {
                C0961zr c0961zr = this.f9449v;
                if (c0961zr.f9918g != null) {
                    boolean zRemove = c0961zr.f9920i.remove(this);
                    if (!this.f9449v.m6028f() && zRemove) {
                        C0961zr c0961zr2 = this.f9449v;
                        c0961zr2.f9915d.m2026b(c0961zr2.f9917f);
                        C0961zr c0961zr3 = this.f9449v;
                        if (c0961zr3.f9921j != null) {
                            c0961zr3.f9915d.m2026b(c0961zr3.f9918g);
                            this.f9449v.f9918g = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f9449v.f9915d.m2025a();
    }

    /* JADX INFO: renamed from: a */
    public final void m5830a(Runnable runnable) {
        a90.m132p("May only be called after start", this.f9438k != null);
        synchronized (this) {
            try {
                if (this.f9437j) {
                    runnable.run();
                } else {
                    this.f9441n.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:18:0x002f, B:19:0x0033), top: B:41:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e A[LOOP:3: B:21:0x0038->B:23:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5831b() {
        C0112cs c0112cs;
        List arrayList;
        Iterator it;
        List list;
        List arrayList2 = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f9441n.isEmpty()) {
                    break;
                }
                list = this.f9441n;
                this.f9441n = arrayList2;
            }
            if (c0112cs != null) {
                return;
            }
            arrayList = new ArrayList();
            while (true) {
                synchronized (c0112cs) {
                    try {
                        if (c0112cs.f1445l.isEmpty()) {
                            c0112cs.f1445l = null;
                            c0112cs.f1444k = true;
                            return;
                        } else {
                            List list2 = c0112cs.f1445l;
                            c0112cs.f1445l = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                it = list2.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list2.clear();
                arrayList = list2;
            }
            list.clear();
            arrayList2 = list;
        }
        this.f9441n = null;
        this.f9437j = true;
        c0112cs = this.f9442o;
        if (c0112cs != null) {
            return;
        }
        arrayList = new ArrayList();
        while (true) {
            synchronized (c0112cs) {
                if (c0112cs.f1445l.isEmpty()) {
                    c0112cs.f1445l = null;
                    c0112cs.f1444k = true;
                    return;
                }
                List list3 = c0112cs.f1445l;
                c0112cs.f1445l = arrayList;
                it = list3.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list3.clear();
                arrayList = list3;
            }
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: c */
    public final void mo1624c(InterfaceC0951zh interfaceC0951zh) {
        a90.m132p("May only be called before start", this.f9438k == null);
        this.f9445r.add(new RunnableC0529o2(8, this, interfaceC0951zh));
    }

    /* JADX INFO: renamed from: d */
    public final void m5832d(InterfaceC0581ph interfaceC0581ph) {
        ArrayList arrayList = this.f9445r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        this.f9445r = null;
        this.f9439l.mo1326n(interfaceC0581ph);
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: e */
    public final void mo1625e(int i) {
        a90.m132p("May only be called before start", this.f9438k == null);
        this.f9445r.add(new RunnableC0073bs(this, i, 1));
    }

    @Override // p000.ra1
    public final void flush() {
        a90.m132p("May only be called after start", this.f9438k != null);
        if (this.f9437j) {
            this.f9439l.flush();
        } else {
            m5830a(new RunnableC0036as(this, 3));
        }
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: h */
    public final void mo1626h(C0258gq c0258gq) {
        a90.m132p("May only be called before start", this.f9438k == null);
        a90.m127k(c0258gq, "decompressorRegistry");
        this.f9445r.add(new RunnableC0529o2(9, this, c0258gq));
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: k */
    public final void mo1628k(int i) {
        a90.m132p("May only be called before start", this.f9438k == null);
        this.f9445r.add(new RunnableC0073bs(this, i, 0));
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: n */
    public final void mo1326n(InterfaceC0581ph interfaceC0581ph) {
        ja1 ja1Var;
        boolean z;
        a90.m127k(interfaceC0581ph, "listener");
        a90.m132p("already started", this.f9438k == null);
        synchronized (this) {
            try {
                ja1Var = this.f9440m;
                z = this.f9437j;
                if (!z) {
                    C0112cs c0112cs = new C0112cs(interfaceC0581ph);
                    this.f9442o = c0112cs;
                    interfaceC0581ph = c0112cs;
                }
                this.f9438k = interfaceC0581ph;
                this.f9443p = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ja1Var != null) {
            interfaceC0581ph.mo1035g(ja1Var, EnumC0544oh.f5731j, new np0());
        } else if (z) {
            m5832d(interfaceC0581ph);
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: q */
    public final boolean mo1633q() {
        if (this.f9437j) {
            return this.f9439l.mo1633q();
        }
        return false;
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: s */
    public final void mo1327s(xd0 xd0Var) {
        if (Boolean.TRUE.equals(this.f9446s.f9511a.f1229e)) {
            xd0Var.f8895b.add("wait_for_ready");
        }
        synchronized (this) {
            try {
                if (this.f9438k == null) {
                    return;
                }
                if (this.f9439l != null) {
                    xd0Var.m5619a(Long.valueOf(this.f9444q - this.f9443p), "buffered_nanos");
                    this.f9439l.mo1327s(xd0Var);
                } else {
                    xd0Var.m5619a(Long.valueOf(System.nanoTime() - this.f9443p), "buffered_nanos");
                    xd0Var.f8895b.add("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: u */
    public final void mo1636u(C0885xp c0885xp) {
        a90.m132p("May only be called before start", this.f9438k == null);
        this.f9445r.add(new RunnableC0529o2(10, this, c0885xp));
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: w */
    public final void mo1638w(xx0 xx0Var) {
        a90.m132p("May only be called after start", this.f9438k != null);
        if (this.f9437j) {
            this.f9439l.mo1638w(xx0Var);
        } else {
            m5830a(new RunnableC0529o2(11, this, xx0Var));
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: z */
    public final void mo1641z() {
        a90.m132p("May only be called after start", this.f9438k != null);
        if (this.f9437j) {
            this.f9439l.mo1641z();
        } else {
            m5830a(new RunnableC0036as(this, 0));
        }
    }
}
