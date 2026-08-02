package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\t2\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001b\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J1\u0010\u001e\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0003J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/impl/RejectOperationCameraCaptureSession;", "Landroid/hardware/camera2/CameraCaptureSession;", "<init>", "()V", "Landroid/hardware/camera2/CameraDevice;", "getDevice", "()Landroid/hardware/camera2/CameraDevice;", "Landroid/view/Surface;", "surface", "", "prepare", "(Landroid/view/Surface;)V", "", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfigs", "finalizeOutputConfigurations", "(Ljava/util/List;)V", "Landroid/hardware/camera2/CaptureRequest;", "request", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/os/Handler;", "handler", "", "capture", "(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I", "requests", "captureBurst", "(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I", "setRepeatingRequest", "setRepeatingBurst", "stopRepeating", "abortCaptures", "", "isReprocessable", "()Z", "getInputSurface", "()Landroid/view/Surface;", "close"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RejectOperationCameraCaptureSession extends android.hardware.camera2.CameraCaptureSession {
    @Override // android.hardware.camera2.CameraCaptureSession
    public final android.hardware.camera2.CameraDevice getDevice() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("getDevice");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void prepare(android.view.Surface surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("prepare");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void finalizeOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> outputConfigs) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("finalizeOutputConfigurations");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int capture(android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener, android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("capture");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> requests, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener, android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("captureBurst");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingRequest(android.hardware.camera2.CaptureRequest request, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener, android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("setRepeatingRequest");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> requests, android.hardware.camera2.CameraCaptureSession.CaptureCallback listener, android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("setRepeatingBurst");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void stopRepeating() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("stopRepeating");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final void abortCaptures() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("abortCaptures");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final boolean isReprocessable() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("isReprocessable");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession
    public final android.view.Surface getInputSurface() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("getInputSurface");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // android.hardware.camera2.CameraCaptureSession, java.lang.AutoCloseable
    public final void close() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Current capture session is running on extensions mode which isn't allowed to invoke the ");
        sb.append("close");
        sb.append(" function!");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
