package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraAvailabilityMonitor;", "Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor;", "Ljavax/inject/Provider;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "<init>", "(Ljavax/inject/Provider;Landroidx/camera/camera2/pipe/core/Threads;Lkotlinx/coroutines/Job;)V", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor$Session;", "startMonitoring-0r8Bogc", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startMonitoring", "getHighSpeedVideoSizes", "Ljavax/inject/Provider;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/core/Threads;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2CameraAvailabilityMonitor implements androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Threads getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.CameraId> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final javax.inject.Provider<android.hardware.camera2.CameraManager> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public Camera2CameraAvailabilityMonitor(javax.inject.Provider<android.hardware.camera2.CameraManager> provider, androidx.camera.camera2.pipe.core.Threads threads, @androidx.camera.camera2.pipe.config.CameraPipeJob kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "");
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = threads;
        this.getHighSpeedVideoSizes = job;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1(this, null));
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor
    /* renamed from: startMonitoring-0r8Bogc, reason: not valid java name */
    public final java.lang.Object mo776startMonitoring0r8Bogc(java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor.Session> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2(this, str);
    }
}
