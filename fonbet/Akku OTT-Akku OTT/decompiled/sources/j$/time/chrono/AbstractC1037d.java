package j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1037d implements InterfaceC1035b, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract InterfaceC1035b A(long j);

    public abstract InterfaceC1035b I(long j);

    public abstract InterfaceC1035b v(long j);

    @Override // j$.time.chrono.InterfaceC1035b, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return a(j, sVar);
    }

    public static InterfaceC1035b o(l lVar, j$.time.temporal.m mVar) {
        InterfaceC1035b interfaceC1035b = (InterfaceC1035b) mVar;
        if (lVar.equals(interfaceC1035b.getChronology())) {
            return interfaceC1035b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + lVar.m() + ", actual: " + interfaceC1035b.getChronology().m());
    }

    @Override // j$.time.temporal.m
    public InterfaceC1035b d(long j, j$.time.temporal.s sVar) {
        boolean z = sVar instanceof j$.time.temporal.b;
        if (!z) {
            if (!z) {
                return o(getChronology(), sVar.o(this, j));
            }
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        switch (AbstractC1036c.a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return v(j);
            case 2:
                return v(Math.multiplyExact(j, 7));
            case 3:
                return A(j);
            case 4:
                return I(j);
            case 5:
                return I(Math.multiplyExact(j, 10));
            case 6:
                return I(Math.multiplyExact(j, 100));
            case 7:
                return I(Math.multiplyExact(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(Math.addExact(h(aVar), j), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1035b) && compareTo((InterfaceC1035b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public int hashCode() {
        long D = D();
        return ((int) (D ^ (D >>> 32))) ^ getChronology().hashCode();
    }

    @Override // j$.time.temporal.m
    public InterfaceC1035b k(j$.time.temporal.n nVar) {
        return o(getChronology(), nVar.e(this));
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public final String toString() {
        long h = h(j$.time.temporal.a.YEAR_OF_ERA);
        long h2 = h(j$.time.temporal.a.MONTH_OF_YEAR);
        long h3 = h(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(G());
        sb.append(" ");
        sb.append(h);
        sb.append(h2 < 10 ? "-0" : "-");
        sb.append(h2);
        sb.append(h3 < 10 ? "-0" : "-");
        sb.append(h3);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public InterfaceC1035b c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
        return o(getChronology(), qVar.O(this, j));
    }

    @Override // j$.time.chrono.InterfaceC1035b
    public InterfaceC1035b K(j$.time.temporal.p pVar) {
        return o(getChronology(), pVar.o(this));
    }
}
