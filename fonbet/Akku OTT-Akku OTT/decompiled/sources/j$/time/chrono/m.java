package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;

/* loaded from: classes6.dex */
public interface m extends TemporalAccessor, j$.time.temporal.n {
    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.o(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        return super.f(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long h(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
        return qVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.h hVar) {
        if (hVar == j$.time.temporal.r.c) {
            return j$.time.temporal.b.ERAS;
        }
        return super.b(hVar);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(getValue(), j$.time.temporal.a.ERA);
    }
}
