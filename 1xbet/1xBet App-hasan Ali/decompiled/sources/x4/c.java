package x4;

import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4.AbstractC2282w;
import p4.C2268h;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class c extends h implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21100h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f21101a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        r0 = r1.f21099l;
        r3.set(r0, null);
        r2 = new O3.f(11, r0, r1);
        r0 = r1.f21098k;
        r0.A(r6, r0.f18742m, new p4.C2267g(0, r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC0542c abstractC0542c) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i5;
        char c5;
        while (true) {
            atomicIntegerFieldUpdater = h.f21107g;
            int i6 = atomicIntegerFieldUpdater.get(this);
            i = this.f21108a;
            if (i6 > i) {
                do {
                    i5 = atomicIntegerFieldUpdater.get(this);
                    if (i5 > i) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, i));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21100h;
                if (i6 <= 0) {
                    c5 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i6, i6 - 1)) {
                    atomicReferenceFieldUpdater.set(this, null);
                    c5 = 0;
                    break;
                }
            }
        }
        o oVar = o.f6046a;
        if (c5 != 0) {
            if (c5 != 1) {
                if (c5 != 2) {
                    throw new IllegalStateException("unexpected");
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null");
            }
            C2268h k5 = AbstractC2282w.k(AbstractC2346c.v(abstractC0542c));
            try {
                b bVar = new b(this, k5);
                while (true) {
                    int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement <= i) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (a(bVar)) {
                            break;
                        }
                    }
                }
                Object q5 = k5.q();
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                if (q5 != enumC0510a) {
                    q5 = oVar;
                }
                if (q5 == enumC0510a) {
                    return q5;
                }
            } catch (Throwable th) {
                k5.z();
                throw th;
            }
        }
        return oVar;
    }

    public final void d(Object obj) {
        while (Math.max(h.f21107g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21100h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            H3.g gVar = d.f21101a;
            if (obj2 != gVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, gVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC2282w.i(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f21107g.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f21100h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
