package W0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f6009a;

    public /* synthetic */ j(long j5) {
        this.f6009a = j5;
    }

    public static final boolean a(long j5, long j6) {
        return j5 == j6;
    }

    public static final long b(long j5, long j6) {
        return ((((int) (j5 >> 32)) - ((int) (j6 >> 32))) << 32) | ((((int) (j5 & 4294967295L)) - ((int) (j6 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j5, long j6) {
        return ((((int) (j5 >> 32)) + ((int) (j6 >> 32))) << 32) | ((((int) (j5 & 4294967295L)) + ((int) (j6 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j5) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j5 >> 32));
        sb.append(", ");
        return AbstractC2107A.t(sb, (int) (j5 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f6009a == ((j) obj).f6009a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f6009a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return d(this.f6009a);
    }
}
