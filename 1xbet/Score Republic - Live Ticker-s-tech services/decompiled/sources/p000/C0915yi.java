package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yi */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0915yi extends AbstractC0419l3 {

    /* JADX INFO: renamed from: x */
    public static final Logger f9304x = Logger.getLogger(C0915yi.class.getName());

    /* JADX INFO: renamed from: u */
    public lc0 f9305u;

    /* JADX INFO: renamed from: v */
    public final boolean f9306v;

    /* JADX INFO: renamed from: w */
    public C0878xi f9307w;

    public C0915yi(lc0 lc0Var, boolean z) {
        int size = lc0Var.size();
        this.f4653q = null;
        this.f4654r = size;
        this.f9305u = lc0Var;
        this.f9306v = z;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: b */
    public final void mo549b() {
        lc0 lc0Var = this.f9305u;
        this.f9305u = null;
        this.f9307w = null;
        if ((this.f2977j instanceof C0674s) && (lc0Var != null)) {
            boolean zM2181p = m2181p();
            sf1 it = lc0Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zM2181p);
            }
        }
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: i */
    public final void mo932i() {
        C0878xi c0878xi = this.f9307w;
        if (c0878xi != null) {
            c0878xi.m5888c();
        }
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: j */
    public final String mo550j() {
        lc0 lc0Var = this.f9305u;
        if (lc0Var == null) {
            return super.mo550j();
        }
        return "futures=" + lc0Var;
    }

    /* JADX INFO: renamed from: q */
    public final void m5802q(lc0 lc0Var) {
        int iMo2819e = AbstractC0419l3.f4651s.mo2819e(this);
        a90.m132p("Less than 0 remaining futures", iMo2819e >= 0);
        if (iMo2819e == 0) {
            if (lc0Var != null) {
                sf1 it = lc0Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            k70.m2991b(future);
                        } catch (Error | RuntimeException e) {
                            m5803r(e);
                        } catch (ExecutionException e2) {
                            m5803r(e2.getCause());
                        }
                    }
                }
            }
            this.f4653q = null;
            C0878xi c0878xi = this.f9307w;
            if (c0878xi != null) {
                try {
                    c0878xi.f8963l.execute(c0878xi);
                } catch (RejectedExecutionException e3) {
                    c0878xi.f8964m.m2178m(e3);
                }
            }
            this.f9305u = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5803r(Throwable th) {
        th.getClass();
        if (this.f9306v && !m2178m(th)) {
            Set set = this.f4653q;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f2977j instanceof C0674s)) {
                    Throwable thM2180o = m2180o();
                    Objects.requireNonNull(thM2180o);
                    while (thM2180o != null && setNewSetFromMap.add(thM2180o)) {
                        thM2180o = thM2180o.getCause();
                    }
                }
                AbstractC0419l3.f4651s.mo2818b(this, setNewSetFromMap);
                set = this.f4653q;
                Objects.requireNonNull(set);
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    f9304x.log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        if (th instanceof Error) {
            f9304x.log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5804s() {
        Objects.requireNonNull(this.f9305u);
        if (this.f9305u.isEmpty()) {
            C0878xi c0878xi = this.f9307w;
            if (c0878xi != null) {
                try {
                    c0878xi.f8963l.execute(c0878xi);
                    return;
                } catch (RejectedExecutionException e) {
                    c0878xi.f8964m.m2178m(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.f9306v;
        EnumC0113ct enumC0113ct = EnumC0113ct.f1449j;
        if (!z) {
            RunnableC0195f1 runnableC0195f1 = new RunnableC0195f1(2, this, (Object) null);
            sf1 it = this.f9305u.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).mo995c(runnableC0195f1, enumC0113ct);
            }
            return;
        }
        sf1 it2 = this.f9305u.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture = (ListenableFuture) it2.next();
            listenableFuture.mo995c(new RunnableC0195f1(this, listenableFuture, i), enumC0113ct);
            i++;
        }
    }
}
