package C4;

import B4.k;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import kotlin.jvm.internal.i;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final long f390b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f391c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f392d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f393a;

    static {
        int i2 = b.f394a;
        f390b = AbstractC1477a.k(4611686018427387903L);
        f391c = AbstractC1477a.k(-4611686018427387903L);
    }

    public static final long a(long j2, long j6) {
        long j7 = 1000000;
        long j8 = j6 / j7;
        long j9 = j2 + j8;
        if (-4611686018426L > j9 || j9 >= 4611686018427L) {
            return AbstractC1477a.k(K1.b.K(j9));
        }
        return AbstractC1477a.m((j9 * j7) + (j6 - (j8 * j7)));
    }

    public static final void b(StringBuilder sb, int i2, int i3, int i6, String str, boolean z) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String c02 = k.c0(i6, String.valueOf(i3));
            int i7 = -1;
            int length = c02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (c02.charAt(length) != '0') {
                        i7 = length;
                        break;
                    } else if (i8 < 0) {
                        break;
                    } else {
                        length = i8;
                    }
                }
            }
            int i9 = i7 + 1;
            if (z || i9 >= 3) {
                sb.append((CharSequence) c02, 0, ((i7 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) c02, 0, i9);
            }
        }
        sb.append(str);
    }

    public static final int c(long j2) {
        if (d(j2)) {
            return 0;
        }
        return (int) ((((int) j2) & 1) == 1 ? ((j2 >> 1) % AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) * 1000000 : (j2 >> 1) % 1000000000);
    }

    public static final boolean d(long j2) {
        return j2 == f390b || j2 == f391c;
    }

    public static final long e(long j2, long j6) {
        if (d(j2)) {
            if (!d(j6) || (j6 ^ j2) >= 0) {
                return j2;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j6)) {
            return j6;
        }
        int i2 = ((int) j2) & 1;
        if (i2 != (((int) j6) & 1)) {
            return i2 == 1 ? a(j2 >> 1, j6 >> 1) : a(j6 >> 1, j2 >> 1);
        }
        long j7 = (j2 >> 1) + (j6 >> 1);
        return i2 == 0 ? (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) ? AbstractC1477a.k(j7 / 1000000) : AbstractC1477a.m(j7) : AbstractC1477a.l(j7);
    }

    public static final long f(long j2, c unit) {
        i.e(unit, "unit");
        if (j2 == f390b) {
            return Long.MAX_VALUE;
        }
        if (j2 == f391c) {
            return Long.MIN_VALUE;
        }
        long j6 = j2 >> 1;
        c sourceUnit = (((int) j2) & 1) == 0 ? c.f395b : c.f396c;
        i.e(sourceUnit, "sourceUnit");
        return unit.f402a.convert(j6, sourceUnit.f402a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j2 = ((a) obj).f393a;
        long j6 = this.f393a;
        long j7 = j6 ^ j2;
        if (j7 < 0 || (((int) j7) & 1) == 0) {
            return i.h(j6, j2);
        }
        int i2 = (((int) j6) & 1) - (((int) j2) & 1);
        return j6 < 0 ? -i2 : i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f393a == ((a) obj).f393a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f393a);
    }

    public final String toString() {
        boolean z;
        int f3;
        int i2;
        StringBuilder sb;
        long j2 = this.f393a;
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == f390b) {
            return "Infinity";
        }
        if (j2 == f391c) {
            return "-Infinity";
        }
        boolean z5 = j2 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z5) {
            sb2.append('-');
        }
        if (j2 < 0) {
            j2 = (((int) j2) & 1) + ((-(j2 >> 1)) << 1);
            int i3 = b.f394a;
        }
        long f6 = f(j2, c.f400g);
        if (d(j2)) {
            z = z5;
            f3 = 0;
        } else {
            z = z5;
            f3 = (int) (f(j2, c.f399f) % 24);
        }
        int f7 = d(j2) ? 0 : (int) (f(j2, c.f398e) % 60);
        int f8 = d(j2) ? 0 : (int) (f(j2, c.f397d) % 60);
        int c2 = c(j2);
        boolean z6 = f6 != 0;
        boolean z7 = f3 != 0;
        boolean z8 = f7 != 0;
        boolean z9 = (f8 == 0 && c2 == 0) ? false : true;
        if (z6) {
            sb2.append(f6);
            sb2.append('d');
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z7 || (z6 && (z8 || z9))) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb2.append(' ');
            }
            sb2.append(f3);
            sb2.append('h');
            i2 = i6;
        }
        if (z8 || (z9 && (z7 || z6))) {
            int i7 = i2 + 1;
            if (i2 > 0) {
                sb2.append(' ');
            }
            sb2.append(f7);
            sb2.append('m');
            i2 = i7;
        }
        if (z9) {
            int i8 = i2 + 1;
            if (i2 > 0) {
                sb2.append(' ');
            }
            if (f8 != 0 || z6 || z7 || z8) {
                sb = sb2;
                b(sb, f8, c2, 9, "s", false);
            } else if (c2 >= 1000000) {
                sb = sb2;
                b(sb2, c2 / 1000000, c2 % 1000000, 6, "ms", false);
            } else {
                sb = sb2;
                if (c2 >= 1000) {
                    b(sb, c2 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, c2 % AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 3, "us", false);
                } else {
                    sb.append(c2);
                    sb.append("ns");
                }
            }
            i2 = i8;
        } else {
            sb = sb2;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
