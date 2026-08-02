package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/camera/camera2/pipe/compat/NoOpGraphListener;", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "<init>", "()V", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "requestProcessor", "", "onGraphStarted", "(Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;)V", "onGraphStopped", "onGraphModified", "Landroidx/camera/camera2/pipe/GraphState$GraphStateError;", "graphStateError", "onGraphError", "(Landroidx/camera/camera2/pipe/GraphState$GraphStateError;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoOpGraphListener implements androidx.camera.camera2.pipe.graph.GraphListener {
    public static final androidx.camera.camera2.pipe.compat.NoOpGraphListener INSTANCE = new androidx.camera.camera2.pipe.compat.NoOpGraphListener();

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphStopped(androidx.camera.camera2.pipe.graph.GraphRequestProcessor requestProcessor) {
    }

    private NoOpGraphListener() {
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphStarted(androidx.camera.camera2.pipe.graph.GraphRequestProcessor requestProcessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestProcessor, "");
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphModified(androidx.camera.camera2.pipe.graph.GraphRequestProcessor requestProcessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestProcessor, "");
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphError(androidx.camera.camera2.pipe.GraphState.GraphStateError graphStateError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphStateError, "");
    }
}
