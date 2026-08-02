package androidx.camera.camera2.pipe.framegraph;

@androidx.camera.camera2.pipe.config.FrameGraphScope
@kotlin.Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJÏ\u0001\u0010:\u001a\b\u0012\u0004\u0012\u000207062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010'2\b\u0010+\u001a\u0004\u0018\u00010\u001c2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u00010,2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u00010,2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0016¢\u0006\u0004\b8\u00109JY\u0010@\u001a\b\u0012\u0004\u0012\u000207062\b\u0010;\u001a\u0004\u0018\u00010.2\b\u0010<\u001a\u0004\u0018\u00010.2\b\u0010=\u001a\u0004\u0018\u00010.2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u00010,2\u0006\u00102\u001a\u0002012\u0006\u0010?\u001a\u000203H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0013H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0013H\u0016¢\u0006\u0004\bD\u0010CJ;\u0010L\u001a\u00020K2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0E2\u0014\u0010I\u001a\u0010\u0012\u0004\u0012\u00020H\u0012\u0006\u0012\u0004\u0018\u00010H0G2\u0006\u0010J\u001a\u000201H\u0016¢\u0006\u0004\bL\u0010MJ\u0010\u0010O\u001a\u00020NH\u0096@¢\u0006\u0004\bO\u0010PJ\u0011\u0010Q\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bQ\u0010RJE\u0010X\u001a\u00028\u0000\"\u0004\b\u0000\u0010S2-\u0010W\u001a)\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020N\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000U\u0012\u0006\u0012\u0004\u0018\u00010H0T¢\u0006\u0002\bVH\u0096@¢\u0006\u0004\bX\u0010YJR\u0010[\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010S2\u0006\u0010Z\u001a\u00020\t2-\u0010W\u001a)\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020N\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000U\u0012\u0006\u0012\u0004\u0018\u00010H0T¢\u0006\u0002\bVH\u0016¢\u0006\u0004\b[\u0010\\J)\u0010_\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010S*\u00020H2\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000]H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0013H\u0016¢\u0006\u0004\ba\u0010CJ \u0010d\u001a\b\u0012\u0004\u0012\u000207062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\bb\u0010cJ\u0016\u0010e\u001a\b\u0012\u0004\u0012\u00020706H\u0096\u0001¢\u0006\u0004\be\u0010fJd\u0010i\u001a\b\u0012\u0004\u0012\u000207062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0096\u0001¢\u0006\u0004\bg\u0010hJd\u0010k\u001a\b\u0012\u0004\u0012\u000207062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0096\u0001¢\u0006\u0004\bj\u0010hR\u0014\u0010l\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010n\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bp\u0010sR\u0014\u0010t\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010w\u001a\u00020v8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR!\u0010}\u001a\b\u0012\u0004\u0012\u00020|0{8\u0017X\u0097\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0083\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00018\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R'\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0081\u00018\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0084\u0001\u001a\u0006\b\u0089\u0001\u0010\u0086\u0001R)\u0010\u008a\u0001\u001a\u00020.8\u0017@\u0017X\u0097\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008a\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010I\u001a\u00030\u008f\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/framegraph/FrameGraphImpl;", "Landroidx/camera/camera2/pipe/FrameGraph;", "Landroidx/camera/camera2/pipe/CameraControls3A;", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "frameDistributor", "Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;", "frameGraphBuffers", "Lkotlinx/coroutines/CoroutineScope;", "frameGraphCoroutineScope", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "controller3A", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph;Landroidx/camera/camera2/pipe/internal/FrameDistributor;Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;Lkotlinx/coroutines/CoroutineScope;Landroidx/camera/camera2/pipe/graph/Controller3A;)V", "Landroidx/camera/camera2/pipe/StreamId;", "stream", "Landroid/view/Surface;", "surface", "", "setSurface-NYG5g8E", "(ILandroid/view/Surface;)V", "setSurface", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "mode", "updateAudioRestrictionMode-LwUUkyU", "(I)V", "updateAudioRestrictionMode", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "lock3A-vIrNa9k", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IJJ)Lkotlinx/coroutines/Deferred;", "lock3A", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "unlock3A", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;IJ)Lkotlinx/coroutines/Deferred;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "", "streamIds", "", "", "parameters", "capacity", "Landroidx/camera/camera2/pipe/FrameBuffer;", "captureWith", "(Ljava/util/Set;Ljava/util/Map;I)Landroidx/camera/camera2/pipe/FrameBuffer;", "Landroidx/camera/camera2/pipe/FrameGraph$Session;", "acquireSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSessionOrNull", "()Landroidx/camera/camera2/pipe/FrameGraph$Session;", "T", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "action", "useSession", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "useSessionIn", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Deferred;", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "close", "setTorchOff-NqN7i0k", "(Landroidx/camera/camera2/pipe/AeMode;)Lkotlinx/coroutines/Deferred;", "setTorchOff", "setTorchOn", "()Lkotlinx/coroutines/Deferred;", "submit3A-ydBZfZg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlinx/coroutines/Deferred;", "submit3A", "update3A-ydBZfZg", "update3A", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/CameraGraph;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/framegraph/FrameGraphBuffers;", "Lkotlinx/coroutines/CoroutineScope;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "Landroidx/camera/camera2/pipe/StreamGraph;", "streams", "Landroidx/camera/camera2/pipe/StreamGraph;", "getStreams", "()Landroidx/camera/camera2/pipe/StreamGraph;", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/camera/camera2/pipe/GraphState;", "graphState", "Lkotlinx/coroutines/flow/StateFlow;", "getGraphState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/camera/camera2/pipe/FrameNumber;", "latestFrameNumber", "Lkotlinx/coroutines/flow/Flow;", "getLatestFrameNumber", "()Lkotlinx/coroutines/flow/Flow;", "Landroidx/camera/camera2/pipe/FrameInfo;", "latestFrameInfo", "getLatestFrameInfo", "isForeground", "Z", "()Z", "setForeground", "(Z)V", "Landroidx/camera/camera2/pipe/Parameters;", "getParameters", "()Landroidx/camera/camera2/pipe/Parameters;", "Landroidx/camera/camera2/pipe/RequestListeners;", "getListeners", "()Landroidx/camera/camera2/pipe/RequestListeners;", "listeners", "Landroidx/camera/camera2/pipe/CameraGraphId;", "getId", "()Landroidx/camera/camera2/pipe/CameraGraphId;", "id"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameGraphImpl implements androidx.camera.camera2.pipe.FrameGraph, androidx.camera.camera2.pipe.CameraControls3A {
    private final androidx.camera.camera2.pipe.graph.Controller3A Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;
    private final androidx.camera.camera2.pipe.CameraGraph getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.FrameDistributor getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<androidx.camera.camera2.pipe.GraphState> graphState;
    private boolean isForeground;
    private final kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.FrameInfo> latestFrameInfo;
    private final kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.FrameNumber> latestFrameNumber;
    private final androidx.camera.camera2.pipe.StreamGraph streams;

    @javax.inject.Inject
    public FrameGraphImpl(androidx.camera.camera2.pipe.CameraGraph cameraGraph, androidx.camera.camera2.pipe.internal.FrameDistributor frameDistributor, androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers frameGraphBuffers, @androidx.camera.camera2.pipe.config.FrameGraphCoroutineScope kotlinx.coroutines.CoroutineScope coroutineScope, androidx.camera.camera2.pipe.graph.Controller3A controller3A) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameDistributor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameGraphBuffers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller3A, "");
        this.getHighSpeedVideoFpsRanges = cameraGraph;
        this.getHighResolutionOutputSizeshNQ4ISI = frameDistributor;
        this.getHighSpeedVideoFpsRangesFor = frameGraphBuffers;
        this.getHighSpeedVideoSizes = coroutineScope;
        this.Camera2StreamConfigurationMap = controller3A;
        frameDistributor.setFrameStartedListener(frameGraphBuffers);
        this.streams = cameraGraph.getStreams();
        this.graphState = cameraGraph.getGraphState();
        this.latestFrameNumber = cameraGraph.getLatestFrameNumber();
        this.latestFrameInfo = cameraGraph.getLatestFrameInfo();
        this.isForeground = cameraGraph.getIsForeground();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.StreamGraph getStreams() {
        return this.streams;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final kotlinx.coroutines.flow.StateFlow<androidx.camera.camera2.pipe.GraphState> getGraphState() {
        return this.graphState;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.FrameNumber> getLatestFrameNumber() {
        return this.latestFrameNumber;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.FrameInfo> getLatestFrameInfo() {
        return this.latestFrameInfo;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: isForeground, reason: from getter */
    public final boolean getIsForeground() {
        return this.isForeground;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final void setForeground(boolean z) {
        this.isForeground = z;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: setSurface-NYG5g8E */
    public final void mo390setSurfaceNYG5g8E(int stream, android.view.Surface surface) {
        this.getHighSpeedVideoFpsRanges.mo390setSurfaceNYG5g8E(stream, surface);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: updateAudioRestrictionMode-LwUUkyU */
    public final void mo391updateAudioRestrictionModeLwUUkyU(int mode) {
        this.getHighSpeedVideoFpsRanges.mo391updateAudioRestrictionModeLwUUkyU(mode);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: lock3A-vIrNa9k */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo389lock3AvIrNa9k(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions, androidx.camera.camera2.pipe.Lock3ABehavior aeLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior afLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior awbLockBehavior, androidx.camera.camera2.pipe.AeMode afTriggerStartAeMode, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> convergedCondition, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> lockedCondition, int frameLimit, long convergedTimeLimitNs, long lockedTimeLimitNs) {
        return this.getHighSpeedVideoFpsRanges.mo389lock3AvIrNa9k(aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions, aeLockBehavior, afLockBehavior, awbLockBehavior, afTriggerStartAeMode, convergedCondition, lockedCondition, frameLimit, convergedTimeLimitNs, lockedTimeLimitNs);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> unlock3A(java.lang.Boolean ae, java.lang.Boolean af, java.lang.Boolean awb, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> unlockedCondition, int frameLimit, long timeLimitNs) {
        return this.getHighSpeedVideoFpsRanges.unlock3A(ae, af, awb, unlockedCondition, frameLimit, timeLimitNs);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.Parameters getParameters() {
        return this.getHighSpeedVideoFpsRanges.getParameters();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.RequestListeners getListeners() {
        return this.getHighSpeedVideoFpsRanges.getListeners();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.CameraGraphId getId() {
        return this.getHighSpeedVideoFpsRanges.getId();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final void start() {
        this.getHighSpeedVideoFpsRanges.start();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final void stop() {
        this.getHighSpeedVideoFpsRanges.stop();
    }

    @Override // androidx.camera.camera2.pipe.FrameGraph
    public final androidx.camera.camera2.pipe.FrameBuffer captureWith(java.util.Set<androidx.camera.camera2.pipe.StreamId> streamIds, java.util.Map<java.lang.Object, ? extends java.lang.Object> parameters, int capacity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamIds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameters, "");
        return this.getHighSpeedVideoFpsRangesFor.attach$camera_camera2_pipe(streamIds, parameters, capacity);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object acquireSession(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameGraph.Session> continuation) {
        androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$acquireSession$1 frameGraphImpl$acquireSession$1;
        int i;
        androidx.camera.camera2.pipe.framegraph.FrameGraphImpl frameGraphImpl;
        if (continuation instanceof androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$acquireSession$1) {
            frameGraphImpl$acquireSession$1 = (androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$acquireSession$1) continuation;
            if ((frameGraphImpl$acquireSession$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                frameGraphImpl$acquireSession$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = frameGraphImpl$acquireSession$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = frameGraphImpl$acquireSession$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.pipe.CameraGraph cameraGraph = this.getHighSpeedVideoFpsRanges;
                    frameGraphImpl$acquireSession$1.getHighSpeedVideoFpsRanges = this;
                    frameGraphImpl$acquireSession$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = cameraGraph.acquireSession(frameGraphImpl$acquireSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    frameGraphImpl = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    frameGraphImpl = (androidx.camera.camera2.pipe.framegraph.FrameGraphImpl) frameGraphImpl$acquireSession$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new androidx.camera.camera2.pipe.framegraph.FrameGraphSessionImpl((androidx.camera.camera2.pipe.CameraGraph.Session) obj, frameGraphImpl.getHighSpeedVideoFpsRangesFor, frameGraphImpl.Camera2StreamConfigurationMap);
            }
        }
        frameGraphImpl$acquireSession$1 = new androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$acquireSession$1(this, continuation);
        java.lang.Object obj2 = frameGraphImpl$acquireSession$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = frameGraphImpl$acquireSession$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new androidx.camera.camera2.pipe.framegraph.FrameGraphSessionImpl((androidx.camera.camera2.pipe.CameraGraph.Session) obj2, frameGraphImpl.getHighSpeedVideoFpsRangesFor, frameGraphImpl.Camera2StreamConfigurationMap);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.FrameGraph.Session acquireSessionOrNull() {
        androidx.camera.camera2.pipe.CameraGraph.Session acquireSessionOrNull = this.getHighSpeedVideoFpsRanges.acquireSessionOrNull();
        if (acquireSessionOrNull != null) {
            return new androidx.camera.camera2.pipe.framegraph.FrameGraphSessionImpl(acquireSessionOrNull, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final <T> java.lang.Object useSession(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.camera.camera2.pipe.FrameGraph.Session, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super T> continuation) {
        return this.getHighSpeedVideoFpsRanges.useSession(new androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$useSession$2(this, function3, null), continuation);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final <T> kotlinx.coroutines.Deferred<T> useSessionIn(kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.camera.camera2.pipe.FrameGraph.Session, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return this.getHighSpeedVideoFpsRanges.useSessionIn(scope, new androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$useSessionIn$1(this, action, null));
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.CameraGraph.class))) {
            return (T) this.getHighSpeedVideoFpsRanges;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges.close();
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.getHighSpeedVideoSizes, null, 1, null);
    }

    public static final /* synthetic */ androidx.camera.camera2.pipe.FrameGraph.Session access$createSession(androidx.camera.camera2.pipe.framegraph.FrameGraphImpl frameGraphImpl, androidx.camera.camera2.pipe.CameraGraph.Session session) {
        return new androidx.camera.camera2.pipe.framegraph.FrameGraphSessionImpl(session, frameGraphImpl.getHighSpeedVideoFpsRangesFor, frameGraphImpl.Camera2StreamConfigurationMap);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: update3A-ydBZfZg */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo279update3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        return this.getHighSpeedVideoFpsRanges.mo279update3AydBZfZg(aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: submit3A-ydBZfZg */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo278submit3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        return this.getHighSpeedVideoFpsRanges.mo278submit3AydBZfZg(aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> setTorchOn() {
        return this.getHighSpeedVideoFpsRanges.setTorchOn();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: setTorchOff-NqN7i0k */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo277setTorchOffNqN7i0k(androidx.camera.camera2.pipe.AeMode aeMode) {
        return this.getHighSpeedVideoFpsRanges.mo277setTorchOffNqN7i0k(aeMode);
    }
}
