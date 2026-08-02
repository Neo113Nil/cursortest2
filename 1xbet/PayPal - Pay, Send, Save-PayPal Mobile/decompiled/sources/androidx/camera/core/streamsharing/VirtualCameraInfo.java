package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
public class VirtualCameraInfo extends androidx.camera.core.impl.ForwardingCameraInfo {
    int getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    VirtualCameraInfo(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        super(cameraInfoInternal);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("virtual-");
        sb.append(cameraInfoInternal.getCameraId());
        sb.append("-");
        sb.append(java.util.UUID.randomUUID().toString());
        this.getHighSpeedVideoSizes = sb.toString();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public java.lang.String getCameraId() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i) {
        return androidx.camera.core.impl.utils.TransformUtils.within360(super.getSensorRotationDegrees(i) - this.getHighSpeedVideoFpsRangesFor);
    }
}
