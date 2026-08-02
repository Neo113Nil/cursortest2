package androidx.camera.core;

/* loaded from: classes6.dex */
public class ConcurrentCamera {
    private java.util.List<androidx.camera.core.Camera> getHighResolutionOutputSizeshNQ4ISI;

    public ConcurrentCamera(java.util.List<androidx.camera.core.Camera> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    public java.util.List<androidx.camera.core.Camera> getCameras() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final class SingleCameraConfig {
        private androidx.view.LifecycleOwner Camera2StreamConfigurationMap;
        private androidx.camera.core.CompositionSettings getHighResolutionOutputSizeshNQ4ISI;
        private androidx.camera.core.UseCaseGroup getHighSpeedVideoFpsRanges;
        private androidx.camera.core.CameraSelector getHighSpeedVideoFpsRangesFor;

        public SingleCameraConfig(androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup, androidx.view.LifecycleOwner lifecycleOwner) {
            this(cameraSelector, useCaseGroup, androidx.camera.core.CompositionSettings.DEFAULT, lifecycleOwner);
        }

        public SingleCameraConfig(androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup, androidx.camera.core.CompositionSettings compositionSettings, androidx.view.LifecycleOwner lifecycleOwner) {
            this.getHighSpeedVideoFpsRangesFor = cameraSelector;
            this.getHighSpeedVideoFpsRanges = useCaseGroup;
            this.getHighResolutionOutputSizeshNQ4ISI = compositionSettings;
            this.Camera2StreamConfigurationMap = lifecycleOwner;
        }

        public final androidx.camera.core.CameraSelector getCameraSelector() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final androidx.view.LifecycleOwner getLifecycleOwner() {
            return this.Camera2StreamConfigurationMap;
        }

        public final androidx.camera.core.UseCaseGroup getUseCaseGroup() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final androidx.camera.core.CompositionSettings getCompositionSettings() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
