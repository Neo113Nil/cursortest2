package p000;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v30 extends AtomicInteger implements y30, InterfaceC0187eu {

    /* JADX INFO: renamed from: r */
    public static final u30[] f8040r = new u30[0];

    /* JADX INFO: renamed from: s */
    public static final u30[] f8041s = new u30[0];

    /* JADX INFO: renamed from: j */
    public final AtomicReference f8042j;

    /* JADX INFO: renamed from: k */
    public final int f8043k;

    /* JADX INFO: renamed from: o */
    public volatile Serializable f8047o;

    /* JADX INFO: renamed from: p */
    public int f8048p;

    /* JADX INFO: renamed from: q */
    public volatile y71 f8049q;

    /* JADX INFO: renamed from: n */
    public final AtomicReference f8046n = new AtomicReference();

    /* JADX INFO: renamed from: l */
    public final AtomicReference f8044l = new AtomicReference(f8040r);

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f8045m = new AtomicBoolean();

    public v30(AtomicReference atomicReference, int i) {
        this.f8042j = atomicReference;
        this.f8043k = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5046a(Object obj, boolean z) {
        int i = 0;
        if (obj != null) {
            ps0 ps0Var = ps0.f6243j;
            u30[] u30VarArr = f8041s;
            AtomicReference atomicReference = this.f8044l;
            AtomicReference atomicReference2 = this.f8042j;
            if (obj != ps0Var) {
                Throwable th = ((os0) obj).f5852j;
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                u30[] u30VarArr2 = (u30[]) atomicReference.getAndSet(u30VarArr);
                if (u30VarArr2.length != 0) {
                    int length = u30VarArr2.length;
                    while (i < length) {
                        u30VarArr2[i].f7658j.onError(th);
                        i++;
                    }
                } else {
                    vt1.m5196h(th);
                }
                return true;
            }
            if (z) {
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                u30[] u30VarArr3 = (u30[]) atomicReference.getAndSet(u30VarArr);
                int length2 = u30VarArr3.length;
                while (i < length2) {
                    u30VarArr3[i].f7658j.onComplete();
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m5047b() {
        boolean z;
        Object objPoll;
        u30[] u30VarArr;
        Object objPoll2;
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f8044l;
        boolean z2 = true;
        u30[] u30VarArr2 = (u30[]) atomicReference.get();
        int iAddAndGet = 1;
        while (true) {
            Object obj = this.f8047o;
            y71 y71Var = this.f8049q;
            boolean z3 = (y71Var == null || y71Var.isEmpty()) ? z2 : false;
            if (m5046a(obj, z3)) {
                return;
            }
            if (z3) {
                z = z2;
            } else {
                int length = u30VarArr2.length;
                int i = 0;
                long jMin = Long.MAX_VALUE;
                for (u30 u30Var : u30VarArr2) {
                    long j = u30Var.get();
                    if (j != Long.MIN_VALUE) {
                        jMin = Math.min(jMin, j - u30Var.f7660l);
                    } else {
                        i++;
                    }
                }
                long j2 = 1;
                if (length == i) {
                    Object obj2 = this.f8047o;
                    try {
                        objPoll = y71Var.poll();
                    } catch (Throwable th) {
                        wo1.m5394u(th);
                        ((ib1) this.f8046n.get()).cancel();
                        os0 os0Var = new os0(th);
                        this.f8047o = os0Var;
                        obj2 = os0Var;
                        objPoll = null;
                    }
                    if (m5046a(obj2, objPoll == null ? z2 : false)) {
                        return;
                    }
                    if (this.f8048p != z2) {
                        ((ib1) this.f8046n.get()).request(1L);
                    }
                    z = z2;
                    u30VarArr = u30VarArr2;
                } else {
                    int i2 = 0;
                    while (true) {
                        long j3 = i2;
                        if (j3 < jMin) {
                            Object obj3 = this.f8047o;
                            try {
                                objPoll2 = y71Var.poll();
                            } catch (Throwable th2) {
                                wo1.m5394u(th2);
                                ((ib1) this.f8046n.get()).cancel();
                                os0 os0Var2 = new os0(th2);
                                this.f8047o = os0Var2;
                                obj3 = os0Var2;
                                objPoll2 = null;
                            }
                            boolean z4 = objPoll2 == null ? z2 : false;
                            if (m5046a(obj3, z4)) {
                                return;
                            }
                            if (z4) {
                                z3 = z4;
                            } else {
                                int length2 = u30VarArr2.length;
                                int i3 = 0;
                                boolean z5 = false;
                                while (i3 < length2) {
                                    long j4 = j2;
                                    u30 u30Var2 = u30VarArr2[i3];
                                    long j5 = u30Var2.get();
                                    if (j5 != Long.MIN_VALUE) {
                                        if (j5 != Long.MAX_VALUE) {
                                            u30Var2.f7660l += j4;
                                        }
                                        u30Var2.f7658j.onNext(objPoll2);
                                    } else {
                                        z5 = true;
                                    }
                                    i3++;
                                    u30VarArr2 = u30VarArr2;
                                    j2 = j4;
                                }
                                u30[] u30VarArr3 = u30VarArr2;
                                long j6 = j2;
                                i2++;
                                u30[] u30VarArr4 = (u30[]) atomicReference.get();
                                if (z5 || u30VarArr4 != u30VarArr3) {
                                    if (i2 != 0 && this.f8048p != 1) {
                                        ((ib1) this.f8046n.get()).request(i2);
                                    }
                                    u30VarArr2 = u30VarArr4;
                                    z2 = true;
                                } else {
                                    u30VarArr2 = u30VarArr3;
                                    z3 = z4;
                                    j2 = j6;
                                    z2 = true;
                                }
                            }
                        }
                        u30VarArr = u30VarArr2;
                        if (i2 != 0) {
                            z = true;
                            if (this.f8048p != 1) {
                                ((ib1) this.f8046n.get()).request(j3);
                            }
                        } else {
                            z = true;
                        }
                        if (jMin == 0 || z3) {
                        }
                        z2 = z;
                    }
                }
                u30VarArr2 = u30VarArr;
                z2 = z;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            u30VarArr2 = (u30[]) atomicReference.get();
            z2 = z;
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f8044l;
        Object obj = atomicReference2.get();
        Object obj2 = f8041s;
        if (obj == obj2 || ((u30[]) atomicReference2.getAndSet(obj2)) == obj2) {
            return;
        }
        do {
            atomicReference = this.f8042j;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        jb1.m2843a(this.f8046n);
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2844b(this.f8046n, ib1Var)) {
            if (ib1Var instanceof fz0) {
                fz0 fz0Var = (fz0) ib1Var;
                int iMo592f = fz0Var.mo592f(7);
                if (iMo592f == 1) {
                    this.f8048p = iMo592f;
                    this.f8049q = fz0Var;
                    this.f8047o = ps0.f6243j;
                    m5047b();
                    return;
                }
                if (iMo592f == 2) {
                    this.f8048p = iMo592f;
                    this.f8049q = fz0Var;
                    ib1Var.request(this.f8043k);
                    return;
                }
            }
            this.f8049q = new s91(this.f8043k);
            ib1Var.request(this.f8043k);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5048f() {
        return this.f8044l.get() == f8041s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m5049g(u30 u30Var) {
        u30[] u30VarArr;
        while (true) {
            AtomicReference atomicReference = this.f8044l;
            u30[] u30VarArr2 = (u30[]) atomicReference.get();
            int length = u30VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (u30VarArr2[i].equals(u30Var)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                u30VarArr = f8040r;
            } else {
                u30[] u30VarArr3 = new u30[length - 1];
                System.arraycopy(u30VarArr2, 0, u30VarArr3, 0, i);
                System.arraycopy(u30VarArr2, i + 1, u30VarArr3, i, (length - i) - 1);
                u30VarArr = u30VarArr3;
            }
            while (!atomicReference.compareAndSet(u30VarArr2, u30VarArr)) {
                if (atomicReference.get() != u30VarArr2) {
                }
            }
            return;
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        if (this.f8047o == null) {
            this.f8047o = ps0.f6243j;
            m5047b();
        }
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        if (this.f8047o != null) {
            vt1.m5196h(th);
        } else {
            this.f8047o = new os0(th);
            m5047b();
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f8048p != 0 || this.f8049q.offer(obj)) {
            m5047b();
        } else {
            onError(new bq0("Prefetch queue is full?!"));
        }
    }
}
