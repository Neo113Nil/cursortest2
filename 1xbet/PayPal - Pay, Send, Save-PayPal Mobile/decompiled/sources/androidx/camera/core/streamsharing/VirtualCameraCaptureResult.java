package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
public class VirtualCameraCaptureResult implements androidx.camera.core.impl.CameraCaptureResult {
    private final androidx.camera.core.impl.TagBundle getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.CameraCaptureResult getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizes;

    public VirtualCameraCaptureResult(androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        this(cameraCaptureResult, tagBundle, -1L);
    }

    public VirtualCameraCaptureResult(androidx.camera.core.impl.TagBundle tagBundle, long j) {
        this(null, tagBundle, j);
    }

    private VirtualCameraCaptureResult(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult, androidx.camera.core.impl.TagBundle tagBundle, long j) {
        this.getHighSpeedVideoFpsRangesFor = cameraCaptureResult;
        this.getHighResolutionOutputSizeshNQ4ISI = tagBundle;
        this.getHighSpeedVideoSizes = j;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AfMode getAfMode() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.getHighSpeedVideoFpsRangesFor;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfMode() : androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AfState getAfState() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.getHighSpeedVideoFpsRangesFor;
        return cameraCaptureResult != null ? cameraCaptureResult.getAfState() : androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AeState getAeState() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.getHighSpeedVideoFpsRangesFor;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeState() : androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AwbState getAwbState() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.getHighSpeedVideoFpsRangesFor;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbState() : androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.FlashState getFlashState() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.getHighSpeedVideoFpsRangesFor;
        return cameraCaptureResult != null ? cameraCaptureResult.getFlashState() : androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AeMode getAeMode() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.getHighSpeedVideoFpsRangesFor;
        return cameraCaptureResult != null ? cameraCaptureResult.getAeMode() : androidx.camera.core.impl.CameraCaptureMetaData.AeMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.CameraCaptureMetaData.AwbMode getAwbMode() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.getHighSpeedVideoFpsRangesFor;
        return cameraCaptureResult != null ? cameraCaptureResult.getAwbMode() : androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult = this.getHighSpeedVideoFpsRangesFor;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getTimestamp();
        }
        long j = this.getHighSpeedVideoSizes;
        if (j != -1) {
            return j;
        }
        throw new java.lang.IllegalStateException("No timestamp is available.");
    }
}
