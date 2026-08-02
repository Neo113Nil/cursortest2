package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class C extends AbstractC1037d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient j$.time.g a;

    @Override // j$.time.chrono.InterfaceC1035b
    public final InterfaceC1038e E(j$.time.k kVar) {
        return new C1040g(this, kVar);
    }

    public C(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final l getChronology() {
        return A.c;
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final int hashCode() {
        A.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final m G() {
        return O() >= 1 ? D.ROC : D.BEFORE_ROC;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u j(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.v(this);
        }
        if (!g(qVar)) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = B.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.j(qVar);
        }
        if (i != 4) {
            return A.c.t(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.f(1L, O() <= 0 ? (-uVar.a) + 1912 : uVar.d - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = B.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 4) {
                int O = O();
                if (O < 1) {
                    O = 1 - O;
                }
                return O;
            }
            if (i == 5) {
                return ((O() * 12) + this.a.b) - 1;
            }
            if (i == 6) {
                return O();
            }
            if (i != 7) {
                return this.a.h(qVar);
            }
            return O() < 1 ? 0 : 1;
        }
        return qVar.I(this);
    }

    public final int O() {
        return this.a.a - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (h(aVar) == j) {
                return this;
            }
            int[] iArr = B.a;
            int i = iArr[aVar.ordinal()];
            if (i != 4) {
                if (i == 5) {
                    A.c.t(aVar).b(j, aVar);
                    long O = O() * 12;
                    return Q(this.a.Z(j - ((O + r10.b) - 1)));
                }
                if (i != 6) {
                }
            }
            int a = A.c.t(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 4) {
                return Q(this.a.f0(O() >= 1 ? a + 1911 : 1912 - a));
            }
            if (i2 == 6) {
                return Q(this.a.f0(a + 1911));
            }
            if (i2 == 7) {
                return Q(this.a.f0(1912 - O()));
            }
            return Q(this.a.c(j, qVar));
        }
        return (C) super.c(j, qVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    /* renamed from: i */
    public final j$.time.temporal.m k(j$.time.g gVar) {
        return (C) super.k(gVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final InterfaceC1035b k(j$.time.temporal.n nVar) {
        return (C) super.k(nVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final InterfaceC1035b K(j$.time.temporal.p pVar) {
        return (C) super.K(pVar);
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

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final InterfaceC1035b d(long j, j$.time.temporal.s sVar) {
        return (C) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.s sVar) {
        return (C) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final InterfaceC1035b a(long j, j$.time.temporal.s sVar) {
        return (C) super.a(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return (C) super.a(j, sVar);
    }

    public final C Q(j$.time.g gVar) {
        return gVar.equals(this.a) ? this : new C(gVar);
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
        if (obj instanceof C) {
            return this.a.equals(((C) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 7, this);
    }
}
