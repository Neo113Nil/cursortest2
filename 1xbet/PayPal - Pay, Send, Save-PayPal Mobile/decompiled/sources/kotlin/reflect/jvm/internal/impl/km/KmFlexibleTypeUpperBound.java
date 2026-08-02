package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmFlexibleTypeUpperBound {
    public static final kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound.Companion Companion = new kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound.Companion(null);
    private java.lang.String getHighSpeedVideoFpsRanges;
    private kotlin.reflect.jvm.internal.impl.km.KmType getHighSpeedVideoFpsRangesFor;

    public KmFlexibleTypeUpperBound(kotlin.reflect.jvm.internal.impl.km.KmType kmType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        this.getHighSpeedVideoFpsRangesFor = kmType;
        this.getHighSpeedVideoFpsRanges = str;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType getType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String getTypeFlexibilityId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", typeFlexibilityId=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRangesFor.hashCode();
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = (kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, kmFlexibleTypeUpperBound.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, kmFlexibleTypeUpperBound.getHighSpeedVideoFpsRanges);
    }
}
