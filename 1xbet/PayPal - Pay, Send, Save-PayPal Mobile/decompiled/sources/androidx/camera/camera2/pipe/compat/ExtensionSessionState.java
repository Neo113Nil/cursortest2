package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/compat/ExtensionSessionState;", "Landroidx/camera/camera2/pipe/compat/CameraExtensionSessionWrapper$StateCallback;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "captureSessionState", "<init>", "(Landroidx/camera/camera2/pipe/compat/CaptureSessionState;)V", "Landroidx/camera/camera2/pipe/compat/CameraExtensionSessionWrapper;", "session", "", "onConfigured", "(Landroidx/camera/camera2/pipe/compat/CameraExtensionSessionWrapper;)V", "onSessionDisconnected", "()V", "onSessionFinalized", "onConfigureFailed", "onClosed", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtensionSessionState implements androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper.StateCallback {
    private final androidx.camera.camera2.pipe.compat.CaptureSessionState getHighResolutionOutputSizeshNQ4ISI;

    public ExtensionSessionState(androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSessionState, "");
        this.getHighResolutionOutputSizeshNQ4ISI = captureSessionState;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper.StateCallback
    public final void onConfigured(androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onConfigured(session);
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public final void onSessionDisconnected() {
        this.getHighResolutionOutputSizeshNQ4ISI.onSessionDisconnected();
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public final void onSessionFinalized() {
        this.getHighResolutionOutputSizeshNQ4ISI.onSessionFinalized();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper.StateCallback
    public final void onConfigureFailed(androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onConfigureFailed(session);
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper.StateCallback
    public final void onClosed(androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onClosed(session);
    }
}
