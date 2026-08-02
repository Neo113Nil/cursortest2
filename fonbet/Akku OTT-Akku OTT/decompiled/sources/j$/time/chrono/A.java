package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class A extends AbstractC1034a implements Serializable {
    public static final A c = new A();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.l
    public final String m() {
        return "Minguo";
    }

    @Override // j$.time.chrono.l
    public final m w(int i) {
        if (i == 0) {
            return D.BEFORE_ROC;
        }
        if (i == 1) {
            return D.ROC;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "roc";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b J(int i, int i2, int i3) {
        return new C(j$.time.g.U(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b r(int i, int i2) {
        return new C(j$.time.g.W(i + 1911, i2));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b l(long j) {
        return new C(j$.time.g.V(j));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b F() {
        return new C(j$.time.g.A(j$.time.g.T(j$.time.b.b())));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C) {
            return (C) temporalAccessor;
        }
        return new C(j$.time.g.A(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final int x(m mVar, int i) {
        if (mVar instanceof D) {
            return mVar == D.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.l
    public final List u() {
        return j$.time.b.a(D.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.u t(j$.time.temporal.a aVar) {
        int i = z.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.u.f(uVar.a - 22932, uVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.u.g(uVar2.d - 1911, (-uVar2.a) + 1912);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.f(uVar3.a - 1911, uVar3.d - 1911);
    }

    @Override // j$.time.chrono.AbstractC1034a, j$.time.chrono.l
    public final InterfaceC1035b L(Map map, j$.time.format.x xVar) {
        return (C) super.L(map, xVar);
    }

    private A() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime M(Instant instant, ZoneId zoneId) {
        return k.A(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new E((byte) 1, this);
    }
}
