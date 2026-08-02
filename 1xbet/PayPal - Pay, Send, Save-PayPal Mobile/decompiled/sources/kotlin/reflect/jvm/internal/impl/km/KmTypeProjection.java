package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmTypeProjection {
    public static final kotlin.reflect.jvm.internal.impl.km.KmTypeProjection.Companion Companion = new kotlin.reflect.jvm.internal.impl.km.KmTypeProjection.Companion(null);
    public static final kotlin.reflect.jvm.internal.impl.km.KmTypeProjection STAR = new kotlin.reflect.jvm.internal.impl.km.KmTypeProjection(null, null);
    private kotlin.reflect.jvm.internal.impl.km.KmType getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.reflect.jvm.internal.impl.km.KmVariance getHighSpeedVideoFpsRangesFor;

    public KmTypeProjection(kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance, kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        this.getHighSpeedVideoFpsRangesFor = kmVariance;
        this.getHighResolutionOutputSizeshNQ4ISI = kmType;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType getType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmVariance getVariance() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KmTypeProjection(variance=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", type=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance = this.getHighSpeedVideoFpsRangesFor;
        int hashCode = kmVariance == null ? 0 : kmVariance.hashCode();
        kotlin.reflect.jvm.internal.impl.km.KmType kmType = this.getHighResolutionOutputSizeshNQ4ISI;
        return (hashCode * 31) + (kmType != null ? kmType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.km.KmTypeProjection)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.km.KmTypeProjection kmTypeProjection = (kotlin.reflect.jvm.internal.impl.km.KmTypeProjection) obj;
        return this.getHighSpeedVideoFpsRangesFor == kmTypeProjection.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, kmTypeProjection.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType component2() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmVariance component1() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
