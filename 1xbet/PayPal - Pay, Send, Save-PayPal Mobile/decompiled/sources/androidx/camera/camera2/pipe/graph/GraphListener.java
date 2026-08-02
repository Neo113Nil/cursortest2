package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphListener;", "", "", "onGraphStarting", "()V", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "requestProcessor", "onGraphStarted", "(Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;)V", "onGraphStopping", "onGraphStopped", "onGraphModified", "Landroidx/camera/camera2/pipe/GraphState$GraphStateError;", "graphStateError", "onGraphError", "(Landroidx/camera/camera2/pipe/GraphState$GraphStateError;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GraphListener {
    void onGraphError(androidx.camera.camera2.pipe.GraphState.GraphStateError graphStateError);

    void onGraphModified(androidx.camera.camera2.pipe.graph.GraphRequestProcessor requestProcessor);

    void onGraphStarted(androidx.camera.camera2.pipe.graph.GraphRequestProcessor requestProcessor);

    default void onGraphStarting() {
    }

    void onGraphStopped(androidx.camera.camera2.pipe.graph.GraphRequestProcessor requestProcessor);

    default void onGraphStopping() {
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onGraphStarting(androidx.camera.camera2.pipe.graph.GraphListener graphListener) {
            androidx.camera.camera2.pipe.graph.GraphListener.super.onGraphStarting();
        }

        @java.lang.Deprecated
        public static void onGraphStopping(androidx.camera.camera2.pipe.graph.GraphListener graphListener) {
            androidx.camera.camera2.pipe.graph.GraphListener.super.onGraphStopping();
        }
    }
}
