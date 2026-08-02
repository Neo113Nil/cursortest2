package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 u2\u00020\u0001:\u0002vuBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b\u0016\u0010\u0019J!\u0010\u001b\u001a\u00020\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\u001fJ5\u0010*\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J-\u0010*\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020,H\u0002¢\u0006\u0004\b*\u0010-J-\u0010.\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010/J.\u00101\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u000200H\u0082@¢\u0006\u0004\b1\u00102J\u001e\u00103\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0082@¢\u0006\u0004\b3\u00104J\u000f\u00101\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u00105J\u001d\u00101\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0002¢\u0006\u0004\b1\u00106J9\u00107\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0012\u0010(\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010.\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u00107\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010AR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010E\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010<\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020#0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010QR\u0018\u0010>\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010SR\"\u0010T\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010?R\"\u0010U\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010?R\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010AR(\u0010\\\u001a\u0004\u0018\u00010P2\b\u0010W\u001a\u0004\u0018\u00010P8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R(\u0010a\u001a\u0004\u0018\u00010\u00132\b\u0010W\u001a\u0004\u0018\u00010\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R<\u0010f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010W\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR<\u0010i\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0012\u0010W\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR0\u0010m\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0\b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u00106R\u0014\u0010:\u001a\u00020n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010oR$\u0010s\u001a\u00020\u00152\u0006\u0010W\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u00105\"\u0004\bq\u0010rR\u0018\u0010F\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010SR\"\u0010H\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010?R\"\u0010K\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010?R\"\u0010B\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010?R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010AR\u0018\u0010t\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010Q"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphLoop;", "Ljava/io/Closeable;", "Landroidx/camera/camera2/pipe/CameraGraphId;", "cameraGraphId", "", "", "defaultParameters", "requiredParameters", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "requiredListeners", "Landroidx/camera/camera2/pipe/graph/GraphLoop$Listener;", "listeners", "Lkotlinx/coroutines/CoroutineScope;", "shutdownScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraphId;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/camera/camera2/pipe/Request;", "request", "", "submit", "(Landroidx/camera/camera2/pipe/Request;)Z", "requests", "(Ljava/util/List;)Z", "parameters", "trigger", "(Ljava/util/Map;)Z", "", "abort", "()V", "invalidate", "close", "", "Landroidx/camera/camera2/pipe/graph/GraphCommand;", "p0", "", "p1", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Capture;", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;ILandroidx/camera/camera2/pipe/graph/GraphCommand$Capture;Z)V", "Landroidx/camera/camera2/pipe/graph/GraphCommand$Trigger;", "(Ljava/util/List;ILandroidx/camera/camera2/pipe/graph/GraphCommand$Trigger;)V", "Camera2StreamConfigurationMap", "(Ljava/util/List;IZ)V", "Landroidx/camera/camera2/pipe/graph/GraphCommand$RequestProcessor;", "getHighSpeedVideoSizes", "(Ljava/util/List;ILandroidx/camera/camera2/pipe/graph/GraphCommand$RequestProcessor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "()Z", "(Ljava/util/List;)V", "getHighSpeedVideoFpsRanges", "(ZLjava/util/List;Ljava/util/Map;)Z", "", "toString", "()Ljava/lang/String;", "getOutputFormats", "Landroidx/camera/camera2/pipe/CameraGraphId;", "getOutputMinFrameDurationlomOqCM", "Ljava/util/Map;", "ArtificialStackFrames", "Ljava/util/List;", "unwrapAs", "coroutineCreation", "Lkotlinx/coroutines/CoroutineScope;", "getInputFormats", "getValidOutputFormatsForInputhNQ4ISI", "Landroidx/camera/camera2/pipe/core/ProcessingQueue;", "isOutputSupportedForhNQ4ISI", "Landroidx/camera/camera2/pipe/core/ProcessingQueue;", "getInputSizeshNQ4ISI", "isOutputSupportedFor", "Ljava/lang/Object;", "getOutputMinFrameDuration", "Z", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "getOutputStallDurationlomOqCM", "Landroidx/camera/camera2/pipe/Request;", "getOutputStallDuration", "getOutputSizes", "getOutputSizeshNQ4ISI", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRequestProcessor", "()Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "setRequestProcessor", "(Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;)V", "requestProcessor", "getRepeatingRequest", "()Landroidx/camera/camera2/pipe/Request;", "setRepeatingRequest", "(Landroidx/camera/camera2/pipe/Request;)V", "repeatingRequest", "getGraphParameters", "()Ljava/util/Map;", "setGraphParameters", "(Ljava/util/Map;)V", "graphParameters", "getGraph3AParameters", "setGraph3AParameters", "graph3AParameters", "getRequestListeners", "()Ljava/util/List;", "setRequestListeners", "requestListeners", "Lkotlinx/atomicfu/AtomicBoolean;", "Lkotlinx/atomicfu/AtomicBoolean;", "getCaptureProcessingEnabled", "setCaptureProcessingEnabled", "(Z)V", "captureProcessingEnabled", "coroutineBoundary", "Companion", "Listener"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphLoop implements java.io.Closeable {

    /* renamed from: ArtificialStackFrames, reason: from kotlin metadata */
    private final java.util.Map<?, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean toString;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> getOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.Map<?, ? extends java.lang.Object> getOutputSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.Request getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.Map<?, ? extends java.lang.Object> getOutputStallDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.graph.GraphRequestProcessor getOutputStallDurationlomOqCM;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private volatile boolean getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.Map<?, ? extends java.lang.Object> isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraphId getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private java.util.Map<?, ? extends java.lang.Object> isOutputSupportedFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final java.util.Map<?, java.lang.Object> Camera2StreamConfigurationMap;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.Request getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.Map<?, ? extends java.lang.Object> unwrapAs;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> ArtificialStackFrames;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.graph.GraphRequestProcessor coroutineBoundary;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getOutputFormats;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final java.lang.Object getOutputMinFrameDuration;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.ProcessingQueue<androidx.camera.camera2.pipe.graph.GraphCommand> getInputSizeshNQ4ISI;

    /* renamed from: toString, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.camera2.pipe.Request.Listener> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.camera2.pipe.graph.GraphLoop.Listener> getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphLoop$Listener;", "", "", "onStopRepeating", "()V", "onGraphStopped", "onGraphShutdown"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
        void onGraphShutdown();

        void onGraphStopped();

        void onStopRepeating();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphLoop(androidx.camera.camera2.pipe.CameraGraphId cameraGraphId, java.util.Map<?, ? extends java.lang.Object> map, java.util.Map<?, ? extends java.lang.Object> map2, java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> list, java.util.List<? extends androidx.camera.camera2.pipe.graph.GraphLoop.Listener> list2, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = cameraGraphId;
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoFpsRanges = map2;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = list2;
        this.getInputFormats = coroutineScope;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher.plus(new kotlinx.coroutines.CoroutineName("CXCP-GraphLoop")));
        this.getOutputFormats = CoroutineScope;
        this.getInputSizeshNQ4ISI = androidx.camera.camera2.pipe.core.ProcessingQueue.INSTANCE.processIn(new androidx.camera.camera2.pipe.core.ProcessingQueue(0, new androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1(this), new androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$2(this), 1, null), CoroutineScope);
        this.getOutputMinFrameDuration = new java.lang.Object();
        this.getOutputStallDuration = kotlin.collections.MapsKt.emptyMap();
        this.getOutputSizes = kotlin.collections.MapsKt.emptyMap();
        this.getOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.emptyList();
        this.toString = kotlinx.atomicfu.AtomicFU.atomic(true);
        this.isOutputSupportedForhNQ4ISI = kotlin.collections.MapsKt.emptyMap();
        this.isOutputSupportedFor = kotlin.collections.MapsKt.emptyMap();
        this.unwrapAs = map2;
        this.ArtificialStackFrames = list;
    }

    public final androidx.camera.camera2.pipe.graph.GraphRequestProcessor getRequestProcessor() {
        androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor;
        synchronized (this.getOutputMinFrameDuration) {
            graphRequestProcessor = this.getOutputStallDurationlomOqCM;
        }
        return graphRequestProcessor;
    }

    public final void setRequestProcessor(androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor) {
        synchronized (this.getOutputMinFrameDuration) {
            androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor2 = this.getOutputStallDurationlomOqCM;
            this.getOutputStallDurationlomOqCM = graphRequestProcessor;
            if (this.getHighSpeedVideoSizesFor) {
                this.getOutputStallDurationlomOqCM = null;
                if (graphRequestProcessor != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputFormats, null, null, new androidx.camera.camera2.pipe.graph.GraphLoop$requestProcessor$2$1(graphRequestProcessor, null), 3, null);
                }
                return;
            }
            if (graphRequestProcessor2 != graphRequestProcessor) {
                this.getInputSizeshNQ4ISI.tryEmit(new androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor(graphRequestProcessor2, graphRequestProcessor));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (graphRequestProcessor == null) {
                int size = this.getHighSpeedVideoFpsRangesFor.size();
                for (int i = 0; i < size; i++) {
                    this.getHighSpeedVideoFpsRangesFor.get(i).onGraphStopped();
                }
            }
        }
    }

    public final androidx.camera.camera2.pipe.Request getRepeatingRequest() {
        androidx.camera.camera2.pipe.Request request;
        synchronized (this.getOutputMinFrameDuration) {
            request = this.getOutputMinFrameDurationlomOqCM;
        }
        return request;
    }

    public final void setRepeatingRequest(androidx.camera.camera2.pipe.Request request) {
        synchronized (this.getOutputMinFrameDuration) {
            androidx.camera.camera2.pipe.Request request2 = this.getOutputMinFrameDurationlomOqCM;
            this.getOutputMinFrameDurationlomOqCM = request;
            if (request2 != null || request != null) {
                if (request != null) {
                    this.getInputSizeshNQ4ISI.tryEmit(new androidx.camera.camera2.pipe.graph.GraphCommand.Repeat(request));
                } else {
                    this.getInputSizeshNQ4ISI.tryEmit(androidx.camera.camera2.pipe.graph.GraphCommand.Stop.INSTANCE);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (request == null) {
            int size = this.getHighSpeedVideoFpsRangesFor.size();
            for (int i = 0; i < size; i++) {
                this.getHighSpeedVideoFpsRangesFor.get(i).onStopRepeating();
            }
        }
    }

    public final java.util.Map<?, java.lang.Object> getGraphParameters() {
        java.util.Map<?, ? extends java.lang.Object> map;
        synchronized (this.getOutputMinFrameDuration) {
            map = this.getOutputStallDuration;
        }
        return map;
    }

    public final void setGraphParameters(java.util.Map<?, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        synchronized (this.getOutputMinFrameDuration) {
            this.getOutputStallDuration = map;
            this.getInputSizeshNQ4ISI.tryEmit(new androidx.camera.camera2.pipe.graph.GraphCommand.Parameters(map, this.getOutputSizes));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final java.util.Map<?, java.lang.Object> getGraph3AParameters() {
        java.util.Map<?, ? extends java.lang.Object> map;
        synchronized (this.getOutputMinFrameDuration) {
            map = this.getOutputSizes;
        }
        return map;
    }

    public final void setGraph3AParameters(java.util.Map<?, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        synchronized (this.getOutputMinFrameDuration) {
            this.getOutputSizes = map;
            this.getInputSizeshNQ4ISI.tryEmit(new androidx.camera.camera2.pipe.graph.GraphCommand.Parameters(this.getOutputStallDuration, map));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final java.util.List<androidx.camera.camera2.pipe.Request.Listener> getRequestListeners() {
        java.util.List list;
        synchronized (this.getOutputMinFrameDuration) {
            list = this.getOutputSizeshNQ4ISI;
        }
        return list;
    }

    public final void setRequestListeners(java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        synchronized (this.getOutputMinFrameDuration) {
            this.getOutputSizeshNQ4ISI = list;
            this.getInputSizeshNQ4ISI.tryEmit(new androidx.camera.camera2.pipe.graph.GraphCommand.Listeners(list));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final boolean getCaptureProcessingEnabled() {
        return this.toString.getValue();
    }

    public final void setCaptureProcessingEnabled(boolean z) {
        this.toString.setValue(z);
        if (z) {
            invalidate();
        }
    }

    public final boolean submit(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return submit(kotlin.collections.CollectionsKt.listOf(request));
    }

    public final boolean submit(java.util.List<androidx.camera.camera2.pipe.Request> requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        if (this.getInputSizeshNQ4ISI.tryEmit(new androidx.camera.camera2.pipe.graph.GraphCommand.Capture(requests))) {
            return true;
        }
        getHighSpeedVideoSizes(requests);
        return false;
    }

    public final boolean trigger(java.util.Map<?, ? extends java.lang.Object> parameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        if (getRepeatingRequest() == null) {
            throw new java.lang.IllegalStateException("Cannot submit parameters without an active repeating request!".toString());
        }
        return this.getInputSizeshNQ4ISI.tryEmit(new androidx.camera.camera2.pipe.graph.GraphCommand.Trigger(parameters));
    }

    public final void abort() {
        this.getInputSizeshNQ4ISI.tryEmit(androidx.camera.camera2.pipe.graph.GraphCommand.Abort.INSTANCE);
    }

    public final void invalidate() {
        this.getInputSizeshNQ4ISI.tryEmit(androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate.INSTANCE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.getOutputMinFrameDuration) {
            if (this.getHighSpeedVideoSizesFor) {
                return;
            }
            this.getHighSpeedVideoSizesFor = true;
            androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor = this.getOutputStallDurationlomOqCM;
            if (graphRequestProcessor != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputFormats, null, null, new androidx.camera.camera2.pipe.graph.GraphLoop$close$1$1$1(graphRequestProcessor, null), 3, null);
            }
            this.getOutputStallDurationlomOqCM = null;
            this.getInputSizeshNQ4ISI.tryEmit(androidx.camera.camera2.pipe.graph.GraphCommand.Shutdown.INSTANCE);
            int size = this.getHighSpeedVideoFpsRangesFor.size();
            for (int i = 0; i < size; i++) {
                this.getHighSpeedVideoFpsRangesFor.get(i).onGraphShutdown();
            }
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> p0, int p1, androidx.camera.camera2.pipe.graph.GraphCommand.Capture p2, boolean p3) {
        if (getCaptureProcessingEnabled() && getHighSpeedVideoFpsRanges(false, p2.getRequests(), kotlin.collections.MapsKt.emptyMap())) {
            p0.remove(p1);
            return;
        }
        if (!p3 || p1 <= 0) {
            return;
        }
        int i = p1 - 1;
        if (!(p0.get(i) instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat)) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        Camera2StreamConfigurationMap(p0, i, false);
    }

    private final void getHighSpeedVideoFpsRangesFor(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> p0, int p1, androidx.camera.camera2.pipe.graph.GraphCommand.Trigger p2) {
        androidx.camera.camera2.pipe.Request request = this.getValidOutputFormatsForInputhNQ4ISI;
        if (request == null && p1 == 0) {
            p0.remove(p1);
            return;
        }
        if (getCaptureProcessingEnabled() && request != null && getHighSpeedVideoFpsRanges(false, kotlin.collections.CollectionsKt.listOf(request), p2.getTriggerParameters())) {
            p0.remove(p1);
        } else if (p1 > 0) {
            int i = p1 - 1;
            if (!(p0.get(i) instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat)) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            Camera2StreamConfigurationMap(p0, i, false);
        }
    }

    private final void Camera2StreamConfigurationMap(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> p0, int p1, boolean p2) {
        int i;
        int i2 = p1;
        while (true) {
            int i3 = 0;
            if (i2 >= 0) {
                androidx.camera.camera2.pipe.graph.GraphCommand graphCommand = p0.get(i2);
                if (graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat) {
                    androidx.camera.camera2.pipe.graph.GraphCommand.Repeat repeat = (androidx.camera.camera2.pipe.graph.GraphCommand.Repeat) graphCommand;
                    if (getHighSpeedVideoFpsRanges(true, kotlin.collections.CollectionsKt.listOf(repeat.getRequest()), kotlin.collections.MapsKt.emptyMap())) {
                        this.getValidOutputFormatsForInputhNQ4ISI = repeat.getRequest();
                        p0.remove(i2);
                        while (i3 < i2) {
                            if (p0.get(i3) instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat) {
                                p0.remove(i3);
                                i2--;
                            } else {
                                i3++;
                            }
                        }
                        return;
                    }
                }
                i2--;
            } else {
                if (!p2 || (i = p1 + 1) >= p0.size()) {
                    return;
                }
                androidx.camera.camera2.pipe.graph.GraphCommand graphCommand2 = p0.get(i);
                if (graphCommand2 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Capture) {
                    getHighSpeedVideoFpsRangesFor(p0, i, (androidx.camera.camera2.pipe.graph.GraphCommand.Capture) graphCommand2, false);
                    return;
                } else {
                    if (graphCommand2 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Trigger) {
                        getHighSpeedVideoFpsRangesFor(p0, i, (androidx.camera.camera2.pipe.graph.GraphCommand.Trigger) graphCommand2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00fd -> B:27:0x00fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0101 -> B:28:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0111 -> B:29:0x0112). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list, int i, androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor requestProcessor, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.pipe.graph.GraphLoop$processRequestProcessor$1 graphLoop$processRequestProcessor$1;
        int i2;
        int i3;
        androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor requestProcessor2;
        kotlin.jvm.internal.Ref.IntRef intRef;
        androidx.camera.camera2.pipe.graph.GraphLoop$processRequestProcessor$1 graphLoop$processRequestProcessor$12;
        int i4;
        java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list2;
        java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list3;
        java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list4;
        androidx.camera.camera2.pipe.graph.GraphCommand graphCommand;
        androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor requestProcessor3;
        java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list5;
        int i5;
        androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor;
        androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor requestProcessor4;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list6;
        androidx.camera.camera2.pipe.graph.GraphCommand graphCommand2;
        java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list7;
        androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor requestProcessor5;
        kotlin.jvm.internal.Ref.IntRef intRef3;
        if (continuation instanceof androidx.camera.camera2.pipe.graph.GraphLoop$processRequestProcessor$1) {
            graphLoop$processRequestProcessor$1 = (androidx.camera.camera2.pipe.graph.GraphLoop$processRequestProcessor$1) continuation;
            if ((graphLoop$processRequestProcessor$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                graphLoop$processRequestProcessor$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = graphLoop$processRequestProcessor$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = graphLoop$processRequestProcessor$1.getOutputMinFrameDuration;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.IntRef intRef4 = new kotlin.jvm.internal.Ref.IntRef();
                    intRef4.element = 1;
                    list.remove(i);
                    i3 = i;
                    requestProcessor2 = requestProcessor;
                    intRef = intRef4;
                    graphLoop$processRequestProcessor$12 = graphLoop$processRequestProcessor$1;
                    i4 = 0;
                    list2 = list;
                    list3 = list2;
                    if (i4 < i3) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        intRef3 = (kotlin.jvm.internal.Ref.IntRef) graphLoop$processRequestProcessor$1.getHighSpeedVideoFpsRangesFor;
                        requestProcessor5 = (androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) graphLoop$processRequestProcessor$1.getHighResolutionOutputSizeshNQ4ISI;
                        list7 = (java.util.List) graphLoop$processRequestProcessor$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        list2 = list7;
                        intRef = intRef3;
                        requestProcessor2 = requestProcessor5;
                        this.coroutineBoundary = requestProcessor2.getNew();
                        if (!getHighSpeedVideoSizes()) {
                            androidx.camera.camera2.pipe.Request request = this.getValidOutputFormatsForInputhNQ4ISI;
                            if (request != null) {
                                list2.add(0, new androidx.camera.camera2.pipe.graph.GraphCommand.Repeat(request));
                                if (intRef.element == 1) {
                                    list2.add(androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate.INSTANCE);
                                }
                            }
                            this.getValidOutputFormatsForInputhNQ4ISI = null;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    i3 = graphLoop$processRequestProcessor$1.getHighSpeedVideoFpsRanges;
                    i5 = graphLoop$processRequestProcessor$1.Camera2StreamConfigurationMap;
                    list5 = (java.util.List) graphLoop$processRequestProcessor$1.getOutputFormats;
                    intRef = (kotlin.jvm.internal.Ref.IntRef) graphLoop$processRequestProcessor$1.getHighSpeedVideoFpsRangesFor;
                    requestProcessor3 = (androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) graphLoop$processRequestProcessor$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list8 = (java.util.List) graphLoop$processRequestProcessor$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor requestProcessor6 = requestProcessor3;
                    list4 = list8;
                    i4 = i5;
                    intRef.element++;
                    requestProcessor2 = requestProcessor6;
                    boolean z = true;
                    list2 = list4;
                    java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list9 = list5;
                    graphLoop$processRequestProcessor$12 = graphLoop$processRequestProcessor$1;
                    list3 = list9;
                    if (z) {
                        i4++;
                    } else {
                        list3.remove(i4);
                        i3--;
                    }
                    if (i4 < i3) {
                        graphCommand = list3.get(i4);
                        if (graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) {
                            androidx.camera.camera2.pipe.graph.GraphRequestProcessor old = ((androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) graphCommand).getOld();
                            if (old != null) {
                                graphLoop$processRequestProcessor$12.getHighSpeedVideoSizes = list2;
                                graphLoop$processRequestProcessor$12.getHighResolutionOutputSizeshNQ4ISI = requestProcessor2;
                                graphLoop$processRequestProcessor$12.getHighSpeedVideoFpsRangesFor = intRef;
                                graphLoop$processRequestProcessor$12.getOutputFormats = list3;
                                graphLoop$processRequestProcessor$12.getHighSpeedVideoSizesFor = graphCommand;
                                graphLoop$processRequestProcessor$12.Camera2StreamConfigurationMap = i4;
                                graphLoop$processRequestProcessor$12.getHighSpeedVideoFpsRanges = i3;
                                graphLoop$processRequestProcessor$12.getOutputMinFrameDuration = 1;
                                if (old.shutdown$camera_camera2_pipe(graphLoop$processRequestProcessor$12) != coroutine_suspended) {
                                    list4 = list2;
                                    kotlin.jvm.internal.Ref.IntRef intRef5 = intRef;
                                    list6 = list3;
                                    graphLoop$processRequestProcessor$1 = graphLoop$processRequestProcessor$12;
                                    graphCommand2 = graphCommand;
                                    requestProcessor4 = requestProcessor2;
                                    i5 = i4;
                                    intRef2 = intRef5;
                                    androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor requestProcessor7 = requestProcessor4;
                                    graphCommand = graphCommand2;
                                    list5 = list6;
                                    intRef = intRef2;
                                    requestProcessor3 = requestProcessor7;
                                    graphRequestProcessor = ((androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) graphCommand).getNew();
                                    if (graphRequestProcessor != null) {
                                        graphLoop$processRequestProcessor$1.getHighSpeedVideoSizes = list4;
                                        graphLoop$processRequestProcessor$1.getHighResolutionOutputSizeshNQ4ISI = requestProcessor3;
                                        graphLoop$processRequestProcessor$1.getHighSpeedVideoFpsRangesFor = intRef;
                                        graphLoop$processRequestProcessor$1.getOutputFormats = list5;
                                        graphLoop$processRequestProcessor$1.getHighSpeedVideoSizesFor = null;
                                        graphLoop$processRequestProcessor$1.Camera2StreamConfigurationMap = i5;
                                        graphLoop$processRequestProcessor$1.getHighSpeedVideoFpsRanges = i3;
                                        graphLoop$processRequestProcessor$1.getOutputMinFrameDuration = 2;
                                        if (graphRequestProcessor.shutdown$camera_camera2_pipe(graphLoop$processRequestProcessor$1) != coroutine_suspended) {
                                            list8 = list4;
                                            androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor requestProcessor62 = requestProcessor3;
                                            list4 = list8;
                                            i4 = i5;
                                            intRef.element++;
                                            requestProcessor2 = requestProcessor62;
                                            boolean z2 = true;
                                            list2 = list4;
                                            java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list92 = list5;
                                            graphLoop$processRequestProcessor$12 = graphLoop$processRequestProcessor$1;
                                            list3 = list92;
                                            if (z2) {
                                            }
                                            if (i4 < i3) {
                                            }
                                        }
                                    } else {
                                        requestProcessor62 = requestProcessor3;
                                        i4 = i5;
                                        intRef.element++;
                                        requestProcessor2 = requestProcessor62;
                                        boolean z22 = true;
                                        list2 = list4;
                                        java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list922 = list5;
                                        graphLoop$processRequestProcessor$12 = graphLoop$processRequestProcessor$1;
                                        list3 = list922;
                                        if (z22) {
                                        }
                                        if (i4 < i3) {
                                        }
                                    }
                                }
                            } else {
                                list4 = list2;
                                androidx.camera.camera2.pipe.graph.GraphLoop$processRequestProcessor$1 graphLoop$processRequestProcessor$13 = graphLoop$processRequestProcessor$12;
                                list5 = list3;
                                graphLoop$processRequestProcessor$1 = graphLoop$processRequestProcessor$13;
                                int i6 = i4;
                                requestProcessor3 = requestProcessor2;
                                i5 = i6;
                                graphRequestProcessor = ((androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) graphCommand).getNew();
                                if (graphRequestProcessor != null) {
                                }
                            }
                        } else {
                            z22 = false;
                            if (z22) {
                            }
                            if (i4 < i3) {
                                androidx.camera.camera2.pipe.graph.GraphRequestProcessor old2 = requestProcessor2.getOld();
                                if (old2 != null) {
                                    graphLoop$processRequestProcessor$12.getHighSpeedVideoSizes = list2;
                                    graphLoop$processRequestProcessor$12.getHighResolutionOutputSizeshNQ4ISI = requestProcessor2;
                                    graphLoop$processRequestProcessor$12.getHighSpeedVideoFpsRangesFor = intRef;
                                    graphLoop$processRequestProcessor$12.getOutputFormats = null;
                                    graphLoop$processRequestProcessor$12.getHighSpeedVideoSizesFor = null;
                                    graphLoop$processRequestProcessor$12.getOutputMinFrameDuration = 3;
                                    if (old2.shutdown$camera_camera2_pipe(graphLoop$processRequestProcessor$12) != coroutine_suspended) {
                                        list7 = list2;
                                        requestProcessor5 = requestProcessor2;
                                        intRef3 = intRef;
                                        list2 = list7;
                                        intRef = intRef3;
                                        requestProcessor2 = requestProcessor5;
                                    }
                                }
                                this.coroutineBoundary = requestProcessor2.getNew();
                                if (!getHighSpeedVideoSizes()) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                i3 = graphLoop$processRequestProcessor$1.getHighSpeedVideoFpsRanges;
                i5 = graphLoop$processRequestProcessor$1.Camera2StreamConfigurationMap;
                graphCommand2 = (androidx.camera.camera2.pipe.graph.GraphCommand) graphLoop$processRequestProcessor$1.getHighSpeedVideoSizesFor;
                list6 = (java.util.List) graphLoop$processRequestProcessor$1.getOutputFormats;
                intRef2 = (kotlin.jvm.internal.Ref.IntRef) graphLoop$processRequestProcessor$1.getHighSpeedVideoFpsRangesFor;
                requestProcessor4 = (androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) graphLoop$processRequestProcessor$1.getHighResolutionOutputSizeshNQ4ISI;
                list4 = (java.util.List) graphLoop$processRequestProcessor$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor requestProcessor72 = requestProcessor4;
                graphCommand = graphCommand2;
                list5 = list6;
                intRef = intRef2;
                requestProcessor3 = requestProcessor72;
                graphRequestProcessor = ((androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) graphCommand).getNew();
                if (graphRequestProcessor != null) {
                }
            }
        }
        graphLoop$processRequestProcessor$1 = new androidx.camera.camera2.pipe.graph.GraphLoop$processRequestProcessor$1(this, continuation);
        java.lang.Object obj2 = graphLoop$processRequestProcessor$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = graphLoop$processRequestProcessor$1.getOutputMinFrameDuration;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
    
        if (r8.shutdown$camera_camera2_pipe(r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        if (r13.shutdown$camera_camera2_pipe(r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        if (r13.shutdown$camera_camera2_pipe(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00b0 -> B:13:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d6 -> B:12:0x00e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e6 -> B:12:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.pipe.graph.GraphLoop$processShutdown$1 graphLoop$processShutdown$1;
        int i;
        int i2;
        int size;
        java.lang.Object obj;
        int i3;
        java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list2;
        int i4;
        androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor;
        if (continuation instanceof androidx.camera.camera2.pipe.graph.GraphLoop$processShutdown$1) {
            graphLoop$processShutdown$1 = (androidx.camera.camera2.pipe.graph.GraphLoop$processShutdown$1) continuation;
            if ((graphLoop$processShutdown$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                graphLoop$processShutdown$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj2 = graphLoop$processShutdown$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphLoop$processShutdown$1.getHighSpeedVideoSizes;
                i2 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    this.getValidOutputFormatsForInputhNQ4ISI = null;
                    this.isOutputSupportedForhNQ4ISI = kotlin.collections.MapsKt.emptyMap();
                    this.isOutputSupportedFor = kotlin.collections.MapsKt.emptyMap();
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        androidx.camera.camera2.pipe.graph.GraphCommand graphCommand = list.get(i5);
                        if (graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Capture) {
                            getHighSpeedVideoSizes(((androidx.camera.camera2.pipe.graph.GraphCommand.Capture) graphCommand).getRequests());
                        }
                    }
                    androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor2 = this.coroutineBoundary;
                    if (graphRequestProcessor2 != null) {
                        graphLoop$processShutdown$1.Camera2StreamConfigurationMap = list;
                        graphLoop$processShutdown$1.getHighSpeedVideoSizes = 1;
                    }
                } else if (i == 1) {
                    list = (java.util.List) graphLoop$processShutdown$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj2);
                } else if (i == 2) {
                    i3 = graphLoop$processShutdown$1.getHighSpeedVideoFpsRangesFor;
                    i4 = graphLoop$processShutdown$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object obj3 = (androidx.camera.camera2.pipe.graph.GraphCommand) graphLoop$processShutdown$1.getHighSpeedVideoFpsRanges;
                    java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> list3 = (java.util.List) graphLoop$processShutdown$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    obj = obj3;
                    list2 = list3;
                    graphRequestProcessor = ((androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) obj).getNew();
                    if (graphRequestProcessor != null) {
                    }
                    size = i3;
                    list = list2;
                    i2 = i4;
                    i2++;
                    if (i2 < size) {
                    }
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = graphLoop$processShutdown$1.getHighSpeedVideoFpsRangesFor;
                    i4 = graphLoop$processShutdown$1.getHighResolutionOutputSizeshNQ4ISI;
                    list2 = (java.util.List) graphLoop$processShutdown$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    size = i3;
                    list = list2;
                    i2 = i4;
                    i2++;
                    if (i2 < size) {
                        java.lang.Object obj4 = (androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i2);
                        if (obj4 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) {
                            androidx.camera.camera2.pipe.graph.GraphRequestProcessor old = ((androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) obj4).getOld();
                            if (old != null) {
                                graphLoop$processShutdown$1.Camera2StreamConfigurationMap = list;
                                graphLoop$processShutdown$1.getHighSpeedVideoFpsRanges = obj4;
                                graphLoop$processShutdown$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                graphLoop$processShutdown$1.getHighSpeedVideoFpsRangesFor = size;
                                graphLoop$processShutdown$1.getHighSpeedVideoSizes = 2;
                            }
                            int i6 = i2;
                            list2 = list;
                            i3 = size;
                            obj = obj4;
                            i4 = i6;
                            graphRequestProcessor = ((androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) obj).getNew();
                            if (graphRequestProcessor != null) {
                                graphLoop$processShutdown$1.Camera2StreamConfigurationMap = list2;
                                graphLoop$processShutdown$1.getHighSpeedVideoFpsRanges = null;
                                graphLoop$processShutdown$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                                graphLoop$processShutdown$1.getHighSpeedVideoFpsRangesFor = i3;
                                graphLoop$processShutdown$1.getHighSpeedVideoSizes = 3;
                            }
                            size = i3;
                            list = list2;
                            i2 = i4;
                        }
                        i2++;
                        if (i2 < size) {
                            list.clear();
                            kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.getOutputFormats, null, 1, null);
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
                this.coroutineBoundary = null;
                size = list.size();
                if (i2 < size) {
                }
            }
        }
        graphLoop$processShutdown$1 = new androidx.camera.camera2.pipe.graph.GraphLoop$processShutdown$1(this, continuation);
        java.lang.Object obj22 = graphLoop$processShutdown$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphLoop$processShutdown$1.getHighSpeedVideoSizes;
        i2 = 0;
        if (i != 0) {
        }
        this.coroutineBoundary = null;
        size = list.size();
        if (i2 < size) {
        }
    }

    private final boolean getHighSpeedVideoSizes() {
        androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor = this.coroutineBoundary;
        if (graphRequestProcessor == null) {
            return false;
        }
        androidx.camera.camera2.pipe.Request request = this.getValidOutputFormatsForInputhNQ4ISI;
        return kotlin.jvm.internal.Intrinsics.areEqual(request != null ? java.lang.Boolean.valueOf(graphRequestProcessor.submit$camera_camera2_pipe(true, kotlin.collections.CollectionsKt.listOf(request), this.Camera2StreamConfigurationMap, this.isOutputSupportedForhNQ4ISI, this.unwrapAs, this.ArtificialStackFrames)) : null, java.lang.Boolean.TRUE);
    }

    private final void getHighSpeedVideoSizes(java.util.List<androidx.camera.camera2.pipe.Request> p0) {
        java.util.List<androidx.camera.camera2.pipe.Request> list = p0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.camera.camera2.pipe.Request request = p0.get(i);
            int size2 = this.ArtificialStackFrames.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.ArtificialStackFrames.get(i2).onAborted(request);
            }
        }
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            androidx.camera.camera2.pipe.Request request2 = p0.get(i3);
            int size4 = request2.getListeners().size();
            for (int i4 = 0; i4 < size4; i4++) {
                request2.getListeners().get(i4).onAborted(request2);
            }
        }
    }

    private final boolean getHighSpeedVideoFpsRanges(boolean p0, java.util.List<androidx.camera.camera2.pipe.Request> p1, java.util.Map<?, ? extends java.lang.Object> p2) {
        java.util.Map<?, ? extends java.lang.Object> build;
        androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor = this.coroutineBoundary;
        if (graphRequestProcessor == null) {
            return false;
        }
        java.util.Map<?, ? extends java.lang.Object> map = this.Camera2StreamConfigurationMap;
        java.util.Map<?, ? extends java.lang.Object> map2 = this.isOutputSupportedForhNQ4ISI;
        if (p2.isEmpty()) {
            build = this.unwrapAs;
        } else {
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            androidx.camera.camera2.pipe.RequestsKt.putAllMetadata(createMapBuilder, this.isOutputSupportedFor);
            androidx.camera.camera2.pipe.RequestsKt.putAllMetadata(createMapBuilder, p2);
            androidx.camera.camera2.pipe.RequestsKt.putAllMetadata(createMapBuilder, this.getHighSpeedVideoFpsRanges);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            build = kotlin.collections.MapsKt.build(createMapBuilder);
        }
        boolean submit$camera_camera2_pipe = graphRequestProcessor.submit$camera_camera2_pipe(p0, p1, map, map2, build, this.ArtificialStackFrames);
        if (!submit$camera_camera2_pipe) {
            if (!p0) {
                if (p2.isEmpty()) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    return submit$camera_camera2_pipe;
                }
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    java.util.Objects.toString(kotlin.collections.CollectionsKt.single((java.util.List) p1));
                    java.util.Objects.toString(p2);
                }
            } else if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                kotlin.collections.CollectionsKt.single((java.util.List) p1);
                return submit$camera_camera2_pipe;
            }
        }
        return submit$camera_camera2_pipe;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphLoop(");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public static final /* synthetic */ void access$finalizeUnprocessedCommands(androidx.camera.camera2.pipe.graph.GraphLoop graphLoop, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.camera2.pipe.graph.GraphCommand graphCommand = (androidx.camera.camera2.pipe.graph.GraphCommand) it.next();
            if (graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Capture) {
                graphLoop.getHighSpeedVideoSizes(((androidx.camera.camera2.pipe.graph.GraphCommand.Capture) graphCommand).getRequests());
            } else if (graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(graphLoop.getInputFormats, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.camera.camera2.pipe.graph.GraphLoop$finalizeUnprocessedCommands$1(graphCommand, null), 1, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b2, code lost:
    
        if (r3 >= 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$process(androidx.camera.camera2.pipe.graph.GraphLoop graphLoop, java.util.List list, kotlin.coroutines.Continuation continuation) {
        int i;
        androidx.camera.camera2.pipe.graph.GraphCommand graphCommand;
        java.util.Map<?, ? extends java.lang.Object> build;
        int i2 = 0;
        if (list.size() != 1) {
            java.util.List list2 = list;
            i = list2.size() - 1;
            if (i >= 0) {
                int i3 = -1;
                while (true) {
                    int i4 = i - 1;
                    androidx.camera.camera2.pipe.graph.GraphCommand graphCommand2 = (androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(graphCommand2, androidx.camera.camera2.pipe.graph.GraphCommand.Abort.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(graphCommand2, androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(graphCommand2, androidx.camera.camera2.pipe.graph.GraphCommand.Stop.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(graphCommand2, androidx.camera.camera2.pipe.graph.GraphCommand.Shutdown.INSTANCE)) {
                        break;
                    }
                    if ((graphCommand2 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) && i3 < 0) {
                        i3 = i;
                    }
                    if (i4 < 0) {
                        i = i3;
                        break;
                    }
                    i = i4;
                }
                graphCommand = (androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i);
                if (kotlin.jvm.internal.Intrinsics.areEqual(graphCommand, androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate.INSTANCE)) {
                    list.remove(i);
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(graphCommand, androidx.camera.camera2.pipe.graph.GraphCommand.Shutdown.INSTANCE)) {
                        java.lang.Object highResolutionOutputSizeshNQ4ISI = graphLoop.getHighResolutionOutputSizeshNQ4ISI(list, continuation);
                        return highResolutionOutputSizeshNQ4ISI == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highResolutionOutputSizeshNQ4ISI : kotlin.Unit.INSTANCE;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(graphCommand, androidx.camera.camera2.pipe.graph.GraphCommand.Abort.INSTANCE)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(graphCommand, androidx.camera.camera2.pipe.graph.GraphCommand.Stop.INSTANCE)) {
                            if (graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) {
                                java.lang.Object highSpeedVideoSizes = graphLoop.getHighSpeedVideoSizes(list, i, (androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) graphCommand, continuation);
                                return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
                            }
                            if (!(graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Capture)) {
                                if (graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Trigger) {
                                    graphLoop.getHighSpeedVideoFpsRangesFor(list, i, (androidx.camera.camera2.pipe.graph.GraphCommand.Trigger) graphCommand);
                                } else if (!(graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Parameters)) {
                                    if (!(graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Listeners)) {
                                        if (!(graphCommand instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        graphLoop.Camera2StreamConfigurationMap(list, i, true);
                                    } else {
                                        graphLoop.ArtificialStackFrames = kotlin.collections.CollectionsKt.distinct(kotlin.collections.CollectionsKt.plus((java.util.Collection) ((androidx.camera.camera2.pipe.graph.GraphCommand.Listeners) graphCommand).getListeners(), (java.lang.Iterable) graphLoop.getHighResolutionOutputSizeshNQ4ISI));
                                        list.remove(i);
                                        while (i2 < i) {
                                            if (((androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i2)) instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Listeners) {
                                                list.remove(i2);
                                                i--;
                                            } else {
                                                i2++;
                                            }
                                        }
                                        graphLoop.getHighSpeedVideoSizes();
                                    }
                                } else {
                                    androidx.camera.camera2.pipe.graph.GraphCommand.Parameters parameters = (androidx.camera.camera2.pipe.graph.GraphCommand.Parameters) graphCommand;
                                    graphLoop.isOutputSupportedForhNQ4ISI = parameters.getGraphParameters();
                                    graphLoop.isOutputSupportedFor = parameters.getGraph3AParameters();
                                    if (parameters.getGraph3AParameters().isEmpty()) {
                                        build = graphLoop.getHighSpeedVideoFpsRanges;
                                    } else {
                                        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                                        androidx.camera.camera2.pipe.RequestsKt.putAllMetadata(createMapBuilder, parameters.getGraph3AParameters());
                                        androidx.camera.camera2.pipe.RequestsKt.putAllMetadata(createMapBuilder, graphLoop.getHighSpeedVideoFpsRanges);
                                        build = kotlin.collections.MapsKt.build(createMapBuilder);
                                    }
                                    graphLoop.unwrapAs = build;
                                    list.remove(i);
                                    while (i2 < i) {
                                        if (((androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i2)) instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Parameters) {
                                            list.remove(i2);
                                            i--;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    graphLoop.getHighSpeedVideoSizes();
                                }
                            } else {
                                graphLoop.getHighSpeedVideoFpsRangesFor(list, i, (androidx.camera.camera2.pipe.graph.GraphCommand.Capture) graphCommand, true);
                            }
                        } else {
                            androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor = graphLoop.coroutineBoundary;
                            if (graphRequestProcessor != null) {
                                graphRequestProcessor.stopRepeating$camera_camera2_pipe();
                            }
                            graphLoop.getValidOutputFormatsForInputhNQ4ISI = null;
                            list.remove(i);
                            while (i2 < i) {
                                androidx.camera.camera2.pipe.graph.GraphCommand graphCommand3 = (androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i2);
                                if (kotlin.jvm.internal.Intrinsics.areEqual(graphCommand3, androidx.camera.camera2.pipe.graph.GraphCommand.Stop.INSTANCE) || (graphCommand3 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat)) {
                                    list.remove(i2);
                                    i--;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor2 = graphLoop.coroutineBoundary;
                        if (graphRequestProcessor2 != null) {
                            graphRequestProcessor2.abortCaptures$camera_camera2_pipe();
                        }
                        graphLoop.getValidOutputFormatsForInputhNQ4ISI = null;
                        list.remove(i);
                        while (i2 < i) {
                            androidx.camera.camera2.pipe.graph.GraphCommand graphCommand4 = (androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i2);
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(graphCommand4, androidx.camera.camera2.pipe.graph.GraphCommand.Stop.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(graphCommand4, androidx.camera.camera2.pipe.graph.GraphCommand.Abort.INSTANCE) && !(graphCommand4 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat) && !(graphCommand4 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Trigger)) {
                                if (graphCommand4 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Capture) {
                                    graphLoop.getHighSpeedVideoSizes(((androidx.camera.camera2.pipe.graph.GraphCommand.Capture) graphCommand4).getRequests());
                                } else {
                                    i2++;
                                }
                            }
                            list.remove(i2);
                            i--;
                        }
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            i = -1;
            if (i < 0) {
                int size = list2.size();
                int i5 = -1;
                int i6 = -1;
                for (int i7 = 0; i7 < size; i7++) {
                    androidx.camera.camera2.pipe.graph.GraphCommand graphCommand5 = (androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i7);
                    if (graphCommand5 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Parameters) {
                        i6 = i7;
                    } else if (!(graphCommand5 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Listeners)) {
                        if (!(graphCommand5 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat)) {
                            break;
                        }
                    } else {
                        i5 = i7;
                    }
                }
                if (i6 < 0) {
                    if (i5 < 0) {
                        if (graphLoop.getValidOutputFormatsForInputhNQ4ISI != null && graphLoop.getCaptureProcessingEnabled()) {
                            int size2 = list2.size();
                            i5 = 0;
                            while (i5 < size2) {
                                androidx.camera.camera2.pipe.graph.GraphCommand graphCommand6 = (androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i5);
                                if (!(graphCommand6 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Capture) && !(graphCommand6 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Trigger)) {
                                    i5++;
                                }
                            }
                        }
                        int size3 = list2.size();
                        i = -1;
                        int i8 = 0;
                        while (i8 < size3 && (((androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i8)) instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat)) {
                            int i9 = i8;
                            i8++;
                            i = i9;
                        }
                    }
                    i = i5;
                    break;
                } else {
                    i = i6;
                }
            }
            graphCommand = (androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphCommand, androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate.INSTANCE)) {
            }
            return kotlin.Unit.INSTANCE;
        }
        i = 0;
        graphCommand = (androidx.camera.camera2.pipe.graph.GraphCommand) list.get(i);
        if (kotlin.jvm.internal.Intrinsics.areEqual(graphCommand, androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate.INSTANCE)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
