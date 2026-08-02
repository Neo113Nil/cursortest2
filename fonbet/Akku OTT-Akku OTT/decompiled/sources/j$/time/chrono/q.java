package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class q extends AbstractC1037d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient o a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    @Override // j$.time.chrono.InterfaceC1035b
    public final InterfaceC1038e E(j$.time.k kVar) {
        return new C1040g(this, kVar);
    }

    public q(o oVar, int i, int i2, int i3) {
        oVar.S(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public q(o oVar, long j) {
        int i = (int) j;
        oVar.Q();
        if (i < oVar.e || i >= oVar.f) {
            throw new j$.time.c("Hijrah date out of range");
        }
        int binarySearch = Arrays.binarySearch(oVar.d, i);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int i2 = oVar.g;
        int[] iArr = {(binarySearch + i2) / 12, ((i2 + binarySearch) % 12) + 1, (i - oVar.d[binarySearch]) + 1};
        this.a = oVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final l getChronology() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final m G() {
        return r.AH;
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
        int i = p.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.t(aVar) : j$.time.temporal.u.f(1L, 5L) : j$.time.temporal.u.f(1L, this.a.V(this.b, 12)) : j$.time.temporal.u.f(1L, this.a.T(this.b, this.c));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.I(this);
        }
        switch (p.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return O();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(D() + 3, 7)) + 1;
            case 5:
                return ((this.d - 1) % 7) + 1;
            case 6:
                return ((O() - 1) % 7) + 1;
            case 7:
                return D();
            case 8:
                return ((O() - 1) / 7) + 1;
            case 9:
                return this.c;
            case 10:
                return ((this.b * 12) + this.c) - 1;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final q c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (q) super.c(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        this.a.t(aVar).b(j, aVar);
        int i = (int) j;
        switch (p.a[aVar.ordinal()]) {
            case 1:
                return R(this.b, this.c, i);
            case 2:
                return v(Math.min(i, this.a.V(this.b, 12)) - O());
            case 3:
                return v((j - h(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return v(j - (((int) Math.floorMod(D() + 3, 7)) + 1));
            case 5:
                return v(j - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return v(j - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(this.a, j);
            case 8:
                return v((j - h(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return R(this.b, i, this.d);
            case 10:
                return A(j - (((this.b * 12) + this.c) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return R(i, this.c, this.d);
            case 12:
                return R(i, this.c, this.d);
            case 13:
                return R(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
    }

    public final q R(int i, int i2, int i3) {
        int T = this.a.T(i, i2);
        if (i3 > T) {
            i3 = T;
        }
        return new q(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    /* renamed from: i */
    public final j$.time.temporal.m k(j$.time.g gVar) {
        return (q) super.k(gVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final InterfaceC1035b k(j$.time.temporal.n nVar) {
        return (q) super.k(nVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final InterfaceC1035b K(j$.time.temporal.p pVar) {
        return (q) super.K(pVar);
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final long D() {
        return this.a.S(this.b, this.c, this.d);
    }

    public final int O() {
        return this.a.V(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.AbstractC1037d
    public final InterfaceC1035b I(long j) {
        return j == 0 ? this : R(Math.addExact(this.b, (int) j), this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC1037d
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final q A(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        o oVar = this.a;
        long floorDiv = Math.floorDiv(j2, 12L);
        int i = oVar.g;
        if (floorDiv >= i / 12 && floorDiv <= (((oVar.d.length - 1) + i) / 12) - 1) {
            return R((int) floorDiv, ((int) Math.floorMod(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.c("Invalid Hijrah year: " + floorDiv);
    }

    @Override // j$.time.chrono.AbstractC1037d
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final q v(long j) {
        return new q(this.a, D() + j);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final InterfaceC1035b d(long j, j$.time.temporal.s sVar) {
        return (q) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.s sVar) {
        return (q) super.d(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final InterfaceC1035b a(long j, j$.time.temporal.s sVar) {
        return (q) super.a(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return (q) super.a(j, sVar);
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.a.equals(qVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC1037d, j$.time.chrono.InterfaceC1035b
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return (((i << 11) + (i2 << 6)) + i3) ^ ((i & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 6, this);
    }
}
