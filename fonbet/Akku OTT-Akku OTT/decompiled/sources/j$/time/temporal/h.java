package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.format.w;
import j$.time.format.x;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ h[] b;

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final u range() {
                return u.g(90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean o(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.DAY_OF_YEAR) || !temporalAccessor.g(a.MONTH_OF_YEAR) || !temporalAccessor.g(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.a;
                return j$.time.chrono.l.n(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.q
            public final u v(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long h = temporalAccessor.h(h.QUARTER_OF_YEAR);
                if (h == 1) {
                    long h2 = temporalAccessor.h(a.YEAR);
                    j$.time.chrono.s.c.getClass();
                    return j$.time.chrono.s.Q(h2) ? u.f(1L, 91L) : u.f(1L, 90L);
                }
                if (h == 2) {
                    return u.f(1L, 91L);
                }
                if (h == 3 || h == 4) {
                    return u.f(1L, 92L);
                }
                return range();
            }

            @Override // j$.time.temporal.q
            public final long I(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                int f = temporalAccessor.f(a.DAY_OF_YEAR);
                int f2 = temporalAccessor.f(a.MONTH_OF_YEAR);
                long h = temporalAccessor.h(a.YEAR);
                int i = (f2 - 1) / 3;
                j$.time.chrono.s.c.getClass();
                return f - h.a[i + (j$.time.chrono.s.Q(h) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final m O(m mVar, long j) {
                long I = I(mVar);
                range().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.c((j - I) + mVar.h(aVar), aVar);
            }

            @Override // j$.time.temporal.q
            public final TemporalAccessor A(Map map, w wVar, x xVar) {
                long j;
                j$.time.g gVar;
                a aVar = a.YEAR;
                Long l = (Long) map.get(aVar);
                q qVar = h.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(qVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int a2 = aVar.b.a(l.longValue(), aVar);
                long longValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
                h hVar2 = j.a;
                if (!j$.time.chrono.l.n(wVar).equals(j$.time.chrono.s.c)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                if (xVar == x.LENIENT) {
                    gVar = j$.time.g.U(a2, 1, 1).Z(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3));
                    j = Math.subtractExact(longValue, 1L);
                } else {
                    j$.time.g U = j$.time.g.U(a2, ((qVar.range().a(l2.longValue(), qVar) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        if (xVar == x.STRICT) {
                            v(U).b(longValue, this);
                        } else {
                            range().b(longValue, this);
                        }
                    }
                    j = longValue - 1;
                    gVar = U;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(qVar);
                return gVar.Y(j);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final u range() {
                return u.f(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean o(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.a;
                return j$.time.chrono.l.n(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.q
            public final long I(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.h(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final u v(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return range();
            }

            @Override // j$.time.temporal.q
            public final m O(m mVar, long j) {
                long I = I(mVar);
                range().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.c(((j - I) * 3) + mVar.h(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final u range() {
                return u.g(52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean o(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.a;
                return j$.time.chrono.l.n(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.q
            public final u v(TemporalAccessor temporalAccessor) {
                if (o(temporalAccessor)) {
                    return h.S(j$.time.g.A(temporalAccessor));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final long I(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.P(j$.time.g.A(temporalAccessor));
            }

            @Override // j$.time.temporal.q
            public final m O(m mVar, long j) {
                range().b(j, this);
                return mVar.d(Math.subtractExact(j, I(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.q
            public final TemporalAccessor A(Map map, w wVar, x xVar) {
                j$.time.g c;
                long j;
                long j2;
                q qVar = h.WEEK_BASED_YEAR;
                Long l = (Long) map.get(qVar);
                a aVar = a.DAY_OF_WEEK;
                Long l2 = (Long) map.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int a2 = qVar.range().a(l.longValue(), qVar);
                long longValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                h hVar4 = j.a;
                if (!j$.time.chrono.l.n(wVar).equals(j$.time.chrono.s.c)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                j$.time.g U = j$.time.g.U(a2, 1, 4);
                if (xVar == x.LENIENT) {
                    long longValue2 = l2.longValue();
                    if (longValue2 > 7) {
                        long j3 = longValue2 - 1;
                        j = 1;
                        U = U.a0(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (longValue2 < 1) {
                            U = U.a0(Math.subtractExact(longValue2, 7L) / 7);
                            j2 = (longValue2 + 6) % 7;
                        }
                        c = U.a0(Math.subtractExact(longValue, j)).c(longValue2, aVar);
                    }
                    longValue2 = j2 + j;
                    c = U.a0(Math.subtractExact(longValue, j)).c(longValue2, aVar);
                } else {
                    int a3 = aVar.b.a(l2.longValue(), aVar);
                    if (longValue < 1 || longValue > 52) {
                        if (xVar == x.STRICT) {
                            h.S(U).b(longValue, this);
                        } else {
                            range().b(longValue, this);
                        }
                    }
                    c = U.a0(longValue - 1).c(a3, aVar);
                }
                map.remove(this);
                map.remove(qVar);
                map.remove(aVar);
                return c;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final u range() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.q
            public final boolean o(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.g(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.a;
                return j$.time.chrono.l.n(temporalAccessor).equals(j$.time.chrono.s.c);
            }

            @Override // j$.time.temporal.q
            public final long I(TemporalAccessor temporalAccessor) {
                if (o(temporalAccessor)) {
                    return h.Q(j$.time.g.A(temporalAccessor));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u v(TemporalAccessor temporalAccessor) {
                if (!o(temporalAccessor)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                return range();
            }

            @Override // j$.time.temporal.q
            public final m O(m mVar, long j) {
                if (!o(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.b.a(j, h.WEEK_BASED_YEAR);
                j$.time.g A = j$.time.g.A(mVar);
                int f = A.f(a.DAY_OF_WEEK);
                int P = h.P(A);
                if (P == 53 && h.R(a2) == 52) {
                    P = 52;
                }
                return mVar.k(j$.time.g.U(a2, 1, 4).Y(((P - 1) * 7) + (f - r6.f(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static u S(j$.time.g gVar) {
        return u.f(1L, R(Q(gVar)));
    }

    public static int R(int i) {
        j$.time.g U = j$.time.g.U(i, 1, 1);
        if (U.O() != DayOfWeek.THURSDAY) {
            return (U.O() == DayOfWeek.WEDNESDAY && U.R()) ? 53 : 52;
        }
        return 53;
    }

    public static int P(j$.time.g gVar) {
        int ordinal = gVar.O().ordinal();
        int P = gVar.P() - 1;
        int i = (3 - ordinal) + P;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (P >= i3) {
            int i4 = ((P - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && gVar.R())) {
                return i4;
            }
            return 1;
        }
        if (gVar.P() != 180) {
            gVar = j$.time.g.W(gVar.a, 180);
        }
        return (int) S(gVar.b0(-1L)).d;
    }

    public static int Q(j$.time.g gVar) {
        int i = gVar.a;
        int P = gVar.P();
        if (P <= 3) {
            return P - gVar.O().ordinal() < -2 ? i - 1 : i;
        }
        if (P >= 363) {
            return ((P - 363) - (gVar.R() ? 1 : 0)) - gVar.O().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
