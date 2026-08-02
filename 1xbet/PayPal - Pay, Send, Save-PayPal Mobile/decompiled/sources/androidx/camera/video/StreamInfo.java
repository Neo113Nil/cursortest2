package androidx.camera.video;

/* loaded from: classes6.dex */
public abstract class StreamInfo {
    static final androidx.camera.video.StreamInfo getHighSpeedVideoFpsRangesFor = new androidx.camera.video.AutoValue_StreamInfo(0, androidx.camera.video.StreamInfo.StreamState.INACTIVE, null);
    static final java.util.Set<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(0, -1)));
    static final androidx.camera.core.impl.Observable<androidx.camera.video.StreamInfo> Camera2StreamConfigurationMap = androidx.camera.core.impl.ConstantObservable.withValue(new androidx.camera.video.AutoValue_StreamInfo(0, androidx.camera.video.StreamInfo.StreamState.ACTIVE, null));

    enum StreamState {
        ACTIVE,
        INACTIVE
    }

    public abstract int getId();

    public abstract androidx.camera.core.SurfaceRequest.TransformationInfo getInProgressTransformationInfo();

    public abstract androidx.camera.video.StreamInfo.StreamState getStreamState();

    StreamInfo() {
    }

    static androidx.camera.video.StreamInfo getHighSpeedVideoFpsRangesFor(int i, androidx.camera.video.StreamInfo.StreamState streamState) {
        return new androidx.camera.video.AutoValue_StreamInfo(i, streamState, null);
    }

    static androidx.camera.video.StreamInfo getHighSpeedVideoFpsRanges(int i, androidx.camera.video.StreamInfo.StreamState streamState, androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
        return new androidx.camera.video.AutoValue_StreamInfo(i, streamState, transformationInfo);
    }
}
