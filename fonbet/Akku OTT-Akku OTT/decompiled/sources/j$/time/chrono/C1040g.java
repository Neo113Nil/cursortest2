package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import kotlin.time.DurationKt;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1040g implements InterfaceC1038e, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC1035b a;
    public final transient j$.time.k b;

    public static C1040g o(l lVar, j$.time.temporal.m mVar) {
        C1040g c1040g = (C1040g) mVar;
        if (lVar.equals(c1040g.getChronology())) {
            return c1040g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.m() + ", actual: " + c1040g.getChronology().m());
    }

    public C1040g(InterfaceC1035b interfaceC1035b, j$.time.k kVar) {
        Objects.requireNonNull(kVar, "time");
        this.a = interfaceC1035b;
        this.b = kVar;
    }

    public final C1040g O(j$.time.temporal.m mVar, j$.time.k kVar) {
        InterfaceC1035b interfaceC1035b = this.a;
        return (interfaceC1035b == mVar && this.b == kVar) ? this : new C1040g(AbstractC1037d.o(interfaceC1035b.getChronology(), mVar), kVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.chrono.InterfaceC1038e
    public final InterfaceC1035b toLocalDate() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + ExifInterface.GPS_DIRECTION_TRUE + this.b.toString();
    }

    @Override // j$.time.chrono.InterfaceC1038e
    public final j$.time.k toLocalTime() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.o(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.isDateBased() || aVar.Q();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u j(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return (((j$.time.temporal.a) qVar).Q() ? this.b : this.a).j(qVar);
        }
        return qVar.v(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.b.f(qVar) : this.a.f(qVar);
        }
        return j(qVar).a(h(qVar), qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.b.h(qVar) : this.a.h(qVar);
        }
        return qVar.I(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: i */
    public final j$.time.temporal.m k(j$.time.g gVar) {
        return O(gVar, this.b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final C1040g c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) qVar).Q()) {
                return O(this.a, this.b.c(j, qVar));
            }
            return O(this.a.c(j, qVar), this.b);
        }
        return o(this.a.getChronology(), qVar.O(this, j));
    }

    @Override // j$.time.temporal.m
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final C1040g d(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return o(this.a.getChronology(), sVar.o(this, j));
        }
        switch (AbstractC1039f.a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return A(this.a, 0L, 0L, 0L, j);
            case 2:
                C1040g O = O(this.a.d(j / 86400000000L, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.b);
                return O.A(O.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C1040g O2 = O(this.a.d(j / DurationKt.MILLIS_IN_DAY, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.b);
                return O2.A(O2.a, 0L, 0L, 0L, (j % DurationKt.MILLIS_IN_DAY) * 1000000);
            case 4:
                return A(this.a, 0L, 0L, j, 0L);
            case 5:
                return A(this.a, 0L, j, 0L, 0L);
            case 6:
                return A(this.a, j, 0L, 0L, 0L);
            case 7:
                C1040g O3 = O(this.a.d(j / 256, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.b);
                return O3.A(O3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return O(this.a.d(j, sVar), this.b);
        }
    }

    public final C1040g A(InterfaceC1035b interfaceC1035b, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return O(interfaceC1035b, this.b);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long W = this.b.W();
        long j7 = j6 + W;
        long floorDiv = Math.floorDiv(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long floorMod = Math.floorMod(j7, 86400000000000L);
        return O(interfaceC1035b.d(floorDiv, (j$.time.temporal.s) j$.time.temporal.b.DAYS), floorMod == W ? this.b : j$.time.k.P(floorMod));
    }

    @Override // j$.time.chrono.InterfaceC1038e
    public final ChronoZonedDateTime z(ZoneId zoneId) {
        return k.v(zoneId, null, this);
    }

    private Object writeReplace() {
        return new E((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1038e) && compareTo((InterfaceC1038e) obj) == 0;
    }
}
