package W5;

import U5.C0437d;
import io.sentry.protocol.Request;
import java.util.Arrays;

/* JADX INFO: renamed from: W5.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0539s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0437d f7363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5.b0 f7364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H2.r f7365c;

    public C0539s1(H2.r rVar, U5.b0 b0Var, C0437d c0437d) {
        p113p3.f.k(rVar, Request.JsonKeys.METHOD);
        this.f7365c = rVar;
        p113p3.f.k(b0Var, "headers");
        this.f7364b = b0Var;
        p113p3.f.k(c0437d, "callOptions");
        this.f7363a = c0437d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0539s1.class != obj.getClass()) {
            return false;
        }
        C0539s1 c0539s1 = (C0539s1) obj;
        return p097n3.a.t(this.f7363a, c0539s1.f7363a) && p097n3.a.t(this.f7364b, c0539s1.f7364b) && p097n3.a.t(this.f7365c, c0539s1.f7365c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7363a, this.f7364b, this.f7365c});
    }

    public final String toString() {
        return "[method=" + this.f7365c + " headers=" + this.f7364b + " callOptions=" + this.f7363a + "]";
    }
}
