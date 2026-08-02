package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class I extends AbstractC1037d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient j$.time.g a;

    @Override // j$.time.chrono.InterfaceC1035b
    public final InterfaceC1038e E(j$.time.k kVar) {
        return new C1040g(this, kVar);
    }

    public I(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final l getChronology() {
        return G.c;
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final int hashCode() {
        G.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final m G() {
        return O() >= 1 ? J.BE : J.BEFORE_BE;
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
        int i = H.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.j(qVar);
        }
        if (i != 4) {
            return G.c.t(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.f(1L, O() <= 0 ? (-(uVar.a + 543)) + 1 : 543 + uVar.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = H.a[((j$.time.temporal.a) qVar).ordinal()];
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
        return this.a.a + 543;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (h(aVar) == j) {
                return this;
            }
            int[] iArr = H.a;
            int i = iArr[aVar.ordinal()];
            if (i != 4) {
                if (i == 5) {
                    G.c.t(aVar).b(j, aVar);
                    long O = O() * 12;
                    return Q(this.a.Z(j - ((O + r10.b) - 1)));
                }
                if (i != 6) {
                }
            }
            int a = G.c.t(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 4) {
                j$.time.g gVar = this.a;
                if (O() < 1) {
                    a = 1 - a;
                }
                return Q(gVar.f0(a - 543));
            }
            if (i2 == 6) {
                return Q(this.a.f0(a - 543));
            }
            if (i2 == 7) {
                return Q(this.a.f0((-542) - O()));
            }
            return Q(this.a.c(j, qVar));
        }
        return (I) super.c(j, qVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    /* renamed from: i */
    public final j$.time.temporal.m k(j$.time.g gVar) {
        return (I) super.k(gVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final InterfaceC1035b k(j$.time.temporal.n nVar) {
        return (I) super.k(nVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final InterfaceC1035b K(j$.time.temporal.p pVar) {
        return (I) super.K(pVar);
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
        return (I) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.s sVar) {
        return (I) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final InterfaceC1035b a(long j, j$.time.temporal.s sVar) {
        return (I) super.a(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return (I) super.a(j, sVar);
    }

    public final I Q(j$.time.g gVar) {
        return gVar.equals(this.a) ? this : new I(gVar);
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
        if (obj instanceof I) {
            return this.a.equals(((I) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 8, this);
    }
}
