package androidx.camera.camera2.pipe.graph;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u008b\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010&J\u0010\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b+\u0010,JE\u00103\u001a\u00028\u0000\"\u0004\b\u0000\u0010-2-\u00102\u001a)\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/\u0012\u0006\u0012\u0004\u0018\u0001000.¢\u0006\u0002\b1H\u0096@¢\u0006\u0004\b3\u00104JR\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010-2\u0006\u00105\u001a\u00020\u001e2-\u00102\u001a)\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/\u0012\u0006\u0012\u0004\u0018\u0001000.¢\u0006\u0002\b1H\u0016¢\u0006\u0004\b7\u00108J!\u0010?\u001a\u00020$2\u0006\u0010:\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010D\u001a\u00020$2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJc\u0010S\u001a\b\u0012\u0004\u0012\u00020P062\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010J\u001a\u0004\u0018\u00010I2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010KH\u0016¢\u0006\u0004\bQ\u0010RJc\u0010U\u001a\b\u0012\u0004\u0012\u00020P062\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010J\u001a\u0004\u0018\u00010I2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010KH\u0016¢\u0006\u0004\bT\u0010RJ\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020P06H\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010Z\u001a\b\u0012\u0004\u0012\u00020P062\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bX\u0010YJÏ\u0001\u0010l\u001a\b\u0012\u0004\u0012\u00020P062\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010J\u001a\u0004\u0018\u00010I2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K2\b\u0010\\\u001a\u0004\u0018\u00010[2\b\u0010]\u001a\u0004\u0018\u00010[2\b\u0010^\u001a\u0004\u0018\u00010[2\b\u0010_\u001a\u0004\u0018\u00010E2\u0014\u0010c\u001a\u0010\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b\u0018\u00010`2\u0014\u0010d\u001a\u0010\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b\u0018\u00010`2\u0006\u0010f\u001a\u00020e2\u0006\u0010h\u001a\u00020g2\u0006\u0010i\u001a\u00020gH\u0016¢\u0006\u0004\bj\u0010kJY\u0010r\u001a\b\u0012\u0004\u0012\u00020P062\b\u0010m\u001a\u0004\u0018\u00010b2\b\u0010n\u001a\u0004\u0018\u00010b2\b\u0010o\u001a\u0004\u0018\u00010b2\u0014\u0010p\u001a\u0010\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020b\u0018\u00010`2\u0006\u0010f\u001a\u00020e2\u0006\u0010q\u001a\u00020gH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020$H\u0016¢\u0006\u0004\bt\u0010&J\u000f\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010{\u001a\u00020z2\u0006\u0010y\u001a\u00020xH\u0002¢\u0006\u0004\b{\u0010|R\u0014\u0010{\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u0081\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0089\u0001\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b{\u0010\u0088\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010}\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008d\u0001R\u0017\u0010\u008a\u0001\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u008e\u0001R\u001d\u0010\u0017\u001a\u00020\u00168\u0017X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0017\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001d\u0010\u0019\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\u000f\n\u0005\b\u0019\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u0010\u001b\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\u000f\n\u0005\b\u001b\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u007f\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0098\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0017\u0010\u0085\u0001\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u009b\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009c\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u001f\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010£\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001f\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R\u001f\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010¨\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010«\u0001R2\u0010±\u0001\u001a\u00020b2\u0007\u0010°\u0001\u001a\u00020b8\u0017@WX\u0097\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b±\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/graph/CameraGraphImpl;", "Landroidx/camera/camera2/pipe/CameraGraph;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraMetadata;", "metadata", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "graphProcessor", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "surfaceGraph", "Landroidx/camera/camera2/pipe/CameraController;", "cameraController", "Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "frameDistributor", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "frameCaptureQueue", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "audioRestrictionController", "Landroidx/camera/camera2/pipe/CameraGraphId;", "id", "Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "parameters", "Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "listeners", "Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "sessionLock", "Lkotlinx/coroutines/CoroutineScope;", "graphScope", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "controller3A", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/graph/GraphProcessor;Landroidx/camera/camera2/pipe/graph/GraphListener;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/graph/SurfaceGraph;Landroidx/camera/camera2/pipe/CameraController;Landroidx/camera/camera2/pipe/internal/FrameDistributor;Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;Landroidx/camera/camera2/pipe/CameraGraphId;Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;Landroidx/camera/camera2/pipe/internal/GraphSessionLock;Lkotlinx/coroutines/CoroutineScope;Landroidx/camera/camera2/pipe/graph/Controller3A;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "acquireSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSessionOrNull", "()Landroidx/camera/camera2/pipe/CameraGraph$Session;", "T", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "action", "useSession", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/Deferred;", "useSessionIn", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/StreamId;", "stream", "Landroid/view/Surface;", "surface", "setSurface-NYG5g8E", "(ILandroid/view/Surface;)V", "setSurface", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "mode", "updateAudioRestrictionMode-LwUUkyU", "(I)V", "updateAudioRestrictionMode", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Landroidx/camera/camera2/pipe/Result3A;", "update3A-ydBZfZg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlinx/coroutines/Deferred;", "update3A", "submit3A-ydBZfZg", "submit3A", "setTorchOn", "()Lkotlinx/coroutines/Deferred;", "setTorchOff-NqN7i0k", "(Landroidx/camera/camera2/pipe/AeMode;)Lkotlinx/coroutines/Deferred;", "setTorchOff", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "convergedCondition", "lockedCondition", "", "frameLimit", "", "convergedTimeLimitNs", "lockedTimeLimitNs", "lock3A-vIrNa9k", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IJJ)Lkotlinx/coroutines/Deferred;", "lock3A", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "unlock3A", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;IJ)Lkotlinx/coroutines/Deferred;", "close", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/core/Token;", "p0", "Landroidx/camera/camera2/pipe/graph/CameraGraphSessionImpl;", "getHighSpeedVideoFpsRanges", "(Landroidx/camera/camera2/pipe/core/Token;)Landroidx/camera/camera2/pipe/graph/CameraGraphSessionImpl;", "getOutputMinFrameDuration", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "getInputFormats", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "Camera2StreamConfigurationMap", "getOutputStallDurationlomOqCM", "Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/CameraController;", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "getOutputFormats", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "Landroidx/camera/camera2/pipe/CameraGraphId;", "getId", "()Landroidx/camera/camera2/pipe/CameraGraphId;", "Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "getParameters", "()Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "getListeners", "()Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "Lkotlinx/atomicfu/AtomicBoolean;", "Lkotlinx/atomicfu/AtomicBoolean;", "getOutputMinFrameDurationlomOqCM", "Landroidx/camera/camera2/pipe/StreamGraph;", "getStreams", "()Landroidx/camera/camera2/pipe/StreamGraph;", "streams", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/camera/camera2/pipe/GraphState;", "getGraphState", "()Lkotlinx/coroutines/flow/StateFlow;", "graphState", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/camera/camera2/pipe/FrameNumber;", "getLatestFrameNumber", "()Lkotlinx/coroutines/flow/Flow;", "latestFrameNumber", "Landroidx/camera/camera2/pipe/FrameInfo;", "getLatestFrameInfo", "latestFrameInfo", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isForeground", "Z", "()Z", "setForeground", "(Z)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraGraphImpl implements androidx.camera.camera2.pipe.CameraGraph {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.compat.AudioRestrictionController getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraController getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.Controller3A getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.FrameCaptureQueue getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.FrameDistributor getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.GraphListener getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.CoroutineScope getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.GraphSessionLock getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.GraphProcessor getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.StreamGraphImpl Camera2StreamConfigurationMap;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.SurfaceGraph getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.camera2.pipe.CameraGraphId id;
    private boolean isForeground;
    private final androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl listeners;
    private final androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl parameters;

    @javax.inject.Inject
    public CameraGraphImpl(androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor, androidx.camera.camera2.pipe.graph.GraphListener graphListener, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.graph.SurfaceGraph surfaceGraph, androidx.camera.camera2.pipe.CameraController cameraController, androidx.camera.camera2.pipe.internal.FrameDistributor frameDistributor, androidx.camera.camera2.pipe.internal.FrameCaptureQueue frameCaptureQueue, androidx.camera.camera2.pipe.compat.AudioRestrictionController audioRestrictionController, androidx.camera.camera2.pipe.CameraGraphId cameraGraphId, androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl cameraGraphParametersImpl, androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl, androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, @androidx.camera.camera2.pipe.config.ForCameraGraph kotlinx.coroutines.CoroutineScope coroutineScope, androidx.camera.camera2.pipe.graph.Controller3A controller3A) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameDistributor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameCaptureQueue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioRestrictionController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphParametersImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraphRequestListenersImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphSessionLock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controller3A, "");
        this.getHighSpeedVideoFpsRanges = graphProcessor;
        this.getHighResolutionOutputSizeshNQ4ISI = graphListener;
        this.Camera2StreamConfigurationMap = streamGraphImpl;
        this.getHighSpeedVideoFpsRangesFor = surfaceGraph;
        this.getHighSpeedVideoSizes = cameraController;
        this.getOutputFormats = frameDistributor;
        this.getOutputMinFrameDuration = frameCaptureQueue;
        this.getHighSpeedVideoSizesFor = audioRestrictionController;
        this.id = cameraGraphId;
        this.parameters = cameraGraphParametersImpl;
        this.listeners = cameraGraphRequestListenersImpl;
        this.getInputFormats = graphSessionLock;
        this.getInputSizeshNQ4ISI = coroutineScope;
        this.getOutputStallDurationlomOqCM = controller3A;
        this.getOutputMinFrameDurationlomOqCM = kotlinx.atomicfu.AtomicFU.atomic(false);
        if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE()) {
            androidx.camera.camera2.pipe.core.Debug.INSTANCE.formatCameraGraphProperties(cameraMetadata, config, this);
        }
        if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(config.m357getSessionMode2uNL3no(), androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m382getHIGH_SPEED2uNL3no())) {
            if (streamGraphImpl.getOutputs().isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph without outputs.".toString());
            }
            if (streamGraphImpl.getOutputs().size() > 2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                sb.append(streamGraphImpl.getOutputs());
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs = streamGraphImpl.getOutputs();
            if (!(outputs instanceof java.util.Collection) || !outputs.isEmpty()) {
                java.util.Iterator<T> it = outputs.iterator();
                while (it.hasNext()) {
                    if (!((androidx.camera.camera2.pipe.OutputStream) it.next()).isValidForHighSpeedOperatingMode()) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                        sb2.append(this.Camera2StreamConfigurationMap.getOutputs());
                        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                    }
                }
            }
        }
        if (config.getInput() != null) {
            if (config.getInput().isEmpty()) {
                throw new java.lang.IllegalArgumentException("At least one InputConfiguration is required for reprocessing".toString());
            }
            if (android.os.Build.VERSION.SDK_INT < 31 && config.getInput().size() > 1) {
                throw new java.lang.IllegalArgumentException("Multi resolution reprocessing not supported under Android S".toString());
            }
        }
        if (!this.Camera2StreamConfigurationMap.getImageSourceMap$camera_camera2_pipe().isEmpty()) {
            this.getHighSpeedVideoFpsRangesFor.maybeUpdateSurfaces$camera_camera2_pipe();
        }
        this.isForeground = true;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.CameraGraphId getId() {
        return this.id;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl getParameters() {
        return this.parameters;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl getListeners() {
        return this.listeners;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.StreamGraph getStreams() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final kotlinx.coroutines.flow.StateFlow<androidx.camera.camera2.pipe.GraphState> getGraphState() {
        return this.getHighSpeedVideoFpsRanges.getGraphState();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.FrameNumber> getLatestFrameNumber() {
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameNumber$1(this, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.FrameInfo> getLatestFrameInfo() {
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.camera.camera2.pipe.graph.CameraGraphImpl$latestFrameInfo$1(this, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: isForeground, reason: from getter */
    public final boolean getIsForeground() {
        return this.isForeground;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final void setForeground(boolean z) {
        this.isForeground = z;
        this.getHighSpeedVideoSizes.setForeground(z);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final void start() {
        if (this.getOutputMinFrameDurationlomOqCM.getValue()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot start ");
            sb.append(this);
            sb.append(" after calling close()");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this);
        sb2.append("#start");
        android.os.Trace.beginSection(sb2.toString());
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE();
        this.getHighResolutionOutputSizeshNQ4ISI.onGraphStarting();
        this.getHighSpeedVideoSizes.start();
        androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final void stop() {
        if (this.getOutputMinFrameDurationlomOqCM.getValue()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot stop ");
            sb.append(this);
            sb.append(" after calling close()");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(this);
        sb2.append("#stop");
        android.os.Trace.beginSection(sb2.toString());
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE();
        this.getHighResolutionOutputSizeshNQ4ISI.onGraphStopping();
        this.getHighSpeedVideoSizes.stop();
        androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object acquireSession(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraGraph.Session> continuation) {
        androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1 cameraGraphImpl$acquireSession$1;
        int i;
        if (continuation instanceof androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1) {
            cameraGraphImpl$acquireSession$1 = (androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1) continuation;
            if ((cameraGraphImpl$acquireSession$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cameraGraphImpl$acquireSession$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = cameraGraphImpl$acquireSession$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cameraGraphImpl$acquireSession$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock = this.getInputFormats;
                    cameraGraphImpl$acquireSession$1.getHighSpeedVideoSizes = 1;
                    obj = graphSessionLock.acquireToken$camera_camera2_pipe(cameraGraphImpl$acquireSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return getHighSpeedVideoFpsRanges((androidx.camera.camera2.pipe.core.Token) obj);
            }
        }
        cameraGraphImpl$acquireSession$1 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1(this, continuation);
        java.lang.Object obj2 = cameraGraphImpl$acquireSession$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cameraGraphImpl$acquireSession$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return getHighSpeedVideoFpsRanges((androidx.camera.camera2.pipe.core.Token) obj2);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final androidx.camera.camera2.pipe.CameraGraph.Session acquireSessionOrNull() {
        androidx.camera.camera2.pipe.core.Token tryAcquireToken$camera_camera2_pipe = this.getInputFormats.tryAcquireToken$camera_camera2_pipe();
        if (tryAcquireToken$camera_camera2_pipe == null) {
            return null;
        }
        return getHighSpeedVideoFpsRanges(tryAcquireToken$camera_camera2_pipe);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object useSession(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.camera.camera2.pipe.CameraGraph.Session, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super T> continuation) {
        androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$1 cameraGraphImpl$useSession$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.AutoCloseable autoCloseable;
        java.lang.Throwable th;
        java.lang.AutoCloseable autoCloseable2;
        java.lang.Object coroutineScope;
        try {
            if (continuation instanceof androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$1) {
                cameraGraphImpl$useSession$1 = (androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$1) continuation;
                if ((cameraGraphImpl$useSession$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    cameraGraphImpl$useSession$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = cameraGraphImpl$useSession$1.getHighResolutionOutputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cameraGraphImpl$useSession$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        cameraGraphImpl$useSession$1.getHighSpeedVideoSizes = function3;
                        cameraGraphImpl$useSession$1.getHighSpeedVideoFpsRanges = 1;
                        obj = acquireSession(cameraGraphImpl$useSession$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            autoCloseable2 = (java.lang.AutoCloseable) cameraGraphImpl$useSession$1.getHighSpeedVideoSizes;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                                return obj;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th3) {
                                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, th);
                                    throw th3;
                                }
                            }
                        }
                        function3 = (kotlin.jvm.functions.Function3) cameraGraphImpl$useSession$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    autoCloseable = (java.lang.AutoCloseable) obj;
                    androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$2$1 cameraGraphImpl$useSession$2$1 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$2$1(function3, (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable, null);
                    cameraGraphImpl$useSession$1.getHighSpeedVideoSizes = autoCloseable;
                    cameraGraphImpl$useSession$1.getHighSpeedVideoFpsRanges = 2;
                    coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(cameraGraphImpl$useSession$2$1, cameraGraphImpl$useSession$1);
                    if (coroutineScope != coroutine_suspended) {
                        obj = coroutineScope;
                        autoCloseable2 = autoCloseable;
                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, null);
                        return obj;
                    }
                    return coroutine_suspended;
                }
            }
            androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$2$1 cameraGraphImpl$useSession$2$12 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$2$1(function3, (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable, null);
            cameraGraphImpl$useSession$1.getHighSpeedVideoSizes = autoCloseable;
            cameraGraphImpl$useSession$1.getHighSpeedVideoFpsRanges = 2;
            coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(cameraGraphImpl$useSession$2$12, cameraGraphImpl$useSession$1);
            if (coroutineScope != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th4) {
            th = th4;
            autoCloseable2 = autoCloseable;
            throw th;
        }
        cameraGraphImpl$useSession$1 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$1(this, continuation);
        java.lang.Object obj2 = cameraGraphImpl$useSession$1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cameraGraphImpl$useSession$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        autoCloseable = (java.lang.AutoCloseable) obj2;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final <T> kotlinx.coroutines.Deferred<T> useSessionIn(kotlinx.coroutines.CoroutineScope scope, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.camera.camera2.pipe.CameraGraph.Session, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return this.getInputFormats.withTokenIn$camera_camera2_pipe(scope, new androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1(this, action, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: setSurface-NYG5g8E */
    public final void mo390setSurfaceNYG5g8E(int stream, android.view.Surface surface) {
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.StreamId.m760toStringimpl(stream));
        sb.append("#setSurface");
        android.os.Trace.beginSection(sb.toString());
        if (surface != null && !surface.isValid()) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
        }
        this.getHighSpeedVideoFpsRangesFor.m952setNYG5g8E(stream, surface);
        androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: updateAudioRestrictionMode-LwUUkyU */
    public final void mo391updateAudioRestrictionModeLwUUkyU(int mode) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.getHighSpeedVideoSizesFor.mo775updateCameraGraphAudioRestrictionModeTyYSX5E(this, mode);
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: update3A-ydBZfZg */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo279update3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        return this.getInputFormats.withTokenInAsync$camera_camera2_pipe(this.getInputSizeshNQ4ISI, new androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1(new androidx.camera.camera2.pipe.graph.CameraGraphImpl$update3A$1(this, aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions, null), null));
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: submit3A-ydBZfZg */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo278submit3AydBZfZg(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        return this.getInputFormats.withTokenInAsync$camera_camera2_pipe(this.getInputSizeshNQ4ISI, new androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1(new androidx.camera.camera2.pipe.graph.CameraGraphImpl$submit3A$1(this, aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions, null), null));
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> setTorchOn() {
        return this.getInputFormats.withTokenInAsync$camera_camera2_pipe(this.getInputSizeshNQ4ISI, new androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1(new androidx.camera.camera2.pipe.graph.CameraGraphImpl$setTorchOn$1(this, null), null));
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: setTorchOff-NqN7i0k */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo277setTorchOffNqN7i0k(androidx.camera.camera2.pipe.AeMode aeMode) {
        return this.getInputFormats.withTokenInAsync$camera_camera2_pipe(this.getInputSizeshNQ4ISI, new androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1(new androidx.camera.camera2.pipe.graph.CameraGraphImpl$setTorchOff$1(this, aeMode, null), null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: lock3A-vIrNa9k */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo389lock3AvIrNa9k(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions, androidx.camera.camera2.pipe.Lock3ABehavior aeLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior afLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior awbLockBehavior, androidx.camera.camera2.pipe.AeMode afTriggerStartAeMode, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> convergedCondition, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> lockedCondition, int frameLimit, long convergedTimeLimitNs, long lockedTimeLimitNs) {
        return this.getInputFormats.withTokenInAsync$camera_camera2_pipe(this.getInputSizeshNQ4ISI, new androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1(new androidx.camera.camera2.pipe.graph.CameraGraphImpl$lock3A$1(this, aeRegions, afRegions, awbRegions, aeLockBehavior, afLockBehavior, awbLockBehavior, afTriggerStartAeMode, convergedCondition, lockedCondition, frameLimit, convergedTimeLimitNs, lockedTimeLimitNs, null), null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> unlock3A(java.lang.Boolean ae, java.lang.Boolean af, java.lang.Boolean awb, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> unlockedCondition, int frameLimit, long timeLimitNs) {
        return this.getInputFormats.withTokenInAsync$camera_camera2_pipe(this.getInputSizeshNQ4ISI, new androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1(new androidx.camera.camera2.pipe.graph.CameraGraphImpl$unlock3A$1(this, ae, af, awb, unlockedCondition, frameLimit, timeLimitNs, null), null));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.getOutputMinFrameDurationlomOqCM.compareAndSet(false, true)) {
            androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this);
            sb.append("#close");
            android.os.Trace.beginSection(sb.toString());
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE();
            this.getHighSpeedVideoFpsRanges.close();
            this.getHighSpeedVideoSizes.close();
            this.getOutputFormats.close();
            this.getOutputMinFrameDuration.close();
            this.getHighSpeedVideoFpsRangesFor.close();
            this.Camera2StreamConfigurationMap.close();
            this.getHighSpeedVideoSizesFor.removeCameraGraph(this);
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.getInputSizeshNQ4ISI, null, 1, null);
            androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            android.os.Trace.endSection();
        }
    }

    public final java.lang.String toString() {
        return getId().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl getHighSpeedVideoFpsRanges(androidx.camera.camera2.pipe.core.Token p0) {
        return new androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl(p0, this.getHighSpeedVideoFpsRanges, this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDuration, getParameters(), getListeners());
    }
}
