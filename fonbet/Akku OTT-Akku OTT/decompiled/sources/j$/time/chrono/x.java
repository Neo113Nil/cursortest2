package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes6.dex */
public final class x extends AbstractC1037d {
    public static final j$.time.g d = j$.time.g.U(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient j$.time.g a;
    public final transient y b;
    public final transient int c;

    @Override // j$.time.chrono.InterfaceC1035b
    public final InterfaceC1038e E(j$.time.k kVar) {
        return new C1040g(this, kVar);
    }

    public x(j$.time.g gVar) {
        if (gVar.Q(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        y l = y.l(gVar);
        this.b = l;
        this.c = (gVar.a - l.b.a) + 1;
        this.a = gVar;
    }

    public x(y yVar, int i, j$.time.g gVar) {
        if (gVar.Q(d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = yVar;
        this.c = i;
        this.a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final l getChronology() {
        return v.c;
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final int hashCode() {
        v.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final m G() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC1035b, j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isDateBased();
        }
        return qVar != null && qVar.o(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    @Override // j$.time.temporal.TemporalAccessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j$.time.temporal.u j(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.v(this);
        }
        if (!g(qVar)) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i2 = w.a[aVar.ordinal()];
        if (i2 == 1) {
            return j$.time.temporal.u.f(1L, this.a.S());
        }
        if (i2 != 2) {
            if (i2 != 3) {
                return v.c.t(aVar);
            }
            y yVar = this.b;
            int i3 = yVar.b.a;
            return yVar.m() != null ? j$.time.temporal.u.f(1L, (r6.b.a - i3) + 1) : j$.time.temporal.u.f(1L, 999999999 - i3);
        }
        y m = this.b.m();
        if (m != null) {
            j$.time.g gVar = m.b;
            if (gVar.a == this.a.a) {
                i = gVar.P() - 1;
                if (this.c == 1) {
                    i -= this.b.b.P() - 1;
                }
                return j$.time.temporal.u.f(1L, i);
            }
        }
        i = this.a.R() ? 366 : 365;
        if (this.c == 1) {
        }
        return j$.time.temporal.u.f(1L, i);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.I(this);
        }
        switch (w.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 2:
                return this.c == 1 ? (this.a.P() - this.b.b.P()) + 1 : this.a.P();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
            case 8:
                return this.b.a;
            default:
                return this.a.h(qVar);
        }
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final x c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (h(aVar) == j) {
                return this;
            }
            int[] iArr = w.a;
            int i = iArr[aVar.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                v vVar = v.c;
                int a = vVar.t(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 == 3) {
                    return Q(this.a.f0(vVar.x(this.b, a)));
                }
                if (i2 == 8) {
                    return Q(this.a.f0(vVar.x(y.n(a), this.c)));
                }
                if (i2 == 9) {
                    return Q(this.a.f0(a));
                }
            }
            return Q(this.a.c(j, qVar));
        }
        return (x) super.c(j, qVar);
    }

    public final x R(j$.time.h hVar) {
        return (x) super.k(hVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    /* renamed from: i */
    public final j$.time.temporal.m k(j$.time.g gVar) {
        return (x) super.k(gVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final InterfaceC1035b k(j$.time.temporal.n nVar) {
        return (x) super.k(nVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final InterfaceC1035b K(j$.time.temporal.p pVar) {
        return (x) super.K(pVar);
    }

    @Override // j$.time.chrono.AbstractC1037d
    public final InterfaceC1035b I(long j) {
        return Q(this.a.b0(j));
    }

    @Override // j$.time.chrono.AbstractC1037d
    public final InterfaceC1035b A(long j) {
        return Q(this.a.Z(j));
    }

    @Override // j$.time.chrono.AbstractC1037d
    public final InterfaceC1035b v(long j) {
        return Q(this.a.Y(j));
    }

    public final x O(long j, j$.time.temporal.b bVar) {
        return (x) super.d(j, (j$.time.temporal.s) bVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final InterfaceC1035b d(long j, j$.time.temporal.s sVar) {
        return (x) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.s sVar) {
        return (x) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final InterfaceC1035b a(long j, j$.time.temporal.s sVar) {
        return (x) super.a(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return (x) super.a(j, sVar);
    }

    public final x Q(j$.time.g gVar) {
        return gVar.equals(this.a) ? this : new x(gVar);
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final long D() {
        return this.a.D();
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 4, this);
    }
}
