package z6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class g implements Iterable, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18550c;

    public g(long j, long j3, long j7) {
        if (j7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j7 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f18548a = j;
        if (j7 > 0) {
            if (j < j3) {
                long j8 = j3 % j7;
                long j9 = j % j7;
                long j10 = ((j8 < 0 ? j8 + j7 : j8) - (j9 < 0 ? j9 + j7 : j9)) % j7;
                j3 -= j10 < 0 ? j10 + j7 : j10;
            }
        } else {
            if (j7 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j3) {
                long j11 = -j7;
                long j12 = j % j11;
                long j13 = j3 % j11;
                long j14 = ((j12 < 0 ? j12 + j11 : j12) - (j13 < 0 ? j13 + j11 : j13)) % j11;
                j3 += j14 < 0 ? j14 + j11 : j14;
            }
        }
        this.f18549b = j3;
        this.f18550c = j7;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f18548a != gVar.f18548a || this.f18549b != gVar.f18549b || this.f18550c != gVar.f18550c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j3 = this.f18548a;
        long j7 = this.f18549b;
        long j8 = (((j3 ^ (j3 >>> 32)) * j) + (j7 ^ (j7 >>> 32))) * j;
        long j9 = this.f18550c;
        return (int) (j8 + (j9 ^ (j9 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.f18550c;
        long j3 = this.f18549b;
        long j7 = this.f18548a;
        if (j > 0) {
            if (j7 <= j3) {
                return false;
            }
        } else if (j7 >= j3) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h(this.f18548a, this.f18549b, this.f18550c);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.f18550c;
        long j3 = this.f18549b;
        long j7 = this.f18548a;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j7);
            sb.append("..");
            sb.append(j3);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j7);
            sb.append(" downTo ");
            sb.append(j3);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
