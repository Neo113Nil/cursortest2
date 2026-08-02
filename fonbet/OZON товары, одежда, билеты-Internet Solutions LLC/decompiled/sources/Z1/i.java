package Z1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final long f35323a;

    public static final class a {
    }

    private /* synthetic */ i(long j11) {
        this.f35323a = j11;
    }

    public static final /* synthetic */ i a(long j11) {
        return new i(j11);
    }

    @NotNull
    public static String b(long j11) {
        if (j11 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) h.c(Float.intBitsToFloat((int) (j11 >> 32)))) + ", " + ((Object) h.c(Float.intBitsToFloat((int) (j11 & 4294967295L)))) + ')';
    }

    public final /* synthetic */ long c() {
        return this.f35323a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f35323a == ((i) obj).f35323a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35323a);
    }

    @NotNull
    public final String toString() {
        return b(this.f35323a);
    }
}
