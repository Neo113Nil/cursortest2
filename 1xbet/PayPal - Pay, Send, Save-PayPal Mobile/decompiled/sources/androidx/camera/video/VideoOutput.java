package androidx.camera.video;

/* loaded from: classes6.dex */
public interface VideoOutput {

    public enum SourceState {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    default boolean isQualitySelectorDefault() {
        return true;
    }

    default void onSourceStateChanged(androidx.camera.video.VideoOutput.SourceState sourceState) {
    }

    void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest);

    default void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.core.impl.Timebase timebase, boolean z) {
        onSurfaceRequested(surfaceRequest);
    }

    default androidx.camera.core.impl.Observable<androidx.camera.video.StreamInfo> getStreamInfo() {
        return androidx.camera.video.StreamInfo.Camera2StreamConfigurationMap;
    }

    default androidx.camera.core.impl.Observable<androidx.camera.video.MediaSpec> getMediaSpec() {
        return androidx.camera.core.impl.ConstantObservable.withValue(null);
    }

    default androidx.camera.core.impl.Observable<java.lang.Boolean> isSourceStreamRequired() {
        return androidx.camera.core.impl.ConstantObservable.withValue(java.lang.Boolean.FALSE);
    }

    default androidx.camera.video.VideoCapabilities getMediaCapabilities(androidx.camera.core.CameraInfo cameraInfo, int i) {
        return androidx.camera.video.VideoCapabilities.EMPTY;
    }

    default androidx.camera.video.EncoderProfilesResolver getEncoderProfilesResolver(androidx.camera.core.CameraInfo cameraInfo, int i) {
        return androidx.camera.video.EncoderProfilesResolver.EMPTY;
    }
}
