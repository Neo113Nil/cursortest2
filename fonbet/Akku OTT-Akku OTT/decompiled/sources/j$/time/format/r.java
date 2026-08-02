package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC1035b;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes6.dex */
public final class r implements TemporalAccessor {
    public final /* synthetic */ InterfaceC1035b a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ j$.time.chrono.l c;
    public final /* synthetic */ ZoneId d;

    public r(InterfaceC1035b interfaceC1035b, TemporalAccessor temporalAccessor, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.a = interfaceC1035b;
        this.b = temporalAccessor;
        this.c = lVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        InterfaceC1035b interfaceC1035b = this.a;
        if (interfaceC1035b != null && qVar.isDateBased()) {
            return interfaceC1035b.g(qVar);
        }
        return this.b.g(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u j(j$.time.temporal.q qVar) {
        InterfaceC1035b interfaceC1035b = this.a;
        if (interfaceC1035b != null && qVar.isDateBased()) {
            return interfaceC1035b.j(qVar);
        }
        return this.b.j(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        InterfaceC1035b interfaceC1035b = this.a;
        if (interfaceC1035b != null && qVar.isDateBased()) {
            return interfaceC1035b.h(qVar);
        }
        return this.b.h(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(j$.time.h hVar) {
        if (hVar == j$.time.temporal.r.b) {
            return this.c;
        }
        if (hVar == j$.time.temporal.r.a) {
            return this.d;
        }
        if (hVar == j$.time.temporal.r.c) {
            return this.b.b(hVar);
        }
        return hVar.i(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.l lVar = this.c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
