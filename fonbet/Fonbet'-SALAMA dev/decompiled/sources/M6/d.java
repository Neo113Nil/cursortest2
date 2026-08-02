package M6;

import D6.C0130m;
import D6.E;
import F2.W0;
import f6.C1116i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4612g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z4) {
        super(z4 ? 1 : 0);
        this.owner = z4 ? null : e.f4613a;
    }

    @Override // M6.a
    public final Object a(AbstractC1356c abstractC1356c) {
        boolean e7 = e(null);
        C1116i c1116i = C1116i.f13008a;
        if (e7) {
            return c1116i;
        }
        C0130m j = E.j(P6.b.v(abstractC1356c));
        try {
            c(new c(this, j));
            Object r7 = j.r();
            j6.a aVar = j6.a.f14642a;
            if (r7 != aVar) {
                r7 = c1116i;
            }
            return r7 == aVar ? r7 : c1116i;
        } catch (Throwable th) {
            j.z();
            throw th;
        }
    }

    @Override // M6.a
    public final void b(Object obj) {
        while (Math.max(h.f4620f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4612g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            W0 w02 = e.f4613a;
            if (obj2 != w02) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, w02)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    d();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean e(Object obj) {
        int i7;
        char c3;
        char c4;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f4620f;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4612g;
                if (i8 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c4 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f4613a) {
                                c4 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c4 == 1) {
                            c3 = 2;
                            break;
                        }
                        if (c4 == 2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c3 = 0;
                    break;
                }
            }
        }
        c3 = 1;
        if (c3 == 0) {
            return true;
        }
        if (c3 == 1) {
            return false;
        }
        if (c3 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(E.i(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f4620f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f4612g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
