package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_StreamInfo extends androidx.camera.video.StreamInfo {
    private final int getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.SurfaceRequest.TransformationInfo getHighSpeedVideoSizes;
    private final androidx.camera.video.StreamInfo.StreamState getOutputFormats;

    AutoValue_StreamInfo(int i, androidx.camera.video.StreamInfo.StreamState streamState, androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
        this.getHighSpeedVideoFpsRanges = i;
        if (streamState == null) {
            throw new java.lang.NullPointerException("Null streamState");
        }
        this.getOutputFormats = streamState;
        this.getHighSpeedVideoSizes = transformationInfo;
    }

    @Override // androidx.camera.video.StreamInfo
    public final int getId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.StreamInfo
    public final androidx.camera.video.StreamInfo.StreamState getStreamState() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.video.StreamInfo
    public final androidx.camera.core.SurfaceRequest.TransformationInfo getInProgressTransformationInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamInfo{id=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", streamState=");
        sb.append(this.getOutputFormats);
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.StreamInfo)) {
            return false;
        }
        androidx.camera.video.StreamInfo streamInfo = (androidx.camera.video.StreamInfo) obj;
        if (this.getHighSpeedVideoFpsRanges != streamInfo.getId() || !this.getOutputFormats.equals(streamInfo.getStreamState())) {
            return false;
        }
        androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo = this.getHighSpeedVideoSizes;
        if (transformationInfo == null) {
            if (streamInfo.getInProgressTransformationInfo() != null) {
                return false;
            }
        } else if (!transformationInfo.equals(streamInfo.getInProgressTransformationInfo())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoFpsRanges;
        int hashCode = this.getOutputFormats.hashCode();
        androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo = this.getHighSpeedVideoSizes;
        return ((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ (transformationInfo == null ? 0 : transformationInfo.hashCode());
    }
}
