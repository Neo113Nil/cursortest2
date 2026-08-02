package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class o20 extends n20 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f5579l = 1;

    /* JADX INFO: renamed from: m */
    public Throwable f5580m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f5581n;

    /* JADX INFO: renamed from: o */
    public final AtomicInteger f5582o;

    /* JADX INFO: renamed from: p */
    public final Object f5583p;

    public o20(y30 y30Var, int i) {
        super(y30Var);
        this.f5583p = new t91(i);
        this.f5582o = new AtomicInteger();
    }

    @Override // p000.n20
    /* JADX INFO: renamed from: d */
    public final void mo3469d(Object obj) {
        switch (this.f5579l) {
            case 0:
                if (!this.f5581n && !this.f5261k.m2160b()) {
                    if (obj != null) {
                        ((t91) this.f5583p).offer(obj);
                        m3625h();
                    } else {
                        m3468c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    }
                    break;
                }
                break;
            default:
                if (!this.f5581n && !this.f5261k.m2160b()) {
                    if (obj != null) {
                        ((AtomicReference) this.f5583p).set(obj);
                        m3625h();
                    } else {
                        m3468c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.n20
    /* JADX INFO: renamed from: e */
    public final void mo3470e() {
        switch (this.f5579l) {
            case 0:
                m3625h();
                break;
            default:
                m3625h();
                break;
        }
    }

    @Override // p000.n20
    /* JADX INFO: renamed from: f */
    public final void mo3471f() {
        switch (this.f5579l) {
            case 0:
                if (this.f5582o.getAndIncrement() == 0) {
                    ((t91) this.f5583p).clear();
                }
                break;
            default:
                if (this.f5582o.getAndIncrement() == 0) {
                    ((AtomicReference) this.f5583p).lazySet(null);
                }
                break;
        }
    }

    @Override // p000.n20
    /* JADX INFO: renamed from: g */
    public final boolean mo3472g(Throwable th) {
        switch (this.f5579l) {
            case 0:
                if (this.f5581n || this.f5261k.m2160b()) {
                    return false;
                }
                this.f5580m = th;
                this.f5581n = true;
                m3625h();
                return true;
            default:
                if (this.f5581n || this.f5261k.m2160b()) {
                    return false;
                }
                this.f5580m = th;
                this.f5581n = true;
                m3625h();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00eb A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final void m3625h() {
        boolean z;
        Throwable th;
        boolean z2;
        boolean z3;
        Throwable th2;
        switch (this.f5579l) {
            case 0:
                if (this.f5582o.getAndIncrement() == 0) {
                    y30 y30Var = this.f5260j;
                    t91 t91Var = (t91) this.f5583p;
                    int iAddAndGet = 1;
                    do {
                        long j = get();
                        for (long j2 = 0; j2 != j; j2++) {
                            if (this.f5261k.m2160b()) {
                                t91Var.clear();
                            } else {
                                boolean z4 = this.f5581n;
                                Object objPoll = t91Var.poll();
                                boolean z5 = objPoll == null;
                                if (z4 && z5) {
                                    Throwable th3 = this.f5580m;
                                    if (th3 != null) {
                                        m3467b(th3);
                                    } else {
                                        m3466a();
                                    }
                                } else if (z5) {
                                    if (j2 == j) {
                                        if (this.f5261k.m2160b()) {
                                            t91Var.clear();
                                        } else {
                                            z = this.f5581n;
                                            boolean zIsEmpty = t91Var.isEmpty();
                                            if (z && zIsEmpty) {
                                                th = this.f5580m;
                                                if (th != null) {
                                                    m3467b(th);
                                                } else {
                                                    m3466a();
                                                }
                                            }
                                        }
                                    }
                                    if (j2 != 0) {
                                        AbstractC0875xf.m5652l(this, j2);
                                    }
                                    iAddAndGet = this.f5582o.addAndGet(-iAddAndGet);
                                } else {
                                    y30Var.onNext(objPoll);
                                }
                            }
                            break;
                        }
                        if (j2 == j) {
                            if (this.f5261k.m2160b()) {
                                t91Var.clear();
                            } else {
                                z = this.f5581n;
                                boolean zIsEmpty2 = t91Var.isEmpty();
                                if (z) {
                                    th = this.f5580m;
                                    if (th != null) {
                                        m3467b(th);
                                    } else {
                                        m3466a();
                                    }
                                }
                            }
                        }
                        if (j2 != 0) {
                            AbstractC0875xf.m5652l(this, j2);
                        }
                        iAddAndGet = this.f5582o.addAndGet(-iAddAndGet);
                        break;
                    } while (iAddAndGet != 0);
                }
                break;
            default:
                if (this.f5582o.getAndIncrement() == 0) {
                    y30 y30Var2 = this.f5260j;
                    AtomicReference atomicReference = (AtomicReference) this.f5583p;
                    int iAddAndGet2 = 1;
                    do {
                        long j3 = get();
                        for (long j4 = 0; j4 != j3; j4++) {
                            if (this.f5261k.m2160b()) {
                                atomicReference.lazySet(null);
                            } else {
                                boolean z6 = this.f5581n;
                                Object andSet = atomicReference.getAndSet(null);
                                boolean z7 = andSet == null;
                                if (z6 && z7) {
                                    Throwable th4 = this.f5580m;
                                    if (th4 != null) {
                                        m3467b(th4);
                                    } else {
                                        m3466a();
                                    }
                                } else if (z7) {
                                    if (j4 == j3) {
                                        if (this.f5261k.m2160b()) {
                                            atomicReference.lazySet(null);
                                        } else {
                                            z2 = this.f5581n;
                                            if (atomicReference.get() == null) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z2 && z3) {
                                                th2 = this.f5580m;
                                                if (th2 != null) {
                                                    m3467b(th2);
                                                } else {
                                                    m3466a();
                                                }
                                            }
                                        }
                                    }
                                    if (j4 != 0) {
                                        AbstractC0875xf.m5652l(this, j4);
                                    }
                                    iAddAndGet2 = this.f5582o.addAndGet(-iAddAndGet2);
                                } else {
                                    y30Var2.onNext(andSet);
                                }
                            }
                            break;
                        }
                        if (j4 == j3) {
                            if (this.f5261k.m2160b()) {
                                atomicReference.lazySet(null);
                            } else {
                                z2 = this.f5581n;
                                if (atomicReference.get() == null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2) {
                                    th2 = this.f5580m;
                                    if (th2 != null) {
                                        m3467b(th2);
                                    } else {
                                        m3466a();
                                    }
                                }
                            }
                        }
                        if (j4 != 0) {
                            AbstractC0875xf.m5652l(this, j4);
                        }
                        iAddAndGet2 = this.f5582o.addAndGet(-iAddAndGet2);
                        break;
                    } while (iAddAndGet2 != 0);
                }
                break;
        }
    }

    public o20(y30 y30Var) {
        super(y30Var);
        this.f5583p = new AtomicReference();
        this.f5582o = new AtomicInteger();
    }
}
