package j$.time.temporal;

import j$.time.format.w;
import j$.time.format.x;
import java.util.Map;

/* loaded from: classes6.dex */
public enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient u b;
    public final transient long c;

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.a = str;
        this.b = u.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.q
    public final m O(m mVar, long j) {
        if (!this.b.e(j)) {
            throw new j$.time.c("Invalid value: " + this.a + " " + j);
        }
        return mVar.c(Math.subtractExact(j, this.c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final u range() {
        return this.b;
    }

    @Override // j$.time.temporal.q
    public final boolean o(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final u v(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.g(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new j$.time.c("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final long I(TemporalAccessor temporalAccessor) {
        return temporalAccessor.h(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.q
    public final TemporalAccessor A(Map map, w wVar, x xVar) {
        long longValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.l n = j$.time.chrono.l.n(wVar);
        x xVar2 = x.LENIENT;
        long j = this.c;
        if (xVar == xVar2) {
            return n.l(Math.subtractExact(longValue, j));
        }
        this.b.b(longValue, this);
        return n.l(longValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
