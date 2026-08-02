package Z1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final long f35325a;

    public static final class a {
    }

    private /* synthetic */ m(long j11) {
        this.f35325a = j11;
    }

    public static final /* synthetic */ m a(long j11) {
        return new m(j11);
    }

    public static long b(int i11, int i12, int i13, long j11) {
        if ((i13 & 1) != 0) {
            i11 = (int) (j11 >> 32);
        }
        if ((i13 & 2) != 0) {
            i12 = (int) (j11 & 4294967295L);
        }
        return (i12 & 4294967295L) | (i11 << 32);
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    public static final long d(long j11, long j12) {
        return ((((int) (j11 >> 32)) - ((int) (j12 >> 32))) << 32) | ((((int) (j11 & 4294967295L)) - ((int) (j12 & 4294967295L))) & 4294967295L);
    }

    public static final long e(long j11, long j12) {
        return ((((int) (j11 >> 32)) + ((int) (j12 >> 32))) << 32) | ((((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L))) & 4294967295L);
    }

    @NotNull
    public static String f(long j11) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j11 >> 32));
        sb2.append(", ");
        return Ek.a.d(sb2, (int) (j11 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f35325a == ((m) obj).f35325a;
        }
        return false;
    }

    public final /* synthetic */ long g() {
        return this.f35325a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35325a);
    }

    @NotNull
    public final String toString() {
        return f(this.f35325a);
    }
}
