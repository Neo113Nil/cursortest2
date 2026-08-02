package p000;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k31 {

    /* JADX INFO: renamed from: a */
    public final int f4272a;

    /* JADX INFO: renamed from: b */
    public final long f4273b;

    /* JADX INFO: renamed from: c */
    public final long f4274c;

    /* JADX INFO: renamed from: d */
    public final double f4275d;

    /* JADX INFO: renamed from: e */
    public final Long f4276e;

    /* JADX INFO: renamed from: f */
    public final sc0 f4277f;

    public k31(int i, long j, long j2, double d, Long l, Set set) {
        this.f4272a = i;
        this.f4273b = j;
        this.f4274c = j2;
        this.f4275d = d;
        this.f4276e = l;
        this.f4277f = sc0.m4515p(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k31)) {
            return false;
        }
        k31 k31Var = (k31) obj;
        return this.f4272a == k31Var.f4272a && this.f4273b == k31Var.f4273b && this.f4274c == k31Var.f4274c && Double.compare(this.f4275d, k31Var.f4275d) == 0 && AbstractC0875xf.m5649f(this.f4276e, k31Var.f4276e) && AbstractC0875xf.m5649f(this.f4277f, k31Var.f4277f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4272a), Long.valueOf(this.f4273b), Long.valueOf(this.f4274c), Double.valueOf(this.f4275d), this.f4276e, this.f4277f});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5175f("maxAttempts", String.valueOf(this.f4272a));
        c0809vnM5362k.m5173d("initialBackoffNanos", this.f4273b);
        c0809vnM5362k.m5173d("maxBackoffNanos", this.f4274c);
        c0809vnM5362k.m5175f("backoffMultiplier", String.valueOf(this.f4275d));
        c0809vnM5362k.m5172c(this.f4276e, "perAttemptRecvTimeoutNanos");
        c0809vnM5362k.m5172c(this.f4277f, "retryableStatusCodes");
        return c0809vnM5362k.toString();
    }
}
