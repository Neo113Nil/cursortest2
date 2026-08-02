package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T Camera2StreamConfigurationMap;
    private final T getHighResolutionOutputSizeshNQ4ISI;
    private final T getHighSpeedVideoFpsRanges;
    private final T getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    public IncompatibleVersionErrorData(T t, T t2, T t3, T t4, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = t;
        this.getHighSpeedVideoFpsRanges = t2;
        this.getHighResolutionOutputSizeshNQ4ISI = t3;
        this.getHighSpeedVideoFpsRangesFor = t4;
        this.getHighSpeedVideoSizes = str;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", compilerVersion=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", languageVersion=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", expectedVersion=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", filePath=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        T t = this.Camera2StreamConfigurationMap;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.getHighSpeedVideoFpsRanges;
        int hashCode2 = t2 == null ? 0 : t2.hashCode();
        T t3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode3 = t3 == null ? 0 : t3.hashCode();
        T t4 = this.getHighSpeedVideoFpsRangesFor;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (t4 != null ? t4.hashCode() : 0)) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData incompatibleVersionErrorData = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, incompatibleVersionErrorData.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, incompatibleVersionErrorData.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, incompatibleVersionErrorData.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, incompatibleVersionErrorData.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, incompatibleVersionErrorData.getHighSpeedVideoSizes);
    }
}
