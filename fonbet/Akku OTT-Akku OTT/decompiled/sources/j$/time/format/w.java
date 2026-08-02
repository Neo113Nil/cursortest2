package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC1035b;
import j$.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class w implements TemporalAccessor {
    public ZoneId b;
    public j$.time.chrono.l c;
    public boolean d;
    public x e;
    public InterfaceC1035b f;
    public j$.time.k g;
    public final Map a = new HashMap();
    public j$.time.r h = j$.time.r.d;

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (((HashMap) this.a).containsKey(qVar)) {
            return true;
        }
        InterfaceC1035b interfaceC1035b = this.f;
        if (interfaceC1035b != null && interfaceC1035b.g(qVar)) {
            return true;
        }
        j$.time.k kVar = this.g;
        if (kVar == null || !kVar.g(qVar)) {
            return (qVar == null || (qVar instanceof j$.time.temporal.a) || !qVar.o(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        Objects.requireNonNull(qVar, "field");
        Long l = (Long) ((HashMap) this.a).get(qVar);
        if (l != null) {
            return l.longValue();
        }
        InterfaceC1035b interfaceC1035b = this.f;
        if (interfaceC1035b != null && interfaceC1035b.g(qVar)) {
            return this.f.h(qVar);
        }
        j$.time.k kVar = this.g;
        if (kVar != null && kVar.g(qVar)) {
            return this.g.h(qVar);
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(j$.time.h hVar) {
        if (hVar == j$.time.temporal.r.a) {
            return this.b;
        }
        if (hVar == j$.time.temporal.r.b) {
            return this.c;
        }
        if (hVar == j$.time.temporal.r.f) {
            InterfaceC1035b interfaceC1035b = this.f;
            if (interfaceC1035b != null) {
                return j$.time.g.A(interfaceC1035b);
            }
            return null;
        }
        if (hVar == j$.time.temporal.r.g) {
            return this.g;
        }
        if (hVar == j$.time.temporal.r.d) {
            Long l = (Long) ((HashMap) this.a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.R(l.intValue());
            }
            ZoneId zoneId = this.b;
            return zoneId instanceof ZoneOffset ? zoneId : hVar.i(this);
        }
        if (hVar == j$.time.temporal.r.e) {
            return hVar.i(this);
        }
        if (hVar == j$.time.temporal.r.c) {
            return null;
        }
        return hVar.i(this);
    }

    public final void u(j$.time.temporal.q qVar, j$.time.temporal.a aVar, Long l) {
        Long l2 = (Long) ((HashMap) this.a).put(aVar, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new j$.time.c("Conflict found: " + aVar + " " + l2 + " differs from " + aVar + " " + l + " while resolving  " + qVar);
    }

    public final void m() {
        if (((HashMap) this.a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                n(zoneId);
                return;
            }
            Long l = (Long) ((HashMap) this.a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l != null) {
                n(ZoneOffset.R(l.intValue()));
            }
        }
    }

    public final void n(ZoneId zoneId) {
        Map map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        t(this.c.M(Instant.o(((Long) ((HashMap) map).remove(aVar)).longValue(), 0), zoneId).toLocalDate());
        u(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().X()));
    }

    public final void t(InterfaceC1035b interfaceC1035b) {
        InterfaceC1035b interfaceC1035b2 = this.f;
        if (interfaceC1035b2 != null) {
            if (interfaceC1035b == null || interfaceC1035b2.equals(interfaceC1035b)) {
                return;
            }
            throw new j$.time.c("Conflict found: Fields resolved to two different dates: " + this.f + " " + interfaceC1035b);
        }
        if (interfaceC1035b != null) {
            if (!this.c.equals(interfaceC1035b.getChronology())) {
                throw new j$.time.c("ChronoLocalDate must use the effective parsed chronology: " + this.c);
            }
            this.f = interfaceC1035b;
        }
    }

    public final void q() {
        Map map = this.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(aVar)) {
            long longValue = ((Long) ((HashMap) this.a).remove(aVar)).longValue();
            x xVar = this.e;
            if (xVar == x.STRICT || (xVar == x.SMART && longValue != 0)) {
                aVar.P(longValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            u(aVar, aVar2, Long.valueOf(longValue));
        }
        Map map2 = this.a;
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(aVar3)) {
            long longValue2 = ((Long) ((HashMap) this.a).remove(aVar3)).longValue();
            x xVar2 = this.e;
            if (xVar2 == x.STRICT || (xVar2 == x.SMART && longValue2 != 0)) {
                aVar3.P(longValue2);
            }
            u(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        Map map3 = this.a;
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(aVar4)) {
            Map map4 = this.a;
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(aVar5)) {
                long longValue3 = ((Long) ((HashMap) this.a).remove(aVar4)).longValue();
                long longValue4 = ((Long) ((HashMap) this.a).remove(aVar5)).longValue();
                if (this.e == x.LENIENT) {
                    u(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(longValue3, 12), longValue4)));
                } else {
                    aVar4.P(longValue3);
                    aVar5.P(longValue3);
                    u(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        Map map5 = this.a;
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(aVar6)) {
            long longValue5 = ((Long) ((HashMap) this.a).remove(aVar6)).longValue();
            if (this.e != x.LENIENT) {
                aVar6.P(longValue5);
            }
            u(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            u(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            u(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            u(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.a;
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(aVar7)) {
            long longValue6 = ((Long) ((HashMap) this.a).remove(aVar7)).longValue();
            if (this.e != x.LENIENT) {
                aVar7.P(longValue6);
            }
            u(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            u(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.a;
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(aVar8)) {
            long longValue7 = ((Long) ((HashMap) this.a).remove(aVar8)).longValue();
            if (this.e != x.LENIENT) {
                aVar8.P(longValue7);
            }
            u(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            u(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.a;
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(aVar9)) {
            long longValue8 = ((Long) ((HashMap) this.a).remove(aVar9)).longValue();
            if (this.e != x.LENIENT) {
                aVar9.P(longValue8);
            }
            u(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            u(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            u(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.a;
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(aVar10)) {
            long longValue9 = ((Long) ((HashMap) this.a).remove(aVar10)).longValue();
            if (this.e != x.LENIENT) {
                aVar10.P(longValue9);
            }
            u(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            u(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.a;
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(aVar11)) {
            long longValue10 = ((Long) ((HashMap) this.a).get(aVar11)).longValue();
            x xVar3 = this.e;
            x xVar4 = x.LENIENT;
            if (xVar3 != xVar4) {
                aVar11.P(longValue10);
            }
            Map map11 = this.a;
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(aVar12)) {
                long longValue11 = ((Long) ((HashMap) this.a).remove(aVar12)).longValue();
                if (this.e != xVar4) {
                    aVar12.P(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                u(aVar12, aVar11, Long.valueOf(longValue10));
            }
            Map map12 = this.a;
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(aVar13)) {
                long longValue12 = ((Long) ((HashMap) this.a).remove(aVar13)).longValue();
                if (this.e != xVar4) {
                    aVar13.P(longValue12);
                }
                u(aVar13, aVar11, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(aVar14)) {
            Map map14 = this.a;
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(aVar15)) {
                Map map15 = this.a;
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(aVar16) && ((HashMap) this.a).containsKey(aVar11)) {
                    o(((Long) ((HashMap) this.a).remove(aVar14)).longValue(), ((Long) ((HashMap) this.a).remove(aVar15)).longValue(), ((Long) ((HashMap) this.a).remove(aVar16)).longValue(), ((Long) ((HashMap) this.a).remove(aVar11)).longValue());
                }
            }
        }
    }

    public final void o(long j, long j2, long j3, long j4) {
        if (this.e == x.LENIENT) {
            long addExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j2, 60000000000L)), Math.multiplyExact(j3, 1000000000L)), j4);
            r(j$.time.k.P(Math.floorMod(addExact, 86400000000000L)), j$.time.r.a(0, 0, (int) Math.floorDiv(addExact, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int a = aVar.b.a(j2, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int a2 = aVar2.b.a(j4, aVar2);
        if (this.e == x.SMART && j == 24 && a == 0 && j3 == 0 && a2 == 0) {
            r(j$.time.k.g, j$.time.r.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int a3 = aVar3.b.a(j, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        r(j$.time.k.O(a3, a, aVar4.b.a(j3, aVar4), a2), j$.time.r.d);
    }

    public final void r(j$.time.k kVar, j$.time.r rVar) {
        j$.time.k kVar2 = this.g;
        if (kVar2 != null) {
            if (!kVar2.equals(kVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different times: " + this.g + " " + kVar);
            }
            j$.time.r rVar2 = this.h;
            rVar2.getClass();
            j$.time.r rVar3 = j$.time.r.d;
            if (rVar2 != rVar3 && rVar != rVar3 && !this.h.equals(rVar)) {
                throw new j$.time.c("Conflict found: Fields resolved to different excess periods: " + this.h + " " + rVar);
            }
            this.h = rVar;
            return;
        }
        this.g = kVar;
        this.h = rVar;
    }

    public final void l(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.q qVar = (j$.time.temporal.q) entry.getKey();
            if (temporalAccessor.g(qVar)) {
                try {
                    long h = temporalAccessor.h(qVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (h != longValue) {
                        throw new j$.time.c("Conflict found: Field " + qVar + " " + h + " differs from " + qVar + " " + longValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC1035b interfaceC1035b = this.f;
            if (interfaceC1035b != null) {
                sb.append(interfaceC1035b);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
