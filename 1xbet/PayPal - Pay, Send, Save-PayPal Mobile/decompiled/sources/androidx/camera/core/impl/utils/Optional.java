package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public abstract class Optional<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    public abstract boolean equals(java.lang.Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract androidx.camera.core.impl.utils.Optional<T> or(androidx.camera.core.impl.utils.Optional<? extends T> optional);

    public abstract T or(androidx.core.util.Supplier<? extends T> supplier);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract java.lang.String toString();

    public static <T> androidx.camera.core.impl.utils.Optional<T> absent() {
        return androidx.camera.core.impl.utils.Absent.getHighSpeedVideoFpsRangesFor();
    }

    public static <T> androidx.camera.core.impl.utils.Optional<T> of(T t) {
        return new androidx.camera.core.impl.utils.Present(androidx.core.util.Preconditions.checkNotNull(t));
    }

    public static <T> androidx.camera.core.impl.utils.Optional<T> fromNullable(T t) {
        return t == null ? absent() : new androidx.camera.core.impl.utils.Present(t);
    }

    Optional() {
    }
}
