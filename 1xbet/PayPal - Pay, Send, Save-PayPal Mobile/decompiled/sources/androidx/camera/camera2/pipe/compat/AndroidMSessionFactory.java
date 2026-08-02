package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidMSessionFactory;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/CameraGraph$Config;)V", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDevice", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaces", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "captureSessionState", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "create", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Ljava/util/Map;Landroidx/camera/camera2/pipe/compat/CaptureSessionState;)Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/core/Threads;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidMSessionFactory implements androidx.camera.camera2.pipe.compat.CaptureSessionFactory {
    private final androidx.camera.camera2.pipe.graph.StreamGraphImpl Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraph.Config getHighSpeedVideoSizes;
    private final androidx.camera.camera2.pipe.core.Threads getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AndroidMSessionFactory(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.CameraGraph.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoFpsRangesFor = threads;
        this.Camera2StreamConfigurationMap = streamGraphImpl;
        this.getHighSpeedVideoSizes = config;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public final androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result create(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDevice, java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> surfaces, androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaces, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSessionState, "");
        if (this.getHighSpeedVideoSizes.getInput() != null) {
            androidx.camera.camera2.pipe.OutputStream.Config config = (androidx.camera.camera2.pipe.OutputStream.Config) kotlin.collections.CollectionsKt.single((java.util.List) ((androidx.camera.camera2.pipe.InputStream.Config) kotlin.collections.CollectionsKt.single((java.util.List) this.getHighSpeedVideoSizes.getInput())).getStream().getOutputs());
            android.hardware.camera2.params.InputConfiguration inputConfiguration = new android.hardware.camera2.params.InputConfiguration(config.getSize().getWidth(), config.getSize().getHeight(), config.getFormat());
            java.util.ArrayList arrayList = new java.util.ArrayList(surfaces.size());
            java.util.Iterator<java.util.Map.Entry<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface>> it = surfaces.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            if (!cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, captureSessionState)) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    java.util.Objects.toString(cameraDevice);
                    java.util.Objects.toString(captureSessionState);
                }
                captureSessionState.onSessionFinalized();
                return androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed.INSTANCE;
            }
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(surfaces.size());
            java.util.Iterator<java.util.Map.Entry<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface>> it2 = surfaces.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getValue());
            }
            if (!cameraDevice.createCaptureSession(arrayList2, captureSessionState)) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    java.util.Objects.toString(cameraDevice);
                    java.util.Objects.toString(captureSessionState);
                }
                captureSessionState.onSessionFinalized();
                return androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed.INSTANCE;
            }
        }
        return new androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success(kotlin.collections.MapsKt.emptyMap(), androidx.camera.camera2.pipe.compat.CaptureSessionFactoryKt.access$buildSimpleOutputSurfaceMap(surfaces, this.Camera2StreamConfigurationMap));
    }
}
