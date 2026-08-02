package p4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class H implements Runnable, Comparable, E {
    private volatile Object _heap;

    /* renamed from: k, reason: collision with root package name */
    public long f18747k;

    /* renamed from: l, reason: collision with root package name */
    public int f18748l;

    @Override // p4.E
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                H3.g gVar = AbstractC2282w.f18827b;
                if (obj == gVar) {
                    return;
                }
                I i = obj instanceof I ? (I) obj : null;
                if (i != null) {
                    i.b(this);
                }
                this._heap = gVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u4.t b() {
        Object obj = this._heap;
        if (obj instanceof u4.t) {
            return (u4.t) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j5 = this.f18747k - ((H) obj).f18747k;
        if (j5 > 0) {
            return 1;
        }
        return j5 < 0 ? -1 : 0;
    }

    public final int d(long j5, I i, J j6) {
        synchronized (this) {
            if (this._heap == AbstractC2282w.f18827b) {
                return 2;
            }
            synchronized (i) {
                try {
                    H[] hArr = i.f20117a;
                    H h3 = hArr != null ? hArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = J.f18750q;
                    j6.getClass();
                    if (J.f18752s.get(j6) != 0) {
                        return 1;
                    }
                    if (h3 == null) {
                        i.f18749c = j5;
                    } else {
                        long j7 = h3.f18747k;
                        if (j7 - j5 < 0) {
                            j5 = j7;
                        }
                        if (j5 - i.f18749c > 0) {
                            i.f18749c = j5;
                        }
                    }
                    long j8 = this.f18747k;
                    long j9 = i.f18749c;
                    if (j8 - j9 < 0) {
                        this.f18747k = j9;
                    }
                    i.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(I i) {
        if (this._heap == AbstractC2282w.f18827b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = i;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f18747k + ']';
    }
}
