package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class k implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient C1040g a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public static k v(ZoneId zoneId, ZoneOffset zoneOffset, C1040g c1040g) {
        Objects.requireNonNull(c1040g, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, c1040g);
        }
        j$.time.zone.f o = zoneId.o();
        LocalDateTime v = LocalDateTime.v(c1040g);
        List f = o.f(v);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() != 0) {
            if (zoneOffset == null || !f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f.get(0);
            }
            c1040g = c1040g;
        } else {
            Object e = o.e(v);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            c1040g = c1040g.A(c1040g.a, 0L, 0L, Duration.v(bVar.d.b - bVar.c.b, 0).getSeconds(), 0L);
            zoneOffset = bVar.d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, c1040g);
    }

    public static k A(l lVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d = zoneId.o().d(instant);
        Objects.requireNonNull(d, "offset");
        return new k(zoneId, d, (C1040g) lVar.C(LocalDateTime.O(instant.getEpochSecond(), instant.getNano(), d)));
    }

    public static k o(l lVar, j$.time.temporal.m mVar) {
        k kVar = (k) mVar;
        if (lVar.equals(kVar.getChronology())) {
            return kVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.m() + ", actual: " + kVar.getChronology().m());
    }

    public k(ZoneId zoneId, ZoneOffset zoneOffset, C1040g c1040g) {
        Objects.requireNonNull(c1040g, "dateTime");
        this.a = c1040g;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.c = zoneId;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset getOffset() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC1038e toLocalDateTime() {
        return this.a;
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

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime y(ZoneId zoneId) {
        return v(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.o(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.m
    public final ChronoZonedDateTime c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i = AbstractC1043j.a[aVar.ordinal()];
            if (i == 1) {
                return d(j - toEpochSecond(), (j$.time.temporal.s) j$.time.temporal.b.SECONDS);
            }
            if (i == 2) {
                ZoneOffset R = ZoneOffset.R(aVar.b.a(j, aVar));
                return A(getChronology(), Instant.ofEpochSecond(this.a.s(R), r5.b.d), this.c);
            }
            return v(this.c, this.b, this.a.c(j, qVar));
        }
        return o(getChronology(), qVar.O(this, j));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.m
    public final ChronoZonedDateTime d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return k(this.a.d(j, sVar));
        }
        return o(getChronology(), sVar.o(this, j));
    }

    private Object writeReplace() {
        return new E((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }
}
