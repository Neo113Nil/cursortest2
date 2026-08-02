package W5;

import a.AbstractC0603a;
import java.util.Arrays;
import java.util.Set;
import n3.AbstractC1464a;

/* renamed from: W5.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0500f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7203a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7204b;

    /* renamed from: c, reason: collision with root package name */
    public final E3.B f7205c;

    public C0500f0(int i7, long j, Set set) {
        this.f7203a = i7;
        this.f7204b = j;
        this.f7205c = E3.B.D(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0500f0.class != obj.getClass()) {
            return false;
        }
        C0500f0 c0500f0 = (C0500f0) obj;
        return this.f7203a == c0500f0.f7203a && this.f7204b == c0500f0.f7204b && AbstractC1464a.t(this.f7205c, c0500f0.f7205c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7203a), Long.valueOf(this.f7204b), this.f7205c});
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.e("maxAttempts", String.valueOf(this.f7203a));
        u02.b("hedgingDelayNanos", this.f7204b);
        u02.a(this.f7205c, "nonFatalStatusCodes");
        return u02.toString();
    }
}
