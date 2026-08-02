package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC1035b;

/* loaded from: classes6.dex */
public interface ChronoZonedDateTime<D extends InterfaceC1035b> extends j$.time.temporal.m, Comparable<ChronoZonedDateTime<?>> {
    @Override // j$.time.temporal.m
    ChronoZonedDateTime c(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.m
    ChronoZonedDateTime d(long j, j$.time.temporal.s sVar);

    ZoneOffset getOffset();

    ZoneId getZone();

    InterfaceC1038e toLocalDateTime();

    ChronoZonedDateTime y(ZoneId zoneId);

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.u j(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return toLocalDateTime().j(qVar);
            }
            return ((j$.time.temporal.a) qVar).b;
        }
        return qVar.v(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = AbstractC1042i.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return toLocalDateTime().f(qVar);
            }
            return getOffset().b;
        }
        return super.f(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long h(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = AbstractC1042i.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i != 2) {
                return toLocalDateTime().h(qVar);
            }
            return getOffset().b;
        }
        return qVar.I(this);
    }

    default InterfaceC1035b toLocalDate() {
        return toLocalDateTime().toLocalDate();
    }

    default j$.time.k toLocalTime() {
        return toLocalDateTime().toLocalTime();
    }

    default l getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.temporal.m
    default ChronoZonedDateTime k(j$.time.temporal.n nVar) {
        return k.o(getChronology(), nVar.e(this));
    }

    @Override // j$.time.temporal.m
    default ChronoZonedDateTime a(long j, j$.time.temporal.s sVar) {
        return k.o(getChronology(), super.a(j, sVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.h hVar) {
        if (hVar == j$.time.temporal.r.e || hVar == j$.time.temporal.r.a) {
            return getZone();
        }
        if (hVar == j$.time.temporal.r.d) {
            return getOffset();
        }
        if (hVar == j$.time.temporal.r.g) {
            return toLocalTime();
        }
        if (hVar == j$.time.temporal.r.b) {
            return getChronology();
        }
        if (hVar == j$.time.temporal.r.c) {
            return j$.time.temporal.b.NANOS;
        }
        return hVar.i(this);
    }

    default Instant toInstant() {
        return Instant.ofEpochSecond(toEpochSecond(), toLocalTime().d);
    }

    default long toEpochSecond() {
        return ((toLocalDate().D() * 86400) + toLocalTime().X()) - getOffset().b;
    }

    @Override // java.lang.Comparable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int compare = Long.compare(toEpochSecond(), chronoZonedDateTime.toEpochSecond());
        return (compare == 0 && (compare = toLocalTime().d - chronoZonedDateTime.toLocalTime().d) == 0 && (compare = toLocalDateTime().compareTo(chronoZonedDateTime.toLocalDateTime())) == 0 && (compare = getZone().m().compareTo(chronoZonedDateTime.getZone().m())) == 0) ? ((AbstractC1034a) getChronology()).m().compareTo(chronoZonedDateTime.getChronology().m()) : compare;
    }

    default boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        if (epochSecond >= epochSecond2) {
            return epochSecond == epochSecond2 && toLocalTime().d < chronoZonedDateTime.toLocalTime().d;
        }
        return true;
    }
}
