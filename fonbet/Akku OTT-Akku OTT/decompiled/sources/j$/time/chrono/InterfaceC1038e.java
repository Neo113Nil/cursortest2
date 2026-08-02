package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.Objects;

/* renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC1038e extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    InterfaceC1035b toLocalDate();

    j$.time.k toLocalTime();

    ChronoZonedDateTime z(ZoneId zoneId);

    default l getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.temporal.m
    default InterfaceC1038e a(long j, j$.time.temporal.s sVar) {
        return C1040g.o(getChronology(), super.a(j, sVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.h hVar) {
        if (hVar == j$.time.temporal.r.a || hVar == j$.time.temporal.r.e || hVar == j$.time.temporal.r.d) {
            return null;
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

    @Override // j$.time.temporal.n
    default j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(toLocalDate().D(), j$.time.temporal.a.EPOCH_DAY).c(toLocalTime().W(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long s(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((toLocalDate().D() * 86400) + toLocalTime().X()) - zoneOffset.b;
    }

    @Override // java.lang.Comparable
    /* renamed from: H */
    default int compareTo(InterfaceC1038e interfaceC1038e) {
        int compareTo = toLocalDate().compareTo(interfaceC1038e.toLocalDate());
        return (compareTo == 0 && (compareTo = toLocalTime().compareTo(interfaceC1038e.toLocalTime())) == 0) ? ((AbstractC1034a) getChronology()).m().compareTo(interfaceC1038e.getChronology().m()) : compareTo;
    }
}
