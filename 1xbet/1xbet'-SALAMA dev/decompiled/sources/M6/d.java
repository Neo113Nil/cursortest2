package M6;

import D6.C0130m;
import D6.E;
import F2.W0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends h implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4612g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z4) {
        super(z4 ? 1 : 0);
        this.owner = z4 ? null : e.f4613a;
    }

    @Override // M6.a
    public final Object a(p077k6.c cVar) throws IllegalAccessException, InvocationTargetException {
        boolean zE = e(null);
        p044f6.i iVar = p044f6.i.f13014a;
        if (zE) {
            return iVar;
        }
        C0130m c0130mJ = E.j(P6.b.v(cVar));
        try {
            c(new c(this, c0130mJ));
            Object objR = c0130mJ.r();
            j6.a aVar = j6.a.f14648a;
            if (objR != aVar) {
                objR = iVar;
            }
            return objR == aVar ? objR : iVar;
        } catch (Throwable th) {
            c0130mJ.z();
            throw th;
        }
    }

    @Override // M6.a
    public final void b(Object obj) {
        while (Math.max(h.f4620f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4612g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            W0 w7 = e.f4613a;
            if (obj2 != w7) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, w7)) {
                        d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
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
                    if (i7 <= 1) {
                        break;
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
                                if (obj2 != obj) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 1;
                                break;
                            }
                        }
                        if (c4 == 1) {
                            c3 = 2;
                            break;
                        }
                        if (c4 != 2) {
                        }
                    }
                    c3 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c3 = 0;
                    break;
                }
            }
        }
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
