package p000;

/* JADX INFO: renamed from: qr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0628qr extends AbstractC0797vb {

    /* JADX INFO: renamed from: j */
    public final y30 f6568j;

    /* JADX INFO: renamed from: k */
    public Object f6569k;

    public AbstractC0628qr(y30 y30Var) {
        this.f6568j = y30Var;
    }

    /* JADX INFO: renamed from: b */
    public void m4132b(Object obj) {
        m4133c(obj);
    }

    /* JADX INFO: renamed from: c */
    public final void m4133c(Object obj) {
        int i = get();
        do {
            y30 y30Var = this.f6568j;
            if (i == 8) {
                this.f6569k = obj;
                lazySet(16);
                y30Var.onNext(obj);
                if (get() != 4) {
                    y30Var.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                y30Var.onNext(obj);
                if (get() != 4) {
                    y30Var.onComplete();
                    return;
                }
                return;
            }
            this.f6569k = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.f6569k = null;
    }

    @Override // p000.y71
    public final void clear() {
        lazySet(32);
        this.f6569k = null;
    }

    @Override // p000.ez0
    /* JADX INFO: renamed from: f */
    public final int mo592f(int i) {
        lazySet(8);
        return 2;
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // p000.y71
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f6569k;
        this.f6569k = null;
        return obj;
    }

    @Override // p000.ib1
    public final void request(long j) {
        Object obj;
        if (jb1.m2845c(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.f6569k) == null) {
                        return;
                    }
                    this.f6569k = null;
                    y30 y30Var = this.f6568j;
                    y30Var.onNext(obj);
                    if (get() != 4) {
                        y30Var.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
