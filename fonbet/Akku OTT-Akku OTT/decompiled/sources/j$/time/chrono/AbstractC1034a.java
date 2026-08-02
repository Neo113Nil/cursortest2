package j$.time.chrono;

import j$.time.DayOfWeek;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1034a implements l {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m().compareTo(((l) obj).m());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static l v(l lVar, String str) {
        String q;
        l lVar2 = (l) a.putIfAbsent(str, lVar);
        if (lVar2 == null && (q = lVar.q()) != null) {
            b.putIfAbsent(q, lVar);
        }
        return lVar2;
    }

    @Override // j$.time.chrono.l
    public InterfaceC1035b L(Map map, j$.time.format.x xVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return l(((Long) map.remove(aVar)).longValue());
        }
        I(map, xVar);
        InterfaceC1035b P = P(map, xVar);
        if (P != null) {
            return P;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return O(map, xVar);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int a2 = t(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (xVar == j$.time.format.x.LENIENT) {
                        long subtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                        return J(a2, 1, 1).d(subtractExact, (j$.time.temporal.s) j$.time.temporal.b.MONTHS).d(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.WEEKS).d(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                    }
                    int a3 = t(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int a4 = t(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    InterfaceC1035b d = J(a2, a3, 1).d((t(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((a4 - 1) * 7), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                    if (xVar != j$.time.format.x.STRICT || d.f(aVar3) == a3) {
                        return d;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int a5 = t(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (xVar == j$.time.format.x.LENIENT) {
                        return A(J(a5, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int a6 = t(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC1035b k = J(a5, a6, 1).d((t(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.s) j$.time.temporal.b.DAYS).k(new j$.time.temporal.o(DayOfWeek.o(t(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (xVar != j$.time.format.x.STRICT || k.f(aVar3) == a6) {
                        return k;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int a7 = t(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (xVar != j$.time.format.x.LENIENT) {
                return r(a7, t(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return r(a7, 1).d(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int a8 = t(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (xVar == j$.time.format.x.LENIENT) {
                return r(a8, 1).d(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.WEEKS).d(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
            }
            int a9 = t(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
            InterfaceC1035b d2 = r(a8, 1).d((t(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((a9 - 1) * 7), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
            if (xVar != j$.time.format.x.STRICT || d2.f(aVar2) == a8) {
                return d2;
            }
            throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int a10 = t(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (xVar == j$.time.format.x.LENIENT) {
            return A(r(a10, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        InterfaceC1035b k2 = r(a10, 1).d((t(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.s) j$.time.temporal.b.DAYS).k(new j$.time.temporal.o(DayOfWeek.o(t(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (xVar != j$.time.format.x.STRICT || k2.f(aVar2) == a10) {
            return k2;
        }
        throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
    }

    public void I(Map map, j$.time.format.x xVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            if (xVar != j$.time.format.x.LENIENT) {
                aVar.P(l.longValue());
            }
            InterfaceC1035b c = F().c(1L, (j$.time.temporal.q) j$.time.temporal.a.DAY_OF_MONTH).c(l.longValue(), (j$.time.temporal.q) aVar);
            o(map, j$.time.temporal.a.MONTH_OF_YEAR, c.f(r0));
            o(map, j$.time.temporal.a.YEAR, c.f(r0));
        }
    }

    public InterfaceC1035b P(Map map, j$.time.format.x xVar) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l = (Long) map.remove(aVar);
        if (l != null) {
            Long l2 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (xVar != j$.time.format.x.LENIENT) {
                intExact = t(aVar).a(l.longValue(), aVar);
            } else {
                intExact = Math.toIntExact(l.longValue());
            }
            if (l2 != null) {
                o(map, j$.time.temporal.a.YEAR, x(w(t(r2).a(l2.longValue(), r2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar2)) {
                o(map, aVar2, x(r(t(aVar2).a(((Long) map.get(aVar2)).longValue(), aVar2), 1).G(), intExact));
                return null;
            }
            if (xVar == j$.time.format.x.STRICT) {
                map.put(aVar, l);
                return null;
            }
            if (u().isEmpty()) {
                o(map, aVar2, intExact);
                return null;
            }
            o(map, aVar2, x((m) r9.get(r9.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        t(aVar3).b(((Long) map.get(aVar3)).longValue(), aVar3);
        return null;
    }

    public InterfaceC1035b O(Map map, j$.time.format.x xVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a2 = t(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (xVar == j$.time.format.x.LENIENT) {
            long subtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return J(a2, 1, 1).d(subtractExact, (j$.time.temporal.s) j$.time.temporal.b.MONTHS).d(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a3 = t(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a4 = t(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (xVar != j$.time.format.x.SMART) {
            return J(a2, a3, a4);
        }
        try {
            return J(a2, a3, a4);
        } catch (j$.time.c unused) {
            return J(a2, a3, 1).k(new j$.time.h(2));
        }
    }

    public static InterfaceC1035b A(InterfaceC1035b interfaceC1035b, long j, long j2, long j3) {
        long j4;
        InterfaceC1035b d = interfaceC1035b.d(j, (j$.time.temporal.s) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        InterfaceC1035b d2 = d.d(j2, (j$.time.temporal.s) bVar);
        if (j3 > 7) {
            long j5 = j3 - 1;
            d2 = d2.d(j5 / 7, (j$.time.temporal.s) bVar);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                d2 = d2.d(Math.subtractExact(j3, 7L) / 7, (j$.time.temporal.s) bVar);
                j4 = (j3 + 6) % 7;
            }
            return d2.k(new j$.time.temporal.o(DayOfWeek.o((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return d2.k(new j$.time.temporal.o(DayOfWeek.o((int) j3).getValue(), 0));
    }

    public static void o(Map map, j$.time.temporal.a aVar, long j) {
        Long l = (Long) map.get(aVar);
        if (l != null && l.longValue() != j) {
            throw new j$.time.c("Conflict found: " + aVar + " " + l + " differs from " + aVar + " " + j);
        }
        map.put(aVar, Long.valueOf(j));
    }

    @Override // j$.time.chrono.l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC1034a) && m().compareTo(((AbstractC1034a) obj).m()) == 0;
    }

    @Override // j$.time.chrono.l
    public final int hashCode() {
        return getClass().hashCode() ^ m().hashCode();
    }

    @Override // j$.time.chrono.l
    public final String toString() {
        return m();
    }
}
