package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class v extends AbstractC1034a implements Serializable {
    public static final v c = new v();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.l
    public final String m() {
        return "Japanese";
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b J(int i, int i2, int i3) {
        return new x(j$.time.g.U(i, i2, i3));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b r(int i, int i2) {
        return new x(j$.time.g.W(i, i2));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b l(long j) {
        return new x(j$.time.g.V(j));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b F() {
        return new x(j$.time.g.A(j$.time.g.T(j$.time.b.b())));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof x) {
            return (x) temporalAccessor;
        }
        return new x(j$.time.g.A(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final List u() {
        y[] yVarArr = y.e;
        return j$.time.b.a((y[]) Arrays.copyOf(yVarArr, yVarArr.length));
    }

    private v() {
    }

    @Override // j$.time.chrono.l
    public final int x(m mVar, int i) {
        if (!(mVar instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = ((y) mVar).b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || mVar != y.l(j$.time.g.U(i3, 1, 1)))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return i3;
    }

    @Override // j$.time.chrono.l
    public final m w(int i) {
        return y.n(i);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.u t(j$.time.temporal.a aVar) {
        switch (u.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.t("Unsupported field: " + aVar);
            case 5:
                y[] yVarArr = y.e;
                int i = yVarArr[yVarArr.length - 1].b.a;
                int i2 = 1000000000 - yVarArr[yVarArr.length - 1].b.a;
                int i3 = yVarArr[0].b.a;
                int i4 = 1;
                while (true) {
                    y[] yVarArr2 = y.e;
                    if (i4 >= yVarArr2.length) {
                        return j$.time.temporal.u.g(i2, 999999999 - i);
                    }
                    y yVar = yVarArr2[i4];
                    i2 = Math.min(i2, (yVar.b.a - i3) + 1);
                    i3 = yVar.b.a;
                    i4++;
                }
            case 6:
                y yVar2 = y.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                for (y yVar3 : y.e) {
                    j = Math.min(j, ((yVar3.b.R() ? 366 : 365) - yVar3.b.P()) + 1);
                    if (yVar3.m() != null) {
                        j = Math.min(j, yVar3.m().b.P() - 1);
                    }
                }
                return j$.time.temporal.u.g(j, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.u.f(x.d.a, 999999999L);
            case 8:
                long j2 = y.d.a;
                y[] yVarArr3 = y.e;
                return j$.time.temporal.u.f(j2, yVarArr3[yVarArr3.length - 1].a);
            default:
                return aVar.b;
        }
    }

    @Override // j$.time.chrono.AbstractC1034a, j$.time.chrono.l
    public final InterfaceC1035b L(Map map, j$.time.format.x xVar) {
        return (x) super.L(map, xVar);
    }

    @Override // j$.time.chrono.AbstractC1034a
    public final InterfaceC1035b P(Map map, j$.time.format.x xVar) {
        j$.time.g W;
        x R;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l = (Long) map.get(aVar);
        y n = l != null ? y.n(t(aVar).a(l.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l2 = (Long) map.get(aVar2);
        int a = l2 != null ? t(aVar2).a(l2.longValue(), aVar2) : 0;
        if (n == null && l2 != null && !map.containsKey(j$.time.temporal.a.YEAR) && xVar != j$.time.format.x.STRICT) {
            y[] yVarArr = y.e;
            n = ((y[]) Arrays.copyOf(yVarArr, yVarArr.length))[((y[]) Arrays.copyOf(yVarArr, yVarArr.length)).length - 1];
        }
        if (l2 != null && n != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (xVar == j$.time.format.x.LENIENT) {
                        return new x(j$.time.g.U((n.b.a + a) - 1, 1, 1)).O(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).O(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int a2 = t(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int a3 = t(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (xVar != j$.time.format.x.SMART) {
                        j$.time.g gVar = x.d;
                        j$.time.g U = j$.time.g.U((n.b.a + a) - 1, a2, a3);
                        if (U.Q(n.b) || n != y.l(U)) {
                            throw new j$.time.c("year, month, and day not valid for Era");
                        }
                        return new x(n, a, U);
                    }
                    if (a < 1) {
                        throw new j$.time.c("Invalid YearOfEra: " + a);
                    }
                    int i = (n.b.a + a) - 1;
                    try {
                        R = new x(j$.time.g.U(i, a2, a3));
                    } catch (j$.time.c unused) {
                        R = new x(j$.time.g.U(i, a2, 1)).R(new j$.time.h(2));
                    }
                    if (R.b == n || R.f(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || a <= 1) {
                        return R;
                    }
                    throw new j$.time.c("Invalid YearOfEra for Era: " + n + " " + a);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (xVar == j$.time.format.x.LENIENT) {
                    return new x(j$.time.g.W((n.b.a + a) - 1, 1)).O(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int a4 = t(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.g gVar2 = x.d;
                if (a == 1) {
                    j$.time.g gVar3 = n.b;
                    W = j$.time.g.W(gVar3.a, (gVar3.P() + a4) - 1);
                } else {
                    W = j$.time.g.W((n.b.a + a) - 1, a4);
                }
                if (W.Q(n.b) || n != y.l(W)) {
                    throw new j$.time.c("Invalid parameters");
                }
                return new x(n, a, W);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime M(Instant instant, ZoneId zoneId) {
        return k.A(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new E((byte) 1, this);
    }
}
