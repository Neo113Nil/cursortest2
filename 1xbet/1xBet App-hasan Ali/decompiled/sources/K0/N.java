package K0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2801b = F.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2802c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f2803a;

    public /* synthetic */ N(long j5) {
        this.f2803a = j5;
    }

    public static final boolean a(long j5, long j6) {
        return j5 == j6;
    }

    public static final boolean b(long j5) {
        return ((int) (j5 >> 32)) == ((int) (j5 & 4294967295L));
    }

    public static final int c(long j5) {
        return d(j5) - e(j5);
    }

    public static final int d(long j5) {
        return Math.max((int) (j5 >> 32), (int) (j5 & 4294967295L));
    }

    public static final int e(long j5) {
        return Math.min((int) (j5 >> 32), (int) (j5 & 4294967295L));
    }

    public static final boolean f(long j5) {
        return ((int) (j5 >> 32)) > ((int) (j5 & 4294967295L));
    }

    public static String g(long j5) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j5 >> 32));
        sb.append(", ");
        return AbstractC2107A.t(sb, (int) (j5 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            return this.f2803a == ((N) obj).f2803a;
        }
        return false;
    }

    public final int hashCode() {
        long j5 = this.f2803a;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final String toString() {
        return g(this.f2803a);
    }
}
