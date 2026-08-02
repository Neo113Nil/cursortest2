package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0015H&¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CaptureCallback;", "", "Landroid/hardware/camera2/CaptureRequest;", "captureRequest", "", "captureFrameNumber", "captureTimestamp", "", "onCaptureStarted", "(Landroid/hardware/camera2/CaptureRequest;JJ)V", "Landroid/hardware/camera2/CaptureResult;", "partialCaptureResult", "onCaptureProgressed", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V", "Landroid/hardware/camera2/TotalCaptureResult;", "captureResult", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "onCaptureCompleted-rmrZIYk", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;J)V", "onCaptureCompleted", "", "progress", "onCaptureProcessProgressed", "(Landroid/hardware/camera2/CaptureRequest;I)V", "onCaptureFailed-RuT0dZU", "(Landroid/hardware/camera2/CaptureRequest;J)V", "onCaptureFailed", "captureSequenceId", "onCaptureSequenceCompleted", "(IJ)V", "onCaptureSequenceAborted", "(I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Camera2CaptureCallback {
    /* renamed from: onCaptureCompleted-rmrZIYk, reason: not valid java name */
    void mo783onCaptureCompletedrmrZIYk(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult captureResult, long frameNumber);

    /* renamed from: onCaptureFailed-RuT0dZU, reason: not valid java name */
    void mo784onCaptureFailedRuT0dZU(android.hardware.camera2.CaptureRequest captureRequest, long frameNumber);

    void onCaptureProcessProgressed(android.hardware.camera2.CaptureRequest captureRequest, int progress);

    void onCaptureProgressed(android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.CaptureResult partialCaptureResult);

    void onCaptureSequenceAborted(int captureSequenceId);

    void onCaptureSequenceCompleted(int captureSequenceId, long captureFrameNumber);

    void onCaptureStarted(android.hardware.camera2.CaptureRequest captureRequest, long captureFrameNumber, long captureTimestamp);
}
