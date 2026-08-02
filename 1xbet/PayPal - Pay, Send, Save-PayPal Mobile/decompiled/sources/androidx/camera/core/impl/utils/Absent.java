package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
final class Absent<T> extends androidx.camera.core.impl.utils.Optional<T> {
    static final androidx.camera.core.impl.utils.Absent<java.lang.Object> getHighSpeedVideoFpsRangesFor = new androidx.camera.core.impl.utils.Absent<>();
    private static final long serialVersionUID = 0;

    @Override // androidx.camera.core.impl.utils.Optional
    public final boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final int hashCode() {
        return 2040732332;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final boolean isPresent() {
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final T orNull() {
        return null;
    }

    static <T> androidx.camera.core.impl.utils.Optional<T> getHighSpeedVideoFpsRangesFor() {
        return getHighSpeedVideoFpsRangesFor;
    }

    private Absent() {
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final T get() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final T or(T t) {
        return (T) androidx.core.util.Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final androidx.camera.core.impl.utils.Optional<T> or(androidx.camera.core.impl.utils.Optional<? extends T> optional) {
        return (androidx.camera.core.impl.utils.Optional) androidx.core.util.Preconditions.checkNotNull(optional);
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final T or(androidx.core.util.Supplier<? extends T> supplier) {
        return (T) androidx.core.util.Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final java.lang.String toString() {
        return "Optional.absent()";
    }

    private java.lang.Object readResolve() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
