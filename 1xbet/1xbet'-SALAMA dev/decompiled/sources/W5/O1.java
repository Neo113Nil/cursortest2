package W5;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f6898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f6899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E3.B f6900f;

    public O1(int i7, long j, long j3, double d7, Long l7, Set set) {
        this.f6895a = i7;
        this.f6896b = j;
        this.f6897c = j3;
        this.f6898d = d7;
        this.f6899e = l7;
        this.f6900f = E3.B.D(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O1)) {
            return false;
        }
        O1 o7 = (O1) obj;
        return this.f6895a == o7.f6895a && this.f6896b == o7.f6896b && this.f6897c == o7.f6897c && Double.compare(this.f6898d, o7.f6898d) == 0 && p097n3.a.t(this.f6899e, o7.f6899e) && p097n3.a.t(this.f6900f, o7.f6900f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6895a), Long.valueOf(this.f6896b), Long.valueOf(this.f6897c), Double.valueOf(this.f6898d), this.f6899e, this.f6900f});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.e("maxAttempts", String.valueOf(this.f6895a));
        jVarU0.b("initialBackoffNanos", this.f6896b);
        jVarU0.b("maxBackoffNanos", this.f6897c);
        jVarU0.e("backoffMultiplier", String.valueOf(this.f6898d));
        jVarU0.a(this.f6899e, "perAttemptRecvTimeoutNanos");
        jVarU0.a(this.f6900f, "retryableStatusCodes");
        return jVarU0.toString();
    }
}
