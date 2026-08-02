package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G extends AbstractC1034a implements Serializable {
    public static final G c = new G();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.l
    public final m w(int i) {
        if (i == 0) {
            return J.BEFORE_BE;
        }
        if (i == 1) {
            return J.BE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.l
    public final String m() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "buddhist";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b J(int i, int i2, int i3) {
        return new I(j$.time.g.U(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b r(int i, int i2) {
        return new I(j$.time.g.W(i - 543, i2));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b l(long j) {
        return new I(j$.time.g.V(j));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b F() {
        return new I(j$.time.g.A(j$.time.g.T(j$.time.b.b())));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC1035b B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof I) {
            return (I) temporalAccessor;
        }
        return new I(j$.time.g.A(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final int x(m mVar, int i) {
        if (mVar instanceof J) {
            return mVar == J.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private G() {
    }

    @Override // j$.time.chrono.l
    public final List u() {
        return j$.time.b.a(J.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.u t(j$.time.temporal.a aVar) {
        int i = F.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.u.f(uVar.a + 6516, uVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.u.g((-(uVar2.a + 543)) + 1, uVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.f(uVar3.a + 543, uVar3.d + 543);
    }

    @Override // j$.time.chrono.AbstractC1034a, j$.time.chrono.l
    public final InterfaceC1035b L(Map map, j$.time.format.x xVar) {
        return (I) super.L(map, xVar);
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
