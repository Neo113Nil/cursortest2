package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidNSessionFactory;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/CameraGraph$Config;)V", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDevice", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaces", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "captureSessionState", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "create", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Ljava/util/Map;Landroidx/camera/camera2/pipe/compat/CaptureSessionState;)Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/core/Threads;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidNSessionFactory implements androidx.camera.camera2.pipe.compat.CaptureSessionFactory {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraph.Config getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Threads getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.StreamGraphImpl Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AndroidNSessionFactory(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.CameraGraph.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoFpsRanges = threads;
        this.Camera2StreamConfigurationMap = streamGraphImpl;
        this.getHighSpeedVideoFpsRangesFor = config;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public final androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result create(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDevice, java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> surfaces, androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState) {
        boolean createReprocessableCaptureSessionByConfigurations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaces, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSessionState, "");
        androidx.camera.camera2.pipe.compat.OutputConfigurations buildOutputConfigurations = androidx.camera.camera2.pipe.compat.CaptureSessionFactoryKt.buildOutputConfigurations(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, surfaces);
        if (!buildOutputConfigurations.getAll().isEmpty()) {
            if (this.getHighSpeedVideoFpsRangesFor.getInput() == null) {
                createReprocessableCaptureSessionByConfigurations = cameraDevice.createCaptureSessionByOutputConfigurations(buildOutputConfigurations.getAll(), captureSessionState);
            } else {
                androidx.camera.camera2.pipe.OutputStream.Config config = (androidx.camera.camera2.pipe.OutputStream.Config) kotlin.collections.CollectionsKt.single((java.util.List) ((androidx.camera.camera2.pipe.InputStream.Config) kotlin.collections.CollectionsKt.single((java.util.List) this.getHighSpeedVideoFpsRangesFor.getInput())).getStream().getOutputs());
                createReprocessableCaptureSessionByConfigurations = cameraDevice.createReprocessableCaptureSessionByConfigurations(new androidx.camera.camera2.pipe.compat.InputConfigData(config.getSize().getWidth(), config.getSize().getHeight(), config.getFormat()), buildOutputConfigurations.getAll(), captureSessionState);
            }
            if (createReprocessableCaptureSessionByConfigurations) {
                return new androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success(kotlin.collections.MapsKt.emptyMap(), buildOutputConfigurations.getOutputSurfaceMap());
            }
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                java.util.Objects.toString(cameraDevice);
                java.util.Objects.toString(captureSessionState);
            }
            captureSessionState.onSessionFinalized();
            return androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed.INSTANCE;
        }
        if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
            androidx.camera.camera2.pipe.CameraGraph.Config unused = this.getHighSpeedVideoFpsRangesFor;
        }
        captureSessionState.onSessionFinalized();
        return androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}
