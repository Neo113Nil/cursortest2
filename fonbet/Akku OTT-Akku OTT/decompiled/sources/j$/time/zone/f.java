package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.o;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class f implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentMap h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.o()) {
            if (localDateTime.A(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.A(bVar.b.Q(bVar.d.b - bVar.c.b))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.A(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.A(bVar.b.Q(bVar.d.b - bVar.c.b))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.o()) {
                    arrayList.add(bVar.b);
                    arrayList.add(bVar.b.Q(bVar.d.b - bVar.c.b));
                } else {
                    arrayList.add(bVar.b.Q(bVar.d.b - bVar.c.b));
                    arrayList.add(bVar.b);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    public static ZoneOffset g(int i2) {
        return ZoneOffset.R(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return j$.time.g.V(Math.floorDiv(j2 + zoneOffset.b, 86400)).a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f.length > 0) {
            if (epochSecond > this.c[r7.length - 1]) {
                b[] b = b(c(epochSecond, this.e[r7.length - 1]));
                b bVar = null;
                for (int i2 = 0; i2 < b.length; i2++) {
                    bVar = b[i2];
                    if (epochSecond < bVar.a) {
                        return bVar.c;
                    }
                }
                return bVar.d;
            }
        }
        int binarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.e[binarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object e = e(localDateTime);
        if (!(e instanceof b)) {
            return Collections.singletonList((ZoneOffset) e);
        }
        b bVar = (b) e;
        return bVar.o() ? Collections.EMPTY_LIST : j$.time.b.a(new Object[]{bVar.c, bVar.d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r8.o(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r8.b.W() <= r0.b.W()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(LocalDateTime localDateTime) {
        Object obj = null;
        int i2 = 0;
        if (this.g != null) {
            b[] b = b(localDateTime.a.a);
            if (b.length == 0) {
                return g(this.g.getOffset(localDateTime.s(this.b[0]) * 1000));
            }
            int length = b.length;
            while (i2 < length) {
                b bVar = b[i2];
                Object a = a(localDateTime, bVar);
                if ((a instanceof b) || a.equals(bVar.c)) {
                    return a;
                }
                i2++;
                obj = a;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        if (this.f.length > 0) {
            LocalDateTime localDateTime2 = this.d[r0.length - 1];
            if (localDateTime2 == null) {
                long D = localDateTime.a.D();
                long D2 = localDateTime2.a.D();
                if (D <= D2) {
                    if (D == D2) {
                    }
                }
                b[] b2 = b(localDateTime.a.a);
                int length2 = b2.length;
                while (i2 < length2) {
                    b bVar2 = b2[i2];
                    Object a2 = a(localDateTime, bVar2);
                    if ((a2 instanceof b) || a2.equals(bVar2.c)) {
                        return a2;
                    }
                    i2++;
                    obj = a2;
                }
                return obj;
            }
            localDateTime.getClass();
        }
        int binarySearch = Arrays.binarySearch(this.d, localDateTime);
        if (binarySearch == -1) {
            return this.e[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            Object[] objArr = this.d;
            if (binarySearch < objArr.length - 1) {
                int i3 = binarySearch + 1;
                if (objArr[binarySearch].equals(objArr[i3])) {
                    binarySearch = i3;
                }
            }
        }
        if ((binarySearch & 1) == 0) {
            LocalDateTime[] localDateTimeArr = this.d;
            LocalDateTime localDateTime3 = localDateTimeArr[binarySearch];
            LocalDateTime localDateTime4 = localDateTimeArr[binarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.e;
            int i4 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i4];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i4 + 1];
            if (zoneOffset2.b > zoneOffset.b) {
                return new b(localDateTime3, zoneOffset, zoneOffset2);
            }
            return new b(localDateTime4, zoneOffset, zoneOffset2);
        }
        return this.e[(binarySearch / 2) + 1];
    }

    public final b[] b(int i2) {
        j$.time.g v;
        b[] bVarArr = l;
        Integer valueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.h).get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        int i3 = 0;
        int i4 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            j$.time.g U = j$.time.g.U(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.P(0);
            long s = new LocalDateTime(U, k.h[0]).s(this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(s * 1000);
            long j4 = 31968000 + s;
            while (s < j4) {
                long j5 = s + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - s > j2) {
                        long floorDiv = Math.floorDiv(j5 + s, 2L);
                        if (this.g.getOffset(floorDiv * j6) == offset) {
                            s = floorDiv;
                        } else {
                            j5 = floorDiv;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(s * j6) == offset) {
                        s = j5;
                    }
                    ZoneOffset g = g(offset);
                    int offset2 = this.g.getOffset(s * j6);
                    ZoneOffset g2 = g(offset2);
                    if (c(s, g2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(s, g, g2);
                    }
                    offset = offset2;
                } else {
                    s = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                ((ConcurrentHashMap) this.h).putIfAbsent(valueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i5 = 0;
        while (i5 < eVarArr.length) {
            e eVar = eVarArr[i5];
            byte b = eVar.b;
            if (b < 0) {
                m mVar = eVar.a;
                long j7 = i2;
                s.c.getClass();
                int v2 = mVar.v(s.Q(j7)) + 1 + eVar.b;
                j$.time.g gVar = j$.time.g.d;
                j$.time.temporal.a.YEAR.P(j7);
                j$.time.temporal.a.DAY_OF_MONTH.P(v2);
                v = j$.time.g.v(i2, mVar.getValue(), v2);
                DayOfWeek dayOfWeek = eVar.c;
                if (dayOfWeek != null) {
                    v = v.i(new o(dayOfWeek.getValue(), i4));
                }
            } else {
                m mVar2 = eVar.a;
                j$.time.g gVar2 = j$.time.g.d;
                j$.time.temporal.a.YEAR.P(i2);
                j$.time.temporal.a.DAY_OF_MONTH.P(b);
                v = j$.time.g.v(i2, mVar2.getValue(), b);
                DayOfWeek dayOfWeek2 = eVar.c;
                if (dayOfWeek2 != null) {
                    v = v.i(new o(dayOfWeek2.getValue(), i3));
                }
            }
            if (eVar.e) {
                v = v.Y(1L);
            }
            LocalDateTime I = LocalDateTime.I(v, eVar.d);
            d dVar = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            int i6 = c.a[dVar.ordinal()];
            if (i6 == 1) {
                I = I.Q(zoneOffset2.b - ZoneOffset.UTC.b);
            } else if (i6 == 2) {
                I = I.Q(zoneOffset2.b - zoneOffset.b);
            }
            bVarArr3[i5] = new b(I, eVar.h, eVar.i);
            i5++;
            i3 = 0;
        }
        if (i2 < 2100) {
            ((ConcurrentHashMap) this.h).putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.a, fVar.a) && Arrays.equals(this.b, fVar.b) && Arrays.equals(this.c, fVar.c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f, fVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r0.length - 1] + "]";
    }
}
