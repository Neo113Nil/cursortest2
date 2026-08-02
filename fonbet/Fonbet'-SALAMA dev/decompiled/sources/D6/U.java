package D6;

import F2.W0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class U implements Runnable, Comparable, O {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f1805a;

    /* renamed from: b, reason: collision with root package name */
    public int f1806b = -1;

    public U(long j) {
        this.f1805a = j;
    }

    public final int a(long j, V v6, W w7) {
        synchronized (this) {
            if (this._heap == E.f1779b) {
                return 2;
            }
            synchronized (v6) {
                try {
                    U[] uArr = v6.f3767a;
                    U u4 = uArr != null ? uArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W.f1808x;
                    w7.getClass();
                    if (W.f1810z.get(w7) != 0) {
                        return 1;
                    }
                    if (u4 == null) {
                        v6.f1807c = j;
                    } else {
                        long j3 = u4.f1805a;
                        if (j3 - j < 0) {
                            j = j3;
                        }
                        if (j - v6.f1807c > 0) {
                            v6.f1807c = j;
                        }
                    }
                    long j7 = this.f1805a;
                    long j8 = v6.f1807c;
                    if (j7 - j8 < 0) {
                        this.f1805a = j8;
                    }
                    v6.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(V v6) {
        if (this._heap == E.f1779b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = v6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f1805a - ((U) obj).f1805a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // D6.O
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                W0 w02 = E.f1779b;
                if (obj == w02) {
                    return;
                }
                V v6 = obj instanceof V ? (V) obj : null;
                if (v6 != null) {
                    synchronized (v6) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof I6.y ? (I6.y) obj2 : null) != null) {
                            v6.b(this.f1806b);
                        }
                    }
                }
                this._heap = w02;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f1805a + ']';
    }
}
