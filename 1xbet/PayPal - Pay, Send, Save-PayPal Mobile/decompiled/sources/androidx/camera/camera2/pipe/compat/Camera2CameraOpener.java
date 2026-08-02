package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraOpener;", "Landroidx/camera/camera2/pipe/compat/CameraOpener;", "Ljavax/inject/Provider;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "<init>", "(Ljavax/inject/Provider;Landroidx/camera/camera2/pipe/core/Threads;)V", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "stateCallback", "", "openCamera-RzXb1QE", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openCamera", "Camera2StreamConfigurationMap", "Ljavax/inject/Provider;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/core/Threads;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2CameraOpener implements androidx.camera.camera2.pipe.compat.CameraOpener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final javax.inject.Provider<android.hardware.camera2.CameraManager> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Threads getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public Camera2CameraOpener(javax.inject.Provider<android.hardware.camera2.CameraManager> provider, androidx.camera.camera2.pipe.core.Threads threads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = threads;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraOpener
    /* renamed from: openCamera-RzXb1QE, reason: not valid java name */
    public final java.lang.Object mo782openCameraRzXb1QE(java.lang.String str, android.hardware.camera2.CameraDevice.StateCallback stateCallback, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        android.hardware.camera2.CameraManager cameraManager = this.getHighResolutionOutputSizeshNQ4ISI.get();
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str));
        sb.append("#openCamera");
        try {
            android.os.Trace.beginSection(sb.toString());
            if (android.os.Build.VERSION.SDK_INT < 28) {
                cameraManager.openCamera(str, stateCallback, this.getHighSpeedVideoFpsRangesFor.getCamera2Handler());
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(cameraManager);
                androidx.camera.camera2.pipe.compat.Api28Compat.openCamera(cameraManager, str, this.getHighSpeedVideoFpsRangesFor.getCamera2Executor(), stateCallback);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            android.os.Trace.endSection();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }
}
