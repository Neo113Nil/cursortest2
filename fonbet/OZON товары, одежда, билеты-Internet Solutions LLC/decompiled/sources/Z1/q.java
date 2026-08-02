package Z1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final long f35331a;

    public static final class a {
    }

    private /* synthetic */ q(long j11) {
        this.f35331a = j11;
    }

    public static final /* synthetic */ q a(long j11) {
        return new q(j11);
    }

    public static boolean b(long j11, Object obj) {
        return (obj instanceof q) && j11 == ((q) obj).f35331a;
    }

    public static final boolean c(long j11, long j12) {
        return j11 == j12;
    }

    @NotNull
    public static String d(long j11) {
        return ((int) (j11 >> 32)) + " x " + ((int) (j11 & 4294967295L));
    }

    public final /* synthetic */ long e() {
        return this.f35331a;
    }

    public final boolean equals(Object obj) {
        return b(this.f35331a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f35331a);
    }

    @NotNull
    public final String toString() {
        return d(this.f35331a);
    }
}
