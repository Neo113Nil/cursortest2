package androidx.camera.view;

/* loaded from: classes6.dex */
public final class LifecycleCameraController extends androidx.camera.view.CameraController {
    private androidx.view.LifecycleOwner kernelVersion;

    public LifecycleCameraController(android.content.Context context) {
        super(context);
    }

    public final void bindToLifecycle(androidx.view.LifecycleOwner lifecycleOwner) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.kernelVersion = lifecycleOwner;
        getHighSpeedVideoSizes();
    }

    public final void unbind() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.kernelVersion = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
        }
    }

    @Override // androidx.camera.view.CameraController
    final androidx.camera.core.Camera getHighResolutionOutputSizeshNQ4ISI() {
        if (this.kernelVersion == null || this.getHighResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        try {
            androidx.camera.core.SessionConfig boundSessionConfig = getBoundSessionConfig();
            if (boundSessionConfig != null) {
                return this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(this.kernelVersion, this.Camera2StreamConfigurationMap, boundSessionConfig);
            }
            androidx.camera.core.UseCaseGroup createUseCaseGroup = createUseCaseGroup(true);
            if (createUseCaseGroup == null) {
                return null;
            }
            return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.kernelVersion, this.Camera2StreamConfigurationMap, createUseCaseGroup);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.lang.IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
        }
    }
}
