package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidMHighSpeedSessionFactory;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "<init>", "(Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/core/Threads;)V", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDevice", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaces", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "captureSessionState", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "create", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Ljava/util/Map;Landroidx/camera/camera2/pipe/compat/CaptureSessionState;)Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/core/Threads;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidMHighSpeedSessionFactory implements androidx.camera.camera2.pipe.compat.CaptureSessionFactory {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Threads getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.StreamGraphImpl Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AndroidMHighSpeedSessionFactory(androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.core.Threads threads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        this.Camera2StreamConfigurationMap = streamGraphImpl;
        this.getHighSpeedVideoSizes = threads;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public final androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result create(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDevice, java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> surfaces, androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaces, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSessionState, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(surfaces.size());
        java.util.Iterator<java.util.Map.Entry<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface>> it = surfaces.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        if (cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, captureSessionState)) {
            return new androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success(kotlin.collections.MapsKt.emptyMap(), androidx.camera.camera2.pipe.compat.CaptureSessionFactoryKt.access$buildSimpleOutputSurfaceMap(surfaces, this.Camera2StreamConfigurationMap));
        }
        if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
            java.util.Objects.toString(cameraDevice);
            java.util.Objects.toString(captureSessionState);
        }
        captureSessionState.onSessionFinalized();
        return androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}
