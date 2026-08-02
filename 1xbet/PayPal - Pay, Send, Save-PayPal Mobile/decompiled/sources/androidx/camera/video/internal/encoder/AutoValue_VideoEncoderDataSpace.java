package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
final class AutoValue_VideoEncoderDataSpace extends androidx.camera.video.internal.encoder.VideoEncoderDataSpace {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    AutoValue_VideoEncoderDataSpace(int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public final int getStandard() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public final int getTransfer() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public final int getRange() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", transfer=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", range=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.internal.encoder.VideoEncoderDataSpace)) {
            return false;
        }
        androidx.camera.video.internal.encoder.VideoEncoderDataSpace videoEncoderDataSpace = (androidx.camera.video.internal.encoder.VideoEncoderDataSpace) obj;
        return this.getHighSpeedVideoFpsRangesFor == videoEncoderDataSpace.getStandard() && this.getHighSpeedVideoSizes == videoEncoderDataSpace.getTransfer() && this.getHighResolutionOutputSizeshNQ4ISI == videoEncoderDataSpace.getRange();
    }

    public final int hashCode() {
        return ((((this.getHighSpeedVideoFpsRangesFor ^ 1000003) * 1000003) ^ this.getHighSpeedVideoSizes) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
