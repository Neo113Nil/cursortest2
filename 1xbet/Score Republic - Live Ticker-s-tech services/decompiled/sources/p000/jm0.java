package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jm0 extends AtomicReference implements InterfaceC0187eu, xm0, InterfaceC0435lj {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4027j;

    /* JADX INFO: renamed from: k */
    public final Object f4028k;

    public jm0(xm0 xm0Var) {
        this.f4027j = 0;
        this.f4028k = xm0Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public void mo975a(InterfaceC0187eu interfaceC0187eu) {
        switch (this.f4027j) {
            case 1:
                EnumC0262gu.m2149e(this, interfaceC0187eu);
                break;
            default:
                EnumC0262gu.m2149e(this, interfaceC0187eu);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public void mo976b(Object obj) {
        t91 t91VarM1587f;
        f30 f30Var = (f30) this.f4028k;
        f30Var.f2285m.m3949b(this);
        if (f30Var.get() == 0) {
            if (f30Var.compareAndSet(0, 1)) {
                boolean z = f30Var.f2286n.decrementAndGet() == 0;
                if (f30Var.f2284l.get() != 0) {
                    f30Var.f2282j.onNext(obj);
                    t91 t91Var = (t91) f30Var.f2289q.get();
                    if (z && (t91Var == null || t91Var.isEmpty())) {
                        C0757u8 c0757u8 = f30Var.f2287o;
                        c0757u8.getClass();
                        Throwable thM4416b = AbstractC0671rx.m4416b(c0757u8);
                        y30 y30Var = f30Var.f2282j;
                        if (thM4416b != null) {
                            y30Var.onError(thM4416b);
                            return;
                        } else {
                            y30Var.onComplete();
                            return;
                        }
                    }
                    AbstractC0875xf.m5652l(f30Var.f2284l, 1L);
                    if (f30Var.f2283k != Integer.MAX_VALUE) {
                        f30Var.f2290r.request(1L);
                    }
                } else {
                    t91 t91VarM1587f2 = f30Var.m1587f();
                    synchronized (t91VarM1587f2) {
                        t91VarM1587f2.offer(obj);
                    }
                }
                if (f30Var.decrementAndGet() == 0) {
                    return;
                }
            } else {
                t91VarM1587f = f30Var.m1587f();
                synchronized (t91VarM1587f) {
                    t91VarM1587f.offer(obj);
                }
                f30Var.f2286n.decrementAndGet();
                if (f30Var.getAndIncrement() != 0) {
                    return;
                }
            }
        } else {
            t91VarM1587f = f30Var.m1587f();
            synchronized (t91VarM1587f) {
                t91VarM1587f.offer(obj);
                f30Var.f2286n.decrementAndGet();
                if (f30Var.getAndIncrement() != 0) {
                    return;
                }
            }
        }
        f30Var.m1586c();
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        switch (this.f4027j) {
            case 0:
                EnumC0262gu.m2146a(this);
                break;
            case 1:
                EnumC0262gu.m2146a(this);
                break;
            default:
                EnumC0262gu.m2146a(this);
                break;
        }
    }

    @Override // p000.xm0
    public final void onComplete() {
        InterfaceC0187eu interfaceC0187eu;
        int i = this.f4027j;
        Object obj = this.f4028k;
        switch (i) {
            case 0:
                Object obj2 = get();
                EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
                if (obj2 == enumC0262gu || (interfaceC0187eu = (InterfaceC0187eu) getAndSet(enumC0262gu)) == enumC0262gu) {
                    return;
                }
                try {
                    ((xm0) obj).onComplete();
                    if (interfaceC0187eu != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (interfaceC0187eu != null) {
                        interfaceC0187eu.mo480c();
                    }
                }
            case 1:
                f30 f30Var = (f30) obj;
                int i2 = f30Var.f2283k;
                AtomicInteger atomicInteger = f30Var.f2286n;
                f30Var.f2285m.m3949b(this);
                if (f30Var.get() == 0) {
                    if (f30Var.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        t91 t91Var = (t91) f30Var.f2289q.get();
                        if (!z || (t91Var != null && !t91Var.isEmpty())) {
                            if (i2 != Integer.MAX_VALUE) {
                                f30Var.f2290r.request(1L);
                            }
                            if (f30Var.decrementAndGet() == 0) {
                                return;
                            }
                            f30Var.m1586c();
                            return;
                        }
                        C0757u8 c0757u8 = f30Var.f2287o;
                        c0757u8.getClass();
                        Throwable thM4416b = AbstractC0671rx.m4416b(c0757u8);
                        y30 y30Var = f30Var.f2282j;
                        if (thM4416b != null) {
                            y30Var.onError(thM4416b);
                            return;
                        } else {
                            y30Var.onComplete();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (i2 != Integer.MAX_VALUE) {
                    f30Var.f2290r.request(1L);
                }
                f30Var.m1585b();
                return;
            default:
                at0 at0Var = (at0) obj;
                at0Var.f632m.m3949b(this);
                at0Var.onComplete();
                return;
        }
    }

    @Override // p000.xm0
    public final void onError(Throwable th) {
        InterfaceC0187eu interfaceC0187eu;
        int i = this.f4027j;
        Object obj = this.f4028k;
        switch (i) {
            case 0:
                Object obj2 = get();
                EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
                if (obj2 == enumC0262gu || (interfaceC0187eu = (InterfaceC0187eu) getAndSet(enumC0262gu)) == enumC0262gu) {
                    vt1.m5196h(th);
                    return;
                }
                try {
                    ((xm0) obj).onError(th);
                    if (interfaceC0187eu != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (interfaceC0187eu != null) {
                        interfaceC0187eu.mo480c();
                    }
                }
            case 1:
                f30 f30Var = (f30) obj;
                C0584pk c0584pk = f30Var.f2285m;
                c0584pk.m3949b(this);
                C0757u8 c0757u8 = f30Var.f2287o;
                c0757u8.getClass();
                if (!AbstractC0671rx.m4415a(c0757u8, th)) {
                    vt1.m5196h(th);
                    return;
                }
                f30Var.f2290r.cancel();
                c0584pk.mo480c();
                f30Var.f2286n.decrementAndGet();
                f30Var.m1585b();
                return;
            default:
                at0 at0Var = (at0) obj;
                at0Var.f632m.m3949b(this);
                at0Var.onError(th);
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f4027j) {
            case 0:
                return jm0.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jm0(AtomicInteger atomicInteger, int i) {
        this.f4027j = i;
        this.f4028k = atomicInteger;
    }
}
