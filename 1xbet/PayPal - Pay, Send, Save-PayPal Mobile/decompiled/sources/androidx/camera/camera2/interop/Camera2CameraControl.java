package androidx.camera.camera2.interop;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0001*B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010)\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010!8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010("}, d2 = {"Landroidx/camera/camera2/interop/Camera2CameraControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "p0", "Landroidx/camera/camera2/impl/UseCaseThreads;", "p1", "Landroidx/camera/camera2/impl/ComboRequestListener;", "p2", "<init>", "(Landroidx/camera/camera2/compat/Camera2CameraControlCompat;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;)V", "", "reset", "()V", "Landroidx/camera/camera2/interop/CaptureRequestOptions;", "bundle", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "setCaptureRequestOptions", "(Landroidx/camera/camera2/interop/CaptureRequestOptions;)Lcom/google/common/util/concurrent/ListenableFuture;", "addCaptureRequestOptions", "getCaptureRequestOptions", "()Landroidx/camera/camera2/interop/CaptureRequestOptions;", "clearCaptureRequestOptions", "()Lcom/google/common/util/concurrent/ListenableFuture;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/impl/UseCaseThreads;", "requestListener", "Landroidx/camera/camera2/impl/ComboRequestListener;", "getRequestListener$camera_camera2", "()Landroidx/camera/camera2/impl/ComboRequestListener;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Camera2CameraControl implements androidx.camera.camera2.impl.UseCaseCameraControl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.interop.Camera2CameraControl.Companion INSTANCE = new androidx.camera.camera2.interop.Camera2CameraControl.Companion(null);
    private androidx.camera.camera2.impl.UseCaseCameraRequestControl Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.impl.UseCaseThreads getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.Camera2CameraControlCompat getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.impl.ComboRequestListener requestListener;

    private Camera2CameraControl(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener) {
        this.getHighSpeedVideoFpsRanges = camera2CameraControlCompat;
        this.getHighSpeedVideoFpsRangesFor = useCaseThreads;
        this.requestListener = comboRequestListener;
    }

    /* renamed from: getRequestListener$camera_camera2, reason: from getter */
    public final androidx.camera.camera2.impl.ComboRequestListener getRequestListener() {
        return this.requestListener;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /* renamed from: getRequestControl, reason: from getter */
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getGetHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.Camera2StreamConfigurationMap = useCaseCameraRequestControl;
        if (useCaseCameraRequestControl != null) {
            this.requestListener.removeListener(this.getHighSpeedVideoFpsRanges);
            this.requestListener.addListener(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor.getSequentialExecutor());
            this.getHighSpeedVideoFpsRanges.applyAsync(useCaseCameraRequestControl, false);
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        this.getHighSpeedVideoFpsRanges.cancelCurrentTask();
        this.requestListener.removeListener(this.getHighSpeedVideoFpsRanges);
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setCaptureRequestOptions(androidx.camera.camera2.interop.CaptureRequestOptions bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.getHighSpeedVideoFpsRanges.clearRequestOption();
        this.getHighSpeedVideoFpsRanges.addRequestOption(bundle);
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.camera2.adapter.CoroutineAdaptersKt.asListenableFuture(androidx.camera.camera2.compat.Camera2CameraControlCompat.applyAsync$default(this.getHighSpeedVideoFpsRanges, getGetHighSpeedVideoFpsRangesFor(), false, 2, null), (java.lang.Object) "setCaptureRequestOptions"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> addCaptureRequestOptions(androidx.camera.camera2.interop.CaptureRequestOptions bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.getHighSpeedVideoFpsRanges.addRequestOption(bundle);
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.camera2.adapter.CoroutineAdaptersKt.asListenableFuture(androidx.camera.camera2.compat.Camera2CameraControlCompat.applyAsync$default(this.getHighSpeedVideoFpsRanges, getGetHighSpeedVideoFpsRangesFor(), false, 2, null), (java.lang.Object) "addCaptureRequestOptions"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    public final androidx.camera.camera2.interop.CaptureRequestOptions getCaptureRequestOptions() {
        return this.getHighSpeedVideoFpsRanges.getRequestOption();
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> clearCaptureRequestOptions() {
        this.getHighSpeedVideoFpsRanges.clearRequestOption();
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.camera2.adapter.CoroutineAdaptersKt.asListenableFuture(androidx.camera.camera2.compat.Camera2CameraControlCompat.applyAsync$default(this.getHighSpeedVideoFpsRanges, getGetHighSpeedVideoFpsRangesFor(), false, 2, null), (java.lang.Object) "clearCaptureRequestOptions"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/interop/Camera2CameraControl$Companion;", "", "<init>", "()V", "Landroidx/camera/core/CameraControl;", "cameraControl", "Landroidx/camera/camera2/interop/Camera2CameraControl;", "from", "(Landroidx/camera/core/CameraControl;)Landroidx/camera/camera2/interop/Camera2CameraControl;", "Landroidx/camera/camera2/compat/Camera2CameraControlCompat;", "compat", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/ComboRequestListener;", "requestListener", "create", "(Landroidx/camera/camera2/compat/Camera2CameraControlCompat;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;)Landroidx/camera/camera2/interop/Camera2CameraControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.camera2.interop.Camera2CameraControl from(androidx.camera.core.CameraControl cameraControl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraControl, "");
            androidx.camera.core.impl.CameraControlInternal implementation = ((androidx.camera.core.impl.CameraControlInternal) cameraControl).getImplementation();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(implementation, "");
            androidx.core.util.Preconditions.checkArgument(implementation instanceof androidx.camera.camera2.adapter.CameraControlAdapter, "CameraControl doesn't contain Camera2 implementation.");
            return ((androidx.camera.camera2.adapter.CameraControlAdapter) implementation).getCamera2cameraControl();
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.camera2.interop.Camera2CameraControl create(androidx.camera.camera2.compat.Camera2CameraControlCompat compat, androidx.camera.camera2.impl.UseCaseThreads threads, androidx.camera.camera2.impl.ComboRequestListener requestListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compat, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestListener, "");
            return new androidx.camera.camera2.interop.Camera2CameraControl(compat, threads, requestListener, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.interop.Camera2CameraControl from(androidx.camera.core.CameraControl cameraControl) {
        return INSTANCE.from(cameraControl);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.camera2.interop.Camera2CameraControl create(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener) {
        return INSTANCE.create(camera2CameraControlCompat, useCaseThreads, comboRequestListener);
    }

    public /* synthetic */ Camera2CameraControl(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(camera2CameraControlCompat, useCaseThreads, comboRequestListener);
    }
}
