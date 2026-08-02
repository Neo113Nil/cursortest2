package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/impl/CameraPipeCameraProperties;", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/camera2/config/CameraConfig;", "cameraConfig", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "<init>", "(Landroidx/camera/camera2/config/CameraConfig;Landroidx/camera/camera2/pipe/CameraMetadata;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/config/CameraConfig;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/CameraId;", "getCameraId-Dz_R5H8", "()Ljava/lang/String;", "cameraId", "metadata", "getMetadata", "()Landroidx/camera/camera2/pipe/CameraMetadata;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraPipeCameraProperties implements androidx.camera.camera2.impl.CameraProperties {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraMetadata getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.config.CameraConfig getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.camera2.pipe.CameraMetadata metadata;

    @javax.inject.Inject
    public CameraPipeCameraProperties(androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
        this.getHighSpeedVideoFpsRangesFor = cameraConfig;
        this.getHighSpeedVideoFpsRanges = cameraMetadata;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cameraMetadata);
        this.metadata = cameraMetadata;
    }

    @Override // androidx.camera.camera2.impl.CameraProperties
    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public final java.lang.String mo106getCameraIdDz_R5H8() {
        return this.getHighSpeedVideoFpsRangesFor.getCameraId();
    }

    @Override // androidx.camera.camera2.impl.CameraProperties
    public final androidx.camera.camera2.pipe.CameraMetadata getMetadata() {
        return this.metadata;
    }
}
