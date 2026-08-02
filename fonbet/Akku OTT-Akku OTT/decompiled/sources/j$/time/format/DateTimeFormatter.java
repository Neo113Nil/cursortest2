package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC1035b;
import j$.time.chrono.InterfaceC1038e;
import j$.time.temporal.TemporalAccessor;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
    public static final DateTimeFormatter f;
    public final d a;
    public final Locale b;
    public final v c;
    public final x d;
    public final j$.time.chrono.l e;

    static {
        o oVar = new o();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        y yVar = y.EXCEEDS_PAD;
        oVar.h(aVar, 4, 10, yVar);
        oVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        oVar.g(aVar2, 2);
        oVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        oVar.g(aVar3, 2);
        x xVar = x.STRICT;
        j$.time.chrono.s sVar = j$.time.chrono.s.c;
        DateTimeFormatter k = oVar.k(xVar, sVar);
        ISO_LOCAL_DATE = k;
        o oVar2 = new o();
        l lVar = l.INSENSITIVE;
        oVar2.b(lVar);
        oVar2.a(k);
        i iVar = i.e;
        oVar2.b(iVar);
        oVar2.k(xVar, sVar);
        o oVar3 = new o();
        oVar3.b(lVar);
        oVar3.a(k);
        oVar3.j();
        oVar3.b(iVar);
        oVar3.k(xVar, sVar);
        o oVar4 = new o();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        oVar4.g(aVar4, 2);
        oVar4.c(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        oVar4.g(aVar5, 2);
        oVar4.j();
        oVar4.c(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        oVar4.g(aVar6, 2);
        oVar4.j();
        oVar4.b(new f(j$.time.temporal.a.NANO_OF_SECOND));
        DateTimeFormatter k2 = oVar4.k(xVar, null);
        o oVar5 = new o();
        oVar5.b(lVar);
        oVar5.a(k2);
        oVar5.b(iVar);
        oVar5.k(xVar, null);
        o oVar6 = new o();
        oVar6.b(lVar);
        oVar6.a(k2);
        oVar6.j();
        oVar6.b(iVar);
        oVar6.k(xVar, null);
        o oVar7 = new o();
        oVar7.b(lVar);
        oVar7.a(k);
        oVar7.c('T');
        oVar7.a(k2);
        DateTimeFormatter k3 = oVar7.k(xVar, sVar);
        ISO_LOCAL_DATE_TIME = k3;
        o oVar8 = new o();
        oVar8.b(lVar);
        oVar8.a(k3);
        l lVar2 = l.LENIENT;
        oVar8.b(lVar2);
        oVar8.b(iVar);
        l lVar3 = l.STRICT;
        oVar8.b(lVar3);
        DateTimeFormatter k4 = oVar8.k(xVar, sVar);
        o oVar9 = new o();
        oVar9.a(k4);
        oVar9.j();
        oVar9.c('[');
        l lVar4 = l.SENSITIVE;
        oVar9.b(lVar4);
        oVar9.b(new g(1));
        oVar9.c(']');
        oVar9.k(xVar, sVar);
        o oVar10 = new o();
        oVar10.a(k3);
        oVar10.j();
        oVar10.b(iVar);
        oVar10.j();
        oVar10.c('[');
        oVar10.b(lVar4);
        oVar10.b(new g(1));
        oVar10.c(']');
        oVar10.k(xVar, sVar);
        o oVar11 = new o();
        oVar11.b(lVar);
        oVar11.h(aVar, 4, 10, yVar);
        oVar11.c('-');
        oVar11.g(j$.time.temporal.a.DAY_OF_YEAR, 3);
        oVar11.j();
        oVar11.b(iVar);
        oVar11.k(xVar, sVar);
        o oVar12 = new o();
        oVar12.b(lVar);
        oVar12.h(j$.time.temporal.j.c, 4, 10, yVar);
        oVar12.d("-W");
        oVar12.g(j$.time.temporal.j.b, 2);
        oVar12.c('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        oVar12.g(aVar7, 1);
        oVar12.j();
        oVar12.b(iVar);
        oVar12.k(xVar, sVar);
        o oVar13 = new o();
        oVar13.b(lVar);
        oVar13.b(new g(0));
        f = oVar13.k(xVar, null);
        o oVar14 = new o();
        oVar14.b(lVar);
        oVar14.g(aVar, 4);
        oVar14.g(aVar2, 2);
        oVar14.g(aVar3, 2);
        oVar14.j();
        oVar14.b(lVar2);
        oVar14.b(new i("+HHMMss", "Z"));
        oVar14.b(lVar3);
        oVar14.k(xVar, sVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        o oVar15 = new o();
        oVar15.b(lVar);
        oVar15.b(lVar2);
        oVar15.j();
        oVar15.e(aVar7, hashMap);
        oVar15.d(", ");
        oVar15.i();
        oVar15.h(aVar3, 1, 2, y.NOT_NEGATIVE);
        oVar15.c(' ');
        oVar15.e(aVar2, hashMap2);
        oVar15.c(' ');
        oVar15.g(aVar, 4);
        oVar15.c(' ');
        oVar15.g(aVar4, 2);
        oVar15.c(':');
        oVar15.g(aVar5, 2);
        oVar15.j();
        oVar15.c(':');
        oVar15.g(aVar6, 2);
        oVar15.i();
        oVar15.c(' ');
        oVar15.b(new i("+HHMM", "GMT"));
        oVar15.k(x.SMART, sVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, x xVar, j$.time.chrono.l lVar) {
        v vVar = v.a;
        this.a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.b = locale;
        this.c = vVar;
        Objects.requireNonNull(xVar, "resolverStyle");
        this.d = xVar;
        this.e = lVar;
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.o(new s(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.c(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x032e, code lost:
    
        if (((java.util.HashMap) r8.a).containsKey(j$.time.temporal.a.SECOND_OF_MINUTE) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(CharSequence charSequence) {
        String charSequence2;
        long j;
        long j2;
        InterfaceC1035b interfaceC1035b;
        j$.time.k kVar;
        Long l;
        j$.time.r rVar;
        j$.time.r rVar2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        p pVar = new p(this);
        int v = this.a.v(pVar, charSequence, parsePosition.getIndex());
        ZoneId zoneId = null;
        if (v < 0) {
            parsePosition.setErrorIndex(~v);
            pVar = null;
        } else {
            parsePosition.setIndex(v);
        }
        if (pVar != null && parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
            w c = pVar.c();
            j$.time.chrono.l lVar = pVar.c().c;
            if (lVar == null && (lVar = pVar.a.e) == null) {
                lVar = j$.time.chrono.s.c;
            }
            c.c = lVar;
            ZoneId zoneId2 = c.b;
            if (zoneId2 != null) {
                zoneId = zoneId2;
            } else {
                pVar.a.getClass();
            }
            c.b = zoneId;
            c.e = this.d;
            c.m();
            c.t(c.c.L(c.a, c.e));
            c.q();
            if (((HashMap) c.a).size() > 0) {
                loop0: while (i < 50) {
                    Iterator it = ((HashMap) c.a).entrySet().iterator();
                    while (it.hasNext()) {
                        j$.time.temporal.q qVar = (j$.time.temporal.q) ((Map.Entry) it.next()).getKey();
                        TemporalAccessor A = qVar.A(c.a, c, c.e);
                        if (A != null) {
                            if (A instanceof ChronoZonedDateTime) {
                                ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) A;
                                ZoneId zoneId3 = c.b;
                                if (zoneId3 == null) {
                                    c.b = chronoZonedDateTime.getZone();
                                } else if (!zoneId3.equals(chronoZonedDateTime.getZone())) {
                                    throw new j$.time.c("ChronoZonedDateTime must use the effective parsed zone: " + c.b);
                                }
                                A = chronoZonedDateTime.toLocalDateTime();
                            }
                            if (A instanceof InterfaceC1038e) {
                                InterfaceC1038e interfaceC1038e = (InterfaceC1038e) A;
                                c.r(interfaceC1038e.toLocalTime(), j$.time.r.d);
                                c.t(interfaceC1038e.toLocalDate());
                            } else if (A instanceof InterfaceC1035b) {
                                c.t((InterfaceC1035b) A);
                            } else if (A instanceof j$.time.k) {
                                c.r((j$.time.k) A, j$.time.r.d);
                            } else {
                                throw new j$.time.c("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                            }
                        } else if (!((HashMap) c.a).containsKey(qVar)) {
                            break;
                        }
                        i++;
                    }
                }
                if (i == 50) {
                    throw new j$.time.c("One of the parsed fields has an incorrectly implemented resolve method");
                }
                if (i > 0) {
                    c.m();
                    c.t(c.c.L(c.a, c.e));
                    c.q();
                }
            }
            if (c.g == null) {
                Map map = c.a;
                j$.time.temporal.a aVar = j$.time.temporal.a.MILLI_OF_SECOND;
                if (((HashMap) map).containsKey(aVar)) {
                    long longValue = ((Long) ((HashMap) c.a).remove(aVar)).longValue();
                    Map map2 = c.a;
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.MICRO_OF_SECOND;
                    if (((HashMap) map2).containsKey(aVar2)) {
                        long longValue2 = (((Long) ((HashMap) c.a).get(aVar2)).longValue() % 1000) + (longValue * 1000);
                        c.u(aVar, aVar2, Long.valueOf(longValue2));
                        ((HashMap) c.a).remove(aVar2);
                        ((HashMap) c.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue2 * 1000));
                    } else {
                        ((HashMap) c.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue * 1000000));
                    }
                } else {
                    Map map3 = c.a;
                    j$.time.temporal.a aVar3 = j$.time.temporal.a.MICRO_OF_SECOND;
                    if (((HashMap) map3).containsKey(aVar3)) {
                        ((HashMap) c.a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c.a).remove(aVar3)).longValue() * 1000));
                    }
                }
                Map map4 = c.a;
                j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
                Long l2 = (Long) ((HashMap) map4).get(aVar4);
                if (l2 != null) {
                    Map map5 = c.a;
                    j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
                    Long l3 = (Long) ((HashMap) map5).get(aVar5);
                    Map map6 = c.a;
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
                    Long l4 = (Long) ((HashMap) map6).get(aVar6);
                    Map map7 = c.a;
                    j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_SECOND;
                    Long l5 = (Long) ((HashMap) map7).get(aVar7);
                    if ((l3 != null || (l4 == null && l5 == null)) && (l3 == null || l4 != null || l5 == null)) {
                        j = 1000000;
                        j2 = 1000;
                        c.o(l2.longValue(), l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L, l5 != null ? l5.longValue() : 0L);
                        ((HashMap) c.a).remove(aVar4);
                        ((HashMap) c.a).remove(aVar5);
                        ((HashMap) c.a).remove(aVar6);
                        ((HashMap) c.a).remove(aVar7);
                        if (c.e != x.LENIENT && ((HashMap) c.a).size() > 0) {
                            for (Map.Entry entry : ((HashMap) c.a).entrySet()) {
                                j$.time.temporal.q qVar2 = (j$.time.temporal.q) entry.getKey();
                                if ((qVar2 instanceof j$.time.temporal.a) && ((j$.time.temporal.a) qVar2).Q()) {
                                    ((j$.time.temporal.a) qVar2).P(((Long) entry.getValue()).longValue());
                                }
                            }
                        }
                        interfaceC1035b = c.f;
                        if (interfaceC1035b != null) {
                            c.l(interfaceC1035b);
                        }
                        kVar = c.g;
                        if (kVar != null) {
                            c.l(kVar);
                            if (c.f != null && ((HashMap) c.a).size() > 0) {
                                c.l(c.f.E(c.g));
                            }
                        }
                        if (c.f != null && c.g != null) {
                            rVar = c.h;
                            rVar.getClass();
                            rVar2 = j$.time.r.d;
                            if (rVar != rVar2) {
                                c.f = c.f.K(c.h);
                                c.h = rVar2;
                            }
                        }
                        if (c.g == null) {
                            if (!((HashMap) c.a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
                                if (!((HashMap) c.a).containsKey(j$.time.temporal.a.SECOND_OF_DAY)) {
                                }
                            }
                            Map map8 = c.a;
                            j$.time.temporal.a aVar8 = j$.time.temporal.a.NANO_OF_SECOND;
                            if (((HashMap) map8).containsKey(aVar8)) {
                                long longValue3 = ((Long) ((HashMap) c.a).get(aVar8)).longValue();
                                ((HashMap) c.a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue3 / j2));
                                ((HashMap) c.a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue3 / j));
                            } else {
                                ((HashMap) c.a).put(aVar8, 0L);
                                ((HashMap) c.a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                                ((HashMap) c.a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                            }
                        }
                        if (c.f != null && c.g != null) {
                            l = (Long) ((HashMap) c.a).get(j$.time.temporal.a.OFFSET_SECONDS);
                            if (l == null) {
                                ((HashMap) c.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c.f.E(c.g).z(ZoneOffset.R(l.intValue())).toEpochSecond()));
                                return c;
                            }
                            if (c.b != null) {
                                ((HashMap) c.a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c.f.E(c.g).z(c.b).toEpochSecond()));
                            }
                        }
                        return c;
                    }
                    j = 1000000;
                    j2 = 1000;
                    interfaceC1035b = c.f;
                    if (interfaceC1035b != null) {
                    }
                    kVar = c.g;
                    if (kVar != null) {
                    }
                    if (c.f != null) {
                        rVar = c.h;
                        rVar.getClass();
                        rVar2 = j$.time.r.d;
                        if (rVar != rVar2) {
                        }
                    }
                    if (c.g == null) {
                    }
                    if (c.f != null) {
                        l = (Long) ((HashMap) c.a).get(j$.time.temporal.a.OFFSET_SECONDS);
                        if (l == null) {
                        }
                    }
                    return c;
                }
            }
            j = 1000000;
            j2 = 1000;
            if (c.e != x.LENIENT) {
                while (r1.hasNext()) {
                }
            }
            interfaceC1035b = c.f;
            if (interfaceC1035b != null) {
            }
            kVar = c.g;
            if (kVar != null) {
            }
            if (c.f != null) {
            }
            if (c.g == null) {
            }
            if (c.f != null) {
            }
            return c;
        }
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + charSequence2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new q(str, charSequence);
        }
        String str2 = "Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new q(str2, charSequence);
    }

    public final String toString() {
        String dVar = this.a.toString();
        return dVar.startsWith("[") ? dVar : dVar.substring(1, dVar.length() - 1);
    }
}
