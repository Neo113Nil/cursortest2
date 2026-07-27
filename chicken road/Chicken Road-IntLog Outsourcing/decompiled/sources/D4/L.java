package D4;

import G0.C0051a;
import b2.AbstractC0279e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class L implements Runnable, Comparable, G {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f469a;

    /* renamed from: b, reason: collision with root package name */
    public int f470b = -1;

    public L(long j2) {
        this.f469a = j2;
    }

    public final int a(long j2, M m6, N n6) {
        synchronized (this) {
            if (this._heap == AbstractC0024y.f549b) {
                return 2;
            }
            synchronized (m6) {
                try {
                    L[] lArr = m6.f1331a;
                    L l2 = lArr != null ? lArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N.f472g;
                    n6.getClass();
                    if (N.f474i.get(n6) != 0) {
                        return 1;
                    }
                    if (l2 == null) {
                        m6.f471c = j2;
                    } else {
                        long j6 = l2.f469a;
                        if (j6 - j2 < 0) {
                            j2 = j6;
                        }
                        if (j2 - m6.f471c > 0) {
                            m6.f471c = j2;
                        }
                    }
                    long j7 = this.f469a;
                    long j8 = m6.f471c;
                    if (j7 - j8 < 0) {
                        this.f469a = j8;
                    }
                    m6.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // D4.G
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0051a c0051a = AbstractC0024y.f549b;
                if (obj == c0051a) {
                    return;
                }
                M m6 = obj instanceof M ? (M) obj : null;
                if (m6 != null) {
                    synchronized (m6) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof I4.y ? (I4.y) obj2 : null) != null) {
                            m6.b(this.f470b);
                        }
                    }
                }
                this._heap = c0051a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j2 = this.f469a - ((L) obj).f469a;
        if (j2 > 0) {
            return 1;
        }
        return j2 < 0 ? -1 : 0;
    }

    public final void d(M m6) {
        if (this._heap == AbstractC0024y.f549b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = m6;
    }

    public String toString() {
        return AbstractC0279e.g(new StringBuilder("Delayed[nanos="), this.f469a, ']');
    }
}
