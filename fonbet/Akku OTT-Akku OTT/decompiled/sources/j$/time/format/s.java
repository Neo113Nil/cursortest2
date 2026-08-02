package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC1035b;
import j$.time.temporal.TemporalAccessor;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class s {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    public s(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.l lVar = dateTimeFormatter.e;
        if (lVar != null) {
            j$.time.chrono.l lVar2 = (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.r.b);
            ZoneId zoneId = (ZoneId) temporalAccessor.b(j$.time.temporal.r.a);
            InterfaceC1035b interfaceC1035b = null;
            lVar = Objects.equals(lVar, lVar2) ? null : lVar;
            if (lVar != null) {
                j$.time.chrono.l lVar3 = lVar != null ? lVar : lVar2;
                if (lVar != null) {
                    if (temporalAccessor.g(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC1035b = lVar3.B(temporalAccessor);
                    } else if (lVar != j$.time.chrono.s.c || lVar2 != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.isDateBased() && temporalAccessor.g(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + lVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new r(interfaceC1035b, temporalAccessor, lVar3, zoneId);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Long a(j$.time.temporal.q qVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.g(qVar)) {
            return Long.valueOf(temporalAccessor.h(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
