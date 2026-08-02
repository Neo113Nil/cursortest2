package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class s extends AbstractC1034a implements Serializable {
    public static final s c = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.l
    public final m w(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.l
    public final String m() {
        return ExifInterface.TAG_RW2_ISO;
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "iso8601";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b J(int i, int i2, int i3) {
        return j$.time.g.U(i, i2, i3);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b r(int i, int i2) {
        return j$.time.g.W(i, i2);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b l(long j) {
        return j$.time.g.V(j);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b B(TemporalAccessor temporalAccessor) {
        return j$.time.g.A(temporalAccessor);
    }

    private s() {
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1038e C(LocalDateTime localDateTime) {
        return LocalDateTime.v(localDateTime);
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime M(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.o(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b F() {
        return j$.time.g.A(j$.time.g.T(j$.time.b.b()));
    }

    public static boolean Q(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.l
    public final int x(m mVar, int i) {
        if (mVar instanceof t) {
            return mVar == t.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.l
    public final List u() {
        return j$.time.b.a(t.values());
    }

    @Override // j$.time.chrono.AbstractC1034a, j$.time.chrono.l
    public final InterfaceC1035b L(Map map, j$.time.format.x xVar) {
        return (j$.time.g) super.L(map, xVar);
    }

    @Override // j$.time.chrono.AbstractC1034a
    public final void I(Map map, j$.time.format.x xVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (xVar != j$.time.format.x.LENIENT) {
                aVar.P(l.longValue());
            }
            AbstractC1034a.o(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l.longValue(), r4)) + 1);
            AbstractC1034a.o(map, j$.time.temporal.a.YEAR, Math.floorDiv(l.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC1034a
    public final InterfaceC1035b P(Map map, j$.time.format.x xVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (xVar != j$.time.format.x.LENIENT) {
                aVar.P(l.longValue());
            }
            Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l2 != null) {
                if (l2.longValue() == 1) {
                    AbstractC1034a.o(map, j$.time.temporal.a.YEAR, l.longValue());
                    return null;
                }
                if (l2.longValue() == 0) {
                    AbstractC1034a.o(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l.longValue()));
                    return null;
                }
                throw new j$.time.c("Invalid value for era: " + l2);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            Long l3 = (Long) map.get(aVar2);
            if (xVar != j$.time.format.x.STRICT) {
                AbstractC1034a.o(map, aVar2, (l3 == null || l3.longValue() > 0) ? l.longValue() : Math.subtractExact(1L, l.longValue()));
                return null;
            }
            if (l3 != null) {
                long longValue = l3.longValue();
                long longValue2 = l.longValue();
                if (longValue <= 0) {
                    longValue2 = Math.subtractExact(1L, longValue2);
                }
                AbstractC1034a.o(map, aVar2, longValue2);
                return null;
            }
            map.put(aVar, l);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        aVar3.P(((Long) map.get(aVar3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC1034a
    public final InterfaceC1035b O(Map map, j$.time.format.x xVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a = aVar.b.a(((Long) map.remove(aVar)).longValue(), aVar);
        boolean z = true;
        if (xVar == j$.time.format.x.LENIENT) {
            return j$.time.g.U(a, 1, 1).Z(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).Y(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a2 = aVar2.b.a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a3 = aVar3.b.a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (xVar == j$.time.format.x.SMART) {
            if (a2 == 4 || a2 == 6 || a2 == 9 || a2 == 11) {
                a3 = Math.min(a3, 30);
            } else if (a2 == 2) {
                j$.time.m mVar = j$.time.m.FEBRUARY;
                long j = a;
                int i = j$.time.u.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                a3 = Math.min(a3, mVar.v(z));
            }
        }
        return j$.time.g.U(a, a2, a3);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.u t(j$.time.temporal.a aVar) {
        return aVar.b;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new E((byte) 1, this);
    }
}
