package androidx.camera.core.impl.capability;

/* loaded from: classes6.dex */
public class PreviewCapabilitiesImpl implements androidx.camera.core.PreviewCapabilities {
    private boolean getHighSpeedVideoFpsRanges;

    private PreviewCapabilitiesImpl(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        this.getHighSpeedVideoFpsRanges = cameraInfoInternal.isPreviewStabilizationSupported();
    }

    public static androidx.camera.core.PreviewCapabilities from(androidx.camera.core.CameraInfo cameraInfo) {
        return new androidx.camera.core.impl.capability.PreviewCapabilitiesImpl((androidx.camera.core.impl.CameraInfoInternal) cameraInfo);
    }

    @Override // androidx.camera.core.PreviewCapabilities
    public boolean isStabilizationSupported() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
