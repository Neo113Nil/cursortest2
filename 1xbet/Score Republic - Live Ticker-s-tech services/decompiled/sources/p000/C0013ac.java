package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: ac */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0013ac extends AbstractC0959zp implements ft0 {

    /* JADX INFO: renamed from: C */
    public static final Object[] f128C = new Object[0];

    /* JADX INFO: renamed from: D */
    public static final C0945zb[] f129D = new C0945zb[0];

    /* JADX INFO: renamed from: E */
    public static final C0945zb[] f130E = new C0945zb[0];

    /* JADX INFO: renamed from: A */
    public final AtomicReference f131A;

    /* JADX INFO: renamed from: B */
    public long f132B;

    /* JADX INFO: renamed from: w */
    public final AtomicReference f133w;

    /* JADX INFO: renamed from: x */
    public final AtomicReference f134x;

    /* JADX INFO: renamed from: y */
    public final Lock f135y;

    /* JADX INFO: renamed from: z */
    public final Lock f136z;

    public C0013ac() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f135y = reentrantReadWriteLock.readLock();
        this.f136z = reentrantReadWriteLock.writeLock();
        this.f134x = new AtomicReference(f129D);
        this.f133w = new AtomicReference();
        this.f131A = new AtomicReference();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m171G(C0945zb c0945zb) {
        C0945zb[] c0945zbArr;
        while (true) {
            AtomicReference atomicReference = this.f134x;
            C0945zb[] c0945zbArr2 = (C0945zb[]) atomicReference.get();
            int length = c0945zbArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c0945zbArr2[i] == c0945zb) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c0945zbArr = f129D;
            } else {
                C0945zb[] c0945zbArr3 = new C0945zb[length - 1];
                System.arraycopy(c0945zbArr2, 0, c0945zbArr3, 0, i);
                System.arraycopy(c0945zbArr2, i + 1, c0945zbArr3, i, (length - i) - 1);
                c0945zbArr = c0945zbArr3;
            }
            while (!atomicReference.compareAndSet(c0945zbArr2, c0945zbArr)) {
                if (atomicReference.get() != c0945zbArr2) {
                }
            }
            return;
        }
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: a */
    public final void mo172a(InterfaceC0187eu interfaceC0187eu) {
        if (this.f131A.get() != null) {
            interfaceC0187eu.mo480c();
        }
    }

    @Override // p000.ft0
    public final void onComplete() {
        AtomicReference atomicReference;
        C0634qx c0634qx = AbstractC0671rx.f6987a;
        do {
            atomicReference = this.f131A;
            if (atomicReference.compareAndSet(null, c0634qx)) {
                AtomicReference atomicReference2 = this.f134x;
                C0945zb[] c0945zbArr = f130E;
                C0945zb[] c0945zbArr2 = (C0945zb[]) atomicReference2.getAndSet(c0945zbArr);
                ps0 ps0Var = ps0.f6243j;
                if (c0945zbArr2 != c0945zbArr) {
                    Lock lock = this.f136z;
                    lock.lock();
                    this.f132B++;
                    this.f133w.lazySet(ps0Var);
                    lock.unlock();
                }
                for (C0945zb c0945zb : c0945zbArr2) {
                    c0945zb.m5871a(ps0Var, this.f132B);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // p000.ft0
    public final void onError(Throwable th) {
        AtomicReference atomicReference;
        zg1.m5905p(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        do {
            atomicReference = this.f131A;
            if (atomicReference.compareAndSet(null, th)) {
                os0 os0Var = new os0(th);
                AtomicReference atomicReference2 = this.f134x;
                C0945zb[] c0945zbArr = f130E;
                C0945zb[] c0945zbArr2 = (C0945zb[]) atomicReference2.getAndSet(c0945zbArr);
                if (c0945zbArr2 != c0945zbArr) {
                    Lock lock = this.f136z;
                    lock.lock();
                    this.f132B++;
                    this.f133w.lazySet(os0Var);
                    lock.unlock();
                }
                for (C0945zb c0945zb : c0945zbArr2) {
                    c0945zb.m5871a(os0Var, this.f132B);
                }
                return;
            }
        } while (atomicReference.get() == null);
        vt1.m5196h(th);
    }

    @Override // p000.ft0
    public final void onNext(Object obj) {
        zg1.m5905p(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f131A.get() != null) {
            return;
        }
        Lock lock = this.f136z;
        lock.lock();
        this.f132B++;
        this.f133w.lazySet(obj);
        lock.unlock();
        for (C0945zb c0945zb : (C0945zb[]) this.f134x.get()) {
            c0945zb.m5871a(obj, this.f132B);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: w */
    public final void mo173w(ft0 ft0Var) {
        C0163e6 c0163e6;
        Object obj;
        C0945zb c0945zb = new C0945zb(ft0Var, this);
        ft0Var.mo172a(c0945zb);
        AtomicReference atomicReference = this.f134x;
        while (true) {
            C0945zb[] c0945zbArr = (C0945zb[]) atomicReference.get();
            if (c0945zbArr == f130E) {
                Throwable th = (Throwable) this.f131A.get();
                if (th == AbstractC0671rx.f6987a) {
                    ft0Var.onComplete();
                    return;
                } else {
                    ft0Var.onError(th);
                    return;
                }
            }
            int length = c0945zbArr.length;
            C0945zb[] c0945zbArr2 = new C0945zb[length + 1];
            System.arraycopy(c0945zbArr, 0, c0945zbArr2, 0, length);
            c0945zbArr2[length] = c0945zb;
            do {
                if (atomicReference.compareAndSet(c0945zbArr, c0945zbArr2)) {
                    if (c0945zb.f9724p) {
                        m171G(c0945zb);
                        return;
                    }
                    if (c0945zb.f9724p) {
                        return;
                    }
                    synchronized (c0945zb) {
                        try {
                            if (c0945zb.f9724p) {
                                return;
                            }
                            if (c0945zb.f9720l) {
                                return;
                            }
                            C0013ac c0013ac = c0945zb.f9719k;
                            Lock lock = c0013ac.f135y;
                            lock.lock();
                            c0945zb.f9725q = c0013ac.f132B;
                            Object obj2 = c0013ac.f133w.get();
                            lock.unlock();
                            c0945zb.f9721m = obj2 != null;
                            c0945zb.f9720l = true;
                            if (obj2 == null || c0945zb.test(obj2)) {
                                return;
                            }
                            while (!c0945zb.f9724p) {
                                synchronized (c0945zb) {
                                    try {
                                        c0163e6 = c0945zb.f9722n;
                                        if (c0163e6 == null) {
                                            c0945zb.f9721m = false;
                                            return;
                                        }
                                        c0945zb.f9722n = null;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                for (Object[] objArr = (Object[]) c0163e6.f1965l; objArr != null; objArr = objArr[4]) {
                                    for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                                        if (c0945zb.test(obj)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } while (atomicReference.get() == c0945zbArr);
        }
    }
}
