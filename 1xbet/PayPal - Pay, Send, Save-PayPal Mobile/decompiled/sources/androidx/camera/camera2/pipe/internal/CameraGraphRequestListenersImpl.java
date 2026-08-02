package androidx.camera.camera2.pipe.internal;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001b\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010&"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "Landroidx/camera/camera2/pipe/RequestListeners;", "Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "sessionLock", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "graphProcessor", "Lkotlinx/coroutines/CoroutineScope;", "graphScope", "<init>", "(Landroidx/camera/camera2/pipe/internal/GraphSessionLock;Landroidx/camera/camera2/pipe/graph/GraphProcessor;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/camera/camera2/pipe/Request$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Landroidx/camera/camera2/pipe/Request$Listener;)V", "", "listeners", "addAll", "(Ljava/util/List;)V", "remove", "removeAll", "fetchUpdatedListeners$camera_camera2_pipe", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "()V", "getOutputFormats", "Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "", "Ljava/lang/Object;", "", "Ljava/util/Set;", "", "Z", "getInputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraGraphRequestListenersImpl implements androidx.camera.camera2.pipe.RequestListeners {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.GraphProcessor getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<androidx.camera.camera2.pipe.Request.Listener> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.GraphSessionLock getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CameraGraphRequestListenersImpl(androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor, @androidx.camera.camera2.pipe.config.ForCameraGraph kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphSessionLock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRangesFor = graphSessionLock;
        this.getHighResolutionOutputSizeshNQ4ISI = graphProcessor;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.Camera2StreamConfigurationMap = new java.lang.Object();
        this.getHighSpeedVideoSizes = new java.util.LinkedHashSet();
    }

    @Override // androidx.camera.camera2.pipe.RequestListeners
    public final void add(androidx.camera.camera2.pipe.Request.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        addAll(kotlin.collections.CollectionsKt.listOf(listener));
    }

    @Override // androidx.camera.camera2.pipe.RequestListeners
    public final void addAll(java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> listeners) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listeners, "");
        synchronized (this.Camera2StreamConfigurationMap) {
            if (!this.getHighSpeedVideoSizes.addAll(listeners) || this.getInputFormats) {
                z = false;
            } else {
                z = true;
                this.getInputFormats = true;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    @Override // androidx.camera.camera2.pipe.RequestListeners
    public final void remove(androidx.camera.camera2.pipe.Request.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        removeAll(kotlin.collections.CollectionsKt.listOf(listener));
    }

    @Override // androidx.camera.camera2.pipe.RequestListeners
    public final void removeAll(java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> listeners) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listeners, "");
        synchronized (this.Camera2StreamConfigurationMap) {
            if (!this.getHighSpeedVideoSizes.removeAll(listeners) || this.getInputFormats) {
                z = false;
            } else {
                z = true;
                this.getInputFormats = true;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    public final java.util.List<androidx.camera.camera2.pipe.Request.Listener> fetchUpdatedListeners$camera_camera2_pipe() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (!this.getInputFormats) {
                return null;
            }
            this.getInputFormats = false;
            return kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoSizes);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        java.util.List<androidx.camera.camera2.pipe.Request.Listener> fetchUpdatedListeners$camera_camera2_pipe = fetchUpdatedListeners$camera_camera2_pipe();
        if (fetchUpdatedListeners$camera_camera2_pipe == null) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.withTokenIn$camera_camera2_pipe(this.getHighSpeedVideoFpsRanges, new androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl$applyUpdate$1(this, fetchUpdatedListeners$camera_camera2_pipe, null));
    }
}
