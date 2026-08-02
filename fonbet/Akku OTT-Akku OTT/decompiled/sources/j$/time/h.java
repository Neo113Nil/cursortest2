package j$.time;

import j$.time.temporal.TemporalAccessor;

/* loaded from: classes6.dex */
public final /* synthetic */ class h implements j$.time.temporal.n {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.n
    public j$.time.temporal.m e(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVar.c(mVar.j(aVar).d, aVar);
    }

    public Object i(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 0:
                return LocalDateTime.v(temporalAccessor);
            case 1:
                ZoneId zoneId = (ZoneId) temporalAccessor.b(j$.time.temporal.r.a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 2:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.g(aVar)) {
                    return k.P(temporalAccessor.h(aVar));
                }
                return null;
            case 3:
                return (ZoneId) temporalAccessor.b(j$.time.temporal.r.a);
            case 4:
                return (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.r.b);
            case 5:
                return (j$.time.temporal.s) temporalAccessor.b(j$.time.temporal.r.c);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.g(aVar2)) {
                    return ZoneOffset.R(temporalAccessor.f(aVar2));
                }
                return null;
            case 7:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.b(j$.time.temporal.r.a);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.b(j$.time.temporal.r.d);
            case 8:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.g(aVar3)) {
                    return g.V(temporalAccessor.h(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "ZoneId";
            case 4:
                return "Chronology";
            case 5:
                return "Precision";
            case 6:
                return "ZoneOffset";
            case 7:
                return "Zone";
            case 8:
                return "LocalDate";
            case 9:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
