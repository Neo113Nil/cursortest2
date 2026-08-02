package Z1;

import Hj0.T;
import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final v[] f35333b = {v.a(0), v.a(4294967296L), v.a(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    private static final long f35334c = T.f(Float.NaN, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35335d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f35336a;

    public static final class a {
    }

    private /* synthetic */ u(long j11) {
        this.f35336a = j11;
    }

    public static final /* synthetic */ u b(long j11) {
        return new u(j11);
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    public static final long d(long j11) {
        return f35333b[(int) ((j11 & 1095216660480L) >>> 32)].d();
    }

    public static final float e(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    @NotNull
    public static String f(long j11) {
        long d11 = d(j11);
        if (v.b(d11, 0L)) {
            return "Unspecified";
        }
        if (v.b(d11, 4294967296L)) {
            return e(j11) + ".sp";
        }
        if (!v.b(d11, 8589934592L)) {
            return "Invalid";
        }
        return e(j11) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f35336a == ((u) obj).f35336a;
        }
        return false;
    }

    public final /* synthetic */ long g() {
        return this.f35336a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35336a);
    }

    @NotNull
    public final String toString() {
        return f(this.f35336a);
    }
}
