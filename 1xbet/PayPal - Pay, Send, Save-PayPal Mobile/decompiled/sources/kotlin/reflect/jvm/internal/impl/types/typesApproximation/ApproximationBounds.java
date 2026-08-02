package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

/* loaded from: classes5.dex */
public final class ApproximationBounds<T> {
    private final T Camera2StreamConfigurationMap;
    private final T getHighSpeedVideoSizes;

    public ApproximationBounds(T t, T t2) {
        this.Camera2StreamConfigurationMap = t;
        this.getHighSpeedVideoSizes = t2;
    }

    public final T getLower() {
        return this.Camera2StreamConfigurationMap;
    }

    public final T getUpper() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ApproximationBounds(lower=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", upper=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        T t = this.Camera2StreamConfigurationMap;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.getHighSpeedVideoSizes;
        return (hashCode * 31) + (t2 != null ? t2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds approximationBounds = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.ApproximationBounds) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, approximationBounds.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, approximationBounds.getHighSpeedVideoSizes);
    }

    public final T component2() {
        return this.getHighSpeedVideoSizes;
    }

    public final T component1() {
        return this.Camera2StreamConfigurationMap;
    }
}
