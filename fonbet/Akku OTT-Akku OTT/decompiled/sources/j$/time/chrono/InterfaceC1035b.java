package j$.time.chrono;

/* renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC1035b extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    InterfaceC1035b K(j$.time.temporal.p pVar);

    @Override // j$.time.temporal.m
    InterfaceC1035b c(long j, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.m
    InterfaceC1035b d(long j, j$.time.temporal.s sVar);

    boolean equals(Object obj);

    l getChronology();

    int hashCode();

    InterfaceC1035b k(j$.time.temporal.n nVar);

    String toString();

    default InterfaceC1038e E(j$.time.k kVar) {
        return new C1040g(this, kVar);
    }

    default m G() {
        return getChronology().w(f(j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isDateBased();
        }
        return qVar != null && qVar.o(this);
    }

    @Override // j$.time.temporal.m
    default InterfaceC1035b a(long j, j$.time.temporal.s sVar) {
        return AbstractC1037d.o(getChronology(), super.a(j, sVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.h hVar) {
        if (hVar == j$.time.temporal.r.a || hVar == j$.time.temporal.r.e || hVar == j$.time.temporal.r.d || hVar == j$.time.temporal.r.g) {
            return null;
        }
        if (hVar == j$.time.temporal.r.b) {
            return getChronology();
        }
        if (hVar == j$.time.temporal.r.c) {
            return j$.time.temporal.b.DAYS;
        }
        return hVar.i(this);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m e(j$.time.temporal.m mVar) {
        return mVar.c(D(), j$.time.temporal.a.EPOCH_DAY);
    }

    default long D() {
        return h(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: N */
    default int compareTo(InterfaceC1035b interfaceC1035b) {
        int compare = Long.compare(D(), interfaceC1035b.D());
        if (compare != 0) {
            return compare;
        }
        return ((AbstractC1034a) getChronology()).m().compareTo(interfaceC1035b.getChronology().m());
    }
}
