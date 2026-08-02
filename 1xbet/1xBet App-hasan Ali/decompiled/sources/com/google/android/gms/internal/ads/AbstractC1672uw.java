package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.uw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1672uw extends AbstractC1807xw {

    /* renamed from: y, reason: collision with root package name */
    public static final Pw f15934y = new Pw(AbstractC1672uw.class);

    /* renamed from: v, reason: collision with root package name */
    public AbstractC0821bv f15935v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f15936w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15937x;

    public AbstractC1672uw(AbstractC0821bv abstractC0821bv, boolean z3, boolean z5) {
        int size = abstractC0821bv.size();
        this.f16351r = null;
        this.f16352s = size;
        this.f15935v = abstractC0821bv;
        this.f15936w = z3;
        this.f15937x = z5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final String d() {
        AbstractC0821bv abstractC0821bv = this.f15935v;
        return abstractC0821bv != null ? "futures=".concat(abstractC0821bv.toString()) : super.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final void e() {
        AbstractC0821bv abstractC0821bv = this.f15935v;
        x(1);
        if ((abstractC0821bv != null) && (this.f14874k instanceof C0910dw)) {
            boolean m5 = m();
            Lv g5 = abstractC0821bv.g();
            while (g5.hasNext()) {
                ((Future) g5.next()).cancel(m5);
            }
        }
    }

    public final void r(AbstractC0821bv abstractC0821bv) {
        int c5 = AbstractC1807xw.f16349t.c(this);
        int i = 0;
        AbstractC1400ot.i0("Less than 0 remaining futures", c5 >= 0);
        if (c5 == 0) {
            if (abstractC0821bv != null) {
                Lv g5 = abstractC0821bv.g();
                while (g5.hasNext()) {
                    Future future = (Future) g5.next();
                    if (!future.isCancelled()) {
                        try {
                            u(i, AbstractC1400ot.f(future));
                        } catch (ExecutionException e3) {
                            s(e3.getCause());
                        } catch (Throwable th) {
                            s(th);
                        }
                    }
                    i++;
                }
            }
            this.f16351r = null;
            v();
            x(2);
        }
    }

    public final void s(Throwable th) {
        th.getClass();
        if (this.f15936w && !g(th)) {
            Set set = this.f16351r;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.f14874k instanceof C0910dw)) {
                    Throwable b3 = b();
                    Objects.requireNonNull(b3);
                    while (b3 != null && newSetFromMap.add(b3)) {
                        b3 = b3.getCause();
                    }
                }
                AbstractC1807xw.f16349t.H(this, newSetFromMap);
                Set set2 = this.f16351r;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            f15934y.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z3 = th instanceof Error;
        if (z3) {
            f15934y.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z3 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public final void t(int i, E3.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.f15935v = null;
                cancel(false);
            } else {
                try {
                    u(i, AbstractC1400ot.f(aVar));
                } catch (ExecutionException e3) {
                    s(e3.getCause());
                } catch (Throwable th) {
                    s(th);
                }
            }
        } finally {
            r(null);
        }
    }

    public abstract void u(int i, Object obj);

    public abstract void v();

    public final void w() {
        Objects.requireNonNull(this.f15935v);
        if (this.f15935v.isEmpty()) {
            v();
            return;
        }
        Ew ew = Ew.f8627k;
        if (!this.f15936w) {
            AbstractC0821bv abstractC0821bv = this.f15937x ? this.f15935v : null;
            RunnableC1081hn runnableC1081hn = new RunnableC1081hn(13, this, abstractC0821bv);
            Lv g5 = this.f15935v.g();
            while (g5.hasNext()) {
                E3.a aVar = (E3.a) g5.next();
                if (aVar.isDone()) {
                    r(abstractC0821bv);
                } else {
                    aVar.a(runnableC1081hn, ew);
                }
            }
            return;
        }
        Lv g6 = this.f15935v.g();
        int i = 0;
        while (g6.hasNext()) {
            E3.a aVar2 = (E3.a) g6.next();
            int i5 = i + 1;
            if (aVar2.isDone()) {
                t(i, aVar2);
            } else {
                aVar2.a(new Nj(i, 1, this, aVar2), ew);
            }
            i = i5;
        }
    }

    public abstract void x(int i);
}
