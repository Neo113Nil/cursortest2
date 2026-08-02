package B1;

import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface B {
    boolean I();

    @NotNull
    C7460f K(@NotNull B b11, boolean z11);

    long L(long j11);

    default void S(@NotNull float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    long W(@NotNull B b11, long j11);

    long a();

    default long t(long j11) {
        return 9205357640488583168L;
    }

    long u(long j11);

    default void v(@NotNull B b11, @NotNull float[] fArr) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    B w();

    long y(long j11);
}
