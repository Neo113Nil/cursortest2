package Z1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final long f35324a;

    private /* synthetic */ j(long j11) {
        this.f35324a = j11;
    }

    public static final /* synthetic */ j a(long j11) {
        return new j(j11);
    }

    public static final float b(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final float c(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public final /* synthetic */ long d() {
        return this.f35324a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f35324a == ((j) obj).f35324a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35324a);
    }

    @NotNull
    public final String toString() {
        long j11 = this.f35324a;
        if (j11 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.c(c(j11))) + " x " + ((Object) h.c(b(j11)));
    }
}
