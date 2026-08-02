package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
public class VirtualCameraControl extends androidx.camera.core.impl.ForwardingCameraControl {
    final androidx.camera.core.streamsharing.StreamSharing.Control Camera2StreamConfigurationMap;

    VirtualCameraControl(androidx.camera.core.impl.CameraControlInternal cameraControlInternal, androidx.camera.core.streamsharing.StreamSharing.Control control) {
        super(cameraControlInternal);
        this.Camera2StreamConfigurationMap = control;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptureRequests(final java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i, int i2) {
        androidx.core.util.Preconditions.checkArgument(list.size() == 1, "Only support one capture config.");
        final com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.imagecapture.CameraCapturePipeline> cameraCapturePipelineAsync = getCameraCapturePipelineAsync(i, 1);
        return androidx.camera.core.impl.utils.futures.Futures.allAsList(java.util.Collections.singletonList(androidx.camera.core.impl.utils.futures.FutureChain.from(cameraCapturePipelineAsync).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.core.streamsharing.VirtualCameraControl$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                com.google.common.util.concurrent.ListenableFuture invokePreCapture;
                invokePreCapture = ((androidx.camera.core.imagecapture.CameraCapturePipeline) com.google.common.util.concurrent.ListenableFuture.this.get()).invokePreCapture();
                return invokePreCapture;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.core.streamsharing.VirtualCameraControl$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                androidx.camera.core.streamsharing.VirtualCameraControl virtualCameraControl = androidx.camera.core.streamsharing.VirtualCameraControl.this;
                java.util.List list2 = list;
                return virtualCameraControl.Camera2StreamConfigurationMap.jpegSnapshot(((java.lang.Integer) java.util.Objects.requireNonNull((java.lang.Integer) ((androidx.camera.core.impl.CaptureConfig) list2.get(0)).getImplementationOptions().retrieveOption(androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY, 100))).intValue(), ((java.lang.Integer) java.util.Objects.requireNonNull((java.lang.Integer) ((androidx.camera.core.impl.CaptureConfig) list2.get(0)).getImplementationOptions().retrieveOption(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION, 0))).intValue());
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.core.streamsharing.VirtualCameraControl$$ExternalSyntheticLambda2
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                com.google.common.util.concurrent.ListenableFuture invokePostCapture;
                invokePostCapture = ((androidx.camera.core.imagecapture.CameraCapturePipeline) com.google.common.util.concurrent.ListenableFuture.this.get()).invokePostCapture();
                return invokePostCapture;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor())));
    }
}
