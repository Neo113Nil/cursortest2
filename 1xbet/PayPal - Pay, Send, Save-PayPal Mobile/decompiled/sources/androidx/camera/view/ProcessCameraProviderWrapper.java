package androidx.camera.view;

/* loaded from: classes6.dex */
interface ProcessCameraProviderWrapper {
    androidx.camera.core.Camera Camera2StreamConfigurationMap(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.SessionConfig sessionConfig);

    void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.SessionConfig sessionConfig);

    void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.UseCase... useCaseArr);

    androidx.camera.core.Camera getHighSpeedVideoFpsRanges(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup);

    androidx.camera.core.CameraInfo getHighSpeedVideoFpsRanges(androidx.camera.core.CameraSelector cameraSelector);

    void getHighSpeedVideoSizes();

    boolean getHighSpeedVideoSizes(androidx.camera.core.CameraSelector cameraSelector) throws androidx.camera.core.CameraInfoUnavailableException;
}
