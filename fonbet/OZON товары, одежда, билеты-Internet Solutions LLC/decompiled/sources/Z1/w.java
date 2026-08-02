package Z1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final long f35338a;

    private /* synthetic */ w(long j11) {
        this.f35338a = j11;
    }

    public static final /* synthetic */ w a(long j11) {
        return new w(j11);
    }

    public static long b(float f7, float f11, int i11, long j11) {
        if ((i11 & 1) != 0) {
            f7 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static final float c(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float d(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final long e(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long f(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long g(float f7, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f7;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f7;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    @NotNull
    public static String h(long j11) {
        return "(" + c(j11) + ", " + d(j11) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f35338a == ((w) obj).f35338a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35338a);
    }

    public final /* synthetic */ long i() {
        return this.f35338a;
    }

    @NotNull
    public final String toString() {
        return h(this.f35338a);
    }
}
