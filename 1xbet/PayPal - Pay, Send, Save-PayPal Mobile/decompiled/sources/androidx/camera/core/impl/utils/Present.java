package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
final class Present<T> extends androidx.camera.core.impl.utils.Optional<T> {
    private static final long serialVersionUID = 0;
    private final T getHighSpeedVideoSizes;

    @Override // androidx.camera.core.impl.utils.Optional
    public final boolean isPresent() {
        return true;
    }

    Present(T t) {
        this.getHighSpeedVideoSizes = t;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final T get() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final T or(T t) {
        androidx.core.util.Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final androidx.camera.core.impl.utils.Optional<T> or(androidx.camera.core.impl.utils.Optional<? extends T> optional) {
        androidx.core.util.Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final T or(androidx.core.util.Supplier<? extends T> supplier) {
        androidx.core.util.Preconditions.checkNotNull(supplier);
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final T orNull() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.core.impl.utils.Present) {
            return this.getHighSpeedVideoSizes.equals(((androidx.camera.core.impl.utils.Present) obj).getHighSpeedVideoSizes);
        }
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode() + 1502476572;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Optional.of(");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(")");
        return sb.toString();
    }
}
