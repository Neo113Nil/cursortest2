package p000;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: xp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0885xp implements Comparable {

    /* JADX INFO: renamed from: m */
    public static final nc1 f9012m = new nc1(19);

    /* JADX INFO: renamed from: n */
    public static final long f9013n = -3153600000000000000L;

    /* JADX INFO: renamed from: j */
    public final nc1 f9014j;

    /* JADX INFO: renamed from: k */
    public final long f9015k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f9016l;

    public C0885xp(long j) {
        nc1 nc1Var = f9012m;
        long jNanoTime = System.nanoTime();
        this.f9014j = nc1Var;
        long jMin = Math.min(3153600000000000000L, Math.max(f9013n, j));
        this.f9015k = jNanoTime + jMin;
        this.f9016l = jMin <= 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5686a() {
        if (!this.f9016l) {
            long j = this.f9015k;
            this.f9014j.getClass();
            if (j - System.nanoTime() > 0) {
                return false;
            }
            this.f9016l = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m5687b() {
        this.f9014j.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f9016l && this.f9015k - jNanoTime <= 0) {
            this.f9016l = true;
        }
        return this.f9015k - jNanoTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0885xp c0885xp = (C0885xp) obj;
        nc1 nc1Var = c0885xp.f9014j;
        nc1 nc1Var2 = this.f9014j;
        if (nc1Var2 == nc1Var) {
            long j = this.f9015k - c0885xp.f9015k;
            if (j < 0) {
                return -1;
            }
            return j > 0 ? 1 : 0;
        }
        StringBuilder sb = new StringBuilder("Tickers (");
        sb.append(nc1Var2);
        nc1 nc1Var3 = c0885xp.f9014j;
        sb.append(" and ");
        sb.append(nc1Var3);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0885xp)) {
            return false;
        }
        C0885xp c0885xp = (C0885xp) obj;
        nc1 nc1Var = c0885xp.f9014j;
        nc1 nc1Var2 = this.f9014j;
        if (nc1Var2 != null ? nc1Var2 == nc1Var : nc1Var == null) {
            return this.f9015k == c0885xp.f9015k;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f9014j, Long.valueOf(this.f9015k)).hashCode();
    }

    public final String toString() {
        long jM5687b = m5687b();
        long jAbs = Math.abs(jM5687b) / 1000000000;
        long jAbs2 = Math.abs(jM5687b) % 1000000000;
        StringBuilder sb = new StringBuilder();
        if (jM5687b < 0) {
            sb.append('-');
        }
        sb.append(jAbs);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        nc1 nc1Var = f9012m;
        nc1 nc1Var2 = this.f9014j;
        if (nc1Var2 != nc1Var) {
            sb.append(" (ticker=" + nc1Var2 + ")");
        }
        return sb.toString();
    }
}
