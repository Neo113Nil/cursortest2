package androidx.core.graphics;

/* loaded from: classes7.dex */
public final class PathSegment {
    private final android.graphics.PointF Camera2StreamConfigurationMap;
    private final android.graphics.PointF getHighResolutionOutputSizeshNQ4ISI;
    private final float getHighSpeedVideoFpsRangesFor;
    private final float getHighSpeedVideoSizes;

    public PathSegment(android.graphics.PointF pointF, float f, android.graphics.PointF pointF2, float f2) {
        this.Camera2StreamConfigurationMap = (android.graphics.PointF) androidx.core.util.Preconditions.checkNotNull(pointF, "start == null");
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = (android.graphics.PointF) androidx.core.util.Preconditions.checkNotNull(pointF2, "end == null");
        this.getHighSpeedVideoSizes = f2;
    }

    public final android.graphics.PointF getStart() {
        return this.Camera2StreamConfigurationMap;
    }

    public final float getStartFraction() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final android.graphics.PointF getEnd() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final float getEndFraction() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.core.graphics.PathSegment)) {
            return false;
        }
        androidx.core.graphics.PathSegment pathSegment = (androidx.core.graphics.PathSegment) obj;
        return java.lang.Float.compare(this.getHighSpeedVideoFpsRangesFor, pathSegment.getHighSpeedVideoFpsRangesFor) == 0 && java.lang.Float.compare(this.getHighSpeedVideoSizes, pathSegment.getHighSpeedVideoSizes) == 0 && this.Camera2StreamConfigurationMap.equals(pathSegment.Camera2StreamConfigurationMap) && this.getHighResolutionOutputSizeshNQ4ISI.equals(pathSegment.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        float f = this.getHighSpeedVideoFpsRangesFor;
        int floatToIntBits = f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0;
        int hashCode2 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        float f2 = this.getHighSpeedVideoSizes;
        return (((((hashCode * 31) + floatToIntBits) * 31) + hashCode2) * 31) + (f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PathSegment{start=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", startFraction=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", end=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", endFraction=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
