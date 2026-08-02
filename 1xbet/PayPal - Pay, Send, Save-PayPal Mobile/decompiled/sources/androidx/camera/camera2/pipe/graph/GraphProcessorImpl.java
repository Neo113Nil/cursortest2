package androidx.camera.camera2.pipe.graph;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BF\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0013\b\u0001\u0010\u000e\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u0019\u0010\u001b\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0016¢\u0006\u0004\b$\u0010'J#\u0010+\u001a\u00020#2\u0012\u0010*\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010)0(H\u0016¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\u00020\u00132\u0012\u0010*\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010)0(H\u0016¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u00020\u00132\u0012\u0010*\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010)0(H\u0016¢\u0006\u0004\b/\u0010.J\u001d\u00101\u001a\u00020\u00132\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u0010\u0015J\u000f\u00104\u001a\u00020\u0013H\u0016¢\u0006\u0004\b4\u0010\u0015J\u000f\u00105\u001a\u00020\u0013H\u0016¢\u0006\u0004\b5\u0010\u0015J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020B0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010CR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020E0G8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR(\u0010P\u001a\u0004\u0018\u00010!2\b\u0010K\u001a\u0004\u0018\u00010!8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphProcessorImpl;", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphId", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "cameraGraphConfig", "Landroidx/camera/camera2/pipe/graph/Listener3A;", "graphListener3A", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "Lkotlin/jvm/JvmSuppressWildcards;", "graphListeners", "Landroidx/camera/camera2/pipe/compat/Camera2Quirks;", "camera2Quirks", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraGraphId;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/Listener3A;Ljava/util/List;Landroidx/camera/camera2/pipe/compat/Camera2Quirks;)V", "", "onGraphStarting", "()V", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "requestProcessor", "onGraphStarted", "(Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;)V", "onGraphStopping", "onGraphStopped", "onGraphModified", "Landroidx/camera/camera2/pipe/GraphState$GraphStateError;", "graphStateError", "onGraphError", "(Landroidx/camera/camera2/pipe/GraphState$GraphStateError;)V", "Landroidx/camera/camera2/pipe/Request;", "request", "", "submit", "(Landroidx/camera/camera2/pipe/Request;)Z", "requests", "(Ljava/util/List;)Z", "", "", "parameters", "trigger", "(Ljava/util/Map;)Z", "updateGraphParameters", "(Ljava/util/Map;)V", "update3AParameters", "listeners", "updateRequestListeners", "(Ljava/util/List;)V", "invalidate", "abort", "close", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/CameraGraphId;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/graph/GraphLoop;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/graph/GraphLoop;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/GraphStateListener;", "Ljava/util/List;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/camera/camera2/pipe/GraphState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getGraphState", "()Lkotlinx/coroutines/flow/StateFlow;", "graphState", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRepeatingRequest", "()Landroidx/camera/camera2/pipe/Request;", "setRepeatingRequest", "(Landroidx/camera/camera2/pipe/Request;)V", "repeatingRequest"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphProcessorImpl implements androidx.camera.camera2.pipe.graph.GraphProcessor, androidx.camera.camera2.pipe.graph.GraphListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.GraphLoop getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.camera2.pipe.GraphStateListener> Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.pipe.CameraGraphId getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.camera.camera2.pipe.GraphState> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraph.Config getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GraphProcessorImpl(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraphId cameraGraphId, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.Listener3A listener3A, @androidx.camera.camera2.pipe.config.ForCameraGraph java.util.List<androidx.camera.camera2.pipe.Request.Listener> list, androidx.camera.camera2.pipe.compat.Camera2Quirks camera2Quirks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener3A, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera2Quirks, "");
        this.getHighSpeedVideoFpsRanges = cameraGraphId;
        this.getHighSpeedVideoFpsRangesFor = config;
        this.Camera2StreamConfigurationMap = config.getGraphStateListeners();
        java.util.Map<?, java.lang.Object> defaultParameters = config.getDefaultParameters();
        java.util.Map<?, java.lang.Object> requiredParameters = config.getRequiredParameters();
        java.lang.Object obj = defaultParameters.get(androidx.camera.camera2.pipe.compat.CameraPipeKeys.INSTANCE.getIgnore3ARequiredParameters());
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if ((kotlin.jvm.internal.Intrinsics.areEqual(obj, bool) || kotlin.jvm.internal.Intrinsics.areEqual(requiredParameters.get(androidx.camera.camera2.pipe.compat.CameraPipeKeys.INSTANCE.getIgnore3ARequiredParameters()), bool)) && androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE()) {
            androidx.camera.camera2.pipe.compat.CameraPipeKeys.INSTANCE.getIgnore3ARequiredParameters();
        }
        int repeatingRequestFrameCountForCapture$camera_camera2_pipe = camera2Quirks.getRepeatingRequestFrameCountForCapture$camera_camera2_pipe(config.getFlags());
        androidx.camera.camera2.pipe.graph.CaptureLimiter captureLimiter = repeatingRequestFrameCountForCapture$camera_camera2_pipe != 0 ? new androidx.camera.camera2.pipe.graph.CaptureLimiter(repeatingRequestFrameCountForCapture$camera_camera2_pipe) : null;
        androidx.camera.camera2.pipe.graph.GraphLoop graphLoop = new androidx.camera.camera2.pipe.graph.GraphLoop(cameraGraphId, defaultParameters, requiredParameters, kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull(captureLimiter)), kotlin.collections.CollectionsKt.listOfNotNull(listener3A, captureLimiter), threads.getCameraPipeScope(), threads.getLightweightDispatcher());
        this.getHighResolutionOutputSizeshNQ4ISI = graphLoop;
        if (captureLimiter != null) {
            captureLimiter.setGraphLoop(graphLoop);
        }
        this.getHighSpeedVideoSizes = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(androidx.camera.camera2.pipe.GraphState.GraphStateStopped.INSTANCE);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final kotlinx.coroutines.flow.StateFlow<androidx.camera.camera2.pipe.GraphState> getGraphState() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final androidx.camera.camera2.pipe.Request getRepeatingRequest() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getRepeatingRequest();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final void setRepeatingRequest(androidx.camera.camera2.pipe.Request request) {
        this.getHighResolutionOutputSizeshNQ4ISI.setRepeatingRequest(request);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphStarting() {
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        this.getHighSpeedVideoSizes.setValue(androidx.camera.camera2.pipe.GraphState.GraphStateStarting.INSTANCE);
        java.util.Iterator<androidx.camera.camera2.pipe.GraphStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().onGraphStarting();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphStarted(androidx.camera.camera2.pipe.graph.GraphRequestProcessor requestProcessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestProcessor, "");
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        this.getHighSpeedVideoSizes.setValue(androidx.camera.camera2.pipe.GraphState.GraphStateStarted.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI.setRequestProcessor(requestProcessor);
        java.util.Iterator<androidx.camera.camera2.pipe.GraphStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().onGraphStarted();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphStopping() {
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        this.getHighSpeedVideoSizes.setValue(androidx.camera.camera2.pipe.GraphState.GraphStateStopping.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI.setRequestProcessor(null);
        java.util.Iterator<androidx.camera.camera2.pipe.GraphStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().onGraphStopping();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphStopped(androidx.camera.camera2.pipe.graph.GraphRequestProcessor requestProcessor) {
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        this.getHighSpeedVideoSizes.setValue(androidx.camera.camera2.pipe.GraphState.GraphStateStopped.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI.setRequestProcessor(null);
        java.util.Iterator<androidx.camera.camera2.pipe.GraphStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().onGraphStopped();
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphModified(androidx.camera.camera2.pipe.graph.GraphRequestProcessor requestProcessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestProcessor, "");
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        this.getHighResolutionOutputSizeshNQ4ISI.invalidate();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphListener
    public final void onGraphError(androidx.camera.camera2.pipe.GraphState.GraphStateError graphStateError) {
        androidx.camera.camera2.pipe.GraphState value;
        androidx.camera.camera2.pipe.GraphState.GraphStateStopped graphStateStopped;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphStateError, "");
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        kotlinx.coroutines.flow.MutableStateFlow<androidx.camera.camera2.pipe.GraphState> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            androidx.camera.camera2.pipe.GraphState graphState = value;
            if ((graphState instanceof androidx.camera.camera2.pipe.GraphState.GraphStateStopping) || (graphState instanceof androidx.camera.camera2.pipe.GraphState.GraphStateStopped)) {
                graphStateStopped = androidx.camera.camera2.pipe.GraphState.GraphStateStopped.INSTANCE;
            } else {
                graphStateStopped = graphStateError;
            }
        } while (!mutableStateFlow.compareAndSet(value, graphStateStopped));
        java.util.Iterator<androidx.camera.camera2.pipe.GraphStateListener> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().onGraphError(graphStateError);
        }
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final boolean submit(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return submit(kotlin.collections.CollectionsKt.listOf(request));
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final boolean submit(java.util.List<androidx.camera.camera2.pipe.Request> requests) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        java.util.Iterator<T> it = requests.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((androidx.camera.camera2.pipe.Request) obj).getInputRequest() != null) {
                break;
            }
        }
        androidx.camera.camera2.pipe.Request request = (androidx.camera.camera2.pipe.Request) obj;
        if (request != null && this.getHighSpeedVideoFpsRangesFor.getInput() == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot submit ");
            sb.append(request);
            sb.append(" with input request ");
            sb.append(request.getInputRequest());
            sb.append(" to ");
            sb.append(this);
            sb.append(" because CameraGraph was not configured to support reprocessing");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.submit(requests);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final boolean trigger(java.util.Map<?, ? extends java.lang.Object> parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.trigger(parameters);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final void updateGraphParameters(java.util.Map<?, ? extends java.lang.Object> parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setGraphParameters(parameters);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final void update3AParameters(java.util.Map<?, ? extends java.lang.Object> parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setGraph3AParameters(parameters);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final void updateRequestListeners(java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> listeners) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listeners, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setRequestListeners(listeners);
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final void invalidate() {
        this.getHighResolutionOutputSizeshNQ4ISI.invalidate();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final void abort() {
        this.getHighResolutionOutputSizeshNQ4ISI.abort();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphProcessor
    public final void close() {
        this.getHighResolutionOutputSizeshNQ4ISI.close();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphProcessor(cameraGraph: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }
}
