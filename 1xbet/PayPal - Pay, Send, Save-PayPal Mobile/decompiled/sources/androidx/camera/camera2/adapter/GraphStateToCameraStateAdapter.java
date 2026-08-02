package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u00138\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "Landroidx/camera/camera2/pipe/GraphStateListener;", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "cameraStateAdapter", "<init>", "(Landroidx/camera/camera2/adapter/CameraStateAdapter;)V", "", "onGraphStarting", "()V", "onGraphStarted", "onGraphStopping", "onGraphStopped", "Landroidx/camera/camera2/pipe/GraphState$GraphStateError;", "graphStateError", "onGraphError", "(Landroidx/camera/camera2/pipe/GraphState$GraphStateError;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "Landroidx/camera/camera2/pipe/CameraGraph;", "getCameraGraph", "()Landroidx/camera/camera2/pipe/CameraGraph;", "setCameraGraph", "(Landroidx/camera/camera2/pipe/CameraGraph;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphStateToCameraStateAdapter implements androidx.camera.camera2.pipe.GraphStateListener {
    public androidx.camera.camera2.pipe.CameraGraph cameraGraph;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.CameraStateAdapter Camera2StreamConfigurationMap;

    public GraphStateToCameraStateAdapter(androidx.camera.camera2.adapter.CameraStateAdapter cameraStateAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraStateAdapter, "");
        this.Camera2StreamConfigurationMap = cameraStateAdapter;
    }

    public final androidx.camera.camera2.pipe.CameraGraph getCameraGraph() {
        androidx.camera.camera2.pipe.CameraGraph cameraGraph = this.cameraGraph;
        if (cameraGraph != null) {
            return cameraGraph;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setCameraGraph(androidx.camera.camera2.pipe.CameraGraph cameraGraph) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraph, "");
        this.cameraGraph = cameraGraph;
    }

    @Override // androidx.camera.camera2.pipe.GraphStateListener
    public final void onGraphStarting() {
        this.Camera2StreamConfigurationMap.onGraphStateUpdated(getCameraGraph(), androidx.camera.camera2.pipe.GraphState.GraphStateStarting.INSTANCE);
    }

    @Override // androidx.camera.camera2.pipe.GraphStateListener
    public final void onGraphStarted() {
        this.Camera2StreamConfigurationMap.onGraphStateUpdated(getCameraGraph(), androidx.camera.camera2.pipe.GraphState.GraphStateStarted.INSTANCE);
    }

    @Override // androidx.camera.camera2.pipe.GraphStateListener
    public final void onGraphStopping() {
        this.Camera2StreamConfigurationMap.onGraphStateUpdated(getCameraGraph(), androidx.camera.camera2.pipe.GraphState.GraphStateStopping.INSTANCE);
    }

    @Override // androidx.camera.camera2.pipe.GraphStateListener
    public final void onGraphStopped() {
        this.Camera2StreamConfigurationMap.onGraphStateUpdated(getCameraGraph(), androidx.camera.camera2.pipe.GraphState.GraphStateStopped.INSTANCE);
    }

    @Override // androidx.camera.camera2.pipe.GraphStateListener
    public final void onGraphError(androidx.camera.camera2.pipe.GraphState.GraphStateError graphStateError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphStateError, "");
        this.Camera2StreamConfigurationMap.onGraphStateUpdated(getCameraGraph(), graphStateError);
    }
}
