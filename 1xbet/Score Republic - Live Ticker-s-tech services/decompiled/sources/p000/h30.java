package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h30 extends AbstractC0797vb implements y30 {

    /* JADX INFO: renamed from: j */
    public final y30 f3023j;

    /* JADX INFO: renamed from: k */
    public final r60 f3024k;

    /* JADX INFO: renamed from: l */
    public final int f3025l;

    /* JADX INFO: renamed from: m */
    public final int f3026m;

    /* JADX INFO: renamed from: o */
    public ib1 f3028o;

    /* JADX INFO: renamed from: p */
    public y71 f3029p;

    /* JADX INFO: renamed from: q */
    public volatile boolean f3030q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f3031r;

    /* JADX INFO: renamed from: t */
    public Iterator f3033t;

    /* JADX INFO: renamed from: u */
    public int f3034u;

    /* JADX INFO: renamed from: v */
    public int f3035v;

    /* JADX INFO: renamed from: s */
    public final AtomicReference f3032s = new AtomicReference();

    /* JADX INFO: renamed from: n */
    public final AtomicLong f3027n = new AtomicLong();

    public h30(y30 y30Var, wa0 wa0Var, int i) {
        this.f3023j = y30Var;
        this.f3024k = wa0Var;
        this.f3025l = i;
        this.f3026m = i - (i >> 2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2205c(boolean z, boolean z2, y30 y30Var, y71 y71Var) {
        if (this.f3031r) {
            this.f3033t = null;
            y71Var.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (((Throwable) this.f3032s.get()) == null) {
            if (!z2) {
                return false;
            }
            y30Var.onComplete();
            return true;
        }
        Throwable thM4416b = AbstractC0671rx.m4416b(this.f3032s);
        this.f3033t = null;
        y71Var.clear();
        y30Var.onError(thM4416b);
        return true;
    }

    @Override // p000.ib1
    public final void cancel() {
        if (this.f3031r) {
            return;
        }
        this.f3031r = true;
        this.f3028o.cancel();
        if (getAndIncrement() == 0) {
            this.f3029p.clear();
        }
    }

    @Override // p000.y71
    public final void clear() {
        this.f3033t = null;
        this.f3029p.clear();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f3028o, ib1Var)) {
            this.f3028o = ib1Var;
            if (ib1Var instanceof fz0) {
                fz0 fz0Var = (fz0) ib1Var;
                int iMo592f = fz0Var.mo592f(3);
                if (iMo592f == 1) {
                    this.f3035v = iMo592f;
                    this.f3029p = fz0Var;
                    this.f3030q = true;
                    this.f3023j.mo933e(this);
                    return;
                }
                if (iMo592f == 2) {
                    this.f3035v = iMo592f;
                    this.f3029p = fz0Var;
                    this.f3023j.mo933e(this);
                    ib1Var.request(this.f3025l);
                    return;
                }
            }
            this.f3029p = new s91(this.f3025l);
            this.f3023j.mo933e(this);
            ib1Var.request(this.f3025l);
        }
    }

    @Override // p000.ez0
    /* JADX INFO: renamed from: f */
    public final int mo592f(int i) {
        return this.f3035v == 1 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m2206g() {
        int i;
        if (getAndIncrement() != 0) {
            return;
        }
        y30 y30Var = this.f3023j;
        y71 y71Var = this.f3029p;
        boolean z = false;
        int i2 = 1;
        Object[] objArr = this.f3035v != 1;
        Iterator it = this.f3033t;
        int iAddAndGet = 1;
        while (true) {
            if (it == null) {
                boolean z2 = this.f3030q;
                try {
                    Object objPoll = y71Var.poll();
                    if (m2205c(z2, objPoll == null ? i2 : z ? 1 : 0, y30Var, y71Var)) {
                        return;
                    }
                    if (objPoll != null) {
                        try {
                            it = ((Iterable) this.f3024k.apply(objPoll)).iterator();
                            if (it.hasNext()) {
                                this.f3033t = it;
                            } else {
                                if (objArr != false) {
                                    int i3 = this.f3034u + i2;
                                    if (i3 == this.f3026m) {
                                        this.f3034u = z ? 1 : 0;
                                        this.f3028o.request(i3);
                                    } else {
                                        this.f3034u = i3;
                                    }
                                }
                                it = null;
                            }
                        } catch (Throwable th) {
                            wo1.m5394u(th);
                            this.f3028o.cancel();
                            AbstractC0671rx.m4415a(this.f3032s, th);
                            y30Var.onError(AbstractC0671rx.m4416b(this.f3032s));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    wo1.m5394u(th2);
                    this.f3028o.cancel();
                    AbstractC0671rx.m4415a(this.f3032s, th2);
                    Throwable thM4416b = AbstractC0671rx.m4416b(this.f3032s);
                    this.f3033t = null;
                    y71Var.clear();
                    y30Var.onError(thM4416b);
                    return;
                }
            }
            if (it != null) {
                long j = this.f3027n.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        i = i2;
                        break;
                    }
                    if (m2205c(this.f3030q, z, y30Var, y71Var)) {
                        return;
                    }
                    try {
                        Object next = it.next();
                        i = i2;
                        zg1.m5905p(next, "The iterator returned a null value");
                        y30Var.onNext(next);
                        if (m2205c(this.f3030q, z, y30Var, y71Var)) {
                            return;
                        }
                        j2++;
                        try {
                            if (!it.hasNext()) {
                                if (objArr != false) {
                                    int i4 = this.f3034u + 1;
                                    if (i4 == this.f3026m) {
                                        this.f3034u = z ? 1 : 0;
                                        this.f3028o.request(i4);
                                    } else {
                                        this.f3034u = i4;
                                    }
                                }
                                this.f3033t = null;
                                it = null;
                                break;
                            }
                            i2 = i;
                        } catch (Throwable th3) {
                            wo1.m5394u(th3);
                            this.f3033t = null;
                            this.f3028o.cancel();
                            AbstractC0671rx.m4415a(this.f3032s, th3);
                            y30Var.onError(AbstractC0671rx.m4416b(this.f3032s));
                            return;
                        }
                    } catch (Throwable th4) {
                        wo1.m5394u(th4);
                        this.f3033t = null;
                        this.f3028o.cancel();
                        AbstractC0671rx.m4415a(this.f3032s, th4);
                        y30Var.onError(AbstractC0671rx.m4416b(this.f3032s));
                        return;
                    }
                }
                if (j2 == j) {
                    if (m2205c(this.f3030q, (y71Var.isEmpty() && it == null) ? i : 0, y30Var, y71Var)) {
                        return;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f3027n.addAndGet(-j2);
                }
                if (it != null) {
                }
                i2 = i;
                z = false;
            } else {
                i = i2;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            i2 = i;
            z = false;
        }
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return this.f3033t == null && this.f3029p.isEmpty();
    }

    @Override // p000.y30
    public final void onComplete() {
        if (this.f3030q) {
            return;
        }
        this.f3030q = true;
        m2206g();
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        if (this.f3030q || !AbstractC0671rx.m4415a(this.f3032s, th)) {
            vt1.m5196h(th);
        } else {
            this.f3030q = true;
            m2206g();
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f3030q) {
            return;
        }
        if (this.f3035v != 0 || this.f3029p.offer(obj)) {
            m2206g();
        } else {
            onError(new bq0("Queue is full?!"));
        }
    }

    @Override // p000.y71
    public final Object poll() {
        Iterator it = this.f3033t;
        while (it == null) {
            Object objPoll = this.f3029p.poll();
            if (objPoll != null) {
                it = ((Iterable) this.f3024k.apply(objPoll)).iterator();
                if (it.hasNext()) {
                    this.f3033t = it;
                    break;
                }
                it = null;
            } else {
                return null;
            }
        }
        Object next = it.next();
        zg1.m5905p(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f3033t = null;
        }
        return next;
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (jb1.m2845c(j)) {
            AbstractC0875xf.m5647b(this.f3027n, j);
            m2206g();
        }
    }
}
