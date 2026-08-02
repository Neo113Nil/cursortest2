package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1035b;
import j$.time.chrono.InterfaceC1038e;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class ZonedDateTime implements j$.time.temporal.m, ChronoZonedDateTime<g>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    public static ZonedDateTime now(ZoneId zoneId) {
        a aVar;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == ZoneOffset.UTC) {
            aVar = a.b;
        } else {
            aVar = new a(zoneId);
        }
        Objects.requireNonNull(aVar, "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId2 = aVar.a;
        Objects.requireNonNull(ofEpochMilli, "instant");
        Objects.requireNonNull(zoneId2, "zone");
        return o(ofEpochMilli.getEpochSecond(), ofEpochMilli.getNano(), zoneId2);
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return v(localDateTime, zoneId, null);
    }

    public static ZonedDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, ZoneId zoneId) {
        LocalDateTime localDateTime = LocalDateTime.c;
        return v(new LocalDateTime(g.U(i, i2, i3), k.O(i4, i5, i6, i7)), zoneId, null);
    }

    public static ZonedDateTime v(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f o = zoneId.o();
        List f = o.f(localDateTime);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() != 0) {
            if (zoneOffset == null || !f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object e = o.e(localDateTime);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            localDateTime = localDateTime.Q(Duration.v(bVar.d.b - bVar.c.b, 0).getSeconds());
            zoneOffset = bVar.d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime o(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.o().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.O(j, i, d), zoneId, d);
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u j(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).b;
            }
            return this.a.j(qVar);
        }
        return qVar.v(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = y.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.f(qVar);
        }
        return super.f(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = y.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.h(qVar);
        }
        return qVar.I(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime y(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : v(this.a, zoneId, this.b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1038e toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1035b toLocalDate() {
        return this.a.a;
    }

    public int getYear() {
        return this.a.a.a;
    }

    public int getMonthValue() {
        return this.a.a.b;
    }

    public int getDayOfMonth() {
        return this.a.a.c;
    }

    public DayOfWeek getDayOfWeek() {
        return this.a.a.O();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k toLocalTime() {
        return this.a.b;
    }

    public int getHour() {
        return this.a.b.a;
    }

    public int getMinute() {
        return this.a.b.b;
    }

    public int getSecond() {
        return this.a.b.c;
    }

    public int getNano() {
        return this.a.b.d;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime k(g gVar) {
        return v(LocalDateTime.I(gVar, this.a.b), this.c, this.b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i = y.a[aVar.ordinal()];
            if (i == 1) {
                return o(j, getNano(), this.c);
            }
            if (i != 2) {
                return v(this.a.c(j, qVar), this.c, this.b);
            }
            ZoneOffset R = ZoneOffset.R(aVar.b.a(j, aVar));
            return (R.equals(this.b) || !this.c.o().f(this.a).contains(R)) ? this : new ZonedDateTime(this.a, this.c, R);
        }
        return (ZonedDateTime) qVar.O(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) sVar;
            if (bVar.compareTo(j$.time.temporal.b.DAYS) >= 0 && bVar != j$.time.temporal.b.FOREVER) {
                return v(this.a.d(j, sVar), this.c, this.b);
            }
            LocalDateTime d = this.a.d(j, sVar);
            ZoneOffset zoneOffset = this.b;
            ZoneId zoneId = this.c;
            Objects.requireNonNull(d, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.o().f(d).contains(zoneOffset)) {
                return new ZonedDateTime(d, zoneId, zoneOffset);
            }
            return o(d.s(zoneOffset), d.b.d, zoneId);
        }
        return (ZonedDateTime) sVar.o(this, j);
    }

    public ZonedDateTime plusDays(long j) {
        return v(this.a.plusDays(j), this.c, this.b);
    }

    @Override // j$.time.temporal.m
    public final ChronoZonedDateTime a(long j, j$.time.temporal.s sVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, sVar).d(1L, sVar) : d(-j, sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, sVar).d(1L, sVar) : d(-j, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(h hVar) {
        if (hVar == j$.time.temporal.r.f) {
            return this.a.a;
        }
        return super.b(hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
