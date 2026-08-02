package W5;

import a.AbstractC0603a;
import java.util.Arrays;
import java.util.Set;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class O1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6895a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6896b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6897c;

    /* renamed from: d, reason: collision with root package name */
    public final double f6898d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f6899e;

    /* renamed from: f, reason: collision with root package name */
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
        O1 o12 = (O1) obj;
        return this.f6895a == o12.f6895a && this.f6896b == o12.f6896b && this.f6897c == o12.f6897c && Double.compare(this.f6898d, o12.f6898d) == 0 && AbstractC1464a.t(this.f6899e, o12.f6899e) && AbstractC1464a.t(this.f6900f, o12.f6900f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6895a), Long.valueOf(this.f6896b), Long.valueOf(this.f6897c), Double.valueOf(this.f6898d), this.f6899e, this.f6900f});
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.e("maxAttempts", String.valueOf(this.f6895a));
        u02.b("initialBackoffNanos", this.f6896b);
        u02.b("maxBackoffNanos", this.f6897c);
        u02.e("backoffMultiplier", String.valueOf(this.f6898d));
        u02.a(this.f6899e, "perAttemptRecvTimeoutNanos");
        u02.a(this.f6900f, "retryableStatusCodes");
        return u02.toString();
    }
}
