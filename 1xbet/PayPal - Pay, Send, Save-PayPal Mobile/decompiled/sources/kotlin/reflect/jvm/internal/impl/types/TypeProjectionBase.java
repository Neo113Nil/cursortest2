package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class TypeProjectionBase implements kotlin.reflect.jvm.internal.impl.types.TypeProjection {
    public java.lang.String toString() {
        if (isStarProjection()) {
            return "*";
        }
        if (getProjectionKind() == kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT) {
            return getType().toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getProjectionKind());
        sb.append(" ");
        sb.append(getType());
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.types.TypeProjection)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) obj;
        return isStarProjection() == typeProjection.isStarProjection() && getProjectionKind() == typeProjection.getProjectionKind() && getType().equals(typeProjection.getType());
    }

    public int hashCode() {
        int hashCode = getProjectionKind().hashCode();
        if (kotlin.reflect.jvm.internal.impl.types.TypeUtils.noExpectedType(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (isStarProjection() ? 17 : getType().hashCode());
    }
}
