package j$.time;

import androidx.exifinterface.media.ExifInterface;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1035b;
import j$.time.chrono.InterfaceC1038e;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import kotlin.time.DurationKt;

/* loaded from: classes6.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.n, InterfaceC1038e, Serializable {
    public static final LocalDateTime c = I(g.d, k.e);
    public static final LocalDateTime d = I(g.e, k.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final g a;
    public final k b;

    public static LocalDateTime I(g gVar, k kVar) {
        Objects.requireNonNull(gVar, "date");
        Objects.requireNonNull(kVar, "time");
        return new LocalDateTime(gVar, kVar);
    }

    public static LocalDateTime O(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.P(j2);
        return new LocalDateTime(g.V(Math.floorDiv(j + zoneOffset.b, 86400)), k.P((((int) Math.floorMod(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime v(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (!(temporalAccessor instanceof ZonedDateTime)) {
            if (temporalAccessor instanceof OffsetDateTime) {
                return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
            }
            try {
                return new LocalDateTime(g.A(temporalAccessor), k.A(temporalAccessor));
            } catch (c e) {
                throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
            }
        }
        return ((ZonedDateTime) temporalAccessor).a;
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        String charSequence2;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        h hVar = new h(0);
        Objects.requireNonNull(charSequence, "text");
        try {
            return (LocalDateTime) dateTimeFormatter.a(charSequence).b(hVar);
        } catch (j$.time.format.q e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            j$.time.format.q qVar = new j$.time.format.q("Text '" + charSequence2 + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw qVar;
        }
    }

    public LocalDateTime(g gVar, k kVar) {
        this.a = gVar;
        this.b = kVar;
    }

    public final LocalDateTime T(g gVar, k kVar) {
        return (this.a == gVar && this.b == kVar) ? this : new LocalDateTime(gVar, kVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.o(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.isDateBased() || aVar.Q();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u j(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.b.j(qVar) : this.a.j(qVar);
        }
        return qVar.v(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.b.f(qVar) : this.a.f(qVar);
        }
        return super.f(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.b.h(qVar) : this.a.h(qVar);
        }
        return qVar.I(this);
    }

    @Override // j$.time.chrono.InterfaceC1038e
    public final InterfaceC1035b toLocalDate() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC1038e
    public final k toLocalTime() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    /* renamed from: i */
    public final j$.time.temporal.m k(g gVar) {
        return T(gVar, this.b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).Q()) {
                return T(this.a, this.b.c(j, qVar));
            }
            return T(this.a.c(j, qVar), this.b);
        }
        return (LocalDateTime) qVar.O(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) sVar.o(this, j);
        }
        switch (i.a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return R(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime plusDays = plusDays(j / 86400000000L);
                return plusDays.R(plusDays.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime plusDays2 = plusDays(j / DurationKt.MILLIS_IN_DAY);
                return plusDays2.R(plusDays2.a, 0L, 0L, 0L, (j % DurationKt.MILLIS_IN_DAY) * 1000000);
            case 4:
                return Q(j);
            case 5:
                return R(this.a, 0L, j, 0L, 0L);
            case 6:
                return R(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime plusDays3 = plusDays(j / 256);
                return plusDays3.R(plusDays3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return T(this.a.d(j, sVar), this.b);
        }
    }

    public LocalDateTime plusWeeks(long j) {
        return T(this.a.a0(j), this.b);
    }

    public LocalDateTime plusDays(long j) {
        return T(this.a.Y(j), this.b);
    }

    public final LocalDateTime Q(long j) {
        return R(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.m
    public final InterfaceC1038e a(long j, j$.time.temporal.s sVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, sVar).d(1L, sVar) : d(-j, sVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, sVar).d(1L, sVar) : d(-j, sVar);
    }

    public final LocalDateTime R(g gVar, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return T(gVar, this.b);
        }
        long j5 = 1;
        long W = this.b.W();
        long j6 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j5) + W;
        long floorDiv = Math.floorDiv(j6, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long floorMod = Math.floorMod(j6, 86400000000000L);
        return T(gVar.Y(floorDiv), floorMod == W ? this.b : k.P(floorMod));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(h hVar) {
        if (hVar == j$.time.temporal.r.f) {
            return this.a;
        }
        return super.b(hVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.InterfaceC1038e
    public final ChronoZonedDateTime z(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    @Override // j$.time.chrono.InterfaceC1038e, java.lang.Comparable
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC1038e interfaceC1038e) {
        if (interfaceC1038e instanceof LocalDateTime) {
            return o((LocalDateTime) interfaceC1038e);
        }
        return super.compareTo(interfaceC1038e);
    }

    public final int o(LocalDateTime localDateTime) {
        int o = this.a.o(localDateTime.a);
        return o == 0 ? this.b.compareTo(localDateTime.b) : o;
    }

    public final boolean A(InterfaceC1038e interfaceC1038e) {
        if (interfaceC1038e instanceof LocalDateTime) {
            return o((LocalDateTime) interfaceC1038e) < 0;
        }
        long D = this.a.D();
        long D2 = interfaceC1038e.toLocalDate().D();
        if (D >= D2) {
            return D == D2 && this.b.W() < interfaceC1038e.toLocalTime().W();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + ExifInterface.GPS_DIRECTION_TRUE + this.b.toString();
    }

    private Object writeReplace() {
        return new s((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
