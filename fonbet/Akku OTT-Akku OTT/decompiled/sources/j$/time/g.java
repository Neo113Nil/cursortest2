package j$.time;

import j$.time.chrono.InterfaceC1035b;
import j$.time.chrono.InterfaceC1038e;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class g implements j$.time.temporal.m, j$.time.temporal.n, InterfaceC1035b, Serializable {
    public static final g d = U(-999999999, 1, 1);
    public static final g e = U(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        U(1970, 1, 1);
    }

    public static g U(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.P(i);
        j$.time.temporal.a.MONTH_OF_YEAR.P(i2);
        j$.time.temporal.a.DAY_OF_MONTH.P(i3);
        return v(i, i2, i3);
    }

    public static g W(int i, int i2) {
        long j = i;
        j$.time.temporal.a.YEAR.P(j);
        j$.time.temporal.a.DAY_OF_YEAR.P(i2);
        j$.time.chrono.s.c.getClass();
        boolean Q = j$.time.chrono.s.Q(j);
        if (i2 == 366 && !Q) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        m I = m.I(((i2 - 1) / 31) + 1);
        if (i2 > (I.v(Q) + I.o(Q)) - 1) {
            I = m.a[((((int) 1) + 12) + I.ordinal()) % 12];
        }
        return new g(i, I.getValue(), (i2 - I.o(Q)) + 1);
    }

    public static g V(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.P(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new g(aVar.b.a(j7, aVar), i3, i4);
    }

    public static g A(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        g gVar = (g) temporalAccessor.b(j$.time.temporal.r.f);
        if (gVar != null) {
            return gVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static g v(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.s.c.getClass();
                if (j$.time.chrono.s.Q(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new c("Invalid date '" + m.I(i2).name() + " " + i3 + "'");
            }
        }
        return new g(i, i2, i3);
    }

    public static g c0(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.s.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.s.Q((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new g(i, i2, i3);
    }

    public g(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static g T(a aVar) {
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.a;
        Objects.requireNonNull(ofEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return V(Math.floorDiv(ofEpochMilli.getEpochSecond() + zoneId.o().d(ofEpochMilli).b, 86400));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u j(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.v(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.u.f(1L, S());
        }
        if (i == 2) {
            return j$.time.temporal.u.f(1L, R() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? ((j$.time.temporal.a) qVar).b : this.a <= 0 ? j$.time.temporal.u.f(1L, 1000000000L) : j$.time.temporal.u.f(1L, 999999999L);
        }
        return j$.time.temporal.u.f(1L, (m.I(this.b) != m.FEBRUARY || R()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return I(qVar);
        }
        return super.f(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return D();
            }
            if (qVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return I(qVar);
            }
            return ((this.a * 12) + this.b) - 1;
        }
        return qVar.I(this);
    }

    public final int I(j$.time.temporal.q qVar) {
        switch (f.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return P();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return O().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((P() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((P() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final j$.time.chrono.l getChronology() {
        return j$.time.chrono.s.c;
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final j$.time.chrono.m G() {
        return this.a >= 1 ? j$.time.chrono.t.CE : j$.time.chrono.t.BCE;
    }

    public final int P() {
        return (m.I(this.b).o(R()) + this.c) - 1;
    }

    public final DayOfWeek O() {
        return DayOfWeek.o(((int) Math.floorMod(D() + 3, 7)) + 1);
    }

    public final boolean R() {
        j$.time.chrono.s sVar = j$.time.chrono.s.c;
        long j = this.a;
        sVar.getClass();
        return j$.time.chrono.s.Q(j);
    }

    public final int S() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : R() ? 29 : 28;
    }

    @Override // j$.time.chrono.InterfaceC1035b
    /* renamed from: e0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g k(j$.time.temporal.n nVar) {
        if (nVar instanceof g) {
            return (g) nVar;
        }
        return (g) nVar.e(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final g c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (g) qVar.O(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.P(j);
        switch (f.a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return U(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (P() != i2) {
                    return W(this.a, i2);
                }
                return this;
            case 3:
                return a0(j - h(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return f0((int) j);
            case 5:
                return Y(j - O().getValue());
            case 6:
                return Y(j - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return Y(j - h(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return V(j);
            case 9:
                return a0(j - h(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    j$.time.temporal.a.MONTH_OF_YEAR.P(i3);
                    return c0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return Z(j - (((this.a * 12) + this.b) - 1));
            case 12:
                return f0((int) j);
            case 13:
                if (h(j$.time.temporal.a.ERA) != j) {
                    return f0(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
    }

    public final g f0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.P(i);
        return c0(i, this.b, this.c);
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final InterfaceC1035b K(j$.time.temporal.p pVar) {
        if (pVar != null) {
            r rVar = (r) pVar;
            return Z((rVar.a * 12) + rVar.b).Y(rVar.c);
        }
        Objects.requireNonNull(pVar, "amountToAdd");
        return (g) ((r) pVar).o(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final g d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (g) sVar.o(this, j);
        }
        switch (f.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return Y(j);
            case 2:
                return a0(j);
            case 3:
                return Z(j);
            case 4:
                return b0(j);
            case 5:
                return b0(Math.multiplyExact(j, 10));
            case 6:
                return b0(Math.multiplyExact(j, 100));
            case 7:
                return b0(Math.multiplyExact(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(Math.addExact(h(aVar), j), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final g b0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return c0(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    public final g Z(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return c0(aVar.b.a(Math.floorDiv(j2, j3), aVar), ((int) Math.floorMod(j2, j3)) + 1, this.c);
    }

    public final g a0(long j) {
        return Y(Math.multiplyExact(j, 7));
    }

    public final g Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new g(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long S = S();
                if (j2 <= S) {
                    return new g(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new g(this.a, s + 1, (int) (j2 - S));
                }
                j$.time.temporal.a.YEAR.P(this.a + 1);
                return new g(this.a + 1, 1, (int) (j2 - S));
            }
        }
        return V(Math.addExact(D(), j));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, sVar).d(1L, sVar) : d(-j, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(h hVar) {
        return hVar == j$.time.temporal.r.f ? this : super.b(hVar);
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final InterfaceC1038e E(k kVar) {
        return LocalDateTime.I(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final long D() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !R() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC1035b, java.lang.Comparable
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC1035b interfaceC1035b) {
        if (interfaceC1035b instanceof g) {
            return o((g) interfaceC1035b);
        }
        return super.compareTo(interfaceC1035b);
    }

    public final int o(g gVar) {
        int i = this.a - gVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - gVar.b;
        return i2 == 0 ? this.c - gVar.c : i2;
    }

    public final boolean Q(InterfaceC1035b interfaceC1035b) {
        return interfaceC1035b instanceof g ? o((g) interfaceC1035b) < 0 : D() < interfaceC1035b.D();
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && o((g) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new s((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
