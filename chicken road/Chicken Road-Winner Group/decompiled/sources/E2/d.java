package E2;

import B2.v;
import d2.C0279i;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.AbstractC1242v;
import w2.C1227f;

/* loaded from: classes.dex */
public final class d extends i implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f346g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner = e.f347a;

    public final Object c(AbstractC0343b abstractC0343b) {
        boolean d3 = d();
        C0279i c0279i = C0279i.f4852a;
        if (!d3) {
            C1227f d4 = AbstractC1242v.d(F2.b.y(abstractC0343b));
            try {
                a(new c(this, d4));
                Object s3 = d4.s();
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                if (s3 != enumC0326a) {
                    s3 = c0279i;
                }
                if (s3 == enumC0326a) {
                    return s3;
                }
            } catch (Throwable th) {
                d4.z();
                throw th;
            }
        }
        return c0279i;
    }

    public final boolean d() {
        int i3;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else {
                if (i4 <= 0) {
                    c3 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    f346g.set(this, null);
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
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(i.f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f346g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = e.f347a;
            if (obj2 != vVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, vVar)) {
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
        sb.append(AbstractC1242v.c(this));
        sb.append("[isLocked=");
        sb.append(Math.max(i.f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f346g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
