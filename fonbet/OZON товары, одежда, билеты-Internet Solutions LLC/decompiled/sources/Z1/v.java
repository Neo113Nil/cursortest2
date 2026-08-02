package Z1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final long f35337a;

    private /* synthetic */ v(long j11) {
        this.f35337a = j11;
    }

    public static final /* synthetic */ v a(long j11) {
        return new v(j11);
    }

    public static final boolean b(long j11, long j12) {
        return j11 == j12;
    }

    @NotNull
    public static String c(long j11) {
        return b(j11, 0L) ? "Unspecified" : b(j11, 4294967296L) ? "Sp" : b(j11, 8589934592L) ? "Em" : "Invalid";
    }

    public final /* synthetic */ long d() {
        return this.f35337a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f35337a == ((v) obj).f35337a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35337a);
    }

    @NotNull
    public final String toString() {
        return c(this.f35337a);
    }
}
