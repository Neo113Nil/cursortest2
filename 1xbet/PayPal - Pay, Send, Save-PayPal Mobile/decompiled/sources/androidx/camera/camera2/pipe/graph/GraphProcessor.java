package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH&¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000eH&¢\u0006\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010#\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "", "Landroidx/camera/camera2/pipe/Request;", "request", "", "submit", "(Landroidx/camera/camera2/pipe/Request;)Z", "", "requests", "(Ljava/util/List;)Z", "", "parameters", "trigger", "(Ljava/util/Map;)Z", "", "updateGraphParameters", "(Ljava/util/Map;)V", "update3AParameters", "Landroidx/camera/camera2/pipe/Request$Listener;", "listeners", "updateRequestListeners", "(Ljava/util/List;)V", "invalidate", "()V", "abort", "close", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/camera/camera2/pipe/GraphState;", "getGraphState", "()Lkotlinx/coroutines/flow/StateFlow;", "graphState", "getRepeatingRequest", "()Landroidx/camera/camera2/pipe/Request;", "setRepeatingRequest", "(Landroidx/camera/camera2/pipe/Request;)V", "repeatingRequest"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GraphProcessor {
    void abort();

    void close();

    kotlinx.coroutines.flow.StateFlow<androidx.camera.camera2.pipe.GraphState> getGraphState();

    androidx.camera.camera2.pipe.Request getRepeatingRequest();

    void invalidate();

    void setRepeatingRequest(androidx.camera.camera2.pipe.Request request);

    boolean submit(androidx.camera.camera2.pipe.Request request);

    boolean submit(java.util.List<androidx.camera.camera2.pipe.Request> requests);

    boolean trigger(java.util.Map<?, ? extends java.lang.Object> parameters);

    void update3AParameters(java.util.Map<?, ? extends java.lang.Object> parameters);

    void updateGraphParameters(java.util.Map<?, ? extends java.lang.Object> parameters);

    void updateRequestListeners(java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> listeners);
}
