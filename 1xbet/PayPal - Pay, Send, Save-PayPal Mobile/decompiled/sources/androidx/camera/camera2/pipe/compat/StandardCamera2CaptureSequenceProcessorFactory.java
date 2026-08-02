package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJO\u0010\u0019\u001a\u0012\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Landroidx/camera/camera2/pipe/compat/StandardCamera2CaptureSequenceProcessorFactory;", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessorFactory;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "quirks", "Landroidx/camera/camera2/pipe/StrictMode;", "strictMode", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/compat/Camera2Quirks;Landroidx/camera/camera2/pipe/StrictMode;)V", "Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;", "session", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "streamToSurfaceMap", "Landroidx/camera/camera2/pipe/OutputId;", "outputToSurfaceMap", "Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;", "Landroidx/camera/camera2/pipe/CaptureSequence;", "", "create", "(Landroidx/camera/camera2/pipe/compat/CameraCaptureSessionWrapper;Ljava/util/Map;Ljava/util/Map;)Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/core/Threads;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/StrictMode;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StandardCamera2CaptureSequenceProcessorFactory implements androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory {
    private final androidx.camera.camera2.pipe.StrictMode Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.StreamGraphImpl getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraph.Config getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Threads getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.compat.Camera2Quirks getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public StandardCamera2CaptureSequenceProcessorFactory(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.compat.Camera2Quirks camera2Quirks, androidx.camera.camera2.pipe.StrictMode strictMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera2Quirks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strictMode, "");
        this.getHighSpeedVideoSizes = threads;
        this.getHighResolutionOutputSizeshNQ4ISI = config;
        this.getHighSpeedVideoFpsRangesFor = streamGraphImpl;
        this.getHighSpeedVideoFpsRanges = camera2Quirks;
        this.Camera2StreamConfigurationMap = strictMode;
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory
    public final androidx.camera.camera2.pipe.CaptureSequenceProcessor<?, androidx.camera.camera2.pipe.CaptureSequence<java.lang.Object>> create(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper session, java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> streamToSurfaceMap, java.util.Map<androidx.camera.camera2.pipe.OutputId, ? extends android.view.Surface> outputToSurfaceMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamToSurfaceMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputToSurfaceMap, "");
        return new androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor(session, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.m355getDefaultTemplatefGx8uWA(), streamToSurfaceMap, outputToSurfaceMap, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.shouldWaitForRepeatingRequestStartOnDisconnect$camera_camera2_pipe(this.getHighResolutionOutputSizeshNQ4ISI), null);
    }
}
