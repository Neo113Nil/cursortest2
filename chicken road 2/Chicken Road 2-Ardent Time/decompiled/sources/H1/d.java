package H1;

/* loaded from: classes.dex */
public final class d extends H1.h implements H1.a {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f625g = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(H1.d.class, java.lang.Object.class, "owner");
    private volatile java.lang.Object owner;

    public d(boolean z2) {
        super(z2 ? 1 : 0);
        this.owner = z2 ? null : H1.e.f626a;
    }

    public final java.lang.Object c(m1.AbstractC0931b abstractC0931b) {
        boolean d2 = d(null);
        h1.C0177i c0177i = h1.C0177i.f3302a;
        if (d2) {
            return c0177i;
        }
        z1.C1053f c2 = z1.AbstractC1068v.c(u0.AbstractC0995a.o(abstractC0931b));
        try {
            a(new H1.c(this, c2));
            java.lang.Object t = c2.t();
            l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
            if (t != enumC0927a) {
                t = c0177i;
            }
            return t == enumC0927a ? t : c0177i;
        } catch (java.lang.Throwable th) {
            c2.A();
            throw th;
        }
    }

    public final boolean d(java.lang.Object obj) {
        int i2;
        char c2;
        char c3;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = H1.h.f633f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f625g;
                if (i3 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (java.lang.Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c3 = 0;
                                break;
                            }
                            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != H1.e.f626a) {
                                c3 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c3 == 1) {
                            c2 = 2;
                            break;
                        }
                        if (c3 == 2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c2 = 0;
                    break;
                }
            }
        }
        c2 = 1;
        if (c2 == 0) {
            return true;
        }
        if (c2 == 1) {
            return false;
        }
        if (c2 != 2) {
            throw new java.lang.IllegalStateException("unexpected");
        }
        throw new java.lang.IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(java.lang.Object obj) {
        while (java.lang.Math.max(H1.h.f633f.get(this), 0) == 0) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f625g;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            C.j jVar = H1.e.f626a;
            if (obj2 != jVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new java.lang.IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new java.lang.IllegalStateException("This mutex is not locked");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mutex@");
        sb.append(z1.AbstractC1068v.b(this));
        sb.append("[isLocked=");
        sb.append(java.lang.Math.max(H1.h.f633f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f625g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
