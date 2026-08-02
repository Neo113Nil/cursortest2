package K1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: b, reason: collision with root package name */
    private static final long f15009b = S.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15010c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f15011a;

    public static final class a {
    }

    private /* synthetic */ Q(long j11) {
        this.f15011a = j11;
    }

    public static final /* synthetic */ Q b(long j11) {
        return new Q(j11);
    }

    public static final boolean c(long j11, long j12) {
        return h(j11) <= h(j12) && g(j12) <= g(j11);
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static final boolean e(long j11) {
        return ((int) (j11 >> 32)) == ((int) (j11 & 4294967295L));
    }

    public static final int f(long j11) {
        return g(j11) - h(j11);
    }

    public static final int g(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return i11 > i12 ? i11 : i12;
    }

    public static final int h(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return i11 > i12 ? i12 : i11;
    }

    public static final boolean i(long j11) {
        return ((int) (j11 >> 32)) > ((int) (j11 & 4294967295L));
    }

    @NotNull
    public static String j(long j11) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j11 >> 32));
        sb2.append(", ");
        return Ek.a.d(sb2, (int) (j11 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Q) {
            return this.f15011a == ((Q) obj).f15011a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15011a);
    }

    public final /* synthetic */ long k() {
        return this.f15011a;
    }

    @NotNull
    public final String toString() {
        return j(this.f15011a);
    }
}
