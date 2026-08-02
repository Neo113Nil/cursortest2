package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: zr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0961zr implements ul0 {

    /* JADX INFO: renamed from: c */
    public final Executor f9914c;

    /* JADX INFO: renamed from: d */
    public final gc1 f9915d;

    /* JADX INFO: renamed from: e */
    public RunnableC0887xr f9916e;

    /* JADX INFO: renamed from: f */
    public RunnableC0887xr f9917f;

    /* JADX INFO: renamed from: g */
    public RunnableC0887xr f9918g;

    /* JADX INFO: renamed from: h */
    public nu1 f9919h;

    /* JADX INFO: renamed from: j */
    public ja1 f9921j;

    /* JADX INFO: renamed from: k */
    public kj0 f9922k;

    /* JADX INFO: renamed from: l */
    public long f9923l;

    /* JADX INFO: renamed from: a */
    public final me0 f9912a = me0.m3377a(C0961zr.class, null);

    /* JADX INFO: renamed from: b */
    public final Object f9913b = new Object();

    /* JADX INFO: renamed from: i */
    public Collection f9920i = new LinkedHashSet();

    public C0961zr(Executor executor, gc1 gc1Var) {
        this.f9914c = executor;
        this.f9915d = gc1Var;
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: a */
    public final void mo3771a(ja1 ja1Var) {
        RunnableC0887xr runnableC0887xr;
        synchronized (this.f9913b) {
            try {
                if (this.f9921j != null) {
                    return;
                }
                this.f9921j = ja1Var;
                this.f9915d.m2026b(new RunnableC0529o2(7, this, ja1Var));
                if (!m6028f() && (runnableC0887xr = this.f9918g) != null) {
                    this.f9915d.m2026b(runnableC0887xr);
                    this.f9918g = null;
                }
                this.f9915d.m2025a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ul0
    /* JADX INFO: renamed from: b */
    public final Runnable mo3772b(tl0 tl0Var) {
        nu1 nu1Var = (nu1) tl0Var;
        this.f9919h = nu1Var;
        this.f9916e = new RunnableC0887xr(nu1Var, 0);
        this.f9917f = new RunnableC0887xr(nu1Var, 1);
        this.f9918g = new RunnableC0887xr(nu1Var, 2);
        return null;
    }

    @Override // p000.le0
    /* JADX INFO: renamed from: c */
    public final me0 mo1526c() {
        return this.f9912a;
    }

    @Override // p000.InterfaceC0655rh
    /* JADX INFO: renamed from: d */
    public final InterfaceC0507nh mo1527d(wp0 wp0Var, np0 np0Var, C0095ce c0095ce, o80[] o80VarArr) {
        InterfaceC0507nh c0155dz;
        try {
            yv0 yv0Var = new yv0(wp0Var, np0Var, c0095ce);
            kj0 kj0Var = null;
            long j = -1;
            while (true) {
                synchronized (this.f9913b) {
                    ja1 ja1Var = this.f9921j;
                    if (ja1Var == null) {
                        kj0 kj0Var2 = this.f9922k;
                        if (kj0Var2 != null) {
                            if (kj0Var != null && j == this.f9923l) {
                                c0155dz = m6027e(yv0Var, o80VarArr);
                                break;
                            }
                            j = this.f9923l;
                            InterfaceC0655rh interfaceC0655rhM911f = ca0.m911f(kj0Var2.mo1140a(yv0Var), Boolean.TRUE.equals(c0095ce.f1229e));
                            if (interfaceC0655rhM911f != null) {
                                c0155dz = interfaceC0655rhM911f.mo1527d(yv0Var.f9513c, yv0Var.f9512b, yv0Var.f9511a, o80VarArr);
                                break;
                            }
                            kj0Var = kj0Var2;
                        } else {
                            c0155dz = m6027e(yv0Var, o80VarArr);
                            break;
                        }
                    } else {
                        c0155dz = new C0155dz(ja1Var, EnumC0544oh.f5731j, o80VarArr);
                        break;
                    }
                }
            }
            this.f9915d.m2025a();
            return c0155dz;
        } catch (Throwable th) {
            this.f9915d.m2025a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C0924yr m6027e(yv0 yv0Var, o80[] o80VarArr) {
        int size;
        C0924yr c0924yr = new C0924yr(this, yv0Var, o80VarArr);
        this.f9920i.add(c0924yr);
        synchronized (this.f9913b) {
            size = this.f9920i.size();
        }
        if (size == 1) {
            this.f9915d.m2026b(this.f9916e);
        }
        for (o80 o80Var : o80VarArr) {
            o80Var.mo1310i();
        }
        return c0924yr;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6028f() {
        boolean z;
        synchronized (this.f9913b) {
            z = !this.f9920i.isEmpty();
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public final void m6029g(kj0 kj0Var) {
        RunnableC0887xr runnableC0887xr;
        synchronized (this.f9913b) {
            this.f9922k = kj0Var;
            this.f9923l++;
            if (kj0Var != null && m6028f()) {
                ArrayList arrayList = new ArrayList(this.f9920i);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    RunnableC0036as runnableC0036as = null;
                    if (i >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    C0924yr c0924yr = (C0924yr) obj;
                    ij0 ij0VarMo1140a = kj0Var.mo1140a(c0924yr.f9446s);
                    C0095ce c0095ce = c0924yr.f9446s.f9511a;
                    InterfaceC0655rh interfaceC0655rhM911f = ca0.m911f(ij0VarMo1140a, Boolean.TRUE.equals(c0095ce.f1229e));
                    if (interfaceC0655rhM911f != null) {
                        Executor executor = this.f9914c;
                        Executor executor2 = c0095ce.f1226b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        C0697sm c0697sm = c0924yr.f9447t;
                        C0697sm c0697smM4538a = c0697sm.m4538a();
                        try {
                            yv0 yv0Var = c0924yr.f9446s;
                            InterfaceC0507nh interfaceC0507nhMo1527d = interfaceC0655rhM911f.mo1527d(yv0Var.f9513c, yv0Var.f9512b, yv0Var.f9511a, c0924yr.f9448u);
                            c0697sm.m4539c(c0697smM4538a);
                            synchronized (c0924yr) {
                                try {
                                    if (c0924yr.f9439l == null) {
                                        a90.m127k(interfaceC0507nhMo1527d, "stream");
                                        InterfaceC0507nh interfaceC0507nh = c0924yr.f9439l;
                                        a90.m131o(interfaceC0507nh, "realStream already set to %s", interfaceC0507nh == null);
                                        c0924yr.f9439l = interfaceC0507nhMo1527d;
                                        c0924yr.f9444q = System.nanoTime();
                                        InterfaceC0581ph interfaceC0581ph = c0924yr.f9438k;
                                        if (interfaceC0581ph == null) {
                                            c0924yr.f9441n = null;
                                            c0924yr.f9437j = true;
                                        }
                                        if (interfaceC0581ph != null) {
                                            c0924yr.m5832d(interfaceC0581ph);
                                            runnableC0036as = new RunnableC0036as(c0924yr, 2);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (runnableC0036as != null) {
                                executor.execute(runnableC0036as);
                            }
                            arrayList2.add(c0924yr);
                        } catch (Throwable th2) {
                            c0697sm.m4539c(c0697smM4538a);
                            throw th2;
                        }
                    }
                }
                synchronized (this.f9913b) {
                    try {
                        if (m6028f()) {
                            this.f9920i.removeAll(arrayList2);
                            if (this.f9920i.isEmpty()) {
                                this.f9920i = new LinkedHashSet();
                            }
                            if (!m6028f()) {
                                this.f9915d.m2026b(this.f9917f);
                                if (this.f9921j != null && (runnableC0887xr = this.f9918g) != null) {
                                    this.f9915d.m2026b(runnableC0887xr);
                                    this.f9918g = null;
                                }
                            }
                            this.f9915d.m2025a();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }
}
