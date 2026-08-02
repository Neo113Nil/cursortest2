package androidx.camera.core;

/* loaded from: classes6.dex */
final class AutoValue_ResolutionInfo_ResolutionInfoInternal extends androidx.camera.core.ResolutionInfo.ResolutionInfoInternal {
    private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final android.util.Size getHighSpeedVideoSizes;

    /* synthetic */ AutoValue_ResolutionInfo_ResolutionInfoInternal(android.util.Size size, android.graphics.Rect rect, int i, byte b) {
        this(size, rect, i);
    }

    private AutoValue_ResolutionInfo_ResolutionInfoInternal(android.util.Size size, android.graphics.Rect rect, int i) {
        this.getHighSpeedVideoSizes = size;
        this.getHighResolutionOutputSizeshNQ4ISI = rect;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    final android.util.Size getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    final android.graphics.Rect Camera2StreamConfigurationMap() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal
    final int getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolutionInfoInternal{resolution=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", cropRect=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", rotationDegrees=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.ResolutionInfo.ResolutionInfoInternal)) {
            return false;
        }
        androidx.camera.core.ResolutionInfo.ResolutionInfoInternal resolutionInfoInternal = (androidx.camera.core.ResolutionInfo.ResolutionInfoInternal) obj;
        return this.getHighSpeedVideoSizes.equals(resolutionInfoInternal.getHighResolutionOutputSizeshNQ4ISI()) && this.getHighResolutionOutputSizeshNQ4ISI.equals(resolutionInfoInternal.Camera2StreamConfigurationMap()) && this.getHighSpeedVideoFpsRanges == resolutionInfoInternal.getHighSpeedVideoSizes();
    }

    public final int hashCode() {
        return ((((this.getHighSpeedVideoSizes.hashCode() ^ 1000003) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 1000003) ^ this.getHighSpeedVideoFpsRanges;
    }

    static final class Builder extends androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder {
        private java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;
        private android.graphics.Rect getHighSpeedVideoFpsRanges;
        android.util.Size getHighSpeedVideoSizes;

        Builder() {
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        final androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder getHighSpeedVideoFpsRangesFor(android.graphics.Rect rect) {
            if (rect == null) {
                throw new java.lang.NullPointerException("Null cropRect");
            }
            this.getHighSpeedVideoFpsRanges = rect;
            return this;
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        final androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder getHighSpeedVideoSizes(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.core.ResolutionInfo.ResolutionInfoInternal.Builder
        final androidx.camera.core.ResolutionInfo.ResolutionInfoInternal getHighSpeedVideoFpsRangesFor() {
            java.lang.String str;
            if (this.getHighSpeedVideoSizes != null) {
                str = "";
            } else {
                str = " resolution";
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" cropRect");
                str = sb.toString();
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" rotationDegrees");
                str = sb2.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI.intValue(), (byte) 0);
        }
    }
}
