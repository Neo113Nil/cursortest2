package androidx.camera.core;

/* loaded from: classes6.dex */
public class ResolutionInfo {
    private final androidx.camera.core.ResolutionInfo.ResolutionInfoInternal getHighSpeedVideoFpsRanges;

    public ResolutionInfo(android.util.Size size, android.graphics.Rect rect, int i) {
        androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder builder = new androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder();
        if (size == null) {
            throw new java.lang.NullPointerException("Null resolution");
        }
        builder.getHighSpeedVideoSizes = size;
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRangesFor(rect).getHighSpeedVideoSizes(i).getHighSpeedVideoFpsRangesFor();
    }

    public android.util.Size getResolution() {
        return this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI();
    }

    public android.graphics.Rect getCropRect() {
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap();
    }

    public int getRotationDegrees() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        return this.getHighSpeedVideoFpsRanges.equals(obj);
    }

    public java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges.toString();
    }

    static abstract class ResolutionInfoInternal {
        abstract android.graphics.Rect Camera2StreamConfigurationMap();

        abstract android.util.Size getHighResolutionOutputSizeshNQ4ISI();

        abstract int getHighSpeedVideoSizes();

        ResolutionInfoInternal() {
        }

        static abstract class Builder {
            abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder getHighSpeedVideoFpsRangesFor(android.graphics.Rect rect);

            abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal getHighSpeedVideoFpsRangesFor();

            abstract androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder getHighSpeedVideoSizes(int i);

            Builder() {
            }
        }
    }
}
