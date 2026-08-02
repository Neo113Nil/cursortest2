package V1;

import Hj0.T;
import Z1.u;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final o f27926c = new o(T.d(0), T.d(0));

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27927d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f27928a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27929b;

    public static final class a {
    }

    public o(long j11, long j12) {
        this.f27928a = j11;
        this.f27929b = j12;
    }

    public final long b() {
        return this.f27928a;
    }

    public final long c() {
        return this.f27929b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return u.c(this.f27928a, oVar.f27928a) && u.c(this.f27929b, oVar.f27929b);
    }

    public final int hashCode() {
        int i11 = u.f35335d;
        return Long.hashCode(this.f27929b) + (Long.hashCode(this.f27928a) * 31);
    }

    @NotNull
    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) u.f(this.f27928a)) + ", restLine=" + ((Object) u.f(this.f27929b)) + ')';
    }
}
