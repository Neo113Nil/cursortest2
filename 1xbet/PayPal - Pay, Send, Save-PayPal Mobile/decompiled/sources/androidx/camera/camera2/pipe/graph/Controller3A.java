package androidx.camera.camera2.pipe.graph;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 f2\u00020\u0001:\u0001fB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJy\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001fJm\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b!\u0010\"JÎ\u0001\u00105\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0018\u00010)2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0018\u00010)2\b\b\u0002\u0010/\u001a\u00020.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00102\u001a\u0004\u0018\u000100H\u0086@¢\u0006\u0004\b3\u00104Je\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u00106\u001a\u0004\u0018\u00010+2\n\b\u0002\u00107\u001a\u0004\u0018\u00010+2\n\b\u0002\u00108\u001a\u0004\u0018\u00010+2\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0018\u00010)2\b\b\u0002\u0010/\u001a\u00020.2\n\b\u0002\u0010:\u001a\u0004\u0018\u000100¢\u0006\u0004\b;\u0010<J?\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0018\u00010)2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010:\u001a\u000200¢\u0006\u0004\b=\u0010>J;\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010?\u001a\u00020+2\b\b\u0002\u0010@\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010:\u001a\u000200¢\u0006\u0004\b=\u0010AJU\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0018\u0010D\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030C\u0012\u0004\u0012\u00020\u0001\u0018\u00010B2\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0018\u00010)2\u0006\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u000200H\u0002¢\u0006\u0004\bH\u0010IJ\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010J\u001a\u00020+¢\u0006\u0004\bK\u0010LJ\u0013\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bO\u0010PJ7\u0010S\u001a\u00020R2\b\u0010D\u001a\u0004\u0018\u00010\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u00112\b\u0010F\u001a\u0004\u0018\u00010\u00132\b\u0010G\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\bS\u0010TJ\u0015\u0010W\u001a\u00020V2\u0006\u0010U\u001a\u00020\f¢\u0006\u0004\bW\u0010XR\u0014\u0010S\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001e\u0010e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d"}, d2 = {"Landroidx/camera/camera2/pipe/graph/Controller3A;", "", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "graphProcessor", "Landroidx/camera/camera2/pipe/CameraMetadata;", "metadata", "Landroidx/camera/camera2/pipe/graph/GraphState3A;", "graphState3A", "Landroidx/camera/camera2/pipe/graph/Listener3A;", "graphListener3A", "<init>", "(Landroidx/camera/camera2/pipe/graph/GraphProcessor;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/graph/GraphState3A;Landroidx/camera/camera2/pipe/graph/Listener3A;)V", "Landroidx/camera/camera2/pipe/graph/State3A;", "state3ASnapshot", "()Landroidx/camera/camera2/pipe/graph/State3A;", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "Landroidx/camera/camera2/pipe/FlashMode;", "flashMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "update3A-169HPGg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Landroidx/camera/camera2/pipe/FlashMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlinx/coroutines/Deferred;", "update3A", "submit3A-ydBZfZg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlinx/coroutines/Deferred;", "submit3A", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "lock3A-Qz1gx5w", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lock3A", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "unlock3A", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;ILjava/lang/Long;)Lkotlinx/coroutines/Deferred;", "lock3AForCapture", "(Lkotlin/jvm/functions/Function1;IJ)Lkotlinx/coroutines/Deferred;", "triggerAf", "waitForAwb", "(ZZIJ)Lkotlinx/coroutines/Deferred;", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "p0", "p1", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;IJ)Lkotlinx/coroutines/Deferred;", "cancelAf", "unlock3APostCapture", "(Z)Lkotlinx/coroutines/Deferred;", "setTorchOn", "()Lkotlinx/coroutines/Deferred;", "setTorchOff-NqN7i0k", "(Landroidx/camera/camera2/pipe/AeMode;)Lkotlinx/coroutines/Deferred;", "setTorchOff", "Landroidx/camera/camera2/pipe/graph/Result3AStateListenerImpl;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Landroidx/camera/camera2/pipe/FlashMode;)Landroidx/camera/camera2/pipe/graph/Result3AStateListenerImpl;", "initialState3A", "", "reset3A", "(Landroidx/camera/camera2/pipe/graph/State3A;)V", "accessartificialFrame", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "a", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getHighSpeedVideoSizes", "coroutineCreation", "Landroidx/camera/camera2/pipe/graph/GraphState3A;", "coroutineBoundary", "Landroidx/camera/camera2/pipe/graph/Listener3A;", "Camera2StreamConfigurationMap", "_CREATION", "Lkotlinx/coroutines/Deferred;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Controller3A {
    private static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<java.lang.Boolean>, java.lang.Boolean> ArtificialStackFrames;
    private static final java.util.List<java.lang.Integer> Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.graph.Controller3A.Companion INSTANCE = new androidx.camera.camera2.pipe.graph.Controller3A.Companion(null);
    private static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> CoroutineDebuggingKt;
    private static final java.util.List<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getHighSpeedVideoFpsRanges;
    private static final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getHighSpeedVideoSizes;
    private static final java.util.List<java.lang.Integer> getHighSpeedVideoSizesFor;
    private static final java.util.List<java.lang.Integer> getInputFormats;
    private static final java.util.List<java.lang.Integer> getInputSizeshNQ4ISI;
    private static final java.util.List<java.lang.Integer> getOutputFormats;
    private static final java.util.List<java.lang.Integer> getOutputMinFrameDuration;
    private static final kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.Result3A> getOutputMinFrameDurationlomOqCM;
    private static final java.util.List<java.lang.Integer> getOutputSizes;
    private static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getOutputSizeshNQ4ISI;
    private static final java.util.List<java.lang.Integer> getOutputStallDuration;
    private static final java.util.List<java.lang.Integer> getOutputStallDurationlomOqCM;
    private static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getValidOutputFormatsForInputhNQ4ISI;
    private static final java.util.Map<? extends android.hardware.camera2.CaptureRequest.Key<? extends java.lang.Object>, java.lang.Object> isOutputSupportedFor;
    private static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> isOutputSupportedForhNQ4ISI;
    private static final kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> toString;
    private static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> unwrapAs;

    /* renamed from: _CREATION, reason: from kotlin metadata */
    private kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> getHighSpeedVideoFpsRanges;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraMetadata getHighSpeedVideoSizes;

    /* renamed from: accessartificialFrame, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.GraphProcessor getHighSpeedVideoFpsRangesFor;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.Listener3A Camera2StreamConfigurationMap;

    /* renamed from: coroutineCreation, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.GraphState3A getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public Controller3A(androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.pipe.graph.GraphState3A graphState3A, androidx.camera.camera2.pipe.graph.Listener3A listener3A) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphState3A, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener3A, "");
        this.getHighSpeedVideoFpsRangesFor = graphProcessor;
        this.getHighSpeedVideoSizes = cameraMetadata;
        this.getHighResolutionOutputSizeshNQ4ISI = graphState3A;
        this.Camera2StreamConfigurationMap = listener3A;
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u001d\u001a!\u0012\u0017\u0012\u0015\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u0010¢\u0006\u0002\b \u0012\u0004\u0012\u00020\u001e0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010!\u001a \u0012\u0016\b\u0001\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u001f*\u0004\u0018\u00010\u00010\u00010\u0010\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001e0&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/camera/camera2/pipe/graph/Controller3A$Companion;", "", "<init>", "()V", "aeConvergedStateList", "", "", "awbConvergedStateList", "afConvergedStateList", "aeLockedStateList", "awbLockedStateList", "afLockedStateList", "aePostPrecaptureStateList", "awbPostPrecaptureStateList", "parameterForAfTriggerStart", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "getParameterForAfTriggerStart", "()Ljava/util/Map;", "parameterForAfTriggerCancel", "getParameterForAfTriggerCancel", "parametersForAePrecapture", "parametersForAePrecaptureAndAfTrigger", "deferredResult3ASubmitFailed", "Lkotlinx/coroutines/CompletableDeferred;", "Landroidx/camera/camera2/pipe/Result3A;", "aeUnlockedStateList", "afUnlockedStateList", "awbUnlockedStateList", "unlock3APostCaptureLockAeParams", "", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "unlock3APostCaptureLockAeAndCancelAfParams", "unlock3APostCaptureUnlockAeParams", "aePrecaptureCancelParams", "aePrecaptureAndAfCancelParams", "unlock3APostCaptureAfUnlockedCondition", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getParameterForAfTriggerStart() {
            return androidx.camera.camera2.pipe.graph.Controller3A.unwrapAs;
        }

        public final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getParameterForAfTriggerCancel() {
            return androidx.camera.camera2.pipe.graph.Controller3A.getOutputSizeshNQ4ISI;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{2, 4, 3});
        getHighSpeedVideoSizesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{2, 3});
        getOutputMinFrameDuration = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{2, 6, 4, 5});
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf(3);
        getOutputSizes = kotlin.collections.CollectionsKt.listOf(3);
        getInputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{4, 5});
        getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{2, 4, 3});
        getOutputStallDurationlomOqCM = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{2, 3});
        unwrapAs = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1));
        getOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2));
        isOutputSupportedForhNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1));
        getValidOutputFormatsForInputhNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 1), kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1));
        getOutputMinFrameDurationlomOqCM = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(new androidx.camera.camera2.pipe.Result3A(androidx.camera.camera2.pipe.Result3A.Status.INSTANCE.m700getSUBMIT_FAILEDJvTi9ms(), null == true ? 1 : 0, 2, null == true ? 1 : 0));
        getInputFormats = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{0, 1, 2, 4});
        java.util.List<java.lang.Integer> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{0, 3, 1, 2, 6});
        getOutputFormats = listOf;
        getOutputStallDuration = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{0, 1, 2});
        ArtificialStackFrames = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK, bool));
        isOutputSupportedFor = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2), kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK, bool));
        CoroutineDebuggingKt = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK, java.lang.Boolean.FALSE));
        getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2));
        getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER, 2), kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2));
        toString = androidx.camera.camera2.pipe.graph.Result3AStateListenerKt.toConditionChecker(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE, listOf)));
    }

    public final androidx.camera.camera2.pipe.graph.State3A state3ASnapshot() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCurrent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: update3A-169HPGg$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.Deferred m907update3A169HPGg$default(androidx.camera.camera2.pipe.graph.Controller3A controller3A, androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, androidx.camera.camera2.pipe.FlashMode flashMode, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            aeMode = null;
        }
        if ((i & 2) != 0) {
            afMode = null;
        }
        if ((i & 4) != 0) {
            awbMode = null;
        }
        if ((i & 8) != 0) {
            flashMode = null;
        }
        if ((i & 16) != 0) {
            list = null;
        }
        if ((i & 32) != 0) {
            list2 = null;
        }
        if ((i & 64) != 0) {
            list3 = null;
        }
        return controller3A.m911update3A169HPGg(aeMode, afMode, awbMode, flashMode, list, list2, list3);
    }

    /* renamed from: update3A-169HPGg, reason: not valid java name */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> m911update3A169HPGg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, androidx.camera.camera2.pipe.FlashMode flashMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        if (this.getHighSpeedVideoFpsRangesFor.getRepeatingRequest() == null) {
            androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, aeMode, afMode, awbMode, flashMode, aeRegions, afRegions, awbRegions, null, null, null, 896, null);
            this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
            return getOutputMinFrameDurationlomOqCM;
        }
        androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(aeMode, afMode, awbMode, flashMode);
        this.Camera2StreamConfigurationMap.addListener(highSpeedVideoFpsRangesFor);
        androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, aeMode, afMode, awbMode, flashMode, aeRegions, afRegions, awbRegions, null, null, null, 896, null);
        this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> result = highSpeedVideoFpsRangesFor.getResult();
        synchronized (this) {
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                kotlinx.coroutines.Deferred unused = this.getHighSpeedVideoFpsRanges;
            }
            kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> deferred = this.getHighSpeedVideoFpsRanges;
            if (deferred != null) {
                kotlinx.coroutines.JobKt__JobKt.cancel$default(deferred, "A newer call for 3A state update initiated.", null, 2, null);
            }
            this.getHighSpeedVideoFpsRanges = result;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: submit3A-ydBZfZg$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.Deferred m906submit3AydBZfZg$default(androidx.camera.camera2.pipe.graph.Controller3A controller3A, androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            aeMode = null;
        }
        if ((i & 2) != 0) {
            afMode = null;
        }
        if ((i & 4) != 0) {
            awbMode = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            list3 = null;
        }
        return controller3A.m910submit3AydBZfZg(aeMode, afMode, awbMode, list, list2, list3);
    }

    /* renamed from: submit3A-ydBZfZg, reason: not valid java name */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> m910submit3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        if (this.getHighSpeedVideoFpsRangesFor.getRepeatingRequest() == null) {
            return getOutputMinFrameDurationlomOqCM;
        }
        androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(aeMode, afMode, awbMode, null);
        androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl result3AStateListenerImpl = highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap.addListener(result3AStateListenerImpl);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (aeMode != null) {
            int m157unboximpl = aeMode.m157unboximpl();
            android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            linkedHashMap.put(key, java.lang.Integer.valueOf(m157unboximpl));
        }
        if (afMode != null) {
            int m176unboximpl = afMode.m176unboximpl();
            android.hardware.camera2.CaptureRequest.Key key2 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
            linkedHashMap.put(key2, java.lang.Integer.valueOf(m176unboximpl));
        }
        if (awbMode != null) {
            int m202unboximpl = awbMode.m202unboximpl();
            android.hardware.camera2.CaptureRequest.Key key3 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, "");
            linkedHashMap.put(key3, java.lang.Integer.valueOf(m202unboximpl));
        }
        if (aeRegions != null) {
            android.hardware.camera2.CaptureRequest.Key key4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key4, "");
            linkedHashMap.put(key4, aeRegions.toArray(new android.hardware.camera2.params.MeteringRectangle[0]));
        }
        if (afRegions != null) {
            android.hardware.camera2.CaptureRequest.Key key5 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key5, "");
            linkedHashMap.put(key5, afRegions.toArray(new android.hardware.camera2.params.MeteringRectangle[0]));
        }
        if (awbRegions != null) {
            android.hardware.camera2.CaptureRequest.Key key6 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key6, "");
            linkedHashMap.put(key6, awbRegions.toArray(new android.hardware.camera2.params.MeteringRectangle[0]));
        }
        if (!this.getHighSpeedVideoFpsRangesFor.trigger(linkedHashMap)) {
            this.Camera2StreamConfigurationMap.removeListener(result3AStateListenerImpl);
            return getOutputMinFrameDurationlomOqCM;
        }
        return highSpeedVideoFpsRangesFor.getResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: lock3A-Qz1gx5w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m908lock3AQz1gx5w(java.util.List<android.hardware.camera2.params.MeteringRectangle> list, java.util.List<android.hardware.camera2.params.MeteringRectangle> list2, java.util.List<android.hardware.camera2.params.MeteringRectangle> list3, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior2, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior3, androidx.camera.camera2.pipe.AeMode aeMode, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function12, int i, java.lang.Long l, java.lang.Long l2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation) {
        androidx.camera.camera2.pipe.graph.Controller3A$lock3A$1 controller3A$lock3A$1;
        int i2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function13;
        androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl result3AStateListenerImpl;
        androidx.camera.camera2.pipe.AeMode aeMode2;
        kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function14;
        int i3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.Long l3;
        androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior4;
        java.util.Map map;
        androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior5;
        java.lang.Boolean bool;
        java.lang.Boolean bool2;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        boolean z;
        java.util.Map map2;
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> result;
        androidx.camera.camera2.pipe.Result3A result3A;
        androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior6 = lock3ABehavior3;
        if (continuation instanceof androidx.camera.camera2.pipe.graph.Controller3A$lock3A$1) {
            controller3A$lock3A$1 = (androidx.camera.camera2.pipe.graph.Controller3A$lock3A$1) continuation;
            if ((controller3A$lock3A$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                controller3A$lock3A$1.getInputFormats -= 2147483648;
                java.lang.Object obj = controller3A$lock3A$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = controller3A$lock3A$1.getInputFormats;
                androidx.camera.camera2.pipe.AeMode aeMode3 = null;
                java.lang.Object[] objArr3 = 0;
                java.lang.Object[] objArr4 = 0;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef.element = lock3ABehavior2;
                    if (!androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getSupportsAutoFocusTrigger(this.getHighSpeedVideoSizes)) {
                        objectRef.element = null;
                    }
                    if (lock3ABehavior == null && objectRef.element == 0 && lock3ABehavior6 == null) {
                        return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(new androidx.camera.camera2.pipe.Result3A(androidx.camera.camera2.pipe.Result3A.Status.INSTANCE.m698getOKJvTi9ms(), objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0));
                    }
                    androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, null, null, list, list2, list3, null, null, null, 911, null);
                    this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
                    if (this.getHighSpeedVideoFpsRangesFor.getRepeatingRequest() == null) {
                        return getOutputMinFrameDurationlomOqCM;
                    }
                    if (androidx.camera.camera2.pipe.graph.Controller3AKt.m913shouldUnlockAft6FjEyI((androidx.camera.camera2.pipe.Lock3ABehavior) objectRef.element)) {
                        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                        if (!this.getHighSpeedVideoFpsRangesFor.trigger(getOutputSizeshNQ4ISI)) {
                            return getOutputMinFrameDurationlomOqCM;
                        }
                    }
                    if (androidx.camera.camera2.pipe.graph.Controller3AKt.m915shouldWaitForAeToConverget6FjEyI(lock3ABehavior) || androidx.camera.camera2.pipe.graph.Controller3AKt.m916shouldWaitForAfToConverget6FjEyI((androidx.camera.camera2.pipe.Lock3ABehavior) objectRef.element) || androidx.camera.camera2.pipe.graph.Controller3AKt.m917shouldWaitForAwbToConverget6FjEyI(lock3ABehavior3)) {
                        if (function1 == null) {
                            boolean m915shouldWaitForAeToConverget6FjEyI = androidx.camera.camera2.pipe.graph.Controller3AKt.m915shouldWaitForAeToConverget6FjEyI(lock3ABehavior);
                            boolean m916shouldWaitForAfToConverget6FjEyI = androidx.camera.camera2.pipe.graph.Controller3AKt.m916shouldWaitForAfToConverget6FjEyI((androidx.camera.camera2.pipe.Lock3ABehavior) objectRef.element);
                            boolean m917shouldWaitForAwbToConverget6FjEyI = androidx.camera.camera2.pipe.graph.Controller3AKt.m917shouldWaitForAwbToConverget6FjEyI(lock3ABehavior3);
                            if (!m915shouldWaitForAeToConverget6FjEyI && !m916shouldWaitForAfToConverget6FjEyI && !m917shouldWaitForAwbToConverget6FjEyI) {
                                map = kotlin.collections.MapsKt.emptyMap();
                            } else {
                                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                if (m915shouldWaitForAeToConverget6FjEyI) {
                                    linkedHashMap.put(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE, Camera2StreamConfigurationMap);
                                }
                                if (m917shouldWaitForAwbToConverget6FjEyI) {
                                    linkedHashMap.put(android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE, getHighSpeedVideoSizesFor);
                                }
                                if (m916shouldWaitForAfToConverget6FjEyI) {
                                    linkedHashMap.put(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE, getOutputMinFrameDuration);
                                }
                                map = linkedHashMap;
                            }
                            function13 = androidx.camera.camera2.pipe.graph.Result3AStateListenerKt.toConditionChecker(map);
                        } else {
                            function13 = function1;
                        }
                        result3AStateListenerImpl = new androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl(function13, kotlin.coroutines.jvm.internal.Boxing.boxInt(i), l);
                        this.Camera2StreamConfigurationMap.addListener(result3AStateListenerImpl);
                        java.lang.Boolean boxBoolean = androidx.camera.camera2.pipe.graph.Controller3AKt.m912shouldUnlockAet6FjEyI(lock3ABehavior) ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false) : null;
                        java.lang.Boolean boxBoolean2 = androidx.camera.camera2.pipe.graph.Controller3AKt.m914shouldUnlockAwbt6FjEyI(lock3ABehavior3) ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false) : null;
                        if (boxBoolean != null || boxBoolean2 != null) {
                            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                            androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, null, null, null, null, null, boxBoolean, null, boxBoolean2, 383, null);
                        }
                        this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
                        if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                            androidx.camera.camera2.pipe.graph.Controller3AKt.m915shouldWaitForAeToConverget6FjEyI(lock3ABehavior);
                            androidx.camera.camera2.pipe.graph.Controller3AKt.m916shouldWaitForAfToConverget6FjEyI((androidx.camera.camera2.pipe.Lock3ABehavior) objectRef.element);
                            androidx.camera.camera2.pipe.graph.Controller3AKt.m917shouldWaitForAwbToConverget6FjEyI(lock3ABehavior3);
                        }
                        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> result2 = result3AStateListenerImpl.getResult();
                        controller3A$lock3A$1.getHighSpeedVideoSizes = lock3ABehavior;
                        controller3A$lock3A$1.getHighResolutionOutputSizeshNQ4ISI = lock3ABehavior6;
                        aeMode2 = aeMode;
                        controller3A$lock3A$1.getHighSpeedVideoFpsRanges = aeMode2;
                        function14 = function12;
                        controller3A$lock3A$1.Camera2StreamConfigurationMap = function14;
                        controller3A$lock3A$1.getHighSpeedVideoSizesFor = l2;
                        controller3A$lock3A$1.getOutputMinFrameDuration = objectRef;
                        controller3A$lock3A$1.getInputSizeshNQ4ISI = result3AStateListenerImpl;
                        i3 = i;
                        controller3A$lock3A$1.getHighSpeedVideoFpsRangesFor = i3;
                        controller3A$lock3A$1.getInputFormats = 1;
                        java.lang.Object await = result2.await(controller3A$lock3A$1);
                        if (await == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2 = objectRef;
                        obj = await;
                        l3 = l2;
                        lock3ABehavior4 = lock3ABehavior;
                    } else {
                        aeMode2 = aeMode;
                        function14 = function12;
                        i3 = i;
                        l3 = l2;
                        lock3ABehavior4 = lock3ABehavior;
                        lock3ABehavior5 = (androidx.camera.camera2.pipe.Lock3ABehavior) objectRef.element;
                        java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(i3);
                        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                        bool = lock3ABehavior4 != null ? null : bool3;
                        bool2 = lock3ABehavior6 != null ? null : bool3;
                        objArr = bool == null;
                        objArr2 = lock3ABehavior5 == null;
                        z = bool2 != null;
                        if (objArr != false && objArr2 == false && !z) {
                            map2 = kotlin.collections.MapsKt.emptyMap();
                        } else {
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                            if (objArr != false) {
                                linkedHashMap2.put(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE, getHighResolutionOutputSizeshNQ4ISI);
                            }
                            if (objArr2 != false) {
                                linkedHashMap2.put(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE, getInputSizeshNQ4ISI);
                            }
                            if (z) {
                                linkedHashMap2.put(android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE, getOutputSizes);
                            }
                            map2 = linkedHashMap2;
                        }
                        if (function14 == null || !map2.isEmpty()) {
                            if (function14 == null) {
                                function14 = androidx.camera.camera2.pipe.graph.Result3AStateListenerKt.toConditionChecker(map2);
                            }
                            androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl result3AStateListenerImpl2 = new androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl(function14, boxInt, l3);
                            this.Camera2StreamConfigurationMap.addListener(result3AStateListenerImpl2);
                            androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, null, null, null, null, null, bool, null, bool2, 383, null);
                            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                            this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
                            result = result3AStateListenerImpl2.getResult();
                        } else {
                            result = null;
                        }
                        if (lock3ABehavior5 != null) {
                            if (aeMode2 != null) {
                                int m157unboximpl = aeMode2.m157unboximpl();
                                aeMode3 = this.getHighResolutionOutputSizeshNQ4ISI.getCurrent().m935getAeModeO_cDUUs();
                                androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, androidx.camera.camera2.pipe.AeMode.m148boximpl(m157unboximpl), null, null, null, null, null, null, null, null, null, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, null);
                                this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
                            }
                            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                            if (!this.getHighSpeedVideoFpsRangesFor.trigger(unwrapAs)) {
                                return getOutputMinFrameDurationlomOqCM;
                            }
                            androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, null, null, null, null, null, null, bool3, null, 767, null);
                            if (aeMode3 != null) {
                                androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, androidx.camera.camera2.pipe.AeMode.m148boximpl(aeMode3.m157unboximpl()), null, null, null, null, null, null, null, null, null, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, null);
                                this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
                            }
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(result);
                        return result;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = controller3A$lock3A$1.getHighSpeedVideoFpsRangesFor;
                    androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl result3AStateListenerImpl3 = (androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl) controller3A$lock3A$1.getInputSizeshNQ4ISI;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) controller3A$lock3A$1.getOutputMinFrameDuration;
                    l3 = (java.lang.Long) controller3A$lock3A$1.getHighSpeedVideoSizesFor;
                    kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function15 = (kotlin.jvm.functions.Function1) controller3A$lock3A$1.Camera2StreamConfigurationMap;
                    androidx.camera.camera2.pipe.AeMode aeMode4 = (androidx.camera.camera2.pipe.AeMode) controller3A$lock3A$1.getHighSpeedVideoFpsRanges;
                    androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior7 = (androidx.camera.camera2.pipe.Lock3ABehavior) controller3A$lock3A$1.getHighResolutionOutputSizeshNQ4ISI;
                    lock3ABehavior4 = (androidx.camera.camera2.pipe.Lock3ABehavior) controller3A$lock3A$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = i4;
                    result3AStateListenerImpl = result3AStateListenerImpl3;
                    lock3ABehavior6 = lock3ABehavior7;
                    function14 = function15;
                    aeMode2 = aeMode4;
                }
                result3A = (androidx.camera.camera2.pipe.Result3A) obj;
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    androidx.camera.camera2.pipe.FrameMetadata frameMetadata = result3A.getFrameMetadata();
                    if (frameMetadata != null) {
                        kotlin.coroutines.jvm.internal.Boxing.boxLong(frameMetadata.mo496getFrameNumberUgla2oM());
                    }
                    androidx.camera.camera2.pipe.Result3A.Status.m695toStringimpl(result3A.m690getStatusJvTi9ms());
                }
                if (androidx.camera.camera2.pipe.Result3A.Status.m693equalsimpl0(result3A.m690getStatusJvTi9ms(), androidx.camera.camera2.pipe.Result3A.Status.INSTANCE.m698getOKJvTi9ms())) {
                    return result3AStateListenerImpl.getResult();
                }
                objectRef = objectRef2;
                lock3ABehavior5 = (androidx.camera.camera2.pipe.Lock3ABehavior) objectRef.element;
                java.lang.Integer boxInt2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(i3);
                java.lang.Boolean bool32 = java.lang.Boolean.TRUE;
                if (lock3ABehavior4 != null) {
                }
                if (lock3ABehavior6 != null) {
                }
                if (bool == null) {
                }
                if (lock3ABehavior5 == null) {
                }
                if (bool2 != null) {
                }
                if (objArr != false) {
                }
                java.util.LinkedHashMap linkedHashMap22 = new java.util.LinkedHashMap();
                if (objArr != false) {
                }
                if (objArr2 != false) {
                }
                if (z) {
                }
                map2 = linkedHashMap22;
                if (function14 == null) {
                }
                if (function14 == null) {
                }
                androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl result3AStateListenerImpl22 = new androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl(function14, boxInt2, l3);
                this.Camera2StreamConfigurationMap.addListener(result3AStateListenerImpl22);
                androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, null, null, null, null, null, bool, null, bool2, 383, null);
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
                result = result3AStateListenerImpl22.getResult();
                if (lock3ABehavior5 != null) {
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(result);
                return result;
            }
        }
        controller3A$lock3A$1 = new androidx.camera.camera2.pipe.graph.Controller3A$lock3A$1(this, continuation);
        java.lang.Object obj2 = controller3A$lock3A$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = controller3A$lock3A$1.getInputFormats;
        androidx.camera.camera2.pipe.AeMode aeMode32 = null;
        java.lang.Object[] objArr32 = 0;
        java.lang.Object[] objArr42 = 0;
        if (i2 != 0) {
        }
        result3A = (androidx.camera.camera2.pipe.Result3A) obj2;
        if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
        }
        if (androidx.camera.camera2.pipe.Result3A.Status.m693equalsimpl0(result3A.m690getStatusJvTi9ms(), androidx.camera.camera2.pipe.Result3A.Status.INSTANCE.m698getOKJvTi9ms())) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.Deferred unlock3A$default(androidx.camera.camera2.pipe.graph.Controller3A controller3A, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, kotlin.jvm.functions.Function1 function1, int i, java.lang.Long l, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        if ((i2 & 4) != 0) {
            bool3 = null;
        }
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        if ((i2 & 16) != 0) {
            i = 60;
        }
        if ((i2 & 32) != 0) {
            l = java.lang.Long.valueOf(androidx.camera.camera2.pipe.CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS);
        }
        return controller3A.unlock3A(bool, bool2, bool3, function1, i, l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> unlock3A(java.lang.Boolean ae, java.lang.Boolean af, java.lang.Boolean awb, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> unlockedCondition, int frameLimit, java.lang.Long timeLimitNs) {
        kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1;
        java.util.Map map;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Boolean bool = !androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getSupportsAutoFocusTrigger(this.getHighSpeedVideoSizes) ? null : af;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(ae, java.lang.Boolean.TRUE) && !kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE) && !kotlin.jvm.internal.Intrinsics.areEqual(awb, java.lang.Boolean.TRUE)) {
            return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(new androidx.camera.camera2.pipe.Result3A(androidx.camera.camera2.pipe.Result3A.Status.INSTANCE.m698getOKJvTi9ms(), objArr2 == true ? 1 : 0, objArr == true ? 1 : 0));
        }
        if (this.getHighSpeedVideoFpsRangesFor.getRepeatingRequest() == null) {
            return getOutputMinFrameDurationlomOqCM;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE)) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            if (this.getHighSpeedVideoFpsRangesFor.trigger(getOutputSizeshNQ4ISI)) {
                androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, null, null, null, null, null, null, java.lang.Boolean.FALSE, null, 767, null);
            } else {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                return getOutputMinFrameDurationlomOqCM;
            }
        }
        if (unlockedCondition == null) {
            boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(ae, java.lang.Boolean.TRUE);
            boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE);
            boolean areEqual3 = kotlin.jvm.internal.Intrinsics.areEqual(awb, java.lang.Boolean.TRUE);
            if (!areEqual && !areEqual2 && !areEqual3) {
                map = kotlin.collections.MapsKt.emptyMap();
            } else {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                if (areEqual) {
                    linkedHashMap.put(android.hardware.camera2.CaptureResult.CONTROL_AE_STATE, getInputFormats);
                }
                if (areEqual2) {
                    linkedHashMap.put(android.hardware.camera2.CaptureResult.CONTROL_AF_STATE, getOutputFormats);
                }
                if (areEqual3) {
                    linkedHashMap.put(android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE, getOutputStallDuration);
                }
                map = linkedHashMap;
            }
            function1 = androidx.camera.camera2.pipe.graph.Result3AStateListenerKt.toConditionChecker(map);
        } else {
            function1 = unlockedCondition;
        }
        androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl result3AStateListenerImpl = new androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl(function1, java.lang.Integer.valueOf(frameLimit), timeLimitNs);
        this.Camera2StreamConfigurationMap.addListener(result3AStateListenerImpl);
        java.lang.Boolean bool2 = kotlin.jvm.internal.Intrinsics.areEqual(ae, java.lang.Boolean.TRUE) ? java.lang.Boolean.FALSE : null;
        java.lang.Boolean bool3 = kotlin.jvm.internal.Intrinsics.areEqual(awb, java.lang.Boolean.TRUE) ? java.lang.Boolean.FALSE : null;
        if (bool2 != null || bool3 != null) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            androidx.camera.camera2.pipe.graph.GraphState3A.m918update7jOEVJU$default(this.getHighResolutionOutputSizeshNQ4ISI, null, null, null, null, null, null, null, bool2, null, bool3, 383, null);
        }
        this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
        return result3AStateListenerImpl.getResult();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.Deferred lock3AForCapture$default(androidx.camera.camera2.pipe.graph.Controller3A controller3A, kotlin.jvm.functions.Function1 function1, int i, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        if ((i2 & 2) != 0) {
            i = 60;
        }
        if ((i2 & 4) != 0) {
            j = androidx.camera.camera2.pipe.CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
        }
        return controller3A.lock3AForCapture(function1, i, j);
    }

    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> lock3AForCapture(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> lockedCondition, int frameLimit, long timeLimitNs) {
        return getHighResolutionOutputSizeshNQ4ISI(null, lockedCondition, frameLimit, timeLimitNs);
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred lock3AForCapture$default(androidx.camera.camera2.pipe.graph.Controller3A controller3A, boolean z, boolean z2, int i, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            i = 60;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = androidx.camera.camera2.pipe.CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
        }
        return controller3A.lock3AForCapture(z, z3, i3, j);
    }

    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> lock3AForCapture(boolean triggerAf, boolean waitForAwb, int frameLimit, long timeLimitNs) {
        java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> map;
        if (triggerAf) {
            map = getValidOutputFormatsForInputhNQ4ISI;
        } else {
            map = isOutputSupportedForhNQ4ISI;
        }
        return getHighResolutionOutputSizeshNQ4ISI(map, new androidx.camera.camera2.pipe.graph.Controller3A$$ExternalSyntheticLambda0(waitForAwb, triggerAf), frameLimit, timeLimitNs);
    }

    private final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> getHighResolutionOutputSizeshNQ4ISI(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> p0, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> p1, int p2, long p3) {
        if (this.getHighSpeedVideoFpsRangesFor.getRepeatingRequest() == null) {
            return getOutputMinFrameDurationlomOqCM;
        }
        if (p0 == null) {
            p0 = getValidOutputFormatsForInputhNQ4ISI;
        }
        java.util.Iterator<java.util.Map.Entry<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object>> it = p0.entrySet().iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(it.next().getValue(), (java.lang.Object) 1)) {
                z2 = true;
            }
        }
        if (p1 == null) {
            p1 = new androidx.camera.camera2.pipe.graph.Controller3A$$ExternalSyntheticLambda0(z, z2);
        }
        androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl result3AStateListenerImpl = new androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl(p1, java.lang.Integer.valueOf(p2), java.lang.Long.valueOf(p3));
        androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl result3AStateListenerImpl2 = result3AStateListenerImpl;
        this.Camera2StreamConfigurationMap.addListener(result3AStateListenerImpl2);
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        if (!this.getHighSpeedVideoFpsRangesFor.trigger(p0)) {
            this.Camera2StreamConfigurationMap.removeListener(result3AStateListenerImpl2);
            return getOutputMinFrameDurationlomOqCM;
        }
        this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
        return result3AStateListenerImpl.getResult();
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred unlock3APostCapture$default(androidx.camera.camera2.pipe.graph.Controller3A controller3A, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return controller3A.unlock3APostCapture(z);
    }

    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> unlock3APostCapture(boolean cancelAf) {
        androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl result3AStateListenerImpl;
        if (this.getHighSpeedVideoFpsRangesFor.getRepeatingRequest() == null) {
            return getOutputMinFrameDurationlomOqCM;
        }
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        if (!this.getHighSpeedVideoFpsRangesFor.trigger(cancelAf ? getHighSpeedVideoSizes : getHighSpeedVideoFpsRanges)) {
            return getOutputMinFrameDurationlomOqCM;
        }
        if (cancelAf) {
            result3AStateListenerImpl = new androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl(toString, (java.lang.Integer) null, (java.lang.Long) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            result3AStateListenerImpl = new androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl(kotlin.collections.MapsKt.emptyMap(), (java.lang.Integer) null, (java.lang.Long) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        this.Camera2StreamConfigurationMap.addListener(result3AStateListenerImpl);
        this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
        return result3AStateListenerImpl.getResult();
    }

    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> setTorchOn() {
        androidx.camera.camera2.pipe.AeMode m148boximpl;
        androidx.camera.camera2.pipe.AeMode m935getAeModeO_cDUUs = this.getHighResolutionOutputSizeshNQ4ISI.getCurrent().m935getAeModeO_cDUUs();
        int m161getONbOjpiJc = androidx.camera.camera2.pipe.AeMode.INSTANCE.m161getONbOjpiJc();
        if (m935getAeModeO_cDUUs == null || !androidx.camera.camera2.pipe.AeMode.m151equalsimpl0(m935getAeModeO_cDUUs.m157unboximpl(), m161getONbOjpiJc)) {
            int m160getOFFbOjpiJc = androidx.camera.camera2.pipe.AeMode.INSTANCE.m160getOFFbOjpiJc();
            if (m935getAeModeO_cDUUs == null || !androidx.camera.camera2.pipe.AeMode.m151equalsimpl0(m935getAeModeO_cDUUs.m157unboximpl(), m160getOFFbOjpiJc)) {
                m148boximpl = androidx.camera.camera2.pipe.AeMode.m148boximpl(androidx.camera.camera2.pipe.AeMode.INSTANCE.m161getONbOjpiJc());
                return m907update3A169HPGg$default(this, m148boximpl, null, null, androidx.camera.camera2.pipe.FlashMode.m445boximpl(androidx.camera.camera2.pipe.FlashMode.INSTANCE.m456getTORCHLe5xUZU()), null, null, null, 118, null);
            }
        }
        m148boximpl = null;
        return m907update3A169HPGg$default(this, m148boximpl, null, null, androidx.camera.camera2.pipe.FlashMode.m445boximpl(androidx.camera.camera2.pipe.FlashMode.INSTANCE.m456getTORCHLe5xUZU()), null, null, null, 118, null);
    }

    /* renamed from: setTorchOff-NqN7i0k$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.Deferred m905setTorchOffNqN7i0k$default(androidx.camera.camera2.pipe.graph.Controller3A controller3A, androidx.camera.camera2.pipe.AeMode aeMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            aeMode = null;
        }
        return controller3A.m909setTorchOffNqN7i0k(aeMode);
    }

    /* renamed from: setTorchOff-NqN7i0k, reason: not valid java name */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> m909setTorchOffNqN7i0k(androidx.camera.camera2.pipe.AeMode aeMode) {
        return m907update3A169HPGg$default(this, aeMode, null, null, androidx.camera.camera2.pipe.FlashMode.m445boximpl(androidx.camera.camera2.pipe.FlashMode.INSTANCE.m454getOFFLe5xUZU()), null, null, null, 118, null);
    }

    private static androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl getHighSpeedVideoFpsRangesFor(androidx.camera.camera2.pipe.AeMode p0, androidx.camera.camera2.pipe.AfMode p1, androidx.camera.camera2.pipe.AwbMode p2, androidx.camera.camera2.pipe.FlashMode p3) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (p0 != null) {
            int m157unboximpl = p0.m157unboximpl();
            android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AE_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        }
        if (p1 != null) {
            int m176unboximpl = p1.m176unboximpl();
            android.hardware.camera2.CaptureResult.Key key2 = android.hardware.camera2.CaptureResult.CONTROL_AF_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
        }
        if (p2 != null) {
            int m202unboximpl = p2.m202unboximpl();
            android.hardware.camera2.CaptureResult.Key key3 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, "");
        }
        if (p3 != null) {
            int m452unboximpl = p3.m452unboximpl();
            android.hardware.camera2.CaptureResult.Key key4 = android.hardware.camera2.CaptureResult.FLASH_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key4, "");
        }
        return new androidx.camera.camera2.pipe.graph.Result3AStateListenerImpl(kotlin.collections.MapsKt.toMap(linkedHashMap), (java.lang.Integer) null, (java.lang.Long) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final void reset3A(androidx.camera.camera2.pipe.graph.State3A initialState3A) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialState3A, "");
        androidx.camera.camera2.pipe.graph.State3A state3ASnapshot = state3ASnapshot();
        if (kotlin.jvm.internal.Intrinsics.areEqual(state3ASnapshot, initialState3A)) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setCurrent(initialState3A);
        this.getHighSpeedVideoFpsRangesFor.update3AParameters(this.getHighResolutionOutputSizeshNQ4ISI.toCaptureRequestParametersMap());
        if (androidx.camera.camera2.pipe.graph.GraphState3AKt.wasAfLocked(initialState3A, state3ASnapshot)) {
            unlock3A$default(this, null, java.lang.Boolean.TRUE, null, null, 0, null, 61, null);
        }
        if (androidx.camera.camera2.pipe.graph.GraphState3AKt.wasAfUnlocked(initialState3A, state3ASnapshot)) {
            this.getHighSpeedVideoFpsRangesFor.trigger(unwrapAs);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        if (androidx.camera.camera2.pipe.graph.Controller3AKt.access$isNullOrIn(r8.get(r1), androidx.camera.camera2.pipe.graph.Controller3A.getHighSpeedVideoFpsRangesFor) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ boolean $r8$lambda$ic7xTz5jmtx4Wl9pgzoHiHyPyIQ(boolean z, boolean z2, androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        boolean z3;
        boolean z4;
        boolean z5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetadata, "");
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AF_MODE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
        if (num != null) {
            int m168constructorimpl = androidx.camera.camera2.pipe.AfMode.m168constructorimpl(num.intValue());
            if (androidx.camera.camera2.pipe.AfMode.m174isOnimpl(m168constructorimpl)) {
                if (z2) {
                    android.hardware.camera2.CaptureResult.Key key2 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
                    z3 = androidx.camera.camera2.pipe.graph.Controller3AKt.access$isNullOrIn(frameMetadata.get(key2), getInputSizeshNQ4ISI);
                } else if (androidx.camera.camera2.pipe.AfMode.m173isContinuousimpl(m168constructorimpl)) {
                    java.util.List<java.lang.Integer> list = getOutputMinFrameDuration;
                    android.hardware.camera2.CaptureResult.Key key3 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, "");
                    z3 = kotlin.collections.CollectionsKt.contains(list, frameMetadata.get(key3));
                }
            }
            z3 = true;
        } else {
            z3 = false;
        }
        android.hardware.camera2.CaptureResult.Key key4 = android.hardware.camera2.CaptureResult.CONTROL_AE_MODE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key4, "");
        java.lang.Integer num2 = (java.lang.Integer) frameMetadata.get(key4);
        if (num2 != null) {
            if (androidx.camera.camera2.pipe.AeMode.m155isOnimpl(androidx.camera.camera2.pipe.AeMode.m149constructorimpl(num2.intValue()))) {
                android.hardware.camera2.CaptureResult.Key key5 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key5, "");
            }
            z4 = true;
            android.hardware.camera2.CaptureResult.Key key6 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key6, "");
            java.lang.Integer num3 = (java.lang.Integer) frameMetadata.get(key6);
            int m195constructorimpl = androidx.camera.camera2.pipe.AwbMode.m195constructorimpl(num3 == null ? num3.intValue() : 0);
            if (!z && num3 == null) {
                z5 = false;
            } else if (z || !androidx.camera.camera2.pipe.AwbMode.m200isOnimpl(m195constructorimpl)) {
                z5 = true;
            } else {
                android.hardware.camera2.CaptureResult.Key key7 = android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key7, "");
                z5 = androidx.camera.camera2.pipe.graph.Controller3AKt.access$isNullOrIn(frameMetadata.get(key7), getOutputStallDurationlomOqCM);
            }
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(frameMetadata.mo496getFrameNumberUgla2oM());
            }
            return !z4 && z3 && z5;
        }
        z4 = false;
        android.hardware.camera2.CaptureResult.Key key62 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key62, "");
        java.lang.Integer num32 = (java.lang.Integer) frameMetadata.get(key62);
        int m195constructorimpl2 = androidx.camera.camera2.pipe.AwbMode.m195constructorimpl(num32 == null ? num32.intValue() : 0);
        if (!z) {
        }
        if (z) {
        }
        z5 = true;
        if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
        }
        if (z4) {
        }
    }
}
